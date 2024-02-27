package com.nic.mparivahan.ServiceWithdrawnScreen.Modal;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class CheckApplicationEligibilityModal {
    @c("Result")
    private final ArrayList<ApplicationEligilityResultModal> result;
    @c("status")
    private final String status;
    @c("status_code")
    private final String statusCd;

    public CheckApplicationEligibilityModal() {
        this((String) null, (String) null, (ArrayList) null, 7, (g) null);
    }

    public static /* synthetic */ CheckApplicationEligibilityModal copy$default(CheckApplicationEligibilityModal checkApplicationEligibilityModal, String str, String str2, ArrayList<ApplicationEligilityResultModal> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = checkApplicationEligibilityModal.statusCd;
        }
        if ((i10 & 2) != 0) {
            str2 = checkApplicationEligibilityModal.status;
        }
        if ((i10 & 4) != 0) {
            arrayList = checkApplicationEligibilityModal.result;
        }
        return checkApplicationEligibilityModal.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.statusCd;
    }

    public final String component2() {
        return this.status;
    }

    public final ArrayList<ApplicationEligilityResultModal> component3() {
        return this.result;
    }

    public final CheckApplicationEligibilityModal copy(String str, String str2, ArrayList<ApplicationEligilityResultModal> arrayList) {
        l.f(str, "statusCd");
        l.f(str2, "status");
        return new CheckApplicationEligibilityModal(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckApplicationEligibilityModal)) {
            return false;
        }
        CheckApplicationEligibilityModal checkApplicationEligibilityModal = (CheckApplicationEligibilityModal) obj;
        return l.a(this.statusCd, checkApplicationEligibilityModal.statusCd) && l.a(this.status, checkApplicationEligibilityModal.status) && l.a(this.result, checkApplicationEligibilityModal.result);
    }

    public final ArrayList<ApplicationEligilityResultModal> getResult() {
        return this.result;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusCd() {
        return this.statusCd;
    }

    public int hashCode() {
        int hashCode = ((this.statusCd.hashCode() * 31) + this.status.hashCode()) * 31;
        ArrayList<ApplicationEligilityResultModal> arrayList = this.result;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "CheckApplicationEligibilityModal(statusCd=" + this.statusCd + ", status=" + this.status + ", result=" + this.result + ')';
    }

    public CheckApplicationEligibilityModal(String str, String str2, ArrayList<ApplicationEligilityResultModal> arrayList) {
        l.f(str, "statusCd");
        l.f(str2, "status");
        this.statusCd = str;
        this.status = str2;
        this.result = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckApplicationEligibilityModal(String str, String str2, ArrayList arrayList, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : arrayList);
    }
}
