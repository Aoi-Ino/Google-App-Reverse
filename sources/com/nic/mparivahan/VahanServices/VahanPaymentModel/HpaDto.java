package com.nic.mparivahan.VahanServices.VahanPaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class HpaDto implements Serializable {
    private final String appl_no;
    private final String fncr_add1;
    private final String fncr_add2;
    private final String fncr_add3;
    private final int fncr_district;
    private final String fncr_name;
    private final int fncr_pincode;
    private final String fncr_state;
    private final String from_dt;
    private final int off_cd;
    private final String op_dt;
    private final String regn_no;
    private final int sr_no;
    private final String state_cd;

    public HpaDto(String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, int i12, String str8, String str9, int i13, String str10) {
        l.f(str, "appl_no");
        l.f(str2, "fncr_add1");
        l.f(str3, "fncr_add2");
        l.f(str4, "fncr_add3");
        l.f(str5, "fncr_name");
        l.f(str6, "fncr_state");
        l.f(str7, "from_dt");
        l.f(str8, "op_dt");
        l.f(str9, "regn_no");
        l.f(str10, "state_cd");
        this.appl_no = str;
        this.fncr_add1 = str2;
        this.fncr_add2 = str3;
        this.fncr_add3 = str4;
        this.fncr_district = i10;
        this.fncr_name = str5;
        this.fncr_pincode = i11;
        this.fncr_state = str6;
        this.from_dt = str7;
        this.off_cd = i12;
        this.op_dt = str8;
        this.regn_no = str9;
        this.sr_no = i13;
        this.state_cd = str10;
    }

    public static /* synthetic */ HpaDto copy$default(HpaDto hpaDto, String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, int i12, String str8, String str9, int i13, String str10, int i14, Object obj) {
        HpaDto hpaDto2 = hpaDto;
        int i15 = i14;
        return hpaDto.copy((i15 & 1) != 0 ? hpaDto2.appl_no : str, (i15 & 2) != 0 ? hpaDto2.fncr_add1 : str2, (i15 & 4) != 0 ? hpaDto2.fncr_add2 : str3, (i15 & 8) != 0 ? hpaDto2.fncr_add3 : str4, (i15 & 16) != 0 ? hpaDto2.fncr_district : i10, (i15 & 32) != 0 ? hpaDto2.fncr_name : str5, (i15 & 64) != 0 ? hpaDto2.fncr_pincode : i11, (i15 & 128) != 0 ? hpaDto2.fncr_state : str6, (i15 & 256) != 0 ? hpaDto2.from_dt : str7, (i15 & 512) != 0 ? hpaDto2.off_cd : i12, (i15 & 1024) != 0 ? hpaDto2.op_dt : str8, (i15 & 2048) != 0 ? hpaDto2.regn_no : str9, (i15 & 4096) != 0 ? hpaDto2.sr_no : i13, (i15 & 8192) != 0 ? hpaDto2.state_cd : str10);
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
        return this.regn_no;
    }

    public final int component13() {
        return this.sr_no;
    }

    public final String component14() {
        return this.state_cd;
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

    public final HpaDto copy(String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, int i12, String str8, String str9, int i13, String str10) {
        String str11 = str;
        l.f(str11, "appl_no");
        String str12 = str2;
        l.f(str12, "fncr_add1");
        String str13 = str3;
        l.f(str13, "fncr_add2");
        String str14 = str4;
        l.f(str14, "fncr_add3");
        String str15 = str5;
        l.f(str15, "fncr_name");
        String str16 = str6;
        l.f(str16, "fncr_state");
        String str17 = str7;
        l.f(str17, "from_dt");
        String str18 = str8;
        l.f(str18, "op_dt");
        String str19 = str9;
        l.f(str19, "regn_no");
        String str20 = str10;
        l.f(str20, "state_cd");
        return new HpaDto(str11, str12, str13, str14, i10, str15, i11, str16, str17, i12, str18, str19, i13, str20);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HpaDto)) {
            return false;
        }
        HpaDto hpaDto = (HpaDto) obj;
        return l.a(this.appl_no, hpaDto.appl_no) && l.a(this.fncr_add1, hpaDto.fncr_add1) && l.a(this.fncr_add2, hpaDto.fncr_add2) && l.a(this.fncr_add3, hpaDto.fncr_add3) && this.fncr_district == hpaDto.fncr_district && l.a(this.fncr_name, hpaDto.fncr_name) && this.fncr_pincode == hpaDto.fncr_pincode && l.a(this.fncr_state, hpaDto.fncr_state) && l.a(this.from_dt, hpaDto.from_dt) && this.off_cd == hpaDto.off_cd && l.a(this.op_dt, hpaDto.op_dt) && l.a(this.regn_no, hpaDto.regn_no) && this.sr_no == hpaDto.sr_no && l.a(this.state_cd, hpaDto.state_cd);
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

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
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
        return (((((((((((((((((((((((((this.appl_no.hashCode() * 31) + this.fncr_add1.hashCode()) * 31) + this.fncr_add2.hashCode()) * 31) + this.fncr_add3.hashCode()) * 31) + Integer.hashCode(this.fncr_district)) * 31) + this.fncr_name.hashCode()) * 31) + Integer.hashCode(this.fncr_pincode)) * 31) + this.fncr_state.hashCode()) * 31) + this.from_dt.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + Integer.hashCode(this.sr_no)) * 31) + this.state_cd.hashCode();
    }

    public String toString() {
        return "HpaDto(appl_no=" + this.appl_no + ", fncr_add1=" + this.fncr_add1 + ", fncr_add2=" + this.fncr_add2 + ", fncr_add3=" + this.fncr_add3 + ", fncr_district=" + this.fncr_district + ", fncr_name=" + this.fncr_name + ", fncr_pincode=" + this.fncr_pincode + ", fncr_state=" + this.fncr_state + ", from_dt=" + this.from_dt + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", regn_no=" + this.regn_no + ", sr_no=" + this.sr_no + ", state_cd=" + this.state_cd + ')';
    }
}
