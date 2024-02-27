package com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DataX;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import java.io.Serializable;

@Keep
public final class BeforePayForCompoundFee implements Serializable {
    private final String aadhaartxno;
    private final String aadharauth;
    private final String appl_no;
    private final boolean application_status;
    private final ChaangeOfAddressStatus channgeOfAdressDto;
    private final String chasi_no;
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
    private final Data miscellaneousDto;
    private final String msg;
    private final NocDraftResponse nocDto;
    private final Boolean nofees;
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
    private final Integer rcpt_amt;
    private final int reason;
    private final String regn_no;
    private final com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data renPermitdto;
    private final int service_charge;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data tempPermitdto;
    private final String vh_class;

    public BeforePayForCompoundFee(String str, Boolean bool, String str2, String str3, ChaangeOfAddressStatus chaangeOfAddressStatus, int i10, dulicateRcResponseModle dulicatercresponsemodle, String str4, String str5, HPAResModle hPAResModle, HptTerResponse hptTerResponse, int i11, String str6, int i12, String str7, String str8, NocDraftResponse nocDraftResponse, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, int i13, String str16, String str17, String str18, String str19, String str20, String str21, DuplicateFitessDraft duplicateFitessDraft, com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data data, com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2, DataX dataX, com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data3, Data data4, String str22, com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data5, Data data6, com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data data7, boolean z10, int i14) {
        String str23 = str2;
        String str24 = str4;
        String str25 = str5;
        String str26 = str8;
        String str27 = str9;
        String str28 = str10;
        String str29 = str11;
        String str30 = str12;
        String str31 = str13;
        String str32 = str16;
        String str33 = str17;
        String str34 = str18;
        String str35 = str19;
        String str36 = str20;
        l.f(str23, "aadharauth");
        l.f(str24, "fir_dt");
        l.f(str25, "fir_no");
        l.f(str26, "msg");
        l.f(str27, "off_cd");
        l.f(str28, "op_dt");
        l.f(str29, "police_station");
        l.f(str30, "policy_no");
        l.f(str31, "pur_cd");
        l.f(str32, "regn_no");
        l.f(str33, "state_cd");
        l.f(str34, "state_header");
        l.f(str35, "status");
        l.f(str36, "tax_mode");
        this.chasi_no = str;
        this.nofees = bool;
        this.aadharauth = str23;
        this.appl_no = str3;
        this.channgeOfAdressDto = chaangeOfAddressStatus;
        this.comp_cd = i10;
        this.durcdto = dulicatercresponsemodle;
        this.fir_dt = str24;
        this.fir_no = str25;
        this.hpaDto = hPAResModle;
        this.hptDto = hptTerResponse;
        this.idv = i11;
        this.ins_from = str6;
        this.ins_type = i12;
        this.ins_upto = str7;
        this.msg = str26;
        this.nocDto = nocDraftResponse;
        this.off_cd = str27;
        this.op_dt = str28;
        this.police_station = str29;
        this.policy_no = str30;
        this.pur_cd = str31;
        this.rcp_dt = str14;
        this.rcpt_NO = str15;
        this.rcpt_amt = num;
        this.reason = i13;
        this.regn_no = str32;
        this.state_cd = str33;
        this.state_header = str34;
        this.status = str35;
        this.tax_mode = str36;
        this.vh_class = str21;
        this.dupfitDto = duplicateFitessDraft;
        this.rcCanceldto = data;
        this.rcSurrenderdto = data2;
        this.dupPermitDto = dataX;
        this.rcReleaseDto = data3;
        this.permitHomeAuthdto = data4;
        this.aadhaartxno = str22;
        this.tempPermitdto = data5;
        this.miscellaneousDto = data6;
        this.renPermitdto = data7;
        this.application_status = z10;
        this.service_charge = i14;
    }

