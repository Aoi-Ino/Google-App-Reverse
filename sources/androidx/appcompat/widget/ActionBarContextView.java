package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.b;
import androidx.core.view.m0;
import androidx.core.view.s0;
import f.f;
import f.g;
import f.j;

public class ActionBarContextView extends a {

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f1090m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f1091n;

    /* renamed from: o  reason: collision with root package name */
    private View f1092o;

    /* renamed from: p  reason: collision with root package name */
    private View f1093p;

    /* renamed from: q  reason: collision with root package name */
    private View f1094q;

    /* renamed from: r  reason: collision with root package name */
    private LinearLayout f1095r;

    /* renamed from: s  reason: collision with root package name */
    private TextView f1096s;

    /* renamed from: t  reason: collision with root package name */
    private TextView f1097t;

    /* renamed from: u  reason: collision with root package name */
    private int f1098u;

    /* renamed from: v  reason: collision with root package name */
    private int f1099v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1100w;

    /* renamed from: x  reason: collision with root package name */
    private int f1101x;

    class a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f1102e;

        a(b bVar) {
            this.f1102e = bVar;
        }

        public void onClick(View view) {
            this.f1102e.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void i() {
        if (this.f1095r == null) {
            LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1095r = linearLayout;
            this.f1096s = (TextView) linearLayout.findViewById(f.action_bar_title);
            this.f1097t = (TextView) this.f1095r.findViewById(f.action_bar_subtitle);
            if (this.f1098u != 0) {
                this.f1096s.setTextAppearance(getContext(), this.f1098u);
            }
            if (this.f1099v != 0) {
                this.f1097t.setTextAppearance(getContext(), this.f1099v);
            }
        }
        this.f1096s.setText(this.f1090m);
        this.f1097t.setText(this.f1091n);
        boolean z10 = !TextUtils.isEmpty(this.f1090m);
        boolean z11 = !TextUtils.isEmpty(this.f1091n);
        int i10 = 8;
        this.f1097t.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1095r;
        if (z10 || z11) {
            i10 = 0;
        }
        linearLayout2.setVisibility(i10);
        if (this.f1095r.getParent() == null) {
            addView(this.f1095r);
        }
    }

    public /* bridge */ /* synthetic */ s0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f1092o == null) {
            k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1091n;
    }

    public CharSequence getTitle() {
        return this.f1090m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(androidx.appcompat.view.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1092o
            if (r0 != 0) goto L_0x0019
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1101x
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f1092o = r0
        L_0x0015:
            r3.addView(r0)
            goto L_0x0022
        L_0x0019:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            android.view.View r0 = r3.f1092o
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f1092o
            int r1 = f.f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            r3.f1093p = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.g) r4
            androidx.appcompat.widget.c r0 = r3.f1308h
            if (r0 == 0) goto L_0x0041
            r0.B()
        L_0x0041:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1308h = r0
            r1 = 1
            r0.M(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f1308h
            android.content.Context r2 = r3.f1306f
            r4.c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f1308h
            androidx.appcompat.view.menu.n r4 = r4.r(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f1307g = r4
            r1 = 0
            androidx.core.view.m0.u0(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f1307g
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.h(androidx.appcompat.view.b):void");
    }

    public boolean j() {
        return this.f1100w;
    }

    public void k() {
        removeAllViews();
        this.f1094q = null;
        this.f1307g = null;
        this.f1308h = null;
        View view = this.f1093p;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public boolean l() {
        c cVar = this.f1308h;
        if (cVar != null) {
            return cVar.N();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1308h;
        if (cVar != null) {
            cVar.E();
            this.f1308h.F();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = g1.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1092o;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1092o.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d10 = a.d(paddingRight, i14, b10);
            paddingRight = a.d(d10 + e(this.f1092o, d10, paddingTop, paddingTop2, b10), i15, b10);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f1095r;
        if (!(linearLayout == null || this.f1094q != null || linearLayout.getVisibility() == 8)) {
            i16 += e(this.f1095r, i16, paddingTop, paddingTop2, b10);
        }
        int i17 = i16;
        View view2 = this.f1094q;
        if (view2 != null) {
            e(view2, i17, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1307g;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12 = 1073741824;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i11) != 0) {
            int size = View.MeasureSpec.getSize(i10);
            int i13 = this.f1309i;
            if (i13 <= 0) {
                i13 = View.MeasureSpec.getSize(i11);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i14 = i13 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
            View view = this.f1092o;
            if (view != null) {
                int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1092o.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1307g;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f1307g, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1095r;
            if (linearLayout != null && this.f1094q == null) {
                if (this.f1100w) {
                    this.f1095r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1095r.getMeasuredWidth();
                    boolean z10 = measuredWidth <= paddingLeft;
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1095r.setVisibility(z10 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1094q;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i15 = layoutParams.width;
                int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i15 >= 0) {
                    paddingLeft = Math.min(i15, paddingLeft);
                }
                int i17 = layoutParams.height;
                if (i17 == -2) {
                    i12 = Integer.MIN_VALUE;
                }
                if (i17 >= 0) {
                    i14 = Math.min(i17, i14);
                }
                this.f1094q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i12));
            }
            if (this.f1309i <= 0) {
                int childCount = getChildCount();
                int i18 = 0;
                for (int i19 = 0; i19 < childCount; i19++) {
                    int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i18) {
                        i18 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i18);
                return;
            }
            setMeasuredDimension(size, i13);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i10) {
        this.f1309i = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1094q;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1094q = view;
        if (!(view == null || (linearLayout = this.f1095r) == null)) {
            removeView(linearLayout);
            this.f1095r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1091n = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1090m = charSequence;
        i();
        m0.t0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f1100w) {
            requestLayout();
        }
        this.f1100w = z10;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        v0 v10 = v0.v(context, attributeSet, j.f11298y, i10, 0);
        m0.u0(this, v10.g(j.f11303z));
        this.f1098u = v10.n(j.D, 0);
        this.f1099v = v10.n(j.C, 0);
        this.f1309i = v10.m(j.B, 0);
        this.f1101x = v10.n(j.A, g.abc_action_mode_close_item_material);
        v10.w();
    }
}
