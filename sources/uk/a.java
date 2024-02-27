package uk;

import uk.b;
import xk.c;
import xk.k;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private b f31852a;

    /* renamed from: b  reason: collision with root package name */
    private b.a f31853b;

    /* renamed from: c  reason: collision with root package name */
    private xk.a f31854c;

    /* renamed from: d  reason: collision with root package name */
    private al.a f31855d;

    /* renamed from: e  reason: collision with root package name */
    private float f31856e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f31857f;

    /* renamed from: uk.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0362a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31858a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                xk.e[] r0 = xk.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31858a = r0
                xk.e r1 = xk.e.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31858a     // Catch:{ NoSuchFieldError -> 0x001d }
                xk.e r1 = xk.e.COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31858a     // Catch:{ NoSuchFieldError -> 0x0028 }
                xk.e r1 = xk.e.SCALE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31858a     // Catch:{ NoSuchFieldError -> 0x0033 }
                xk.e r1 = xk.e.WORM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31858a     // Catch:{ NoSuchFieldError -> 0x003e }
                xk.e r1 = xk.e.FILL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31858a     // Catch:{ NoSuchFieldError -> 0x0049 }
                xk.e r1 = xk.e.SLIDE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31858a     // Catch:{ NoSuchFieldError -> 0x0054 }
                xk.e r1 = xk.e.THIN_WORM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f31858a     // Catch:{ NoSuchFieldError -> 0x0060 }
                xk.e r1 = xk.e.DROP     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f31858a     // Catch:{ NoSuchFieldError -> 0x006c }
                xk.e r1 = xk.e.SWAP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f31858a     // Catch:{ NoSuchFieldError -> 0x0078 }
                xk.e r1 = xk.e.SCALE_DOWN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uk.a.C0362a.<clinit>():void");
        }
    }

    public a(al.a aVar, b.a aVar2) {
        this.f31852a = new b(aVar2);
        this.f31853b = aVar2;
        this.f31855d = aVar;
    }

    private void a() {
        switch (C0362a.f31858a[this.f31855d.b().ordinal()]) {
            case 1:
                this.f31853b.a((vk.a) null);
                return;
            case 2:
                c();
                return;
            case 3:
                h();
                return;
            case 4:
                m();
                return;
            case 5:
                f();
                return;
            case 6:
                j();
                return;
            case 7:
                l();
                return;
            case 8:
                d();
                return;
            case 9:
                k();
                return;
            case 10:
                i();
                return;
            default:
                return;
        }
    }

    private void c() {
        int n10 = this.f31855d.n();
        int r10 = this.f31855d.r();
        xk.a b10 = this.f31852a.a().l(r10, n10).b(this.f31855d.a());
        if (this.f31857f) {
            b10.d(this.f31856e);
        } else {
            b10.e();
        }
        this.f31854c = b10;
    }

    private void d() {
        int o10 = this.f31855d.v() ? this.f31855d.o() : this.f31855d.d();
        int p10 = this.f31855d.v() ? this.f31855d.p() : this.f31855d.o();
        int a10 = dl.a.a(this.f31855d, o10);
        int a11 = dl.a.a(this.f31855d, p10);
        int j10 = this.f31855d.j();
        int h10 = this.f31855d.h();
        if (this.f31855d.e() != al.b.HORIZONTAL) {
            j10 = h10;
        }
        int k10 = this.f31855d.k();
        c m10 = this.f31852a.b().i(this.f31855d.a()).m(a10, a11, (k10 * 3) + j10, k10 + j10, k10);
        if (this.f31857f) {
            m10.d(this.f31856e);
        } else {
            m10.e();
        }
        this.f31854c = m10;
    }

    private void f() {
        int n10 = this.f31855d.n();
        int r10 = this.f31855d.r();
        int k10 = this.f31855d.k();
        int q10 = this.f31855d.q();
        xk.a b10 = this.f31852a.c().q(r10, n10, k10, q10).b(this.f31855d.a());
        if (this.f31857f) {
            b10.d(this.f31856e);
        } else {
            b10.e();
        }
        this.f31854c = b10;
    }

    private void h() {
        int n10 = this.f31855d.n();
        int r10 = this.f31855d.r();
        int k10 = this.f31855d.k();
        float m10 = this.f31855d.m();
        xk.a b10 = this.f31852a.d().p(r10, n10, k10, m10).b(this.f31855d.a());
        if (this.f31857f) {
            b10.d(this.f31856e);
        } else {
            b10.e();
        }
        this.f31854c = b10;
    }

    private void i() {
        int n10 = this.f31855d.n();
        int r10 = this.f31855d.r();
        int k10 = this.f31855d.k();
        float m10 = this.f31855d.m();
        xk.a b10 = this.f31852a.e().p(r10, n10, k10, m10).b(this.f31855d.a());
        if (this.f31857f) {
            b10.d(this.f31856e);
        } else {
            b10.e();
        }
        this.f31854c = b10;
    }

    private void j() {
        xk.a b10 = this.f31852a.f().l(dl.a.a(this.f31855d, this.f31855d.v() ? this.f31855d.o() : this.f31855d.d()), dl.a.a(this.f31855d, this.f31855d.v() ? this.f31855d.p() : this.f31855d.o())).b(this.f31855d.a());
        if (this.f31857f) {
            b10.d(this.f31856e);
        } else {
            b10.e();
        }
        this.f31854c = b10;
    }

    private void k() {
        xk.a b10 = this.f31852a.g().l(dl.a.a(this.f31855d, this.f31855d.v() ? this.f31855d.o() : this.f31855d.d()), dl.a.a(this.f31855d, this.f31855d.v() ? this.f31855d.p() : this.f31855d.o())).b(this.f31855d.a());
        if (this.f31857f) {
            b10.d(this.f31856e);
        } else {
            b10.e();
        }
        this.f31854c = b10;
    }

    private void l() {
        int o10 = this.f31855d.v() ? this.f31855d.o() : this.f31855d.d();
        int p10 = this.f31855d.v() ? this.f31855d.p() : this.f31855d.o();
        k j10 = this.f31852a.h().n(dl.a.a(this.f31855d, o10), dl.a.a(this.f31855d, p10), this.f31855d.k(), p10 > o10).j(this.f31855d.a());
        if (this.f31857f) {
            j10.d(this.f31856e);
        } else {
            j10.e();
        }
        this.f31854c = j10;
    }

    private void m() {
        int o10 = this.f31855d.v() ? this.f31855d.o() : this.f31855d.d();
        int p10 = this.f31855d.v() ? this.f31855d.p() : this.f31855d.o();
        k j10 = this.f31852a.i().n(dl.a.a(this.f31855d, o10), dl.a.a(this.f31855d, p10), this.f31855d.k(), p10 > o10).j(this.f31855d.a());
        if (this.f31857f) {
            j10.d(this.f31856e);
        } else {
            j10.e();
        }
        this.f31854c = j10;
    }

    public void b() {
        this.f31857f = false;
        this.f31856e = 0.0f;
        a();
    }

    public void e() {
        xk.a aVar = this.f31854c;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void g(float f10) {
        this.f31857f = true;
        this.f31856e = f10;
        a();
    }
}
