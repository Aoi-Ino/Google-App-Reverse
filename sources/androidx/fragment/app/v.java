package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.m0;
import androidx.fragment.app.f0;
import androidx.lifecycle.x0;
import o0.c;

class v {

    /* renamed from: a  reason: collision with root package name */
    private final p f3193a;

    /* renamed from: b  reason: collision with root package name */
    private final w f3194b;

    /* renamed from: c  reason: collision with root package name */
    private final i f3195c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3196d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f3197e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f3198e;

        a(View view) {
            this.f3198e = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f3198e.removeOnAttachStateChangeListener(this);
            m0.n0(this.f3198e);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3200a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.k$b[] r0 = androidx.lifecycle.k.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3200a = r0
                androidx.lifecycle.k$b r1 = androidx.lifecycle.k.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3200a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.k$b r1 = androidx.lifecycle.k.b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3200a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.k$b r1 = androidx.lifecycle.k.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3200a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.k$b r1 = androidx.lifecycle.k.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.v.b.<clinit>():void");
        }
    }

    v(p pVar, w wVar, i iVar) {
        this.f3193a = pVar;
        this.f3194b = wVar;
        this.f3195c = iVar;
    }

    private boolean l(View view) {
        if (view == this.f3195c.M) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3195c.M) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (q.J0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3195c);
        }
        Bundle bundle = this.f3195c.f3047f;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f3195c.d1(bundle2);
        this.f3193a.a(this.f3195c, bundle2, false);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        i k02 = q.k0(this.f3195c.L);
        i M = this.f3195c.M();
        if (k02 != null && !k02.equals(M)) {
            i iVar = this.f3195c;
            c.j(iVar, k02, iVar.C);
        }
        int j10 = this.f3194b.j(this.f3195c);
        i iVar2 = this.f3195c;
        iVar2.L.addView(iVar2.M, j10);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (q.J0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3195c);
        }
        i iVar = this.f3195c;
        i iVar2 = iVar.f3054l;
        v vVar = null;
        if (iVar2 != null) {
            v n10 = this.f3194b.n(iVar2.f3052j);
            if (n10 != null) {
                i iVar3 = this.f3195c;
                iVar3.f3055m = iVar3.f3054l.f3052j;
                iVar3.f3054l = null;
                vVar = n10;
            } else {
                throw new IllegalStateException("Fragment " + this.f3195c + " declared target fragment " + this.f3195c.f3054l + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = iVar.f3055m;
            if (str != null && (vVar = this.f3194b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3195c + " declared target fragment " + this.f3195c.f3055m + " that does not belong to this FragmentManager!");
            }
        }
        if (vVar != null) {
            vVar.m();
        }
        i iVar4 = this.f3195c;
        iVar4.f3067y = iVar4.f3066x.w0();
        i iVar5 = this.f3195c;
        iVar5.A = iVar5.f3066x.z0();
        this.f3193a.g(this.f3195c, false);
        this.f3195c.e1();
        this.f3193a.b(this.f3195c, false);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        i iVar = this.f3195c;
        if (iVar.f3066x == null) {
            return iVar.f3045e;
        }
        int i10 = this.f3197e;
        int i11 = b.f3200a[iVar.W.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? i11 != 3 ? i11 != 4 ? Math.min(i10, -1) : Math.min(i10, 0) : Math.min(i10, 1) : Math.min(i10, 5);
        }
        i iVar2 = this.f3195c;
        if (iVar2.f3061s) {
            if (iVar2.f3062t) {
                i10 = Math.max(this.f3197e, 2);
                View view = this.f3195c.M;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f3197e < 4 ? Math.min(i10, iVar2.f3045e) : Math.min(i10, 1);
            }
        }
        if (!this.f3195c.f3058p) {
            i10 = Math.min(i10, 1);
        }
        i iVar3 = this.f3195c;
        ViewGroup viewGroup = iVar3.L;
        f0.c.a p10 = viewGroup != null ? f0.r(viewGroup, iVar3.O()).p(this) : null;
        if (p10 == f0.c.a.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (p10 == f0.c.a.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            i iVar4 = this.f3195c;
            if (iVar4.f3059q) {
                i10 = iVar4.p0() ? Math.min(i10, 1) : Math.min(i10, -1);
            }
        }
        i iVar5 = this.f3195c;
        if (iVar5.N && iVar5.f3045e < 5) {
            i10 = Math.min(i10, 4);
        }
        if (q.J0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f3195c);
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (q.J0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3195c);
        }
        Bundle bundle = this.f3195c.f3047f;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        i iVar = this.f3195c;
        if (!iVar.U) {
            this.f3193a.h(iVar, bundle2, false);
            this.f3195c.h1(bundle2);
            this.f3193a.c(this.f3195c, bundle2, false);
            return;
        }
        iVar.f3045e = 1;
        iVar.G1();
    }

    /* access modifiers changed from: package-private */
    public void f() {
        String str;
        if (!this.f3195c.f3061s) {
            if (q.J0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3195c);
            }
            Bundle bundle = this.f3195c.f3047f;
            ViewGroup viewGroup = null;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater n12 = this.f3195c.n1(bundle2);
            i iVar = this.f3195c;
            ViewGroup viewGroup2 = iVar.L;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i10 = iVar.C;
                if (i10 != 0) {
                    if (i10 != -1) {
                        viewGroup = (ViewGroup) iVar.f3066x.r0().c(this.f3195c.C);
                        if (viewGroup == null) {
                            i iVar2 = this.f3195c;
                            if (!iVar2.f3063u) {
                                try {
                                    str = iVar2.V().getResourceName(this.f3195c.C);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3195c.C) + " (" + str + ") for fragment " + this.f3195c);
                            }
                        } else if (!(viewGroup instanceof FragmentContainerView)) {
                            c.i(this.f3195c, viewGroup);
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f3195c + " for a container view with no id");
                    }
                }
            }
            i iVar3 = this.f3195c;
            iVar3.L = viewGroup;
            iVar3.j1(n12, viewGroup, bundle2);
            if (this.f3195c.M != null) {
                if (q.J0(3)) {
                    Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f3195c);
                }
                this.f3195c.M.setSaveFromParentEnabled(false);
                i iVar4 = this.f3195c;
                iVar4.M.setTag(m0.b.fragment_container_view_tag, iVar4);
                if (viewGroup != null) {
                    b();
                }
                i iVar5 = this.f3195c;
                if (iVar5.E) {
                    iVar5.M.setVisibility(8);
                }
                if (m0.T(this.f3195c.M)) {
                    m0.n0(this.f3195c.M);
                } else {
                    View view = this.f3195c.M;
                    view.addOnAttachStateChangeListener(new a(view));
                }
                this.f3195c.A1();
                p pVar = this.f3193a;
                i iVar6 = this.f3195c;
                pVar.m(iVar6, iVar6.M, bundle2, false);
                int visibility = this.f3195c.M.getVisibility();
                this.f3195c.O1(this.f3195c.M.getAlpha());
                i iVar7 = this.f3195c;
                if (iVar7.L != null && visibility == 0) {
                    View findFocus = iVar7.M.findFocus();
                    if (findFocus != null) {
                        this.f3195c.L1(findFocus);
                        if (q.J0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f3195c);
                        }
                    }
                    this.f3195c.M.setAlpha(0.0f);
                }
            }
            this.f3195c.f3045e = 2;
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        i f10;
        if (q.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3195c);
        }
        i iVar = this.f3195c;
        boolean z10 = true;
        boolean z11 = iVar.f3059q && !iVar.p0();
        if (z11) {
            i iVar2 = this.f3195c;
            if (!iVar2.f3060r) {
                this.f3194b.B(iVar2.f3052j, (Bundle) null);
            }
        }
        if (z11 || this.f3194b.p().s(this.f3195c)) {
            n nVar = this.f3195c.f3067y;
            if (nVar instanceof x0) {
                z10 = this.f3194b.p().p();
            } else if (nVar.f() instanceof Activity) {
                z10 = true ^ ((Activity) nVar.f()).isChangingConfigurations();
            }
            if ((z11 && !this.f3195c.f3060r) || z10) {
                this.f3194b.p().h(this.f3195c, false);
            }
            this.f3195c.k1();
            this.f3193a.d(this.f3195c, false);
            for (v vVar : this.f3194b.k()) {
                if (vVar != null) {
                    i k10 = vVar.k();
                    if (this.f3195c.f3052j.equals(k10.f3055m)) {
                        k10.f3054l = this.f3195c;
                        k10.f3055m = null;
                    }
                }
            }
            i iVar3 = this.f3195c;
            String str = iVar3.f3055m;
            if (str != null) {
                iVar3.f3054l = this.f3194b.f(str);
            }
            this.f3194b.s(this);
            return;
        }
        String str2 = this.f3195c.f3055m;
        if (!(str2 == null || (f10 = this.f3194b.f(str2)) == null || !f10.G)) {
            this.f3195c.f3054l = f10;
        }
        this.f3195c.f3045e = 0;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        View view;
        if (q.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3195c);
        }
        i iVar = this.f3195c;
        ViewGroup viewGroup = iVar.L;
        if (!(viewGroup == null || (view = iVar.M) == null)) {
            viewGroup.removeView(view);
        }
        this.f3195c.l1();
        this.f3193a.n(this.f3195c, false);
        i iVar2 = this.f3195c;
        iVar2.L = null;
        iVar2.M = null;
        iVar2.Y = null;
        iVar2.Z.m((Object) null);
        this.f3195c.f3062t = false;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (q.J0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3195c);
        }
        this.f3195c.m1();
        this.f3193a.e(this.f3195c, false);
        i iVar = this.f3195c;
        iVar.f3045e = -1;
        iVar.f3067y = null;
        iVar.A = null;
        iVar.f3066x = null;
        if ((iVar.f3059q && !iVar.p0()) || this.f3194b.p().s(this.f3195c)) {
            if (q.J0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3195c);
            }
            this.f3195c.l0();
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i iVar = this.f3195c;
        if (iVar.f3061s && iVar.f3062t && !iVar.f3064v) {
            if (q.J0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3195c);
            }
            Bundle bundle = this.f3195c.f3047f;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            i iVar2 = this.f3195c;
            iVar2.j1(iVar2.n1(bundle2), (ViewGroup) null, bundle2);
            View view = this.f3195c.M;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                i iVar3 = this.f3195c;
                iVar3.M.setTag(m0.b.fragment_container_view_tag, iVar3);
                i iVar4 = this.f3195c;
                if (iVar4.E) {
                    iVar4.M.setVisibility(8);
                }
                this.f3195c.A1();
                p pVar = this.f3193a;
                i iVar5 = this.f3195c;
                pVar.m(iVar5, iVar5.M, bundle2, false);
                this.f3195c.f3045e = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public i k() {
        return this.f3195c;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f3196d) {
            try {
                this.f3196d = true;
                boolean z10 = false;
                while (true) {
                    int d10 = d();
                    i iVar = this.f3195c;
                    int i10 = iVar.f3045e;
                    if (d10 != i10) {
                        if (d10 <= i10) {
                            switch (i10 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    if (iVar.f3060r && this.f3194b.q(iVar.f3052j) == null) {
                                        this.f3194b.B(this.f3195c.f3052j, q());
                                    }
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f3195c.f3045e = 1;
                                    break;
                                case 2:
                                    iVar.f3062t = false;
                                    iVar.f3045e = 2;
                                    break;
                                case 3:
                                    if (q.J0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3195c);
                                    }
                                    i iVar2 = this.f3195c;
                                    if (iVar2.f3060r) {
                                        this.f3194b.B(iVar2.f3052j, q());
                                    } else if (iVar2.M != null && iVar2.f3049g == null) {
                                        r();
                                    }
                                    i iVar3 = this.f3195c;
                                    if (!(iVar3.M == null || (viewGroup2 = iVar3.L) == null)) {
                                        f0.r(viewGroup2, iVar3.O()).h(this);
                                    }
                                    this.f3195c.f3045e = 3;
                                    break;
                                case 4:
                                    u();
                                    break;
                                case 5:
                                    iVar.f3045e = 5;
                                    break;
                                case 6:
                                    n();
                                    break;
                            }
                        } else {
                            switch (i10 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(iVar.M == null || (viewGroup3 = iVar.L) == null)) {
                                        f0.r(viewGroup3, iVar.O()).f(f0.c.b.c(this.f3195c.M.getVisibility()), this);
                                    }
                                    this.f3195c.f3045e = 4;
                                    break;
                                case 5:
                                    t();
                                    break;
                                case 6:
                                    iVar.f3045e = 6;
                                    break;
                                case 7:
                                    p();
                                    break;
                            }
                        }
                        z10 = true;
                    } else {
                        if (!z10 && i10 == -1 && iVar.f3059q && !iVar.p0() && !this.f3195c.f3060r) {
                            if (q.J0(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f3195c);
                            }
                            this.f3194b.p().h(this.f3195c, true);
                            this.f3194b.s(this);
                            if (q.J0(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + this.f3195c);
                            }
                            this.f3195c.l0();
                        }
                        i iVar4 = this.f3195c;
                        if (iVar4.S) {
                            if (!(iVar4.M == null || (viewGroup = iVar4.L) == null)) {
                                f0 r10 = f0.r(viewGroup, iVar4.O());
                                if (this.f3195c.E) {
                                    r10.g(this);
                                } else {
                                    r10.i(this);
                                }
                            }
                            i iVar5 = this.f3195c;
                            q qVar = iVar5.f3066x;
                            if (qVar != null) {
                                qVar.H0(iVar5);
                            }
                            i iVar6 = this.f3195c;
                            iVar6.S = false;
                            iVar6.M0(iVar6.E);
                            this.f3195c.f3068z.H();
                        }
                        this.f3196d = false;
                        return;
                    }
                }
            } catch (Throwable th2) {
                this.f3196d = false;
                throw th2;
            }
        } else if (q.J0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (q.J0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3195c);
        }
        this.f3195c.s1();
        this.f3193a.f(this.f3195c, false);
    }

    /* access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f3195c.f3047f;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (this.f3195c.f3047f.getBundle("savedInstanceState") == null) {
                this.f3195c.f3047f.putBundle("savedInstanceState", new Bundle());
            }
            i iVar = this.f3195c;
            iVar.f3049g = iVar.f3047f.getSparseParcelableArray("viewState");
            i iVar2 = this.f3195c;
            iVar2.f3050h = iVar2.f3047f.getBundle("viewRegistryState");
            u uVar = (u) this.f3195c.f3047f.getParcelable("state");
            if (uVar != null) {
                i iVar3 = this.f3195c;
                iVar3.f3055m = uVar.f3190p;
                iVar3.f3056n = uVar.f3191q;
                Boolean bool = iVar3.f3051i;
                if (bool != null) {
                    iVar3.O = bool.booleanValue();
                    this.f3195c.f3051i = null;
                } else {
                    iVar3.O = uVar.f3192r;
                }
            }
            i iVar4 = this.f3195c;
            if (!iVar4.O) {
                iVar4.N = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (q.J0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3195c);
        }
        View E = this.f3195c.E();
        if (E != null && l(E)) {
            boolean requestFocus = E.requestFocus();
            if (q.J0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(E);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f3195c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f3195c.M.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f3195c.L1((View) null);
        this.f3195c.w1();
        this.f3193a.i(this.f3195c, false);
        this.f3194b.B(this.f3195c.f3052j, (Bundle) null);
        i iVar = this.f3195c;
        iVar.f3047f = null;
        iVar.f3049g = null;
        iVar.f3050h = null;
    }

    /* access modifiers changed from: package-private */
    public Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        i iVar = this.f3195c;
        if (iVar.f3045e == -1 && (bundle = iVar.f3047f) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new u(this.f3195c));
        if (this.f3195c.f3045e > -1) {
            Bundle bundle3 = new Bundle();
            this.f3195c.x1(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f3193a.j(this.f3195c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f3195c.f3042b0.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle p12 = this.f3195c.f3068z.R0();
            if (!p12.isEmpty()) {
                bundle2.putBundle("childFragmentManager", p12);
            }
            if (this.f3195c.M != null) {
                r();
            }
            SparseArray sparseArray = this.f3195c.f3049g;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f3195c.f3050h;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f3195c.f3053k;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        if (this.f3195c.M != null) {
            if (q.J0(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + this.f3195c + " with view " + this.f3195c.M);
            }
            SparseArray sparseArray = new SparseArray();
            this.f3195c.M.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3195c.f3049g = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f3195c.Y.e(bundle);
            if (!bundle.isEmpty()) {
                this.f3195c.f3050h = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(int i10) {
        this.f3197e = i10;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        if (q.J0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3195c);
        }
        this.f3195c.y1();
        this.f3193a.k(this.f3195c, false);
    }

    /* access modifiers changed from: package-private */
    public void u() {
        if (q.J0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3195c);
        }
        this.f3195c.z1();
        this.f3193a.l(this.f3195c, false);
    }

    v(p pVar, w wVar, i iVar, Bundle bundle) {
        this.f3193a = pVar;
        this.f3194b = wVar;
        this.f3195c = iVar;
        iVar.f3049g = null;
        iVar.f3050h = null;
        iVar.f3065w = 0;
        iVar.f3062t = false;
        iVar.f3058p = false;
        i iVar2 = iVar.f3054l;
        iVar.f3055m = iVar2 != null ? iVar2.f3052j : null;
        iVar.f3054l = null;
        iVar.f3047f = bundle;
        iVar.f3053k = bundle.getBundle("arguments");
    }

    v(p pVar, w wVar, ClassLoader classLoader, m mVar, Bundle bundle) {
        this.f3193a = pVar;
        this.f3194b = wVar;
        i c10 = ((u) bundle.getParcelable("state")).c(mVar, classLoader);
        this.f3195c = c10;
        c10.f3047f = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        c10.K1(bundle2);
        if (q.J0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + c10);
        }
    }
}
