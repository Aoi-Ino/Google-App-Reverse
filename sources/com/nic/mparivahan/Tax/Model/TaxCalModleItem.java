package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import java.util.ArrayList;

@Keep
public final class TaxCalModleItem {
    private double amount;
    private double amount1;
    private double amount2;
    private double fine;
    private double gamount;
    private double interest;
    private ArrayList<TaxModes> listTaxModes;
    private double penalty;
    private String pur_CD;
    private double rebate;
    private boolean status;
    private double surcharge;
    private String tax_FROM;
    private String tax_HEAD;
    private String tax_MODE;
    private String tax_UPTO;
    private int timePeriod;

    public TaxCalModleItem() {
        this(0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, 0, 131071, (g) null);
    }

    public static /* synthetic */ TaxCalModleItem copy$default(TaxCalModleItem taxCalModleItem, double d10, double d11, double d12, boolean z10, double d13, double d14, double d15, double d16, double d17, double d18, String str, String str2, String str3, String str4, ArrayList arrayList, String str5, int i10, int i11, Object obj) {
        TaxCalModleItem taxCalModleItem2 = taxCalModleItem;
        int i12 = i11;
        return taxCalModleItem.copy((i12 & 1) != 0 ? taxCalModleItem2.amount : d10, (i12 & 2) != 0 ? taxCalModleItem2.amount1 : d11, (i12 & 4) != 0 ? taxCalModleItem2.amount2 : d12, (i12 & 8) != 0 ? taxCalModleItem2.status : z10, (i12 & 16) != 0 ? taxCalModleItem2.fine : d13, (i12 & 32) != 0 ? taxCalModleItem2.gamount : d14, (i12 & 64) != 0 ? taxCalModleItem2.interest : d15, (i12 & 128) != 0 ? taxCalModleItem2.penalty : d16, (i12 & 256) != 0 ? taxCalModleItem2.rebate : d17, (i12 & 512) != 0 ? taxCalModleItem2.surcharge : d18, (i12 & 1024) != 0 ? taxCalModleItem2.tax_FROM : str, (i12 & 2048) != 0 ? taxCalModleItem2.tax_HEAD : str2, (i12 & 4096) != 0 ? taxCalModleItem2.tax_MODE : str3, (i12 & 8192) != 0 ? taxCalModleItem2.tax_UPTO : str4, (i12 & 16384) != 0 ? taxCalModleItem2.listTaxModes : arrayList, (i12 & 32768) != 0 ? taxCalModleItem2.pur_CD : str5, (i12 & 65536) != 0 ? taxCalModleItem2.timePeriod : i10);
    }

    public final double component1() {
        return this.amount;
    }

    public final double component10() {
        return this.surcharge;
    }

    public final String component11() {
        return this.tax_FROM;
    }

    public final String component12() {
        return this.tax_HEAD;
    }

    public final String component13() {
        return this.tax_MODE;
    }

    public final String component14() {
        return this.tax_UPTO;
    }

    public final ArrayList<TaxModes> component15() {
        return this.listTaxModes;
    }

    public final String component16() {
        return this.pur_CD;
    }

    public final int component17() {
        return this.timePeriod;
    }

    public final double component2() {
        return this.amount1;
    }

    public final double component3() {
        return this.amount2;
    }

    public final boolean component4() {
        return this.status;
    }

    public final double component5() {
        return this.fine;
    }

    public final double component6() {
        return this.gamount;
    }

    public final double component7() {
        return this.interest;
    }

    public final double component8() {
        return this.penalty;
    }

    public final double component9() {
        return this.rebate;
    }

    public final TaxCalModleItem copy(double d10, double d11, double d12, boolean z10, double d13, double d14, double d15, double d16, double d17, double d18, String str, String str2, String str3, String str4, ArrayList<TaxModes> arrayList, String str5, int i10) {
        return new TaxCalModleItem(d10, d11, d12, z10, d13, d14, d15, d16, d17, d18, str, str2, str3, str4, arrayList, str5, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxCalModleItem)) {
            return false;
        }
        TaxCalModleItem taxCalModleItem = (TaxCalModleItem) obj;
        return Double.compare(this.amount, taxCalModleItem.amount) == 0 && Double.compare(this.amount1, taxCalModleItem.amount1) == 0 && Double.compare(this.amount2, taxCalModleItem.amount2) == 0 && this.status == taxCalModleItem.status && Double.compare(this.fine, taxCalModleItem.fine) == 0 && Double.compare(this.gamount, taxCalModleItem.gamount) == 0 && Double.compare(this.interest, taxCalModleItem.interest) == 0 && Double.compare(this.penalty, taxCalModleItem.penalty) == 0 && Double.compare(this.rebate, taxCalModleItem.rebate) == 0 && Double.compare(this.surcharge, taxCalModleItem.surcharge) == 0 && l.a(this.tax_FROM, taxCalModleItem.tax_FROM) && l.a(this.tax_HEAD, taxCalModleItem.tax_HEAD) && l.a(this.tax_MODE, taxCalModleItem.tax_MODE) && l.a(this.tax_UPTO, taxCalModleItem.tax_UPTO) && l.a(this.listTaxModes, taxCalModleItem.listTaxModes) && l.a(this.pur_CD, taxCalModleItem.pur_CD) && this.timePeriod == taxCalModleItem.timePeriod;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getAmount1() {
        return this.amount1;
    }

