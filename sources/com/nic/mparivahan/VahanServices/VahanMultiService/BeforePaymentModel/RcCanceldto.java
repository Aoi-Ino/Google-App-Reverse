package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class RcCanceldto implements Serializable {
    private final String applNo;
    private final String approvedBy;
    private final String cancelDt;
    private final String fileRefNo;
    private final int offCd;
    private final String opdt;
    private final int purCd;
    private final String reason;
    private final String regnNo;
    private final String stateCd;

    public RcCanceldto(String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, String str8) {
        l.f(str, "applNo");
        l.f(str2, "approvedBy");
        l.f(str3, "cancelDt");
        l.f(str4, "fileRefNo");
        l.f(str5, "opdt");
        l.f(str6, "reason");
        l.f(str7, "regnNo");
        l.f(str8, "stateCd");
        this.applNo = str;
        this.approvedBy = str2;
        this.cancelDt = str3;
        this.fileRefNo = str4;
        this.offCd = i10;
        this.opdt = str5;
        this.purCd = i11;
        this.reason = str6;
        this.regnNo = str7;
        this.stateCd = str8;
    }

    public static /* synthetic */ RcCanceldto copy$default(RcCanceldto rcCanceldto, String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, String str8, int i12, Object obj) {
        RcCanceldto rcCanceldto2 = rcCanceldto;
        int i13 = i12;
        return rcCanceldto.copy((i13 & 1) != 0 ? rcCanceldto2.applNo : str, (i13 & 2) != 0 ? rcCanceldto2.approvedBy : str2, (i13 & 4) != 0 ? rcCanceldto2.cancelDt : str3, (i13 & 8) != 0 ? rcCanceldto2.fileRefNo : str4, (i13 & 16) != 0 ? rcCanceldto2.offCd : i10, (i13 & 32) != 0 ? rcCanceldto2.opdt : str5, (i13 & 64) != 0 ? rcCanceldto2.purCd : i11, (i13 & 128) != 0 ? rcCanceldto2.reason : str6, (i13 & 256) != 0 ? rcCanceldto2.regnNo : str7, (i13 & 512) != 0 ? rcCanceldto2.stateCd : str8);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component10() {
        return this.stateCd;
    }

    public final String component2() {
        return this.approvedBy;
    }

    public final String component3() {
        return this.cancelDt;
    }

    public final String component4() {
        return this.fileRefNo;
    }

    public final int component5() {
        return this.offCd;
    }

    public final String component6() {
        return this.opdt;
    }

    public final int component7() {
        return this.purCd;
    }

    public final String component8() {
        return this.reason;
    }

    public final String component9() {
        return this.regnNo;
    }

    public final RcCanceldto copy(String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, String str8) {
        l.f(str, "applNo");
        l.f(str2, "approvedBy");
        l.f(str3, "cancelDt");
        String str9 = str4;
        l.f(str9, "fileRefNo");
        String str10 = str5;
        l.f(str10, "opdt");
        String str11 = str6;
        l.f(str11, "reason");
        String str12 = str7;
        l.f(str12, "regnNo");
        String str13 = str8;
        l.f(str13, "stateCd");
        return new RcCanceldto(str, str2, str3, str9, i10, str10, i11, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RcCanceldto)) {
            return false;
        }
        RcCanceldto rcCanceldto = (RcCanceldto) obj;
        return l.a(this.applNo, rcCanceldto.applNo) && l.a(this.approvedBy, rcCanceldto.approvedBy) && l.a(this.cancelDt, rcCanceldto.cancelDt) && l.a(this.fileRefNo, rcCanceldto.fileRefNo) && this.offCd == rcCanceldto.offCd && l.a(this.opdt, rcCanceldto.opdt) && this.purCd == rcCanceldto.purCd && l.a(this.reason, rcCanceldto.reason) && l.a(this.regnNo, rcCanceldto.regnNo) && l.a(this.stateCd, rcCanceldto.stateCd);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getApprovedBy() {
        return this.approvedBy;
    }

    public final String getCancelDt() {
        return this.cancelDt;
    }

    public final String getFileRefNo() {
        return this.fileRefNo;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getOpdt() {
        return this.opdt;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        return (((((((((((((((((this.applNo.hashCode() * 31) + this.approvedBy.hashCode()) * 31) + this.cancelDt.hashCode()) * 31) + this.fileRefNo.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.opdt.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.reason.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.stateCd.hashCode();
    }

    public String toString() {
        return "RcCanceldto(applNo=" + this.applNo + ", approvedBy=" + this.approvedBy + ", cancelDt=" + this.cancelDt + ", fileRefNo=" + this.fileRefNo + ", offCd=" + this.offCd + ", opdt=" + this.opdt + ", purCd=" + this.purCd + ", reason=" + this.reason + ", regnNo=" + this.regnNo + ", stateCd=" + this.stateCd + ')';
    }
}
