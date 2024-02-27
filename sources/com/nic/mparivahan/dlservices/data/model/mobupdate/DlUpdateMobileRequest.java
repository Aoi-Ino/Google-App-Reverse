package com.nic.mparivahan.dlservices.data.model.mobupdate;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class DlUpdateMobileRequest implements Serializable {
    private Boolean enc;
    private String p1DlNumber;
    private String p2Dob;
    private String p3Type;
    private String p4OldMob;
    private String p5NewMob;

    public DlUpdateMobileRequest(String str, String str2, String str3, Boolean bool, String str4, String str5) {
        this.p2Dob = str;
        this.p3Type = str2;
        this.p4OldMob = str3;
        this.enc = bool;
        this.p1DlNumber = str4;
        this.p5NewMob = str5;
    }

    public static /* synthetic */ DlUpdateMobileRequest copy$default(DlUpdateMobileRequest dlUpdateMobileRequest, String str, String str2, String str3, Boolean bool, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlUpdateMobileRequest.p2Dob;
        }
        if ((i10 & 2) != 0) {
            str2 = dlUpdateMobileRequest.p3Type;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = dlUpdateMobileRequest.p4OldMob;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            bool = dlUpdateMobileRequest.enc;
        }
        Boolean bool2 = bool;
        if ((i10 & 16) != 0) {
            str4 = dlUpdateMobileRequest.p1DlNumber;
        }
        String str8 = str4;
        if ((i10 & 32) != 0) {
            str5 = dlUpdateMobileRequest.p5NewMob;
        }
        return dlUpdateMobileRequest.copy(str, str6, str7, bool2, str8, str5);
    }

    public final String component1() {
        return this.p2Dob;
    }

    public final String component2() {
        return this.p3Type;
    }

    public final String component3() {
        return this.p4OldMob;
    }

    public final Boolean component4() {
        return this.enc;
    }

    public final String component5() {
        return this.p1DlNumber;
    }

    public final String component6() {
        return this.p5NewMob;
    }

    public final DlUpdateMobileRequest copy(String str, String str2, String str3, Boolean bool, String str4, String str5) {
        return new DlUpdateMobileRequest(str, str2, str3, bool, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlUpdateMobileRequest)) {
            return false;
        }
        DlUpdateMobileRequest dlUpdateMobileRequest = (DlUpdateMobileRequest) obj;
        return l.a(this.p2Dob, dlUpdateMobileRequest.p2Dob) && l.a(this.p3Type, dlUpdateMobileRequest.p3Type) && l.a(this.p4OldMob, dlUpdateMobileRequest.p4OldMob) && l.a(this.enc, dlUpdateMobileRequest.enc) && l.a(this.p1DlNumber, dlUpdateMobileRequest.p1DlNumber) && l.a(this.p5NewMob, dlUpdateMobileRequest.p5NewMob);
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

    public final String getP4OldMob() {
        return this.p4OldMob;
    }

    public final String getP5NewMob() {
        return this.p5NewMob;
    }

    public int hashCode() {
        String str = this.p2Dob;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.p3Type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.p4OldMob;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.enc;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.p1DlNumber;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.p5NewMob;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode5 + i10;
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

    public final void setP4OldMob(String str) {
        this.p4OldMob = str;
    }

    public final void setP5NewMob(String str) {
        this.p5NewMob = str;
    }

    public String toString() {
        return "DlUpdateMobileRequest(p2Dob=" + this.p2Dob + ", p3Type=" + this.p3Type + ", p4OldMob=" + this.p4OldMob + ", enc=" + this.enc + ", p1DlNumber=" + this.p1DlNumber + ", p5NewMob=" + this.p5NewMob + ')';
    }
}
