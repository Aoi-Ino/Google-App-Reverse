package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlPhotoStatusFinalReqeust {
    private final String param;
    private final String requestBody;

    public DlPhotoStatusFinalReqeust(String str, String str2) {
        l.f(str, "requestBody");
        l.f(str2, "param");
        this.requestBody = str;
        this.param = str2;
    }

    public static /* synthetic */ DlPhotoStatusFinalReqeust copy$default(DlPhotoStatusFinalReqeust dlPhotoStatusFinalReqeust, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlPhotoStatusFinalReqeust.requestBody;
        }
        if ((i10 & 2) != 0) {
            str2 = dlPhotoStatusFinalReqeust.param;
        }
        return dlPhotoStatusFinalReqeust.copy(str, str2);
    }

    public final String component1() {
        return this.requestBody;
    }

    public final String component2() {
        return this.param;
    }

    public final DlPhotoStatusFinalReqeust copy(String str, String str2) {
        l.f(str, "requestBody");
        l.f(str2, "param");
        return new DlPhotoStatusFinalReqeust(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlPhotoStatusFinalReqeust)) {
            return false;
        }
        DlPhotoStatusFinalReqeust dlPhotoStatusFinalReqeust = (DlPhotoStatusFinalReqeust) obj;
        return l.a(this.requestBody, dlPhotoStatusFinalReqeust.requestBody) && l.a(this.param, dlPhotoStatusFinalReqeust.param);
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
        return "DlPhotoStatusFinalReqeust(requestBody=" + this.requestBody + ", param=" + this.param + ')';
    }
}
