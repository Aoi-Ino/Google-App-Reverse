package com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel;

import androidx.annotation.Keep;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class ServicesRequested implements Serializable {
    @c("513")

    /* renamed from: 513  reason: not valid java name */
    private final String f1513;
    @c("515")

    /* renamed from: 515  reason: not valid java name */
    private final String f2515;

    public ServicesRequested(String str, String str2) {
        l.f(str, "513");
        l.f(str2, "515");
        this.f1513 = str;
        this.f2515 = str2;
    }

    public static /* synthetic */ ServicesRequested copy$default(ServicesRequested servicesRequested, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = servicesRequested.f1513;
        }
        if ((i10 & 2) != 0) {
            str2 = servicesRequested.f2515;
        }
        return servicesRequested.copy(str, str2);
    }

    public final String component1() {
        return this.f1513;
    }

    public final String component2() {
        return this.f2515;
    }

    public final ServicesRequested copy(String str, String str2) {
        l.f(str, "513");
        l.f(str2, "515");
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
        return l.a(this.f1513, servicesRequested.f1513) && l.a(this.f2515, servicesRequested.f2515);
    }

    public final String get513() {
        return this.f1513;
    }

    public final String get515() {
        return this.f2515;
    }

    public int hashCode() {
        return (this.f1513.hashCode() * 31) + this.f2515.hashCode();
    }

    public String toString() {
        return "ServicesRequested(513=" + this.f1513 + ", 515=" + this.f2515 + ')';
    }
}
