package com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class DOEkyc implements Serializable {
    private final long aadhaarNo;
    private final String address;
    private final String careOf;
    private final String code;
    private final String dist;
    private final String dob;
    private final String email;
    private final String errorCode;
    private final String gender;
    private final String house;
    private final String landMark;
    private final String localityIfAny;
    private final String name;
    private final int phone;
    private final String pht;
    private final int pincode;
    private final String postOffice;
    private final String reason;
    private final String state;
    private final String status;
    private final String street;
    private final String subDist;
    private final String villageTownCity;
    private final String vtcCode;
    private final String xmlUID;

    public DOEkyc(long j10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i10, String str13, int i11, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        this.aadhaarNo = j10;
        this.address = str;
        this.careOf = str2;
        this.code = str3;
        this.dist = str4;
        this.dob = str5;
        this.email = str6;
        this.errorCode = str7;
        this.gender = str8;
        this.house = str9;
        this.landMark = str10;
        this.localityIfAny = str11;
        this.name = str12;
        this.phone = i10;
        this.pht = str13;
        this.pincode = i11;
        this.postOffice = str14;
        this.reason = str15;
        this.state = str16;
        this.status = str17;
        this.street = str18;
        this.subDist = str19;
        this.villageTownCity = str20;
        this.vtcCode = str21;
        this.xmlUID = str22;
    }

    public static /* synthetic */ DOEkyc copy$default(DOEkyc dOEkyc, long j10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i10, String str13, int i11, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i12, Object obj) {
        DOEkyc dOEkyc2 = dOEkyc;
        int i13 = i12;
        return dOEkyc.copy((i13 & 1) != 0 ? dOEkyc2.aadhaarNo : j10, (i13 & 2) != 0 ? dOEkyc2.address : str, (i13 & 4) != 0 ? dOEkyc2.careOf : str2, (i13 & 8) != 0 ? dOEkyc2.code : str3, (i13 & 16) != 0 ? dOEkyc2.dist : str4, (i13 & 32) != 0 ? dOEkyc2.dob : str5, (i13 & 64) != 0 ? dOEkyc2.email : str6, (i13 & 128) != 0 ? dOEkyc2.errorCode : str7, (i13 & 256) != 0 ? dOEkyc2.gender : str8, (i13 & 512) != 0 ? dOEkyc2.house : str9, (i13 & 1024) != 0 ? dOEkyc2.landMark : str10, (i13 & 2048) != 0 ? dOEkyc2.localityIfAny : str11, (i13 & 4096) != 0 ? dOEkyc2.name : str12, (i13 & 8192) != 0 ? dOEkyc2.phone : i10, (i13 & 16384) != 0 ? dOEkyc2.pht : str13, (i13 & 32768) != 0 ? dOEkyc2.pincode : i11, (i13 & 65536) != 0 ? dOEkyc2.postOffice : str14, (i13 & 131072) != 0 ? dOEkyc2.reason : str15, (i13 & 262144) != 0 ? dOEkyc2.state : str16, (i13 & 524288) != 0 ? dOEkyc2.status : str17, (i13 & 1048576) != 0 ? dOEkyc2.street : str18, (i13 & 2097152) != 0 ? dOEkyc2.subDist : str19, (i13 & 4194304) != 0 ? dOEkyc2.villageTownCity : str20, (i13 & 8388608) != 0 ? dOEkyc2.vtcCode : str21, (i13 & 16777216) != 0 ? dOEkyc2.xmlUID : str22);
    }

    public final long component1() {
        return this.aadhaarNo;
    }

    public final String component10() {
        return this.house;
    }

    public final String component11() {
        return this.landMark;
    }

    public final String component12() {
        return this.localityIfAny;
    }

    public final String component13() {
        return this.name;
    }

    public final int component14() {
        return this.phone;
    }

    public final String component15() {
        return this.pht;
    }

    public final int component16() {
        return this.pincode;
    }

    public final String component17() {
        return this.postOffice;
    }

    public final String component18() {
        return this.reason;
    }

    public final String component19() {
        return this.state;
    }

    public final String component2() {
        return this.address;
    }

    public final String component20() {
        return this.status;
    }

    public final String component21() {
        return this.street;
    }

    public final String component22() {
        return this.subDist;
    }

    public final String component23() {
        return this.villageTownCity;
    }

    public final String component24() {
        return this.vtcCode;
    }

    public final String component25() {
        return this.xmlUID;
    }

    public final String component3() {
        return this.careOf;
    }

    public final String component4() {
        return this.code;
    }

    public final String component5() {
        return this.dist;
    }

    public final String component6() {
        return this.dob;
    }

    public final String component7() {
        return this.email;
    }

    public final String component8() {
        return this.errorCode;
    }

    public final String component9() {
        return this.gender;
    }

    public final DOEkyc copy(long j10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i10, String str13, int i11, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        return new DOEkyc(j10, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, i10, str13, i11, str14, str15, str16, str17, str18, str19, str20, str21, str22);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DOEkyc)) {
            return false;
        }
        DOEkyc dOEkyc = (DOEkyc) obj;
        return this.aadhaarNo == dOEkyc.aadhaarNo && l.a(this.address, dOEkyc.address) && l.a(this.careOf, dOEkyc.careOf) && l.a(this.code, dOEkyc.code) && l.a(this.dist, dOEkyc.dist) && l.a(this.dob, dOEkyc.dob) && l.a(this.email, dOEkyc.email) && l.a(this.errorCode, dOEkyc.errorCode) && l.a(this.gender, dOEkyc.gender) && l.a(this.house, dOEkyc.house) && l.a(this.landMark, dOEkyc.landMark) && l.a(this.localityIfAny, dOEkyc.localityIfAny) && l.a(this.name, dOEkyc.name) && this.phone == dOEkyc.phone && l.a(this.pht, dOEkyc.pht) && this.pincode == dOEkyc.pincode && l.a(this.postOffice, dOEkyc.postOffice) && l.a(this.reason, dOEkyc.reason) && l.a(this.state, dOEkyc.state) && l.a(this.status, dOEkyc.status) && l.a(this.street, dOEkyc.street) && l.a(this.subDist, dOEkyc.subDist) && l.a(this.villageTownCity, dOEkyc.villageTownCity) && l.a(this.vtcCode, dOEkyc.vtcCode) && l.a(this.xmlUID, dOEkyc.xmlUID);
    }

    public final long getAadhaarNo() {
        return this.aadhaarNo;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCareOf() {
        return this.careOf;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDist() {
        return this.dist;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getHouse() {
        return this.house;
    }

    public final String getLandMark() {
        return this.landMark;
    }

    public final String getLocalityIfAny() {
        return this.localityIfAny;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPhone() {
        return this.phone;
    }

    public final String getPht() {
        return this.pht;
    }

    public final int getPincode() {
        return this.pincode;
    }

    public final String getPostOffice() {
        return this.postOffice;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStreet() {
        return this.street;
    }

    public final String getSubDist() {
        return this.subDist;
    }

    public final String getVillageTownCity() {
        return this.villageTownCity;
    }

    public final String getVtcCode() {
        return this.vtcCode;
    }

    public final String getXmlUID() {
        return this.xmlUID;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.aadhaarNo) * 31;
        String str = this.address;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.careOf;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dist;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dob;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.email;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.errorCode;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.gender;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.house;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.landMark;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.localityIfAny;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.name;
        int hashCode13 = (((hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31) + Integer.hashCode(this.phone)) * 31;
        String str13 = this.pht;
        int hashCode14 = (((hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31) + Integer.hashCode(this.pincode)) * 31;
        String str14 = this.postOffice;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.reason;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.state;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.status;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.street;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.subDist;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.villageTownCity;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.vtcCode;
        int hashCode22 = (hashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.xmlUID;
        if (str22 != null) {
            i10 = str22.hashCode();
        }
        return hashCode22 + i10;
    }

    public String toString() {
        return "DOEkyc(aadhaarNo=" + this.aadhaarNo + ", address=" + this.address + ", careOf=" + this.careOf + ", code=" + this.code + ", dist=" + this.dist + ", dob=" + this.dob + ", email=" + this.email + ", errorCode=" + this.errorCode + ", gender=" + this.gender + ", house=" + this.house + ", landMark=" + this.landMark + ", localityIfAny=" + this.localityIfAny + ", name=" + this.name + ", phone=" + this.phone + ", pht=" + this.pht + ", pincode=" + this.pincode + ", postOffice=" + this.postOffice + ", reason=" + this.reason + ", state=" + this.state + ", status=" + this.status + ", street=" + this.street + ", subDist=" + this.subDist + ", villageTownCity=" + this.villageTownCity + ", vtcCode=" + this.vtcCode + ", xmlUID=" + this.xmlUID + ')';
    }
}
