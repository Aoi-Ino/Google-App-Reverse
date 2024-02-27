package com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class DuplicatePermitResponse implements Serializable {
    private final ApiMessage apiMessage;
    private final DataX data;

    public DuplicatePermitResponse(DataX dataX, ApiMessage apiMessage2) {
        this.data = dataX;
        this.apiMessage = apiMessage2;
    }

    public static /* synthetic */ DuplicatePermitResponse copy$default(DuplicatePermitResponse duplicatePermitResponse, DataX dataX, ApiMessage apiMessage2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dataX = duplicatePermitResponse.data;
        }
        if ((i10 & 2) != 0) {
            apiMessage2 = duplicatePermitResponse.apiMessage;
        }
        return duplicatePermitResponse.copy(dataX, apiMessage2);
    }

    public final DataX component1() {
        return this.data;
    }

    public final ApiMessage component2() {
        return this.apiMessage;
    }

    public final DuplicatePermitResponse copy(DataX dataX, ApiMessage apiMessage2) {
        return new DuplicatePermitResponse(dataX, apiMessage2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuplicatePermitResponse)) {
            return false;
        }
        DuplicatePermitResponse duplicatePermitResponse = (DuplicatePermitResponse) obj;
        return l.a(this.data, duplicatePermitResponse.data) && l.a(this.apiMessage, duplicatePermitResponse.apiMessage);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final DataX getData() {
        return this.data;
    }

    public int hashCode() {
        DataX dataX = this.data;
        int i10 = 0;
        int hashCode = (dataX == null ? 0 : dataX.hashCode()) * 31;
        ApiMessage apiMessage2 = this.apiMessage;
        if (apiMessage2 != null) {
            i10 = apiMessage2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "DuplicatePermitResponse(data=" + this.data + ", apiMessage=" + this.apiMessage + ')';
    }
}
