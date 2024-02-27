package com.nic.mparivahan.Sos.SModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MparRelation {
    private final int relId;
    private final String relName;
    private final int relStatus;

    public MparRelation(int i10, String str, int i11) {
        l.f(str, "relName");
        this.relId = i10;
        this.relName = str;
        this.relStatus = i11;
    }

    public static /* synthetic */ MparRelation copy$default(MparRelation mparRelation, int i10, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = mparRelation.relId;
        }
        if ((i12 & 2) != 0) {
            str = mparRelation.relName;
        }
        if ((i12 & 4) != 0) {
            i11 = mparRelation.relStatus;
        }
        return mparRelation.copy(i10, str, i11);
    }

    public final int component1() {
        return this.relId;
    }

    public final String component2() {
        return this.relName;
    }

    public final int component3() {
        return this.relStatus;
    }

    public final MparRelation copy(int i10, String str, int i11) {
        l.f(str, "relName");
        return new MparRelation(i10, str, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MparRelation)) {
            return false;
        }
        MparRelation mparRelation = (MparRelation) obj;
        return this.relId == mparRelation.relId && l.a(this.relName, mparRelation.relName) && this.relStatus == mparRelation.relStatus;
    }

    public final int getRelId() {
        return this.relId;
    }

    public final String getRelName() {
        return this.relName;
    }

    public final int getRelStatus() {
        return this.relStatus;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.relId) * 31) + this.relName.hashCode()) * 31) + Integer.hashCode(this.relStatus);
    }

    public String toString() {
        return "MparRelation(relId=" + this.relId + ", relName=" + this.relName + ", relStatus=" + this.relStatus + ')';
    }
}
