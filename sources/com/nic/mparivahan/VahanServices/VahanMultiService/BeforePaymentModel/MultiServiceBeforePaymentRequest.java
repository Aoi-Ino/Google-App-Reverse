package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Keep
public final class MultiServiceBeforePaymentRequest implements Serializable {
    private final String aadhaartxno;
    private final String aadharauth;
    private final String appl_no;
    private final boolean application_status;
    private final ChanngeOfAdressDto channgeOfAdressDto;
    private final String chasi_no;
    private final int comp_cd;
    private final Durcdto durcdto;
    private final List<Feelist> feelist;
    private final String fir_dt;
    private final String fir_no;
    private final boolean fromScheduler;
    private final HpaDto hpaDto;
    private final HptDto hptDto;
    private final int idv;
    private final String ins_from;
    private final int ins_type;
    private final String ins_upto;
    private final boolean isscheduler;
    private final String msg;
    private final MultiServiceDto multiServiceDto;
    private final boolean nofees;
    private final int off_cd;
    private final String op_dt;
    private final String police_station;
    private final String policy_no;
    private final ArrayList<Integer> purCodList;
    private final int pur_cd;
    private final String rcp_dt;
    private final String rcpt_NO;
    private final int rcpt_amt;
    private final int reason;
    private final String regn_no;
    private final int service_charge;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final TransferOwnershipDto transferOwnershipDto;
    private final Integer vh_class;

    public MultiServiceBeforePaymentRequest(String str, String str2, String str3, boolean z10, ChanngeOfAdressDto channgeOfAdressDto2, String str4, int i10, Durcdto durcdto2, List<Feelist> list, String str5, String str6, boolean z11, HpaDto hpaDto2, HptDto hptDto2, int i11, String str7, int i12, String str8, boolean z12, String str9, MultiServiceDto multiServiceDto2, boolean z13, int i13, String str10, String str11, String str12, ArrayList<Integer> arrayList, int i14, String str13, String str14, int i15, int i16, String str15, int i17, String str16, String str17, String str18, String str19, TransferOwnershipDto transferOwnershipDto2, Integer num) {
        String str20 = str4;
        String str21 = str10;
        String str22 = str11;
        String str23 = str12;
        ArrayList<Integer> arrayList2 = arrayList;
        String str24 = str15;
        l.f(str, "aadhaartxno");
        l.f(str2, "aadharauth");
        l.f(str3, "appl_no");
        l.f(str20, "chasi_no");
        l.f(str21, "op_dt");
        l.f(str22, "police_station");
        l.f(str23, "policy_no");
        l.f(arrayList2, "purCodList");
        l.f(str24, "regn_no");
        this.aadhaartxno = str;
        this.aadharauth = str2;
        this.appl_no = str3;
        this.application_status = z10;
        this.channgeOfAdressDto = channgeOfAdressDto2;
        this.chasi_no = str20;
        this.comp_cd = i10;
        this.durcdto = durcdto2;
        this.feelist = list;
        this.fir_dt = str5;
        this.fir_no = str6;
        this.fromScheduler = z11;
        this.hpaDto = hpaDto2;
        this.hptDto = hptDto2;
        this.idv = i11;
        this.ins_from = str7;
        this.ins_type = i12;
        this.ins_upto = str8;
        this.isscheduler = z12;
        this.msg = str9;
        this.multiServiceDto = multiServiceDto2;
        this.nofees = z13;
        this.off_cd = i13;
        this.op_dt = str21;
        this.police_station = str22;
        this.policy_no = str23;
        this.purCodList = arrayList2;
        this.pur_cd = i14;
        this.rcp_dt = str13;
        this.rcpt_NO = str14;
        this.rcpt_amt = i15;
        this.reason = i16;
        this.regn_no = str24;
        this.service_charge = i17;
        this.state_cd = str16;
        this.state_header = str17;
        this.status = str18;
        this.tax_mode = str19;
        this.transferOwnershipDto = transferOwnershipDto2;
        this.vh_class = num;
    }

