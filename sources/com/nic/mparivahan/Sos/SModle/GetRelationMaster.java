package com.nic.mparivahan.Sos.SModle;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class GetRelationMaster {
    private final List<MparRelation> mparRelation;
    private final String statusCode;
    private final String statusDesc;

    public GetRelationMaster(List<MparRelation> list, String str, String str2) {
        l.f(list, "mparRelation");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.mparRelation = list;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ GetRelationMaster copy$default(GetRelationMaster getRelationMaster, List<MparRelation> list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getRelationMaster.mparRelation;
        }
        if ((i10 & 2) != 0) {
            str = getRelationMaster.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = getRelationMaster.statusDesc;
        }
        return getRelationMaster.copy(list, str, str2);
    }

    public final List<MparRelation> component1() {
        return this.mparRelation;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final GetRelationMaster copy(List<MparRelation> list, String str, String str2) {
        l.f(list, "mparRelation");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new GetRelationMaster(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetRelationMaster)) {
            return false;
        }
        GetRelationMaster getRelationMaster = (GetRelationMaster) obj;
        return l.a(this.mparRelation, getRelationMaster.mparRelation) && l.a(this.statusCode, getRelationMaster.statusCode) && l.a(this.statusDesc, getRelationMaster.statusDesc);
    }

    public final List<MparRelation> getMparRelation() {
        return this.mparRelation;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.mparRelation.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "GetRelationMaster(mparRelation=" + this.mparRelation + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
