package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DmsFileDetailX {
    private final String docCatgId;
    private final int docId;
    private final String fileName;
    private final String objectId;
    private final boolean uploaded;

    public DmsFileDetailX(String str, int i10, String str2, String str3, boolean z10) {
        l.f(str, "docCatgId");
        l.f(str2, "fileName");
        l.f(str3, "objectId");
        this.docCatgId = str;
        this.docId = i10;
        this.fileName = str2;
        this.objectId = str3;
        this.uploaded = z10;
    }

    public static /* synthetic */ DmsFileDetailX copy$default(DmsFileDetailX dmsFileDetailX, String str, int i10, String str2, String str3, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dmsFileDetailX.docCatgId;
        }
        if ((i11 & 2) != 0) {
            i10 = dmsFileDetailX.docId;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str2 = dmsFileDetailX.fileName;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            str3 = dmsFileDetailX.objectId;
        }
        String str5 = str3;
        if ((i11 & 16) != 0) {
            z10 = dmsFileDetailX.uploaded;
        }
        return dmsFileDetailX.copy(str, i12, str4, str5, z10);
    }

    public final String component1() {
        return this.docCatgId;
    }

    public final int component2() {
        return this.docId;
    }

    public final String component3() {
        return this.fileName;
    }

    public final String component4() {
        return this.objectId;
    }

    public final boolean component5() {
        return this.uploaded;
    }

    public final DmsFileDetailX copy(String str, int i10, String str2, String str3, boolean z10) {
        l.f(str, "docCatgId");
        l.f(str2, "fileName");
        l.f(str3, "objectId");
        return new DmsFileDetailX(str, i10, str2, str3, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DmsFileDetailX)) {
            return false;
        }
        DmsFileDetailX dmsFileDetailX = (DmsFileDetailX) obj;
        return l.a(this.docCatgId, dmsFileDetailX.docCatgId) && this.docId == dmsFileDetailX.docId && l.a(this.fileName, dmsFileDetailX.fileName) && l.a(this.objectId, dmsFileDetailX.objectId) && this.uploaded == dmsFileDetailX.uploaded;
    }

    public final String getDocCatgId() {
        return this.docCatgId;
    }

    public final int getDocId() {
        return this.docId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final boolean getUploaded() {
        return this.uploaded;
    }

    public int hashCode() {
        int hashCode = ((((((this.docCatgId.hashCode() * 31) + Integer.hashCode(this.docId)) * 31) + this.fileName.hashCode()) * 31) + this.objectId.hashCode()) * 31;
        boolean z10 = this.uploaded;
        if (z10) {
            z10 = true;
        }
        return hashCode + (z10 ? 1 : 0);
    }

    public String toString() {
        return "DmsFileDetailX(docCatgId=" + this.docCatgId + ", docId=" + this.docId + ", fileName=" + this.fileName + ", objectId=" + this.objectId + ", uploaded=" + this.uploaded + ')';
    }
}
