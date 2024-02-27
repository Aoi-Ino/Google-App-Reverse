package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.NocDto;
import java.io.Serializable;

@Keep
public final class AfterPaymentResponse implements Serializable {
    private final String action_cd;
    private final String appl_no;
    private final ChaangeOfAddressStatus channgeOfAdressDto;
    private final String chassis;
    private final String comp_cd;
    private final dulicateRcResponseModle duplicateRCDto;
    private final Boolean facelesstransaction;
    private final String fir_dt;
    private final String fir_no;
    private final String flow_slno;
    private final HPAResModle hpadto;
    private final HptTerResponse hptdto;
    private final String idv;
    private final String ins_from;
    private final String ins_type;
    private final String ins_upto;
    private final String messege;
    private final NocDto nocDobj;
    private final String off_cd;
    private final String off_descr;
    private final String op_dt;
    private final String owner_name;
    private final String payment_mode;
    private final String police_station;
    private final String policy_no;
    private final String pur_cd;
    private final String rcp_dt;
    private final String rcpt_NO;
    private final Double rcpt_amt;
    private final String rcpt_dt;
    private final String reason;
    private final String regn_date;
    private final String regn_no;
    private final String response_code;
    private final String serviceDto;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String status_desc;
    private final String tax_mode;
    private final String treasury_REF_NO;
    private final String vh_class;

    public AfterPaymentResponse(String str, Boolean bool, String str2, ChaangeOfAddressStatus chaangeOfAddressStatus, String str3, String str4, dulicateRcResponseModle dulicatercresponsemodle, String str5, String str6, String str7, HPAResModle hPAResModle, HptTerResponse hptTerResponse, String str8, String str9, String str10, String str11, String str12, NocDto nocDto, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Double d10, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.action_cd = str;
        this.facelesstransaction = bool;
        this.appl_no = str2;
        this.channgeOfAdressDto = chaangeOfAddressStatus;
        this.chassis = str3;
        this.comp_cd = str4;
        this.duplicateRCDto = dulicatercresponsemodle;
        this.fir_dt = str5;
        this.fir_no = str6;
        this.flow_slno = str7;
        this.hpadto = hPAResModle;
        this.hptdto = hptTerResponse;
        this.idv = str8;
        this.ins_from = str9;
        this.ins_type = str10;
        this.ins_upto = str11;
        this.messege = str12;
        this.nocDobj = nocDto;
        this.off_cd = str13;
        this.off_descr = str14;
        this.op_dt = str15;
        this.owner_name = str16;
        this.payment_mode = str17;
        this.police_station = str18;
        this.policy_no = str19;
        this.pur_cd = str20;
        this.rcp_dt = str21;
        this.rcpt_NO = str22;
        this.rcpt_amt = d10;
        this.rcpt_dt = str23;
        this.reason = str24;
        this.regn_date = str25;
        this.regn_no = str26;
        this.response_code = str27;
        this.serviceDto = str28;
        this.state_cd = str29;
        this.state_header = str30;
        this.status = str31;
        this.status_desc = str32;
        this.tax_mode = str33;
        this.treasury_REF_NO = str34;
        this.vh_class = str35;
    }

