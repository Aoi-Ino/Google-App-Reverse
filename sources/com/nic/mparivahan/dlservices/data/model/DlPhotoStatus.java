package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlPhotoStatus {
    private String applNumber;
    private String dob;
    private String stateCd;

    public DlPhotoStatus(String str) {
        l.f(str, "applNumber");
        this.applNumber = str;
        this.dob = "";
        this.stateCd = "";
    }

    public static /* synthetic */ DlPhotoStatus copy$default(DlPhotoStatus dlPhotoStatus, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlPhotoStatus.applNumber;
        }
        return dlPhotoStatus.copy(str);
    }

    public final String component1() {
        return this.applNumber;
    }

    public final DlPhotoStatus copy(String str) {
        l.f(str, "applNumber");
        return new DlPhotoStatus(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DlPhotoStatus) && l.a(this.applNumber, ((DlPhotoStatus) obj).applNumber);
    }

    public final String getApplNumber() {
        return this.applNumber;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        return this.applNumber.hashCode();
    }

    public final void setApplNumber(String str) {
        l.f(str, "<set-?>");
        this.applNumber = str;
    }

    public final void setDob(String str) {
        l.f(str, "<set-?>");
        this.dob = str;
    }

    public final void setStateCd(String str) {
        l.f(str, "<set-?>");
        this.stateCd = str;
    }

    public String toString() {
        return "{\"applNumber\"=\"" + this.applNumber + "\", \"dob\"=\"" + this.dob + "\", \"stateCd\"=\"" + this.stateCd + "\" }";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DlPhotoStatus(String str, String str2, String str3) {
        this(str);
        l.f(str, "applNumber");
        l.f(str2, "dob");
        l.f(str3, "stateCd");
        this.dob = str2;
        this.stateCd = str3;
    }
}
