package com.nic.mparivahan.LLServices.SubmitServiceAssets;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class ChangeAddressLlReq {
    private String addressType;
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String dateOfBirth;
    private String learningLicence;
    private String llservicesRTO;
    private String mobileNumber;
    private String permCity;
    private String permDistrict;
    private String permHouseNo;
    private String permLocation;
    private String permPinCode;
    private String permState;
    private String permStreet;
    private String permSubDistrict;
    private String permVillageOrTown;
    private String phoneNumber;
    private String presCity;
    private String presDistrict;
    private String presHouseNo;
    private String presLocation;
    private String presPinCode;
    private String presState;
    private String presStreet;
    private String presSubDistrict;
    private String presVillageOrTown;
    private final ArrayList<String> selectedServices;
    private String stCd;
    private String transactionType;

    public ChangeAddressLlReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, ArrayList<String> arrayList) {
        String str31 = str;
        String str32 = str2;
        String str33 = str3;
        String str34 = str4;
        String str35 = str5;
        String str36 = str6;
        String str37 = str7;
        String str38 = str8;
        String str39 = str9;
        String str40 = str10;
        String str41 = str11;
        String str42 = str12;
        String str43 = str13;
        String str44 = str14;
        String str45 = str16;
        l.f(str31, "agentId");
        l.f(str32, "agentPwd");
        l.f(str33, "agentIpAddress");
        l.f(str34, "agentServiceName");
        l.f(str35, "learningLicence");
        l.f(str36, "dateOfBirth");
        l.f(str37, "stCd");
        l.f(str38, "llservicesRTO");
        l.f(str39, "addressType");
        l.f(str40, "presState");
        l.f(str41, "presDistrict");
        l.f(str42, "presSubDistrict");
        l.f(str43, "presCity");
        l.f(str44, "presVillageOrTown");
        l.f(str15, "presLocation");
        l.f(str16, "presHouseNo");
        l.f(str17, "presStreet");
        l.f(str18, "presPinCode");
        l.f(str19, "phoneNumber");
        l.f(str20, "permState");
        l.f(str21, "permDistrict");
        l.f(str22, "permSubDistrict");
        l.f(str23, "permCity");
        l.f(str24, "permVillageOrTown");
        l.f(str25, "permLocation");
        l.f(str26, "permHouseNo");
        l.f(str27, "permStreet");
        l.f(str28, "permPinCode");
        l.f(str29, "mobileNumber");
        l.f(str30, "transactionType");
        l.f(arrayList, "selectedServices");
        this.agentId = str31;
        this.agentPwd = str32;
        this.agentIpAddress = str33;
        this.agentServiceName = str34;
        this.learningLicence = str35;
        this.dateOfBirth = str36;
        this.stCd = str37;
        this.llservicesRTO = str38;
        this.addressType = str39;
        this.presState = str40;
        this.presDistrict = str41;
        this.presSubDistrict = str42;
        this.presCity = str43;
        this.presVillageOrTown = str44;
        this.presLocation = str15;
        this.presHouseNo = str16;
        this.presStreet = str17;
        this.presPinCode = str18;
        this.phoneNumber = str19;
        this.permState = str20;
        this.permDistrict = str21;
        this.permSubDistrict = str22;
        this.permCity = str23;
        this.permVillageOrTown = str24;
        this.permLocation = str25;
        this.permHouseNo = str26;
        this.permStreet = str27;
        this.permPinCode = str28;
        this.mobileNumber = str29;
        this.transactionType = str30;
        this.selectedServices = arrayList;
    }

    public static /* synthetic */ ChangeAddressLlReq copy$default(ChangeAddressLlReq changeAddressLlReq, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, ArrayList arrayList, int i10, Object obj) {
        ChangeAddressLlReq changeAddressLlReq2 = changeAddressLlReq;
        int i11 = i10;
        return changeAddressLlReq.copy((i11 & 1) != 0 ? changeAddressLlReq2.agentId : str, (i11 & 2) != 0 ? changeAddressLlReq2.agentPwd : str2, (i11 & 4) != 0 ? changeAddressLlReq2.agentIpAddress : str3, (i11 & 8) != 0 ? changeAddressLlReq2.agentServiceName : str4, (i11 & 16) != 0 ? changeAddressLlReq2.learningLicence : str5, (i11 & 32) != 0 ? changeAddressLlReq2.dateOfBirth : str6, (i11 & 64) != 0 ? changeAddressLlReq2.stCd : str7, (i11 & 128) != 0 ? changeAddressLlReq2.llservicesRTO : str8, (i11 & 256) != 0 ? changeAddressLlReq2.addressType : str9, (i11 & 512) != 0 ? changeAddressLlReq2.presState : str10, (i11 & 1024) != 0 ? changeAddressLlReq2.presDistrict : str11, (i11 & 2048) != 0 ? changeAddressLlReq2.presSubDistrict : str12, (i11 & 4096) != 0 ? changeAddressLlReq2.presCity : str13, (i11 & 8192) != 0 ? changeAddressLlReq2.presVillageOrTown : str14, (i11 & 16384) != 0 ? changeAddressLlReq2.presLocation : str15, (i11 & 32768) != 0 ? changeAddressLlReq2.presHouseNo : str16, (i11 & 65536) != 0 ? changeAddressLlReq2.presStreet : str17, (i11 & 131072) != 0 ? changeAddressLlReq2.presPinCode : str18, (i11 & 262144) != 0 ? changeAddressLlReq2.phoneNumber : str19, (i11 & 524288) != 0 ? changeAddressLlReq2.permState : str20, (i11 & 1048576) != 0 ? changeAddressLlReq2.permDistrict : str21, (i11 & 2097152) != 0 ? changeAddressLlReq2.permSubDistrict : str22, (i11 & 4194304) != 0 ? changeAddressLlReq2.permCity : str23, (i11 & 8388608) != 0 ? changeAddressLlReq2.permVillageOrTown : str24, (i11 & 16777216) != 0 ? changeAddressLlReq2.permLocation : str25, (i11 & 33554432) != 0 ? changeAddressLlReq2.permHouseNo : str26, (i11 & 67108864) != 0 ? changeAddressLlReq2.permStreet : str27, (i11 & 134217728) != 0 ? changeAddressLlReq2.permPinCode : str28, (i11 & 268435456) != 0 ? changeAddressLlReq2.mobileNumber : str29, (i11 & 536870912) != 0 ? changeAddressLlReq2.transactionType : str30, (i11 & 1073741824) != 0 ? changeAddressLlReq2.selectedServices : arrayList);
    }

    public final String component1() {
        return this.agentId;
    }

    public final String component10() {
        return this.presState;
    }

    public final String component11() {
        return this.presDistrict;
    }

    public final String component12() {
        return this.presSubDistrict;
    }

    public final String component13() {
        return this.presCity;
    }

    public final String component14() {
        return this.presVillageOrTown;
    }

    public final String component15() {
        return this.presLocation;
    }

    public final String component16() {
        return this.presHouseNo;
    }

    public final String component17() {
        return this.presStreet;
    }

    public final String component18() {
        return this.presPinCode;
    }

    public final String component19() {
        return this.phoneNumber;
    }

    public final String component2() {
        return this.agentPwd;
    }

    public final String component20() {
        return this.permState;
    }

    public final String component21() {
        return this.permDistrict;
    }

    public final String component22() {
        return this.permSubDistrict;
    }

    public final String component23() {
        return this.permCity;
    }

    public final String component24() {
        return this.permVillageOrTown;
    }

    public final String component25() {
        return this.permLocation;
    }

    public final String component26() {
        return this.permHouseNo;
    }

    public final String component27() {
        return this.permStreet;
    }

    public final String component28() {
        return this.permPinCode;
    }

    public final String component29() {
        return this.mobileNumber;
    }

    public final String component3() {
        return this.agentIpAddress;
    }

    public final String component30() {
        return this.transactionType;
    }

    public final ArrayList<String> component31() {
        return this.selectedServices;
    }

    public final String component4() {
        return this.agentServiceName;
    }

    public final String component5() {
        return this.learningLicence;
    }

    public final String component6() {
        return this.dateOfBirth;
    }

    public final String component7() {
        return this.stCd;
    }

    public final String component8() {
        return this.llservicesRTO;
    }

    public final String component9() {
        return this.addressType;
    }

    public final ChangeAddressLlReq copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, ArrayList<String> arrayList) {
        String str31 = str;
        l.f(str31, "agentId");
        l.f(str2, "agentPwd");
        l.f(str3, "agentIpAddress");
        l.f(str4, "agentServiceName");
        l.f(str5, "learningLicence");
        l.f(str6, "dateOfBirth");
        l.f(str7, "stCd");
        l.f(str8, "llservicesRTO");
        l.f(str9, "addressType");
        l.f(str10, "presState");
        l.f(str11, "presDistrict");
        l.f(str12, "presSubDistrict");
        l.f(str13, "presCity");
        l.f(str14, "presVillageOrTown");
        l.f(str15, "presLocation");
        l.f(str16, "presHouseNo");
        l.f(str17, "presStreet");
        l.f(str18, "presPinCode");
        l.f(str19, "phoneNumber");
        l.f(str20, "permState");
        l.f(str21, "permDistrict");
        l.f(str22, "permSubDistrict");
        l.f(str23, "permCity");
        l.f(str24, "permVillageOrTown");
        l.f(str25, "permLocation");
        l.f(str26, "permHouseNo");
        l.f(str27, "permStreet");
        l.f(str28, "permPinCode");
        l.f(str29, "mobileNumber");
        l.f(str30, "transactionType");
        l.f(arrayList, "selectedServices");
        return new ChangeAddressLlReq(str31, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeAddressLlReq)) {
            return false;
        }
        ChangeAddressLlReq changeAddressLlReq = (ChangeAddressLlReq) obj;
        return l.a(this.agentId, changeAddressLlReq.agentId) && l.a(this.agentPwd, changeAddressLlReq.agentPwd) && l.a(this.agentIpAddress, changeAddressLlReq.agentIpAddress) && l.a(this.agentServiceName, changeAddressLlReq.agentServiceName) && l.a(this.learningLicence, changeAddressLlReq.learningLicence) && l.a(this.dateOfBirth, changeAddressLlReq.dateOfBirth) && l.a(this.stCd, changeAddressLlReq.stCd) && l.a(this.llservicesRTO, changeAddressLlReq.llservicesRTO) && l.a(this.addressType, changeAddressLlReq.addressType) && l.a(this.presState, changeAddressLlReq.presState) && l.a(this.presDistrict, changeAddressLlReq.presDistrict) && l.a(this.presSubDistrict, changeAddressLlReq.presSubDistrict) && l.a(this.presCity, changeAddressLlReq.presCity) && l.a(this.presVillageOrTown, changeAddressLlReq.presVillageOrTown) && l.a(this.presLocation, changeAddressLlReq.presLocation) && l.a(this.presHouseNo, changeAddressLlReq.presHouseNo) && l.a(this.presStreet, changeAddressLlReq.presStreet) && l.a(this.presPinCode, changeAddressLlReq.presPinCode) && l.a(this.phoneNumber, changeAddressLlReq.phoneNumber) && l.a(this.permState, changeAddressLlReq.permState) && l.a(this.permDistrict, changeAddressLlReq.permDistrict) && l.a(this.permSubDistrict, changeAddressLlReq.permSubDistrict) && l.a(this.permCity, changeAddressLlReq.permCity) && l.a(this.permVillageOrTown, changeAddressLlReq.permVillageOrTown) && l.a(this.permLocation, changeAddressLlReq.permLocation) && l.a(this.permHouseNo, changeAddressLlReq.permHouseNo) && l.a(this.permStreet, changeAddressLlReq.permStreet) && l.a(this.permPinCode, changeAddressLlReq.permPinCode) && l.a(this.mobileNumber, changeAddressLlReq.mobileNumber) && l.a(this.transactionType, changeAddressLlReq.transactionType) && l.a(this.selectedServices, changeAddressLlReq.selectedServices);
    }

    public final String getAddressType() {
        return this.addressType;
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    public final String getAgentPwd() {
        return this.agentPwd;
    }

    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getLearningLicence() {
        return this.learningLicence;
    }

    public final String getLlservicesRTO() {
        return this.llservicesRTO;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getPermCity() {
        return this.permCity;
    }

    public final String getPermDistrict() {
        return this.permDistrict;
    }

    public final String getPermHouseNo() {
        return this.permHouseNo;
    }

    public final String getPermLocation() {
        return this.permLocation;
    }

    public final String getPermPinCode() {
        return this.permPinCode;
    }

    public final String getPermState() {
        return this.permState;
    }

    public final String getPermStreet() {
        return this.permStreet;
    }

    public final String getPermSubDistrict() {
        return this.permSubDistrict;
    }

    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getPresCity() {
        return this.presCity;
    }

    public final String getPresDistrict() {
        return this.presDistrict;
    }

    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    public final String getPresLocation() {
        return this.presLocation;
    }

    public final String getPresPinCode() {
        return this.presPinCode;
    }

    public final String getPresState() {
        return this.presState;
    }

    public final String getPresStreet() {
        return this.presStreet;
    }

    public final String getPresSubDistrict() {
        return this.presSubDistrict;
    }

    public final String getPresVillageOrTown() {
        return this.presVillageOrTown;
    }

    public final ArrayList<String> getSelectedServices() {
        return this.selectedServices;
    }

    public final String getStCd() {
        return this.stCd;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.agentId.hashCode() * 31) + this.agentPwd.hashCode()) * 31) + this.agentIpAddress.hashCode()) * 31) + this.agentServiceName.hashCode()) * 31) + this.learningLicence.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.stCd.hashCode()) * 31) + this.llservicesRTO.hashCode()) * 31) + this.addressType.hashCode()) * 31) + this.presState.hashCode()) * 31) + this.presDistrict.hashCode()) * 31) + this.presSubDistrict.hashCode()) * 31) + this.presCity.hashCode()) * 31) + this.presVillageOrTown.hashCode()) * 31) + this.presLocation.hashCode()) * 31) + this.presHouseNo.hashCode()) * 31) + this.presStreet.hashCode()) * 31) + this.presPinCode.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.permState.hashCode()) * 31) + this.permDistrict.hashCode()) * 31) + this.permSubDistrict.hashCode()) * 31) + this.permCity.hashCode()) * 31) + this.permVillageOrTown.hashCode()) * 31) + this.permLocation.hashCode()) * 31) + this.permHouseNo.hashCode()) * 31) + this.permStreet.hashCode()) * 31) + this.permPinCode.hashCode()) * 31) + this.mobileNumber.hashCode()) * 31) + this.transactionType.hashCode()) * 31) + this.selectedServices.hashCode();
    }

    public final void setAddressType(String str) {
        l.f(str, "<set-?>");
        this.addressType = str;
    }

    public final void setAgentId(String str) {
        l.f(str, "<set-?>");
        this.agentId = str;
    }

    public final void setAgentIpAddress(String str) {
        l.f(str, "<set-?>");
        this.agentIpAddress = str;
    }

    public final void setAgentPwd(String str) {
        l.f(str, "<set-?>");
        this.agentPwd = str;
    }

    public final void setAgentServiceName(String str) {
        l.f(str, "<set-?>");
        this.agentServiceName = str;
    }

    public final void setDateOfBirth(String str) {
        l.f(str, "<set-?>");
        this.dateOfBirth = str;
    }

    public final void setLearningLicence(String str) {
        l.f(str, "<set-?>");
        this.learningLicence = str;
    }

    public final void setLlservicesRTO(String str) {
        l.f(str, "<set-?>");
        this.llservicesRTO = str;
    }

    public final void setMobileNumber(String str) {
        l.f(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void setPermCity(String str) {
        l.f(str, "<set-?>");
        this.permCity = str;
    }

    public final void setPermDistrict(String str) {
        l.f(str, "<set-?>");
        this.permDistrict = str;
    }

    public final void setPermHouseNo(String str) {
        l.f(str, "<set-?>");
        this.permHouseNo = str;
    }

    public final void setPermLocation(String str) {
        l.f(str, "<set-?>");
        this.permLocation = str;
    }

    public final void setPermPinCode(String str) {
        l.f(str, "<set-?>");
        this.permPinCode = str;
    }

    public final void setPermState(String str) {
        l.f(str, "<set-?>");
        this.permState = str;
    }

    public final void setPermStreet(String str) {
        l.f(str, "<set-?>");
        this.permStreet = str;
    }

    public final void setPermSubDistrict(String str) {
        l.f(str, "<set-?>");
        this.permSubDistrict = str;
    }

    public final void setPermVillageOrTown(String str) {
        l.f(str, "<set-?>");
        this.permVillageOrTown = str;
    }

    public final void setPhoneNumber(String str) {
        l.f(str, "<set-?>");
        this.phoneNumber = str;
    }

    public final void setPresCity(String str) {
        l.f(str, "<set-?>");
        this.presCity = str;
    }

    public final void setPresDistrict(String str) {
        l.f(str, "<set-?>");
        this.presDistrict = str;
    }

    public final void setPresHouseNo(String str) {
        l.f(str, "<set-?>");
        this.presHouseNo = str;
    }

    public final void setPresLocation(String str) {
        l.f(str, "<set-?>");
        this.presLocation = str;
    }

    public final void setPresPinCode(String str) {
        l.f(str, "<set-?>");
        this.presPinCode = str;
    }

    public final void setPresState(String str) {
        l.f(str, "<set-?>");
        this.presState = str;
    }

    public final void setPresStreet(String str) {
        l.f(str, "<set-?>");
        this.presStreet = str;
    }

    public final void setPresSubDistrict(String str) {
        l.f(str, "<set-?>");
        this.presSubDistrict = str;
    }

    public final void setPresVillageOrTown(String str) {
        l.f(str, "<set-?>");
        this.presVillageOrTown = str;
    }

    public final void setStCd(String str) {
        l.f(str, "<set-?>");
        this.stCd = str;
    }

    public final void setTransactionType(String str) {
        l.f(str, "<set-?>");
        this.transactionType = str;
    }

    public String toString() {
        return "ChangeAddressLlReq(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", learningLicence=" + this.learningLicence + ", dateOfBirth=" + this.dateOfBirth + ", stCd=" + this.stCd + ", llservicesRTO=" + this.llservicesRTO + ", addressType=" + this.addressType + ", presState=" + this.presState + ", presDistrict=" + this.presDistrict + ", presSubDistrict=" + this.presSubDistrict + ", presCity=" + this.presCity + ", presVillageOrTown=" + this.presVillageOrTown + ", presLocation=" + this.presLocation + ", presHouseNo=" + this.presHouseNo + ", presStreet=" + this.presStreet + ", presPinCode=" + this.presPinCode + ", phoneNumber=" + this.phoneNumber + ", permState=" + this.permState + ", permDistrict=" + this.permDistrict + ", permSubDistrict=" + this.permSubDistrict + ", permCity=" + this.permCity + ", permVillageOrTown=" + this.permVillageOrTown + ", permLocation=" + this.permLocation + ", permHouseNo=" + this.permHouseNo + ", permStreet=" + this.permStreet + ", permPinCode=" + this.permPinCode + ", mobileNumber=" + this.mobileNumber + ", transactionType=" + this.transactionType + ", selectedServices=" + this.selectedServices + ')';
    }
}
