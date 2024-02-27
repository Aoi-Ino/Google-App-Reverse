package com.nic.mparivahan.VahanServices.VahanPaymentModel;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import java.io.Serializable;

@Keep
public final class BeforePaymentRequestfinal implements Serializable {
    private final String aadharauth;
    private final String appl_no;
    private final ChaangeOfAddressStatus channgeOfAdressDto;
    private final int comp_cd;
    private final dulicateRcResponseModle durcdto;
    private final String fir_dt;
    private final String fir_no;
    private final HPAResModle hpaDto;
    private final HptTerResponse hptDto;
    private final int idv;
    private final String ins_from;
    private final int ins_type;
    private final String ins_upto;
    private final String msg;
    private final NocDraftResponse nocDto;
    private final String off_cd;
    private final String op_dt;
    private final String police_station;
    private final String policy_no;
    private final String pur_cd;
    private final String rcp_dt;
    private final String rcpt_NO;
    private final String rcpt_amt;
    private final int reason;
    private final String regn_no;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final Integer vh_class;

    public BeforePaymentRequestfinal(String str, String str2, ChaangeOfAddressStatus chaangeOfAddressStatus, int i10, dulicateRcResponseModle dulicatercresponsemodle, String str3, String str4, HPAResModle hPAResModle, HptTerResponse hptTerResponse, int i11, String str5, int i12, String str6, String str7, NocDraftResponse nocDraftResponse, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i13, String str16, String str17, String str18, String str19, String str20, Integer num) {
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
        l.f(str21, "aadharauth");
        l.f(str22, "appl_no");
        l.f(str23, "fir_dt");
        l.f(str24, "fir_no");
        l.f(str25, "ins_from");
        l.f(str26, "ins_upto");
        l.f(str27, "msg");
        l.f(str28, "off_cd");
        l.f(str29, "op_dt");
        l.f(str30, "police_station");
        l.f(str31, "policy_no");
        l.f(str32, "pur_cd");
        l.f(str33, "rcp_dt");
        l.f(str34, "rcpt_NO");
        l.f(str15, "rcpt_amt");
        l.f(str16, "regn_no");
        l.f(str17, "state_cd");
        l.f(str18, "state_header");
        l.f(str19, "status");
        l.f(str20, "tax_mode");
        this.aadharauth = str21;
        this.appl_no = str22;
        this.channgeOfAdressDto = chaangeOfAddressStatus;
        this.comp_cd = i10;
        this.durcdto = dulicatercresponsemodle;
        this.fir_dt = str23;
        this.fir_no = str24;
        this.hpaDto = hPAResModle;
        this.hptDto = hptTerResponse;
        this.idv = i11;
        this.ins_from = str25;
        this.ins_type = i12;
        this.ins_upto = str26;
        this.msg = str27;
        this.nocDto = nocDraftResponse;
        this.off_cd = str28;
        this.op_dt = str29;
        this.police_station = str30;
        this.policy_no = str31;
        this.pur_cd = str32;
        this.rcp_dt = str33;
        this.rcpt_NO = str34;
        this.rcpt_amt = str15;
        this.reason = i13;
        this.regn_no = str16;
        this.state_cd = str17;
        this.state_header = str18;
        this.status = str19;
        this.tax_mode = str20;
        this.vh_class = num;
    }

