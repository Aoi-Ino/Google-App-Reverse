package com.nic.mparivahan.dlservices.data.model.mobupdate;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class GetMobDetailsResponse {
    @c("approvDt")
    private final Object approvDt;
    @c("bioId")
    private final Object bioId;
    @c("checkMobCount")
    private final Object checkMobCount;
    @c("cnfMobNum")
    private final Object cnfMobNum;
    @c("dob")
    private final String dob;
    @c("emailId")
    private final Object emailId;
    @c("errorMsg")
    private final String errorMsg;
    @c("errorcd")
    private final Integer errorcd;
    @c("flag")
    private final Boolean flag;
    @c("fullName")
    private final String fullName;
    @c("ipAddr")
    private final Object ipAddr;
    @c("isVerified")
    private final Object isVerified;
    @c("licIssueDate")
    private final Object licIssueDate;
    @c("licNo")
    private final Object licNo;
    @c("licType")
    private final String licType;
    @c("newMobNum")
    private final Object newMobNum;
    @c("oldMobNum")
    private final Object oldMobNum;
    @c("reason")
    private final Object reason;
    @c("reqDt")
    private final Object reqDt;
    @c("reqStatus")
    private final Object reqStatus;
    @c("requestedBy")
    private final Object requestedBy;
    @c("rtoCode")
    private final String rtoCode;
    @c("selectedRadioVal")
    private final Object selectedRadioVal;
    @c("swdName")
    private final String swdName;

    public GetMobDetailsResponse() {
        this((Object) null, (Object) null, (Object) null, (Boolean) null, (Object) null, (Object) null, (Object) null, (String) null, (String) null, (Object) null, (String) null, (Object) null, (Object) null, (String) null, (Object) null, (String) null, (Object) null, (Integer) null, (Object) null, (Object) null, (Object) null, (Object) null, (String) null, (Object) null, 16777215, (g) null);
    }

    public static /* synthetic */ GetMobDetailsResponse copy$default(GetMobDetailsResponse getMobDetailsResponse, Object obj, Object obj2, Object obj3, Boolean bool, Object obj4, Object obj5, Object obj6, String str, String str2, Object obj7, String str3, Object obj8, Object obj9, String str4, Object obj10, String str5, Object obj11, Integer num, Object obj12, Object obj13, Object obj14, Object obj15, String str6, Object obj16, int i10, Object obj17) {
        GetMobDetailsResponse getMobDetailsResponse2 = getMobDetailsResponse;
        int i11 = i10;
        return getMobDetailsResponse.copy((i11 & 1) != 0 ? getMobDetailsResponse2.selectedRadioVal : obj, (i11 & 2) != 0 ? getMobDetailsResponse2.reason : obj2, (i11 & 4) != 0 ? getMobDetailsResponse2.cnfMobNum : obj3, (i11 & 8) != 0 ? getMobDetailsResponse2.flag : bool, (i11 & 16) != 0 ? getMobDetailsResponse2.licNo : obj4, (i11 & 32) != 0 ? getMobDetailsResponse2.oldMobNum : obj5, (i11 & 64) != 0 ? getMobDetailsResponse2.isVerified : obj6, (i11 & 128) != 0 ? getMobDetailsResponse2.swdName : str, (i11 & 256) != 0 ? getMobDetailsResponse2.licType : str2, (i11 & 512) != 0 ? getMobDetailsResponse2.checkMobCount : obj7, (i11 & 1024) != 0 ? getMobDetailsResponse2.fullName : str3, (i11 & 2048) != 0 ? getMobDetailsResponse2.emailId : obj8, (i11 & 4096) != 0 ? getMobDetailsResponse2.approvDt : obj9, (i11 & 8192) != 0 ? getMobDetailsResponse2.rtoCode : str4, (i11 & 16384) != 0 ? getMobDetailsResponse2.ipAddr : obj10, (i11 & 32768) != 0 ? getMobDetailsResponse2.errorMsg : str5, (i11 & 65536) != 0 ? getMobDetailsResponse2.requestedBy : obj11, (i11 & 131072) != 0 ? getMobDetailsResponse2.errorcd : num, (i11 & 262144) != 0 ? getMobDetailsResponse2.licIssueDate : obj12, (i11 & 524288) != 0 ? getMobDetailsResponse2.reqStatus : obj13, (i11 & 1048576) != 0 ? getMobDetailsResponse2.newMobNum : obj14, (i11 & 2097152) != 0 ? getMobDetailsResponse2.bioId : obj15, (i11 & 4194304) != 0 ? getMobDetailsResponse2.dob : str6, (i11 & 8388608) != 0 ? getMobDetailsResponse2.reqDt : obj16);
    }

    public final Object component1() {
        return this.selectedRadioVal;
    }

    public final Object component10() {
        return this.checkMobCount;
    }

    public final String component11() {
        return this.fullName;
    }

    public final Object component12() {
        return this.emailId;
    }

    public final Object component13() {
        return this.approvDt;
    }

    public final String component14() {
        return this.rtoCode;
    }

    public final Object component15() {
        return this.ipAddr;
    }

    public final String component16() {
        return this.errorMsg;
    }

    public final Object component17() {
        return this.requestedBy;
    }

    public final Integer component18() {
        return this.errorcd;
    }

    public final Object component19() {
        return this.licIssueDate;
    }

    public final Object component2() {
        return this.reason;
    }

    public final Object component20() {
        return this.reqStatus;
    }

    public final Object component21() {
        return this.newMobNum;
    }

    public final Object component22() {
        return this.bioId;
    }

    public final String component23() {
        return this.dob;
    }

    public final Object component24() {
        return this.reqDt;
    }

    public final Object component3() {
        return this.cnfMobNum;
    }

    public final Boolean component4() {
        return this.flag;
    }

    public final Object component5() {
        return this.licNo;
    }

    public final Object component6() {
        return this.oldMobNum;
    }

    public final Object component7() {
        return this.isVerified;
    }

    public final String component8() {
        return this.swdName;
    }

    public final String component9() {
        return this.licType;
    }

    public final GetMobDetailsResponse copy(Object obj, Object obj2, Object obj3, Boolean bool, Object obj4, Object obj5, Object obj6, String str, String str2, Object obj7, String str3, Object obj8, Object obj9, String str4, Object obj10, String str5, Object obj11, Integer num, Object obj12, Object obj13, Object obj14, Object obj15, String str6, Object obj16) {
        return new GetMobDetailsResponse(obj, obj2, obj3, bool, obj4, obj5, obj6, str, str2, obj7, str3, obj8, obj9, str4, obj10, str5, obj11, num, obj12, obj13, obj14, obj15, str6, obj16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetMobDetailsResponse)) {
            return false;
        }
        GetMobDetailsResponse getMobDetailsResponse = (GetMobDetailsResponse) obj;
        return l.a(this.selectedRadioVal, getMobDetailsResponse.selectedRadioVal) && l.a(this.reason, getMobDetailsResponse.reason) && l.a(this.cnfMobNum, getMobDetailsResponse.cnfMobNum) && l.a(this.flag, getMobDetailsResponse.flag) && l.a(this.licNo, getMobDetailsResponse.licNo) && l.a(this.oldMobNum, getMobDetailsResponse.oldMobNum) && l.a(this.isVerified, getMobDetailsResponse.isVerified) && l.a(this.swdName, getMobDetailsResponse.swdName) && l.a(this.licType, getMobDetailsResponse.licType) && l.a(this.checkMobCount, getMobDetailsResponse.checkMobCount) && l.a(this.fullName, getMobDetailsResponse.fullName) && l.a(this.emailId, getMobDetailsResponse.emailId) && l.a(this.approvDt, getMobDetailsResponse.approvDt) && l.a(this.rtoCode, getMobDetailsResponse.rtoCode) && l.a(this.ipAddr, getMobDetailsResponse.ipAddr) && l.a(this.errorMsg, getMobDetailsResponse.errorMsg) && l.a(this.requestedBy, getMobDetailsResponse.requestedBy) && l.a(this.errorcd, getMobDetailsResponse.errorcd) && l.a(this.licIssueDate, getMobDetailsResponse.licIssueDate) && l.a(this.reqStatus, getMobDetailsResponse.reqStatus) && l.a(this.newMobNum, getMobDetailsResponse.newMobNum) && l.a(this.bioId, getMobDetailsResponse.bioId) && l.a(this.dob, getMobDetailsResponse.dob) && l.a(this.reqDt, getMobDetailsResponse.reqDt);
    }

    public final Object getApprovDt() {
        return this.approvDt;
    }

    public final Object getBioId() {
        return this.bioId;
    }

    public final Object getCheckMobCount() {
        return this.checkMobCount;
    }

    public final Object getCnfMobNum() {
        return this.cnfMobNum;
    }

    public final String getDob() {
        return this.dob;
    }

    public final Object getEmailId() {
        return this.emailId;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final Integer getErrorcd() {
        return this.errorcd;
    }

    public final Boolean getFlag() {
        return this.flag;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final Object getIpAddr() {
        return this.ipAddr;
    }

    public final Object getLicIssueDate() {
        return this.licIssueDate;
    }

    public final Object getLicNo() {
        return this.licNo;
    }

    public final String getLicType() {
        return this.licType;
    }

    public final Object getNewMobNum() {
        return this.newMobNum;
    }

    public final Object getOldMobNum() {
        return this.oldMobNum;
    }

    public final Object getReason() {
        return this.reason;
    }

    public final Object getReqDt() {
        return this.reqDt;
    }

    public final Object getReqStatus() {
        return this.reqStatus;
    }

    public final Object getRequestedBy() {
        return this.requestedBy;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final Object getSelectedRadioVal() {
        return this.selectedRadioVal;
    }

    public final String getSwdName() {
        return this.swdName;
    }

    public int hashCode() {
        Object obj = this.selectedRadioVal;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.reason;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.cnfMobNum;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Boolean bool = this.flag;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Object obj4 = this.licNo;
        int hashCode5 = (hashCode4 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.oldMobNum;
        int hashCode6 = (hashCode5 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.isVerified;
        int hashCode7 = (hashCode6 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        String str = this.swdName;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.licType;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj7 = this.checkMobCount;
        int hashCode10 = (hashCode9 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        String str3 = this.fullName;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj8 = this.emailId;
        int hashCode12 = (hashCode11 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.approvDt;
        int hashCode13 = (hashCode12 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        String str4 = this.rtoCode;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Object obj10 = this.ipAddr;
        int hashCode15 = (hashCode14 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        String str5 = this.errorMsg;
        int hashCode16 = (hashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Object obj11 = this.requestedBy;
        int hashCode17 = (hashCode16 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Integer num = this.errorcd;
        int hashCode18 = (hashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj12 = this.licIssueDate;
        int hashCode19 = (hashCode18 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        Object obj13 = this.reqStatus;
        int hashCode20 = (hashCode19 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
        Object obj14 = this.newMobNum;
        int hashCode21 = (hashCode20 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
        Object obj15 = this.bioId;
        int hashCode22 = (hashCode21 + (obj15 == null ? 0 : obj15.hashCode())) * 31;
        String str6 = this.dob;
        int hashCode23 = (hashCode22 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj16 = this.reqDt;
        if (obj16 != null) {
            i10 = obj16.hashCode();
        }
        return hashCode23 + i10;
    }

    public final Object isVerified() {
        return this.isVerified;
    }

    public String toString() {
        return "GetMobDetailsResponse(selectedRadioVal=" + this.selectedRadioVal + ", reason=" + this.reason + ", cnfMobNum=" + this.cnfMobNum + ", flag=" + this.flag + ", licNo=" + this.licNo + ", oldMobNum=" + this.oldMobNum + ", isVerified=" + this.isVerified + ", swdName=" + this.swdName + ", licType=" + this.licType + ", checkMobCount=" + this.checkMobCount + ", fullName=" + this.fullName + ", emailId=" + this.emailId + ", approvDt=" + this.approvDt + ", rtoCode=" + this.rtoCode + ", ipAddr=" + this.ipAddr + ", errorMsg=" + this.errorMsg + ", requestedBy=" + this.requestedBy + ", errorcd=" + this.errorcd + ", licIssueDate=" + this.licIssueDate + ", reqStatus=" + this.reqStatus + ", newMobNum=" + this.newMobNum + ", bioId=" + this.bioId + ", dob=" + this.dob + ", reqDt=" + this.reqDt + ')';
    }

    public GetMobDetailsResponse(Object obj, Object obj2, Object obj3, Boolean bool, Object obj4, Object obj5, Object obj6, String str, String str2, Object obj7, String str3, Object obj8, Object obj9, String str4, Object obj10, String str5, Object obj11, Integer num, Object obj12, Object obj13, Object obj14, Object obj15, String str6, Object obj16) {
        this.selectedRadioVal = obj;
        this.reason = obj2;
        this.cnfMobNum = obj3;
        this.flag = bool;
        this.licNo = obj4;
        this.oldMobNum = obj5;
        this.isVerified = obj6;
        this.swdName = str;
        this.licType = str2;
        this.checkMobCount = obj7;
        this.fullName = str3;
        this.emailId = obj8;
        this.approvDt = obj9;
        this.rtoCode = str4;
        this.ipAddr = obj10;
        this.errorMsg = str5;
        this.requestedBy = obj11;
        this.errorcd = num;
        this.licIssueDate = obj12;
        this.reqStatus = obj13;
        this.newMobNum = obj14;
        this.bioId = obj15;
        this.dob = str6;
        this.reqDt = obj16;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GetMobDetailsResponse(java.lang.Object r26, java.lang.Object r27, java.lang.Object r28, java.lang.Boolean r29, java.lang.Object r30, java.lang.Object r31, java.lang.Object r32, java.lang.String r33, java.lang.String r34, java.lang.Object r35, java.lang.String r36, java.lang.Object r37, java.lang.Object r38, java.lang.String r39, java.lang.Object r40, java.lang.String r41, java.lang.Object r42, java.lang.Integer r43, java.lang.Object r44, java.lang.Object r45, java.lang.Object r46, java.lang.Object r47, java.lang.String r48, java.lang.Object r49, int r50, cm.g r51) {
        /*
            r25 = this;
            r0 = r50
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r26
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r27
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r28
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r29
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r30
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r31
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r32
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r33
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r34
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r35
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r36
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r37
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r38
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r39
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r40
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r41
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r42
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r43
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r44
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r45
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r46
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r47
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r48
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r24
            if (r0 == 0) goto L_0x00db
            r0 = 0
            goto L_0x00dd
        L_0x00db:
            r0 = r49
        L_0x00dd:
            r26 = r25
            r27 = r1
            r28 = r3
            r29 = r4
            r30 = r5
            r31 = r6
            r32 = r7
            r33 = r8
            r34 = r9
            r35 = r10
            r36 = r11
            r37 = r12
            r38 = r13
            r39 = r14
            r40 = r15
            r41 = r2
            r42 = r16
            r43 = r17
            r44 = r18
            r45 = r19
            r46 = r20
            r47 = r21
            r48 = r22
            r49 = r23
            r50 = r0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.mobupdate.GetMobDetailsResponse.<init>(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Boolean, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Object, int, cm.g):void");
    }
}
