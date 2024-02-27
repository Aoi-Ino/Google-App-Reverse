package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class CitizenDocInfoX {
    private final Long docCtzId;
    private final Long docId;
    private final String docNumber;
    private final String docType;

    public CitizenDocInfoX(Long l10, Long l11, String str, String str2) {
        this.docCtzId = l10;
        this.docId = l11;
        this.docNumber = str;
        this.docType = str2;
    }

    public static /* synthetic */ CitizenDocInfoX copy$default(CitizenDocInfoX citizenDocInfoX, Long l10, Long l11, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = citizenDocInfoX.docCtzId;
        }
        if ((i10 & 2) != 0) {
            l11 = citizenDocInfoX.docId;
        }
        if ((i10 & 4) != 0) {
            str = citizenDocInfoX.docNumber;
        }
        if ((i10 & 8) != 0) {
            str2 = citizenDocInfoX.docType;
        }
        return citizenDocInfoX.copy(l10, l11, str, str2);
    }

    public final Long component1() {
        return this.docCtzId;
    }

    public final Long component2() {
        return this.docId;
    }

    public final String component3() {
        return this.docNumber;
    }

    public final String component4() {
        return this.docType;
    }

    public final CitizenDocInfoX copy(Long l10, Long l11, String str, String str2) {
        return new CitizenDocInfoX(l10, l11, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CitizenDocInfoX)) {
            return false;
        }
        CitizenDocInfoX citizenDocInfoX = (CitizenDocInfoX) obj;
        return l.a(this.docCtzId, citizenDocInfoX.docCtzId) && l.a(this.docId, citizenDocInfoX.docId) && l.a(this.docNumber, citizenDocInfoX.docNumber) && l.a(this.docType, citizenDocInfoX.docType);
    }

    public final Long getDocCtzId() {
        return this.docCtzId;
    }

    public final Long getDocId() {
        return this.docId;
    }

    public final String getDocNumber() {
        return this.docNumber;
    }

    public final String getDocType() {
        return this.docType;
    }

    public int hashCode() {
        Long l10 = this.docCtzId;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.docId;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.docNumber;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.docType;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "CitizenDocInfoX(docCtzId=" + this.docCtzId + ", docId=" + this.docId + ", docNumber=" + this.docNumber + ", docType=" + this.docType + ')';
    }
}
