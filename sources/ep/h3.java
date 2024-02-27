package ep;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

class h3 {

    /* renamed from: a  reason: collision with root package name */
    private final b f23233a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final Constructor f23234b;

    private static class a extends ArrayList {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    private static class b extends ArrayList {
        /* access modifiers changed from: private */
        public int Y() {
            if (g0() > 0) {
                return get(0).size();
            }
            return 0;
        }

        /* access modifiers changed from: private */
        public int g0() {
            return size();
        }

        public h2 F(int i10, int i11) {
            return (h2) get(i10).get(i11);
        }

        /* renamed from: T */
        public a get(int i10) {
            for (int size = size(); size <= i10; size++) {
                add(new a());
            }
            return (a) super.get(i10);
        }

        public void e0(h2 h2Var, int i10) {
            a T = get(i10);
            if (T != null) {
                T.add(h2Var);
            }
        }
    }

    public h3(Constructor constructor) {
        this.f23234b = constructor;
    }

    private List b(b bVar) {
        if (this.f23233a.isEmpty()) {
            return e();
        }
        c(bVar, 0);
        return f(bVar);
    }

    private void c(b bVar, int i10) {
        d(bVar, new a(), i10);
    }

    private void d(b bVar, a aVar, int i10) {
        a T = this.f23233a.get(i10);
        int size = T.size();
        if (this.f23233a.g0() - 1 > i10) {
            for (int i11 = 0; i11 < size; i11++) {
                a aVar2 = new a(aVar);
                if (aVar != null) {
                    aVar2.add((h2) T.get(i11));
                    d(bVar, aVar2, i10 + 1);
                }
            }
            return;
        }
        i(bVar, aVar, i10);
    }

    private List e() {
        ArrayList arrayList = new ArrayList();
        g3 g3Var = new g3(this.f23234b);
        if (h()) {
            arrayList.add(g3Var);
        }
        return arrayList;
    }

    private List f(b bVar) {
        ArrayList arrayList = new ArrayList();
        int v10 = bVar.Y();
        int r10 = bVar.g0();
        for (int i10 = 0; i10 < v10; i10++) {
            g3 g3Var = new g3(this.f23234b);
            int i11 = 0;
            while (i11 < r10) {
                h2 F = bVar.F(i11, i10);
                String b10 = F.b();
                if (!g3Var.contains(F.getKey())) {
                    g3Var.l(F);
                    i11++;
                } else {
                    throw new r("Parameter '%s' is a duplicate in %s", b10, this.f23234b);
                }
            }
            arrayList.add(g3Var);
        }
        return arrayList;
    }

    private void i(b bVar, a aVar, int i10) {
        a T = this.f23233a.get(i10);
        int size = aVar.size();
        int size2 = T.size();
        for (int i11 = 0; i11 < size2; i11++) {
            for (int i12 = 0; i12 < size; i12++) {
                bVar.get(i12).add((h2) aVar.get(i12));
            }
            bVar.get(i10).add((h2) T.get(i11));
        }
    }

    public List a() {
        return b(new b());
    }

    public void g(h2 h2Var, int i10) {
        this.f23233a.e0(h2Var, i10);
    }

    public boolean h() {
        return this.f23234b.getParameterTypes().length == this.f23233a.g0();
    }
}
