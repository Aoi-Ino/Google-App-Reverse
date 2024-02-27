package i1;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import i1.l;
import java.util.ArrayList;
import java.util.Iterator;

public class p extends l {
    private ArrayList M = new ArrayList();
    private boolean N = true;
    int O;
    boolean P = false;
    private int Q = 0;

    class a extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f12215a;

        a(l lVar) {
            this.f12215a = lVar;
        }

        public void e(l lVar) {
            this.f12215a.a0();
            lVar.W(this);
        }
    }

    static class b extends m {

        /* renamed from: a  reason: collision with root package name */
        p f12217a;

        b(p pVar) {
            this.f12217a = pVar;
        }

        public void c(l lVar) {
            p pVar = this.f12217a;
            if (!pVar.P) {
                pVar.h0();
                this.f12217a.P = true;
            }
        }

        public void e(l lVar) {
            p pVar = this.f12217a;
            int i10 = pVar.O - 1;
            pVar.O = i10;
            if (i10 == 0) {
                pVar.P = false;
                pVar.r();
            }
            lVar.W(this);
        }
    }

    private void o0(l lVar) {
        this.M.add(lVar);
        lVar.f12176v = this;
    }

    private void x0() {
        b bVar = new b(this);
        Iterator it = this.M.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a(bVar);
        }
        this.O = this.M.size();
    }

    public void U(View view) {
        super.U(view);
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.M.get(i10)).U(view);
        }
    }

    public void Y(View view) {
        super.Y(view);
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.M.get(i10)).Y(view);
        }
    }

    /* access modifiers changed from: protected */
    public void a0() {
        if (this.M.isEmpty()) {
            h0();
            r();
            return;
        }
        x0();
        if (!this.N) {
            for (int i10 = 1; i10 < this.M.size(); i10++) {
                ((l) this.M.get(i10 - 1)).a(new a((l) this.M.get(i10)));
            }
            l lVar = (l) this.M.get(0);
            if (lVar != null) {
                lVar.a0();
                return;
            }
            return;
        }
        Iterator it = this.M.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a0();
        }
    }

    public void c0(l.e eVar) {
        super.c0(eVar);
        this.Q |= 8;
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.M.get(i10)).c0(eVar);
        }
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        super.cancel();
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.M.get(i10)).cancel();
        }
    }

    public void e0(g gVar) {
        super.e0(gVar);
        this.Q |= 4;
        if (this.M != null) {
            for (int i10 = 0; i10 < this.M.size(); i10++) {
                ((l) this.M.get(i10)).e0(gVar);
            }
        }
    }

    public void f(s sVar) {
        if (N(sVar.f12222b)) {
            Iterator it = this.M.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar.N(sVar.f12222b)) {
                    lVar.f(sVar);
                    sVar.f12223c.add(lVar);
                }
            }
        }
    }

    public void f0(o oVar) {
        super.f0(oVar);
        this.Q |= 2;
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.M.get(i10)).f0(oVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void h(s sVar) {
        super.h(sVar);
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.M.get(i10)).h(sVar);
        }
    }

    public void i(s sVar) {
        if (N(sVar.f12222b)) {
            Iterator it = this.M.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar.N(sVar.f12222b)) {
                    lVar.i(sVar);
                    sVar.f12223c.add(lVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String k0(String str) {
        String k02 = super.k0(str);
        for (int i10 = 0; i10 < this.M.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(k02);
            sb2.append("\n");
            sb2.append(((l) this.M.get(i10)).k0(str + "  "));
            k02 = sb2.toString();
        }
        return k02;
    }

    /* renamed from: l0 */
    public p a(l.f fVar) {
        return (p) super.a(fVar);
    }

    /* renamed from: m */
    public l clone() {
        p pVar = (p) super.clone();
        pVar.M = new ArrayList();
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.o0(((l) this.M.get(i10)).clone());
        }
        return pVar;
    }

    /* renamed from: m0 */
    public p b(View view) {
        for (int i10 = 0; i10 < this.M.size(); i10++) {
            ((l) this.M.get(i10)).b(view);
        }
        return (p) super.b(view);
    }

    public p n0(l lVar) {
        o0(lVar);
        long j10 = this.f12161g;
        if (j10 >= 0) {
            lVar.b0(j10);
        }
        if ((this.Q & 1) != 0) {
            lVar.d0(v());
        }
        if ((this.Q & 2) != 0) {
            A();
            lVar.f0((o) null);
        }
        if ((this.Q & 4) != 0) {
            lVar.e0(z());
        }
        if ((this.Q & 8) != 0) {
            lVar.c0(u());
        }
        return this;
    }

    public l p0(int i10) {
        if (i10 < 0 || i10 >= this.M.size()) {
            return null;
        }
        return (l) this.M.get(i10);
    }

    /* access modifiers changed from: protected */
    public void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        long D = D();
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = (l) this.M.get(i10);
            if (D > 0 && (this.N || i10 == 0)) {
                long D2 = lVar.D();
                if (D2 > 0) {
                    lVar.g0(D2 + D);
                } else {
                    lVar.g0(D);
                }
            }
            lVar.q(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    public int q0() {
        return this.M.size();
    }

    /* renamed from: r0 */
    public p W(l.f fVar) {
        return (p) super.W(fVar);
    }

    /* renamed from: s0 */
    public p X(View view) {
        for (int i10 = 0; i10 < this.M.size(); i10++) {
            ((l) this.M.get(i10)).X(view);
        }
        return (p) super.X(view);
    }

    /* renamed from: t0 */
    public p b0(long j10) {
        ArrayList arrayList;
        super.b0(j10);
        if (this.f12161g >= 0 && (arrayList = this.M) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((l) this.M.get(i10)).b0(j10);
            }
        }
        return this;
    }

    /* renamed from: u0 */
    public p d0(TimeInterpolator timeInterpolator) {
        this.Q |= 1;
        ArrayList arrayList = this.M;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((l) this.M.get(i10)).d0(timeInterpolator);
            }
        }
        return (p) super.d0(timeInterpolator);
    }

    public p v0(int i10) {
        if (i10 == 0) {
            this.N = true;
        } else if (i10 == 1) {
            this.N = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
        }
        return this;
    }

    /* renamed from: w0 */
    public p g0(long j10) {
        return (p) super.g0(j10);
    }
}
