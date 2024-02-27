package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.h0;
import java.util.List;
import java.util.Map;

final class j implements c1 {

    /* renamed from: a  reason: collision with root package name */
    private final i f7108a;

    /* renamed from: b  reason: collision with root package name */
    private int f7109b;

    /* renamed from: c  reason: collision with root package name */
    private int f7110c;

    /* renamed from: d  reason: collision with root package name */
    private int f7111d = 0;

    private j(i iVar) {
        i iVar2 = (i) z.b(iVar, "input");
        this.f7108a = iVar2;
        iVar2.f7094d = this;
    }

    public static j N(i iVar) {
        j jVar = iVar.f7094d;
        return jVar != null ? jVar : new j(iVar);
    }

    private Object O(d1 d1Var, p pVar) {
        int i10 = this.f7110c;
        this.f7110c = p1.c(p1.a(this.f7109b), 4);
        try {
            Object i11 = d1Var.i();
            d1Var.d(i11, this, pVar);
            d1Var.e(i11);
            if (this.f7109b == this.f7110c) {
                return i11;
            }
            throw a0.g();
        } finally {
            this.f7110c = i10;
        }
    }

    private Object P(d1 d1Var, p pVar) {
        int A = this.f7108a.A();
        i iVar = this.f7108a;
        if (iVar.f7091a < iVar.f7092b) {
            int j10 = iVar.j(A);
            Object i10 = d1Var.i();
            this.f7108a.f7091a++;
            d1Var.d(i10, this, pVar);
            d1Var.e(i10);
            this.f7108a.a(0);
            i iVar2 = this.f7108a;
            iVar2.f7091a--;
            iVar2.i(j10);
            return i10;
        }
        throw a0.h();
    }

    private void R(int i10) {
        if (this.f7108a.d() != i10) {
            throw a0.j();
        }
    }

    private void S(int i10) {
        if (p1.b(this.f7109b) != i10) {
            throw a0.d();
        }
    }

    private void T(int i10) {
        if ((i10 & 3) != 0) {
            throw a0.g();
        }
    }

    private void U(int i10) {
        if ((i10 & 7) != 0) {
            throw a0.g();
        }
    }

    public boolean A() {
        int i10;
        if (this.f7108a.e() || (i10 = this.f7109b) == this.f7110c) {
            return false;
        }
        return this.f7108a.C(i10);
    }

    public int B() {
        S(5);
        return this.f7108a.t();
    }

    public void C(List list) {
        int z10;
        if (p1.b(this.f7109b) == 2) {
            do {
                list.add(w());
                if (!this.f7108a.e()) {
                    z10 = this.f7108a.z();
                } else {
                    return;
                }
            } while (z10 == this.f7109b);
            this.f7111d = z10;
            return;
        }
        throw a0.d();
    }

    public void D(Map map, h0.a aVar, p pVar) {
        S(2);
        this.f7108a.j(this.f7108a.A());
        throw null;
    }

    public void E(List list) {
        int z10;
        int z11;
        if (list instanceof m) {
            m mVar = (m) list;
            int b10 = p1.b(this.f7109b);
            if (b10 == 1) {
                do {
                    mVar.n(this.f7108a.m());
                    if (!this.f7108a.e()) {
                        z11 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f7109b);
                this.f7111d = z11;
            } else if (b10 == 2) {
                int A = this.f7108a.A();
                U(A);
                int d10 = this.f7108a.d() + A;
                do {
                    mVar.n(this.f7108a.m());
                } while (this.f7108a.d() < d10);
            } else {
                throw a0.d();
            }
        } else {
            int b11 = p1.b(this.f7109b);
            if (b11 == 1) {
                do {
                    list.add(Double.valueOf(this.f7108a.m()));
                    if (!this.f7108a.e()) {
                        z10 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f7109b);
                this.f7111d = z10;
            } else if (b11 == 2) {
                int A2 = this.f7108a.A();
                U(A2);
                int d11 = this.f7108a.d() + A2;
                do {
                    list.add(Double.valueOf(this.f7108a.m()));
                } while (this.f7108a.d() < d11);
            } else {
                throw a0.d();
            }
        }
    }

    public void F(List list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            int b10 = p1.b(this.f7109b);
            if (b10 == 0) {
                do {
                    f0Var.n(this.f7108a.s());
                    if (!this.f7108a.e()) {
                        z11 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f7109b);
                this.f7111d = z11;
                return;
            } else if (b10 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    f0Var.n(this.f7108a.s());
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        } else {
            int b11 = p1.b(this.f7109b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f7108a.s()));
                    if (!this.f7108a.e()) {
                        z10 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f7109b);
                this.f7111d = z10;
                return;
            } else if (b11 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    list.add(Long.valueOf(this.f7108a.s()));
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        }
        R(i10);
    }

    public void G(List list) {
        int z10;
        int z11;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            int b10 = p1.b(this.f7109b);
            if (b10 == 1) {
                do {
                    f0Var.n(this.f7108a.u());
                    if (!this.f7108a.e()) {
                        z11 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f7109b);
                this.f7111d = z11;
            } else if (b10 == 2) {
                int A = this.f7108a.A();
                U(A);
                int d10 = this.f7108a.d() + A;
                do {
                    f0Var.n(this.f7108a.u());
                } while (this.f7108a.d() < d10);
            } else {
                throw a0.d();
            }
        } else {
            int b11 = p1.b(this.f7109b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f7108a.u()));
                    if (!this.f7108a.e()) {
                        z10 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f7109b);
                this.f7111d = z10;
            } else if (b11 == 2) {
                int A2 = this.f7108a.A();
                U(A2);
                int d11 = this.f7108a.d() + A2;
                do {
                    list.add(Long.valueOf(this.f7108a.u()));
                } while (this.f7108a.d() < d11);
            } else {
                throw a0.d();
            }
        }
    }

