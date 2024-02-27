package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class Mandatory {
    private final String catId;
    private final String catName;
    private final boolean docApproved;
    private final boolean docRecieved;
    private final boolean docUploaded;
    private final boolean docVerified;
    private final String mandatory;
    private final List<SubcategoryMasterData> subcategoryMasterDataList;
    private final boolean tempDocApproved;

    public Mandatory(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, String str3, List<SubcategoryMasterData> list, boolean z14) {
        l.f(str, "catId");
        l.f(str2, "catName");
        l.f(str3, "mandatory");
        l.f(list, "subcategoryMasterDataList");
        this.catId = str;
        this.catName = str2;
        this.docApproved = z10;
        this.docRecieved = z11;
        this.docUploaded = z12;
        this.docVerified = z13;
        this.mandatory = str3;
        this.subcategoryMasterDataList = list;
        this.tempDocApproved = z14;
    }

    public static /* synthetic */ Mandatory copy$default(Mandatory mandatory2, String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, String str3, List list, boolean z14, int i10, Object obj) {
        Mandatory mandatory3 = mandatory2;
        int i11 = i10;
        return mandatory2.copy((i11 & 1) != 0 ? mandatory3.catId : str, (i11 & 2) != 0 ? mandatory3.catName : str2, (i11 & 4) != 0 ? mandatory3.docApproved : z10, (i11 & 8) != 0 ? mandatory3.docRecieved : z11, (i11 & 16) != 0 ? mandatory3.docUploaded : z12, (i11 & 32) != 0 ? mandatory3.docVerified : z13, (i11 & 64) != 0 ? mandatory3.mandatory : str3, (i11 & 128) != 0 ? mandatory3.subcategoryMasterDataList : list, (i11 & 256) != 0 ? mandatory3.tempDocApproved : z14);
    }

    public final String component1() {
        return this.catId;
    }

    public final String component2() {
        return this.catName;
    }

    public final boolean component3() {
        return this.docApproved;
    }

    public final boolean component4() {
        return this.docRecieved;
    }

    public final boolean component5() {
        return this.docUploaded;
    }

    public final boolean component6() {
        return this.docVerified;
    }

    public final String component7() {
        return this.mandatory;
    }

    public final List<SubcategoryMasterData> component8() {
        return this.subcategoryMasterDataList;
    }

    public final boolean component9() {
        return this.tempDocApproved;
    }

    public final Mandatory copy(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, String str3, List<SubcategoryMasterData> list, boolean z14) {
        l.f(str, "catId");
        l.f(str2, "catName");
        String str4 = str3;
        l.f(str4, "mandatory");
        List<SubcategoryMasterData> list2 = list;
        l.f(list2, "subcategoryMasterDataList");
        return new Mandatory(str, str2, z10, z11, z12, z13, str4, list2, z14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mandatory)) {
            return false;
        }
        Mandatory mandatory2 = (Mandatory) obj;
        return l.a(this.catId, mandatory2.catId) && l.a(this.catName, mandatory2.catName) && this.docApproved == mandatory2.docApproved && this.docRecieved == mandatory2.docRecieved && this.docUploaded == mandatory2.docUploaded && this.docVerified == mandatory2.docVerified && l.a(this.mandatory, mandatory2.mandatory) && l.a(this.subcategoryMasterDataList, mandatory2.subcategoryMasterDataList) && this.tempDocApproved == mandatory2.tempDocApproved;
    }

    public final String getCatId() {
        return this.catId;
    }

    public final String getCatName() {
        return this.catName;
    }

    public final boolean getDocApproved() {
        return this.docApproved;
    }

    public final boolean getDocRecieved() {
        return this.docRecieved;
    }

    public final boolean getDocUploaded() {
        return this.docUploaded;
    }

    public final boolean getDocVerified() {
        return this.docVerified;
    }

    public final String getMandatory() {
        return this.mandatory;
    }

    public final List<SubcategoryMasterData> getSubcategoryMasterDataList() {
        return this.subcategoryMasterDataList;
    }

    public final boolean getTempDocApproved() {
        return this.tempDocApproved;
    }

    public int hashCode() {
        int hashCode = ((this.catId.hashCode() * 31) + this.catName.hashCode()) * 31;
        boolean z10 = this.docApproved;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (hashCode + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.docRecieved;
        if (z12) {
            z12 = true;
        }
        int i11 = (i10 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.docUploaded;
        if (z13) {
            z13 = true;
        }
        int i12 = (i11 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.docVerified;
        if (z14) {
            z14 = true;
        }
        int hashCode2 = (((((i12 + (z14 ? 1 : 0)) * 31) + this.mandatory.hashCode()) * 31) + this.subcategoryMasterDataList.hashCode()) * 31;
        boolean z15 = this.tempDocApproved;
        if (!z15) {
            z11 = z15;
        }
        return hashCode2 + (z11 ? 1 : 0);
    }

    public String toString() {
        return "Mandatory(catId=" + this.catId + ", catName=" + this.catName + ", docApproved=" + this.docApproved + ", docRecieved=" + this.docRecieved + ", docUploaded=" + this.docUploaded + ", docVerified=" + this.docVerified + ", mandatory=" + this.mandatory + ", subcategoryMasterDataList=" + this.subcategoryMasterDataList + ", tempDocApproved=" + this.tempDocApproved + ')';
    }
}
