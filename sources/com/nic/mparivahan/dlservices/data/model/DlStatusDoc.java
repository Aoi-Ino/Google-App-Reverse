package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlStatusDoc {
    private final String applicationNumber;
    private final String dateOfBirth;

    public DlStatusDoc(String str, String str2) {
        l.f(str, "applicationNumber");
        l.f(str2, "dateOfBirth");
        this.applicationNumber = str;
        this.dateOfBirth = str2;
    }

    public static /* synthetic */ DlStatusDoc copy$default(DlStatusDoc dlStatusDoc, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlStatusDoc.applicationNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = dlStatusDoc.dateOfBirth;
        }
        return dlStatusDoc.copy(str, str2);
    }

    public final String component1() {
        return this.applicationNumber;
    }

    public final String component2() {
        return this.dateOfBirth;
    }

    public final DlStatusDoc copy(String str, String str2) {
        l.f(str, "applicationNumber");
        l.f(str2, "dateOfBirth");
        return new DlStatusDoc(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlStatusDoc)) {
            return false;
        }
        DlStatusDoc dlStatusDoc = (DlStatusDoc) obj;
        return l.a(this.applicationNumber, dlStatusDoc.applicationNumber) && l.a(this.dateOfBirth, dlStatusDoc.dateOfBirth);
    }

    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public int hashCode() {
        return (this.applicationNumber.hashCode() * 31) + this.dateOfBirth.hashCode();
    }

    public String toString() {
        return "DlStatusDoc(applicationNumber=" + this.applicationNumber + ", dateOfBirth=" + this.dateOfBirth + ')';
    }
}
