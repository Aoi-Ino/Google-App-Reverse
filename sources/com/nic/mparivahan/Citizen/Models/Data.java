package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Data {
    private final int vhClass;
    private final String vhClassDescription;

    public Data(int i10, String str) {
        l.f(str, "vhClassDescription");
        this.vhClass = i10;
        this.vhClassDescription = str;
    }

    public static /* synthetic */ Data copy$default(Data data, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = data.vhClass;
        }
        if ((i11 & 2) != 0) {
            str = data.vhClassDescription;
        }
        return data.copy(i10, str);
    }

    public final int component1() {
        return this.vhClass;
    }

    public final String component2() {
        return this.vhClassDescription;
    }

    public final Data copy(int i10, String str) {
        l.f(str, "vhClassDescription");
        return new Data(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return this.vhClass == data.vhClass && l.a(this.vhClassDescription, data.vhClassDescription);
    }

    public final int getVhClass() {
        return this.vhClass;
    }

    public final String getVhClassDescription() {
        return this.vhClassDescription;
    }

    public int hashCode() {
        return (Integer.hashCode(this.vhClass) * 31) + this.vhClassDescription.hashCode();
    }

    public String toString() {
        return "Data(vhClass=" + this.vhClass + ", vhClassDescription=" + this.vhClassDescription + ')';
    }
}
