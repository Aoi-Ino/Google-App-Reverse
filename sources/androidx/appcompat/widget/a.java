package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m0;
import androidx.core.view.s0;
import androidx.core.view.t0;
import f.j;

abstract class a extends ViewGroup {

    /* renamed from: e  reason: collision with root package name */
    protected final C0016a f1305e = new C0016a();

    /* renamed from: f  reason: collision with root package name */
    protected final Context f1306f;

    /* renamed from: g  reason: collision with root package name */
    protected ActionMenuView f1307g;

    /* renamed from: h  reason: collision with root package name */
    protected c f1308h;

    /* renamed from: i  reason: collision with root package name */
    protected int f1309i;

    /* renamed from: j  reason: collision with root package name */
    protected s0 f1310j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1311k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1312l;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    protected class C0016a implements t0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1313a = false;

        /* renamed from: b  reason: collision with root package name */
        int f1314b;

        protected C0016a() {
        }

        public void a(View view) {
            this.f1313a = true;
        }

        public void b(View view) {
            if (!this.f1313a) {
                a aVar = a.this;
                aVar.f1310j = null;
                a.super.setVisibility(this.f1314b);
            }
        }

        public void c(View view) {
            a.super.setVisibility(0);
            this.f1313a = false;
        }

        public C0016a d(s0 s0Var, int i10) {
            a.this.f1310j = s0Var;
            this.f1314b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(f.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1306f = context;
        } else {
            this.f1306f = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    /* access modifiers changed from: protected */
    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* access modifiers changed from: protected */
    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public s0 f(int i10, long j10) {
        s0 b10;
        s0 s0Var = this.f1310j;
        if (s0Var != null) {
            s0Var.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b10 = m0.e(this).b(1.0f);
        } else {
            b10 = m0.e(this).b(0.0f);
        }
        b10.f(j10);
        b10.h(this.f1305e.d(b10, i10));
        return b10;
    }

    public int getAnimatedVisibility() {
        return this.f1310j != null ? this.f1305e.f1314b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1309i;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j.f11178a, f.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.f11223j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1308h;
        if (cVar != null) {
            cVar.I(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1312l = false;
        }
        if (!this.f1312l) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1312l = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1312l = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1311k = false;
        }
        if (!this.f1311k) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1311k = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1311k = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            s0 s0Var = this.f1310j;
            if (s0Var != null) {
                s0Var.c();
            }
            super.setVisibility(i10);
        }
    }
}
