package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanServices.Model.VTHypthEntity;
import java.io.Serializable;

@Keep
public final class NrvDetails implements Serializable {
    private final Object pmt_catg_code;
    private final Object pmt_type_code;
    private final String rc_c_state;
    private final String rc_chasi_no;
    private final String rc_eng_no;
    private final String rc_f_name;
    private final String rc_financer;
    private final String rc_fit_upto;
    private final String rc_fuel_desc;
    private final String rc_insurance_comp;
    private final String rc_insurance_from;
    private final String rc_insurance_policy_no;
    private final String rc_insurance_upto;
    private final String rc_maker_desc;
    private final String rc_maker_model;
    private final String rc_mobile_no;
    private final String rc_norms_desc;
    private final String rc_np_issued_by;
    private final String rc_np_no;
    private final String rc_np_upto;
    private final String rc_off_cd;
    private final String rc_owner_name;
    private final String rc_owner_sr;
    private final Integer rc_owner_srNo;
    private final String rc_permanent_address;
    private final String rc_permit_issue_dt;
    private final String rc_permit_no;
    private final String rc_permit_type;
    private final String rc_permit_valid_from;
    private final String rc_permit_valid_upto;
    private final String rc_present_address;
    private final String rc_pucc_no;
    private final String rc_pucc_upto;
    private final String rc_regn_dt;
    private final String rc_regn_no;
    private final String rc_tax_upto;
    private final String rc_vch_catg;
    private final String rc_vch_catg_desc;
    private final String rc_vh_class_cd;
    private final String rc_vh_class_desc;
    private final Integer seat_cap;
    private final String state_cd;
    private final VTHypthEntity vTHypthEntity;
    private final String vehType;
    private final Integer vehTypeAsInt;