    public static /* synthetic */ BeforePaymentRequestfinal copy$default(BeforePaymentRequestfinal beforePaymentRequestfinal, String str, String str2, ChaangeOfAddressStatus chaangeOfAddressStatus, int i10, dulicateRcResponseModle dulicatercresponsemodle, String str3, String str4, HPAResModle hPAResModle, HptTerResponse hptTerResponse, int i11, String str5, int i12, String str6, String str7, NocDraftResponse nocDraftResponse, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i13, String str16, String str17, String str18, String str19, String str20, Integer num, int i14, Object obj) {
        BeforePaymentRequestfinal beforePaymentRequestfinal2 = beforePaymentRequestfinal;
        int i15 = i14;
        return beforePaymentRequestfinal.copy((i15 & 1) != 0 ? beforePaymentRequestfinal2.aadharauth : str, (i15 & 2) != 0 ? beforePaymentRequestfinal2.appl_no : str2, (i15 & 4) != 0 ? beforePaymentRequestfinal2.channgeOfAdressDto : chaangeOfAddressStatus, (i15 & 8) != 0 ? beforePaymentRequestfinal2.comp_cd : i10, (i15 & 16) != 0 ? beforePaymentRequestfinal2.durcdto : dulicatercresponsemodle, (i15 & 32) != 0 ? beforePaymentRequestfinal2.fir_dt : str3, (i15 & 64) != 0 ? beforePaymentRequestfinal2.fir_no : str4, (i15 & 128) != 0 ? beforePaymentRequestfinal2.hpaDto : hPAResModle, (i15 & 256) != 0 ? beforePaymentRequestfinal2.hptDto : hptTerResponse, (i15 & 512) != 0 ? beforePaymentRequestfinal2.idv : i11, (i15 & 1024) != 0 ? beforePaymentRequestfinal2.ins_from : str5, (i15 & 2048) != 0 ? beforePaymentRequestfinal2.ins_type : i12, (i15 & 4096) != 0 ? beforePaymentRequestfinal2.ins_upto : str6, (i15 & 8192) != 0 ? beforePaymentRequestfinal2.msg : str7, (i15 & 16384) != 0 ? beforePaymentRequestfinal2.nocDto : nocDraftResponse, (i15 & 32768) != 0 ? beforePaymentRequestfinal2.off_cd : str8, (i15 & 65536) != 0 ? beforePaymentRequestfinal2.op_dt : str9, (i15 & 131072) != 0 ? beforePaymentRequestfinal2.police_station : str10, (i15 & 262144) != 0 ? beforePaymentRequestfinal2.policy_no : str11, (i15 & 524288) != 0 ? beforePaymentRequestfinal2.pur_cd : str12, (i15 & 1048576) != 0 ? beforePaymentRequestfinal2.rcp_dt : str13, (i15 & 2097152) != 0 ? beforePaymentRequestfinal2.rcpt_NO : str14, (i15 & 4194304) != 0 ? beforePaymentRequestfinal2.rcpt_amt : str15, (i15 & 8388608) != 0 ? beforePaymentRequestfinal2.reason : i13, (i15 & 16777216) != 0 ? beforePaymentRequestfinal2.regn_no : str16, (i15 & 33554432) != 0 ? beforePaymentRequestfinal2.state_cd : str17, (i15 & 67108864) != 0 ? beforePaymentRequestfinal2.state_header : str18, (i15 & 134217728) != 0 ? beforePaymentRequestfinal2.status : str19, (i15 & 268435456) != 0 ? beforePaymentRequestfinal2.tax_mode : str20, (i15 & 536870912) != 0 ? beforePaymentRequestfinal2.vh_class : num);
    }

    public final String component1() {
        return this.aadharauth;
    }

    public final int component10() {
        return this.idv;
    }

    public final String component11() {
        return this.ins_from;
    }

    public final int component12() {
        return this.ins_type;
    }

    public final String component13() {
        return this.ins_upto;
    }

    public final String component14() {
        return this.msg;
    }

    public final NocDraftResponse component15() {
        return this.nocDto;
    }

    public final String component16() {
        return this.off_cd;
    }

    public final String component17() {
        return this.op_dt;
    }

    public final String component18() {
        return this.police_station;
    }

    public final String component19() {
        return this.policy_no;
    }

    public final String component2() {
        return this.appl_no;
    }

    public final String component20() {
        return this.pur_cd;
    }

    public final String component21() {
        return this.rcp_dt;
    }

    public final String component22() {
        return this.rcpt_NO;
    }

    public final String component23() {
        return this.rcpt_amt;
    }

    public final int component24() {
        return this.reason;
    }

