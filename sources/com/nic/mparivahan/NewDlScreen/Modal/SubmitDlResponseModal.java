package com.nic.mparivahan.NewDlScreen.Modal;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class SubmitDlResponseModal {
    @c("msg")
    private final String msg;
    @c("status_code")
    private final String statusCd;
    @c("status_desc")
    private final String statusDesc;
    @c("DLDetails")
    private final ArrayList<SubmittedDlDetailsModal> submittedDlDetails;

    public SubmitDlResponseModal(String str, String str2, String str3, ArrayList<SubmittedDlDetailsModal> arrayList) {
        l.f(str, "statusCd");
        l.f(str2, "statusDesc");
        l.f(str3, "msg");
        this.statusCd = str;
        this.statusDesc = str2;
        this.msg = str3;
        this.submittedDlDetails = arrayList;
    }

    public static /* synthetic */ SubmitDlResponseModal copy$default(SubmitDlResponseModal submitDlResponseModal, String str, String str2, String str3, ArrayList<SubmittedDlDetailsModal> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = submitDlResponseModal.statusCd;
        }
        if ((i10 & 2) != 0) {
            str2 = submitDlResponseModal.statusDesc;
        }
        if ((i10 & 4) != 0) {
            str3 = submitDlResponseModal.msg;
        }
        if ((i10 & 8) != 0) {
            arrayList = submitDlResponseModal.submittedDlDetails;
        }
        return submitDlResponseModal.copy(str, str2, str3, arrayList);
    }

    public final String component1() {
        return this.statusCd;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final String component3() {
        return this.msg;
    }

    public final ArrayList<SubmittedDlDetailsModal> component4() {
        return this.submittedDlDetails;
    }

    public final SubmitDlResponseModal copy(String str, String str2, String str3, ArrayList<SubmittedDlDetailsModal> arrayList) {
        l.f(str, "statusCd");
        l.f(str2, "statusDesc");
        l.f(str3, "msg");
        return new SubmitDlResponseModal(str, str2, str3, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitDlResponseModal)) {
            return false;
        }
        SubmitDlResponseModal submitDlResponseModal = (SubmitDlResponseModal) obj;
        return l.a(this.statusCd, submitDlResponseModal.statusCd) && l.a(this.statusDesc, submitDlResponseModal.statusDesc) && l.a(this.msg, submitDlResponseModal.msg) && l.a(this.submittedDlDetails, submitDlResponseModal.submittedDlDetails);
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getStatusCd() {
        return this.statusCd;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final ArrayList<SubmittedDlDetailsModal> getSubmittedDlDetails() {
        return this.submittedDlDetails;
    }

    public int hashCode() {
        int hashCode = ((((this.statusCd.hashCode() * 31) + this.statusDesc.hashCode()) * 31) + this.msg.hashCode()) * 31;
        ArrayList<SubmittedDlDetailsModal> arrayList = this.submittedDlDetails;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "SubmitDlResponseModal(statusCd=" + this.statusCd + ", statusDesc=" + this.statusDesc + ", msg=" + this.msg + ", submittedDlDetails=" + this.submittedDlDetails + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SubmitDlResponseModal(String str, String str2, String str3, ArrayList arrayList, int i10, g gVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : arrayList);
    }
}
