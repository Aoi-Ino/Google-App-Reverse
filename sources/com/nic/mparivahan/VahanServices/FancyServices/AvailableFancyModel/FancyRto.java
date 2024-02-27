package com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class FancyRto {
    private final List<DataX> data;
    private final String message;
    private final String status;

    public FancyRto(List<DataX> list, String str, String str2) {
        l.f(list, "data");
        l.f(str, "message");
        l.f(str2, "status");
        this.data = list;
        this.message = str;
        this.status = str2;
    }

    public static /* synthetic */ FancyRto copy$default(FancyRto fancyRto, List<DataX> list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = fancyRto.data;
        }
        if ((i10 & 2) != 0) {
            str = fancyRto.message;
        }
        if ((i10 & 4) != 0) {
            str2 = fancyRto.status;
        }
        return fancyRto.copy(list, str, str2);
    }

    public final List<DataX> component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.status;
    }

    public final FancyRto copy(List<DataX> list, String str, String str2) {
        l.f(list, "data");
        l.f(str, "message");
        l.f(str2, "status");
        return new FancyRto(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FancyRto)) {
            return false;
        }
        FancyRto fancyRto = (FancyRto) obj;
        return l.a(this.data, fancyRto.data) && l.a(this.message, fancyRto.message) && l.a(this.status, fancyRto.status);
    }

    public final List<DataX> getData() {
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
        return "FancyRto(data=" + this.data + ", message=" + this.message + ", status=" + this.status + ')';
    }
}
