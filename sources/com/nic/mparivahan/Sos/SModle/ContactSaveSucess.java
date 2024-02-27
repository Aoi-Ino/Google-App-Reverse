package com.nic.mparivahan.Sos.SModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ContactSaveSucess {
    private final String statusCode;
    private final String statusDesc;

    public ContactSaveSucess(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ ContactSaveSucess copy$default(ContactSaveSucess contactSaveSucess, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = contactSaveSucess.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = contactSaveSucess.statusDesc;
        }
        return contactSaveSucess.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final ContactSaveSucess copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new ContactSaveSucess(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactSaveSucess)) {
            return false;
        }
        ContactSaveSucess contactSaveSucess = (ContactSaveSucess) obj;
        return l.a(this.statusCode, contactSaveSucess.statusCode) && l.a(this.statusDesc, contactSaveSucess.statusDesc);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (this.statusCode.hashCode() * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "ContactSaveSucess(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
