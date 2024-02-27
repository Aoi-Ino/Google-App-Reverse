package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VoilationEvidenceModel {
    private final String evidenceName;
    private final String evidenceType;
    private final String evidenceVal;

    public VoilationEvidenceModel(String str, String str2, String str3) {
        l.f(str, "evidenceType");
        l.f(str2, "evidenceName");
        l.f(str3, "evidenceVal");
        this.evidenceType = str;
        this.evidenceName = str2;
        this.evidenceVal = str3;
    }

    public static /* synthetic */ VoilationEvidenceModel copy$default(VoilationEvidenceModel voilationEvidenceModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = voilationEvidenceModel.evidenceType;
        }
        if ((i10 & 2) != 0) {
            str2 = voilationEvidenceModel.evidenceName;
        }
        if ((i10 & 4) != 0) {
            str3 = voilationEvidenceModel.evidenceVal;
        }
        return voilationEvidenceModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.evidenceType;
    }

    public final String component2() {
        return this.evidenceName;
    }

    public final String component3() {
        return this.evidenceVal;
    }

    public final VoilationEvidenceModel copy(String str, String str2, String str3) {
        l.f(str, "evidenceType");
        l.f(str2, "evidenceName");
        l.f(str3, "evidenceVal");
        return new VoilationEvidenceModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoilationEvidenceModel)) {
            return false;
        }
        VoilationEvidenceModel voilationEvidenceModel = (VoilationEvidenceModel) obj;
        return l.a(this.evidenceType, voilationEvidenceModel.evidenceType) && l.a(this.evidenceName, voilationEvidenceModel.evidenceName) && l.a(this.evidenceVal, voilationEvidenceModel.evidenceVal);
    }

    public final String getEvidenceName() {
        return this.evidenceName;
    }

    public final String getEvidenceType() {
        return this.evidenceType;
    }

    public final String getEvidenceVal() {
        return this.evidenceVal;
    }

    public int hashCode() {
        return (((this.evidenceType.hashCode() * 31) + this.evidenceName.hashCode()) * 31) + this.evidenceVal.hashCode();
    }

    public String toString() {
        return "VoilationEvidenceModel(evidenceType=" + this.evidenceType + ", evidenceName=" + this.evidenceName + ", evidenceVal=" + this.evidenceVal + ')';
    }
}
