package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class UploadDlRenewalPhotoSignReqeust {
    private final String param;
    private final String requestBody;

    public UploadDlRenewalPhotoSignReqeust(String str, String str2) {
        l.f(str, "requestBody");
        l.f(str2, "param");
        this.requestBody = str;
        this.param = str2;
    }

    public static /* synthetic */ UploadDlRenewalPhotoSignReqeust copy$default(UploadDlRenewalPhotoSignReqeust uploadDlRenewalPhotoSignReqeust, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uploadDlRenewalPhotoSignReqeust.requestBody;
        }
        if ((i10 & 2) != 0) {
            str2 = uploadDlRenewalPhotoSignReqeust.param;
        }
        return uploadDlRenewalPhotoSignReqeust.copy(str, str2);
    }

    public final String component1() {
        return this.requestBody;
    }

    public final String component2() {
        return this.param;
    }

    public final UploadDlRenewalPhotoSignReqeust copy(String str, String str2) {
        l.f(str, "requestBody");
        l.f(str2, "param");
        return new UploadDlRenewalPhotoSignReqeust(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadDlRenewalPhotoSignReqeust)) {
            return false;
        }
        UploadDlRenewalPhotoSignReqeust uploadDlRenewalPhotoSignReqeust = (UploadDlRenewalPhotoSignReqeust) obj;
        return l.a(this.requestBody, uploadDlRenewalPhotoSignReqeust.requestBody) && l.a(this.param, uploadDlRenewalPhotoSignReqeust.param);
    }

    public final String getParam() {
        return this.param;
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public int hashCode() {
        return (this.requestBody.hashCode() * 31) + this.param.hashCode();
    }

    public String toString() {
        return "UploadDlRenewalPhotoSignReqeust(requestBody=" + this.requestBody + ", param=" + this.param + ')';
    }
}
