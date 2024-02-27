package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.m0;
import f.f;
import f.j;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: e  reason: collision with root package name */
    private boolean f1190e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1191f;

    /* renamed from: g  reason: collision with root package name */
    private int f1192g = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = j.N0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        m0.o0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1190e = obtainStyledAttributes.getBoolean(j.O0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1190e);
        }
    }

    private int a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private boolean b() {
        return this.f1191f;
    }

    private void setStacked(boolean z10) {
        if (this.f1191f == z10) {
            return;
        }
        if (!z10 || this.f1190e) {
            this.f1191f = z10;
            setOrientation(z10 ? 1 : 0);
            setGravity(z10 ? 8388613 : 80);
            View findViewById = findViewById(f.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z10 ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r1 != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            boolean r1 = r5.f1190e
            r2 = 0
            if (r1 == 0) goto L_0x0018
            int r1 = r5.f1192g
            if (r0 <= r1) goto L_0x0016
            boolean r1 = r5.b()
            if (r1 == 0) goto L_0x0016
            r5.setStacked(r2)
        L_0x0016:
            r5.f1192g = r0
        L_0x0018:
            boolean r1 = r5.b()
            r3 = 1
            if (r1 != 0) goto L_0x002f
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L_0x002f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = r3
            goto L_0x0031
        L_0x002f:
            r0 = r6
            r1 = r2
        L_0x0031:
            super.onMeasure(r0, r7)
            boolean r0 = r5.f1190e
            if (r0 == 0) goto L_0x004d
            boolean r0 = r5.b()
            if (r0 != 0) goto L_0x004d
            int r0 = r5.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L_0x004d
            r5.setStacked(r3)
            goto L_0x004f
        L_0x004d:
            if (r1 == 0) goto L_0x0052
        L_0x004f:
            super.onMeasure(r6, r7)
        L_0x0052:
            int r0 = r5.a(r2)
            if (r0 < 0) goto L_0x009e
            android.view.View r1 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r4 = r5.getPaddingTop()
            int r1 = r1.getMeasuredHeight()
            int r4 = r4 + r1
            int r1 = r2.topMargin
            int r4 = r4 + r1
            int r1 = r2.bottomMargin
            int r4 = r4 + r1
            boolean r1 = r5.b()
            if (r1 == 0) goto L_0x0098
            int r0 = r0 + r3
            int r0 = r5.a(r0)
            if (r0 < 0) goto L_0x0096
            android.view.View r0 = r5.getChildAt(r0)
            int r0 = r0.getPaddingTop()
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r0 = r0 + r1
            int r4 = r4 + r0
        L_0x0096:
            r2 = r4
            goto L_0x009e
        L_0x0098:
            int r0 = r5.getPaddingBottom()
            int r2 = r4 + r0
        L_0x009e:
            int r0 = androidx.core.view.m0.C(r5)
            if (r0 == r2) goto L_0x00ac
            r5.setMinimumHeight(r2)
            if (r7 != 0) goto L_0x00ac
            super.onMeasure(r6, r7)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }

    public void setAllowStacking(boolean z10) {
        if (this.f1190e != z10) {
            this.f1190e = z10;
            if (!z10 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
