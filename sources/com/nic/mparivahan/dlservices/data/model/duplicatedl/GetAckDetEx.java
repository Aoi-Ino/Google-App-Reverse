package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import com.nic.mparivahan.dlservices.data.model.DlSubmitResult;
import j7.c;
import java.io.Serializable;

@Keep
public final class GetAckDetEx implements Serializable {
    @c("result")
    private final DlSubmitResult dlSubmitresult;

    public GetAckDetEx() {
        this((DlSubmitResult) null, 1, (g) null);
    }

    public static /* synthetic */ GetAckDetEx copy$default(GetAckDetEx getAckDetEx, DlSubmitResult dlSubmitResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dlSubmitResult = getAckDetEx.dlSubmitresult;
        }
        return getAckDetEx.copy(dlSubmitResult);
    }

    public final DlSubmitResult component1() {
        return this.dlSubmitresult;
    }

    public final GetAckDetEx copy(DlSubmitResult dlSubmitResult) {
        return new GetAckDetEx(dlSubmitResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetAckDetEx) && l.a(this.dlSubmitresult, ((GetAckDetEx) obj).dlSubmitresult);
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
        return "GetAckDetEx(dlSubmitresult=" + this.dlSubmitresult + ')';
    }

    public GetAckDetEx(DlSubmitResult dlSubmitResult) {
        this.dlSubmitresult = dlSubmitResult;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetAckDetEx(DlSubmitResult dlSubmitResult, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : dlSubmitResult);
    }
}
