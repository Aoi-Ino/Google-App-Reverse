package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class PermitDetailDto {
    private final String issue_dt;
    private final String permitType;
    private final String permitValidFrom;
    private final String permitValidUpto;
    private final Object pmt_catg_code;
    private final String pmt_no;
    private final Object pmt_type_code;
    private final Object valid_from;
    private final Object valid_upto;

    public PermitDetailDto(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2, Object obj3, Object obj4) {
        this.permitValidFrom = str;
        this.permitValidUpto = str2;
        this.issue_dt = str3;
        this.permitType = str4;
        this.pmt_no = str5;
        this.valid_from = obj;
        this.valid_upto = obj2;
        this.pmt_type_code = obj3;
        this.pmt_catg_code = obj4;
    }

    public static /* synthetic */ PermitDetailDto copy$default(PermitDetailDto permitDetailDto, String str, String str2, String str3, String str4, String str5, Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5) {
        PermitDetailDto permitDetailDto2 = permitDetailDto;
        int i11 = i10;
        return permitDetailDto.copy((i11 & 1) != 0 ? permitDetailDto2.permitValidFrom : str, (i11 & 2) != 0 ? permitDetailDto2.permitValidUpto : str2, (i11 & 4) != 0 ? permitDetailDto2.issue_dt : str3, (i11 & 8) != 0 ? permitDetailDto2.permitType : str4, (i11 & 16) != 0 ? permitDetailDto2.pmt_no : str5, (i11 & 32) != 0 ? permitDetailDto2.valid_from : obj, (i11 & 64) != 0 ? permitDetailDto2.valid_upto : obj2, (i11 & 128) != 0 ? permitDetailDto2.pmt_type_code : obj3, (i11 & 256) != 0 ? permitDetailDto2.pmt_catg_code : obj4);
    }

    public final String component1() {
        return this.permitValidFrom;
    }

    public final String component2() {
        return this.permitValidUpto;
    }

    public final String component3() {
        return this.issue_dt;
    }

    public final String component4() {
        return this.permitType;
    }

    public final String component5() {
        return this.pmt_no;
    }

    public final Object component6() {
        return this.valid_from;
    }

    public final Object component7() {
        return this.valid_upto;
    }

    public final Object component8() {
        return this.pmt_type_code;
    }

    public final Object component9() {
        return this.pmt_catg_code;
    }

    public final PermitDetailDto copy(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2, Object obj3, Object obj4) {
        return new PermitDetailDto(str, str2, str3, str4, str5, obj, obj2, obj3, obj4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermitDetailDto)) {
            return false;
        }
        PermitDetailDto permitDetailDto = (PermitDetailDto) obj;
        return l.a(this.permitValidFrom, permitDetailDto.permitValidFrom) && l.a(this.permitValidUpto, permitDetailDto.permitValidUpto) && l.a(this.issue_dt, permitDetailDto.issue_dt) && l.a(this.permitType, permitDetailDto.permitType) && l.a(this.pmt_no, permitDetailDto.pmt_no) && l.a(this.valid_from, permitDetailDto.valid_from) && l.a(this.valid_upto, permitDetailDto.valid_upto) && l.a(this.pmt_type_code, permitDetailDto.pmt_type_code) && l.a(this.pmt_catg_code, permitDetailDto.pmt_catg_code);
    }

    public final String getIssue_dt() {
        return this.issue_dt;
    }

    public final String getPermitType() {
        return this.permitType;
    }

    public final String getPermitValidFrom() {
        return this.permitValidFrom;
    }

    public final String getPermitValidUpto() {
        return this.permitValidUpto;
    }

    public final Object getPmt_catg_code() {
        return this.pmt_catg_code;
    }

    public final String getPmt_no() {
        return this.pmt_no;
    }

    public final Object getPmt_type_code() {
        return this.pmt_type_code;
    }

    public final Object getValid_from() {
        return this.valid_from;
    }

    public final Object getValid_upto() {
        return this.valid_upto;
    }

    public int hashCode() {
        String str = this.permitValidFrom;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.permitValidUpto;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issue_dt;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.permitType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pmt_no;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Object obj = this.valid_from;
        int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.valid_upto;
        int hashCode7 = (hashCode6 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.pmt_type_code;
        int hashCode8 = (hashCode7 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.pmt_catg_code;
        if (obj4 != null) {
            i10 = obj4.hashCode();
        }
        return hashCode8 + i10;
    }

    public String toString() {
        return "PermitDetailDto(permitValidFrom=" + this.permitValidFrom + ", permitValidUpto=" + this.permitValidUpto + ", issue_dt=" + this.issue_dt + ", permitType=" + this.permitType + ", pmt_no=" + this.pmt_no + ", valid_from=" + this.valid_from + ", valid_upto=" + this.valid_upto + ", pmt_type_code=" + this.pmt_type_code + ", pmt_catg_code=" + this.pmt_catg_code + ')';
    }
}
