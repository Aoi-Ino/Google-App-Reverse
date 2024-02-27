package com.nic.mparivahan.ServiceWithdrawnScreen.Modal;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class ReasonModal {
    @c("Result")
    private final ArrayList<ReasonResultModal> result;
    @c("status_code")
    private final String statusCd;
    @c("status_desc")
    private final String statusDesc;

    public ReasonModal() {
        this((String) null, (String) null, (ArrayList) null, 7, (g) null);
    }

    public static /* synthetic */ ReasonModal copy$default(ReasonModal reasonModal, String str, String str2, ArrayList<ReasonResultModal> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = reasonModal.statusCd;
        }
        if ((i10 & 2) != 0) {
            str2 = reasonModal.statusDesc;
        }
        if ((i10 & 4) != 0) {
            arrayList = reasonModal.result;
        }
        return reasonModal.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.statusCd;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final ArrayList<ReasonResultModal> component3() {
        return this.result;
    }

    public final ReasonModal copy(String str, String str2, ArrayList<ReasonResultModal> arrayList) {
        l.f(str, "statusCd");
        l.f(str2, "statusDesc");
        return new ReasonModal(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReasonModal)) {
            return false;
        }
        ReasonModal reasonModal = (ReasonModal) obj;
        return l.a(this.statusCd, reasonModal.statusCd) && l.a(this.statusDesc, reasonModal.statusDesc) && l.a(this.result, reasonModal.result);
    }

    public final ArrayList<ReasonResultModal> getResult() {
        return this.result;
    }

    public final String getStatusCd() {
        return this.statusCd;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        int hashCode = ((this.statusCd.hashCode() * 31) + this.statusDesc.hashCode()) * 31;
        ArrayList<ReasonResultModal> arrayList = this.result;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "ReasonModal(statusCd=" + this.statusCd + ", statusDesc=" + this.statusDesc + ", result=" + this.result + ')';
    }

    public ReasonModal(String str, String str2, ArrayList<ReasonResultModal> arrayList) {
        l.f(str, "statusCd");
        l.f(str2, "statusDesc");
        this.statusCd = str;
        this.statusDesc = str2;
        this.result = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReasonModal(String str, String str2, ArrayList arrayList, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : arrayList);
    }
}