    public static /* synthetic */ AfterPaymentResponse copy$default(AfterPaymentResponse afterPaymentResponse, String str, Boolean bool, String str2, ChaangeOfAddressStatus chaangeOfAddressStatus, String str3, String str4, dulicateRcResponseModle dulicatercresponsemodle, String str5, String str6, String str7, HPAResModle hPAResModle, HptTerResponse hptTerResponse, String str8, String str9, String str10, String str11, String str12, NocDto nocDto, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Double d10, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, int i10, int i11, Object obj) {
        AfterPaymentResponse afterPaymentResponse2 = afterPaymentResponse;
        int i12 = i10;
        int i13 = i11;
        return afterPaymentResponse.copy((i12 & 1) != 0 ? afterPaymentResponse2.action_cd : str, (i12 & 2) != 0 ? afterPaymentResponse2.facelesstransaction : bool, (i12 & 4) != 0 ? afterPaymentResponse2.appl_no : str2, (i12 & 8) != 0 ? afterPaymentResponse2.channgeOfAdressDto : chaangeOfAddressStatus, (i12 & 16) != 0 ? afterPaymentResponse2.chassis : str3, (i12 & 32) != 0 ? afterPaymentResponse2.comp_cd : str4, (i12 & 64) != 0 ? afterPaymentResponse2.duplicateRCDto : dulicatercresponsemodle, (i12 & 128) != 0 ? afterPaymentResponse2.fir_dt : str5, (i12 & 256) != 0 ? afterPaymentResponse2.fir_no : str6, (i12 & 512) != 0 ? afterPaymentResponse2.flow_slno : str7, (i12 & 1024) != 0 ? afterPaymentResponse2.hpadto : hPAResModle, (i12 & 2048) != 0 ? afterPaymentResponse2.hptdto : hptTerResponse, (i12 & 4096) != 0 ? afterPaymentResponse2.idv : str8, (i12 & 8192) != 0 ? afterPaymentResponse2.ins_from : str9, (i12 & 16384) != 0 ? afterPaymentResponse2.ins_type : str10, (i12 & 32768) != 0 ? afterPaymentResponse2.ins_upto : str11, (i12 & 65536) != 0 ? afterPaymentResponse2.messege : str12, (i12 & 131072) != 0 ? afterPaymentResponse2.nocDobj : nocDto, (i12 & 262144) != 0 ? afterPaymentResponse2.off_cd : str13, (i12 & 524288) != 0 ? afterPaymentResponse2.off_descr : str14, (i12 & 1048576) != 0 ? afterPaymentResponse2.op_dt : str15, (i12 & 2097152) != 0 ? afterPaymentResponse2.owner_name : str16, (i12 & 4194304) != 0 ? afterPaymentResponse2.payment_mode : str17, (i12 & 8388608) != 0 ? afterPaymentResponse2.police_station : str18, (i12 & 16777216) != 0 ? afterPaymentResponse2.policy_no : str19, (i12 & 33554432) != 0 ? afterPaymentResponse2.pur_cd : str20, (i12 & 67108864) != 0 ? afterPaymentResponse2.rcp_dt : str21, (i12 & 134217728) != 0 ? afterPaymentResponse2.rcpt_NO : str22, (i12 & 268435456) != 0 ? afterPaymentResponse2.rcpt_amt : d10, (i12 & 536870912) != 0 ? afterPaymentResponse2.rcpt_dt : str23, (i12 & 1073741824) != 0 ? afterPaymentResponse2.reason : str24, (i12 & Integer.MIN_VALUE) != 0 ? afterPaymentResponse2.regn_date : str25, (i13 & 1) != 0 ? afterPaymentResponse2.regn_no : str26, (i13 & 2) != 0 ? afterPaymentResponse2.response_code : str27, (i13 & 4) != 0 ? afterPaymentResponse2.serviceDto : str28, (i13 & 8) != 0 ? afterPaymentResponse2.state_cd : str29, (i13 & 16) != 0 ? afterPaymentResponse2.state_header : str30, (i13 & 32) != 0 ? afterPaymentResponse2.status : str31, (i13 & 64) != 0 ? afterPaymentResponse2.status_desc : str32, (i13 & 128) != 0 ? afterPaymentResponse2.tax_mode : str33, (i13 & 256) != 0 ? afterPaymentResponse2.treasury_REF_NO : str34, (i13 & 512) != 0 ? afterPaymentResponse2.vh_class : str35);
    }

    public final String component1() {
        return this.action_cd;
    }

    public final String component10() {
        return this.flow_slno;
    }

    public final HPAResModle component11() {
        return this.hpadto;
    }

    public final HptTerResponse component12() {
        return this.hptdto;
    }

    public final String component13() {
        return this.idv;
    }

    public final String component14() {
        return this.ins_from;
    }

    public final String component15() {
        return this.ins_type;
    }

    public final String component16() {
        return this.ins_upto;
    }

    public final String component17() {
        return this.messege;
    }

    public final NocDto component18() {
        return this.nocDobj;
    }

    public final String component19() {
        return this.off_cd;
    }

    public final Boolean component2() {
        return this.facelesstransaction;
    }

    public final String component20() {
        return this.off_descr;
    }

    public final String component21() {
        return this.op_dt;
    }

    public final String component22() {
        return this.owner_name;
    }

    public final String component23() {
        return this.payment_mode;
    }

    public final String component24() {
        return this.police_station;
    }

    public final String component25() {
        return this.policy_no;
    }

    public final String component26() {
        return this.pur_cd;
    }

    public final String component27() {
        return this.rcp_dt;
    }

    public final String component28() {
        return this.rcpt_NO;
    }

    public final Double component29() {
        return this.rcpt_amt;
    }

    public final String component3() {
        return this.appl_no;
    }

    public final String component30() {
        return this.rcpt_dt;
    }

    public final String component31() {
        return this.reason;
    }

    public final String component32() {
        return this.regn_date;
    }

    public final String component33() {
        return this.regn_no;
    }

    public final String component34() {
        return this.response_code;
    }

    public final String component35() {
        return this.serviceDto;
    }

    public final String component36() {
        return this.state_cd;
    }

    public final String component37() {
        return this.state_header;
    }

    public final String component38() {
        return this.status;
    }

    public final String component39() {
        return this.status_desc;
    }

    public final ChaangeOfAddressStatus component4() {
        return this.channgeOfAdressDto;
    }

    public final String component40() {
        return this.tax_mode;
    }

