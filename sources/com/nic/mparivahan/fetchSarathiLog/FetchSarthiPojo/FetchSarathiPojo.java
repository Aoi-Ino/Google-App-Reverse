package com.nic.mparivahan.fetchSarathiLog.FetchSarthiPojo;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class FetchSarathiPojo {
    private final int logCount;
    private final ArrayList<SarathiLog> sarathiLogs;
    private final String statusCode;
    private final String statusDesc;

    public FetchSarathiPojo(int i10, ArrayList<SarathiLog> arrayList, String str, String str2) {
        l.f(arrayList, "sarathiLogs");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.logCount = i10;
        this.sarathiLogs = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ FetchSarathiPojo copy$default(FetchSarathiPojo fetchSarathiPojo, int i10, ArrayList<SarathiLog> arrayList, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = fetchSarathiPojo.logCount;
        }
        if ((i11 & 2) != 0) {
            arrayList = fetchSarathiPojo.sarathiLogs;
        }
        if ((i11 & 4) != 0) {
            str = fetchSarathiPojo.statusCode;
        }
        if ((i11 & 8) != 0) {
            str2 = fetchSarathiPojo.statusDesc;
        }
        return fetchSarathiPojo.copy(i10, arrayList, str, str2);
    }

    public final int component1() {
        return this.logCount;
    }

    public final ArrayList<SarathiLog> component2() {
        return this.sarathiLogs;
    }

    public final String component3() {
        return this.statusCode;
    }

    public final String component4() {
        return this.statusDesc;
    }

    public final FetchSarathiPojo copy(int i10, ArrayList<SarathiLog> arrayList, String str, String str2) {
        l.f(arrayList, "sarathiLogs");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new FetchSarathiPojo(i10, arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchSarathiPojo)) {
            return false;
        }
        FetchSarathiPojo fetchSarathiPojo = (FetchSarathiPojo) obj;
        return this.logCount == fetchSarathiPojo.logCount && l.a(this.sarathiLogs, fetchSarathiPojo.sarathiLogs) && l.a(this.statusCode, fetchSarathiPojo.statusCode) && l.a(this.statusDesc, fetchSarathiPojo.statusDesc);
    }

    public final int getLogCount() {
        return this.logCount;
    }

    public final ArrayList<SarathiLog> getSarathiLogs() {
        return this.sarathiLogs;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.logCount) * 31) + this.sarathiLogs.hashCode()) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "FetchSarathiPojo(logCount=" + this.logCount + ", sarathiLogs=" + this.sarathiLogs + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
