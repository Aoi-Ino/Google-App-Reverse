package com.nic.mparivahan.dlservices.newlearner.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class NewLLAcknowledgement {
    @c("applicantAddress")
    private final String applicantAddress;
    @c("applicantGender")
    private final String applicantGender;
    @c("applicationDate")
    private final String applicationDate;
    @c("applicationNo")
    private final String applicationNo;
    @c("bloodGroup")
    private final String bloodGroup;
    @c("UC01-E150")
    private final String bloodGroupError;
    @c("dateofBirth")
    private final String dob;
    @c("documentaryProofsRequired")
    private final String documentaryProofsRequired;
    @c("fatherName")
    private final String fatherName;
    @c("UC01-E219")
    private final String freshLLNotSaved;
    @c("name")
    private final String name;
    @c("UC01-E287")
    private final String nameMismatchError;
    @c("referenceLink")
    private final String referenceLink;
    @c("rtoLocation")
    private final String rtoLocation;
    @c("servicesRequested")
    private final String servicesRequested;
    @c("smsConfirmation")
    private final String smsConfirmation;
    @c("smsToMobile")
    private final String smsToMobile;
    @c("UC01-E167")
    private final String validLocationError;
    @c("UC01-E164")
    private final String validSubDistrictInPermanent;
    @c("UC01-E205")
    private final String vehicleClassError;

    public NewLLAcknowledgement() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1048575, (g) null);
    }

    public static /* synthetic */ NewLLAcknowledgement copy$default(NewLLAcknowledgement newLLAcknowledgement, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i10, Object obj) {
        NewLLAcknowledgement newLLAcknowledgement2 = newLLAcknowledgement;
        int i11 = i10;
        return newLLAcknowledgement.copy((i11 & 1) != 0 ? newLLAcknowledgement2.validLocationError : str, (i11 & 2) != 0 ? newLLAcknowledgement2.vehicleClassError : str2, (i11 & 4) != 0 ? newLLAcknowledgement2.bloodGroupError : str3, (i11 & 8) != 0 ? newLLAcknowledgement2.fatherName : str4, (i11 & 16) != 0 ? newLLAcknowledgement2.dob : str5, (i11 & 32) != 0 ? newLLAcknowledgement2.applicationNo : str6, (i11 & 64) != 0 ? newLLAcknowledgement2.applicantAddress : str7, (i11 & 128) != 0 ? newLLAcknowledgement2.smsConfirmation : str8, (i11 & 256) != 0 ? newLLAcknowledgement2.referenceLink : str9, (i11 & 512) != 0 ? newLLAcknowledgement2.bloodGroup : str10, (i11 & 1024) != 0 ? newLLAcknowledgement2.applicantGender : str11, (i11 & 2048) != 0 ? newLLAcknowledgement2.servicesRequested : str12, (i11 & 4096) != 0 ? newLLAcknowledgement2.smsToMobile : str13, (i11 & 8192) != 0 ? newLLAcknowledgement2.documentaryProofsRequired : str14, (i11 & 16384) != 0 ? newLLAcknowledgement2.rtoLocation : str15, (i11 & 32768) != 0 ? newLLAcknowledgement2.name : str16, (i11 & 65536) != 0 ? newLLAcknowledgement2.applicationDate : str17, (i11 & 131072) != 0 ? newLLAcknowledgement2.nameMismatchError : str18, (i11 & 262144) != 0 ? newLLAcknowledgement2.validSubDistrictInPermanent : str19, (i11 & 524288) != 0 ? newLLAcknowledgement2.freshLLNotSaved : str20);
    }

    public final String component1() {
        return this.validLocationError;
    }

    public final String component10() {
        return this.bloodGroup;
    }

    public final String component11() {
        return this.applicantGender;
    }

    public final String component12() {
        return this.servicesRequested;
    }

    public final String component13() {
        return this.smsToMobile;
    }

    public final String component14() {
        return this.documentaryProofsRequired;
    }

    public final String component15() {
        return this.rtoLocation;
    }

    public final String component16() {
        return this.name;
    }

    public final String component17() {
        return this.applicationDate;
    }

    public final String component18() {
        return this.nameMismatchError;
    }

    public final String component19() {
        return this.validSubDistrictInPermanent;
    }

    public final String component2() {
        return this.vehicleClassError;
    }

    public final String component20() {
        return this.freshLLNotSaved;
    }

    public final String component3() {
        return this.bloodGroupError;
    }

    public final String component4() {
        return this.fatherName;
    }

    public final String component5() {
        return this.dob;
    }

    public final String component6() {
        return this.applicationNo;
    }

    public final String component7() {
        return this.applicantAddress;
    }

    public final String component8() {
        return this.smsConfirmation;
    }

    public final String component9() {
        return this.referenceLink;
    }

    public final NewLLAcknowledgement copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        String str21 = str;
        l.f(str21, "validLocationError");
        l.f(str2, "vehicleClassError");
        l.f(str3, "bloodGroupError");
        l.f(str4, "fatherName");
        l.f(str5, "dob");
        l.f(str6, "applicationNo");
        l.f(str7, "applicantAddress");
        l.f(str8, "smsConfirmation");
        l.f(str9, "referenceLink");
        l.f(str10, "bloodGroup");
        l.f(str11, "applicantGender");
        l.f(str12, "servicesRequested");
        l.f(str13, "smsToMobile");
        l.f(str14, "documentaryProofsRequired");
        l.f(str15, "rtoLocation");
        l.f(str16, "name");
        l.f(str17, "applicationDate");
        l.f(str18, "nameMismatchError");
        l.f(str19, "validSubDistrictInPermanent");
        l.f(str20, "freshLLNotSaved");
        return new NewLLAcknowledgement(str21, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewLLAcknowledgement)) {
            return false;
        }
        NewLLAcknowledgement newLLAcknowledgement = (NewLLAcknowledgement) obj;
        return l.a(this.validLocationError, newLLAcknowledgement.validLocationError) && l.a(this.vehicleClassError, newLLAcknowledgement.vehicleClassError) && l.a(this.bloodGroupError, newLLAcknowledgement.bloodGroupError) && l.a(this.fatherName, newLLAcknowledgement.fatherName) && l.a(this.dob, newLLAcknowledgement.dob) && l.a(this.applicationNo, newLLAcknowledgement.applicationNo) && l.a(this.applicantAddress, newLLAcknowledgement.applicantAddress) && l.a(this.smsConfirmation, newLLAcknowledgement.smsConfirmation) && l.a(this.referenceLink, newLLAcknowledgement.referenceLink) && l.a(this.bloodGroup, newLLAcknowledgement.bloodGroup) && l.a(this.applicantGender, newLLAcknowledgement.applicantGender) && l.a(this.servicesRequested, newLLAcknowledgement.servicesRequested) && l.a(this.smsToMobile, newLLAcknowledgement.smsToMobile) && l.a(this.documentaryProofsRequired, newLLAcknowledgement.documentaryProofsRequired) && l.a(this.rtoLocation, newLLAcknowledgement.rtoLocation) && l.a(this.name, newLLAcknowledgement.name) && l.a(this.applicationDate, newLLAcknowledgement.applicationDate) && l.a(this.nameMismatchError, newLLAcknowledgement.nameMismatchError) && l.a(this.validSubDistrictInPermanent, newLLAcknowledgement.validSubDistrictInPermanent) && l.a(this.freshLLNotSaved, newLLAcknowledgement.freshLLNotSaved);
    }

    public final String getApplicantAddress() {
        return this.applicantAddress;
    }

    public final String getApplicantGender() {
        return this.applicantGender;
    }

    public final String getApplicationDate() {
        return this.applicationDate;
    }

    public final String getApplicationNo() {
        return this.applicationNo;
    }

    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    public final String getBloodGroupError() {
        return this.bloodGroupError;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getDocumentaryProofsRequired() {
        return this.documentaryProofsRequired;
    }

    public final String getFatherName() {
        return this.fatherName;
    }

    public final String getFreshLLNotSaved() {
        return this.freshLLNotSaved;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNameMismatchError() {
        return this.nameMismatchError;
    }

    public final String getReferenceLink() {
        return this.referenceLink;
    }

    public final String getRtoLocation() {
        return this.rtoLocation;
    }

    public final String getServicesRequested() {
        return this.servicesRequested;
    }

    public final String getSmsConfirmation() {
        return this.smsConfirmation;
    }

    public final String getSmsToMobile() {
        return this.smsToMobile;
    }

    public final String getValidLocationError() {
        return this.validLocationError;
    }

    public final String getValidSubDistrictInPermanent() {
        return this.validSubDistrictInPermanent;
    }

    public final String getVehicleClassError() {
        return this.vehicleClassError;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.validLocationError.hashCode() * 31) + this.vehicleClassError.hashCode()) * 31) + this.bloodGroupError.hashCode()) * 31) + this.fatherName.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.applicationNo.hashCode()) * 31) + this.applicantAddress.hashCode()) * 31) + this.smsConfirmation.hashCode()) * 31) + this.referenceLink.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.applicantGender.hashCode()) * 31) + this.servicesRequested.hashCode()) * 31) + this.smsToMobile.hashCode()) * 31) + this.documentaryProofsRequired.hashCode()) * 31) + this.rtoLocation.hashCode()) * 31) + this.name.hashCode()) * 31) + this.applicationDate.hashCode()) * 31) + this.nameMismatchError.hashCode()) * 31) + this.validSubDistrictInPermanent.hashCode()) * 31) + this.freshLLNotSaved.hashCode();
    }

    public String toString() {
        return "NewLLAcknowledgement(validLocationError=" + this.validLocationError + ", vehicleClassError=" + this.vehicleClassError + ", bloodGroupError=" + this.bloodGroupError + ", fatherName=" + this.fatherName + ", dob=" + this.dob + ", applicationNo=" + this.applicationNo + ", applicantAddress=" + this.applicantAddress + ", smsConfirmation=" + this.smsConfirmation + ", referenceLink=" + this.referenceLink + ", bloodGroup=" + this.bloodGroup + ", applicantGender=" + this.applicantGender + ", servicesRequested=" + this.servicesRequested + ", smsToMobile=" + this.smsToMobile + ", documentaryProofsRequired=" + this.documentaryProofsRequired + ", rtoLocation=" + this.rtoLocation + ", name=" + this.name + ", applicationDate=" + this.applicationDate + ", nameMismatchError=" + this.nameMismatchError + ", validSubDistrictInPermanent=" + this.validSubDistrictInPermanent + ", freshLLNotSaved=" + this.freshLLNotSaved + ')';
    }

    public NewLLAcknowledgement(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        String str21 = str;
        String str22 = str2;
        String str23 = str3;
        String str24 = str4;
        String str25 = str5;
        String str26 = str6;
        String str27 = str7;
        String str28 = str8;
        String str29 = str9;
        String str30 = str10;
        String str31 = str11;
        String str32 = str12;
        String str33 = str13;
        String str34 = str14;
        String str35 = str16;
        l.f(str21, "validLocationError");
        l.f(str22, "vehicleClassError");
        l.f(str23, "bloodGroupError");
        l.f(str24, "fatherName");
        l.f(str25, "dob");
        l.f(str26, "applicationNo");
        l.f(str27, "applicantAddress");
        l.f(str28, "smsConfirmation");
        l.f(str29, "referenceLink");
        l.f(str30, "bloodGroup");
        l.f(str31, "applicantGender");
        l.f(str32, "servicesRequested");
        l.f(str33, "smsToMobile");
        l.f(str34, "documentaryProofsRequired");
        l.f(str15, "rtoLocation");
        l.f(str16, "name");
        l.f(str17, "applicationDate");
        l.f(str18, "nameMismatchError");
        l.f(str19, "validSubDistrictInPermanent");
        l.f(str20, "freshLLNotSaved");
        this.validLocationError = str21;
        this.vehicleClassError = str22;
        this.bloodGroupError = str23;
        this.fatherName = str24;
        this.dob = str25;
        this.applicationNo = str26;
        this.applicantAddress = str27;
        this.smsConfirmation = str28;
        this.referenceLink = str29;
        this.bloodGroup = str30;
        this.applicantGender = str31;
        this.servicesRequested = str32;
        this.smsToMobile = str33;
        this.documentaryProofsRequired = str34;
        this.rtoLocation = str15;
        this.name = str16;
        this.applicationDate = str17;
        this.nameMismatchError = str18;
        this.validSubDistrictInPermanent = str19;
        this.freshLLNotSaved = str20;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NewLLAcknowledgement(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, int r42, cm.g r43) {
        /*
            r21 = this;
            r0 = r42
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r22
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r23
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r24
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r2
            goto L_0x0024
        L_0x0022:
            r5 = r25
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002c
        L_0x002a:
            r6 = r26
        L_0x002c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0032
            r7 = r2
            goto L_0x0034
        L_0x0032:
            r7 = r27
        L_0x0034:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003a
            r8 = r2
            goto L_0x003c
        L_0x003a:
            r8 = r28
        L_0x003c:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0042
            r9 = r2
            goto L_0x0044
        L_0x0042:
            r9 = r29
        L_0x0044:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004a
            r10 = r2
            goto L_0x004c
        L_0x004a:
            r10 = r30
        L_0x004c:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0052
            r11 = r2
            goto L_0x0054
        L_0x0052:
            r11 = r31
        L_0x0054:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005a
            r12 = r2
            goto L_0x005c
        L_0x005a:
            r12 = r32
        L_0x005c:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0062
            r13 = r2
            goto L_0x0064
        L_0x0062:
            r13 = r33
        L_0x0064:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x006a
            r14 = r2
            goto L_0x006c
        L_0x006a:
            r14 = r34
        L_0x006c:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0072
            r15 = r2
            goto L_0x0074
        L_0x0072:
            r15 = r35
        L_0x0074:
            r43 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x007d
            r2 = r43
            goto L_0x007f
        L_0x007d:
            r2 = r36
        L_0x007f:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0089
            r16 = r43
            goto L_0x008b
        L_0x0089:
            r16 = r37
        L_0x008b:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0094
            r17 = r43
            goto L_0x0096
        L_0x0094:
            r17 = r38
        L_0x0096:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009f
            r18 = r43
            goto L_0x00a1
        L_0x009f:
            r18 = r39
        L_0x00a1:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00aa
            r19 = r43
            goto L_0x00ac
        L_0x00aa:
            r19 = r40
        L_0x00ac:
            r20 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x00b5
            r0 = r43
            goto L_0x00b7
        L_0x00b5:
            r0 = r41
        L_0x00b7:
            r22 = r21
            r23 = r1
            r24 = r3
            r25 = r4
            r26 = r5
            r27 = r6
            r28 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            r33 = r12
            r34 = r13
            r35 = r14
            r36 = r15
            r37 = r2
            r38 = r16
            r39 = r17
            r40 = r18
            r41 = r19
            r42 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.DataClass.NewLLAcknowledgement.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
