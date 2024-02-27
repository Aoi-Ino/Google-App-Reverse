package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class RelationType implements Serializable {
    private final String relationCode;
    private final String relationDesc;

    public RelationType(String str, String str2) {
        l.f(str, "relationCode");
        l.f(str2, "relationDesc");
        this.relationCode = str;
        this.relationDesc = str2;
    }

    public static /* synthetic */ RelationType copy$default(RelationType relationType, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = relationType.relationCode;
        }
        if ((i10 & 2) != 0) {
            str2 = relationType.relationDesc;
        }
        return relationType.copy(str, str2);
    }

    public final String component1() {
        return this.relationCode;
    }

    public final String component2() {
        return this.relationDesc;
    }

    public final RelationType copy(String str, String str2) {
        l.f(str, "relationCode");
        l.f(str2, "relationDesc");
        return new RelationType(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelationType)) {
            return false;
        }
        RelationType relationType = (RelationType) obj;
        return l.a(this.relationCode, relationType.relationCode) && l.a(this.relationDesc, relationType.relationDesc);
    }

    public final String getRelationCode() {
        return this.relationCode;
    }

    public final String getRelationDesc() {
        return this.relationDesc;
    }

    public int hashCode() {
        return (this.relationCode.hashCode() * 31) + this.relationDesc.hashCode();
    }

    public String toString() {
        return "RelationType(relationCode=" + this.relationCode + ", relationDesc=" + this.relationDesc + ')';
    }
}
