package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class RequireDataForBePaymet {
    private final String bank_code;
    private final int off_cd;
    private final String payment_mode;
    private final int rcpt_amt;
    private final String rcpt_dt;
    private final String regn_no;
    private final String response_code;
    private final String return_rcpt_no;
    private final Object rto_challan_dt;
    private final String state_cd;
    private final Object treasury_ref_no;
    private final VpDetailsEntityById vp_details_EntityById;

    public RequireDataForBePaymet(String str, int i10, String str2, int i11, String str3, String str4, String str5, String str6, Object obj, String str7, Object obj2, VpDetailsEntityById vpDetailsEntityById) {
        l.f(str, "bank_code");
        l.f(str2, "payment_mode");
        l.f(str3, "rcpt_dt");
        l.f(str4, "regn_no");
        l.f(str5, "response_code");
        l.f(str6, "return_rcpt_no");
        l.f(obj, "rto_challan_dt");
        l.f(str7, "state_cd");
        l.f(obj2, "treasury_ref_no");
        l.f(vpDetailsEntityById, "vp_details_EntityById");
        this.bank_code = str;
        this.off_cd = i10;
        this.payment_mode = str2;
        this.rcpt_amt = i11;
        this.rcpt_dt = str3;
        this.regn_no = str4;
        this.response_code = str5;
        this.return_rcpt_no = str6;
        this.rto_challan_dt = obj;
        this.state_cd = str7;
        this.treasury_ref_no = obj2;
        this.vp_details_EntityById = vpDetailsEntityById;
    }

    public static /* synthetic */ RequireDataForBePaymet copy$default(RequireDataForBePaymet requireDataForBePaymet, String str, int i10, String str2, int i11, String str3, String str4, String str5, String str6, Object obj, String str7, Object obj2, VpDetailsEntityById vpDetailsEntityById, int i12, Object obj3) {
        RequireDataForBePaymet requireDataForBePaymet2 = requireDataForBePaymet;
        int i13 = i12;
        return requireDataForBePaymet.copy((i13 & 1) != 0 ? requireDataForBePaymet2.bank_code : str, (i13 & 2) != 0 ? requireDataForBePaymet2.off_cd : i10, (i13 & 4) != 0 ? requireDataForBePaymet2.payment_mode : str2, (i13 & 8) != 0 ? requireDataForBePaymet2.rcpt_amt : i11, (i13 & 16) != 0 ? requireDataForBePaymet2.rcpt_dt : str3, (i13 & 32) != 0 ? requireDataForBePaymet2.regn_no : str4, (i13 & 64) != 0 ? requireDataForBePaymet2.response_code : str5, (i13 & 128) != 0 ? requireDataForBePaymet2.return_rcpt_no : str6, (i13 & 256) != 0 ? requireDataForBePaymet2.rto_challan_dt : obj, (i13 & 512) != 0 ? requireDataForBePaymet2.state_cd : str7, (i13 & 1024) != 0 ? requireDataForBePaymet2.treasury_ref_no : obj2, (i13 & 2048) != 0 ? requireDataForBePaymet2.vp_details_EntityById : vpDetailsEntityById);
    }

    public final String component1() {
        return this.bank_code;
    }

    public final String component10() {
        return this.state_cd;
    }

    public final Object component11() {
        return this.treasury_ref_no;
    }

    public final VpDetailsEntityById component12() {
        return this.vp_details_EntityById;
    }

    public final int component2() {
        return this.off_cd;
    }

    public final String component3() {
        return this.payment_mode;
    }

    public final int component4() {
        return this.rcpt_amt;
    }

    public final String component5() {
        return this.rcpt_dt;
    }

    public final String component6() {
        return this.regn_no;
    }

    public final String component7() {
        return this.response_code;
    }

    public final String component8() {
        return this.return_rcpt_no;
    }

    public final Object component9() {
        return this.rto_challan_dt;
    }

    public final RequireDataForBePaymet copy(String str, int i10, String str2, int i11, String str3, String str4, String str5, String str6, Object obj, String str7, Object obj2, VpDetailsEntityById vpDetailsEntityById) {
        l.f(str, "bank_code");
        String str8 = str2;
        l.f(str8, "payment_mode");
        String str9 = str3;
        l.f(str9, "rcpt_dt");
        String str10 = str4;
        l.f(str10, "regn_no");
        String str11 = str5;
        l.f(str11, "response_code");
        String str12 = str6;
        l.f(str12, "return_rcpt_no");
        Object obj3 = obj;
        l.f(obj3, "rto_challan_dt");
        String str13 = str7;
        l.f(str13, "state_cd");
        Object obj4 = obj2;
        l.f(obj4, "treasury_ref_no");
        VpDetailsEntityById vpDetailsEntityById2 = vpDetailsEntityById;
        l.f(vpDetailsEntityById2, "vp_details_EntityById");
        return new RequireDataForBePaymet(str, i10, str8, i11, str9, str10, str11, str12, obj3, str13, obj4, vpDetailsEntityById2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequireDataForBePaymet)) {
            return false;
        }
        RequireDataForBePaymet requireDataForBePaymet = (RequireDataForBePaymet) obj;
        return l.a(this.bank_code, requireDataForBePaymet.bank_code) && this.off_cd == requireDataForBePaymet.off_cd && l.a(this.payment_mode, requireDataForBePaymet.payment_mode) && this.rcpt_amt == requireDataForBePaymet.rcpt_amt && l.a(this.rcpt_dt, requireDataForBePaymet.rcpt_dt) && l.a(this.regn_no, requireDataForBePaymet.regn_no) && l.a(this.response_code, requireDataForBePaymet.response_code) && l.a(this.return_rcpt_no, requireDataForBePaymet.return_rcpt_no) && l.a(this.rto_challan_dt, requireDataForBePaymet.rto_challan_dt) && l.a(this.state_cd, requireDataForBePaymet.state_cd) && l.a(this.treasury_ref_no, requireDataForBePaymet.treasury_ref_no) && l.a(this.vp_details_EntityById, requireDataForBePaymet.vp_details_EntityById);
    }

    public final String getBank_code() {
        return this.bank_code;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getPayment_mode() {
        return this.payment_mode;
    }

    public final int getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getResponse_code() {
        return this.response_code;
    }

    public final String getReturn_rcpt_no() {
        return this.return_rcpt_no;
    }

    public final Object getRto_challan_dt() {
        return this.rto_challan_dt;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final Object getTreasury_ref_no() {
        return this.treasury_ref_no;
    }

    public final VpDetailsEntityById getVp_details_EntityById() {
        return this.vp_details_EntityById;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.bank_code.hashCode() * 31) + Integer.hashCode(this.off_cd)) * 31) + this.payment_mode.hashCode()) * 31) + Integer.hashCode(this.rcpt_amt)) * 31) + this.rcpt_dt.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.response_code.hashCode()) * 31) + this.return_rcpt_no.hashCode()) * 31) + this.rto_challan_dt.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.treasury_ref_no.hashCode()) * 31) + this.vp_details_EntityById.hashCode();
    }

    public String toString() {
        return "RequireDataForBePaymet(bank_code=" + this.bank_code + ", off_cd=" + this.off_cd + ", payment_mode=" + this.payment_mode + ", rcpt_amt=" + this.rcpt_amt + ", rcpt_dt=" + this.rcpt_dt + ", regn_no=" + this.regn_no + ", response_code=" + this.response_code + ", return_rcpt_no=" + this.return_rcpt_no + ", rto_challan_dt=" + this.rto_challan_dt + ", state_cd=" + this.state_cd + ", treasury_ref_no=" + this.treasury_ref_no + ", vp_details_EntityById=" + this.vp_details_EntityById + ')';
    }
}
