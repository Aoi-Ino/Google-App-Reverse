package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.m0;
import f.f;
import f.j;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    private boolean f1080e;

    /* renamed from: f  reason: collision with root package name */
    private View f1081f;

    /* renamed from: g  reason: collision with root package name */
    private View f1082g;

    /* renamed from: h  reason: collision with root package name */
    private View f1083h;

    /* renamed from: i  reason: collision with root package name */
    Drawable f1084i;

    /* renamed from: j  reason: collision with root package name */
    Drawable f1085j;

    /* renamed from: k  reason: collision with root package name */
    Drawable f1086k;

    /* renamed from: l  reason: collision with root package name */
    boolean f1087l;

    /* renamed from: m  reason: collision with root package name */
    boolean f1088m;

    /* renamed from: n  reason: collision with root package name */
    private int f1089n;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m0.u0(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f11178a);
        this.f1084i = obtainStyledAttributes.getDrawable(j.f11183b);
        this.f1085j = obtainStyledAttributes.getDrawable(j.f11193d);
        this.f1089n = obtainStyledAttributes.getDimensionPixelSize(j.f11223j, -1);
        boolean z10 = true;
        if (getId() == f.split_action_bar) {
            this.f1087l = true;
            this.f1086k = obtainStyledAttributes.getDrawable(j.f11188c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1087l ? !(this.f1084i == null && this.f1085j == null) : this.f1086k != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1084i;
        if (drawable != null && drawable.isStateful()) {
            this.f1084i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1085j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1085j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1086k;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1086k.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1081f;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1084i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1085j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1086k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1082g = findViewById(f.action_bar);
        this.f1083h = findViewById(f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1080e || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        View view2 = this.f1081f;
        boolean z11 = true;
        boolean z12 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i14 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i10, (measuredHeight - view2.getMeasuredHeight()) - i14, i12, measuredHeight - i14);
        }
        if (this.f1087l) {
            Drawable drawable3 = this.f1086k;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                return;
            }
        } else {
            if (this.f1084i != null) {
                if (this.f1082g.getVisibility() == 0) {
                    drawable2 = this.f1084i;
                    left = this.f1082g.getLeft();
                    top = this.f1082g.getTop();
                    right = this.f1082g.getRight();
                    view = this.f1082g;
                } else {
                    View view3 = this.f1083h;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f1084i.setBounds(0, 0, 0, 0);
                    } else {
                        drawable2 = this.f1084i;
                        left = this.f1083h.getLeft();
                        top = this.f1083h.getTop();
                        right = this.f1083h.getRight();
                        view = this.f1083h;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
            } else {
                z11 = false;
            }
            this.f1088m = z12;
            if (z12 && (drawable = this.f1085j) != null) {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            } else if (!z11) {
                return;
            }
        }
        invalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1082g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f1089n
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f1082g
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f1081f
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f1082g
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f1082g
        L_0x0042:
            int r0 = r3.a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f1083h
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f1083h
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f1081f
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1084i;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1084i);
        }
        this.f1084i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1082g;
            if (view != null) {
                this.f1084i.setBounds(view.getLeft(), this.f1082g.getTop(), this.f1082g.getRight(), this.f1082g.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f1087l ? this.f1084i == null && this.f1085j == null : this.f1086k == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1086k;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1086k);
        }
        this.f1086k = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1087l && (drawable2 = this.f1086k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1087l ? this.f1084i == null && this.f1085j == null : this.f1086k == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1085j;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1085j);
        }
        this.f1085j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1088m && (drawable2 = this.f1085j) != null) {
                drawable2.setBounds(this.f1081f.getLeft(), this.f1081f.getTop(), this.f1081f.getRight(), this.f1081f.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f1087l ? this.f1084i == null && this.f1085j == null : this.f1086k == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(p0 p0Var) {
        View view = this.f1081f;
        if (view != null) {
            removeView(view);
        }
        this.f1081f = p0Var;
    }

    public void setTransitioning(boolean z10) {
        this.f1080e = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1084i;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1085j;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f1086k;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1084i && !this.f1087l) || (drawable == this.f1085j && this.f1088m) || ((drawable == this.f1086k && this.f1087l) || super.verifyDrawable(drawable));
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
