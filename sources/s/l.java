package s;

import java.util.HashSet;
import s.e;
import t.b;

public abstract class l extends j {
    private int N0 = 0;
    private int O0 = 0;
    private int P0 = 0;
    private int Q0 = 0;
    private int R0 = 0;
    private int S0 = 0;
    private int T0 = 0;
    private int U0 = 0;
    private boolean V0 = false;
    private int W0 = 0;
    private int X0 = 0;
    protected b.a Y0 = new b.a();
    b.C0215b Z0 = null;

    public int A1() {
        return this.U0;
    }

    public int B1() {
        return this.N0;
    }

    public abstract void C1(int i10, int i11, int i12, int i13);

    /* access modifiers changed from: protected */
    public void D1(e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        while (this.Z0 == null && K() != null) {
            this.Z0 = ((f) K()).I1();
        }
        b.a aVar = this.Y0;
        aVar.f16145a = bVar;
        aVar.f16146b = bVar2;
        aVar.f16147c = i10;
        aVar.f16148d = i11;
        this.Z0.b(eVar, aVar);
        eVar.k1(this.Y0.f16149e);
        eVar.L0(this.Y0.f16150f);
        eVar.K0(this.Y0.f16152h);
        eVar.A0(this.Y0.f16151g);
    }

    /* access modifiers changed from: protected */
    public boolean E1() {
        e eVar = this.f15680a0;
        b.C0215b I1 = eVar != null ? ((f) eVar).I1() : null;
        if (I1 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.M0; i10++) {
            e eVar2 = this.L0[i10];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b u10 = eVar2.u(0);
                e.b u11 = eVar2.u(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (u10 != bVar || eVar2.f15723w == 1 || u11 != bVar || eVar2.f15725x == 1) {
                    if (u10 == bVar) {
                        u10 = e.b.WRAP_CONTENT;
                    }
                    if (u11 == bVar) {
                        u11 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.Y0;
                    aVar.f16145a = u10;
                    aVar.f16146b = u11;
                    aVar.f16147c = eVar2.W();
                    this.Y0.f16148d = eVar2.x();
                    I1.b(eVar2, this.Y0);
                    eVar2.k1(this.Y0.f16149e);
                    eVar2.L0(this.Y0.f16150f);
                    eVar2.A0(this.Y0.f16151g);
                }
            }
        }
        return true;
    }

    public boolean F1() {
        return this.V0;
    }

    /* access modifiers changed from: protected */
    public void G1(boolean z10) {
        this.V0 = z10;
    }

    public void H1(int i10, int i11) {
        this.W0 = i10;
        this.X0 = i11;
    }

    public void I1(int i10) {
        this.P0 = i10;
        this.N0 = i10;
        this.Q0 = i10;
        this.O0 = i10;
        this.R0 = i10;
        this.S0 = i10;
    }

    public void J1(int i10) {
        this.O0 = i10;
    }

    public void K1(int i10) {
        this.S0 = i10;
    }

    public void L1(int i10) {
        this.P0 = i10;
        this.T0 = i10;
    }

    public void M1(int i10) {
        this.Q0 = i10;
        this.U0 = i10;
    }

    public void N1(int i10) {
        this.R0 = i10;
        this.T0 = i10;
        this.U0 = i10;
    }

    public void O1(int i10) {
        this.N0 = i10;
    }

    public void b(f fVar) {
        u1();
    }

    public void t1(boolean z10) {
        int i10 = this.R0;
        if (i10 <= 0 && this.S0 <= 0) {
            return;
        }
        if (z10) {
            this.T0 = this.S0;
            this.U0 = i10;
            return;
        }
        this.T0 = i10;
        this.U0 = this.S0;
    }

    public void u1() {
        for (int i10 = 0; i10 < this.M0; i10++) {
            e eVar = this.L0[i10];
            if (eVar != null) {
                eVar.U0(true);
            }
        }
    }

    public boolean v1(HashSet hashSet) {
        for (int i10 = 0; i10 < this.M0; i10++) {
            if (hashSet.contains(this.L0[i10])) {
                return true;
            }
        }
        return false;
    }

    public int w1() {
        return this.X0;
    }

    public int x1() {
        return this.W0;
    }

    public int y1() {
        return this.O0;
    }

    public int z1() {
        return this.T0;
    }
}
