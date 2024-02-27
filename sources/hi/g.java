package hi;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.c0;
import androidx.lifecycle.k;
import androidx.lifecycle.r;
import cm.l;
import cm.m;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.install.InstallState;
import java.lang.ref.WeakReference;
import pl.x;

public final class g implements r {

    /* renamed from: l  reason: collision with root package name */
    public static final a f24105l = new a((cm.g) null);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static g f24106m;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference f24107e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f24108f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final n5.b f24109g;

    /* renamed from: h  reason: collision with root package name */
    private final w5.e f24110h;

    /* renamed from: i  reason: collision with root package name */
    private b f24111i;

    /* renamed from: j  reason: collision with root package name */
    private final int f24112j;

    /* renamed from: k  reason: collision with root package name */
    private final r5.b f24113k;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }

        public final g a(androidx.appcompat.app.d dVar) {
            l.f(dVar, "activity");
            if (g.f24106m == null) {
                g.f24106m = new g(dVar, (cm.g) null);
            }
            Log.d("InAppUpdateManager", "Instance created");
            return g.f24106m;
        }
    }

    public interface b {
        void a(long j10, long j11);
    }

    public interface c {
        void a(int i10);

        void b(int i10);
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f24114e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f24115f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, g gVar) {
            super(1);
            this.f24114e = cVar;
            this.f24115f = gVar;
        }

        public final void b(n5.a aVar) {
            ld.g gVar;
            Integer num;
            if (aVar.f() == 2) {
                Log.d("InAppUpdateManager", "Update available");
                int a10 = aVar.a();
                if (aVar.b() != null) {
                    num = aVar.b();
                    l.c(num);
                } else {
                    num = -1;
                }
                l.c(num);
                int intValue = num.intValue();
                this.f24114e.a(a10);
                this.f24114e.b(intValue);
                gVar = new ld.g(this.f24115f.E());
            } else {
                Log.d("InAppUpdateManager", "No Update available" + aVar.a());
                gVar = new ld.g(this.f24115f.E());
            }
            gVar.v(String.valueOf(aVar.a()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((n5.a) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f24116e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar) {
            super(1);
            this.f24116e = gVar;
        }

        public final void b(n5.a aVar) {
            if (aVar.f() != 2 || !aVar.d(this.f24116e.f24108f)) {
                Log.d("InAppUpdateManager", "No Update available");
                return;
            }
            Log.d("InAppUpdateManager", "Update available");
            g gVar = this.f24116e;
            l.c(aVar);
            gVar.M(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((n5.a) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final f f24117e = new f();

        f() {
            super(1);
        }

        public final void b(n5.a aVar) {
            if (aVar.c() == 11) {
                Log.d("InAppUpdateManager", "An update has been downloaded");
                g p10 = g.f24106m;
                l.c(p10);
                p10.I();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((n5.a) obj);
            return x.f30437a;
        }
    }

    /* renamed from: hi.g$g  reason: collision with other inner class name */
    static final class C0300g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f24118e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0300g(g gVar) {
            super(1);
            this.f24118e = gVar;
        }

        public final void b(n5.a aVar) {
            if (aVar.f() == 3) {
                try {
                    g p10 = g.f24106m;
                    l.c(p10);
                    n5.b o10 = p10.f24109g;
                    l.c(o10);
                    g p11 = g.f24106m;
                    l.c(p11);
                    int q10 = p11.f24108f;
                    Activity n10 = this.f24118e.E();
                    l.c(n10);
                    o10.b(aVar, q10, n10, this.f24118e.F());
                } catch (IntentSender.SendIntentException e10) {
                    Log.d("InAppUpdateManager", "" + e10.getMessage());
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((n5.a) obj);
            return x.f30437a;
        }
    }

    private g(androidx.appcompat.app.d dVar) {
        this.f24112j = 781;
        this.f24113k = new c(this);
        this.f24107e = new WeakReference(dVar);
        n5.b a10 = n5.c.a(dVar);
        this.f24109g = a10;
        w5.e e10 = a10.e();
        l.e(e10, "getAppUpdateInfo(...)");
        this.f24110h = e10;
        dVar.d0().a(this);
    }

    private final void A() {
        g gVar = f24106m;
        l.c(gVar);
        n5.b bVar = gVar.f24109g;
        l.c(bVar);
        bVar.e().d(new a(f.f24117e));
    }

    /* access modifiers changed from: private */
    public static final void B(bm.l lVar, Object obj) {
        l.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    private final void C() {
        g gVar = f24106m;
        l.c(gVar);
        n5.b bVar = gVar.f24109g;
        l.c(bVar);
        bVar.e().d(new d(new C0300g(this)));
    }

    /* access modifiers changed from: private */
    public static final void D(bm.l lVar, Object obj) {
        l.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public final Activity E() {
        return (Activity) this.f24107e.get();
    }

    /* access modifiers changed from: private */
    public static final void G(g gVar, InstallState installState) {
        l.f(gVar, "this$0");
        l.f(installState, "installState");
        if (installState.c() == 2) {
            long a10 = installState.a();
            long e10 = installState.e();
            b bVar = gVar.f24111i;
            if (bVar != null) {
                l.c(bVar);
                bVar.a(a10, e10);
            }
        }
        if (installState.c() == 11) {
            Log.d("InAppUpdateManager", "An update has been downloaded");
            gVar.I();
        }
    }

    /* access modifiers changed from: private */
    public final void I() {
        Activity E = E();
        l.c(E);
        Snackbar l02 = Snackbar.l0(E.getWindow().getDecorView().findViewById(16908290), "An update has just been downloaded.", -2);
        l.e(l02, "make(...)");
        l02.n0("RESTART", new f(this));
        l02.W();
    }

    /* access modifiers changed from: private */
    public static final void J(g gVar, View view) {
        l.f(gVar, "this$0");
        n5.b bVar = gVar.f24109g;
        l.c(bVar);
        bVar.d();
    }

    private final void K() {
        n5.b bVar = this.f24109g;
        l.c(bVar);
        r5.b bVar2 = this.f24113k;
        l.c(bVar2);
        bVar.c(bVar2);
    }

    /* access modifiers changed from: private */
    public final void M(n5.a aVar) {
        try {
            Log.d("InAppUpdateManager", "Starting update");
            n5.b bVar = this.f24109g;
            l.c(bVar);
            int i10 = this.f24108f;
            Activity E = E();
            l.c(E);
            bVar.b(aVar, i10, E, this.f24112j);
        } catch (IntentSender.SendIntentException e10) {
            Log.d("InAppUpdateManager", "" + e10.getMessage());
        }
    }

    private final void N() {
        r5.b bVar;
        n5.b bVar2 = this.f24109g;
        if (bVar2 != null && (bVar = this.f24113k) != null) {
            bVar2.a(bVar);
            Log.d("InAppUpdateManager", "Unregistered the install state listener");
        }
    }

    @c0(k.a.ON_DESTROY)
    private final void onDestroy() {
        N();
    }

    @c0(k.a.ON_RESUME)
    private final void onResume() {
        z();
    }

    /* access modifiers changed from: private */
    public static final void w(bm.l lVar, Object obj) {
        l.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    private final void x() {
        Log.d("InAppUpdateManager", "Checking for updates");
        this.f24110h.d(new b(new e(this)));
    }

    /* access modifiers changed from: private */
    public static final void y(bm.l lVar, Object obj) {
        l.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    private final void z() {
        g gVar = f24106m;
        l.c(gVar);
        if (gVar.f24108f == 0) {
            A();
        } else {
            C();
        }
    }

    public final int F() {
        return this.f24112j;
    }

    public final g H(int i10) {
        String str = i10 == 0 ? "FLEXIBLE" : "IMMEDIATE";
        Log.d("InAppUpdateManager", "Set update mode to : " + str);
        this.f24108f = i10;
        return this;
    }

    public final void L() {
        if (this.f24108f == 0) {
            K();
        }
        x();
    }

    public final void u(b bVar) {
        this.f24111i = bVar;
    }

    public final void v(c cVar) {
        l.f(cVar, "updateInfoListener");
        this.f24110h.d(new e(new d(cVar, this)));
    }

    public /* synthetic */ g(androidx.appcompat.app.d dVar, cm.g gVar) {
        this(dVar);
    }
}
