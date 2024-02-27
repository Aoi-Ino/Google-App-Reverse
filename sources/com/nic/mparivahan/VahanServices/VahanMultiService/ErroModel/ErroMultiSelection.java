package com.nic.mparivahan.VahanServices.VahanMultiService.ErroModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ErroMultiSelection {
    private final ApiMessage apiMessage;

    public ErroMultiSelection(ApiMessage apiMessage2) {
        this.apiMessage = apiMessage2;
    }

    public static /* synthetic */ ErroMultiSelection copy$default(ErroMultiSelection erroMultiSelection, ApiMessage apiMessage2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = erroMultiSelection.apiMessage;
        }
        return erroMultiSelection.copy(apiMessage2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final ErroMultiSelection copy(ApiMessage apiMessage2) {
        return new ErroMultiSelection(apiMessage2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ErroMultiSelection) && l.a(this.apiMessage, ((ErroMultiSelection) obj).apiMessage);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public int hashCode() {
        ApiMessage apiMessage2 = this.apiMessage;
        if (apiMessage2 == null) {
            return 0;
        }
        return apiMessage2.hashCode();
    }

    public String toString() {
        return "ErroMultiSelection(apiMessage=" + this.apiMessage + ')';
    }
}
