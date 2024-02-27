package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class FinalRequestSubmitResponse {
    private final String appl_no;
    private final boolean application_status;
    private final ChanngeOfAdressDto channgeOfAdressDto;
    private final int comp_cd;
    private final Object durcdto;
    private final Object fir_dt;
    private final String fir_no;
    private final Object hpaDto;
    private final Object hptDto;
    private final int idv;
    private final Object ins_from;
    private final int ins_type;
    private final Object ins_upto;
    private final String msg;
    private final Object nocDto;
    private final int off_cd;
    private final Object op_dt;
    private final String police_station;
    private final String policy_no;
    private final int pur_cd;
    private final Object rcp_dt;
    private final String rcpt_NO;
    private final double rcpt_amt;
    private final String reason;
    private final String regn_no;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final int vh_class;

    public FinalRequestSubmitResponse(String str, ChanngeOfAdressDto channgeOfAdressDto2, int i10, Object obj, Object obj2, String str2, Object obj3, Object obj4, int i11, Object obj5, int i12, Object obj6, String str3, Object obj7, int i13, Object obj8, String str4, String str5, int i14, Object obj9, String str6, double d10, String str7, String str8, String str9, String str10, String str11, String str12, int i15, boolean z10) {
        String str13 = str;
        ChanngeOfAdressDto channgeOfAdressDto3 = channgeOfAdressDto2;
        Object obj10 = obj;
        Object obj11 = obj2;
        String str14 = str2;
        Object obj12 = obj3;
        Object obj13 = obj4;
        Object obj14 = obj5;
        Object obj15 = obj6;
        String str15 = str3;
        Object obj16 = obj7;
        Object obj17 = obj8;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        l.f(str13, "appl_no");
        l.f(channgeOfAdressDto3, "channgeOfAdressDto");
        l.f(obj10, "durcdto");
        l.f(obj11, "fir_dt");
        l.f(str14, "fir_no");
        l.f(obj12, "hpaDto");
        l.f(obj13, "hptDto");
        l.f(obj14, "ins_from");
        l.f(obj15, "ins_upto");
        l.f(str15, "msg");
        l.f(obj16, "nocDto");
        l.f(obj17, "op_dt");
        l.f(str16, "police_station");
        l.f(str17, "policy_no");
        l.f(obj9, "rcp_dt");
        l.f(str6, "rcpt_NO");
        l.f(str7, "reason");
        l.f(str8, "regn_no");
        l.f(str9, "state_cd");
        l.f(str10, "state_header");
        l.f(str11, "status");
        l.f(str12, "tax_mode");
        this.appl_no = str13;
        this.channgeOfAdressDto = channgeOfAdressDto3;
        this.comp_cd = i10;
        this.durcdto = obj10;
        this.fir_dt = obj11;
        this.fir_no = str14;
        this.hpaDto = obj12;
        this.hptDto = obj13;
        this.idv = i11;
        this.ins_from = obj14;
        this.ins_type = i12;
        this.ins_upto = obj15;
        this.msg = str15;
        this.nocDto = obj16;
        this.off_cd = i13;
        this.op_dt = obj17;
        this.police_station = str16;
        this.policy_no = str17;
        this.pur_cd = i14;
        this.rcp_dt = obj9;
        this.rcpt_NO = str6;
        this.rcpt_amt = d10;
        this.reason = str7;
        this.regn_no = str8;
        this.state_cd = str9;
        this.state_header = str10;
        this.status = str11;
        this.tax_mode = str12;
        this.vh_class = i15;
        this.application_status = z10;
    }

    public static /* synthetic */ FinalRequestSubmitResponse copy$default(FinalRequestSubmitResponse finalRequestSubmitResponse, String str, ChanngeOfAdressDto channgeOfAdressDto2, int i10, Object obj, Object obj2, String str2, Object obj3, Object obj4, int i11, Object obj5, int i12, Object obj6, String str3, Object obj7, int i13, Object obj8, String str4, String str5, int i14, Object obj9, String str6, double d10, String str7, String str8, String str9, String str10, String str11, String str12, int i15, boolean z10, int i16, Object obj10) {
        FinalRequestSubmitResponse finalRequestSubmitResponse2 = finalRequestSubmitResponse;
        int i17 = i16;
        return finalRequestSubmitResponse.copy((i17 & 1) != 0 ? finalRequestSubmitResponse2.appl_no : str, (i17 & 2) != 0 ? finalRequestSubmitResponse2.channgeOfAdressDto : channgeOfAdressDto2, (i17 & 4) != 0 ? finalRequestSubmitResponse2.comp_cd : i10, (i17 & 8) != 0 ? finalRequestSubmitResponse2.durcdto : obj, (i17 & 16) != 0 ? finalRequestSubmitResponse2.fir_dt : obj2, (i17 & 32) != 0 ? finalRequestSubmitResponse2.fir_no : str2, (i17 & 64) != 0 ? finalRequestSubmitResponse2.hpaDto : obj3, (i17 & 128) != 0 ? finalRequestSubmitResponse2.hptDto : obj4, (i17 & 256) != 0 ? finalRequestSubmitResponse2.idv : i11, (i17 & 512) != 0 ? finalRequestSubmitResponse2.ins_from : obj5, (i17 & 1024) != 0 ? finalRequestSubmitResponse2.ins_type : i12, (i17 & 2048) != 0 ? finalRequestSubmitResponse2.ins_upto : obj6, (i17 & 4096) != 0 ? finalRequestSubmitResponse2.msg : str3, (i17 & 8192) != 0 ? finalRequestSubmitResponse2.nocDto : obj7, (i17 & 16384) != 0 ? finalRequestSubmitResponse2.off_cd : i13, (i17 & 32768) != 0 ? finalRequestSubmitResponse2.op_dt : obj8, (i17 & 65536) != 0 ? finalRequestSubmitResponse2.police_station : str4, (i17 & 131072) != 0 ? finalRequestSubmitResponse2.policy_no : str5, (i17 & 262144) != 0 ? finalRequestSubmitResponse2.pur_cd : i14, (i17 & 524288) != 0 ? finalRequestSubmitResponse2.rcp_dt : obj9, (i17 & 1048576) != 0 ? finalRequestSubmitResponse2.rcpt_NO : str6, (i17 & 2097152) != 0 ? finalRequestSubmitResponse2.rcpt_amt : d10, (i17 & 4194304) != 0 ? finalRequestSubmitResponse2.reason : str7, (8388608 & i17) != 0 ? finalRequestSubmitResponse2.regn_no : str8, (i17 & 16777216) != 0 ? finalRequestSubmitResponse2.state_cd : str9, (i17 & 33554432) != 0 ? finalRequestSubmitResponse2.state_header : str10, (i17 & 67108864) != 0 ? finalRequestSubmitResponse2.status : str11, (i17 & 134217728) != 0 ? finalRequestSubmitResponse2.tax_mode : str12, (i17 & 268435456) != 0 ? finalRequestSubmitResponse2.vh_class : i15, (i17 & 536870912) != 0 ? finalRequestSubmitResponse2.application_status : z10);
    }

    public final String component1() {
        return this.appl_no;
    }

    public final Object component10() {
        return this.ins_from;
    }

    public final int component11() {
        return this.ins_type;
    }

    public final Object component12() {
        return this.ins_upto;
    }

    public final String component13() {
        return this.msg;
    }

    public final Object component14() {
        return this.nocDto;
    }

    public final int component15() {
        return this.off_cd;
    }

    public final Object component16() {
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

    public final ChanngeOfAdressDto component2() {
        return this.channgeOfAdressDto;
    }

    public final Object component20() {
        return this.rcp_dt;
    }

    public final String component21() {
        return this.rcpt_NO;
    }

    public final double component22() {
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

    public final boolean component30() {
        return this.application_status;
    }

    public final Object component4() {
        return this.durcdto;
    }

    public final Object component5() {
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

    public final FinalRequestSubmitResponse copy(String str, ChanngeOfAdressDto channgeOfAdressDto2, int i10, Object obj, Object obj2, String str2, Object obj3, Object obj4, int i11, Object obj5, int i12, Object obj6, String str3, Object obj7, int i13, Object obj8, String str4, String str5, int i14, Object obj9, String str6, double d10, String str7, String str8, String str9, String str10, String str11, String str12, int i15, boolean z10) {
        String str13 = str;
        l.f(str13, "appl_no");
        l.f(channgeOfAdressDto2, "channgeOfAdressDto");
        l.f(obj, "durcdto");
        l.f(obj2, "fir_dt");
        l.f(str2, "fir_no");
        l.f(obj3, "hpaDto");
        l.f(obj4, "hptDto");
        l.f(obj5, "ins_from");
        l.f(obj6, "ins_upto");
        l.f(str3, "msg");
        l.f(obj7, "nocDto");
        l.f(obj8, "op_dt");
        l.f(str4, "police_station");
        l.f(str5, "policy_no");
        l.f(obj9, "rcp_dt");
        l.f(str6, "rcpt_NO");
        l.f(str7, "reason");
        l.f(str8, "regn_no");
        l.f(str9, "state_cd");
        l.f(str10, "state_header");
        l.f(str11, "status");
        l.f(str12, "tax_mode");
        return new FinalRequestSubmitResponse(str13, channgeOfAdressDto2, i10, obj, obj2, str2, obj3, obj4, i11, obj5, i12, obj6, str3, obj7, i13, obj8, str4, str5, i14, obj9, str6, d10, str7, str8, str9, str10, str11, str12, i15, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinalRequestSubmitResponse)) {
            return false;
        }
        FinalRequestSubmitResponse finalRequestSubmitResponse = (FinalRequestSubmitResponse) obj;
        return l.a(this.appl_no, finalRequestSubmitResponse.appl_no) && l.a(this.channgeOfAdressDto, finalRequestSubmitResponse.channgeOfAdressDto) && this.comp_cd == finalRequestSubmitResponse.comp_cd && l.a(this.durcdto, finalRequestSubmitResponse.durcdto) && l.a(this.fir_dt, finalRequestSubmitResponse.fir_dt) && l.a(this.fir_no, finalRequestSubmitResponse.fir_no) && l.a(this.hpaDto, finalRequestSubmitResponse.hpaDto) && l.a(this.hptDto, finalRequestSubmitResponse.hptDto) && this.idv == finalRequestSubmitResponse.idv && l.a(this.ins_from, finalRequestSubmitResponse.ins_from) && this.ins_type == finalRequestSubmitResponse.ins_type && l.a(this.ins_upto, finalRequestSubmitResponse.ins_upto) && l.a(this.msg, finalRequestSubmitResponse.msg) && l.a(this.nocDto, finalRequestSubmitResponse.nocDto) && this.off_cd == finalRequestSubmitResponse.off_cd && l.a(this.op_dt, finalRequestSubmitResponse.op_dt) && l.a(this.police_station, finalRequestSubmitResponse.police_station) && l.a(this.policy_no, finalRequestSubmitResponse.policy_no) && this.pur_cd == finalRequestSubmitResponse.pur_cd && l.a(this.rcp_dt, finalRequestSubmitResponse.rcp_dt) && l.a(this.rcpt_NO, finalRequestSubmitResponse.rcpt_NO) && Double.compare(this.rcpt_amt, finalRequestSubmitResponse.rcpt_amt) == 0 && l.a(this.reason, finalRequestSubmitResponse.reason) && l.a(this.regn_no, finalRequestSubmitResponse.regn_no) && l.a(this.state_cd, finalRequestSubmitResponse.state_cd) && l.a(this.state_header, finalRequestSubmitResponse.state_header) && l.a(this.status, finalRequestSubmitResponse.status) && l.a(this.tax_mode, finalRequestSubmitResponse.tax_mode) && this.vh_class == finalRequestSubmitResponse.vh_class && this.application_status == finalRequestSubmitResponse.application_status;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final boolean getApplication_status() {
        return this.application_status;
    }

    public final ChanngeOfAdressDto getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final int getComp_cd() {
        return this.comp_cd;
    }

    public final Object getDurcdto() {
        return this.durcdto;
    }

    public final Object getFir_dt() {
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

    public final Object getIns_from() {
        return this.ins_from;
    }

    public final int getIns_type() {
        return this.ins_type;
    }

    public final Object getIns_upto() {
        return this.ins_upto;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final Object getNocDto() {
        return this.nocDto;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final Object getOp_dt() {
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

    public final Object getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final double getRcpt_amt() {
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
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.appl_no.hashCode() * 31) + this.channgeOfAdressDto.hashCode()) * 31) + Integer.hashCode(this.comp_cd)) * 31) + this.durcdto.hashCode()) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31) + this.hpaDto.hashCode()) * 31) + this.hptDto.hashCode()) * 31) + Integer.hashCode(this.idv)) * 31) + this.ins_from.hashCode()) * 31) + Integer.hashCode(this.ins_type)) * 31) + this.ins_upto.hashCode()) * 31) + this.msg.hashCode()) * 31) + this.nocDto.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.rcp_dt.hashCode()) * 31) + this.rcpt_NO.hashCode()) * 31) + Double.hashCode(this.rcpt_amt)) * 31) + this.reason.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31) + Integer.hashCode(this.vh_class)) * 31;
        boolean z10 = this.application_status;
        if (z10) {
            z10 = true;
        }
        return hashCode + (z10 ? 1 : 0);
    }

    public String toString() {
        return "FinalRequestSubmitResponse(appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", comp_cd=" + this.comp_cd + ", durcdto=" + this.durcdto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", nocDto=" + this.nocDto + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ", application_status=" + this.application_status + ')';
    }
}
