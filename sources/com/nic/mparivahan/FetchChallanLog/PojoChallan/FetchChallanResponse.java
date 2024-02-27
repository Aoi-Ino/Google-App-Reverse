package com.nic.mparivahan.FetchChallanLog.PojoChallan;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class FetchChallanResponse {
    private final int logCount;
    private final ArrayList<MparEchallanLog> mparEchallanLog;
    private final String statusCode;
    private final String statusDesc;

    public FetchChallanResponse(int i10, ArrayList<MparEchallanLog> arrayList, String str, String str2) {
        l.f(arrayList, "mparEchallanLog");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.logCount = i10;
        this.mparEchallanLog = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ FetchChallanResponse copy$default(FetchChallanResponse fetchChallanResponse, int i10, ArrayList<MparEchallanLog> arrayList, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = fetchChallanResponse.logCount;
        }
        if ((i11 & 2) != 0) {
            arrayList = fetchChallanResponse.mparEchallanLog;
        }
        if ((i11 & 4) != 0) {
            str = fetchChallanResponse.statusCode;
        }
        if ((i11 & 8) != 0) {
            str2 = fetchChallanResponse.statusDesc;
        }
        return fetchChallanResponse.copy(i10, arrayList, str, str2);
    }

    public final int component1() {
        return this.logCount;
    }

    public final ArrayList<MparEchallanLog> component2() {
        return this.mparEchallanLog;
    }

    public final String component3() {
        return this.statusCode;
    }

    public final String component4() {
        return this.statusDesc;
    }

    public final FetchChallanResponse copy(int i10, ArrayList<MparEchallanLog> arrayList, String str, String str2) {
        l.f(arrayList, "mparEchallanLog");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new FetchChallanResponse(i10, arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchChallanResponse)) {
            return false;
        }
        FetchChallanResponse fetchChallanResponse = (FetchChallanResponse) obj;
        return this.logCount == fetchChallanResponse.logCount && l.a(this.mparEchallanLog, fetchChallanResponse.mparEchallanLog) && l.a(this.statusCode, fetchChallanResponse.statusCode) && l.a(this.statusDesc, fetchChallanResponse.statusDesc);
    }

    public final int getLogCount() {
        return this.logCount;
    }

    public final ArrayList<MparEchallanLog> getMparEchallanLog() {
        return this.mparEchallanLog;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.logCount) * 31) + this.mparEchallanLog.hashCode()) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "FetchChallanResponse(logCount=" + this.logCount + ", mparEchallanLog=" + this.mparEchallanLog + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
