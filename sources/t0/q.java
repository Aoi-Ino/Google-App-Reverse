package t0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import bm.l;
import cm.g;
import cm.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.h;
import o.i;
import pl.x;
import t0.p;

public class q extends p implements Iterable, dm.a {

    /* renamed from: t  reason: collision with root package name */
    public static final a f16440t = new a((g) null);

    /* renamed from: p  reason: collision with root package name */
    private final h f16441p = new h();

    /* renamed from: q  reason: collision with root package name */
    private int f16442q;

    /* renamed from: r  reason: collision with root package name */
    private String f16443r;

    /* renamed from: s  reason: collision with root package name */
    private String f16444s;

    public static final class a {

        /* renamed from: t0.q$a$a  reason: collision with other inner class name */
        static final class C0222a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final C0222a f16445e = new C0222a();

            C0222a() {
                super(1);
            }

            /* renamed from: b */
            public final p invoke(p pVar) {
                cm.l.f(pVar, "it");
                if (!(pVar instanceof q)) {
                    return null;
                }
                q qVar = (q) pVar;
                return qVar.r0(qVar.x0());
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final p a(q qVar) {
            cm.l.f(qVar, "<this>");
            return (p) o.o(m.d(qVar.r0(qVar.x0()), C0222a.f16445e));
        }
    }

    public static final class b implements Iterator, dm.a {

        /* renamed from: e  reason: collision with root package name */
        private int f16446e = -1;

        /* renamed from: f  reason: collision with root package name */
        private boolean f16447f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q f16448g;

        b(q qVar) {
            this.f16448g = qVar;
        }

        /* renamed from: a */
        public p next() {
            if (hasNext()) {
                this.f16447f = true;
                h v02 = this.f16448g.v0();
                int i10 = this.f16446e + 1;
                this.f16446e = i10;
                Object r10 = v02.r(i10);
                cm.l.e(r10, "nodes.valueAt(++index)");
                return (p) r10;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f16446e + 1 < this.f16448g.v0().q();
        }

        public void remove() {
            if (this.f16447f) {
                h v02 = this.f16448g.v0();
                ((p) v02.r(this.f16446e)).n0((q) null);
                v02.m(this.f16446e);
                this.f16446e--;
                this.f16447f = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(b0 b0Var) {
        super(b0Var);
        cm.l.f(b0Var, "navGraphNavigator");
    }

    private final void A0(int i10) {
        if (i10 != H()) {
            if (this.f16444s != null) {
                B0((String) null);
            }
            this.f16442q = i10;
            this.f16443r = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this).toString());
    }

    private final void B0(String str) {
        int i10;
        if (str == null) {
            i10 = 0;
        } else if (!(!cm.l.a(str, e0()))) {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        } else if (!p.q(str)) {
            i10 = p.f16420n.a(str).hashCode();
        } else {
            throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
        }
        this.f16442q = i10;
        this.f16444s = str;
    }

    public String F() {
        return H() != 0 ? super.F() : "the root navigation";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        if (super.equals(obj)) {
            q qVar = (q) obj;
            if (this.f16441p.q() == qVar.f16441p.q() && x0() == qVar.x0()) {
                for (p pVar : m.b(i.b(this.f16441p))) {
                    if (!cm.l.a(pVar, qVar.f16441p.e(pVar.H()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int x02 = x0();
        h hVar = this.f16441p;
        int q10 = hVar.q();
        for (int i10 = 0; i10 < q10; i10++) {
            x02 = (((x02 * 31) + hVar.j(i10)) * 31) + ((p) hVar.r(i10)).hashCode();
        }
        return x02;
    }

    public final Iterator iterator() {
        return new b(this);
    }

    public p.b j0(o oVar) {
        cm.l.f(oVar, "navDeepLinkRequest");
        p.b j02 = super.j0(oVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            p.b j03 = ((p) it.next()).j0(oVar);
            if (j03 != null) {
                arrayList.add(j03);
            }
        }
        return (p.b) y.g0(q.m(j02, (p.b) y.g0(arrayList)));
    }

    public void k0(Context context, AttributeSet attributeSet) {
        cm.l.f(context, "context");
        cm.l.f(attributeSet, "attrs");
        super.k0(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, u0.a.f16873v);
        cm.l.e(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        A0(obtainAttributes.getResourceId(u0.a.f16874w, 0));
        this.f16443r = p.f16420n.b(context, this.f16442q);
        x xVar = x.f30437a;
        obtainAttributes.recycle();
    }

    public final void q0(p pVar) {
        cm.l.f(pVar, "node");
        int H = pVar.H();
        String e02 = pVar.e0();
        if (H == 0 && e02 == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        } else if (e0() != null && !(!cm.l.a(e02, e0()))) {
            throw new IllegalArgumentException(("Destination " + pVar + " cannot have the same route as graph " + this).toString());
        } else if (H != H()) {
            p pVar2 = (p) this.f16441p.e(H);
            if (pVar2 != pVar) {
                if (pVar.Y() == null) {
                    if (pVar2 != null) {
                        pVar2.n0((q) null);
                    }
                    pVar.n0(this);
                    this.f16441p.k(pVar.H(), pVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
            }
        } else {
            throw new IllegalArgumentException(("Destination " + pVar + " cannot have the same id as graph " + this).toString());
        }
    }

    public final p r0(int i10) {
        return s0(i10, true);
    }

    public final p s0(int i10, boolean z10) {
        p pVar = (p) this.f16441p.e(i10);
        if (pVar != null) {
            return pVar;
        }
        if (!z10 || Y() == null) {
            return null;
        }
        q Y = Y();
        cm.l.c(Y);
        return Y.r0(i10);
    }

    public final p t0(String str) {
        if (str == null || p.q(str)) {
            return null;
        }
        return u0(str, true);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        p t02 = t0(this.f16444s);
        if (t02 == null) {
            t02 = r0(x0());
        }
        sb2.append(" startDestination=");
        if (t02 == null) {
            str = this.f16444s;
            if (str == null && (str = this.f16443r) == null) {
                str = "0x" + Integer.toHexString(this.f16442q);
            }
        } else {
            sb2.append("{");
            sb2.append(t02.toString());
            str = "}";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        cm.l.e(sb3, "sb.toString()");
        return sb3;
    }

    public final p u0(String str, boolean z10) {
        Object obj;
        cm.l.f(str, "route");
        p pVar = (p) this.f16441p.e(p.f16420n.a(str).hashCode());
        if (pVar == null) {
            Iterator it = m.b(i.b(this.f16441p)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((p) obj).i0(str) != null) {
                    break;
                }
            }
            pVar = (p) obj;
        }
        if (pVar != null) {
            return pVar;
        }
        if (!z10 || Y() == null) {
            return null;
        }
        q Y = Y();
        cm.l.c(Y);
        return Y.t0(str);
    }

    public final h v0() {
        return this.f16441p;
    }

    public final String w0() {
        if (this.f16443r == null) {
            String str = this.f16444s;
            if (str == null) {
                str = String.valueOf(this.f16442q);
            }
            this.f16443r = str;
        }
        String str2 = this.f16443r;
        cm.l.c(str2);
        return str2;
    }

    public final int x0() {
        return this.f16442q;
    }

    public final String y0() {
        return this.f16444s;
    }

    public final p.b z0(o oVar) {
        cm.l.f(oVar, "request");
        return super.j0(oVar);
    }
}
