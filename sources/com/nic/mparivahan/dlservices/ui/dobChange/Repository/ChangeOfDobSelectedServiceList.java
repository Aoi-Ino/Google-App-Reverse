package com.nic.mparivahan.dlservices.ui.dobChange.Repository;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ChangeOfDobSelectedServiceList {
    @c("548")
    private String jsonMember513;

    public ChangeOfDobSelectedServiceList() {
        this((String) null, 1, (g) null);
    }

    public static /* synthetic */ ChangeOfDobSelectedServiceList copy$default(ChangeOfDobSelectedServiceList changeOfDobSelectedServiceList, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = changeOfDobSelectedServiceList.jsonMember513;
        }
        return changeOfDobSelectedServiceList.copy(str);
    }

    public final String component1() {
        return this.jsonMember513;
    }

    public final ChangeOfDobSelectedServiceList copy(String str) {
        return new ChangeOfDobSelectedServiceList(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChangeOfDobSelectedServiceList) && l.a(this.jsonMember513, ((ChangeOfDobSelectedServiceList) obj).jsonMember513);
    }

    public final String getJsonMember513() {
        return this.jsonMember513;
    }

    public int hashCode() {
        String str = this.jsonMember513;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setJsonMember513(String str) {
        this.jsonMember513 = str;
    }

    public String toString() {
        return "ChangeOfDobSelectedServiceList(jsonMember513=" + this.jsonMember513 + ')';
    }

    public ChangeOfDobSelectedServiceList(String str) {
        this.jsonMember513 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChangeOfDobSelectedServiceList(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
