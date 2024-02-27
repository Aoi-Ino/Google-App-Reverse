package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class LearnerLicenceClassResponseModal {
    @c("LLCovs")
    private final ArrayList<LearnerLicenceClasDatasModal> llCovs;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public LearnerLicenceClassResponseModal() {
        this((String) null, (String) null, (ArrayList) null, 7, (g) null);
    }

    public static /* synthetic */ LearnerLicenceClassResponseModal copy$default(LearnerLicenceClassResponseModal learnerLicenceClassResponseModal, String str, String str2, ArrayList<LearnerLicenceClasDatasModal> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = learnerLicenceClassResponseModal.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = learnerLicenceClassResponseModal.statusDesc;
        }
        if ((i10 & 4) != 0) {
            arrayList = learnerLicenceClassResponseModal.llCovs;
        }
        return learnerLicenceClassResponseModal.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final ArrayList<LearnerLicenceClasDatasModal> component3() {
        return this.llCovs;
    }

    public final LearnerLicenceClassResponseModal copy(String str, String str2, ArrayList<LearnerLicenceClasDatasModal> arrayList) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new LearnerLicenceClassResponseModal(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LearnerLicenceClassResponseModal)) {
            return false;
        }
        LearnerLicenceClassResponseModal learnerLicenceClassResponseModal = (LearnerLicenceClassResponseModal) obj;
        return l.a(this.statusCode, learnerLicenceClassResponseModal.statusCode) && l.a(this.statusDesc, learnerLicenceClassResponseModal.statusDesc) && l.a(this.llCovs, learnerLicenceClassResponseModal.llCovs);
    }

    public final ArrayList<LearnerLicenceClasDatasModal> getLlCovs() {
        return this.llCovs;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        int hashCode = ((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31;
        ArrayList<LearnerLicenceClasDatasModal> arrayList = this.llCovs;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "LearnerLicenceClassResponseModal(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", llCovs=" + this.llCovs + ')';
    }

    public LearnerLicenceClassResponseModal(String str, String str2, ArrayList<LearnerLicenceClasDatasModal> arrayList) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
        this.llCovs = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LearnerLicenceClassResponseModal(String str, String str2, ArrayList arrayList, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : arrayList);
    }
}
