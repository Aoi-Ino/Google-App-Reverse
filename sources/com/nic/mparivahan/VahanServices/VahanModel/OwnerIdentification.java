package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class OwnerIdentification {
    private final String aadhar_no;
    private final Object appl_no;
    private final Boolean dlRequired;
    private final Boolean dlValidationRequired;
    private final String dl_no;
    private final String email_id;
    private final Boolean flag;
    private final Boolean mobileNoEditable;
    private final Long mobile_no;
    private final Integer ownerCatg;
    private final String pan_no;
    private final String passport_no;
    private final String ration_card_no;
    private final Object regn_no;
    private final Object state_cd;
    private final String voter_id;

    public OwnerIdentification(String str, Object obj, Boolean bool, Boolean bool2, String str2, String str3, Boolean bool3, Boolean bool4, Long l10, Integer num, String str4, String str5, String str6, Object obj2, Object obj3, String str7) {
        this.aadhar_no = str;
        this.appl_no = obj;
        this.dlRequired = bool;
        this.dlValidationRequired = bool2;
        this.dl_no = str2;
        this.email_id = str3;
        this.flag = bool3;
        this.mobileNoEditable = bool4;
        this.mobile_no = l10;
        this.ownerCatg = num;
        this.pan_no = str4;
        this.passport_no = str5;
        this.ration_card_no = str6;
        this.regn_no = obj2;
        this.state_cd = obj3;
        this.voter_id = str7;
    }

    public static /* synthetic */ OwnerIdentification copy$default(OwnerIdentification ownerIdentification, String str, Object obj, Boolean bool, Boolean bool2, String str2, String str3, Boolean bool3, Boolean bool4, Long l10, Integer num, String str4, String str5, String str6, Object obj2, Object obj3, String str7, int i10, Object obj4) {
        OwnerIdentification ownerIdentification2 = ownerIdentification;
        int i11 = i10;
        return ownerIdentification.copy((i11 & 1) != 0 ? ownerIdentification2.aadhar_no : str, (i11 & 2) != 0 ? ownerIdentification2.appl_no : obj, (i11 & 4) != 0 ? ownerIdentification2.dlRequired : bool, (i11 & 8) != 0 ? ownerIdentification2.dlValidationRequired : bool2, (i11 & 16) != 0 ? ownerIdentification2.dl_no : str2, (i11 & 32) != 0 ? ownerIdentification2.email_id : str3, (i11 & 64) != 0 ? ownerIdentification2.flag : bool3, (i11 & 128) != 0 ? ownerIdentification2.mobileNoEditable : bool4, (i11 & 256) != 0 ? ownerIdentification2.mobile_no : l10, (i11 & 512) != 0 ? ownerIdentification2.ownerCatg : num, (i11 & 1024) != 0 ? ownerIdentification2.pan_no : str4, (i11 & 2048) != 0 ? ownerIdentification2.passport_no : str5, (i11 & 4096) != 0 ? ownerIdentification2.ration_card_no : str6, (i11 & 8192) != 0 ? ownerIdentification2.regn_no : obj2, (i11 & 16384) != 0 ? ownerIdentification2.state_cd : obj3, (i11 & 32768) != 0 ? ownerIdentification2.voter_id : str7);
    }

    public final String component1() {
        return this.aadhar_no;
    }

    public final Integer component10() {
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

    public final String component16() {
        return this.voter_id;
    }

    public final Object component2() {
        return this.appl_no;
    }

    public final Boolean component3() {
        return this.dlRequired;
    }

    public final Boolean component4() {
        return this.dlValidationRequired;
    }

    public final String component5() {
        return this.dl_no;
    }

    public final String component6() {
        return this.email_id;
    }

    public final Boolean component7() {
        return this.flag;
    }

    public final Boolean component8() {
        return this.mobileNoEditable;
    }

    public final Long component9() {
        return this.mobile_no;
    }

    public final OwnerIdentification copy(String str, Object obj, Boolean bool, Boolean bool2, String str2, String str3, Boolean bool3, Boolean bool4, Long l10, Integer num, String str4, String str5, String str6, Object obj2, Object obj3, String str7) {
        return new OwnerIdentification(str, obj, bool, bool2, str2, str3, bool3, bool4, l10, num, str4, str5, str6, obj2, obj3, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerIdentification)) {
            return false;
        }
        OwnerIdentification ownerIdentification = (OwnerIdentification) obj;
        return l.a(this.aadhar_no, ownerIdentification.aadhar_no) && l.a(this.appl_no, ownerIdentification.appl_no) && l.a(this.dlRequired, ownerIdentification.dlRequired) && l.a(this.dlValidationRequired, ownerIdentification.dlValidationRequired) && l.a(this.dl_no, ownerIdentification.dl_no) && l.a(this.email_id, ownerIdentification.email_id) && l.a(this.flag, ownerIdentification.flag) && l.a(this.mobileNoEditable, ownerIdentification.mobileNoEditable) && l.a(this.mobile_no, ownerIdentification.mobile_no) && l.a(this.ownerCatg, ownerIdentification.ownerCatg) && l.a(this.pan_no, ownerIdentification.pan_no) && l.a(this.passport_no, ownerIdentification.passport_no) && l.a(this.ration_card_no, ownerIdentification.ration_card_no) && l.a(this.regn_no, ownerIdentification.regn_no) && l.a(this.state_cd, ownerIdentification.state_cd) && l.a(this.voter_id, ownerIdentification.voter_id);
    }

    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final Boolean getDlRequired() {
        return this.dlRequired;
    }

    public final Boolean getDlValidationRequired() {
        return this.dlValidationRequired;
    }

    public final String getDl_no() {
        return this.dl_no;
    }

    public final String getEmail_id() {
        return this.email_id;
    }

    public final Boolean getFlag() {
        return this.flag;
    }

    public final Boolean getMobileNoEditable() {
        return this.mobileNoEditable;
    }

    public final Long getMobile_no() {
        return this.mobile_no;
    }

    public final Integer getOwnerCatg() {
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

    public final String getVoter_id() {
        return this.voter_id;
    }

    public int hashCode() {
        String str = this.aadhar_no;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.appl_no;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Boolean bool = this.dlRequired;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.dlValidationRequired;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.dl_no;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email_id;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.flag;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.mobileNoEditable;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l10 = this.mobile_no;
        int hashCode9 = (hashCode8 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num = this.ownerCatg;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.pan_no;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.passport_no;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ration_card_no;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj2 = this.regn_no;
        int hashCode14 = (hashCode13 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.state_cd;
        int hashCode15 = (hashCode14 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str7 = this.voter_id;
        if (str7 != null) {
            i10 = str7.hashCode();
        }
        return hashCode15 + i10;
    }

    public String toString() {
        return "OwnerIdentification(aadhar_no=" + this.aadhar_no + ", appl_no=" + this.appl_no + ", dlRequired=" + this.dlRequired + ", dlValidationRequired=" + this.dlValidationRequired + ", dl_no=" + this.dl_no + ", email_id=" + this.email_id + ", flag=" + this.flag + ", mobileNoEditable=" + this.mobileNoEditable + ", mobile_no=" + this.mobile_no + ", ownerCatg=" + this.ownerCatg + ", pan_no=" + this.pan_no + ", passport_no=" + this.passport_no + ", ration_card_no=" + this.ration_card_no + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", voter_id=" + this.voter_id + ')';
    }
}
