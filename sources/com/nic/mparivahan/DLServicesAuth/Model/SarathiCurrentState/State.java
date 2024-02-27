package com.nic.mparivahan.DLServicesAuth.Model.SarathiCurrentState;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class State {
    private final String name;
    private final String stateCode;

    public State(String str, String str2) {
        l.f(str, "name");
        l.f(str2, "stateCode");
        this.name = str;
        this.stateCode = str2;
    }

    public static /* synthetic */ State copy$default(State state, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = state.name;
        }
        if ((i10 & 2) != 0) {
            str2 = state.stateCode;
        }
        return state.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.stateCode;
    }

    public final State copy(String str, String str2) {
        l.f(str, "name");
        l.f(str2, "stateCode");
        return new State(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof State)) {
            return false;
        }
        State state = (State) obj;
        return l.a(this.name, state.name) && l.a(this.stateCode, state.stateCode);
    }

    public final String getName() {
        return this.name;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.stateCode.hashCode();
    }

    public String toString() {
        return "State(name=" + this.name + ", stateCode=" + this.stateCode + ')';
    }
}
