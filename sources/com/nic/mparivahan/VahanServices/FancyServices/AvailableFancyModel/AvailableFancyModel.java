package com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class AvailableFancyModel {
    private final List<Data> data;
    private final String message;
    private final String status;

    public AvailableFancyModel(List<Data> list, String str, String str2) {
        l.f(list, "data");
        l.f(str, "message");
        l.f(str2, "status");
        this.data = list;
        this.message = str;
        this.status = str2;
    }

    public static /* synthetic */ AvailableFancyModel copy$default(AvailableFancyModel availableFancyModel, List<Data> list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = availableFancyModel.data;
        }
        if ((i10 & 2) != 0) {
            str = availableFancyModel.message;
        }
        if ((i10 & 4) != 0) {
            str2 = availableFancyModel.status;
        }
        return availableFancyModel.copy(list, str, str2);
    }

    public final List<Data> component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.status;
    }

    public final AvailableFancyModel copy(List<Data> list, String str, String str2) {
        l.f(list, "data");
        l.f(str, "message");
        l.f(str2, "status");
        return new AvailableFancyModel(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableFancyModel)) {
            return false;
        }
        AvailableFancyModel availableFancyModel = (AvailableFancyModel) obj;
        return l.a(this.data, availableFancyModel.data) && l.a(this.message, availableFancyModel.message) && l.a(this.status, availableFancyModel.status);
    }

    public final List<Data> getData() {
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
        return "AvailableFancyModel(data=" + this.data + ", message=" + this.message + ", status=" + this.status + ')';
    }
}
