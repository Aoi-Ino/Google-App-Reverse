package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import java.io.Serializable;

@Keep
public final class BioObjX implements Serializable {
    private final boolean aadharAuthenticated;
    private final String bioAadhaarName;
    private final String bioApplicantCatg;
    private final String bioApplno;
    private final String bioBioId;
    private final String bioBioidSearch;
    private final String bioBloodGroup;
    private final String bioBloodGroupname;
    private final String bioCitiZen;
    private final String bioDependentRelation;
    private final String bioDlno;
    private String bioDob;
    private final String bioEndorsedt;
    private final String bioEndorsementNo;
    private final String bioEndorsetime;
    private final String bioFirstName;
    private final String bioFullName;
    private final int bioGender;
    private final String bioGenderDesc;
    private final String bioLastName;
    private final String bioMiddleName;
    private final String bioMobileNo;
    private final String bioNatName;
    private final String bioOrganDonor;
    private final String bioPerDetAadhaar;
    private final String bioPermAdd1;
    private final String bioPermAdd2;
    private final String bioPermAdd3;
    private final int bioPermDistCd;
    private final String bioPermDistName;
    private final int bioPermPin;
    private final String bioPermSdName;
    private final int bioPermSdcode;
    private final int bioPermVillTownCd;
    private final int bioQmQualcd;
    private final String bioRecGenesis;
    private final String bioSwdFname;
    private final String bioSwdFullName;
    private final String bioTempAdd1;
    private final String bioTempAdd2;
    private final String bioTempAdd3;
    private final int bioTempDistCd;
    private final String bioTempDistName;
    private final int bioTempPin;
    private final String bioTempSdName;
    private final int bioTempSdcode;
    private final int bioTempVillTownCd;
    private final int bioTokenId;
    private final int bioUserId;

    public BioObjX(String str, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i10, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i11, String str27, int i12, String str28, int i13, int i14, int i15, String str29, String str30, String str31, String str32, String str33, String str34, int i16, String str35, int i17, String str36, int i18, int i19, int i20, int i21) {
        String str37 = str2;
        String str38 = str5;
        String str39 = str6;
        String str40 = str7;
        String str41 = str8;
        String str42 = str9;
        String str43 = str10;
        String str44 = str11;
        String str45 = str12;
        String str46 = str13;
        String str47 = str14;
        String str48 = str15;
        String str49 = str16;
        String str50 = str17;
        String str51 = str19;
        l.f(str37, "bioApplno");
        l.f(str38, "bioBioId");
        l.f(str39, "bioBioidSearch");
        l.f(str40, "bioBloodGroup");
        l.f(str41, "bioBloodGroupname");
        l.f(str42, "bioCitiZen");
        l.f(str43, "bioDependentRelation");
        l.f(str44, "bioDlno");
        l.f(str45, "bioDob");
        l.f(str46, "bioEndorsedt");
        l.f(str47, "bioEndorsementNo");
        l.f(str48, "bioEndorsetime");
        l.f(str49, "bioFirstName");
        l.f(str50, "bioFullName");
        l.f(str18, "bioGenderDesc");
        l.f(str19, "bioLastName");
        l.f(str20, "bioMiddleName");
        l.f(str21, "bioMobileNo");
        l.f(str22, "bioNatName");
        l.f(str23, "bioOrganDonor");
        l.f(str24, "bioPermAdd1");
        l.f(str25, "bioPermAdd2");
        l.f(str26, "bioPermAdd3");
        l.f(str27, "bioPermDistName");
        l.f(str28, "bioPermSdName");
        l.f(str29, "bioRecGenesis");
        l.f(str30, "bioSwdFname");
        l.f(str31, "bioSwdFullName");
        l.f(str34, "bioTempAdd3");
        l.f(str35, "bioTempDistName");
        l.f(str36, "bioTempSdName");
        this.bioApplicantCatg = str;
        this.aadharAuthenticated = z10;
        this.bioApplno = str37;
        this.bioAadhaarName = str3;
        this.bioPerDetAadhaar = str4;
        this.bioBioId = str38;
        this.bioBioidSearch = str39;
        this.bioBloodGroup = str40;
        this.bioBloodGroupname = str41;
        this.bioCitiZen = str42;
        this.bioDependentRelation = str43;
        this.bioDlno = str44;
        this.bioDob = str45;
        this.bioEndorsedt = str46;
        this.bioEndorsementNo = str47;
        this.bioEndorsetime = str48;
        this.bioFirstName = str49;
        this.bioFullName = str50;
        this.bioGender = i10;
        this.bioGenderDesc = str18;
        this.bioLastName = str19;
        this.bioMiddleName = str20;
        this.bioMobileNo = str21;
        this.bioNatName = str22;
        this.bioOrganDonor = str23;
        this.bioPermAdd1 = str24;
        this.bioPermAdd2 = str25;
        this.bioPermAdd3 = str26;
        this.bioPermDistCd = i11;
        this.bioPermDistName = str27;
        this.bioPermPin = i12;
        this.bioPermSdName = str28;
        this.bioPermSdcode = i13;
        this.bioPermVillTownCd = i14;
        this.bioQmQualcd = i15;
        this.bioRecGenesis = str29;
        this.bioSwdFname = str30;
        this.bioSwdFullName = str31;
        this.bioTempAdd1 = str32;
        this.bioTempAdd2 = str33;
        this.bioTempAdd3 = str34;
        this.bioTempDistCd = i16;
        this.bioTempDistName = str35;
        this.bioTempPin = i17;
        this.bioTempSdName = str36;
        this.bioTempSdcode = i18;
        this.bioTempVillTownCd = i19;
        this.bioTokenId = i20;
        this.bioUserId = i21;
    }

