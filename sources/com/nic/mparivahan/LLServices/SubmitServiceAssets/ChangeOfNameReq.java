package com.nic.mparivahan.LLServices.SubmitServiceAssets;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class ChangeOfNameReq {
    private String aadharNumber;
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String dateOfBirth;
    private String effectDate;
    private String fname;
    private String fullNameEntry;
    private String learningLicence;
    private String llservicesRTO;
    private String lname;
    private String mname;
    private String reason;
    private String relationTypeEntry;
    private final ArrayList<String> selectedServices;
    private String stCd;
    private String swdfName;
    private String swdlName;
    private String swdmName;
    private String transactionType;

    public ChangeOfNameReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, ArrayList<String> arrayList) {
        String str21 = str;
        String str22 = str2;
        String str23 = str3;
        String str24 = str4;
        String str25 = str5;
        String str26 = str6;
        String str27 = str7;
        String str28 = str8;
        String str29 = str9;
        String str30 = str10;
        String str31 = str11;
        String str32 = str12;
        String str33 = str13;
        String str34 = str14;
        String str35 = str16;
        l.f(str21, "agentId");
        l.f(str22, "agentPwd");
        l.f(str23, "agentIpAddress");
        l.f(str24, "agentServiceName");
        l.f(str25, "learningLicence");
        l.f(str26, "dateOfBirth");
        l.f(str27, "stCd");
        l.f(str28, "llservicesRTO");
        l.f(str29, "aadharNumber");
        l.f(str30, "fullNameEntry");
        l.f(str31, "fname");
        l.f(str32, "mname");
        l.f(str33, "lname");
        l.f(str34, "relationTypeEntry");
        l.f(str15, "swdfName");
        l.f(str16, "swdmName");
        l.f(str17, "swdlName");
        l.f(str18, "reason");
        l.f(str19, "effectDate");
        l.f(str20, "transactionType");
        l.f(arrayList, "selectedServices");
        this.agentId = str21;
        this.agentPwd = str22;
        this.agentIpAddress = str23;
        this.agentServiceName = str24;
        this.learningLicence = str25;
        this.dateOfBirth = str26;
        this.stCd = str27;
        this.llservicesRTO = str28;
        this.aadharNumber = str29;
        this.fullNameEntry = str30;
        this.fname = str31;
        this.mname = str32;
        this.lname = str33;
        this.relationTypeEntry = str34;
        this.swdfName = str15;
        this.swdmName = str16;
        this.swdlName = str17;
        this.reason = str18;
        this.effectDate = str19;
        this.transactionType = str20;
        this.selectedServices = arrayList;
    }

    public static /* synthetic */ ChangeOfNameReq copy$default(ChangeOfNameReq changeOfNameReq, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, ArrayList arrayList, int i10, Object obj) {
        ChangeOfNameReq changeOfNameReq2 = changeOfNameReq;
        int i11 = i10;
        return changeOfNameReq.copy((i11 & 1) != 0 ? changeOfNameReq2.agentId : str, (i11 & 2) != 0 ? changeOfNameReq2.agentPwd : str2, (i11 & 4) != 0 ? changeOfNameReq2.agentIpAddress : str3, (i11 & 8) != 0 ? changeOfNameReq2.agentServiceName : str4, (i11 & 16) != 0 ? changeOfNameReq2.learningLicence : str5, (i11 & 32) != 0 ? changeOfNameReq2.dateOfBirth : str6, (i11 & 64) != 0 ? changeOfNameReq2.stCd : str7, (i11 & 128) != 0 ? changeOfNameReq2.llservicesRTO : str8, (i11 & 256) != 0 ? changeOfNameReq2.aadharNumber : str9, (i11 & 512) != 0 ? changeOfNameReq2.fullNameEntry : str10, (i11 & 1024) != 0 ? changeOfNameReq2.fname : str11, (i11 & 2048) != 0 ? changeOfNameReq2.mname : str12, (i11 & 4096) != 0 ? changeOfNameReq2.lname : str13, (i11 & 8192) != 0 ? changeOfNameReq2.relationTypeEntry : str14, (i11 & 16384) != 0 ? changeOfNameReq2.swdfName : str15, (i11 & 32768) != 0 ? changeOfNameReq2.swdmName : str16, (i11 & 65536) != 0 ? changeOfNameReq2.swdlName : str17, (i11 & 131072) != 0 ? changeOfNameReq2.reason : str18, (i11 & 262144) != 0 ? changeOfNameReq2.effectDate : str19, (i11 & 524288) != 0 ? changeOfNameReq2.transactionType : str20, (i11 & 1048576) != 0 ? changeOfNameReq2.selectedServices : arrayList);
    }

    public final String component1() {
        return this.agentId;
    }

    public final String component10() {
        return this.fullNameEntry;
    }

    public final String component11() {
        return this.fname;
    }

    public final String component12() {
        return this.mname;
    }

    public final String component13() {
        return this.lname;
    }

    public final String component14() {
        return this.relationTypeEntry;
    }

    public final String component15() {
        return this.swdfName;
    }

    public final String component16() {
        return this.swdmName;
    }

    public final String component17() {
        return this.swdlName;
    }

    public final String component18() {
        return this.reason;
    }

    public final String component19() {
        return this.effectDate;
    }

    public final String component2() {
        return this.agentPwd;
    }

    public final String component20() {
        return this.transactionType;
    }

    public final ArrayList<String> component21() {
        return this.selectedServices;
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
        return this.aadharNumber;
    }

    public final ChangeOfNameReq copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, ArrayList<String> arrayList) {
        String str21 = str;
        l.f(str21, "agentId");
        l.f(str2, "agentPwd");
        l.f(str3, "agentIpAddress");
        l.f(str4, "agentServiceName");
        l.f(str5, "learningLicence");
        l.f(str6, "dateOfBirth");
        l.f(str7, "stCd");
        l.f(str8, "llservicesRTO");
        l.f(str9, "aadharNumber");
        l.f(str10, "fullNameEntry");
        l.f(str11, "fname");
        l.f(str12, "mname");
        l.f(str13, "lname");
        l.f(str14, "relationTypeEntry");
        l.f(str15, "swdfName");
        l.f(str16, "swdmName");
        l.f(str17, "swdlName");
        l.f(str18, "reason");
        l.f(str19, "effectDate");
        l.f(str20, "transactionType");
        l.f(arrayList, "selectedServices");
        return new ChangeOfNameReq(str21, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeOfNameReq)) {
            return false;
        }
        ChangeOfNameReq changeOfNameReq = (ChangeOfNameReq) obj;
        return l.a(this.agentId, changeOfNameReq.agentId) && l.a(this.agentPwd, changeOfNameReq.agentPwd) && l.a(this.agentIpAddress, changeOfNameReq.agentIpAddress) && l.a(this.agentServiceName, changeOfNameReq.agentServiceName) && l.a(this.learningLicence, changeOfNameReq.learningLicence) && l.a(this.dateOfBirth, changeOfNameReq.dateOfBirth) && l.a(this.stCd, changeOfNameReq.stCd) && l.a(this.llservicesRTO, changeOfNameReq.llservicesRTO) && l.a(this.aadharNumber, changeOfNameReq.aadharNumber) && l.a(this.fullNameEntry, changeOfNameReq.fullNameEntry) && l.a(this.fname, changeOfNameReq.fname) && l.a(this.mname, changeOfNameReq.mname) && l.a(this.lname, changeOfNameReq.lname) && l.a(this.relationTypeEntry, changeOfNameReq.relationTypeEntry) && l.a(this.swdfName, changeOfNameReq.swdfName) && l.a(this.swdmName, changeOfNameReq.swdmName) && l.a(this.swdlName, changeOfNameReq.swdlName) && l.a(this.reason, changeOfNameReq.reason) && l.a(this.effectDate, changeOfNameReq.effectDate) && l.a(this.transactionType, changeOfNameReq.transactionType) && l.a(this.selectedServices, changeOfNameReq.selectedServices);
    }

    public final String getAadharNumber() {
        return this.aadharNumber;
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

    public final String getEffectDate() {
        return this.effectDate;
    }

    public final String getFname() {
        return this.fname;
    }

    public final String getFullNameEntry() {
        return this.fullNameEntry;
    }

    public final String getLearningLicence() {
        return this.learningLicence;
    }

    public final String getLlservicesRTO() {
        return this.llservicesRTO;
    }

    public final String getLname() {
        return this.lname;
    }

    public final String getMname() {
        return this.mname;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRelationTypeEntry() {
        return this.relationTypeEntry;
    }

    public final ArrayList<String> getSelectedServices() {
        return this.selectedServices;
    }

    public final String getStCd() {
        return this.stCd;
    }

    public final String getSwdfName() {
        return this.swdfName;
    }

    public final String getSwdlName() {
        return this.swdlName;
    }

    public final String getSwdmName() {
        return this.swdmName;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.agentId.hashCode() * 31) + this.agentPwd.hashCode()) * 31) + this.agentIpAddress.hashCode()) * 31) + this.agentServiceName.hashCode()) * 31) + this.learningLicence.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.stCd.hashCode()) * 31) + this.llservicesRTO.hashCode()) * 31) + this.aadharNumber.hashCode()) * 31) + this.fullNameEntry.hashCode()) * 31) + this.fname.hashCode()) * 31) + this.mname.hashCode()) * 31) + this.lname.hashCode()) * 31) + this.relationTypeEntry.hashCode()) * 31) + this.swdfName.hashCode()) * 31) + this.swdmName.hashCode()) * 31) + this.swdlName.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.effectDate.hashCode()) * 31) + this.transactionType.hashCode()) * 31) + this.selectedServices.hashCode();
    }

    public final void setAadharNumber(String str) {
        l.f(str, "<set-?>");
        this.aadharNumber = str;
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

    public final void setDateOfBirth(String str) {
        l.f(str, "<set-?>");
        this.dateOfBirth = str;
    }

    public final void setEffectDate(String str) {
        l.f(str, "<set-?>");
        this.effectDate = str;
    }

    public final void setFname(String str) {
        l.f(str, "<set-?>");
        this.fname = str;
    }

    public final void setFullNameEntry(String str) {
        l.f(str, "<set-?>");
        this.fullNameEntry = str;
    }

    public final void setLearningLicence(String str) {
        l.f(str, "<set-?>");
        this.learningLicence = str;
    }

    public final void setLlservicesRTO(String str) {
        l.f(str, "<set-?>");
        this.llservicesRTO = str;
    }

    public final void setLname(String str) {
        l.f(str, "<set-?>");
        this.lname = str;
    }

    public final void setMname(String str) {
        l.f(str, "<set-?>");
        this.mname = str;
    }

    public final void setReason(String str) {
        l.f(str, "<set-?>");
        this.reason = str;
    }

    public final void setRelationTypeEntry(String str) {
        l.f(str, "<set-?>");
        this.relationTypeEntry = str;
    }

    public final void setStCd(String str) {
        l.f(str, "<set-?>");
        this.stCd = str;
    }

    public final void setSwdfName(String str) {
        l.f(str, "<set-?>");
        this.swdfName = str;
    }

    public final void setSwdlName(String str) {
        l.f(str, "<set-?>");
        this.swdlName = str;
    }

    public final void setSwdmName(String str) {
        l.f(str, "<set-?>");
        this.swdmName = str;
    }

    public final void setTransactionType(String str) {
        l.f(str, "<set-?>");
        this.transactionType = str;
    }

    public String toString() {
        return "ChangeOfNameReq(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", learningLicence=" + this.learningLicence + ", dateOfBirth=" + this.dateOfBirth + ", stCd=" + this.stCd + ", llservicesRTO=" + this.llservicesRTO + ", aadharNumber=" + this.aadharNumber + ", fullNameEntry=" + this.fullNameEntry + ", fname=" + this.fname + ", mname=" + this.mname + ", lname=" + this.lname + ", relationTypeEntry=" + this.relationTypeEntry + ", swdfName=" + this.swdfName + ", swdmName=" + this.swdmName + ", swdlName=" + this.swdlName + ", reason=" + this.reason + ", effectDate=" + this.effectDate + ", transactionType=" + this.transactionType + ", selectedServices=" + this.selectedServices + ')';
    }
}
