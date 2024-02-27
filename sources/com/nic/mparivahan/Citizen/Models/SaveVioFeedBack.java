package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SaveVioFeedBack {
    private final String statusCode;
    private final String statusDesc;

    public SaveVioFeedBack(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ SaveVioFeedBack copy$default(SaveVioFeedBack saveVioFeedBack, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = saveVioFeedBack.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = saveVioFeedBack.statusDesc;
        }
        return saveVioFeedBack.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final SaveVioFeedBack copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new SaveVioFeedBack(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveVioFeedBack)) {
            return false;
        }
        SaveVioFeedBack saveVioFeedBack = (SaveVioFeedBack) obj;
        return l.a(this.statusCode, saveVioFeedBack.statusCode) && l.a(this.statusDesc, saveVioFeedBack.statusDesc);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (this.statusCode.hashCode() * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "SaveVioFeedBack(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
