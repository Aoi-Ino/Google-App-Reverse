package com.nic.mparivahan.dlservices.data.model.temp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class UploadedDocResponse {
    @c("responses")
    private final List<ResponsesItem> responses;
    @c("statusCode")
    private final Integer statusCode;
    @c("statusMessage")
    private final String statusMessage;

    public UploadedDocResponse() {
        this((List) null, (String) null, (Integer) null, 7, (g) null);
    }

    public static /* synthetic */ UploadedDocResponse copy$default(UploadedDocResponse uploadedDocResponse, List<ResponsesItem> list, String str, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = uploadedDocResponse.responses;
        }
        if ((i10 & 2) != 0) {
            str = uploadedDocResponse.statusMessage;
        }
        if ((i10 & 4) != 0) {
            num = uploadedDocResponse.statusCode;
        }
        return uploadedDocResponse.copy(list, str, num);
    }

    public final List<ResponsesItem> component1() {
        return this.responses;
    }

    public final String component2() {
        return this.statusMessage;
    }

    public final Integer component3() {
        return this.statusCode;
    }

    public final UploadedDocResponse copy(List<ResponsesItem> list, String str, Integer num) {
        return new UploadedDocResponse(list, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadedDocResponse)) {
            return false;
        }
        UploadedDocResponse uploadedDocResponse = (UploadedDocResponse) obj;
        return l.a(this.responses, uploadedDocResponse.responses) && l.a(this.statusMessage, uploadedDocResponse.statusMessage) && l.a(this.statusCode, uploadedDocResponse.statusCode);
    }

    public final List<ResponsesItem> getResponses() {
        return this.responses;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public int hashCode() {
        List<ResponsesItem> list = this.responses;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.statusMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.statusCode;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "UploadedDocResponse(responses=" + this.responses + ", statusMessage=" + this.statusMessage + ", statusCode=" + this.statusCode + ')';
    }

    public UploadedDocResponse(List<ResponsesItem> list, String str, Integer num) {
        this.responses = list;
        this.statusMessage = str;
        this.statusCode = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UploadedDocResponse(List list, String str, Integer num, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : num);
    }
}
