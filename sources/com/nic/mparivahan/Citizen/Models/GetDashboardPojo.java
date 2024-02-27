package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class GetDashboardPojo {
    private final ArrayList<Content> contents;
    private final String statusCode;
    private final String statusDesc;

    public GetDashboardPojo(ArrayList<Content> arrayList, String str, String str2) {
        l.f(arrayList, "contents");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.contents = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ GetDashboardPojo copy$default(GetDashboardPojo getDashboardPojo, ArrayList<Content> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = getDashboardPojo.contents;
        }
        if ((i10 & 2) != 0) {
            str = getDashboardPojo.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = getDashboardPojo.statusDesc;
        }
        return getDashboardPojo.copy(arrayList, str, str2);
    }

    public final ArrayList<Content> component1() {
        return this.contents;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final GetDashboardPojo copy(ArrayList<Content> arrayList, String str, String str2) {
        l.f(arrayList, "contents");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new GetDashboardPojo(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetDashboardPojo)) {
            return false;
        }
        GetDashboardPojo getDashboardPojo = (GetDashboardPojo) obj;
        return l.a(this.contents, getDashboardPojo.contents) && l.a(this.statusCode, getDashboardPojo.statusCode) && l.a(this.statusDesc, getDashboardPojo.statusDesc);
    }

    public final ArrayList<Content> getContents() {
        return this.contents;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.contents.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "GetDashboardPojo(contents=" + this.contents + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
