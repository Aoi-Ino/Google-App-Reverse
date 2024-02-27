package com.nic.mparivahan.VahanServices.DRcModle;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class dulicateRcResponseModle implements Serializable {
    private final String aadhaartxno;
    private final String appl_no;
    private final Object channgeOfAdressDto;
    private final int comp_cd;
    private final DuprcDto duprcDto;
    private final String fir_dt;
    private final String fir_no;
    private final Object hpaDto;
    private final Object hptDto;
    private final int idv;
    private final String ins_from;
    private final int ins_type;
    private final String ins_upto;
    private final String msg;
    private final Object nocDto;
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

    public dulicateRcResponseModle(String str, Object obj, int i10, DuprcDto duprcDto2, String str2, String str3, Object obj2, Object obj3, int i11, String str4, int i12, String str5, String str6, Object obj4, String str7, String str8, String str9, String str10, int i13, String str11, String str12, int i14, String str13, String str14, String str15, String str16, String str17, String str18, int i15, String str19) {
        this.appl_no = str;
        this.channgeOfAdressDto = obj;
        this.comp_cd = i10;
        this.duprcDto = duprcDto2;
        this.fir_dt = str2;
        this.fir_no = str3;
        this.hpaDto = obj2;
        this.hptDto = obj3;
        this.idv = i11;
        this.ins_from = str4;
        this.ins_type = i12;
        this.ins_upto = str5;
        this.msg = str6;
        this.nocDto = obj4;
        this.off_cd = str7;
        this.op_dt = str8;
        this.police_station = str9;
        this.policy_no = str10;
        this.pur_cd = i13;
        this.rcp_dt = str11;
        this.rcpt_NO = str12;
        this.rcpt_amt = i14;
        this.reason = str13;
        this.regn_no = str14;
        this.state_cd = str15;
        this.state_header = str16;
        this.status = str17;
        this.tax_mode = str18;
        this.vh_class = i15;
        this.aadhaartxno = str19;
    }

    public static /* synthetic */ dulicateRcResponseModle copy$default(dulicateRcResponseModle dulicatercresponsemodle, String str, Object obj, int i10, DuprcDto duprcDto2, String str2, String str3, Object obj2, Object obj3, int i11, String str4, int i12, String str5, String str6, Object obj4, String str7, String str8, String str9, String str10, int i13, String str11, String str12, int i14, String str13, String str14, String str15, String str16, String str17, String str18, int i15, String str19, int i16, Object obj5) {
        dulicateRcResponseModle dulicatercresponsemodle2 = dulicatercresponsemodle;
        int i17 = i16;
        return dulicatercresponsemodle.copy((i17 & 1) != 0 ? dulicatercresponsemodle2.appl_no : str, (i17 & 2) != 0 ? dulicatercresponsemodle2.channgeOfAdressDto : obj, (i17 & 4) != 0 ? dulicatercresponsemodle2.comp_cd : i10, (i17 & 8) != 0 ? dulicatercresponsemodle2.duprcDto : duprcDto2, (i17 & 16) != 0 ? dulicatercresponsemodle2.fir_dt : str2, (i17 & 32) != 0 ? dulicatercresponsemodle2.fir_no : str3, (i17 & 64) != 0 ? dulicatercresponsemodle2.hpaDto : obj2, (i17 & 128) != 0 ? dulicatercresponsemodle2.hptDto : obj3, (i17 & 256) != 0 ? dulicatercresponsemodle2.idv : i11, (i17 & 512) != 0 ? dulicatercresponsemodle2.ins_from : str4, (i17 & 1024) != 0 ? dulicatercresponsemodle2.ins_type : i12, (i17 & 2048) != 0 ? dulicatercresponsemodle2.ins_upto : str5, (i17 & 4096) != 0 ? dulicatercresponsemodle2.msg : str6, (i17 & 8192) != 0 ? dulicatercresponsemodle2.nocDto : obj4, (i17 & 16384) != 0 ? dulicatercresponsemodle2.off_cd : str7, (i17 & 32768) != 0 ? dulicatercresponsemodle2.op_dt : str8, (i17 & 65536) != 0 ? dulicatercresponsemodle2.police_station : str9, (i17 & 131072) != 0 ? dulicatercresponsemodle2.policy_no : str10, (i17 & 262144) != 0 ? dulicatercresponsemodle2.pur_cd : i13, (i17 & 524288) != 0 ? dulicatercresponsemodle2.rcp_dt : str11, (i17 & 1048576) != 0 ? dulicatercresponsemodle2.rcpt_NO : str12, (i17 & 2097152) != 0 ? dulicatercresponsemodle2.rcpt_amt : i14, (i17 & 4194304) != 0 ? dulicatercresponsemodle2.reason : str13, (i17 & 8388608) != 0 ? dulicatercresponsemodle2.regn_no : str14, (i17 & 16777216) != 0 ? dulicatercresponsemodle2.state_cd : str15, (i17 & 33554432) != 0 ? dulicatercresponsemodle2.state_header : str16, (i17 & 67108864) != 0 ? dulicatercresponsemodle2.status : str17, (i17 & 134217728) != 0 ? dulicatercresponsemodle2.tax_mode : str18, (i17 & 268435456) != 0 ? dulicatercresponsemodle2.vh_class : i15, (i17 & 536870912) != 0 ? dulicatercresponsemodle2.aadhaartxno : str19);
    }

    public final String component1() {
        return this.appl_no;
    }

    public final String component10() {
        return this.ins_from;
    }

    public final int component11() {
        return this.ins_type;
    }

    public final String component12() {
        return this.ins_upto;
    }

    public final String component13() {
        return this.msg;
    }

    public final Object component14() {
        return this.nocDto;
    }

    public final String component15() {
        return this.off_cd;
    }

    public final String component16() {
        return this.op_dt;
    }

    public final String component17() {
        return this.police_station;
    }

    public final String component18() {
        return this.policy_no;
    }

    public final int component19() {
        return this.pur_cd;
    }

    public final Object component2() {
        return this.channgeOfAdressDto;
    }

    public final String component20() {
        return this.rcp_dt;
    }

    public final String component21() {
        return this.rcpt_NO;
    }

    public final int component22() {
        return this.rcpt_amt;
    }

    public final String component23() {
        return this.reason;
    }

    public final String component24() {
        return this.regn_no;
    }

    public final String component25() {
        return this.state_cd;
    }

    public final String component26() {
        return this.state_header;
    }

    public final String component27() {
        return this.status;
    }

    public final String component28() {
        return this.tax_mode;
    }

    public final int component29() {
        return this.vh_class;
    }

    public final int component3() {
        return this.comp_cd;
    }

    public final String component30() {
        return this.aadhaartxno;
    }

    public final DuprcDto component4() {
        return this.duprcDto;
    }

    public final String component5() {
        return this.fir_dt;
    }

    public final String component6() {
        return this.fir_no;
    }

    public final Object component7() {
        return this.hpaDto;
    }

    public final Object component8() {
        return this.hptDto;
    }

    public final int component9() {
        return this.idv;
    }

    public final dulicateRcResponseModle copy(String str, Object obj, int i10, DuprcDto duprcDto2, String str2, String str3, Object obj2, Object obj3, int i11, String str4, int i12, String str5, String str6, Object obj4, String str7, String str8, String str9, String str10, int i13, String str11, String str12, int i14, String str13, String str14, String str15, String str16, String str17, String str18, int i15, String str19) {
        return new dulicateRcResponseModle(str, obj, i10, duprcDto2, str2, str3, obj2, obj3, i11, str4, i12, str5, str6, obj4, str7, str8, str9, str10, i13, str11, str12, i14, str13, str14, str15, str16, str17, str18, i15, str19);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dulicateRcResponseModle)) {
            return false;
        }
        dulicateRcResponseModle dulicatercresponsemodle = (dulicateRcResponseModle) obj;
        return l.a(this.appl_no, dulicatercresponsemodle.appl_no) && l.a(this.channgeOfAdressDto, dulicatercresponsemodle.channgeOfAdressDto) && this.comp_cd == dulicatercresponsemodle.comp_cd && l.a(this.duprcDto, dulicatercresponsemodle.duprcDto) && l.a(this.fir_dt, dulicatercresponsemodle.fir_dt) && l.a(this.fir_no, dulicatercresponsemodle.fir_no) && l.a(this.hpaDto, dulicatercresponsemodle.hpaDto) && l.a(this.hptDto, dulicatercresponsemodle.hptDto) && this.idv == dulicatercresponsemodle.idv && l.a(this.ins_from, dulicatercresponsemodle.ins_from) && this.ins_type == dulicatercresponsemodle.ins_type && l.a(this.ins_upto, dulicatercresponsemodle.ins_upto) && l.a(this.msg, dulicatercresponsemodle.msg) && l.a(this.nocDto, dulicatercresponsemodle.nocDto) && l.a(this.off_cd, dulicatercresponsemodle.off_cd) && l.a(this.op_dt, dulicatercresponsemodle.op_dt) && l.a(this.police_station, dulicatercresponsemodle.police_station) && l.a(this.policy_no, dulicatercresponsemodle.policy_no) && this.pur_cd == dulicatercresponsemodle.pur_cd && l.a(this.rcp_dt, dulicatercresponsemodle.rcp_dt) && l.a(this.rcpt_NO, dulicatercresponsemodle.rcpt_NO) && this.rcpt_amt == dulicatercresponsemodle.rcpt_amt && l.a(this.reason, dulicatercresponsemodle.reason) && l.a(this.regn_no, dulicatercresponsemodle.regn_no) && l.a(this.state_cd, dulicatercresponsemodle.state_cd) && l.a(this.state_header, dulicatercresponsemodle.state_header) && l.a(this.status, dulicatercresponsemodle.status) && l.a(this.tax_mode, dulicatercresponsemodle.tax_mode) && this.vh_class == dulicatercresponsemodle.vh_class && l.a(this.aadhaartxno, dulicatercresponsemodle.aadhaartxno);
    }

    public final String getAadhaartxno() {
        return this.aadhaartxno;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final Object getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
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

    public final Object getHpaDto() {
        return this.hpaDto;
    }

    public final Object getHptDto() {
        return this.hptDto;
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

    public final Object getNocDto() {
        return this.nocDto;
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
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.channgeOfAdressDto;
        int hashCode2 = (((hashCode + (obj == null ? 0 : obj.hashCode())) * 31) + Integer.hashCode(this.comp_cd)) * 31;
        DuprcDto duprcDto2 = this.duprcDto;
        int hashCode3 = (hashCode2 + (duprcDto2 == null ? 0 : duprcDto2.hashCode())) * 31;
        String str2 = this.fir_dt;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fir_no;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj2 = this.hpaDto;
        int hashCode6 = (hashCode5 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.hptDto;
        int hashCode7 = (((hashCode6 + (obj3 == null ? 0 : obj3.hashCode())) * 31) + Integer.hashCode(this.idv)) * 31;
        String str4 = this.ins_from;
        int hashCode8 = (((hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.ins_type)) * 31;
        String str5 = this.ins_upto;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.msg;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj4 = this.nocDto;
        int hashCode11 = (hashCode10 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str7 = this.off_cd;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.op_dt;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.police_station;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.policy_no;
        int hashCode15 = (((hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31) + Integer.hashCode(this.pur_cd)) * 31;
        String str11 = this.rcp_dt;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.rcpt_NO;
        int hashCode17 = (((hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31) + Integer.hashCode(this.rcpt_amt)) * 31;
        String str13 = this.reason;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.regn_no;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.state_cd;
        int hashCode20 = (hashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.state_header;
        int hashCode21 = (hashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.status;
        int hashCode22 = (hashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.tax_mode;
        int hashCode23 = (((hashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31) + Integer.hashCode(this.vh_class)) * 31;
        String str19 = this.aadhaartxno;
        if (str19 != null) {
            i10 = str19.hashCode();
        }
        return hashCode23 + i10;
    }

    public String toString() {
        return "dulicateRcResponseModle(appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", comp_cd=" + this.comp_cd + ", duprcDto=" + this.duprcDto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", nocDto=" + this.nocDto + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ", aadhaartxno=" + this.aadhaartxno + ')';
    }
}
