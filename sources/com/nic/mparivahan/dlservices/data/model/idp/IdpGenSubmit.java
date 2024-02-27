package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class IdpGenSubmit {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String appliedIdpfromIndEmb;
    private final String country;
    private final String countryRestrictedReason;
    private final ArrayList<String> cov_req;
    private String dateOfVerifEmb;
    private final String dlSerdisqualifiedReason;
    private String dlno;
    private String dob;
    private String emailID;
    private String embEndorseNo;
    private final String embPlace;
    private final String forAdd1;
    private String forAdd2;
    private String forAdd3;
    private final String forAddPinCode;
    private String forNationMobNum;
    private String idpcountryapplyfrom;
    private String indEmbName;
    private String isDlSerdisqualified;
    private String iscountryrestricted;
    private String mobileNumber;
    private String passno;
    private final String passvaltill;
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
    private final String rtoCodeDLTr;
    private selectDLlist selectedDLSerList;
    private String tovisit;
    private String visano;
    private String visavaltill;

    public IdpGenSubmit(String str, String str2, String str3, selectDLlist selectdllist, String str4, String str5, String str6, String str7, String str8, String str9, ArrayList<String> arrayList, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47) {
        String str48 = str;
        String str49 = str2;
        String str50 = str3;
        selectDLlist selectdllist2 = selectdllist;
        String str51 = str4;
        String str52 = str5;
        String str53 = str6;
        String str54 = str7;
        String str55 = str8;
        String str56 = str9;
        ArrayList<String> arrayList2 = arrayList;
        String str57 = str10;
        String str58 = str11;
        String str59 = str12;
        String str60 = str14;
        l.f(str48, "dlno");
        l.f(str49, "dob");
        l.f(str50, "rtoCodeDLTr");
        l.f(selectdllist2, "selectedDLSerList");
        l.f(str51, "pofbirth");
        l.f(str52, "country");
        l.f(str53, "passno");
        l.f(str54, "passvaltill");
        l.f(str55, "visano");
        l.f(str56, "visavaltill");
        l.f(arrayList2, "cov_req");
        l.f(str57, "tovisit");
        l.f(str58, "iscountryrestricted");
        l.f(str59, "countryRestrictedReason");
        l.f(str13, "isDlSerdisqualified");
        l.f(str14, "dlSerdisqualifiedReason");
        l.f(str30, "agentServiceName");
        l.f(str31, "presHouseNo");
        l.f(str32, "presStreet");
        l.f(str33, "presLocation");
        l.f(str34, "presVillageOrTown");
        l.f(str35, "presSubDistrict");
        l.f(str36, "presDistrict");
        l.f(str37, "presState");
        l.f(str38, "presPincode");
        l.f(str39, "perHouseNo");
        l.f(str40, "perStreet");
        l.f(str41, "perLocation");
        l.f(str42, "permVillageOrTown");
        l.f(str43, "perSubDistrict");
        l.f(str44, "perDistrict");
        l.f(str45, "perState");
        l.f(str46, "perPinCode");
        l.f(str47, "mobileNumber");
        this.dlno = str48;
        this.dob = str49;
        this.rtoCodeDLTr = str50;
        this.selectedDLSerList = selectdllist2;
        this.pofbirth = str51;
        this.country = str52;
        this.passno = str53;
        this.passvaltill = str54;
        this.visano = str55;
        this.visavaltill = str56;
        this.cov_req = arrayList2;
        this.tovisit = str57;
        this.iscountryrestricted = str58;
        this.countryRestrictedReason = str59;
        this.isDlSerdisqualified = str13;
        this.dlSerdisqualifiedReason = str14;
        this.forAdd1 = str15;
        this.forAdd2 = str16;
        this.forAdd3 = str17;
        this.forAddPinCode = str18;
        this.forNationMobNum = str19;
        this.emailID = str20;
        this.appliedIdpfromIndEmb = str21;
        this.indEmbName = str22;
        this.embPlace = str23;
        this.dateOfVerifEmb = str24;
        this.embEndorseNo = str25;
        this.idpcountryapplyfrom = str26;
        this.agentId = str27;
        this.agentPwd = str28;
        this.agentIpAddress = str29;
        this.agentServiceName = str30;
        this.presHouseNo = str31;
        this.presStreet = str32;
        this.presLocation = str33;
        this.presVillageOrTown = str34;
        this.presSubDistrict = str35;
        this.presDistrict = str36;
        this.presState = str37;
        this.presPincode = str38;
        this.perHouseNo = str39;
        this.perStreet = str40;
        this.perLocation = str41;
        this.permVillageOrTown = str42;
        this.perSubDistrict = str43;
        this.perDistrict = str44;
        this.perState = str45;
        this.perPinCode = str46;
        this.mobileNumber = str47;
    }

    public static /* synthetic */ IdpGenSubmit copy$default(IdpGenSubmit idpGenSubmit, String str, String str2, String str3, selectDLlist selectdllist, String str4, String str5, String str6, String str7, String str8, String str9, ArrayList arrayList, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, int i10, int i11, Object obj) {
        IdpGenSubmit idpGenSubmit2 = idpGenSubmit;
        int i12 = i10;
        int i13 = i11;
        return idpGenSubmit.copy((i12 & 1) != 0 ? idpGenSubmit2.dlno : str, (i12 & 2) != 0 ? idpGenSubmit2.dob : str2, (i12 & 4) != 0 ? idpGenSubmit2.rtoCodeDLTr : str3, (i12 & 8) != 0 ? idpGenSubmit2.selectedDLSerList : selectdllist, (i12 & 16) != 0 ? idpGenSubmit2.pofbirth : str4, (i12 & 32) != 0 ? idpGenSubmit2.country : str5, (i12 & 64) != 0 ? idpGenSubmit2.passno : str6, (i12 & 128) != 0 ? idpGenSubmit2.passvaltill : str7, (i12 & 256) != 0 ? idpGenSubmit2.visano : str8, (i12 & 512) != 0 ? idpGenSubmit2.visavaltill : str9, (i12 & 1024) != 0 ? idpGenSubmit2.cov_req : arrayList, (i12 & 2048) != 0 ? idpGenSubmit2.tovisit : str10, (i12 & 4096) != 0 ? idpGenSubmit2.iscountryrestricted : str11, (i12 & 8192) != 0 ? idpGenSubmit2.countryRestrictedReason : str12, (i12 & 16384) != 0 ? idpGenSubmit2.isDlSerdisqualified : str13, (i12 & 32768) != 0 ? idpGenSubmit2.dlSerdisqualifiedReason : str14, (i12 & 65536) != 0 ? idpGenSubmit2.forAdd1 : str15, (i12 & 131072) != 0 ? idpGenSubmit2.forAdd2 : str16, (i12 & 262144) != 0 ? idpGenSubmit2.forAdd3 : str17, (i12 & 524288) != 0 ? idpGenSubmit2.forAddPinCode : str18, (i12 & 1048576) != 0 ? idpGenSubmit2.forNationMobNum : str19, (i12 & 2097152) != 0 ? idpGenSubmit2.emailID : str20, (i12 & 4194304) != 0 ? idpGenSubmit2.appliedIdpfromIndEmb : str21, (i12 & 8388608) != 0 ? idpGenSubmit2.indEmbName : str22, (i12 & 16777216) != 0 ? idpGenSubmit2.embPlace : str23, (i12 & 33554432) != 0 ? idpGenSubmit2.dateOfVerifEmb : str24, (i12 & 67108864) != 0 ? idpGenSubmit2.embEndorseNo : str25, (i12 & 134217728) != 0 ? idpGenSubmit2.idpcountryapplyfrom : str26, (i12 & 268435456) != 0 ? idpGenSubmit2.agentId : str27, (i12 & 536870912) != 0 ? idpGenSubmit2.agentPwd : str28, (i12 & 1073741824) != 0 ? idpGenSubmit2.agentIpAddress : str29, (i12 & Integer.MIN_VALUE) != 0 ? idpGenSubmit2.agentServiceName : str30, (i13 & 1) != 0 ? idpGenSubmit2.presHouseNo : str31, (i13 & 2) != 0 ? idpGenSubmit2.presStreet : str32, (i13 & 4) != 0 ? idpGenSubmit2.presLocation : str33, (i13 & 8) != 0 ? idpGenSubmit2.presVillageOrTown : str34, (i13 & 16) != 0 ? idpGenSubmit2.presSubDistrict : str35, (i13 & 32) != 0 ? idpGenSubmit2.presDistrict : str36, (i13 & 64) != 0 ? idpGenSubmit2.presState : str37, (i13 & 128) != 0 ? idpGenSubmit2.presPincode : str38, (i13 & 256) != 0 ? idpGenSubmit2.perHouseNo : str39, (i13 & 512) != 0 ? idpGenSubmit2.perStreet : str40, (i13 & 1024) != 0 ? idpGenSubmit2.perLocation : str41, (i13 & 2048) != 0 ? idpGenSubmit2.permVillageOrTown : str42, (i13 & 4096) != 0 ? idpGenSubmit2.perSubDistrict : str43, (i13 & 8192) != 0 ? idpGenSubmit2.perDistrict : str44, (i13 & 16384) != 0 ? idpGenSubmit2.perState : str45, (i13 & 32768) != 0 ? idpGenSubmit2.perPinCode : str46, (i13 & 65536) != 0 ? idpGenSubmit2.mobileNumber : str47);
    }

    public final String component1() {
        return this.dlno;
    }

    public final String component10() {
        return this.visavaltill;
    }

    public final ArrayList<String> component11() {
        return this.cov_req;
    }

    public final String component12() {
        return this.tovisit;
    }

    public final String component13() {
        return this.iscountryrestricted;
    }

    public final String component14() {
        return this.countryRestrictedReason;
    }

    public final String component15() {
        return this.isDlSerdisqualified;
    }

    public final String component16() {
        return this.dlSerdisqualifiedReason;
    }

    public final String component17() {
        return this.forAdd1;
    }

    public final String component18() {
        return this.forAdd2;
    }

    public final String component19() {
        return this.forAdd3;
    }

    public final String component2() {
        return this.dob;
    }

    public final String component20() {
        return this.forAddPinCode;
    }

    public final String component21() {
        return this.forNationMobNum;
    }

    public final String component22() {
        return this.emailID;
    }

    public final String component23() {
        return this.appliedIdpfromIndEmb;
    }

    public final String component24() {
        return this.indEmbName;
    }

    public final String component25() {
        return this.embPlace;
    }

    public final String component26() {
        return this.dateOfVerifEmb;
    }

    public final String component27() {
        return this.embEndorseNo;
    }

    public final String component28() {
        return this.idpcountryapplyfrom;
    }

    public final String component29() {
        return this.agentId;
    }

    public final String component3() {
        return this.rtoCodeDLTr;
    }

    public final String component30() {
        return this.agentPwd;
    }

    public final String component31() {
        return this.agentIpAddress;
    }

    public final String component32() {
        return this.agentServiceName;
    }

    public final String component33() {
        return this.presHouseNo;
    }

    public final String component34() {
        return this.presStreet;
    }

    public final String component35() {
        return this.presLocation;
    }

    public final String component36() {
        return this.presVillageOrTown;
    }

    public final String component37() {
        return this.presSubDistrict;
    }

    public final String component38() {
        return this.presDistrict;
    }

    public final String component39() {
        return this.presState;
    }

    public final selectDLlist component4() {
        return this.selectedDLSerList;
    }

    public final String component40() {
        return this.presPincode;
    }

    public final String component41() {
        return this.perHouseNo;
    }

    public final String component42() {
        return this.perStreet;
    }

    public final String component43() {
        return this.perLocation;
    }

    public final String component44() {
        return this.permVillageOrTown;
    }

    public final String component45() {
        return this.perSubDistrict;
    }

    public final String component46() {
        return this.perDistrict;
    }

    public final String component47() {
        return this.perState;
    }

    public final String component48() {
        return this.perPinCode;
    }

    public final String component49() {
        return this.mobileNumber;
    }

    public final String component5() {
        return this.pofbirth;
    }

    public final String component6() {
        return this.country;
    }

    public final String component7() {
        return this.passno;
    }

    public final String component8() {
        return this.passvaltill;
    }

    public final String component9() {
        return this.visano;
    }

    public final IdpGenSubmit copy(String str, String str2, String str3, selectDLlist selectdllist, String str4, String str5, String str6, String str7, String str8, String str9, ArrayList<String> arrayList, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47) {
        String str48 = str;
        l.f(str48, "dlno");
        l.f(str2, "dob");
        l.f(str3, "rtoCodeDLTr");
        l.f(selectdllist, "selectedDLSerList");
        l.f(str4, "pofbirth");
        l.f(str5, "country");
        l.f(str6, "passno");
        l.f(str7, "passvaltill");
        l.f(str8, "visano");
        l.f(str9, "visavaltill");
        l.f(arrayList, "cov_req");
        l.f(str10, "tovisit");
        l.f(str11, "iscountryrestricted");
        l.f(str12, "countryRestrictedReason");
        l.f(str13, "isDlSerdisqualified");
        l.f(str14, "dlSerdisqualifiedReason");
        l.f(str30, "agentServiceName");
        l.f(str31, "presHouseNo");
        l.f(str32, "presStreet");
        l.f(str33, "presLocation");
        l.f(str34, "presVillageOrTown");
        l.f(str35, "presSubDistrict");
        l.f(str36, "presDistrict");
        l.f(str37, "presState");
        l.f(str38, "presPincode");
        l.f(str39, "perHouseNo");
        l.f(str40, "perStreet");
        l.f(str41, "perLocation");
        l.f(str42, "permVillageOrTown");
        l.f(str43, "perSubDistrict");
        l.f(str44, "perDistrict");
        l.f(str45, "perState");
        l.f(str46, "perPinCode");
        l.f(str47, "mobileNumber");
        return new IdpGenSubmit(str48, str2, str3, selectdllist, str4, str5, str6, str7, str8, str9, arrayList, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdpGenSubmit)) {
            return false;
        }
        IdpGenSubmit idpGenSubmit = (IdpGenSubmit) obj;
        return l.a(this.dlno, idpGenSubmit.dlno) && l.a(this.dob, idpGenSubmit.dob) && l.a(this.rtoCodeDLTr, idpGenSubmit.rtoCodeDLTr) && l.a(this.selectedDLSerList, idpGenSubmit.selectedDLSerList) && l.a(this.pofbirth, idpGenSubmit.pofbirth) && l.a(this.country, idpGenSubmit.country) && l.a(this.passno, idpGenSubmit.passno) && l.a(this.passvaltill, idpGenSubmit.passvaltill) && l.a(this.visano, idpGenSubmit.visano) && l.a(this.visavaltill, idpGenSubmit.visavaltill) && l.a(this.cov_req, idpGenSubmit.cov_req) && l.a(this.tovisit, idpGenSubmit.tovisit) && l.a(this.iscountryrestricted, idpGenSubmit.iscountryrestricted) && l.a(this.countryRestrictedReason, idpGenSubmit.countryRestrictedReason) && l.a(this.isDlSerdisqualified, idpGenSubmit.isDlSerdisqualified) && l.a(this.dlSerdisqualifiedReason, idpGenSubmit.dlSerdisqualifiedReason) && l.a(this.forAdd1, idpGenSubmit.forAdd1) && l.a(this.forAdd2, idpGenSubmit.forAdd2) && l.a(this.forAdd3, idpGenSubmit.forAdd3) && l.a(this.forAddPinCode, idpGenSubmit.forAddPinCode) && l.a(this.forNationMobNum, idpGenSubmit.forNationMobNum) && l.a(this.emailID, idpGenSubmit.emailID) && l.a(this.appliedIdpfromIndEmb, idpGenSubmit.appliedIdpfromIndEmb) && l.a(this.indEmbName, idpGenSubmit.indEmbName) && l.a(this.embPlace, idpGenSubmit.embPlace) && l.a(this.dateOfVerifEmb, idpGenSubmit.dateOfVerifEmb) && l.a(this.embEndorseNo, idpGenSubmit.embEndorseNo) && l.a(this.idpcountryapplyfrom, idpGenSubmit.idpcountryapplyfrom) && l.a(this.agentId, idpGenSubmit.agentId) && l.a(this.agentPwd, idpGenSubmit.agentPwd) && l.a(this.agentIpAddress, idpGenSubmit.agentIpAddress) && l.a(this.agentServiceName, idpGenSubmit.agentServiceName) && l.a(this.presHouseNo, idpGenSubmit.presHouseNo) && l.a(this.presStreet, idpGenSubmit.presStreet) && l.a(this.presLocation, idpGenSubmit.presLocation) && l.a(this.presVillageOrTown, idpGenSubmit.presVillageOrTown) && l.a(this.presSubDistrict, idpGenSubmit.presSubDistrict) && l.a(this.presDistrict, idpGenSubmit.presDistrict) && l.a(this.presState, idpGenSubmit.presState) && l.a(this.presPincode, idpGenSubmit.presPincode) && l.a(this.perHouseNo, idpGenSubmit.perHouseNo) && l.a(this.perStreet, idpGenSubmit.perStreet) && l.a(this.perLocation, idpGenSubmit.perLocation) && l.a(this.permVillageOrTown, idpGenSubmit.permVillageOrTown) && l.a(this.perSubDistrict, idpGenSubmit.perSubDistrict) && l.a(this.perDistrict, idpGenSubmit.perDistrict) && l.a(this.perState, idpGenSubmit.perState) && l.a(this.perPinCode, idpGenSubmit.perPinCode) && l.a(this.mobileNumber, idpGenSubmit.mobileNumber);
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

    public final String getAppliedIdpfromIndEmb() {
        return this.appliedIdpfromIndEmb;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCountryRestrictedReason() {
        return this.countryRestrictedReason;
    }

    public final ArrayList<String> getCov_req() {
        return this.cov_req;
    }

    public final String getDateOfVerifEmb() {
        return this.dateOfVerifEmb;
    }

    public final String getDlSerdisqualifiedReason() {
        return this.dlSerdisqualifiedReason;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDob() {
        return this.dob;
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

    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    public final selectDLlist getSelectedDLSerList() {
        return this.selectedDLSerList;
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

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((this.dlno.hashCode() * 31) + this.dob.hashCode()) * 31) + this.rtoCodeDLTr.hashCode()) * 31) + this.selectedDLSerList.hashCode()) * 31) + this.pofbirth.hashCode()) * 31) + this.country.hashCode()) * 31) + this.passno.hashCode()) * 31) + this.passvaltill.hashCode()) * 31) + this.visano.hashCode()) * 31) + this.visavaltill.hashCode()) * 31) + this.cov_req.hashCode()) * 31) + this.tovisit.hashCode()) * 31) + this.iscountryrestricted.hashCode()) * 31) + this.countryRestrictedReason.hashCode()) * 31) + this.isDlSerdisqualified.hashCode()) * 31) + this.dlSerdisqualifiedReason.hashCode()) * 31;
        String str = this.forAdd1;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.forAdd2;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.forAdd3;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.forAddPinCode;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.forNationMobNum;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.emailID;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.appliedIdpfromIndEmb;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.indEmbName;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.embPlace;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.dateOfVerifEmb;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.embEndorseNo;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.idpcountryapplyfrom;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.agentId;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.agentPwd;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.agentIpAddress;
        if (str15 != null) {
            i10 = str15.hashCode();
        }
        return ((((((((((((((((((((((((((((((((((((hashCode15 + i10) * 31) + this.agentServiceName.hashCode()) * 31) + this.presHouseNo.hashCode()) * 31) + this.presStreet.hashCode()) * 31) + this.presLocation.hashCode()) * 31) + this.presVillageOrTown.hashCode()) * 31) + this.presSubDistrict.hashCode()) * 31) + this.presDistrict.hashCode()) * 31) + this.presState.hashCode()) * 31) + this.presPincode.hashCode()) * 31) + this.perHouseNo.hashCode()) * 31) + this.perStreet.hashCode()) * 31) + this.perLocation.hashCode()) * 31) + this.permVillageOrTown.hashCode()) * 31) + this.perSubDistrict.hashCode()) * 31) + this.perDistrict.hashCode()) * 31) + this.perState.hashCode()) * 31) + this.perPinCode.hashCode()) * 31) + this.mobileNumber.hashCode();
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
        l.f(str, "<set-?>");
        this.agentServiceName = str;
    }

    public final void setAppliedIdpfromIndEmb(String str) {
        this.appliedIdpfromIndEmb = str;
    }

    public final void setDateOfVerifEmb(String str) {
        this.dateOfVerifEmb = str;
    }

    public final void setDlSerdisqualified(String str) {
        l.f(str, "<set-?>");
        this.isDlSerdisqualified = str;
    }

    public final void setDlno(String str) {
        l.f(str, "<set-?>");
        this.dlno = str;
    }

    public final void setDob(String str) {
        l.f(str, "<set-?>");
        this.dob = str;
    }

    public final void setEmailID(String str) {
        this.emailID = str;
    }

    public final void setEmbEndorseNo(String str) {
        this.embEndorseNo = str;
    }

    public final void setForAdd2(String str) {
        this.forAdd2 = str;
    }

    public final void setForAdd3(String str) {
        this.forAdd3 = str;
    }

    public final void setForNationMobNum(String str) {
        this.forNationMobNum = str;
    }

    public final void setIdpcountryapplyfrom(String str) {
        this.idpcountryapplyfrom = str;
    }

    public final void setIndEmbName(String str) {
        this.indEmbName = str;
    }

    public final void setIscountryrestricted(String str) {
        l.f(str, "<set-?>");
        this.iscountryrestricted = str;
    }

    public final void setMobileNumber(String str) {
        l.f(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void setPassno(String str) {
        l.f(str, "<set-?>");
        this.passno = str;
    }

    public final void setPerDistrict(String str) {
        l.f(str, "<set-?>");
        this.perDistrict = str;
    }

    public final void setPerHouseNo(String str) {
        l.f(str, "<set-?>");
        this.perHouseNo = str;
    }

    public final void setPerLocation(String str) {
        l.f(str, "<set-?>");
        this.perLocation = str;
    }

    public final void setPerPinCode(String str) {
        l.f(str, "<set-?>");
        this.perPinCode = str;
    }

    public final void setPerState(String str) {
        l.f(str, "<set-?>");
        this.perState = str;
    }

    public final void setPerStreet(String str) {
        l.f(str, "<set-?>");
        this.perStreet = str;
    }

    public final void setPerSubDistrict(String str) {
        l.f(str, "<set-?>");
        this.perSubDistrict = str;
    }

    public final void setPermVillageOrTown(String str) {
        l.f(str, "<set-?>");
        this.permVillageOrTown = str;
    }

    public final void setPofbirth(String str) {
        l.f(str, "<set-?>");
        this.pofbirth = str;
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

    public final void setPresPincode(String str) {
        l.f(str, "<set-?>");
        this.presPincode = str;
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

    public final void setSelectedDLSerList(selectDLlist selectdllist) {
        l.f(selectdllist, "<set-?>");
        this.selectedDLSerList = selectdllist;
    }

    public final void setTovisit(String str) {
        l.f(str, "<set-?>");
        this.tovisit = str;
    }

    public final void setVisano(String str) {
        l.f(str, "<set-?>");
        this.visano = str;
    }

    public final void setVisavaltill(String str) {
        l.f(str, "<set-?>");
        this.visavaltill = str;
    }

    public String toString() {
        return "IdpGenSubmit(dlno=" + this.dlno + ", dob=" + this.dob + ", rtoCodeDLTr=" + this.rtoCodeDLTr + ", selectedDLSerList=" + this.selectedDLSerList + ", pofbirth=" + this.pofbirth + ", country=" + this.country + ", passno=" + this.passno + ", passvaltill=" + this.passvaltill + ", visano=" + this.visano + ", visavaltill=" + this.visavaltill + ", cov_req=" + this.cov_req + ", tovisit=" + this.tovisit + ", iscountryrestricted=" + this.iscountryrestricted + ", countryRestrictedReason=" + this.countryRestrictedReason + ", isDlSerdisqualified=" + this.isDlSerdisqualified + ", dlSerdisqualifiedReason=" + this.dlSerdisqualifiedReason + ", forAdd1=" + this.forAdd1 + ", forAdd2=" + this.forAdd2 + ", forAdd3=" + this.forAdd3 + ", forAddPinCode=" + this.forAddPinCode + ", forNationMobNum=" + this.forNationMobNum + ", emailID=" + this.emailID + ", appliedIdpfromIndEmb=" + this.appliedIdpfromIndEmb + ", indEmbName=" + this.indEmbName + ", embPlace=" + this.embPlace + ", dateOfVerifEmb=" + this.dateOfVerifEmb + ", embEndorseNo=" + this.embEndorseNo + ", idpcountryapplyfrom=" + this.idpcountryapplyfrom + ", agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", presHouseNo=" + this.presHouseNo + ", presStreet=" + this.presStreet + ", presLocation=" + this.presLocation + ", presVillageOrTown=" + this.presVillageOrTown + ", presSubDistrict=" + this.presSubDistrict + ", presDistrict=" + this.presDistrict + ", presState=" + this.presState + ", presPincode=" + this.presPincode + ", perHouseNo=" + this.perHouseNo + ", perStreet=" + this.perStreet + ", perLocation=" + this.perLocation + ", permVillageOrTown=" + this.permVillageOrTown + ", perSubDistrict=" + this.perSubDistrict + ", perDistrict=" + this.perDistrict + ", perState=" + this.perState + ", perPinCode=" + this.perPinCode + ", mobileNumber=" + this.mobileNumber + ')';
    }
}
