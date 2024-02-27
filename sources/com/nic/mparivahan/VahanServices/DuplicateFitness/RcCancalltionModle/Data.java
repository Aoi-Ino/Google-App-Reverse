package com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Data implements Serializable {
    private final String applNo;
    private final String approvedBy;
    private final Long cancelDt;
    private final String fileRefNo;
    private final int offCd;
    private final Long opdt;
    private final int purCd;
    private final String reason;
    private final String regnNo;
    private final String stateCd;

    public Data(String str, String str2, Long l10, String str3, int i10, Long l11, int i11, String str4, String str5, String str6) {
        this.applNo = str;
        this.approvedBy = str2;
        this.cancelDt = l10;
        this.fileRefNo = str3;
        this.offCd = i10;
        this.opdt = l11;
        this.purCd = i11;
        this.reason = str4;
        this.regnNo = str5;
        this.stateCd = str6;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, Long l10, String str3, int i10, Long l11, int i11, String str4, String str5, String str6, int i12, Object obj) {
        Data data2 = data;
        int i13 = i12;
        return data.copy((i13 & 1) != 0 ? data2.applNo : str, (i13 & 2) != 0 ? data2.approvedBy : str2, (i13 & 4) != 0 ? data2.cancelDt : l10, (i13 & 8) != 0 ? data2.fileRefNo : str3, (i13 & 16) != 0 ? data2.offCd : i10, (i13 & 32) != 0 ? data2.opdt : l11, (i13 & 64) != 0 ? data2.purCd : i11, (i13 & 128) != 0 ? data2.reason : str4, (i13 & 256) != 0 ? data2.regnNo : str5, (i13 & 512) != 0 ? data2.stateCd : str6);
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

    public final Long component3() {
        return this.cancelDt;
    }

    public final String component4() {
        return this.fileRefNo;
    }

    public final int component5() {
        return this.offCd;
    }

    public final Long component6() {
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

    public final Data copy(String str, String str2, Long l10, String str3, int i10, Long l11, int i11, String str4, String str5, String str6) {
        return new Data(str, str2, l10, str3, i10, l11, i11, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.applNo, data.applNo) && l.a(this.approvedBy, data.approvedBy) && l.a(this.cancelDt, data.cancelDt) && l.a(this.fileRefNo, data.fileRefNo) && this.offCd == data.offCd && l.a(this.opdt, data.opdt) && this.purCd == data.purCd && l.a(this.reason, data.reason) && l.a(this.regnNo, data.regnNo) && l.a(this.stateCd, data.stateCd);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getApprovedBy() {
        return this.approvedBy;
    }

    public final Long getCancelDt() {
        return this.cancelDt;
    }

    public final String getFileRefNo() {
        return this.fileRefNo;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final Long getOpdt() {
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
        String str = this.applNo;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.approvedBy;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.cancelDt;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str3 = this.fileRefNo;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.offCd)) * 31;
        Long l11 = this.opdt;
        int hashCode5 = (((hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str4 = this.reason;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.regnNo;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.stateCd;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode7 + i10;
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", approvedBy=" + this.approvedBy + ", cancelDt=" + this.cancelDt + ", fileRefNo=" + this.fileRefNo + ", offCd=" + this.offCd + ", opdt=" + this.opdt + ", purCd=" + this.purCd + ", reason=" + this.reason + ", regnNo=" + this.regnNo + ", stateCd=" + this.stateCd + ')';
    }
}
