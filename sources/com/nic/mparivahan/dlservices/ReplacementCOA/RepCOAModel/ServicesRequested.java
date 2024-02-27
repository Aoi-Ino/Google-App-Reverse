package com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ServicesRequested {

    /* renamed from: 515  reason: not valid java name */
    private final String f3515;

    /* renamed from: 516  reason: not valid java name */
    private final String f4516;

    public ServicesRequested(String str, String str2) {
        l.f(str, "515");
        l.f(str2, "516");
        this.f3515 = str;
        this.f4516 = str2;
    }

    public static /* synthetic */ ServicesRequested copy$default(ServicesRequested servicesRequested, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = servicesRequested.f3515;
        }
        if ((i10 & 2) != 0) {
            str2 = servicesRequested.f4516;
        }
        return servicesRequested.copy(str, str2);
    }

    public final String component1() {
        return this.f3515;
    }

    public final String component2() {
        return this.f4516;
    }

    public final ServicesRequested copy(String str, String str2) {
        l.f(str, "515");
        l.f(str2, "516");
        return new ServicesRequested(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesRequested)) {
            return false;
        }
        ServicesRequested servicesRequested = (ServicesRequested) obj;
        return l.a(this.f3515, servicesRequested.f3515) && l.a(this.f4516, servicesRequested.f4516);
    }

    public final String get515() {
        return this.f3515;
    }

    public final String get516() {
        return this.f4516;
    }

    public int hashCode() {
        return (this.f3515.hashCode() * 31) + this.f4516.hashCode();
    }

    public String toString() {
        return "ServicesRequested(515=" + this.f3515 + ", 516=" + this.f4516 + ')';
    }
}
