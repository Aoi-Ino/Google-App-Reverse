package com.nic.mparivahan.DPTNotice.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class NoticeCourtStatusModel {
    @c("amount")
    private final int amount;
    @c("challan_no")
    private final int challan_no;
    @c("court_address")
    private final String court_address;
    @c("court_name")
    private final String court_name;
    @c("forword_date")
    private final String forword_date;

    public NoticeCourtStatusModel() {
        this(0, 0, (String) null, (String) null, (String) null, 31, (g) null);
    }

    public static /* synthetic */ NoticeCourtStatusModel copy$default(NoticeCourtStatusModel noticeCourtStatusModel, int i10, int i11, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = noticeCourtStatusModel.challan_no;
        }
        if ((i12 & 2) != 0) {
            i11 = noticeCourtStatusModel.amount;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            str = noticeCourtStatusModel.court_name;
        }
        String str4 = str;
        if ((i12 & 8) != 0) {
            str2 = noticeCourtStatusModel.court_address;
        }
        String str5 = str2;
        if ((i12 & 16) != 0) {
            str3 = noticeCourtStatusModel.forword_date;
        }
        return noticeCourtStatusModel.copy(i10, i13, str4, str5, str3);
    }

    public final int component1() {
        return this.challan_no;
    }

    public final int component2() {
        return this.amount;
    }

    public final String component3() {
        return this.court_name;
    }

    public final String component4() {
        return this.court_address;
    }

    public final String component5() {
        return this.forword_date;
    }

    public final NoticeCourtStatusModel copy(int i10, int i11, String str, String str2, String str3) {
        l.f(str, "court_name");
        l.f(str2, "court_address");
        l.f(str3, "forword_date");
        return new NoticeCourtStatusModel(i10, i11, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeCourtStatusModel)) {
            return false;
        }
        NoticeCourtStatusModel noticeCourtStatusModel = (NoticeCourtStatusModel) obj;
        return this.challan_no == noticeCourtStatusModel.challan_no && this.amount == noticeCourtStatusModel.amount && l.a(this.court_name, noticeCourtStatusModel.court_name) && l.a(this.court_address, noticeCourtStatusModel.court_address) && l.a(this.forword_date, noticeCourtStatusModel.forword_date);
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getChallan_no() {
        return this.challan_no;
    }

    public final String getCourt_address() {
        return this.court_address;
    }

    public final String getCourt_name() {
        return this.court_name;
    }

    public final String getForword_date() {
        return this.forword_date;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.challan_no) * 31) + Integer.hashCode(this.amount)) * 31) + this.court_name.hashCode()) * 31) + this.court_address.hashCode()) * 31) + this.forword_date.hashCode();
    }

    public String toString() {
        return "NoticeCourtStatusModel(challan_no=" + this.challan_no + ", amount=" + this.amount + ", court_name=" + this.court_name + ", court_address=" + this.court_address + ", forword_date=" + this.forword_date + ')';
    }

    public NoticeCourtStatusModel(int i10, int i11, String str, String str2, String str3) {
        l.f(str, "court_name");
        l.f(str2, "court_address");
        l.f(str3, "forword_date");
        this.challan_no = i10;
        this.amount = i11;
        this.court_name = str;
        this.court_address = str2;
        this.forword_date = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NoticeCourtStatusModel(int r4, int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, cm.g r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L_0x0007
            r10 = r0
            goto L_0x0008
        L_0x0007:
            r10 = r4
        L_0x0008:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r5
        L_0x000e:
            r4 = r9 & 4
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0016
            r1 = r5
            goto L_0x0017
        L_0x0016:
            r1 = r6
        L_0x0017:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001d
            r2 = r5
            goto L_0x001e
        L_0x001d:
            r2 = r7
        L_0x001e:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0024
            r9 = r5
            goto L_0x0025
        L_0x0024:
            r9 = r8
        L_0x0025:
            r4 = r3
            r5 = r10
            r6 = r0
            r7 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DPTNotice.DataClass.NoticeCourtStatusModel.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
