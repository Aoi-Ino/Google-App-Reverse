package com.nic.mparivahan.VahanServices.HPA;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class HPAResModle implements Serializable {
    private final String aadhaartxno;
    private final String appl_no;
    private final String fncr_add1;
    private final String fncr_add2;
    private final String fncr_add3;
    private final int fncr_district;
    private final String fncr_name;
    private final int fncr_pincode;
    private final String fncr_state;
    private final String from_dt;
    private final String hp_type;
    private final String off_cd;
    private final String op_dt;
    private final int pur_cd;
    private final String regn_no;
    private final int sr_no;
    private final String state_cd;

    public HPAResModle(String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, String str8, String str9, String str10, int i12, String str11, int i13, String str12, String str13) {
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        String str20 = str10;
        String str21 = str11;
        String str22 = str12;
        l.f(str, "appl_no");
        l.f(str2, "fncr_add1");
        l.f(str14, "fncr_add2");
        l.f(str15, "fncr_add3");
        l.f(str16, "fncr_name");
        l.f(str17, "fncr_state");
        l.f(str18, "from_dt");
        l.f(str19, "hp_type");
        l.f(str20, "op_dt");
        l.f(str21, "regn_no");
        l.f(str22, "state_cd");
        this.appl_no = str;
        this.fncr_add1 = str2;
        this.fncr_add2 = str14;
        this.fncr_add3 = str15;
        this.fncr_district = i10;
        this.fncr_name = str16;
        this.fncr_pincode = i11;
        this.fncr_state = str17;
        this.from_dt = str18;
        this.hp_type = str19;
        this.off_cd = str9;
        this.op_dt = str20;
        this.pur_cd = i12;
        this.regn_no = str21;
        this.sr_no = i13;
        this.state_cd = str22;
        this.aadhaartxno = str13;
    }

    public static /* synthetic */ HPAResModle copy$default(HPAResModle hPAResModle, String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, String str8, String str9, String str10, int i12, String str11, int i13, String str12, String str13, int i14, Object obj) {
        HPAResModle hPAResModle2 = hPAResModle;
        int i15 = i14;
        return hPAResModle.copy((i15 & 1) != 0 ? hPAResModle2.appl_no : str, (i15 & 2) != 0 ? hPAResModle2.fncr_add1 : str2, (i15 & 4) != 0 ? hPAResModle2.fncr_add2 : str3, (i15 & 8) != 0 ? hPAResModle2.fncr_add3 : str4, (i15 & 16) != 0 ? hPAResModle2.fncr_district : i10, (i15 & 32) != 0 ? hPAResModle2.fncr_name : str5, (i15 & 64) != 0 ? hPAResModle2.fncr_pincode : i11, (i15 & 128) != 0 ? hPAResModle2.fncr_state : str6, (i15 & 256) != 0 ? hPAResModle2.from_dt : str7, (i15 & 512) != 0 ? hPAResModle2.hp_type : str8, (i15 & 1024) != 0 ? hPAResModle2.off_cd : str9, (i15 & 2048) != 0 ? hPAResModle2.op_dt : str10, (i15 & 4096) != 0 ? hPAResModle2.pur_cd : i12, (i15 & 8192) != 0 ? hPAResModle2.regn_no : str11, (i15 & 16384) != 0 ? hPAResModle2.sr_no : i13, (i15 & 32768) != 0 ? hPAResModle2.state_cd : str12, (i15 & 65536) != 0 ? hPAResModle2.aadhaartxno : str13);
    }

    public final String component1() {
        return this.appl_no;
    }

    public final String component10() {
        return this.hp_type;
    }

    public final String component11() {
        return this.off_cd;
    }

    public final String component12() {
        return this.op_dt;
    }

    public final int component13() {
        return this.pur_cd;
    }

    public final String component14() {
        return this.regn_no;
    }

    public final int component15() {
        return this.sr_no;
    }

    public final String component16() {
        return this.state_cd;
    }

    public final String component17() {
        return this.aadhaartxno;
    }

    public final String component2() {
        return this.fncr_add1;
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
        return this.fncr_name;
    }

    public final int component7() {
        return this.fncr_pincode;
    }

    public final String component8() {
        return this.fncr_state;
    }

    public final String component9() {
        return this.from_dt;
    }

    public final HPAResModle copy(String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, String str8, String str9, String str10, int i12, String str11, int i13, String str12, String str13) {
        String str14 = str;
        l.f(str14, "appl_no");
        l.f(str2, "fncr_add1");
        l.f(str3, "fncr_add2");
        l.f(str4, "fncr_add3");
        l.f(str5, "fncr_name");
        l.f(str6, "fncr_state");
        l.f(str7, "from_dt");
        l.f(str8, "hp_type");
        l.f(str10, "op_dt");
        l.f(str11, "regn_no");
        l.f(str12, "state_cd");
        return new HPAResModle(str14, str2, str3, str4, i10, str5, i11, str6, str7, str8, str9, str10, i12, str11, i13, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HPAResModle)) {
            return false;
        }
        HPAResModle hPAResModle = (HPAResModle) obj;
        return l.a(this.appl_no, hPAResModle.appl_no) && l.a(this.fncr_add1, hPAResModle.fncr_add1) && l.a(this.fncr_add2, hPAResModle.fncr_add2) && l.a(this.fncr_add3, hPAResModle.fncr_add3) && this.fncr_district == hPAResModle.fncr_district && l.a(this.fncr_name, hPAResModle.fncr_name) && this.fncr_pincode == hPAResModle.fncr_pincode && l.a(this.fncr_state, hPAResModle.fncr_state) && l.a(this.from_dt, hPAResModle.from_dt) && l.a(this.hp_type, hPAResModle.hp_type) && l.a(this.off_cd, hPAResModle.off_cd) && l.a(this.op_dt, hPAResModle.op_dt) && this.pur_cd == hPAResModle.pur_cd && l.a(this.regn_no, hPAResModle.regn_no) && this.sr_no == hPAResModle.sr_no && l.a(this.state_cd, hPAResModle.state_cd) && l.a(this.aadhaartxno, hPAResModle.aadhaartxno);
    }

    public final String getAadhaartxno() {
        return this.aadhaartxno;
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

    public final String getFncr_name() {
        return this.fncr_name;
    }

    public final int getFncr_pincode() {
        return this.fncr_pincode;
    }

    public final String getFncr_state() {
        return this.fncr_state;
    }

    public final String getFrom_dt() {
        return this.from_dt;
    }

    public final String getHp_type() {
        return this.hp_type;
    }

    public final String getOff_cd() {
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

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.appl_no.hashCode() * 31) + this.fncr_add1.hashCode()) * 31) + this.fncr_add2.hashCode()) * 31) + this.fncr_add3.hashCode()) * 31) + Integer.hashCode(this.fncr_district)) * 31) + this.fncr_name.hashCode()) * 31) + Integer.hashCode(this.fncr_pincode)) * 31) + this.fncr_state.hashCode()) * 31) + this.from_dt.hashCode()) * 31) + this.hp_type.hashCode()) * 31;
        String str = this.off_cd;
        int i10 = 0;
        int hashCode2 = (((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.op_dt.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.regn_no.hashCode()) * 31) + Integer.hashCode(this.sr_no)) * 31) + this.state_cd.hashCode()) * 31;
        String str2 = this.aadhaartxno;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "HPAResModle(appl_no=" + this.appl_no + ", fncr_add1=" + this.fncr_add1 + ", fncr_add2=" + this.fncr_add2 + ", fncr_add3=" + this.fncr_add3 + ", fncr_district=" + this.fncr_district + ", fncr_name=" + this.fncr_name + ", fncr_pincode=" + this.fncr_pincode + ", fncr_state=" + this.fncr_state + ", from_dt=" + this.from_dt + ", hp_type=" + this.hp_type + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", pur_cd=" + this.pur_cd + ", regn_no=" + this.regn_no + ", sr_no=" + this.sr_no + ", state_cd=" + this.state_cd + ", aadhaartxno=" + this.aadhaartxno + ')';
    }
}
