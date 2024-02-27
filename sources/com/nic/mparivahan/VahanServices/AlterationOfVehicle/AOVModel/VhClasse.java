package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VhClasse {
    private final int classtype;
    private final String convertibleclasses;
    private final String descr;
    private final String transportcatg;
    private final int vhclass;

    public VhClasse(int i10, String str, String str2, String str3, int i11) {
        l.f(str, "convertibleclasses");
        l.f(str2, "descr");
        l.f(str3, "transportcatg");
        this.classtype = i10;
        this.convertibleclasses = str;
        this.descr = str2;
        this.transportcatg = str3;
        this.vhclass = i11;
    }

    public static /* synthetic */ VhClasse copy$default(VhClasse vhClasse, int i10, String str, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = vhClasse.classtype;
        }
        if ((i12 & 2) != 0) {
            str = vhClasse.convertibleclasses;
        }
        String str4 = str;
        if ((i12 & 4) != 0) {
            str2 = vhClasse.descr;
        }
        String str5 = str2;
        if ((i12 & 8) != 0) {
            str3 = vhClasse.transportcatg;
        }
        String str6 = str3;
        if ((i12 & 16) != 0) {
            i11 = vhClasse.vhclass;
        }
        return vhClasse.copy(i10, str4, str5, str6, i11);
    }

    public final int component1() {
        return this.classtype;
    }

    public final String component2() {
        return this.convertibleclasses;
    }

    public final String component3() {
        return this.descr;
    }

    public final String component4() {
        return this.transportcatg;
    }

    public final int component5() {
        return this.vhclass;
    }

    public final VhClasse copy(int i10, String str, String str2, String str3, int i11) {
        l.f(str, "convertibleclasses");
        l.f(str2, "descr");
        l.f(str3, "transportcatg");
        return new VhClasse(i10, str, str2, str3, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VhClasse)) {
            return false;
        }
        VhClasse vhClasse = (VhClasse) obj;
        return this.classtype == vhClasse.classtype && l.a(this.convertibleclasses, vhClasse.convertibleclasses) && l.a(this.descr, vhClasse.descr) && l.a(this.transportcatg, vhClasse.transportcatg) && this.vhclass == vhClasse.vhclass;
    }

    public final int getClasstype() {
        return this.classtype;
    }

    public final String getConvertibleclasses() {
        return this.convertibleclasses;
    }

    public final String getDescr() {
        return this.descr;
    }

    public final String getTransportcatg() {
        return this.transportcatg;
    }

    public final int getVhclass() {
        return this.vhclass;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.classtype) * 31) + this.convertibleclasses.hashCode()) * 31) + this.descr.hashCode()) * 31) + this.transportcatg.hashCode()) * 31) + Integer.hashCode(this.vhclass);
    }

    public String toString() {
        return "VhClasse(classtype=" + this.classtype + ", convertibleclasses=" + this.convertibleclasses + ", descr=" + this.descr + ", transportcatg=" + this.transportcatg + ", vhclass=" + this.vhclass + ')';
    }
}
