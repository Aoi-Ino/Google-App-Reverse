package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VtInsuranceCommonDtoX {
    private final Object appl_no;
    private final int comp_cd;
    private final Object descr;
    private final Object descr1;
    private final Object ic_code;
    private final int idv;
    private final long insFrom;
    private final long insUpto;
    private final long ins_from;
    private final int ins_type;
    private final long ins_upto;
    private final Object instyp_code;
    private final Object instypeName;
    private final String insuranceFrom;
    private final Object insuranceMessge;
    private final int insuranceType;
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

    public VtInsuranceCommonDtoX(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11, long j10, long j11, long j12, int i12, long j13, Object obj5, Object obj6, String str, Object obj7, int i13, String str2, int i14, String str3, Object obj8, Object obj9, Object obj10, String str4, String str5, String str6, String str7, Object obj11, String str8) {
        Object obj12 = obj;
        Object obj13 = obj2;
        Object obj14 = obj3;
        Object obj15 = obj4;
        Object obj16 = obj5;
        Object obj17 = obj6;
        String str9 = str;
        Object obj18 = obj7;
        String str10 = str2;
        String str11 = str3;
        Object obj19 = obj8;
        Object obj20 = obj9;
        Object obj21 = obj10;
        String str12 = str4;
        String str13 = str6;
        l.f(obj12, "appl_no");
        l.f(obj13, "descr");
        l.f(obj14, "descr1");
        l.f(obj15, "ic_code");
        l.f(obj16, "instyp_code");
        l.f(obj17, "instypeName");
        l.f(str9, "insuranceFrom");
        l.f(obj18, "insuranceMessge");
        l.f(str10, "insuranceUpto");
        l.f(str11, "issuerName");
        l.f(obj19, "moved_by");
        l.f(obj20, "moved_on");
        l.f(obj21, "op_dt");
        l.f(str12, "opdt");
        l.f(str5, "policyNo");
        l.f(str6, "policy_no");
        l.f(str7, "regnNo");
        l.f(obj11, "regn_no");
        l.f(str8, "vahanVerify");
        this.appl_no = obj12;
        this.comp_cd = i10;
        this.descr = obj13;
        this.descr1 = obj14;
        this.ic_code = obj15;
        this.idv = i11;
        this.insFrom = j10;
        this.insUpto = j11;
        this.ins_from = j12;
        this.ins_type = i12;
        this.ins_upto = j13;
        this.instyp_code = obj16;
        this.instypeName = obj17;
        this.insuranceFrom = str9;
        this.insuranceMessge = obj18;
        this.insuranceType = i13;
        this.insuranceUpto = str10;
        this.issuerCd = i14;
        this.issuerName = str11;
        this.moved_by = obj19;
        this.moved_on = obj20;
        this.op_dt = obj21;
        this.opdt = str12;
        this.policyNo = str5;
        this.policy_no = str6;
        this.regnNo = str7;
        this.regn_no = obj11;
        this.vahanVerify = str8;
    }

    public static /* synthetic */ VtInsuranceCommonDtoX copy$default(VtInsuranceCommonDtoX vtInsuranceCommonDtoX, Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11, long j10, long j11, long j12, int i12, long j13, Object obj5, Object obj6, String str, Object obj7, int i13, String str2, int i14, String str3, Object obj8, Object obj9, Object obj10, String str4, String str5, String str6, String str7, Object obj11, String str8, int i15, Object obj12) {
        VtInsuranceCommonDtoX vtInsuranceCommonDtoX2 = vtInsuranceCommonDtoX;
        int i16 = i15;
        return vtInsuranceCommonDtoX.copy((i16 & 1) != 0 ? vtInsuranceCommonDtoX2.appl_no : obj, (i16 & 2) != 0 ? vtInsuranceCommonDtoX2.comp_cd : i10, (i16 & 4) != 0 ? vtInsuranceCommonDtoX2.descr : obj2, (i16 & 8) != 0 ? vtInsuranceCommonDtoX2.descr1 : obj3, (i16 & 16) != 0 ? vtInsuranceCommonDtoX2.ic_code : obj4, (i16 & 32) != 0 ? vtInsuranceCommonDtoX2.idv : i11, (i16 & 64) != 0 ? vtInsuranceCommonDtoX2.insFrom : j10, (i16 & 128) != 0 ? vtInsuranceCommonDtoX2.insUpto : j11, (i16 & 256) != 0 ? vtInsuranceCommonDtoX2.ins_from : j12, (i16 & 512) != 0 ? vtInsuranceCommonDtoX2.ins_type : i12, (i16 & 1024) != 0 ? vtInsuranceCommonDtoX2.ins_upto : j13, (i16 & 2048) != 0 ? vtInsuranceCommonDtoX2.instyp_code : obj5, (i16 & 4096) != 0 ? vtInsuranceCommonDtoX2.instypeName : obj6, (i16 & 8192) != 0 ? vtInsuranceCommonDtoX2.insuranceFrom : str, (i16 & 16384) != 0 ? vtInsuranceCommonDtoX2.insuranceMessge : obj7, (i16 & 32768) != 0 ? vtInsuranceCommonDtoX2.insuranceType : i13, (i16 & 65536) != 0 ? vtInsuranceCommonDtoX2.insuranceUpto : str2, (i16 & 131072) != 0 ? vtInsuranceCommonDtoX2.issuerCd : i14, (i16 & 262144) != 0 ? vtInsuranceCommonDtoX2.issuerName : str3, (i16 & 524288) != 0 ? vtInsuranceCommonDtoX2.moved_by : obj8, (i16 & 1048576) != 0 ? vtInsuranceCommonDtoX2.moved_on : obj9, (i16 & 2097152) != 0 ? vtInsuranceCommonDtoX2.op_dt : obj10, (i16 & 4194304) != 0 ? vtInsuranceCommonDtoX2.opdt : str4, (i16 & 8388608) != 0 ? vtInsuranceCommonDtoX2.policyNo : str5, (i16 & 16777216) != 0 ? vtInsuranceCommonDtoX2.policy_no : str6, (i16 & 33554432) != 0 ? vtInsuranceCommonDtoX2.regnNo : str7, (i16 & 67108864) != 0 ? vtInsuranceCommonDtoX2.regn_no : obj11, (i16 & 134217728) != 0 ? vtInsuranceCommonDtoX2.vahanVerify : str8);
    }

    public final Object component1() {
        return this.appl_no;
    }

    public final int component10() {
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

    public final int component16() {
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

    public final int component2() {
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

    public final int component6() {
        return this.idv;
    }

    public final long component7() {
        return this.insFrom;
    }

    public final long component8() {
        return this.insUpto;
    }

    public final long component9() {
        return this.ins_from;
    }

    public final VtInsuranceCommonDtoX copy(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11, long j10, long j11, long j12, int i12, long j13, Object obj5, Object obj6, String str, Object obj7, int i13, String str2, int i14, String str3, Object obj8, Object obj9, Object obj10, String str4, String str5, String str6, String str7, Object obj11, String str8) {
        Object obj12 = obj;
        l.f(obj12, "appl_no");
        l.f(obj2, "descr");
        l.f(obj3, "descr1");
        l.f(obj4, "ic_code");
        l.f(obj5, "instyp_code");
        l.f(obj6, "instypeName");
        l.f(str, "insuranceFrom");
        l.f(obj7, "insuranceMessge");
        l.f(str2, "insuranceUpto");
        l.f(str3, "issuerName");
        l.f(obj8, "moved_by");
        l.f(obj9, "moved_on");
        l.f(obj10, "op_dt");
        l.f(str4, "opdt");
        l.f(str5, "policyNo");
        l.f(str6, "policy_no");
        l.f(str7, "regnNo");
        l.f(obj11, "regn_no");
        l.f(str8, "vahanVerify");
        return new VtInsuranceCommonDtoX(obj12, i10, obj2, obj3, obj4, i11, j10, j11, j12, i12, j13, obj5, obj6, str, obj7, i13, str2, i14, str3, obj8, obj9, obj10, str4, str5, str6, str7, obj11, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtInsuranceCommonDtoX)) {
            return false;
        }
        VtInsuranceCommonDtoX vtInsuranceCommonDtoX = (VtInsuranceCommonDtoX) obj;
        return l.a(this.appl_no, vtInsuranceCommonDtoX.appl_no) && this.comp_cd == vtInsuranceCommonDtoX.comp_cd && l.a(this.descr, vtInsuranceCommonDtoX.descr) && l.a(this.descr1, vtInsuranceCommonDtoX.descr1) && l.a(this.ic_code, vtInsuranceCommonDtoX.ic_code) && this.idv == vtInsuranceCommonDtoX.idv && this.insFrom == vtInsuranceCommonDtoX.insFrom && this.insUpto == vtInsuranceCommonDtoX.insUpto && this.ins_from == vtInsuranceCommonDtoX.ins_from && this.ins_type == vtInsuranceCommonDtoX.ins_type && this.ins_upto == vtInsuranceCommonDtoX.ins_upto && l.a(this.instyp_code, vtInsuranceCommonDtoX.instyp_code) && l.a(this.instypeName, vtInsuranceCommonDtoX.instypeName) && l.a(this.insuranceFrom, vtInsuranceCommonDtoX.insuranceFrom) && l.a(this.insuranceMessge, vtInsuranceCommonDtoX.insuranceMessge) && this.insuranceType == vtInsuranceCommonDtoX.insuranceType && l.a(this.insuranceUpto, vtInsuranceCommonDtoX.insuranceUpto) && this.issuerCd == vtInsuranceCommonDtoX.issuerCd && l.a(this.issuerName, vtInsuranceCommonDtoX.issuerName) && l.a(this.moved_by, vtInsuranceCommonDtoX.moved_by) && l.a(this.moved_on, vtInsuranceCommonDtoX.moved_on) && l.a(this.op_dt, vtInsuranceCommonDtoX.op_dt) && l.a(this.opdt, vtInsuranceCommonDtoX.opdt) && l.a(this.policyNo, vtInsuranceCommonDtoX.policyNo) && l.a(this.policy_no, vtInsuranceCommonDtoX.policy_no) && l.a(this.regnNo, vtInsuranceCommonDtoX.regnNo) && l.a(this.regn_no, vtInsuranceCommonDtoX.regn_no) && l.a(this.vahanVerify, vtInsuranceCommonDtoX.vahanVerify);
    }

    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final int getComp_cd() {
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

    public final int getIdv() {
        return this.idv;
    }

    public final long getInsFrom() {
        return this.insFrom;
    }

    public final long getInsUpto() {
        return this.insUpto;
    }

    public final long getIns_from() {
        return this.ins_from;
    }

    public final int getIns_type() {
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

    public final int getInsuranceType() {
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((this.appl_no.hashCode() * 31) + Integer.hashCode(this.comp_cd)) * 31) + this.descr.hashCode()) * 31) + this.descr1.hashCode()) * 31) + this.ic_code.hashCode()) * 31) + Integer.hashCode(this.idv)) * 31) + Long.hashCode(this.insFrom)) * 31) + Long.hashCode(this.insUpto)) * 31) + Long.hashCode(this.ins_from)) * 31) + Integer.hashCode(this.ins_type)) * 31) + Long.hashCode(this.ins_upto)) * 31) + this.instyp_code.hashCode()) * 31) + this.instypeName.hashCode()) * 31) + this.insuranceFrom.hashCode()) * 31) + this.insuranceMessge.hashCode()) * 31) + Integer.hashCode(this.insuranceType)) * 31) + this.insuranceUpto.hashCode()) * 31) + Integer.hashCode(this.issuerCd)) * 31) + this.issuerName.hashCode()) * 31) + this.moved_by.hashCode()) * 31) + this.moved_on.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.opdt.hashCode()) * 31) + this.policyNo.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.vahanVerify.hashCode();
    }

    public String toString() {
        return "VtInsuranceCommonDtoX(appl_no=" + this.appl_no + ", comp_cd=" + this.comp_cd + ", descr=" + this.descr + ", descr1=" + this.descr1 + ", ic_code=" + this.ic_code + ", idv=" + this.idv + ", insFrom=" + this.insFrom + ", insUpto=" + this.insUpto + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", instyp_code=" + this.instyp_code + ", instypeName=" + this.instypeName + ", insuranceFrom=" + this.insuranceFrom + ", insuranceMessge=" + this.insuranceMessge + ", insuranceType=" + this.insuranceType + ", insuranceUpto=" + this.insuranceUpto + ", issuerCd=" + this.issuerCd + ", issuerName=" + this.issuerName + ", moved_by=" + this.moved_by + ", moved_on=" + this.moved_on + ", op_dt=" + this.op_dt + ", opdt=" + this.opdt + ", policyNo=" + this.policyNo + ", policy_no=" + this.policy_no + ", regnNo=" + this.regnNo + ", regn_no=" + this.regn_no + ", vahanVerify=" + this.vahanVerify + ')';
    }
}
