package com.google.android.play.core.assetpacks;

import w5.q;

public class a extends q {

    /* renamed from: e  reason: collision with root package name */
    private final int f6610e;

    a(int i10) {
        super(String.format("Asset Pack Download Error(%d): %s", new Object[]{Integer.valueOf(i10), p5.a.a(i10)}));
        if (i10 != 0) {
            this.f6610e = i10;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }
}
