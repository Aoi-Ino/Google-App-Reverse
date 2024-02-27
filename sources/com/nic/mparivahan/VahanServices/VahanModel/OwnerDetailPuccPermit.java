package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanServices.Model.VTHypthEntity;

@Keep
public final class OwnerDetailPuccPermit {
    private final String aadhar_no;
    private final String ac_fitted;
    private final Integer annual_income;
    private final Object appl_no;
    private final String audio_fitted;
    private final String body_type;
    private final String c_add1;
    private final String c_add2;
    private final String c_add3;
    private final Integer c_district;
    private final String c_district_name;
    private final Object c_off_cd;
    private final Integer c_pincode;
    private final String c_state;
    private final String c_state_name;
    private final String chasi_no;
    private final Object chasi_no_original;
    private final String color;
    private final Boolean conditionstatus;
    private final Double cubic_cap;
    private final String dealer_cd;
    private final Integer dept_cd;
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
    private final Integer floor_area;
    private final Object formatRegn_dt;
    private final Integer fuel;
    private final String fuel_descr;
    private final String garage_add;
    private final Integer gcw;
    private final Integer height;

    /* renamed from: hp  reason: collision with root package name */
    private final Double f20977hp;
    private final String imported_vch;
    private final String laser_code;
    private final Latesttaxdetails latesttaxdetails;
    private final Integer ld_wt;
    private final Integer length;
    private final Integer maker;
    private final String maker_name;
    private final Integer manu_mon;
    private final Integer manu_yr;
    private final Object mobileNoEditable;
    private final Long mobile_no;
    private final String model_cd;
    private final String model_name;
    private final Integer no_cyl;
    private final Object no_of_axles;
    private final Integer norms;
    private final String norms_descr;
    private final Object numberOfTyres;
    private final Integer off_cd;
    private final String off_name;
    private final String op_dt;
    private final Integer other_criteria;
    private final Object ownerCatg;
    private final OwnerIdentification ownerIdentification;
    private final Integer owner_cd;
    private final String owner_cd_descr;
    private final Integer owner_ctg;
    private final String owner_name;
    private final Integer owner_sr;
    private final String p_add1;
    private final String p_add2;
    private final String p_add3;
    private final Integer p_district;
    private final String p_district_name;
    private final Integer p_pincode;
    private final String p_state;
    private final String p_state_name;
    private final String pan_no;
    private final String passport_no;
    private final PermitDetailDto permitDetailDto;
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
    private final Integer sale_amt;
    private final Integer seat_cap;
    private final Integer sleeper_cap;
    private final Integer stand_cap;
    private final String state_cd;
    private final String state_name;
    private final String status;
    private final Object tax_mode;
    private final Object transport_catg;
    private final Integer unld_wt;
    private final VTHypthEntity vTHypthEntity;
    private final String vch_catg;
    private final Object vch_catg_desc;
    private final String vch_purchase_as;
    private final Object vch_purchase_asCode;
    private final String vehType;
    private final Integer vehTypeAsInt;
    private final Integer vh_class;
    private final String vh_class_desc;
    private final String video_fitted;
    private final String voter_id;
    private final VtInsuranceCommonDto vtInsuranceCommonDto;
    private final Vtpucc vtpucc;
    private final Integer wheelbase;
    private final Integer width;

    public OwnerDetailPuccPermit(String str, String str2, Integer num, Object obj, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, Object obj2, Integer num3, String str9, String str10, String str11, Object obj3, String str12, Boolean bool, Double d10, String str13, Integer num4, Object obj4, Object obj5, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Object obj6, Object obj7, String str24, String str25, Object obj8, Object obj9, Object obj10, Integer num5, Object obj11, Integer num6, String str26, String str27, Integer num7, Integer num8, Double d11, String str28, String str29, Integer num9, Integer num10, Integer num11, String str30, Integer num12, Integer num13, Object obj12, Long l10, String str31, String str32, Integer num14, Object obj13, Integer num15, String str33, Object obj14, Integer num16, String str34, String str35, Integer num17, Object obj15, OwnerIdentification ownerIdentification2, Integer num18, String str36, Integer num19, String str37, Integer num20, String str38, String str39, String str40, Integer num21, String str41, Integer num22, String str42, String str43, String str44, String str45, Object obj16, Object obj17, Object obj18, String str46, String str47, String str48, Object obj19, String str49, String str50, String str51, String str52, Object obj20, Object obj21, Integer num23, Integer num24, Integer num25, Integer num26, String str53, String str54, String str55, Object obj22, Object obj23, Integer num27, String str56, Object obj24, String str57, Object obj25, String str58, Integer num28, Integer num29, String str59, String str60, String str61, VtInsuranceCommonDto vtInsuranceCommonDto2, Vtpucc vtpucc2, Integer num30, Integer num31, VTHypthEntity vTHypthEntity2, Latesttaxdetails latesttaxdetails2, PermitDetailDto permitDetailDto2) {
        this.aadhar_no = str;
        this.ac_fitted = str2;
        this.annual_income = num;
        this.appl_no = obj;
        this.audio_fitted = str3;
        this.body_type = str4;
        this.c_add1 = str5;
        this.c_add2 = str6;
        this.c_add3 = str7;
        this.c_district = num2;
        this.c_district_name = str8;
        this.c_off_cd = obj2;
        this.c_pincode = num3;
        this.c_state = str9;
        this.c_state_name = str10;
        this.chasi_no = str11;
        this.chasi_no_original = obj3;
        this.color = str12;
        this.conditionstatus = bool;
        this.cubic_cap = d10;
        this.dealer_cd = str13;
        this.dept_cd = num4;
        this.dlRequired = obj4;
        this.dlValidationRequired = obj5;
        this.dl_no = str14;
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
        this.floor_area = num5;
        this.formatRegn_dt = obj11;
        this.fuel = num6;
        this.fuel_descr = str26;
        this.garage_add = str27;
        this.gcw = num7;
        this.height = num8;
        this.f20977hp = d11;
        this.imported_vch = str28;
        this.laser_code = str29;
        this.ld_wt = num9;
        this.length = num10;
        this.maker = num11;
        this.maker_name = str30;
        this.manu_mon = num12;
        this.manu_yr = num13;
        this.mobileNoEditable = obj12;
        this.mobile_no = l10;
        this.model_cd = str31;
        this.model_name = str32;
        this.no_cyl = num14;
        this.no_of_axles = obj13;
        this.norms = num15;
        this.norms_descr = str33;
        this.numberOfTyres = obj14;
        this.off_cd = num16;
        this.off_name = str34;
        this.op_dt = str35;
        this.other_criteria = num17;
        this.ownerCatg = obj15;
        this.ownerIdentification = ownerIdentification2;
        this.owner_cd = num18;
        this.owner_cd_descr = str36;
        this.owner_ctg = num19;
        this.owner_name = str37;
        this.owner_sr = num20;
        this.p_add1 = str38;
        this.p_add2 = str39;
        this.p_add3 = str40;
        this.p_district = num21;
        this.p_district_name = str41;
        this.p_pincode = num22;
        this.p_state = str42;
        this.p_state_name = str43;
        this.pan_no = str44;
        this.passport_no = str45;
        this.permitDetailEntity = obj16;
        this.permit_rto_cd = obj17;
        this.purchase_date = obj18;
        this.purchase_dt = str46;
        this.ration_card_no = str47;
        this.regn_dt = str48;
        this.regn_dtAsDate = obj19;
        this.regn_no = str49;
        this.regn_type = str50;
        this.regn_type_descr = str51;
        this.regn_upto = str52;
        this.regn_uptoAsDate = obj20;
        this.returnMessge = obj21;
        this.sale_amt = num23;
        this.seat_cap = num24;
        this.sleeper_cap = num25;
        this.stand_cap = num26;
        this.state_cd = str53;
        this.state_name = str54;
        this.status = str55;
        this.tax_mode = obj22;
        this.transport_catg = obj23;
        this.unld_wt = num27;
        this.vch_catg = str56;
        this.vch_catg_desc = obj24;
        this.vch_purchase_as = str57;
        this.vch_purchase_asCode = obj25;
        this.vehType = str58;
        this.vehTypeAsInt = num28;
        this.vh_class = num29;
        this.vh_class_desc = str59;
        this.video_fitted = str60;
        this.voter_id = str61;
        this.vtInsuranceCommonDto = vtInsuranceCommonDto2;
        this.vtpucc = vtpucc2;
        this.wheelbase = num30;
        this.width = num31;
        this.vTHypthEntity = vTHypthEntity2;
        this.latesttaxdetails = latesttaxdetails2;
        this.permitDetailDto = permitDetailDto2;
    }