    public static /* synthetic */ BioObjX copy$default(BioObjX bioObjX, String str, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i10, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i11, String str27, int i12, String str28, int i13, int i14, int i15, String str29, String str30, String str31, String str32, String str33, String str34, int i16, String str35, int i17, String str36, int i18, int i19, int i20, int i21, int i22, int i23, Object obj) {
        BioObjX bioObjX2 = bioObjX;
        int i24 = i22;
        int i25 = i23;
        return bioObjX.copy((i24 & 1) != 0 ? bioObjX2.bioApplicantCatg : str, (i24 & 2) != 0 ? bioObjX2.aadharAuthenticated : z10, (i24 & 4) != 0 ? bioObjX2.bioApplno : str2, (i24 & 8) != 0 ? bioObjX2.bioAadhaarName : str3, (i24 & 16) != 0 ? bioObjX2.bioPerDetAadhaar : str4, (i24 & 32) != 0 ? bioObjX2.bioBioId : str5, (i24 & 64) != 0 ? bioObjX2.bioBioidSearch : str6, (i24 & 128) != 0 ? bioObjX2.bioBloodGroup : str7, (i24 & 256) != 0 ? bioObjX2.bioBloodGroupname : str8, (i24 & 512) != 0 ? bioObjX2.bioCitiZen : str9, (i24 & 1024) != 0 ? bioObjX2.bioDependentRelation : str10, (i24 & 2048) != 0 ? bioObjX2.bioDlno : str11, (i24 & 4096) != 0 ? bioObjX2.bioDob : str12, (i24 & 8192) != 0 ? bioObjX2.bioEndorsedt : str13, (i24 & 16384) != 0 ? bioObjX2.bioEndorsementNo : str14, (i24 & 32768) != 0 ? bioObjX2.bioEndorsetime : str15, (i24 & 65536) != 0 ? bioObjX2.bioFirstName : str16, (i24 & 131072) != 0 ? bioObjX2.bioFullName : str17, (i24 & 262144) != 0 ? bioObjX2.bioGender : i10, (i24 & 524288) != 0 ? bioObjX2.bioGenderDesc : str18, (i24 & 1048576) != 0 ? bioObjX2.bioLastName : str19, (i24 & 2097152) != 0 ? bioObjX2.bioMiddleName : str20, (i24 & 4194304) != 0 ? bioObjX2.bioMobileNo : str21, (i24 & 8388608) != 0 ? bioObjX2.bioNatName : str22, (i24 & 16777216) != 0 ? bioObjX2.bioOrganDonor : str23, (i24 & 33554432) != 0 ? bioObjX2.bioPermAdd1 : str24, (i24 & 67108864) != 0 ? bioObjX2.bioPermAdd2 : str25, (i24 & 134217728) != 0 ? bioObjX2.bioPermAdd3 : str26, (i24 & 268435456) != 0 ? bioObjX2.bioPermDistCd : i11, (i24 & 536870912) != 0 ? bioObjX2.bioPermDistName : str27, (i24 & 1073741824) != 0 ? bioObjX2.bioPermPin : i12, (i24 & Integer.MIN_VALUE) != 0 ? bioObjX2.bioPermSdName : str28, (i25 & 1) != 0 ? bioObjX2.bioPermSdcode : i13, (i25 & 2) != 0 ? bioObjX2.bioPermVillTownCd : i14, (i25 & 4) != 0 ? bioObjX2.bioQmQualcd : i15, (i25 & 8) != 0 ? bioObjX2.bioRecGenesis : str29, (i25 & 16) != 0 ? bioObjX2.bioSwdFname : str30, (i25 & 32) != 0 ? bioObjX2.bioSwdFullName : str31, (i25 & 64) != 0 ? bioObjX2.bioTempAdd1 : str32, (i25 & 128) != 0 ? bioObjX2.bioTempAdd2 : str33, (i25 & 256) != 0 ? bioObjX2.bioTempAdd3 : str34, (i25 & 512) != 0 ? bioObjX2.bioTempDistCd : i16, (i25 & 1024) != 0 ? bioObjX2.bioTempDistName : str35, (i25 & 2048) != 0 ? bioObjX2.bioTempPin : i17, (i25 & 4096) != 0 ? bioObjX2.bioTempSdName : str36, (i25 & 8192) != 0 ? bioObjX2.bioTempSdcode : i18, (i25 & 16384) != 0 ? bioObjX2.bioTempVillTownCd : i19, (i25 & 32768) != 0 ? bioObjX2.bioTokenId : i20, (i25 & 65536) != 0 ? bioObjX2.bioUserId : i21);
    }

