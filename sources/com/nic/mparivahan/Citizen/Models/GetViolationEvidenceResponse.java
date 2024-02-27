package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class GetViolationEvidenceResponse {
    private final ArrayList<VoilationEvidenceModel> evidences;
    private final String statusCode;
    private final String statusDesc;

    public GetViolationEvidenceResponse(String str, String str2, ArrayList<VoilationEvidenceModel> arrayList) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        l.f(arrayList, "evidences");
        this.statusCode = str;
        this.statusDesc = str2;
        this.evidences = arrayList;
    }

    public static /* synthetic */ GetViolationEvidenceResponse copy$default(GetViolationEvidenceResponse getViolationEvidenceResponse, String str, String str2, ArrayList<VoilationEvidenceModel> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getViolationEvidenceResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getViolationEvidenceResponse.statusDesc;
        }
        if ((i10 & 4) != 0) {
            arrayList = getViolationEvidenceResponse.evidences;
        }
        return getViolationEvidenceResponse.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final ArrayList<VoilationEvidenceModel> component3() {
        return this.evidences;
    }

    public final GetViolationEvidenceResponse copy(String str, String str2, ArrayList<VoilationEvidenceModel> arrayList) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        l.f(arrayList, "evidences");
        return new GetViolationEvidenceResponse(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetViolationEvidenceResponse)) {
            return false;
        }
        GetViolationEvidenceResponse getViolationEvidenceResponse = (GetViolationEvidenceResponse) obj;
        return l.a(this.statusCode, getViolationEvidenceResponse.statusCode) && l.a(this.statusDesc, getViolationEvidenceResponse.statusDesc) && l.a(this.evidences, getViolationEvidenceResponse.evidences);
    }

    public final ArrayList<VoilationEvidenceModel> getEvidences() {
        return this.evidences;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31) + this.evidences.hashCode();
    }

    public String toString() {
        return "GetViolationEvidenceResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", evidences=" + this.evidences + ')';
    }
}