    public final double getAmount2() {
        return this.amount2;
    }

    public final double getFine() {
        return this.fine;
    }

    public final double getGamount() {
        return this.gamount;
    }

    public final double getInterest() {
        return this.interest;
    }

    public final ArrayList<TaxModes> getListTaxModes() {
        return this.listTaxModes;
    }

    public final double getPenalty() {
        return this.penalty;
    }

    public final String getPur_CD() {
        return this.pur_CD;
    }

    public final double getRebate() {
        return this.rebate;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final double getSurcharge() {
        return this.surcharge;
    }

    public final String getTax_FROM() {
        return this.tax_FROM;
    }

    public final String getTax_HEAD() {
        return this.tax_HEAD;
    }

    public final String getTax_MODE() {
        return this.tax_MODE;
    }

    public final String getTax_UPTO() {
        return this.tax_UPTO;
    }

    public final int getTimePeriod() {
        return this.timePeriod;
    }

    public int hashCode() {
        int hashCode = ((((Double.hashCode(this.amount) * 31) + Double.hashCode(this.amount1)) * 31) + Double.hashCode(this.amount2)) * 31;
        boolean z10 = this.status;
        if (z10) {
            z10 = true;
        }
        int hashCode2 = (((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + Double.hashCode(this.fine)) * 31) + Double.hashCode(this.gamount)) * 31) + Double.hashCode(this.interest)) * 31) + Double.hashCode(this.penalty)) * 31) + Double.hashCode(this.rebate)) * 31) + Double.hashCode(this.surcharge)) * 31;
        String str = this.tax_FROM;
        int i10 = 0;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tax_HEAD;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tax_MODE;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tax_UPTO;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ArrayList<TaxModes> arrayList = this.listTaxModes;
        int hashCode7 = (hashCode6 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str5 = this.pur_CD;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return ((hashCode7 + i10) * 31) + Integer.hashCode(this.timePeriod);
    }

    public final void setAmount(double d10) {
        this.amount = d10;
    }

    public final void setAmount1(double d10) {
        this.amount1 = d10;
    }

    public final void setAmount2(double d10) {
        this.amount2 = d10;
    }

    public final void setFine(double d10) {
        this.fine = d10;
    }

    public final void setGamount(double d10) {
        this.gamount = d10;
    }

    public final void setInterest(double d10) {
        this.interest = d10;
    }

    public final void setListTaxModes(ArrayList<TaxModes> arrayList) {
        this.listTaxModes = arrayList;
    }

    public final void setPenalty(double d10) {
        this.penalty = d10;
    }

    public final void setPur_CD(String str) {
        this.pur_CD = str;
    }

    public final void setRebate(double d10) {
        this.rebate = d10;
    }

    public final void setStatus(boolean z10) {
        this.status = z10;
    }

    public final void setSurcharge(double d10) {
        this.surcharge = d10;
    }

    public final void setTax_FROM(String str) {
        this.tax_FROM = str;
    }

    public final void setTax_HEAD(String str) {
        this.tax_HEAD = str;
    }

    public final void setTax_MODE(String str) {
        this.tax_MODE = str;
    }

    public final void setTax_UPTO(String str) {
        this.tax_UPTO = str;
    }

    public final void setTimePeriod(int i10) {
        this.timePeriod = i10;
    }

    public String toString() {
        return "TaxCalModleItem(amount=" + this.amount + ", amount1=" + this.amount1 + ", amount2=" + this.amount2 + ", status=" + this.status + ", fine=" + this.fine + ", gamount=" + this.gamount + ", interest=" + this.interest + ", penalty=" + this.penalty + ", rebate=" + this.rebate + ", surcharge=" + this.surcharge + ", tax_FROM=" + this.tax_FROM + ", tax_HEAD=" + this.tax_HEAD + ", tax_MODE=" + this.tax_MODE + ", tax_UPTO=" + this.tax_UPTO + ", listTaxModes=" + this.listTaxModes + ", pur_CD=" + this.pur_CD + ", timePeriod=" + this.timePeriod + ')';
    }

    public TaxCalModleItem(double d10, double d11, double d12, boolean z10, double d13, double d14, double d15, double d16, double d17, double d18, String str, String str2, String str3, String str4, ArrayList<TaxModes> arrayList, String str5, int i10) {
        this.amount = d10;
        this.amount1 = d11;
        this.amount2 = d12;
        this.status = z10;
        this.fine = d13;
        this.gamount = d14;
        this.interest = d15;
        this.penalty = d16;
        this.rebate = d17;
        this.surcharge = d18;
        this.tax_FROM = str;
        this.tax_HEAD = str2;
        this.tax_MODE = str3;
        this.tax_UPTO = str4;
        this.listTaxModes = arrayList;
        this.pur_CD = str5;
        this.timePeriod = i10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TaxCalModleItem(double r27, double r29, double r31, boolean r33, double r34, double r36, double r38, double r40, double r42, double r44, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.util.ArrayList r50, java.lang.String r51, int r52, int r53, cm.g r54) {
        /*
            r26 = this;
            r0 = r53
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r4 = 0
            goto L_0x000b
        L_0x0009:
            r4 = r27
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r6 = 0
            goto L_0x0014
        L_0x0012:
            r6 = r29
        L_0x0014:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001b
            r8 = 0
            goto L_0x001d
        L_0x001b:
            r8 = r31
        L_0x001d:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0023
            r1 = 0
            goto L_0x0025
        L_0x0023:
            r1 = r33
        L_0x0025:
            r11 = r0 & 16
            if (r11 == 0) goto L_0x002c
            r11 = 0
            goto L_0x002e
        L_0x002c:
            r11 = r34
        L_0x002e:
            r13 = r0 & 32
            if (r13 == 0) goto L_0x0035
            r13 = 0
            goto L_0x0037
        L_0x0035:
            r13 = r36
        L_0x0037:
            r15 = r0 & 64
            if (r15 == 0) goto L_0x003e
            r15 = 0
            goto L_0x0040
        L_0x003e:
            r15 = r38
        L_0x0040:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0047
            r2 = 0
            goto L_0x0049
        L_0x0047:
            r2 = r40
        L_0x0049:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0050
            r19 = 0
            goto L_0x0052
        L_0x0050:
            r19 = r42
        L_0x0052:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0059
            r17 = 0
            goto L_0x005b
        L_0x0059:
            r17 = r44
        L_0x005b:
            r10 = r0 & 1024(0x400, float:1.435E-42)
            r21 = 0
            if (r10 == 0) goto L_0x0064
            r10 = r21
            goto L_0x0066
        L_0x0064:
            r10 = r46
        L_0x0066:
            r54 = r10
            r10 = r0 & 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x006f
            r10 = r21
            goto L_0x0071
        L_0x006f:
            r10 = r47
        L_0x0071:
            r22 = r10
            r10 = r0 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x007a
            r10 = r21
            goto L_0x007c
        L_0x007a:
            r10 = r48
        L_0x007c:
            r23 = r10
            r10 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x0085
            r10 = r21
            goto L_0x0087
        L_0x0085:
            r10 = r49
        L_0x0087:
            r24 = r10
            r10 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x0090
            r10 = r21
            goto L_0x0092
        L_0x0090:
            r10 = r50
        L_0x0092:
            r25 = 32768(0x8000, float:4.5918E-41)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r21 = r51
        L_0x009c:
            r25 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r25
            if (r0 == 0) goto L_0x00a4
            r0 = 0
            goto L_0x00a6
        L_0x00a4:
            r0 = r52
        L_0x00a6:
            r27 = r26
            r28 = r4
            r30 = r6
            r32 = r8
            r34 = r1
            r35 = r11
            r37 = r13
            r39 = r15
            r41 = r2
            r43 = r19
            r45 = r17
            r47 = r54
            r48 = r22
            r49 = r23
            r50 = r24
            r51 = r10
            r52 = r21
            r53 = r0
            r27.<init>(r28, r30, r32, r34, r35, r37, r39, r41, r43, r45, r47, r48, r49, r50, r51, r52, r53)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Tax.Model.TaxCalModleItem.<init>(double, double, double, boolean, double, double, double, double, double, double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, int, int, cm.g):void");
    }
}
