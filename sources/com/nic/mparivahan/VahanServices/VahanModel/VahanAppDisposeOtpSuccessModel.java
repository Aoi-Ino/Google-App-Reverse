package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VahanAppDisposeOtpSuccessModel {
    private final String otp;

    public VahanAppDisposeOtpSuccessModel(String str) {
        l.f(str, "otp");
        this.otp = str;
    }

    public static /* synthetic */ VahanAppDisposeOtpSuccessModel copy$default(VahanAppDisposeOtpSuccessModel vahanAppDisposeOtpSuccessModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vahanAppDisposeOtpSuccessModel.otp;
        }
        return vahanAppDisposeOtpSuccessModel.copy(str);
    }

    public final String component1() {
        return this.otp;
    }

    public final VahanAppDisposeOtpSuccessModel copy(String str) {
        l.f(str, "otp");
        return new VahanAppDisposeOtpSuccessModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VahanAppDisposeOtpSuccessModel) && l.a(this.otp, ((VahanAppDisposeOtpSuccessModel) obj).otp);
    }

    public final String getOtp() {
        return this.otp;
    }

    public int hashCode() {
        return this.otp.hashCode();
    }

    public String toString() {
        return "VahanAppDisposeOtpSuccessModel(otp=" + this.otp + ')';
    }
}
