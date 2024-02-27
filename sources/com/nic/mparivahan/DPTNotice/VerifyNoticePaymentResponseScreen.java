package com.nic.mparivahan.DPTNotice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import cm.l;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import fa.v;
import fa.w;
import ld.c;
import ni.i9;

public final class VerifyNoticePaymentResponseScreen extends d {
    private i9 G;
    private String H = "";
    private String I = "";
    private String J = "";
    private String K = "";
    private String L = "";
    private String M = "";
    private String N = "";
    private String O = "";
    private String P = "";
    public c Q;

    private final void i1() {
        AppCompatTextView appCompatTextView;
        MyTextView myTextView;
        c h12;
        String string;
        String str;
        String b10;
        i9 i9Var = this.G;
        i9 i9Var2 = null;
        if (i9Var == null) {
            l.v("binding");
            i9Var = null;
        }
        i9Var.B.f28305f.setOnClickListener(new v(this));
        if (this.K.length() > 0) {
            if (p.o(this.K, "Cash", true) || p.o(this.K, "Success", true)) {
                i9 i9Var3 = this.G;
                if (i9Var3 == null) {
                    l.v("binding");
                    i9Var3 = null;
                }
                i9Var3.C.setImageResource(R.drawable.verified);
                i9 i9Var4 = this.G;
                if (i9Var4 == null) {
                    l.v("binding");
                    i9Var4 = null;
                }
                i9Var4.D.setText(h1().b("title_challan_trans_success", getString(R.string.transaction_success)));
                i9 i9Var5 = this.G;
                if (i9Var5 == null) {
                    l.v("binding");
                    i9Var5 = null;
                }
                i9Var5.D.setTextColor(a.c(this, R.color.green_new));
                i9 i9Var6 = this.G;
                if (i9Var6 == null) {
                    l.v("binding");
                    i9Var6 = null;
                }
                myTextView = i9Var6.f26823y;
                h12 = h1();
                string = getString(R.string.print_receipt);
                str = "label_challan_print_receipt";
                b10 = h12.b(str, string);
            } else if (p.o(this.K, "Pending", true)) {
                i9 i9Var7 = this.G;
                if (i9Var7 == null) {
                    l.v("binding");
                    i9Var7 = null;
                }
                i9Var7.C.setImageResource(R.drawable.new_pending);
                i9 i9Var8 = this.G;
                if (i9Var8 == null) {
                    l.v("binding");
                    i9Var8 = null;
                }
                i9Var8.D.setText(h1().b("title_challan_trans_pending", getString(R.string.transaction_pending)));
                i9 i9Var9 = this.G;
                if (i9Var9 == null) {
                    l.v("binding");
                    i9Var9 = null;
                }
                i9Var9.D.setTextColor(a.c(this, R.color.blue_new));
                i9 i9Var10 = this.G;
                if (i9Var10 == null) {
                    l.v("binding");
                    i9Var10 = null;
                }
                myTextView = i9Var10.f26823y;
                b10 = h1().b("btn_go_back", "Go Back");
            } else if (p.o(this.K, "Failed", true)) {
                i9 i9Var11 = this.G;
                if (i9Var11 == null) {
                    l.v("binding");
                    i9Var11 = null;
                }
                i9Var11.C.setImageResource(R.drawable.payment_failed);
                i9 i9Var12 = this.G;
                if (i9Var12 == null) {
                    l.v("binding");
                    i9Var12 = null;
                }
                i9Var12.D.setText(h1().b("title_challan_trans_failed", getString(R.string.transaction_failed)));
                i9 i9Var13 = this.G;
                if (i9Var13 == null) {
                    l.v("binding");
                    i9Var13 = null;
                }
                i9Var13.D.setTextColor(a.c(this, R.color.red_new));
                i9 i9Var14 = this.G;
                if (i9Var14 == null) {
                    l.v("binding");
                    i9Var14 = null;
                }
                myTextView = i9Var14.f26823y;
                h12 = h1();
                string = getString(R.string.payment_try_again);
                str = "btn_try_again";
                b10 = h12.b(str, string);
            }
            myTextView.setText(b10);
        }
        String str2 = "";
        if (this.H.length() > 0) {
            i9 i9Var15 = this.G;
            if (i9Var15 == null) {
                l.v("binding");
                i9Var15 = null;
            }
            i9Var15.A.setText(this.H);
        } else {
            i9 i9Var16 = this.G;
            if (i9Var16 == null) {
                l.v("binding");
                i9Var16 = null;
            }
            i9Var16.A.setText(str2);
        }
        if (this.I.length() > 0) {
            i9 i9Var17 = this.G;
            if (i9Var17 == null) {
                l.v("binding");
                i9Var17 = null;
            }
            i9Var17.E.setText(this.I);
        } else {
            i9 i9Var18 = this.G;
            if (i9Var18 == null) {
                l.v("binding");
                i9Var18 = null;
            }
            i9Var18.E.setText(str2);
        }
        if (this.M.length() > 0) {
            i9 i9Var19 = this.G;
            if (i9Var19 == null) {
                l.v("binding");
                i9Var19 = null;
            }
            appCompatTextView = i9Var19.f26822x;
            str2 = this.M;
        } else {
            i9 i9Var20 = this.G;
            if (i9Var20 == null) {
                l.v("binding");
                i9Var20 = null;
            }
            appCompatTextView = i9Var20.f26822x;
        }
        appCompatTextView.setText(str2);
        i9 i9Var21 = this.G;
        if (i9Var21 == null) {
            l.v("binding");
        } else {
            i9Var2 = i9Var21;
        }
        i9Var2.f26823y.setOnClickListener(new w(this));
    }

