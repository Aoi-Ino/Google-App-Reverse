package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import java.util.List;

@Keep
public final class Mandatory {
    private String catId;
    private String catName;
    private Boolean docApproved;
    private Boolean docRecieved;
    private Boolean docUploaded;
    private Boolean docVerified;
    private String mandatory;
    private List<SubcategoryMasterData> subcategoryMasterDataList;
    private Boolean tempDocApproved;

    public final String getCatId() {
        return this.catId;
    }

    public final String getCatName() {
        return this.catName;
    }

    public final Boolean getDocApproved() {
        return this.docApproved;
    }

    public final Boolean getDocRecieved() {
        return this.docRecieved;
    }

    public final Boolean getDocUploaded() {
        return this.docUploaded;
    }

    public final Boolean getDocVerified() {
        return this.docVerified;
    }

    public final String getMandatory() {
        return this.mandatory;
    }

    public final List<SubcategoryMasterData> getSubcategoryMasterDataList() {
        return this.subcategoryMasterDataList;
    }

    public final Boolean getTempDocApproved() {
        return this.tempDocApproved;
    }

    public final void setCatId(String str) {
        this.catId = str;
    }

    public final void setCatName(String str) {
        this.catName = str;
    }

    public final void setDocApproved(Boolean bool) {
        this.docApproved = bool;
    }

    public final void setDocRecieved(Boolean bool) {
        this.docRecieved = bool;
    }

    public final void setDocUploaded(Boolean bool) {
        this.docUploaded = bool;
    }

    public final void setDocVerified(Boolean bool) {
        this.docVerified = bool;
    }

    public final void setMandatory(String str) {
        this.mandatory = str;
    }

    public final void setSubcategoryMasterDataList(List<SubcategoryMasterData> list) {
        this.subcategoryMasterDataList = list;
    }

    public final void setTempDocApproved(Boolean bool) {
        this.tempDocApproved = bool;
    }
}
