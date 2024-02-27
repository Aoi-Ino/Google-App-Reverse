package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import java.util.List;

@Keep
public final class NonUploaded {
    private Bitmap bitmap;
    private String catId;
    private String catName;
    private Boolean docApproved;
    private String docBase64;
    private Boolean docRecieved;
    private Integer docType = 0;
    private Boolean docUploaded;
    private Boolean docVerified;
    private String file_name;
    private Boolean isAttached;
    private String mandatory;
    private String subId;
    private List<SubcategoryMasterDataX> subcategoryMasterDataList;
    private Boolean tempDocApproved;

    public NonUploaded() {
        Boolean bool = Boolean.FALSE;
        this.docApproved = bool;
        this.docRecieved = bool;
        this.docUploaded = bool;
        this.docVerified = bool;
        this.tempDocApproved = bool;
        this.isAttached = bool;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
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

    public final String getDocBase64() {
        return this.docBase64;
    }

    public final Boolean getDocRecieved() {
        return this.docRecieved;
    }

    public final Integer getDocType() {
        return this.docType;
    }

    public final Boolean getDocUploaded() {
        return this.docUploaded;
    }

    public final Boolean getDocVerified() {
        return this.docVerified;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    public final String getMandatory() {
        return this.mandatory;
    }

    public final String getSubId() {
        return this.subId;
    }

    public final List<SubcategoryMasterDataX> getSubcategoryMasterDataList() {
        return this.subcategoryMasterDataList;
    }

    public final Boolean getTempDocApproved() {
        return this.tempDocApproved;
    }

    public final Boolean isAttached() {
        return this.isAttached;
    }

    public final void setAttached(Boolean bool) {
        this.isAttached = bool;
    }

    public final void setBitmap(Bitmap bitmap2) {
        this.bitmap = bitmap2;
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

    public final void setDocBase64(String str) {
        this.docBase64 = str;
    }

    public final void setDocRecieved(Boolean bool) {
        this.docRecieved = bool;
    }

    public final void setDocType(Integer num) {
        this.docType = num;
    }

    public final void setDocUploaded(Boolean bool) {
        this.docUploaded = bool;
    }

    public final void setDocVerified(Boolean bool) {
        this.docVerified = bool;
    }

    public final void setFile_name(String str) {
        this.file_name = str;
    }

    public final void setMandatory(String str) {
        this.mandatory = str;
    }

    public final void setSubId(String str) {
        this.subId = str;
    }

    public final void setSubcategoryMasterDataList(List<SubcategoryMasterDataX> list) {
        this.subcategoryMasterDataList = list;
    }

    public final void setTempDocApproved(Boolean bool) {
        this.tempDocApproved = bool;
    }
}
