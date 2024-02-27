package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class GetStated {
    private final ArrayList<Name> states;
    private final String statusCode;
    private final String statusDesc;

    public GetStated(ArrayList<Name> arrayList, String str, String str2) {
        l.f(arrayList, "states");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.states = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ GetStated copy$default(GetStated getStated, ArrayList<Name> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = getStated.states;
        }
        if ((i10 & 2) != 0) {
            str = getStated.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = getStated.statusDesc;
        }
        return getStated.copy(arrayList, str, str2);
    }

    public final ArrayList<Name> component1() {
        return this.states;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final GetStated copy(ArrayList<Name> arrayList, String str, String str2) {
        l.f(arrayList, "states");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new GetStated(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetStated)) {
            return false;
        }
        GetStated getStated = (GetStated) obj;
        return l.a(this.states, getStated.states) && l.a(this.statusCode, getStated.statusCode) && l.a(this.statusDesc, getStated.statusDesc);
    }

    public final ArrayList<Name> getStates() {
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
        return "GetStated(states=" + this.states + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
