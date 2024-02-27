package com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class AadharrValidateForMobileRes {
    private final ApiMessage apiMessage;

    public AadharrValidateForMobileRes(ApiMessage apiMessage2) {
        this.apiMessage = apiMessage2;
    }

    public static /* synthetic */ AadharrValidateForMobileRes copy$default(AadharrValidateForMobileRes aadharrValidateForMobileRes, ApiMessage apiMessage2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = aadharrValidateForMobileRes.apiMessage;
        }
        return aadharrValidateForMobileRes.copy(apiMessage2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final AadharrValidateForMobileRes copy(ApiMessage apiMessage2) {
        return new AadharrValidateForMobileRes(apiMessage2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AadharrValidateForMobileRes) && l.a(this.apiMessage, ((AadharrValidateForMobileRes) obj).apiMessage);
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
        return "AadharrValidateForMobileRes(apiMessage=" + this.apiMessage + ')';
    }
}
