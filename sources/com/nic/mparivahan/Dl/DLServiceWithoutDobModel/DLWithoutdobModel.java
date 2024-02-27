package com.nic.mparivahan.Dl.DLServiceWithoutDobModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class DLWithoutdobModel {
    private final BioImgObj bioImgObj;
    private final BioObj bioObj;
    private final String dbLoc;
    private final List<Dlcov> dlcovs;
    private final Dlobj dlobj;
    private final int errorcd;
    private final String statusCode;
    private final String statusDesc;

    public DLWithoutdobModel(BioImgObj bioImgObj2, BioObj bioObj2, String str, List<Dlcov> list, Dlobj dlobj2, int i10, String str2, String str3) {
        l.f(bioObj2, "bioObj");
        l.f(str, "dbLoc");
        l.f(list, "dlcovs");
        l.f(dlobj2, "dlobj");
        this.bioImgObj = bioImgObj2;
        this.bioObj = bioObj2;
        this.dbLoc = str;
        this.dlcovs = list;
        this.dlobj = dlobj2;
        this.errorcd = i10;
        this.statusDesc = str2;
        this.statusCode = str3;
    }

    public static /* synthetic */ DLWithoutdobModel copy$default(DLWithoutdobModel dLWithoutdobModel, BioImgObj bioImgObj2, BioObj bioObj2, String str, List list, Dlobj dlobj2, int i10, String str2, String str3, int i11, Object obj) {
        DLWithoutdobModel dLWithoutdobModel2 = dLWithoutdobModel;
        int i12 = i11;
        return dLWithoutdobModel.copy((i12 & 1) != 0 ? dLWithoutdobModel2.bioImgObj : bioImgObj2, (i12 & 2) != 0 ? dLWithoutdobModel2.bioObj : bioObj2, (i12 & 4) != 0 ? dLWithoutdobModel2.dbLoc : str, (i12 & 8) != 0 ? dLWithoutdobModel2.dlcovs : list, (i12 & 16) != 0 ? dLWithoutdobModel2.dlobj : dlobj2, (i12 & 32) != 0 ? dLWithoutdobModel2.errorcd : i10, (i12 & 64) != 0 ? dLWithoutdobModel2.statusDesc : str2, (i12 & 128) != 0 ? dLWithoutdobModel2.statusCode : str3);
    }

    public final BioImgObj component1() {
        return this.bioImgObj;
    }

    public final BioObj component2() {
        return this.bioObj;
    }

    public final String component3() {
        return this.dbLoc;
    }

    public final List<Dlcov> component4() {
        return this.dlcovs;
    }

    public final Dlobj component5() {
        return this.dlobj;
    }

    public final int component6() {
        return this.errorcd;
    }

    public final String component7() {
        return this.statusDesc;
    }

    public final String component8() {
        return this.statusCode;
    }

    public final DLWithoutdobModel copy(BioImgObj bioImgObj2, BioObj bioObj2, String str, List<Dlcov> list, Dlobj dlobj2, int i10, String str2, String str3) {
        l.f(bioObj2, "bioObj");
        l.f(str, "dbLoc");
        l.f(list, "dlcovs");
        l.f(dlobj2, "dlobj");
        return new DLWithoutdobModel(bioImgObj2, bioObj2, str, list, dlobj2, i10, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DLWithoutdobModel)) {
            return false;
        }
        DLWithoutdobModel dLWithoutdobModel = (DLWithoutdobModel) obj;
        return l.a(this.bioImgObj, dLWithoutdobModel.bioImgObj) && l.a(this.bioObj, dLWithoutdobModel.bioObj) && l.a(this.dbLoc, dLWithoutdobModel.dbLoc) && l.a(this.dlcovs, dLWithoutdobModel.dlcovs) && l.a(this.dlobj, dLWithoutdobModel.dlobj) && this.errorcd == dLWithoutdobModel.errorcd && l.a(this.statusDesc, dLWithoutdobModel.statusDesc) && l.a(this.statusCode, dLWithoutdobModel.statusCode);
    }

    public final BioImgObj getBioImgObj() {
        return this.bioImgObj;
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

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        BioImgObj bioImgObj2 = this.bioImgObj;
        int i10 = 0;
        int hashCode = (((((((((((bioImgObj2 == null ? 0 : bioImgObj2.hashCode()) * 31) + this.bioObj.hashCode()) * 31) + this.dbLoc.hashCode()) * 31) + this.dlcovs.hashCode()) * 31) + this.dlobj.hashCode()) * 31) + Integer.hashCode(this.errorcd)) * 31;
        String str = this.statusDesc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusCode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "DLWithoutdobModel(bioImgObj=" + this.bioImgObj + ", bioObj=" + this.bioObj + ", dbLoc=" + this.dbLoc + ", dlcovs=" + this.dlcovs + ", dlobj=" + this.dlobj + ", errorcd=" + this.errorcd + ", statusDesc=" + this.statusDesc + ", statusCode=" + this.statusCode + ')';
    }
}
