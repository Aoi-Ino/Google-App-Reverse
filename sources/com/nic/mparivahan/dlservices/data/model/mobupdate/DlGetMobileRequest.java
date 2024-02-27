package com.nic.mparivahan.dlservices.data.model.mobupdate;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class DlGetMobileRequest implements Serializable {
    private Boolean enc;
    private String p1DlNumber;
    private String p2Dob;
    private String p3Type;

    public DlGetMobileRequest(String str, String str2, Boolean bool, String str3) {
        this.p2Dob = str;
        this.p3Type = str2;
        this.enc = bool;
        this.p1DlNumber = str3;
    }

    public static /* synthetic */ DlGetMobileRequest copy$default(DlGetMobileRequest dlGetMobileRequest, String str, String str2, Boolean bool, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlGetMobileRequest.p2Dob;
        }
        if ((i10 & 2) != 0) {
            str2 = dlGetMobileRequest.p3Type;
        }
        if ((i10 & 4) != 0) {
            bool = dlGetMobileRequest.enc;
        }
        if ((i10 & 8) != 0) {
            str3 = dlGetMobileRequest.p1DlNumber;
        }
        return dlGetMobileRequest.copy(str, str2, bool, str3);
    }

    public final String component1() {
        return this.p2Dob;
    }

    public final String component2() {
        return this.p3Type;
    }

    public final Boolean component3() {
        return this.enc;
    }

    public final String component4() {
        return this.p1DlNumber;
    }

    public final DlGetMobileRequest copy(String str, String str2, Boolean bool, String str3) {
        return new DlGetMobileRequest(str, str2, bool, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlGetMobileRequest)) {
            return false;
        }
        DlGetMobileRequest dlGetMobileRequest = (DlGetMobileRequest) obj;
        return l.a(this.p2Dob, dlGetMobileRequest.p2Dob) && l.a(this.p3Type, dlGetMobileRequest.p3Type) && l.a(this.enc, dlGetMobileRequest.enc) && l.a(this.p1DlNumber, dlGetMobileRequest.p1DlNumber);
    }

    public final Boolean getEnc() {
        return this.enc;
    }

    public final String getP1DlNumber() {
        return this.p1DlNumber;
    }

    public final String getP2Dob() {
        return this.p2Dob;
    }

    public final String getP3Type() {
        return this.p3Type;
    }

    public int hashCode() {
        String str = this.p2Dob;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.p3Type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.enc;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.p1DlNumber;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public final void setEnc(Boolean bool) {
        this.enc = bool;
    }

    public final void setP1DlNumber(String str) {
        this.p1DlNumber = str;
    }

    public final void setP2Dob(String str) {
        this.p2Dob = str;
    }

    public final void setP3Type(String str) {
        this.p3Type = str;
    }

    public String toString() {
        return "DlGetMobileRequest(p2Dob=" + this.p2Dob + ", p3Type=" + this.p3Type + ", enc=" + this.enc + ", p1DlNumber=" + this.p1DlNumber + ')';
    }
}
