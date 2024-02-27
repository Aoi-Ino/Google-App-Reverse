package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.i;
import androidx.constraintlayout.widget.k;
import s.e;
import s.g;
import s.l;

public class Flow extends k {

    /* renamed from: p  reason: collision with root package name */
    private g f1673p;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f1673p = new g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f2027n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.f2036o1) {
                    this.f1673p.D2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f2045p1) {
                    this.f1673p.I1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f2135z1) {
                    this.f1673p.N1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.A1) {
                    this.f1673p.K1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f2054q1) {
                    this.f1673p.L1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f2063r1) {
                    this.f1673p.O1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f2072s1) {
                    this.f1673p.M1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f2081t1) {
                    this.f1673p.J1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.Z1) {
                    this.f1673p.I2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == i.P1) {
                    this.f1673p.x2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == i.Y1) {
                    this.f1673p.H2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == i.J1) {
                    this.f1673p.r2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == i.R1) {
                    this.f1673p.z2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == i.L1) {
                    this.f1673p.t2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == i.T1) {
                    this.f1673p.B2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == i.N1) {
                    this.f1673p.v2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.I1) {
                    this.f1673p.q2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.Q1) {
                    this.f1673p.y2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.K1) {
                    this.f1673p.s2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.S1) {
                    this.f1673p.A2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.W1) {
                    this.f1673p.F2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.M1) {
                    this.f1673p.u2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == i.V1) {
                    this.f1673p.E2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == i.O1) {
                    this.f1673p.w2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.X1) {
                    this.f1673p.G2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.U1) {
                    this.f1673p.C2(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1779h = this.f1673p;
        o();
    }

    public void j(e eVar, boolean z10) {
        this.f1673p.t1(z10);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        p(this.f1673p, i10, i11);
    }

    public void p(l lVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (lVar != null) {
            lVar.C1(mode, size, mode2, size2);
            setMeasuredDimension(lVar.x1(), lVar.w1());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f1673p.q2(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f1673p.r2(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f1673p.s2(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f1673p.t2(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f1673p.u2(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f1673p.v2(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f1673p.w2(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f1673p.x2(i10);
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f1673p.y2(f10);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f1673p.z2(i10);
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f1673p.A2(f10);
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f1673p.B2(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f1673p.C2(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f1673p.D2(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f1673p.I1(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f1673p.J1(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f1673p.L1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f1673p.M1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f1673p.O1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f1673p.E2(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f1673p.F2(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f1673p.G2(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f1673p.H2(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f1673p.I2(i10);
        requestLayout();
    }
}
