package com.nic.mparivahan.dlservices.sarathiStateApi;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class SarathiStatePojo {
    private final List<StateMaster> StateMaster;
    private final String status_code;
    private final String status_desc;

    public SarathiStatePojo(List<StateMaster> list, String str, String str2) {
        l.f(list, "StateMaster");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        this.StateMaster = list;
        this.status_code = str;
        this.status_desc = str2;
    }

    public static /* synthetic */ SarathiStatePojo copy$default(SarathiStatePojo sarathiStatePojo, List<StateMaster> list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = sarathiStatePojo.StateMaster;
        }
        if ((i10 & 2) != 0) {
            str = sarathiStatePojo.status_code;
        }
        if ((i10 & 4) != 0) {
            str2 = sarathiStatePojo.status_desc;
        }
        return sarathiStatePojo.copy(list, str, str2);
    }

    public final List<StateMaster> component1() {
        return this.StateMaster;
    }

    public final String component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.status_desc;
    }

    public final SarathiStatePojo copy(List<StateMaster> list, String str, String str2) {
        l.f(list, "StateMaster");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        return new SarathiStatePojo(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SarathiStatePojo)) {
            return false;
        }
        SarathiStatePojo sarathiStatePojo = (SarathiStatePojo) obj;
        return l.a(this.StateMaster, sarathiStatePojo.StateMaster) && l.a(this.status_code, sarathiStatePojo.status_code) && l.a(this.status_desc, sarathiStatePojo.status_desc);
    }

    public final List<StateMaster> getStateMaster() {
        return this.StateMaster;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.StateMaster.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "SarathiStatePojo(StateMaster=" + this.StateMaster + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
