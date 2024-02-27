package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class OwnerCatagory {
    private final int catgCode;
    private final String catgDescription;

    public OwnerCatagory(int i10, String str) {
        l.f(str, "catgDescription");
        this.catgCode = i10;
        this.catgDescription = str;
    }

    public static /* synthetic */ OwnerCatagory copy$default(OwnerCatagory ownerCatagory, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = ownerCatagory.catgCode;
        }
        if ((i11 & 2) != 0) {
            str = ownerCatagory.catgDescription;
        }
        return ownerCatagory.copy(i10, str);
    }

    public final int component1() {
        return this.catgCode;
    }

    public final String component2() {
        return this.catgDescription;
    }

    public final OwnerCatagory copy(int i10, String str) {
        l.f(str, "catgDescription");
        return new OwnerCatagory(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerCatagory)) {
            return false;
        }
        OwnerCatagory ownerCatagory = (OwnerCatagory) obj;
        return this.catgCode == ownerCatagory.catgCode && l.a(this.catgDescription, ownerCatagory.catgDescription);
    }

    public final int getCatgCode() {
        return this.catgCode;
    }

    public final String getCatgDescription() {
        return this.catgDescription;
    }

    public int hashCode() {
        return (Integer.hashCode(this.catgCode) * 31) + this.catgDescription.hashCode();
    }

    public String toString() {
        return "OwnerCatagory(catgCode=" + this.catgCode + ", catgDescription=" + this.catgDescription + ')';
    }
}
