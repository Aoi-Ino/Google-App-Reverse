package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;

@Keep
public final class Uploaded {
    private String catId;
    private String catName;
    private Boolean docApproved;
    private Boolean docRecieved;
    private Boolean docUploaded;
    private String docUploadedDate;
    private String docUrl;
    private Boolean docVerified;
    private String mandatory;
    private String objectId;
    private SubcategoryMasterDataXX subcategoryMasterData;
    private Boolean tempDocApproved;
    private String uniqueRefNo;

    public Uploaded() {
        Boolean bool = Boolean.FALSE;
        this.docApproved = bool;
        this.docRecieved = bool;
        this.docUploaded = bool;
        this.tempDocApproved = bool;
    }

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

    public final String getDocUploadedDate() {
        return this.docUploadedDate;
    }

    public final String getDocUrl() {
        return this.docUrl;
    }

    public final Boolean getDocVerified() {
        return this.docVerified;
    }

    public final String getMandatory() {
        return this.mandatory;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final SubcategoryMasterDataXX getSubcategoryMasterData() {
        return this.subcategoryMasterData;
    }

    public final Boolean getTempDocApproved() {
        return this.tempDocApproved;
    }

    public final String getUniqueRefNo() {
        return this.uniqueRefNo;
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

    public final void setDocUploadedDate(String str) {
        this.docUploadedDate = str;
    }

    public final void setDocUrl(String str) {
        this.docUrl = str;
    }

    public final void setDocVerified(Boolean bool) {
        this.docVerified = bool;
    }

    public final void setMandatory(String str) {
        this.mandatory = str;
    }

    public final void setObjectId(String str) {
        this.objectId = str;
    }

    public final void setSubcategoryMasterData(SubcategoryMasterDataXX subcategoryMasterDataXX) {
        this.subcategoryMasterData = subcategoryMasterDataXX;
    }

    public final void setTempDocApproved(Boolean bool) {
        this.tempDocApproved = bool;
    }

    public final void setUniqueRefNo(String str) {
        this.uniqueRefNo = str;
    }
}
