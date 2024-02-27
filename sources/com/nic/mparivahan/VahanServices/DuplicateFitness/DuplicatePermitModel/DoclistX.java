package com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DoclistX {
    private final String descr;
    private final String docId;

    public DoclistX(String str, String str2) {
        l.f(str, "descr");
        l.f(str2, "docId");
        this.descr = str;
        this.docId = str2;
    }

    public static /* synthetic */ DoclistX copy$default(DoclistX doclistX, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = doclistX.descr;
        }
        if ((i10 & 2) != 0) {
            str2 = doclistX.docId;
        }
        return doclistX.copy(str, str2);
    }

    public final String component1() {
        return this.descr;
    }

    public final String component2() {
        return this.docId;
    }

    public final DoclistX copy(String str, String str2) {
        l.f(str, "descr");
        l.f(str2, "docId");
        return new DoclistX(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoclistX)) {
            return false;
        }
        DoclistX doclistX = (DoclistX) obj;
        return l.a(this.descr, doclistX.descr) && l.a(this.docId, doclistX.docId);
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
        return "DoclistX(descr=" + this.descr + ", docId=" + this.docId + ')';
    }
}
