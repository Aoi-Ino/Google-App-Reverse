package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class OwnerIdentification {
    private final String aadhar_no;
    private final Object appl_no;
    private final boolean dlRequired;
    private final boolean dlValidationRequired;
    private final String dl_no;
    private final String email_id;
    private final boolean flag;
    private final boolean mobileNoEditable;
    private final long mobile_no;
    private final int ownerCatg;
    private final String pan_no;
    private final String passport_no;
    private final String ration_card_no;
    private final Object regn_no;
    private final Object state_cd;
    private final long verified_on;
    private final String voter_id;

    public OwnerIdentification(String str, Object obj, boolean z10, boolean z11, String str2, String str3, boolean z12, boolean z13, long j10, int i10, String str4, String str5, String str6, Object obj2, Object obj3, long j11, String str7) {
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        Object obj4 = obj2;
        Object obj5 = obj3;
        String str13 = str7;
        l.f(str, "aadhar_no");
        l.f(obj, "appl_no");
        l.f(str8, "dl_no");
        l.f(str9, "email_id");
        l.f(str10, "pan_no");
        l.f(str11, "passport_no");
        l.f(str12, "ration_card_no");
        l.f(obj4, "regn_no");
        l.f(obj5, "state_cd");
        l.f(str13, "voter_id");
        this.aadhar_no = str;
        this.appl_no = obj;
        this.dlRequired = z10;
        this.dlValidationRequired = z11;
        this.dl_no = str8;
        this.email_id = str9;
        this.flag = z12;
        this.mobileNoEditable = z13;
        this.mobile_no = j10;
        this.ownerCatg = i10;
        this.pan_no = str10;
        this.passport_no = str11;
        this.ration_card_no = str12;
        this.regn_no = obj4;
        this.state_cd = obj5;
        this.verified_on = j11;
        this.voter_id = str13;
    }

    public static /* synthetic */ OwnerIdentification copy$default(OwnerIdentification ownerIdentification, String str, Object obj, boolean z10, boolean z11, String str2, String str3, boolean z12, boolean z13, long j10, int i10, String str4, String str5, String str6, Object obj2, Object obj3, long j11, String str7, int i11, Object obj4) {
        OwnerIdentification ownerIdentification2 = ownerIdentification;
        int i12 = i11;
        return ownerIdentification.copy((i12 & 1) != 0 ? ownerIdentification2.aadhar_no : str, (i12 & 2) != 0 ? ownerIdentification2.appl_no : obj, (i12 & 4) != 0 ? ownerIdentification2.dlRequired : z10, (i12 & 8) != 0 ? ownerIdentification2.dlValidationRequired : z11, (i12 & 16) != 0 ? ownerIdentification2.dl_no : str2, (i12 & 32) != 0 ? ownerIdentification2.email_id : str3, (i12 & 64) != 0 ? ownerIdentification2.flag : z12, (i12 & 128) != 0 ? ownerIdentification2.mobileNoEditable : z13, (i12 & 256) != 0 ? ownerIdentification2.mobile_no : j10, (i12 & 512) != 0 ? ownerIdentification2.ownerCatg : i10, (i12 & 1024) != 0 ? ownerIdentification2.pan_no : str4, (i12 & 2048) != 0 ? ownerIdentification2.passport_no : str5, (i12 & 4096) != 0 ? ownerIdentification2.ration_card_no : str6, (i12 & 8192) != 0 ? ownerIdentification2.regn_no : obj2, (i12 & 16384) != 0 ? ownerIdentification2.state_cd : obj3, (i12 & 32768) != 0 ? ownerIdentification2.verified_on : j11, (i12 & 65536) != 0 ? ownerIdentification2.voter_id : str7);
    }

    public final String component1() {
        return this.aadhar_no;
    }

    public final int component10() {
        return this.ownerCatg;
    }

    public final String component11() {
        return this.pan_no;
    }

    public final String component12() {
        return this.passport_no;
    }

    public final String component13() {
        return this.ration_card_no;
    }

    public final Object component14() {
        return this.regn_no;
    }

    public final Object component15() {
        return this.state_cd;
    }

    public final long component16() {
        return this.verified_on;
    }

    public final String component17() {
        return this.voter_id;
    }

    public final Object component2() {
        return this.appl_no;
    }

    public final boolean component3() {
        return this.dlRequired;
    }

    public final boolean component4() {
        return this.dlValidationRequired;
    }

    public final String component5() {
        return this.dl_no;
    }

    public final String component6() {
        return this.email_id;
    }

    public final boolean component7() {
        return this.flag;
    }

    public final boolean component8() {
        return this.mobileNoEditable;
    }

    public final long component9() {
        return this.mobile_no;
    }

    public final OwnerIdentification copy(String str, Object obj, boolean z10, boolean z11, String str2, String str3, boolean z12, boolean z13, long j10, int i10, String str4, String str5, String str6, Object obj2, Object obj3, long j11, String str7) {
        String str8 = str;
        l.f(str8, "aadhar_no");
        l.f(obj, "appl_no");
        l.f(str2, "dl_no");
        l.f(str3, "email_id");
        l.f(str4, "pan_no");
        l.f(str5, "passport_no");
        l.f(str6, "ration_card_no");
        l.f(obj2, "regn_no");
        l.f(obj3, "state_cd");
        l.f(str7, "voter_id");
        return new OwnerIdentification(str8, obj, z10, z11, str2, str3, z12, z13, j10, i10, str4, str5, str6, obj2, obj3, j11, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerIdentification)) {
            return false;
        }
        OwnerIdentification ownerIdentification = (OwnerIdentification) obj;
        return l.a(this.aadhar_no, ownerIdentification.aadhar_no) && l.a(this.appl_no, ownerIdentification.appl_no) && this.dlRequired == ownerIdentification.dlRequired && this.dlValidationRequired == ownerIdentification.dlValidationRequired && l.a(this.dl_no, ownerIdentification.dl_no) && l.a(this.email_id, ownerIdentification.email_id) && this.flag == ownerIdentification.flag && this.mobileNoEditable == ownerIdentification.mobileNoEditable && this.mobile_no == ownerIdentification.mobile_no && this.ownerCatg == ownerIdentification.ownerCatg && l.a(this.pan_no, ownerIdentification.pan_no) && l.a(this.passport_no, ownerIdentification.passport_no) && l.a(this.ration_card_no, ownerIdentification.ration_card_no) && l.a(this.regn_no, ownerIdentification.regn_no) && l.a(this.state_cd, ownerIdentification.state_cd) && this.verified_on == ownerIdentification.verified_on && l.a(this.voter_id, ownerIdentification.voter_id);
    }

    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final boolean getDlRequired() {
        return this.dlRequired;
    }

    public final boolean getDlValidationRequired() {
        return this.dlValidationRequired;
    }

    public final String getDl_no() {
        return this.dl_no;
    }

    public final String getEmail_id() {
        return this.email_id;
    }

    public final boolean getFlag() {
        return this.flag;
    }

    public final boolean getMobileNoEditable() {
        return this.mobileNoEditable;
    }

    public final long getMobile_no() {
        return this.mobile_no;
    }

    public final int getOwnerCatg() {
        return this.ownerCatg;
    }

    public final String getPan_no() {
        return this.pan_no;
    }

    public final String getPassport_no() {
        return this.passport_no;
    }

    public final String getRation_card_no() {
        return this.ration_card_no;
    }

    public final Object getRegn_no() {
        return this.regn_no;
    }

    public final Object getState_cd() {
        return this.state_cd;
    }

    public final long getVerified_on() {
        return this.verified_on;
    }

    public final String getVoter_id() {
        return this.voter_id;
    }

    public int hashCode() {
        int hashCode = ((this.aadhar_no.hashCode() * 31) + this.appl_no.hashCode()) * 31;
        boolean z10 = this.dlRequired;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (hashCode + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.dlValidationRequired;
        if (z12) {
            z12 = true;
        }
        int hashCode2 = (((((i10 + (z12 ? 1 : 0)) * 31) + this.dl_no.hashCode()) * 31) + this.email_id.hashCode()) * 31;
        boolean z13 = this.flag;
        if (z13) {
            z13 = true;
        }
        int i11 = (hashCode2 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.mobileNoEditable;
        if (!z14) {
            z11 = z14;
        }
        return ((((((((((((((((((i11 + (z11 ? 1 : 0)) * 31) + Long.hashCode(this.mobile_no)) * 31) + Integer.hashCode(this.ownerCatg)) * 31) + this.pan_no.hashCode()) * 31) + this.passport_no.hashCode()) * 31) + this.ration_card_no.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + Long.hashCode(this.verified_on)) * 31) + this.voter_id.hashCode();
    }

    public String toString() {
        return "OwnerIdentification(aadhar_no=" + this.aadhar_no + ", appl_no=" + this.appl_no + ", dlRequired=" + this.dlRequired + ", dlValidationRequired=" + this.dlValidationRequired + ", dl_no=" + this.dl_no + ", email_id=" + this.email_id + ", flag=" + this.flag + ", mobileNoEditable=" + this.mobileNoEditable + ", mobile_no=" + this.mobile_no + ", ownerCatg=" + this.ownerCatg + ", pan_no=" + this.pan_no + ", passport_no=" + this.passport_no + ", ration_card_no=" + this.ration_card_no + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", verified_on=" + this.verified_on + ", voter_id=" + this.voter_id + ')';
    }
}
