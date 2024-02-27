package com.nic.mparivahan.VahanServices.VahanPaymentModel;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DataX;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPRequestModel;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import java.io.Serializable;

@Keep
public final class BeforePayReq implements Serializable {
    private final String aadhaartxno;
    private final String aadharauth;
    private final String appl_no;
    private final ChaangeOfAddressStatus channgeOfAdressDto;
    private final int comp_cd;
    private final DataX dupPermitDto;
    private final DuplicateFitessDraft dupfitDto;
    private final dulicateRcResponseModle durcdto;
    private final String fir_dt;
    private final String fir_no;
    private final HPAResModle hpaDto;
    private final HptTerResponse hptDto;
    private final int idv;
    private final String ins_from;
    private final int ins_type;
    private final String ins_upto;
    private final MFPRequestModel miscellaneousDto;
    private final String msg;
    private final NocDraftResponse nocDto;
    private final String off_cd;
    private final String op_dt;
    private final Data permitHomeAuthdto;
    private final String police_station;
    private final String policy_no;
    private final String pur_cd;
    private final com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data rcCanceldto;
    private final com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data rcReleaseDto;
    private final com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data rcSurrenderdto;
    private final String rcp_dt;
    private final String rcpt_NO;
    private final double rcpt_amt;
    private final int reason;
    private final String regn_no;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data tempPermitdto;
    private final Integer vh_class;

    public BeforePayReq(String str, String str2, ChaangeOfAddressStatus chaangeOfAddressStatus, int i10, dulicateRcResponseModle dulicatercresponsemodle, String str3, String str4, HPAResModle hPAResModle, HptTerResponse hptTerResponse, int i11, String str5, int i12, String str6, String str7, NocDraftResponse nocDraftResponse, String str8, String str9, String str10, String str11, String str12, String str13, String str14, double d10, int i13, String str15, String str16, String str17, String str18, String str19, Integer num, DuplicateFitessDraft duplicateFitessDraft, com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data data, com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2, DataX dataX, com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data3, Data data4, String str20, com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data5, MFPRequestModel mFPRequestModel) {
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
        l.f(str15, "regn_no");
        l.f(str16, "state_cd");
        l.f(str17, "state_header");
        l.f(str18, "status");
        l.f(str19, "tax_mode");
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
        this.rcpt_amt = d10;
        this.reason = i13;
        this.regn_no = str15;
        this.state_cd = str16;
        this.state_header = str17;
        this.status = str18;
        this.tax_mode = str19;
        this.vh_class = num;
        this.dupfitDto = duplicateFitessDraft;
        this.rcCanceldto = data;
        this.rcSurrenderdto = data2;
        this.dupPermitDto = dataX;
        this.rcReleaseDto = data3;
        this.permitHomeAuthdto = data4;
        this.aadhaartxno = str20;
        this.tempPermitdto = data5;
        this.miscellaneousDto = mFPRequestModel;
    }

