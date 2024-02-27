package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class DlSubmitResponse implements Serializable {
    @c("responseMsg")
    private final ResponseMsgSubmit responseMsg;
    @c("saveApplDto")
    private final SaveApplDto saveApplDto;

    public DlSubmitResponse() {
        this((SaveApplDto) null, (ResponseMsgSubmit) null, 3, (g) null);
    }

    public static /* synthetic */ DlSubmitResponse copy$default(DlSubmitResponse dlSubmitResponse, SaveApplDto saveApplDto2, ResponseMsgSubmit responseMsgSubmit, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            saveApplDto2 = dlSubmitResponse.saveApplDto;
        }
        if ((i10 & 2) != 0) {
            responseMsgSubmit = dlSubmitResponse.responseMsg;
        }
        return dlSubmitResponse.copy(saveApplDto2, responseMsgSubmit);
    }

    public final SaveApplDto component1() {
        return this.saveApplDto;
    }

    public final ResponseMsgSubmit component2() {
        return this.responseMsg;
    }

    public final DlSubmitResponse copy(SaveApplDto saveApplDto2, ResponseMsgSubmit responseMsgSubmit) {
        return new DlSubmitResponse(saveApplDto2, responseMsgSubmit);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlSubmitResponse)) {
            return false;
        }
        DlSubmitResponse dlSubmitResponse = (DlSubmitResponse) obj;
        return l.a(this.saveApplDto, dlSubmitResponse.saveApplDto) && l.a(this.responseMsg, dlSubmitResponse.responseMsg);
    }

    public final ResponseMsgSubmit getResponseMsg() {
        return this.responseMsg;
    }

    public final SaveApplDto getSaveApplDto() {
        return this.saveApplDto;
    }

    public int hashCode() {
        SaveApplDto saveApplDto2 = this.saveApplDto;
        int i10 = 0;
        int hashCode = (saveApplDto2 == null ? 0 : saveApplDto2.hashCode()) * 31;
        ResponseMsgSubmit responseMsgSubmit = this.responseMsg;
        if (responseMsgSubmit != null) {
            i10 = responseMsgSubmit.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "DlSubmitResponse(saveApplDto=" + this.saveApplDto + ", responseMsg=" + this.responseMsg + ')';
    }

    public DlSubmitResponse(SaveApplDto saveApplDto2, ResponseMsgSubmit responseMsgSubmit) {
        this.saveApplDto = saveApplDto2;
        this.responseMsg = responseMsgSubmit;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlSubmitResponse(SaveApplDto saveApplDto2, ResponseMsgSubmit responseMsgSubmit, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : saveApplDto2, (i10 & 2) != 0 ? null : responseMsgSubmit);
    }
}
