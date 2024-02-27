package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class CountryOfBirth implements Serializable {
    private final String countryOfBirthCode;
    private final String countryOfBirthName;

    public CountryOfBirth(String str, String str2) {
        l.f(str, "countryOfBirthCode");
        l.f(str2, "countryOfBirthName");
        this.countryOfBirthCode = str;
        this.countryOfBirthName = str2;
    }

    public static /* synthetic */ CountryOfBirth copy$default(CountryOfBirth countryOfBirth, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = countryOfBirth.countryOfBirthCode;
        }
        if ((i10 & 2) != 0) {
            str2 = countryOfBirth.countryOfBirthName;
        }
        return countryOfBirth.copy(str, str2);
    }

    public final String component1() {
        return this.countryOfBirthCode;
    }

    public final String component2() {
        return this.countryOfBirthName;
    }

    public final CountryOfBirth copy(String str, String str2) {
        l.f(str, "countryOfBirthCode");
        l.f(str2, "countryOfBirthName");
        return new CountryOfBirth(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryOfBirth)) {
            return false;
        }
        CountryOfBirth countryOfBirth = (CountryOfBirth) obj;
        return l.a(this.countryOfBirthCode, countryOfBirth.countryOfBirthCode) && l.a(this.countryOfBirthName, countryOfBirth.countryOfBirthName);
    }

    public final String getCountryOfBirthCode() {
        return this.countryOfBirthCode;
    }

    public final String getCountryOfBirthName() {
        return this.countryOfBirthName;
    }

    public int hashCode() {
        return (this.countryOfBirthCode.hashCode() * 31) + this.countryOfBirthName.hashCode();
    }

    public String toString() {
        return "CountryOfBirth(countryOfBirthCode=" + this.countryOfBirthCode + ", countryOfBirthName=" + this.countryOfBirthName + ')';
    }
}
