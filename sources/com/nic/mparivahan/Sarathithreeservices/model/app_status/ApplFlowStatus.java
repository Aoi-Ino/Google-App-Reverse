package com.nic.mparivahan.Sarathithreeservices.model.app_status;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ApplFlowStatus {
    private final int acCd;
    private final String acDesc;
    private final int flowSlno;
    private final String status;
    private final int trCd;
    private final String trName;

    public ApplFlowStatus(int i10, String str, int i11, String str2, int i12, String str3) {
        l.f(str, "acDesc");
        l.f(str2, "status");
        l.f(str3, "trName");
        this.acCd = i10;
        this.acDesc = str;
        this.flowSlno = i11;
        this.status = str2;
        this.trCd = i12;
        this.trName = str3;
    }

    public static /* synthetic */ ApplFlowStatus copy$default(ApplFlowStatus applFlowStatus, int i10, String str, int i11, String str2, int i12, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = applFlowStatus.acCd;
        }
        if ((i13 & 2) != 0) {
            str = applFlowStatus.acDesc;
        }
        String str4 = str;
        if ((i13 & 4) != 0) {
            i11 = applFlowStatus.flowSlno;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            str2 = applFlowStatus.status;
        }
        String str5 = str2;
        if ((i13 & 16) != 0) {
            i12 = applFlowStatus.trCd;
        }
        int i15 = i12;
        if ((i13 & 32) != 0) {
            str3 = applFlowStatus.trName;
        }
        return applFlowStatus.copy(i10, str4, i14, str5, i15, str3);
    }

    public final int component1() {
        return this.acCd;
    }

    public final String component2() {
        return this.acDesc;
    }

    public final int component3() {
        return this.flowSlno;
    }

    public final String component4() {
        return this.status;
    }

    public final int component5() {
        return this.trCd;
    }

    public final String component6() {
        return this.trName;
    }

    public final ApplFlowStatus copy(int i10, String str, int i11, String str2, int i12, String str3) {
        l.f(str, "acDesc");
        l.f(str2, "status");
        l.f(str3, "trName");
        return new ApplFlowStatus(i10, str, i11, str2, i12, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplFlowStatus)) {
            return false;
        }
        ApplFlowStatus applFlowStatus = (ApplFlowStatus) obj;
        return this.acCd == applFlowStatus.acCd && l.a(this.acDesc, applFlowStatus.acDesc) && this.flowSlno == applFlowStatus.flowSlno && l.a(this.status, applFlowStatus.status) && this.trCd == applFlowStatus.trCd && l.a(this.trName, applFlowStatus.trName);
    }

    public final int getAcCd() {
        return this.acCd;
    }

    public final String getAcDesc() {
        return this.acDesc;
    }

    public final int getFlowSlno() {
        return this.flowSlno;
    }

    public final String getStatus() {
        return this.status;
    }

    public final int getTrCd() {
        return this.trCd;
    }

    public final String getTrName() {
        return this.trName;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.acCd) * 31) + this.acDesc.hashCode()) * 31) + Integer.hashCode(this.flowSlno)) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.trCd)) * 31) + this.trName.hashCode();
    }

    public String toString() {
        return "ApplFlowStatus(acCd=" + this.acCd + ", acDesc=" + this.acDesc + ", flowSlno=" + this.flowSlno + ", status=" + this.status + ", trCd=" + this.trCd + ", trName=" + this.trName + ')';
    }
}
