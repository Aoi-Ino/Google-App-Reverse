package com.nic.mparivahan.DLServicesAuth.Model;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class DLResWithODob {
    private final BioObj bioObj;
    private final String dbLoc;
    private final List<Dlcov> dlcovs;
    private final Dlobj dlobj;
    private final int errorcd;

    public DLResWithODob(BioObj bioObj2, String str, List<Dlcov> list, Dlobj dlobj2, int i10) {
        l.f(bioObj2, "bioObj");
        l.f(str, "dbLoc");
        l.f(list, "dlcovs");
        l.f(dlobj2, "dlobj");
        this.bioObj = bioObj2;
        this.dbLoc = str;
        this.dlcovs = list;
        this.dlobj = dlobj2;
        this.errorcd = i10;
    }

    public static /* synthetic */ DLResWithODob copy$default(DLResWithODob dLResWithODob, BioObj bioObj2, String str, List<Dlcov> list, Dlobj dlobj2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bioObj2 = dLResWithODob.bioObj;
        }
        if ((i11 & 2) != 0) {
            str = dLResWithODob.dbLoc;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            list = dLResWithODob.dlcovs;
        }
        List<Dlcov> list2 = list;
        if ((i11 & 8) != 0) {
            dlobj2 = dLResWithODob.dlobj;
        }
        Dlobj dlobj3 = dlobj2;
        if ((i11 & 16) != 0) {
            i10 = dLResWithODob.errorcd;
        }
        return dLResWithODob.copy(bioObj2, str2, list2, dlobj3, i10);
    }

    public final BioObj component1() {
        return this.bioObj;
    }

    public final String component2() {
        return this.dbLoc;
    }

    public final List<Dlcov> component3() {
        return this.dlcovs;
    }

    public final Dlobj component4() {
        return this.dlobj;
    }

    public final int component5() {
        return this.errorcd;
    }

    public final DLResWithODob copy(BioObj bioObj2, String str, List<Dlcov> list, Dlobj dlobj2, int i10) {
        l.f(bioObj2, "bioObj");
        l.f(str, "dbLoc");
        l.f(list, "dlcovs");
        l.f(dlobj2, "dlobj");
        return new DLResWithODob(bioObj2, str, list, dlobj2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DLResWithODob)) {
            return false;
        }
        DLResWithODob dLResWithODob = (DLResWithODob) obj;
        return l.a(this.bioObj, dLResWithODob.bioObj) && l.a(this.dbLoc, dLResWithODob.dbLoc) && l.a(this.dlcovs, dLResWithODob.dlcovs) && l.a(this.dlobj, dLResWithODob.dlobj) && this.errorcd == dLResWithODob.errorcd;
    }

    public final BioObj getBioObj() {
        return this.bioObj;
    }

    public final String getDbLoc() {
        return this.dbLoc;
    }

    public final List<Dlcov> getDlcovs() {
        return this.dlcovs;
    }

    public final Dlobj getDlobj() {
        return this.dlobj;
    }

    public final int getErrorcd() {
        return this.errorcd;
    }

    public int hashCode() {
        return (((((((this.bioObj.hashCode() * 31) + this.dbLoc.hashCode()) * 31) + this.dlcovs.hashCode()) * 31) + this.dlobj.hashCode()) * 31) + Integer.hashCode(this.errorcd);
    }

    public String toString() {
        return "DLResWithODob(bioObj=" + this.bioObj + ", dbLoc=" + this.dbLoc + ", dlcovs=" + this.dlcovs + ", dlobj=" + this.dlobj + ", errorcd=" + this.errorcd + ')';
    }
}
