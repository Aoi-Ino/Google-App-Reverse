package com.nic.mparivahan.ClServices.Pojo.NewClPojo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SpinnerPojo {
    private final String code;
    private final String name;

    public SpinnerPojo(String str, String str2) {
        l.f(str, "code");
        l.f(str2, "name");
        this.code = str;
        this.name = str2;
    }

    public static /* synthetic */ SpinnerPojo copy$default(SpinnerPojo spinnerPojo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = spinnerPojo.code;
        }
        if ((i10 & 2) != 0) {
            str2 = spinnerPojo.name;
        }
        return spinnerPojo.copy(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final SpinnerPojo copy(String str, String str2) {
        l.f(str, "code");
        l.f(str2, "name");
        return new SpinnerPojo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpinnerPojo)) {
            return false;
        }
        SpinnerPojo spinnerPojo = (SpinnerPojo) obj;
        return l.a(this.code, spinnerPojo.code) && l.a(this.name, spinnerPojo.name);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        return "SpinnerPojo(code=" + this.code + ", name=" + this.name + ')';
    }
}
