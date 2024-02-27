package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import java.util.List;

@Keep
public final class UploadDataDto {
    private String applno;
    private List<Mandatory> mandatoryList;
    private List<NonUploaded> nonUploadedList;
    private String purposeCode;
    private String purposeName;
    private String state;
    private List<Uploaded> uploadedList;

    public final String getApplno() {
        return this.applno;
    }

    public final List<Mandatory> getMandatoryList() {
        return this.mandatoryList;
    }

    public final List<NonUploaded> getNonUploadedList() {
        return this.nonUploadedList;
    }

    public final String getPurposeCode() {
        return this.purposeCode;
    }

    public final String getPurposeName() {
        return this.purposeName;
    }

    public final String getState() {
        return this.state;
    }

    public final List<Uploaded> getUploadedList() {
        return this.uploadedList;
    }

    public final void setApplno(String str) {
        this.applno = str;
    }

    public final void setMandatoryList(List<Mandatory> list) {
        this.mandatoryList = list;
    }

    public final void setNonUploadedList(List<NonUploaded> list) {
        this.nonUploadedList = list;
    }

    public final void setPurposeCode(String str) {
        this.purposeCode = str;
    }

    public final void setPurposeName(String str) {
        this.purposeName = str;
    }

    public final void setState(String str) {
        this.state = str;
    }

    public final void setUploadedList(List<Uploaded> list) {
        this.uploadedList = list;
    }
}
