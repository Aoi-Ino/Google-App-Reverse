package com.nic.mparivahan.ServiceWithdrawnScreen.Modal;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class AppliedServiceResultModal {
    @c("Applied Cov")
    private final String appliedCov;
    @c("Applied Service")
    private final String appliedService;
    @c("Previous Withdrawn ")
    private final String previousWithDrawn;
    @c("status")
    private final String status;

    public AppliedServiceResultModal() {
        this((String) null, (String) null, (String) null, (String) null, 15, (g) null);
    }

    public static /* synthetic */ AppliedServiceResultModal copy$default(AppliedServiceResultModal appliedServiceResultModal, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appliedServiceResultModal.previousWithDrawn;
        }
        if ((i10 & 2) != 0) {
            str2 = appliedServiceResultModal.appliedService;
        }
        if ((i10 & 4) != 0) {
            str3 = appliedServiceResultModal.appliedCov;
        }
        if ((i10 & 8) != 0) {
            str4 = appliedServiceResultModal.status;
        }
        return appliedServiceResultModal.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.previousWithDrawn;
    }

    public final String component2() {
        return this.appliedService;
    }

    public final String component3() {
        return this.appliedCov;
    }

    public final String component4() {
        return this.status;
    }

    public final AppliedServiceResultModal copy(String str, String str2, String str3, String str4) {
        l.f(str, "previousWithDrawn");
        l.f(str2, "appliedService");
        l.f(str3, "appliedCov");
        l.f(str4, "status");
        return new AppliedServiceResultModal(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppliedServiceResultModal)) {
            return false;
        }
        AppliedServiceResultModal appliedServiceResultModal = (AppliedServiceResultModal) obj;
        return l.a(this.previousWithDrawn, appliedServiceResultModal.previousWithDrawn) && l.a(this.appliedService, appliedServiceResultModal.appliedService) && l.a(this.appliedCov, appliedServiceResultModal.appliedCov) && l.a(this.status, appliedServiceResultModal.status);
    }

    public final String getAppliedCov() {
        return this.appliedCov;
    }

    public final String getAppliedService() {
        return this.appliedService;
    }

    public final String getPreviousWithDrawn() {
        return this.previousWithDrawn;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.previousWithDrawn.hashCode() * 31) + this.appliedService.hashCode()) * 31) + this.appliedCov.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "AppliedServiceResultModal(previousWithDrawn=" + this.previousWithDrawn + ", appliedService=" + this.appliedService + ", appliedCov=" + this.appliedCov + ", status=" + this.status + ')';
    }

    public AppliedServiceResultModal(String str, String str2, String str3, String str4) {
        l.f(str, "previousWithDrawn");
        l.f(str2, "appliedService");
        l.f(str3, "appliedCov");
        l.f(str4, "status");
        this.previousWithDrawn = str;
        this.appliedService = str2;
        this.appliedCov = str3;
        this.status = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppliedServiceResultModal(String str, String str2, String str3, String str4, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
