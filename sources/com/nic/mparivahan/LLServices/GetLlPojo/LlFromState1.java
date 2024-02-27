package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class LlFromState1 implements Serializable {
    private final String llFromState1Code;
    private final String llFromState1Name;

    public LlFromState1(String str, String str2) {
        l.f(str, "llFromState1Code");
        l.f(str2, "llFromState1Name");
        this.llFromState1Code = str;
        this.llFromState1Name = str2;
    }

    public static /* synthetic */ LlFromState1 copy$default(LlFromState1 llFromState1, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = llFromState1.llFromState1Code;
        }
        if ((i10 & 2) != 0) {
            str2 = llFromState1.llFromState1Name;
        }
        return llFromState1.copy(str, str2);
    }

    public final String component1() {
        return this.llFromState1Code;
    }

    public final String component2() {
        return this.llFromState1Name;
    }

    public final LlFromState1 copy(String str, String str2) {
        l.f(str, "llFromState1Code");
        l.f(str2, "llFromState1Name");
        return new LlFromState1(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LlFromState1)) {
            return false;
        }
        LlFromState1 llFromState1 = (LlFromState1) obj;
        return l.a(this.llFromState1Code, llFromState1.llFromState1Code) && l.a(this.llFromState1Name, llFromState1.llFromState1Name);
    }

    public final String getLlFromState1Code() {
        return this.llFromState1Code;
    }

    public final String getLlFromState1Name() {
        return this.llFromState1Name;
    }

    public int hashCode() {
        return (this.llFromState1Code.hashCode() * 31) + this.llFromState1Name.hashCode();
    }

    public String toString() {
        return "LlFromState1(llFromState1Code=" + this.llFromState1Code + ", llFromState1Name=" + this.llFromState1Name + ')';
    }
}
