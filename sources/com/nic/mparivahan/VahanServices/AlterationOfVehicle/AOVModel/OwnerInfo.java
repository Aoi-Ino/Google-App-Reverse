package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class OwnerInfo {
    private final String acfitted;
    private final Object annualincome;
    private final String audiofitted;
    private final String bodytype;
    private final String cadd1;
    private final String cadd2;
    private final String cadd3;
    private final String catgdescr;
    private final String cdistrict;
    private final String cdistrictname;
    private final String chasino;
    private final String chasinofull;
    private final String chasinooriginal;
    private final String color;
    private final String cpincode;
    private final String cstate;
    private final String cstatename;
    private final Integer cubiccap;
    private final String dealercd;
    private final String dlradd1;
    private final String dlradd2;
    private final String dlradd3;
    private final String dlrcity;
    private final String dlrdistrict;
    private final String dlrname;
    private final String dlrpincode;
    private final String engno;
    private final String engnofull;
    private final Long fitupto;
    private final String fituptodescr;
    private final Object floorarea;
    private final String fname;
    private final Integer fuel;
    private final String fueldescr;
    private final Object garageadd;
    private final Integer gcw;
    private final Object height;

    /* renamed from: hp  reason: collision with root package name */
    private final Integer f20518hp;
    private final String importedvch;
    private final Object lasercode;
    private final Integer ldwt;
    private final Object length;
    private final Integer maker;
    private final String makermodel;
    private final Integer manumon;
    private final Integer manuyr;
    private final String modelcd;
    private final Integer nocyl;
    private final Integer norms;
    private final String normsdescr;
    private final Integer offcd;
    private final String offname;
    private final Long opdt;
    private final Object othercriteria;
    private final Long ownerFrom;
    private final Integer ownercd;
    private final String ownercddescr;
    private final String ownername;
    private final Integer ownersr;
    private final String padd1;
    private final String padd2;
    private final String padd3;
    private final Integer pdistrict;
    private final String pdistrictname;
    private final Integer permitrtocd;
    private final Integer ppincode;
    private final String pstate;
    private final String pstatename;
    private final String purchasedt;
    private final Long purchasedtasDate;
    private final String regndt;
    private final Long regndtasdate;
    private final String regnno;
    private final String regntype;
    private final String regntypedescr;
    private final Long regnupto;
    private final Integer saleamt;
    private final Integer seatcap;
    private final Object sleepercap;
    private final Object standcap;
    private final String statecd;
    private final String statename;
    private final String status;
    private final Object taxmode;
    private final Object transportcatg;
    private final Integer unldwt;
    private final String vchcatg;
    private final String vchpurchaseas;
    private final String vchpurchaseasCode;
    private final Integer vehTypeAsInt;
    private final String vehtype;
    private final Integer vhclass;
    private final String vhclassdescr;
    private final String videofitted;
    private final VtOwnerIdentification vtOwnerIdentification;
    private final Object wheelbase;
    private final Object width;

    public OwnerInfo(String str, Object obj, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Integer num, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, Long l10, String str27, Object obj2, String str28, Integer num2, String str29, Object obj3, Integer num3, Object obj4, Integer num4, String str30, Object obj5, Integer num5, Object obj6, Integer num6, String str31, Integer num7, Integer num8, String str32, Integer num9, Integer num10, String str33, Integer num11, String str34, Long l11, Object obj7, Long l12, Integer num12, String str35, String str36, Integer num13, String str37, String str38, String str39, Integer num14, String str40, Integer num15, Integer num16, String str41, String str42, String str43, Long l13, String str44, Long l14, String str45, String str46, String str47, Long l15, Integer num17, Integer num18, Object obj8, Object obj9, String str48, String str49, String str50, Object obj10, Object obj11, Integer num19, String str51, String str52, String str53, Integer num20, String str54, Integer num21, String str55, String str56, VtOwnerIdentification vtOwnerIdentification2, Object obj12, Object obj13) {
        this.acfitted = str;
        this.annualincome = obj;
        this.audiofitted = str2;
        this.bodytype = str3;
        this.cadd1 = str4;
        this.cadd2 = str5;
        this.cadd3 = str6;
        this.catgdescr = str7;
        this.cdistrict = str8;
        this.cdistrictname = str9;
        this.chasino = str10;
        this.chasinofull = str11;
        this.chasinooriginal = str12;
        this.color = str13;
        this.cpincode = str14;
        this.cstate = str15;
        this.cstatename = str16;
        this.cubiccap = num;
        this.dealercd = str17;
        this.dlradd1 = str18;
        this.dlradd2 = str19;
        this.dlradd3 = str20;
        this.dlrcity = str21;
        this.dlrdistrict = str22;
        this.dlrname = str23;
        this.dlrpincode = str24;
        this.engno = str25;
        this.engnofull = str26;
        this.fitupto = l10;
        this.fituptodescr = str27;
        this.floorarea = obj2;
        this.fname = str28;
        this.fuel = num2;
        this.fueldescr = str29;
        this.garageadd = obj3;
        this.gcw = num3;
        this.height = obj4;
        this.f20518hp = num4;
        this.importedvch = str30;
        this.lasercode = obj5;
        this.ldwt = num5;
        this.length = obj6;
        this.maker = num6;
        this.makermodel = str31;
        this.manumon = num7;
        this.manuyr = num8;
        this.modelcd = str32;
        this.nocyl = num9;
        this.norms = num10;
        this.normsdescr = str33;
        this.offcd = num11;
        this.offname = str34;
        this.opdt = l11;
        this.othercriteria = obj7;
        this.ownerFrom = l12;
        this.ownercd = num12;
        this.ownercddescr = str35;
        this.ownername = str36;
        this.ownersr = num13;
        this.padd1 = str37;
        this.padd2 = str38;
        this.padd3 = str39;
        this.pdistrict = num14;
        this.pdistrictname = str40;
        this.permitrtocd = num15;
        this.ppincode = num16;
        this.pstate = str41;
        this.pstatename = str42;
        this.purchasedt = str43;
        this.purchasedtasDate = l13;
        this.regndt = str44;
        this.regndtasdate = l14;
        this.regnno = str45;
        this.regntype = str46;
        this.regntypedescr = str47;
        this.regnupto = l15;
        this.saleamt = num17;
        this.seatcap = num18;
        this.sleepercap = obj8;
        this.standcap = obj9;
        this.statecd = str48;
        this.statename = str49;
        this.status = str50;
        this.taxmode = obj10;
        this.transportcatg = obj11;
        this.unldwt = num19;
        this.vchcatg = str51;
        this.vchpurchaseas = str52;
        this.vchpurchaseasCode = str53;
        this.vehTypeAsInt = num20;
        this.vehtype = str54;
        this.vhclass = num21;
        this.vhclassdescr = str55;
        this.videofitted = str56;
        this.vtOwnerIdentification = vtOwnerIdentification2;
        this.wheelbase = obj12;
        this.width = obj13;
    }

    public static /* synthetic */ OwnerInfo copy$default(OwnerInfo ownerInfo, String str, Object obj, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Integer num, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, Long l10, String str27, Object obj2, String str28, Integer num2, String str29, Object obj3, Integer num3, Object obj4, Integer num4, String str30, Object obj5, Integer num5, Object obj6, Integer num6, String str31, Integer num7, Integer num8, String str32, Integer num9, Integer num10, String str33, Integer num11, String str34, Long l11, Object obj7, Long l12, Integer num12, String str35, String str36, Integer num13, String str37, String str38, String str39, Integer num14, String str40, Integer num15, Integer num16, String str41, String str42, String str43, Long l13, String str44, Long l14, String str45, String str46, String str47, Long l15, Integer num17, Integer num18, Object obj8, Object obj9, String str48, String str49, String str50, Object obj10, Object obj11, Integer num19, String str51, String str52, String str53, Integer num20, String str54, Integer num21, String str55, String str56, VtOwnerIdentification vtOwnerIdentification2, Object obj12, Object obj13, int i10, int i11, int i12, int i13, Object obj14) {
        OwnerInfo ownerInfo2 = ownerInfo;
        int i14 = i10;
        int i15 = i11;
        int i16 = i12;
        return ownerInfo.copy((i14 & 1) != 0 ? ownerInfo2.acfitted : str, (i14 & 2) != 0 ? ownerInfo2.annualincome : obj, (i14 & 4) != 0 ? ownerInfo2.audiofitted : str2, (i14 & 8) != 0 ? ownerInfo2.bodytype : str3, (i14 & 16) != 0 ? ownerInfo2.cadd1 : str4, (i14 & 32) != 0 ? ownerInfo2.cadd2 : str5, (i14 & 64) != 0 ? ownerInfo2.cadd3 : str6, (i14 & 128) != 0 ? ownerInfo2.catgdescr : str7, (i14 & 256) != 0 ? ownerInfo2.cdistrict : str8, (i14 & 512) != 0 ? ownerInfo2.cdistrictname : str9, (i14 & 1024) != 0 ? ownerInfo2.chasino : str10, (i14 & 2048) != 0 ? ownerInfo2.chasinofull : str11, (i14 & 4096) != 0 ? ownerInfo2.chasinooriginal : str12, (i14 & 8192) != 0 ? ownerInfo2.color : str13, (i14 & 16384) != 0 ? ownerInfo2.cpincode : str14, (i14 & 32768) != 0 ? ownerInfo2.cstate : str15, (i14 & 65536) != 0 ? ownerInfo2.cstatename : str16, (i14 & 131072) != 0 ? ownerInfo2.cubiccap : num, (i14 & 262144) != 0 ? ownerInfo2.dealercd : str17, (i14 & 524288) != 0 ? ownerInfo2.dlradd1 : str18, (i14 & 1048576) != 0 ? ownerInfo2.dlradd2 : str19, (i14 & 2097152) != 0 ? ownerInfo2.dlradd3 : str20, (i14 & 4194304) != 0 ? ownerInfo2.dlrcity : str21, (i14 & 8388608) != 0 ? ownerInfo2.dlrdistrict : str22, (i14 & 16777216) != 0 ? ownerInfo2.dlrname : str23, (i14 & 33554432) != 0 ? ownerInfo2.dlrpincode : str24, (i14 & 67108864) != 0 ? ownerInfo2.engno : str25, (i14 & 134217728) != 0 ? ownerInfo2.engnofull : str26, (i14 & 268435456) != 0 ? ownerInfo2.fitupto : l10, (i14 & 536870912) != 0 ? ownerInfo2.fituptodescr : str27, (i14 & 1073741824) != 0 ? ownerInfo2.floorarea : obj2, (i14 & Integer.MIN_VALUE) != 0 ? ownerInfo2.fname : str28, (i15 & 1) != 0 ? ownerInfo2.fuel : num2, (i15 & 2) != 0 ? ownerInfo2.fueldescr : str29, (i15 & 4) != 0 ? ownerInfo2.garageadd : obj3, (i15 & 8) != 0 ? ownerInfo2.gcw : num3, (i15 & 16) != 0 ? ownerInfo2.height : obj4, (i15 & 32) != 0 ? ownerInfo2.f20518hp : num4, (i15 & 64) != 0 ? ownerInfo2.importedvch : str30, (i15 & 128) != 0 ? ownerInfo2.lasercode : obj5, (i15 & 256) != 0 ? ownerInfo2.ldwt : num5, (i15 & 512) != 0 ? ownerInfo2.length : obj6, (i15 & 1024) != 0 ? ownerInfo2.maker : num6, (i15 & 2048) != 0 ? ownerInfo2.makermodel : str31, (i15 & 4096) != 0 ? ownerInfo2.manumon : num7, (i15 & 8192) != 0 ? ownerInfo2.manuyr : num8, (i15 & 16384) != 0 ? ownerInfo2.modelcd : str32, (i15 & 32768) != 0 ? ownerInfo2.nocyl : num9, (i15 & 65536) != 0 ? ownerInfo2.norms : num10, (i15 & 131072) != 0 ? ownerInfo2.normsdescr : str33, (i15 & 262144) != 0 ? ownerInfo2.offcd : num11, (i15 & 524288) != 0 ? ownerInfo2.offname : str34, (i15 & 1048576) != 0 ? ownerInfo2.opdt : l11, (i15 & 2097152) != 0 ? ownerInfo2.othercriteria : obj7, (i15 & 4194304) != 0 ? ownerInfo2.ownerFrom : l12, (i15 & 8388608) != 0 ? ownerInfo2.ownercd : num12, (i15 & 16777216) != 0 ? ownerInfo2.ownercddescr : str35, (i15 & 33554432) != 0 ? ownerInfo2.ownername : str36, (i15 & 67108864) != 0 ? ownerInfo2.ownersr : num13, (i15 & 134217728) != 0 ? ownerInfo2.padd1 : str37, (i15 & 268435456) != 0 ? ownerInfo2.padd2 : str38, (i15 & 536870912) != 0 ? ownerInfo2.padd3 : str39, (i15 & 1073741824) != 0 ? ownerInfo2.pdistrict : num14, (i15 & Integer.MIN_VALUE) != 0 ? ownerInfo2.pdistrictname : str40, (i16 & 1) != 0 ? ownerInfo2.permitrtocd : num15, (i16 & 2) != 0 ? ownerInfo2.ppincode : num16, (i16 & 4) != 0 ? ownerInfo2.pstate : str41, (i16 & 8) != 0 ? ownerInfo2.pstatename : str42, (i16 & 16) != 0 ? ownerInfo2.purchasedt : str43, (i16 & 32) != 0 ? ownerInfo2.purchasedtasDate : l13, (i16 & 64) != 0 ? ownerInfo2.regndt : str44, (i16 & 128) != 0 ? ownerInfo2.regndtasdate : l14, (i16 & 256) != 0 ? ownerInfo2.regnno : str45, (i16 & 512) != 0 ? ownerInfo2.regntype : str46, (i16 & 1024) != 0 ? ownerInfo2.regntypedescr : str47, (i16 & 2048) != 0 ? ownerInfo2.regnupto : l15, (i16 & 4096) != 0 ? ownerInfo2.saleamt : num17, (i16 & 8192) != 0 ? ownerInfo2.seatcap : num18, (i16 & 16384) != 0 ? ownerInfo2.sleepercap : obj8, (i16 & 32768) != 0 ? ownerInfo2.standcap : obj9, (i16 & 65536) != 0 ? ownerInfo2.statecd : str48, (i16 & 131072) != 0 ? ownerInfo2.statename : str49, (i16 & 262144) != 0 ? ownerInfo2.status : str50, (i16 & 524288) != 0 ? ownerInfo2.taxmode : obj10, (i16 & 1048576) != 0 ? ownerInfo2.transportcatg : obj11, (i16 & 2097152) != 0 ? ownerInfo2.unldwt : num19, (i16 & 4194304) != 0 ? ownerInfo2.vchcatg : str51, (i16 & 8388608) != 0 ? ownerInfo2.vchpurchaseas : str52, (i16 & 16777216) != 0 ? ownerInfo2.vchpurchaseasCode : str53, (i16 & 33554432) != 0 ? ownerInfo2.vehTypeAsInt : num20, (i16 & 67108864) != 0 ? ownerInfo2.vehtype : str54, (i16 & 134217728) != 0 ? ownerInfo2.vhclass : num21, (i16 & 268435456) != 0 ? ownerInfo2.vhclassdescr : str55, (i16 & 536870912) != 0 ? ownerInfo2.videofitted : str56, (i16 & 1073741824) != 0 ? ownerInfo2.vtOwnerIdentification : vtOwnerIdentification2, (i16 & Integer.MIN_VALUE) != 0 ? ownerInfo2.wheelbase : obj12, (i13 & 1) != 0 ? ownerInfo2.width : obj13);
    }

    public final String component1() {
        return this.acfitted;
    }

    public final String component10() {
        return this.cdistrictname;
    }

    public final String component11() {
        return this.chasino;
    }

    public final String component12() {
        return this.chasinofull;
    }

    public final String component13() {
        return this.chasinooriginal;
    }

    public final String component14() {
        return this.color;
    }

    public final String component15() {
        return this.cpincode;
    }

    public final String component16() {
        return this.cstate;
    }

    public final String component17() {
        return this.cstatename;
    }

    public final Integer component18() {
        return this.cubiccap;
    }

    public final String component19() {
        return this.dealercd;
    }

    public final Object component2() {
        return this.annualincome;
    }

    public final String component20() {
        return this.dlradd1;
    }

    public final String component21() {
        return this.dlradd2;
    }

    public final String component22() {
        return this.dlradd3;
    }

    public final String component23() {
        return this.dlrcity;
    }

    public final String component24() {
        return this.dlrdistrict;
    }

    public final String component25() {
        return this.dlrname;
    }

    public final String component26() {
        return this.dlrpincode;
    }

    public final String component27() {
        return this.engno;
    }

    public final String component28() {
        return this.engnofull;
    }

    public final Long component29() {
        return this.fitupto;
    }

    public final String component3() {
        return this.audiofitted;
    }

    public final String component30() {
        return this.fituptodescr;
    }

    public final Object component31() {
        return this.floorarea;
    }

    public final String component32() {
        return this.fname;
    }

    public final Integer component33() {
        return this.fuel;
    }

    public final String component34() {
        return this.fueldescr;
    }

    public final Object component35() {
        return this.garageadd;
    }

    public final Integer component36() {
        return this.gcw;
    }

    public final Object component37() {
        return this.height;
    }

    public final Integer component38() {
        return this.f20518hp;
    }

    public final String component39() {
        return this.importedvch;
    }

    public final String component4() {
        return this.bodytype;
    }

    public final Object component40() {
        return this.lasercode;
    }

    public final Integer component41() {
        return this.ldwt;
    }

    public final Object component42() {
        return this.length;
    }

    public final Integer component43() {
        return this.maker;
    }

    public final String component44() {
        return this.makermodel;
    }

    public final Integer component45() {
        return this.manumon;
    }

    public final Integer component46() {
        return this.manuyr;
    }

    public final String component47() {
        return this.modelcd;
    }

    public final Integer component48() {
        return this.nocyl;
    }

    public final Integer component49() {
        return this.norms;
    }

    public final String component5() {
        return this.cadd1;
    }

    public final String component50() {
        return this.normsdescr;
    }

    public final Integer component51() {
        return this.offcd;
    }

    public final String component52() {
        return this.offname;
    }

    public final Long component53() {
        return this.opdt;
    }

    public final Object component54() {
        return this.othercriteria;
    }

    public final Long component55() {
        return this.ownerFrom;
    }

    public final Integer component56() {
        return this.ownercd;
    }

    public final String component57() {
        return this.ownercddescr;
    }

    public final String component58() {
        return this.ownername;
    }

    public final Integer component59() {
        return this.ownersr;
    }

    public final String component6() {
        return this.cadd2;
    }

    public final String component60() {
        return this.padd1;
    }

    public final String component61() {
        return this.padd2;
    }

    public final String component62() {
        return this.padd3;
    }

    public final Integer component63() {
        return this.pdistrict;
    }

    public final String component64() {
        return this.pdistrictname;
    }

    public final Integer component65() {
        return this.permitrtocd;
    }

    public final Integer component66() {
        return this.ppincode;
    }

    public final String component67() {
        return this.pstate;
    }

    public final String component68() {
        return this.pstatename;
    }

    public final String component69() {
        return this.purchasedt;
    }

    public final String component7() {
        return this.cadd3;
    }

    public final Long component70() {
        return this.purchasedtasDate;
    }

    public final String component71() {
        return this.regndt;
    }

    public final Long component72() {
        return this.regndtasdate;
    }

    public final String component73() {
        return this.regnno;
    }

    public final String component74() {
        return this.regntype;
    }

    public final String component75() {
        return this.regntypedescr;
    }

    public final Long component76() {
        return this.regnupto;
    }

    public final Integer component77() {
        return this.saleamt;
    }

    public final Integer component78() {
        return this.seatcap;
    }

    public final Object component79() {
        return this.sleepercap;
    }

    public final String component8() {
        return this.catgdescr;
    }

    public final Object component80() {
        return this.standcap;
    }

    public final String component81() {
        return this.statecd;
    }

    public final String component82() {
        return this.statename;
    }

    public final String component83() {
        return this.status;
    }

    public final Object component84() {
        return this.taxmode;
    }

    public final Object component85() {
        return this.transportcatg;
    }

    public final Integer component86() {
        return this.unldwt;
    }

    public final String component87() {
        return this.vchcatg;
    }

    public final String component88() {
        return this.vchpurchaseas;
    }

    public final String component89() {
        return this.vchpurchaseasCode;
    }

    public final String component9() {
        return this.cdistrict;
    }

    public final Integer component90() {
        return this.vehTypeAsInt;
    }

    public final String component91() {
        return this.vehtype;
    }

    public final Integer component92() {
        return this.vhclass;
    }

    public final String component93() {
        return this.vhclassdescr;
    }

    public final String component94() {
        return this.videofitted;
    }

    public final VtOwnerIdentification component95() {
        return this.vtOwnerIdentification;
    }

    public final Object component96() {
        return this.wheelbase;
    }

    public final Object component97() {
        return this.width;
    }

    public final OwnerInfo copy(String str, Object obj, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Integer num, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, Long l10, String str27, Object obj2, String str28, Integer num2, String str29, Object obj3, Integer num3, Object obj4, Integer num4, String str30, Object obj5, Integer num5, Object obj6, Integer num6, String str31, Integer num7, Integer num8, String str32, Integer num9, Integer num10, String str33, Integer num11, String str34, Long l11, Object obj7, Long l12, Integer num12, String str35, String str36, Integer num13, String str37, String str38, String str39, Integer num14, String str40, Integer num15, Integer num16, String str41, String str42, String str43, Long l13, String str44, Long l14, String str45, String str46, String str47, Long l15, Integer num17, Integer num18, Object obj8, Object obj9, String str48, String str49, String str50, Object obj10, Object obj11, Integer num19, String str51, String str52, String str53, Integer num20, String str54, Integer num21, String str55, String str56, VtOwnerIdentification vtOwnerIdentification2, Object obj12, Object obj13) {
        return new OwnerInfo(str, obj, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, num, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, l10, str27, obj2, str28, num2, str29, obj3, num3, obj4, num4, str30, obj5, num5, obj6, num6, str31, num7, num8, str32, num9, num10, str33, num11, str34, l11, obj7, l12, num12, str35, str36, num13, str37, str38, str39, num14, str40, num15, num16, str41, str42, str43, l13, str44, l14, str45, str46, str47, l15, num17, num18, obj8, obj9, str48, str49, str50, obj10, obj11, num19, str51, str52, str53, num20, str54, num21, str55, str56, vtOwnerIdentification2, obj12, obj13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerInfo)) {
            return false;
        }
        OwnerInfo ownerInfo = (OwnerInfo) obj;
        return l.a(this.acfitted, ownerInfo.acfitted) && l.a(this.annualincome, ownerInfo.annualincome) && l.a(this.audiofitted, ownerInfo.audiofitted) && l.a(this.bodytype, ownerInfo.bodytype) && l.a(this.cadd1, ownerInfo.cadd1) && l.a(this.cadd2, ownerInfo.cadd2) && l.a(this.cadd3, ownerInfo.cadd3) && l.a(this.catgdescr, ownerInfo.catgdescr) && l.a(this.cdistrict, ownerInfo.cdistrict) && l.a(this.cdistrictname, ownerInfo.cdistrictname) && l.a(this.chasino, ownerInfo.chasino) && l.a(this.chasinofull, ownerInfo.chasinofull) && l.a(this.chasinooriginal, ownerInfo.chasinooriginal) && l.a(this.color, ownerInfo.color) && l.a(this.cpincode, ownerInfo.cpincode) && l.a(this.cstate, ownerInfo.cstate) && l.a(this.cstatename, ownerInfo.cstatename) && l.a(this.cubiccap, ownerInfo.cubiccap) && l.a(this.dealercd, ownerInfo.dealercd) && l.a(this.dlradd1, ownerInfo.dlradd1) && l.a(this.dlradd2, ownerInfo.dlradd2) && l.a(this.dlradd3, ownerInfo.dlradd3) && l.a(this.dlrcity, ownerInfo.dlrcity) && l.a(this.dlrdistrict, ownerInfo.dlrdistrict) && l.a(this.dlrname, ownerInfo.dlrname) && l.a(this.dlrpincode, ownerInfo.dlrpincode) && l.a(this.engno, ownerInfo.engno) && l.a(this.engnofull, ownerInfo.engnofull) && l.a(this.fitupto, ownerInfo.fitupto) && l.a(this.fituptodescr, ownerInfo.fituptodescr) && l.a(this.floorarea, ownerInfo.floorarea) && l.a(this.fname, ownerInfo.fname) && l.a(this.fuel, ownerInfo.fuel) && l.a(this.fueldescr, ownerInfo.fueldescr) && l.a(this.garageadd, ownerInfo.garageadd) && l.a(this.gcw, ownerInfo.gcw) && l.a(this.height, ownerInfo.height) && l.a(this.f20518hp, ownerInfo.f20518hp) && l.a(this.importedvch, ownerInfo.importedvch) && l.a(this.lasercode, ownerInfo.lasercode) && l.a(this.ldwt, ownerInfo.ldwt) && l.a(this.length, ownerInfo.length) && l.a(this.maker, ownerInfo.maker) && l.a(this.makermodel, ownerInfo.makermodel) && l.a(this.manumon, ownerInfo.manumon) && l.a(this.manuyr, ownerInfo.manuyr) && l.a(this.modelcd, ownerInfo.modelcd) && l.a(this.nocyl, ownerInfo.nocyl) && l.a(this.norms, ownerInfo.norms) && l.a(this.normsdescr, ownerInfo.normsdescr) && l.a(this.offcd, ownerInfo.offcd) && l.a(this.offname, ownerInfo.offname) && l.a(this.opdt, ownerInfo.opdt) && l.a(this.othercriteria, ownerInfo.othercriteria) && l.a(this.ownerFrom, ownerInfo.ownerFrom) && l.a(this.ownercd, ownerInfo.ownercd) && l.a(this.ownercddescr, ownerInfo.ownercddescr) && l.a(this.ownername, ownerInfo.ownername) && l.a(this.ownersr, ownerInfo.ownersr) && l.a(this.padd1, ownerInfo.padd1) && l.a(this.padd2, ownerInfo.padd2) && l.a(this.padd3, ownerInfo.padd3) && l.a(this.pdistrict, ownerInfo.pdistrict) && l.a(this.pdistrictname, ownerInfo.pdistrictname) && l.a(this.permitrtocd, ownerInfo.permitrtocd) && l.a(this.ppincode, ownerInfo.ppincode) && l.a(this.pstate, ownerInfo.pstate) && l.a(this.pstatename, ownerInfo.pstatename) && l.a(this.purchasedt, ownerInfo.purchasedt) && l.a(this.purchasedtasDate, ownerInfo.purchasedtasDate) && l.a(this.regndt, ownerInfo.regndt) && l.a(this.regndtasdate, ownerInfo.regndtasdate) && l.a(this.regnno, ownerInfo.regnno) && l.a(this.regntype, ownerInfo.regntype) && l.a(this.regntypedescr, ownerInfo.regntypedescr) && l.a(this.regnupto, ownerInfo.regnupto) && l.a(this.saleamt, ownerInfo.saleamt) && l.a(this.seatcap, ownerInfo.seatcap) && l.a(this.sleepercap, ownerInfo.sleepercap) && l.a(this.standcap, ownerInfo.standcap) && l.a(this.statecd, ownerInfo.statecd) && l.a(this.statename, ownerInfo.statename) && l.a(this.status, ownerInfo.status) && l.a(this.taxmode, ownerInfo.taxmode) && l.a(this.transportcatg, ownerInfo.transportcatg) && l.a(this.unldwt, ownerInfo.unldwt) && l.a(this.vchcatg, ownerInfo.vchcatg) && l.a(this.vchpurchaseas, ownerInfo.vchpurchaseas) && l.a(this.vchpurchaseasCode, ownerInfo.vchpurchaseasCode) && l.a(this.vehTypeAsInt, ownerInfo.vehTypeAsInt) && l.a(this.vehtype, ownerInfo.vehtype) && l.a(this.vhclass, ownerInfo.vhclass) && l.a(this.vhclassdescr, ownerInfo.vhclassdescr) && l.a(this.videofitted, ownerInfo.videofitted) && l.a(this.vtOwnerIdentification, ownerInfo.vtOwnerIdentification) && l.a(this.wheelbase, ownerInfo.wheelbase) && l.a(this.width, ownerInfo.width);
    }

    public final String getAcfitted() {
        return this.acfitted;
    }

    public final Object getAnnualincome() {
        return this.annualincome;
    }

    public final String getAudiofitted() {
        return this.audiofitted;
    }

    public final String getBodytype() {
        return this.bodytype;
    }

    public final String getCadd1() {
        return this.cadd1;
    }

    public final String getCadd2() {
        return this.cadd2;
    }

    public final String getCadd3() {
        return this.cadd3;
    }

    public final String getCatgdescr() {
        return this.catgdescr;
    }

    public final String getCdistrict() {
        return this.cdistrict;
    }

    public final String getCdistrictname() {
        return this.cdistrictname;
    }

    public final String getChasino() {
        return this.chasino;
    }

    public final String getChasinofull() {
        return this.chasinofull;
    }

    public final String getChasinooriginal() {
        return this.chasinooriginal;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getCpincode() {
        return this.cpincode;
    }

    public final String getCstate() {
        return this.cstate;
    }

    public final String getCstatename() {
        return this.cstatename;
    }

    public final Integer getCubiccap() {
        return this.cubiccap;
    }

    public final String getDealercd() {
        return this.dealercd;
    }

    public final String getDlradd1() {
        return this.dlradd1;
    }

    public final String getDlradd2() {
        return this.dlradd2;
    }

    public final String getDlradd3() {
        return this.dlradd3;
    }

    public final String getDlrcity() {
        return this.dlrcity;
    }

    public final String getDlrdistrict() {
        return this.dlrdistrict;
    }

    public final String getDlrname() {
        return this.dlrname;
    }

    public final String getDlrpincode() {
        return this.dlrpincode;
    }

    public final String getEngno() {
        return this.engno;
    }

    public final String getEngnofull() {
        return this.engnofull;
    }

    public final Long getFitupto() {
        return this.fitupto;
    }

    public final String getFituptodescr() {
        return this.fituptodescr;
    }

    public final Object getFloorarea() {
        return this.floorarea;
    }

    public final String getFname() {
        return this.fname;
    }

    public final Integer getFuel() {
        return this.fuel;
    }

    public final String getFueldescr() {
        return this.fueldescr;
    }

    public final Object getGarageadd() {
        return this.garageadd;
    }

    public final Integer getGcw() {
        return this.gcw;
    }

    public final Object getHeight() {
        return this.height;
    }

    public final Integer getHp() {
        return this.f20518hp;
    }

    public final String getImportedvch() {
        return this.importedvch;
    }

    public final Object getLasercode() {
        return this.lasercode;
    }

    public final Integer getLdwt() {
        return this.ldwt;
    }

    public final Object getLength() {
        return this.length;
    }

    public final Integer getMaker() {
        return this.maker;
    }

    public final String getMakermodel() {
        return this.makermodel;
    }

    public final Integer getManumon() {
        return this.manumon;
    }

    public final Integer getManuyr() {
        return this.manuyr;
    }

    public final String getModelcd() {
        return this.modelcd;
    }

    public final Integer getNocyl() {
        return this.nocyl;
    }

    public final Integer getNorms() {
        return this.norms;
    }

    public final String getNormsdescr() {
        return this.normsdescr;
    }

    public final Integer getOffcd() {
        return this.offcd;
    }

    public final String getOffname() {
        return this.offname;
    }

    public final Long getOpdt() {
        return this.opdt;
    }

    public final Object getOthercriteria() {
        return this.othercriteria;
    }

    public final Long getOwnerFrom() {
        return this.ownerFrom;
    }

    public final Integer getOwnercd() {
        return this.ownercd;
    }

    public final String getOwnercddescr() {
        return this.ownercddescr;
    }

    public final String getOwnername() {
        return this.ownername;
    }

    public final Integer getOwnersr() {
        return this.ownersr;
    }

    public final String getPadd1() {
        return this.padd1;
    }

    public final String getPadd2() {
        return this.padd2;
    }

    public final String getPadd3() {
        return this.padd3;
    }

    public final Integer getPdistrict() {
        return this.pdistrict;
    }

    public final String getPdistrictname() {
        return this.pdistrictname;
    }

    public final Integer getPermitrtocd() {
        return this.permitrtocd;
    }

    public final Integer getPpincode() {
        return this.ppincode;
    }

    public final String getPstate() {
        return this.pstate;
    }

    public final String getPstatename() {
        return this.pstatename;
    }

    public final String getPurchasedt() {
        return this.purchasedt;
    }

    public final Long getPurchasedtasDate() {
        return this.purchasedtasDate;
    }

    public final String getRegndt() {
        return this.regndt;
    }

    public final Long getRegndtasdate() {
        return this.regndtasdate;
    }

    public final String getRegnno() {
        return this.regnno;
    }

    public final String getRegntype() {
        return this.regntype;
    }

    public final String getRegntypedescr() {
        return this.regntypedescr;
    }

    public final Long getRegnupto() {
        return this.regnupto;
    }

    public final Integer getSaleamt() {
        return this.saleamt;
    }

    public final Integer getSeatcap() {
        return this.seatcap;
    }

    public final Object getSleepercap() {
        return this.sleepercap;
    }

    public final Object getStandcap() {
        return this.standcap;
    }

    public final String getStatecd() {
        return this.statecd;
    }

    public final String getStatename() {
        return this.statename;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Object getTaxmode() {
        return this.taxmode;
    }

    public final Object getTransportcatg() {
        return this.transportcatg;
    }

    public final Integer getUnldwt() {
        return this.unldwt;
    }

    public final String getVchcatg() {
        return this.vchcatg;
    }

    public final String getVchpurchaseas() {
        return this.vchpurchaseas;
    }

    public final String getVchpurchaseasCode() {
        return this.vchpurchaseasCode;
    }

    public final Integer getVehTypeAsInt() {
        return this.vehTypeAsInt;
    }

    public final String getVehtype() {
        return this.vehtype;
    }

    public final Integer getVhclass() {
        return this.vhclass;
    }

    public final String getVhclassdescr() {
        return this.vhclassdescr;
    }

    public final String getVideofitted() {
        return this.videofitted;
    }

    public final VtOwnerIdentification getVtOwnerIdentification() {
        return this.vtOwnerIdentification;
    }

    public final Object getWheelbase() {
        return this.wheelbase;
    }

    public final Object getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.acfitted;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.annualincome;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.audiofitted;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bodytype;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cadd1;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cadd2;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cadd3;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.catgdescr;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cdistrict;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cdistrictname;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.chasino;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.chasinofull;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.chasinooriginal;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.color;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.cpincode;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.cstate;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.cstatename;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Integer num = this.cubiccap;
        int hashCode18 = (hashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        String str17 = this.dealercd;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.dlradd1;
        int hashCode20 = (hashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.dlradd2;
        int hashCode21 = (hashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.dlradd3;
        int hashCode22 = (hashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.dlrcity;
        int hashCode23 = (hashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.dlrdistrict;
        int hashCode24 = (hashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.dlrname;
        int hashCode25 = (hashCode24 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.dlrpincode;
        int hashCode26 = (hashCode25 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.engno;
        int hashCode27 = (hashCode26 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.engnofull;
        int hashCode28 = (hashCode27 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Long l10 = this.fitupto;
        int hashCode29 = (hashCode28 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str27 = this.fituptodescr;
        int hashCode30 = (hashCode29 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Object obj2 = this.floorarea;
        int hashCode31 = (hashCode30 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str28 = this.fname;
        int hashCode32 = (hashCode31 + (str28 == null ? 0 : str28.hashCode())) * 31;
        Integer num2 = this.fuel;
        int hashCode33 = (hashCode32 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str29 = this.fueldescr;
        int hashCode34 = (hashCode33 + (str29 == null ? 0 : str29.hashCode())) * 31;
        Object obj3 = this.garageadd;
        int hashCode35 = (hashCode34 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Integer num3 = this.gcw;
        int hashCode36 = (hashCode35 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Object obj4 = this.height;
        int hashCode37 = (hashCode36 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Integer num4 = this.f20518hp;
        int hashCode38 = (hashCode37 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str30 = this.importedvch;
        int hashCode39 = (hashCode38 + (str30 == null ? 0 : str30.hashCode())) * 31;
        Object obj5 = this.lasercode;
        int hashCode40 = (hashCode39 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Integer num5 = this.ldwt;
        int hashCode41 = (hashCode40 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Object obj6 = this.length;
        int hashCode42 = (hashCode41 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Integer num6 = this.maker;
        int hashCode43 = (hashCode42 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str31 = this.makermodel;
        int hashCode44 = (hashCode43 + (str31 == null ? 0 : str31.hashCode())) * 31;
        Integer num7 = this.manumon;
        int hashCode45 = (hashCode44 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.manuyr;
        int hashCode46 = (hashCode45 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str32 = this.modelcd;
        int hashCode47 = (hashCode46 + (str32 == null ? 0 : str32.hashCode())) * 31;
        Integer num9 = this.nocyl;
        int hashCode48 = (hashCode47 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.norms;
        int hashCode49 = (hashCode48 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str33 = this.normsdescr;
        int hashCode50 = (hashCode49 + (str33 == null ? 0 : str33.hashCode())) * 31;
        Integer num11 = this.offcd;
        int hashCode51 = (hashCode50 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str34 = this.offname;
        int hashCode52 = (hashCode51 + (str34 == null ? 0 : str34.hashCode())) * 31;
        Long l11 = this.opdt;
        int hashCode53 = (hashCode52 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Object obj7 = this.othercriteria;
        int hashCode54 = (hashCode53 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Long l12 = this.ownerFrom;
        int hashCode55 = (hashCode54 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num12 = this.ownercd;
        int hashCode56 = (hashCode55 + (num12 == null ? 0 : num12.hashCode())) * 31;
        String str35 = this.ownercddescr;
        int hashCode57 = (hashCode56 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.ownername;
        int hashCode58 = (hashCode57 + (str36 == null ? 0 : str36.hashCode())) * 31;
        Integer num13 = this.ownersr;
        int hashCode59 = (hashCode58 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str37 = this.padd1;
        int hashCode60 = (hashCode59 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.padd2;
        int hashCode61 = (hashCode60 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.padd3;
        int hashCode62 = (hashCode61 + (str39 == null ? 0 : str39.hashCode())) * 31;
        Integer num14 = this.pdistrict;
        int hashCode63 = (hashCode62 + (num14 == null ? 0 : num14.hashCode())) * 31;
        String str40 = this.pdistrictname;
        int hashCode64 = (hashCode63 + (str40 == null ? 0 : str40.hashCode())) * 31;
        Integer num15 = this.permitrtocd;
        int hashCode65 = (hashCode64 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.ppincode;
        int hashCode66 = (hashCode65 + (num16 == null ? 0 : num16.hashCode())) * 31;
        String str41 = this.pstate;
        int hashCode67 = (hashCode66 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.pstatename;
        int hashCode68 = (hashCode67 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.purchasedt;
        int hashCode69 = (hashCode68 + (str43 == null ? 0 : str43.hashCode())) * 31;
        Long l13 = this.purchasedtasDate;
        int hashCode70 = (hashCode69 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str44 = this.regndt;
        int hashCode71 = (hashCode70 + (str44 == null ? 0 : str44.hashCode())) * 31;
        Long l14 = this.regndtasdate;
        int hashCode72 = (hashCode71 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str45 = this.regnno;
        int hashCode73 = (hashCode72 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.regntype;
        int hashCode74 = (hashCode73 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.regntypedescr;
        int hashCode75 = (hashCode74 + (str47 == null ? 0 : str47.hashCode())) * 31;
        Long l15 = this.regnupto;
        int hashCode76 = (hashCode75 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num17 = this.saleamt;
        int hashCode77 = (hashCode76 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.seatcap;
        int hashCode78 = (hashCode77 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Object obj8 = this.sleepercap;
        int hashCode79 = (hashCode78 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.standcap;
        int hashCode80 = (hashCode79 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        String str48 = this.statecd;
        int hashCode81 = (hashCode80 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.statename;
        int hashCode82 = (hashCode81 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.status;
        int hashCode83 = (hashCode82 + (str50 == null ? 0 : str50.hashCode())) * 31;
        Object obj10 = this.taxmode;
        int hashCode84 = (hashCode83 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Object obj11 = this.transportcatg;
        int hashCode85 = (hashCode84 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Integer num19 = this.unldwt;
        int hashCode86 = (hashCode85 + (num19 == null ? 0 : num19.hashCode())) * 31;
        String str51 = this.vchcatg;
        int hashCode87 = (hashCode86 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.vchpurchaseas;
        int hashCode88 = (hashCode87 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.vchpurchaseasCode;
        int hashCode89 = (hashCode88 + (str53 == null ? 0 : str53.hashCode())) * 31;
        Integer num20 = this.vehTypeAsInt;
        int hashCode90 = (hashCode89 + (num20 == null ? 0 : num20.hashCode())) * 31;
        String str54 = this.vehtype;
        int hashCode91 = (hashCode90 + (str54 == null ? 0 : str54.hashCode())) * 31;
        Integer num21 = this.vhclass;
        int hashCode92 = (hashCode91 + (num21 == null ? 0 : num21.hashCode())) * 31;
        String str55 = this.vhclassdescr;
        int hashCode93 = (hashCode92 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.videofitted;
        int hashCode94 = (hashCode93 + (str56 == null ? 0 : str56.hashCode())) * 31;
        VtOwnerIdentification vtOwnerIdentification2 = this.vtOwnerIdentification;
        int hashCode95 = (hashCode94 + (vtOwnerIdentification2 == null ? 0 : vtOwnerIdentification2.hashCode())) * 31;
        Object obj12 = this.wheelbase;
        int hashCode96 = (hashCode95 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        Object obj13 = this.width;
        if (obj13 != null) {
            i10 = obj13.hashCode();
        }
        return hashCode96 + i10;
    }

    public String toString() {
        return "OwnerInfo(acfitted=" + this.acfitted + ", annualincome=" + this.annualincome + ", audiofitted=" + this.audiofitted + ", bodytype=" + this.bodytype + ", cadd1=" + this.cadd1 + ", cadd2=" + this.cadd2 + ", cadd3=" + this.cadd3 + ", catgdescr=" + this.catgdescr + ", cdistrict=" + this.cdistrict + ", cdistrictname=" + this.cdistrictname + ", chasino=" + this.chasino + ", chasinofull=" + this.chasinofull + ", chasinooriginal=" + this.chasinooriginal + ", color=" + this.color + ", cpincode=" + this.cpincode + ", cstate=" + this.cstate + ", cstatename=" + this.cstatename + ", cubiccap=" + this.cubiccap + ", dealercd=" + this.dealercd + ", dlradd1=" + this.dlradd1 + ", dlradd2=" + this.dlradd2 + ", dlradd3=" + this.dlradd3 + ", dlrcity=" + this.dlrcity + ", dlrdistrict=" + this.dlrdistrict + ", dlrname=" + this.dlrname + ", dlrpincode=" + this.dlrpincode + ", engno=" + this.engno + ", engnofull=" + this.engnofull + ", fitupto=" + this.fitupto + ", fituptodescr=" + this.fituptodescr + ", floorarea=" + this.floorarea + ", fname=" + this.fname + ", fuel=" + this.fuel + ", fueldescr=" + this.fueldescr + ", garageadd=" + this.garageadd + ", gcw=" + this.gcw + ", height=" + this.height + ", hp=" + this.f20518hp + ", importedvch=" + this.importedvch + ", lasercode=" + this.lasercode + ", ldwt=" + this.ldwt + ", length=" + this.length + ", maker=" + this.maker + ", makermodel=" + this.makermodel + ", manumon=" + this.manumon + ", manuyr=" + this.manuyr + ", modelcd=" + this.modelcd + ", nocyl=" + this.nocyl + ", norms=" + this.norms + ", normsdescr=" + this.normsdescr + ", offcd=" + this.offcd + ", offname=" + this.offname + ", opdt=" + this.opdt + ", othercriteria=" + this.othercriteria + ", ownerFrom=" + this.ownerFrom + ", ownercd=" + this.ownercd + ", ownercddescr=" + this.ownercddescr + ", ownername=" + this.ownername + ", ownersr=" + this.ownersr + ", padd1=" + this.padd1 + ", padd2=" + this.padd2 + ", padd3=" + this.padd3 + ", pdistrict=" + this.pdistrict + ", pdistrictname=" + this.pdistrictname + ", permitrtocd=" + this.permitrtocd + ", ppincode=" + this.ppincode + ", pstate=" + this.pstate + ", pstatename=" + this.pstatename + ", purchasedt=" + this.purchasedt + ", purchasedtasDate=" + this.purchasedtasDate + ", regndt=" + this.regndt + ", regndtasdate=" + this.regndtasdate + ", regnno=" + this.regnno + ", regntype=" + this.regntype + ", regntypedescr=" + this.regntypedescr + ", regnupto=" + this.regnupto + ", saleamt=" + this.saleamt + ", seatcap=" + this.seatcap + ", sleepercap=" + this.sleepercap + ", standcap=" + this.standcap + ", statecd=" + this.statecd + ", statename=" + this.statename + ", status=" + this.status + ", taxmode=" + this.taxmode + ", transportcatg=" + this.transportcatg + ", unldwt=" + this.unldwt + ", vchcatg=" + this.vchcatg + ", vchpurchaseas=" + this.vchpurchaseas + ", vchpurchaseasCode=" + this.vchpurchaseasCode + ", vehTypeAsInt=" + this.vehTypeAsInt + ", vehtype=" + this.vehtype + ", vhclass=" + this.vhclass + ", vhclassdescr=" + this.vhclassdescr + ", videofitted=" + this.videofitted + ", vtOwnerIdentification=" + this.vtOwnerIdentification + ", wheelbase=" + this.wheelbase + ", width=" + this.width + ')';
    }
}
