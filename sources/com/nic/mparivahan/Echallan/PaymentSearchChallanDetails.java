package com.nic.mparivahan.Echallan;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cb.a0;
import cb.c0;
import cb.d0;
import cb.e0;
import cb.f0;
import cb.y;
import cb.z;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Echallan.EtransChallanPayment;
import com.nic.mparivahan.Echallan.Echallan.Model.PaymentEtransPgi;
import com.nic.mparivahan.Echallan.Echallan.Networking.StagingEchallanService;
import com.nic.mparivahan.Echallan.Model.SearchChallanResultModel;
import com.nic.mparivahan.Echallan.Model.VerifyPaymentModel;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.R;
import fb.a;
import java.util.HashMap;
import ld.g;
import ni.b7;
import pl.x;

public final class PaymentSearchChallanDetails extends androidx.appcompat.app.d {
    private AppCompatImageView G;
    private AppCompatImageView H;
    private AppCompatTextView I;
    private AppCompatTextView J;
    private AppCompatTextView K;
    private AppCompatTextView L;
    private AppCompatTextView M;
    private AppCompatTextView N;
    private AppCompatTextView O;
    private AppCompatTextView P;
    private AppCompatTextView Q;
    private AppCompatTextView R;
    /* access modifiers changed from: private */
    public ProgressBar S;
    private CheckedTextView T;
    private View U;
    private RelativeLayout V;
    private AppCompatTextView W;
    private CheckedTextView X;
    private LinearLayout Y;
    private AppCompatTextView Z;

    /* renamed from: a0  reason: collision with root package name */
    private RelativeLayout f8773a0;

    /* renamed from: b0  reason: collision with root package name */
    private SearchChallanResultModel f8774b0;

    /* renamed from: c0  reason: collision with root package name */
    private int f8775c0;

    /* renamed from: d0  reason: collision with root package name */
    private HashMap f8776d0 = new HashMap();

    /* renamed from: e0  reason: collision with root package name */
    private b7 f8777e0;
    /* access modifiers changed from: private */

    /* renamed from: f0  reason: collision with root package name */
    public String f8778f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    private SearchChallanService f8779g0;

    /* renamed from: h0  reason: collision with root package name */
    private jb.c f8780h0;

    /* renamed from: i0  reason: collision with root package name */
    private StagingEchallanService f8781i0;

    /* renamed from: j0  reason: collision with root package name */
    private jb.e f8782j0;

