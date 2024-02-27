package com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanServices.CompoundingFee.ComModle.Fees;
import java.util.ArrayList;

@Keep
public final class Data {
    private final String applNo;
    private final String feeCharge;
    private final ArrayList<Fees> feesList;
    private final String officeCode;
    private final String purposeCode;
    private final String regnNo;
    private final String stateCode;

    public Data(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<Fees> arrayList) {
        this.applNo = str;
        this.officeCode = str2;
        this.purposeCode = str3;
        this.regnNo = str4;
        this.stateCode = str5;
        this.feeCharge = str6;
        this.feesList = arrayList;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, String str5, String str6, ArrayList<Fees> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = data.applNo;
        }
        if ((i10 & 2) != 0) {
            str2 = data.officeCode;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = data.purposeCode;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = data.regnNo;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = data.stateCode;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = data.feeCharge;
        }
        String str11 = str6;
        if ((i10 & 64) != 0) {
            arrayList = data.feesList;
        }
        return data.copy(str, str7, str8, str9, str10, str11, arrayList);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component2() {
        return this.officeCode;
    }

    public final String component3() {
        return this.purposeCode;
    }

    public final String component4() {
        return this.regnNo;
    }

    public final String component5() {
        return this.stateCode;
    }

    public final String component6() {
        return this.feeCharge;
    }

    public final ArrayList<Fees> component7() {
        return this.feesList;
    }

    public final Data copy(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<Fees> arrayList) {
        return new Data(str, str2, str3, str4, str5, str6, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.applNo, data.applNo) && l.a(this.officeCode, data.officeCode) && l.a(this.purposeCode, data.purposeCode) && l.a(this.regnNo, data.regnNo) && l.a(this.stateCode, data.stateCode) && l.a(this.feeCharge, data.feeCharge) && l.a(this.feesList, data.feesList);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getFeeCharge() {
        return this.feeCharge;
    }

    public final ArrayList<Fees> getFeesList() {
        return this.feesList;
    }

    public final String getOfficeCode() {
        return this.officeCode;
    }

    public final String getPurposeCode() {
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
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.officeCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.purposeCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.regnNo;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stateCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.feeCharge;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ArrayList<Fees> arrayList = this.feesList;
        if (arrayList != null) {
            i10 = arrayList.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", officeCode=" + this.officeCode + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", feeCharge=" + this.feeCharge + ", feesList=" + this.feesList + ')';
    }
}
