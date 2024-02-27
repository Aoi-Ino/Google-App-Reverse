package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import com.nic.mparivahan.dlservices.data.model.DlSubmitResult;
import j7.c;
import java.io.Serializable;

@Keep
public final class GetAckDetForGivenDLNumberResponse implements Serializable {
    @c("result")
    private final DlSubmitResult dlSubmitresult;

    public GetAckDetForGivenDLNumberResponse() {
        this((DlSubmitResult) null, 1, (g) null);
    }

    public static /* synthetic */ GetAckDetForGivenDLNumberResponse copy$default(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse, DlSubmitResult dlSubmitResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dlSubmitResult = getAckDetForGivenDLNumberResponse.dlSubmitresult;
        }
        return getAckDetForGivenDLNumberResponse.copy(dlSubmitResult);
    }

    public final DlSubmitResult component1() {
        return this.dlSubmitresult;
    }

    public final GetAckDetForGivenDLNumberResponse copy(DlSubmitResult dlSubmitResult) {
        return new GetAckDetForGivenDLNumberResponse(dlSubmitResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetAckDetForGivenDLNumberResponse) && l.a(this.dlSubmitresult, ((GetAckDetForGivenDLNumberResponse) obj).dlSubmitresult);
    }

    public final DlSubmitResult getDlSubmitresult() {
        return this.dlSubmitresult;
    }

    public int hashCode() {
        DlSubmitResult dlSubmitResult = this.dlSubmitresult;
        if (dlSubmitResult == null) {
            return 0;
        }
        return dlSubmitResult.hashCode();
    }

    public String toString() {
        return "GetAckDetForGivenDLNumberResponse(dlSubmitresult=" + this.dlSubmitresult + ')';
    }

    public GetAckDetForGivenDLNumberResponse(DlSubmitResult dlSubmitResult) {
        this.dlSubmitresult = dlSubmitResult;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetAckDetForGivenDLNumberResponse(DlSubmitResult dlSubmitResult, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : dlSubmitResult);
    }
}
