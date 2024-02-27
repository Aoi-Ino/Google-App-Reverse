package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;
import java.util.List;

@Keep
public final class TaxDataFormat {
    private final String ac_fitted;
    private final Object appl_no;
    private final String audio_fitted;
    private final int cubic_cap;
    private final Object dialogValue;
    private final int distance_run_in_quarter;
    private final int domain_cd;
    private final int fin_yr_sale_amt;
    private final int floor_area;
    private final int fuel;
    private final int gcw;
    private final Object goods_to_carry;
    private final int height;

    /* renamed from: hp  reason: collision with root package name */
    private final int f20463hp;
    private final String imported_vch;
    private final Object issue_dt;
    private final Object jorney_purpose;
    private final int ld_wt;
    private final int length;
    private final ArrayList<TaxModes> listTaxModes;
    private final String no_adv_units;
    private final int no_cyl;
    private final int no_of_trips;
    private final Object off_cd;
    private final long op_dt;
    private final int other_criteria;
    private final Object parking;
    private final int pmt_catg;
    private final Object pmt_no;
    private final int pmt_type;
    private final String pur_cd;
    private final String pur_descr;
    private final long purchase_dt;
    private final Object rcpt_no;
    private final Object region_covered;
    private final String regn_no;
    private final String regn_type;
    private final Object remarks;
    private final boolean renderForm;
    private final Object replace_date;
    private final int route_class;
    private final int route_length;
    private final int sale_amt;
    private final int seat_cap;
    private final int service_type;
    private final int sleeper_cap;
    private final int stand_cap;
    private final Object state_cd;
    private final boolean taxBased;
    private final List<TaxPurCdDescr> taxPurCdDesc;
    private final int unld_wt;
    private final Object valid_from;
    private final Object valid_upto;
    private final String vch_catg;
    private final String vch_purchase_as;
    private final int vh_class;
    private final String video_fitted;
    private final int wheelbase;
    private final int width;

    public TaxDataFormat(String str, Object obj, String str2, int i10, Object obj2, int i11, int i12, int i13, int i14, int i15, int i16, Object obj3, int i17, int i18, String str3, Object obj4, Object obj5, int i19, int i20, ArrayList<TaxModes> arrayList, String str4, int i21, int i22, Object obj6, long j10, int i23, Object obj7, int i24, Object obj8, int i25, String str5, String str6, long j11, Object obj9, Object obj10, String str7, String str8, Object obj11, boolean z10, Object obj12, int i26, int i27, int i28, int i29, int i30, int i31, int i32, Object obj13, boolean z11, List<TaxPurCdDescr> list, int i33, Object obj14, Object obj15, String str9, String str10, int i34, String str11, int i35, int i36) {
        l.f(obj3, "goods_to_carry");
        this.ac_fitted = str;
        this.appl_no = obj;
        this.audio_fitted = str2;
        this.cubic_cap = i10;
        this.dialogValue = obj2;
        this.distance_run_in_quarter = i11;
        this.domain_cd = i12;
        this.fin_yr_sale_amt = i13;
        this.floor_area = i14;
        this.fuel = i15;
        this.gcw = i16;
        this.goods_to_carry = obj3;
        this.height = i17;
        this.f20463hp = i18;
        this.imported_vch = str3;
        this.issue_dt = obj4;
        this.jorney_purpose = obj5;
        this.ld_wt = i19;
        this.length = i20;
        this.listTaxModes = arrayList;
        this.no_adv_units = str4;
        this.no_cyl = i21;
        this.no_of_trips = i22;
        this.off_cd = obj6;
        this.op_dt = j10;
        this.other_criteria = i23;
        this.parking = obj7;
        this.pmt_catg = i24;
        this.pmt_no = obj8;
        this.pmt_type = i25;
        this.pur_cd = str5;
        this.pur_descr = str6;
        this.purchase_dt = j11;
        this.rcpt_no = obj9;
        this.region_covered = obj10;
        this.regn_no = str7;
        this.regn_type = str8;
        this.remarks = obj11;
        this.renderForm = z10;
        this.replace_date = obj12;
        this.route_class = i26;
        this.route_length = i27;
        this.sale_amt = i28;
        this.seat_cap = i29;
        this.service_type = i30;
        this.sleeper_cap = i31;
        this.stand_cap = i32;
        this.state_cd = obj13;
        this.taxBased = z11;
        this.taxPurCdDesc = list;
        this.unld_wt = i33;
        this.valid_from = obj14;
        this.valid_upto = obj15;
        this.vch_catg = str9;
        this.vch_purchase_as = str10;
        this.vh_class = i34;
        this.video_fitted = str11;
        this.wheelbase = i35;
        this.width = i36;
    }

