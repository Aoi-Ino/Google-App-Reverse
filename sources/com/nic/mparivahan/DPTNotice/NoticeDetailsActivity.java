package com.nic.mparivahan.DPTNotice;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel;
import com.nic.mparivahan.DPTNotice.DataClass.DTPVerifyPaymentModal;
import com.nic.mparivahan.DPTNotice.Services.NoticeService;
import com.nic.mparivahan.Echallan.DTPNoticeVerifyWebView;
import com.nic.mparivahan.R;
import fa.f;
import fa.g;
import fa.i;
import fa.j;
import java.util.HashMap;
import ni.v6;
import pl.x;

public final class NoticeDetailsActivity extends d {
    private v6 G;
    public ld.c H;
    private String I = "";
    private DPTNoticeDataModel J;
    private HashMap K = new HashMap();
    private NoticeService L;
    private ga.c M;
    /* access modifiers changed from: private */
    public ProgressDialog N;
    /* access modifiers changed from: private */
    public String O = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NoticeDetailsActivity f8356e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(NoticeDetailsActivity noticeDetailsActivity) {
            super(1);
            this.f8356e = noticeDetailsActivity;
        }

        public final void b(DTPVerifyPaymentModal dTPVerifyPaymentModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog k12 = this.f8356e.N;
                if (k12 == null) {
                    cm.l.v("dialog");
                    k12 = null;
                }
                if (k12.isShowing()) {
                    ProgressDialog k13 = this.f8356e.N;
                    if (k13 == null) {
                        cm.l.v("dialog");
                        k13 = null;
                    }
                    k13.dismiss();
                }
                if (p.o(dTPVerifyPaymentModal.getStatus(), "200", true)) {
                    Intent intent = new Intent(this.f8356e, DTPNoticeVerifyWebView.class);
                    intent.putExtra("pgiUrl", dTPVerifyPaymentModal.getPgiUrl());
                    intent.putExtra("fromActivity", "noticeDetails");
                    intent.putExtra("searchType", this.f8356e.O);
                    this.f8356e.startActivity(intent);
                    this.f8356e.finish();
                } else if (p.o(dTPVerifyPaymentModal.getStatus(), "204", true)) {
                    NoticeDetailsActivity noticeDetailsActivity = this.f8356e;
                    noticeDetailsActivity.w1(noticeDetailsActivity, dTPVerifyPaymentModal.getMessage());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressDialog k14 = this.f8356e.N;
                if (k14 == null) {
                    cm.l.v("dialog");
                    k14 = null;
                }
                if (k14.isShowing()) {
                    ProgressDialog k15 = this.f8356e.N;
                    if (k15 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = k15;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DTPVerifyPaymentModal) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NoticeDetailsActivity f8357e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(NoticeDetailsActivity noticeDetailsActivity) {
            super(1);
            this.f8357e = noticeDetailsActivity;
        }

        public final void b(String str) {
            ProgressDialog k12 = this.f8357e.N;
            ProgressDialog progressDialog = null;
            if (k12 == null) {
                cm.l.v("dialog");
                k12 = null;
            }
            if (k12.isShowing()) {
                ProgressDialog k13 = this.f8357e.N;
                if (k13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = k13;
                }
                progressDialog.dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8358a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f8358a = lVar;
        }

        public final pl.c a() {
            return this.f8358a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8358a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return cm.l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    private final void n1() {
        try {
            ProgressDialog progressDialog = this.N;
            ga.c cVar = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            ga.c cVar2 = this.M;
            if (cVar2 == null) {
                cm.l.v("viewModel");
            } else {
                cVar = cVar2;
            }
            DPTNoticeDataModel dPTNoticeDataModel = this.J;
            cm.l.c(dPTNoticeDataModel);
            cVar.m(String.valueOf(dPTNoticeDataModel.getChallan_no()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void o1(Context context, String str, int i10) {
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_echallan_msg_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.process);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById4 = dialog.findViewById(R.id.close);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.btnHolderLl);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.titleTv);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById6).setText(r1().b("nex_parivahan", getString(R.string.app_name)));
        ((TextView) findViewById3).setText(str);
        textView3.setText(r1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        textView3.setOnClickListener(new j(dialog, i10, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void p1(Dialog dialog, int i10, NoticeDetailsActivity noticeDetailsActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(noticeDetailsActivity, "this$0");
        dialog.dismiss();
        if (i10 == 1) {
            noticeDetailsActivity.n1();
        }
    }

    private final void q1() {
        this.K.put("AN", "Andaman and Nicobar Islands");
        this.K.put("AP", "Andhra Pradesh");
        this.K.put("AR", "Arunachal Pradesh");
        this.K.put("AS", "Assam");
        this.K.put("BR", "Bihar");
        this.K.put("CG", "Chandigarh");
        this.K.put("CH", "Chandigarh");
        this.K.put("DH", "Dadra and Nagar Haveli");
        this.K.put("DD", "Daman and Diu");
        this.K.put("DL", "Delhi");
        this.K.put("GA", "Goa");
        this.K.put("GJ", "Gujarat");
        this.K.put("HR", "Haryana");
        this.K.put("HP", "Himachal Pradesh");
        this.K.put("JK", "Jammu and Kashmir");
        this.K.put("JH", "Jharkhand");
        this.K.put("KA", "Karnataka");
        this.K.put("KL", "Kerala");
        this.K.put("LD", "Lakshadweep");
        this.K.put("MP", "Madhya Pradesh");
        this.K.put("MH", "Maharashtra");
        this.K.put("MN", "Manipur");
        this.K.put("ML", "Meghalaya");
        this.K.put("MZ", "Mizoram");
        this.K.put("NL", "Nagaland");
        this.K.put("OR", "Odisha");
        this.K.put("PY", "Puducherry");
        this.K.put("PB", "Punjab");
        this.K.put("RJ", "Rajasthan");
        this.K.put("SK", "Sikkim");
        this.K.put("TN", "Tamil Nadu");
        this.K.put("TS", "Telangana");
        this.K.put("TR", "Tripura");
        this.K.put("UK", "Uttarakhand");
        this.K.put("UP", "Uttar Pradesh");
        this.K.put("WB", "West Bengal");
    }

    private final void s1() {
        AppCompatTextView appCompatTextView;
        String b10;
        v6 v6Var = this.G;
        v6 v6Var2 = null;
        if (v6Var == null) {
            cm.l.v("binding");
            v6Var = null;
        }
        v6Var.D.f28305f.setOnClickListener(new g(this));
        NoticeService noticeService = this.L;
        if (noticeService == null) {
            cm.l.v("retrofitService");
            noticeService = null;
        }
        this.M = (ga.c) new u0((x0) this, (u0.b) new ga.b(new ga.a(noticeService))).a(ga.c.class);
        v6 v6Var3 = this.G;
        if (v6Var3 == null) {
            cm.l.v("binding");
            v6Var3 = null;
        }
        v6Var3.f28997l.setOnClickListener(new fa.h(this));
        if (com.nic.mparivahan.dlservices.utilities.d.d(this.O) && cm.l.a(this.O, "Notice Status")) {
            v6 v6Var4 = this.G;
            if (v6Var4 == null) {
                cm.l.v("binding");
                v6Var4 = null;
            }
            v6Var4.f29002q.setVisibility(4);
        }
        v6 v6Var5 = this.G;
        if (v6Var5 == null) {
            cm.l.v("binding");
            v6Var5 = null;
        }
        v6Var5.f29002q.setOnClickListener(new i(this));
        try {
            DPTNoticeDataModel dPTNoticeDataModel = this.J;
            cm.l.c(dPTNoticeDataModel);
            if (com.nic.mparivahan.dlservices.utilities.d.d(dPTNoticeDataModel.getOwner_name())) {
                v6 v6Var6 = this.G;
                if (v6Var6 == null) {
                    cm.l.v("binding");
                    v6Var6 = null;
                }
                AppCompatTextView appCompatTextView2 = v6Var6.f29001p;
                DPTNoticeDataModel dPTNoticeDataModel2 = this.J;
                cm.l.c(dPTNoticeDataModel2);
                appCompatTextView2.setText(dPTNoticeDataModel2.getOwner_name());
            }
            DPTNoticeDataModel dPTNoticeDataModel3 = this.J;
            cm.l.c(dPTNoticeDataModel3);
            if (com.nic.mparivahan.dlservices.utilities.d.d(dPTNoticeDataModel3.getDoc_no())) {
                v6 v6Var7 = this.G;
                if (v6Var7 == null) {
                    cm.l.v("binding");
                    v6Var7 = null;
                }
                AppCompatTextView appCompatTextView3 = v6Var7.f28996k;
                DPTNoticeDataModel dPTNoticeDataModel4 = this.J;
                cm.l.c(dPTNoticeDataModel4);
                appCompatTextView3.setText(dPTNoticeDataModel4.getDoc_no());
            }
            v6 v6Var8 = this.G;
            if (v6Var8 == null) {
                cm.l.v("binding");
                v6Var8 = null;
            }
            AppCompatTextView appCompatTextView4 = v6Var8.f28994i;
            DPTNoticeDataModel dPTNoticeDataModel5 = this.J;
            cm.l.c(dPTNoticeDataModel5);
            appCompatTextView4.setText(String.valueOf(dPTNoticeDataModel5.getChallan_no()));
            DPTNoticeDataModel dPTNoticeDataModel6 = this.J;
            cm.l.c(dPTNoticeDataModel6);
            if (com.nic.mparivahan.dlservices.utilities.d.d(dPTNoticeDataModel6.getDate_time())) {
                v6 v6Var9 = this.G;
                if (v6Var9 == null) {
                    cm.l.v("binding");
                    v6Var9 = null;
                }
                AppCompatTextView appCompatTextView5 = v6Var9.f28990e;
                DPTNoticeDataModel dPTNoticeDataModel7 = this.J;
                cm.l.c(dPTNoticeDataModel7);
                appCompatTextView5.setText(dPTNoticeDataModel7.getDate_time());
            }
            DPTNoticeDataModel dPTNoticeDataModel8 = this.J;
            cm.l.c(dPTNoticeDataModel8);
            if (com.nic.mparivahan.dlservices.utilities.d.d(dPTNoticeDataModel8.getStatus())) {
                v6 v6Var10 = this.G;
                if (v6Var10 == null) {
                    cm.l.v("binding");
                    v6Var10 = null;
                }
                AppCompatTextView appCompatTextView6 = v6Var10.f29008w;
                DPTNoticeDataModel dPTNoticeDataModel9 = this.J;
                cm.l.c(dPTNoticeDataModel9);
                appCompatTextView6.setText(dPTNoticeDataModel9.getStatus());
            }
            v6 v6Var11 = this.G;
            if (v6Var11 == null) {
                cm.l.v("binding");
                v6Var11 = null;
            }
            AppCompatTextView appCompatTextView7 = v6Var11.f28988c;
            DPTNoticeDataModel dPTNoticeDataModel10 = this.J;
            cm.l.c(dPTNoticeDataModel10);
            appCompatTextView7.setText(String.valueOf(dPTNoticeDataModel10.getAmount()));
            DPTNoticeDataModel dPTNoticeDataModel11 = this.J;
            cm.l.c(dPTNoticeDataModel11);
            if (com.nic.mparivahan.dlservices.utilities.d.d(dPTNoticeDataModel11.getOffence_name())) {
                v6 v6Var12 = this.G;
                if (v6Var12 == null) {
                    cm.l.v("binding");
                    v6Var12 = null;
                }
                AppCompatTextView appCompatTextView8 = v6Var12.f28999n;
                DPTNoticeDataModel dPTNoticeDataModel12 = this.J;
                cm.l.c(dPTNoticeDataModel12);
                appCompatTextView8.setText(dPTNoticeDataModel12.getOffence_name());
            }
            DPTNoticeDataModel dPTNoticeDataModel13 = this.J;
            cm.l.c(dPTNoticeDataModel13);
            if (com.nic.mparivahan.dlservices.utilities.d.d(Integer.valueOf(dPTNoticeDataModel13.getPayment_eligible()))) {
                DPTNoticeDataModel dPTNoticeDataModel14 = this.J;
                cm.l.c(dPTNoticeDataModel14);
                int payment_eligible = dPTNoticeDataModel14.getPayment_eligible();
                if (payment_eligible == 0) {
                    v6 v6Var13 = this.G;
                    if (v6Var13 == null) {
                        cm.l.v("binding");
                        v6Var13 = null;
                    }
                    appCompatTextView = v6Var13.f29002q;
                    b10 = r1().b("label_challan_verify_payment", getString(R.string.verify_payment));
                } else if (payment_eligible == 1) {
                    v6 v6Var14 = this.G;
                    if (v6Var14 == null) {
                        cm.l.v("binding");
                        v6Var14 = null;
                    }
                    appCompatTextView = v6Var14.f29002q;
                    b10 = r1().b("label_challan_pay_now", getString(R.string.pay_now));
                } else if (payment_eligible == 2) {
                    v6 v6Var15 = this.G;
                    if (v6Var15 == null) {
                        cm.l.v("binding");
                        v6Var15 = null;
                    }
                    appCompatTextView = v6Var15.f29002q;
                    b10 = r1().b("label_challan_pay_status", getString(R.string.status));
                }
                appCompatTextView.setText(b10);
            } else {
                v6 v6Var16 = this.G;
                if (v6Var16 == null) {
                    cm.l.v("binding");
                    v6Var16 = null;
                }
                v6Var16.f29002q.setVisibility(4);
            }
            DPTNoticeDataModel dPTNoticeDataModel15 = this.J;
            cm.l.c(dPTNoticeDataModel15);
            if (com.nic.mparivahan.dlservices.utilities.d.d(dPTNoticeDataModel15.getPdf_url())) {
                v6 v6Var17 = this.G;
                if (v6Var17 == null) {
                    cm.l.v("binding");
                    v6Var17 = null;
                }
                v6Var17.f28997l.setVisibility(0);
            } else {
                v6 v6Var18 = this.G;
                if (v6Var18 == null) {
                    cm.l.v("binding");
                    v6Var18 = null;
                }
                v6Var18.f28997l.setVisibility(8);
            }
            DPTNoticeDataModel dPTNoticeDataModel16 = this.J;
            cm.l.c(dPTNoticeDataModel16);
            if (dPTNoticeDataModel16.getState_cd().length() > 0) {
                for (Object next : this.K.keySet()) {
                    cm.l.e(next, "next(...)");
                    String str = (String) next;
                    String str2 = (String) this.K.get(str);
                    DPTNoticeDataModel dPTNoticeDataModel17 = this.J;
                    cm.l.c(dPTNoticeDataModel17);
                    if (cm.l.a(str, dPTNoticeDataModel17.getState_cd())) {
                        v6 v6Var19 = this.G;
                        if (v6Var19 == null) {
                            cm.l.v("binding");
                        } else {
                            v6Var2 = v6Var19;
                        }
                        v6Var2.B.setText(str2);
                        return;
                    }
                    v6 v6Var20 = this.G;
                    if (v6Var20 == null) {
                        cm.l.v("binding");
                        v6Var20 = null;
                    }
                    AppCompatTextView appCompatTextView9 = v6Var20.B;
                    DPTNoticeDataModel dPTNoticeDataModel18 = this.J;
                    cm.l.c(dPTNoticeDataModel18);
                    appCompatTextView9.setText(dPTNoticeDataModel18.getState_cd());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void t1(NoticeDetailsActivity noticeDetailsActivity, View view) {
        cm.l.f(noticeDetailsActivity, "this$0");
        noticeDetailsActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void u1(NoticeDetailsActivity noticeDetailsActivity, View view) {
        cm.l.f(noticeDetailsActivity, "this$0");
        Intent intent = new Intent(noticeDetailsActivity, DownloadNoticeActivity.class);
        DPTNoticeDataModel dPTNoticeDataModel = noticeDetailsActivity.J;
        String str = null;
        intent.putExtra("challanPdfUrl", dPTNoticeDataModel != null ? dPTNoticeDataModel.getPdf_url() : null);
        DPTNoticeDataModel dPTNoticeDataModel2 = noticeDetailsActivity.J;
        if (dPTNoticeDataModel2 != null) {
            str = dPTNoticeDataModel2.getDoc_no();
        }
        intent.putExtra("challanNo", str);
        intent.putExtra("fromActivity", "noticeDetailsActivity");
        noticeDetailsActivity.startActivity(intent);
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Integer] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v1(com.nic.mparivahan.DPTNotice.NoticeDetailsActivity r3, android.view.View r4) {
        /*
            java.lang.String r4 = "this$0"
            cm.l.f(r3, r4)
            com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel r4 = r3.J
            cm.l.c(r4)
            int r4 = r4.getPayment_eligible()
            r0 = 1
            if (r4 == 0) goto L_0x0075
            if (r4 == r0) goto L_0x005f
            r1 = 2
            if (r4 == r1) goto L_0x0018
            goto L_0x0089
        L_0x0018:
            com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel r4 = r3.J
            r1 = 0
            if (r4 == 0) goto L_0x003f
            int r4 = r4.getVcourt_eligible()
            if (r4 != r0) goto L_0x003f
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.DPTNotice.NoticeVirtualCourtActivity> r0 = com.nic.mparivahan.DPTNotice.NoticeVirtualCourtActivity.class
            r4.<init>(r3, r0)
            com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel r0 = r3.J
            if (r0 == 0) goto L_0x0036
            int r0 = r0.getChallan_no()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0036:
            java.lang.String r0 = "challanNo"
            r4.putExtra(r0, r1)
        L_0x003b:
            r3.startActivity(r4)
            goto L_0x0089
        L_0x003f:
            com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel r4 = r3.J
            if (r4 == 0) goto L_0x0048
            java.lang.String r4 = r4.getStatus_txt()
            goto L_0x0049
        L_0x0048:
            r4 = r1
        L_0x0049:
            cm.l.c(r4)
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0089
            com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel r4 = r3.J
            if (r4 == 0) goto L_0x005a
            java.lang.String r1 = r4.getStatus_txt()
        L_0x005a:
            r4 = 0
            r3.o1(r3, r1, r4)
            goto L_0x0089
        L_0x005f:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.Echallan.DTPNoticePaymentWebView> r0 = com.nic.mparivahan.Echallan.DTPNoticePaymentWebView.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "selectedData"
            com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel r1 = r3.J
            r4.putExtra(r0, r1)
            java.lang.String r0 = "type"
            java.lang.String r1 = r3.I
            r4.putExtra(r0, r1)
            goto L_0x003b
        L_0x0075:
            ld.c r4 = r3.r1()
            r1 = 2132018671(0x7f1405ef, float:1.9675655E38)
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r2 = "label_challan_payment_verification"
            java.lang.String r4 = r4.b(r2, r1)
            r3.o1(r3, r4, r0)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DPTNotice.NoticeDetailsActivity.v1(com.nic.mparivahan.DPTNotice.NoticeDetailsActivity, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public final void w1(Context context, String str) {
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_echallan_msg_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        textView.setText(r1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        View findViewById3 = dialog.findViewById(R.id.titleTv);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(r1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new f(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void x1(Dialog dialog, NoticeDetailsActivity noticeDetailsActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(noticeDetailsActivity, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(noticeDetailsActivity, NoticeSearch.class);
        intent.addFlags(67108864);
        noticeDetailsActivity.startActivity(intent);
        noticeDetailsActivity.finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v6 c10 = v6.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        ga.c cVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        y1(new ld.c(this));
        this.J = (DPTNoticeDataModel) getIntent().getParcelableExtra("selectedData");
        String stringExtra = getIntent().getStringExtra("inputType");
        cm.l.c(stringExtra);
        this.I = stringExtra;
        this.L = NoticeService.f8372a.c(this);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.N = progressDialog;
        progressDialog.setMessage(r1().b("label_challan_getting_details", "Getting details..."));
        ProgressDialog progressDialog2 = this.N;
        if (progressDialog2 == null) {
            cm.l.v("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.N;
        if (progressDialog3 == null) {
            cm.l.v("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCancelable(false);
        q1();
        if (getIntent().hasExtra("serviceName")) {
            String stringExtra2 = getIntent().getStringExtra("serviceName");
            cm.l.c(stringExtra2);
            this.O = stringExtra2;
        }
        s1();
        ga.c cVar2 = this.M;
        if (cVar2 == null) {
            cm.l.v("viewModel");
            cVar2 = null;
        }
        cVar2.i().g(this, new c(new a(this)));
        ga.c cVar3 = this.M;
        if (cVar3 == null) {
            cm.l.v("viewModel");
        } else {
            cVar = cVar3;
        }
        cVar.g().g(this, new c(new b(this)));
    }

    public final ld.c r1() {
        ld.c cVar = this.H;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final void y1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.H = cVar;
    }
}
