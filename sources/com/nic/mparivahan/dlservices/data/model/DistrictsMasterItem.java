package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class DistrictsMasterItem {
    @c("dist_code")
    private final String distCode;
    @c("dist_name")
    private final String distName;

    public DistrictsMasterItem() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ DistrictsMasterItem copy$default(DistrictsMasterItem districtsMasterItem, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = districtsMasterItem.distName;
        }
        if ((i10 & 2) != 0) {
            str2 = districtsMasterItem.distCode;
        }
        return districtsMasterItem.copy(str, str2);
    }

    public final String component1() {
        return this.distName;
    }

    public final String component2() {
        return this.distCode;
    }

    public final DistrictsMasterItem copy(String str, String str2) {
        return new DistrictsMasterItem(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictsMasterItem)) {
            return false;
        }
        DistrictsMasterItem districtsMasterItem = (DistrictsMasterItem) obj;
        return l.a(this.distName, districtsMasterItem.distName) && l.a(this.distCode, districtsMasterItem.distCode);
    }

    public final String getDistCode() {
        return this.distCode;
    }

    public final String getDistName() {
        return this.distName;
    }

    public int hashCode() {
        String str = this.distName;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.distCode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "DistrictsMasterItem(distName=" + this.distName + ", distCode=" + this.distCode + ')';
    }

    public DistrictsMasterItem(String str, String str2) {
        this.distName = str;
        this.distCode = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DistrictsMasterItem(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
