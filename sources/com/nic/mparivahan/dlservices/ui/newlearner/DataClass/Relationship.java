package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;

@Keep
public final class Relationship {
    private String relationCode;
    private String relationName;

    public Relationship() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ Relationship copy$default(Relationship relationship, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = relationship.relationCode;
        }
        if ((i10 & 2) != 0) {
            str2 = relationship.relationName;
        }
        return relationship.copy(str, str2);
    }

    public final String component1() {
        return this.relationCode;
    }

    public final String component2() {
        return this.relationName;
    }

    public final Relationship copy(String str, String str2) {
        l.f(str, "relationCode");
        l.f(str2, "relationName");
        return new Relationship(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Relationship)) {
            return false;
        }
        Relationship relationship = (Relationship) obj;
        return l.a(this.relationCode, relationship.relationCode) && l.a(this.relationName, relationship.relationName);
    }

    public final String getRelationCode() {
        return this.relationCode;
    }

    public final String getRelationName() {
        return this.relationName;
    }

    public int hashCode() {
        return (this.relationCode.hashCode() * 31) + this.relationName.hashCode();
    }

    public final void setRelationCode(String str) {
        l.f(str, "<set-?>");
        this.relationCode = str;
    }

    public final void setRelationName(String str) {
        l.f(str, "<set-?>");
        this.relationName = str;
    }

    public String toString() {
        return "Relationship(relationCode=" + this.relationCode + ", relationName=" + this.relationName + ')';
    }

    public Relationship(String str, String str2) {
        l.f(str, "relationCode");
        l.f(str2, "relationName");
        this.relationCode = str;
        this.relationName = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Relationship(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
