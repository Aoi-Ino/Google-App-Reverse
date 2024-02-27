package com.nic.mparivahan.Sos.SModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MparSosContact {
    private final String soscCreatedAt;
    private final int soscCtzId;
    private final String soscMobile;
    private final String soscName;
    private final int soscRecordId;
    private final int soscRelation;
    private final int soscStatus;
    private final String soscUpdatedAt;

    public MparSosContact(String str, int i10, String str2, String str3, int i11, int i12, int i13, String str4) {
        l.f(str, "soscCreatedAt");
        l.f(str2, "soscMobile");
        l.f(str3, "soscName");
        l.f(str4, "soscUpdatedAt");
        this.soscCreatedAt = str;
        this.soscCtzId = i10;
        this.soscMobile = str2;
        this.soscName = str3;
        this.soscRecordId = i11;
        this.soscRelation = i12;
        this.soscStatus = i13;
        this.soscUpdatedAt = str4;
    }

    public static /* synthetic */ MparSosContact copy$default(MparSosContact mparSosContact, String str, int i10, String str2, String str3, int i11, int i12, int i13, String str4, int i14, Object obj) {
        MparSosContact mparSosContact2 = mparSosContact;
        int i15 = i14;
        return mparSosContact.copy((i15 & 1) != 0 ? mparSosContact2.soscCreatedAt : str, (i15 & 2) != 0 ? mparSosContact2.soscCtzId : i10, (i15 & 4) != 0 ? mparSosContact2.soscMobile : str2, (i15 & 8) != 0 ? mparSosContact2.soscName : str3, (i15 & 16) != 0 ? mparSosContact2.soscRecordId : i11, (i15 & 32) != 0 ? mparSosContact2.soscRelation : i12, (i15 & 64) != 0 ? mparSosContact2.soscStatus : i13, (i15 & 128) != 0 ? mparSosContact2.soscUpdatedAt : str4);
    }

    public final String component1() {
        return this.soscCreatedAt;
    }

    public final int component2() {
        return this.soscCtzId;
    }

    public final String component3() {
        return this.soscMobile;
    }

    public final String component4() {
        return this.soscName;
    }

    public final int component5() {
        return this.soscRecordId;
    }

    public final int component6() {
        return this.soscRelation;
    }

    public final int component7() {
        return this.soscStatus;
    }

    public final String component8() {
        return this.soscUpdatedAt;
    }

    public final MparSosContact copy(String str, int i10, String str2, String str3, int i11, int i12, int i13, String str4) {
        l.f(str, "soscCreatedAt");
        l.f(str2, "soscMobile");
        l.f(str3, "soscName");
        String str5 = str4;
        l.f(str5, "soscUpdatedAt");
        return new MparSosContact(str, i10, str2, str3, i11, i12, i13, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MparSosContact)) {
            return false;
        }
        MparSosContact mparSosContact = (MparSosContact) obj;
        return l.a(this.soscCreatedAt, mparSosContact.soscCreatedAt) && this.soscCtzId == mparSosContact.soscCtzId && l.a(this.soscMobile, mparSosContact.soscMobile) && l.a(this.soscName, mparSosContact.soscName) && this.soscRecordId == mparSosContact.soscRecordId && this.soscRelation == mparSosContact.soscRelation && this.soscStatus == mparSosContact.soscStatus && l.a(this.soscUpdatedAt, mparSosContact.soscUpdatedAt);
    }

    public final String getSoscCreatedAt() {
        return this.soscCreatedAt;
    }

    public final int getSoscCtzId() {
        return this.soscCtzId;
    }

    public final String getSoscMobile() {
        return this.soscMobile;
    }

    public final String getSoscName() {
        return this.soscName;
    }

    public final int getSoscRecordId() {
        return this.soscRecordId;
    }

    public final int getSoscRelation() {
        return this.soscRelation;
    }

    public final int getSoscStatus() {
        return this.soscStatus;
    }

    public final String getSoscUpdatedAt() {
        return this.soscUpdatedAt;
    }

    public int hashCode() {
        return (((((((((((((this.soscCreatedAt.hashCode() * 31) + Integer.hashCode(this.soscCtzId)) * 31) + this.soscMobile.hashCode()) * 31) + this.soscName.hashCode()) * 31) + Integer.hashCode(this.soscRecordId)) * 31) + Integer.hashCode(this.soscRelation)) * 31) + Integer.hashCode(this.soscStatus)) * 31) + this.soscUpdatedAt.hashCode();
    }

    public String toString() {
        return "MparSosContact(soscCreatedAt=" + this.soscCreatedAt + ", soscCtzId=" + this.soscCtzId + ", soscMobile=" + this.soscMobile + ", soscName=" + this.soscName + ", soscRecordId=" + this.soscRecordId + ", soscRelation=" + this.soscRelation + ", soscStatus=" + this.soscStatus + ", soscUpdatedAt=" + this.soscUpdatedAt + ')';
    }
}
