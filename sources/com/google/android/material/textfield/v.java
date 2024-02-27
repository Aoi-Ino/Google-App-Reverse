package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.m0;
import androidx.core.widget.i;
import d5.h;
import f5.c;
import java.util.ArrayList;
import java.util.List;
import q4.d;
import q4.f;

final class v {
    private ColorStateList A;
    private Typeface B;

    /* renamed from: a  reason: collision with root package name */
    private final int f6491a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6492b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6493c;

    /* renamed from: d  reason: collision with root package name */
    private final TimeInterpolator f6494d;

    /* renamed from: e  reason: collision with root package name */
    private final TimeInterpolator f6495e;

    /* renamed from: f  reason: collision with root package name */
    private final TimeInterpolator f6496f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f6497g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f6498h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f6499i;

    /* renamed from: j  reason: collision with root package name */
    private int f6500j;

    /* renamed from: k  reason: collision with root package name */
    private FrameLayout f6501k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public Animator f6502l;

    /* renamed from: m  reason: collision with root package name */
    private final float f6503m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f6504n;

    /* renamed from: o  reason: collision with root package name */
    private int f6505o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f6506p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6507q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public TextView f6508r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f6509s;

    /* renamed from: t  reason: collision with root package name */
    private int f6510t;

    /* renamed from: u  reason: collision with root package name */
    private int f6511u;

    /* renamed from: v  reason: collision with root package name */
    private ColorStateList f6512v;

    /* renamed from: w  reason: collision with root package name */
    private CharSequence f6513w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f6514x;

    /* renamed from: y  reason: collision with root package name */
    private TextView f6515y;

