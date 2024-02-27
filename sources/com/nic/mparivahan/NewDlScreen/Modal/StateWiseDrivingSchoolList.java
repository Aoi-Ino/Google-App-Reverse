package com.nic.mparivahan.NewDlScreen.Modal;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class StateWiseDrivingSchoolList {
    @c("drivingSchool_code")
    private final String code;
    @c("drivingSchool_name")
    private final String name;

    public StateWiseDrivingSchoolList() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ StateWiseDrivingSchoolList copy$default(StateWiseDrivingSchoolList stateWiseDrivingSchoolList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stateWiseDrivingSchoolList.name;
        }
        if ((i10 & 2) != 0) {
            str2 = stateWiseDrivingSchoolList.code;
        }
        return stateWiseDrivingSchoolList.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.code;
    }

    public final StateWiseDrivingSchoolList copy(String str, String str2) {
        l.f(str, "name");
        l.f(str2, "code");
        return new StateWiseDrivingSchoolList(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateWiseDrivingSchoolList)) {
            return false;
        }
        StateWiseDrivingSchoolList stateWiseDrivingSchoolList = (StateWiseDrivingSchoolList) obj;
        return l.a(this.name, stateWiseDrivingSchoolList.name) && l.a(this.code, stateWiseDrivingSchoolList.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.code.hashCode();
    }

    public String toString() {
        return "StateWiseDrivingSchoolList(name=" + this.name + ", code=" + this.code + ')';
    }

    public StateWiseDrivingSchoolList(String str, String str2) {
        l.f(str, "name");
        l.f(str2, "code");
        this.name = str;
        this.code = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StateWiseDrivingSchoolList(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
