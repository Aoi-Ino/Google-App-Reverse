package com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class ApplicantAddress implements Serializable {
    private final String biomobileno;
    private final String biotemp1;
    private final String biotemp2;
    private final String biotempdistNa;
    private final String biotemppin;
    private final String biotempstNa;
    private final String swdFullName;

    public ApplicantAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        l.f(str, "biomobileno");
        l.f(str2, "biotemp1");
        l.f(str3, "biotemp2");
        l.f(str4, "biotempdistNa");
        l.f(str5, "biotemppin");
        l.f(str6, "biotempstNa");
        l.f(str7, "swdFullName");
        this.biomobileno = str;
        this.biotemp1 = str2;
        this.biotemp2 = str3;
        this.biotempdistNa = str4;
        this.biotemppin = str5;
        this.biotempstNa = str6;
        this.swdFullName = str7;
    }

    public static /* synthetic */ ApplicantAddress copy$default(ApplicantAddress applicantAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = applicantAddress.biomobileno;
        }
        if ((i10 & 2) != 0) {
            str2 = applicantAddress.biotemp1;
        }
        String str8 = str2;
        if ((i10 & 4) != 0) {
            str3 = applicantAddress.biotemp2;
        }
        String str9 = str3;
        if ((i10 & 8) != 0) {
            str4 = applicantAddress.biotempdistNa;
        }
        String str10 = str4;
        if ((i10 & 16) != 0) {
            str5 = applicantAddress.biotemppin;
        }
        String str11 = str5;
        if ((i10 & 32) != 0) {
            str6 = applicantAddress.biotempstNa;
        }
        String str12 = str6;
        if ((i10 & 64) != 0) {
            str7 = applicantAddress.swdFullName;
        }
        return applicantAddress.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.biomobileno;
    }

    public final String component2() {
        return this.biotemp1;
    }

    public final String component3() {
        return this.biotemp2;
    }

    public final String component4() {
        return this.biotempdistNa;
    }

    public final String component5() {
        return this.biotemppin;
    }

    public final String component6() {
        return this.biotempstNa;
    }

    public final String component7() {
        return this.swdFullName;
    }

    public final ApplicantAddress copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        l.f(str, "biomobileno");
        l.f(str2, "biotemp1");
        l.f(str3, "biotemp2");
        l.f(str4, "biotempdistNa");
        l.f(str5, "biotemppin");
        l.f(str6, "biotempstNa");
        String str8 = str7;
        l.f(str8, "swdFullName");
        return new ApplicantAddress(str, str2, str3, str4, str5, str6, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicantAddress)) {
            return false;
        }
        ApplicantAddress applicantAddress = (ApplicantAddress) obj;
        return l.a(this.biomobileno, applicantAddress.biomobileno) && l.a(this.biotemp1, applicantAddress.biotemp1) && l.a(this.biotemp2, applicantAddress.biotemp2) && l.a(this.biotempdistNa, applicantAddress.biotempdistNa) && l.a(this.biotemppin, applicantAddress.biotemppin) && l.a(this.biotempstNa, applicantAddress.biotempstNa) && l.a(this.swdFullName, applicantAddress.swdFullName);
    }

    public final String getBiomobileno() {
        return this.biomobileno;
    }

    public final String getBiotemp1() {
        return this.biotemp1;
    }

    public final String getBiotemp2() {
        return this.biotemp2;
    }

    public final String getBiotempdistNa() {
        return this.biotempdistNa;
    }

    public final String getBiotemppin() {
        return this.biotemppin;
    }

    public final String getBiotempstNa() {
        return this.biotempstNa;
    }

    public final String getSwdFullName() {
        return this.swdFullName;
    }

    public int hashCode() {
        return (((((((((((this.biomobileno.hashCode() * 31) + this.biotemp1.hashCode()) * 31) + this.biotemp2.hashCode()) * 31) + this.biotempdistNa.hashCode()) * 31) + this.biotemppin.hashCode()) * 31) + this.biotempstNa.hashCode()) * 31) + this.swdFullName.hashCode();
    }

    public String toString() {
        return "ApplicantAddress(biomobileno=" + this.biomobileno + ", biotemp1=" + this.biotemp1 + ", biotemp2=" + this.biotemp2 + ", biotempdistNa=" + this.biotempdistNa + ", biotemppin=" + this.biotemppin + ", biotempstNa=" + this.biotempstNa + ", swdFullName=" + this.swdFullName + ')';
    }
}