    public static /* synthetic */ TaxDataFormat copy$default(TaxDataFormat taxDataFormat, String str, Object obj, String str2, int i10, Object obj2, int i11, int i12, int i13, int i14, int i15, int i16, Object obj3, int i17, int i18, String str3, Object obj4, Object obj5, int i19, int i20, ArrayList arrayList, String str4, int i21, int i22, Object obj6, long j10, int i23, Object obj7, int i24, Object obj8, int i25, String str5, String str6, long j11, Object obj9, Object obj10, String str7, String str8, Object obj11, boolean z10, Object obj12, int i26, int i27, int i28, int i29, int i30, int i31, int i32, Object obj13, boolean z11, List list, int i33, Object obj14, Object obj15, String str9, String str10, int i34, String str11, int i35, int i36, int i37, int i38, Object obj16) {
        TaxDataFormat taxDataFormat2 = taxDataFormat;
        int i39 = i37;
        int i40 = i38;
        String str12 = (i39 & 1) != 0 ? taxDataFormat2.ac_fitted : str;
        Object obj17 = (i39 & 2) != 0 ? taxDataFormat2.appl_no : obj;
        String str13 = (i39 & 4) != 0 ? taxDataFormat2.audio_fitted : str2;
        int i41 = (i39 & 8) != 0 ? taxDataFormat2.cubic_cap : i10;
        Object obj18 = (i39 & 16) != 0 ? taxDataFormat2.dialogValue : obj2;
        int i42 = (i39 & 32) != 0 ? taxDataFormat2.distance_run_in_quarter : i11;
        int i43 = (i39 & 64) != 0 ? taxDataFormat2.domain_cd : i12;
        int i44 = (i39 & 128) != 0 ? taxDataFormat2.fin_yr_sale_amt : i13;
        int i45 = (i39 & 256) != 0 ? taxDataFormat2.floor_area : i14;
        int i46 = (i39 & 512) != 0 ? taxDataFormat2.fuel : i15;
        int i47 = (i39 & 1024) != 0 ? taxDataFormat2.gcw : i16;
        Object obj19 = (i39 & 2048) != 0 ? taxDataFormat2.goods_to_carry : obj3;
        return taxDataFormat.copy(str12, obj17, str13, i41, obj18, i42, i43, i44, i45, i46, i47, obj19, (i39 & 4096) != 0 ? taxDataFormat2.height : i17, (i39 & 8192) != 0 ? taxDataFormat2.f20463hp : i18, (i39 & 16384) != 0 ? taxDataFormat2.imported_vch : str3, (i39 & 32768) != 0 ? taxDataFormat2.issue_dt : obj4, (i39 & 65536) != 0 ? taxDataFormat2.jorney_purpose : obj5, (i39 & 131072) != 0 ? taxDataFormat2.ld_wt : i19, (i39 & 262144) != 0 ? taxDataFormat2.length : i20, (i39 & 524288) != 0 ? taxDataFormat2.listTaxModes : arrayList, (i39 & 1048576) != 0 ? taxDataFormat2.no_adv_units : str4, (i39 & 2097152) != 0 ? taxDataFormat2.no_cyl : i21, (i39 & 4194304) != 0 ? taxDataFormat2.no_of_trips : i22, (i39 & 8388608) != 0 ? taxDataFormat2.off_cd : obj6, (i39 & 16777216) != 0 ? taxDataFormat2.op_dt : j10, (i39 & 33554432) != 0 ? taxDataFormat2.other_criteria : i23, (67108864 & i39) != 0 ? taxDataFormat2.parking : obj7, (i39 & 134217728) != 0 ? taxDataFormat2.pmt_catg : i24, (i39 & 268435456) != 0 ? taxDataFormat2.pmt_no : obj8, (i39 & 536870912) != 0 ? taxDataFormat2.pmt_type : i25, (i39 & 1073741824) != 0 ? taxDataFormat2.pur_cd : str5, (i39 & Integer.MIN_VALUE) != 0 ? taxDataFormat2.pur_descr : str6, (i40 & 1) != 0 ? taxDataFormat2.purchase_dt : j11, (i40 & 2) != 0 ? taxDataFormat2.rcpt_no : obj9, (i40 & 4) != 0 ? taxDataFormat2.region_covered : obj10, (i40 & 8) != 0 ? taxDataFormat2.regn_no : str7, (i40 & 16) != 0 ? taxDataFormat2.regn_type : str8, (i40 & 32) != 0 ? taxDataFormat2.remarks : obj11, (i40 & 64) != 0 ? taxDataFormat2.renderForm : z10, (i40 & 128) != 0 ? taxDataFormat2.replace_date : obj12, (i40 & 256) != 0 ? taxDataFormat2.route_class : i26, (i40 & 512) != 0 ? taxDataFormat2.route_length : i27, (i40 & 1024) != 0 ? taxDataFormat2.sale_amt : i28, (i40 & 2048) != 0 ? taxDataFormat2.seat_cap : i29, (i40 & 4096) != 0 ? taxDataFormat2.service_type : i30, (i40 & 8192) != 0 ? taxDataFormat2.sleeper_cap : i31, (i40 & 16384) != 0 ? taxDataFormat2.stand_cap : i32, (i40 & 32768) != 0 ? taxDataFormat2.state_cd : obj13, (i40 & 65536) != 0 ? taxDataFormat2.taxBased : z11, (i40 & 131072) != 0 ? taxDataFormat2.taxPurCdDesc : list, (i40 & 262144) != 0 ? taxDataFormat2.unld_wt : i33, (i40 & 524288) != 0 ? taxDataFormat2.valid_from : obj14, (i40 & 1048576) != 0 ? taxDataFormat2.valid_upto : obj15, (i40 & 2097152) != 0 ? taxDataFormat2.vch_catg : str9, (i40 & 4194304) != 0 ? taxDataFormat2.vch_purchase_as : str10, (i40 & 8388608) != 0 ? taxDataFormat2.vh_class : i34, (i40 & 16777216) != 0 ? taxDataFormat2.video_fitted : str11, (i40 & 33554432) != 0 ? taxDataFormat2.wheelbase : i35, (i40 & 67108864) != 0 ? taxDataFormat2.width : i36);
    }

