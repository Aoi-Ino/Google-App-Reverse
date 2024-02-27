package g8;

import android.support.v4.media.session.b;
import b8.a;
import e8.b0;
import e8.c;
import e8.c1;
import e8.c2;
import e8.d2;
import e8.f1;
import e8.i1;
import e8.l0;
import e8.n;
import e8.u0;
import e8.v0;
import e8.y1;

public class d {

    /* renamed from: a  reason: collision with root package name */
    protected int f11738a = 0;

    public static void a(c2 c2Var, int i10, Object obj) {
        i1 m10;
        if (c2Var != null && c2Var.R()) {
            int G = c2Var.G();
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        c cVar = (c) obj;
                        if (!cVar.y()) {
                            throw new d2(a.b("all.the.fonts.must.be.embedded.this.one.isn.t.1", cVar.n()));
                        }
                    } else if (i10 == 5) {
                        v0 v0Var = (v0) obj;
                        if (v0Var.m(c1.X8) != null) {
                            throw new d2(a.b("the.smask.key.is.not.allowed.in.images", new Object[0]));
                        } else if (G != 1 || (m10 = v0Var.m(c1.f10228c1)) == null) {
                        } else {
                            if (m10.g()) {
                                if (c1.Y1.equals(m10)) {
                                    throw new d2(a.b("colorspace.rgb.is.not.allowed", new Object[0]));
                                }
                            } else if (m10.d() && c1.D0.equals(((b0) m10).s(0))) {
                                throw new d2(a.b("colorspace.calrgb.is.not.allowed", new Object[0]));
                            }
                        }
                    } else if (i10 == 6) {
                        l0 l0Var = (l0) obj;
                        i1 m11 = l0Var.m(c1.f10405q0);
                        if (m11 == null || u0.f11031n.equals(m11) || u0.f11032o.equals(m11)) {
                            i1 m12 = l0Var.m(c1.A0);
                            if (m12 != null) {
                                double m13 = ((f1) m12).m();
                                if (m13 != 1.0d) {
                                    throw new d2(a.b("transparency.is.not.allowed.ca.eq.1", String.valueOf(m13)));
                                }
                            }
                            i1 m14 = l0Var.m(c1.B0);
                            if (m14 != null) {
                                double m15 = ((f1) m14).m();
                                if (m15 != 1.0d) {
                                    throw new d2(a.b("transparency.is.not.allowed.ca.eq.1", String.valueOf(m15)));
                                }
                                return;
                            }
                            return;
                        }
                        throw new d2(a.b("blend.mode.1.not.allowed", m11.toString()));
                    } else if (i10 == 7) {
                        throw new d2(a.b("layers.are.not.allowed", new Object[0]));
                    }
                } else if (G == 1) {
                    throw new d2(a.b("colorspace.rgb.is.not.allowed", new Object[0]));
                }
            } else if (G == 1) {
                if (obj instanceof n) {
                    n nVar = (n) obj;
                    int f10 = nVar.f();
                    if (f10 == 0) {
                        throw new d2(a.b("colorspace.rgb.is.not.allowed", new Object[0]));
                    } else if (f10 == 3) {
                        b.a(nVar);
                        throw null;
                    } else if (f10 == 4) {
                        b.a(nVar);
                        throw null;
                    } else if (f10 == 5) {
                        b.a(nVar);
                        throw null;
                    }
                } else if (obj instanceof a8.b) {
                    throw new d2(a.b("colorspace.rgb.is.not.allowed", new Object[0]));
                }
            }
        }
    }

    public void b(l0 l0Var) {
        if (f() && !e()) {
            c1 c1Var = c1.S6;
            if (l0Var.m(c1Var) == null) {
                l0 l0Var2 = new l0(c1.R6);
                l0Var2.r(c1.P6, new y1("SWOP CGATS TR 001-1995"));
                l0Var2.r(c1.Q6, new y1("CGATS TR 001"));
                l0Var2.r(c1.f10259e8, new y1("http://www.color.org"));
                l0Var2.r(c1.I4, new y1(""));
                l0Var2.r(c1.F8, c1.X3);
                l0Var.r(c1Var, new b0((i1) l0Var2));
            }
        }
    }

    public void c(l0 l0Var) {
        y1 y1Var;
        if (f() && !e()) {
            c1 c1Var = c1.Y3;
            if (l0Var.m(c1Var) == null) {
                if (g()) {
                    l0Var.r(c1Var, new y1("PDF/X-1:2001"));
                    c1Var = new c1("GTS_PDFXConformance");
                    y1Var = new y1("PDF/X-1a:2001");
                } else if (h()) {
                    y1Var = new y1("PDF/X-3:2002");
                }
                l0Var.r(c1Var, y1Var);
            }
            c1 c1Var2 = c1.U9;
            if (l0Var.m(c1Var2) == null) {
                l0Var.r(c1Var2, new y1("Pdf document"));
            }
            c1 c1Var3 = c1.f10497x1;
            if (l0Var.m(c1Var3) == null) {
                l0Var.r(c1Var3, new y1("Unknown"));
            }
            c1 c1Var4 = c1.f10324ja;
            if (l0Var.m(c1Var4) == null) {
                l0Var.r(c1Var4, new c1("False"));
            }
        }
    }

    public int d() {
        return this.f11738a;
    }

    public boolean e() {
        int i10 = this.f11738a;
        return i10 == 3 || i10 == 4;
    }

    public boolean f() {
        return this.f11738a != 0;
    }

    public boolean g() {
        return this.f11738a == 1;
    }

    public boolean h() {
        return this.f11738a == 2;
    }
}
