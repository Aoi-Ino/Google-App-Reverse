package com.nic.mparivahan.NewDlScreen.Modal;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class DrivingSchoolModal {
    @c("StateWiseDSList")
    private final ArrayList<StateWiseDrivingSchoolList> stateWiseSchoolList;
    @c("status_code")
    private final String statusCd;
    @c("status_desc")
    private final String statusDesc;

    public DrivingSchoolModal() {
        this((String) null, (String) null, (ArrayList) null, 7, (g) null);
    }

    public static /* synthetic */ DrivingSchoolModal copy$default(DrivingSchoolModal drivingSchoolModal, String str, String str2, ArrayList<StateWiseDrivingSchoolList> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = drivingSchoolModal.statusCd;
        }
        if ((i10 & 2) != 0) {
            str2 = drivingSchoolModal.statusDesc;
        }
        if ((i10 & 4) != 0) {
            arrayList = drivingSchoolModal.stateWiseSchoolList;
        }
        return drivingSchoolModal.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.statusCd;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final ArrayList<StateWiseDrivingSchoolList> component3() {
        return this.stateWiseSchoolList;
    }

    public final DrivingSchoolModal copy(String str, String str2, ArrayList<StateWiseDrivingSchoolList> arrayList) {
        l.f(str, "statusCd");
        l.f(str2, "statusDesc");
        return new DrivingSchoolModal(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrivingSchoolModal)) {
            return false;
        }
        DrivingSchoolModal drivingSchoolModal = (DrivingSchoolModal) obj;
        return l.a(this.statusCd, drivingSchoolModal.statusCd) && l.a(this.statusDesc, drivingSchoolModal.statusDesc) && l.a(this.stateWiseSchoolList, drivingSchoolModal.stateWiseSchoolList);
    }

    public final ArrayList<StateWiseDrivingSchoolList> getStateWiseSchoolList() {
        return this.stateWiseSchoolList;
    }

    public final String getStatusCd() {
        return this.statusCd;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        int hashCode = ((this.statusCd.hashCode() * 31) + this.statusDesc.hashCode()) * 31;
        ArrayList<StateWiseDrivingSchoolList> arrayList = this.stateWiseSchoolList;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "DrivingSchoolModal(statusCd=" + this.statusCd + ", statusDesc=" + this.statusDesc + ", stateWiseSchoolList=" + this.stateWiseSchoolList + ')';
    }

    public DrivingSchoolModal(String str, String str2, ArrayList<StateWiseDrivingSchoolList> arrayList) {
        l.f(str, "statusCd");
        l.f(str2, "statusDesc");
        this.statusCd = str;
        this.statusDesc = str2;
        this.stateWiseSchoolList = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DrivingSchoolModal(String str, String str2, ArrayList arrayList, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : arrayList);
    }
}