    public static /* synthetic */ OwnerDetailPuccPermit copy$default(OwnerDetailPuccPermit ownerDetailPuccPermit, String str, String str2, Integer num, Object obj, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, Object obj2, Integer num3, String str9, String str10, String str11, Object obj3, String str12, Boolean bool, Double d10, String str13, Integer num4, Object obj4, Object obj5, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Object obj6, Object obj7, String str24, String str25, Object obj8, Object obj9, Object obj10, Integer num5, Object obj11, Integer num6, String str26, String str27, Integer num7, Integer num8, Double d11, String str28, String str29, Integer num9, Integer num10, Integer num11, String str30, Integer num12, Integer num13, Object obj12, Long l10, String str31, String str32, Integer num14, Object obj13, Integer num15, String str33, Object obj14, Integer num16, String str34, String str35, Integer num17, Object obj15, OwnerIdentification ownerIdentification2, Integer num18, String str36, Integer num19, String str37, Integer num20, String str38, String str39, String str40, Integer num21, String str41, Integer num22, String str42, String str43, String str44, String str45, Object obj16, Object obj17, Object obj18, String str46, String str47, String str48, Object obj19, String str49, String str50, String str51, String str52, Object obj20, Object obj21, Integer num23, Integer num24, Integer num25, Integer num26, String str53, String str54, String str55, Object obj22, Object obj23, Integer num27, String str56, Object obj24, String str57, Object obj25, String str58, Integer num28, Integer num29, String str59, String str60, String str61, VtInsuranceCommonDto vtInsuranceCommonDto2, Vtpucc vtpucc2, Integer num30, Integer num31, VTHypthEntity vTHypthEntity2, Latesttaxdetails latesttaxdetails2, PermitDetailDto permitDetailDto2, int i10, int i11, int i12, int i13, Object obj26) {
        OwnerDetailPuccPermit ownerDetailPuccPermit2 = ownerDetailPuccPermit;
        int i14 = i10;
        int i15 = i11;
        int i16 = i12;
        int i17 = i13;
        return ownerDetailPuccPermit.copy((i14 & 1) != 0 ? ownerDetailPuccPermit2.aadhar_no : str, (i14 & 2) != 0 ? ownerDetailPuccPermit2.ac_fitted : str2, (i14 & 4) != 0 ? ownerDetailPuccPermit2.annual_income : num, (i14 & 8) != 0 ? ownerDetailPuccPermit2.appl_no : obj, (i14 & 16) != 0 ? ownerDetailPuccPermit2.audio_fitted : str3, (i14 & 32) != 0 ? ownerDetailPuccPermit2.body_type : str4, (i14 & 64) != 0 ? ownerDetailPuccPermit2.c_add1 : str5, (i14 & 128) != 0 ? ownerDetailPuccPermit2.c_add2 : str6, (i14 & 256) != 0 ? ownerDetailPuccPermit2.c_add3 : str7, (i14 & 512) != 0 ? ownerDetailPuccPermit2.c_district : num2, (i14 & 1024) != 0 ? ownerDetailPuccPermit2.c_district_name : str8, (i14 & 2048) != 0 ? ownerDetailPuccPermit2.c_off_cd : obj2, (i14 & 4096) != 0 ? ownerDetailPuccPermit2.c_pincode : num3, (i14 & 8192) != 0 ? ownerDetailPuccPermit2.c_state : str9, (i14 & 16384) != 0 ? ownerDetailPuccPermit2.c_state_name : str10, (i14 & 32768) != 0 ? ownerDetailPuccPermit2.chasi_no : str11, (i14 & 65536) != 0 ? ownerDetailPuccPermit2.chasi_no_original : obj3, (i14 & 131072) != 0 ? ownerDetailPuccPermit2.color : str12, (i14 & 262144) != 0 ? ownerDetailPuccPermit2.conditionstatus : bool, (i14 & 524288) != 0 ? ownerDetailPuccPermit2.cubic_cap : d10, (i14 & 1048576) != 0 ? ownerDetailPuccPermit2.dealer_cd : str13, (i14 & 2097152) != 0 ? ownerDetailPuccPermit2.dept_cd : num4, (i14 & 4194304) != 0 ? ownerDetailPuccPermit2.dlRequired : obj4, (i14 & 8388608) != 0 ? ownerDetailPuccPermit2.dlValidationRequired : obj5, (i14 & 16777216) != 0 ? ownerDetailPuccPermit2.dl_no : str14, (i14 & 33554432) != 0 ? ownerDetailPuccPermit2.dlr_add1 : str15, (i14 & 67108864) != 0 ? ownerDetailPuccPermit2.dlr_add2 : str16, (i14 & 134217728) != 0 ? ownerDetailPuccPermit2.dlr_add3 : str17, (i14 & 268435456) != 0 ? ownerDetailPuccPermit2.dlr_city : str18, (i14 & 536870912) != 0 ? ownerDetailPuccPermit2.dlr_district : str19, (i14 & 1073741824) != 0 ? ownerDetailPuccPermit2.dlr_name : str20, (i14 & Integer.MIN_VALUE) != 0 ? ownerDetailPuccPermit2.dlr_pincode : str21, (i15 & 1) != 0 ? ownerDetailPuccPermit2.email_id : str22, (i15 & 2) != 0 ? ownerDetailPuccPermit2.eng_no : str23, (i15 & 4) != 0 ? ownerDetailPuccPermit2.eng_no_original : obj6, (i15 & 8) != 0 ? ownerDetailPuccPermit2.eng_no_orignal : obj7, (i15 & 16) != 0 ? ownerDetailPuccPermit2.f_name : str24, (i15 & 32) != 0 ? ownerDetailPuccPermit2.fit_upto : str25, (i15 & 64) != 0 ? ownerDetailPuccPermit2.fit_uptoAsDate : obj8, (i15 & 128) != 0 ? ownerDetailPuccPermit2.fit_upto_desc : obj9, (i15 & 256) != 0 ? ownerDetailPuccPermit2.flag : obj10, (i15 & 512) != 0 ? ownerDetailPuccPermit2.floor_area : num5, (i15 & 1024) != 0 ? ownerDetailPuccPermit2.formatRegn_dt : obj11, (i15 & 2048) != 0 ? ownerDetailPuccPermit2.fuel : num6, (i15 & 4096) != 0 ? ownerDetailPuccPermit2.fuel_descr : str26, (i15 & 8192) != 0 ? ownerDetailPuccPermit2.garage_add : str27, (i15 & 16384) != 0 ? ownerDetailPuccPermit2.gcw : num7, (i15 & 32768) != 0 ? ownerDetailPuccPermit2.height : num8, (i15 & 65536) != 0 ? ownerDetailPuccPermit2.f20977hp : d11, (i15 & 131072) != 0 ? ownerDetailPuccPermit2.imported_vch : str28, (i15 & 262144) != 0 ? ownerDetailPuccPermit2.laser_code : str29, (i15 & 524288) != 0 ? ownerDetailPuccPermit2.ld_wt : num9, (i15 & 1048576) != 0 ? ownerDetailPuccPermit2.length : num10, (i15 & 2097152) != 0 ? ownerDetailPuccPermit2.maker : num11, (i15 & 4194304) != 0 ? ownerDetailPuccPermit2.maker_name : str30, (i15 & 8388608) != 0 ? ownerDetailPuccPermit2.manu_mon : num12, (i15 & 16777216) != 0 ? ownerDetailPuccPermit2.manu_yr : num13, (i15 & 33554432) != 0 ? ownerDetailPuccPermit2.mobileNoEditable : obj12, (i15 & 67108864) != 0 ? ownerDetailPuccPermit2.mobile_no : l10, (i15 & 134217728) != 0 ? ownerDetailPuccPermit2.model_cd : str31, (i15 & 268435456) != 0 ? ownerDetailPuccPermit2.model_name : str32, (i15 & 536870912) != 0 ? ownerDetailPuccPermit2.no_cyl : num14, (i15 & 1073741824) != 0 ? ownerDetailPuccPermit2.no_of_axles : obj13, (i15 & Integer.MIN_VALUE) != 0 ? ownerDetailPuccPermit2.norms : num15, (i16 & 1) != 0 ? ownerDetailPuccPermit2.norms_descr : str33, (i16 & 2) != 0 ? ownerDetailPuccPermit2.numberOfTyres : obj14, (i16 & 4) != 0 ? ownerDetailPuccPermit2.off_cd : num16, (i16 & 8) != 0 ? ownerDetailPuccPermit2.off_name : str34, (i16 & 16) != 0 ? ownerDetailPuccPermit2.op_dt : str35, (i16 & 32) != 0 ? ownerDetailPuccPermit2.other_criteria : num17, (i16 & 64) != 0 ? ownerDetailPuccPermit2.ownerCatg : obj15, (i16 & 128) != 0 ? ownerDetailPuccPermit2.ownerIdentification : ownerIdentification2, (i16 & 256) != 0 ? ownerDetailPuccPermit2.owner_cd : num18, (i16 & 512) != 0 ? ownerDetailPuccPermit2.owner_cd_descr : str36, (i16 & 1024) != 0 ? ownerDetailPuccPermit2.owner_ctg : num19, (i16 & 2048) != 0 ? ownerDetailPuccPermit2.owner_name : str37, (i16 & 4096) != 0 ? ownerDetailPuccPermit2.owner_sr : num20, (i16 & 8192) != 0 ? ownerDetailPuccPermit2.p_add1 : str38, (i16 & 16384) != 0 ? ownerDetailPuccPermit2.p_add2 : str39, (i16 & 32768) != 0 ? ownerDetailPuccPermit2.p_add3 : str40, (i16 & 65536) != 0 ? ownerDetailPuccPermit2.p_district : num21, (i16 & 131072) != 0 ? ownerDetailPuccPermit2.p_district_name : str41, (i16 & 262144) != 0 ? ownerDetailPuccPermit2.p_pincode : num22, (i16 & 524288) != 0 ? ownerDetailPuccPermit2.p_state : str42, (i16 & 1048576) != 0 ? ownerDetailPuccPermit2.p_state_name : str43, (i16 & 2097152) != 0 ? ownerDetailPuccPermit2.pan_no : str44, (i16 & 4194304) != 0 ? ownerDetailPuccPermit2.passport_no : str45, (i16 & 8388608) != 0 ? ownerDetailPuccPermit2.permitDetailEntity : obj16, (i16 & 16777216) != 0 ? ownerDetailPuccPermit2.permit_rto_cd : obj17, (i16 & 33554432) != 0 ? ownerDetailPuccPermit2.purchase_date : obj18, (i16 & 67108864) != 0 ? ownerDetailPuccPermit2.purchase_dt : str46, (i16 & 134217728) != 0 ? ownerDetailPuccPermit2.ration_card_no : str47, (i16 & 268435456) != 0 ? ownerDetailPuccPermit2.regn_dt : str48, (i16 & 536870912) != 0 ? ownerDetailPuccPermit2.regn_dtAsDate : obj19, (i16 & 1073741824) != 0 ? ownerDetailPuccPermit2.regn_no : str49, (i16 & Integer.MIN_VALUE) != 0 ? ownerDetailPuccPermit2.regn_type : str50, (i17 & 1) != 0 ? ownerDetailPuccPermit2.regn_type_descr : str51, (i17 & 2) != 0 ? ownerDetailPuccPermit2.regn_upto : str52, (i17 & 4) != 0 ? ownerDetailPuccPermit2.regn_uptoAsDate : obj20, (i17 & 8) != 0 ? ownerDetailPuccPermit2.returnMessge : obj21, (i17 & 16) != 0 ? ownerDetailPuccPermit2.sale_amt : num23, (i17 & 32) != 0 ? ownerDetailPuccPermit2.seat_cap : num24, (i17 & 64) != 0 ? ownerDetailPuccPermit2.sleeper_cap : num25, (i17 & 128) != 0 ? ownerDetailPuccPermit2.stand_cap : num26, (i17 & 256) != 0 ? ownerDetailPuccPermit2.state_cd : str53, (i17 & 512) != 0 ? ownerDetailPuccPermit2.state_name : str54, (i17 & 1024) != 0 ? ownerDetailPuccPermit2.status : str55, (i17 & 2048) != 0 ? ownerDetailPuccPermit2.tax_mode : obj22, (i17 & 4096) != 0 ? ownerDetailPuccPermit2.transport_catg : obj23, (i17 & 8192) != 0 ? ownerDetailPuccPermit2.unld_wt : num27, (i17 & 16384) != 0 ? ownerDetailPuccPermit2.vch_catg : str56, (i17 & 32768) != 0 ? ownerDetailPuccPermit2.vch_catg_desc : obj24, (i17 & 65536) != 0 ? ownerDetailPuccPermit2.vch_purchase_as : str57, (i17 & 131072) != 0 ? ownerDetailPuccPermit2.vch_purchase_asCode : obj25, (i17 & 262144) != 0 ? ownerDetailPuccPermit2.vehType : str58, (i17 & 524288) != 0 ? ownerDetailPuccPermit2.vehTypeAsInt : num28, (i17 & 1048576) != 0 ? ownerDetailPuccPermit2.vh_class : num29, (i17 & 2097152) != 0 ? ownerDetailPuccPermit2.vh_class_desc : str59, (i17 & 4194304) != 0 ? ownerDetailPuccPermit2.video_fitted : str60, (i17 & 8388608) != 0 ? ownerDetailPuccPermit2.voter_id : str61, (i17 & 16777216) != 0 ? ownerDetailPuccPermit2.vtInsuranceCommonDto : vtInsuranceCommonDto2, (i17 & 33554432) != 0 ? ownerDetailPuccPermit2.vtpucc : vtpucc2, (i17 & 67108864) != 0 ? ownerDetailPuccPermit2.wheelbase : num30, (i17 & 134217728) != 0 ? ownerDetailPuccPermit2.width : num31, (i17 & 268435456) != 0 ? ownerDetailPuccPermit2.vTHypthEntity : vTHypthEntity2, (i17 & 536870912) != 0 ? ownerDetailPuccPermit2.latesttaxdetails : latesttaxdetails2, (i17 & 1073741824) != 0 ? ownerDetailPuccPermit2.permitDetailDto : permitDetailDto2);
    }

