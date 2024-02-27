package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ApplStatusCurrentListModel {
    private final String appl_dt;
    private final String appl_no;
    private final boolean appointmentRequired;
    private final boolean appointmentpending;
    private final String auth_mode;
    private final String chassisNo;
    private final Object curr_off_cd;
    private final String currentstatus;
    private final boolean documentsRequired;
    private final boolean facelesstransaction;
    private final boolean isdocuploadpending;
    private final boolean isdraftpending;
    private final boolean isrtorejection;
    private final String offName;
    private final String publicRemark;
    private final int purCd;
    private final String purCdDescr;
    private final String receiptNo;
    private final String registeredAt;
    private final String regno;
    private final String statusDesc;

    public ApplStatusCurrentListModel(String str, String str2, String str3, int i10, String str4, String str5, Object obj, String str6, String str7, String str8, boolean z10, boolean z11, boolean z12, String str9, String str10, boolean z13, boolean z14, boolean z15, boolean z16, String str11, String str12) {
        String str13 = str4;
        String str14 = str5;
        Object obj2 = obj;
        String str15 = str6;
        String str16 = str7;
        String str17 = str12;
        l.f(str, "appl_no");
        l.f(str2, "appl_dt");
        l.f(str3, "regno");
        l.f(str13, "purCdDescr");
        l.f(str14, "currentstatus");
        l.f(obj2, "curr_off_cd");
        l.f(str15, "statusDesc");
        l.f(str16, "registeredAt");
        l.f(str17, "auth_mode");
        this.appl_no = str;
        this.appl_dt = str2;
        this.regno = str3;
        this.purCd = i10;
        this.purCdDescr = str13;
        this.currentstatus = str14;
        this.curr_off_cd = obj2;
        this.statusDesc = str15;
        this.registeredAt = str16;
        this.offName = str8;
        this.facelesstransaction = z10;
        this.isdocuploadpending = z11;
        this.appointmentpending = z12;
        this.receiptNo = str9;
        this.chassisNo = str10;
        this.isrtorejection = z13;
        this.isdraftpending = z14;
        this.appointmentRequired = z15;
        this.documentsRequired = z16;
        this.publicRemark = str11;
        this.auth_mode = str17;
    }

    public static /* synthetic */ ApplStatusCurrentListModel copy$default(ApplStatusCurrentListModel applStatusCurrentListModel, String str, String str2, String str3, int i10, String str4, String str5, Object obj, String str6, String str7, String str8, boolean z10, boolean z11, boolean z12, String str9, String str10, boolean z13, boolean z14, boolean z15, boolean z16, String str11, String str12, int i11, Object obj2) {
        ApplStatusCurrentListModel applStatusCurrentListModel2 = applStatusCurrentListModel;
        int i12 = i11;
        return applStatusCurrentListModel.copy((i12 & 1) != 0 ? applStatusCurrentListModel2.appl_no : str, (i12 & 2) != 0 ? applStatusCurrentListModel2.appl_dt : str2, (i12 & 4) != 0 ? applStatusCurrentListModel2.regno : str3, (i12 & 8) != 0 ? applStatusCurrentListModel2.purCd : i10, (i12 & 16) != 0 ? applStatusCurrentListModel2.purCdDescr : str4, (i12 & 32) != 0 ? applStatusCurrentListModel2.currentstatus : str5, (i12 & 64) != 0 ? applStatusCurrentListModel2.curr_off_cd : obj, (i12 & 128) != 0 ? applStatusCurrentListModel2.statusDesc : str6, (i12 & 256) != 0 ? applStatusCurrentListModel2.registeredAt : str7, (i12 & 512) != 0 ? applStatusCurrentListModel2.offName : str8, (i12 & 1024) != 0 ? applStatusCurrentListModel2.facelesstransaction : z10, (i12 & 2048) != 0 ? applStatusCurrentListModel2.isdocuploadpending : z11, (i12 & 4096) != 0 ? applStatusCurrentListModel2.appointmentpending : z12, (i12 & 8192) != 0 ? applStatusCurrentListModel2.receiptNo : str9, (i12 & 16384) != 0 ? applStatusCurrentListModel2.chassisNo : str10, (i12 & 32768) != 0 ? applStatusCurrentListModel2.isrtorejection : z13, (i12 & 65536) != 0 ? applStatusCurrentListModel2.isdraftpending : z14, (i12 & 131072) != 0 ? applStatusCurrentListModel2.appointmentRequired : z15, (i12 & 262144) != 0 ? applStatusCurrentListModel2.documentsRequired : z16, (i12 & 524288) != 0 ? applStatusCurrentListModel2.publicRemark : str11, (i12 & 1048576) != 0 ? applStatusCurrentListModel2.auth_mode : str12);
    }

    public final String component1() {
        return this.appl_no;
    }

    public final String component10() {
        return this.offName;
    }

    public final boolean component11() {
        return this.facelesstransaction;
    }

    public final boolean component12() {
        return this.isdocuploadpending;
    }

    public final boolean component13() {
        return this.appointmentpending;
    }

    public final String component14() {
        return this.receiptNo;
    }

    public final String component15() {
        return this.chassisNo;
    }

    public final boolean component16() {
        return this.isrtorejection;
    }

    public final boolean component17() {
        return this.isdraftpending;
    }

    public final boolean component18() {
        return this.appointmentRequired;
    }

    public final boolean component19() {
        return this.documentsRequired;
    }

    public final String component2() {
        return this.appl_dt;
    }

    public final String component20() {
        return this.publicRemark;
    }

    public final String component21() {
        return this.auth_mode;
    }

    public final String component3() {
        return this.regno;
    }

    public final int component4() {
        return this.purCd;
    }

    public final String component5() {
        return this.purCdDescr;
    }

    public final String component6() {
        return this.currentstatus;
    }

    public final Object component7() {
        return this.curr_off_cd;
    }

    public final String component8() {
        return this.statusDesc;
    }

    public final String component9() {
        return this.registeredAt;
    }

    public final ApplStatusCurrentListModel copy(String str, String str2, String str3, int i10, String str4, String str5, Object obj, String str6, String str7, String str8, boolean z10, boolean z11, boolean z12, String str9, String str10, boolean z13, boolean z14, boolean z15, boolean z16, String str11, String str12) {
        String str13 = str;
        l.f(str13, "appl_no");
        l.f(str2, "appl_dt");
        l.f(str3, "regno");
        l.f(str4, "purCdDescr");
        l.f(str5, "currentstatus");
        l.f(obj, "curr_off_cd");
        l.f(str6, "statusDesc");
        l.f(str7, "registeredAt");
        l.f(str12, "auth_mode");
        return new ApplStatusCurrentListModel(str13, str2, str3, i10, str4, str5, obj, str6, str7, str8, z10, z11, z12, str9, str10, z13, z14, z15, z16, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplStatusCurrentListModel)) {
            return false;
        }
        ApplStatusCurrentListModel applStatusCurrentListModel = (ApplStatusCurrentListModel) obj;
        return l.a(this.appl_no, applStatusCurrentListModel.appl_no) && l.a(this.appl_dt, applStatusCurrentListModel.appl_dt) && l.a(this.regno, applStatusCurrentListModel.regno) && this.purCd == applStatusCurrentListModel.purCd && l.a(this.purCdDescr, applStatusCurrentListModel.purCdDescr) && l.a(this.currentstatus, applStatusCurrentListModel.currentstatus) && l.a(this.curr_off_cd, applStatusCurrentListModel.curr_off_cd) && l.a(this.statusDesc, applStatusCurrentListModel.statusDesc) && l.a(this.registeredAt, applStatusCurrentListModel.registeredAt) && l.a(this.offName, applStatusCurrentListModel.offName) && this.facelesstransaction == applStatusCurrentListModel.facelesstransaction && this.isdocuploadpending == applStatusCurrentListModel.isdocuploadpending && this.appointmentpending == applStatusCurrentListModel.appointmentpending && l.a(this.receiptNo, applStatusCurrentListModel.receiptNo) && l.a(this.chassisNo, applStatusCurrentListModel.chassisNo) && this.isrtorejection == applStatusCurrentListModel.isrtorejection && this.isdraftpending == applStatusCurrentListModel.isdraftpending && this.appointmentRequired == applStatusCurrentListModel.appointmentRequired && this.documentsRequired == applStatusCurrentListModel.documentsRequired && l.a(this.publicRemark, applStatusCurrentListModel.publicRemark) && l.a(this.auth_mode, applStatusCurrentListModel.auth_mode);
    }

    public final String getAppl_dt() {
        return this.appl_dt;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final boolean getAppointmentRequired() {
        return this.appointmentRequired;
    }

    public final boolean getAppointmentpending() {
        return this.appointmentpending;
    }

    public final String getAuth_mode() {
        return this.auth_mode;
    }

    public final String getChassisNo() {
        return this.chassisNo;
    }

    public final Object getCurr_off_cd() {
        return this.curr_off_cd;
    }

    public final String getCurrentstatus() {
        return this.currentstatus;
    }

    public final boolean getDocumentsRequired() {
        return this.documentsRequired;
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

    public final String getPublicRemark() {
        return this.publicRemark;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getPurCdDescr() {
        return this.purCdDescr;
    }

    public final String getReceiptNo() {
        return this.receiptNo;
    }

    public final String getRegisteredAt() {
        return this.registeredAt;
    }

    public final String getRegno() {
        return this.regno;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.appl_no.hashCode() * 31) + this.appl_dt.hashCode()) * 31) + this.regno.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.purCdDescr.hashCode()) * 31) + this.currentstatus.hashCode()) * 31) + this.curr_off_cd.hashCode()) * 31) + this.statusDesc.hashCode()) * 31) + this.registeredAt.hashCode()) * 31;
        String str = this.offName;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.facelesstransaction;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i11 = (hashCode2 + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.isdocuploadpending;
        if (z12) {
            z12 = true;
        }
        int i12 = (i11 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.appointmentpending;
        if (z13) {
            z13 = true;
        }
        int i13 = (i12 + (z13 ? 1 : 0)) * 31;
        String str2 = this.receiptNo;
        int hashCode3 = (i13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chassisNo;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z14 = this.isrtorejection;
        if (z14) {
            z14 = true;
        }
        int i14 = (hashCode4 + (z14 ? 1 : 0)) * 31;
        boolean z15 = this.isdraftpending;
        if (z15) {
            z15 = true;
        }
        int i15 = (i14 + (z15 ? 1 : 0)) * 31;
        boolean z16 = this.appointmentRequired;
        if (z16) {
            z16 = true;
        }
        int i16 = (i15 + (z16 ? 1 : 0)) * 31;
        boolean z17 = this.documentsRequired;
        if (!z17) {
            z11 = z17;
        }
        int i17 = (i16 + (z11 ? 1 : 0)) * 31;
        String str4 = this.publicRemark;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return ((i17 + i10) * 31) + this.auth_mode.hashCode();
    }

    public String toString() {
        return "ApplStatusCurrentListModel(appl_no=" + this.appl_no + ", appl_dt=" + this.appl_dt + ", regno=" + this.regno + ", purCd=" + this.purCd + ", purCdDescr=" + this.purCdDescr + ", currentstatus=" + this.currentstatus + ", curr_off_cd=" + this.curr_off_cd + ", statusDesc=" + this.statusDesc + ", registeredAt=" + this.registeredAt + ", offName=" + this.offName + ", facelesstransaction=" + this.facelesstransaction + ", isdocuploadpending=" + this.isdocuploadpending + ", appointmentpending=" + this.appointmentpending + ", receiptNo=" + this.receiptNo + ", chassisNo=" + this.chassisNo + ", isrtorejection=" + this.isrtorejection + ", isdraftpending=" + this.isdraftpending + ", appointmentRequired=" + this.appointmentRequired + ", documentsRequired=" + this.documentsRequired + ", publicRemark=" + this.publicRemark + ", auth_mode=" + this.auth_mode + ')';
    }
}
