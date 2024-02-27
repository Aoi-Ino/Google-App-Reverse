package androidx.lifecycle;

import androidx.lifecycle.k;
import java.util.Map;
import k.b;

public abstract class x {

    /* renamed from: k  reason: collision with root package name */
    static final Object f3372k = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f3373a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private k.b f3374b = new k.b();

    /* renamed from: c  reason: collision with root package name */
    int f3375c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3376d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f3377e;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f3378f;

    /* renamed from: g  reason: collision with root package name */
    private int f3379g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3380h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3381i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f3382j;

    class a implements Runnable {
        a() {
        }

        public void run() {
            Object obj;
            synchronized (x.this.f3373a) {
                obj = x.this.f3378f;
                x.this.f3378f = x.f3372k;
            }
            x.this.m(obj);
        }
    }

    private class b extends d {
        b(b0 b0Var) {
            super(b0Var);
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return true;
        }
    }

    class c extends d implements o {

        /* renamed from: i  reason: collision with root package name */
        final s f3385i;

        c(s sVar, b0 b0Var) {
            super(b0Var);
            this.f3385i = sVar;
        }

        public void d(s sVar, k.a aVar) {
            k.b b10 = this.f3385i.d0().b();
            if (b10 == k.b.DESTROYED) {
                x.this.l(this.f3387e);
                return;
            }
            k.b bVar = null;
            while (bVar != b10) {
                h(k());
                bVar = b10;
                b10 = this.f3385i.d0().b();
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
            this.f3385i.d0().d(this);
        }

        /* access modifiers changed from: package-private */
        public boolean j(s sVar) {
            return this.f3385i == sVar;
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return this.f3385i.d0().b().b(k.b.STARTED);
        }
    }

    private abstract class d {

        /* renamed from: e  reason: collision with root package name */
        final b0 f3387e;

        /* renamed from: f  reason: collision with root package name */
        boolean f3388f;

        /* renamed from: g  reason: collision with root package name */
        int f3389g = -1;

        d(b0 b0Var) {
            this.f3387e = b0Var;
        }

        /* access modifiers changed from: package-private */
        public void h(boolean z10) {
            if (z10 != this.f3388f) {
                this.f3388f = z10;
                x.this.b(z10 ? 1 : -1);
                if (this.f3388f) {
                    x.this.d(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
        }

        /* access modifiers changed from: package-private */
        public boolean j(s sVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean k();
    }

    public x() {
        Object obj = f3372k;
        this.f3378f = obj;
        this.f3382j = new a();
        this.f3377e = obj;
        this.f3379g = -1;
    }

    static void a(String str) {
        if (!j.c.g().b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void c(d dVar) {
        if (dVar.f3388f) {
            if (!dVar.k()) {
                dVar.h(false);
                return;
            }
            int i10 = dVar.f3389g;
            int i11 = this.f3379g;
            if (i10 < i11) {
                dVar.f3389g = i11;
                dVar.f3387e.b(this.f3377e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i10) {
        int i11 = this.f3375c;
        this.f3375c = i10 + i11;
        if (!this.f3376d) {
            this.f3376d = true;
            while (true) {
                try {
                    int i12 = this.f3375c;
                    if (i11 != i12) {
                        boolean z10 = i11 == 0 && i12 > 0;
                        boolean z11 = i11 > 0 && i12 == 0;
                        if (z10) {
                            i();
                        } else if (z11) {
                            j();
                        }
                        i11 = i12;
                    } else {
                        this.f3376d = false;
                        return;
                    }
                } catch (Throwable th2) {
                    this.f3376d = false;
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(d dVar) {
        if (this.f3380h) {
            this.f3381i = true;
            return;
        }
        this.f3380h = true;
        do {
            this.f3381i = false;
            if (dVar == null) {
                b.d o10 = this.f3374b.o();
                while (o10.hasNext()) {
                    c((d) ((Map.Entry) o10.next()).getValue());
                    if (this.f3381i) {
                        break;
                    }
                }
            } else {
                c(dVar);
                dVar = null;
            }
        } while (this.f3381i);
        this.f3380h = false;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f3379g;
    }

    public boolean f() {
        return this.f3375c > 0;
    }

    public void g(s sVar, b0 b0Var) {
        a("observe");
        if (sVar.d0().b() != k.b.DESTROYED) {
            c cVar = new c(sVar, b0Var);
            d dVar = (d) this.f3374b.v(b0Var, cVar);
            if (dVar != null && !dVar.j(sVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (dVar == null) {
                sVar.d0().a(cVar);
            }
        }
    }

    public void h(b0 b0Var) {
        a("observeForever");
        b bVar = new b(b0Var);
        d dVar = (d) this.f3374b.v(b0Var, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (dVar == null) {
            bVar.h(true);
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public void k(Object obj) {
        boolean z10;
        synchronized (this.f3373a) {
            z10 = this.f3378f == f3372k;
            this.f3378f = obj;
        }
        if (z10) {
            j.c.g().c(this.f3382j);
        }
    }

    public void l(b0 b0Var) {
        a("removeObserver");
        d dVar = (d) this.f3374b.y(b0Var);
        if (dVar != null) {
            dVar.i();
            dVar.h(false);
        }
    }

    /* access modifiers changed from: protected */
    public void m(Object obj) {
        a("setValue");
        this.f3379g++;
        this.f3377e = obj;
        d((d) null);
    }
}
