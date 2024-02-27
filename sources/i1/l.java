package i1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.g;

public abstract class l implements Cloneable {
    private static final int[] J = {2, 1, 3, 4};
    private static final g K = new a();
    private static ThreadLocal L = new ThreadLocal();
    ArrayList A = new ArrayList();
    private int B = 0;
    private boolean C = false;
    private boolean D = false;
    private ArrayList E = null;
    private ArrayList F = new ArrayList();
    private e G;
    private o.a H;
    private g I = K;

    /* renamed from: e  reason: collision with root package name */
    private String f12159e = getClass().getName();

    /* renamed from: f  reason: collision with root package name */
    private long f12160f = -1;

    /* renamed from: g  reason: collision with root package name */
    long f12161g = -1;

    /* renamed from: h  reason: collision with root package name */
    private TimeInterpolator f12162h = null;

    /* renamed from: i  reason: collision with root package name */
    ArrayList f12163i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    ArrayList f12164j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private ArrayList f12165k = null;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList f12166l = null;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList f12167m = null;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList f12168n = null;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList f12169o = null;

    /* renamed from: p  reason: collision with root package name */
    private ArrayList f12170p = null;

    /* renamed from: q  reason: collision with root package name */
    private ArrayList f12171q = null;

    /* renamed from: r  reason: collision with root package name */
    private ArrayList f12172r = null;

    /* renamed from: s  reason: collision with root package name */
    private ArrayList f12173s = null;

    /* renamed from: t  reason: collision with root package name */
    private t f12174t = new t();

    /* renamed from: u  reason: collision with root package name */
    private t f12175u = new t();

    /* renamed from: v  reason: collision with root package name */
    p f12176v = null;

    /* renamed from: w  reason: collision with root package name */
    private int[] f12177w = J;

    /* renamed from: x  reason: collision with root package name */
    private ArrayList f12178x;

    /* renamed from: y  reason: collision with root package name */
    private ArrayList f12179y;

    /* renamed from: z  reason: collision with root package name */
    boolean f12180z = false;

    class a extends g {
        a() {
        }

        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o.a f12181a;

