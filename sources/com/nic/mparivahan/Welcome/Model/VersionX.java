package com.nic.mparivahan.Welcome.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VersionX {
    private final String versionDesc;
    private final boolean versionMandate;
    private final int versionNo;
    private final String versionOs;
    private final String versionUpdatedBy;

    public VersionX(String str, boolean z10, int i10, String str2, String str3) {
        l.f(str, "versionDesc");
        l.f(str2, "versionOs");
        l.f(str3, "versionUpdatedBy");
        this.versionDesc = str;
        this.versionMandate = z10;
        this.versionNo = i10;
        this.versionOs = str2;
        this.versionUpdatedBy = str3;
    }

    public static /* synthetic */ VersionX copy$default(VersionX versionX, String str, boolean z10, int i10, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = versionX.versionDesc;
        }
        if ((i11 & 2) != 0) {
            z10 = versionX.versionMandate;
        }
        boolean z11 = z10;
        if ((i11 & 4) != 0) {
            i10 = versionX.versionNo;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            str2 = versionX.versionOs;
        }
        String str4 = str2;
        if ((i11 & 16) != 0) {
            str3 = versionX.versionUpdatedBy;
        }
        return versionX.copy(str, z11, i12, str4, str3);
    }

    public final String component1() {
        return this.versionDesc;
    }

    public final boolean component2() {
        return this.versionMandate;
    }

    public final int component3() {
        return this.versionNo;
    }

    public final String component4() {
        return this.versionOs;
    }

    public final String component5() {
        return this.versionUpdatedBy;
    }

    public final VersionX copy(String str, boolean z10, int i10, String str2, String str3) {
        l.f(str, "versionDesc");
        l.f(str2, "versionOs");
        l.f(str3, "versionUpdatedBy");
        return new VersionX(str, z10, i10, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VersionX)) {
            return false;
        }
        VersionX versionX = (VersionX) obj;
        return l.a(this.versionDesc, versionX.versionDesc) && this.versionMandate == versionX.versionMandate && this.versionNo == versionX.versionNo && l.a(this.versionOs, versionX.versionOs) && l.a(this.versionUpdatedBy, versionX.versionUpdatedBy);
    }

    public final String getVersionDesc() {
        return this.versionDesc;
    }

    public final boolean getVersionMandate() {
        return this.versionMandate;
    }

    public final int getVersionNo() {
        return this.versionNo;
    }

    public final String getVersionOs() {
        return this.versionOs;
    }

    public final String getVersionUpdatedBy() {
        return this.versionUpdatedBy;
    }

    public int hashCode() {
        int hashCode = this.versionDesc.hashCode() * 31;
        boolean z10 = this.versionMandate;
        if (z10) {
            z10 = true;
        }
        return ((((((hashCode + (z10 ? 1 : 0)) * 31) + Integer.hashCode(this.versionNo)) * 31) + this.versionOs.hashCode()) * 31) + this.versionUpdatedBy.hashCode();
    }

    public String toString() {
        return "VersionX(versionDesc=" + this.versionDesc + ", versionMandate=" + this.versionMandate + ", versionNo=" + this.versionNo + ", versionOs=" + this.versionOs + ", versionUpdatedBy=" + this.versionUpdatedBy + ')';
    }
}
