package com.nic.mparivahan.VahanEkyc.AadharModle;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc;
import java.io.Serializable;

@Keep
public final class DoAadhaarResponse implements Serializable {
    private final AadarkycVerify.dOEkyc dOAuthOTP;
    private final DOEkyc dOEkyc;
    private final String finalxml;
    private final String regn_no;
    private final String status;
    private String txnNo;

    public DoAadhaarResponse(AadarkycVerify.dOEkyc doekyc, DOEkyc dOEkyc2, String str, String str2, String str3, String str4) {
        l.f(dOEkyc2, "dOEkyc");
        this.dOAuthOTP = doekyc;
        this.dOEkyc = dOEkyc2;
        this.finalxml = str;
        this.regn_no = str2;
        this.status = str3;
        this.txnNo = str4;
    }

    public static /* synthetic */ DoAadhaarResponse copy$default(DoAadhaarResponse doAadhaarResponse, AadarkycVerify.dOEkyc doekyc, DOEkyc dOEkyc2, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            doekyc = doAadhaarResponse.dOAuthOTP;
        }
        if ((i10 & 2) != 0) {
            dOEkyc2 = doAadhaarResponse.dOEkyc;
        }
        DOEkyc dOEkyc3 = dOEkyc2;
        if ((i10 & 4) != 0) {
            str = doAadhaarResponse.finalxml;
        }
        String str5 = str;
        if ((i10 & 8) != 0) {
            str2 = doAadhaarResponse.regn_no;
        }
        String str6 = str2;
        if ((i10 & 16) != 0) {
            str3 = doAadhaarResponse.status;
        }
        String str7 = str3;
        if ((i10 & 32) != 0) {
            str4 = doAadhaarResponse.txnNo;
        }
        return doAadhaarResponse.copy(doekyc, dOEkyc3, str5, str6, str7, str4);
    }

    public final AadarkycVerify.dOEkyc component1() {
        return this.dOAuthOTP;
    }

    public final DOEkyc component2() {
        return this.dOEkyc;
    }

    public final String component3() {
        return this.finalxml;
    }

    public final String component4() {
        return this.regn_no;
    }

    public final String component5() {
        return this.status;
    }

    public final String component6() {
        return this.txnNo;
    }

    public final DoAadhaarResponse copy(AadarkycVerify.dOEkyc doekyc, DOEkyc dOEkyc2, String str, String str2, String str3, String str4) {
        l.f(dOEkyc2, "dOEkyc");
        return new DoAadhaarResponse(doekyc, dOEkyc2, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoAadhaarResponse)) {
            return false;
        }
        DoAadhaarResponse doAadhaarResponse = (DoAadhaarResponse) obj;
        return l.a(this.dOAuthOTP, doAadhaarResponse.dOAuthOTP) && l.a(this.dOEkyc, doAadhaarResponse.dOEkyc) && l.a(this.finalxml, doAadhaarResponse.finalxml) && l.a(this.regn_no, doAadhaarResponse.regn_no) && l.a(this.status, doAadhaarResponse.status) && l.a(this.txnNo, doAadhaarResponse.txnNo);
    }

    public final AadarkycVerify.dOEkyc getDOAuthOTP() {
        return this.dOAuthOTP;
    }

    public final DOEkyc getDOEkyc() {
        return this.dOEkyc;
    }

    public final String getFinalxml() {
        return this.finalxml;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTxnNo() {
        return this.txnNo;
    }

    public int hashCode() {
        AadarkycVerify.dOEkyc doekyc = this.dOAuthOTP;
        int i10 = 0;
        int hashCode = (((doekyc == null ? 0 : doekyc.hashCode()) * 31) + this.dOEkyc.hashCode()) * 31;
        String str = this.finalxml;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.regn_no;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.txnNo;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode4 + i10;
    }

    public final void setTxnNo(String str) {
        this.txnNo = str;
    }

    public String toString() {
        return "DoAadhaarResponse(dOAuthOTP=" + this.dOAuthOTP + ", dOEkyc=" + this.dOEkyc + ", finalxml=" + this.finalxml + ", regn_no=" + this.regn_no + ", status=" + this.status + ", txnNo=" + this.txnNo + ')';
    }
}
