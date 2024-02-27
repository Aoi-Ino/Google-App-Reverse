package s;

import p.d;
import p.i;
import s.d;
import s.e;

public class a extends j {
    private int N0 = 0;
    private boolean O0 = true;
    private int P0 = 0;
    boolean Q0 = false;

    public void A1(int i10) {
        this.N0 = i10;
    }

    public void B1(int i10) {
        this.P0 = i10;
    }

    public void g(d dVar, boolean z10) {
        d[] dVarArr;
        boolean z11;
        i iVar;
        d dVar2;
        int i10;
        int i11;
        int i12;
        i iVar2;
        int i13;
        d[] dVarArr2 = this.W;
        dVarArr2[0] = this.O;
        dVarArr2[2] = this.P;
        dVarArr2[1] = this.Q;
        dVarArr2[3] = this.R;
        int i14 = 0;
        while (true) {
            dVarArr = this.W;
            if (i14 >= dVarArr.length) {
                break;
            }
            d dVar3 = dVarArr[i14];
            dVar3.f15667i = dVar.q(dVar3);
            i14++;
        }
        int i15 = this.N0;
        if (i15 >= 0 && i15 < 4) {
            d dVar4 = dVarArr[i15];
            if (!this.Q0) {
                t1();
            }
            if (this.Q0) {
                this.Q0 = false;
                int i16 = this.N0;
                if (i16 == 0 || i16 == 1) {
                    dVar.f(this.O.f15667i, this.f15690f0);
                    iVar2 = this.Q.f15667i;
                    i13 = this.f15690f0;
                } else if (i16 == 2 || i16 == 3) {
                    dVar.f(this.P.f15667i, this.f15692g0);
                    iVar2 = this.R.f15667i;
                    i13 = this.f15692g0;
                } else {
                    return;
                }
                dVar.f(iVar2, i13);
                return;
            }
            int i17 = 0;
            while (true) {
                if (i17 >= this.M0) {
                    z11 = false;
                    break;
                }
                e eVar = this.L0[i17];
                if ((this.O0 || eVar.h()) && ((((i11 = this.N0) == 0 || i11 == 1) && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.O.f15664f != null && eVar.Q.f15664f != null) || (((i12 = this.N0) == 2 || i12 == 3) && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.P.f15664f != null && eVar.R.f15664f != null))) {
                    z11 = true;
                } else {
                    i17++;
                }
            }
            z11 = true;
            boolean z12 = this.O.l() || this.Q.l();
            boolean z13 = this.P.l() || this.R.l();
            int i18 = !(!z11 && (((i10 = this.N0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
            for (int i19 = 0; i19 < this.M0; i19++) {
                e eVar2 = this.L0[i19];
                if (this.O0 || eVar2.h()) {
                    i q10 = dVar.q(eVar2.W[this.N0]);
                    d[] dVarArr3 = eVar2.W;
                    int i20 = this.N0;
                    d dVar5 = dVarArr3[i20];
                    dVar5.f15667i = q10;
                    d dVar6 = dVar5.f15664f;
                    int i21 = (dVar6 == null || dVar6.f15662d != this) ? 0 : dVar5.f15665g;
                    if (i20 == 0 || i20 == 2) {
                        dVar.i(dVar4.f15667i, q10, this.P0 - i21, z11);
                    } else {
                        dVar.g(dVar4.f15667i, q10, this.P0 + i21, z11);
                    }
                    dVar.e(dVar4.f15667i, q10, this.P0 + i21, i18);
                }
            }
            int i22 = this.N0;
            if (i22 == 0) {
                dVar.e(this.Q.f15667i, this.O.f15667i, 0, 8);
                dVar.e(this.O.f15667i, this.f15680a0.Q.f15667i, 0, 4);
                iVar = this.O.f15667i;
                dVar2 = this.f15680a0.O;
            } else if (i22 == 1) {
                dVar.e(this.O.f15667i, this.Q.f15667i, 0, 8);
                dVar.e(this.O.f15667i, this.f15680a0.O.f15667i, 0, 4);
                iVar = this.O.f15667i;
                dVar2 = this.f15680a0.Q;
            } else if (i22 == 2) {
                dVar.e(this.R.f15667i, this.P.f15667i, 0, 8);
                dVar.e(this.P.f15667i, this.f15680a0.R.f15667i, 0, 4);
                iVar = this.P.f15667i;
                dVar2 = this.f15680a0.P;
            } else if (i22 == 3) {
                dVar.e(this.P.f15667i, this.R.f15667i, 0, 8);
                dVar.e(this.P.f15667i, this.f15680a0.P.f15667i, 0, 4);
                iVar = this.P.f15667i;
                dVar2 = this.f15680a0.R;
            } else {
                return;
            }
            dVar.e(iVar, dVar2.f15667i, 0, 0);
        }
    }

    public boolean h() {
        return true;
    }

    public boolean n0() {
        return this.Q0;
    }

    public boolean o0() {
        return this.Q0;
    }

    public boolean t1() {
        int i10;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.M0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.L0[i13];
            if ((this.O0 || eVar.h()) && ((((i11 = this.N0) == 0 || i11 == 1) && !eVar.n0()) || (((i12 = this.N0) == 2 || i12 == 3) && !eVar.o0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.M0; i15++) {
            e eVar2 = this.L0[i15];
            if (this.O0 || eVar2.h()) {
                if (!z11) {
                    int i16 = this.N0;
                    if (i16 == 0) {
                        bVar3 = d.b.LEFT;
                    } else if (i16 == 1) {
                        bVar3 = d.b.RIGHT;
                    } else if (i16 == 2) {
                        bVar3 = d.b.TOP;
                    } else {
                        if (i16 == 3) {
                            bVar3 = d.b.BOTTOM;
                        }
                        z11 = true;
                    }
                    i14 = eVar2.o(bVar3).e();
                    z11 = true;
                }
                int i17 = this.N0;
                if (i17 == 0) {
                    bVar2 = d.b.LEFT;
                } else {
                    if (i17 == 1) {
                        bVar = d.b.RIGHT;
                    } else if (i17 == 2) {
                        bVar2 = d.b.TOP;
                    } else if (i17 == 3) {
                        bVar = d.b.BOTTOM;
                    }
                    i14 = Math.max(i14, eVar2.o(bVar).e());
                }
                i14 = Math.min(i14, eVar2.o(bVar2).e());
            }
        }
        int i18 = i14 + this.P0;
        int i19 = this.N0;
        if (i19 == 0 || i19 == 1) {
            F0(i18, i18);
        } else {
            I0(i18, i18);
        }
        this.Q0 = true;
        return true;
    }

    public String toString() {
        String str = "[Barrier] " + t() + " {";
        for (int i10 = 0; i10 < this.M0; i10++) {
            e eVar = this.L0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.t();
        }
        return str + "}";
    }

    public boolean u1() {
        return this.O0;
    }

    public int v1() {
        return this.N0;
    }

    public int w1() {
        return this.P0;
    }

    public int x1() {
        int i10 = this.N0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    public void y1() {
        for (int i10 = 0; i10 < this.M0; i10++) {
            e eVar = this.L0[i10];
            if (this.O0 || eVar.h()) {
                int i11 = this.N0;
                if (i11 == 0 || i11 == 1) {
                    eVar.S0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    eVar.S0(1, true);
                }
            }
        }
    }

    public void z1(boolean z10) {
        this.O0 = z10;
    }
}
