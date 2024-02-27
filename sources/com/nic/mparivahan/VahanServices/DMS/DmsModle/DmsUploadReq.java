package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class DmsUploadReq {
    private final String appNo;
    private final List<DmsFileDetail> dmsFileDetails;
    private final String state;

    public DmsUploadReq(String str, List<DmsFileDetail> list, String str2) {
        l.f(str, "appNo");
        l.f(list, "dmsFileDetails");
        l.f(str2, "state");
        this.appNo = str;
        this.dmsFileDetails = list;
        this.state = str2;
    }

    public static /* synthetic */ DmsUploadReq copy$default(DmsUploadReq dmsUploadReq, String str, List<DmsFileDetail> list, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dmsUploadReq.appNo;
        }
        if ((i10 & 2) != 0) {
            list = dmsUploadReq.dmsFileDetails;
        }
        if ((i10 & 4) != 0) {
            str2 = dmsUploadReq.state;
        }
        return dmsUploadReq.copy(str, list, str2);
    }

    public final String component1() {
        return this.appNo;
    }

    public final List<DmsFileDetail> component2() {
        return this.dmsFileDetails;
    }

    public final String component3() {
        return this.state;
    }

    public final DmsUploadReq copy(String str, List<DmsFileDetail> list, String str2) {
        l.f(str, "appNo");
        l.f(list, "dmsFileDetails");
        l.f(str2, "state");
        return new DmsUploadReq(str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DmsUploadReq)) {
            return false;
        }
        DmsUploadReq dmsUploadReq = (DmsUploadReq) obj;
        return l.a(this.appNo, dmsUploadReq.appNo) && l.a(this.dmsFileDetails, dmsUploadReq.dmsFileDetails) && l.a(this.state, dmsUploadReq.state);
    }

    public final String getAppNo() {
        return this.appNo;
    }

    public final List<DmsFileDetail> getDmsFileDetails() {
        return this.dmsFileDetails;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return (((this.appNo.hashCode() * 31) + this.dmsFileDetails.hashCode()) * 31) + this.state.hashCode();
    }

    public String toString() {
        return "DmsUploadReq(appNo=" + this.appNo + ", dmsFileDetails=" + this.dmsFileDetails + ", state=" + this.state + ')';
    }
}
