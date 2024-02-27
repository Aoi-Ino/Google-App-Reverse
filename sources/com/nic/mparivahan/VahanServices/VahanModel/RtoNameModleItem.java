package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import j7.c;

@Keep
public final class RtoNameModleItem {
    @c("dist_cd")
    private final String dist_cd;
    @c("email_id")
    private final String email_id;
    @c("landline")
    private final String landline;
    @c("mobile_no")
    private final String mobile_no;
    @c("off_add1")
    private final String off_add1;
    @c("off_cd")
    private final String off_cd;
    @c("off_name")
    private final String off_name;
    @c("off_type_cd")
    private final String off_type_cd;
    @c("off_under_cd")
    private final String off_under_cd;
    @c("pin_cd")
    private final String pin_cd;
    @c("state_cd")
    private final String state_cd;
    @c("taluk_cd")
    private final String taluk_cd;
    @c("village_cd")
    private final String village_cd;

    public RtoNameModleItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        l.f(str, "dist_cd");
        l.f(str2, "email_id");
        l.f(str3, "landline");
        l.f(str4, "mobile_no");
        l.f(str5, "off_add1");
        l.f(str6, "off_cd");
        l.f(str7, "off_name");
        l.f(str8, "off_type_cd");
        l.f(str9, "off_under_cd");
        l.f(str10, "pin_cd");
        l.f(str11, "state_cd");
        l.f(str12, "taluk_cd");
        l.f(str13, "village_cd");
        this.dist_cd = str;
        this.email_id = str2;
        this.landline = str3;
        this.mobile_no = str4;
        this.off_add1 = str5;
        this.off_cd = str6;
        this.off_name = str7;
        this.off_type_cd = str8;
        this.off_under_cd = str9;
        this.pin_cd = str10;
        this.state_cd = str11;
        this.taluk_cd = str12;
        this.village_cd = str13;
    }

    public static /* synthetic */ RtoNameModleItem copy$default(RtoNameModleItem rtoNameModleItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i10, Object obj) {
        RtoNameModleItem rtoNameModleItem2 = rtoNameModleItem;
        int i11 = i10;
        return rtoNameModleItem.copy((i11 & 1) != 0 ? rtoNameModleItem2.dist_cd : str, (i11 & 2) != 0 ? rtoNameModleItem2.email_id : str2, (i11 & 4) != 0 ? rtoNameModleItem2.landline : str3, (i11 & 8) != 0 ? rtoNameModleItem2.mobile_no : str4, (i11 & 16) != 0 ? rtoNameModleItem2.off_add1 : str5, (i11 & 32) != 0 ? rtoNameModleItem2.off_cd : str6, (i11 & 64) != 0 ? rtoNameModleItem2.off_name : str7, (i11 & 128) != 0 ? rtoNameModleItem2.off_type_cd : str8, (i11 & 256) != 0 ? rtoNameModleItem2.off_under_cd : str9, (i11 & 512) != 0 ? rtoNameModleItem2.pin_cd : str10, (i11 & 1024) != 0 ? rtoNameModleItem2.state_cd : str11, (i11 & 2048) != 0 ? rtoNameModleItem2.taluk_cd : str12, (i11 & 4096) != 0 ? rtoNameModleItem2.village_cd : str13);
    }

    public final String component1() {
        return this.dist_cd;
    }

    public final String component10() {
        return this.pin_cd;
    }

    public final String component11() {
        return this.state_cd;
    }

    public final String component12() {
        return this.taluk_cd;
    }

    public final String component13() {
        return this.village_cd;
    }

    public final String component2() {
        return this.email_id;
    }

    public final String component3() {
        return this.landline;
    }

    public final String component4() {
        return this.mobile_no;
    }

    public final String component5() {
        return this.off_add1;
    }

    public final String component6() {
        return this.off_cd;
    }

    public final String component7() {
        return this.off_name;
    }

    public final String component8() {
        return this.off_type_cd;
    }

    public final String component9() {
        return this.off_under_cd;
    }

    public final RtoNameModleItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        String str14 = str;
        l.f(str14, "dist_cd");
        String str15 = str2;
        l.f(str15, "email_id");
        String str16 = str3;
        l.f(str16, "landline");
        String str17 = str4;
        l.f(str17, "mobile_no");
        String str18 = str5;
        l.f(str18, "off_add1");
        String str19 = str6;
        l.f(str19, "off_cd");
        String str20 = str7;
        l.f(str20, "off_name");
        String str21 = str8;
        l.f(str21, "off_type_cd");
        String str22 = str9;
        l.f(str22, "off_under_cd");
        String str23 = str10;
        l.f(str23, "pin_cd");
        String str24 = str11;
        l.f(str24, "state_cd");
        String str25 = str12;
        l.f(str25, "taluk_cd");
        String str26 = str13;
        l.f(str26, "village_cd");
        return new RtoNameModleItem(str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtoNameModleItem)) {
            return false;
        }
        RtoNameModleItem rtoNameModleItem = (RtoNameModleItem) obj;
        return l.a(this.dist_cd, rtoNameModleItem.dist_cd) && l.a(this.email_id, rtoNameModleItem.email_id) && l.a(this.landline, rtoNameModleItem.landline) && l.a(this.mobile_no, rtoNameModleItem.mobile_no) && l.a(this.off_add1, rtoNameModleItem.off_add1) && l.a(this.off_cd, rtoNameModleItem.off_cd) && l.a(this.off_name, rtoNameModleItem.off_name) && l.a(this.off_type_cd, rtoNameModleItem.off_type_cd) && l.a(this.off_under_cd, rtoNameModleItem.off_under_cd) && l.a(this.pin_cd, rtoNameModleItem.pin_cd) && l.a(this.state_cd, rtoNameModleItem.state_cd) && l.a(this.taluk_cd, rtoNameModleItem.taluk_cd) && l.a(this.village_cd, rtoNameModleItem.village_cd);
    }

    public final String getDist_cd() {
        return this.dist_cd;
    }

    public final String getEmail_id() {
        return this.email_id;
    }

    public final String getLandline() {
        return this.landline;
    }

    public final String getMobile_no() {
        return this.mobile_no;
    }

    public final String getOff_add1() {
        return this.off_add1;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOff_name() {
        return this.off_name;
    }

    public final String getOff_type_cd() {
        return this.off_type_cd;
    }

    public final String getOff_under_cd() {
        return this.off_under_cd;
    }

    public final String getPin_cd() {
        return this.pin_cd;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getTaluk_cd() {
        return this.taluk_cd;
    }

    public final String getVillage_cd() {
        return this.village_cd;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.dist_cd.hashCode() * 31) + this.email_id.hashCode()) * 31) + this.landline.hashCode()) * 31) + this.mobile_no.hashCode()) * 31) + this.off_add1.hashCode()) * 31) + this.off_cd.hashCode()) * 31) + this.off_name.hashCode()) * 31) + this.off_type_cd.hashCode()) * 31) + this.off_under_cd.hashCode()) * 31) + this.pin_cd.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.taluk_cd.hashCode()) * 31) + this.village_cd.hashCode();
    }

    public String toString() {
        return "RtoNameModleItem(dist_cd=" + this.dist_cd + ", email_id=" + this.email_id + ", landline=" + this.landline + ", mobile_no=" + this.mobile_no + ", off_add1=" + this.off_add1 + ", off_cd=" + this.off_cd + ", off_name=" + this.off_name + ", off_type_cd=" + this.off_type_cd + ", off_under_cd=" + this.off_under_cd + ", pin_cd=" + this.pin_cd + ", state_cd=" + this.state_cd + ", taluk_cd=" + this.taluk_cd + ", village_cd=" + this.village_cd + ')';
    }
}