    public static /* synthetic */ MultiServiceBeforePaymentRequest copy$default(MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest, String str, String str2, String str3, boolean z10, ChanngeOfAdressDto channgeOfAdressDto2, String str4, int i10, Durcdto durcdto2, List list, String str5, String str6, boolean z11, HpaDto hpaDto2, HptDto hptDto2, int i11, String str7, int i12, String str8, boolean z12, String str9, MultiServiceDto multiServiceDto2, boolean z13, int i13, String str10, String str11, String str12, ArrayList arrayList, int i14, String str13, String str14, int i15, int i16, String str15, int i17, String str16, String str17, String str18, String str19, TransferOwnershipDto transferOwnershipDto2, Integer num, int i18, int i19, Object obj) {
        MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest2 = multiServiceBeforePaymentRequest;
        int i20 = i18;
        int i21 = i19;
        return multiServiceBeforePaymentRequest.copy((i20 & 1) != 0 ? multiServiceBeforePaymentRequest2.aadhaartxno : str, (i20 & 2) != 0 ? multiServiceBeforePaymentRequest2.aadharauth : str2, (i20 & 4) != 0 ? multiServiceBeforePaymentRequest2.appl_no : str3, (i20 & 8) != 0 ? multiServiceBeforePaymentRequest2.application_status : z10, (i20 & 16) != 0 ? multiServiceBeforePaymentRequest2.channgeOfAdressDto : channgeOfAdressDto2, (i20 & 32) != 0 ? multiServiceBeforePaymentRequest2.chasi_no : str4, (i20 & 64) != 0 ? multiServiceBeforePaymentRequest2.comp_cd : i10, (i20 & 128) != 0 ? multiServiceBeforePaymentRequest2.durcdto : durcdto2, (i20 & 256) != 0 ? multiServiceBeforePaymentRequest2.feelist : list, (i20 & 512) != 0 ? multiServiceBeforePaymentRequest2.fir_dt : str5, (i20 & 1024) != 0 ? multiServiceBeforePaymentRequest2.fir_no : str6, (i20 & 2048) != 0 ? multiServiceBeforePaymentRequest2.fromScheduler : z11, (i20 & 4096) != 0 ? multiServiceBeforePaymentRequest2.hpaDto : hpaDto2, (i20 & 8192) != 0 ? multiServiceBeforePaymentRequest2.hptDto : hptDto2, (i20 & 16384) != 0 ? multiServiceBeforePaymentRequest2.idv : i11, (i20 & 32768) != 0 ? multiServiceBeforePaymentRequest2.ins_from : str7, (i20 & 65536) != 0 ? multiServiceBeforePaymentRequest2.ins_type : i12, (i20 & 131072) != 0 ? multiServiceBeforePaymentRequest2.ins_upto : str8, (i20 & 262144) != 0 ? multiServiceBeforePaymentRequest2.isscheduler : z12, (i20 & 524288) != 0 ? multiServiceBeforePaymentRequest2.msg : str9, (i20 & 1048576) != 0 ? multiServiceBeforePaymentRequest2.multiServiceDto : multiServiceDto2, (i20 & 2097152) != 0 ? multiServiceBeforePaymentRequest2.nofees : z13, (i20 & 4194304) != 0 ? multiServiceBeforePaymentRequest2.off_cd : i13, (i20 & 8388608) != 0 ? multiServiceBeforePaymentRequest2.op_dt : str10, (i20 & 16777216) != 0 ? multiServiceBeforePaymentRequest2.police_station : str11, (i20 & 33554432) != 0 ? multiServiceBeforePaymentRequest2.policy_no : str12, (i20 & 67108864) != 0 ? multiServiceBeforePaymentRequest2.purCodList : arrayList, (i20 & 134217728) != 0 ? multiServiceBeforePaymentRequest2.pur_cd : i14, (i20 & 268435456) != 0 ? multiServiceBeforePaymentRequest2.rcp_dt : str13, (i20 & 536870912) != 0 ? multiServiceBeforePaymentRequest2.rcpt_NO : str14, (i20 & 1073741824) != 0 ? multiServiceBeforePaymentRequest2.rcpt_amt : i15, (i20 & Integer.MIN_VALUE) != 0 ? multiServiceBeforePaymentRequest2.reason : i16, (i21 & 1) != 0 ? multiServiceBeforePaymentRequest2.regn_no : str15, (i21 & 2) != 0 ? multiServiceBeforePaymentRequest2.service_charge : i17, (i21 & 4) != 0 ? multiServiceBeforePaymentRequest2.state_cd : str16, (i21 & 8) != 0 ? multiServiceBeforePaymentRequest2.state_header : str17, (i21 & 16) != 0 ? multiServiceBeforePaymentRequest2.status : str18, (i21 & 32) != 0 ? multiServiceBeforePaymentRequest2.tax_mode : str19, (i21 & 64) != 0 ? multiServiceBeforePaymentRequest2.transferOwnershipDto : transferOwnershipDto2, (i21 & 128) != 0 ? multiServiceBeforePaymentRequest2.vh_class : num);
    }

