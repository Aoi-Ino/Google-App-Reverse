package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class IdpcovgradesItem {
    @c("IdpCovgrdCd")
    private final String idpCovgrdCd;
    @c("IdpcovgrdDesc")
    private final String idpcovgrdDesc;
    private final boolean status;

    public IdpcovgradesItem() {
        this((String) null, (String) null, false, 7, (g) null);
    }

    public static /* synthetic */ IdpcovgradesItem copy$default(IdpcovgradesItem idpcovgradesItem, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = idpcovgradesItem.idpCovgrdCd;
        }
        if ((i10 & 2) != 0) {
            str2 = idpcovgradesItem.idpcovgrdDesc;
        }
        if ((i10 & 4) != 0) {
            z10 = idpcovgradesItem.status;
        }
        return idpcovgradesItem.copy(str, str2, z10);
    }

    public final String component1() {
        return this.idpCovgrdCd;
    }

    public final String component2() {
        return this.idpcovgrdDesc;
    }

    public final boolean component3() {
        return this.status;
    }

    public final IdpcovgradesItem copy(String str, String str2, boolean z10) {
        return new IdpcovgradesItem(str, str2, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdpcovgradesItem)) {
            return false;
        }
        IdpcovgradesItem idpcovgradesItem = (IdpcovgradesItem) obj;
        return l.a(this.idpCovgrdCd, idpcovgradesItem.idpCovgrdCd) && l.a(this.idpcovgrdDesc, idpcovgradesItem.idpcovgrdDesc) && this.status == idpcovgradesItem.status;
    }

    public final String getIdpCovgrdCd() {
        return this.idpCovgrdCd;
    }

    public final String getIdpcovgrdDesc() {
        return this.idpcovgrdDesc;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.idpCovgrdCd;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.idpcovgrdDesc;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        int i11 = (hashCode + i10) * 31;
        boolean z10 = this.status;
        if (z10) {
            z10 = true;
        }
        return i11 + (z10 ? 1 : 0);
    }

    public String toString() {
        return "IdpcovgradesItem(idpCovgrdCd=" + this.idpCovgrdCd + ", idpcovgrdDesc=" + this.idpcovgrdDesc + ", status=" + this.status + ')';
    }

    public IdpcovgradesItem(String str, String str2, boolean z10) {
        this.idpCovgrdCd = str;
        this.idpcovgrdDesc = str2;
        this.status = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IdpcovgradesItem(String str, String str2, boolean z10, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? false : z10);
    }
}
