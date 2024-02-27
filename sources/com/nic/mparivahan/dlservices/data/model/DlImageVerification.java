package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlImageVerification {
    private String dOsVersion;
    private String dlNumber;
    private String newImage;
    private String oldImage;

    public DlImageVerification(String str, String str2, String str3, String str4) {
        this.dlNumber = str;
        this.dOsVersion = str2;
        this.oldImage = str3;
        this.newImage = str4;
    }

    public static /* synthetic */ DlImageVerification copy$default(DlImageVerification dlImageVerification, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlImageVerification.dlNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = dlImageVerification.dOsVersion;
        }
        if ((i10 & 4) != 0) {
            str3 = dlImageVerification.oldImage;
        }
        if ((i10 & 8) != 0) {
            str4 = dlImageVerification.newImage;
        }
        return dlImageVerification.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.dlNumber;
    }

    public final String component2() {
        return this.dOsVersion;
    }

    public final String component3() {
        return this.oldImage;
    }

    public final String component4() {
        return this.newImage;
    }

    public final DlImageVerification copy(String str, String str2, String str3, String str4) {
        return new DlImageVerification(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlImageVerification)) {
            return false;
        }
        DlImageVerification dlImageVerification = (DlImageVerification) obj;
        return l.a(this.dlNumber, dlImageVerification.dlNumber) && l.a(this.dOsVersion, dlImageVerification.dOsVersion) && l.a(this.oldImage, dlImageVerification.oldImage) && l.a(this.newImage, dlImageVerification.newImage);
    }

    public final String getDOsVersion() {
        return this.dOsVersion;
    }

    public final String getDlNumber() {
        return this.dlNumber;
    }

    public final String getNewImage() {
        return this.newImage;
    }

    public final String getOldImage() {
        return this.oldImage;
    }

    public int hashCode() {
        String str = this.dlNumber;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dOsVersion;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.oldImage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.newImage;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode3 + i10;
    }

    public final void setDOsVersion(String str) {
        this.dOsVersion = str;
    }

    public final void setDlNumber(String str) {
        this.dlNumber = str;
    }

    public final void setNewImage(String str) {
        this.newImage = str;
    }

    public final void setOldImage(String str) {
        this.oldImage = str;
    }

    public String toString() {
        return "DlImageVerification(dlNumber=" + this.dlNumber + ", dOsVersion=" + this.dOsVersion + ", oldImage=" + this.oldImage + ", newImage=" + this.newImage + ')';
    }
}
