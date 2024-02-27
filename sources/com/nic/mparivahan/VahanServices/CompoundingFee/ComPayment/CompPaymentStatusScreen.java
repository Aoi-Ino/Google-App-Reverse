package com.nic.mparivahan.VahanServices.CompoundingFee.ComPayment;

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
import bi.g;
import bi.h;
import bm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PdfViewer.PdfViewActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanVerifyPendingTransaction;
import com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import ie.f;
import ie.i;
import ie.j;
import ie.k;
import ie.n;
import ld.e;
import ni.a7;
import pl.x;

public final class CompPaymentStatusScreen extends d {
    public h G;
    public VahanProService H;
    public ProgressDialog I;
    public String J;
    /* access modifiers changed from: private */
    public a7 K;
    private String L = "";
    private String M = "";
    private String N = "";
    public ld.c O;
    private String P = "";
    private String Q = "";
    public AfterPaymentResponse R;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CompPaymentStatusScreen f20564e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(CompPaymentStatusScreen compPaymentStatusScreen) {
            super(1);
            this.f20564e = compPaymentStatusScreen;
        }

        public final void b(AfterPaymentResponse afterPaymentResponse) {
            try {
                this.f20564e.w1().dismiss();
                CompPaymentStatusScreen compPaymentStatusScreen = this.f20564e;
                cm.l.c(afterPaymentResponse);
                compPaymentStatusScreen.M1(afterPaymentResponse);
                this.f20564e.I1(afterPaymentResponse);
            } catch (Exception e10) {
                this.f20564e.w1().dismiss();
                e10.printStackTrace();
                a7 p12 = this.f20564e.K;
                if (p12 == null) {
                    cm.l.v("binding");
                    p12 = null;
                }
                p12.f25210l.setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AfterPaymentResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CompPaymentStatusScreen f20565e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CompPaymentStatusScreen compPaymentStatusScreen) {
            super(1);
            this.f20565e = compPaymentStatusScreen;
        }

        public final void b(String str) {
            this.f20565e.w1().dismiss();
            a7 p12 = this.f20565e.K;
            if (p12 == null) {
                cm.l.v("binding");
                p12 = null;
            }
            p12.f25210l.setVisibility(8);
            CompPaymentStatusScreen compPaymentStatusScreen = this.f20565e;
            compPaymentStatusScreen.G1(compPaymentStatusScreen, "Please try after some time");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20566a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f20566a = lVar;
        }

        public final pl.c a() {
            return this.f20566a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20566a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return cm.l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void A1(CompPaymentStatusScreen compPaymentStatusScreen, View view) {
        cm.l.f(compPaymentStatusScreen, "this$0");
        compPaymentStatusScreen.F1();
    }

    /* access modifiers changed from: private */
    public static final void B1(CompPaymentStatusScreen compPaymentStatusScreen, View view) {
        cm.l.f(compPaymentStatusScreen, "this$0");
        compPaymentStatusScreen.F1();
    }

    /* access modifiers changed from: private */
    public static final void C1(CompPaymentStatusScreen compPaymentStatusScreen, View view) {
        cm.l.f(compPaymentStatusScreen, "this$0");
        a7 a7Var = compPaymentStatusScreen.K;
        a7 a7Var2 = null;
        if (a7Var == null) {
            cm.l.v("binding");
            a7Var = null;
        }
        String obj = a7Var.f25203e.getText().toString();
        if (obj.length() > 0) {
            try {
                String str = hc.a.f12073a.i() + "printreciept/" + compPaymentStatusScreen.L + '/' + compPaymentStatusScreen.M + '/' + obj + '/' + compPaymentStatusScreen.P + '/' + compPaymentStatusScreen.Q;
                Log.e("receiptUrl", str);
                Intent intent = new Intent(compPaymentStatusScreen, PdfViewActivity.class);
                intent.putExtra("url", str);
                intent.putExtra("formType", "Fee Receipt");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(compPaymentStatusScreen.P);
                sb2.append('_');
                a7 a7Var3 = compPaymentStatusScreen.K;
                if (a7Var3 == null) {
                    cm.l.v("binding");
                } else {
                    a7Var2 = a7Var3;
                }
                sb2.append(a7Var2.f25203e.getText());
                intent.putExtra("applNo", sb2.toString());
                compPaymentStatusScreen.startActivity(intent);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Log.e("receiptUrl", "Not Calling...");
        }
    }

    /* access modifiers changed from: private */
    public static final void D1(CompPaymentStatusScreen compPaymentStatusScreen, View view) {
        cm.l.f(compPaymentStatusScreen, "this$0");
        compPaymentStatusScreen.startActivity(new Intent(compPaymentStatusScreen, VahanVerifyPendingTransaction.class));
        compPaymentStatusScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void E1(CompPaymentStatusScreen compPaymentStatusScreen, View view) {
        cm.l.f(compPaymentStatusScreen, "this$0");
        compPaymentStatusScreen.r1(compPaymentStatusScreen, "Are you sure you want to leave?");
    }

    private final void F1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void H1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void I1(AfterPaymentResponse afterPaymentResponse) {
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
        if (afterPaymentResponse != null) {
            try {
                String regn_no = afterPaymentResponse.getRegn_no();
                if (regn_no != null) {
                    bool = Boolean.valueOf(regn_no.length() > 0);
                } else {
                    bool = null;
                }
                cm.l.c(bool);
                if (bool.booleanValue()) {
                    this.P = afterPaymentResponse.getRegn_no();
                    a7 a7Var4 = this.K;
                    if (a7Var4 == null) {
                        cm.l.v("binding");
                        a7Var4 = null;
                    }
                    a7Var4.f25216r.setText(afterPaymentResponse.getRegn_no());
                }
                String appl_no = afterPaymentResponse.getAppl_no();
                cm.l.c(appl_no);
                if (appl_no.length() > 0) {
                    a7 a7Var5 = this.K;
                    if (a7Var5 == null) {
                        cm.l.v("binding");
                        a7Var5 = null;
                    }
                    a7Var5.f25203e.setText(afterPaymentResponse.getAppl_no());
                }
                if (afterPaymentResponse.getRcpt_NO() != null && afterPaymentResponse.getRcpt_NO().length() > 0) {
                    this.N = afterPaymentResponse.getRcpt_NO();
                    a7 a7Var6 = this.K;
                    if (a7Var6 == null) {
                        cm.l.v("binding");
                        a7Var6 = null;
                    }
                    a7Var6.f25213o.setText(afterPaymentResponse.getRcpt_NO());
                }
                String owner_name = afterPaymentResponse.getOwner_name();
                cm.l.c(owner_name);
                if (owner_name.length() > 0) {
                    a7 a7Var7 = this.K;
                    if (a7Var7 == null) {
                        cm.l.v("binding");
                        a7Var7 = null;
                    }
                    a7Var7.f25209k.setText(afterPaymentResponse.getOwner_name());
                }
                a7 a7Var8 = this.K;
                if (a7Var8 == null) {
                    cm.l.v("binding");
                    a7Var8 = null;
                }
                a7Var8.f25201c.setText(String.valueOf(afterPaymentResponse.getRcpt_amt()));
                String state_cd = afterPaymentResponse.getState_cd();
                if (state_cd != null) {
                    bool2 = Boolean.valueOf(state_cd.length() > 0);
                } else {
                    bool2 = null;
                }
                cm.l.c(bool2);
                if (bool2.booleanValue()) {
                    this.L = afterPaymentResponse.getState_cd();
                }
                String off_cd = afterPaymentResponse.getOff_cd();
                if (off_cd != null && off_cd.length() > 0) {
                    this.M = afterPaymentResponse.getOff_cd();
                }
                String pur_cd = afterPaymentResponse.getPur_cd();
                if (pur_cd != null && pur_cd.length() > 0) {
                    this.Q = afterPaymentResponse.getPur_cd();
                }
                String status = afterPaymentResponse.getStatus();
                cm.l.c(status);
                if (status.length() > 0) {
                    if (p.o(afterPaymentResponse.getStatus(), "S", true)) {
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
                        a7Var11.f25217s.f28308i.setText(v1().b("lbl_Payment_Success", getString(R.string.payment_success)));
                        a7 a7Var12 = this.K;
                        if (a7Var12 == null) {
                            cm.l.v("binding");
                            a7Var12 = null;
                        }
                        a7Var12.f25218t.setText(v1().b("lbl_Payment_Success", getString(R.string.payment_success)));
                        a7 a7Var13 = this.K;
                        if (a7Var13 == null) {
                            cm.l.v("binding");
                            a7Var13 = null;
                        }
                        a7Var13.f25217s.f28308i.setTextColor(androidx.core.content.a.c(this, R.color.green_new));
                        a7 a7Var14 = this.K;
                        if (a7Var14 == null) {
                            cm.l.v("binding");
                            a7Var14 = null;
                        }
                        a7Var14.f25204f.setText(v1().b("btn_Download_Fee_Receipt", "Download Fee Receipt"));
                        a7 a7Var15 = this.K;
                        if (a7Var15 == null) {
                            cm.l.v("binding");
                            a7Var15 = null;
                        }
                        view = a7Var15.f25219u;
                    } else {
                        if (p.o(afterPaymentResponse.getStatus(), "P", true)) {
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
                            a7Var18.f25217s.f28308i.setText(v1().b("payment_pending", getString(R.string.payment_pending)));
                            a7 a7Var19 = this.K;
                            if (a7Var19 == null) {
                                cm.l.v("binding");
                                a7Var19 = null;
                            }
                            a7Var19.f25218t.setText(v1().b("payment_pending", getString(R.string.payment_pending)));
                            a7 a7Var20 = this.K;
                            if (a7Var20 == null) {
                                cm.l.v("binding");
                                a7Var20 = null;
                            }
                            a7Var20.f25217s.f28308i.setTextColor(androidx.core.content.a.c(this, R.color.blue_new));
                            a7 a7Var21 = this.K;
                            if (a7Var21 == null) {
                                cm.l.v("binding");
                                a7Var21 = null;
                            }
                            a7Var21.f25204f.setVisibility(8);
                            a7 a7Var22 = this.K;
                            if (a7Var22 == null) {
                                cm.l.v("binding");
                                a7Var22 = null;
                            }
                            a7Var22.f25207i.setVisibility(8);
                            a7 a7Var23 = this.K;
                            if (a7Var23 == null) {
                                cm.l.v("binding");
                                a7Var23 = null;
                            }
                            a7Var23.f25219u.setVisibility(0);
                            a7 a7Var24 = this.K;
                            if (a7Var24 == null) {
                                cm.l.v("binding");
                                a7Var24 = null;
                            }
                            a7Var24.f25205g.setVisibility(8);
                            a7Var = this.K;
                            if (a7Var == null) {
                                cm.l.v("binding");
                                a7Var = null;
                            }
                        } else if (p.o(afterPaymentResponse.getStatus(), "F", true)) {
                            a7 a7Var25 = this.K;
                            if (a7Var25 == null) {
                                cm.l.v("binding");
                                a7Var25 = null;
                            }
                            a7Var25.f25211m.setVisibility(0);
                            a7 a7Var26 = this.K;
                            if (a7Var26 == null) {
                                cm.l.v("binding");
                                a7Var26 = null;
                            }
                            a7Var26.f25211m.setImageResource(R.drawable.payment_failed);
                            a7 a7Var27 = this.K;
                            if (a7Var27 == null) {
                                cm.l.v("binding");
                                a7Var27 = null;
                            }
                            a7Var27.f25217s.f28308i.setText(v1().b("payment_failed", getString(R.string.payment_failed)));
                            a7 a7Var28 = this.K;
                            if (a7Var28 == null) {
                                cm.l.v("binding");
                                a7Var28 = null;
                            }
                            a7Var28.f25218t.setText(v1().b("payment_failed", getString(R.string.payment_failed)));
                            a7 a7Var29 = this.K;
                            if (a7Var29 == null) {
                                cm.l.v("binding");
                                a7Var29 = null;
                            }
                            a7Var29.f25217s.f28308i.setTextColor(androidx.core.content.a.c(this, R.color.red_new));
                            a7 a7Var30 = this.K;
                            if (a7Var30 == null) {
                                cm.l.v("binding");
                                a7Var30 = null;
                            }
                            a7Var30.f25204f.setVisibility(8);
                            a7 a7Var31 = this.K;
                            if (a7Var31 == null) {
                                cm.l.v("binding");
                                a7Var31 = null;
                            }
                            a7Var31.f25207i.setVisibility(8);
                            a7 a7Var32 = this.K;
                            if (a7Var32 == null) {
                                cm.l.v("binding");
                                a7Var32 = null;
                            }
                            a7Var32.f25219u.setVisibility(0);
                            a7 a7Var33 = this.K;
                            if (a7Var33 == null) {
                                cm.l.v("binding");
                                a7Var33 = null;
                            }
                            a7Var33.f25205g.setVisibility(8);
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
                a7 a7Var34 = this.K;
                if (a7Var34 == null) {
                    cm.l.v("binding");
                    a7Var34 = null;
                }
                a7Var34.f25204f.setVisibility(8);
                a7 a7Var35 = this.K;
                if (a7Var35 == null) {
                    cm.l.v("binding");
                    a7Var35 = null;
                }
                a7Var35.f25207i.setVisibility(8);
                a7 a7Var36 = this.K;
                if (a7Var36 == null) {
                    cm.l.v("binding");
                    a7Var36 = null;
                }
                a7Var36.f25219u.setVisibility(8);
                a7 a7Var37 = this.K;
                if (a7Var37 == null) {
                    cm.l.v("binding");
                    a7Var37 = null;
                }
                a7Var37.f25205g.setVisibility(8);
                a7 a7Var38 = this.K;
                if (a7Var38 == null) {
                    cm.l.v("binding");
                    a7Var38 = null;
                }
                a7Var38.f25214p.setVisibility(8);
                a7 a7Var39 = this.K;
                if (a7Var39 == null) {
                    cm.l.v("binding");
                    a7Var39 = null;
                }
                a7Var39.f25206h.setVisibility(8);
                P1(this, getString(R.string.service_unavable_please_try));
            } catch (Exception unused) {
                a7 a7Var40 = this.K;
                if (a7Var40 == null) {
                    cm.l.v("binding");
                    a7Var40 = null;
                }
                a7Var40.f25218t.setVisibility(8);
                a7 a7Var41 = this.K;
                if (a7Var41 == null) {
                    cm.l.v("binding");
                    a7Var41 = null;
                }
                a7Var41.f25204f.setVisibility(8);
                a7 a7Var42 = this.K;
                if (a7Var42 == null) {
                    cm.l.v("binding");
                    a7Var42 = null;
                }
                a7Var42.f25207i.setVisibility(8);
                a7 a7Var43 = this.K;
                if (a7Var43 == null) {
                    cm.l.v("binding");
                    a7Var43 = null;
                }
                a7Var43.f25219u.setVisibility(8);
                a7 a7Var44 = this.K;
                if (a7Var44 == null) {
                    cm.l.v("binding");
                    a7Var44 = null;
                }
                a7Var44.f25205g.setVisibility(8);
                a7 a7Var45 = this.K;
                if (a7Var45 == null) {
                    cm.l.v("binding");
                } else {
                    a7Var3 = a7Var45;
                }
                a7Var3.f25214p.setVisibility(8);
                P1(this, getString(R.string.service_unavable_please_try));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void Q1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void s1(Dialog dialog, CompPaymentStatusScreen compPaymentStatusScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(compPaymentStatusScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(compPaymentStatusScreen, DashBoard.class);
        new e(compPaymentStatusScreen).h(1);
        intent.addFlags(67108864);
        compPaymentStatusScreen.startActivity(intent);
        compPaymentStatusScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void t1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void z1(CompPaymentStatusScreen compPaymentStatusScreen, View view) {
        cm.l.f(compPaymentStatusScreen, "this$0");
        compPaymentStatusScreen.r1(compPaymentStatusScreen, "Are you sure you want to leave?");
    }

    public final void G1(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new n(dialog));
        dialog.show();
    }

    public final void J1(String str) {
        cm.l.f(str, "<set-?>");
        this.J = str;
    }

    public final void K1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final void L1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void M1(AfterPaymentResponse afterPaymentResponse) {
        cm.l.f(afterPaymentResponse, "<set-?>");
        this.R = afterPaymentResponse;
    }

    public final void N1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.H = vahanProService;
    }

    public final void O1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.G = hVar;
    }

    public final void P1(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new ie.m(dialog));
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
        N1(VahanProService.f21196b.b(this));
        O1((h) new u0((x0) this, (u0.b) new g(new wg.d(x1()))).a(h.class));
        K1(new ld.c(this));
        L1(new ProgressDialog(this));
        w1().setMessage("Please wait...");
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        w1().show();
        J1(String.valueOf(getIntent().getStringExtra("EncString")));
        Bundle extras = getIntent().getExtras();
        String valueOf = String.valueOf(extras != null ? extras.get("ServiceName") : null);
        a7 a7Var2 = this.K;
        if (a7Var2 == null) {
            cm.l.v("binding");
            a7Var2 = null;
        }
        a7Var2.f25217s.f28308i.setText(valueOf);
        y1().p(this, u1());
        y1().w0().g(this, new c(new a(this)));
        y1().x0().g(this, new c(new b(this)));
        a7 a7Var3 = this.K;
        if (a7Var3 == null) {
            cm.l.v("binding");
            a7Var3 = null;
        }
        a7Var3.f25217s.f28305f.setOnClickListener(new ie.g(this));
        a7 a7Var4 = this.K;
        if (a7Var4 == null) {
            cm.l.v("binding");
            a7Var4 = null;
        }
        a7Var4.f25217s.f28306g.setOnClickListener(new ie.h(this));
        a7 a7Var5 = this.K;
        if (a7Var5 == null) {
            cm.l.v("binding");
            a7Var5 = null;
        }
        a7Var5.f25217s.f28306g.setOnClickListener(new i(this));
        a7 a7Var6 = this.K;
        if (a7Var6 == null) {
            cm.l.v("binding");
            a7Var6 = null;
        }
        a7Var6.f25204f.setOnClickListener(new j(this));
        a7 a7Var7 = this.K;
        if (a7Var7 == null) {
            cm.l.v("binding");
            a7Var7 = null;
        }
        a7Var7.f25219u.setOnClickListener(new k(this));
        a7 a7Var8 = this.K;
        if (a7Var8 == null) {
            cm.l.v("binding");
        } else {
            a7Var = a7Var8;
        }
        a7Var.f25207i.setOnClickListener(new ie.l(this));
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
        ((TextView) findViewById2).setOnClickListener(new ie.e(dialog, this));
        ((TextView) findViewById3).setOnClickListener(new f(dialog));
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

    public final ld.c v1() {
        ld.c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final VahanProService x1() {
        VahanProService vahanProService = this.H;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final h y1() {
        h hVar = this.G;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }
}
