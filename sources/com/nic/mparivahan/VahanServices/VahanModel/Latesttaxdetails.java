package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Latesttaxdetails {
    private final Object tax_from;
    private final String tax_mode;
    private final Object tax_upto;

    public Latesttaxdetails(Object obj, String str, Object obj2) {
        this.tax_from = obj;
        this.tax_mode = str;
        this.tax_upto = obj2;
    }

    public static /* synthetic */ Latesttaxdetails copy$default(Latesttaxdetails latesttaxdetails, Object obj, String str, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = latesttaxdetails.tax_from;
        }
        if ((i10 & 2) != 0) {
            str = latesttaxdetails.tax_mode;
        }
        if ((i10 & 4) != 0) {
            obj2 = latesttaxdetails.tax_upto;
        }
        return latesttaxdetails.copy(obj, str, obj2);
    }

    public final Object component1() {
        return this.tax_from;
    }

    public final String component2() {
        return this.tax_mode;
    }

    public final Object component3() {
        return this.tax_upto;
    }

    public final Latesttaxdetails copy(Object obj, String str, Object obj2) {
        return new Latesttaxdetails(obj, str, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Latesttaxdetails)) {
            return false;
        }
        Latesttaxdetails latesttaxdetails = (Latesttaxdetails) obj;
        return l.a(this.tax_from, latesttaxdetails.tax_from) && l.a(this.tax_mode, latesttaxdetails.tax_mode) && l.a(this.tax_upto, latesttaxdetails.tax_upto);
    }

    public final Object getTax_from() {
        return this.tax_from;
    }

    public final String getTax_mode() {
        return this.tax_mode;
    }

    public final Object getTax_upto() {
        return this.tax_upto;
    }

    public int hashCode() {
        Object obj = this.tax_from;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.tax_mode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj2 = this.tax_upto;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "Latesttaxdetails(tax_from=" + this.tax_from + ", tax_mode=" + this.tax_mode + ", tax_upto=" + this.tax_upto + ')';
    }
}
