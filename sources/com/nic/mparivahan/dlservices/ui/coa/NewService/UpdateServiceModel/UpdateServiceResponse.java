package com.nic.mparivahan.dlservices.ui.coa.NewService.UpdateServiceModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class UpdateServiceResponse {
    private final Result result;

    public UpdateServiceResponse(Result result2) {
        l.f(result2, "result");
        this.result = result2;
    }

    public static /* synthetic */ UpdateServiceResponse copy$default(UpdateServiceResponse updateServiceResponse, Result result2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            result2 = updateServiceResponse.result;
        }
        return updateServiceResponse.copy(result2);
    }

    public final Result component1() {
        return this.result;
    }

    public final UpdateServiceResponse copy(Result result2) {
        l.f(result2, "result");
        return new UpdateServiceResponse(result2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateServiceResponse) && l.a(this.result, ((UpdateServiceResponse) obj).result);
    }

    public final Result getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public String toString() {
        return "UpdateServiceResponse(result=" + this.result + ')';
    }
}
