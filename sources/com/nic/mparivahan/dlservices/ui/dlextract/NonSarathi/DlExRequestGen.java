package com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import mj.a;

@Keep
public final class DlExRequestGen {
    @c("agentId")
    private String agentId;
    @c("agentIpAddress")
    private String agentIpAddress;
    @c("agentPwd")
    private String agentPwd;
    @c("agentServiceName")
    private String agentServiceName;
    @c("dlHolderAltMobMum")
    private String dlHolderAltMobMum;
    @c("dlno")
    private String dlno;
    @c("dob")
    private String dob;
    @c("dleDlReasonCode")
    private Integer dupDlReasonCode;
    @c("dleDlReasonName")
    private String dupDlReasonName;
    @c("eKYCGender")
    private String eKYCGender;
    @c("eKYCId")
    private String eKYCId;
    @c("eKYCOpted")
    private String eKYCOpted;
    @c("eKYCapplicantPhoto")
    private String eKYCapplicantPhoto;
    @c("mobileNumber")
    private String mobileNumber;
    @c("perDistrict")
    private String perDistrict;
    @c("perHouseNo")
    private String perHouseNo;
    @c("perLocation")
    private String perLocation;
    @c("perPinCode")
    private String perPinCode;
    @c("perState")
    private String perState;
    @c("perStreet")
    private String perStreet;
    @c("perSubDistrict")
    private String perSubDistrict;
    @c("permVillageOrTown")
    private String permVillageOrTown;
    @c("presDistrict")
    private String presDistrict;
    @c("presHouseNo")
    private String presHouseNo;
    @c("presLocation")
    private String presLocation;
    @c("presPincode")
    private String presPincode;
    @c("presState")
    private String presState;
    @c("presStreet")
    private String presStreet;
    @c("presSubDistrict")
    private String presSubDistrict;
    @c("presVillageOrTown")
    private String presVillageOrTown;
    @c("rtoCodeDLTr")
    private String rtoCodeDLTr;
    @c("selectedDLSerList")
    private a selectedDLSerList;
    @c("willtoDonateOrgans")
    private String willtoDonateOrgans;

