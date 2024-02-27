package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlDetails {
    private final DlRequest dlRequest;

    public DlDetails(DlRequest dlRequest2) {
        l.f(dlRequest2, "dlRequest");
        this.dlRequest = dlRequest2;
    }

    public static /* synthetic */ DlDetails copy$default(DlDetails dlDetails, DlRequest dlRequest2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dlRequest2 = dlDetails.dlRequest;
        }
        return dlDetails.copy(dlRequest2);
    }

    public final DlRequest component1() {
        return this.dlRequest;
    }

    public final DlDetails copy(DlRequest dlRequest2) {
        l.f(dlRequest2, "dlRequest");
        return new DlDetails(dlRequest2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DlDetails) && l.a(this.dlRequest, ((DlDetails) obj).dlRequest);
    }

    public final DlRequest getDlRequest() {
        return this.dlRequest;
    }

    public int hashCode() {
        return this.dlRequest.hashCode();
    }

    public String toString() {
        return "DlDetails(dlRequest=" + this.dlRequest + ')';
    }
}
