package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class DuplicateSelectedDLSerList {
    @c("513")
    private String jsonMember513;

    public DuplicateSelectedDLSerList() {
        this((String) null, 1, (g) null);
    }

    public static /* synthetic */ DuplicateSelectedDLSerList copy$default(DuplicateSelectedDLSerList duplicateSelectedDLSerList, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = duplicateSelectedDLSerList.jsonMember513;
        }
        return duplicateSelectedDLSerList.copy(str);
    }

    public final String component1() {
        return this.jsonMember513;
    }

    public final DuplicateSelectedDLSerList copy(String str) {
        return new DuplicateSelectedDLSerList(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DuplicateSelectedDLSerList) && l.a(this.jsonMember513, ((DuplicateSelectedDLSerList) obj).jsonMember513);
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
        return "DuplicateSelectedDLSerList(jsonMember513=" + this.jsonMember513 + ')';
    }

    public DuplicateSelectedDLSerList(String str) {
        this.jsonMember513 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DuplicateSelectedDLSerList(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
