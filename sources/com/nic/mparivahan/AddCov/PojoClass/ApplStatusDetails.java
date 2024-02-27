package com.nic.mparivahan.AddCov.PojoClass;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public final class ApplStatusDetails implements Serializable {
    private final ArrayList<String> Eligiblecovs_EnableMode;
    private final String IDM1;
    private final String IDM2;
    private final String MobileNO;
    private final String PERMANENT_ADD1;
    private final String PERMANENT_ADD2;
    private final String PERMANENT_ADD3;
    private final String PERMANENT_DISTRICTCODE;
    private final String PERMANENT_PINCODE;
    private final String PERMANENT_SUBDICTCODE;
    private final String PERMANENT_State;
    private final String PERMANENT_VILLAGE;
    private final String PRESENT_ADD1;
    private final String PRESENT_ADD2;
    private final String PRESENT_ADD3;
    private final String PRESENT_DISTRICTCODE;
    private final String PRESENT_PINCODE;
    private final String PRESENT_SUBDICTCODE;
    private final String PRESENT_State;
    private final String PRESENT_VILLAGE;
    private final String Qualcd_Desc;
    private final String StateCd;
    private final int age;
    private final boolean allowNewAddr;
    private final String altMobileNumber;
    private final String applDate;
    private final String applName;
    private final String applno;
    private final String bloodGroup;
    private final String countryOfBirth;
    private final String dbLocation;
    private final String dob;
    private final String emailId;
    private final String freshInAddTransaction;
    private final String gender;
    private final String licence;
    private final String placeOfBirth;
    private final boolean porting;
    private final String relation;
    private final String rtoCd;
    private final String selectedCovs;
    private final String swdName;
    private final int trcode;

    public ApplStatusDetails(ArrayList<String> arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, int i10, boolean z10, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, boolean z11, String str35, String str36, String str37, String str38, int i11) {
        ArrayList<String> arrayList2 = arrayList;
        String str39 = str;
        String str40 = str2;
        String str41 = str3;
        String str42 = str4;
        String str43 = str5;
        String str44 = str6;
        String str45 = str7;
        String str46 = str8;
        String str47 = str9;
        String str48 = str10;
        String str49 = str11;
        String str50 = str12;
        String str51 = str13;
        String str52 = str15;
        l.f(arrayList2, "Eligiblecovs_EnableMode");
        l.f(str39, "IDM1");
        l.f(str40, "IDM2");
        l.f(str41, "MobileNO");
        l.f(str42, "PERMANENT_ADD1");
        l.f(str43, "PERMANENT_ADD2");
        l.f(str44, "PERMANENT_ADD3");
        l.f(str45, "PERMANENT_DISTRICTCODE");
        l.f(str46, "PERMANENT_PINCODE");
        l.f(str47, "PERMANENT_SUBDICTCODE");
        l.f(str48, "PERMANENT_State");
        l.f(str49, "PERMANENT_VILLAGE");
        l.f(str50, "PRESENT_ADD1");
        l.f(str51, "PRESENT_ADD2");
        l.f(str14, "PRESENT_ADD3");
        l.f(str15, "PRESENT_DISTRICTCODE");
        l.f(str16, "PRESENT_PINCODE");
        l.f(str17, "PRESENT_SUBDICTCODE");
        l.f(str18, "PRESENT_State");
        l.f(str19, "PRESENT_VILLAGE");
        l.f(str20, "Qualcd_Desc");
        l.f(str21, "StateCd");
        l.f(str22, "altMobileNumber");
        l.f(str23, "applDate");
        l.f(str24, "applName");
        l.f(str25, "applno");
        l.f(str26, "bloodGroup");
        l.f(str27, "countryOfBirth");
        l.f(str28, "dbLocation");
        l.f(str29, "dob");
        l.f(str30, "emailId");
        l.f(str31, "freshInAddTransaction");
        l.f(str32, "gender");
        l.f(str33, "licence");
        l.f(str34, "placeOfBirth");
        l.f(str35, "relation");
        l.f(str36, "rtoCd");
        l.f(str37, "selectedCovs");
        l.f(str38, "swdName");
        this.Eligiblecovs_EnableMode = arrayList2;
        this.IDM1 = str39;
        this.IDM2 = str40;
        this.MobileNO = str41;
        this.PERMANENT_ADD1 = str42;
        this.PERMANENT_ADD2 = str43;
        this.PERMANENT_ADD3 = str44;
        this.PERMANENT_DISTRICTCODE = str45;
        this.PERMANENT_PINCODE = str46;
        this.PERMANENT_SUBDICTCODE = str47;
        this.PERMANENT_State = str48;
        this.PERMANENT_VILLAGE = str49;
        this.PRESENT_ADD1 = str50;
        this.PRESENT_ADD2 = str51;
        this.PRESENT_ADD3 = str14;
        this.PRESENT_DISTRICTCODE = str15;
        this.PRESENT_PINCODE = str16;
        this.PRESENT_SUBDICTCODE = str17;
        this.PRESENT_State = str18;
        this.PRESENT_VILLAGE = str19;
        this.Qualcd_Desc = str20;
        this.StateCd = str21;
        this.age = i10;
        this.allowNewAddr = z10;
        this.altMobileNumber = str22;
        this.applDate = str23;
        this.applName = str24;
        this.applno = str25;
        this.bloodGroup = str26;
        this.countryOfBirth = str27;
        this.dbLocation = str28;
        this.dob = str29;
        this.emailId = str30;
        this.freshInAddTransaction = str31;
        this.gender = str32;
        this.licence = str33;
        this.placeOfBirth = str34;
        this.porting = z11;
        this.relation = str35;
        this.rtoCd = str36;
        this.selectedCovs = str37;
        this.swdName = str38;
        this.trcode = i11;
    }

    public static /* synthetic */ ApplStatusDetails copy$default(ApplStatusDetails applStatusDetails, ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, int i10, boolean z10, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, boolean z11, String str35, String str36, String str37, String str38, int i11, int i12, int i13, Object obj) {
        ApplStatusDetails applStatusDetails2 = applStatusDetails;
        int i14 = i12;
        int i15 = i13;
        return applStatusDetails.copy((i14 & 1) != 0 ? applStatusDetails2.Eligiblecovs_EnableMode : arrayList, (i14 & 2) != 0 ? applStatusDetails2.IDM1 : str, (i14 & 4) != 0 ? applStatusDetails2.IDM2 : str2, (i14 & 8) != 0 ? applStatusDetails2.MobileNO : str3, (i14 & 16) != 0 ? applStatusDetails2.PERMANENT_ADD1 : str4, (i14 & 32) != 0 ? applStatusDetails2.PERMANENT_ADD2 : str5, (i14 & 64) != 0 ? applStatusDetails2.PERMANENT_ADD3 : str6, (i14 & 128) != 0 ? applStatusDetails2.PERMANENT_DISTRICTCODE : str7, (i14 & 256) != 0 ? applStatusDetails2.PERMANENT_PINCODE : str8, (i14 & 512) != 0 ? applStatusDetails2.PERMANENT_SUBDICTCODE : str9, (i14 & 1024) != 0 ? applStatusDetails2.PERMANENT_State : str10, (i14 & 2048) != 0 ? applStatusDetails2.PERMANENT_VILLAGE : str11, (i14 & 4096) != 0 ? applStatusDetails2.PRESENT_ADD1 : str12, (i14 & 8192) != 0 ? applStatusDetails2.PRESENT_ADD2 : str13, (i14 & 16384) != 0 ? applStatusDetails2.PRESENT_ADD3 : str14, (i14 & 32768) != 0 ? applStatusDetails2.PRESENT_DISTRICTCODE : str15, (i14 & 65536) != 0 ? applStatusDetails2.PRESENT_PINCODE : str16, (i14 & 131072) != 0 ? applStatusDetails2.PRESENT_SUBDICTCODE : str17, (i14 & 262144) != 0 ? applStatusDetails2.PRESENT_State : str18, (i14 & 524288) != 0 ? applStatusDetails2.PRESENT_VILLAGE : str19, (i14 & 1048576) != 0 ? applStatusDetails2.Qualcd_Desc : str20, (i14 & 2097152) != 0 ? applStatusDetails2.StateCd : str21, (i14 & 4194304) != 0 ? applStatusDetails2.age : i10, (i14 & 8388608) != 0 ? applStatusDetails2.allowNewAddr : z10, (i14 & 16777216) != 0 ? applStatusDetails2.altMobileNumber : str22, (i14 & 33554432) != 0 ? applStatusDetails2.applDate : str23, (i14 & 67108864) != 0 ? applStatusDetails2.applName : str24, (i14 & 134217728) != 0 ? applStatusDetails2.applno : str25, (i14 & 268435456) != 0 ? applStatusDetails2.bloodGroup : str26, (i14 & 536870912) != 0 ? applStatusDetails2.countryOfBirth : str27, (i14 & 1073741824) != 0 ? applStatusDetails2.dbLocation : str28, (i14 & Integer.MIN_VALUE) != 0 ? applStatusDetails2.dob : str29, (i15 & 1) != 0 ? applStatusDetails2.emailId : str30, (i15 & 2) != 0 ? applStatusDetails2.freshInAddTransaction : str31, (i15 & 4) != 0 ? applStatusDetails2.gender : str32, (i15 & 8) != 0 ? applStatusDetails2.licence : str33, (i15 & 16) != 0 ? applStatusDetails2.placeOfBirth : str34, (i15 & 32) != 0 ? applStatusDetails2.porting : z11, (i15 & 64) != 0 ? applStatusDetails2.relation : str35, (i15 & 128) != 0 ? applStatusDetails2.rtoCd : str36, (i15 & 256) != 0 ? applStatusDetails2.selectedCovs : str37, (i15 & 512) != 0 ? applStatusDetails2.swdName : str38, (i15 & 1024) != 0 ? applStatusDetails2.trcode : i11);
    }

    public final ArrayList<String> component1() {
        return this.Eligiblecovs_EnableMode;
    }

    public final String component10() {
        return this.PERMANENT_SUBDICTCODE;
    }

    public final String component11() {
        return this.PERMANENT_State;
    }

    public final String component12() {
        return this.PERMANENT_VILLAGE;
    }

    public final String component13() {
        return this.PRESENT_ADD1;
    }

    public final String component14() {
        return this.PRESENT_ADD2;
    }

    public final String component15() {
        return this.PRESENT_ADD3;
    }

    public final String component16() {
        return this.PRESENT_DISTRICTCODE;
    }

    public final String component17() {
        return this.PRESENT_PINCODE;
    }

    public final String component18() {
        return this.PRESENT_SUBDICTCODE;
    }

    public final String component19() {
        return this.PRESENT_State;
    }

    public final String component2() {
        return this.IDM1;
    }

    public final String component20() {
        return this.PRESENT_VILLAGE;
    }

    public final String component21() {
        return this.Qualcd_Desc;
    }

    public final String component22() {
        return this.StateCd;
    }

    public final int component23() {
        return this.age;
    }

    public final boolean component24() {
        return this.allowNewAddr;
    }

    public final String component25() {
        return this.altMobileNumber;
    }

    public final String component26() {
        return this.applDate;
    }

    public final String component27() {
        return this.applName;
    }

    public final String component28() {
        return this.applno;
    }

    public final String component29() {
        return this.bloodGroup;
    }

    public final String component3() {
        return this.IDM2;
    }

    public final String component30() {
        return this.countryOfBirth;
    }

    public final String component31() {
        return this.dbLocation;
    }

    public final String component32() {
        return this.dob;
    }

    public final String component33() {
        return this.emailId;
    }

    public final String component34() {
        return this.freshInAddTransaction;
    }

    public final String component35() {
        return this.gender;
    }

    public final String component36() {
        return this.licence;
    }

    public final String component37() {
        return this.placeOfBirth;
    }

    public final boolean component38() {
        return this.porting;
    }

    public final String component39() {
        return this.relation;
    }

    public final String component4() {
        return this.MobileNO;
    }

    public final String component40() {
        return this.rtoCd;
    }

    public final String component41() {
        return this.selectedCovs;
    }

    public final String component42() {
        return this.swdName;
    }

    public final int component43() {
        return this.trcode;
    }

    public final String component5() {
        return this.PERMANENT_ADD1;
    }

    public final String component6() {
        return this.PERMANENT_ADD2;
    }

    public final String component7() {
        return this.PERMANENT_ADD3;
    }

    public final String component8() {
        return this.PERMANENT_DISTRICTCODE;
    }

    public final String component9() {
        return this.PERMANENT_PINCODE;
    }

    public final ApplStatusDetails copy(ArrayList<String> arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, int i10, boolean z10, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, boolean z11, String str35, String str36, String str37, String str38, int i11) {
        ArrayList<String> arrayList2 = arrayList;
        l.f(arrayList2, "Eligiblecovs_EnableMode");
        l.f(str, "IDM1");
        l.f(str2, "IDM2");
        l.f(str3, "MobileNO");
        l.f(str4, "PERMANENT_ADD1");
        l.f(str5, "PERMANENT_ADD2");
        l.f(str6, "PERMANENT_ADD3");
        l.f(str7, "PERMANENT_DISTRICTCODE");
        l.f(str8, "PERMANENT_PINCODE");
        l.f(str9, "PERMANENT_SUBDICTCODE");
        l.f(str10, "PERMANENT_State");
        l.f(str11, "PERMANENT_VILLAGE");
        l.f(str12, "PRESENT_ADD1");
        l.f(str13, "PRESENT_ADD2");
        l.f(str14, "PRESENT_ADD3");
        l.f(str15, "PRESENT_DISTRICTCODE");
        l.f(str16, "PRESENT_PINCODE");
        l.f(str17, "PRESENT_SUBDICTCODE");
        l.f(str18, "PRESENT_State");
        l.f(str19, "PRESENT_VILLAGE");
        l.f(str20, "Qualcd_Desc");
        l.f(str21, "StateCd");
        l.f(str22, "altMobileNumber");
        l.f(str23, "applDate");
        l.f(str24, "applName");
        l.f(str25, "applno");
        l.f(str26, "bloodGroup");
        l.f(str27, "countryOfBirth");
        l.f(str28, "dbLocation");
        l.f(str29, "dob");
        l.f(str30, "emailId");
        l.f(str31, "freshInAddTransaction");
        l.f(str32, "gender");
        l.f(str33, "licence");
        l.f(str34, "placeOfBirth");
        l.f(str35, "relation");
        l.f(str36, "rtoCd");
        l.f(str37, "selectedCovs");
        l.f(str38, "swdName");
        return new ApplStatusDetails(arrayList2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, i10, z10, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, z11, str35, str36, str37, str38, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplStatusDetails)) {
            return false;
        }
        ApplStatusDetails applStatusDetails = (ApplStatusDetails) obj;
        return l.a(this.Eligiblecovs_EnableMode, applStatusDetails.Eligiblecovs_EnableMode) && l.a(this.IDM1, applStatusDetails.IDM1) && l.a(this.IDM2, applStatusDetails.IDM2) && l.a(this.MobileNO, applStatusDetails.MobileNO) && l.a(this.PERMANENT_ADD1, applStatusDetails.PERMANENT_ADD1) && l.a(this.PERMANENT_ADD2, applStatusDetails.PERMANENT_ADD2) && l.a(this.PERMANENT_ADD3, applStatusDetails.PERMANENT_ADD3) && l.a(this.PERMANENT_DISTRICTCODE, applStatusDetails.PERMANENT_DISTRICTCODE) && l.a(this.PERMANENT_PINCODE, applStatusDetails.PERMANENT_PINCODE) && l.a(this.PERMANENT_SUBDICTCODE, applStatusDetails.PERMANENT_SUBDICTCODE) && l.a(this.PERMANENT_State, applStatusDetails.PERMANENT_State) && l.a(this.PERMANENT_VILLAGE, applStatusDetails.PERMANENT_VILLAGE) && l.a(this.PRESENT_ADD1, applStatusDetails.PRESENT_ADD1) && l.a(this.PRESENT_ADD2, applStatusDetails.PRESENT_ADD2) && l.a(this.PRESENT_ADD3, applStatusDetails.PRESENT_ADD3) && l.a(this.PRESENT_DISTRICTCODE, applStatusDetails.PRESENT_DISTRICTCODE) && l.a(this.PRESENT_PINCODE, applStatusDetails.PRESENT_PINCODE) && l.a(this.PRESENT_SUBDICTCODE, applStatusDetails.PRESENT_SUBDICTCODE) && l.a(this.PRESENT_State, applStatusDetails.PRESENT_State) && l.a(this.PRESENT_VILLAGE, applStatusDetails.PRESENT_VILLAGE) && l.a(this.Qualcd_Desc, applStatusDetails.Qualcd_Desc) && l.a(this.StateCd, applStatusDetails.StateCd) && this.age == applStatusDetails.age && this.allowNewAddr == applStatusDetails.allowNewAddr && l.a(this.altMobileNumber, applStatusDetails.altMobileNumber) && l.a(this.applDate, applStatusDetails.applDate) && l.a(this.applName, applStatusDetails.applName) && l.a(this.applno, applStatusDetails.applno) && l.a(this.bloodGroup, applStatusDetails.bloodGroup) && l.a(this.countryOfBirth, applStatusDetails.countryOfBirth) && l.a(this.dbLocation, applStatusDetails.dbLocation) && l.a(this.dob, applStatusDetails.dob) && l.a(this.emailId, applStatusDetails.emailId) && l.a(this.freshInAddTransaction, applStatusDetails.freshInAddTransaction) && l.a(this.gender, applStatusDetails.gender) && l.a(this.licence, applStatusDetails.licence) && l.a(this.placeOfBirth, applStatusDetails.placeOfBirth) && this.porting == applStatusDetails.porting && l.a(this.relation, applStatusDetails.relation) && l.a(this.rtoCd, applStatusDetails.rtoCd) && l.a(this.selectedCovs, applStatusDetails.selectedCovs) && l.a(this.swdName, applStatusDetails.swdName) && this.trcode == applStatusDetails.trcode;
    }

    public final int getAge() {
        return this.age;
    }

    public final boolean getAllowNewAddr() {
        return this.allowNewAddr;
    }

    public final String getAltMobileNumber() {
        return this.altMobileNumber;
    }

    public final String getApplDate() {
        return this.applDate;
    }

    public final String getApplName() {
        return this.applName;
    }

    public final String getApplno() {
        return this.applno;
    }

    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    public final String getCountryOfBirth() {
        return this.countryOfBirth;
    }

    public final String getDbLocation() {
        return this.dbLocation;
    }

    public final String getDob() {
        return this.dob;
    }

    public final ArrayList<String> getEligiblecovs_EnableMode() {
        return this.Eligiblecovs_EnableMode;
    }

    public final String getEmailId() {
        return this.emailId;
    }

    public final String getFreshInAddTransaction() {
        return this.freshInAddTransaction;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getIDM1() {
        return this.IDM1;
    }

    public final String getIDM2() {
        return this.IDM2;
    }

    public final String getLicence() {
        return this.licence;
    }

    public final String getMobileNO() {
        return this.MobileNO;
    }

    public final String getPERMANENT_ADD1() {
        return this.PERMANENT_ADD1;
    }

    public final String getPERMANENT_ADD2() {
        return this.PERMANENT_ADD2;
    }

    public final String getPERMANENT_ADD3() {
        return this.PERMANENT_ADD3;
    }

    public final String getPERMANENT_DISTRICTCODE() {
        return this.PERMANENT_DISTRICTCODE;
    }

    public final String getPERMANENT_PINCODE() {
        return this.PERMANENT_PINCODE;
    }

    public final String getPERMANENT_SUBDICTCODE() {
        return this.PERMANENT_SUBDICTCODE;
    }

    public final String getPERMANENT_State() {
        return this.PERMANENT_State;
    }

    public final String getPERMANENT_VILLAGE() {
        return this.PERMANENT_VILLAGE;
    }

    public final String getPRESENT_ADD1() {
        return this.PRESENT_ADD1;
    }

    public final String getPRESENT_ADD2() {
        return this.PRESENT_ADD2;
    }

    public final String getPRESENT_ADD3() {
        return this.PRESENT_ADD3;
    }

    public final String getPRESENT_DISTRICTCODE() {
        return this.PRESENT_DISTRICTCODE;
    }

    public final String getPRESENT_PINCODE() {
        return this.PRESENT_PINCODE;
    }

    public final String getPRESENT_SUBDICTCODE() {
        return this.PRESENT_SUBDICTCODE;
    }

    public final String getPRESENT_State() {
        return this.PRESENT_State;
    }

    public final String getPRESENT_VILLAGE() {
        return this.PRESENT_VILLAGE;
    }

    public final String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public final boolean getPorting() {
        return this.porting;
    }

    public final String getQualcd_Desc() {
        return this.Qualcd_Desc;
    }

    public final String getRelation() {
        return this.relation;
    }

    public final String getRtoCd() {
        return this.rtoCd;
    }

    public final String getSelectedCovs() {
        return this.selectedCovs;
    }

    public final String getStateCd() {
        return this.StateCd;
    }

    public final String getSwdName() {
        return this.swdName;
    }

    public final int getTrcode() {
        return this.trcode;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((this.Eligiblecovs_EnableMode.hashCode() * 31) + this.IDM1.hashCode()) * 31) + this.IDM2.hashCode()) * 31) + this.MobileNO.hashCode()) * 31) + this.PERMANENT_ADD1.hashCode()) * 31) + this.PERMANENT_ADD2.hashCode()) * 31) + this.PERMANENT_ADD3.hashCode()) * 31) + this.PERMANENT_DISTRICTCODE.hashCode()) * 31) + this.PERMANENT_PINCODE.hashCode()) * 31) + this.PERMANENT_SUBDICTCODE.hashCode()) * 31) + this.PERMANENT_State.hashCode()) * 31) + this.PERMANENT_VILLAGE.hashCode()) * 31) + this.PRESENT_ADD1.hashCode()) * 31) + this.PRESENT_ADD2.hashCode()) * 31) + this.PRESENT_ADD3.hashCode()) * 31) + this.PRESENT_DISTRICTCODE.hashCode()) * 31) + this.PRESENT_PINCODE.hashCode()) * 31) + this.PRESENT_SUBDICTCODE.hashCode()) * 31) + this.PRESENT_State.hashCode()) * 31) + this.PRESENT_VILLAGE.hashCode()) * 31) + this.Qualcd_Desc.hashCode()) * 31) + this.StateCd.hashCode()) * 31) + Integer.hashCode(this.age)) * 31;
        boolean z10 = this.allowNewAddr;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int hashCode2 = (((((((((((((((((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + this.altMobileNumber.hashCode()) * 31) + this.applDate.hashCode()) * 31) + this.applName.hashCode()) * 31) + this.applno.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.countryOfBirth.hashCode()) * 31) + this.dbLocation.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.emailId.hashCode()) * 31) + this.freshInAddTransaction.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.licence.hashCode()) * 31) + this.placeOfBirth.hashCode()) * 31;
        boolean z12 = this.porting;
        if (!z12) {
            z11 = z12;
        }
        return ((((((((((hashCode2 + (z11 ? 1 : 0)) * 31) + this.relation.hashCode()) * 31) + this.rtoCd.hashCode()) * 31) + this.selectedCovs.hashCode()) * 31) + this.swdName.hashCode()) * 31) + Integer.hashCode(this.trcode);
    }

    public String toString() {
        return "ApplStatusDetails(Eligiblecovs_EnableMode=" + this.Eligiblecovs_EnableMode + ", IDM1=" + this.IDM1 + ", IDM2=" + this.IDM2 + ", MobileNO=" + this.MobileNO + ", PERMANENT_ADD1=" + this.PERMANENT_ADD1 + ", PERMANENT_ADD2=" + this.PERMANENT_ADD2 + ", PERMANENT_ADD3=" + this.PERMANENT_ADD3 + ", PERMANENT_DISTRICTCODE=" + this.PERMANENT_DISTRICTCODE + ", PERMANENT_PINCODE=" + this.PERMANENT_PINCODE + ", PERMANENT_SUBDICTCODE=" + this.PERMANENT_SUBDICTCODE + ", PERMANENT_State=" + this.PERMANENT_State + ", PERMANENT_VILLAGE=" + this.PERMANENT_VILLAGE + ", PRESENT_ADD1=" + this.PRESENT_ADD1 + ", PRESENT_ADD2=" + this.PRESENT_ADD2 + ", PRESENT_ADD3=" + this.PRESENT_ADD3 + ", PRESENT_DISTRICTCODE=" + this.PRESENT_DISTRICTCODE + ", PRESENT_PINCODE=" + this.PRESENT_PINCODE + ", PRESENT_SUBDICTCODE=" + this.PRESENT_SUBDICTCODE + ", PRESENT_State=" + this.PRESENT_State + ", PRESENT_VILLAGE=" + this.PRESENT_VILLAGE + ", Qualcd_Desc=" + this.Qualcd_Desc + ", StateCd=" + this.StateCd + ", age=" + this.age + ", allowNewAddr=" + this.allowNewAddr + ", altMobileNumber=" + this.altMobileNumber + ", applDate=" + this.applDate + ", applName=" + this.applName + ", applno=" + this.applno + ", bloodGroup=" + this.bloodGroup + ", countryOfBirth=" + this.countryOfBirth + ", dbLocation=" + this.dbLocation + ", dob=" + this.dob + ", emailId=" + this.emailId + ", freshInAddTransaction=" + this.freshInAddTransaction + ", gender=" + this.gender + ", licence=" + this.licence + ", placeOfBirth=" + this.placeOfBirth + ", porting=" + this.porting + ", relation=" + this.relation + ", rtoCd=" + this.rtoCd + ", selectedCovs=" + this.selectedCovs + ", swdName=" + this.swdName + ", trcode=" + this.trcode + ')';
    }
}
