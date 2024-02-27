package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.d;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.i;
import androidx.fragment.app.q;
import androidx.lifecycle.w0;
import cm.g;
import cm.l;
import cm.m;
import pl.h;
import pl.t;
import pl.x;
import t0.a0;
import t0.b0;
import t0.c0;
import t0.g0;
import t0.k;
import t0.s;
import v0.e;
import v0.f;

public class NavHostFragment extends i {

    /* renamed from: l0  reason: collision with root package name */
    public static final a f3410l0 = new a((g) null);

    /* renamed from: h0  reason: collision with root package name */
    private final h f3411h0 = j.a(new b(this));

    /* renamed from: i0  reason: collision with root package name */
    private View f3412i0;
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public int f3413j0;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f3414k0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static final class b extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NavHostFragment f3415e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(NavHostFragment navHostFragment) {
            super(0);
            this.f3415e = navHostFragment;
        }

        /* access modifiers changed from: private */
        public static final Bundle f(s sVar) {
            l.f(sVar, "$this_apply");
            Bundle k02 = sVar.k0();
            if (k02 != null) {
                return k02;
            }
            Bundle bundle = Bundle.EMPTY;
            l.e(bundle, "EMPTY");
            return bundle;
        }

        /* access modifiers changed from: private */
        public static final Bundle i(NavHostFragment navHostFragment) {
            l.f(navHostFragment, "this$0");
            if (navHostFragment.f3413j0 != 0) {
                return d.a(t.a("android-support-nav:fragment:graphId", Integer.valueOf(navHostFragment.f3413j0)));
            }
            Bundle bundle = Bundle.EMPTY;
            l.e(bundle, "{\n                    Bu…e.EMPTY\n                }");
            return bundle;
        }

        /* renamed from: e */
        public final s a() {
            Context w10 = this.f3415e.w();
            if (w10 != null) {
                l.e(w10, "checkNotNull(context) {\n…nt is attached\"\n        }");
                s sVar = new s(w10);
                NavHostFragment navHostFragment = this.f3415e;
                sVar.o0(navHostFragment);
                w0 X = navHostFragment.X();
                l.e(X, "viewModelStore");
                sVar.p0(X);
                navHostFragment.b2(sVar);
                Bundle b10 = navHostFragment.l().b("android-support-nav:fragment:navControllerState");
                if (b10 != null) {
                    sVar.i0(b10);
                }
                navHostFragment.l().h("android-support-nav:fragment:navControllerState", new c(sVar));
                Bundle b11 = navHostFragment.l().b("android-support-nav:fragment:graphId");
                if (b11 != null) {
                    navHostFragment.f3413j0 = b11.getInt("android-support-nav:fragment:graphId");
                }
                navHostFragment.l().h("android-support-nav:fragment:graphId", new d(navHostFragment));
                if (navHostFragment.f3413j0 != 0) {
                    sVar.l0(navHostFragment.f3413j0);
                } else {
                    Bundle u10 = navHostFragment.u();
                    int i10 = u10 != null ? u10.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle = u10 != null ? u10.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (i10 != 0) {
                        sVar.m0(i10, bundle);
                    }
                }
                return sVar;
            }
            throw new IllegalStateException("NavController cannot be created before the fragment is attached".toString());
        }
    }

    private final int Y1() {
        int G = G();
        return (G == 0 || G == -1) ? e.nav_host_fragment_container : G;
    }

    public void C0(Bundle bundle) {
        Z1();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f3414k0 = true;
            O().n().r(this).h();
        }
        super.C0(bundle);
    }

    public View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.f(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        l.e(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(Y1());
        return fragmentContainerView;
    }

    public void J0() {
        super.J0();
        View view = this.f3412i0;
        if (view != null && a0.c(view) == Z1()) {
            a0.f(view, (k) null);
        }
        this.f3412i0 = null;
    }

    public void O0(Context context, AttributeSet attributeSet, Bundle bundle) {
        l.f(context, "context");
        l.f(attributeSet, "attrs");
        super.O0(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.f16281g);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(g0.f16282h, 0);
        if (resourceId != 0) {
            this.f3413j0 = resourceId;
        }
        x xVar = x.f30437a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.f17289e);
        l.e(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(f.f17290f, false)) {
            this.f3414k0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    /* access modifiers changed from: protected */
    public b0 X1() {
        Context E1 = E1();
        l.e(E1, "requireContext()");
        q v10 = v();
        l.e(v10, "childFragmentManager");
        return new a(E1, v10, Y1());
    }

    public void Y0(Bundle bundle) {
        l.f(bundle, "outState");
        super.Y0(bundle);
        if (this.f3414k0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    public final s Z1() {
        return (s) this.f3411h0.getValue();
    }

    /* access modifiers changed from: protected */
    public void a2(k kVar) {
        l.f(kVar, "navController");
        c0 I = kVar.I();
        Context E1 = E1();
        l.e(E1, "requireContext()");
        q v10 = v();
        l.e(v10, "childFragmentManager");
        I.c(new v0.b(E1, v10));
        kVar.I().c(X1());
    }

    public void b1(View view, Bundle bundle) {
        l.f(view, "view");
        super.b1(view, bundle);
        if (view instanceof ViewGroup) {
            a0.f(view, Z1());
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                l.d(parent, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) parent;
                this.f3412i0 = view2;
                l.c(view2);
                if (view2.getId() == G()) {
                    View view3 = this.f3412i0;
                    l.c(view3);
                    a0.f(view3, Z1());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }

    /* access modifiers changed from: protected */
    public void b2(s sVar) {
        l.f(sVar, "navHostController");
        a2(sVar);
    }

    public void z0(Context context) {
        l.f(context, "context");
        super.z0(context);
        if (this.f3414k0) {
            O().n().r(this).h();
        }
    }
}
