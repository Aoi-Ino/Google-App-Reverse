package com.nic.mparivahan.VahanServices.DRcModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DMSViewDocModle {
    private final String fileContent;
    private final String fileExt;
    private final String fileName;
    private final String mimeType;
    private final String statusCode;
    private final String statusDesc;

    public DMSViewDocModle(String str, String str2, String str3, String str4, String str5, String str6) {
        l.f(str, "fileContent");
        l.f(str2, "fileExt");
        l.f(str3, "fileName");
        l.f(str4, "mimeType");
        l.f(str5, "statusCode");
        l.f(str6, "statusDesc");
        this.fileContent = str;
        this.fileExt = str2;
        this.fileName = str3;
        this.mimeType = str4;
        this.statusCode = str5;
        this.statusDesc = str6;
    }

    public static /* synthetic */ DMSViewDocModle copy$default(DMSViewDocModle dMSViewDocModle, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dMSViewDocModle.fileContent;
        }
        if ((i10 & 2) != 0) {
            str2 = dMSViewDocModle.fileExt;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = dMSViewDocModle.fileName;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = dMSViewDocModle.mimeType;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = dMSViewDocModle.statusCode;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = dMSViewDocModle.statusDesc;
        }
        return dMSViewDocModle.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.fileContent;
    }

    public final String component2() {
        return this.fileExt;
    }

    public final String component3() {
        return this.fileName;
    }

    public final String component4() {
        return this.mimeType;
    }

    public final String component5() {
        return this.statusCode;
    }

    public final String component6() {
        return this.statusDesc;
    }

    public final DMSViewDocModle copy(String str, String str2, String str3, String str4, String str5, String str6) {
        l.f(str, "fileContent");
        l.f(str2, "fileExt");
        l.f(str3, "fileName");
        l.f(str4, "mimeType");
        l.f(str5, "statusCode");
        l.f(str6, "statusDesc");
        return new DMSViewDocModle(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMSViewDocModle)) {
            return false;
        }
        DMSViewDocModle dMSViewDocModle = (DMSViewDocModle) obj;
        return l.a(this.fileContent, dMSViewDocModle.fileContent) && l.a(this.fileExt, dMSViewDocModle.fileExt) && l.a(this.fileName, dMSViewDocModle.fileName) && l.a(this.mimeType, dMSViewDocModle.mimeType) && l.a(this.statusCode, dMSViewDocModle.statusCode) && l.a(this.statusDesc, dMSViewDocModle.statusDesc);
    }

    public final String getFileContent() {
        return this.fileContent;
    }

    public final String getFileExt() {
        return this.fileExt;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((((((((this.fileContent.hashCode() * 31) + this.fileExt.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.mimeType.hashCode()) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "DMSViewDocModle(fileContent=" + this.fileContent + ", fileExt=" + this.fileExt + ", fileName=" + this.fileName + ", mimeType=" + this.mimeType + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
