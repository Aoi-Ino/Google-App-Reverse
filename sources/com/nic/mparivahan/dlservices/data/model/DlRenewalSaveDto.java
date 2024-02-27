package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class DlRenewalSaveDto implements Serializable {
    @c("failure")
    private final Object failure;
    @c("result")
    private final DlSubmitResult result;

    public DlRenewalSaveDto() {
        this((DlSubmitResult) null, (Object) null, 3, (g) null);
    }

    public static /* synthetic */ DlRenewalSaveDto copy$default(DlRenewalSaveDto dlRenewalSaveDto, DlSubmitResult dlSubmitResult, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            dlSubmitResult = dlRenewalSaveDto.result;
        }
        if ((i10 & 2) != 0) {
            obj = dlRenewalSaveDto.failure;
        }
        return dlRenewalSaveDto.copy(dlSubmitResult, obj);
    }

    public final DlSubmitResult component1() {
        return this.result;
    }

    public final Object component2() {
        return this.failure;
    }

    public final DlRenewalSaveDto copy(DlSubmitResult dlSubmitResult, Object obj) {
        return new DlRenewalSaveDto(dlSubmitResult, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlRenewalSaveDto)) {
            return false;
        }
        DlRenewalSaveDto dlRenewalSaveDto = (DlRenewalSaveDto) obj;
        return l.a(this.result, dlRenewalSaveDto.result) && l.a(this.failure, dlRenewalSaveDto.failure);
    }

    public final Object getFailure() {
        return this.failure;
    }

    public final DlSubmitResult getResult() {
        return this.result;
    }

    public int hashCode() {
        DlSubmitResult dlSubmitResult = this.result;
        int i10 = 0;
        int hashCode = (dlSubmitResult == null ? 0 : dlSubmitResult.hashCode()) * 31;
        Object obj = this.failure;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "DlRenewalSaveDto(result=" + this.result + ", failure=" + this.failure + ')';
    }

    public DlRenewalSaveDto(DlSubmitResult dlSubmitResult, Object obj) {
        this.result = dlSubmitResult;
        this.failure = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlRenewalSaveDto(DlSubmitResult dlSubmitResult, Object obj, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : dlSubmitResult, (i10 & 2) != 0 ? null : obj);
    }
}
