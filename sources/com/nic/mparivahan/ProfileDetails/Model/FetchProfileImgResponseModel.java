package com.nic.mparivahan.ProfileDetails.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class FetchProfileImgResponseModel {
    private final String ctzImage;
    private final String statusCode;
    private final String statusDesc;

    public FetchProfileImgResponseModel(String str, String str2, String str3) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        l.f(str3, "ctzImage");
        this.statusCode = str;
        this.statusDesc = str2;
        this.ctzImage = str3;
    }

    public static /* synthetic */ FetchProfileImgResponseModel copy$default(FetchProfileImgResponseModel fetchProfileImgResponseModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fetchProfileImgResponseModel.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = fetchProfileImgResponseModel.statusDesc;
        }
        if ((i10 & 4) != 0) {
            str3 = fetchProfileImgResponseModel.ctzImage;
        }
        return fetchProfileImgResponseModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final String component3() {
        return this.ctzImage;
    }

    public final FetchProfileImgResponseModel copy(String str, String str2, String str3) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        l.f(str3, "ctzImage");
        return new FetchProfileImgResponseModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchProfileImgResponseModel)) {
            return false;
        }
        FetchProfileImgResponseModel fetchProfileImgResponseModel = (FetchProfileImgResponseModel) obj;
        return l.a(this.statusCode, fetchProfileImgResponseModel.statusCode) && l.a(this.statusDesc, fetchProfileImgResponseModel.statusDesc) && l.a(this.ctzImage, fetchProfileImgResponseModel.ctzImage);
    }

    public final String getCtzImage() {
        return this.ctzImage;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31) + this.ctzImage.hashCode();
    }

    public String toString() {
        return "FetchProfileImgResponseModel(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", ctzImage=" + this.ctzImage + ')';
    }
}
