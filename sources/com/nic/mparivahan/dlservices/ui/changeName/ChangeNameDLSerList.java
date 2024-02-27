package com.nic.mparivahan.dlservices.ui.changeName;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ChangeNameDLSerList {
    @c("526")
    private String jsonMember526;

    public ChangeNameDLSerList() {
        this((String) null, 1, (g) null);
    }

    public static /* synthetic */ ChangeNameDLSerList copy$default(ChangeNameDLSerList changeNameDLSerList, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = changeNameDLSerList.jsonMember526;
        }
        return changeNameDLSerList.copy(str);
    }

    public final String component1() {
        return this.jsonMember526;
    }

    public final ChangeNameDLSerList copy(String str) {
        return new ChangeNameDLSerList(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChangeNameDLSerList) && l.a(this.jsonMember526, ((ChangeNameDLSerList) obj).jsonMember526);
    }

    public final String getJsonMember526() {
        return this.jsonMember526;
    }

    public int hashCode() {
        String str = this.jsonMember526;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setJsonMember526(String str) {
        this.jsonMember526 = str;
    }

    public String toString() {
        return "ChangeNameDLSerList(jsonMember526=" + this.jsonMember526 + ')';
    }

    public ChangeNameDLSerList(String str) {
        this.jsonMember526 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChangeNameDLSerList(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
