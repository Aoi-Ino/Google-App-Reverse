package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Relation {
    private final int code;
    private final String codeDescription;

    public Relation(int i10, String str) {
        l.f(str, "codeDescription");
        this.code = i10;
        this.codeDescription = str;
    }

    public static /* synthetic */ Relation copy$default(Relation relation, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = relation.code;
        }
        if ((i11 & 2) != 0) {
            str = relation.codeDescription;
        }
        return relation.copy(i10, str);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.codeDescription;
    }

    public final Relation copy(int i10, String str) {
        l.f(str, "codeDescription");
        return new Relation(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Relation)) {
            return false;
        }
        Relation relation = (Relation) obj;
        return this.code == relation.code && l.a(this.codeDescription, relation.codeDescription);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getCodeDescription() {
        return this.codeDescription;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.codeDescription.hashCode();
    }

    public String toString() {
        return "Relation(code=" + this.code + ", codeDescription=" + this.codeDescription + ')';
    }
}
