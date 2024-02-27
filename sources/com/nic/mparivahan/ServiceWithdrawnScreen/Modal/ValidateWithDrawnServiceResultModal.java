package com.nic.mparivahan.ServiceWithdrawnScreen.Modal;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ValidateWithDrawnServiceResultModal {
    @c("error_msg")
    private final String errorMsg;
    @c("message")
    private final String message;

    public ValidateWithDrawnServiceResultModal() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ ValidateWithDrawnServiceResultModal copy$default(ValidateWithDrawnServiceResultModal validateWithDrawnServiceResultModal, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = validateWithDrawnServiceResultModal.message;
        }
        if ((i10 & 2) != 0) {
            str2 = validateWithDrawnServiceResultModal.errorMsg;
        }
        return validateWithDrawnServiceResultModal.copy(str, str2);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.errorMsg;
    }

    public final ValidateWithDrawnServiceResultModal copy(String str, String str2) {
        l.f(str, "message");
        l.f(str2, "errorMsg");
        return new ValidateWithDrawnServiceResultModal(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateWithDrawnServiceResultModal)) {
            return false;
        }
        ValidateWithDrawnServiceResultModal validateWithDrawnServiceResultModal = (ValidateWithDrawnServiceResultModal) obj;
        return l.a(this.message, validateWithDrawnServiceResultModal.message) && l.a(this.errorMsg, validateWithDrawnServiceResultModal.errorMsg);
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + this.errorMsg.hashCode();
    }

    public String toString() {
        return "ValidateWithDrawnServiceResultModal(message=" + this.message + ", errorMsg=" + this.errorMsg + ')';
    }

    public ValidateWithDrawnServiceResultModal(String str, String str2) {
        l.f(str, "message");
        l.f(str2, "errorMsg");
        this.message = str;
        this.errorMsg = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ValidateWithDrawnServiceResultModal(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
