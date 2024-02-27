package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class OwnerdetailsModel {
    private final String aadhar_no;
    private final String ac_fitted;
    private final int annual_income;
    private final Object appl_no;
    private final String audio_fitted;
    private final String body_type;
    private final String c_add1;
    private final String c_add2;
    private final String c_add3;
    private final int c_district;
    private final String c_district_name;
    private final Object c_off_cd;
    private final int c_pincode;
    private final String c_state;
    private final String c_state_name;
    private final String chasi_no;
    private final Object chasi_no_original;
    private final String color;
    private final boolean conditionstatus;
    private final double cubic_cap;
    private final String dealer_cd;
    private final int dept_cd;
    private final Object dlRequired;
    private final Object dlValidationRequired;
    private final String dl_no;
    private final String dlr_add1;
    private final String dlr_add2;
    private final String dlr_add3;
    private final String dlr_city;
    private final String dlr_district;
    private final String dlr_name;
    private final String dlr_pincode;
    private final String email_id;
    private final String eng_no;
    private final Object eng_no_original;
    private final Object eng_no_orignal;
    private final String f_name;
    private final String fit_upto;
    private final Object fit_uptoAsDate;
    private final Object fit_upto_desc;
    private final Object flag;
    private final double floor_area;
    private final Object formatRegn_dt;
    private final int fuel;
    private final String fuel_descr;
    private final String garage_add;
    private final int gcw;
    private final int height;

    /* renamed from: hp  reason: collision with root package name */
    private final double f20462hp;
    private final String imported_vch;
    private final String laser_code;
    private final a latesttaxdetails;
    private final int ld_wt;
    private final int length;
    private final int maker;
    private final String maker_name;
    private final int manu_mon;
    private final int manu_yr;
    private final Object mobileNoEditable;
    private final long mobile_no;
    private final String model_cd;
    private final String model_name;
    private final int no_cyl;
    private final Object no_of_axles;
    private final int norms;
    private final String norms_descr;
    private final Object numberOfTyres;
    private final int off_cd;
    private final String off_name;
    private final String op_dt;
    private final int other_criteria;
    private final Object ownerCatg;
    private final b ownerIdentification;
    private final int owner_cd;
    private final String owner_cd_descr;
    private final int owner_ctg;
    private final String owner_name;
    private final int owner_sr;
    private final String p_add1;
    private final String p_add2;
    private final String p_add3;
    private final int p_district;
    private final String p_district_name;
    private final int p_pincode;
    private final String p_state;
    private final String p_state_name;
    private final String pan_no;
    private final String passport_no;
    private final Object permitDetailDto;
    private final Object permitDetailEntity;
    private final Object permit_rto_cd;
    private final Object purchase_date;
    private final String purchase_dt;
    private final String ration_card_no;
    private final String regn_dt;
    private final Object regn_dtAsDate;
    private final String regn_no;
    private final String regn_type;
    private final String regn_type_descr;
    private final String regn_upto;
    private final Object regn_uptoAsDate;
    private final Object returnMessge;
    private final int sale_amt;
    private final int seat_cap;
    private final int sleeper_cap;
    private final int stand_cap;
    private final String state_cd;
    private final String state_name;
    private final String status;
    private final String tax_mode;
    private final Object transport_catg;
    private final int unld_wt;
    private final c vTHypthEntity;
    private final String vch_catg;
    private final Object vch_catg_desc;
    private final String vch_purchase_as;
    private final Object vch_purchase_asCode;
    private final String vehType;
    private final int vehTypeAsInt;
    private final long verified_on;
    private final int vh_class;
    private final String vh_class_desc;
    private final String video_fitted;
    private final String voter_id;
    private final Object vtInsuranceCommonDto;
    private final Object vtpucc;
    private final int wheelbase;
    private final int width;

    public static final class a {
    }

    public static final class b {
    }

    public static final class c {
    }

    public OwnerdetailsModel(String str, String str2, int i10, Object obj, String str3, String str4, String str5, String str6, String str7, int i11, String str8, Object obj2, int i12, String str9, String str10, String str11, Object obj3, String str12, boolean z10, double d10, String str13, int i13, Object obj4, Object obj5, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Object obj6, Object obj7, String str24, String str25, Object obj8, Object obj9, Object obj10, double d11, Object obj11, int i14, String str26, String str27, int i15, int i16, double d12, String str28, String str29, a aVar, int i17, int i18, int i19, String str30, int i20, int i21, Object obj12, long j10, String str31, String str32, int i22, Object obj13, int i23, String str33, Object obj14, int i24, String str34, String str35, int i25, Object obj15, b bVar, int i26, String str36, int i27, String str37, int i28, String str38, String str39, String str40, int i29, String str41, int i30, String str42, String str43, String str44, String str45, Object obj16, Object obj17, Object obj18, Object obj19, String str46, String str47, String str48, Object obj20, String str49, String str50, String str51, String str52, Object obj21, Object obj22, int i31, int i32, int i33, int i34, String str53, String str54, String str55, String str56, Object obj23, int i35, c cVar, String str57, Object obj24, String str58, Object obj25, String str59, int i36, long j11, int i37, String str60, String str61, String str62, Object obj26, Object obj27, int i38, int i39) {
        String str63 = str;
        String str64 = str2;
        String str65 = str3;
        String str66 = str4;
        String str67 = str5;
        String str68 = str6;
        String str69 = str7;
        String str70 = str8;
        String str71 = str9;
        String str72 = str10;
        String str73 = str11;
        String str74 = str12;
        String str75 = str13;
        String str76 = str14;
        String str77 = str16;
        l.f(str63, "aadhar_no");
        l.f(str64, "ac_fitted");
        l.f(str65, "audio_fitted");
        l.f(str66, "body_type");
        l.f(str67, "c_add1");
        l.f(str68, "c_add2");
        l.f(str69, "c_add3");
        l.f(str70, "c_district_name");
        l.f(str71, "c_state");
        l.f(str72, "c_state_name");
        l.f(str73, "chasi_no");
        l.f(str74, "color");
        l.f(str75, "dealer_cd");
        l.f(str76, "dl_no");
        l.f(str15, "dlr_add1");
        l.f(str16, "dlr_add2");
        l.f(str17, "dlr_add3");
        l.f(str18, "dlr_city");
        l.f(str19, "dlr_district");
        l.f(str20, "dlr_name");
        l.f(str21, "dlr_pincode");
        l.f(str22, "email_id");
        l.f(str23, "eng_no");
        l.f(str24, "f_name");
        l.f(str25, "fit_upto");
        l.f(str26, "fuel_descr");
        l.f(str27, "garage_add");
        l.f(str28, "imported_vch");
        l.f(str29, "laser_code");
        l.f(aVar, "latesttaxdetails");
        l.f(str30, "maker_name");
        l.f(str31, "model_cd");
        l.f(str32, "model_name");
        l.f(str33, "norms_descr");
        l.f(str34, "off_name");
        l.f(str35, "op_dt");
        l.f(bVar, "ownerIdentification");
        l.f(str36, "owner_cd_descr");
        l.f(str37, "owner_name");
        l.f(str38, "p_add1");
        l.f(str39, "p_add2");
        l.f(str40, "p_add3");
        l.f(str41, "p_district_name");
        l.f(str42, "p_state");
        l.f(str43, "p_state_name");
        l.f(str44, "pan_no");
        l.f(str45, "passport_no");
        l.f(str46, "purchase_dt");
        l.f(str47, "ration_card_no");
        l.f(str48, "regn_dt");
        l.f(str49, "regn_no");
        l.f(str50, "regn_type");
        l.f(str51, "regn_type_descr");
        l.f(str52, "regn_upto");
        l.f(str53, "state_cd");
        l.f(str54, "state_name");
        l.f(str55, "status");
        l.f(str56, "tax_mode");
        l.f(cVar, "vTHypthEntity");
        l.f(str57, "vch_catg");
        l.f(str58, "vch_purchase_as");
        l.f(str59, "vehType");
        l.f(str60, "vh_class_desc");
        l.f(str61, "video_fitted");
        l.f(str62, "voter_id");
        this.aadhar_no = str63;
        this.ac_fitted = str64;
        this.annual_income = i10;
        this.appl_no = obj;
        this.audio_fitted = str65;
        this.body_type = str66;
        this.c_add1 = str67;
        this.c_add2 = str68;
        this.c_add3 = str69;
        this.c_district = i11;
        this.c_district_name = str70;
        this.c_off_cd = obj2;
        this.c_pincode = i12;
        this.c_state = str71;
        this.c_state_name = str72;
        this.chasi_no = str73;
        this.chasi_no_original = obj3;
        this.color = str74;
        this.conditionstatus = z10;
        this.cubic_cap = d10;
        this.dealer_cd = str75;
        this.dept_cd = i13;
        this.dlRequired = obj4;
        this.dlValidationRequired = obj5;
        this.dl_no = str76;
        this.dlr_add1 = str15;
        this.dlr_add2 = str16;
        this.dlr_add3 = str17;
        this.dlr_city = str18;
        this.dlr_district = str19;
        this.dlr_name = str20;
        this.dlr_pincode = str21;
        this.email_id = str22;
        this.eng_no = str23;
        this.eng_no_original = obj6;
        this.eng_no_orignal = obj7;
        this.f_name = str24;
        this.fit_upto = str25;
        this.fit_uptoAsDate = obj8;
        this.fit_upto_desc = obj9;
        this.flag = obj10;
        this.floor_area = d11;
        this.formatRegn_dt = obj11;
        this.fuel = i14;
        this.fuel_descr = str26;
        this.garage_add = str27;
        this.gcw = i15;
        this.height = i16;
        this.f20462hp = d12;
        this.imported_vch = str28;
        this.laser_code = str29;
        this.ld_wt = i17;
        this.length = i18;
        this.maker = i19;
        this.maker_name = str30;
        this.manu_mon = i20;
        this.manu_yr = i21;
        this.mobileNoEditable = obj12;
        this.mobile_no = j10;
        this.model_cd = str31;
        this.model_name = str32;
        this.no_cyl = i22;
        this.no_of_axles = obj13;
        this.norms = i23;
        this.norms_descr = str33;
        this.numberOfTyres = obj14;
        this.off_cd = i24;
        this.off_name = str34;
        this.op_dt = str35;
        this.other_criteria = i25;
        this.ownerCatg = obj15;
        this.owner_cd = i26;
        this.owner_cd_descr = str36;
        this.owner_ctg = i27;
        this.owner_name = str37;
        this.owner_sr = i28;
        this.p_add1 = str38;
        this.p_add2 = str39;
        this.p_add3 = str40;
        this.p_district = i29;
        this.p_district_name = str41;
        this.p_pincode = i30;
        this.p_state = str42;
        this.p_state_name = str43;
        this.pan_no = str44;
        this.passport_no = str45;
        this.permitDetailDto = obj16;
        this.permitDetailEntity = obj17;
        this.permit_rto_cd = obj18;
        this.purchase_date = obj19;
        this.purchase_dt = str46;
        this.ration_card_no = str47;
        this.regn_dt = str48;
        this.regn_dtAsDate = obj20;
        this.regn_no = str49;
        this.regn_type = str50;
        this.regn_type_descr = str51;
        this.regn_upto = str52;
        this.regn_uptoAsDate = obj21;
        this.returnMessge = obj22;
        this.sale_amt = i31;
        this.seat_cap = i32;
        this.sleeper_cap = i33;
        this.stand_cap = i34;
        this.state_cd = str53;
        this.state_name = str54;
        this.status = str55;
        this.tax_mode = str56;
        this.transport_catg = obj23;
        this.unld_wt = i35;
        this.vch_catg = str57;
        this.vch_catg_desc = obj24;
        this.vch_purchase_as = str58;
        this.vch_purchase_asCode = obj25;
        this.vehType = str59;
        this.vehTypeAsInt = i36;
        this.verified_on = j11;
        this.vh_class = i37;
        this.vh_class_desc = str60;
        this.video_fitted = str61;
        this.voter_id = str62;
        this.vtInsuranceCommonDto = obj26;
        this.vtpucc = obj27;
        this.wheelbase = i38;
        this.width = i39;
    }

    public static /* synthetic */ OwnerdetailsModel copy$default(OwnerdetailsModel ownerdetailsModel, String str, String str2, int i10, Object obj, String str3, String str4, String str5, String str6, String str7, int i11, String str8, Object obj2, int i12, String str9, String str10, String str11, Object obj3, String str12, boolean z10, double d10, String str13, int i13, Object obj4, Object obj5, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Object obj6, Object obj7, String str24, String str25, Object obj8, Object obj9, Object obj10, double d11, Object obj11, int i14, String str26, String str27, int i15, int i16, double d12, String str28, String str29, a aVar, int i17, int i18, int i19, String str30, int i20, int i21, Object obj12, long j10, String str31, String str32, int i22, Object obj13, int i23, String str33, Object obj14, int i24, String str34, String str35, int i25, Object obj15, b bVar, int i26, String str36, int i27, String str37, int i28, String str38, String str39, String str40, int i29, String str41, int i30, String str42, String str43, String str44, String str45, Object obj16, Object obj17, Object obj18, Object obj19, String str46, String str47, String str48, Object obj20, String str49, String str50, String str51, String str52, Object obj21, Object obj22, int i31, int i32, int i33, int i34, String str53, String str54, String str55, String str56, Object obj23, int i35, c cVar, String str57, Object obj24, String str58, Object obj25, String str59, int i36, long j11, int i37, String str60, String str61, String str62, Object obj26, Object obj27, int i38, int i39, int i40, int i41, int i42, int i43, Object obj28) {
        a aVar2;
        b bVar2;
        c cVar2;
        OwnerdetailsModel ownerdetailsModel2 = ownerdetailsModel;
        int i44 = i40;
        int i45 = i41;
        int i46 = i42;
        int i47 = i43;
        String str63 = (i44 & 1) != 0 ? ownerdetailsModel2.aadhar_no : str;
        String str64 = (i44 & 2) != 0 ? ownerdetailsModel2.ac_fitted : str2;
        int i48 = (i44 & 4) != 0 ? ownerdetailsModel2.annual_income : i10;
        Object obj29 = (i44 & 8) != 0 ? ownerdetailsModel2.appl_no : obj;
        String str65 = (i44 & 16) != 0 ? ownerdetailsModel2.audio_fitted : str3;
        String str66 = (i44 & 32) != 0 ? ownerdetailsModel2.body_type : str4;
        String str67 = (i44 & 64) != 0 ? ownerdetailsModel2.c_add1 : str5;
        String str68 = (i44 & 128) != 0 ? ownerdetailsModel2.c_add2 : str6;
        String str69 = (i44 & 256) != 0 ? ownerdetailsModel2.c_add3 : str7;
        int i49 = (i44 & 512) != 0 ? ownerdetailsModel2.c_district : i11;
        String str70 = (i44 & 1024) != 0 ? ownerdetailsModel2.c_district_name : str8;
        Object obj30 = (i44 & 2048) != 0 ? ownerdetailsModel2.c_off_cd : obj2;
        int i50 = (i44 & 4096) != 0 ? ownerdetailsModel2.c_pincode : i12;
        String str71 = (i44 & 8192) != 0 ? ownerdetailsModel2.c_state : str9;
        String str72 = (i44 & 16384) != 0 ? ownerdetailsModel2.c_state_name : str10;
        String str73 = (i44 & 32768) != 0 ? ownerdetailsModel2.chasi_no : str11;
        Object obj31 = (i44 & 65536) != 0 ? ownerdetailsModel2.chasi_no_original : obj3;
        String str74 = (i44 & 131072) != 0 ? ownerdetailsModel2.color : str12;
        int i51 = i49;
        boolean z11 = (i44 & 262144) != 0 ? ownerdetailsModel2.conditionstatus : z10;
        double d13 = (i44 & 524288) != 0 ? ownerdetailsModel2.cubic_cap : d10;
        String str75 = (i44 & 1048576) != 0 ? ownerdetailsModel2.dealer_cd : str13;
        int i52 = (i44 & 2097152) != 0 ? ownerdetailsModel2.dept_cd : i13;
        Object obj32 = (i44 & 4194304) != 0 ? ownerdetailsModel2.dlRequired : obj4;
        Object obj33 = (i44 & 8388608) != 0 ? ownerdetailsModel2.dlValidationRequired : obj5;
        String str76 = (i44 & 16777216) != 0 ? ownerdetailsModel2.dl_no : str14;
        String str77 = (i44 & 33554432) != 0 ? ownerdetailsModel2.dlr_add1 : str15;
        String str78 = (i44 & 67108864) != 0 ? ownerdetailsModel2.dlr_add2 : str16;
        String str79 = (i44 & 134217728) != 0 ? ownerdetailsModel2.dlr_add3 : str17;
        String str80 = (i44 & 268435456) != 0 ? ownerdetailsModel2.dlr_city : str18;
        String str81 = (i44 & 536870912) != 0 ? ownerdetailsModel2.dlr_district : str19;
        String str82 = (i44 & 1073741824) != 0 ? ownerdetailsModel2.dlr_name : str20;
        String str83 = (i44 & Integer.MIN_VALUE) != 0 ? ownerdetailsModel2.dlr_pincode : str21;
        String str84 = (i45 & 1) != 0 ? ownerdetailsModel2.email_id : str22;
        String str85 = (i45 & 2) != 0 ? ownerdetailsModel2.eng_no : str23;
        Object obj34 = (i45 & 4) != 0 ? ownerdetailsModel2.eng_no_original : obj6;
        Object obj35 = (i45 & 8) != 0 ? ownerdetailsModel2.eng_no_orignal : obj7;
        String str86 = (i45 & 16) != 0 ? ownerdetailsModel2.f_name : str24;
        String str87 = (i45 & 32) != 0 ? ownerdetailsModel2.fit_upto : str25;
        Object obj36 = (i45 & 64) != 0 ? ownerdetailsModel2.fit_uptoAsDate : obj8;
        Object obj37 = (i45 & 128) != 0 ? ownerdetailsModel2.fit_upto_desc : obj9;
        Object obj38 = (i45 & 256) != 0 ? ownerdetailsModel2.flag : obj10;
        String str88 = str75;
        String str89 = str82;
        double d14 = (i45 & 512) != 0 ? ownerdetailsModel2.floor_area : d11;
        Object obj39 = (i45 & 1024) != 0 ? ownerdetailsModel2.formatRegn_dt : obj11;
        int i53 = (i45 & 2048) != 0 ? ownerdetailsModel2.fuel : i14;
        String str90 = (i45 & 4096) != 0 ? ownerdetailsModel2.fuel_descr : str26;
        String str91 = (i45 & 8192) != 0 ? ownerdetailsModel2.garage_add : str27;
        int i54 = (i45 & 16384) != 0 ? ownerdetailsModel2.gcw : i15;
        int i55 = (i45 & 32768) != 0 ? ownerdetailsModel2.height : i16;
        double d15 = d14;
        double d16 = (i45 & 65536) != 0 ? ownerdetailsModel2.f20462hp : d12;
        String str92 = (i45 & 131072) != 0 ? ownerdetailsModel2.imported_vch : str28;
        String str93 = (i45 & 262144) != 0 ? ownerdetailsModel2.laser_code : str29;
        if ((i45 & 524288) != 0) {
            ownerdetailsModel.getClass();
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        String str94 = str93;
        int i56 = (i45 & 1048576) != 0 ? ownerdetailsModel2.ld_wt : i17;
        int i57 = (i45 & 2097152) != 0 ? ownerdetailsModel2.length : i18;
        int i58 = (i45 & 4194304) != 0 ? ownerdetailsModel2.maker : i19;
        String str95 = (i45 & 8388608) != 0 ? ownerdetailsModel2.maker_name : str30;
        int i59 = (i45 & 16777216) != 0 ? ownerdetailsModel2.manu_mon : i20;
        int i60 = (i45 & 33554432) != 0 ? ownerdetailsModel2.manu_yr : i21;
        String str96 = str92;
        Object obj40 = (i45 & 67108864) != 0 ? ownerdetailsModel2.mobileNoEditable : obj12;
        long j12 = (i45 & 134217728) != 0 ? ownerdetailsModel2.mobile_no : j10;
        String str97 = (i45 & 268435456) != 0 ? ownerdetailsModel2.model_cd : str31;
        String str98 = (536870912 & i45) != 0 ? ownerdetailsModel2.model_name : str32;
        int i61 = (i45 & 1073741824) != 0 ? ownerdetailsModel2.no_cyl : i22;
        Object obj41 = (i45 & Integer.MIN_VALUE) != 0 ? ownerdetailsModel2.no_of_axles : obj13;
        int i62 = (i46 & 1) != 0 ? ownerdetailsModel2.norms : i23;
        String str99 = (i46 & 2) != 0 ? ownerdetailsModel2.norms_descr : str33;
        Object obj42 = (i46 & 4) != 0 ? ownerdetailsModel2.numberOfTyres : obj14;
        int i63 = (i46 & 8) != 0 ? ownerdetailsModel2.off_cd : i24;
        String str100 = (i46 & 16) != 0 ? ownerdetailsModel2.off_name : str34;
        String str101 = (i46 & 32) != 0 ? ownerdetailsModel2.op_dt : str35;
        int i64 = (i46 & 64) != 0 ? ownerdetailsModel2.other_criteria : i25;
        Object obj43 = (i46 & 128) != 0 ? ownerdetailsModel2.ownerCatg : obj15;
        if ((i46 & 256) != 0) {
            ownerdetailsModel.getClass();
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        b bVar3 = bVar2;
        int i65 = (i46 & 512) != 0 ? ownerdetailsModel2.owner_cd : i26;
        String str102 = (i46 & 1024) != 0 ? ownerdetailsModel2.owner_cd_descr : str36;
        int i66 = (i46 & 2048) != 0 ? ownerdetailsModel2.owner_ctg : i27;
        String str103 = (i46 & 4096) != 0 ? ownerdetailsModel2.owner_name : str37;
        int i67 = (i46 & 8192) != 0 ? ownerdetailsModel2.owner_sr : i28;
        String str104 = (i46 & 16384) != 0 ? ownerdetailsModel2.p_add1 : str38;
        String str105 = (i46 & 32768) != 0 ? ownerdetailsModel2.p_add2 : str39;
        String str106 = (i46 & 65536) != 0 ? ownerdetailsModel2.p_add3 : str40;
        int i68 = (i46 & 131072) != 0 ? ownerdetailsModel2.p_district : i29;
        String str107 = (i46 & 262144) != 0 ? ownerdetailsModel2.p_district_name : str41;
        int i69 = (i46 & 524288) != 0 ? ownerdetailsModel2.p_pincode : i30;
        String str108 = (i46 & 1048576) != 0 ? ownerdetailsModel2.p_state : str42;
        String str109 = (i46 & 2097152) != 0 ? ownerdetailsModel2.p_state_name : str43;
        String str110 = (i46 & 4194304) != 0 ? ownerdetailsModel2.pan_no : str44;
        String str111 = (i46 & 8388608) != 0 ? ownerdetailsModel2.passport_no : str45;
        Object obj44 = (i46 & 16777216) != 0 ? ownerdetailsModel2.permitDetailDto : obj16;
        Object obj45 = (i46 & 33554432) != 0 ? ownerdetailsModel2.permitDetailEntity : obj17;
        Object obj46 = (i46 & 67108864) != 0 ? ownerdetailsModel2.permit_rto_cd : obj18;
        Object obj47 = (i46 & 134217728) != 0 ? ownerdetailsModel2.purchase_date : obj19;
        String str112 = (i46 & 268435456) != 0 ? ownerdetailsModel2.purchase_dt : str46;
        String str113 = (i46 & 536870912) != 0 ? ownerdetailsModel2.ration_card_no : str47;
        String str114 = (i46 & 1073741824) != 0 ? ownerdetailsModel2.regn_dt : str48;
        Object obj48 = (i46 & Integer.MIN_VALUE) != 0 ? ownerdetailsModel2.regn_dtAsDate : obj20;
        String str115 = (i47 & 1) != 0 ? ownerdetailsModel2.regn_no : str49;
        String str116 = (i47 & 2) != 0 ? ownerdetailsModel2.regn_type : str50;
        String str117 = (i47 & 4) != 0 ? ownerdetailsModel2.regn_type_descr : str51;
        String str118 = (i47 & 8) != 0 ? ownerdetailsModel2.regn_upto : str52;
        Object obj49 = (i47 & 16) != 0 ? ownerdetailsModel2.regn_uptoAsDate : obj21;
        Object obj50 = (i47 & 32) != 0 ? ownerdetailsModel2.returnMessge : obj22;
        int i70 = (i47 & 64) != 0 ? ownerdetailsModel2.sale_amt : i31;
        int i71 = (i47 & 128) != 0 ? ownerdetailsModel2.seat_cap : i32;
        int i72 = (i47 & 256) != 0 ? ownerdetailsModel2.sleeper_cap : i33;
        int i73 = (i47 & 512) != 0 ? ownerdetailsModel2.stand_cap : i34;
        String str119 = (i47 & 1024) != 0 ? ownerdetailsModel2.state_cd : str53;
        String str120 = (i47 & 2048) != 0 ? ownerdetailsModel2.state_name : str54;
        String str121 = (i47 & 4096) != 0 ? ownerdetailsModel2.status : str55;
        String str122 = (i47 & 8192) != 0 ? ownerdetailsModel2.tax_mode : str56;
        Object obj51 = (i47 & 16384) != 0 ? ownerdetailsModel2.transport_catg : obj23;
        int i74 = (i47 & 32768) != 0 ? ownerdetailsModel2.unld_wt : i35;
        if ((i47 & 65536) != 0) {
            ownerdetailsModel.getClass();
            cVar2 = null;
        } else {
            cVar2 = cVar;
        }
        return ownerdetailsModel.copy(str63, str64, i48, obj29, str65, str66, str67, str68, str69, i51, str70, obj30, i50, str71, str72, str73, obj31, str74, z11, d13, str88, i52, obj32, obj33, str76, str77, str78, str79, str80, str81, str89, str83, str84, str85, obj34, obj35, str86, str87, obj36, obj37, obj38, d15, obj39, i53, str90, str91, i54, i55, d16, str96, str94, aVar2, i56, i57, i58, str95, i59, i60, obj40, j12, str97, str98, i61, obj41, i62, str99, obj42, i63, str100, str101, i64, obj43, bVar3, i65, str102, i66, str103, i67, str104, str105, str106, i68, str107, i69, str108, str109, str110, str111, obj44, obj45, obj46, obj47, str112, str113, str114, obj48, str115, str116, str117, str118, obj49, obj50, i70, i71, i72, i73, str119, str120, str121, str122, obj51, i74, cVar2, (i47 & 131072) != 0 ? ownerdetailsModel2.vch_catg : str57, (i47 & 262144) != 0 ? ownerdetailsModel2.vch_catg_desc : obj24, (i47 & 524288) != 0 ? ownerdetailsModel2.vch_purchase_as : str58, (i47 & 1048576) != 0 ? ownerdetailsModel2.vch_purchase_asCode : obj25, (i47 & 2097152) != 0 ? ownerdetailsModel2.vehType : str59, (i47 & 4194304) != 0 ? ownerdetailsModel2.vehTypeAsInt : i36, (i47 & 8388608) != 0 ? ownerdetailsModel2.verified_on : j11, (i47 & 16777216) != 0 ? ownerdetailsModel2.vh_class : i37, (33554432 & i47) != 0 ? ownerdetailsModel2.vh_class_desc : str60, (i47 & 67108864) != 0 ? ownerdetailsModel2.video_fitted : str61, (i47 & 134217728) != 0 ? ownerdetailsModel2.voter_id : str62, (i47 & 268435456) != 0 ? ownerdetailsModel2.vtInsuranceCommonDto : obj26, (i47 & 536870912) != 0 ? ownerdetailsModel2.vtpucc : obj27, (i47 & 1073741824) != 0 ? ownerdetailsModel2.wheelbase : i38, (i47 & Integer.MIN_VALUE) != 0 ? ownerdetailsModel2.width : i39);
    }

    public final String component1() {
        return this.aadhar_no;
    }

    public final int component10() {
        return this.c_district;
    }

    public final String component100() {
        return this.regn_upto;
    }

    public final Object component101() {
        return this.regn_uptoAsDate;
    }

    public final Object component102() {
        return this.returnMessge;
    }

    public final int component103() {
        return this.sale_amt;
    }

    public final int component104() {
        return this.seat_cap;
    }

    public final int component105() {
        return this.sleeper_cap;
    }

    public final int component106() {
        return this.stand_cap;
    }

    public final String component107() {
        return this.state_cd;
    }

    public final String component108() {
        return this.state_name;
    }

    public final String component109() {
        return this.status;
    }

    public final String component11() {
        return this.c_district_name;
    }

    public final String component110() {
        return this.tax_mode;
    }

    public final Object component111() {
        return this.transport_catg;
    }

    public final int component112() {
        return this.unld_wt;
    }

    public final c component113() {
        return null;
    }

    public final String component114() {
        return this.vch_catg;
    }

    public final Object component115() {
        return this.vch_catg_desc;
    }

    public final String component116() {
        return this.vch_purchase_as;
    }

    public final Object component117() {
        return this.vch_purchase_asCode;
    }

    public final String component118() {
        return this.vehType;
    }

    public final int component119() {
        return this.vehTypeAsInt;
    }

    public final Object component12() {
        return this.c_off_cd;
    }

    public final long component120() {
        return this.verified_on;
    }

    public final int component121() {
        return this.vh_class;
    }

    public final String component122() {
        return this.vh_class_desc;
    }

    public final String component123() {
        return this.video_fitted;
    }

    public final String component124() {
        return this.voter_id;
    }

    public final Object component125() {
        return this.vtInsuranceCommonDto;
    }

    public final Object component126() {
        return this.vtpucc;
    }

    public final int component127() {
        return this.wheelbase;
    }

    public final int component128() {
        return this.width;
    }

    public final int component13() {
        return this.c_pincode;
    }

    public final String component14() {
        return this.c_state;
    }

    public final String component15() {
        return this.c_state_name;
    }

    public final String component16() {
        return this.chasi_no;
    }

    public final Object component17() {
        return this.chasi_no_original;
    }

    public final String component18() {
        return this.color;
    }

    public final boolean component19() {
        return this.conditionstatus;
    }

    public final String component2() {
        return this.ac_fitted;
    }

    public final double component20() {
        return this.cubic_cap;
    }

    public final String component21() {
        return this.dealer_cd;
    }

    public final int component22() {
        return this.dept_cd;
    }

    public final Object component23() {
        return this.dlRequired;
    }

    public final Object component24() {
        return this.dlValidationRequired;
    }

    public final String component25() {
        return this.dl_no;
    }

    public final String component26() {
        return this.dlr_add1;
    }

    public final String component27() {
        return this.dlr_add2;
    }

    public final String component28() {
        return this.dlr_add3;
    }

    public final String component29() {
        return this.dlr_city;
    }

    public final int component3() {
        return this.annual_income;
    }

    public final String component30() {
        return this.dlr_district;
    }

    public final String component31() {
        return this.dlr_name;
    }

    public final String component32() {
        return this.dlr_pincode;
    }

    public final String component33() {
        return this.email_id;
    }

    public final String component34() {
        return this.eng_no;
    }

    public final Object component35() {
        return this.eng_no_original;
    }

    public final Object component36() {
        return this.eng_no_orignal;
    }

    public final String component37() {
        return this.f_name;
    }

    public final String component38() {
        return this.fit_upto;
    }

    public final Object component39() {
        return this.fit_uptoAsDate;
    }

    public final Object component4() {
        return this.appl_no;
    }

    public final Object component40() {
        return this.fit_upto_desc;
    }

    public final Object component41() {
        return this.flag;
    }

    public final double component42() {
        return this.floor_area;
    }

    public final Object component43() {
        return this.formatRegn_dt;
    }

    public final int component44() {
        return this.fuel;
    }

    public final String component45() {
        return this.fuel_descr;
    }

    public final String component46() {
        return this.garage_add;
    }

    public final int component47() {
        return this.gcw;
    }

    public final int component48() {
        return this.height;
    }

    public final double component49() {
        return this.f20462hp;
    }

    public final String component5() {
        return this.audio_fitted;
    }

    public final String component50() {
        return this.imported_vch;
    }

    public final String component51() {
        return this.laser_code;
    }

    public final a component52() {
        return null;
    }

    public final int component53() {
        return this.ld_wt;
    }

    public final int component54() {
        return this.length;
    }

    public final int component55() {
        return this.maker;
    }

    public final String component56() {
        return this.maker_name;
    }

    public final int component57() {
        return this.manu_mon;
    }

    public final int component58() {
        return this.manu_yr;
    }

    public final Object component59() {
        return this.mobileNoEditable;
    }

    public final String component6() {
        return this.body_type;
    }

    public final long component60() {
        return this.mobile_no;
    }

    public final String component61() {
        return this.model_cd;
    }

    public final String component62() {
        return this.model_name;
    }

    public final int component63() {
        return this.no_cyl;
    }

    public final Object component64() {
        return this.no_of_axles;
    }

    public final int component65() {
        return this.norms;
    }

    public final String component66() {
        return this.norms_descr;
    }

    public final Object component67() {
        return this.numberOfTyres;
    }

    public final int component68() {
        return this.off_cd;
    }

    public final String component69() {
        return this.off_name;
    }

    public final String component7() {
        return this.c_add1;
    }

    public final String component70() {
        return this.op_dt;
    }

    public final int component71() {
        return this.other_criteria;
    }

    public final Object component72() {
        return this.ownerCatg;
    }

    public final b component73() {
        return null;
    }

    public final int component74() {
        return this.owner_cd;
    }

    public final String component75() {
        return this.owner_cd_descr;
    }

    public final int component76() {
        return this.owner_ctg;
    }

    public final String component77() {
        return this.owner_name;
    }

    public final int component78() {
        return this.owner_sr;
    }

    public final String component79() {
        return this.p_add1;
    }

    public final String component8() {
        return this.c_add2;
    }

    public final String component80() {
        return this.p_add2;
    }

    public final String component81() {
        return this.p_add3;
    }

    public final int component82() {
        return this.p_district;
    }

    public final String component83() {
        return this.p_district_name;
    }

    public final int component84() {
        return this.p_pincode;
    }

    public final String component85() {
        return this.p_state;
    }

    public final String component86() {
        return this.p_state_name;
    }

    public final String component87() {
        return this.pan_no;
    }

    public final String component88() {
        return this.passport_no;
    }

    public final Object component89() {
        return this.permitDetailDto;
    }

    public final String component9() {
        return this.c_add3;
    }

    public final Object component90() {
        return this.permitDetailEntity;
    }

    public final Object component91() {
        return this.permit_rto_cd;
    }

    public final Object component92() {
        return this.purchase_date;
    }

    public final String component93() {
        return this.purchase_dt;
    }

    public final String component94() {
        return this.ration_card_no;
    }

    public final String component95() {
        return this.regn_dt;
    }

    public final Object component96() {
        return this.regn_dtAsDate;
    }

    public final String component97() {
        return this.regn_no;
    }

    public final String component98() {
        return this.regn_type;
    }

    public final String component99() {
        return this.regn_type_descr;
    }

    public final OwnerdetailsModel copy(String str, String str2, int i10, Object obj, String str3, String str4, String str5, String str6, String str7, int i11, String str8, Object obj2, int i12, String str9, String str10, String str11, Object obj3, String str12, boolean z10, double d10, String str13, int i13, Object obj4, Object obj5, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Object obj6, Object obj7, String str24, String str25, Object obj8, Object obj9, Object obj10, double d11, Object obj11, int i14, String str26, String str27, int i15, int i16, double d12, String str28, String str29, a aVar, int i17, int i18, int i19, String str30, int i20, int i21, Object obj12, long j10, String str31, String str32, int i22, Object obj13, int i23, String str33, Object obj14, int i24, String str34, String str35, int i25, Object obj15, b bVar, int i26, String str36, int i27, String str37, int i28, String str38, String str39, String str40, int i29, String str41, int i30, String str42, String str43, String str44, String str45, Object obj16, Object obj17, Object obj18, Object obj19, String str46, String str47, String str48, Object obj20, String str49, String str50, String str51, String str52, Object obj21, Object obj22, int i31, int i32, int i33, int i34, String str53, String str54, String str55, String str56, Object obj23, int i35, c cVar, String str57, Object obj24, String str58, Object obj25, String str59, int i36, long j11, int i37, String str60, String str61, String str62, Object obj26, Object obj27, int i38, int i39) {
        String str63 = str;
        l.f(str63, "aadhar_no");
        l.f(str2, "ac_fitted");
        l.f(str3, "audio_fitted");
        l.f(str4, "body_type");
        l.f(str5, "c_add1");
        l.f(str6, "c_add2");
        l.f(str7, "c_add3");
        l.f(str8, "c_district_name");
        l.f(str9, "c_state");
        l.f(str10, "c_state_name");
        l.f(str11, "chasi_no");
        l.f(str12, "color");
        l.f(str13, "dealer_cd");
        l.f(str14, "dl_no");
        l.f(str15, "dlr_add1");
        l.f(str16, "dlr_add2");
        l.f(str17, "dlr_add3");
        l.f(str18, "dlr_city");
        l.f(str19, "dlr_district");
        l.f(str20, "dlr_name");
        l.f(str21, "dlr_pincode");
        l.f(str22, "email_id");
        l.f(str23, "eng_no");
        l.f(str24, "f_name");
        l.f(str25, "fit_upto");
        l.f(str26, "fuel_descr");
        l.f(str27, "garage_add");
        l.f(str28, "imported_vch");
        l.f(str29, "laser_code");
        l.f(aVar, "latesttaxdetails");
        l.f(str30, "maker_name");
        l.f(str31, "model_cd");
        l.f(str32, "model_name");
        l.f(str33, "norms_descr");
        l.f(str34, "off_name");
        l.f(str35, "op_dt");
        l.f(bVar, "ownerIdentification");
        l.f(str36, "owner_cd_descr");
        l.f(str37, "owner_name");
        l.f(str38, "p_add1");
        l.f(str39, "p_add2");
        l.f(str40, "p_add3");
        l.f(str41, "p_district_name");
        l.f(str42, "p_state");
        l.f(str43, "p_state_name");
        l.f(str44, "pan_no");
        l.f(str45, "passport_no");
        l.f(str46, "purchase_dt");
        l.f(str47, "ration_card_no");
        l.f(str48, "regn_dt");
        l.f(str49, "regn_no");
        l.f(str50, "regn_type");
        l.f(str51, "regn_type_descr");
        l.f(str52, "regn_upto");
        l.f(str53, "state_cd");
        l.f(str54, "state_name");
        l.f(str55, "status");
        l.f(str56, "tax_mode");
        l.f(cVar, "vTHypthEntity");
        l.f(str57, "vch_catg");
        l.f(str58, "vch_purchase_as");
        l.f(str59, "vehType");
        l.f(str60, "vh_class_desc");
        l.f(str61, "video_fitted");
        l.f(str62, "voter_id");
        return new OwnerdetailsModel(str63, str2, i10, obj, str3, str4, str5, str6, str7, i11, str8, obj2, i12, str9, str10, str11, obj3, str12, z10, d10, str13, i13, obj4, obj5, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, obj6, obj7, str24, str25, obj8, obj9, obj10, d11, obj11, i14, str26, str27, i15, i16, d12, str28, str29, aVar, i17, i18, i19, str30, i20, i21, obj12, j10, str31, str32, i22, obj13, i23, str33, obj14, i24, str34, str35, i25, obj15, bVar, i26, str36, i27, str37, i28, str38, str39, str40, i29, str41, i30, str42, str43, str44, str45, obj16, obj17, obj18, obj19, str46, str47, str48, obj20, str49, str50, str51, str52, obj21, obj22, i31, i32, i33, i34, str53, str54, str55, str56, obj23, i35, cVar, str57, obj24, str58, obj25, str59, i36, j11, i37, str60, str61, str62, obj26, obj27, i38, i39);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerdetailsModel)) {
            return false;
        }
        OwnerdetailsModel ownerdetailsModel = (OwnerdetailsModel) obj;
        return l.a(this.aadhar_no, ownerdetailsModel.aadhar_no) && l.a(this.ac_fitted, ownerdetailsModel.ac_fitted) && this.annual_income == ownerdetailsModel.annual_income && l.a(this.appl_no, ownerdetailsModel.appl_no) && l.a(this.audio_fitted, ownerdetailsModel.audio_fitted) && l.a(this.body_type, ownerdetailsModel.body_type) && l.a(this.c_add1, ownerdetailsModel.c_add1) && l.a(this.c_add2, ownerdetailsModel.c_add2) && l.a(this.c_add3, ownerdetailsModel.c_add3) && this.c_district == ownerdetailsModel.c_district && l.a(this.c_district_name, ownerdetailsModel.c_district_name) && l.a(this.c_off_cd, ownerdetailsModel.c_off_cd) && this.c_pincode == ownerdetailsModel.c_pincode && l.a(this.c_state, ownerdetailsModel.c_state) && l.a(this.c_state_name, ownerdetailsModel.c_state_name) && l.a(this.chasi_no, ownerdetailsModel.chasi_no) && l.a(this.chasi_no_original, ownerdetailsModel.chasi_no_original) && l.a(this.color, ownerdetailsModel.color) && this.conditionstatus == ownerdetailsModel.conditionstatus && Double.compare(this.cubic_cap, ownerdetailsModel.cubic_cap) == 0 && l.a(this.dealer_cd, ownerdetailsModel.dealer_cd) && this.dept_cd == ownerdetailsModel.dept_cd && l.a(this.dlRequired, ownerdetailsModel.dlRequired) && l.a(this.dlValidationRequired, ownerdetailsModel.dlValidationRequired) && l.a(this.dl_no, ownerdetailsModel.dl_no) && l.a(this.dlr_add1, ownerdetailsModel.dlr_add1) && l.a(this.dlr_add2, ownerdetailsModel.dlr_add2) && l.a(this.dlr_add3, ownerdetailsModel.dlr_add3) && l.a(this.dlr_city, ownerdetailsModel.dlr_city) && l.a(this.dlr_district, ownerdetailsModel.dlr_district) && l.a(this.dlr_name, ownerdetailsModel.dlr_name) && l.a(this.dlr_pincode, ownerdetailsModel.dlr_pincode) && l.a(this.email_id, ownerdetailsModel.email_id) && l.a(this.eng_no, ownerdetailsModel.eng_no) && l.a(this.eng_no_original, ownerdetailsModel.eng_no_original) && l.a(this.eng_no_orignal, ownerdetailsModel.eng_no_orignal) && l.a(this.f_name, ownerdetailsModel.f_name) && l.a(this.fit_upto, ownerdetailsModel.fit_upto) && l.a(this.fit_uptoAsDate, ownerdetailsModel.fit_uptoAsDate) && l.a(this.fit_upto_desc, ownerdetailsModel.fit_upto_desc) && l.a(this.flag, ownerdetailsModel.flag) && Double.compare(this.floor_area, ownerdetailsModel.floor_area) == 0 && l.a(this.formatRegn_dt, ownerdetailsModel.formatRegn_dt) && this.fuel == ownerdetailsModel.fuel && l.a(this.fuel_descr, ownerdetailsModel.fuel_descr) && l.a(this.garage_add, ownerdetailsModel.garage_add) && this.gcw == ownerdetailsModel.gcw && this.height == ownerdetailsModel.height && Double.compare(this.f20462hp, ownerdetailsModel.f20462hp) == 0 && l.a(this.imported_vch, ownerdetailsModel.imported_vch) && l.a(this.laser_code, ownerdetailsModel.laser_code) && l.a((Object) null, (Object) null) && this.ld_wt == ownerdetailsModel.ld_wt && this.length == ownerdetailsModel.length && this.maker == ownerdetailsModel.maker && l.a(this.maker_name, ownerdetailsModel.maker_name) && this.manu_mon == ownerdetailsModel.manu_mon && this.manu_yr == ownerdetailsModel.manu_yr && l.a(this.mobileNoEditable, ownerdetailsModel.mobileNoEditable) && this.mobile_no == ownerdetailsModel.mobile_no && l.a(this.model_cd, ownerdetailsModel.model_cd) && l.a(this.model_name, ownerdetailsModel.model_name) && this.no_cyl == ownerdetailsModel.no_cyl && l.a(this.no_of_axles, ownerdetailsModel.no_of_axles) && this.norms == ownerdetailsModel.norms && l.a(this.norms_descr, ownerdetailsModel.norms_descr) && l.a(this.numberOfTyres, ownerdetailsModel.numberOfTyres) && this.off_cd == ownerdetailsModel.off_cd && l.a(this.off_name, ownerdetailsModel.off_name) && l.a(this.op_dt, ownerdetailsModel.op_dt) && this.other_criteria == ownerdetailsModel.other_criteria && l.a(this.ownerCatg, ownerdetailsModel.ownerCatg) && l.a((Object) null, (Object) null) && this.owner_cd == ownerdetailsModel.owner_cd && l.a(this.owner_cd_descr, ownerdetailsModel.owner_cd_descr) && this.owner_ctg == ownerdetailsModel.owner_ctg && l.a(this.owner_name, ownerdetailsModel.owner_name) && this.owner_sr == ownerdetailsModel.owner_sr && l.a(this.p_add1, ownerdetailsModel.p_add1) && l.a(this.p_add2, ownerdetailsModel.p_add2) && l.a(this.p_add3, ownerdetailsModel.p_add3) && this.p_district == ownerdetailsModel.p_district && l.a(this.p_district_name, ownerdetailsModel.p_district_name) && this.p_pincode == ownerdetailsModel.p_pincode && l.a(this.p_state, ownerdetailsModel.p_state) && l.a(this.p_state_name, ownerdetailsModel.p_state_name) && l.a(this.pan_no, ownerdetailsModel.pan_no) && l.a(this.passport_no, ownerdetailsModel.passport_no) && l.a(this.permitDetailDto, ownerdetailsModel.permitDetailDto) && l.a(this.permitDetailEntity, ownerdetailsModel.permitDetailEntity) && l.a(this.permit_rto_cd, ownerdetailsModel.permit_rto_cd) && l.a(this.purchase_date, ownerdetailsModel.purchase_date) && l.a(this.purchase_dt, ownerdetailsModel.purchase_dt) && l.a(this.ration_card_no, ownerdetailsModel.ration_card_no) && l.a(this.regn_dt, ownerdetailsModel.regn_dt) && l.a(this.regn_dtAsDate, ownerdetailsModel.regn_dtAsDate) && l.a(this.regn_no, ownerdetailsModel.regn_no) && l.a(this.regn_type, ownerdetailsModel.regn_type) && l.a(this.regn_type_descr, ownerdetailsModel.regn_type_descr) && l.a(this.regn_upto, ownerdetailsModel.regn_upto) && l.a(this.regn_uptoAsDate, ownerdetailsModel.regn_uptoAsDate) && l.a(this.returnMessge, ownerdetailsModel.returnMessge) && this.sale_amt == ownerdetailsModel.sale_amt && this.seat_cap == ownerdetailsModel.seat_cap && this.sleeper_cap == ownerdetailsModel.sleeper_cap && this.stand_cap == ownerdetailsModel.stand_cap && l.a(this.state_cd, ownerdetailsModel.state_cd) && l.a(this.state_name, ownerdetailsModel.state_name) && l.a(this.status, ownerdetailsModel.status) && l.a(this.tax_mode, ownerdetailsModel.tax_mode) && l.a(this.transport_catg, ownerdetailsModel.transport_catg) && this.unld_wt == ownerdetailsModel.unld_wt && l.a((Object) null, (Object) null) && l.a(this.vch_catg, ownerdetailsModel.vch_catg) && l.a(this.vch_catg_desc, ownerdetailsModel.vch_catg_desc) && l.a(this.vch_purchase_as, ownerdetailsModel.vch_purchase_as) && l.a(this.vch_purchase_asCode, ownerdetailsModel.vch_purchase_asCode) && l.a(this.vehType, ownerdetailsModel.vehType) && this.vehTypeAsInt == ownerdetailsModel.vehTypeAsInt && this.verified_on == ownerdetailsModel.verified_on && this.vh_class == ownerdetailsModel.vh_class && l.a(this.vh_class_desc, ownerdetailsModel.vh_class_desc) && l.a(this.video_fitted, ownerdetailsModel.video_fitted) && l.a(this.voter_id, ownerdetailsModel.voter_id) && l.a(this.vtInsuranceCommonDto, ownerdetailsModel.vtInsuranceCommonDto) && l.a(this.vtpucc, ownerdetailsModel.vtpucc) && this.wheelbase == ownerdetailsModel.wheelbase && this.width == ownerdetailsModel.width;
    }

    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    public final String getAc_fitted() {
        return this.ac_fitted;
    }

    public final int getAnnual_income() {
        return this.annual_income;
    }

    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final String getAudio_fitted() {
        return this.audio_fitted;
    }

    public final String getBody_type() {
        return this.body_type;
    }

    public final String getC_add1() {
        return this.c_add1;
    }

    public final String getC_add2() {
        return this.c_add2;
    }

    public final String getC_add3() {
        return this.c_add3;
    }

    public final int getC_district() {
        return this.c_district;
    }

    public final String getC_district_name() {
        return this.c_district_name;
    }

    public final Object getC_off_cd() {
        return this.c_off_cd;
    }

    public final int getC_pincode() {
        return this.c_pincode;
    }

    public final String getC_state() {
        return this.c_state;
    }

    public final String getC_state_name() {
        return this.c_state_name;
    }

    public final String getChasi_no() {
        return this.chasi_no;
    }

    public final Object getChasi_no_original() {
        return this.chasi_no_original;
    }

    public final String getColor() {
        return this.color;
    }

    public final boolean getConditionstatus() {
        return this.conditionstatus;
    }

    public final double getCubic_cap() {
        return this.cubic_cap;
    }

    public final String getDealer_cd() {
        return this.dealer_cd;
    }

    public final int getDept_cd() {
        return this.dept_cd;
    }

    public final Object getDlRequired() {
        return this.dlRequired;
    }

    public final Object getDlValidationRequired() {
        return this.dlValidationRequired;
    }

    public final String getDl_no() {
        return this.dl_no;
    }

    public final String getDlr_add1() {
        return this.dlr_add1;
    }

    public final String getDlr_add2() {
        return this.dlr_add2;
    }

    public final String getDlr_add3() {
        return this.dlr_add3;
    }

    public final String getDlr_city() {
        return this.dlr_city;
    }

    public final String getDlr_district() {
        return this.dlr_district;
    }

    public final String getDlr_name() {
        return this.dlr_name;
    }

    public final String getDlr_pincode() {
        return this.dlr_pincode;
    }

    public final String getEmail_id() {
        return this.email_id;
    }

    public final String getEng_no() {
        return this.eng_no;
    }

    public final Object getEng_no_original() {
        return this.eng_no_original;
    }

    public final Object getEng_no_orignal() {
        return this.eng_no_orignal;
    }

    public final String getF_name() {
        return this.f_name;
    }

    public final String getFit_upto() {
        return this.fit_upto;
    }

    public final Object getFit_uptoAsDate() {
        return this.fit_uptoAsDate;
    }

    public final Object getFit_upto_desc() {
        return this.fit_upto_desc;
    }

    public final Object getFlag() {
        return this.flag;
    }

    public final double getFloor_area() {
        return this.floor_area;
    }

    public final Object getFormatRegn_dt() {
        return this.formatRegn_dt;
    }

    public final int getFuel() {
        return this.fuel;
    }

    public final String getFuel_descr() {
        return this.fuel_descr;
    }

    public final String getGarage_add() {
        return this.garage_add;
    }

    public final int getGcw() {
        return this.gcw;
    }

    public final int getHeight() {
        return this.height;
    }

    public final double getHp() {
        return this.f20462hp;
    }

    public final String getImported_vch() {
        return this.imported_vch;
    }

    public final String getLaser_code() {
        return this.laser_code;
    }

    public final a getLatesttaxdetails() {
        return null;
    }

    public final int getLd_wt() {
        return this.ld_wt;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getMaker() {
        return this.maker;
    }

    public final String getMaker_name() {
        return this.maker_name;
    }

    public final int getManu_mon() {
        return this.manu_mon;
    }

    public final int getManu_yr() {
        return this.manu_yr;
    }

    public final Object getMobileNoEditable() {
        return this.mobileNoEditable;
    }

    public final long getMobile_no() {
        return this.mobile_no;
    }

    public final String getModel_cd() {
        return this.model_cd;
    }

    public final String getModel_name() {
        return this.model_name;
    }

    public final int getNo_cyl() {
        return this.no_cyl;
    }

    public final Object getNo_of_axles() {
        return this.no_of_axles;
    }

    public final int getNorms() {
        return this.norms;
    }

    public final String getNorms_descr() {
        return this.norms_descr;
    }

    public final Object getNumberOfTyres() {
        return this.numberOfTyres;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOff_name() {
        return this.off_name;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final int getOther_criteria() {
        return this.other_criteria;
    }

    public final Object getOwnerCatg() {
        return this.ownerCatg;
    }

    public final b getOwnerIdentification() {
        return null;
    }

    public final int getOwner_cd() {
        return this.owner_cd;
    }

    public final String getOwner_cd_descr() {
        return this.owner_cd_descr;
    }

    public final int getOwner_ctg() {
        return this.owner_ctg;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final int getOwner_sr() {
        return this.owner_sr;
    }

    public final String getP_add1() {
        return this.p_add1;
    }

    public final String getP_add2() {
        return this.p_add2;
    }

    public final String getP_add3() {
        return this.p_add3;
    }

    public final int getP_district() {
        return this.p_district;
    }

    public final String getP_district_name() {
        return this.p_district_name;
    }

    public final int getP_pincode() {
        return this.p_pincode;
    }

    public final String getP_state() {
        return this.p_state;
    }

    public final String getP_state_name() {
        return this.p_state_name;
    }

    public final String getPan_no() {
        return this.pan_no;
    }

    public final String getPassport_no() {
        return this.passport_no;
    }

    public final Object getPermitDetailDto() {
        return this.permitDetailDto;
    }

    public final Object getPermitDetailEntity() {
        return this.permitDetailEntity;
    }

    public final Object getPermit_rto_cd() {
        return this.permit_rto_cd;
    }

    public final Object getPurchase_date() {
        return this.purchase_date;
    }

    public final String getPurchase_dt() {
        return this.purchase_dt;
    }

    public final String getRation_card_no() {
        return this.ration_card_no;
    }

    public final String getRegn_dt() {
        return this.regn_dt;
    }

    public final Object getRegn_dtAsDate() {
        return this.regn_dtAsDate;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getRegn_type() {
        return this.regn_type;
    }

    public final String getRegn_type_descr() {
        return this.regn_type_descr;
    }

    public final String getRegn_upto() {
        return this.regn_upto;
    }

    public final Object getRegn_uptoAsDate() {
        return this.regn_uptoAsDate;
    }

    public final Object getReturnMessge() {
        return this.returnMessge;
    }

    public final int getSale_amt() {
        return this.sale_amt;
    }

    public final int getSeat_cap() {
        return this.seat_cap;
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

    public final String getState_name() {
        return this.state_name;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTax_mode() {
        return this.tax_mode;
    }

    public final Object getTransport_catg() {
        return this.transport_catg;
    }

    public final int getUnld_wt() {
        return this.unld_wt;
    }

    public final c getVTHypthEntity() {
        return null;
    }

    public final String getVch_catg() {
        return this.vch_catg;
    }

    public final Object getVch_catg_desc() {
        return this.vch_catg_desc;
    }

    public final String getVch_purchase_as() {
        return this.vch_purchase_as;
    }

    public final Object getVch_purchase_asCode() {
        return this.vch_purchase_asCode;
    }

    public final String getVehType() {
        return this.vehType;
    }

    public final int getVehTypeAsInt() {
        return this.vehTypeAsInt;
    }

    public final long getVerified_on() {
        return this.verified_on;
    }

    public final int getVh_class() {
        return this.vh_class;
    }

    public final String getVh_class_desc() {
        return this.vh_class_desc;
    }

    public final String getVideo_fitted() {
        return this.video_fitted;
    }

    public final String getVoter_id() {
        return this.voter_id;
    }

    public final Object getVtInsuranceCommonDto() {
        return this.vtInsuranceCommonDto;
    }

    public final Object getVtpucc() {
        return this.vtpucc;
    }

    public final int getWheelbase() {
        return this.wheelbase;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        this.aadhar_no.hashCode();
        this.ac_fitted.hashCode();
        Integer.hashCode(this.annual_income);
        Object obj = this.appl_no;
        if (obj != null) {
            obj.hashCode();
        }
        this.audio_fitted.hashCode();
        this.body_type.hashCode();
        this.c_add1.hashCode();
        this.c_add2.hashCode();
        this.c_add3.hashCode();
        Integer.hashCode(this.c_district);
        this.c_district_name.hashCode();
        Object obj2 = this.c_off_cd;
        if (obj2 != null) {
            obj2.hashCode();
        }
        Integer.hashCode(this.c_pincode);
        this.c_state.hashCode();
        this.c_state_name.hashCode();
        this.chasi_no.hashCode();
        Object obj3 = this.chasi_no_original;
        if (obj3 != null) {
            obj3.hashCode();
        }
        this.color.hashCode();
        Double.hashCode(this.cubic_cap);
        this.dealer_cd.hashCode();
        Integer.hashCode(this.dept_cd);
        Object obj4 = this.dlRequired;
        if (obj4 != null) {
            obj4.hashCode();
        }
        Object obj5 = this.dlValidationRequired;
        if (obj5 != null) {
            obj5.hashCode();
        }
        this.dl_no.hashCode();
        this.dlr_add1.hashCode();
        this.dlr_add2.hashCode();
        this.dlr_add3.hashCode();
        this.dlr_city.hashCode();
        this.dlr_district.hashCode();
        this.dlr_name.hashCode();
        this.dlr_pincode.hashCode();
        this.email_id.hashCode();
        this.eng_no.hashCode();
        Object obj6 = this.eng_no_original;
        if (obj6 != null) {
            obj6.hashCode();
        }
        Object obj7 = this.eng_no_orignal;
        if (obj7 != null) {
            obj7.hashCode();
        }
        this.f_name.hashCode();
        this.fit_upto.hashCode();
        Object obj8 = this.fit_uptoAsDate;
        if (obj8 != null) {
            obj8.hashCode();
        }
        Object obj9 = this.fit_upto_desc;
        if (obj9 != null) {
            obj9.hashCode();
        }
        Object obj10 = this.flag;
        if (obj10 != null) {
            obj10.hashCode();
        }
        Double.hashCode(this.floor_area);
        Object obj11 = this.formatRegn_dt;
        if (obj11 != null) {
            obj11.hashCode();
        }
        Integer.hashCode(this.fuel);
        this.fuel_descr.hashCode();
        this.garage_add.hashCode();
        Integer.hashCode(this.gcw);
        Integer.hashCode(this.height);
        Double.hashCode(this.f20462hp);
        this.imported_vch.hashCode();
        this.laser_code.hashCode();
        throw null;
    }

    public String toString() {
        return "OwnerdetailsModel(aadhar_no=" + this.aadhar_no + ", ac_fitted=" + this.ac_fitted + ", annual_income=" + this.annual_income + ", appl_no=" + this.appl_no + ", audio_fitted=" + this.audio_fitted + ", body_type=" + this.body_type + ", c_add1=" + this.c_add1 + ", c_add2=" + this.c_add2 + ", c_add3=" + this.c_add3 + ", c_district=" + this.c_district + ", c_district_name=" + this.c_district_name + ", c_off_cd=" + this.c_off_cd + ", c_pincode=" + this.c_pincode + ", c_state=" + this.c_state + ", c_state_name=" + this.c_state_name + ", chasi_no=" + this.chasi_no + ", chasi_no_original=" + this.chasi_no_original + ", color=" + this.color + ", conditionstatus=" + this.conditionstatus + ", cubic_cap=" + this.cubic_cap + ", dealer_cd=" + this.dealer_cd + ", dept_cd=" + this.dept_cd + ", dlRequired=" + this.dlRequired + ", dlValidationRequired=" + this.dlValidationRequired + ", dl_no=" + this.dl_no + ", dlr_add1=" + this.dlr_add1 + ", dlr_add2=" + this.dlr_add2 + ", dlr_add3=" + this.dlr_add3 + ", dlr_city=" + this.dlr_city + ", dlr_district=" + this.dlr_district + ", dlr_name=" + this.dlr_name + ", dlr_pincode=" + this.dlr_pincode + ", email_id=" + this.email_id + ", eng_no=" + this.eng_no + ", eng_no_original=" + this.eng_no_original + ", eng_no_orignal=" + this.eng_no_orignal + ", f_name=" + this.f_name + ", fit_upto=" + this.fit_upto + ", fit_uptoAsDate=" + this.fit_uptoAsDate + ", fit_upto_desc=" + this.fit_upto_desc + ", flag=" + this.flag + ", floor_area=" + this.floor_area + ", formatRegn_dt=" + this.formatRegn_dt + ", fuel=" + this.fuel + ", fuel_descr=" + this.fuel_descr + ", garage_add=" + this.garage_add + ", gcw=" + this.gcw + ", height=" + this.height + ", hp=" + this.f20462hp + ", imported_vch=" + this.imported_vch + ", laser_code=" + this.laser_code + ", latesttaxdetails=" + null + ", ld_wt=" + this.ld_wt + ", length=" + this.length + ", maker=" + this.maker + ", maker_name=" + this.maker_name + ", manu_mon=" + this.manu_mon + ", manu_yr=" + this.manu_yr + ", mobileNoEditable=" + this.mobileNoEditable + ", mobile_no=" + this.mobile_no + ", model_cd=" + this.model_cd + ", model_name=" + this.model_name + ", no_cyl=" + this.no_cyl + ", no_of_axles=" + this.no_of_axles + ", norms=" + this.norms + ", norms_descr=" + this.norms_descr + ", numberOfTyres=" + this.numberOfTyres + ", off_cd=" + this.off_cd + ", off_name=" + this.off_name + ", op_dt=" + this.op_dt + ", other_criteria=" + this.other_criteria + ", ownerCatg=" + this.ownerCatg + ", ownerIdentification=" + null + ", owner_cd=" + this.owner_cd + ", owner_cd_descr=" + this.owner_cd_descr + ", owner_ctg=" + this.owner_ctg + ", owner_name=" + this.owner_name + ", owner_sr=" + this.owner_sr + ", p_add1=" + this.p_add1 + ", p_add2=" + this.p_add2 + ", p_add3=" + this.p_add3 + ", p_district=" + this.p_district + ", p_district_name=" + this.p_district_name + ", p_pincode=" + this.p_pincode + ", p_state=" + this.p_state + ", p_state_name=" + this.p_state_name + ", pan_no=" + this.pan_no + ", passport_no=" + this.passport_no + ", permitDetailDto=" + this.permitDetailDto + ", permitDetailEntity=" + this.permitDetailEntity + ", permit_rto_cd=" + this.permit_rto_cd + ", purchase_date=" + this.purchase_date + ", purchase_dt=" + this.purchase_dt + ", ration_card_no=" + this.ration_card_no + ", regn_dt=" + this.regn_dt + ", regn_dtAsDate=" + this.regn_dtAsDate + ", regn_no=" + this.regn_no + ", regn_type=" + this.regn_type + ", regn_type_descr=" + this.regn_type_descr + ", regn_upto=" + this.regn_upto + ", regn_uptoAsDate=" + this.regn_uptoAsDate + ", returnMessge=" + this.returnMessge + ", sale_amt=" + this.sale_amt + ", seat_cap=" + this.seat_cap + ", sleeper_cap=" + this.sleeper_cap + ", stand_cap=" + this.stand_cap + ", state_cd=" + this.state_cd + ", state_name=" + this.state_name + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", transport_catg=" + this.transport_catg + ", unld_wt=" + this.unld_wt + ", vTHypthEntity=" + null + ", vch_catg=" + this.vch_catg + ", vch_catg_desc=" + this.vch_catg_desc + ", vch_purchase_as=" + this.vch_purchase_as + ", vch_purchase_asCode=" + this.vch_purchase_asCode + ", vehType=" + this.vehType + ", vehTypeAsInt=" + this.vehTypeAsInt + ", verified_on=" + this.verified_on + ", vh_class=" + this.vh_class + ", vh_class_desc=" + this.vh_class_desc + ", video_fitted=" + this.video_fitted + ", voter_id=" + this.voter_id + ", vtInsuranceCommonDto=" + this.vtInsuranceCommonDto + ", vtpucc=" + this.vtpucc + ", wheelbase=" + this.wheelbase + ", width=" + this.width + ')';
    }
}
