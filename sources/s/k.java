package s;

import p.d;
import s.e;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f15798a = new boolean[3];

    static void a(f fVar, d dVar, e eVar) {
        eVar.f15717t = -1;
        eVar.f15719u = -1;
        e.b bVar = fVar.Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.Z[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.O.f15665g;
            int W = fVar.W() - eVar.Q.f15665g;
            d dVar2 = eVar.O;
            dVar2.f15667i = dVar.q(dVar2);
            d dVar3 = eVar.Q;
            dVar3.f15667i = dVar.q(dVar3);
            dVar.f(eVar.O.f15667i, i10);
            dVar.f(eVar.Q.f15667i, W);
            eVar.f15717t = 2;
            eVar.O0(i10, W);
        }
        if (fVar.Z[1] != bVar2 && eVar.Z[1] == e.b.MATCH_PARENT) {
            int i11 = eVar.P.f15665g;
            int x10 = fVar.x() - eVar.R.f15665g;
            d dVar4 = eVar.P;
            dVar4.f15667i = dVar.q(dVar4);
            d dVar5 = eVar.R;
            dVar5.f15667i = dVar.q(dVar5);
            dVar.f(eVar.P.f15667i, i11);
            dVar.f(eVar.R.f15667i, x10);
            if (eVar.f15702l0 > 0 || eVar.V() == 8) {
                d dVar6 = eVar.S;
                dVar6.f15667i = dVar.q(dVar6);
                dVar.f(eVar.S.f15667i, eVar.f15702l0 + i11);
            }
            eVar.f15719u = 2;
            eVar.f1(i11, x10);
        }
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
