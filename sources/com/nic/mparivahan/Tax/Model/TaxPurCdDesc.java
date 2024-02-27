package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class TaxPurCdDesc {
    private final String ac_fitted;
    private final String appl_no;
    private final String audio_fitted;
    private final int cubic_cap;
    private final String dialogValue;
    private final int distance_run_in_quarter;
    private final int domain_cd;
    private final int fin_yr_sale_amt;
    private final int floor_area;
    private final int fuel;
    private final int gcw;
    private final String goods_to_carry;
    private final int height;

    /* renamed from: hp  reason: collision with root package name */
    private final int f20465hp;
    private final String imported_vch;
    private final String issue_dt;
    private final String jorney_purpose;
    private final int ld_wt;
    private final int length;
    private final ArrayList<Object> listTaxModes;
    private final String no_adv_units;
    private final int no_cyl;
    private final int no_of_trips;
    private final int off_cd;
    private final String op_dt;
    private final int other_criteria;
    private final String parking;
    private final int pmt_catg;
    private final String pmt_no;
    private final int pmt_type;
    private final int pur_cd;
    private final String pur_descr;
    private final String purchase_dt;
    private final String rcpt_no;
    private final String region_covered;
    private final String regn_no;
    private final String regn_type;
    private final String remarks;
    private final boolean renderForm;
    private final String replace_date;
    private final int route_class;
    private final int route_length;
    private final int sale_amt;
    private final int seat_cap;
    private final int service_type;
    private final int sleeper_cap;
    private final int stand_cap;
    private final String state_cd;
    private final boolean taxBased;
    private final a taxPurCdDescr;
    private final int unld_wt;
    private final String valid_from;
    private final String valid_upto;
    private final String vch_catg;
    private final String vch_purchase_as;
    private final int vh_class;
    private final String video_fitted;
    private final int wheelbase;
    private final int width;

    public static final class a {
    }

    public TaxPurCdDesc(String str, String str2, String str3, int i10, String str4, int i11, int i12, int i13, int i14, int i15, int i16, String str5, int i17, int i18, String str6, String str7, String str8, int i19, int i20, ArrayList<Object> arrayList, String str9, int i21, int i22, int i23, String str10, int i24, String str11, int i25, String str12, int i26, int i27, String str13, String str14, String str15, String str16, String str17, String str18, String str19, boolean z10, String str20, int i28, int i29, int i30, int i31, int i32, int i33, int i34, String str21, boolean z11, a aVar, int i35, String str22, String str23, String str24, String str25, int i36, String str26, int i37, int i38) {
        String str27 = str;
        String str28 = str2;
        String str29 = str3;
        String str30 = str4;
        String str31 = str5;
        String str32 = str6;
        String str33 = str7;
        String str34 = str8;
        ArrayList<Object> arrayList2 = arrayList;
        String str35 = str9;
        String str36 = str10;
        String str37 = str11;
        String str38 = str12;
        String str39 = str13;
        String str40 = str15;
        l.f(str27, "ac_fitted");
        l.f(str28, "appl_no");
        l.f(str29, "audio_fitted");
        l.f(str30, "dialogValue");
        l.f(str31, "goods_to_carry");
        l.f(str32, "imported_vch");
        l.f(str33, "issue_dt");
        l.f(str34, "jorney_purpose");
        l.f(arrayList2, "listTaxModes");
        l.f(str35, "no_adv_units");
        l.f(str36, "op_dt");
        l.f(str37, "parking");
        l.f(str38, "pmt_no");
        l.f(str39, "pur_descr");
        l.f(str14, "purchase_dt");
        l.f(str15, "rcpt_no");
        l.f(str16, "region_covered");
        l.f(str17, "regn_no");
        l.f(str18, "regn_type");
        l.f(str19, "remarks");
        l.f(str20, "replace_date");
        l.f(str21, "state_cd");
        l.f(aVar, "taxPurCdDescr");
        l.f(str22, "valid_from");
        l.f(str23, "valid_upto");
        l.f(str24, "vch_catg");
        l.f(str25, "vch_purchase_as");
        l.f(str26, "video_fitted");
        this.ac_fitted = str27;
        this.appl_no = str28;
        this.audio_fitted = str29;
        this.cubic_cap = i10;
        this.dialogValue = str30;
        this.distance_run_in_quarter = i11;
        this.domain_cd = i12;
        this.fin_yr_sale_amt = i13;
        this.floor_area = i14;
        this.fuel = i15;
        this.gcw = i16;
        this.goods_to_carry = str31;
        this.height = i17;
        this.f20465hp = i18;
        this.imported_vch = str32;
        this.issue_dt = str33;
        this.jorney_purpose = str34;
        this.ld_wt = i19;
        this.length = i20;
        this.listTaxModes = arrayList2;
        this.no_adv_units = str35;
        this.no_cyl = i21;
        this.no_of_trips = i22;
        this.off_cd = i23;
        this.op_dt = str36;
        this.other_criteria = i24;
        this.parking = str37;
        this.pmt_catg = i25;
        this.pmt_no = str38;
        this.pmt_type = i26;
        this.pur_cd = i27;
        this.pur_descr = str39;
        this.purchase_dt = str14;
        this.rcpt_no = str15;
        this.region_covered = str16;
        this.regn_no = str17;
        this.regn_type = str18;
        this.remarks = str19;
        this.renderForm = z10;
        this.replace_date = str20;
        this.route_class = i28;
        this.route_length = i29;
        this.sale_amt = i30;
        this.seat_cap = i31;
        this.service_type = i32;
        this.sleeper_cap = i33;
        this.stand_cap = i34;
        this.state_cd = str21;
        this.taxBased = z11;
        this.unld_wt = i35;
        this.valid_from = str22;
        this.valid_upto = str23;
        this.vch_catg = str24;
        this.vch_purchase_as = str25;
        this.vh_class = i36;
        this.video_fitted = str26;
        this.wheelbase = i37;
        this.width = i38;
    }

    public static /* synthetic */ TaxPurCdDesc copy$default(TaxPurCdDesc taxPurCdDesc, String str, String str2, String str3, int i10, String str4, int i11, int i12, int i13, int i14, int i15, int i16, String str5, int i17, int i18, String str6, String str7, String str8, int i19, int i20, ArrayList arrayList, String str9, int i21, int i22, int i23, String str10, int i24, String str11, int i25, String str12, int i26, int i27, String str13, String str14, String str15, String str16, String str17, String str18, String str19, boolean z10, String str20, int i28, int i29, int i30, int i31, int i32, int i33, int i34, String str21, boolean z11, a aVar, int i35, String str22, String str23, String str24, String str25, int i36, String str26, int i37, int i38, int i39, int i40, Object obj) {
        a aVar2;
        TaxPurCdDesc taxPurCdDesc2 = taxPurCdDesc;
        int i41 = i39;
        int i42 = i40;
        String str27 = (i41 & 1) != 0 ? taxPurCdDesc2.ac_fitted : str;
        String str28 = (i41 & 2) != 0 ? taxPurCdDesc2.appl_no : str2;
        String str29 = (i41 & 4) != 0 ? taxPurCdDesc2.audio_fitted : str3;
        int i43 = (i41 & 8) != 0 ? taxPurCdDesc2.cubic_cap : i10;
        String str30 = (i41 & 16) != 0 ? taxPurCdDesc2.dialogValue : str4;
        int i44 = (i41 & 32) != 0 ? taxPurCdDesc2.distance_run_in_quarter : i11;
        int i45 = (i41 & 64) != 0 ? taxPurCdDesc2.domain_cd : i12;
        int i46 = (i41 & 128) != 0 ? taxPurCdDesc2.fin_yr_sale_amt : i13;
        int i47 = (i41 & 256) != 0 ? taxPurCdDesc2.floor_area : i14;
        int i48 = (i41 & 512) != 0 ? taxPurCdDesc2.fuel : i15;
        int i49 = (i41 & 1024) != 0 ? taxPurCdDesc2.gcw : i16;
        String str31 = (i41 & 2048) != 0 ? taxPurCdDesc2.goods_to_carry : str5;
        int i50 = (i41 & 4096) != 0 ? taxPurCdDesc2.height : i17;
        int i51 = (i41 & 8192) != 0 ? taxPurCdDesc2.f20465hp : i18;
        String str32 = (i41 & 16384) != 0 ? taxPurCdDesc2.imported_vch : str6;
        String str33 = (i41 & 32768) != 0 ? taxPurCdDesc2.issue_dt : str7;
        String str34 = (i41 & 65536) != 0 ? taxPurCdDesc2.jorney_purpose : str8;
        int i52 = (i41 & 131072) != 0 ? taxPurCdDesc2.ld_wt : i19;
        int i53 = (i41 & 262144) != 0 ? taxPurCdDesc2.length : i20;
        ArrayList arrayList2 = (i41 & 524288) != 0 ? taxPurCdDesc2.listTaxModes : arrayList;
        String str35 = (i41 & 1048576) != 0 ? taxPurCdDesc2.no_adv_units : str9;
        int i54 = (i41 & 2097152) != 0 ? taxPurCdDesc2.no_cyl : i21;
        int i55 = (i41 & 4194304) != 0 ? taxPurCdDesc2.no_of_trips : i22;
        int i56 = (i41 & 8388608) != 0 ? taxPurCdDesc2.off_cd : i23;
        String str36 = (i41 & 16777216) != 0 ? taxPurCdDesc2.op_dt : str10;
        int i57 = (i41 & 33554432) != 0 ? taxPurCdDesc2.other_criteria : i24;
        String str37 = (i41 & 67108864) != 0 ? taxPurCdDesc2.parking : str11;
        int i58 = (i41 & 134217728) != 0 ? taxPurCdDesc2.pmt_catg : i25;
        String str38 = (i41 & 268435456) != 0 ? taxPurCdDesc2.pmt_no : str12;
        int i59 = (i41 & 536870912) != 0 ? taxPurCdDesc2.pmt_type : i26;
        int i60 = (i41 & 1073741824) != 0 ? taxPurCdDesc2.pur_cd : i27;
        String str39 = (i41 & Integer.MIN_VALUE) != 0 ? taxPurCdDesc2.pur_descr : str13;
        String str40 = (i42 & 1) != 0 ? taxPurCdDesc2.purchase_dt : str14;
        String str41 = (i42 & 2) != 0 ? taxPurCdDesc2.rcpt_no : str15;
        String str42 = (i42 & 4) != 0 ? taxPurCdDesc2.region_covered : str16;
        String str43 = (i42 & 8) != 0 ? taxPurCdDesc2.regn_no : str17;
        String str44 = (i42 & 16) != 0 ? taxPurCdDesc2.regn_type : str18;
        String str45 = (i42 & 32) != 0 ? taxPurCdDesc2.remarks : str19;
        boolean z12 = (i42 & 64) != 0 ? taxPurCdDesc2.renderForm : z10;
        String str46 = (i42 & 128) != 0 ? taxPurCdDesc2.replace_date : str20;
        int i61 = (i42 & 256) != 0 ? taxPurCdDesc2.route_class : i28;
        int i62 = (i42 & 512) != 0 ? taxPurCdDesc2.route_length : i29;
        int i63 = (i42 & 1024) != 0 ? taxPurCdDesc2.sale_amt : i30;
        int i64 = (i42 & 2048) != 0 ? taxPurCdDesc2.seat_cap : i31;
        int i65 = (i42 & 4096) != 0 ? taxPurCdDesc2.service_type : i32;
        int i66 = (i42 & 8192) != 0 ? taxPurCdDesc2.sleeper_cap : i33;
        int i67 = (i42 & 16384) != 0 ? taxPurCdDesc2.stand_cap : i34;
        String str47 = (i42 & 32768) != 0 ? taxPurCdDesc2.state_cd : str21;
        boolean z13 = (i42 & 65536) != 0 ? taxPurCdDesc2.taxBased : z11;
        if ((i42 & 131072) != 0) {
            taxPurCdDesc.getClass();
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        return taxPurCdDesc.copy(str27, str28, str29, i43, str30, i44, i45, i46, i47, i48, i49, str31, i50, i51, str32, str33, str34, i52, i53, arrayList2, str35, i54, i55, i56, str36, i57, str37, i58, str38, i59, i60, str39, str40, str41, str42, str43, str44, str45, z12, str46, i61, i62, i63, i64, i65, i66, i67, str47, z13, aVar2, (i42 & 262144) != 0 ? taxPurCdDesc2.unld_wt : i35, (i42 & 524288) != 0 ? taxPurCdDesc2.valid_from : str22, (i42 & 1048576) != 0 ? taxPurCdDesc2.valid_upto : str23, (i42 & 2097152) != 0 ? taxPurCdDesc2.vch_catg : str24, (i42 & 4194304) != 0 ? taxPurCdDesc2.vch_purchase_as : str25, (i42 & 8388608) != 0 ? taxPurCdDesc2.vh_class : i36, (i42 & 16777216) != 0 ? taxPurCdDesc2.video_fitted : str26, (i42 & 33554432) != 0 ? taxPurCdDesc2.wheelbase : i37, (i42 & 67108864) != 0 ? taxPurCdDesc2.width : i38);
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

    public final String component12() {
        return this.goods_to_carry;
    }

    public final int component13() {
        return this.height;
    }

    public final int component14() {
        return this.f20465hp;
    }

    public final String component15() {
        return this.imported_vch;
    }

    public final String component16() {
        return this.issue_dt;
    }

    public final String component17() {
        return this.jorney_purpose;
    }

    public final int component18() {
        return this.ld_wt;
    }

    public final int component19() {
        return this.length;
    }

    public final String component2() {
        return this.appl_no;
    }

    public final ArrayList<Object> component20() {
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

    public final int component24() {
        return this.off_cd;
    }

    public final String component25() {
        return this.op_dt;
    }

    public final int component26() {
        return this.other_criteria;
    }

    public final String component27() {
        return this.parking;
    }

    public final int component28() {
        return this.pmt_catg;
    }

    public final String component29() {
        return this.pmt_no;
    }

    public final String component3() {
        return this.audio_fitted;
    }

    public final int component30() {
        return this.pmt_type;
    }

    public final int component31() {
        return this.pur_cd;
    }

    public final String component32() {
        return this.pur_descr;
    }

    public final String component33() {
        return this.purchase_dt;
    }

    public final String component34() {
        return this.rcpt_no;
    }

    public final String component35() {
        return this.region_covered;
    }

    public final String component36() {
        return this.regn_no;
    }

    public final String component37() {
        return this.regn_type;
    }

    public final String component38() {
        return this.remarks;
    }

    public final boolean component39() {
        return this.renderForm;
    }

    public final int component4() {
        return this.cubic_cap;
    }

    public final String component40() {
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

    public final String component48() {
        return this.state_cd;
    }

    public final boolean component49() {
        return this.taxBased;
    }

    public final String component5() {
        return this.dialogValue;
    }

    public final a component50() {
        return null;
    }

    public final int component51() {
        return this.unld_wt;
    }

    public final String component52() {
        return this.valid_from;
    }

    public final String component53() {
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

    public final TaxPurCdDesc copy(String str, String str2, String str3, int i10, String str4, int i11, int i12, int i13, int i14, int i15, int i16, String str5, int i17, int i18, String str6, String str7, String str8, int i19, int i20, ArrayList<Object> arrayList, String str9, int i21, int i22, int i23, String str10, int i24, String str11, int i25, String str12, int i26, int i27, String str13, String str14, String str15, String str16, String str17, String str18, String str19, boolean z10, String str20, int i28, int i29, int i30, int i31, int i32, int i33, int i34, String str21, boolean z11, a aVar, int i35, String str22, String str23, String str24, String str25, int i36, String str26, int i37, int i38) {
        String str27 = str;
        l.f(str27, "ac_fitted");
        l.f(str2, "appl_no");
        l.f(str3, "audio_fitted");
        l.f(str4, "dialogValue");
        l.f(str5, "goods_to_carry");
        l.f(str6, "imported_vch");
        l.f(str7, "issue_dt");
        l.f(str8, "jorney_purpose");
        l.f(arrayList, "listTaxModes");
        l.f(str9, "no_adv_units");
        l.f(str10, "op_dt");
        l.f(str11, "parking");
        l.f(str12, "pmt_no");
        l.f(str13, "pur_descr");
        l.f(str14, "purchase_dt");
        l.f(str15, "rcpt_no");
        l.f(str16, "region_covered");
        l.f(str17, "regn_no");
        l.f(str18, "regn_type");
        l.f(str19, "remarks");
        l.f(str20, "replace_date");
        l.f(str21, "state_cd");
        l.f(aVar, "taxPurCdDescr");
        l.f(str22, "valid_from");
        l.f(str23, "valid_upto");
        l.f(str24, "vch_catg");
        l.f(str25, "vch_purchase_as");
        l.f(str26, "video_fitted");
        return new TaxPurCdDesc(str27, str2, str3, i10, str4, i11, i12, i13, i14, i15, i16, str5, i17, i18, str6, str7, str8, i19, i20, arrayList, str9, i21, i22, i23, str10, i24, str11, i25, str12, i26, i27, str13, str14, str15, str16, str17, str18, str19, z10, str20, i28, i29, i30, i31, i32, i33, i34, str21, z11, aVar, i35, str22, str23, str24, str25, i36, str26, i37, i38);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxPurCdDesc)) {
            return false;
        }
        TaxPurCdDesc taxPurCdDesc = (TaxPurCdDesc) obj;
        return l.a(this.ac_fitted, taxPurCdDesc.ac_fitted) && l.a(this.appl_no, taxPurCdDesc.appl_no) && l.a(this.audio_fitted, taxPurCdDesc.audio_fitted) && this.cubic_cap == taxPurCdDesc.cubic_cap && l.a(this.dialogValue, taxPurCdDesc.dialogValue) && this.distance_run_in_quarter == taxPurCdDesc.distance_run_in_quarter && this.domain_cd == taxPurCdDesc.domain_cd && this.fin_yr_sale_amt == taxPurCdDesc.fin_yr_sale_amt && this.floor_area == taxPurCdDesc.floor_area && this.fuel == taxPurCdDesc.fuel && this.gcw == taxPurCdDesc.gcw && l.a(this.goods_to_carry, taxPurCdDesc.goods_to_carry) && this.height == taxPurCdDesc.height && this.f20465hp == taxPurCdDesc.f20465hp && l.a(this.imported_vch, taxPurCdDesc.imported_vch) && l.a(this.issue_dt, taxPurCdDesc.issue_dt) && l.a(this.jorney_purpose, taxPurCdDesc.jorney_purpose) && this.ld_wt == taxPurCdDesc.ld_wt && this.length == taxPurCdDesc.length && l.a(this.listTaxModes, taxPurCdDesc.listTaxModes) && l.a(this.no_adv_units, taxPurCdDesc.no_adv_units) && this.no_cyl == taxPurCdDesc.no_cyl && this.no_of_trips == taxPurCdDesc.no_of_trips && this.off_cd == taxPurCdDesc.off_cd && l.a(this.op_dt, taxPurCdDesc.op_dt) && this.other_criteria == taxPurCdDesc.other_criteria && l.a(this.parking, taxPurCdDesc.parking) && this.pmt_catg == taxPurCdDesc.pmt_catg && l.a(this.pmt_no, taxPurCdDesc.pmt_no) && this.pmt_type == taxPurCdDesc.pmt_type && this.pur_cd == taxPurCdDesc.pur_cd && l.a(this.pur_descr, taxPurCdDesc.pur_descr) && l.a(this.purchase_dt, taxPurCdDesc.purchase_dt) && l.a(this.rcpt_no, taxPurCdDesc.rcpt_no) && l.a(this.region_covered, taxPurCdDesc.region_covered) && l.a(this.regn_no, taxPurCdDesc.regn_no) && l.a(this.regn_type, taxPurCdDesc.regn_type) && l.a(this.remarks, taxPurCdDesc.remarks) && this.renderForm == taxPurCdDesc.renderForm && l.a(this.replace_date, taxPurCdDesc.replace_date) && this.route_class == taxPurCdDesc.route_class && this.route_length == taxPurCdDesc.route_length && this.sale_amt == taxPurCdDesc.sale_amt && this.seat_cap == taxPurCdDesc.seat_cap && this.service_type == taxPurCdDesc.service_type && this.sleeper_cap == taxPurCdDesc.sleeper_cap && this.stand_cap == taxPurCdDesc.stand_cap && l.a(this.state_cd, taxPurCdDesc.state_cd) && this.taxBased == taxPurCdDesc.taxBased && l.a((Object) null, (Object) null) && this.unld_wt == taxPurCdDesc.unld_wt && l.a(this.valid_from, taxPurCdDesc.valid_from) && l.a(this.valid_upto, taxPurCdDesc.valid_upto) && l.a(this.vch_catg, taxPurCdDesc.vch_catg) && l.a(this.vch_purchase_as, taxPurCdDesc.vch_purchase_as) && this.vh_class == taxPurCdDesc.vh_class && l.a(this.video_fitted, taxPurCdDesc.video_fitted) && this.wheelbase == taxPurCdDesc.wheelbase && this.width == taxPurCdDesc.width;
    }

    public final String getAc_fitted() {
        return this.ac_fitted;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final String getAudio_fitted() {
        return this.audio_fitted;
    }

    public final int getCubic_cap() {
        return this.cubic_cap;
    }

    public final String getDialogValue() {
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

    public final String getGoods_to_carry() {
        return this.goods_to_carry;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getHp() {
        return this.f20465hp;
    }

    public final String getImported_vch() {
        return this.imported_vch;
    }

    public final String getIssue_dt() {
        return this.issue_dt;
    }

    public final String getJorney_purpose() {
        return this.jorney_purpose;
    }

    public final int getLd_wt() {
        return this.ld_wt;
    }

    public final int getLength() {
        return this.length;
    }

    public final ArrayList<Object> getListTaxModes() {
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

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final int getOther_criteria() {
        return this.other_criteria;
    }

    public final String getParking() {
        return this.parking;
    }

    public final int getPmt_catg() {
        return this.pmt_catg;
    }

    public final String getPmt_no() {
        return this.pmt_no;
    }

    public final int getPmt_type() {
        return this.pmt_type;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getPur_descr() {
        return this.pur_descr;
    }

    public final String getPurchase_dt() {
        return this.purchase_dt;
    }

    public final String getRcpt_no() {
        return this.rcpt_no;
    }

    public final String getRegion_covered() {
        return this.region_covered;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getRegn_type() {
        return this.regn_type;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final boolean getRenderForm() {
        return this.renderForm;
    }

    public final String getReplace_date() {
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

    public final String getState_cd() {
        return this.state_cd;
    }

    public final boolean getTaxBased() {
        return this.taxBased;
    }

    public final a getTaxPurCdDescr() {
        return null;
    }

    public final int getUnld_wt() {
        return this.unld_wt;
    }

    public final String getValid_from() {
        return this.valid_from;
    }

    public final String getValid_upto() {
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
        this.ac_fitted.hashCode();
        this.appl_no.hashCode();
        this.audio_fitted.hashCode();
        Integer.hashCode(this.cubic_cap);
        this.dialogValue.hashCode();
        Integer.hashCode(this.distance_run_in_quarter);
        Integer.hashCode(this.domain_cd);
        Integer.hashCode(this.fin_yr_sale_amt);
        Integer.hashCode(this.floor_area);
        Integer.hashCode(this.fuel);
        Integer.hashCode(this.gcw);
        this.goods_to_carry.hashCode();
        Integer.hashCode(this.height);
        Integer.hashCode(this.f20465hp);
        this.imported_vch.hashCode();
        this.issue_dt.hashCode();
        this.jorney_purpose.hashCode();
        Integer.hashCode(this.ld_wt);
        Integer.hashCode(this.length);
        this.listTaxModes.hashCode();
        this.no_adv_units.hashCode();
        Integer.hashCode(this.no_cyl);
        Integer.hashCode(this.no_of_trips);
        Integer.hashCode(this.off_cd);
        this.op_dt.hashCode();
        Integer.hashCode(this.other_criteria);
        this.parking.hashCode();
        Integer.hashCode(this.pmt_catg);
        this.pmt_no.hashCode();
        Integer.hashCode(this.pmt_type);
        Integer.hashCode(this.pur_cd);
        this.pur_descr.hashCode();
        this.purchase_dt.hashCode();
        this.rcpt_no.hashCode();
        this.region_covered.hashCode();
        this.regn_no.hashCode();
        this.regn_type.hashCode();
        this.remarks.hashCode();
        this.replace_date.hashCode();
        Integer.hashCode(this.route_class);
        Integer.hashCode(this.route_length);
        Integer.hashCode(this.sale_amt);
        Integer.hashCode(this.seat_cap);
        Integer.hashCode(this.service_type);
        Integer.hashCode(this.sleeper_cap);
        Integer.hashCode(this.stand_cap);
        this.state_cd.hashCode();
        throw null;
    }

    public String toString() {
        return "TaxPurCdDesc(ac_fitted=" + this.ac_fitted + ", appl_no=" + this.appl_no + ", audio_fitted=" + this.audio_fitted + ", cubic_cap=" + this.cubic_cap + ", dialogValue=" + this.dialogValue + ", distance_run_in_quarter=" + this.distance_run_in_quarter + ", domain_cd=" + this.domain_cd + ", fin_yr_sale_amt=" + this.fin_yr_sale_amt + ", floor_area=" + this.floor_area + ", fuel=" + this.fuel + ", gcw=" + this.gcw + ", goods_to_carry=" + this.goods_to_carry + ", height=" + this.height + ", hp=" + this.f20465hp + ", imported_vch=" + this.imported_vch + ", issue_dt=" + this.issue_dt + ", jorney_purpose=" + this.jorney_purpose + ", ld_wt=" + this.ld_wt + ", length=" + this.length + ", listTaxModes=" + this.listTaxModes + ", no_adv_units=" + this.no_adv_units + ", no_cyl=" + this.no_cyl + ", no_of_trips=" + this.no_of_trips + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", other_criteria=" + this.other_criteria + ", parking=" + this.parking + ", pmt_catg=" + this.pmt_catg + ", pmt_no=" + this.pmt_no + ", pmt_type=" + this.pmt_type + ", pur_cd=" + this.pur_cd + ", pur_descr=" + this.pur_descr + ", purchase_dt=" + this.purchase_dt + ", rcpt_no=" + this.rcpt_no + ", region_covered=" + this.region_covered + ", regn_no=" + this.regn_no + ", regn_type=" + this.regn_type + ", remarks=" + this.remarks + ", renderForm=" + this.renderForm + ", replace_date=" + this.replace_date + ", route_class=" + this.route_class + ", route_length=" + this.route_length + ", sale_amt=" + this.sale_amt + ", seat_cap=" + this.seat_cap + ", service_type=" + this.service_type + ", sleeper_cap=" + this.sleeper_cap + ", stand_cap=" + this.stand_cap + ", state_cd=" + this.state_cd + ", taxBased=" + this.taxBased + ", taxPurCdDescr=" + null + ", unld_wt=" + this.unld_wt + ", valid_from=" + this.valid_from + ", valid_upto=" + this.valid_upto + ", vch_catg=" + this.vch_catg + ", vch_purchase_as=" + this.vch_purchase_as + ", vh_class=" + this.vh_class + ", video_fitted=" + this.video_fitted + ", wheelbase=" + this.wheelbase + ", width=" + this.width + ')';
    }
}
