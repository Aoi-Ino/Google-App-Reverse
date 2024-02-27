package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class TaxModes {
    private final String descr;
    private final String tax_mode;

    public TaxModes(String str, String str2) {
        this.descr = str;
        this.tax_mode = str2;
    }

    public static /* synthetic */ TaxModes copy$default(TaxModes taxModes, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = taxModes.descr;
        }
        if ((i10 & 2) != 0) {
            str2 = taxModes.tax_mode;
        }
        return taxModes.copy(str, str2);
    }

    public final String component1() {
        return this.descr;
    }

    public final String component2() {
        return this.tax_mode;
    }

    public final TaxModes copy(String str, String str2) {
        return new TaxModes(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxModes)) {
            return false;
        }
        TaxModes taxModes = (TaxModes) obj;
        return l.a(this.descr, taxModes.descr) && l.a(this.tax_mode, taxModes.tax_mode);
    }

    public final String getDescr() {
        return this.descr;
    }

    public final String getTax_mode() {
        return this.tax_mode;
    }

    public int hashCode() {
        String str = this.descr;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tax_mode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "TaxModes(descr=" + this.descr + ", tax_mode=" + this.tax_mode + ')';
    }
}
