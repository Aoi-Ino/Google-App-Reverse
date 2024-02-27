package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class OwnerShipType {
    private final String codeDescription;
    private final int owCode;

    public OwnerShipType(String str, int i10) {
        l.f(str, "codeDescription");
        this.codeDescription = str;
        this.owCode = i10;
    }

    public static /* synthetic */ OwnerShipType copy$default(OwnerShipType ownerShipType, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = ownerShipType.codeDescription;
        }
        if ((i11 & 2) != 0) {
            i10 = ownerShipType.owCode;
        }
        return ownerShipType.copy(str, i10);
    }

    public final String component1() {
        return this.codeDescription;
    }

    public final int component2() {
        return this.owCode;
    }

    public final OwnerShipType copy(String str, int i10) {
        l.f(str, "codeDescription");
        return new OwnerShipType(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerShipType)) {
            return false;
        }
        OwnerShipType ownerShipType = (OwnerShipType) obj;
        return l.a(this.codeDescription, ownerShipType.codeDescription) && this.owCode == ownerShipType.owCode;
    }

    public final String getCodeDescription() {
        return this.codeDescription;
    }

    public final int getOwCode() {
        return this.owCode;
    }

    public int hashCode() {
        return (this.codeDescription.hashCode() * 31) + Integer.hashCode(this.owCode);
    }

    public String toString() {
        return "OwnerShipType(codeDescription=" + this.codeDescription + ", owCode=" + this.owCode + ')';
    }
}
