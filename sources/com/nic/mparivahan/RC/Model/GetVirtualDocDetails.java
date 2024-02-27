package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public final class GetVirtualDocDetails implements Serializable {
    private final ArrayList<MparCitizenDocInfo> mparCitizenDocInfo;
    private final String statusCode;
    private final String statusDesc;

    public GetVirtualDocDetails(ArrayList<MparCitizenDocInfo> arrayList, String str, String str2) {
        l.f(arrayList, "mparCitizenDocInfo");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.mparCitizenDocInfo = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ GetVirtualDocDetails copy$default(GetVirtualDocDetails getVirtualDocDetails, ArrayList<MparCitizenDocInfo> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = getVirtualDocDetails.mparCitizenDocInfo;
        }
        if ((i10 & 2) != 0) {
            str = getVirtualDocDetails.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = getVirtualDocDetails.statusDesc;
        }
        return getVirtualDocDetails.copy(arrayList, str, str2);
    }

    public final ArrayList<MparCitizenDocInfo> component1() {
        return this.mparCitizenDocInfo;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final GetVirtualDocDetails copy(ArrayList<MparCitizenDocInfo> arrayList, String str, String str2) {
        l.f(arrayList, "mparCitizenDocInfo");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new GetVirtualDocDetails(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetVirtualDocDetails)) {
            return false;
        }
        GetVirtualDocDetails getVirtualDocDetails = (GetVirtualDocDetails) obj;
        return l.a(this.mparCitizenDocInfo, getVirtualDocDetails.mparCitizenDocInfo) && l.a(this.statusCode, getVirtualDocDetails.statusCode) && l.a(this.statusDesc, getVirtualDocDetails.statusDesc);
    }

    public final ArrayList<MparCitizenDocInfo> getMparCitizenDocInfo() {
        return this.mparCitizenDocInfo;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.mparCitizenDocInfo.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "GetVirtualDocDetails(mparCitizenDocInfo=" + this.mparCitizenDocInfo + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
