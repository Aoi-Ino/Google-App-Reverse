package com.nic.mparivahan.ClServices.Pojo.NewClPojo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class NewCLAcknowledgement {
    private final String applicantGender;
    private final String applicationDate;
    private final String applicationNo;
    private final String bloodGroup;
    private final String dateofBirth;
    private final String fatherName;
    private final String name;

    public NewCLAcknowledgement(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        l.f(str, "applicantGender");
        l.f(str2, "applicationDate");
        l.f(str3, "applicationNo");
        l.f(str4, "bloodGroup");
        l.f(str5, "dateofBirth");
        l.f(str6, "fatherName");
        l.f(str7, "name");
        this.applicantGender = str;
        this.applicationDate = str2;
        this.applicationNo = str3;
        this.bloodGroup = str4;
        this.dateofBirth = str5;
        this.fatherName = str6;
        this.name = str7;
    }

    public static /* synthetic */ NewCLAcknowledgement copy$default(NewCLAcknowledgement newCLAcknowledgement, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = newCLAcknowledgement.applicantGender;
        }
        if ((i10 & 2) != 0) {
            str2 = newCLAcknowledgement.applicationDate;
        }
        String str8 = str2;
        if ((i10 & 4) != 0) {
            str3 = newCLAcknowledgement.applicationNo;
        }
        String str9 = str3;
        if ((i10 & 8) != 0) {
            str4 = newCLAcknowledgement.bloodGroup;
        }
        String str10 = str4;
        if ((i10 & 16) != 0) {
            str5 = newCLAcknowledgement.dateofBirth;
        }
        String str11 = str5;
        if ((i10 & 32) != 0) {
            str6 = newCLAcknowledgement.fatherName;
        }
        String str12 = str6;
        if ((i10 & 64) != 0) {
            str7 = newCLAcknowledgement.name;
        }
        return newCLAcknowledgement.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.applicantGender;
    }

    public final String component2() {
        return this.applicationDate;
    }

    public final String component3() {
        return this.applicationNo;
    }

    public final String component4() {
        return this.bloodGroup;
    }

    public final String component5() {
        return this.dateofBirth;
    }

    public final String component6() {
        return this.fatherName;
    }

    public final String component7() {
        return this.name;
    }

    public final NewCLAcknowledgement copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        l.f(str, "applicantGender");
        l.f(str2, "applicationDate");
        l.f(str3, "applicationNo");
        l.f(str4, "bloodGroup");
        l.f(str5, "dateofBirth");
        l.f(str6, "fatherName");
        String str8 = str7;
        l.f(str8, "name");
        return new NewCLAcknowledgement(str, str2, str3, str4, str5, str6, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewCLAcknowledgement)) {
            return false;
        }
        NewCLAcknowledgement newCLAcknowledgement = (NewCLAcknowledgement) obj;
        return l.a(this.applicantGender, newCLAcknowledgement.applicantGender) && l.a(this.applicationDate, newCLAcknowledgement.applicationDate) && l.a(this.applicationNo, newCLAcknowledgement.applicationNo) && l.a(this.bloodGroup, newCLAcknowledgement.bloodGroup) && l.a(this.dateofBirth, newCLAcknowledgement.dateofBirth) && l.a(this.fatherName, newCLAcknowledgement.fatherName) && l.a(this.name, newCLAcknowledgement.name);
    }

    public final String getApplicantGender() {
        return this.applicantGender;
    }

    public final String getApplicationDate() {
        return this.applicationDate;
    }

    public final String getApplicationNo() {
        return this.applicationNo;
    }

    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    public final String getDateofBirth() {
        return this.dateofBirth;
    }

    public final String getFatherName() {
        return this.fatherName;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((((((this.applicantGender.hashCode() * 31) + this.applicationDate.hashCode()) * 31) + this.applicationNo.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.dateofBirth.hashCode()) * 31) + this.fatherName.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "NewCLAcknowledgement(applicantGender=" + this.applicantGender + ", applicationDate=" + this.applicationDate + ", applicationNo=" + this.applicationNo + ", bloodGroup=" + this.bloodGroup + ", dateofBirth=" + this.dateofBirth + ", fatherName=" + this.fatherName + ", name=" + this.name + ')';
    }
}
