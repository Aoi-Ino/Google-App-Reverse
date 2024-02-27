package com.nic.mparivahan.VahanServices.HTPModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class HPTRequestParamModle {
    private final String appl_no;
    private final String fncr_add1;
    private final String fncr_add2;
    private final String fncr_add3;
    private final String fncr_district;
    private final String fncr_district_descr;
    private final String fncr_name;
    private final String fncr_pincode;
    private final String fncr_state;
    private final String fncr_state_name;
    private final String fncr_taluk;
    private final String fncr_taluk_descr;
    private final String fncr_village;
    private final String fncr_village_descr;
    private final String from_dt;
    private final String from_dt_descr;
    private final String hp_type;
    private final String hp_type_descr;
    private final String off_cd;
    private final String op_dt;
    private final String pur_cd;
    private final String regn_no;
    private final String sr_no;
    private final String state_cd;
    private final String term_dt;
    private final String term_dt_descr;
    private final String upto_dt;
    private final String upto_dt_descr;

    public HPTRequestParamModle(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        String str29 = str22;
        l.f(str29, "regn_no");
        this.appl_no = str;
        this.fncr_add1 = str2;
        this.fncr_add2 = str3;
        this.fncr_add3 = str4;
        this.fncr_district = str5;
        this.fncr_district_descr = str6;
        this.fncr_name = str7;
        this.fncr_pincode = str8;
        this.fncr_state = str9;
        this.fncr_state_name = str10;
        this.fncr_taluk = str11;
        this.fncr_taluk_descr = str12;
        this.fncr_village = str13;
        this.fncr_village_descr = str14;
        this.from_dt = str15;
        this.from_dt_descr = str16;
        this.hp_type = str17;
        this.hp_type_descr = str18;
        this.off_cd = str19;
        this.op_dt = str20;
        this.pur_cd = str21;
        this.regn_no = str29;
        this.sr_no = str23;
        this.state_cd = str24;
        this.term_dt = str25;
        this.term_dt_descr = str26;
        this.upto_dt = str27;
        this.upto_dt_descr = str28;
    }

    public static /* synthetic */ HPTRequestParamModle copy$default(HPTRequestParamModle hPTRequestParamModle, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, int i10, Object obj) {
        HPTRequestParamModle hPTRequestParamModle2 = hPTRequestParamModle;
        int i11 = i10;
        return hPTRequestParamModle.copy((i11 & 1) != 0 ? hPTRequestParamModle2.appl_no : str, (i11 & 2) != 0 ? hPTRequestParamModle2.fncr_add1 : str2, (i11 & 4) != 0 ? hPTRequestParamModle2.fncr_add2 : str3, (i11 & 8) != 0 ? hPTRequestParamModle2.fncr_add3 : str4, (i11 & 16) != 0 ? hPTRequestParamModle2.fncr_district : str5, (i11 & 32) != 0 ? hPTRequestParamModle2.fncr_district_descr : str6, (i11 & 64) != 0 ? hPTRequestParamModle2.fncr_name : str7, (i11 & 128) != 0 ? hPTRequestParamModle2.fncr_pincode : str8, (i11 & 256) != 0 ? hPTRequestParamModle2.fncr_state : str9, (i11 & 512) != 0 ? hPTRequestParamModle2.fncr_state_name : str10, (i11 & 1024) != 0 ? hPTRequestParamModle2.fncr_taluk : str11, (i11 & 2048) != 0 ? hPTRequestParamModle2.fncr_taluk_descr : str12, (i11 & 4096) != 0 ? hPTRequestParamModle2.fncr_village : str13, (i11 & 8192) != 0 ? hPTRequestParamModle2.fncr_village_descr : str14, (i11 & 16384) != 0 ? hPTRequestParamModle2.from_dt : str15, (i11 & 32768) != 0 ? hPTRequestParamModle2.from_dt_descr : str16, (i11 & 65536) != 0 ? hPTRequestParamModle2.hp_type : str17, (i11 & 131072) != 0 ? hPTRequestParamModle2.hp_type_descr : str18, (i11 & 262144) != 0 ? hPTRequestParamModle2.off_cd : str19, (i11 & 524288) != 0 ? hPTRequestParamModle2.op_dt : str20, (i11 & 1048576) != 0 ? hPTRequestParamModle2.pur_cd : str21, (i11 & 2097152) != 0 ? hPTRequestParamModle2.regn_no : str22, (i11 & 4194304) != 0 ? hPTRequestParamModle2.sr_no : str23, (i11 & 8388608) != 0 ? hPTRequestParamModle2.state_cd : str24, (i11 & 16777216) != 0 ? hPTRequestParamModle2.term_dt : str25, (i11 & 33554432) != 0 ? hPTRequestParamModle2.term_dt_descr : str26, (i11 & 67108864) != 0 ? hPTRequestParamModle2.upto_dt : str27, (i11 & 134217728) != 0 ? hPTRequestParamModle2.upto_dt_descr : str28);
    }

    public final String component1() {
        return this.appl_no;
    }

    public final String component10() {
        return this.fncr_state_name;
    }

    public final String component11() {
        return this.fncr_taluk;
    }

    public final String component12() {
        return this.fncr_taluk_descr;
    }

    public final String component13() {
        return this.fncr_village;
    }

    public final String component14() {
        return this.fncr_village_descr;
    }

    public final String component15() {
        return this.from_dt;
    }

    public final String component16() {
        return this.from_dt_descr;
    }

    public final String component17() {
        return this.hp_type;
    }

    public final String component18() {
        return this.hp_type_descr;
    }

    public final String component19() {
        return this.off_cd;
    }

    public final String component2() {
        return this.fncr_add1;
    }

    public final String component20() {
        return this.op_dt;
    }

    public final String component21() {
        return this.pur_cd;
    }

    public final String component22() {
        return this.regn_no;
    }

    public final String component23() {
        return this.sr_no;
    }

    public final String component24() {
        return this.state_cd;
    }

    public final String component25() {
        return this.term_dt;
    }

    public final String component26() {
        return this.term_dt_descr;
    }

    public final String component27() {
        return this.upto_dt;
    }

    public final String component28() {
        return this.upto_dt_descr;
    }

    public final String component3() {
        return this.fncr_add2;
    }

    public final String component4() {
        return this.fncr_add3;
    }

    public final String component5() {
        return this.fncr_district;
    }

    public final String component6() {
        return this.fncr_district_descr;
    }

    public final String component7() {
        return this.fncr_name;
    }

    public final String component8() {
        return this.fncr_pincode;
    }

    public final String component9() {
        return this.fncr_state;
    }

    public final HPTRequestParamModle copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        String str29 = str;
        l.f(str22, "regn_no");
        return new HPTRequestParamModle(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HPTRequestParamModle)) {
            return false;
        }
        HPTRequestParamModle hPTRequestParamModle = (HPTRequestParamModle) obj;
        return l.a(this.appl_no, hPTRequestParamModle.appl_no) && l.a(this.fncr_add1, hPTRequestParamModle.fncr_add1) && l.a(this.fncr_add2, hPTRequestParamModle.fncr_add2) && l.a(this.fncr_add3, hPTRequestParamModle.fncr_add3) && l.a(this.fncr_district, hPTRequestParamModle.fncr_district) && l.a(this.fncr_district_descr, hPTRequestParamModle.fncr_district_descr) && l.a(this.fncr_name, hPTRequestParamModle.fncr_name) && l.a(this.fncr_pincode, hPTRequestParamModle.fncr_pincode) && l.a(this.fncr_state, hPTRequestParamModle.fncr_state) && l.a(this.fncr_state_name, hPTRequestParamModle.fncr_state_name) && l.a(this.fncr_taluk, hPTRequestParamModle.fncr_taluk) && l.a(this.fncr_taluk_descr, hPTRequestParamModle.fncr_taluk_descr) && l.a(this.fncr_village, hPTRequestParamModle.fncr_village) && l.a(this.fncr_village_descr, hPTRequestParamModle.fncr_village_descr) && l.a(this.from_dt, hPTRequestParamModle.from_dt) && l.a(this.from_dt_descr, hPTRequestParamModle.from_dt_descr) && l.a(this.hp_type, hPTRequestParamModle.hp_type) && l.a(this.hp_type_descr, hPTRequestParamModle.hp_type_descr) && l.a(this.off_cd, hPTRequestParamModle.off_cd) && l.a(this.op_dt, hPTRequestParamModle.op_dt) && l.a(this.pur_cd, hPTRequestParamModle.pur_cd) && l.a(this.regn_no, hPTRequestParamModle.regn_no) && l.a(this.sr_no, hPTRequestParamModle.sr_no) && l.a(this.state_cd, hPTRequestParamModle.state_cd) && l.a(this.term_dt, hPTRequestParamModle.term_dt) && l.a(this.term_dt_descr, hPTRequestParamModle.term_dt_descr) && l.a(this.upto_dt, hPTRequestParamModle.upto_dt) && l.a(this.upto_dt_descr, hPTRequestParamModle.upto_dt_descr);
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final String getFncr_add1() {
        return this.fncr_add1;
    }

    public final String getFncr_add2() {
        return this.fncr_add2;
    }

    public final String getFncr_add3() {
        return this.fncr_add3;
    }

    public final String getFncr_district() {
        return this.fncr_district;
    }

    public final String getFncr_district_descr() {
        return this.fncr_district_descr;
    }

    public final String getFncr_name() {
        return this.fncr_name;
    }

    public final String getFncr_pincode() {
        return this.fncr_pincode;
    }

    public final String getFncr_state() {
        return this.fncr_state;
    }

    public final String getFncr_state_name() {
        return this.fncr_state_name;
    }

    public final String getFncr_taluk() {
        return this.fncr_taluk;
    }

    public final String getFncr_taluk_descr() {
        return this.fncr_taluk_descr;
    }

    public final String getFncr_village() {
        return this.fncr_village;
    }

    public final String getFncr_village_descr() {
        return this.fncr_village_descr;
    }

    public final String getFrom_dt() {
        return this.from_dt;
    }

    public final String getFrom_dt_descr() {
        return this.from_dt_descr;
    }

    public final String getHp_type() {
        return this.hp_type;
    }

    public final String getHp_type_descr() {
        return this.hp_type_descr;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getSr_no() {
        return this.sr_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getTerm_dt() {
        return this.term_dt;
    }

    public final String getTerm_dt_descr() {
        return this.term_dt_descr;
    }

    public final String getUpto_dt() {
        return this.upto_dt;
    }

    public final String getUpto_dt_descr() {
        return this.upto_dt_descr;
    }

    public int hashCode() {
        String str = this.appl_no;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fncr_add1;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fncr_add2;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fncr_add3;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fncr_district;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fncr_district_descr;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fncr_name;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fncr_pincode;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fncr_state;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.fncr_state_name;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.fncr_taluk;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.fncr_taluk_descr;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.fncr_village;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.fncr_village_descr;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.from_dt;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.from_dt_descr;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.hp_type;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.hp_type_descr;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.off_cd;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.op_dt;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.pur_cd;
        int hashCode21 = (((hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31) + this.regn_no.hashCode()) * 31;
        String str22 = this.sr_no;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.state_cd;
        int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.term_dt;
        int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.term_dt_descr;
        int hashCode25 = (hashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.upto_dt;
        int hashCode26 = (hashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.upto_dt_descr;
        if (str27 != null) {
            i10 = str27.hashCode();
        }
        return hashCode26 + i10;
    }

    public String toString() {
        return "HPTRequestParamModle(appl_no=" + this.appl_no + ", fncr_add1=" + this.fncr_add1 + ", fncr_add2=" + this.fncr_add2 + ", fncr_add3=" + this.fncr_add3 + ", fncr_district=" + this.fncr_district + ", fncr_district_descr=" + this.fncr_district_descr + ", fncr_name=" + this.fncr_name + ", fncr_pincode=" + this.fncr_pincode + ", fncr_state=" + this.fncr_state + ", fncr_state_name=" + this.fncr_state_name + ", fncr_taluk=" + this.fncr_taluk + ", fncr_taluk_descr=" + this.fncr_taluk_descr + ", fncr_village=" + this.fncr_village + ", fncr_village_descr=" + this.fncr_village_descr + ", from_dt=" + this.from_dt + ", from_dt_descr=" + this.from_dt_descr + ", hp_type=" + this.hp_type + ", hp_type_descr=" + this.hp_type_descr + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", pur_cd=" + this.pur_cd + ", regn_no=" + this.regn_no + ", sr_no=" + this.sr_no + ", state_cd=" + this.state_cd + ", term_dt=" + this.term_dt + ", term_dt_descr=" + this.term_dt_descr + ", upto_dt=" + this.upto_dt + ", upto_dt_descr=" + this.upto_dt_descr + ')';
    }
}
