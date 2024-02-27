package com.nic.mparivahan.VahanServices.updateMobileNo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class UpdateMobileOwnerDetailsModel {
    private String owner_name;
    private String regn_no;
    private String state_cd;
    private String state_name;

    public UpdateMobileOwnerDetailsModel(String str, String str2, String str3, String str4) {
        l.f(str, "state_cd");
        l.f(str2, "state_name");
        l.f(str3, "regn_no");
        l.f(str4, "owner_name");
        this.state_cd = str;
        this.state_name = str2;
        this.regn_no = str3;
        this.owner_name = str4;
    }

    public static /* synthetic */ UpdateMobileOwnerDetailsModel copy$default(UpdateMobileOwnerDetailsModel updateMobileOwnerDetailsModel, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updateMobileOwnerDetailsModel.state_cd;
        }
        if ((i10 & 2) != 0) {
            str2 = updateMobileOwnerDetailsModel.state_name;
        }
        if ((i10 & 4) != 0) {
            str3 = updateMobileOwnerDetailsModel.regn_no;
        }
        if ((i10 & 8) != 0) {
            str4 = updateMobileOwnerDetailsModel.owner_name;
        }
        return updateMobileOwnerDetailsModel.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.state_cd;
    }

    public final String component2() {
        return this.state_name;
    }

    public final String component3() {
        return this.regn_no;
    }

    public final String component4() {
        return this.owner_name;
    }

    public final UpdateMobileOwnerDetailsModel copy(String str, String str2, String str3, String str4) {
        l.f(str, "state_cd");
        l.f(str2, "state_name");
        l.f(str3, "regn_no");
        l.f(str4, "owner_name");
        return new UpdateMobileOwnerDetailsModel(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateMobileOwnerDetailsModel)) {
            return false;
        }
        UpdateMobileOwnerDetailsModel updateMobileOwnerDetailsModel = (UpdateMobileOwnerDetailsModel) obj;
        return l.a(this.state_cd, updateMobileOwnerDetailsModel.state_cd) && l.a(this.state_name, updateMobileOwnerDetailsModel.state_name) && l.a(this.regn_no, updateMobileOwnerDetailsModel.regn_no) && l.a(this.owner_name, updateMobileOwnerDetailsModel.owner_name);
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_name() {
        return this.state_name;
    }

    public int hashCode() {
        return (((((this.state_cd.hashCode() * 31) + this.state_name.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.owner_name.hashCode();
    }

    public final void setOwner_name(String str) {
        l.f(str, "<set-?>");
        this.owner_name = str;
    }

    public final void setRegn_no(String str) {
        l.f(str, "<set-?>");
        this.regn_no = str;
    }

    public final void setState_cd(String str) {
        l.f(str, "<set-?>");
        this.state_cd = str;
    }

    public final void setState_name(String str) {
        l.f(str, "<set-?>");
        this.state_name = str;
    }

    public String toString() {
        return "UpdateMobileOwnerDetailsModel(state_cd=" + this.state_cd + ", state_name=" + this.state_name + ", regn_no=" + this.regn_no + ", owner_name=" + this.owner_name + ')';
    }
}
