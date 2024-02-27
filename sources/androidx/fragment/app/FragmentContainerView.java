package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.k1;
import androidx.core.view.m0;
import cm.g;
import cm.l;
import java.util.ArrayList;
import java.util.List;
import m0.c;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    private final List f2921e;

    /* renamed from: f  reason: collision with root package name */
    private final List f2922f;

    /* renamed from: g  reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f2923g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2924h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2925a = new a();

        private a() {
        }

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            l.f(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            l.f(view, "v");
            l.f(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            l.e(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        l.f(context, "context");
        this.f2921e = new ArrayList();
        this.f2922f = new ArrayList();
        this.f2924h = true;
    }

    private final void a(View view) {
        if (this.f2922f.contains(view)) {
            this.f2921e.add(view);
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        l.f(view, "child");
        if (q.D0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        k1 k1Var;
        l.f(windowInsets, "insets");
        k1 w10 = k1.w(windowInsets);
        l.e(w10, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2923g;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f2925a;
            l.c(onApplyWindowInsetsListener);
            k1Var = k1.w(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            k1Var = m0.c0(this, w10);
        }
        l.e(k1Var, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!k1Var.p()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                m0.g(getChildAt(i10), k1Var);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        if (this.f2924h) {
            for (View drawChild : this.f2921e) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        l.f(canvas, "canvas");
        l.f(view, "child");
        if (!this.f2924h || !(!this.f2921e.isEmpty()) || !this.f2921e.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    public void endViewTransition(View view) {
        l.f(view, "view");
        this.f2922f.remove(view);
        if (this.f2921e.remove(view)) {
            this.f2924h = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends i> F getFragment() {
        return q.j0(this).g0(getId());
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        l.f(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                l.e(childAt, "view");
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public void removeView(View view) {
        l.f(view, "view");
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        l.e(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    public void removeViewInLayout(View view) {
        l.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            l.e(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    public void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            l.e(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f2924h = z10;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        l.f(onApplyWindowInsetsListener, "listener");
        this.f2923g = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        l.f(view, "view");
        if (view.getParent() == this) {
            this.f2922f.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (g) null);
        l.f(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        String str;
        l.f(context, "context");
        this.f2921e = new ArrayList();
        this.f2922f = new ArrayList();
        this.f2924h = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = c.f13651e;
            l.e(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(c.f13652f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i10, int i11, g gVar) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, q qVar) {
        super(context, attributeSet);
        String str;
        l.f(context, "context");
        l.f(attributeSet, "attrs");
        l.f(qVar, "fm");
        this.f2921e = new ArrayList();
        this.f2922f = new ArrayList();
        this.f2924h = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = c.f13651e;
        l.e(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(c.f13652f) : classAttribute;
        String string = obtainStyledAttributes.getString(c.f13653g);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        i g02 = qVar.g0(id2);
        if (classAttribute != null && g02 == null) {
            if (id2 == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            i a10 = qVar.t0().a(context.getClassLoader(), classAttribute);
            l.e(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.B = id2;
            a10.C = id2;
            a10.D = string;
            a10.f3066x = qVar;
            a10.f3067y = qVar.w0();
            a10.O0(context, attributeSet, (Bundle) null);
            qVar.n().s(true).d(this, a10, string).k();
        }
        qVar.a1(this);
    }
}
