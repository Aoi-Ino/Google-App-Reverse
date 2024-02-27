package com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class LLDetail implements Serializable {
    private final String status_code;
    private final String status_desc;

    public LLDetail(String str, String str2) {
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        this.status_code = str;
        this.status_desc = str2;
    }

    public static /* synthetic */ LLDetail copy$default(LLDetail lLDetail, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lLDetail.status_code;
        }
        if ((i10 & 2) != 0) {
            str2 = lLDetail.status_desc;
        }
        return lLDetail.copy(str, str2);
    }

    public final String component1() {
        return this.status_code;
    }

    public final String component2() {
        return this.status_desc;
    }

    public final LLDetail copy(String str, String str2) {
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        return new LLDetail(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LLDetail)) {
            return false;
        }
        LLDetail lLDetail = (LLDetail) obj;
        return l.a(this.status_code, lLDetail.status_code) && l.a(this.status_desc, lLDetail.status_desc);
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (this.status_code.hashCode() * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "LLDetail(status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
