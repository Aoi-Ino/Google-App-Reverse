package com.nic.mparivahan.Checkpost.CheckPostModel;

import androidx.annotation.Keep;
import cm.l;
import j7.c;

@Keep
public final class CheckPostReceiptRequestModel {
    @c("rcptNo")
    private final String rcptNo;

    public CheckPostReceiptRequestModel(String str) {
        l.f(str, "rcptNo");
        this.rcptNo = str;
    }

    public static /* synthetic */ CheckPostReceiptRequestModel copy$default(CheckPostReceiptRequestModel checkPostReceiptRequestModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = checkPostReceiptRequestModel.rcptNo;
        }
        return checkPostReceiptRequestModel.copy(str);
    }

    public final String component1() {
        return this.rcptNo;
    }

    public final CheckPostReceiptRequestModel copy(String str) {
        l.f(str, "rcptNo");
        return new CheckPostReceiptRequestModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckPostReceiptRequestModel) && l.a(this.rcptNo, ((CheckPostReceiptRequestModel) obj).rcptNo);
    }

    public final String getRcptNo() {
        return this.rcptNo;
    }

    public int hashCode() {
        return this.rcptNo.hashCode();
    }

    public String toString() {
        return "CheckPostReceiptRequestModel(rcptNo=" + this.rcptNo + ')';
    }
}
