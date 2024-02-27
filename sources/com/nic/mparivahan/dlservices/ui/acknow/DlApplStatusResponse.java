package com.nic.mparivahan.dlservices.ui.acknow;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class DlApplStatusResponse {
    @c("applcntAge")
    private final String applcntAge;
    @c("docuUploadState")
    private final Boolean docuUploadState;
    @c("responseBody")
    private final ResponseBody responseBody;
    @c("responseMessage")
    private final ResponseMessage responseMessage;

    public DlApplStatusResponse() {
        this((ResponseBody) null, (Boolean) null, (ResponseMessage) null, (String) null, 15, (g) null);
    }

    public static /* synthetic */ DlApplStatusResponse copy$default(DlApplStatusResponse dlApplStatusResponse, ResponseBody responseBody2, Boolean bool, ResponseMessage responseMessage2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            responseBody2 = dlApplStatusResponse.responseBody;
        }
        if ((i10 & 2) != 0) {
            bool = dlApplStatusResponse.docuUploadState;
        }
        if ((i10 & 4) != 0) {
            responseMessage2 = dlApplStatusResponse.responseMessage;
        }
        if ((i10 & 8) != 0) {
            str = dlApplStatusResponse.applcntAge;
        }
        return dlApplStatusResponse.copy(responseBody2, bool, responseMessage2, str);
    }

    public final ResponseBody component1() {
        return this.responseBody;
    }

    public final Boolean component2() {
        return this.docuUploadState;
    }

    public final ResponseMessage component3() {
        return this.responseMessage;
    }

    public final String component4() {
        return this.applcntAge;
    }

    public final DlApplStatusResponse copy(ResponseBody responseBody2, Boolean bool, ResponseMessage responseMessage2, String str) {
        return new DlApplStatusResponse(responseBody2, bool, responseMessage2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlApplStatusResponse)) {
            return false;
        }
        DlApplStatusResponse dlApplStatusResponse = (DlApplStatusResponse) obj;
        return l.a(this.responseBody, dlApplStatusResponse.responseBody) && l.a(this.docuUploadState, dlApplStatusResponse.docuUploadState) && l.a(this.responseMessage, dlApplStatusResponse.responseMessage) && l.a(this.applcntAge, dlApplStatusResponse.applcntAge);
    }

    public final String getApplcntAge() {
        return this.applcntAge;
    }

    public final Boolean getDocuUploadState() {
        return this.docuUploadState;
    }

    public final ResponseBody getResponseBody() {
        return this.responseBody;
    }

    public final ResponseMessage getResponseMessage() {
        return this.responseMessage;
    }

    public int hashCode() {
        ResponseBody responseBody2 = this.responseBody;
        int i10 = 0;
        int hashCode = (responseBody2 == null ? 0 : responseBody2.hashCode()) * 31;
        Boolean bool = this.docuUploadState;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ResponseMessage responseMessage2 = this.responseMessage;
        int hashCode3 = (hashCode2 + (responseMessage2 == null ? 0 : responseMessage2.hashCode())) * 31;
        String str = this.applcntAge;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "DlApplStatusResponse(responseBody=" + this.responseBody + ", docuUploadState=" + this.docuUploadState + ", responseMessage=" + this.responseMessage + ", applcntAge=" + this.applcntAge + ')';
    }

    public DlApplStatusResponse(ResponseBody responseBody2, Boolean bool, ResponseMessage responseMessage2, String str) {
        this.responseBody = responseBody2;
        this.docuUploadState = bool;
        this.responseMessage = responseMessage2;
        this.applcntAge = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlApplStatusResponse(ResponseBody responseBody2, Boolean bool, ResponseMessage responseMessage2, String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : responseBody2, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : responseMessage2, (i10 & 8) != 0 ? null : str);
    }
}
