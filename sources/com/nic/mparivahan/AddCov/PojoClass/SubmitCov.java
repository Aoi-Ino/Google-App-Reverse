package com.nic.mparivahan.AddCov.PojoClass;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class SubmitCov {
    private String agentId;
    private final String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String applDob;
    private String applNumber;
    private final ArrayList<String> selectedCovsList;
    private String stCode;

    public SubmitCov(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList<String> arrayList) {
        l.f(str, "agentId");
        l.f(str2, "agentPwd");
        l.f(str3, "agentIpAddress");
        l.f(str4, "agentServiceName");
        l.f(str5, "applNumber");
        l.f(str6, "applDob");
        l.f(str7, "stCode");
        l.f(arrayList, "selectedCovsList");
        this.agentId = str;
        this.agentPwd = str2;
        this.agentIpAddress = str3;
        this.agentServiceName = str4;
        this.applNumber = str5;
        this.applDob = str6;
        this.stCode = str7;
        this.selectedCovsList = arrayList;
    }

    public static /* synthetic */ SubmitCov copy$default(SubmitCov submitCov, String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, int i10, Object obj) {
        SubmitCov submitCov2 = submitCov;
        int i11 = i10;
        return submitCov.copy((i11 & 1) != 0 ? submitCov2.agentId : str, (i11 & 2) != 0 ? submitCov2.agentPwd : str2, (i11 & 4) != 0 ? submitCov2.agentIpAddress : str3, (i11 & 8) != 0 ? submitCov2.agentServiceName : str4, (i11 & 16) != 0 ? submitCov2.applNumber : str5, (i11 & 32) != 0 ? submitCov2.applDob : str6, (i11 & 64) != 0 ? submitCov2.stCode : str7, (i11 & 128) != 0 ? submitCov2.selectedCovsList : arrayList);
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
        return this.applNumber;
    }

    public final String component6() {
        return this.applDob;
    }

    public final String component7() {
        return this.stCode;
    }

    public final ArrayList<String> component8() {
        return this.selectedCovsList;
    }

    public final SubmitCov copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList<String> arrayList) {
        l.f(str, "agentId");
        l.f(str2, "agentPwd");
        l.f(str3, "agentIpAddress");
        l.f(str4, "agentServiceName");
        l.f(str5, "applNumber");
        String str8 = str6;
        l.f(str8, "applDob");
        String str9 = str7;
        l.f(str9, "stCode");
        ArrayList<String> arrayList2 = arrayList;
        l.f(arrayList2, "selectedCovsList");
        return new SubmitCov(str, str2, str3, str4, str5, str8, str9, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitCov)) {
            return false;
        }
        SubmitCov submitCov = (SubmitCov) obj;
        return l.a(this.agentId, submitCov.agentId) && l.a(this.agentPwd, submitCov.agentPwd) && l.a(this.agentIpAddress, submitCov.agentIpAddress) && l.a(this.agentServiceName, submitCov.agentServiceName) && l.a(this.applNumber, submitCov.applNumber) && l.a(this.applDob, submitCov.applDob) && l.a(this.stCode, submitCov.stCode) && l.a(this.selectedCovsList, submitCov.selectedCovsList);
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

    public final String getApplDob() {
        return this.applDob;
    }

    public final String getApplNumber() {
        return this.applNumber;
    }

    public final ArrayList<String> getSelectedCovsList() {
        return this.selectedCovsList;
    }

    public final String getStCode() {
        return this.stCode;
    }

    public int hashCode() {
        return (((((((((((((this.agentId.hashCode() * 31) + this.agentPwd.hashCode()) * 31) + this.agentIpAddress.hashCode()) * 31) + this.agentServiceName.hashCode()) * 31) + this.applNumber.hashCode()) * 31) + this.applDob.hashCode()) * 31) + this.stCode.hashCode()) * 31) + this.selectedCovsList.hashCode();
    }

    public final void setAgentId(String str) {
        l.f(str, "<set-?>");
        this.agentId = str;
    }

    public final void setAgentPwd(String str) {
        l.f(str, "<set-?>");
        this.agentPwd = str;
    }

    public final void setAgentServiceName(String str) {
        l.f(str, "<set-?>");
        this.agentServiceName = str;
    }

    public final void setApplDob(String str) {
        l.f(str, "<set-?>");
        this.applDob = str;
    }

    public final void setApplNumber(String str) {
        l.f(str, "<set-?>");
        this.applNumber = str;
    }

    public final void setStCode(String str) {
        l.f(str, "<set-?>");
        this.stCode = str;
    }

    public String toString() {
        return "SubmitCov(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", applNumber=" + this.applNumber + ", applDob=" + this.applDob + ", stCode=" + this.stCode + ", selectedCovsList=" + this.selectedCovsList + ')';
    }
}
