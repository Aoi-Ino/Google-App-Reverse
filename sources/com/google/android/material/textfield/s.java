package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.v0;
import androidx.core.view.accessibility.c;
import androidx.core.view.m0;
import androidx.core.view.r;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.q;
import com.google.android.material.internal.u;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q4.f;
import q4.h;
import q4.i;
import q4.k;

class s extends LinearLayout {
    private final TextInputLayout.f A;

    /* renamed from: e  reason: collision with root package name */
    final TextInputLayout f6458e;

    /* renamed from: f  reason: collision with root package name */
    private final FrameLayout f6459f;

    /* renamed from: g  reason: collision with root package name */
    private final CheckableImageButton f6460g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f6461h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f6462i;

    /* renamed from: j  reason: collision with root package name */
    private View.OnLongClickListener f6463j;

    /* renamed from: k  reason: collision with root package name */
    private final CheckableImageButton f6464k;

    /* renamed from: l  reason: collision with root package name */
    private final d f6465l;

    /* renamed from: m  reason: collision with root package name */
    private int f6466m = 0;

    /* renamed from: n  reason: collision with root package name */
    private final LinkedHashSet f6467n = new LinkedHashSet();

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f6468o;

    /* renamed from: p  reason: collision with root package name */
    private PorterDuff.Mode f6469p;

    /* renamed from: q  reason: collision with root package name */
    private int f6470q;

    /* renamed from: r  reason: collision with root package name */
    private ImageView.ScaleType f6471r;

    /* renamed from: s  reason: collision with root package name */
    private View.OnLongClickListener f6472s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f6473t;

    /* renamed from: u  reason: collision with root package name */
    private final TextView f6474u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6475v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public EditText f6476w;

    /* renamed from: x  reason: collision with root package name */
    private final AccessibilityManager f6477x;

    /* renamed from: y  reason: collision with root package name */
    private c.b f6478y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final TextWatcher f6479z = new a();

