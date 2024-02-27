package y0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import cm.l;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import y0.j;
import y0.k;
import y0.o;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final String f18370a;

    /* renamed from: b  reason: collision with root package name */
    private final o f18371b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f18372c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f18373d;

    /* renamed from: e  reason: collision with root package name */
    private int f18374e;

    /* renamed from: f  reason: collision with root package name */
    public o.c f18375f;

    /* renamed from: g  reason: collision with root package name */
    private k f18376g;

    /* renamed from: h  reason: collision with root package name */
    private final j f18377h = new b(this);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f18378i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    private final ServiceConnection f18379j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f18380k;

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f18381l;

    public static final class a extends o.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f18382b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar, String[] strArr) {
            super(strArr);
            this.f18382b = rVar;
        }

        public boolean b() {
            return true;
        }

        public void c(Set set) {
            l.f(set, "tables");
            if (!this.f18382b.j().get()) {
                try {
                    k h10 = this.f18382b.h();
                    if (h10 != null) {
                        int c10 = this.f18382b.c();
                        Object[] array = set.toArray(new String[0]);
                        l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        h10.U(c10, (String[]) array);
                    }
                } catch (RemoteException e10) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e10);
                }
            }
        }
    }

    public static final class b extends j.a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f18383b;

        b(r rVar) {
            this.f18383b = rVar;
        }

        /* access modifiers changed from: private */
        public static final void j(r rVar, String[] strArr) {
            l.f(rVar, "this$0");
            l.f(strArr, "$tables");
            rVar.e().j((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public void A(String[] strArr) {
            l.f(strArr, "tables");
            this.f18383b.d().execute(new s(this.f18383b, strArr));
        }
    }

    public static final class c implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f18384a;

        c(r rVar) {
            this.f18384a = rVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            l.f(componentName, "name");
            l.f(iBinder, "service");
            this.f18384a.m(k.a.c(iBinder));
            this.f18384a.d().execute(this.f18384a.i());
        }

        public void onServiceDisconnected(ComponentName componentName) {
            l.f(componentName, "name");
            this.f18384a.d().execute(this.f18384a.g());
            this.f18384a.m((k) null);
        }
    }

    public r(Context context, String str, Intent intent, o oVar, Executor executor) {
        l.f(context, "context");
        l.f(str, "name");
        l.f(intent, "serviceIntent");
        l.f(oVar, "invalidationTracker");
        l.f(executor, "executor");
        this.f18370a = str;
        this.f18371b = oVar;
        this.f18372c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f18373d = applicationContext;
        c cVar = new c(this);
        this.f18379j = cVar;
        this.f18380k = new p(this);
        this.f18381l = new q(this);
        Object[] array = oVar.h().keySet().toArray(new String[0]);
        l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        l(new a(this, (String[]) array));
        applicationContext.bindService(intent, cVar, 1);
    }

    /* access modifiers changed from: private */
    public static final void k(r rVar) {
        l.f(rVar, "this$0");
        rVar.f18371b.m(rVar.f());
    }

    /* access modifiers changed from: private */
    public static final void n(r rVar) {
        l.f(rVar, "this$0");
        try {
            k kVar = rVar.f18376g;
            if (kVar != null) {
                rVar.f18374e = kVar.C(rVar.f18377h, rVar.f18370a);
                rVar.f18371b.b(rVar.f());
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final int c() {
        return this.f18374e;
    }

    public final Executor d() {
        return this.f18372c;
    }

    public final o e() {
        return this.f18371b;
    }

    public final o.c f() {
        o.c cVar = this.f18375f;
        if (cVar != null) {
            return cVar;
        }
        l.v("observer");
        return null;
    }

    public final Runnable g() {
        return this.f18381l;
    }

    public final k h() {
        return this.f18376g;
    }

    public final Runnable i() {
        return this.f18380k;
    }

    public final AtomicBoolean j() {
        return this.f18378i;
    }

    public final void l(o.c cVar) {
        l.f(cVar, "<set-?>");
        this.f18375f = cVar;
    }

    public final void m(k kVar) {
        this.f18376g = kVar;
    }
}
