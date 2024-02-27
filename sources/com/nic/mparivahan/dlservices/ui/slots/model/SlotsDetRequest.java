package com.nic.mparivahan.dlservices.ui.slots.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class SlotsDetRequest {
    @c("campcd")
    private final String campcd;
    @c("campid")
    private final String campid;
    @c("rtocd")
    private final String rtocd;

    public SlotsDetRequest() {
        this((String) null, (String) null, (String) null, 7, (g) null);
    }

    public static /* synthetic */ SlotsDetRequest copy$default(SlotsDetRequest slotsDetRequest, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = slotsDetRequest.rtocd;
        }
        if ((i10 & 2) != 0) {
            str2 = slotsDetRequest.campid;
        }
        if ((i10 & 4) != 0) {
            str3 = slotsDetRequest.campcd;
        }
        return slotsDetRequest.copy(str, str2, str3);
    }

    public final String component1() {
        return this.rtocd;
    }

    public final String component2() {
        return this.campid;
    }

    public final String component3() {
        return this.campcd;
    }

    public final SlotsDetRequest copy(String str, String str2, String str3) {
        return new SlotsDetRequest(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotsDetRequest)) {
            return false;
        }
        SlotsDetRequest slotsDetRequest = (SlotsDetRequest) obj;
        return l.a(this.rtocd, slotsDetRequest.rtocd) && l.a(this.campid, slotsDetRequest.campid) && l.a(this.campcd, slotsDetRequest.campcd);
    }

    public final String getCampcd() {
        return this.campcd;
    }

    public final String getCampid() {
        return this.campid;
    }

    public final String getRtocd() {
        return this.rtocd;
    }

    public int hashCode() {
        String str = this.rtocd;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campid;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.campcd;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "SlotsDetRequest(rtocd=" + this.rtocd + ", campid=" + this.campid + ", campcd=" + this.campcd + ')';
    }

    public SlotsDetRequest(String str, String str2, String str3) {
        this.rtocd = str;
        this.campid = str2;
        this.campcd = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SlotsDetRequest(String str, String str2, String str3, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
