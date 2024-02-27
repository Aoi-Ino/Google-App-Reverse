package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.v0;
import androidx.core.view.accessibility.y;
import androidx.core.view.m0;
import androidx.core.view.r;
import androidx.core.widget.i;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.u;
import f5.c;
import q4.d;
import q4.f;
import q4.h;
import q4.k;

class a0 extends LinearLayout {

    /* renamed from: e  reason: collision with root package name */
    private final TextInputLayout f6408e;

    /* renamed from: f  reason: collision with root package name */
    private final TextView f6409f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f6410g;

    /* renamed from: h  reason: collision with root package name */
    private final CheckableImageButton f6411h;

    /* renamed from: i  reason: collision with root package name */
    private ColorStateList f6412i;

    /* renamed from: j  reason: collision with root package name */
    private PorterDuff.Mode f6413j;

    /* renamed from: k  reason: collision with root package name */
    private int f6414k;

    /* renamed from: l  reason: collision with root package name */
    private ImageView.ScaleType f6415l;

    /* renamed from: m  reason: collision with root package name */
    private View.OnLongClickListener f6416m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6417n;

    a0(TextInputLayout textInputLayout, v0 v0Var) {
        super(textInputLayout.getContext());
        this.f6408e = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(h.design_text_input_start_icon, this, false);
        this.f6411h = checkableImageButton;
        u.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f6409f = appCompatTextView;
        j(v0Var);
        i(v0Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void C() {
        int i10 = 8;
        int i11 = (this.f6410g == null || this.f6417n) ? 8 : 0;
        if (this.f6411h.getVisibility() == 0 || i11 == 0) {
            i10 = 0;
        }
        setVisibility(i10);
        this.f6409f.setVisibility(i11);
        this.f6408e.o0();
    }

    private void i(v0 v0Var) {
        this.f6409f.setVisibility(8);
        this.f6409f.setId(f.textinput_prefix_text);
        this.f6409f.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        m0.s0(this.f6409f, 1);
        o(v0Var.n(k.P7, 0));
        int i10 = k.Q7;
        if (v0Var.s(i10)) {
            p(v0Var.c(i10));
        }
        n(v0Var.p(k.O7));
    }

    private void j(v0 v0Var) {
        if (c.g(getContext())) {
            r.c((ViewGroup.MarginLayoutParams) this.f6411h.getLayoutParams(), 0);
        }
        u((View.OnClickListener) null);
        v((View.OnLongClickListener) null);
        int i10 = k.W7;
        if (v0Var.s(i10)) {
            this.f6412i = c.b(getContext(), v0Var, i10);
        }
        int i11 = k.X7;
        if (v0Var.s(i11)) {
            this.f6413j = u.i(v0Var.k(i11, -1), (PorterDuff.Mode) null);
        }
        int i12 = k.T7;
        if (v0Var.s(i12)) {
            s(v0Var.g(i12));
            int i13 = k.S7;
            if (v0Var.s(i13)) {
                r(v0Var.p(i13));
            }
            q(v0Var.a(k.R7, true));
        }
        t(v0Var.f(k.U7, getResources().getDimensionPixelSize(d.mtrl_min_touch_target_size)));
        int i14 = k.V7;
        if (v0Var.s(i14)) {
            w(u.b(v0Var.k(i14, -1)));
        }
    }

    /* access modifiers changed from: package-private */
    public void A(y yVar) {
        View view;
        if (this.f6409f.getVisibility() == 0) {
            yVar.y0(this.f6409f);
            view = this.f6409f;
        } else {
            view = this.f6411h;
        }
        yVar.M0(view);
    }

    /* access modifiers changed from: package-private */
    public void B() {
        EditText editText = this.f6408e.f6363h;
        if (editText != null) {
            m0.G0(this.f6409f, k() ? 0 : m0.G(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(d.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
        }
    }

    /* access modifiers changed from: package-private */
    public CharSequence a() {
        return this.f6410g;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f6409f.getTextColors();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return m0.G(this) + m0.G(this.f6409f) + (k() ? this.f6411h.getMeasuredWidth() + r.a((ViewGroup.MarginLayoutParams) this.f6411h.getLayoutParams()) : 0);
    }

    /* access modifiers changed from: package-private */
    public TextView d() {
        return this.f6409f;
    }

    /* access modifiers changed from: package-private */
    public CharSequence e() {
        return this.f6411h.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public Drawable f() {
        return this.f6411h.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f6414k;
    }

    /* access modifiers changed from: package-private */
    public ImageView.ScaleType h() {
        return this.f6415l;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f6411h.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public void l(boolean z10) {
        this.f6417n = z10;
        C();
    }

    /* access modifiers changed from: package-private */
    public void m() {
        u.d(this.f6408e, this.f6411h, this.f6412i);
    }

    /* access modifiers changed from: package-private */
    public void n(CharSequence charSequence) {
        this.f6410g = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f6409f.setText(charSequence);
        C();
    }

    /* access modifiers changed from: package-private */
    public void o(int i10) {
        i.n(this.f6409f, i10);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B();
    }

    /* access modifiers changed from: package-private */
    public void p(ColorStateList colorStateList) {
        this.f6409f.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z10) {
        this.f6411h.setCheckable(z10);
    }

    /* access modifiers changed from: package-private */
    public void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f6411h.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void s(Drawable drawable) {
        this.f6411h.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f6408e, this.f6411h, this.f6412i, this.f6413j);
            z(true);
            m();
            return;
        }
        z(false);
        u((View.OnClickListener) null);
        v((View.OnLongClickListener) null);
        r((CharSequence) null);
    }

    /* access modifiers changed from: package-private */
    public void t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i10 != this.f6414k) {
            this.f6414k = i10;
            u.g(this.f6411h, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(View.OnClickListener onClickListener) {
        u.h(this.f6411h, onClickListener, this.f6416m);
    }

    /* access modifiers changed from: package-private */
    public void v(View.OnLongClickListener onLongClickListener) {
        this.f6416m = onLongClickListener;
        u.i(this.f6411h, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void w(ImageView.ScaleType scaleType) {
        this.f6415l = scaleType;
        u.j(this.f6411h, scaleType);
    }

    /* access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList) {
        if (this.f6412i != colorStateList) {
            this.f6412i = colorStateList;
            u.a(this.f6408e, this.f6411h, colorStateList, this.f6413j);
        }
    }

    /* access modifiers changed from: package-private */
    public void y(PorterDuff.Mode mode) {
        if (this.f6413j != mode) {
            this.f6413j = mode;
            u.a(this.f6408e, this.f6411h, this.f6412i, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z10) {
        if (k() != z10) {
            this.f6411h.setVisibility(z10 ? 0 : 8);
            B();
            C();
        }
    }
}
