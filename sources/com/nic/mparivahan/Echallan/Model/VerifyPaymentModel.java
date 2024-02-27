package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class VerifyPaymentModel {
    @c("message")
    private String message;
    @c("pgi_url")
    private String pgiUrl;
    @c("reason")
    private String reason;
    @c("status")
    private String status;

    public VerifyPaymentModel(String str, String str2, String str3, String str4) {
        l.f(str, "status");
        l.f(str2, "message");
        l.f(str3, "reason");
        l.f(str4, "pgiUrl");
        this.status = str;
        this.message = str2;
        this.reason = str3;
        this.pgiUrl = str4;
    }

    public static /* synthetic */ VerifyPaymentModel copy$default(VerifyPaymentModel verifyPaymentModel, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = verifyPaymentModel.status;
        }
        if ((i10 & 2) != 0) {
            str2 = verifyPaymentModel.message;
        }
        if ((i10 & 4) != 0) {
            str3 = verifyPaymentModel.reason;
        }
        if ((i10 & 8) != 0) {
            str4 = verifyPaymentModel.pgiUrl;
        }
        return verifyPaymentModel.copy(str, str2, str3, str4);
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
        return this.pgiUrl;
    }

    public final VerifyPaymentModel copy(String str, String str2, String str3, String str4) {
        l.f(str, "status");
        l.f(str2, "message");
        l.f(str3, "reason");
        l.f(str4, "pgiUrl");
        return new VerifyPaymentModel(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyPaymentModel)) {
            return false;
        }
        VerifyPaymentModel verifyPaymentModel = (VerifyPaymentModel) obj;
        return l.a(this.status, verifyPaymentModel.status) && l.a(this.message, verifyPaymentModel.message) && l.a(this.reason, verifyPaymentModel.reason) && l.a(this.pgiUrl, verifyPaymentModel.pgiUrl);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPgiUrl() {
        return this.pgiUrl;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.message.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.pgiUrl.hashCode();
    }

    public final void setMessage(String str) {
        l.f(str, "<set-?>");
        this.message = str;
    }

    public final void setPgiUrl(String str) {
        l.f(str, "<set-?>");
        this.pgiUrl = str;
    }

    public final void setReason(String str) {
        l.f(str, "<set-?>");
        this.reason = str;
    }

    public final void setStatus(String str) {
        l.f(str, "<set-?>");
        this.status = str;
    }

    public String toString() {
        return "VerifyPaymentModel(status=" + this.status + ", message=" + this.message + ", reason=" + this.reason + ", pgiUrl=" + this.pgiUrl + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyPaymentModel(String str, String str2, String str3, String str4, int i10, g gVar) {
        this(str, str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
