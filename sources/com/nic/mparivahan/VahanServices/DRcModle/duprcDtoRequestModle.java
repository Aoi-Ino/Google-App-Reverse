package com.nic.mparivahan.VahanServices.DRcModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class duprcDtoRequestModle {
    private final String appl_no;
    private final int comp_cd;
    private final DuprcDto duprcDto;
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

    public duprcDtoRequestModle(String str, int i10, DuprcDto duprcDto2, String str2, String str3, int i11, String str4, int i12, String str5, String str6, String str7, String str8, String str9, String str10, int i13, String str11, String str12, int i14, String str13, String str14, String str15, String str16, String str17, String str18, int i15) {
        String str19 = str;
        DuprcDto duprcDto3 = duprcDto2;
        String str20 = str2;
        String str21 = str3;
        String str22 = str4;
        String str23 = str5;
        String str24 = str6;
        String str25 = str7;
        String str26 = str8;
        String str27 = str9;
        String str28 = str10;
        String str29 = str11;
        String str30 = str12;
        String str31 = str13;
        String str32 = str15;
        l.f(str19, "appl_no");
        l.f(duprcDto3, "duprcDto");
        l.f(str20, "fir_dt");
        l.f(str21, "fir_no");
        l.f(str22, "ins_from");
        l.f(str23, "ins_upto");
        l.f(str24, "msg");
        l.f(str25, "off_cd");
        l.f(str26, "op_dt");
        l.f(str27, "police_station");
        l.f(str28, "policy_no");
        l.f(str29, "rcp_dt");
        l.f(str30, "rcpt_NO");
        l.f(str31, "reason");
        l.f(str14, "regn_no");
        l.f(str15, "state_cd");
        l.f(str16, "state_header");
        l.f(str17, "status");
        l.f(str18, "tax_mode");
        this.appl_no = str19;
        this.comp_cd = i10;
        this.duprcDto = duprcDto3;
        this.fir_dt = str20;
        this.fir_no = str21;
        this.idv = i11;
        this.ins_from = str22;
        this.ins_type = i12;
        this.ins_upto = str23;
        this.msg = str24;
        this.off_cd = str25;
        this.op_dt = str26;
        this.police_station = str27;
        this.policy_no = str28;
        this.pur_cd = i13;
        this.rcp_dt = str29;
        this.rcpt_NO = str30;
        this.rcpt_amt = i14;
        this.reason = str31;
        this.regn_no = str14;
        this.state_cd = str15;
        this.state_header = str16;
        this.status = str17;
        this.tax_mode = str18;
        this.vh_class = i15;
    }

    public static /* synthetic */ duprcDtoRequestModle copy$default(duprcDtoRequestModle duprcdtorequestmodle, String str, int i10, DuprcDto duprcDto2, String str2, String str3, int i11, String str4, int i12, String str5, String str6, String str7, String str8, String str9, String str10, int i13, String str11, String str12, int i14, String str13, String str14, String str15, String str16, String str17, String str18, int i15, int i16, Object obj) {
        duprcDtoRequestModle duprcdtorequestmodle2 = duprcdtorequestmodle;
        int i17 = i16;
        return duprcdtorequestmodle.copy((i17 & 1) != 0 ? duprcdtorequestmodle2.appl_no : str, (i17 & 2) != 0 ? duprcdtorequestmodle2.comp_cd : i10, (i17 & 4) != 0 ? duprcdtorequestmodle2.duprcDto : duprcDto2, (i17 & 8) != 0 ? duprcdtorequestmodle2.fir_dt : str2, (i17 & 16) != 0 ? duprcdtorequestmodle2.fir_no : str3, (i17 & 32) != 0 ? duprcdtorequestmodle2.idv : i11, (i17 & 64) != 0 ? duprcdtorequestmodle2.ins_from : str4, (i17 & 128) != 0 ? duprcdtorequestmodle2.ins_type : i12, (i17 & 256) != 0 ? duprcdtorequestmodle2.ins_upto : str5, (i17 & 512) != 0 ? duprcdtorequestmodle2.msg : str6, (i17 & 1024) != 0 ? duprcdtorequestmodle2.off_cd : str7, (i17 & 2048) != 0 ? duprcdtorequestmodle2.op_dt : str8, (i17 & 4096) != 0 ? duprcdtorequestmodle2.police_station : str9, (i17 & 8192) != 0 ? duprcdtorequestmodle2.policy_no : str10, (i17 & 16384) != 0 ? duprcdtorequestmodle2.pur_cd : i13, (i17 & 32768) != 0 ? duprcdtorequestmodle2.rcp_dt : str11, (i17 & 65536) != 0 ? duprcdtorequestmodle2.rcpt_NO : str12, (i17 & 131072) != 0 ? duprcdtorequestmodle2.rcpt_amt : i14, (i17 & 262144) != 0 ? duprcdtorequestmodle2.reason : str13, (i17 & 524288) != 0 ? duprcdtorequestmodle2.regn_no : str14, (i17 & 1048576) != 0 ? duprcdtorequestmodle2.state_cd : str15, (i17 & 2097152) != 0 ? duprcdtorequestmodle2.state_header : str16, (i17 & 4194304) != 0 ? duprcdtorequestmodle2.status : str17, (i17 & 8388608) != 0 ? duprcdtorequestmodle2.tax_mode : str18, (i17 & 16777216) != 0 ? duprcdtorequestmodle2.vh_class : i15);
    }

    public final String component1() {
        return this.appl_no;
    }

    public final String component10() {
        return this.msg;
    }

    public final String component11() {
        return this.off_cd;
    }

    public final String component12() {
        return this.op_dt;
    }

    public final String component13() {
        return this.police_station;
    }

    public final String component14() {
        return this.policy_no;
    }

    public final int component15() {
        return this.pur_cd;
    }

    public final String component16() {
        return this.rcp_dt;
    }

    public final String component17() {
        return this.rcpt_NO;
    }

    public final int component18() {
        return this.rcpt_amt;
    }

    public final String component19() {
        return this.reason;
    }

    public final int component2() {
        return this.comp_cd;
    }

    public final String component20() {
        return this.regn_no;
    }

    public final String component21() {
        return this.state_cd;
    }

    public final String component22() {
        return this.state_header;
    }

    public final String component23() {
        return this.status;
    }

    public final String component24() {
        return this.tax_mode;
    }

    public final int component25() {
        return this.vh_class;
    }

    public final DuprcDto component3() {
        return this.duprcDto;
    }

    public final String component4() {
        return this.fir_dt;
    }

    public final String component5() {
        return this.fir_no;
    }

    public final int component6() {
        return this.idv;
    }

    public final String component7() {
        return this.ins_from;
    }

    public final int component8() {
        return this.ins_type;
    }

    public final String component9() {
        return this.ins_upto;
    }

    public final duprcDtoRequestModle copy(String str, int i10, DuprcDto duprcDto2, String str2, String str3, int i11, String str4, int i12, String str5, String str6, String str7, String str8, String str9, String str10, int i13, String str11, String str12, int i14, String str13, String str14, String str15, String str16, String str17, String str18, int i15) {
        String str19 = str;
        l.f(str19, "appl_no");
        l.f(duprcDto2, "duprcDto");
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
        return new duprcDtoRequestModle(str19, i10, duprcDto2, str2, str3, i11, str4, i12, str5, str6, str7, str8, str9, str10, i13, str11, str12, i14, str13, str14, str15, str16, str17, str18, i15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duprcDtoRequestModle)) {
            return false;
        }
        duprcDtoRequestModle duprcdtorequestmodle = (duprcDtoRequestModle) obj;
        return l.a(this.appl_no, duprcdtorequestmodle.appl_no) && this.comp_cd == duprcdtorequestmodle.comp_cd && l.a(this.duprcDto, duprcdtorequestmodle.duprcDto) && l.a(this.fir_dt, duprcdtorequestmodle.fir_dt) && l.a(this.fir_no, duprcdtorequestmodle.fir_no) && this.idv == duprcdtorequestmodle.idv && l.a(this.ins_from, duprcdtorequestmodle.ins_from) && this.ins_type == duprcdtorequestmodle.ins_type && l.a(this.ins_upto, duprcdtorequestmodle.ins_upto) && l.a(this.msg, duprcdtorequestmodle.msg) && l.a(this.off_cd, duprcdtorequestmodle.off_cd) && l.a(this.op_dt, duprcdtorequestmodle.op_dt) && l.a(this.police_station, duprcdtorequestmodle.police_station) && l.a(this.policy_no, duprcdtorequestmodle.policy_no) && this.pur_cd == duprcdtorequestmodle.pur_cd && l.a(this.rcp_dt, duprcdtorequestmodle.rcp_dt) && l.a(this.rcpt_NO, duprcdtorequestmodle.rcpt_NO) && this.rcpt_amt == duprcdtorequestmodle.rcpt_amt && l.a(this.reason, duprcdtorequestmodle.reason) && l.a(this.regn_no, duprcdtorequestmodle.regn_no) && l.a(this.state_cd, duprcdtorequestmodle.state_cd) && l.a(this.state_header, duprcdtorequestmodle.state_header) && l.a(this.status, duprcdtorequestmodle.status) && l.a(this.tax_mode, duprcdtorequestmodle.tax_mode) && this.vh_class == duprcdtorequestmodle.vh_class;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final int getComp_cd() {
        return this.comp_cd;
    }

    public final DuprcDto getDuprcDto() {
        return this.duprcDto;
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
        return (((((((((((((((((((((((((((((((((((((((((((((((this.appl_no.hashCode() * 31) + Integer.hashCode(this.comp_cd)) * 31) + this.duprcDto.hashCode()) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31) + Integer.hashCode(this.idv)) * 31) + this.ins_from.hashCode()) * 31) + Integer.hashCode(this.ins_type)) * 31) + this.ins_upto.hashCode()) * 31) + this.msg.hashCode()) * 31) + this.off_cd.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.rcp_dt.hashCode()) * 31) + this.rcpt_NO.hashCode()) * 31) + Integer.hashCode(this.rcpt_amt)) * 31) + this.reason.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31) + Integer.hashCode(this.vh_class);
    }

    public String toString() {
        return "duprcDtoRequestModle(appl_no=" + this.appl_no + ", comp_cd=" + this.comp_cd + ", duprcDto=" + this.duprcDto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ duprcDtoRequestModle(java.lang.String r29, int r30, com.nic.mparivahan.VahanServices.DRcModle.DuprcDto r31, java.lang.String r32, java.lang.String r33, int r34, java.lang.String r35, int r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, int r43, java.lang.String r44, java.lang.String r45, int r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, int r53, int r54, cm.g r55) {
        /*
            r28 = this;
            r0 = r54
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            r1 = 22
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r30
        L_0x000c:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r8 = r2
            goto L_0x0015
        L_0x0013:
            r8 = r34
        L_0x0015:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x001c
            r1 = 1
            r10 = r1
            goto L_0x001e
        L_0x001c:
            r10 = r36
        L_0x001e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0025
            r17 = r2
            goto L_0x0027
        L_0x0025:
            r17 = r43
        L_0x0027:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x002f
            r20 = r2
            goto L_0x0031
        L_0x002f:
            r20 = r46
        L_0x0031:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "L"
            r26 = r0
            goto L_0x003d
        L_0x003b:
            r26 = r52
        L_0x003d:
            r2 = r28
            r3 = r29
            r5 = r31
            r6 = r32
            r7 = r33
            r9 = r35
            r11 = r37
            r12 = r38
            r13 = r39
            r14 = r40
            r15 = r41
            r16 = r42
            r18 = r44
            r19 = r45
            r21 = r47
            r22 = r48
            r23 = r49
            r24 = r50
            r25 = r51
            r27 = r53
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.DRcModle.duprcDtoRequestModle.<init>(java.lang.String, int, com.nic.mparivahan.VahanServices.DRcModle.DuprcDto, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, cm.g):void");
    }
}
