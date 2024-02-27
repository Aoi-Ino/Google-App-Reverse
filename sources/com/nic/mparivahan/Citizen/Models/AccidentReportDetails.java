package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class AccidentReportDetails {
    private final ArrayList<MparCitizenAccident> mparCitizenAccidents;
    private final String statusCode;
    private final String statusDesc;

    public AccidentReportDetails(ArrayList<MparCitizenAccident> arrayList, String str, String str2) {
        l.f(arrayList, "mparCitizenAccidents");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.mparCitizenAccidents = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ AccidentReportDetails copy$default(AccidentReportDetails accidentReportDetails, ArrayList<MparCitizenAccident> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = accidentReportDetails.mparCitizenAccidents;
        }
        if ((i10 & 2) != 0) {
            str = accidentReportDetails.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = accidentReportDetails.statusDesc;
        }
        return accidentReportDetails.copy(arrayList, str, str2);
    }

    public final ArrayList<MparCitizenAccident> component1() {
        return this.mparCitizenAccidents;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final AccidentReportDetails copy(ArrayList<MparCitizenAccident> arrayList, String str, String str2) {
        l.f(arrayList, "mparCitizenAccidents");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new AccidentReportDetails(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccidentReportDetails)) {
            return false;
        }
        AccidentReportDetails accidentReportDetails = (AccidentReportDetails) obj;
        return l.a(this.mparCitizenAccidents, accidentReportDetails.mparCitizenAccidents) && l.a(this.statusCode, accidentReportDetails.statusCode) && l.a(this.statusDesc, accidentReportDetails.statusDesc);
    }

    public final ArrayList<MparCitizenAccident> getMparCitizenAccidents() {
        return this.mparCitizenAccidents;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.mparCitizenAccidents.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "AccidentReportDetails(mparCitizenAccidents=" + this.mparCitizenAccidents + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
