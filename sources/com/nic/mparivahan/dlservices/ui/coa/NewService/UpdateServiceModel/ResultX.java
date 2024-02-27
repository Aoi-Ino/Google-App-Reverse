package com.nic.mparivahan.dlservices.ui.coa.NewService.UpdateServiceModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ResultX {
    private final String NTValidities;
    private final String TRValidities;
    private final String applicantAddress;
    private final String applicantGender;
    private final String applicantname;
    private final String applicationNo;
    private final String barCode;
    private final String bloodGroup;
    private final String dLCOVNames;
    private final String dateofBirth;
    private final String dlno;
    private final String documentaryProofsRequired;
    private final String fatherName;
    private final String isFaceless;
    private final String llReqforRetestMsg;
    private final String note1;
    private final String note2;
    private final String note3;
    private final String note4;
    private final String referenceLink;
    private final String rtoLocation;
    private final ServicesRequested servicesRequested;

    public ResultX(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, ServicesRequested servicesRequested2) {
        String str22 = str;
        String str23 = str2;
        String str24 = str3;
        String str25 = str4;
        String str26 = str5;
        String str27 = str6;
        String str28 = str7;
        String str29 = str8;
        String str30 = str9;
        String str31 = str10;
        String str32 = str11;
        String str33 = str12;
        String str34 = str13;
        String str35 = str14;
        String str36 = str16;
        l.f(str22, "NTValidities");
        l.f(str23, "TRValidities");
        l.f(str24, "applicantAddress");
        l.f(str25, "applicantGender");
        l.f(str26, "applicantname");
        l.f(str27, "applicationNo");
        l.f(str28, "barCode");
        l.f(str29, "bloodGroup");
        l.f(str30, "dLCOVNames");
        l.f(str31, "dateofBirth");
        l.f(str32, "dlno");
        l.f(str33, "documentaryProofsRequired");
        l.f(str34, "fatherName");
        l.f(str35, "isFaceless");
        l.f(str15, "llReqforRetestMsg");
        l.f(str16, "note1");
        l.f(str17, "note2");
        l.f(str18, "note3");
        l.f(str19, "note4");
        l.f(str20, "referenceLink");
        l.f(str21, "rtoLocation");
        l.f(servicesRequested2, "servicesRequested");
        this.NTValidities = str22;
        this.TRValidities = str23;
        this.applicantAddress = str24;
        this.applicantGender = str25;
        this.applicantname = str26;
        this.applicationNo = str27;
        this.barCode = str28;
        this.bloodGroup = str29;
        this.dLCOVNames = str30;
        this.dateofBirth = str31;
        this.dlno = str32;
        this.documentaryProofsRequired = str33;
        this.fatherName = str34;
        this.isFaceless = str35;
        this.llReqforRetestMsg = str15;
        this.note1 = str16;
        this.note2 = str17;
        this.note3 = str18;
        this.note4 = str19;
        this.referenceLink = str20;
        this.rtoLocation = str21;
        this.servicesRequested = servicesRequested2;
    }

    public static /* synthetic */ ResultX copy$default(ResultX resultX, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, ServicesRequested servicesRequested2, int i10, Object obj) {
        ResultX resultX2 = resultX;
        int i11 = i10;
        return resultX.copy((i11 & 1) != 0 ? resultX2.NTValidities : str, (i11 & 2) != 0 ? resultX2.TRValidities : str2, (i11 & 4) != 0 ? resultX2.applicantAddress : str3, (i11 & 8) != 0 ? resultX2.applicantGender : str4, (i11 & 16) != 0 ? resultX2.applicantname : str5, (i11 & 32) != 0 ? resultX2.applicationNo : str6, (i11 & 64) != 0 ? resultX2.barCode : str7, (i11 & 128) != 0 ? resultX2.bloodGroup : str8, (i11 & 256) != 0 ? resultX2.dLCOVNames : str9, (i11 & 512) != 0 ? resultX2.dateofBirth : str10, (i11 & 1024) != 0 ? resultX2.dlno : str11, (i11 & 2048) != 0 ? resultX2.documentaryProofsRequired : str12, (i11 & 4096) != 0 ? resultX2.fatherName : str13, (i11 & 8192) != 0 ? resultX2.isFaceless : str14, (i11 & 16384) != 0 ? resultX2.llReqforRetestMsg : str15, (i11 & 32768) != 0 ? resultX2.note1 : str16, (i11 & 65536) != 0 ? resultX2.note2 : str17, (i11 & 131072) != 0 ? resultX2.note3 : str18, (i11 & 262144) != 0 ? resultX2.note4 : str19, (i11 & 524288) != 0 ? resultX2.referenceLink : str20, (i11 & 1048576) != 0 ? resultX2.rtoLocation : str21, (i11 & 2097152) != 0 ? resultX2.servicesRequested : servicesRequested2);
    }

    public final String component1() {
        return this.NTValidities;
    }

    public final String component10() {
        return this.dateofBirth;
    }

    public final String component11() {
        return this.dlno;
    }

    public final String component12() {
        return this.documentaryProofsRequired;
    }

    public final String component13() {
        return this.fatherName;
    }

    public final String component14() {
        return this.isFaceless;
    }

    public final String component15() {
        return this.llReqforRetestMsg;
    }

    public final String component16() {
        return this.note1;
    }

    public final String component17() {
        return this.note2;
    }

    public final String component18() {
        return this.note3;
    }

    public final String component19() {
        return this.note4;
    }

    public final String component2() {
        return this.TRValidities;
    }

    public final String component20() {
        return this.referenceLink;
    }

    public final String component21() {
        return this.rtoLocation;
    }

    public final ServicesRequested component22() {
        return this.servicesRequested;
    }

    public final String component3() {
        return this.applicantAddress;
    }

    public final String component4() {
        return this.applicantGender;
    }

    public final String component5() {
        return this.applicantname;
    }

    public final String component6() {
        return this.applicationNo;
    }

    public final String component7() {
        return this.barCode;
    }

    public final String component8() {
        return this.bloodGroup;
    }

    public final String component9() {
        return this.dLCOVNames;
    }

    public final ResultX copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, ServicesRequested servicesRequested2) {
        String str22 = str;
        l.f(str22, "NTValidities");
        l.f(str2, "TRValidities");
        l.f(str3, "applicantAddress");
        l.f(str4, "applicantGender");
        l.f(str5, "applicantname");
        l.f(str6, "applicationNo");
        l.f(str7, "barCode");
        l.f(str8, "bloodGroup");
        l.f(str9, "dLCOVNames");
        l.f(str10, "dateofBirth");
        l.f(str11, "dlno");
        l.f(str12, "documentaryProofsRequired");
        l.f(str13, "fatherName");
        l.f(str14, "isFaceless");
        l.f(str15, "llReqforRetestMsg");
        l.f(str16, "note1");
        l.f(str17, "note2");
        l.f(str18, "note3");
        l.f(str19, "note4");
        l.f(str20, "referenceLink");
        l.f(str21, "rtoLocation");
        l.f(servicesRequested2, "servicesRequested");
        return new ResultX(str22, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, servicesRequested2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultX)) {
            return false;
        }
        ResultX resultX = (ResultX) obj;
        return l.a(this.NTValidities, resultX.NTValidities) && l.a(this.TRValidities, resultX.TRValidities) && l.a(this.applicantAddress, resultX.applicantAddress) && l.a(this.applicantGender, resultX.applicantGender) && l.a(this.applicantname, resultX.applicantname) && l.a(this.applicationNo, resultX.applicationNo) && l.a(this.barCode, resultX.barCode) && l.a(this.bloodGroup, resultX.bloodGroup) && l.a(this.dLCOVNames, resultX.dLCOVNames) && l.a(this.dateofBirth, resultX.dateofBirth) && l.a(this.dlno, resultX.dlno) && l.a(this.documentaryProofsRequired, resultX.documentaryProofsRequired) && l.a(this.fatherName, resultX.fatherName) && l.a(this.isFaceless, resultX.isFaceless) && l.a(this.llReqforRetestMsg, resultX.llReqforRetestMsg) && l.a(this.note1, resultX.note1) && l.a(this.note2, resultX.note2) && l.a(this.note3, resultX.note3) && l.a(this.note4, resultX.note4) && l.a(this.referenceLink, resultX.referenceLink) && l.a(this.rtoLocation, resultX.rtoLocation) && l.a(this.servicesRequested, resultX.servicesRequested);
    }

    public final String getApplicantAddress() {
        return this.applicantAddress;
    }

    public final String getApplicantGender() {
        return this.applicantGender;
    }

    public final String getApplicantname() {
        return this.applicantname;
    }

    public final String getApplicationNo() {
        return this.applicationNo;
    }

    public final String getBarCode() {
        return this.barCode;
    }

    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    public final String getDLCOVNames() {
        return this.dLCOVNames;
    }

    public final String getDateofBirth() {
        return this.dateofBirth;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDocumentaryProofsRequired() {
        return this.documentaryProofsRequired;
    }

    public final String getFatherName() {
        return this.fatherName;
    }

    public final String getLlReqforRetestMsg() {
        return this.llReqforRetestMsg;
    }

    public final String getNTValidities() {
        return this.NTValidities;
    }

    public final String getNote1() {
        return this.note1;
    }

    public final String getNote2() {
        return this.note2;
    }

    public final String getNote3() {
        return this.note3;
    }

    public final String getNote4() {
        return this.note4;
    }

    public final String getReferenceLink() {
        return this.referenceLink;
    }

    public final String getRtoLocation() {
        return this.rtoLocation;
    }

    public final ServicesRequested getServicesRequested() {
        return this.servicesRequested;
    }

    public final String getTRValidities() {
        return this.TRValidities;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((this.NTValidities.hashCode() * 31) + this.TRValidities.hashCode()) * 31) + this.applicantAddress.hashCode()) * 31) + this.applicantGender.hashCode()) * 31) + this.applicantname.hashCode()) * 31) + this.applicationNo.hashCode()) * 31) + this.barCode.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.dLCOVNames.hashCode()) * 31) + this.dateofBirth.hashCode()) * 31) + this.dlno.hashCode()) * 31) + this.documentaryProofsRequired.hashCode()) * 31) + this.fatherName.hashCode()) * 31) + this.isFaceless.hashCode()) * 31) + this.llReqforRetestMsg.hashCode()) * 31) + this.note1.hashCode()) * 31) + this.note2.hashCode()) * 31) + this.note3.hashCode()) * 31) + this.note4.hashCode()) * 31) + this.referenceLink.hashCode()) * 31) + this.rtoLocation.hashCode()) * 31) + this.servicesRequested.hashCode();
    }

    public final String isFaceless() {
        return this.isFaceless;
    }

    public String toString() {
        return "ResultX(NTValidities=" + this.NTValidities + ", TRValidities=" + this.TRValidities + ", applicantAddress=" + this.applicantAddress + ", applicantGender=" + this.applicantGender + ", applicantname=" + this.applicantname + ", applicationNo=" + this.applicationNo + ", barCode=" + this.barCode + ", bloodGroup=" + this.bloodGroup + ", dLCOVNames=" + this.dLCOVNames + ", dateofBirth=" + this.dateofBirth + ", dlno=" + this.dlno + ", documentaryProofsRequired=" + this.documentaryProofsRequired + ", fatherName=" + this.fatherName + ", isFaceless=" + this.isFaceless + ", llReqforRetestMsg=" + this.llReqforRetestMsg + ", note1=" + this.note1 + ", note2=" + this.note2 + ", note3=" + this.note3 + ", note4=" + this.note4 + ", referenceLink=" + this.referenceLink + ", rtoLocation=" + this.rtoLocation + ", servicesRequested=" + this.servicesRequested + ')';
    }
}
