package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Dldetobj implements Serializable {
    private final BioImgObj bioImgObj;
    private final BioObj bioObj;
    private final Dlobj dlobj;
    private final Object erormsg;
    private final String errorcd;

    public Dldetobj(BioImgObj bioImgObj2, BioObj bioObj2, Dlobj dlobj2, Object obj, String str) {
        l.f(bioObj2, "bioObj");
        l.f(dlobj2, "dlobj");
        l.f(obj, "erormsg");
        l.f(str, "errorcd");
        this.bioImgObj = bioImgObj2;
        this.bioObj = bioObj2;
        this.dlobj = dlobj2;
        this.erormsg = obj;
        this.errorcd = str;
    }

    public static /* synthetic */ Dldetobj copy$default(Dldetobj dldetobj, BioImgObj bioImgObj2, BioObj bioObj2, Dlobj dlobj2, Object obj, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            bioImgObj2 = dldetobj.bioImgObj;
        }
        if ((i10 & 2) != 0) {
            bioObj2 = dldetobj.bioObj;
        }
        BioObj bioObj3 = bioObj2;
        if ((i10 & 4) != 0) {
            dlobj2 = dldetobj.dlobj;
        }
        Dlobj dlobj3 = dlobj2;
        if ((i10 & 8) != 0) {
            obj = dldetobj.erormsg;
        }
        Object obj3 = obj;
        if ((i10 & 16) != 0) {
            str = dldetobj.errorcd;
        }
        return dldetobj.copy(bioImgObj2, bioObj3, dlobj3, obj3, str);
    }

    public final BioImgObj component1() {
        return this.bioImgObj;
    }

    public final BioObj component2() {
        return this.bioObj;
    }

    public final Dlobj component3() {
        return this.dlobj;
    }

    public final Object component4() {
        return this.erormsg;
    }

    public final String component5() {
        return this.errorcd;
    }

    public final Dldetobj copy(BioImgObj bioImgObj2, BioObj bioObj2, Dlobj dlobj2, Object obj, String str) {
        l.f(bioObj2, "bioObj");
        l.f(dlobj2, "dlobj");
        l.f(obj, "erormsg");
        l.f(str, "errorcd");
        return new Dldetobj(bioImgObj2, bioObj2, dlobj2, obj, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dldetobj)) {
            return false;
        }
        Dldetobj dldetobj = (Dldetobj) obj;
        return l.a(this.bioImgObj, dldetobj.bioImgObj) && l.a(this.bioObj, dldetobj.bioObj) && l.a(this.dlobj, dldetobj.dlobj) && l.a(this.erormsg, dldetobj.erormsg) && l.a(this.errorcd, dldetobj.errorcd);
    }

    public final BioImgObj getBioImgObj() {
        return this.bioImgObj;
    }

    public final BioObj getBioObj() {
        return this.bioObj;
    }

    public final Dlobj getDlobj() {
        return this.dlobj;
    }

    public final Object getErormsg() {
        return this.erormsg;
    }

    public final String getErrorcd() {
        return this.errorcd;
    }

    public int hashCode() {
        BioImgObj bioImgObj2 = this.bioImgObj;
        return ((((((((bioImgObj2 == null ? 0 : bioImgObj2.hashCode()) * 31) + this.bioObj.hashCode()) * 31) + this.dlobj.hashCode()) * 31) + this.erormsg.hashCode()) * 31) + this.errorcd.hashCode();
    }

    public String toString() {
        return "Dldetobj(bioImgObj=" + this.bioImgObj + ", bioObj=" + this.bioObj + ", dlobj=" + this.dlobj + ", erormsg=" + this.erormsg + ", errorcd=" + this.errorcd + ')';
    }
}
