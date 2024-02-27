package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class GetEnableStateModel {
    private final ArrayList<StateX> states;
    private final String statusCode;
    private final String statusDesc;

    public GetEnableStateModel(ArrayList<StateX> arrayList, String str, String str2) {
        l.f(arrayList, "states");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.states = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ GetEnableStateModel copy$default(GetEnableStateModel getEnableStateModel, ArrayList<StateX> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = getEnableStateModel.states;
        }
        if ((i10 & 2) != 0) {
            str = getEnableStateModel.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = getEnableStateModel.statusDesc;
        }
        return getEnableStateModel.copy(arrayList, str, str2);
    }

    public final ArrayList<StateX> component1() {
        return this.states;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final GetEnableStateModel copy(ArrayList<StateX> arrayList, String str, String str2) {
        l.f(arrayList, "states");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new GetEnableStateModel(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetEnableStateModel)) {
            return false;
        }
        GetEnableStateModel getEnableStateModel = (GetEnableStateModel) obj;
        return l.a(this.states, getEnableStateModel.states) && l.a(this.statusCode, getEnableStateModel.statusCode) && l.a(this.statusDesc, getEnableStateModel.statusDesc);
    }

    public final ArrayList<StateX> getStates() {
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
        return "GetEnableStateModel(states=" + this.states + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
