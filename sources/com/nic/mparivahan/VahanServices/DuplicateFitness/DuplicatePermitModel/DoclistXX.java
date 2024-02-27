package com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class DoclistXX implements Serializable {
    private final String descr;
    private final String docId;

    public DoclistXX(String str, String str2) {
        l.f(str, "descr");
        l.f(str2, "docId");
        this.descr = str;
        this.docId = str2;
    }

    public static /* synthetic */ DoclistXX copy$default(DoclistXX doclistXX, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = doclistXX.descr;
        }
        if ((i10 & 2) != 0) {
            str2 = doclistXX.docId;
        }
        return doclistXX.copy(str, str2);
    }

    public final String component1() {
        return this.descr;
    }

    public final String component2() {
        return this.docId;
    }

    public final DoclistXX copy(String str, String str2) {
        l.f(str, "descr");
        l.f(str2, "docId");
        return new DoclistXX(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoclistXX)) {
            return false;
        }
        DoclistXX doclistXX = (DoclistXX) obj;
        return l.a(this.descr, doclistXX.descr) && l.a(this.docId, doclistXX.docId);
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
        return "DoclistXX(descr=" + this.descr + ", docId=" + this.docId + ')';
    }
}
