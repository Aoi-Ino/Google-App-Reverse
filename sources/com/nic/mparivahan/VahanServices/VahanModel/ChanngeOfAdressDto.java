package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ChanngeOfAdressDto {
    private final int action_cd;
    private final int action_code;
    private final String appl_no;
    private final String c_add1;
    private final String c_add2;
    private final String c_add3;
    private final int c_district;
    private final int c_pincode;
    private final String c_state;
    private final String facelessmessge;
    private final int flow_slno;
    private final long from_dt;
    private final String messege;
    private final int off_cd;
    private final Object op_dt;
    private final String p_add1;
    private final String p_add2;
    private final String p_add3;
    private final int p_district;
    private final int p_pincode;
    private final String p_state;
    private final int pur_cd;
    private final String regn_no;
    private final String state_cd;
    private final String state_header;

    public ChanngeOfAdressDto(int i10, int i11, String str, String str2, String str3, String str4, int i12, int i13, String str5, String str6, int i14, long j10, String str7, int i15, Object obj, String str8, String str9, String str10, int i16, int i17, String str11, int i18, String str12, String str13, String str14) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        Object obj2 = obj;
        String str22 = str8;
        String str23 = str9;
        String str24 = str10;
        String str25 = str11;
        String str26 = str12;
        String str27 = str13;
        l.f(str15, "appl_no");
        l.f(str16, "c_add1");
        l.f(str17, "c_add2");
        l.f(str18, "c_add3");
        l.f(str19, "c_state");
        l.f(str20, "facelessmessge");
        l.f(str21, "messege");
        l.f(obj2, "op_dt");
        l.f(str22, "p_add1");
        l.f(str23, "p_add2");
        l.f(str24, "p_add3");
        l.f(str25, "p_state");
        l.f(str26, "regn_no");
        l.f(str27, "state_cd");
        l.f(str14, "state_header");
        this.action_cd = i10;
        this.action_code = i11;
        this.appl_no = str15;
        this.c_add1 = str16;
        this.c_add2 = str17;
        this.c_add3 = str18;
        this.c_district = i12;
        this.c_pincode = i13;
        this.c_state = str19;
        this.facelessmessge = str20;
        this.flow_slno = i14;
        this.from_dt = j10;
        this.messege = str21;
        this.off_cd = i15;
        this.op_dt = obj2;
        this.p_add1 = str22;
        this.p_add2 = str23;
        this.p_add3 = str24;
        this.p_district = i16;
        this.p_pincode = i17;
        this.p_state = str25;
        this.pur_cd = i18;
        this.regn_no = str26;
        this.state_cd = str27;
        this.state_header = str14;
    }

    public static /* synthetic */ ChanngeOfAdressDto copy$default(ChanngeOfAdressDto channgeOfAdressDto, int i10, int i11, String str, String str2, String str3, String str4, int i12, int i13, String str5, String str6, int i14, long j10, String str7, int i15, Object obj, String str8, String str9, String str10, int i16, int i17, String str11, int i18, String str12, String str13, String str14, int i19, Object obj2) {
        ChanngeOfAdressDto channgeOfAdressDto2 = channgeOfAdressDto;
        int i20 = i19;
        return channgeOfAdressDto.copy((i20 & 1) != 0 ? channgeOfAdressDto2.action_cd : i10, (i20 & 2) != 0 ? channgeOfAdressDto2.action_code : i11, (i20 & 4) != 0 ? channgeOfAdressDto2.appl_no : str, (i20 & 8) != 0 ? channgeOfAdressDto2.c_add1 : str2, (i20 & 16) != 0 ? channgeOfAdressDto2.c_add2 : str3, (i20 & 32) != 0 ? channgeOfAdressDto2.c_add3 : str4, (i20 & 64) != 0 ? channgeOfAdressDto2.c_district : i12, (i20 & 128) != 0 ? channgeOfAdressDto2.c_pincode : i13, (i20 & 256) != 0 ? channgeOfAdressDto2.c_state : str5, (i20 & 512) != 0 ? channgeOfAdressDto2.facelessmessge : str6, (i20 & 1024) != 0 ? channgeOfAdressDto2.flow_slno : i14, (i20 & 2048) != 0 ? channgeOfAdressDto2.from_dt : j10, (i20 & 4096) != 0 ? channgeOfAdressDto2.messege : str7, (i20 & 8192) != 0 ? channgeOfAdressDto2.off_cd : i15, (i20 & 16384) != 0 ? channgeOfAdressDto2.op_dt : obj, (i20 & 32768) != 0 ? channgeOfAdressDto2.p_add1 : str8, (i20 & 65536) != 0 ? channgeOfAdressDto2.p_add2 : str9, (i20 & 131072) != 0 ? channgeOfAdressDto2.p_add3 : str10, (i20 & 262144) != 0 ? channgeOfAdressDto2.p_district : i16, (i20 & 524288) != 0 ? channgeOfAdressDto2.p_pincode : i17, (i20 & 1048576) != 0 ? channgeOfAdressDto2.p_state : str11, (i20 & 2097152) != 0 ? channgeOfAdressDto2.pur_cd : i18, (i20 & 4194304) != 0 ? channgeOfAdressDto2.regn_no : str12, (i20 & 8388608) != 0 ? channgeOfAdressDto2.state_cd : str13, (i20 & 16777216) != 0 ? channgeOfAdressDto2.state_header : str14);
    }

    public final int component1() {
        return this.action_cd;
    }

    public final String component10() {
        return this.facelessmessge;
    }

    public final int component11() {
        return this.flow_slno;
    }

    public final long component12() {
        return this.from_dt;
    }

    public final String component13() {
        return this.messege;
    }

    public final int component14() {
        return this.off_cd;
    }

    public final Object component15() {
        return this.op_dt;
    }

    public final String component16() {
        return this.p_add1;
    }

    public final String component17() {
        return this.p_add2;
    }

    public final String component18() {
        return this.p_add3;
    }

    public final int component19() {
        return this.p_district;
    }

    public final int component2() {
        return this.action_code;
    }

    public final int component20() {
        return this.p_pincode;
    }

    public final String component21() {
        return this.p_state;
    }

    public final int component22() {
        return this.pur_cd;
    }

    public final String component23() {
        return this.regn_no;
    }

    public final String component24() {
        return this.state_cd;
    }

    public final String component25() {
        return this.state_header;
    }

    public final String component3() {
        return this.appl_no;
    }

    public final String component4() {
        return this.c_add1;
    }

    public final String component5() {
        return this.c_add2;
    }

    public final String component6() {
        return this.c_add3;
    }

    public final int component7() {
        return this.c_district;
    }

    public final int component8() {
        return this.c_pincode;
    }

    public final String component9() {
        return this.c_state;
    }

    public final ChanngeOfAdressDto copy(int i10, int i11, String str, String str2, String str3, String str4, int i12, int i13, String str5, String str6, int i14, long j10, String str7, int i15, Object obj, String str8, String str9, String str10, int i16, int i17, String str11, int i18, String str12, String str13, String str14) {
        int i19 = i10;
        l.f(str, "appl_no");
        l.f(str2, "c_add1");
        l.f(str3, "c_add2");
        l.f(str4, "c_add3");
        l.f(str5, "c_state");
        l.f(str6, "facelessmessge");
        l.f(str7, "messege");
        l.f(obj, "op_dt");
        l.f(str8, "p_add1");
        l.f(str9, "p_add2");
        l.f(str10, "p_add3");
        l.f(str11, "p_state");
        l.f(str12, "regn_no");
        l.f(str13, "state_cd");
        l.f(str14, "state_header");
        return new ChanngeOfAdressDto(i10, i11, str, str2, str3, str4, i12, i13, str5, str6, i14, j10, str7, i15, obj, str8, str9, str10, i16, i17, str11, i18, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChanngeOfAdressDto)) {
            return false;
        }
        ChanngeOfAdressDto channgeOfAdressDto = (ChanngeOfAdressDto) obj;
        return this.action_cd == channgeOfAdressDto.action_cd && this.action_code == channgeOfAdressDto.action_code && l.a(this.appl_no, channgeOfAdressDto.appl_no) && l.a(this.c_add1, channgeOfAdressDto.c_add1) && l.a(this.c_add2, channgeOfAdressDto.c_add2) && l.a(this.c_add3, channgeOfAdressDto.c_add3) && this.c_district == channgeOfAdressDto.c_district && this.c_pincode == channgeOfAdressDto.c_pincode && l.a(this.c_state, channgeOfAdressDto.c_state) && l.a(this.facelessmessge, channgeOfAdressDto.facelessmessge) && this.flow_slno == channgeOfAdressDto.flow_slno && this.from_dt == channgeOfAdressDto.from_dt && l.a(this.messege, channgeOfAdressDto.messege) && this.off_cd == channgeOfAdressDto.off_cd && l.a(this.op_dt, channgeOfAdressDto.op_dt) && l.a(this.p_add1, channgeOfAdressDto.p_add1) && l.a(this.p_add2, channgeOfAdressDto.p_add2) && l.a(this.p_add3, channgeOfAdressDto.p_add3) && this.p_district == channgeOfAdressDto.p_district && this.p_pincode == channgeOfAdressDto.p_pincode && l.a(this.p_state, channgeOfAdressDto.p_state) && this.pur_cd == channgeOfAdressDto.pur_cd && l.a(this.regn_no, channgeOfAdressDto.regn_no) && l.a(this.state_cd, channgeOfAdressDto.state_cd) && l.a(this.state_header, channgeOfAdressDto.state_header);
    }

    public final int getAction_cd() {
        return this.action_cd;
    }

    public final int getAction_code() {
        return this.action_code;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final String getC_add1() {
        return this.c_add1;
    }

    public final String getC_add2() {
        return this.c_add2;
    }

    public final String getC_add3() {
        return this.c_add3;
    }

    public final int getC_district() {
        return this.c_district;
    }

    public final int getC_pincode() {
        return this.c_pincode;
    }

    public final String getC_state() {
        return this.c_state;
    }

    public final String getFacelessmessge() {
        return this.facelessmessge;
    }

    public final int getFlow_slno() {
        return this.flow_slno;
    }

    public final long getFrom_dt() {
        return this.from_dt;
    }

    public final String getMessege() {
        return this.messege;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final Object getOp_dt() {
        return this.op_dt;
    }

    public final String getP_add1() {
        return this.p_add1;
    }

    public final String getP_add2() {
        return this.p_add2;
    }

    public final String getP_add3() {
        return this.p_add3;
    }

    public final int getP_district() {
        return this.p_district;
    }

    public final int getP_pincode() {
        return this.p_pincode;
    }

    public final String getP_state() {
        return this.p_state;
    }

    public final int getPur_cd() {
        return this.pur_cd;
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

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.action_cd) * 31) + Integer.hashCode(this.action_code)) * 31) + this.appl_no.hashCode()) * 31) + this.c_add1.hashCode()) * 31) + this.c_add2.hashCode()) * 31) + this.c_add3.hashCode()) * 31) + Integer.hashCode(this.c_district)) * 31) + Integer.hashCode(this.c_pincode)) * 31) + this.c_state.hashCode()) * 31) + this.facelessmessge.hashCode()) * 31) + Integer.hashCode(this.flow_slno)) * 31) + Long.hashCode(this.from_dt)) * 31) + this.messege.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + this.p_add1.hashCode()) * 31) + this.p_add2.hashCode()) * 31) + this.p_add3.hashCode()) * 31) + Integer.hashCode(this.p_district)) * 31) + Integer.hashCode(this.p_pincode)) * 31) + this.p_state.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode();
    }

    public String toString() {
        return "ChanngeOfAdressDto(action_cd=" + this.action_cd + ", action_code=" + this.action_code + ", appl_no=" + this.appl_no + ", c_add1=" + this.c_add1 + ", c_add2=" + this.c_add2 + ", c_add3=" + this.c_add3 + ", c_district=" + this.c_district + ", c_pincode=" + this.c_pincode + ", c_state=" + this.c_state + ", facelessmessge=" + this.facelessmessge + ", flow_slno=" + this.flow_slno + ", from_dt=" + this.from_dt + ", messege=" + this.messege + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", p_add1=" + this.p_add1 + ", p_add2=" + this.p_add2 + ", p_add3=" + this.p_add3 + ", p_district=" + this.p_district + ", p_pincode=" + this.p_pincode + ", p_state=" + this.p_state + ", pur_cd=" + this.pur_cd + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ')';
    }
}