    /* renamed from: z  reason: collision with root package name */
    private int f6516z;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f6517a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f6518b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f6519c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f6520d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f6517a = i10;
            this.f6518b = textView;
            this.f6519c = i11;
            this.f6520d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = v.this.f6504n = this.f6517a;
            Animator unused2 = v.this.f6502l = null;
            TextView textView = this.f6518b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f6519c == 1 && v.this.f6508r != null) {
                    v.this.f6508r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f6520d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f6520d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f6520d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f6520d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = v.this.f6498h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f6497g = context;
        this.f6498h = textInputLayout;
        this.f6503m = (float) context.getResources().getDimensionPixelSize(d.design_textinput_caption_translate_y);
        int i10 = q4.b.motionDurationShort4;
        this.f6491a = h.f(context, i10, 217);
        this.f6492b = h.f(context, q4.b.motionDurationMedium4, 167);
        this.f6493c = h.f(context, i10, 167);
        int i11 = q4.b.motionEasingEmphasizedDecelerateInterpolator;
        this.f6494d = h.g(context, i11, r4.a.f15585d);
        TimeInterpolator timeInterpolator = r4.a.f15582a;
        this.f6495e = h.g(context, i11, timeInterpolator);
        this.f6496f = h.g(context, q4.b.motionEasingLinearInterpolator, timeInterpolator);
    }

    private void D(int i10, int i11) {
        TextView m10;
        TextView m11;
        if (i10 != i11) {
            if (!(i11 == 0 || (m11 = m(i11)) == null)) {
                m11.setVisibility(0);
                m11.setAlpha(1.0f);
            }
            if (!(i10 == 0 || (m10 = m(i10)) == null)) {
                m10.setVisibility(4);
                if (i10 == 1) {
                    m10.setText((CharSequence) null);
                }
            }
            this.f6504n = i11;
        }
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        return m0.U(this.f6498h) && this.f6498h.isEnabled() && (this.f6505o != this.f6504n || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void S(int i10, int i11, boolean z10) {
        boolean z11 = z10;
        if (i10 != i11) {
            if (z11) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f6502l = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i12 = i10;
                int i13 = i11;
                i(arrayList2, this.f6514x, this.f6515y, 2, i12, i13);
                i(arrayList2, this.f6507q, this.f6508r, 1, i12, i13);
                r4.b.a(animatorSet, arrayList);
                animatorSet.addListener(new a(i11, m(i10), i10, m(i11)));
                animatorSet.start();
            } else {
                D(i10, i11);
            }
            this.f6498h.p0();
            this.f6498h.u0(z11);
            this.f6498h.A0();
        }
    }

    private boolean g() {
        return (this.f6499i == null || this.f6498h.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView != null && z10) {
            if (i10 == i12 || i10 == i11) {
                ObjectAnimator j10 = j(textView, i12 == i10);
                if (i10 == i12 && i11 != 0) {
                    j10.setStartDelay((long) this.f6493c);
                }
                list.add(j10);
                if (i12 == i10 && i11 != 0) {
                    ObjectAnimator k10 = k(textView);
                    k10.setStartDelay((long) this.f6493c);
                    list.add(k10);
                }
            }
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z10 ? 1.0f : 0.0f});
        ofFloat.setDuration((long) (z10 ? this.f6492b : this.f6493c));
        ofFloat.setInterpolator(z10 ? this.f6495e : this.f6496f);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f6503m, 0.0f});
        ofFloat.setDuration((long) this.f6491a);
        ofFloat.setInterpolator(this.f6494d);
        return ofFloat;
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f6508r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f6515y;
    }

    private int v(boolean z10, int i10, int i11) {
        return z10 ? this.f6497g.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean y(int i10) {
        return i10 == 1 && this.f6508r != null && !TextUtils.isEmpty(this.f6506p);
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f6507q;
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        return this.f6514x;
    }

    /* access modifiers changed from: package-private */
    public void C(TextView textView, int i10) {
        ViewGroup viewGroup;
        if (this.f6499i != null) {
            if (!z(i10) || (viewGroup = this.f6501k) == null) {
                viewGroup = this.f6499i;
            }
            viewGroup.removeView(textView);
            int i11 = this.f6500j - 1;
            this.f6500j = i11;
            O(this.f6499i, i11);
        }
    }

    /* access modifiers changed from: package-private */
    public void E(int i10) {
        this.f6510t = i10;
        TextView textView = this.f6508r;
        if (textView != null) {
            m0.s0(textView, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void F(CharSequence charSequence) {
        this.f6509s = charSequence;
        TextView textView = this.f6508r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(boolean z10) {
        if (this.f6507q != z10) {
            h();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f6497g);
                this.f6508r = appCompatTextView;
                appCompatTextView.setId(f.textinput_error);
                this.f6508r.setTextAlignment(5);
                Typeface typeface = this.B;
                if (typeface != null) {
                    this.f6508r.setTypeface(typeface);
                }
                H(this.f6511u);
                I(this.f6512v);
                F(this.f6509s);
                E(this.f6510t);
                this.f6508r.setVisibility(4);
                e(this.f6508r, 0);
            } else {
                w();
                C(this.f6508r, 0);
                this.f6508r = null;
                this.f6498h.p0();
                this.f6498h.A0();
            }
            this.f6507q = z10;
        }
    }

    /* access modifiers changed from: package-private */
    public void H(int i10) {
        this.f6511u = i10;
        TextView textView = this.f6508r;
        if (textView != null) {
            this.f6498h.c0(textView, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void I(ColorStateList colorStateList) {
        this.f6512v = colorStateList;
        TextView textView = this.f6508r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void J(int i10) {
        this.f6516z = i10;
        TextView textView = this.f6515y;
        if (textView != null) {
            i.n(textView, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(boolean z10) {
        if (this.f6514x != z10) {
            h();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f6497g);
                this.f6515y = appCompatTextView;
                appCompatTextView.setId(f.textinput_helper_text);
                this.f6515y.setTextAlignment(5);
                Typeface typeface = this.B;
                if (typeface != null) {
                    this.f6515y.setTypeface(typeface);
                }
                this.f6515y.setVisibility(4);
                m0.s0(this.f6515y, 1);
                J(this.f6516z);
                L(this.A);
                e(this.f6515y, 1);
                this.f6515y.setAccessibilityDelegate(new b());
            } else {
                x();
                C(this.f6515y, 1);
                this.f6515y = null;
                this.f6498h.p0();
                this.f6498h.A0();
            }
            this.f6514x = z10;
        }
    }

    /* access modifiers changed from: package-private */
    public void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f6515y;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            M(this.f6508r, typeface);
            M(this.f6515y, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public void Q(CharSequence charSequence) {
        h();
        this.f6506p = charSequence;
        this.f6508r.setText(charSequence);
        int i10 = this.f6504n;
        if (i10 != 1) {
            this.f6505o = 1;
        }
        S(i10, this.f6505o, P(this.f6508r, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void R(CharSequence charSequence) {
        h();
        this.f6513w = charSequence;
        this.f6515y.setText(charSequence);
        int i10 = this.f6504n;
        if (i10 != 2) {
            this.f6505o = 2;
        }
        S(i10, this.f6505o, P(this.f6515y, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void e(TextView textView, int i10) {
        if (this.f6499i == null && this.f6501k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f6497g);
            this.f6499i = linearLayout;
            linearLayout.setOrientation(0);
            this.f6498h.addView(this.f6499i, -1, -2);
            this.f6501k = new FrameLayout(this.f6497g);
            this.f6499i.addView(this.f6501k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f6498h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f6501k.setVisibility(0);
            this.f6501k.addView(textView);
        } else {
            this.f6499i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f6499i.setVisibility(0);
        this.f6500j++;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (g()) {
            EditText editText = this.f6498h.getEditText();
            boolean g10 = c.g(this.f6497g);
            LinearLayout linearLayout = this.f6499i;
            int i10 = d.material_helper_text_font_1_3_padding_horizontal;
            m0.G0(linearLayout, v(g10, i10, m0.G(editText)), v(g10, d.material_helper_text_font_1_3_padding_top, this.f6497g.getResources().getDimensionPixelSize(d.material_helper_text_default_padding_top)), v(g10, i10, m0.F(editText)), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Animator animator = this.f6502l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return y(this.f6505o);
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return this.f6510t;
    }

    /* access modifiers changed from: package-private */
    public CharSequence o() {
        return this.f6509s;
    }

    /* access modifiers changed from: package-private */
    public CharSequence p() {
        return this.f6506p;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        TextView textView = this.f6508r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList r() {
        TextView textView = this.f6508r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence s() {
        return this.f6513w;
    }

    /* access modifiers changed from: package-private */
    public View t() {
        return this.f6515y;
    }

    /* access modifiers changed from: package-private */
    public int u() {
        TextView textView = this.f6515y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.f6506p = null;
        h();
        if (this.f6504n == 1) {
            this.f6505o = (!this.f6514x || TextUtils.isEmpty(this.f6513w)) ? 0 : 2;
        }
        S(this.f6504n, this.f6505o, P(this.f6508r, ""));
    }

    /* access modifiers changed from: package-private */
    public void x() {
        h();
        int i10 = this.f6504n;
        if (i10 == 2) {
            this.f6505o = 0;
        }
        S(i10, this.f6505o, P(this.f6515y, ""));
    }

    /* access modifiers changed from: package-private */
    public boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
