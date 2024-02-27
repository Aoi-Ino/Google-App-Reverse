package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class TalukaMasterItem {
    @c("subDist_code")
    private final String subDistcode;
    @c("subDist_name")
    private final String subDistname;

    public TalukaMasterItem() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ TalukaMasterItem copy$default(TalukaMasterItem talukaMasterItem, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = talukaMasterItem.subDistname;
        }
        if ((i10 & 2) != 0) {
            str2 = talukaMasterItem.subDistcode;
        }
        return talukaMasterItem.copy(str, str2);
    }

    public final String component1() {
        return this.subDistname;
    }

    public final String component2() {
        return this.subDistcode;
    }

    public final TalukaMasterItem copy(String str, String str2) {
        return new TalukaMasterItem(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TalukaMasterItem)) {
            return false;
        }
        TalukaMasterItem talukaMasterItem = (TalukaMasterItem) obj;
        return l.a(this.subDistname, talukaMasterItem.subDistname) && l.a(this.subDistcode, talukaMasterItem.subDistcode);
    }

    public final String getSubDistcode() {
        return this.subDistcode;
    }

    public final String getSubDistname() {
        return this.subDistname;
    }

    public int hashCode() {
        String str = this.subDistname;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subDistcode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "TalukaMasterItem(subDistname=" + this.subDistname + ", subDistcode=" + this.subDistcode + ')';
    }

    public TalukaMasterItem(String str, String str2) {
        this.subDistname = str;
        this.subDistcode = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TalukaMasterItem(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
