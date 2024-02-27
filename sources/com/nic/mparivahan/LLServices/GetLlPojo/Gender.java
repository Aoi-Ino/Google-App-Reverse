package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Gender implements Serializable {
    private final int genderCode;
    private final String genderDesc;

    public Gender(int i10, String str) {
        l.f(str, "genderDesc");
        this.genderCode = i10;
        this.genderDesc = str;
    }

    public static /* synthetic */ Gender copy$default(Gender gender, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = gender.genderCode;
        }
        if ((i11 & 2) != 0) {
            str = gender.genderDesc;
        }
        return gender.copy(i10, str);
    }

    public final int component1() {
        return this.genderCode;
    }

    public final String component2() {
        return this.genderDesc;
    }

    public final Gender copy(int i10, String str) {
        l.f(str, "genderDesc");
        return new Gender(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gender)) {
            return false;
        }
        Gender gender = (Gender) obj;
        return this.genderCode == gender.genderCode && l.a(this.genderDesc, gender.genderDesc);
    }

    public final int getGenderCode() {
        return this.genderCode;
    }

    public final String getGenderDesc() {
        return this.genderDesc;
    }

    public int hashCode() {
        return (Integer.hashCode(this.genderCode) * 31) + this.genderDesc.hashCode();
    }

    public String toString() {
        return "Gender(genderCode=" + this.genderCode + ", genderDesc=" + this.genderDesc + ')';
    }
}
