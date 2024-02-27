package com.nic.mparivahan.VahanServices.VahanMultiService.Model;

import androidx.annotation.Keep;

@Keep
public final class ServiceList {
    private final int purposeCode;
    private final boolean selectService;

    public ServiceList(int i10, boolean z10) {
        this.purposeCode = i10;
        this.selectService = z10;
    }

    public static /* synthetic */ ServiceList copy$default(ServiceList serviceList, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = serviceList.purposeCode;
        }
        if ((i11 & 2) != 0) {
            z10 = serviceList.selectService;
        }
        return serviceList.copy(i10, z10);
    }

    public final int component1() {
        return this.purposeCode;
    }

    public final boolean component2() {
        return this.selectService;
    }

    public final ServiceList copy(int i10, boolean z10) {
        return new ServiceList(i10, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceList)) {
            return false;
        }
        ServiceList serviceList = (ServiceList) obj;
        return this.purposeCode == serviceList.purposeCode && this.selectService == serviceList.selectService;
    }

    public final int getPurposeCode() {
        return this.purposeCode;
    }

    public final boolean getSelectService() {
        return this.selectService;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.purposeCode) * 31;
        boolean z10 = this.selectService;
        if (z10) {
            z10 = true;
        }
        return hashCode + (z10 ? 1 : 0);
    }

    public String toString() {
        return "ServiceList(purposeCode=" + this.purposeCode + ", selectService=" + this.selectService + ')';
    }
}
