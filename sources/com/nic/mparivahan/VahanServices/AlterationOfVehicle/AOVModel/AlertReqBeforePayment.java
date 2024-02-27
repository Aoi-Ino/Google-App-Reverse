package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class AlertReqBeforePayment implements Serializable {
    private final String aadhaartxno;
    private final String aadharauth;
    private final String appl_no;
    private final boolean application_status;
    private final String off_cd;
    private final String pur_cd;
    private final String regn_no;
    private final String state_cd;
    private final String status;

    public AlertReqBeforePayment(String str, String str2, String str3, boolean z10, String str4, String str5, String str6, String str7, String str8) {
        l.f(str4, "off_cd");
        l.f(str5, "pur_cd");
        l.f(str6, "regn_no");
        l.f(str7, "state_cd");
        l.f(str8, "status");
        this.aadhaartxno = str;
        this.aadharauth = str2;
        this.appl_no = str3;
        this.application_status = z10;
        this.off_cd = str4;
        this.pur_cd = str5;
        this.regn_no = str6;
        this.state_cd = str7;
        this.status = str8;
    }

    public static /* synthetic */ AlertReqBeforePayment copy$default(AlertReqBeforePayment alertReqBeforePayment, String str, String str2, String str3, boolean z10, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
        AlertReqBeforePayment alertReqBeforePayment2 = alertReqBeforePayment;
        int i11 = i10;
        return alertReqBeforePayment.copy((i11 & 1) != 0 ? alertReqBeforePayment2.aadhaartxno : str, (i11 & 2) != 0 ? alertReqBeforePayment2.aadharauth : str2, (i11 & 4) != 0 ? alertReqBeforePayment2.appl_no : str3, (i11 & 8) != 0 ? alertReqBeforePayment2.application_status : z10, (i11 & 16) != 0 ? alertReqBeforePayment2.off_cd : str4, (i11 & 32) != 0 ? alertReqBeforePayment2.pur_cd : str5, (i11 & 64) != 0 ? alertReqBeforePayment2.regn_no : str6, (i11 & 128) != 0 ? alertReqBeforePayment2.state_cd : str7, (i11 & 256) != 0 ? alertReqBeforePayment2.status : str8);
    }

    public final String component1() {
        return this.aadhaartxno;
    }

    public final String component2() {
        return this.aadharauth;
    }

    public final String component3() {
        return this.appl_no;
    }

    public final boolean component4() {
        return this.application_status;
    }

    public final String component5() {
        return this.off_cd;
    }

    public final String component6() {
        return this.pur_cd;
    }

    public final String component7() {
        return this.regn_no;
    }

    public final String component8() {
        return this.state_cd;
    }

    public final String component9() {
        return this.status;
    }

    public final AlertReqBeforePayment copy(String str, String str2, String str3, boolean z10, String str4, String str5, String str6, String str7, String str8) {
        String str9 = str4;
        l.f(str9, "off_cd");
        String str10 = str5;
        l.f(str10, "pur_cd");
        String str11 = str6;
        l.f(str11, "regn_no");
        String str12 = str7;
        l.f(str12, "state_cd");
        String str13 = str8;
        l.f(str13, "status");
        return new AlertReqBeforePayment(str, str2, str3, z10, str9, str10, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertReqBeforePayment)) {
            return false;
        }
        AlertReqBeforePayment alertReqBeforePayment = (AlertReqBeforePayment) obj;
        return l.a(this.aadhaartxno, alertReqBeforePayment.aadhaartxno) && l.a(this.aadharauth, alertReqBeforePayment.aadharauth) && l.a(this.appl_no, alertReqBeforePayment.appl_no) && this.application_status == alertReqBeforePayment.application_status && l.a(this.off_cd, alertReqBeforePayment.off_cd) && l.a(this.pur_cd, alertReqBeforePayment.pur_cd) && l.a(this.regn_no, alertReqBeforePayment.regn_no) && l.a(this.state_cd, alertReqBeforePayment.state_cd) && l.a(this.status, alertReqBeforePayment.status);
    }

    public final String getAadhaartxno() {
        return this.aadhaartxno;
    }

    public final String getAadharauth() {
        return this.aadharauth;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final boolean getApplication_status() {
        return this.application_status;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.aadhaartxno;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.aadharauth;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appl_no;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z10 = this.application_status;
        if (z10) {
            z10 = true;
        }
        return ((((((((((i11 + (z10 ? 1 : 0)) * 31) + this.off_cd.hashCode()) * 31) + this.pur_cd.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "AlertReqBeforePayment(aadhaartxno=" + this.aadhaartxno + ", aadharauth=" + this.aadharauth + ", appl_no=" + this.appl_no + ", application_status=" + this.application_status + ", off_cd=" + this.off_cd + ", pur_cd=" + this.pur_cd + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", status=" + this.status + ')';
    }
}
