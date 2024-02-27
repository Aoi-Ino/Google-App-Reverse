package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class tp {
    private final int action_cd;
    private final String appl_no;
    private final Object channgeOfAdressDto;
    private final Object chassis;
    private final Object comp_cd;
    private final Object duplicateRCDto;
    private final Object fir_dt;
    private final Object fir_no;
    private final int flow_slno;
    private final Object hpadto;
    private final Object hptdto;
    private final Object idv;
    private final Object ins_from;
    private final Object ins_type;
    private final Object ins_upto;
    private final Object messege;
    private final Object nocDobj;
    private final int off_cd;
    private final String off_descr;
    private final Object op_dt;
    private final String owner_name;
    private final String payment_mode;
    private final Object police_station;
    private final Object policy_no;
    private final int pur_cd;
    private final long rcp_dt;
    private final String rcpt_NO;
    private final double rcpt_amt;
    private final long rcpt_dt;
    private final Object reason;
    private final String regn_date;
    private final String regn_no;
    private final String response_code;
    private final Object serviceDto;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String status_desc;
    private final Object tax_mode;
    private final Object treasury_REF_NO;
    private final String vh_class;

    public tp(int i10, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, int i12, String str2, Object obj15, String str3, String str4, Object obj16, Object obj17, int i13, long j10, String str5, double d10, long j11, Object obj18, String str6, String str7, String str8, Object obj19, String str9, String str10, String str11, String str12, Object obj20, Object obj21, String str13) {
        String str14 = str;
        Object obj22 = obj;
        Object obj23 = obj2;
        Object obj24 = obj3;
        Object obj25 = obj4;
        Object obj26 = obj5;
        Object obj27 = obj6;
        Object obj28 = obj7;
        Object obj29 = obj8;
        Object obj30 = obj9;
        Object obj31 = obj10;
        Object obj32 = obj11;
        Object obj33 = obj12;
        Object obj34 = obj13;
        String str15 = str2;
        l.f(str14, "appl_no");
        l.f(obj22, "channgeOfAdressDto");
        l.f(obj23, "chassis");
        l.f(obj24, "comp_cd");
        l.f(obj25, "duplicateRCDto");
        l.f(obj26, "fir_dt");
        l.f(obj27, "fir_no");
        l.f(obj28, "hpadto");
        l.f(obj29, "hptdto");
        l.f(obj30, "idv");
        l.f(obj31, "ins_from");
        l.f(obj32, "ins_type");
        l.f(obj33, "ins_upto");
        l.f(obj34, "messege");
        l.f(obj14, "nocDobj");
        l.f(str2, "off_descr");
        l.f(obj15, "op_dt");
        l.f(str3, "owner_name");
        l.f(str4, "payment_mode");
        l.f(obj16, "police_station");
        l.f(obj17, "policy_no");
        l.f(str5, "rcpt_NO");
        l.f(obj18, "reason");
        l.f(str6, "regn_date");
        l.f(str7, "regn_no");
        l.f(str8, "response_code");
        l.f(obj19, "serviceDto");
        l.f(str9, "state_cd");
        l.f(str10, "state_header");
        l.f(str11, "status");
        l.f(str12, "status_desc");
        l.f(obj20, "tax_mode");
        l.f(obj21, "treasury_REF_NO");
        l.f(str13, "vh_class");
        this.action_cd = i10;
        this.appl_no = str14;
        this.channgeOfAdressDto = obj22;
        this.chassis = obj23;
        this.comp_cd = obj24;
        this.duplicateRCDto = obj25;
        this.fir_dt = obj26;
        this.fir_no = obj27;
        this.flow_slno = i11;
        this.hpadto = obj28;
        this.hptdto = obj29;
        this.idv = obj30;
        this.ins_from = obj31;
        this.ins_type = obj32;
        this.ins_upto = obj33;
        this.messege = obj34;
        this.nocDobj = obj14;
        this.off_cd = i12;
        this.off_descr = str2;
        this.op_dt = obj15;
        this.owner_name = str3;
        this.payment_mode = str4;
        this.police_station = obj16;
        this.policy_no = obj17;
        this.pur_cd = i13;
        this.rcp_dt = j10;
        this.rcpt_NO = str5;
        this.rcpt_amt = d10;
        this.rcpt_dt = j11;
        this.reason = obj18;
        this.regn_date = str6;
        this.regn_no = str7;
        this.response_code = str8;
        this.serviceDto = obj19;
        this.state_cd = str9;
        this.state_header = str10;
        this.status = str11;
        this.status_desc = str12;
        this.tax_mode = obj20;
        this.treasury_REF_NO = obj21;
        this.vh_class = str13;
    }

    public static /* synthetic */ tp copy$default(tp tpVar, int i10, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, int i12, String str2, Object obj15, String str3, String str4, Object obj16, Object obj17, int i13, long j10, String str5, double d10, long j11, Object obj18, String str6, String str7, String str8, Object obj19, String str9, String str10, String str11, String str12, Object obj20, Object obj21, String str13, int i14, int i15, Object obj22) {
        tp tpVar2 = tpVar;
        int i16 = i14;
        int i17 = i15;
        return tpVar.copy((i16 & 1) != 0 ? tpVar2.action_cd : i10, (i16 & 2) != 0 ? tpVar2.appl_no : str, (i16 & 4) != 0 ? tpVar2.channgeOfAdressDto : obj, (i16 & 8) != 0 ? tpVar2.chassis : obj2, (i16 & 16) != 0 ? tpVar2.comp_cd : obj3, (i16 & 32) != 0 ? tpVar2.duplicateRCDto : obj4, (i16 & 64) != 0 ? tpVar2.fir_dt : obj5, (i16 & 128) != 0 ? tpVar2.fir_no : obj6, (i16 & 256) != 0 ? tpVar2.flow_slno : i11, (i16 & 512) != 0 ? tpVar2.hpadto : obj7, (i16 & 1024) != 0 ? tpVar2.hptdto : obj8, (i16 & 2048) != 0 ? tpVar2.idv : obj9, (i16 & 4096) != 0 ? tpVar2.ins_from : obj10, (i16 & 8192) != 0 ? tpVar2.ins_type : obj11, (i16 & 16384) != 0 ? tpVar2.ins_upto : obj12, (i16 & 32768) != 0 ? tpVar2.messege : obj13, (i16 & 65536) != 0 ? tpVar2.nocDobj : obj14, (i16 & 131072) != 0 ? tpVar2.off_cd : i12, (i16 & 262144) != 0 ? tpVar2.off_descr : str2, (i16 & 524288) != 0 ? tpVar2.op_dt : obj15, (i16 & 1048576) != 0 ? tpVar2.owner_name : str3, (i16 & 2097152) != 0 ? tpVar2.payment_mode : str4, (i16 & 4194304) != 0 ? tpVar2.police_station : obj16, (i16 & 8388608) != 0 ? tpVar2.policy_no : obj17, (i16 & 16777216) != 0 ? tpVar2.pur_cd : i13, (i16 & 33554432) != 0 ? tpVar2.rcp_dt : j10, (i16 & 67108864) != 0 ? tpVar2.rcpt_NO : str5, (134217728 & i16) != 0 ? tpVar2.rcpt_amt : d10, (i16 & 268435456) != 0 ? tpVar2.rcpt_dt : j11, (i16 & 536870912) != 0 ? tpVar2.reason : obj18, (1073741824 & i16) != 0 ? tpVar2.regn_date : str6, (i16 & Integer.MIN_VALUE) != 0 ? tpVar2.regn_no : str7, (i17 & 1) != 0 ? tpVar2.response_code : str8, (i17 & 2) != 0 ? tpVar2.serviceDto : obj19, (i17 & 4) != 0 ? tpVar2.state_cd : str9, (i17 & 8) != 0 ? tpVar2.state_header : str10, (i17 & 16) != 0 ? tpVar2.status : str11, (i17 & 32) != 0 ? tpVar2.status_desc : str12, (i17 & 64) != 0 ? tpVar2.tax_mode : obj20, (i17 & 128) != 0 ? tpVar2.treasury_REF_NO : obj21, (i17 & 256) != 0 ? tpVar2.vh_class : str13);
    }

    public final int component1() {
        return this.action_cd;
    }

    public final Object component10() {
        return this.hpadto;
    }

    public final Object component11() {
        return this.hptdto;
    }

    public final Object component12() {
        return this.idv;
    }

    public final Object component13() {
        return this.ins_from;
    }

    public final Object component14() {
        return this.ins_type;
    }

    public final Object component15() {
        return this.ins_upto;
    }

    public final Object component16() {
        return this.messege;
    }

    public final Object component17() {
        return this.nocDobj;
    }

    public final int component18() {
        return this.off_cd;
    }

    public final String component19() {
        return this.off_descr;
    }

    public final String component2() {
        return this.appl_no;
    }

    public final Object component20() {
        return this.op_dt;
    }

    public final String component21() {
        return this.owner_name;
    }

    public final String component22() {
        return this.payment_mode;
    }

    public final Object component23() {
        return this.police_station;
    }

    public final Object component24() {
        return this.policy_no;
    }

    public final int component25() {
        return this.pur_cd;
    }

    public final long component26() {
        return this.rcp_dt;
    }

    public final String component27() {
        return this.rcpt_NO;
    }

    public final double component28() {
        return this.rcpt_amt;
    }

    public final long component29() {
        return this.rcpt_dt;
    }

    public final Object component3() {
        return this.channgeOfAdressDto;
    }

    public final Object component30() {
        return this.reason;
    }

    public final String component31() {
        return this.regn_date;
    }

    public final String component32() {
        return this.regn_no;
    }

    public final String component33() {
        return this.response_code;
    }

    public final Object component34() {
        return this.serviceDto;
    }

    public final String component35() {
        return this.state_cd;
    }

    public final String component36() {
        return this.state_header;
    }

    public final String component37() {
        return this.status;
    }

    public final String component38() {
        return this.status_desc;
    }

    public final Object component39() {
        return this.tax_mode;
    }

    public final Object component4() {
        return this.chassis;
    }

    public final Object component40() {
        return this.treasury_REF_NO;
    }

    public final String component41() {
        return this.vh_class;
    }

    public final Object component5() {
        return this.comp_cd;
    }

    public final Object component6() {
        return this.duplicateRCDto;
    }

    public final Object component7() {
        return this.fir_dt;
    }

    public final Object component8() {
        return this.fir_no;
    }

    public final int component9() {
        return this.flow_slno;
    }

    public final tp copy(int i10, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, int i12, String str2, Object obj15, String str3, String str4, Object obj16, Object obj17, int i13, long j10, String str5, double d10, long j11, Object obj18, String str6, String str7, String str8, Object obj19, String str9, String str10, String str11, String str12, Object obj20, Object obj21, String str13) {
        int i14 = i10;
        l.f(str, "appl_no");
        l.f(obj, "channgeOfAdressDto");
        l.f(obj2, "chassis");
        l.f(obj3, "comp_cd");
        l.f(obj4, "duplicateRCDto");
        l.f(obj5, "fir_dt");
        l.f(obj6, "fir_no");
        l.f(obj7, "hpadto");
        l.f(obj8, "hptdto");
        l.f(obj9, "idv");
        l.f(obj10, "ins_from");
        l.f(obj11, "ins_type");
        l.f(obj12, "ins_upto");
        l.f(obj13, "messege");
        l.f(obj14, "nocDobj");
        l.f(str2, "off_descr");
        l.f(obj15, "op_dt");
        l.f(str3, "owner_name");
        l.f(str4, "payment_mode");
        l.f(obj16, "police_station");
        l.f(obj17, "policy_no");
        l.f(str5, "rcpt_NO");
        l.f(obj18, "reason");
        l.f(str6, "regn_date");
        l.f(str7, "regn_no");
        l.f(str8, "response_code");
        l.f(obj19, "serviceDto");
        l.f(str9, "state_cd");
        l.f(str10, "state_header");
        l.f(str11, "status");
        l.f(str12, "status_desc");
        l.f(obj20, "tax_mode");
        l.f(obj21, "treasury_REF_NO");
        l.f(str13, "vh_class");
        return new tp(i10, str, obj, obj2, obj3, obj4, obj5, obj6, i11, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, i12, str2, obj15, str3, str4, obj16, obj17, i13, j10, str5, d10, j11, obj18, str6, str7, str8, obj19, str9, str10, str11, str12, obj20, obj21, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp)) {
            return false;
        }
        tp tpVar = (tp) obj;
        return this.action_cd == tpVar.action_cd && l.a(this.appl_no, tpVar.appl_no) && l.a(this.channgeOfAdressDto, tpVar.channgeOfAdressDto) && l.a(this.chassis, tpVar.chassis) && l.a(this.comp_cd, tpVar.comp_cd) && l.a(this.duplicateRCDto, tpVar.duplicateRCDto) && l.a(this.fir_dt, tpVar.fir_dt) && l.a(this.fir_no, tpVar.fir_no) && this.flow_slno == tpVar.flow_slno && l.a(this.hpadto, tpVar.hpadto) && l.a(this.hptdto, tpVar.hptdto) && l.a(this.idv, tpVar.idv) && l.a(this.ins_from, tpVar.ins_from) && l.a(this.ins_type, tpVar.ins_type) && l.a(this.ins_upto, tpVar.ins_upto) && l.a(this.messege, tpVar.messege) && l.a(this.nocDobj, tpVar.nocDobj) && this.off_cd == tpVar.off_cd && l.a(this.off_descr, tpVar.off_descr) && l.a(this.op_dt, tpVar.op_dt) && l.a(this.owner_name, tpVar.owner_name) && l.a(this.payment_mode, tpVar.payment_mode) && l.a(this.police_station, tpVar.police_station) && l.a(this.policy_no, tpVar.policy_no) && this.pur_cd == tpVar.pur_cd && this.rcp_dt == tpVar.rcp_dt && l.a(this.rcpt_NO, tpVar.rcpt_NO) && Double.compare(this.rcpt_amt, tpVar.rcpt_amt) == 0 && this.rcpt_dt == tpVar.rcpt_dt && l.a(this.reason, tpVar.reason) && l.a(this.regn_date, tpVar.regn_date) && l.a(this.regn_no, tpVar.regn_no) && l.a(this.response_code, tpVar.response_code) && l.a(this.serviceDto, tpVar.serviceDto) && l.a(this.state_cd, tpVar.state_cd) && l.a(this.state_header, tpVar.state_header) && l.a(this.status, tpVar.status) && l.a(this.status_desc, tpVar.status_desc) && l.a(this.tax_mode, tpVar.tax_mode) && l.a(this.treasury_REF_NO, tpVar.treasury_REF_NO) && l.a(this.vh_class, tpVar.vh_class);
    }

    public final int getAction_cd() {
        return this.action_cd;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final Object getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final Object getChassis() {
        return this.chassis;
    }

    public final Object getComp_cd() {
        return this.comp_cd;
    }

    public final Object getDuplicateRCDto() {
        return this.duplicateRCDto;
    }

    public final Object getFir_dt() {
        return this.fir_dt;
    }

    public final Object getFir_no() {
        return this.fir_no;
    }

    public final int getFlow_slno() {
        return this.flow_slno;
    }

    public final Object getHpadto() {
        return this.hpadto;
    }

    public final Object getHptdto() {
        return this.hptdto;
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

    public final Object getMessege() {
        return this.messege;
    }

    public final Object getNocDobj() {
        return this.nocDobj;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOff_descr() {
        return this.off_descr;
    }

    public final Object getOp_dt() {
        return this.op_dt;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getPayment_mode() {
        return this.payment_mode;
    }

    public final Object getPolice_station() {
        return this.police_station;
    }

    public final Object getPolicy_no() {
        return this.policy_no;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final long getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final double getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final long getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final Object getReason() {
        return this.reason;
    }

    public final String getRegn_date() {
        return this.regn_date;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getResponse_code() {
        return this.response_code;
    }

    public final Object getServiceDto() {
        return this.serviceDto;
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

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final Object getTax_mode() {
        return this.tax_mode;
    }

    public final Object getTreasury_REF_NO() {
        return this.treasury_REF_NO;
    }

    public final String getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.action_cd) * 31) + this.appl_no.hashCode()) * 31) + this.channgeOfAdressDto.hashCode()) * 31) + this.chassis.hashCode()) * 31) + this.comp_cd.hashCode()) * 31) + this.duplicateRCDto.hashCode()) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31) + Integer.hashCode(this.flow_slno)) * 31) + this.hpadto.hashCode()) * 31) + this.hptdto.hashCode()) * 31) + this.idv.hashCode()) * 31) + this.ins_from.hashCode()) * 31) + this.ins_type.hashCode()) * 31) + this.ins_upto.hashCode()) * 31) + this.messege.hashCode()) * 31) + this.nocDobj.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.off_descr.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.owner_name.hashCode()) * 31) + this.payment_mode.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + Long.hashCode(this.rcp_dt)) * 31) + this.rcpt_NO.hashCode()) * 31) + Double.hashCode(this.rcpt_amt)) * 31) + Long.hashCode(this.rcpt_dt)) * 31) + this.reason.hashCode()) * 31) + this.regn_date.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.response_code.hashCode()) * 31) + this.serviceDto.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.status_desc.hashCode()) * 31) + this.tax_mode.hashCode()) * 31) + this.treasury_REF_NO.hashCode()) * 31) + this.vh_class.hashCode();
    }

    public String toString() {
        return "tp(action_cd=" + this.action_cd + ", appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", chassis=" + this.chassis + ", comp_cd=" + this.comp_cd + ", duplicateRCDto=" + this.duplicateRCDto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", flow_slno=" + this.flow_slno + ", hpadto=" + this.hpadto + ", hptdto=" + this.hptdto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", messege=" + this.messege + ", nocDobj=" + this.nocDobj + ", off_cd=" + this.off_cd + ", off_descr=" + this.off_descr + ", op_dt=" + this.op_dt + ", owner_name=" + this.owner_name + ", payment_mode=" + this.payment_mode + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", rcpt_dt=" + this.rcpt_dt + ", reason=" + this.reason + ", regn_date=" + this.regn_date + ", regn_no=" + this.regn_no + ", response_code=" + this.response_code + ", serviceDto=" + this.serviceDto + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", status_desc=" + this.status_desc + ", tax_mode=" + this.tax_mode + ", treasury_REF_NO=" + this.treasury_REF_NO + ", vh_class=" + this.vh_class + ')';
    }
}
