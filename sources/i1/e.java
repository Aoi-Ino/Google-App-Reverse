package i1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.e;
import androidx.fragment.app.a0;
import androidx.fragment.app.i;
import i1.l;
import java.util.ArrayList;
import java.util.List;

public class e extends a0 {

    class a extends l.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f12136a;

        a(Rect rect) {
            this.f12136a = rect;
        }
    }

    class b implements l.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f12138a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f12139b;

        b(View view, ArrayList arrayList) {
            this.f12138a = view;
            this.f12139b = arrayList;
        }

        public void a(l lVar) {
        }

        public void b(l lVar) {
        }

        public void c(l lVar) {
            lVar.W(this);
            lVar.a(this);
        }

        public void d(l lVar) {
        }

        public void e(l lVar) {
            lVar.W(this);
            this.f12138a.setVisibility(8);
            int size = this.f12139b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f12139b.get(i10)).setVisibility(0);
            }
        }
    }

    class c extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f12141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f12142b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f12143c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f12144d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f12145e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f12146f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f12141a = obj;
            this.f12142b = arrayList;
            this.f12143c = obj2;
            this.f12144d = arrayList2;
            this.f12145e = obj3;
            this.f12146f = arrayList3;
        }

        public void c(l lVar) {
            Object obj = this.f12141a;
            if (obj != null) {
                e.this.w(obj, this.f12142b, (ArrayList) null);
            }
            Object obj2 = this.f12143c;
            if (obj2 != null) {
                e.this.w(obj2, this.f12144d, (ArrayList) null);
            }
            Object obj3 = this.f12145e;
            if (obj3 != null) {
                e.this.w(obj3, this.f12146f, (ArrayList) null);
            }
        }

        public void e(l lVar) {
            lVar.W(this);
        }
    }

    class d implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f12148a;

        d(l lVar) {
            this.f12148a = lVar;
        }

        public void a() {
            this.f12148a.cancel();
        }
    }

    /* renamed from: i1.e$e  reason: collision with other inner class name */
    class C0158e implements l.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f12150a;

        C0158e(Runnable runnable) {
            this.f12150a = runnable;
        }

        public void a(l lVar) {
        }

        public void b(l lVar) {
        }

        public void c(l lVar) {
        }

        public void d(l lVar) {
        }

        public void e(l lVar) {
            this.f12150a.run();
        }
    }

    class f extends l.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f12152a;

        f(Rect rect) {
            this.f12152a = rect;
        }
    }

    private static boolean v(l lVar) {
        return !a0.i(lVar.F()) || !a0.i(lVar.G()) || !a0.i(lVar.I());
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((l) obj).b(view);
        }
    }

    public void b(Object obj, ArrayList arrayList) {
        l lVar = (l) obj;
        if (lVar != null) {
            int i10 = 0;
            if (lVar instanceof p) {
                p pVar = (p) lVar;
                int q02 = pVar.q0();
                while (i10 < q02) {
                    b(pVar.p0(i10), arrayList);
                    i10++;
                }
            } else if (!v(lVar) && a0.i(lVar.J())) {
                int size = arrayList.size();
                while (i10 < size) {
                    lVar.b((View) arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        n.a(viewGroup, (l) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof l;
    }

    public Object f(Object obj) {
        if (obj != null) {
            return ((l) obj).clone();
        }
        return null;
    }

    public Object j(Object obj, Object obj2, Object obj3) {
        l lVar = (l) obj;
        l lVar2 = (l) obj2;
        l lVar3 = (l) obj3;
        if (lVar != null && lVar2 != null) {
            lVar = new p().n0(lVar).n0(lVar2).v0(1);
        } else if (lVar == null) {
            lVar = lVar2 != null ? lVar2 : null;
        }
        if (lVar3 == null) {
            return lVar;
        }
        p pVar = new p();
        if (lVar != null) {
            pVar.n0(lVar);
        }
        pVar.n0(lVar3);
        return pVar;
    }

    public Object k(Object obj, Object obj2, Object obj3) {
        p pVar = new p();
        if (obj != null) {
            pVar.n0((l) obj);
        }
        if (obj2 != null) {
            pVar.n0((l) obj2);
        }
        if (obj3 != null) {
            pVar.n0((l) obj3);
        }
        return pVar;
    }

    public void m(Object obj, View view, ArrayList arrayList) {
        ((l) obj).a(new b(view, arrayList));
    }

    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((l) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((l) obj).c0(new f(rect));
        }
    }

    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((l) obj).c0(new a(rect));
        }
    }

    public void q(i iVar, Object obj, androidx.core.os.e eVar, Runnable runnable) {
        l lVar = (l) obj;
        eVar.c(new d(lVar));
        lVar.a(new C0158e(runnable));
    }

    public void s(Object obj, View view, ArrayList arrayList) {
        p pVar = (p) obj;
        List J = pVar.J();
        J.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a0.d(J, (View) arrayList.get(i10));
        }
        J.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }

    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.J().clear();
            pVar.J().addAll(arrayList2);
            w(pVar, arrayList, arrayList2);
        }
    }

    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.n0((l) obj);
        return pVar;
    }

    public void w(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        l lVar = (l) obj;
        int i10 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int q02 = pVar.q0();
            while (i10 < q02) {
                w(pVar.p0(i10), arrayList, arrayList2);
                i10++;
            }
        } else if (!v(lVar)) {
            List J = lVar.J();
            if (J.size() == arrayList.size() && J.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size) {
                    lVar.b((View) arrayList2.get(i10));
                    i10++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    lVar.X((View) arrayList.get(size2));
                }
            }
        }
    }
}
