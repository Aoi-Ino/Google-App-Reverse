package com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class AvailableFancyRequest2 {
    private final String pageNumber;
    private final String pageSize;
    private final String rtoCode;
    private final String stateCode;

    public AvailableFancyRequest2(String str, String str2, String str3, String str4) {
        l.f(str, "pageNumber");
        l.f(str2, "pageSize");
        l.f(str3, "rtoCode");
        l.f(str4, "stateCode");
        this.pageNumber = str;
        this.pageSize = str2;
        this.rtoCode = str3;
        this.stateCode = str4;
    }

    public static /* synthetic */ AvailableFancyRequest2 copy$default(AvailableFancyRequest2 availableFancyRequest2, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = availableFancyRequest2.pageNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = availableFancyRequest2.pageSize;
        }
        if ((i10 & 4) != 0) {
            str3 = availableFancyRequest2.rtoCode;
        }
        if ((i10 & 8) != 0) {
            str4 = availableFancyRequest2.stateCode;
        }
        return availableFancyRequest2.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.pageNumber;
    }

    public final String component2() {
        return this.pageSize;
    }

    public final String component3() {
        return this.rtoCode;
    }

    public final String component4() {
        return this.stateCode;
    }

    public final AvailableFancyRequest2 copy(String str, String str2, String str3, String str4) {
        l.f(str, "pageNumber");
        l.f(str2, "pageSize");
        l.f(str3, "rtoCode");
        l.f(str4, "stateCode");
        return new AvailableFancyRequest2(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableFancyRequest2)) {
            return false;
        }
        AvailableFancyRequest2 availableFancyRequest2 = (AvailableFancyRequest2) obj;
        return l.a(this.pageNumber, availableFancyRequest2.pageNumber) && l.a(this.pageSize, availableFancyRequest2.pageSize) && l.a(this.rtoCode, availableFancyRequest2.rtoCode) && l.a(this.stateCode, availableFancyRequest2.stateCode);
    }

    public final String getPageNumber() {
        return this.pageNumber;
    }

    public final String getPageSize() {
        return this.pageSize;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        return (((((this.pageNumber.hashCode() * 31) + this.pageSize.hashCode()) * 31) + this.rtoCode.hashCode()) * 31) + this.stateCode.hashCode();
    }

    public String toString() {
        return "AvailableFancyRequest2(pageNumber=" + this.pageNumber + ", pageSize=" + this.pageSize + ", rtoCode=" + this.rtoCode + ", stateCode=" + this.stateCode + ')';
    }
}
