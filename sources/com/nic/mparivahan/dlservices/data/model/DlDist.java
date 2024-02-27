package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlDist {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String stCode;

    public DlDist(String str, String str2, String str3, String str4, String str5) {
        l.f(str5, "stCode");
        this.agentId = str;
        this.agentPwd = str2;
        this.agentIpAddress = str3;
        this.agentServiceName = str4;
        this.stCode = str5;
    }

    public static /* synthetic */ DlDist copy$default(DlDist dlDist, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlDist.agentId;
        }
        if ((i10 & 2) != 0) {
            str2 = dlDist.agentPwd;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = dlDist.agentIpAddress;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = dlDist.agentServiceName;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = dlDist.stCode;
        }
        return dlDist.copy(str, str6, str7, str8, str5);
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

    public final String component5() {
        return this.stCode;
    }

    public final DlDist copy(String str, String str2, String str3, String str4, String str5) {
        l.f(str5, "stCode");
        return new DlDist(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlDist)) {
            return false;
        }
        DlDist dlDist = (DlDist) obj;
        return l.a(this.agentId, dlDist.agentId) && l.a(this.agentPwd, dlDist.agentPwd) && l.a(this.agentIpAddress, dlDist.agentIpAddress) && l.a(this.agentServiceName, dlDist.agentServiceName) && l.a(this.stCode, dlDist.stCode);
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

    public final String getStCode() {
        return this.stCode;
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
        return ((hashCode3 + i10) * 31) + this.stCode.hashCode();
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

    public final void setStCode(String str) {
        l.f(str, "<set-?>");
        this.stCode = str;
    }

    public String toString() {
        return "DlDist(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", stCode=" + this.stCode + ')';
    }
}
