package androidx.work;

import androidx.work.impl.e;
import cm.g;
import cm.l;
import java.util.concurrent.Executor;
import m1.a0;
import m1.c;
import m1.j;
import m1.o;
import m1.u;
import m1.v;

public final class a {

    /* renamed from: p  reason: collision with root package name */
    public static final b f4072p = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4073a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f4074b;

    /* renamed from: c  reason: collision with root package name */
    private final m1.b f4075c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f4076d;

    /* renamed from: e  reason: collision with root package name */
    private final j f4077e;

    /* renamed from: f  reason: collision with root package name */
    private final u f4078f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.core.util.a f4079g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.core.util.a f4080h;

    /* renamed from: i  reason: collision with root package name */
    private final String f4081i;

    /* renamed from: j  reason: collision with root package name */
    private final int f4082j;

    /* renamed from: k  reason: collision with root package name */
    private final int f4083k;

    /* renamed from: l  reason: collision with root package name */
    private final int f4084l;

    /* renamed from: m  reason: collision with root package name */
    private final int f4085m;

    /* renamed from: n  reason: collision with root package name */
    private final int f4086n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f4087o;

    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    public static final class C0070a {

        /* renamed from: a  reason: collision with root package name */
        private Executor f4088a;

        /* renamed from: b  reason: collision with root package name */
        private a0 f4089b;

        /* renamed from: c  reason: collision with root package name */
        private j f4090c;

        /* renamed from: d  reason: collision with root package name */
        private Executor f4091d;

        /* renamed from: e  reason: collision with root package name */
        private m1.b f4092e;

        /* renamed from: f  reason: collision with root package name */
        private u f4093f;

        /* renamed from: g  reason: collision with root package name */
        private androidx.core.util.a f4094g;

        /* renamed from: h  reason: collision with root package name */
        private androidx.core.util.a f4095h;

        /* renamed from: i  reason: collision with root package name */
        private String f4096i;

        /* renamed from: j  reason: collision with root package name */
        private int f4097j = 4;

        /* renamed from: k  reason: collision with root package name */
        private int f4098k;

        /* renamed from: l  reason: collision with root package name */
        private int f4099l = Integer.MAX_VALUE;

        /* renamed from: m  reason: collision with root package name */
        private int f4100m = 20;

        /* renamed from: n  reason: collision with root package name */
        private int f4101n = c.c();

        public final a a() {
            return new a(this);
        }

        public final m1.b b() {
            return this.f4092e;
        }

        public final int c() {
            return this.f4101n;
        }

        public final String d() {
            return this.f4096i;
        }

        public final Executor e() {
            return this.f4088a;
        }

        public final androidx.core.util.a f() {
            return this.f4094g;
        }

        public final j g() {
            return this.f4090c;
        }

        public final int h() {
            return this.f4097j;
        }

        public final int i() {
            return this.f4099l;
        }

        public final int j() {
            return this.f4100m;
        }

        public final int k() {
            return this.f4098k;
        }

        public final u l() {
            return this.f4093f;
        }

        public final androidx.core.util.a m() {
            return this.f4095h;
        }

        public final Executor n() {
            return this.f4091d;
        }

        public final a0 o() {
            return this.f4089b;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    public a(C0070a aVar) {
        l.f(aVar, "builder");
        Executor e10 = aVar.e();
        boolean z10 = false;
        this.f4073a = e10 == null ? c.b(false) : e10;
        this.f4087o = aVar.n() == null ? true : z10;
        Executor n10 = aVar.n();
        this.f4074b = n10 == null ? c.b(true) : n10;
        m1.b b10 = aVar.b();
        this.f4075c = b10 == null ? new v() : b10;
        a0 o10 = aVar.o();
        if (o10 == null) {
            o10 = a0.c();
            l.e(o10, "getDefaultWorkerFactory()");
        }
        this.f4076d = o10;
        j g10 = aVar.g();
        this.f4077e = g10 == null ? o.f13705a : g10;
        u l10 = aVar.l();
        this.f4078f = l10 == null ? new e() : l10;
        this.f4082j = aVar.h();
        this.f4083k = aVar.k();
        this.f4084l = aVar.i();
        this.f4086n = aVar.j();
        this.f4079g = aVar.f();
        this.f4080h = aVar.m();
        this.f4081i = aVar.d();
        this.f4085m = aVar.c();
    }

    public final m1.b a() {
        return this.f4075c;
    }

    public final int b() {
        return this.f4085m;
    }

    public final String c() {
        return this.f4081i;
    }

    public final Executor d() {
        return this.f4073a;
    }

    public final androidx.core.util.a e() {
        return this.f4079g;
    }

    public final j f() {
        return this.f4077e;
    }

    public final int g() {
        return this.f4084l;
    }

    public final int h() {
        return this.f4086n;
    }

    public final int i() {
        return this.f4083k;
    }

    public final int j() {
        return this.f4082j;
    }

    public final u k() {
        return this.f4078f;
    }

    public final androidx.core.util.a l() {
        return this.f4080h;
    }

    public final Executor m() {
        return this.f4074b;
    }

    public final a0 n() {
        return this.f4076d;
    }
}
