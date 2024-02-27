package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class DLCOVList {
    @c("LMV   ")
    private final LMV lMV;
    @c("MCWG  ")
    private final MCWG mCWG;

    public DLCOVList() {
        this((MCWG) null, (LMV) null, 3, (g) null);
    }

    public static /* synthetic */ DLCOVList copy$default(DLCOVList dLCOVList, MCWG mcwg, LMV lmv, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mcwg = dLCOVList.mCWG;
        }
        if ((i10 & 2) != 0) {
            lmv = dLCOVList.lMV;
        }
        return dLCOVList.copy(mcwg, lmv);
    }

    public final MCWG component1() {
        return this.mCWG;
    }

    public final LMV component2() {
        return this.lMV;
    }

    public final DLCOVList copy(MCWG mcwg, LMV lmv) {
        return new DLCOVList(mcwg, lmv);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DLCOVList)) {
            return false;
        }
        DLCOVList dLCOVList = (DLCOVList) obj;
        return l.a(this.mCWG, dLCOVList.mCWG) && l.a(this.lMV, dLCOVList.lMV);
    }

    public final LMV getLMV() {
        return this.lMV;
    }

    public final MCWG getMCWG() {
        return this.mCWG;
    }

    public int hashCode() {
        MCWG mcwg = this.mCWG;
        int i10 = 0;
        int hashCode = (mcwg == null ? 0 : mcwg.hashCode()) * 31;
        LMV lmv = this.lMV;
        if (lmv != null) {
            i10 = lmv.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "DLCOVList(mCWG=" + this.mCWG + ", lMV=" + this.lMV + ')';
    }

    public DLCOVList(MCWG mcwg, LMV lmv) {
        this.mCWG = mcwg;
        this.lMV = lmv;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DLCOVList(MCWG mcwg, LMV lmv, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : mcwg, (i10 & 2) != 0 ? null : lmv);
    }
}
