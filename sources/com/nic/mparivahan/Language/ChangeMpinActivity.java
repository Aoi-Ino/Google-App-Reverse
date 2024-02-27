package com.nic.mparivahan.Language;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.m;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.Account.View.ChangeMpinOtpVerif;
import com.nic.mparivahan.Account.View.SignInScreen;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import ld.c;
import ld.g;
import ni.x9;
import pl.x;
import v8.h;
import v9.d;
import v9.e;
import yb.e;
import yb.f;

public final class ChangeMpinActivity extends d {
    /* access modifiers changed from: private */
    public x9 G;
    public c H;
    private final String I = "0123456789";
    public h J;
    private SignService K;
    public ProgressDialog L;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeMpinActivity f9253e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f9254f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ChangeMpinActivity changeMpinActivity, g gVar) {
            super(1);
            this.f9253e = changeMpinActivity;
            this.f9254f = gVar;
        }

        public final void b(SendOtpResult sendOtpResult) {
            try {
                this.f9253e.q1().dismiss();
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    Intent intent = new Intent(this.f9253e, ChangeMpinOtpVerif.class);
                    intent.putExtra("otpId", String.valueOf(sendOtpResult.getRecordId()));
                    intent.putExtra("MobileNumber", this.f9254f.l());
                    intent.putExtra("RecreateFlag", 0);
                    x9 p12 = this.f9253e.G;
                    if (p12 == null) {
                        cm.l.v("binding");
                        p12 = null;
                    }
                    intent.putExtra("NewMpin", p12.f29388d.getText().toString());
                    intent.putExtra("title", this.f9253e.r1().b("generate", "Generate"));
                    this.f9253e.startActivity(intent);
                } else if (!ka.c.f13158a.m(sendOtpResult.getStatusDesc())) {
                    ChangeMpinActivity changeMpinActivity = this.f9253e;
                    changeMpinActivity.B1(changeMpinActivity, sendOtpResult.getStatusDesc());
                } else {
                    Toast.makeText(this.f9253e.getApplicationContext(), this.f9253e.r1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
                }
            } catch (Exception unused) {
                Toast.makeText(this.f9253e.getApplicationContext(), this.f9253e.r1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9255a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f9255a = lVar;
        }

        public final pl.c a() {
            return this.f9255a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9255a.invoke(obj);
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

    private final void A1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void C1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (r0 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (r0 == null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f1, code lost:
        if (r0 == null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012b, code lost:
        if (r0 == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0131, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0167, code lost:
        if (r0 == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b3, code lost:
        if (r0 == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0208, code lost:
        if (r0 == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r0 == null) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean G1() {
        /*
            r7 = this;
            ni.x9 r0 = r7.G
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            android.widget.EditText r0 = r0.f29389e
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r3 = 0
            if (r0 != 0) goto L_0x0048
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x0024
            cm.l.v(r2)
            r0 = r1
        L_0x0024:
            android.widget.EditText r0 = r0.f29389e
            ld.c r4 = r7.r1()
            v9.f$a r5 = v9.f.f17510a
            java.lang.String r5 = r5.s()
            java.lang.String r6 = "Please enter the old MPIN"
            java.lang.String r4 = r4.b(r5, r6)
            r0.setError(r4)
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x0041
        L_0x003d:
            cm.l.v(r2)
            goto L_0x0042
        L_0x0041:
            r1 = r0
        L_0x0042:
            android.widget.EditText r0 = r1.f29389e
        L_0x0044:
            r0.requestFocus()
            return r3
        L_0x0048:
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x0050
            cm.l.v(r2)
            r0 = r1
        L_0x0050:
            android.widget.EditText r0 = r0.f29389e
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            java.lang.String r4 = "Please enter 6 digit MPIN"
            r5 = 6
            if (r0 >= r5) goto L_0x007f
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x0067
            cm.l.v(r2)
            r0 = r1
        L_0x0067:
            android.widget.EditText r0 = r0.f29389e
            ld.c r5 = r7.r1()
            v9.f$a r6 = v9.f.f17510a
            java.lang.String r6 = r6.x0()
            java.lang.String r4 = r5.b(r6, r4)
            r0.setError(r4)
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x0041
            goto L_0x003d
        L_0x007f:
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x0087
            cm.l.v(r2)
            r0 = r1
        L_0x0087:
            android.widget.EditText r0 = r0.f29388d
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00c0
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x009f
            cm.l.v(r2)
            r0 = r1
        L_0x009f:
            android.widget.EditText r0 = r0.f29388d
            ld.c r4 = r7.r1()
            v9.f$a r5 = v9.f.f17510a
            java.lang.String r5 = r5.w0()
            java.lang.String r6 = "Please enter the new MPIN"
            java.lang.String r4 = r4.b(r5, r6)
            r0.setError(r4)
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x00bc
        L_0x00b8:
            cm.l.v(r2)
            goto L_0x00bd
        L_0x00bc:
            r1 = r0
        L_0x00bd:
            android.widget.EditText r0 = r1.f29388d
            goto L_0x0044
        L_0x00c0:
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x00c8
            cm.l.v(r2)
            r0 = r1
        L_0x00c8:
            android.widget.EditText r0 = r0.f29388d
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            if (r0 >= r5) goto L_0x00f4
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x00dc
            cm.l.v(r2)
            r0 = r1
        L_0x00dc:
            android.widget.EditText r0 = r0.f29388d
            ld.c r5 = r7.r1()
            v9.f$a r6 = v9.f.f17510a
            java.lang.String r6 = r6.x0()
            java.lang.String r4 = r5.b(r6, r4)
            r0.setError(r4)
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x00bc
            goto L_0x00b8
        L_0x00f4:
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x00fc
            cm.l.v(r2)
            r0 = r1
        L_0x00fc:
            android.widget.EditText r0 = r0.f29387c
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0136
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x0114
            cm.l.v(r2)
            r0 = r1
        L_0x0114:
            android.widget.EditText r0 = r0.f29387c
            ld.c r4 = r7.r1()
            v9.f$a r5 = v9.f.f17510a
            java.lang.String r5 = r5.u0()
            java.lang.String r6 = "Please enter the confirm MPIN"
            java.lang.String r4 = r4.b(r5, r6)
            r0.setError(r4)
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x0131
        L_0x012d:
            cm.l.v(r2)
            goto L_0x0132
        L_0x0131:
            r1 = r0
        L_0x0132:
            android.widget.EditText r0 = r1.f29387c
            goto L_0x0044
        L_0x0136:
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x013e
            cm.l.v(r2)
            r0 = r1
        L_0x013e:
            android.widget.EditText r0 = r0.f29387c
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            if (r0 >= r5) goto L_0x016a
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x0152
            cm.l.v(r2)
            r0 = r1
        L_0x0152:
            android.widget.EditText r0 = r0.f29387c
            ld.c r5 = r7.r1()
            v9.f$a r6 = v9.f.f17510a
            java.lang.String r6 = r6.x0()
            java.lang.String r4 = r5.b(r6, r4)
            r0.setError(r4)
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x0131
            goto L_0x012d
        L_0x016a:
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x0172
            cm.l.v(r2)
            r0 = r1
        L_0x0172:
            android.widget.EditText r0 = r0.f29388d
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            ni.x9 r4 = r7.G
            if (r4 != 0) goto L_0x0184
            cm.l.v(r2)
            r4 = r1
        L_0x0184:
            android.widget.EditText r4 = r4.f29387c
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            boolean r0 = cm.l.a(r0, r4)
            if (r0 != 0) goto L_0x01b7
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x019c
            cm.l.v(r2)
            r0 = r1
        L_0x019c:
            android.widget.EditText r0 = r0.f29387c
            ld.c r4 = r7.r1()
            v9.f$a r5 = v9.f.f17510a
            java.lang.String r5 = r5.v0()
            java.lang.String r6 = "Please enter correct MPIN"
            java.lang.String r4 = r4.b(r5, r6)
            r0.setError(r4)
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x0131
            goto L_0x012d
        L_0x01b7:
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x01bf
            cm.l.v(r2)
            r0 = r1
        L_0x01bf:
            android.widget.EditText r0 = r0.f29389e
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = km.q.B0(r0)
            java.lang.String r0 = r0.toString()
            ni.x9 r4 = r7.G
            if (r4 != 0) goto L_0x01d9
            cm.l.v(r2)
            r4 = r1
        L_0x01d9:
            android.widget.EditText r4 = r4.f29388d
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            boolean r0 = cm.l.a(r0, r4)
            if (r0 == 0) goto L_0x020c
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x01f1
            cm.l.v(r2)
            r0 = r1
        L_0x01f1:
            android.widget.EditText r0 = r0.f29388d
            ld.c r4 = r7.r1()
            v9.f$a r5 = v9.f.f17510a
            java.lang.String r5 = r5.b0()
            java.lang.String r6 = "Old MPIN & New MPIN can not be same"
            java.lang.String r4 = r4.b(r5, r6)
            r0.setError(r4)
            ni.x9 r0 = r7.G
            if (r0 != 0) goto L_0x0131
            goto L_0x012d
        L_0x020c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Language.ChangeMpinActivity.G1():boolean");
    }

    /* access modifiers changed from: private */
    public static final void o1(Dialog dialog, int i10, ChangeMpinActivity changeMpinActivity, View view) {
        cm.l.f(dialog, "$dialog");
        cm.l.f(changeMpinActivity, "this$0");
        dialog.dismiss();
        if (i10 == 1) {
            Intent intent = new Intent(changeMpinActivity, SignInScreen.class);
            intent.addFlags(67108864);
            changeMpinActivity.startActivity(intent);
            changeMpinActivity.finish();
        }
    }

    private final void t1() {
        g gVar = new g(this);
        x9 x9Var = this.G;
        x9 x9Var2 = null;
        if (x9Var == null) {
            cm.l.v("binding");
            x9Var = null;
        }
        x9Var.f29389e.setKeyListener(DigitsKeyListener.getInstance(this.I));
        x9 x9Var3 = this.G;
        if (x9Var3 == null) {
            cm.l.v("binding");
            x9Var3 = null;
        }
        x9Var3.f29389e.setRawInputType(2);
        x9 x9Var4 = this.G;
        if (x9Var4 == null) {
            cm.l.v("binding");
            x9Var4 = null;
        }
        x9Var4.f29388d.setKeyListener(DigitsKeyListener.getInstance(this.I));
        x9 x9Var5 = this.G;
        if (x9Var5 == null) {
            cm.l.v("binding");
            x9Var5 = null;
        }
        x9Var5.f29388d.setRawInputType(2);
        x9 x9Var6 = this.G;
        if (x9Var6 == null) {
            cm.l.v("binding");
            x9Var6 = null;
        }
        x9Var6.f29387c.setKeyListener(DigitsKeyListener.getInstance(this.I));
        x9 x9Var7 = this.G;
        if (x9Var7 == null) {
            cm.l.v("binding");
            x9Var7 = null;
        }
        x9Var7.f29387c.setRawInputType(2);
        x9 x9Var8 = this.G;
        if (x9Var8 == null) {
            cm.l.v("binding");
            x9Var8 = null;
        }
        x9Var8.f29392h.setOnClickListener(new yb.a(this));
        x9 x9Var9 = this.G;
        if (x9Var9 == null) {
            cm.l.v("binding");
            x9Var9 = null;
        }
        x9Var9.f29391g.setOnClickListener(new yb.b(this));
        x9 x9Var10 = this.G;
        if (x9Var10 == null) {
            cm.l.v("binding");
            x9Var10 = null;
        }
        x9Var10.f29390f.setOnClickListener(new yb.c(this));
        x9 x9Var11 = this.G;
        if (x9Var11 == null) {
            cm.l.v("binding");
            x9Var11 = null;
        }
        x9Var11.f29386b.setOnClickListener(new yb.d(this, gVar));
        x9 x9Var12 = this.G;
        if (x9Var12 == null) {
            cm.l.v("binding");
            x9Var12 = null;
        }
        x9Var12.f29393i.f28305f.setOnClickListener(new e(this));
        x9 x9Var13 = this.G;
        if (x9Var13 == null) {
            cm.l.v("binding");
        } else {
            x9Var2 = x9Var13;
        }
        x9Var2.f29393i.f28306g.setOnClickListener(new f(this));
        s1().u().g(this, new b(new a(this, gVar)));
    }

    /* access modifiers changed from: private */
    public static final void u1(ChangeMpinActivity changeMpinActivity, View view) {
        ImageView imageView;
        int i10;
        cm.l.f(changeMpinActivity, "this$0");
        x9 x9Var = changeMpinActivity.G;
        x9 x9Var2 = null;
        if (x9Var == null) {
            cm.l.v("binding");
            x9Var = null;
        }
        if (x9Var.f29389e.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            x9 x9Var3 = changeMpinActivity.G;
            if (x9Var3 == null) {
                cm.l.v("binding");
                x9Var3 = null;
            }
            x9Var3.f29389e.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            x9 x9Var4 = changeMpinActivity.G;
            if (x9Var4 == null) {
                cm.l.v("binding");
            } else {
                x9Var2 = x9Var4;
            }
            imageView = x9Var2.f29392h;
            i10 = R.drawable.pass_visible;
        } else {
            x9 x9Var5 = changeMpinActivity.G;
            if (x9Var5 == null) {
                cm.l.v("binding");
                x9Var5 = null;
            }
            x9Var5.f29389e.setTransformationMethod(PasswordTransformationMethod.getInstance());
            x9 x9Var6 = changeMpinActivity.G;
            if (x9Var6 == null) {
                cm.l.v("binding");
            } else {
                x9Var2 = x9Var6;
            }
            imageView = x9Var2.f29392h;
            i10 = R.drawable.mvvm_visibility;
        }
        imageView.setImageResource(i10);
    }

    /* access modifiers changed from: private */
    public static final void v1(ChangeMpinActivity changeMpinActivity, View view) {
        ImageView imageView;
        int i10;
        cm.l.f(changeMpinActivity, "this$0");
        x9 x9Var = changeMpinActivity.G;
        x9 x9Var2 = null;
        if (x9Var == null) {
            cm.l.v("binding");
            x9Var = null;
        }
        if (x9Var.f29388d.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            x9 x9Var3 = changeMpinActivity.G;
            if (x9Var3 == null) {
                cm.l.v("binding");
                x9Var3 = null;
            }
            x9Var3.f29388d.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            x9 x9Var4 = changeMpinActivity.G;
            if (x9Var4 == null) {
                cm.l.v("binding");
            } else {
                x9Var2 = x9Var4;
            }
            imageView = x9Var2.f29391g;
            i10 = R.drawable.pass_visible;
        } else {
            x9 x9Var5 = changeMpinActivity.G;
            if (x9Var5 == null) {
                cm.l.v("binding");
                x9Var5 = null;
            }
            x9Var5.f29388d.setTransformationMethod(PasswordTransformationMethod.getInstance());
            x9 x9Var6 = changeMpinActivity.G;
            if (x9Var6 == null) {
                cm.l.v("binding");
            } else {
                x9Var2 = x9Var6;
            }
            imageView = x9Var2.f29391g;
            i10 = R.drawable.mvvm_visibility;
        }
        imageView.setImageResource(i10);
    }

    /* access modifiers changed from: private */
    public static final void w1(ChangeMpinActivity changeMpinActivity, View view) {
        ImageView imageView;
        int i10;
        cm.l.f(changeMpinActivity, "this$0");
        x9 x9Var = changeMpinActivity.G;
        x9 x9Var2 = null;
        if (x9Var == null) {
            cm.l.v("binding");
            x9Var = null;
        }
        if (x9Var.f29387c.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            x9 x9Var3 = changeMpinActivity.G;
            if (x9Var3 == null) {
                cm.l.v("binding");
                x9Var3 = null;
            }
            x9Var3.f29387c.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            x9 x9Var4 = changeMpinActivity.G;
            if (x9Var4 == null) {
                cm.l.v("binding");
            } else {
                x9Var2 = x9Var4;
            }
            imageView = x9Var2.f29390f;
            i10 = R.drawable.pass_visible;
        } else {
            x9 x9Var5 = changeMpinActivity.G;
            if (x9Var5 == null) {
                cm.l.v("binding");
                x9Var5 = null;
            }
            x9Var5.f29387c.setTransformationMethod(PasswordTransformationMethod.getInstance());
            x9 x9Var6 = changeMpinActivity.G;
            if (x9Var6 == null) {
                cm.l.v("binding");
            } else {
                x9Var2 = x9Var6;
            }
            imageView = x9Var2.f29390f;
            i10 = R.drawable.mvvm_visibility;
        }
        imageView.setImageResource(i10);
    }

    /* access modifiers changed from: private */
    public static final void x1(ChangeMpinActivity changeMpinActivity, g gVar, View view) {
        Context applicationContext;
        c r12;
        String n02;
        String str;
        cm.l.f(changeMpinActivity, "this$0");
        cm.l.f(gVar, "$session_manger");
        g gVar2 = new g(changeMpinActivity);
        if (changeMpinActivity.G1()) {
            int parseInt = Integer.parseInt(gVar.m());
            x9 x9Var = changeMpinActivity.G;
            x9 x9Var2 = null;
            if (x9Var == null) {
                cm.l.v("binding");
                x9Var = null;
            }
            if (parseInt == Integer.parseInt(x9Var.f29389e.getText().toString())) {
                d.a aVar = v9.d.f17494a;
                x9 x9Var3 = changeMpinActivity.G;
                if (x9Var3 == null) {
                    cm.l.v("binding");
                    x9Var3 = null;
                }
                if (aVar.B(x9Var3.f29388d.getText().toString(), gVar2.m())) {
                    applicationContext = changeMpinActivity.getApplicationContext();
                    r12 = changeMpinActivity.r1();
                    n02 = v9.f.f17510a.m0();
                    str = "The mPin You Have Entered Matches With the Previous mPin";
                } else {
                    x9 x9Var4 = changeMpinActivity.G;
                    if (x9Var4 == null) {
                        cm.l.v("binding");
                    } else {
                        x9Var2 = x9Var4;
                    }
                    if (aVar.C(x9Var2.f29388d.getText().toString())) {
                        applicationContext = changeMpinActivity.getApplicationContext();
                        r12 = changeMpinActivity.r1();
                        n02 = v9.f.f17510a.n0();
                        str = "Please choose a more diverse password. Avoid using all the same digits.";
                    } else {
                        changeMpinActivity.q1().show();
                        changeMpinActivity.s1().z(gVar.l(), gVar.k());
                        return;
                    }
                }
                Toast.makeText(applicationContext, r12.b(n02, str), 1).show();
                return;
            }
            String b10 = changeMpinActivity.r1().b(v9.f.f17510a.c0(), "Old MPIN does not match. Please try again.");
            cm.l.c(b10);
            changeMpinActivity.n1(changeMpinActivity, b10, 0);
        }
    }

    /* access modifiers changed from: private */
    public static final void y1(ChangeMpinActivity changeMpinActivity, View view) {
        cm.l.f(changeMpinActivity, "this$0");
        changeMpinActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void z1(ChangeMpinActivity changeMpinActivity, View view) {
        cm.l.f(changeMpinActivity, "this$0");
        changeMpinActivity.A1();
    }

    public final void B1(Context context, String str) {
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
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(r1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(r1().b("btn_ok", "OK"));
        textView.setOnClickListener(new yb.h(dialog));
        dialog.show();
    }

    public final void D1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void E1(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.H = cVar;
    }

    public final void F1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.J = hVar;
    }

    public final void n1(Context context, String str, int i10) {
        cm.l.f(context, "context");
        cm.l.f(str, "title");
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View findViewById = dialog.findViewById(R.id.txt_dialog);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        View findViewById2 = dialog.findViewById(R.id.f19013ok);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(r1().b("btn_ok", "OK"));
        textView.setOnClickListener(new yb.g(dialog, i10, this));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.change_mpin);
        x9 c10 = x9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        SignService signService = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        x9 x9Var = this.G;
        if (x9Var == null) {
            cm.l.v("binding");
            x9Var = null;
        }
        aVar.N(this, x9Var);
        E1(new c(this));
        x9 x9Var2 = this.G;
        if (x9Var2 == null) {
            cm.l.v("binding");
            x9Var2 = null;
        }
        x9Var2.f29393i.f28308i.setText(r1().b(v9.f.f17510a.d(), "Change MPIN"));
        D1(new ProgressDialog(this));
        q1().setMessage(r1().b("label_challan_please_wait", "Please wait..."));
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        this.K = SignService.f7644a.c(this);
        SignService signService2 = this.K;
        if (signService2 == null) {
            cm.l.v("retrofitService");
        } else {
            signService = signService2;
        }
        F1((h) new u0((x0) this, (u0.b) new v8.g(new s8.b(signService))).a(h.class));
        t1();
    }

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final c r1() {
        c cVar = this.H;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final h s1() {
        h hVar = this.J;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }
}
