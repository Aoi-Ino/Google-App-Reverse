package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlVillageOrTown {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String distCode;
    private String stCode;
    private String subDistCode;
    private String villageOrTown;

    public DlVillageOrTown(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        l.f(str5, "stCode");
        l.f(str6, "distCode");
        l.f(str7, "subDistCode");
        l.f(str8, "villageOrTown");
        this.agentId = str;
        this.agentPwd = str2;
        this.agentIpAddress = str3;
        this.agentServiceName = str4;
        this.stCode = str5;
        this.distCode = str6;
        this.subDistCode = str7;
        this.villageOrTown = str8;
    }

    public static /* synthetic */ DlVillageOrTown copy$default(DlVillageOrTown dlVillageOrTown, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
        DlVillageOrTown dlVillageOrTown2 = dlVillageOrTown;
        int i11 = i10;
        return dlVillageOrTown.copy((i11 & 1) != 0 ? dlVillageOrTown2.agentId : str, (i11 & 2) != 0 ? dlVillageOrTown2.agentPwd : str2, (i11 & 4) != 0 ? dlVillageOrTown2.agentIpAddress : str3, (i11 & 8) != 0 ? dlVillageOrTown2.agentServiceName : str4, (i11 & 16) != 0 ? dlVillageOrTown2.stCode : str5, (i11 & 32) != 0 ? dlVillageOrTown2.distCode : str6, (i11 & 64) != 0 ? dlVillageOrTown2.subDistCode : str7, (i11 & 128) != 0 ? dlVillageOrTown2.villageOrTown : str8);
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

    public final String component7() {
        return this.subDistCode;
    }

    public final String component8() {
        return this.villageOrTown;
    }

    public final DlVillageOrTown copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        l.f(str5, "stCode");
        String str9 = str6;
        l.f(str9, "distCode");
        String str10 = str7;
        l.f(str10, "subDistCode");
        String str11 = str8;
        l.f(str11, "villageOrTown");
        return new DlVillageOrTown(str, str2, str3, str4, str5, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlVillageOrTown)) {
            return false;
        }
        DlVillageOrTown dlVillageOrTown = (DlVillageOrTown) obj;
        return l.a(this.agentId, dlVillageOrTown.agentId) && l.a(this.agentPwd, dlVillageOrTown.agentPwd) && l.a(this.agentIpAddress, dlVillageOrTown.agentIpAddress) && l.a(this.agentServiceName, dlVillageOrTown.agentServiceName) && l.a(this.stCode, dlVillageOrTown.stCode) && l.a(this.distCode, dlVillageOrTown.distCode) && l.a(this.subDistCode, dlVillageOrTown.subDistCode) && l.a(this.villageOrTown, dlVillageOrTown.villageOrTown);
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

    public final String getSubDistCode() {
        return this.subDistCode;
    }

    public final String getVillageOrTown() {
        return this.villageOrTown;
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
        return ((((((((hashCode3 + i10) * 31) + this.stCode.hashCode()) * 31) + this.distCode.hashCode()) * 31) + this.subDistCode.hashCode()) * 31) + this.villageOrTown.hashCode();
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

    public final void setSubDistCode(String str) {
        l.f(str, "<set-?>");
        this.subDistCode = str;
    }

    public final void setVillageOrTown(String str) {
        l.f(str, "<set-?>");
        this.villageOrTown = str;
    }

    public String toString() {
        return "DlVillageOrTown(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", stCode=" + this.stCode + ", distCode=" + this.distCode + ", subDistCode=" + this.subDistCode + ", villageOrTown=" + this.villageOrTown + ')';
    }
}
