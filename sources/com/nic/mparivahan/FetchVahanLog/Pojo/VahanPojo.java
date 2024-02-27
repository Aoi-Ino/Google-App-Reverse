package com.nic.mparivahan.FetchVahanLog.Pojo;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class VahanPojo {
    private final int logCount;
    private final String statusCode;
    private final String statusDesc;
    private final ArrayList<VahanLog> vahanLogs;

    public VahanPojo(int i10, String str, String str2, ArrayList<VahanLog> arrayList) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        l.f(arrayList, "vahanLogs");
        this.logCount = i10;
        this.statusCode = str;
        this.statusDesc = str2;
        this.vahanLogs = arrayList;
    }

    public static /* synthetic */ VahanPojo copy$default(VahanPojo vahanPojo, int i10, String str, String str2, ArrayList<VahanLog> arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = vahanPojo.logCount;
        }
        if ((i11 & 2) != 0) {
            str = vahanPojo.statusCode;
        }
        if ((i11 & 4) != 0) {
            str2 = vahanPojo.statusDesc;
        }
        if ((i11 & 8) != 0) {
            arrayList = vahanPojo.vahanLogs;
        }
        return vahanPojo.copy(i10, str, str2, arrayList);
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

    public final ArrayList<VahanLog> component4() {
        return this.vahanLogs;
    }

    public final VahanPojo copy(int i10, String str, String str2, ArrayList<VahanLog> arrayList) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        l.f(arrayList, "vahanLogs");
        return new VahanPojo(i10, str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VahanPojo)) {
            return false;
        }
        VahanPojo vahanPojo = (VahanPojo) obj;
        return this.logCount == vahanPojo.logCount && l.a(this.statusCode, vahanPojo.statusCode) && l.a(this.statusDesc, vahanPojo.statusDesc) && l.a(this.vahanLogs, vahanPojo.vahanLogs);
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

    public final ArrayList<VahanLog> getVahanLogs() {
        return this.vahanLogs;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.logCount) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode()) * 31) + this.vahanLogs.hashCode();
    }

    public String toString() {
        return "VahanPojo(logCount=" + this.logCount + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", vahanLogs=" + this.vahanLogs + ')';
    }
}
