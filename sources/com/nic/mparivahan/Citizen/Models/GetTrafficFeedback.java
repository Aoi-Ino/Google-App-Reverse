package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class GetTrafficFeedback {
    private final String statusCode;
    private final String statusDesc;
    private final ArrayList<MparViolationFeedback> violationFeedbacks;

    public GetTrafficFeedback(ArrayList<MparViolationFeedback> arrayList, String str, String str2) {
        l.f(arrayList, "violationFeedbacks");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.violationFeedbacks = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ GetTrafficFeedback copy$default(GetTrafficFeedback getTrafficFeedback, ArrayList<MparViolationFeedback> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = getTrafficFeedback.violationFeedbacks;
        }
        if ((i10 & 2) != 0) {
            str = getTrafficFeedback.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = getTrafficFeedback.statusDesc;
        }
        return getTrafficFeedback.copy(arrayList, str, str2);
    }

    public final ArrayList<MparViolationFeedback> component1() {
        return this.violationFeedbacks;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final GetTrafficFeedback copy(ArrayList<MparViolationFeedback> arrayList, String str, String str2) {
        l.f(arrayList, "violationFeedbacks");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new GetTrafficFeedback(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTrafficFeedback)) {
            return false;
        }
        GetTrafficFeedback getTrafficFeedback = (GetTrafficFeedback) obj;
        return l.a(this.violationFeedbacks, getTrafficFeedback.violationFeedbacks) && l.a(this.statusCode, getTrafficFeedback.statusCode) && l.a(this.statusDesc, getTrafficFeedback.statusDesc);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final ArrayList<MparViolationFeedback> getViolationFeedbacks() {
        return this.violationFeedbacks;
    }

    public int hashCode() {
        return (((this.violationFeedbacks.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "GetTrafficFeedback(violationFeedbacks=" + this.violationFeedbacks + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
