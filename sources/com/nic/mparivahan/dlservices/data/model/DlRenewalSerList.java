package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class DlRenewalSerList {
    @c("514")
    private String jsonMember514;

    public DlRenewalSerList() {
        this((String) null, 1, (g) null);
    }

    public static /* synthetic */ DlRenewalSerList copy$default(DlRenewalSerList dlRenewalSerList, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlRenewalSerList.jsonMember514;
        }
        return dlRenewalSerList.copy(str);
    }

    public final String component1() {
        return this.jsonMember514;
    }

    public final DlRenewalSerList copy(String str) {
        return new DlRenewalSerList(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DlRenewalSerList) && l.a(this.jsonMember514, ((DlRenewalSerList) obj).jsonMember514);
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

    public final void setJsonMember514(String str) {
        this.jsonMember514 = str;
    }

    public String toString() {
        return "DlRenewalSerList(jsonMember514=" + this.jsonMember514 + ')';
    }

    public DlRenewalSerList(String str) {
        this.jsonMember514 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlRenewalSerList(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
