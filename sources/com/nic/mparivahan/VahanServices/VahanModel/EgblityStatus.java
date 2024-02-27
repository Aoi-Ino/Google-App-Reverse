package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class EgblityStatus {
    private final String cert_permit_prt;
    private final Object is_tax_clear_cert;
    private final boolean isapptallowed;
    private final boolean isbalancefee;
    private final boolean isca;
    private final boolean iscart;
    private final boolean iscert_permit_prt;
    private final boolean isdispose;
    private final boolean isdoc;
    private final boolean isdupfit;
    private final boolean isduprc;
    private final boolean isenvtax;
    private final boolean isepermit;
    private final boolean isfit;
    private final boolean isform36;
    private final boolean isform38;
    private final boolean ishpa;
    private final boolean ishpc;
    private final boolean ishpt;
    private final boolean ismisc;
    private final boolean ismobilereg;
    private final boolean isnewportal;
    private final boolean isnoc;
    private final boolean isnoccancel;
    private final boolean isnonusecontinuation;
    private final boolean isnonuseintimation;
    private final Object isnonuseshifting;
    private final boolean isnonusewithdrawal;
    private final boolean ispermaregn;
    private final boolean isprintfit;
    private final boolean isprintrcparticulars;
    private final boolean isrccancel;
    private final boolean isrcparticular;
    private final boolean isrcredsipatch;
    private final boolean isrcrelease;
    private final boolean isrcsurr;
    private final boolean isrenreg;
    private final boolean isselfbacklog;
    private final boolean istax;
    private final boolean istaxinstallment;
    private final boolean istaxrecovery;
    private final boolean istempreg;
    private final boolean isto;
    private final boolean isvehadv;
    private final boolean isvehalt;
    private final boolean isvehconv;
    private final boolean isvehdetails;
    private final boolean isvehreasgn;
    private final boolean isviewstatetax;
    private final int off_cd;
    private final boolean payment_compounding_fee;
    private final boolean smartcard_rc;
    private final String state_cd;
    private final String state_tax_url;

    public EgblityStatus(String str, Object obj, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, Object obj2, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, boolean z44, boolean z45, boolean z46, boolean z47, boolean z48, boolean z49, boolean z50, boolean z51, boolean z52, boolean z53, boolean z54, boolean z55, int i10, boolean z56, boolean z57, String str2, String str3) {
        Object obj3 = obj2;
        String str4 = str2;
        String str5 = str3;
        l.f(str, "cert_permit_prt");
        l.f(obj, "is_tax_clear_cert");
        l.f(obj3, "isnonuseshifting");
        l.f(str4, "state_cd");
        l.f(str5, "state_tax_url");
        this.cert_permit_prt = str;
        this.is_tax_clear_cert = obj;
        this.isapptallowed = z10;
        this.isbalancefee = z11;
        this.isca = z12;
        this.iscart = z13;
        this.iscert_permit_prt = z14;
        this.isdispose = z15;
        this.isdoc = z16;
        this.isdupfit = z17;
        this.isduprc = z18;
        this.isenvtax = z19;
        this.isepermit = z20;
        this.isfit = z21;
        this.isform36 = z22;
        this.isform38 = z23;
        this.ishpa = z24;
        this.ishpc = z25;
        this.ishpt = z26;
        this.ismisc = z27;
        this.ismobilereg = z28;
        this.isnewportal = z29;
        this.isnoc = z30;
        this.isnoccancel = z31;
        this.isnonusecontinuation = z32;
        this.isnonuseintimation = z33;
        this.isnonuseshifting = obj3;
        this.isnonusewithdrawal = z34;
        this.ispermaregn = z35;
        this.isprintfit = z36;
        this.isprintrcparticulars = z37;
        this.isrccancel = z38;
        this.isrcparticular = z39;
        this.isrcredsipatch = z40;
        this.isrcrelease = z41;
        this.isrcsurr = z42;
        this.isrenreg = z43;
        this.isselfbacklog = z44;
        this.istax = z45;
        this.istaxinstallment = z46;
        this.istaxrecovery = z47;
        this.istempreg = z48;
        this.isto = z49;
        this.isvehadv = z50;
        this.isvehalt = z51;
        this.isvehconv = z52;
        this.isvehdetails = z53;
        this.isvehreasgn = z54;
        this.isviewstatetax = z55;
        this.off_cd = i10;
        this.payment_compounding_fee = z56;
        this.smartcard_rc = z57;
        this.state_cd = str4;
        this.state_tax_url = str5;
    }

    public static /* synthetic */ EgblityStatus copy$default(EgblityStatus egblityStatus, String str, Object obj, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, Object obj2, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, boolean z44, boolean z45, boolean z46, boolean z47, boolean z48, boolean z49, boolean z50, boolean z51, boolean z52, boolean z53, boolean z54, boolean z55, int i10, boolean z56, boolean z57, String str2, String str3, int i11, int i12, Object obj3) {
        EgblityStatus egblityStatus2 = egblityStatus;
        int i13 = i11;
        int i14 = i12;
        return egblityStatus.copy((i13 & 1) != 0 ? egblityStatus2.cert_permit_prt : str, (i13 & 2) != 0 ? egblityStatus2.is_tax_clear_cert : obj, (i13 & 4) != 0 ? egblityStatus2.isapptallowed : z10, (i13 & 8) != 0 ? egblityStatus2.isbalancefee : z11, (i13 & 16) != 0 ? egblityStatus2.isca : z12, (i13 & 32) != 0 ? egblityStatus2.iscart : z13, (i13 & 64) != 0 ? egblityStatus2.iscert_permit_prt : z14, (i13 & 128) != 0 ? egblityStatus2.isdispose : z15, (i13 & 256) != 0 ? egblityStatus2.isdoc : z16, (i13 & 512) != 0 ? egblityStatus2.isdupfit : z17, (i13 & 1024) != 0 ? egblityStatus2.isduprc : z18, (i13 & 2048) != 0 ? egblityStatus2.isenvtax : z19, (i13 & 4096) != 0 ? egblityStatus2.isepermit : z20, (i13 & 8192) != 0 ? egblityStatus2.isfit : z21, (i13 & 16384) != 0 ? egblityStatus2.isform36 : z22, (i13 & 32768) != 0 ? egblityStatus2.isform38 : z23, (i13 & 65536) != 0 ? egblityStatus2.ishpa : z24, (i13 & 131072) != 0 ? egblityStatus2.ishpc : z25, (i13 & 262144) != 0 ? egblityStatus2.ishpt : z26, (i13 & 524288) != 0 ? egblityStatus2.ismisc : z27, (i13 & 1048576) != 0 ? egblityStatus2.ismobilereg : z28, (i13 & 2097152) != 0 ? egblityStatus2.isnewportal : z29, (i13 & 4194304) != 0 ? egblityStatus2.isnoc : z30, (i13 & 8388608) != 0 ? egblityStatus2.isnoccancel : z31, (i13 & 16777216) != 0 ? egblityStatus2.isnonusecontinuation : z32, (i13 & 33554432) != 0 ? egblityStatus2.isnonuseintimation : z33, (i13 & 67108864) != 0 ? egblityStatus2.isnonuseshifting : obj2, (i13 & 134217728) != 0 ? egblityStatus2.isnonusewithdrawal : z34, (i13 & 268435456) != 0 ? egblityStatus2.ispermaregn : z35, (i13 & 536870912) != 0 ? egblityStatus2.isprintfit : z36, (i13 & 1073741824) != 0 ? egblityStatus2.isprintrcparticulars : z37, (i13 & Integer.MIN_VALUE) != 0 ? egblityStatus2.isrccancel : z38, (i14 & 1) != 0 ? egblityStatus2.isrcparticular : z39, (i14 & 2) != 0 ? egblityStatus2.isrcredsipatch : z40, (i14 & 4) != 0 ? egblityStatus2.isrcrelease : z41, (i14 & 8) != 0 ? egblityStatus2.isrcsurr : z42, (i14 & 16) != 0 ? egblityStatus2.isrenreg : z43, (i14 & 32) != 0 ? egblityStatus2.isselfbacklog : z44, (i14 & 64) != 0 ? egblityStatus2.istax : z45, (i14 & 128) != 0 ? egblityStatus2.istaxinstallment : z46, (i14 & 256) != 0 ? egblityStatus2.istaxrecovery : z47, (i14 & 512) != 0 ? egblityStatus2.istempreg : z48, (i14 & 1024) != 0 ? egblityStatus2.isto : z49, (i14 & 2048) != 0 ? egblityStatus2.isvehadv : z50, (i14 & 4096) != 0 ? egblityStatus2.isvehalt : z51, (i14 & 8192) != 0 ? egblityStatus2.isvehconv : z52, (i14 & 16384) != 0 ? egblityStatus2.isvehdetails : z53, (i14 & 32768) != 0 ? egblityStatus2.isvehreasgn : z54, (i14 & 65536) != 0 ? egblityStatus2.isviewstatetax : z55, (i14 & 131072) != 0 ? egblityStatus2.off_cd : i10, (i14 & 262144) != 0 ? egblityStatus2.payment_compounding_fee : z56, (i14 & 524288) != 0 ? egblityStatus2.smartcard_rc : z57, (i14 & 1048576) != 0 ? egblityStatus2.state_cd : str2, (i14 & 2097152) != 0 ? egblityStatus2.state_tax_url : str3);
    }

    public final String component1() {
        return this.cert_permit_prt;
    }

    public final boolean component10() {
        return this.isdupfit;
    }

    public final boolean component11() {
        return this.isduprc;
    }

    public final boolean component12() {
        return this.isenvtax;
    }

    public final boolean component13() {
        return this.isepermit;
    }

    public final boolean component14() {
        return this.isfit;
    }

    public final boolean component15() {
        return this.isform36;
    }

    public final boolean component16() {
        return this.isform38;
    }

    public final boolean component17() {
        return this.ishpa;
    }

    public final boolean component18() {
        return this.ishpc;
    }

    public final boolean component19() {
        return this.ishpt;
    }

    public final Object component2() {
        return this.is_tax_clear_cert;
    }

    public final boolean component20() {
        return this.ismisc;
    }

    public final boolean component21() {
        return this.ismobilereg;
    }

    public final boolean component22() {
        return this.isnewportal;
    }

    public final boolean component23() {
        return this.isnoc;
    }

    public final boolean component24() {
        return this.isnoccancel;
    }

    public final boolean component25() {
        return this.isnonusecontinuation;
    }

    public final boolean component26() {
        return this.isnonuseintimation;
    }

    public final Object component27() {
        return this.isnonuseshifting;
    }

    public final boolean component28() {
        return this.isnonusewithdrawal;
    }

    public final boolean component29() {
        return this.ispermaregn;
    }

    public final boolean component3() {
        return this.isapptallowed;
    }

    public final boolean component30() {
        return this.isprintfit;
    }

    public final boolean component31() {
        return this.isprintrcparticulars;
    }

    public final boolean component32() {
        return this.isrccancel;
    }

    public final boolean component33() {
        return this.isrcparticular;
    }

    public final boolean component34() {
        return this.isrcredsipatch;
    }

    public final boolean component35() {
        return this.isrcrelease;
    }

    public final boolean component36() {
        return this.isrcsurr;
    }

    public final boolean component37() {
        return this.isrenreg;
    }

    public final boolean component38() {
        return this.isselfbacklog;
    }

    public final boolean component39() {
        return this.istax;
    }

    public final boolean component4() {
        return this.isbalancefee;
    }

    public final boolean component40() {
        return this.istaxinstallment;
    }

    public final boolean component41() {
        return this.istaxrecovery;
    }

    public final boolean component42() {
        return this.istempreg;
    }

    public final boolean component43() {
        return this.isto;
    }

    public final boolean component44() {
        return this.isvehadv;
    }

    public final boolean component45() {
        return this.isvehalt;
    }

    public final boolean component46() {
        return this.isvehconv;
    }

    public final boolean component47() {
        return this.isvehdetails;
    }

    public final boolean component48() {
        return this.isvehreasgn;
    }

    public final boolean component49() {
        return this.isviewstatetax;
    }

    public final boolean component5() {
        return this.isca;
    }

    public final int component50() {
        return this.off_cd;
    }

    public final boolean component51() {
        return this.payment_compounding_fee;
    }

    public final boolean component52() {
        return this.smartcard_rc;
    }

    public final String component53() {
        return this.state_cd;
    }

    public final String component54() {
        return this.state_tax_url;
    }

    public final boolean component6() {
        return this.iscart;
    }

    public final boolean component7() {
        return this.iscert_permit_prt;
    }

    public final boolean component8() {
        return this.isdispose;
    }

    public final boolean component9() {
        return this.isdoc;
    }

    public final EgblityStatus copy(String str, Object obj, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, Object obj2, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, boolean z44, boolean z45, boolean z46, boolean z47, boolean z48, boolean z49, boolean z50, boolean z51, boolean z52, boolean z53, boolean z54, boolean z55, int i10, boolean z56, boolean z57, String str2, String str3) {
        String str4 = str;
        l.f(str4, "cert_permit_prt");
        l.f(obj, "is_tax_clear_cert");
        l.f(obj2, "isnonuseshifting");
        l.f(str2, "state_cd");
        l.f(str3, "state_tax_url");
        return new EgblityStatus(str4, obj, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, obj2, z34, z35, z36, z37, z38, z39, z40, z41, z42, z43, z44, z45, z46, z47, z48, z49, z50, z51, z52, z53, z54, z55, i10, z56, z57, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EgblityStatus)) {
            return false;
        }
        EgblityStatus egblityStatus = (EgblityStatus) obj;
        return l.a(this.cert_permit_prt, egblityStatus.cert_permit_prt) && l.a(this.is_tax_clear_cert, egblityStatus.is_tax_clear_cert) && this.isapptallowed == egblityStatus.isapptallowed && this.isbalancefee == egblityStatus.isbalancefee && this.isca == egblityStatus.isca && this.iscart == egblityStatus.iscart && this.iscert_permit_prt == egblityStatus.iscert_permit_prt && this.isdispose == egblityStatus.isdispose && this.isdoc == egblityStatus.isdoc && this.isdupfit == egblityStatus.isdupfit && this.isduprc == egblityStatus.isduprc && this.isenvtax == egblityStatus.isenvtax && this.isepermit == egblityStatus.isepermit && this.isfit == egblityStatus.isfit && this.isform36 == egblityStatus.isform36 && this.isform38 == egblityStatus.isform38 && this.ishpa == egblityStatus.ishpa && this.ishpc == egblityStatus.ishpc && this.ishpt == egblityStatus.ishpt && this.ismisc == egblityStatus.ismisc && this.ismobilereg == egblityStatus.ismobilereg && this.isnewportal == egblityStatus.isnewportal && this.isnoc == egblityStatus.isnoc && this.isnoccancel == egblityStatus.isnoccancel && this.isnonusecontinuation == egblityStatus.isnonusecontinuation && this.isnonuseintimation == egblityStatus.isnonuseintimation && l.a(this.isnonuseshifting, egblityStatus.isnonuseshifting) && this.isnonusewithdrawal == egblityStatus.isnonusewithdrawal && this.ispermaregn == egblityStatus.ispermaregn && this.isprintfit == egblityStatus.isprintfit && this.isprintrcparticulars == egblityStatus.isprintrcparticulars && this.isrccancel == egblityStatus.isrccancel && this.isrcparticular == egblityStatus.isrcparticular && this.isrcredsipatch == egblityStatus.isrcredsipatch && this.isrcrelease == egblityStatus.isrcrelease && this.isrcsurr == egblityStatus.isrcsurr && this.isrenreg == egblityStatus.isrenreg && this.isselfbacklog == egblityStatus.isselfbacklog && this.istax == egblityStatus.istax && this.istaxinstallment == egblityStatus.istaxinstallment && this.istaxrecovery == egblityStatus.istaxrecovery && this.istempreg == egblityStatus.istempreg && this.isto == egblityStatus.isto && this.isvehadv == egblityStatus.isvehadv && this.isvehalt == egblityStatus.isvehalt && this.isvehconv == egblityStatus.isvehconv && this.isvehdetails == egblityStatus.isvehdetails && this.isvehreasgn == egblityStatus.isvehreasgn && this.isviewstatetax == egblityStatus.isviewstatetax && this.off_cd == egblityStatus.off_cd && this.payment_compounding_fee == egblityStatus.payment_compounding_fee && this.smartcard_rc == egblityStatus.smartcard_rc && l.a(this.state_cd, egblityStatus.state_cd) && l.a(this.state_tax_url, egblityStatus.state_tax_url);
    }

    public final String getCert_permit_prt() {
        return this.cert_permit_prt;
    }

    public final boolean getIsapptallowed() {
        return this.isapptallowed;
    }

    public final boolean getIsbalancefee() {
        return this.isbalancefee;
    }

    public final boolean getIsca() {
        return this.isca;
    }

    public final boolean getIscart() {
        return this.iscart;
    }

    public final boolean getIscert_permit_prt() {
        return this.iscert_permit_prt;
    }

    public final boolean getIsdispose() {
        return this.isdispose;
    }

    public final boolean getIsdoc() {
        return this.isdoc;
    }

    public final boolean getIsdupfit() {
        return this.isdupfit;
    }

    public final boolean getIsduprc() {
        return this.isduprc;
    }

    public final boolean getIsenvtax() {
        return this.isenvtax;
    }

    public final boolean getIsepermit() {
        return this.isepermit;
    }

    public final boolean getIsfit() {
        return this.isfit;
    }

    public final boolean getIsform36() {
        return this.isform36;
    }

    public final boolean getIsform38() {
        return this.isform38;
    }

    public final boolean getIshpa() {
        return this.ishpa;
    }

    public final boolean getIshpc() {
        return this.ishpc;
    }

    public final boolean getIshpt() {
        return this.ishpt;
    }

    public final boolean getIsmisc() {
        return this.ismisc;
    }

    public final boolean getIsmobilereg() {
        return this.ismobilereg;
    }

    public final boolean getIsnewportal() {
        return this.isnewportal;
    }

    public final boolean getIsnoc() {
        return this.isnoc;
    }

    public final boolean getIsnoccancel() {
        return this.isnoccancel;
    }

    public final boolean getIsnonusecontinuation() {
        return this.isnonusecontinuation;
    }

    public final boolean getIsnonuseintimation() {
        return this.isnonuseintimation;
    }

    public final Object getIsnonuseshifting() {
        return this.isnonuseshifting;
    }

    public final boolean getIsnonusewithdrawal() {
        return this.isnonusewithdrawal;
    }

    public final boolean getIspermaregn() {
        return this.ispermaregn;
    }

    public final boolean getIsprintfit() {
        return this.isprintfit;
    }

    public final boolean getIsprintrcparticulars() {
        return this.isprintrcparticulars;
    }

    public final boolean getIsrccancel() {
        return this.isrccancel;
    }

    public final boolean getIsrcparticular() {
        return this.isrcparticular;
    }

    public final boolean getIsrcredsipatch() {
        return this.isrcredsipatch;
    }

    public final boolean getIsrcrelease() {
        return this.isrcrelease;
    }

    public final boolean getIsrcsurr() {
        return this.isrcsurr;
    }

    public final boolean getIsrenreg() {
        return this.isrenreg;
    }

    public final boolean getIsselfbacklog() {
        return this.isselfbacklog;
    }

    public final boolean getIstax() {
        return this.istax;
    }

    public final boolean getIstaxinstallment() {
        return this.istaxinstallment;
    }

    public final boolean getIstaxrecovery() {
        return this.istaxrecovery;
    }

    public final boolean getIstempreg() {
        return this.istempreg;
    }

    public final boolean getIsto() {
        return this.isto;
    }

    public final boolean getIsvehadv() {
        return this.isvehadv;
    }

    public final boolean getIsvehalt() {
        return this.isvehalt;
    }

    public final boolean getIsvehconv() {
        return this.isvehconv;
    }

    public final boolean getIsvehdetails() {
        return this.isvehdetails;
    }

    public final boolean getIsvehreasgn() {
        return this.isvehreasgn;
    }

    public final boolean getIsviewstatetax() {
        return this.isviewstatetax;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final boolean getPayment_compounding_fee() {
        return this.payment_compounding_fee;
    }

    public final boolean getSmartcard_rc() {
        return this.smartcard_rc;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_tax_url() {
        return this.state_tax_url;
    }

    public int hashCode() {
        int hashCode = ((this.cert_permit_prt.hashCode() * 31) + this.is_tax_clear_cert.hashCode()) * 31;
        boolean z10 = this.isapptallowed;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (hashCode + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.isbalancefee;
        if (z12) {
            z12 = true;
        }
        int i11 = (i10 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.isca;
        if (z13) {
            z13 = true;
        }
        int i12 = (i11 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.iscart;
        if (z14) {
            z14 = true;
        }
        int i13 = (i12 + (z14 ? 1 : 0)) * 31;
        boolean z15 = this.iscert_permit_prt;
        if (z15) {
            z15 = true;
        }
        int i14 = (i13 + (z15 ? 1 : 0)) * 31;
        boolean z16 = this.isdispose;
        if (z16) {
            z16 = true;
        }
        int i15 = (i14 + (z16 ? 1 : 0)) * 31;
        boolean z17 = this.isdoc;
        if (z17) {
            z17 = true;
        }
        int i16 = (i15 + (z17 ? 1 : 0)) * 31;
        boolean z18 = this.isdupfit;
        if (z18) {
            z18 = true;
        }
        int i17 = (i16 + (z18 ? 1 : 0)) * 31;
        boolean z19 = this.isduprc;
        if (z19) {
            z19 = true;
        }
        int i18 = (i17 + (z19 ? 1 : 0)) * 31;
        boolean z20 = this.isenvtax;
        if (z20) {
            z20 = true;
        }
        int i19 = (i18 + (z20 ? 1 : 0)) * 31;
        boolean z21 = this.isepermit;
        if (z21) {
            z21 = true;
        }
        int i20 = (i19 + (z21 ? 1 : 0)) * 31;
        boolean z22 = this.isfit;
        if (z22) {
            z22 = true;
        }
        int i21 = (i20 + (z22 ? 1 : 0)) * 31;
        boolean z23 = this.isform36;
        if (z23) {
            z23 = true;
        }
        int i22 = (i21 + (z23 ? 1 : 0)) * 31;
        boolean z24 = this.isform38;
        if (z24) {
            z24 = true;
        }
        int i23 = (i22 + (z24 ? 1 : 0)) * 31;
        boolean z25 = this.ishpa;
        if (z25) {
            z25 = true;
        }
        int i24 = (i23 + (z25 ? 1 : 0)) * 31;
        boolean z26 = this.ishpc;
        if (z26) {
            z26 = true;
        }
        int i25 = (i24 + (z26 ? 1 : 0)) * 31;
        boolean z27 = this.ishpt;
        if (z27) {
            z27 = true;
        }
        int i26 = (i25 + (z27 ? 1 : 0)) * 31;
        boolean z28 = this.ismisc;
        if (z28) {
            z28 = true;
        }
        int i27 = (i26 + (z28 ? 1 : 0)) * 31;
        boolean z29 = this.ismobilereg;
        if (z29) {
            z29 = true;
        }
        int i28 = (i27 + (z29 ? 1 : 0)) * 31;
        boolean z30 = this.isnewportal;
        if (z30) {
            z30 = true;
        }
        int i29 = (i28 + (z30 ? 1 : 0)) * 31;
        boolean z31 = this.isnoc;
        if (z31) {
            z31 = true;
        }
        int i30 = (i29 + (z31 ? 1 : 0)) * 31;
        boolean z32 = this.isnoccancel;
        if (z32) {
            z32 = true;
        }
        int i31 = (i30 + (z32 ? 1 : 0)) * 31;
        boolean z33 = this.isnonusecontinuation;
        if (z33) {
            z33 = true;
        }
        int i32 = (i31 + (z33 ? 1 : 0)) * 31;
        boolean z34 = this.isnonuseintimation;
        if (z34) {
            z34 = true;
        }
        int hashCode2 = (((i32 + (z34 ? 1 : 0)) * 31) + this.isnonuseshifting.hashCode()) * 31;
        boolean z35 = this.isnonusewithdrawal;
        if (z35) {
            z35 = true;
        }
        int i33 = (hashCode2 + (z35 ? 1 : 0)) * 31;
        boolean z36 = this.ispermaregn;
        if (z36) {
            z36 = true;
        }
        int i34 = (i33 + (z36 ? 1 : 0)) * 31;
        boolean z37 = this.isprintfit;
        if (z37) {
            z37 = true;
        }
        int i35 = (i34 + (z37 ? 1 : 0)) * 31;
        boolean z38 = this.isprintrcparticulars;
        if (z38) {
            z38 = true;
        }
        int i36 = (i35 + (z38 ? 1 : 0)) * 31;
        boolean z39 = this.isrccancel;
        if (z39) {
            z39 = true;
        }
        int i37 = (i36 + (z39 ? 1 : 0)) * 31;
        boolean z40 = this.isrcparticular;
        if (z40) {
            z40 = true;
        }
        int i38 = (i37 + (z40 ? 1 : 0)) * 31;
        boolean z41 = this.isrcredsipatch;
        if (z41) {
            z41 = true;
        }
        int i39 = (i38 + (z41 ? 1 : 0)) * 31;
        boolean z42 = this.isrcrelease;
        if (z42) {
            z42 = true;
        }
        int i40 = (i39 + (z42 ? 1 : 0)) * 31;
        boolean z43 = this.isrcsurr;
        if (z43) {
            z43 = true;
        }
        int i41 = (i40 + (z43 ? 1 : 0)) * 31;
        boolean z44 = this.isrenreg;
        if (z44) {
            z44 = true;
        }
        int i42 = (i41 + (z44 ? 1 : 0)) * 31;
        boolean z45 = this.isselfbacklog;
        if (z45) {
            z45 = true;
        }
        int i43 = (i42 + (z45 ? 1 : 0)) * 31;
        boolean z46 = this.istax;
        if (z46) {
            z46 = true;
        }
        int i44 = (i43 + (z46 ? 1 : 0)) * 31;
        boolean z47 = this.istaxinstallment;
        if (z47) {
            z47 = true;
        }
        int i45 = (i44 + (z47 ? 1 : 0)) * 31;
        boolean z48 = this.istaxrecovery;
        if (z48) {
            z48 = true;
        }
        int i46 = (i45 + (z48 ? 1 : 0)) * 31;
        boolean z49 = this.istempreg;
        if (z49) {
            z49 = true;
        }
        int i47 = (i46 + (z49 ? 1 : 0)) * 31;
        boolean z50 = this.isto;
        if (z50) {
            z50 = true;
        }
        int i48 = (i47 + (z50 ? 1 : 0)) * 31;
        boolean z51 = this.isvehadv;
        if (z51) {
            z51 = true;
        }
        int i49 = (i48 + (z51 ? 1 : 0)) * 31;
        boolean z52 = this.isvehalt;
        if (z52) {
            z52 = true;
        }
        int i50 = (i49 + (z52 ? 1 : 0)) * 31;
        boolean z53 = this.isvehconv;
        if (z53) {
            z53 = true;
        }
        int i51 = (i50 + (z53 ? 1 : 0)) * 31;
        boolean z54 = this.isvehdetails;
        if (z54) {
            z54 = true;
        }
        int i52 = (i51 + (z54 ? 1 : 0)) * 31;
        boolean z55 = this.isvehreasgn;
        if (z55) {
            z55 = true;
        }
        int i53 = (i52 + (z55 ? 1 : 0)) * 31;
        boolean z56 = this.isviewstatetax;
        if (z56) {
            z56 = true;
        }
        int hashCode3 = (((i53 + (z56 ? 1 : 0)) * 31) + Integer.hashCode(this.off_cd)) * 31;
        boolean z57 = this.payment_compounding_fee;
        if (z57) {
            z57 = true;
        }
        int i54 = (hashCode3 + (z57 ? 1 : 0)) * 31;
        boolean z58 = this.smartcard_rc;
        if (!z58) {
            z11 = z58;
        }
        return ((((i54 + (z11 ? 1 : 0)) * 31) + this.state_cd.hashCode()) * 31) + this.state_tax_url.hashCode();
    }

    public final Object is_tax_clear_cert() {
        return this.is_tax_clear_cert;
    }

    public String toString() {
        return "EgblityStatus(cert_permit_prt=" + this.cert_permit_prt + ", is_tax_clear_cert=" + this.is_tax_clear_cert + ", isapptallowed=" + this.isapptallowed + ", isbalancefee=" + this.isbalancefee + ", isca=" + this.isca + ", iscart=" + this.iscart + ", iscert_permit_prt=" + this.iscert_permit_prt + ", isdispose=" + this.isdispose + ", isdoc=" + this.isdoc + ", isdupfit=" + this.isdupfit + ", isduprc=" + this.isduprc + ", isenvtax=" + this.isenvtax + ", isepermit=" + this.isepermit + ", isfit=" + this.isfit + ", isform36=" + this.isform36 + ", isform38=" + this.isform38 + ", ishpa=" + this.ishpa + ", ishpc=" + this.ishpc + ", ishpt=" + this.ishpt + ", ismisc=" + this.ismisc + ", ismobilereg=" + this.ismobilereg + ", isnewportal=" + this.isnewportal + ", isnoc=" + this.isnoc + ", isnoccancel=" + this.isnoccancel + ", isnonusecontinuation=" + this.isnonusecontinuation + ", isnonuseintimation=" + this.isnonuseintimation + ", isnonuseshifting=" + this.isnonuseshifting + ", isnonusewithdrawal=" + this.isnonusewithdrawal + ", ispermaregn=" + this.ispermaregn + ", isprintfit=" + this.isprintfit + ", isprintrcparticulars=" + this.isprintrcparticulars + ", isrccancel=" + this.isrccancel + ", isrcparticular=" + this.isrcparticular + ", isrcredsipatch=" + this.isrcredsipatch + ", isrcrelease=" + this.isrcrelease + ", isrcsurr=" + this.isrcsurr + ", isrenreg=" + this.isrenreg + ", isselfbacklog=" + this.isselfbacklog + ", istax=" + this.istax + ", istaxinstallment=" + this.istaxinstallment + ", istaxrecovery=" + this.istaxrecovery + ", istempreg=" + this.istempreg + ", isto=" + this.isto + ", isvehadv=" + this.isvehadv + ", isvehalt=" + this.isvehalt + ", isvehconv=" + this.isvehconv + ", isvehdetails=" + this.isvehdetails + ", isvehreasgn=" + this.isvehreasgn + ", isviewstatetax=" + this.isviewstatetax + ", off_cd=" + this.off_cd + ", payment_compounding_fee=" + this.payment_compounding_fee + ", smartcard_rc=" + this.smartcard_rc + ", state_cd=" + this.state_cd + ", state_tax_url=" + this.state_tax_url + ')';
    }
}
