package com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class FetchLlDetails implements Serializable {
    private final ApplicantAddress ApplicantAddress;
    private String DateOfBirth;
    private final String FullName;
    private final List<LLDetail> LLDetails;
    private final String MobileNumber;
    private final RTO RTO;
    private final State State;
    private final String bloodgroup;
    private final List<Covobj> covobj;
    private final String dateOfIssue;
    private final String gender;
    private final String learningLicence;
    private final String photo;
    private final String rel;
    private final String signature;

    public FetchLlDetails(ApplicantAddress applicantAddress, String str, String str2, List<LLDetail> list, String str3, RTO rto, State state, String str4, List<Covobj> list2, String str5, String str6, String str7, String str8, String str9, String str10) {
        ApplicantAddress applicantAddress2 = applicantAddress;
        String str11 = str;
        String str12 = str2;
        List<LLDetail> list3 = list;
        String str13 = str3;
        RTO rto2 = rto;
        State state2 = state;
        String str14 = str4;
        List<Covobj> list4 = list2;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        l.f(applicantAddress2, "ApplicantAddress");
        l.f(str11, "DateOfBirth");
        l.f(str12, "FullName");
        l.f(list3, "LLDetails");
        l.f(str13, "MobileNumber");
        l.f(rto2, "RTO");
        l.f(state2, "State");
        l.f(str14, "bloodgroup");
        l.f(list4, "covobj");
        l.f(str15, "dateOfIssue");
        l.f(str16, "gender");
        l.f(str17, "learningLicence");
        l.f(str18, "photo");
        l.f(str19, "rel");
        l.f(str20, "signature");
        this.ApplicantAddress = applicantAddress2;
        this.DateOfBirth = str11;
        this.FullName = str12;
        this.LLDetails = list3;
        this.MobileNumber = str13;
        this.RTO = rto2;
        this.State = state2;
        this.bloodgroup = str14;
        this.covobj = list4;
        this.dateOfIssue = str15;
        this.gender = str16;
        this.learningLicence = str17;
        this.photo = str18;
        this.rel = str19;
        this.signature = str20;
    }

    public static /* synthetic */ FetchLlDetails copy$default(FetchLlDetails fetchLlDetails, ApplicantAddress applicantAddress, String str, String str2, List list, String str3, RTO rto, State state, String str4, List list2, String str5, String str6, String str7, String str8, String str9, String str10, int i10, Object obj) {
        FetchLlDetails fetchLlDetails2 = fetchLlDetails;
        int i11 = i10;
        return fetchLlDetails.copy((i11 & 1) != 0 ? fetchLlDetails2.ApplicantAddress : applicantAddress, (i11 & 2) != 0 ? fetchLlDetails2.DateOfBirth : str, (i11 & 4) != 0 ? fetchLlDetails2.FullName : str2, (i11 & 8) != 0 ? fetchLlDetails2.LLDetails : list, (i11 & 16) != 0 ? fetchLlDetails2.MobileNumber : str3, (i11 & 32) != 0 ? fetchLlDetails2.RTO : rto, (i11 & 64) != 0 ? fetchLlDetails2.State : state, (i11 & 128) != 0 ? fetchLlDetails2.bloodgroup : str4, (i11 & 256) != 0 ? fetchLlDetails2.covobj : list2, (i11 & 512) != 0 ? fetchLlDetails2.dateOfIssue : str5, (i11 & 1024) != 0 ? fetchLlDetails2.gender : str6, (i11 & 2048) != 0 ? fetchLlDetails2.learningLicence : str7, (i11 & 4096) != 0 ? fetchLlDetails2.photo : str8, (i11 & 8192) != 0 ? fetchLlDetails2.rel : str9, (i11 & 16384) != 0 ? fetchLlDetails2.signature : str10);
    }

    public final ApplicantAddress component1() {
        return this.ApplicantAddress;
    }

    public final String component10() {
        return this.dateOfIssue;
    }

    public final String component11() {
        return this.gender;
    }

    public final String component12() {
        return this.learningLicence;
    }

    public final String component13() {
        return this.photo;
    }

    public final String component14() {
        return this.rel;
    }

    public final String component15() {
        return this.signature;
    }

    public final String component2() {
        return this.DateOfBirth;
    }

    public final String component3() {
        return this.FullName;
    }

    public final List<LLDetail> component4() {
        return this.LLDetails;
    }

    public final String component5() {
        return this.MobileNumber;
    }

    public final RTO component6() {
        return this.RTO;
    }

    public final State component7() {
        return this.State;
    }

    public final String component8() {
        return this.bloodgroup;
    }

    public final List<Covobj> component9() {
        return this.covobj;
    }

    public final FetchLlDetails copy(ApplicantAddress applicantAddress, String str, String str2, List<LLDetail> list, String str3, RTO rto, State state, String str4, List<Covobj> list2, String str5, String str6, String str7, String str8, String str9, String str10) {
        ApplicantAddress applicantAddress2 = applicantAddress;
        l.f(applicantAddress2, "ApplicantAddress");
        String str11 = str;
        l.f(str11, "DateOfBirth");
        String str12 = str2;
        l.f(str12, "FullName");
        List<LLDetail> list3 = list;
        l.f(list3, "LLDetails");
        String str13 = str3;
        l.f(str13, "MobileNumber");
        RTO rto2 = rto;
        l.f(rto2, "RTO");
        State state2 = state;
        l.f(state2, "State");
        String str14 = str4;
        l.f(str14, "bloodgroup");
        List<Covobj> list4 = list2;
        l.f(list4, "covobj");
        String str15 = str5;
        l.f(str15, "dateOfIssue");
        String str16 = str6;
        l.f(str16, "gender");
        String str17 = str7;
        l.f(str17, "learningLicence");
        String str18 = str8;
        l.f(str18, "photo");
        String str19 = str9;
        l.f(str19, "rel");
        l.f(str10, "signature");
        return new FetchLlDetails(applicantAddress2, str11, str12, list3, str13, rto2, state2, str14, list4, str15, str16, str17, str18, str19, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchLlDetails)) {
            return false;
        }
        FetchLlDetails fetchLlDetails = (FetchLlDetails) obj;
        return l.a(this.ApplicantAddress, fetchLlDetails.ApplicantAddress) && l.a(this.DateOfBirth, fetchLlDetails.DateOfBirth) && l.a(this.FullName, fetchLlDetails.FullName) && l.a(this.LLDetails, fetchLlDetails.LLDetails) && l.a(this.MobileNumber, fetchLlDetails.MobileNumber) && l.a(this.RTO, fetchLlDetails.RTO) && l.a(this.State, fetchLlDetails.State) && l.a(this.bloodgroup, fetchLlDetails.bloodgroup) && l.a(this.covobj, fetchLlDetails.covobj) && l.a(this.dateOfIssue, fetchLlDetails.dateOfIssue) && l.a(this.gender, fetchLlDetails.gender) && l.a(this.learningLicence, fetchLlDetails.learningLicence) && l.a(this.photo, fetchLlDetails.photo) && l.a(this.rel, fetchLlDetails.rel) && l.a(this.signature, fetchLlDetails.signature);
    }

    public final ApplicantAddress getApplicantAddress() {
        return this.ApplicantAddress;
    }

    public final String getBloodgroup() {
        return this.bloodgroup;
    }

    public final List<Covobj> getCovobj() {
        return this.covobj;
    }

    public final String getDateOfBirth() {
        return this.DateOfBirth;
    }

    public final String getDateOfIssue() {
        return this.dateOfIssue;
    }

    public final String getFullName() {
        return this.FullName;
    }

    public final String getGender() {
        return this.gender;
    }

    public final List<LLDetail> getLLDetails() {
        return this.LLDetails;
    }

    public final String getLearningLicence() {
        return this.learningLicence;
    }

    public final String getMobileNumber() {
        return this.MobileNumber;
    }

    public final String getPhoto() {
        return this.photo;
    }

    public final RTO getRTO() {
        return this.RTO;
    }

    public final String getRel() {
        return this.rel;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final State getState() {
        return this.State;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.ApplicantAddress.hashCode() * 31) + this.DateOfBirth.hashCode()) * 31) + this.FullName.hashCode()) * 31) + this.LLDetails.hashCode()) * 31) + this.MobileNumber.hashCode()) * 31) + this.RTO.hashCode()) * 31) + this.State.hashCode()) * 31) + this.bloodgroup.hashCode()) * 31) + this.covobj.hashCode()) * 31) + this.dateOfIssue.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.learningLicence.hashCode()) * 31) + this.photo.hashCode()) * 31) + this.rel.hashCode()) * 31) + this.signature.hashCode();
    }

    public final void setDateOfBirth(String str) {
        l.f(str, "<set-?>");
        this.DateOfBirth = str;
    }

    public String toString() {
        return "FetchLlDetails(ApplicantAddress=" + this.ApplicantAddress + ", DateOfBirth=" + this.DateOfBirth + ", FullName=" + this.FullName + ", LLDetails=" + this.LLDetails + ", MobileNumber=" + this.MobileNumber + ", RTO=" + this.RTO + ", State=" + this.State + ", bloodgroup=" + this.bloodgroup + ", covobj=" + this.covobj + ", dateOfIssue=" + this.dateOfIssue + ", gender=" + this.gender + ", learningLicence=" + this.learningLicence + ", photo=" + this.photo + ", rel=" + this.rel + ", signature=" + this.signature + ')';
    }
}
