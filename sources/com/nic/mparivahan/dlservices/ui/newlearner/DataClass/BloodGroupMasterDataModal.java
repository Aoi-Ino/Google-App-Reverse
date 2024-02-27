package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class BloodGroupMasterDataModal {
    @c("bloodGroup_code")
    private final String bloodGroupCode;
    @c("bloodGroup_name")
    private final String bloodGroupName;
    @c("UC01-E232")
    private final String masterNotAvailable;

    public BloodGroupMasterDataModal() {
        this((String) null, (String) null, (String) null, 7, (g) null);
    }

    public static /* synthetic */ BloodGroupMasterDataModal copy$default(BloodGroupMasterDataModal bloodGroupMasterDataModal, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bloodGroupMasterDataModal.bloodGroupCode;
        }
        if ((i10 & 2) != 0) {
            str2 = bloodGroupMasterDataModal.bloodGroupName;
        }
        if ((i10 & 4) != 0) {
            str3 = bloodGroupMasterDataModal.masterNotAvailable;
        }
        return bloodGroupMasterDataModal.copy(str, str2, str3);
    }

    public final String component1() {
        return this.bloodGroupCode;
    }

    public final String component2() {
        return this.bloodGroupName;
    }

    public final String component3() {
        return this.masterNotAvailable;
    }

    public final BloodGroupMasterDataModal copy(String str, String str2, String str3) {
        l.f(str, "bloodGroupCode");
        l.f(str2, "bloodGroupName");
        l.f(str3, "masterNotAvailable");
        return new BloodGroupMasterDataModal(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BloodGroupMasterDataModal)) {
            return false;
        }
        BloodGroupMasterDataModal bloodGroupMasterDataModal = (BloodGroupMasterDataModal) obj;
        return l.a(this.bloodGroupCode, bloodGroupMasterDataModal.bloodGroupCode) && l.a(this.bloodGroupName, bloodGroupMasterDataModal.bloodGroupName) && l.a(this.masterNotAvailable, bloodGroupMasterDataModal.masterNotAvailable);
    }

    public final String getBloodGroupCode() {
        return this.bloodGroupCode;
    }

    public final String getBloodGroupName() {
        return this.bloodGroupName;
    }

    public final String getMasterNotAvailable() {
        return this.masterNotAvailable;
    }

    public int hashCode() {
        return (((this.bloodGroupCode.hashCode() * 31) + this.bloodGroupName.hashCode()) * 31) + this.masterNotAvailable.hashCode();
    }

    public String toString() {
        return "BloodGroupMasterDataModal(bloodGroupCode=" + this.bloodGroupCode + ", bloodGroupName=" + this.bloodGroupName + ", masterNotAvailable=" + this.masterNotAvailable + ')';
    }

    public BloodGroupMasterDataModal(String str, String str2, String str3) {
        l.f(str, "bloodGroupCode");
        l.f(str2, "bloodGroupName");
        l.f(str3, "masterNotAvailable");
        this.bloodGroupCode = str;
        this.bloodGroupName = str2;
        this.masterNotAvailable = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BloodGroupMasterDataModal(String str, String str2, String str3, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3);
    }
}
