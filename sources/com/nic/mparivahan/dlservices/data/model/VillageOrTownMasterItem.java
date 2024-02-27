package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class VillageOrTownMasterItem {
    @c("village_code")
    private final String villageCode;
    @c("village_name")
    private final String villageName;

    public VillageOrTownMasterItem() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ VillageOrTownMasterItem copy$default(VillageOrTownMasterItem villageOrTownMasterItem, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = villageOrTownMasterItem.villageName;
        }
        if ((i10 & 2) != 0) {
            str2 = villageOrTownMasterItem.villageCode;
        }
        return villageOrTownMasterItem.copy(str, str2);
    }

    public final String component1() {
        return this.villageName;
    }

    public final String component2() {
        return this.villageCode;
    }

    public final VillageOrTownMasterItem copy(String str, String str2) {
        return new VillageOrTownMasterItem(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VillageOrTownMasterItem)) {
            return false;
        }
        VillageOrTownMasterItem villageOrTownMasterItem = (VillageOrTownMasterItem) obj;
        return l.a(this.villageName, villageOrTownMasterItem.villageName) && l.a(this.villageCode, villageOrTownMasterItem.villageCode);
    }

    public final String getVillageCode() {
        return this.villageCode;
    }

    public final String getVillageName() {
        return this.villageName;
    }

    public int hashCode() {
        String str = this.villageName;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.villageCode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "VillageOrTownMasterItem(villageName=" + this.villageName + ", villageCode=" + this.villageCode + ')';
    }

    public VillageOrTownMasterItem(String str, String str2) {
        this.villageName = str;
        this.villageCode = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VillageOrTownMasterItem(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
