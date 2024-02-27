package com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class HptDto implements Serializable {
    private final String appl_no;
    private final String fncr_add1;
    private final String fncr_add2;
    private final String fncr_add3;
    private final int fncr_district;
    private final String fncr_district_descr;
    private final String fncr_name;
    private final Integer fncr_pincode;
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

    public HptDto(String str, String str2, String str3, String str4, int i10, String str5, String str6, Integer num, String str7, String str8, int i11, String str9, int i12, String str10, String str11, String str12, String str13, String str14, int i13, String str15, int i14, String str16, int i15, String str17, String str18, String str19, String str20, String str21) {
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
        String str35 = str15;
        String str36 = str17;
        l.f(str22, "fncr_add1");
        l.f(str23, "fncr_add2");
        l.f(str24, "fncr_add3");
        l.f(str25, "fncr_district_descr");
        l.f(str26, "fncr_name");
        l.f(str27, "fncr_state");
        l.f(str28, "fncr_state_name");
        l.f(str29, "fncr_taluk_descr");
        l.f(str30, "fncr_village_descr");
        l.f(str31, "from_dt");
        l.f(str32, "from_dt_descr");
        l.f(str33, "hp_type");
        l.f(str34, "hp_type_descr");
        l.f(str35, "op_dt");
        l.f(str16, "regn_no");
        l.f(str17, "state_cd");
        l.f(str18, "term_dt");
        l.f(str19, "term_dt_descr");
        l.f(str20, "upto_dt");
        l.f(str21, "upto_dt_descr");
        this.appl_no = str;
        this.fncr_add1 = str22;
        this.fncr_add2 = str23;
        this.fncr_add3 = str24;
        this.fncr_district = i10;
        this.fncr_district_descr = str25;
        this.fncr_name = str26;
        this.fncr_pincode = num;
        this.fncr_state = str27;
        this.fncr_state_name = str28;
        this.fncr_taluk = i11;
        this.fncr_taluk_descr = str29;
        this.fncr_village = i12;
        this.fncr_village_descr = str30;
        this.from_dt = str31;
        this.from_dt_descr = str32;
        this.hp_type = str33;
        this.hp_type_descr = str34;
        this.off_cd = i13;
        this.op_dt = str35;
        this.pur_cd = i14;
        this.regn_no = str16;
        this.sr_no = i15;
        this.state_cd = str17;
        this.term_dt = str18;
        this.term_dt_descr = str19;
        this.upto_dt = str20;
        this.upto_dt_descr = str21;
    }

    public static /* synthetic */ HptDto copy$default(HptDto hptDto, String str, String str2, String str3, String str4, int i10, String str5, String str6, Integer num, String str7, String str8, int i11, String str9, int i12, String str10, String str11, String str12, String str13, String str14, int i13, String str15, int i14, String str16, int i15, String str17, String str18, String str19, String str20, String str21, int i16, Object obj) {
        HptDto hptDto2 = hptDto;
        int i17 = i16;
        return hptDto.copy((i17 & 1) != 0 ? hptDto2.appl_no : str, (i17 & 2) != 0 ? hptDto2.fncr_add1 : str2, (i17 & 4) != 0 ? hptDto2.fncr_add2 : str3, (i17 & 8) != 0 ? hptDto2.fncr_add3 : str4, (i17 & 16) != 0 ? hptDto2.fncr_district : i10, (i17 & 32) != 0 ? hptDto2.fncr_district_descr : str5, (i17 & 64) != 0 ? hptDto2.fncr_name : str6, (i17 & 128) != 0 ? hptDto2.fncr_pincode : num, (i17 & 256) != 0 ? hptDto2.fncr_state : str7, (i17 & 512) != 0 ? hptDto2.fncr_state_name : str8, (i17 & 1024) != 0 ? hptDto2.fncr_taluk : i11, (i17 & 2048) != 0 ? hptDto2.fncr_taluk_descr : str9, (i17 & 4096) != 0 ? hptDto2.fncr_village : i12, (i17 & 8192) != 0 ? hptDto2.fncr_village_descr : str10, (i17 & 16384) != 0 ? hptDto2.from_dt : str11, (i17 & 32768) != 0 ? hptDto2.from_dt_descr : str12, (i17 & 65536) != 0 ? hptDto2.hp_type : str13, (i17 & 131072) != 0 ? hptDto2.hp_type_descr : str14, (i17 & 262144) != 0 ? hptDto2.off_cd : i13, (i17 & 524288) != 0 ? hptDto2.op_dt : str15, (i17 & 1048576) != 0 ? hptDto2.pur_cd : i14, (i17 & 2097152) != 0 ? hptDto2.regn_no : str16, (i17 & 4194304) != 0 ? hptDto2.sr_no : i15, (i17 & 8388608) != 0 ? hptDto2.state_cd : str17, (i17 & 16777216) != 0 ? hptDto2.term_dt : str18, (i17 & 33554432) != 0 ? hptDto2.term_dt_descr : str19, (i17 & 67108864) != 0 ? hptDto2.upto_dt : str20, (i17 & 134217728) != 0 ? hptDto2.upto_dt_descr : str21);
    }

    public final String component1() {
        return this.appl_no;
    }

    public final String component10() {
        return this.fncr_state_name;
    }

    public final int component11() {
        return this.fncr_taluk;
    }

    public final String component12() {
        return this.fncr_taluk_descr;
    }

    public final int component13() {
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

    public final int component19() {
        return this.off_cd;
    }

    public final String component2() {
        return this.fncr_add1;
    }

    public final String component20() {
        return this.op_dt;
    }

    public final int component21() {
        return this.pur_cd;
    }

    public final String component22() {
        return this.regn_no;
    }

    public final int component23() {
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

    public final int component5() {
        return this.fncr_district;
    }

    public final String component6() {
        return this.fncr_district_descr;
    }

    public final String component7() {
        return this.fncr_name;
    }

    public final Integer component8() {
        return this.fncr_pincode;
    }

    public final String component9() {
        return this.fncr_state;
    }

    public final HptDto copy(String str, String str2, String str3, String str4, int i10, String str5, String str6, Integer num, String str7, String str8, int i11, String str9, int i12, String str10, String str11, String str12, String str13, String str14, int i13, String str15, int i14, String str16, int i15, String str17, String str18, String str19, String str20, String str21) {
        String str22 = str;
        l.f(str2, "fncr_add1");
        l.f(str3, "fncr_add2");
        l.f(str4, "fncr_add3");
        l.f(str5, "fncr_district_descr");
        l.f(str6, "fncr_name");
        l.f(str7, "fncr_state");
        l.f(str8, "fncr_state_name");
        l.f(str9, "fncr_taluk_descr");
        l.f(str10, "fncr_village_descr");
        l.f(str11, "from_dt");
        l.f(str12, "from_dt_descr");
        l.f(str13, "hp_type");
        l.f(str14, "hp_type_descr");
        l.f(str15, "op_dt");
        l.f(str16, "regn_no");
        l.f(str17, "state_cd");
        l.f(str18, "term_dt");
        l.f(str19, "term_dt_descr");
        l.f(str20, "upto_dt");
        l.f(str21, "upto_dt_descr");
        return new HptDto(str, str2, str3, str4, i10, str5, str6, num, str7, str8, i11, str9, i12, str10, str11, str12, str13, str14, i13, str15, i14, str16, i15, str17, str18, str19, str20, str21);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HptDto)) {
            return false;
        }
        HptDto hptDto = (HptDto) obj;
        return l.a(this.appl_no, hptDto.appl_no) && l.a(this.fncr_add1, hptDto.fncr_add1) && l.a(this.fncr_add2, hptDto.fncr_add2) && l.a(this.fncr_add3, hptDto.fncr_add3) && this.fncr_district == hptDto.fncr_district && l.a(this.fncr_district_descr, hptDto.fncr_district_descr) && l.a(this.fncr_name, hptDto.fncr_name) && l.a(this.fncr_pincode, hptDto.fncr_pincode) && l.a(this.fncr_state, hptDto.fncr_state) && l.a(this.fncr_state_name, hptDto.fncr_state_name) && this.fncr_taluk == hptDto.fncr_taluk && l.a(this.fncr_taluk_descr, hptDto.fncr_taluk_descr) && this.fncr_village == hptDto.fncr_village && l.a(this.fncr_village_descr, hptDto.fncr_village_descr) && l.a(this.from_dt, hptDto.from_dt) && l.a(this.from_dt_descr, hptDto.from_dt_descr) && l.a(this.hp_type, hptDto.hp_type) && l.a(this.hp_type_descr, hptDto.hp_type_descr) && this.off_cd == hptDto.off_cd && l.a(this.op_dt, hptDto.op_dt) && this.pur_cd == hptDto.pur_cd && l.a(this.regn_no, hptDto.regn_no) && this.sr_no == hptDto.sr_no && l.a(this.state_cd, hptDto.state_cd) && l.a(this.term_dt, hptDto.term_dt) && l.a(this.term_dt_descr, hptDto.term_dt_descr) && l.a(this.upto_dt, hptDto.upto_dt) && l.a(this.upto_dt_descr, hptDto.upto_dt_descr);
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

    public final int getFncr_district() {
        return this.fncr_district;
    }

    public final String getFncr_district_descr() {
        return this.fncr_district_descr;
    }

    public final String getFncr_name() {
        return this.fncr_name;
    }

    public final Integer getFncr_pincode() {
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
        String str = this.appl_no;
        int i10 = 0;
        int hashCode = (((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.fncr_add1.hashCode()) * 31) + this.fncr_add2.hashCode()) * 31) + this.fncr_add3.hashCode()) * 31) + Integer.hashCode(this.fncr_district)) * 31) + this.fncr_district_descr.hashCode()) * 31) + this.fncr_name.hashCode()) * 31;
        Integer num = this.fncr_pincode;
        if (num != null) {
            i10 = num.hashCode();
        }
        return ((((((((((((((((((((((((((((((((((((((((hashCode + i10) * 31) + this.fncr_state.hashCode()) * 31) + this.fncr_state_name.hashCode()) * 31) + Integer.hashCode(this.fncr_taluk)) * 31) + this.fncr_taluk_descr.hashCode()) * 31) + Integer.hashCode(this.fncr_village)) * 31) + this.fncr_village_descr.hashCode()) * 31) + this.from_dt.hashCode()) * 31) + this.from_dt_descr.hashCode()) * 31) + this.hp_type.hashCode()) * 31) + this.hp_type_descr.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.regn_no.hashCode()) * 31) + Integer.hashCode(this.sr_no)) * 31) + this.state_cd.hashCode()) * 31) + this.term_dt.hashCode()) * 31) + this.term_dt_descr.hashCode()) * 31) + this.upto_dt.hashCode()) * 31) + this.upto_dt_descr.hashCode();
    }

    public String toString() {
        return "HptDto(appl_no=" + this.appl_no + ", fncr_add1=" + this.fncr_add1 + ", fncr_add2=" + this.fncr_add2 + ", fncr_add3=" + this.fncr_add3 + ", fncr_district=" + this.fncr_district + ", fncr_district_descr=" + this.fncr_district_descr + ", fncr_name=" + this.fncr_name + ", fncr_pincode=" + this.fncr_pincode + ", fncr_state=" + this.fncr_state + ", fncr_state_name=" + this.fncr_state_name + ", fncr_taluk=" + this.fncr_taluk + ", fncr_taluk_descr=" + this.fncr_taluk_descr + ", fncr_village=" + this.fncr_village + ", fncr_village_descr=" + this.fncr_village_descr + ", from_dt=" + this.from_dt + ", from_dt_descr=" + this.from_dt_descr + ", hp_type=" + this.hp_type + ", hp_type_descr=" + this.hp_type_descr + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", pur_cd=" + this.pur_cd + ", regn_no=" + this.regn_no + ", sr_no=" + this.sr_no + ", state_cd=" + this.state_cd + ", term_dt=" + this.term_dt + ", term_dt_descr=" + this.term_dt_descr + ", upto_dt=" + this.upto_dt + ", upto_dt_descr=" + this.upto_dt_descr + ')';
    }
}