    public NrvDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, Integer num, Integer num2, Integer num3, Object obj, Object obj2, String str39, VTHypthEntity vTHypthEntity2) {
        this.rc_fit_upto = str;
        this.rc_financer = str2;
        this.rc_insurance_upto = str3;
        this.rc_insurance_comp = str4;
        this.rc_insurance_policy_no = str5;
        this.rc_pucc_upto = str6;
        this.rc_pucc_no = str7;
        this.rc_np_upto = str8;
        this.rc_np_issued_by = str9;
        this.rc_np_no = str10;
        this.rc_permit_valid_upto = str11;
        this.rc_permit_valid_from = str12;
        this.rc_permit_type = str13;
        this.rc_permit_issue_dt = str14;
        this.rc_permit_no = str15;
        this.rc_tax_upto = str16;
        this.rc_norms_desc = str17;
        this.rc_fuel_desc = str18;
        this.rc_regn_dt = str19;
        this.rc_maker_model = str20;
        this.rc_maker_desc = str21;
        this.rc_vch_catg_desc = str22;
        this.rc_vh_class_desc = str23;
        this.rc_f_name = str24;
        this.rc_owner_name = str25;
        this.rc_c_state = str26;
        this.rc_chasi_no = str27;
        this.rc_eng_no = str28;
        this.rc_mobile_no = str29;
        this.rc_off_cd = str30;
        this.rc_owner_sr = str31;
        this.rc_permanent_address = str32;
        this.rc_present_address = str33;
        this.rc_regn_no = str34;
        this.state_cd = str35;
        this.rc_vch_catg = str36;
        this.rc_vh_class_cd = str37;
        this.vehType = str38;
        this.vehTypeAsInt = num;
        this.seat_cap = num2;
        this.rc_owner_srNo = num3;
        this.pmt_type_code = obj;
        this.pmt_catg_code = obj2;
        this.rc_insurance_from = str39;
        this.vTHypthEntity = vTHypthEntity2;
    }

    public static /* synthetic */ NrvDetails copy$default(NrvDetails nrvDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, Integer num, Integer num2, Integer num3, Object obj, Object obj2, String str39, VTHypthEntity vTHypthEntity2, int i10, int i11, Object obj3) {
        NrvDetails nrvDetails2 = nrvDetails;
        int i12 = i10;
        int i13 = i11;
        return nrvDetails.copy((i12 & 1) != 0 ? nrvDetails2.rc_fit_upto : str, (i12 & 2) != 0 ? nrvDetails2.rc_financer : str2, (i12 & 4) != 0 ? nrvDetails2.rc_insurance_upto : str3, (i12 & 8) != 0 ? nrvDetails2.rc_insurance_comp : str4, (i12 & 16) != 0 ? nrvDetails2.rc_insurance_policy_no : str5, (i12 & 32) != 0 ? nrvDetails2.rc_pucc_upto : str6, (i12 & 64) != 0 ? nrvDetails2.rc_pucc_no : str7, (i12 & 128) != 0 ? nrvDetails2.rc_np_upto : str8, (i12 & 256) != 0 ? nrvDetails2.rc_np_issued_by : str9, (i12 & 512) != 0 ? nrvDetails2.rc_np_no : str10, (i12 & 1024) != 0 ? nrvDetails2.rc_permit_valid_upto : str11, (i12 & 2048) != 0 ? nrvDetails2.rc_permit_valid_from : str12, (i12 & 4096) != 0 ? nrvDetails2.rc_permit_type : str13, (i12 & 8192) != 0 ? nrvDetails2.rc_permit_issue_dt : str14, (i12 & 16384) != 0 ? nrvDetails2.rc_permit_no : str15, (i12 & 32768) != 0 ? nrvDetails2.rc_tax_upto : str16, (i12 & 65536) != 0 ? nrvDetails2.rc_norms_desc : str17, (i12 & 131072) != 0 ? nrvDetails2.rc_fuel_desc : str18, (i12 & 262144) != 0 ? nrvDetails2.rc_regn_dt : str19, (i12 & 524288) != 0 ? nrvDetails2.rc_maker_model : str20, (i12 & 1048576) != 0 ? nrvDetails2.rc_maker_desc : str21, (i12 & 2097152) != 0 ? nrvDetails2.rc_vch_catg_desc : str22, (i12 & 4194304) != 0 ? nrvDetails2.rc_vh_class_desc : str23, (i12 & 8388608) != 0 ? nrvDetails2.rc_f_name : str24, (i12 & 16777216) != 0 ? nrvDetails2.rc_owner_name : str25, (i12 & 33554432) != 0 ? nrvDetails2.rc_c_state : str26, (i12 & 67108864) != 0 ? nrvDetails2.rc_chasi_no : str27, (i12 & 134217728) != 0 ? nrvDetails2.rc_eng_no : str28, (i12 & 268435456) != 0 ? nrvDetails2.rc_mobile_no : str29, (i12 & 536870912) != 0 ? nrvDetails2.rc_off_cd : str30, (i12 & 1073741824) != 0 ? nrvDetails2.rc_owner_sr : str31, (i12 & Integer.MIN_VALUE) != 0 ? nrvDetails2.rc_permanent_address : str32, (i13 & 1) != 0 ? nrvDetails2.rc_present_address : str33, (i13 & 2) != 0 ? nrvDetails2.rc_regn_no : str34, (i13 & 4) != 0 ? nrvDetails2.state_cd : str35, (i13 & 8) != 0 ? nrvDetails2.rc_vch_catg : str36, (i13 & 16) != 0 ? nrvDetails2.rc_vh_class_cd : str37, (i13 & 32) != 0 ? nrvDetails2.vehType : str38, (i13 & 64) != 0 ? nrvDetails2.vehTypeAsInt : num, (i13 & 128) != 0 ? nrvDetails2.seat_cap : num2, (i13 & 256) != 0 ? nrvDetails2.rc_owner_srNo : num3, (i13 & 512) != 0 ? nrvDetails2.pmt_type_code : obj, (i13 & 1024) != 0 ? nrvDetails2.pmt_catg_code : obj2, (i13 & 2048) != 0 ? nrvDetails2.rc_insurance_from : str39, (i13 & 4096) != 0 ? nrvDetails2.vTHypthEntity : vTHypthEntity2);
    }

    public final String component1() {
        return this.rc_fit_upto;
    }

    public final String component10() {
        return this.rc_np_no;
    }

    public final String component11() {
        return this.rc_permit_valid_upto;
    }

    public final String component12() {
        return this.rc_permit_valid_from;
    }

    public final String component13() {
        return this.rc_permit_type;
    }

    public final String component14() {
        return this.rc_permit_issue_dt;
    }

    public final String component15() {
        return this.rc_permit_no;
    }

    public final String component16() {
        return this.rc_tax_upto;
    }

    public final String component17() {
        return this.rc_norms_desc;
    }

    public final String component18() {
        return this.rc_fuel_desc;
    }

    public final String component19() {
        return this.rc_regn_dt;
    }

    public final String component2() {
        return this.rc_financer;
    }

    public final String component20() {
        return this.rc_maker_model;
    }

    public final String component21() {
        return this.rc_maker_desc;
    }

    public final String component22() {
        return this.rc_vch_catg_desc;
    }

    public final String component23() {
        return this.rc_vh_class_desc;
    }

    public final String component24() {
        return this.rc_f_name;
    }

    public final String component25() {
        return this.rc_owner_name;
    }

    public final String component26() {
        return this.rc_c_state;
    }

    public final String component27() {
        return this.rc_chasi_no;
    }

    public final String component28() {
        return this.rc_eng_no;
    }

    public final String component29() {
        return this.rc_mobile_no;
    }

    public final String component3() {
        return this.rc_insurance_upto;
    }

    public final String component30() {
        return this.rc_off_cd;
    }

    public final String component31() {
        return this.rc_owner_sr;
    }

    public final String component32() {
        return this.rc_permanent_address;
    }

    public final String component33() {
        return this.rc_present_address;
    }

    public final String component34() {
        return this.rc_regn_no;
    }

    public final String component35() {
        return this.state_cd;
    }

    public final String component36() {
        return this.rc_vch_catg;
    }

    public final String component37() {
        return this.rc_vh_class_cd;
    }

    public final String component38() {
        return this.vehType;
    }

    public final Integer component39() {
        return this.vehTypeAsInt;
    }

    public final String component4() {
        return this.rc_insurance_comp;
    }

    public final Integer component40() {
        return this.seat_cap;
    }

    public final Integer component41() {
        return this.rc_owner_srNo;
    }

    public final Object component42() {
        return this.pmt_type_code;
    }

    public final Object component43() {
        return this.pmt_catg_code;
    }

    public final String component44() {
        return this.rc_insurance_from;
    }

    public final VTHypthEntity component45() {
        return this.vTHypthEntity;
    }

    public final String component5() {
        return this.rc_insurance_policy_no;
    }

    public final String component6() {
        return this.rc_pucc_upto;
    }

    public final String component7() {
        return this.rc_pucc_no;
    }

    public final String component8() {
        return this.rc_np_upto;
    }

    public final String component9() {
        return this.rc_np_issued_by;
    }

    public final NrvDetails copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, Integer num, Integer num2, Integer num3, Object obj, Object obj2, String str39, VTHypthEntity vTHypthEntity2) {
        return new NrvDetails(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, num, num2, num3, obj, obj2, str39, vTHypthEntity2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NrvDetails)) {
            return false;
        }
        NrvDetails nrvDetails = (NrvDetails) obj;
        return l.a(this.rc_fit_upto, nrvDetails.rc_fit_upto) && l.a(this.rc_financer, nrvDetails.rc_financer) && l.a(this.rc_insurance_upto, nrvDetails.rc_insurance_upto) && l.a(this.rc_insurance_comp, nrvDetails.rc_insurance_comp) && l.a(this.rc_insurance_policy_no, nrvDetails.rc_insurance_policy_no) && l.a(this.rc_pucc_upto, nrvDetails.rc_pucc_upto) && l.a(this.rc_pucc_no, nrvDetails.rc_pucc_no) && l.a(this.rc_np_upto, nrvDetails.rc_np_upto) && l.a(this.rc_np_issued_by, nrvDetails.rc_np_issued_by) && l.a(this.rc_np_no, nrvDetails.rc_np_no) && l.a(this.rc_permit_valid_upto, nrvDetails.rc_permit_valid_upto) && l.a(this.rc_permit_valid_from, nrvDetails.rc_permit_valid_from) && l.a(this.rc_permit_type, nrvDetails.rc_permit_type) && l.a(this.rc_permit_issue_dt, nrvDetails.rc_permit_issue_dt) && l.a(this.rc_permit_no, nrvDetails.rc_permit_no) && l.a(this.rc_tax_upto, nrvDetails.rc_tax_upto) && l.a(this.rc_norms_desc, nrvDetails.rc_norms_desc) && l.a(this.rc_fuel_desc, nrvDetails.rc_fuel_desc) && l.a(this.rc_regn_dt, nrvDetails.rc_regn_dt) && l.a(this.rc_maker_model, nrvDetails.rc_maker_model) && l.a(this.rc_maker_desc, nrvDetails.rc_maker_desc) && l.a(this.rc_vch_catg_desc, nrvDetails.rc_vch_catg_desc) && l.a(this.rc_vh_class_desc, nrvDetails.rc_vh_class_desc) && l.a(this.rc_f_name, nrvDetails.rc_f_name) && l.a(this.rc_owner_name, nrvDetails.rc_owner_name) && l.a(this.rc_c_state, nrvDetails.rc_c_state) && l.a(this.rc_chasi_no, nrvDetails.rc_chasi_no) && l.a(this.rc_eng_no, nrvDetails.rc_eng_no) && l.a(this.rc_mobile_no, nrvDetails.rc_mobile_no) && l.a(this.rc_off_cd, nrvDetails.rc_off_cd) && l.a(this.rc_owner_sr, nrvDetails.rc_owner_sr) && l.a(this.rc_permanent_address, nrvDetails.rc_permanent_address) && l.a(this.rc_present_address, nrvDetails.rc_present_address) && l.a(this.rc_regn_no, nrvDetails.rc_regn_no) && l.a(this.state_cd, nrvDetails.state_cd) && l.a(this.rc_vch_catg, nrvDetails.rc_vch_catg) && l.a(this.rc_vh_class_cd, nrvDetails.rc_vh_class_cd) && l.a(this.vehType, nrvDetails.vehType) && l.a(this.vehTypeAsInt, nrvDetails.vehTypeAsInt) && l.a(this.seat_cap, nrvDetails.seat_cap) && l.a(this.rc_owner_srNo, nrvDetails.rc_owner_srNo) && l.a(this.pmt_type_code, nrvDetails.pmt_type_code) && l.a(this.pmt_catg_code, nrvDetails.pmt_catg_code) && l.a(this.rc_insurance_from, nrvDetails.rc_insurance_from) && l.a(this.vTHypthEntity, nrvDetails.vTHypthEntity);
    }

    public final Object getPmt_catg_code() {
        return this.pmt_catg_code;
    }

    public final Object getPmt_type_code() {
        return this.pmt_type_code;
    }

    public final String getRc_c_state() {
        return this.rc_c_state;
    }

    public final String getRc_chasi_no() {
        return this.rc_chasi_no;
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

    public final String getRc_fuel_desc() {
        return this.rc_fuel_desc;
    }

    public final String getRc_insurance_comp() {
        return this.rc_insurance_comp;
    }

    public final String getRc_insurance_from() {
        return this.rc_insurance_from;
    }

    public final String getRc_insurance_policy_no() {
        return this.rc_insurance_policy_no;
    }

    public final String getRc_insurance_upto() {
        return this.rc_insurance_upto;
    }

    public final String getRc_maker_desc() {
        return this.rc_maker_desc;
    }

    public final String getRc_maker_model() {
        return this.rc_maker_model;
    }

    public final String getRc_mobile_no() {
        return this.rc_mobile_no;
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

    public final Integer getRc_owner_srNo() {
        return this.rc_owner_srNo;
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

    public final String getRc_regn_dt() {
        return this.rc_regn_dt;
    }

    public final String getRc_regn_no() {
        return this.rc_regn_no;
    }

    public final String getRc_tax_upto() {
        return this.rc_tax_upto;
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

    public final Integer getSeat_cap() {
        return this.seat_cap;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final VTHypthEntity getVTHypthEntity() {
        return this.vTHypthEntity;
    }

    public final String getVehType() {
        return this.vehType;
    }

    public final Integer getVehTypeAsInt() {
        return this.vehTypeAsInt;
    }

    public int hashCode() {
        String str = this.rc_fit_upto;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rc_financer;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rc_insurance_upto;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rc_insurance_comp;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rc_insurance_policy_no;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rc_pucc_upto;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.rc_pucc_no;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rc_np_upto;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.rc_np_issued_by;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.rc_np_no;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rc_permit_valid_upto;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.rc_permit_valid_from;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.rc_permit_type;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.rc_permit_issue_dt;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.rc_permit_no;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.rc_tax_upto;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.rc_norms_desc;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.rc_fuel_desc;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.rc_regn_dt;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.rc_maker_model;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.rc_maker_desc;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.rc_vch_catg_desc;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.rc_vh_class_desc;
        int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.rc_f_name;
        int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.rc_owner_name;
        int hashCode25 = (hashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.rc_c_state;
        int hashCode26 = (hashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.rc_chasi_no;
        int hashCode27 = (hashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.rc_eng_no;
        int hashCode28 = (hashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.rc_mobile_no;
        int hashCode29 = (hashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.rc_off_cd;
        int hashCode30 = (hashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.rc_owner_sr;
        int hashCode31 = (hashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.rc_permanent_address;
        int hashCode32 = (hashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.rc_present_address;
        int hashCode33 = (hashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.rc_regn_no;
        int hashCode34 = (hashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.state_cd;
        int hashCode35 = (hashCode34 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.rc_vch_catg;
        int hashCode36 = (hashCode35 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.rc_vh_class_cd;
        int hashCode37 = (hashCode36 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.vehType;
        int hashCode38 = (hashCode37 + (str38 == null ? 0 : str38.hashCode())) * 31;
        Integer num = this.vehTypeAsInt;
        int hashCode39 = (hashCode38 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.seat_cap;
        int hashCode40 = (hashCode39 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.rc_owner_srNo;
        int hashCode41 = (hashCode40 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Object obj = this.pmt_type_code;
        int hashCode42 = (hashCode41 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.pmt_catg_code;
        int hashCode43 = (hashCode42 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str39 = this.rc_insurance_from;
        int hashCode44 = (hashCode43 + (str39 == null ? 0 : str39.hashCode())) * 31;
        VTHypthEntity vTHypthEntity2 = this.vTHypthEntity;
        if (vTHypthEntity2 != null) {
            i10 = vTHypthEntity2.hashCode();
        }
        return hashCode44 + i10;
    }

    public String toString() {
        return "NrvDetails(rc_fit_upto=" + this.rc_fit_upto + ", rc_financer=" + this.rc_financer + ", rc_insurance_upto=" + this.rc_insurance_upto + ", rc_insurance_comp=" + this.rc_insurance_comp + ", rc_insurance_policy_no=" + this.rc_insurance_policy_no + ", rc_pucc_upto=" + this.rc_pucc_upto + ", rc_pucc_no=" + this.rc_pucc_no + ", rc_np_upto=" + this.rc_np_upto + ", rc_np_issued_by=" + this.rc_np_issued_by + ", rc_np_no=" + this.rc_np_no + ", rc_permit_valid_upto=" + this.rc_permit_valid_upto + ", rc_permit_valid_from=" + this.rc_permit_valid_from + ", rc_permit_type=" + this.rc_permit_type + ", rc_permit_issue_dt=" + this.rc_permit_issue_dt + ", rc_permit_no=" + this.rc_permit_no + ", rc_tax_upto=" + this.rc_tax_upto + ", rc_norms_desc=" + this.rc_norms_desc + ", rc_fuel_desc=" + this.rc_fuel_desc + ", rc_regn_dt=" + this.rc_regn_dt + ", rc_maker_model=" + this.rc_maker_model + ", rc_maker_desc=" + this.rc_maker_desc + ", rc_vch_catg_desc=" + this.rc_vch_catg_desc + ", rc_vh_class_desc=" + this.rc_vh_class_desc + ", rc_f_name=" + this.rc_f_name + ", rc_owner_name=" + this.rc_owner_name + ", rc_c_state=" + this.rc_c_state + ", rc_chasi_no=" + this.rc_chasi_no + ", rc_eng_no=" + this.rc_eng_no + ", rc_mobile_no=" + this.rc_mobile_no + ", rc_off_cd=" + this.rc_off_cd + ", rc_owner_sr=" + this.rc_owner_sr + ", rc_permanent_address=" + this.rc_permanent_address + ", rc_present_address=" + this.rc_present_address + ", rc_regn_no=" + this.rc_regn_no + ", state_cd=" + this.state_cd + ", rc_vch_catg=" + this.rc_vch_catg + ", rc_vh_class_cd=" + this.rc_vh_class_cd + ", vehType=" + this.vehType + ", vehTypeAsInt=" + this.vehTypeAsInt + ", seat_cap=" + this.seat_cap + ", rc_owner_srNo=" + this.rc_owner_srNo + ", pmt_type_code=" + this.pmt_type_code + ", pmt_catg_code=" + this.pmt_catg_code + ", rc_insurance_from=" + this.rc_insurance_from + ", vTHypthEntity=" + this.vTHypthEntity + ')';
    }
}
