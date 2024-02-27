package com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Data implements Serializable {
    private final String applNo;
    private final String feeCharge;
    private final Integer offCd;
    private final long opDt;
    private final int purCd;
    private final String regnNo;
    private final String stateCd;

    public Data(String str, Integer num, long j10, int i10, String str2, String str3, String str4) {
        this.applNo = str;
        this.offCd = num;
        this.opDt = j10;
        this.purCd = i10;
        this.regnNo = str2;
        this.feeCharge = str3;
        this.stateCd = str4;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, Integer num, long j10, int i10, String str2, String str3, String str4, int i11, Object obj) {
        Data data2 = data;
        return data.copy((i11 & 1) != 0 ? data2.applNo : str, (i11 & 2) != 0 ? data2.offCd : num, (i11 & 4) != 0 ? data2.opDt : j10, (i11 & 8) != 0 ? data2.purCd : i10, (i11 & 16) != 0 ? data2.regnNo : str2, (i11 & 32) != 0 ? data2.feeCharge : str3, (i11 & 64) != 0 ? data2.stateCd : str4);
    }

    public final String component1() {
        return this.applNo;
    }

    public final Integer component2() {
        return this.offCd;
    }

    public final long component3() {
        return this.opDt;
    }

    public final int component4() {
        return this.purCd;
    }

    public final String component5() {
        return this.regnNo;
    }

    public final String component6() {
        return this.feeCharge;
    }

    public final String component7() {
        return this.stateCd;
    }

    public final Data copy(String str, Integer num, long j10, int i10, String str2, String str3, String str4) {
        return new Data(str, num, j10, i10, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.applNo, data.applNo) && l.a(this.offCd, data.offCd) && this.opDt == data.opDt && this.purCd == data.purCd && l.a(this.regnNo, data.regnNo) && l.a(this.feeCharge, data.feeCharge) && l.a(this.stateCd, data.stateCd);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getFeeCharge() {
        return this.feeCharge;
    }

    public final Integer getOffCd() {
        return this.offCd;
    }

    public final long getOpDt() {
        return this.opDt;
    }

    public final int getPurCd() {
        return this.purCd;
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
        Integer num = this.offCd;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Long.hashCode(this.opDt)) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str2 = this.regnNo;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.feeCharge;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stateCd;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", purCd=" + this.purCd + ", regnNo=" + this.regnNo + ", feeCharge=" + this.feeCharge + ", stateCd=" + this.stateCd + ')';
    }
}