    /* renamed from: k0  reason: collision with root package name */
    public ld.c f8783k0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PaymentSearchChallanDetails f8784e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PaymentSearchChallanDetails paymentSearchChallanDetails) {
            super(1);
            this.f8784e = paymentSearchChallanDetails;
        }

        public final void b(VerifyPaymentModel verifyPaymentModel) {
            ProgressBar progressBar = null;
            try {
                ProgressBar o12 = this.f8784e.S;
                if (o12 == null) {
                    cm.l.v("progressBar");
                    o12 = null;
                }
                if (o12.getVisibility() == 0) {
                    ProgressBar o13 = this.f8784e.S;
                    if (o13 == null) {
                        cm.l.v("progressBar");
                        o13 = null;
                    }
                    o13.setVisibility(8);
                }
                if (p.o(verifyPaymentModel != null ? verifyPaymentModel.getStatus() : null, "200", true)) {
                    Intent intent = new Intent(this.f8784e, VerifyPendingChallanWebView.class);
                    intent.putExtra("pgiUrl", verifyPaymentModel.getPgiUrl());
                    intent.putExtra("fromActivity", "challanDetails");
                    this.f8784e.startActivity(intent);
                    this.f8784e.finish();
                    return;
                }
                if (p.o(verifyPaymentModel != null ? verifyPaymentModel.getStatus() : null, "204", true)) {
                    PaymentSearchChallanDetails paymentSearchChallanDetails = this.f8784e;
                    paymentSearchChallanDetails.G1(paymentSearchChallanDetails, verifyPaymentModel != null ? verifyPaymentModel.getMessage() : null);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressBar o14 = this.f8784e.S;
                if (o14 == null) {
                    cm.l.v("progressBar");
                    o14 = null;
                }
                if (o14.getVisibility() == 0) {
                    ProgressBar o15 = this.f8784e.S;
                    if (o15 == null) {
                        cm.l.v("progressBar");
                    } else {
                        progressBar = o15;
                    }
                    progressBar.setVisibility(8);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VerifyPaymentModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PaymentSearchChallanDetails f8785e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PaymentSearchChallanDetails paymentSearchChallanDetails) {
            super(1);
            this.f8785e = paymentSearchChallanDetails;
        }

        public final void b(String str) {
            ProgressBar o12 = this.f8785e.S;
            ProgressBar progressBar = null;
            if (o12 == null) {
                cm.l.v("progressBar");
                o12 = null;
            }
            if (o12.getVisibility() == 0) {
                ProgressBar o13 = this.f8785e.S;
                if (o13 == null) {
                    cm.l.v("progressBar");
                } else {
                    progressBar = o13;
                }
                progressBar.setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PaymentSearchChallanDetails f8786e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PaymentSearchChallanDetails paymentSearchChallanDetails) {
            super(1);
            this.f8786e = paymentSearchChallanDetails;
        }

        public final void b(PaymentEtransPgi paymentEtransPgi) {
            ProgressBar o12 = this.f8786e.S;
            ProgressBar progressBar = null;
            if (o12 == null) {
                cm.l.v("progressBar");
                o12 = null;
            }
            if (o12.getVisibility() == 0) {
                ProgressBar o13 = this.f8786e.S;
                if (o13 == null) {
                    cm.l.v("progressBar");
                } else {
                    progressBar = o13;
                }
                progressBar.setVisibility(8);
            }
            if (paymentEtransPgi.getStatus() != 200 || !cm.l.a(paymentEtransPgi.getType(), "eTransPgi")) {
                Toast.makeText(this.f8786e, paymentEtransPgi.getMessage(), 0).show();
                return;
            }
            Intent intent = new Intent(this.f8786e, EtransChallanPayment.class);
            intent.putExtra("requestUrl", paymentEtransPgi.getVurl());
            intent.putExtra("requestData", paymentEtransPgi.getVenData());
            intent.putExtra("selectedData", this.f8786e.x1());
            intent.putExtra("type", this.f8786e.f8778f0);
            intent.putExtra("paymentType", "eTrans");
            intent.putExtra("fromActivity", "challanDetails");
            this.f8786e.startActivity(intent);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((PaymentEtransPgi) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PaymentSearchChallanDetails f8787e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PaymentSearchChallanDetails paymentSearchChallanDetails) {
            super(1);
            this.f8787e = paymentSearchChallanDetails;
        }

        public final void b(String str) {
            ProgressBar o12 = this.f8787e.S;
            ProgressBar progressBar = null;
            if (o12 == null) {
                cm.l.v("progressBar");
                o12 = null;
            }
            if (o12.getVisibility() == 0) {
                ProgressBar o13 = this.f8787e.S;
                if (o13 == null) {
                    cm.l.v("progressBar");
                } else {
                    progressBar = o13;
                }
                progressBar.setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8788a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f8788a = lVar;
        }

        public final pl.c a() {
            return this.f8788a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8788a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void A1(PaymentSearchChallanDetails paymentSearchChallanDetails, View view) {
        cm.l.f(paymentSearchChallanDetails, "this$0");
        paymentSearchChallanDetails.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void B1(PaymentSearchChallanDetails paymentSearchChallanDetails, View view) {
        Intent intent;
        String str;
        String str2;
        cm.l.f(paymentSearchChallanDetails, "this$0");
        int i10 = paymentSearchChallanDetails.f8775c0;
        if (i10 != 0) {
            if (i10 == 1) {
                SearchChallanResultModel searchChallanResultModel = paymentSearchChallanDetails.f8774b0;
                if (searchChallanResultModel == null || searchChallanResultModel.getPaymentGateway() != 1) {
                    intent = new Intent(paymentSearchChallanDetails, ChallanPaymentWebView.class);
                    intent.putExtra("selectedData", paymentSearchChallanDetails.f8774b0);
                    intent.putExtra("type", paymentSearchChallanDetails.f8778f0);
                    str = "paymentType";
                    str2 = "pgi";
                } else {
                    paymentSearchChallanDetails.q1();
                    return;
                }
            } else if (i10 == 2) {
                SearchChallanResultModel searchChallanResultModel2 = paymentSearchChallanDetails.f8774b0;
                str2 = null;
                if (searchChallanResultModel2 == null || searchChallanResultModel2.getVcourt_eligible() != 1) {
                    SearchChallanResultModel searchChallanResultModel3 = paymentSearchChallanDetails.f8774b0;
                    String statusTxt = searchChallanResultModel3 != null ? searchChallanResultModel3.getStatusTxt() : null;
                    cm.l.c(statusTxt);
                    if (statusTxt.length() > 0) {
                        SearchChallanResultModel searchChallanResultModel4 = paymentSearchChallanDetails.f8774b0;
                        if (searchChallanResultModel4 != null) {
                            str2 = searchChallanResultModel4.getStatusTxt();
                        }
                        paymentSearchChallanDetails.t1(paymentSearchChallanDetails, str2, 0);
                        return;
                    }
                    return;
                }
                intent = new Intent(paymentSearchChallanDetails, EchallanVirtualCourtActivity.class);
                SearchChallanResultModel searchChallanResultModel5 = paymentSearchChallanDetails.f8774b0;
                if (searchChallanResultModel5 != null) {
                    str2 = searchChallanResultModel5.getChallanNo();
                }
                str = "challanNo";
            } else {
                return;
            }
            intent.putExtra(str, str2);
            paymentSearchChallanDetails.startActivity(intent);
            return;
        }
        SearchChallanResultModel searchChallanResultModel6 = paymentSearchChallanDetails.f8774b0;
        if (searchChallanResultModel6 == null || searchChallanResultModel6.getPaymentGateway() != 1) {
            paymentSearchChallanDetails.t1(paymentSearchChallanDetails, paymentSearchChallanDetails.w1().b("label_challan_payment_verification", paymentSearchChallanDetails.getString(R.string.payment_verification_in_progress)), 1);
        } else {
            paymentSearchChallanDetails.r1();
        }
    }

    /* access modifiers changed from: private */
    public static final void C1(PaymentSearchChallanDetails paymentSearchChallanDetails, View view) {
        cm.l.f(paymentSearchChallanDetails, "this$0");
        Intent intent = new Intent(paymentSearchChallanDetails, PrintChallanWebView.class);
        SearchChallanResultModel searchChallanResultModel = paymentSearchChallanDetails.f8774b0;
        String str = null;
        intent.putExtra("challanPdfUrl", searchChallanResultModel != null ? searchChallanResultModel.getPdfUrl() : null);
        SearchChallanResultModel searchChallanResultModel2 = paymentSearchChallanDetails.f8774b0;
        if (searchChallanResultModel2 != null) {
            str = searchChallanResultModel2.getDocNo();
        }
        intent.putExtra("challanNo", str);
        intent.putExtra("fromActivity", "paymentSearchChallanDetails");
        paymentSearchChallanDetails.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void D1(PaymentSearchChallanDetails paymentSearchChallanDetails, View view) {
        cm.l.f(paymentSearchChallanDetails, "this$0");
        Intent intent = new Intent(paymentSearchChallanDetails, PrintChallanWebView.class);
        SearchChallanResultModel searchChallanResultModel = paymentSearchChallanDetails.f8774b0;
        String str = null;
        intent.putExtra("challanPdfUrl", searchChallanResultModel != null ? searchChallanResultModel.getPdfUrl() : null);
        SearchChallanResultModel searchChallanResultModel2 = paymentSearchChallanDetails.f8774b0;
        if (searchChallanResultModel2 != null) {
            str = searchChallanResultModel2.getDocNo();
        }
        intent.putExtra("challanNo", str);
        intent.putExtra("fromActivity", "paymentSearchChallanDetails");
        paymentSearchChallanDetails.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void E1(PaymentSearchChallanDetails paymentSearchChallanDetails, View view) {
        cm.l.f(paymentSearchChallanDetails, "this$0");
        Intent intent = new Intent(paymentSearchChallanDetails, PrintChallanWebView.class);
        SearchChallanResultModel searchChallanResultModel = paymentSearchChallanDetails.f8774b0;
        String str = null;
        intent.putExtra("challanPdfUrl", searchChallanResultModel != null ? searchChallanResultModel.getReceiptUrl() : null);
        SearchChallanResultModel searchChallanResultModel2 = paymentSearchChallanDetails.f8774b0;
        if (searchChallanResultModel2 != null) {
            str = searchChallanResultModel2.getDocNo();
        }
        intent.putExtra("challanNo", str);
        intent.putExtra("fromActivity", "paymentSearchChallanDetails");
        paymentSearchChallanDetails.startActivity(intent);
    }

    private final void F1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void G1(Context context, String str) {
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
        textView.setText(w1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        View findViewById3 = dialog.findViewById(R.id.titleTv);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(w1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new e0(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void H1(Dialog dialog, PaymentSearchChallanDetails paymentSearchChallanDetails, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(paymentSearchChallanDetails, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(paymentSearchChallanDetails, PaymentSearchChallan.class);
        intent.addFlags(67108864);
        paymentSearchChallanDetails.startActivity(intent);
        paymentSearchChallanDetails.finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c8, code lost:
        if (r0 == null) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ca, code lost:
        cm.l.v("paymentView");
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ce, code lost:
        r3 = androidx.core.content.a.c(r13, com.nic.mparivahan.R.color.geyser);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x021d, code lost:
        if (r0 == null) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x026a, code lost:
        if (r0 == null) goto L_0x01ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:170:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void J1(com.nic.mparivahan.Echallan.Model.SearchChallanResultModel r14) {
        /*
            r13 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            if (r14 == 0) goto L_0x0019
            java.lang.String r3 = r14.getOwnerName()
            if (r3 == 0) goto L_0x0019
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0013
            r3 = r0
            goto L_0x0014
        L_0x0013:
            r3 = r1
        L_0x0014:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x001a
        L_0x0019:
            r3 = r2
        L_0x001a:
            cm.l.c(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0034
            androidx.appcompat.widget.AppCompatTextView r3 = r13.I
            if (r3 != 0) goto L_0x002d
            java.lang.String r3 = "ownerName"
            cm.l.v(r3)
            r3 = r2
        L_0x002d:
            java.lang.String r4 = r14.getOwnerName()
            r3.setText(r4)
        L_0x0034:
            java.lang.String r3 = r14.getDocNo()
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x004f
            androidx.appcompat.widget.AppCompatTextView r3 = r13.J
            if (r3 != 0) goto L_0x0048
            java.lang.String r3 = "dlRcChallanNumber"
            cm.l.v(r3)
            r3 = r2
        L_0x0048:
            java.lang.String r4 = r14.getDocNo()
            r3.setText(r4)
        L_0x004f:
            java.lang.String r3 = r14.getChallanNo()
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x006a
            androidx.appcompat.widget.AppCompatTextView r3 = r13.L
            if (r3 != 0) goto L_0x0063
            java.lang.String r3 = "challanNo"
            cm.l.v(r3)
            r3 = r2
        L_0x0063:
            java.lang.String r4 = r14.getChallanNo()
            r3.setText(r4)
        L_0x006a:
            java.lang.String r3 = r14.getDateTime()
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x008b
            androidx.appcompat.widget.AppCompatTextView r3 = r13.M
            if (r3 != 0) goto L_0x007e
            java.lang.String r3 = "challanDate"
            cm.l.v(r3)
            r3 = r2
        L_0x007e:
            com.nic.mparivahan.Echallan.a$a r4 = com.nic.mparivahan.Echallan.a.f8906a
            java.lang.String r5 = r14.getDateTime()
            java.lang.String r4 = r4.a(r5)
            r3.setText(r4)
        L_0x008b:
            java.lang.String r3 = r14.getAmount()
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x00a6
            androidx.appcompat.widget.AppCompatTextView r3 = r13.N
            if (r3 != 0) goto L_0x009f
            java.lang.String r3 = "amount"
            cm.l.v(r3)
            r3 = r2
        L_0x009f:
            java.lang.String r4 = r14.getAmount()
            r3.setText(r4)
        L_0x00a6:
            java.lang.String r3 = r14.getChallanStatus()
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x00c1
            androidx.appcompat.widget.AppCompatTextView r3 = r13.O
            if (r3 != 0) goto L_0x00ba
            java.lang.String r3 = "paymentStatus"
            cm.l.v(r3)
            r3 = r2
        L_0x00ba:
            java.lang.String r4 = r14.getChallanStatus()
            r3.setText(r4)
        L_0x00c1:
            java.lang.String r3 = r14.getPaymentDate()
            int r3 = r3.length()
            java.lang.String r4 = "paymentDateRl"
            r5 = 8
            if (r3 <= 0) goto L_0x00f2
            android.widget.RelativeLayout r3 = r13.V
            if (r3 != 0) goto L_0x00d7
            cm.l.v(r4)
            r3 = r2
        L_0x00d7:
            r3.setVisibility(r1)
            androidx.appcompat.widget.AppCompatTextView r3 = r13.W
            if (r3 != 0) goto L_0x00e4
            java.lang.String r3 = "paymentDateValue"
            cm.l.v(r3)
            r3 = r2
        L_0x00e4:
            com.nic.mparivahan.Echallan.a$a r4 = com.nic.mparivahan.Echallan.a.f8906a
            java.lang.String r6 = r14.getPaymentDate()
            java.lang.String r4 = r4.a(r6)
            r3.setText(r4)
            goto L_0x00fd
        L_0x00f2:
            android.widget.RelativeLayout r3 = r13.V
            if (r3 != 0) goto L_0x00fa
            cm.l.v(r4)
            r3 = r2
        L_0x00fa:
            r3.setVisibility(r5)
        L_0x00fd:
            int r3 = r14.getPaymentEligible()
            r13.f8775c0 = r3
            int r3 = r14.getPaymentEligible()
            r4 = 2131099805(0x7f06009d, float:1.7811974E38)
            java.lang.String r6 = "paymentView"
            java.lang.String r7 = "paymentCb"
            java.lang.String r8 = "receiptCb"
            java.lang.String r9 = "challanPrint1Tv"
            java.lang.String r10 = "bottomBtnHolderLl"
            java.lang.String r11 = "payBtn"
            if (r3 == 0) goto L_0x0220
            if (r3 == r0) goto L_0x01d3
            r12 = 2
            if (r3 == r12) goto L_0x017e
            r4 = 3
            if (r3 == r4) goto L_0x0122
            goto L_0x026e
        L_0x0122:
            androidx.appcompat.widget.AppCompatTextView r3 = r13.P
            if (r3 != 0) goto L_0x012a
            cm.l.v(r11)
            r3 = r2
        L_0x012a:
            ld.c r4 = r13.w1()
            r11 = 2132018637(0x7f1405cd, float:1.9675586E38)
            java.lang.String r11 = r13.getString(r11)
            java.lang.String r12 = "label_challan_pay_paid"
            java.lang.String r4 = r4.b(r12, r11)
            r3.setText(r4)
            android.widget.LinearLayout r3 = r13.Y
            if (r3 != 0) goto L_0x0146
            cm.l.v(r10)
            r3 = r2
        L_0x0146:
            r3.setVisibility(r1)
            androidx.appcompat.widget.AppCompatTextView r3 = r13.Z
            if (r3 != 0) goto L_0x0151
            cm.l.v(r9)
            r3 = r2
        L_0x0151:
            r3.setVisibility(r5)
            android.widget.CheckedTextView r3 = r13.X
            if (r3 != 0) goto L_0x015c
            cm.l.v(r8)
            r3 = r2
        L_0x015c:
            r3.setChecked(r0)
            android.widget.CheckedTextView r3 = r13.T
            if (r3 != 0) goto L_0x0167
            cm.l.v(r7)
            r3 = r2
        L_0x0167:
            r3.setChecked(r0)
            android.view.View r0 = r13.U
            if (r0 != 0) goto L_0x0172
            cm.l.v(r6)
            r0 = r2
        L_0x0172:
            r3 = 2131099795(0x7f060093, float:1.7811953E38)
            int r3 = androidx.core.content.a.c(r13, r3)
        L_0x0179:
            r0.setBackgroundColor(r3)
            goto L_0x026e
        L_0x017e:
            androidx.appcompat.widget.AppCompatTextView r0 = r13.P
            if (r0 != 0) goto L_0x0186
            cm.l.v(r11)
            r0 = r2
        L_0x0186:
            ld.c r3 = r13.w1()
            r11 = 2132019169(0x7f1407e1, float:1.9676665E38)
            java.lang.String r11 = r13.getString(r11)
            java.lang.String r12 = "label_challan_pay_status"
            java.lang.String r3 = r3.b(r12, r11)
            r0.setText(r3)
            android.widget.LinearLayout r0 = r13.Y
            if (r0 != 0) goto L_0x01a2
            cm.l.v(r10)
            r0 = r2
        L_0x01a2:
            r0.setVisibility(r5)
            androidx.appcompat.widget.AppCompatTextView r0 = r13.Z
            if (r0 != 0) goto L_0x01ad
            cm.l.v(r9)
            r0 = r2
        L_0x01ad:
            r0.setVisibility(r1)
            android.widget.CheckedTextView r0 = r13.T
            if (r0 != 0) goto L_0x01b8
            cm.l.v(r7)
            r0 = r2
        L_0x01b8:
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r13.X
            if (r0 != 0) goto L_0x01c3
            cm.l.v(r8)
            r0 = r2
        L_0x01c3:
            r0.setChecked(r1)
            android.view.View r0 = r13.U
            if (r0 != 0) goto L_0x01ce
        L_0x01ca:
            cm.l.v(r6)
            r0 = r2
        L_0x01ce:
            int r3 = androidx.core.content.a.c(r13, r4)
            goto L_0x0179
        L_0x01d3:
            androidx.appcompat.widget.AppCompatTextView r0 = r13.P
            if (r0 != 0) goto L_0x01db
            cm.l.v(r11)
            r0 = r2
        L_0x01db:
            ld.c r3 = r13.w1()
            r11 = 2132018648(0x7f1405d8, float:1.9675609E38)
            java.lang.String r11 = r13.getString(r11)
            java.lang.String r12 = "label_challan_pay_now"
            java.lang.String r3 = r3.b(r12, r11)
            r0.setText(r3)
            android.widget.LinearLayout r0 = r13.Y
            if (r0 != 0) goto L_0x01f7
            cm.l.v(r10)
            r0 = r2
        L_0x01f7:
            r0.setVisibility(r5)
            androidx.appcompat.widget.AppCompatTextView r0 = r13.Z
            if (r0 != 0) goto L_0x0202
            cm.l.v(r9)
            r0 = r2
        L_0x0202:
            r0.setVisibility(r1)
            android.widget.CheckedTextView r0 = r13.T
            if (r0 != 0) goto L_0x020d
            cm.l.v(r7)
            r0 = r2
        L_0x020d:
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r13.X
            if (r0 != 0) goto L_0x0218
            cm.l.v(r8)
            r0 = r2
        L_0x0218:
            r0.setChecked(r1)
            android.view.View r0 = r13.U
            if (r0 != 0) goto L_0x01ce
            goto L_0x01ca
        L_0x0220:
            androidx.appcompat.widget.AppCompatTextView r0 = r13.P
            if (r0 != 0) goto L_0x0228
            cm.l.v(r11)
            r0 = r2
        L_0x0228:
            ld.c r3 = r13.w1()
            r11 = 2132019498(0x7f14092a, float:1.9677333E38)
            java.lang.String r11 = r13.getString(r11)
            java.lang.String r12 = "label_challan_verify_payment"
            java.lang.String r3 = r3.b(r12, r11)
            r0.setText(r3)
            android.widget.LinearLayout r0 = r13.Y
            if (r0 != 0) goto L_0x0244
            cm.l.v(r10)
            r0 = r2
        L_0x0244:
            r0.setVisibility(r5)
            androidx.appcompat.widget.AppCompatTextView r0 = r13.Z
            if (r0 != 0) goto L_0x024f
            cm.l.v(r9)
            r0 = r2
        L_0x024f:
            r0.setVisibility(r1)
            android.widget.CheckedTextView r0 = r13.T
            if (r0 != 0) goto L_0x025a
            cm.l.v(r7)
            r0 = r2
        L_0x025a:
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r13.X
            if (r0 != 0) goto L_0x0265
            cm.l.v(r8)
            r0 = r2
        L_0x0265:
            r0.setChecked(r1)
            android.view.View r0 = r13.U
            if (r0 != 0) goto L_0x01ce
            goto L_0x01ca
        L_0x026e:
            java.lang.String r0 = r14.getPdfUrl()
            int r0 = r0.length()
            java.lang.String r3 = "printChallan"
            if (r0 <= 0) goto L_0x0286
            androidx.appcompat.widget.AppCompatTextView r0 = r13.Q
            if (r0 != 0) goto L_0x0282
            cm.l.v(r3)
            r0 = r2
        L_0x0282:
            r0.setVisibility(r1)
            goto L_0x0291
        L_0x0286:
            androidx.appcompat.widget.AppCompatTextView r0 = r13.Q
            if (r0 != 0) goto L_0x028e
            cm.l.v(r3)
            r0 = r2
        L_0x028e:
            r0.setVisibility(r5)
        L_0x0291:
            java.lang.String r0 = r14.getStateCd()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x02e7
            java.util.HashMap r0 = r13.f8776d0
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x02a5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02e7
            java.lang.Object r1 = r0.next()
            java.lang.String r3 = "next(...)"
            cm.l.e(r1, r3)
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap r3 = r13.f8776d0
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r14.getStateCd()
            boolean r1 = cm.l.a(r1, r4)
            java.lang.String r4 = "stateName"
            if (r1 == 0) goto L_0x02d7
            androidx.appcompat.widget.AppCompatTextView r14 = r13.K
            if (r14 != 0) goto L_0x02d2
            cm.l.v(r4)
            goto L_0x02d3
        L_0x02d2:
            r2 = r14
        L_0x02d3:
            r2.setText(r3)
            return
        L_0x02d7:
            androidx.appcompat.widget.AppCompatTextView r1 = r13.K
            if (r1 != 0) goto L_0x02df
            cm.l.v(r4)
            r1 = r2
        L_0x02df:
            java.lang.String r3 = r14.getStateCd()
            r1.setText(r3)
            goto L_0x02a5
        L_0x02e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.PaymentSearchChallanDetails.J1(com.nic.mparivahan.Echallan.Model.SearchChallanResultModel):void");
    }

    private final void q1() {
        ProgressBar progressBar = null;
        try {
            g gVar = new g(this);
            ProgressBar progressBar2 = this.S;
            if (progressBar2 == null) {
                cm.l.v("progressBar");
                progressBar2 = null;
            }
            progressBar2.setVisibility(0);
            jb.c cVar = this.f8780h0;
            if (cVar == null) {
                cm.l.v("viewModel");
                cVar = null;
            }
            SearchChallanResultModel searchChallanResultModel = this.f8774b0;
            String challanNo = searchChallanResultModel != null ? searchChallanResultModel.getChallanNo() : null;
            cm.l.c(challanNo);
            cVar.q(challanNo, gVar.l());
        } catch (Exception e10) {
            e10.printStackTrace();
            ProgressBar progressBar3 = this.S;
            if (progressBar3 == null) {
                cm.l.v("progressBar");
            } else {
                progressBar = progressBar3;
            }
            progressBar.setVisibility(8);
        }
    }

    private final void r1() {
        jb.c cVar;
        ProgressBar progressBar = null;
        try {
            ProgressBar progressBar2 = this.S;
            if (progressBar2 == null) {
                cm.l.v("progressBar");
                progressBar2 = null;
            }
            progressBar2.setVisibility(0);
            jb.c cVar2 = this.f8780h0;
            if (cVar2 == null) {
                cm.l.v("viewModel");
                cVar = null;
            } else {
                cVar = cVar2;
            }
            SearchChallanResultModel searchChallanResultModel = this.f8774b0;
            cm.l.c(searchChallanResultModel);
            String challanNo = searchChallanResultModel.getChallanNo();
            SearchChallanResultModel searchChallanResultModel2 = this.f8774b0;
            cm.l.c(searchChallanResultModel2);
            String docNo = searchChallanResultModel2.getDocNo();
            SearchChallanResultModel searchChallanResultModel3 = this.f8774b0;
            cm.l.c(searchChallanResultModel3);
            String amount = searchChallanResultModel3.getAmount();
            SearchChallanResultModel searchChallanResultModel4 = this.f8774b0;
            cm.l.c(searchChallanResultModel4);
            String challanStatus = searchChallanResultModel4.getChallanStatus();
            SearchChallanResultModel searchChallanResultModel5 = this.f8774b0;
            cm.l.c(searchChallanResultModel5);
            cVar.x(challanNo, docNo, amount, challanStatus, searchChallanResultModel5.getStateCd());
        } catch (Exception e10) {
            e10.printStackTrace();
            ProgressBar progressBar3 = this.S;
            if (progressBar3 == null) {
                cm.l.v("progressBar");
            } else {
                progressBar = progressBar3;
            }
            progressBar.setVisibility(8);
        }
    }

    private final void s1() {
        jb.c cVar;
        ProgressBar progressBar = null;
        try {
            ProgressBar progressBar2 = this.S;
            if (progressBar2 == null) {
                cm.l.v("progressBar");
                progressBar2 = null;
            }
            progressBar2.setVisibility(0);
            jb.c cVar2 = this.f8780h0;
            if (cVar2 == null) {
                cm.l.v("viewModel");
                cVar = null;
            } else {
                cVar = cVar2;
            }
            SearchChallanResultModel searchChallanResultModel = this.f8774b0;
            cm.l.c(searchChallanResultModel);
            String challanNo = searchChallanResultModel.getChallanNo();
            SearchChallanResultModel searchChallanResultModel2 = this.f8774b0;
            cm.l.c(searchChallanResultModel2);
            String stateCd = searchChallanResultModel2.getStateCd();
            SearchChallanResultModel searchChallanResultModel3 = this.f8774b0;
            cm.l.c(searchChallanResultModel3);
            String docNo = searchChallanResultModel3.getDocNo();
            SearchChallanResultModel searchChallanResultModel4 = this.f8774b0;
            cm.l.c(searchChallanResultModel4);
            String amount = searchChallanResultModel4.getAmount();
            SearchChallanResultModel searchChallanResultModel5 = this.f8774b0;
            cm.l.c(searchChallanResultModel5);
            cVar.y(challanNo, stateCd, docNo, amount, searchChallanResultModel5.getChallanStatus());
        } catch (Exception e10) {
            e10.printStackTrace();
            ProgressBar progressBar3 = this.S;
            if (progressBar3 == null) {
                cm.l.v("progressBar");
            } else {
                progressBar = progressBar3;
            }
            progressBar.setVisibility(8);
        }
    }

    private final void t1(Context context, String str, int i10) {
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
        ((TextView) findViewById6).setText(w1().b("nex_parivahan", getString(R.string.app_name)));
        ((TextView) findViewById3).setText(str);
        textView3.setText(w1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        textView3.setOnClickListener(new f0(dialog, i10, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void u1(Dialog dialog, int i10, PaymentSearchChallanDetails paymentSearchChallanDetails, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(paymentSearchChallanDetails, "this$0");
        dialog.dismiss();
        if (i10 == 1) {
            paymentSearchChallanDetails.s1();
        }
    }

    private final void v1() {
        this.f8776d0.put("AN", "Andaman and Nicobar Islands");
        this.f8776d0.put("AP", "Andhra Pradesh");
        this.f8776d0.put("AR", "Arunachal Pradesh");
        this.f8776d0.put("AS", "Assam");
        this.f8776d0.put("BR", "Bihar");
        this.f8776d0.put("CG", "Chandigarh");
        this.f8776d0.put("CH", "Chandigarh");
        this.f8776d0.put("DH", "Dadra and Nagar Haveli");
        this.f8776d0.put("DD", "Daman and Diu");
        this.f8776d0.put("DL", "Delhi");
        this.f8776d0.put("GA", "Goa");
        this.f8776d0.put("GJ", "Gujarat");
        this.f8776d0.put("HR", "Haryana");
        this.f8776d0.put("HP", "Himachal Pradesh");
        this.f8776d0.put("JK", "Jammu and Kashmir");
        this.f8776d0.put("JH", "Jharkhand");
        this.f8776d0.put("KA", "Karnataka");
        this.f8776d0.put("KL", "Kerala");
        this.f8776d0.put("LD", "Lakshadweep");
        this.f8776d0.put("MP", "Madhya Pradesh");
        this.f8776d0.put("MH", "Maharashtra");
        this.f8776d0.put("MN", "Manipur");
        this.f8776d0.put("ML", "Meghalaya");
        this.f8776d0.put("MZ", "Mizoram");
        this.f8776d0.put("NL", "Nagaland");
        this.f8776d0.put("OR", "Odisha");
        this.f8776d0.put("PY", "Puducherry");
        this.f8776d0.put("PB", "Punjab");
        this.f8776d0.put("RJ", "Rajasthan");
        this.f8776d0.put("SK", "Sikkim");
        this.f8776d0.put("TN", "Tamil Nadu");
        this.f8776d0.put("TS", "Telangana");
        this.f8776d0.put("TR", "Tripura");
        this.f8776d0.put("UK", "Uttarakhand");
        this.f8776d0.put("UP", "Uttar Pradesh");
        this.f8776d0.put("WB", "West Bengal");
    }

    private final void y1() {
        SearchChallanService searchChallanService = this.f8779g0;
        AppCompatTextView appCompatTextView = null;
        if (searchChallanService == null) {
            cm.l.v("retrofitService");
            searchChallanService = null;
        }
        this.f8780h0 = (jb.c) new u0((x0) this, (u0.b) new jb.b(new jb.a(searchChallanService))).a(jb.c.class);
        StagingEchallanService stagingEchallanService = this.f8781i0;
        if (stagingEchallanService == null) {
            cm.l.v("stagingRetrofitService");
            stagingEchallanService = null;
        }
        this.f8782j0 = (jb.e) new u0((x0) this, (u0.b) new jb.d(new hb.a(stagingEchallanService))).a(jb.e.class);
        View findViewById = findViewById(R.id.mvvm_back);
        cm.l.e(findViewById, "findViewById(...)");
        this.G = (AppCompatImageView) findViewById;
        View findViewById2 = findViewById(R.id.notificationIv);
        cm.l.e(findViewById2, "findViewById(...)");
        this.H = (AppCompatImageView) findViewById2;
        View findViewById3 = findViewById(R.id.ownerNameValue);
        cm.l.e(findViewById3, "findViewById(...)");
        this.I = (AppCompatTextView) findViewById3;
        View findViewById4 = findViewById(R.id.dlRcValue);
        cm.l.e(findViewById4, "findViewById(...)");
        this.J = (AppCompatTextView) findViewById4;
        View findViewById5 = findViewById(R.id.stateValue);
        cm.l.e(findViewById5, "findViewById(...)");
        this.K = (AppCompatTextView) findViewById5;
        View findViewById6 = findViewById(R.id.challanValue);
        cm.l.e(findViewById6, "findViewById(...)");
        this.L = (AppCompatTextView) findViewById6;
        View findViewById7 = findViewById(R.id.challanDateValue);
        cm.l.e(findViewById7, "findViewById(...)");
        this.M = (AppCompatTextView) findViewById7;
        View findViewById8 = findViewById(R.id.amountValue);
        cm.l.e(findViewById8, "findViewById(...)");
        this.N = (AppCompatTextView) findViewById8;
        View findViewById9 = findViewById(R.id.paymentStatusValue);
        cm.l.e(findViewById9, "findViewById(...)");
        this.O = (AppCompatTextView) findViewById9;
        View findViewById10 = findViewById(R.id.payNowTv);
        cm.l.e(findViewById10, "findViewById(...)");
        this.P = (AppCompatTextView) findViewById10;
        View findViewById11 = findViewById(R.id.challanPrintTv);
        cm.l.e(findViewById11, "findViewById(...)");
        this.Q = (AppCompatTextView) findViewById11;
        View findViewById12 = findViewById(R.id.receiptTv);
        cm.l.e(findViewById12, "findViewById(...)");
        this.R = (AppCompatTextView) findViewById12;
        View findViewById13 = findViewById(R.id.progressBar);
        cm.l.e(findViewById13, "findViewById(...)");
        this.S = (ProgressBar) findViewById13;
        View findViewById14 = findViewById(R.id.paymentCb);
        cm.l.e(findViewById14, "findViewById(...)");
        this.T = (CheckedTextView) findViewById14;
        View findViewById15 = findViewById(R.id.paymentView);
        cm.l.e(findViewById15, "findViewById(...)");
        this.U = findViewById15;
        View findViewById16 = findViewById(R.id.paymentDateRl);
        cm.l.e(findViewById16, "findViewById(...)");
        this.V = (RelativeLayout) findViewById16;
        View findViewById17 = findViewById(R.id.paymentDateValue);
        cm.l.e(findViewById17, "findViewById(...)");
        this.W = (AppCompatTextView) findViewById17;
        View findViewById18 = findViewById(R.id.receiptCb);
        cm.l.e(findViewById18, "findViewById(...)");
        this.X = (CheckedTextView) findViewById18;
        View findViewById19 = findViewById(R.id.bottomBtnHolderLl);
        cm.l.e(findViewById19, "findViewById(...)");
        this.Y = (LinearLayout) findViewById19;
        View findViewById20 = findViewById(R.id.challanPrint1Tv);
        cm.l.e(findViewById20, "findViewById(...)");
        this.Z = (AppCompatTextView) findViewById20;
        View findViewById21 = findViewById(R.id.nexGenHolder);
        cm.l.e(findViewById21, "findViewById(...)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById21;
        this.f8773a0 = relativeLayout;
        if (relativeLayout == null) {
            cm.l.v("nexGenHolder");
            relativeLayout = null;
        }
        relativeLayout.setOnClickListener(new y(this));
        AppCompatImageView appCompatImageView = this.G;
        if (appCompatImageView == null) {
            cm.l.v("backBtn");
            appCompatImageView = null;
        }
        appCompatImageView.setOnClickListener(new z(this));
        AppCompatTextView appCompatTextView2 = this.P;
        if (appCompatTextView2 == null) {
            cm.l.v("payBtn");
            appCompatTextView2 = null;
        }
        appCompatTextView2.setOnClickListener(new a0(this));
        AppCompatTextView appCompatTextView3 = this.Q;
        if (appCompatTextView3 == null) {
            cm.l.v("printChallan");
            appCompatTextView3 = null;
        }
        appCompatTextView3.setOnClickListener(new cb.b0(this));
        AppCompatTextView appCompatTextView4 = this.Z;
        if (appCompatTextView4 == null) {
            cm.l.v("challanPrint1Tv");
            appCompatTextView4 = null;
        }
        appCompatTextView4.setOnClickListener(new c0(this));
        AppCompatTextView appCompatTextView5 = this.R;
        if (appCompatTextView5 == null) {
            cm.l.v("receiptChallan");
        } else {
            appCompatTextView = appCompatTextView5;
        }
        appCompatTextView.setOnClickListener(new d0(this));
    }

    /* access modifiers changed from: private */
    public static final void z1(PaymentSearchChallanDetails paymentSearchChallanDetails, View view) {
        cm.l.f(paymentSearchChallanDetails, "this$0");
        paymentSearchChallanDetails.F1();
    }

    public final void I1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f8783k0 = cVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b7 c10 = b7.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.f8777e0 = c10;
        jb.c cVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        I1(new ld.c(this));
        a.C0148a aVar = fb.a.f11584a;
        b7 b7Var = this.f8777e0;
        if (b7Var == null) {
            cm.l.v("binding");
            b7Var = null;
        }
        aVar.a(this, b7Var);
        this.f8774b0 = (SearchChallanResultModel) getIntent().getParcelableExtra("selectedData");
        String stringExtra = getIntent().getStringExtra("inputType");
        cm.l.c(stringExtra);
        this.f8778f0 = stringExtra;
        this.f8779g0 = SearchChallanService.f8750a.d(this);
        this.f8781i0 = StagingEchallanService.f8744a.a(this);
        y1();
        v1();
        J1(this.f8774b0);
        jb.c cVar2 = this.f8780h0;
        if (cVar2 == null) {
            cm.l.v("viewModel");
            cVar2 = null;
        }
        cVar2.k().g(this, new e(new a(this)));
        jb.c cVar3 = this.f8780h0;
        if (cVar3 == null) {
            cm.l.v("viewModel");
            cVar3 = null;
        }
        cVar3.j().g(this, new e(new b(this)));
        jb.c cVar4 = this.f8780h0;
        if (cVar4 == null) {
            cm.l.v("viewModel");
            cVar4 = null;
        }
        cVar4.r().g(this, new e(new c(this)));
        jb.c cVar5 = this.f8780h0;
        if (cVar5 == null) {
            cm.l.v("viewModel");
        } else {
            cVar = cVar5;
        }
        cVar.p().g(this, new e(new d(this)));
    }

    public final ld.c w1() {
        ld.c cVar = this.f8783k0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final SearchChallanResultModel x1() {
        return this.f8774b0;
    }
}
