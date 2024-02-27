package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class CountryMasterResponseModal {
    @c("country_code")
    private final String countryCode;
    @c("country_name")
    private final String countryName;

    public CountryMasterResponseModal() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ CountryMasterResponseModal copy$default(CountryMasterResponseModal countryMasterResponseModal, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = countryMasterResponseModal.countryName;
        }
        if ((i10 & 2) != 0) {
            str2 = countryMasterResponseModal.countryCode;
        }
        return countryMasterResponseModal.copy(str, str2);
    }

    public final String component1() {
        return this.countryName;
    }

    public final String component2() {
        return this.countryCode;
    }

    public final CountryMasterResponseModal copy(String str, String str2) {
        l.f(str, "countryName");
        l.f(str2, "countryCode");
        return new CountryMasterResponseModal(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryMasterResponseModal)) {
            return false;
        }
        CountryMasterResponseModal countryMasterResponseModal = (CountryMasterResponseModal) obj;
        return l.a(this.countryName, countryMasterResponseModal.countryName) && l.a(this.countryCode, countryMasterResponseModal.countryCode);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public int hashCode() {
        return (this.countryName.hashCode() * 31) + this.countryCode.hashCode();
    }

    public String toString() {
        return "CountryMasterResponseModal(countryName=" + this.countryName + ", countryCode=" + this.countryCode + ')';
    }

    public CountryMasterResponseModal(String str, String str2) {
        l.f(str, "countryName");
        l.f(str2, "countryCode");
        this.countryName = str;
        this.countryCode = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CountryMasterResponseModal(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
