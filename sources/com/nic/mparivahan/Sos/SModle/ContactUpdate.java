package com.nic.mparivahan.Sos.SModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ContactUpdate {
    private final MparSosContacts mparSosContacts;
    private final String statusCode;
    private final String statusDesc;

    public ContactUpdate(MparSosContacts mparSosContacts2, String str, String str2) {
        l.f(mparSosContacts2, "mparSosContacts");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.mparSosContacts = mparSosContacts2;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ ContactUpdate copy$default(ContactUpdate contactUpdate, MparSosContacts mparSosContacts2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mparSosContacts2 = contactUpdate.mparSosContacts;
        }
        if ((i10 & 2) != 0) {
            str = contactUpdate.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = contactUpdate.statusDesc;
        }
        return contactUpdate.copy(mparSosContacts2, str, str2);
    }

    public final MparSosContacts component1() {
        return this.mparSosContacts;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final ContactUpdate copy(MparSosContacts mparSosContacts2, String str, String str2) {
        l.f(mparSosContacts2, "mparSosContacts");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new ContactUpdate(mparSosContacts2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactUpdate)) {
            return false;
        }
        ContactUpdate contactUpdate = (ContactUpdate) obj;
        return l.a(this.mparSosContacts, contactUpdate.mparSosContacts) && l.a(this.statusCode, contactUpdate.statusCode) && l.a(this.statusDesc, contactUpdate.statusDesc);
    }

    public final MparSosContacts getMparSosContacts() {
        return this.mparSosContacts;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.mparSosContacts.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "ContactUpdate(mparSosContacts=" + this.mparSosContacts + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
