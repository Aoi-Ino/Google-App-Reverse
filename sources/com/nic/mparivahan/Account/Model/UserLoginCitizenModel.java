package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class UserLoginCitizenModel {
    private final String ctzMobile;
    private final String ctzMpinStatus;
    private final long ctzRecordId;
    private final String ctzToken;

    public UserLoginCitizenModel(long j10, String str, String str2, String str3) {
        l.f(str, "ctzMobile");
        l.f(str2, "ctzMpinStatus");
        l.f(str3, "ctzToken");
        this.ctzRecordId = j10;
        this.ctzMobile = str;
        this.ctzMpinStatus = str2;
        this.ctzToken = str3;
    }

    public static /* synthetic */ UserLoginCitizenModel copy$default(UserLoginCitizenModel userLoginCitizenModel, long j10, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = userLoginCitizenModel.ctzRecordId;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = userLoginCitizenModel.ctzMobile;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = userLoginCitizenModel.ctzMpinStatus;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = userLoginCitizenModel.ctzToken;
        }
        return userLoginCitizenModel.copy(j11, str4, str5, str3);
    }

    public final long component1() {
        return this.ctzRecordId;
    }

    public final String component2() {
        return this.ctzMobile;
    }

    public final String component3() {
        return this.ctzMpinStatus;
    }

    public final String component4() {
        return this.ctzToken;
    }

    public final UserLoginCitizenModel copy(long j10, String str, String str2, String str3) {
        l.f(str, "ctzMobile");
        l.f(str2, "ctzMpinStatus");
        l.f(str3, "ctzToken");
        return new UserLoginCitizenModel(j10, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserLoginCitizenModel)) {
            return false;
        }
        UserLoginCitizenModel userLoginCitizenModel = (UserLoginCitizenModel) obj;
        return this.ctzRecordId == userLoginCitizenModel.ctzRecordId && l.a(this.ctzMobile, userLoginCitizenModel.ctzMobile) && l.a(this.ctzMpinStatus, userLoginCitizenModel.ctzMpinStatus) && l.a(this.ctzToken, userLoginCitizenModel.ctzToken);
    }

    public final String getCtzMobile() {
        return this.ctzMobile;
    }

    public final String getCtzMpinStatus() {
        return this.ctzMpinStatus;
    }

    public final long getCtzRecordId() {
        return this.ctzRecordId;
    }

    public final String getCtzToken() {
        return this.ctzToken;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.ctzRecordId) * 31) + this.ctzMobile.hashCode()) * 31) + this.ctzMpinStatus.hashCode()) * 31) + this.ctzToken.hashCode();
    }

    public String toString() {
        return "UserLoginCitizenModel(ctzRecordId=" + this.ctzRecordId + ", ctzMobile=" + this.ctzMobile + ", ctzMpinStatus=" + this.ctzMpinStatus + ", ctzToken=" + this.ctzToken + ')';
    }
}
