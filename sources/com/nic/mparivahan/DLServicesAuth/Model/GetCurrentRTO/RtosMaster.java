package com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class RtosMaster {
    private final String rto_code;
    private final String rto_name;

    public RtosMaster(String str, String str2) {
        l.f(str, "rto_name");
        l.f(str2, "rto_code");
        this.rto_name = str;
        this.rto_code = str2;
    }

    public static /* synthetic */ RtosMaster copy$default(RtosMaster rtosMaster, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rtosMaster.rto_name;
        }
        if ((i10 & 2) != 0) {
            str2 = rtosMaster.rto_code;
        }
        return rtosMaster.copy(str, str2);
    }

    public final String component1() {
        return this.rto_name;
    }

    public final String component2() {
        return this.rto_code;
    }

    public final RtosMaster copy(String str, String str2) {
        l.f(str, "rto_name");
        l.f(str2, "rto_code");
        return new RtosMaster(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtosMaster)) {
            return false;
        }
        RtosMaster rtosMaster = (RtosMaster) obj;
        return l.a(this.rto_name, rtosMaster.rto_name) && l.a(this.rto_code, rtosMaster.rto_code);
    }

    public final String getRto_code() {
        return this.rto_code;
    }

    public final String getRto_name() {
        return this.rto_name;
    }

    public int hashCode() {
        return (this.rto_name.hashCode() * 31) + this.rto_code.hashCode();
    }

    public String toString() {
        return "RtosMaster(rto_name=" + this.rto_name + ", rto_code=" + this.rto_code + ')';
    }
}
