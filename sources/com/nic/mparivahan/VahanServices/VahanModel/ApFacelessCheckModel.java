package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ApFacelessCheckModel {
    private final boolean aadhaaraddresspermanent;
    private final boolean auth_signtaure_fornon_indv_vehicle;
    private final boolean buyer_exactname;
    private final Object buyer_prcnt_match;
    private final boolean careof_name;
    private final boolean exactname;
    private final String facelesswithaadharonly;
    private final int partial_match;
    private final boolean self_name;
    private final String state_cd;
    private final boolean updatemoballowonadharfailed;

    public ApFacelessCheckModel(boolean z10, boolean z11, boolean z12, Object obj, boolean z13, boolean z14, String str, int i10, boolean z15, String str2, boolean z16) {
        l.f(obj, "buyer_prcnt_match");
        l.f(str2, "state_cd");
        this.aadhaaraddresspermanent = z10;
        this.auth_signtaure_fornon_indv_vehicle = z11;
        this.buyer_exactname = z12;
        this.buyer_prcnt_match = obj;
        this.careof_name = z13;
        this.exactname = z14;
        this.facelesswithaadharonly = str;
        this.partial_match = i10;
        this.self_name = z15;
        this.state_cd = str2;
        this.updatemoballowonadharfailed = z16;
    }

    public static /* synthetic */ ApFacelessCheckModel copy$default(ApFacelessCheckModel apFacelessCheckModel, boolean z10, boolean z11, boolean z12, Object obj, boolean z13, boolean z14, String str, int i10, boolean z15, String str2, boolean z16, int i11, Object obj2) {
        ApFacelessCheckModel apFacelessCheckModel2 = apFacelessCheckModel;
        int i12 = i11;
        return apFacelessCheckModel.copy((i12 & 1) != 0 ? apFacelessCheckModel2.aadhaaraddresspermanent : z10, (i12 & 2) != 0 ? apFacelessCheckModel2.auth_signtaure_fornon_indv_vehicle : z11, (i12 & 4) != 0 ? apFacelessCheckModel2.buyer_exactname : z12, (i12 & 8) != 0 ? apFacelessCheckModel2.buyer_prcnt_match : obj, (i12 & 16) != 0 ? apFacelessCheckModel2.careof_name : z13, (i12 & 32) != 0 ? apFacelessCheckModel2.exactname : z14, (i12 & 64) != 0 ? apFacelessCheckModel2.facelesswithaadharonly : str, (i12 & 128) != 0 ? apFacelessCheckModel2.partial_match : i10, (i12 & 256) != 0 ? apFacelessCheckModel2.self_name : z15, (i12 & 512) != 0 ? apFacelessCheckModel2.state_cd : str2, (i12 & 1024) != 0 ? apFacelessCheckModel2.updatemoballowonadharfailed : z16);
    }

    public final boolean component1() {
        return this.aadhaaraddresspermanent;
    }

    public final String component10() {
        return this.state_cd;
    }

    public final boolean component11() {
        return this.updatemoballowonadharfailed;
    }

    public final boolean component2() {
        return this.auth_signtaure_fornon_indv_vehicle;
    }

    public final boolean component3() {
        return this.buyer_exactname;
    }

    public final Object component4() {
        return this.buyer_prcnt_match;
    }

    public final boolean component5() {
        return this.careof_name;
    }

    public final boolean component6() {
        return this.exactname;
    }

    public final String component7() {
        return this.facelesswithaadharonly;
    }

    public final int component8() {
        return this.partial_match;
    }

    public final boolean component9() {
        return this.self_name;
    }

    public final ApFacelessCheckModel copy(boolean z10, boolean z11, boolean z12, Object obj, boolean z13, boolean z14, String str, int i10, boolean z15, String str2, boolean z16) {
        Object obj2 = obj;
        l.f(obj2, "buyer_prcnt_match");
        String str3 = str2;
        l.f(str3, "state_cd");
        return new ApFacelessCheckModel(z10, z11, z12, obj2, z13, z14, str, i10, z15, str3, z16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApFacelessCheckModel)) {
            return false;
        }
        ApFacelessCheckModel apFacelessCheckModel = (ApFacelessCheckModel) obj;
        return this.aadhaaraddresspermanent == apFacelessCheckModel.aadhaaraddresspermanent && this.auth_signtaure_fornon_indv_vehicle == apFacelessCheckModel.auth_signtaure_fornon_indv_vehicle && this.buyer_exactname == apFacelessCheckModel.buyer_exactname && l.a(this.buyer_prcnt_match, apFacelessCheckModel.buyer_prcnt_match) && this.careof_name == apFacelessCheckModel.careof_name && this.exactname == apFacelessCheckModel.exactname && l.a(this.facelesswithaadharonly, apFacelessCheckModel.facelesswithaadharonly) && this.partial_match == apFacelessCheckModel.partial_match && this.self_name == apFacelessCheckModel.self_name && l.a(this.state_cd, apFacelessCheckModel.state_cd) && this.updatemoballowonadharfailed == apFacelessCheckModel.updatemoballowonadharfailed;
    }

    public final boolean getAadhaaraddresspermanent() {
        return this.aadhaaraddresspermanent;
    }

    public final boolean getAuth_signtaure_fornon_indv_vehicle() {
        return this.auth_signtaure_fornon_indv_vehicle;
    }

    public final boolean getBuyer_exactname() {
        return this.buyer_exactname;
    }

    public final Object getBuyer_prcnt_match() {
        return this.buyer_prcnt_match;
    }

    public final boolean getCareof_name() {
        return this.careof_name;
    }

    public final boolean getExactname() {
        return this.exactname;
    }

    public final String getFacelesswithaadharonly() {
        return this.facelesswithaadharonly;
    }

    public final int getPartial_match() {
        return this.partial_match;
    }

    public final boolean getSelf_name() {
        return this.self_name;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final boolean getUpdatemoballowonadharfailed() {
        return this.updatemoballowonadharfailed;
    }

    public int hashCode() {
        boolean z10 = this.aadhaaraddresspermanent;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (z10 ? 1 : 0) * true;
        boolean z12 = this.auth_signtaure_fornon_indv_vehicle;
        if (z12) {
            z12 = true;
        }
        int i11 = (i10 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.buyer_exactname;
        if (z13) {
            z13 = true;
        }
        int hashCode = (((i11 + (z13 ? 1 : 0)) * 31) + this.buyer_prcnt_match.hashCode()) * 31;
        boolean z14 = this.careof_name;
        if (z14) {
            z14 = true;
        }
        int i12 = (hashCode + (z14 ? 1 : 0)) * 31;
        boolean z15 = this.exactname;
        if (z15) {
            z15 = true;
        }
        int i13 = (i12 + (z15 ? 1 : 0)) * 31;
        String str = this.facelesswithaadharonly;
        int hashCode2 = (((i13 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.partial_match)) * 31;
        boolean z16 = this.self_name;
        if (z16) {
            z16 = true;
        }
        int hashCode3 = (((hashCode2 + (z16 ? 1 : 0)) * 31) + this.state_cd.hashCode()) * 31;
        boolean z17 = this.updatemoballowonadharfailed;
        if (!z17) {
            z11 = z17;
        }
        return hashCode3 + (z11 ? 1 : 0);
    }

    public String toString() {
        return "ApFacelessCheckModel(aadhaaraddresspermanent=" + this.aadhaaraddresspermanent + ", auth_signtaure_fornon_indv_vehicle=" + this.auth_signtaure_fornon_indv_vehicle + ", buyer_exactname=" + this.buyer_exactname + ", buyer_prcnt_match=" + this.buyer_prcnt_match + ", careof_name=" + this.careof_name + ", exactname=" + this.exactname + ", facelesswithaadharonly=" + this.facelesswithaadharonly + ", partial_match=" + this.partial_match + ", self_name=" + this.self_name + ", state_cd=" + this.state_cd + ", updatemoballowonadharfailed=" + this.updatemoballowonadharfailed + ')';
    }
}
