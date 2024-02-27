package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SlotOwnerData {
    private final String owner_name;
    private final String vch_catg;
    private final int vh_class;
    private final String vh_class_desc;

    public SlotOwnerData(String str, int i10, String str2, String str3) {
        l.f(str, "owner_name");
        l.f(str2, "vh_class_desc");
        l.f(str3, "vch_catg");
        this.owner_name = str;
        this.vh_class = i10;
        this.vh_class_desc = str2;
        this.vch_catg = str3;
    }

    public static /* synthetic */ SlotOwnerData copy$default(SlotOwnerData slotOwnerData, String str, int i10, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = slotOwnerData.owner_name;
        }
        if ((i11 & 2) != 0) {
            i10 = slotOwnerData.vh_class;
        }
        if ((i11 & 4) != 0) {
            str2 = slotOwnerData.vh_class_desc;
        }
        if ((i11 & 8) != 0) {
            str3 = slotOwnerData.vch_catg;
        }
        return slotOwnerData.copy(str, i10, str2, str3);
    }

    public final String component1() {
        return this.owner_name;
    }

    public final int component2() {
        return this.vh_class;
    }

    public final String component3() {
        return this.vh_class_desc;
    }

    public final String component4() {
        return this.vch_catg;
    }

    public final SlotOwnerData copy(String str, int i10, String str2, String str3) {
        l.f(str, "owner_name");
        l.f(str2, "vh_class_desc");
        l.f(str3, "vch_catg");
        return new SlotOwnerData(str, i10, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotOwnerData)) {
            return false;
        }
        SlotOwnerData slotOwnerData = (SlotOwnerData) obj;
        return l.a(this.owner_name, slotOwnerData.owner_name) && this.vh_class == slotOwnerData.vh_class && l.a(this.vh_class_desc, slotOwnerData.vh_class_desc) && l.a(this.vch_catg, slotOwnerData.vch_catg);
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getVch_catg() {
        return this.vch_catg;
    }

    public final int getVh_class() {
        return this.vh_class;
    }

    public final String getVh_class_desc() {
        return this.vh_class_desc;
    }

    public int hashCode() {
        return (((((this.owner_name.hashCode() * 31) + Integer.hashCode(this.vh_class)) * 31) + this.vh_class_desc.hashCode()) * 31) + this.vch_catg.hashCode();
    }

    public String toString() {
        return "SlotOwnerData(owner_name=" + this.owner_name + ", vh_class=" + this.vh_class + ", vh_class_desc=" + this.vh_class_desc + ", vch_catg=" + this.vch_catg + ')';
    }
}
