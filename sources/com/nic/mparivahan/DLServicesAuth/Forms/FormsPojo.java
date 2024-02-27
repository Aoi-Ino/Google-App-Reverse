package com.nic.mparivahan.DLServicesAuth.Forms;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class FormsPojo {
    private final String form_report;
    private final String status_code;
    private final String status_desc;

    public FormsPojo(String str, String str2, String str3) {
        l.f(str, "form_report");
        l.f(str2, "status_code");
        l.f(str3, "status_desc");
        this.form_report = str;
        this.status_code = str2;
        this.status_desc = str3;
    }

    public static /* synthetic */ FormsPojo copy$default(FormsPojo formsPojo, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = formsPojo.form_report;
        }
        if ((i10 & 2) != 0) {
            str2 = formsPojo.status_code;
        }
        if ((i10 & 4) != 0) {
            str3 = formsPojo.status_desc;
        }
        return formsPojo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.form_report;
    }

    public final String component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.status_desc;
    }

    public final FormsPojo copy(String str, String str2, String str3) {
        l.f(str, "form_report");
        l.f(str2, "status_code");
        l.f(str3, "status_desc");
        return new FormsPojo(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormsPojo)) {
            return false;
        }
        FormsPojo formsPojo = (FormsPojo) obj;
        return l.a(this.form_report, formsPojo.form_report) && l.a(this.status_code, formsPojo.status_code) && l.a(this.status_desc, formsPojo.status_desc);
    }

    public final String getForm_report() {
        return this.form_report;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.form_report.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "FormsPojo(form_report=" + this.form_report + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
