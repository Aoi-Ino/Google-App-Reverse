package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class TmState {
    private final String descr;
    private final String state_code;

    public TmState(String str, String str2) {
        l.f(str, "descr");
        l.f(str2, "state_code");
        this.descr = str;
        this.state_code = str2;
    }

    public static /* synthetic */ TmState copy$default(TmState tmState, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tmState.descr;
        }
        if ((i10 & 2) != 0) {
            str2 = tmState.state_code;
        }
        return tmState.copy(str, str2);
    }

    public final String component1() {
        return this.descr;
    }

    public final String component2() {
        return this.state_code;
    }

    public final TmState copy(String str, String str2) {
        l.f(str, "descr");
        l.f(str2, "state_code");
        return new TmState(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmState)) {
            return false;
        }
        TmState tmState = (TmState) obj;
        return l.a(this.descr, tmState.descr) && l.a(this.state_code, tmState.state_code);
    }

    public final String getDescr() {
        return this.descr;
    }

    public final String getState_code() {
        return this.state_code;
    }

    public int hashCode() {
        return (this.descr.hashCode() * 31) + this.state_code.hashCode();
    }

    public String toString() {
        return "TmState(descr=" + this.descr + ", state_code=" + this.state_code + ')';
    }
}
