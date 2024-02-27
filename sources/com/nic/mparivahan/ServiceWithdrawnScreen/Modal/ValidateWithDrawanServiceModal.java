package com.nic.mparivahan.ServiceWithdrawnScreen.Modal;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class ValidateWithDrawanServiceModal {
    @c("Result")
    private final ArrayList<ValidateWithDrawnServiceResultModal> result;
    @c("status_code")
    private final String status_code;
    @c("status_desc")
    private final String status_desc;

    public ValidateWithDrawanServiceModal(String str, String str2, ArrayList<ValidateWithDrawnServiceResultModal> arrayList) {
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        l.f(arrayList, "result");
        this.status_code = str;
        this.status_desc = str2;
        this.result = arrayList;
    }

    public static /* synthetic */ ValidateWithDrawanServiceModal copy$default(ValidateWithDrawanServiceModal validateWithDrawanServiceModal, String str, String str2, ArrayList<ValidateWithDrawnServiceResultModal> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = validateWithDrawanServiceModal.status_code;
        }
        if ((i10 & 2) != 0) {
            str2 = validateWithDrawanServiceModal.status_desc;
        }
        if ((i10 & 4) != 0) {
            arrayList = validateWithDrawanServiceModal.result;
        }
        return validateWithDrawanServiceModal.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.status_code;
    }

    public final String component2() {
        return this.status_desc;
    }

    public final ArrayList<ValidateWithDrawnServiceResultModal> component3() {
        return this.result;
    }

    public final ValidateWithDrawanServiceModal copy(String str, String str2, ArrayList<ValidateWithDrawnServiceResultModal> arrayList) {
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        l.f(arrayList, "result");
        return new ValidateWithDrawanServiceModal(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateWithDrawanServiceModal)) {
            return false;
        }
        ValidateWithDrawanServiceModal validateWithDrawanServiceModal = (ValidateWithDrawanServiceModal) obj;
        return l.a(this.status_code, validateWithDrawanServiceModal.status_code) && l.a(this.status_desc, validateWithDrawanServiceModal.status_desc) && l.a(this.result, validateWithDrawanServiceModal.result);
    }

    public final ArrayList<ValidateWithDrawnServiceResultModal> getResult() {
        return this.result;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.status_code.hashCode() * 31) + this.status_desc.hashCode()) * 31) + this.result.hashCode();
    }

    public String toString() {
        return "ValidateWithDrawanServiceModal(status_code=" + this.status_code + ", status_desc=" + this.status_desc + ", result=" + this.result + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ValidateWithDrawanServiceModal(String str, String str2, ArrayList arrayList, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, arrayList);
    }
}
