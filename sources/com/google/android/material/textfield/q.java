package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.y;
import androidx.core.view.m0;
import d5.h;
import q4.b;
import q4.e;
import q4.i;

class q extends t {

    /* renamed from: s  reason: collision with root package name */
    private static final boolean f6442s = true;

    /* renamed from: e  reason: collision with root package name */
    private final int f6443e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6444f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeInterpolator f6445g;

    /* renamed from: h  reason: collision with root package name */
    private AutoCompleteTextView f6446h;

    /* renamed from: i  reason: collision with root package name */
    private final View.OnClickListener f6447i = new j(this);

    /* renamed from: j  reason: collision with root package name */
    private final View.OnFocusChangeListener f6448j = new k(this);

    /* renamed from: k  reason: collision with root package name */
    private final c.b f6449k = new l(this);

    /* renamed from: l  reason: collision with root package name */
    private boolean f6450l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6451m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6452n;

    /* renamed from: o  reason: collision with root package name */
    private long f6453o = Long.MAX_VALUE;

    /* renamed from: p  reason: collision with root package name */
    private AccessibilityManager f6454p;

    /* renamed from: q  reason: collision with root package name */
    private ValueAnimator f6455q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f6456r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            q.this.r();
            q.this.f6456r.start();
        }
    }

    q(s sVar) {
        super(sVar);
        Context context = sVar.getContext();
        int i10 = b.motionDurationShort3;
        this.f6444f = h.f(context, i10, 67);
        this.f6443e = h.f(sVar.getContext(), i10, 50);
        this.f6445g = h.g(sVar.getContext(), b.motionEasingLinearInterpolator, r4.a.f15582a);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f6445g);
        ofFloat.setDuration((long) i10);
        ofFloat.addUpdateListener(new m(this));
        return ofFloat;
    }

    private void F() {
        this.f6456r = E(this.f6444f, 0.0f, 1.0f);
        ValueAnimator E = E(this.f6443e, 1.0f, 0.0f);
        this.f6455q = E;
        E.addListener(new a());
    }

    private boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f6453o;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H() {
        boolean isPopupShowing = this.f6446h.isPopupShowing();
        O(isPopupShowing);
        this.f6451m = isPopupShowing;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        this.f6490d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        Q();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K(View view, boolean z10) {
        this.f6450l = z10;
        r();
        if (!z10) {
            O(false);
            this.f6451m = false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L(boolean z10) {
        AutoCompleteTextView autoCompleteTextView = this.f6446h;
        if (autoCompleteTextView != null && !r.a(autoCompleteTextView)) {
            m0.B0(this.f6490d, z10 ? 2 : 1);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.f6451m = false;
            }
            Q();
            R();
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N() {
        R();
        O(false);
    }

    private void O(boolean z10) {
        if (this.f6452n != z10) {
            this.f6452n = z10;
            this.f6456r.cancel();
            this.f6455q.start();
        }
    }

    private void P() {
        this.f6446h.setOnTouchListener(new o(this));
        if (f6442s) {
            this.f6446h.setOnDismissListener(new p(this));
        }
        this.f6446h.setThreshold(0);
    }

    private void Q() {
        if (this.f6446h != null) {
            if (G()) {
                this.f6451m = false;
            }
            if (!this.f6451m) {
                if (f6442s) {
                    O(!this.f6452n);
                } else {
                    this.f6452n = !this.f6452n;
                    r();
                }
                if (this.f6452n) {
                    this.f6446h.requestFocus();
                    this.f6446h.showDropDown();
                    return;
                }
                this.f6446h.dismissDropDown();
                return;
            }
            this.f6451m = false;
        }
    }

    private void R() {
        this.f6451m = true;
        this.f6453o = System.currentTimeMillis();
    }

    public void a(Editable editable) {
        if (this.f6454p.isTouchExplorationEnabled() && r.a(this.f6446h) && !this.f6490d.hasFocus()) {
            this.f6446h.dismissDropDown();
        }
        this.f6446h.post(new n(this));
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return i.exposed_dropdown_menu_content_description;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return f6442s ? e.mtrl_dropdown_arrow : e.mtrl_ic_arrow_drop_down;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return this.f6448j;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f6447i;
    }

    public c.b h() {
        return this.f6449k;
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i10) {
        return i10 != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f6450l;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f6452n;
    }

    public void n(EditText editText) {
        this.f6446h = D(editText);
        P();
        this.f6487a.setErrorIconDrawable((Drawable) null);
        if (!r.a(editText) && this.f6454p.isTouchExplorationEnabled()) {
            m0.B0(this.f6490d, 2);
        }
        this.f6487a.setEndIconVisible(true);
    }

    public void o(View view, y yVar) {
        if (!r.a(this.f6446h)) {
            yVar.m0(Spinner.class.getName());
        }
        if (yVar.W()) {
            yVar.x0((CharSequence) null);
        }
    }

    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (this.f6454p.isEnabled() && !r.a(this.f6446h)) {
            boolean z10 = accessibilityEvent.getEventType() == 32768 && this.f6452n && !this.f6446h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z10) {
                Q();
                R();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        F();
        this.f6454p = (AccessibilityManager) this.f6489c.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f6446h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            if (f6442s) {
                this.f6446h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
        }
    }
}
