package com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class CurrentRTO {
    private final List<RtosMaster> RtosMaster;
    private final String status_code;
    private final String status_desc;

    public CurrentRTO(List<RtosMaster> list, String str, String str2) {
        l.f(list, "RtosMaster");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        this.RtosMaster = list;
        this.status_code = str;
        this.status_desc = str2;
    }

    public static /* synthetic */ CurrentRTO copy$default(CurrentRTO currentRTO, List<RtosMaster> list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = currentRTO.RtosMaster;
        }
        if ((i10 & 2) != 0) {
            str = currentRTO.status_code;
        }
        if ((i10 & 4) != 0) {
            str2 = currentRTO.status_desc;
        }
        return currentRTO.copy(list, str, str2);
    }

    public final List<RtosMaster> component1() {
        return this.RtosMaster;
    }

    public final String component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.status_desc;
    }

    public final CurrentRTO copy(List<RtosMaster> list, String str, String str2) {
        l.f(list, "RtosMaster");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        return new CurrentRTO(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentRTO)) {
            return false;
        }
        CurrentRTO currentRTO = (CurrentRTO) obj;
        return l.a(this.RtosMaster, currentRTO.RtosMaster) && l.a(this.status_code, currentRTO.status_code) && l.a(this.status_desc, currentRTO.status_desc);
    }

    public final List<RtosMaster> getRtosMaster() {
        return this.RtosMaster;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.RtosMaster.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "CurrentRTO(RtosMaster=" + this.RtosMaster + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