    public final String component1() {
        return this.bioApplicantCatg;
    }

    public final String component10() {
        return this.bioCitiZen;
    }

    public final String component11() {
        return this.bioDependentRelation;
    }

    public final String component12() {
        return this.bioDlno;
    }

    public final String component13() {
        return this.bioDob;
    }

    public final String component14() {
        return this.bioEndorsedt;
    }

    public final String component15() {
        return this.bioEndorsementNo;
    }

    public final String component16() {
        return this.bioEndorsetime;
    }

    public final String component17() {
        return this.bioFirstName;
    }

    public final String component18() {
        return this.bioFullName;
    }

    public final int component19() {
        return this.bioGender;
    }

    public final boolean component2() {
        return this.aadharAuthenticated;
    }

    public final String component20() {
        return this.bioGenderDesc;
    }

    public final String component21() {
        return this.bioLastName;
    }

    public final String component22() {
        return this.bioMiddleName;
    }

    public final String component23() {
        return this.bioMobileNo;
    }

    public final String component24() {
        return this.bioNatName;
    }

    public final String component25() {
        return this.bioOrganDonor;
    }

    public final String component26() {
        return this.bioPermAdd1;
    }

    public final String component27() {
        return this.bioPermAdd2;
    }

    public final String component28() {
        return this.bioPermAdd3;
    }

    public final int component29() {
        return this.bioPermDistCd;
    }

    public final String component3() {
        return this.bioApplno;
    }

    public final String component30() {
        return this.bioPermDistName;
    }

    public final int component31() {
        return this.bioPermPin;
    }

    public final String component32() {
        return this.bioPermSdName;
    }

    public final int component33() {
        return this.bioPermSdcode;
    }

    public final int component34() {
        return this.bioPermVillTownCd;
    }

    public final int component35() {
        return this.bioQmQualcd;
    }

    public final String component36() {
        return this.bioRecGenesis;
    }

