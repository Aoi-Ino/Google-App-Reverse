package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.core.view.m0;
import androidx.core.view.s0;
import androidx.core.view.u0;
import f.e;
import f.f;
import f.h;
import f.j;

public class z0 implements e0 {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f1603a;

    /* renamed from: b  reason: collision with root package name */
    private int f1604b;

    /* renamed from: c  reason: collision with root package name */
    private View f1605c;

    /* renamed from: d  reason: collision with root package name */
    private View f1606d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1607e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1608f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1609g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1610h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f1611i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1612j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1613k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f1614l;

    /* renamed from: m  reason: collision with root package name */
    boolean f1615m;

    /* renamed from: n  reason: collision with root package name */
    private c f1616n;

    /* renamed from: o  reason: collision with root package name */
    private int f1617o;

    /* renamed from: p  reason: collision with root package name */
    private int f1618p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f1619q;

    class a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final androidx.appcompat.view.menu.a f1620e;

        a() {
            this.f1620e = new androidx.appcompat.view.menu.a(z0.this.f1603a.getContext(), 0, 16908332, 0, 0, z0.this.f1611i);
        }

        public void onClick(View view) {
            z0 z0Var = z0.this;
            Window.Callback callback = z0Var.f1614l;
            if (callback != null && z0Var.f1615m) {
                callback.onMenuItemSelected(0, this.f1620e);
            }
        }
    }

    class b extends u0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1622a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1623b;

        b(int i10) {
            this.f1623b = i10;
        }

        public void a(View view) {
            this.f1622a = true;
        }

        public void b(View view) {
            if (!this.f1622a) {
                z0.this.f1603a.setVisibility(this.f1623b);
            }
        }

        public void c(View view) {
            z0.this.f1603a.setVisibility(0);
        }
    }

    public z0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, h.abc_action_bar_up_description, e.abc_ic_ab_back_material);
    }

    private void F(CharSequence charSequence) {
        this.f1611i = charSequence;
        if ((this.f1604b & 8) != 0) {
            this.f1603a.setTitle(charSequence);
            if (this.f1610h) {
                m0.t0(this.f1603a.getRootView(), charSequence);
            }
        }
    }

    private void G() {
        if ((this.f1604b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1613k)) {
            this.f1603a.setNavigationContentDescription(this.f1618p);
        } else {
            this.f1603a.setNavigationContentDescription(this.f1613k);
        }
    }

    private void H() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1604b & 4) != 0) {
            toolbar = this.f1603a;
            drawable = this.f1609g;
            if (drawable == null) {
                drawable = this.f1619q;
            }
        } else {
            toolbar = this.f1603a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void I() {
        Drawable drawable;
        int i10 = this.f1604b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1608f) == null) {
            drawable = this.f1607e;
        }
        this.f1603a.setLogo(drawable);
    }

    private int z() {
        if (this.f1603a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1619q = this.f1603a.getNavigationIcon();
        return 15;
    }

    public void A(View view) {
        View view2 = this.f1606d;
        if (!(view2 == null || (this.f1604b & 16) == 0)) {
            this.f1603a.removeView(view2);
        }
        this.f1606d = view;
        if (view != null && (this.f1604b & 16) != 0) {
            this.f1603a.addView(view);
        }
    }

    public void B(int i10) {
        if (i10 != this.f1618p) {
            this.f1618p = i10;
            if (TextUtils.isEmpty(this.f1603a.getNavigationContentDescription())) {
                s(this.f1618p);
            }
        }
    }

    public void C(Drawable drawable) {
        this.f1608f = drawable;
        I();
    }

    public void D(CharSequence charSequence) {
        this.f1613k = charSequence;
        G();
    }

    public void E(CharSequence charSequence) {
        this.f1612j = charSequence;
        if ((this.f1604b & 8) != 0) {
            this.f1603a.setSubtitle(charSequence);
        }
    }

    public void a(Menu menu, m.a aVar) {
        if (this.f1616n == null) {
            c cVar = new c(this.f1603a.getContext());
            this.f1616n = cVar;
            cVar.s(f.action_menu_presenter);
        }
        this.f1616n.n(aVar);
        this.f1603a.L((g) menu, this.f1616n);
    }

    public boolean b() {
        return this.f1603a.C();
    }

    public void c() {
        this.f1615m = true;
    }

    public void collapseActionView() {
        this.f1603a.e();
    }

    public boolean d() {
        return this.f1603a.B();
    }

    public boolean e() {
        return this.f1603a.x();
    }

    public boolean f() {
        return this.f1603a.S();
    }

    public boolean g() {
        return this.f1603a.d();
    }

    public Context getContext() {
        return this.f1603a.getContext();
    }

    public CharSequence getTitle() {
        return this.f1603a.getTitle();
    }

    public void h() {
        this.f1603a.f();
    }

    public void i(m.a aVar, g.a aVar2) {
        this.f1603a.N(aVar, aVar2);
    }

    public void j(int i10) {
        this.f1603a.setVisibility(i10);
    }

    public void k(p0 p0Var) {
        Toolbar toolbar;
        View view = this.f1605c;
        if (view != null && view.getParent() == (toolbar = this.f1603a)) {
            toolbar.removeView(this.f1605c);
        }
        this.f1605c = p0Var;
    }

    public ViewGroup l() {
        return this.f1603a;
    }

    public void m(boolean z10) {
    }

    public boolean n() {
        return this.f1603a.w();
    }

    public void o(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f1604b ^ i10;
        this.f1604b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i11 & 3) != 0) {
                I();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1603a.setTitle(this.f1611i);
                    toolbar = this.f1603a;
                    charSequence = this.f1612j;
                } else {
                    charSequence = null;
                    this.f1603a.setTitle((CharSequence) null);
                    toolbar = this.f1603a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) != 0 && (view = this.f1606d) != null) {
                if ((i10 & 16) != 0) {
                    this.f1603a.addView(view);
                } else {
                    this.f1603a.removeView(view);
                }
            }
        }
    }

    public int p() {
        return this.f1604b;
    }

    public Menu q() {
        return this.f1603a.getMenu();
    }

    public void r(int i10) {
        C(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void s(int i10) {
        D(i10 == 0 ? null : getContext().getString(i10));
    }

    public void setIcon(int i10) {
        setIcon(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1610h = true;
        F(charSequence);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1614l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1610h) {
            F(charSequence);
        }
    }

    public int t() {
        return this.f1617o;
    }

    public s0 u(int i10, long j10) {
        return m0.e(this.f1603a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void x(Drawable drawable) {
        this.f1609g = drawable;
        H();
    }

    public void y(boolean z10) {
        this.f1603a.setCollapsible(z10);
    }

    public z0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1617o = 0;
        this.f1618p = 0;
        this.f1603a = toolbar;
        this.f1611i = toolbar.getTitle();
        this.f1612j = toolbar.getSubtitle();
        this.f1610h = this.f1611i != null;
        this.f1609g = toolbar.getNavigationIcon();
        v0 v10 = v0.v(toolbar.getContext(), (AttributeSet) null, j.f11178a, f.a.actionBarStyle, 0);
        this.f1619q = v10.g(j.f11233l);
        if (z10) {
            CharSequence p10 = v10.p(j.f11263r);
            if (!TextUtils.isEmpty(p10)) {
                setTitle(p10);
            }
            CharSequence p11 = v10.p(j.f11253p);
            if (!TextUtils.isEmpty(p11)) {
                E(p11);
            }
            Drawable g10 = v10.g(j.f11243n);
            if (g10 != null) {
                C(g10);
            }
            Drawable g11 = v10.g(j.f11238m);
            if (g11 != null) {
                setIcon(g11);
            }
            if (this.f1609g == null && (drawable = this.f1619q) != null) {
                x(drawable);
            }
            o(v10.k(j.f11213h, 0));
            int n10 = v10.n(j.f11208g, 0);
            if (n10 != 0) {
                A(LayoutInflater.from(this.f1603a.getContext()).inflate(n10, this.f1603a, false));
                o(this.f1604b | 16);
            }
            int m10 = v10.m(j.f11223j, 0);
            if (m10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1603a.getLayoutParams();
                layoutParams.height = m10;
                this.f1603a.setLayoutParams(layoutParams);
            }
            int e10 = v10.e(j.f11203f, -1);
            int e11 = v10.e(j.f11198e, -1);
            if (e10 >= 0 || e11 >= 0) {
                this.f1603a.K(Math.max(e10, 0), Math.max(e11, 0));
            }
            int n11 = v10.n(j.f11268s, 0);
            if (n11 != 0) {
                Toolbar toolbar2 = this.f1603a;
                toolbar2.P(toolbar2.getContext(), n11);
            }
            int n12 = v10.n(j.f11258q, 0);
            if (n12 != 0) {
                Toolbar toolbar3 = this.f1603a;
                toolbar3.O(toolbar3.getContext(), n12);
            }
            int n13 = v10.n(j.f11248o, 0);
            if (n13 != 0) {
                this.f1603a.setPopupTheme(n13);
            }
        } else {
            this.f1604b = z();
        }
        v10.w();
        B(i10);
        this.f1613k = this.f1603a.getNavigationContentDescription();
        this.f1603a.setNavigationOnClickListener(new a());
    }

    public void setIcon(Drawable drawable) {
        this.f1607e = drawable;
        I();
    }
}
