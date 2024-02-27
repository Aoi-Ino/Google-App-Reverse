package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class PresState implements Serializable {
    private final String presStateCode;
    private final String presStateName;

    public PresState(String str, String str2) {
        l.f(str, "presStateCode");
        l.f(str2, "presStateName");
        this.presStateCode = str;
        this.presStateName = str2;
    }

    public static /* synthetic */ PresState copy$default(PresState presState, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = presState.presStateCode;
        }
        if ((i10 & 2) != 0) {
            str2 = presState.presStateName;
        }
        return presState.copy(str, str2);
    }

    public final String component1() {
        return this.presStateCode;
    }

    public final String component2() {
        return this.presStateName;
    }

    public final PresState copy(String str, String str2) {
        l.f(str, "presStateCode");
        l.f(str2, "presStateName");
        return new PresState(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresState)) {
            return false;
        }
        PresState presState = (PresState) obj;
        return l.a(this.presStateCode, presState.presStateCode) && l.a(this.presStateName, presState.presStateName);
    }

    public final String getPresStateCode() {
        return this.presStateCode;
    }

    public final String getPresStateName() {
        return this.presStateName;
    }

    public int hashCode() {
        return (this.presStateCode.hashCode() * 31) + this.presStateName.hashCode();
    }

    public String toString() {
        return "PresState(presStateCode=" + this.presStateCode + ", presStateName=" + this.presStateName + ')';
    }
}
