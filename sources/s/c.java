package s;

import java.util.ArrayList;
import s.e;

public class c {

    /* renamed from: a  reason: collision with root package name */
    protected e f15637a;

    /* renamed from: b  reason: collision with root package name */
    protected e f15638b;

    /* renamed from: c  reason: collision with root package name */
    protected e f15639c;

    /* renamed from: d  reason: collision with root package name */
    protected e f15640d;

    /* renamed from: e  reason: collision with root package name */
    protected e f15641e;

    /* renamed from: f  reason: collision with root package name */
    protected e f15642f;

    /* renamed from: g  reason: collision with root package name */
    protected e f15643g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList f15644h;

    /* renamed from: i  reason: collision with root package name */
    protected int f15645i;

    /* renamed from: j  reason: collision with root package name */
    protected int f15646j;

    /* renamed from: k  reason: collision with root package name */
    protected float f15647k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    int f15648l;

    /* renamed from: m  reason: collision with root package name */
    int f15649m;

    /* renamed from: n  reason: collision with root package name */
    int f15650n;

    /* renamed from: o  reason: collision with root package name */
    boolean f15651o;

    /* renamed from: p  reason: collision with root package name */
    private int f15652p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f15653q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f15654r;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f15655s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f15656t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f15657u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f15658v;

    public c(e eVar, int i10, boolean z10) {
        this.f15637a = eVar;
        this.f15652p = i10;
        this.f15653q = z10;
    }

    private void b() {
        int i10 = this.f15652p * 2;
        e eVar = this.f15637a;
        boolean z10 = true;
        this.f15651o = true;
        e eVar2 = eVar;
        boolean z11 = false;
        while (!z11) {
            this.f15645i++;
            e[] eVarArr = eVar.F0;
            int i11 = this.f15652p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.E0[i11] = null;
            if (eVar.V() != 8) {
                this.f15648l++;
                e.b u10 = eVar.u(this.f15652p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (u10 != bVar) {
                    this.f15649m += eVar.E(this.f15652p);
                }
                int f10 = this.f15649m + eVar.W[i10].f();
                this.f15649m = f10;
                int i12 = i10 + 1;
                this.f15649m = f10 + eVar.W[i12].f();
                int f11 = this.f15650n + eVar.W[i10].f();
                this.f15650n = f11;
                this.f15650n = f11 + eVar.W[i12].f();
                if (this.f15638b == null) {
                    this.f15638b = eVar;
                }
                this.f15640d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i13 = this.f15652p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f15727y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f15646j++;
                        float f12 = eVar.D0[i13];
                        if (f12 > 0.0f) {
                            this.f15647k += f12;
                        }
                        if (c(eVar, i13)) {
                            if (f12 < 0.0f) {
                                this.f15654r = true;
                            } else {
                                this.f15655s = true;
                            }
                            if (this.f15644h == null) {
                                this.f15644h = new ArrayList();
                            }
                            this.f15644h.add(eVar);
                        }
                        if (this.f15642f == null) {
                            this.f15642f = eVar;
                        }
                        e eVar4 = this.f15643g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f15652p] = eVar;
                        }
                        this.f15643g = eVar;
                    }
                    if (this.f15652p != 0 ? !(eVar.f15725x == 0 && eVar.C == 0 && eVar.D == 0) : !(eVar.f15723w == 0 && eVar.f15729z == 0 && eVar.A == 0)) {
                        this.f15651o = false;
                    }
                    if (eVar.f15686d0 != 0.0f) {
                        this.f15651o = false;
                        this.f15657u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f15652p] = eVar;
            }
            d dVar = eVar.W[i10 + 1].f15664f;
            if (dVar != null) {
                e eVar5 = dVar.f15662d;
                d dVar2 = eVar5.W[i10].f15664f;
                if (dVar2 != null && dVar2.f15662d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z11 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f15638b;
        if (eVar6 != null) {
            this.f15649m -= eVar6.W[i10].f();
        }
        e eVar7 = this.f15640d;
        if (eVar7 != null) {
            this.f15649m -= eVar7.W[i10 + 1].f();
        }
        this.f15639c = eVar;
        if (this.f15652p != 0 || !this.f15653q) {
            this.f15641e = this.f15637a;
        } else {
            this.f15641e = eVar;
        }
        if (!this.f15655s || !this.f15654r) {
            z10 = false;
        }
        this.f15656t = z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r2 = r2.f15727y[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(s.e r2, int r3) {
        /*
            int r0 = r2.V()
            r1 = 8
            if (r0 == r1) goto L_0x001b
            s.e$b[] r0 = r2.Z
            r0 = r0[r3]
            s.e$b r1 = s.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x001b
            int[] r2 = r2.f15727y
            r2 = r2[r3]
            if (r2 == 0) goto L_0x0019
            r3 = 3
            if (r2 != r3) goto L_0x001b
        L_0x0019:
            r2 = 1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s.c.c(s.e, int):boolean");
    }

    public void a() {
        if (!this.f15658v) {
            b();
        }
        this.f15658v = true;
    }
}
