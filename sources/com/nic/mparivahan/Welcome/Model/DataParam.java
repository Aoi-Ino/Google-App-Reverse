package com.nic.mparivahan.Welcome.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DataParam {
    private String data;

    public DataParam(String str) {
        l.f(str, "data");
        this.data = str;
    }

    public static /* synthetic */ DataParam copy$default(DataParam dataParam, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dataParam.data;
        }
        return dataParam.copy(str);
    }

    public final String component1() {
        return this.data;
    }

    public final DataParam copy(String str) {
        l.f(str, "data");
        return new DataParam(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataParam) && l.a(this.data, ((DataParam) obj).data);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public final void setData(String str) {
        l.f(str, "<set-?>");
        this.data = str;
    }

    public String toString() {
        return "DataParam(data=" + this.data + ')';
    }
}
