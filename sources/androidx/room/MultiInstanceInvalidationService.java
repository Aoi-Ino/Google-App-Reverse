package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import cm.l;
import java.util.LinkedHashMap;
import java.util.Map;
import pl.x;
import y0.j;
import y0.k;

public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: e  reason: collision with root package name */
    private int f3922e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f3923f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    private final RemoteCallbackList f3924g = new b(this);

    /* renamed from: h  reason: collision with root package name */
    private final k.a f3925h = new a(this);

    public static final class a extends k.a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MultiInstanceInvalidationService f3926b;

        a(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f3926b = multiInstanceInvalidationService;
        }

        public int C(j jVar, String str) {
            l.f(jVar, "callback");
            int i10 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList a10 = this.f3926b.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f3926b;
            synchronized (a10) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                    int c10 = multiInstanceInvalidationService.c();
                    if (multiInstanceInvalidationService.a().register(jVar, Integer.valueOf(c10))) {
                        multiInstanceInvalidationService.b().put(Integer.valueOf(c10), str);
                        i10 = c10;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                        multiInstanceInvalidationService.c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }

        public void U(int i10, String[] strArr) {
            l.f(strArr, "tables");
            RemoteCallbackList a10 = this.f3926b.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f3926b;
            synchronized (a10) {
                String str = (String) multiInstanceInvalidationService.b().get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                int i11 = 0;
                while (i11 < beginBroadcast) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i11);
                        l.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) broadcastCookie).intValue();
                        String str2 = (String) multiInstanceInvalidationService.b().get(Integer.valueOf(intValue));
                        if (i10 != intValue && l.a(str, str2)) {
                            try {
                                ((j) multiInstanceInvalidationService.a().getBroadcastItem(i11)).A(strArr);
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                        i11++;
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService.a().finishBroadcast();
                        throw th2;
                    }
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                x xVar = x.f30437a;
            }
        }

        public void r(j jVar, int i10) {
            l.f(jVar, "callback");
            RemoteCallbackList a10 = this.f3926b.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f3926b;
            synchronized (a10) {
                multiInstanceInvalidationService.a().unregister(jVar);
                String str = (String) multiInstanceInvalidationService.b().remove(Integer.valueOf(i10));
            }
        }
    }

    public static final class b extends RemoteCallbackList {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiInstanceInvalidationService f3927a;

        b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f3927a = multiInstanceInvalidationService;
        }

        /* renamed from: a */
        public void onCallbackDied(j jVar, Object obj) {
            l.f(jVar, "callback");
            l.f(obj, "cookie");
            this.f3927a.b().remove((Integer) obj);
        }
    }

    public final RemoteCallbackList a() {
        return this.f3924g;
    }

    public final Map b() {
        return this.f3923f;
    }

    public final int c() {
        return this.f3922e;
    }

    public final void d(int i10) {
        this.f3922e = i10;
    }

    public IBinder onBind(Intent intent) {
        l.f(intent, "intent");
        return this.f3925h;
    }
}
