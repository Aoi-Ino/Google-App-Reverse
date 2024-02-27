package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class NrvDetails implements Serializable {
    private final String rc_blacklist_status;
    private final String rc_body_type_desc;
    private final String rc_c_state;
    private final String rc_chasi_no;
    private final String rc_color;
    private final String rc_cubic_cap;
    private final String rc_email_id;
    private final String rc_eng_no;
    private final String rc_f_name;
    private final String rc_financed_from;
    private final String rc_financer;
    private String rc_fit_upto;
    private final String rc_fuel_cd;
    private final String rc_fuel_desc;
    private final String rc_gvw;
    private final String rc_insurance_comp;
    private final String rc_insurance_policy_no;
    private String rc_insurance_upto;
    private final String rc_maker_cd;
    private final String rc_maker_desc;
    private final String rc_maker_model;
    private final String rc_manu_month;
    private final String rc_manu_month_yr;
    private final String rc_manu_yr;
    private final String rc_mobile_no;
    private final String rc_ncrb_status;
    private final String rc_no_cyl;
    private final String rc_noc_details;
    private final String rc_non_use_from;
    private final String rc_non_use_status;
    private final String rc_non_use_to;
    private final String rc_norms_cd;
    private final String rc_norms_desc;
    private final String rc_np_issued_by;
    private final String rc_np_no;
    private String rc_np_upto;
    private final String rc_off_cd;
    private final String rc_owner_name;
    private final String rc_owner_sr;
    private final String rc_permanent_address;
    private final String rc_permit_issue_dt;
    private final String rc_permit_no;
    private final String rc_permit_type;
    private final String rc_permit_valid_from;
    private String rc_permit_valid_upto;
    private final String rc_present_address;
    private final String rc_pucc_no;
    private String rc_pucc_upto;
    private final String rc_registered_at;
    private final String rc_regn_dt;
    private final String rc_regn_no;
    private final String rc_regn_type;
    private final String rc_seat_cap;
    private final String rc_sleeper_cap;
    private final String rc_stand_cap;
    private final String rc_status;
    private final String rc_status_as_on;
    private String rc_tax_upto;
    private final String rc_unld_wt;
    private final String rc_vch_catg;
    private final String rc_vch_catg_desc;
    private final String rc_vh_class_cd;
    private final String rc_vh_class_desc;
    private final String rc_wheelbase;
    private final String state_cd;
    private final String stautsMessage;

    public NrvDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66) {
        this.rc_blacklist_status = str;
        this.rc_body_type_desc = str2;
        this.rc_c_state = str3;
        this.rc_chasi_no = str4;
        this.rc_color = str5;
        this.rc_cubic_cap = str6;
        this.rc_email_id = str7;
        this.rc_eng_no = str8;
        this.rc_f_name = str9;
        this.rc_financed_from = str10;
        this.rc_financer = str11;
        this.rc_fit_upto = str12;
        this.rc_fuel_cd = str13;
        this.rc_fuel_desc = str14;
        this.rc_gvw = str15;
        this.rc_insurance_comp = str16;
        this.rc_insurance_policy_no = str17;
        this.rc_insurance_upto = str18;
        this.rc_maker_cd = str19;
        this.rc_maker_desc = str20;
        this.rc_maker_model = str21;
        this.rc_manu_month = str22;
        this.rc_manu_month_yr = str23;
        this.rc_manu_yr = str24;
        this.rc_mobile_no = str25;
        this.rc_ncrb_status = str26;
        this.rc_no_cyl = str27;
        this.rc_noc_details = str28;
        this.rc_non_use_from = str29;
        this.rc_non_use_status = str30;
        this.rc_non_use_to = str31;
        this.rc_norms_cd = str32;
        this.rc_norms_desc = str33;
        this.rc_np_issued_by = str34;
        this.rc_np_no = str35;
        this.rc_np_upto = str36;
        this.rc_off_cd = str37;
        this.rc_owner_name = str38;
        this.rc_owner_sr = str39;
        this.rc_permanent_address = str40;
        this.rc_permit_issue_dt = str41;
        this.rc_permit_no = str42;
        this.rc_permit_type = str43;
        this.rc_permit_valid_from = str44;
        this.rc_permit_valid_upto = str45;
        this.rc_present_address = str46;
        this.rc_pucc_no = str47;
        this.rc_pucc_upto = str48;
        this.rc_registered_at = str49;
        this.rc_regn_dt = str50;
        this.rc_regn_no = str51;
        this.rc_regn_type = str52;
        this.rc_seat_cap = str53;
        this.rc_sleeper_cap = str54;
        this.rc_stand_cap = str55;
        this.rc_status = str56;
        this.rc_status_as_on = str57;
        this.rc_tax_upto = str58;
        this.rc_unld_wt = str59;
        this.rc_vch_catg = str60;
        this.rc_vch_catg_desc = str61;
        this.rc_vh_class_cd = str62;
        this.rc_vh_class_desc = str63;
        this.rc_wheelbase = str64;
        this.state_cd = str65;
        this.stautsMessage = str66;
    }

    public static /* synthetic */ NrvDetails copy$default(NrvDetails nrvDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, int i10, int i11, int i12, Object obj) {
        NrvDetails nrvDetails2 = nrvDetails;
        int i13 = i10;
        int i14 = i11;
        return nrvDetails.copy((i13 & 1) != 0 ? nrvDetails2.rc_blacklist_status : str, (i13 & 2) != 0 ? nrvDetails2.rc_body_type_desc : str2, (i13 & 4) != 0 ? nrvDetails2.rc_c_state : str3, (i13 & 8) != 0 ? nrvDetails2.rc_chasi_no : str4, (i13 & 16) != 0 ? nrvDetails2.rc_color : str5, (i13 & 32) != 0 ? nrvDetails2.rc_cubic_cap : str6, (i13 & 64) != 0 ? nrvDetails2.rc_email_id : str7, (i13 & 128) != 0 ? nrvDetails2.rc_eng_no : str8, (i13 & 256) != 0 ? nrvDetails2.rc_f_name : str9, (i13 & 512) != 0 ? nrvDetails2.rc_financed_from : str10, (i13 & 1024) != 0 ? nrvDetails2.rc_financer : str11, (i13 & 2048) != 0 ? nrvDetails2.rc_fit_upto : str12, (i13 & 4096) != 0 ? nrvDetails2.rc_fuel_cd : str13, (i13 & 8192) != 0 ? nrvDetails2.rc_fuel_desc : str14, (i13 & 16384) != 0 ? nrvDetails2.rc_gvw : str15, (i13 & 32768) != 0 ? nrvDetails2.rc_insurance_comp : str16, (i13 & 65536) != 0 ? nrvDetails2.rc_insurance_policy_no : str17, (i13 & 131072) != 0 ? nrvDetails2.rc_insurance_upto : str18, (i13 & 262144) != 0 ? nrvDetails2.rc_maker_cd : str19, (i13 & 524288) != 0 ? nrvDetails2.rc_maker_desc : str20, (i13 & 1048576) != 0 ? nrvDetails2.rc_maker_model : str21, (i13 & 2097152) != 0 ? nrvDetails2.rc_manu_month : str22, (i13 & 4194304) != 0 ? nrvDetails2.rc_manu_month_yr : str23, (i13 & 8388608) != 0 ? nrvDetails2.rc_manu_yr : str24, (i13 & 16777216) != 0 ? nrvDetails2.rc_mobile_no : str25, (i13 & 33554432) != 0 ? nrvDetails2.rc_ncrb_status : str26, (i13 & 67108864) != 0 ? nrvDetails2.rc_no_cyl : str27, (i13 & 134217728) != 0 ? nrvDetails2.rc_noc_details : str28, (i13 & 268435456) != 0 ? nrvDetails2.rc_non_use_from : str29, (i13 & 536870912) != 0 ? nrvDetails2.rc_non_use_status : str30, (i13 & 1073741824) != 0 ? nrvDetails2.rc_non_use_to : str31, (i13 & Integer.MIN_VALUE) != 0 ? nrvDetails2.rc_norms_cd : str32, (i14 & 1) != 0 ? nrvDetails2.rc_norms_desc : str33, (i14 & 2) != 0 ? nrvDetails2.rc_np_issued_by : str34, (i14 & 4) != 0 ? nrvDetails2.rc_np_no : str35, (i14 & 8) != 0 ? nrvDetails2.rc_np_upto : str36, (i14 & 16) != 0 ? nrvDetails2.rc_off_cd : str37, (i14 & 32) != 0 ? nrvDetails2.rc_owner_name : str38, (i14 & 64) != 0 ? nrvDetails2.rc_owner_sr : str39, (i14 & 128) != 0 ? nrvDetails2.rc_permanent_address : str40, (i14 & 256) != 0 ? nrvDetails2.rc_permit_issue_dt : str41, (i14 & 512) != 0 ? nrvDetails2.rc_permit_no : str42, (i14 & 1024) != 0 ? nrvDetails2.rc_permit_type : str43, (i14 & 2048) != 0 ? nrvDetails2.rc_permit_valid_from : str44, (i14 & 4096) != 0 ? nrvDetails2.rc_permit_valid_upto : str45, (i14 & 8192) != 0 ? nrvDetails2.rc_present_address : str46, (i14 & 16384) != 0 ? nrvDetails2.rc_pucc_no : str47, (i14 & 32768) != 0 ? nrvDetails2.rc_pucc_upto : str48, (i14 & 65536) != 0 ? nrvDetails2.rc_registered_at : str49, (i14 & 131072) != 0 ? nrvDetails2.rc_regn_dt : str50, (i14 & 262144) != 0 ? nrvDetails2.rc_regn_no : str51, (i14 & 524288) != 0 ? nrvDetails2.rc_regn_type : str52, (i14 & 1048576) != 0 ? nrvDetails2.rc_seat_cap : str53, (i14 & 2097152) != 0 ? nrvDetails2.rc_sleeper_cap : str54, (i14 & 4194304) != 0 ? nrvDetails2.rc_stand_cap : str55, (i14 & 8388608) != 0 ? nrvDetails2.rc_status : str56, (i14 & 16777216) != 0 ? nrvDetails2.rc_status_as_on : str57, (i14 & 33554432) != 0 ? nrvDetails2.rc_tax_upto : str58, (i14 & 67108864) != 0 ? nrvDetails2.rc_unld_wt : str59, (i14 & 134217728) != 0 ? nrvDetails2.rc_vch_catg : str60, (i14 & 268435456) != 0 ? nrvDetails2.rc_vch_catg_desc : str61, (i14 & 536870912) != 0 ? nrvDetails2.rc_vh_class_cd : str62, (i14 & 1073741824) != 0 ? nrvDetails2.rc_vh_class_desc : str63, (i14 & Integer.MIN_VALUE) != 0 ? nrvDetails2.rc_wheelbase : str64, (i12 & 1) != 0 ? nrvDetails2.state_cd : str65, (i12 & 2) != 0 ? nrvDetails2.stautsMessage : str66);
    }

    public final String component1() {
        return this.rc_blacklist_status;
    }

    public final String component10() {
        return this.rc_financed_from;
    }

    public final String component11() {
        return this.rc_financer;
    }

    public final String component12() {
        return this.rc_fit_upto;
    }

    public final String component13() {
        return this.rc_fuel_cd;
    }

    public final String component14() {
        return this.rc_fuel_desc;
    }

    public final String component15() {
        return this.rc_gvw;
    }

    public final String component16() {
        return this.rc_insurance_comp;
    }

    public final String component17() {
        return this.rc_insurance_policy_no;
    }

    public final String component18() {
        return this.rc_insurance_upto;
    }

    public final String component19() {
        return this.rc_maker_cd;
    }

    public final String component2() {
        return this.rc_body_type_desc;
    }

    public final String component20() {
        return this.rc_maker_desc;
    }

    public final String component21() {
        return this.rc_maker_model;
    }

    public final String component22() {
        return this.rc_manu_month;
    }

    public final String component23() {
        return this.rc_manu_month_yr;
    }

    public final String component24() {
        return this.rc_manu_yr;
    }

    public final String component25() {
        return this.rc_mobile_no;
    }

    public final String component26() {
        return this.rc_ncrb_status;
    }

    public final String component27() {
        return this.rc_no_cyl;
    }

    public final String component28() {
        return this.rc_noc_details;
    }

    public final String component29() {
        return this.rc_non_use_from;
    }

    public final String component3() {
        return this.rc_c_state;
    }

    public final String component30() {
        return this.rc_non_use_status;
    }

    public final String component31() {
        return this.rc_non_use_to;
    }

    public final String component32() {
        return this.rc_norms_cd;
    }

    public final String component33() {
        return this.rc_norms_desc;
    }

    public final String component34() {
        return this.rc_np_issued_by;
    }

    public final String component35() {
        return this.rc_np_no;
    }

    public final String component36() {
        return this.rc_np_upto;
    }

    public final String component37() {
        return this.rc_off_cd;
    }

    public final String component38() {
        return this.rc_owner_name;
    }

    public final String component39() {
        return this.rc_owner_sr;
    }

    public final String component4() {
        return this.rc_chasi_no;
    }

    public final String component40() {
        return this.rc_permanent_address;
    }

    public final String component41() {
        return this.rc_permit_issue_dt;
    }

    public final String component42() {
        return this.rc_permit_no;
    }

    public final String component43() {
        return this.rc_permit_type;
    }

    public final String component44() {
        return this.rc_permit_valid_from;
    }

    public final String component45() {
        return this.rc_permit_valid_upto;
    }

    public final String component46() {
        return this.rc_present_address;
    }

    public final String component47() {
        return this.rc_pucc_no;
    }

    public final String component48() {
        return this.rc_pucc_upto;
    }

    public final String component49() {
        return this.rc_registered_at;
    }

    public final String component5() {
        return this.rc_color;
    }

    public final String component50() {
        return this.rc_regn_dt;
    }

    public final String component51() {
        return this.rc_regn_no;
    }

    public final String component52() {
        return this.rc_regn_type;
    }

    public final String component53() {
        return this.rc_seat_cap;
    }

    public final String component54() {
        return this.rc_sleeper_cap;
    }

    public final String component55() {
        return this.rc_stand_cap;
    }

    public final String component56() {
        return this.rc_status;
    }

    public final String component57() {
        return this.rc_status_as_on;
    }

    public final String component58() {
        return this.rc_tax_upto;
    }

    public final String component59() {
        return this.rc_unld_wt;
    }

    public final String component6() {
        return this.rc_cubic_cap;
    }

    public final String component60() {
        return this.rc_vch_catg;
    }

    public final String component61() {
        return this.rc_vch_catg_desc;
    }

    public final String component62() {
        return this.rc_vh_class_cd;
    }

    public final String component63() {
        return this.rc_vh_class_desc;
    }

    public final String component64() {
        return this.rc_wheelbase;
    }

    public final String component65() {
        return this.state_cd;
    }

    public final String component66() {
        return this.stautsMessage;
    }

    public final String component7() {
        return this.rc_email_id;
    }

    public final String component8() {
        return this.rc_eng_no;
    }

    public final String component9() {
        return this.rc_f_name;
    }

    public final NrvDetails copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66) {
        return new NrvDetails(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, str63, str64, str65, str66);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NrvDetails)) {
            return false;
        }
        NrvDetails nrvDetails = (NrvDetails) obj;
        return l.a(this.rc_blacklist_status, nrvDetails.rc_blacklist_status) && l.a(this.rc_body_type_desc, nrvDetails.rc_body_type_desc) && l.a(this.rc_c_state, nrvDetails.rc_c_state) && l.a(this.rc_chasi_no, nrvDetails.rc_chasi_no) && l.a(this.rc_color, nrvDetails.rc_color) && l.a(this.rc_cubic_cap, nrvDetails.rc_cubic_cap) && l.a(this.rc_email_id, nrvDetails.rc_email_id) && l.a(this.rc_eng_no, nrvDetails.rc_eng_no) && l.a(this.rc_f_name, nrvDetails.rc_f_name) && l.a(this.rc_financed_from, nrvDetails.rc_financed_from) && l.a(this.rc_financer, nrvDetails.rc_financer) && l.a(this.rc_fit_upto, nrvDetails.rc_fit_upto) && l.a(this.rc_fuel_cd, nrvDetails.rc_fuel_cd) && l.a(this.rc_fuel_desc, nrvDetails.rc_fuel_desc) && l.a(this.rc_gvw, nrvDetails.rc_gvw) && l.a(this.rc_insurance_comp, nrvDetails.rc_insurance_comp) && l.a(this.rc_insurance_policy_no, nrvDetails.rc_insurance_policy_no) && l.a(this.rc_insurance_upto, nrvDetails.rc_insurance_upto) && l.a(this.rc_maker_cd, nrvDetails.rc_maker_cd) && l.a(this.rc_maker_desc, nrvDetails.rc_maker_desc) && l.a(this.rc_maker_model, nrvDetails.rc_maker_model) && l.a(this.rc_manu_month, nrvDetails.rc_manu_month) && l.a(this.rc_manu_month_yr, nrvDetails.rc_manu_month_yr) && l.a(this.rc_manu_yr, nrvDetails.rc_manu_yr) && l.a(this.rc_mobile_no, nrvDetails.rc_mobile_no) && l.a(this.rc_ncrb_status, nrvDetails.rc_ncrb_status) && l.a(this.rc_no_cyl, nrvDetails.rc_no_cyl) && l.a(this.rc_noc_details, nrvDetails.rc_noc_details) && l.a(this.rc_non_use_from, nrvDetails.rc_non_use_from) && l.a(this.rc_non_use_status, nrvDetails.rc_non_use_status) && l.a(this.rc_non_use_to, nrvDetails.rc_non_use_to) && l.a(this.rc_norms_cd, nrvDetails.rc_norms_cd) && l.a(this.rc_norms_desc, nrvDetails.rc_norms_desc) && l.a(this.rc_np_issued_by, nrvDetails.rc_np_issued_by) && l.a(this.rc_np_no, nrvDetails.rc_np_no) && l.a(this.rc_np_upto, nrvDetails.rc_np_upto) && l.a(this.rc_off_cd, nrvDetails.rc_off_cd) && l.a(this.rc_owner_name, nrvDetails.rc_owner_name) && l.a(this.rc_owner_sr, nrvDetails.rc_owner_sr) && l.a(this.rc_permanent_address, nrvDetails.rc_permanent_address) && l.a(this.rc_permit_issue_dt, nrvDetails.rc_permit_issue_dt) && l.a(this.rc_permit_no, nrvDetails.rc_permit_no) && l.a(this.rc_permit_type, nrvDetails.rc_permit_type) && l.a(this.rc_permit_valid_from, nrvDetails.rc_permit_valid_from) && l.a(this.rc_permit_valid_upto, nrvDetails.rc_permit_valid_upto) && l.a(this.rc_present_address, nrvDetails.rc_present_address) && l.a(this.rc_pucc_no, nrvDetails.rc_pucc_no) && l.a(this.rc_pucc_upto, nrvDetails.rc_pucc_upto) && l.a(this.rc_registered_at, nrvDetails.rc_registered_at) && l.a(this.rc_regn_dt, nrvDetails.rc_regn_dt) && l.a(this.rc_regn_no, nrvDetails.rc_regn_no) && l.a(this.rc_regn_type, nrvDetails.rc_regn_type) && l.a(this.rc_seat_cap, nrvDetails.rc_seat_cap) && l.a(this.rc_sleeper_cap, nrvDetails.rc_sleeper_cap) && l.a(this.rc_stand_cap, nrvDetails.rc_stand_cap) && l.a(this.rc_status, nrvDetails.rc_status) && l.a(this.rc_status_as_on, nrvDetails.rc_status_as_on) && l.a(this.rc_tax_upto, nrvDetails.rc_tax_upto) && l.a(this.rc_unld_wt, nrvDetails.rc_unld_wt) && l.a(this.rc_vch_catg, nrvDetails.rc_vch_catg) && l.a(this.rc_vch_catg_desc, nrvDetails.rc_vch_catg_desc) && l.a(this.rc_vh_class_cd, nrvDetails.rc_vh_class_cd) && l.a(this.rc_vh_class_desc, nrvDetails.rc_vh_class_desc) && l.a(this.rc_wheelbase, nrvDetails.rc_wheelbase) && l.a(this.state_cd, nrvDetails.state_cd) && l.a(this.stautsMessage, nrvDetails.stautsMessage);
    }

    public final String getRc_blacklist_status() {
        return this.rc_blacklist_status;
    }

    public final String getRc_body_type_desc() {
        return this.rc_body_type_desc;
    }

    public final String getRc_c_state() {
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

    public final String getRc_email_id() {
        return this.rc_email_id;
    }

    public final String getRc_eng_no() {
        return this.rc_eng_no;
    }

    public final String getRc_f_name() {
        return this.rc_f_name;
    }

    public final String getRc_financed_from() {
        return this.rc_financed_from;
    }

    public final String getRc_financer() {
        return this.rc_financer;
    }

    public final String getRc_fit_upto() {
        return this.rc_fit_upto;
    }

    public final String getRc_fuel_cd() {
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

    public final String getRc_maker_cd() {
        return this.rc_maker_cd;
    }

    public final String getRc_maker_desc() {
        return this.rc_maker_desc;
    }

    public final String getRc_maker_model() {
        return this.rc_maker_model;
    }

    public final String getRc_manu_month() {
        return this.rc_manu_month;
    }

    public final String getRc_manu_month_yr() {
        return this.rc_manu_month_yr;
    }

    public final String getRc_manu_yr() {
        return this.rc_manu_yr;
    }

    public final String getRc_mobile_no() {
        return this.rc_mobile_no;
    }

    public final String getRc_ncrb_status() {
        return this.rc_ncrb_status;
    }

    public final String getRc_no_cyl() {
        return this.rc_no_cyl;
    }

    public final String getRc_noc_details() {
        return this.rc_noc_details;
    }

    public final String getRc_non_use_from() {
        return this.rc_non_use_from;
    }

    public final String getRc_non_use_status() {
        return this.rc_non_use_status;
    }

    public final String getRc_non_use_to() {
        return this.rc_non_use_to;
    }

    public final String getRc_norms_cd() {
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

    public final String getRc_off_cd() {
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

    public final String getRc_regn_type() {
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

    public final String getRc_vch_catg_desc() {
        return this.rc_vch_catg_desc;
    }

    public final String getRc_vh_class_cd() {
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
        String str = this.rc_blacklist_status;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rc_body_type_desc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rc_c_state;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rc_chasi_no;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rc_color;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rc_cubic_cap;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.rc_email_id;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rc_eng_no;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.rc_f_name;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.rc_financed_from;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rc_financer;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.rc_fit_upto;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.rc_fuel_cd;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.rc_fuel_desc;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.rc_gvw;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.rc_insurance_comp;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.rc_insurance_policy_no;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.rc_insurance_upto;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.rc_maker_cd;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.rc_maker_desc;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.rc_maker_model;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.rc_manu_month;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.rc_manu_month_yr;
        int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.rc_manu_yr;
        int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.rc_mobile_no;
        int hashCode25 = (hashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.rc_ncrb_status;
        int hashCode26 = (hashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.rc_no_cyl;
        int hashCode27 = (hashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.rc_noc_details;
        int hashCode28 = (hashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.rc_non_use_from;
        int hashCode29 = (hashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.rc_non_use_status;
        int hashCode30 = (hashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.rc_non_use_to;
        int hashCode31 = (hashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.rc_norms_cd;
        int hashCode32 = (hashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.rc_norms_desc;
        int hashCode33 = (hashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.rc_np_issued_by;
        int hashCode34 = (hashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.rc_np_no;
        int hashCode35 = (hashCode34 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.rc_np_upto;
        int hashCode36 = (hashCode35 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.rc_off_cd;
        int hashCode37 = (hashCode36 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.rc_owner_name;
        int hashCode38 = (hashCode37 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.rc_owner_sr;
        int hashCode39 = (hashCode38 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.rc_permanent_address;
        int hashCode40 = (hashCode39 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.rc_permit_issue_dt;
        int hashCode41 = (hashCode40 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.rc_permit_no;
        int hashCode42 = (hashCode41 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.rc_permit_type;
        int hashCode43 = (hashCode42 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.rc_permit_valid_from;
        int hashCode44 = (hashCode43 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.rc_permit_valid_upto;
        int hashCode45 = (hashCode44 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.rc_present_address;
        int hashCode46 = (hashCode45 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.rc_pucc_no;
        int hashCode47 = (hashCode46 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.rc_pucc_upto;
        int hashCode48 = (hashCode47 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.rc_registered_at;
        int hashCode49 = (hashCode48 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.rc_regn_dt;
        int hashCode50 = (hashCode49 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.rc_regn_no;
        int hashCode51 = (hashCode50 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.rc_regn_type;
        int hashCode52 = (hashCode51 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.rc_seat_cap;
        int hashCode53 = (hashCode52 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.rc_sleeper_cap;
        int hashCode54 = (hashCode53 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.rc_stand_cap;
        int hashCode55 = (hashCode54 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.rc_status;
        int hashCode56 = (hashCode55 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.rc_status_as_on;
        int hashCode57 = (hashCode56 + (str57 == null ? 0 : str57.hashCode())) * 31;
        String str58 = this.rc_tax_upto;
        int hashCode58 = (hashCode57 + (str58 == null ? 0 : str58.hashCode())) * 31;
        String str59 = this.rc_unld_wt;
        int hashCode59 = (hashCode58 + (str59 == null ? 0 : str59.hashCode())) * 31;
        String str60 = this.rc_vch_catg;
        int hashCode60 = (hashCode59 + (str60 == null ? 0 : str60.hashCode())) * 31;
        String str61 = this.rc_vch_catg_desc;
        int hashCode61 = (hashCode60 + (str61 == null ? 0 : str61.hashCode())) * 31;
        String str62 = this.rc_vh_class_cd;
        int hashCode62 = (hashCode61 + (str62 == null ? 0 : str62.hashCode())) * 31;
        String str63 = this.rc_vh_class_desc;
        int hashCode63 = (hashCode62 + (str63 == null ? 0 : str63.hashCode())) * 31;
        String str64 = this.rc_wheelbase;
        int hashCode64 = (hashCode63 + (str64 == null ? 0 : str64.hashCode())) * 31;
        String str65 = this.state_cd;
        int hashCode65 = (hashCode64 + (str65 == null ? 0 : str65.hashCode())) * 31;
        String str66 = this.stautsMessage;
        if (str66 != null) {
            i10 = str66.hashCode();
        }
        return hashCode65 + i10;
    }

    public final void setRc_fit_upto(String str) {
        this.rc_fit_upto = str;
    }

    public final void setRc_insurance_upto(String str) {
        this.rc_insurance_upto = str;
    }

    public final void setRc_np_upto(String str) {
        this.rc_np_upto = str;
    }

    public final void setRc_permit_valid_upto(String str) {
        this.rc_permit_valid_upto = str;
    }

    public final void setRc_pucc_upto(String str) {
        this.rc_pucc_upto = str;
    }

    public final void setRc_tax_upto(String str) {
        this.rc_tax_upto = str;
    }

    public String toString() {
        return "NrvDetails(rc_blacklist_status=" + this.rc_blacklist_status + ", rc_body_type_desc=" + this.rc_body_type_desc + ", rc_c_state=" + this.rc_c_state + ", rc_chasi_no=" + this.rc_chasi_no + ", rc_color=" + this.rc_color + ", rc_cubic_cap=" + this.rc_cubic_cap + ", rc_email_id=" + this.rc_email_id + ", rc_eng_no=" + this.rc_eng_no + ", rc_f_name=" + this.rc_f_name + ", rc_financed_from=" + this.rc_financed_from + ", rc_financer=" + this.rc_financer + ", rc_fit_upto=" + this.rc_fit_upto + ", rc_fuel_cd=" + this.rc_fuel_cd + ", rc_fuel_desc=" + this.rc_fuel_desc + ", rc_gvw=" + this.rc_gvw + ", rc_insurance_comp=" + this.rc_insurance_comp + ", rc_insurance_policy_no=" + this.rc_insurance_policy_no + ", rc_insurance_upto=" + this.rc_insurance_upto + ", rc_maker_cd=" + this.rc_maker_cd + ", rc_maker_desc=" + this.rc_maker_desc + ", rc_maker_model=" + this.rc_maker_model + ", rc_manu_month=" + this.rc_manu_month + ", rc_manu_month_yr=" + this.rc_manu_month_yr + ", rc_manu_yr=" + this.rc_manu_yr + ", rc_mobile_no=" + this.rc_mobile_no + ", rc_ncrb_status=" + this.rc_ncrb_status + ", rc_no_cyl=" + this.rc_no_cyl + ", rc_noc_details=" + this.rc_noc_details + ", rc_non_use_from=" + this.rc_non_use_from + ", rc_non_use_status=" + this.rc_non_use_status + ", rc_non_use_to=" + this.rc_non_use_to + ", rc_norms_cd=" + this.rc_norms_cd + ", rc_norms_desc=" + this.rc_norms_desc + ", rc_np_issued_by=" + this.rc_np_issued_by + ", rc_np_no=" + this.rc_np_no + ", rc_np_upto=" + this.rc_np_upto + ", rc_off_cd=" + this.rc_off_cd + ", rc_owner_name=" + this.rc_owner_name + ", rc_owner_sr=" + this.rc_owner_sr + ", rc_permanent_address=" + this.rc_permanent_address + ", rc_permit_issue_dt=" + this.rc_permit_issue_dt + ", rc_permit_no=" + this.rc_permit_no + ", rc_permit_type=" + this.rc_permit_type + ", rc_permit_valid_from=" + this.rc_permit_valid_from + ", rc_permit_valid_upto=" + this.rc_permit_valid_upto + ", rc_present_address=" + this.rc_present_address + ", rc_pucc_no=" + this.rc_pucc_no + ", rc_pucc_upto=" + this.rc_pucc_upto + ", rc_registered_at=" + this.rc_registered_at + ", rc_regn_dt=" + this.rc_regn_dt + ", rc_regn_no=" + this.rc_regn_no + ", rc_regn_type=" + this.rc_regn_type + ", rc_seat_cap=" + this.rc_seat_cap + ", rc_sleeper_cap=" + this.rc_sleeper_cap + ", rc_stand_cap=" + this.rc_stand_cap + ", rc_status=" + this.rc_status + ", rc_status_as_on=" + this.rc_status_as_on + ", rc_tax_upto=" + this.rc_tax_upto + ", rc_unld_wt=" + this.rc_unld_wt + ", rc_vch_catg=" + this.rc_vch_catg + ", rc_vch_catg_desc=" + this.rc_vch_catg_desc + ", rc_vh_class_cd=" + this.rc_vh_class_cd + ", rc_vh_class_desc=" + this.rc_vh_class_desc + ", rc_wheelbase=" + this.rc_wheelbase + ", state_cd=" + this.state_cd + ", stautsMessage=" + this.stautsMessage + ')';
    }
}
