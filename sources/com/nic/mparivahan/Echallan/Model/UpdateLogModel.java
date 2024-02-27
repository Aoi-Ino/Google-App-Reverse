package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class UpdateLogModel {
    private final int logCount;
    private final String statusCode;
    private final String statusDesc;

    public UpdateLogModel(int i10, String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.logCount = i10;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ UpdateLogModel copy$default(UpdateLogModel updateLogModel, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = updateLogModel.logCount;
        }
        if ((i11 & 2) != 0) {
            str = updateLogModel.statusCode;
        }
        if ((i11 & 4) != 0) {
            str2 = updateLogModel.statusDesc;
        }
        return updateLogModel.copy(i10, str, str2);
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

    public final UpdateLogModel copy(int i10, String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new UpdateLogModel(i10, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateLogModel)) {
            return false;
        }
        UpdateLogModel updateLogModel = (UpdateLogModel) obj;
        return this.logCount == updateLogModel.logCount && l.a(this.statusCode, updateLogModel.statusCode) && l.a(this.statusDesc, updateLogModel.statusDesc);
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
        return "UpdateLogModel(logCount=" + this.logCount + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