    public static /* synthetic */ BeforePayForCompoundFee copy$default(BeforePayForCompoundFee beforePayForCompoundFee, String str, Boolean bool, String str2, String str3, ChaangeOfAddressStatus chaangeOfAddressStatus, int i10, dulicateRcResponseModle dulicatercresponsemodle, String str4, String str5, HPAResModle hPAResModle, HptTerResponse hptTerResponse, int i11, String str6, int i12, String str7, String str8, NocDraftResponse nocDraftResponse, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, int i13, String str16, String str17, String str18, String str19, String str20, String str21, DuplicateFitessDraft duplicateFitessDraft, com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data data, com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2, DataX dataX, com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data3, Data data4, String str22, com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data5, Data data6, com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data data7, boolean z10, int i14, int i15, int i16, Object obj) {
        BeforePayForCompoundFee beforePayForCompoundFee2 = beforePayForCompoundFee;
        int i17 = i15;
        int i18 = i16;
        return beforePayForCompoundFee.copy((i17 & 1) != 0 ? beforePayForCompoundFee2.chasi_no : str, (i17 & 2) != 0 ? beforePayForCompoundFee2.nofees : bool, (i17 & 4) != 0 ? beforePayForCompoundFee2.aadharauth : str2, (i17 & 8) != 0 ? beforePayForCompoundFee2.appl_no : str3, (i17 & 16) != 0 ? beforePayForCompoundFee2.channgeOfAdressDto : chaangeOfAddressStatus, (i17 & 32) != 0 ? beforePayForCompoundFee2.comp_cd : i10, (i17 & 64) != 0 ? beforePayForCompoundFee2.durcdto : dulicatercresponsemodle, (i17 & 128) != 0 ? beforePayForCompoundFee2.fir_dt : str4, (i17 & 256) != 0 ? beforePayForCompoundFee2.fir_no : str5, (i17 & 512) != 0 ? beforePayForCompoundFee2.hpaDto : hPAResModle, (i17 & 1024) != 0 ? beforePayForCompoundFee2.hptDto : hptTerResponse, (i17 & 2048) != 0 ? beforePayForCompoundFee2.idv : i11, (i17 & 4096) != 0 ? beforePayForCompoundFee2.ins_from : str6, (i17 & 8192) != 0 ? beforePayForCompoundFee2.ins_type : i12, (i17 & 16384) != 0 ? beforePayForCompoundFee2.ins_upto : str7, (i17 & 32768) != 0 ? beforePayForCompoundFee2.msg : str8, (i17 & 65536) != 0 ? beforePayForCompoundFee2.nocDto : nocDraftResponse, (i17 & 131072) != 0 ? beforePayForCompoundFee2.off_cd : str9, (i17 & 262144) != 0 ? beforePayForCompoundFee2.op_dt : str10, (i17 & 524288) != 0 ? beforePayForCompoundFee2.police_station : str11, (i17 & 1048576) != 0 ? beforePayForCompoundFee2.policy_no : str12, (i17 & 2097152) != 0 ? beforePayForCompoundFee2.pur_cd : str13, (i17 & 4194304) != 0 ? beforePayForCompoundFee2.rcp_dt : str14, (i17 & 8388608) != 0 ? beforePayForCompoundFee2.rcpt_NO : str15, (i17 & 16777216) != 0 ? beforePayForCompoundFee2.rcpt_amt : num, (i17 & 33554432) != 0 ? beforePayForCompoundFee2.reason : i13, (i17 & 67108864) != 0 ? beforePayForCompoundFee2.regn_no : str16, (i17 & 134217728) != 0 ? beforePayForCompoundFee2.state_cd : str17, (i17 & 268435456) != 0 ? beforePayForCompoundFee2.state_header : str18, (i17 & 536870912) != 0 ? beforePayForCompoundFee2.status : str19, (i17 & 1073741824) != 0 ? beforePayForCompoundFee2.tax_mode : str20, (i17 & Integer.MIN_VALUE) != 0 ? beforePayForCompoundFee2.vh_class : str21, (i18 & 1) != 0 ? beforePayForCompoundFee2.dupfitDto : duplicateFitessDraft, (i18 & 2) != 0 ? beforePayForCompoundFee2.rcCanceldto : data, (i18 & 4) != 0 ? beforePayForCompoundFee2.rcSurrenderdto : data2, (i18 & 8) != 0 ? beforePayForCompoundFee2.dupPermitDto : dataX, (i18 & 16) != 0 ? beforePayForCompoundFee2.rcReleaseDto : data3, (i18 & 32) != 0 ? beforePayForCompoundFee2.permitHomeAuthdto : data4, (i18 & 64) != 0 ? beforePayForCompoundFee2.aadhaartxno : str22, (i18 & 128) != 0 ? beforePayForCompoundFee2.tempPermitdto : data5, (i18 & 256) != 0 ? beforePayForCompoundFee2.miscellaneousDto : data6, (i18 & 512) != 0 ? beforePayForCompoundFee2.renPermitdto : data7, (i18 & 1024) != 0 ? beforePayForCompoundFee2.application_status : z10, (i18 & 2048) != 0 ? beforePayForCompoundFee2.service_charge : i14);
    }

