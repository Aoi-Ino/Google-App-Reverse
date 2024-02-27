package com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class Result {
    private final String ReqStatus;
    private final List<ResultX> Result;
    private final String status_code;
    private final String status_desc;

    public Result(String str, List<ResultX> list, String str2, String str3) {
        l.f(str, "ReqStatus");
        l.f(list, "Result");
        l.f(str2, "status_code");
        l.f(str3, "status_desc");
        this.ReqStatus = str;
        this.Result = list;
        this.status_code = str2;
        this.status_desc = str3;
    }

    public static /* synthetic */ Result copy$default(Result result, String str, List<ResultX> list, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = result.ReqStatus;
        }
        if ((i10 & 2) != 0) {
            list = result.Result;
        }
        if ((i10 & 4) != 0) {
            str2 = result.status_code;
        }
        if ((i10 & 8) != 0) {
            str3 = result.status_desc;
        }
        return result.copy(str, list, str2, str3);
    }

    public final String component1() {
        return this.ReqStatus;
    }

    public final List<ResultX> component2() {
        return this.Result;
    }

    public final String component3() {
        return this.status_code;
    }

    public final String component4() {
        return this.status_desc;
    }

    public final Result copy(String str, List<ResultX> list, String str2, String str3) {
        l.f(str, "ReqStatus");
        l.f(list, "Result");
        l.f(str2, "status_code");
        l.f(str3, "status_desc");
        return new Result(str, list, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return l.a(this.ReqStatus, result.ReqStatus) && l.a(this.Result, result.Result) && l.a(this.status_code, result.status_code) && l.a(this.status_desc, result.status_desc);
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
        return (((((this.ReqStatus.hashCode() * 31) + this.Result.hashCode()) * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "Result(ReqStatus=" + this.ReqStatus + ", Result=" + this.Result + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
