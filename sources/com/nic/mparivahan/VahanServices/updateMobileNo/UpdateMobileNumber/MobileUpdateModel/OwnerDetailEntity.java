package com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class OwnerDetailEntity {
    private final String owner_name;
    private final String regn_no;
    private final String state_cd;
    private final String state_name;

    public OwnerDetailEntity(String str, String str2, String str3, String str4) {
        this.regn_no = str;
        this.state_cd = str2;
        this.state_name = str3;
        this.owner_name = str4;
    }

    public static /* synthetic */ OwnerDetailEntity copy$default(OwnerDetailEntity ownerDetailEntity, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ownerDetailEntity.regn_no;
        }
        if ((i10 & 2) != 0) {
            str2 = ownerDetailEntity.state_cd;
        }
        if ((i10 & 4) != 0) {
            str3 = ownerDetailEntity.state_name;
        }
        if ((i10 & 8) != 0) {
            str4 = ownerDetailEntity.owner_name;
        }
        return ownerDetailEntity.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.regn_no;
    }

    public final String component2() {
        return this.state_cd;
    }

    public final String component3() {
        return this.state_name;
    }

    public final String component4() {
        return this.owner_name;
    }

    public final OwnerDetailEntity copy(String str, String str2, String str3, String str4) {
        return new OwnerDetailEntity(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerDetailEntity)) {
            return false;
        }
        OwnerDetailEntity ownerDetailEntity = (OwnerDetailEntity) obj;
        return l.a(this.regn_no, ownerDetailEntity.regn_no) && l.a(this.state_cd, ownerDetailEntity.state_cd) && l.a(this.state_name, ownerDetailEntity.state_name) && l.a(this.owner_name, ownerDetailEntity.owner_name);
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
        String str = this.regn_no;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.state_cd;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state_name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.owner_name;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "OwnerDetailEntity(regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_name=" + this.state_name + ", owner_name=" + this.owner_name + ')';
    }
}
