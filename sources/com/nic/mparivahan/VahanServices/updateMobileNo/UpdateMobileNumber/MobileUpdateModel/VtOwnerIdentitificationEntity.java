package com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VtOwnerIdentitificationEntity {
    private final String aadharNo;
    private final String emailId;
    private final long mobileNo;

    public VtOwnerIdentitificationEntity(String str, String str2, long j10) {
        this.aadharNo = str;
        this.emailId = str2;
        this.mobileNo = j10;
    }

    public static /* synthetic */ VtOwnerIdentitificationEntity copy$default(VtOwnerIdentitificationEntity vtOwnerIdentitificationEntity, String str, String str2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vtOwnerIdentitificationEntity.aadharNo;
        }
        if ((i10 & 2) != 0) {
            str2 = vtOwnerIdentitificationEntity.emailId;
        }
        if ((i10 & 4) != 0) {
            j10 = vtOwnerIdentitificationEntity.mobileNo;
        }
        return vtOwnerIdentitificationEntity.copy(str, str2, j10);
    }

    public final String component1() {
        return this.aadharNo;
    }

    public final String component2() {
        return this.emailId;
    }

    public final long component3() {
        return this.mobileNo;
    }

    public final VtOwnerIdentitificationEntity copy(String str, String str2, long j10) {
        return new VtOwnerIdentitificationEntity(str, str2, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtOwnerIdentitificationEntity)) {
            return false;
        }
        VtOwnerIdentitificationEntity vtOwnerIdentitificationEntity = (VtOwnerIdentitificationEntity) obj;
        return l.a(this.aadharNo, vtOwnerIdentitificationEntity.aadharNo) && l.a(this.emailId, vtOwnerIdentitificationEntity.emailId) && this.mobileNo == vtOwnerIdentitificationEntity.mobileNo;
    }

    public final String getAadharNo() {
        return this.aadharNo;
    }

    public final String getEmailId() {
        return this.emailId;
    }

    public final long getMobileNo() {
        return this.mobileNo;
    }

    public int hashCode() {
        String str = this.aadharNo;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.emailId;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode + i10) * 31) + Long.hashCode(this.mobileNo);
    }

    public String toString() {
        return "VtOwnerIdentitificationEntity(aadharNo=" + this.aadharNo + ", emailId=" + this.emailId + ", mobileNo=" + this.mobileNo + ')';
    }
}
