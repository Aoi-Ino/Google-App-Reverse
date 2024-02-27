package com.nic.mparivahan.VahanServices.Nominee.NModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DataX {
    private final String applNo;
    private final String nominationDt;
    private final String nomineeName;
    private final int offCd;
    private final String opdt;
    private final int purCd;
    private final String regnNo;
    private final int relation;
    private final String stateCd;

    public DataX(String str, String str2, String str3, int i10, String str4, int i11, String str5, int i12, String str6) {
        this.applNo = str;
        this.nominationDt = str2;
        this.nomineeName = str3;
        this.offCd = i10;
        this.opdt = str4;
        this.purCd = i11;
        this.regnNo = str5;
        this.relation = i12;
        this.stateCd = str6;
    }

    public static /* synthetic */ DataX copy$default(DataX dataX, String str, String str2, String str3, int i10, String str4, int i11, String str5, int i12, String str6, int i13, Object obj) {
        DataX dataX2 = dataX;
        int i14 = i13;
        return dataX.copy((i14 & 1) != 0 ? dataX2.applNo : str, (i14 & 2) != 0 ? dataX2.nominationDt : str2, (i14 & 4) != 0 ? dataX2.nomineeName : str3, (i14 & 8) != 0 ? dataX2.offCd : i10, (i14 & 16) != 0 ? dataX2.opdt : str4, (i14 & 32) != 0 ? dataX2.purCd : i11, (i14 & 64) != 0 ? dataX2.regnNo : str5, (i14 & 128) != 0 ? dataX2.relation : i12, (i14 & 256) != 0 ? dataX2.stateCd : str6);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component2() {
        return this.nominationDt;
    }

    public final String component3() {
        return this.nomineeName;
    }

    public final int component4() {
        return this.offCd;
    }

    public final String component5() {
        return this.opdt;
    }

    public final int component6() {
        return this.purCd;
    }

    public final String component7() {
        return this.regnNo;
    }

    public final int component8() {
        return this.relation;
    }

    public final String component9() {
        return this.stateCd;
    }

    public final DataX copy(String str, String str2, String str3, int i10, String str4, int i11, String str5, int i12, String str6) {
        return new DataX(str, str2, str3, i10, str4, i11, str5, i12, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataX)) {
            return false;
        }
        DataX dataX = (DataX) obj;
        return l.a(this.applNo, dataX.applNo) && l.a(this.nominationDt, dataX.nominationDt) && l.a(this.nomineeName, dataX.nomineeName) && this.offCd == dataX.offCd && l.a(this.opdt, dataX.opdt) && this.purCd == dataX.purCd && l.a(this.regnNo, dataX.regnNo) && this.relation == dataX.relation && l.a(this.stateCd, dataX.stateCd);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getNominationDt() {
        return this.nominationDt;
    }

    public final String getNomineeName() {
        return this.nomineeName;
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

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final int getRelation() {
        return this.relation;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        String str = this.applNo;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nominationDt;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nomineeName;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.offCd)) * 31;
        String str4 = this.opdt;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str5 = this.regnNo;
        int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.relation)) * 31;
        String str6 = this.stateCd;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        return "DataX(applNo=" + this.applNo + ", nominationDt=" + this.nominationDt + ", nomineeName=" + this.nomineeName + ", offCd=" + this.offCd + ", opdt=" + this.opdt + ", purCd=" + this.purCd + ", regnNo=" + this.regnNo + ", relation=" + this.relation + ", stateCd=" + this.stateCd + ')';
    }
}
