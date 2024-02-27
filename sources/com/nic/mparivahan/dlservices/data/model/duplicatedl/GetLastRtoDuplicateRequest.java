package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class GetLastRtoDuplicateRequest {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String dlno;
    private String dob;

    public GetLastRtoDuplicateRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        this.dlno = str;
        this.dob = str2;
        this.agentId = str3;
        this.agentPwd = str4;
        this.agentIpAddress = str5;
        this.agentServiceName = str6;
    }

    public static /* synthetic */ GetLastRtoDuplicateRequest copy$default(GetLastRtoDuplicateRequest getLastRtoDuplicateRequest, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getLastRtoDuplicateRequest.dlno;
        }
        if ((i10 & 2) != 0) {
            str2 = getLastRtoDuplicateRequest.dob;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = getLastRtoDuplicateRequest.agentId;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = getLastRtoDuplicateRequest.agentPwd;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = getLastRtoDuplicateRequest.agentIpAddress;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = getLastRtoDuplicateRequest.agentServiceName;
        }
        return getLastRtoDuplicateRequest.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.dlno;
    }

    public final String component2() {
        return this.dob;
    }

    public final String component3() {
        return this.agentId;
    }

    public final String component4() {
        return this.agentPwd;
    }

    public final String component5() {
        return this.agentIpAddress;
    }

    public final String component6() {
        return this.agentServiceName;
    }

    public final GetLastRtoDuplicateRequest copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new GetLastRtoDuplicateRequest(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLastRtoDuplicateRequest)) {
            return false;
        }
        GetLastRtoDuplicateRequest getLastRtoDuplicateRequest = (GetLastRtoDuplicateRequest) obj;
        return l.a(this.dlno, getLastRtoDuplicateRequest.dlno) && l.a(this.dob, getLastRtoDuplicateRequest.dob) && l.a(this.agentId, getLastRtoDuplicateRequest.agentId) && l.a(this.agentPwd, getLastRtoDuplicateRequest.agentPwd) && l.a(this.agentIpAddress, getLastRtoDuplicateRequest.agentIpAddress) && l.a(this.agentServiceName, getLastRtoDuplicateRequest.agentServiceName);
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

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDob() {
        return this.dob;
    }

    public int hashCode() {
        String str = this.dlno;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dob;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentPwd;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.agentIpAddress;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.agentServiceName;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode5 + i10;
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

    public final void setDlno(String str) {
        this.dlno = str;
    }

    public final void setDob(String str) {
        this.dob = str;
    }

    public String toString() {
        return "{\"dlno\":\"" + this.dlno + "\", \"dob\":\"" + this.dob + "\", \"agentId\":\"" + this.agentId + "\", \"agentPwd\":\"" + this.agentPwd + "\", \"agentIpAddress\":\"" + this.agentIpAddress + "\", \"agentServiceName\":\"" + this.agentServiceName + "\"}";
    }
}
