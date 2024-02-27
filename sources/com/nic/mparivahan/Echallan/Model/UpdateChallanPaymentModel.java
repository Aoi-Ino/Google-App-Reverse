package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class UpdateChallanPaymentModel {
    @c("message")
    private String message;
    @c("reason")
    private String reason;
    @c("receipt_url")
    private String receiptUrl;
    @c("status")
    private String status;

    public UpdateChallanPaymentModel(String str, String str2, String str3, String str4) {
        l.f(str, "status");
        l.f(str2, "message");
        l.f(str3, "reason");
        l.f(str4, "receiptUrl");
        this.status = str;
        this.message = str2;
        this.reason = str3;
        this.receiptUrl = str4;
    }

    public static /* synthetic */ UpdateChallanPaymentModel copy$default(UpdateChallanPaymentModel updateChallanPaymentModel, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updateChallanPaymentModel.status;
        }
        if ((i10 & 2) != 0) {
            str2 = updateChallanPaymentModel.message;
        }
        if ((i10 & 4) != 0) {
            str3 = updateChallanPaymentModel.reason;
        }
        if ((i10 & 8) != 0) {
            str4 = updateChallanPaymentModel.receiptUrl;
        }
        return updateChallanPaymentModel.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.receiptUrl;
    }

    public final UpdateChallanPaymentModel copy(String str, String str2, String str3, String str4) {
        l.f(str, "status");
        l.f(str2, "message");
        l.f(str3, "reason");
        l.f(str4, "receiptUrl");
        return new UpdateChallanPaymentModel(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateChallanPaymentModel)) {
            return false;
        }
        UpdateChallanPaymentModel updateChallanPaymentModel = (UpdateChallanPaymentModel) obj;
        return l.a(this.status, updateChallanPaymentModel.status) && l.a(this.message, updateChallanPaymentModel.message) && l.a(this.reason, updateChallanPaymentModel.reason) && l.a(this.receiptUrl, updateChallanPaymentModel.receiptUrl);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReceiptUrl() {
        return this.receiptUrl;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.message.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.receiptUrl.hashCode();
    }

    public final void setMessage(String str) {
        l.f(str, "<set-?>");
        this.message = str;
    }

    public final void setReason(String str) {
        l.f(str, "<set-?>");
        this.reason = str;
    }

    public final void setReceiptUrl(String str) {
        l.f(str, "<set-?>");
        this.receiptUrl = str;
    }

    public final void setStatus(String str) {
        l.f(str, "<set-?>");
        this.status = str;
    }

    public String toString() {
        return "UpdateChallanPaymentModel(status=" + this.status + ", message=" + this.message + ", reason=" + this.reason + ", receiptUrl=" + this.receiptUrl + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateChallanPaymentModel(String str, String str2, String str3, String str4, int i10, g gVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? "" : str4);
    }
}
