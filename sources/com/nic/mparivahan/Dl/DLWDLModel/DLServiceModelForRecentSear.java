package com.nic.mparivahan.Dl.DLWDLModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DLServiceModelForRecentSear {
    private final BioObj bioObj;
    private final int errorcd;

    public DLServiceModelForRecentSear(BioObj bioObj2, int i10) {
        l.f(bioObj2, "bioObj");
        this.bioObj = bioObj2;
        this.errorcd = i10;
    }

    public static /* synthetic */ DLServiceModelForRecentSear copy$default(DLServiceModelForRecentSear dLServiceModelForRecentSear, BioObj bioObj2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bioObj2 = dLServiceModelForRecentSear.bioObj;
        }
        if ((i11 & 2) != 0) {
            i10 = dLServiceModelForRecentSear.errorcd;
        }
        return dLServiceModelForRecentSear.copy(bioObj2, i10);
    }

    public final BioObj component1() {
        return this.bioObj;
    }

    public final int component2() {
        return this.errorcd;
    }

    public final DLServiceModelForRecentSear copy(BioObj bioObj2, int i10) {
        l.f(bioObj2, "bioObj");
        return new DLServiceModelForRecentSear(bioObj2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DLServiceModelForRecentSear)) {
            return false;
        }
        DLServiceModelForRecentSear dLServiceModelForRecentSear = (DLServiceModelForRecentSear) obj;
        return l.a(this.bioObj, dLServiceModelForRecentSear.bioObj) && this.errorcd == dLServiceModelForRecentSear.errorcd;
    }

    public final BioObj getBioObj() {
        return this.bioObj;
    }

    public final int getErrorcd() {
        return this.errorcd;
    }

    public int hashCode() {
        return (this.bioObj.hashCode() * 31) + Integer.hashCode(this.errorcd);
    }

    public String toString() {
        return "DLServiceModelForRecentSear(bioObj=" + this.bioObj + ", errorcd=" + this.errorcd + ')';
    }
}
