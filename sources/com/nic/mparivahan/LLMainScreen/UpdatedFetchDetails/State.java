package com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class State implements Serializable {
    private final String StateName;
    private final String stCd;

    public State(String str, String str2) {
        l.f(str, "StateName");
        l.f(str2, "stCd");
        this.StateName = str;
        this.stCd = str2;
    }

    public static /* synthetic */ State copy$default(State state, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = state.StateName;
        }
        if ((i10 & 2) != 0) {
            str2 = state.stCd;
        }
        return state.copy(str, str2);
    }

    public final String component1() {
        return this.StateName;
    }

    public final String component2() {
        return this.stCd;
    }

    public final State copy(String str, String str2) {
        l.f(str, "StateName");
        l.f(str2, "stCd");
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
        return l.a(this.StateName, state.StateName) && l.a(this.stCd, state.stCd);
    }

    public final String getStCd() {
        return this.stCd;
    }

    public final String getStateName() {
        return this.StateName;
    }

    public int hashCode() {
        return (this.StateName.hashCode() * 31) + this.stCd.hashCode();
    }

    public String toString() {
        return "State(StateName=" + this.StateName + ", stCd=" + this.stCd + ')';
    }
}
