package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class BloodGroup implements Serializable {
    private final String bloodGroupCode;
    private final String bloodGroupDesc;

    public BloodGroup(String str, String str2) {
        l.f(str, "bloodGroupCode");
        l.f(str2, "bloodGroupDesc");
        this.bloodGroupCode = str;
        this.bloodGroupDesc = str2;
    }

    public static /* synthetic */ BloodGroup copy$default(BloodGroup bloodGroup, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bloodGroup.bloodGroupCode;
        }
        if ((i10 & 2) != 0) {
            str2 = bloodGroup.bloodGroupDesc;
        }
        return bloodGroup.copy(str, str2);
    }

    public final String component1() {
        return this.bloodGroupCode;
    }

    public final String component2() {
        return this.bloodGroupDesc;
    }

    public final BloodGroup copy(String str, String str2) {
        l.f(str, "bloodGroupCode");
        l.f(str2, "bloodGroupDesc");
        return new BloodGroup(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BloodGroup)) {
            return false;
        }
        BloodGroup bloodGroup = (BloodGroup) obj;
        return l.a(this.bloodGroupCode, bloodGroup.bloodGroupCode) && l.a(this.bloodGroupDesc, bloodGroup.bloodGroupDesc);
    }

    public final String getBloodGroupCode() {
        return this.bloodGroupCode;
    }

    public final String getBloodGroupDesc() {
        return this.bloodGroupDesc;
    }

    public int hashCode() {
        return (this.bloodGroupCode.hashCode() * 31) + this.bloodGroupDesc.hashCode();
    }

    public String toString() {
        return "BloodGroup(bloodGroupCode=" + this.bloodGroupCode + ", bloodGroupDesc=" + this.bloodGroupDesc + ')';
    }
}
