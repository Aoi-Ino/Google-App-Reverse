package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.m0;
import androidx.core.view.p0;
import androidx.fragment.app.f0;
import androidx.fragment.app.k;
import cm.l;
import cm.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pl.o;
import pl.t;

public final class f extends f0 {

    private static final class a extends b {

        /* renamed from: c  reason: collision with root package name */
        private final boolean f2970c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2971d;

        /* renamed from: e  reason: collision with root package name */
        private k.a f2972e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f0.c cVar, androidx.core.os.e eVar, boolean z10) {
            super(cVar, eVar);
            l.f(cVar, "operation");
            l.f(eVar, "signal");
            this.f2970c = z10;
        }

        public final k.a e(Context context) {
            l.f(context, "context");
            if (this.f2971d) {
                return this.f2972e;
            }
            k.a b10 = k.b(context, b().h(), b().g() == f0.c.b.VISIBLE, this.f2970c);
            this.f2972e = b10;
            this.f2971d = true;
            return b10;
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final f0.c f2973a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.os.e f2974b;

        public b(f0.c cVar, androidx.core.os.e eVar) {
            l.f(cVar, "operation");
            l.f(eVar, "signal");
            this.f2973a = cVar;
            this.f2974b = eVar;
        }

        public final void a() {
            this.f2973a.f(this.f2974b);
        }

        public final f0.c b() {
            return this.f2973a;
        }

        public final androidx.core.os.e c() {
            return this.f2974b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x001b, code lost:
            r2 = androidx.fragment.app.f0.c.b.VISIBLE;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean d() {
            /*
                r3 = this;
                androidx.fragment.app.f0$c$b$a r0 = androidx.fragment.app.f0.c.b.f3006e
                androidx.fragment.app.f0$c r1 = r3.f2973a
                androidx.fragment.app.i r1 = r1.h()
                android.view.View r1 = r1.M
                java.lang.String r2 = "operation.fragment.mView"
                cm.l.e(r1, r2)
                androidx.fragment.app.f0$c$b r0 = r0.a(r1)
                androidx.fragment.app.f0$c r1 = r3.f2973a
                androidx.fragment.app.f0$c$b r1 = r1.g()
                if (r0 == r1) goto L_0x0024
                androidx.fragment.app.f0$c$b r2 = androidx.fragment.app.f0.c.b.VISIBLE
                if (r0 == r2) goto L_0x0022
                if (r1 == r2) goto L_0x0022
                goto L_0x0024
            L_0x0022:
                r0 = 0
                goto L_0x0025
            L_0x0024:
                r0 = 1
            L_0x0025:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f.b.d():boolean");
        }
    }

    private static final class c extends b {

        /* renamed from: c  reason: collision with root package name */
        private final Object f2975c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f2976d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f2977e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(f0.c cVar, androidx.core.os.e eVar, boolean z10, boolean z11) {
            super(cVar, eVar);
            Object obj;
            boolean z12;
            Object obj2;
            l.f(cVar, "operation");
            l.f(eVar, "signal");
            f0.c.b g10 = cVar.g();
            f0.c.b bVar = f0.c.b.VISIBLE;
            if (g10 == bVar) {
                i h10 = cVar.h();
                obj = z10 ? h10.U() : h10.z();
            } else {
                i h11 = cVar.h();
                obj = z10 ? h11.W() : h11.C();
            }
            this.f2975c = obj;
            if (cVar.g() == bVar) {
                i h12 = cVar.h();
                z12 = z10 ? h12.s() : h12.r();
            } else {
                z12 = true;
            }
            this.f2976d = z12;
            if (z11) {
                i h13 = cVar.h();
                obj2 = z10 ? h13.Z() : h13.Y();
            } else {
                obj2 = null;
            }
            this.f2977e = obj2;
        }

        private final a0 f(Object obj) {
            if (obj == null) {
                return null;
            }
            a0 a0Var = y.f3234b;
            if (a0Var != null && a0Var.e(obj)) {
                return a0Var;
            }
            a0 a0Var2 = y.f3235c;
            if (a0Var2 != null && a0Var2.e(obj)) {
                return a0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final a0 e() {
            a0 f10 = f(this.f2975c);
            a0 f11 = f(this.f2977e);
            if (f10 == null || f11 == null || f10 == f11) {
                return f10 == null ? f11 : f10;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().h() + " returned Transition " + this.f2975c + " which uses a different Transition  type than its shared element transition " + this.f2977e).toString());
        }

        public final Object g() {
            return this.f2977e;
        }

        public final Object h() {
            return this.f2975c;
        }

        public final boolean i() {
            return this.f2977e != null;
        }

        public final boolean j() {
            return this.f2976d;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Collection f2978e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Collection collection) {
            super(1);
            this.f2978e = collection;
        }

        /* renamed from: b */
        public final Boolean invoke(Map.Entry entry) {
            l.f(entry, "entry");
            return Boolean.valueOf(y.R(this.f2978e, m0.K((View) entry.getValue())));
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f2979a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2980b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f2981c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f0.c f2982d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f2983e;

        e(f fVar, View view, boolean z10, f0.c cVar, a aVar) {
            this.f2979a = fVar;
            this.f2980b = view;
            this.f2981c = z10;
            this.f2982d = cVar;
            this.f2983e = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            l.f(animator, "anim");
            this.f2979a.q().endViewTransition(this.f2980b);
            if (this.f2981c) {
                f0.c.b g10 = this.f2982d.g();
                View view = this.f2980b;
                l.e(view, "viewToAnimate");
                g10.b(view);
            }
            this.f2983e.a();
            if (q.J0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f2982d + " has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.f$f  reason: collision with other inner class name */
    public static final class C0050f implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f0.c f2984a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f2985b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f2986c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f2987d;

        C0050f(f0.c cVar, f fVar, View view, a aVar) {
            this.f2984a = cVar;
            this.f2985b = fVar;
            this.f2986c = view;
            this.f2987d = aVar;
        }

        /* access modifiers changed from: private */
        public static final void b(f fVar, View view, a aVar) {
            l.f(fVar, "this$0");
            l.f(aVar, "$animationInfo");
            fVar.q().endViewTransition(view);
            aVar.a();
        }

        public void onAnimationEnd(Animation animation) {
            l.f(animation, "animation");
            this.f2985b.q().post(new g(this.f2985b, this.f2986c, this.f2987d));
            if (q.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f2984a + " has ended.");
            }
        }

        public void onAnimationRepeat(Animation animation) {
            l.f(animation, "animation");
        }

        public void onAnimationStart(Animation animation) {
            l.f(animation, "animation");
            if (q.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f2984a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(ViewGroup viewGroup) {
        super(viewGroup);
        l.f(viewGroup, "container");
    }

    private final void D(f0.c cVar) {
        View view = cVar.h().M;
        f0.c.b g10 = cVar.g();
        l.e(view, "view");
        g10.b(view);
    }

    private final void E(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!p0.a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        l.e(childAt, "child");
                        E(arrayList, childAt);
                    }
                }
                return;
            } else if (arrayList.contains(view)) {
                return;
            }
        } else if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: private */
    public static final void F(List list, f0.c cVar, f fVar) {
        l.f(list, "$awaitingContainerChanges");
        l.f(cVar, "$operation");
        l.f(fVar, "this$0");
        if (list.contains(cVar)) {
            list.remove(cVar);
            fVar.D(cVar);
        }
    }

    private final void G(Map map, View view) {
        String K = m0.K(view);
        if (K != null) {
            map.put(K, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    l.e(childAt, "child");
                    G(map, childAt);
                }
            }
        }
    }

    private final void H(o.a aVar, Collection collection) {
        Set entrySet = aVar.entrySet();
        l.e(entrySet, "entries");
        boolean unused = v.E(entrySet, new d(collection));
    }

    private final void I(List list, List list2, boolean z10, Map map) {
        StringBuilder sb2;
        String str;
        Context context = q().getContext();
        ArrayList<a> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!aVar.d()) {
                l.e(context, "context");
                k.a e10 = aVar.e(context);
                if (e10 != null) {
                    Animator animator = e10.f3099b;
                    if (animator == null) {
                        arrayList.add(aVar);
                        Map map2 = map;
                    } else {
                        f0.c b10 = aVar.b();
                        i h10 = b10.h();
                        if (l.a(map.get(b10), Boolean.TRUE)) {
                            if (q.J0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + h10 + " as this Fragment was involved in a Transition.");
                            }
                            aVar.a();
                        } else {
                            boolean z12 = b10.g() == f0.c.b.GONE;
                            List list3 = list2;
                            if (z12) {
                                list3.remove(b10);
                            }
                            View view = h10.M;
                            q().startViewTransition(view);
                            e eVar = r0;
                            View view2 = view;
                            f0.c cVar = b10;
                            e eVar2 = new e(this, view2, z12, b10, aVar);
                            animator.addListener(eVar2);
                            animator.setTarget(view2);
                            animator.start();
                            if (q.J0(2)) {
                                Log.v("FragmentManager", "Animator from operation " + cVar + " has started.");
                            }
                            aVar.c().c(new n0.e(animator, cVar));
                            z11 = true;
                        }
                    }
                }
            }
            aVar.a();
            Map map22 = map;
        }
        for (a aVar2 : arrayList) {
            f0.c b11 = aVar2.b();
            i h11 = b11.h();
            if (z10) {
                if (q.J0(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(h11);
                    str = " as Animations cannot run alongside Transitions.";
                }
                aVar2.a();
            } else if (z11) {
                if (q.J0(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(h11);
                    str = " as Animations cannot run alongside Animators.";
                }
                aVar2.a();
            } else {
                View view3 = h11.M;
                l.e(context, "context");
                k.a e11 = aVar2.e(context);
                if (e11 != null) {
                    Animation animation = e11.f3098a;
                    if (animation != null) {
                        if (b11.g() != f0.c.b.REMOVED) {
                            view3.startAnimation(animation);
                            aVar2.a();
                        } else {
                            q().startViewTransition(view3);
                            k.b bVar = new k.b(animation, q(), view3);
                            bVar.setAnimationListener(new C0050f(b11, this, view3, aVar2));
                            view3.startAnimation(bVar);
                            if (q.J0(2)) {
                                Log.v("FragmentManager", "Animation from operation " + b11 + " has started.");
                            }
                        }
                        aVar2.c().c(new e(view3, this, aVar2, b11));
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            sb2.append(str);
            Log.v("FragmentManager", sb2.toString());
            aVar2.a();
        }
    }

    /* access modifiers changed from: private */
    public static final void J(Animator animator, f0.c cVar) {
        l.f(cVar, "$operation");
        animator.end();
        if (q.J0(2)) {
            Log.v("FragmentManager", "Animator from operation " + cVar + " has been canceled.");
        }
    }

    /* access modifiers changed from: private */
    public static final void K(View view, f fVar, a aVar, f0.c cVar) {
        l.f(fVar, "this$0");
        l.f(aVar, "$animationInfo");
        l.f(cVar, "$operation");
        view.clearAnimation();
        fVar.q().endViewTransition(view);
        aVar.a();
        if (q.J0(2)) {
            Log.v("FragmentManager", "Animation from operation " + cVar + " has been cancelled.");
        }
    }

    private final Map L(List list, List list2, boolean z10, f0.c cVar, f0.c cVar2) {
        String str;
        String str2;
        f0.c b10;
        Object obj;
        String str3;
        Object obj2;
        View view;
        boolean z11;
        View view2;
        Object obj3;
        f0.c cVar3;
        Object obj4;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        View view3;
        Rect rect;
        Object obj5;
        View view4;
        View view5;
        f fVar = this;
        boolean z12 = z10;
        f0.c cVar4 = cVar;
        f0.c cVar5 = cVar2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : list) {
            if (!((c) next).d()) {
                arrayList2.add(next);
            }
        }
        ArrayList<c> arrayList3 = new ArrayList<>();
        for (Object next2 : arrayList2) {
            if (((c) next2).e() != null) {
                arrayList3.add(next2);
            }
        }
        a0 a0Var = null;
        for (c cVar6 : arrayList3) {
            a0 e10 = cVar6.e();
            if (a0Var == null || e10 == a0Var) {
                a0Var = e10;
            } else {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + cVar6.b().h() + " returned Transition " + cVar6.h() + " which uses a different Transition type than other Fragments.").toString());
            }
        }
        if (a0Var == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar7 = (c) it.next();
                linkedHashMap2.put(cVar7.b(), Boolean.FALSE);
                cVar7.a();
            }
            return linkedHashMap2;
        }
        View view6 = new View(q().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        o.a aVar = new o.a();
        Iterator it2 = list.iterator();
        View view7 = null;
        Object obj6 = null;
        boolean z13 = false;
        while (true) {
            str = "FragmentManager";
            if (!it2.hasNext()) {
                break;
            }
            c cVar8 = (c) it2.next();
            if (!cVar8.i() || cVar4 == null || cVar5 == null) {
                rect = rect2;
                view6 = view6;
                linkedHashMap2 = linkedHashMap2;
                arrayList4 = arrayList4;
                view7 = view7;
                aVar = aVar;
                arrayList5 = arrayList5;
            } else {
                Object u10 = a0Var.u(a0Var.f(cVar8.g()));
                ArrayList a02 = cVar2.h().a0();
                l.e(a02, "lastIn.fragment.sharedElementSourceNames");
                ArrayList a03 = cVar.h().a0();
                View view8 = view7;
                l.e(a03, "firstOut.fragment.sharedElementSourceNames");
                ArrayList c02 = cVar.h().c0();
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                l.e(c02, "firstOut.fragment.sharedElementTargetNames");
                int size = c02.size();
                View view9 = view6;
                int i10 = 0;
                while (i10 < size) {
                    int i11 = size;
                    int indexOf = a02.indexOf(c02.get(i10));
                    ArrayList arrayList6 = c02;
                    if (indexOf != -1) {
                        a02.set(indexOf, a03.get(i10));
                    }
                    i10++;
                    size = i11;
                    c02 = arrayList6;
                }
                ArrayList c03 = cVar2.h().c0();
                l.e(c03, "lastIn.fragment.sharedElementTargetNames");
                if (!z12) {
                    cVar.h().D();
                    cVar2.h().A();
                    obj5 = null;
                } else {
                    obj5 = null;
                    cVar.h().A();
                    cVar2.h().D();
                }
                o a10 = t.a(obj5, obj5);
                android.support.v4.media.session.b.a(a10.a());
                android.support.v4.media.session.b.a(a10.b());
                int i12 = 0;
                for (int size2 = a02.size(); i12 < size2; size2 = size2) {
                    aVar.put((String) a02.get(i12), (String) c03.get(i12));
                    i12++;
                }
                if (q.J0(2)) {
                    Log.v(str, ">>> entering view names <<<");
                    for (Iterator it3 = c03.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v(str, "Name: " + ((String) it3.next()));
                    }
                    Log.v(str, ">>> exiting view names <<<");
                    for (Iterator it4 = a02.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v(str, "Name: " + ((String) it4.next()));
                    }
                }
                o.a aVar2 = new o.a();
                View view10 = cVar.h().M;
                l.e(view10, "firstOut.fragment.mView");
                fVar.G(aVar2, view10);
                aVar2.o(a02);
                aVar.o(aVar2.keySet());
                o.a aVar3 = new o.a();
                View view11 = cVar2.h().M;
                l.e(view11, "lastIn.fragment.mView");
                fVar.G(aVar3, view11);
                aVar3.o(c03);
                aVar3.o(aVar.values());
                y.c(aVar, aVar3);
                Set keySet = aVar.keySet();
                l.e(keySet, "sharedElementNameMapping.keys");
                fVar.H(aVar2, keySet);
                Collection values = aVar.values();
                l.e(values, "sharedElementNameMapping.values");
                fVar.H(aVar3, values);
                if (aVar.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    view7 = view8;
                    linkedHashMap2 = linkedHashMap3;
                    view6 = view9;
                    obj6 = null;
                } else {
                    o.a aVar4 = aVar;
                    y.a(cVar2.h(), cVar.h(), z12, aVar2, true);
                    androidx.core.view.f0.a(q(), new n0.b(cVar5, cVar4, z12, aVar3));
                    arrayList4.addAll(aVar2.values());
                    if (!a02.isEmpty()) {
                        view4 = (View) aVar2.get((String) a02.get(0));
                        a0Var.p(u10, view4);
                    } else {
                        view4 = view8;
                    }
                    arrayList5.addAll(aVar3.values());
                    if ((!c03.isEmpty()) && (view5 = (View) aVar3.get((String) c03.get(0))) != null) {
                        androidx.core.view.f0.a(q(), new n0.c(a0Var, view5, rect2));
                        z13 = true;
                    }
                    View view12 = view9;
                    a0Var.s(u10, view12, arrayList4);
                    Object obj7 = u10;
                    o.a aVar5 = aVar4;
                    ArrayList arrayList7 = arrayList5;
                    rect = rect2;
                    a0Var.n(u10, (Object) null, (ArrayList) null, (Object) null, (ArrayList) null, obj7, arrayList7);
                    Boolean bool = Boolean.TRUE;
                    LinkedHashMap linkedHashMap4 = linkedHashMap3;
                    linkedHashMap4.put(cVar4, bool);
                    linkedHashMap4.put(cVar5, bool);
                    view7 = view4;
                    arrayList4 = arrayList4;
                    obj6 = obj7;
                    aVar = aVar5;
                    arrayList5 = arrayList7;
                    view6 = view12;
                    linkedHashMap2 = linkedHashMap4;
                }
            }
            rect2 = rect;
        }
        View view13 = view7;
        o.a aVar6 = aVar;
        ArrayList arrayList8 = arrayList5;
        ArrayList arrayList9 = arrayList4;
        Rect rect3 = rect2;
        boolean z14 = true;
        LinkedHashMap linkedHashMap5 = linkedHashMap2;
        View view14 = view6;
        ArrayList arrayList10 = new ArrayList();
        Iterator it5 = list.iterator();
        Object obj8 = null;
        Object obj9 = null;
        while (it5.hasNext()) {
            c cVar9 = (c) it5.next();
            if (cVar9.d()) {
                b10 = cVar9.b();
            } else {
                Object f10 = a0Var.f(cVar9.h());
                b10 = cVar9.b();
                boolean z15 = (obj6 == null || !(b10 == cVar4 || b10 == cVar5)) ? false : z14;
                if (f10 != null) {
                    LinkedHashMap linkedHashMap6 = linkedHashMap5;
                    ArrayList arrayList11 = new ArrayList();
                    View view15 = b10.h().M;
                    Iterator it6 = it5;
                    l.e(view15, "operation.fragment.mView");
                    fVar.E(arrayList11, view15);
                    if (z15) {
                        arrayList11.removeAll(b10 == cVar4 ? y.x0(arrayList9) : y.x0(arrayList8));
                    }
                    if (arrayList11.isEmpty()) {
                        a0Var.a(f10, view14);
                        view2 = view14;
                        obj3 = f10;
                        obj2 = obj6;
                        str3 = str;
                        obj = obj8;
                        obj4 = obj9;
                        arrayList = arrayList11;
                        view = view13;
                        linkedHashMap = linkedHashMap6;
                        z11 = true;
                        cVar3 = b10;
                        List list3 = list2;
                    } else {
                        a0Var.b(f10, arrayList11);
                        f0.c cVar10 = b10;
                        view = view13;
                        Object obj10 = f10;
                        obj2 = obj6;
                        str3 = str;
                        z11 = true;
                        obj = obj8;
                        obj4 = obj9;
                        view2 = view14;
                        arrayList = arrayList11;
                        linkedHashMap = linkedHashMap6;
                        a0Var.n(f10, obj10, arrayList11, (Object) null, (ArrayList) null, (Object) null, (ArrayList) null);
                        if (cVar10.g() == f0.c.b.GONE) {
                            cVar3 = cVar10;
                            list2.remove(cVar3);
                            ArrayList arrayList12 = new ArrayList(arrayList);
                            arrayList12.remove(cVar3.h().M);
                            obj3 = obj10;
                            a0Var.m(obj3, cVar3.h().M, arrayList12);
                            androidx.core.view.f0.a(q(), new n0.d(arrayList));
                        } else {
                            List list4 = list2;
                            obj3 = obj10;
                            cVar3 = cVar10;
                        }
                    }
                    if (cVar3.g() == f0.c.b.VISIBLE) {
                        arrayList10.addAll(arrayList);
                        if (z13) {
                            a0Var.o(obj3, rect3);
                        }
                        view3 = view;
                    } else {
                        view3 = view;
                        a0Var.p(obj3, view3);
                    }
                    linkedHashMap.put(cVar3, Boolean.TRUE);
                    if (cVar9.j()) {
                        obj9 = a0Var.k(obj4, obj3, (Object) null);
                        it5 = it6;
                        linkedHashMap5 = linkedHashMap;
                        view13 = view3;
                        view14 = view2;
                        z14 = z11;
                        obj6 = obj2;
                        str = str3;
                        obj8 = obj;
                        fVar = this;
                    } else {
                        obj8 = a0Var.k(obj, obj3, (Object) null);
                        linkedHashMap5 = linkedHashMap;
                        view13 = view3;
                        obj9 = obj4;
                        view14 = view2;
                        z14 = z11;
                        obj6 = obj2;
                        str = str3;
                        fVar = this;
                        it5 = it6;
                    }
                } else if (z15) {
                }
            }
            linkedHashMap5.put(b10, Boolean.FALSE);
            cVar9.a();
        }
        String str4 = str;
        boolean z16 = z14;
        Object obj11 = obj9;
        LinkedHashMap linkedHashMap7 = linkedHashMap5;
        Object obj12 = obj6;
        Object j10 = a0Var.j(obj11, obj8, obj12);
        if (j10 == null) {
            return linkedHashMap7;
        }
        ArrayList<c> arrayList13 = new ArrayList<>();
        for (Object next3 : list) {
            if (!((c) next3).d()) {
                arrayList13.add(next3);
            }
        }
        for (c cVar11 : arrayList13) {
            Object h10 = cVar11.h();
            f0.c b11 = cVar11.b();
            boolean z17 = (obj12 == null || !(b11 == cVar4 || b11 == cVar5)) ? false : z16;
            if (h10 == null && !z17) {
                str2 = str4;
            } else if (!m0.U(q())) {
                if (q.J0(2)) {
                    str2 = str4;
                    Log.v(str2, "SpecialEffectsController: Container " + q() + " has not been laid out. Completing operation " + b11);
                } else {
                    str2 = str4;
                }
                cVar11.a();
            } else {
                str2 = str4;
                a0Var.q(cVar11.b().h(), j10, cVar11.c(), new d(cVar11, b11));
            }
            str4 = str2;
        }
        String str5 = str4;
        if (!m0.U(q())) {
            return linkedHashMap7;
        }
        y.d(arrayList10, 4);
        ArrayList arrayList14 = arrayList8;
        ArrayList l10 = a0Var.l(arrayList14);
        if (q.J0(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it7 = arrayList9.iterator();
            while (it7.hasNext()) {
                Object next4 = it7.next();
                l.e(next4, "sharedElementFirstOutViews");
                View view16 = (View) next4;
                Log.v(str5, "View: " + view16 + " Name: " + m0.K(view16));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            Iterator it8 = arrayList14.iterator();
            while (it8.hasNext()) {
                Object next5 = it8.next();
                l.e(next5, "sharedElementLastInViews");
                View view17 = (View) next5;
                Log.v(str5, "View: " + view17 + " Name: " + m0.K(view17));
            }
        }
        a0Var.c(q(), j10);
        a0Var.r(q(), arrayList9, arrayList14, l10, aVar6);
        y.d(arrayList10, 0);
        a0Var.t(obj12, arrayList9, arrayList14);
        return linkedHashMap7;
    }

    /* access modifiers changed from: private */
    public static final void M(a0 a0Var, View view, Rect rect) {
        l.f(a0Var, "$impl");
        l.f(rect, "$lastInEpicenterRect");
        a0Var.h(view, rect);
    }

    /* access modifiers changed from: private */
    public static final void N(ArrayList arrayList) {
        l.f(arrayList, "$transitioningViews");
        y.d(arrayList, 4);
    }

    /* access modifiers changed from: private */
    public static final void O(c cVar, f0.c cVar2) {
        l.f(cVar, "$transitionInfo");
        l.f(cVar2, "$operation");
        cVar.a();
        if (q.J0(2)) {
            Log.v("FragmentManager", "Transition for operation " + cVar2 + " has completed");
        }
    }

    /* access modifiers changed from: private */
    public static final void P(f0.c cVar, f0.c cVar2, boolean z10, o.a aVar) {
        l.f(aVar, "$lastInViews");
        y.a(cVar.h(), cVar2.h(), z10, aVar, false);
    }

    private final void Q(List list) {
        i h10 = ((f0.c) y.e0(list)).h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0.c cVar = (f0.c) it.next();
            cVar.h().P.f3078c = h10.P.f3078c;
            cVar.h().P.f3079d = h10.P.f3079d;
            cVar.h().P.f3080e = h10.P.f3080e;
            cVar.h().P.f3081f = h10.P.f3081f;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: androidx.fragment.app.f0$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: androidx.fragment.app.f0$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: androidx.fragment.app.f0$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.fragment.app.f0$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(java.util.List r14, boolean r15) {
        /*
            r13 = this;
            java.lang.String r0 = "operations"
            cm.l.f(r14, r0)
            r0 = r14
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000c:
            boolean r1 = r0.hasNext()
            r2 = 0
            java.lang.String r3 = "operation.fragment.mView"
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            r4 = r1
            androidx.fragment.app.f0$c r4 = (androidx.fragment.app.f0.c) r4
            androidx.fragment.app.f0$c$b$a r5 = androidx.fragment.app.f0.c.b.f3006e
            androidx.fragment.app.i r6 = r4.h()
            android.view.View r6 = r6.M
            cm.l.e(r6, r3)
            androidx.fragment.app.f0$c$b r5 = r5.a(r6)
            androidx.fragment.app.f0$c$b r6 = androidx.fragment.app.f0.c.b.VISIBLE
            if (r5 != r6) goto L_0x000c
            androidx.fragment.app.f0$c$b r4 = r4.g()
            if (r4 == r6) goto L_0x000c
            goto L_0x0037
        L_0x0036:
            r1 = r2
        L_0x0037:
            androidx.fragment.app.f0$c r1 = (androidx.fragment.app.f0.c) r1
            int r0 = r14.size()
            java.util.ListIterator r0 = r14.listIterator(r0)
        L_0x0041:
            boolean r4 = r0.hasPrevious()
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r0.previous()
            r5 = r4
            androidx.fragment.app.f0$c r5 = (androidx.fragment.app.f0.c) r5
            androidx.fragment.app.f0$c$b$a r6 = androidx.fragment.app.f0.c.b.f3006e
            androidx.fragment.app.i r7 = r5.h()
            android.view.View r7 = r7.M
            cm.l.e(r7, r3)
            androidx.fragment.app.f0$c$b r6 = r6.a(r7)
            androidx.fragment.app.f0$c$b r7 = androidx.fragment.app.f0.c.b.VISIBLE
            if (r6 == r7) goto L_0x0041
            androidx.fragment.app.f0$c$b r5 = r5.g()
            if (r5 != r7) goto L_0x0041
            r2 = r4
        L_0x0068:
            androidx.fragment.app.f0$c r2 = (androidx.fragment.app.f0.c) r2
            r0 = 2
            boolean r3 = androidx.fragment.app.q.J0(r0)
            java.lang.String r10 = " to "
            java.lang.String r11 = "FragmentManager"
            if (r3 == 0) goto L_0x008f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Executing operations from "
            r3.append(r4)
            r3.append(r1)
            r3.append(r10)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r11, r3)
        L_0x008f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4 = r14
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r12 = ql.y.v0(r4)
            r13.Q(r14)
            java.util.Iterator r14 = r14.iterator()
        L_0x00a7:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x00e7
            java.lang.Object r4 = r14.next()
            androidx.fragment.app.f0$c r4 = (androidx.fragment.app.f0.c) r4
            androidx.core.os.e r6 = new androidx.core.os.e
            r6.<init>()
            r4.l(r6)
            androidx.fragment.app.f$a r7 = new androidx.fragment.app.f$a
            r7.<init>(r4, r6, r15)
            r3.add(r7)
            androidx.core.os.e r6 = new androidx.core.os.e
            r6.<init>()
            r4.l(r6)
            androidx.fragment.app.f$c r7 = new androidx.fragment.app.f$c
            r8 = 0
            r9 = 1
            if (r15 == 0) goto L_0x00d5
            if (r4 != r1) goto L_0x00d8
        L_0x00d3:
            r8 = r9
            goto L_0x00d8
        L_0x00d5:
            if (r4 != r2) goto L_0x00d8
            goto L_0x00d3
        L_0x00d8:
            r7.<init>(r4, r6, r15, r8)
            r5.add(r7)
            n0.a r6 = new n0.a
            r6.<init>(r12, r4, r13)
            r4.c(r6)
            goto L_0x00a7
        L_0x00e7:
            r4 = r13
            r6 = r12
            r7 = r15
            r8 = r1
            r9 = r2
            java.util.Map r14 = r4.L(r5, r6, r7, r8, r9)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            boolean r15 = r14.containsValue(r15)
            r13.I(r3, r12, r15, r14)
            java.util.Iterator r14 = r12.iterator()
        L_0x00fd:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x010d
            java.lang.Object r15 = r14.next()
            androidx.fragment.app.f0$c r15 = (androidx.fragment.app.f0.c) r15
            r13.D(r15)
            goto L_0x00fd
        L_0x010d:
            r12.clear()
            boolean r14 = androidx.fragment.app.q.J0(r0)
            if (r14 == 0) goto L_0x0130
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Completed executing operations from "
            r14.append(r15)
            r14.append(r1)
            r14.append(r10)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            android.util.Log.v(r11, r14)
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f.j(java.util.List, boolean):void");
    }
}