    public DlExRequestGen() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (a) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 1, (g) null);
    }

    public static /* synthetic */ DlExRequestGen copy$default(DlExRequestGen dlExRequestGen, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, a aVar, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, int i10, int i11, Object obj) {
        DlExRequestGen dlExRequestGen2 = dlExRequestGen;
        int i12 = i10;
        return dlExRequestGen.copy((i12 & 1) != 0 ? dlExRequestGen2.rtoCodeDLTr : str, (i12 & 2) != 0 ? dlExRequestGen2.willtoDonateOrgans : str2, (i12 & 4) != 0 ? dlExRequestGen2.agentId : str3, (i12 & 8) != 0 ? dlExRequestGen2.agentIpAddress : str4, (i12 & 16) != 0 ? dlExRequestGen2.dupDlReasonName : str5, (i12 & 32) != 0 ? dlExRequestGen2.agentServiceName : str6, (i12 & 64) != 0 ? dlExRequestGen2.dupDlReasonCode : num, (i12 & 128) != 0 ? dlExRequestGen2.dlno : str7, (i12 & 256) != 0 ? dlExRequestGen2.dob : str8, (i12 & 512) != 0 ? dlExRequestGen2.agentPwd : str9, (i12 & 1024) != 0 ? dlExRequestGen2.selectedDLSerList : aVar, (i12 & 2048) != 0 ? dlExRequestGen2.dlHolderAltMobMum : str10, (i12 & 4096) != 0 ? dlExRequestGen2.presHouseNo : str11, (i12 & 8192) != 0 ? dlExRequestGen2.presStreet : str12, (i12 & 16384) != 0 ? dlExRequestGen2.presLocation : str13, (i12 & 32768) != 0 ? dlExRequestGen2.presVillageOrTown : str14, (i12 & 65536) != 0 ? dlExRequestGen2.presSubDistrict : str15, (i12 & 131072) != 0 ? dlExRequestGen2.presDistrict : str16, (i12 & 262144) != 0 ? dlExRequestGen2.presState : str17, (i12 & 524288) != 0 ? dlExRequestGen2.presPincode : str18, (i12 & 1048576) != 0 ? dlExRequestGen2.perHouseNo : str19, (i12 & 2097152) != 0 ? dlExRequestGen2.perStreet : str20, (i12 & 4194304) != 0 ? dlExRequestGen2.perLocation : str21, (i12 & 8388608) != 0 ? dlExRequestGen2.permVillageOrTown : str22, (i12 & 16777216) != 0 ? dlExRequestGen2.perSubDistrict : str23, (i12 & 33554432) != 0 ? dlExRequestGen2.perDistrict : str24, (i12 & 67108864) != 0 ? dlExRequestGen2.perState : str25, (i12 & 134217728) != 0 ? dlExRequestGen2.perPinCode : str26, (i12 & 268435456) != 0 ? dlExRequestGen2.mobileNumber : str27, (i12 & 536870912) != 0 ? dlExRequestGen2.eKYCId : str28, (i12 & 1073741824) != 0 ? dlExRequestGen2.eKYCOpted : str29, (i12 & Integer.MIN_VALUE) != 0 ? dlExRequestGen2.eKYCapplicantPhoto : str30, (i11 & 1) != 0 ? dlExRequestGen2.eKYCGender : str31);
    }

    public final String component1() {
        return this.rtoCodeDLTr;
    }

    public final String component10() {
        return this.agentPwd;
    }

    public final a component11() {
        return this.selectedDLSerList;
    }

    public final String component12() {
        return this.dlHolderAltMobMum;
    }

    public final String component13() {
        return this.presHouseNo;
    }

    public final String component14() {
        return this.presStreet;
    }

    public final String component15() {
        return this.presLocation;
    }

    public final String component16() {
        return this.presVillageOrTown;
    }

    public final String component17() {
        return this.presSubDistrict;
    }

    public final String component18() {
        return this.presDistrict;
    }

    public final String component19() {
        return this.presState;
    }

    public final String component2() {
        return this.willtoDonateOrgans;
    }

    public final String component20() {
        return this.presPincode;
    }

    public final String component21() {
        return this.perHouseNo;
    }

    public final String component22() {
        return this.perStreet;
    }

    public final String component23() {
        return this.perLocation;
    }

    public final String component24() {
        return this.permVillageOrTown;
    }

    public final String component25() {
        return this.perSubDistrict;
    }

    public final String component26() {
        return this.perDistrict;
    }

    public final String component27() {
        return this.perState;
    }

    public final String component28() {
        return this.perPinCode;
    }

    public final String component29() {
        return this.mobileNumber;
    }

    public final String component3() {
        return this.agentId;
    }

    public final String component30() {
        return this.eKYCId;
    }

    public final String component31() {
        return this.eKYCOpted;
    }

    public final String component32() {
        return this.eKYCapplicantPhoto;
    }

    public final String component33() {
        return this.eKYCGender;
    }

    public final String component4() {
        return this.agentIpAddress;
    }

    public final String component5() {
        return this.dupDlReasonName;
    }

    public final String component6() {
        return this.agentServiceName;
    }

    public final Integer component7() {
        return this.dupDlReasonCode;
    }

    public final String component8() {
        return this.dlno;
    }

    public final String component9() {
        return this.dob;
    }

    public final DlExRequestGen copy(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, a aVar, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31) {
        return new DlExRequestGen(str, str2, str3, str4, str5, str6, num, str7, str8, str9, aVar, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlExRequestGen)) {
            return false;
        }
        DlExRequestGen dlExRequestGen = (DlExRequestGen) obj;
        return l.a(this.rtoCodeDLTr, dlExRequestGen.rtoCodeDLTr) && l.a(this.willtoDonateOrgans, dlExRequestGen.willtoDonateOrgans) && l.a(this.agentId, dlExRequestGen.agentId) && l.a(this.agentIpAddress, dlExRequestGen.agentIpAddress) && l.a(this.dupDlReasonName, dlExRequestGen.dupDlReasonName) && l.a(this.agentServiceName, dlExRequestGen.agentServiceName) && l.a(this.dupDlReasonCode, dlExRequestGen.dupDlReasonCode) && l.a(this.dlno, dlExRequestGen.dlno) && l.a(this.dob, dlExRequestGen.dob) && l.a(this.agentPwd, dlExRequestGen.agentPwd) && l.a(this.selectedDLSerList, dlExRequestGen.selectedDLSerList) && l.a(this.dlHolderAltMobMum, dlExRequestGen.dlHolderAltMobMum) && l.a(this.presHouseNo, dlExRequestGen.presHouseNo) && l.a(this.presStreet, dlExRequestGen.presStreet) && l.a(this.presLocation, dlExRequestGen.presLocation) && l.a(this.presVillageOrTown, dlExRequestGen.presVillageOrTown) && l.a(this.presSubDistrict, dlExRequestGen.presSubDistrict) && l.a(this.presDistrict, dlExRequestGen.presDistrict) && l.a(this.presState, dlExRequestGen.presState) && l.a(this.presPincode, dlExRequestGen.presPincode) && l.a(this.perHouseNo, dlExRequestGen.perHouseNo) && l.a(this.perStreet, dlExRequestGen.perStreet) && l.a(this.perLocation, dlExRequestGen.perLocation) && l.a(this.permVillageOrTown, dlExRequestGen.permVillageOrTown) && l.a(this.perSubDistrict, dlExRequestGen.perSubDistrict) && l.a(this.perDistrict, dlExRequestGen.perDistrict) && l.a(this.perState, dlExRequestGen.perState) && l.a(this.perPinCode, dlExRequestGen.perPinCode) && l.a(this.mobileNumber, dlExRequestGen.mobileNumber) && l.a(this.eKYCId, dlExRequestGen.eKYCId) && l.a(this.eKYCOpted, dlExRequestGen.eKYCOpted) && l.a(this.eKYCapplicantPhoto, dlExRequestGen.eKYCapplicantPhoto) && l.a(this.eKYCGender, dlExRequestGen.eKYCGender);
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

    public final String getDlHolderAltMobMum() {
        return this.dlHolderAltMobMum;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDob() {
        return this.dob;
    }

    public final Integer getDupDlReasonCode() {
        return this.dupDlReasonCode;
    }

    public final String getDupDlReasonName() {
        return this.dupDlReasonName;
    }

    public final String getEKYCGender() {
        return this.eKYCGender;
    }

    public final String getEKYCId() {
        return this.eKYCId;
    }

    public final String getEKYCOpted() {
        return this.eKYCOpted;
    }

    public final String getEKYCapplicantPhoto() {
        return this.eKYCapplicantPhoto;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getPerDistrict() {
        return this.perDistrict;
    }

    public final String getPerHouseNo() {
        return this.perHouseNo;
    }

    public final String getPerLocation() {
        return this.perLocation;
    }

    public final String getPerPinCode() {
        return this.perPinCode;
    }

    public final String getPerState() {
        return this.perState;
    }

    public final String getPerStreet() {
        return this.perStreet;
    }

    public final String getPerSubDistrict() {
        return this.perSubDistrict;
    }

    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
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

    public final String getPresPincode() {
        return this.presPincode;
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

    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    public final a getSelectedDLSerList() {
        return this.selectedDLSerList;
    }

    public final String getWilltoDonateOrgans() {
        return this.willtoDonateOrgans;
    }

    public int hashCode() {
        String str = this.rtoCodeDLTr;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.willtoDonateOrgans;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentIpAddress;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dupDlReasonName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.agentServiceName;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.dupDlReasonCode;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.dlno;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.dob;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.agentPwd;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        a aVar = this.selectedDLSerList;
        int hashCode11 = (hashCode10 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str10 = this.dlHolderAltMobMum;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.presHouseNo;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.presStreet;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.presLocation;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.presVillageOrTown;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.presSubDistrict;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.presDistrict;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.presState;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.presPincode;
        int hashCode20 = (hashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.perHouseNo;
        int hashCode21 = (hashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.perStreet;
        int hashCode22 = (hashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.perLocation;
        int hashCode23 = (hashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.permVillageOrTown;
        int hashCode24 = (hashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.perSubDistrict;
        int hashCode25 = (hashCode24 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.perDistrict;
        int hashCode26 = (hashCode25 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.perState;
        int hashCode27 = (hashCode26 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.perPinCode;
        int hashCode28 = (hashCode27 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.mobileNumber;
        int hashCode29 = (hashCode28 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.eKYCId;
        int hashCode30 = (hashCode29 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.eKYCOpted;
        int hashCode31 = (hashCode30 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.eKYCapplicantPhoto;
        int hashCode32 = (hashCode31 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.eKYCGender;
        if (str31 != null) {
            i10 = str31.hashCode();
        }
        return hashCode32 + i10;
    }

    public final void setAgentId(String str) {
        this.agentId = str;
    }

    public final void setAgentIpAddress(String str) {
        this.agentIpAddress = str;
    }

    public final void setAgentPwd(String str) {
        this.agentPwd = str;
    }

    public final void setAgentServiceName(String str) {
        this.agentServiceName = str;
    }

    public final void setDlHolderAltMobMum(String str) {
        this.dlHolderAltMobMum = str;
    }

    public final void setDlno(String str) {
        this.dlno = str;
    }

    public final void setDob(String str) {
        this.dob = str;
    }

    public final void setDupDlReasonCode(Integer num) {
        this.dupDlReasonCode = num;
    }

    public final void setDupDlReasonName(String str) {
        this.dupDlReasonName = str;
    }

    public final void setEKYCGender(String str) {
        this.eKYCGender = str;
    }

    public final void setEKYCId(String str) {
        this.eKYCId = str;
    }

    public final void setEKYCOpted(String str) {
        this.eKYCOpted = str;
    }

    public final void setEKYCapplicantPhoto(String str) {
        this.eKYCapplicantPhoto = str;
    }

    public final void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public final void setPerDistrict(String str) {
        this.perDistrict = str;
    }

    public final void setPerHouseNo(String str) {
        this.perHouseNo = str;
    }

    public final void setPerLocation(String str) {
        this.perLocation = str;
    }

    public final void setPerPinCode(String str) {
        this.perPinCode = str;
    }

    public final void setPerState(String str) {
        this.perState = str;
    }

    public final void setPerStreet(String str) {
        this.perStreet = str;
    }

    public final void setPerSubDistrict(String str) {
        this.perSubDistrict = str;
    }

    public final void setPermVillageOrTown(String str) {
        this.permVillageOrTown = str;
    }

    public final void setPresDistrict(String str) {
        this.presDistrict = str;
    }

    public final void setPresHouseNo(String str) {
        this.presHouseNo = str;
    }

    public final void setPresLocation(String str) {
        this.presLocation = str;
    }

    public final void setPresPincode(String str) {
        this.presPincode = str;
    }

    public final void setPresState(String str) {
        this.presState = str;
    }

    public final void setPresStreet(String str) {
        this.presStreet = str;
    }

    public final void setPresSubDistrict(String str) {
        this.presSubDistrict = str;
    }

    public final void setPresVillageOrTown(String str) {
        this.presVillageOrTown = str;
    }

    public final void setRtoCodeDLTr(String str) {
        this.rtoCodeDLTr = str;
    }

    public final void setSelectedDLSerList(a aVar) {
        this.selectedDLSerList = aVar;
    }

    public final void setWilltoDonateOrgans(String str) {
        this.willtoDonateOrgans = str;
    }

    public String toString() {
        return "DlExRequestGen(rtoCodeDLTr=" + this.rtoCodeDLTr + ", willtoDonateOrgans=" + this.willtoDonateOrgans + ", agentId=" + this.agentId + ", agentIpAddress=" + this.agentIpAddress + ", dupDlReasonName=" + this.dupDlReasonName + ", agentServiceName=" + this.agentServiceName + ", dupDlReasonCode=" + this.dupDlReasonCode + ", dlno=" + this.dlno + ", dob=" + this.dob + ", agentPwd=" + this.agentPwd + ", selectedDLSerList=" + this.selectedDLSerList + ", dlHolderAltMobMum=" + this.dlHolderAltMobMum + ", presHouseNo=" + this.presHouseNo + ", presStreet=" + this.presStreet + ", presLocation=" + this.presLocation + ", presVillageOrTown=" + this.presVillageOrTown + ", presSubDistrict=" + this.presSubDistrict + ", presDistrict=" + this.presDistrict + ", presState=" + this.presState + ", presPincode=" + this.presPincode + ", perHouseNo=" + this.perHouseNo + ", perStreet=" + this.perStreet + ", perLocation=" + this.perLocation + ", permVillageOrTown=" + this.permVillageOrTown + ", perSubDistrict=" + this.perSubDistrict + ", perDistrict=" + this.perDistrict + ", perState=" + this.perState + ", perPinCode=" + this.perPinCode + ", mobileNumber=" + this.mobileNumber + ", eKYCId=" + this.eKYCId + ", eKYCOpted=" + this.eKYCOpted + ", eKYCapplicantPhoto=" + this.eKYCapplicantPhoto + ", eKYCGender=" + this.eKYCGender + ')';
    }

    public DlExRequestGen(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, a aVar, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31) {
        this.rtoCodeDLTr = str;
        this.willtoDonateOrgans = str2;
        this.agentId = str3;
        this.agentIpAddress = str4;
        this.dupDlReasonName = str5;
        this.agentServiceName = str6;
        this.dupDlReasonCode = num;
        this.dlno = str7;
        this.dob = str8;
        this.agentPwd = str9;
        this.selectedDLSerList = aVar;
        this.dlHolderAltMobMum = str10;
        this.presHouseNo = str11;
        this.presStreet = str12;
        this.presLocation = str13;
        this.presVillageOrTown = str14;
        this.presSubDistrict = str15;
        this.presDistrict = str16;
        this.presState = str17;
        this.presPincode = str18;
        this.perHouseNo = str19;
        this.perStreet = str20;
        this.perLocation = str21;
        this.permVillageOrTown = str22;
        this.perSubDistrict = str23;
        this.perDistrict = str24;
        this.perState = str25;
        this.perPinCode = str26;
        this.mobileNumber = str27;
        this.eKYCId = str28;
        this.eKYCOpted = str29;
        this.eKYCapplicantPhoto = str30;
        this.eKYCGender = str31;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DlExRequestGen(java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.Integer r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, mj.a r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, int r67, int r68, cm.g r69) {
        /*
            r33 = this;
            r0 = r67
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r34
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r35
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r36
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r37
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r38
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r39
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r40
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r41
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r42
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r43
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r44
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r45
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r46
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r47
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r48
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r49
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r50
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r51
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r52
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r53
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r54
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r55
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r56
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = 0
            goto L_0x00de
        L_0x00dc:
            r24 = r57
        L_0x00de:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e7
            r25 = 0
            goto L_0x00e9
        L_0x00e7:
            r25 = r58
        L_0x00e9:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00f2
            r26 = 0
            goto L_0x00f4
        L_0x00f2:
            r26 = r59
        L_0x00f4:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00fd
            r27 = 0
            goto L_0x00ff
        L_0x00fd:
            r27 = r60
        L_0x00ff:
            r28 = 134217728(0x8000000, float:3.85186E-34)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0108
            r28 = 0
            goto L_0x010a
        L_0x0108:
            r28 = r61
        L_0x010a:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x0113
            r29 = 0
            goto L_0x0115
        L_0x0113:
            r29 = r62
        L_0x0115:
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x011e
            r30 = 0
            goto L_0x0120
        L_0x011e:
            r30 = r63
        L_0x0120:
            r31 = 1073741824(0x40000000, float:2.0)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x0129
            r31 = 0
            goto L_0x012b
        L_0x0129:
            r31 = r64
        L_0x012b:
            r32 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r32
            if (r0 == 0) goto L_0x0133
            r0 = 0
            goto L_0x0135
        L_0x0133:
            r0 = r65
        L_0x0135:
            r32 = r68 & 1
            if (r32 == 0) goto L_0x013c
            r32 = 0
            goto L_0x013e
        L_0x013c:
            r32 = r66
        L_0x013e:
            r34 = r33
            r35 = r1
            r36 = r3
            r37 = r4
            r38 = r5
            r39 = r6
            r40 = r7
            r41 = r8
            r42 = r9
            r43 = r10
            r44 = r11
            r45 = r12
            r46 = r13
            r47 = r14
            r48 = r15
            r49 = r2
            r50 = r16
            r51 = r17
            r52 = r18
            r53 = r19
            r54 = r20
            r55 = r21
            r56 = r22
            r57 = r23
            r58 = r24
            r59 = r25
            r60 = r26
            r61 = r27
            r62 = r28
            r63 = r29
            r64 = r30
            r65 = r31
            r66 = r0
            r67 = r32
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi.DlExRequestGen.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, mj.a, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, cm.g):void");
    }
}
