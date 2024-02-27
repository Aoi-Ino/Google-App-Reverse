package com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class UpdateRegisterResponse {
    private final ApiMessageX apiMessage;
    private final Data data;

    public UpdateRegisterResponse(ApiMessageX apiMessageX, Data data2) {
        this.apiMessage = apiMessageX;
        this.data = data2;
    }

    public static /* synthetic */ UpdateRegisterResponse copy$default(UpdateRegisterResponse updateRegisterResponse, ApiMessageX apiMessageX, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessageX = updateRegisterResponse.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = updateRegisterResponse.data;
        }
        return updateRegisterResponse.copy(apiMessageX, data2);
    }

    public final ApiMessageX component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final UpdateRegisterResponse copy(ApiMessageX apiMessageX, Data data2) {
        return new UpdateRegisterResponse(apiMessageX, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateRegisterResponse)) {
            return false;
        }
        UpdateRegisterResponse updateRegisterResponse = (UpdateRegisterResponse) obj;
        return l.a(this.apiMessage, updateRegisterResponse.apiMessage) && l.a(this.data, updateRegisterResponse.data);
    }

    public final ApiMessageX getApiMessage() {
        return this.apiMessage;
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        ApiMessageX apiMessageX = this.apiMessage;
        int i10 = 0;
        int hashCode = (apiMessageX == null ? 0 : apiMessageX.hashCode()) * 31;
        Data data2 = this.data;
        if (data2 != null) {
            i10 = data2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "UpdateRegisterResponse(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
