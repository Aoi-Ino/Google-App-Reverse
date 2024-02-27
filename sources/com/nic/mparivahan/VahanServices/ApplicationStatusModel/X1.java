package com.nic.mparivahan.VahanServices.ApplicationStatusModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public final class X1 implements Serializable {
    private final ArrayList<Currentlist> currentlist;

    public X1(ArrayList<Currentlist> arrayList) {
        l.f(arrayList, "currentlist");
        this.currentlist = arrayList;
    }

    public static /* synthetic */ X1 copy$default(X1 x12, ArrayList<Currentlist> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = x12.currentlist;
        }
        return x12.copy(arrayList);
    }

    public final ArrayList<Currentlist> component1() {
        return this.currentlist;
    }

    public final X1 copy(ArrayList<Currentlist> arrayList) {
        l.f(arrayList, "currentlist");
        return new X1(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof X1) && l.a(this.currentlist, ((X1) obj).currentlist);
    }

    public final ArrayList<Currentlist> getCurrentlist() {
        return this.currentlist;
    }

    public int hashCode() {
        return this.currentlist.hashCode();
    }

    public String toString() {
        return "X1(currentlist=" + this.currentlist + ')';
    }
}