    public final String component1() {
        return this.chasi_no;
    }

    public final HPAResModle component10() {
        return this.hpaDto;
    }

    public final HptTerResponse component11() {
        return this.hptDto;
    }

    public final int component12() {
        return this.idv;
    }

    public final String component13() {
        return this.ins_from;
    }

    public final int component14() {
        return this.ins_type;
    }

    public final String component15() {
        return this.ins_upto;
    }

    public final String component16() {
        return this.msg;
    }

    public final NocDraftResponse component17() {
        return this.nocDto;
    }

    public final String component18() {
        return this.off_cd;
    }

    public final String component19() {
        return this.op_dt;
    }

    public final Boolean component2() {
        return this.nofees;
    }

    public final String component20() {
        return this.police_station;
    }

    public final String component21() {
        return this.policy_no;
    }

    public final String component22() {
        return this.pur_cd;
    }

    public final String component23() {
        return this.rcp_dt;
    }

    public final String component24() {
        return this.rcpt_NO;
    }

    public final Integer component25() {
        return this.rcpt_amt;
    }

    public final int component26() {
        return this.reason;
    }

    public final String component27() {
        return this.regn_no;
    }

    public final String component28() {
        return this.state_cd;
    }

    public final String component29() {
        return this.state_header;
    }

    public final String component3() {
        return this.aadharauth;
    }

    public final String component30() {
        return this.status;
    }

    public final String component31() {
        return this.tax_mode;
    }

    public final String component32() {
        return this.vh_class;
    }

