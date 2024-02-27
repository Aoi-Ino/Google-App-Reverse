package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class ChaangeOfAddressStatus implements Serializable {
    private final String aadhaartxno;
    private final String action_cd;
    private final String action_code;
    private final String appl_no;
    private final String c_add1;
    private final String c_add2;
    private final String c_add3;
    private final String c_district;
    private final String c_pincode;
    private final String c_state;
    private final String facelessmessge;
    private final String flow_slno;
    private final String from_dt;
    private final String messege;
    private final String off_cd;
    private final String op_dt;
    private final String p_add1;
    private final String p_add2;
    private final String p_add3;
    private final String p_district;
    private final String p_pincode;
    private final String p_state;
    private final String pur_cd;
    private final String regn_no;
    private final String state_cd;
    private final String state_header;

    public ChaangeOfAddressStatus(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
        String str27 = str;
        String str28 = str2;
        String str29 = str3;
        String str30 = str4;
        String str31 = str5;
        String str32 = str6;
        String str33 = str7;
        String str34 = str8;
        String str35 = str9;
        String str36 = str10;
        String str37 = str11;
        String str38 = str12;
        String str39 = str13;
        String str40 = str14;
        String str41 = str16;
        l.f(str27, "action_cd");
        l.f(str28, "action_code");
        l.f(str29, "appl_no");
        l.f(str30, "c_add1");
        l.f(str31, "c_add2");
        l.f(str32, "c_add3");
        l.f(str33, "c_district");
        l.f(str34, "c_pincode");
        l.f(str35, "c_state");
        l.f(str36, "facelessmessge");
        l.f(str37, "flow_slno");
        l.f(str38, "from_dt");
        l.f(str39, "messege");
        l.f(str40, "off_cd");
        l.f(str15, "op_dt");
        l.f(str16, "p_add1");
        l.f(str17, "p_add2");
        l.f(str18, "p_add3");
        l.f(str19, "p_district");
        l.f(str20, "p_pincode");
        l.f(str21, "p_state");
        l.f(str22, "pur_cd");
        l.f(str23, "regn_no");
        l.f(str24, "state_cd");
        l.f(str25, "state_header");
        this.action_cd = str27;
        this.action_code = str28;
        this.appl_no = str29;
        this.c_add1 = str30;
        this.c_add2 = str31;
        this.c_add3 = str32;
        this.c_district = str33;
        this.c_pincode = str34;
        this.c_state = str35;
        this.facelessmessge = str36;
        this.flow_slno = str37;
        this.from_dt = str38;
        this.messege = str39;
        this.off_cd = str40;
        this.op_dt = str15;
        this.p_add1 = str16;
        this.p_add2 = str17;
        this.p_add3 = str18;
        this.p_district = str19;
        this.p_pincode = str20;
        this.p_state = str21;
        this.pur_cd = str22;
        this.regn_no = str23;
        this.state_cd = str24;
        this.state_header = str25;
        this.aadhaartxno = str26;
    }

    public static /* synthetic */ ChaangeOfAddressStatus copy$default(ChaangeOfAddressStatus chaangeOfAddressStatus, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i10, Object obj) {
        ChaangeOfAddressStatus chaangeOfAddressStatus2 = chaangeOfAddressStatus;
        int i11 = i10;
        return chaangeOfAddressStatus.copy((i11 & 1) != 0 ? chaangeOfAddressStatus2.action_cd : str, (i11 & 2) != 0 ? chaangeOfAddressStatus2.action_code : str2, (i11 & 4) != 0 ? chaangeOfAddressStatus2.appl_no : str3, (i11 & 8) != 0 ? chaangeOfAddressStatus2.c_add1 : str4, (i11 & 16) != 0 ? chaangeOfAddressStatus2.c_add2 : str5, (i11 & 32) != 0 ? chaangeOfAddressStatus2.c_add3 : str6, (i11 & 64) != 0 ? chaangeOfAddressStatus2.c_district : str7, (i11 & 128) != 0 ? chaangeOfAddressStatus2.c_pincode : str8, (i11 & 256) != 0 ? chaangeOfAddressStatus2.c_state : str9, (i11 & 512) != 0 ? chaangeOfAddressStatus2.facelessmessge : str10, (i11 & 1024) != 0 ? chaangeOfAddressStatus2.flow_slno : str11, (i11 & 2048) != 0 ? chaangeOfAddressStatus2.from_dt : str12, (i11 & 4096) != 0 ? chaangeOfAddressStatus2.messege : str13, (i11 & 8192) != 0 ? chaangeOfAddressStatus2.off_cd : str14, (i11 & 16384) != 0 ? chaangeOfAddressStatus2.op_dt : str15, (i11 & 32768) != 0 ? chaangeOfAddressStatus2.p_add1 : str16, (i11 & 65536) != 0 ? chaangeOfAddressStatus2.p_add2 : str17, (i11 & 131072) != 0 ? chaangeOfAddressStatus2.p_add3 : str18, (i11 & 262144) != 0 ? chaangeOfAddressStatus2.p_district : str19, (i11 & 524288) != 0 ? chaangeOfAddressStatus2.p_pincode : str20, (i11 & 1048576) != 0 ? chaangeOfAddressStatus2.p_state : str21, (i11 & 2097152) != 0 ? chaangeOfAddressStatus2.pur_cd : str22, (i11 & 4194304) != 0 ? chaangeOfAddressStatus2.regn_no : str23, (i11 & 8388608) != 0 ? chaangeOfAddressStatus2.state_cd : str24, (i11 & 16777216) != 0 ? chaangeOfAddressStatus2.state_header : str25, (i11 & 33554432) != 0 ? chaangeOfAddressStatus2.aadhaartxno : str26);
    }

    public final String component1() {
        return this.action_cd;
    }

    public final String component10() {
        return this.facelessmessge;
    }

    public final String component11() {
        return this.flow_slno;
    }

    public final String component12() {
        return this.from_dt;
    }

    public final String component13() {
        return this.messege;
    }

    public final String component14() {
        return this.off_cd;
    }

    public final String component15() {
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

    public final String component19() {
        return this.p_district;
    }

    public final String component2() {
        return this.action_code;
    }

    public final String component20() {
        return this.p_pincode;
    }

    public final String component21() {
        return this.p_state;
    }

    public final String component22() {
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

    public final String component26() {
        return this.aadhaartxno;
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

    public final String component7() {
        return this.c_district;
    }

    public final String component8() {
        return this.c_pincode;
    }

    public final String component9() {
        return this.c_state;
    }

    public final ChaangeOfAddressStatus copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
        String str27 = str;
        l.f(str27, "action_cd");
        l.f(str2, "action_code");
        l.f(str3, "appl_no");
        l.f(str4, "c_add1");
        l.f(str5, "c_add2");
        l.f(str6, "c_add3");
        l.f(str7, "c_district");
        l.f(str8, "c_pincode");
        l.f(str9, "c_state");
        l.f(str10, "facelessmessge");
        l.f(str11, "flow_slno");
        l.f(str12, "from_dt");
        l.f(str13, "messege");
        l.f(str14, "off_cd");
        l.f(str15, "op_dt");
        l.f(str16, "p_add1");
        l.f(str17, "p_add2");
        l.f(str18, "p_add3");
        l.f(str19, "p_district");
        l.f(str20, "p_pincode");
        l.f(str21, "p_state");
        l.f(str22, "pur_cd");
        l.f(str23, "regn_no");
        l.f(str24, "state_cd");
        l.f(str25, "state_header");
        return new ChaangeOfAddressStatus(str27, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaangeOfAddressStatus)) {
            return false;
        }
        ChaangeOfAddressStatus chaangeOfAddressStatus = (ChaangeOfAddressStatus) obj;
        return l.a(this.action_cd, chaangeOfAddressStatus.action_cd) && l.a(this.action_code, chaangeOfAddressStatus.action_code) && l.a(this.appl_no, chaangeOfAddressStatus.appl_no) && l.a(this.c_add1, chaangeOfAddressStatus.c_add1) && l.a(this.c_add2, chaangeOfAddressStatus.c_add2) && l.a(this.c_add3, chaangeOfAddressStatus.c_add3) && l.a(this.c_district, chaangeOfAddressStatus.c_district) && l.a(this.c_pincode, chaangeOfAddressStatus.c_pincode) && l.a(this.c_state, chaangeOfAddressStatus.c_state) && l.a(this.facelessmessge, chaangeOfAddressStatus.facelessmessge) && l.a(this.flow_slno, chaangeOfAddressStatus.flow_slno) && l.a(this.from_dt, chaangeOfAddressStatus.from_dt) && l.a(this.messege, chaangeOfAddressStatus.messege) && l.a(this.off_cd, chaangeOfAddressStatus.off_cd) && l.a(this.op_dt, chaangeOfAddressStatus.op_dt) && l.a(this.p_add1, chaangeOfAddressStatus.p_add1) && l.a(this.p_add2, chaangeOfAddressStatus.p_add2) && l.a(this.p_add3, chaangeOfAddressStatus.p_add3) && l.a(this.p_district, chaangeOfAddressStatus.p_district) && l.a(this.p_pincode, chaangeOfAddressStatus.p_pincode) && l.a(this.p_state, chaangeOfAddressStatus.p_state) && l.a(this.pur_cd, chaangeOfAddressStatus.pur_cd) && l.a(this.regn_no, chaangeOfAddressStatus.regn_no) && l.a(this.state_cd, chaangeOfAddressStatus.state_cd) && l.a(this.state_header, chaangeOfAddressStatus.state_header) && l.a(this.aadhaartxno, chaangeOfAddressStatus.aadhaartxno);
    }

    public final String getAadhaartxno() {
        return this.aadhaartxno;
    }

    public final String getAction_cd() {
        return this.action_cd;
    }

    public final String getAction_code() {
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

    public final String getC_district() {
        return this.c_district;
    }

    public final String getC_pincode() {
        return this.c_pincode;
    }

    public final String getC_state() {
        return this.c_state;
    }

    public final String getFacelessmessge() {
        return this.facelessmessge;
    }

    public final String getFlow_slno() {
        return this.flow_slno;
    }

    public final String getFrom_dt() {
        return this.from_dt;
    }

    public final String getMessege() {
        return this.messege;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
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

    public final String getP_district() {
        return this.p_district;
    }

    public final String getP_pincode() {
        return this.p_pincode;
    }

    public final String getP_state() {
        return this.p_state;
    }

    public final String getPur_cd() {
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
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((this.action_cd.hashCode() * 31) + this.action_code.hashCode()) * 31) + this.appl_no.hashCode()) * 31) + this.c_add1.hashCode()) * 31) + this.c_add2.hashCode()) * 31) + this.c_add3.hashCode()) * 31) + this.c_district.hashCode()) * 31) + this.c_pincode.hashCode()) * 31) + this.c_state.hashCode()) * 31) + this.facelessmessge.hashCode()) * 31) + this.flow_slno.hashCode()) * 31) + this.from_dt.hashCode()) * 31) + this.messege.hashCode()) * 31) + this.off_cd.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.p_add1.hashCode()) * 31) + this.p_add2.hashCode()) * 31) + this.p_add3.hashCode()) * 31) + this.p_district.hashCode()) * 31) + this.p_pincode.hashCode()) * 31) + this.p_state.hashCode()) * 31) + this.pur_cd.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31;
        String str = this.aadhaartxno;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ChaangeOfAddressStatus(action_cd=" + this.action_cd + ", action_code=" + this.action_code + ", appl_no=" + this.appl_no + ", c_add1=" + this.c_add1 + ", c_add2=" + this.c_add2 + ", c_add3=" + this.c_add3 + ", c_district=" + this.c_district + ", c_pincode=" + this.c_pincode + ", c_state=" + this.c_state + ", facelessmessge=" + this.facelessmessge + ", flow_slno=" + this.flow_slno + ", from_dt=" + this.from_dt + ", messege=" + this.messege + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", p_add1=" + this.p_add1 + ", p_add2=" + this.p_add2 + ", p_add3=" + this.p_add3 + ", p_district=" + this.p_district + ", p_pincode=" + this.p_pincode + ", p_state=" + this.p_state + ", pur_cd=" + this.pur_cd + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", aadhaartxno=" + this.aadhaartxno + ')';
    }
}