    public final String component1() {
        return this.ac_fitted;
    }

    public final int component10() {
        return this.fuel;
    }

    public final int component11() {
        return this.gcw;
    }

    public final Object component12() {
        return this.goods_to_carry;
    }

    public final int component13() {
        return this.height;
    }

    public final int component14() {
        return this.f20463hp;
    }

    public final String component15() {
        return this.imported_vch;
    }

    public final Object component16() {
        return this.issue_dt;
    }

    public final Object component17() {
        return this.jorney_purpose;
    }

    public final int component18() {
        return this.ld_wt;
    }

    public final int component19() {
        return this.length;
    }

    public final Object component2() {
        return this.appl_no;
    }

    public final ArrayList<TaxModes> component20() {
        return this.listTaxModes;
    }

    public final String component21() {
        return this.no_adv_units;
    }

    public final int component22() {
        return this.no_cyl;
    }

    public final int component23() {
        return this.no_of_trips;
    }

    public final Object component24() {
        return this.off_cd;
    }

    public final long component25() {
        return this.op_dt;
    }

    public final int component26() {
        return this.other_criteria;
    }

    public final Object component27() {
        return this.parking;
    }

    public final int component28() {
        return this.pmt_catg;
    }

    public final Object component29() {
        return this.pmt_no;
    }

    public final String component3() {
        return this.audio_fitted;
    }

    public final int component30() {
        return this.pmt_type;
    }

    public final String component31() {
        return this.pur_cd;
    }

    public final String component32() {
        return this.pur_descr;
    }

    public final long component33() {
        return this.purchase_dt;
    }

    public final Object component34() {
        return this.rcpt_no;
    }

    public final Object component35() {
        return this.region_covered;
    }

    public final String component36() {
        return this.regn_no;
    }

    public final String component37() {
        return this.regn_type;
    }

    public final Object component38() {
        return this.remarks;
    }

    public final boolean component39() {
        return this.renderForm;
    }

