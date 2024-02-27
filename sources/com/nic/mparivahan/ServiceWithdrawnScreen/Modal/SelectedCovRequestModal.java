package com.nic.mparivahan.ServiceWithdrawnScreen.Modal;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SelectedCovRequestModal {
    private final String appliedCov;
    private final String appliedService;
    private final String confirmation;
    private final String remarks;
    private final String status;

    public SelectedCovRequestModal(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "confirmation");
        l.f(str2, "remarks");
        l.f(str3, "appliedService");
        l.f(str4, "appliedCov");
        l.f(str5, "status");
        this.confirmation = str;
        this.remarks = str2;
        this.appliedService = str3;
        this.appliedCov = str4;
        this.status = str5;
    }

    public static /* synthetic */ SelectedCovRequestModal copy$default(SelectedCovRequestModal selectedCovRequestModal, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = selectedCovRequestModal.confirmation;
        }
        if ((i10 & 2) != 0) {
            str2 = selectedCovRequestModal.remarks;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = selectedCovRequestModal.appliedService;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = selectedCovRequestModal.appliedCov;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = selectedCovRequestModal.status;
        }
        return selectedCovRequestModal.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.confirmation;
    }

    public final String component2() {
        return this.remarks;
    }

    public final String component3() {
        return this.appliedService;
    }

    public final String component4() {
        return this.appliedCov;
    }

    public final String component5() {
        return this.status;
    }

    public final SelectedCovRequestModal copy(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "confirmation");
        l.f(str2, "remarks");
        l.f(str3, "appliedService");
        l.f(str4, "appliedCov");
        l.f(str5, "status");
        return new SelectedCovRequestModal(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedCovRequestModal)) {
            return false;
        }
        SelectedCovRequestModal selectedCovRequestModal = (SelectedCovRequestModal) obj;
        return l.a(this.confirmation, selectedCovRequestModal.confirmation) && l.a(this.remarks, selectedCovRequestModal.remarks) && l.a(this.appliedService, selectedCovRequestModal.appliedService) && l.a(this.appliedCov, selectedCovRequestModal.appliedCov) && l.a(this.status, selectedCovRequestModal.status);
    }

    public final String getAppliedCov() {
        return this.appliedCov;
    }

    public final String getAppliedService() {
        return this.appliedService;
    }

    public final String getConfirmation() {
        return this.confirmation;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((this.confirmation.hashCode() * 31) + this.remarks.hashCode()) * 31) + this.appliedService.hashCode()) * 31) + this.appliedCov.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "SelectedCovRequestModal(confirmation=" + this.confirmation + ", remarks=" + this.remarks + ", appliedService=" + this.appliedService + ", appliedCov=" + this.appliedCov + ", status=" + this.status + ')';
    }
}
