package com.google.android.play.core.assetpacks;

abstract class h3 {
    h3() {
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public abstract long b();

    /* access modifiers changed from: package-private */
    public abstract String c();

    /* access modifiers changed from: package-private */
    public abstract boolean d();

    /* access modifiers changed from: package-private */
    public abstract boolean e();

    /* access modifiers changed from: package-private */
    public abstract byte[] f();

    /* access modifiers changed from: package-private */
    public final boolean g() {
        if (c() == null) {
            return false;
        }
        return c().endsWith("/");
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return a() == 0;
    }
}
