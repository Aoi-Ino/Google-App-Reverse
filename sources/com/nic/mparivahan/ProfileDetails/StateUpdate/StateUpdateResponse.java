package com.nic.mparivahan.ProfileDetails.StateUpdate;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class StateUpdateResponse {
    private final MparCitizenUser mparCitizenUser;
    private final String statusCode;
    private final String statusDesc;

    public StateUpdateResponse(MparCitizenUser mparCitizenUser2, String str, String str2) {
        l.f(mparCitizenUser2, "mparCitizenUser");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.mparCitizenUser = mparCitizenUser2;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ StateUpdateResponse copy$default(StateUpdateResponse stateUpdateResponse, MparCitizenUser mparCitizenUser2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mparCitizenUser2 = stateUpdateResponse.mparCitizenUser;
        }
        if ((i10 & 2) != 0) {
            str = stateUpdateResponse.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = stateUpdateResponse.statusDesc;
        }
        return stateUpdateResponse.copy(mparCitizenUser2, str, str2);
    }

    public final MparCitizenUser component1() {
        return this.mparCitizenUser;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final StateUpdateResponse copy(MparCitizenUser mparCitizenUser2, String str, String str2) {
        l.f(mparCitizenUser2, "mparCitizenUser");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new StateUpdateResponse(mparCitizenUser2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateUpdateResponse)) {
            return false;
        }
        StateUpdateResponse stateUpdateResponse = (StateUpdateResponse) obj;
        return l.a(this.mparCitizenUser, stateUpdateResponse.mparCitizenUser) && l.a(this.statusCode, stateUpdateResponse.statusCode) && l.a(this.statusDesc, stateUpdateResponse.statusDesc);
    }

    public final MparCitizenUser getMparCitizenUser() {
        return this.mparCitizenUser;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.mparCitizenUser.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "StateUpdateResponse(mparCitizenUser=" + this.mparCitizenUser + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
