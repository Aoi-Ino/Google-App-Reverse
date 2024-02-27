package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class PendingTransRegNoDataModel {
    private final String chassisNo;
    private final String offCD;
    private final String purCD;
    private final String regnNo;
    private final String stateCD;
    private final String transactionAMT;
    private final String transactionDate;
    private final String transactionDesc;
    private final String transactionID;

    public PendingTransRegNoDataModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        l.f(str, "offCD");
        l.f(str2, "transactionID");
        l.f(str3, "transactionDesc");
        l.f(str4, "regnNo");
        l.f(str5, "stateCD");
        l.f(str6, "purCD");
        l.f(str7, "transactionAMT");
        l.f(str8, "transactionDate");
        this.offCD = str;
        this.transactionID = str2;
        this.transactionDesc = str3;
        this.regnNo = str4;
        this.stateCD = str5;
        this.purCD = str6;
        this.transactionAMT = str7;
        this.transactionDate = str8;
        this.chassisNo = str9;
    }

    public static /* synthetic */ PendingTransRegNoDataModel copy$default(PendingTransRegNoDataModel pendingTransRegNoDataModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, Object obj) {
        PendingTransRegNoDataModel pendingTransRegNoDataModel2 = pendingTransRegNoDataModel;
        int i11 = i10;
        return pendingTransRegNoDataModel.copy((i11 & 1) != 0 ? pendingTransRegNoDataModel2.offCD : str, (i11 & 2) != 0 ? pendingTransRegNoDataModel2.transactionID : str2, (i11 & 4) != 0 ? pendingTransRegNoDataModel2.transactionDesc : str3, (i11 & 8) != 0 ? pendingTransRegNoDataModel2.regnNo : str4, (i11 & 16) != 0 ? pendingTransRegNoDataModel2.stateCD : str5, (i11 & 32) != 0 ? pendingTransRegNoDataModel2.purCD : str6, (i11 & 64) != 0 ? pendingTransRegNoDataModel2.transactionAMT : str7, (i11 & 128) != 0 ? pendingTransRegNoDataModel2.transactionDate : str8, (i11 & 256) != 0 ? pendingTransRegNoDataModel2.chassisNo : str9);
    }

    public final String component1() {
        return this.offCD;
    }

    public final String component2() {
        return this.transactionID;
    }

    public final String component3() {
        return this.transactionDesc;
    }

    public final String component4() {
        return this.regnNo;
    }

    public final String component5() {
        return this.stateCD;
    }

    public final String component6() {
        return this.purCD;
    }

    public final String component7() {
        return this.transactionAMT;
    }

    public final String component8() {
        return this.transactionDate;
    }

    public final String component9() {
        return this.chassisNo;
    }

    public final PendingTransRegNoDataModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        l.f(str, "offCD");
        l.f(str2, "transactionID");
        l.f(str3, "transactionDesc");
        l.f(str4, "regnNo");
        String str10 = str5;
        l.f(str10, "stateCD");
        String str11 = str6;
        l.f(str11, "purCD");
        String str12 = str7;
        l.f(str12, "transactionAMT");
        String str13 = str8;
        l.f(str13, "transactionDate");
        return new PendingTransRegNoDataModel(str, str2, str3, str4, str10, str11, str12, str13, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingTransRegNoDataModel)) {
            return false;
        }
        PendingTransRegNoDataModel pendingTransRegNoDataModel = (PendingTransRegNoDataModel) obj;
        return l.a(this.offCD, pendingTransRegNoDataModel.offCD) && l.a(this.transactionID, pendingTransRegNoDataModel.transactionID) && l.a(this.transactionDesc, pendingTransRegNoDataModel.transactionDesc) && l.a(this.regnNo, pendingTransRegNoDataModel.regnNo) && l.a(this.stateCD, pendingTransRegNoDataModel.stateCD) && l.a(this.purCD, pendingTransRegNoDataModel.purCD) && l.a(this.transactionAMT, pendingTransRegNoDataModel.transactionAMT) && l.a(this.transactionDate, pendingTransRegNoDataModel.transactionDate) && l.a(this.chassisNo, pendingTransRegNoDataModel.chassisNo);
    }

    public final String getChassisNo() {
        return this.chassisNo;
    }

    public final String getOffCD() {
        return this.offCD;
    }

    public final String getPurCD() {
        return this.purCD;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCD() {
        return this.stateCD;
    }

    public final String getTransactionAMT() {
        return this.transactionAMT;
    }

    public final String getTransactionDate() {
        return this.transactionDate;
    }

    public final String getTransactionDesc() {
        return this.transactionDesc;
    }

    public final String getTransactionID() {
        return this.transactionID;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.offCD.hashCode() * 31) + this.transactionID.hashCode()) * 31) + this.transactionDesc.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.stateCD.hashCode()) * 31) + this.purCD.hashCode()) * 31) + this.transactionAMT.hashCode()) * 31) + this.transactionDate.hashCode()) * 31;
        String str = this.chassisNo;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PendingTransRegNoDataModel(offCD=" + this.offCD + ", transactionID=" + this.transactionID + ", transactionDesc=" + this.transactionDesc + ", regnNo=" + this.regnNo + ", stateCD=" + this.stateCD + ", purCD=" + this.purCD + ", transactionAMT=" + this.transactionAMT + ", transactionDate=" + this.transactionDate + ", chassisNo=" + this.chassisNo + ')';
    }
}
