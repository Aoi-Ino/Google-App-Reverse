package com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DOEkyc implements Parcelable {
    public static final Parcelable.Creator<DOEkyc> CREATOR = new a();
    private final int aadhaarNo;
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

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final DOEkyc createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new DOEkyc(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DOEkyc[] newArray(int i10) {
            return new DOEkyc[i10];
        }
    }

    public DOEkyc(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i11, String str13, int i12, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        String str23 = str2;
        String str24 = str3;
        String str25 = str4;
        String str26 = str5;
        String str27 = str8;
        String str28 = str9;
        String str29 = str11;
        String str30 = str12;
        String str31 = str13;
        String str32 = str16;
        String str33 = str17;
        String str34 = str20;
        String str35 = str22;
        l.f(str23, "careOf");
        l.f(str24, "code");
        l.f(str25, "dist");
        l.f(str26, "dob");
        l.f(str27, "gender");
        l.f(str28, "house");
        l.f(str29, "localityIfAny");
        l.f(str30, "name");
        l.f(str31, "pht");
        l.f(str32, "state");
        l.f(str33, "status");
        l.f(str34, "villageTownCity");
        l.f(str35, "xmlUID");
        this.aadhaarNo = i10;
        this.address = str;
        this.careOf = str23;
        this.code = str24;
        this.dist = str25;
        this.dob = str26;
        this.email = str6;
        this.errorCode = str7;
        this.gender = str27;
        this.house = str28;
        this.landMark = str10;
        this.localityIfAny = str29;
        this.name = str30;
        this.phone = i11;
        this.pht = str31;
        this.pincode = i12;
        this.postOffice = str14;
        this.reason = str15;
        this.state = str32;
        this.status = str33;
        this.street = str18;
        this.subDist = str19;
        this.villageTownCity = str34;
        this.vtcCode = str21;
        this.xmlUID = str35;
    }

    public static /* synthetic */ DOEkyc copy$default(DOEkyc dOEkyc, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i11, String str13, int i12, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i13, Object obj) {
        DOEkyc dOEkyc2 = dOEkyc;
        int i14 = i13;
        return dOEkyc.copy((i14 & 1) != 0 ? dOEkyc2.aadhaarNo : i10, (i14 & 2) != 0 ? dOEkyc2.address : str, (i14 & 4) != 0 ? dOEkyc2.careOf : str2, (i14 & 8) != 0 ? dOEkyc2.code : str3, (i14 & 16) != 0 ? dOEkyc2.dist : str4, (i14 & 32) != 0 ? dOEkyc2.dob : str5, (i14 & 64) != 0 ? dOEkyc2.email : str6, (i14 & 128) != 0 ? dOEkyc2.errorCode : str7, (i14 & 256) != 0 ? dOEkyc2.gender : str8, (i14 & 512) != 0 ? dOEkyc2.house : str9, (i14 & 1024) != 0 ? dOEkyc2.landMark : str10, (i14 & 2048) != 0 ? dOEkyc2.localityIfAny : str11, (i14 & 4096) != 0 ? dOEkyc2.name : str12, (i14 & 8192) != 0 ? dOEkyc2.phone : i11, (i14 & 16384) != 0 ? dOEkyc2.pht : str13, (i14 & 32768) != 0 ? dOEkyc2.pincode : i12, (i14 & 65536) != 0 ? dOEkyc2.postOffice : str14, (i14 & 131072) != 0 ? dOEkyc2.reason : str15, (i14 & 262144) != 0 ? dOEkyc2.state : str16, (i14 & 524288) != 0 ? dOEkyc2.status : str17, (i14 & 1048576) != 0 ? dOEkyc2.street : str18, (i14 & 2097152) != 0 ? dOEkyc2.subDist : str19, (i14 & 4194304) != 0 ? dOEkyc2.villageTownCity : str20, (i14 & 8388608) != 0 ? dOEkyc2.vtcCode : str21, (i14 & 16777216) != 0 ? dOEkyc2.xmlUID : str22);
    }

    public final int component1() {
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

    public final DOEkyc copy(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i11, String str13, int i12, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        int i13 = i10;
        l.f(str2, "careOf");
        l.f(str3, "code");
        l.f(str4, "dist");
        l.f(str5, "dob");
        l.f(str8, "gender");
        l.f(str9, "house");
        l.f(str11, "localityIfAny");
        l.f(str12, "name");
        l.f(str13, "pht");
        l.f(str16, "state");
        l.f(str17, "status");
        l.f(str20, "villageTownCity");
        l.f(str22, "xmlUID");
        return new DOEkyc(i10, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, i11, str13, i12, str14, str15, str16, str17, str18, str19, str20, str21, str22);
    }

    public int describeContents() {
        return 0;
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

    public final int getAadhaarNo() {
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
        int hashCode = Integer.hashCode(this.aadhaarNo) * 31;
        String str = this.address;
        int i10 = 0;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.careOf.hashCode()) * 31) + this.code.hashCode()) * 31) + this.dist.hashCode()) * 31) + this.dob.hashCode()) * 31;
        String str2 = this.email;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorCode;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.gender.hashCode()) * 31) + this.house.hashCode()) * 31;
        String str4 = this.landMark;
        int hashCode5 = (((((((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.localityIfAny.hashCode()) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.phone)) * 31) + this.pht.hashCode()) * 31) + Integer.hashCode(this.pincode)) * 31;
        String str5 = this.postOffice;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.reason;
        int hashCode7 = (((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.state.hashCode()) * 31) + this.status.hashCode()) * 31;
        String str7 = this.street;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subDist;
        int hashCode9 = (((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.villageTownCity.hashCode()) * 31;
        String str9 = this.vtcCode;
        if (str9 != null) {
            i10 = str9.hashCode();
        }
        return ((hashCode9 + i10) * 31) + this.xmlUID.hashCode();
    }

    public String toString() {
        return "DOEkyc(aadhaarNo=" + this.aadhaarNo + ", address=" + this.address + ", careOf=" + this.careOf + ", code=" + this.code + ", dist=" + this.dist + ", dob=" + this.dob + ", email=" + this.email + ", errorCode=" + this.errorCode + ", gender=" + this.gender + ", house=" + this.house + ", landMark=" + this.landMark + ", localityIfAny=" + this.localityIfAny + ", name=" + this.name + ", phone=" + this.phone + ", pht=" + this.pht + ", pincode=" + this.pincode + ", postOffice=" + this.postOffice + ", reason=" + this.reason + ", state=" + this.state + ", status=" + this.status + ", street=" + this.street + ", subDist=" + this.subDist + ", villageTownCity=" + this.villageTownCity + ", vtcCode=" + this.vtcCode + ", xmlUID=" + this.xmlUID + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeInt(this.aadhaarNo);
        parcel.writeString(this.address);
        parcel.writeString(this.careOf);
        parcel.writeString(this.code);
        parcel.writeString(this.dist);
        parcel.writeString(this.dob);
        parcel.writeString(this.email);
        parcel.writeString(this.errorCode);
        parcel.writeString(this.gender);
        parcel.writeString(this.house);
        parcel.writeString(this.landMark);
        parcel.writeString(this.localityIfAny);
        parcel.writeString(this.name);
        parcel.writeInt(this.phone);
        parcel.writeString(this.pht);
        parcel.writeInt(this.pincode);
        parcel.writeString(this.postOffice);
        parcel.writeString(this.reason);
        parcel.writeString(this.state);
        parcel.writeString(this.status);
        parcel.writeString(this.street);
        parcel.writeString(this.subDist);
        parcel.writeString(this.villageTownCity);
        parcel.writeString(this.vtcCode);
        parcel.writeString(this.xmlUID);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DOEkyc(int r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, int r43, java.lang.String r44, int r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, int r55, cm.g r56) {
        /*
            r29 = this;
            r0 = r55
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r31
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r10 = r2
            goto L_0x0013
        L_0x0011:
            r10 = r36
        L_0x0013:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0019
            r11 = r2
            goto L_0x001b
        L_0x0019:
            r11 = r37
        L_0x001b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0021
            r14 = r2
            goto L_0x0023
        L_0x0021:
            r14 = r40
        L_0x0023:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x002b
            r20 = r2
            goto L_0x002d
        L_0x002b:
            r20 = r46
        L_0x002d:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0035
            r21 = r2
            goto L_0x0037
        L_0x0035:
            r21 = r47
        L_0x0037:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x003f
            r24 = r2
            goto L_0x0041
        L_0x003f:
            r24 = r50
        L_0x0041:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0049
            r25 = r2
            goto L_0x004b
        L_0x0049:
            r25 = r51
        L_0x004b:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0053
            r27 = r2
            goto L_0x0055
        L_0x0053:
            r27 = r53
        L_0x0055:
            r3 = r29
            r4 = r30
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r12 = r38
            r13 = r39
            r15 = r41
            r16 = r42
            r17 = r43
            r18 = r44
            r19 = r45
            r22 = r48
            r23 = r49
            r26 = r52
            r28 = r54
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOEkyc.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
