package com.nic.mparivahan.ClServices.Pojo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ClServiceAckknowledgement {
    private final String applicationDate;
    private final String applicationNo;
    private final String dateofBirth;
    private final String fatherName;
    private final String name;

    public ClServiceAckknowledgement(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "applicationDate");
        l.f(str2, "applicationNo");
        l.f(str3, "dateofBirth");
        l.f(str4, "fatherName");
        l.f(str5, "name");
        this.applicationDate = str;
        this.applicationNo = str2;
        this.dateofBirth = str3;
        this.fatherName = str4;
        this.name = str5;
    }

    public static /* synthetic */ ClServiceAckknowledgement copy$default(ClServiceAckknowledgement clServiceAckknowledgement, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = clServiceAckknowledgement.applicationDate;
        }
        if ((i10 & 2) != 0) {
            str2 = clServiceAckknowledgement.applicationNo;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = clServiceAckknowledgement.dateofBirth;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = clServiceAckknowledgement.fatherName;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = clServiceAckknowledgement.name;
        }
        return clServiceAckknowledgement.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.applicationDate;
    }

    public final String component2() {
        return this.applicationNo;
    }

    public final String component3() {
        return this.dateofBirth;
    }

    public final String component4() {
        return this.fatherName;
    }

    public final String component5() {
        return this.name;
    }

    public final ClServiceAckknowledgement copy(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "applicationDate");
        l.f(str2, "applicationNo");
        l.f(str3, "dateofBirth");
        l.f(str4, "fatherName");
        l.f(str5, "name");
        return new ClServiceAckknowledgement(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClServiceAckknowledgement)) {
            return false;
        }
        ClServiceAckknowledgement clServiceAckknowledgement = (ClServiceAckknowledgement) obj;
        return l.a(this.applicationDate, clServiceAckknowledgement.applicationDate) && l.a(this.applicationNo, clServiceAckknowledgement.applicationNo) && l.a(this.dateofBirth, clServiceAckknowledgement.dateofBirth) && l.a(this.fatherName, clServiceAckknowledgement.fatherName) && l.a(this.name, clServiceAckknowledgement.name);
    }

    public final String getApplicationDate() {
        return this.applicationDate;
    }

    public final String getApplicationNo() {
        return this.applicationNo;
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
        return (((((((this.applicationDate.hashCode() * 31) + this.applicationNo.hashCode()) * 31) + this.dateofBirth.hashCode()) * 31) + this.fatherName.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "ClServiceAckknowledgement(applicationDate=" + this.applicationDate + ", applicationNo=" + this.applicationNo + ", dateofBirth=" + this.dateofBirth + ", fatherName=" + this.fatherName + ", name=" + this.name + ')';
    }
}
