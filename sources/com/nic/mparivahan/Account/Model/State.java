package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class State implements Comparable<State> {
    private final boolean isAndroid;
    private final int isNgmp;
    private final boolean isSentinal;
    private final String name;
    private final String stateCode;

    public State(String str, String str2, boolean z10, boolean z11, int i10) {
        l.f(str, "name");
        l.f(str2, "stateCode");
        this.name = str;
        this.stateCode = str2;
        this.isSentinal = z10;
        this.isAndroid = z11;
        this.isNgmp = i10;
    }

    public static /* synthetic */ State copy$default(State state, String str, String str2, boolean z10, boolean z11, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = state.name;
        }
        if ((i11 & 2) != 0) {
            str2 = state.stateCode;
        }
        String str3 = str2;
        if ((i11 & 4) != 0) {
            z10 = state.isSentinal;
        }
        boolean z12 = z10;
        if ((i11 & 8) != 0) {
            z11 = state.isAndroid;
        }
        boolean z13 = z11;
        if ((i11 & 16) != 0) {
            i10 = state.isNgmp;
        }
        return state.copy(str, str3, z12, z13, i10);
    }

    public int compareTo(State state) {
        l.f(state, "other");
        return this.name.compareTo(state.name);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.stateCode;
    }

    public final boolean component3() {
        return this.isSentinal;
    }

    public final boolean component4() {
        return this.isAndroid;
    }

    public final int component5() {
        return this.isNgmp;
    }

    public final State copy(String str, String str2, boolean z10, boolean z11, int i10) {
        l.f(str, "name");
        l.f(str2, "stateCode");
        return new State(str, str2, z10, z11, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof State)) {
            return false;
        }
        State state = (State) obj;
        return l.a(this.name, state.name) && l.a(this.stateCode, state.stateCode) && this.isSentinal == state.isSentinal && this.isAndroid == state.isAndroid && this.isNgmp == state.isNgmp;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.stateCode.hashCode()) * 31;
        boolean z10 = this.isSentinal;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (hashCode + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.isAndroid;
        if (!z12) {
            z11 = z12;
        }
        return ((i10 + (z11 ? 1 : 0)) * 31) + Integer.hashCode(this.isNgmp);
    }

    public final boolean isAndroid() {
        return this.isAndroid;
    }

    public final int isNgmp() {
        return this.isNgmp;
    }

    public final boolean isSentinal() {
        return this.isSentinal;
    }

    public String toString() {
        return "State(name=" + this.name + ", stateCode=" + this.stateCode + ", isSentinal=" + this.isSentinal + ", isAndroid=" + this.isAndroid + ", isNgmp=" + this.isNgmp + ')';
    }
}
