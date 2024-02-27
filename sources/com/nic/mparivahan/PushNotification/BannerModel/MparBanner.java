package com.nic.mparivahan.PushNotification.BannerModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MparBanner {

    /* renamed from: id  reason: collision with root package name */
    private final int f9422id;
    private final String imgDesc;
    private final String imgUrl;
    private final int isActive;
    private final Boolean isAndroid;
    private final Boolean isIos;
    private final String stateCd;

    public MparBanner(int i10, String str, String str2, int i11, Boolean bool, Boolean bool2, String str3) {
        this.f9422id = i10;
        this.imgDesc = str;
        this.imgUrl = str2;
        this.isActive = i11;
        this.isAndroid = bool;
        this.isIos = bool2;
        this.stateCd = str3;
    }

    public static /* synthetic */ MparBanner copy$default(MparBanner mparBanner, int i10, String str, String str2, int i11, Boolean bool, Boolean bool2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = mparBanner.f9422id;
        }
        if ((i12 & 2) != 0) {
            str = mparBanner.imgDesc;
        }
        String str4 = str;
        if ((i12 & 4) != 0) {
            str2 = mparBanner.imgUrl;
        }
        String str5 = str2;
        if ((i12 & 8) != 0) {
            i11 = mparBanner.isActive;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            bool = mparBanner.isAndroid;
        }
        Boolean bool3 = bool;
        if ((i12 & 32) != 0) {
            bool2 = mparBanner.isIos;
        }
        Boolean bool4 = bool2;
        if ((i12 & 64) != 0) {
            str3 = mparBanner.stateCd;
        }
        return mparBanner.copy(i10, str4, str5, i13, bool3, bool4, str3);
    }

    public final int component1() {
        return this.f9422id;
    }

    public final String component2() {
        return this.imgDesc;
    }

    public final String component3() {
        return this.imgUrl;
    }

    public final int component4() {
        return this.isActive;
    }

    public final Boolean component5() {
        return this.isAndroid;
    }

    public final Boolean component6() {
        return this.isIos;
    }

    public final String component7() {
        return this.stateCd;
    }

    public final MparBanner copy(int i10, String str, String str2, int i11, Boolean bool, Boolean bool2, String str3) {
        return new MparBanner(i10, str, str2, i11, bool, bool2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MparBanner)) {
            return false;
        }
        MparBanner mparBanner = (MparBanner) obj;
        return this.f9422id == mparBanner.f9422id && l.a(this.imgDesc, mparBanner.imgDesc) && l.a(this.imgUrl, mparBanner.imgUrl) && this.isActive == mparBanner.isActive && l.a(this.isAndroid, mparBanner.isAndroid) && l.a(this.isIos, mparBanner.isIos) && l.a(this.stateCd, mparBanner.stateCd);
    }

    public final int getId() {
        return this.f9422id;
    }

    public final String getImgDesc() {
        return this.imgDesc;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f9422id) * 31;
        String str = this.imgDesc;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imgUrl;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.isActive)) * 31;
        Boolean bool = this.isAndroid;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isIos;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.stateCd;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode5 + i10;
    }

    public final int isActive() {
        return this.isActive;
    }

    public final Boolean isAndroid() {
        return this.isAndroid;
    }

    public final Boolean isIos() {
        return this.isIos;
    }

    public String toString() {
        return "MparBanner(id=" + this.f9422id + ", imgDesc=" + this.imgDesc + ", imgUrl=" + this.imgUrl + ", isActive=" + this.isActive + ", isAndroid=" + this.isAndroid + ", isIos=" + this.isIos + ", stateCd=" + this.stateCd + ')';
    }
}
