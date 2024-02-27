package com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle;

import androidx.annotation.Keep;

@Keep
public final class ApiMessage {
    private final int statusCode;

    public ApiMessage(int i10) {
        this.statusCode = i10;
    }

    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = apiMessage.statusCode;
        }
        return apiMessage.copy(i10);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final ApiMessage copy(int i10) {
        return new ApiMessage(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApiMessage) && this.statusCode == ((ApiMessage) obj).statusCode;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return Integer.hashCode(this.statusCode);
    }

    public String toString() {
        return "ApiMessage(statusCode=" + this.statusCode + ')';
    }
}
