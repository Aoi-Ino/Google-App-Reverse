package com.nic.mparivahan.NewDlScreen.Modal;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class RTOAddressListModal {
    @c("addValue")
    private String addValue;

    public RTOAddressListModal() {
        this((String) null, 1, (g) null);
    }

    public static /* synthetic */ RTOAddressListModal copy$default(RTOAddressListModal rTOAddressListModal, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rTOAddressListModal.addValue;
        }
        return rTOAddressListModal.copy(str);
    }

    public final String component1() {
        return this.addValue;
    }

    public final RTOAddressListModal copy(String str) {
        return new RTOAddressListModal(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RTOAddressListModal) && l.a(this.addValue, ((RTOAddressListModal) obj).addValue);
    }

    public final String getAddValue() {
        return this.addValue;
    }

    public int hashCode() {
        String str = this.addValue;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setAddValue(String str) {
        this.addValue = str;
    }

    public String toString() {
        return "RTOAddressListModal(addValue=" + this.addValue + ')';
    }

    public RTOAddressListModal(String str) {
        this.addValue = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RTOAddressListModal(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
