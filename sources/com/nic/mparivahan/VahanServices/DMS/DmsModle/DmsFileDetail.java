package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DmsFileDetail {
    private final String apiFile;
    private final String docCatgId;
    private final String docId;
    private final String fileName;
    private final boolean uploaded;

    public DmsFileDetail(String str, String str2, String str3, String str4, boolean z10) {
        l.f(str, "apiFile");
        l.f(str2, "docCatgId");
        l.f(str3, "docId");
        l.f(str4, "fileName");
        this.apiFile = str;
        this.docCatgId = str2;
        this.docId = str3;
        this.fileName = str4;
        this.uploaded = z10;
    }

    public static /* synthetic */ DmsFileDetail copy$default(DmsFileDetail dmsFileDetail, String str, String str2, String str3, String str4, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dmsFileDetail.apiFile;
        }
        if ((i10 & 2) != 0) {
            str2 = dmsFileDetail.docCatgId;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = dmsFileDetail.docId;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = dmsFileDetail.fileName;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            z10 = dmsFileDetail.uploaded;
        }
        return dmsFileDetail.copy(str, str5, str6, str7, z10);
    }

    public final String component1() {
        return this.apiFile;
    }

    public final String component2() {
        return this.docCatgId;
    }

    public final String component3() {
        return this.docId;
    }

    public final String component4() {
        return this.fileName;
    }

    public final boolean component5() {
        return this.uploaded;
    }

    public final DmsFileDetail copy(String str, String str2, String str3, String str4, boolean z10) {
        l.f(str, "apiFile");
        l.f(str2, "docCatgId");
        l.f(str3, "docId");
        l.f(str4, "fileName");
        return new DmsFileDetail(str, str2, str3, str4, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DmsFileDetail)) {
            return false;
        }
        DmsFileDetail dmsFileDetail = (DmsFileDetail) obj;
        return l.a(this.apiFile, dmsFileDetail.apiFile) && l.a(this.docCatgId, dmsFileDetail.docCatgId) && l.a(this.docId, dmsFileDetail.docId) && l.a(this.fileName, dmsFileDetail.fileName) && this.uploaded == dmsFileDetail.uploaded;
    }

    public final String getApiFile() {
        return this.apiFile;
    }

    public final String getDocCatgId() {
        return this.docCatgId;
    }

    public final String getDocId() {
        return this.docId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getUploaded() {
        return this.uploaded;
    }

    public int hashCode() {
        int hashCode = ((((((this.apiFile.hashCode() * 31) + this.docCatgId.hashCode()) * 31) + this.docId.hashCode()) * 31) + this.fileName.hashCode()) * 31;
        boolean z10 = this.uploaded;
        if (z10) {
            z10 = true;
        }
        return hashCode + (z10 ? 1 : 0);
    }

    public String toString() {
        return "DmsFileDetail(apiFile=" + this.apiFile + ", docCatgId=" + this.docCatgId + ", docId=" + this.docId + ", fileName=" + this.fileName + ", uploaded=" + this.uploaded + ')';
    }
}
