package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class NationsMasterItem {
    @c("NationCode")
    private final String nationCode;
    @c("Visa-Issble-ToIndia")
    private final String visaIssbleToIndia;

    public NationsMasterItem() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ NationsMasterItem copy$default(NationsMasterItem nationsMasterItem, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = nationsMasterItem.visaIssbleToIndia;
        }
        if ((i10 & 2) != 0) {
            str2 = nationsMasterItem.nationCode;
        }
        return nationsMasterItem.copy(str, str2);
    }

    public final String component1() {
        return this.visaIssbleToIndia;
    }

    public final String component2() {
        return this.nationCode;
    }

    public final NationsMasterItem copy(String str, String str2) {
        return new NationsMasterItem(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NationsMasterItem)) {
            return false;
        }
        NationsMasterItem nationsMasterItem = (NationsMasterItem) obj;
        return l.a(this.visaIssbleToIndia, nationsMasterItem.visaIssbleToIndia) && l.a(this.nationCode, nationsMasterItem.nationCode);
    }

    public final String getNationCode() {
        return this.nationCode;
    }

    public final String getVisaIssbleToIndia() {
        return this.visaIssbleToIndia;
    }

    public int hashCode() {
        String str = this.visaIssbleToIndia;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nationCode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "NationsMasterItem(visaIssbleToIndia=" + this.visaIssbleToIndia + ", nationCode=" + this.nationCode + ')';
    }

    public NationsMasterItem(String str, String str2) {
        this.visaIssbleToIndia = str;
        this.nationCode = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NationsMasterItem(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
