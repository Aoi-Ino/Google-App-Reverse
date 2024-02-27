package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class GetOffenceList {
    private final ArrayList<MparOffence> mparOffenceList;
    private final String statusCode;
    private final String statusDesc;

    public GetOffenceList(ArrayList<MparOffence> arrayList, String str, String str2) {
        l.f(arrayList, "mparOffenceList");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.mparOffenceList = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ GetOffenceList copy$default(GetOffenceList getOffenceList, ArrayList<MparOffence> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = getOffenceList.mparOffenceList;
        }
        if ((i10 & 2) != 0) {
            str = getOffenceList.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = getOffenceList.statusDesc;
        }
        return getOffenceList.copy(arrayList, str, str2);
    }

    public final ArrayList<MparOffence> component1() {
        return this.mparOffenceList;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final GetOffenceList copy(ArrayList<MparOffence> arrayList, String str, String str2) {
        l.f(arrayList, "mparOffenceList");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new GetOffenceList(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetOffenceList)) {
            return false;
        }
        GetOffenceList getOffenceList = (GetOffenceList) obj;
        return l.a(this.mparOffenceList, getOffenceList.mparOffenceList) && l.a(this.statusCode, getOffenceList.statusCode) && l.a(this.statusDesc, getOffenceList.statusDesc);
    }

    public final ArrayList<MparOffence> getMparOffenceList() {
        return this.mparOffenceList;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.mparOffenceList.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "GetOffenceList(mparOffenceList=" + this.mparOffenceList + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
