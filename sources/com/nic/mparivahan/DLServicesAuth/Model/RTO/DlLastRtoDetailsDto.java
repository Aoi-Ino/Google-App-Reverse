package com.nic.mparivahan.DLServicesAuth.Model.RTO;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class DlLastRtoDetailsDto {
    private String ReqStatus;
    private List<Result> Result;
    private String status_code;
    private String status_desc;

    public DlLastRtoDetailsDto(List<Result> list, String str, String str2, String str3) {
        l.f(list, "Result");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        l.f(str3, "ReqStatus");
        this.Result = list;
        this.status_code = str;
        this.status_desc = str2;
        this.ReqStatus = str3;
    }

    public static /* synthetic */ DlLastRtoDetailsDto copy$default(DlLastRtoDetailsDto dlLastRtoDetailsDto, List<Result> list, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = dlLastRtoDetailsDto.Result;
        }
        if ((i10 & 2) != 0) {
            str = dlLastRtoDetailsDto.status_code;
        }
        if ((i10 & 4) != 0) {
            str2 = dlLastRtoDetailsDto.status_desc;
        }
        if ((i10 & 8) != 0) {
            str3 = dlLastRtoDetailsDto.ReqStatus;
        }
        return dlLastRtoDetailsDto.copy(list, str, str2, str3);
    }

    public final List<Result> component1() {
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

    public final DlLastRtoDetailsDto copy(List<Result> list, String str, String str2, String str3) {
        l.f(list, "Result");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        l.f(str3, "ReqStatus");
        return new DlLastRtoDetailsDto(list, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlLastRtoDetailsDto)) {
            return false;
        }
        DlLastRtoDetailsDto dlLastRtoDetailsDto = (DlLastRtoDetailsDto) obj;
        return l.a(this.Result, dlLastRtoDetailsDto.Result) && l.a(this.status_code, dlLastRtoDetailsDto.status_code) && l.a(this.status_desc, dlLastRtoDetailsDto.status_desc) && l.a(this.ReqStatus, dlLastRtoDetailsDto.ReqStatus);
    }

    public final String getReqStatus() {
        return this.ReqStatus;
    }

    public final List<Result> getResult() {
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

    public final void setReqStatus(String str) {
        l.f(str, "<set-?>");
        this.ReqStatus = str;
    }

    public final void setResult(List<Result> list) {
        l.f(list, "<set-?>");
        this.Result = list;
    }

    public final void setStatus_code(String str) {
        l.f(str, "<set-?>");
        this.status_code = str;
    }

    public final void setStatus_desc(String str) {
        l.f(str, "<set-?>");
        this.status_desc = str;
    }

    public String toString() {
        return "DlLastRtoDetailsDto(Result=" + this.Result + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ", ReqStatus=" + this.ReqStatus + ')';
    }
}
