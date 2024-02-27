package com.nic.mparivahan.ClServices.Pojo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class GetClPojo {
    private final String address;
    private final String cl_No;
    private final String cl_Status;
    private final String dob;
    private final String erormsg;
    private final int errorcd;
    private final String father_Name;
    private final String issuing_authority;
    private final String mobile_No;
    private final String name;
    private final String old_CL_No;
    private final String photo;
    private final String signature;
    private final String state;
    private final String validity;

    public GetClPojo(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        String str23 = str9;
        String str24 = str10;
        String str25 = str11;
        String str26 = str12;
        String str27 = str13;
        String str28 = str14;
        l.f(str15, "address");
        l.f(str16, "cl_No");
        l.f(str17, "cl_Status");
        l.f(str18, "dob");
        l.f(str19, "erormsg");
        l.f(str20, "father_Name");
        l.f(str21, "issuing_authority");
        l.f(str22, "mobile_No");
        l.f(str23, "name");
        l.f(str24, "old_CL_No");
        l.f(str25, "photo");
        l.f(str26, "signature");
        l.f(str27, "state");
        l.f(str28, "validity");
        this.address = str15;
        this.cl_No = str16;
        this.cl_Status = str17;
        this.dob = str18;
        this.erormsg = str19;
        this.errorcd = i10;
        this.father_Name = str20;
        this.issuing_authority = str21;
        this.mobile_No = str22;
        this.name = str23;
        this.old_CL_No = str24;
        this.photo = str25;
        this.signature = str26;
        this.state = str27;
        this.validity = str28;
    }

    public static /* synthetic */ GetClPojo copy$default(GetClPojo getClPojo, String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i11, Object obj) {
        GetClPojo getClPojo2 = getClPojo;
        int i12 = i11;
        return getClPojo.copy((i12 & 1) != 0 ? getClPojo2.address : str, (i12 & 2) != 0 ? getClPojo2.cl_No : str2, (i12 & 4) != 0 ? getClPojo2.cl_Status : str3, (i12 & 8) != 0 ? getClPojo2.dob : str4, (i12 & 16) != 0 ? getClPojo2.erormsg : str5, (i12 & 32) != 0 ? getClPojo2.errorcd : i10, (i12 & 64) != 0 ? getClPojo2.father_Name : str6, (i12 & 128) != 0 ? getClPojo2.issuing_authority : str7, (i12 & 256) != 0 ? getClPojo2.mobile_No : str8, (i12 & 512) != 0 ? getClPojo2.name : str9, (i12 & 1024) != 0 ? getClPojo2.old_CL_No : str10, (i12 & 2048) != 0 ? getClPojo2.photo : str11, (i12 & 4096) != 0 ? getClPojo2.signature : str12, (i12 & 8192) != 0 ? getClPojo2.state : str13, (i12 & 16384) != 0 ? getClPojo2.validity : str14);
    }

    public final String component1() {
        return this.address;
    }

    public final String component10() {
        return this.name;
    }

    public final String component11() {
        return this.old_CL_No;
    }

    public final String component12() {
        return this.photo;
    }

    public final String component13() {
        return this.signature;
    }

    public final String component14() {
        return this.state;
    }

    public final String component15() {
        return this.validity;
    }

    public final String component2() {
        return this.cl_No;
    }

    public final String component3() {
        return this.cl_Status;
    }

    public final String component4() {
        return this.dob;
    }

    public final String component5() {
        return this.erormsg;
    }

    public final int component6() {
        return this.errorcd;
    }

    public final String component7() {
        return this.father_Name;
    }

    public final String component8() {
        return this.issuing_authority;
    }

    public final String component9() {
        return this.mobile_No;
    }

    public final GetClPojo copy(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        String str15 = str;
        l.f(str15, "address");
        String str16 = str2;
        l.f(str16, "cl_No");
        String str17 = str3;
        l.f(str17, "cl_Status");
        String str18 = str4;
        l.f(str18, "dob");
        String str19 = str5;
        l.f(str19, "erormsg");
        String str20 = str6;
        l.f(str20, "father_Name");
        String str21 = str7;
        l.f(str21, "issuing_authority");
        String str22 = str8;
        l.f(str22, "mobile_No");
        String str23 = str9;
        l.f(str23, "name");
        String str24 = str10;
        l.f(str24, "old_CL_No");
        String str25 = str11;
        l.f(str25, "photo");
        String str26 = str12;
        l.f(str26, "signature");
        String str27 = str13;
        l.f(str27, "state");
        l.f(str14, "validity");
        return new GetClPojo(str15, str16, str17, str18, str19, i10, str20, str21, str22, str23, str24, str25, str26, str27, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetClPojo)) {
            return false;
        }
        GetClPojo getClPojo = (GetClPojo) obj;
        return l.a(this.address, getClPojo.address) && l.a(this.cl_No, getClPojo.cl_No) && l.a(this.cl_Status, getClPojo.cl_Status) && l.a(this.dob, getClPojo.dob) && l.a(this.erormsg, getClPojo.erormsg) && this.errorcd == getClPojo.errorcd && l.a(this.father_Name, getClPojo.father_Name) && l.a(this.issuing_authority, getClPojo.issuing_authority) && l.a(this.mobile_No, getClPojo.mobile_No) && l.a(this.name, getClPojo.name) && l.a(this.old_CL_No, getClPojo.old_CL_No) && l.a(this.photo, getClPojo.photo) && l.a(this.signature, getClPojo.signature) && l.a(this.state, getClPojo.state) && l.a(this.validity, getClPojo.validity);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCl_No() {
        return this.cl_No;
    }

    public final String getCl_Status() {
        return this.cl_Status;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getErormsg() {
        return this.erormsg;
    }

    public final int getErrorcd() {
        return this.errorcd;
    }

    public final String getFather_Name() {
        return this.father_Name;
    }

    public final String getIssuing_authority() {
        return this.issuing_authority;
    }

    public final String getMobile_No() {
        return this.mobile_No;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOld_CL_No() {
        return this.old_CL_No;
    }

    public final String getPhoto() {
        return this.photo;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getState() {
        return this.state;
    }

    public final String getValidity() {
        return this.validity;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.address.hashCode() * 31) + this.cl_No.hashCode()) * 31) + this.cl_Status.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.erormsg.hashCode()) * 31) + Integer.hashCode(this.errorcd)) * 31) + this.father_Name.hashCode()) * 31) + this.issuing_authority.hashCode()) * 31) + this.mobile_No.hashCode()) * 31) + this.name.hashCode()) * 31) + this.old_CL_No.hashCode()) * 31) + this.photo.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.state.hashCode()) * 31) + this.validity.hashCode();
    }

    public String toString() {
        return "GetClPojo(address=" + this.address + ", cl_No=" + this.cl_No + ", cl_Status=" + this.cl_Status + ", dob=" + this.dob + ", erormsg=" + this.erormsg + ", errorcd=" + this.errorcd + ", father_Name=" + this.father_Name + ", issuing_authority=" + this.issuing_authority + ", mobile_No=" + this.mobile_No + ", name=" + this.name + ", old_CL_No=" + this.old_CL_No + ", photo=" + this.photo + ", signature=" + this.signature + ", state=" + this.state + ", validity=" + this.validity + ')';
    }
}
