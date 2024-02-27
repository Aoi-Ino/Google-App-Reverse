package com.nic.mparivahan.VahanServices.ApplicationStatusModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Applnolist implements Serializable {
    private final String appl_dt;
    private final String appl_no;
    private final boolean appointmentpending;
    private final String approvalStatus;
    private final String auth_mode;
    private final boolean facelesstransaction;
    private final boolean isdocuploadpending;
    private final boolean isdraftpending;
    private final boolean isrtorejection;
    private final String offName;
    private final Object office;
    private final int purCd;
    private final String purCdDescr;
    private final Object regnNo;
    private final String regno;
    private final String status;
    private final String statusDesc;

    public Applnolist(String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, boolean z14, String str5, Object obj, int i10, String str6, Object obj2, String str7, String str8, String str9) {
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        Object obj3 = obj;
        String str13 = str6;
        Object obj4 = obj2;
        String str14 = str7;
        String str15 = str8;
        String str16 = str9;
        l.f(str, "appl_dt");
        l.f(str2, "appl_no");
        l.f(str10, "approvalStatus");
        l.f(str11, "auth_mode");
        l.f(str12, "offName");
        l.f(obj3, "office");
        l.f(str13, "purCdDescr");
        l.f(obj4, "regnNo");
        l.f(str14, "regno");
        l.f(str15, "status");
        l.f(str16, "statusDesc");
        this.appl_dt = str;
        this.appl_no = str2;
        this.appointmentpending = z10;
        this.approvalStatus = str10;
        this.auth_mode = str11;
        this.facelesstransaction = z11;
        this.isdocuploadpending = z12;
        this.isdraftpending = z13;
        this.isrtorejection = z14;
        this.offName = str12;
        this.office = obj3;
        this.purCd = i10;
        this.purCdDescr = str13;
        this.regnNo = obj4;
        this.regno = str14;
        this.status = str15;
        this.statusDesc = str16;
    }

    public static /* synthetic */ Applnolist copy$default(Applnolist applnolist, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, boolean z14, String str5, Object obj, int i10, String str6, Object obj2, String str7, String str8, String str9, int i11, Object obj3) {
        Applnolist applnolist2 = applnolist;
        int i12 = i11;
        return applnolist.copy((i12 & 1) != 0 ? applnolist2.appl_dt : str, (i12 & 2) != 0 ? applnolist2.appl_no : str2, (i12 & 4) != 0 ? applnolist2.appointmentpending : z10, (i12 & 8) != 0 ? applnolist2.approvalStatus : str3, (i12 & 16) != 0 ? applnolist2.auth_mode : str4, (i12 & 32) != 0 ? applnolist2.facelesstransaction : z11, (i12 & 64) != 0 ? applnolist2.isdocuploadpending : z12, (i12 & 128) != 0 ? applnolist2.isdraftpending : z13, (i12 & 256) != 0 ? applnolist2.isrtorejection : z14, (i12 & 512) != 0 ? applnolist2.offName : str5, (i12 & 1024) != 0 ? applnolist2.office : obj, (i12 & 2048) != 0 ? applnolist2.purCd : i10, (i12 & 4096) != 0 ? applnolist2.purCdDescr : str6, (i12 & 8192) != 0 ? applnolist2.regnNo : obj2, (i12 & 16384) != 0 ? applnolist2.regno : str7, (i12 & 32768) != 0 ? applnolist2.status : str8, (i12 & 65536) != 0 ? applnolist2.statusDesc : str9);
    }

    public final String component1() {
        return this.appl_dt;
    }

    public final String component10() {
        return this.offName;
    }

    public final Object component11() {
        return this.office;
    }

    public final int component12() {
        return this.purCd;
    }

    public final String component13() {
        return this.purCdDescr;
    }

    public final Object component14() {
        return this.regnNo;
    }

    public final String component15() {
        return this.regno;
    }

    public final String component16() {
        return this.status;
    }

    public final String component17() {
        return this.statusDesc;
    }

    public final String component2() {
        return this.appl_no;
    }

    public final boolean component3() {
        return this.appointmentpending;
    }

    public final String component4() {
        return this.approvalStatus;
    }

    public final String component5() {
        return this.auth_mode;
    }

    public final boolean component6() {
        return this.facelesstransaction;
    }

    public final boolean component7() {
        return this.isdocuploadpending;
    }

    public final boolean component8() {
        return this.isdraftpending;
    }

    public final boolean component9() {
        return this.isrtorejection;
    }

    public final Applnolist copy(String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, boolean z14, String str5, Object obj, int i10, String str6, Object obj2, String str7, String str8, String str9) {
        String str10 = str;
        l.f(str10, "appl_dt");
        l.f(str2, "appl_no");
        l.f(str3, "approvalStatus");
        l.f(str4, "auth_mode");
        l.f(str5, "offName");
        l.f(obj, "office");
        l.f(str6, "purCdDescr");
        l.f(obj2, "regnNo");
        l.f(str7, "regno");
        l.f(str8, "status");
        l.f(str9, "statusDesc");
        return new Applnolist(str10, str2, z10, str3, str4, z11, z12, z13, z14, str5, obj, i10, str6, obj2, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Applnolist)) {
            return false;
        }
        Applnolist applnolist = (Applnolist) obj;
        return l.a(this.appl_dt, applnolist.appl_dt) && l.a(this.appl_no, applnolist.appl_no) && this.appointmentpending == applnolist.appointmentpending && l.a(this.approvalStatus, applnolist.approvalStatus) && l.a(this.auth_mode, applnolist.auth_mode) && this.facelesstransaction == applnolist.facelesstransaction && this.isdocuploadpending == applnolist.isdocuploadpending && this.isdraftpending == applnolist.isdraftpending && this.isrtorejection == applnolist.isrtorejection && l.a(this.offName, applnolist.offName) && l.a(this.office, applnolist.office) && this.purCd == applnolist.purCd && l.a(this.purCdDescr, applnolist.purCdDescr) && l.a(this.regnNo, applnolist.regnNo) && l.a(this.regno, applnolist.regno) && l.a(this.status, applnolist.status) && l.a(this.statusDesc, applnolist.statusDesc);
    }

    public final String getAppl_dt() {
        return this.appl_dt;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final boolean getAppointmentpending() {
        return this.appointmentpending;
    }

    public final String getApprovalStatus() {
        return this.approvalStatus;
    }

    public final String getAuth_mode() {
        return this.auth_mode;
    }

    public final boolean getFacelesstransaction() {
        return this.facelesstransaction;
    }

    public final boolean getIsdocuploadpending() {
        return this.isdocuploadpending;
    }

    public final boolean getIsdraftpending() {
        return this.isdraftpending;
    }

    public final boolean getIsrtorejection() {
        return this.isrtorejection;
    }

    public final String getOffName() {
        return this.offName;
    }

    public final Object getOffice() {
        return this.office;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getPurCdDescr() {
        return this.purCdDescr;
    }

    public final Object getRegnNo() {
        return this.regnNo;
    }

    public final String getRegno() {
        return this.regno;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        int hashCode = ((this.appl_dt.hashCode() * 31) + this.appl_no.hashCode()) * 31;
        boolean z10 = this.appointmentpending;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int hashCode2 = (((((hashCode + (z10 ? 1 : 0)) * 31) + this.approvalStatus.hashCode()) * 31) + this.auth_mode.hashCode()) * 31;
        boolean z12 = this.facelesstransaction;
        if (z12) {
            z12 = true;
        }
        int i10 = (hashCode2 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.isdocuploadpending;
        if (z13) {
            z13 = true;
        }
        int i11 = (i10 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.isdraftpending;
        if (z14) {
            z14 = true;
        }
        int i12 = (i11 + (z14 ? 1 : 0)) * 31;
        boolean z15 = this.isrtorejection;
        if (!z15) {
            z11 = z15;
        }
        return ((((((((((((((((i12 + (z11 ? 1 : 0)) * 31) + this.offName.hashCode()) * 31) + this.office.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.purCdDescr.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.regno.hashCode()) * 31) + this.status.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "Applnolist(appl_dt=" + this.appl_dt + ", appl_no=" + this.appl_no + ", appointmentpending=" + this.appointmentpending + ", approvalStatus=" + this.approvalStatus + ", auth_mode=" + this.auth_mode + ", facelesstransaction=" + this.facelesstransaction + ", isdocuploadpending=" + this.isdocuploadpending + ", isdraftpending=" + this.isdraftpending + ", isrtorejection=" + this.isrtorejection + ", offName=" + this.offName + ", office=" + this.office + ", purCd=" + this.purCd + ", purCdDescr=" + this.purCdDescr + ", regnNo=" + this.regnNo + ", regno=" + this.regno + ", status=" + this.status + ", statusDesc=" + this.statusDesc + ')';
    }
}
