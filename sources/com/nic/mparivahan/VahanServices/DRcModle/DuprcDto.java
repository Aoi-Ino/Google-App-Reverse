package com.nic.mparivahan.VahanServices.DRcModle;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import java.io.Serializable;

@Keep
public final class DuprcDto implements Serializable {
    private final String appl_no;
    private final int comp_cd;
    private final String fir_dt;
    private final String fir_no;
    private final int idv;
    private final String ins_from;
    private final int ins_type;
    private final String ins_upto;
    private final String msg;
    private final String off_cd;
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

    public DuprcDto(String str, int i10, String str2, String str3, int i11, String str4, int i12, String str5, String str6, String str7, String str8, String str9, String str10, int i13, String str11, String str12, int i14, String str13, String str14, String str15, String str16, String str17, String str18, int i15) {
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
        String str32 = str15;
        String str33 = str17;
        l.f(str19, "fir_dt");
        l.f(str20, "fir_no");
        l.f(str21, "ins_from");
        l.f(str22, "ins_upto");
        l.f(str23, "msg");
        l.f(str24, "off_cd");
        l.f(str25, "op_dt");
        l.f(str26, "police_station");
        l.f(str27, "policy_no");
        l.f(str28, "rcp_dt");
        l.f(str29, "rcpt_NO");
        l.f(str30, "reason");
        l.f(str31, "regn_no");
        l.f(str32, "state_cd");
        l.f(str16, "state_header");
        l.f(str17, "status");
        l.f(str18, "tax_mode");
        this.appl_no = str;
        this.comp_cd = i10;
        this.fir_dt = str19;
        this.fir_no = str20;
        this.idv = i11;
        this.ins_from = str21;
        this.ins_type = i12;
        this.ins_upto = str22;
        this.msg = str23;
        this.off_cd = str24;
        this.op_dt = str25;
        this.police_station = str26;
        this.policy_no = str27;
        this.pur_cd = i13;
        this.rcp_dt = str28;
        this.rcpt_NO = str29;
        this.rcpt_amt = i14;
        this.reason = str30;
        this.regn_no = str31;
        this.state_cd = str32;
        this.state_header = str16;
        this.status = str17;
        this.tax_mode = str18;
        this.vh_class = i15;
    }

    public static /* synthetic */ DuprcDto copy$default(DuprcDto duprcDto, String str, int i10, String str2, String str3, int i11, String str4, int i12, String str5, String str6, String str7, String str8, String str9, String str10, int i13, String str11, String str12, int i14, String str13, String str14, String str15, String str16, String str17, String str18, int i15, int i16, Object obj) {
        DuprcDto duprcDto2 = duprcDto;
        int i17 = i16;
        return duprcDto.copy((i17 & 1) != 0 ? duprcDto2.appl_no : str, (i17 & 2) != 0 ? duprcDto2.comp_cd : i10, (i17 & 4) != 0 ? duprcDto2.fir_dt : str2, (i17 & 8) != 0 ? duprcDto2.fir_no : str3, (i17 & 16) != 0 ? duprcDto2.idv : i11, (i17 & 32) != 0 ? duprcDto2.ins_from : str4, (i17 & 64) != 0 ? duprcDto2.ins_type : i12, (i17 & 128) != 0 ? duprcDto2.ins_upto : str5, (i17 & 256) != 0 ? duprcDto2.msg : str6, (i17 & 512) != 0 ? duprcDto2.off_cd : str7, (i17 & 1024) != 0 ? duprcDto2.op_dt : str8, (i17 & 2048) != 0 ? duprcDto2.police_station : str9, (i17 & 4096) != 0 ? duprcDto2.policy_no : str10, (i17 & 8192) != 0 ? duprcDto2.pur_cd : i13, (i17 & 16384) != 0 ? duprcDto2.rcp_dt : str11, (i17 & 32768) != 0 ? duprcDto2.rcpt_NO : str12, (i17 & 65536) != 0 ? duprcDto2.rcpt_amt : i14, (i17 & 131072) != 0 ? duprcDto2.reason : str13, (i17 & 262144) != 0 ? duprcDto2.regn_no : str14, (i17 & 524288) != 0 ? duprcDto2.state_cd : str15, (i17 & 1048576) != 0 ? duprcDto2.state_header : str16, (i17 & 2097152) != 0 ? duprcDto2.status : str17, (i17 & 4194304) != 0 ? duprcDto2.tax_mode : str18, (i17 & 8388608) != 0 ? duprcDto2.vh_class : i15);
    }

