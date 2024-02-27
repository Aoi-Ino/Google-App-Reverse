package com.nic.mparivahan.VahanServices.FancyServices.FancyFeesModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class FancyFeesModel {
    private final String data;
    private final String message;
    private final String status;

    public FancyFeesModel(String str, String str2, String str3) {
        l.f(str, "data");
        l.f(str2, "message");
        l.f(str3, "status");
        this.data = str;
        this.message = str2;
        this.status = str3;
    }

    public static /* synthetic */ FancyFeesModel copy$default(FancyFeesModel fancyFeesModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fancyFeesModel.data;
        }
        if ((i10 & 2) != 0) {
            str2 = fancyFeesModel.message;
        }
        if ((i10 & 4) != 0) {
            str3 = fancyFeesModel.status;
        }
        return fancyFeesModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.status;
    }

    public final FancyFeesModel copy(String str, String str2, String str3) {
        l.f(str, "data");
        l.f(str2, "message");
        l.f(str3, "status");
        return new FancyFeesModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FancyFeesModel)) {
            return false;
        }
        FancyFeesModel fancyFeesModel = (FancyFeesModel) obj;
        return l.a(this.data, fancyFeesModel.data) && l.a(this.message, fancyFeesModel.message) && l.a(this.status, fancyFeesModel.status);
    }

    public final String getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.data.hashCode() * 31) + this.message.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "FancyFeesModel(data=" + this.data + ", message=" + this.message + ", status=" + this.status + ')';
    }
}
