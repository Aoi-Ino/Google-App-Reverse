package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VtOwnerIdentification {
    private final Object aadharno;
    private final Object dl_no;
    private final String emailid;
    private final long mobileno;
    private final int offcd;
    private final int ownerctg;
    private final String panno;
    private final Object passportno;
    private final String rationcardno;
    private final String regnno;
    private final String statecd;
    private final long verfiedon;
    private final Object voterid;

    public VtOwnerIdentification(Object obj, Object obj2, String str, long j10, int i10, int i11, String str2, Object obj3, String str3, String str4, String str5, long j11, Object obj4) {
        String str6 = str2;
        Object obj5 = obj3;
        String str7 = str3;
        String str8 = str4;
        String str9 = str5;
        Object obj6 = obj4;
        l.f(obj, "aadharno");
        l.f(obj2, "dl_no");
        l.f(str, "emailid");
        l.f(str6, "panno");
        l.f(obj5, "passportno");
        l.f(str7, "rationcardno");
        l.f(str8, "regnno");
        l.f(str9, "statecd");
        l.f(obj6, "voterid");
        this.aadharno = obj;
        this.dl_no = obj2;
        this.emailid = str;
        this.mobileno = j10;
        this.offcd = i10;
        this.ownerctg = i11;
        this.panno = str6;
        this.passportno = obj5;
        this.rationcardno = str7;
        this.regnno = str8;
        this.statecd = str9;
        this.verfiedon = j11;
        this.voterid = obj6;
    }

    public static /* synthetic */ VtOwnerIdentification copy$default(VtOwnerIdentification vtOwnerIdentification, Object obj, Object obj2, String str, long j10, int i10, int i11, String str2, Object obj3, String str3, String str4, String str5, long j11, Object obj4, int i12, Object obj5) {
        VtOwnerIdentification vtOwnerIdentification2 = vtOwnerIdentification;
        int i13 = i12;
        return vtOwnerIdentification.copy((i13 & 1) != 0 ? vtOwnerIdentification2.aadharno : obj, (i13 & 2) != 0 ? vtOwnerIdentification2.dl_no : obj2, (i13 & 4) != 0 ? vtOwnerIdentification2.emailid : str, (i13 & 8) != 0 ? vtOwnerIdentification2.mobileno : j10, (i13 & 16) != 0 ? vtOwnerIdentification2.offcd : i10, (i13 & 32) != 0 ? vtOwnerIdentification2.ownerctg : i11, (i13 & 64) != 0 ? vtOwnerIdentification2.panno : str2, (i13 & 128) != 0 ? vtOwnerIdentification2.passportno : obj3, (i13 & 256) != 0 ? vtOwnerIdentification2.rationcardno : str3, (i13 & 512) != 0 ? vtOwnerIdentification2.regnno : str4, (i13 & 1024) != 0 ? vtOwnerIdentification2.statecd : str5, (i13 & 2048) != 0 ? vtOwnerIdentification2.verfiedon : j11, (i13 & 4096) != 0 ? vtOwnerIdentification2.voterid : obj4);
    }

    public final Object component1() {
        return this.aadharno;
    }

    public final String component10() {
        return this.regnno;
    }

    public final String component11() {
        return this.statecd;
    }

    public final long component12() {
        return this.verfiedon;
    }

    public final Object component13() {
        return this.voterid;
    }

    public final Object component2() {
        return this.dl_no;
    }

    public final String component3() {
        return this.emailid;
    }

    public final long component4() {
        return this.mobileno;
    }

    public final int component5() {
        return this.offcd;
    }

    public final int component6() {
        return this.ownerctg;
    }

    public final String component7() {
        return this.panno;
    }

    public final Object component8() {
        return this.passportno;
    }

    public final String component9() {
        return this.rationcardno;
    }

    public final VtOwnerIdentification copy(Object obj, Object obj2, String str, long j10, int i10, int i11, String str2, Object obj3, String str3, String str4, String str5, long j11, Object obj4) {
        Object obj5 = obj;
        l.f(obj5, "aadharno");
        Object obj6 = obj2;
        l.f(obj6, "dl_no");
        String str6 = str;
        l.f(str6, "emailid");
        String str7 = str2;
        l.f(str7, "panno");
        Object obj7 = obj3;
        l.f(obj7, "passportno");
        String str8 = str3;
        l.f(str8, "rationcardno");
        String str9 = str4;
        l.f(str9, "regnno");
        String str10 = str5;
        l.f(str10, "statecd");
        l.f(obj4, "voterid");
        return new VtOwnerIdentification(obj5, obj6, str6, j10, i10, i11, str7, obj7, str8, str9, str10, j11, obj4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtOwnerIdentification)) {
            return false;
        }
        VtOwnerIdentification vtOwnerIdentification = (VtOwnerIdentification) obj;
        return l.a(this.aadharno, vtOwnerIdentification.aadharno) && l.a(this.dl_no, vtOwnerIdentification.dl_no) && l.a(this.emailid, vtOwnerIdentification.emailid) && this.mobileno == vtOwnerIdentification.mobileno && this.offcd == vtOwnerIdentification.offcd && this.ownerctg == vtOwnerIdentification.ownerctg && l.a(this.panno, vtOwnerIdentification.panno) && l.a(this.passportno, vtOwnerIdentification.passportno) && l.a(this.rationcardno, vtOwnerIdentification.rationcardno) && l.a(this.regnno, vtOwnerIdentification.regnno) && l.a(this.statecd, vtOwnerIdentification.statecd) && this.verfiedon == vtOwnerIdentification.verfiedon && l.a(this.voterid, vtOwnerIdentification.voterid);
    }

    public final Object getAadharno() {
        return this.aadharno;
    }

    public final Object getDl_no() {
        return this.dl_no;
    }

    public final String getEmailid() {
        return this.emailid;
    }

    public final long getMobileno() {
        return this.mobileno;
    }

    public final int getOffcd() {
        return this.offcd;
    }

    public final int getOwnerctg() {
        return this.ownerctg;
    }

    public final String getPanno() {
        return this.panno;
    }

    public final Object getPassportno() {
        return this.passportno;
    }

    public final String getRationcardno() {
        return this.rationcardno;
    }

    public final String getRegnno() {
        return this.regnno;
    }

    public final String getStatecd() {
        return this.statecd;
    }

    public final long getVerfiedon() {
        return this.verfiedon;
    }

    public final Object getVoterid() {
        return this.voterid;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.aadharno.hashCode() * 31) + this.dl_no.hashCode()) * 31) + this.emailid.hashCode()) * 31) + Long.hashCode(this.mobileno)) * 31) + Integer.hashCode(this.offcd)) * 31) + Integer.hashCode(this.ownerctg)) * 31) + this.panno.hashCode()) * 31) + this.passportno.hashCode()) * 31) + this.rationcardno.hashCode()) * 31) + this.regnno.hashCode()) * 31) + this.statecd.hashCode()) * 31) + Long.hashCode(this.verfiedon)) * 31) + this.voterid.hashCode();
    }

    public String toString() {
        return "VtOwnerIdentification(aadharno=" + this.aadharno + ", dl_no=" + this.dl_no + ", emailid=" + this.emailid + ", mobileno=" + this.mobileno + ", offcd=" + this.offcd + ", ownerctg=" + this.ownerctg + ", panno=" + this.panno + ", passportno=" + this.passportno + ", rationcardno=" + this.rationcardno + ", regnno=" + this.regnno + ", statecd=" + this.statecd + ", verfiedon=" + this.verfiedon + ", voterid=" + this.voterid + ')';
    }
}
