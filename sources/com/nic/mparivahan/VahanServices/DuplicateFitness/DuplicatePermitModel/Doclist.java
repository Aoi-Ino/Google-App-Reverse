package com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Doclist {
    private final String descr;
    private final String docId;

    public Doclist(String str, String str2) {
        l.f(str, "descr");
        l.f(str2, "docId");
        this.descr = str;
        this.docId = str2;
    }

    public static /* synthetic */ Doclist copy$default(Doclist doclist, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = doclist.descr;
        }
        if ((i10 & 2) != 0) {
            str2 = doclist.docId;
        }
        return doclist.copy(str, str2);
    }

    public final String component1() {
        return this.descr;
    }

    public final String component2() {
        return this.docId;
    }

    public final Doclist copy(String str, String str2) {
        l.f(str, "descr");
        l.f(str2, "docId");
        return new Doclist(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Doclist)) {
            return false;
        }
        Doclist doclist = (Doclist) obj;
        return l.a(this.descr, doclist.descr) && l.a(this.docId, doclist.docId);
    }

    public final String getDescr() {
        return this.descr;
    }

    public final String getDocId() {
        return this.docId;
    }

    public int hashCode() {
        return (this.descr.hashCode() * 31) + this.docId.hashCode();
    }

    public String toString() {
        return "Doclist(descr=" + this.descr + ", docId=" + this.docId + ')';
    }
}
