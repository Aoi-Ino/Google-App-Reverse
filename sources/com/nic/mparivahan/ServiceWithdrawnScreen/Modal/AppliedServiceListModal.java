package com.nic.mparivahan.ServiceWithdrawnScreen.Modal;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class AppliedServiceListModal {
    @c("applicationNumber")
    private final String applNo;
    @c("Result")
    private final ArrayList<AppliedServiceResultModal> appliedServiceResultModal;
    @c("status_code")
    private final String statusCd;
    @c("status_desp")
    private final String statusDesp;
    @c("validateService")
    private final String validateService;

    public AppliedServiceListModal() {
        this((String) null, (String) null, (String) null, (String) null, (ArrayList) null, 31, (g) null);
    }

    public static /* synthetic */ AppliedServiceListModal copy$default(AppliedServiceListModal appliedServiceListModal, String str, String str2, String str3, String str4, ArrayList<AppliedServiceResultModal> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appliedServiceListModal.validateService;
        }
        if ((i10 & 2) != 0) {
            str2 = appliedServiceListModal.statusDesp;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = appliedServiceListModal.statusCd;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = appliedServiceListModal.applNo;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            arrayList = appliedServiceListModal.appliedServiceResultModal;
        }
        return appliedServiceListModal.copy(str, str5, str6, str7, arrayList);
    }

    public final String component1() {
        return this.validateService;
    }

    public final String component2() {
        return this.statusDesp;
    }

    public final String component3() {
        return this.statusCd;
    }

    public final String component4() {
        return this.applNo;
    }

    public final ArrayList<AppliedServiceResultModal> component5() {
        return this.appliedServiceResultModal;
    }

    public final AppliedServiceListModal copy(String str, String str2, String str3, String str4, ArrayList<AppliedServiceResultModal> arrayList) {
        l.f(str, "validateService");
        l.f(str2, "statusDesp");
        l.f(str3, "statusCd");
        l.f(str4, "applNo");
        return new AppliedServiceListModal(str, str2, str3, str4, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppliedServiceListModal)) {
            return false;
        }
        AppliedServiceListModal appliedServiceListModal = (AppliedServiceListModal) obj;
        return l.a(this.validateService, appliedServiceListModal.validateService) && l.a(this.statusDesp, appliedServiceListModal.statusDesp) && l.a(this.statusCd, appliedServiceListModal.statusCd) && l.a(this.applNo, appliedServiceListModal.applNo) && l.a(this.appliedServiceResultModal, appliedServiceListModal.appliedServiceResultModal);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final ArrayList<AppliedServiceResultModal> getAppliedServiceResultModal() {
        return this.appliedServiceResultModal;
    }

    public final String getStatusCd() {
        return this.statusCd;
    }

    public final String getStatusDesp() {
        return this.statusDesp;
    }

    public final String getValidateService() {
        return this.validateService;
    }

    public int hashCode() {
        int hashCode = ((((((this.validateService.hashCode() * 31) + this.statusDesp.hashCode()) * 31) + this.statusCd.hashCode()) * 31) + this.applNo.hashCode()) * 31;
        ArrayList<AppliedServiceResultModal> arrayList = this.appliedServiceResultModal;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "AppliedServiceListModal(validateService=" + this.validateService + ", statusDesp=" + this.statusDesp + ", statusCd=" + this.statusCd + ", applNo=" + this.applNo + ", appliedServiceResultModal=" + this.appliedServiceResultModal + ')';
    }

    public AppliedServiceListModal(String str, String str2, String str3, String str4, ArrayList<AppliedServiceResultModal> arrayList) {
        l.f(str, "validateService");
        l.f(str2, "statusDesp");
        l.f(str3, "statusCd");
        l.f(str4, "applNo");
        this.validateService = str;
        this.statusDesp = str2;
        this.statusCd = str3;
        this.applNo = str4;
        this.appliedServiceResultModal = arrayList;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AppliedServiceListModal(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.ArrayList r8, int r9, cm.g r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0008
            r10 = r0
            goto L_0x0009
        L_0x0008:
            r10 = r4
        L_0x0009:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r5
        L_0x0010:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r6
        L_0x0017:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r7
        L_0x001d:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0022
            r8 = 0
        L_0x0022:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ServiceWithdrawnScreen.Modal.AppliedServiceListModal.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, int, cm.g):void");
    }
}
