package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class StateX {
    private final int egovCode;

    /* renamed from: id  reason: collision with root package name */
    private final int f7643id;
    private final int isActive;
    private final Object logo;
    private final String name;
    private final int s4Enabled;
    private final String stateCode;
    private final int v4Enabled;

    public StateX(int i10, int i11, int i12, Object obj, String str, int i13, String str2, int i14) {
        l.f(obj, "logo");
        l.f(str, "name");
        l.f(str2, "stateCode");
        this.egovCode = i10;
        this.f7643id = i11;
        this.isActive = i12;
        this.logo = obj;
        this.name = str;
        this.s4Enabled = i13;
        this.stateCode = str2;
        this.v4Enabled = i14;
    }

    public static /* synthetic */ StateX copy$default(StateX stateX, int i10, int i11, int i12, Object obj, String str, int i13, String str2, int i14, int i15, Object obj2) {
        StateX stateX2 = stateX;
        int i16 = i15;
        return stateX.copy((i16 & 1) != 0 ? stateX2.egovCode : i10, (i16 & 2) != 0 ? stateX2.f7643id : i11, (i16 & 4) != 0 ? stateX2.isActive : i12, (i16 & 8) != 0 ? stateX2.logo : obj, (i16 & 16) != 0 ? stateX2.name : str, (i16 & 32) != 0 ? stateX2.s4Enabled : i13, (i16 & 64) != 0 ? stateX2.stateCode : str2, (i16 & 128) != 0 ? stateX2.v4Enabled : i14);
    }

    public final int component1() {
        return this.egovCode;
    }

    public final int component2() {
        return this.f7643id;
    }

    public final int component3() {
        return this.isActive;
    }

    public final Object component4() {
        return this.logo;
    }

    public final String component5() {
        return this.name;
    }

    public final int component6() {
        return this.s4Enabled;
    }

    public final String component7() {
        return this.stateCode;
    }

    public final int component8() {
        return this.v4Enabled;
    }

    public final StateX copy(int i10, int i11, int i12, Object obj, String str, int i13, String str2, int i14) {
        l.f(obj, "logo");
        l.f(str, "name");
        String str3 = str2;
        l.f(str3, "stateCode");
        return new StateX(i10, i11, i12, obj, str, i13, str3, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateX)) {
            return false;
        }
        StateX stateX = (StateX) obj;
        return this.egovCode == stateX.egovCode && this.f7643id == stateX.f7643id && this.isActive == stateX.isActive && l.a(this.logo, stateX.logo) && l.a(this.name, stateX.name) && this.s4Enabled == stateX.s4Enabled && l.a(this.stateCode, stateX.stateCode) && this.v4Enabled == stateX.v4Enabled;
    }

    public final int getEgovCode() {
        return this.egovCode;
    }

    public final int getId() {
        return this.f7643id;
    }

    public final Object getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public final int getS4Enabled() {
        return this.s4Enabled;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final int getV4Enabled() {
        return this.v4Enabled;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.egovCode) * 31) + Integer.hashCode(this.f7643id)) * 31) + Integer.hashCode(this.isActive)) * 31) + this.logo.hashCode()) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.s4Enabled)) * 31) + this.stateCode.hashCode()) * 31) + Integer.hashCode(this.v4Enabled);
    }

    public final int isActive() {
        return this.isActive;
    }

    public String toString() {
        return "StateX(egovCode=" + this.egovCode + ", id=" + this.f7643id + ", isActive=" + this.isActive + ", logo=" + this.logo + ", name=" + this.name + ", s4Enabled=" + this.s4Enabled + ", stateCode=" + this.stateCode + ", v4Enabled=" + this.v4Enabled + ')';
    }
}