    public static /* synthetic */ BeforePayReq copy$default(BeforePayReq beforePayReq, String str, String str2, ChaangeOfAddressStatus chaangeOfAddressStatus, int i10, dulicateRcResponseModle dulicatercresponsemodle, String str3, String str4, HPAResModle hPAResModle, HptTerResponse hptTerResponse, int i11, String str5, int i12, String str6, String str7, NocDraftResponse nocDraftResponse, String str8, String str9, String str10, String str11, String str12, String str13, String str14, double d10, int i13, String str15, String str16, String str17, String str18, String str19, Integer num, DuplicateFitessDraft duplicateFitessDraft, com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data data, com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2, DataX dataX, com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data3, Data data4, String str20, com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data5, MFPRequestModel mFPRequestModel, int i14, int i15, Object obj) {
        BeforePayReq beforePayReq2 = beforePayReq;
        int i16 = i14;
        return beforePayReq.copy((i16 & 1) != 0 ? beforePayReq2.aadharauth : str, (i16 & 2) != 0 ? beforePayReq2.appl_no : str2, (i16 & 4) != 0 ? beforePayReq2.channgeOfAdressDto : chaangeOfAddressStatus, (i16 & 8) != 0 ? beforePayReq2.comp_cd : i10, (i16 & 16) != 0 ? beforePayReq2.durcdto : dulicatercresponsemodle, (i16 & 32) != 0 ? beforePayReq2.fir_dt : str3, (i16 & 64) != 0 ? beforePayReq2.fir_no : str4, (i16 & 128) != 0 ? beforePayReq2.hpaDto : hPAResModle, (i16 & 256) != 0 ? beforePayReq2.hptDto : hptTerResponse, (i16 & 512) != 0 ? beforePayReq2.idv : i11, (i16 & 1024) != 0 ? beforePayReq2.ins_from : str5, (i16 & 2048) != 0 ? beforePayReq2.ins_type : i12, (i16 & 4096) != 0 ? beforePayReq2.ins_upto : str6, (i16 & 8192) != 0 ? beforePayReq2.msg : str7, (i16 & 16384) != 0 ? beforePayReq2.nocDto : nocDraftResponse, (i16 & 32768) != 0 ? beforePayReq2.off_cd : str8, (i16 & 65536) != 0 ? beforePayReq2.op_dt : str9, (i16 & 131072) != 0 ? beforePayReq2.police_station : str10, (i16 & 262144) != 0 ? beforePayReq2.policy_no : str11, (i16 & 524288) != 0 ? beforePayReq2.pur_cd : str12, (i16 & 1048576) != 0 ? beforePayReq2.rcp_dt : str13, (i16 & 2097152) != 0 ? beforePayReq2.rcpt_NO : str14, (i16 & 4194304) != 0 ? beforePayReq2.rcpt_amt : d10, (i16 & 8388608) != 0 ? beforePayReq2.reason : i13, (16777216 & i16) != 0 ? beforePayReq2.regn_no : str15, (i16 & 33554432) != 0 ? beforePayReq2.state_cd : str16, (i16 & 67108864) != 0 ? beforePayReq2.state_header : str17, (i16 & 134217728) != 0 ? beforePayReq2.status : str18, (i16 & 268435456) != 0 ? beforePayReq2.tax_mode : str19, (i16 & 536870912) != 0 ? beforePayReq2.vh_class : num, (i16 & 1073741824) != 0 ? beforePayReq2.dupfitDto : duplicateFitessDraft, (i16 & Integer.MIN_VALUE) != 0 ? beforePayReq2.rcCanceldto : data, (i15 & 1) != 0 ? beforePayReq2.rcSurrenderdto : data2, (i15 & 2) != 0 ? beforePayReq2.dupPermitDto : dataX, (i15 & 4) != 0 ? beforePayReq2.rcReleaseDto : data3, (i15 & 8) != 0 ? beforePayReq2.permitHomeAuthdto : data4, (i15 & 16) != 0 ? beforePayReq2.aadhaartxno : str20, (i15 & 32) != 0 ? beforePayReq2.tempPermitdto : data5, (i15 & 64) != 0 ? beforePayReq2.miscellaneousDto : mFPRequestModel);
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

    public final double component23() {
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

    public final DuplicateFitessDraft component31() {
        return this.dupfitDto;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data component32() {
        return this.rcCanceldto;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data component33() {
        return this.rcSurrenderdto;
    }

    public final DataX component34() {
        return this.dupPermitDto;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data component35() {
        return this.rcReleaseDto;
    }

    public final Data component36() {
        return this.permitHomeAuthdto;
    }

    public final String component37() {
        return this.aadhaartxno;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data component38() {
        return this.tempPermitdto;
    }

    public final MFPRequestModel component39() {
        return this.miscellaneousDto;
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

    public final BeforePayReq copy(String str, String str2, ChaangeOfAddressStatus chaangeOfAddressStatus, int i10, dulicateRcResponseModle dulicatercresponsemodle, String str3, String str4, HPAResModle hPAResModle, HptTerResponse hptTerResponse, int i11, String str5, int i12, String str6, String str7, NocDraftResponse nocDraftResponse, String str8, String str9, String str10, String str11, String str12, String str13, String str14, double d10, int i13, String str15, String str16, String str17, String str18, String str19, Integer num, DuplicateFitessDraft duplicateFitessDraft, com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data data, com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2, DataX dataX, com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data3, Data data4, String str20, com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data5, MFPRequestModel mFPRequestModel) {
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
        l.f(str15, "regn_no");
        l.f(str16, "state_cd");
        l.f(str17, "state_header");
        l.f(str18, "status");
        l.f(str19, "tax_mode");
        return new BeforePayReq(str21, str2, chaangeOfAddressStatus, i10, dulicatercresponsemodle, str3, str4, hPAResModle, hptTerResponse, i11, str5, i12, str6, str7, nocDraftResponse, str8, str9, str10, str11, str12, str13, str14, d10, i13, str15, str16, str17, str18, str19, num, duplicateFitessDraft, data, data2, dataX, data3, data4, str20, data5, mFPRequestModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeforePayReq)) {
            return false;
        }
        BeforePayReq beforePayReq = (BeforePayReq) obj;
        return l.a(this.aadharauth, beforePayReq.aadharauth) && l.a(this.appl_no, beforePayReq.appl_no) && l.a(this.channgeOfAdressDto, beforePayReq.channgeOfAdressDto) && this.comp_cd == beforePayReq.comp_cd && l.a(this.durcdto, beforePayReq.durcdto) && l.a(this.fir_dt, beforePayReq.fir_dt) && l.a(this.fir_no, beforePayReq.fir_no) && l.a(this.hpaDto, beforePayReq.hpaDto) && l.a(this.hptDto, beforePayReq.hptDto) && this.idv == beforePayReq.idv && l.a(this.ins_from, beforePayReq.ins_from) && this.ins_type == beforePayReq.ins_type && l.a(this.ins_upto, beforePayReq.ins_upto) && l.a(this.msg, beforePayReq.msg) && l.a(this.nocDto, beforePayReq.nocDto) && l.a(this.off_cd, beforePayReq.off_cd) && l.a(this.op_dt, beforePayReq.op_dt) && l.a(this.police_station, beforePayReq.police_station) && l.a(this.policy_no, beforePayReq.policy_no) && l.a(this.pur_cd, beforePayReq.pur_cd) && l.a(this.rcp_dt, beforePayReq.rcp_dt) && l.a(this.rcpt_NO, beforePayReq.rcpt_NO) && Double.compare(this.rcpt_amt, beforePayReq.rcpt_amt) == 0 && this.reason == beforePayReq.reason && l.a(this.regn_no, beforePayReq.regn_no) && l.a(this.state_cd, beforePayReq.state_cd) && l.a(this.state_header, beforePayReq.state_header) && l.a(this.status, beforePayReq.status) && l.a(this.tax_mode, beforePayReq.tax_mode) && l.a(this.vh_class, beforePayReq.vh_class) && l.a(this.dupfitDto, beforePayReq.dupfitDto) && l.a(this.rcCanceldto, beforePayReq.rcCanceldto) && l.a(this.rcSurrenderdto, beforePayReq.rcSurrenderdto) && l.a(this.dupPermitDto, beforePayReq.dupPermitDto) && l.a(this.rcReleaseDto, beforePayReq.rcReleaseDto) && l.a(this.permitHomeAuthdto, beforePayReq.permitHomeAuthdto) && l.a(this.aadhaartxno, beforePayReq.aadhaartxno) && l.a(this.tempPermitdto, beforePayReq.tempPermitdto) && l.a(this.miscellaneousDto, beforePayReq.miscellaneousDto);
    }

    public final String getAadhaartxno() {
        return this.aadhaartxno;
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

    public final DataX getDupPermitDto() {
        return this.dupPermitDto;
    }

    public final DuplicateFitessDraft getDupfitDto() {
        return this.dupfitDto;
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

    public final MFPRequestModel getMiscellaneousDto() {
        return this.miscellaneousDto;
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

    public final Data getPermitHomeAuthdto() {
        return this.permitHomeAuthdto;
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

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data getRcCanceldto() {
        return this.rcCanceldto;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data getRcReleaseDto() {
        return this.rcReleaseDto;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data getRcSurrenderdto() {
        return this.rcSurrenderdto;
    }

    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final double getRcpt_amt() {
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

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data getTempPermitdto() {
        return this.tempPermitdto;
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
        int hashCode6 = (((((((((((((((((((((((((((((hashCode5 + (nocDraftResponse == null ? 0 : nocDraftResponse.hashCode())) * 31) + this.off_cd.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + this.pur_cd.hashCode()) * 31) + this.rcp_dt.hashCode()) * 31) + this.rcpt_NO.hashCode()) * 31) + Double.hashCode(this.rcpt_amt)) * 31) + Integer.hashCode(this.reason)) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31;
        Integer num = this.vh_class;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        DuplicateFitessDraft duplicateFitessDraft = this.dupfitDto;
        int hashCode8 = (hashCode7 + (duplicateFitessDraft == null ? 0 : duplicateFitessDraft.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data data = this.rcCanceldto;
        int hashCode9 = (hashCode8 + (data == null ? 0 : data.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2 = this.rcSurrenderdto;
        int hashCode10 = (hashCode9 + (data2 == null ? 0 : data2.hashCode())) * 31;
        DataX dataX = this.dupPermitDto;
        int hashCode11 = (hashCode10 + (dataX == null ? 0 : dataX.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data3 = this.rcReleaseDto;
        int hashCode12 = (hashCode11 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.permitHomeAuthdto;
        int hashCode13 = (hashCode12 + (data4 == null ? 0 : data4.hashCode())) * 31;
        String str = this.aadhaartxno;
        int hashCode14 = (hashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data5 = this.tempPermitdto;
        int hashCode15 = (hashCode14 + (data5 == null ? 0 : data5.hashCode())) * 31;
        MFPRequestModel mFPRequestModel = this.miscellaneousDto;
        if (mFPRequestModel != null) {
            i10 = mFPRequestModel.hashCode();
        }
        return hashCode15 + i10;
    }

    public String toString() {
        return "BeforePayReq(aadharauth=" + this.aadharauth + ", appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", comp_cd=" + this.comp_cd + ", durcdto=" + this.durcdto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", nocDto=" + this.nocDto + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ", dupfitDto=" + this.dupfitDto + ", rcCanceldto=" + this.rcCanceldto + ", rcSurrenderdto=" + this.rcSurrenderdto + ", dupPermitDto=" + this.dupPermitDto + ", rcReleaseDto=" + this.rcReleaseDto + ", permitHomeAuthdto=" + this.permitHomeAuthdto + ", aadhaartxno=" + this.aadhaartxno + ", tempPermitdto=" + this.tempPermitdto + ", miscellaneousDto=" + this.miscellaneousDto + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeforePayReq(String str, String str2, ChaangeOfAddressStatus chaangeOfAddressStatus, int i10, dulicateRcResponseModle dulicatercresponsemodle, String str3, String str4, HPAResModle hPAResModle, HptTerResponse hptTerResponse, int i11, String str5, int i12, String str6, String str7, NocDraftResponse nocDraftResponse, String str8, String str9, String str10, String str11, String str12, String str13, String str14, double d10, int i13, String str15, String str16, String str17, String str18, String str19, Integer num, DuplicateFitessDraft duplicateFitessDraft, com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data data, com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2, DataX dataX, com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data3, Data data4, String str20, com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data5, MFPRequestModel mFPRequestModel, int i14, int i15, g gVar) {
        this(str, str2, chaangeOfAddressStatus, i10, dulicatercresponsemodle, str3, str4, hPAResModle, hptTerResponse, i11, str5, i12, str6, str7, nocDraftResponse, str8, str9, str10, str11, str12, str13, str14, d10, i13, str15, str16, str17, str18, str19, num, duplicateFitessDraft, data, data2, dataX, data3, data4, str20, data5, (i15 & 64) != 0 ? null : mFPRequestModel);
    }
}