    public final String component25() {
        return this.regn_no;
    }

    public final String component26() {
        return this.state_cd;
    }

    public final String component27() {
        return this.state_header;
    }

    public final String component28() {
        return this.status;
    }

    public final String component29() {
        return this.tax_mode;
    }

    public final ChaangeOfAddressStatus component3() {
        return this.channgeOfAdressDto;
    }

    public final Integer component30() {
        return this.vh_class;
    }

    public final int component4() {
        return this.comp_cd;
    }

    public final dulicateRcResponseModle component5() {
        return this.durcdto;
    }

    public final String component6() {
        return this.fir_dt;
    }

    public final String component7() {
        return this.fir_no;
    }

    public final HPAResModle component8() {
        return this.hpaDto;
    }

    public final HptTerResponse component9() {
        return this.hptDto;
    }

    public final BeforePaymentRequestfinal copy(String str, String str2, ChaangeOfAddressStatus chaangeOfAddressStatus, int i10, dulicateRcResponseModle dulicatercresponsemodle, String str3, String str4, HPAResModle hPAResModle, HptTerResponse hptTerResponse, int i11, String str5, int i12, String str6, String str7, NocDraftResponse nocDraftResponse, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i13, String str16, String str17, String str18, String str19, String str20, Integer num) {
        String str21 = str;
        l.f(str21, "aadharauth");
        l.f(str2, "appl_no");
        l.f(str3, "fir_dt");
        l.f(str4, "fir_no");
        l.f(str5, "ins_from");
        l.f(str6, "ins_upto");
        l.f(str7, "msg");
        l.f(str8, "off_cd");
        l.f(str9, "op_dt");
        l.f(str10, "police_station");
        l.f(str11, "policy_no");
        l.f(str12, "pur_cd");
        l.f(str13, "rcp_dt");
        l.f(str14, "rcpt_NO");
        l.f(str15, "rcpt_amt");
        l.f(str16, "regn_no");
        l.f(str17, "state_cd");
        l.f(str18, "state_header");
        l.f(str19, "status");
        l.f(str20, "tax_mode");
        return new BeforePaymentRequestfinal(str21, str2, chaangeOfAddressStatus, i10, dulicatercresponsemodle, str3, str4, hPAResModle, hptTerResponse, i11, str5, i12, str6, str7, nocDraftResponse, str8, str9, str10, str11, str12, str13, str14, str15, i13, str16, str17, str18, str19, str20, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeforePaymentRequestfinal)) {
            return false;
        }
        BeforePaymentRequestfinal beforePaymentRequestfinal = (BeforePaymentRequestfinal) obj;
        return l.a(this.aadharauth, beforePaymentRequestfinal.aadharauth) && l.a(this.appl_no, beforePaymentRequestfinal.appl_no) && l.a(this.channgeOfAdressDto, beforePaymentRequestfinal.channgeOfAdressDto) && this.comp_cd == beforePaymentRequestfinal.comp_cd && l.a(this.durcdto, beforePaymentRequestfinal.durcdto) && l.a(this.fir_dt, beforePaymentRequestfinal.fir_dt) && l.a(this.fir_no, beforePaymentRequestfinal.fir_no) && l.a(this.hpaDto, beforePaymentRequestfinal.hpaDto) && l.a(this.hptDto, beforePaymentRequestfinal.hptDto) && this.idv == beforePaymentRequestfinal.idv && l.a(this.ins_from, beforePaymentRequestfinal.ins_from) && this.ins_type == beforePaymentRequestfinal.ins_type && l.a(this.ins_upto, beforePaymentRequestfinal.ins_upto) && l.a(this.msg, beforePaymentRequestfinal.msg) && l.a(this.nocDto, beforePaymentRequestfinal.nocDto) && l.a(this.off_cd, beforePaymentRequestfinal.off_cd) && l.a(this.op_dt, beforePaymentRequestfinal.op_dt) && l.a(this.police_station, beforePaymentRequestfinal.police_station) && l.a(this.policy_no, beforePaymentRequestfinal.policy_no) && l.a(this.pur_cd, beforePaymentRequestfinal.pur_cd) && l.a(this.rcp_dt, beforePaymentRequestfinal.rcp_dt) && l.a(this.rcpt_NO, beforePaymentRequestfinal.rcpt_NO) && l.a(this.rcpt_amt, beforePaymentRequestfinal.rcpt_amt) && this.reason == beforePaymentRequestfinal.reason && l.a(this.regn_no, beforePaymentRequestfinal.regn_no) && l.a(this.state_cd, beforePaymentRequestfinal.state_cd) && l.a(this.state_header, beforePaymentRequestfinal.state_header) && l.a(this.status, beforePaymentRequestfinal.status) && l.a(this.tax_mode, beforePaymentRequestfinal.tax_mode) && l.a(this.vh_class, beforePaymentRequestfinal.vh_class);
    }

    public final String getAadharauth() {
        return this.aadharauth;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final ChaangeOfAddressStatus getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final int getComp_cd() {
        return this.comp_cd;
    }

    public final dulicateRcResponseModle getDurcdto() {
        return this.durcdto;
    }

    public final String getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
        return this.fir_no;
    }

    public final HPAResModle getHpaDto() {
        return this.hpaDto;
    }

    public final HptTerResponse getHptDto() {
        return this.hptDto;
    }

    public final int getIdv() {
        return this.idv;
    }

    public final String getIns_from() {
        return this.ins_from;
    }

    public final int getIns_type() {
        return this.ins_type;
    }

    public final String getIns_upto() {
        return this.ins_upto;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final NocDraftResponse getNocDto() {
        return this.nocDto;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getPolice_station() {
        return this.police_station;
    }

    public final String getPolicy_no() {
        return this.policy_no;
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final String getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final int getReason() {
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

    public final Integer getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        int hashCode = ((this.aadharauth.hashCode() * 31) + this.appl_no.hashCode()) * 31;
        ChaangeOfAddressStatus chaangeOfAddressStatus = this.channgeOfAdressDto;
        int i10 = 0;
        int hashCode2 = (((hashCode + (chaangeOfAddressStatus == null ? 0 : chaangeOfAddressStatus.hashCode())) * 31) + Integer.hashCode(this.comp_cd)) * 31;
        dulicateRcResponseModle dulicatercresponsemodle = this.durcdto;
        int hashCode3 = (((((hashCode2 + (dulicatercresponsemodle == null ? 0 : dulicatercresponsemodle.hashCode())) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31;
        HPAResModle hPAResModle = this.hpaDto;
        int hashCode4 = (hashCode3 + (hPAResModle == null ? 0 : hPAResModle.hashCode())) * 31;
        HptTerResponse hptTerResponse = this.hptDto;
        int hashCode5 = (((((((((((hashCode4 + (hptTerResponse == null ? 0 : hptTerResponse.hashCode())) * 31) + Integer.hashCode(this.idv)) * 31) + this.ins_from.hashCode()) * 31) + Integer.hashCode(this.ins_type)) * 31) + this.ins_upto.hashCode()) * 31) + this.msg.hashCode()) * 31;
        NocDraftResponse nocDraftResponse = this.nocDto;
        int hashCode6 = (((((((((((((((((((((((((((((hashCode5 + (nocDraftResponse == null ? 0 : nocDraftResponse.hashCode())) * 31) + this.off_cd.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + this.pur_cd.hashCode()) * 31) + this.rcp_dt.hashCode()) * 31) + this.rcpt_NO.hashCode()) * 31) + this.rcpt_amt.hashCode()) * 31) + Integer.hashCode(this.reason)) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31;
        Integer num = this.vh_class;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        return "BeforePaymentRequestfinal(aadharauth=" + this.aadharauth + ", appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", comp_cd=" + this.comp_cd + ", durcdto=" + this.durcdto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", nocDto=" + this.nocDto + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ')';
    }
}
