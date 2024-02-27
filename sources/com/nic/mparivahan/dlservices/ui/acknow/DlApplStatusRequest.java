package com.nic.mparivahan.dlservices.ui.acknow;

import androidx.annotation.Keep;
import cm.g;
import cm.l;

@Keep
public final class DlApplStatusRequest {
    private final String applicationNumber;
    private final String dateOfBirth;

    public DlApplStatusRequest() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ DlApplStatusRequest copy$default(DlApplStatusRequest dlApplStatusRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlApplStatusRequest.applicationNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = dlApplStatusRequest.dateOfBirth;
        }
        return dlApplStatusRequest.copy(str, str2);
    }

    public final String component1() {
        return this.applicationNumber;
    }

    public final String component2() {
        return this.dateOfBirth;
    }

    public final DlApplStatusRequest copy(String str, String str2) {
        return new DlApplStatusRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlApplStatusRequest)) {
            return false;
        }
        DlApplStatusRequest dlApplStatusRequest = (DlApplStatusRequest) obj;
        return l.a(this.applicationNumber, dlApplStatusRequest.applicationNumber) && l.a(this.dateOfBirth, dlApplStatusRequest.dateOfBirth);
    }

    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public int hashCode() {
        String str = this.applicationNumber;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dateOfBirth;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "DlApplStatusRequest(applicationNumber=" + this.applicationNumber + ", dateOfBirth=" + this.dateOfBirth + ')';
    }

    public DlApplStatusRequest(String str, String str2) {
        this.applicationNumber = str;
        this.dateOfBirth = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlApplStatusRequest(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