    public final String component1() {
        return this.appl_no;
    }

    public final String component10() {
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

    public final DuprcDto copy(String str, int i10, String str2, String str3, int i11, String str4, int i12, String str5, String str6, String str7, String str8, String str9, String str10, int i13, String str11, String str12, int i14, String str13, String str14, String str15, String str16, String str17, String str18, int i15) {
        String str19 = str;
        l.f(str2, "fir_dt");
        l.f(str3, "fir_no");
        l.f(str4, "ins_from");
        l.f(str5, "ins_upto");
        l.f(str6, "msg");
        l.f(str7, "off_cd");
        l.f(str8, "op_dt");
        l.f(str9, "police_station");
        l.f(str10, "policy_no");
        l.f(str11, "rcp_dt");
        l.f(str12, "rcpt_NO");
        l.f(str13, "reason");
        l.f(str14, "regn_no");
        l.f(str15, "state_cd");
        l.f(str16, "state_header");
        l.f(str17, "status");
        l.f(str18, "tax_mode");
        return new DuprcDto(str, i10, str2, str3, i11, str4, i12, str5, str6, str7, str8, str9, str10, i13, str11, str12, i14, str13, str14, str15, str16, str17, str18, i15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuprcDto)) {
            return false;
        }
        DuprcDto duprcDto = (DuprcDto) obj;
        return l.a(this.appl_no, duprcDto.appl_no) && this.comp_cd == duprcDto.comp_cd && l.a(this.fir_dt, duprcDto.fir_dt) && l.a(this.fir_no, duprcDto.fir_no) && this.idv == duprcDto.idv && l.a(this.ins_from, duprcDto.ins_from) && this.ins_type == duprcDto.ins_type && l.a(this.ins_upto, duprcDto.ins_upto) && l.a(this.msg, duprcDto.msg) && l.a(this.off_cd, duprcDto.off_cd) && l.a(this.op_dt, duprcDto.op_dt) && l.a(this.police_station, duprcDto.police_station) && l.a(this.policy_no, duprcDto.policy_no) && this.pur_cd == duprcDto.pur_cd && l.a(this.rcp_dt, duprcDto.rcp_dt) && l.a(this.rcpt_NO, duprcDto.rcpt_NO) && this.rcpt_amt == duprcDto.rcpt_amt && l.a(this.reason, duprcDto.reason) && l.a(this.regn_no, duprcDto.regn_no) && l.a(this.state_cd, duprcDto.state_cd) && l.a(this.state_header, duprcDto.state_header) && l.a(this.status, duprcDto.status) && l.a(this.tax_mode, duprcDto.tax_mode) && this.vh_class == duprcDto.vh_class;
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

    public final String getOff_cd() {
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
        String str = this.appl_no;
        return ((((((((((((((((((((((((((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.comp_cd)) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31) + Integer.hashCode(this.idv)) * 31) + this.ins_from.hashCode()) * 31) + Integer.hashCode(this.ins_type)) * 31) + this.ins_upto.hashCode()) * 31) + this.msg.hashCode()) * 31) + this.off_cd.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.rcp_dt.hashCode()) * 31) + this.rcpt_NO.hashCode()) * 31) + Integer.hashCode(this.rcpt_amt)) * 31) + this.reason.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31) + Integer.hashCode(this.vh_class);
    }

    public String toString() {
        return "DuprcDto(appl_no=" + this.appl_no + ", comp_cd=" + this.comp_cd + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DuprcDto(String str, int i10, String str2, String str3, int i11, String str4, int i12, String str5, String str6, String str7, String str8, String str9, String str10, int i13, String str11, String str12, int i14, String str13, String str14, String str15, String str16, String str17, String str18, int i15, int i16, g gVar) {
        this((i16 & 1) != 0 ? " " : str, (i16 & 2) != 0 ? 22 : i10, str2, str3, (i16 & 16) != 0 ? 0 : i11, str4, (i16 & 64) != 0 ? 1 : i12, str5, str6, str7, str8, str9, str10, i13, str11, str12, i14, str13, str14, str15, str16, str17, str18, i15);
    }
}
