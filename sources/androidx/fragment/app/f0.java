package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.e;
import androidx.core.view.m0;
import cm.g;
import cm.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import n0.r;
import pl.x;

public abstract class f0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f2988f = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f2989a;

    /* renamed from: b  reason: collision with root package name */
    private final List f2990b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List f2991c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f2992d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2993e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final f0 a(ViewGroup viewGroup, q qVar) {
            l.f(viewGroup, "container");
            l.f(qVar, "fragmentManager");
            g0 B0 = qVar.B0();
            l.e(B0, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, B0);
        }

        public final f0 b(ViewGroup viewGroup, g0 g0Var) {
            l.f(viewGroup, "container");
            l.f(g0Var, "factory");
            int i10 = m0.b.special_effects_controller_view_tag;
            Object tag = viewGroup.getTag(i10);
            if (tag instanceof f0) {
                return (f0) tag;
            }
            f0 a10 = g0Var.a(viewGroup);
            l.e(a10, "factory.createController(container)");
            viewGroup.setTag(i10, a10);
            return a10;
        }
    }

    private static final class b extends c {

        /* renamed from: h  reason: collision with root package name */
        private final v f2994h;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(androidx.fragment.app.f0.c.b r3, androidx.fragment.app.f0.c.a r4, androidx.fragment.app.v r5, androidx.core.os.e r6) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                cm.l.f(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                cm.l.f(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                cm.l.f(r5, r0)
                java.lang.String r0 = "cancellationSignal"
                cm.l.f(r6, r0)
                androidx.fragment.app.i r0 = r5.k()
                java.lang.String r1 = "fragmentStateManager.fragment"
                cm.l.e(r0, r1)
                r2.<init>(r3, r4, r0, r6)
                r2.f2994h = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f0.b.<init>(androidx.fragment.app.f0$c$b, androidx.fragment.app.f0$c$a, androidx.fragment.app.v, androidx.core.os.e):void");
        }

        public void e() {
            super.e();
            this.f2994h.m();
        }

        public void n() {
            if (i() == c.a.ADDING) {
                i k10 = this.f2994h.k();
                l.e(k10, "fragmentStateManager.fragment");
                View findFocus = k10.M.findFocus();
                if (findFocus != null) {
                    k10.L1(findFocus);
                    if (q.J0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k10);
                    }
                }
                View F1 = h().F1();
                l.e(F1, "this.fragment.requireView()");
                if (F1.getParent() == null) {
                    this.f2994h.b();
                    F1.setAlpha(0.0f);
                }
                if (F1.getAlpha() == 0.0f && F1.getVisibility() == 0) {
                    F1.setVisibility(4);
                }
                F1.setAlpha(k10.T());
            } else if (i() == c.a.REMOVING) {
                i k11 = this.f2994h.k();
                l.e(k11, "fragmentStateManager.fragment");
                View F12 = k11.F1();
                l.e(F12, "fragment.requireView()");
                if (q.J0(2)) {
                    Log.v("FragmentManager", "Clearing focus " + F12.findFocus() + " on view " + F12 + " for Fragment " + k11);
                }
                F12.clearFocus();
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private b f2995a;

        /* renamed from: b  reason: collision with root package name */
        private a f2996b;

        /* renamed from: c  reason: collision with root package name */
        private final i f2997c;

        /* renamed from: d  reason: collision with root package name */
        private final List f2998d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final Set f2999e = new LinkedHashSet();

        /* renamed from: f  reason: collision with root package name */
        private boolean f3000f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f3001g;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;
            

            /* renamed from: e  reason: collision with root package name */
            public static final a f3006e = null;

            public static final class a {
                private a() {
                }

                public /* synthetic */ a(g gVar) {
                    this();
                }

                public final b a(View view) {
                    l.f(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }
            }

            /* renamed from: androidx.fragment.app.f0$c$b$b  reason: collision with other inner class name */
            public /* synthetic */ class C0051b {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f3012a = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                static {
                    /*
                        androidx.fragment.app.f0$c$b[] r0 = androidx.fragment.app.f0.c.b.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.fragment.app.f0$c$b r1 = androidx.fragment.app.f0.c.b.REMOVED     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        androidx.fragment.app.f0$c$b r1 = androidx.fragment.app.f0.c.b.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        androidx.fragment.app.f0$c$b r1 = androidx.fragment.app.f0.c.b.GONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        androidx.fragment.app.f0$c$b r1 = androidx.fragment.app.f0.c.b.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        f3012a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f0.c.b.C0051b.<clinit>():void");
                }
            }

            static {
                f3006e = new a((g) null);
            }

            public static final b c(int i10) {
                return f3006e.b(i10);
            }

            public final void b(View view) {
                int i10;
                l.f(view, "view");
                int i11 = C0051b.f3012a[ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        if (q.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                        }
                        i10 = 0;
                    } else if (i11 == 3) {
                        if (q.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        i10 = 8;
                    } else if (i11 == 4) {
                        if (q.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    } else {
                        return;
                    }
                    view.setVisibility(i10);
                    return;
                }
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    if (q.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        /* renamed from: androidx.fragment.app.f0$c$c  reason: collision with other inner class name */
        public /* synthetic */ class C0052c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f3013a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    androidx.fragment.app.f0$c$a[] r0 = androidx.fragment.app.f0.c.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.fragment.app.f0$c$a r1 = androidx.fragment.app.f0.c.a.ADDING     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.fragment.app.f0$c$a r1 = androidx.fragment.app.f0.c.a.REMOVING     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.fragment.app.f0$c$a r1 = androidx.fragment.app.f0.c.a.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f3013a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f0.c.C0052c.<clinit>():void");
            }
        }

        public c(b bVar, a aVar, i iVar, e eVar) {
            l.f(bVar, "finalState");
            l.f(aVar, "lifecycleImpact");
            l.f(iVar, "fragment");
            l.f(eVar, "cancellationSignal");
            this.f2995a = bVar;
            this.f2996b = aVar;
            this.f2997c = iVar;
            eVar.c(new r(this));
        }

        /* access modifiers changed from: private */
        public static final void b(c cVar) {
            l.f(cVar, "this$0");
            cVar.d();
        }

        public final void c(Runnable runnable) {
            l.f(runnable, "listener");
            this.f2998d.add(runnable);
        }

        public final void d() {
            if (!this.f3000f) {
                this.f3000f = true;
                if (this.f2999e.isEmpty()) {
                    e();
                    return;
                }
                for (e a10 : y.w0(this.f2999e)) {
                    a10.a();
                }
            }
        }

        public void e() {
            if (!this.f3001g) {
                if (q.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f3001g = true;
                for (Runnable run : this.f2998d) {
                    run.run();
                }
            }
        }

        public final void f(e eVar) {
            l.f(eVar, "signal");
            if (this.f2999e.remove(eVar) && this.f2999e.isEmpty()) {
                e();
            }
        }

        public final b g() {
            return this.f2995a;
        }

        public final i h() {
            return this.f2997c;
        }

        public final a i() {
            return this.f2996b;
        }

        public final boolean j() {
            return this.f3000f;
        }

        public final boolean k() {
            return this.f3001g;
        }

        public final void l(e eVar) {
            l.f(eVar, "signal");
            n();
            this.f2999e.add(eVar);
        }

        public final void m(b bVar, a aVar) {
            a aVar2;
            l.f(bVar, "finalState");
            l.f(aVar, "lifecycleImpact");
            int i10 = C0052c.f3013a[aVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    if (q.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2997c + " mFinalState = " + this.f2995a + " -> REMOVED. mLifecycleImpact  = " + this.f2996b + " to REMOVING.");
                    }
                    this.f2995a = b.REMOVED;
                    aVar2 = a.REMOVING;
                } else if (i10 == 3 && this.f2995a != b.REMOVED) {
                    if (q.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2997c + " mFinalState = " + this.f2995a + " -> " + bVar + '.');
                    }
                    this.f2995a = bVar;
                    return;
                } else {
                    return;
                }
            } else if (this.f2995a == b.REMOVED) {
                if (q.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2997c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f2996b + " to ADDING.");
                }
                this.f2995a = b.VISIBLE;
                aVar2 = a.ADDING;
            } else {
                return;
            }
            this.f2996b = aVar2;
        }

        public abstract void n();

        public String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            return "Operation {" + hexString + "} {finalState = " + this.f2995a + " lifecycleImpact = " + this.f2996b + " fragment = " + this.f2997c + '}';
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3014a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3014a = iArr;
        }
    }

    public f0(ViewGroup viewGroup) {
        l.f(viewGroup, "container");
        this.f2989a = viewGroup;
    }

    private final void c(c.b bVar, c.a aVar, v vVar) {
        synchronized (this.f2990b) {
            e eVar = new e();
            i k10 = vVar.k();
            l.e(k10, "fragmentStateManager.fragment");
            c l10 = l(k10);
            if (l10 != null) {
                l10.m(bVar, aVar);
                return;
            }
            b bVar2 = new b(bVar, aVar, vVar, eVar);
            this.f2990b.add(bVar2);
            bVar2.c(new d0(this, bVar2));
            bVar2.c(new e0(this, bVar2));
            x xVar = x.f30437a;
        }
    }

    /* access modifiers changed from: private */
    public static final void d(f0 f0Var, b bVar) {
        l.f(f0Var, "this$0");
        l.f(bVar, "$operation");
        if (f0Var.f2990b.contains(bVar)) {
            c.b g10 = bVar.g();
            View view = bVar.h().M;
            l.e(view, "operation.fragment.mView");
            g10.b(view);
        }
    }

    /* access modifiers changed from: private */
    public static final void e(f0 f0Var, b bVar) {
        l.f(f0Var, "this$0");
        l.f(bVar, "$operation");
        f0Var.f2990b.remove(bVar);
        f0Var.f2991c.remove(bVar);
    }

    private final c l(i iVar) {
        Object obj;
        Iterator it = this.f2990b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            c cVar = (c) obj;
            if (l.a(cVar.h(), iVar) && !cVar.j()) {
                break;
            }
        }
        return (c) obj;
    }

    private final c m(i iVar) {
        Object obj;
        Iterator it = this.f2991c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            c cVar = (c) obj;
            if (l.a(cVar.h(), iVar) && !cVar.j()) {
                break;
            }
        }
        return (c) obj;
    }

    public static final f0 r(ViewGroup viewGroup, q qVar) {
        return f2988f.a(viewGroup, qVar);
    }

    public static final f0 s(ViewGroup viewGroup, g0 g0Var) {
        return f2988f.b(viewGroup, g0Var);
    }

    private final void u() {
        for (c cVar : this.f2990b) {
            if (cVar.i() == c.a.ADDING) {
                View F1 = cVar.h().F1();
                l.e(F1, "fragment.requireView()");
                cVar.m(c.b.f3006e.b(F1.getVisibility()), c.a.NONE);
            }
        }
    }

    public final void f(c.b bVar, v vVar) {
        l.f(bVar, "finalState");
        l.f(vVar, "fragmentStateManager");
        if (q.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + vVar.k());
        }
        c(bVar, c.a.ADDING, vVar);
    }

    public final void g(v vVar) {
        l.f(vVar, "fragmentStateManager");
        if (q.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + vVar.k());
        }
        c(c.b.GONE, c.a.NONE, vVar);
    }

    public final void h(v vVar) {
        l.f(vVar, "fragmentStateManager");
        if (q.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + vVar.k());
        }
        c(c.b.REMOVED, c.a.REMOVING, vVar);
    }

    public final void i(v vVar) {
        l.f(vVar, "fragmentStateManager");
        if (q.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + vVar.k());
        }
        c(c.b.VISIBLE, c.a.NONE, vVar);
    }

    public abstract void j(List list, boolean z10);

    public final void k() {
        if (!this.f2993e) {
            if (!m0.T(this.f2989a)) {
                n();
                this.f2992d = false;
                return;
            }
            synchronized (this.f2990b) {
                try {
                    if (!this.f2990b.isEmpty()) {
                        List<c> v02 = y.v0(this.f2991c);
                        this.f2991c.clear();
                        for (c cVar : v02) {
                            if (q.J0(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar);
                            }
                            cVar.d();
                            if (!cVar.k()) {
                                this.f2991c.add(cVar);
                            }
                        }
                        u();
                        List<c> v03 = y.v0(this.f2990b);
                        this.f2990b.clear();
                        this.f2991c.addAll(v03);
                        if (q.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                        }
                        for (c n10 : v03) {
                            n10.n();
                        }
                        j(v03, this.f2992d);
                        this.f2992d = false;
                        if (q.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                        }
                    }
                    x xVar = x.f30437a;
                } finally {
                }
            }
        }
    }

    public final void n() {
        String str;
        String str2;
        if (q.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean T = m0.T(this.f2989a);
        synchronized (this.f2990b) {
            try {
                u();
                for (c n10 : this.f2990b) {
                    n10.n();
                }
                for (c cVar : y.v0(this.f2991c)) {
                    if (q.J0(2)) {
                        if (T) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f2989a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + cVar);
                    }
                    cVar.d();
                }
                for (c cVar2 : y.v0(this.f2990b)) {
                    if (q.J0(2)) {
                        if (T) {
                            str = "";
                        } else {
                            str = "Container " + this.f2989a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + cVar2);
                    }
                    cVar2.d();
                }
                x xVar = x.f30437a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o() {
        if (this.f2993e) {
            if (q.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f2993e = false;
            k();
        }
    }

    public final c.a p(v vVar) {
        l.f(vVar, "fragmentStateManager");
        i k10 = vVar.k();
        l.e(k10, "fragmentStateManager.fragment");
        c l10 = l(k10);
        c.a aVar = null;
        c.a i10 = l10 != null ? l10.i() : null;
        c m10 = m(k10);
        if (m10 != null) {
            aVar = m10.i();
        }
        int i11 = i10 == null ? -1 : d.f3014a[i10.ordinal()];
        return (i11 == -1 || i11 == 1) ? aVar : i10;
    }

    public final ViewGroup q() {
        return this.f2989a;
    }

    public final void t() {
        i iVar;
        Object obj;
        synchronized (this.f2990b) {
            try {
                u();
                List list = this.f2990b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    iVar = null;
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    c cVar = (c) obj;
                    c.b.a aVar = c.b.f3006e;
                    View view = cVar.h().M;
                    l.e(view, "operation.fragment.mView");
                    c.b a10 = aVar.a(view);
                    c.b g10 = cVar.g();
                    c.b bVar = c.b.VISIBLE;
                    if (g10 == bVar && a10 != bVar) {
                        break;
                    }
                }
                c cVar2 = (c) obj;
                if (cVar2 != null) {
                    iVar = cVar2.h();
                }
                this.f2993e = iVar != null ? iVar.r0() : false;
                x xVar = x.f30437a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void v(boolean z10) {
        this.f2992d = z10;
    }
}
