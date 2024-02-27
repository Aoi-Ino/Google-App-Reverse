package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SharedDoc {
    private final String shrdCreatedAt;
    private final Object shrdDelatedAt;
    private final Object shrdDeletedBy;
    private final String shrdDocNumber;
    private final String shrdDocType;
    private final String shrdExpireOn;
    private final long shrdFromCtz;
    private final long shrdId;
    private final int shrdNdays;
    private final int shrdStatus;
    private final long shrdToCtz;
    private final Object shrdUpdatedAt;

    public SharedDoc(String str, Object obj, Object obj2, String str2, String str3, String str4, long j10, long j11, int i10, int i11, long j12, Object obj3) {
        Object obj4 = obj3;
        l.f(str, "shrdCreatedAt");
        l.f(obj, "shrdDelatedAt");
        l.f(obj2, "shrdDeletedBy");
        l.f(str2, "shrdDocNumber");
        l.f(str3, "shrdDocType");
        l.f(str4, "shrdExpireOn");
        l.f(obj4, "shrdUpdatedAt");
        this.shrdCreatedAt = str;
        this.shrdDelatedAt = obj;
        this.shrdDeletedBy = obj2;
        this.shrdDocNumber = str2;
        this.shrdDocType = str3;
        this.shrdExpireOn = str4;
        this.shrdFromCtz = j10;
        this.shrdId = j11;
        this.shrdNdays = i10;
        this.shrdStatus = i11;
        this.shrdToCtz = j12;
        this.shrdUpdatedAt = obj4;
    }

    public static /* synthetic */ SharedDoc copy$default(SharedDoc sharedDoc, String str, Object obj, Object obj2, String str2, String str3, String str4, long j10, long j11, int i10, int i11, long j12, Object obj3, int i12, Object obj4) {
        SharedDoc sharedDoc2 = sharedDoc;
        int i13 = i12;
        return sharedDoc.copy((i13 & 1) != 0 ? sharedDoc2.shrdCreatedAt : str, (i13 & 2) != 0 ? sharedDoc2.shrdDelatedAt : obj, (i13 & 4) != 0 ? sharedDoc2.shrdDeletedBy : obj2, (i13 & 8) != 0 ? sharedDoc2.shrdDocNumber : str2, (i13 & 16) != 0 ? sharedDoc2.shrdDocType : str3, (i13 & 32) != 0 ? sharedDoc2.shrdExpireOn : str4, (i13 & 64) != 0 ? sharedDoc2.shrdFromCtz : j10, (i13 & 128) != 0 ? sharedDoc2.shrdId : j11, (i13 & 256) != 0 ? sharedDoc2.shrdNdays : i10, (i13 & 512) != 0 ? sharedDoc2.shrdStatus : i11, (i13 & 1024) != 0 ? sharedDoc2.shrdToCtz : j12, (i13 & 2048) != 0 ? sharedDoc2.shrdUpdatedAt : obj3);
    }

    public final String component1() {
        return this.shrdCreatedAt;
    }

    public final int component10() {
        return this.shrdStatus;
    }

    public final long component11() {
        return this.shrdToCtz;
    }

    public final Object component12() {
        return this.shrdUpdatedAt;
    }

    public final Object component2() {
        return this.shrdDelatedAt;
    }

    public final Object component3() {
        return this.shrdDeletedBy;
    }

    public final String component4() {
        return this.shrdDocNumber;
    }

    public final String component5() {
        return this.shrdDocType;
    }

    public final String component6() {
        return this.shrdExpireOn;
    }

    public final long component7() {
        return this.shrdFromCtz;
    }

    public final long component8() {
        return this.shrdId;
    }

    public final int component9() {
        return this.shrdNdays;
    }

    public final SharedDoc copy(String str, Object obj, Object obj2, String str2, String str3, String str4, long j10, long j11, int i10, int i11, long j12, Object obj3) {
        String str5 = str;
        l.f(str5, "shrdCreatedAt");
        Object obj4 = obj;
        l.f(obj4, "shrdDelatedAt");
        Object obj5 = obj2;
        l.f(obj5, "shrdDeletedBy");
        String str6 = str2;
        l.f(str6, "shrdDocNumber");
        String str7 = str3;
        l.f(str7, "shrdDocType");
        String str8 = str4;
        l.f(str8, "shrdExpireOn");
        l.f(obj3, "shrdUpdatedAt");
        return new SharedDoc(str5, obj4, obj5, str6, str7, str8, j10, j11, i10, i11, j12, obj3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedDoc)) {
            return false;
        }
        SharedDoc sharedDoc = (SharedDoc) obj;
        return l.a(this.shrdCreatedAt, sharedDoc.shrdCreatedAt) && l.a(this.shrdDelatedAt, sharedDoc.shrdDelatedAt) && l.a(this.shrdDeletedBy, sharedDoc.shrdDeletedBy) && l.a(this.shrdDocNumber, sharedDoc.shrdDocNumber) && l.a(this.shrdDocType, sharedDoc.shrdDocType) && l.a(this.shrdExpireOn, sharedDoc.shrdExpireOn) && this.shrdFromCtz == sharedDoc.shrdFromCtz && this.shrdId == sharedDoc.shrdId && this.shrdNdays == sharedDoc.shrdNdays && this.shrdStatus == sharedDoc.shrdStatus && this.shrdToCtz == sharedDoc.shrdToCtz && l.a(this.shrdUpdatedAt, sharedDoc.shrdUpdatedAt);
    }

    public final String getShrdCreatedAt() {
        return this.shrdCreatedAt;
    }

    public final Object getShrdDelatedAt() {
        return this.shrdDelatedAt;
    }

    public final Object getShrdDeletedBy() {
        return this.shrdDeletedBy;
    }

    public final String getShrdDocNumber() {
        return this.shrdDocNumber;
    }

    public final String getShrdDocType() {
        return this.shrdDocType;
    }

    public final String getShrdExpireOn() {
        return this.shrdExpireOn;
    }

    public final long getShrdFromCtz() {
        return this.shrdFromCtz;
    }

    public final long getShrdId() {
        return this.shrdId;
    }

    public final int getShrdNdays() {
        return this.shrdNdays;
    }

    public final int getShrdStatus() {
        return this.shrdStatus;
    }

    public final long getShrdToCtz() {
        return this.shrdToCtz;
    }

    public final Object getShrdUpdatedAt() {
        return this.shrdUpdatedAt;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.shrdCreatedAt.hashCode() * 31) + this.shrdDelatedAt.hashCode()) * 31) + this.shrdDeletedBy.hashCode()) * 31) + this.shrdDocNumber.hashCode()) * 31) + this.shrdDocType.hashCode()) * 31) + this.shrdExpireOn.hashCode()) * 31) + Long.hashCode(this.shrdFromCtz)) * 31) + Long.hashCode(this.shrdId)) * 31) + Integer.hashCode(this.shrdNdays)) * 31) + Integer.hashCode(this.shrdStatus)) * 31) + Long.hashCode(this.shrdToCtz)) * 31) + this.shrdUpdatedAt.hashCode();
    }

    public String toString() {
        return "SharedDoc(shrdCreatedAt=" + this.shrdCreatedAt + ", shrdDelatedAt=" + this.shrdDelatedAt + ", shrdDeletedBy=" + this.shrdDeletedBy + ", shrdDocNumber=" + this.shrdDocNumber + ", shrdDocType=" + this.shrdDocType + ", shrdExpireOn=" + this.shrdExpireOn + ", shrdFromCtz=" + this.shrdFromCtz + ", shrdId=" + this.shrdId + ", shrdNdays=" + this.shrdNdays + ", shrdStatus=" + this.shrdStatus + ", shrdToCtz=" + this.shrdToCtz + ", shrdUpdatedAt=" + this.shrdUpdatedAt + ')';
    }
}
