package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class Dlresponse implements Serializable {
    private final List<DldetobjItem> dldetobj;

    public Dlresponse() {
        this((List) null, 1, (g) null);
    }

    public static /* synthetic */ Dlresponse copy$default(Dlresponse dlresponse, List<DldetobjItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = dlresponse.dldetobj;
        }
        return dlresponse.copy(list);
    }

    public final List<DldetobjItem> component1() {
        return this.dldetobj;
    }

    public final Dlresponse copy(List<DldetobjItem> list) {
        return new Dlresponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Dlresponse) && l.a(this.dldetobj, ((Dlresponse) obj).dldetobj);
    }

    public final List<DldetobjItem> getDldetobj() {
        return this.dldetobj;
    }

    public int hashCode() {
        List<DldetobjItem> list = this.dldetobj;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "Dlresponse(dldetobj=" + this.dldetobj + ')';
    }

    public Dlresponse(List<DldetobjItem> list) {
        this.dldetobj = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Dlresponse(List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : list);
    }
}
