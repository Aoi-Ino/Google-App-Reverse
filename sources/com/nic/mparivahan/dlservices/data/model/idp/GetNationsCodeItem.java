package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class GetNationsCodeItem {
    @c("NatIdpIssuable")
    private final String natIdpIssuable;
    @c("NationCode")
    private final String nationCode;
    @c("NationName")
    private final String nationName;

    public GetNationsCodeItem() {
        this((String) null, (String) null, (String) null, 7, (g) null);
    }

    public static /* synthetic */ GetNationsCodeItem copy$default(GetNationsCodeItem getNationsCodeItem, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getNationsCodeItem.nationName;
        }
        if ((i10 & 2) != 0) {
            str2 = getNationsCodeItem.nationCode;
        }
        if ((i10 & 4) != 0) {
            str3 = getNationsCodeItem.natIdpIssuable;
        }
        return getNationsCodeItem.copy(str, str2, str3);
    }

    public final String component1() {
        return this.nationName;
    }

    public final String component2() {
        return this.nationCode;
    }

    public final String component3() {
        return this.natIdpIssuable;
    }

    public final GetNationsCodeItem copy(String str, String str2, String str3) {
        return new GetNationsCodeItem(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetNationsCodeItem)) {
            return false;
        }
        GetNationsCodeItem getNationsCodeItem = (GetNationsCodeItem) obj;
        return l.a(this.nationName, getNationsCodeItem.nationName) && l.a(this.nationCode, getNationsCodeItem.nationCode) && l.a(this.natIdpIssuable, getNationsCodeItem.natIdpIssuable);
    }

    public final String getNatIdpIssuable() {
        return this.natIdpIssuable;
    }

    public final String getNationCode() {
        return this.nationCode;
    }

    public final String getNationName() {
        return this.nationName;
    }

    public int hashCode() {
        String str = this.nationName;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nationCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.natIdpIssuable;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "GetNationsCodeItem(nationName=" + this.nationName + ", nationCode=" + this.nationCode + ", natIdpIssuable=" + this.natIdpIssuable + ')';
    }

    public GetNationsCodeItem(String str, String str2, String str3) {
        this.nationName = str;
        this.nationCode = str2;
        this.natIdpIssuable = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetNationsCodeItem(String str, String str2, String str3, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