    public final int component4() {
        return this.cubic_cap;
    }

    public final Object component40() {
        return this.replace_date;
    }

    public final int component41() {
        return this.route_class;
    }

    public final int component42() {
        return this.route_length;
    }

    public final int component43() {
        return this.sale_amt;
    }

    public final int component44() {
        return this.seat_cap;
    }

    public final int component45() {
        return this.service_type;
    }

    public final int component46() {
        return this.sleeper_cap;
    }

    public final int component47() {
        return this.stand_cap;
    }

    public final Object component48() {
        return this.state_cd;
    }

    public final boolean component49() {
        return this.taxBased;
    }

    public final Object component5() {
        return this.dialogValue;
    }

    public final List<TaxPurCdDescr> component50() {
        return this.taxPurCdDesc;
    }

    public final int component51() {
        return this.unld_wt;
    }

    public final Object component52() {
        return this.valid_from;
    }

    public final Object component53() {
        return this.valid_upto;
    }

    public final String component54() {
        return this.vch_catg;
    }

    public final String component55() {
        return this.vch_purchase_as;
    }

    public final int component56() {
        return this.vh_class;
    }

    public final String component57() {
        return this.video_fitted;
    }

    public final int component58() {
        return this.wheelbase;
    }

    public final int component59() {
        return this.width;
    }

    public final int component6() {
        return this.distance_run_in_quarter;
    }

    public final int component7() {
        return this.domain_cd;
    }

    public final int component8() {
        return this.fin_yr_sale_amt;
    }

    public final int component9() {
        return this.floor_area;
    }

