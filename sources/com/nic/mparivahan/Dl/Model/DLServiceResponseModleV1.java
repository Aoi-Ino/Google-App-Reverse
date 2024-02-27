package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class DLServiceResponseModleV1 implements Serializable {
    private final List<DldetobjX> dldetobj;
    private String statusCode;
    private String statusDesc;

    public DLServiceResponseModleV1(List<DldetobjX> list, String str, String str2) {
        l.f(list, "dldetobj");
        this.dldetobj = list;
        this.statusDesc = str;
        this.statusCode = str2;
    }

    public static /* synthetic */ DLServiceResponseModleV1 copy$default(DLServiceResponseModleV1 dLServiceResponseModleV1, List<DldetobjX> list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = dLServiceResponseModleV1.dldetobj;
        }
        if ((i10 & 2) != 0) {
            str = dLServiceResponseModleV1.statusDesc;
        }
        if ((i10 & 4) != 0) {
            str2 = dLServiceResponseModleV1.statusCode;
        }
        return dLServiceResponseModleV1.copy(list, str, str2);
    }

    public final List<DldetobjX> component1() {
        return this.dldetobj;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final String component3() {
        return this.statusCode;
    }

    public final DLServiceResponseModleV1 copy(List<DldetobjX> list, String str, String str2) {
        l.f(list, "dldetobj");
        return new DLServiceResponseModleV1(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DLServiceResponseModleV1)) {
            return false;
        }
        DLServiceResponseModleV1 dLServiceResponseModleV1 = (DLServiceResponseModleV1) obj;
        return l.a(this.dldetobj, dLServiceResponseModleV1.dldetobj) && l.a(this.statusDesc, dLServiceResponseModleV1.statusDesc) && l.a(this.statusCode, dLServiceResponseModleV1.statusCode);
    }

    public final List<DldetobjX> getDldetobj() {
        return this.dldetobj;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        int hashCode = this.dldetobj.hashCode() * 31;
        String str = this.statusDesc;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusCode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public final void setStatusCode(String str) {
        this.statusCode = str;
    }

    public final void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public String toString() {
        return "DLServiceResponseModleV1(dldetobj=" + this.dldetobj + ", statusDesc=" + this.statusDesc + ", statusCode=" + this.statusCode + ')';
    }
}
