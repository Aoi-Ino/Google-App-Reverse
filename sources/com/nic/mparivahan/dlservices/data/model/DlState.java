package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlState {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;

    public DlState(String str, String str2, String str3, String str4) {
        this.agentId = str;
        this.agentPwd = str2;
        this.agentIpAddress = str3;
        this.agentServiceName = str4;
    }

    public static /* synthetic */ DlState copy$default(DlState dlState, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlState.agentId;
        }
        if ((i10 & 2) != 0) {
            str2 = dlState.agentPwd;
        }
        if ((i10 & 4) != 0) {
            str3 = dlState.agentIpAddress;
        }
        if ((i10 & 8) != 0) {
            str4 = dlState.agentServiceName;
        }
        return dlState.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.agentId;
    }

    public final String component2() {
        return this.agentPwd;
    }

    public final String component3() {
        return this.agentIpAddress;
    }

    public final String component4() {
        return this.agentServiceName;
    }

    public final DlState copy(String str, String str2, String str3, String str4) {
        return new DlState(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlState)) {
            return false;
        }
        DlState dlState = (DlState) obj;
        return l.a(this.agentId, dlState.agentId) && l.a(this.agentPwd, dlState.agentPwd) && l.a(this.agentIpAddress, dlState.agentIpAddress) && l.a(this.agentServiceName, dlState.agentServiceName);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    public final String getAgentPwd() {
        return this.agentPwd;
    }

    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    public int hashCode() {
        String str = this.agentId;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agentPwd;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentIpAddress;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentServiceName;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode3 + i10;
    }

    public final void setAgentId(String str) {
        this.agentId = str;
    }

    public final void setAgentIpAddress(String str) {
        this.agentIpAddress = str;
    }

    public final void setAgentPwd(String str) {
        this.agentPwd = str;
    }

    public final void setAgentServiceName(String str) {
        this.agentServiceName = str;
    }

    public String toString() {
        return "DlState(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ')';
    }
}
