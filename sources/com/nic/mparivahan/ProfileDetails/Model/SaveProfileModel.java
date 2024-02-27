package com.nic.mparivahan.ProfileDetails.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SaveProfileModel {
    private final String statusCode;
    private final String statusDesc;

    public SaveProfileModel(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ SaveProfileModel copy$default(SaveProfileModel saveProfileModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = saveProfileModel.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = saveProfileModel.statusDesc;
        }
        return saveProfileModel.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final SaveProfileModel copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new SaveProfileModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveProfileModel)) {
            return false;
        }
        SaveProfileModel saveProfileModel = (SaveProfileModel) obj;
        return l.a(this.statusCode, saveProfileModel.statusCode) && l.a(this.statusDesc, saveProfileModel.statusDesc);
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
        return "SaveProfileModel(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