    public final String component37() {
        return this.bioSwdFname;
    }

    public final String component38() {
        return this.bioSwdFullName;
    }

    public final String component39() {
        return this.bioTempAdd1;
    }

    public final String component4() {
        return this.bioAadhaarName;
    }

    public final String component40() {
        return this.bioTempAdd2;
    }

    public final String component41() {
        return this.bioTempAdd3;
    }

    public final int component42() {
        return this.bioTempDistCd;
    }

    public final String component43() {
        return this.bioTempDistName;
    }

    public final int component44() {
        return this.bioTempPin;
    }

    public final String component45() {
        return this.bioTempSdName;
    }

    public final int component46() {
        return this.bioTempSdcode;
    }

    public final int component47() {
        return this.bioTempVillTownCd;
    }

    public final int component48() {
        return this.bioTokenId;
    }

    public final int component49() {
        return this.bioUserId;
    }

    public final String component5() {
        return this.bioPerDetAadhaar;
    }

    public final String component6() {
        return this.bioBioId;
    }

    public final String component7() {
        return this.bioBioidSearch;
    }

    public final String component8() {
        return this.bioBloodGroup;
    }

    public final String component9() {
        return this.bioBloodGroupname;
    }

    public final BioObjX copy(String str, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i10, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i11, String str27, int i12, String str28, int i13, int i14, int i15, String str29, String str30, String str31, String str32, String str33, String str34, int i16, String str35, int i17, String str36, int i18, int i19, int i20, int i21) {
        String str37 = str;
        l.f(str2, "bioApplno");
        l.f(str5, "bioBioId");
        l.f(str6, "bioBioidSearch");
        l.f(str7, "bioBloodGroup");
        l.f(str8, "bioBloodGroupname");
        l.f(str9, "bioCitiZen");
        l.f(str10, "bioDependentRelation");
        l.f(str11, "bioDlno");
        l.f(str12, "bioDob");
        l.f(str13, "bioEndorsedt");
        l.f(str14, "bioEndorsementNo");
        l.f(str15, "bioEndorsetime");
        l.f(str16, "bioFirstName");
        l.f(str17, "bioFullName");
        l.f(str18, "bioGenderDesc");
        l.f(str19, "bioLastName");
        l.f(str20, "bioMiddleName");
        l.f(str21, "bioMobileNo");
        l.f(str22, "bioNatName");
        l.f(str23, "bioOrganDonor");
        l.f(str24, "bioPermAdd1");
        l.f(str25, "bioPermAdd2");
        l.f(str26, "bioPermAdd3");
        l.f(str27, "bioPermDistName");
        l.f(str28, "bioPermSdName");
        l.f(str29, "bioRecGenesis");
        l.f(str30, "bioSwdFname");
        l.f(str31, "bioSwdFullName");
        l.f(str34, "bioTempAdd3");
        l.f(str35, "bioTempDistName");
        l.f(str36, "bioTempSdName");
        return new BioObjX(str, z10, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, i10, str18, str19, str20, str21, str22, str23, str24, str25, str26, i11, str27, i12, str28, i13, i14, i15, str29, str30, str31, str32, str33, str34, i16, str35, i17, str36, i18, i19, i20, i21);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BioObjX)) {
            return false;
        }
        BioObjX bioObjX = (BioObjX) obj;
        return l.a(this.bioApplicantCatg, bioObjX.bioApplicantCatg) && this.aadharAuthenticated == bioObjX.aadharAuthenticated && l.a(this.bioApplno, bioObjX.bioApplno) && l.a(this.bioAadhaarName, bioObjX.bioAadhaarName) && l.a(this.bioPerDetAadhaar, bioObjX.bioPerDetAadhaar) && l.a(this.bioBioId, bioObjX.bioBioId) && l.a(this.bioBioidSearch, bioObjX.bioBioidSearch) && l.a(this.bioBloodGroup, bioObjX.bioBloodGroup) && l.a(this.bioBloodGroupname, bioObjX.bioBloodGroupname) && l.a(this.bioCitiZen, bioObjX.bioCitiZen) && l.a(this.bioDependentRelation, bioObjX.bioDependentRelation) && l.a(this.bioDlno, bioObjX.bioDlno) && l.a(this.bioDob, bioObjX.bioDob) && l.a(this.bioEndorsedt, bioObjX.bioEndorsedt) && l.a(this.bioEndorsementNo, bioObjX.bioEndorsementNo) && l.a(this.bioEndorsetime, bioObjX.bioEndorsetime) && l.a(this.bioFirstName, bioObjX.bioFirstName) && l.a(this.bioFullName, bioObjX.bioFullName) && this.bioGender == bioObjX.bioGender && l.a(this.bioGenderDesc, bioObjX.bioGenderDesc) && l.a(this.bioLastName, bioObjX.bioLastName) && l.a(this.bioMiddleName, bioObjX.bioMiddleName) && l.a(this.bioMobileNo, bioObjX.bioMobileNo) && l.a(this.bioNatName, bioObjX.bioNatName) && l.a(this.bioOrganDonor, bioObjX.bioOrganDonor) && l.a(this.bioPermAdd1, bioObjX.bioPermAdd1) && l.a(this.bioPermAdd2, bioObjX.bioPermAdd2) && l.a(this.bioPermAdd3, bioObjX.bioPermAdd3) && this.bioPermDistCd == bioObjX.bioPermDistCd && l.a(this.bioPermDistName, bioObjX.bioPermDistName) && this.bioPermPin == bioObjX.bioPermPin && l.a(this.bioPermSdName, bioObjX.bioPermSdName) && this.bioPermSdcode == bioObjX.bioPermSdcode && this.bioPermVillTownCd == bioObjX.bioPermVillTownCd && this.bioQmQualcd == bioObjX.bioQmQualcd && l.a(this.bioRecGenesis, bioObjX.bioRecGenesis) && l.a(this.bioSwdFname, bioObjX.bioSwdFname) && l.a(this.bioSwdFullName, bioObjX.bioSwdFullName) && l.a(this.bioTempAdd1, bioObjX.bioTempAdd1) && l.a(this.bioTempAdd2, bioObjX.bioTempAdd2) && l.a(this.bioTempAdd3, bioObjX.bioTempAdd3) && this.bioTempDistCd == bioObjX.bioTempDistCd && l.a(this.bioTempDistName, bioObjX.bioTempDistName) && this.bioTempPin == bioObjX.bioTempPin && l.a(this.bioTempSdName, bioObjX.bioTempSdName) && this.bioTempSdcode == bioObjX.bioTempSdcode && this.bioTempVillTownCd == bioObjX.bioTempVillTownCd && this.bioTokenId == bioObjX.bioTokenId && this.bioUserId == bioObjX.bioUserId;
    }

    public final boolean getAadharAuthenticated() {
        return this.aadharAuthenticated;
    }

    public final String getBioAadhaarName() {
        return this.bioAadhaarName;
    }

    public final String getBioApplicantCatg() {
        return this.bioApplicantCatg;
    }

    public final String getBioApplno() {
        return this.bioApplno;
    }

    public final String getBioBioId() {
        return this.bioBioId;
    }

    public final String getBioBioidSearch() {
        return this.bioBioidSearch;
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

    public final String getBioDlno() {
        return this.bioDlno;
    }

    public final String getBioDob() {
        return this.bioDob;
    }

    public final String getBioEndorsedt() {
        return this.bioEndorsedt;
    }

    public final String getBioEndorsementNo() {
        return this.bioEndorsementNo;
    }

    public final String getBioEndorsetime() {
        return this.bioEndorsetime;
    }

    public final String getBioFirstName() {
        return this.bioFirstName;
    }

    public final String getBioFullName() {
        return this.bioFullName;
    }

    public final int getBioGender() {
        return this.bioGender;
    }

    public final String getBioGenderDesc() {
        return this.bioGenderDesc;
    }

    public final String getBioLastName() {
        return this.bioLastName;
    }

    public final String getBioMiddleName() {
        return this.bioMiddleName;
    }

    public final String getBioMobileNo() {
        return this.bioMobileNo;
    }

    public final String getBioNatName() {
        return this.bioNatName;
    }

    public final String getBioOrganDonor() {
        return this.bioOrganDonor;
    }

    public final String getBioPerDetAadhaar() {
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

    public final int getBioPermDistCd() {
        return this.bioPermDistCd;
    }

    public final String getBioPermDistName() {
        return this.bioPermDistName;
    }

    public final int getBioPermPin() {
        return this.bioPermPin;
    }

    public final String getBioPermSdName() {
        return this.bioPermSdName;
    }

    public final int getBioPermSdcode() {
        return this.bioPermSdcode;
    }

    public final int getBioPermVillTownCd() {
        return this.bioPermVillTownCd;
    }

    public final int getBioQmQualcd() {
        return this.bioQmQualcd;
    }

    public final String getBioRecGenesis() {
        return this.bioRecGenesis;
    }

    public final String getBioSwdFname() {
        return this.bioSwdFname;
    }

    public final String getBioSwdFullName() {
        return this.bioSwdFullName;
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

    public final int getBioTempDistCd() {
        return this.bioTempDistCd;
    }

    public final String getBioTempDistName() {
        return this.bioTempDistName;
    }

    public final int getBioTempPin() {
        return this.bioTempPin;
    }

    public final String getBioTempSdName() {
        return this.bioTempSdName;
    }

    public final int getBioTempSdcode() {
        return this.bioTempSdcode;
    }

    public final int getBioTempVillTownCd() {
        return this.bioTempVillTownCd;
    }

    public final int getBioTokenId() {
        return this.bioTokenId;
    }

    public final int getBioUserId() {
        return this.bioUserId;
    }

    public int hashCode() {
        String str = this.bioApplicantCatg;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z10 = this.aadharAuthenticated;
        if (z10) {
            z10 = true;
        }
        int hashCode2 = (((hashCode + (z10 ? 1 : 0)) * 31) + this.bioApplno.hashCode()) * 31;
        String str2 = this.bioAadhaarName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bioPerDetAadhaar;
        int hashCode4 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.bioBioId.hashCode()) * 31) + this.bioBioidSearch.hashCode()) * 31) + this.bioBloodGroup.hashCode()) * 31) + this.bioBloodGroupname.hashCode()) * 31) + this.bioCitiZen.hashCode()) * 31) + this.bioDependentRelation.hashCode()) * 31) + this.bioDlno.hashCode()) * 31) + this.bioDob.hashCode()) * 31) + this.bioEndorsedt.hashCode()) * 31) + this.bioEndorsementNo.hashCode()) * 31) + this.bioEndorsetime.hashCode()) * 31) + this.bioFirstName.hashCode()) * 31) + this.bioFullName.hashCode()) * 31) + Integer.hashCode(this.bioGender)) * 31) + this.bioGenderDesc.hashCode()) * 31) + this.bioLastName.hashCode()) * 31) + this.bioMiddleName.hashCode()) * 31) + this.bioMobileNo.hashCode()) * 31) + this.bioNatName.hashCode()) * 31) + this.bioOrganDonor.hashCode()) * 31) + this.bioPermAdd1.hashCode()) * 31) + this.bioPermAdd2.hashCode()) * 31) + this.bioPermAdd3.hashCode()) * 31) + Integer.hashCode(this.bioPermDistCd)) * 31) + this.bioPermDistName.hashCode()) * 31) + Integer.hashCode(this.bioPermPin)) * 31) + this.bioPermSdName.hashCode()) * 31) + Integer.hashCode(this.bioPermSdcode)) * 31) + Integer.hashCode(this.bioPermVillTownCd)) * 31) + Integer.hashCode(this.bioQmQualcd)) * 31) + this.bioRecGenesis.hashCode()) * 31) + this.bioSwdFname.hashCode()) * 31) + this.bioSwdFullName.hashCode()) * 31;
        String str4 = this.bioTempAdd1;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bioTempAdd2;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return ((((((((((((((((((hashCode5 + i10) * 31) + this.bioTempAdd3.hashCode()) * 31) + Integer.hashCode(this.bioTempDistCd)) * 31) + this.bioTempDistName.hashCode()) * 31) + Integer.hashCode(this.bioTempPin)) * 31) + this.bioTempSdName.hashCode()) * 31) + Integer.hashCode(this.bioTempSdcode)) * 31) + Integer.hashCode(this.bioTempVillTownCd)) * 31) + Integer.hashCode(this.bioTokenId)) * 31) + Integer.hashCode(this.bioUserId);
    }

    public final void setBioDob(String str) {
        l.f(str, "<set-?>");
        this.bioDob = str;
    }

    public String toString() {
        return "BioObjX(bioApplicantCatg=" + this.bioApplicantCatg + ", aadharAuthenticated=" + this.aadharAuthenticated + ", bioApplno=" + this.bioApplno + ", bioAadhaarName=" + this.bioAadhaarName + ", bioPerDetAadhaar=" + this.bioPerDetAadhaar + ", bioBioId=" + this.bioBioId + ", bioBioidSearch=" + this.bioBioidSearch + ", bioBloodGroup=" + this.bioBloodGroup + ", bioBloodGroupname=" + this.bioBloodGroupname + ", bioCitiZen=" + this.bioCitiZen + ", bioDependentRelation=" + this.bioDependentRelation + ", bioDlno=" + this.bioDlno + ", bioDob=" + this.bioDob + ", bioEndorsedt=" + this.bioEndorsedt + ", bioEndorsementNo=" + this.bioEndorsementNo + ", bioEndorsetime=" + this.bioEndorsetime + ", bioFirstName=" + this.bioFirstName + ", bioFullName=" + this.bioFullName + ", bioGender=" + this.bioGender + ", bioGenderDesc=" + this.bioGenderDesc + ", bioLastName=" + this.bioLastName + ", bioMiddleName=" + this.bioMiddleName + ", bioMobileNo=" + this.bioMobileNo + ", bioNatName=" + this.bioNatName + ", bioOrganDonor=" + this.bioOrganDonor + ", bioPermAdd1=" + this.bioPermAdd1 + ", bioPermAdd2=" + this.bioPermAdd2 + ", bioPermAdd3=" + this.bioPermAdd3 + ", bioPermDistCd=" + this.bioPermDistCd + ", bioPermDistName=" + this.bioPermDistName + ", bioPermPin=" + this.bioPermPin + ", bioPermSdName=" + this.bioPermSdName + ", bioPermSdcode=" + this.bioPermSdcode + ", bioPermVillTownCd=" + this.bioPermVillTownCd + ", bioQmQualcd=" + this.bioQmQualcd + ", bioRecGenesis=" + this.bioRecGenesis + ", bioSwdFname=" + this.bioSwdFname + ", bioSwdFullName=" + this.bioSwdFullName + ", bioTempAdd1=" + this.bioTempAdd1 + ", bioTempAdd2=" + this.bioTempAdd2 + ", bioTempAdd3=" + this.bioTempAdd3 + ", bioTempDistCd=" + this.bioTempDistCd + ", bioTempDistName=" + this.bioTempDistName + ", bioTempPin=" + this.bioTempPin + ", bioTempSdName=" + this.bioTempSdName + ", bioTempSdcode=" + this.bioTempSdcode + ", bioTempVillTownCd=" + this.bioTempVillTownCd + ", bioTokenId=" + this.bioTokenId + ", bioUserId=" + this.bioUserId + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BioObjX(String str, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i10, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i11, String str27, int i12, String str28, int i13, int i14, int i15, String str29, String str30, String str31, String str32, String str33, String str34, int i16, String str35, int i17, String str36, int i18, int i19, int i20, int i21, int i22, int i23, g gVar) {
        this(str, z10, str2, (i22 & 8) != 0 ? null : str3, (i22 & 16) != 0 ? null : str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, i10, str18, str19, str20, str21, str22, str23, str24, str25, str26, i11, str27, i12, str28, i13, i14, i15, str29, str30, str31, str32, str33, str34, i16, str35, i17, str36, i18, i19, i20, i21);
    }
}
