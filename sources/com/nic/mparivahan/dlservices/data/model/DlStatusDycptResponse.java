package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class DlStatusDycptResponse implements Serializable {
    @c("dlApplStatusDto")
    private final DlApplStatusDto dlApplStatusDto;
    @c("responseMsg")
    private final ResponseMsg responseMsg;

    public DlStatusDycptResponse() {
        this((DlApplStatusDto) null, (ResponseMsg) null, 3, (g) null);
    }

    public static /* synthetic */ DlStatusDycptResponse copy$default(DlStatusDycptResponse dlStatusDycptResponse, DlApplStatusDto dlApplStatusDto2, ResponseMsg responseMsg2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dlApplStatusDto2 = dlStatusDycptResponse.dlApplStatusDto;
        }
        if ((i10 & 2) != 0) {
            responseMsg2 = dlStatusDycptResponse.responseMsg;
        }
        return dlStatusDycptResponse.copy(dlApplStatusDto2, responseMsg2);
    }

    public final DlApplStatusDto component1() {
        return this.dlApplStatusDto;
    }

    public final ResponseMsg component2() {
        return this.responseMsg;
    }

    public final DlStatusDycptResponse copy(DlApplStatusDto dlApplStatusDto2, ResponseMsg responseMsg2) {
        return new DlStatusDycptResponse(dlApplStatusDto2, responseMsg2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlStatusDycptResponse)) {
            return false;
        }
        DlStatusDycptResponse dlStatusDycptResponse = (DlStatusDycptResponse) obj;
        return l.a(this.dlApplStatusDto, dlStatusDycptResponse.dlApplStatusDto) && l.a(this.responseMsg, dlStatusDycptResponse.responseMsg);
    }

    public final DlApplStatusDto getDlApplStatusDto() {
        return this.dlApplStatusDto;
    }

    public final ResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public int hashCode() {
        DlApplStatusDto dlApplStatusDto2 = this.dlApplStatusDto;
        int i10 = 0;
        int hashCode = (dlApplStatusDto2 == null ? 0 : dlApplStatusDto2.hashCode()) * 31;
        ResponseMsg responseMsg2 = this.responseMsg;
        if (responseMsg2 != null) {
            i10 = responseMsg2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "DlStatusDycptResponse(dlApplStatusDto=" + this.dlApplStatusDto + ", responseMsg=" + this.responseMsg + ')';
    }

    public DlStatusDycptResponse(DlApplStatusDto dlApplStatusDto2, ResponseMsg responseMsg2) {
        this.dlApplStatusDto = dlApplStatusDto2;
        this.responseMsg = responseMsg2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlStatusDycptResponse(DlApplStatusDto dlApplStatusDto2, ResponseMsg responseMsg2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : dlApplStatusDto2, (i10 & 2) != 0 ? null : responseMsg2);
    }
}