    public final String component1() {
        return this.aadhaartxno;
    }

    public final String component10() {
        return this.fir_dt;
    }

    public final String component11() {
        return this.fir_no;
    }

    public final boolean component12() {
        return this.fromScheduler;
    }

    public final HpaDto component13() {
        return this.hpaDto;
    }

    public final HptDto component14() {
        return this.hptDto;
    }

    public final int component15() {
        return this.idv;
    }

    public final String component16() {
        return this.ins_from;
    }

    public final int component17() {
        return this.ins_type;
    }

    public final String component18() {
        return this.ins_upto;
    }

    public final boolean component19() {
        return this.isscheduler;
    }

    public final String component2() {
        return this.aadharauth;
    }

    public final String component20() {
        return this.msg;
    }

    public final MultiServiceDto component21() {
        return this.multiServiceDto;
    }

    public final boolean component22() {
        return this.nofees;
    }

    public final int component23() {
        return this.off_cd;
    }

    public final String component24() {
        return this.op_dt;
    }

    public final String component25() {
        return this.police_station;
    }

    public final String component26() {
        return this.policy_no;
    }

    public final ArrayList<Integer> component27() {
        return this.purCodList;
    }

    public final int component28() {
        return this.pur_cd;
    }

    public final String component29() {
        return this.rcp_dt;
    }

    public final String component3() {
        return this.appl_no;
    }

    public final String component30() {
        return this.rcpt_NO;
    }

    public final int component31() {
        return this.rcpt_amt;
    }

    public final int component32() {
        return this.reason;
    }

    public final String component33() {
        return this.regn_no;
    }

    public final int component34() {
        return this.service_charge;
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
        return this.tax_mode;
    }

    public final TransferOwnershipDto component39() {
        return this.transferOwnershipDto;
    }

    public final boolean component4() {
        return this.application_status;
    }

    public final Integer component40() {
        return this.vh_class;
    }

    public final ChanngeOfAdressDto component5() {
        return this.channgeOfAdressDto;
    }

    public final String component6() {
        return this.chasi_no;
    }

    public final int component7() {
        return this.comp_cd;
    }

    public final Durcdto component8() {
        return this.durcdto;
    }

    public final List<Feelist> component9() {
        return this.feelist;
    }

