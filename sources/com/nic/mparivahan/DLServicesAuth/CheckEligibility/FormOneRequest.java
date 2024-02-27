package com.nic.mparivahan.DLServicesAuth.CheckEligibility;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class FormOneRequest {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private ArrayList<Integer> reqTrans;
    private String rtoCode;

    public FormOneRequest(String str, String str2, String str3, String str4, String str5, ArrayList<Integer> arrayList) {
        l.f(str, "agentId");
        l.f(str2, "agentPwd");
        l.f(str3, "agentIpAddress");
        l.f(str4, "agentServiceName");
        l.f(str5, "rtoCode");
        l.f(arrayList, "reqTrans");
        this.agentId = str;
        this.agentPwd = str2;
        this.agentIpAddress = str3;
        this.agentServiceName = str4;
        this.rtoCode = str5;
        this.reqTrans = arrayList;
    }

    public static /* synthetic */ FormOneRequest copy$default(FormOneRequest formOneRequest, String str, String str2, String str3, String str4, String str5, ArrayList<Integer> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = formOneRequest.agentId;
        }
        if ((i10 & 2) != 0) {
            str2 = formOneRequest.agentPwd;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = formOneRequest.agentIpAddress;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = formOneRequest.agentServiceName;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = formOneRequest.rtoCode;
        }
        String str9 = str5;
        if ((i10 & 32) != 0) {
            arrayList = formOneRequest.reqTrans;
        }
        return formOneRequest.copy(str, str6, str7, str8, str9, arrayList);
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
        return this.rtoCode;
    }

    public final ArrayList<Integer> component6() {
        return this.reqTrans;
    }

    public final FormOneRequest copy(String str, String str2, String str3, String str4, String str5, ArrayList<Integer> arrayList) {
        l.f(str, "agentId");
        l.f(str2, "agentPwd");
        l.f(str3, "agentIpAddress");
        l.f(str4, "agentServiceName");
        l.f(str5, "rtoCode");
        l.f(arrayList, "reqTrans");
        return new FormOneRequest(str, str2, str3, str4, str5, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormOneRequest)) {
            return false;
        }
        FormOneRequest formOneRequest = (FormOneRequest) obj;
        return l.a(this.agentId, formOneRequest.agentId) && l.a(this.agentPwd, formOneRequest.agentPwd) && l.a(this.agentIpAddress, formOneRequest.agentIpAddress) && l.a(this.agentServiceName, formOneRequest.agentServiceName) && l.a(this.rtoCode, formOneRequest.rtoCode) && l.a(this.reqTrans, formOneRequest.reqTrans);
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

    public final ArrayList<Integer> getReqTrans() {
        return this.reqTrans;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public int hashCode() {
        return (((((((((this.agentId.hashCode() * 31) + this.agentPwd.hashCode()) * 31) + this.agentIpAddress.hashCode()) * 31) + this.agentServiceName.hashCode()) * 31) + this.rtoCode.hashCode()) * 31) + this.reqTrans.hashCode();
    }

    public final void setAgentId(String str) {
        l.f(str, "<set-?>");
        this.agentId = str;
    }

    public final void setAgentIpAddress(String str) {
        l.f(str, "<set-?>");
        this.agentIpAddress = str;
    }

    public final void setAgentPwd(String str) {
        l.f(str, "<set-?>");
        this.agentPwd = str;
    }

    public final void setAgentServiceName(String str) {
        l.f(str, "<set-?>");
        this.agentServiceName = str;
    }

    public final void setReqTrans(ArrayList<Integer> arrayList) {
        l.f(arrayList, "<set-?>");
        this.reqTrans = arrayList;
    }

    public final void setRtoCode(String str) {
        l.f(str, "<set-?>");
        this.rtoCode = str;
    }

    public String toString() {
        return "FormOneRequest(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", rtoCode=" + this.rtoCode + ", reqTrans=" + this.reqTrans + ')';
    }
}
