package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class StateResponse {
    @c("StateMaster")
    private final List<StateMasterItem> stateMaster;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public StateResponse() {
        this((String) null, (String) null, (List) null, 7, (g) null);
    }

    public static /* synthetic */ StateResponse copy$default(StateResponse stateResponse, String str, String str2, List<StateMasterItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stateResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = stateResponse.statusDesc;
        }
        if ((i10 & 4) != 0) {
            list = stateResponse.stateMaster;
        }
        return stateResponse.copy(str, str2, list);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final List<StateMasterItem> component3() {
        return this.stateMaster;
    }

    public final StateResponse copy(String str, String str2, List<StateMasterItem> list) {
        return new StateResponse(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateResponse)) {
            return false;
        }
        StateResponse stateResponse = (StateResponse) obj;
        return l.a(this.statusCode, stateResponse.statusCode) && l.a(this.statusDesc, stateResponse.statusDesc) && l.a(this.stateMaster, stateResponse.stateMaster);
    }

    public final List<StateMasterItem> getStateMaster() {
        return this.stateMaster;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        String str = this.statusCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusDesc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<StateMasterItem> list = this.stateMaster;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "StateResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", stateMaster=" + this.stateMaster + ')';
    }

    public StateResponse(String str, String str2, List<StateMasterItem> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.stateMaster = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StateResponse(String str, String str2, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list);
    }
}
