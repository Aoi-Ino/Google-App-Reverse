package com.nic.mparivahan.VahanServices.VahanPaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class HptDto implements Serializable {
    private final String appl_no;
    private final String fncr_add2;
    private final String fncr_add3;
    private final int fncr_district;
    private final String fncr_district_descr;
    private final String fncr_name;
    private final int fncr_pincode;
    private final String fncr_state;
    private final String fncr_state_name;
    private final int fncr_taluk;
    private final String fncr_taluk_descr;
    private final int fncr_village;
    private final String fncr_village_descr;
    private final String from_dt;
    private final String from_dt_descr;
    private final String hp_type;
    private final String hp_type_descr;
    private final int off_cd;
    private final String op_dt;
    private final int pur_cd;
    private final String regn_no;
    private final int sr_no;
    private final String state_cd;
    private final String term_dt;
    private final String term_dt_descr;
    private final String upto_dt;
    private final String upto_dt_descr;

    public HptDto(String str, String str2, String str3, int i10, String str4, String str5, int i11, String str6, String str7, int i12, String str8, int i13, String str9, String str10, String str11, String str12, String str13, int i14, String str14, int i15, String str15, int i16, String str16, String str17, String str18, String str19, String str20) {
        String str21 = str;
        String str22 = str2;
        String str23 = str3;
        String str24 = str4;
        String str25 = str5;
        String str26 = str6;
        String str27 = str7;
        String str28 = str8;
        String str29 = str9;
        String str30 = str10;
        String str31 = str11;
        String str32 = str12;
        String str33 = str13;
        String str34 = str14;
        String str35 = str16;
        l.f(str21, "appl_no");
        l.f(str22, "fncr_add2");
        l.f(str23, "fncr_add3");
        l.f(str24, "fncr_district_descr");
        l.f(str25, "fncr_name");
        l.f(str26, "fncr_state");
        l.f(str27, "fncr_state_name");
        l.f(str28, "fncr_taluk_descr");
        l.f(str29, "fncr_village_descr");
        l.f(str30, "from_dt");
        l.f(str31, "from_dt_descr");
        l.f(str32, "hp_type");
        l.f(str33, "hp_type_descr");
        l.f(str34, "op_dt");
        l.f(str15, "regn_no");
        l.f(str16, "state_cd");
        l.f(str17, "term_dt");
        l.f(str18, "term_dt_descr");
        l.f(str19, "upto_dt");
        l.f(str20, "upto_dt_descr");
        this.appl_no = str21;
        this.fncr_add2 = str22;
        this.fncr_add3 = str23;
        this.fncr_district = i10;
        this.fncr_district_descr = str24;
        this.fncr_name = str25;
        this.fncr_pincode = i11;
        this.fncr_state = str26;
        this.fncr_state_name = str27;
        this.fncr_taluk = i12;
        this.fncr_taluk_descr = str28;
        this.fncr_village = i13;
        this.fncr_village_descr = str29;
        this.from_dt = str30;
        this.from_dt_descr = str31;
        this.hp_type = str32;
        this.hp_type_descr = str33;
        this.off_cd = i14;
        this.op_dt = str34;
        this.pur_cd = i15;
        this.regn_no = str15;
        this.sr_no = i16;
        this.state_cd = str16;
        this.term_dt = str17;
        this.term_dt_descr = str18;
        this.upto_dt = str19;
        this.upto_dt_descr = str20;
    }

    public static /* synthetic */ HptDto copy$default(HptDto hptDto, String str, String str2, String str3, int i10, String str4, String str5, int i11, String str6, String str7, int i12, String str8, int i13, String str9, String str10, String str11, String str12, String str13, int i14, String str14, int i15, String str15, int i16, String str16, String str17, String str18, String str19, String str20, int i17, Object obj) {
        HptDto hptDto2 = hptDto;
        int i18 = i17;
        return hptDto.copy((i18 & 1) != 0 ? hptDto2.appl_no : str, (i18 & 2) != 0 ? hptDto2.fncr_add2 : str2, (i18 & 4) != 0 ? hptDto2.fncr_add3 : str3, (i18 & 8) != 0 ? hptDto2.fncr_district : i10, (i18 & 16) != 0 ? hptDto2.fncr_district_descr : str4, (i18 & 32) != 0 ? hptDto2.fncr_name : str5, (i18 & 64) != 0 ? hptDto2.fncr_pincode : i11, (i18 & 128) != 0 ? hptDto2.fncr_state : str6, (i18 & 256) != 0 ? hptDto2.fncr_state_name : str7, (i18 & 512) != 0 ? hptDto2.fncr_taluk : i12, (i18 & 1024) != 0 ? hptDto2.fncr_taluk_descr : str8, (i18 & 2048) != 0 ? hptDto2.fncr_village : i13, (i18 & 4096) != 0 ? hptDto2.fncr_village_descr : str9, (i18 & 8192) != 0 ? hptDto2.from_dt : str10, (i18 & 16384) != 0 ? hptDto2.from_dt_descr : str11, (i18 & 32768) != 0 ? hptDto2.hp_type : str12, (i18 & 65536) != 0 ? hptDto2.hp_type_descr : str13, (i18 & 131072) != 0 ? hptDto2.off_cd : i14, (i18 & 262144) != 0 ? hptDto2.op_dt : str14, (i18 & 524288) != 0 ? hptDto2.pur_cd : i15, (i18 & 1048576) != 0 ? hptDto2.regn_no : str15, (i18 & 2097152) != 0 ? hptDto2.sr_no : i16, (i18 & 4194304) != 0 ? hptDto2.state_cd : str16, (i18 & 8388608) != 0 ? hptDto2.term_dt : str17, (i18 & 16777216) != 0 ? hptDto2.term_dt_descr : str18, (i18 & 33554432) != 0 ? hptDto2.upto_dt : str19, (i18 & 67108864) != 0 ? hptDto2.upto_dt_descr : str20);
    }

    public final String component1() {
        return this.appl_no;
    }

    public final int component10() {
        return this.fncr_taluk;
    }

    public final String component11() {
        return this.fncr_taluk_descr;
    }

    public final int component12() {
        return this.fncr_village;
    }

    public final String component13() {
        return this.fncr_village_descr;
    }

    public final String component14() {
        return this.from_dt;
    }

    public final String component15() {
        return this.from_dt_descr;
    }

    public final String component16() {
        return this.hp_type;
    }

    public final String component17() {
        return this.hp_type_descr;
    }

    public final int component18() {
        return this.off_cd;
    }

    public final String component19() {
        return this.op_dt;
    }

    public final String component2() {
        return this.fncr_add2;
    }

    public final int component20() {
        return this.pur_cd;
    }

    public final String component21() {
        return this.regn_no;
    }

    public final int component22() {
        return this.sr_no;
    }

    public final String component23() {
        return this.state_cd;
    }

    public final String component24() {
        return this.term_dt;
    }

    public final String component25() {
        return this.term_dt_descr;
    }

    public final String component26() {
        return this.upto_dt;
    }

    public final String component27() {
        return this.upto_dt_descr;
    }

    public final String component3() {
        return this.fncr_add3;
    }

    public final int component4() {
        return this.fncr_district;
    }

    public final String component5() {
        return this.fncr_district_descr;
    }

    public final String component6() {
        return this.fncr_name;
    }

    public final int component7() {
        return this.fncr_pincode;
    }

    public final String component8() {
        return this.fncr_state;
    }

    public final String component9() {
        return this.fncr_state_name;
    }

    public final HptDto copy(String str, String str2, String str3, int i10, String str4, String str5, int i11, String str6, String str7, int i12, String str8, int i13, String str9, String str10, String str11, String str12, String str13, int i14, String str14, int i15, String str15, int i16, String str16, String str17, String str18, String str19, String str20) {
        String str21 = str;
        l.f(str21, "appl_no");
        l.f(str2, "fncr_add2");
        l.f(str3, "fncr_add3");
        l.f(str4, "fncr_district_descr");
        l.f(str5, "fncr_name");
        l.f(str6, "fncr_state");
        l.f(str7, "fncr_state_name");
        l.f(str8, "fncr_taluk_descr");
        l.f(str9, "fncr_village_descr");
        l.f(str10, "from_dt");
        l.f(str11, "from_dt_descr");
        l.f(str12, "hp_type");
        l.f(str13, "hp_type_descr");
        l.f(str14, "op_dt");
        l.f(str15, "regn_no");
        l.f(str16, "state_cd");
        l.f(str17, "term_dt");
        l.f(str18, "term_dt_descr");
        l.f(str19, "upto_dt");
        l.f(str20, "upto_dt_descr");
        return new HptDto(str21, str2, str3, i10, str4, str5, i11, str6, str7, i12, str8, i13, str9, str10, str11, str12, str13, i14, str14, i15, str15, i16, str16, str17, str18, str19, str20);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HptDto)) {
            return false;
        }
        HptDto hptDto = (HptDto) obj;
        return l.a(this.appl_no, hptDto.appl_no) && l.a(this.fncr_add2, hptDto.fncr_add2) && l.a(this.fncr_add3, hptDto.fncr_add3) && this.fncr_district == hptDto.fncr_district && l.a(this.fncr_district_descr, hptDto.fncr_district_descr) && l.a(this.fncr_name, hptDto.fncr_name) && this.fncr_pincode == hptDto.fncr_pincode && l.a(this.fncr_state, hptDto.fncr_state) && l.a(this.fncr_state_name, hptDto.fncr_state_name) && this.fncr_taluk == hptDto.fncr_taluk && l.a(this.fncr_taluk_descr, hptDto.fncr_taluk_descr) && this.fncr_village == hptDto.fncr_village && l.a(this.fncr_village_descr, hptDto.fncr_village_descr) && l.a(this.from_dt, hptDto.from_dt) && l.a(this.from_dt_descr, hptDto.from_dt_descr) && l.a(this.hp_type, hptDto.hp_type) && l.a(this.hp_type_descr, hptDto.hp_type_descr) && this.off_cd == hptDto.off_cd && l.a(this.op_dt, hptDto.op_dt) && this.pur_cd == hptDto.pur_cd && l.a(this.regn_no, hptDto.regn_no) && this.sr_no == hptDto.sr_no && l.a(this.state_cd, hptDto.state_cd) && l.a(this.term_dt, hptDto.term_dt) && l.a(this.term_dt_descr, hptDto.term_dt_descr) && l.a(this.upto_dt, hptDto.upto_dt) && l.a(this.upto_dt_descr, hptDto.upto_dt_descr);
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final String getFncr_add2() {
        return this.fncr_add2;
    }

    public final String getFncr_add3() {
        return this.fncr_add3;
    }

    public final int getFncr_district() {
        return this.fncr_district;
    }

    public final String getFncr_district_descr() {
        return this.fncr_district_descr;
    }

    public final String getFncr_name() {
        return this.fncr_name;
    }

    public final int getFncr_pincode() {
        return this.fncr_pincode;
    }

    public final String getFncr_state() {
        return this.fncr_state;
    }

    public final String getFncr_state_name() {
        return this.fncr_state_name;
    }

    public final int getFncr_taluk() {
        return this.fncr_taluk;
    }

    public final String getFncr_taluk_descr() {
        return this.fncr_taluk_descr;
    }

    public final int getFncr_village() {
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

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final int getSr_no() {
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((this.appl_no.hashCode() * 31) + this.fncr_add2.hashCode()) * 31) + this.fncr_add3.hashCode()) * 31) + Integer.hashCode(this.fncr_district)) * 31) + this.fncr_district_descr.hashCode()) * 31) + this.fncr_name.hashCode()) * 31) + Integer.hashCode(this.fncr_pincode)) * 31) + this.fncr_state.hashCode()) * 31) + this.fncr_state_name.hashCode()) * 31) + Integer.hashCode(this.fncr_taluk)) * 31) + this.fncr_taluk_descr.hashCode()) * 31) + Integer.hashCode(this.fncr_village)) * 31) + this.fncr_village_descr.hashCode()) * 31) + this.from_dt.hashCode()) * 31) + this.from_dt_descr.hashCode()) * 31) + this.hp_type.hashCode()) * 31) + this.hp_type_descr.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.regn_no.hashCode()) * 31) + Integer.hashCode(this.sr_no)) * 31) + this.state_cd.hashCode()) * 31) + this.term_dt.hashCode()) * 31) + this.term_dt_descr.hashCode()) * 31) + this.upto_dt.hashCode()) * 31) + this.upto_dt_descr.hashCode();
    }

    public String toString() {
        return "HptDto(appl_no=" + this.appl_no + ", fncr_add2=" + this.fncr_add2 + ", fncr_add3=" + this.fncr_add3 + ", fncr_district=" + this.fncr_district + ", fncr_district_descr=" + this.fncr_district_descr + ", fncr_name=" + this.fncr_name + ", fncr_pincode=" + this.fncr_pincode + ", fncr_state=" + this.fncr_state + ", fncr_state_name=" + this.fncr_state_name + ", fncr_taluk=" + this.fncr_taluk + ", fncr_taluk_descr=" + this.fncr_taluk_descr + ", fncr_village=" + this.fncr_village + ", fncr_village_descr=" + this.fncr_village_descr + ", from_dt=" + this.from_dt + ", from_dt_descr=" + this.from_dt_descr + ", hp_type=" + this.hp_type + ", hp_type_descr=" + this.hp_type_descr + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", pur_cd=" + this.pur_cd + ", regn_no=" + this.regn_no + ", sr_no=" + this.sr_no + ", state_cd=" + this.state_cd + ", term_dt=" + this.term_dt + ", term_dt_descr=" + this.term_dt_descr + ", upto_dt=" + this.upto_dt + ", upto_dt_descr=" + this.upto_dt_descr + ')';
    }
}
