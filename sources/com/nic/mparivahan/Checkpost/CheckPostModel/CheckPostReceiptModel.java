package com.nic.mparivahan.Checkpost.CheckPostModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class CheckPostReceiptModel implements Serializable {
    private final Integer amount;
    private final String chassisNo;
    private final String checkpostName;
    private final String checkpostNameCd;
    private final String districtCd;
    private final String districtCode;
    private final String fitnessValidity;
    private final String fromDate;
    private final String greenTaxUpto;
    private final String insValidity;
    private final String mobileNo;
    private final String ownerName;
    private final Object permitCategory;
    private final Integer permitCategoryCd;
    private final String permitNo;
    private final String permitType;
    private final Integer permitTypeCd;
    private final String permitUpto;
    private final String puccValidity;
    private final String rcptDate;
    private final String rcptNo;
    private final String regnNo;
    private final Integer seatingCap;
    private final Object serviceType;
    private final Object serviceTypeCd;
    private final Integer sleeperCap;
    private final String stateCd;
    private final String stateCode;
    private final String taxMode;
    private final Integer taxModeCd;
    private final String uptoDate;
    private final String userId;
    private final String userName;
    private final Integer vchUlWt;
    private final Integer vchWt;
    private final String vehicleCatg;
    private final String vehicleClass;
    private final Integer vehicleClassCd;
    private final String vehicleType;
    private final Integer vehicleTypeCd;
    private final List<VpAccount> vpAccount;
    private final VpDetails vpDetails;

    public CheckPostReceiptModel(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Object obj, Integer num2, String str12, String str13, Integer num3, String str14, String str15, String str16, String str17, String str18, Integer num4, Object obj2, Object obj3, Integer num5, String str19, String str20, String str21, Integer num6, String str22, String str23, String str24, Integer num7, Integer num8, String str25, String str26, Integer num9, String str27, Integer num10, List<VpAccount> list, VpDetails vpDetails2) {
        this.amount = num;
        this.chassisNo = str;
        this.checkpostName = str2;
        this.checkpostNameCd = str3;
        this.districtCd = str4;
        this.districtCode = str5;
        this.fitnessValidity = str6;
        this.fromDate = str7;
        this.greenTaxUpto = str8;
        this.insValidity = str9;
        this.mobileNo = str10;
        this.ownerName = str11;
        this.permitCategory = obj;
        this.permitCategoryCd = num2;
        this.permitNo = str12;
        this.permitType = str13;
        this.permitTypeCd = num3;
        this.permitUpto = str14;
        this.puccValidity = str15;
        this.rcptDate = str16;
        this.rcptNo = str17;
        this.regnNo = str18;
        this.seatingCap = num4;
        this.serviceType = obj2;
        this.serviceTypeCd = obj3;
        this.sleeperCap = num5;
        this.stateCd = str19;
        this.stateCode = str20;
        this.taxMode = str21;
        this.taxModeCd = num6;
        this.uptoDate = str22;
        this.userId = str23;
        this.userName = str24;
        this.vchUlWt = num7;
        this.vchWt = num8;
        this.vehicleCatg = str25;
        this.vehicleClass = str26;
        this.vehicleClassCd = num9;
        this.vehicleType = str27;
        this.vehicleTypeCd = num10;
        this.vpAccount = list;
        this.vpDetails = vpDetails2;
    }

    public static /* synthetic */ CheckPostReceiptModel copy$default(CheckPostReceiptModel checkPostReceiptModel, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Object obj, Integer num2, String str12, String str13, Integer num3, String str14, String str15, String str16, String str17, String str18, Integer num4, Object obj2, Object obj3, Integer num5, String str19, String str20, String str21, Integer num6, String str22, String str23, String str24, Integer num7, Integer num8, String str25, String str26, Integer num9, String str27, Integer num10, List list, VpDetails vpDetails2, int i10, int i11, Object obj4) {
        CheckPostReceiptModel checkPostReceiptModel2 = checkPostReceiptModel;
        int i12 = i10;
        int i13 = i11;
        return checkPostReceiptModel.copy((i12 & 1) != 0 ? checkPostReceiptModel2.amount : num, (i12 & 2) != 0 ? checkPostReceiptModel2.chassisNo : str, (i12 & 4) != 0 ? checkPostReceiptModel2.checkpostName : str2, (i12 & 8) != 0 ? checkPostReceiptModel2.checkpostNameCd : str3, (i12 & 16) != 0 ? checkPostReceiptModel2.districtCd : str4, (i12 & 32) != 0 ? checkPostReceiptModel2.districtCode : str5, (i12 & 64) != 0 ? checkPostReceiptModel2.fitnessValidity : str6, (i12 & 128) != 0 ? checkPostReceiptModel2.fromDate : str7, (i12 & 256) != 0 ? checkPostReceiptModel2.greenTaxUpto : str8, (i12 & 512) != 0 ? checkPostReceiptModel2.insValidity : str9, (i12 & 1024) != 0 ? checkPostReceiptModel2.mobileNo : str10, (i12 & 2048) != 0 ? checkPostReceiptModel2.ownerName : str11, (i12 & 4096) != 0 ? checkPostReceiptModel2.permitCategory : obj, (i12 & 8192) != 0 ? checkPostReceiptModel2.permitCategoryCd : num2, (i12 & 16384) != 0 ? checkPostReceiptModel2.permitNo : str12, (i12 & 32768) != 0 ? checkPostReceiptModel2.permitType : str13, (i12 & 65536) != 0 ? checkPostReceiptModel2.permitTypeCd : num3, (i12 & 131072) != 0 ? checkPostReceiptModel2.permitUpto : str14, (i12 & 262144) != 0 ? checkPostReceiptModel2.puccValidity : str15, (i12 & 524288) != 0 ? checkPostReceiptModel2.rcptDate : str16, (i12 & 1048576) != 0 ? checkPostReceiptModel2.rcptNo : str17, (i12 & 2097152) != 0 ? checkPostReceiptModel2.regnNo : str18, (i12 & 4194304) != 0 ? checkPostReceiptModel2.seatingCap : num4, (i12 & 8388608) != 0 ? checkPostReceiptModel2.serviceType : obj2, (i12 & 16777216) != 0 ? checkPostReceiptModel2.serviceTypeCd : obj3, (i12 & 33554432) != 0 ? checkPostReceiptModel2.sleeperCap : num5, (i12 & 67108864) != 0 ? checkPostReceiptModel2.stateCd : str19, (i12 & 134217728) != 0 ? checkPostReceiptModel2.stateCode : str20, (i12 & 268435456) != 0 ? checkPostReceiptModel2.taxMode : str21, (i12 & 536870912) != 0 ? checkPostReceiptModel2.taxModeCd : num6, (i12 & 1073741824) != 0 ? checkPostReceiptModel2.uptoDate : str22, (i12 & Integer.MIN_VALUE) != 0 ? checkPostReceiptModel2.userId : str23, (i13 & 1) != 0 ? checkPostReceiptModel2.userName : str24, (i13 & 2) != 0 ? checkPostReceiptModel2.vchUlWt : num7, (i13 & 4) != 0 ? checkPostReceiptModel2.vchWt : num8, (i13 & 8) != 0 ? checkPostReceiptModel2.vehicleCatg : str25, (i13 & 16) != 0 ? checkPostReceiptModel2.vehicleClass : str26, (i13 & 32) != 0 ? checkPostReceiptModel2.vehicleClassCd : num9, (i13 & 64) != 0 ? checkPostReceiptModel2.vehicleType : str27, (i13 & 128) != 0 ? checkPostReceiptModel2.vehicleTypeCd : num10, (i13 & 256) != 0 ? checkPostReceiptModel2.vpAccount : list, (i13 & 512) != 0 ? checkPostReceiptModel2.vpDetails : vpDetails2);
    }

    public final Integer component1() {
        return this.amount;
    }

    public final String component10() {
        return this.insValidity;
    }

    public final String component11() {
        return this.mobileNo;
    }

    public final String component12() {
        return this.ownerName;
    }

    public final Object component13() {
        return this.permitCategory;
    }

    public final Integer component14() {
        return this.permitCategoryCd;
    }

    public final String component15() {
        return this.permitNo;
    }

    public final String component16() {
        return this.permitType;
    }

    public final Integer component17() {
        return this.permitTypeCd;
    }

    public final String component18() {
        return this.permitUpto;
    }

    public final String component19() {
        return this.puccValidity;
    }

    public final String component2() {
        return this.chassisNo;
    }

    public final String component20() {
        return this.rcptDate;
    }

    public final String component21() {
        return this.rcptNo;
    }

    public final String component22() {
        return this.regnNo;
    }

    public final Integer component23() {
        return this.seatingCap;
    }

    public final Object component24() {
        return this.serviceType;
    }

    public final Object component25() {
        return this.serviceTypeCd;
    }

    public final Integer component26() {
        return this.sleeperCap;
    }

    public final String component27() {
        return this.stateCd;
    }

    public final String component28() {
        return this.stateCode;
    }

    public final String component29() {
        return this.taxMode;
    }

    public final String component3() {
        return this.checkpostName;
    }

    public final Integer component30() {
        return this.taxModeCd;
    }

    public final String component31() {
        return this.uptoDate;
    }

    public final String component32() {
        return this.userId;
    }

    public final String component33() {
        return this.userName;
    }

    public final Integer component34() {
        return this.vchUlWt;
    }

    public final Integer component35() {
        return this.vchWt;
    }

    public final String component36() {
        return this.vehicleCatg;
    }

    public final String component37() {
        return this.vehicleClass;
    }

    public final Integer component38() {
        return this.vehicleClassCd;
    }

    public final String component39() {
        return this.vehicleType;
    }

    public final String component4() {
        return this.checkpostNameCd;
    }

    public final Integer component40() {
        return this.vehicleTypeCd;
    }

    public final List<VpAccount> component41() {
        return this.vpAccount;
    }

    public final VpDetails component42() {
        return this.vpDetails;
    }

    public final String component5() {
        return this.districtCd;
    }

    public final String component6() {
        return this.districtCode;
    }

    public final String component7() {
        return this.fitnessValidity;
    }

    public final String component8() {
        return this.fromDate;
    }

    public final String component9() {
        return this.greenTaxUpto;
    }

    public final CheckPostReceiptModel copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Object obj, Integer num2, String str12, String str13, Integer num3, String str14, String str15, String str16, String str17, String str18, Integer num4, Object obj2, Object obj3, Integer num5, String str19, String str20, String str21, Integer num6, String str22, String str23, String str24, Integer num7, Integer num8, String str25, String str26, Integer num9, String str27, Integer num10, List<VpAccount> list, VpDetails vpDetails2) {
        return new CheckPostReceiptModel(num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, obj, num2, str12, str13, num3, str14, str15, str16, str17, str18, num4, obj2, obj3, num5, str19, str20, str21, num6, str22, str23, str24, num7, num8, str25, str26, num9, str27, num10, list, vpDetails2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckPostReceiptModel)) {
            return false;
        }
        CheckPostReceiptModel checkPostReceiptModel = (CheckPostReceiptModel) obj;
        return l.a(this.amount, checkPostReceiptModel.amount) && l.a(this.chassisNo, checkPostReceiptModel.chassisNo) && l.a(this.checkpostName, checkPostReceiptModel.checkpostName) && l.a(this.checkpostNameCd, checkPostReceiptModel.checkpostNameCd) && l.a(this.districtCd, checkPostReceiptModel.districtCd) && l.a(this.districtCode, checkPostReceiptModel.districtCode) && l.a(this.fitnessValidity, checkPostReceiptModel.fitnessValidity) && l.a(this.fromDate, checkPostReceiptModel.fromDate) && l.a(this.greenTaxUpto, checkPostReceiptModel.greenTaxUpto) && l.a(this.insValidity, checkPostReceiptModel.insValidity) && l.a(this.mobileNo, checkPostReceiptModel.mobileNo) && l.a(this.ownerName, checkPostReceiptModel.ownerName) && l.a(this.permitCategory, checkPostReceiptModel.permitCategory) && l.a(this.permitCategoryCd, checkPostReceiptModel.permitCategoryCd) && l.a(this.permitNo, checkPostReceiptModel.permitNo) && l.a(this.permitType, checkPostReceiptModel.permitType) && l.a(this.permitTypeCd, checkPostReceiptModel.permitTypeCd) && l.a(this.permitUpto, checkPostReceiptModel.permitUpto) && l.a(this.puccValidity, checkPostReceiptModel.puccValidity) && l.a(this.rcptDate, checkPostReceiptModel.rcptDate) && l.a(this.rcptNo, checkPostReceiptModel.rcptNo) && l.a(this.regnNo, checkPostReceiptModel.regnNo) && l.a(this.seatingCap, checkPostReceiptModel.seatingCap) && l.a(this.serviceType, checkPostReceiptModel.serviceType) && l.a(this.serviceTypeCd, checkPostReceiptModel.serviceTypeCd) && l.a(this.sleeperCap, checkPostReceiptModel.sleeperCap) && l.a(this.stateCd, checkPostReceiptModel.stateCd) && l.a(this.stateCode, checkPostReceiptModel.stateCode) && l.a(this.taxMode, checkPostReceiptModel.taxMode) && l.a(this.taxModeCd, checkPostReceiptModel.taxModeCd) && l.a(this.uptoDate, checkPostReceiptModel.uptoDate) && l.a(this.userId, checkPostReceiptModel.userId) && l.a(this.userName, checkPostReceiptModel.userName) && l.a(this.vchUlWt, checkPostReceiptModel.vchUlWt) && l.a(this.vchWt, checkPostReceiptModel.vchWt) && l.a(this.vehicleCatg, checkPostReceiptModel.vehicleCatg) && l.a(this.vehicleClass, checkPostReceiptModel.vehicleClass) && l.a(this.vehicleClassCd, checkPostReceiptModel.vehicleClassCd) && l.a(this.vehicleType, checkPostReceiptModel.vehicleType) && l.a(this.vehicleTypeCd, checkPostReceiptModel.vehicleTypeCd) && l.a(this.vpAccount, checkPostReceiptModel.vpAccount) && l.a(this.vpDetails, checkPostReceiptModel.vpDetails);
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final String getChassisNo() {
        return this.chassisNo;
    }

    public final String getCheckpostName() {
        return this.checkpostName;
    }

    public final String getCheckpostNameCd() {
        return this.checkpostNameCd;
    }

    public final String getDistrictCd() {
        return this.districtCd;
    }

    public final String getDistrictCode() {
        return this.districtCode;
    }

    public final String getFitnessValidity() {
        return this.fitnessValidity;
    }

    public final String getFromDate() {
        return this.fromDate;
    }

    public final String getGreenTaxUpto() {
        return this.greenTaxUpto;
    }

    public final String getInsValidity() {
        return this.insValidity;
    }

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final Object getPermitCategory() {
        return this.permitCategory;
    }

    public final Integer getPermitCategoryCd() {
        return this.permitCategoryCd;
    }

    public final String getPermitNo() {
        return this.permitNo;
    }

    public final String getPermitType() {
        return this.permitType;
    }

    public final Integer getPermitTypeCd() {
        return this.permitTypeCd;
    }

    public final String getPermitUpto() {
        return this.permitUpto;
    }

    public final String getPuccValidity() {
        return this.puccValidity;
    }

    public final String getRcptDate() {
        return this.rcptDate;
    }

    public final String getRcptNo() {
        return this.rcptNo;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final Integer getSeatingCap() {
        return this.seatingCap;
    }

    public final Object getServiceType() {
        return this.serviceType;
    }

    public final Object getServiceTypeCd() {
        return this.serviceTypeCd;
    }

    public final Integer getSleeperCap() {
        return this.sleeperCap;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getTaxMode() {
        return this.taxMode;
    }

    public final Integer getTaxModeCd() {
        return this.taxModeCd;
    }

    public final String getUptoDate() {
        return this.uptoDate;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final Integer getVchUlWt() {
        return this.vchUlWt;
    }

    public final Integer getVchWt() {
        return this.vchWt;
    }

    public final String getVehicleCatg() {
        return this.vehicleCatg;
    }

    public final String getVehicleClass() {
        return this.vehicleClass;
    }

    public final Integer getVehicleClassCd() {
        return this.vehicleClassCd;
    }

    public final String getVehicleType() {
        return this.vehicleType;
    }

    public final Integer getVehicleTypeCd() {
        return this.vehicleTypeCd;
    }

    public final List<VpAccount> getVpAccount() {
        return this.vpAccount;
    }

    public final VpDetails getVpDetails() {
        return this.vpDetails;
    }

    public int hashCode() {
        Integer num = this.amount;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.chassisNo;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.checkpostName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.checkpostNameCd;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.districtCd;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.districtCode;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fitnessValidity;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fromDate;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.greenTaxUpto;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.insValidity;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.mobileNo;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.ownerName;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Object obj = this.permitCategory;
        int hashCode13 = (hashCode12 + (obj == null ? 0 : obj.hashCode())) * 31;
        Integer num2 = this.permitCategoryCd;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str12 = this.permitNo;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.permitType;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num3 = this.permitTypeCd;
        int hashCode17 = (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str14 = this.permitUpto;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.puccValidity;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.rcptDate;
        int hashCode20 = (hashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.rcptNo;
        int hashCode21 = (hashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.regnNo;
        int hashCode22 = (hashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Integer num4 = this.seatingCap;
        int hashCode23 = (hashCode22 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Object obj2 = this.serviceType;
        int hashCode24 = (hashCode23 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.serviceTypeCd;
        int hashCode25 = (hashCode24 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Integer num5 = this.sleeperCap;
        int hashCode26 = (hashCode25 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str19 = this.stateCd;
        int hashCode27 = (hashCode26 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.stateCode;
        int hashCode28 = (hashCode27 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.taxMode;
        int hashCode29 = (hashCode28 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Integer num6 = this.taxModeCd;
        int hashCode30 = (hashCode29 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str22 = this.uptoDate;
        int hashCode31 = (hashCode30 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.userId;
        int hashCode32 = (hashCode31 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.userName;
        int hashCode33 = (hashCode32 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Integer num7 = this.vchUlWt;
        int hashCode34 = (hashCode33 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.vchWt;
        int hashCode35 = (hashCode34 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str25 = this.vehicleCatg;
        int hashCode36 = (hashCode35 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.vehicleClass;
        int hashCode37 = (hashCode36 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Integer num9 = this.vehicleClassCd;
        int hashCode38 = (hashCode37 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str27 = this.vehicleType;
        int hashCode39 = (hashCode38 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Integer num10 = this.vehicleTypeCd;
        int hashCode40 = (hashCode39 + (num10 == null ? 0 : num10.hashCode())) * 31;
        List<VpAccount> list = this.vpAccount;
        int hashCode41 = (hashCode40 + (list == null ? 0 : list.hashCode())) * 31;
        VpDetails vpDetails2 = this.vpDetails;
        if (vpDetails2 != null) {
            i10 = vpDetails2.hashCode();
        }
        return hashCode41 + i10;
    }

    public String toString() {
        return "CheckPostReceiptModel(amount=" + this.amount + ", chassisNo=" + this.chassisNo + ", checkpostName=" + this.checkpostName + ", checkpostNameCd=" + this.checkpostNameCd + ", districtCd=" + this.districtCd + ", districtCode=" + this.districtCode + ", fitnessValidity=" + this.fitnessValidity + ", fromDate=" + this.fromDate + ", greenTaxUpto=" + this.greenTaxUpto + ", insValidity=" + this.insValidity + ", mobileNo=" + this.mobileNo + ", ownerName=" + this.ownerName + ", permitCategory=" + this.permitCategory + ", permitCategoryCd=" + this.permitCategoryCd + ", permitNo=" + this.permitNo + ", permitType=" + this.permitType + ", permitTypeCd=" + this.permitTypeCd + ", permitUpto=" + this.permitUpto + ", puccValidity=" + this.puccValidity + ", rcptDate=" + this.rcptDate + ", rcptNo=" + this.rcptNo + ", regnNo=" + this.regnNo + ", seatingCap=" + this.seatingCap + ", serviceType=" + this.serviceType + ", serviceTypeCd=" + this.serviceTypeCd + ", sleeperCap=" + this.sleeperCap + ", stateCd=" + this.stateCd + ", stateCode=" + this.stateCode + ", taxMode=" + this.taxMode + ", taxModeCd=" + this.taxModeCd + ", uptoDate=" + this.uptoDate + ", userId=" + this.userId + ", userName=" + this.userName + ", vchUlWt=" + this.vchUlWt + ", vchWt=" + this.vchWt + ", vehicleCatg=" + this.vehicleCatg + ", vehicleClass=" + this.vehicleClass + ", vehicleClassCd=" + this.vehicleClassCd + ", vehicleType=" + this.vehicleType + ", vehicleTypeCd=" + this.vehicleTypeCd + ", vpAccount=" + this.vpAccount + ", vpDetails=" + this.vpDetails + ')';
    }
}
