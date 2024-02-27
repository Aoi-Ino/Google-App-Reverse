package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.ErrorRes;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Data {
    private final String applNo;
    private final int officeCode;
    private final long openDate;
    private final int purposeCode;
    private final String regnNo;
    private final String stateCode;

    public Data(String str, int i10, long j10, int i11, String str2, String str3) {
        this.applNo = str;
        this.officeCode = i10;
        this.openDate = j10;
        this.purposeCode = i11;
        this.regnNo = str2;
        this.stateCode = str3;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, int i10, long j10, int i11, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = data.applNo;
        }
        if ((i12 & 2) != 0) {
            i10 = data.officeCode;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            j10 = data.openDate;
        }
        long j11 = j10;
        if ((i12 & 8) != 0) {
            i11 = data.purposeCode;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            str2 = data.regnNo;
        }
        String str4 = str2;
        if ((i12 & 32) != 0) {
            str3 = data.stateCode;
        }
        return data.copy(str, i13, j11, i14, str4, str3);
    }

    public final String component1() {
        return this.applNo;
    }

    public final int component2() {
        return this.officeCode;
    }

    public final long component3() {
        return this.openDate;
    }

    public final int component4() {
        return this.purposeCode;
    }

    public final String component5() {
        return this.regnNo;
    }

    public final String component6() {
        return this.stateCode;
    }

    public final Data copy(String str, int i10, long j10, int i11, String str2, String str3) {
        return new Data(str, i10, j10, i11, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.applNo, data.applNo) && this.officeCode == data.officeCode && this.openDate == data.openDate && this.purposeCode == data.purposeCode && l.a(this.regnNo, data.regnNo) && l.a(this.stateCode, data.stateCode);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final long getOpenDate() {
        return this.openDate;
    }

    public final int getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        String str = this.applNo;
        int i10 = 0;
        int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.officeCode)) * 31) + Long.hashCode(this.openDate)) * 31) + Integer.hashCode(this.purposeCode)) * 31;
        String str2 = this.regnNo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stateCode;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
