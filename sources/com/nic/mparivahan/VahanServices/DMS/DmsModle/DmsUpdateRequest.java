package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DmsUpdateRequest {
    private final String appNo;
    private final String docKey;
    private final String fileName;
    private final String fileToUpload;
    private final String state;

    public DmsUpdateRequest(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "appNo");
        l.f(str2, "docKey");
        l.f(str3, "fileName");
        l.f(str4, "fileToUpload");
        l.f(str5, "state");
        this.appNo = str;
        this.docKey = str2;
        this.fileName = str3;
        this.fileToUpload = str4;
        this.state = str5;
    }

    public static /* synthetic */ DmsUpdateRequest copy$default(DmsUpdateRequest dmsUpdateRequest, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dmsUpdateRequest.appNo;
        }
        if ((i10 & 2) != 0) {
            str2 = dmsUpdateRequest.docKey;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = dmsUpdateRequest.fileName;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = dmsUpdateRequest.fileToUpload;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = dmsUpdateRequest.state;
        }
        return dmsUpdateRequest.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.appNo;
    }

    public final String component2() {
        return this.docKey;
    }

    public final String component3() {
        return this.fileName;
    }

    public final String component4() {
        return this.fileToUpload;
    }

    public final String component5() {
        return this.state;
    }

    public final DmsUpdateRequest copy(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "appNo");
        l.f(str2, "docKey");
        l.f(str3, "fileName");
        l.f(str4, "fileToUpload");
        l.f(str5, "state");
        return new DmsUpdateRequest(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DmsUpdateRequest)) {
            return false;
        }
        DmsUpdateRequest dmsUpdateRequest = (DmsUpdateRequest) obj;
        return l.a(this.appNo, dmsUpdateRequest.appNo) && l.a(this.docKey, dmsUpdateRequest.docKey) && l.a(this.fileName, dmsUpdateRequest.fileName) && l.a(this.fileToUpload, dmsUpdateRequest.fileToUpload) && l.a(this.state, dmsUpdateRequest.state);
    }

    public final String getAppNo() {
        return this.appNo;
    }

    public final String getDocKey() {
        return this.docKey;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFileToUpload() {
        return this.fileToUpload;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return (((((((this.appNo.hashCode() * 31) + this.docKey.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.fileToUpload.hashCode()) * 31) + this.state.hashCode();
    }

    public String toString() {
        return "DmsUpdateRequest(appNo=" + this.appNo + ", docKey=" + this.docKey + ", fileName=" + this.fileName + ", fileToUpload=" + this.fileToUpload + ", state=" + this.state + ')';
    }
}
