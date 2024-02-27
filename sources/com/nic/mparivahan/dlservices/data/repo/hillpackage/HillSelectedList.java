package com.nic.mparivahan.dlservices.data.repo.hillpackage;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class HillSelectedList {
    @c("524")
    private String jsonMember513;

    public HillSelectedList() {
        this((String) null, 1, (g) null);
    }

    public static /* synthetic */ HillSelectedList copy$default(HillSelectedList hillSelectedList, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hillSelectedList.jsonMember513;
        }
        return hillSelectedList.copy(str);
    }

    public final String component1() {
        return this.jsonMember513;
    }

    public final HillSelectedList copy(String str) {
        return new HillSelectedList(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HillSelectedList) && l.a(this.jsonMember513, ((HillSelectedList) obj).jsonMember513);
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
        return "HillSelectedList(jsonMember513=" + this.jsonMember513 + ')';
    }

    public HillSelectedList(String str) {
        this.jsonMember513 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HillSelectedList(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
