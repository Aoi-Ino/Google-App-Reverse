package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlRtoRequest {
    private String stateCd;

    public DlRtoRequest(String str) {
        this.stateCd = str;
    }

    public static /* synthetic */ DlRtoRequest copy$default(DlRtoRequest dlRtoRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlRtoRequest.stateCd;
        }
        return dlRtoRequest.copy(str);
    }

    public final String component1() {
        return this.stateCd;
    }

    public final DlRtoRequest copy(String str) {
        return new DlRtoRequest(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DlRtoRequest) && l.a(this.stateCd, ((DlRtoRequest) obj).stateCd);
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        String str = this.stateCd;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setStateCd(String str) {
        this.stateCd = str;
    }

    public String toString() {
        return "{\"stateCd\"=\"" + this.stateCd + "\" }";
    }
}
