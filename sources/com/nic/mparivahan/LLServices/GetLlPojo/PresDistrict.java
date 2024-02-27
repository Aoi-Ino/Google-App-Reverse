package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class PresDistrict implements Serializable {
    private final String presDistCode;
    private final String presDistName;

    public PresDistrict(String str, String str2) {
        l.f(str, "presDistCode");
        l.f(str2, "presDistName");
        this.presDistCode = str;
        this.presDistName = str2;
    }

    public static /* synthetic */ PresDistrict copy$default(PresDistrict presDistrict, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = presDistrict.presDistCode;
        }
        if ((i10 & 2) != 0) {
            str2 = presDistrict.presDistName;
        }
        return presDistrict.copy(str, str2);
    }

    public final String component1() {
        return this.presDistCode;
    }

    public final String component2() {
        return this.presDistName;
    }

    public final PresDistrict copy(String str, String str2) {
        l.f(str, "presDistCode");
        l.f(str2, "presDistName");
        return new PresDistrict(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresDistrict)) {
            return false;
        }
        PresDistrict presDistrict = (PresDistrict) obj;
        return l.a(this.presDistCode, presDistrict.presDistCode) && l.a(this.presDistName, presDistrict.presDistName);
    }

    public final String getPresDistCode() {
        return this.presDistCode;
    }

    public final String getPresDistName() {
        return this.presDistName;
    }

    public int hashCode() {
        return (this.presDistCode.hashCode() * 31) + this.presDistName.hashCode();
    }

    public String toString() {
        return "PresDistrict(presDistCode=" + this.presDistCode + ", presDistName=" + this.presDistName + ')';
    }
}