    public final String component1() {
        return this.aadhar_no;
    }

    public final Integer component10() {
        return this.c_district;
    }

    public final Object component100() {
        return this.returnMessge;
    }

    public final Integer component101() {
        return this.sale_amt;
    }

    public final Integer component102() {
        return this.seat_cap;
    }

    public final Integer component103() {
        return this.sleeper_cap;
    }

    public final Integer component104() {
        return this.stand_cap;
    }

    public final String component105() {
        return this.state_cd;
    }

    public final String component106() {
        return this.state_name;
    }

    public final String component107() {
        return this.status;
    }

    public final Object component108() {
        return this.tax_mode;
    }

    public final Object component109() {
        return this.transport_catg;
    }

    public final String component11() {
        return this.c_district_name;
    }

    public final Integer component110() {
        return this.unld_wt;
    }

    public final String component111() {
        return this.vch_catg;
    }

    public final Object component112() {
        return this.vch_catg_desc;
    }

    public final String component113() {
        return this.vch_purchase_as;
    }

    public final Object component114() {
        return this.vch_purchase_asCode;
    }

    public final String component115() {
        return this.vehType;
    }

    public final Integer component116() {
        return this.vehTypeAsInt;
    }

    public final Integer component117() {
        return this.vh_class;
    }

    public final String component118() {
        return this.vh_class_desc;
    }

