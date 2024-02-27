package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MparOffence {
    private final int offenceChallanId;
    private final String offenceDispName;
    private final int offenceId;
    private final String offenceVchCatg;

    public MparOffence(String str, int i10, int i11, String str2) {
        l.f(str, "offenceDispName");
        l.f(str2, "offenceVchCatg");
        this.offenceDispName = str;
        this.offenceId = i10;
        this.offenceChallanId = i11;
        this.offenceVchCatg = str2;
    }

    public static /* synthetic */ MparOffence copy$default(MparOffence mparOffence, String str, int i10, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = mparOffence.offenceDispName;
        }
        if ((i12 & 2) != 0) {
            i10 = mparOffence.offenceId;
        }
        if ((i12 & 4) != 0) {
            i11 = mparOffence.offenceChallanId;
        }
        if ((i12 & 8) != 0) {
            str2 = mparOffence.offenceVchCatg;
        }
        return mparOffence.copy(str, i10, i11, str2);
    }

    public final String component1() {
        return this.offenceDispName;
    }

    public final int component2() {
        return this.offenceId;
    }

    public final int component3() {
        return this.offenceChallanId;
    }

    public final String component4() {
        return this.offenceVchCatg;
    }

    public final MparOffence copy(String str, int i10, int i11, String str2) {
        l.f(str, "offenceDispName");
        l.f(str2, "offenceVchCatg");
        return new MparOffence(str, i10, i11, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MparOffence)) {
            return false;
        }
        MparOffence mparOffence = (MparOffence) obj;
        return l.a(this.offenceDispName, mparOffence.offenceDispName) && this.offenceId == mparOffence.offenceId && this.offenceChallanId == mparOffence.offenceChallanId && l.a(this.offenceVchCatg, mparOffence.offenceVchCatg);
    }

    public final int getOffenceChallanId() {
        return this.offenceChallanId;
    }

    public final String getOffenceDispName() {
        return this.offenceDispName;
    }

    public final int getOffenceId() {
        return this.offenceId;
    }

    public final String getOffenceVchCatg() {
        return this.offenceVchCatg;
    }

    public int hashCode() {
        return (((((this.offenceDispName.hashCode() * 31) + Integer.hashCode(this.offenceId)) * 31) + Integer.hashCode(this.offenceChallanId)) * 31) + this.offenceVchCatg.hashCode();
    }

    public String toString() {
        return "MparOffence(offenceDispName=" + this.offenceDispName + ", offenceId=" + this.offenceId + ", offenceChallanId=" + this.offenceChallanId + ", offenceVchCatg=" + this.offenceVchCatg + ')';
    }
}
