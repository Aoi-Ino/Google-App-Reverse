package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class CreateVirtualDocModle {
    private final CitizenDocInfo citizenDocInfo;
    private final String statusCode;
    private final String statusDesc;

    public CreateVirtualDocModle(String str, String str2, CitizenDocInfo citizenDocInfo2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        l.f(citizenDocInfo2, "citizenDocInfo");
        this.statusCode = str;
        this.statusDesc = str2;
        this.citizenDocInfo = citizenDocInfo2;
    }

    public static /* synthetic */ CreateVirtualDocModle copy$default(CreateVirtualDocModle createVirtualDocModle, String str, String str2, CitizenDocInfo citizenDocInfo2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = createVirtualDocModle.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = createVirtualDocModle.statusDesc;
        }
        if ((i10 & 4) != 0) {
            citizenDocInfo2 = createVirtualDocModle.citizenDocInfo;
        }
        return createVirtualDocModle.copy(str, str2, citizenDocInfo2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final CitizenDocInfo component3() {
        return this.citizenDocInfo;
    }

    public final CreateVirtualDocModle copy(String str, String str2, CitizenDocInfo citizenDocInfo2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        l.f(citizenDocInfo2, "citizenDocInfo");
        return new CreateVirtualDocModle(str, str2, citizenDocInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateVirtualDocModle)) {
            return false;
        }
        CreateVirtualDocModle createVirtualDocModle = (CreateVirtualDocModle) obj;
        return l.a(this.statusCode, createVirtualDocModle.statusCode) && l.a(this.statusDesc, createVirtualDocModle.statusDesc) && l.a(this.citizenDocInfo, createVirtualDocModle.citizenDocInfo);
    }

    public final CitizenDocInfo getCitizenDocInfo() {
        return this.citizenDocInfo;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31) + this.citizenDocInfo.hashCode();
    }

    public String toString() {
        return "CreateVirtualDocModle(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", citizenDocInfo=" + this.citizenDocInfo + ')';
    }
}
