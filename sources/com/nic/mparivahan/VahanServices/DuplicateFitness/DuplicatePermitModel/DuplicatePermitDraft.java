package com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class DuplicatePermitDraft implements Serializable {
    private final DataX data;

    public DuplicatePermitDraft(DataX dataX) {
        l.f(dataX, "data");
        this.data = dataX;
    }

    public static /* synthetic */ DuplicatePermitDraft copy$default(DuplicatePermitDraft duplicatePermitDraft, DataX dataX, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dataX = duplicatePermitDraft.data;
        }
        return duplicatePermitDraft.copy(dataX);
    }

    public final DataX component1() {
        return this.data;
    }

    public final DuplicatePermitDraft copy(DataX dataX) {
        l.f(dataX, "data");
        return new DuplicatePermitDraft(dataX);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DuplicatePermitDraft) && l.a(this.data, ((DuplicatePermitDraft) obj).data);
    }

    public final DataX getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "DuplicatePermitDraft(data=" + this.data + ')';
    }
}
