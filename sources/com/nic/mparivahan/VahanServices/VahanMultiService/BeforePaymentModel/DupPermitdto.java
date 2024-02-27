package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class DupPermitdto implements Serializable {
    private final String applNo;
    private final String docList;
    private final String firDate;
    private final String firNumber;
    private final int offCd;
    private final String pmtNo;
    private final String policeStation;
    private final int purCd;
    private final String reason;
    private final String reasonTxt;
    private final String regnNo;
    private final String stateCd;
    private final String status;
    private final String updatedOn;

    public DupPermitdto(String str, String str2, String str3, String str4, int i10, String str5, String str6, int i11, String str7, String str8, String str9, String str10, String str11, String str12) {
        l.f(str, "applNo");
        l.f(str2, "docList");
        l.f(str3, "firDate");
        l.f(str4, "firNumber");
        l.f(str5, "pmtNo");
        l.f(str6, "policeStation");
        l.f(str7, "reason");
        l.f(str8, "reasonTxt");
        l.f(str9, "regnNo");
        l.f(str10, "stateCd");
        l.f(str11, "status");
        l.f(str12, "updatedOn");
        this.applNo = str;
        this.docList = str2;
        this.firDate = str3;
        this.firNumber = str4;
        this.offCd = i10;
        this.pmtNo = str5;
        this.policeStation = str6;
        this.purCd = i11;
        this.reason = str7;
        this.reasonTxt = str8;
        this.regnNo = str9;
        this.stateCd = str10;
        this.status = str11;
        this.updatedOn = str12;
    }

    public static /* synthetic */ DupPermitdto copy$default(DupPermitdto dupPermitdto, String str, String str2, String str3, String str4, int i10, String str5, String str6, int i11, String str7, String str8, String str9, String str10, String str11, String str12, int i12, Object obj) {
        DupPermitdto dupPermitdto2 = dupPermitdto;
        int i13 = i12;
        return dupPermitdto.copy((i13 & 1) != 0 ? dupPermitdto2.applNo : str, (i13 & 2) != 0 ? dupPermitdto2.docList : str2, (i13 & 4) != 0 ? dupPermitdto2.firDate : str3, (i13 & 8) != 0 ? dupPermitdto2.firNumber : str4, (i13 & 16) != 0 ? dupPermitdto2.offCd : i10, (i13 & 32) != 0 ? dupPermitdto2.pmtNo : str5, (i13 & 64) != 0 ? dupPermitdto2.policeStation : str6, (i13 & 128) != 0 ? dupPermitdto2.purCd : i11, (i13 & 256) != 0 ? dupPermitdto2.reason : str7, (i13 & 512) != 0 ? dupPermitdto2.reasonTxt : str8, (i13 & 1024) != 0 ? dupPermitdto2.regnNo : str9, (i13 & 2048) != 0 ? dupPermitdto2.stateCd : str10, (i13 & 4096) != 0 ? dupPermitdto2.status : str11, (i13 & 8192) != 0 ? dupPermitdto2.updatedOn : str12);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component10() {
        return this.reasonTxt;
    }

    public final String component11() {
        return this.regnNo;
    }

    public final String component12() {
        return this.stateCd;
    }

    public final String component13() {
        return this.status;
    }

    public final String component14() {
        return this.updatedOn;
    }

    public final String component2() {
        return this.docList;
    }

    public final String component3() {
        return this.firDate;
    }

    public final String component4() {
        return this.firNumber;
    }

    public final int component5() {
        return this.offCd;
    }

    public final String component6() {
        return this.pmtNo;
    }

    public final String component7() {
        return this.policeStation;
    }

    public final int component8() {
        return this.purCd;
    }

    public final String component9() {
        return this.reason;
    }

    public final DupPermitdto copy(String str, String str2, String str3, String str4, int i10, String str5, String str6, int i11, String str7, String str8, String str9, String str10, String str11, String str12) {
        String str13 = str;
        l.f(str13, "applNo");
        String str14 = str2;
        l.f(str14, "docList");
        String str15 = str3;
        l.f(str15, "firDate");
        String str16 = str4;
        l.f(str16, "firNumber");
        String str17 = str5;
        l.f(str17, "pmtNo");
        String str18 = str6;
        l.f(str18, "policeStation");
        String str19 = str7;
        l.f(str19, "reason");
        String str20 = str8;
        l.f(str20, "reasonTxt");
        String str21 = str9;
        l.f(str21, "regnNo");
        String str22 = str10;
        l.f(str22, "stateCd");
        String str23 = str11;
        l.f(str23, "status");
        String str24 = str12;
        l.f(str24, "updatedOn");
        return new DupPermitdto(str13, str14, str15, str16, i10, str17, str18, i11, str19, str20, str21, str22, str23, str24);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DupPermitdto)) {
            return false;
        }
        DupPermitdto dupPermitdto = (DupPermitdto) obj;
        return l.a(this.applNo, dupPermitdto.applNo) && l.a(this.docList, dupPermitdto.docList) && l.a(this.firDate, dupPermitdto.firDate) && l.a(this.firNumber, dupPermitdto.firNumber) && this.offCd == dupPermitdto.offCd && l.a(this.pmtNo, dupPermitdto.pmtNo) && l.a(this.policeStation, dupPermitdto.policeStation) && this.purCd == dupPermitdto.purCd && l.a(this.reason, dupPermitdto.reason) && l.a(this.reasonTxt, dupPermitdto.reasonTxt) && l.a(this.regnNo, dupPermitdto.regnNo) && l.a(this.stateCd, dupPermitdto.stateCd) && l.a(this.status, dupPermitdto.status) && l.a(this.updatedOn, dupPermitdto.updatedOn);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getDocList() {
        return this.docList;
    }

    public final String getFirDate() {
        return this.firDate;
    }

    public final String getFirNumber() {
        return this.firNumber;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getPmtNo() {
        return this.pmtNo;
    }

    public final String getPoliceStation() {
        return this.policeStation;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonTxt() {
        return this.reasonTxt;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUpdatedOn() {
        return this.updatedOn;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.applNo.hashCode() * 31) + this.docList.hashCode()) * 31) + this.firDate.hashCode()) * 31) + this.firNumber.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.pmtNo.hashCode()) * 31) + this.policeStation.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.reason.hashCode()) * 31) + this.reasonTxt.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.status.hashCode()) * 31) + this.updatedOn.hashCode();
    }

    public String toString() {
        return "DupPermitdto(applNo=" + this.applNo + ", docList=" + this.docList + ", firDate=" + this.firDate + ", firNumber=" + this.firNumber + ", offCd=" + this.offCd + ", pmtNo=" + this.pmtNo + ", policeStation=" + this.policeStation + ", purCd=" + this.purCd + ", reason=" + this.reason + ", reasonTxt=" + this.reasonTxt + ", regnNo=" + this.regnNo + ", stateCd=" + this.stateCd + ", status=" + this.status + ", updatedOn=" + this.updatedOn + ')';
    }
}
