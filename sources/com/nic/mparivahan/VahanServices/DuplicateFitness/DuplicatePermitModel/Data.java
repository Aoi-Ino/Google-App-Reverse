package com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class Data {
    private final ArrayList<Doclist> doclist;

    public Data(ArrayList<Doclist> arrayList) {
        l.f(arrayList, "doclist");
        this.doclist = arrayList;
    }

    public static /* synthetic */ Data copy$default(Data data, ArrayList<Doclist> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = data.doclist;
        }
        return data.copy(arrayList);
    }

    public final ArrayList<Doclist> component1() {
        return this.doclist;
    }

    public final Data copy(ArrayList<Doclist> arrayList) {
        l.f(arrayList, "doclist");
        return new Data(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Data) && l.a(this.doclist, ((Data) obj).doclist);
    }

    public final ArrayList<Doclist> getDoclist() {
        return this.doclist;
    }

    public int hashCode() {
        return this.doclist.hashCode();
    }

    public String toString() {
        return "Data(doclist=" + this.doclist + ')';
    }
}
