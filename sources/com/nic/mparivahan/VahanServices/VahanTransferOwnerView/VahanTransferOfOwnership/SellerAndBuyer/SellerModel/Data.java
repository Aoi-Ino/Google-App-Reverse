package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Data {
    private final String applNo;

    public Data(String str) {
        this.applNo = str;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = data.applNo;
        }
        return data.copy(str);
    }

    public final String component1() {
        return this.applNo;
    }

    public final Data copy(String str) {
        return new Data(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Data) && l.a(this.applNo, ((Data) obj).applNo);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public int hashCode() {
        String str = this.applNo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ')';
    }
}
