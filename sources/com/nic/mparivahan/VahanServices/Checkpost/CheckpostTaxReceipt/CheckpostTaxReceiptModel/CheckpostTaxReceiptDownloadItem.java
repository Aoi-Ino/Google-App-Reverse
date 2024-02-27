package com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class CheckpostTaxReceiptDownloadItem {
    private final String amount;
    private final String bankRefNo;
    private final String chassisNo;
    private final int ldWt;
    private final String ownerName;
    private final String paymentDate;
    private final String paymentMode;
    private final String paymentStatus;
    private final String rcptNo;
    private final String regnNo;
    private final String seatingCap;
    private final Object serviceType;
    private final Object serviceTypeName;
    private final Object stateCd;
    private final String taxFrom;
    private final int taxMode;
    private final String taxModeName;
    private final String taxUpto;
    private final String vehicleClass;
    private final String vehicleClassName;
    private final String vehicleType;
    private final String vehicleTypeName;

    public CheckpostTaxReceiptDownloadItem(String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Object obj, Object obj2, Object obj3, String str11, int i11, String str12, String str13, String str14, String str15, String str16, String str17) {
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        String str23 = str6;
        String str24 = str7;
        String str25 = str8;
        String str26 = str9;
        String str27 = str10;
        Object obj4 = obj;
        Object obj5 = obj2;
        Object obj6 = obj3;
        String str28 = str11;
        String str29 = str13;
        l.f(str18, "amount");
        l.f(str19, "bankRefNo");
        l.f(str20, "chassisNo");
        l.f(str21, "ownerName");
        l.f(str22, "paymentDate");
        l.f(str23, "paymentMode");
        l.f(str24, "paymentStatus");
        l.f(str25, "rcptNo");
        l.f(str26, "regnNo");
        l.f(str27, "seatingCap");
        l.f(obj4, "serviceType");
        l.f(obj5, "serviceTypeName");
        l.f(obj6, "stateCd");
        l.f(str28, "taxFrom");
        l.f(str12, "taxModeName");
        l.f(str13, "taxUpto");
        l.f(str14, "vehicleClass");
        l.f(str15, "vehicleClassName");
        l.f(str16, "vehicleType");
        l.f(str17, "vehicleTypeName");
        this.amount = str18;
        this.bankRefNo = str19;
        this.chassisNo = str20;
        this.ldWt = i10;
        this.ownerName = str21;
        this.paymentDate = str22;
        this.paymentMode = str23;
        this.paymentStatus = str24;
        this.rcptNo = str25;
        this.regnNo = str26;
        this.seatingCap = str27;
        this.serviceType = obj4;
        this.serviceTypeName = obj5;
        this.stateCd = obj6;
        this.taxFrom = str28;
        this.taxMode = i11;
        this.taxModeName = str12;
        this.taxUpto = str13;
        this.vehicleClass = str14;
        this.vehicleClassName = str15;
        this.vehicleType = str16;
        this.vehicleTypeName = str17;
    }

    public static /* synthetic */ CheckpostTaxReceiptDownloadItem copy$default(CheckpostTaxReceiptDownloadItem checkpostTaxReceiptDownloadItem, String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Object obj, Object obj2, Object obj3, String str11, int i11, String str12, String str13, String str14, String str15, String str16, String str17, int i12, Object obj4) {
        CheckpostTaxReceiptDownloadItem checkpostTaxReceiptDownloadItem2 = checkpostTaxReceiptDownloadItem;
        int i13 = i12;
        return checkpostTaxReceiptDownloadItem.copy((i13 & 1) != 0 ? checkpostTaxReceiptDownloadItem2.amount : str, (i13 & 2) != 0 ? checkpostTaxReceiptDownloadItem2.bankRefNo : str2, (i13 & 4) != 0 ? checkpostTaxReceiptDownloadItem2.chassisNo : str3, (i13 & 8) != 0 ? checkpostTaxReceiptDownloadItem2.ldWt : i10, (i13 & 16) != 0 ? checkpostTaxReceiptDownloadItem2.ownerName : str4, (i13 & 32) != 0 ? checkpostTaxReceiptDownloadItem2.paymentDate : str5, (i13 & 64) != 0 ? checkpostTaxReceiptDownloadItem2.paymentMode : str6, (i13 & 128) != 0 ? checkpostTaxReceiptDownloadItem2.paymentStatus : str7, (i13 & 256) != 0 ? checkpostTaxReceiptDownloadItem2.rcptNo : str8, (i13 & 512) != 0 ? checkpostTaxReceiptDownloadItem2.regnNo : str9, (i13 & 1024) != 0 ? checkpostTaxReceiptDownloadItem2.seatingCap : str10, (i13 & 2048) != 0 ? checkpostTaxReceiptDownloadItem2.serviceType : obj, (i13 & 4096) != 0 ? checkpostTaxReceiptDownloadItem2.serviceTypeName : obj2, (i13 & 8192) != 0 ? checkpostTaxReceiptDownloadItem2.stateCd : obj3, (i13 & 16384) != 0 ? checkpostTaxReceiptDownloadItem2.taxFrom : str11, (i13 & 32768) != 0 ? checkpostTaxReceiptDownloadItem2.taxMode : i11, (i13 & 65536) != 0 ? checkpostTaxReceiptDownloadItem2.taxModeName : str12, (i13 & 131072) != 0 ? checkpostTaxReceiptDownloadItem2.taxUpto : str13, (i13 & 262144) != 0 ? checkpostTaxReceiptDownloadItem2.vehicleClass : str14, (i13 & 524288) != 0 ? checkpostTaxReceiptDownloadItem2.vehicleClassName : str15, (i13 & 1048576) != 0 ? checkpostTaxReceiptDownloadItem2.vehicleType : str16, (i13 & 2097152) != 0 ? checkpostTaxReceiptDownloadItem2.vehicleTypeName : str17);
    }

    public final String component1() {
        return this.amount;
    }

    public final String component10() {
        return this.regnNo;
    }

    public final String component11() {
        return this.seatingCap;
    }

    public final Object component12() {
        return this.serviceType;
    }

    public final Object component13() {
        return this.serviceTypeName;
    }

    public final Object component14() {
        return this.stateCd;
    }

    public final String component15() {
        return this.taxFrom;
    }

    public final int component16() {
        return this.taxMode;
    }

    public final String component17() {
        return this.taxModeName;
    }

    public final String component18() {
        return this.taxUpto;
    }

    public final String component19() {
        return this.vehicleClass;
    }

    public final String component2() {
        return this.bankRefNo;
    }

    public final String component20() {
        return this.vehicleClassName;
    }

    public final String component21() {
        return this.vehicleType;
    }

    public final String component22() {
        return this.vehicleTypeName;
    }

    public final String component3() {
        return this.chassisNo;
    }

    public final int component4() {
        return this.ldWt;
    }

    public final String component5() {
        return this.ownerName;
    }

    public final String component6() {
        return this.paymentDate;
    }

    public final String component7() {
        return this.paymentMode;
    }

    public final String component8() {
        return this.paymentStatus;
    }

    public final String component9() {
        return this.rcptNo;
    }

    public final CheckpostTaxReceiptDownloadItem copy(String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Object obj, Object obj2, Object obj3, String str11, int i11, String str12, String str13, String str14, String str15, String str16, String str17) {
        String str18 = str;
        l.f(str18, "amount");
        l.f(str2, "bankRefNo");
        l.f(str3, "chassisNo");
        l.f(str4, "ownerName");
        l.f(str5, "paymentDate");
        l.f(str6, "paymentMode");
        l.f(str7, "paymentStatus");
        l.f(str8, "rcptNo");
        l.f(str9, "regnNo");
        l.f(str10, "seatingCap");
        l.f(obj, "serviceType");
        l.f(obj2, "serviceTypeName");
        l.f(obj3, "stateCd");
        l.f(str11, "taxFrom");
        l.f(str12, "taxModeName");
        l.f(str13, "taxUpto");
        l.f(str14, "vehicleClass");
        l.f(str15, "vehicleClassName");
        l.f(str16, "vehicleType");
        l.f(str17, "vehicleTypeName");
        return new CheckpostTaxReceiptDownloadItem(str18, str2, str3, i10, str4, str5, str6, str7, str8, str9, str10, obj, obj2, obj3, str11, i11, str12, str13, str14, str15, str16, str17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckpostTaxReceiptDownloadItem)) {
            return false;
        }
        CheckpostTaxReceiptDownloadItem checkpostTaxReceiptDownloadItem = (CheckpostTaxReceiptDownloadItem) obj;
        return l.a(this.amount, checkpostTaxReceiptDownloadItem.amount) && l.a(this.bankRefNo, checkpostTaxReceiptDownloadItem.bankRefNo) && l.a(this.chassisNo, checkpostTaxReceiptDownloadItem.chassisNo) && this.ldWt == checkpostTaxReceiptDownloadItem.ldWt && l.a(this.ownerName, checkpostTaxReceiptDownloadItem.ownerName) && l.a(this.paymentDate, checkpostTaxReceiptDownloadItem.paymentDate) && l.a(this.paymentMode, checkpostTaxReceiptDownloadItem.paymentMode) && l.a(this.paymentStatus, checkpostTaxReceiptDownloadItem.paymentStatus) && l.a(this.rcptNo, checkpostTaxReceiptDownloadItem.rcptNo) && l.a(this.regnNo, checkpostTaxReceiptDownloadItem.regnNo) && l.a(this.seatingCap, checkpostTaxReceiptDownloadItem.seatingCap) && l.a(this.serviceType, checkpostTaxReceiptDownloadItem.serviceType) && l.a(this.serviceTypeName, checkpostTaxReceiptDownloadItem.serviceTypeName) && l.a(this.stateCd, checkpostTaxReceiptDownloadItem.stateCd) && l.a(this.taxFrom, checkpostTaxReceiptDownloadItem.taxFrom) && this.taxMode == checkpostTaxReceiptDownloadItem.taxMode && l.a(this.taxModeName, checkpostTaxReceiptDownloadItem.taxModeName) && l.a(this.taxUpto, checkpostTaxReceiptDownloadItem.taxUpto) && l.a(this.vehicleClass, checkpostTaxReceiptDownloadItem.vehicleClass) && l.a(this.vehicleClassName, checkpostTaxReceiptDownloadItem.vehicleClassName) && l.a(this.vehicleType, checkpostTaxReceiptDownloadItem.vehicleType) && l.a(this.vehicleTypeName, checkpostTaxReceiptDownloadItem.vehicleTypeName);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getBankRefNo() {
        return this.bankRefNo;
    }

    public final String getChassisNo() {
        return this.chassisNo;
    }

    public final int getLdWt() {
        return this.ldWt;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getPaymentDate() {
        return this.paymentDate;
    }

    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final String getPaymentStatus() {
        return this.paymentStatus;
    }

    public final String getRcptNo() {
        return this.rcptNo;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getSeatingCap() {
        return this.seatingCap;
    }

    public final Object getServiceType() {
        return this.serviceType;
    }

    public final Object getServiceTypeName() {
        return this.serviceTypeName;
    }

    public final Object getStateCd() {
        return this.stateCd;
    }

    public final String getTaxFrom() {
        return this.taxFrom;
    }

    public final int getTaxMode() {
        return this.taxMode;
    }

    public final String getTaxModeName() {
        return this.taxModeName;
    }

    public final String getTaxUpto() {
        return this.taxUpto;
    }

    public final String getVehicleClass() {
        return this.vehicleClass;
    }

    public final String getVehicleClassName() {
        return this.vehicleClassName;
    }

    public final String getVehicleType() {
        return this.vehicleType;
    }

    public final String getVehicleTypeName() {
        return this.vehicleTypeName;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((this.amount.hashCode() * 31) + this.bankRefNo.hashCode()) * 31) + this.chassisNo.hashCode()) * 31) + Integer.hashCode(this.ldWt)) * 31) + this.ownerName.hashCode()) * 31) + this.paymentDate.hashCode()) * 31) + this.paymentMode.hashCode()) * 31) + this.paymentStatus.hashCode()) * 31) + this.rcptNo.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.seatingCap.hashCode()) * 31) + this.serviceType.hashCode()) * 31) + this.serviceTypeName.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.taxFrom.hashCode()) * 31) + Integer.hashCode(this.taxMode)) * 31) + this.taxModeName.hashCode()) * 31) + this.taxUpto.hashCode()) * 31) + this.vehicleClass.hashCode()) * 31) + this.vehicleClassName.hashCode()) * 31) + this.vehicleType.hashCode()) * 31) + this.vehicleTypeName.hashCode();
    }

    public String toString() {
        return "CheckpostTaxReceiptDownloadItem(amount=" + this.amount + ", bankRefNo=" + this.bankRefNo + ", chassisNo=" + this.chassisNo + ", ldWt=" + this.ldWt + ", ownerName=" + this.ownerName + ", paymentDate=" + this.paymentDate + ", paymentMode=" + this.paymentMode + ", paymentStatus=" + this.paymentStatus + ", rcptNo=" + this.rcptNo + ", regnNo=" + this.regnNo + ", seatingCap=" + this.seatingCap + ", serviceType=" + this.serviceType + ", serviceTypeName=" + this.serviceTypeName + ", stateCd=" + this.stateCd + ", taxFrom=" + this.taxFrom + ", taxMode=" + this.taxMode + ", taxModeName=" + this.taxModeName + ", taxUpto=" + this.taxUpto + ", vehicleClass=" + this.vehicleClass + ", vehicleClassName=" + this.vehicleClassName + ", vehicleType=" + this.vehicleType + ", vehicleTypeName=" + this.vehicleTypeName + ')';
    }
}
