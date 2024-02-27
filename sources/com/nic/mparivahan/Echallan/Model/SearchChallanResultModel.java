package com.nic.mparivahan.Echallan.Model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.l;
import j7.c;

@Keep
public final class SearchChallanResultModel implements Parcelable {
    public static final Parcelable.Creator<SearchChallanResultModel> CREATOR = new a();
    @c("amount")
    private final String amount;
    @c("challan_no")
    private final String challanNo;
    @c("status")
    private final String challanStatus;
    @c("court_status")
    private final int court_status;
    @c("date_time")
    private final String dateTime;
    @c("doc_no")
    private final String docNo;
    @c("dpt_cd")
    private final String dptCd;
    @c("owner_name")
    private final String ownerName;
    @c("payment_date")
    private final String paymentDate;
    @c("payment_eligible")
    private final int paymentEligible;
    @c("payment_gateway")
    private final int paymentGateway;
    @c("payment_source")
    private final String paymentSource;
    @c("pdf_url")
    private final String pdfUrl;
    @c("receipt_url")
    private final String receiptUrl;
    @c("rto_cd")
    private final String rtoCd;
    @c("sent_to_vcourt")
    private final int sent_to_vcourt;
    @c("state_cd")
    private final String stateCd;
    @c("status_txt")
    private final String statusTxt;
    @c("transaction_id")
    private final String transactionId;
    @c("vcourt_eligible")
    private final int vcourt_eligible;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final SearchChallanResultModel createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new SearchChallanResultModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public final SearchChallanResultModel[] newArray(int i10) {
            return new SearchChallanResultModel[i10];
        }
    }

    public SearchChallanResultModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, String str10, String str11, String str12, String str13, String str14, String str15, int i11, int i12, int i13, int i14) {
        String str16 = str;
        String str17 = str2;
        String str18 = str3;
        String str19 = str4;
        String str20 = str5;
        String str21 = str6;
        String str22 = str7;
        String str23 = str8;
        String str24 = str9;
        String str25 = str10;
        String str26 = str11;
        String str27 = str12;
        String str28 = str13;
        String str29 = str14;
        String str30 = str15;
        l.f(str16, "ownerName");
        l.f(str17, "amount");
        l.f(str18, "challanNo");
        l.f(str19, "dateTime");
        l.f(str20, "docNo");
        l.f(str21, "stateCd");
        l.f(str22, "dptCd");
        l.f(str23, "pdfUrl");
        l.f(str24, "rtoCd");
        l.f(str25, "statusTxt");
        l.f(str26, "paymentDate");
        l.f(str27, "paymentSource");
        l.f(str28, "transactionId");
        l.f(str29, "receiptUrl");
        l.f(str30, "challanStatus");
        this.ownerName = str16;
        this.amount = str17;
        this.challanNo = str18;
        this.dateTime = str19;
        this.docNo = str20;
        this.stateCd = str21;
        this.dptCd = str22;
        this.pdfUrl = str23;
        this.rtoCd = str24;
        this.paymentEligible = i10;
        this.statusTxt = str25;
        this.paymentDate = str26;
        this.paymentSource = str27;
        this.transactionId = str28;
        this.receiptUrl = str29;
        this.challanStatus = str30;
        this.vcourt_eligible = i11;
        this.court_status = i12;
        this.sent_to_vcourt = i13;
        this.paymentGateway = i14;
    }

    public static /* synthetic */ SearchChallanResultModel copy$default(SearchChallanResultModel searchChallanResultModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, String str10, String str11, String str12, String str13, String str14, String str15, int i11, int i12, int i13, int i14, int i15, Object obj) {
        SearchChallanResultModel searchChallanResultModel2 = searchChallanResultModel;
        int i16 = i15;
        return searchChallanResultModel.copy((i16 & 1) != 0 ? searchChallanResultModel2.ownerName : str, (i16 & 2) != 0 ? searchChallanResultModel2.amount : str2, (i16 & 4) != 0 ? searchChallanResultModel2.challanNo : str3, (i16 & 8) != 0 ? searchChallanResultModel2.dateTime : str4, (i16 & 16) != 0 ? searchChallanResultModel2.docNo : str5, (i16 & 32) != 0 ? searchChallanResultModel2.stateCd : str6, (i16 & 64) != 0 ? searchChallanResultModel2.dptCd : str7, (i16 & 128) != 0 ? searchChallanResultModel2.pdfUrl : str8, (i16 & 256) != 0 ? searchChallanResultModel2.rtoCd : str9, (i16 & 512) != 0 ? searchChallanResultModel2.paymentEligible : i10, (i16 & 1024) != 0 ? searchChallanResultModel2.statusTxt : str10, (i16 & 2048) != 0 ? searchChallanResultModel2.paymentDate : str11, (i16 & 4096) != 0 ? searchChallanResultModel2.paymentSource : str12, (i16 & 8192) != 0 ? searchChallanResultModel2.transactionId : str13, (i16 & 16384) != 0 ? searchChallanResultModel2.receiptUrl : str14, (i16 & 32768) != 0 ? searchChallanResultModel2.challanStatus : str15, (i16 & 65536) != 0 ? searchChallanResultModel2.vcourt_eligible : i11, (i16 & 131072) != 0 ? searchChallanResultModel2.court_status : i12, (i16 & 262144) != 0 ? searchChallanResultModel2.sent_to_vcourt : i13, (i16 & 524288) != 0 ? searchChallanResultModel2.paymentGateway : i14);
    }

    public final String component1() {
        return this.ownerName;
    }

    public final int component10() {
        return this.paymentEligible;
    }

    public final String component11() {
        return this.statusTxt;
    }

    public final String component12() {
        return this.paymentDate;
    }

    public final String component13() {
        return this.paymentSource;
    }

    public final String component14() {
        return this.transactionId;
    }

    public final String component15() {
        return this.receiptUrl;
    }

    public final String component16() {
        return this.challanStatus;
    }

    public final int component17() {
        return this.vcourt_eligible;
    }

    public final int component18() {
        return this.court_status;
    }

    public final int component19() {
        return this.sent_to_vcourt;
    }

    public final String component2() {
        return this.amount;
    }

    public final int component20() {
        return this.paymentGateway;
    }

    public final String component3() {
        return this.challanNo;
    }

    public final String component4() {
        return this.dateTime;
    }

    public final String component5() {
        return this.docNo;
    }

    public final String component6() {
        return this.stateCd;
    }

    public final String component7() {
        return this.dptCd;
    }

    public final String component8() {
        return this.pdfUrl;
    }

    public final String component9() {
        return this.rtoCd;
    }

    public final SearchChallanResultModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, String str10, String str11, String str12, String str13, String str14, String str15, int i11, int i12, int i13, int i14) {
        String str16 = str;
        l.f(str16, "ownerName");
        l.f(str2, "amount");
        l.f(str3, "challanNo");
        l.f(str4, "dateTime");
        l.f(str5, "docNo");
        l.f(str6, "stateCd");
        l.f(str7, "dptCd");
        l.f(str8, "pdfUrl");
        l.f(str9, "rtoCd");
        l.f(str10, "statusTxt");
        l.f(str11, "paymentDate");
        l.f(str12, "paymentSource");
        l.f(str13, "transactionId");
        l.f(str14, "receiptUrl");
        l.f(str15, "challanStatus");
        return new SearchChallanResultModel(str16, str2, str3, str4, str5, str6, str7, str8, str9, i10, str10, str11, str12, str13, str14, str15, i11, i12, i13, i14);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchChallanResultModel)) {
            return false;
        }
        SearchChallanResultModel searchChallanResultModel = (SearchChallanResultModel) obj;
        return l.a(this.ownerName, searchChallanResultModel.ownerName) && l.a(this.amount, searchChallanResultModel.amount) && l.a(this.challanNo, searchChallanResultModel.challanNo) && l.a(this.dateTime, searchChallanResultModel.dateTime) && l.a(this.docNo, searchChallanResultModel.docNo) && l.a(this.stateCd, searchChallanResultModel.stateCd) && l.a(this.dptCd, searchChallanResultModel.dptCd) && l.a(this.pdfUrl, searchChallanResultModel.pdfUrl) && l.a(this.rtoCd, searchChallanResultModel.rtoCd) && this.paymentEligible == searchChallanResultModel.paymentEligible && l.a(this.statusTxt, searchChallanResultModel.statusTxt) && l.a(this.paymentDate, searchChallanResultModel.paymentDate) && l.a(this.paymentSource, searchChallanResultModel.paymentSource) && l.a(this.transactionId, searchChallanResultModel.transactionId) && l.a(this.receiptUrl, searchChallanResultModel.receiptUrl) && l.a(this.challanStatus, searchChallanResultModel.challanStatus) && this.vcourt_eligible == searchChallanResultModel.vcourt_eligible && this.court_status == searchChallanResultModel.court_status && this.sent_to_vcourt == searchChallanResultModel.sent_to_vcourt && this.paymentGateway == searchChallanResultModel.paymentGateway;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getChallanNo() {
        return this.challanNo;
    }

    public final String getChallanStatus() {
        return this.challanStatus;
    }

    public final int getCourt_status() {
        return this.court_status;
    }

    public final String getDateTime() {
        return this.dateTime;
    }

    public final String getDocNo() {
        return this.docNo;
    }

    public final String getDptCd() {
        return this.dptCd;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getPaymentDate() {
        return this.paymentDate;
    }

    public final int getPaymentEligible() {
        return this.paymentEligible;
    }

    public final int getPaymentGateway() {
        return this.paymentGateway;
    }

    public final String getPaymentSource() {
        return this.paymentSource;
    }

    public final String getPdfUrl() {
        return this.pdfUrl;
    }

    public final String getReceiptUrl() {
        return this.receiptUrl;
    }

    public final String getRtoCd() {
        return this.rtoCd;
    }

    public final int getSent_to_vcourt() {
        return this.sent_to_vcourt;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getStatusTxt() {
        return this.statusTxt;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final int getVcourt_eligible() {
        return this.vcourt_eligible;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.ownerName.hashCode() * 31) + this.amount.hashCode()) * 31) + this.challanNo.hashCode()) * 31) + this.dateTime.hashCode()) * 31) + this.docNo.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.dptCd.hashCode()) * 31) + this.pdfUrl.hashCode()) * 31) + this.rtoCd.hashCode()) * 31) + Integer.hashCode(this.paymentEligible)) * 31) + this.statusTxt.hashCode()) * 31) + this.paymentDate.hashCode()) * 31) + this.paymentSource.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.receiptUrl.hashCode()) * 31) + this.challanStatus.hashCode()) * 31) + Integer.hashCode(this.vcourt_eligible)) * 31) + Integer.hashCode(this.court_status)) * 31) + Integer.hashCode(this.sent_to_vcourt)) * 31) + Integer.hashCode(this.paymentGateway);
    }

    public String toString() {
        return "SearchChallanResultModel(ownerName=" + this.ownerName + ", amount=" + this.amount + ", challanNo=" + this.challanNo + ", dateTime=" + this.dateTime + ", docNo=" + this.docNo + ", stateCd=" + this.stateCd + ", dptCd=" + this.dptCd + ", pdfUrl=" + this.pdfUrl + ", rtoCd=" + this.rtoCd + ", paymentEligible=" + this.paymentEligible + ", statusTxt=" + this.statusTxt + ", paymentDate=" + this.paymentDate + ", paymentSource=" + this.paymentSource + ", transactionId=" + this.transactionId + ", receiptUrl=" + this.receiptUrl + ", challanStatus=" + this.challanStatus + ", vcourt_eligible=" + this.vcourt_eligible + ", court_status=" + this.court_status + ", sent_to_vcourt=" + this.sent_to_vcourt + ", paymentGateway=" + this.paymentGateway + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.ownerName);
        parcel.writeString(this.amount);
        parcel.writeString(this.challanNo);
        parcel.writeString(this.dateTime);
        parcel.writeString(this.docNo);
        parcel.writeString(this.stateCd);
        parcel.writeString(this.dptCd);
        parcel.writeString(this.pdfUrl);
        parcel.writeString(this.rtoCd);
        parcel.writeInt(this.paymentEligible);
        parcel.writeString(this.statusTxt);
        parcel.writeString(this.paymentDate);
        parcel.writeString(this.paymentSource);
        parcel.writeString(this.transactionId);
        parcel.writeString(this.receiptUrl);
        parcel.writeString(this.challanStatus);
        parcel.writeInt(this.vcourt_eligible);
        parcel.writeInt(this.court_status);
        parcel.writeInt(this.sent_to_vcourt);
        parcel.writeInt(this.paymentGateway);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SearchChallanResultModel(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, int r41, int r42, int r43, int r44, int r45, cm.g r46) {
        /*
            r24 = this;
            r0 = r45
            r1 = r0 & 256(0x100, float:3.59E-43)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r12 = r2
            goto L_0x000c
        L_0x000a:
            r12 = r33
        L_0x000c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0012
            r14 = r2
            goto L_0x0014
        L_0x0012:
            r14 = r35
        L_0x0014:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x001a
            r15 = r2
            goto L_0x001c
        L_0x001a:
            r15 = r36
        L_0x001c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0023
            r16 = r2
            goto L_0x0025
        L_0x0023:
            r16 = r37
        L_0x0025:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x002c
            r17 = r2
            goto L_0x002e
        L_0x002c:
            r17 = r38
        L_0x002e:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0035
            r18 = r2
            goto L_0x0037
        L_0x0035:
            r18 = r39
        L_0x0037:
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r13 = r34
            r19 = r40
            r20 = r41
            r21 = r42
            r22 = r43
            r23 = r44
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.Model.SearchChallanResultModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, cm.g):void");
    }
}
