package com.nic.mparivahan.Echallan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.echallanLog.SaveLog;
import com.nic.mparivahan.MyTextView;
import fb.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import ld.c;
import ni.v9;

public final class ResponsePaymentActivity extends d {
    private AppCompatImageView G;
    private AppCompatImageView H;
    private AppCompatTextView I;
    private AppCompatTextView J;
    private AppCompatTextView K;
    private AppCompatTextView L;
    private MyTextView M;
    private RelativeLayout N;
    private String O = "";
    private String P = "";
    private String Q = "";
    private String R = "";
    private String S = "";
    private String T = "";
    private String U = "";
    private String V = "";
    private String W = "";
    private String X = "";
    private String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f8811a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    public c f8812b0;

    /* renamed from: c0  reason: collision with root package name */
    private String f8813c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    private v9 f8814d0;

    /* renamed from: e0  reason: collision with root package name */
    private String f8815e0 = "";

    private final void i1(String str) {
        String str2 = "";
        try {
            if (com.nic.mparivahan.dlservices.utilities.d.d(this.O)) {
                SimpleDateFormat simpleDateFormat = l.a(this.f8815e0, "eTrans") ? new SimpleDateFormat("yyyy-MM-dd hh:mm:ss") : new SimpleDateFormat("dd-MM-yyyy hh:mm:ssaa");
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
                Date parse = simpleDateFormat2.parse(this.Y);
                l.d(parse, "null cannot be cast to non-null type java.util.Date");
                String format = simpleDateFormat3.format(parse);
                if (!l.a(this.U, str2)) {
                    Date parse2 = simpleDateFormat.parse(this.U);
                    str2 = parse2 != null ? simpleDateFormat3.format(parse2) : null;
                }
                String str3 = str2;
                String str4 = p.o(this.f8811a0, "Challan", true) ? "CH" : this.f8811a0;
                String str5 = this.T;
                if (com.nic.mparivahan.dlservices.utilities.d.d(str3)) {
                    SaveLog.a aVar = SaveLog.f8907k;
                    l.c(format);
                    int parseInt = Integer.parseInt(this.W);
                    String str6 = this.P;
                    l.c(str3);
                    aVar.a(this, format, parseInt, str6, str3, Integer.parseInt(this.X), this.Z, this.Q, this.O, str, str4, "", Double.parseDouble(str5));
                    return;
                }
                SaveLog.a aVar2 = SaveLog.f8907k;
                l.c(format);
                aVar2.a(this, format, Integer.parseInt(this.W), this.P, "", Integer.parseInt(this.X), this.Z, this.Q, this.O, str, str4, "", Double.parseDouble(str5));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c7, code lost:
        if (r1 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d0, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ef, code lost:
        if (r1 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0285  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void k1() {
        /*
            r13 = this;
            java.lang.String r0 = ""
            r1 = 2131363686(0x7f0a0766, float:1.8347188E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r2 = "findViewById(...)"
            cm.l.e(r1, r2)
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r13.G = r1
            r1 = 2131363985(0x7f0a0891, float:1.8347794E38)
            android.view.View r1 = r13.findViewById(r1)
            cm.l.e(r1, r2)
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r13.H = r1
            r1 = 2131364949(0x7f0a0c55, float:1.834975E38)
            android.view.View r1 = r13.findViewById(r1)
            cm.l.e(r1, r2)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r13.I = r1
            r1 = 2131362257(0x7f0a01d1, float:1.834429E38)
            android.view.View r1 = r13.findViewById(r1)
            cm.l.e(r1, r2)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r13.J = r1
            r1 = 2131361988(0x7f0a00c4, float:1.8343744E38)
            android.view.View r1 = r13.findViewById(r1)
            cm.l.e(r1, r2)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r13.K = r1
            r1 = 2131365600(0x7f0a0ee0, float:1.835107E38)
            android.view.View r1 = r13.findViewById(r1)
            cm.l.e(r1, r2)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r13.L = r1
            r1 = 2131362192(0x7f0a0190, float:1.8344158E38)
            android.view.View r1 = r13.findViewById(r1)
            cm.l.e(r1, r2)
            com.nic.mparivahan.MyTextView r1 = (com.nic.mparivahan.MyTextView) r1
            r13.M = r1
            r1 = 2131363785(0x7f0a07c9, float:1.8347389E38)
            android.view.View r1 = r13.findViewById(r1)
            cm.l.e(r1, r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r13.N = r1
            androidx.appcompat.widget.AppCompatImageView r1 = r13.G
            r2 = 0
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = "backIv"
            cm.l.v(r1)
            r1 = r2
        L_0x007f:
            cb.z0 r3 = new cb.z0
            r3.<init>(r13)
            r1.setOnClickListener(r3)
            android.widget.RelativeLayout r1 = r13.N
            if (r1 != 0) goto L_0x0091
            java.lang.String r1 = "nexGenHolder"
            cm.l.v(r1)
            r1 = r2
        L_0x0091:
            cb.a1 r3 = new cb.a1
            r3.<init>(r13)
            r1.setOnClickListener(r3)
            java.lang.String r1 = r13.U     // Catch:{ Exception -> 0x00ce }
            boolean r1 = com.nic.mparivahan.dlservices.utilities.d.d(r1)     // Catch:{ Exception -> 0x00ce }
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r13.f8815e0     // Catch:{ Exception -> 0x00ce }
            java.lang.String r3 = "eTrans"
            boolean r1 = cm.l.a(r1, r3)     // Catch:{ Exception -> 0x00ce }
            java.lang.String r3 = "yyyy-MM-dd"
            if (r1 == 0) goto L_0x00d5
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x00ce }
            java.lang.String r4 = "yyyy-MM-dd hh:mm:ss"
            r1.<init>(r4)     // Catch:{ Exception -> 0x00ce }
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x00ce }
            r4.<init>(r3)     // Catch:{ Exception -> 0x00ce }
            java.lang.String r3 = r13.U     // Catch:{ Exception -> 0x00ce }
            boolean r3 = cm.l.a(r3, r0)     // Catch:{ Exception -> 0x00ce }
            if (r3 != 0) goto L_0x00d2
            java.lang.String r3 = r13.U     // Catch:{ Exception -> 0x00ce }
            java.util.Date r1 = r1.parse(r3)     // Catch:{ Exception -> 0x00ce }
            if (r1 == 0) goto L_0x00d0
        L_0x00c9:
            java.lang.String r1 = r4.format(r1)     // Catch:{ Exception -> 0x00ce }
            goto L_0x00d3
        L_0x00ce:
            r1 = move-exception
            goto L_0x00f2
        L_0x00d0:
            r1 = r2
            goto L_0x00d3
        L_0x00d2:
            r1 = r0
        L_0x00d3:
            r6 = r1
            goto L_0x00f6
        L_0x00d5:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x00ce }
            java.lang.String r4 = "dd-MM-yyyy hh:mm:ssaa"
            r1.<init>(r4)     // Catch:{ Exception -> 0x00ce }
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x00ce }
            r4.<init>(r3)     // Catch:{ Exception -> 0x00ce }
            java.lang.String r3 = r13.U     // Catch:{ Exception -> 0x00ce }
            boolean r3 = cm.l.a(r3, r0)     // Catch:{ Exception -> 0x00ce }
            if (r3 != 0) goto L_0x00d2
            java.lang.String r3 = r13.U     // Catch:{ Exception -> 0x00ce }
            java.util.Date r1 = r1.parse(r3)     // Catch:{ Exception -> 0x00ce }
            if (r1 == 0) goto L_0x00d0
            goto L_0x00c9
        L_0x00f2:
            r1.printStackTrace()
        L_0x00f5:
            r6 = r0
        L_0x00f6:
            java.lang.String r1 = r13.R
            int r1 = r1.length()
            java.lang.String r12 = "buttonTv"
            if (r1 <= 0) goto L_0x026d
            java.lang.String r1 = r13.R
            java.lang.String r3 = "Cash"
            r4 = 1
            boolean r1 = km.p.o(r1, r3, r4)
            java.lang.String r3 = "Go Back"
            java.lang.String r5 = "btn_go_back"
            java.lang.String r7 = "paymentResponseIv"
            java.lang.String r8 = "transactionStatusTv"
            if (r1 != 0) goto L_0x01da
            java.lang.String r1 = r13.R
            java.lang.String r9 = "Success"
            boolean r1 = km.p.o(r1, r9, r4)
            if (r1 == 0) goto L_0x011f
            goto L_0x01da
        L_0x011f:
            java.lang.String r1 = r13.R
            java.lang.String r6 = "Pending"
            boolean r1 = km.p.o(r1, r6, r4)
            if (r1 == 0) goto L_0x017a
            androidx.appcompat.widget.AppCompatImageView r1 = r13.H
            if (r1 != 0) goto L_0x0131
            cm.l.v(r7)
            r1 = r2
        L_0x0131:
            r4 = 2131231338(0x7f08026a, float:1.8078754E38)
            r1.setImageResource(r4)
            androidx.appcompat.widget.AppCompatTextView r1 = r13.I
            if (r1 != 0) goto L_0x013f
            cm.l.v(r8)
            r1 = r2
        L_0x013f:
            ld.c r4 = r13.j1()
            r6 = 2132019300(0x7f140864, float:1.967693E38)
            java.lang.String r6 = r13.getString(r6)
            java.lang.String r7 = "title_challan_trans_pending"
            java.lang.String r4 = r4.b(r7, r6)
            r1.setText(r4)
            androidx.appcompat.widget.AppCompatTextView r1 = r13.I
            if (r1 != 0) goto L_0x015b
            cm.l.v(r8)
            r1 = r2
        L_0x015b:
            r4 = 2131099703(0x7f060037, float:1.7811767E38)
            int r4 = androidx.core.content.a.c(r13, r4)
            r1.setTextColor(r4)
            com.nic.mparivahan.MyTextView r1 = r13.M
            if (r1 != 0) goto L_0x016d
            cm.l.v(r12)
            r1 = r2
        L_0x016d:
            ld.c r4 = r13.j1()
            java.lang.String r3 = r4.b(r5, r3)
        L_0x0175:
            r1.setText(r3)
            goto L_0x026d
        L_0x017a:
            java.lang.String r1 = r13.R
            java.lang.String r3 = "Failed"
            boolean r1 = km.p.o(r1, r3, r4)
            if (r1 == 0) goto L_0x026d
            androidx.appcompat.widget.AppCompatImageView r1 = r13.H
            if (r1 != 0) goto L_0x018c
            cm.l.v(r7)
            r1 = r2
        L_0x018c:
            r3 = 2131231382(0x7f080296, float:1.8078843E38)
            r1.setImageResource(r3)
            androidx.appcompat.widget.AppCompatTextView r1 = r13.I
            if (r1 != 0) goto L_0x019a
            cm.l.v(r8)
            r1 = r2
        L_0x019a:
            ld.c r3 = r13.j1()
            r4 = 2132019297(0x7f140861, float:1.9676925E38)
            java.lang.String r4 = r13.getString(r4)
            java.lang.String r5 = "title_challan_trans_failed"
            java.lang.String r3 = r3.b(r5, r4)
            r1.setText(r3)
            androidx.appcompat.widget.AppCompatTextView r1 = r13.I
            if (r1 != 0) goto L_0x01b6
            cm.l.v(r8)
            r1 = r2
        L_0x01b6:
            r3 = 2131100500(0x7f060354, float:1.7813383E38)
            int r3 = androidx.core.content.a.c(r13, r3)
            r1.setTextColor(r3)
            com.nic.mparivahan.MyTextView r1 = r13.M
            if (r1 != 0) goto L_0x01c8
            cm.l.v(r12)
            r1 = r2
        L_0x01c8:
            ld.c r3 = r13.j1()
            r4 = 2132018670(0x7f1405ee, float:1.9675653E38)
            java.lang.String r4 = r13.getString(r4)
            java.lang.String r5 = "btn_try_again"
            java.lang.String r3 = r3.b(r5, r4)
            goto L_0x0175
        L_0x01da:
            androidx.appcompat.widget.AppCompatImageView r1 = r13.H
            if (r1 != 0) goto L_0x01e2
            cm.l.v(r7)
            r1 = r2
        L_0x01e2:
            r4 = 2131231561(0x7f080349, float:1.8079206E38)
            r1.setImageResource(r4)
            androidx.appcompat.widget.AppCompatTextView r1 = r13.I
            if (r1 != 0) goto L_0x01f0
            cm.l.v(r8)
            r1 = r2
        L_0x01f0:
            ld.c r4 = r13.j1()
            r7 = 2132019303(0x7f140867, float:1.9676937E38)
            java.lang.String r7 = r13.getString(r7)
            java.lang.String r9 = "title_challan_trans_success"
            java.lang.String r4 = r4.b(r9, r7)
            r1.setText(r4)
            androidx.appcompat.widget.AppCompatTextView r1 = r13.I
            if (r1 != 0) goto L_0x020c
            cm.l.v(r8)
            r1 = r2
        L_0x020c:
            r4 = 2131099810(0x7f0600a2, float:1.7811984E38)
            int r4 = androidx.core.content.a.c(r13, r4)
            r1.setTextColor(r4)
            java.lang.String r1 = r13.S
            boolean r1 = com.nic.mparivahan.dlservices.utilities.d.d(r1)
            if (r1 == 0) goto L_0x023b
            com.nic.mparivahan.MyTextView r1 = r13.M
            if (r1 != 0) goto L_0x0226
            cm.l.v(r12)
            r1 = r2
        L_0x0226:
            ld.c r3 = r13.j1()
            r4 = 2132018855(0x7f1406a7, float:1.9676028E38)
            java.lang.String r4 = r13.getString(r4)
            java.lang.String r5 = "label_challan_print_receipt"
            java.lang.String r3 = r3.b(r5, r4)
        L_0x0237:
            r1.setText(r3)
            goto L_0x024c
        L_0x023b:
            com.nic.mparivahan.MyTextView r1 = r13.M
            if (r1 != 0) goto L_0x0243
            cm.l.v(r12)
            r1 = r2
        L_0x0243:
            ld.c r4 = r13.j1()
            java.lang.String r3 = r4.b(r5, r3)
            goto L_0x0237
        L_0x024c:
            java.lang.String r1 = "Disposed"
            r13.i1(r1)     // Catch:{ Exception -> 0x0269 }
            com.nic.mparivahan.Echallan.echallanLog.UpdateLog$a r3 = com.nic.mparivahan.Echallan.echallanLog.UpdateLog.f8910k     // Catch:{ Exception -> 0x0269 }
            java.lang.String r5 = r13.R     // Catch:{ Exception -> 0x0269 }
            cm.l.c(r6)     // Catch:{ Exception -> 0x0269 }
            java.lang.String r7 = r13.V     // Catch:{ Exception -> 0x0269 }
            java.lang.String r8 = r13.Q     // Catch:{ Exception -> 0x0269 }
            java.lang.String r9 = r13.O     // Catch:{ Exception -> 0x0269 }
            java.lang.String r1 = r13.T     // Catch:{ Exception -> 0x0269 }
            double r10 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x0269 }
            r4 = r13
            r3.a(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0269 }
            goto L_0x026d
        L_0x0269:
            r1 = move-exception
            r1.printStackTrace()
        L_0x026d:
            java.lang.String r1 = r13.O
            int r1 = r1.length()
            java.lang.String r3 = "challanNoValueTv"
            if (r1 <= 0) goto L_0x0285
            androidx.appcompat.widget.AppCompatTextView r1 = r13.J
            if (r1 != 0) goto L_0x027f
            cm.l.v(r3)
            r1 = r2
        L_0x027f:
            java.lang.String r3 = r13.O
            r1.setText(r3)
            goto L_0x0290
        L_0x0285:
            androidx.appcompat.widget.AppCompatTextView r1 = r13.J
            if (r1 != 0) goto L_0x028d
            cm.l.v(r3)
            r1 = r2
        L_0x028d:
            r1.setText(r0)
        L_0x0290:
            java.lang.String r1 = r13.P
            int r1 = r1.length()
            java.lang.String r3 = "vehcileNoValueTv"
            if (r1 <= 0) goto L_0x02a8
            androidx.appcompat.widget.AppCompatTextView r1 = r13.L
            if (r1 != 0) goto L_0x02a2
            cm.l.v(r3)
            r1 = r2
        L_0x02a2:
            java.lang.String r3 = r13.P
            r1.setText(r3)
            goto L_0x02b3
        L_0x02a8:
            androidx.appcompat.widget.AppCompatTextView r1 = r13.L
            if (r1 != 0) goto L_0x02b0
            cm.l.v(r3)
            r1 = r2
        L_0x02b0:
            r1.setText(r0)
        L_0x02b3:
            java.lang.String r1 = r13.T
            int r1 = r1.length()
            java.lang.String r3 = "amountValueTv"
            if (r1 <= 0) goto L_0x02cb
            androidx.appcompat.widget.AppCompatTextView r0 = r13.K
            if (r0 != 0) goto L_0x02c5
            cm.l.v(r3)
            r0 = r2
        L_0x02c5:
            java.lang.String r1 = r13.T
            r0.setText(r1)
            goto L_0x02d6
        L_0x02cb:
            androidx.appcompat.widget.AppCompatTextView r1 = r13.K
            if (r1 != 0) goto L_0x02d3
            cm.l.v(r3)
            r1 = r2
        L_0x02d3:
            r1.setText(r0)
        L_0x02d6:
            com.nic.mparivahan.MyTextView r0 = r13.M
            if (r0 != 0) goto L_0x02de
            cm.l.v(r12)
            goto L_0x02df
        L_0x02de:
            r2 = r0
        L_0x02df:
            cb.b1 r0 = new cb.b1
            r0.<init>(r13)
            r2.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.ResponsePaymentActivity.k1():void");
    }

    /* access modifiers changed from: private */
    public static final void l1(ResponsePaymentActivity responsePaymentActivity, View view) {
        l.f(responsePaymentActivity, "this$0");
        responsePaymentActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void m1(ResponsePaymentActivity responsePaymentActivity, View view) {
        l.f(responsePaymentActivity, "this$0");
        responsePaymentActivity.o1();
    }

    /* access modifiers changed from: private */
    public static final void n1(ResponsePaymentActivity responsePaymentActivity, View view) {
        Intent intent;
        l.f(responsePaymentActivity, "this$0");
        Class<PaymentSearchChallan> cls = PaymentSearchChallan.class;
        Class<VerifyPaymentChallan> cls2 = VerifyPaymentChallan.class;
        if (!l.a(responsePaymentActivity.R, "Cash") && !l.a(responsePaymentActivity.R, "Success")) {
            intent = (!com.nic.mparivahan.dlservices.utilities.d.d(responsePaymentActivity.f8813c0) || !responsePaymentActivity.f8813c0.equals("verifyPayment")) ? new Intent(responsePaymentActivity, cls) : new Intent(responsePaymentActivity, cls2);
        } else if (responsePaymentActivity.S.length() > 0) {
            Intent intent2 = new Intent(responsePaymentActivity, PrintChallanWebView.class);
            intent2.putExtra("challanPdfUrl", responsePaymentActivity.S);
            intent2.putExtra("challanNo", responsePaymentActivity.O);
            intent2.putExtra("fromActivity", "byPassPayment");
            responsePaymentActivity.startActivity(intent2);
            return;
        } else {
            intent = (!com.nic.mparivahan.dlservices.utilities.d.d(responsePaymentActivity.f8813c0) || !responsePaymentActivity.f8813c0.equals("verifyPayment")) ? new Intent(responsePaymentActivity, cls) : new Intent(responsePaymentActivity, cls2);
        }
        intent.setFlags(67108864);
        responsePaymentActivity.startActivity(intent);
        responsePaymentActivity.finish();
    }

    private final void o1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final c j1() {
        c cVar = this.f8812b0;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, PaymentSearchChallan.class);
        intent.setFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v9 c10 = v9.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.f8814d0 = c10;
        v9 v9Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        a.C0148a aVar = a.f11584a;
        v9 v9Var2 = this.f8814d0;
        if (v9Var2 == null) {
            l.v("binding");
        } else {
            v9Var = v9Var2;
        }
        aVar.e(this, v9Var);
        p1(new c(this));
        String stringExtra = getIntent().getStringExtra("challanNo");
        l.c(stringExtra);
        this.O = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("vehicleNo");
        l.c(stringExtra2);
        this.P = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("transactionId");
        l.c(stringExtra3);
        this.Q = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("status");
        l.c(stringExtra4);
        this.R = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("challanPdfUrl");
        l.c(stringExtra5);
        this.S = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("amount");
        l.c(stringExtra6);
        this.T = stringExtra6;
        if (getIntent().hasExtra("paymentDate")) {
            String stringExtra7 = getIntent().getStringExtra("paymentDate");
            l.c(stringExtra7);
            this.U = stringExtra7;
        }
        if (getIntent().hasExtra("receiptNo")) {
            String stringExtra8 = getIntent().getStringExtra("receiptNo");
            l.c(stringExtra8);
            this.V = stringExtra8;
        }
        if (getIntent().hasExtra("dptCd")) {
            String stringExtra9 = getIntent().getStringExtra("dptCd");
            l.c(stringExtra9);
            this.W = stringExtra9;
        }
        if (getIntent().hasExtra("rtoCd")) {
            String stringExtra10 = getIntent().getStringExtra("rtoCd");
            l.c(stringExtra10);
            this.X = stringExtra10;
        }
        if (getIntent().hasExtra("challanDate")) {
            String stringExtra11 = getIntent().getStringExtra("challanDate");
            l.c(stringExtra11);
            this.Y = stringExtra11;
        }
        if (getIntent().hasExtra("stateCd")) {
            String stringExtra12 = getIntent().getStringExtra("stateCd");
            l.c(stringExtra12);
            this.Z = stringExtra12;
        }
        if (getIntent().hasExtra("searchType")) {
            String stringExtra13 = getIntent().getStringExtra("searchType");
            l.c(stringExtra13);
            this.f8811a0 = stringExtra13;
        }
        if (getIntent().hasExtra("paymentType")) {
            String stringExtra14 = getIntent().getStringExtra("paymentType");
            l.c(stringExtra14);
            this.f8815e0 = stringExtra14;
        }
        if (getIntent().hasExtra("fromActivity")) {
            String stringExtra15 = getIntent().getStringExtra("fromActivity");
            l.c(stringExtra15);
            this.f8813c0 = stringExtra15;
        }
        k1();
    }

    public final void p1(c cVar) {
        l.f(cVar, "<set-?>");
        this.f8812b0 = cVar;
    }
}
