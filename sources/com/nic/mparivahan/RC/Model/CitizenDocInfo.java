package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class CitizenDocInfo {
    private final long docCtzId;
    private final long docId;
    private final String docNumber;
    private final int docStatus;
    private final String docType;

    public CitizenDocInfo(long j10, long j11, String str, int i10, String str2) {
        l.f(str, "docNumber");
        l.f(str2, "docType");
        this.docCtzId = j10;
        this.docId = j11;
        this.docNumber = str;
        this.docStatus = i10;
        this.docType = str2;
    }

    public static /* synthetic */ CitizenDocInfo copy$default(CitizenDocInfo citizenDocInfo, long j10, long j11, String str, int i10, String str2, int i11, Object obj) {
        CitizenDocInfo citizenDocInfo2 = citizenDocInfo;
        return citizenDocInfo.copy((i11 & 1) != 0 ? citizenDocInfo2.docCtzId : j10, (i11 & 2) != 0 ? citizenDocInfo2.docId : j11, (i11 & 4) != 0 ? citizenDocInfo2.docNumber : str, (i11 & 8) != 0 ? citizenDocInfo2.docStatus : i10, (i11 & 16) != 0 ? citizenDocInfo2.docType : str2);
    }

    public final long component1() {
        return this.docCtzId;
    }

    public final long component2() {
        return this.docId;
    }

    public final String component3() {
        return this.docNumber;
    }

    public final int component4() {
        return this.docStatus;
    }

    public final String component5() {
        return this.docType;
    }

    public final CitizenDocInfo copy(long j10, long j11, String str, int i10, String str2) {
        l.f(str, "docNumber");
        String str3 = str2;
        l.f(str3, "docType");
        return new CitizenDocInfo(j10, j11, str, i10, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CitizenDocInfo)) {
            return false;
        }
        CitizenDocInfo citizenDocInfo = (CitizenDocInfo) obj;
        return this.docCtzId == citizenDocInfo.docCtzId && this.docId == citizenDocInfo.docId && l.a(this.docNumber, citizenDocInfo.docNumber) && this.docStatus == citizenDocInfo.docStatus && l.a(this.docType, citizenDocInfo.docType);
    }

    public final long getDocCtzId() {
        return this.docCtzId;
    }

    public final long getDocId() {
        return this.docId;
    }

    public final String getDocNumber() {
        return this.docNumber;
    }

    public final int getDocStatus() {
        return this.docStatus;
    }

    public final String getDocType() {
        return this.docType;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.docCtzId) * 31) + Long.hashCode(this.docId)) * 31) + this.docNumber.hashCode()) * 31) + Integer.hashCode(this.docStatus)) * 31) + this.docType.hashCode();
    }

    public String toString() {
        return "CitizenDocInfo(docCtzId=" + this.docCtzId + ", docId=" + this.docId + ", docNumber=" + this.docNumber + ", docStatus=" + this.docStatus + ", docType=" + this.docType + ')';
    }
}
