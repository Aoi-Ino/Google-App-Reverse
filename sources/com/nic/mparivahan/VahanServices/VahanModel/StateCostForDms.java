package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class StateCostForDms {
    private final Object aadhar_based_autoapproval_purcd;
    private final boolean aadharfailexempt;
    private final Object adv_vhclass;
    private final boolean allow_fitness_all_rto;
    private final String allowaapplinnonuse;
    private final String allowapplinpendingchallan;
    private final boolean appt_bfr_payment;
    private final Object autoapproval_purcd;
    private final Object blacklistcondformula;
    private final String blacklistedpur;
    private final Object blacklistrestrictpur_cd;
    private final String book_app;
    private final String challanpndingrestrictpur_cd;
    private final String combination_service_allowed_anywhere;
    private final boolean conversion_check;
    private final String directinwardpurcode;
    private final String dms_url;
    private final Object dmsurl;
    private final Object doc_exemp_from;
    private final Object doc_exemp_upto;
    private final boolean doc_merge;
    private final String esign_pur_cd;
    private final String faceless_service_purcd;
    private final String fee_exempt_owner_cd;
    private final boolean fit_fine_due_nid;
    private final String fitness_nt_vehicle;
    private final Object fitnesscenterlist;
    private final boolean fitnessexpirymsgappt;
    private final boolean form23;
    private final boolean form23printwithvahantrans;
    private final String insuranceret;
    private final boolean is_penalty_applicable;
    private final boolean is_tax_installment;
    private final boolean isaadhaarmobileupdate;
    private final boolean isallowfitnesscertificatefeeafterfitnessfail;
    private final boolean isconversionallowttont;
    private final boolean isdirectinward;
    private final boolean isesign;
    private final boolean isfitnessallow;
    private final boolean isfitnessdirectallow;
    private final boolean ishptwithto_or_cainothr_rto;
    private final boolean isinschkrcsurr;
    private final boolean isinsurance;
    private final boolean isinsuranceentryrestricted;
    private final boolean ismandate_docs_bfr_rcpt;
    private final String ismobileregistered;
    private final boolean ismultiple_app;
    private final boolean isncrbblacklist;
    private final boolean isnocprint;
    private final boolean isotpmobileto;
    private final Object ispermitallowservice;
    private final boolean ispgitestpage;
    private final boolean isprintrc;
    private final boolean isprintrcpartcert;
    private final boolean isprinttaxtoken;
    private final boolean isrechkfailedtran;
    private final boolean isrmaallowed;
    private final boolean isrrcwithbasicservices;
    private final boolean istaxallow;
    private final boolean istdsenable;
    private final boolean istemprc;
    private final String modify_doc_dms_url;
    private final Object modifydmsurl;
    private final boolean mul_hpa;
    private final boolean multiple_state_action;
    private final int nid_days;
    private final boolean nidfitexempt;
    private final boolean noc_ret;
    private final boolean nochpthpccheck;
    private final Object offline;
    private final Object offlistforrrc;
    private final Object offlistrrc;
    private final boolean other_state_fitness;
    private final boolean otpskip;
    private final Object payment_complaint_type;
    private final boolean payment_compounding_fee;
    private final boolean paymentsch;
    private final int pgiamount;
    private final boolean printfit_inspection;
    private final String printfitdays;
    private final String pur_cd;
    private final int rc_print_days_allowed;
    private final Object rcprint_restriction;
    private final boolean regnrenewalcheck;
    private final Object restrictapplinchallanpnd;
    private final Object restrictedfitnessblacklistcodes;
    private final Object restrictedfitnesscenteroffcd;
    private final String state_cd;
    private final String state_header;
    private final Object stateauthtype;
    private final String tax_nt_vehicle;
    private final String tax_restrict_transprt_veh;
    private final String tax_stopping_msg;
    private final boolean taxaddrecovery;
    private final boolean taxexemptionconv;
    private final TmState tmState;
    private final boolean upload_doc;

    public StateCostForDms(Object obj, boolean z10, Object obj2, boolean z11, String str, String str2, boolean z12, Object obj3, Object obj4, String str3, Object obj5, String str4, String str5, String str6, boolean z13, String str7, String str8, Object obj6, Object obj7, Object obj8, boolean z14, String str9, String str10, String str11, boolean z15, String str12, Object obj9, boolean z16, boolean z17, boolean z18, String str13, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, String str14, boolean z33, boolean z34, boolean z35, boolean z36, Object obj10, boolean z37, boolean z38, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, boolean z44, boolean z45, boolean z46, String str15, Object obj11, boolean z47, boolean z48, int i10, boolean z49, boolean z50, boolean z51, Object obj12, Object obj13, Object obj14, boolean z52, boolean z53, Object obj15, boolean z54, boolean z55, int i11, boolean z56, String str16, String str17, int i12, Object obj16, boolean z57, Object obj17, Object obj18, Object obj19, String str18, String str19, Object obj20, String str20, String str21, String str22, boolean z58, boolean z59, TmState tmState2, boolean z60) {
        Object obj21 = obj;
        Object obj22 = obj2;
        String str23 = str;
        String str24 = str2;
        Object obj23 = obj3;
        Object obj24 = obj4;
        String str25 = str3;
        Object obj25 = obj5;
        String str26 = str4;
        String str27 = str5;
        String str28 = str6;
        String str29 = str7;
        String str30 = str8;
        Object obj26 = obj6;
        Object obj27 = obj8;
        l.f(obj21, "aadhar_based_autoapproval_purcd");
        l.f(obj22, "adv_vhclass");
        l.f(str23, "allowaapplinnonuse");
        l.f(str24, "allowapplinpendingchallan");
        l.f(obj23, "autoapproval_purcd");
        l.f(obj24, "blacklistcondformula");
        l.f(str25, "blacklistedpur");
        l.f(obj25, "blacklistrestrictpur_cd");
        l.f(str26, "book_app");
        l.f(str27, "challanpndingrestrictpur_cd");
        l.f(str28, "combination_service_allowed_anywhere");
        l.f(str29, "directinwardpurcode");
        l.f(str30, "dms_url");
        l.f(obj26, "dmsurl");
        l.f(obj7, "doc_exemp_from");
        l.f(obj8, "doc_exemp_upto");
        l.f(str9, "esign_pur_cd");
        l.f(str11, "fee_exempt_owner_cd");
        l.f(str12, "fitness_nt_vehicle");
        l.f(obj9, "fitnesscenterlist");
        l.f(str13, "insuranceret");
        l.f(str14, "ismobileregistered");
        l.f(obj10, "ispermitallowservice");
        l.f(str15, "modify_doc_dms_url");
        l.f(obj11, "modifydmsurl");
        l.f(obj12, "offline");
        l.f(obj13, "offlistforrrc");
        l.f(obj14, "offlistrrc");
        l.f(obj15, "payment_complaint_type");
        l.f(str16, "printfitdays");
        l.f(str17, "pur_cd");
        l.f(obj16, "rcprint_restriction");
        l.f(obj17, "restrictapplinchallanpnd");
        l.f(obj18, "restrictedfitnessblacklistcodes");
        l.f(obj19, "restrictedfitnesscenteroffcd");
        l.f(str18, "state_cd");
        l.f(str19, "state_header");
        l.f(obj20, "stateauthtype");
        l.f(str20, "tax_nt_vehicle");
        l.f(str21, "tax_restrict_transprt_veh");
        l.f(str22, "tax_stopping_msg");
        l.f(tmState2, "tmState");
        this.aadhar_based_autoapproval_purcd = obj21;
        this.aadharfailexempt = z10;
        this.adv_vhclass = obj22;
        this.allow_fitness_all_rto = z11;
        this.allowaapplinnonuse = str23;
        this.allowapplinpendingchallan = str24;
        this.appt_bfr_payment = z12;
        this.autoapproval_purcd = obj23;
        this.blacklistcondformula = obj24;
        this.blacklistedpur = str25;
        this.blacklistrestrictpur_cd = obj25;
        this.book_app = str26;
        this.challanpndingrestrictpur_cd = str27;
        this.combination_service_allowed_anywhere = str28;
        this.conversion_check = z13;
        this.directinwardpurcode = str29;
        this.dms_url = str30;
        this.dmsurl = obj26;
        this.doc_exemp_from = obj7;
        this.doc_exemp_upto = obj8;
        this.doc_merge = z14;
        this.esign_pur_cd = str9;
        this.faceless_service_purcd = str10;
        this.fee_exempt_owner_cd = str11;
        this.fit_fine_due_nid = z15;
        this.fitness_nt_vehicle = str12;
        this.fitnesscenterlist = obj9;
        this.fitnessexpirymsgappt = z16;
        this.form23 = z17;
        this.form23printwithvahantrans = z18;
        this.insuranceret = str13;
        this.is_penalty_applicable = z19;
        this.is_tax_installment = z20;
        this.isaadhaarmobileupdate = z21;
        this.isallowfitnesscertificatefeeafterfitnessfail = z22;
        this.isconversionallowttont = z23;
        this.isdirectinward = z24;
        this.isesign = z25;
        this.isfitnessallow = z26;
        this.isfitnessdirectallow = z27;
        this.ishptwithto_or_cainothr_rto = z28;
        this.isinschkrcsurr = z29;
        this.isinsurance = z30;
        this.isinsuranceentryrestricted = z31;
        this.ismandate_docs_bfr_rcpt = z32;
        this.ismobileregistered = str14;
        this.ismultiple_app = z33;
        this.isncrbblacklist = z34;
        this.isnocprint = z35;
        this.isotpmobileto = z36;
        this.ispermitallowservice = obj10;
        this.ispgitestpage = z37;
        this.isprintrc = z38;
        this.isprintrcpartcert = z39;
        this.isprinttaxtoken = z40;
        this.isrechkfailedtran = z41;
        this.isrmaallowed = z42;
        this.isrrcwithbasicservices = z43;
        this.istaxallow = z44;
        this.istdsenable = z45;
        this.istemprc = z46;
        this.modify_doc_dms_url = str15;
        this.modifydmsurl = obj11;
        this.mul_hpa = z47;
        this.multiple_state_action = z48;
        this.nid_days = i10;
        this.nidfitexempt = z49;
        this.noc_ret = z50;
        this.nochpthpccheck = z51;
        this.offline = obj12;
        this.offlistforrrc = obj13;
        this.offlistrrc = obj14;
        this.other_state_fitness = z52;
        this.otpskip = z53;
        this.payment_complaint_type = obj15;
        this.payment_compounding_fee = z54;
        this.paymentsch = z55;
        this.pgiamount = i11;
        this.printfit_inspection = z56;
        this.printfitdays = str16;
        this.pur_cd = str17;
        this.rc_print_days_allowed = i12;
        this.rcprint_restriction = obj16;
        this.regnrenewalcheck = z57;
        this.restrictapplinchallanpnd = obj17;
        this.restrictedfitnessblacklistcodes = obj18;
        this.restrictedfitnesscenteroffcd = obj19;
        this.state_cd = str18;
        this.state_header = str19;
        this.stateauthtype = obj20;
        this.tax_nt_vehicle = str20;
        this.tax_restrict_transprt_veh = str21;
        this.tax_stopping_msg = str22;
        this.taxaddrecovery = z58;
        this.taxexemptionconv = z59;
        this.tmState = tmState2;
        this.upload_doc = z60;
    }

    public static /* synthetic */ StateCostForDms copy$default(StateCostForDms stateCostForDms, Object obj, boolean z10, Object obj2, boolean z11, String str, String str2, boolean z12, Object obj3, Object obj4, String str3, Object obj5, String str4, String str5, String str6, boolean z13, String str7, String str8, Object obj6, Object obj7, Object obj8, boolean z14, String str9, String str10, String str11, boolean z15, String str12, Object obj9, boolean z16, boolean z17, boolean z18, String str13, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, String str14, boolean z33, boolean z34, boolean z35, boolean z36, Object obj10, boolean z37, boolean z38, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, boolean z44, boolean z45, boolean z46, String str15, Object obj11, boolean z47, boolean z48, int i10, boolean z49, boolean z50, boolean z51, Object obj12, Object obj13, Object obj14, boolean z52, boolean z53, Object obj15, boolean z54, boolean z55, int i11, boolean z56, String str16, String str17, int i12, Object obj16, boolean z57, Object obj17, Object obj18, Object obj19, String str18, String str19, Object obj20, String str20, String str21, String str22, boolean z58, boolean z59, TmState tmState2, boolean z60, int i13, int i14, int i15, int i16, Object obj21) {
        StateCostForDms stateCostForDms2 = stateCostForDms;
        int i17 = i13;
        int i18 = i14;
        int i19 = i15;
        return stateCostForDms.copy((i17 & 1) != 0 ? stateCostForDms2.aadhar_based_autoapproval_purcd : obj, (i17 & 2) != 0 ? stateCostForDms2.aadharfailexempt : z10, (i17 & 4) != 0 ? stateCostForDms2.adv_vhclass : obj2, (i17 & 8) != 0 ? stateCostForDms2.allow_fitness_all_rto : z11, (i17 & 16) != 0 ? stateCostForDms2.allowaapplinnonuse : str, (i17 & 32) != 0 ? stateCostForDms2.allowapplinpendingchallan : str2, (i17 & 64) != 0 ? stateCostForDms2.appt_bfr_payment : z12, (i17 & 128) != 0 ? stateCostForDms2.autoapproval_purcd : obj3, (i17 & 256) != 0 ? stateCostForDms2.blacklistcondformula : obj4, (i17 & 512) != 0 ? stateCostForDms2.blacklistedpur : str3, (i17 & 1024) != 0 ? stateCostForDms2.blacklistrestrictpur_cd : obj5, (i17 & 2048) != 0 ? stateCostForDms2.book_app : str4, (i17 & 4096) != 0 ? stateCostForDms2.challanpndingrestrictpur_cd : str5, (i17 & 8192) != 0 ? stateCostForDms2.combination_service_allowed_anywhere : str6, (i17 & 16384) != 0 ? stateCostForDms2.conversion_check : z13, (i17 & 32768) != 0 ? stateCostForDms2.directinwardpurcode : str7, (i17 & 65536) != 0 ? stateCostForDms2.dms_url : str8, (i17 & 131072) != 0 ? stateCostForDms2.dmsurl : obj6, (i17 & 262144) != 0 ? stateCostForDms2.doc_exemp_from : obj7, (i17 & 524288) != 0 ? stateCostForDms2.doc_exemp_upto : obj8, (i17 & 1048576) != 0 ? stateCostForDms2.doc_merge : z14, (i17 & 2097152) != 0 ? stateCostForDms2.esign_pur_cd : str9, (i17 & 4194304) != 0 ? stateCostForDms2.faceless_service_purcd : str10, (i17 & 8388608) != 0 ? stateCostForDms2.fee_exempt_owner_cd : str11, (i17 & 16777216) != 0 ? stateCostForDms2.fit_fine_due_nid : z15, (i17 & 33554432) != 0 ? stateCostForDms2.fitness_nt_vehicle : str12, (i17 & 67108864) != 0 ? stateCostForDms2.fitnesscenterlist : obj9, (i17 & 134217728) != 0 ? stateCostForDms2.fitnessexpirymsgappt : z16, (i17 & 268435456) != 0 ? stateCostForDms2.form23 : z17, (i17 & 536870912) != 0 ? stateCostForDms2.form23printwithvahantrans : z18, (i17 & 1073741824) != 0 ? stateCostForDms2.insuranceret : str13, (i17 & Integer.MIN_VALUE) != 0 ? stateCostForDms2.is_penalty_applicable : z19, (i18 & 1) != 0 ? stateCostForDms2.is_tax_installment : z20, (i18 & 2) != 0 ? stateCostForDms2.isaadhaarmobileupdate : z21, (i18 & 4) != 0 ? stateCostForDms2.isallowfitnesscertificatefeeafterfitnessfail : z22, (i18 & 8) != 0 ? stateCostForDms2.isconversionallowttont : z23, (i18 & 16) != 0 ? stateCostForDms2.isdirectinward : z24, (i18 & 32) != 0 ? stateCostForDms2.isesign : z25, (i18 & 64) != 0 ? stateCostForDms2.isfitnessallow : z26, (i18 & 128) != 0 ? stateCostForDms2.isfitnessdirectallow : z27, (i18 & 256) != 0 ? stateCostForDms2.ishptwithto_or_cainothr_rto : z28, (i18 & 512) != 0 ? stateCostForDms2.isinschkrcsurr : z29, (i18 & 1024) != 0 ? stateCostForDms2.isinsurance : z30, (i18 & 2048) != 0 ? stateCostForDms2.isinsuranceentryrestricted : z31, (i18 & 4096) != 0 ? stateCostForDms2.ismandate_docs_bfr_rcpt : z32, (i18 & 8192) != 0 ? stateCostForDms2.ismobileregistered : str14, (i18 & 16384) != 0 ? stateCostForDms2.ismultiple_app : z33, (i18 & 32768) != 0 ? stateCostForDms2.isncrbblacklist : z34, (i18 & 65536) != 0 ? stateCostForDms2.isnocprint : z35, (i18 & 131072) != 0 ? stateCostForDms2.isotpmobileto : z36, (i18 & 262144) != 0 ? stateCostForDms2.ispermitallowservice : obj10, (i18 & 524288) != 0 ? stateCostForDms2.ispgitestpage : z37, (i18 & 1048576) != 0 ? stateCostForDms2.isprintrc : z38, (i18 & 2097152) != 0 ? stateCostForDms2.isprintrcpartcert : z39, (i18 & 4194304) != 0 ? stateCostForDms2.isprinttaxtoken : z40, (i18 & 8388608) != 0 ? stateCostForDms2.isrechkfailedtran : z41, (i18 & 16777216) != 0 ? stateCostForDms2.isrmaallowed : z42, (i18 & 33554432) != 0 ? stateCostForDms2.isrrcwithbasicservices : z43, (i18 & 67108864) != 0 ? stateCostForDms2.istaxallow : z44, (i18 & 134217728) != 0 ? stateCostForDms2.istdsenable : z45, (i18 & 268435456) != 0 ? stateCostForDms2.istemprc : z46, (i18 & 536870912) != 0 ? stateCostForDms2.modify_doc_dms_url : str15, (i18 & 1073741824) != 0 ? stateCostForDms2.modifydmsurl : obj11, (i18 & Integer.MIN_VALUE) != 0 ? stateCostForDms2.mul_hpa : z47, (i19 & 1) != 0 ? stateCostForDms2.multiple_state_action : z48, (i19 & 2) != 0 ? stateCostForDms2.nid_days : i10, (i19 & 4) != 0 ? stateCostForDms2.nidfitexempt : z49, (i19 & 8) != 0 ? stateCostForDms2.noc_ret : z50, (i19 & 16) != 0 ? stateCostForDms2.nochpthpccheck : z51, (i19 & 32) != 0 ? stateCostForDms2.offline : obj12, (i19 & 64) != 0 ? stateCostForDms2.offlistforrrc : obj13, (i19 & 128) != 0 ? stateCostForDms2.offlistrrc : obj14, (i19 & 256) != 0 ? stateCostForDms2.other_state_fitness : z52, (i19 & 512) != 0 ? stateCostForDms2.otpskip : z53, (i19 & 1024) != 0 ? stateCostForDms2.payment_complaint_type : obj15, (i19 & 2048) != 0 ? stateCostForDms2.payment_compounding_fee : z54, (i19 & 4096) != 0 ? stateCostForDms2.paymentsch : z55, (i19 & 8192) != 0 ? stateCostForDms2.pgiamount : i11, (i19 & 16384) != 0 ? stateCostForDms2.printfit_inspection : z56, (i19 & 32768) != 0 ? stateCostForDms2.printfitdays : str16, (i19 & 65536) != 0 ? stateCostForDms2.pur_cd : str17, (i19 & 131072) != 0 ? stateCostForDms2.rc_print_days_allowed : i12, (i19 & 262144) != 0 ? stateCostForDms2.rcprint_restriction : obj16, (i19 & 524288) != 0 ? stateCostForDms2.regnrenewalcheck : z57, (i19 & 1048576) != 0 ? stateCostForDms2.restrictapplinchallanpnd : obj17, (i19 & 2097152) != 0 ? stateCostForDms2.restrictedfitnessblacklistcodes : obj18, (i19 & 4194304) != 0 ? stateCostForDms2.restrictedfitnesscenteroffcd : obj19, (i19 & 8388608) != 0 ? stateCostForDms2.state_cd : str18, (i19 & 16777216) != 0 ? stateCostForDms2.state_header : str19, (i19 & 33554432) != 0 ? stateCostForDms2.stateauthtype : obj20, (i19 & 67108864) != 0 ? stateCostForDms2.tax_nt_vehicle : str20, (i19 & 134217728) != 0 ? stateCostForDms2.tax_restrict_transprt_veh : str21, (i19 & 268435456) != 0 ? stateCostForDms2.tax_stopping_msg : str22, (i19 & 536870912) != 0 ? stateCostForDms2.taxaddrecovery : z58, (i19 & 1073741824) != 0 ? stateCostForDms2.taxexemptionconv : z59, (i19 & Integer.MIN_VALUE) != 0 ? stateCostForDms2.tmState : tmState2, (i16 & 1) != 0 ? stateCostForDms2.upload_doc : z60);
    }

    public final Object component1() {
        return this.aadhar_based_autoapproval_purcd;
    }

    public final String component10() {
        return this.blacklistedpur;
    }

    public final Object component11() {
        return this.blacklistrestrictpur_cd;
    }

    public final String component12() {
        return this.book_app;
    }

    public final String component13() {
        return this.challanpndingrestrictpur_cd;
    }

    public final String component14() {
        return this.combination_service_allowed_anywhere;
    }

    public final boolean component15() {
        return this.conversion_check;
    }

    public final String component16() {
        return this.directinwardpurcode;
    }

    public final String component17() {
        return this.dms_url;
    }

    public final Object component18() {
        return this.dmsurl;
    }

    public final Object component19() {
        return this.doc_exemp_from;
    }

    public final boolean component2() {
        return this.aadharfailexempt;
    }

    public final Object component20() {
        return this.doc_exemp_upto;
    }

    public final boolean component21() {
        return this.doc_merge;
    }

    public final String component22() {
        return this.esign_pur_cd;
    }

    public final String component23() {
        return this.faceless_service_purcd;
    }

    public final String component24() {
        return this.fee_exempt_owner_cd;
    }

    public final boolean component25() {
        return this.fit_fine_due_nid;
    }

    public final String component26() {
        return this.fitness_nt_vehicle;
    }

    public final Object component27() {
        return this.fitnesscenterlist;
    }

    public final boolean component28() {
        return this.fitnessexpirymsgappt;
    }

    public final boolean component29() {
        return this.form23;
    }

    public final Object component3() {
        return this.adv_vhclass;
    }

    public final boolean component30() {
        return this.form23printwithvahantrans;
    }

    public final String component31() {
        return this.insuranceret;
    }

    public final boolean component32() {
        return this.is_penalty_applicable;
    }

    public final boolean component33() {
        return this.is_tax_installment;
    }

    public final boolean component34() {
        return this.isaadhaarmobileupdate;
    }

    public final boolean component35() {
        return this.isallowfitnesscertificatefeeafterfitnessfail;
    }

    public final boolean component36() {
        return this.isconversionallowttont;
    }

    public final boolean component37() {
        return this.isdirectinward;
    }

    public final boolean component38() {
        return this.isesign;
    }

    public final boolean component39() {
        return this.isfitnessallow;
    }

    public final boolean component4() {
        return this.allow_fitness_all_rto;
    }

    public final boolean component40() {
        return this.isfitnessdirectallow;
    }

    public final boolean component41() {
        return this.ishptwithto_or_cainothr_rto;
    }

    public final boolean component42() {
        return this.isinschkrcsurr;
    }

    public final boolean component43() {
        return this.isinsurance;
    }

    public final boolean component44() {
        return this.isinsuranceentryrestricted;
    }

    public final boolean component45() {
        return this.ismandate_docs_bfr_rcpt;
    }

    public final String component46() {
        return this.ismobileregistered;
    }

    public final boolean component47() {
        return this.ismultiple_app;
    }

    public final boolean component48() {
        return this.isncrbblacklist;
    }

    public final boolean component49() {
        return this.isnocprint;
    }

    public final String component5() {
        return this.allowaapplinnonuse;
    }

    public final boolean component50() {
        return this.isotpmobileto;
    }

    public final Object component51() {
        return this.ispermitallowservice;
    }

    public final boolean component52() {
        return this.ispgitestpage;
    }

    public final boolean component53() {
        return this.isprintrc;
    }

    public final boolean component54() {
        return this.isprintrcpartcert;
    }

    public final boolean component55() {
        return this.isprinttaxtoken;
    }

    public final boolean component56() {
        return this.isrechkfailedtran;
    }

    public final boolean component57() {
        return this.isrmaallowed;
    }

    public final boolean component58() {
        return this.isrrcwithbasicservices;
    }

    public final boolean component59() {
        return this.istaxallow;
    }

    public final String component6() {
        return this.allowapplinpendingchallan;
    }

    public final boolean component60() {
        return this.istdsenable;
    }

    public final boolean component61() {
        return this.istemprc;
    }

    public final String component62() {
        return this.modify_doc_dms_url;
    }

    public final Object component63() {
        return this.modifydmsurl;
    }

    public final boolean component64() {
        return this.mul_hpa;
    }

    public final boolean component65() {
        return this.multiple_state_action;
    }

    public final int component66() {
        return this.nid_days;
    }

    public final boolean component67() {
        return this.nidfitexempt;
    }

    public final boolean component68() {
        return this.noc_ret;
    }

    public final boolean component69() {
        return this.nochpthpccheck;
    }

    public final boolean component7() {
        return this.appt_bfr_payment;
    }

    public final Object component70() {
        return this.offline;
    }

    public final Object component71() {
        return this.offlistforrrc;
    }

    public final Object component72() {
        return this.offlistrrc;
    }

    public final boolean component73() {
        return this.other_state_fitness;
    }

    public final boolean component74() {
        return this.otpskip;
    }

    public final Object component75() {
        return this.payment_complaint_type;
    }

    public final boolean component76() {
        return this.payment_compounding_fee;
    }

    public final boolean component77() {
        return this.paymentsch;
    }

    public final int component78() {
        return this.pgiamount;
    }

    public final boolean component79() {
        return this.printfit_inspection;
    }

    public final Object component8() {
        return this.autoapproval_purcd;
    }

    public final String component80() {
        return this.printfitdays;
    }

    public final String component81() {
        return this.pur_cd;
    }

    public final int component82() {
        return this.rc_print_days_allowed;
    }

    public final Object component83() {
        return this.rcprint_restriction;
    }

    public final boolean component84() {
        return this.regnrenewalcheck;
    }

    public final Object component85() {
        return this.restrictapplinchallanpnd;
    }

    public final Object component86() {
        return this.restrictedfitnessblacklistcodes;
    }

    public final Object component87() {
        return this.restrictedfitnesscenteroffcd;
    }

    public final String component88() {
        return this.state_cd;
    }

    public final String component89() {
        return this.state_header;
    }

    public final Object component9() {
        return this.blacklistcondformula;
    }

    public final Object component90() {
        return this.stateauthtype;
    }

    public final String component91() {
        return this.tax_nt_vehicle;
    }

    public final String component92() {
        return this.tax_restrict_transprt_veh;
    }

    public final String component93() {
        return this.tax_stopping_msg;
    }

    public final boolean component94() {
        return this.taxaddrecovery;
    }

    public final boolean component95() {
        return this.taxexemptionconv;
    }

    public final TmState component96() {
        return this.tmState;
    }

    public final boolean component97() {
        return this.upload_doc;
    }

    public final StateCostForDms copy(Object obj, boolean z10, Object obj2, boolean z11, String str, String str2, boolean z12, Object obj3, Object obj4, String str3, Object obj5, String str4, String str5, String str6, boolean z13, String str7, String str8, Object obj6, Object obj7, Object obj8, boolean z14, String str9, String str10, String str11, boolean z15, String str12, Object obj9, boolean z16, boolean z17, boolean z18, String str13, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, String str14, boolean z33, boolean z34, boolean z35, boolean z36, Object obj10, boolean z37, boolean z38, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, boolean z44, boolean z45, boolean z46, String str15, Object obj11, boolean z47, boolean z48, int i10, boolean z49, boolean z50, boolean z51, Object obj12, Object obj13, Object obj14, boolean z52, boolean z53, Object obj15, boolean z54, boolean z55, int i11, boolean z56, String str16, String str17, int i12, Object obj16, boolean z57, Object obj17, Object obj18, Object obj19, String str18, String str19, Object obj20, String str20, String str21, String str22, boolean z58, boolean z59, TmState tmState2, boolean z60) {
        Object obj21 = obj;
        l.f(obj21, "aadhar_based_autoapproval_purcd");
        l.f(obj2, "adv_vhclass");
        l.f(str, "allowaapplinnonuse");
        l.f(str2, "allowapplinpendingchallan");
        l.f(obj3, "autoapproval_purcd");
        l.f(obj4, "blacklistcondformula");
        l.f(str3, "blacklistedpur");
        l.f(obj5, "blacklistrestrictpur_cd");
        l.f(str4, "book_app");
        l.f(str5, "challanpndingrestrictpur_cd");
        l.f(str6, "combination_service_allowed_anywhere");
        l.f(str7, "directinwardpurcode");
        l.f(str8, "dms_url");
        l.f(obj6, "dmsurl");
        l.f(obj7, "doc_exemp_from");
        l.f(obj8, "doc_exemp_upto");
        l.f(str9, "esign_pur_cd");
        l.f(str11, "fee_exempt_owner_cd");
        l.f(str12, "fitness_nt_vehicle");
        l.f(obj9, "fitnesscenterlist");
        l.f(str13, "insuranceret");
        l.f(str14, "ismobileregistered");
        l.f(obj10, "ispermitallowservice");
        l.f(str15, "modify_doc_dms_url");
        l.f(obj11, "modifydmsurl");
        l.f(obj12, "offline");
        l.f(obj13, "offlistforrrc");
        l.f(obj14, "offlistrrc");
        l.f(obj15, "payment_complaint_type");
        l.f(str16, "printfitdays");
        l.f(str17, "pur_cd");
        l.f(obj16, "rcprint_restriction");
        l.f(obj17, "restrictapplinchallanpnd");
        l.f(obj18, "restrictedfitnessblacklistcodes");
        l.f(obj19, "restrictedfitnesscenteroffcd");
        l.f(str18, "state_cd");
        l.f(str19, "state_header");
        l.f(obj20, "stateauthtype");
        l.f(str20, "tax_nt_vehicle");
        l.f(str21, "tax_restrict_transprt_veh");
        l.f(str22, "tax_stopping_msg");
        l.f(tmState2, "tmState");
        return new StateCostForDms(obj21, z10, obj2, z11, str, str2, z12, obj3, obj4, str3, obj5, str4, str5, str6, z13, str7, str8, obj6, obj7, obj8, z14, str9, str10, str11, z15, str12, obj9, z16, z17, z18, str13, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, str14, z33, z34, z35, z36, obj10, z37, z38, z39, z40, z41, z42, z43, z44, z45, z46, str15, obj11, z47, z48, i10, z49, z50, z51, obj12, obj13, obj14, z52, z53, obj15, z54, z55, i11, z56, str16, str17, i12, obj16, z57, obj17, obj18, obj19, str18, str19, obj20, str20, str21, str22, z58, z59, tmState2, z60);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateCostForDms)) {
            return false;
        }
        StateCostForDms stateCostForDms = (StateCostForDms) obj;
        return l.a(this.aadhar_based_autoapproval_purcd, stateCostForDms.aadhar_based_autoapproval_purcd) && this.aadharfailexempt == stateCostForDms.aadharfailexempt && l.a(this.adv_vhclass, stateCostForDms.adv_vhclass) && this.allow_fitness_all_rto == stateCostForDms.allow_fitness_all_rto && l.a(this.allowaapplinnonuse, stateCostForDms.allowaapplinnonuse) && l.a(this.allowapplinpendingchallan, stateCostForDms.allowapplinpendingchallan) && this.appt_bfr_payment == stateCostForDms.appt_bfr_payment && l.a(this.autoapproval_purcd, stateCostForDms.autoapproval_purcd) && l.a(this.blacklistcondformula, stateCostForDms.blacklistcondformula) && l.a(this.blacklistedpur, stateCostForDms.blacklistedpur) && l.a(this.blacklistrestrictpur_cd, stateCostForDms.blacklistrestrictpur_cd) && l.a(this.book_app, stateCostForDms.book_app) && l.a(this.challanpndingrestrictpur_cd, stateCostForDms.challanpndingrestrictpur_cd) && l.a(this.combination_service_allowed_anywhere, stateCostForDms.combination_service_allowed_anywhere) && this.conversion_check == stateCostForDms.conversion_check && l.a(this.directinwardpurcode, stateCostForDms.directinwardpurcode) && l.a(this.dms_url, stateCostForDms.dms_url) && l.a(this.dmsurl, stateCostForDms.dmsurl) && l.a(this.doc_exemp_from, stateCostForDms.doc_exemp_from) && l.a(this.doc_exemp_upto, stateCostForDms.doc_exemp_upto) && this.doc_merge == stateCostForDms.doc_merge && l.a(this.esign_pur_cd, stateCostForDms.esign_pur_cd) && l.a(this.faceless_service_purcd, stateCostForDms.faceless_service_purcd) && l.a(this.fee_exempt_owner_cd, stateCostForDms.fee_exempt_owner_cd) && this.fit_fine_due_nid == stateCostForDms.fit_fine_due_nid && l.a(this.fitness_nt_vehicle, stateCostForDms.fitness_nt_vehicle) && l.a(this.fitnesscenterlist, stateCostForDms.fitnesscenterlist) && this.fitnessexpirymsgappt == stateCostForDms.fitnessexpirymsgappt && this.form23 == stateCostForDms.form23 && this.form23printwithvahantrans == stateCostForDms.form23printwithvahantrans && l.a(this.insuranceret, stateCostForDms.insuranceret) && this.is_penalty_applicable == stateCostForDms.is_penalty_applicable && this.is_tax_installment == stateCostForDms.is_tax_installment && this.isaadhaarmobileupdate == stateCostForDms.isaadhaarmobileupdate && this.isallowfitnesscertificatefeeafterfitnessfail == stateCostForDms.isallowfitnesscertificatefeeafterfitnessfail && this.isconversionallowttont == stateCostForDms.isconversionallowttont && this.isdirectinward == stateCostForDms.isdirectinward && this.isesign == stateCostForDms.isesign && this.isfitnessallow == stateCostForDms.isfitnessallow && this.isfitnessdirectallow == stateCostForDms.isfitnessdirectallow && this.ishptwithto_or_cainothr_rto == stateCostForDms.ishptwithto_or_cainothr_rto && this.isinschkrcsurr == stateCostForDms.isinschkrcsurr && this.isinsurance == stateCostForDms.isinsurance && this.isinsuranceentryrestricted == stateCostForDms.isinsuranceentryrestricted && this.ismandate_docs_bfr_rcpt == stateCostForDms.ismandate_docs_bfr_rcpt && l.a(this.ismobileregistered, stateCostForDms.ismobileregistered) && this.ismultiple_app == stateCostForDms.ismultiple_app && this.isncrbblacklist == stateCostForDms.isncrbblacklist && this.isnocprint == stateCostForDms.isnocprint && this.isotpmobileto == stateCostForDms.isotpmobileto && l.a(this.ispermitallowservice, stateCostForDms.ispermitallowservice) && this.ispgitestpage == stateCostForDms.ispgitestpage && this.isprintrc == stateCostForDms.isprintrc && this.isprintrcpartcert == stateCostForDms.isprintrcpartcert && this.isprinttaxtoken == stateCostForDms.isprinttaxtoken && this.isrechkfailedtran == stateCostForDms.isrechkfailedtran && this.isrmaallowed == stateCostForDms.isrmaallowed && this.isrrcwithbasicservices == stateCostForDms.isrrcwithbasicservices && this.istaxallow == stateCostForDms.istaxallow && this.istdsenable == stateCostForDms.istdsenable && this.istemprc == stateCostForDms.istemprc && l.a(this.modify_doc_dms_url, stateCostForDms.modify_doc_dms_url) && l.a(this.modifydmsurl, stateCostForDms.modifydmsurl) && this.mul_hpa == stateCostForDms.mul_hpa && this.multiple_state_action == stateCostForDms.multiple_state_action && this.nid_days == stateCostForDms.nid_days && this.nidfitexempt == stateCostForDms.nidfitexempt && this.noc_ret == stateCostForDms.noc_ret && this.nochpthpccheck == stateCostForDms.nochpthpccheck && l.a(this.offline, stateCostForDms.offline) && l.a(this.offlistforrrc, stateCostForDms.offlistforrrc) && l.a(this.offlistrrc, stateCostForDms.offlistrrc) && this.other_state_fitness == stateCostForDms.other_state_fitness && this.otpskip == stateCostForDms.otpskip && l.a(this.payment_complaint_type, stateCostForDms.payment_complaint_type) && this.payment_compounding_fee == stateCostForDms.payment_compounding_fee && this.paymentsch == stateCostForDms.paymentsch && this.pgiamount == stateCostForDms.pgiamount && this.printfit_inspection == stateCostForDms.printfit_inspection && l.a(this.printfitdays, stateCostForDms.printfitdays) && l.a(this.pur_cd, stateCostForDms.pur_cd) && this.rc_print_days_allowed == stateCostForDms.rc_print_days_allowed && l.a(this.rcprint_restriction, stateCostForDms.rcprint_restriction) && this.regnrenewalcheck == stateCostForDms.regnrenewalcheck && l.a(this.restrictapplinchallanpnd, stateCostForDms.restrictapplinchallanpnd) && l.a(this.restrictedfitnessblacklistcodes, stateCostForDms.restrictedfitnessblacklistcodes) && l.a(this.restrictedfitnesscenteroffcd, stateCostForDms.restrictedfitnesscenteroffcd) && l.a(this.state_cd, stateCostForDms.state_cd) && l.a(this.state_header, stateCostForDms.state_header) && l.a(this.stateauthtype, stateCostForDms.stateauthtype) && l.a(this.tax_nt_vehicle, stateCostForDms.tax_nt_vehicle) && l.a(this.tax_restrict_transprt_veh, stateCostForDms.tax_restrict_transprt_veh) && l.a(this.tax_stopping_msg, stateCostForDms.tax_stopping_msg) && this.taxaddrecovery == stateCostForDms.taxaddrecovery && this.taxexemptionconv == stateCostForDms.taxexemptionconv && l.a(this.tmState, stateCostForDms.tmState) && this.upload_doc == stateCostForDms.upload_doc;
    }

    public final Object getAadhar_based_autoapproval_purcd() {
        return this.aadhar_based_autoapproval_purcd;
    }

    public final boolean getAadharfailexempt() {
        return this.aadharfailexempt;
    }

    public final Object getAdv_vhclass() {
        return this.adv_vhclass;
    }

    public final boolean getAllow_fitness_all_rto() {
        return this.allow_fitness_all_rto;
    }

    public final String getAllowaapplinnonuse() {
        return this.allowaapplinnonuse;
    }

    public final String getAllowapplinpendingchallan() {
        return this.allowapplinpendingchallan;
    }

    public final boolean getAppt_bfr_payment() {
        return this.appt_bfr_payment;
    }

    public final Object getAutoapproval_purcd() {
        return this.autoapproval_purcd;
    }

    public final Object getBlacklistcondformula() {
        return this.blacklistcondformula;
    }

    public final String getBlacklistedpur() {
        return this.blacklistedpur;
    }

    public final Object getBlacklistrestrictpur_cd() {
        return this.blacklistrestrictpur_cd;
    }

    public final String getBook_app() {
        return this.book_app;
    }

    public final String getChallanpndingrestrictpur_cd() {
        return this.challanpndingrestrictpur_cd;
    }

    public final String getCombination_service_allowed_anywhere() {
        return this.combination_service_allowed_anywhere;
    }

    public final boolean getConversion_check() {
        return this.conversion_check;
    }

    public final String getDirectinwardpurcode() {
        return this.directinwardpurcode;
    }

    public final String getDms_url() {
        return this.dms_url;
    }

    public final Object getDmsurl() {
        return this.dmsurl;
    }

    public final Object getDoc_exemp_from() {
        return this.doc_exemp_from;
    }

    public final Object getDoc_exemp_upto() {
        return this.doc_exemp_upto;
    }

    public final boolean getDoc_merge() {
        return this.doc_merge;
    }

    public final String getEsign_pur_cd() {
        return this.esign_pur_cd;
    }

    public final String getFaceless_service_purcd() {
        return this.faceless_service_purcd;
    }

    public final String getFee_exempt_owner_cd() {
        return this.fee_exempt_owner_cd;
    }

    public final boolean getFit_fine_due_nid() {
        return this.fit_fine_due_nid;
    }

    public final String getFitness_nt_vehicle() {
        return this.fitness_nt_vehicle;
    }

    public final Object getFitnesscenterlist() {
        return this.fitnesscenterlist;
    }

    public final boolean getFitnessexpirymsgappt() {
        return this.fitnessexpirymsgappt;
    }

    public final boolean getForm23() {
        return this.form23;
    }

    public final boolean getForm23printwithvahantrans() {
        return this.form23printwithvahantrans;
    }

    public final String getInsuranceret() {
        return this.insuranceret;
    }

    public final boolean getIsaadhaarmobileupdate() {
        return this.isaadhaarmobileupdate;
    }

    public final boolean getIsallowfitnesscertificatefeeafterfitnessfail() {
        return this.isallowfitnesscertificatefeeafterfitnessfail;
    }

    public final boolean getIsconversionallowttont() {
        return this.isconversionallowttont;
    }

    public final boolean getIsdirectinward() {
        return this.isdirectinward;
    }

    public final boolean getIsesign() {
        return this.isesign;
    }

    public final boolean getIsfitnessallow() {
        return this.isfitnessallow;
    }

    public final boolean getIsfitnessdirectallow() {
        return this.isfitnessdirectallow;
    }

    public final boolean getIshptwithto_or_cainothr_rto() {
        return this.ishptwithto_or_cainothr_rto;
    }

    public final boolean getIsinschkrcsurr() {
        return this.isinschkrcsurr;
    }

    public final boolean getIsinsurance() {
        return this.isinsurance;
    }

    public final boolean getIsinsuranceentryrestricted() {
        return this.isinsuranceentryrestricted;
    }

    public final boolean getIsmandate_docs_bfr_rcpt() {
        return this.ismandate_docs_bfr_rcpt;
    }

    public final String getIsmobileregistered() {
        return this.ismobileregistered;
    }

    public final boolean getIsmultiple_app() {
        return this.ismultiple_app;
    }

    public final boolean getIsncrbblacklist() {
        return this.isncrbblacklist;
    }

    public final boolean getIsnocprint() {
        return this.isnocprint;
    }

    public final boolean getIsotpmobileto() {
        return this.isotpmobileto;
    }

    public final Object getIspermitallowservice() {
        return this.ispermitallowservice;
    }

    public final boolean getIspgitestpage() {
        return this.ispgitestpage;
    }

    public final boolean getIsprintrc() {
        return this.isprintrc;
    }

    public final boolean getIsprintrcpartcert() {
        return this.isprintrcpartcert;
    }

    public final boolean getIsprinttaxtoken() {
        return this.isprinttaxtoken;
    }

    public final boolean getIsrechkfailedtran() {
        return this.isrechkfailedtran;
    }

    public final boolean getIsrmaallowed() {
        return this.isrmaallowed;
    }

    public final boolean getIsrrcwithbasicservices() {
        return this.isrrcwithbasicservices;
    }

    public final boolean getIstaxallow() {
        return this.istaxallow;
    }

    public final boolean getIstdsenable() {
        return this.istdsenable;
    }

    public final boolean getIstemprc() {
        return this.istemprc;
    }

    public final String getModify_doc_dms_url() {
        return this.modify_doc_dms_url;
    }

    public final Object getModifydmsurl() {
        return this.modifydmsurl;
    }

    public final boolean getMul_hpa() {
        return this.mul_hpa;
    }

    public final boolean getMultiple_state_action() {
        return this.multiple_state_action;
    }

    public final int getNid_days() {
        return this.nid_days;
    }

    public final boolean getNidfitexempt() {
        return this.nidfitexempt;
    }

    public final boolean getNoc_ret() {
        return this.noc_ret;
    }

    public final boolean getNochpthpccheck() {
        return this.nochpthpccheck;
    }

    public final Object getOffline() {
        return this.offline;
    }

    public final Object getOfflistforrrc() {
        return this.offlistforrrc;
    }

    public final Object getOfflistrrc() {
        return this.offlistrrc;
    }

    public final boolean getOther_state_fitness() {
        return this.other_state_fitness;
    }

    public final boolean getOtpskip() {
        return this.otpskip;
    }

    public final Object getPayment_complaint_type() {
        return this.payment_complaint_type;
    }

    public final boolean getPayment_compounding_fee() {
        return this.payment_compounding_fee;
    }

    public final boolean getPaymentsch() {
        return this.paymentsch;
    }

    public final int getPgiamount() {
        return this.pgiamount;
    }

    public final boolean getPrintfit_inspection() {
        return this.printfit_inspection;
    }

    public final String getPrintfitdays() {
        return this.printfitdays;
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final int getRc_print_days_allowed() {
        return this.rc_print_days_allowed;
    }

    public final Object getRcprint_restriction() {
        return this.rcprint_restriction;
    }

    public final boolean getRegnrenewalcheck() {
        return this.regnrenewalcheck;
    }

    public final Object getRestrictapplinchallanpnd() {
        return this.restrictapplinchallanpnd;
    }

    public final Object getRestrictedfitnessblacklistcodes() {
        return this.restrictedfitnessblacklistcodes;
    }

    public final Object getRestrictedfitnesscenteroffcd() {
        return this.restrictedfitnesscenteroffcd;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_header() {
        return this.state_header;
    }

    public final Object getStateauthtype() {
        return this.stateauthtype;
    }

    public final String getTax_nt_vehicle() {
        return this.tax_nt_vehicle;
    }

    public final String getTax_restrict_transprt_veh() {
        return this.tax_restrict_transprt_veh;
    }

    public final String getTax_stopping_msg() {
        return this.tax_stopping_msg;
    }

    public final boolean getTaxaddrecovery() {
        return this.taxaddrecovery;
    }

    public final boolean getTaxexemptionconv() {
        return this.taxexemptionconv;
    }

    public final TmState getTmState() {
        return this.tmState;
    }

    public final boolean getUpload_doc() {
        return this.upload_doc;
    }

    public int hashCode() {
        int hashCode = this.aadhar_based_autoapproval_purcd.hashCode() * 31;
        boolean z10 = this.aadharfailexempt;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int hashCode2 = (((hashCode + (z10 ? 1 : 0)) * 31) + this.adv_vhclass.hashCode()) * 31;
        boolean z12 = this.allow_fitness_all_rto;
        if (z12) {
            z12 = true;
        }
        int hashCode3 = (((((hashCode2 + (z12 ? 1 : 0)) * 31) + this.allowaapplinnonuse.hashCode()) * 31) + this.allowapplinpendingchallan.hashCode()) * 31;
        boolean z13 = this.appt_bfr_payment;
        if (z13) {
            z13 = true;
        }
        int hashCode4 = (((((((((((((((hashCode3 + (z13 ? 1 : 0)) * 31) + this.autoapproval_purcd.hashCode()) * 31) + this.blacklistcondformula.hashCode()) * 31) + this.blacklistedpur.hashCode()) * 31) + this.blacklistrestrictpur_cd.hashCode()) * 31) + this.book_app.hashCode()) * 31) + this.challanpndingrestrictpur_cd.hashCode()) * 31) + this.combination_service_allowed_anywhere.hashCode()) * 31;
        boolean z14 = this.conversion_check;
        if (z14) {
            z14 = true;
        }
        int hashCode5 = (((((((((((hashCode4 + (z14 ? 1 : 0)) * 31) + this.directinwardpurcode.hashCode()) * 31) + this.dms_url.hashCode()) * 31) + this.dmsurl.hashCode()) * 31) + this.doc_exemp_from.hashCode()) * 31) + this.doc_exemp_upto.hashCode()) * 31;
        boolean z15 = this.doc_merge;
        if (z15) {
            z15 = true;
        }
        int hashCode6 = (((hashCode5 + (z15 ? 1 : 0)) * 31) + this.esign_pur_cd.hashCode()) * 31;
        String str = this.faceless_service_purcd;
        int hashCode7 = (((hashCode6 + (str == null ? 0 : str.hashCode())) * 31) + this.fee_exempt_owner_cd.hashCode()) * 31;
        boolean z16 = this.fit_fine_due_nid;
        if (z16) {
            z16 = true;
        }
        int hashCode8 = (((((hashCode7 + (z16 ? 1 : 0)) * 31) + this.fitness_nt_vehicle.hashCode()) * 31) + this.fitnesscenterlist.hashCode()) * 31;
        boolean z17 = this.fitnessexpirymsgappt;
        if (z17) {
            z17 = true;
        }
        int i10 = (hashCode8 + (z17 ? 1 : 0)) * 31;
        boolean z18 = this.form23;
        if (z18) {
            z18 = true;
        }
        int i11 = (i10 + (z18 ? 1 : 0)) * 31;
        boolean z19 = this.form23printwithvahantrans;
        if (z19) {
            z19 = true;
        }
        int hashCode9 = (((i11 + (z19 ? 1 : 0)) * 31) + this.insuranceret.hashCode()) * 31;
        boolean z20 = this.is_penalty_applicable;
        if (z20) {
            z20 = true;
        }
        int i12 = (hashCode9 + (z20 ? 1 : 0)) * 31;
        boolean z21 = this.is_tax_installment;
        if (z21) {
            z21 = true;
        }
        int i13 = (i12 + (z21 ? 1 : 0)) * 31;
        boolean z22 = this.isaadhaarmobileupdate;
        if (z22) {
            z22 = true;
        }
        int i14 = (i13 + (z22 ? 1 : 0)) * 31;
        boolean z23 = this.isallowfitnesscertificatefeeafterfitnessfail;
        if (z23) {
            z23 = true;
        }
        int i15 = (i14 + (z23 ? 1 : 0)) * 31;
        boolean z24 = this.isconversionallowttont;
        if (z24) {
            z24 = true;
        }
        int i16 = (i15 + (z24 ? 1 : 0)) * 31;
        boolean z25 = this.isdirectinward;
        if (z25) {
            z25 = true;
        }
        int i17 = (i16 + (z25 ? 1 : 0)) * 31;
        boolean z26 = this.isesign;
        if (z26) {
            z26 = true;
        }
        int i18 = (i17 + (z26 ? 1 : 0)) * 31;
        boolean z27 = this.isfitnessallow;
        if (z27) {
            z27 = true;
        }
        int i19 = (i18 + (z27 ? 1 : 0)) * 31;
        boolean z28 = this.isfitnessdirectallow;
        if (z28) {
            z28 = true;
        }
        int i20 = (i19 + (z28 ? 1 : 0)) * 31;
        boolean z29 = this.ishptwithto_or_cainothr_rto;
        if (z29) {
            z29 = true;
        }
        int i21 = (i20 + (z29 ? 1 : 0)) * 31;
        boolean z30 = this.isinschkrcsurr;
        if (z30) {
            z30 = true;
        }
        int i22 = (i21 + (z30 ? 1 : 0)) * 31;
        boolean z31 = this.isinsurance;
        if (z31) {
            z31 = true;
        }
        int i23 = (i22 + (z31 ? 1 : 0)) * 31;
        boolean z32 = this.isinsuranceentryrestricted;
        if (z32) {
            z32 = true;
        }
        int i24 = (i23 + (z32 ? 1 : 0)) * 31;
        boolean z33 = this.ismandate_docs_bfr_rcpt;
        if (z33) {
            z33 = true;
        }
        int hashCode10 = (((i24 + (z33 ? 1 : 0)) * 31) + this.ismobileregistered.hashCode()) * 31;
        boolean z34 = this.ismultiple_app;
        if (z34) {
            z34 = true;
        }
        int i25 = (hashCode10 + (z34 ? 1 : 0)) * 31;
        boolean z35 = this.isncrbblacklist;
        if (z35) {
            z35 = true;
        }
        int i26 = (i25 + (z35 ? 1 : 0)) * 31;
        boolean z36 = this.isnocprint;
        if (z36) {
            z36 = true;
        }
        int i27 = (i26 + (z36 ? 1 : 0)) * 31;
        boolean z37 = this.isotpmobileto;
        if (z37) {
            z37 = true;
        }
        int hashCode11 = (((i27 + (z37 ? 1 : 0)) * 31) + this.ispermitallowservice.hashCode()) * 31;
        boolean z38 = this.ispgitestpage;
        if (z38) {
            z38 = true;
        }
        int i28 = (hashCode11 + (z38 ? 1 : 0)) * 31;
        boolean z39 = this.isprintrc;
        if (z39) {
            z39 = true;
        }
        int i29 = (i28 + (z39 ? 1 : 0)) * 31;
        boolean z40 = this.isprintrcpartcert;
        if (z40) {
            z40 = true;
        }
        int i30 = (i29 + (z40 ? 1 : 0)) * 31;
        boolean z41 = this.isprinttaxtoken;
        if (z41) {
            z41 = true;
        }
        int i31 = (i30 + (z41 ? 1 : 0)) * 31;
        boolean z42 = this.isrechkfailedtran;
        if (z42) {
            z42 = true;
        }
        int i32 = (i31 + (z42 ? 1 : 0)) * 31;
        boolean z43 = this.isrmaallowed;
        if (z43) {
            z43 = true;
        }
        int i33 = (i32 + (z43 ? 1 : 0)) * 31;
        boolean z44 = this.isrrcwithbasicservices;
        if (z44) {
            z44 = true;
        }
        int i34 = (i33 + (z44 ? 1 : 0)) * 31;
        boolean z45 = this.istaxallow;
        if (z45) {
            z45 = true;
        }
        int i35 = (i34 + (z45 ? 1 : 0)) * 31;
        boolean z46 = this.istdsenable;
        if (z46) {
            z46 = true;
        }
        int i36 = (i35 + (z46 ? 1 : 0)) * 31;
        boolean z47 = this.istemprc;
        if (z47) {
            z47 = true;
        }
        int hashCode12 = (((((i36 + (z47 ? 1 : 0)) * 31) + this.modify_doc_dms_url.hashCode()) * 31) + this.modifydmsurl.hashCode()) * 31;
        boolean z48 = this.mul_hpa;
        if (z48) {
            z48 = true;
        }
        int i37 = (hashCode12 + (z48 ? 1 : 0)) * 31;
        boolean z49 = this.multiple_state_action;
        if (z49) {
            z49 = true;
        }
        int hashCode13 = (((i37 + (z49 ? 1 : 0)) * 31) + Integer.hashCode(this.nid_days)) * 31;
        boolean z50 = this.nidfitexempt;
        if (z50) {
            z50 = true;
        }
        int i38 = (hashCode13 + (z50 ? 1 : 0)) * 31;
        boolean z51 = this.noc_ret;
        if (z51) {
            z51 = true;
        }
        int i39 = (i38 + (z51 ? 1 : 0)) * 31;
        boolean z52 = this.nochpthpccheck;
        if (z52) {
            z52 = true;
        }
        int hashCode14 = (((((((i39 + (z52 ? 1 : 0)) * 31) + this.offline.hashCode()) * 31) + this.offlistforrrc.hashCode()) * 31) + this.offlistrrc.hashCode()) * 31;
        boolean z53 = this.other_state_fitness;
        if (z53) {
            z53 = true;
        }
        int i40 = (hashCode14 + (z53 ? 1 : 0)) * 31;
        boolean z54 = this.otpskip;
        if (z54) {
            z54 = true;
        }
        int hashCode15 = (((i40 + (z54 ? 1 : 0)) * 31) + this.payment_complaint_type.hashCode()) * 31;
        boolean z55 = this.payment_compounding_fee;
        if (z55) {
            z55 = true;
        }
        int i41 = (hashCode15 + (z55 ? 1 : 0)) * 31;
        boolean z56 = this.paymentsch;
        if (z56) {
            z56 = true;
        }
        int hashCode16 = (((i41 + (z56 ? 1 : 0)) * 31) + Integer.hashCode(this.pgiamount)) * 31;
        boolean z57 = this.printfit_inspection;
        if (z57) {
            z57 = true;
        }
        int hashCode17 = (((((((((hashCode16 + (z57 ? 1 : 0)) * 31) + this.printfitdays.hashCode()) * 31) + this.pur_cd.hashCode()) * 31) + Integer.hashCode(this.rc_print_days_allowed)) * 31) + this.rcprint_restriction.hashCode()) * 31;
        boolean z58 = this.regnrenewalcheck;
        if (z58) {
            z58 = true;
        }
        int hashCode18 = (((((((((((((((((((hashCode17 + (z58 ? 1 : 0)) * 31) + this.restrictapplinchallanpnd.hashCode()) * 31) + this.restrictedfitnessblacklistcodes.hashCode()) * 31) + this.restrictedfitnesscenteroffcd.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.stateauthtype.hashCode()) * 31) + this.tax_nt_vehicle.hashCode()) * 31) + this.tax_restrict_transprt_veh.hashCode()) * 31) + this.tax_stopping_msg.hashCode()) * 31;
        boolean z59 = this.taxaddrecovery;
        if (z59) {
            z59 = true;
        }
        int i42 = (hashCode18 + (z59 ? 1 : 0)) * 31;
        boolean z60 = this.taxexemptionconv;
        if (z60) {
            z60 = true;
        }
        int hashCode19 = (((i42 + (z60 ? 1 : 0)) * 31) + this.tmState.hashCode()) * 31;
        boolean z61 = this.upload_doc;
        if (!z61) {
            z11 = z61;
        }
        return hashCode19 + (z11 ? 1 : 0);
    }

    public final boolean is_penalty_applicable() {
        return this.is_penalty_applicable;
    }

    public final boolean is_tax_installment() {
        return this.is_tax_installment;
    }

    public String toString() {
        return "StateCostForDms(aadhar_based_autoapproval_purcd=" + this.aadhar_based_autoapproval_purcd + ", aadharfailexempt=" + this.aadharfailexempt + ", adv_vhclass=" + this.adv_vhclass + ", allow_fitness_all_rto=" + this.allow_fitness_all_rto + ", allowaapplinnonuse=" + this.allowaapplinnonuse + ", allowapplinpendingchallan=" + this.allowapplinpendingchallan + ", appt_bfr_payment=" + this.appt_bfr_payment + ", autoapproval_purcd=" + this.autoapproval_purcd + ", blacklistcondformula=" + this.blacklistcondformula + ", blacklistedpur=" + this.blacklistedpur + ", blacklistrestrictpur_cd=" + this.blacklistrestrictpur_cd + ", book_app=" + this.book_app + ", challanpndingrestrictpur_cd=" + this.challanpndingrestrictpur_cd + ", combination_service_allowed_anywhere=" + this.combination_service_allowed_anywhere + ", conversion_check=" + this.conversion_check + ", directinwardpurcode=" + this.directinwardpurcode + ", dms_url=" + this.dms_url + ", dmsurl=" + this.dmsurl + ", doc_exemp_from=" + this.doc_exemp_from + ", doc_exemp_upto=" + this.doc_exemp_upto + ", doc_merge=" + this.doc_merge + ", esign_pur_cd=" + this.esign_pur_cd + ", faceless_service_purcd=" + this.faceless_service_purcd + ", fee_exempt_owner_cd=" + this.fee_exempt_owner_cd + ", fit_fine_due_nid=" + this.fit_fine_due_nid + ", fitness_nt_vehicle=" + this.fitness_nt_vehicle + ", fitnesscenterlist=" + this.fitnesscenterlist + ", fitnessexpirymsgappt=" + this.fitnessexpirymsgappt + ", form23=" + this.form23 + ", form23printwithvahantrans=" + this.form23printwithvahantrans + ", insuranceret=" + this.insuranceret + ", is_penalty_applicable=" + this.is_penalty_applicable + ", is_tax_installment=" + this.is_tax_installment + ", isaadhaarmobileupdate=" + this.isaadhaarmobileupdate + ", isallowfitnesscertificatefeeafterfitnessfail=" + this.isallowfitnesscertificatefeeafterfitnessfail + ", isconversionallowttont=" + this.isconversionallowttont + ", isdirectinward=" + this.isdirectinward + ", isesign=" + this.isesign + ", isfitnessallow=" + this.isfitnessallow + ", isfitnessdirectallow=" + this.isfitnessdirectallow + ", ishptwithto_or_cainothr_rto=" + this.ishptwithto_or_cainothr_rto + ", isinschkrcsurr=" + this.isinschkrcsurr + ", isinsurance=" + this.isinsurance + ", isinsuranceentryrestricted=" + this.isinsuranceentryrestricted + ", ismandate_docs_bfr_rcpt=" + this.ismandate_docs_bfr_rcpt + ", ismobileregistered=" + this.ismobileregistered + ", ismultiple_app=" + this.ismultiple_app + ", isncrbblacklist=" + this.isncrbblacklist + ", isnocprint=" + this.isnocprint + ", isotpmobileto=" + this.isotpmobileto + ", ispermitallowservice=" + this.ispermitallowservice + ", ispgitestpage=" + this.ispgitestpage + ", isprintrc=" + this.isprintrc + ", isprintrcpartcert=" + this.isprintrcpartcert + ", isprinttaxtoken=" + this.isprinttaxtoken + ", isrechkfailedtran=" + this.isrechkfailedtran + ", isrmaallowed=" + this.isrmaallowed + ", isrrcwithbasicservices=" + this.isrrcwithbasicservices + ", istaxallow=" + this.istaxallow + ", istdsenable=" + this.istdsenable + ", istemprc=" + this.istemprc + ", modify_doc_dms_url=" + this.modify_doc_dms_url + ", modifydmsurl=" + this.modifydmsurl + ", mul_hpa=" + this.mul_hpa + ", multiple_state_action=" + this.multiple_state_action + ", nid_days=" + this.nid_days + ", nidfitexempt=" + this.nidfitexempt + ", noc_ret=" + this.noc_ret + ", nochpthpccheck=" + this.nochpthpccheck + ", offline=" + this.offline + ", offlistforrrc=" + this.offlistforrrc + ", offlistrrc=" + this.offlistrrc + ", other_state_fitness=" + this.other_state_fitness + ", otpskip=" + this.otpskip + ", payment_complaint_type=" + this.payment_complaint_type + ", payment_compounding_fee=" + this.payment_compounding_fee + ", paymentsch=" + this.paymentsch + ", pgiamount=" + this.pgiamount + ", printfit_inspection=" + this.printfit_inspection + ", printfitdays=" + this.printfitdays + ", pur_cd=" + this.pur_cd + ", rc_print_days_allowed=" + this.rc_print_days_allowed + ", rcprint_restriction=" + this.rcprint_restriction + ", regnrenewalcheck=" + this.regnrenewalcheck + ", restrictapplinchallanpnd=" + this.restrictapplinchallanpnd + ", restrictedfitnessblacklistcodes=" + this.restrictedfitnessblacklistcodes + ", restrictedfitnesscenteroffcd=" + this.restrictedfitnesscenteroffcd + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", stateauthtype=" + this.stateauthtype + ", tax_nt_vehicle=" + this.tax_nt_vehicle + ", tax_restrict_transprt_veh=" + this.tax_restrict_transprt_veh + ", tax_stopping_msg=" + this.tax_stopping_msg + ", taxaddrecovery=" + this.taxaddrecovery + ", taxexemptionconv=" + this.taxexemptionconv + ", tmState=" + this.tmState + ", upload_doc=" + this.upload_doc + ')';
    }
}
