package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DmsAPIModle {
    private final String statusCode;
    private final String statusDesc;
    private final UploadDataDto uploadDataDto;

    public DmsAPIModle(String str, String str2, UploadDataDto uploadDataDto2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        l.f(uploadDataDto2, "uploadDataDto");
        this.statusCode = str;
        this.statusDesc = str2;
        this.uploadDataDto = uploadDataDto2;
    }

    public static /* synthetic */ DmsAPIModle copy$default(DmsAPIModle dmsAPIModle, String str, String str2, UploadDataDto uploadDataDto2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dmsAPIModle.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = dmsAPIModle.statusDesc;
        }
        if ((i10 & 4) != 0) {
            uploadDataDto2 = dmsAPIModle.uploadDataDto;
        }
        return dmsAPIModle.copy(str, str2, uploadDataDto2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final UploadDataDto component3() {
        return this.uploadDataDto;
    }

    public final DmsAPIModle copy(String str, String str2, UploadDataDto uploadDataDto2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        l.f(uploadDataDto2, "uploadDataDto");
        return new DmsAPIModle(str, str2, uploadDataDto2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DmsAPIModle)) {
            return false;
        }
        DmsAPIModle dmsAPIModle = (DmsAPIModle) obj;
        return l.a(this.statusCode, dmsAPIModle.statusCode) && l.a(this.statusDesc, dmsAPIModle.statusDesc) && l.a(this.uploadDataDto, dmsAPIModle.uploadDataDto);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final UploadDataDto getUploadDataDto() {
        return this.uploadDataDto;
    }

    public int hashCode() {
        return (((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31) + this.uploadDataDto.hashCode();
    }

    public String toString() {
        return "DmsAPIModle(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", uploadDataDto=" + this.uploadDataDto + ')';
    }
}
