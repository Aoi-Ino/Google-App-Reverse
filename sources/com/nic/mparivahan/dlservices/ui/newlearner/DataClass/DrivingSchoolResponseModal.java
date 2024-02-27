package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class DrivingSchoolResponseModal {
    @c("DrivingSchoolMaster")
    private final ArrayList<DrivingSchoolMasterModal> drivingSchoolMasterList;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public DrivingSchoolResponseModal() {
        this((String) null, (String) null, (ArrayList) null, 7, (g) null);
    }

    public static /* synthetic */ DrivingSchoolResponseModal copy$default(DrivingSchoolResponseModal drivingSchoolResponseModal, String str, String str2, ArrayList<DrivingSchoolMasterModal> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = drivingSchoolResponseModal.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = drivingSchoolResponseModal.statusDesc;
        }
        if ((i10 & 4) != 0) {
            arrayList = drivingSchoolResponseModal.drivingSchoolMasterList;
        }
        return drivingSchoolResponseModal.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final ArrayList<DrivingSchoolMasterModal> component3() {
        return this.drivingSchoolMasterList;
    }

    public final DrivingSchoolResponseModal copy(String str, String str2, ArrayList<DrivingSchoolMasterModal> arrayList) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new DrivingSchoolResponseModal(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrivingSchoolResponseModal)) {
            return false;
        }
        DrivingSchoolResponseModal drivingSchoolResponseModal = (DrivingSchoolResponseModal) obj;
        return l.a(this.statusCode, drivingSchoolResponseModal.statusCode) && l.a(this.statusDesc, drivingSchoolResponseModal.statusDesc) && l.a(this.drivingSchoolMasterList, drivingSchoolResponseModal.drivingSchoolMasterList);
    }

    public final ArrayList<DrivingSchoolMasterModal> getDrivingSchoolMasterList() {
        return this.drivingSchoolMasterList;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        int hashCode = ((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31;
        ArrayList<DrivingSchoolMasterModal> arrayList = this.drivingSchoolMasterList;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "DrivingSchoolResponseModal(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", drivingSchoolMasterList=" + this.drivingSchoolMasterList + ')';
    }

    public DrivingSchoolResponseModal(String str, String str2, ArrayList<DrivingSchoolMasterModal> arrayList) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
        this.drivingSchoolMasterList = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DrivingSchoolResponseModal(String str, String str2, ArrayList arrayList, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : arrayList);
    }
}
