package com.nic.mparivahan.Checkpost.CheckPostModel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.l;

@Keep
public final class CheckPostReceiptDetailNewItem implements Parcelable {
    public static final Parcelable.Creator<CheckPostReceiptDetailNewItem> CREATOR = new a();
    private final String amount;
    private final String bankRefNo;
    private final String chassisNo;
    private final Integer ldWt;
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
    private final Integer taxMode;
    private final String taxModeName;
    private final String taxUpto;
    private final String vehicleClass;
    private final String vehicleClassName;
    private final String vehicleType;
    private final String vehicleTypeName;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final CheckPostReceiptDetailNewItem createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            l.f(parcel2, "parcel");
            Class<CheckPostReceiptDetailNewItem> cls = CheckPostReceiptDetailNewItem.class;
            return new CheckPostReceiptDetailNewItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel2.readValue(cls.getClassLoader()), parcel2.readValue(cls.getClassLoader()), parcel2.readValue(cls.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final CheckPostReceiptDetailNewItem[] newArray(int i10) {
            return new CheckPostReceiptDetailNewItem[i10];
        }
    }

    public CheckPostReceiptDetailNewItem(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Object obj, Object obj2, Object obj3, String str11, Integer num2, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.amount = str;
        this.bankRefNo = str2;
        this.chassisNo = str3;
        this.ldWt = num;
        this.ownerName = str4;
        this.paymentDate = str5;
        this.paymentMode = str6;
        this.paymentStatus = str7;
        this.rcptNo = str8;
        this.regnNo = str9;
        this.seatingCap = str10;
        this.serviceType = obj;
        this.serviceTypeName = obj2;
        this.stateCd = obj3;
        this.taxFrom = str11;
        this.taxMode = num2;
        this.taxModeName = str12;
        this.taxUpto = str13;
        this.vehicleClass = str14;
        this.vehicleClassName = str15;
        this.vehicleType = str16;
        this.vehicleTypeName = str17;
    }

