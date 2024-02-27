package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.k;
import cm.l;

public class r0 {

    /* renamed from: a  reason: collision with root package name */
    private final u f3332a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3333b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private a f3334c;

    public static final class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final u f3335e;

        /* renamed from: f  reason: collision with root package name */
        private final k.a f3336f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f3337g;

        public a(u uVar, k.a aVar) {
            l.f(uVar, "registry");
            l.f(aVar, "event");
            this.f3335e = uVar;
            this.f3336f = aVar;
        }

        public void run() {
            if (!this.f3337g) {
                this.f3335e.i(this.f3336f);
                this.f3337g = true;
            }
        }
    }

    public r0(s sVar) {
        l.f(sVar, "provider");
        this.f3332a = new u(sVar);
    }

    private final void f(k.a aVar) {
        a aVar2 = this.f3334c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f3332a, aVar);
        this.f3334c = aVar3;
        Handler handler = this.f3333b;
        l.c(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public k a() {
        return this.f3332a;
    }

    public void b() {
        f(k.a.ON_START);
    }

    public void c() {
        f(k.a.ON_CREATE);
    }

    public void d() {
        f(k.a.ON_STOP);
        f(k.a.ON_DESTROY);
    }

    public void e() {
        f(k.a.ON_START);
    }
}
