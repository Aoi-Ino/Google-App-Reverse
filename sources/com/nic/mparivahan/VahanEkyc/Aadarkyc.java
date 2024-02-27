package com.nic.mparivahan.VahanEkyc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.g;
import cm.l;

@Keep
public final class Aadarkyc {

    @Keep
    public static final class DOAuthOTP {
        private final String actionErrorCode = " ";
        private final String email = " ";
        private final String errorCode = "";
        private String last_four_mobile = " ";
        private Boolean mobileverify = Boolean.FALSE;
        private final String reason = " ";
        private String status = " ";
        private final String uidtkn = "";

        public final String getActionErrorCode() {
            return this.actionErrorCode;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final String getLast_four_mobile() {
            return this.last_four_mobile;
        }

        public final Boolean getMobileverify() {
            return this.mobileverify;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getUidtkn() {
            return this.uidtkn;
        }

        public final void setLast_four_mobile(String str) {
            this.last_four_mobile = str;
        }

        public final void setMobileverify(Boolean bool) {
            this.mobileverify = bool;
        }

        public final void setStatus(String str) {
            this.status = str;
        }
    }

    @Keep
    public static final class DOEkyc implements Parcelable {
        public static final Parcelable.Creator<DOEkyc> CREATOR = new a();
        private int aadhaarNo;
        private String careOf;
        private String code;
        private String dist;
        private String dob;
        private String gender;
        private String house;
        private String landMark;
        private String localityIfAny;
        private String name;
        private int phone;
        private String pht;
        private String pincode;
        private String state;
        private String status;
        private String street;
        private String subDist;
        private String villageTownCity;
        private String xmlUID;

        public static final class a implements Parcelable.Creator {
            /* renamed from: a */
            public final DOEkyc createFromParcel(Parcel parcel) {
                l.f(parcel, "parcel");
                return new DOEkyc(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final DOEkyc[] newArray(int i10) {
                return new DOEkyc[i10];
            }
        }

        public DOEkyc() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 524287, (g) null);
        }

        public int describeContents() {
            return 0;
        }

        public final int getAadhaarNo() {
            return this.aadhaarNo;
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

        public final String getPincode() {
            return this.pincode;
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

        public final String getXmlUID() {
            return this.xmlUID;
        }

        public final void setAadhaarNo(int i10) {
            this.aadhaarNo = i10;
        }

        public final void setCareOf(String str) {
            l.f(str, "<set-?>");
            this.careOf = str;
        }

        public final void setCode(String str) {
            l.f(str, "<set-?>");
            this.code = str;
        }

        public final void setDist(String str) {
            this.dist = str;
        }

        public final void setDob(String str) {
            l.f(str, "<set-?>");
            this.dob = str;
        }

        public final void setGender(String str) {
            l.f(str, "<set-?>");
            this.gender = str;
        }

        public final void setHouse(String str) {
            this.house = str;
        }

        public final void setLandMark(String str) {
            l.f(str, "<set-?>");
            this.landMark = str;
        }

        public final void setLocalityIfAny(String str) {
            this.localityIfAny = str;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setPhone(int i10) {
            this.phone = i10;
        }

        public final void setPht(String str) {
            l.f(str, "<set-?>");
            this.pht = str;
        }

        public final void setPincode(String str) {
            this.pincode = str;
        }

        public final void setState(String str) {
            this.state = str;
        }

        public final void setStatus(String str) {
            l.f(str, "<set-?>");
            this.status = str;
        }

        public final void setStreet(String str) {
            this.street = str;
        }

        public final void setSubDist(String str) {
            l.f(str, "<set-?>");
            this.subDist = str;
        }

        public final void setVillageTownCity(String str) {
            l.f(str, "<set-?>");
            this.villageTownCity = str;
        }

        public final void setXmlUID(String str) {
            l.f(str, "<set-?>");
            this.xmlUID = str;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            l.f(parcel, "out");
            parcel.writeString(this.name);
            parcel.writeString(this.localityIfAny);
            parcel.writeString(this.house);
            parcel.writeString(this.street);
            parcel.writeString(this.state);
            parcel.writeString(this.pincode);
            parcel.writeString(this.dist);
            parcel.writeInt(this.aadhaarNo);
            parcel.writeString(this.careOf);
            parcel.writeString(this.code);
            parcel.writeString(this.dob);
            parcel.writeString(this.gender);
            parcel.writeString(this.landMark);
            parcel.writeInt(this.phone);
            parcel.writeString(this.pht);
            parcel.writeString(this.status);
            parcel.writeString(this.villageTownCity);
            parcel.writeString(this.xmlUID);
            parcel.writeString(this.subDist);
        }

        public DOEkyc(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, String str9, String str10, String str11, String str12, int i11, String str13, String str14, String str15, String str16, String str17) {
            String str18 = str8;
            String str19 = str9;
            String str20 = str10;
            String str21 = str11;
            String str22 = str12;
            String str23 = str13;
            String str24 = str14;
            String str25 = str15;
            String str26 = str16;
            String str27 = str17;
            l.f(str18, "careOf");
            l.f(str19, "code");
            l.f(str20, "dob");
            l.f(str21, "gender");
            l.f(str22, "landMark");
            l.f(str23, "pht");
            l.f(str24, "status");
            l.f(str25, "villageTownCity");
            l.f(str26, "xmlUID");
            l.f(str27, "subDist");
            this.name = str;
            this.localityIfAny = str2;
            this.house = str3;
            this.street = str4;
            this.state = str5;
            this.pincode = str6;
            this.dist = str7;
            this.aadhaarNo = i10;
            this.careOf = str18;
            this.code = str19;
            this.dob = str20;
            this.gender = str21;
            this.landMark = str22;
            this.phone = i11;
            this.pht = str23;
            this.status = str24;
            this.villageTownCity = str25;
            this.xmlUID = str26;
            this.subDist = str27;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ DOEkyc(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, cm.g r41) {
            /*
                r20 = this;
                r0 = r40
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000c
            L_0x000a:
                r1 = r21
            L_0x000c:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0012
                r3 = r2
                goto L_0x0014
            L_0x0012:
                r3 = r22
            L_0x0014:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x001a
                r4 = r2
                goto L_0x001c
            L_0x001a:
                r4 = r23
            L_0x001c:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x0022
                r5 = r2
                goto L_0x0024
            L_0x0022:
                r5 = r24
            L_0x0024:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x002a
                r6 = r2
                goto L_0x002c
            L_0x002a:
                r6 = r25
            L_0x002c:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x0032
                r7 = r2
                goto L_0x0034
            L_0x0032:
                r7 = r26
            L_0x0034:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x003a
                r8 = r2
                goto L_0x003c
            L_0x003a:
                r8 = r27
            L_0x003c:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x0042
                r9 = 0
                goto L_0x0044
            L_0x0042:
                r9 = r28
            L_0x0044:
                r11 = r0 & 256(0x100, float:3.59E-43)
                if (r11 == 0) goto L_0x004a
                r11 = r2
                goto L_0x004c
            L_0x004a:
                r11 = r29
            L_0x004c:
                r12 = r0 & 512(0x200, float:7.175E-43)
                if (r12 == 0) goto L_0x0052
                r12 = r2
                goto L_0x0054
            L_0x0052:
                r12 = r30
            L_0x0054:
                r13 = r0 & 1024(0x400, float:1.435E-42)
                if (r13 == 0) goto L_0x005a
                r13 = r2
                goto L_0x005c
            L_0x005a:
                r13 = r31
            L_0x005c:
                r14 = r0 & 2048(0x800, float:2.87E-42)
                if (r14 == 0) goto L_0x0062
                r14 = r2
                goto L_0x0064
            L_0x0062:
                r14 = r32
            L_0x0064:
                r15 = r0 & 4096(0x1000, float:5.74E-42)
                if (r15 == 0) goto L_0x006a
                r15 = r2
                goto L_0x006c
            L_0x006a:
                r15 = r33
            L_0x006c:
                r10 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r10 == 0) goto L_0x0072
                r10 = 0
                goto L_0x0074
            L_0x0072:
                r10 = r34
            L_0x0074:
                r41 = r2
                r2 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r2 == 0) goto L_0x007d
                r2 = r41
                goto L_0x007f
            L_0x007d:
                r2 = r35
            L_0x007f:
                r16 = 32768(0x8000, float:4.5918E-41)
                r16 = r0 & r16
                if (r16 == 0) goto L_0x0089
                r16 = r41
                goto L_0x008b
            L_0x0089:
                r16 = r36
            L_0x008b:
                r17 = 65536(0x10000, float:9.18355E-41)
                r17 = r0 & r17
                if (r17 == 0) goto L_0x0094
                r17 = r41
                goto L_0x0096
            L_0x0094:
                r17 = r37
            L_0x0096:
                r18 = 131072(0x20000, float:1.83671E-40)
                r18 = r0 & r18
                if (r18 == 0) goto L_0x009f
                r18 = r41
                goto L_0x00a1
            L_0x009f:
                r18 = r38
            L_0x00a1:
                r19 = 262144(0x40000, float:3.67342E-40)
                r0 = r0 & r19
                if (r0 == 0) goto L_0x00aa
                r0 = r41
                goto L_0x00ac
            L_0x00aa:
                r0 = r39
            L_0x00ac:
                r21 = r20
                r22 = r1
                r23 = r3
                r24 = r4
                r25 = r5
                r26 = r6
                r27 = r7
                r28 = r8
                r29 = r9
                r30 = r11
                r31 = r12
                r32 = r13
                r33 = r14
                r34 = r15
                r35 = r10
                r36 = r2
                r37 = r16
                r38 = r17
                r39 = r18
                r40 = r0
                r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanEkyc.Aadarkyc.DOEkyc.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
        }
    }

    @Keep
    public static final class DoAadhaarResponse {
        private DOAuthOTP dOAuthOTP;
        private DOEkyc dOEkyc;
        private String finalxml;
        private String reason;
        private String status;
        private String txnNo;

        public final DOAuthOTP getDOAuthOTP() {
            return this.dOAuthOTP;
        }

        public final DOEkyc getDOEkyc() {
            return this.dOEkyc;
        }

        public final String getFinalxml() {
            return this.finalxml;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getTxnNo() {
            return this.txnNo;
        }

        public final void setDOAuthOTP(DOAuthOTP dOAuthOTP2) {
            this.dOAuthOTP = dOAuthOTP2;
        }

        public final void setDOEkyc(DOEkyc dOEkyc2) {
            this.dOEkyc = dOEkyc2;
        }

        public final void setFinalxml(String str) {
            this.finalxml = str;
        }

        public final void setReason(String str) {
            this.reason = str;
        }

        public final void setStatus(String str) {
            this.status = str;
        }

        public final void setTxnNo(String str) {
            this.txnNo = str;
        }
    }

    @Keep
    public static final class Response {
        private DoAadhaarResponse doAadhaarResponse;
        private String responseBody;

        public final DoAadhaarResponse getDoAadhaarResponse() {
            return this.doAadhaarResponse;
        }

        public final String getResponseBody() {
            return this.responseBody;
        }

        public final void setDoAadhaarResponse(DoAadhaarResponse doAadhaarResponse2) {
            this.doAadhaarResponse = doAadhaarResponse2;
        }

        public final void setResponseBody(String str) {
            this.responseBody = str;
        }
    }
}
