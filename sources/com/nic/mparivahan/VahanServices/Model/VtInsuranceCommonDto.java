package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VtInsuranceCommonDto {
    private final Object appl_no;
    private final Integer comp_cd;
    private final Object descr;
    private final Object descr1;
    private final Object ic_code;
    private final Integer idv;
    private final Object insFrom;
    private final Object insUpto;
    private final Object ins_from;
    private final Object ins_type;
    private final long ins_upto;
    private final Object instyp_code;
    private final Object instypeName;
    private final String insuranceFrom;
    private final Object insuranceMessge;
    private final Integer insuranceType;
    private final String insuranceUpto;
    private final int issuerCd;
    private final String issuerName;
    private final Object moved_by;
    private final Object moved_on;
    private final Object op_dt;
    private final String opdt;
    private final String policyNo;
    private final String policy_no;
    private final String regnNo;
    private final Object regn_no;
    private final String vahanVerify;

    public VtInsuranceCommonDto(Object obj, Integer num, Object obj2, Object obj3, Object obj4, Integer num2, Object obj5, Object obj6, Object obj7, Object obj8, long j10, Object obj9, Object obj10, String str, Object obj11, Integer num3, String str2, int i10, String str3, Object obj12, Object obj13, Object obj14, String str4, String str5, String str6, String str7, Object obj15, String str8) {
        Object obj16 = obj12;
        Object obj17 = obj13;
        Object obj18 = obj14;
        String str9 = str4;
        l.f(obj16, "moved_by");
        l.f(obj17, "moved_on");
        l.f(obj18, "op_dt");
        l.f(str9, "opdt");
        this.appl_no = obj;
        this.comp_cd = num;
        this.descr = obj2;
        this.descr1 = obj3;
        this.ic_code = obj4;
        this.idv = num2;
        this.insFrom = obj5;
        this.insUpto = obj6;
        this.ins_from = obj7;
        this.ins_type = obj8;
        this.ins_upto = j10;
        this.instyp_code = obj9;
        this.instypeName = obj10;
        this.insuranceFrom = str;
        this.insuranceMessge = obj11;
        this.insuranceType = num3;
        this.insuranceUpto = str2;
        this.issuerCd = i10;
        this.issuerName = str3;
        this.moved_by = obj16;
        this.moved_on = obj17;
        this.op_dt = obj18;
        this.opdt = str9;
        this.policyNo = str5;
        this.policy_no = str6;
        this.regnNo = str7;
        this.regn_no = obj15;
        this.vahanVerify = str8;
    }

    public static /* synthetic */ VtInsuranceCommonDto copy$default(VtInsuranceCommonDto vtInsuranceCommonDto, Object obj, Integer num, Object obj2, Object obj3, Object obj4, Integer num2, Object obj5, Object obj6, Object obj7, Object obj8, long j10, Object obj9, Object obj10, String str, Object obj11, Integer num3, String str2, int i10, String str3, Object obj12, Object obj13, Object obj14, String str4, String str5, String str6, String str7, Object obj15, String str8, int i11, Object obj16) {
        VtInsuranceCommonDto vtInsuranceCommonDto2 = vtInsuranceCommonDto;
        int i12 = i11;
        return vtInsuranceCommonDto.copy((i12 & 1) != 0 ? vtInsuranceCommonDto2.appl_no : obj, (i12 & 2) != 0 ? vtInsuranceCommonDto2.comp_cd : num, (i12 & 4) != 0 ? vtInsuranceCommonDto2.descr : obj2, (i12 & 8) != 0 ? vtInsuranceCommonDto2.descr1 : obj3, (i12 & 16) != 0 ? vtInsuranceCommonDto2.ic_code : obj4, (i12 & 32) != 0 ? vtInsuranceCommonDto2.idv : num2, (i12 & 64) != 0 ? vtInsuranceCommonDto2.insFrom : obj5, (i12 & 128) != 0 ? vtInsuranceCommonDto2.insUpto : obj6, (i12 & 256) != 0 ? vtInsuranceCommonDto2.ins_from : obj7, (i12 & 512) != 0 ? vtInsuranceCommonDto2.ins_type : obj8, (i12 & 1024) != 0 ? vtInsuranceCommonDto2.ins_upto : j10, (i12 & 2048) != 0 ? vtInsuranceCommonDto2.instyp_code : obj9, (i12 & 4096) != 0 ? vtInsuranceCommonDto2.instypeName : obj10, (i12 & 8192) != 0 ? vtInsuranceCommonDto2.insuranceFrom : str, (i12 & 16384) != 0 ? vtInsuranceCommonDto2.insuranceMessge : obj11, (i12 & 32768) != 0 ? vtInsuranceCommonDto2.insuranceType : num3, (i12 & 65536) != 0 ? vtInsuranceCommonDto2.insuranceUpto : str2, (i12 & 131072) != 0 ? vtInsuranceCommonDto2.issuerCd : i10, (i12 & 262144) != 0 ? vtInsuranceCommonDto2.issuerName : str3, (i12 & 524288) != 0 ? vtInsuranceCommonDto2.moved_by : obj12, (i12 & 1048576) != 0 ? vtInsuranceCommonDto2.moved_on : obj13, (i12 & 2097152) != 0 ? vtInsuranceCommonDto2.op_dt : obj14, (i12 & 4194304) != 0 ? vtInsuranceCommonDto2.opdt : str4, (i12 & 8388608) != 0 ? vtInsuranceCommonDto2.policyNo : str5, (i12 & 16777216) != 0 ? vtInsuranceCommonDto2.policy_no : str6, (i12 & 33554432) != 0 ? vtInsuranceCommonDto2.regnNo : str7, (i12 & 67108864) != 0 ? vtInsuranceCommonDto2.regn_no : obj15, (i12 & 134217728) != 0 ? vtInsuranceCommonDto2.vahanVerify : str8);
    }

    public final Object component1() {
        return this.appl_no;
    }

    public final Object component10() {
        return this.ins_type;
    }

    public final long component11() {
        return this.ins_upto;
    }

    public final Object component12() {
        return this.instyp_code;
    }

    public final Object component13() {
        return this.instypeName;
    }

    public final String component14() {
        return this.insuranceFrom;
    }

    public final Object component15() {
        return this.insuranceMessge;
    }

    public final Integer component16() {
        return this.insuranceType;
    }

    public final String component17() {
        return this.insuranceUpto;
    }

    public final int component18() {
        return this.issuerCd;
    }

    public final String component19() {
        return this.issuerName;
    }

    public final Integer component2() {
        return this.comp_cd;
    }

    public final Object component20() {
        return this.moved_by;
    }

    public final Object component21() {
        return this.moved_on;
    }

    public final Object component22() {
        return this.op_dt;
    }

    public final String component23() {
        return this.opdt;
    }

    public final String component24() {
        return this.policyNo;
    }

    public final String component25() {
        return this.policy_no;
    }

    public final String component26() {
        return this.regnNo;
    }

    public final Object component27() {
        return this.regn_no;
    }

    public final String component28() {
        return this.vahanVerify;
    }

    public final Object component3() {
        return this.descr;
    }

    public final Object component4() {
        return this.descr1;
    }

    public final Object component5() {
        return this.ic_code;
    }

    public final Integer component6() {
        return this.idv;
    }

    public final Object component7() {
        return this.insFrom;
    }

    public final Object component8() {
        return this.insUpto;
    }

    public final Object component9() {
        return this.ins_from;
    }

    public final VtInsuranceCommonDto copy(Object obj, Integer num, Object obj2, Object obj3, Object obj4, Integer num2, Object obj5, Object obj6, Object obj7, Object obj8, long j10, Object obj9, Object obj10, String str, Object obj11, Integer num3, String str2, int i10, String str3, Object obj12, Object obj13, Object obj14, String str4, String str5, String str6, String str7, Object obj15, String str8) {
        Object obj16 = obj;
        l.f(obj12, "moved_by");
        l.f(obj13, "moved_on");
        l.f(obj14, "op_dt");
        l.f(str4, "opdt");
        return new VtInsuranceCommonDto(obj, num, obj2, obj3, obj4, num2, obj5, obj6, obj7, obj8, j10, obj9, obj10, str, obj11, num3, str2, i10, str3, obj12, obj13, obj14, str4, str5, str6, str7, obj15, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtInsuranceCommonDto)) {
            return false;
        }
        VtInsuranceCommonDto vtInsuranceCommonDto = (VtInsuranceCommonDto) obj;
        return l.a(this.appl_no, vtInsuranceCommonDto.appl_no) && l.a(this.comp_cd, vtInsuranceCommonDto.comp_cd) && l.a(this.descr, vtInsuranceCommonDto.descr) && l.a(this.descr1, vtInsuranceCommonDto.descr1) && l.a(this.ic_code, vtInsuranceCommonDto.ic_code) && l.a(this.idv, vtInsuranceCommonDto.idv) && l.a(this.insFrom, vtInsuranceCommonDto.insFrom) && l.a(this.insUpto, vtInsuranceCommonDto.insUpto) && l.a(this.ins_from, vtInsuranceCommonDto.ins_from) && l.a(this.ins_type, vtInsuranceCommonDto.ins_type) && this.ins_upto == vtInsuranceCommonDto.ins_upto && l.a(this.instyp_code, vtInsuranceCommonDto.instyp_code) && l.a(this.instypeName, vtInsuranceCommonDto.instypeName) && l.a(this.insuranceFrom, vtInsuranceCommonDto.insuranceFrom) && l.a(this.insuranceMessge, vtInsuranceCommonDto.insuranceMessge) && l.a(this.insuranceType, vtInsuranceCommonDto.insuranceType) && l.a(this.insuranceUpto, vtInsuranceCommonDto.insuranceUpto) && this.issuerCd == vtInsuranceCommonDto.issuerCd && l.a(this.issuerName, vtInsuranceCommonDto.issuerName) && l.a(this.moved_by, vtInsuranceCommonDto.moved_by) && l.a(this.moved_on, vtInsuranceCommonDto.moved_on) && l.a(this.op_dt, vtInsuranceCommonDto.op_dt) && l.a(this.opdt, vtInsuranceCommonDto.opdt) && l.a(this.policyNo, vtInsuranceCommonDto.policyNo) && l.a(this.policy_no, vtInsuranceCommonDto.policy_no) && l.a(this.regnNo, vtInsuranceCommonDto.regnNo) && l.a(this.regn_no, vtInsuranceCommonDto.regn_no) && l.a(this.vahanVerify, vtInsuranceCommonDto.vahanVerify);
    }

    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final Integer getComp_cd() {
        return this.comp_cd;
    }

    public final Object getDescr() {
        return this.descr;
    }

    public final Object getDescr1() {
        return this.descr1;
    }

    public final Object getIc_code() {
        return this.ic_code;
    }

    public final Integer getIdv() {
        return this.idv;
    }

    public final Object getInsFrom() {
        return this.insFrom;
    }

    public final Object getInsUpto() {
        return this.insUpto;
    }

    public final Object getIns_from() {
        return this.ins_from;
    }

    public final Object getIns_type() {
        return this.ins_type;
    }

    public final long getIns_upto() {
        return this.ins_upto;
    }

    public final Object getInstyp_code() {
        return this.instyp_code;
    }

    public final Object getInstypeName() {
        return this.instypeName;
    }

    public final String getInsuranceFrom() {
        return this.insuranceFrom;
    }

    public final Object getInsuranceMessge() {
        return this.insuranceMessge;
    }

    public final Integer getInsuranceType() {
        return this.insuranceType;
    }

    public final String getInsuranceUpto() {
        return this.insuranceUpto;
    }

    public final int getIssuerCd() {
        return this.issuerCd;
    }

    public final String getIssuerName() {
        return this.issuerName;
    }

    public final Object getMoved_by() {
        return this.moved_by;
    }

    public final Object getMoved_on() {
        return this.moved_on;
    }

    public final Object getOp_dt() {
        return this.op_dt;
    }

    public final String getOpdt() {
        return this.opdt;
    }

    public final String getPolicyNo() {
        return this.policyNo;
    }

    public final String getPolicy_no() {
        return this.policy_no;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final Object getRegn_no() {
        return this.regn_no;
    }

    public final String getVahanVerify() {
        return this.vahanVerify;
    }

    public int hashCode() {
        Object obj = this.appl_no;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Integer num = this.comp_cd;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Object obj2 = this.descr;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.descr1;
        int hashCode4 = (hashCode3 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.ic_code;
        int hashCode5 = (hashCode4 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Integer num2 = this.idv;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Object obj5 = this.insFrom;
        int hashCode7 = (hashCode6 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.insUpto;
        int hashCode8 = (hashCode7 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.ins_from;
        int hashCode9 = (hashCode8 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.ins_type;
        int hashCode10 = (((hashCode9 + (obj8 == null ? 0 : obj8.hashCode())) * 31) + Long.hashCode(this.ins_upto)) * 31;
        Object obj9 = this.instyp_code;
        int hashCode11 = (hashCode10 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        Object obj10 = this.instypeName;
        int hashCode12 = (hashCode11 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        String str = this.insuranceFrom;
        int hashCode13 = (hashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj11 = this.insuranceMessge;
        int hashCode14 = (hashCode13 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Integer num3 = this.insuranceType;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.insuranceUpto;
        int hashCode16 = (((hashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.issuerCd)) * 31;
        String str3 = this.issuerName;
        int hashCode17 = (((((((((hashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.moved_by.hashCode()) * 31) + this.moved_on.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.opdt.hashCode()) * 31;
        String str4 = this.policyNo;
        int hashCode18 = (hashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.policy_no;
        int hashCode19 = (hashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.regnNo;
        int hashCode20 = (hashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj12 = this.regn_no;
        int hashCode21 = (hashCode20 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        String str7 = this.vahanVerify;
        if (str7 != null) {
            i10 = str7.hashCode();
        }
        return hashCode21 + i10;
    }

    public String toString() {
        return "VtInsuranceCommonDto(appl_no=" + this.appl_no + ", comp_cd=" + this.comp_cd + ", descr=" + this.descr + ", descr1=" + this.descr1 + ", ic_code=" + this.ic_code + ", idv=" + this.idv + ", insFrom=" + this.insFrom + ", insUpto=" + this.insUpto + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", instyp_code=" + this.instyp_code + ", instypeName=" + this.instypeName + ", insuranceFrom=" + this.insuranceFrom + ", insuranceMessge=" + this.insuranceMessge + ", insuranceType=" + this.insuranceType + ", insuranceUpto=" + this.insuranceUpto + ", issuerCd=" + this.issuerCd + ", issuerName=" + this.issuerName + ", moved_by=" + this.moved_by + ", moved_on=" + this.moved_on + ", op_dt=" + this.op_dt + ", opdt=" + this.opdt + ", policyNo=" + this.policyNo + ", policy_no=" + this.policy_no + ", regnNo=" + this.regnNo + ", regn_no=" + this.regn_no + ", vahanVerify=" + this.vahanVerify + ')';
    }
}
