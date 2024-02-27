package com.nic.mparivahan.PushNotification.BannerModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class BannerModel {
    private final ArrayList<MparBanner> mparBannerList;
    private final String statusCode;
    private final String statusDesc;

    public BannerModel(ArrayList<MparBanner> arrayList, String str, String str2) {
        this.mparBannerList = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ BannerModel copy$default(BannerModel bannerModel, ArrayList<MparBanner> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = bannerModel.mparBannerList;
        }
        if ((i10 & 2) != 0) {
            str = bannerModel.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = bannerModel.statusDesc;
        }
        return bannerModel.copy(arrayList, str, str2);
    }

    public final ArrayList<MparBanner> component1() {
        return this.mparBannerList;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final BannerModel copy(ArrayList<MparBanner> arrayList, String str, String str2) {
        return new BannerModel(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerModel)) {
            return false;
        }
        BannerModel bannerModel = (BannerModel) obj;
        return l.a(this.mparBannerList, bannerModel.mparBannerList) && l.a(this.statusCode, bannerModel.statusCode) && l.a(this.statusDesc, bannerModel.statusDesc);
    }

    public final ArrayList<MparBanner> getMparBannerList() {
        return this.mparBannerList;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        ArrayList<MparBanner> arrayList = this.mparBannerList;
        int i10 = 0;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.statusCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusDesc;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "BannerModel(mparBannerList=" + this.mparBannerList + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
