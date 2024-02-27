package com.nic.mparivahan.DlCombineServices;

import androidx.annotation.Keep;
import cm.g;
import cm.l;

@Keep
public final class CombineReq {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String applDateOfBirth;
    private String applFirstName;
    private String applLastName;
    private String applcatgDLserReq;
    private String appliedIdpfromIndEmb;
    private String changeOfAddReq;
    private String codobDlReasonCode;
    private String codobDlReasonName;
    private Integer conDlReasonCode;
    private String conDlReasonName;
    private String conEffdate;
    private String country;
    private String countryRestrictedReason;
    private String dateOfVerifEmb;
    private String declaringcheck;
    private String dlHolderAltMobMum;
    private String dlHolderNaturalName;
    private String dlSerdisqualifiedReason;
    private String dleDlReasonCode;
    private String dleDlReasonName;
    private String dlno;
    private String dob;
    private String dupDlReasonCode;
    private String dupDlReasonName;
    private String emailID;
    private String embEndorseNo;
    private String embPlace;
    private String forAdd1;
    private String forAdd2;
    private String forAdd3;
    private String forAddPinCode;
    private String forNationMobNum;
    private String hillcertificate;
    private String hilldrivingschool;
    private String hillissby;
    private String hillissueDate;
    private String hillvalidFrom;
    private String hillvalidTo;
    private String idpcountryapplyfrom;
    private String indEmbName;
    private String isDlSerdisqualified;
    private String iscountryrestricted;
    private String mobileNumber;
    private String passno;
    private String passvaltill;
    private String perDistrict;
    private String perHouseNo;
    private String perLocation;
    private String perPinCode;
    private String perState;
    private String perStreet;
    private String perSubDistrict;
    private String permVillageOrTown;
    private String pofbirth;
    private String presDistrict;
    private String presHouseNo;
    private String presLocation;
    private String presPincode;
    private String presState;
    private String presStreet;
    private String presSubDistrict;
    private String presVillageOrTown;
    private String relFirstName;
    private String relLastName;
    private String relationType;
    private String rtoCodeDLTr;
    private String tovisit;
    private String visano;
    private String visavaltill;
    private String willtoDonateOrgans;