    public final MultiServiceBeforePaymentRequest copy(String str, String str2, String str3, boolean z10, ChanngeOfAdressDto channgeOfAdressDto2, String str4, int i10, Durcdto durcdto2, List<Feelist> list, String str5, String str6, boolean z11, HpaDto hpaDto2, HptDto hptDto2, int i11, String str7, int i12, String str8, boolean z12, String str9, MultiServiceDto multiServiceDto2, boolean z13, int i13, String str10, String str11, String str12, ArrayList<Integer> arrayList, int i14, String str13, String str14, int i15, int i16, String str15, int i17, String str16, String str17, String str18, String str19, TransferOwnershipDto transferOwnershipDto2, Integer num) {
        String str20 = str;
        l.f(str20, "aadhaartxno");
        l.f(str2, "aadharauth");
        l.f(str3, "appl_no");
        l.f(str4, "chasi_no");
        l.f(str10, "op_dt");
        l.f(str11, "police_station");
        l.f(str12, "policy_no");
        l.f(arrayList, "purCodList");
        l.f(str15, "regn_no");
        return new MultiServiceBeforePaymentRequest(str20, str2, str3, z10, channgeOfAdressDto2, str4, i10, durcdto2, list, str5, str6, z11, hpaDto2, hptDto2, i11, str7, i12, str8, z12, str9, multiServiceDto2, z13, i13, str10, str11, str12, arrayList, i14, str13, str14, i15, i16, str15, i17, str16, str17, str18, str19, transferOwnershipDto2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiServiceBeforePaymentRequest)) {
            return false;
        }
        MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest = (MultiServiceBeforePaymentRequest) obj;
        return l.a(this.aadhaartxno, multiServiceBeforePaymentRequest.aadhaartxno) && l.a(this.aadharauth, multiServiceBeforePaymentRequest.aadharauth) && l.a(this.appl_no, multiServiceBeforePaymentRequest.appl_no) && this.application_status == multiServiceBeforePaymentRequest.application_status && l.a(this.channgeOfAdressDto, multiServiceBeforePaymentRequest.channgeOfAdressDto) && l.a(this.chasi_no, multiServiceBeforePaymentRequest.chasi_no) && this.comp_cd == multiServiceBeforePaymentRequest.comp_cd && l.a(this.durcdto, multiServiceBeforePaymentRequest.durcdto) && l.a(this.feelist, multiServiceBeforePaymentRequest.feelist) && l.a(this.fir_dt, multiServiceBeforePaymentRequest.fir_dt) && l.a(this.fir_no, multiServiceBeforePaymentRequest.fir_no) && this.fromScheduler == multiServiceBeforePaymentRequest.fromScheduler && l.a(this.hpaDto, multiServiceBeforePaymentRequest.hpaDto) && l.a(this.hptDto, multiServiceBeforePaymentRequest.hptDto) && this.idv == multiServiceBeforePaymentRequest.idv && l.a(this.ins_from, multiServiceBeforePaymentRequest.ins_from) && this.ins_type == multiServiceBeforePaymentRequest.ins_type && l.a(this.ins_upto, multiServiceBeforePaymentRequest.ins_upto) && this.isscheduler == multiServiceBeforePaymentRequest.isscheduler && l.a(this.msg, multiServiceBeforePaymentRequest.msg) && l.a(this.multiServiceDto, multiServiceBeforePaymentRequest.multiServiceDto) && this.nofees == multiServiceBeforePaymentRequest.nofees && this.off_cd == multiServiceBeforePaymentRequest.off_cd && l.a(this.op_dt, multiServiceBeforePaymentRequest.op_dt) && l.a(this.police_station, multiServiceBeforePaymentRequest.police_station) && l.a(this.policy_no, multiServiceBeforePaymentRequest.policy_no) && l.a(this.purCodList, multiServiceBeforePaymentRequest.purCodList) && this.pur_cd == multiServiceBeforePaymentRequest.pur_cd && l.a(this.rcp_dt, multiServiceBeforePaymentRequest.rcp_dt) && l.a(this.rcpt_NO, multiServiceBeforePaymentRequest.rcpt_NO) && this.rcpt_amt == multiServiceBeforePaymentRequest.rcpt_amt && this.reason == multiServiceBeforePaymentRequest.reason && l.a(this.regn_no, multiServiceBeforePaymentRequest.regn_no) && this.service_charge == multiServiceBeforePaymentRequest.service_charge && l.a(this.state_cd, multiServiceBeforePaymentRequest.state_cd) && l.a(this.state_header, multiServiceBeforePaymentRequest.state_header) && l.a(this.status, multiServiceBeforePaymentRequest.status) && l.a(this.tax_mode, multiServiceBeforePaymentRequest.tax_mode) && l.a(this.transferOwnershipDto, multiServiceBeforePaymentRequest.transferOwnershipDto) && l.a(this.vh_class, multiServiceBeforePaymentRequest.vh_class);
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

    public final ChanngeOfAdressDto getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final String getChasi_no() {
        return this.chasi_no;
    }

    public final int getComp_cd() {
        return this.comp_cd;
    }

    public final Durcdto getDurcdto() {
        return this.durcdto;
    }

    public final List<Feelist> getFeelist() {
        return this.feelist;
    }

