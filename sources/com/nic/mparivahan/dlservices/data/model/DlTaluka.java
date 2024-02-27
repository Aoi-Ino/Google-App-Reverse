package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlTaluka {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String distCode;
    private String stCode;

    public DlTaluka(String str, String str2, String str3, String str4, String str5, String str6) {
        l.f(str5, "stCode");
        l.f(str6, "distCode");
        this.agentId = str;
        this.agentPwd = str2;
        this.agentIpAddress = str3;
        this.agentServiceName = str4;
        this.stCode = str5;
        this.distCode = str6;
    }

    public static /* synthetic */ DlTaluka copy$default(DlTaluka dlTaluka, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlTaluka.agentId;
        }
        if ((i10 & 2) != 0) {
            str2 = dlTaluka.agentPwd;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = dlTaluka.agentIpAddress;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = dlTaluka.agentServiceName;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = dlTaluka.stCode;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = dlTaluka.distCode;
        }
        return dlTaluka.copy(str, str7, str8, str9, str10, str6);
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

    public final String component6() {
        return this.distCode;
    }

    public final DlTaluka copy(String str, String str2, String str3, String str4, String str5, String str6) {
        l.f(str5, "stCode");
        l.f(str6, "distCode");
        return new DlTaluka(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlTaluka)) {
            return false;
        }
        DlTaluka dlTaluka = (DlTaluka) obj;
        return l.a(this.agentId, dlTaluka.agentId) && l.a(this.agentPwd, dlTaluka.agentPwd) && l.a(this.agentIpAddress, dlTaluka.agentIpAddress) && l.a(this.agentServiceName, dlTaluka.agentServiceName) && l.a(this.stCode, dlTaluka.stCode) && l.a(this.distCode, dlTaluka.distCode);
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

    public final String getDistCode() {
        return this.distCode;
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
        return ((((hashCode3 + i10) * 31) + this.stCode.hashCode()) * 31) + this.distCode.hashCode();
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

    public final void setDistCode(String str) {
        l.f(str, "<set-?>");
        this.distCode = str;
    }

    public final void setStCode(String str) {
        l.f(str, "<set-?>");
        this.stCode = str;
    }

    public String toString() {
        return "DlTaluka(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", stCode=" + this.stCode + ", distCode=" + this.distCode + ')';
    }
}
