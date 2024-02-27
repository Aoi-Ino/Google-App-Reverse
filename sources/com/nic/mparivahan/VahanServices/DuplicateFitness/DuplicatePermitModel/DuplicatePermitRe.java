package com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class DuplicatePermitRe {
    private final String applNo;
    private final String docList;
    private final ArrayList<Doclist> doclist;
    private final String firDate;
    private final String firNumber;
    private final int offCd;
    private final String pmtNo;
    private final String policeStation;
    private final String prjname;
    private final int purCd;
    private final String reason;
    private final String reasonTxt;
    private final String regnNo;
    private final String stateCd;
    private final String status;
    private final String updatedOn;

    public DuplicatePermitRe(String str, String str2, ArrayList<Doclist> arrayList, String str3, String str4, int i10, String str5, String str6, String str7, int i11, String str8, String str9, String str10, String str11, String str12, String str13) {
        String str14 = str;
        String str15 = str2;
        ArrayList<Doclist> arrayList2 = arrayList;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        String str26 = str13;
        l.f(str14, "applNo");
        l.f(str15, "docList");
        l.f(arrayList2, "doclist");
        l.f(str16, "firDate");
        l.f(str17, "firNumber");
        l.f(str18, "pmtNo");
        l.f(str19, "policeStation");
        l.f(str20, "prjname");
        l.f(str21, "reason");
        l.f(str22, "reasonTxt");
        l.f(str23, "regnNo");
        l.f(str24, "stateCd");
        l.f(str25, "status");
        l.f(str26, "updatedOn");
        this.applNo = str14;
        this.docList = str15;
        this.doclist = arrayList2;
        this.firDate = str16;
        this.firNumber = str17;
        this.offCd = i10;
        this.pmtNo = str18;
        this.policeStation = str19;
        this.prjname = str20;
        this.purCd = i11;
        this.reason = str21;
        this.reasonTxt = str22;
        this.regnNo = str23;
        this.stateCd = str24;
        this.status = str25;
        this.updatedOn = str26;
    }

    public static /* synthetic */ DuplicatePermitRe copy$default(DuplicatePermitRe duplicatePermitRe, String str, String str2, ArrayList arrayList, String str3, String str4, int i10, String str5, String str6, String str7, int i11, String str8, String str9, String str10, String str11, String str12, String str13, int i12, Object obj) {
        DuplicatePermitRe duplicatePermitRe2 = duplicatePermitRe;
        int i13 = i12;
        return duplicatePermitRe.copy((i13 & 1) != 0 ? duplicatePermitRe2.applNo : str, (i13 & 2) != 0 ? duplicatePermitRe2.docList : str2, (i13 & 4) != 0 ? duplicatePermitRe2.doclist : arrayList, (i13 & 8) != 0 ? duplicatePermitRe2.firDate : str3, (i13 & 16) != 0 ? duplicatePermitRe2.firNumber : str4, (i13 & 32) != 0 ? duplicatePermitRe2.offCd : i10, (i13 & 64) != 0 ? duplicatePermitRe2.pmtNo : str5, (i13 & 128) != 0 ? duplicatePermitRe2.policeStation : str6, (i13 & 256) != 0 ? duplicatePermitRe2.prjname : str7, (i13 & 512) != 0 ? duplicatePermitRe2.purCd : i11, (i13 & 1024) != 0 ? duplicatePermitRe2.reason : str8, (i13 & 2048) != 0 ? duplicatePermitRe2.reasonTxt : str9, (i13 & 4096) != 0 ? duplicatePermitRe2.regnNo : str10, (i13 & 8192) != 0 ? duplicatePermitRe2.stateCd : str11, (i13 & 16384) != 0 ? duplicatePermitRe2.status : str12, (i13 & 32768) != 0 ? duplicatePermitRe2.updatedOn : str13);
    }

    public final String component1() {
        return this.applNo;
    }

    public final int component10() {
        return this.purCd;
    }

    public final String component11() {
        return this.reason;
    }

    public final String component12() {
        return this.reasonTxt;
    }

    public final String component13() {
        return this.regnNo;
    }

    public final String component14() {
        return this.stateCd;
    }

    public final String component15() {
        return this.status;
    }

    public final String component16() {
        return this.updatedOn;
    }

    public final String component2() {
        return this.docList;
    }

    public final ArrayList<Doclist> component3() {
        return this.doclist;
    }

    public final String component4() {
        return this.firDate;
    }

    public final String component5() {
        return this.firNumber;
    }

    public final int component6() {
        return this.offCd;
    }

    public final String component7() {
        return this.pmtNo;
    }

    public final String component8() {
        return this.policeStation;
    }

    public final String component9() {
        return this.prjname;
    }

    public final DuplicatePermitRe copy(String str, String str2, ArrayList<Doclist> arrayList, String str3, String str4, int i10, String str5, String str6, String str7, int i11, String str8, String str9, String str10, String str11, String str12, String str13) {
        String str14 = str;
        l.f(str14, "applNo");
        l.f(str2, "docList");
        l.f(arrayList, "doclist");
        l.f(str3, "firDate");
        l.f(str4, "firNumber");
        l.f(str5, "pmtNo");
        l.f(str6, "policeStation");
        l.f(str7, "prjname");
        l.f(str8, "reason");
        l.f(str9, "reasonTxt");
        l.f(str10, "regnNo");
        l.f(str11, "stateCd");
        l.f(str12, "status");
        l.f(str13, "updatedOn");
        return new DuplicatePermitRe(str14, str2, arrayList, str3, str4, i10, str5, str6, str7, i11, str8, str9, str10, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuplicatePermitRe)) {
            return false;
        }
        DuplicatePermitRe duplicatePermitRe = (DuplicatePermitRe) obj;
        return l.a(this.applNo, duplicatePermitRe.applNo) && l.a(this.docList, duplicatePermitRe.docList) && l.a(this.doclist, duplicatePermitRe.doclist) && l.a(this.firDate, duplicatePermitRe.firDate) && l.a(this.firNumber, duplicatePermitRe.firNumber) && this.offCd == duplicatePermitRe.offCd && l.a(this.pmtNo, duplicatePermitRe.pmtNo) && l.a(this.policeStation, duplicatePermitRe.policeStation) && l.a(this.prjname, duplicatePermitRe.prjname) && this.purCd == duplicatePermitRe.purCd && l.a(this.reason, duplicatePermitRe.reason) && l.a(this.reasonTxt, duplicatePermitRe.reasonTxt) && l.a(this.regnNo, duplicatePermitRe.regnNo) && l.a(this.stateCd, duplicatePermitRe.stateCd) && l.a(this.status, duplicatePermitRe.status) && l.a(this.updatedOn, duplicatePermitRe.updatedOn);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getDocList() {
        return this.docList;
    }

    public final ArrayList<Doclist> getDoclist() {
        return this.doclist;
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

    public final String getPrjname() {
        return this.prjname;
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
        return (((((((((((((((((((((((((((((this.applNo.hashCode() * 31) + this.docList.hashCode()) * 31) + this.doclist.hashCode()) * 31) + this.firDate.hashCode()) * 31) + this.firNumber.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.pmtNo.hashCode()) * 31) + this.policeStation.hashCode()) * 31) + this.prjname.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.reason.hashCode()) * 31) + this.reasonTxt.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.status.hashCode()) * 31) + this.updatedOn.hashCode();
    }

    public String toString() {
        return "DuplicatePermitRe(applNo=" + this.applNo + ", docList=" + this.docList + ", doclist=" + this.doclist + ", firDate=" + this.firDate + ", firNumber=" + this.firNumber + ", offCd=" + this.offCd + ", pmtNo=" + this.pmtNo + ", policeStation=" + this.policeStation + ", prjname=" + this.prjname + ", purCd=" + this.purCd + ", reason=" + this.reason + ", reasonTxt=" + this.reasonTxt + ", regnNo=" + this.regnNo + ", stateCd=" + this.stateCd + ", status=" + this.status + ", updatedOn=" + this.updatedOn + ')';
    }
}
