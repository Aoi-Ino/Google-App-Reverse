package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class StateMaster {
    private final ArrayList<State> states;
    private final String statusCode;
    private final String statusDesc;

    public StateMaster(ArrayList<State> arrayList, String str, String str2) {
        l.f(arrayList, "states");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.states = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ StateMaster copy$default(StateMaster stateMaster, ArrayList<State> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = stateMaster.states;
        }
        if ((i10 & 2) != 0) {
            str = stateMaster.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = stateMaster.statusDesc;
        }
        return stateMaster.copy(arrayList, str, str2);
    }

    public final ArrayList<State> component1() {
        return this.states;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final StateMaster copy(ArrayList<State> arrayList, String str, String str2) {
        l.f(arrayList, "states");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new StateMaster(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateMaster)) {
            return false;
        }
        StateMaster stateMaster = (StateMaster) obj;
        return l.a(this.states, stateMaster.states) && l.a(this.statusCode, stateMaster.statusCode) && l.a(this.statusDesc, stateMaster.statusDesc);
    }

    public final ArrayList<State> getStates() {
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
        return "StateMaster(states=" + this.states + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
