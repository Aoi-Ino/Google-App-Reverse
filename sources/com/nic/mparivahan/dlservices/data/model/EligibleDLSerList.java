package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class EligibleDLSerList {
    @c("514")
    private final String jsonMember514;

    public EligibleDLSerList() {
        this((String) null, 1, (g) null);
    }

    public static /* synthetic */ EligibleDLSerList copy$default(EligibleDLSerList eligibleDLSerList, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eligibleDLSerList.jsonMember514;
        }
        return eligibleDLSerList.copy(str);
    }

    public final String component1() {
        return this.jsonMember514;
    }

    public final EligibleDLSerList copy(String str) {
        return new EligibleDLSerList(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EligibleDLSerList) && l.a(this.jsonMember514, ((EligibleDLSerList) obj).jsonMember514);
    }

    public final String getJsonMember514() {
        return this.jsonMember514;
    }

    public int hashCode() {
        String str = this.jsonMember514;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "EligibleDLSerList(jsonMember514=" + this.jsonMember514 + ')';
    }

    public EligibleDLSerList(String str) {
        this.jsonMember514 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EligibleDLSerList(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
