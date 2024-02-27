package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

final class h1 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f6733a = new HashMap();

    h1() {
    }

    /* access modifiers changed from: package-private */
    public final synchronized double a(String str) {
        Double d10 = (Double) this.f6733a.get(str);
        if (d10 == null) {
            return 0.0d;
        }
        return d10.doubleValue();
    }

    /* access modifiers changed from: package-private */
    public final synchronized double b(String str, y1 y1Var) {
        double d10;
        d10 = (((double) ((x0) y1Var).f6971h) + 1.0d) / ((double) ((x0) y1Var).f6972i);
        this.f6733a.put(str, Double.valueOf(d10));
        return d10;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c(String str) {
        this.f6733a.put(str, Double.valueOf(0.0d));
    }
}
