package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SubmitOffenceReport {
    private final String statusCode;
    private final String statusDesc;

    public SubmitOffenceReport(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ SubmitOffenceReport copy$default(SubmitOffenceReport submitOffenceReport, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = submitOffenceReport.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = submitOffenceReport.statusDesc;
        }
        return submitOffenceReport.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final SubmitOffenceReport copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new SubmitOffenceReport(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitOffenceReport)) {
            return false;
        }
        SubmitOffenceReport submitOffenceReport = (SubmitOffenceReport) obj;
        return l.a(this.statusCode, submitOffenceReport.statusCode) && l.a(this.statusDesc, submitOffenceReport.statusDesc);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (this.statusCode.hashCode() * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "SubmitOffenceReport(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
