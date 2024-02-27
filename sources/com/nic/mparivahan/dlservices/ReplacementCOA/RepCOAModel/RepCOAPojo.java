package com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class RepCOAPojo {
    private final Result result;

    public RepCOAPojo(Result result2) {
        l.f(result2, "result");
        this.result = result2;
    }

    public static /* synthetic */ RepCOAPojo copy$default(RepCOAPojo repCOAPojo, Result result2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            result2 = repCOAPojo.result;
        }
        return repCOAPojo.copy(result2);
    }

    public final Result component1() {
        return this.result;
    }

    public final RepCOAPojo copy(Result result2) {
        l.f(result2, "result");
        return new RepCOAPojo(result2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RepCOAPojo) && l.a(this.result, ((RepCOAPojo) obj).result);
    }

    public final Result getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public String toString() {
        return "RepCOAPojo(result=" + this.result + ')';
    }
}
