package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ValidateChassinoRes {
    private final Integer c_pincode;
    private final String c_state;
    private final String c_state_name;
    private final String chasi_no;
    private final String errorDesc;
    private final String errorcode;

    public ValidateChassinoRes(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.c_pincode = num;
        this.c_state = str;
        this.c_state_name = str2;
        this.chasi_no = str3;
        this.errorcode = str4;
        this.errorDesc = str5;
    }

    public static /* synthetic */ ValidateChassinoRes copy$default(ValidateChassinoRes validateChassinoRes, Integer num, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = validateChassinoRes.c_pincode;
        }
        if ((i10 & 2) != 0) {
            str = validateChassinoRes.c_state;
        }
        String str6 = str;
        if ((i10 & 4) != 0) {
            str2 = validateChassinoRes.c_state_name;
        }
        String str7 = str2;
        if ((i10 & 8) != 0) {
            str3 = validateChassinoRes.chasi_no;
        }
        String str8 = str3;
        if ((i10 & 16) != 0) {
            str4 = validateChassinoRes.errorcode;
        }
        String str9 = str4;
        if ((i10 & 32) != 0) {
            str5 = validateChassinoRes.errorDesc;
        }
        return validateChassinoRes.copy(num, str6, str7, str8, str9, str5);
    }

    public final Integer component1() {
        return this.c_pincode;
    }

    public final String component2() {
        return this.c_state;
    }

    public final String component3() {
        return this.c_state_name;
    }

    public final String component4() {
        return this.chasi_no;
    }

    public final String component5() {
        return this.errorcode;
    }

    public final String component6() {
        return this.errorDesc;
    }

    public final ValidateChassinoRes copy(Integer num, String str, String str2, String str3, String str4, String str5) {
        return new ValidateChassinoRes(num, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateChassinoRes)) {
            return false;
        }
        ValidateChassinoRes validateChassinoRes = (ValidateChassinoRes) obj;
        return l.a(this.c_pincode, validateChassinoRes.c_pincode) && l.a(this.c_state, validateChassinoRes.c_state) && l.a(this.c_state_name, validateChassinoRes.c_state_name) && l.a(this.chasi_no, validateChassinoRes.chasi_no) && l.a(this.errorcode, validateChassinoRes.errorcode) && l.a(this.errorDesc, validateChassinoRes.errorDesc);
    }

    public final Integer getC_pincode() {
        return this.c_pincode;
    }

    public final String getC_state() {
        return this.c_state;
    }

    public final String getC_state_name() {
        return this.c_state_name;
    }

    public final String getChasi_no() {
        return this.chasi_no;
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final String getErrorcode() {
        return this.errorcode;
    }

    public int hashCode() {
        Integer num = this.c_pincode;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.c_state;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c_state_name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chasi_no;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorcode;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.errorDesc;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        return "ValidateChassinoRes(c_pincode=" + this.c_pincode + ", c_state=" + this.c_state + ", c_state_name=" + this.c_state_name + ", chasi_no=" + this.chasi_no + ", errorcode=" + this.errorcode + ", errorDesc=" + this.errorDesc + ')';
    }
}
