package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VpDetailsEntityById {
    private final String rcpt_no;
    private final String transaction_no;

    public VpDetailsEntityById(String str, String str2) {
        l.f(str, "rcpt_no");
        l.f(str2, "transaction_no");
        this.rcpt_no = str;
        this.transaction_no = str2;
    }

    public static /* synthetic */ VpDetailsEntityById copy$default(VpDetailsEntityById vpDetailsEntityById, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vpDetailsEntityById.rcpt_no;
        }
        if ((i10 & 2) != 0) {
            str2 = vpDetailsEntityById.transaction_no;
        }
        return vpDetailsEntityById.copy(str, str2);
    }

    public final String component1() {
        return this.rcpt_no;
    }

    public final String component2() {
        return this.transaction_no;
    }

    public final VpDetailsEntityById copy(String str, String str2) {
        l.f(str, "rcpt_no");
        l.f(str2, "transaction_no");
        return new VpDetailsEntityById(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VpDetailsEntityById)) {
            return false;
        }
        VpDetailsEntityById vpDetailsEntityById = (VpDetailsEntityById) obj;
        return l.a(this.rcpt_no, vpDetailsEntityById.rcpt_no) && l.a(this.transaction_no, vpDetailsEntityById.transaction_no);
    }

    public final String getRcpt_no() {
        return this.rcpt_no;
    }

    public final String getTransaction_no() {
        return this.transaction_no;
    }

    public int hashCode() {
        return (this.rcpt_no.hashCode() * 31) + this.transaction_no.hashCode();
    }

    public String toString() {
        return "VpDetailsEntityById(rcpt_no=" + this.rcpt_no + ", transaction_no=" + this.transaction_no + ')';
    }
}
