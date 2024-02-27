package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c0;
import androidx.core.view.accessibility.y;
import androidx.core.view.b0;
import androidx.core.view.m0;
import androidx.core.view.w;
import androidx.core.view.x;
import androidx.core.view.y;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements a0, x {
    private static final float F = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    private static final a G = new a();
    private static final int[] H = {16843130};
    private d A;
    private final b0 B;
    private final y C;
    private float D;
    private c E;

    /* renamed from: e  reason: collision with root package name */
    private final float f2706e;

    /* renamed from: f  reason: collision with root package name */
    private long f2707f;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f2708g;

    /* renamed from: h  reason: collision with root package name */
    private OverScroller f2709h;

    /* renamed from: i  reason: collision with root package name */
    public EdgeEffect f2710i;

    /* renamed from: j  reason: collision with root package name */
    public EdgeEffect f2711j;

    /* renamed from: k  reason: collision with root package name */
    private int f2712k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2713l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2714m;

    /* renamed from: n  reason: collision with root package name */
    private View f2715n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f2716o;

    /* renamed from: p  reason: collision with root package name */
    private VelocityTracker f2717p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f2718q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f2719r;

    /* renamed from: s  reason: collision with root package name */
    private int f2720s;

    /* renamed from: t  reason: collision with root package name */
    private int f2721t;

    /* renamed from: u  reason: collision with root package name */
    private int f2722u;

    /* renamed from: v  reason: collision with root package name */
    private int f2723v;

    /* renamed from: w  reason: collision with root package name */
    private final int[] f2724w;

    /* renamed from: x  reason: collision with root package name */
    private final int[] f2725x;

    /* renamed from: y  reason: collision with root package name */
    private int f2726y;

    /* renamed from: z  reason: collision with root package name */
    private int f2727z;

    static class a extends androidx.core.view.a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            c0.a(accessibilityEvent, nestedScrollView.getScrollX());
            c0.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void g(View view, androidx.core.view.accessibility.y yVar) {
            int scrollRange;
            super.g(view, yVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            yVar.m0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                yVar.F0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    yVar.b(y.a.f2547r);
                    yVar.b(y.a.C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    yVar.b(y.a.f2546q);
                    yVar.b(y.a.E);
                }
            }
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.V(0, max, true);
                    return true;
                } else if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.V(0, min, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public int f2728e;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        d(Parcel parcel) {
            super(parcel);
            this.f2728e = parcel.readInt();
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2728e + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2728e);
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w.a.nestedScrollViewStyle);
    }

    private void A() {
        this.f2709h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2720s = viewConfiguration.getScaledTouchSlop();
        this.f2721t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2722u = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void B() {
        if (this.f2717p == null) {
            this.f2717p = VelocityTracker.obtain();
        }
    }

    private void C(int i10, int i11) {
        this.f2712k = i10;
        this.f2723v = i11;
        W(2, 0);
    }

    private boolean D(View view) {
        return !F(view, 0, getHeight());
    }

    private static boolean E(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && E((View) parent, view2);
    }

    private boolean F(View view, int i10, int i11) {
        view.getDrawingRect(this.f2708g);
        offsetDescendantRectToMyCoords(view, this.f2708g);
        return this.f2708g.bottom + i10 >= getScrollY() && this.f2708g.top - i10 <= getScrollY() + i11;
    }

    private void G(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.C.e(0, scrollY2, 0, i10 - scrollY2, (int[]) null, i11, iArr);
    }

    private void H(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2723v) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2712k = (int) motionEvent.getY(i10);
            this.f2723v = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2717p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void K() {
        VelocityTracker velocityTracker = this.f2717p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2717p = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int L(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f2710i
            float r0 = androidx.core.widget.d.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f2710i
            float r4 = -r4
            float r4 = androidx.core.widget.d.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f2710i
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f2710i
        L_0x002c:
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0051
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f2711j
            float r0 = androidx.core.widget.d.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            android.widget.EdgeEffect r0 = r3.f2711j
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.d.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f2711j
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f2711j
            goto L_0x002c
        L_0x0051:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0060
            r3.invalidate()
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.L(int, float):int");
    }

    private void M(boolean z10) {
        if (z10) {
            W(2, 1);
        } else {
            Y(1);
        }
        this.f2727z = getScrollY();
        m0.h0(this);
    }

    private boolean N(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View t10 = t(z11, i11, i12);
        if (t10 == null) {
            t10 = this;
        }
        if (i11 < scrollY || i12 > i13) {
            O(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (t10 != findFocus()) {
            t10.requestFocus(i10);
        }
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int O(int r22, int r23, int r24, boolean r25) {
        /*
            r21 = this;
            r10 = r21
            r11 = r23
            r12 = r24
            r13 = 1
            if (r12 != r13) goto L_0x000d
            r0 = 2
            r10.W(r0, r12)
        L_0x000d:
            r1 = 0
            int[] r3 = r10.f2725x
            int[] r4 = r10.f2724w
            r0 = r21
            r2 = r22
            r5 = r24
            boolean r0 = r0.k(r1, r2, r3, r4, r5)
            r14 = 0
            if (r0 == 0) goto L_0x002d
            int[] r0 = r10.f2725x
            r0 = r0[r13]
            int r0 = r22 - r0
            int[] r1 = r10.f2724w
            r1 = r1[r13]
            r15 = r0
            r16 = r1
            goto L_0x0031
        L_0x002d:
            r15 = r22
            r16 = r14
        L_0x0031:
            int r17 = r21.getScrollY()
            int r9 = r21.getScrollRange()
            boolean r0 = r21.c()
            if (r0 == 0) goto L_0x0044
            if (r25 != 0) goto L_0x0044
            r18 = r13
            goto L_0x0046
        L_0x0044:
            r18 = r14
        L_0x0046:
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r21
            r2 = r15
            r4 = r17
            r6 = r9
            r20 = r9
            r9 = r19
            boolean r0 = r0.I(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0065
            boolean r0 = r10.x(r12)
            if (r0 != 0) goto L_0x0065
            r8 = r13
            goto L_0x0066
        L_0x0065:
            r8 = r14
        L_0x0066:
            int r0 = r21.getScrollY()
            int r2 = r0 - r17
            int r4 = r15 - r2
            int[] r7 = r10.f2725x
            r7[r13] = r14
            r1 = 0
            r3 = 0
            int[] r5 = r10.f2724w
            r0 = r21
            r6 = r24
            r0.l(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r10.f2724w
            r0 = r0[r13]
            int r16 = r16 + r0
            int[] r0 = r10.f2725x
            r0 = r0[r13]
            int r15 = r15 - r0
            int r0 = r17 + r15
            if (r0 >= 0) goto L_0x00b0
            if (r18 == 0) goto L_0x00d7
            android.widget.EdgeEffect r0 = r10.f2710i
            int r1 = -r15
            float r1 = (float) r1
            int r2 = r21.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r11
            int r3 = r21.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.d.d(r0, r1, r2)
            android.widget.EdgeEffect r0 = r10.f2711j
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00d7
            android.widget.EdgeEffect r0 = r10.f2711j
        L_0x00ac:
            r0.onRelease()
            goto L_0x00d7
        L_0x00b0:
            r1 = r20
            if (r0 <= r1) goto L_0x00d7
            if (r18 == 0) goto L_0x00d7
            android.widget.EdgeEffect r0 = r10.f2711j
            float r1 = (float) r15
            int r2 = r21.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r11
            int r3 = r21.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r2
            androidx.core.widget.d.d(r0, r1, r3)
            android.widget.EdgeEffect r0 = r10.f2710i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00d7
            android.widget.EdgeEffect r0 = r10.f2710i
            goto L_0x00ac
        L_0x00d7:
            android.widget.EdgeEffect r0 = r10.f2710i
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x00f2
            android.widget.EdgeEffect r0 = r10.f2711j
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00e8
            goto L_0x00f2
        L_0x00e8:
            if (r8 == 0) goto L_0x00f5
            if (r12 != 0) goto L_0x00f5
            android.view.VelocityTracker r0 = r10.f2717p
            r0.clear()
            goto L_0x00f5
        L_0x00f2:
            androidx.core.view.m0.h0(r21)
        L_0x00f5:
            if (r12 != r13) goto L_0x0104
            r10.Y(r12)
            android.widget.EdgeEffect r0 = r10.f2710i
            r0.onRelease()
            android.widget.EdgeEffect r0 = r10.f2711j
            r0.onRelease()
        L_0x0104:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.O(int, int, int, boolean):int");
    }

    private void P(View view) {
        view.getDrawingRect(this.f2708g);
        offsetDescendantRectToMyCoords(view, this.f2708g);
        int f10 = f(this.f2708g);
        if (f10 != 0) {
            scrollBy(0, f10);
        }
    }

    private boolean Q(Rect rect, boolean z10) {
        int f10 = f(rect);
        boolean z11 = f10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, f10);
            } else {
                S(0, f10);
            }
        }
        return z11;
    }

    private boolean R(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return w(-i10) < d.b(edgeEffect) * ((float) getHeight());
    }

    private void T(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2707f > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f2709h;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i12);
                M(z10);
            } else {
                if (!this.f2709h.isFinished()) {
                    a();
                }
                scrollBy(i10, i11);
            }
            this.f2707f = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private boolean X(MotionEvent motionEvent) {
        boolean z10;
        if (d.b(this.f2710i) != 0.0f) {
            d.d(this.f2710i, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z10 = true;
        } else {
            z10 = false;
        }
        if (d.b(this.f2711j) == 0.0f) {
            return z10;
        }
        d.d(this.f2711j, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    private void a() {
        this.f2709h.abortAnimation();
        Y(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int e(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.D = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.D;
    }

    private void p(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f2719r) {
            S(0, i10);
        } else {
            scrollBy(0, i10);
        }
    }

    private boolean q(int i10) {
        EdgeEffect edgeEffect;
        if (d.b(this.f2710i) != 0.0f) {
            if (R(this.f2710i, i10)) {
                edgeEffect = this.f2710i;
            } else {
                i10 = -i10;
                u(i10);
                return true;
            }
        } else if (d.b(this.f2711j) == 0.0f) {
            return false;
        } else {
            i10 = -i10;
            if (R(this.f2711j, i10)) {
                edgeEffect = this.f2711j;
            }
            u(i10);
            return true;
        }
        edgeEffect.onAbsorb(i10);
        return true;
    }

    private void r() {
        this.f2723v = -1;
        this.f2716o = false;
        K();
        Y(0);
        this.f2710i.onRelease();
        this.f2711j.onRelease();
    }

    private View t(boolean z10, int i10, int i11) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else if (!z13) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private float w(int i10) {
        double log = Math.log((double) ((((float) Math.abs(i10)) * 0.35f) / (this.f2706e * 0.015f)));
        float f10 = F;
        return (float) (((double) (this.f2706e * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * log));
    }

    private boolean y(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
    }

    private void z() {
        VelocityTracker velocityTracker = this.f2717p;
        if (velocityTracker == null) {
            this.f2717p = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean I(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i18 = i12 + i10;
        int i19 = !z15 ? 0 : i16;
        int i20 = i13 + i11;
        int i21 = !z16 ? 0 : i17;
        int i22 = -i19;
        int i23 = i19 + i14;
        int i24 = -i21;
        int i25 = i21 + i15;
        if (i18 > i23) {
            i18 = i23;
            z11 = true;
        } else if (i18 < i22) {
            z11 = true;
            i18 = i22;
        } else {
            z11 = false;
        }
        if (i20 > i25) {
            i20 = i25;
            z12 = true;
        } else if (i20 < i24) {
            z12 = true;
            i20 = i24;
        } else {
            z12 = false;
        }
        if (z12 && !x(1)) {
            this.f2709h.springBack(i18, i20, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i18, i20, z11, z12);
        return z11 || z12;
    }

    public boolean J(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f2708g.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2708g;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2708g.top = getScrollY() - height;
            Rect rect2 = this.f2708g;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2708g;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return N(i10, i11, i12);
    }

    public final void S(int i10, int i11) {
        T(i10, i11, 250, false);
    }

    /* access modifiers changed from: package-private */
    public void U(int i10, int i11, int i12, boolean z10) {
        T(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    /* access modifiers changed from: package-private */
    public void V(int i10, int i11, boolean z10) {
        U(i10, i11, 250, z10);
    }

    public boolean W(int i10, int i11) {
        return this.C.p(i10, i11);
    }

    public void Y(int i10) {
        this.C.r(i10);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !F(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            O(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f2708g);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2708g);
            O(f(this.f2708g), 0, 1, true);
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && D(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f2709h.isFinished()) {
            this.f2709h.computeScrollOffset();
            int currY = this.f2709h.getCurrY();
            int g10 = g(currY - this.f2727z);
            this.f2727z = currY;
            int[] iArr = this.f2725x;
            iArr[1] = 0;
            k(0, g10, iArr, (int[]) null, 1);
            int i10 = g10 - this.f2725x[1];
            int scrollRange = getScrollRange();
            if (i10 != 0) {
                int scrollY = getScrollY();
                I(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i11 = i10 - scrollY2;
                int[] iArr2 = this.f2725x;
                iArr2[1] = 0;
                l(0, scrollY2, 0, i11, this.f2724w, 1, iArr2);
                i10 = i11 - this.f2725x[1];
            }
            if (i10 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (this.f2710i.isFinished()) {
                            edgeEffect = this.f2710i;
                        }
                    } else if (this.f2711j.isFinished()) {
                        edgeEffect = this.f2711j;
                    }
                    edgeEffect.onAbsorb((int) this.f2709h.getCurrVelocity());
                }
                a();
            }
            if (!this.f2709h.isFinished()) {
                m0.h0(this);
            } else {
                Y(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.C.a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.C.b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return k(i10, i11, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.C.f(i10, i11, i12, i13, iArr);
    }

    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f2710i.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i10 = getPaddingLeft();
            } else {
                i10 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i10, (float) min);
            this.f2710i.setSize(width, height);
            if (this.f2710i.draw(canvas)) {
                m0.h0(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f2711j.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i11 = getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i11 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f2711j.setSize(width2, height2);
            if (this.f2711j.draw(canvas)) {
                m0.h0(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: protected */
    public int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        } else if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* access modifiers changed from: package-private */
    public int g(int i10) {
        int height = getHeight();
        if (i10 > 0 && d.b(this.f2710i) != 0.0f) {
            int round = Math.round((((float) (-height)) / 4.0f) * d.d(this.f2710i, (((float) (-i10)) * 4.0f) / ((float) height), 0.5f));
            if (round != i10) {
                this.f2710i.finish();
            }
            return i10 - round;
        } else if (i10 >= 0 || d.b(this.f2711j) == 0.0f) {
            return i10;
        } else {
            float f10 = (float) height;
            int round2 = Math.round((f10 / 4.0f) * d.d(this.f2711j, (((float) i10) * 4.0f) / f10, 0.5f));
            if (round2 != i10) {
                this.f2711j.finish();
            }
            return i10 - round2;
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.B.a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void h(View view, View view2, int i10, int i11) {
        this.B.c(view, view2, i10, i11);
        W(2, i11);
    }

    public boolean hasNestedScrollingParent() {
        return x(0);
    }

    public void i(View view, int i10) {
        this.B.d(view, i10);
        Y(i10);
    }

    public boolean isNestedScrollingEnabled() {
        return this.C.l();
    }

    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        k(i10, i11, iArr, (int[]) null, i12);
    }

    public boolean k(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.C.d(i10, i11, iArr, iArr2, i12);
    }

    public void l(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.C.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        G(i13, i14, iArr);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        G(i13, i14, (int[]) null);
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2714m = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        if (motionEvent.getAction() != 8 || this.f2716o) {
            return false;
        }
        if (w.a(motionEvent, 2)) {
            f10 = motionEvent.getAxisValue(9);
            i10 = (int) motionEvent.getX();
        } else if (w.a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i10 = getWidth() / 2;
            f10 = axisValue;
        } else {
            i10 = 0;
            f10 = 0.0f;
        }
        if (f10 == 0.0f) {
            return false;
        }
        O(-((int) (f10 * getVerticalScrollFactorCompat())), i10, 1, w.a(motionEvent, 8194));
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f2716o) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.f2723v;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f2712k) > this.f2720s && (2 & getNestedScrollAxes()) == 0) {
                                this.f2716o = true;
                                this.f2712k = y10;
                                B();
                                this.f2717p.addMovement(motionEvent);
                                this.f2726y = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        H(motionEvent);
                    }
                }
            }
            this.f2716o = false;
            this.f2723v = -1;
            K();
            if (this.f2709h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                m0.h0(this);
            }
            Y(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (!y((int) motionEvent.getX(), y11)) {
                if (!X(motionEvent) && this.f2709h.isFinished()) {
                    z10 = false;
                }
                this.f2716o = z10;
                K();
            } else {
                this.f2712k = y11;
                this.f2723v = motionEvent.getPointerId(0);
                z();
                this.f2717p.addMovement(motionEvent);
                this.f2709h.computeScrollOffset();
                if (!X(motionEvent) && this.f2709h.isFinished()) {
                    z10 = false;
                }
                this.f2716o = z10;
                W(2, 0);
            }
        }
        return this.f2716o;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f2713l = false;
        View view = this.f2715n;
        if (view != null && E(view, this)) {
            P(this.f2715n);
        }
        this.f2715n = null;
        if (!this.f2714m) {
            if (this.A != null) {
                scrollTo(getScrollX(), this.A.f2728e);
                this.A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e10 = e(scrollY, paddingTop, i14);
            if (e10 != scrollY) {
                scrollTo(getScrollX(), e10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2714m = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2718q && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        u((int) f11);
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        G(i13, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        h(view, view2, i10, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i10) : instance.findNextFocusFromRect(this, rect, i10);
        if (findNextFocus != null && !D(findNextFocus)) {
            return findNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.A = dVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f2728e = getScrollY();
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.E;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && F(findFocus, 0, i13)) {
            findFocus.getDrawingRect(this.f2708g);
            offsetDescendantRectToMyCoords(findFocus, this.f2708g);
            p(f(this.f2708g));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r12.f2709h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012a, code lost:
        if (r12.f2709h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            r12.B()
            int r0 = r13.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L_0x000c
            r12.f2726y = r1
        L_0x000c:
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r13)
            int r3 = r12.f2726y
            float r3 = (float) r3
            r4 = 0
            r2.offsetLocation(r4, r3)
            r3 = 1
            if (r0 == 0) goto L_0x012e
            if (r0 == r3) goto L_0x00e6
            r4 = 2
            if (r0 == r4) goto L_0x0078
            r1 = 3
            if (r0 == r1) goto L_0x004f
            r1 = 5
            if (r0 == r1) goto L_0x003c
            r1 = 6
            if (r0 == r1) goto L_0x002a
            goto L_0x0159
        L_0x002a:
            r12.H(r13)
            int r0 = r12.f2723v
            int r0 = r13.findPointerIndex(r0)
            float r13 = r13.getY(r0)
            int r13 = (int) r13
            r12.f2712k = r13
            goto L_0x0159
        L_0x003c:
            int r0 = r13.getActionIndex()
            float r1 = r13.getY(r0)
            int r1 = (int) r1
            r12.f2712k = r1
            int r13 = r13.getPointerId(r0)
            r12.f2723v = r13
            goto L_0x0159
        L_0x004f:
            boolean r13 = r12.f2716o
            if (r13 == 0) goto L_0x0073
            int r13 = r12.getChildCount()
            if (r13 <= 0) goto L_0x0073
            android.widget.OverScroller r4 = r12.f2709h
            int r5 = r12.getScrollX()
            int r6 = r12.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r12.getScrollRange()
            boolean r13 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r13 == 0) goto L_0x0073
        L_0x0070:
            androidx.core.view.m0.h0(r12)
        L_0x0073:
            r12.r()
            goto L_0x0159
        L_0x0078:
            int r0 = r12.f2723v
            int r0 = r13.findPointerIndex(r0)
            r4 = -1
            if (r0 != r4) goto L_0x00a0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Invalid pointerId="
            r13.append(r0)
            int r0 = r12.f2723v
            r13.append(r0)
            java.lang.String r0 = " in onTouchEvent"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r13)
            goto L_0x0159
        L_0x00a0:
            float r4 = r13.getY(r0)
            int r4 = (int) r4
            int r5 = r12.f2712k
            int r5 = r5 - r4
            float r6 = r13.getX(r0)
            int r6 = r12.L(r5, r6)
            int r5 = r5 - r6
            boolean r6 = r12.f2716o
            if (r6 != 0) goto L_0x00cf
            int r6 = java.lang.Math.abs(r5)
            int r7 = r12.f2720s
            if (r6 <= r7) goto L_0x00cf
            android.view.ViewParent r6 = r12.getParent()
            if (r6 == 0) goto L_0x00c6
            r6.requestDisallowInterceptTouchEvent(r3)
        L_0x00c6:
            r12.f2716o = r3
            int r6 = r12.f2720s
            if (r5 <= 0) goto L_0x00ce
            int r5 = r5 - r6
            goto L_0x00cf
        L_0x00ce:
            int r5 = r5 + r6
        L_0x00cf:
            boolean r6 = r12.f2716o
            if (r6 == 0) goto L_0x0159
            float r13 = r13.getX(r0)
            int r13 = (int) r13
            int r13 = r12.O(r5, r13, r1, r1)
            int r4 = r4 - r13
            r12.f2712k = r4
            int r0 = r12.f2726y
            int r0 = r0 + r13
            r12.f2726y = r0
            goto L_0x0159
        L_0x00e6:
            android.view.VelocityTracker r13 = r12.f2717p
            int r0 = r12.f2722u
            float r0 = (float) r0
            r1 = 1000(0x3e8, float:1.401E-42)
            r13.computeCurrentVelocity(r1, r0)
            int r0 = r12.f2723v
            float r13 = r13.getYVelocity(r0)
            int r13 = (int) r13
            int r0 = java.lang.Math.abs(r13)
            int r1 = r12.f2721t
            if (r0 < r1) goto L_0x0115
            boolean r0 = r12.q(r13)
            if (r0 != 0) goto L_0x0073
            int r13 = -r13
            float r0 = (float) r13
            boolean r1 = r12.dispatchNestedPreFling(r4, r0)
            if (r1 != 0) goto L_0x0073
            r12.dispatchNestedFling(r4, r0, r3)
            r12.u(r13)
            goto L_0x0073
        L_0x0115:
            android.widget.OverScroller r5 = r12.f2709h
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x0073
            goto L_0x0070
        L_0x012e:
            int r0 = r12.getChildCount()
            if (r0 != 0) goto L_0x0135
            return r1
        L_0x0135:
            boolean r0 = r12.f2716o
            if (r0 == 0) goto L_0x0142
            android.view.ViewParent r0 = r12.getParent()
            if (r0 == 0) goto L_0x0142
            r0.requestDisallowInterceptTouchEvent(r3)
        L_0x0142:
            android.widget.OverScroller r0 = r12.f2709h
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x014d
            r12.a()
        L_0x014d:
            float r0 = r13.getY()
            int r0 = (int) r0
            int r13 = r13.getPointerId(r1)
            r12.C(r0, r13)
        L_0x0159:
            android.view.VelocityTracker r13 = r12.f2717p
            if (r13 == 0) goto L_0x0160
            r13.addMovement(r2)
        L_0x0160:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2713l) {
            P(view2);
        } else {
            this.f2715n = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return Q(rect, z10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            K();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void requestLayout() {
        this.f2713l = true;
        super.requestLayout();
    }

    public boolean s(KeyEvent keyEvent) {
        this.f2708g.setEmpty();
        int i10 = 130;
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        if (keyCode != 92) {
                            if (keyCode != 93) {
                                if (keyCode == 122) {
                                    J(33);
                                    return false;
                                } else if (keyCode != 123) {
                                    return false;
                                }
                            }
                        }
                    } else if (keyEvent.isShiftPressed()) {
                        i10 = 33;
                    }
                    J(i10);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return b(130);
                }
                return v(130);
            } else if (!keyEvent.isAltPressed()) {
                return b(33);
            }
            return v(33);
        }
    }

    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e10 = e(i10, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e11 = e(i11, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e10 != getScrollX() || e11 != getScrollY()) {
                super.scrollTo(e10, e11);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f2718q) {
            this.f2718q = z10;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z10) {
        this.C.m(z10);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.E = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f2719r = z10;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i10) {
        return W(i10, 0);
    }

    public void stopNestedScroll() {
        Y(0);
    }

    public void u(int i10) {
        if (getChildCount() > 0) {
            this.f2709h.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            M(true);
        }
    }

    public boolean v(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f2708g;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2708g.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2708g;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2708g;
        return N(i10, rect3.top, rect3.bottom);
    }

    public boolean x(int i10) {
        return this.C.k(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2708g = new Rect();
        this.f2713l = true;
        this.f2714m = false;
        this.f2715n = null;
        this.f2716o = false;
        this.f2719r = true;
        this.f2723v = -1;
        this.f2724w = new int[2];
        this.f2725x = new int[2];
        this.f2710i = d.a(context, attributeSet);
        this.f2711j = d.a(context, attributeSet);
        this.f2706e = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.B = new b0(this);
        this.C = new androidx.core.view.y(this);
        setNestedScrollingEnabled(true);
        m0.q0(this, G);
    }

    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
