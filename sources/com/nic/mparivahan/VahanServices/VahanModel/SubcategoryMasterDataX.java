package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SubcategoryMasterDataX {
    private final String cat_id;
    private final String sub_cat_id;
    private final String sub_cat_name;

    public SubcategoryMasterDataX(String str, String str2, String str3) {
        l.f(str, "cat_id");
        l.f(str2, "sub_cat_id");
        l.f(str3, "sub_cat_name");
        this.cat_id = str;
        this.sub_cat_id = str2;
        this.sub_cat_name = str3;
    }

    public static /* synthetic */ SubcategoryMasterDataX copy$default(SubcategoryMasterDataX subcategoryMasterDataX, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subcategoryMasterDataX.cat_id;
        }
        if ((i10 & 2) != 0) {
            str2 = subcategoryMasterDataX.sub_cat_id;
        }
        if ((i10 & 4) != 0) {
            str3 = subcategoryMasterDataX.sub_cat_name;
        }
        return subcategoryMasterDataX.copy(str, str2, str3);
    }

    public final String component1() {
        return this.cat_id;
    }

    public final String component2() {
        return this.sub_cat_id;
    }

    public final String component3() {
        return this.sub_cat_name;
    }

    public final SubcategoryMasterDataX copy(String str, String str2, String str3) {
        l.f(str, "cat_id");
        l.f(str2, "sub_cat_id");
        l.f(str3, "sub_cat_name");
        return new SubcategoryMasterDataX(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubcategoryMasterDataX)) {
            return false;
        }
        SubcategoryMasterDataX subcategoryMasterDataX = (SubcategoryMasterDataX) obj;
        return l.a(this.cat_id, subcategoryMasterDataX.cat_id) && l.a(this.sub_cat_id, subcategoryMasterDataX.sub_cat_id) && l.a(this.sub_cat_name, subcategoryMasterDataX.sub_cat_name);
    }

    public final String getCat_id() {
        return this.cat_id;
    }

    public final String getSub_cat_id() {
        return this.sub_cat_id;
    }

    public final String getSub_cat_name() {
        return this.sub_cat_name;
    }

    public int hashCode() {
        return (((this.cat_id.hashCode() * 31) + this.sub_cat_id.hashCode()) * 31) + this.sub_cat_name.hashCode();
    }

    public String toString() {
        return "SubcategoryMasterDataX(cat_id=" + this.cat_id + ", sub_cat_id=" + this.sub_cat_id + ", sub_cat_name=" + this.sub_cat_name + ')';
    }
}
