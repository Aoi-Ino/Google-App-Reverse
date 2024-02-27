package com.nic.mparivahan.VahanServices.updateMobileNo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class UpdateMobileOwnerIdentityModel {
    private String aadhar_no;
    private String email_id;
    private String mobile_no;

    public UpdateMobileOwnerIdentityModel(String str, String str2, String str3) {
        l.f(str, "mobile_no");
        l.f(str2, "email_id");
        l.f(str3, "aadhar_no");
        this.mobile_no = str;
        this.email_id = str2;
        this.aadhar_no = str3;
    }

    public static /* synthetic */ UpdateMobileOwnerIdentityModel copy$default(UpdateMobileOwnerIdentityModel updateMobileOwnerIdentityModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updateMobileOwnerIdentityModel.mobile_no;
        }
        if ((i10 & 2) != 0) {
            str2 = updateMobileOwnerIdentityModel.email_id;
        }
        if ((i10 & 4) != 0) {
            str3 = updateMobileOwnerIdentityModel.aadhar_no;
        }
        return updateMobileOwnerIdentityModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.mobile_no;
    }

    public final String component2() {
        return this.email_id;
    }

    public final String component3() {
        return this.aadhar_no;
    }

    public final UpdateMobileOwnerIdentityModel copy(String str, String str2, String str3) {
        l.f(str, "mobile_no");
        l.f(str2, "email_id");
        l.f(str3, "aadhar_no");
        return new UpdateMobileOwnerIdentityModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateMobileOwnerIdentityModel)) {
            return false;
        }
        UpdateMobileOwnerIdentityModel updateMobileOwnerIdentityModel = (UpdateMobileOwnerIdentityModel) obj;
        return l.a(this.mobile_no, updateMobileOwnerIdentityModel.mobile_no) && l.a(this.email_id, updateMobileOwnerIdentityModel.email_id) && l.a(this.aadhar_no, updateMobileOwnerIdentityModel.aadhar_no);
    }

    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    public final String getEmail_id() {
        return this.email_id;
    }

    public final String getMobile_no() {
        return this.mobile_no;
    }

    public int hashCode() {
        return (((this.mobile_no.hashCode() * 31) + this.email_id.hashCode()) * 31) + this.aadhar_no.hashCode();
    }

    public final void setAadhar_no(String str) {
        l.f(str, "<set-?>");
        this.aadhar_no = str;
    }

    public final void setEmail_id(String str) {
        l.f(str, "<set-?>");
        this.email_id = str;
    }

    public final void setMobile_no(String str) {
        l.f(str, "<set-?>");
        this.mobile_no = str;
    }

    public String toString() {
        return "UpdateMobileOwnerIdentityModel(mobile_no=" + this.mobile_no + ", email_id=" + this.email_id + ", aadhar_no=" + this.aadhar_no + ')';
    }
}
