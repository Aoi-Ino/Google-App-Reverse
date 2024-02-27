package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;

@Keep
public final class SubcategoryMasterDataXX {
    private String sub_cat_id;
    private String sub_cat_name;

    public final String getSub_cat_id() {
        return this.sub_cat_id;
    }

    public final String getSub_cat_name() {
        return this.sub_cat_name;
    }

    public final void setSub_cat_id(String str) {
        this.sub_cat_id = str;
    }

    public final void setSub_cat_name(String str) {
        this.sub_cat_name = str;
    }
}
