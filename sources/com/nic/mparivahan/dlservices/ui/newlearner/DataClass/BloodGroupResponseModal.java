package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class BloodGroupResponseModal {
    @c("BloodGroupMaster")
    private final ArrayList<BloodGroupMasterDataModal> bloodGroupMasterData;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public BloodGroupResponseModal() {
        this((String) null, (String) null, (ArrayList) null, 7, (g) null);
    }

    public static /* synthetic */ BloodGroupResponseModal copy$default(BloodGroupResponseModal bloodGroupResponseModal, String str, String str2, ArrayList<BloodGroupMasterDataModal> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bloodGroupResponseModal.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = bloodGroupResponseModal.statusDesc;
        }
        if ((i10 & 4) != 0) {
            arrayList = bloodGroupResponseModal.bloodGroupMasterData;
        }
        return bloodGroupResponseModal.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final ArrayList<BloodGroupMasterDataModal> component3() {
        return this.bloodGroupMasterData;
    }

    public final BloodGroupResponseModal copy(String str, String str2, ArrayList<BloodGroupMasterDataModal> arrayList) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new BloodGroupResponseModal(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BloodGroupResponseModal)) {
            return false;
        }
        BloodGroupResponseModal bloodGroupResponseModal = (BloodGroupResponseModal) obj;
        return l.a(this.statusCode, bloodGroupResponseModal.statusCode) && l.a(this.statusDesc, bloodGroupResponseModal.statusDesc) && l.a(this.bloodGroupMasterData, bloodGroupResponseModal.bloodGroupMasterData);
    }

    public final ArrayList<BloodGroupMasterDataModal> getBloodGroupMasterData() {
        return this.bloodGroupMasterData;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        int hashCode = ((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31;
        ArrayList<BloodGroupMasterDataModal> arrayList = this.bloodGroupMasterData;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "BloodGroupResponseModal(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", bloodGroupMasterData=" + this.bloodGroupMasterData + ')';
    }

    public BloodGroupResponseModal(String str, String str2, ArrayList<BloodGroupMasterDataModal> arrayList) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
        this.bloodGroupMasterData = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BloodGroupResponseModal(String str, String str2, ArrayList arrayList, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : arrayList);
    }
}
