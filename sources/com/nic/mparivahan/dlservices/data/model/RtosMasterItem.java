package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class RtosMasterItem {
    @c("rto_code")
    private final String rtoCode;
    @c("rto_name")
    private final String rtoName;

    public RtosMasterItem() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ RtosMasterItem copy$default(RtosMasterItem rtosMasterItem, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rtosMasterItem.rtoCode;
        }
        if ((i10 & 2) != 0) {
            str2 = rtosMasterItem.rtoName;
        }
        return rtosMasterItem.copy(str, str2);
    }

    public final String component1() {
        return this.rtoCode;
    }

    public final String component2() {
        return this.rtoName;
    }

    public final RtosMasterItem copy(String str, String str2) {
        return new RtosMasterItem(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtosMasterItem)) {
            return false;
        }
        RtosMasterItem rtosMasterItem = (RtosMasterItem) obj;
        return l.a(this.rtoCode, rtosMasterItem.rtoCode) && l.a(this.rtoName, rtosMasterItem.rtoName);
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final String getRtoName() {
        return this.rtoName;
    }

    public int hashCode() {
        String str = this.rtoCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rtoName;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "RtosMasterItem(rtoCode=" + this.rtoCode + ", rtoName=" + this.rtoName + ')';
    }

    public RtosMasterItem(String str, String str2) {
        this.rtoCode = str;
        this.rtoName = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RtosMasterItem(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
