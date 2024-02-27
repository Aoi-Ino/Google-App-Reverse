package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Durcdto implements Serializable {
    private final String appl_no;
    private final Object comp_cd;
    private final Object fir_dt;
    private final String fir_no;
    private final Object idv;
    private final Object ins_from;
    private final Object ins_type;
    private final Object ins_upto;
    private final Object msg;
    private final int off_cd;
    private final String op_dt;
    private final String police_station;
    private final Object policy_no;
    private final int pur_cd;
    private final Object rcp_dt;
    private final Object rcpt_NO;
    private final int rcpt_amt;
    private final String reason;
    private final String regn_no;
    private final String state_cd;
    private final Object state_header;
    private final Object status;
    private final Object tax_mode;
    private final Object vh_class;

    public Durcdto(String str, Object obj, Object obj2, String str2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10, String str3, String str4, Object obj8, int i11, Object obj9, Object obj10, int i12, String str5, String str6, String str7, Object obj11, Object obj12, Object obj13, Object obj14) {
        String str8 = str;
        Object obj15 = obj;
        Object obj16 = obj2;
        String str9 = str2;
        Object obj17 = obj3;
        Object obj18 = obj4;
        Object obj19 = obj5;
        Object obj20 = obj6;
        Object obj21 = obj7;
        String str10 = str3;
        String str11 = str4;
        Object obj22 = obj8;
        Object obj23 = obj9;
        Object obj24 = obj10;
        String str12 = str6;
        l.f(str8, "appl_no");
        l.f(obj15, "comp_cd");
        l.f(obj16, "fir_dt");
        l.f(str9, "fir_no");
        l.f(obj17, "idv");
        l.f(obj18, "ins_from");
        l.f(obj19, "ins_type");
        l.f(obj20, "ins_upto");
        l.f(obj21, "msg");
        l.f(str10, "op_dt");
        l.f(str11, "police_station");
        l.f(obj22, "policy_no");
        l.f(obj23, "rcp_dt");
        l.f(obj24, "rcpt_NO");
        l.f(str5, "reason");
        l.f(str6, "regn_no");
        l.f(str7, "state_cd");
        l.f(obj11, "state_header");
        l.f(obj12, "status");
        l.f(obj13, "tax_mode");
        l.f(obj14, "vh_class");
        this.appl_no = str8;
        this.comp_cd = obj15;
        this.fir_dt = obj16;
        this.fir_no = str9;
        this.idv = obj17;
        this.ins_from = obj18;
        this.ins_type = obj19;
        this.ins_upto = obj20;
        this.msg = obj21;
        this.off_cd = i10;
        this.op_dt = str10;
        this.police_station = str11;
        this.policy_no = obj22;
        this.pur_cd = i11;
        this.rcp_dt = obj23;
        this.rcpt_NO = obj24;
        this.rcpt_amt = i12;
        this.reason = str5;
        this.regn_no = str6;
        this.state_cd = str7;
        this.state_header = obj11;
        this.status = obj12;
        this.tax_mode = obj13;
        this.vh_class = obj14;
    }

    public static /* synthetic */ Durcdto copy$default(Durcdto durcdto, String str, Object obj, Object obj2, String str2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10, String str3, String str4, Object obj8, int i11, Object obj9, Object obj10, int i12, String str5, String str6, String str7, Object obj11, Object obj12, Object obj13, Object obj14, int i13, Object obj15) {
        Durcdto durcdto2 = durcdto;
        int i14 = i13;
        return durcdto.copy((i14 & 1) != 0 ? durcdto2.appl_no : str, (i14 & 2) != 0 ? durcdto2.comp_cd : obj, (i14 & 4) != 0 ? durcdto2.fir_dt : obj2, (i14 & 8) != 0 ? durcdto2.fir_no : str2, (i14 & 16) != 0 ? durcdto2.idv : obj3, (i14 & 32) != 0 ? durcdto2.ins_from : obj4, (i14 & 64) != 0 ? durcdto2.ins_type : obj5, (i14 & 128) != 0 ? durcdto2.ins_upto : obj6, (i14 & 256) != 0 ? durcdto2.msg : obj7, (i14 & 512) != 0 ? durcdto2.off_cd : i10, (i14 & 1024) != 0 ? durcdto2.op_dt : str3, (i14 & 2048) != 0 ? durcdto2.police_station : str4, (i14 & 4096) != 0 ? durcdto2.policy_no : obj8, (i14 & 8192) != 0 ? durcdto2.pur_cd : i11, (i14 & 16384) != 0 ? durcdto2.rcp_dt : obj9, (i14 & 32768) != 0 ? durcdto2.rcpt_NO : obj10, (i14 & 65536) != 0 ? durcdto2.rcpt_amt : i12, (i14 & 131072) != 0 ? durcdto2.reason : str5, (i14 & 262144) != 0 ? durcdto2.regn_no : str6, (i14 & 524288) != 0 ? durcdto2.state_cd : str7, (i14 & 1048576) != 0 ? durcdto2.state_header : obj11, (i14 & 2097152) != 0 ? durcdto2.status : obj12, (i14 & 4194304) != 0 ? durcdto2.tax_mode : obj13, (i14 & 8388608) != 0 ? durcdto2.vh_class : obj14);
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
        return this.police_station;
    }

    public final Object component13() {
        return this.policy_no;
    }

    public final int component14() {
        return this.pur_cd;
    }

    public final Object component15() {
        return this.rcp_dt;
    }

    public final Object component16() {
        return this.rcpt_NO;
    }

    public final int component17() {
        return this.rcpt_amt;
    }

    public final String component18() {
        return this.reason;
    }

    public final String component19() {
        return this.regn_no;
    }

    public final Object component2() {
        return this.comp_cd;
    }

    public final String component20() {
        return this.state_cd;
    }

    public final Object component21() {
        return this.state_header;
    }

    public final Object component22() {
        return this.status;
    }

    public final Object component23() {
        return this.tax_mode;
    }

    public final Object component24() {
        return this.vh_class;
    }

    public final Object component3() {
        return this.fir_dt;
    }

    public final String component4() {
        return this.fir_no;
    }

    public final Object component5() {
        return this.idv;
    }

    public final Object component6() {
        return this.ins_from;
    }

    public final Object component7() {
        return this.ins_type;
    }

    public final Object component8() {
        return this.ins_upto;
    }

    public final Object component9() {
        return this.msg;
    }

    public final Durcdto copy(String str, Object obj, Object obj2, String str2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10, String str3, String str4, Object obj8, int i11, Object obj9, Object obj10, int i12, String str5, String str6, String str7, Object obj11, Object obj12, Object obj13, Object obj14) {
        String str8 = str;
        l.f(str8, "appl_no");
        l.f(obj, "comp_cd");
        l.f(obj2, "fir_dt");
        l.f(str2, "fir_no");
        l.f(obj3, "idv");
        l.f(obj4, "ins_from");
        l.f(obj5, "ins_type");
        l.f(obj6, "ins_upto");
        l.f(obj7, "msg");
        l.f(str3, "op_dt");
        l.f(str4, "police_station");
        l.f(obj8, "policy_no");
        l.f(obj9, "rcp_dt");
        l.f(obj10, "rcpt_NO");
        l.f(str5, "reason");
        l.f(str6, "regn_no");
        l.f(str7, "state_cd");
        l.f(obj11, "state_header");
        l.f(obj12, "status");
        l.f(obj13, "tax_mode");
        l.f(obj14, "vh_class");
        return new Durcdto(str8, obj, obj2, str2, obj3, obj4, obj5, obj6, obj7, i10, str3, str4, obj8, i11, obj9, obj10, i12, str5, str6, str7, obj11, obj12, obj13, obj14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Durcdto)) {
            return false;
        }
        Durcdto durcdto = (Durcdto) obj;
        return l.a(this.appl_no, durcdto.appl_no) && l.a(this.comp_cd, durcdto.comp_cd) && l.a(this.fir_dt, durcdto.fir_dt) && l.a(this.fir_no, durcdto.fir_no) && l.a(this.idv, durcdto.idv) && l.a(this.ins_from, durcdto.ins_from) && l.a(this.ins_type, durcdto.ins_type) && l.a(this.ins_upto, durcdto.ins_upto) && l.a(this.msg, durcdto.msg) && this.off_cd == durcdto.off_cd && l.a(this.op_dt, durcdto.op_dt) && l.a(this.police_station, durcdto.police_station) && l.a(this.policy_no, durcdto.policy_no) && this.pur_cd == durcdto.pur_cd && l.a(this.rcp_dt, durcdto.rcp_dt) && l.a(this.rcpt_NO, durcdto.rcpt_NO) && this.rcpt_amt == durcdto.rcpt_amt && l.a(this.reason, durcdto.reason) && l.a(this.regn_no, durcdto.regn_no) && l.a(this.state_cd, durcdto.state_cd) && l.a(this.state_header, durcdto.state_header) && l.a(this.status, durcdto.status) && l.a(this.tax_mode, durcdto.tax_mode) && l.a(this.vh_class, durcdto.vh_class);
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final Object getComp_cd() {
        return this.comp_cd;
    }

    public final Object getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
        return this.fir_no;
    }

    public final Object getIdv() {
        return this.idv;
    }

    public final Object getIns_from() {
        return this.ins_from;
    }

    public final Object getIns_type() {
        return this.ins_type;
    }

    public final Object getIns_upto() {
        return this.ins_upto;
    }

    public final Object getMsg() {
        return this.msg;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getPolice_station() {
        return this.police_station;
    }

    public final Object getPolicy_no() {
        return this.policy_no;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final Object getRcp_dt() {
        return this.rcp_dt;
    }

    public final Object getRcpt_NO() {
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

    public final Object getState_header() {
        return this.state_header;
    }

    public final Object getStatus() {
        return this.status;
    }

    public final Object getTax_mode() {
        return this.tax_mode;
    }

    public final Object getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((this.appl_no.hashCode() * 31) + this.comp_cd.hashCode()) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31) + this.idv.hashCode()) * 31) + this.ins_from.hashCode()) * 31) + this.ins_type.hashCode()) * 31) + this.ins_upto.hashCode()) * 31) + this.msg.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.rcp_dt.hashCode()) * 31) + this.rcpt_NO.hashCode()) * 31) + Integer.hashCode(this.rcpt_amt)) * 31) + this.reason.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31) + this.vh_class.hashCode();
    }

    public String toString() {
        return "Durcdto(appl_no=" + this.appl_no + ", comp_cd=" + this.comp_cd + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ')';
    }
}
