package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;

@Keep
public final class VahanDmsModleResponse {
    private String statusCode;
    private String statusDesc;
    private UploadDataDto uploadDataDto;

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final UploadDataDto getUploadDataDto() {
        return this.uploadDataDto;
    }

    public final void setStatusCode(String str) {
        this.statusCode = str;
    }

    public final void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public final void setUploadDataDto(UploadDataDto uploadDataDto2) {
        this.uploadDataDto = uploadDataDto2;
    }
}
