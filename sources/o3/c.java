package o3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import c4.a;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.g;
import p4.i;
import p4.j;
import p4.l;

public class c {

    /* renamed from: h  reason: collision with root package name */
    private static int f14370h;

    /* renamed from: i  reason: collision with root package name */
    private static PendingIntent f14371i;

    /* renamed from: j  reason: collision with root package name */
    private static final Executor f14372j = e0.f14384e;

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f14373k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a  reason: collision with root package name */
    private final g f14374a = new g();

    /* renamed from: b  reason: collision with root package name */
    private final Context f14375b;

    /* renamed from: c  reason: collision with root package name */
    private final b0 f14376c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f14377d;

    /* renamed from: e  reason: collision with root package name */
    private final Messenger f14378e;

    /* renamed from: f  reason: collision with root package name */
    private Messenger f14379f;

    /* renamed from: g  reason: collision with root package name */
    private k f14380g;

    public c(Context context) {
        this.f14375b = context;
        this.f14376c = new b0(context);
        this.f14378e = new Messenger(new g(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f14377d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ i c(Bundle bundle) {
        return k(bundle) ? l.e((Object) null) : l.e(bundle);
    }

    static /* bridge */ /* synthetic */ void e(c cVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new j());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof k) {
                        cVar.f14380g = (k) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f14379f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (c0.a(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !c0.a(split[1], "ID")) {
                                Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            cVar.j(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        synchronized (cVar.f14374a) {
                            int i10 = 0;
                            while (i10 < cVar.f14374a.size()) {
                                try {
                                    cVar.j((String) cVar.f14374a.i(i10), intent2.getExtras());
                                    i10++;
                                } finally {
                                }
                            }
                        }
                        return;
                    }
                    Matcher matcher = f14373k.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            cVar.j(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final i g(Bundle bundle) {
        String h10 = h();
        j jVar = new j();
        synchronized (this.f14374a) {
            this.f14374a.put(h10, jVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f14376c.b() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        i(this.f14375b, intent);
        intent.putExtra("kid", "|ID|" + h10 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f14378e);
        if (!(this.f14379f == null && this.f14380g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f14379f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f14380g.d(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            jVar.a().b(f14372j, new f(this, h10, this.f14377d.schedule(new e(jVar), 30, TimeUnit.SECONDS)));
            return jVar.a();
        }
        if (this.f14376c.b() == 2) {
            this.f14375b.sendBroadcast(intent);
        } else {
            this.f14375b.startService(intent);
        }
        jVar.a().b(f14372j, new f(this, h10, this.f14377d.schedule(new e(jVar), 30, TimeUnit.SECONDS)));
        return jVar.a();
    }

    private static synchronized String h() {
        String num;
        synchronized (c.class) {
            int i10 = f14370h;
            f14370h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    private static synchronized void i(Context context, Intent intent) {
        synchronized (c.class) {
            try {
                if (f14371i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f14371i = PendingIntent.getBroadcast(context, 0, intent2, a.f4742a);
                }
                intent.putExtra("app", f14371i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void j(String str, Bundle bundle) {
        synchronized (this.f14374a) {
            try {
                j jVar = (j) this.f14374a.remove(str);
                if (jVar == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                jVar.c(bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean k(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public i a(a aVar) {
        if (this.f14376c.a() < 233700000) {
            return l.d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", aVar.d());
        Integer e10 = aVar.e();
        if (e10 != null) {
            bundle.putInt("google.product_id", e10.intValue());
        }
        return a0.b(this.f14375b).c(3, bundle);
    }

    public i b(Bundle bundle) {
        if (this.f14376c.a() < 12000000) {
            return this.f14376c.b() != 0 ? g(bundle).g(f14372j, new f0(this, bundle)) : l.d(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return a0.b(this.f14375b).d(1, bundle).f(f14372j, d.f14381a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ i d(Bundle bundle, i iVar) {
        return (iVar.m() && k((Bundle) iVar.i())) ? g(bundle).n(f14372j, d0.f14382a) : iVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(String str, ScheduledFuture scheduledFuture, i iVar) {
        synchronized (this.f14374a) {
            this.f14374a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