    public void H(List list, d1 d1Var, p pVar) {
        int z10;
        if (p1.b(this.f7109b) == 3) {
            int i10 = this.f7109b;
            do {
                list.add(O(d1Var, pVar));
                if (!this.f7108a.e() && this.f7111d == 0) {
                    z10 = this.f7108a.z();
                } else {
                    return;
                }
            } while (z10 == i10);
            this.f7111d = z10;
            return;
        }
        throw a0.d();
    }

    public long I() {
        S(0);
        return this.f7108a.s();
    }

    public String J() {
        S(2);
        return this.f7108a.y();
    }

    public void K(List list) {
        int z10;
        int z11;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            int b10 = p1.b(this.f7109b);
            if (b10 == 1) {
                do {
                    f0Var.n(this.f7108a.p());
                    if (!this.f7108a.e()) {
                        z11 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f7109b);
                this.f7111d = z11;
            } else if (b10 == 2) {
                int A = this.f7108a.A();
                U(A);
                int d10 = this.f7108a.d() + A;
                do {
                    f0Var.n(this.f7108a.p());
                } while (this.f7108a.d() < d10);
            } else {
                throw a0.d();
            }
        } else {
            int b11 = p1.b(this.f7109b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f7108a.p()));
                    if (!this.f7108a.e()) {
                        z10 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f7109b);
                this.f7111d = z10;
            } else if (b11 == 2) {
                int A2 = this.f7108a.A();
                U(A2);
                int d11 = this.f7108a.d() + A2;
                do {
                    list.add(Long.valueOf(this.f7108a.p()));
                } while (this.f7108a.d() < d11);
            } else {
                throw a0.d();
            }
        }
    }

    public void L(List list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = p1.b(this.f7109b);
            if (b10 == 0) {
                do {
                    yVar.n(this.f7108a.r());
                    if (!this.f7108a.e()) {
                        z11 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f7109b);
                this.f7111d = z11;
                return;
            } else if (b10 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    yVar.n(this.f7108a.r());
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        } else {
            int b11 = p1.b(this.f7109b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7108a.r()));
                    if (!this.f7108a.e()) {
                        z10 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f7109b);
                this.f7111d = z10;
                return;
            } else if (b11 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    list.add(Integer.valueOf(this.f7108a.r()));
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        }
        R(i10);
    }

    public void M(List list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = p1.b(this.f7109b);
            if (b10 == 0) {
                do {
                    yVar.n(this.f7108a.n());
                    if (!this.f7108a.e()) {
                        z11 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f7109b);
                this.f7111d = z11;
                return;
            } else if (b10 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    yVar.n(this.f7108a.n());
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        } else {
            int b11 = p1.b(this.f7109b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7108a.n()));
                    if (!this.f7108a.e()) {
                        z10 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f7109b);
                this.f7111d = z10;
                return;
            } else if (b11 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    list.add(Integer.valueOf(this.f7108a.n()));
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        }
        R(i10);
    }

    public void Q(List list, boolean z10) {
        int z11;
        int z12;
        if (p1.b(this.f7109b) != 2) {
            throw a0.d();
        } else if (!(list instanceof d0) || z10) {
            do {
                list.add(z10 ? J() : readString());
                if (!this.f7108a.e()) {
                    z11 = this.f7108a.z();
                } else {
                    return;
                }
            } while (z11 == this.f7109b);
            this.f7111d = z11;
        } else {
            d0 d0Var = (d0) list;
            do {
                d0Var.I(w());
                if (!this.f7108a.e()) {
                    z12 = this.f7108a.z();
                } else {
                    return;
                }
            } while (z12 == this.f7109b);
            this.f7111d = z12;
        }
    }

    public Object a(d1 d1Var, p pVar) {
        S(3);
        return O(d1Var, pVar);
    }

    public void b(List list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = p1.b(this.f7109b);
            if (b10 == 0) {
                do {
                    yVar.n(this.f7108a.v());
                    if (!this.f7108a.e()) {
                        z11 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f7109b);
                this.f7111d = z11;
                return;
            } else if (b10 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    yVar.n(this.f7108a.v());
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        } else {
            int b11 = p1.b(this.f7109b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7108a.v()));
                    if (!this.f7108a.e()) {
                        z10 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f7109b);
                this.f7111d = z10;
                return;
            } else if (b11 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    list.add(Integer.valueOf(this.f7108a.v()));
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        }
        R(i10);
    }

    public int c() {
        S(0);
        return this.f7108a.n();
    }

    public Object d(d1 d1Var, p pVar) {
        S(2);
        return P(d1Var, pVar);
    }

    public int e() {
        return this.f7109b;
    }

    public long f() {
        S(0);
        return this.f7108a.B();
    }

    public void g(List list) {
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = p1.b(this.f7109b);
            if (b10 == 2) {
                int A = this.f7108a.A();
                T(A);
                int d10 = this.f7108a.d() + A;
                do {
                    yVar.n(this.f7108a.o());
                } while (this.f7108a.d() < d10);
            } else if (b10 == 5) {
                do {
                    yVar.n(this.f7108a.o());
                    if (!this.f7108a.e()) {
                        z11 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f7109b);
                this.f7111d = z11;
            } else {
                throw a0.d();
            }
        } else {
            int b11 = p1.b(this.f7109b);
            if (b11 == 2) {
                int A2 = this.f7108a.A();
                T(A2);
                int d11 = this.f7108a.d() + A2;
                do {
                    list.add(Integer.valueOf(this.f7108a.o()));
                } while (this.f7108a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f7108a.o()));
                    if (!this.f7108a.e()) {
                        z10 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f7109b);
                this.f7111d = z10;
            } else {
                throw a0.d();
            }
        }
    }

    public long h() {
        S(1);
        return this.f7108a.p();
    }

    public void i(List list) {
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = p1.b(this.f7109b);
            if (b10 == 2) {
                int A = this.f7108a.A();
                T(A);
                int d10 = this.f7108a.d() + A;
                do {
                    yVar.n(this.f7108a.t());
                } while (this.f7108a.d() < d10);
            } else if (b10 == 5) {
                do {
                    yVar.n(this.f7108a.t());
                    if (!this.f7108a.e()) {
                        z11 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f7109b);
                this.f7111d = z11;
            } else {
                throw a0.d();
            }
        } else {
            int b11 = p1.b(this.f7109b);
            if (b11 == 2) {
                int A2 = this.f7108a.A();
                T(A2);
                int d11 = this.f7108a.d() + A2;
                do {
                    list.add(Integer.valueOf(this.f7108a.t()));
                } while (this.f7108a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f7108a.t()));
                    if (!this.f7108a.e()) {
                        z10 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f7109b);
                this.f7111d = z10;
            } else {
                throw a0.d();
            }
        }
    }

    public int j() {
        S(0);
        return this.f7108a.v();
    }

    public void k(List list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            int b10 = p1.b(this.f7109b);
            if (b10 == 0) {
                do {
                    f0Var.n(this.f7108a.w());
                    if (!this.f7108a.e()) {
                        z11 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f7109b);
                this.f7111d = z11;
                return;
            } else if (b10 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    f0Var.n(this.f7108a.w());
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        } else {
            int b11 = p1.b(this.f7109b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f7108a.w()));
                    if (!this.f7108a.e()) {
                        z10 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f7109b);
                this.f7111d = z10;
                return;
            } else if (b11 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    list.add(Long.valueOf(this.f7108a.w()));
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        }
        R(i10);
    }

    public long l() {
        S(0);
        return this.f7108a.w();
    }

    public void m(List list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = p1.b(this.f7109b);
            if (b10 == 0) {
                do {
                    yVar.n(this.f7108a.A());
                    if (!this.f7108a.e()) {
                        z11 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f7109b);
                this.f7111d = z11;
                return;
            } else if (b10 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    yVar.n(this.f7108a.A());
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        } else {
            int b11 = p1.b(this.f7109b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7108a.A()));
                    if (!this.f7108a.e()) {
                        z10 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f7109b);
                this.f7111d = z10;
                return;
            } else if (b11 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    list.add(Integer.valueOf(this.f7108a.A()));
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        }
        R(i10);
    }

    public void n(List list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof f) {
            f fVar = (f) list;
            int b10 = p1.b(this.f7109b);
            if (b10 == 0) {
                do {
                    fVar.n(this.f7108a.k());
                    if (!this.f7108a.e()) {
                        z11 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f7109b);
                this.f7111d = z11;
                return;
            } else if (b10 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    fVar.n(this.f7108a.k());
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        } else {
            int b11 = p1.b(this.f7109b);
            if (b11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f7108a.k()));
                    if (!this.f7108a.e()) {
                        z10 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f7109b);
                this.f7111d = z10;
                return;
            } else if (b11 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    list.add(Boolean.valueOf(this.f7108a.k()));
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        }
        R(i10);
    }

    public void o(List list, d1 d1Var, p pVar) {
        int z10;
        if (p1.b(this.f7109b) == 2) {
            int i10 = this.f7109b;
            do {
                list.add(P(d1Var, pVar));
                if (!this.f7108a.e() && this.f7111d == 0) {
                    z10 = this.f7108a.z();
                } else {
                    return;
                }
            } while (z10 == i10);
            this.f7111d = z10;
            return;
        }
        throw a0.d();
    }

    public int p() {
        S(5);
        return this.f7108a.o();
    }

    public boolean q() {
        S(0);
        return this.f7108a.k();
    }

    public int r() {
        int i10 = this.f7111d;
        if (i10 != 0) {
            this.f7109b = i10;
            this.f7111d = 0;
        } else {
            this.f7109b = this.f7108a.z();
        }
        int i11 = this.f7109b;
        if (i11 == 0 || i11 == this.f7110c) {
            return Integer.MAX_VALUE;
        }
        return p1.a(i11);
    }

    public double readDouble() {
        S(1);
        return this.f7108a.m();
    }

    public float readFloat() {
        S(5);
        return this.f7108a.q();
    }

    public String readString() {
        S(2);
        return this.f7108a.x();
    }

    public void s(List list) {
        Q(list, false);
    }

    public long t() {
        S(1);
        return this.f7108a.u();
    }

    public void u(List list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            int b10 = p1.b(this.f7109b);
            if (b10 == 0) {
                do {
                    f0Var.n(this.f7108a.B());
                    if (!this.f7108a.e()) {
                        z11 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f7109b);
                this.f7111d = z11;
                return;
            } else if (b10 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    f0Var.n(this.f7108a.B());
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        } else {
            int b11 = p1.b(this.f7109b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f7108a.B()));
                    if (!this.f7108a.e()) {
                        z10 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f7109b);
                this.f7111d = z10;
                return;
            } else if (b11 == 2) {
                i10 = this.f7108a.d() + this.f7108a.A();
                do {
                    list.add(Long.valueOf(this.f7108a.B()));
                } while (this.f7108a.d() < i10);
            } else {
                throw a0.d();
            }
        }
        R(i10);
    }

    public void v(List list) {
        Q(list, true);
    }

    public h w() {
        S(2);
        return this.f7108a.l();
    }

    public void x(List list) {
        int z10;
        int z11;
        if (list instanceof v) {
            v vVar = (v) list;
            int b10 = p1.b(this.f7109b);
            if (b10 == 2) {
                int A = this.f7108a.A();
                T(A);
                int d10 = this.f7108a.d() + A;
                do {
                    vVar.n(this.f7108a.q());
                } while (this.f7108a.d() < d10);
            } else if (b10 == 5) {
                do {
                    vVar.n(this.f7108a.q());
                    if (!this.f7108a.e()) {
                        z11 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f7109b);
                this.f7111d = z11;
            } else {
                throw a0.d();
            }
        } else {
            int b11 = p1.b(this.f7109b);
            if (b11 == 2) {
                int A2 = this.f7108a.A();
                T(A2);
                int d11 = this.f7108a.d() + A2;
                do {
                    list.add(Float.valueOf(this.f7108a.q()));
                } while (this.f7108a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Float.valueOf(this.f7108a.q()));
                    if (!this.f7108a.e()) {
                        z10 = this.f7108a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f7109b);
                this.f7111d = z10;
            } else {
                throw a0.d();
            }
        }
    }

    public int y() {
        S(0);
        return this.f7108a.A();
    }

    public int z() {
        S(0);
        return this.f7108a.r();
    }
}
