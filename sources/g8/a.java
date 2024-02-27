package g8;

import a8.j;
import a8.v;
import e8.a0;
import e8.b0;
import e8.c1;
import e8.c2;
import e8.r0;
import e8.t0;
import e8.t1;
import e8.y;
import e8.y1;
import e8.z;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;

public class a {

    /* renamed from: a  reason: collision with root package name */
    protected y f11721a;

    /* renamed from: b  reason: collision with root package name */
    protected ArrayList f11722b;

    /* renamed from: c  reason: collision with root package name */
    protected ArrayList f11723c = new ArrayList();

    public a(c2 c2Var) {
        this.f11721a = new y(c2Var);
    }

    public static a0 d(c2 c2Var, a8.a aVar, v vVar) {
        switch (aVar.a()) {
            case 1:
                return new a0(c2Var, aVar.d(), aVar.f(), aVar.i(), aVar.k(), new z((URL) aVar.b().get("url")));
            case 2:
                return new a0(c2Var, aVar.d(), aVar.f(), aVar.i(), aVar.k(), new z((String) aVar.b().get("file")));
            case 3:
                return new a0(c2Var, aVar.d(), aVar.f(), aVar.i(), aVar.k(), new z((String) aVar.b().get("file"), (String) aVar.b().get("destination")));
            case 4:
                return new a0(c2Var, aVar.d(), aVar.f(), aVar.i(), aVar.k(), new z((String) aVar.b().get("file"), ((Integer) aVar.b().get("page")).intValue()));
            case 5:
                return new a0(c2Var, aVar.d(), aVar.f(), aVar.i(), aVar.k(), new z(((Integer) aVar.b().get("named")).intValue()));
            case 6:
                return new a0(c2Var, aVar.d(), aVar.f(), aVar.i(), aVar.k(), new z((String) aVar.b().get("application"), (String) aVar.b().get("parameters"), (String) aVar.b().get("operation"), (String) aVar.b().get("defaultdir")));
            case 7:
                boolean[] zArr = (boolean[]) aVar.b().get("parameters");
                String str = (String) aVar.b().get("file");
                String str2 = (String) aVar.b().get("mime");
                return a0.v(c2Var, new v(aVar.d(), aVar.f(), aVar.i(), aVar.k()), str, zArr[0] ? r0.v(c2Var, str, str, (byte[]) null) : r0.y(c2Var, str), str2, zArr[1]);
            default:
                return new a0(c2Var, vVar.p(), vVar.m(), vVar.s(), vVar.w(), new y1(aVar.h(), "UnicodeBig"), new y1(aVar.c(), "UnicodeBig"));
        }
    }

    public void a(a0 a0Var) {
        if (a0Var.A()) {
            t0 t0Var = (t0) a0Var;
            if (t0Var.F() == null) {
                b(t0Var);
                return;
            }
            return;
        }
        this.f11722b.add(a0Var);
    }

    /* access modifiers changed from: package-private */
    public void b(t0 t0Var) {
        this.f11722b.add(t0Var);
        ArrayList E = t0Var.E();
        if (E != null) {
            for (int i10 = 0; i10 < E.size(); i10++) {
                b((t0) E.get(i10));
            }
        }
    }

    public void c(a0 a0Var) {
        this.f11722b.add(a0Var);
    }

    public y e() {
        return this.f11721a;
    }

    public boolean f() {
        return !this.f11722b.isEmpty();
    }

    public boolean g() {
        return this.f11721a.x();
    }

    public void h() {
        this.f11722b = this.f11723c;
        this.f11723c = new ArrayList();
    }

    public b0 i(c2 c2Var, v vVar) {
        t1 t1Var;
        HashSet y10;
        b0 b0Var = new b0();
        int u10 = vVar.u() % 360;
        int w10 = c2Var.w();
        for (int i10 = 0; i10 < this.f11722b.size(); i10++) {
            a0 a0Var = (a0) this.f11722b.get(i10);
            if (a0Var.x() > w10) {
                this.f11723c.add(a0Var);
            } else {
                if (a0Var.A()) {
                    if (!a0Var.B() && (y10 = a0Var.y()) != null) {
                        this.f11721a.w(y10);
                    }
                    t0 t0Var = (t0) a0Var;
                    if (t0Var.F() == null) {
                        this.f11721a.v(t0Var.w());
                    }
                }
                if (a0Var.z()) {
                    b0Var.m(a0Var.w());
                    if (!a0Var.B()) {
                        c1 c1Var = c1.f10223b8;
                        t1 t1Var2 = (t1) a0Var.m(c1Var);
                        if (t1Var2 != null) {
                            if (u10 == 90) {
                                t1Var = new t1(vVar.w() - t1Var2.u(), t1Var2.v(), vVar.w() - t1Var2.x(), t1Var2.w());
                            } else if (u10 == 180) {
                                t1Var = new t1(vVar.s() - t1Var2.v(), vVar.w() - t1Var2.u(), vVar.s() - t1Var2.w(), vVar.w() - t1Var2.x());
                            } else if (u10 == 270) {
                                t1Var = new t1(t1Var2.u(), vVar.s() - t1Var2.v(), t1Var2.x(), vVar.s() - t1Var2.w());
                            }
                            a0Var.r(c1Var, t1Var);
                        }
                    }
                }
                if (!a0Var.B()) {
                    a0Var.D();
                    try {
                        c2Var.o(a0Var, a0Var.w());
                    } catch (IOException e10) {
                        throw new j(e10);
                    }
                }
            }
        }
        return b0Var;
    }
}
