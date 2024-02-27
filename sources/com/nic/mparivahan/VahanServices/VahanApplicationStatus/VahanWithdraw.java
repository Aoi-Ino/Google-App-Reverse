package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.f;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.VahanApplDisposeSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import ld.g;
import ni.qb;
import pl.x;
import v9.e;

public final class VahanWithdraw extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public qb G;
    private bi.b H;
    private ApplicationService I;
    public ProgressDialog J;
    private final String K = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    /* access modifiers changed from: private */
    public String L = "";
    /* access modifiers changed from: private */
    public String M = "";
    /* access modifiers changed from: private */
    public String N = "";
    /* access modifiers changed from: private */
    public String O = "";
    public ld.c P;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanWithdraw f20831e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanWithdraw vahanWithdraw) {
            super(1);
            this.f20831e = vahanWithdraw;
        }

        public final void b(VahanApplDisposeSuccessModel vahanApplDisposeSuccessModel) {
            if (this.f20831e.y1().isShowing()) {
                this.f20831e.y1().dismiss();
            }
            if (!ka.c.f13158a.m(vahanApplDisposeSuccessModel.getRegn_no())) {
                this.f20831e.L = vahanApplDisposeSuccessModel.getEng_no();
                this.f20831e.M = vahanApplDisposeSuccessModel.getMobile_no();
                this.f20831e.N = vahanApplDisposeSuccessModel.getOwner_name();
                this.f20831e.O = vahanApplDisposeSuccessModel.getState_name();
                VahanWithdraw vahanWithdraw = this.f20831e;
                vahanWithdraw.F1(vahanWithdraw.M);
                return;
            }
            if (this.f20831e.y1().isShowing()) {
                this.f20831e.y1().dismiss();
            }
            if (com.nic.mparivahan.dlservices.utilities.d.d(vahanApplDisposeSuccessModel.getDeveloperMessage())) {
                this.f20831e.I1(vahanApplDisposeSuccessModel.getDeveloperMessage());
                return;
            }
            VahanWithdraw vahanWithdraw2 = this.f20831e;
            vahanWithdraw2.I1(vahanWithdraw2.x1().b("record_error_msg", this.f20831e.getString(R.string.service_unavable_please_try)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VahanApplDisposeSuccessModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanWithdraw f20832e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanWithdraw vahanWithdraw) {
            super(1);
            this.f20832e = vahanWithdraw;
        }

        public final void b(String str) {
            if (this.f20832e.y1().isShowing()) {
                this.f20832e.y1().dismiss();
            }
            Log.e("it", str.toString());
            if (!p.o(str, "Error", true)) {
                this.f20832e.I1(str);
                return;
            }
            VahanWithdraw vahanWithdraw = this.f20832e;
            vahanWithdraw.I1(vahanWithdraw.x1().b("record_error_msg", this.f20832e.getString(R.string.service_unavable_please_try)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanWithdraw f20833e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanWithdraw vahanWithdraw) {
            super(1);
            this.f20833e = vahanWithdraw;
        }

        public final void b(SendOtpResult sendOtpResult) {
            VahanWithdraw vahanWithdraw;
            String b10;
            if (this.f20833e.y1().isShowing()) {
                this.f20833e.y1().dismiss();
            }
            if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                Intent intent = new Intent(this.f20833e, VahanWithdrawOtpVerify.class);
                qb l12 = this.f20833e.G;
                qb qbVar = null;
                if (l12 == null) {
                    cm.l.v("binding");
                    l12 = null;
                }
                intent.putExtra("applicationNo", String.valueOf(l12.f28286j.getText()));
                qb l13 = this.f20833e.G;
                if (l13 == null) {
                    cm.l.v("binding");
                    l13 = null;
                }
                intent.putExtra("chassisNo", String.valueOf(l13.f28287k.getText()));
                intent.putExtra("engineNo", this.f20833e.L);
                qb l14 = this.f20833e.G;
                if (l14 == null) {
                    cm.l.v("binding");
                } else {
                    qbVar = l14;
                }
                intent.putExtra("regNo", String.valueOf(qbVar.f28288l.getText()));
                intent.putExtra("mobileNo", this.f20833e.M);
                intent.putExtra("otp", sendOtpResult.getRecordId());
                intent.putExtra("ownerName", this.f20833e.N);
                intent.putExtra("stateCd", this.f20833e.O);
                this.f20833e.startActivity(intent);
                return;
            }
            if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                vahanWithdraw = this.f20833e;
                b10 = "Unable to send the OTP, Please try after some times!";
            } else {
                vahanWithdraw = this.f20833e;
                b10 = vahanWithdraw.x1().b("record_error_msg", this.f20833e.getString(R.string.service_unavable_please_try));
            }
            vahanWithdraw.I1(b10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanWithdraw f20834e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanWithdraw vahanWithdraw) {
            super(1);
            this.f20834e = vahanWithdraw;
        }

        public final void b(String str) {
            if (this.f20834e.y1().isShowing()) {
                this.f20834e.y1().dismiss();
            }
            if (!str.equals("Error")) {
                this.f20834e.I1(str);
            } else {
                this.f20834e.I1("Unable to send the OTP, Please try after some times!");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20835a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f20835a = lVar;
        }

        public final pl.c a() {
            return this.f20835a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20835a.invoke(obj);
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
    public static final void A1(VahanWithdraw vahanWithdraw, View view) {
        cm.l.f(vahanWithdraw, "this$0");
        vahanWithdraw.E1();
    }

    /* access modifiers changed from: private */
    public static final void B1(VahanWithdraw vahanWithdraw, View view) {
        cm.l.f(vahanWithdraw, "this$0");
        vahanWithdraw.finish();
    }

    /* access modifiers changed from: private */
    public static final void C1(VahanWithdraw vahanWithdraw, View view) {
        cm.l.f(vahanWithdraw, "this$0");
        if (vahanWithdraw.L1()) {
            vahanWithdraw.w1();
        }
    }

    /* access modifiers changed from: private */
    public static final void D1(VahanWithdraw vahanWithdraw, View view) {
        cm.l.f(vahanWithdraw, "this$0");
        vahanWithdraw.finish();
    }

    private final void E1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void F1(String str) {
        try {
            if (y1().isShowing()) {
                y1().dismiss();
            }
            y1().show();
            g gVar = new g(this);
            bi.b bVar = this.H;
            if (bVar == null) {
                cm.l.v("viewModel");
                bVar = null;
            }
            bVar.q(this, str, gVar.k());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public final void I1(String str) {
        Dialog dialog = new Dialog(this);
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
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        textView2.setVisibility(8);
        textView.setText(x1().b("btn_ok", getString(R.string.ok_text)));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new b2(dialog));
        textView2.setOnClickListener(new c2(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void J1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void K1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        if (r0 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bd, code lost:
        if (r0 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f7, code lost:
        if (r0 == null) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fd, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0136, code lost:
        if (r0 == null) goto L_0x00f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean L1() {
        /*
            r7 = this;
            ni.qb r0 = r7.G
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28286j
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            r3 = 0
            if (r0 != 0) goto L_0x0049
            ni.qb r0 = r7.G
            if (r0 != 0) goto L_0x0023
            cm.l.v(r2)
            r0 = r1
        L_0x0023:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28286j
            ld.c r4 = r7.x1()
            r5 = 2132018767(0x7f14064f, float:1.967585E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "PLEASE_ENTER_APPLICATION"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.qb r0 = r7.G
            if (r0 != 0) goto L_0x0041
            cm.l.v(r2)
            goto L_0x0042
        L_0x0041:
            r1 = r0
        L_0x0042:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f28286j
        L_0x0044:
            r0.requestFocus()
            goto L_0x013a
        L_0x0049:
            ni.qb r0 = r7.G
            if (r0 != 0) goto L_0x0051
            cm.l.v(r2)
            r0 = r1
        L_0x0051:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28288l
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            r4 = 2132018753(0x7f140641, float:1.9675822E38)
            java.lang.String r5 = "PLEASE_ENTER_REG"
            if (r0 != 0) goto L_0x008a
            ni.qb r0 = r7.G
            if (r0 != 0) goto L_0x006d
            cm.l.v(r2)
            r0 = r1
        L_0x006d:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28288l
            ld.c r6 = r7.x1()
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r4 = r6.b(r5, r4)
            r0.setError(r4)
            ni.qb r0 = r7.G
            if (r0 != 0) goto L_0x0086
        L_0x0082:
            cm.l.v(r2)
            goto L_0x0087
        L_0x0086:
            r1 = r0
        L_0x0087:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f28288l
            goto L_0x0044
        L_0x008a:
            ni.qb r0 = r7.G
            if (r0 != 0) goto L_0x0092
            cm.l.v(r2)
            r0 = r1
        L_0x0092:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28288l
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            r6 = 4
            if (r0 >= r6) goto L_0x00c0
            ni.qb r0 = r7.G
            if (r0 != 0) goto L_0x00aa
            cm.l.v(r2)
            r0 = r1
        L_0x00aa:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28288l
            ld.c r6 = r7.x1()
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r4 = r6.b(r5, r4)
            r0.setError(r4)
            ni.qb r0 = r7.G
            if (r0 != 0) goto L_0x0086
            goto L_0x0082
        L_0x00c0:
            ni.qb r0 = r7.G
            if (r0 != 0) goto L_0x00c8
            cm.l.v(r2)
            r0 = r1
        L_0x00c8:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28287k
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            r4 = 2132018724(0x7f140624, float:1.9675763E38)
            java.lang.String r5 = "PLEASE_ENTER_CHASSI"
            if (r0 != 0) goto L_0x0102
            ni.qb r0 = r7.G
            if (r0 != 0) goto L_0x00e4
            cm.l.v(r2)
            r0 = r1
        L_0x00e4:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28287k
            ld.c r6 = r7.x1()
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r4 = r6.b(r5, r4)
            r0.setError(r4)
            ni.qb r0 = r7.G
            if (r0 != 0) goto L_0x00fd
        L_0x00f9:
            cm.l.v(r2)
            goto L_0x00fe
        L_0x00fd:
            r1 = r0
        L_0x00fe:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f28287k
            goto L_0x0044
        L_0x0102:
            ni.qb r0 = r7.G
            if (r0 != 0) goto L_0x010a
            cm.l.v(r2)
            r0 = r1
        L_0x010a:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28287k
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            r6 = 5
            if (r0 >= r6) goto L_0x0139
            ni.qb r0 = r7.G
            if (r0 != 0) goto L_0x0123
            cm.l.v(r2)
            r0 = r1
        L_0x0123:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28287k
            ld.c r6 = r7.x1()
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r4 = r6.b(r5, r4)
            r0.setError(r4)
            ni.qb r0 = r7.G
            if (r0 != 0) goto L_0x00fd
            goto L_0x00f9
        L_0x0139:
            r3 = 1
        L_0x013a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanWithdraw.L1():boolean");
    }

    private final void w1() {
        try {
            if (y1().isShowing()) {
                y1().dismiss();
            }
            y1().show();
            bi.b bVar = this.H;
            qb qbVar = null;
            if (bVar == null) {
                cm.l.v("viewModel");
                bVar = null;
            }
            qb qbVar2 = this.G;
            if (qbVar2 == null) {
                cm.l.v("binding");
                qbVar2 = null;
            }
            String valueOf = String.valueOf(qbVar2.f28288l.getText());
            qb qbVar3 = this.G;
            if (qbVar3 == null) {
                cm.l.v("binding");
                qbVar3 = null;
            }
            String valueOf2 = String.valueOf(qbVar3.f28286j.getText());
            qb qbVar4 = this.G;
            if (qbVar4 == null) {
                cm.l.v("binding");
            } else {
                qbVar = qbVar4;
            }
            bVar.h(this, valueOf, valueOf2, String.valueOf(qbVar.f28287k.getText()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void z1() {
        qb qbVar = this.G;
        qb qbVar2 = null;
        if (qbVar == null) {
            cm.l.v("binding");
            qbVar = null;
        }
        qbVar.f28279c.f28308i.setText(x1().b("label_dispose_applicationl", "Dispose Application"));
        ApplicationService applicationService = this.I;
        if (applicationService == null) {
            cm.l.v("retrofitService");
            applicationService = null;
        }
        this.H = (bi.b) new u0((x0) this, (u0.b) new f(new wg.b(applicationService))).a(bi.b.class);
        qb qbVar3 = this.G;
        if (qbVar3 == null) {
            cm.l.v("binding");
            qbVar3 = null;
        }
        qbVar3.f28279c.f28306g.setOnClickListener(new d2(this));
        qb qbVar4 = this.G;
        if (qbVar4 == null) {
            cm.l.v("binding");
            qbVar4 = null;
        }
        qbVar4.f28279c.f28305f.setOnClickListener(new e2(this));
        qb qbVar5 = this.G;
        if (qbVar5 == null) {
            cm.l.v("binding");
            qbVar5 = null;
        }
        qbVar5.f28283g.setOnClickListener(new f2(this));
        qb qbVar6 = this.G;
        if (qbVar6 == null) {
            cm.l.v("binding");
            qbVar6 = null;
        }
        qbVar6.f28281e.setOnClickListener(new g2(this));
        qb qbVar7 = this.G;
        if (qbVar7 == null) {
            cm.l.v("binding");
            qbVar7 = null;
        }
        qbVar7.f28288l.setKeyListener(DigitsKeyListener.getInstance(this.K));
        qb qbVar8 = this.G;
        if (qbVar8 == null) {
            cm.l.v("binding");
            qbVar8 = null;
        }
        qbVar8.f28288l.setRawInputType(4096);
        qb qbVar9 = this.G;
        if (qbVar9 == null) {
            cm.l.v("binding");
            qbVar9 = null;
        }
        qbVar9.f28286j.setKeyListener(DigitsKeyListener.getInstance(this.K));
        qb qbVar10 = this.G;
        if (qbVar10 == null) {
            cm.l.v("binding");
        } else {
            qbVar2 = qbVar10;
        }
        qbVar2.f28286j.setRawInputType(4096);
    }

    public final void G1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.P = cVar;
    }

    public final void H1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout_application_vehicle_services);
        qb c10 = qb.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        bi.b bVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        qb qbVar = this.G;
        if (qbVar == null) {
            cm.l.v("binding");
            qbVar = null;
        }
        aVar.b2(this, qbVar);
        G1(new ld.c(this));
        this.I = ApplicationService.f21181a.b(this);
        H1(new ProgressDialog(this));
        y1().setMessage(x1().b("label_challan_please_wait", "Please wait..."));
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        z1();
        bi.b bVar2 = this.H;
        if (bVar2 == null) {
            cm.l.v("viewModel");
            bVar2 = null;
        }
        bVar2.l().g(this, new e(new a(this)));
        bi.b bVar3 = this.H;
        if (bVar3 == null) {
            cm.l.v("viewModel");
            bVar3 = null;
        }
        bVar3.i().g(this, new e(new b(this)));
        bi.b bVar4 = this.H;
        if (bVar4 == null) {
            cm.l.v("viewModel");
            bVar4 = null;
        }
        bVar4.k().g(this, new e(new c(this)));
        bi.b bVar5 = this.H;
        if (bVar5 == null) {
            cm.l.v("viewModel");
        } else {
            bVar = bVar5;
        }
        bVar.j().g(this, new e(new d(this)));
    }

    public final ld.c x1() {
        ld.c cVar = this.P;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final ProgressDialog y1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }
}
