package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class LLDetail implements Serializable {
    private final String PresVillageOrTown;
    private final String aadhaarNumber;
    private final String age;
    private final List<BloodGroup> bloodGroup;
    private final List<CheckCov> checkCovs;
    private final List<CountryOfBirth> countryOfBirth;
    private final String dateOfBirth;
    private final List<DrivingSchoolDet> drivingSchoolDet;
    private final boolean editAddressLL;
    private final List<EduQual> eduQual;
    private final String email;
    private final String fname;
    private final List<Gender> gender;
    private final String idMarks1;
    private final String idMarks2;
    private final List<LlFromRTO1> llFromRTO1;
    private final List<LlFromState1> llFromState1;
    private final List<LlstoDisplayMap> llstoDisplayMap;
    private final String lname;
    private final String mname;
    private final String mobileNumber;
    private final String newFullName;
    private final boolean onlyEditAddressLL;
    private final List<PermCity> permCity;
    private final List<PermDistrict> permDistrict;
    private final String permHouseNo;
    private final String permLocation;
    private final String permPinCode;
    private final List<PermState> permState;
    private final String permStreet;
    private final List<PermSubDistrict> permSubDistrict;
    private final String permVillageOrTown;
    private final List<PresCity> presCity;
    private final List<PresDistrict> presDistrict;
    private final String presHouseNo;
    private final String presLocation;
    private final String presPinCode;
    private final String presSameAsPerm;
    private final List<PresState> presState;
    private final String presStayMonths;
    private final String presStayYears;
    private final String presStreet;
    private final List<PresSubDistrict> presSubDistrict;
    private final String refStateEqiCovsMessage;
    private final List<RelationType> relationType;
    private final String selectAll;
    private final String selectedCovs;
    private final String swdfName;
    private final String swdlName;
    private final String swdmName;

    public LLDetail(String str, String str2, String str3, List<BloodGroup> list, List<CheckCov> list2, List<CountryOfBirth> list3, String str4, List<DrivingSchoolDet> list4, boolean z10, List<EduQual> list5, String str5, String str6, List<Gender> list6, String str7, String str8, List<LlFromRTO1> list7, List<LlFromState1> list8, List<LlstoDisplayMap> list9, String str9, String str10, String str11, String str12, boolean z11, List<PermCity> list10, List<PermDistrict> list11, String str13, String str14, String str15, List<PermState> list12, String str16, List<PermSubDistrict> list13, String str17, List<PresCity> list14, List<PresDistrict> list15, String str18, String str19, String str20, String str21, List<PresState> list16, String str22, String str23, String str24, List<PresSubDistrict> list17, String str25, List<RelationType> list18, String str26, String str27, String str28, String str29, String str30) {
        String str31 = str;
        String str32 = str2;
        String str33 = str3;
        List<BloodGroup> list19 = list;
        List<CheckCov> list20 = list2;
        List<CountryOfBirth> list21 = list3;
        String str34 = str4;
        List<DrivingSchoolDet> list22 = list4;
        List<EduQual> list23 = list5;
        String str35 = str5;
        String str36 = str6;
        List<Gender> list24 = list6;
        String str37 = str7;
        String str38 = str8;
        List<LlFromState1> list25 = list8;
        l.f(str31, "PresVillageOrTown");
        l.f(str32, "aadhaarNumber");
        l.f(str33, "age");
        l.f(list19, "bloodGroup");
        l.f(list20, "checkCovs");
        l.f(list21, "countryOfBirth");
        l.f(str34, "dateOfBirth");
        l.f(list22, "drivingSchoolDet");
        l.f(list23, "eduQual");
        l.f(str35, "email");
        l.f(str36, "fname");
        l.f(list24, "gender");
        l.f(str37, "idMarks1");
        l.f(str38, "idMarks2");
        l.f(list7, "llFromRTO1");
        l.f(list8, "llFromState1");
        l.f(list9, "llstoDisplayMap");
        l.f(str9, "lname");
        l.f(str10, "mname");
        l.f(str11, "mobileNumber");
        l.f(str12, "newFullName");
        l.f(list10, "permCity");
        l.f(list11, "permDistrict");
        l.f(str13, "permHouseNo");
        l.f(str14, "permLocation");
        l.f(str15, "permPinCode");
        l.f(list12, "permState");
        l.f(str16, "permStreet");
        l.f(list13, "permSubDistrict");
        l.f(str17, "permVillageOrTown");
        l.f(list14, "presCity");
        l.f(list15, "presDistrict");
        l.f(str18, "presHouseNo");
        l.f(str19, "presLocation");
        l.f(str20, "presPinCode");
        l.f(str21, "presSameAsPerm");
        l.f(list16, "presState");
        l.f(str22, "presStayMonths");
        l.f(str23, "presStayYears");
        l.f(str24, "presStreet");
        l.f(list17, "presSubDistrict");
        l.f(str25, "refStateEqiCovsMessage");
        l.f(list18, "relationType");
        l.f(str26, "selectAll");
        l.f(str27, "selectedCovs");
        l.f(str28, "swdfName");
        l.f(str29, "swdlName");
        l.f(str30, "swdmName");
        this.PresVillageOrTown = str31;
        this.aadhaarNumber = str32;
        this.age = str33;
        this.bloodGroup = list19;
        this.checkCovs = list20;
        this.countryOfBirth = list21;
        this.dateOfBirth = str34;
        this.drivingSchoolDet = list22;
        this.editAddressLL = z10;
        this.eduQual = list23;
        this.email = str35;
        this.fname = str36;
        this.gender = list24;
        this.idMarks1 = str37;
        this.idMarks2 = str38;
        this.llFromRTO1 = list7;
        this.llFromState1 = list8;
        this.llstoDisplayMap = list9;
        this.lname = str9;
        this.mname = str10;
        this.mobileNumber = str11;
        this.newFullName = str12;
        this.onlyEditAddressLL = z11;
        this.permCity = list10;
        this.permDistrict = list11;
        this.permHouseNo = str13;
        this.permLocation = str14;
        this.permPinCode = str15;
        this.permState = list12;
        this.permStreet = str16;
        this.permSubDistrict = list13;
        this.permVillageOrTown = str17;
        this.presCity = list14;
        this.presDistrict = list15;
        this.presHouseNo = str18;
        this.presLocation = str19;
        this.presPinCode = str20;
        this.presSameAsPerm = str21;
        this.presState = list16;
        this.presStayMonths = str22;
        this.presStayYears = str23;
        this.presStreet = str24;
        this.presSubDistrict = list17;
        this.refStateEqiCovsMessage = str25;
        this.relationType = list18;
        this.selectAll = str26;
        this.selectedCovs = str27;
        this.swdfName = str28;
        this.swdlName = str29;
        this.swdmName = str30;
    }

    public static /* synthetic */ LLDetail copy$default(LLDetail lLDetail, String str, String str2, String str3, List list, List list2, List list3, String str4, List list4, boolean z10, List list5, String str5, String str6, List list6, String str7, String str8, List list7, List list8, List list9, String str9, String str10, String str11, String str12, boolean z11, List list10, List list11, String str13, String str14, String str15, List list12, String str16, List list13, String str17, List list14, List list15, String str18, String str19, String str20, String str21, List list16, String str22, String str23, String str24, List list17, String str25, List list18, String str26, String str27, String str28, String str29, String str30, int i10, int i11, Object obj) {
        LLDetail lLDetail2 = lLDetail;
        int i12 = i10;
        int i13 = i11;
        return lLDetail.copy((i12 & 1) != 0 ? lLDetail2.PresVillageOrTown : str, (i12 & 2) != 0 ? lLDetail2.aadhaarNumber : str2, (i12 & 4) != 0 ? lLDetail2.age : str3, (i12 & 8) != 0 ? lLDetail2.bloodGroup : list, (i12 & 16) != 0 ? lLDetail2.checkCovs : list2, (i12 & 32) != 0 ? lLDetail2.countryOfBirth : list3, (i12 & 64) != 0 ? lLDetail2.dateOfBirth : str4, (i12 & 128) != 0 ? lLDetail2.drivingSchoolDet : list4, (i12 & 256) != 0 ? lLDetail2.editAddressLL : z10, (i12 & 512) != 0 ? lLDetail2.eduQual : list5, (i12 & 1024) != 0 ? lLDetail2.email : str5, (i12 & 2048) != 0 ? lLDetail2.fname : str6, (i12 & 4096) != 0 ? lLDetail2.gender : list6, (i12 & 8192) != 0 ? lLDetail2.idMarks1 : str7, (i12 & 16384) != 0 ? lLDetail2.idMarks2 : str8, (i12 & 32768) != 0 ? lLDetail2.llFromRTO1 : list7, (i12 & 65536) != 0 ? lLDetail2.llFromState1 : list8, (i12 & 131072) != 0 ? lLDetail2.llstoDisplayMap : list9, (i12 & 262144) != 0 ? lLDetail2.lname : str9, (i12 & 524288) != 0 ? lLDetail2.mname : str10, (i12 & 1048576) != 0 ? lLDetail2.mobileNumber : str11, (i12 & 2097152) != 0 ? lLDetail2.newFullName : str12, (i12 & 4194304) != 0 ? lLDetail2.onlyEditAddressLL : z11, (i12 & 8388608) != 0 ? lLDetail2.permCity : list10, (i12 & 16777216) != 0 ? lLDetail2.permDistrict : list11, (i12 & 33554432) != 0 ? lLDetail2.permHouseNo : str13, (i12 & 67108864) != 0 ? lLDetail2.permLocation : str14, (i12 & 134217728) != 0 ? lLDetail2.permPinCode : str15, (i12 & 268435456) != 0 ? lLDetail2.permState : list12, (i12 & 536870912) != 0 ? lLDetail2.permStreet : str16, (i12 & 1073741824) != 0 ? lLDetail2.permSubDistrict : list13, (i12 & Integer.MIN_VALUE) != 0 ? lLDetail2.permVillageOrTown : str17, (i13 & 1) != 0 ? lLDetail2.presCity : list14, (i13 & 2) != 0 ? lLDetail2.presDistrict : list15, (i13 & 4) != 0 ? lLDetail2.presHouseNo : str18, (i13 & 8) != 0 ? lLDetail2.presLocation : str19, (i13 & 16) != 0 ? lLDetail2.presPinCode : str20, (i13 & 32) != 0 ? lLDetail2.presSameAsPerm : str21, (i13 & 64) != 0 ? lLDetail2.presState : list16, (i13 & 128) != 0 ? lLDetail2.presStayMonths : str22, (i13 & 256) != 0 ? lLDetail2.presStayYears : str23, (i13 & 512) != 0 ? lLDetail2.presStreet : str24, (i13 & 1024) != 0 ? lLDetail2.presSubDistrict : list17, (i13 & 2048) != 0 ? lLDetail2.refStateEqiCovsMessage : str25, (i13 & 4096) != 0 ? lLDetail2.relationType : list18, (i13 & 8192) != 0 ? lLDetail2.selectAll : str26, (i13 & 16384) != 0 ? lLDetail2.selectedCovs : str27, (i13 & 32768) != 0 ? lLDetail2.swdfName : str28, (i13 & 65536) != 0 ? lLDetail2.swdlName : str29, (i13 & 131072) != 0 ? lLDetail2.swdmName : str30);
    }

    public final String component1() {
        return this.PresVillageOrTown;
    }

    public final List<EduQual> component10() {
        return this.eduQual;
    }

    public final String component11() {
        return this.email;
    }

    public final String component12() {
        return this.fname;
    }

    public final List<Gender> component13() {
        return this.gender;
    }

    public final String component14() {
        return this.idMarks1;
    }

    public final String component15() {
        return this.idMarks2;
    }

    public final List<LlFromRTO1> component16() {
        return this.llFromRTO1;
    }

    public final List<LlFromState1> component17() {
        return this.llFromState1;
    }

    public final List<LlstoDisplayMap> component18() {
        return this.llstoDisplayMap;
    }

    public final String component19() {
        return this.lname;
    }

    public final String component2() {
        return this.aadhaarNumber;
    }

    public final String component20() {
        return this.mname;
    }

    public final String component21() {
        return this.mobileNumber;
    }

    public final String component22() {
        return this.newFullName;
    }

    public final boolean component23() {
        return this.onlyEditAddressLL;
    }

    public final List<PermCity> component24() {
        return this.permCity;
    }

    public final List<PermDistrict> component25() {
        return this.permDistrict;
    }

    public final String component26() {
        return this.permHouseNo;
    }

    public final String component27() {
        return this.permLocation;
    }

    public final String component28() {
        return this.permPinCode;
    }

    public final List<PermState> component29() {
        return this.permState;
    }

    public final String component3() {
        return this.age;
    }

    public final String component30() {
        return this.permStreet;
    }

    public final List<PermSubDistrict> component31() {
        return this.permSubDistrict;
    }

    public final String component32() {
        return this.permVillageOrTown;
    }

    public final List<PresCity> component33() {
        return this.presCity;
    }

    public final List<PresDistrict> component34() {
        return this.presDistrict;
    }

    public final String component35() {
        return this.presHouseNo;
    }

    public final String component36() {
        return this.presLocation;
    }

    public final String component37() {
        return this.presPinCode;
    }

    public final String component38() {
        return this.presSameAsPerm;
    }

    public final List<PresState> component39() {
        return this.presState;
    }

    public final List<BloodGroup> component4() {
        return this.bloodGroup;
    }

    public final String component40() {
        return this.presStayMonths;
    }

    public final String component41() {
        return this.presStayYears;
    }

    public final String component42() {
        return this.presStreet;
    }

    public final List<PresSubDistrict> component43() {
        return this.presSubDistrict;
    }

    public final String component44() {
        return this.refStateEqiCovsMessage;
    }

    public final List<RelationType> component45() {
        return this.relationType;
    }

    public final String component46() {
        return this.selectAll;
    }

    public final String component47() {
        return this.selectedCovs;
    }

    public final String component48() {
        return this.swdfName;
    }

    public final String component49() {
        return this.swdlName;
    }

    public final List<CheckCov> component5() {
        return this.checkCovs;
    }

    public final String component50() {
        return this.swdmName;
    }

    public final List<CountryOfBirth> component6() {
        return this.countryOfBirth;
    }

    public final String component7() {
        return this.dateOfBirth;
    }

    public final List<DrivingSchoolDet> component8() {
        return this.drivingSchoolDet;
    }

    public final boolean component9() {
        return this.editAddressLL;
    }

    public final LLDetail copy(String str, String str2, String str3, List<BloodGroup> list, List<CheckCov> list2, List<CountryOfBirth> list3, String str4, List<DrivingSchoolDet> list4, boolean z10, List<EduQual> list5, String str5, String str6, List<Gender> list6, String str7, String str8, List<LlFromRTO1> list7, List<LlFromState1> list8, List<LlstoDisplayMap> list9, String str9, String str10, String str11, String str12, boolean z11, List<PermCity> list10, List<PermDistrict> list11, String str13, String str14, String str15, List<PermState> list12, String str16, List<PermSubDistrict> list13, String str17, List<PresCity> list14, List<PresDistrict> list15, String str18, String str19, String str20, String str21, List<PresState> list16, String str22, String str23, String str24, List<PresSubDistrict> list17, String str25, List<RelationType> list18, String str26, String str27, String str28, String str29, String str30) {
        String str31 = str;
        l.f(str31, "PresVillageOrTown");
        l.f(str2, "aadhaarNumber");
        l.f(str3, "age");
        l.f(list, "bloodGroup");
        l.f(list2, "checkCovs");
        l.f(list3, "countryOfBirth");
        l.f(str4, "dateOfBirth");
        l.f(list4, "drivingSchoolDet");
        l.f(list5, "eduQual");
        l.f(str5, "email");
        l.f(str6, "fname");
        l.f(list6, "gender");
        l.f(str7, "idMarks1");
        l.f(str8, "idMarks2");
        l.f(list7, "llFromRTO1");
        l.f(list8, "llFromState1");
        l.f(list9, "llstoDisplayMap");
        l.f(str9, "lname");
        l.f(str10, "mname");
        l.f(str11, "mobileNumber");
        l.f(str12, "newFullName");
        l.f(list10, "permCity");
        l.f(list11, "permDistrict");
        l.f(str13, "permHouseNo");
        l.f(str14, "permLocation");
        l.f(str15, "permPinCode");
        l.f(list12, "permState");
        l.f(str16, "permStreet");
        l.f(list13, "permSubDistrict");
        l.f(str17, "permVillageOrTown");
        l.f(list14, "presCity");
        l.f(list15, "presDistrict");
        l.f(str18, "presHouseNo");
        l.f(str19, "presLocation");
        l.f(str20, "presPinCode");
        l.f(str21, "presSameAsPerm");
        l.f(list16, "presState");
        l.f(str22, "presStayMonths");
        l.f(str23, "presStayYears");
        l.f(str24, "presStreet");
        l.f(list17, "presSubDistrict");
        l.f(str25, "refStateEqiCovsMessage");
        l.f(list18, "relationType");
        l.f(str26, "selectAll");
        l.f(str27, "selectedCovs");
        l.f(str28, "swdfName");
        l.f(str29, "swdlName");
        l.f(str30, "swdmName");
        return new LLDetail(str31, str2, str3, list, list2, list3, str4, list4, z10, list5, str5, str6, list6, str7, str8, list7, list8, list9, str9, str10, str11, str12, z11, list10, list11, str13, str14, str15, list12, str16, list13, str17, list14, list15, str18, str19, str20, str21, list16, str22, str23, str24, list17, str25, list18, str26, str27, str28, str29, str30);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LLDetail)) {
            return false;
        }
        LLDetail lLDetail = (LLDetail) obj;
        return l.a(this.PresVillageOrTown, lLDetail.PresVillageOrTown) && l.a(this.aadhaarNumber, lLDetail.aadhaarNumber) && l.a(this.age, lLDetail.age) && l.a(this.bloodGroup, lLDetail.bloodGroup) && l.a(this.checkCovs, lLDetail.checkCovs) && l.a(this.countryOfBirth, lLDetail.countryOfBirth) && l.a(this.dateOfBirth, lLDetail.dateOfBirth) && l.a(this.drivingSchoolDet, lLDetail.drivingSchoolDet) && this.editAddressLL == lLDetail.editAddressLL && l.a(this.eduQual, lLDetail.eduQual) && l.a(this.email, lLDetail.email) && l.a(this.fname, lLDetail.fname) && l.a(this.gender, lLDetail.gender) && l.a(this.idMarks1, lLDetail.idMarks1) && l.a(this.idMarks2, lLDetail.idMarks2) && l.a(this.llFromRTO1, lLDetail.llFromRTO1) && l.a(this.llFromState1, lLDetail.llFromState1) && l.a(this.llstoDisplayMap, lLDetail.llstoDisplayMap) && l.a(this.lname, lLDetail.lname) && l.a(this.mname, lLDetail.mname) && l.a(this.mobileNumber, lLDetail.mobileNumber) && l.a(this.newFullName, lLDetail.newFullName) && this.onlyEditAddressLL == lLDetail.onlyEditAddressLL && l.a(this.permCity, lLDetail.permCity) && l.a(this.permDistrict, lLDetail.permDistrict) && l.a(this.permHouseNo, lLDetail.permHouseNo) && l.a(this.permLocation, lLDetail.permLocation) && l.a(this.permPinCode, lLDetail.permPinCode) && l.a(this.permState, lLDetail.permState) && l.a(this.permStreet, lLDetail.permStreet) && l.a(this.permSubDistrict, lLDetail.permSubDistrict) && l.a(this.permVillageOrTown, lLDetail.permVillageOrTown) && l.a(this.presCity, lLDetail.presCity) && l.a(this.presDistrict, lLDetail.presDistrict) && l.a(this.presHouseNo, lLDetail.presHouseNo) && l.a(this.presLocation, lLDetail.presLocation) && l.a(this.presPinCode, lLDetail.presPinCode) && l.a(this.presSameAsPerm, lLDetail.presSameAsPerm) && l.a(this.presState, lLDetail.presState) && l.a(this.presStayMonths, lLDetail.presStayMonths) && l.a(this.presStayYears, lLDetail.presStayYears) && l.a(this.presStreet, lLDetail.presStreet) && l.a(this.presSubDistrict, lLDetail.presSubDistrict) && l.a(this.refStateEqiCovsMessage, lLDetail.refStateEqiCovsMessage) && l.a(this.relationType, lLDetail.relationType) && l.a(this.selectAll, lLDetail.selectAll) && l.a(this.selectedCovs, lLDetail.selectedCovs) && l.a(this.swdfName, lLDetail.swdfName) && l.a(this.swdlName, lLDetail.swdlName) && l.a(this.swdmName, lLDetail.swdmName);
    }

    public final String getAadhaarNumber() {
        return this.aadhaarNumber;
    }

    public final String getAge() {
        return this.age;
    }

    public final List<BloodGroup> getBloodGroup() {
        return this.bloodGroup;
    }

    public final List<CheckCov> getCheckCovs() {
        return this.checkCovs;
    }

    public final List<CountryOfBirth> getCountryOfBirth() {
        return this.countryOfBirth;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final List<DrivingSchoolDet> getDrivingSchoolDet() {
        return this.drivingSchoolDet;
    }

    public final boolean getEditAddressLL() {
        return this.editAddressLL;
    }

    public final List<EduQual> getEduQual() {
        return this.eduQual;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFname() {
        return this.fname;
    }

    public final List<Gender> getGender() {
        return this.gender;
    }

    public final String getIdMarks1() {
        return this.idMarks1;
    }

    public final String getIdMarks2() {
        return this.idMarks2;
    }

    public final List<LlFromRTO1> getLlFromRTO1() {
        return this.llFromRTO1;
    }

    public final List<LlFromState1> getLlFromState1() {
        return this.llFromState1;
    }

    public final List<LlstoDisplayMap> getLlstoDisplayMap() {
        return this.llstoDisplayMap;
    }

    public final String getLname() {
        return this.lname;
    }

    public final String getMname() {
        return this.mname;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getNewFullName() {
        return this.newFullName;
    }

    public final boolean getOnlyEditAddressLL() {
        return this.onlyEditAddressLL;
    }

    public final List<PermCity> getPermCity() {
        return this.permCity;
    }

    public final List<PermDistrict> getPermDistrict() {
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

    public final List<PermState> getPermState() {
        return this.permState;
    }

    public final String getPermStreet() {
        return this.permStreet;
    }

    public final List<PermSubDistrict> getPermSubDistrict() {
        return this.permSubDistrict;
    }

    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    public final List<PresCity> getPresCity() {
        return this.presCity;
    }

    public final List<PresDistrict> getPresDistrict() {
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

    public final String getPresSameAsPerm() {
        return this.presSameAsPerm;
    }

    public final List<PresState> getPresState() {
        return this.presState;
    }

    public final String getPresStayMonths() {
        return this.presStayMonths;
    }

    public final String getPresStayYears() {
        return this.presStayYears;
    }

    public final String getPresStreet() {
        return this.presStreet;
    }

    public final List<PresSubDistrict> getPresSubDistrict() {
        return this.presSubDistrict;
    }

    public final String getPresVillageOrTown() {
        return this.PresVillageOrTown;
    }

    public final String getRefStateEqiCovsMessage() {
        return this.refStateEqiCovsMessage;
    }

    public final List<RelationType> getRelationType() {
        return this.relationType;
    }

    public final String getSelectAll() {
        return this.selectAll;
    }

    public final String getSelectedCovs() {
        return this.selectedCovs;
    }

    public final String getSwdfName() {
        return this.swdfName;
    }

    public final String getSwdlName() {
        return this.swdlName;
    }

    public final String getSwdmName() {
        return this.swdmName;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.PresVillageOrTown.hashCode() * 31) + this.aadhaarNumber.hashCode()) * 31) + this.age.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.checkCovs.hashCode()) * 31) + this.countryOfBirth.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.drivingSchoolDet.hashCode()) * 31;
        boolean z10 = this.editAddressLL;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int hashCode2 = (((((((((((((((((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + this.eduQual.hashCode()) * 31) + this.email.hashCode()) * 31) + this.fname.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.idMarks1.hashCode()) * 31) + this.idMarks2.hashCode()) * 31) + this.llFromRTO1.hashCode()) * 31) + this.llFromState1.hashCode()) * 31) + this.llstoDisplayMap.hashCode()) * 31) + this.lname.hashCode()) * 31) + this.mname.hashCode()) * 31) + this.mobileNumber.hashCode()) * 31) + this.newFullName.hashCode()) * 31;
        boolean z12 = this.onlyEditAddressLL;
        if (!z12) {
            z11 = z12;
        }
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode2 + (z11 ? 1 : 0)) * 31) + this.permCity.hashCode()) * 31) + this.permDistrict.hashCode()) * 31) + this.permHouseNo.hashCode()) * 31) + this.permLocation.hashCode()) * 31) + this.permPinCode.hashCode()) * 31) + this.permState.hashCode()) * 31) + this.permStreet.hashCode()) * 31) + this.permSubDistrict.hashCode()) * 31) + this.permVillageOrTown.hashCode()) * 31) + this.presCity.hashCode()) * 31) + this.presDistrict.hashCode()) * 31) + this.presHouseNo.hashCode()) * 31) + this.presLocation.hashCode()) * 31) + this.presPinCode.hashCode()) * 31) + this.presSameAsPerm.hashCode()) * 31) + this.presState.hashCode()) * 31) + this.presStayMonths.hashCode()) * 31) + this.presStayYears.hashCode()) * 31) + this.presStreet.hashCode()) * 31) + this.presSubDistrict.hashCode()) * 31) + this.refStateEqiCovsMessage.hashCode()) * 31) + this.relationType.hashCode()) * 31) + this.selectAll.hashCode()) * 31) + this.selectedCovs.hashCode()) * 31) + this.swdfName.hashCode()) * 31) + this.swdlName.hashCode()) * 31) + this.swdmName.hashCode();
    }

    public String toString() {
        return "LLDetail(PresVillageOrTown=" + this.PresVillageOrTown + ", aadhaarNumber=" + this.aadhaarNumber + ", age=" + this.age + ", bloodGroup=" + this.bloodGroup + ", checkCovs=" + this.checkCovs + ", countryOfBirth=" + this.countryOfBirth + ", dateOfBirth=" + this.dateOfBirth + ", drivingSchoolDet=" + this.drivingSchoolDet + ", editAddressLL=" + this.editAddressLL + ", eduQual=" + this.eduQual + ", email=" + this.email + ", fname=" + this.fname + ", gender=" + this.gender + ", idMarks1=" + this.idMarks1 + ", idMarks2=" + this.idMarks2 + ", llFromRTO1=" + this.llFromRTO1 + ", llFromState1=" + this.llFromState1 + ", llstoDisplayMap=" + this.llstoDisplayMap + ", lname=" + this.lname + ", mname=" + this.mname + ", mobileNumber=" + this.mobileNumber + ", newFullName=" + this.newFullName + ", onlyEditAddressLL=" + this.onlyEditAddressLL + ", permCity=" + this.permCity + ", permDistrict=" + this.permDistrict + ", permHouseNo=" + this.permHouseNo + ", permLocation=" + this.permLocation + ", permPinCode=" + this.permPinCode + ", permState=" + this.permState + ", permStreet=" + this.permStreet + ", permSubDistrict=" + this.permSubDistrict + ", permVillageOrTown=" + this.permVillageOrTown + ", presCity=" + this.presCity + ", presDistrict=" + this.presDistrict + ", presHouseNo=" + this.presHouseNo + ", presLocation=" + this.presLocation + ", presPinCode=" + this.presPinCode + ", presSameAsPerm=" + this.presSameAsPerm + ", presState=" + this.presState + ", presStayMonths=" + this.presStayMonths + ", presStayYears=" + this.presStayYears + ", presStreet=" + this.presStreet + ", presSubDistrict=" + this.presSubDistrict + ", refStateEqiCovsMessage=" + this.refStateEqiCovsMessage + ", relationType=" + this.relationType + ", selectAll=" + this.selectAll + ", selectedCovs=" + this.selectedCovs + ", swdfName=" + this.swdfName + ", swdlName=" + this.swdlName + ", swdmName=" + this.swdmName + ')';
    }
}
