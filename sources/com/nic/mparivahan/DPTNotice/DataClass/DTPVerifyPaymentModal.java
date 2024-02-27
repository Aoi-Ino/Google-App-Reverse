package com.nic.mparivahan.DPTNotice.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class DTPVerifyPaymentModal {
    @c("message")
    private final String message;
    @c("pgi_url")
    private final String pgiUrl;
    @c("reason")
    private final String resason;
    @c("status")
    private final String status;

    public DTPVerifyPaymentModal() {
        this((String) null, (String) null, (String) null, (String) null, 15, (g) null);
    }

    public static /* synthetic */ DTPVerifyPaymentModal copy$default(DTPVerifyPaymentModal dTPVerifyPaymentModal, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dTPVerifyPaymentModal.status;
        }
        if ((i10 & 2) != 0) {
            str2 = dTPVerifyPaymentModal.message;
        }
        if ((i10 & 4) != 0) {
            str3 = dTPVerifyPaymentModal.resason;
        }
        if ((i10 & 8) != 0) {
            str4 = dTPVerifyPaymentModal.pgiUrl;
        }
        return dTPVerifyPaymentModal.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.resason;
    }

    public final String component4() {
        return this.pgiUrl;
    }

    public final DTPVerifyPaymentModal copy(String str, String str2, String str3, String str4) {
        l.f(str, "status");
        l.f(str2, "message");
        l.f(str3, "resason");
        l.f(str4, "pgiUrl");
        return new DTPVerifyPaymentModal(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DTPVerifyPaymentModal)) {
            return false;
        }
        DTPVerifyPaymentModal dTPVerifyPaymentModal = (DTPVerifyPaymentModal) obj;
        return l.a(this.status, dTPVerifyPaymentModal.status) && l.a(this.message, dTPVerifyPaymentModal.message) && l.a(this.resason, dTPVerifyPaymentModal.resason) && l.a(this.pgiUrl, dTPVerifyPaymentModal.pgiUrl);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPgiUrl() {
        return this.pgiUrl;
    }

    public final String getResason() {
        return this.resason;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.message.hashCode()) * 31) + this.resason.hashCode()) * 31) + this.pgiUrl.hashCode();
    }

    public String toString() {
        return "DTPVerifyPaymentModal(status=" + this.status + ", message=" + this.message + ", resason=" + this.resason + ", pgiUrl=" + this.pgiUrl + ')';
    }

    public DTPVerifyPaymentModal(String str, String str2, String str3, String str4) {
        l.f(str, "status");
        l.f(str2, "message");
        l.f(str3, "resason");
        l.f(str4, "pgiUrl");
        this.status = str;
        this.message = str2;
        this.resason = str3;
        this.pgiUrl = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DTPVerifyPaymentModal(String str, String str2, String str3, String str4, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
