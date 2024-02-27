package com.nic.mparivahan.LLServices.SubmitServiceAssets;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class DuplicateLlRequest {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String dateOfBirth;
    private String learningLicence;
    private String llservicesRTO;
    private String reasonForDuplicate;
    private final ArrayList<String> selectedServices;
    private final String stCd;
    private final String transactionType;

    public DuplicateLlRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList<String> arrayList) {
        l.f(str4, "agentServiceName");
        l.f(str5, "learningLicence");
        l.f(str6, "dateOfBirth");
        l.f(str7, "stCd");
        l.f(str8, "llservicesRTO");
        l.f(str9, "transactionType");
        l.f(str10, "reasonForDuplicate");
        l.f(arrayList, "selectedServices");
        this.agentId = str;
        this.agentPwd = str2;
        this.agentIpAddress = str3;
        this.agentServiceName = str4;
        this.learningLicence = str5;
        this.dateOfBirth = str6;
        this.stCd = str7;
        this.llservicesRTO = str8;
        this.transactionType = str9;
        this.reasonForDuplicate = str10;
        this.selectedServices = arrayList;
    }

    public static /* synthetic */ DuplicateLlRequest copy$default(DuplicateLlRequest duplicateLlRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList arrayList, int i10, Object obj) {
        DuplicateLlRequest duplicateLlRequest2 = duplicateLlRequest;
        int i11 = i10;
        return duplicateLlRequest.copy((i11 & 1) != 0 ? duplicateLlRequest2.agentId : str, (i11 & 2) != 0 ? duplicateLlRequest2.agentPwd : str2, (i11 & 4) != 0 ? duplicateLlRequest2.agentIpAddress : str3, (i11 & 8) != 0 ? duplicateLlRequest2.agentServiceName : str4, (i11 & 16) != 0 ? duplicateLlRequest2.learningLicence : str5, (i11 & 32) != 0 ? duplicateLlRequest2.dateOfBirth : str6, (i11 & 64) != 0 ? duplicateLlRequest2.stCd : str7, (i11 & 128) != 0 ? duplicateLlRequest2.llservicesRTO : str8, (i11 & 256) != 0 ? duplicateLlRequest2.transactionType : str9, (i11 & 512) != 0 ? duplicateLlRequest2.reasonForDuplicate : str10, (i11 & 1024) != 0 ? duplicateLlRequest2.selectedServices : arrayList);
    }

    public final String component1() {
        return this.agentId;
    }

    public final String component10() {
        return this.reasonForDuplicate;
    }

    public final ArrayList<String> component11() {
        return this.selectedServices;
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
        return this.learningLicence;
    }

    public final String component6() {
        return this.dateOfBirth;
    }

    public final String component7() {
        return this.stCd;
    }

    public final String component8() {
        return this.llservicesRTO;
    }

    public final String component9() {
        return this.transactionType;
    }

    public final DuplicateLlRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList<String> arrayList) {
        String str11 = str4;
        l.f(str11, "agentServiceName");
        String str12 = str5;
        l.f(str12, "learningLicence");
        String str13 = str6;
        l.f(str13, "dateOfBirth");
        String str14 = str7;
        l.f(str14, "stCd");
        String str15 = str8;
        l.f(str15, "llservicesRTO");
        String str16 = str9;
        l.f(str16, "transactionType");
        String str17 = str10;
        l.f(str17, "reasonForDuplicate");
        ArrayList<String> arrayList2 = arrayList;
        l.f(arrayList2, "selectedServices");
        return new DuplicateLlRequest(str, str2, str3, str11, str12, str13, str14, str15, str16, str17, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuplicateLlRequest)) {
            return false;
        }
        DuplicateLlRequest duplicateLlRequest = (DuplicateLlRequest) obj;
        return l.a(this.agentId, duplicateLlRequest.agentId) && l.a(this.agentPwd, duplicateLlRequest.agentPwd) && l.a(this.agentIpAddress, duplicateLlRequest.agentIpAddress) && l.a(this.agentServiceName, duplicateLlRequest.agentServiceName) && l.a(this.learningLicence, duplicateLlRequest.learningLicence) && l.a(this.dateOfBirth, duplicateLlRequest.dateOfBirth) && l.a(this.stCd, duplicateLlRequest.stCd) && l.a(this.llservicesRTO, duplicateLlRequest.llservicesRTO) && l.a(this.transactionType, duplicateLlRequest.transactionType) && l.a(this.reasonForDuplicate, duplicateLlRequest.reasonForDuplicate) && l.a(this.selectedServices, duplicateLlRequest.selectedServices);
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

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getLearningLicence() {
        return this.learningLicence;
    }

    public final String getLlservicesRTO() {
        return this.llservicesRTO;
    }

    public final String getReasonForDuplicate() {
        return this.reasonForDuplicate;
    }

    public final ArrayList<String> getSelectedServices() {
        return this.selectedServices;
    }

    public final String getStCd() {
        return this.stCd;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        String str = this.agentId;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agentPwd;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentIpAddress;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((((((((((((((((hashCode2 + i10) * 31) + this.agentServiceName.hashCode()) * 31) + this.learningLicence.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.stCd.hashCode()) * 31) + this.llservicesRTO.hashCode()) * 31) + this.transactionType.hashCode()) * 31) + this.reasonForDuplicate.hashCode()) * 31) + this.selectedServices.hashCode();
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
        l.f(str, "<set-?>");
        this.agentServiceName = str;
    }

    public final void setDateOfBirth(String str) {
        l.f(str, "<set-?>");
        this.dateOfBirth = str;
    }

    public final void setLearningLicence(String str) {
        l.f(str, "<set-?>");
        this.learningLicence = str;
    }

    public final void setLlservicesRTO(String str) {
        l.f(str, "<set-?>");
        this.llservicesRTO = str;
    }

    public final void setReasonForDuplicate(String str) {
        l.f(str, "<set-?>");
        this.reasonForDuplicate = str;
    }

    public String toString() {
        return "DuplicateLlRequest(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", learningLicence=" + this.learningLicence + ", dateOfBirth=" + this.dateOfBirth + ", stCd=" + this.stCd + ", llservicesRTO=" + this.llservicesRTO + ", transactionType=" + this.transactionType + ", reasonForDuplicate=" + this.reasonForDuplicate + ", selectedServices=" + this.selectedServices + ')';
    }
}
