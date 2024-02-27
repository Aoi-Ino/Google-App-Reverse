package com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DuplicateList {
    private final Data data;

    public DuplicateList(Data data2) {
        l.f(data2, "data");
        this.data = data2;
    }

    public static /* synthetic */ DuplicateList copy$default(DuplicateList duplicateList, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            data2 = duplicateList.data;
        }
        return duplicateList.copy(data2);
    }

    public final Data component1() {
        return this.data;
    }

    public final DuplicateList copy(Data data2) {
        l.f(data2, "data");
        return new DuplicateList(data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DuplicateList) && l.a(this.data, ((DuplicateList) obj).data);
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "DuplicateList(data=" + this.data + ')';
    }
}
