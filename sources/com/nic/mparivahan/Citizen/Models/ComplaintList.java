package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class ComplaintList {
    private final ArrayList<MparCitizenViolationX> citizenViolations;
    private final String statusCode;
    private final String statusDesc;

    public ComplaintList(ArrayList<MparCitizenViolationX> arrayList, String str, String str2) {
        l.f(arrayList, "citizenViolations");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.citizenViolations = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ ComplaintList copy$default(ComplaintList complaintList, ArrayList<MparCitizenViolationX> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = complaintList.citizenViolations;
        }
        if ((i10 & 2) != 0) {
            str = complaintList.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = complaintList.statusDesc;
        }
        return complaintList.copy(arrayList, str, str2);
    }

    public final ArrayList<MparCitizenViolationX> component1() {
        return this.citizenViolations;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final ComplaintList copy(ArrayList<MparCitizenViolationX> arrayList, String str, String str2) {
        l.f(arrayList, "citizenViolations");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new ComplaintList(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplaintList)) {
            return false;
        }
        ComplaintList complaintList = (ComplaintList) obj;
        return l.a(this.citizenViolations, complaintList.citizenViolations) && l.a(this.statusCode, complaintList.statusCode) && l.a(this.statusDesc, complaintList.statusDesc);
    }

    public final ArrayList<MparCitizenViolationX> getCitizenViolations() {
        return this.citizenViolations;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.citizenViolations.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "ComplaintList(citizenViolations=" + this.citizenViolations + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
