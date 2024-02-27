package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import q4.b;
import q4.h;

public class Snackbar extends BaseTransientBottomBar {
    private static final int[] I;
    private static final int[] J;
    private final AccessibilityManager G;
    private boolean H;

    public static final class SnackbarLayout extends BaseTransientBottomBar.r {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        int i10 = b.snackbarButtonStyle;
        I = new int[]{i10};
        J = new int[]{i10, b.snackbarTextViewStyle};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, a aVar) {
        super(context, viewGroup, view, aVar);
        this.G = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static ViewGroup f0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button g0() {
        return h0().getActionView();
    }

    private SnackbarContentLayout h0() {
        return (SnackbarContentLayout) this.f6285i.getChildAt(0);
    }

    private TextView i0() {
        return h0().getMessageView();
    }

    private static boolean j0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(J);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        y(1);
    }

    public static Snackbar l0(View view, CharSequence charSequence, int i10) {
        return m0((Context) null, view, charSequence, i10);
    }

    private static Snackbar m0(Context context, View view, CharSequence charSequence, int i10) {
        ViewGroup f02 = f0(view);
        if (f02 != null) {
            if (context == null) {
                context = f02.getContext();
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(j0(context) ? h.mtrl_layout_snackbar_include : h.design_layout_snackbar_include, f02, false);
            Snackbar snackbar = new Snackbar(context, f02, snackbarContentLayout, snackbarContentLayout);
            snackbar.p0(charSequence);
            snackbar.S(i10);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public int B() {
        int B = super.B();
        if (B == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.G.getRecommendedTimeoutMillis(B, (this.H ? 4 : 0) | 3);
        } else if (!this.H || !this.G.isTouchExplorationEnabled()) {
            return B;
        } else {
            return -2;
        }
    }

    public void W() {
        super.W();
    }

    public Snackbar n0(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button g02 = g0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            g02.setVisibility(8);
            g02.setOnClickListener((View.OnClickListener) null);
            this.H = false;
        } else {
            this.H = true;
            g02.setVisibility(0);
            g02.setText(charSequence);
            g02.setOnClickListener(new c(this, onClickListener));
        }
        return this;
    }

    public Snackbar o0(int i10) {
        g0().setTextColor(i10);
        return this;
    }

    public Snackbar p0(CharSequence charSequence) {
        i0().setText(charSequence);
        return this;
    }

    public void x() {
        super.x();
    }
}
