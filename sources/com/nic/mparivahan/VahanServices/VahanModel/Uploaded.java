package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class Uploaded {
    private final String catId;
    private final String catName;
    private final boolean docApproved;
    private final boolean docRecieved;
    private final boolean docUploaded;
    private final String docUploadedDate;
    private final String docUrl;
    private final boolean docVerified;
    private final String mandatory;
    private final String objectId;
    private final SubcategoryMasterDataXX subcategoryMasterData;
    private final List<SubcategoryMasterDataXXX> subcategoryMasterDataList;
    private final boolean tempDocApproved;
    private final String uniqueRefNo;

    public Uploaded(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, String str4, boolean z13, String str5, String str6, SubcategoryMasterDataXX subcategoryMasterDataXX, List<SubcategoryMasterDataXXX> list, boolean z14, String str7) {
        l.f(str, "catId");
        l.f(str2, "catName");
        l.f(str3, "docUploadedDate");
        l.f(str4, "docUrl");
        l.f(str5, "mandatory");
        l.f(str6, "objectId");
        l.f(subcategoryMasterDataXX, "subcategoryMasterData");
        l.f(list, "subcategoryMasterDataList");
        l.f(str7, "uniqueRefNo");
        this.catId = str;
        this.catName = str2;
        this.docApproved = z10;
        this.docRecieved = z11;
        this.docUploaded = z12;
        this.docUploadedDate = str3;
        this.docUrl = str4;
        this.docVerified = z13;
        this.mandatory = str5;
        this.objectId = str6;
        this.subcategoryMasterData = subcategoryMasterDataXX;
        this.subcategoryMasterDataList = list;
        this.tempDocApproved = z14;
        this.uniqueRefNo = str7;
    }

    public static /* synthetic */ Uploaded copy$default(Uploaded uploaded, String str, String str2, boolean z10, boolean z11, boolean z12, String str3, String str4, boolean z13, String str5, String str6, SubcategoryMasterDataXX subcategoryMasterDataXX, List list, boolean z14, String str7, int i10, Object obj) {
        Uploaded uploaded2 = uploaded;
        int i11 = i10;
        return uploaded.copy((i11 & 1) != 0 ? uploaded2.catId : str, (i11 & 2) != 0 ? uploaded2.catName : str2, (i11 & 4) != 0 ? uploaded2.docApproved : z10, (i11 & 8) != 0 ? uploaded2.docRecieved : z11, (i11 & 16) != 0 ? uploaded2.docUploaded : z12, (i11 & 32) != 0 ? uploaded2.docUploadedDate : str3, (i11 & 64) != 0 ? uploaded2.docUrl : str4, (i11 & 128) != 0 ? uploaded2.docVerified : z13, (i11 & 256) != 0 ? uploaded2.mandatory : str5, (i11 & 512) != 0 ? uploaded2.objectId : str6, (i11 & 1024) != 0 ? uploaded2.subcategoryMasterData : subcategoryMasterDataXX, (i11 & 2048) != 0 ? uploaded2.subcategoryMasterDataList : list, (i11 & 4096) != 0 ? uploaded2.tempDocApproved : z14, (i11 & 8192) != 0 ? uploaded2.uniqueRefNo : str7);
    }

    public final String component1() {
        return this.catId;
    }

    public final String component10() {
        return this.objectId;
    }

    public final SubcategoryMasterDataXX component11() {
        return this.subcategoryMasterData;
    }

    public final List<SubcategoryMasterDataXXX> component12() {
        return this.subcategoryMasterDataList;
    }

    public final boolean component13() {
        return this.tempDocApproved;
    }

    public final String component14() {
        return this.uniqueRefNo;
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

    public final String component6() {
        return this.docUploadedDate;
    }

    public final String component7() {
        return this.docUrl;
    }

    public final boolean component8() {
        return this.docVerified;
    }

    public final String component9() {
        return this.mandatory;
    }

    public final Uploaded copy(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, String str4, boolean z13, String str5, String str6, SubcategoryMasterDataXX subcategoryMasterDataXX, List<SubcategoryMasterDataXXX> list, boolean z14, String str7) {
        String str8 = str;
        l.f(str8, "catId");
        String str9 = str2;
        l.f(str9, "catName");
        String str10 = str3;
        l.f(str10, "docUploadedDate");
        String str11 = str4;
        l.f(str11, "docUrl");
        String str12 = str5;
        l.f(str12, "mandatory");
        String str13 = str6;
        l.f(str13, "objectId");
        SubcategoryMasterDataXX subcategoryMasterDataXX2 = subcategoryMasterDataXX;
        l.f(subcategoryMasterDataXX2, "subcategoryMasterData");
        List<SubcategoryMasterDataXXX> list2 = list;
        l.f(list2, "subcategoryMasterDataList");
        String str14 = str7;
        l.f(str14, "uniqueRefNo");
        return new Uploaded(str8, str9, z10, z11, z12, str10, str11, z13, str12, str13, subcategoryMasterDataXX2, list2, z14, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uploaded)) {
            return false;
        }
        Uploaded uploaded = (Uploaded) obj;
        return l.a(this.catId, uploaded.catId) && l.a(this.catName, uploaded.catName) && this.docApproved == uploaded.docApproved && this.docRecieved == uploaded.docRecieved && this.docUploaded == uploaded.docUploaded && l.a(this.docUploadedDate, uploaded.docUploadedDate) && l.a(this.docUrl, uploaded.docUrl) && this.docVerified == uploaded.docVerified && l.a(this.mandatory, uploaded.mandatory) && l.a(this.objectId, uploaded.objectId) && l.a(this.subcategoryMasterData, uploaded.subcategoryMasterData) && l.a(this.subcategoryMasterDataList, uploaded.subcategoryMasterDataList) && this.tempDocApproved == uploaded.tempDocApproved && l.a(this.uniqueRefNo, uploaded.uniqueRefNo);
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

    public final String getDocUploadedDate() {
        return this.docUploadedDate;
    }

    public final String getDocUrl() {
        return this.docUrl;
    }

    public final boolean getDocVerified() {
        return this.docVerified;
    }

    public final String getMandatory() {
        return this.mandatory;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final SubcategoryMasterDataXX getSubcategoryMasterData() {
        return this.subcategoryMasterData;
    }

    public final List<SubcategoryMasterDataXXX> getSubcategoryMasterDataList() {
        return this.subcategoryMasterDataList;
    }

    public final boolean getTempDocApproved() {
        return this.tempDocApproved;
    }

    public final String getUniqueRefNo() {
        return this.uniqueRefNo;
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
        int hashCode2 = (((((i11 + (z13 ? 1 : 0)) * 31) + this.docUploadedDate.hashCode()) * 31) + this.docUrl.hashCode()) * 31;
        boolean z14 = this.docVerified;
        if (z14) {
            z14 = true;
        }
        int hashCode3 = (((((((((hashCode2 + (z14 ? 1 : 0)) * 31) + this.mandatory.hashCode()) * 31) + this.objectId.hashCode()) * 31) + this.subcategoryMasterData.hashCode()) * 31) + this.subcategoryMasterDataList.hashCode()) * 31;
        boolean z15 = this.tempDocApproved;
        if (!z15) {
            z11 = z15;
        }
        return ((hashCode3 + (z11 ? 1 : 0)) * 31) + this.uniqueRefNo.hashCode();
    }

    public String toString() {
        return "Uploaded(catId=" + this.catId + ", catName=" + this.catName + ", docApproved=" + this.docApproved + ", docRecieved=" + this.docRecieved + ", docUploaded=" + this.docUploaded + ", docUploadedDate=" + this.docUploadedDate + ", docUrl=" + this.docUrl + ", docVerified=" + this.docVerified + ", mandatory=" + this.mandatory + ", objectId=" + this.objectId + ", subcategoryMasterData=" + this.subcategoryMasterData + ", subcategoryMasterDataList=" + this.subcategoryMasterDataList + ", tempDocApproved=" + this.tempDocApproved + ", uniqueRefNo=" + this.uniqueRefNo + ')';
    }
}
