package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
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
    private final Object bioDlno;
    private final String bioDob;
    private final Object bioEmailId;
    private final Object bioEndorsedt;
    private final Object bioEndorsementNo;
    private final Object bioEndorsetime;
    private final String bioFirstName;
    private final String bioFullName;
    private final String bioGender;
    private final String bioGenderDesc;
    private final Object bioIdentityMark1;
    private final Object bioIdentityMark2;
    private final String bioLastName;
    private final Object bioMiddleName;
    private final Object bioMobileNo;
    private final String bioNatName;
    private final Object bioNprNo;
    private final String bioOrganDonor;
    private final Object bioPerDetAadhaar;
    private final String bioPermAdd1;
    private final String bioPermAdd2;
    private final String bioPermAdd3;
    private final Object bioPermDistCd;
    private final Object bioPermDistName;
    private final String bioPermLocType;
    private final String bioPermLocal;
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
    private final String bioSwdLname;
    private final Object bioSwdMname;
    private final String bioTempAdd1;
    private final String bioTempAdd2;
    private final String bioTempAdd3;
    private final Object bioTempDistCd;
    private final Object bioTempDistName;
    private final String bioTempLocType;
    private final String bioTempLocal;
    private final String bioTempPin;
    private final Object bioTempSdName;
    private final String bioTempSdcode;
    private final Object bioTempVillTownCd;
    private final Object bioTempVillTownName;
    private final Object bioTokenId;
    private final String bioUserId;
    private final Object dob;
    private final String fullAddress;
    private final Object pht;

    public BioObj() {
        this((Object) null, (Object) null, (Object) null, (String) null, (String) null, (Object) null, (String) null, (Object) null, (String) null, (Object) null, (String) null, (String) null, (Object) null, (Object) null, (String) null, (Object) null, (String) null, (String) null, (Object) null, (Object) null, (String) null, (Object) null, (Object) null, (Object) null, (Object) null, (String) null, (Object) null, (Object) null, (Object) null, (String) null, (Object) null, (String) null, (String) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Object) null, (Object) null, (Object) null, (String) null, (String) null, (Object) null, (Object) null, (Object) null, (Object) null, (String) null, (Object) null, (String) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (Object) null, (String) null, (String) null, (Object) null, (Object) null, (String) null, (Object) null, (String) null, (Object) null, (String) null, (String) null, (Object) null, (Object) null, (String) null, -1, -1, 127, (g) null);
    }

    public static /* synthetic */ BioObj copy$default(BioObj bioObj, Object obj, Object obj2, Object obj3, String str, String str2, Object obj4, String str3, Object obj5, String str4, Object obj6, String str5, String str6, Object obj7, Object obj8, String str7, Object obj9, String str8, String str9, Object obj10, Object obj11, String str10, Object obj12, Object obj13, Object obj14, Object obj15, String str11, Object obj16, Object obj17, Object obj18, String str12, Object obj19, String str13, String str14, Object obj20, String str15, String str16, String str17, String str18, String str19, String str20, Object obj21, Object obj22, Object obj23, String str21, String str22, Object obj24, Object obj25, Object obj26, Object obj27, String str23, Object obj28, String str24, Object obj29, String str25, String str26, String str27, String str28, Object obj30, String str29, String str30, Object obj31, Object obj32, String str31, Object obj33, String str32, Object obj34, String str33, String str34, Object obj35, Object obj36, String str35, int i10, int i11, int i12, Object obj37) {
        BioObj bioObj2 = bioObj;
        int i13 = i10;
        int i14 = i11;
        return bioObj.copy((i13 & 1) != 0 ? bioObj2.bioPermSdName : obj, (i13 & 2) != 0 ? bioObj2.bioDigest : obj2, (i13 & 4) != 0 ? bioObj2.bioStayperiodPresentAddr : obj3, (i13 & 8) != 0 ? bioObj2.bioTempPin : str, (i13 & 16) != 0 ? bioObj2.bioTempAdd2 : str2, (i13 & 32) != 0 ? bioObj2.bioBioidSearch : obj4, (i13 & 64) != 0 ? bioObj2.bioTempAdd1 : str3, (i13 & 128) != 0 ? bioObj2.bioTokenId : obj5, (i13 & 256) != 0 ? bioObj2.bioTempAdd3 : str4, (i13 & 512) != 0 ? bioObj2.bioEndorsedt : obj6, (i13 & 1024) != 0 ? bioObj2.bioSwdLname : str5, (i13 & 2048) != 0 ? bioObj2.bioRecGenesis : str6, (i13 & 4096) != 0 ? bioObj2.bioPermVillTownCd : obj7, (i13 & 8192) != 0 ? bioObj2.bioIdentityMark1 : obj8, (i13 & 16384) != 0 ? bioObj2.bioUserId : str7, (i13 & 32768) != 0 ? bioObj2.bioIdentityMark2 : obj9, (i13 & 65536) != 0 ? bioObj2.bioQmQualcd : str8, (i13 & 131072) != 0 ? bioObj2.bioNatName : str9, (i13 & 262144) != 0 ? bioObj2.bioNprNo : obj10, (i13 & 524288) != 0 ? bioObj2.bioAadhaarNo : obj11, (i13 & 1048576) != 0 ? bioObj2.bioGender : str10, (i13 & 2097152) != 0 ? bioObj2.bioPermDistCd : obj12, (i13 & 4194304) != 0 ? bioObj2.bioTempDistCd : obj13, (i13 & 8388608) != 0 ? bioObj2.bioPhoneNo : obj14, (i13 & 16777216) != 0 ? bioObj2.bioTempVillTownCd : obj15, (i13 & 33554432) != 0 ? bioObj2.bioFirstName : str11, (i13 & 67108864) != 0 ? bioObj2.bioMobileNo : obj16, (i13 & 134217728) != 0 ? bioObj2.bioEndorsetime : obj17, (i13 & 268435456) != 0 ? bioObj2.bioPermVillTownName : obj18, (i13 & 536870912) != 0 ? bioObj2.bioOrganDonor : str12, (i13 & 1073741824) != 0 ? bioObj2.bioTempSdName : obj19, (i13 & Integer.MIN_VALUE) != 0 ? bioObj2.bioBloodGroupname : str13, (i14 & 1) != 0 ? bioObj2.bioTempLocal : str14, (i14 & 2) != 0 ? bioObj2.dob : obj20, (i14 & 4) != 0 ? bioObj2.bioPermLocType : str15, (i14 & 8) != 0 ? bioObj2.bioPermSdcode : str16, (i14 & 16) != 0 ? bioObj2.fullAddress : str17, (i14 & 32) != 0 ? bioObj2.bioDob : str18, (i14 & 64) != 0 ? bioObj2.bioApplno : str19, (i14 & 128) != 0 ? bioObj2.bioBioId : str20, (i14 & 256) != 0 ? bioObj2.bioAadhaarName : obj21, (i14 & 512) != 0 ? bioObj2.bioEmailId : obj22, (i14 & 1024) != 0 ? bioObj2.bioPoliceStncd : obj23, (i14 & 2048) != 0 ? bioObj2.bioPermPin : str21, (i14 & 4096) != 0 ? bioObj2.bioTempLocType : str22, (i14 & 8192) != 0 ? bioObj2.biPhoto : obj24, (i14 & 16384) != 0 ? bioObj2.bioBirthplace : obj25, (i14 & 32768) != 0 ? bioObj2.bioMiddleName : obj26, (i14 & 65536) != 0 ? bioObj2.bioPermDistName : obj27, (i14 & 131072) != 0 ? bioObj2.bioPermAdd3 : str23, (i14 & 262144) != 0 ? bioObj2.bioTempVillTownName : obj28, (i14 & 524288) != 0 ? bioObj2.bioPermAdd1 : str24, (i14 & 1048576) != 0 ? bioObj2.bioAltMobileNo : obj29, (i14 & 2097152) != 0 ? bioObj2.bioLastName : str25, (i14 & 4194304) != 0 ? bioObj2.bioPermAdd2 : str26, (i14 & 8388608) != 0 ? bioObj2.bioGenderDesc : str27, (i14 & 16777216) != 0 ? bioObj2.bioFullName : str28, (i14 & 33554432) != 0 ? bioObj2.bioPerDetAadhaar : obj30, (i14 & 67108864) != 0 ? bioObj2.bioSwdFname : str29, (i14 & 134217728) != 0 ? bioObj2.bioTempSdcode : str30, (i14 & 268435456) != 0 ? bioObj2.bioQmQualdesc : obj31, (i14 & 536870912) != 0 ? bioObj2.bioEndorsementNo : obj32, (i14 & 1073741824) != 0 ? bioObj2.bioSwdFullName : str31, (i14 & Integer.MIN_VALUE) != 0 ? bioObj2.bioTempDistName : obj33, (i12 & 1) != 0 ? bioObj2.bioCitiZen : str32, (i12 & 2) != 0 ? bioObj2.bioSwdMname : obj34, (i12 & 4) != 0 ? bioObj2.bioBloodGroup : str33, (i12 & 8) != 0 ? bioObj2.bioPermLocal : str34, (i12 & 16) != 0 ? bioObj2.pht : obj35, (i12 & 32) != 0 ? bioObj2.bioDlno : obj36, (i12 & 64) != 0 ? bioObj2.bioDependentRelation : str35);
    }

    public final Object component1() {
        return this.bioPermSdName;
    }

    public final Object component10() {
        return this.bioEndorsedt;
    }

    public final String component11() {
        return this.bioSwdLname;
    }

    public final String component12() {
        return this.bioRecGenesis;
    }

    public final Object component13() {
        return this.bioPermVillTownCd;
    }

    public final Object component14() {
        return this.bioIdentityMark1;
    }

    public final String component15() {
        return this.bioUserId;
    }

    public final Object component16() {
        return this.bioIdentityMark2;
    }

    public final String component17() {
        return this.bioQmQualcd;
    }

    public final String component18() {
        return this.bioNatName;
    }

    public final Object component19() {
        return this.bioNprNo;
    }

    public final Object component2() {
        return this.bioDigest;
    }

    public final Object component20() {
        return this.bioAadhaarNo;
    }

    public final String component21() {
        return this.bioGender;
    }

    public final Object component22() {
        return this.bioPermDistCd;
    }

    public final Object component23() {
        return this.bioTempDistCd;
    }

    public final Object component24() {
        return this.bioPhoneNo;
    }

    public final Object component25() {
        return this.bioTempVillTownCd;
    }

    public final String component26() {
        return this.bioFirstName;
    }

    public final Object component27() {
        return this.bioMobileNo;
    }

    public final Object component28() {
        return this.bioEndorsetime;
    }

    public final Object component29() {
        return this.bioPermVillTownName;
    }

    public final Object component3() {
        return this.bioStayperiodPresentAddr;
    }

    public final String component30() {
        return this.bioOrganDonor;
    }

    public final Object component31() {
        return this.bioTempSdName;
    }

    public final String component32() {
        return this.bioBloodGroupname;
    }

    public final String component33() {
        return this.bioTempLocal;
    }

    public final Object component34() {
        return this.dob;
    }

    public final String component35() {
        return this.bioPermLocType;
    }

    public final String component36() {
        return this.bioPermSdcode;
    }

    public final String component37() {
        return this.fullAddress;
    }

    public final String component38() {
        return this.bioDob;
    }

    public final String component39() {
        return this.bioApplno;
    }

    public final String component4() {
        return this.bioTempPin;
    }

    public final String component40() {
        return this.bioBioId;
    }

    public final Object component41() {
        return this.bioAadhaarName;
    }

    public final Object component42() {
        return this.bioEmailId;
    }

    public final Object component43() {
        return this.bioPoliceStncd;
    }

    public final String component44() {
        return this.bioPermPin;
    }

    public final String component45() {
        return this.bioTempLocType;
    }

    public final Object component46() {
        return this.biPhoto;
    }

    public final Object component47() {
        return this.bioBirthplace;
    }

    public final Object component48() {
        return this.bioMiddleName;
    }

    public final Object component49() {
        return this.bioPermDistName;
    }

    public final String component5() {
        return this.bioTempAdd2;
    }

    public final String component50() {
        return this.bioPermAdd3;
    }

    public final Object component51() {
        return this.bioTempVillTownName;
    }

    public final String component52() {
        return this.bioPermAdd1;
    }

    public final Object component53() {
        return this.bioAltMobileNo;
    }

    public final String component54() {
        return this.bioLastName;
    }

    public final String component55() {
        return this.bioPermAdd2;
    }

    public final String component56() {
        return this.bioGenderDesc;
    }

    public final String component57() {
        return this.bioFullName;
    }

    public final Object component58() {
        return this.bioPerDetAadhaar;
    }

    public final String component59() {
        return this.bioSwdFname;
    }

    public final Object component6() {
        return this.bioBioidSearch;
    }

    public final String component60() {
        return this.bioTempSdcode;
    }

    public final Object component61() {
        return this.bioQmQualdesc;
    }

    public final Object component62() {
        return this.bioEndorsementNo;
    }

    public final String component63() {
        return this.bioSwdFullName;
    }

    public final Object component64() {
        return this.bioTempDistName;
    }

    public final String component65() {
        return this.bioCitiZen;
    }

    public final Object component66() {
        return this.bioSwdMname;
    }

    public final String component67() {
        return this.bioBloodGroup;
    }

    public final String component68() {
        return this.bioPermLocal;
    }

    public final Object component69() {
        return this.pht;
    }

    public final String component7() {
        return this.bioTempAdd1;
    }

    public final Object component70() {
        return this.bioDlno;
    }

    public final String component71() {
        return this.bioDependentRelation;
    }

    public final Object component8() {
        return this.bioTokenId;
    }

    public final String component9() {
        return this.bioTempAdd3;
    }

    public final BioObj copy(Object obj, Object obj2, Object obj3, String str, String str2, Object obj4, String str3, Object obj5, String str4, Object obj6, String str5, String str6, Object obj7, Object obj8, String str7, Object obj9, String str8, String str9, Object obj10, Object obj11, String str10, Object obj12, Object obj13, Object obj14, Object obj15, String str11, Object obj16, Object obj17, Object obj18, String str12, Object obj19, String str13, String str14, Object obj20, String str15, String str16, String str17, String str18, String str19, String str20, Object obj21, Object obj22, Object obj23, String str21, String str22, Object obj24, Object obj25, Object obj26, Object obj27, String str23, Object obj28, String str24, Object obj29, String str25, String str26, String str27, String str28, Object obj30, String str29, String str30, Object obj31, Object obj32, String str31, Object obj33, String str32, Object obj34, String str33, String str34, Object obj35, Object obj36, String str35) {
        return new BioObj(obj, obj2, obj3, str, str2, obj4, str3, obj5, str4, obj6, str5, str6, obj7, obj8, str7, obj9, str8, str9, obj10, obj11, str10, obj12, obj13, obj14, obj15, str11, obj16, obj17, obj18, str12, obj19, str13, str14, obj20, str15, str16, str17, str18, str19, str20, obj21, obj22, obj23, str21, str22, obj24, obj25, obj26, obj27, str23, obj28, str24, obj29, str25, str26, str27, str28, obj30, str29, str30, obj31, obj32, str31, obj33, str32, obj34, str33, str34, obj35, obj36, str35);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BioObj)) {
            return false;
        }
        BioObj bioObj = (BioObj) obj;
        return l.a(this.bioPermSdName, bioObj.bioPermSdName) && l.a(this.bioDigest, bioObj.bioDigest) && l.a(this.bioStayperiodPresentAddr, bioObj.bioStayperiodPresentAddr) && l.a(this.bioTempPin, bioObj.bioTempPin) && l.a(this.bioTempAdd2, bioObj.bioTempAdd2) && l.a(this.bioBioidSearch, bioObj.bioBioidSearch) && l.a(this.bioTempAdd1, bioObj.bioTempAdd1) && l.a(this.bioTokenId, bioObj.bioTokenId) && l.a(this.bioTempAdd3, bioObj.bioTempAdd3) && l.a(this.bioEndorsedt, bioObj.bioEndorsedt) && l.a(this.bioSwdLname, bioObj.bioSwdLname) && l.a(this.bioRecGenesis, bioObj.bioRecGenesis) && l.a(this.bioPermVillTownCd, bioObj.bioPermVillTownCd) && l.a(this.bioIdentityMark1, bioObj.bioIdentityMark1) && l.a(this.bioUserId, bioObj.bioUserId) && l.a(this.bioIdentityMark2, bioObj.bioIdentityMark2) && l.a(this.bioQmQualcd, bioObj.bioQmQualcd) && l.a(this.bioNatName, bioObj.bioNatName) && l.a(this.bioNprNo, bioObj.bioNprNo) && l.a(this.bioAadhaarNo, bioObj.bioAadhaarNo) && l.a(this.bioGender, bioObj.bioGender) && l.a(this.bioPermDistCd, bioObj.bioPermDistCd) && l.a(this.bioTempDistCd, bioObj.bioTempDistCd) && l.a(this.bioPhoneNo, bioObj.bioPhoneNo) && l.a(this.bioTempVillTownCd, bioObj.bioTempVillTownCd) && l.a(this.bioFirstName, bioObj.bioFirstName) && l.a(this.bioMobileNo, bioObj.bioMobileNo) && l.a(this.bioEndorsetime, bioObj.bioEndorsetime) && l.a(this.bioPermVillTownName, bioObj.bioPermVillTownName) && l.a(this.bioOrganDonor, bioObj.bioOrganDonor) && l.a(this.bioTempSdName, bioObj.bioTempSdName) && l.a(this.bioBloodGroupname, bioObj.bioBloodGroupname) && l.a(this.bioTempLocal, bioObj.bioTempLocal) && l.a(this.dob, bioObj.dob) && l.a(this.bioPermLocType, bioObj.bioPermLocType) && l.a(this.bioPermSdcode, bioObj.bioPermSdcode) && l.a(this.fullAddress, bioObj.fullAddress) && l.a(this.bioDob, bioObj.bioDob) && l.a(this.bioApplno, bioObj.bioApplno) && l.a(this.bioBioId, bioObj.bioBioId) && l.a(this.bioAadhaarName, bioObj.bioAadhaarName) && l.a(this.bioEmailId, bioObj.bioEmailId) && l.a(this.bioPoliceStncd, bioObj.bioPoliceStncd) && l.a(this.bioPermPin, bioObj.bioPermPin) && l.a(this.bioTempLocType, bioObj.bioTempLocType) && l.a(this.biPhoto, bioObj.biPhoto) && l.a(this.bioBirthplace, bioObj.bioBirthplace) && l.a(this.bioMiddleName, bioObj.bioMiddleName) && l.a(this.bioPermDistName, bioObj.bioPermDistName) && l.a(this.bioPermAdd3, bioObj.bioPermAdd3) && l.a(this.bioTempVillTownName, bioObj.bioTempVillTownName) && l.a(this.bioPermAdd1, bioObj.bioPermAdd1) && l.a(this.bioAltMobileNo, bioObj.bioAltMobileNo) && l.a(this.bioLastName, bioObj.bioLastName) && l.a(this.bioPermAdd2, bioObj.bioPermAdd2) && l.a(this.bioGenderDesc, bioObj.bioGenderDesc) && l.a(this.bioFullName, bioObj.bioFullName) && l.a(this.bioPerDetAadhaar, bioObj.bioPerDetAadhaar) && l.a(this.bioSwdFname, bioObj.bioSwdFname) && l.a(this.bioTempSdcode, bioObj.bioTempSdcode) && l.a(this.bioQmQualdesc, bioObj.bioQmQualdesc) && l.a(this.bioEndorsementNo, bioObj.bioEndorsementNo) && l.a(this.bioSwdFullName, bioObj.bioSwdFullName) && l.a(this.bioTempDistName, bioObj.bioTempDistName) && l.a(this.bioCitiZen, bioObj.bioCitiZen) && l.a(this.bioSwdMname, bioObj.bioSwdMname) && l.a(this.bioBloodGroup, bioObj.bioBloodGroup) && l.a(this.bioPermLocal, bioObj.bioPermLocal) && l.a(this.pht, bioObj.pht) && l.a(this.bioDlno, bioObj.bioDlno) && l.a(this.bioDependentRelation, bioObj.bioDependentRelation);
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

    public final Object getBioDlno() {
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

    public final Object getBioIdentityMark1() {
        return this.bioIdentityMark1;
    }

    public final Object getBioIdentityMark2() {
        return this.bioIdentityMark2;
    }

    public final String getBioLastName() {
        return this.bioLastName;
    }

    public final Object getBioMiddleName() {
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

    public final String getBioOrganDonor() {
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

    public final String getBioPermAdd3() {
        return this.bioPermAdd3;
    }

    public final Object getBioPermDistCd() {
        return this.bioPermDistCd;
    }

    public final Object getBioPermDistName() {
        return this.bioPermDistName;
    }

    public final String getBioPermLocType() {
        return this.bioPermLocType;
    }

    public final String getBioPermLocal() {
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

    public final String getBioSwdLname() {
        return this.bioSwdLname;
    }

    public final Object getBioSwdMname() {
        return this.bioSwdMname;
    }

    public final String getBioTempAdd1() {
        return this.bioTempAdd1;
    }

    public final String getBioTempAdd2() {
        return this.bioTempAdd2;
    }

    public final String getBioTempAdd3() {
        return this.bioTempAdd3;
    }

    public final Object getBioTempDistCd() {
        return this.bioTempDistCd;
    }

    public final Object getBioTempDistName() {
        return this.bioTempDistName;
    }

    public final String getBioTempLocType() {
        return this.bioTempLocType;
    }

    public final String getBioTempLocal() {
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

    public final String getFullAddress() {
        return this.fullAddress;
    }

    public final Object getPht() {
        return this.pht;
    }

    public int hashCode() {
        Object obj = this.bioPermSdName;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.bioDigest;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.bioStayperiodPresentAddr;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str = this.bioTempPin;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bioTempAdd2;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj4 = this.bioBioidSearch;
        int hashCode6 = (hashCode5 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str3 = this.bioTempAdd1;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj5 = this.bioTokenId;
        int hashCode8 = (hashCode7 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        String str4 = this.bioTempAdd3;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Object obj6 = this.bioEndorsedt;
        int hashCode10 = (hashCode9 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        String str5 = this.bioSwdLname;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bioRecGenesis;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj7 = this.bioPermVillTownCd;
        int hashCode13 = (hashCode12 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.bioIdentityMark1;
        int hashCode14 = (hashCode13 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        String str7 = this.bioUserId;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Object obj9 = this.bioIdentityMark2;
        int hashCode16 = (hashCode15 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        String str8 = this.bioQmQualcd;
        int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bioNatName;
        int hashCode18 = (hashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Object obj10 = this.bioNprNo;
        int hashCode19 = (hashCode18 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Object obj11 = this.bioAadhaarNo;
        int hashCode20 = (hashCode19 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        String str10 = this.bioGender;
        int hashCode21 = (hashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Object obj12 = this.bioPermDistCd;
        int hashCode22 = (hashCode21 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        Object obj13 = this.bioTempDistCd;
        int hashCode23 = (hashCode22 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
        Object obj14 = this.bioPhoneNo;
        int hashCode24 = (hashCode23 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
        Object obj15 = this.bioTempVillTownCd;
        int hashCode25 = (hashCode24 + (obj15 == null ? 0 : obj15.hashCode())) * 31;
        String str11 = this.bioFirstName;
        int hashCode26 = (hashCode25 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Object obj16 = this.bioMobileNo;
        int hashCode27 = (hashCode26 + (obj16 == null ? 0 : obj16.hashCode())) * 31;
        Object obj17 = this.bioEndorsetime;
        int hashCode28 = (hashCode27 + (obj17 == null ? 0 : obj17.hashCode())) * 31;
        Object obj18 = this.bioPermVillTownName;
        int hashCode29 = (hashCode28 + (obj18 == null ? 0 : obj18.hashCode())) * 31;
        String str12 = this.bioOrganDonor;
        int hashCode30 = (hashCode29 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Object obj19 = this.bioTempSdName;
        int hashCode31 = (hashCode30 + (obj19 == null ? 0 : obj19.hashCode())) * 31;
        String str13 = this.bioBloodGroupname;
        int hashCode32 = (hashCode31 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.bioTempLocal;
        int hashCode33 = (hashCode32 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Object obj20 = this.dob;
        int hashCode34 = (hashCode33 + (obj20 == null ? 0 : obj20.hashCode())) * 31;
        String str15 = this.bioPermLocType;
        int hashCode35 = (hashCode34 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.bioPermSdcode;
        int hashCode36 = (hashCode35 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.fullAddress;
        int hashCode37 = (hashCode36 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.bioDob;
        int hashCode38 = (hashCode37 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.bioApplno;
        int hashCode39 = (hashCode38 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.bioBioId;
        int hashCode40 = (hashCode39 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Object obj21 = this.bioAadhaarName;
        int hashCode41 = (hashCode40 + (obj21 == null ? 0 : obj21.hashCode())) * 31;
        Object obj22 = this.bioEmailId;
        int hashCode42 = (hashCode41 + (obj22 == null ? 0 : obj22.hashCode())) * 31;
        Object obj23 = this.bioPoliceStncd;
        int hashCode43 = (hashCode42 + (obj23 == null ? 0 : obj23.hashCode())) * 31;
        String str21 = this.bioPermPin;
        int hashCode44 = (hashCode43 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.bioTempLocType;
        int hashCode45 = (hashCode44 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Object obj24 = this.biPhoto;
        int hashCode46 = (hashCode45 + (obj24 == null ? 0 : obj24.hashCode())) * 31;
        Object obj25 = this.bioBirthplace;
        int hashCode47 = (hashCode46 + (obj25 == null ? 0 : obj25.hashCode())) * 31;
        Object obj26 = this.bioMiddleName;
        int hashCode48 = (hashCode47 + (obj26 == null ? 0 : obj26.hashCode())) * 31;
        Object obj27 = this.bioPermDistName;
        int hashCode49 = (hashCode48 + (obj27 == null ? 0 : obj27.hashCode())) * 31;
        String str23 = this.bioPermAdd3;
        int hashCode50 = (hashCode49 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Object obj28 = this.bioTempVillTownName;
        int hashCode51 = (hashCode50 + (obj28 == null ? 0 : obj28.hashCode())) * 31;
        String str24 = this.bioPermAdd1;
        int hashCode52 = (hashCode51 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Object obj29 = this.bioAltMobileNo;
        int hashCode53 = (hashCode52 + (obj29 == null ? 0 : obj29.hashCode())) * 31;
        String str25 = this.bioLastName;
        int hashCode54 = (hashCode53 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.bioPermAdd2;
        int hashCode55 = (hashCode54 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.bioGenderDesc;
        int hashCode56 = (hashCode55 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.bioFullName;
        int hashCode57 = (hashCode56 + (str28 == null ? 0 : str28.hashCode())) * 31;
        Object obj30 = this.bioPerDetAadhaar;
        int hashCode58 = (hashCode57 + (obj30 == null ? 0 : obj30.hashCode())) * 31;
        String str29 = this.bioSwdFname;
        int hashCode59 = (hashCode58 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.bioTempSdcode;
        int hashCode60 = (hashCode59 + (str30 == null ? 0 : str30.hashCode())) * 31;
        Object obj31 = this.bioQmQualdesc;
        int hashCode61 = (hashCode60 + (obj31 == null ? 0 : obj31.hashCode())) * 31;
        Object obj32 = this.bioEndorsementNo;
        int hashCode62 = (hashCode61 + (obj32 == null ? 0 : obj32.hashCode())) * 31;
        String str31 = this.bioSwdFullName;
        int hashCode63 = (hashCode62 + (str31 == null ? 0 : str31.hashCode())) * 31;
        Object obj33 = this.bioTempDistName;
        int hashCode64 = (hashCode63 + (obj33 == null ? 0 : obj33.hashCode())) * 31;
        String str32 = this.bioCitiZen;
        int hashCode65 = (hashCode64 + (str32 == null ? 0 : str32.hashCode())) * 31;
        Object obj34 = this.bioSwdMname;
        int hashCode66 = (hashCode65 + (obj34 == null ? 0 : obj34.hashCode())) * 31;
        String str33 = this.bioBloodGroup;
        int hashCode67 = (hashCode66 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.bioPermLocal;
        int hashCode68 = (hashCode67 + (str34 == null ? 0 : str34.hashCode())) * 31;
        Object obj35 = this.pht;
        int hashCode69 = (hashCode68 + (obj35 == null ? 0 : obj35.hashCode())) * 31;
        Object obj36 = this.bioDlno;
        int hashCode70 = (hashCode69 + (obj36 == null ? 0 : obj36.hashCode())) * 31;
        String str35 = this.bioDependentRelation;
        if (str35 != null) {
            i10 = str35.hashCode();
        }
        return hashCode70 + i10;
    }

    public String toString() {
        return "BioObj(bioPermSdName=" + this.bioPermSdName + ", bioDigest=" + this.bioDigest + ", bioStayperiodPresentAddr=" + this.bioStayperiodPresentAddr + ", bioTempPin=" + this.bioTempPin + ", bioTempAdd2=" + this.bioTempAdd2 + ", bioBioidSearch=" + this.bioBioidSearch + ", bioTempAdd1=" + this.bioTempAdd1 + ", bioTokenId=" + this.bioTokenId + ", bioTempAdd3=" + this.bioTempAdd3 + ", bioEndorsedt=" + this.bioEndorsedt + ", bioSwdLname=" + this.bioSwdLname + ", bioRecGenesis=" + this.bioRecGenesis + ", bioPermVillTownCd=" + this.bioPermVillTownCd + ", bioIdentityMark1=" + this.bioIdentityMark1 + ", bioUserId=" + this.bioUserId + ", bioIdentityMark2=" + this.bioIdentityMark2 + ", bioQmQualcd=" + this.bioQmQualcd + ", bioNatName=" + this.bioNatName + ", bioNprNo=" + this.bioNprNo + ", bioAadhaarNo=" + this.bioAadhaarNo + ", bioGender=" + this.bioGender + ", bioPermDistCd=" + this.bioPermDistCd + ", bioTempDistCd=" + this.bioTempDistCd + ", bioPhoneNo=" + this.bioPhoneNo + ", bioTempVillTownCd=" + this.bioTempVillTownCd + ", bioFirstName=" + this.bioFirstName + ", bioMobileNo=" + this.bioMobileNo + ", bioEndorsetime=" + this.bioEndorsetime + ", bioPermVillTownName=" + this.bioPermVillTownName + ", bioOrganDonor=" + this.bioOrganDonor + ", bioTempSdName=" + this.bioTempSdName + ", bioBloodGroupname=" + this.bioBloodGroupname + ", bioTempLocal=" + this.bioTempLocal + ", dob=" + this.dob + ", bioPermLocType=" + this.bioPermLocType + ", bioPermSdcode=" + this.bioPermSdcode + ", fullAddress=" + this.fullAddress + ", bioDob=" + this.bioDob + ", bioApplno=" + this.bioApplno + ", bioBioId=" + this.bioBioId + ", bioAadhaarName=" + this.bioAadhaarName + ", bioEmailId=" + this.bioEmailId + ", bioPoliceStncd=" + this.bioPoliceStncd + ", bioPermPin=" + this.bioPermPin + ", bioTempLocType=" + this.bioTempLocType + ", biPhoto=" + this.biPhoto + ", bioBirthplace=" + this.bioBirthplace + ", bioMiddleName=" + this.bioMiddleName + ", bioPermDistName=" + this.bioPermDistName + ", bioPermAdd3=" + this.bioPermAdd3 + ", bioTempVillTownName=" + this.bioTempVillTownName + ", bioPermAdd1=" + this.bioPermAdd1 + ", bioAltMobileNo=" + this.bioAltMobileNo + ", bioLastName=" + this.bioLastName + ", bioPermAdd2=" + this.bioPermAdd2 + ", bioGenderDesc=" + this.bioGenderDesc + ", bioFullName=" + this.bioFullName + ", bioPerDetAadhaar=" + this.bioPerDetAadhaar + ", bioSwdFname=" + this.bioSwdFname + ", bioTempSdcode=" + this.bioTempSdcode + ", bioQmQualdesc=" + this.bioQmQualdesc + ", bioEndorsementNo=" + this.bioEndorsementNo + ", bioSwdFullName=" + this.bioSwdFullName + ", bioTempDistName=" + this.bioTempDistName + ", bioCitiZen=" + this.bioCitiZen + ", bioSwdMname=" + this.bioSwdMname + ", bioBloodGroup=" + this.bioBloodGroup + ", bioPermLocal=" + this.bioPermLocal + ", pht=" + this.pht + ", bioDlno=" + this.bioDlno + ", bioDependentRelation=" + this.bioDependentRelation + ')';
    }

    public BioObj(Object obj, Object obj2, Object obj3, String str, String str2, Object obj4, String str3, Object obj5, String str4, Object obj6, String str5, String str6, Object obj7, Object obj8, String str7, Object obj9, String str8, String str9, Object obj10, Object obj11, String str10, Object obj12, Object obj13, Object obj14, Object obj15, String str11, Object obj16, Object obj17, Object obj18, String str12, Object obj19, String str13, String str14, Object obj20, String str15, String str16, String str17, String str18, String str19, String str20, Object obj21, Object obj22, Object obj23, String str21, String str22, Object obj24, Object obj25, Object obj26, Object obj27, String str23, Object obj28, String str24, Object obj29, String str25, String str26, String str27, String str28, Object obj30, String str29, String str30, Object obj31, Object obj32, String str31, Object obj33, String str32, Object obj34, String str33, String str34, Object obj35, Object obj36, String str35) {
        this.bioPermSdName = obj;
        this.bioDigest = obj2;
        this.bioStayperiodPresentAddr = obj3;
        this.bioTempPin = str;
        this.bioTempAdd2 = str2;
        this.bioBioidSearch = obj4;
        this.bioTempAdd1 = str3;
        this.bioTokenId = obj5;
        this.bioTempAdd3 = str4;
        this.bioEndorsedt = obj6;
        this.bioSwdLname = str5;
        this.bioRecGenesis = str6;
        this.bioPermVillTownCd = obj7;
        this.bioIdentityMark1 = obj8;
        this.bioUserId = str7;
        this.bioIdentityMark2 = obj9;
        this.bioQmQualcd = str8;
        this.bioNatName = str9;
        this.bioNprNo = obj10;
        this.bioAadhaarNo = obj11;
        this.bioGender = str10;
        this.bioPermDistCd = obj12;
        this.bioTempDistCd = obj13;
        this.bioPhoneNo = obj14;
        this.bioTempVillTownCd = obj15;
        this.bioFirstName = str11;
        this.bioMobileNo = obj16;
        this.bioEndorsetime = obj17;
        this.bioPermVillTownName = obj18;
        this.bioOrganDonor = str12;
        this.bioTempSdName = obj19;
        this.bioBloodGroupname = str13;
        this.bioTempLocal = str14;
        this.dob = obj20;
        this.bioPermLocType = str15;
        this.bioPermSdcode = str16;
        this.fullAddress = str17;
        this.bioDob = str18;
        this.bioApplno = str19;
        this.bioBioId = str20;
        this.bioAadhaarName = obj21;
        this.bioEmailId = obj22;
        this.bioPoliceStncd = obj23;
        this.bioPermPin = str21;
        this.bioTempLocType = str22;
        this.biPhoto = obj24;
        this.bioBirthplace = obj25;
        this.bioMiddleName = obj26;
        this.bioPermDistName = obj27;
        this.bioPermAdd3 = str23;
        this.bioTempVillTownName = obj28;
        this.bioPermAdd1 = str24;
        this.bioAltMobileNo = obj29;
        this.bioLastName = str25;
        this.bioPermAdd2 = str26;
        this.bioGenderDesc = str27;
        this.bioFullName = str28;
        this.bioPerDetAadhaar = obj30;
        this.bioSwdFname = str29;
        this.bioTempSdcode = str30;
        this.bioQmQualdesc = obj31;
        this.bioEndorsementNo = obj32;
        this.bioSwdFullName = str31;
        this.bioTempDistName = obj33;
        this.bioCitiZen = str32;
        this.bioSwdMname = obj34;
        this.bioBloodGroup = str33;
        this.bioPermLocal = str34;
        this.pht = obj35;
        this.bioDlno = obj36;
        this.bioDependentRelation = str35;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BioObj(java.lang.Object r71, java.lang.Object r72, java.lang.Object r73, java.lang.String r74, java.lang.String r75, java.lang.Object r76, java.lang.String r77, java.lang.Object r78, java.lang.String r79, java.lang.Object r80, java.lang.String r81, java.lang.String r82, java.lang.Object r83, java.lang.Object r84, java.lang.String r85, java.lang.Object r86, java.lang.String r87, java.lang.String r88, java.lang.Object r89, java.lang.Object r90, java.lang.String r91, java.lang.Object r92, java.lang.Object r93, java.lang.Object r94, java.lang.Object r95, java.lang.String r96, java.lang.Object r97, java.lang.Object r98, java.lang.Object r99, java.lang.String r100, java.lang.Object r101, java.lang.String r102, java.lang.String r103, java.lang.Object r104, java.lang.String r105, java.lang.String r106, java.lang.String r107, java.lang.String r108, java.lang.String r109, java.lang.String r110, java.lang.Object r111, java.lang.Object r112, java.lang.Object r113, java.lang.String r114, java.lang.String r115, java.lang.Object r116, java.lang.Object r117, java.lang.Object r118, java.lang.Object r119, java.lang.String r120, java.lang.Object r121, java.lang.String r122, java.lang.Object r123, java.lang.String r124, java.lang.String r125, java.lang.String r126, java.lang.String r127, java.lang.Object r128, java.lang.String r129, java.lang.String r130, java.lang.Object r131, java.lang.Object r132, java.lang.String r133, java.lang.Object r134, java.lang.String r135, java.lang.Object r136, java.lang.String r137, java.lang.String r138, java.lang.Object r139, java.lang.Object r140, java.lang.String r141, int r142, int r143, int r144, cm.g r145) {
        /*
            r70 = this;
            r0 = r142
            r1 = r143
            r2 = r0 & 1
            if (r2 == 0) goto L_0x000a
            r2 = 0
            goto L_0x000c
        L_0x000a:
            r2 = r71
        L_0x000c:
            r4 = r0 & 2
            if (r4 == 0) goto L_0x0012
            r4 = 0
            goto L_0x0014
        L_0x0012:
            r4 = r72
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = 0
            goto L_0x001c
        L_0x001a:
            r5 = r73
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            r6 = 0
            goto L_0x0024
        L_0x0022:
            r6 = r74
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r75
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r76
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r77
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r78
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = 0
            goto L_0x004c
        L_0x004a:
            r11 = r79
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = 0
            goto L_0x0054
        L_0x0052:
            r12 = r80
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005a
            r13 = 0
            goto L_0x005c
        L_0x005a:
            r13 = r81
        L_0x005c:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            r14 = 0
            goto L_0x0064
        L_0x0062:
            r14 = r82
        L_0x0064:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006a
            r15 = 0
            goto L_0x006c
        L_0x006a:
            r15 = r83
        L_0x006c:
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0072
            r3 = 0
            goto L_0x0074
        L_0x0072:
            r3 = r84
        L_0x0074:
            r16 = r3
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x007c
            r3 = 0
            goto L_0x007e
        L_0x007c:
            r3 = r85
        L_0x007e:
            r17 = 32768(0x8000, float:4.5918E-41)
            r18 = r0 & r17
            if (r18 == 0) goto L_0x0088
            r18 = 0
            goto L_0x008a
        L_0x0088:
            r18 = r86
        L_0x008a:
            r19 = 65536(0x10000, float:9.18355E-41)
            r20 = r0 & r19
            if (r20 == 0) goto L_0x0093
            r20 = 0
            goto L_0x0095
        L_0x0093:
            r20 = r87
        L_0x0095:
            r21 = 131072(0x20000, float:1.83671E-40)
            r22 = r0 & r21
            if (r22 == 0) goto L_0x009e
            r22 = 0
            goto L_0x00a0
        L_0x009e:
            r22 = r88
        L_0x00a0:
            r23 = 262144(0x40000, float:3.67342E-40)
            r24 = r0 & r23
            if (r24 == 0) goto L_0x00a9
            r24 = 0
            goto L_0x00ab
        L_0x00a9:
            r24 = r89
        L_0x00ab:
            r25 = 524288(0x80000, float:7.34684E-40)
            r26 = r0 & r25
            if (r26 == 0) goto L_0x00b4
            r26 = 0
            goto L_0x00b6
        L_0x00b4:
            r26 = r90
        L_0x00b6:
            r27 = 1048576(0x100000, float:1.469368E-39)
            r28 = r0 & r27
            if (r28 == 0) goto L_0x00bf
            r28 = 0
            goto L_0x00c1
        L_0x00bf:
            r28 = r91
        L_0x00c1:
            r29 = 2097152(0x200000, float:2.938736E-39)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x00ca
            r29 = 0
            goto L_0x00cc
        L_0x00ca:
            r29 = r92
        L_0x00cc:
            r30 = 4194304(0x400000, float:5.877472E-39)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x00d5
            r30 = 0
            goto L_0x00d7
        L_0x00d5:
            r30 = r93
        L_0x00d7:
            r31 = 8388608(0x800000, float:1.17549435E-38)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x00e0
            r31 = 0
            goto L_0x00e2
        L_0x00e0:
            r31 = r94
        L_0x00e2:
            r32 = 16777216(0x1000000, float:2.3509887E-38)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x00eb
            r32 = 0
            goto L_0x00ed
        L_0x00eb:
            r32 = r95
        L_0x00ed:
            r33 = 33554432(0x2000000, float:9.403955E-38)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x00f6
            r33 = 0
            goto L_0x00f8
        L_0x00f6:
            r33 = r96
        L_0x00f8:
            r34 = 67108864(0x4000000, float:1.5046328E-36)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x0101
            r34 = 0
            goto L_0x0103
        L_0x0101:
            r34 = r97
        L_0x0103:
            r35 = 134217728(0x8000000, float:3.85186E-34)
            r35 = r0 & r35
            if (r35 == 0) goto L_0x010c
            r35 = 0
            goto L_0x010e
        L_0x010c:
            r35 = r98
        L_0x010e:
            r36 = 268435456(0x10000000, float:2.5243549E-29)
            r36 = r0 & r36
            if (r36 == 0) goto L_0x0117
            r36 = 0
            goto L_0x0119
        L_0x0117:
            r36 = r99
        L_0x0119:
            r37 = 536870912(0x20000000, float:1.0842022E-19)
            r37 = r0 & r37
            if (r37 == 0) goto L_0x0122
            r37 = 0
            goto L_0x0124
        L_0x0122:
            r37 = r100
        L_0x0124:
            r38 = 1073741824(0x40000000, float:2.0)
            r38 = r0 & r38
            if (r38 == 0) goto L_0x012d
            r38 = 0
            goto L_0x012f
        L_0x012d:
            r38 = r101
        L_0x012f:
            r39 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r39
            if (r0 == 0) goto L_0x0137
            r0 = 0
            goto L_0x0139
        L_0x0137:
            r0 = r102
        L_0x0139:
            r39 = r1 & 1
            if (r39 == 0) goto L_0x0140
            r39 = 0
            goto L_0x0142
        L_0x0140:
            r39 = r103
        L_0x0142:
            r40 = r1 & 2
            if (r40 == 0) goto L_0x0149
            r40 = 0
            goto L_0x014b
        L_0x0149:
            r40 = r104
        L_0x014b:
            r41 = r1 & 4
            if (r41 == 0) goto L_0x0152
            r41 = 0
            goto L_0x0154
        L_0x0152:
            r41 = r105
        L_0x0154:
            r42 = r1 & 8
            if (r42 == 0) goto L_0x015b
            r42 = 0
            goto L_0x015d
        L_0x015b:
            r42 = r106
        L_0x015d:
            r43 = r1 & 16
            if (r43 == 0) goto L_0x0164
            r43 = 0
            goto L_0x0166
        L_0x0164:
            r43 = r107
        L_0x0166:
            r44 = r1 & 32
            if (r44 == 0) goto L_0x016d
            r44 = 0
            goto L_0x016f
        L_0x016d:
            r44 = r108
        L_0x016f:
            r45 = r1 & 64
            if (r45 == 0) goto L_0x0176
            r45 = 0
            goto L_0x0178
        L_0x0176:
            r45 = r109
        L_0x0178:
            r142 = r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0180
            r0 = 0
            goto L_0x0182
        L_0x0180:
            r0 = r110
        L_0x0182:
            r46 = r0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x018a
            r0 = 0
            goto L_0x018c
        L_0x018a:
            r0 = r111
        L_0x018c:
            r47 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0194
            r0 = 0
            goto L_0x0196
        L_0x0194:
            r0 = r112
        L_0x0196:
            r48 = r0
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x019e
            r0 = 0
            goto L_0x01a0
        L_0x019e:
            r0 = r113
        L_0x01a0:
            r49 = r0
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01a8
            r0 = 0
            goto L_0x01aa
        L_0x01a8:
            r0 = r114
        L_0x01aa:
            r50 = r0
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01b2
            r0 = 0
            goto L_0x01b4
        L_0x01b2:
            r0 = r115
        L_0x01b4:
            r51 = r0
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x01bc
            r0 = 0
            goto L_0x01be
        L_0x01bc:
            r0 = r116
        L_0x01be:
            r52 = r0
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x01c6
            r0 = 0
            goto L_0x01c8
        L_0x01c6:
            r0 = r117
        L_0x01c8:
            r17 = r1 & r17
            if (r17 == 0) goto L_0x01cf
            r17 = 0
            goto L_0x01d1
        L_0x01cf:
            r17 = r118
        L_0x01d1:
            r19 = r1 & r19
            if (r19 == 0) goto L_0x01d8
            r19 = 0
            goto L_0x01da
        L_0x01d8:
            r19 = r119
        L_0x01da:
            r21 = r1 & r21
            if (r21 == 0) goto L_0x01e1
            r21 = 0
            goto L_0x01e3
        L_0x01e1:
            r21 = r120
        L_0x01e3:
            r23 = r1 & r23
            if (r23 == 0) goto L_0x01ea
            r23 = 0
            goto L_0x01ec
        L_0x01ea:
            r23 = r121
        L_0x01ec:
            r25 = r1 & r25
            if (r25 == 0) goto L_0x01f3
            r25 = 0
            goto L_0x01f5
        L_0x01f3:
            r25 = r122
        L_0x01f5:
            r27 = r1 & r27
            if (r27 == 0) goto L_0x01fc
            r27 = 0
            goto L_0x01fe
        L_0x01fc:
            r27 = r123
        L_0x01fe:
            r53 = 2097152(0x200000, float:2.938736E-39)
            r53 = r1 & r53
            if (r53 == 0) goto L_0x0207
            r53 = 0
            goto L_0x0209
        L_0x0207:
            r53 = r124
        L_0x0209:
            r54 = 4194304(0x400000, float:5.877472E-39)
            r54 = r1 & r54
            if (r54 == 0) goto L_0x0212
            r54 = 0
            goto L_0x0214
        L_0x0212:
            r54 = r125
        L_0x0214:
            r55 = 8388608(0x800000, float:1.17549435E-38)
            r55 = r1 & r55
            if (r55 == 0) goto L_0x021d
            r55 = 0
            goto L_0x021f
        L_0x021d:
            r55 = r126
        L_0x021f:
            r56 = 16777216(0x1000000, float:2.3509887E-38)
            r56 = r1 & r56
            if (r56 == 0) goto L_0x0228
            r56 = 0
            goto L_0x022a
        L_0x0228:
            r56 = r127
        L_0x022a:
            r57 = 33554432(0x2000000, float:9.403955E-38)
            r57 = r1 & r57
            if (r57 == 0) goto L_0x0233
            r57 = 0
            goto L_0x0235
        L_0x0233:
            r57 = r128
        L_0x0235:
            r58 = 67108864(0x4000000, float:1.5046328E-36)
            r58 = r1 & r58
            if (r58 == 0) goto L_0x023e
            r58 = 0
            goto L_0x0240
        L_0x023e:
            r58 = r129
        L_0x0240:
            r59 = 134217728(0x8000000, float:3.85186E-34)
            r59 = r1 & r59
            if (r59 == 0) goto L_0x0249
            r59 = 0
            goto L_0x024b
        L_0x0249:
            r59 = r130
        L_0x024b:
            r60 = 268435456(0x10000000, float:2.5243549E-29)
            r60 = r1 & r60
            if (r60 == 0) goto L_0x0254
            r60 = 0
            goto L_0x0256
        L_0x0254:
            r60 = r131
        L_0x0256:
            r61 = 536870912(0x20000000, float:1.0842022E-19)
            r61 = r1 & r61
            if (r61 == 0) goto L_0x025f
            r61 = 0
            goto L_0x0261
        L_0x025f:
            r61 = r132
        L_0x0261:
            r62 = 1073741824(0x40000000, float:2.0)
            r62 = r1 & r62
            if (r62 == 0) goto L_0x026a
            r62 = 0
            goto L_0x026c
        L_0x026a:
            r62 = r133
        L_0x026c:
            r63 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r63
            if (r1 == 0) goto L_0x0274
            r1 = 0
            goto L_0x0276
        L_0x0274:
            r1 = r134
        L_0x0276:
            r63 = r144 & 1
            if (r63 == 0) goto L_0x027d
            r63 = 0
            goto L_0x027f
        L_0x027d:
            r63 = r135
        L_0x027f:
            r64 = r144 & 2
            if (r64 == 0) goto L_0x0286
            r64 = 0
            goto L_0x0288
        L_0x0286:
            r64 = r136
        L_0x0288:
            r65 = r144 & 4
            if (r65 == 0) goto L_0x028f
            r65 = 0
            goto L_0x0291
        L_0x028f:
            r65 = r137
        L_0x0291:
            r66 = r144 & 8
            if (r66 == 0) goto L_0x0298
            r66 = 0
            goto L_0x029a
        L_0x0298:
            r66 = r138
        L_0x029a:
            r67 = r144 & 16
            if (r67 == 0) goto L_0x02a1
            r67 = 0
            goto L_0x02a3
        L_0x02a1:
            r67 = r139
        L_0x02a3:
            r68 = r144 & 32
            if (r68 == 0) goto L_0x02aa
            r68 = 0
            goto L_0x02ac
        L_0x02aa:
            r68 = r140
        L_0x02ac:
            r69 = r144 & 64
            if (r69 == 0) goto L_0x02b3
            r69 = 0
            goto L_0x02b5
        L_0x02b3:
            r69 = r141
        L_0x02b5:
            r71 = r70
            r72 = r2
            r73 = r4
            r74 = r5
            r75 = r6
            r76 = r7
            r77 = r8
            r78 = r9
            r79 = r10
            r80 = r11
            r81 = r12
            r82 = r13
            r83 = r14
            r84 = r15
            r85 = r16
            r86 = r3
            r87 = r18
            r88 = r20
            r89 = r22
            r90 = r24
            r91 = r26
            r92 = r28
            r93 = r29
            r94 = r30
            r95 = r31
            r96 = r32
            r97 = r33
            r98 = r34
            r99 = r35
            r100 = r36
            r101 = r37
            r102 = r38
            r103 = r142
            r104 = r39
            r105 = r40
            r106 = r41
            r107 = r42
            r108 = r43
            r109 = r44
            r110 = r45
            r111 = r46
            r112 = r47
            r113 = r48
            r114 = r49
            r115 = r50
            r116 = r51
            r117 = r52
            r118 = r0
            r119 = r17
            r120 = r19
            r121 = r21
            r122 = r23
            r123 = r25
            r124 = r27
            r125 = r53
            r126 = r54
            r127 = r55
            r128 = r56
            r129 = r57
            r130 = r58
            r131 = r59
            r132 = r60
            r133 = r61
            r134 = r62
            r135 = r1
            r136 = r63
            r137 = r64
            r138 = r65
            r139 = r66
            r140 = r67
            r141 = r68
            r142 = r69
            r71.<init>(r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.BioObj.<init>(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.Object, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Object, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Object, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.String, int, int, int, cm.g):void");
    }
}
