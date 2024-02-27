package com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class Result {
    private final String ReqStatus;
    private final List<ResultX> Result;
    private final String status_code;
    private final String status_desc;

    public Result(List<ResultX> list, String str, String str2, String str3) {
        l.f(list, "Result");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        l.f(str3, "ReqStatus");
        this.Result = list;
        this.status_code = str;
        this.status_desc = str2;
        this.ReqStatus = str3;
    }

    public static /* synthetic */ Result copy$default(Result result, List<ResultX> list, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = result.Result;
        }
        if ((i10 & 2) != 0) {
            str = result.status_code;
        }
        if ((i10 & 4) != 0) {
            str2 = result.status_desc;
        }
        if ((i10 & 8) != 0) {
            str3 = result.ReqStatus;
        }
        return result.copy(list, str, str2, str3);
    }

    public final List<ResultX> component1() {
        return this.Result;
    }

    public final String component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.status_desc;
    }

    public final String component4() {
        return this.ReqStatus;
    }

    public final Result copy(List<ResultX> list, String str, String str2, String str3) {
        l.f(list, "Result");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        l.f(str3, "ReqStatus");
        return new Result(list, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return l.a(this.Result, result.Result) && l.a(this.status_code, result.status_code) && l.a(this.status_desc, result.status_desc) && l.a(this.ReqStatus, result.ReqStatus);
    }

    public final String getReqStatus() {
        return this.ReqStatus;
    }

    public final List<ResultX> getResult() {
        return this.Result;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((((this.Result.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode()) * 31) + this.ReqStatus.hashCode();
    }

    public String toString() {
        return "Result(Result=" + this.Result + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ", ReqStatus=" + this.ReqStatus + ')';
    }
}
