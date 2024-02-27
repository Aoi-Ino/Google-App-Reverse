package com.nic.mparivahan.VahanServices.ApplicationStatusModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class AppliByRcModle implements Serializable {

    /* renamed from: 1  reason: not valid java name */
    private final X1 f01;

    public AppliByRcModle(X1 x12) {
        l.f(x12, "1");
        this.f01 = x12;
    }

    public static /* synthetic */ AppliByRcModle copy$default(AppliByRcModle appliByRcModle, X1 x12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            x12 = appliByRcModle.f01;
        }
        return appliByRcModle.copy(x12);
    }

    public final X1 component1() {
        return this.f01;
    }

    public final AppliByRcModle copy(X1 x12) {
        l.f(x12, "1");
        return new AppliByRcModle(x12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppliByRcModle) && l.a(this.f01, ((AppliByRcModle) obj).f01);
    }

    public final X1 get1() {
        return this.f01;
    }

    public int hashCode() {
        return this.f01.hashCode();
    }

    public String toString() {
        return "AppliByRcModle(1=" + this.f01 + ')';
    }
}
