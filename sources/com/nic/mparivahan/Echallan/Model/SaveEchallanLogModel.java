package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SaveEchallanLogModel {
    private final int logCount;
    private final String statusCode;
    private final String statusDesc;

    public SaveEchallanLogModel(int i10, String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.logCount = i10;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ SaveEchallanLogModel copy$default(SaveEchallanLogModel saveEchallanLogModel, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = saveEchallanLogModel.logCount;
        }
        if ((i11 & 2) != 0) {
            str = saveEchallanLogModel.statusCode;
        }
        if ((i11 & 4) != 0) {
            str2 = saveEchallanLogModel.statusDesc;
        }
        return saveEchallanLogModel.copy(i10, str, str2);
    }

    public final int component1() {
        return this.logCount;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final SaveEchallanLogModel copy(int i10, String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new SaveEchallanLogModel(i10, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveEchallanLogModel)) {
            return false;
        }
        SaveEchallanLogModel saveEchallanLogModel = (SaveEchallanLogModel) obj;
        return this.logCount == saveEchallanLogModel.logCount && l.a(this.statusCode, saveEchallanLogModel.statusCode) && l.a(this.statusDesc, saveEchallanLogModel.statusDesc);
    }

    public final int getLogCount() {
        return this.logCount;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.logCount) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "SaveEchallanLogModel(logCount=" + this.logCount + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
