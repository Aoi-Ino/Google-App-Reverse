package e5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.s;
import androidx.core.widget.c;
import q4.b;
import q4.j;

public class a extends s {

    /* renamed from: k  reason: collision with root package name */
    private static final int f10100k = j.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: l  reason: collision with root package name */
    private static final int[][] f10101l = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: i  reason: collision with root package name */
    private ColorStateList f10102i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10103j;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.P);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10102i == null) {
            int d10 = x4.a.d(this, b.f14961f);
            int d11 = x4.a.d(this, b.colorOnSurface);
            int d12 = x4.a.d(this, b.colorSurface);
            int[][] iArr = f10101l;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = x4.a.j(d12, d10, 1.0f);
            iArr2[1] = x4.a.j(d12, d11, 0.54f);
            iArr2[2] = x4.a.j(d12, d11, 0.38f);
            iArr2[3] = x4.a.j(d12, d11, 0.38f);
            this.f10102i = new ColorStateList(iArr, iArr2);
        }
        return this.f10102i;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10103j && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f10103j = z10;
        c.d(this, z10 ? getMaterialThemeColorsTintList() : null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f10100k
            android.content.Context r8 = m5.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = q4.k.V3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.r.i(r0, r1, r2, r3, r4, r5)
            int r10 = q4.k.W3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = f5.c.a(r8, r9, r10)
            androidx.core.widget.c.d(r7, r8)
        L_0x0028:
            int r8 = q4.k.X3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f10103j = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
