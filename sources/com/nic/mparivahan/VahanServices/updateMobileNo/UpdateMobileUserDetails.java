package com.nic.mparivahan.VahanServices.updateMobileNo;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class UpdateMobileUserDetails {
    private String errorDesc;
    private String errorcode;
    private ArrayList<UpdateMobileOwnerDetailsModel> ownerDetailEntity;
    private boolean renderAdharDtls;
    private ArrayList<UpdateMobileOwnerIdentityModel> vtOwnerIdentitificationEntity;

    public UpdateMobileUserDetails(boolean z10, ArrayList<UpdateMobileOwnerDetailsModel> arrayList, ArrayList<UpdateMobileOwnerIdentityModel> arrayList2, String str, String str2) {
        l.f(arrayList, "ownerDetailEntity");
        l.f(arrayList2, "vtOwnerIdentitificationEntity");
        this.renderAdharDtls = z10;
        this.ownerDetailEntity = arrayList;
        this.vtOwnerIdentitificationEntity = arrayList2;
        this.errorcode = str;
        this.errorDesc = str2;
    }

    public static /* synthetic */ UpdateMobileUserDetails copy$default(UpdateMobileUserDetails updateMobileUserDetails, boolean z10, ArrayList<UpdateMobileOwnerDetailsModel> arrayList, ArrayList<UpdateMobileOwnerIdentityModel> arrayList2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = updateMobileUserDetails.renderAdharDtls;
        }
        if ((i10 & 2) != 0) {
            arrayList = updateMobileUserDetails.ownerDetailEntity;
        }
        ArrayList<UpdateMobileOwnerDetailsModel> arrayList3 = arrayList;
        if ((i10 & 4) != 0) {
            arrayList2 = updateMobileUserDetails.vtOwnerIdentitificationEntity;
        }
        ArrayList<UpdateMobileOwnerIdentityModel> arrayList4 = arrayList2;
        if ((i10 & 8) != 0) {
            str = updateMobileUserDetails.errorcode;
        }
        String str3 = str;
        if ((i10 & 16) != 0) {
            str2 = updateMobileUserDetails.errorDesc;
        }
        return updateMobileUserDetails.copy(z10, arrayList3, arrayList4, str3, str2);
    }

    public final boolean component1() {
        return this.renderAdharDtls;
    }

    public final ArrayList<UpdateMobileOwnerDetailsModel> component2() {
        return this.ownerDetailEntity;
    }

    public final ArrayList<UpdateMobileOwnerIdentityModel> component3() {
        return this.vtOwnerIdentitificationEntity;
    }

    public final String component4() {
        return this.errorcode;
    }

    public final String component5() {
        return this.errorDesc;
    }

    public final UpdateMobileUserDetails copy(boolean z10, ArrayList<UpdateMobileOwnerDetailsModel> arrayList, ArrayList<UpdateMobileOwnerIdentityModel> arrayList2, String str, String str2) {
        l.f(arrayList, "ownerDetailEntity");
        l.f(arrayList2, "vtOwnerIdentitificationEntity");
        return new UpdateMobileUserDetails(z10, arrayList, arrayList2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateMobileUserDetails)) {
            return false;
        }
        UpdateMobileUserDetails updateMobileUserDetails = (UpdateMobileUserDetails) obj;
        return this.renderAdharDtls == updateMobileUserDetails.renderAdharDtls && l.a(this.ownerDetailEntity, updateMobileUserDetails.ownerDetailEntity) && l.a(this.vtOwnerIdentitificationEntity, updateMobileUserDetails.vtOwnerIdentitificationEntity) && l.a(this.errorcode, updateMobileUserDetails.errorcode) && l.a(this.errorDesc, updateMobileUserDetails.errorDesc);
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final String getErrorcode() {
        return this.errorcode;
    }

    public final ArrayList<UpdateMobileOwnerDetailsModel> getOwnerDetailEntity() {
        return this.ownerDetailEntity;
    }

    public final boolean getRenderAdharDtls() {
        return this.renderAdharDtls;
    }

    public final ArrayList<UpdateMobileOwnerIdentityModel> getVtOwnerIdentitificationEntity() {
        return this.vtOwnerIdentitificationEntity;
    }

    public int hashCode() {
        boolean z10 = this.renderAdharDtls;
        if (z10) {
            z10 = true;
        }
        int hashCode = (((((z10 ? 1 : 0) * true) + this.ownerDetailEntity.hashCode()) * 31) + this.vtOwnerIdentitificationEntity.hashCode()) * 31;
        String str = this.errorcode;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorDesc;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public final void setErrorDesc(String str) {
        this.errorDesc = str;
    }

    public final void setErrorcode(String str) {
        this.errorcode = str;
    }

    public final void setOwnerDetailEntity(ArrayList<UpdateMobileOwnerDetailsModel> arrayList) {
        l.f(arrayList, "<set-?>");
        this.ownerDetailEntity = arrayList;
    }

    public final void setRenderAdharDtls(boolean z10) {
        this.renderAdharDtls = z10;
    }

    public final void setVtOwnerIdentitificationEntity(ArrayList<UpdateMobileOwnerIdentityModel> arrayList) {
        l.f(arrayList, "<set-?>");
        this.vtOwnerIdentitificationEntity = arrayList;
    }

    public String toString() {
        return "UpdateMobileUserDetails(renderAdharDtls=" + this.renderAdharDtls + ", ownerDetailEntity=" + this.ownerDetailEntity + ", vtOwnerIdentitificationEntity=" + this.vtOwnerIdentitificationEntity + ", errorcode=" + this.errorcode + ", errorDesc=" + this.errorDesc + ')';
    }
}
