package com.nic.mparivahan.ProfileDetails.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class UploadProfileImgResponseModel {
    private final String statusCode;
    private final String statusDesc;

    public UploadProfileImgResponseModel(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ UploadProfileImgResponseModel copy$default(UploadProfileImgResponseModel uploadProfileImgResponseModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uploadProfileImgResponseModel.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = uploadProfileImgResponseModel.statusDesc;
        }
        return uploadProfileImgResponseModel.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final UploadProfileImgResponseModel copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new UploadProfileImgResponseModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadProfileImgResponseModel)) {
            return false;
        }
        UploadProfileImgResponseModel uploadProfileImgResponseModel = (UploadProfileImgResponseModel) obj;
        return l.a(this.statusCode, uploadProfileImgResponseModel.statusCode) && l.a(this.statusDesc, uploadProfileImgResponseModel.statusDesc);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (this.statusCode.hashCode() * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "UploadProfileImgResponseModel(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
