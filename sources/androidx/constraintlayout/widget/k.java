package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import s.l;

public abstract class k extends c {

    /* renamed from: n  reason: collision with root package name */
    private boolean f2144n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f2145o;

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    /* access modifiers changed from: protected */
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f2027n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.f2090u1) {
                    this.f2144n = true;
                } else if (index == i.B1) {
                    this.f2145o = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2144n || this.f2145o) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f1777f; i10++) {
                    View l10 = constraintLayout.l(this.f1776e[i10]);
                    if (l10 != null) {
                        if (this.f2144n) {
                            l10.setVisibility(visibility);
                        }
                        if (this.f2145o && elevation > 0.0f) {
                            l10.setTranslationZ(l10.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public abstract void p(l lVar, int i10, int i11);

    public void setElevation(float f10) {
        super.setElevation(f10);
        d();
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }
}
