package com.nic.mparivahan.Checkpost.CheckPostModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VpAccount {
    private final double fees;
    private final double fine;
    private final int purCd;
    private final String purCdName;

    public VpAccount(double d10, double d11, int i10, String str) {
        l.f(str, "purCdName");
        this.fees = d10;
        this.fine = d11;
        this.purCd = i10;
        this.purCdName = str;
    }

    public static /* synthetic */ VpAccount copy$default(VpAccount vpAccount, double d10, double d11, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d10 = vpAccount.fees;
        }
        double d12 = d10;
        if ((i11 & 2) != 0) {
            d11 = vpAccount.fine;
        }
        double d13 = d11;
        if ((i11 & 4) != 0) {
            i10 = vpAccount.purCd;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            str = vpAccount.purCdName;
        }
        return vpAccount.copy(d12, d13, i12, str);
    }

    public final double component1() {
        return this.fees;
    }

    public final double component2() {
        return this.fine;
    }

    public final int component3() {
        return this.purCd;
    }

    public final String component4() {
        return this.purCdName;
    }

    public final VpAccount copy(double d10, double d11, int i10, String str) {
        l.f(str, "purCdName");
        return new VpAccount(d10, d11, i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VpAccount)) {
            return false;
        }
        VpAccount vpAccount = (VpAccount) obj;
        return Double.compare(this.fees, vpAccount.fees) == 0 && Double.compare(this.fine, vpAccount.fine) == 0 && this.purCd == vpAccount.purCd && l.a(this.purCdName, vpAccount.purCdName);
    }

    public final double getFees() {
        return this.fees;
    }

    public final double getFine() {
        return this.fine;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getPurCdName() {
        return this.purCdName;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.fees) * 31) + Double.hashCode(this.fine)) * 31) + Integer.hashCode(this.purCd)) * 31) + this.purCdName.hashCode();
    }

    public String toString() {
        return "VpAccount(fees=" + this.fees + ", fine=" + this.fine + ", purCd=" + this.purCd + ", purCdName=" + this.purCdName + ')';
    }
}