    class a extends q {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            s.this.m().a(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            s.this.m().b(charSequence, i10, i11, i12);
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        public void a(TextInputLayout textInputLayout) {
            if (s.this.f6476w != textInputLayout.getEditText()) {
                if (s.this.f6476w != null) {
                    s.this.f6476w.removeTextChangedListener(s.this.f6479z);
                    if (s.this.f6476w.getOnFocusChangeListener() == s.this.m().e()) {
                        s.this.f6476w.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                    }
                }
                EditText unused = s.this.f6476w = textInputLayout.getEditText();
                if (s.this.f6476w != null) {
                    s.this.f6476w.addTextChangedListener(s.this.f6479z);
                }
                s.this.m().n(s.this.f6476w);
                s sVar = s.this;
                sVar.h0(sVar.m());
            }
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        public void onViewAttachedToWindow(View view) {
            s.this.g();
        }

        public void onViewDetachedFromWindow(View view) {
            s.this.M();
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray f6483a = new SparseArray();

        /* renamed from: b  reason: collision with root package name */
        private final s f6484b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f6485c;

        /* renamed from: d  reason: collision with root package name */
        private final int f6486d;

        d(s sVar, v0 v0Var) {
            this.f6484b = sVar;
            this.f6485c = v0Var.n(k.f15065j7, 0);
            this.f6486d = v0Var.n(k.H7, 0);
        }

        private t b(int i10) {
            if (i10 == -1) {
                return new g(this.f6484b);
            }
            if (i10 == 0) {
                return new x(this.f6484b);
            }
            if (i10 == 1) {
                return new z(this.f6484b, this.f6486d);
            }
            if (i10 == 2) {
                return new f(this.f6484b);
            }
            if (i10 == 3) {
                return new q(this.f6484b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        /* access modifiers changed from: package-private */
        public t c(int i10) {
            t tVar = (t) this.f6483a.get(i10);
            if (tVar != null) {
                return tVar;
            }
            t b10 = b(i10);
            this.f6483a.append(i10, b10);
            return b10;
        }
    }

    s(TextInputLayout textInputLayout, v0 v0Var) {
        super(textInputLayout.getContext());
        b bVar = new b();
        this.A = bVar;
        this.f6477x = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f6458e = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f6459f = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i10 = i(this, from, f.text_input_error_icon);
        this.f6460g = i10;
        CheckableImageButton i11 = i(frameLayout, from, f.text_input_end_icon);
        this.f6464k = i11;
        this.f6465l = new d(this, v0Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f6474u = appCompatTextView;
        C(v0Var);
        B(v0Var);
        D(v0Var);
        frameLayout.addView(i11);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(i10);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(v0 v0Var) {
        int i10 = k.I7;
        if (!v0Var.s(i10)) {
            int i11 = k.f15105n7;
            if (v0Var.s(i11)) {
                this.f6468o = f5.c.b(getContext(), v0Var, i11);
            }
            int i12 = k.f15115o7;
            if (v0Var.s(i12)) {
                this.f6469p = u.i(v0Var.k(i12, -1), (PorterDuff.Mode) null);
            }
        }
        int i13 = k.f15085l7;
        if (v0Var.s(i13)) {
            U(v0Var.k(i13, 0));
            int i14 = k.f15055i7;
            if (v0Var.s(i14)) {
                Q(v0Var.p(i14));
            }
            O(v0Var.a(k.f15045h7, true));
        } else if (v0Var.s(i10)) {
            int i15 = k.J7;
            if (v0Var.s(i15)) {
                this.f6468o = f5.c.b(getContext(), v0Var, i15);
            }
            int i16 = k.K7;
            if (v0Var.s(i16)) {
                this.f6469p = u.i(v0Var.k(i16, -1), (PorterDuff.Mode) null);
            }
            U(v0Var.a(i10, false) ? 1 : 0);
            Q(v0Var.p(k.G7));
        }
        T(v0Var.f(k.f15075k7, getResources().getDimensionPixelSize(q4.d.mtrl_min_touch_target_size)));
        int i17 = k.f15095m7;
        if (v0Var.s(i17)) {
            X(u.b(v0Var.k(i17, -1)));
        }
    }

    private void C(v0 v0Var) {
        int i10 = k.f15160t7;
        if (v0Var.s(i10)) {
            this.f6461h = f5.c.b(getContext(), v0Var, i10);
        }
        int i11 = k.f15169u7;
        if (v0Var.s(i11)) {
            this.f6462i = u.i(v0Var.k(i11, -1), (PorterDuff.Mode) null);
        }
        int i12 = k.f15151s7;
        if (v0Var.s(i12)) {
            c0(v0Var.g(i12));
        }
        this.f6460g.setContentDescription(getResources().getText(i.error_icon_content_description));
        m0.B0(this.f6460g, 2);
        this.f6460g.setClickable(false);
        this.f6460g.setPressable(false);
        this.f6460g.setFocusable(false);
    }

    private void D(v0 v0Var) {
        this.f6474u.setVisibility(8);
        this.f6474u.setId(f.textinput_suffix_text);
        this.f6474u.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        m0.s0(this.f6474u, 1);
        q0(v0Var.n(k.Z7, 0));
        int i10 = k.f14976a8;
        if (v0Var.s(i10)) {
            r0(v0Var.c(i10));
        }
        p0(v0Var.p(k.Y7));
    }

    /* access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        c.b bVar = this.f6478y;
        if (bVar != null && (accessibilityManager = this.f6477x) != null) {
            androidx.core.view.accessibility.c.b(accessibilityManager, bVar);
        }
    }

    /* access modifiers changed from: private */
    public void g() {
        if (this.f6478y != null && this.f6477x != null && m0.T(this)) {
            androidx.core.view.accessibility.c.a(this.f6477x, this.f6478y);
        }
    }

    /* access modifiers changed from: private */
    public void h0(t tVar) {
        if (this.f6476w != null) {
            if (tVar.e() != null) {
                this.f6476w.setOnFocusChangeListener(tVar.e());
            }
            if (tVar.g() != null) {
                this.f6464k.setOnFocusChangeListener(tVar.g());
            }
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(h.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        u.e(checkableImageButton);
        if (f5.c.g(getContext())) {
            r.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i10) {
        Iterator it = this.f6467n.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void s0(t tVar) {
        tVar.s();
        this.f6478y = tVar.h();
        g();
    }

    private int t(t tVar) {
        int a10 = this.f6465l.f6485c;
        return a10 == 0 ? tVar.d() : a10;
    }

    private void t0(t tVar) {
        M();
        this.f6478y = null;
        tVar.u();
    }

    private void u0(boolean z10) {
        if (!z10 || n() == null) {
            u.a(this.f6458e, this.f6464k, this.f6468o, this.f6469p);
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.r(n()).mutate();
        androidx.core.graphics.drawable.a.n(mutate, this.f6458e.getErrorCurrentTextColors());
        this.f6464k.setImageDrawable(mutate);
    }

    private void v0() {
        int i10 = 8;
        this.f6459f.setVisibility((this.f6464k.getVisibility() != 0 || G()) ? 8 : 0);
        boolean z10 = (this.f6473t == null || this.f6475v) ? true : false;
        if (F() || G() || !z10) {
            i10 = 0;
        }
        setVisibility(i10);
    }

    private void w0() {
        int i10 = 0;
        boolean z10 = s() != null && this.f6458e.N() && this.f6458e.d0();
        CheckableImageButton checkableImageButton = this.f6460g;
        if (!z10) {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        v0();
        x0();
        if (!A()) {
            this.f6458e.o0();
        }
    }

    private void y0() {
        int visibility = this.f6474u.getVisibility();
        boolean z10 = false;
        int i10 = (this.f6473t == null || this.f6475v) ? 8 : 0;
        if (visibility != i10) {
            t m10 = m();
            if (i10 == 0) {
                z10 = true;
            }
            m10.q(z10);
        }
        v0();
        this.f6474u.setVisibility(i10);
        this.f6458e.o0();
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f6466m != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return A() && this.f6464k.isChecked();
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        return this.f6459f.getVisibility() == 0 && this.f6464k.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.f6460g.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public void H(boolean z10) {
        this.f6475v = z10;
        y0();
    }

    /* access modifiers changed from: package-private */
    public void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f6458e.d0());
        }
    }

    /* access modifiers changed from: package-private */
    public void J() {
        u.d(this.f6458e, this.f6464k, this.f6468o);
    }

    /* access modifiers changed from: package-private */
    public void K() {
        u.d(this.f6458e, this.f6460g, this.f6461h);
    }

    /* access modifiers changed from: package-private */
    public void L(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean isChecked;
        t m10 = m();
        boolean z12 = true;
        if (!m10.l() || (isChecked = this.f6464k.isChecked()) == m10.m()) {
            z11 = false;
        } else {
            this.f6464k.setChecked(!isChecked);
            z11 = true;
        }
        if (!m10.j() || (isActivated = this.f6464k.isActivated()) == m10.k()) {
            z12 = z11;
        } else {
            N(!isActivated);
        }
        if (z10 || z12) {
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void N(boolean z10) {
        this.f6464k.setActivated(z10);
    }

    /* access modifiers changed from: package-private */
    public void O(boolean z10) {
        this.f6464k.setCheckable(z10);
    }

    /* access modifiers changed from: package-private */
    public void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    /* access modifiers changed from: package-private */
    public void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f6464k.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void R(int i10) {
        S(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    /* access modifiers changed from: package-private */
    public void S(Drawable drawable) {
        this.f6464k.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f6458e, this.f6464k, this.f6468o, this.f6469p);
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i10 != this.f6470q) {
            this.f6470q = i10;
            u.g(this.f6464k, i10);
            u.g(this.f6460g, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void U(int i10) {
        if (this.f6466m != i10) {
            t0(m());
            int i11 = this.f6466m;
            this.f6466m = i10;
            j(i11);
            a0(i10 != 0);
            t m10 = m();
            R(t(m10));
            P(m10.c());
            O(m10.l());
            if (m10.i(this.f6458e.getBoxBackgroundMode())) {
                s0(m10);
                V(m10.f());
                EditText editText = this.f6476w;
                if (editText != null) {
                    m10.n(editText);
                    h0(m10);
                }
                u.a(this.f6458e, this.f6464k, this.f6468o, this.f6469p);
                L(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + this.f6458e.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void V(View.OnClickListener onClickListener) {
        u.h(this.f6464k, onClickListener, this.f6472s);
    }

    /* access modifiers changed from: package-private */
    public void W(View.OnLongClickListener onLongClickListener) {
        this.f6472s = onLongClickListener;
        u.i(this.f6464k, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void X(ImageView.ScaleType scaleType) {
        this.f6471r = scaleType;
        u.j(this.f6464k, scaleType);
        u.j(this.f6460g, scaleType);
    }

    /* access modifiers changed from: package-private */
    public void Y(ColorStateList colorStateList) {
        if (this.f6468o != colorStateList) {
            this.f6468o = colorStateList;
            u.a(this.f6458e, this.f6464k, colorStateList, this.f6469p);
        }
    }

    /* access modifiers changed from: package-private */
    public void Z(PorterDuff.Mode mode) {
        if (this.f6469p != mode) {
            this.f6469p = mode;
            u.a(this.f6458e, this.f6464k, this.f6468o, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void a0(boolean z10) {
        if (F() != z10) {
            this.f6464k.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f6458e.o0();
        }
    }

    /* access modifiers changed from: package-private */
    public void b0(int i10) {
        c0(i10 != 0 ? g.a.b(getContext(), i10) : null);
        K();
    }

    /* access modifiers changed from: package-private */
    public void c0(Drawable drawable) {
        this.f6460g.setImageDrawable(drawable);
        w0();
        u.a(this.f6458e, this.f6460g, this.f6461h, this.f6462i);
    }

    /* access modifiers changed from: package-private */
    public void d0(View.OnClickListener onClickListener) {
        u.h(this.f6460g, onClickListener, this.f6463j);
    }

    /* access modifiers changed from: package-private */
    public void e0(View.OnLongClickListener onLongClickListener) {
        this.f6463j = onLongClickListener;
        u.i(this.f6460g, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void f0(ColorStateList colorStateList) {
        if (this.f6461h != colorStateList) {
            this.f6461h = colorStateList;
            u.a(this.f6458e, this.f6460g, colorStateList, this.f6462i);
        }
    }

    /* access modifiers changed from: package-private */
    public void g0(PorterDuff.Mode mode) {
        if (this.f6462i != mode) {
            this.f6462i = mode;
            u.a(this.f6458e, this.f6460g, this.f6461h, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f6464k.performClick();
        this.f6464k.jumpDrawablesToCurrentState();
    }

    /* access modifiers changed from: package-private */
    public void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    /* access modifiers changed from: package-private */
    public void j0(CharSequence charSequence) {
        this.f6464k.setContentDescription(charSequence);
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton k() {
        if (G()) {
            return this.f6460g;
        }
        if (!A() || !F()) {
            return null;
        }
        return this.f6464k;
    }

    /* access modifiers changed from: package-private */
    public void k0(int i10) {
        l0(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    /* access modifiers changed from: package-private */
    public CharSequence l() {
        return this.f6464k.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public void l0(Drawable drawable) {
        this.f6464k.setImageDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public t m() {
        return this.f6465l.c(this.f6466m);
    }

    /* access modifiers changed from: package-private */
    public void m0(boolean z10) {
        if (z10 && this.f6466m != 1) {
            U(1);
        } else if (!z10) {
            U(0);
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable n() {
        return this.f6464k.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public void n0(ColorStateList colorStateList) {
        this.f6468o = colorStateList;
        u.a(this.f6458e, this.f6464k, colorStateList, this.f6469p);
    }

    /* access modifiers changed from: package-private */
    public int o() {
        return this.f6470q;
    }

    /* access modifiers changed from: package-private */
    public void o0(PorterDuff.Mode mode) {
        this.f6469p = mode;
        u.a(this.f6458e, this.f6464k, this.f6468o, mode);
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return this.f6466m;
    }

    /* access modifiers changed from: package-private */
    public void p0(CharSequence charSequence) {
        this.f6473t = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f6474u.setText(charSequence);
        y0();
    }

    /* access modifiers changed from: package-private */
    public ImageView.ScaleType q() {
        return this.f6471r;
    }

    /* access modifiers changed from: package-private */
    public void q0(int i10) {
        androidx.core.widget.i.n(this.f6474u, i10);
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton r() {
        return this.f6464k;
    }

    /* access modifiers changed from: package-private */
    public void r0(ColorStateList colorStateList) {
        this.f6474u.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public Drawable s() {
        return this.f6460g.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public CharSequence u() {
        return this.f6464k.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public Drawable v() {
        return this.f6464k.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public CharSequence w() {
        return this.f6473t;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList x() {
        return this.f6474u.getTextColors();
    }

    /* access modifiers changed from: package-private */
    public void x0() {
        if (this.f6458e.f6363h != null) {
            m0.G0(this.f6474u, getContext().getResources().getDimensionPixelSize(q4.d.material_input_text_to_prefix_suffix_padding), this.f6458e.f6363h.getPaddingTop(), (F() || G()) ? 0 : m0.F(this.f6458e.f6363h), this.f6458e.f6363h.getPaddingBottom());
        }
    }

    /* access modifiers changed from: package-private */
    public int y() {
        return m0.F(this) + m0.F(this.f6474u) + ((F() || G()) ? this.f6464k.getMeasuredWidth() + r.b((ViewGroup.MarginLayoutParams) this.f6464k.getLayoutParams()) : 0);
    }

    /* access modifiers changed from: package-private */
    public TextView z() {
        return this.f6474u;
    }
}