    public static /* synthetic */ CheckPostReceiptDetailNewItem copy$default(CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Object obj, Object obj2, Object obj3, String str11, Integer num2, String str12, String str13, String str14, String str15, String str16, String str17, int i10, Object obj4) {
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem2 = checkPostReceiptDetailNewItem;
        int i11 = i10;
        return checkPostReceiptDetailNewItem.copy((i11 & 1) != 0 ? checkPostReceiptDetailNewItem2.amount : str, (i11 & 2) != 0 ? checkPostReceiptDetailNewItem2.bankRefNo : str2, (i11 & 4) != 0 ? checkPostReceiptDetailNewItem2.chassisNo : str3, (i11 & 8) != 0 ? checkPostReceiptDetailNewItem2.ldWt : num, (i11 & 16) != 0 ? checkPostReceiptDetailNewItem2.ownerName : str4, (i11 & 32) != 0 ? checkPostReceiptDetailNewItem2.paymentDate : str5, (i11 & 64) != 0 ? checkPostReceiptDetailNewItem2.paymentMode : str6, (i11 & 128) != 0 ? checkPostReceiptDetailNewItem2.paymentStatus : str7, (i11 & 256) != 0 ? checkPostReceiptDetailNewItem2.rcptNo : str8, (i11 & 512) != 0 ? checkPostReceiptDetailNewItem2.regnNo : str9, (i11 & 1024) != 0 ? checkPostReceiptDetailNewItem2.seatingCap : str10, (i11 & 2048) != 0 ? checkPostReceiptDetailNewItem2.serviceType : obj, (i11 & 4096) != 0 ? checkPostReceiptDetailNewItem2.serviceTypeName : obj2, (i11 & 8192) != 0 ? checkPostReceiptDetailNewItem2.stateCd : obj3, (i11 & 16384) != 0 ? checkPostReceiptDetailNewItem2.taxFrom : str11, (i11 & 32768) != 0 ? checkPostReceiptDetailNewItem2.taxMode : num2, (i11 & 65536) != 0 ? checkPostReceiptDetailNewItem2.taxModeName : str12, (i11 & 131072) != 0 ? checkPostReceiptDetailNewItem2.taxUpto : str13, (i11 & 262144) != 0 ? checkPostReceiptDetailNewItem2.vehicleClass : str14, (i11 & 524288) != 0 ? checkPostReceiptDetailNewItem2.vehicleClassName : str15, (i11 & 1048576) != 0 ? checkPostReceiptDetailNewItem2.vehicleType : str16, (i11 & 2097152) != 0 ? checkPostReceiptDetailNewItem2.vehicleTypeName : str17);
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

    public final Integer component16() {
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

    public final Integer component4() {
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

    public final CheckPostReceiptDetailNewItem copy(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Object obj, Object obj2, Object obj3, String str11, Integer num2, String str12, String str13, String str14, String str15, String str16, String str17) {
        return new CheckPostReceiptDetailNewItem(str, str2, str3, num, str4, str5, str6, str7, str8, str9, str10, obj, obj2, obj3, str11, num2, str12, str13, str14, str15, str16, str17);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckPostReceiptDetailNewItem)) {
            return false;
        }
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem = (CheckPostReceiptDetailNewItem) obj;
        return l.a(this.amount, checkPostReceiptDetailNewItem.amount) && l.a(this.bankRefNo, checkPostReceiptDetailNewItem.bankRefNo) && l.a(this.chassisNo, checkPostReceiptDetailNewItem.chassisNo) && l.a(this.ldWt, checkPostReceiptDetailNewItem.ldWt) && l.a(this.ownerName, checkPostReceiptDetailNewItem.ownerName) && l.a(this.paymentDate, checkPostReceiptDetailNewItem.paymentDate) && l.a(this.paymentMode, checkPostReceiptDetailNewItem.paymentMode) && l.a(this.paymentStatus, checkPostReceiptDetailNewItem.paymentStatus) && l.a(this.rcptNo, checkPostReceiptDetailNewItem.rcptNo) && l.a(this.regnNo, checkPostReceiptDetailNewItem.regnNo) && l.a(this.seatingCap, checkPostReceiptDetailNewItem.seatingCap) && l.a(this.serviceType, checkPostReceiptDetailNewItem.serviceType) && l.a(this.serviceTypeName, checkPostReceiptDetailNewItem.serviceTypeName) && l.a(this.stateCd, checkPostReceiptDetailNewItem.stateCd) && l.a(this.taxFrom, checkPostReceiptDetailNewItem.taxFrom) && l.a(this.taxMode, checkPostReceiptDetailNewItem.taxMode) && l.a(this.taxModeName, checkPostReceiptDetailNewItem.taxModeName) && l.a(this.taxUpto, checkPostReceiptDetailNewItem.taxUpto) && l.a(this.vehicleClass, checkPostReceiptDetailNewItem.vehicleClass) && l.a(this.vehicleClassName, checkPostReceiptDetailNewItem.vehicleClassName) && l.a(this.vehicleType, checkPostReceiptDetailNewItem.vehicleType) && l.a(this.vehicleTypeName, checkPostReceiptDetailNewItem.vehicleTypeName);
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

    public final Integer getLdWt() {
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

    public final Integer getTaxMode() {
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
        String str = this.amount;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bankRefNo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chassisNo;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.ldWt;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.ownerName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentDate;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.paymentMode;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.paymentStatus;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rcptNo;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.regnNo;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.seatingCap;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Object obj = this.serviceType;
        int hashCode12 = (hashCode11 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.serviceTypeName;
        int hashCode13 = (hashCode12 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.stateCd;
        int hashCode14 = (hashCode13 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str11 = this.taxFrom;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num2 = this.taxMode;
        int hashCode16 = (hashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str12 = this.taxModeName;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.taxUpto;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.vehicleClass;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.vehicleClassName;
        int hashCode20 = (hashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.vehicleType;
        int hashCode21 = (hashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.vehicleTypeName;
        if (str17 != null) {
            i10 = str17.hashCode();
        }
        return hashCode21 + i10;
    }

    public String toString() {
        return "CheckPostReceiptDetailNewItem(amount=" + this.amount + ", bankRefNo=" + this.bankRefNo + ", chassisNo=" + this.chassisNo + ", ldWt=" + this.ldWt + ", ownerName=" + this.ownerName + ", paymentDate=" + this.paymentDate + ", paymentMode=" + this.paymentMode + ", paymentStatus=" + this.paymentStatus + ", rcptNo=" + this.rcptNo + ", regnNo=" + this.regnNo + ", seatingCap=" + this.seatingCap + ", serviceType=" + this.serviceType + ", serviceTypeName=" + this.serviceTypeName + ", stateCd=" + this.stateCd + ", taxFrom=" + this.taxFrom + ", taxMode=" + this.taxMode + ", taxModeName=" + this.taxModeName + ", taxUpto=" + this.taxUpto + ", vehicleClass=" + this.vehicleClass + ", vehicleClassName=" + this.vehicleClassName + ", vehicleType=" + this.vehicleType + ", vehicleTypeName=" + this.vehicleTypeName + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.amount);
        parcel.writeString(this.bankRefNo);
        parcel.writeString(this.chassisNo);
        Integer num = this.ldWt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.ownerName);
        parcel.writeString(this.paymentDate);
        parcel.writeString(this.paymentMode);
        parcel.writeString(this.paymentStatus);
        parcel.writeString(this.rcptNo);
        parcel.writeString(this.regnNo);
        parcel.writeString(this.seatingCap);
        parcel.writeValue(this.serviceType);
        parcel.writeValue(this.serviceTypeName);
        parcel.writeValue(this.stateCd);
        parcel.writeString(this.taxFrom);
        Integer num2 = this.taxMode;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.taxModeName);
        parcel.writeString(this.taxUpto);
        parcel.writeString(this.vehicleClass);
        parcel.writeString(this.vehicleClassName);
        parcel.writeString(this.vehicleType);
        parcel.writeString(this.vehicleTypeName);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CheckPostReceiptDetailNewItem(java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.Integer r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.Object r38, java.lang.Object r39, java.lang.Object r40, java.lang.String r41, java.lang.Integer r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, int r49, cm.g r50) {
        /*
            r26 = this;
            r0 = r49
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r15 = r2
            goto L_0x000b
        L_0x0009:
            r15 = r38
        L_0x000b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0012
            r16 = r2
            goto L_0x0014
        L_0x0012:
            r16 = r39
        L_0x0014:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x001b
            r17 = r2
            goto L_0x001d
        L_0x001b:
            r17 = r40
        L_0x001d:
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r18 = r41
            r19 = r42
            r20 = r43
            r21 = r44
            r22 = r45
            r23 = r46
            r24 = r47
            r25 = r48
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNewItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
