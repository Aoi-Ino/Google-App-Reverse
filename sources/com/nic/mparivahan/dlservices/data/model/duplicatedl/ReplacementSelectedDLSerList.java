package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ReplacementSelectedDLSerList {
    @c("516")
    private String jsonMember516;

    public ReplacementSelectedDLSerList() {
        this((String) null, 1, (g) null);
    }

    public static /* synthetic */ ReplacementSelectedDLSerList copy$default(ReplacementSelectedDLSerList replacementSelectedDLSerList, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = replacementSelectedDLSerList.jsonMember516;
        }
        return replacementSelectedDLSerList.copy(str);
    }

    public final String component1() {
        return this.jsonMember516;
    }

    public final ReplacementSelectedDLSerList copy(String str) {
        return new ReplacementSelectedDLSerList(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReplacementSelectedDLSerList) && l.a(this.jsonMember516, ((ReplacementSelectedDLSerList) obj).jsonMember516);
    }

    public final String getJsonMember516() {
        return this.jsonMember516;
    }

    public int hashCode() {
        String str = this.jsonMember516;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setJsonMember516(String str) {
        this.jsonMember516 = str;
    }

    public String toString() {
        return "ReplacementSelectedDLSerList(jsonMember516=" + this.jsonMember516 + ')';
    }

    public ReplacementSelectedDLSerList(String str) {
        this.jsonMember516 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReplacementSelectedDLSerList(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
