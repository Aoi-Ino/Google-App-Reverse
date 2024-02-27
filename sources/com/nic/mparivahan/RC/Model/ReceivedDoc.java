package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ReceivedDoc {
    private final String shrdCreatedAt;
    private final Long shrdDocId;
    private final String shrdDocNumber;
    private final String shrdDocType;
    private final String shrdExpireOn;
    private final Long shrdFromCtz;
    private final Long shrdId;
    private final Integer shrdNdays;
    private final Integer shrdStatus;
    private final Long shrdToCtz;

    public ReceivedDoc(String str, String str2, String str3, String str4, Long l10, Long l11, Integer num, Integer num2, Long l12, Long l13) {
        this.shrdCreatedAt = str;
        this.shrdDocNumber = str2;
        this.shrdDocType = str3;
        this.shrdExpireOn = str4;
        this.shrdFromCtz = l10;
        this.shrdId = l11;
        this.shrdNdays = num;
        this.shrdStatus = num2;
        this.shrdToCtz = l12;
        this.shrdDocId = l13;
    }

    public static /* synthetic */ ReceivedDoc copy$default(ReceivedDoc receivedDoc, String str, String str2, String str3, String str4, Long l10, Long l11, Integer num, Integer num2, Long l12, Long l13, int i10, Object obj) {
        ReceivedDoc receivedDoc2 = receivedDoc;
        int i11 = i10;
        return receivedDoc.copy((i11 & 1) != 0 ? receivedDoc2.shrdCreatedAt : str, (i11 & 2) != 0 ? receivedDoc2.shrdDocNumber : str2, (i11 & 4) != 0 ? receivedDoc2.shrdDocType : str3, (i11 & 8) != 0 ? receivedDoc2.shrdExpireOn : str4, (i11 & 16) != 0 ? receivedDoc2.shrdFromCtz : l10, (i11 & 32) != 0 ? receivedDoc2.shrdId : l11, (i11 & 64) != 0 ? receivedDoc2.shrdNdays : num, (i11 & 128) != 0 ? receivedDoc2.shrdStatus : num2, (i11 & 256) != 0 ? receivedDoc2.shrdToCtz : l12, (i11 & 512) != 0 ? receivedDoc2.shrdDocId : l13);
    }

    public final String component1() {
        return this.shrdCreatedAt;
    }

    public final Long component10() {
        return this.shrdDocId;
    }

    public final String component2() {
        return this.shrdDocNumber;
    }

    public final String component3() {
        return this.shrdDocType;
    }

    public final String component4() {
        return this.shrdExpireOn;
    }

    public final Long component5() {
        return this.shrdFromCtz;
    }

    public final Long component6() {
        return this.shrdId;
    }

    public final Integer component7() {
        return this.shrdNdays;
    }

    public final Integer component8() {
        return this.shrdStatus;
    }

    public final Long component9() {
        return this.shrdToCtz;
    }

    public final ReceivedDoc copy(String str, String str2, String str3, String str4, Long l10, Long l11, Integer num, Integer num2, Long l12, Long l13) {
        return new ReceivedDoc(str, str2, str3, str4, l10, l11, num, num2, l12, l13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceivedDoc)) {
            return false;
        }
        ReceivedDoc receivedDoc = (ReceivedDoc) obj;
        return l.a(this.shrdCreatedAt, receivedDoc.shrdCreatedAt) && l.a(this.shrdDocNumber, receivedDoc.shrdDocNumber) && l.a(this.shrdDocType, receivedDoc.shrdDocType) && l.a(this.shrdExpireOn, receivedDoc.shrdExpireOn) && l.a(this.shrdFromCtz, receivedDoc.shrdFromCtz) && l.a(this.shrdId, receivedDoc.shrdId) && l.a(this.shrdNdays, receivedDoc.shrdNdays) && l.a(this.shrdStatus, receivedDoc.shrdStatus) && l.a(this.shrdToCtz, receivedDoc.shrdToCtz) && l.a(this.shrdDocId, receivedDoc.shrdDocId);
    }

    public final String getShrdCreatedAt() {
        return this.shrdCreatedAt;
    }

    public final Long getShrdDocId() {
        return this.shrdDocId;
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

    public final Long getShrdFromCtz() {
        return this.shrdFromCtz;
    }

    public final Long getShrdId() {
        return this.shrdId;
    }

    public final Integer getShrdNdays() {
        return this.shrdNdays;
    }

    public final Integer getShrdStatus() {
        return this.shrdStatus;
    }

    public final Long getShrdToCtz() {
        return this.shrdToCtz;
    }

    public int hashCode() {
        String str = this.shrdCreatedAt;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shrdDocNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shrdDocType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shrdExpireOn;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l10 = this.shrdFromCtz;
        int hashCode5 = (hashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.shrdId;
        int hashCode6 = (hashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.shrdNdays;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.shrdStatus;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l12 = this.shrdToCtz;
        int hashCode9 = (hashCode8 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.shrdDocId;
        if (l13 != null) {
            i10 = l13.hashCode();
        }
        return hashCode9 + i10;
    }

    public String toString() {
        return "ReceivedDoc(shrdCreatedAt=" + this.shrdCreatedAt + ", shrdDocNumber=" + this.shrdDocNumber + ", shrdDocType=" + this.shrdDocType + ", shrdExpireOn=" + this.shrdExpireOn + ", shrdFromCtz=" + this.shrdFromCtz + ", shrdId=" + this.shrdId + ", shrdNdays=" + this.shrdNdays + ", shrdStatus=" + this.shrdStatus + ", shrdToCtz=" + this.shrdToCtz + ", shrdDocId=" + this.shrdDocId + ')';
    }
}