    /* access modifiers changed from: private */
    public static final void j1(VerifyNoticePaymentResponseScreen verifyNoticePaymentResponseScreen, View view) {
        l.f(verifyNoticePaymentResponseScreen, "this$0");
        verifyNoticePaymentResponseScreen.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void k1(VerifyNoticePaymentResponseScreen verifyNoticePaymentResponseScreen, View view) {
        l.f(verifyNoticePaymentResponseScreen, "this$0");
        if (!l.a(verifyNoticePaymentResponseScreen.K, "Cash") && !l.a(verifyNoticePaymentResponseScreen.K, "Success")) {
            Intent intent = new Intent(verifyNoticePaymentResponseScreen, NoticeSearch.class);
            intent.setFlags(67108864);
            intent.putExtra("serviceName", verifyNoticePaymentResponseScreen.P);
            verifyNoticePaymentResponseScreen.startActivity(intent);
            verifyNoticePaymentResponseScreen.finish();
        } else if (verifyNoticePaymentResponseScreen.L.length() > 0) {
            Intent intent2 = new Intent(verifyNoticePaymentResponseScreen, DownloadNoticeActivity.class);
            intent2.putExtra("challanPdfUrl", verifyNoticePaymentResponseScreen.L);
            intent2.putExtra("challanNo", verifyNoticePaymentResponseScreen.H);
            intent2.putExtra("fromActivity", "byPassPayment");
            verifyNoticePaymentResponseScreen.startActivity(intent2);
        }
    }

    public final c h1() {
        c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final void l1(c cVar) {
        l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, NoticeSearch.class);
        intent.setFlags(67108864);
        intent.putExtra("serviceName", this.P);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i9 x10 = i9.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        this.G = x10;
        if (x10 == null) {
            l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        l1(new c(this));
        String stringExtra = getIntent().getStringExtra("challanNo");
        l.c(stringExtra);
        this.H = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("vehicleNo");
        l.c(stringExtra2);
        this.I = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("transactionId");
        l.c(stringExtra3);
        this.J = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("status");
        l.c(stringExtra4);
        this.K = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("challanPdfUrl");
        l.c(stringExtra5);
        this.L = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("amount");
        l.c(stringExtra6);
        this.M = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("serviceName");
        l.c(stringExtra7);
        this.P = stringExtra7;
        if (getIntent().hasExtra("paymentDate")) {
            String stringExtra8 = getIntent().getStringExtra("paymentDate");
            l.c(stringExtra8);
            this.N = stringExtra8;
        }
        if (getIntent().hasExtra("receiptNo")) {
            String stringExtra9 = getIntent().getStringExtra("receiptNo");
            l.c(stringExtra9);
            this.O = stringExtra9;
        }
        i1();
    }
}
