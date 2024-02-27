package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SubcategoryMasterDataXX {
    private final String sub_cat_id;
    private final String sub_cat_name;

    public SubcategoryMasterDataXX(String str, String str2) {
        l.f(str, "sub_cat_id");
        l.f(str2, "sub_cat_name");
        this.sub_cat_id = str;
        this.sub_cat_name = str2;
    }

    public static /* synthetic */ SubcategoryMasterDataXX copy$default(SubcategoryMasterDataXX subcategoryMasterDataXX, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subcategoryMasterDataXX.sub_cat_id;
        }
        if ((i10 & 2) != 0) {
            str2 = subcategoryMasterDataXX.sub_cat_name;
        }
        return subcategoryMasterDataXX.copy(str, str2);
    }

    public final String component1() {
        return this.sub_cat_id;
    }

    public final String component2() {
        return this.sub_cat_name;
    }

    public final SubcategoryMasterDataXX copy(String str, String str2) {
        l.f(str, "sub_cat_id");
        l.f(str2, "sub_cat_name");
        return new SubcategoryMasterDataXX(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubcategoryMasterDataXX)) {
            return false;
        }
        SubcategoryMasterDataXX subcategoryMasterDataXX = (SubcategoryMasterDataXX) obj;
        return l.a(this.sub_cat_id, subcategoryMasterDataXX.sub_cat_id) && l.a(this.sub_cat_name, subcategoryMasterDataXX.sub_cat_name);
    }

    public final String getSub_cat_id() {
        return this.sub_cat_id;
    }

    public final String getSub_cat_name() {
        return this.sub_cat_name;
    }

    public int hashCode() {
        return (this.sub_cat_id.hashCode() * 31) + this.sub_cat_name.hashCode();
    }

    public String toString() {
        return "SubcategoryMasterDataXX(sub_cat_id=" + this.sub_cat_id + ", sub_cat_name=" + this.sub_cat_name + ')';
    }
}
