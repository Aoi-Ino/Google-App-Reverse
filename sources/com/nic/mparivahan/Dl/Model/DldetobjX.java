package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class DldetobjX implements Serializable {
    private final BioImgObjX bioImgObj;
    private final BioObjX bioObj;
    private final String dbLoc;
    private final List<Dlcov> dlcovs;
    private final DlobjX dlobj;
    private final int errorcd;
    private final List<TransReqObj> transReqObj;

    public DldetobjX(BioImgObjX bioImgObjX, BioObjX bioObjX, String str, List<Dlcov> list, DlobjX dlobjX, int i10, List<TransReqObj> list2) {
        l.f(bioImgObjX, "bioImgObj");
        l.f(bioObjX, "bioObj");
        l.f(str, "dbLoc");
        l.f(list, "dlcovs");
        l.f(dlobjX, "dlobj");
        l.f(list2, "transReqObj");
        this.bioImgObj = bioImgObjX;
        this.bioObj = bioObjX;
        this.dbLoc = str;
        this.dlcovs = list;
        this.dlobj = dlobjX;
        this.errorcd = i10;
        this.transReqObj = list2;
    }

    public static /* synthetic */ DldetobjX copy$default(DldetobjX dldetobjX, BioImgObjX bioImgObjX, BioObjX bioObjX, String str, List<Dlcov> list, DlobjX dlobjX, int i10, List<TransReqObj> list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bioImgObjX = dldetobjX.bioImgObj;
        }
        if ((i11 & 2) != 0) {
            bioObjX = dldetobjX.bioObj;
        }
        BioObjX bioObjX2 = bioObjX;
        if ((i11 & 4) != 0) {
            str = dldetobjX.dbLoc;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            list = dldetobjX.dlcovs;
        }
        List<Dlcov> list3 = list;
        if ((i11 & 16) != 0) {
            dlobjX = dldetobjX.dlobj;
        }
        DlobjX dlobjX2 = dlobjX;
        if ((i11 & 32) != 0) {
            i10 = dldetobjX.errorcd;
        }
        int i12 = i10;
        if ((i11 & 64) != 0) {
            list2 = dldetobjX.transReqObj;
        }
        return dldetobjX.copy(bioImgObjX, bioObjX2, str2, list3, dlobjX2, i12, list2);
    }

    public final BioImgObjX component1() {
        return this.bioImgObj;
    }

    public final BioObjX component2() {
        return this.bioObj;
    }

    public final String component3() {
        return this.dbLoc;
    }

    public final List<Dlcov> component4() {
        return this.dlcovs;
    }

    public final DlobjX component5() {
        return this.dlobj;
    }

    public final int component6() {
        return this.errorcd;
    }

    public final List<TransReqObj> component7() {
        return this.transReqObj;
    }

    public final DldetobjX copy(BioImgObjX bioImgObjX, BioObjX bioObjX, String str, List<Dlcov> list, DlobjX dlobjX, int i10, List<TransReqObj> list2) {
        l.f(bioImgObjX, "bioImgObj");
        l.f(bioObjX, "bioObj");
        l.f(str, "dbLoc");
        l.f(list, "dlcovs");
        l.f(dlobjX, "dlobj");
        List<TransReqObj> list3 = list2;
        l.f(list3, "transReqObj");
        return new DldetobjX(bioImgObjX, bioObjX, str, list, dlobjX, i10, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DldetobjX)) {
            return false;
        }
        DldetobjX dldetobjX = (DldetobjX) obj;
        return l.a(this.bioImgObj, dldetobjX.bioImgObj) && l.a(this.bioObj, dldetobjX.bioObj) && l.a(this.dbLoc, dldetobjX.dbLoc) && l.a(this.dlcovs, dldetobjX.dlcovs) && l.a(this.dlobj, dldetobjX.dlobj) && this.errorcd == dldetobjX.errorcd && l.a(this.transReqObj, dldetobjX.transReqObj);
    }

    public final BioImgObjX getBioImgObj() {
        return this.bioImgObj;
    }

    public final BioObjX getBioObj() {
        return this.bioObj;
    }

    public final String getDbLoc() {
        return this.dbLoc;
    }

    public final List<Dlcov> getDlcovs() {
        return this.dlcovs;
    }

    public final DlobjX getDlobj() {
        return this.dlobj;
    }

    public final int getErrorcd() {
        return this.errorcd;
    }

    public final List<TransReqObj> getTransReqObj() {
        return this.transReqObj;
    }

    public int hashCode() {
        return (((((((((((this.bioImgObj.hashCode() * 31) + this.bioObj.hashCode()) * 31) + this.dbLoc.hashCode()) * 31) + this.dlcovs.hashCode()) * 31) + this.dlobj.hashCode()) * 31) + Integer.hashCode(this.errorcd)) * 31) + this.transReqObj.hashCode();
    }

    public String toString() {
        return "DldetobjX(bioImgObj=" + this.bioImgObj + ", bioObj=" + this.bioObj + ", dbLoc=" + this.dbLoc + ", dlcovs=" + this.dlcovs + ", dlobj=" + this.dlobj + ", errorcd=" + this.errorcd + ", transReqObj=" + this.transReqObj + ')';
    }
}