        b(o.a aVar) {
            this.f12181a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f12181a.remove(animator);
            l.this.A.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            l.this.A.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            l.this.r();
            animator.removeListener(this);
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        View f12184a;

        /* renamed from: b  reason: collision with root package name */
        String f12185b;

        /* renamed from: c  reason: collision with root package name */
        s f12186c;

        /* renamed from: d  reason: collision with root package name */
        p0 f12187d;

        /* renamed from: e  reason: collision with root package name */
        l f12188e;

        d(View view, String str, l lVar, p0 p0Var, s sVar) {
            this.f12184a = view;
            this.f12185b = str;
            this.f12186c = sVar;
            this.f12187d = p0Var;
            this.f12188e = lVar;
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(l lVar);

        void b(l lVar);

        void c(l lVar);

        void d(l lVar);

        void e(l lVar);
    }

    private static o.a C() {
        o.a aVar = (o.a) L.get();
        if (aVar != null) {
            return aVar;
        }
        o.a aVar2 = new o.a();
        L.set(aVar2);
        return aVar2;
    }

    private static boolean O(s sVar, s sVar2, String str) {
        Object obj = sVar.f12221a.get(str);
        Object obj2 = sVar2.f12221a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void P(o.a aVar, o.a aVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && N(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && N(view)) {
                s sVar = (s) aVar.get(view2);
                s sVar2 = (s) aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f12178x.add(sVar);
                    this.f12179y.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void Q(o.a aVar, o.a aVar2) {
        s sVar;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.i(size);
            if (view != null && N(view) && (sVar = (s) aVar2.remove(view)) != null && N(sVar.f12222b)) {
                this.f12178x.add((s) aVar.k(size));
                this.f12179y.add(sVar);
            }
        }
    }

    private void R(o.a aVar, o.a aVar2, o.d dVar, o.d dVar2) {
        View view;
        int k10 = dVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            View view2 = (View) dVar.m(i10);
            if (view2 != null && N(view2) && (view = (View) dVar2.d(dVar.g(i10))) != null && N(view)) {
                s sVar = (s) aVar.get(view2);
                s sVar2 = (s) aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f12178x.add(sVar);
                    this.f12179y.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void S(o.a aVar, o.a aVar2, o.a aVar3, o.a aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) aVar3.m(i10);
            if (view2 != null && N(view2) && (view = (View) aVar4.get(aVar3.i(i10))) != null && N(view)) {
                s sVar = (s) aVar.get(view2);
                s sVar2 = (s) aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f12178x.add(sVar);
                    this.f12179y.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void T(t tVar, t tVar2) {
        o.a aVar = new o.a((g) tVar.f12224a);
        o.a aVar2 = new o.a((g) tVar2.f12224a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f12177w;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 == 1) {
                    Q(aVar, aVar2);
                } else if (i11 == 2) {
                    S(aVar, aVar2, tVar.f12227d, tVar2.f12227d);
                } else if (i11 == 3) {
                    P(aVar, aVar2, tVar.f12225b, tVar2.f12225b);
                } else if (i11 == 4) {
                    R(aVar, aVar2, tVar.f12226c, tVar2.f12226c);
                }
                i10++;
            } else {
                c(aVar, aVar2);
                return;
            }
        }
    }

    private void Z(Animator animator, o.a aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            e(animator);
        }
    }

    private void c(o.a aVar, o.a aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            s sVar = (s) aVar.m(i10);
            if (N(sVar.f12222b)) {
                this.f12178x.add(sVar);
                this.f12179y.add((Object) null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            s sVar2 = (s) aVar2.m(i11);
            if (N(sVar2.f12222b)) {
                this.f12179y.add(sVar2);
                this.f12178x.add((Object) null);
            }
        }
    }

    private static void d(t tVar, View view, s sVar) {
        tVar.f12224a.put(view, sVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (tVar.f12225b.indexOfKey(id2) >= 0) {
                tVar.f12225b.put(id2, (Object) null);
            } else {
                tVar.f12225b.put(id2, view);
            }
        }
        String K2 = m0.K(view);
        if (K2 != null) {
            if (tVar.f12227d.containsKey(K2)) {
                tVar.f12227d.put(K2, (Object) null);
            } else {
                tVar.f12227d.put(K2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f12226c.f(itemIdAtPosition) >= 0) {
                    View view2 = (View) tVar.f12226c.d(itemIdAtPosition);
                    if (view2 != null) {
                        m0.A0(view2, false);
                        tVar.f12226c.h(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                m0.A0(view, true);
                tVar.f12226c.h(itemIdAtPosition, view);
            }
        }
    }

    private void g(View view, boolean z10) {
        if (view != null) {
            int id2 = view.getId();
            ArrayList arrayList = this.f12167m;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
                ArrayList arrayList2 = this.f12168n;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList arrayList3 = this.f12169o;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            if (!((Class) this.f12169o.get(i10)).isInstance(view)) {
                                i10++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        s sVar = new s(view);
                        if (z10) {
                            i(sVar);
                        } else {
                            f(sVar);
                        }
                        sVar.f12223c.add(this);
                        h(sVar);
                        d(z10 ? this.f12174t : this.f12175u, view, sVar);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList arrayList4 = this.f12171q;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                            ArrayList arrayList5 = this.f12172r;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList arrayList6 = this.f12173s;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        if (!((Class) this.f12173s.get(i11)).isInstance(view)) {
                                            i11++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                    g(viewGroup.getChildAt(i12), z10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public o A() {
        return null;
    }

    public long D() {
        return this.f12160f;
    }

    public List F() {
        return this.f12163i;
    }

    public List G() {
        return this.f12165k;
    }

    public List I() {
        return this.f12166l;
    }

    public List J() {
        return this.f12164j;
    }

    public String[] K() {
        return null;
    }

    public s L(View view, boolean z10) {
        p pVar = this.f12176v;
        if (pVar != null) {
            return pVar.L(view, z10);
        }
        return (s) (z10 ? this.f12174t : this.f12175u).f12224a.get(view);
    }

    public boolean M(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] K2 = K();
        if (K2 != null) {
            int length = K2.length;
            int i10 = 0;
            while (i10 < length) {
                if (!O(sVar, sVar2, K2[i10])) {
                    i10++;
                }
            }
            return false;
        }
        for (String O : sVar.f12221a.keySet()) {
            if (O(sVar, sVar2, O)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean N(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f12167m;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f12168n;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f12169o;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f12169o.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f12170p != null && m0.K(view) != null && this.f12170p.contains(m0.K(view))) {
            return false;
        }
        if ((this.f12163i.size() == 0 && this.f12164j.size() == 0 && (((arrayList = this.f12166l) == null || arrayList.isEmpty()) && ((arrayList2 = this.f12165k) == null || arrayList2.isEmpty()))) || this.f12163i.contains(Integer.valueOf(id2)) || this.f12164j.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f12165k;
        if (arrayList6 != null && arrayList6.contains(m0.K(view))) {
            return true;
        }
        if (this.f12166l != null) {
            for (int i11 = 0; i11 < this.f12166l.size(); i11++) {
                if (((Class) this.f12166l.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void U(View view) {
        if (!this.D) {
            for (int size = this.A.size() - 1; size >= 0; size--) {
                a.b((Animator) this.A.get(size));
            }
            ArrayList arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((f) arrayList2.get(i10)).b(this);
                }
            }
            this.C = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: i1.s} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V(android.view.ViewGroup r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f12178x = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f12179y = r0
            i1.t r0 = r10.f12174t
            i1.t r1 = r10.f12175u
            r10.T(r0, r1)
            o.a r0 = C()
            int r1 = r0.size()
            i1.p0 r2 = i1.a0.d(r11)
            r3 = 1
            int r1 = r1 - r3
        L_0x0023:
            if (r1 < 0) goto L_0x007f
            java.lang.Object r4 = r0.i(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x007c
            java.lang.Object r5 = r0.get(r4)
            i1.l$d r5 = (i1.l.d) r5
            if (r5 == 0) goto L_0x007c
            android.view.View r6 = r5.f12184a
            if (r6 == 0) goto L_0x007c
            i1.p0 r6 = r5.f12187d
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x007c
            i1.s r6 = r5.f12186c
            android.view.View r7 = r5.f12184a
            i1.s r8 = r10.L(r7, r3)
            i1.s r9 = r10.w(r7, r3)
            if (r8 != 0) goto L_0x005c
            if (r9 != 0) goto L_0x005c
            i1.t r9 = r10.f12175u
            o.a r9 = r9.f12224a
            java.lang.Object r7 = r9.get(r7)
            r9 = r7
            i1.s r9 = (i1.s) r9
        L_0x005c:
            if (r8 != 0) goto L_0x0060
            if (r9 == 0) goto L_0x007c
        L_0x0060:
            i1.l r5 = r5.f12188e
            boolean r5 = r5.M(r6, r9)
            if (r5 == 0) goto L_0x007c
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x0079
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x0075
            goto L_0x0079
        L_0x0075:
            r0.remove(r4)
            goto L_0x007c
        L_0x0079:
            r4.cancel()
        L_0x007c:
            int r1 = r1 + -1
            goto L_0x0023
        L_0x007f:
            i1.t r6 = r10.f12174t
            i1.t r7 = r10.f12175u
            java.util.ArrayList r8 = r10.f12178x
            java.util.ArrayList r9 = r10.f12179y
            r4 = r10
            r5 = r11
            r4.q(r5, r6, r7, r8, r9)
            r10.a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.l.V(android.view.ViewGroup):void");
    }

    public l W(f fVar) {
        ArrayList arrayList = this.E;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.E.size() == 0) {
            this.E = null;
        }
        return this;
    }

    public l X(View view) {
        this.f12164j.remove(view);
        return this;
    }

    public void Y(View view) {
        if (this.C) {
            if (!this.D) {
                for (int size = this.A.size() - 1; size >= 0; size--) {
                    a.c((Animator) this.A.get(size));
                }
                ArrayList arrayList = this.E;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.E.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((f) arrayList2.get(i10)).d(this);
                    }
                }
            }
            this.C = false;
        }
    }

    public l a(f fVar) {
        if (this.E == null) {
            this.E = new ArrayList();
        }
        this.E.add(fVar);
        return this;
    }

    /* access modifiers changed from: protected */
    public void a0() {
        h0();
        o.a C2 = C();
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (C2.containsKey(animator)) {
                h0();
                Z(animator, C2);
            }
        }
        this.F.clear();
        r();
    }

    public l b(View view) {
        this.f12164j.add(view);
        return this;
    }

    public l b0(long j10) {
        this.f12161g = j10;
        return this;
    }

    public void c0(e eVar) {
        this.G = eVar;
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.A.size() - 1; size >= 0; size--) {
            ((Animator) this.A.get(size)).cancel();
        }
        ArrayList arrayList = this.E;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.E.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((f) arrayList2.get(i10)).a(this);
            }
        }
    }

    public l d0(TimeInterpolator timeInterpolator) {
        this.f12162h = timeInterpolator;
        return this;
    }

    /* access modifiers changed from: protected */
    public void e(Animator animator) {
        if (animator == null) {
            r();
            return;
        }
        if (t() >= 0) {
            animator.setDuration(t());
        }
        if (D() >= 0) {
            animator.setStartDelay(D() + animator.getStartDelay());
        }
        if (v() != null) {
            animator.setInterpolator(v());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void e0(g gVar) {
        if (gVar == null) {
            gVar = K;
        }
        this.I = gVar;
    }

    public abstract void f(s sVar);

    public void f0(o oVar) {
    }

    public l g0(long j10) {
        this.f12160f = j10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void h(s sVar) {
    }

    /* access modifiers changed from: protected */
    public void h0() {
        if (this.B == 0) {
            ArrayList arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).c(this);
                }
            }
            this.D = false;
        }
        this.B++;
    }

    public abstract void i(s sVar);

    /* access modifiers changed from: package-private */
    public void j(ViewGroup viewGroup, boolean z10) {
        o.a aVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        k(z10);
        if ((this.f12163i.size() > 0 || this.f12164j.size() > 0) && (((arrayList = this.f12165k) == null || arrayList.isEmpty()) && ((arrayList2 = this.f12166l) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f12163i.size(); i10++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f12163i.get(i10)).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z10) {
                        i(sVar);
                    } else {
                        f(sVar);
                    }
                    sVar.f12223c.add(this);
                    h(sVar);
                    d(z10 ? this.f12174t : this.f12175u, findViewById, sVar);
                }
            }
            for (int i11 = 0; i11 < this.f12164j.size(); i11++) {
                View view = (View) this.f12164j.get(i11);
                s sVar2 = new s(view);
                if (z10) {
                    i(sVar2);
                } else {
                    f(sVar2);
                }
                sVar2.f12223c.add(this);
                h(sVar2);
                d(z10 ? this.f12174t : this.f12175u, view, sVar2);
            }
        } else {
            g(viewGroup, z10);
        }
        if (!z10 && (aVar = this.H) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList3.add(this.f12174t.f12227d.remove((String) this.H.i(i12)));
            }
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) arrayList3.get(i13);
                if (view2 != null) {
                    this.f12174t.f12227d.put((String) this.H.m(i13), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(boolean z10) {
        t tVar;
        if (z10) {
            this.f12174t.f12224a.clear();
            this.f12174t.f12225b.clear();
            tVar = this.f12174t;
        } else {
            this.f12175u.f12224a.clear();
            this.f12175u.f12225b.clear();
            tVar = this.f12175u;
        }
        tVar.f12226c.a();
    }

    /* access modifiers changed from: package-private */
    public String k0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f12161g != -1) {
            str2 = str2 + "dur(" + this.f12161g + ") ";
        }
        if (this.f12160f != -1) {
            str2 = str2 + "dly(" + this.f12160f + ") ";
        }
        if (this.f12162h != null) {
            str2 = str2 + "interp(" + this.f12162h + ") ";
        }
        if (this.f12163i.size() <= 0 && this.f12164j.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f12163i.size() > 0) {
            for (int i10 = 0; i10 < this.f12163i.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f12163i.get(i10);
            }
        }
        if (this.f12164j.size() > 0) {
            for (int i11 = 0; i11 < this.f12164j.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f12164j.get(i11);
            }
        }
        return str3 + ")";
    }

    /* renamed from: m */
    public l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.F = new ArrayList();
            lVar.f12174t = new t();
            lVar.f12175u = new t();
            lVar.f12178x = null;
            lVar.f12179y = null;
            return lVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        Animator animator;
        s sVar;
        View view;
        s sVar2;
        Animator animator2;
        o.a C2 = C();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            s sVar3 = (s) arrayList.get(i11);
            s sVar4 = (s) arrayList2.get(i11);
            if (sVar3 != null && !sVar3.f12223c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f12223c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null) && (sVar3 == null || sVar4 == null || M(sVar3, sVar4))) {
                Animator p10 = p(viewGroup, sVar3, sVar4);
                if (p10 != null) {
                    if (sVar4 != null) {
                        View view2 = sVar4.f12222b;
                        String[] K2 = K();
                        if (K2 != null && K2.length > 0) {
                            sVar2 = new s(view2);
                            s sVar5 = (s) tVar2.f12224a.get(view2);
                            if (sVar5 != null) {
                                int i12 = 0;
                                while (i12 < K2.length) {
                                    Map map = sVar2.f12221a;
                                    Animator animator3 = p10;
                                    String str = K2[i12];
                                    map.put(str, sVar5.f12221a.get(str));
                                    i12++;
                                    p10 = animator3;
                                    K2 = K2;
                                }
                            }
                            Animator animator4 = p10;
                            int size2 = C2.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                d dVar = (d) C2.get((Animator) C2.i(i13));
                                if (dVar.f12186c != null && dVar.f12184a == view2 && dVar.f12185b.equals(x()) && dVar.f12186c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            t tVar3 = tVar2;
                            animator2 = p10;
                            sVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        t tVar4 = tVar2;
                        view = sVar3.f12222b;
                        animator = p10;
                        sVar = null;
                    }
                    if (animator != null) {
                        i10 = size;
                        d dVar2 = r0;
                        d dVar3 = new d(view, x(), this, a0.d(viewGroup), sVar);
                        C2.put(animator, dVar2);
                        this.F.add(animator);
                        i11++;
                        size = i10;
                    }
                    i10 = size;
                    i11++;
                    size = i10;
                }
            } else {
                ViewGroup viewGroup2 = viewGroup;
            }
            t tVar5 = tVar2;
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator5 = (Animator) this.F.get(sparseIntArray.keyAt(i14));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i14)) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void r() {
        int i10 = this.B - 1;
        this.B = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).e(this);
                }
            }
            for (int i12 = 0; i12 < this.f12174t.f12226c.k(); i12++) {
                View view = (View) this.f12174t.f12226c.m(i12);
                if (view != null) {
                    m0.A0(view, false);
                }
            }
            for (int i13 = 0; i13 < this.f12175u.f12226c.k(); i13++) {
                View view2 = (View) this.f12175u.f12226c.m(i13);
                if (view2 != null) {
                    m0.A0(view2, false);
                }
            }
            this.D = true;
        }
    }

    public long t() {
        return this.f12161g;
    }

    public String toString() {
        return k0("");
    }

    public e u() {
        return this.G;
    }

    public TimeInterpolator v() {
        return this.f12162h;
    }

    /* access modifiers changed from: package-private */
    public s w(View view, boolean z10) {
        p pVar = this.f12176v;
        if (pVar != null) {
            return pVar.w(view, z10);
        }
        ArrayList arrayList = z10 ? this.f12178x : this.f12179y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            s sVar = (s) arrayList.get(i10);
            if (sVar == null) {
                return null;
            }
            if (sVar.f12222b == view) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return null;
        }
        return (s) (z10 ? this.f12179y : this.f12178x).get(i10);
    }

    public String x() {
        return this.f12159e;
    }

    public g z() {
        return this.I;
    }
}
