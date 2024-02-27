package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class DoorStepReq {
    private final String applNo;
    private final String authType;
    private final int officeCode;
    private final String opDate;
    private final ArrayList<Integer> purCd;
    private final String regnNo;
    private final String stateCode;
    private final String status;
    private final int userCode;

    public DoorStepReq(String str, String str2, int i10, String str3, ArrayList<Integer> arrayList, String str4, String str5, String str6, int i11) {
        l.f(str2, "authType");
        l.f(str3, "opDate");
        l.f(arrayList, "purCd");
        l.f(str4, "regnNo");
        l.f(str5, "stateCode");
        l.f(str6, "status");
        this.applNo = str;
        this.authType = str2;
        this.officeCode = i10;
        this.opDate = str3;
        this.purCd = arrayList;
        this.regnNo = str4;
        this.stateCode = str5;
        this.status = str6;
        this.userCode = i11;
    }

    public static /* synthetic */ DoorStepReq copy$default(DoorStepReq doorStepReq, String str, String str2, int i10, String str3, ArrayList arrayList, String str4, String str5, String str6, int i11, int i12, Object obj) {
        DoorStepReq doorStepReq2 = doorStepReq;
        int i13 = i12;
        return doorStepReq.copy((i13 & 1) != 0 ? doorStepReq2.applNo : str, (i13 & 2) != 0 ? doorStepReq2.authType : str2, (i13 & 4) != 0 ? doorStepReq2.officeCode : i10, (i13 & 8) != 0 ? doorStepReq2.opDate : str3, (i13 & 16) != 0 ? doorStepReq2.purCd : arrayList, (i13 & 32) != 0 ? doorStepReq2.regnNo : str4, (i13 & 64) != 0 ? doorStepReq2.stateCode : str5, (i13 & 128) != 0 ? doorStepReq2.status : str6, (i13 & 256) != 0 ? doorStepReq2.userCode : i11);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component2() {
        return this.authType;
    }

    public final int component3() {
        return this.officeCode;
    }

    public final String component4() {
        return this.opDate;
    }

    public final ArrayList<Integer> component5() {
        return this.purCd;
    }

    public final String component6() {
        return this.regnNo;
    }

    public final String component7() {
        return this.stateCode;
    }

    public final String component8() {
        return this.status;
    }

    public final int component9() {
        return this.userCode;
    }

    public final DoorStepReq copy(String str, String str2, int i10, String str3, ArrayList<Integer> arrayList, String str4, String str5, String str6, int i11) {
        l.f(str2, "authType");
        l.f(str3, "opDate");
        ArrayList<Integer> arrayList2 = arrayList;
        l.f(arrayList2, "purCd");
        String str7 = str4;
        l.f(str7, "regnNo");
        String str8 = str5;
        l.f(str8, "stateCode");
        String str9 = str6;
        l.f(str9, "status");
        return new DoorStepReq(str, str2, i10, str3, arrayList2, str7, str8, str9, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoorStepReq)) {
            return false;
        }
        DoorStepReq doorStepReq = (DoorStepReq) obj;
        return l.a(this.applNo, doorStepReq.applNo) && l.a(this.authType, doorStepReq.authType) && this.officeCode == doorStepReq.officeCode && l.a(this.opDate, doorStepReq.opDate) && l.a(this.purCd, doorStepReq.purCd) && l.a(this.regnNo, doorStepReq.regnNo) && l.a(this.stateCode, doorStepReq.stateCode) && l.a(this.status, doorStepReq.status) && this.userCode == doorStepReq.userCode;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthType() {
        return this.authType;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final String getOpDate() {
        return this.opDate;
    }

    public final ArrayList<Integer> getPurCd() {
        return this.purCd;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getStatus() {
        return this.status;
    }

    public final int getUserCode() {
        return this.userCode;
    }

    public int hashCode() {
        String str = this.applNo;
        return ((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.authType.hashCode()) * 31) + Integer.hashCode(this.officeCode)) * 31) + this.opDate.hashCode()) * 31) + this.purCd.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.stateCode.hashCode()) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.userCode);
    }

    public String toString() {
        return "DoorStepReq(applNo=" + this.applNo + ", authType=" + this.authType + ", officeCode=" + this.officeCode + ", opDate=" + this.opDate + ", purCd=" + this.purCd + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", status=" + this.status + ", userCode=" + this.userCode + ')';
    }
}
