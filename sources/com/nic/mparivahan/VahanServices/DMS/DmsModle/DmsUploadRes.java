package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class DmsUploadRes {
    private final List<DmsFileDetailX> dmsFileDetails;
    private final String statusCode;
    private final String statusDesc;

    public DmsUploadRes(List<DmsFileDetailX> list, String str, String str2) {
        l.f(list, "dmsFileDetails");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.dmsFileDetails = list;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ DmsUploadRes copy$default(DmsUploadRes dmsUploadRes, List<DmsFileDetailX> list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = dmsUploadRes.dmsFileDetails;
        }
        if ((i10 & 2) != 0) {
            str = dmsUploadRes.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = dmsUploadRes.statusDesc;
        }
        return dmsUploadRes.copy(list, str, str2);
    }

    public final List<DmsFileDetailX> component1() {
        return this.dmsFileDetails;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final DmsUploadRes copy(List<DmsFileDetailX> list, String str, String str2) {
        l.f(list, "dmsFileDetails");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new DmsUploadRes(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DmsUploadRes)) {
            return false;
        }
        DmsUploadRes dmsUploadRes = (DmsUploadRes) obj;
        return l.a(this.dmsFileDetails, dmsUploadRes.dmsFileDetails) && l.a(this.statusCode, dmsUploadRes.statusCode) && l.a(this.statusDesc, dmsUploadRes.statusDesc);
    }

    public final List<DmsFileDetailX> getDmsFileDetails() {
        return this.dmsFileDetails;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.dmsFileDetails.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "DmsUploadRes(dmsFileDetails=" + this.dmsFileDetails + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
