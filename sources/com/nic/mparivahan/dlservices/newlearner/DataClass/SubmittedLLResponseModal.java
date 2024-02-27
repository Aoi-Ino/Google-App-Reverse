package com.nic.mparivahan.dlservices.newlearner.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class SubmittedLLResponseModal {
    @c("NewLLAcknowledgement")
    private final ArrayList<NewLLAcknowledgement> NewLLAcknowledgement;
    @c("status_code")
    private String status_code;
    @c("status_desc")
    private final String status_desc;

    public SubmittedLLResponseModal() {
        this((String) null, (String) null, (ArrayList) null, 7, (g) null);
    }

    public static /* synthetic */ SubmittedLLResponseModal copy$default(SubmittedLLResponseModal submittedLLResponseModal, String str, String str2, ArrayList<NewLLAcknowledgement> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = submittedLLResponseModal.status_code;
        }
        if ((i10 & 2) != 0) {
            str2 = submittedLLResponseModal.status_desc;
        }
        if ((i10 & 4) != 0) {
            arrayList = submittedLLResponseModal.NewLLAcknowledgement;
        }
        return submittedLLResponseModal.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.status_code;
    }

    public final String component2() {
        return this.status_desc;
    }

    public final ArrayList<NewLLAcknowledgement> component3() {
        return this.NewLLAcknowledgement;
    }

    public final SubmittedLLResponseModal copy(String str, String str2, ArrayList<NewLLAcknowledgement> arrayList) {
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        return new SubmittedLLResponseModal(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmittedLLResponseModal)) {
            return false;
        }
        SubmittedLLResponseModal submittedLLResponseModal = (SubmittedLLResponseModal) obj;
        return l.a(this.status_code, submittedLLResponseModal.status_code) && l.a(this.status_desc, submittedLLResponseModal.status_desc) && l.a(this.NewLLAcknowledgement, submittedLLResponseModal.NewLLAcknowledgement);
    }

    public final ArrayList<NewLLAcknowledgement> getNewLLAcknowledgement() {
        return this.NewLLAcknowledgement;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        int hashCode = ((this.status_code.hashCode() * 31) + this.status_desc.hashCode()) * 31;
        ArrayList<NewLLAcknowledgement> arrayList = this.NewLLAcknowledgement;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public final void setStatus_code(String str) {
        l.f(str, "<set-?>");
        this.status_code = str;
    }

    public String toString() {
        return "SubmittedLLResponseModal(status_code=" + this.status_code + ", status_desc=" + this.status_desc + ", NewLLAcknowledgement=" + this.NewLLAcknowledgement + ')';
    }

    public SubmittedLLResponseModal(String str, String str2, ArrayList<NewLLAcknowledgement> arrayList) {
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        this.status_code = str;
        this.status_desc = str2;
        this.NewLLAcknowledgement = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SubmittedLLResponseModal(String str, String str2, ArrayList arrayList, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : arrayList);
    }
}