    public final String component119() {
        return this.video_fitted;
    }

    public final Object component12() {
        return this.c_off_cd;
    }

    public final String component120() {
        return this.voter_id;
    }

    public final VtInsuranceCommonDto component121() {
        return this.vtInsuranceCommonDto;
    }

    public final Vtpucc component122() {
        return this.vtpucc;
    }

    public final Integer component123() {
        return this.wheelbase;
    }

    public final Integer component124() {
        return this.width;
    }

    public final VTHypthEntity component125() {
        return this.vTHypthEntity;
    }

    public final Latesttaxdetails component126() {
        return this.latesttaxdetails;
    }

    public final PermitDetailDto component127() {
        return this.permitDetailDto;
    }

    public final Integer component13() {
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

    public final Boolean component19() {
        return this.conditionstatus;
    }

    public final String component2() {
        return this.ac_fitted;
    }

    public final Double component20() {
        return this.cubic_cap;
    }

    public final String component21() {
        return this.dealer_cd;
    }

    public final Integer component22() {
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

    public final Integer component3() {
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

    public final Integer component42() {
        return this.floor_area;
    }

    public final Object component43() {
        return this.formatRegn_dt;
    }

    public final Integer component44() {
        return this.fuel;
    }

    public final String component45() {
        return this.fuel_descr;
    }

    public final String component46() {
        return this.garage_add;
    }

    public final Integer component47() {
        return this.gcw;
    }

    public final Integer component48() {
        return this.height;
    }

    public final Double component49() {
        return this.f20977hp;
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

    public final Integer component52() {
        return this.ld_wt;
    }

    public final Integer component53() {
        return this.length;
    }

    public final Integer component54() {
        return this.maker;
    }

    public final String component55() {
        return this.maker_name;
    }

    public final Integer component56() {
        return this.manu_mon;
    }

    public final Integer component57() {
        return this.manu_yr;
    }

    public final Object component58() {
        return this.mobileNoEditable;
    }

    public final Long component59() {
        return this.mobile_no;
    }

    public final String component6() {
        return this.body_type;
    }

    public final String component60() {
        return this.model_cd;
    }

    public final String component61() {
        return this.model_name;
    }

    public final Integer component62() {
        return this.no_cyl;
    }

    public final Object component63() {
        return this.no_of_axles;
    }

    public final Integer component64() {
        return this.norms;
    }

    public final String component65() {
        return this.norms_descr;
    }

    public final Object component66() {
        return this.numberOfTyres;
    }

    public final Integer component67() {
        return this.off_cd;
    }

    public final String component68() {
        return this.off_name;
    }

    public final String component69() {
        return this.op_dt;
    }

    public final String component7() {
        return this.c_add1;
    }

    public final Integer component70() {
        return this.other_criteria;
    }

    public final Object component71() {
        return this.ownerCatg;
    }

    public final OwnerIdentification component72() {
        return this.ownerIdentification;
    }

    public final Integer component73() {
        return this.owner_cd;
    }

    public final String component74() {
        return this.owner_cd_descr;
    }

    public final Integer component75() {
        return this.owner_ctg;
    }

    public final String component76() {
        return this.owner_name;
    }

    public final Integer component77() {
        return this.owner_sr;
    }

    public final String component78() {
        return this.p_add1;
    }

    public final String component79() {
        return this.p_add2;
    }

    public final String component8() {
        return this.c_add2;
    }

    public final String component80() {
        return this.p_add3;
    }

    public final Integer component81() {
        return this.p_district;
    }

    public final String component82() {
        return this.p_district_name;
    }

    public final Integer component83() {
        return this.p_pincode;
    }

    public final String component84() {
        return this.p_state;
    }

    public final String component85() {
        return this.p_state_name;
    }

    public final String component86() {
        return this.pan_no;
    }

    public final String component87() {
        return this.passport_no;
    }

    public final Object component88() {
        return this.permitDetailEntity;
    }

    public final Object component89() {
        return this.permit_rto_cd;
    }

    public final String component9() {
        return this.c_add3;
    }

    public final Object component90() {
        return this.purchase_date;
    }

    public final String component91() {
        return this.purchase_dt;
    }

    public final String component92() {
        return this.ration_card_no;
    }

    public final String component93() {
        return this.regn_dt;
    }

    public final Object component94() {
        return this.regn_dtAsDate;
    }

    public final String component95() {
        return this.regn_no;
    }

    public final String component96() {
        return this.regn_type;
    }

    public final String component97() {
        return this.regn_type_descr;
    }

    public final String component98() {
        return this.regn_upto;
    }

    public final Object component99() {
        return this.regn_uptoAsDate;
    }

    public final OwnerDetailPuccPermit copy(String str, String str2, Integer num, Object obj, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, Object obj2, Integer num3, String str9, String str10, String str11, Object obj3, String str12, Boolean bool, Double d10, String str13, Integer num4, Object obj4, Object obj5, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Object obj6, Object obj7, String str24, String str25, Object obj8, Object obj9, Object obj10, Integer num5, Object obj11, Integer num6, String str26, String str27, Integer num7, Integer num8, Double d11, String str28, String str29, Integer num9, Integer num10, Integer num11, String str30, Integer num12, Integer num13, Object obj12, Long l10, String str31, String str32, Integer num14, Object obj13, Integer num15, String str33, Object obj14, Integer num16, String str34, String str35, Integer num17, Object obj15, OwnerIdentification ownerIdentification2, Integer num18, String str36, Integer num19, String str37, Integer num20, String str38, String str39, String str40, Integer num21, String str41, Integer num22, String str42, String str43, String str44, String str45, Object obj16, Object obj17, Object obj18, String str46, String str47, String str48, Object obj19, String str49, String str50, String str51, String str52, Object obj20, Object obj21, Integer num23, Integer num24, Integer num25, Integer num26, String str53, String str54, String str55, Object obj22, Object obj23, Integer num27, String str56, Object obj24, String str57, Object obj25, String str58, Integer num28, Integer num29, String str59, String str60, String str61, VtInsuranceCommonDto vtInsuranceCommonDto2, Vtpucc vtpucc2, Integer num30, Integer num31, VTHypthEntity vTHypthEntity2, Latesttaxdetails latesttaxdetails2, PermitDetailDto permitDetailDto2) {
        return new OwnerDetailPuccPermit(str, str2, num, obj, str3, str4, str5, str6, str7, num2, str8, obj2, num3, str9, str10, str11, obj3, str12, bool, d10, str13, num4, obj4, obj5, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, obj6, obj7, str24, str25, obj8, obj9, obj10, num5, obj11, num6, str26, str27, num7, num8, d11, str28, str29, num9, num10, num11, str30, num12, num13, obj12, l10, str31, str32, num14, obj13, num15, str33, obj14, num16, str34, str35, num17, obj15, ownerIdentification2, num18, str36, num19, str37, num20, str38, str39, str40, num21, str41, num22, str42, str43, str44, str45, obj16, obj17, obj18, str46, str47, str48, obj19, str49, str50, str51, str52, obj20, obj21, num23, num24, num25, num26, str53, str54, str55, obj22, obj23, num27, str56, obj24, str57, obj25, str58, num28, num29, str59, str60, str61, vtInsuranceCommonDto2, vtpucc2, num30, num31, vTHypthEntity2, latesttaxdetails2, permitDetailDto2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerDetailPuccPermit)) {
            return false;
        }
        OwnerDetailPuccPermit ownerDetailPuccPermit = (OwnerDetailPuccPermit) obj;
        return l.a(this.aadhar_no, ownerDetailPuccPermit.aadhar_no) && l.a(this.ac_fitted, ownerDetailPuccPermit.ac_fitted) && l.a(this.annual_income, ownerDetailPuccPermit.annual_income) && l.a(this.appl_no, ownerDetailPuccPermit.appl_no) && l.a(this.audio_fitted, ownerDetailPuccPermit.audio_fitted) && l.a(this.body_type, ownerDetailPuccPermit.body_type) && l.a(this.c_add1, ownerDetailPuccPermit.c_add1) && l.a(this.c_add2, ownerDetailPuccPermit.c_add2) && l.a(this.c_add3, ownerDetailPuccPermit.c_add3) && l.a(this.c_district, ownerDetailPuccPermit.c_district) && l.a(this.c_district_name, ownerDetailPuccPermit.c_district_name) && l.a(this.c_off_cd, ownerDetailPuccPermit.c_off_cd) && l.a(this.c_pincode, ownerDetailPuccPermit.c_pincode) && l.a(this.c_state, ownerDetailPuccPermit.c_state) && l.a(this.c_state_name, ownerDetailPuccPermit.c_state_name) && l.a(this.chasi_no, ownerDetailPuccPermit.chasi_no) && l.a(this.chasi_no_original, ownerDetailPuccPermit.chasi_no_original) && l.a(this.color, ownerDetailPuccPermit.color) && l.a(this.conditionstatus, ownerDetailPuccPermit.conditionstatus) && l.a(this.cubic_cap, ownerDetailPuccPermit.cubic_cap) && l.a(this.dealer_cd, ownerDetailPuccPermit.dealer_cd) && l.a(this.dept_cd, ownerDetailPuccPermit.dept_cd) && l.a(this.dlRequired, ownerDetailPuccPermit.dlRequired) && l.a(this.dlValidationRequired, ownerDetailPuccPermit.dlValidationRequired) && l.a(this.dl_no, ownerDetailPuccPermit.dl_no) && l.a(this.dlr_add1, ownerDetailPuccPermit.dlr_add1) && l.a(this.dlr_add2, ownerDetailPuccPermit.dlr_add2) && l.a(this.dlr_add3, ownerDetailPuccPermit.dlr_add3) && l.a(this.dlr_city, ownerDetailPuccPermit.dlr_city) && l.a(this.dlr_district, ownerDetailPuccPermit.dlr_district) && l.a(this.dlr_name, ownerDetailPuccPermit.dlr_name) && l.a(this.dlr_pincode, ownerDetailPuccPermit.dlr_pincode) && l.a(this.email_id, ownerDetailPuccPermit.email_id) && l.a(this.eng_no, ownerDetailPuccPermit.eng_no) && l.a(this.eng_no_original, ownerDetailPuccPermit.eng_no_original) && l.a(this.eng_no_orignal, ownerDetailPuccPermit.eng_no_orignal) && l.a(this.f_name, ownerDetailPuccPermit.f_name) && l.a(this.fit_upto, ownerDetailPuccPermit.fit_upto) && l.a(this.fit_uptoAsDate, ownerDetailPuccPermit.fit_uptoAsDate) && l.a(this.fit_upto_desc, ownerDetailPuccPermit.fit_upto_desc) && l.a(this.flag, ownerDetailPuccPermit.flag) && l.a(this.floor_area, ownerDetailPuccPermit.floor_area) && l.a(this.formatRegn_dt, ownerDetailPuccPermit.formatRegn_dt) && l.a(this.fuel, ownerDetailPuccPermit.fuel) && l.a(this.fuel_descr, ownerDetailPuccPermit.fuel_descr) && l.a(this.garage_add, ownerDetailPuccPermit.garage_add) && l.a(this.gcw, ownerDetailPuccPermit.gcw) && l.a(this.height, ownerDetailPuccPermit.height) && l.a(this.f20977hp, ownerDetailPuccPermit.f20977hp) && l.a(this.imported_vch, ownerDetailPuccPermit.imported_vch) && l.a(this.laser_code, ownerDetailPuccPermit.laser_code) && l.a(this.ld_wt, ownerDetailPuccPermit.ld_wt) && l.a(this.length, ownerDetailPuccPermit.length) && l.a(this.maker, ownerDetailPuccPermit.maker) && l.a(this.maker_name, ownerDetailPuccPermit.maker_name) && l.a(this.manu_mon, ownerDetailPuccPermit.manu_mon) && l.a(this.manu_yr, ownerDetailPuccPermit.manu_yr) && l.a(this.mobileNoEditable, ownerDetailPuccPermit.mobileNoEditable) && l.a(this.mobile_no, ownerDetailPuccPermit.mobile_no) && l.a(this.model_cd, ownerDetailPuccPermit.model_cd) && l.a(this.model_name, ownerDetailPuccPermit.model_name) && l.a(this.no_cyl, ownerDetailPuccPermit.no_cyl) && l.a(this.no_of_axles, ownerDetailPuccPermit.no_of_axles) && l.a(this.norms, ownerDetailPuccPermit.norms) && l.a(this.norms_descr, ownerDetailPuccPermit.norms_descr) && l.a(this.numberOfTyres, ownerDetailPuccPermit.numberOfTyres) && l.a(this.off_cd, ownerDetailPuccPermit.off_cd) && l.a(this.off_name, ownerDetailPuccPermit.off_name) && l.a(this.op_dt, ownerDetailPuccPermit.op_dt) && l.a(this.other_criteria, ownerDetailPuccPermit.other_criteria) && l.a(this.ownerCatg, ownerDetailPuccPermit.ownerCatg) && l.a(this.ownerIdentification, ownerDetailPuccPermit.ownerIdentification) && l.a(this.owner_cd, ownerDetailPuccPermit.owner_cd) && l.a(this.owner_cd_descr, ownerDetailPuccPermit.owner_cd_descr) && l.a(this.owner_ctg, ownerDetailPuccPermit.owner_ctg) && l.a(this.owner_name, ownerDetailPuccPermit.owner_name) && l.a(this.owner_sr, ownerDetailPuccPermit.owner_sr) && l.a(this.p_add1, ownerDetailPuccPermit.p_add1) && l.a(this.p_add2, ownerDetailPuccPermit.p_add2) && l.a(this.p_add3, ownerDetailPuccPermit.p_add3) && l.a(this.p_district, ownerDetailPuccPermit.p_district) && l.a(this.p_district_name, ownerDetailPuccPermit.p_district_name) && l.a(this.p_pincode, ownerDetailPuccPermit.p_pincode) && l.a(this.p_state, ownerDetailPuccPermit.p_state) && l.a(this.p_state_name, ownerDetailPuccPermit.p_state_name) && l.a(this.pan_no, ownerDetailPuccPermit.pan_no) && l.a(this.passport_no, ownerDetailPuccPermit.passport_no) && l.a(this.permitDetailEntity, ownerDetailPuccPermit.permitDetailEntity) && l.a(this.permit_rto_cd, ownerDetailPuccPermit.permit_rto_cd) && l.a(this.purchase_date, ownerDetailPuccPermit.purchase_date) && l.a(this.purchase_dt, ownerDetailPuccPermit.purchase_dt) && l.a(this.ration_card_no, ownerDetailPuccPermit.ration_card_no) && l.a(this.regn_dt, ownerDetailPuccPermit.regn_dt) && l.a(this.regn_dtAsDate, ownerDetailPuccPermit.regn_dtAsDate) && l.a(this.regn_no, ownerDetailPuccPermit.regn_no) && l.a(this.regn_type, ownerDetailPuccPermit.regn_type) && l.a(this.regn_type_descr, ownerDetailPuccPermit.regn_type_descr) && l.a(this.regn_upto, ownerDetailPuccPermit.regn_upto) && l.a(this.regn_uptoAsDate, ownerDetailPuccPermit.regn_uptoAsDate) && l.a(this.returnMessge, ownerDetailPuccPermit.returnMessge) && l.a(this.sale_amt, ownerDetailPuccPermit.sale_amt) && l.a(this.seat_cap, ownerDetailPuccPermit.seat_cap) && l.a(this.sleeper_cap, ownerDetailPuccPermit.sleeper_cap) && l.a(this.stand_cap, ownerDetailPuccPermit.stand_cap) && l.a(this.state_cd, ownerDetailPuccPermit.state_cd) && l.a(this.state_name, ownerDetailPuccPermit.state_name) && l.a(this.status, ownerDetailPuccPermit.status) && l.a(this.tax_mode, ownerDetailPuccPermit.tax_mode) && l.a(this.transport_catg, ownerDetailPuccPermit.transport_catg) && l.a(this.unld_wt, ownerDetailPuccPermit.unld_wt) && l.a(this.vch_catg, ownerDetailPuccPermit.vch_catg) && l.a(this.vch_catg_desc, ownerDetailPuccPermit.vch_catg_desc) && l.a(this.vch_purchase_as, ownerDetailPuccPermit.vch_purchase_as) && l.a(this.vch_purchase_asCode, ownerDetailPuccPermit.vch_purchase_asCode) && l.a(this.vehType, ownerDetailPuccPermit.vehType) && l.a(this.vehTypeAsInt, ownerDetailPuccPermit.vehTypeAsInt) && l.a(this.vh_class, ownerDetailPuccPermit.vh_class) && l.a(this.vh_class_desc, ownerDetailPuccPermit.vh_class_desc) && l.a(this.video_fitted, ownerDetailPuccPermit.video_fitted) && l.a(this.voter_id, ownerDetailPuccPermit.voter_id) && l.a(this.vtInsuranceCommonDto, ownerDetailPuccPermit.vtInsuranceCommonDto) && l.a(this.vtpucc, ownerDetailPuccPermit.vtpucc) && l.a(this.wheelbase, ownerDetailPuccPermit.wheelbase) && l.a(this.width, ownerDetailPuccPermit.width) && l.a(this.vTHypthEntity, ownerDetailPuccPermit.vTHypthEntity) && l.a(this.latesttaxdetails, ownerDetailPuccPermit.latesttaxdetails) && l.a(this.permitDetailDto, ownerDetailPuccPermit.permitDetailDto);
    }

    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    public final String getAc_fitted() {
        return this.ac_fitted;
    }

    public final Integer getAnnual_income() {
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

    public final Integer getC_district() {
        return this.c_district;
    }

    public final String getC_district_name() {
        return this.c_district_name;
    }

    public final Object getC_off_cd() {
        return this.c_off_cd;
    }

    public final Integer getC_pincode() {
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

    public final Boolean getConditionstatus() {
        return this.conditionstatus;
    }

    public final Double getCubic_cap() {
        return this.cubic_cap;
    }

    public final String getDealer_cd() {
        return this.dealer_cd;
    }

    public final Integer getDept_cd() {
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

    public final Integer getFloor_area() {
        return this.floor_area;
    }

    public final Object getFormatRegn_dt() {
        return this.formatRegn_dt;
    }

    public final Integer getFuel() {
        return this.fuel;
    }

    public final String getFuel_descr() {
        return this.fuel_descr;
    }

    public final String getGarage_add() {
        return this.garage_add;
    }

    public final Integer getGcw() {
        return this.gcw;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Double getHp() {
        return this.f20977hp;
    }

    public final String getImported_vch() {
        return this.imported_vch;
    }

    public final String getLaser_code() {
        return this.laser_code;
    }

    public final Latesttaxdetails getLatesttaxdetails() {
        return this.latesttaxdetails;
    }

    public final Integer getLd_wt() {
        return this.ld_wt;
    }

    public final Integer getLength() {
        return this.length;
    }

    public final Integer getMaker() {
        return this.maker;
    }

    public final String getMaker_name() {
        return this.maker_name;
    }

    public final Integer getManu_mon() {
        return this.manu_mon;
    }

    public final Integer getManu_yr() {
        return this.manu_yr;
    }

    public final Object getMobileNoEditable() {
        return this.mobileNoEditable;
    }

    public final Long getMobile_no() {
        return this.mobile_no;
    }

    public final String getModel_cd() {
        return this.model_cd;
    }

    public final String getModel_name() {
        return this.model_name;
    }

    public final Integer getNo_cyl() {
        return this.no_cyl;
    }

    public final Object getNo_of_axles() {
        return this.no_of_axles;
    }

    public final Integer getNorms() {
        return this.norms;
    }

    public final String getNorms_descr() {
        return this.norms_descr;
    }

    public final Object getNumberOfTyres() {
        return this.numberOfTyres;
    }

    public final Integer getOff_cd() {
        return this.off_cd;
    }

    public final String getOff_name() {
        return this.off_name;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final Integer getOther_criteria() {
        return this.other_criteria;
    }

    public final Object getOwnerCatg() {
        return this.ownerCatg;
    }

    public final OwnerIdentification getOwnerIdentification() {
        return this.ownerIdentification;
    }

    public final Integer getOwner_cd() {
        return this.owner_cd;
    }

    public final String getOwner_cd_descr() {
        return this.owner_cd_descr;
    }

    public final Integer getOwner_ctg() {
        return this.owner_ctg;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final Integer getOwner_sr() {
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

    public final Integer getP_district() {
        return this.p_district;
    }

    public final String getP_district_name() {
        return this.p_district_name;
    }

    public final Integer getP_pincode() {
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

    public final PermitDetailDto getPermitDetailDto() {
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

    public final Integer getSale_amt() {
        return this.sale_amt;
    }

    public final Integer getSeat_cap() {
        return this.seat_cap;
    }

    public final Integer getSleeper_cap() {
        return this.sleeper_cap;
    }

    public final Integer getStand_cap() {
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

    public final Object getTax_mode() {
        return this.tax_mode;
    }

    public final Object getTransport_catg() {
        return this.transport_catg;
    }

    public final Integer getUnld_wt() {
        return this.unld_wt;
    }

    public final VTHypthEntity getVTHypthEntity() {
        return this.vTHypthEntity;
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

    public final Integer getVehTypeAsInt() {
        return this.vehTypeAsInt;
    }

    public final Integer getVh_class() {
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

    public final VtInsuranceCommonDto getVtInsuranceCommonDto() {
        return this.vtInsuranceCommonDto;
    }

    public final Vtpucc getVtpucc() {
        return this.vtpucc;
    }

    public final Integer getWheelbase() {
        return this.wheelbase;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.aadhar_no;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ac_fitted;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.annual_income;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.appl_no;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str3 = this.audio_fitted;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.body_type;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.c_add1;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.c_add2;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.c_add3;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.c_district;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str8 = this.c_district_name;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Object obj2 = this.c_off_cd;
        int hashCode12 = (hashCode11 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Integer num3 = this.c_pincode;
        int hashCode13 = (hashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str9 = this.c_state;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.c_state_name;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.chasi_no;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Object obj3 = this.chasi_no_original;
        int hashCode17 = (hashCode16 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str12 = this.color;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.conditionstatus;
        int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d10 = this.cubic_cap;
        int hashCode20 = (hashCode19 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str13 = this.dealer_cd;
        int hashCode21 = (hashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num4 = this.dept_cd;
        int hashCode22 = (hashCode21 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Object obj4 = this.dlRequired;
        int hashCode23 = (hashCode22 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.dlValidationRequired;
        int hashCode24 = (hashCode23 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        String str14 = this.dl_no;
        int hashCode25 = (hashCode24 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.dlr_add1;
        int hashCode26 = (hashCode25 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.dlr_add2;
        int hashCode27 = (hashCode26 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.dlr_add3;
        int hashCode28 = (hashCode27 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.dlr_city;
        int hashCode29 = (hashCode28 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.dlr_district;
        int hashCode30 = (hashCode29 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.dlr_name;
        int hashCode31 = (hashCode30 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.dlr_pincode;
        int hashCode32 = (hashCode31 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.email_id;
        int hashCode33 = (hashCode32 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.eng_no;
        int hashCode34 = (hashCode33 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Object obj6 = this.eng_no_original;
        int hashCode35 = (hashCode34 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.eng_no_orignal;
        int hashCode36 = (hashCode35 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        String str24 = this.f_name;
        int hashCode37 = (hashCode36 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.fit_upto;
        int hashCode38 = (hashCode37 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Object obj8 = this.fit_uptoAsDate;
        int hashCode39 = (hashCode38 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.fit_upto_desc;
        int hashCode40 = (hashCode39 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        Object obj10 = this.flag;
        int hashCode41 = (hashCode40 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Integer num5 = this.floor_area;
        int hashCode42 = (hashCode41 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Object obj11 = this.formatRegn_dt;
        int hashCode43 = (hashCode42 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Integer num6 = this.fuel;
        int hashCode44 = (hashCode43 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str26 = this.fuel_descr;
        int hashCode45 = (hashCode44 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.garage_add;
        int hashCode46 = (hashCode45 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Integer num7 = this.gcw;
        int hashCode47 = (hashCode46 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.height;
        int hashCode48 = (hashCode47 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Double d11 = this.f20977hp;
        int hashCode49 = (hashCode48 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str28 = this.imported_vch;
        int hashCode50 = (hashCode49 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.laser_code;
        int hashCode51 = (hashCode50 + (str29 == null ? 0 : str29.hashCode())) * 31;
        Integer num9 = this.ld_wt;
        int hashCode52 = (hashCode51 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.length;
        int hashCode53 = (hashCode52 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.maker;
        int hashCode54 = (hashCode53 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str30 = this.maker_name;
        int hashCode55 = (hashCode54 + (str30 == null ? 0 : str30.hashCode())) * 31;
        Integer num12 = this.manu_mon;
        int hashCode56 = (hashCode55 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.manu_yr;
        int hashCode57 = (hashCode56 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Object obj12 = this.mobileNoEditable;
        int hashCode58 = (hashCode57 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        Long l10 = this.mobile_no;
        int hashCode59 = (hashCode58 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str31 = this.model_cd;
        int hashCode60 = (hashCode59 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.model_name;
        int hashCode61 = (hashCode60 + (str32 == null ? 0 : str32.hashCode())) * 31;
        Integer num14 = this.no_cyl;
        int hashCode62 = (hashCode61 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Object obj13 = this.no_of_axles;
        int hashCode63 = (hashCode62 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
        Integer num15 = this.norms;
        int hashCode64 = (hashCode63 + (num15 == null ? 0 : num15.hashCode())) * 31;
        String str33 = this.norms_descr;
        int hashCode65 = (hashCode64 + (str33 == null ? 0 : str33.hashCode())) * 31;
        Object obj14 = this.numberOfTyres;
        int hashCode66 = (hashCode65 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
        Integer num16 = this.off_cd;
        int hashCode67 = (hashCode66 + (num16 == null ? 0 : num16.hashCode())) * 31;
        String str34 = this.off_name;
        int hashCode68 = (hashCode67 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.op_dt;
        int hashCode69 = (hashCode68 + (str35 == null ? 0 : str35.hashCode())) * 31;
        Integer num17 = this.other_criteria;
        int hashCode70 = (hashCode69 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Object obj15 = this.ownerCatg;
        int hashCode71 = (hashCode70 + (obj15 == null ? 0 : obj15.hashCode())) * 31;
        OwnerIdentification ownerIdentification2 = this.ownerIdentification;
        int hashCode72 = (hashCode71 + (ownerIdentification2 == null ? 0 : ownerIdentification2.hashCode())) * 31;
        Integer num18 = this.owner_cd;
        int hashCode73 = (hashCode72 + (num18 == null ? 0 : num18.hashCode())) * 31;
        String str36 = this.owner_cd_descr;
        int hashCode74 = (hashCode73 + (str36 == null ? 0 : str36.hashCode())) * 31;
        Integer num19 = this.owner_ctg;
        int hashCode75 = (hashCode74 + (num19 == null ? 0 : num19.hashCode())) * 31;
        String str37 = this.owner_name;
        int hashCode76 = (hashCode75 + (str37 == null ? 0 : str37.hashCode())) * 31;
        Integer num20 = this.owner_sr;
        int hashCode77 = (hashCode76 + (num20 == null ? 0 : num20.hashCode())) * 31;
        String str38 = this.p_add1;
        int hashCode78 = (hashCode77 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.p_add2;
        int hashCode79 = (hashCode78 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.p_add3;
        int hashCode80 = (hashCode79 + (str40 == null ? 0 : str40.hashCode())) * 31;
        Integer num21 = this.p_district;
        int hashCode81 = (hashCode80 + (num21 == null ? 0 : num21.hashCode())) * 31;
        String str41 = this.p_district_name;
        int hashCode82 = (hashCode81 + (str41 == null ? 0 : str41.hashCode())) * 31;
        Integer num22 = this.p_pincode;
        int hashCode83 = (hashCode82 + (num22 == null ? 0 : num22.hashCode())) * 31;
        String str42 = this.p_state;
        int hashCode84 = (hashCode83 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.p_state_name;
        int hashCode85 = (hashCode84 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.pan_no;
        int hashCode86 = (hashCode85 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.passport_no;
        int hashCode87 = (hashCode86 + (str45 == null ? 0 : str45.hashCode())) * 31;
        Object obj16 = this.permitDetailEntity;
        int hashCode88 = (hashCode87 + (obj16 == null ? 0 : obj16.hashCode())) * 31;
        Object obj17 = this.permit_rto_cd;
        int hashCode89 = (hashCode88 + (obj17 == null ? 0 : obj17.hashCode())) * 31;
        Object obj18 = this.purchase_date;
        int hashCode90 = (hashCode89 + (obj18 == null ? 0 : obj18.hashCode())) * 31;
        String str46 = this.purchase_dt;
        int hashCode91 = (hashCode90 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.ration_card_no;
        int hashCode92 = (hashCode91 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.regn_dt;
        int hashCode93 = (hashCode92 + (str48 == null ? 0 : str48.hashCode())) * 31;
        Object obj19 = this.regn_dtAsDate;
        int hashCode94 = (hashCode93 + (obj19 == null ? 0 : obj19.hashCode())) * 31;
        String str49 = this.regn_no;
        int hashCode95 = (hashCode94 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.regn_type;
        int hashCode96 = (hashCode95 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.regn_type_descr;
        int hashCode97 = (hashCode96 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.regn_upto;
        int hashCode98 = (hashCode97 + (str52 == null ? 0 : str52.hashCode())) * 31;
        Object obj20 = this.regn_uptoAsDate;
        int hashCode99 = (hashCode98 + (obj20 == null ? 0 : obj20.hashCode())) * 31;
        Object obj21 = this.returnMessge;
        int hashCode100 = (hashCode99 + (obj21 == null ? 0 : obj21.hashCode())) * 31;
        Integer num23 = this.sale_amt;
        int hashCode101 = (hashCode100 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.seat_cap;
        int hashCode102 = (hashCode101 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.sleeper_cap;
        int hashCode103 = (hashCode102 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Integer num26 = this.stand_cap;
        int hashCode104 = (hashCode103 + (num26 == null ? 0 : num26.hashCode())) * 31;
        String str53 = this.state_cd;
        int hashCode105 = (hashCode104 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.state_name;
        int hashCode106 = (hashCode105 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.status;
        int hashCode107 = (hashCode106 + (str55 == null ? 0 : str55.hashCode())) * 31;
        Object obj22 = this.tax_mode;
        int hashCode108 = (hashCode107 + (obj22 == null ? 0 : obj22.hashCode())) * 31;
        Object obj23 = this.transport_catg;
        int hashCode109 = (hashCode108 + (obj23 == null ? 0 : obj23.hashCode())) * 31;
        Integer num27 = this.unld_wt;
        int hashCode110 = (hashCode109 + (num27 == null ? 0 : num27.hashCode())) * 31;
        String str56 = this.vch_catg;
        int hashCode111 = (hashCode110 + (str56 == null ? 0 : str56.hashCode())) * 31;
        Object obj24 = this.vch_catg_desc;
        int hashCode112 = (hashCode111 + (obj24 == null ? 0 : obj24.hashCode())) * 31;
        String str57 = this.vch_purchase_as;
        int hashCode113 = (hashCode112 + (str57 == null ? 0 : str57.hashCode())) * 31;
        Object obj25 = this.vch_purchase_asCode;
        int hashCode114 = (hashCode113 + (obj25 == null ? 0 : obj25.hashCode())) * 31;
        String str58 = this.vehType;
        int hashCode115 = (hashCode114 + (str58 == null ? 0 : str58.hashCode())) * 31;
        Integer num28 = this.vehTypeAsInt;
        int hashCode116 = (hashCode115 + (num28 == null ? 0 : num28.hashCode())) * 31;
        Integer num29 = this.vh_class;
        int hashCode117 = (hashCode116 + (num29 == null ? 0 : num29.hashCode())) * 31;
        String str59 = this.vh_class_desc;
        int hashCode118 = (hashCode117 + (str59 == null ? 0 : str59.hashCode())) * 31;
        String str60 = this.video_fitted;
        int hashCode119 = (hashCode118 + (str60 == null ? 0 : str60.hashCode())) * 31;
        String str61 = this.voter_id;
        int hashCode120 = (hashCode119 + (str61 == null ? 0 : str61.hashCode())) * 31;
        VtInsuranceCommonDto vtInsuranceCommonDto2 = this.vtInsuranceCommonDto;
        int hashCode121 = (hashCode120 + (vtInsuranceCommonDto2 == null ? 0 : vtInsuranceCommonDto2.hashCode())) * 31;
        Vtpucc vtpucc2 = this.vtpucc;
        int hashCode122 = (hashCode121 + (vtpucc2 == null ? 0 : vtpucc2.hashCode())) * 31;
        Integer num30 = this.wheelbase;
        int hashCode123 = (hashCode122 + (num30 == null ? 0 : num30.hashCode())) * 31;
        Integer num31 = this.width;
        int hashCode124 = (hashCode123 + (num31 == null ? 0 : num31.hashCode())) * 31;
        VTHypthEntity vTHypthEntity2 = this.vTHypthEntity;
        int hashCode125 = (hashCode124 + (vTHypthEntity2 == null ? 0 : vTHypthEntity2.hashCode())) * 31;
        Latesttaxdetails latesttaxdetails2 = this.latesttaxdetails;
        int hashCode126 = (hashCode125 + (latesttaxdetails2 == null ? 0 : latesttaxdetails2.hashCode())) * 31;
        PermitDetailDto permitDetailDto2 = this.permitDetailDto;
        if (permitDetailDto2 != null) {
            i10 = permitDetailDto2.hashCode();
        }
        return hashCode126 + i10;
    }

    public String toString() {
        return "OwnerDetailPuccPermit(aadhar_no=" + this.aadhar_no + ", ac_fitted=" + this.ac_fitted + ", annual_income=" + this.annual_income + ", appl_no=" + this.appl_no + ", audio_fitted=" + this.audio_fitted + ", body_type=" + this.body_type + ", c_add1=" + this.c_add1 + ", c_add2=" + this.c_add2 + ", c_add3=" + this.c_add3 + ", c_district=" + this.c_district + ", c_district_name=" + this.c_district_name + ", c_off_cd=" + this.c_off_cd + ", c_pincode=" + this.c_pincode + ", c_state=" + this.c_state + ", c_state_name=" + this.c_state_name + ", chasi_no=" + this.chasi_no + ", chasi_no_original=" + this.chasi_no_original + ", color=" + this.color + ", conditionstatus=" + this.conditionstatus + ", cubic_cap=" + this.cubic_cap + ", dealer_cd=" + this.dealer_cd + ", dept_cd=" + this.dept_cd + ", dlRequired=" + this.dlRequired + ", dlValidationRequired=" + this.dlValidationRequired + ", dl_no=" + this.dl_no + ", dlr_add1=" + this.dlr_add1 + ", dlr_add2=" + this.dlr_add2 + ", dlr_add3=" + this.dlr_add3 + ", dlr_city=" + this.dlr_city + ", dlr_district=" + this.dlr_district + ", dlr_name=" + this.dlr_name + ", dlr_pincode=" + this.dlr_pincode + ", email_id=" + this.email_id + ", eng_no=" + this.eng_no + ", eng_no_original=" + this.eng_no_original + ", eng_no_orignal=" + this.eng_no_orignal + ", f_name=" + this.f_name + ", fit_upto=" + this.fit_upto + ", fit_uptoAsDate=" + this.fit_uptoAsDate + ", fit_upto_desc=" + this.fit_upto_desc + ", flag=" + this.flag + ", floor_area=" + this.floor_area + ", formatRegn_dt=" + this.formatRegn_dt + ", fuel=" + this.fuel + ", fuel_descr=" + this.fuel_descr + ", garage_add=" + this.garage_add + ", gcw=" + this.gcw + ", height=" + this.height + ", hp=" + this.f20977hp + ", imported_vch=" + this.imported_vch + ", laser_code=" + this.laser_code + ", ld_wt=" + this.ld_wt + ", length=" + this.length + ", maker=" + this.maker + ", maker_name=" + this.maker_name + ", manu_mon=" + this.manu_mon + ", manu_yr=" + this.manu_yr + ", mobileNoEditable=" + this.mobileNoEditable + ", mobile_no=" + this.mobile_no + ", model_cd=" + this.model_cd + ", model_name=" + this.model_name + ", no_cyl=" + this.no_cyl + ", no_of_axles=" + this.no_of_axles + ", norms=" + this.norms + ", norms_descr=" + this.norms_descr + ", numberOfTyres=" + this.numberOfTyres + ", off_cd=" + this.off_cd + ", off_name=" + this.off_name + ", op_dt=" + this.op_dt + ", other_criteria=" + this.other_criteria + ", ownerCatg=" + this.ownerCatg + ", ownerIdentification=" + this.ownerIdentification + ", owner_cd=" + this.owner_cd + ", owner_cd_descr=" + this.owner_cd_descr + ", owner_ctg=" + this.owner_ctg + ", owner_name=" + this.owner_name + ", owner_sr=" + this.owner_sr + ", p_add1=" + this.p_add1 + ", p_add2=" + this.p_add2 + ", p_add3=" + this.p_add3 + ", p_district=" + this.p_district + ", p_district_name=" + this.p_district_name + ", p_pincode=" + this.p_pincode + ", p_state=" + this.p_state + ", p_state_name=" + this.p_state_name + ", pan_no=" + this.pan_no + ", passport_no=" + this.passport_no + ", permitDetailEntity=" + this.permitDetailEntity + ", permit_rto_cd=" + this.permit_rto_cd + ", purchase_date=" + this.purchase_date + ", purchase_dt=" + this.purchase_dt + ", ration_card_no=" + this.ration_card_no + ", regn_dt=" + this.regn_dt + ", regn_dtAsDate=" + this.regn_dtAsDate + ", regn_no=" + this.regn_no + ", regn_type=" + this.regn_type + ", regn_type_descr=" + this.regn_type_descr + ", regn_upto=" + this.regn_upto + ", regn_uptoAsDate=" + this.regn_uptoAsDate + ", returnMessge=" + this.returnMessge + ", sale_amt=" + this.sale_amt + ", seat_cap=" + this.seat_cap + ", sleeper_cap=" + this.sleeper_cap + ", stand_cap=" + this.stand_cap + ", state_cd=" + this.state_cd + ", state_name=" + this.state_name + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", transport_catg=" + this.transport_catg + ", unld_wt=" + this.unld_wt + ", vch_catg=" + this.vch_catg + ", vch_catg_desc=" + this.vch_catg_desc + ", vch_purchase_as=" + this.vch_purchase_as + ", vch_purchase_asCode=" + this.vch_purchase_asCode + ", vehType=" + this.vehType + ", vehTypeAsInt=" + this.vehTypeAsInt + ", vh_class=" + this.vh_class + ", vh_class_desc=" + this.vh_class_desc + ", video_fitted=" + this.video_fitted + ", voter_id=" + this.voter_id + ", vtInsuranceCommonDto=" + this.vtInsuranceCommonDto + ", vtpucc=" + this.vtpucc + ", wheelbase=" + this.wheelbase + ", width=" + this.width + ", vTHypthEntity=" + this.vTHypthEntity + ", latesttaxdetails=" + this.latesttaxdetails + ", permitDetailDto=" + this.permitDetailDto + ')';
    }
}