    public CombineReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, 1023, (g) null);
    }

    public static /* synthetic */ CombineReq copy$default(CombineReq combineReq, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, int i10, int i11, int i12, Object obj) {
        CombineReq combineReq2 = combineReq;
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        return combineReq.copy((i13 & 1) != 0 ? combineReq2.agentId : str, (i13 & 2) != 0 ? combineReq2.agentPwd : str2, (i13 & 4) != 0 ? combineReq2.agentIpAddress : str3, (i13 & 8) != 0 ? combineReq2.agentServiceName : str4, (i13 & 16) != 0 ? combineReq2.dleDlReasonCode : str5, (i13 & 32) != 0 ? combineReq2.dleDlReasonName : str6, (i13 & 64) != 0 ? combineReq2.applcatgDLserReq : str7, (i13 & 128) != 0 ? combineReq2.dlHolderAltMobMum : str8, (i13 & 256) != 0 ? combineReq2.dlno : str9, (i13 & 512) != 0 ? combineReq2.dob : str10, (i13 & 1024) != 0 ? combineReq2.rtoCodeDLTr : str11, (i13 & 2048) != 0 ? combineReq2.willtoDonateOrgans : str12, (i13 & 4096) != 0 ? combineReq2.relationType : str13, (i13 & 8192) != 0 ? combineReq2.conDlReasonCode : num, (i13 & 16384) != 0 ? combineReq2.conDlReasonName : str14, (i13 & 32768) != 0 ? combineReq2.dlHolderNaturalName : str15, (i13 & 65536) != 0 ? combineReq2.conEffdate : str16, (i13 & 131072) != 0 ? combineReq2.applFirstName : str17, (i13 & 262144) != 0 ? combineReq2.applLastName : str18, (i13 & 524288) != 0 ? combineReq2.relFirstName : str19, (i13 & 1048576) != 0 ? combineReq2.relLastName : str20, (i13 & 2097152) != 0 ? combineReq2.mobileNumber : str21, (i13 & 4194304) != 0 ? combineReq2.changeOfAddReq : str22, (i13 & 8388608) != 0 ? combineReq2.perHouseNo : str23, (i13 & 16777216) != 0 ? combineReq2.perStreet : str24, (i13 & 33554432) != 0 ? combineReq2.perLocation : str25, (i13 & 67108864) != 0 ? combineReq2.permVillageOrTown : str26, (i13 & 134217728) != 0 ? combineReq2.perSubDistrict : str27, (i13 & 268435456) != 0 ? combineReq2.perDistrict : str28, (i13 & 536870912) != 0 ? combineReq2.perState : str29, (i13 & 1073741824) != 0 ? combineReq2.perPinCode : str30, (i13 & Integer.MIN_VALUE) != 0 ? combineReq2.presHouseNo : str31, (i14 & 1) != 0 ? combineReq2.presStreet : str32, (i14 & 2) != 0 ? combineReq2.presLocation : str33, (i14 & 4) != 0 ? combineReq2.presVillageOrTown : str34, (i14 & 8) != 0 ? combineReq2.presSubDistrict : str35, (i14 & 16) != 0 ? combineReq2.presDistrict : str36, (i14 & 32) != 0 ? combineReq2.presState : str37, (i14 & 64) != 0 ? combineReq2.presPincode : str38, (i14 & 128) != 0 ? combineReq2.dupDlReasonName : str39, (i14 & 256) != 0 ? combineReq2.dupDlReasonCode : str40, (i14 & 512) != 0 ? combineReq2.applDateOfBirth : str41, (i14 & 1024) != 0 ? combineReq2.codobDlReasonName : str42, (i14 & 2048) != 0 ? combineReq2.codobDlReasonCode : str43, (i14 & 4096) != 0 ? combineReq2.declaringcheck : str44, (i14 & 8192) != 0 ? combineReq2.hillcertificate : str45, (i14 & 16384) != 0 ? combineReq2.hillissueDate : str46, (i14 & 32768) != 0 ? combineReq2.hillvalidFrom : str47, (i14 & 65536) != 0 ? combineReq2.hillvalidTo : str48, (i14 & 131072) != 0 ? combineReq2.hilldrivingschool : str49, (i14 & 262144) != 0 ? combineReq2.hillissby : str50, (i14 & 524288) != 0 ? combineReq2.pofbirth : str51, (i14 & 1048576) != 0 ? combineReq2.country : str52, (i14 & 2097152) != 0 ? combineReq2.passno : str53, (i14 & 4194304) != 0 ? combineReq2.passvaltill : str54, (i14 & 8388608) != 0 ? combineReq2.visano : str55, (i14 & 16777216) != 0 ? combineReq2.visavaltill : str56, (i14 & 33554432) != 0 ? combineReq2.tovisit : str57, (i14 & 67108864) != 0 ? combineReq2.iscountryrestricted : str58, (i14 & 134217728) != 0 ? combineReq2.countryRestrictedReason : str59, (i14 & 268435456) != 0 ? combineReq2.isDlSerdisqualified : str60, (i14 & 536870912) != 0 ? combineReq2.dlSerdisqualifiedReason : str61, (i14 & 1073741824) != 0 ? combineReq2.forAdd1 : str62, (i14 & Integer.MIN_VALUE) != 0 ? combineReq2.forAdd2 : str63, (i15 & 1) != 0 ? combineReq2.forAdd3 : str64, (i15 & 2) != 0 ? combineReq2.forAddPinCode : str65, (i15 & 4) != 0 ? combineReq2.forNationMobNum : str66, (i15 & 8) != 0 ? combineReq2.emailID : str67, (i15 & 16) != 0 ? combineReq2.appliedIdpfromIndEmb : str68, (i15 & 32) != 0 ? combineReq2.indEmbName : str69, (i15 & 64) != 0 ? combineReq2.embPlace : str70, (i15 & 128) != 0 ? combineReq2.dateOfVerifEmb : str71, (i15 & 256) != 0 ? combineReq2.embEndorseNo : str72, (i15 & 512) != 0 ? combineReq2.idpcountryapplyfrom : str73);
    }

    public final String component1() {
        return this.agentId;
    }

    public final String component10() {
        return this.dob;
    }

    public final String component11() {
        return this.rtoCodeDLTr;
    }

    public final String component12() {
        return this.willtoDonateOrgans;
    }

    public final String component13() {
        return this.relationType;
    }

    public final Integer component14() {
        return this.conDlReasonCode;
    }

    public final String component15() {
        return this.conDlReasonName;
    }

    public final String component16() {
        return this.dlHolderNaturalName;
    }

    public final String component17() {
        return this.conEffdate;
    }

    public final String component18() {
        return this.applFirstName;
    }

    public final String component19() {
        return this.applLastName;
    }

    public final String component2() {
        return this.agentPwd;
    }

    public final String component20() {
        return this.relFirstName;
    }

    public final String component21() {
        return this.relLastName;
    }

    public final String component22() {
        return this.mobileNumber;
    }

    public final String component23() {
        return this.changeOfAddReq;
    }

    public final String component24() {
        return this.perHouseNo;
    }

    public final String component25() {
        return this.perStreet;
    }

    public final String component26() {
        return this.perLocation;
    }

    public final String component27() {
        return this.permVillageOrTown;
    }

    public final String component28() {
        return this.perSubDistrict;
    }

    public final String component29() {
        return this.perDistrict;
    }

    public final String component3() {
        return this.agentIpAddress;
    }

    public final String component30() {
        return this.perState;
    }

    public final String component31() {
        return this.perPinCode;
    }

    public final String component32() {
        return this.presHouseNo;
    }

    public final String component33() {
        return this.presStreet;
    }

    public final String component34() {
        return this.presLocation;
    }

    public final String component35() {
        return this.presVillageOrTown;
    }

    public final String component36() {
        return this.presSubDistrict;
    }

    public final String component37() {
        return this.presDistrict;
    }

    public final String component38() {
        return this.presState;
    }

    public final String component39() {
        return this.presPincode;
    }

    public final String component4() {
        return this.agentServiceName;
    }

    public final String component40() {
        return this.dupDlReasonName;
    }

    public final String component41() {
        return this.dupDlReasonCode;
    }

    public final String component42() {
        return this.applDateOfBirth;
    }

    public final String component43() {
        return this.codobDlReasonName;
    }

    public final String component44() {
        return this.codobDlReasonCode;
    }

    public final String component45() {
        return this.declaringcheck;
    }

    public final String component46() {
        return this.hillcertificate;
    }

    public final String component47() {
        return this.hillissueDate;
    }

    public final String component48() {
        return this.hillvalidFrom;
    }

    public final String component49() {
        return this.hillvalidTo;
    }

    public final String component5() {
        return this.dleDlReasonCode;
    }

    public final String component50() {
        return this.hilldrivingschool;
    }

    public final String component51() {
        return this.hillissby;
    }

    public final String component52() {
        return this.pofbirth;
    }

    public final String component53() {
        return this.country;
    }

    public final String component54() {
        return this.passno;
    }

    public final String component55() {
        return this.passvaltill;
    }

    public final String component56() {
        return this.visano;
    }

    public final String component57() {
        return this.visavaltill;
    }

    public final String component58() {
        return this.tovisit;
    }

    public final String component59() {
        return this.iscountryrestricted;
    }

    public final String component6() {
        return this.dleDlReasonName;
    }

    public final String component60() {
        return this.countryRestrictedReason;
    }

    public final String component61() {
        return this.isDlSerdisqualified;
    }

    public final String component62() {
        return this.dlSerdisqualifiedReason;
    }

    public final String component63() {
        return this.forAdd1;
    }

    public final String component64() {
        return this.forAdd2;
    }

    public final String component65() {
        return this.forAdd3;
    }

    public final String component66() {
        return this.forAddPinCode;
    }

    public final String component67() {
        return this.forNationMobNum;
    }

    public final String component68() {
        return this.emailID;
    }

    public final String component69() {
        return this.appliedIdpfromIndEmb;
    }

    public final String component7() {
        return this.applcatgDLserReq;
    }

    public final String component70() {
        return this.indEmbName;
    }

    public final String component71() {
        return this.embPlace;
    }

    public final String component72() {
        return this.dateOfVerifEmb;
    }

    public final String component73() {
        return this.embEndorseNo;
    }

    public final String component74() {
        return this.idpcountryapplyfrom;
    }

    public final String component8() {
        return this.dlHolderAltMobMum;
    }

    public final String component9() {
        return this.dlno;
    }

    public final CombineReq copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73) {
        return new CombineReq(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, num, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, str72, str73);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombineReq)) {
            return false;
        }
        CombineReq combineReq = (CombineReq) obj;
        return l.a(this.agentId, combineReq.agentId) && l.a(this.agentPwd, combineReq.agentPwd) && l.a(this.agentIpAddress, combineReq.agentIpAddress) && l.a(this.agentServiceName, combineReq.agentServiceName) && l.a(this.dleDlReasonCode, combineReq.dleDlReasonCode) && l.a(this.dleDlReasonName, combineReq.dleDlReasonName) && l.a(this.applcatgDLserReq, combineReq.applcatgDLserReq) && l.a(this.dlHolderAltMobMum, combineReq.dlHolderAltMobMum) && l.a(this.dlno, combineReq.dlno) && l.a(this.dob, combineReq.dob) && l.a(this.rtoCodeDLTr, combineReq.rtoCodeDLTr) && l.a(this.willtoDonateOrgans, combineReq.willtoDonateOrgans) && l.a(this.relationType, combineReq.relationType) && l.a(this.conDlReasonCode, combineReq.conDlReasonCode) && l.a(this.conDlReasonName, combineReq.conDlReasonName) && l.a(this.dlHolderNaturalName, combineReq.dlHolderNaturalName) && l.a(this.conEffdate, combineReq.conEffdate) && l.a(this.applFirstName, combineReq.applFirstName) && l.a(this.applLastName, combineReq.applLastName) && l.a(this.relFirstName, combineReq.relFirstName) && l.a(this.relLastName, combineReq.relLastName) && l.a(this.mobileNumber, combineReq.mobileNumber) && l.a(this.changeOfAddReq, combineReq.changeOfAddReq) && l.a(this.perHouseNo, combineReq.perHouseNo) && l.a(this.perStreet, combineReq.perStreet) && l.a(this.perLocation, combineReq.perLocation) && l.a(this.permVillageOrTown, combineReq.permVillageOrTown) && l.a(this.perSubDistrict, combineReq.perSubDistrict) && l.a(this.perDistrict, combineReq.perDistrict) && l.a(this.perState, combineReq.perState) && l.a(this.perPinCode, combineReq.perPinCode) && l.a(this.presHouseNo, combineReq.presHouseNo) && l.a(this.presStreet, combineReq.presStreet) && l.a(this.presLocation, combineReq.presLocation) && l.a(this.presVillageOrTown, combineReq.presVillageOrTown) && l.a(this.presSubDistrict, combineReq.presSubDistrict) && l.a(this.presDistrict, combineReq.presDistrict) && l.a(this.presState, combineReq.presState) && l.a(this.presPincode, combineReq.presPincode) && l.a(this.dupDlReasonName, combineReq.dupDlReasonName) && l.a(this.dupDlReasonCode, combineReq.dupDlReasonCode) && l.a(this.applDateOfBirth, combineReq.applDateOfBirth) && l.a(this.codobDlReasonName, combineReq.codobDlReasonName) && l.a(this.codobDlReasonCode, combineReq.codobDlReasonCode) && l.a(this.declaringcheck, combineReq.declaringcheck) && l.a(this.hillcertificate, combineReq.hillcertificate) && l.a(this.hillissueDate, combineReq.hillissueDate) && l.a(this.hillvalidFrom, combineReq.hillvalidFrom) && l.a(this.hillvalidTo, combineReq.hillvalidTo) && l.a(this.hilldrivingschool, combineReq.hilldrivingschool) && l.a(this.hillissby, combineReq.hillissby) && l.a(this.pofbirth, combineReq.pofbirth) && l.a(this.country, combineReq.country) && l.a(this.passno, combineReq.passno) && l.a(this.passvaltill, combineReq.passvaltill) && l.a(this.visano, combineReq.visano) && l.a(this.visavaltill, combineReq.visavaltill) && l.a(this.tovisit, combineReq.tovisit) && l.a(this.iscountryrestricted, combineReq.iscountryrestricted) && l.a(this.countryRestrictedReason, combineReq.countryRestrictedReason) && l.a(this.isDlSerdisqualified, combineReq.isDlSerdisqualified) && l.a(this.dlSerdisqualifiedReason, combineReq.dlSerdisqualifiedReason) && l.a(this.forAdd1, combineReq.forAdd1) && l.a(this.forAdd2, combineReq.forAdd2) && l.a(this.forAdd3, combineReq.forAdd3) && l.a(this.forAddPinCode, combineReq.forAddPinCode) && l.a(this.forNationMobNum, combineReq.forNationMobNum) && l.a(this.emailID, combineReq.emailID) && l.a(this.appliedIdpfromIndEmb, combineReq.appliedIdpfromIndEmb) && l.a(this.indEmbName, combineReq.indEmbName) && l.a(this.embPlace, combineReq.embPlace) && l.a(this.dateOfVerifEmb, combineReq.dateOfVerifEmb) && l.a(this.embEndorseNo, combineReq.embEndorseNo) && l.a(this.idpcountryapplyfrom, combineReq.idpcountryapplyfrom);
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

    public final String getApplDateOfBirth() {
        return this.applDateOfBirth;
    }

    public final String getApplFirstName() {
        return this.applFirstName;
    }

    public final String getApplLastName() {
        return this.applLastName;
    }

    public final String getApplcatgDLserReq() {
        return this.applcatgDLserReq;
    }

    public final String getAppliedIdpfromIndEmb() {
        return this.appliedIdpfromIndEmb;
    }

    public final String getChangeOfAddReq() {
        return this.changeOfAddReq;
    }

    public final String getCodobDlReasonCode() {
        return this.codobDlReasonCode;
    }

    public final String getCodobDlReasonName() {
        return this.codobDlReasonName;
    }

    public final Integer getConDlReasonCode() {
        return this.conDlReasonCode;
    }

    public final String getConDlReasonName() {
        return this.conDlReasonName;
    }

    public final String getConEffdate() {
        return this.conEffdate;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCountryRestrictedReason() {
        return this.countryRestrictedReason;
    }

    public final String getDateOfVerifEmb() {
        return this.dateOfVerifEmb;
    }

    public final String getDeclaringcheck() {
        return this.declaringcheck;
    }

    public final String getDlHolderAltMobMum() {
        return this.dlHolderAltMobMum;
    }

    public final String getDlHolderNaturalName() {
        return this.dlHolderNaturalName;
    }

    public final String getDlSerdisqualifiedReason() {
        return this.dlSerdisqualifiedReason;
    }

    public final String getDleDlReasonCode() {
        return this.dleDlReasonCode;
    }

    public final String getDleDlReasonName() {
        return this.dleDlReasonName;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getDupDlReasonCode() {
        return this.dupDlReasonCode;
    }

    public final String getDupDlReasonName() {
        return this.dupDlReasonName;
    }

    public final String getEmailID() {
        return this.emailID;
    }

    public final String getEmbEndorseNo() {
        return this.embEndorseNo;
    }

    public final String getEmbPlace() {
        return this.embPlace;
    }

    public final String getForAdd1() {
        return this.forAdd1;
    }

    public final String getForAdd2() {
        return this.forAdd2;
    }

    public final String getForAdd3() {
        return this.forAdd3;
    }

    public final String getForAddPinCode() {
        return this.forAddPinCode;
    }

    public final String getForNationMobNum() {
        return this.forNationMobNum;
    }

    public final String getHillcertificate() {
        return this.hillcertificate;
    }

    public final String getHilldrivingschool() {
        return this.hilldrivingschool;
    }

    public final String getHillissby() {
        return this.hillissby;
    }

    public final String getHillissueDate() {
        return this.hillissueDate;
    }

    public final String getHillvalidFrom() {
        return this.hillvalidFrom;
    }

    public final String getHillvalidTo() {
        return this.hillvalidTo;
    }

    public final String getIdpcountryapplyfrom() {
        return this.idpcountryapplyfrom;
    }

    public final String getIndEmbName() {
        return this.indEmbName;
    }

    public final String getIscountryrestricted() {
        return this.iscountryrestricted;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getPassno() {
        return this.passno;
    }

    public final String getPassvaltill() {
        return this.passvaltill;
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

    public final String getPofbirth() {
        return this.pofbirth;
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

    public final String getRelFirstName() {
        return this.relFirstName;
    }

    public final String getRelLastName() {
        return this.relLastName;
    }

    public final String getRelationType() {
        return this.relationType;
    }

    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    public final String getTovisit() {
        return this.tovisit;
    }

    public final String getVisano() {
        return this.visano;
    }

    public final String getVisavaltill() {
        return this.visavaltill;
    }

    public final String getWilltoDonateOrgans() {
        return this.willtoDonateOrgans;
    }

    public int hashCode() {
        String str = this.agentId;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agentPwd;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentIpAddress;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentServiceName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dleDlReasonCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dleDlReasonName;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.applcatgDLserReq;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.dlHolderAltMobMum;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.dlno;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.dob;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rtoCodeDLTr;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.willtoDonateOrgans;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.relationType;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num = this.conDlReasonCode;
        int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        String str14 = this.conDlReasonName;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.dlHolderNaturalName;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.conEffdate;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.applFirstName;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.applLastName;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.relFirstName;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.relLastName;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.mobileNumber;
        int hashCode22 = (hashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.changeOfAddReq;
        int hashCode23 = (hashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.perHouseNo;
        int hashCode24 = (hashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.perStreet;
        int hashCode25 = (hashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.perLocation;
        int hashCode26 = (hashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.permVillageOrTown;
        int hashCode27 = (hashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.perSubDistrict;
        int hashCode28 = (hashCode27 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.perDistrict;
        int hashCode29 = (hashCode28 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.perState;
        int hashCode30 = (hashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.perPinCode;
        int hashCode31 = (hashCode30 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.presHouseNo;
        int hashCode32 = (hashCode31 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.presStreet;
        int hashCode33 = (hashCode32 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.presLocation;
        int hashCode34 = (hashCode33 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.presVillageOrTown;
        int hashCode35 = (hashCode34 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.presSubDistrict;
        int hashCode36 = (hashCode35 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.presDistrict;
        int hashCode37 = (hashCode36 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.presState;
        int hashCode38 = (hashCode37 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.presPincode;
        int hashCode39 = (hashCode38 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.dupDlReasonName;
        int hashCode40 = (hashCode39 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.dupDlReasonCode;
        int hashCode41 = (hashCode40 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.applDateOfBirth;
        int hashCode42 = (hashCode41 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.codobDlReasonName;
        int hashCode43 = (hashCode42 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.codobDlReasonCode;
        int hashCode44 = (hashCode43 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.declaringcheck;
        int hashCode45 = (hashCode44 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.hillcertificate;
        int hashCode46 = (hashCode45 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.hillissueDate;
        int hashCode47 = (hashCode46 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.hillvalidFrom;
        int hashCode48 = (hashCode47 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.hillvalidTo;
        int hashCode49 = (hashCode48 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.hilldrivingschool;
        int hashCode50 = (hashCode49 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.hillissby;
        int hashCode51 = (hashCode50 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.pofbirth;
        int hashCode52 = (hashCode51 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.country;
        int hashCode53 = (hashCode52 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.passno;
        int hashCode54 = (hashCode53 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.passvaltill;
        int hashCode55 = (hashCode54 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.visano;
        int hashCode56 = (hashCode55 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.visavaltill;
        int hashCode57 = (hashCode56 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.tovisit;
        int hashCode58 = (hashCode57 + (str57 == null ? 0 : str57.hashCode())) * 31;
        String str58 = this.iscountryrestricted;
        int hashCode59 = (hashCode58 + (str58 == null ? 0 : str58.hashCode())) * 31;
        String str59 = this.countryRestrictedReason;
        int hashCode60 = (hashCode59 + (str59 == null ? 0 : str59.hashCode())) * 31;
        String str60 = this.isDlSerdisqualified;
        int hashCode61 = (hashCode60 + (str60 == null ? 0 : str60.hashCode())) * 31;
        String str61 = this.dlSerdisqualifiedReason;
        int hashCode62 = (hashCode61 + (str61 == null ? 0 : str61.hashCode())) * 31;
        String str62 = this.forAdd1;
        int hashCode63 = (hashCode62 + (str62 == null ? 0 : str62.hashCode())) * 31;
        String str63 = this.forAdd2;
        int hashCode64 = (hashCode63 + (str63 == null ? 0 : str63.hashCode())) * 31;
        String str64 = this.forAdd3;
        int hashCode65 = (hashCode64 + (str64 == null ? 0 : str64.hashCode())) * 31;
        String str65 = this.forAddPinCode;
        int hashCode66 = (hashCode65 + (str65 == null ? 0 : str65.hashCode())) * 31;
        String str66 = this.forNationMobNum;
        int hashCode67 = (hashCode66 + (str66 == null ? 0 : str66.hashCode())) * 31;
        String str67 = this.emailID;
        int hashCode68 = (hashCode67 + (str67 == null ? 0 : str67.hashCode())) * 31;
        String str68 = this.appliedIdpfromIndEmb;
        int hashCode69 = (hashCode68 + (str68 == null ? 0 : str68.hashCode())) * 31;
        String str69 = this.indEmbName;
        int hashCode70 = (hashCode69 + (str69 == null ? 0 : str69.hashCode())) * 31;
        String str70 = this.embPlace;
        int hashCode71 = (hashCode70 + (str70 == null ? 0 : str70.hashCode())) * 31;
        String str71 = this.dateOfVerifEmb;
        int hashCode72 = (hashCode71 + (str71 == null ? 0 : str71.hashCode())) * 31;
        String str72 = this.embEndorseNo;
        int hashCode73 = (hashCode72 + (str72 == null ? 0 : str72.hashCode())) * 31;
        String str73 = this.idpcountryapplyfrom;
        if (str73 != null) {
            i10 = str73.hashCode();
        }
        return hashCode73 + i10;
    }

    public final String isDlSerdisqualified() {
        return this.isDlSerdisqualified;
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

    public final void setApplDateOfBirth(String str) {
        this.applDateOfBirth = str;
    }

    public final void setApplFirstName(String str) {
        this.applFirstName = str;
    }

    public final void setApplLastName(String str) {
        this.applLastName = str;
    }

    public final void setApplcatgDLserReq(String str) {
        this.applcatgDLserReq = str;
    }

    public final void setAppliedIdpfromIndEmb(String str) {
        this.appliedIdpfromIndEmb = str;
    }

    public final void setChangeOfAddReq(String str) {
        this.changeOfAddReq = str;
    }

    public final void setCodobDlReasonCode(String str) {
        this.codobDlReasonCode = str;
    }

    public final void setCodobDlReasonName(String str) {
        this.codobDlReasonName = str;
    }

    public final void setConDlReasonCode(Integer num) {
        this.conDlReasonCode = num;
    }

    public final void setConDlReasonName(String str) {
        this.conDlReasonName = str;
    }

    public final void setConEffdate(String str) {
        this.conEffdate = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setCountryRestrictedReason(String str) {
        this.countryRestrictedReason = str;
    }

    public final void setDateOfVerifEmb(String str) {
        this.dateOfVerifEmb = str;
    }

    public final void setDeclaringcheck(String str) {
        this.declaringcheck = str;
    }

    public final void setDlHolderAltMobMum(String str) {
        this.dlHolderAltMobMum = str;
    }

    public final void setDlHolderNaturalName(String str) {
        this.dlHolderNaturalName = str;
    }

    public final void setDlSerdisqualified(String str) {
        this.isDlSerdisqualified = str;
    }

    public final void setDlSerdisqualifiedReason(String str) {
        this.dlSerdisqualifiedReason = str;
    }

    public final void setDleDlReasonCode(String str) {
        this.dleDlReasonCode = str;
    }

    public final void setDleDlReasonName(String str) {
        this.dleDlReasonName = str;
    }

    public final void setDlno(String str) {
        this.dlno = str;
    }

    public final void setDob(String str) {
        this.dob = str;
    }

    public final void setDupDlReasonCode(String str) {
        this.dupDlReasonCode = str;
    }

    public final void setDupDlReasonName(String str) {
        this.dupDlReasonName = str;
    }

    public final void setEmailID(String str) {
        this.emailID = str;
    }

    public final void setEmbEndorseNo(String str) {
        this.embEndorseNo = str;
    }

    public final void setEmbPlace(String str) {
        this.embPlace = str;
    }

    public final void setForAdd1(String str) {
        this.forAdd1 = str;
    }

    public final void setForAdd2(String str) {
        this.forAdd2 = str;
    }

    public final void setForAdd3(String str) {
        this.forAdd3 = str;
    }

    public final void setForAddPinCode(String str) {
        this.forAddPinCode = str;
    }

    public final void setForNationMobNum(String str) {
        this.forNationMobNum = str;
    }

    public final void setHillcertificate(String str) {
        this.hillcertificate = str;
    }

    public final void setHilldrivingschool(String str) {
        this.hilldrivingschool = str;
    }

    public final void setHillissby(String str) {
        this.hillissby = str;
    }

    public final void setHillissueDate(String str) {
        this.hillissueDate = str;
    }

    public final void setHillvalidFrom(String str) {
        this.hillvalidFrom = str;
    }

    public final void setHillvalidTo(String str) {
        this.hillvalidTo = str;
    }

    public final void setIdpcountryapplyfrom(String str) {
        this.idpcountryapplyfrom = str;
    }

    public final void setIndEmbName(String str) {
        this.indEmbName = str;
    }

    public final void setIscountryrestricted(String str) {
        this.iscountryrestricted = str;
    }

    public final void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public final void setPassno(String str) {
        this.passno = str;
    }

    public final void setPassvaltill(String str) {
        this.passvaltill = str;
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

    public final void setPofbirth(String str) {
        this.pofbirth = str;
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

    public final void setRelFirstName(String str) {
        this.relFirstName = str;
    }

    public final void setRelLastName(String str) {
        this.relLastName = str;
    }

    public final void setRelationType(String str) {
        this.relationType = str;
    }

    public final void setRtoCodeDLTr(String str) {
        this.rtoCodeDLTr = str;
    }

    public final void setTovisit(String str) {
        this.tovisit = str;
    }

    public final void setVisano(String str) {
        this.visano = str;
    }

    public final void setVisavaltill(String str) {
        this.visavaltill = str;
    }

    public final void setWilltoDonateOrgans(String str) {
        this.willtoDonateOrgans = str;
    }

    public String toString() {
        return "CombineReq(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", dleDlReasonCode=" + this.dleDlReasonCode + ", dleDlReasonName=" + this.dleDlReasonName + ", applcatgDLserReq=" + this.applcatgDLserReq + ", dlHolderAltMobMum=" + this.dlHolderAltMobMum + ", dlno=" + this.dlno + ", dob=" + this.dob + ", rtoCodeDLTr=" + this.rtoCodeDLTr + ", willtoDonateOrgans=" + this.willtoDonateOrgans + ", relationType=" + this.relationType + ", conDlReasonCode=" + this.conDlReasonCode + ", conDlReasonName=" + this.conDlReasonName + ", dlHolderNaturalName=" + this.dlHolderNaturalName + ", conEffdate=" + this.conEffdate + ", applFirstName=" + this.applFirstName + ", applLastName=" + this.applLastName + ", relFirstName=" + this.relFirstName + ", relLastName=" + this.relLastName + ", mobileNumber=" + this.mobileNumber + ", changeOfAddReq=" + this.changeOfAddReq + ", perHouseNo=" + this.perHouseNo + ", perStreet=" + this.perStreet + ", perLocation=" + this.perLocation + ", permVillageOrTown=" + this.permVillageOrTown + ", perSubDistrict=" + this.perSubDistrict + ", perDistrict=" + this.perDistrict + ", perState=" + this.perState + ", perPinCode=" + this.perPinCode + ", presHouseNo=" + this.presHouseNo + ", presStreet=" + this.presStreet + ", presLocation=" + this.presLocation + ", presVillageOrTown=" + this.presVillageOrTown + ", presSubDistrict=" + this.presSubDistrict + ", presDistrict=" + this.presDistrict + ", presState=" + this.presState + ", presPincode=" + this.presPincode + ", dupDlReasonName=" + this.dupDlReasonName + ", dupDlReasonCode=" + this.dupDlReasonCode + ", applDateOfBirth=" + this.applDateOfBirth + ", codobDlReasonName=" + this.codobDlReasonName + ", codobDlReasonCode=" + this.codobDlReasonCode + ", declaringcheck=" + this.declaringcheck + ", hillcertificate=" + this.hillcertificate + ", hillissueDate=" + this.hillissueDate + ", hillvalidFrom=" + this.hillvalidFrom + ", hillvalidTo=" + this.hillvalidTo + ", hilldrivingschool=" + this.hilldrivingschool + ", hillissby=" + this.hillissby + ", pofbirth=" + this.pofbirth + ", country=" + this.country + ", passno=" + this.passno + ", passvaltill=" + this.passvaltill + ", visano=" + this.visano + ", visavaltill=" + this.visavaltill + ", tovisit=" + this.tovisit + ", iscountryrestricted=" + this.iscountryrestricted + ", countryRestrictedReason=" + this.countryRestrictedReason + ", isDlSerdisqualified=" + this.isDlSerdisqualified + ", dlSerdisqualifiedReason=" + this.dlSerdisqualifiedReason + ", forAdd1=" + this.forAdd1 + ", forAdd2=" + this.forAdd2 + ", forAdd3=" + this.forAdd3 + ", forAddPinCode=" + this.forAddPinCode + ", forNationMobNum=" + this.forNationMobNum + ", emailID=" + this.emailID + ", appliedIdpfromIndEmb=" + this.appliedIdpfromIndEmb + ", indEmbName=" + this.indEmbName + ", embPlace=" + this.embPlace + ", dateOfVerifEmb=" + this.dateOfVerifEmb + ", embEndorseNo=" + this.embEndorseNo + ", idpcountryapplyfrom=" + this.idpcountryapplyfrom + ')';
    }

    public CombineReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73) {
        this.agentId = str;
        this.agentPwd = str2;
        this.agentIpAddress = str3;
        this.agentServiceName = str4;
        this.dleDlReasonCode = str5;
        this.dleDlReasonName = str6;
        this.applcatgDLserReq = str7;
        this.dlHolderAltMobMum = str8;
        this.dlno = str9;
        this.dob = str10;
        this.rtoCodeDLTr = str11;
        this.willtoDonateOrgans = str12;
        this.relationType = str13;
        this.conDlReasonCode = num;
        this.conDlReasonName = str14;
        this.dlHolderNaturalName = str15;
        this.conEffdate = str16;
        this.applFirstName = str17;
        this.applLastName = str18;
        this.relFirstName = str19;
        this.relLastName = str20;
        this.mobileNumber = str21;
        this.changeOfAddReq = str22;
        this.perHouseNo = str23;
        this.perStreet = str24;
        this.perLocation = str25;
        this.permVillageOrTown = str26;
        this.perSubDistrict = str27;
        this.perDistrict = str28;
        this.perState = str29;
        this.perPinCode = str30;
        this.presHouseNo = str31;
        this.presStreet = str32;
        this.presLocation = str33;
        this.presVillageOrTown = str34;
        this.presSubDistrict = str35;
        this.presDistrict = str36;
        this.presState = str37;
        this.presPincode = str38;
        this.dupDlReasonName = str39;
        this.dupDlReasonCode = str40;
        this.applDateOfBirth = str41;
        this.codobDlReasonName = str42;
        this.codobDlReasonCode = str43;
        this.declaringcheck = str44;
        this.hillcertificate = str45;
        this.hillissueDate = str46;
        this.hillvalidFrom = str47;
        this.hillvalidTo = str48;
        this.hilldrivingschool = str49;
        this.hillissby = str50;
        this.pofbirth = str51;
        this.country = str52;
        this.passno = str53;
        this.passvaltill = str54;
        this.visano = str55;
        this.visavaltill = str56;
        this.tovisit = str57;
        this.iscountryrestricted = str58;
        this.countryRestrictedReason = str59;
        this.isDlSerdisqualified = str60;
        this.dlSerdisqualifiedReason = str61;
        this.forAdd1 = str62;
        this.forAdd2 = str63;
        this.forAdd3 = str64;
        this.forAddPinCode = str65;
        this.forNationMobNum = str66;
        this.emailID = str67;
        this.appliedIdpfromIndEmb = str68;
        this.indEmbName = str69;
        this.embPlace = str70;
        this.dateOfVerifEmb = str71;
        this.embEndorseNo = str72;
        this.idpcountryapplyfrom = str73;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CombineReq(java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, java.lang.Integer r86, java.lang.String r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, java.lang.String r93, java.lang.String r94, java.lang.String r95, java.lang.String r96, java.lang.String r97, java.lang.String r98, java.lang.String r99, java.lang.String r100, java.lang.String r101, java.lang.String r102, java.lang.String r103, java.lang.String r104, java.lang.String r105, java.lang.String r106, java.lang.String r107, java.lang.String r108, java.lang.String r109, java.lang.String r110, java.lang.String r111, java.lang.String r112, java.lang.String r113, java.lang.String r114, java.lang.String r115, java.lang.String r116, java.lang.String r117, java.lang.String r118, java.lang.String r119, java.lang.String r120, java.lang.String r121, java.lang.String r122, java.lang.String r123, java.lang.String r124, java.lang.String r125, java.lang.String r126, java.lang.String r127, java.lang.String r128, java.lang.String r129, java.lang.String r130, java.lang.String r131, java.lang.String r132, java.lang.String r133, java.lang.String r134, java.lang.String r135, java.lang.String r136, java.lang.String r137, java.lang.String r138, java.lang.String r139, java.lang.String r140, java.lang.String r141, java.lang.String r142, java.lang.String r143, java.lang.String r144, java.lang.String r145, java.lang.String r146, int r147, int r148, int r149, cm.g r150) {
        /*
            r72 = this;
            r0 = r147
            r1 = r148
            r2 = r149
            r3 = r0 & 1
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x000e
            r3 = r4
            goto L_0x0010
        L_0x000e:
            r3 = r73
        L_0x0010:
            r5 = r0 & 2
            if (r5 == 0) goto L_0x0016
            r5 = r4
            goto L_0x0018
        L_0x0016:
            r5 = r74
        L_0x0018:
            r6 = r0 & 4
            if (r6 == 0) goto L_0x001e
            r6 = r4
            goto L_0x0020
        L_0x001e:
            r6 = r75
        L_0x0020:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x0026
            r7 = r4
            goto L_0x0028
        L_0x0026:
            r7 = r76
        L_0x0028:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x002e
            r8 = r4
            goto L_0x0030
        L_0x002e:
            r8 = r77
        L_0x0030:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0036
            r9 = r4
            goto L_0x0038
        L_0x0036:
            r9 = r78
        L_0x0038:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x003e
            r10 = r4
            goto L_0x0040
        L_0x003e:
            r10 = r79
        L_0x0040:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0046
            r11 = r4
            goto L_0x0048
        L_0x0046:
            r11 = r80
        L_0x0048:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x004e
            r12 = r4
            goto L_0x0050
        L_0x004e:
            r12 = r81
        L_0x0050:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0056
            r13 = r4
            goto L_0x0058
        L_0x0056:
            r13 = r82
        L_0x0058:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x005e
            r14 = r4
            goto L_0x0060
        L_0x005e:
            r14 = r83
        L_0x0060:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0066
            r15 = r4
            goto L_0x0068
        L_0x0066:
            r15 = r84
        L_0x0068:
            r150 = r4
            r4 = r0 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x0071
            r4 = r150
            goto L_0x0073
        L_0x0071:
            r4 = r85
        L_0x0073:
            r16 = r4
            r4 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x007f
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0081
        L_0x007f:
            r4 = r86
        L_0x0081:
            r17 = r4
            r4 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x008a
            r4 = r150
            goto L_0x008c
        L_0x008a:
            r4 = r87
        L_0x008c:
            r18 = 32768(0x8000, float:4.5918E-41)
            r19 = r0 & r18
            if (r19 == 0) goto L_0x0096
            r19 = r150
            goto L_0x0098
        L_0x0096:
            r19 = r88
        L_0x0098:
            r20 = 65536(0x10000, float:9.18355E-41)
            r21 = r0 & r20
            if (r21 == 0) goto L_0x00a1
            r21 = r150
            goto L_0x00a3
        L_0x00a1:
            r21 = r89
        L_0x00a3:
            r22 = 131072(0x20000, float:1.83671E-40)
            r23 = r0 & r22
            if (r23 == 0) goto L_0x00ac
            r23 = r150
            goto L_0x00ae
        L_0x00ac:
            r23 = r90
        L_0x00ae:
            r24 = 262144(0x40000, float:3.67342E-40)
            r25 = r0 & r24
            if (r25 == 0) goto L_0x00b7
            r25 = r150
            goto L_0x00b9
        L_0x00b7:
            r25 = r91
        L_0x00b9:
            r26 = 524288(0x80000, float:7.34684E-40)
            r27 = r0 & r26
            if (r27 == 0) goto L_0x00c2
            r27 = r150
            goto L_0x00c4
        L_0x00c2:
            r27 = r92
        L_0x00c4:
            r28 = 1048576(0x100000, float:1.469368E-39)
            r29 = r0 & r28
            if (r29 == 0) goto L_0x00cd
            r29 = r150
            goto L_0x00cf
        L_0x00cd:
            r29 = r93
        L_0x00cf:
            r30 = 2097152(0x200000, float:2.938736E-39)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x00d8
            r30 = r150
            goto L_0x00da
        L_0x00d8:
            r30 = r94
        L_0x00da:
            r31 = 4194304(0x400000, float:5.877472E-39)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x00e3
            r31 = r150
            goto L_0x00e5
        L_0x00e3:
            r31 = r95
        L_0x00e5:
            r32 = 8388608(0x800000, float:1.17549435E-38)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x00ee
            r32 = r150
            goto L_0x00f0
        L_0x00ee:
            r32 = r96
        L_0x00f0:
            r33 = 16777216(0x1000000, float:2.3509887E-38)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x00f9
            r33 = r150
            goto L_0x00fb
        L_0x00f9:
            r33 = r97
        L_0x00fb:
            r34 = 33554432(0x2000000, float:9.403955E-38)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x0104
            r34 = r150
            goto L_0x0106
        L_0x0104:
            r34 = r98
        L_0x0106:
            r35 = 67108864(0x4000000, float:1.5046328E-36)
            r35 = r0 & r35
            if (r35 == 0) goto L_0x010f
            r35 = r150
            goto L_0x0111
        L_0x010f:
            r35 = r99
        L_0x0111:
            r36 = 134217728(0x8000000, float:3.85186E-34)
            r36 = r0 & r36
            if (r36 == 0) goto L_0x011a
            r36 = r150
            goto L_0x011c
        L_0x011a:
            r36 = r100
        L_0x011c:
            r37 = 268435456(0x10000000, float:2.5243549E-29)
            r37 = r0 & r37
            if (r37 == 0) goto L_0x0125
            r37 = r150
            goto L_0x0127
        L_0x0125:
            r37 = r101
        L_0x0127:
            r38 = 536870912(0x20000000, float:1.0842022E-19)
            r38 = r0 & r38
            if (r38 == 0) goto L_0x0130
            r38 = r150
            goto L_0x0132
        L_0x0130:
            r38 = r102
        L_0x0132:
            r39 = 1073741824(0x40000000, float:2.0)
            r39 = r0 & r39
            if (r39 == 0) goto L_0x013b
            r39 = r150
            goto L_0x013d
        L_0x013b:
            r39 = r103
        L_0x013d:
            r40 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r40
            if (r0 == 0) goto L_0x0146
            r0 = r150
            goto L_0x0148
        L_0x0146:
            r0 = r104
        L_0x0148:
            r40 = r1 & 1
            if (r40 == 0) goto L_0x014f
            r40 = r150
            goto L_0x0151
        L_0x014f:
            r40 = r105
        L_0x0151:
            r41 = r1 & 2
            if (r41 == 0) goto L_0x0158
            r41 = r150
            goto L_0x015a
        L_0x0158:
            r41 = r106
        L_0x015a:
            r42 = r1 & 4
            if (r42 == 0) goto L_0x0161
            r42 = r150
            goto L_0x0163
        L_0x0161:
            r42 = r107
        L_0x0163:
            r43 = r1 & 8
            if (r43 == 0) goto L_0x016a
            r43 = r150
            goto L_0x016c
        L_0x016a:
            r43 = r108
        L_0x016c:
            r44 = r1 & 16
            if (r44 == 0) goto L_0x0173
            r44 = r150
            goto L_0x0175
        L_0x0173:
            r44 = r109
        L_0x0175:
            r45 = r1 & 32
            if (r45 == 0) goto L_0x017c
            r45 = r150
            goto L_0x017e
        L_0x017c:
            r45 = r110
        L_0x017e:
            r46 = r1 & 64
            if (r46 == 0) goto L_0x0185
            r46 = r150
            goto L_0x0187
        L_0x0185:
            r46 = r111
        L_0x0187:
            r147 = r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0190
            r0 = r150
            goto L_0x0192
        L_0x0190:
            r0 = r112
        L_0x0192:
            r47 = r0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x019b
            r0 = r150
            goto L_0x019d
        L_0x019b:
            r0 = r113
        L_0x019d:
            r48 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01a6
            r0 = r150
            goto L_0x01a8
        L_0x01a6:
            r0 = r114
        L_0x01a8:
            r49 = r0
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x01b1
            r0 = r150
            goto L_0x01b3
        L_0x01b1:
            r0 = r115
        L_0x01b3:
            r50 = r0
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01bc
            r0 = r150
            goto L_0x01be
        L_0x01bc:
            r0 = r116
        L_0x01be:
            r51 = r0
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01c7
            r0 = r150
            goto L_0x01c9
        L_0x01c7:
            r0 = r117
        L_0x01c9:
            r52 = r0
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x01d2
            r0 = r150
            goto L_0x01d4
        L_0x01d2:
            r0 = r118
        L_0x01d4:
            r53 = r0
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x01dd
            r0 = r150
            goto L_0x01df
        L_0x01dd:
            r0 = r119
        L_0x01df:
            r18 = r1 & r18
            if (r18 == 0) goto L_0x01e6
            r18 = r150
            goto L_0x01e8
        L_0x01e6:
            r18 = r120
        L_0x01e8:
            r20 = r1 & r20
            if (r20 == 0) goto L_0x01ef
            r20 = r150
            goto L_0x01f1
        L_0x01ef:
            r20 = r121
        L_0x01f1:
            r22 = r1 & r22
            if (r22 == 0) goto L_0x01f8
            r22 = r150
            goto L_0x01fa
        L_0x01f8:
            r22 = r122
        L_0x01fa:
            r24 = r1 & r24
            if (r24 == 0) goto L_0x0201
            r24 = r150
            goto L_0x0203
        L_0x0201:
            r24 = r123
        L_0x0203:
            r26 = r1 & r26
            if (r26 == 0) goto L_0x020a
            r26 = r150
            goto L_0x020c
        L_0x020a:
            r26 = r124
        L_0x020c:
            r28 = r1 & r28
            if (r28 == 0) goto L_0x0213
            r28 = r150
            goto L_0x0215
        L_0x0213:
            r28 = r125
        L_0x0215:
            r54 = 2097152(0x200000, float:2.938736E-39)
            r54 = r1 & r54
            if (r54 == 0) goto L_0x021e
            r54 = r150
            goto L_0x0220
        L_0x021e:
            r54 = r126
        L_0x0220:
            r55 = 4194304(0x400000, float:5.877472E-39)
            r55 = r1 & r55
            if (r55 == 0) goto L_0x0229
            r55 = r150
            goto L_0x022b
        L_0x0229:
            r55 = r127
        L_0x022b:
            r56 = 8388608(0x800000, float:1.17549435E-38)
            r56 = r1 & r56
            if (r56 == 0) goto L_0x0234
            r56 = r150
            goto L_0x0236
        L_0x0234:
            r56 = r128
        L_0x0236:
            r57 = 16777216(0x1000000, float:2.3509887E-38)
            r57 = r1 & r57
            if (r57 == 0) goto L_0x023f
            r57 = r150
            goto L_0x0241
        L_0x023f:
            r57 = r129
        L_0x0241:
            r58 = 33554432(0x2000000, float:9.403955E-38)
            r58 = r1 & r58
            if (r58 == 0) goto L_0x024a
            r58 = r150
            goto L_0x024c
        L_0x024a:
            r58 = r130
        L_0x024c:
            r59 = 67108864(0x4000000, float:1.5046328E-36)
            r59 = r1 & r59
            if (r59 == 0) goto L_0x0255
            r59 = r150
            goto L_0x0257
        L_0x0255:
            r59 = r131
        L_0x0257:
            r60 = 134217728(0x8000000, float:3.85186E-34)
            r60 = r1 & r60
            if (r60 == 0) goto L_0x0260
            r60 = r150
            goto L_0x0262
        L_0x0260:
            r60 = r132
        L_0x0262:
            r61 = 268435456(0x10000000, float:2.5243549E-29)
            r61 = r1 & r61
            if (r61 == 0) goto L_0x026b
            r61 = r150
            goto L_0x026d
        L_0x026b:
            r61 = r133
        L_0x026d:
            r62 = 536870912(0x20000000, float:1.0842022E-19)
            r62 = r1 & r62
            if (r62 == 0) goto L_0x0276
            r62 = r150
            goto L_0x0278
        L_0x0276:
            r62 = r134
        L_0x0278:
            r63 = 1073741824(0x40000000, float:2.0)
            r63 = r1 & r63
            if (r63 == 0) goto L_0x0281
            r63 = r150
            goto L_0x0283
        L_0x0281:
            r63 = r135
        L_0x0283:
            r64 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r64
            if (r1 == 0) goto L_0x028c
            r1 = r150
            goto L_0x028e
        L_0x028c:
            r1 = r136
        L_0x028e:
            r64 = r2 & 1
            if (r64 == 0) goto L_0x0295
            r64 = r150
            goto L_0x0297
        L_0x0295:
            r64 = r137
        L_0x0297:
            r65 = r2 & 2
            if (r65 == 0) goto L_0x029e
            r65 = r150
            goto L_0x02a0
        L_0x029e:
            r65 = r138
        L_0x02a0:
            r66 = r2 & 4
            if (r66 == 0) goto L_0x02a7
            r66 = r150
            goto L_0x02a9
        L_0x02a7:
            r66 = r139
        L_0x02a9:
            r67 = r2 & 8
            if (r67 == 0) goto L_0x02b0
            r67 = r150
            goto L_0x02b2
        L_0x02b0:
            r67 = r140
        L_0x02b2:
            r68 = r2 & 16
            if (r68 == 0) goto L_0x02b9
            r68 = r150
            goto L_0x02bb
        L_0x02b9:
            r68 = r141
        L_0x02bb:
            r69 = r2 & 32
            if (r69 == 0) goto L_0x02c2
            r69 = r150
            goto L_0x02c4
        L_0x02c2:
            r69 = r142
        L_0x02c4:
            r70 = r2 & 64
            if (r70 == 0) goto L_0x02cb
            r70 = r150
            goto L_0x02cd
        L_0x02cb:
            r70 = r143
        L_0x02cd:
            r148 = r1
            r1 = r2 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x02d6
            r1 = r150
            goto L_0x02d8
        L_0x02d6:
            r1 = r144
        L_0x02d8:
            r71 = r1
            r1 = r2 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x02e1
            r1 = r150
            goto L_0x02e3
        L_0x02e1:
            r1 = r145
        L_0x02e3:
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x02ea
            r2 = r150
            goto L_0x02ec
        L_0x02ea:
            r2 = r146
        L_0x02ec:
            r73 = r72
            r74 = r3
            r75 = r5
            r76 = r6
            r77 = r7
            r78 = r8
            r79 = r9
            r80 = r10
            r81 = r11
            r82 = r12
            r83 = r13
            r84 = r14
            r85 = r15
            r86 = r16
            r87 = r17
            r88 = r4
            r89 = r19
            r90 = r21
            r91 = r23
            r92 = r25
            r93 = r27
            r94 = r29
            r95 = r30
            r96 = r31
            r97 = r32
            r98 = r33
            r99 = r34
            r100 = r35
            r101 = r36
            r102 = r37
            r103 = r38
            r104 = r39
            r105 = r147
            r106 = r40
            r107 = r41
            r108 = r42
            r109 = r43
            r110 = r44
            r111 = r45
            r112 = r46
            r113 = r47
            r114 = r48
            r115 = r49
            r116 = r50
            r117 = r51
            r118 = r52
            r119 = r53
            r120 = r0
            r121 = r18
            r122 = r20
            r123 = r22
            r124 = r24
            r125 = r26
            r126 = r28
            r127 = r54
            r128 = r55
            r129 = r56
            r130 = r57
            r131 = r58
            r132 = r59
            r133 = r60
            r134 = r61
            r135 = r62
            r136 = r63
            r137 = r148
            r138 = r64
            r139 = r65
            r140 = r66
            r141 = r67
            r142 = r68
            r143 = r69
            r144 = r70
            r145 = r71
            r146 = r1
            r147 = r2
            r73.<init>(r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DlCombineServices.CombineReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, cm.g):void");
    }
}
