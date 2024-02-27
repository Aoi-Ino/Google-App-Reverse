package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class NocReasonModleItem {
    private final int code;
    private final String descr;

    public NocReasonModleItem(int i10, String str) {
        l.f(str, "descr");
        this.code = i10;
        this.descr = str;
    }

    public static /* synthetic */ NocReasonModleItem copy$default(NocReasonModleItem nocReasonModleItem, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = nocReasonModleItem.code;
        }
        if ((i11 & 2) != 0) {
            str = nocReasonModleItem.descr;
        }
        return nocReasonModleItem.copy(i10, str);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.descr;
    }

    public final NocReasonModleItem copy(int i10, String str) {
        l.f(str, "descr");
        return new NocReasonModleItem(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NocReasonModleItem)) {
            return false;
        }
        NocReasonModleItem nocReasonModleItem = (NocReasonModleItem) obj;
        return this.code == nocReasonModleItem.code && l.a(this.descr, nocReasonModleItem.descr);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescr() {
        return this.descr;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.descr.hashCode();
    }

    public String toString() {
        return "NocReasonModleItem(code=" + this.code + ", descr=" + this.descr + ')';
    }
}
