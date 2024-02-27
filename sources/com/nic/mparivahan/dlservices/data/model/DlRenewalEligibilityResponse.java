package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class DlRenewalEligibilityResponse {
    @c("dlservicesValidationdto")
    private final DlservicesValidationdto dlservicesValidationdto;

    public DlRenewalEligibilityResponse() {
        this((DlservicesValidationdto) null, 1, (g) null);
    }

    public static /* synthetic */ DlRenewalEligibilityResponse copy$default(DlRenewalEligibilityResponse dlRenewalEligibilityResponse, DlservicesValidationdto dlservicesValidationdto2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dlservicesValidationdto2 = dlRenewalEligibilityResponse.dlservicesValidationdto;
        }
        return dlRenewalEligibilityResponse.copy(dlservicesValidationdto2);
    }

    public final DlservicesValidationdto component1() {
        return this.dlservicesValidationdto;
    }

    public final DlRenewalEligibilityResponse copy(DlservicesValidationdto dlservicesValidationdto2) {
        return new DlRenewalEligibilityResponse(dlservicesValidationdto2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DlRenewalEligibilityResponse) && l.a(this.dlservicesValidationdto, ((DlRenewalEligibilityResponse) obj).dlservicesValidationdto);
    }

    public final DlservicesValidationdto getDlservicesValidationdto() {
        return this.dlservicesValidationdto;
    }

    public int hashCode() {
        DlservicesValidationdto dlservicesValidationdto2 = this.dlservicesValidationdto;
        if (dlservicesValidationdto2 == null) {
            return 0;
        }
        return dlservicesValidationdto2.hashCode();
    }

    public String toString() {
        return "DlRenewalEligibilityResponse(dlservicesValidationdto=" + this.dlservicesValidationdto + ')';
    }

    public DlRenewalEligibilityResponse(DlservicesValidationdto dlservicesValidationdto2) {
        this.dlservicesValidationdto = dlservicesValidationdto2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlRenewalEligibilityResponse(DlservicesValidationdto dlservicesValidationdto2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : dlservicesValidationdto2);
    }
}