    public final TaxDataFormat copy(String str, Object obj, String str2, int i10, Object obj2, int i11, int i12, int i13, int i14, int i15, int i16, Object obj3, int i17, int i18, String str3, Object obj4, Object obj5, int i19, int i20, ArrayList<TaxModes> arrayList, String str4, int i21, int i22, Object obj6, long j10, int i23, Object obj7, int i24, Object obj8, int i25, String str5, String str6, long j11, Object obj9, Object obj10, String str7, String str8, Object obj11, boolean z10, Object obj12, int i26, int i27, int i28, int i29, int i30, int i31, int i32, Object obj13, boolean z11, List<TaxPurCdDescr> list, int i33, Object obj14, Object obj15, String str9, String str10, int i34, String str11, int i35, int i36) {
        String str12 = str;
        l.f(obj3, "goods_to_carry");
        return new TaxDataFormat(str, obj, str2, i10, obj2, i11, i12, i13, i14, i15, i16, obj3, i17, i18, str3, obj4, obj5, i19, i20, arrayList, str4, i21, i22, obj6, j10, i23, obj7, i24, obj8, i25, str5, str6, j11, obj9, obj10, str7, str8, obj11, z10, obj12, i26, i27, i28, i29, i30, i31, i32, obj13, z11, list, i33, obj14, obj15, str9, str10, i34, str11, i35, i36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxDataFormat)) {
            return false;
        }
        TaxDataFormat taxDataFormat = (TaxDataFormat) obj;
        return l.a(this.ac_fitted, taxDataFormat.ac_fitted) && l.a(this.appl_no, taxDataFormat.appl_no) && l.a(this.audio_fitted, taxDataFormat.audio_fitted) && this.cubic_cap == taxDataFormat.cubic_cap && l.a(this.dialogValue, taxDataFormat.dialogValue) && this.distance_run_in_quarter == taxDataFormat.distance_run_in_quarter && this.domain_cd == taxDataFormat.domain_cd && this.fin_yr_sale_amt == taxDataFormat.fin_yr_sale_amt && this.floor_area == taxDataFormat.floor_area && this.fuel == taxDataFormat.fuel && this.gcw == taxDataFormat.gcw && l.a(this.goods_to_carry, taxDataFormat.goods_to_carry) && this.height == taxDataFormat.height && this.f20463hp == taxDataFormat.f20463hp && l.a(this.imported_vch, taxDataFormat.imported_vch) && l.a(this.issue_dt, taxDataFormat.issue_dt) && l.a(this.jorney_purpose, taxDataFormat.jorney_purpose) && this.ld_wt == taxDataFormat.ld_wt && this.length == taxDataFormat.length && l.a(this.listTaxModes, taxDataFormat.listTaxModes) && l.a(this.no_adv_units, taxDataFormat.no_adv_units) && this.no_cyl == taxDataFormat.no_cyl && this.no_of_trips == taxDataFormat.no_of_trips && l.a(this.off_cd, taxDataFormat.off_cd) && this.op_dt == taxDataFormat.op_dt && this.other_criteria == taxDataFormat.other_criteria && l.a(this.parking, taxDataFormat.parking) && this.pmt_catg == taxDataFormat.pmt_catg && l.a(this.pmt_no, taxDataFormat.pmt_no) && this.pmt_type == taxDataFormat.pmt_type && l.a(this.pur_cd, taxDataFormat.pur_cd) && l.a(this.pur_descr, taxDataFormat.pur_descr) && this.purchase_dt == taxDataFormat.purchase_dt && l.a(this.rcpt_no, taxDataFormat.rcpt_no) && l.a(this.region_covered, taxDataFormat.region_covered) && l.a(this.regn_no, taxDataFormat.regn_no) && l.a(this.regn_type, taxDataFormat.regn_type) && l.a(this.remarks, taxDataFormat.remarks) && this.renderForm == taxDataFormat.renderForm && l.a(this.replace_date, taxDataFormat.replace_date) && this.route_class == taxDataFormat.route_class && this.route_length == taxDataFormat.route_length && this.sale_amt == taxDataFormat.sale_amt && this.seat_cap == taxDataFormat.seat_cap && this.service_type == taxDataFormat.service_type && this.sleeper_cap == taxDataFormat.sleeper_cap && this.stand_cap == taxDataFormat.stand_cap && l.a(this.state_cd, taxDataFormat.state_cd) && this.taxBased == taxDataFormat.taxBased && l.a(this.taxPurCdDesc, taxDataFormat.taxPurCdDesc) && this.unld_wt == taxDataFormat.unld_wt && l.a(this.valid_from, taxDataFormat.valid_from) && l.a(this.valid_upto, taxDataFormat.valid_upto) && l.a(this.vch_catg, taxDataFormat.vch_catg) && l.a(this.vch_purchase_as, taxDataFormat.vch_purchase_as) && this.vh_class == taxDataFormat.vh_class && l.a(this.video_fitted, taxDataFormat.video_fitted) && this.wheelbase == taxDataFormat.wheelbase && this.width == taxDataFormat.width;
    }

    public final String getAc_fitted() {
        return this.ac_fitted;
    }

    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final String getAudio_fitted() {
        return this.audio_fitted;
    }

    public final int getCubic_cap() {
        return this.cubic_cap;
    }

    public final Object getDialogValue() {
        return this.dialogValue;
    }

    public final int getDistance_run_in_quarter() {
        return this.distance_run_in_quarter;
    }

    public final int getDomain_cd() {
        return this.domain_cd;
    }

    public final int getFin_yr_sale_amt() {
        return this.fin_yr_sale_amt;
    }

    public final int getFloor_area() {
        return this.floor_area;
    }

    public final int getFuel() {
        return this.fuel;
    }

    public final int getGcw() {
        return this.gcw;
    }

    public final Object getGoods_to_carry() {
        return this.goods_to_carry;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getHp() {
        return this.f20463hp;
    }

    public final String getImported_vch() {
        return this.imported_vch;
    }

    public final Object getIssue_dt() {
        return this.issue_dt;
    }

    public final Object getJorney_purpose() {
        return this.jorney_purpose;
    }

    public final int getLd_wt() {
        return this.ld_wt;
    }

    public final int getLength() {
        return this.length;
    }

    public final ArrayList<TaxModes> getListTaxModes() {
        return this.listTaxModes;
    }

    public final String getNo_adv_units() {
        return this.no_adv_units;
    }

    public final int getNo_cyl() {
        return this.no_cyl;
    }

    public final int getNo_of_trips() {
        return this.no_of_trips;
    }

    public final Object getOff_cd() {
        return this.off_cd;
    }

    public final long getOp_dt() {
        return this.op_dt;
    }

    public final int getOther_criteria() {
        return this.other_criteria;
    }

    public final Object getParking() {
        return this.parking;
    }

    public final int getPmt_catg() {
        return this.pmt_catg;
    }

    public final Object getPmt_no() {
        return this.pmt_no;
    }

    public final int getPmt_type() {
        return this.pmt_type;
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final String getPur_descr() {
        return this.pur_descr;
    }

    public final long getPurchase_dt() {
        return this.purchase_dt;
    }

    public final Object getRcpt_no() {
        return this.rcpt_no;
    }

    public final Object getRegion_covered() {
        return this.region_covered;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getRegn_type() {
        return this.regn_type;
    }

    public final Object getRemarks() {
        return this.remarks;
    }

    public final boolean getRenderForm() {
        return this.renderForm;
    }

    public final Object getReplace_date() {
        return this.replace_date;
    }

    public final int getRoute_class() {
        return this.route_class;
    }

    public final int getRoute_length() {
        return this.route_length;
    }

    public final int getSale_amt() {
        return this.sale_amt;
    }

    public final int getSeat_cap() {
        return this.seat_cap;
    }

    public final int getService_type() {
        return this.service_type;
    }

    public final int getSleeper_cap() {
        return this.sleeper_cap;
    }

    public final int getStand_cap() {
        return this.stand_cap;
    }

    public final Object getState_cd() {
        return this.state_cd;
    }

    public final boolean getTaxBased() {
        return this.taxBased;
    }

    public final List<TaxPurCdDescr> getTaxPurCdDesc() {
        return this.taxPurCdDesc;
    }

    public final int getUnld_wt() {
        return this.unld_wt;
    }

    public final Object getValid_from() {
        return this.valid_from;
    }

    public final Object getValid_upto() {
        return this.valid_upto;
    }

    public final String getVch_catg() {
        return this.vch_catg;
    }

    public final String getVch_purchase_as() {
        return this.vch_purchase_as;
    }

    public final int getVh_class() {
        return this.vh_class;
    }

    public final String getVideo_fitted() {
        return this.video_fitted;
    }

    public final int getWheelbase() {
        return this.wheelbase;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.ac_fitted;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.appl_no;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.audio_fitted;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.cubic_cap)) * 31;
        Object obj2 = this.dialogValue;
        int hashCode4 = (((((((((((((((((((hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31) + Integer.hashCode(this.distance_run_in_quarter)) * 31) + Integer.hashCode(this.domain_cd)) * 31) + Integer.hashCode(this.fin_yr_sale_amt)) * 31) + Integer.hashCode(this.floor_area)) * 31) + Integer.hashCode(this.fuel)) * 31) + Integer.hashCode(this.gcw)) * 31) + this.goods_to_carry.hashCode()) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.f20463hp)) * 31;
        String str3 = this.imported_vch;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj3 = this.issue_dt;
        int hashCode6 = (hashCode5 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.jorney_purpose;
        int hashCode7 = (((((hashCode6 + (obj4 == null ? 0 : obj4.hashCode())) * 31) + Integer.hashCode(this.ld_wt)) * 31) + Integer.hashCode(this.length)) * 31;
        ArrayList<TaxModes> arrayList = this.listTaxModes;
        int hashCode8 = (hashCode7 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str4 = this.no_adv_units;
        int hashCode9 = (((((hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.no_cyl)) * 31) + Integer.hashCode(this.no_of_trips)) * 31;
        Object obj5 = this.off_cd;
        int hashCode10 = (((((hashCode9 + (obj5 == null ? 0 : obj5.hashCode())) * 31) + Long.hashCode(this.op_dt)) * 31) + Integer.hashCode(this.other_criteria)) * 31;
        Object obj6 = this.parking;
        int hashCode11 = (((hashCode10 + (obj6 == null ? 0 : obj6.hashCode())) * 31) + Integer.hashCode(this.pmt_catg)) * 31;
        Object obj7 = this.pmt_no;
        int hashCode12 = (((hashCode11 + (obj7 == null ? 0 : obj7.hashCode())) * 31) + Integer.hashCode(this.pmt_type)) * 31;
        String str5 = this.pur_cd;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pur_descr;
        int hashCode14 = (((hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31) + Long.hashCode(this.purchase_dt)) * 31;
        Object obj8 = this.rcpt_no;
        int hashCode15 = (hashCode14 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.region_covered;
        int hashCode16 = (hashCode15 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        String str7 = this.regn_no;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.regn_type;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Object obj10 = this.remarks;
        int hashCode19 = (hashCode18 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        boolean z10 = this.renderForm;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i11 = (hashCode19 + (z10 ? 1 : 0)) * 31;
        Object obj11 = this.replace_date;
        int hashCode20 = (((((((((((((((i11 + (obj11 == null ? 0 : obj11.hashCode())) * 31) + Integer.hashCode(this.route_class)) * 31) + Integer.hashCode(this.route_length)) * 31) + Integer.hashCode(this.sale_amt)) * 31) + Integer.hashCode(this.seat_cap)) * 31) + Integer.hashCode(this.service_type)) * 31) + Integer.hashCode(this.sleeper_cap)) * 31) + Integer.hashCode(this.stand_cap)) * 31;
        Object obj12 = this.state_cd;
        int hashCode21 = (hashCode20 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        boolean z12 = this.taxBased;
        if (!z12) {
            z11 = z12;
        }
        int i12 = (hashCode21 + (z11 ? 1 : 0)) * 31;
        List<TaxPurCdDescr> list = this.taxPurCdDesc;
        int hashCode22 = (((i12 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.unld_wt)) * 31;
        Object obj13 = this.valid_from;
        int hashCode23 = (hashCode22 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
        Object obj14 = this.valid_upto;
        int hashCode24 = (hashCode23 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
        String str9 = this.vch_catg;
        int hashCode25 = (hashCode24 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.vch_purchase_as;
        int hashCode26 = (((hashCode25 + (str10 == null ? 0 : str10.hashCode())) * 31) + Integer.hashCode(this.vh_class)) * 31;
        String str11 = this.video_fitted;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return ((((hashCode26 + i10) * 31) + Integer.hashCode(this.wheelbase)) * 31) + Integer.hashCode(this.width);
    }

    public String toString() {
        return "TaxDataFormat(ac_fitted=" + this.ac_fitted + ", appl_no=" + this.appl_no + ", audio_fitted=" + this.audio_fitted + ", cubic_cap=" + this.cubic_cap + ", dialogValue=" + this.dialogValue + ", distance_run_in_quarter=" + this.distance_run_in_quarter + ", domain_cd=" + this.domain_cd + ", fin_yr_sale_amt=" + this.fin_yr_sale_amt + ", floor_area=" + this.floor_area + ", fuel=" + this.fuel + ", gcw=" + this.gcw + ", goods_to_carry=" + this.goods_to_carry + ", height=" + this.height + ", hp=" + this.f20463hp + ", imported_vch=" + this.imported_vch + ", issue_dt=" + this.issue_dt + ", jorney_purpose=" + this.jorney_purpose + ", ld_wt=" + this.ld_wt + ", length=" + this.length + ", listTaxModes=" + this.listTaxModes + ", no_adv_units=" + this.no_adv_units + ", no_cyl=" + this.no_cyl + ", no_of_trips=" + this.no_of_trips + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", other_criteria=" + this.other_criteria + ", parking=" + this.parking + ", pmt_catg=" + this.pmt_catg + ", pmt_no=" + this.pmt_no + ", pmt_type=" + this.pmt_type + ", pur_cd=" + this.pur_cd + ", pur_descr=" + this.pur_descr + ", purchase_dt=" + this.purchase_dt + ", rcpt_no=" + this.rcpt_no + ", region_covered=" + this.region_covered + ", regn_no=" + this.regn_no + ", regn_type=" + this.regn_type + ", remarks=" + this.remarks + ", renderForm=" + this.renderForm + ", replace_date=" + this.replace_date + ", route_class=" + this.route_class + ", route_length=" + this.route_length + ", sale_amt=" + this.sale_amt + ", seat_cap=" + this.seat_cap + ", service_type=" + this.service_type + ", sleeper_cap=" + this.sleeper_cap + ", stand_cap=" + this.stand_cap + ", state_cd=" + this.state_cd + ", taxBased=" + this.taxBased + ", taxPurCdDesc=" + this.taxPurCdDesc + ", unld_wt=" + this.unld_wt + ", valid_from=" + this.valid_from + ", valid_upto=" + this.valid_upto + ", vch_catg=" + this.vch_catg + ", vch_purchase_as=" + this.vch_purchase_as + ", vh_class=" + this.vh_class + ", video_fitted=" + this.video_fitted + ", wheelbase=" + this.wheelbase + ", width=" + this.width + ')';
    }
}
