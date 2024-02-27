package com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DOAuthOTP {
    private final String actionErrorCode;
    private final String email;
    private final String errorCode;
    private final String last_four_mobile;
    private final boolean mobileverify;
    private final String reason;
    private final String status;
    private final String uidtkn;

    public DOAuthOTP(String str, String str2, String str3, String str4, boolean z10, String str5, String str6, String str7) {
        this.actionErrorCode = str;
        this.email = str2;
        this.errorCode = str3;
        this.last_four_mobile = str4;
        this.mobileverify = z10;
        this.reason = str5;
        this.status = str6;
        this.uidtkn = str7;
    }

    public static /* synthetic */ DOAuthOTP copy$default(DOAuthOTP dOAuthOTP, String str, String str2, String str3, String str4, boolean z10, String str5, String str6, String str7, int i10, Object obj) {
        DOAuthOTP dOAuthOTP2 = dOAuthOTP;
        int i11 = i10;
        return dOAuthOTP.copy((i11 & 1) != 0 ? dOAuthOTP2.actionErrorCode : str, (i11 & 2) != 0 ? dOAuthOTP2.email : str2, (i11 & 4) != 0 ? dOAuthOTP2.errorCode : str3, (i11 & 8) != 0 ? dOAuthOTP2.last_four_mobile : str4, (i11 & 16) != 0 ? dOAuthOTP2.mobileverify : z10, (i11 & 32) != 0 ? dOAuthOTP2.reason : str5, (i11 & 64) != 0 ? dOAuthOTP2.status : str6, (i11 & 128) != 0 ? dOAuthOTP2.uidtkn : str7);
    }

    public final String component1() {
        return this.actionErrorCode;
    }

    public final String component2() {
        return this.email;
    }

    public final String component3() {
        return this.errorCode;
    }

    public final String component4() {
        return this.last_four_mobile;
    }

    public final boolean component5() {
        return this.mobileverify;
    }

    public final String component6() {
        return this.reason;
    }

    public final String component7() {
        return this.status;
    }

    public final String component8() {
        return this.uidtkn;
    }

    public final DOAuthOTP copy(String str, String str2, String str3, String str4, boolean z10, String str5, String str6, String str7) {
        return new DOAuthOTP(str, str2, str3, str4, z10, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DOAuthOTP)) {
            return false;
        }
        DOAuthOTP dOAuthOTP = (DOAuthOTP) obj;
        return l.a(this.actionErrorCode, dOAuthOTP.actionErrorCode) && l.a(this.email, dOAuthOTP.email) && l.a(this.errorCode, dOAuthOTP.errorCode) && l.a(this.last_four_mobile, dOAuthOTP.last_four_mobile) && this.mobileverify == dOAuthOTP.mobileverify && l.a(this.reason, dOAuthOTP.reason) && l.a(this.status, dOAuthOTP.status) && l.a(this.uidtkn, dOAuthOTP.uidtkn);
    }

    public final String getActionErrorCode() {
        return this.actionErrorCode;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getLast_four_mobile() {
        return this.last_four_mobile;
    }

    public final boolean getMobileverify() {
        return this.mobileverify;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUidtkn() {
        return this.uidtkn;
    }

    public int hashCode() {
        String str = this.actionErrorCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.last_four_mobile;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z10 = this.mobileverify;
        if (z10) {
            z10 = true;
        }
        int i11 = (hashCode4 + (z10 ? 1 : 0)) * 31;
        String str5 = this.reason;
        int hashCode5 = (i11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.uidtkn;
        if (str7 != null) {
            i10 = str7.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        return "DOAuthOTP(actionErrorCode=" + this.actionErrorCode + ", email=" + this.email + ", errorCode=" + this.errorCode + ", last_four_mobile=" + this.last_four_mobile + ", mobileverify=" + this.mobileverify + ", reason=" + this.reason + ", status=" + this.status + ", uidtkn=" + this.uidtkn + ')';
    }
}
