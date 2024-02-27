package com.nic.mparivahan.Echallan.Echallan.Model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class PaymentEtransPgi {
    @c("message")
    private final String message;
    @c("status")
    private final int status;
    @c("type")
    private final String type;
    @c("venData")
    private final String venData;
    @c("vurl")
    private final String vurl;

    public PaymentEtransPgi(int i10, String str, String str2, String str3, String str4) {
        l.f(str, "type");
        l.f(str2, "vurl");
        l.f(str3, "venData");
        l.f(str4, "message");
        this.status = i10;
        this.type = str;
        this.vurl = str2;
        this.venData = str3;
        this.message = str4;
    }

    public static /* synthetic */ PaymentEtransPgi copy$default(PaymentEtransPgi paymentEtransPgi, int i10, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = paymentEtransPgi.status;
        }
        if ((i11 & 2) != 0) {
            str = paymentEtransPgi.type;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = paymentEtransPgi.vurl;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = paymentEtransPgi.venData;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = paymentEtransPgi.message;
        }
        return paymentEtransPgi.copy(i10, str5, str6, str7, str4);
    }

    public final int component1() {
        return this.status;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.vurl;
    }

    public final String component4() {
        return this.venData;
    }

    public final String component5() {
        return this.message;
    }

    public final PaymentEtransPgi copy(int i10, String str, String str2, String str3, String str4) {
        l.f(str, "type");
        l.f(str2, "vurl");
        l.f(str3, "venData");
        l.f(str4, "message");
        return new PaymentEtransPgi(i10, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentEtransPgi)) {
            return false;
        }
        PaymentEtransPgi paymentEtransPgi = (PaymentEtransPgi) obj;
        return this.status == paymentEtransPgi.status && l.a(this.type, paymentEtransPgi.type) && l.a(this.vurl, paymentEtransPgi.vurl) && l.a(this.venData, paymentEtransPgi.venData) && l.a(this.message, paymentEtransPgi.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVenData() {
        return this.venData;
    }

    public final String getVurl() {
        return this.vurl;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.status) * 31) + this.type.hashCode()) * 31) + this.vurl.hashCode()) * 31) + this.venData.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "PaymentEtransPgi(status=" + this.status + ", type=" + this.type + ", vurl=" + this.vurl + ", venData=" + this.venData + ", message=" + this.message + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentEtransPgi(int i10, String str, String str2, String str3, String str4, int i11, g gVar) {
        this(i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? "" : str4);
    }
}
