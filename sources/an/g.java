package an;

import cm.l;
import java.util.List;
import um.b0;
import um.d0;
import um.j;
import um.w;
import zm.c;
import zm.e;

public final class g implements w.a {

    /* renamed from: a  reason: collision with root package name */
    private int f19396a;

    /* renamed from: b  reason: collision with root package name */
    private final e f19397b;

    /* renamed from: c  reason: collision with root package name */
    private final List f19398c;

    /* renamed from: d  reason: collision with root package name */
    private final int f19399d;

    /* renamed from: e  reason: collision with root package name */
    private final c f19400e;

    /* renamed from: f  reason: collision with root package name */
    private final b0 f19401f;

    /* renamed from: g  reason: collision with root package name */
    private final int f19402g;

    /* renamed from: h  reason: collision with root package name */
    private final int f19403h;

    /* renamed from: i  reason: collision with root package name */
    private final int f19404i;

    public g(e eVar, List list, int i10, c cVar, b0 b0Var, int i11, int i12, int i13) {
        l.f(eVar, "call");
        l.f(list, "interceptors");
        l.f(b0Var, "request");
        this.f19397b = eVar;
        this.f19398c = list;
        this.f19399d = i10;
        this.f19400e = cVar;
        this.f19401f = b0Var;
        this.f19402g = i11;
        this.f19403h = i12;
        this.f19404i = i13;
    }

    public static /* synthetic */ g d(g gVar, int i10, c cVar, b0 b0Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f19399d;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.f19400e;
        }
        c cVar2 = cVar;
        if ((i14 & 4) != 0) {
            b0Var = gVar.f19401f;
        }
        b0 b0Var2 = b0Var;
        if ((i14 & 8) != 0) {
            i11 = gVar.f19402g;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = gVar.f19403h;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = gVar.f19404i;
        }
        return gVar.c(i10, cVar2, b0Var2, i15, i16, i13);
    }

    public d0 a(b0 b0Var) {
        l.f(b0Var, "request");
        boolean z10 = false;
        if (this.f19399d < this.f19398c.size()) {
            this.f19396a++;
            c cVar = this.f19400e;
            if (cVar != null) {
                if (cVar.j().g(b0Var.j())) {
                    if (!(this.f19396a == 1)) {
                        throw new IllegalStateException(("network interceptor " + ((w) this.f19398c.get(this.f19399d - 1)) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + ((w) this.f19398c.get(this.f19399d - 1)) + " must retain the same host and port").toString());
                }
            }
            g d10 = d(this, this.f19399d + 1, (c) null, b0Var, 0, 0, 0, 58, (Object) null);
            w wVar = (w) this.f19398c.get(this.f19399d);
            d0 a10 = wVar.a(d10);
            if (a10 != null) {
                if (this.f19400e != null) {
                    if (!(this.f19399d + 1 >= this.f19398c.size() || d10.f19396a == 1)) {
                        throw new IllegalStateException(("network interceptor " + wVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a10.c() != null) {
                    z10 = true;
                }
                if (z10) {
                    return a10;
                }
                throw new IllegalStateException(("interceptor " + wVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + wVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public j b() {
        c cVar = this.f19400e;
        if (cVar != null) {
            return cVar.h();
        }
        return null;
    }

    public final g c(int i10, c cVar, b0 b0Var, int i11, int i12, int i13) {
        l.f(b0Var, "request");
        return new g(this.f19397b, this.f19398c, i10, cVar, b0Var, i11, i12, i13);
    }

    public um.e call() {
        return this.f19397b;
    }

    public final e e() {
        return this.f19397b;
    }

    public final int f() {
        return this.f19402g;
    }

    public final c g() {
        return this.f19400e;
    }

    public final int h() {
        return this.f19403h;
    }

    public final b0 i() {
        return this.f19401f;
    }

    public final int j() {
        return this.f19404i;
    }

    public int k() {
        return this.f19403h;
    }

    public b0 request() {
        return this.f19401f;
    }
}
