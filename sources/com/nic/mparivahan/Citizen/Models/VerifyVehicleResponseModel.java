package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VerifyVehicleResponseModel {
    private final String statusCode;
    private final String statusDesc;

    public VerifyVehicleResponseModel(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ VerifyVehicleResponseModel copy$default(VerifyVehicleResponseModel verifyVehicleResponseModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = verifyVehicleResponseModel.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = verifyVehicleResponseModel.statusDesc;
        }
        return verifyVehicleResponseModel.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final VerifyVehicleResponseModel copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new VerifyVehicleResponseModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyVehicleResponseModel)) {
            return false;
        }
        VerifyVehicleResponseModel verifyVehicleResponseModel = (VerifyVehicleResponseModel) obj;
        return l.a(this.statusCode, verifyVehicleResponseModel.statusCode) && l.a(this.statusDesc, verifyVehicleResponseModel.statusDesc);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (this.statusCode.hashCode() * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "VerifyVehicleResponseModel(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
