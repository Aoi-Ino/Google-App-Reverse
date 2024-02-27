package com.nic.mparivahan.Tax.payment;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PdfViewer.PdfViewActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.Model.Afterpayment;
import com.nic.mparivahan.Tax.PaytaxService;
import com.nic.mparivahan.Tax.ViewModel.PaytaxViewModel;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.SaveVahanlog;
import com.nic.mparivahan.VahanServices.VahanLog.VahanlTaxlogCapture;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import java.io.Serializable;
import ld.e;
import ni.a7;
import pl.x;
import ud.f;
import ud.g;
import ud.i;
import ud.j;

public final class PayTaxPaymentStatusScreen extends d {
    public PaytaxViewModel G;
    public PaytaxService H;
    public ProgressDialog I;
    public String J;
    /* access modifiers changed from: private */
    public a7 K;
    private String L = "";
    private String M = "";
    private String N = "";
    private String O = "";
    private String P = "";
    public Afterpayment Q;
    public NrvDetails R;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PayTaxPaymentStatusScreen f20510e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PayTaxPaymentStatusScreen payTaxPaymentStatusScreen) {
            super(1);
            this.f20510e = payTaxPaymentStatusScreen;
        }

        public final void b(Afterpayment afterpayment) {
            a7 a7Var = null;
            try {
                this.f20510e.v1().dismiss();
                PayTaxPaymentStatusScreen payTaxPaymentStatusScreen = this.f20510e;
                cm.l.c(afterpayment);
                payTaxPaymentStatusScreen.M1(afterpayment);
                try {
                    SaveVahanlog.a aVar = SaveVahanlog.f20959k;
                    PayTaxPaymentStatusScreen payTaxPaymentStatusScreen2 = this.f20510e;
                    NrvDetails x12 = payTaxPaymentStatusScreen2.x1();
                    a7 p12 = this.f20510e.K;
                    if (p12 == null) {
                        cm.l.v("binding");
                        p12 = null;
                    }
                    String obj = p12.f25203e.getText().toString();
                    String valueOf = String.valueOf(this.f20510e.w1().getPur_CD());
                    String rc_regn_no = this.f20510e.x1().getRc_regn_no();
                    cm.l.c(rc_regn_no);
                    String substring = rc_regn_no.substring(0, 4);
                    cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    aVar.a(payTaxPaymentStatusScreen2, x12, false, obj, valueOf, substring);
                    VahanlTaxlogCapture.a aVar2 = VahanlTaxlogCapture.f20971k;
                    PayTaxPaymentStatusScreen payTaxPaymentStatusScreen3 = this.f20510e;
                    aVar2.a(payTaxPaymentStatusScreen3, payTaxPaymentStatusScreen3.w1(), 1);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                this.f20510e.J1(afterpayment);
            } catch (Exception e11) {
                this.f20510e.v1().dismiss();
                e11.printStackTrace();
                a7 p13 = this.f20510e.K;
                if (p13 == null) {
                    cm.l.v("binding");
                } else {
                    a7Var = p13;
                }
                a7Var.f25210l.setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Afterpayment) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PayTaxPaymentStatusScreen f20511e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PayTaxPaymentStatusScreen payTaxPaymentStatusScreen) {
            super(1);
            this.f20511e = payTaxPaymentStatusScreen;
        }

        public final void b(String str) {
            this.f20511e.v1().dismiss();
            a7 p12 = this.f20511e.K;
            if (p12 == null) {
                cm.l.v("binding");
                p12 = null;
            }
            p12.f25210l.setVisibility(8);
            PayTaxPaymentStatusScreen payTaxPaymentStatusScreen = this.f20511e;
            payTaxPaymentStatusScreen.H1(payTaxPaymentStatusScreen, "Please try after some time");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20512a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f20512a = lVar;
        }

        public final pl.c a() {
            return this.f20512a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20512a.invoke(obj);
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
    public static final void A1(PayTaxPaymentStatusScreen payTaxPaymentStatusScreen, View view) {
        cm.l.f(payTaxPaymentStatusScreen, "this$0");
        payTaxPaymentStatusScreen.r1(payTaxPaymentStatusScreen, "Are you sure you want to leave?");
    }

    /* access modifiers changed from: private */
    public static final void B1(PayTaxPaymentStatusScreen payTaxPaymentStatusScreen, View view) {
        cm.l.f(payTaxPaymentStatusScreen, "this$0");
        payTaxPaymentStatusScreen.G1();
    }

    /* access modifiers changed from: private */
    public static final void C1(PayTaxPaymentStatusScreen payTaxPaymentStatusScreen, View view) {
        cm.l.f(payTaxPaymentStatusScreen, "this$0");
        payTaxPaymentStatusScreen.G1();
    }

    /* access modifiers changed from: private */
    public static final void D1(PayTaxPaymentStatusScreen payTaxPaymentStatusScreen, View view) {
        cm.l.f(payTaxPaymentStatusScreen, "this$0");
        a7 a7Var = payTaxPaymentStatusScreen.K;
        a7 a7Var2 = null;
        if (a7Var == null) {
            cm.l.v("binding");
            a7Var = null;
        }
        String obj = a7Var.f25203e.getText().toString();
        if (obj.length() > 0) {
            String str = APIController.a().getNapixBase1() + "vahancapi/tax/printreciept/" + payTaxPaymentStatusScreen.L + '/' + payTaxPaymentStatusScreen.M + '/' + obj + '/' + payTaxPaymentStatusScreen.O + '/' + payTaxPaymentStatusScreen.P;
            Log.e("Tax_receiptUrl", str);
            if (!ka.c.f13158a.m(str)) {
                Intent intent = new Intent(payTaxPaymentStatusScreen, PdfViewActivity.class);
                intent.putExtra("url", str);
                intent.putExtra("formType", "Tax Receipt");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(payTaxPaymentStatusScreen.O);
                sb2.append('_');
                a7 a7Var3 = payTaxPaymentStatusScreen.K;
                if (a7Var3 == null) {
                    cm.l.v("binding");
                } else {
                    a7Var2 = a7Var3;
                }
                sb2.append(a7Var2.f25203e.getText());
                intent.putExtra("applNo", sb2.toString());
                payTaxPaymentStatusScreen.startActivity(intent);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void E1(PayTaxPaymentStatusScreen payTaxPaymentStatusScreen, View view) {
        cm.l.f(payTaxPaymentStatusScreen, "this$0");
        payTaxPaymentStatusScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void F1(PayTaxPaymentStatusScreen payTaxPaymentStatusScreen, View view) {
        cm.l.f(payTaxPaymentStatusScreen, "this$0");
        payTaxPaymentStatusScreen.r1(payTaxPaymentStatusScreen, "Are you sure you want to leave?");
    }

    private final void G1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void I1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void J1(Afterpayment afterpayment) {
        Boolean bool;
        Boolean bool2;
        a7 a7Var;
        View view;
        a7 a7Var2 = this.K;
        a7 a7Var3 = null;
        if (a7Var2 == null) {
            cm.l.v("binding");
            a7Var2 = null;
        }
        a7Var2.f25210l.setVisibility(0);
        if (afterpayment != null) {
            try {
                String regn_NO = afterpayment.getRegn_NO();
                if (regn_NO != null) {
                    bool = Boolean.valueOf(regn_NO.length() > 0);
                } else {
                    bool = null;
                }
                cm.l.c(bool);
                if (bool.booleanValue()) {
                    this.O = afterpayment.getRegn_NO();
                    a7 a7Var4 = this.K;
                    if (a7Var4 == null) {
                        cm.l.v("binding");
                        a7Var4 = null;
                    }
                    a7Var4.f25216r.setText(afterpayment.getRegn_NO());
                }
                String trans_NO = afterpayment.getTrans_NO();
                cm.l.c(trans_NO);
                if (trans_NO.length() > 0) {
                    a7 a7Var5 = this.K;
                    if (a7Var5 == null) {
                        cm.l.v("binding");
                        a7Var5 = null;
                    }
                    a7Var5.f25203e.setText(afterpayment.getTrans_NO());
                }
                if (afterpayment.getRcpt_NO() != null && afterpayment.getRcpt_NO().length() > 0) {
                    this.N = afterpayment.getRcpt_NO();
                    a7 a7Var6 = this.K;
                    if (a7Var6 == null) {
                        cm.l.v("binding");
                        a7Var6 = null;
                    }
                    a7Var6.f25213o.setText(afterpayment.getRcpt_NO());
                }
                String owner_name = afterpayment.getOwner_name();
                cm.l.c(owner_name);
                if (owner_name.length() > 0) {
                    a7 a7Var7 = this.K;
                    if (a7Var7 == null) {
                        cm.l.v("binding");
                        a7Var7 = null;
                    }
                    a7Var7.f25209k.setText(afterpayment.getOwner_name());
                }
                a7 a7Var8 = this.K;
                if (a7Var8 == null) {
                    cm.l.v("binding");
                    a7Var8 = null;
                }
                a7Var8.f25201c.setText(String.valueOf(afterpayment.getRcpt_amt()));
                String state_CD = afterpayment.getState_CD();
                if (state_CD != null) {
                    bool2 = Boolean.valueOf(state_CD.length() > 0);
                } else {
                    bool2 = null;
                }
                cm.l.c(bool2);
                if (bool2.booleanValue()) {
                    this.L = afterpayment.getState_CD();
                }
                if (afterpayment.getOff_CD() > 0) {
                    this.M = String.valueOf(afterpayment.getOff_CD());
                }
                if (afterpayment.getPur_CD() > 0) {
                    this.P = String.valueOf(afterpayment.getPur_CD());
                }
                String response_CODE = afterpayment.getResponse_CODE();
                cm.l.c(response_CODE);
                if (response_CODE.length() > 0) {
                    if (p.o(afterpayment.getResponse_CODE(), "S", true)) {
                        a7 a7Var9 = this.K;
                        if (a7Var9 == null) {
                            cm.l.v("binding");
                            a7Var9 = null;
                        }
                        a7Var9.f25211m.setVisibility(0);
                        a7 a7Var10 = this.K;
                        if (a7Var10 == null) {
                            cm.l.v("binding");
                            a7Var10 = null;
                        }
                        a7Var10.f25211m.setImageResource(R.drawable.verified);
                        a7 a7Var11 = this.K;
                        if (a7Var11 == null) {
                            cm.l.v("binding");
                            a7Var11 = null;
                        }
                        a7Var11.f25218t.setText(getString(R.string.payment_success));
                        a7 a7Var12 = this.K;
                        if (a7Var12 == null) {
                            cm.l.v("binding");
                            a7Var12 = null;
                        }
                        a7Var12.f25218t.setTextColor(androidx.core.content.a.c(this, R.color.green_new));
                        a7 a7Var13 = this.K;
                        if (a7Var13 == null) {
                            cm.l.v("binding");
                            a7Var13 = null;
                        }
                        a7Var13.f25204f.setText(getString(R.string.print_receipt));
                        a7 a7Var14 = this.K;
                        if (a7Var14 == null) {
                            cm.l.v("binding");
                            a7Var14 = null;
                        }
                        a7Var14.f25219u.setVisibility(8);
                        a7 a7Var15 = this.K;
                        if (a7Var15 == null) {
                            cm.l.v("binding");
                            a7Var15 = null;
                        }
                        view = a7Var15.f25207i;
                    } else {
                        if (p.o(afterpayment.getResponse_CODE(), "P", true)) {
                            a7 a7Var16 = this.K;
                            if (a7Var16 == null) {
                                cm.l.v("binding");
                                a7Var16 = null;
                            }
                            a7Var16.f25211m.setVisibility(0);
                            a7 a7Var17 = this.K;
                            if (a7Var17 == null) {
                                cm.l.v("binding");
                                a7Var17 = null;
                            }
                            a7Var17.f25211m.setImageResource(R.drawable.new_pending);
                            a7 a7Var18 = this.K;
                            if (a7Var18 == null) {
                                cm.l.v("binding");
                                a7Var18 = null;
                            }
                            a7Var18.f25218t.setText(getString(R.string.payment_pending));
                            a7 a7Var19 = this.K;
                            if (a7Var19 == null) {
                                cm.l.v("binding");
                                a7Var19 = null;
                            }
                            a7Var19.f25218t.setTextColor(androidx.core.content.a.c(this, R.color.blue_new));
                            a7 a7Var20 = this.K;
                            if (a7Var20 == null) {
                                cm.l.v("binding");
                                a7Var20 = null;
                            }
                            a7Var20.f25204f.setVisibility(8);
                            a7 a7Var21 = this.K;
                            if (a7Var21 == null) {
                                cm.l.v("binding");
                                a7Var21 = null;
                            }
                            a7Var21.f25207i.setVisibility(8);
                            a7 a7Var22 = this.K;
                            if (a7Var22 == null) {
                                cm.l.v("binding");
                                a7Var22 = null;
                            }
                            a7Var22.f25219u.setVisibility(0);
                            a7 a7Var23 = this.K;
                            if (a7Var23 == null) {
                                cm.l.v("binding");
                                a7Var23 = null;
                            }
                            a7Var23.f25205g.setVisibility(8);
                            a7Var = this.K;
                            if (a7Var == null) {
                                cm.l.v("binding");
                                a7Var = null;
                            }
                        } else if (p.o(afterpayment.getResponse_CODE(), "F", true)) {
                            a7 a7Var24 = this.K;
                            if (a7Var24 == null) {
                                cm.l.v("binding");
                                a7Var24 = null;
                            }
                            a7Var24.f25211m.setVisibility(0);
                            a7 a7Var25 = this.K;
                            if (a7Var25 == null) {
                                cm.l.v("binding");
                                a7Var25 = null;
                            }
                            a7Var25.f25211m.setImageResource(R.drawable.payment_failed);
                            a7 a7Var26 = this.K;
                            if (a7Var26 == null) {
                                cm.l.v("binding");
                                a7Var26 = null;
                            }
                            a7Var26.f25218t.setText(getString(R.string.payment_failed));
                            a7 a7Var27 = this.K;
                            if (a7Var27 == null) {
                                cm.l.v("binding");
                                a7Var27 = null;
                            }
                            a7Var27.f25218t.setTextColor(androidx.core.content.a.c(this, R.color.red_new));
                            a7 a7Var28 = this.K;
                            if (a7Var28 == null) {
                                cm.l.v("binding");
                                a7Var28 = null;
                            }
                            a7Var28.f25204f.setVisibility(8);
                            a7 a7Var29 = this.K;
                            if (a7Var29 == null) {
                                cm.l.v("binding");
                                a7Var29 = null;
                            }
                            a7Var29.f25207i.setVisibility(8);
                            a7 a7Var30 = this.K;
                            if (a7Var30 == null) {
                                cm.l.v("binding");
                                a7Var30 = null;
                            }
                            a7Var30.f25219u.setVisibility(0);
                            a7 a7Var31 = this.K;
                            if (a7Var31 == null) {
                                cm.l.v("binding");
                                a7Var31 = null;
                            }
                            a7Var31.f25205g.setVisibility(8);
                            a7Var = this.K;
                            if (a7Var == null) {
                                cm.l.v("binding");
                                a7Var = null;
                            }
                        } else {
                            return;
                        }
                        view = a7Var.f25214p;
                    }
                    view.setVisibility(8);
                    return;
                }
                a7 a7Var32 = this.K;
                if (a7Var32 == null) {
                    cm.l.v("binding");
                    a7Var32 = null;
                }
                a7Var32.f25204f.setVisibility(8);
                a7 a7Var33 = this.K;
                if (a7Var33 == null) {
                    cm.l.v("binding");
                    a7Var33 = null;
                }
                a7Var33.f25207i.setVisibility(8);
                a7 a7Var34 = this.K;
                if (a7Var34 == null) {
                    cm.l.v("binding");
                    a7Var34 = null;
                }
                a7Var34.f25219u.setVisibility(8);
                a7 a7Var35 = this.K;
                if (a7Var35 == null) {
                    cm.l.v("binding");
                    a7Var35 = null;
                }
                a7Var35.f25205g.setVisibility(8);
                a7 a7Var36 = this.K;
                if (a7Var36 == null) {
                    cm.l.v("binding");
                    a7Var36 = null;
                }
                a7Var36.f25214p.setVisibility(8);
                a7 a7Var37 = this.K;
                if (a7Var37 == null) {
                    cm.l.v("binding");
                    a7Var37 = null;
                }
                a7Var37.f25206h.setVisibility(8);
                Q1(this, getString(R.string.service_unavable_please_try));
            } catch (Exception unused) {
                a7 a7Var38 = this.K;
                if (a7Var38 == null) {
                    cm.l.v("binding");
                    a7Var38 = null;
                }
                a7Var38.f25218t.setVisibility(8);
                a7 a7Var39 = this.K;
                if (a7Var39 == null) {
                    cm.l.v("binding");
                    a7Var39 = null;
                }
                a7Var39.f25204f.setVisibility(8);
                a7 a7Var40 = this.K;
                if (a7Var40 == null) {
                    cm.l.v("binding");
                    a7Var40 = null;
                }
                a7Var40.f25207i.setVisibility(8);
                a7 a7Var41 = this.K;
                if (a7Var41 == null) {
                    cm.l.v("binding");
                    a7Var41 = null;
                }
                a7Var41.f25219u.setVisibility(8);
                a7 a7Var42 = this.K;
                if (a7Var42 == null) {
                    cm.l.v("binding");
                    a7Var42 = null;
                }
                a7Var42.f25205g.setVisibility(8);
                a7 a7Var43 = this.K;
                if (a7Var43 == null) {
                    cm.l.v("binding");
                } else {
                    a7Var3 = a7Var43;
                }
                a7Var3.f25214p.setVisibility(8);
                Q1(this, getString(R.string.service_unavable_please_try));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void R1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void s1(Dialog dialog, PayTaxPaymentStatusScreen payTaxPaymentStatusScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(payTaxPaymentStatusScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(payTaxPaymentStatusScreen, DashBoard.class);
        new e(payTaxPaymentStatusScreen).h(1);
        intent.addFlags(67108864);
        payTaxPaymentStatusScreen.startActivity(intent);
        payTaxPaymentStatusScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void t1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final void H1(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new j(dialog));
        dialog.show();
    }

    public final void K1(String str) {
        cm.l.f(str, "<set-?>");
        this.J = str;
    }

    public final void L1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void M1(Afterpayment afterpayment) {
        cm.l.f(afterpayment, "<set-?>");
        this.Q = afterpayment;
    }

    public final void N1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.R = nrvDetails;
    }

    public final void O1(PaytaxService paytaxService) {
        cm.l.f(paytaxService, "<set-?>");
        this.H = paytaxService;
    }

    public final void P1(PaytaxViewModel paytaxViewModel) {
        cm.l.f(paytaxViewModel, "<set-?>");
        this.G = paytaxViewModel;
    }

    public final void Q1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new i(dialog));
        dialog.show();
    }

    public void onBackPressed() {
        r1(this, "Are you sure you want to leave?");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_pay_tax_status_screen);
        a7 c10 = a7.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.K = c10;
        a7 a7Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        ld.h hVar = new ld.h(this);
        a7 a7Var2 = this.K;
        if (a7Var2 == null) {
            cm.l.v("binding");
            a7Var2 = null;
        }
        a7Var2.f25217s.f28308i.setText(VContant.Companion.l(this, hVar));
        O1(PaytaxService.f20481a.a(this));
        P1((PaytaxViewModel) new u0((x0) this, (u0.b) new rd.a(new rd.h(y1()))).a(PaytaxViewModel.class));
        L1(new ProgressDialog(this));
        v1().setMessage("Please wait...");
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        v1().show();
        K1(String.valueOf(getIntent().getStringExtra("EncString")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        N1((NrvDetails) serializableExtra);
        z1().s(u1());
        z1().i().g(this, new c(new a(this)));
        z1().l().g(this, new c(new b(this)));
        a7 a7Var3 = this.K;
        if (a7Var3 == null) {
            cm.l.v("binding");
            a7Var3 = null;
        }
        a7Var3.f25217s.f28305f.setOnClickListener(new ud.a(this));
        a7 a7Var4 = this.K;
        if (a7Var4 == null) {
            cm.l.v("binding");
            a7Var4 = null;
        }
        a7Var4.f25217s.f28306g.setOnClickListener(new ud.b(this));
        a7 a7Var5 = this.K;
        if (a7Var5 == null) {
            cm.l.v("binding");
            a7Var5 = null;
        }
        a7Var5.f25217s.f28306g.setOnClickListener(new ud.c(this));
        a7 a7Var6 = this.K;
        if (a7Var6 == null) {
            cm.l.v("binding");
            a7Var6 = null;
        }
        a7Var6.f25204f.setOnClickListener(new ud.d(this));
        a7 a7Var7 = this.K;
        if (a7Var7 == null) {
            cm.l.v("binding");
            a7Var7 = null;
        }
        a7Var7.f25219u.setOnClickListener(new ud.e(this));
        a7 a7Var8 = this.K;
        if (a7Var8 == null) {
            cm.l.v("binding");
        } else {
            a7Var = a7Var8;
        }
        a7Var.f25207i.setOnClickListener(new f(this));
    }

    public final void r1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new g(dialog, this));
        ((TextView) findViewById3).setOnClickListener(new ud.h(dialog));
        dialog.show();
    }

    public final String u1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        cm.l.v("enc_string");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final Afterpayment w1() {
        Afterpayment afterpayment = this.Q;
        if (afterpayment != null) {
            return afterpayment;
        }
        cm.l.v("payment_response");
        return null;
    }

    public final NrvDetails x1() {
        NrvDetails nrvDetails = this.R;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final PaytaxService y1() {
        PaytaxService paytaxService = this.H;
        if (paytaxService != null) {
            return paytaxService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final PaytaxViewModel z1() {
        PaytaxViewModel paytaxViewModel = this.G;
        if (paytaxViewModel != null) {
            return paytaxViewModel;
        }
        cm.l.v("viewModel");
        return null;
    }
}
