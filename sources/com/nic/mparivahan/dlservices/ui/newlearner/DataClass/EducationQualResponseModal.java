package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class EducationQualResponseModal {
    @c("QualificationMaster")
    private final ArrayList<QualificationMasterDataModal> qualificationMasterData;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public EducationQualResponseModal() {
        this((String) null, (String) null, (ArrayList) null, 7, (g) null);
    }

    public static /* synthetic */ EducationQualResponseModal copy$default(EducationQualResponseModal educationQualResponseModal, String str, String str2, ArrayList<QualificationMasterDataModal> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = educationQualResponseModal.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = educationQualResponseModal.statusDesc;
        }
        if ((i10 & 4) != 0) {
            arrayList = educationQualResponseModal.qualificationMasterData;
        }
        return educationQualResponseModal.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final ArrayList<QualificationMasterDataModal> component3() {
        return this.qualificationMasterData;
    }

    public final EducationQualResponseModal copy(String str, String str2, ArrayList<QualificationMasterDataModal> arrayList) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new EducationQualResponseModal(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationQualResponseModal)) {
            return false;
        }
        EducationQualResponseModal educationQualResponseModal = (EducationQualResponseModal) obj;
        return l.a(this.statusCode, educationQualResponseModal.statusCode) && l.a(this.statusDesc, educationQualResponseModal.statusDesc) && l.a(this.qualificationMasterData, educationQualResponseModal.qualificationMasterData);
    }

    public final ArrayList<QualificationMasterDataModal> getQualificationMasterData() {
        return this.qualificationMasterData;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        int hashCode = ((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31;
        ArrayList<QualificationMasterDataModal> arrayList = this.qualificationMasterData;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "EducationQualResponseModal(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", qualificationMasterData=" + this.qualificationMasterData + ')';
    }

    public EducationQualResponseModal(String str, String str2, ArrayList<QualificationMasterDataModal> arrayList) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
        this.qualificationMasterData = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EducationQualResponseModal(String str, String str2, ArrayList arrayList, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : arrayList);
    }
}
