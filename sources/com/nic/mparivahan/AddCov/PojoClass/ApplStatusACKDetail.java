package com.nic.mparivahan.AddCov.PojoClass;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class ApplStatusACKDetail {
    private final String App_Full_Name;
    private final String DOB;
    private final String MSG;
    private final String QRCodeImg;
    private final String StCodeAck;
    private final String ackGender;
    private final boolean addCovsInNewLL;
    private final boolean addTransInLLServices;
    private final String applBlGr;
    private final String applSwdName;
    private final String applicationdate;
    private final String biomobileno;
    private final String biotempAdd1;
    private final String biotempAdd2;
    private final String biotempAdd3;
    private final String biotempdistName;
    private final String biotempstName;
    private final String biotempvillName;
    private final int dltransapplno;
    private final String dltranspages;
    private final String dltranspages2;
    private final String dltranspages3;
    private final List<String> docs4dltransactions;
    private final boolean individualPrint;
    private final List<String> mp_trnsact;
    private final String relationType;
    private final List<String> rto;
    private final String selectedCovs;
    private final String smsNoDLServices;
    private final String smsNoToDisplay;

    public ApplStatusACKDetail(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i10, String str17, String str18, String str19, List<String> list, boolean z12, List<String> list2, String str20, List<String> list3, String str21, String str22, String str23) {
        String str24 = str;
        String str25 = str2;
        String str26 = str3;
        String str27 = str4;
        String str28 = str5;
        String str29 = str6;
        String str30 = str7;
        String str31 = str8;
        String str32 = str9;
        String str33 = str10;
        String str34 = str11;
        String str35 = str12;
        String str36 = str13;
        String str37 = str14;
        String str38 = str16;
        l.f(str24, "App_Full_Name");
        l.f(str25, "DOB");
        l.f(str26, "MSG");
        l.f(str27, "QRCodeImg");
        l.f(str28, "StCodeAck");
        l.f(str29, "ackGender");
        l.f(str30, "applBlGr");
        l.f(str31, "applSwdName");
        l.f(str32, "applicationdate");
        l.f(str33, "biomobileno");
        l.f(str34, "biotempAdd1");
        l.f(str35, "biotempAdd2");
        l.f(str36, "biotempAdd3");
        l.f(str37, "biotempdistName");
        l.f(str15, "biotempstName");
        l.f(str16, "biotempvillName");
        l.f(str17, "dltranspages");
        l.f(str18, "dltranspages2");
        l.f(str19, "dltranspages3");
        l.f(list, "docs4dltransactions");
        l.f(list2, "mp_trnsact");
        l.f(str20, "relationType");
        l.f(list3, "rto");
        l.f(str21, "selectedCovs");
        l.f(str22, "smsNoDLServices");
        l.f(str23, "smsNoToDisplay");
        this.App_Full_Name = str24;
        this.DOB = str25;
        this.MSG = str26;
        this.QRCodeImg = str27;
        this.StCodeAck = str28;
        this.ackGender = str29;
        this.addCovsInNewLL = z10;
        this.addTransInLLServices = z11;
        this.applBlGr = str30;
        this.applSwdName = str31;
        this.applicationdate = str32;
        this.biomobileno = str33;
        this.biotempAdd1 = str34;
        this.biotempAdd2 = str35;
        this.biotempAdd3 = str36;
        this.biotempdistName = str37;
        this.biotempstName = str15;
        this.biotempvillName = str16;
        this.dltransapplno = i10;
        this.dltranspages = str17;
        this.dltranspages2 = str18;
        this.dltranspages3 = str19;
        this.docs4dltransactions = list;
        this.individualPrint = z12;
        this.mp_trnsact = list2;
        this.relationType = str20;
        this.rto = list3;
        this.selectedCovs = str21;
        this.smsNoDLServices = str22;
        this.smsNoToDisplay = str23;
    }

    public static /* synthetic */ ApplStatusACKDetail copy$default(ApplStatusACKDetail applStatusACKDetail, String str, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i10, String str17, String str18, String str19, List list, boolean z12, List list2, String str20, List list3, String str21, String str22, String str23, int i11, Object obj) {
        ApplStatusACKDetail applStatusACKDetail2 = applStatusACKDetail;
        int i12 = i11;
        return applStatusACKDetail.copy((i12 & 1) != 0 ? applStatusACKDetail2.App_Full_Name : str, (i12 & 2) != 0 ? applStatusACKDetail2.DOB : str2, (i12 & 4) != 0 ? applStatusACKDetail2.MSG : str3, (i12 & 8) != 0 ? applStatusACKDetail2.QRCodeImg : str4, (i12 & 16) != 0 ? applStatusACKDetail2.StCodeAck : str5, (i12 & 32) != 0 ? applStatusACKDetail2.ackGender : str6, (i12 & 64) != 0 ? applStatusACKDetail2.addCovsInNewLL : z10, (i12 & 128) != 0 ? applStatusACKDetail2.addTransInLLServices : z11, (i12 & 256) != 0 ? applStatusACKDetail2.applBlGr : str7, (i12 & 512) != 0 ? applStatusACKDetail2.applSwdName : str8, (i12 & 1024) != 0 ? applStatusACKDetail2.applicationdate : str9, (i12 & 2048) != 0 ? applStatusACKDetail2.biomobileno : str10, (i12 & 4096) != 0 ? applStatusACKDetail2.biotempAdd1 : str11, (i12 & 8192) != 0 ? applStatusACKDetail2.biotempAdd2 : str12, (i12 & 16384) != 0 ? applStatusACKDetail2.biotempAdd3 : str13, (i12 & 32768) != 0 ? applStatusACKDetail2.biotempdistName : str14, (i12 & 65536) != 0 ? applStatusACKDetail2.biotempstName : str15, (i12 & 131072) != 0 ? applStatusACKDetail2.biotempvillName : str16, (i12 & 262144) != 0 ? applStatusACKDetail2.dltransapplno : i10, (i12 & 524288) != 0 ? applStatusACKDetail2.dltranspages : str17, (i12 & 1048576) != 0 ? applStatusACKDetail2.dltranspages2 : str18, (i12 & 2097152) != 0 ? applStatusACKDetail2.dltranspages3 : str19, (i12 & 4194304) != 0 ? applStatusACKDetail2.docs4dltransactions : list, (i12 & 8388608) != 0 ? applStatusACKDetail2.individualPrint : z12, (i12 & 16777216) != 0 ? applStatusACKDetail2.mp_trnsact : list2, (i12 & 33554432) != 0 ? applStatusACKDetail2.relationType : str20, (i12 & 67108864) != 0 ? applStatusACKDetail2.rto : list3, (i12 & 134217728) != 0 ? applStatusACKDetail2.selectedCovs : str21, (i12 & 268435456) != 0 ? applStatusACKDetail2.smsNoDLServices : str22, (i12 & 536870912) != 0 ? applStatusACKDetail2.smsNoToDisplay : str23);
    }

    public final String component1() {
        return this.App_Full_Name;
    }

    public final String component10() {
        return this.applSwdName;
    }

    public final String component11() {
        return this.applicationdate;
    }

    public final String component12() {
        return this.biomobileno;
    }

    public final String component13() {
        return this.biotempAdd1;
    }

    public final String component14() {
        return this.biotempAdd2;
    }

    public final String component15() {
        return this.biotempAdd3;
    }

    public final String component16() {
        return this.biotempdistName;
    }

    public final String component17() {
        return this.biotempstName;
    }

    public final String component18() {
        return this.biotempvillName;
    }

    public final int component19() {
        return this.dltransapplno;
    }

    public final String component2() {
        return this.DOB;
    }

    public final String component20() {
        return this.dltranspages;
    }

    public final String component21() {
        return this.dltranspages2;
    }

    public final String component22() {
        return this.dltranspages3;
    }

    public final List<String> component23() {
        return this.docs4dltransactions;
    }

    public final boolean component24() {
        return this.individualPrint;
    }

    public final List<String> component25() {
        return this.mp_trnsact;
    }

    public final String component26() {
        return this.relationType;
    }

    public final List<String> component27() {
        return this.rto;
    }

    public final String component28() {
        return this.selectedCovs;
    }

    public final String component29() {
        return this.smsNoDLServices;
    }

    public final String component3() {
        return this.MSG;
    }

    public final String component30() {
        return this.smsNoToDisplay;
    }

    public final String component4() {
        return this.QRCodeImg;
    }

    public final String component5() {
        return this.StCodeAck;
    }

    public final String component6() {
        return this.ackGender;
    }

    public final boolean component7() {
        return this.addCovsInNewLL;
    }

    public final boolean component8() {
        return this.addTransInLLServices;
    }

    public final String component9() {
        return this.applBlGr;
    }

    public final ApplStatusACKDetail copy(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i10, String str17, String str18, String str19, List<String> list, boolean z12, List<String> list2, String str20, List<String> list3, String str21, String str22, String str23) {
        String str24 = str;
        l.f(str24, "App_Full_Name");
        l.f(str2, "DOB");
        l.f(str3, "MSG");
        l.f(str4, "QRCodeImg");
        l.f(str5, "StCodeAck");
        l.f(str6, "ackGender");
        l.f(str7, "applBlGr");
        l.f(str8, "applSwdName");
        l.f(str9, "applicationdate");
        l.f(str10, "biomobileno");
        l.f(str11, "biotempAdd1");
        l.f(str12, "biotempAdd2");
        l.f(str13, "biotempAdd3");
        l.f(str14, "biotempdistName");
        l.f(str15, "biotempstName");
        l.f(str16, "biotempvillName");
        l.f(str17, "dltranspages");
        l.f(str18, "dltranspages2");
        l.f(str19, "dltranspages3");
        l.f(list, "docs4dltransactions");
        l.f(list2, "mp_trnsact");
        l.f(str20, "relationType");
        l.f(list3, "rto");
        l.f(str21, "selectedCovs");
        l.f(str22, "smsNoDLServices");
        l.f(str23, "smsNoToDisplay");
        return new ApplStatusACKDetail(str24, str2, str3, str4, str5, str6, z10, z11, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, i10, str17, str18, str19, list, z12, list2, str20, list3, str21, str22, str23);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplStatusACKDetail)) {
            return false;
        }
        ApplStatusACKDetail applStatusACKDetail = (ApplStatusACKDetail) obj;
        return l.a(this.App_Full_Name, applStatusACKDetail.App_Full_Name) && l.a(this.DOB, applStatusACKDetail.DOB) && l.a(this.MSG, applStatusACKDetail.MSG) && l.a(this.QRCodeImg, applStatusACKDetail.QRCodeImg) && l.a(this.StCodeAck, applStatusACKDetail.StCodeAck) && l.a(this.ackGender, applStatusACKDetail.ackGender) && this.addCovsInNewLL == applStatusACKDetail.addCovsInNewLL && this.addTransInLLServices == applStatusACKDetail.addTransInLLServices && l.a(this.applBlGr, applStatusACKDetail.applBlGr) && l.a(this.applSwdName, applStatusACKDetail.applSwdName) && l.a(this.applicationdate, applStatusACKDetail.applicationdate) && l.a(this.biomobileno, applStatusACKDetail.biomobileno) && l.a(this.biotempAdd1, applStatusACKDetail.biotempAdd1) && l.a(this.biotempAdd2, applStatusACKDetail.biotempAdd2) && l.a(this.biotempAdd3, applStatusACKDetail.biotempAdd3) && l.a(this.biotempdistName, applStatusACKDetail.biotempdistName) && l.a(this.biotempstName, applStatusACKDetail.biotempstName) && l.a(this.biotempvillName, applStatusACKDetail.biotempvillName) && this.dltransapplno == applStatusACKDetail.dltransapplno && l.a(this.dltranspages, applStatusACKDetail.dltranspages) && l.a(this.dltranspages2, applStatusACKDetail.dltranspages2) && l.a(this.dltranspages3, applStatusACKDetail.dltranspages3) && l.a(this.docs4dltransactions, applStatusACKDetail.docs4dltransactions) && this.individualPrint == applStatusACKDetail.individualPrint && l.a(this.mp_trnsact, applStatusACKDetail.mp_trnsact) && l.a(this.relationType, applStatusACKDetail.relationType) && l.a(this.rto, applStatusACKDetail.rto) && l.a(this.selectedCovs, applStatusACKDetail.selectedCovs) && l.a(this.smsNoDLServices, applStatusACKDetail.smsNoDLServices) && l.a(this.smsNoToDisplay, applStatusACKDetail.smsNoToDisplay);
    }

    public final String getAckGender() {
        return this.ackGender;
    }

    public final boolean getAddCovsInNewLL() {
        return this.addCovsInNewLL;
    }

    public final boolean getAddTransInLLServices() {
        return this.addTransInLLServices;
    }

    public final String getApp_Full_Name() {
        return this.App_Full_Name;
    }

    public final String getApplBlGr() {
        return this.applBlGr;
    }

    public final String getApplSwdName() {
        return this.applSwdName;
    }

    public final String getApplicationdate() {
        return this.applicationdate;
    }

    public final String getBiomobileno() {
        return this.biomobileno;
    }

    public final String getBiotempAdd1() {
        return this.biotempAdd1;
    }

    public final String getBiotempAdd2() {
        return this.biotempAdd2;
    }

    public final String getBiotempAdd3() {
        return this.biotempAdd3;
    }

    public final String getBiotempdistName() {
        return this.biotempdistName;
    }

    public final String getBiotempstName() {
        return this.biotempstName;
    }

    public final String getBiotempvillName() {
        return this.biotempvillName;
    }

    public final String getDOB() {
        return this.DOB;
    }

    public final int getDltransapplno() {
        return this.dltransapplno;
    }

    public final String getDltranspages() {
        return this.dltranspages;
    }

    public final String getDltranspages2() {
        return this.dltranspages2;
    }

    public final String getDltranspages3() {
        return this.dltranspages3;
    }

    public final List<String> getDocs4dltransactions() {
        return this.docs4dltransactions;
    }

    public final boolean getIndividualPrint() {
        return this.individualPrint;
    }

    public final String getMSG() {
        return this.MSG;
    }

    public final List<String> getMp_trnsact() {
        return this.mp_trnsact;
    }

    public final String getQRCodeImg() {
        return this.QRCodeImg;
    }

    public final String getRelationType() {
        return this.relationType;
    }

    public final List<String> getRto() {
        return this.rto;
    }

    public final String getSelectedCovs() {
        return this.selectedCovs;
    }

    public final String getSmsNoDLServices() {
        return this.smsNoDLServices;
    }

    public final String getSmsNoToDisplay() {
        return this.smsNoToDisplay;
    }

    public final String getStCodeAck() {
        return this.StCodeAck;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.App_Full_Name.hashCode() * 31) + this.DOB.hashCode()) * 31) + this.MSG.hashCode()) * 31) + this.QRCodeImg.hashCode()) * 31) + this.StCodeAck.hashCode()) * 31) + this.ackGender.hashCode()) * 31;
        boolean z10 = this.addCovsInNewLL;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (hashCode + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.addTransInLLServices;
        if (z12) {
            z12 = true;
        }
        int hashCode2 = (((((((((((((((((((((((((((((((i10 + (z12 ? 1 : 0)) * 31) + this.applBlGr.hashCode()) * 31) + this.applSwdName.hashCode()) * 31) + this.applicationdate.hashCode()) * 31) + this.biomobileno.hashCode()) * 31) + this.biotempAdd1.hashCode()) * 31) + this.biotempAdd2.hashCode()) * 31) + this.biotempAdd3.hashCode()) * 31) + this.biotempdistName.hashCode()) * 31) + this.biotempstName.hashCode()) * 31) + this.biotempvillName.hashCode()) * 31) + Integer.hashCode(this.dltransapplno)) * 31) + this.dltranspages.hashCode()) * 31) + this.dltranspages2.hashCode()) * 31) + this.dltranspages3.hashCode()) * 31) + this.docs4dltransactions.hashCode()) * 31;
        boolean z13 = this.individualPrint;
        if (!z13) {
            z11 = z13;
        }
        return ((((((((((((hashCode2 + (z11 ? 1 : 0)) * 31) + this.mp_trnsact.hashCode()) * 31) + this.relationType.hashCode()) * 31) + this.rto.hashCode()) * 31) + this.selectedCovs.hashCode()) * 31) + this.smsNoDLServices.hashCode()) * 31) + this.smsNoToDisplay.hashCode();
    }

    public String toString() {
        return "ApplStatusACKDetail(App_Full_Name=" + this.App_Full_Name + ", DOB=" + this.DOB + ", MSG=" + this.MSG + ", QRCodeImg=" + this.QRCodeImg + ", StCodeAck=" + this.StCodeAck + ", ackGender=" + this.ackGender + ", addCovsInNewLL=" + this.addCovsInNewLL + ", addTransInLLServices=" + this.addTransInLLServices + ", applBlGr=" + this.applBlGr + ", applSwdName=" + this.applSwdName + ", applicationdate=" + this.applicationdate + ", biomobileno=" + this.biomobileno + ", biotempAdd1=" + this.biotempAdd1 + ", biotempAdd2=" + this.biotempAdd2 + ", biotempAdd3=" + this.biotempAdd3 + ", biotempdistName=" + this.biotempdistName + ", biotempstName=" + this.biotempstName + ", biotempvillName=" + this.biotempvillName + ", dltransapplno=" + this.dltransapplno + ", dltranspages=" + this.dltranspages + ", dltranspages2=" + this.dltranspages2 + ", dltranspages3=" + this.dltranspages3 + ", docs4dltransactions=" + this.docs4dltransactions + ", individualPrint=" + this.individualPrint + ", mp_trnsact=" + this.mp_trnsact + ", relationType=" + this.relationType + ", rto=" + this.rto + ", selectedCovs=" + this.selectedCovs + ", smsNoDLServices=" + this.smsNoDLServices + ", smsNoToDisplay=" + this.smsNoToDisplay + ')';
    }
}
