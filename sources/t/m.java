package t;

import java.util.ArrayList;
import s.f;

class m {

    /* renamed from: h  reason: collision with root package name */
    public static int f16193h;

    /* renamed from: a  reason: collision with root package name */
    public int f16194a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16195b = false;

    /* renamed from: c  reason: collision with root package name */
    p f16196c = null;

    /* renamed from: d  reason: collision with root package name */
    p f16197d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList f16198e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    int f16199f;

    /* renamed from: g  reason: collision with root package name */
    int f16200g;

    public m(p pVar, int i10) {
        int i11 = f16193h;
        this.f16199f = i11;
        f16193h = i11 + 1;
        this.f16196c = pVar;
        this.f16197d = pVar;
        this.f16200g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f16169d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f16176k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f16176k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f16169d != pVar) {
                    j11 = Math.min(j11, c(fVar2, ((long) fVar2.f16171f) + j10));
                }
            }
        }
        if (fVar != pVar.f16227i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, c(pVar.f16226h, j12)), j12 - ((long) pVar.f16226h.f16171f));
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f16169d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f16176k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f16176k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f16169d != pVar) {
                    j11 = Math.max(j11, d(fVar2, ((long) fVar2.f16171f) + j10));
                }
            }
        }
        if (fVar != pVar.f16226h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, d(pVar.f16227i, j12)), j12 - ((long) pVar.f16227i.f16171f));
    }

    public void a(p pVar) {
        this.f16198e.add(pVar);
        this.f16197d = pVar;
    }

    public long b(f fVar, int i10) {
        long j10;
        p pVar;
        long j11;
        long j12;
        p pVar2 = this.f16196c;
        long j13 = 0;
        if (pVar2 instanceof c) {
            if (((c) pVar2).f16224f != i10) {
                return 0;
            }
        } else if (i10 == 0) {
            if (!(pVar2 instanceof l)) {
                return 0;
            }
        } else if (!(pVar2 instanceof n)) {
            return 0;
        }
        f fVar2 = (i10 == 0 ? fVar.f15687e : fVar.f15689f).f16226h;
        f fVar3 = (i10 == 0 ? fVar.f15687e : fVar.f15689f).f16227i;
        boolean contains = pVar2.f16226h.f16177l.contains(fVar2);
        boolean contains2 = this.f16196c.f16227i.f16177l.contains(fVar3);
        long j14 = this.f16196c.j();
        if (!contains || !contains2) {
            if (contains) {
                f fVar4 = this.f16196c.f16226h;
                j12 = d(fVar4, (long) fVar4.f16171f);
                j11 = ((long) this.f16196c.f16226h.f16171f) + j14;
            } else if (contains2) {
                f fVar5 = this.f16196c.f16227i;
                long c10 = c(fVar5, (long) fVar5.f16171f);
                j11 = ((long) (-this.f16196c.f16227i.f16171f)) + j14;
                j12 = -c10;
            } else {
                p pVar3 = this.f16196c;
                j10 = ((long) pVar3.f16226h.f16171f) + pVar3.j();
                pVar = this.f16196c;
            }
            return Math.max(j12, j11);
        }
        long d10 = d(this.f16196c.f16226h, 0);
        long c11 = c(this.f16196c.f16227i, 0);
        long j15 = d10 - j14;
        p pVar4 = this.f16196c;
        int i11 = pVar4.f16227i.f16171f;
        if (j15 >= ((long) (-i11))) {
            j15 += (long) i11;
        }
        int i12 = pVar4.f16226h.f16171f;
        long j16 = ((-c11) - j14) - ((long) i12);
        if (j16 >= ((long) i12)) {
            j16 -= (long) i12;
        }
        float q10 = pVar4.f16220b.q(i10);
        if (q10 > 0.0f) {
            j13 = (long) ((((float) j16) / q10) + (((float) j15) / (1.0f - q10)));
        }
        float f10 = (float) j13;
        long j17 = ((long) ((f10 * q10) + 0.5f)) + j14 + ((long) ((f10 * (1.0f - q10)) + 0.5f));
        pVar = this.f16196c;
        j10 = ((long) pVar.f16226h.f16171f) + j17;
        return j10 - ((long) pVar.f16227i.f16171f);
    }
}