    public final String getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
        return this.fir_no;
    }

    public final boolean getFromScheduler() {
        return this.fromScheduler;
    }

    public final HpaDto getHpaDto() {
        return this.hpaDto;
    }

    public final HptDto getHptDto() {
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

    public final boolean getIsscheduler() {
        return this.isscheduler;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final MultiServiceDto getMultiServiceDto() {
        return this.multiServiceDto;
    }

    public final boolean getNofees() {
        return this.nofees;
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

    public final String getPolicy_no() {
        return this.policy_no;
    }

    public final ArrayList<Integer> getPurCodList() {
        return this.purCodList;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final int getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final int getReason() {
        return this.reason;
    }

    public final String getRegn_no() {
        return this.regn_no;
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

    public final TransferOwnershipDto getTransferOwnershipDto() {
        return this.transferOwnershipDto;
    }

    public final Integer getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        int hashCode = ((((this.aadhaartxno.hashCode() * 31) + this.aadharauth.hashCode()) * 31) + this.appl_no.hashCode()) * 31;
        boolean z10 = this.application_status;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (hashCode + (z10 ? 1 : 0)) * 31;
        ChanngeOfAdressDto channgeOfAdressDto2 = this.channgeOfAdressDto;
        int i11 = 0;
        int hashCode2 = (((((i10 + (channgeOfAdressDto2 == null ? 0 : channgeOfAdressDto2.hashCode())) * 31) + this.chasi_no.hashCode()) * 31) + Integer.hashCode(this.comp_cd)) * 31;
        Durcdto durcdto2 = this.durcdto;
        int hashCode3 = (hashCode2 + (durcdto2 == null ? 0 : durcdto2.hashCode())) * 31;
        List<Feelist> list = this.feelist;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.fir_dt;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fir_no;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z12 = this.fromScheduler;
        if (z12) {
            z12 = true;
        }
        int i12 = (hashCode6 + (z12 ? 1 : 0)) * 31;
        HpaDto hpaDto2 = this.hpaDto;
        int hashCode7 = (i12 + (hpaDto2 == null ? 0 : hpaDto2.hashCode())) * 31;
        HptDto hptDto2 = this.hptDto;
        int hashCode8 = (((hashCode7 + (hptDto2 == null ? 0 : hptDto2.hashCode())) * 31) + Integer.hashCode(this.idv)) * 31;
        String str3 = this.ins_from;
        int hashCode9 = (((hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.ins_type)) * 31;
        String str4 = this.ins_upto;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z13 = this.isscheduler;
        if (z13) {
            z13 = true;
        }
        int i13 = (hashCode10 + (z13 ? 1 : 0)) * 31;
        String str5 = this.msg;
        int hashCode11 = (i13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        MultiServiceDto multiServiceDto2 = this.multiServiceDto;
        int hashCode12 = (hashCode11 + (multiServiceDto2 == null ? 0 : multiServiceDto2.hashCode())) * 31;
        boolean z14 = this.nofees;
        if (!z14) {
            z11 = z14;
        }
        int hashCode13 = (((((((((((((hashCode12 + (z11 ? 1 : 0)) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + this.purCodList.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31;
        String str6 = this.rcp_dt;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.rcpt_NO;
        int hashCode15 = (((((((((hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31) + Integer.hashCode(this.rcpt_amt)) * 31) + Integer.hashCode(this.reason)) * 31) + this.regn_no.hashCode()) * 31) + Integer.hashCode(this.service_charge)) * 31;
        String str8 = this.state_cd;
        int hashCode16 = (hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.state_header;
        int hashCode17 = (hashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.status;
        int hashCode18 = (hashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.tax_mode;
        int hashCode19 = (hashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        TransferOwnershipDto transferOwnershipDto2 = this.transferOwnershipDto;
        int hashCode20 = (hashCode19 + (transferOwnershipDto2 == null ? 0 : transferOwnershipDto2.hashCode())) * 31;
        Integer num = this.vh_class;
        if (num != null) {
            i11 = num.hashCode();
        }
        return hashCode20 + i11;
    }

    public String toString() {
        return "MultiServiceBeforePaymentRequest(aadhaartxno=" + this.aadhaartxno + ", aadharauth=" + this.aadharauth + ", appl_no=" + this.appl_no + ", application_status=" + this.application_status + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", chasi_no=" + this.chasi_no + ", comp_cd=" + this.comp_cd + ", durcdto=" + this.durcdto + ", feelist=" + this.feelist + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", fromScheduler=" + this.fromScheduler + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", isscheduler=" + this.isscheduler + ", msg=" + this.msg + ", multiServiceDto=" + this.multiServiceDto + ", nofees=" + this.nofees + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", purCodList=" + this.purCodList + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", service_charge=" + this.service_charge + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", transferOwnershipDto=" + this.transferOwnershipDto + ", vh_class=" + this.vh_class + ')';
    }
}
