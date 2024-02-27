package com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Enabledservice implements Comparable<Enabledservice> {
    private final String servActivationDate;
    private final boolean servAndroid;
    private String servCode;
    private final String servCreatedAt;
    private final int servId;
    private final String servModule;
    private String servName;
    private final int servOrder;
    private final int servSection;
    private final String servStateCd;
    private final int servStatus;
    private final String servUpdatedAt;

    public Enabledservice(String str, String str2, String str3, int i10, String str4, String str5, String str6, int i11, String str7, int i12, boolean z10, int i13) {
        l.f(str, "servActivationDate");
        l.f(str2, "servCode");
        l.f(str3, "servCreatedAt");
        l.f(str4, "servModule");
        l.f(str5, "servName");
        l.f(str6, "servStateCd");
        l.f(str7, "servUpdatedAt");
        this.servActivationDate = str;
        this.servCode = str2;
        this.servCreatedAt = str3;
        this.servId = i10;
        this.servModule = str4;
        this.servName = str5;
        this.servStateCd = str6;
        this.servStatus = i11;
        this.servUpdatedAt = str7;
        this.servOrder = i12;
        this.servAndroid = z10;
        this.servSection = i13;
    }

    public static /* synthetic */ Enabledservice copy$default(Enabledservice enabledservice, String str, String str2, String str3, int i10, String str4, String str5, String str6, int i11, String str7, int i12, boolean z10, int i13, int i14, Object obj) {
        Enabledservice enabledservice2 = enabledservice;
        int i15 = i14;
        return enabledservice.copy((i15 & 1) != 0 ? enabledservice2.servActivationDate : str, (i15 & 2) != 0 ? enabledservice2.servCode : str2, (i15 & 4) != 0 ? enabledservice2.servCreatedAt : str3, (i15 & 8) != 0 ? enabledservice2.servId : i10, (i15 & 16) != 0 ? enabledservice2.servModule : str4, (i15 & 32) != 0 ? enabledservice2.servName : str5, (i15 & 64) != 0 ? enabledservice2.servStateCd : str6, (i15 & 128) != 0 ? enabledservice2.servStatus : i11, (i15 & 256) != 0 ? enabledservice2.servUpdatedAt : str7, (i15 & 512) != 0 ? enabledservice2.servOrder : i12, (i15 & 1024) != 0 ? enabledservice2.servAndroid : z10, (i15 & 2048) != 0 ? enabledservice2.servSection : i13);
    }

    public int compareTo(Enabledservice enabledservice) {
        l.f(enabledservice, "other");
        int i10 = this.servOrder;
        int i11 = enabledservice.servOrder;
        if (i10 == i11) {
            return 0;
        }
        return i10 > i11 ? 1 : -1;
    }

    public final String component1() {
        return this.servActivationDate;
    }

    public final int component10() {
        return this.servOrder;
    }

    public final boolean component11() {
        return this.servAndroid;
    }

    public final int component12() {
        return this.servSection;
    }

    public final String component2() {
        return this.servCode;
    }

    public final String component3() {
        return this.servCreatedAt;
    }

    public final int component4() {
        return this.servId;
    }

    public final String component5() {
        return this.servModule;
    }

    public final String component6() {
        return this.servName;
    }

    public final String component7() {
        return this.servStateCd;
    }

    public final int component8() {
        return this.servStatus;
    }

    public final String component9() {
        return this.servUpdatedAt;
    }

    public final Enabledservice copy(String str, String str2, String str3, int i10, String str4, String str5, String str6, int i11, String str7, int i12, boolean z10, int i13) {
        l.f(str, "servActivationDate");
        String str8 = str2;
        l.f(str8, "servCode");
        String str9 = str3;
        l.f(str9, "servCreatedAt");
        String str10 = str4;
        l.f(str10, "servModule");
        String str11 = str5;
        l.f(str11, "servName");
        String str12 = str6;
        l.f(str12, "servStateCd");
        String str13 = str7;
        l.f(str13, "servUpdatedAt");
        return new Enabledservice(str, str8, str9, i10, str10, str11, str12, i11, str13, i12, z10, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Enabledservice)) {
            return false;
        }
        Enabledservice enabledservice = (Enabledservice) obj;
        return l.a(this.servActivationDate, enabledservice.servActivationDate) && l.a(this.servCode, enabledservice.servCode) && l.a(this.servCreatedAt, enabledservice.servCreatedAt) && this.servId == enabledservice.servId && l.a(this.servModule, enabledservice.servModule) && l.a(this.servName, enabledservice.servName) && l.a(this.servStateCd, enabledservice.servStateCd) && this.servStatus == enabledservice.servStatus && l.a(this.servUpdatedAt, enabledservice.servUpdatedAt) && this.servOrder == enabledservice.servOrder && this.servAndroid == enabledservice.servAndroid && this.servSection == enabledservice.servSection;
    }

    public final String getServActivationDate() {
        return this.servActivationDate;
    }

    public final boolean getServAndroid() {
        return this.servAndroid;
    }

    public final String getServCode() {
        return this.servCode;
    }

    public final String getServCreatedAt() {
        return this.servCreatedAt;
    }

    public final int getServId() {
        return this.servId;
    }

    public final String getServModule() {
        return this.servModule;
    }

    public final String getServName() {
        return this.servName;
    }

    public final int getServOrder() {
        return this.servOrder;
    }

    public final int getServSection() {
        return this.servSection;
    }

    public final String getServStateCd() {
        return this.servStateCd;
    }

    public final int getServStatus() {
        return this.servStatus;
    }

    public final String getServUpdatedAt() {
        return this.servUpdatedAt;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.servActivationDate.hashCode() * 31) + this.servCode.hashCode()) * 31) + this.servCreatedAt.hashCode()) * 31) + Integer.hashCode(this.servId)) * 31) + this.servModule.hashCode()) * 31) + this.servName.hashCode()) * 31) + this.servStateCd.hashCode()) * 31) + Integer.hashCode(this.servStatus)) * 31) + this.servUpdatedAt.hashCode()) * 31) + Integer.hashCode(this.servOrder)) * 31;
        boolean z10 = this.servAndroid;
        if (z10) {
            z10 = true;
        }
        return ((hashCode + (z10 ? 1 : 0)) * 31) + Integer.hashCode(this.servSection);
    }

    public final void setServCode(String str) {
        l.f(str, "<set-?>");
        this.servCode = str;
    }

    public final void setServName(String str) {
        l.f(str, "<set-?>");
        this.servName = str;
    }

    public String toString() {
        return "Enabledservice(servActivationDate=" + this.servActivationDate + ", servCode=" + this.servCode + ", servCreatedAt=" + this.servCreatedAt + ", servId=" + this.servId + ", servModule=" + this.servModule + ", servName=" + this.servName + ", servStateCd=" + this.servStateCd + ", servStatus=" + this.servStatus + ", servUpdatedAt=" + this.servUpdatedAt + ", servOrder=" + this.servOrder + ", servAndroid=" + this.servAndroid + ", servSection=" + this.servSection + ')';
    }
}
