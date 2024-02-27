package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class RcDetails implements Serializable {
    private final String rc_blacklist_status;
    private final String rc_body_type_desc;
    private final Object rc_c_state;
    private final String rc_chasi_no;
    private final String rc_color;
    private final String rc_cubic_cap;
    private final Object rc_email_id;
    private final String rc_eng_no;
    private final String rc_f_name;
    private final String rc_financer;
    private final String rc_fit_upto;
    private final Object rc_fuel_cd;
    private final String rc_fuel_desc;
    private final String rc_gvw;
    private final String rc_insurance_comp;
    private final String rc_insurance_policy_no;
    private final String rc_insurance_upto;
    private final Object rc_maker_cd;
    private final String rc_maker_desc;
    private final String rc_maker_model;
    private final Object rc_manu_month;
    private final String rc_manu_month_yr;
    private final Object rc_manu_yr;
    private final Object rc_mobile_no;
    private final Object rc_ncrb_status;
    private final String rc_no_cyl;
    private final String rc_noc_details;
    private final Object rc_non_use_from;
    private final Object rc_non_use_status;
    private final Object rc_non_use_to;
    private final Object rc_norms_cd;
    private final String rc_norms_desc;
    private final String rc_np_issued_by;
    private final String rc_np_no;
    private final String rc_np_upto;
    private final Object rc_off_cd;
    private final String rc_owner_name;
    private final String rc_owner_sr;
    private final String rc_permanent_address;
    private final String rc_permit_issue_dt;
    private final String rc_permit_no;
    private final String rc_permit_type;
    private final String rc_permit_valid_from;
    private final String rc_permit_valid_upto;
    private final String rc_present_address;
    private final String rc_pucc_no;
    private final String rc_pucc_upto;
    private final String rc_registered_at;
    private final String rc_regn_dt;
    private final String rc_regn_no;
    private final Object rc_regn_type;
    private final String rc_seat_cap;
    private final String rc_sleeper_cap;
    private final String rc_stand_cap;
    private final String rc_status;
    private final String rc_status_as_on;
    private final String rc_tax_upto;
    private final String rc_unld_wt;
    private final String rc_vch_catg;
    private final Object rc_vch_catg_desc;
    private final Object rc_vh_class_cd;
    private final String rc_vh_class_desc;
    private final String rc_wheelbase;
    private final String state_cd;
    private final String stautsMessage;

    public RcDetails(String str, String str2, Object obj, String str3, String str4, String str5, Object obj2, String str6, String str7, String str8, String str9, Object obj3, String str10, String str11, String str12, String str13, String str14, Object obj4, String str15, String str16, Object obj5, String str17, Object obj6, Object obj7, Object obj8, String str18, String str19, Object obj9, Object obj10, Object obj11, Object obj12, String str20, String str21, String str22, String str23, Object obj13, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, Object obj14, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, Object obj15, Object obj16, String str46, String str47, String str48, String str49) {
        String str50 = str;
        String str51 = str2;
        Object obj17 = obj;
        String str52 = str3;
        String str53 = str4;
        String str54 = str5;
        Object obj18 = obj2;
        String str55 = str6;
        String str56 = str7;
        String str57 = str8;
        String str58 = str9;
        Object obj19 = obj3;
        String str59 = str10;
        String str60 = str11;
        String str61 = str13;
        l.f(str50, "rc_blacklist_status");
        l.f(str51, "rc_body_type_desc");
        l.f(obj17, "rc_c_state");
        l.f(str52, "rc_chasi_no");
        l.f(str53, "rc_color");
        l.f(str54, "rc_cubic_cap");
        l.f(obj18, "rc_email_id");
        l.f(str55, "rc_eng_no");
        l.f(str56, "rc_f_name");
        l.f(str57, "rc_financer");
        l.f(str58, "rc_fit_upto");
        l.f(obj19, "rc_fuel_cd");
        l.f(str59, "rc_fuel_desc");
        l.f(str60, "rc_gvw");
        l.f(str12, "rc_insurance_comp");
        l.f(str13, "rc_insurance_policy_no");
        l.f(str14, "rc_insurance_upto");
        l.f(obj4, "rc_maker_cd");
        l.f(str15, "rc_maker_desc");
        l.f(str16, "rc_maker_model");
        l.f(obj5, "rc_manu_month");
        l.f(str17, "rc_manu_month_yr");
        l.f(obj6, "rc_manu_yr");
        l.f(obj7, "rc_mobile_no");
        l.f(obj8, "rc_ncrb_status");
        l.f(str18, "rc_no_cyl");
        l.f(str19, "rc_noc_details");
        l.f(obj9, "rc_non_use_from");
        l.f(obj10, "rc_non_use_status");
        l.f(obj11, "rc_non_use_to");
        l.f(obj12, "rc_norms_cd");
        l.f(str20, "rc_norms_desc");
        l.f(str21, "rc_np_issued_by");
        l.f(str22, "rc_np_no");
        l.f(str23, "rc_np_upto");
        l.f(obj13, "rc_off_cd");
        l.f(str24, "rc_owner_name");
        l.f(str25, "rc_owner_sr");
        l.f(str26, "rc_permanent_address");
        l.f(str27, "rc_permit_issue_dt");
        l.f(str28, "rc_permit_no");
        l.f(str29, "rc_permit_type");
        l.f(str30, "rc_permit_valid_from");
        l.f(str31, "rc_permit_valid_upto");
        l.f(str32, "rc_present_address");
        l.f(str33, "rc_pucc_no");
        l.f(str34, "rc_pucc_upto");
        l.f(str35, "rc_registered_at");
        l.f(str36, "rc_regn_dt");
        l.f(str37, "rc_regn_no");
        l.f(obj14, "rc_regn_type");
        l.f(str38, "rc_seat_cap");
        l.f(str39, "rc_sleeper_cap");
        l.f(str40, "rc_stand_cap");
        l.f(str41, "rc_status");
        l.f(str42, "rc_status_as_on");
        l.f(str43, "rc_tax_upto");
        l.f(str44, "rc_unld_wt");
        l.f(str45, "rc_vch_catg");
        l.f(obj15, "rc_vch_catg_desc");
        l.f(obj16, "rc_vh_class_cd");
        l.f(str46, "rc_vh_class_desc");
        l.f(str47, "rc_wheelbase");
        l.f(str48, "state_cd");
        l.f(str49, "stautsMessage");
        this.rc_blacklist_status = str50;
        this.rc_body_type_desc = str51;
        this.rc_c_state = obj17;
        this.rc_chasi_no = str52;
        this.rc_color = str53;
        this.rc_cubic_cap = str54;
        this.rc_email_id = obj18;
        this.rc_eng_no = str55;
        this.rc_f_name = str56;
        this.rc_financer = str57;
        this.rc_fit_upto = str58;
        this.rc_fuel_cd = obj19;
        this.rc_fuel_desc = str59;
        this.rc_gvw = str60;
        this.rc_insurance_comp = str12;
        this.rc_insurance_policy_no = str13;
        this.rc_insurance_upto = str14;
        this.rc_maker_cd = obj4;
        this.rc_maker_desc = str15;
        this.rc_maker_model = str16;
        this.rc_manu_month = obj5;
        this.rc_manu_month_yr = str17;
        this.rc_manu_yr = obj6;
        this.rc_mobile_no = obj7;
        this.rc_ncrb_status = obj8;
        this.rc_no_cyl = str18;
        this.rc_noc_details = str19;
        this.rc_non_use_from = obj9;
        this.rc_non_use_status = obj10;
        this.rc_non_use_to = obj11;
        this.rc_norms_cd = obj12;
        this.rc_norms_desc = str20;
        this.rc_np_issued_by = str21;
        this.rc_np_no = str22;
        this.rc_np_upto = str23;
        this.rc_off_cd = obj13;
        this.rc_owner_name = str24;
        this.rc_owner_sr = str25;
        this.rc_permanent_address = str26;
        this.rc_permit_issue_dt = str27;
        this.rc_permit_no = str28;
        this.rc_permit_type = str29;
        this.rc_permit_valid_from = str30;
        this.rc_permit_valid_upto = str31;
        this.rc_present_address = str32;
        this.rc_pucc_no = str33;
        this.rc_pucc_upto = str34;
        this.rc_registered_at = str35;
        this.rc_regn_dt = str36;
        this.rc_regn_no = str37;
        this.rc_regn_type = obj14;
        this.rc_seat_cap = str38;
        this.rc_sleeper_cap = str39;
        this.rc_stand_cap = str40;
        this.rc_status = str41;
        this.rc_status_as_on = str42;
        this.rc_tax_upto = str43;
        this.rc_unld_wt = str44;
        this.rc_vch_catg = str45;
        this.rc_vch_catg_desc = obj15;
        this.rc_vh_class_cd = obj16;
        this.rc_vh_class_desc = str46;
        this.rc_wheelbase = str47;
        this.state_cd = str48;
        this.stautsMessage = str49;
    }

    public static /* synthetic */ RcDetails copy$default(RcDetails rcDetails, String str, String str2, Object obj, String str3, String str4, String str5, Object obj2, String str6, String str7, String str8, String str9, Object obj3, String str10, String str11, String str12, String str13, String str14, Object obj4, String str15, String str16, Object obj5, String str17, Object obj6, Object obj7, Object obj8, String str18, String str19, Object obj9, Object obj10, Object obj11, Object obj12, String str20, String str21, String str22, String str23, Object obj13, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, Object obj14, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, Object obj15, Object obj16, String str46, String str47, String str48, String str49, int i10, int i11, int i12, Object obj17) {
        RcDetails rcDetails2 = rcDetails;
        int i13 = i10;
        int i14 = i11;
        return rcDetails.copy((i13 & 1) != 0 ? rcDetails2.rc_blacklist_status : str, (i13 & 2) != 0 ? rcDetails2.rc_body_type_desc : str2, (i13 & 4) != 0 ? rcDetails2.rc_c_state : obj, (i13 & 8) != 0 ? rcDetails2.rc_chasi_no : str3, (i13 & 16) != 0 ? rcDetails2.rc_color : str4, (i13 & 32) != 0 ? rcDetails2.rc_cubic_cap : str5, (i13 & 64) != 0 ? rcDetails2.rc_email_id : obj2, (i13 & 128) != 0 ? rcDetails2.rc_eng_no : str6, (i13 & 256) != 0 ? rcDetails2.rc_f_name : str7, (i13 & 512) != 0 ? rcDetails2.rc_financer : str8, (i13 & 1024) != 0 ? rcDetails2.rc_fit_upto : str9, (i13 & 2048) != 0 ? rcDetails2.rc_fuel_cd : obj3, (i13 & 4096) != 0 ? rcDetails2.rc_fuel_desc : str10, (i13 & 8192) != 0 ? rcDetails2.rc_gvw : str11, (i13 & 16384) != 0 ? rcDetails2.rc_insurance_comp : str12, (i13 & 32768) != 0 ? rcDetails2.rc_insurance_policy_no : str13, (i13 & 65536) != 0 ? rcDetails2.rc_insurance_upto : str14, (i13 & 131072) != 0 ? rcDetails2.rc_maker_cd : obj4, (i13 & 262144) != 0 ? rcDetails2.rc_maker_desc : str15, (i13 & 524288) != 0 ? rcDetails2.rc_maker_model : str16, (i13 & 1048576) != 0 ? rcDetails2.rc_manu_month : obj5, (i13 & 2097152) != 0 ? rcDetails2.rc_manu_month_yr : str17, (i13 & 4194304) != 0 ? rcDetails2.rc_manu_yr : obj6, (i13 & 8388608) != 0 ? rcDetails2.rc_mobile_no : obj7, (i13 & 16777216) != 0 ? rcDetails2.rc_ncrb_status : obj8, (i13 & 33554432) != 0 ? rcDetails2.rc_no_cyl : str18, (i13 & 67108864) != 0 ? rcDetails2.rc_noc_details : str19, (i13 & 134217728) != 0 ? rcDetails2.rc_non_use_from : obj9, (i13 & 268435456) != 0 ? rcDetails2.rc_non_use_status : obj10, (i13 & 536870912) != 0 ? rcDetails2.rc_non_use_to : obj11, (i13 & 1073741824) != 0 ? rcDetails2.rc_norms_cd : obj12, (i13 & Integer.MIN_VALUE) != 0 ? rcDetails2.rc_norms_desc : str20, (i14 & 1) != 0 ? rcDetails2.rc_np_issued_by : str21, (i14 & 2) != 0 ? rcDetails2.rc_np_no : str22, (i14 & 4) != 0 ? rcDetails2.rc_np_upto : str23, (i14 & 8) != 0 ? rcDetails2.rc_off_cd : obj13, (i14 & 16) != 0 ? rcDetails2.rc_owner_name : str24, (i14 & 32) != 0 ? rcDetails2.rc_owner_sr : str25, (i14 & 64) != 0 ? rcDetails2.rc_permanent_address : str26, (i14 & 128) != 0 ? rcDetails2.rc_permit_issue_dt : str27, (i14 & 256) != 0 ? rcDetails2.rc_permit_no : str28, (i14 & 512) != 0 ? rcDetails2.rc_permit_type : str29, (i14 & 1024) != 0 ? rcDetails2.rc_permit_valid_from : str30, (i14 & 2048) != 0 ? rcDetails2.rc_permit_valid_upto : str31, (i14 & 4096) != 0 ? rcDetails2.rc_present_address : str32, (i14 & 8192) != 0 ? rcDetails2.rc_pucc_no : str33, (i14 & 16384) != 0 ? rcDetails2.rc_pucc_upto : str34, (i14 & 32768) != 0 ? rcDetails2.rc_registered_at : str35, (i14 & 65536) != 0 ? rcDetails2.rc_regn_dt : str36, (i14 & 131072) != 0 ? rcDetails2.rc_regn_no : str37, (i14 & 262144) != 0 ? rcDetails2.rc_regn_type : obj14, (i14 & 524288) != 0 ? rcDetails2.rc_seat_cap : str38, (i14 & 1048576) != 0 ? rcDetails2.rc_sleeper_cap : str39, (i14 & 2097152) != 0 ? rcDetails2.rc_stand_cap : str40, (i14 & 4194304) != 0 ? rcDetails2.rc_status : str41, (i14 & 8388608) != 0 ? rcDetails2.rc_status_as_on : str42, (i14 & 16777216) != 0 ? rcDetails2.rc_tax_upto : str43, (i14 & 33554432) != 0 ? rcDetails2.rc_unld_wt : str44, (i14 & 67108864) != 0 ? rcDetails2.rc_vch_catg : str45, (i14 & 134217728) != 0 ? rcDetails2.rc_vch_catg_desc : obj15, (i14 & 268435456) != 0 ? rcDetails2.rc_vh_class_cd : obj16, (i14 & 536870912) != 0 ? rcDetails2.rc_vh_class_desc : str46, (i14 & 1073741824) != 0 ? rcDetails2.rc_wheelbase : str47, (i14 & Integer.MIN_VALUE) != 0 ? rcDetails2.state_cd : str48, (i12 & 1) != 0 ? rcDetails2.stautsMessage : str49);
    }

    public final String component1() {
        return this.rc_blacklist_status;
    }

    public final String component10() {
        return this.rc_financer;
    }

    public final String component11() {
        return this.rc_fit_upto;
    }

    public final Object component12() {
        return this.rc_fuel_cd;
    }

    public final String component13() {
        return this.rc_fuel_desc;
    }

    public final String component14() {
        return this.rc_gvw;
    }

    public final String component15() {
        return this.rc_insurance_comp;
    }

    public final String component16() {
        return this.rc_insurance_policy_no;
    }

    public final String component17() {
        return this.rc_insurance_upto;
    }

    public final Object component18() {
        return this.rc_maker_cd;
    }

    public final String component19() {
        return this.rc_maker_desc;
    }

    public final String component2() {
        return this.rc_body_type_desc;
    }

    public final String component20() {
        return this.rc_maker_model;
    }

    public final Object component21() {
        return this.rc_manu_month;
    }

    public final String component22() {
        return this.rc_manu_month_yr;
    }

    public final Object component23() {
        return this.rc_manu_yr;
    }

    public final Object component24() {
        return this.rc_mobile_no;
    }

    public final Object component25() {
        return this.rc_ncrb_status;
    }

    public final String component26() {
        return this.rc_no_cyl;
    }

    public final String component27() {
        return this.rc_noc_details;
    }

    public final Object component28() {
        return this.rc_non_use_from;
    }

    public final Object component29() {
        return this.rc_non_use_status;
    }

    public final Object component3() {
        return this.rc_c_state;
    }

    public final Object component30() {
        return this.rc_non_use_to;
    }

    public final Object component31() {
        return this.rc_norms_cd;
    }

    public final String component32() {
        return this.rc_norms_desc;
    }

    public final String component33() {
        return this.rc_np_issued_by;
    }

    public final String component34() {
        return this.rc_np_no;
    }

    public final String component35() {
        return this.rc_np_upto;
    }

    public final Object component36() {
        return this.rc_off_cd;
    }

    public final String component37() {
        return this.rc_owner_name;
    }

    public final String component38() {
        return this.rc_owner_sr;
    }

    public final String component39() {
        return this.rc_permanent_address;
    }

    public final String component4() {
        return this.rc_chasi_no;
    }

    public final String component40() {
        return this.rc_permit_issue_dt;
    }

    public final String component41() {
        return this.rc_permit_no;
    }

    public final String component42() {
        return this.rc_permit_type;
    }

    public final String component43() {
        return this.rc_permit_valid_from;
    }

    public final String component44() {
        return this.rc_permit_valid_upto;
    }

    public final String component45() {
        return this.rc_present_address;
    }

    public final String component46() {
        return this.rc_pucc_no;
    }

    public final String component47() {
        return this.rc_pucc_upto;
    }

    public final String component48() {
        return this.rc_registered_at;
    }

    public final String component49() {
        return this.rc_regn_dt;
    }

    public final String component5() {
        return this.rc_color;
    }

    public final String component50() {
        return this.rc_regn_no;
    }

    public final Object component51() {
        return this.rc_regn_type;
    }

    public final String component52() {
        return this.rc_seat_cap;
    }

    public final String component53() {
        return this.rc_sleeper_cap;
    }

    public final String component54() {
        return this.rc_stand_cap;
    }

    public final String component55() {
        return this.rc_status;
    }

    public final String component56() {
        return this.rc_status_as_on;
    }

    public final String component57() {
        return this.rc_tax_upto;
    }

    public final String component58() {
        return this.rc_unld_wt;
    }

    public final String component59() {
        return this.rc_vch_catg;
    }

    public final String component6() {
        return this.rc_cubic_cap;
    }

    public final Object component60() {
        return this.rc_vch_catg_desc;
    }

    public final Object component61() {
        return this.rc_vh_class_cd;
    }

    public final String component62() {
        return this.rc_vh_class_desc;
    }

    public final String component63() {
        return this.rc_wheelbase;
    }

    public final String component64() {
        return this.state_cd;
    }

    public final String component65() {
        return this.stautsMessage;
    }

    public final Object component7() {
        return this.rc_email_id;
    }

    public final String component8() {
        return this.rc_eng_no;
    }

    public final String component9() {
        return this.rc_f_name;
    }

    public final RcDetails copy(String str, String str2, Object obj, String str3, String str4, String str5, Object obj2, String str6, String str7, String str8, String str9, Object obj3, String str10, String str11, String str12, String str13, String str14, Object obj4, String str15, String str16, Object obj5, String str17, Object obj6, Object obj7, Object obj8, String str18, String str19, Object obj9, Object obj10, Object obj11, Object obj12, String str20, String str21, String str22, String str23, Object obj13, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, Object obj14, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, Object obj15, Object obj16, String str46, String str47, String str48, String str49) {
        String str50 = str;
        l.f(str50, "rc_blacklist_status");
        l.f(str2, "rc_body_type_desc");
        l.f(obj, "rc_c_state");
        l.f(str3, "rc_chasi_no");
        l.f(str4, "rc_color");
        l.f(str5, "rc_cubic_cap");
        l.f(obj2, "rc_email_id");
        l.f(str6, "rc_eng_no");
        l.f(str7, "rc_f_name");
        l.f(str8, "rc_financer");
        l.f(str9, "rc_fit_upto");
        l.f(obj3, "rc_fuel_cd");
        l.f(str10, "rc_fuel_desc");
        l.f(str11, "rc_gvw");
        l.f(str12, "rc_insurance_comp");
        l.f(str13, "rc_insurance_policy_no");
        l.f(str14, "rc_insurance_upto");
        l.f(obj4, "rc_maker_cd");
        l.f(str15, "rc_maker_desc");
        l.f(str16, "rc_maker_model");
        l.f(obj5, "rc_manu_month");
        l.f(str17, "rc_manu_month_yr");
        l.f(obj6, "rc_manu_yr");
        l.f(obj7, "rc_mobile_no");
        l.f(obj8, "rc_ncrb_status");
        l.f(str18, "rc_no_cyl");
        l.f(str19, "rc_noc_details");
        l.f(obj9, "rc_non_use_from");
        l.f(obj10, "rc_non_use_status");
        l.f(obj11, "rc_non_use_to");
        l.f(obj12, "rc_norms_cd");
        l.f(str20, "rc_norms_desc");
        l.f(str21, "rc_np_issued_by");
        l.f(str22, "rc_np_no");
        l.f(str23, "rc_np_upto");
        l.f(obj13, "rc_off_cd");
        l.f(str24, "rc_owner_name");
        l.f(str25, "rc_owner_sr");
        l.f(str26, "rc_permanent_address");
        l.f(str27, "rc_permit_issue_dt");
        l.f(str28, "rc_permit_no");
        l.f(str29, "rc_permit_type");
        l.f(str30, "rc_permit_valid_from");
        l.f(str31, "rc_permit_valid_upto");
        l.f(str32, "rc_present_address");
        l.f(str33, "rc_pucc_no");
        l.f(str34, "rc_pucc_upto");
        l.f(str35, "rc_registered_at");
        l.f(str36, "rc_regn_dt");
        l.f(str37, "rc_regn_no");
        l.f(obj14, "rc_regn_type");
        l.f(str38, "rc_seat_cap");
        l.f(str39, "rc_sleeper_cap");
        l.f(str40, "rc_stand_cap");
        l.f(str41, "rc_status");
        l.f(str42, "rc_status_as_on");
        l.f(str43, "rc_tax_upto");
        l.f(str44, "rc_unld_wt");
        l.f(str45, "rc_vch_catg");
        l.f(obj15, "rc_vch_catg_desc");
        l.f(obj16, "rc_vh_class_cd");
        l.f(str46, "rc_vh_class_desc");
        l.f(str47, "rc_wheelbase");
        l.f(str48, "state_cd");
        l.f(str49, "stautsMessage");
        return new RcDetails(str50, str2, obj, str3, str4, str5, obj2, str6, str7, str8, str9, obj3, str10, str11, str12, str13, str14, obj4, str15, str16, obj5, str17, obj6, obj7, obj8, str18, str19, obj9, obj10, obj11, obj12, str20, str21, str22, str23, obj13, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, obj14, str38, str39, str40, str41, str42, str43, str44, str45, obj15, obj16, str46, str47, str48, str49);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RcDetails)) {
            return false;
        }
        RcDetails rcDetails = (RcDetails) obj;
        return l.a(this.rc_blacklist_status, rcDetails.rc_blacklist_status) && l.a(this.rc_body_type_desc, rcDetails.rc_body_type_desc) && l.a(this.rc_c_state, rcDetails.rc_c_state) && l.a(this.rc_chasi_no, rcDetails.rc_chasi_no) && l.a(this.rc_color, rcDetails.rc_color) && l.a(this.rc_cubic_cap, rcDetails.rc_cubic_cap) && l.a(this.rc_email_id, rcDetails.rc_email_id) && l.a(this.rc_eng_no, rcDetails.rc_eng_no) && l.a(this.rc_f_name, rcDetails.rc_f_name) && l.a(this.rc_financer, rcDetails.rc_financer) && l.a(this.rc_fit_upto, rcDetails.rc_fit_upto) && l.a(this.rc_fuel_cd, rcDetails.rc_fuel_cd) && l.a(this.rc_fuel_desc, rcDetails.rc_fuel_desc) && l.a(this.rc_gvw, rcDetails.rc_gvw) && l.a(this.rc_insurance_comp, rcDetails.rc_insurance_comp) && l.a(this.rc_insurance_policy_no, rcDetails.rc_insurance_policy_no) && l.a(this.rc_insurance_upto, rcDetails.rc_insurance_upto) && l.a(this.rc_maker_cd, rcDetails.rc_maker_cd) && l.a(this.rc_maker_desc, rcDetails.rc_maker_desc) && l.a(this.rc_maker_model, rcDetails.rc_maker_model) && l.a(this.rc_manu_month, rcDetails.rc_manu_month) && l.a(this.rc_manu_month_yr, rcDetails.rc_manu_month_yr) && l.a(this.rc_manu_yr, rcDetails.rc_manu_yr) && l.a(this.rc_mobile_no, rcDetails.rc_mobile_no) && l.a(this.rc_ncrb_status, rcDetails.rc_ncrb_status) && l.a(this.rc_no_cyl, rcDetails.rc_no_cyl) && l.a(this.rc_noc_details, rcDetails.rc_noc_details) && l.a(this.rc_non_use_from, rcDetails.rc_non_use_from) && l.a(this.rc_non_use_status, rcDetails.rc_non_use_status) && l.a(this.rc_non_use_to, rcDetails.rc_non_use_to) && l.a(this.rc_norms_cd, rcDetails.rc_norms_cd) && l.a(this.rc_norms_desc, rcDetails.rc_norms_desc) && l.a(this.rc_np_issued_by, rcDetails.rc_np_issued_by) && l.a(this.rc_np_no, rcDetails.rc_np_no) && l.a(this.rc_np_upto, rcDetails.rc_np_upto) && l.a(this.rc_off_cd, rcDetails.rc_off_cd) && l.a(this.rc_owner_name, rcDetails.rc_owner_name) && l.a(this.rc_owner_sr, rcDetails.rc_owner_sr) && l.a(this.rc_permanent_address, rcDetails.rc_permanent_address) && l.a(this.rc_permit_issue_dt, rcDetails.rc_permit_issue_dt) && l.a(this.rc_permit_no, rcDetails.rc_permit_no) && l.a(this.rc_permit_type, rcDetails.rc_permit_type) && l.a(this.rc_permit_valid_from, rcDetails.rc_permit_valid_from) && l.a(this.rc_permit_valid_upto, rcDetails.rc_permit_valid_upto) && l.a(this.rc_present_address, rcDetails.rc_present_address) && l.a(this.rc_pucc_no, rcDetails.rc_pucc_no) && l.a(this.rc_pucc_upto, rcDetails.rc_pucc_upto) && l.a(this.rc_registered_at, rcDetails.rc_registered_at) && l.a(this.rc_regn_dt, rcDetails.rc_regn_dt) && l.a(this.rc_regn_no, rcDetails.rc_regn_no) && l.a(this.rc_regn_type, rcDetails.rc_regn_type) && l.a(this.rc_seat_cap, rcDetails.rc_seat_cap) && l.a(this.rc_sleeper_cap, rcDetails.rc_sleeper_cap) && l.a(this.rc_stand_cap, rcDetails.rc_stand_cap) && l.a(this.rc_status, rcDetails.rc_status) && l.a(this.rc_status_as_on, rcDetails.rc_status_as_on) && l.a(this.rc_tax_upto, rcDetails.rc_tax_upto) && l.a(this.rc_unld_wt, rcDetails.rc_unld_wt) && l.a(this.rc_vch_catg, rcDetails.rc_vch_catg) && l.a(this.rc_vch_catg_desc, rcDetails.rc_vch_catg_desc) && l.a(this.rc_vh_class_cd, rcDetails.rc_vh_class_cd) && l.a(this.rc_vh_class_desc, rcDetails.rc_vh_class_desc) && l.a(this.rc_wheelbase, rcDetails.rc_wheelbase) && l.a(this.state_cd, rcDetails.state_cd) && l.a(this.stautsMessage, rcDetails.stautsMessage);
    }

    public final String getRc_blacklist_status() {
        return this.rc_blacklist_status;
    }

    public final String getRc_body_type_desc() {
        return this.rc_body_type_desc;
    }

    public final Object getRc_c_state() {
        return this.rc_c_state;
    }

    public final String getRc_chasi_no() {
        return this.rc_chasi_no;
    }

    public final String getRc_color() {
        return this.rc_color;
    }

    public final String getRc_cubic_cap() {
        return this.rc_cubic_cap;
    }

    public final Object getRc_email_id() {
        return this.rc_email_id;
    }

    public final String getRc_eng_no() {
        return this.rc_eng_no;
    }

    public final String getRc_f_name() {
        return this.rc_f_name;
    }

    public final String getRc_financer() {
        return this.rc_financer;
    }

    public final String getRc_fit_upto() {
        return this.rc_fit_upto;
    }

    public final Object getRc_fuel_cd() {
        return this.rc_fuel_cd;
    }

    public final String getRc_fuel_desc() {
        return this.rc_fuel_desc;
    }

    public final String getRc_gvw() {
        return this.rc_gvw;
    }

    public final String getRc_insurance_comp() {
        return this.rc_insurance_comp;
    }

    public final String getRc_insurance_policy_no() {
        return this.rc_insurance_policy_no;
    }

    public final String getRc_insurance_upto() {
        return this.rc_insurance_upto;
    }

    public final Object getRc_maker_cd() {
        return this.rc_maker_cd;
    }

    public final String getRc_maker_desc() {
        return this.rc_maker_desc;
    }

    public final String getRc_maker_model() {
        return this.rc_maker_model;
    }

    public final Object getRc_manu_month() {
        return this.rc_manu_month;
    }

    public final String getRc_manu_month_yr() {
        return this.rc_manu_month_yr;
    }

    public final Object getRc_manu_yr() {
        return this.rc_manu_yr;
    }

    public final Object getRc_mobile_no() {
        return this.rc_mobile_no;
    }

    public final Object getRc_ncrb_status() {
        return this.rc_ncrb_status;
    }

    public final String getRc_no_cyl() {
        return this.rc_no_cyl;
    }

    public final String getRc_noc_details() {
        return this.rc_noc_details;
    }

    public final Object getRc_non_use_from() {
        return this.rc_non_use_from;
    }

    public final Object getRc_non_use_status() {
        return this.rc_non_use_status;
    }

    public final Object getRc_non_use_to() {
        return this.rc_non_use_to;
    }

    public final Object getRc_norms_cd() {
        return this.rc_norms_cd;
    }

    public final String getRc_norms_desc() {
        return this.rc_norms_desc;
    }

    public final String getRc_np_issued_by() {
        return this.rc_np_issued_by;
    }

    public final String getRc_np_no() {
        return this.rc_np_no;
    }

    public final String getRc_np_upto() {
        return this.rc_np_upto;
    }

    public final Object getRc_off_cd() {
        return this.rc_off_cd;
    }

    public final String getRc_owner_name() {
        return this.rc_owner_name;
    }

    public final String getRc_owner_sr() {
        return this.rc_owner_sr;
    }

    public final String getRc_permanent_address() {
        return this.rc_permanent_address;
    }

    public final String getRc_permit_issue_dt() {
        return this.rc_permit_issue_dt;
    }

    public final String getRc_permit_no() {
        return this.rc_permit_no;
    }

    public final String getRc_permit_type() {
        return this.rc_permit_type;
    }

    public final String getRc_permit_valid_from() {
        return this.rc_permit_valid_from;
    }

    public final String getRc_permit_valid_upto() {
        return this.rc_permit_valid_upto;
    }

    public final String getRc_present_address() {
        return this.rc_present_address;
    }

    public final String getRc_pucc_no() {
        return this.rc_pucc_no;
    }

    public final String getRc_pucc_upto() {
        return this.rc_pucc_upto;
    }

    public final String getRc_registered_at() {
        return this.rc_registered_at;
    }

    public final String getRc_regn_dt() {
        return this.rc_regn_dt;
    }

    public final String getRc_regn_no() {
        return this.rc_regn_no;
    }

    public final Object getRc_regn_type() {
        return this.rc_regn_type;
    }

    public final String getRc_seat_cap() {
        return this.rc_seat_cap;
    }

    public final String getRc_sleeper_cap() {
        return this.rc_sleeper_cap;
    }

    public final String getRc_stand_cap() {
        return this.rc_stand_cap;
    }

    public final String getRc_status() {
        return this.rc_status;
    }

    public final String getRc_status_as_on() {
        return this.rc_status_as_on;
    }

    public final String getRc_tax_upto() {
        return this.rc_tax_upto;
    }

    public final String getRc_unld_wt() {
        return this.rc_unld_wt;
    }

    public final String getRc_vch_catg() {
        return this.rc_vch_catg;
    }

    public final Object getRc_vch_catg_desc() {
        return this.rc_vch_catg_desc;
    }

    public final Object getRc_vh_class_cd() {
        return this.rc_vh_class_cd;
    }

    public final String getRc_vh_class_desc() {
        return this.rc_vh_class_desc;
    }

    public final String getRc_wheelbase() {
        return this.rc_wheelbase;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getStautsMessage() {
        return this.stautsMessage;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.rc_blacklist_status.hashCode() * 31) + this.rc_body_type_desc.hashCode()) * 31) + this.rc_c_state.hashCode()) * 31) + this.rc_chasi_no.hashCode()) * 31) + this.rc_color.hashCode()) * 31) + this.rc_cubic_cap.hashCode()) * 31) + this.rc_email_id.hashCode()) * 31) + this.rc_eng_no.hashCode()) * 31) + this.rc_f_name.hashCode()) * 31) + this.rc_financer.hashCode()) * 31) + this.rc_fit_upto.hashCode()) * 31) + this.rc_fuel_cd.hashCode()) * 31) + this.rc_fuel_desc.hashCode()) * 31) + this.rc_gvw.hashCode()) * 31) + this.rc_insurance_comp.hashCode()) * 31) + this.rc_insurance_policy_no.hashCode()) * 31) + this.rc_insurance_upto.hashCode()) * 31) + this.rc_maker_cd.hashCode()) * 31) + this.rc_maker_desc.hashCode()) * 31) + this.rc_maker_model.hashCode()) * 31) + this.rc_manu_month.hashCode()) * 31) + this.rc_manu_month_yr.hashCode()) * 31) + this.rc_manu_yr.hashCode()) * 31) + this.rc_mobile_no.hashCode()) * 31) + this.rc_ncrb_status.hashCode()) * 31) + this.rc_no_cyl.hashCode()) * 31) + this.rc_noc_details.hashCode()) * 31) + this.rc_non_use_from.hashCode()) * 31) + this.rc_non_use_status.hashCode()) * 31) + this.rc_non_use_to.hashCode()) * 31) + this.rc_norms_cd.hashCode()) * 31) + this.rc_norms_desc.hashCode()) * 31) + this.rc_np_issued_by.hashCode()) * 31) + this.rc_np_no.hashCode()) * 31) + this.rc_np_upto.hashCode()) * 31) + this.rc_off_cd.hashCode()) * 31) + this.rc_owner_name.hashCode()) * 31) + this.rc_owner_sr.hashCode()) * 31) + this.rc_permanent_address.hashCode()) * 31) + this.rc_permit_issue_dt.hashCode()) * 31) + this.rc_permit_no.hashCode()) * 31) + this.rc_permit_type.hashCode()) * 31) + this.rc_permit_valid_from.hashCode()) * 31) + this.rc_permit_valid_upto.hashCode()) * 31) + this.rc_present_address.hashCode()) * 31) + this.rc_pucc_no.hashCode()) * 31) + this.rc_pucc_upto.hashCode()) * 31) + this.rc_registered_at.hashCode()) * 31) + this.rc_regn_dt.hashCode()) * 31) + this.rc_regn_no.hashCode()) * 31) + this.rc_regn_type.hashCode()) * 31) + this.rc_seat_cap.hashCode()) * 31) + this.rc_sleeper_cap.hashCode()) * 31) + this.rc_stand_cap.hashCode()) * 31) + this.rc_status.hashCode()) * 31) + this.rc_status_as_on.hashCode()) * 31) + this.rc_tax_upto.hashCode()) * 31) + this.rc_unld_wt.hashCode()) * 31) + this.rc_vch_catg.hashCode()) * 31) + this.rc_vch_catg_desc.hashCode()) * 31) + this.rc_vh_class_cd.hashCode()) * 31) + this.rc_vh_class_desc.hashCode()) * 31) + this.rc_wheelbase.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.stautsMessage.hashCode();
    }

    public String toString() {
        return "RcDetails(rc_blacklist_status=" + this.rc_blacklist_status + ", rc_body_type_desc=" + this.rc_body_type_desc + ", rc_c_state=" + this.rc_c_state + ", rc_chasi_no=" + this.rc_chasi_no + ", rc_color=" + this.rc_color + ", rc_cubic_cap=" + this.rc_cubic_cap + ", rc_email_id=" + this.rc_email_id + ", rc_eng_no=" + this.rc_eng_no + ", rc_f_name=" + this.rc_f_name + ", rc_financer=" + this.rc_financer + ", rc_fit_upto=" + this.rc_fit_upto + ", rc_fuel_cd=" + this.rc_fuel_cd + ", rc_fuel_desc=" + this.rc_fuel_desc + ", rc_gvw=" + this.rc_gvw + ", rc_insurance_comp=" + this.rc_insurance_comp + ", rc_insurance_policy_no=" + this.rc_insurance_policy_no + ", rc_insurance_upto=" + this.rc_insurance_upto + ", rc_maker_cd=" + this.rc_maker_cd + ", rc_maker_desc=" + this.rc_maker_desc + ", rc_maker_model=" + this.rc_maker_model + ", rc_manu_month=" + this.rc_manu_month + ", rc_manu_month_yr=" + this.rc_manu_month_yr + ", rc_manu_yr=" + this.rc_manu_yr + ", rc_mobile_no=" + this.rc_mobile_no + ", rc_ncrb_status=" + this.rc_ncrb_status + ", rc_no_cyl=" + this.rc_no_cyl + ", rc_noc_details=" + this.rc_noc_details + ", rc_non_use_from=" + this.rc_non_use_from + ", rc_non_use_status=" + this.rc_non_use_status + ", rc_non_use_to=" + this.rc_non_use_to + ", rc_norms_cd=" + this.rc_norms_cd + ", rc_norms_desc=" + this.rc_norms_desc + ", rc_np_issued_by=" + this.rc_np_issued_by + ", rc_np_no=" + this.rc_np_no + ", rc_np_upto=" + this.rc_np_upto + ", rc_off_cd=" + this.rc_off_cd + ", rc_owner_name=" + this.rc_owner_name + ", rc_owner_sr=" + this.rc_owner_sr + ", rc_permanent_address=" + this.rc_permanent_address + ", rc_permit_issue_dt=" + this.rc_permit_issue_dt + ", rc_permit_no=" + this.rc_permit_no + ", rc_permit_type=" + this.rc_permit_type + ", rc_permit_valid_from=" + this.rc_permit_valid_from + ", rc_permit_valid_upto=" + this.rc_permit_valid_upto + ", rc_present_address=" + this.rc_present_address + ", rc_pucc_no=" + this.rc_pucc_no + ", rc_pucc_upto=" + this.rc_pucc_upto + ", rc_registered_at=" + this.rc_registered_at + ", rc_regn_dt=" + this.rc_regn_dt + ", rc_regn_no=" + this.rc_regn_no + ", rc_regn_type=" + this.rc_regn_type + ", rc_seat_cap=" + this.rc_seat_cap + ", rc_sleeper_cap=" + this.rc_sleeper_cap + ", rc_stand_cap=" + this.rc_stand_cap + ", rc_status=" + this.rc_status + ", rc_status_as_on=" + this.rc_status_as_on + ", rc_tax_upto=" + this.rc_tax_upto + ", rc_unld_wt=" + this.rc_unld_wt + ", rc_vch_catg=" + this.rc_vch_catg + ", rc_vch_catg_desc=" + this.rc_vch_catg_desc + ", rc_vh_class_cd=" + this.rc_vh_class_cd + ", rc_vh_class_desc=" + this.rc_vh_class_desc + ", rc_wheelbase=" + this.rc_wheelbase + ", state_cd=" + this.state_cd + ", stautsMessage=" + this.stautsMessage + ')';
    }
}
