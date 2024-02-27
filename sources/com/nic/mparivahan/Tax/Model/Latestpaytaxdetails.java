package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Latestpaytaxdetails {
    private final String rcpt_dt;
    private final Object tax_amt;
    private final Object tax_from;
    private final String tax_mode;
    private final Object tax_upto;

    public Latestpaytaxdetails(Object obj, String str, Object obj2, Object obj3, String str2) {
        l.f(str2, "rcpt_dt");
        this.tax_from = obj;
        this.tax_mode = str;
        this.tax_upto = obj2;
        this.tax_amt = obj3;
        this.rcpt_dt = str2;
    }

    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final Object getTax_amt() {
        return this.tax_amt;
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
}
