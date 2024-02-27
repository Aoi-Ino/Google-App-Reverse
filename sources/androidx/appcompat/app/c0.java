package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.b;
import androidx.appcompat.view.h;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.p0;
import androidx.core.view.m0;
import androidx.core.view.s0;
import androidx.core.view.t0;
import androidx.core.view.u0;
import androidx.core.view.v0;
import f.f;
import f.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class c0 extends a implements ActionBarOverlayLayout.d {
    private static final Interpolator D = new AccelerateInterpolator();
    private static final Interpolator E = new DecelerateInterpolator();
    final t0 A = new a();
    final t0 B = new b();
    final v0 C = new c();

    /* renamed from: a  reason: collision with root package name */
    Context f626a;

    /* renamed from: b  reason: collision with root package name */
    private Context f627b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f628c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarOverlayLayout f629d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f630e;

    /* renamed from: f  reason: collision with root package name */
    e0 f631f;

    /* renamed from: g  reason: collision with root package name */
    ActionBarContextView f632g;

    /* renamed from: h  reason: collision with root package name */
    View f633h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f634i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private int f635j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f636k;

    /* renamed from: l  reason: collision with root package name */
    d f637l;

    /* renamed from: m  reason: collision with root package name */
    androidx.appcompat.view.b f638m;

    /* renamed from: n  reason: collision with root package name */
    b.a f639n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f640o;

    /* renamed from: p  reason: collision with root package name */
    private ArrayList f641p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private boolean f642q;

    /* renamed from: r  reason: collision with root package name */
    private int f643r = 0;

    /* renamed from: s  reason: collision with root package name */
    boolean f644s = true;

    /* renamed from: t  reason: collision with root package name */
    boolean f645t;

    /* renamed from: u  reason: collision with root package name */
    boolean f646u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f647v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f648w = true;

    /* renamed from: x  reason: collision with root package name */
    h f649x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f650y;

    /* renamed from: z  reason: collision with root package name */
    boolean f651z;

    class a extends u0 {
        a() {
        }

        public void b(View view) {
            View view2;
            c0 c0Var = c0.this;
            if (c0Var.f644s && (view2 = c0Var.f633h) != null) {
                view2.setTranslationY(0.0f);
                c0.this.f630e.setTranslationY(0.0f);
            }
            c0.this.f630e.setVisibility(8);
            c0.this.f630e.setTransitioning(false);
            c0 c0Var2 = c0.this;
            c0Var2.f649x = null;
            c0Var2.C();
            ActionBarOverlayLayout actionBarOverlayLayout = c0.this.f629d;
            if (actionBarOverlayLayout != null) {
                m0.n0(actionBarOverlayLayout);
            }
        }
    }

    class b extends u0 {
        b() {
        }

        public void b(View view) {
            c0 c0Var = c0.this;
            c0Var.f649x = null;
            c0Var.f630e.requestLayout();
        }
    }

    class c implements v0 {
        c() {
        }

        public void a(View view) {
            ((View) c0.this.f630e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements g.a {

        /* renamed from: g  reason: collision with root package name */
        private final Context f655g;

        /* renamed from: h  reason: collision with root package name */
        private final g f656h;

        /* renamed from: i  reason: collision with root package name */
        private b.a f657i;

        /* renamed from: j  reason: collision with root package name */
        private WeakReference f658j;

        public d(Context context, b.a aVar) {
            this.f655g = context;
            this.f657i = aVar;
            g W = new g(context).W(1);
            this.f656h = W;
            W.V(this);
        }

        public boolean a(g gVar, MenuItem menuItem) {
            b.a aVar = this.f657i;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        public void b(g gVar) {
            if (this.f657i != null) {
                k();
                c0.this.f632g.l();
            }
        }

        public void c() {
            c0 c0Var = c0.this;
            if (c0Var.f637l == this) {
                if (!c0.B(c0Var.f645t, c0Var.f646u, false)) {
                    c0 c0Var2 = c0.this;
                    c0Var2.f638m = this;
                    c0Var2.f639n = this.f657i;
                } else {
                    this.f657i.b(this);
                }
                this.f657i = null;
                c0.this.A(false);
                c0.this.f632g.g();
                c0 c0Var3 = c0.this;
                c0Var3.f629d.setHideOnContentScrollEnabled(c0Var3.f651z);
                c0.this.f637l = null;
            }
        }

        public View d() {
            WeakReference weakReference = this.f658j;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f656h;
        }

        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f655g);
        }

        public CharSequence g() {
            return c0.this.f632g.getSubtitle();
        }

        public CharSequence i() {
            return c0.this.f632g.getTitle();
        }

        public void k() {
            if (c0.this.f637l == this) {
                this.f656h.h0();
                try {
                    this.f657i.a(this, this.f656h);
                } finally {
                    this.f656h.g0();
                }
            }
        }

        public boolean l() {
            return c0.this.f632g.j();
        }

        public void m(View view) {
            c0.this.f632g.setCustomView(view);
            this.f658j = new WeakReference(view);
        }

        public void n(int i10) {
            o(c0.this.f626a.getResources().getString(i10));
        }

        public void o(CharSequence charSequence) {
            c0.this.f632g.setSubtitle(charSequence);
        }

        public void q(int i10) {
            r(c0.this.f626a.getResources().getString(i10));
        }

        public void r(CharSequence charSequence) {
            c0.this.f632g.setTitle(charSequence);
        }

        public void s(boolean z10) {
            super.s(z10);
            c0.this.f632g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f656h.h0();
            try {
                return this.f657i.d(this, this.f656h);
            } finally {
                this.f656h.g0();
            }
        }
    }

    public c0(Activity activity, boolean z10) {
        this.f628c = activity;
        View decorView = activity.getWindow().getDecorView();
        I(decorView);
        if (!z10) {
            this.f633h = decorView.findViewById(16908290);
        }
    }

    static boolean B(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return !z10 && !z11;
    }

    private e0 F(View view) {
        if (view instanceof e0) {
            return (e0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void H() {
        if (this.f647v) {
            this.f647v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f629d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            Q(false);
        }
    }

    private void I(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.decor_content_parent);
        this.f629d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f631f = F(view.findViewById(f.action_bar));
        this.f632g = (ActionBarContextView) view.findViewById(f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.action_bar_container);
        this.f630e = actionBarContainer;
        e0 e0Var = this.f631f;
        if (e0Var == null || this.f632g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f626a = e0Var.getContext();
        boolean z10 = (this.f631f.p() & 4) != 0;
        if (z10) {
            this.f636k = true;
        }
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(this.f626a);
        N(b10.a() || z10);
        L(b10.e());
        TypedArray obtainStyledAttributes = this.f626a.obtainStyledAttributes((AttributeSet) null, j.f11178a, f.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(j.f11228k, false)) {
            M(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.f11218i, 0);
        if (dimensionPixelSize != 0) {
            K((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void L(boolean z10) {
        this.f642q = z10;
        if (!z10) {
            this.f631f.k((p0) null);
            this.f630e.setTabContainer((p0) null);
        } else {
            this.f630e.setTabContainer((p0) null);
            this.f631f.k((p0) null);
        }
        boolean z11 = false;
        boolean z12 = G() == 2;
        this.f631f.y(!this.f642q && z12);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f629d;
        if (!this.f642q && z12) {
            z11 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z11);
    }

    private boolean O() {
        return m0.U(this.f630e);
    }

    private void P() {
        if (!this.f647v) {
            this.f647v = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f629d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            Q(false);
        }
    }

    private void Q(boolean z10) {
        if (B(this.f645t, this.f646u, this.f647v)) {
            if (!this.f648w) {
                this.f648w = true;
                E(z10);
            }
        } else if (this.f648w) {
            this.f648w = false;
            D(z10);
        }
    }

    public void A(boolean z10) {
        s0 s0Var;
        s0 s0Var2;
        if (z10) {
            P();
        } else {
            H();
        }
        if (O()) {
            if (z10) {
                s0Var = this.f631f.u(4, 100);
                s0Var2 = this.f632g.f(0, 200);
            } else {
                s0Var2 = this.f631f.u(0, 200);
                s0Var = this.f632g.f(8, 100);
            }
            h hVar = new h();
            hVar.d(s0Var, s0Var2);
            hVar.h();
        } else if (z10) {
            this.f631f.j(4);
            this.f632g.setVisibility(0);
        } else {
            this.f631f.j(0);
            this.f632g.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        b.a aVar = this.f639n;
        if (aVar != null) {
            aVar.b(this.f638m);
            this.f638m = null;
            this.f639n = null;
        }
    }

    public void D(boolean z10) {
        View view;
        h hVar = this.f649x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f643r != 0 || (!this.f650y && !z10)) {
            this.A.b((View) null);
            return;
        }
        this.f630e.setAlpha(1.0f);
        this.f630e.setTransitioning(true);
        h hVar2 = new h();
        float f10 = (float) (-this.f630e.getHeight());
        if (z10) {
            int[] iArr = {0, 0};
            this.f630e.getLocationInWindow(iArr);
            f10 -= (float) iArr[1];
        }
        s0 m10 = m0.e(this.f630e).m(f10);
        m10.k(this.C);
        hVar2.c(m10);
        if (this.f644s && (view = this.f633h) != null) {
            hVar2.c(m0.e(view).m(f10));
        }
        hVar2.f(D);
        hVar2.e(250);
        hVar2.g(this.A);
        this.f649x = hVar2;
        hVar2.h();
    }

    public void E(boolean z10) {
        View view;
        View view2;
        h hVar = this.f649x;
        if (hVar != null) {
            hVar.a();
        }
        this.f630e.setVisibility(0);
        if (this.f643r != 0 || (!this.f650y && !z10)) {
            this.f630e.setAlpha(1.0f);
            this.f630e.setTranslationY(0.0f);
            if (this.f644s && (view = this.f633h) != null) {
                view.setTranslationY(0.0f);
            }
            this.B.b((View) null);
        } else {
            this.f630e.setTranslationY(0.0f);
            float f10 = (float) (-this.f630e.getHeight());
            if (z10) {
                int[] iArr = {0, 0};
                this.f630e.getLocationInWindow(iArr);
                f10 -= (float) iArr[1];
            }
            this.f630e.setTranslationY(f10);
            h hVar2 = new h();
            s0 m10 = m0.e(this.f630e).m(0.0f);
            m10.k(this.C);
            hVar2.c(m10);
            if (this.f644s && (view2 = this.f633h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(m0.e(this.f633h).m(0.0f));
            }
            hVar2.f(E);
            hVar2.e(250);
            hVar2.g(this.B);
            this.f649x = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f629d;
        if (actionBarOverlayLayout != null) {
            m0.n0(actionBarOverlayLayout);
        }
    }

    public int G() {
        return this.f631f.t();
    }

    public void J(int i10, int i11) {
        int p10 = this.f631f.p();
        if ((i11 & 4) != 0) {
            this.f636k = true;
        }
        this.f631f.o((i10 & i11) | ((~i11) & p10));
    }

    public void K(float f10) {
        m0.y0(this.f630e, f10);
    }

    public void M(boolean z10) {
        if (!z10 || this.f629d.w()) {
            this.f651z = z10;
            this.f629d.setHideOnContentScrollEnabled(z10);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void N(boolean z10) {
        this.f631f.m(z10);
    }

    public void a() {
        if (this.f646u) {
            this.f646u = false;
            Q(true);
        }
    }

    public void b() {
        h hVar = this.f649x;
        if (hVar != null) {
            hVar.a();
            this.f649x = null;
        }
    }

    public void c(int i10) {
        this.f643r = i10;
    }

    public void d() {
    }

    public void e(boolean z10) {
        this.f644s = z10;
    }

    public void f() {
        if (!this.f646u) {
            this.f646u = true;
            Q(true);
        }
    }

    public boolean h() {
        e0 e0Var = this.f631f;
        if (e0Var == null || !e0Var.n()) {
            return false;
        }
        this.f631f.collapseActionView();
        return true;
    }

    public void i(boolean z10) {
        if (z10 != this.f640o) {
            this.f640o = z10;
            if (this.f641p.size() > 0) {
                android.support.v4.media.session.b.a(this.f641p.get(0));
                throw null;
            }
        }
    }

    public int j() {
        return this.f631f.p();
    }

    public Context k() {
        if (this.f627b == null) {
            TypedValue typedValue = new TypedValue();
            this.f626a.getTheme().resolveAttribute(f.a.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f627b = new ContextThemeWrapper(this.f626a, i10);
            } else {
                this.f627b = this.f626a;
            }
        }
        return this.f627b;
    }

    public void m(Configuration configuration) {
        L(androidx.appcompat.view.a.b(this.f626a).e());
    }

    public boolean o(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f637l;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        e10.setQwertyMode(z10);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    public void r(boolean z10) {
        if (!this.f636k) {
            s(z10);
        }
    }

    public void s(boolean z10) {
        J(z10 ? 4 : 0, 4);
    }

    public void t(boolean z10) {
        J(z10 ? 8 : 0, 8);
    }

    public void u(int i10) {
        this.f631f.s(i10);
    }

    public void v(Drawable drawable) {
        this.f631f.x(drawable);
    }

    public void w(boolean z10) {
        h hVar;
        this.f650y = z10;
        if (!z10 && (hVar = this.f649x) != null) {
            hVar.a();
        }
    }

    public void x(CharSequence charSequence) {
        this.f631f.setTitle(charSequence);
    }

    public void y(CharSequence charSequence) {
        this.f631f.setWindowTitle(charSequence);
    }

    public androidx.appcompat.view.b z(b.a aVar) {
        d dVar = this.f637l;
        if (dVar != null) {
            dVar.c();
        }
        this.f629d.setHideOnContentScrollEnabled(false);
        this.f632g.k();
        d dVar2 = new d(this.f632g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f637l = dVar2;
        dVar2.k();
        this.f632g.h(dVar2);
        A(true);
        return dVar2;
    }

    public c0(Dialog dialog) {
        I(dialog.getWindow().getDecorView());
    }
}
