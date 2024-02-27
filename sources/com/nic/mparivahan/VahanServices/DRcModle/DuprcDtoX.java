package com.nic.mparivahan.VahanServices.DRcModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DuprcDtoX {
    private final String appl_no;
    private final int comp_cd;
    private final String fir_dt;
    private final String fir_no;
    private final int idv;
    private final String ins_from;
    private final int ins_type;
    private final String ins_upto;
    private final String msg;
    private final int off_cd;
    private final String op_dt;
    private final String police_station;
    private final String policy_no;
    private final int pur_cd;
    private final String rcp_dt;
    private final String rcpt_NO;
    private final int rcpt_amt;
    private final String reason;
    private final String regn_no;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final int vh_class;

    public DuprcDtoX(String str, int i10, String str2, String str3, int i11, String str4, int i12, String str5, String str6, int i13, String str7, String str8, String str9, int i14, String str10, String str11, int i15, String str12, String str13, String str14, String str15, String str16, String str17, int i16) {
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        String str23 = str6;
        String str24 = str7;
        String str25 = str8;
        String str26 = str9;
        String str27 = str10;
        String str28 = str11;
        String str29 = str12;
        String str30 = str13;
        String str31 = str14;
        String str32 = str16;
        l.f(str18, "appl_no");
        l.f(str19, "fir_dt");
        l.f(str20, "fir_no");
        l.f(str21, "ins_from");
        l.f(str22, "ins_upto");
        l.f(str23, "msg");
        l.f(str24, "op_dt");
        l.f(str25, "police_station");
        l.f(str26, "policy_no");
        l.f(str27, "rcp_dt");
        l.f(str28, "rcpt_NO");
        l.f(str29, "reason");
        l.f(str30, "regn_no");
        l.f(str31, "state_cd");
        l.f(str15, "state_header");
        l.f(str16, "status");
        l.f(str17, "tax_mode");
        this.appl_no = str18;
        this.comp_cd = i10;
        this.fir_dt = str19;
        this.fir_no = str20;
        this.idv = i11;
        this.ins_from = str21;
        this.ins_type = i12;
        this.ins_upto = str22;
        this.msg = str23;
        this.off_cd = i13;
        this.op_dt = str24;
        this.police_station = str25;
        this.policy_no = str26;
        this.pur_cd = i14;
        this.rcp_dt = str27;
        this.rcpt_NO = str28;
        this.rcpt_amt = i15;
        this.reason = str29;
        this.regn_no = str30;
        this.state_cd = str31;
        this.state_header = str15;
        this.status = str16;
        this.tax_mode = str17;
        this.vh_class = i16;
    }

    public static /* synthetic */ DuprcDtoX copy$default(DuprcDtoX duprcDtoX, String str, int i10, String str2, String str3, int i11, String str4, int i12, String str5, String str6, int i13, String str7, String str8, String str9, int i14, String str10, String str11, int i15, String str12, String str13, String str14, String str15, String str16, String str17, int i16, int i17, Object obj) {
        DuprcDtoX duprcDtoX2 = duprcDtoX;
        int i18 = i17;
        return duprcDtoX.copy((i18 & 1) != 0 ? duprcDtoX2.appl_no : str, (i18 & 2) != 0 ? duprcDtoX2.comp_cd : i10, (i18 & 4) != 0 ? duprcDtoX2.fir_dt : str2, (i18 & 8) != 0 ? duprcDtoX2.fir_no : str3, (i18 & 16) != 0 ? duprcDtoX2.idv : i11, (i18 & 32) != 0 ? duprcDtoX2.ins_from : str4, (i18 & 64) != 0 ? duprcDtoX2.ins_type : i12, (i18 & 128) != 0 ? duprcDtoX2.ins_upto : str5, (i18 & 256) != 0 ? duprcDtoX2.msg : str6, (i18 & 512) != 0 ? duprcDtoX2.off_cd : i13, (i18 & 1024) != 0 ? duprcDtoX2.op_dt : str7, (i18 & 2048) != 0 ? duprcDtoX2.police_station : str8, (i18 & 4096) != 0 ? duprcDtoX2.policy_no : str9, (i18 & 8192) != 0 ? duprcDtoX2.pur_cd : i14, (i18 & 16384) != 0 ? duprcDtoX2.rcp_dt : str10, (i18 & 32768) != 0 ? duprcDtoX2.rcpt_NO : str11, (i18 & 65536) != 0 ? duprcDtoX2.rcpt_amt : i15, (i18 & 131072) != 0 ? duprcDtoX2.reason : str12, (i18 & 262144) != 0 ? duprcDtoX2.regn_no : str13, (i18 & 524288) != 0 ? duprcDtoX2.state_cd : str14, (i18 & 1048576) != 0 ? duprcDtoX2.state_header : str15, (i18 & 2097152) != 0 ? duprcDtoX2.status : str16, (i18 & 4194304) != 0 ? duprcDtoX2.tax_mode : str17, (i18 & 8388608) != 0 ? duprcDtoX2.vh_class : i16);
    }

    public final String component1() {
        return this.appl_no;
    }

    public final int component10() {
        return this.off_cd;
    }

    public final String component11() {
        return this.op_dt;
    }

    public final String component12() {
        return this.police_station;
    }

    public final String component13() {
        return this.policy_no;
    }

    public final int component14() {
        return this.pur_cd;
    }

    public final String component15() {
        return this.rcp_dt;
    }

    public final String component16() {
        return this.rcpt_NO;
    }

    public final int component17() {
        return this.rcpt_amt;
    }

    public final String component18() {
        return this.reason;
    }

    public final String component19() {
        return this.regn_no;
    }

    public final int component2() {
        return this.comp_cd;
    }

    public final String component20() {
        return this.state_cd;
    }

    public final String component21() {
        return this.state_header;
    }

    public final String component22() {
        return this.status;
    }

    public final String component23() {
        return this.tax_mode;
    }

    public final int component24() {
        return this.vh_class;
    }

    public final String component3() {
        return this.fir_dt;
    }

    public final String component4() {
        return this.fir_no;
    }

    public final int component5() {
        return this.idv;
    }

    public final String component6() {
        return this.ins_from;
    }

    public final int component7() {
        return this.ins_type;
    }

    public final String component8() {
        return this.ins_upto;
    }

    public final String component9() {
        return this.msg;
    }

    public final DuprcDtoX copy(String str, int i10, String str2, String str3, int i11, String str4, int i12, String str5, String str6, int i13, String str7, String str8, String str9, int i14, String str10, String str11, int i15, String str12, String str13, String str14, String str15, String str16, String str17, int i16) {
        String str18 = str;
        l.f(str18, "appl_no");
        l.f(str2, "fir_dt");
        l.f(str3, "fir_no");
        l.f(str4, "ins_from");
        l.f(str5, "ins_upto");
        l.f(str6, "msg");
        l.f(str7, "op_dt");
        l.f(str8, "police_station");
        l.f(str9, "policy_no");
        l.f(str10, "rcp_dt");
        l.f(str11, "rcpt_NO");
        l.f(str12, "reason");
        l.f(str13, "regn_no");
        l.f(str14, "state_cd");
        l.f(str15, "state_header");
        l.f(str16, "status");
        l.f(str17, "tax_mode");
        return new DuprcDtoX(str18, i10, str2, str3, i11, str4, i12, str5, str6, i13, str7, str8, str9, i14, str10, str11, i15, str12, str13, str14, str15, str16, str17, i16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuprcDtoX)) {
            return false;
        }
        DuprcDtoX duprcDtoX = (DuprcDtoX) obj;
        return l.a(this.appl_no, duprcDtoX.appl_no) && this.comp_cd == duprcDtoX.comp_cd && l.a(this.fir_dt, duprcDtoX.fir_dt) && l.a(this.fir_no, duprcDtoX.fir_no) && this.idv == duprcDtoX.idv && l.a(this.ins_from, duprcDtoX.ins_from) && this.ins_type == duprcDtoX.ins_type && l.a(this.ins_upto, duprcDtoX.ins_upto) && l.a(this.msg, duprcDtoX.msg) && this.off_cd == duprcDtoX.off_cd && l.a(this.op_dt, duprcDtoX.op_dt) && l.a(this.police_station, duprcDtoX.police_station) && l.a(this.policy_no, duprcDtoX.policy_no) && this.pur_cd == duprcDtoX.pur_cd && l.a(this.rcp_dt, duprcDtoX.rcp_dt) && l.a(this.rcpt_NO, duprcDtoX.rcpt_NO) && this.rcpt_amt == duprcDtoX.rcpt_amt && l.a(this.reason, duprcDtoX.reason) && l.a(this.regn_no, duprcDtoX.regn_no) && l.a(this.state_cd, duprcDtoX.state_cd) && l.a(this.state_header, duprcDtoX.state_header) && l.a(this.status, duprcDtoX.status) && l.a(this.tax_mode, duprcDtoX.tax_mode) && this.vh_class == duprcDtoX.vh_class;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final int getComp_cd() {
        return this.comp_cd;
    }

    public final String getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
        return this.fir_no;
    }

    public final int getIdv() {
        return this.idv;
    }

    public final String getIns_from() {
        return this.ins_from;
    }

    public final int getIns_type() {
        return this.ins_type;
    }

    public final String getIns_upto() {
        return this.ins_upto;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getPolice_station() {
        return this.police_station;
    }

    public final String getPolicy_no() {
        return this.policy_no;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final int getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_header() {
        return this.state_header;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTax_mode() {
        return this.tax_mode;
    }

    public final int getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((this.appl_no.hashCode() * 31) + Integer.hashCode(this.comp_cd)) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31) + Integer.hashCode(this.idv)) * 31) + this.ins_from.hashCode()) * 31) + Integer.hashCode(this.ins_type)) * 31) + this.ins_upto.hashCode()) * 31) + this.msg.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.rcp_dt.hashCode()) * 31) + this.rcpt_NO.hashCode()) * 31) + Integer.hashCode(this.rcpt_amt)) * 31) + this.reason.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31) + Integer.hashCode(this.vh_class);
    }

    public String toString() {
        return "DuprcDtoX(appl_no=" + this.appl_no + ", comp_cd=" + this.comp_cd + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ')';
    }
}
