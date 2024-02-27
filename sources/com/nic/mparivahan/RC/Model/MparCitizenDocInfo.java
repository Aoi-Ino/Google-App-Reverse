package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class MparCitizenDocInfo implements Serializable {
    private final String docCreatedAt;
    private final long docCtzId;
    private final String docDob;
    private final long docId;
    private final String docNumber;
    private final int docStatus;
    private final String docType;
    private final String docUpdatedAt;

    public MparCitizenDocInfo(String str, long j10, long j11, String str2, int i10, String str3, String str4, String str5) {
        l.f(str2, "docNumber");
        l.f(str3, "docType");
        this.docCreatedAt = str;
        this.docCtzId = j10;
        this.docId = j11;
        this.docNumber = str2;
        this.docStatus = i10;
        this.docType = str3;
        this.docDob = str4;
        this.docUpdatedAt = str5;
    }

    public static /* synthetic */ MparCitizenDocInfo copy$default(MparCitizenDocInfo mparCitizenDocInfo, String str, long j10, long j11, String str2, int i10, String str3, String str4, String str5, int i11, Object obj) {
        MparCitizenDocInfo mparCitizenDocInfo2 = mparCitizenDocInfo;
        int i12 = i11;
        return mparCitizenDocInfo.copy((i12 & 1) != 0 ? mparCitizenDocInfo2.docCreatedAt : str, (i12 & 2) != 0 ? mparCitizenDocInfo2.docCtzId : j10, (i12 & 4) != 0 ? mparCitizenDocInfo2.docId : j11, (i12 & 8) != 0 ? mparCitizenDocInfo2.docNumber : str2, (i12 & 16) != 0 ? mparCitizenDocInfo2.docStatus : i10, (i12 & 32) != 0 ? mparCitizenDocInfo2.docType : str3, (i12 & 64) != 0 ? mparCitizenDocInfo2.docDob : str4, (i12 & 128) != 0 ? mparCitizenDocInfo2.docUpdatedAt : str5);
    }

    public final String component1() {
        return this.docCreatedAt;
    }

    public final long component2() {
        return this.docCtzId;
    }

    public final long component3() {
        return this.docId;
    }

    public final String component4() {
        return this.docNumber;
    }

    public final int component5() {
        return this.docStatus;
    }

    public final String component6() {
        return this.docType;
    }

    public final String component7() {
        return this.docDob;
    }

    public final String component8() {
        return this.docUpdatedAt;
    }

    public final MparCitizenDocInfo copy(String str, long j10, long j11, String str2, int i10, String str3, String str4, String str5) {
        String str6 = str2;
        l.f(str6, "docNumber");
        String str7 = str3;
        l.f(str7, "docType");
        return new MparCitizenDocInfo(str, j10, j11, str6, i10, str7, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MparCitizenDocInfo)) {
            return false;
        }
        MparCitizenDocInfo mparCitizenDocInfo = (MparCitizenDocInfo) obj;
        return l.a(this.docCreatedAt, mparCitizenDocInfo.docCreatedAt) && this.docCtzId == mparCitizenDocInfo.docCtzId && this.docId == mparCitizenDocInfo.docId && l.a(this.docNumber, mparCitizenDocInfo.docNumber) && this.docStatus == mparCitizenDocInfo.docStatus && l.a(this.docType, mparCitizenDocInfo.docType) && l.a(this.docDob, mparCitizenDocInfo.docDob) && l.a(this.docUpdatedAt, mparCitizenDocInfo.docUpdatedAt);
    }

    public final String getDocCreatedAt() {
        return this.docCreatedAt;
    }

    public final long getDocCtzId() {
        return this.docCtzId;
    }

    public final String getDocDob() {
        return this.docDob;
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

    public final String getDocUpdatedAt() {
        return this.docUpdatedAt;
    }

    public int hashCode() {
        String str = this.docCreatedAt;
        int i10 = 0;
        int hashCode = (((((((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.docCtzId)) * 31) + Long.hashCode(this.docId)) * 31) + this.docNumber.hashCode()) * 31) + Integer.hashCode(this.docStatus)) * 31) + this.docType.hashCode()) * 31;
        String str2 = this.docDob;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.docUpdatedAt;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "MparCitizenDocInfo(docCreatedAt=" + this.docCreatedAt + ", docCtzId=" + this.docCtzId + ", docId=" + this.docId + ", docNumber=" + this.docNumber + ", docStatus=" + this.docStatus + ", docType=" + this.docType + ", docDob=" + this.docDob + ", docUpdatedAt=" + this.docUpdatedAt + ')';
    }
}
