package com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Data implements Serializable {
    private final String applNo;
    private final Object offCd;
    private final Object purCd;
    private final String regNo;
    private final String relApprovedBy;
    private final String relFileRefNo;
    private final Object relOpDt;
    private final String releaseDt;
    private final String stateCd;

    public Data(String str, Object obj, String str2, Object obj2, String str3, String str4, String str5, String str6, Object obj3) {
        this.stateCd = str;
        this.offCd = obj;
        this.applNo = str2;
        this.purCd = obj2;
        this.regNo = str3;
        this.releaseDt = str4;
        this.relFileRefNo = str5;
        this.relApprovedBy = str6;
        this.relOpDt = obj3;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, Object obj, String str2, Object obj2, String str3, String str4, String str5, String str6, Object obj3, int i10, Object obj4) {
        Data data2 = data;
        int i11 = i10;
        return data.copy((i11 & 1) != 0 ? data2.stateCd : str, (i11 & 2) != 0 ? data2.offCd : obj, (i11 & 4) != 0 ? data2.applNo : str2, (i11 & 8) != 0 ? data2.purCd : obj2, (i11 & 16) != 0 ? data2.regNo : str3, (i11 & 32) != 0 ? data2.releaseDt : str4, (i11 & 64) != 0 ? data2.relFileRefNo : str5, (i11 & 128) != 0 ? data2.relApprovedBy : str6, (i11 & 256) != 0 ? data2.relOpDt : obj3);
    }

    public final String component1() {
        return this.stateCd;
    }

    public final Object component2() {
        return this.offCd;
    }

    public final String component3() {
        return this.applNo;
    }

    public final Object component4() {
        return this.purCd;
    }

    public final String component5() {
        return this.regNo;
    }

    public final String component6() {
        return this.releaseDt;
    }

    public final String component7() {
        return this.relFileRefNo;
    }

    public final String component8() {
        return this.relApprovedBy;
    }

    public final Object component9() {
        return this.relOpDt;
    }

    public final Data copy(String str, Object obj, String str2, Object obj2, String str3, String str4, String str5, String str6, Object obj3) {
        return new Data(str, obj, str2, obj2, str3, str4, str5, str6, obj3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.stateCd, data.stateCd) && l.a(this.offCd, data.offCd) && l.a(this.applNo, data.applNo) && l.a(this.purCd, data.purCd) && l.a(this.regNo, data.regNo) && l.a(this.releaseDt, data.releaseDt) && l.a(this.relFileRefNo, data.relFileRefNo) && l.a(this.relApprovedBy, data.relApprovedBy) && l.a(this.relOpDt, data.relOpDt);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final Object getOffCd() {
        return this.offCd;
    }

    public final Object getPurCd() {
        return this.purCd;
    }

    public final String getRegNo() {
        return this.regNo;
    }

    public final String getRelApprovedBy() {
        return this.relApprovedBy;
    }

    public final String getRelFileRefNo() {
        return this.relFileRefNo;
    }

    public final Object getRelOpDt() {
        return this.relOpDt;
    }

    public final String getReleaseDt() {
        return this.releaseDt;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        String str = this.stateCd;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.offCd;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.applNo;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj2 = this.purCd;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str3 = this.regNo;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.releaseDt;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.relFileRefNo;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.relApprovedBy;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj3 = this.relOpDt;
        if (obj3 != null) {
            i10 = obj3.hashCode();
        }
        return hashCode8 + i10;
    }

    public String toString() {
        return "Data(stateCd=" + this.stateCd + ", offCd=" + this.offCd + ", applNo=" + this.applNo + ", purCd=" + this.purCd + ", regNo=" + this.regNo + ", releaseDt=" + this.releaseDt + ", relFileRefNo=" + this.relFileRefNo + ", relApprovedBy=" + this.relApprovedBy + ", relOpDt=" + this.relOpDt + ')';
    }
}
