package com.nic.mparivahan.DLServicesAuth.eKyc.Pojo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SubmitAdharApi {
    private final Object alerMessage;
    private final long ekycId;
    private final String statusCode;
    private final String statusDesc;

    public SubmitAdharApi(Object obj, String str, String str2, long j10) {
        l.f(obj, "alerMessage");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.alerMessage = obj;
        this.statusCode = str;
        this.statusDesc = str2;
        this.ekycId = j10;
    }

    public static /* synthetic */ SubmitAdharApi copy$default(SubmitAdharApi submitAdharApi, Object obj, String str, String str2, long j10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = submitAdharApi.alerMessage;
        }
        if ((i10 & 2) != 0) {
            str = submitAdharApi.statusCode;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            str2 = submitAdharApi.statusDesc;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            j10 = submitAdharApi.ekycId;
        }
        return submitAdharApi.copy(obj, str3, str4, j10);
    }

    public final Object component1() {
        return this.alerMessage;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final long component4() {
        return this.ekycId;
    }

    public final SubmitAdharApi copy(Object obj, String str, String str2, long j10) {
        l.f(obj, "alerMessage");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new SubmitAdharApi(obj, str, str2, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitAdharApi)) {
            return false;
        }
        SubmitAdharApi submitAdharApi = (SubmitAdharApi) obj;
        return l.a(this.alerMessage, submitAdharApi.alerMessage) && l.a(this.statusCode, submitAdharApi.statusCode) && l.a(this.statusDesc, submitAdharApi.statusDesc) && this.ekycId == submitAdharApi.ekycId;
    }

    public final Object getAlerMessage() {
        return this.alerMessage;
    }

    public final long getEkycId() {
        return this.ekycId;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((((this.alerMessage.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode()) * 31) + Long.hashCode(this.ekycId);
    }

    public String toString() {
        return "SubmitAdharApi(alerMessage=" + this.alerMessage + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", ekycId=" + this.ekycId + ')';
    }
}
