package com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DupChangeAddResponse {
    private final Result result;

    public DupChangeAddResponse(Result result2) {
        l.f(result2, "result");
        this.result = result2;
    }

    public static /* synthetic */ DupChangeAddResponse copy$default(DupChangeAddResponse dupChangeAddResponse, Result result2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            result2 = dupChangeAddResponse.result;
        }
        return dupChangeAddResponse.copy(result2);
    }

    public final Result component1() {
        return this.result;
    }

    public final DupChangeAddResponse copy(Result result2) {
        l.f(result2, "result");
        return new DupChangeAddResponse(result2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DupChangeAddResponse) && l.a(this.result, ((DupChangeAddResponse) obj).result);
    }

    public final Result getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public String toString() {
        return "DupChangeAddResponse(result=" + this.result + ')';
    }
}
