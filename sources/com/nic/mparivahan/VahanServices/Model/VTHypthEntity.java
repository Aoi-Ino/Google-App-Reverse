package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class VTHypthEntity implements Serializable {
    private final String fncr_add1;
    private final String fncr_add2;
    private final String fncr_add3;
    private final String fncr_name;
    private final String fncr_state;

    public VTHypthEntity(String str, String str2, String str3, String str4, String str5) {
        this.fncr_add1 = str;
        this.fncr_add2 = str2;
        this.fncr_add3 = str3;
        this.fncr_name = str4;
        this.fncr_state = str5;
    }

    public static /* synthetic */ VTHypthEntity copy$default(VTHypthEntity vTHypthEntity, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vTHypthEntity.fncr_add1;
        }
        if ((i10 & 2) != 0) {
            str2 = vTHypthEntity.fncr_add2;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = vTHypthEntity.fncr_add3;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = vTHypthEntity.fncr_name;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = vTHypthEntity.fncr_state;
        }
        return vTHypthEntity.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.fncr_add1;
    }

    public final String component2() {
        return this.fncr_add2;
    }

    public final String component3() {
        return this.fncr_add3;
    }

    public final String component4() {
        return this.fncr_name;
    }

    public final String component5() {
        return this.fncr_state;
    }

    public final VTHypthEntity copy(String str, String str2, String str3, String str4, String str5) {
        return new VTHypthEntity(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VTHypthEntity)) {
            return false;
        }
        VTHypthEntity vTHypthEntity = (VTHypthEntity) obj;
        return l.a(this.fncr_add1, vTHypthEntity.fncr_add1) && l.a(this.fncr_add2, vTHypthEntity.fncr_add2) && l.a(this.fncr_add3, vTHypthEntity.fncr_add3) && l.a(this.fncr_name, vTHypthEntity.fncr_name) && l.a(this.fncr_state, vTHypthEntity.fncr_state);
    }

    public final String getFncr_add1() {
        return this.fncr_add1;
    }

    public final String getFncr_add2() {
        return this.fncr_add2;
    }

    public final String getFncr_add3() {
        return this.fncr_add3;
    }

    public final String getFncr_name() {
        return this.fncr_name;
    }

    public final String getFncr_state() {
        return this.fncr_state;
    }

    public int hashCode() {
        String str = this.fncr_add1;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fncr_add2;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fncr_add3;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fncr_name;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fncr_state;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "VTHypthEntity(fncr_add1=" + this.fncr_add1 + ", fncr_add2=" + this.fncr_add2 + ", fncr_add3=" + this.fncr_add3 + ", fncr_name=" + this.fncr_name + ", fncr_state=" + this.fncr_state + ')';
    }
}
