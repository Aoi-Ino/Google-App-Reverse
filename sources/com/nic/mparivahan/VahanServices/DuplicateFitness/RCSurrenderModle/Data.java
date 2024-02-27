package com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Data implements Serializable {
    private final String applNo;
    private final Object approvedBy;

    /* renamed from: fc  reason: collision with root package name */
    private final Object f20595fc;
    private final Object fcSno;
    private final Object fileRefNo;
    private final int offCd;
    private final String opDt;
    private final Object permit;
    private final Object permitSno;
    private final int purCd;

    /* renamed from: rc  reason: collision with root package name */
    private final Object f20596rc;
    private final Object rcSno;
    private final Object reason;
    private final String regnNo;
    private final String stateCd;
    private final String surrDt;
    private final Object taxexem;

    public Data(String str, Object obj, Object obj2, Object obj3, Object obj4, int i10, String str2, Object obj5, Object obj6, int i11, Object obj7, Object obj8, Object obj9, String str3, String str4, String str5, Object obj10) {
        String str6 = str;
        Object obj11 = obj;
        Object obj12 = obj2;
        Object obj13 = obj3;
        Object obj14 = obj4;
        String str7 = str2;
        Object obj15 = obj5;
        Object obj16 = obj6;
        Object obj17 = obj7;
        Object obj18 = obj8;
        Object obj19 = obj9;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        Object obj20 = obj10;
        l.f(str6, "applNo");
        l.f(obj11, "approvedBy");
        l.f(obj12, "fc");
        l.f(obj13, "fcSno");
        l.f(obj14, "fileRefNo");
        l.f(str7, "opDt");
        l.f(obj15, "permit");
        l.f(obj16, "permitSno");
        l.f(obj17, "rc");
        l.f(obj18, "rcSno");
        l.f(obj19, "reason");
        l.f(str8, "regnNo");
        l.f(str9, "stateCd");
        l.f(str10, "surrDt");
        l.f(obj20, "taxexem");
        this.applNo = str6;
        this.approvedBy = obj11;
        this.f20595fc = obj12;
        this.fcSno = obj13;
        this.fileRefNo = obj14;
        this.offCd = i10;
        this.opDt = str7;
        this.permit = obj15;
        this.permitSno = obj16;
        this.purCd = i11;
        this.f20596rc = obj17;
        this.rcSno = obj18;
        this.reason = obj19;
        this.regnNo = str8;
        this.stateCd = str9;
        this.surrDt = str10;
        this.taxexem = obj20;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, Object obj, Object obj2, Object obj3, Object obj4, int i10, String str2, Object obj5, Object obj6, int i11, Object obj7, Object obj8, Object obj9, String str3, String str4, String str5, Object obj10, int i12, Object obj11) {
        Data data2 = data;
        int i13 = i12;
        return data.copy((i13 & 1) != 0 ? data2.applNo : str, (i13 & 2) != 0 ? data2.approvedBy : obj, (i13 & 4) != 0 ? data2.f20595fc : obj2, (i13 & 8) != 0 ? data2.fcSno : obj3, (i13 & 16) != 0 ? data2.fileRefNo : obj4, (i13 & 32) != 0 ? data2.offCd : i10, (i13 & 64) != 0 ? data2.opDt : str2, (i13 & 128) != 0 ? data2.permit : obj5, (i13 & 256) != 0 ? data2.permitSno : obj6, (i13 & 512) != 0 ? data2.purCd : i11, (i13 & 1024) != 0 ? data2.f20596rc : obj7, (i13 & 2048) != 0 ? data2.rcSno : obj8, (i13 & 4096) != 0 ? data2.reason : obj9, (i13 & 8192) != 0 ? data2.regnNo : str3, (i13 & 16384) != 0 ? data2.stateCd : str4, (i13 & 32768) != 0 ? data2.surrDt : str5, (i13 & 65536) != 0 ? data2.taxexem : obj10);
    }

    public final String component1() {
        return this.applNo;
    }

    public final int component10() {
        return this.purCd;
    }

    public final Object component11() {
        return this.f20596rc;
    }

    public final Object component12() {
        return this.rcSno;
    }

    public final Object component13() {
        return this.reason;
    }

    public final String component14() {
        return this.regnNo;
    }

    public final String component15() {
        return this.stateCd;
    }

    public final String component16() {
        return this.surrDt;
    }

    public final Object component17() {
        return this.taxexem;
    }

    public final Object component2() {
        return this.approvedBy;
    }

    public final Object component3() {
        return this.f20595fc;
    }

    public final Object component4() {
        return this.fcSno;
    }

    public final Object component5() {
        return this.fileRefNo;
    }

    public final int component6() {
        return this.offCd;
    }

    public final String component7() {
        return this.opDt;
    }

    public final Object component8() {
        return this.permit;
    }

    public final Object component9() {
        return this.permitSno;
    }

    public final Data copy(String str, Object obj, Object obj2, Object obj3, Object obj4, int i10, String str2, Object obj5, Object obj6, int i11, Object obj7, Object obj8, Object obj9, String str3, String str4, String str5, Object obj10) {
        String str6 = str;
        l.f(str6, "applNo");
        l.f(obj, "approvedBy");
        l.f(obj2, "fc");
        l.f(obj3, "fcSno");
        l.f(obj4, "fileRefNo");
        l.f(str2, "opDt");
        l.f(obj5, "permit");
        l.f(obj6, "permitSno");
        l.f(obj7, "rc");
        l.f(obj8, "rcSno");
        l.f(obj9, "reason");
        l.f(str3, "regnNo");
        l.f(str4, "stateCd");
        l.f(str5, "surrDt");
        l.f(obj10, "taxexem");
        return new Data(str6, obj, obj2, obj3, obj4, i10, str2, obj5, obj6, i11, obj7, obj8, obj9, str3, str4, str5, obj10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.applNo, data.applNo) && l.a(this.approvedBy, data.approvedBy) && l.a(this.f20595fc, data.f20595fc) && l.a(this.fcSno, data.fcSno) && l.a(this.fileRefNo, data.fileRefNo) && this.offCd == data.offCd && l.a(this.opDt, data.opDt) && l.a(this.permit, data.permit) && l.a(this.permitSno, data.permitSno) && this.purCd == data.purCd && l.a(this.f20596rc, data.f20596rc) && l.a(this.rcSno, data.rcSno) && l.a(this.reason, data.reason) && l.a(this.regnNo, data.regnNo) && l.a(this.stateCd, data.stateCd) && l.a(this.surrDt, data.surrDt) && l.a(this.taxexem, data.taxexem);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final Object getApprovedBy() {
        return this.approvedBy;
    }

    public final Object getFc() {
        return this.f20595fc;
    }

    public final Object getFcSno() {
        return this.fcSno;
    }

    public final Object getFileRefNo() {
        return this.fileRefNo;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getOpDt() {
        return this.opDt;
    }

    public final Object getPermit() {
        return this.permit;
    }

    public final Object getPermitSno() {
        return this.permitSno;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final Object getRc() {
        return this.f20596rc;
    }

    public final Object getRcSno() {
        return this.rcSno;
    }

    public final Object getReason() {
        return this.reason;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getSurrDt() {
        return this.surrDt;
    }

    public final Object getTaxexem() {
        return this.taxexem;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.applNo.hashCode() * 31) + this.approvedBy.hashCode()) * 31) + this.f20595fc.hashCode()) * 31) + this.fcSno.hashCode()) * 31) + this.fileRefNo.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.opDt.hashCode()) * 31) + this.permit.hashCode()) * 31) + this.permitSno.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.f20596rc.hashCode()) * 31) + this.rcSno.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.surrDt.hashCode()) * 31) + this.taxexem.hashCode();
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", approvedBy=" + this.approvedBy + ", fc=" + this.f20595fc + ", fcSno=" + this.fcSno + ", fileRefNo=" + this.fileRefNo + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", permit=" + this.permit + ", permitSno=" + this.permitSno + ", purCd=" + this.purCd + ", rc=" + this.f20596rc + ", rcSno=" + this.rcSno + ", reason=" + this.reason + ", regnNo=" + this.regnNo + ", stateCd=" + this.stateCd + ", surrDt=" + this.surrDt + ", taxexem=" + this.taxexem + ')';
    }
}
