package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class GetNatVisaIssbleForNatCodeRequest {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String natCd;

    public GetNatVisaIssbleForNatCodeRequest(String str, String str2, String str3, String str4, String str5) {
        this.natCd = str;
        this.agentId = str2;
        this.agentPwd = str3;
        this.agentIpAddress = str4;
        this.agentServiceName = str5;
    }

    public static /* synthetic */ GetNatVisaIssbleForNatCodeRequest copy$default(GetNatVisaIssbleForNatCodeRequest getNatVisaIssbleForNatCodeRequest, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getNatVisaIssbleForNatCodeRequest.natCd;
        }
        if ((i10 & 2) != 0) {
            str2 = getNatVisaIssbleForNatCodeRequest.agentId;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = getNatVisaIssbleForNatCodeRequest.agentPwd;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = getNatVisaIssbleForNatCodeRequest.agentIpAddress;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = getNatVisaIssbleForNatCodeRequest.agentServiceName;
        }
        return getNatVisaIssbleForNatCodeRequest.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.natCd;
    }

    public final String component2() {
        return this.agentId;
    }

    public final String component3() {
        return this.agentPwd;
    }

    public final String component4() {
        return this.agentIpAddress;
    }

    public final String component5() {
        return this.agentServiceName;
    }

    public final GetNatVisaIssbleForNatCodeRequest copy(String str, String str2, String str3, String str4, String str5) {
        return new GetNatVisaIssbleForNatCodeRequest(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetNatVisaIssbleForNatCodeRequest)) {
            return false;
        }
        GetNatVisaIssbleForNatCodeRequest getNatVisaIssbleForNatCodeRequest = (GetNatVisaIssbleForNatCodeRequest) obj;
        return l.a(this.natCd, getNatVisaIssbleForNatCodeRequest.natCd) && l.a(this.agentId, getNatVisaIssbleForNatCodeRequest.agentId) && l.a(this.agentPwd, getNatVisaIssbleForNatCodeRequest.agentPwd) && l.a(this.agentIpAddress, getNatVisaIssbleForNatCodeRequest.agentIpAddress) && l.a(this.agentServiceName, getNatVisaIssbleForNatCodeRequest.agentServiceName);
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

    public final String getNatCd() {
        return this.natCd;
    }

    public int hashCode() {
        String str = this.natCd;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agentId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentPwd;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentIpAddress;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.agentServiceName;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode4 + i10;
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

    public final void setNatCd(String str) {
        this.natCd = str;
    }

    public String toString() {
        return "{\"natCd\":\"" + this.natCd + "\", \"agentId\":\"" + this.agentId + "\", \"agentPwd\":\"" + this.agentPwd + "\", \"agentIpAddress\":\"" + this.agentIpAddress + "\", \"agentServiceName\":\"" + this.agentServiceName + "\"}";
    }
}
