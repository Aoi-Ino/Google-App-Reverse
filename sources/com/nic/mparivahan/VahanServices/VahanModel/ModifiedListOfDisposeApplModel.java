package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class ModifiedListOfDisposeApplModel implements Serializable {
    private final String application_status;
    private final String descr;
    private final int off_cd;
    private final int pur_cd;
    private final String regn_no;
    private final String request_dt;
    private final String state_cd;
    private final String transaction_no;

    public ModifiedListOfDisposeApplModel(String str, int i10, String str2, String str3, String str4, String str5, int i11, String str6) {
        l.f(str, "transaction_no");
        l.f(str2, "regn_no");
        l.f(str3, "application_status");
        l.f(str4, "request_dt");
        l.f(str5, "state_cd");
        l.f(str6, "descr");
        this.transaction_no = str;
        this.pur_cd = i10;
        this.regn_no = str2;
        this.application_status = str3;
        this.request_dt = str4;
        this.state_cd = str5;
        this.off_cd = i11;
        this.descr = str6;
    }

    public static /* synthetic */ ModifiedListOfDisposeApplModel copy$default(ModifiedListOfDisposeApplModel modifiedListOfDisposeApplModel, String str, int i10, String str2, String str3, String str4, String str5, int i11, String str6, int i12, Object obj) {
        ModifiedListOfDisposeApplModel modifiedListOfDisposeApplModel2 = modifiedListOfDisposeApplModel;
        int i13 = i12;
        return modifiedListOfDisposeApplModel.copy((i13 & 1) != 0 ? modifiedListOfDisposeApplModel2.transaction_no : str, (i13 & 2) != 0 ? modifiedListOfDisposeApplModel2.pur_cd : i10, (i13 & 4) != 0 ? modifiedListOfDisposeApplModel2.regn_no : str2, (i13 & 8) != 0 ? modifiedListOfDisposeApplModel2.application_status : str3, (i13 & 16) != 0 ? modifiedListOfDisposeApplModel2.request_dt : str4, (i13 & 32) != 0 ? modifiedListOfDisposeApplModel2.state_cd : str5, (i13 & 64) != 0 ? modifiedListOfDisposeApplModel2.off_cd : i11, (i13 & 128) != 0 ? modifiedListOfDisposeApplModel2.descr : str6);
    }

    public final String component1() {
        return this.transaction_no;
    }

    public final int component2() {
        return this.pur_cd;
    }

    public final String component3() {
        return this.regn_no;
    }

    public final String component4() {
        return this.application_status;
    }

    public final String component5() {
        return this.request_dt;
    }

    public final String component6() {
        return this.state_cd;
    }

    public final int component7() {
        return this.off_cd;
    }

    public final String component8() {
        return this.descr;
    }

    public final ModifiedListOfDisposeApplModel copy(String str, int i10, String str2, String str3, String str4, String str5, int i11, String str6) {
        l.f(str, "transaction_no");
        l.f(str2, "regn_no");
        l.f(str3, "application_status");
        l.f(str4, "request_dt");
        String str7 = str5;
        l.f(str7, "state_cd");
        String str8 = str6;
        l.f(str8, "descr");
        return new ModifiedListOfDisposeApplModel(str, i10, str2, str3, str4, str7, i11, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModifiedListOfDisposeApplModel)) {
            return false;
        }
        ModifiedListOfDisposeApplModel modifiedListOfDisposeApplModel = (ModifiedListOfDisposeApplModel) obj;
        return l.a(this.transaction_no, modifiedListOfDisposeApplModel.transaction_no) && this.pur_cd == modifiedListOfDisposeApplModel.pur_cd && l.a(this.regn_no, modifiedListOfDisposeApplModel.regn_no) && l.a(this.application_status, modifiedListOfDisposeApplModel.application_status) && l.a(this.request_dt, modifiedListOfDisposeApplModel.request_dt) && l.a(this.state_cd, modifiedListOfDisposeApplModel.state_cd) && this.off_cd == modifiedListOfDisposeApplModel.off_cd && l.a(this.descr, modifiedListOfDisposeApplModel.descr);
    }

    public final String getApplication_status() {
        return this.application_status;
    }

    public final String getDescr() {
        return this.descr;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getRequest_dt() {
        return this.request_dt;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getTransaction_no() {
        return this.transaction_no;
    }

    public int hashCode() {
        return (((((((((((((this.transaction_no.hashCode() * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.regn_no.hashCode()) * 31) + this.application_status.hashCode()) * 31) + this.request_dt.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.descr.hashCode();
    }

    public String toString() {
        return "ModifiedListOfDisposeApplModel(transaction_no=" + this.transaction_no + ", pur_cd=" + this.pur_cd + ", regn_no=" + this.regn_no + ", application_status=" + this.application_status + ", request_dt=" + this.request_dt + ", state_cd=" + this.state_cd + ", off_cd=" + this.off_cd + ", descr=" + this.descr + ')';
    }
}
