package com.nic.mparivahan.VahanServices.CompoundingFee.ComModle;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class Feelist {
    private final ArrayList<Fees> feesList;

    public Feelist(ArrayList<Fees> arrayList) {
        l.f(arrayList, "feesList");
        this.feesList = arrayList;
    }

    public static /* synthetic */ Feelist copy$default(Feelist feelist, ArrayList<Fees> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = feelist.feesList;
        }
        return feelist.copy(arrayList);
    }

    public final ArrayList<Fees> component1() {
        return this.feesList;
    }

    public final Feelist copy(ArrayList<Fees> arrayList) {
        l.f(arrayList, "feesList");
        return new Feelist(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Feelist) && l.a(this.feesList, ((Feelist) obj).feesList);
    }

    public final ArrayList<Fees> getFeesList() {
        return this.feesList;
    }

    public int hashCode() {
        return this.feesList.hashCode();
    }

    public String toString() {
        return "Feelist(feesList=" + this.feesList + ')';
    }
}
