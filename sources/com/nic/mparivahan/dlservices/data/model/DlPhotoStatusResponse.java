package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlPhotoStatusResponse {
    private final String param;
    private final String responseBody;

    public DlPhotoStatusResponse(String str, String str2) {
        this.responseBody = str;
        this.param = str2;
    }

    public static /* synthetic */ DlPhotoStatusResponse copy$default(DlPhotoStatusResponse dlPhotoStatusResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlPhotoStatusResponse.responseBody;
        }
        if ((i10 & 2) != 0) {
            str2 = dlPhotoStatusResponse.param;
        }
        return dlPhotoStatusResponse.copy(str, str2);
    }

    public final String component1() {
        return this.responseBody;
    }

    public final String component2() {
        return this.param;
    }

    public final DlPhotoStatusResponse copy(String str, String str2) {
        return new DlPhotoStatusResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlPhotoStatusResponse)) {
            return false;
        }
        DlPhotoStatusResponse dlPhotoStatusResponse = (DlPhotoStatusResponse) obj;
        return l.a(this.responseBody, dlPhotoStatusResponse.responseBody) && l.a(this.param, dlPhotoStatusResponse.param);
    }

    public final String getParam() {
        return this.param;
    }

    public final String getResponseBody() {
        return this.responseBody;
    }

    public int hashCode() {
        String str = this.responseBody;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.param;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "DlPhotoStatusResponse(responseBody=" + this.responseBody + ", param=" + this.param + ')';
    }
}
