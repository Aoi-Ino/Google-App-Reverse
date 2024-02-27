package com.nic.mparivahan.VahanServices.ApplicationStatusModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class Currentlist implements Serializable {
    private final List<Applnolist> applnolist;

    public Currentlist(List<Applnolist> list) {
        l.f(list, "applnolist");
        this.applnolist = list;
    }

    public static /* synthetic */ Currentlist copy$default(Currentlist currentlist, List<Applnolist> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = currentlist.applnolist;
        }
        return currentlist.copy(list);
    }

    public final List<Applnolist> component1() {
        return this.applnolist;
    }

    public final Currentlist copy(List<Applnolist> list) {
        l.f(list, "applnolist");
        return new Currentlist(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Currentlist) && l.a(this.applnolist, ((Currentlist) obj).applnolist);
    }

    public final List<Applnolist> getApplnolist() {
        return this.applnolist;
    }

    public int hashCode() {
        return this.applnolist.hashCode();
    }

    public String toString() {
        return "Currentlist(applnolist=" + this.applnolist + ')';
    }
}
