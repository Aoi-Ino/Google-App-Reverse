package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class PresSubDistrict implements Serializable {
    private final String presSubDistCode;
    private final String presSubDistName;

    public PresSubDistrict(String str, String str2) {
        l.f(str, "presSubDistCode");
        l.f(str2, "presSubDistName");
        this.presSubDistCode = str;
        this.presSubDistName = str2;
    }

    public static /* synthetic */ PresSubDistrict copy$default(PresSubDistrict presSubDistrict, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = presSubDistrict.presSubDistCode;
        }
        if ((i10 & 2) != 0) {
            str2 = presSubDistrict.presSubDistName;
        }
        return presSubDistrict.copy(str, str2);
    }

    public final String component1() {
        return this.presSubDistCode;
    }

    public final String component2() {
        return this.presSubDistName;
    }

    public final PresSubDistrict copy(String str, String str2) {
        l.f(str, "presSubDistCode");
        l.f(str2, "presSubDistName");
        return new PresSubDistrict(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresSubDistrict)) {
            return false;
        }
        PresSubDistrict presSubDistrict = (PresSubDistrict) obj;
        return l.a(this.presSubDistCode, presSubDistrict.presSubDistCode) && l.a(this.presSubDistName, presSubDistrict.presSubDistName);
    }

    public final String getPresSubDistCode() {
        return this.presSubDistCode;
    }

    public final String getPresSubDistName() {
        return this.presSubDistName;
    }

    public int hashCode() {
        return (this.presSubDistCode.hashCode() * 31) + this.presSubDistName.hashCode();
    }

    public String toString() {
        return "PresSubDistrict(presSubDistCode=" + this.presSubDistCode + ", presSubDistName=" + this.presSubDistName + ')';
    }
}
