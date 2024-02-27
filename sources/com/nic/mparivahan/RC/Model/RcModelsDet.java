package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class RcModelsDet {
    private NrvDetails nrvDetails;
    private final String statusCode;
    private final String statusDesc;

    public RcModelsDet(NrvDetails nrvDetails2, String str, String str2) {
        l.f(nrvDetails2, "nrvDetails");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.nrvDetails = nrvDetails2;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ RcModelsDet copy$default(RcModelsDet rcModelsDet, NrvDetails nrvDetails2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nrvDetails2 = rcModelsDet.nrvDetails;
        }
        if ((i10 & 2) != 0) {
            str = rcModelsDet.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = rcModelsDet.statusDesc;
        }
        return rcModelsDet.copy(nrvDetails2, str, str2);
    }

    public final NrvDetails component1() {
        return this.nrvDetails;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final RcModelsDet copy(NrvDetails nrvDetails2, String str, String str2) {
        l.f(nrvDetails2, "nrvDetails");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new RcModelsDet(nrvDetails2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RcModelsDet)) {
            return false;
        }
        RcModelsDet rcModelsDet = (RcModelsDet) obj;
        return l.a(this.nrvDetails, rcModelsDet.nrvDetails) && l.a(this.statusCode, rcModelsDet.statusCode) && l.a(this.statusDesc, rcModelsDet.statusDesc);
    }

    public final NrvDetails getNrvDetails() {
        return this.nrvDetails;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.nrvDetails.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public final void setNrvDetails(NrvDetails nrvDetails2) {
        l.f(nrvDetails2, "<set-?>");
        this.nrvDetails = nrvDetails2;
    }

    public String toString() {
        return "RcModelsDet(nrvDetails=" + this.nrvDetails + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