    public final String component41() {
        return this.treasury_REF_NO;
    }

    public final String component42() {
        return this.vh_class;
    }

    public final String component5() {
        return this.chassis;
    }

    public final String component6() {
        return this.comp_cd;
    }

    public final dulicateRcResponseModle component7() {
        return this.duplicateRCDto;
    }

    public final String component8() {
        return this.fir_dt;
    }

    public final String component9() {
        return this.fir_no;
    }

    public final AfterPaymentResponse copy(String str, Boolean bool, String str2, ChaangeOfAddressStatus chaangeOfAddressStatus, String str3, String str4, dulicateRcResponseModle dulicatercresponsemodle, String str5, String str6, String str7, HPAResModle hPAResModle, HptTerResponse hptTerResponse, String str8, String str9, String str10, String str11, String str12, NocDto nocDto, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Double d10, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35) {
        return new AfterPaymentResponse(str, bool, str2, chaangeOfAddressStatus, str3, str4, dulicatercresponsemodle, str5, str6, str7, hPAResModle, hptTerResponse, str8, str9, str10, str11, str12, nocDto, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, d10, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterPaymentResponse)) {
            return false;
        }
        AfterPaymentResponse afterPaymentResponse = (AfterPaymentResponse) obj;
        return l.a(this.action_cd, afterPaymentResponse.action_cd) && l.a(this.facelesstransaction, afterPaymentResponse.facelesstransaction) && l.a(this.appl_no, afterPaymentResponse.appl_no) && l.a(this.channgeOfAdressDto, afterPaymentResponse.channgeOfAdressDto) && l.a(this.chassis, afterPaymentResponse.chassis) && l.a(this.comp_cd, afterPaymentResponse.comp_cd) && l.a(this.duplicateRCDto, afterPaymentResponse.duplicateRCDto) && l.a(this.fir_dt, afterPaymentResponse.fir_dt) && l.a(this.fir_no, afterPaymentResponse.fir_no) && l.a(this.flow_slno, afterPaymentResponse.flow_slno) && l.a(this.hpadto, afterPaymentResponse.hpadto) && l.a(this.hptdto, afterPaymentResponse.hptdto) && l.a(this.idv, afterPaymentResponse.idv) && l.a(this.ins_from, afterPaymentResponse.ins_from) && l.a(this.ins_type, afterPaymentResponse.ins_type) && l.a(this.ins_upto, afterPaymentResponse.ins_upto) && l.a(this.messege, afterPaymentResponse.messege) && l.a(this.nocDobj, afterPaymentResponse.nocDobj) && l.a(this.off_cd, afterPaymentResponse.off_cd) && l.a(this.off_descr, afterPaymentResponse.off_descr) && l.a(this.op_dt, afterPaymentResponse.op_dt) && l.a(this.owner_name, afterPaymentResponse.owner_name) && l.a(this.payment_mode, afterPaymentResponse.payment_mode) && l.a(this.police_station, afterPaymentResponse.police_station) && l.a(this.policy_no, afterPaymentResponse.policy_no) && l.a(this.pur_cd, afterPaymentResponse.pur_cd) && l.a(this.rcp_dt, afterPaymentResponse.rcp_dt) && l.a(this.rcpt_NO, afterPaymentResponse.rcpt_NO) && l.a(this.rcpt_amt, afterPaymentResponse.rcpt_amt) && l.a(this.rcpt_dt, afterPaymentResponse.rcpt_dt) && l.a(this.reason, afterPaymentResponse.reason) && l.a(this.regn_date, afterPaymentResponse.regn_date) && l.a(this.regn_no, afterPaymentResponse.regn_no) && l.a(this.response_code, afterPaymentResponse.response_code) && l.a(this.serviceDto, afterPaymentResponse.serviceDto) && l.a(this.state_cd, afterPaymentResponse.state_cd) && l.a(this.state_header, afterPaymentResponse.state_header) && l.a(this.status, afterPaymentResponse.status) && l.a(this.status_desc, afterPaymentResponse.status_desc) && l.a(this.tax_mode, afterPaymentResponse.tax_mode) && l.a(this.treasury_REF_NO, afterPaymentResponse.treasury_REF_NO) && l.a(this.vh_class, afterPaymentResponse.vh_class);
    }

    public final String getAction_cd() {
        return this.action_cd;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final ChaangeOfAddressStatus getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final String getChassis() {
        return this.chassis;
    }

    public final String getComp_cd() {
        return this.comp_cd;
    }

    public final dulicateRcResponseModle getDuplicateRCDto() {
        return this.duplicateRCDto;
    }

    public final Boolean getFacelesstransaction() {
        return this.facelesstransaction;
    }

    public final String getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
        return this.fir_no;
    }

    public final String getFlow_slno() {
        return this.flow_slno;
    }

    public final HPAResModle getHpadto() {
        return this.hpadto;
    }

    public final HptTerResponse getHptdto() {
        return this.hptdto;
    }

    public final String getIdv() {
        return this.idv;
    }

    public final String getIns_from() {
        return this.ins_from;
    }

    public final String getIns_type() {
        return this.ins_type;
    }

    public final String getIns_upto() {
        return this.ins_upto;
    }

    public final String getMessege() {
        return this.messege;
    }

    public final NocDto getNocDobj() {
        return this.nocDobj;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOff_descr() {
        return this.off_descr;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getPayment_mode() {
        return this.payment_mode;
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

    public final Double getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final String getReason() {
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

    public final String getServiceDto() {
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

    public final String getTax_mode() {
        return this.tax_mode;
    }

    public final String getTreasury_REF_NO() {
        return this.treasury_REF_NO;
    }

    public final String getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        String str = this.action_cd;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.facelesstransaction;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.appl_no;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ChaangeOfAddressStatus chaangeOfAddressStatus = this.channgeOfAdressDto;
        int hashCode4 = (hashCode3 + (chaangeOfAddressStatus == null ? 0 : chaangeOfAddressStatus.hashCode())) * 31;
        String str3 = this.chassis;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.comp_cd;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        dulicateRcResponseModle dulicatercresponsemodle = this.duplicateRCDto;
        int hashCode7 = (hashCode6 + (dulicatercresponsemodle == null ? 0 : dulicatercresponsemodle.hashCode())) * 31;
        String str5 = this.fir_dt;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fir_no;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.flow_slno;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        HPAResModle hPAResModle = this.hpadto;
        int hashCode11 = (hashCode10 + (hPAResModle == null ? 0 : hPAResModle.hashCode())) * 31;
        HptTerResponse hptTerResponse = this.hptdto;
        int hashCode12 = (hashCode11 + (hptTerResponse == null ? 0 : hptTerResponse.hashCode())) * 31;
        String str8 = this.idv;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.ins_from;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.ins_type;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.ins_upto;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.messege;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        NocDto nocDto = this.nocDobj;
        int hashCode18 = (hashCode17 + (nocDto == null ? 0 : nocDto.hashCode())) * 31;
        String str13 = this.off_cd;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.off_descr;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.op_dt;
        int hashCode21 = (hashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.owner_name;
        int hashCode22 = (hashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.payment_mode;
        int hashCode23 = (hashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.police_station;
        int hashCode24 = (hashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.policy_no;
        int hashCode25 = (hashCode24 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.pur_cd;
        int hashCode26 = (hashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.rcp_dt;
        int hashCode27 = (hashCode26 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.rcpt_NO;
        int hashCode28 = (hashCode27 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Double d10 = this.rcpt_amt;
        int hashCode29 = (hashCode28 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str23 = this.rcpt_dt;
        int hashCode30 = (hashCode29 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.reason;
        int hashCode31 = (hashCode30 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.regn_date;
        int hashCode32 = (hashCode31 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.regn_no;
        int hashCode33 = (hashCode32 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.response_code;
        int hashCode34 = (hashCode33 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.serviceDto;
        int hashCode35 = (hashCode34 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.state_cd;
        int hashCode36 = (hashCode35 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.state_header;
        int hashCode37 = (hashCode36 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.status;
        int hashCode38 = (hashCode37 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.status_desc;
        int hashCode39 = (hashCode38 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.tax_mode;
        int hashCode40 = (hashCode39 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.treasury_REF_NO;
        int hashCode41 = (hashCode40 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.vh_class;
        if (str35 != null) {
            i10 = str35.hashCode();
        }
        return hashCode41 + i10;
    }

    public String toString() {
        return "AfterPaymentResponse(action_cd=" + this.action_cd + ", facelesstransaction=" + this.facelesstransaction + ", appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", chassis=" + this.chassis + ", comp_cd=" + this.comp_cd + ", duplicateRCDto=" + this.duplicateRCDto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", flow_slno=" + this.flow_slno + ", hpadto=" + this.hpadto + ", hptdto=" + this.hptdto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", messege=" + this.messege + ", nocDobj=" + this.nocDobj + ", off_cd=" + this.off_cd + ", off_descr=" + this.off_descr + ", op_dt=" + this.op_dt + ", owner_name=" + this.owner_name + ", payment_mode=" + this.payment_mode + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", rcpt_dt=" + this.rcpt_dt + ", reason=" + this.reason + ", regn_date=" + this.regn_date + ", regn_no=" + this.regn_no + ", response_code=" + this.response_code + ", serviceDto=" + this.serviceDto + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", status_desc=" + this.status_desc + ", tax_mode=" + this.tax_mode + ", treasury_REF_NO=" + this.treasury_REF_NO + ", vh_class=" + this.vh_class + ')';
    }
}
