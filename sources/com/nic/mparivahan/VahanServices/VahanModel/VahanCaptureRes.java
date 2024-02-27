package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VahanCaptureRes {
    private final int logCount;
    private final String statusCode;
    private final String statusDesc;

    public VahanCaptureRes(int i10, String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.logCount = i10;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ VahanCaptureRes copy$default(VahanCaptureRes vahanCaptureRes, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = vahanCaptureRes.logCount;
        }
        if ((i11 & 2) != 0) {
            str = vahanCaptureRes.statusCode;
        }
        if ((i11 & 4) != 0) {
            str2 = vahanCaptureRes.statusDesc;
        }
        return vahanCaptureRes.copy(i10, str, str2);
    }

    public final int component1() {
        return this.logCount;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final VahanCaptureRes copy(int i10, String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new VahanCaptureRes(i10, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VahanCaptureRes)) {
            return false;
        }
        VahanCaptureRes vahanCaptureRes = (VahanCaptureRes) obj;
        return this.logCount == vahanCaptureRes.logCount && l.a(this.statusCode, vahanCaptureRes.statusCode) && l.a(this.statusDesc, vahanCaptureRes.statusDesc);
    }

    public final int getLogCount() {
        return this.logCount;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.logCount) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "VahanCaptureRes(logCount=" + this.logCount + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
