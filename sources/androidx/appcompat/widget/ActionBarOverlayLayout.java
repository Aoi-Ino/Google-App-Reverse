package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import androidx.core.graphics.f;
import androidx.core.view.a0;
import androidx.core.view.b0;
import androidx.core.view.k1;
import androidx.core.view.m0;
import androidx.core.view.z;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements d0, z, a0 {
    static final int[] J = {f.a.actionBarSize, 16842841};
    private k1 A;
    private k1 B;
    private d C;
    private OverScroller D;
    ViewPropertyAnimator E;
    final AnimatorListenerAdapter F;
    private final Runnable G;
    private final Runnable H;
    private final b0 I;

    /* renamed from: e  reason: collision with root package name */
    private int f1104e;

    /* renamed from: f  reason: collision with root package name */
    private int f1105f = 0;

    /* renamed from: g  reason: collision with root package name */
    private ContentFrameLayout f1106g;

    /* renamed from: h  reason: collision with root package name */
    ActionBarContainer f1107h;

    /* renamed from: i  reason: collision with root package name */
    private e0 f1108i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f1109j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1110k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1111l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1112m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1113n;

    /* renamed from: o  reason: collision with root package name */
    boolean f1114o;

    /* renamed from: p  reason: collision with root package name */
    private int f1115p;

    /* renamed from: q  reason: collision with root package name */
    private int f1116q;

    /* renamed from: r  reason: collision with root package name */
    private final Rect f1117r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    private final Rect f1118s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    private final Rect f1119t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    private final Rect f1120u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    private final Rect f1121v = new Rect();

    /* renamed from: w  reason: collision with root package name */
    private final Rect f1122w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    private final Rect f1123x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    private k1 f1124y;

    /* renamed from: z  reason: collision with root package name */
    private k1 f1125z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = null;
            actionBarOverlayLayout.f1114o = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = null;
            actionBarOverlayLayout.f1114o = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = actionBarOverlayLayout.f1107h.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.F);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = actionBarOverlayLayout.f1107h.animate().translationY((float) (-ActionBarOverlayLayout.this.f1107h.getHeight())).setListener(ActionBarOverlayLayout.this.F);
        }
    }

    public interface d {
        void a();

        void b();

        void c(int i10);

        void d();

        void e(boolean z10);

        void f();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k1 k1Var = k1.f2597b;
        this.f1124y = k1Var;
        this.f1125z = k1Var;
        this.A = k1Var;
        this.B = k1Var;
        this.F = new a();
        this.G = new b();
        this.H = new c();
        v(context);
        this.I = new b0(this);
    }

    private void A() {
        u();
        this.G.run();
    }

    private boolean B(float f10) {
        this.D.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.D.getFinalY() > this.f1107h.getHeight();
    }

    private void p() {
        u();
        this.H.run();
    }

    private boolean q(View view, Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        int i10;
        int i11;
        int i12;
        int i13;
        e eVar = (e) view.getLayoutParams();
        if (!z10 || eVar.leftMargin == (i13 = rect.left)) {
            z14 = false;
        } else {
            eVar.leftMargin = i13;
            z14 = true;
        }
        if (z11 && eVar.topMargin != (i12 = rect.top)) {
            eVar.topMargin = i12;
            z14 = true;
        }
        if (z13 && eVar.rightMargin != (i11 = rect.right)) {
            eVar.rightMargin = i11;
            z14 = true;
        }
        if (!z12 || eVar.bottomMargin == (i10 = rect.bottom)) {
            return z14;
        }
        eVar.bottomMargin = i10;
        return true;
    }

    private e0 t(View view) {
        if (view instanceof e0) {
            return (e0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(J);
        boolean z10 = false;
        this.f1104e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1109j = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z10 = true;
        }
        this.f1110k = z10;
        this.D = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.H, 600);
    }

    private void y() {
        u();
        postDelayed(this.G, 600);
    }

    public void a(Menu menu, m.a aVar) {
        z();
        this.f1108i.a(menu, aVar);
    }

    public boolean b() {
        z();
        return this.f1108i.b();
    }

    public void c() {
        z();
        this.f1108i.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public boolean d() {
        z();
        return this.f1108i.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1109j != null && !this.f1110k) {
            int bottom = this.f1107h.getVisibility() == 0 ? (int) (((float) this.f1107h.getBottom()) + this.f1107h.getTranslationY() + 0.5f) : 0;
            this.f1109j.setBounds(0, bottom, getWidth(), this.f1109j.getIntrinsicHeight() + bottom);
            this.f1109j.draw(canvas);
        }
    }

    public boolean e() {
        z();
        return this.f1108i.e();
    }

    public boolean f() {
        z();
        return this.f1108i.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public boolean g() {
        z();
        return this.f1108i.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1107h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.I.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f1108i.getTitle();
    }

    public void h(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public void i(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public void k(int i10) {
        z();
        if (i10 == 2) {
            this.f1108i.v();
        } else if (i10 == 5) {
            this.f1108i.w();
        } else if (i10 == 109) {
            setOverlayMode(true);
        }
    }

    public void l() {
        z();
        this.f1108i.h();
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005b, code lost:
        if (r0 != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r8) {
        /*
            r7 = this;
            r7.z()
            androidx.core.view.k1 r8 = androidx.core.view.k1.x(r8, r7)
            android.graphics.Rect r2 = new android.graphics.Rect
            int r0 = r8.j()
            int r1 = r8.l()
            int r3 = r8.k()
            int r4 = r8.i()
            r2.<init>(r0, r1, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r7.f1107h
            r3 = 1
            r4 = 1
            r5 = 0
            r6 = 1
            r0 = r7
            boolean r0 = r0.q(r1, r2, r3, r4, r5, r6)
            android.graphics.Rect r1 = r7.f1117r
            androidx.core.view.m0.f(r7, r8, r1)
            android.graphics.Rect r1 = r7.f1117r
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r1 = r1.bottom
            androidx.core.view.k1 r1 = r8.n(r2, r3, r4, r1)
            r7.f1124y = r1
            androidx.core.view.k1 r2 = r7.f1125z
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0049
            androidx.core.view.k1 r0 = r7.f1124y
            r7.f1125z = r0
            r0 = 1
        L_0x0049:
            android.graphics.Rect r1 = r7.f1118s
            android.graphics.Rect r2 = r7.f1117r
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x005b
            android.graphics.Rect r0 = r7.f1118s
            android.graphics.Rect r1 = r7.f1117r
            r0.set(r1)
            goto L_0x005d
        L_0x005b:
            if (r0 == 0) goto L_0x0060
        L_0x005d:
            r7.requestLayout()
        L_0x0060:
            androidx.core.view.k1 r8 = r8.a()
            androidx.core.view.k1 r8 = r8.c()
            androidx.core.view.k1 r8 = r8.b()
            android.view.WindowInsets r8 = r8.v()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        m0.n0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = eVar.leftMargin + paddingLeft;
                int i16 = eVar.topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        k1 a10;
        z();
        measureChildWithMargins(this.f1107h, i10, 0, i11, 0);
        e eVar = (e) this.f1107h.getLayoutParams();
        int max = Math.max(0, this.f1107h.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f1107h.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1107h.getMeasuredState());
        boolean z10 = (m0.M(this) & 256) != 0;
        if (z10) {
            i12 = this.f1104e;
            if (this.f1112m && this.f1107h.getTabContainer() != null) {
                i12 += this.f1104e;
            }
        } else {
            i12 = this.f1107h.getVisibility() != 8 ? this.f1107h.getMeasuredHeight() : 0;
        }
        this.f1119t.set(this.f1117r);
        k1 k1Var = this.f1124y;
        this.A = k1Var;
        if (this.f1111l || z10) {
            a10 = new k1.b(this.A).d(f.b(k1Var.j(), this.A.l() + i12, this.A.k(), this.A.i())).a();
        } else {
            Rect rect = this.f1119t;
            rect.top += i12;
            rect.bottom = rect.bottom;
            a10 = k1Var.n(0, i12, 0, 0);
        }
        this.A = a10;
        q(this.f1106g, this.f1119t, true, true, true, true);
        if (!this.B.equals(this.A)) {
            k1 k1Var2 = this.A;
            this.B = k1Var2;
            m0.g(this.f1106g, k1Var2);
        }
        measureChildWithMargins(this.f1106g, i10, 0, i11, 0);
        e eVar2 = (e) this.f1106g.getLayoutParams();
        int max3 = Math.max(max, this.f1106g.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f1106g.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1106g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f1113n || !z10) {
            return false;
        }
        if (B(f11)) {
            p();
        } else {
            A();
        }
        this.f1114o = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1115p + i11;
        this.f1115p = i14;
        setActionBarHideOffset(i14);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.I.b(view, view2, i10);
        this.f1115p = getActionBarHideOffset();
        u();
        d dVar = this.C;
        if (dVar != null) {
            dVar.b();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1107h.getVisibility() != 0) {
            return false;
        }
        return this.f1113n;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1113n && !this.f1114o) {
            if (this.f1115p <= this.f1107h.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.C;
        if (dVar != null) {
            dVar.d();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        z();
        int i11 = this.f1116q ^ i10;
        this.f1116q = i10;
        boolean z10 = false;
        boolean z11 = (i10 & 4) == 0;
        if ((i10 & 256) != 0) {
            z10 = true;
        }
        d dVar = this.C;
        if (dVar != null) {
            dVar.e(!z10);
            if (z11 || !z10) {
                this.C.a();
            } else {
                this.C.f();
            }
        }
        if ((i11 & 256) != 0 && this.C != null) {
            m0.n0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f1105f = i10;
        d dVar = this.C;
        if (dVar != null) {
            dVar.c(i10);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i10) {
        u();
        this.f1107h.setTranslationY((float) (-Math.max(0, Math.min(i10, this.f1107h.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.C = dVar;
        if (getWindowToken() != null) {
            this.C.c(this.f1105f);
            int i10 = this.f1116q;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                m0.n0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1112m = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1113n) {
            this.f1113n = z10;
            if (!z10) {
                u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        z();
        this.f1108i.setIcon(i10);
    }

    public void setLogo(int i10) {
        z();
        this.f1108i.r(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f1111l = z10;
        this.f1110k = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f1108i.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f1108i.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        removeCallbacks(this.G);
        removeCallbacks(this.H);
        ViewPropertyAnimator viewPropertyAnimator = this.E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f1111l;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (this.f1106g == null) {
            this.f1106g = (ContentFrameLayout) findViewById(f.f.action_bar_activity_content);
            this.f1107h = (ActionBarContainer) findViewById(f.f.action_bar_container);
            this.f1108i = t(findViewById(f.f.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f1108i.setIcon(drawable);
    }
}
