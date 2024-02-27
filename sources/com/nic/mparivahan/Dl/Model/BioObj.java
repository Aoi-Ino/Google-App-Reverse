package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class BioObj implements Serializable {
    private final Object biPhoto;
    private final Object bioAadhaarName;
    private final Object bioAadhaarNo;
    private final Object bioAltMobileNo;
    private final String bioApplno;
    private final String bioBioId;
    private final Object bioBioidSearch;
    private final Object bioBirthplace;
    private final String bioBloodGroup;
    private final String bioBloodGroupname;
    private final String bioCitiZen;
    private final String bioDependentRelation;
    private final Object bioDigest;
    private final String bioDlno;
    private final String bioDob;
    private final Object bioEmailId;
    private final Object bioEndorsedt;
    private final Object bioEndorsementNo;
    private final Object bioEndorsetime;
    private final String bioFirstName;
    private final String bioFullName;
    private final String bioGender;
    private final String bioGenderDesc;
    private final String bioIdentityMark1;
    private final Object bioIdentityMark2;
    private final Object bioLastName;
    private final String bioMiddleName;
    private final Object bioMobileNo;
    private final String bioNatName;
    private final Object bioNprNo;
    private final Object bioOrganDonor;
    private final Object bioPerDetAadhaar;
    private final String bioPermAdd1;
    private final String bioPermAdd2;
    private final Object bioPermAdd3;
    private final Object bioPermDistCd;
    private final Object bioPermDistName;
    private final Object bioPermLocType;
    private final Object bioPermLocal;
    private final String bioPermPin;
    private final Object bioPermSdName;
    private final String bioPermSdcode;
    private final Object bioPermVillTownCd;
    private final Object bioPermVillTownName;
    private final Object bioPhoneNo;
    private final Object bioPoliceStncd;
    private final String bioQmQualcd;
    private final Object bioQmQualdesc;
    private final String bioRecGenesis;
    private final Object bioStayperiodPresentAddr;
    private final String bioSwdFname;
    private final String bioSwdFullName;
    private final Object bioSwdLname;
    private final String bioSwdMname;
    private final String bioTempAdd1;
    private final String bioTempAdd2;
    private final Object bioTempAdd3;
    private final Object bioTempDistCd;
    private final Object bioTempDistName;
    private final Object bioTempLocType;
    private final Object bioTempLocal;
    private final String bioTempPin;
    private final Object bioTempSdName;
    private final String bioTempSdcode;
    private final Object bioTempVillTownCd;
    private final Object bioTempVillTownName;
    private final Object bioTokenId;
    private final String bioUserId;
    private final Object dob;
    private final Object fullAddress;
    private final Object pht;

    public BioObj(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, Object obj5, Object obj6, String str3, String str4, String str5, String str6, Object obj7, String str7, String str8, Object obj8, Object obj9, Object obj10, Object obj11, String str9, String str10, String str11, String str12, String str13, Object obj12, Object obj13, String str14, Object obj14, String str15, Object obj15, Object obj16, Object obj17, String str16, String str17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22, String str18, Object obj23, String str19, Object obj24, Object obj25, Object obj26, Object obj27, String str20, Object obj28, String str21, Object obj29, String str22, String str23, Object obj30, String str24, String str25, String str26, Object obj31, Object obj32, Object obj33, Object obj34, Object obj35, String str27, Object obj36, String str28, Object obj37, Object obj38, Object obj39, String str29, Object obj40, Object obj41, Object obj42) {
        Object obj43 = obj;
        Object obj44 = obj2;
        Object obj45 = obj3;
        Object obj46 = obj4;
        String str30 = str;
        String str31 = str2;
        Object obj47 = obj5;
        Object obj48 = obj6;
        String str32 = str3;
        String str33 = str4;
        String str34 = str5;
        String str35 = str6;
        Object obj49 = obj7;
        String str36 = str7;
        Object obj50 = obj8;
        l.f(obj43, "biPhoto");
        l.f(obj44, "bioAadhaarName");
        l.f(obj45, "bioAadhaarNo");
        l.f(obj46, "bioAltMobileNo");
        l.f(str30, "bioApplno");
        l.f(str31, "bioBioId");
        l.f(obj47, "bioBioidSearch");
        l.f(obj48, "bioBirthplace");
        l.f(str32, "bioBloodGroup");
        l.f(str33, "bioBloodGroupname");
        l.f(str34, "bioCitiZen");
        l.f(str35, "bioDependentRelation");
        l.f(obj49, "bioDigest");
        l.f(str36, "bioDlno");
        l.f(str8, "bioDob");
        l.f(obj8, "bioEmailId");
        l.f(obj9, "bioEndorsedt");
        l.f(obj10, "bioEndorsementNo");
        l.f(obj11, "bioEndorsetime");
        l.f(str9, "bioFirstName");
        l.f(str10, "bioFullName");
        l.f(str11, "bioGender");
        l.f(str12, "bioGenderDesc");
        l.f(str13, "bioIdentityMark1");
        l.f(obj12, "bioIdentityMark2");
        l.f(obj13, "bioLastName");
        l.f(str14, "bioMiddleName");
        l.f(obj14, "bioMobileNo");
        l.f(str15, "bioNatName");
        l.f(obj15, "bioNprNo");
        l.f(obj16, "bioOrganDonor");
        l.f(obj17, "bioPerDetAadhaar");
        l.f(str17, "bioPermAdd2");
        l.f(obj18, "bioPermAdd3");
        l.f(obj19, "bioPermDistCd");
        l.f(obj20, "bioPermDistName");
        l.f(obj21, "bioPermLocType");
        l.f(obj22, "bioPermLocal");
        l.f(str18, "bioPermPin");
        l.f(obj23, "bioPermSdName");
        l.f(str19, "bioPermSdcode");
        l.f(obj24, "bioPermVillTownCd");
        l.f(obj25, "bioPermVillTownName");
        l.f(obj26, "bioPhoneNo");
        l.f(obj27, "bioPoliceStncd");
        l.f(str20, "bioQmQualcd");
        l.f(obj28, "bioQmQualdesc");
        l.f(str21, "bioRecGenesis");
        l.f(obj29, "bioStayperiodPresentAddr");
        l.f(str22, "bioSwdFname");
        l.f(str23, "bioSwdFullName");
        l.f(obj30, "bioSwdLname");
        l.f(str24, "bioSwdMname");
        l.f(str25, "bioTempAdd1");
        l.f(str26, "bioTempAdd2");
        l.f(obj31, "bioTempAdd3");
        l.f(obj32, "bioTempDistCd");
        l.f(obj33, "bioTempDistName");
        l.f(obj34, "bioTempLocType");
        l.f(obj35, "bioTempLocal");
        l.f(str27, "bioTempPin");
        l.f(obj36, "bioTempSdName");
        l.f(str28, "bioTempSdcode");
        l.f(obj37, "bioTempVillTownCd");
        l.f(obj38, "bioTempVillTownName");
        l.f(obj39, "bioTokenId");
        l.f(str29, "bioUserId");
        l.f(obj40, "dob");
        l.f(obj41, "fullAddress");
        l.f(obj42, "pht");
        this.biPhoto = obj43;
        this.bioAadhaarName = obj44;
        this.bioAadhaarNo = obj45;
        this.bioAltMobileNo = obj46;
        this.bioApplno = str30;
        this.bioBioId = str31;
        this.bioBioidSearch = obj47;
        this.bioBirthplace = obj48;
        this.bioBloodGroup = str32;
        this.bioBloodGroupname = str33;
        this.bioCitiZen = str34;
        this.bioDependentRelation = str35;
        this.bioDigest = obj49;
        this.bioDlno = str36;
        this.bioDob = str8;
        this.bioEmailId = obj8;
        this.bioEndorsedt = obj9;
        this.bioEndorsementNo = obj10;
        this.bioEndorsetime = obj11;
        this.bioFirstName = str9;
        this.bioFullName = str10;
        this.bioGender = str11;
        this.bioGenderDesc = str12;
        this.bioIdentityMark1 = str13;
        this.bioIdentityMark2 = obj12;
        this.bioLastName = obj13;
        this.bioMiddleName = str14;
        this.bioMobileNo = obj14;
        this.bioNatName = str15;
        this.bioNprNo = obj15;
        this.bioOrganDonor = obj16;
        this.bioPerDetAadhaar = obj17;
        this.bioPermAdd1 = str16;
        this.bioPermAdd2 = str17;
        this.bioPermAdd3 = obj18;
        this.bioPermDistCd = obj19;
        this.bioPermDistName = obj20;
        this.bioPermLocType = obj21;
        this.bioPermLocal = obj22;
        this.bioPermPin = str18;
        this.bioPermSdName = obj23;
        this.bioPermSdcode = str19;
        this.bioPermVillTownCd = obj24;
        this.bioPermVillTownName = obj25;
        this.bioPhoneNo = obj26;
        this.bioPoliceStncd = obj27;
        this.bioQmQualcd = str20;
        this.bioQmQualdesc = obj28;
        this.bioRecGenesis = str21;
        this.bioStayperiodPresentAddr = obj29;
        this.bioSwdFname = str22;
        this.bioSwdFullName = str23;
        this.bioSwdLname = obj30;
        this.bioSwdMname = str24;
        this.bioTempAdd1 = str25;
        this.bioTempAdd2 = str26;
        this.bioTempAdd3 = obj31;
        this.bioTempDistCd = obj32;
        this.bioTempDistName = obj33;
        this.bioTempLocType = obj34;
        this.bioTempLocal = obj35;
        this.bioTempPin = str27;
        this.bioTempSdName = obj36;
        this.bioTempSdcode = str28;
        this.bioTempVillTownCd = obj37;
        this.bioTempVillTownName = obj38;
        this.bioTokenId = obj39;
        this.bioUserId = str29;
        this.dob = obj40;
        this.fullAddress = obj41;
        this.pht = obj42;
    }

    public static /* synthetic */ BioObj copy$default(BioObj bioObj, Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, Object obj5, Object obj6, String str3, String str4, String str5, String str6, Object obj7, String str7, String str8, Object obj8, Object obj9, Object obj10, Object obj11, String str9, String str10, String str11, String str12, String str13, Object obj12, Object obj13, String str14, Object obj14, String str15, Object obj15, Object obj16, Object obj17, String str16, String str17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22, String str18, Object obj23, String str19, Object obj24, Object obj25, Object obj26, Object obj27, String str20, Object obj28, String str21, Object obj29, String str22, String str23, Object obj30, String str24, String str25, String str26, Object obj31, Object obj32, Object obj33, Object obj34, Object obj35, String str27, Object obj36, String str28, Object obj37, Object obj38, Object obj39, String str29, Object obj40, Object obj41, Object obj42, int i10, int i11, int i12, Object obj43) {
        BioObj bioObj2 = bioObj;
        int i13 = i10;
        int i14 = i11;
        return bioObj.copy((i13 & 1) != 0 ? bioObj2.biPhoto : obj, (i13 & 2) != 0 ? bioObj2.bioAadhaarName : obj2, (i13 & 4) != 0 ? bioObj2.bioAadhaarNo : obj3, (i13 & 8) != 0 ? bioObj2.bioAltMobileNo : obj4, (i13 & 16) != 0 ? bioObj2.bioApplno : str, (i13 & 32) != 0 ? bioObj2.bioBioId : str2, (i13 & 64) != 0 ? bioObj2.bioBioidSearch : obj5, (i13 & 128) != 0 ? bioObj2.bioBirthplace : obj6, (i13 & 256) != 0 ? bioObj2.bioBloodGroup : str3, (i13 & 512) != 0 ? bioObj2.bioBloodGroupname : str4, (i13 & 1024) != 0 ? bioObj2.bioCitiZen : str5, (i13 & 2048) != 0 ? bioObj2.bioDependentRelation : str6, (i13 & 4096) != 0 ? bioObj2.bioDigest : obj7, (i13 & 8192) != 0 ? bioObj2.bioDlno : str7, (i13 & 16384) != 0 ? bioObj2.bioDob : str8, (i13 & 32768) != 0 ? bioObj2.bioEmailId : obj8, (i13 & 65536) != 0 ? bioObj2.bioEndorsedt : obj9, (i13 & 131072) != 0 ? bioObj2.bioEndorsementNo : obj10, (i13 & 262144) != 0 ? bioObj2.bioEndorsetime : obj11, (i13 & 524288) != 0 ? bioObj2.bioFirstName : str9, (i13 & 1048576) != 0 ? bioObj2.bioFullName : str10, (i13 & 2097152) != 0 ? bioObj2.bioGender : str11, (i13 & 4194304) != 0 ? bioObj2.bioGenderDesc : str12, (i13 & 8388608) != 0 ? bioObj2.bioIdentityMark1 : str13, (i13 & 16777216) != 0 ? bioObj2.bioIdentityMark2 : obj12, (i13 & 33554432) != 0 ? bioObj2.bioLastName : obj13, (i13 & 67108864) != 0 ? bioObj2.bioMiddleName : str14, (i13 & 134217728) != 0 ? bioObj2.bioMobileNo : obj14, (i13 & 268435456) != 0 ? bioObj2.bioNatName : str15, (i13 & 536870912) != 0 ? bioObj2.bioNprNo : obj15, (i13 & 1073741824) != 0 ? bioObj2.bioOrganDonor : obj16, (i13 & Integer.MIN_VALUE) != 0 ? bioObj2.bioPerDetAadhaar : obj17, (i14 & 1) != 0 ? bioObj2.bioPermAdd1 : str16, (i14 & 2) != 0 ? bioObj2.bioPermAdd2 : str17, (i14 & 4) != 0 ? bioObj2.bioPermAdd3 : obj18, (i14 & 8) != 0 ? bioObj2.bioPermDistCd : obj19, (i14 & 16) != 0 ? bioObj2.bioPermDistName : obj20, (i14 & 32) != 0 ? bioObj2.bioPermLocType : obj21, (i14 & 64) != 0 ? bioObj2.bioPermLocal : obj22, (i14 & 128) != 0 ? bioObj2.bioPermPin : str18, (i14 & 256) != 0 ? bioObj2.bioPermSdName : obj23, (i14 & 512) != 0 ? bioObj2.bioPermSdcode : str19, (i14 & 1024) != 0 ? bioObj2.bioPermVillTownCd : obj24, (i14 & 2048) != 0 ? bioObj2.bioPermVillTownName : obj25, (i14 & 4096) != 0 ? bioObj2.bioPhoneNo : obj26, (i14 & 8192) != 0 ? bioObj2.bioPoliceStncd : obj27, (i14 & 16384) != 0 ? bioObj2.bioQmQualcd : str20, (i14 & 32768) != 0 ? bioObj2.bioQmQualdesc : obj28, (i14 & 65536) != 0 ? bioObj2.bioRecGenesis : str21, (i14 & 131072) != 0 ? bioObj2.bioStayperiodPresentAddr : obj29, (i14 & 262144) != 0 ? bioObj2.bioSwdFname : str22, (i14 & 524288) != 0 ? bioObj2.bioSwdFullName : str23, (i14 & 1048576) != 0 ? bioObj2.bioSwdLname : obj30, (i14 & 2097152) != 0 ? bioObj2.bioSwdMname : str24, (i14 & 4194304) != 0 ? bioObj2.bioTempAdd1 : str25, (i14 & 8388608) != 0 ? bioObj2.bioTempAdd2 : str26, (i14 & 16777216) != 0 ? bioObj2.bioTempAdd3 : obj31, (i14 & 33554432) != 0 ? bioObj2.bioTempDistCd : obj32, (i14 & 67108864) != 0 ? bioObj2.bioTempDistName : obj33, (i14 & 134217728) != 0 ? bioObj2.bioTempLocType : obj34, (i14 & 268435456) != 0 ? bioObj2.bioTempLocal : obj35, (i14 & 536870912) != 0 ? bioObj2.bioTempPin : str27, (i14 & 1073741824) != 0 ? bioObj2.bioTempSdName : obj36, (i14 & Integer.MIN_VALUE) != 0 ? bioObj2.bioTempSdcode : str28, (i12 & 1) != 0 ? bioObj2.bioTempVillTownCd : obj37, (i12 & 2) != 0 ? bioObj2.bioTempVillTownName : obj38, (i12 & 4) != 0 ? bioObj2.bioTokenId : obj39, (i12 & 8) != 0 ? bioObj2.bioUserId : str29, (i12 & 16) != 0 ? bioObj2.dob : obj40, (i12 & 32) != 0 ? bioObj2.fullAddress : obj41, (i12 & 64) != 0 ? bioObj2.pht : obj42);
    }

    public final Object component1() {
        return this.biPhoto;
    }

    public final String component10() {
        return this.bioBloodGroupname;
    }

    public final String component11() {
        return this.bioCitiZen;
    }

    public final String component12() {
        return this.bioDependentRelation;
    }

    public final Object component13() {
        return this.bioDigest;
    }

    public final String component14() {
        return this.bioDlno;
    }

    public final String component15() {
        return this.bioDob;
    }

    public final Object component16() {
        return this.bioEmailId;
    }

    public final Object component17() {
        return this.bioEndorsedt;
    }

    public final Object component18() {
        return this.bioEndorsementNo;
    }

    public final Object component19() {
        return this.bioEndorsetime;
    }

    public final Object component2() {
        return this.bioAadhaarName;
    }

    public final String component20() {
        return this.bioFirstName;
    }

    public final String component21() {
        return this.bioFullName;
    }

    public final String component22() {
        return this.bioGender;
    }

    public final String component23() {
        return this.bioGenderDesc;
    }

    public final String component24() {
        return this.bioIdentityMark1;
    }

    public final Object component25() {
        return this.bioIdentityMark2;
    }

    public final Object component26() {
        return this.bioLastName;
    }

    public final String component27() {
        return this.bioMiddleName;
    }

    public final Object component28() {
        return this.bioMobileNo;
    }

    public final String component29() {
        return this.bioNatName;
    }

    public final Object component3() {
        return this.bioAadhaarNo;
    }

    public final Object component30() {
        return this.bioNprNo;
    }

    public final Object component31() {
        return this.bioOrganDonor;
    }

    public final Object component32() {
        return this.bioPerDetAadhaar;
    }

    public final String component33() {
        return this.bioPermAdd1;
    }

    public final String component34() {
        return this.bioPermAdd2;
    }

    public final Object component35() {
        return this.bioPermAdd3;
    }

    public final Object component36() {
        return this.bioPermDistCd;
    }

    public final Object component37() {
        return this.bioPermDistName;
    }

    public final Object component38() {
        return this.bioPermLocType;
    }

    public final Object component39() {
        return this.bioPermLocal;
    }

    public final Object component4() {
        return this.bioAltMobileNo;
    }

    public final String component40() {
        return this.bioPermPin;
    }

    public final Object component41() {
        return this.bioPermSdName;
    }

    public final String component42() {
        return this.bioPermSdcode;
    }

    public final Object component43() {
        return this.bioPermVillTownCd;
    }

    public final Object component44() {
        return this.bioPermVillTownName;
    }

    public final Object component45() {
        return this.bioPhoneNo;
    }

    public final Object component46() {
        return this.bioPoliceStncd;
    }

    public final String component47() {
        return this.bioQmQualcd;
    }

    public final Object component48() {
        return this.bioQmQualdesc;
    }

    public final String component49() {
        return this.bioRecGenesis;
    }

    public final String component5() {
        return this.bioApplno;
    }

    public final Object component50() {
        return this.bioStayperiodPresentAddr;
    }

    public final String component51() {
        return this.bioSwdFname;
    }

    public final String component52() {
        return this.bioSwdFullName;
    }

    public final Object component53() {
        return this.bioSwdLname;
    }

    public final String component54() {
        return this.bioSwdMname;
    }

    public final String component55() {
        return this.bioTempAdd1;
    }

    public final String component56() {
        return this.bioTempAdd2;
    }

    public final Object component57() {
        return this.bioTempAdd3;
    }

    public final Object component58() {
        return this.bioTempDistCd;
    }

    public final Object component59() {
        return this.bioTempDistName;
    }

    public final String component6() {
        return this.bioBioId;
    }

    public final Object component60() {
        return this.bioTempLocType;
    }

    public final Object component61() {
        return this.bioTempLocal;
    }

    public final String component62() {
        return this.bioTempPin;
    }

    public final Object component63() {
        return this.bioTempSdName;
    }

    public final String component64() {
        return this.bioTempSdcode;
    }

    public final Object component65() {
        return this.bioTempVillTownCd;
    }

    public final Object component66() {
        return this.bioTempVillTownName;
    }

    public final Object component67() {
        return this.bioTokenId;
    }

    public final String component68() {
        return this.bioUserId;
    }

    public final Object component69() {
        return this.dob;
    }

    public final Object component7() {
        return this.bioBioidSearch;
    }

    public final Object component70() {
        return this.fullAddress;
    }

    public final Object component71() {
        return this.pht;
    }

    public final Object component8() {
        return this.bioBirthplace;
    }

    public final String component9() {
        return this.bioBloodGroup;
    }

    public final BioObj copy(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, Object obj5, Object obj6, String str3, String str4, String str5, String str6, Object obj7, String str7, String str8, Object obj8, Object obj9, Object obj10, Object obj11, String str9, String str10, String str11, String str12, String str13, Object obj12, Object obj13, String str14, Object obj14, String str15, Object obj15, Object obj16, Object obj17, String str16, String str17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22, String str18, Object obj23, String str19, Object obj24, Object obj25, Object obj26, Object obj27, String str20, Object obj28, String str21, Object obj29, String str22, String str23, Object obj30, String str24, String str25, String str26, Object obj31, Object obj32, Object obj33, Object obj34, Object obj35, String str27, Object obj36, String str28, Object obj37, Object obj38, Object obj39, String str29, Object obj40, Object obj41, Object obj42) {
        Object obj43 = obj;
        l.f(obj43, "biPhoto");
        l.f(obj2, "bioAadhaarName");
        l.f(obj3, "bioAadhaarNo");
        l.f(obj4, "bioAltMobileNo");
        l.f(str, "bioApplno");
        l.f(str2, "bioBioId");
        l.f(obj5, "bioBioidSearch");
        l.f(obj6, "bioBirthplace");
        l.f(str3, "bioBloodGroup");
        l.f(str4, "bioBloodGroupname");
        l.f(str5, "bioCitiZen");
        l.f(str6, "bioDependentRelation");
        l.f(obj7, "bioDigest");
        l.f(str7, "bioDlno");
        l.f(str8, "bioDob");
        l.f(obj8, "bioEmailId");
        l.f(obj9, "bioEndorsedt");
        l.f(obj10, "bioEndorsementNo");
        l.f(obj11, "bioEndorsetime");
        l.f(str9, "bioFirstName");
        l.f(str10, "bioFullName");
        l.f(str11, "bioGender");
        l.f(str12, "bioGenderDesc");
        l.f(str13, "bioIdentityMark1");
        l.f(obj12, "bioIdentityMark2");
        l.f(obj13, "bioLastName");
        l.f(str14, "bioMiddleName");
        l.f(obj14, "bioMobileNo");
        l.f(str15, "bioNatName");
        l.f(obj15, "bioNprNo");
        l.f(obj16, "bioOrganDonor");
        l.f(obj17, "bioPerDetAadhaar");
        l.f(str17, "bioPermAdd2");
        l.f(obj18, "bioPermAdd3");
        l.f(obj19, "bioPermDistCd");
        l.f(obj20, "bioPermDistName");
        l.f(obj21, "bioPermLocType");
        l.f(obj22, "bioPermLocal");
        l.f(str18, "bioPermPin");
        l.f(obj23, "bioPermSdName");
        l.f(str19, "bioPermSdcode");
        l.f(obj24, "bioPermVillTownCd");
        l.f(obj25, "bioPermVillTownName");
        l.f(obj26, "bioPhoneNo");
        l.f(obj27, "bioPoliceStncd");
        l.f(str20, "bioQmQualcd");
        l.f(obj28, "bioQmQualdesc");
        l.f(str21, "bioRecGenesis");
        l.f(obj29, "bioStayperiodPresentAddr");
        l.f(str22, "bioSwdFname");
        l.f(str23, "bioSwdFullName");
        l.f(obj30, "bioSwdLname");
        l.f(str24, "bioSwdMname");
        l.f(str25, "bioTempAdd1");
        l.f(str26, "bioTempAdd2");
        l.f(obj31, "bioTempAdd3");
        l.f(obj32, "bioTempDistCd");
        l.f(obj33, "bioTempDistName");
        l.f(obj34, "bioTempLocType");
        l.f(obj35, "bioTempLocal");
        l.f(str27, "bioTempPin");
        l.f(obj36, "bioTempSdName");
        l.f(str28, "bioTempSdcode");
        l.f(obj37, "bioTempVillTownCd");
        l.f(obj38, "bioTempVillTownName");
        l.f(obj39, "bioTokenId");
        l.f(str29, "bioUserId");
        l.f(obj40, "dob");
        l.f(obj41, "fullAddress");
        l.f(obj42, "pht");
        return new BioObj(obj43, obj2, obj3, obj4, str, str2, obj5, obj6, str3, str4, str5, str6, obj7, str7, str8, obj8, obj9, obj10, obj11, str9, str10, str11, str12, str13, obj12, obj13, str14, obj14, str15, obj15, obj16, obj17, str16, str17, obj18, obj19, obj20, obj21, obj22, str18, obj23, str19, obj24, obj25, obj26, obj27, str20, obj28, str21, obj29, str22, str23, obj30, str24, str25, str26, obj31, obj32, obj33, obj34, obj35, str27, obj36, str28, obj37, obj38, obj39, str29, obj40, obj41, obj42);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BioObj)) {
            return false;
        }
        BioObj bioObj = (BioObj) obj;
        return l.a(this.biPhoto, bioObj.biPhoto) && l.a(this.bioAadhaarName, bioObj.bioAadhaarName) && l.a(this.bioAadhaarNo, bioObj.bioAadhaarNo) && l.a(this.bioAltMobileNo, bioObj.bioAltMobileNo) && l.a(this.bioApplno, bioObj.bioApplno) && l.a(this.bioBioId, bioObj.bioBioId) && l.a(this.bioBioidSearch, bioObj.bioBioidSearch) && l.a(this.bioBirthplace, bioObj.bioBirthplace) && l.a(this.bioBloodGroup, bioObj.bioBloodGroup) && l.a(this.bioBloodGroupname, bioObj.bioBloodGroupname) && l.a(this.bioCitiZen, bioObj.bioCitiZen) && l.a(this.bioDependentRelation, bioObj.bioDependentRelation) && l.a(this.bioDigest, bioObj.bioDigest) && l.a(this.bioDlno, bioObj.bioDlno) && l.a(this.bioDob, bioObj.bioDob) && l.a(this.bioEmailId, bioObj.bioEmailId) && l.a(this.bioEndorsedt, bioObj.bioEndorsedt) && l.a(this.bioEndorsementNo, bioObj.bioEndorsementNo) && l.a(this.bioEndorsetime, bioObj.bioEndorsetime) && l.a(this.bioFirstName, bioObj.bioFirstName) && l.a(this.bioFullName, bioObj.bioFullName) && l.a(this.bioGender, bioObj.bioGender) && l.a(this.bioGenderDesc, bioObj.bioGenderDesc) && l.a(this.bioIdentityMark1, bioObj.bioIdentityMark1) && l.a(this.bioIdentityMark2, bioObj.bioIdentityMark2) && l.a(this.bioLastName, bioObj.bioLastName) && l.a(this.bioMiddleName, bioObj.bioMiddleName) && l.a(this.bioMobileNo, bioObj.bioMobileNo) && l.a(this.bioNatName, bioObj.bioNatName) && l.a(this.bioNprNo, bioObj.bioNprNo) && l.a(this.bioOrganDonor, bioObj.bioOrganDonor) && l.a(this.bioPerDetAadhaar, bioObj.bioPerDetAadhaar) && l.a(this.bioPermAdd1, bioObj.bioPermAdd1) && l.a(this.bioPermAdd2, bioObj.bioPermAdd2) && l.a(this.bioPermAdd3, bioObj.bioPermAdd3) && l.a(this.bioPermDistCd, bioObj.bioPermDistCd) && l.a(this.bioPermDistName, bioObj.bioPermDistName) && l.a(this.bioPermLocType, bioObj.bioPermLocType) && l.a(this.bioPermLocal, bioObj.bioPermLocal) && l.a(this.bioPermPin, bioObj.bioPermPin) && l.a(this.bioPermSdName, bioObj.bioPermSdName) && l.a(this.bioPermSdcode, bioObj.bioPermSdcode) && l.a(this.bioPermVillTownCd, bioObj.bioPermVillTownCd) && l.a(this.bioPermVillTownName, bioObj.bioPermVillTownName) && l.a(this.bioPhoneNo, bioObj.bioPhoneNo) && l.a(this.bioPoliceStncd, bioObj.bioPoliceStncd) && l.a(this.bioQmQualcd, bioObj.bioQmQualcd) && l.a(this.bioQmQualdesc, bioObj.bioQmQualdesc) && l.a(this.bioRecGenesis, bioObj.bioRecGenesis) && l.a(this.bioStayperiodPresentAddr, bioObj.bioStayperiodPresentAddr) && l.a(this.bioSwdFname, bioObj.bioSwdFname) && l.a(this.bioSwdFullName, bioObj.bioSwdFullName) && l.a(this.bioSwdLname, bioObj.bioSwdLname) && l.a(this.bioSwdMname, bioObj.bioSwdMname) && l.a(this.bioTempAdd1, bioObj.bioTempAdd1) && l.a(this.bioTempAdd2, bioObj.bioTempAdd2) && l.a(this.bioTempAdd3, bioObj.bioTempAdd3) && l.a(this.bioTempDistCd, bioObj.bioTempDistCd) && l.a(this.bioTempDistName, bioObj.bioTempDistName) && l.a(this.bioTempLocType, bioObj.bioTempLocType) && l.a(this.bioTempLocal, bioObj.bioTempLocal) && l.a(this.bioTempPin, bioObj.bioTempPin) && l.a(this.bioTempSdName, bioObj.bioTempSdName) && l.a(this.bioTempSdcode, bioObj.bioTempSdcode) && l.a(this.bioTempVillTownCd, bioObj.bioTempVillTownCd) && l.a(this.bioTempVillTownName, bioObj.bioTempVillTownName) && l.a(this.bioTokenId, bioObj.bioTokenId) && l.a(this.bioUserId, bioObj.bioUserId) && l.a(this.dob, bioObj.dob) && l.a(this.fullAddress, bioObj.fullAddress) && l.a(this.pht, bioObj.pht);
    }

    public final Object getBiPhoto() {
        return this.biPhoto;
    }

    public final Object getBioAadhaarName() {
        return this.bioAadhaarName;
    }

    public final Object getBioAadhaarNo() {
        return this.bioAadhaarNo;
    }

    public final Object getBioAltMobileNo() {
        return this.bioAltMobileNo;
    }

    public final String getBioApplno() {
        return this.bioApplno;
    }

    public final String getBioBioId() {
        return this.bioBioId;
    }

    public final Object getBioBioidSearch() {
        return this.bioBioidSearch;
    }

    public final Object getBioBirthplace() {
        return this.bioBirthplace;
    }

    public final String getBioBloodGroup() {
        return this.bioBloodGroup;
    }

    public final String getBioBloodGroupname() {
        return this.bioBloodGroupname;
    }

    public final String getBioCitiZen() {
        return this.bioCitiZen;
    }

    public final String getBioDependentRelation() {
        return this.bioDependentRelation;
    }

    public final Object getBioDigest() {
        return this.bioDigest;
    }

    public final String getBioDlno() {
        return this.bioDlno;
    }

    public final String getBioDob() {
        return this.bioDob;
    }

    public final Object getBioEmailId() {
        return this.bioEmailId;
    }

    public final Object getBioEndorsedt() {
        return this.bioEndorsedt;
    }

    public final Object getBioEndorsementNo() {
        return this.bioEndorsementNo;
    }

    public final Object getBioEndorsetime() {
        return this.bioEndorsetime;
    }

    public final String getBioFirstName() {
        return this.bioFirstName;
    }

    public final String getBioFullName() {
        return this.bioFullName;
    }

    public final String getBioGender() {
        return this.bioGender;
    }

    public final String getBioGenderDesc() {
        return this.bioGenderDesc;
    }

    public final String getBioIdentityMark1() {
        return this.bioIdentityMark1;
    }

    public final Object getBioIdentityMark2() {
        return this.bioIdentityMark2;
    }

    public final Object getBioLastName() {
        return this.bioLastName;
    }

    public final String getBioMiddleName() {
        return this.bioMiddleName;
    }

    public final Object getBioMobileNo() {
        return this.bioMobileNo;
    }

    public final String getBioNatName() {
        return this.bioNatName;
    }

    public final Object getBioNprNo() {
        return this.bioNprNo;
    }

    public final Object getBioOrganDonor() {
        return this.bioOrganDonor;
    }

    public final Object getBioPerDetAadhaar() {
        return this.bioPerDetAadhaar;
    }

    public final String getBioPermAdd1() {
        return this.bioPermAdd1;
    }

    public final String getBioPermAdd2() {
        return this.bioPermAdd2;
    }

    public final Object getBioPermAdd3() {
        return this.bioPermAdd3;
    }

    public final Object getBioPermDistCd() {
        return this.bioPermDistCd;
    }

    public final Object getBioPermDistName() {
        return this.bioPermDistName;
    }

    public final Object getBioPermLocType() {
        return this.bioPermLocType;
    }

    public final Object getBioPermLocal() {
        return this.bioPermLocal;
    }

    public final String getBioPermPin() {
        return this.bioPermPin;
    }

    public final Object getBioPermSdName() {
        return this.bioPermSdName;
    }

    public final String getBioPermSdcode() {
        return this.bioPermSdcode;
    }

    public final Object getBioPermVillTownCd() {
        return this.bioPermVillTownCd;
    }

    public final Object getBioPermVillTownName() {
        return this.bioPermVillTownName;
    }

    public final Object getBioPhoneNo() {
        return this.bioPhoneNo;
    }

    public final Object getBioPoliceStncd() {
        return this.bioPoliceStncd;
    }

    public final String getBioQmQualcd() {
        return this.bioQmQualcd;
    }

    public final Object getBioQmQualdesc() {
        return this.bioQmQualdesc;
    }

    public final String getBioRecGenesis() {
        return this.bioRecGenesis;
    }

    public final Object getBioStayperiodPresentAddr() {
        return this.bioStayperiodPresentAddr;
    }

    public final String getBioSwdFname() {
        return this.bioSwdFname;
    }

    public final String getBioSwdFullName() {
        return this.bioSwdFullName;
    }

    public final Object getBioSwdLname() {
        return this.bioSwdLname;
    }

    public final String getBioSwdMname() {
        return this.bioSwdMname;
    }

    public final String getBioTempAdd1() {
        return this.bioTempAdd1;
    }

    public final String getBioTempAdd2() {
        return this.bioTempAdd2;
    }

    public final Object getBioTempAdd3() {
        return this.bioTempAdd3;
    }

    public final Object getBioTempDistCd() {
        return this.bioTempDistCd;
    }

    public final Object getBioTempDistName() {
        return this.bioTempDistName;
    }

    public final Object getBioTempLocType() {
        return this.bioTempLocType;
    }

    public final Object getBioTempLocal() {
        return this.bioTempLocal;
    }

    public final String getBioTempPin() {
        return this.bioTempPin;
    }

    public final Object getBioTempSdName() {
        return this.bioTempSdName;
    }

    public final String getBioTempSdcode() {
        return this.bioTempSdcode;
    }

    public final Object getBioTempVillTownCd() {
        return this.bioTempVillTownCd;
    }

    public final Object getBioTempVillTownName() {
        return this.bioTempVillTownName;
    }

    public final Object getBioTokenId() {
        return this.bioTokenId;
    }

    public final String getBioUserId() {
        return this.bioUserId;
    }

    public final Object getDob() {
        return this.dob;
    }

    public final Object getFullAddress() {
        return this.fullAddress;
    }

    public final Object getPht() {
        return this.pht;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.biPhoto.hashCode() * 31) + this.bioAadhaarName.hashCode()) * 31) + this.bioAadhaarNo.hashCode()) * 31) + this.bioAltMobileNo.hashCode()) * 31) + this.bioApplno.hashCode()) * 31) + this.bioBioId.hashCode()) * 31) + this.bioBioidSearch.hashCode()) * 31) + this.bioBirthplace.hashCode()) * 31) + this.bioBloodGroup.hashCode()) * 31) + this.bioBloodGroupname.hashCode()) * 31) + this.bioCitiZen.hashCode()) * 31) + this.bioDependentRelation.hashCode()) * 31) + this.bioDigest.hashCode()) * 31) + this.bioDlno.hashCode()) * 31) + this.bioDob.hashCode()) * 31) + this.bioEmailId.hashCode()) * 31) + this.bioEndorsedt.hashCode()) * 31) + this.bioEndorsementNo.hashCode()) * 31) + this.bioEndorsetime.hashCode()) * 31) + this.bioFirstName.hashCode()) * 31) + this.bioFullName.hashCode()) * 31) + this.bioGender.hashCode()) * 31) + this.bioGenderDesc.hashCode()) * 31) + this.bioIdentityMark1.hashCode()) * 31) + this.bioIdentityMark2.hashCode()) * 31) + this.bioLastName.hashCode()) * 31) + this.bioMiddleName.hashCode()) * 31) + this.bioMobileNo.hashCode()) * 31) + this.bioNatName.hashCode()) * 31) + this.bioNprNo.hashCode()) * 31) + this.bioOrganDonor.hashCode()) * 31) + this.bioPerDetAadhaar.hashCode()) * 31;
        String str = this.bioPermAdd1;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.bioPermAdd2.hashCode()) * 31) + this.bioPermAdd3.hashCode()) * 31) + this.bioPermDistCd.hashCode()) * 31) + this.bioPermDistName.hashCode()) * 31) + this.bioPermLocType.hashCode()) * 31) + this.bioPermLocal.hashCode()) * 31) + this.bioPermPin.hashCode()) * 31) + this.bioPermSdName.hashCode()) * 31) + this.bioPermSdcode.hashCode()) * 31) + this.bioPermVillTownCd.hashCode()) * 31) + this.bioPermVillTownName.hashCode()) * 31) + this.bioPhoneNo.hashCode()) * 31) + this.bioPoliceStncd.hashCode()) * 31) + this.bioQmQualcd.hashCode()) * 31) + this.bioQmQualdesc.hashCode()) * 31) + this.bioRecGenesis.hashCode()) * 31) + this.bioStayperiodPresentAddr.hashCode()) * 31) + this.bioSwdFname.hashCode()) * 31) + this.bioSwdFullName.hashCode()) * 31) + this.bioSwdLname.hashCode()) * 31) + this.bioSwdMname.hashCode()) * 31) + this.bioTempAdd1.hashCode()) * 31) + this.bioTempAdd2.hashCode()) * 31) + this.bioTempAdd3.hashCode()) * 31) + this.bioTempDistCd.hashCode()) * 31) + this.bioTempDistName.hashCode()) * 31) + this.bioTempLocType.hashCode()) * 31) + this.bioTempLocal.hashCode()) * 31) + this.bioTempPin.hashCode()) * 31) + this.bioTempSdName.hashCode()) * 31) + this.bioTempSdcode.hashCode()) * 31) + this.bioTempVillTownCd.hashCode()) * 31) + this.bioTempVillTownName.hashCode()) * 31) + this.bioTokenId.hashCode()) * 31) + this.bioUserId.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.fullAddress.hashCode()) * 31) + this.pht.hashCode();
    }

    public String toString() {
        return "BioObj(biPhoto=" + this.biPhoto + ", bioAadhaarName=" + this.bioAadhaarName + ", bioAadhaarNo=" + this.bioAadhaarNo + ", bioAltMobileNo=" + this.bioAltMobileNo + ", bioApplno=" + this.bioApplno + ", bioBioId=" + this.bioBioId + ", bioBioidSearch=" + this.bioBioidSearch + ", bioBirthplace=" + this.bioBirthplace + ", bioBloodGroup=" + this.bioBloodGroup + ", bioBloodGroupname=" + this.bioBloodGroupname + ", bioCitiZen=" + this.bioCitiZen + ", bioDependentRelation=" + this.bioDependentRelation + ", bioDigest=" + this.bioDigest + ", bioDlno=" + this.bioDlno + ", bioDob=" + this.bioDob + ", bioEmailId=" + this.bioEmailId + ", bioEndorsedt=" + this.bioEndorsedt + ", bioEndorsementNo=" + this.bioEndorsementNo + ", bioEndorsetime=" + this.bioEndorsetime + ", bioFirstName=" + this.bioFirstName + ", bioFullName=" + this.bioFullName + ", bioGender=" + this.bioGender + ", bioGenderDesc=" + this.bioGenderDesc + ", bioIdentityMark1=" + this.bioIdentityMark1 + ", bioIdentityMark2=" + this.bioIdentityMark2 + ", bioLastName=" + this.bioLastName + ", bioMiddleName=" + this.bioMiddleName + ", bioMobileNo=" + this.bioMobileNo + ", bioNatName=" + this.bioNatName + ", bioNprNo=" + this.bioNprNo + ", bioOrganDonor=" + this.bioOrganDonor + ", bioPerDetAadhaar=" + this.bioPerDetAadhaar + ", bioPermAdd1=" + this.bioPermAdd1 + ", bioPermAdd2=" + this.bioPermAdd2 + ", bioPermAdd3=" + this.bioPermAdd3 + ", bioPermDistCd=" + this.bioPermDistCd + ", bioPermDistName=" + this.bioPermDistName + ", bioPermLocType=" + this.bioPermLocType + ", bioPermLocal=" + this.bioPermLocal + ", bioPermPin=" + this.bioPermPin + ", bioPermSdName=" + this.bioPermSdName + ", bioPermSdcode=" + this.bioPermSdcode + ", bioPermVillTownCd=" + this.bioPermVillTownCd + ", bioPermVillTownName=" + this.bioPermVillTownName + ", bioPhoneNo=" + this.bioPhoneNo + ", bioPoliceStncd=" + this.bioPoliceStncd + ", bioQmQualcd=" + this.bioQmQualcd + ", bioQmQualdesc=" + this.bioQmQualdesc + ", bioRecGenesis=" + this.bioRecGenesis + ", bioStayperiodPresentAddr=" + this.bioStayperiodPresentAddr + ", bioSwdFname=" + this.bioSwdFname + ", bioSwdFullName=" + this.bioSwdFullName + ", bioSwdLname=" + this.bioSwdLname + ", bioSwdMname=" + this.bioSwdMname + ", bioTempAdd1=" + this.bioTempAdd1 + ", bioTempAdd2=" + this.bioTempAdd2 + ", bioTempAdd3=" + this.bioTempAdd3 + ", bioTempDistCd=" + this.bioTempDistCd + ", bioTempDistName=" + this.bioTempDistName + ", bioTempLocType=" + this.bioTempLocType + ", bioTempLocal=" + this.bioTempLocal + ", bioTempPin=" + this.bioTempPin + ", bioTempSdName=" + this.bioTempSdName + ", bioTempSdcode=" + this.bioTempSdcode + ", bioTempVillTownCd=" + this.bioTempVillTownCd + ", bioTempVillTownName=" + this.bioTempVillTownName + ", bioTokenId=" + this.bioTokenId + ", bioUserId=" + this.bioUserId + ", dob=" + this.dob + ", fullAddress=" + this.fullAddress + ", pht=" + this.pht + ')';
    }
}
