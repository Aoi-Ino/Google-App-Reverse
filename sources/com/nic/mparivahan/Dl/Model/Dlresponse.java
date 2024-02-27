package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class Dlresponse {
    private final List<Dldetobj> dldetobj;

    public Dlresponse(List<Dldetobj> list) {
        l.f(list, "dldetobj");
        this.dldetobj = list;
    }

    public static /* synthetic */ Dlresponse copy$default(Dlresponse dlresponse, List<Dldetobj> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = dlresponse.dldetobj;
        }
        return dlresponse.copy(list);
    }

    public final List<Dldetobj> component1() {
        return this.dldetobj;
    }

    public final Dlresponse copy(List<Dldetobj> list) {
        l.f(list, "dldetobj");
        return new Dlresponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Dlresponse) && l.a(this.dldetobj, ((Dlresponse) obj).dldetobj);
    }

    public final List<Dldetobj> getDldetobj() {
        return this.dldetobj;
    }

    public int hashCode() {
        return this.dldetobj.hashCode();
    }

    public String toString() {
        return "Dlresponse(dldetobj=" + this.dldetobj + ')';
    }
}
