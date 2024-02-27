package com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public final class DataX implements Serializable {
    private final String applNo;
    private final String docList;
    private final ArrayList<DoclistXX> doclist;
    private final long firDate;
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

    public DataX(String str, String str2, ArrayList<DoclistXX> arrayList, long j10, String str3, int i10, String str4, String str5, int i11, String str6, String str7, String str8, String str9, String str10, String str11) {
        l.f(arrayList, "doclist");
        this.applNo = str;
        this.docList = str2;
        this.doclist = arrayList;
        this.firDate = j10;
        this.firNumber = str3;
        this.offCd = i10;
        this.pmtNo = str4;
        this.policeStation = str5;
        this.purCd = i11;
        this.reason = str6;
        this.reasonTxt = str7;
        this.regnNo = str8;
        this.stateCd = str9;
        this.status = str10;
        this.updatedOn = str11;
    }

    public static /* synthetic */ DataX copy$default(DataX dataX, String str, String str2, ArrayList arrayList, long j10, String str3, int i10, String str4, String str5, int i11, String str6, String str7, String str8, String str9, String str10, String str11, int i12, Object obj) {
        DataX dataX2 = dataX;
        int i13 = i12;
        return dataX.copy((i13 & 1) != 0 ? dataX2.applNo : str, (i13 & 2) != 0 ? dataX2.docList : str2, (i13 & 4) != 0 ? dataX2.doclist : arrayList, (i13 & 8) != 0 ? dataX2.firDate : j10, (i13 & 16) != 0 ? dataX2.firNumber : str3, (i13 & 32) != 0 ? dataX2.offCd : i10, (i13 & 64) != 0 ? dataX2.pmtNo : str4, (i13 & 128) != 0 ? dataX2.policeStation : str5, (i13 & 256) != 0 ? dataX2.purCd : i11, (i13 & 512) != 0 ? dataX2.reason : str6, (i13 & 1024) != 0 ? dataX2.reasonTxt : str7, (i13 & 2048) != 0 ? dataX2.regnNo : str8, (i13 & 4096) != 0 ? dataX2.stateCd : str9, (i13 & 8192) != 0 ? dataX2.status : str10, (i13 & 16384) != 0 ? dataX2.updatedOn : str11);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component10() {
        return this.reason;
    }

    public final String component11() {
        return this.reasonTxt;
    }

    public final String component12() {
        return this.regnNo;
    }

    public final String component13() {
        return this.stateCd;
    }

    public final String component14() {
        return this.status;
    }

    public final String component15() {
        return this.updatedOn;
    }

    public final String component2() {
        return this.docList;
    }

    public final ArrayList<DoclistXX> component3() {
        return this.doclist;
    }

    public final long component4() {
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

    public final int component9() {
        return this.purCd;
    }

    public final DataX copy(String str, String str2, ArrayList<DoclistXX> arrayList, long j10, String str3, int i10, String str4, String str5, int i11, String str6, String str7, String str8, String str9, String str10, String str11) {
        String str12 = str;
        l.f(arrayList, "doclist");
        return new DataX(str, str2, arrayList, j10, str3, i10, str4, str5, i11, str6, str7, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataX)) {
            return false;
        }
        DataX dataX = (DataX) obj;
        return l.a(this.applNo, dataX.applNo) && l.a(this.docList, dataX.docList) && l.a(this.doclist, dataX.doclist) && this.firDate == dataX.firDate && l.a(this.firNumber, dataX.firNumber) && this.offCd == dataX.offCd && l.a(this.pmtNo, dataX.pmtNo) && l.a(this.policeStation, dataX.policeStation) && this.purCd == dataX.purCd && l.a(this.reason, dataX.reason) && l.a(this.reasonTxt, dataX.reasonTxt) && l.a(this.regnNo, dataX.regnNo) && l.a(this.stateCd, dataX.stateCd) && l.a(this.status, dataX.status) && l.a(this.updatedOn, dataX.updatedOn);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getDocList() {
        return this.docList;
    }

    public final ArrayList<DoclistXX> getDoclist() {
        return this.doclist;
    }

    public final long getFirDate() {
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
        String str = this.applNo;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.docList;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.doclist.hashCode()) * 31) + Long.hashCode(this.firDate)) * 31;
        String str3 = this.firNumber;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.offCd)) * 31;
        String str4 = this.pmtNo;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.policeStation;
        int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str6 = this.reason;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.reasonTxt;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.regnNo;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.stateCd;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.status;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.updatedOn;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return hashCode10 + i10;
    }

    public String toString() {
        return "DataX(applNo=" + this.applNo + ", docList=" + this.docList + ", doclist=" + this.doclist + ", firDate=" + this.firDate + ", firNumber=" + this.firNumber + ", offCd=" + this.offCd + ", pmtNo=" + this.pmtNo + ", policeStation=" + this.policeStation + ", purCd=" + this.purCd + ", reason=" + this.reason + ", reasonTxt=" + this.reasonTxt + ", regnNo=" + this.regnNo + ", stateCd=" + this.stateCd + ", status=" + this.status + ", updatedOn=" + this.updatedOn + ')';
    }
}
