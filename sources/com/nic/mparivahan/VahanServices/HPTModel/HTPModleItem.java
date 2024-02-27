package com.nic.mparivahan.VahanServices.HPTModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class HTPModleItem {
    private final String hp_type_cd;
    private final String hp_type_descr;

    public HTPModleItem(String str, String str2) {
        l.f(str, "hp_type_cd");
        l.f(str2, "hp_type_descr");
        this.hp_type_cd = str;
        this.hp_type_descr = str2;
    }

    public static /* synthetic */ HTPModleItem copy$default(HTPModleItem hTPModleItem, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hTPModleItem.hp_type_cd;
        }
        if ((i10 & 2) != 0) {
            str2 = hTPModleItem.hp_type_descr;
        }
        return hTPModleItem.copy(str, str2);
    }

    public final String component1() {
        return this.hp_type_cd;
    }

    public final String component2() {
        return this.hp_type_descr;
    }

    public final HTPModleItem copy(String str, String str2) {
        l.f(str, "hp_type_cd");
        l.f(str2, "hp_type_descr");
        return new HTPModleItem(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTPModleItem)) {
            return false;
        }
        HTPModleItem hTPModleItem = (HTPModleItem) obj;
        return l.a(this.hp_type_cd, hTPModleItem.hp_type_cd) && l.a(this.hp_type_descr, hTPModleItem.hp_type_descr);
    }

    public final String getHp_type_cd() {
        return this.hp_type_cd;
    }

    public final String getHp_type_descr() {
        return this.hp_type_descr;
    }

    public int hashCode() {
        return (this.hp_type_cd.hashCode() * 31) + this.hp_type_descr.hashCode();
    }

    public String toString() {
        return "HTPModleItem(hp_type_cd=" + this.hp_type_cd + ", hp_type_descr=" + this.hp_type_descr + ')';
    }
}
