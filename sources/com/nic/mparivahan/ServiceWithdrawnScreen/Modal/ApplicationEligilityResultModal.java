package com.nic.mparivahan.ServiceWithdrawnScreen.Modal;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ApplicationEligilityResultModal {
    @c("Last Name")
    private final String LName;
    @c("Middle Name")
    private final String MName;
    @c("error_msg")
    private final String errorMsg;
    @c("First Name")
    private final String fName;
    @c("Mobile No")
    private final String mobileNo;
    @c("Relation Type")
    private final String relationType;
    @c("Relative First Name")
    private final String relativeFName;
    @c("Relative Last Name")
    private final String relativeLName;
    @c("Relative Middle Name")
    private final String relativeMName;

    public ApplicationEligilityResultModal() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511, (g) null);
    }

    public static /* synthetic */ ApplicationEligilityResultModal copy$default(ApplicationEligilityResultModal applicationEligilityResultModal, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, Object obj) {
        ApplicationEligilityResultModal applicationEligilityResultModal2 = applicationEligilityResultModal;
        int i11 = i10;
        return applicationEligilityResultModal.copy((i11 & 1) != 0 ? applicationEligilityResultModal2.relationType : str, (i11 & 2) != 0 ? applicationEligilityResultModal2.relativeFName : str2, (i11 & 4) != 0 ? applicationEligilityResultModal2.fName : str3, (i11 & 8) != 0 ? applicationEligilityResultModal2.MName : str4, (i11 & 16) != 0 ? applicationEligilityResultModal2.LName : str5, (i11 & 32) != 0 ? applicationEligilityResultModal2.relativeLName : str6, (i11 & 64) != 0 ? applicationEligilityResultModal2.relativeMName : str7, (i11 & 128) != 0 ? applicationEligilityResultModal2.mobileNo : str8, (i11 & 256) != 0 ? applicationEligilityResultModal2.errorMsg : str9);
    }

    public final String component1() {
        return this.relationType;
    }

    public final String component2() {
        return this.relativeFName;
    }

    public final String component3() {
        return this.fName;
    }

    public final String component4() {
        return this.MName;
    }

    public final String component5() {
        return this.LName;
    }

    public final String component6() {
        return this.relativeLName;
    }

    public final String component7() {
        return this.relativeMName;
    }

    public final String component8() {
        return this.mobileNo;
    }

    public final String component9() {
        return this.errorMsg;
    }

    public final ApplicationEligilityResultModal copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        l.f(str, "relationType");
        l.f(str2, "relativeFName");
        l.f(str3, "fName");
        l.f(str4, "MName");
        String str10 = str5;
        l.f(str10, "LName");
        String str11 = str6;
        l.f(str11, "relativeLName");
        String str12 = str7;
        l.f(str12, "relativeMName");
        String str13 = str8;
        l.f(str13, "mobileNo");
        String str14 = str9;
        l.f(str14, "errorMsg");
        return new ApplicationEligilityResultModal(str, str2, str3, str4, str10, str11, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationEligilityResultModal)) {
            return false;
        }
        ApplicationEligilityResultModal applicationEligilityResultModal = (ApplicationEligilityResultModal) obj;
        return l.a(this.relationType, applicationEligilityResultModal.relationType) && l.a(this.relativeFName, applicationEligilityResultModal.relativeFName) && l.a(this.fName, applicationEligilityResultModal.fName) && l.a(this.MName, applicationEligilityResultModal.MName) && l.a(this.LName, applicationEligilityResultModal.LName) && l.a(this.relativeLName, applicationEligilityResultModal.relativeLName) && l.a(this.relativeMName, applicationEligilityResultModal.relativeMName) && l.a(this.mobileNo, applicationEligilityResultModal.mobileNo) && l.a(this.errorMsg, applicationEligilityResultModal.errorMsg);
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final String getFName() {
        return this.fName;
    }

    public final String getLName() {
        return this.LName;
    }

    public final String getMName() {
        return this.MName;
    }

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final String getRelationType() {
        return this.relationType;
    }

    public final String getRelativeFName() {
        return this.relativeFName;
    }

    public final String getRelativeLName() {
        return this.relativeLName;
    }

    public final String getRelativeMName() {
        return this.relativeMName;
    }

    public int hashCode() {
        return (((((((((((((((this.relationType.hashCode() * 31) + this.relativeFName.hashCode()) * 31) + this.fName.hashCode()) * 31) + this.MName.hashCode()) * 31) + this.LName.hashCode()) * 31) + this.relativeLName.hashCode()) * 31) + this.relativeMName.hashCode()) * 31) + this.mobileNo.hashCode()) * 31) + this.errorMsg.hashCode();
    }

    public String toString() {
        return "ApplicationEligilityResultModal(relationType=" + this.relationType + ", relativeFName=" + this.relativeFName + ", fName=" + this.fName + ", MName=" + this.MName + ", LName=" + this.LName + ", relativeLName=" + this.relativeLName + ", relativeMName=" + this.relativeMName + ", mobileNo=" + this.mobileNo + ", errorMsg=" + this.errorMsg + ')';
    }

    public ApplicationEligilityResultModal(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        l.f(str, "relationType");
        l.f(str2, "relativeFName");
        l.f(str3, "fName");
        l.f(str4, "MName");
        l.f(str5, "LName");
        l.f(str6, "relativeLName");
        l.f(str7, "relativeMName");
        l.f(str8, "mobileNo");
        l.f(str9, "errorMsg");
        this.relationType = str;
        this.relativeFName = str2;
        this.fName = str3;
        this.MName = str4;
        this.LName = str5;
        this.relativeLName = str6;
        this.relativeMName = str7;
        this.mobileNo = str8;
        this.errorMsg = str9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ApplicationEligilityResultModal(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, cm.g r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r11
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r12
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r13
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0020
        L_0x001f:
            r5 = r14
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0027
        L_0x0026:
            r6 = r15
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r16
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r17
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r18
        L_0x003f:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r2 = r19
        L_0x0046:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ServiceWithdrawnScreen.Modal.ApplicationEligilityResultModal.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