    public final DuplicateFitessDraft component33() {
        return this.dupfitDto;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data component34() {
        return this.rcCanceldto;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data component35() {
        return this.rcSurrenderdto;
    }

    public final DataX component36() {
        return this.dupPermitDto;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data component37() {
        return this.rcReleaseDto;
    }

    public final Data component38() {
        return this.permitHomeAuthdto;
    }

    public final String component39() {
        return this.aadhaartxno;
    }

    public final String component4() {
        return this.appl_no;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data component40() {
        return this.tempPermitdto;
    }

    public final Data component41() {
        return this.miscellaneousDto;
    }

    public final com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data component42() {
        return this.renPermitdto;
    }

    public final boolean component43() {
        return this.application_status;
    }

    public final int component44() {
        return this.service_charge;
    }

    public final ChaangeOfAddressStatus component5() {
        return this.channgeOfAdressDto;
    }

    public final int component6() {
        return this.comp_cd;
    }

    public final dulicateRcResponseModle component7() {
        return this.durcdto;
    }

    public final String component8() {
        return this.fir_dt;
    }

    public final String component9() {
        return this.fir_no;
    }

    public final BeforePayForCompoundFee copy(String str, Boolean bool, String str2, String str3, ChaangeOfAddressStatus chaangeOfAddressStatus, int i10, dulicateRcResponseModle dulicatercresponsemodle, String str4, String str5, HPAResModle hPAResModle, HptTerResponse hptTerResponse, int i11, String str6, int i12, String str7, String str8, NocDraftResponse nocDraftResponse, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, int i13, String str16, String str17, String str18, String str19, String str20, String str21, DuplicateFitessDraft duplicateFitessDraft, com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data data, com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2, DataX dataX, com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data3, Data data4, String str22, com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data5, Data data6, com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data data7, boolean z10, int i14) {
        String str23 = str;
        l.f(str2, "aadharauth");
        l.f(str4, "fir_dt");
        l.f(str5, "fir_no");
        l.f(str8, "msg");
        l.f(str9, "off_cd");
        l.f(str10, "op_dt");
        l.f(str11, "police_station");
        l.f(str12, "policy_no");
        l.f(str13, "pur_cd");
        l.f(str16, "regn_no");
        l.f(str17, "state_cd");
        l.f(str18, "state_header");
        l.f(str19, "status");
        l.f(str20, "tax_mode");
        return new BeforePayForCompoundFee(str, bool, str2, str3, chaangeOfAddressStatus, i10, dulicatercresponsemodle, str4, str5, hPAResModle, hptTerResponse, i11, str6, i12, str7, str8, nocDraftResponse, str9, str10, str11, str12, str13, str14, str15, num, i13, str16, str17, str18, str19, str20, str21, duplicateFitessDraft, data, data2, dataX, data3, data4, str22, data5, data6, data7, z10, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeforePayForCompoundFee)) {
            return false;
        }
        BeforePayForCompoundFee beforePayForCompoundFee = (BeforePayForCompoundFee) obj;
        return l.a(this.chasi_no, beforePayForCompoundFee.chasi_no) && l.a(this.nofees, beforePayForCompoundFee.nofees) && l.a(this.aadharauth, beforePayForCompoundFee.aadharauth) && l.a(this.appl_no, beforePayForCompoundFee.appl_no) && l.a(this.channgeOfAdressDto, beforePayForCompoundFee.channgeOfAdressDto) && this.comp_cd == beforePayForCompoundFee.comp_cd && l.a(this.durcdto, beforePayForCompoundFee.durcdto) && l.a(this.fir_dt, beforePayForCompoundFee.fir_dt) && l.a(this.fir_no, beforePayForCompoundFee.fir_no) && l.a(this.hpaDto, beforePayForCompoundFee.hpaDto) && l.a(this.hptDto, beforePayForCompoundFee.hptDto) && this.idv == beforePayForCompoundFee.idv && l.a(this.ins_from, beforePayForCompoundFee.ins_from) && this.ins_type == beforePayForCompoundFee.ins_type && l.a(this.ins_upto, beforePayForCompoundFee.ins_upto) && l.a(this.msg, beforePayForCompoundFee.msg) && l.a(this.nocDto, beforePayForCompoundFee.nocDto) && l.a(this.off_cd, beforePayForCompoundFee.off_cd) && l.a(this.op_dt, beforePayForCompoundFee.op_dt) && l.a(this.police_station, beforePayForCompoundFee.police_station) && l.a(this.policy_no, beforePayForCompoundFee.policy_no) && l.a(this.pur_cd, beforePayForCompoundFee.pur_cd) && l.a(this.rcp_dt, beforePayForCompoundFee.rcp_dt) && l.a(this.rcpt_NO, beforePayForCompoundFee.rcpt_NO) && l.a(this.rcpt_amt, beforePayForCompoundFee.rcpt_amt) && this.reason == beforePayForCompoundFee.reason && l.a(this.regn_no, beforePayForCompoundFee.regn_no) && l.a(this.state_cd, beforePayForCompoundFee.state_cd) && l.a(this.state_header, beforePayForCompoundFee.state_header) && l.a(this.status, beforePayForCompoundFee.status) && l.a(this.tax_mode, beforePayForCompoundFee.tax_mode) && l.a(this.vh_class, beforePayForCompoundFee.vh_class) && l.a(this.dupfitDto, beforePayForCompoundFee.dupfitDto) && l.a(this.rcCanceldto, beforePayForCompoundFee.rcCanceldto) && l.a(this.rcSurrenderdto, beforePayForCompoundFee.rcSurrenderdto) && l.a(this.dupPermitDto, beforePayForCompoundFee.dupPermitDto) && l.a(this.rcReleaseDto, beforePayForCompoundFee.rcReleaseDto) && l.a(this.permitHomeAuthdto, beforePayForCompoundFee.permitHomeAuthdto) && l.a(this.aadhaartxno, beforePayForCompoundFee.aadhaartxno) && l.a(this.tempPermitdto, beforePayForCompoundFee.tempPermitdto) && l.a(this.miscellaneousDto, beforePayForCompoundFee.miscellaneousDto) && l.a(this.renPermitdto, beforePayForCompoundFee.renPermitdto) && this.application_status == beforePayForCompoundFee.application_status && this.service_charge == beforePayForCompoundFee.service_charge;
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

    public final boolean getApplication_status() {
        return this.application_status;
    }

    public final ChaangeOfAddressStatus getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final String getChasi_no() {
        return this.chasi_no;
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

    public final Data getMiscellaneousDto() {
        return this.miscellaneousDto;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final NocDraftResponse getNocDto() {
        return this.nocDto;
    }

    public final Boolean getNofees() {
        return this.nofees;
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

    public final Integer getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final int getReason() {
        return this.reason;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data getRenPermitdto() {
        return this.renPermitdto;
    }

    public final int getService_charge() {
        return this.service_charge;
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

    public final String getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        String str = this.chasi_no;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.nofees;
        int hashCode2 = (((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.aadharauth.hashCode()) * 31;
        String str2 = this.appl_no;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ChaangeOfAddressStatus chaangeOfAddressStatus = this.channgeOfAdressDto;
        int hashCode4 = (((hashCode3 + (chaangeOfAddressStatus == null ? 0 : chaangeOfAddressStatus.hashCode())) * 31) + Integer.hashCode(this.comp_cd)) * 31;
        dulicateRcResponseModle dulicatercresponsemodle = this.durcdto;
        int hashCode5 = (((((hashCode4 + (dulicatercresponsemodle == null ? 0 : dulicatercresponsemodle.hashCode())) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31;
        HPAResModle hPAResModle = this.hpaDto;
        int hashCode6 = (hashCode5 + (hPAResModle == null ? 0 : hPAResModle.hashCode())) * 31;
        HptTerResponse hptTerResponse = this.hptDto;
        int hashCode7 = (((hashCode6 + (hptTerResponse == null ? 0 : hptTerResponse.hashCode())) * 31) + Integer.hashCode(this.idv)) * 31;
        String str3 = this.ins_from;
        int hashCode8 = (((hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.ins_type)) * 31;
        String str4 = this.ins_upto;
        int hashCode9 = (((hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.msg.hashCode()) * 31;
        NocDraftResponse nocDraftResponse = this.nocDto;
        int hashCode10 = (((((((((((hashCode9 + (nocDraftResponse == null ? 0 : nocDraftResponse.hashCode())) * 31) + this.off_cd.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + this.pur_cd.hashCode()) * 31;
        String str5 = this.rcp_dt;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rcpt_NO;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.rcpt_amt;
        int hashCode13 = (((((((((((((hashCode12 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.reason)) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31;
        String str7 = this.vh_class;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        DuplicateFitessDraft duplicateFitessDraft = this.dupfitDto;
        int hashCode15 = (hashCode14 + (duplicateFitessDraft == null ? 0 : duplicateFitessDraft.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data data = this.rcCanceldto;
        int hashCode16 = (hashCode15 + (data == null ? 0 : data.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2 = this.rcSurrenderdto;
        int hashCode17 = (hashCode16 + (data2 == null ? 0 : data2.hashCode())) * 31;
        DataX dataX = this.dupPermitDto;
        int hashCode18 = (hashCode17 + (dataX == null ? 0 : dataX.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data3 = this.rcReleaseDto;
        int hashCode19 = (hashCode18 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.permitHomeAuthdto;
        int hashCode20 = (hashCode19 + (data4 == null ? 0 : data4.hashCode())) * 31;
        String str8 = this.aadhaartxno;
        int hashCode21 = (hashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data5 = this.tempPermitdto;
        int hashCode22 = (hashCode21 + (data5 == null ? 0 : data5.hashCode())) * 31;
        Data data6 = this.miscellaneousDto;
        int hashCode23 = (hashCode22 + (data6 == null ? 0 : data6.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data data7 = this.renPermitdto;
        if (data7 != null) {
            i10 = data7.hashCode();
        }
        int i11 = (hashCode23 + i10) * 31;
        boolean z10 = this.application_status;
        if (z10) {
            z10 = true;
        }
        return ((i11 + (z10 ? 1 : 0)) * 31) + Integer.hashCode(this.service_charge);
    }

    public String toString() {
        return "BeforePayForCompoundFee(chasi_no=" + this.chasi_no + ", nofees=" + this.nofees + ", aadharauth=" + this.aadharauth + ", appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", comp_cd=" + this.comp_cd + ", durcdto=" + this.durcdto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", nocDto=" + this.nocDto + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ", dupfitDto=" + this.dupfitDto + ", rcCanceldto=" + this.rcCanceldto + ", rcSurrenderdto=" + this.rcSurrenderdto + ", dupPermitDto=" + this.dupPermitDto + ", rcReleaseDto=" + this.rcReleaseDto + ", permitHomeAuthdto=" + this.permitHomeAuthdto + ", aadhaartxno=" + this.aadhaartxno + ", tempPermitdto=" + this.tempPermitdto + ", miscellaneousDto=" + this.miscellaneousDto + ", renPermitdto=" + this.renPermitdto + ", application_status=" + this.application_status + ", service_charge=" + this.service_charge + ')';
    }
}
