package com.nic.mparivahan.dlservices.sarathiStateApi;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class StateMaster {
    private final String state_code;
    private final String state_name;

    public StateMaster(String str, String str2) {
        l.f(str, "state_name");
        l.f(str2, "state_code");
        this.state_name = str;
        this.state_code = str2;
    }

    public static /* synthetic */ StateMaster copy$default(StateMaster stateMaster, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stateMaster.state_name;
        }
        if ((i10 & 2) != 0) {
            str2 = stateMaster.state_code;
        }
        return stateMaster.copy(str, str2);
    }

    public final String component1() {
        return this.state_name;
    }

    public final String component2() {
        return this.state_code;
    }

    public final StateMaster copy(String str, String str2) {
        l.f(str, "state_name");
        l.f(str2, "state_code");
        return new StateMaster(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateMaster)) {
            return false;
        }
        StateMaster stateMaster = (StateMaster) obj;
        return l.a(this.state_name, stateMaster.state_name) && l.a(this.state_code, stateMaster.state_code);
    }

    public final String getState_code() {
        return this.state_code;
    }

    public final String getState_name() {
        return this.state_name;
    }

    public int hashCode() {
        return (this.state_name.hashCode() * 31) + this.state_code.hashCode();
    }

    public String toString() {
        return "StateMaster(state_name=" + this.state_name + ", state_code=" + this.state_code + ')';
    }
}
