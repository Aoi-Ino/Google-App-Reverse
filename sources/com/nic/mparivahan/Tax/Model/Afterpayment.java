package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Afterpayment {
    private final String bank_CODE;
    private final String bank_FILE_NAME;
    private final String bankdesc;
    private final String cart_NAME;
    private final String cart_TRANS_DATE;
    private final String chassis;
    private final String deal_CD;
    private final String exceptionheader;
    private final String is_MULTIPLE_PAYMENT;
    private final int off_CD;
    private final String off_descr;
    private final String owner_name;
    private final String pay_MODE;
    private final String pgidecyresp;
    private final String pgidesc;
    private final String pgiencyresp;
    private final int pur_CD;
    private final String rcp_dt;
    private final int rcpt_AMT;
    private final String rcpt_DT;
    private final String rcpt_NO;
    private final int rcpt_amt;
    private final String regn_NO;
    private final String regn_date;
    private final String response_CODE;
    private final String return_RCPT_NO;
    private final String state_CD;
    private final String state_header;
    private final String status_DESC;
    private final String tax_FROM;
    private final String tax_MODE;
    private final String tax_UPTO;
    private final String trans_NO;
    private final String treasury_FLAG;
    private final String treasury_REF_NO;
    private final String vh_class;

    public Afterpayment(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, String str10, String str11, String str12, String str13, String str14, String str15, int i11, String str16, int i12, String str17, String str18, int i13, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32) {
        String str33 = str;
        String str34 = str2;
        String str35 = str3;
        String str36 = str4;
        String str37 = str5;
        String str38 = str6;
        String str39 = str7;
        String str40 = str8;
        String str41 = str9;
        String str42 = str10;
        String str43 = str11;
        String str44 = str12;
        String str45 = str13;
        String str46 = str14;
        String str47 = str16;
        l.f(str33, "bank_CODE");
        l.f(str34, "bank_FILE_NAME");
        l.f(str35, "bankdesc");
        l.f(str36, "cart_NAME");
        l.f(str37, "cart_TRANS_DATE");
        l.f(str38, "chassis");
        l.f(str39, "deal_CD");
        l.f(str40, "exceptionheader");
        l.f(str41, "is_MULTIPLE_PAYMENT");
        l.f(str42, "off_descr");
        l.f(str43, "owner_name");
        l.f(str44, "pay_MODE");
        l.f(str45, "pgidecyresp");
        l.f(str46, "pgidesc");
        l.f(str15, "pgiencyresp");
        l.f(str16, "rcp_dt");
        l.f(str17, "rcpt_DT");
        l.f(str18, "rcpt_NO");
        l.f(str19, "regn_NO");
        l.f(str20, "regn_date");
        l.f(str21, "response_CODE");
        l.f(str22, "return_RCPT_NO");
        l.f(str23, "state_CD");
        l.f(str24, "state_header");
        l.f(str25, "status_DESC");
        l.f(str26, "tax_FROM");
        l.f(str27, "tax_MODE");
        l.f(str28, "tax_UPTO");
        l.f(str29, "trans_NO");
        l.f(str30, "treasury_FLAG");
        l.f(str31, "treasury_REF_NO");
        l.f(str32, "vh_class");
        this.bank_CODE = str33;
        this.bank_FILE_NAME = str34;
        this.bankdesc = str35;
        this.cart_NAME = str36;
        this.cart_TRANS_DATE = str37;
        this.chassis = str38;
        this.deal_CD = str39;
        this.exceptionheader = str40;
        this.is_MULTIPLE_PAYMENT = str41;
        this.off_CD = i10;
        this.off_descr = str42;
        this.owner_name = str43;
        this.pay_MODE = str44;
        this.pgidecyresp = str45;
        this.pgidesc = str46;
        this.pgiencyresp = str15;
        this.pur_CD = i11;
        this.rcp_dt = str16;
        this.rcpt_AMT = i12;
        this.rcpt_DT = str17;
        this.rcpt_NO = str18;
        this.rcpt_amt = i13;
        this.regn_NO = str19;
        this.regn_date = str20;
        this.response_CODE = str21;
        this.return_RCPT_NO = str22;
        this.state_CD = str23;
        this.state_header = str24;
        this.status_DESC = str25;
        this.tax_FROM = str26;
        this.tax_MODE = str27;
        this.tax_UPTO = str28;
        this.trans_NO = str29;
        this.treasury_FLAG = str30;
        this.treasury_REF_NO = str31;
        this.vh_class = str32;
    }

    public static /* synthetic */ Afterpayment copy$default(Afterpayment afterpayment, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, String str10, String str11, String str12, String str13, String str14, String str15, int i11, String str16, int i12, String str17, String str18, int i13, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, int i14, int i15, Object obj) {
        Afterpayment afterpayment2 = afterpayment;
        int i16 = i14;
        return afterpayment.copy((i16 & 1) != 0 ? afterpayment2.bank_CODE : str, (i16 & 2) != 0 ? afterpayment2.bank_FILE_NAME : str2, (i16 & 4) != 0 ? afterpayment2.bankdesc : str3, (i16 & 8) != 0 ? afterpayment2.cart_NAME : str4, (i16 & 16) != 0 ? afterpayment2.cart_TRANS_DATE : str5, (i16 & 32) != 0 ? afterpayment2.chassis : str6, (i16 & 64) != 0 ? afterpayment2.deal_CD : str7, (i16 & 128) != 0 ? afterpayment2.exceptionheader : str8, (i16 & 256) != 0 ? afterpayment2.is_MULTIPLE_PAYMENT : str9, (i16 & 512) != 0 ? afterpayment2.off_CD : i10, (i16 & 1024) != 0 ? afterpayment2.off_descr : str10, (i16 & 2048) != 0 ? afterpayment2.owner_name : str11, (i16 & 4096) != 0 ? afterpayment2.pay_MODE : str12, (i16 & 8192) != 0 ? afterpayment2.pgidecyresp : str13, (i16 & 16384) != 0 ? afterpayment2.pgidesc : str14, (i16 & 32768) != 0 ? afterpayment2.pgiencyresp : str15, (i16 & 65536) != 0 ? afterpayment2.pur_CD : i11, (i16 & 131072) != 0 ? afterpayment2.rcp_dt : str16, (i16 & 262144) != 0 ? afterpayment2.rcpt_AMT : i12, (i16 & 524288) != 0 ? afterpayment2.rcpt_DT : str17, (i16 & 1048576) != 0 ? afterpayment2.rcpt_NO : str18, (i16 & 2097152) != 0 ? afterpayment2.rcpt_amt : i13, (i16 & 4194304) != 0 ? afterpayment2.regn_NO : str19, (i16 & 8388608) != 0 ? afterpayment2.regn_date : str20, (i16 & 16777216) != 0 ? afterpayment2.response_CODE : str21, (i16 & 33554432) != 0 ? afterpayment2.return_RCPT_NO : str22, (i16 & 67108864) != 0 ? afterpayment2.state_CD : str23, (i16 & 134217728) != 0 ? afterpayment2.state_header : str24, (i16 & 268435456) != 0 ? afterpayment2.status_DESC : str25, (i16 & 536870912) != 0 ? afterpayment2.tax_FROM : str26, (i16 & 1073741824) != 0 ? afterpayment2.tax_MODE : str27, (i16 & Integer.MIN_VALUE) != 0 ? afterpayment2.tax_UPTO : str28, (i15 & 1) != 0 ? afterpayment2.trans_NO : str29, (i15 & 2) != 0 ? afterpayment2.treasury_FLAG : str30, (i15 & 4) != 0 ? afterpayment2.treasury_REF_NO : str31, (i15 & 8) != 0 ? afterpayment2.vh_class : str32);
    }

    public final String component1() {
        return this.bank_CODE;
    }

    public final int component10() {
        return this.off_CD;
    }

    public final String component11() {
        return this.off_descr;
    }

    public final String component12() {
        return this.owner_name;
    }

    public final String component13() {
        return this.pay_MODE;
    }

    public final String component14() {
        return this.pgidecyresp;
    }

    public final String component15() {
        return this.pgidesc;
    }

    public final String component16() {
        return this.pgiencyresp;
    }

    public final int component17() {
        return this.pur_CD;
    }

    public final String component18() {
        return this.rcp_dt;
    }

    public final int component19() {
        return this.rcpt_AMT;
    }

    public final String component2() {
        return this.bank_FILE_NAME;
    }

    public final String component20() {
        return this.rcpt_DT;
    }

    public final String component21() {
        return this.rcpt_NO;
    }

    public final int component22() {
        return this.rcpt_amt;
    }

    public final String component23() {
        return this.regn_NO;
    }

    public final String component24() {
        return this.regn_date;
    }

    public final String component25() {
        return this.response_CODE;
    }

    public final String component26() {
        return this.return_RCPT_NO;
    }

    public final String component27() {
        return this.state_CD;
    }

    public final String component28() {
        return this.state_header;
    }

    public final String component29() {
        return this.status_DESC;
    }

    public final String component3() {
        return this.bankdesc;
    }

    public final String component30() {
        return this.tax_FROM;
    }

    public final String component31() {
        return this.tax_MODE;
    }

    public final String component32() {
        return this.tax_UPTO;
    }

    public final String component33() {
        return this.trans_NO;
    }

    public final String component34() {
        return this.treasury_FLAG;
    }

    public final String component35() {
        return this.treasury_REF_NO;
    }

    public final String component36() {
        return this.vh_class;
    }

    public final String component4() {
        return this.cart_NAME;
    }

    public final String component5() {
        return this.cart_TRANS_DATE;
    }

    public final String component6() {
        return this.chassis;
    }

    public final String component7() {
        return this.deal_CD;
    }

    public final String component8() {
        return this.exceptionheader;
    }

    public final String component9() {
        return this.is_MULTIPLE_PAYMENT;
    }

    public final Afterpayment copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, String str10, String str11, String str12, String str13, String str14, String str15, int i11, String str16, int i12, String str17, String str18, int i13, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32) {
        String str33 = str;
        l.f(str33, "bank_CODE");
        l.f(str2, "bank_FILE_NAME");
        l.f(str3, "bankdesc");
        l.f(str4, "cart_NAME");
        l.f(str5, "cart_TRANS_DATE");
        l.f(str6, "chassis");
        l.f(str7, "deal_CD");
        l.f(str8, "exceptionheader");
        l.f(str9, "is_MULTIPLE_PAYMENT");
        l.f(str10, "off_descr");
        l.f(str11, "owner_name");
        l.f(str12, "pay_MODE");
        l.f(str13, "pgidecyresp");
        l.f(str14, "pgidesc");
        l.f(str15, "pgiencyresp");
        l.f(str16, "rcp_dt");
        l.f(str17, "rcpt_DT");
        l.f(str18, "rcpt_NO");
        l.f(str19, "regn_NO");
        l.f(str20, "regn_date");
        l.f(str21, "response_CODE");
        l.f(str22, "return_RCPT_NO");
        l.f(str23, "state_CD");
        l.f(str24, "state_header");
        l.f(str25, "status_DESC");
        l.f(str26, "tax_FROM");
        l.f(str27, "tax_MODE");
        l.f(str28, "tax_UPTO");
        l.f(str29, "trans_NO");
        l.f(str30, "treasury_FLAG");
        l.f(str31, "treasury_REF_NO");
        l.f(str32, "vh_class");
        return new Afterpayment(str33, str2, str3, str4, str5, str6, str7, str8, str9, i10, str10, str11, str12, str13, str14, str15, i11, str16, i12, str17, str18, i13, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Afterpayment)) {
            return false;
        }
        Afterpayment afterpayment = (Afterpayment) obj;
        return l.a(this.bank_CODE, afterpayment.bank_CODE) && l.a(this.bank_FILE_NAME, afterpayment.bank_FILE_NAME) && l.a(this.bankdesc, afterpayment.bankdesc) && l.a(this.cart_NAME, afterpayment.cart_NAME) && l.a(this.cart_TRANS_DATE, afterpayment.cart_TRANS_DATE) && l.a(this.chassis, afterpayment.chassis) && l.a(this.deal_CD, afterpayment.deal_CD) && l.a(this.exceptionheader, afterpayment.exceptionheader) && l.a(this.is_MULTIPLE_PAYMENT, afterpayment.is_MULTIPLE_PAYMENT) && this.off_CD == afterpayment.off_CD && l.a(this.off_descr, afterpayment.off_descr) && l.a(this.owner_name, afterpayment.owner_name) && l.a(this.pay_MODE, afterpayment.pay_MODE) && l.a(this.pgidecyresp, afterpayment.pgidecyresp) && l.a(this.pgidesc, afterpayment.pgidesc) && l.a(this.pgiencyresp, afterpayment.pgiencyresp) && this.pur_CD == afterpayment.pur_CD && l.a(this.rcp_dt, afterpayment.rcp_dt) && this.rcpt_AMT == afterpayment.rcpt_AMT && l.a(this.rcpt_DT, afterpayment.rcpt_DT) && l.a(this.rcpt_NO, afterpayment.rcpt_NO) && this.rcpt_amt == afterpayment.rcpt_amt && l.a(this.regn_NO, afterpayment.regn_NO) && l.a(this.regn_date, afterpayment.regn_date) && l.a(this.response_CODE, afterpayment.response_CODE) && l.a(this.return_RCPT_NO, afterpayment.return_RCPT_NO) && l.a(this.state_CD, afterpayment.state_CD) && l.a(this.state_header, afterpayment.state_header) && l.a(this.status_DESC, afterpayment.status_DESC) && l.a(this.tax_FROM, afterpayment.tax_FROM) && l.a(this.tax_MODE, afterpayment.tax_MODE) && l.a(this.tax_UPTO, afterpayment.tax_UPTO) && l.a(this.trans_NO, afterpayment.trans_NO) && l.a(this.treasury_FLAG, afterpayment.treasury_FLAG) && l.a(this.treasury_REF_NO, afterpayment.treasury_REF_NO) && l.a(this.vh_class, afterpayment.vh_class);
    }

    public final String getBank_CODE() {
        return this.bank_CODE;
    }

    public final String getBank_FILE_NAME() {
        return this.bank_FILE_NAME;
    }

    public final String getBankdesc() {
        return this.bankdesc;
    }

    public final String getCart_NAME() {
        return this.cart_NAME;
    }

    public final String getCart_TRANS_DATE() {
        return this.cart_TRANS_DATE;
    }

    public final String getChassis() {
        return this.chassis;
    }

    public final String getDeal_CD() {
        return this.deal_CD;
    }

    public final String getExceptionheader() {
        return this.exceptionheader;
    }

    public final int getOff_CD() {
        return this.off_CD;
    }

    public final String getOff_descr() {
        return this.off_descr;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getPay_MODE() {
        return this.pay_MODE;
    }

    public final String getPgidecyresp() {
        return this.pgidecyresp;
    }

    public final String getPgidesc() {
        return this.pgidesc;
    }

    public final String getPgiencyresp() {
        return this.pgiencyresp;
    }

    public final int getPur_CD() {
        return this.pur_CD;
    }

    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    public final int getRcpt_AMT() {
        return this.rcpt_AMT;
    }

    public final String getRcpt_DT() {
        return this.rcpt_DT;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final int getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final String getRegn_NO() {
        return this.regn_NO;
    }

    public final String getRegn_date() {
        return this.regn_date;
    }

    public final String getResponse_CODE() {
        return this.response_CODE;
    }

    public final String getReturn_RCPT_NO() {
        return this.return_RCPT_NO;
    }

    public final String getState_CD() {
        return this.state_CD;
    }

    public final String getState_header() {
        return this.state_header;
    }

    public final String getStatus_DESC() {
        return this.status_DESC;
    }

    public final String getTax_FROM() {
        return this.tax_FROM;
    }

    public final String getTax_MODE() {
        return this.tax_MODE;
    }

    public final String getTax_UPTO() {
        return this.tax_UPTO;
    }

    public final String getTrans_NO() {
        return this.trans_NO;
    }

    public final String getTreasury_FLAG() {
        return this.treasury_FLAG;
    }

    public final String getTreasury_REF_NO() {
        return this.treasury_REF_NO;
    }

    public final String getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.bank_CODE.hashCode() * 31) + this.bank_FILE_NAME.hashCode()) * 31) + this.bankdesc.hashCode()) * 31) + this.cart_NAME.hashCode()) * 31) + this.cart_TRANS_DATE.hashCode()) * 31) + this.chassis.hashCode()) * 31) + this.deal_CD.hashCode()) * 31) + this.exceptionheader.hashCode()) * 31) + this.is_MULTIPLE_PAYMENT.hashCode()) * 31) + Integer.hashCode(this.off_CD)) * 31) + this.off_descr.hashCode()) * 31) + this.owner_name.hashCode()) * 31) + this.pay_MODE.hashCode()) * 31) + this.pgidecyresp.hashCode()) * 31) + this.pgidesc.hashCode()) * 31) + this.pgiencyresp.hashCode()) * 31) + Integer.hashCode(this.pur_CD)) * 31) + this.rcp_dt.hashCode()) * 31) + Integer.hashCode(this.rcpt_AMT)) * 31) + this.rcpt_DT.hashCode()) * 31) + this.rcpt_NO.hashCode()) * 31) + Integer.hashCode(this.rcpt_amt)) * 31) + this.regn_NO.hashCode()) * 31) + this.regn_date.hashCode()) * 31) + this.response_CODE.hashCode()) * 31) + this.return_RCPT_NO.hashCode()) * 31) + this.state_CD.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status_DESC.hashCode()) * 31) + this.tax_FROM.hashCode()) * 31) + this.tax_MODE.hashCode()) * 31) + this.tax_UPTO.hashCode()) * 31) + this.trans_NO.hashCode()) * 31) + this.treasury_FLAG.hashCode()) * 31) + this.treasury_REF_NO.hashCode()) * 31) + this.vh_class.hashCode();
    }

    public final String is_MULTIPLE_PAYMENT() {
        return this.is_MULTIPLE_PAYMENT;
    }

    public String toString() {
        return "Afterpayment(bank_CODE=" + this.bank_CODE + ", bank_FILE_NAME=" + this.bank_FILE_NAME + ", bankdesc=" + this.bankdesc + ", cart_NAME=" + this.cart_NAME + ", cart_TRANS_DATE=" + this.cart_TRANS_DATE + ", chassis=" + this.chassis + ", deal_CD=" + this.deal_CD + ", exceptionheader=" + this.exceptionheader + ", is_MULTIPLE_PAYMENT=" + this.is_MULTIPLE_PAYMENT + ", off_CD=" + this.off_CD + ", off_descr=" + this.off_descr + ", owner_name=" + this.owner_name + ", pay_MODE=" + this.pay_MODE + ", pgidecyresp=" + this.pgidecyresp + ", pgidesc=" + this.pgidesc + ", pgiencyresp=" + this.pgiencyresp + ", pur_CD=" + this.pur_CD + ", rcp_dt=" + this.rcp_dt + ", rcpt_AMT=" + this.rcpt_AMT + ", rcpt_DT=" + this.rcpt_DT + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", regn_NO=" + this.regn_NO + ", regn_date=" + this.regn_date + ", response_CODE=" + this.response_CODE + ", return_RCPT_NO=" + this.return_RCPT_NO + ", state_CD=" + this.state_CD + ", state_header=" + this.state_header + ", status_DESC=" + this.status_DESC + ", tax_FROM=" + this.tax_FROM + ", tax_MODE=" + this.tax_MODE + ", tax_UPTO=" + this.tax_UPTO + ", trans_NO=" + this.trans_NO + ", treasury_FLAG=" + this.treasury_FLAG + ", treasury_REF_NO=" + this.treasury_REF_NO + ", vh_class=" + this.vh_class + ')';
    }
}
