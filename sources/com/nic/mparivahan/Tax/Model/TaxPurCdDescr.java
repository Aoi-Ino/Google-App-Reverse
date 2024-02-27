package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class TaxPurCdDescr {
    private final String Pur_code;
    private final String descr;
    private final ArrayList<TaxModes> listTaxModes;

    public TaxPurCdDescr(String str, String str2, ArrayList<TaxModes> arrayList) {
        l.f(str, "Pur_code");
        l.f(str2, "descr");
        l.f(arrayList, "listTaxModes");
        this.Pur_code = str;
        this.descr = str2;
        this.listTaxModes = arrayList;
    }

    public static /* synthetic */ TaxPurCdDescr copy$default(TaxPurCdDescr taxPurCdDescr, String str, String str2, ArrayList<TaxModes> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = taxPurCdDescr.Pur_code;
        }
        if ((i10 & 2) != 0) {
            str2 = taxPurCdDescr.descr;
        }
        if ((i10 & 4) != 0) {
            arrayList = taxPurCdDescr.listTaxModes;
        }
        return taxPurCdDescr.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.Pur_code;
    }

    public final String component2() {
        return this.descr;
    }

    public final ArrayList<TaxModes> component3() {
        return this.listTaxModes;
    }

    public final TaxPurCdDescr copy(String str, String str2, ArrayList<TaxModes> arrayList) {
        l.f(str, "Pur_code");
        l.f(str2, "descr");
        l.f(arrayList, "listTaxModes");
        return new TaxPurCdDescr(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxPurCdDescr)) {
            return false;
        }
        TaxPurCdDescr taxPurCdDescr = (TaxPurCdDescr) obj;
        return l.a(this.Pur_code, taxPurCdDescr.Pur_code) && l.a(this.descr, taxPurCdDescr.descr) && l.a(this.listTaxModes, taxPurCdDescr.listTaxModes);
    }

    public final String getDescr() {
        return this.descr;
    }

    public final ArrayList<TaxModes> getListTaxModes() {
        return this.listTaxModes;
    }

    public final String getPur_code() {
        return this.Pur_code;
    }

    public int hashCode() {
        return (((this.Pur_code.hashCode() * 31) + this.descr.hashCode()) * 31) + this.listTaxModes.hashCode();
    }

    public String toString() {
        return "TaxPurCdDescr(Pur_code=" + this.Pur_code + ", descr=" + this.descr + ", listTaxModes=" + this.listTaxModes + ')';
    }
}
