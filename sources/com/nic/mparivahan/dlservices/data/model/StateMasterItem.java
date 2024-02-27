package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class StateMasterItem {
    @c("state_code")
    private final String stateCode;
    @c("state_name")
    private final String stateName;

    public StateMasterItem() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ StateMasterItem copy$default(StateMasterItem stateMasterItem, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stateMasterItem.stateName;
        }
        if ((i10 & 2) != 0) {
            str2 = stateMasterItem.stateCode;
        }
        return stateMasterItem.copy(str, str2);
    }

    public final String component1() {
        return this.stateName;
    }

    public final String component2() {
        return this.stateCode;
    }

    public final StateMasterItem copy(String str, String str2) {
        return new StateMasterItem(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateMasterItem)) {
            return false;
        }
        StateMasterItem stateMasterItem = (StateMasterItem) obj;
        return l.a(this.stateName, stateMasterItem.stateName) && l.a(this.stateCode, stateMasterItem.stateCode);
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getStateName() {
        return this.stateName;
    }

    public int hashCode() {
        String str = this.stateName;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stateCode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "StateMasterItem(stateName=" + this.stateName + ", stateCode=" + this.stateCode + ')';
    }

    public StateMasterItem(String str, String str2) {
        this.stateName = str;
        this.stateCode = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StateMasterItem(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
