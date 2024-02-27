package com.nic.mparivahan.VahanServices.VahanPaymentModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class PaymentRequestModle {
    private final String appl_no;
    private final ChanngeOfAdressDto channgeOfAdressDto;
    private final String comp_cd;
    private final String fir_dt;
    private final String fir_no;
    private final String idv;
    private final String ins_from;
    private final String ins_type;
    private final String ins_upto;
    private final String msg;
    private final String off_cd;
    private final String op_dt;
    private final String police_station;
    private final String policy_no;
    private final String pur_cd;
    private final String rcp_dt;
    private final String rcpt_NO;
    private final String rcpt_amt;
    private final String reason;
    private final String regn_no;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final String vh_class;

    public PaymentRequestModle(String str, ChanngeOfAdressDto channgeOfAdressDto2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
        l.f(str, "appl_no");
        l.f(channgeOfAdressDto2, "channgeOfAdressDto");
        this.appl_no = str;
        this.channgeOfAdressDto = channgeOfAdressDto2;
        this.comp_cd = str2;
        this.fir_dt = str3;
        this.fir_no = str4;
        this.idv = str5;
        this.ins_from = str6;
        this.ins_type = str7;
        this.ins_upto = str8;
        this.msg = str9;
        this.off_cd = str10;
        this.op_dt = str11;
        this.police_station = str12;
        this.policy_no = str13;
        this.pur_cd = str14;
        this.rcp_dt = str15;
        this.rcpt_NO = str16;
        this.rcpt_amt = str17;
        this.reason = str18;
        this.regn_no = str19;
        this.state_cd = str20;
        this.state_header = str21;
        this.status = str22;
        this.tax_mode = str23;
        this.vh_class = str24;
    }

    public static /* synthetic */ PaymentRequestModle copy$default(PaymentRequestModle paymentRequestModle, String str, ChanngeOfAdressDto channgeOfAdressDto2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i10, Object obj) {
        PaymentRequestModle paymentRequestModle2 = paymentRequestModle;
        int i11 = i10;
        return paymentRequestModle.copy((i11 & 1) != 0 ? paymentRequestModle2.appl_no : str, (i11 & 2) != 0 ? paymentRequestModle2.channgeOfAdressDto : channgeOfAdressDto2, (i11 & 4) != 0 ? paymentRequestModle2.comp_cd : str2, (i11 & 8) != 0 ? paymentRequestModle2.fir_dt : str3, (i11 & 16) != 0 ? paymentRequestModle2.fir_no : str4, (i11 & 32) != 0 ? paymentRequestModle2.idv : str5, (i11 & 64) != 0 ? paymentRequestModle2.ins_from : str6, (i11 & 128) != 0 ? paymentRequestModle2.ins_type : str7, (i11 & 256) != 0 ? paymentRequestModle2.ins_upto : str8, (i11 & 512) != 0 ? paymentRequestModle2.msg : str9, (i11 & 1024) != 0 ? paymentRequestModle2.off_cd : str10, (i11 & 2048) != 0 ? paymentRequestModle2.op_dt : str11, (i11 & 4096) != 0 ? paymentRequestModle2.police_station : str12, (i11 & 8192) != 0 ? paymentRequestModle2.policy_no : str13, (i11 & 16384) != 0 ? paymentRequestModle2.pur_cd : str14, (i11 & 32768) != 0 ? paymentRequestModle2.rcp_dt : str15, (i11 & 65536) != 0 ? paymentRequestModle2.rcpt_NO : str16, (i11 & 131072) != 0 ? paymentRequestModle2.rcpt_amt : str17, (i11 & 262144) != 0 ? paymentRequestModle2.reason : str18, (i11 & 524288) != 0 ? paymentRequestModle2.regn_no : str19, (i11 & 1048576) != 0 ? paymentRequestModle2.state_cd : str20, (i11 & 2097152) != 0 ? paymentRequestModle2.state_header : str21, (i11 & 4194304) != 0 ? paymentRequestModle2.status : str22, (i11 & 8388608) != 0 ? paymentRequestModle2.tax_mode : str23, (i11 & 16777216) != 0 ? paymentRequestModle2.vh_class : str24);
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

    public final String component15() {
        return this.pur_cd;
    }

    public final String component16() {
        return this.rcp_dt;
    }

    public final String component17() {
        return this.rcpt_NO;
    }

    public final String component18() {
        return this.rcpt_amt;
    }

    public final String component19() {
        return this.reason;
    }

    public final ChanngeOfAdressDto component2() {
        return this.channgeOfAdressDto;
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

    public final String component25() {
        return this.vh_class;
    }

    public final String component3() {
        return this.comp_cd;
    }

    public final String component4() {
        return this.fir_dt;
    }

    public final String component5() {
        return this.fir_no;
    }

    public final String component6() {
        return this.idv;
    }

    public final String component7() {
        return this.ins_from;
    }

    public final String component8() {
        return this.ins_type;
    }

    public final String component9() {
        return this.ins_upto;
    }

    public final PaymentRequestModle copy(String str, ChanngeOfAdressDto channgeOfAdressDto2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
        String str25 = str;
        l.f(str25, "appl_no");
        l.f(channgeOfAdressDto2, "channgeOfAdressDto");
        return new PaymentRequestModle(str25, channgeOfAdressDto2, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentRequestModle)) {
            return false;
        }
        PaymentRequestModle paymentRequestModle = (PaymentRequestModle) obj;
        return l.a(this.appl_no, paymentRequestModle.appl_no) && l.a(this.channgeOfAdressDto, paymentRequestModle.channgeOfAdressDto) && l.a(this.comp_cd, paymentRequestModle.comp_cd) && l.a(this.fir_dt, paymentRequestModle.fir_dt) && l.a(this.fir_no, paymentRequestModle.fir_no) && l.a(this.idv, paymentRequestModle.idv) && l.a(this.ins_from, paymentRequestModle.ins_from) && l.a(this.ins_type, paymentRequestModle.ins_type) && l.a(this.ins_upto, paymentRequestModle.ins_upto) && l.a(this.msg, paymentRequestModle.msg) && l.a(this.off_cd, paymentRequestModle.off_cd) && l.a(this.op_dt, paymentRequestModle.op_dt) && l.a(this.police_station, paymentRequestModle.police_station) && l.a(this.policy_no, paymentRequestModle.policy_no) && l.a(this.pur_cd, paymentRequestModle.pur_cd) && l.a(this.rcp_dt, paymentRequestModle.rcp_dt) && l.a(this.rcpt_NO, paymentRequestModle.rcpt_NO) && l.a(this.rcpt_amt, paymentRequestModle.rcpt_amt) && l.a(this.reason, paymentRequestModle.reason) && l.a(this.regn_no, paymentRequestModle.regn_no) && l.a(this.state_cd, paymentRequestModle.state_cd) && l.a(this.state_header, paymentRequestModle.state_header) && l.a(this.status, paymentRequestModle.status) && l.a(this.tax_mode, paymentRequestModle.tax_mode) && l.a(this.vh_class, paymentRequestModle.vh_class);
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final ChanngeOfAdressDto getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final String getComp_cd() {
        return this.comp_cd;
    }

    public final String getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
        return this.fir_no;
    }

    public final String getIdv() {
        return this.idv;
    }

    public final String getIns_from() {
        return this.ins_from;
    }

    public final String getIns_type() {
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

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final String getRcpt_amt() {
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

    public final String getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        int hashCode = ((this.appl_no.hashCode() * 31) + this.channgeOfAdressDto.hashCode()) * 31;
        String str = this.comp_cd;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fir_dt;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fir_no;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.idv;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ins_from;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ins_type;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ins_upto;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.msg;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.off_cd;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.op_dt;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.police_station;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.policy_no;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.pur_cd;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.rcp_dt;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.rcpt_NO;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.rcpt_amt;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.reason;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.regn_no;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.state_cd;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.state_header;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.status;
        int hashCode22 = (hashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.tax_mode;
        int hashCode23 = (hashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.vh_class;
        if (str23 != null) {
            i10 = str23.hashCode();
        }
        return hashCode23 + i10;
    }

    public String toString() {
        return "PaymentRequestModle(appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", comp_cd=" + this.comp_cd + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PaymentRequestModle(java.lang.String r30, com.nic.mparivahan.VahanServices.VahanPaymentModel.ChanngeOfAdressDto r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, int r55, cm.g r56) {
        /*
            r29 = this;
            r0 = r55
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r32
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r33
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r34
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r35
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r10 = r2
            goto L_0x002b
        L_0x0029:
            r10 = r36
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r11 = r2
            goto L_0x0033
        L_0x0031:
            r11 = r37
        L_0x0033:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0039
            r12 = r2
            goto L_0x003b
        L_0x0039:
            r12 = r38
        L_0x003b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0041
            r13 = r2
            goto L_0x0043
        L_0x0041:
            r13 = r39
        L_0x0043:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0049
            r14 = r2
            goto L_0x004b
        L_0x0049:
            r14 = r40
        L_0x004b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0051
            r15 = r2
            goto L_0x0053
        L_0x0051:
            r15 = r41
        L_0x0053:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x005a
            r16 = r2
            goto L_0x005c
        L_0x005a:
            r16 = r42
        L_0x005c:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0063
            r17 = r2
            goto L_0x0065
        L_0x0063:
            r17 = r43
        L_0x0065:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x006c
            r18 = r2
            goto L_0x006e
        L_0x006c:
            r18 = r44
        L_0x006e:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0077
            r19 = r2
            goto L_0x0079
        L_0x0077:
            r19 = r45
        L_0x0079:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0081
            r20 = r2
            goto L_0x0083
        L_0x0081:
            r20 = r46
        L_0x0083:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008b
            r21 = r2
            goto L_0x008d
        L_0x008b:
            r21 = r47
        L_0x008d:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0095
            r22 = r2
            goto L_0x0097
        L_0x0095:
            r22 = r48
        L_0x0097:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009f
            r23 = r2
            goto L_0x00a1
        L_0x009f:
            r23 = r49
        L_0x00a1:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a9
            r24 = r2
            goto L_0x00ab
        L_0x00a9:
            r24 = r50
        L_0x00ab:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b3
            r25 = r2
            goto L_0x00b5
        L_0x00b3:
            r25 = r51
        L_0x00b5:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00bd
            r26 = r2
            goto L_0x00bf
        L_0x00bd:
            r26 = r52
        L_0x00bf:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c7
            r27 = r2
            goto L_0x00c9
        L_0x00c7:
            r27 = r53
        L_0x00c9:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00d1
            r28 = r2
            goto L_0x00d3
        L_0x00d1:
            r28 = r54
        L_0x00d3:
            r3 = r29
            r4 = r30
            r5 = r31
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanPaymentModel.PaymentRequestModle.<init>(java.lang.String, com.nic.mparivahan.VahanServices.VahanPaymentModel.ChanngeOfAdressDto, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
