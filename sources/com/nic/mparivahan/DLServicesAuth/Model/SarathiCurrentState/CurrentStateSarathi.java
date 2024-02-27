package com.nic.mparivahan.DLServicesAuth.Model.SarathiCurrentState;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class CurrentStateSarathi {
    private final List<State> states;
    private final String statusCode;
    private final String statusDesc;

    public CurrentStateSarathi(List<State> list, String str, String str2) {
        l.f(list, "states");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.states = list;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ CurrentStateSarathi copy$default(CurrentStateSarathi currentStateSarathi, List<State> list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = currentStateSarathi.states;
        }
        if ((i10 & 2) != 0) {
            str = currentStateSarathi.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = currentStateSarathi.statusDesc;
        }
        return currentStateSarathi.copy(list, str, str2);
    }

    public final List<State> component1() {
        return this.states;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final CurrentStateSarathi copy(List<State> list, String str, String str2) {
        l.f(list, "states");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new CurrentStateSarathi(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentStateSarathi)) {
            return false;
        }
        CurrentStateSarathi currentStateSarathi = (CurrentStateSarathi) obj;
        return l.a(this.states, currentStateSarathi.states) && l.a(this.statusCode, currentStateSarathi.statusCode) && l.a(this.statusDesc, currentStateSarathi.statusDesc);
    }

    public final List<State> getStates() {
        return this.states;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.states.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "CurrentStateSarathi(states=" + this.states + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
