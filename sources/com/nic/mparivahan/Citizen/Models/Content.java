package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Content {
    private final int recordCount;
    private final String recordName;
    private final int recordType;

    public Content(int i10, String str, int i11) {
        l.f(str, "recordName");
        this.recordCount = i10;
        this.recordName = str;
        this.recordType = i11;
    }

    public static /* synthetic */ Content copy$default(Content content, int i10, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = content.recordCount;
        }
        if ((i12 & 2) != 0) {
            str = content.recordName;
        }
        if ((i12 & 4) != 0) {
            i11 = content.recordType;
        }
        return content.copy(i10, str, i11);
    }

    public final int component1() {
        return this.recordCount;
    }

    public final String component2() {
        return this.recordName;
    }

    public final int component3() {
        return this.recordType;
    }

    public final Content copy(int i10, String str, int i11) {
        l.f(str, "recordName");
        return new Content(i10, str, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        return this.recordCount == content.recordCount && l.a(this.recordName, content.recordName) && this.recordType == content.recordType;
    }

    public final int getRecordCount() {
        return this.recordCount;
    }

    public final String getRecordName() {
        return this.recordName;
    }

    public final int getRecordType() {
        return this.recordType;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.recordCount) * 31) + this.recordName.hashCode()) * 31) + Integer.hashCode(this.recordType);
    }

    public String toString() {
        return "Content(recordCount=" + this.recordCount + ", recordName=" + this.recordName + ", recordType=" + this.recordType + ')';
    }
}
