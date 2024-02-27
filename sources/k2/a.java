package k2;

import e2.e;
import e2.h;
import e2.j;
import java.util.HashMap;
import java.util.concurrent.Future;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private h f12908a;

    /* renamed from: b  reason: collision with root package name */
    private Object f12909b;

    /* renamed from: c  reason: collision with root package name */
    private String f12910c;

    /* renamed from: d  reason: collision with root package name */
    private String f12911d;

    /* renamed from: e  reason: collision with root package name */
    private String f12912e;

    /* renamed from: f  reason: collision with root package name */
    private int f12913f;

    /* renamed from: g  reason: collision with root package name */
    private Future f12914g;

    /* renamed from: h  reason: collision with root package name */
    private long f12915h;

    /* renamed from: i  reason: collision with root package name */
    private long f12916i;

    /* renamed from: j  reason: collision with root package name */
    private int f12917j;

    /* renamed from: k  reason: collision with root package name */
    private int f12918k;

    /* renamed from: l  reason: collision with root package name */
    private String f12919l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public e2.b f12920m;

    /* renamed from: n  reason: collision with root package name */
    private int f12921n;

    /* renamed from: o  reason: collision with root package name */
    private HashMap f12922o;

    /* renamed from: p  reason: collision with root package name */
    private j f12923p;

    /* renamed from: k2.a$a  reason: collision with other inner class name */
    class C0169a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e2.a f12924e;

        C0169a(e2.a aVar) {
            this.f12924e = aVar;
        }

        public void run() {
            if (a.this.f12920m != null) {
                a.this.f12920m.a(this.f12924e);
            }
            a.this.j();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            if (a.this.f12920m != null) {
                a.this.f12920m.b();
            }
            a.this.j();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            e unused = a.this.getClass();
        }
    }

    class d implements Runnable {
        d() {
        }

        public void run() {
            e2.c unused = a.this.getClass();
        }
    }

    a(b bVar) {
        this.f12910c = bVar.f12929a;
        this.f12911d = bVar.f12930b;
        this.f12912e = bVar.f12931c;
        this.f12922o = bVar.f12937i;
        this.f12908a = bVar.f12932d;
        this.f12909b = bVar.f12933e;
        int i10 = bVar.f12934f;
        this.f12917j = i10 == 0 ? u() : i10;
        int i11 = bVar.f12935g;
        this.f12918k = i11 == 0 ? l() : i11;
        this.f12919l = bVar.f12936h;
    }

    private void i() {
        this.f12920m = null;
    }

    /* access modifiers changed from: private */
    public void j() {
        i();
        i2.b.c().b(this);
    }

    private int l() {
        return i2.a.d().a();
    }

    private int u() {
        return i2.a.d().e();
    }

    public void A(long j10) {
        this.f12915h = j10;
    }

    public void B(Future future) {
        this.f12914g = future;
    }

    public void C(int i10) {
        this.f12913f = i10;
    }

    public void D(j jVar) {
        this.f12923p = jVar;
    }

    public void E(long j10) {
        this.f12916i = j10;
    }

    public void F(String str) {
        this.f12910c = str;
    }

    public int G(e2.b bVar) {
        this.f12920m = bVar;
        this.f12921n = l2.a.e(this.f12910c, this.f12911d, this.f12912e);
        i2.b.c().a(this);
        return this.f12921n;
    }

    public void e(e2.a aVar) {
        if (this.f12923p != j.CANCELLED) {
            D(j.FAILED);
            f2.a.b().a().a().execute(new C0169a(aVar));
        }
    }

    public void f() {
        if (this.f12923p != j.CANCELLED) {
            f2.a.b().a().a().execute(new d());
        }
    }

    public void g() {
        if (this.f12923p != j.CANCELLED) {
            f2.a.b().a().a().execute(new c());
        }
    }

    public void h() {
        if (this.f12923p != j.CANCELLED) {
            D(j.COMPLETED);
            f2.a.b().a().a().execute(new b());
        }
    }

    public int k() {
        return this.f12918k;
    }

    public String m() {
        return this.f12911d;
    }

    public int n() {
        return this.f12921n;
    }

    public long o() {
        return this.f12915h;
    }

    public String p() {
        return this.f12912e;
    }

    public HashMap q() {
        return this.f12922o;
    }

    public e2.d r() {
        return null;
    }

    public h s() {
        return this.f12908a;
    }

    public int t() {
        return this.f12917j;
    }

    public int v() {
        return this.f12913f;
    }

    public j w() {
        return this.f12923p;
    }

    public long x() {
        return this.f12916i;
    }

    public String y() {
        return this.f12910c;
    }

    public String z() {
        if (this.f12919l == null) {
            this.f12919l = i2.a.d().f();
        }
        return this.f12919l;
    }
}
