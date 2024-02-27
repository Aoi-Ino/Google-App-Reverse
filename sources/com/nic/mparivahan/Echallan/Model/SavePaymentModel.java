package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class SavePaymentModel {
    @c("message")
    private final String message;
    @c("pgi_url")
    private final String pageUrl;
    @c("reason")
    private final String reason;
    @c("status")
    private final String status;

    public SavePaymentModel(String str, String str2, String str3, String str4) {
        l.f(str, "status");
        l.f(str2, "message");
        l.f(str3, "reason");
        l.f(str4, "pageUrl");
        this.status = str;
        this.message = str2;
        this.reason = str3;
        this.pageUrl = str4;
    }

    public static /* synthetic */ SavePaymentModel copy$default(SavePaymentModel savePaymentModel, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = savePaymentModel.status;
        }
        if ((i10 & 2) != 0) {
            str2 = savePaymentModel.message;
        }
        if ((i10 & 4) != 0) {
            str3 = savePaymentModel.reason;
        }
        if ((i10 & 8) != 0) {
            str4 = savePaymentModel.pageUrl;
        }
        return savePaymentModel.copy(str, str2, str3, str4);
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
        return this.pageUrl;
    }

    public final SavePaymentModel copy(String str, String str2, String str3, String str4) {
        l.f(str, "status");
        l.f(str2, "message");
        l.f(str3, "reason");
        l.f(str4, "pageUrl");
        return new SavePaymentModel(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavePaymentModel)) {
            return false;
        }
        SavePaymentModel savePaymentModel = (SavePaymentModel) obj;
        return l.a(this.status, savePaymentModel.status) && l.a(this.message, savePaymentModel.message) && l.a(this.reason, savePaymentModel.reason) && l.a(this.pageUrl, savePaymentModel.pageUrl);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.message.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.pageUrl.hashCode();
    }

    public String toString() {
        return "SavePaymentModel(status=" + this.status + ", message=" + this.message + ", reason=" + this.reason + ", pageUrl=" + this.pageUrl + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SavePaymentModel(String str, String str2, String str3, String str4, int i10, g gVar) {
        this(str, str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
