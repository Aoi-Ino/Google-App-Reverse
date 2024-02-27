package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class IdpSubmitRequest {
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
    private String pofbirth;
    private final String rtoCodeDLTr;
    private selectDLlist selectedDLSerList;
    private String tovisit;
    private String visano;
    private String visavaltill;

    public IdpSubmitRequest(String str, String str2, String str3, selectDLlist selectdllist, String str4, String str5, String str6, String str7, String str8, String str9, ArrayList<String> arrayList, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31) {
        String str32 = str;
        String str33 = str2;
        String str34 = str3;
        selectDLlist selectdllist2 = selectdllist;
        String str35 = str4;
        String str36 = str5;
        String str37 = str6;
        String str38 = str7;
        String str39 = str8;
        String str40 = str9;
        ArrayList<String> arrayList2 = arrayList;
        String str41 = str10;
        String str42 = str11;
        String str43 = str12;
        String str44 = str14;
        l.f(str32, "dlno");
        l.f(str33, "dob");
        l.f(str34, "rtoCodeDLTr");
        l.f(selectdllist2, "selectedDLSerList");
        l.f(str35, "pofbirth");
        l.f(str36, "country");
        l.f(str37, "passno");
        l.f(str38, "passvaltill");
        l.f(str39, "visano");
        l.f(str40, "visavaltill");
        l.f(arrayList2, "cov_req");
        l.f(str41, "tovisit");
        l.f(str42, "iscountryrestricted");
        l.f(str43, "countryRestrictedReason");
        l.f(str13, "isDlSerdisqualified");
        l.f(str14, "dlSerdisqualifiedReason");
        l.f(str30, "agentServiceName");
        l.f(str31, "mobileNumber");
        this.dlno = str32;
        this.dob = str33;
        this.rtoCodeDLTr = str34;
        this.selectedDLSerList = selectdllist2;
        this.pofbirth = str35;
        this.country = str36;
        this.passno = str37;
        this.passvaltill = str38;
        this.visano = str39;
        this.visavaltill = str40;
        this.cov_req = arrayList2;
        this.tovisit = str41;
        this.iscountryrestricted = str42;
        this.countryRestrictedReason = str43;
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
        this.mobileNumber = str31;
    }

    public static /* synthetic */ IdpSubmitRequest copy$default(IdpSubmitRequest idpSubmitRequest, String str, String str2, String str3, selectDLlist selectdllist, String str4, String str5, String str6, String str7, String str8, String str9, ArrayList arrayList, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, int i10, int i11, Object obj) {
        IdpSubmitRequest idpSubmitRequest2 = idpSubmitRequest;
        int i12 = i10;
        return idpSubmitRequest.copy((i12 & 1) != 0 ? idpSubmitRequest2.dlno : str, (i12 & 2) != 0 ? idpSubmitRequest2.dob : str2, (i12 & 4) != 0 ? idpSubmitRequest2.rtoCodeDLTr : str3, (i12 & 8) != 0 ? idpSubmitRequest2.selectedDLSerList : selectdllist, (i12 & 16) != 0 ? idpSubmitRequest2.pofbirth : str4, (i12 & 32) != 0 ? idpSubmitRequest2.country : str5, (i12 & 64) != 0 ? idpSubmitRequest2.passno : str6, (i12 & 128) != 0 ? idpSubmitRequest2.passvaltill : str7, (i12 & 256) != 0 ? idpSubmitRequest2.visano : str8, (i12 & 512) != 0 ? idpSubmitRequest2.visavaltill : str9, (i12 & 1024) != 0 ? idpSubmitRequest2.cov_req : arrayList, (i12 & 2048) != 0 ? idpSubmitRequest2.tovisit : str10, (i12 & 4096) != 0 ? idpSubmitRequest2.iscountryrestricted : str11, (i12 & 8192) != 0 ? idpSubmitRequest2.countryRestrictedReason : str12, (i12 & 16384) != 0 ? idpSubmitRequest2.isDlSerdisqualified : str13, (i12 & 32768) != 0 ? idpSubmitRequest2.dlSerdisqualifiedReason : str14, (i12 & 65536) != 0 ? idpSubmitRequest2.forAdd1 : str15, (i12 & 131072) != 0 ? idpSubmitRequest2.forAdd2 : str16, (i12 & 262144) != 0 ? idpSubmitRequest2.forAdd3 : str17, (i12 & 524288) != 0 ? idpSubmitRequest2.forAddPinCode : str18, (i12 & 1048576) != 0 ? idpSubmitRequest2.forNationMobNum : str19, (i12 & 2097152) != 0 ? idpSubmitRequest2.emailID : str20, (i12 & 4194304) != 0 ? idpSubmitRequest2.appliedIdpfromIndEmb : str21, (i12 & 8388608) != 0 ? idpSubmitRequest2.indEmbName : str22, (i12 & 16777216) != 0 ? idpSubmitRequest2.embPlace : str23, (i12 & 33554432) != 0 ? idpSubmitRequest2.dateOfVerifEmb : str24, (i12 & 67108864) != 0 ? idpSubmitRequest2.embEndorseNo : str25, (i12 & 134217728) != 0 ? idpSubmitRequest2.idpcountryapplyfrom : str26, (i12 & 268435456) != 0 ? idpSubmitRequest2.agentId : str27, (i12 & 536870912) != 0 ? idpSubmitRequest2.agentPwd : str28, (i12 & 1073741824) != 0 ? idpSubmitRequest2.agentIpAddress : str29, (i12 & Integer.MIN_VALUE) != 0 ? idpSubmitRequest2.agentServiceName : str30, (i11 & 1) != 0 ? idpSubmitRequest2.mobileNumber : str31);
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
        return this.mobileNumber;
    }

    public final selectDLlist component4() {
        return this.selectedDLSerList;
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

    public final IdpSubmitRequest copy(String str, String str2, String str3, selectDLlist selectdllist, String str4, String str5, String str6, String str7, String str8, String str9, ArrayList<String> arrayList, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31) {
        String str32 = str;
        l.f(str32, "dlno");
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
        l.f(str31, "mobileNumber");
        return new IdpSubmitRequest(str32, str2, str3, selectdllist, str4, str5, str6, str7, str8, str9, arrayList, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdpSubmitRequest)) {
            return false;
        }
        IdpSubmitRequest idpSubmitRequest = (IdpSubmitRequest) obj;
        return l.a(this.dlno, idpSubmitRequest.dlno) && l.a(this.dob, idpSubmitRequest.dob) && l.a(this.rtoCodeDLTr, idpSubmitRequest.rtoCodeDLTr) && l.a(this.selectedDLSerList, idpSubmitRequest.selectedDLSerList) && l.a(this.pofbirth, idpSubmitRequest.pofbirth) && l.a(this.country, idpSubmitRequest.country) && l.a(this.passno, idpSubmitRequest.passno) && l.a(this.passvaltill, idpSubmitRequest.passvaltill) && l.a(this.visano, idpSubmitRequest.visano) && l.a(this.visavaltill, idpSubmitRequest.visavaltill) && l.a(this.cov_req, idpSubmitRequest.cov_req) && l.a(this.tovisit, idpSubmitRequest.tovisit) && l.a(this.iscountryrestricted, idpSubmitRequest.iscountryrestricted) && l.a(this.countryRestrictedReason, idpSubmitRequest.countryRestrictedReason) && l.a(this.isDlSerdisqualified, idpSubmitRequest.isDlSerdisqualified) && l.a(this.dlSerdisqualifiedReason, idpSubmitRequest.dlSerdisqualifiedReason) && l.a(this.forAdd1, idpSubmitRequest.forAdd1) && l.a(this.forAdd2, idpSubmitRequest.forAdd2) && l.a(this.forAdd3, idpSubmitRequest.forAdd3) && l.a(this.forAddPinCode, idpSubmitRequest.forAddPinCode) && l.a(this.forNationMobNum, idpSubmitRequest.forNationMobNum) && l.a(this.emailID, idpSubmitRequest.emailID) && l.a(this.appliedIdpfromIndEmb, idpSubmitRequest.appliedIdpfromIndEmb) && l.a(this.indEmbName, idpSubmitRequest.indEmbName) && l.a(this.embPlace, idpSubmitRequest.embPlace) && l.a(this.dateOfVerifEmb, idpSubmitRequest.dateOfVerifEmb) && l.a(this.embEndorseNo, idpSubmitRequest.embEndorseNo) && l.a(this.idpcountryapplyfrom, idpSubmitRequest.idpcountryapplyfrom) && l.a(this.agentId, idpSubmitRequest.agentId) && l.a(this.agentPwd, idpSubmitRequest.agentPwd) && l.a(this.agentIpAddress, idpSubmitRequest.agentIpAddress) && l.a(this.agentServiceName, idpSubmitRequest.agentServiceName) && l.a(this.mobileNumber, idpSubmitRequest.mobileNumber);
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

    public final String getPofbirth() {
        return this.pofbirth;
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
        return ((((hashCode15 + i10) * 31) + this.agentServiceName.hashCode()) * 31) + this.mobileNumber.hashCode();
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

    public final void setPofbirth(String str) {
        l.f(str, "<set-?>");
        this.pofbirth = str;
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
        return "IdpSubmitRequest(dlno=" + this.dlno + ", dob=" + this.dob + ", rtoCodeDLTr=" + this.rtoCodeDLTr + ", selectedDLSerList=" + this.selectedDLSerList + ", pofbirth=" + this.pofbirth + ", country=" + this.country + ", passno=" + this.passno + ", passvaltill=" + this.passvaltill + ", visano=" + this.visano + ", visavaltill=" + this.visavaltill + ", cov_req=" + this.cov_req + ", tovisit=" + this.tovisit + ", iscountryrestricted=" + this.iscountryrestricted + ", countryRestrictedReason=" + this.countryRestrictedReason + ", isDlSerdisqualified=" + this.isDlSerdisqualified + ", dlSerdisqualifiedReason=" + this.dlSerdisqualifiedReason + ", forAdd1=" + this.forAdd1 + ", forAdd2=" + this.forAdd2 + ", forAdd3=" + this.forAdd3 + ", forAddPinCode=" + this.forAddPinCode + ", forNationMobNum=" + this.forNationMobNum + ", emailID=" + this.emailID + ", appliedIdpfromIndEmb=" + this.appliedIdpfromIndEmb + ", indEmbName=" + this.indEmbName + ", embPlace=" + this.embPlace + ", dateOfVerifEmb=" + this.dateOfVerifEmb + ", embEndorseNo=" + this.embEndorseNo + ", idpcountryapplyfrom=" + this.idpcountryapplyfrom + ", agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", mobileNumber=" + this.mobileNumber + ')';
    }
}
