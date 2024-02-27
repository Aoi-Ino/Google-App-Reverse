package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DmsUrlModle {
    private final String urlDocUpload;

    public DmsUrlModle(String str) {
        l.f(str, "urlDocUpload");
        this.urlDocUpload = str;
    }

    public static /* synthetic */ DmsUrlModle copy$default(DmsUrlModle dmsUrlModle, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dmsUrlModle.urlDocUpload;
        }
        return dmsUrlModle.copy(str);
    }

    public final String component1() {
        return this.urlDocUpload;
    }

    public final DmsUrlModle copy(String str) {
        l.f(str, "urlDocUpload");
        return new DmsUrlModle(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DmsUrlModle) && l.a(this.urlDocUpload, ((DmsUrlModle) obj).urlDocUpload);
    }

    public final String getUrlDocUpload() {
        return this.urlDocUpload;
    }

    public int hashCode() {
        return this.urlDocUpload.hashCode();
    }

    public String toString() {
        return "DmsUrlModle(urlDocUpload=" + this.urlDocUpload + ')';
    }
}
