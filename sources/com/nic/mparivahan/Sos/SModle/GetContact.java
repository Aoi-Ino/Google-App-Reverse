package com.nic.mparivahan.Sos.SModle;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class GetContact {
    private final ArrayList<MparSosContact> mparSosContact;
    private final String statusCode;
    private final String statusDesc;

    public GetContact(ArrayList<MparSosContact> arrayList, String str, String str2) {
        l.f(arrayList, "mparSosContact");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.mparSosContact = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ GetContact copy$default(GetContact getContact, ArrayList<MparSosContact> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = getContact.mparSosContact;
        }
        if ((i10 & 2) != 0) {
            str = getContact.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = getContact.statusDesc;
        }
        return getContact.copy(arrayList, str, str2);
    }

    public final ArrayList<MparSosContact> component1() {
        return this.mparSosContact;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final GetContact copy(ArrayList<MparSosContact> arrayList, String str, String str2) {
        l.f(arrayList, "mparSosContact");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new GetContact(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetContact)) {
            return false;
        }
        GetContact getContact = (GetContact) obj;
        return l.a(this.mparSosContact, getContact.mparSosContact) && l.a(this.statusCode, getContact.statusCode) && l.a(this.statusDesc, getContact.statusDesc);
    }

    public final ArrayList<MparSosContact> getMparSosContact() {
        return this.mparSosContact;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.mparSosContact.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "GetContact(mparSosContact=" + this.mparSosContact + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
