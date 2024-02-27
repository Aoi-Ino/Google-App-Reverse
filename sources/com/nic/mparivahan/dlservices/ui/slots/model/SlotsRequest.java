package com.nic.mparivahan.dlservices.ui.slots.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class SlotsRequest {
    @c("applNo")
    private final String applNo;
    @c("dob")
    private final String dob;

    public SlotsRequest() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ SlotsRequest copy$default(SlotsRequest slotsRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = slotsRequest.dob;
        }
        if ((i10 & 2) != 0) {
            str2 = slotsRequest.applNo;
        }
        return slotsRequest.copy(str, str2);
    }

    public final String component1() {
        return this.dob;
    }

    public final String component2() {
        return this.applNo;
    }

    public final SlotsRequest copy(String str, String str2) {
        return new SlotsRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotsRequest)) {
            return false;
        }
        SlotsRequest slotsRequest = (SlotsRequest) obj;
        return l.a(this.dob, slotsRequest.dob) && l.a(this.applNo, slotsRequest.applNo);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getDob() {
        return this.dob;
    }

    public int hashCode() {
        String str = this.dob;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applNo;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "SlotsRequest(dob=" + this.dob + ", applNo=" + this.applNo + ')';
    }

    public SlotsRequest(String str, String str2) {
        this.dob = str;
        this.applNo = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SlotsRequest(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
