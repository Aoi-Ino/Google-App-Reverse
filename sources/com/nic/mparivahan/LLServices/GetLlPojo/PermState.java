package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class PermState implements Serializable {
    private final String permStateCode;
    private final String permStateName;

    public PermState(String str, String str2) {
        l.f(str, "permStateCode");
        l.f(str2, "permStateName");
        this.permStateCode = str;
        this.permStateName = str2;
    }

    public static /* synthetic */ PermState copy$default(PermState permState, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = permState.permStateCode;
        }
        if ((i10 & 2) != 0) {
            str2 = permState.permStateName;
        }
        return permState.copy(str, str2);
    }

    public final String component1() {
        return this.permStateCode;
    }

    public final String component2() {
        return this.permStateName;
    }

    public final PermState copy(String str, String str2) {
        l.f(str, "permStateCode");
        l.f(str2, "permStateName");
        return new PermState(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermState)) {
            return false;
        }
        PermState permState = (PermState) obj;
        return l.a(this.permStateCode, permState.permStateCode) && l.a(this.permStateName, permState.permStateName);
    }

    public final String getPermStateCode() {
        return this.permStateCode;
    }

    public final String getPermStateName() {
        return this.permStateName;
    }

    public int hashCode() {
        return (this.permStateCode.hashCode() * 31) + this.permStateName.hashCode();
    }

    public String toString() {
        return "PermState(permStateCode=" + this.permStateCode + ", permStateName=" + this.permStateName + ')';
    }
}
