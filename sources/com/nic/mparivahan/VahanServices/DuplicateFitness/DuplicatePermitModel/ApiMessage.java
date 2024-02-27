package com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ApiMessage {
    private final String developerMessage;

    public ApiMessage(String str) {
        this.developerMessage = str;
    }

    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = apiMessage.developerMessage;
        }
        return apiMessage.copy(str);
    }

    public final String component1() {
        return this.developerMessage;
    }

    public final ApiMessage copy(String str) {
        return new ApiMessage(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApiMessage) && l.a(this.developerMessage, ((ApiMessage) obj).developerMessage);
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public int hashCode() {
        String str = this.developerMessage;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ApiMessage(developerMessage=" + this.developerMessage + ')';
    }
}
