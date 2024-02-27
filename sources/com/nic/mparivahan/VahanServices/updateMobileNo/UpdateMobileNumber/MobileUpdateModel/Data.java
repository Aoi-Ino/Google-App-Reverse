package com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class Data {
    private final List<OwnerDetailEntity> ownerDetailEntity;
    private final boolean renderAdharDtls;
    private final List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity;

    public Data(List<OwnerDetailEntity> list, boolean z10, List<VtOwnerIdentitificationEntity> list2) {
        this.ownerDetailEntity = list;
        this.renderAdharDtls = z10;
        this.vtOwnerIdentitificationEntity = list2;
    }

    public static /* synthetic */ Data copy$default(Data data, List<OwnerDetailEntity> list, boolean z10, List<VtOwnerIdentitificationEntity> list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = data.ownerDetailEntity;
        }
        if ((i10 & 2) != 0) {
            z10 = data.renderAdharDtls;
        }
        if ((i10 & 4) != 0) {
            list2 = data.vtOwnerIdentitificationEntity;
        }
        return data.copy(list, z10, list2);
    }

    public final List<OwnerDetailEntity> component1() {
        return this.ownerDetailEntity;
    }

    public final boolean component2() {
        return this.renderAdharDtls;
    }

    public final List<VtOwnerIdentitificationEntity> component3() {
        return this.vtOwnerIdentitificationEntity;
    }

    public final Data copy(List<OwnerDetailEntity> list, boolean z10, List<VtOwnerIdentitificationEntity> list2) {
        return new Data(list, z10, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.ownerDetailEntity, data.ownerDetailEntity) && this.renderAdharDtls == data.renderAdharDtls && l.a(this.vtOwnerIdentitificationEntity, data.vtOwnerIdentitificationEntity);
    }

    public final List<OwnerDetailEntity> getOwnerDetailEntity() {
        return this.ownerDetailEntity;
    }

    public final boolean getRenderAdharDtls() {
        return this.renderAdharDtls;
    }

    public final List<VtOwnerIdentitificationEntity> getVtOwnerIdentitificationEntity() {
        return this.vtOwnerIdentitificationEntity;
    }

    public int hashCode() {
        List<OwnerDetailEntity> list = this.ownerDetailEntity;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        boolean z10 = this.renderAdharDtls;
        if (z10) {
            z10 = true;
        }
        int i11 = (hashCode + (z10 ? 1 : 0)) * 31;
        List<VtOwnerIdentitificationEntity> list2 = this.vtOwnerIdentitificationEntity;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "Data(ownerDetailEntity=" + this.ownerDetailEntity + ", renderAdharDtls=" + this.renderAdharDtls + ", vtOwnerIdentitificationEntity=" + this.vtOwnerIdentitificationEntity + ')';
    }
}
