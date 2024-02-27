package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DLDocument {
    private DldetobjX dldetails;
    private String dob;
    private String docnumber;

    public DLDocument(String str, DldetobjX dldetobjX, String str2) {
        this.docnumber = str;
        this.dldetails = dldetobjX;
        this.dob = str2;
    }

    public static /* synthetic */ DLDocument copy$default(DLDocument dLDocument, String str, DldetobjX dldetobjX, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dLDocument.docnumber;
        }
        if ((i10 & 2) != 0) {
            dldetobjX = dLDocument.dldetails;
        }
        if ((i10 & 4) != 0) {
            str2 = dLDocument.dob;
        }
        return dLDocument.copy(str, dldetobjX, str2);
    }

    public final String component1() {
        return this.docnumber;
    }

    public final DldetobjX component2() {
        return this.dldetails;
    }

    public final String component3() {
        return this.dob;
    }

    public final DLDocument copy(String str, DldetobjX dldetobjX, String str2) {
        return new DLDocument(str, dldetobjX, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DLDocument)) {
            return false;
        }
        DLDocument dLDocument = (DLDocument) obj;
        return l.a(this.docnumber, dLDocument.docnumber) && l.a(this.dldetails, dLDocument.dldetails) && l.a(this.dob, dLDocument.dob);
    }

    public final DldetobjX getDldetails() {
        return this.dldetails;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getDocnumber() {
        return this.docnumber;
    }

    public int hashCode() {
        String str = this.docnumber;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DldetobjX dldetobjX = this.dldetails;
        int hashCode2 = (hashCode + (dldetobjX == null ? 0 : dldetobjX.hashCode())) * 31;
        String str2 = this.dob;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public final void setDldetails(DldetobjX dldetobjX) {
        this.dldetails = dldetobjX;
    }

    public final void setDob(String str) {
        this.dob = str;
    }

    public final void setDocnumber(String str) {
        this.docnumber = str;
    }

    public String toString() {
        return "DLDocument(docnumber=" + this.docnumber + ", dldetails=" + this.dldetails + ", dob=" + this.dob + ')';
    }
}
