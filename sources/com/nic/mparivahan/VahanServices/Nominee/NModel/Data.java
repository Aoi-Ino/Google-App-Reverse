package com.nic.mparivahan.VahanServices.Nominee.NModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Data {
    private final int code;
    private final String descr;

    public Data(int i10, String str) {
        l.f(str, "descr");
        this.code = i10;
        this.descr = str;
    }

    public static /* synthetic */ Data copy$default(Data data, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = data.code;
        }
        if ((i11 & 2) != 0) {
            str = data.descr;
        }
        return data.copy(i10, str);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.descr;
    }

    public final Data copy(int i10, String str) {
        l.f(str, "descr");
        return new Data(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return this.code == data.code && l.a(this.descr, data.descr);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescr() {
        return this.descr;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.descr.hashCode();
    }

    public String toString() {
        return "Data(code=" + this.code + ", descr=" + this.descr + ')';
    }
}
