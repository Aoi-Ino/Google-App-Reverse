package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VtInsuranceCommonDto {
    private final Object insFrom;
    private final Object insUpto;
    private final Object ins_from;
    private final Integer ins_type;
    private final Object ins_upto;
    private final Object instyp_code;
    private final Object instypeName;
    private final String insuranceFrom;
    private final Integer insuranceType;
    private final Object insuranceUpto;
    private final String issuerName;
    private final String policyNo;
    private final String policy_no;

    public VtInsuranceCommonDto(Object obj, Object obj2, Object obj3, Integer num, Object obj4, Object obj5, Object obj6, String str, Integer num2, Object obj7, String str2, String str3, String str4) {
        this.insFrom = obj;
        this.insUpto = obj2;
        this.ins_from = obj3;
        this.ins_type = num;
        this.ins_upto = obj4;
        this.instyp_code = obj5;
        this.instypeName = obj6;
        this.insuranceFrom = str;
        this.insuranceType = num2;
        this.insuranceUpto = obj7;
        this.issuerName = str2;
        this.policyNo = str3;
        this.policy_no = str4;
    }

    public static /* synthetic */ VtInsuranceCommonDto copy$default(VtInsuranceCommonDto vtInsuranceCommonDto, Object obj, Object obj2, Object obj3, Integer num, Object obj4, Object obj5, Object obj6, String str, Integer num2, Object obj7, String str2, String str3, String str4, int i10, Object obj8) {
        VtInsuranceCommonDto vtInsuranceCommonDto2 = vtInsuranceCommonDto;
        int i11 = i10;
        return vtInsuranceCommonDto.copy((i11 & 1) != 0 ? vtInsuranceCommonDto2.insFrom : obj, (i11 & 2) != 0 ? vtInsuranceCommonDto2.insUpto : obj2, (i11 & 4) != 0 ? vtInsuranceCommonDto2.ins_from : obj3, (i11 & 8) != 0 ? vtInsuranceCommonDto2.ins_type : num, (i11 & 16) != 0 ? vtInsuranceCommonDto2.ins_upto : obj4, (i11 & 32) != 0 ? vtInsuranceCommonDto2.instyp_code : obj5, (i11 & 64) != 0 ? vtInsuranceCommonDto2.instypeName : obj6, (i11 & 128) != 0 ? vtInsuranceCommonDto2.insuranceFrom : str, (i11 & 256) != 0 ? vtInsuranceCommonDto2.insuranceType : num2, (i11 & 512) != 0 ? vtInsuranceCommonDto2.insuranceUpto : obj7, (i11 & 1024) != 0 ? vtInsuranceCommonDto2.issuerName : str2, (i11 & 2048) != 0 ? vtInsuranceCommonDto2.policyNo : str3, (i11 & 4096) != 0 ? vtInsuranceCommonDto2.policy_no : str4);
    }

    public final Object component1() {
        return this.insFrom;
    }

    public final Object component10() {
        return this.insuranceUpto;
    }

    public final String component11() {
        return this.issuerName;
    }

    public final String component12() {
        return this.policyNo;
    }

    public final String component13() {
        return this.policy_no;
    }

    public final Object component2() {
        return this.insUpto;
    }

    public final Object component3() {
        return this.ins_from;
    }

    public final Integer component4() {
        return this.ins_type;
    }

    public final Object component5() {
        return this.ins_upto;
    }

    public final Object component6() {
        return this.instyp_code;
    }

    public final Object component7() {
        return this.instypeName;
    }

    public final String component8() {
        return this.insuranceFrom;
    }

    public final Integer component9() {
        return this.insuranceType;
    }

    public final VtInsuranceCommonDto copy(Object obj, Object obj2, Object obj3, Integer num, Object obj4, Object obj5, Object obj6, String str, Integer num2, Object obj7, String str2, String str3, String str4) {
        return new VtInsuranceCommonDto(obj, obj2, obj3, num, obj4, obj5, obj6, str, num2, obj7, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtInsuranceCommonDto)) {
            return false;
        }
        VtInsuranceCommonDto vtInsuranceCommonDto = (VtInsuranceCommonDto) obj;
        return l.a(this.insFrom, vtInsuranceCommonDto.insFrom) && l.a(this.insUpto, vtInsuranceCommonDto.insUpto) && l.a(this.ins_from, vtInsuranceCommonDto.ins_from) && l.a(this.ins_type, vtInsuranceCommonDto.ins_type) && l.a(this.ins_upto, vtInsuranceCommonDto.ins_upto) && l.a(this.instyp_code, vtInsuranceCommonDto.instyp_code) && l.a(this.instypeName, vtInsuranceCommonDto.instypeName) && l.a(this.insuranceFrom, vtInsuranceCommonDto.insuranceFrom) && l.a(this.insuranceType, vtInsuranceCommonDto.insuranceType) && l.a(this.insuranceUpto, vtInsuranceCommonDto.insuranceUpto) && l.a(this.issuerName, vtInsuranceCommonDto.issuerName) && l.a(this.policyNo, vtInsuranceCommonDto.policyNo) && l.a(this.policy_no, vtInsuranceCommonDto.policy_no);
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

    public final Integer getIns_type() {
        return this.ins_type;
    }

    public final Object getIns_upto() {
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

    public final Integer getInsuranceType() {
        return this.insuranceType;
    }

    public final Object getInsuranceUpto() {
        return this.insuranceUpto;
    }

    public final String getIssuerName() {
        return this.issuerName;
    }

    public final String getPolicyNo() {
        return this.policyNo;
    }

    public final String getPolicy_no() {
        return this.policy_no;
    }

    public int hashCode() {
        Object obj = this.insFrom;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.insUpto;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.ins_from;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Integer num = this.ins_type;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj4 = this.ins_upto;
        int hashCode5 = (hashCode4 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.instyp_code;
        int hashCode6 = (hashCode5 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.instypeName;
        int hashCode7 = (hashCode6 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        String str = this.insuranceFrom;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.insuranceType;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Object obj7 = this.insuranceUpto;
        int hashCode10 = (hashCode9 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        String str2 = this.issuerName;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.policyNo;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.policy_no;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode12 + i10;
    }

    public String toString() {
        return "VtInsuranceCommonDto(insFrom=" + this.insFrom + ", insUpto=" + this.insUpto + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", instyp_code=" + this.instyp_code + ", instypeName=" + this.instypeName + ", insuranceFrom=" + this.insuranceFrom + ", insuranceType=" + this.insuranceType + ", insuranceUpto=" + this.insuranceUpto + ", issuerName=" + this.issuerName + ", policyNo=" + this.policyNo + ", policy_no=" + this.policy_no + ')';
    }
}
