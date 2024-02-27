package com.nic.mparivahan.NewDlScreen.Modal;

import androidx.annotation.Keep;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class SubmittedDlDetailsModal {
    @c("applicationDate")
    private final String applDate;
    @c("applno")
    private final String applNo;
    @c("bloodGroup")
    private final String bloodGroup;
    @c("UC01-E150")
    private final String bloodGroupError;
    @c("dob")
    private final String dob;
    @c("UC06-E2516")
    private final String fullNameError;
    @c("gender")
    private String gender;
    @c("houseno")
    private final String houseNo;
    @c("UC01-E33")
    private final String idMarkError;
    @c("applname")
    private final String lastName;
    @c("location")
    private final String location;
    @c("UC32-E43")
    private final String mobileNumberError;
    @c("pincode")
    private String pinCd;
    @c("relation")
    private final String relation;
    @c("rtoAddress")
    private final ArrayList<RTOAddressListModal> rtoAddressList;
    @c("street")
    private final String street;
    @c("swdname")
    private final String swdName;
    @c("transactions")
    private final ArrayList<TransactionListModal> transactionList;

    public SubmittedDlDetailsModal(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ArrayList<TransactionListModal> arrayList, ArrayList<RTOAddressListModal> arrayList2, String str13, String str14, String str15, String str16) {
        String str17 = str;
        String str18 = str2;
        String str19 = str3;
        String str20 = str4;
        String str21 = str5;
        String str22 = str6;
        String str23 = str7;
        String str24 = str8;
        String str25 = str9;
        String str26 = str10;
        String str27 = str11;
        String str28 = str12;
        String str29 = str13;
        String str30 = str14;
        l.f(str17, "pinCd");
        l.f(str18, "gender");
        l.f(str19, "lastName");
        l.f(str20, "applNo");
        l.f(str21, "relation");
        l.f(str22, "bloodGroup");
        l.f(str23, "dob");
        l.f(str24, "street");
        l.f(str25, "houseNo");
        l.f(str26, "swdName");
        l.f(str27, "location");
        l.f(str28, "applDate");
        l.f(str29, "idMarkError");
        l.f(str30, "bloodGroupError");
        l.f(str15, "fullNameError");
        String str31 = str16;
        l.f(str31, "mobileNumberError");
        this.pinCd = str17;
        this.gender = str18;
        this.lastName = str19;
        this.applNo = str20;
        this.relation = str21;
        this.bloodGroup = str22;
        this.dob = str23;
        this.street = str24;
        this.houseNo = str25;
        this.swdName = str26;
        this.location = str27;
        this.applDate = str28;
        this.transactionList = arrayList;
        this.rtoAddressList = arrayList2;
        this.idMarkError = str29;
        this.bloodGroupError = str30;
        this.fullNameError = str15;
        this.mobileNumberError = str31;
    }

    public static /* synthetic */ SubmittedDlDetailsModal copy$default(SubmittedDlDetailsModal submittedDlDetailsModal, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ArrayList arrayList, ArrayList arrayList2, String str13, String str14, String str15, String str16, int i10, Object obj) {
        SubmittedDlDetailsModal submittedDlDetailsModal2 = submittedDlDetailsModal;
        int i11 = i10;
        return submittedDlDetailsModal.copy((i11 & 1) != 0 ? submittedDlDetailsModal2.pinCd : str, (i11 & 2) != 0 ? submittedDlDetailsModal2.gender : str2, (i11 & 4) != 0 ? submittedDlDetailsModal2.lastName : str3, (i11 & 8) != 0 ? submittedDlDetailsModal2.applNo : str4, (i11 & 16) != 0 ? submittedDlDetailsModal2.relation : str5, (i11 & 32) != 0 ? submittedDlDetailsModal2.bloodGroup : str6, (i11 & 64) != 0 ? submittedDlDetailsModal2.dob : str7, (i11 & 128) != 0 ? submittedDlDetailsModal2.street : str8, (i11 & 256) != 0 ? submittedDlDetailsModal2.houseNo : str9, (i11 & 512) != 0 ? submittedDlDetailsModal2.swdName : str10, (i11 & 1024) != 0 ? submittedDlDetailsModal2.location : str11, (i11 & 2048) != 0 ? submittedDlDetailsModal2.applDate : str12, (i11 & 4096) != 0 ? submittedDlDetailsModal2.transactionList : arrayList, (i11 & 8192) != 0 ? submittedDlDetailsModal2.rtoAddressList : arrayList2, (i11 & 16384) != 0 ? submittedDlDetailsModal2.idMarkError : str13, (i11 & 32768) != 0 ? submittedDlDetailsModal2.bloodGroupError : str14, (i11 & 65536) != 0 ? submittedDlDetailsModal2.fullNameError : str15, (i11 & 131072) != 0 ? submittedDlDetailsModal2.mobileNumberError : str16);
    }

    public final String component1() {
        return this.pinCd;
    }

    public final String component10() {
        return this.swdName;
    }

    public final String component11() {
        return this.location;
    }

    public final String component12() {
        return this.applDate;
    }

    public final ArrayList<TransactionListModal> component13() {
        return this.transactionList;
    }

    public final ArrayList<RTOAddressListModal> component14() {
        return this.rtoAddressList;
    }

    public final String component15() {
        return this.idMarkError;
    }

    public final String component16() {
        return this.bloodGroupError;
    }

    public final String component17() {
        return this.fullNameError;
    }

    public final String component18() {
        return this.mobileNumberError;
    }

    public final String component2() {
        return this.gender;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.applNo;
    }

    public final String component5() {
        return this.relation;
    }

    public final String component6() {
        return this.bloodGroup;
    }

    public final String component7() {
        return this.dob;
    }

    public final String component8() {
        return this.street;
    }

    public final String component9() {
        return this.houseNo;
    }

    public final SubmittedDlDetailsModal copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ArrayList<TransactionListModal> arrayList, ArrayList<RTOAddressListModal> arrayList2, String str13, String str14, String str15, String str16) {
        String str17 = str;
        l.f(str17, "pinCd");
        l.f(str2, "gender");
        l.f(str3, "lastName");
        l.f(str4, "applNo");
        l.f(str5, "relation");
        l.f(str6, "bloodGroup");
        l.f(str7, "dob");
        l.f(str8, "street");
        l.f(str9, "houseNo");
        l.f(str10, "swdName");
        l.f(str11, "location");
        l.f(str12, "applDate");
        l.f(str13, "idMarkError");
        l.f(str14, "bloodGroupError");
        l.f(str15, "fullNameError");
        l.f(str16, "mobileNumberError");
        return new SubmittedDlDetailsModal(str17, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, arrayList, arrayList2, str13, str14, str15, str16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmittedDlDetailsModal)) {
            return false;
        }
        SubmittedDlDetailsModal submittedDlDetailsModal = (SubmittedDlDetailsModal) obj;
        return l.a(this.pinCd, submittedDlDetailsModal.pinCd) && l.a(this.gender, submittedDlDetailsModal.gender) && l.a(this.lastName, submittedDlDetailsModal.lastName) && l.a(this.applNo, submittedDlDetailsModal.applNo) && l.a(this.relation, submittedDlDetailsModal.relation) && l.a(this.bloodGroup, submittedDlDetailsModal.bloodGroup) && l.a(this.dob, submittedDlDetailsModal.dob) && l.a(this.street, submittedDlDetailsModal.street) && l.a(this.houseNo, submittedDlDetailsModal.houseNo) && l.a(this.swdName, submittedDlDetailsModal.swdName) && l.a(this.location, submittedDlDetailsModal.location) && l.a(this.applDate, submittedDlDetailsModal.applDate) && l.a(this.transactionList, submittedDlDetailsModal.transactionList) && l.a(this.rtoAddressList, submittedDlDetailsModal.rtoAddressList) && l.a(this.idMarkError, submittedDlDetailsModal.idMarkError) && l.a(this.bloodGroupError, submittedDlDetailsModal.bloodGroupError) && l.a(this.fullNameError, submittedDlDetailsModal.fullNameError) && l.a(this.mobileNumberError, submittedDlDetailsModal.mobileNumberError);
    }

    public final String getApplDate() {
        return this.applDate;
    }

    public final String getApplNo() {
        return this.applNo;
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

    public final String getFullNameError() {
        return this.fullNameError;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getHouseNo() {
        return this.houseNo;
    }

    public final String getIdMarkError() {
        return this.idMarkError;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getMobileNumberError() {
        return this.mobileNumberError;
    }

    public final String getPinCd() {
        return this.pinCd;
    }

    public final String getRelation() {
        return this.relation;
    }

    public final ArrayList<RTOAddressListModal> getRtoAddressList() {
        return this.rtoAddressList;
    }

    public final String getStreet() {
        return this.street;
    }

    public final String getSwdName() {
        return this.swdName;
    }

    public final ArrayList<TransactionListModal> getTransactionList() {
        return this.transactionList;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.pinCd.hashCode() * 31) + this.gender.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.applNo.hashCode()) * 31) + this.relation.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.street.hashCode()) * 31) + this.houseNo.hashCode()) * 31) + this.swdName.hashCode()) * 31) + this.location.hashCode()) * 31) + this.applDate.hashCode()) * 31;
        ArrayList<TransactionListModal> arrayList = this.transactionList;
        int i10 = 0;
        int hashCode2 = (hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<RTOAddressListModal> arrayList2 = this.rtoAddressList;
        if (arrayList2 != null) {
            i10 = arrayList2.hashCode();
        }
        return ((((((((hashCode2 + i10) * 31) + this.idMarkError.hashCode()) * 31) + this.bloodGroupError.hashCode()) * 31) + this.fullNameError.hashCode()) * 31) + this.mobileNumberError.hashCode();
    }

    public final void setGender(String str) {
        l.f(str, "<set-?>");
        this.gender = str;
    }

    public final void setPinCd(String str) {
        l.f(str, "<set-?>");
        this.pinCd = str;
    }

    public String toString() {
        return "SubmittedDlDetailsModal(pinCd=" + this.pinCd + ", gender=" + this.gender + ", lastName=" + this.lastName + ", applNo=" + this.applNo + ", relation=" + this.relation + ", bloodGroup=" + this.bloodGroup + ", dob=" + this.dob + ", street=" + this.street + ", houseNo=" + this.houseNo + ", swdName=" + this.swdName + ", location=" + this.location + ", applDate=" + this.applDate + ", transactionList=" + this.transactionList + ", rtoAddressList=" + this.rtoAddressList + ", idMarkError=" + this.idMarkError + ", bloodGroupError=" + this.bloodGroupError + ", fullNameError=" + this.fullNameError + ", mobileNumberError=" + this.mobileNumberError + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SubmittedDlDetailsModal(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.util.ArrayList r35, java.util.ArrayList r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, int r41, cm.g r42) {
        /*
            r22 = this;
            r0 = r41
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r16 = r2
            goto L_0x000c
        L_0x000a:
            r16 = r35
        L_0x000c:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0013
            r17 = r2
            goto L_0x0015
        L_0x0013:
            r17 = r36
        L_0x0015:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = ""
            r18 = r0
            goto L_0x0020
        L_0x001e:
            r18 = r37
        L_0x0020:
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r19 = r38
            r20 = r39
            r21 = r40
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.NewDlScreen.Modal.SubmittedDlDetailsModal.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
