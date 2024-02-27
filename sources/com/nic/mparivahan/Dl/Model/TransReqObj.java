package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class TransReqObj implements Serializable {
    private final String olaCode;
    private final String olaOffName;
    private final String trAbbr;
    private final int trApplno;
    private final int trCovcd;
    private final String trEntrydt;
    private final String trName;
    private final int trSlNo;
    private final int trTrCd;
    private final int trVisitNo;

    public TransReqObj(String str, String str2, String str3, int i10, int i11, String str4, String str5, int i12, int i13, int i14) {
        l.f(str, "olaCode");
        l.f(str2, "olaOffName");
        l.f(str3, "trAbbr");
        l.f(str4, "trEntrydt");
        l.f(str5, "trName");
        this.olaCode = str;
        this.olaOffName = str2;
        this.trAbbr = str3;
        this.trApplno = i10;
        this.trCovcd = i11;
        this.trEntrydt = str4;
        this.trName = str5;
        this.trSlNo = i12;
        this.trTrCd = i13;
        this.trVisitNo = i14;
    }

    public static /* synthetic */ TransReqObj copy$default(TransReqObj transReqObj, String str, String str2, String str3, int i10, int i11, String str4, String str5, int i12, int i13, int i14, int i15, Object obj) {
        TransReqObj transReqObj2 = transReqObj;
        int i16 = i15;
        return transReqObj.copy((i16 & 1) != 0 ? transReqObj2.olaCode : str, (i16 & 2) != 0 ? transReqObj2.olaOffName : str2, (i16 & 4) != 0 ? transReqObj2.trAbbr : str3, (i16 & 8) != 0 ? transReqObj2.trApplno : i10, (i16 & 16) != 0 ? transReqObj2.trCovcd : i11, (i16 & 32) != 0 ? transReqObj2.trEntrydt : str4, (i16 & 64) != 0 ? transReqObj2.trName : str5, (i16 & 128) != 0 ? transReqObj2.trSlNo : i12, (i16 & 256) != 0 ? transReqObj2.trTrCd : i13, (i16 & 512) != 0 ? transReqObj2.trVisitNo : i14);
    }

    public final String component1() {
        return this.olaCode;
    }

    public final int component10() {
        return this.trVisitNo;
    }

    public final String component2() {
        return this.olaOffName;
    }

    public final String component3() {
        return this.trAbbr;
    }

    public final int component4() {
        return this.trApplno;
    }

    public final int component5() {
        return this.trCovcd;
    }

    public final String component6() {
        return this.trEntrydt;
    }

    public final String component7() {
        return this.trName;
    }

    public final int component8() {
        return this.trSlNo;
    }

    public final int component9() {
        return this.trTrCd;
    }

    public final TransReqObj copy(String str, String str2, String str3, int i10, int i11, String str4, String str5, int i12, int i13, int i14) {
        l.f(str, "olaCode");
        l.f(str2, "olaOffName");
        l.f(str3, "trAbbr");
        String str6 = str4;
        l.f(str6, "trEntrydt");
        String str7 = str5;
        l.f(str7, "trName");
        return new TransReqObj(str, str2, str3, i10, i11, str6, str7, i12, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransReqObj)) {
            return false;
        }
        TransReqObj transReqObj = (TransReqObj) obj;
        return l.a(this.olaCode, transReqObj.olaCode) && l.a(this.olaOffName, transReqObj.olaOffName) && l.a(this.trAbbr, transReqObj.trAbbr) && this.trApplno == transReqObj.trApplno && this.trCovcd == transReqObj.trCovcd && l.a(this.trEntrydt, transReqObj.trEntrydt) && l.a(this.trName, transReqObj.trName) && this.trSlNo == transReqObj.trSlNo && this.trTrCd == transReqObj.trTrCd && this.trVisitNo == transReqObj.trVisitNo;
    }

    public final String getOlaCode() {
        return this.olaCode;
    }

    public final String getOlaOffName() {
        return this.olaOffName;
    }

    public final String getTrAbbr() {
        return this.trAbbr;
    }

    public final int getTrApplno() {
        return this.trApplno;
    }

    public final int getTrCovcd() {
        return this.trCovcd;
    }

    public final String getTrEntrydt() {
        return this.trEntrydt;
    }

    public final String getTrName() {
        return this.trName;
    }

    public final int getTrSlNo() {
        return this.trSlNo;
    }

    public final int getTrTrCd() {
        return this.trTrCd;
    }

    public final int getTrVisitNo() {
        return this.trVisitNo;
    }

    public int hashCode() {
        return (((((((((((((((((this.olaCode.hashCode() * 31) + this.olaOffName.hashCode()) * 31) + this.trAbbr.hashCode()) * 31) + Integer.hashCode(this.trApplno)) * 31) + Integer.hashCode(this.trCovcd)) * 31) + this.trEntrydt.hashCode()) * 31) + this.trName.hashCode()) * 31) + Integer.hashCode(this.trSlNo)) * 31) + Integer.hashCode(this.trTrCd)) * 31) + Integer.hashCode(this.trVisitNo);
    }

    public String toString() {
        return "TransReqObj(olaCode=" + this.olaCode + ", olaOffName=" + this.olaOffName + ", trAbbr=" + this.trAbbr + ", trApplno=" + this.trApplno + ", trCovcd=" + this.trCovcd + ", trEntrydt=" + this.trEntrydt + ", trName=" + this.trName + ", trSlNo=" + this.trSlNo + ", trTrCd=" + this.trTrCd + ", trVisitNo=" + this.trVisitNo + ')';
    }
}
