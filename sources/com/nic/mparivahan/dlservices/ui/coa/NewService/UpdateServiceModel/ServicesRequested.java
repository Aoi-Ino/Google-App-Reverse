package com.nic.mparivahan.dlservices.ui.coa.NewService.UpdateServiceModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ServicesRequested {

    /* renamed from: 515  reason: not valid java name */
    private final String f6515;

    public ServicesRequested(String str) {
        l.f(str, "515");
        this.f6515 = str;
    }

    public static /* synthetic */ ServicesRequested copy$default(ServicesRequested servicesRequested, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = servicesRequested.f6515;
        }
        return servicesRequested.copy(str);
    }

    public final String component1() {
        return this.f6515;
    }

    public final ServicesRequested copy(String str) {
        l.f(str, "515");
        return new ServicesRequested(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServicesRequested) && l.a(this.f6515, ((ServicesRequested) obj).f6515);
    }

    public final String get515() {
        return this.f6515;
    }

    public int hashCode() {
        return this.f6515.hashCode();
    }

    public String toString() {
        return "ServicesRequested(515=" + this.f6515 + ')';
    }
}
