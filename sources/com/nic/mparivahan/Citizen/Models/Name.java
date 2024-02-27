package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Name {
    private final boolean isSentinal;
    private final String name;
    private final String stateCode;

    public Name(String str, String str2, boolean z10) {
        l.f(str, "name");
        l.f(str2, "stateCode");
        this.name = str;
        this.stateCode = str2;
        this.isSentinal = z10;
    }

    public static /* synthetic */ Name copy$default(Name name2, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = name2.name;
        }
        if ((i10 & 2) != 0) {
            str2 = name2.stateCode;
        }
        if ((i10 & 4) != 0) {
            z10 = name2.isSentinal;
        }
        return name2.copy(str, str2, z10);
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

    public final Name copy(String str, String str2, boolean z10) {
        l.f(str, "name");
        l.f(str2, "stateCode");
        return new Name(str, str2, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name2 = (Name) obj;
        return l.a(this.name, name2.name) && l.a(this.stateCode, name2.stateCode) && this.isSentinal == name2.isSentinal;
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
        if (z10) {
            z10 = true;
        }
        return hashCode + (z10 ? 1 : 0);
    }

    public final boolean isSentinal() {
        return this.isSentinal;
    }

    public String toString() {
        return "Name(name=" + this.name + ", stateCode=" + this.stateCode + ", isSentinal=" + this.isSentinal + ')';
    }
}
