package com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DataX {
    private final String rtocode;
    private final String rtoname;
    private final String statecode;

    public DataX(String str, String str2, String str3) {
        l.f(str, "rtocode");
        l.f(str2, "rtoname");
        l.f(str3, "statecode");
        this.rtocode = str;
        this.rtoname = str2;
        this.statecode = str3;
    }

    public static /* synthetic */ DataX copy$default(DataX dataX, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dataX.rtocode;
        }
        if ((i10 & 2) != 0) {
            str2 = dataX.rtoname;
        }
        if ((i10 & 4) != 0) {
            str3 = dataX.statecode;
        }
        return dataX.copy(str, str2, str3);
    }

    public final String component1() {
        return this.rtocode;
    }

    public final String component2() {
        return this.rtoname;
    }

    public final String component3() {
        return this.statecode;
    }

    public final DataX copy(String str, String str2, String str3) {
        l.f(str, "rtocode");
        l.f(str2, "rtoname");
        l.f(str3, "statecode");
        return new DataX(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataX)) {
            return false;
        }
        DataX dataX = (DataX) obj;
        return l.a(this.rtocode, dataX.rtocode) && l.a(this.rtoname, dataX.rtoname) && l.a(this.statecode, dataX.statecode);
    }

    public final String getRtocode() {
        return this.rtocode;
    }

    public final String getRtoname() {
        return this.rtoname;
    }

    public final String getStatecode() {
        return this.statecode;
    }

    public int hashCode() {
        return (((this.rtocode.hashCode() * 31) + this.rtoname.hashCode()) * 31) + this.statecode.hashCode();
    }

    public String toString() {
        return "DataX(rtocode=" + this.rtocode + ", rtoname=" + this.rtoname + ", statecode=" + this.statecode + ')';
    }
}
