package com.nic.mparivahan.dlservices.data.model.savelog;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class SaveLogResponse {
    @c("logCount")
    private final Integer logCount;
    @c("statusCode")
    private final String statusCode;
    @c("statusDesc")
    private final String statusDesc;

    public SaveLogResponse() {
        this((Integer) null, (String) null, (String) null, 7, (g) null);
    }

    public static /* synthetic */ SaveLogResponse copy$default(SaveLogResponse saveLogResponse, Integer num, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = saveLogResponse.logCount;
        }
        if ((i10 & 2) != 0) {
            str = saveLogResponse.statusDesc;
        }
        if ((i10 & 4) != 0) {
            str2 = saveLogResponse.statusCode;
        }
        return saveLogResponse.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.logCount;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final String component3() {
        return this.statusCode;
    }

    public final SaveLogResponse copy(Integer num, String str, String str2) {
        return new SaveLogResponse(num, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveLogResponse)) {
            return false;
        }
        SaveLogResponse saveLogResponse = (SaveLogResponse) obj;
        return l.a(this.logCount, saveLogResponse.logCount) && l.a(this.statusDesc, saveLogResponse.statusDesc) && l.a(this.statusCode, saveLogResponse.statusCode);
    }

    public final Integer getLogCount() {
        return this.logCount;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        Integer num = this.logCount;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusDesc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusCode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "SaveLogResponse(logCount=" + this.logCount + ", statusDesc=" + this.statusDesc + ", statusCode=" + this.statusCode + ')';
    }

    public SaveLogResponse(Integer num, String str, String str2) {
        this.logCount = num;
        this.statusDesc = str;
        this.statusCode = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveLogResponse(Integer num, String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }
}
