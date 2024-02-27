package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.h;
import cm.l;
import cm.m;
import cm.u;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import ni.l9;
import pl.x;
import v9.e;

public final class VahanVerifyPendingTransaction extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public l9 G;
    /* access modifiers changed from: private */
    public String H = "Transaction";
    private bi.b I;
    private ApplicationService J;
    public ProgressDialog K;
    public ld.c L;

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanVerifyPendingTransaction f20818e;

        a(VahanVerifyPendingTransaction vahanVerifyPendingTransaction) {
            this.f20818e = vahanVerifyPendingTransaction;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.c(charSequence);
            if (charSequence.length() > 0) {
                l9 n12 = this.f20818e.G;
                if (n12 == null) {
                    l.v("binding");
                    n12 = null;
                }
                n12.f27311f.setError((CharSequence) null);
            }
        }
    }

    public static final class b implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanVerifyPendingTransaction f20819e;

        b(VahanVerifyPendingTransaction vahanVerifyPendingTransaction) {
            this.f20819e = vahanVerifyPendingTransaction;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.c(charSequence);
            if (charSequence.length() > 0) {
                l9 n12 = this.f20819e.G;
                if (n12 == null) {
                    l.v("binding");
                    n12 = null;
                }
                n12.f27310e.setError((CharSequence) null);
            }
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanVerifyPendingTransaction f20820e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanVerifyPendingTransaction vahanVerifyPendingTransaction) {
            super(1);
            this.f20820e = vahanVerifyPendingTransaction;
        }

        public final void b(PendingTransRegNoModel pendingTransRegNoModel) {
            if (this.f20820e.t1().isShowing()) {
                this.f20820e.t1().dismiss();
            }
            i7.d dVar = new i7.d();
            if (pendingTransRegNoModel.size() > 0) {
                Intent intent = new Intent(this.f20820e, VahanVerifyPendingTransactionList.class);
                intent.putExtra("selectedTab", this.f20820e.H);
                l9 n12 = this.f20820e.G;
                if (n12 == null) {
                    l.v("binding");
                    n12 = null;
                }
                intent.putExtra("inputNo", n12.f27311f.getText().toString());
                intent.putExtra("listValue", dVar.t(pendingTransRegNoModel));
                this.f20820e.startActivity(intent);
                return;
            }
            VahanVerifyPendingTransaction vahanVerifyPendingTransaction = this.f20820e;
            vahanVerifyPendingTransaction.E1(vahanVerifyPendingTransaction, vahanVerifyPendingTransaction.q1().b("no_pending_trans", "No pending transaction found for this application no."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((PendingTransRegNoModel) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanVerifyPendingTransaction f20821e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanVerifyPendingTransaction vahanVerifyPendingTransaction) {
            super(1);
            this.f20821e = vahanVerifyPendingTransaction;
        }

        public final void b(PendingTransRegNoModel pendingTransRegNoModel) {
            if (this.f20821e.t1().isShowing()) {
                this.f20821e.t1().dismiss();
            }
            i7.d dVar = new i7.d();
            if (pendingTransRegNoModel.size() > 0) {
                Intent intent = new Intent(this.f20821e, VahanVerifyPendingTransactionList.class);
                intent.putExtra("selectedTab", this.f20821e.H);
                l9 n12 = this.f20821e.G;
                if (n12 == null) {
                    l.v("binding");
                    n12 = null;
                }
                intent.putExtra("inputNo", n12.f27311f.getText().toString());
                intent.putExtra("listValue", dVar.t(pendingTransRegNoModel));
                this.f20821e.startActivity(intent);
                return;
            }
            VahanVerifyPendingTransaction vahanVerifyPendingTransaction = this.f20821e;
            vahanVerifyPendingTransaction.E1(vahanVerifyPendingTransaction, vahanVerifyPendingTransaction.q1().b("no_pending_trans", "No pending transaction found for this application no."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((PendingTransRegNoModel) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanVerifyPendingTransaction f20822e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanVerifyPendingTransaction vahanVerifyPendingTransaction) {
            super(1);
            this.f20822e = vahanVerifyPendingTransaction;
        }

        public final void b(String str) {
            if (this.f20822e.t1().isShowing()) {
                this.f20822e.t1().dismiss();
            }
            if (str.toString().equals("ERROR")) {
                VahanVerifyPendingTransaction vahanVerifyPendingTransaction = this.f20822e;
                vahanVerifyPendingTransaction.E1(vahanVerifyPendingTransaction, vahanVerifyPendingTransaction.q1().b("no_pending_trans", "No pending transaction found for this application no."));
                return;
            }
            VahanVerifyPendingTransaction vahanVerifyPendingTransaction2 = this.f20822e;
            vahanVerifyPendingTransaction2.E1(vahanVerifyPendingTransaction2, str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f20823a;

        f(bm.l lVar) {
            l.f(lVar, "function");
            this.f20823a = lVar;
        }

        public final pl.c a() {
            return this.f20823a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20823a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void A1(VahanVerifyPendingTransaction vahanVerifyPendingTransaction, View view) {
        l.f(vahanVerifyPendingTransaction, "this$0");
        vahanVerifyPendingTransaction.finish();
    }

    private final void B1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void E1(Context context, String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        ld.c cVar = new ld.c(context);
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById4 = dialog.findViewById(R.id.cancle);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById4;
        textView2.setVisibility(8);
        textView.setText(cVar.b("btn_ok", getString(R.string.ok_text)));
        ((TextView) findViewById3).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new p1(dialog));
        textView2.setOnClickListener(new q1(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void F1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void G1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void r1(String str, String str2) {
        if (t1().isShowing()) {
            t1().dismiss();
        }
        t1().show();
        bi.b bVar = this.I;
        if (bVar == null) {
            l.v("viewModel");
            bVar = null;
        }
        bVar.t(this, str, str2);
    }

    private final void s1(String str) {
        if (t1().isShowing()) {
            t1().dismiss();
        }
        t1().show();
        bi.b bVar = this.I;
        if (bVar == null) {
            l.v("viewModel");
            bVar = null;
        }
        bVar.u(this, str);
    }

    private final void u1() {
        ApplicationService applicationService = this.J;
        l9 l9Var = null;
        if (applicationService == null) {
            l.v("retrofitService");
            applicationService = null;
        }
        this.I = (bi.b) new u0((x0) this, (u0.b) new bi.f(new wg.b(applicationService))).a(bi.b.class);
        u uVar = new u();
        uVar.f20234e = new ld.c(this);
        l9 l9Var2 = this.G;
        if (l9Var2 == null) {
            l.v("binding");
            l9Var2 = null;
        }
        l9Var2.f27317l.setOnClickListener(new r1(this, uVar));
        l9 l9Var3 = this.G;
        if (l9Var3 == null) {
            l.v("binding");
            l9Var3 = null;
        }
        l9Var3.f27314i.setOnClickListener(new s1(this, uVar));
        l9 l9Var4 = this.G;
        if (l9Var4 == null) {
            l.v("binding");
            l9Var4 = null;
        }
        l9Var4.f27311f.addTextChangedListener(new a(this));
        l9 l9Var5 = this.G;
        if (l9Var5 == null) {
            l.v("binding");
            l9Var5 = null;
        }
        l9Var5.f27310e.addTextChangedListener(new b(this));
        l9 l9Var6 = this.G;
        if (l9Var6 == null) {
            l.v("binding");
            l9Var6 = null;
        }
        l9Var6.f27309d.setOnClickListener(new t1(this, uVar));
        l9 l9Var7 = this.G;
        if (l9Var7 == null) {
            l.v("binding");
            l9Var7 = null;
        }
        l9Var7.f27312g.f25959e.setOnClickListener(new u1(this));
        l9 l9Var8 = this.G;
        if (l9Var8 == null) {
            l.v("binding");
        } else {
            l9Var = l9Var8;
        }
        l9Var.f27312g.f25957c.setOnClickListener(new v1(this));
    }

    /* access modifiers changed from: private */
    public static final void v1(VahanVerifyPendingTransaction vahanVerifyPendingTransaction, u uVar, View view) {
        l.f(vahanVerifyPendingTransaction, "this$0");
        l.f(uVar, "$languageSession");
        l9 l9Var = vahanVerifyPendingTransaction.G;
        l9 l9Var2 = null;
        if (l9Var == null) {
            l.v("binding");
            l9Var = null;
        }
        if (!l9Var.f27317l.isSelected()) {
            l9 l9Var3 = vahanVerifyPendingTransaction.G;
            if (l9Var3 == null) {
                l.v("binding");
                l9Var3 = null;
            }
            l9Var3.f27317l.setChecked(true);
            l9 l9Var4 = vahanVerifyPendingTransaction.G;
            if (l9Var4 == null) {
                l.v("binding");
                l9Var4 = null;
            }
            l9Var4.f27317l.setSelected(true);
            l9 l9Var5 = vahanVerifyPendingTransaction.G;
            if (l9Var5 == null) {
                l.v("binding");
                l9Var5 = null;
            }
            l9Var5.f27316k.setBackgroundResource(R.drawable.corner_circle_14_selected);
            l9 l9Var6 = vahanVerifyPendingTransaction.G;
            if (l9Var6 == null) {
                l.v("binding");
                l9Var6 = null;
            }
            l9Var6.f27314i.setChecked(false);
            l9 l9Var7 = vahanVerifyPendingTransaction.G;
            if (l9Var7 == null) {
                l.v("binding");
                l9Var7 = null;
            }
            l9Var7.f27314i.setSelected(false);
            l9 l9Var8 = vahanVerifyPendingTransaction.G;
            if (l9Var8 == null) {
                l.v("binding");
                l9Var8 = null;
            }
            l9Var8.f27311f.setText("");
            l9 l9Var9 = vahanVerifyPendingTransaction.G;
            if (l9Var9 == null) {
                l.v("binding");
                l9Var9 = null;
            }
            l9Var9.f27313h.setBackgroundResource(R.drawable.corner_circle_bg_14);
            l9 l9Var10 = vahanVerifyPendingTransaction.G;
            if (l9Var10 == null) {
                l.v("binding");
                l9Var10 = null;
            }
            l9Var10.f27310e.setVisibility(8);
            l9 l9Var11 = vahanVerifyPendingTransaction.G;
            if (l9Var11 == null) {
                l.v("binding");
                l9Var11 = null;
            }
            l9Var11.f27308c.setText(((ld.c) uVar.f20234e).b("vahan_application_no", "Application Number"));
            l9 l9Var12 = vahanVerifyPendingTransaction.G;
            if (l9Var12 == null) {
                l.v("binding");
                l9Var12 = null;
            }
            l9Var12.f27307b.setVisibility(8);
            l9 l9Var13 = vahanVerifyPendingTransaction.G;
            if (l9Var13 == null) {
                l.v("binding");
            } else {
                l9Var2 = l9Var13;
            }
            l9Var2.f27311f.setHint(((ld.c) uVar.f20234e).b(v9.f.f17510a.E(), "Enter Application Number"));
            vahanVerifyPendingTransaction.H = "Transaction";
            return;
        }
        l9 l9Var14 = vahanVerifyPendingTransaction.G;
        if (l9Var14 == null) {
            l.v("binding");
            l9Var14 = null;
        }
        l9Var14.f27317l.setChecked(false);
        l9 l9Var15 = vahanVerifyPendingTransaction.G;
        if (l9Var15 == null) {
            l.v("binding");
            l9Var15 = null;
        }
        l9Var15.f27317l.setSelected(false);
        l9 l9Var16 = vahanVerifyPendingTransaction.G;
        if (l9Var16 == null) {
            l.v("binding");
        } else {
            l9Var2 = l9Var16;
        }
        l9Var2.f27316k.setBackgroundResource(R.drawable.corner_circle_bg_14);
    }

    /* access modifiers changed from: private */
    public static final void w1(VahanVerifyPendingTransaction vahanVerifyPendingTransaction, u uVar, View view) {
        l.f(vahanVerifyPendingTransaction, "this$0");
        l.f(uVar, "$languageSession");
        l9 l9Var = vahanVerifyPendingTransaction.G;
        l9 l9Var2 = null;
        if (l9Var == null) {
            l.v("binding");
            l9Var = null;
        }
        if (!l9Var.f27314i.isSelected()) {
            l9 l9Var3 = vahanVerifyPendingTransaction.G;
            if (l9Var3 == null) {
                l.v("binding");
                l9Var3 = null;
            }
            l9Var3.f27314i.setChecked(true);
            l9 l9Var4 = vahanVerifyPendingTransaction.G;
            if (l9Var4 == null) {
                l.v("binding");
                l9Var4 = null;
            }
            l9Var4.f27314i.setSelected(true);
            l9 l9Var5 = vahanVerifyPendingTransaction.G;
            if (l9Var5 == null) {
                l.v("binding");
                l9Var5 = null;
            }
            l9Var5.f27313h.setBackgroundResource(R.drawable.corner_circle_14_selected);
            l9 l9Var6 = vahanVerifyPendingTransaction.G;
            if (l9Var6 == null) {
                l.v("binding");
                l9Var6 = null;
            }
            l9Var6.f27317l.setChecked(false);
            l9 l9Var7 = vahanVerifyPendingTransaction.G;
            if (l9Var7 == null) {
                l.v("binding");
                l9Var7 = null;
            }
            l9Var7.f27317l.setSelected(false);
            l9 l9Var8 = vahanVerifyPendingTransaction.G;
            if (l9Var8 == null) {
                l.v("binding");
                l9Var8 = null;
            }
            l9Var8.f27316k.setBackgroundResource(R.drawable.corner_circle_bg_14);
            l9 l9Var9 = vahanVerifyPendingTransaction.G;
            if (l9Var9 == null) {
                l.v("binding");
                l9Var9 = null;
            }
            l9Var9.f27310e.setVisibility(0);
            l9 l9Var10 = vahanVerifyPendingTransaction.G;
            if (l9Var10 == null) {
                l.v("binding");
                l9Var10 = null;
            }
            l9Var10.f27311f.setHint(((ld.c) uVar.f20234e).b("vahan_enter_registration_no", "Enter Registration Number"));
            l9 l9Var11 = vahanVerifyPendingTransaction.G;
            if (l9Var11 == null) {
                l.v("binding");
                l9Var11 = null;
            }
            l9Var11.f27311f.setText("");
            vahanVerifyPendingTransaction.H = "RC";
            l9 l9Var12 = vahanVerifyPendingTransaction.G;
            if (l9Var12 == null) {
                l.v("binding");
                l9Var12 = null;
            }
            l9Var12.f27308c.setText(((ld.c) uVar.f20234e).b("vahan_registration_no", "Registration Number"));
            l9 l9Var13 = vahanVerifyPendingTransaction.G;
            if (l9Var13 == null) {
                l.v("binding");
            } else {
                l9Var2 = l9Var13;
            }
            l9Var2.f27307b.setVisibility(0);
            return;
        }
        l9 l9Var14 = vahanVerifyPendingTransaction.G;
        if (l9Var14 == null) {
            l.v("binding");
            l9Var14 = null;
        }
        l9Var14.f27314i.setChecked(false);
        l9 l9Var15 = vahanVerifyPendingTransaction.G;
        if (l9Var15 == null) {
            l.v("binding");
            l9Var15 = null;
        }
        l9Var15.f27314i.setSelected(false);
        l9 l9Var16 = vahanVerifyPendingTransaction.G;
        if (l9Var16 == null) {
            l.v("binding");
        } else {
            l9Var2 = l9Var16;
        }
        l9Var2.f27313h.setBackgroundResource(R.drawable.corner_circle_bg_14);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        if (r4 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        if (r4 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fc, code lost:
        if (r4 == null) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fe, code lost:
        cm.l.v("binding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0102, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0103, code lost:
        r4 = r1.f27310e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0153, code lost:
        if (r4 == null) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void x1(com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanVerifyPendingTransaction r4, cm.u r5, android.view.View r6) {
        /*
            java.lang.String r6 = "this$0"
            cm.l.f(r4, r6)
            java.lang.String r6 = "$languageSession"
            cm.l.f(r5, r6)
            java.lang.String r6 = r4.H
            java.lang.String r0 = "Transaction"
            boolean r6 = cm.l.a(r6, r0)
            java.lang.String r0 = "getText(...)"
            r1 = 0
            java.lang.String r2 = "binding"
            if (r6 == 0) goto L_0x0076
            ni.l9 r6 = r4.G
            if (r6 != 0) goto L_0x0021
            cm.l.v(r2)
            r6 = r1
        L_0x0021:
            android.widget.EditText r6 = r6.f27311f
            android.text.Editable r6 = r6.getText()
            cm.l.e(r6, r0)
            int r6 = r6.length()
            if (r6 != 0) goto L_0x005e
            ni.l9 r6 = r4.G
            if (r6 != 0) goto L_0x0038
            cm.l.v(r2)
            r6 = r1
        L_0x0038:
            android.widget.EditText r6 = r6.f27311f
            java.lang.Object r5 = r5.f20234e
            ld.c r5 = (ld.c) r5
            r0 = 2132018767(0x7f14064f, float:1.967585E38)
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r3 = "PLEASE_ENTER_APPLICATION"
            java.lang.String r5 = r5.b(r3, r0)
            r6.setError(r5)
            ni.l9 r4 = r4.G
            if (r4 != 0) goto L_0x0056
        L_0x0052:
            cm.l.v(r2)
            goto L_0x0057
        L_0x0056:
            r1 = r4
        L_0x0057:
            android.widget.EditText r4 = r1.f27311f
        L_0x0059:
            r4.requestFocus()
            goto L_0x017e
        L_0x005e:
            ni.l9 r5 = r4.G
            if (r5 != 0) goto L_0x0066
            cm.l.v(r2)
            goto L_0x0067
        L_0x0066:
            r1 = r5
        L_0x0067:
            android.widget.EditText r5 = r1.f27311f
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            r4.s1(r5)
            goto L_0x017e
        L_0x0076:
            ni.l9 r6 = r4.G
            if (r6 != 0) goto L_0x007e
            cm.l.v(r2)
            r6 = r1
        L_0x007e:
            android.widget.EditText r6 = r6.f27311f
            android.text.Editable r6 = r6.getText()
            cm.l.e(r6, r0)
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00b0
            ni.l9 r6 = r4.G
            if (r6 != 0) goto L_0x0095
            cm.l.v(r2)
            r6 = r1
        L_0x0095:
            android.widget.EditText r6 = r6.f27311f
            java.lang.Object r5 = r5.f20234e
            ld.c r5 = (ld.c) r5
            r0 = 2132018753(0x7f140641, float:1.9675822E38)
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r3 = "PLEASE_ENTER_REG"
            java.lang.String r5 = r5.b(r3, r0)
            r6.setError(r5)
            ni.l9 r4 = r4.G
            if (r4 != 0) goto L_0x0056
            goto L_0x0052
        L_0x00b0:
            ni.l9 r6 = r4.G
            if (r6 != 0) goto L_0x00b8
            cm.l.v(r2)
            r6 = r1
        L_0x00b8:
            android.widget.EditText r6 = r6.f27310e
            java.lang.String r3 = "inputChasisEt"
            cm.l.e(r6, r3)
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0107
            ni.l9 r6 = r4.G
            if (r6 != 0) goto L_0x00cd
            cm.l.v(r2)
            r6 = r1
        L_0x00cd:
            android.widget.EditText r6 = r6.f27310e
            android.text.Editable r6 = r6.getText()
            cm.l.e(r6, r0)
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0107
            ni.l9 r6 = r4.G
            if (r6 != 0) goto L_0x00e4
            cm.l.v(r2)
            r6 = r1
        L_0x00e4:
            android.widget.EditText r6 = r6.f27310e
            java.lang.Object r5 = r5.f20234e
            ld.c r5 = (ld.c) r5
            r0 = 2132018724(0x7f140624, float:1.9675763E38)
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r3 = "PLEASE_ENTER_CHASSI"
            java.lang.String r5 = r5.b(r3, r0)
            r6.setError(r5)
            ni.l9 r4 = r4.G
            if (r4 != 0) goto L_0x0102
        L_0x00fe:
            cm.l.v(r2)
            goto L_0x0103
        L_0x0102:
            r1 = r4
        L_0x0103:
            android.widget.EditText r4 = r1.f27310e
            goto L_0x0059
        L_0x0107:
            ni.l9 r6 = r4.G
            if (r6 != 0) goto L_0x010f
            cm.l.v(r2)
            r6 = r1
        L_0x010f:
            android.widget.EditText r6 = r6.f27310e
            cm.l.e(r6, r3)
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0156
            ni.l9 r6 = r4.G
            if (r6 != 0) goto L_0x0122
            cm.l.v(r2)
            r6 = r1
        L_0x0122:
            android.widget.EditText r6 = r6.f27310e
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            int r6 = r6.length()
            r0 = 5
            if (r6 >= r0) goto L_0x0156
            ni.l9 r6 = r4.G
            if (r6 != 0) goto L_0x013b
            cm.l.v(r2)
            r6 = r1
        L_0x013b:
            android.widget.EditText r6 = r6.f27310e
            java.lang.Object r5 = r5.f20234e
            ld.c r5 = (ld.c) r5
            r0 = 2132018203(0x7f14041b, float:1.9674706E38)
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r3 = "INVALID_CHASSI"
            java.lang.String r5 = r5.b(r3, r0)
            r6.setError(r5)
            ni.l9 r4 = r4.G
            if (r4 != 0) goto L_0x0102
            goto L_0x00fe
        L_0x0156:
            ni.l9 r5 = r4.G
            if (r5 != 0) goto L_0x015e
            cm.l.v(r2)
            r5 = r1
        L_0x015e:
            android.widget.EditText r5 = r5.f27311f
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            ni.l9 r6 = r4.G
            if (r6 != 0) goto L_0x0170
            cm.l.v(r2)
            goto L_0x0171
        L_0x0170:
            r1 = r6
        L_0x0171:
            android.widget.EditText r6 = r1.f27310e
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            r4.r1(r5, r6)
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanVerifyPendingTransaction.x1(com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanVerifyPendingTransaction, cm.u, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void y1(VahanVerifyPendingTransaction vahanVerifyPendingTransaction, View view) {
        l.f(vahanVerifyPendingTransaction, "this$0");
        vahanVerifyPendingTransaction.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void z1(VahanVerifyPendingTransaction vahanVerifyPendingTransaction, View view) {
        l.f(vahanVerifyPendingTransaction, "this$0");
        vahanVerifyPendingTransaction.B1();
    }

    public final void C1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void D1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.K = progressDialog;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_verify_pending_transaction);
        l9 c10 = l9.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        bi.b bVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        l9 l9Var = this.G;
        if (l9Var == null) {
            l.v("binding");
            l9Var = null;
        }
        aVar.n2(this, l9Var);
        C1(new ld.c(this));
        this.J = ApplicationService.f21181a.b(this);
        l9 l9Var2 = this.G;
        if (l9Var2 == null) {
            l.v("binding");
            l9Var2 = null;
        }
        l9Var2.f27312g.f25959e.setOnClickListener(new o1(this));
        D1(new ProgressDialog(this));
        t1().setMessage(q1().b("label_challan_please_wait", "Please wait..."));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        u1();
        bi.b bVar2 = this.I;
        if (bVar2 == null) {
            l.v("viewModel");
            bVar2 = null;
        }
        bVar2.w().g(this, new f(new c(this)));
        bi.b bVar3 = this.I;
        if (bVar3 == null) {
            l.v("viewModel");
            bVar3 = null;
        }
        bVar3.x().g(this, new f(new d(this)));
        bi.b bVar4 = this.I;
        if (bVar4 == null) {
            l.v("viewModel");
        } else {
            bVar = bVar4;
        }
        bVar.v().g(this, new f(new e(this)));
    }

    public final ld.c q1() {
        ld.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageSession");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.K;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }
}
