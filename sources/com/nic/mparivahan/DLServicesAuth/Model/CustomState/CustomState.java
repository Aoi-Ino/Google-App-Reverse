package com.nic.mparivahan.DLServicesAuth.Model.CustomState;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class CustomState {
    private final ArrayList<CustomSt> customSt;
    private final String status_code;
    private final String status_desc;

    public CustomState(ArrayList<CustomSt> arrayList, String str, String str2) {
        l.f(arrayList, "customSt");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        this.customSt = arrayList;
        this.status_code = str;
        this.status_desc = str2;
    }

    public static /* synthetic */ CustomState copy$default(CustomState customState, ArrayList<CustomSt> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = customState.customSt;
        }
        if ((i10 & 2) != 0) {
            str = customState.status_code;
        }
        if ((i10 & 4) != 0) {
            str2 = customState.status_desc;
        }
        return customState.copy(arrayList, str, str2);
    }

    public final ArrayList<CustomSt> component1() {
        return this.customSt;
    }

    public final String component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.status_desc;
    }

    public final CustomState copy(ArrayList<CustomSt> arrayList, String str, String str2) {
        l.f(arrayList, "customSt");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        return new CustomState(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomState)) {
            return false;
        }
        CustomState customState = (CustomState) obj;
        return l.a(this.customSt, customState.customSt) && l.a(this.status_code, customState.status_code) && l.a(this.status_desc, customState.status_desc);
    }

    public final ArrayList<CustomSt> getCustomSt() {
        return this.customSt;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.customSt.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "CustomState(customSt=" + this.customSt + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
