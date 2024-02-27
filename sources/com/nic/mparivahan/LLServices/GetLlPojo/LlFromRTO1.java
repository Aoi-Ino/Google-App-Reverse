package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class LlFromRTO1 implements Serializable {
    private final String rtoCode;
    private final String rtoName;

    public LlFromRTO1(String str, String str2) {
        l.f(str, "rtoCode");
        l.f(str2, "rtoName");
        this.rtoCode = str;
        this.rtoName = str2;
    }

    public static /* synthetic */ LlFromRTO1 copy$default(LlFromRTO1 llFromRTO1, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = llFromRTO1.rtoCode;
        }
        if ((i10 & 2) != 0) {
            str2 = llFromRTO1.rtoName;
        }
        return llFromRTO1.copy(str, str2);
    }

    public final String component1() {
        return this.rtoCode;
    }

    public final String component2() {
        return this.rtoName;
    }

    public final LlFromRTO1 copy(String str, String str2) {
        l.f(str, "rtoCode");
        l.f(str2, "rtoName");
        return new LlFromRTO1(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LlFromRTO1)) {
            return false;
        }
        LlFromRTO1 llFromRTO1 = (LlFromRTO1) obj;
        return l.a(this.rtoCode, llFromRTO1.rtoCode) && l.a(this.rtoName, llFromRTO1.rtoName);
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final String getRtoName() {
        return this.rtoName;
    }

    public int hashCode() {
        return (this.rtoCode.hashCode() * 31) + this.rtoName.hashCode();
    }

    public String toString() {
        return "LlFromRTO1(rtoCode=" + this.rtoCode + ", rtoName=" + this.rtoName + ')';
    }
}
