package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class vahanOnlineCheck {
    private final String allowservice_fitnessinvalid;
    private final String allowservice_insuranceinvalid;
    private final String allowservice_rcvalidinvalid;
    private final String allowservice_taxinvalid;
    private final String allowservice_whenblacklist;
    private final Object any_where_rto_district_mapping;
    private final String challanpndingrestrictpur_cd;
    private final String fee_exempt_owner_cd;
    private final String fitnessskipcheck;
    private final String govvehiclecheck;
    private final Object hptcheck_skip_pur_cd;
    private final boolean hsrp_mandatory;
    private final String isncrbblacklist;
    private final int mobile_no_checkduration;
    private final int mobile_no_checklimit;
    private final String mvtax_notpermittedpurcd;
    private final String ownercdinsuranceexempt;
    private final String permitpurcondtion;
    private final boolean rrWithTax;
    private final Object service_alert_message;
    private final Object service_allowed_with_pending_appl;
    private final String service_auth_mode;
    private final String service_resume;
    private final Object service_stop;
    private final Object servicecombination;
    private final String state_cd;
    private final int tax_nid_days;
    private final boolean taxrestrictedsaleamt;
    private final String taxskipcondition;
    private final Object zero_vtfee_pur_cd;

    public vahanOnlineCheck(String str, String str2, String str3, String str4, String str5, Object obj, String str6, String str7, String str8, String str9, Object obj2, boolean z10, String str10, int i10, int i11, String str11, String str12, String str13, boolean z11, Object obj3, Object obj4, String str14, String str15, Object obj5, Object obj6, String str16, int i12, boolean z12, String str17, Object obj7) {
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        Object obj8 = obj;
        String str23 = str6;
        String str24 = str7;
        String str25 = str8;
        String str26 = str9;
        Object obj9 = obj2;
        String str27 = str10;
        String str28 = str11;
        String str29 = str12;
        Object obj10 = obj3;
        l.f(str18, "allowservice_fitnessinvalid");
        l.f(str19, "allowservice_insuranceinvalid");
        l.f(str20, "allowservice_rcvalidinvalid");
        l.f(str21, "allowservice_taxinvalid");
        l.f(str22, "allowservice_whenblacklist");
        l.f(obj8, "any_where_rto_district_mapping");
        l.f(str23, "challanpndingrestrictpur_cd");
        l.f(str24, "fee_exempt_owner_cd");
        l.f(str25, "fitnessskipcheck");
        l.f(str26, "govvehiclecheck");
        l.f(obj9, "hptcheck_skip_pur_cd");
        l.f(str27, "isncrbblacklist");
        l.f(str28, "mvtax_notpermittedpurcd");
        l.f(str29, "ownercdinsuranceexempt");
        l.f(str13, "permitpurcondtion");
        l.f(obj3, "service_alert_message");
        l.f(obj4, "service_allowed_with_pending_appl");
        l.f(str14, "service_auth_mode");
        l.f(str15, "service_resume");
        l.f(obj5, "service_stop");
        l.f(obj6, "servicecombination");
        l.f(str16, "state_cd");
        l.f(str17, "taxskipcondition");
        l.f(obj7, "zero_vtfee_pur_cd");
        this.allowservice_fitnessinvalid = str18;
        this.allowservice_insuranceinvalid = str19;
        this.allowservice_rcvalidinvalid = str20;
        this.allowservice_taxinvalid = str21;
        this.allowservice_whenblacklist = str22;
        this.any_where_rto_district_mapping = obj8;
        this.challanpndingrestrictpur_cd = str23;
        this.fee_exempt_owner_cd = str24;
        this.fitnessskipcheck = str25;
        this.govvehiclecheck = str26;
        this.hptcheck_skip_pur_cd = obj9;
        this.hsrp_mandatory = z10;
        this.isncrbblacklist = str27;
        this.mobile_no_checkduration = i10;
        this.mobile_no_checklimit = i11;
        this.mvtax_notpermittedpurcd = str28;
        this.ownercdinsuranceexempt = str29;
        this.permitpurcondtion = str13;
        this.rrWithTax = z11;
        this.service_alert_message = obj3;
        this.service_allowed_with_pending_appl = obj4;
        this.service_auth_mode = str14;
        this.service_resume = str15;
        this.service_stop = obj5;
        this.servicecombination = obj6;
        this.state_cd = str16;
        this.tax_nid_days = i12;
        this.taxrestrictedsaleamt = z12;
        this.taxskipcondition = str17;
        this.zero_vtfee_pur_cd = obj7;
    }

    public static /* synthetic */ vahanOnlineCheck copy$default(vahanOnlineCheck vahanonlinecheck, String str, String str2, String str3, String str4, String str5, Object obj, String str6, String str7, String str8, String str9, Object obj2, boolean z10, String str10, int i10, int i11, String str11, String str12, String str13, boolean z11, Object obj3, Object obj4, String str14, String str15, Object obj5, Object obj6, String str16, int i12, boolean z12, String str17, Object obj7, int i13, Object obj8) {
        vahanOnlineCheck vahanonlinecheck2 = vahanonlinecheck;
        int i14 = i13;
        return vahanonlinecheck.copy((i14 & 1) != 0 ? vahanonlinecheck2.allowservice_fitnessinvalid : str, (i14 & 2) != 0 ? vahanonlinecheck2.allowservice_insuranceinvalid : str2, (i14 & 4) != 0 ? vahanonlinecheck2.allowservice_rcvalidinvalid : str3, (i14 & 8) != 0 ? vahanonlinecheck2.allowservice_taxinvalid : str4, (i14 & 16) != 0 ? vahanonlinecheck2.allowservice_whenblacklist : str5, (i14 & 32) != 0 ? vahanonlinecheck2.any_where_rto_district_mapping : obj, (i14 & 64) != 0 ? vahanonlinecheck2.challanpndingrestrictpur_cd : str6, (i14 & 128) != 0 ? vahanonlinecheck2.fee_exempt_owner_cd : str7, (i14 & 256) != 0 ? vahanonlinecheck2.fitnessskipcheck : str8, (i14 & 512) != 0 ? vahanonlinecheck2.govvehiclecheck : str9, (i14 & 1024) != 0 ? vahanonlinecheck2.hptcheck_skip_pur_cd : obj2, (i14 & 2048) != 0 ? vahanonlinecheck2.hsrp_mandatory : z10, (i14 & 4096) != 0 ? vahanonlinecheck2.isncrbblacklist : str10, (i14 & 8192) != 0 ? vahanonlinecheck2.mobile_no_checkduration : i10, (i14 & 16384) != 0 ? vahanonlinecheck2.mobile_no_checklimit : i11, (i14 & 32768) != 0 ? vahanonlinecheck2.mvtax_notpermittedpurcd : str11, (i14 & 65536) != 0 ? vahanonlinecheck2.ownercdinsuranceexempt : str12, (i14 & 131072) != 0 ? vahanonlinecheck2.permitpurcondtion : str13, (i14 & 262144) != 0 ? vahanonlinecheck2.rrWithTax : z11, (i14 & 524288) != 0 ? vahanonlinecheck2.service_alert_message : obj3, (i14 & 1048576) != 0 ? vahanonlinecheck2.service_allowed_with_pending_appl : obj4, (i14 & 2097152) != 0 ? vahanonlinecheck2.service_auth_mode : str14, (i14 & 4194304) != 0 ? vahanonlinecheck2.service_resume : str15, (i14 & 8388608) != 0 ? vahanonlinecheck2.service_stop : obj5, (i14 & 16777216) != 0 ? vahanonlinecheck2.servicecombination : obj6, (i14 & 33554432) != 0 ? vahanonlinecheck2.state_cd : str16, (i14 & 67108864) != 0 ? vahanonlinecheck2.tax_nid_days : i12, (i14 & 134217728) != 0 ? vahanonlinecheck2.taxrestrictedsaleamt : z12, (i14 & 268435456) != 0 ? vahanonlinecheck2.taxskipcondition : str17, (i14 & 536870912) != 0 ? vahanonlinecheck2.zero_vtfee_pur_cd : obj7);
    }

    public final String component1() {
        return this.allowservice_fitnessinvalid;
    }

    public final String component10() {
        return this.govvehiclecheck;
    }

    public final Object component11() {
        return this.hptcheck_skip_pur_cd;
    }

    public final boolean component12() {
        return this.hsrp_mandatory;
    }

    public final String component13() {
        return this.isncrbblacklist;
    }

    public final int component14() {
        return this.mobile_no_checkduration;
    }

    public final int component15() {
        return this.mobile_no_checklimit;
    }

    public final String component16() {
        return this.mvtax_notpermittedpurcd;
    }

    public final String component17() {
        return this.ownercdinsuranceexempt;
    }

    public final String component18() {
        return this.permitpurcondtion;
    }

    public final boolean component19() {
        return this.rrWithTax;
    }

    public final String component2() {
        return this.allowservice_insuranceinvalid;
    }

    public final Object component20() {
        return this.service_alert_message;
    }

    public final Object component21() {
        return this.service_allowed_with_pending_appl;
    }

    public final String component22() {
        return this.service_auth_mode;
    }

    public final String component23() {
        return this.service_resume;
    }

    public final Object component24() {
        return this.service_stop;
    }

    public final Object component25() {
        return this.servicecombination;
    }

    public final String component26() {
        return this.state_cd;
    }

    public final int component27() {
        return this.tax_nid_days;
    }

    public final boolean component28() {
        return this.taxrestrictedsaleamt;
    }

    public final String component29() {
        return this.taxskipcondition;
    }

    public final String component3() {
        return this.allowservice_rcvalidinvalid;
    }

    public final Object component30() {
        return this.zero_vtfee_pur_cd;
    }

    public final String component4() {
        return this.allowservice_taxinvalid;
    }

    public final String component5() {
        return this.allowservice_whenblacklist;
    }

    public final Object component6() {
        return this.any_where_rto_district_mapping;
    }

    public final String component7() {
        return this.challanpndingrestrictpur_cd;
    }

    public final String component8() {
        return this.fee_exempt_owner_cd;
    }

    public final String component9() {
        return this.fitnessskipcheck;
    }

    public final vahanOnlineCheck copy(String str, String str2, String str3, String str4, String str5, Object obj, String str6, String str7, String str8, String str9, Object obj2, boolean z10, String str10, int i10, int i11, String str11, String str12, String str13, boolean z11, Object obj3, Object obj4, String str14, String str15, Object obj5, Object obj6, String str16, int i12, boolean z12, String str17, Object obj7) {
        String str18 = str;
        l.f(str18, "allowservice_fitnessinvalid");
        l.f(str2, "allowservice_insuranceinvalid");
        l.f(str3, "allowservice_rcvalidinvalid");
        l.f(str4, "allowservice_taxinvalid");
        l.f(str5, "allowservice_whenblacklist");
        l.f(obj, "any_where_rto_district_mapping");
        l.f(str6, "challanpndingrestrictpur_cd");
        l.f(str7, "fee_exempt_owner_cd");
        l.f(str8, "fitnessskipcheck");
        l.f(str9, "govvehiclecheck");
        l.f(obj2, "hptcheck_skip_pur_cd");
        l.f(str10, "isncrbblacklist");
        l.f(str11, "mvtax_notpermittedpurcd");
        l.f(str12, "ownercdinsuranceexempt");
        l.f(str13, "permitpurcondtion");
        l.f(obj3, "service_alert_message");
        l.f(obj4, "service_allowed_with_pending_appl");
        l.f(str14, "service_auth_mode");
        l.f(str15, "service_resume");
        l.f(obj5, "service_stop");
        l.f(obj6, "servicecombination");
        l.f(str16, "state_cd");
        l.f(str17, "taxskipcondition");
        l.f(obj7, "zero_vtfee_pur_cd");
        return new vahanOnlineCheck(str18, str2, str3, str4, str5, obj, str6, str7, str8, str9, obj2, z10, str10, i10, i11, str11, str12, str13, z11, obj3, obj4, str14, str15, obj5, obj6, str16, i12, z12, str17, obj7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vahanOnlineCheck)) {
            return false;
        }
        vahanOnlineCheck vahanonlinecheck = (vahanOnlineCheck) obj;
        return l.a(this.allowservice_fitnessinvalid, vahanonlinecheck.allowservice_fitnessinvalid) && l.a(this.allowservice_insuranceinvalid, vahanonlinecheck.allowservice_insuranceinvalid) && l.a(this.allowservice_rcvalidinvalid, vahanonlinecheck.allowservice_rcvalidinvalid) && l.a(this.allowservice_taxinvalid, vahanonlinecheck.allowservice_taxinvalid) && l.a(this.allowservice_whenblacklist, vahanonlinecheck.allowservice_whenblacklist) && l.a(this.any_where_rto_district_mapping, vahanonlinecheck.any_where_rto_district_mapping) && l.a(this.challanpndingrestrictpur_cd, vahanonlinecheck.challanpndingrestrictpur_cd) && l.a(this.fee_exempt_owner_cd, vahanonlinecheck.fee_exempt_owner_cd) && l.a(this.fitnessskipcheck, vahanonlinecheck.fitnessskipcheck) && l.a(this.govvehiclecheck, vahanonlinecheck.govvehiclecheck) && l.a(this.hptcheck_skip_pur_cd, vahanonlinecheck.hptcheck_skip_pur_cd) && this.hsrp_mandatory == vahanonlinecheck.hsrp_mandatory && l.a(this.isncrbblacklist, vahanonlinecheck.isncrbblacklist) && this.mobile_no_checkduration == vahanonlinecheck.mobile_no_checkduration && this.mobile_no_checklimit == vahanonlinecheck.mobile_no_checklimit && l.a(this.mvtax_notpermittedpurcd, vahanonlinecheck.mvtax_notpermittedpurcd) && l.a(this.ownercdinsuranceexempt, vahanonlinecheck.ownercdinsuranceexempt) && l.a(this.permitpurcondtion, vahanonlinecheck.permitpurcondtion) && this.rrWithTax == vahanonlinecheck.rrWithTax && l.a(this.service_alert_message, vahanonlinecheck.service_alert_message) && l.a(this.service_allowed_with_pending_appl, vahanonlinecheck.service_allowed_with_pending_appl) && l.a(this.service_auth_mode, vahanonlinecheck.service_auth_mode) && l.a(this.service_resume, vahanonlinecheck.service_resume) && l.a(this.service_stop, vahanonlinecheck.service_stop) && l.a(this.servicecombination, vahanonlinecheck.servicecombination) && l.a(this.state_cd, vahanonlinecheck.state_cd) && this.tax_nid_days == vahanonlinecheck.tax_nid_days && this.taxrestrictedsaleamt == vahanonlinecheck.taxrestrictedsaleamt && l.a(this.taxskipcondition, vahanonlinecheck.taxskipcondition) && l.a(this.zero_vtfee_pur_cd, vahanonlinecheck.zero_vtfee_pur_cd);
    }

    public final String getAllowservice_fitnessinvalid() {
        return this.allowservice_fitnessinvalid;
    }

    public final String getAllowservice_insuranceinvalid() {
        return this.allowservice_insuranceinvalid;
    }

    public final String getAllowservice_rcvalidinvalid() {
        return this.allowservice_rcvalidinvalid;
    }

    public final String getAllowservice_taxinvalid() {
        return this.allowservice_taxinvalid;
    }

    public final String getAllowservice_whenblacklist() {
        return this.allowservice_whenblacklist;
    }

    public final Object getAny_where_rto_district_mapping() {
        return this.any_where_rto_district_mapping;
    }

    public final String getChallanpndingrestrictpur_cd() {
        return this.challanpndingrestrictpur_cd;
    }

    public final String getFee_exempt_owner_cd() {
        return this.fee_exempt_owner_cd;
    }

    public final String getFitnessskipcheck() {
        return this.fitnessskipcheck;
    }

    public final String getGovvehiclecheck() {
        return this.govvehiclecheck;
    }

    public final Object getHptcheck_skip_pur_cd() {
        return this.hptcheck_skip_pur_cd;
    }

    public final boolean getHsrp_mandatory() {
        return this.hsrp_mandatory;
    }

    public final String getIsncrbblacklist() {
        return this.isncrbblacklist;
    }

    public final int getMobile_no_checkduration() {
        return this.mobile_no_checkduration;
    }

    public final int getMobile_no_checklimit() {
        return this.mobile_no_checklimit;
    }

    public final String getMvtax_notpermittedpurcd() {
        return this.mvtax_notpermittedpurcd;
    }

    public final String getOwnercdinsuranceexempt() {
        return this.ownercdinsuranceexempt;
    }

    public final String getPermitpurcondtion() {
        return this.permitpurcondtion;
    }

    public final boolean getRrWithTax() {
        return this.rrWithTax;
    }

    public final Object getService_alert_message() {
        return this.service_alert_message;
    }

    public final Object getService_allowed_with_pending_appl() {
        return this.service_allowed_with_pending_appl;
    }

    public final String getService_auth_mode() {
        return this.service_auth_mode;
    }

    public final String getService_resume() {
        return this.service_resume;
    }

    public final Object getService_stop() {
        return this.service_stop;
    }

    public final Object getServicecombination() {
        return this.servicecombination;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final int getTax_nid_days() {
        return this.tax_nid_days;
    }

    public final boolean getTaxrestrictedsaleamt() {
        return this.taxrestrictedsaleamt;
    }

    public final String getTaxskipcondition() {
        return this.taxskipcondition;
    }

    public final Object getZero_vtfee_pur_cd() {
        return this.zero_vtfee_pur_cd;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((this.allowservice_fitnessinvalid.hashCode() * 31) + this.allowservice_insuranceinvalid.hashCode()) * 31) + this.allowservice_rcvalidinvalid.hashCode()) * 31) + this.allowservice_taxinvalid.hashCode()) * 31) + this.allowservice_whenblacklist.hashCode()) * 31) + this.any_where_rto_district_mapping.hashCode()) * 31) + this.challanpndingrestrictpur_cd.hashCode()) * 31) + this.fee_exempt_owner_cd.hashCode()) * 31) + this.fitnessskipcheck.hashCode()) * 31) + this.govvehiclecheck.hashCode()) * 31) + this.hptcheck_skip_pur_cd.hashCode()) * 31;
        boolean z10 = this.hsrp_mandatory;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int hashCode2 = (((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + this.isncrbblacklist.hashCode()) * 31) + Integer.hashCode(this.mobile_no_checkduration)) * 31) + Integer.hashCode(this.mobile_no_checklimit)) * 31) + this.mvtax_notpermittedpurcd.hashCode()) * 31) + this.ownercdinsuranceexempt.hashCode()) * 31) + this.permitpurcondtion.hashCode()) * 31;
        boolean z12 = this.rrWithTax;
        if (z12) {
            z12 = true;
        }
        int hashCode3 = (((((((((((((((((hashCode2 + (z12 ? 1 : 0)) * 31) + this.service_alert_message.hashCode()) * 31) + this.service_allowed_with_pending_appl.hashCode()) * 31) + this.service_auth_mode.hashCode()) * 31) + this.service_resume.hashCode()) * 31) + this.service_stop.hashCode()) * 31) + this.servicecombination.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + Integer.hashCode(this.tax_nid_days)) * 31;
        boolean z13 = this.taxrestrictedsaleamt;
        if (!z13) {
            z11 = z13;
        }
        return ((((hashCode3 + (z11 ? 1 : 0)) * 31) + this.taxskipcondition.hashCode()) * 31) + this.zero_vtfee_pur_cd.hashCode();
    }

    public String toString() {
        return "vahanOnlineCheck(allowservice_fitnessinvalid=" + this.allowservice_fitnessinvalid + ", allowservice_insuranceinvalid=" + this.allowservice_insuranceinvalid + ", allowservice_rcvalidinvalid=" + this.allowservice_rcvalidinvalid + ", allowservice_taxinvalid=" + this.allowservice_taxinvalid + ", allowservice_whenblacklist=" + this.allowservice_whenblacklist + ", any_where_rto_district_mapping=" + this.any_where_rto_district_mapping + ", challanpndingrestrictpur_cd=" + this.challanpndingrestrictpur_cd + ", fee_exempt_owner_cd=" + this.fee_exempt_owner_cd + ", fitnessskipcheck=" + this.fitnessskipcheck + ", govvehiclecheck=" + this.govvehiclecheck + ", hptcheck_skip_pur_cd=" + this.hptcheck_skip_pur_cd + ", hsrp_mandatory=" + this.hsrp_mandatory + ", isncrbblacklist=" + this.isncrbblacklist + ", mobile_no_checkduration=" + this.mobile_no_checkduration + ", mobile_no_checklimit=" + this.mobile_no_checklimit + ", mvtax_notpermittedpurcd=" + this.mvtax_notpermittedpurcd + ", ownercdinsuranceexempt=" + this.ownercdinsuranceexempt + ", permitpurcondtion=" + this.permitpurcondtion + ", rrWithTax=" + this.rrWithTax + ", service_alert_message=" + this.service_alert_message + ", service_allowed_with_pending_appl=" + this.service_allowed_with_pending_appl + ", service_auth_mode=" + this.service_auth_mode + ", service_resume=" + this.service_resume + ", service_stop=" + this.service_stop + ", servicecombination=" + this.servicecombination + ", state_cd=" + this.state_cd + ", tax_nid_days=" + this.tax_nid_days + ", taxrestrictedsaleamt=" + this.taxrestrictedsaleamt + ", taxskipcondition=" + this.taxskipcondition + ", zero_vtfee_pur_cd=" + this.zero_vtfee_pur_cd + ')';
    }
}
