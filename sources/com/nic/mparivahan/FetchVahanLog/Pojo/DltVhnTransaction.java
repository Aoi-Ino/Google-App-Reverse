package com.nic.mparivahan.FetchVahanLog.Pojo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DltVhnTransaction {
    private final int logCount;
    private final String statusCode;
    private final String statusDesc;

    public DltVhnTransaction(int i10, String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.logCount = i10;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ DltVhnTransaction copy$default(DltVhnTransaction dltVhnTransaction, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = dltVhnTransaction.logCount;
        }
        if ((i11 & 2) != 0) {
            str = dltVhnTransaction.statusCode;
        }
        if ((i11 & 4) != 0) {
            str2 = dltVhnTransaction.statusDesc;
        }
        return dltVhnTransaction.copy(i10, str, str2);
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

    public final DltVhnTransaction copy(int i10, String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new DltVhnTransaction(i10, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DltVhnTransaction)) {
            return false;
        }
        DltVhnTransaction dltVhnTransaction = (DltVhnTransaction) obj;
        return this.logCount == dltVhnTransaction.logCount && l.a(this.statusCode, dltVhnTransaction.statusCode) && l.a(this.statusDesc, dltVhnTransaction.statusDesc);
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
        return "DltVhnTransaction(logCount=" + this.logCount + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
