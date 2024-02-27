package com.nic.mparivahan.DLServicesAuth.eKyc.Pojo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class CheckByState {
    private final String authRequired;
    private final Object ekycCustOptions;
    private final String ekycRequired;
    private final ResponseMsg responseMsg;

    public CheckByState(String str, Object obj, String str2, ResponseMsg responseMsg2) {
        l.f(str, "authRequired");
        l.f(obj, "ekycCustOptions");
        l.f(str2, "ekycRequired");
        l.f(responseMsg2, "responseMsg");
        this.authRequired = str;
        this.ekycCustOptions = obj;
        this.ekycRequired = str2;
        this.responseMsg = responseMsg2;
    }

    public static /* synthetic */ CheckByState copy$default(CheckByState checkByState, String str, Object obj, String str2, ResponseMsg responseMsg2, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = checkByState.authRequired;
        }
        if ((i10 & 2) != 0) {
            obj = checkByState.ekycCustOptions;
        }
        if ((i10 & 4) != 0) {
            str2 = checkByState.ekycRequired;
        }
        if ((i10 & 8) != 0) {
            responseMsg2 = checkByState.responseMsg;
        }
        return checkByState.copy(str, obj, str2, responseMsg2);
    }

    public final String component1() {
        return this.authRequired;
    }

    public final Object component2() {
        return this.ekycCustOptions;
    }

    public final String component3() {
        return this.ekycRequired;
    }

    public final ResponseMsg component4() {
        return this.responseMsg;
    }

    public final CheckByState copy(String str, Object obj, String str2, ResponseMsg responseMsg2) {
        l.f(str, "authRequired");
        l.f(obj, "ekycCustOptions");
        l.f(str2, "ekycRequired");
        l.f(responseMsg2, "responseMsg");
        return new CheckByState(str, obj, str2, responseMsg2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckByState)) {
            return false;
        }
        CheckByState checkByState = (CheckByState) obj;
        return l.a(this.authRequired, checkByState.authRequired) && l.a(this.ekycCustOptions, checkByState.ekycCustOptions) && l.a(this.ekycRequired, checkByState.ekycRequired) && l.a(this.responseMsg, checkByState.responseMsg);
    }

    public final String getAuthRequired() {
        return this.authRequired;
    }

    public final Object getEkycCustOptions() {
        return this.ekycCustOptions;
    }

    public final String getEkycRequired() {
        return this.ekycRequired;
    }

    public final ResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public int hashCode() {
        return (((((this.authRequired.hashCode() * 31) + this.ekycCustOptions.hashCode()) * 31) + this.ekycRequired.hashCode()) * 31) + this.responseMsg.hashCode();
    }

    public String toString() {
        return "CheckByState(authRequired=" + this.authRequired + ", ekycCustOptions=" + this.ekycCustOptions + ", ekycRequired=" + this.ekycRequired + ", responseMsg=" + this.responseMsg + ')';
    }
}
