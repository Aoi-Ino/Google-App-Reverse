package com.google.android.material.carousel;

import android.view.View;

public abstract class d {
    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    static float b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    /* access modifiers changed from: package-private */
    public abstract f c(b bVar, View view);

    /* access modifiers changed from: package-private */
    public abstract boolean d(b bVar, int i10);
}
