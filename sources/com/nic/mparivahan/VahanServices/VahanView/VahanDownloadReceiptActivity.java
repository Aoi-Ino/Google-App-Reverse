package com.nic.mparivahan.VahanServices.VahanView;

import ai.j2;
import ai.k2;
import ai.l2;
import ai.m2;
import ai.n2;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
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
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PdfViewer.PdfViewActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanService.DownloadReceiptService;
import ni.a4;
import pl.x;
import v9.e;

public final class VahanDownloadReceiptActivity extends d {
    private a4 G;
    public ProgressDialog H;
    private final String I = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private String J = "";
    private String K = "";
    private String L = "";
    private String M = "";
    public DownloadReceiptService N;
    public ne.b O;
    public ld.c P;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDownloadReceiptActivity f21511e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanDownloadReceiptActivity vahanDownloadReceiptActivity) {
            super(1);
            this.f21511e = vahanDownloadReceiptActivity;
        }

        public final void b(String str) {
            try {
                this.f21511e.n1().dismiss();
                VahanDownloadReceiptActivity vahanDownloadReceiptActivity = this.f21511e;
                vahanDownloadReceiptActivity.A1(vahanDownloadReceiptActivity, str.toString());
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDownloadReceiptActivity f21512e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanDownloadReceiptActivity vahanDownloadReceiptActivity) {
            super(1);
            this.f21512e = vahanDownloadReceiptActivity;
        }

        public final void b(String str) {
            this.f21512e.n1().dismiss();
            Log.e("CallingError", str.toString());
            this.f21512e.l1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21513a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f21513a = lVar;
        }

        public final pl.c a() {
            return this.f21513a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21513a.invoke(obj);
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
    public static final void B1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        if (r0 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c3, code lost:
        if (r0 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fd, code lost:
        if (r0 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0103, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0141, code lost:
        if (r0 == null) goto L_0x00ff;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean C1() {
        /*
            r7 = this;
            ni.a4 r0 = r7.G
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f25188j
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            r3 = 0
            if (r0 != 0) goto L_0x0049
            ni.a4 r0 = r7.G
            if (r0 != 0) goto L_0x0023
            cm.l.v(r2)
            r0 = r1
        L_0x0023:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f25188j
            ld.c r4 = r7.m1()
            r5 = 2132018767(0x7f14064f, float:1.967585E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "PLEASE_ENTER_APPLICATION"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.a4 r0 = r7.G
            if (r0 != 0) goto L_0x0041
            cm.l.v(r2)
            goto L_0x0042
        L_0x0041:
            r1 = r0
        L_0x0042:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f25188j
        L_0x0044:
            r0.requestFocus()
            goto L_0x0145
        L_0x0049:
            ni.a4 r0 = r7.G
            if (r0 != 0) goto L_0x0051
            cm.l.v(r2)
            r0 = r1
        L_0x0051:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f25190l
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x008a
            ni.a4 r0 = r7.G
            if (r0 != 0) goto L_0x0068
            cm.l.v(r2)
            r0 = r1
        L_0x0068:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f25190l
            ld.c r4 = r7.m1()
            r5 = 2132018753(0x7f140641, float:1.9675822E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "PLEASE_ENTER_REG"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.a4 r0 = r7.G
            if (r0 != 0) goto L_0x0086
        L_0x0082:
            cm.l.v(r2)
            goto L_0x0087
        L_0x0086:
            r1 = r0
        L_0x0087:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f25190l
            goto L_0x0044
        L_0x008a:
            ni.a4 r0 = r7.G
            if (r0 != 0) goto L_0x0092
            cm.l.v(r2)
            r0 = r1
        L_0x0092:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f25190l
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            r4 = 4
            if (r0 >= r4) goto L_0x00c6
            ni.a4 r0 = r7.G
            if (r0 != 0) goto L_0x00ab
            cm.l.v(r2)
            r0 = r1
        L_0x00ab:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f25190l
            ld.c r4 = r7.m1()
            r5 = 2132018211(0x7f140423, float:1.9674722E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "label_challan_invalid_vehicle_no"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.a4 r0 = r7.G
            if (r0 != 0) goto L_0x0086
            goto L_0x0082
        L_0x00c6:
            ni.a4 r0 = r7.G
            if (r0 != 0) goto L_0x00ce
            cm.l.v(r2)
            r0 = r1
        L_0x00ce:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f25189k
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0108
            ni.a4 r0 = r7.G
            if (r0 != 0) goto L_0x00e5
            cm.l.v(r2)
            r0 = r1
        L_0x00e5:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f25189k
            ld.c r4 = r7.m1()
            r5 = 2132018724(0x7f140624, float:1.9675763E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "PLEASE_ENTER_CHASSI"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.a4 r0 = r7.G
            if (r0 != 0) goto L_0x0103
        L_0x00ff:
            cm.l.v(r2)
            goto L_0x0104
        L_0x0103:
            r1 = r0
        L_0x0104:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f25189k
            goto L_0x0044
        L_0x0108:
            ni.a4 r0 = r7.G
            if (r0 != 0) goto L_0x0110
            cm.l.v(r2)
            r0 = r1
        L_0x0110:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f25189k
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            r4 = 5
            if (r0 >= r4) goto L_0x0144
            ni.a4 r0 = r7.G
            if (r0 != 0) goto L_0x0129
            cm.l.v(r2)
            r0 = r1
        L_0x0129:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f25189k
            ld.c r4 = r7.m1()
            r5 = 2132018203(0x7f14041b, float:1.9674706E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "INVALID_CHASSI"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.a4 r0 = r7.G
            if (r0 != 0) goto L_0x0103
            goto L_0x00ff
        L_0x0144:
            r3 = 1
        L_0x0145:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanView.VahanDownloadReceiptActivity.C1():boolean");
    }

    /* access modifiers changed from: private */
    public final void l1() {
        a4 a4Var = this.G;
        a4 a4Var2 = null;
        if (a4Var == null) {
            cm.l.v("binding");
            a4Var = null;
        }
        String valueOf = String.valueOf(a4Var.f25188j.getText());
        a4 a4Var3 = this.G;
        if (a4Var3 == null) {
            cm.l.v("binding");
            a4Var3 = null;
        }
        String valueOf2 = String.valueOf(a4Var3.f25190l.getText());
        a4 a4Var4 = this.G;
        if (a4Var4 == null) {
            cm.l.v("binding");
        } else {
            a4Var2 = a4Var4;
        }
        Intent intent = new Intent(this, PdfViewActivity.class);
        intent.putExtra("url", hc.a.f12073a.i() + "reprintreciept/" + valueOf + '/' + valueOf2 + '/' + String.valueOf(a4Var2.f25189k.getText()));
        intent.putExtra("formType", "Fee Receipt");
        intent.putExtra("applNo", valueOf2 + '_' + valueOf);
        startActivity(intent);
    }

    private final void q1() {
        TextView textView;
        String str;
        a4 a4Var = null;
        try {
            if (getIntent() != null) {
                a4 a4Var2 = this.G;
                if (a4Var2 == null) {
                    cm.l.v("binding");
                    a4Var2 = null;
                }
                textView = a4Var2.f25181c.f28308i;
                str = getIntent().getStringExtra("service_name");
            } else {
                a4 a4Var3 = this.G;
                if (a4Var3 == null) {
                    cm.l.v("binding");
                    a4Var3 = null;
                }
                textView = a4Var3.f25181c.f28308i;
                str = "Print Receipt";
            }
            textView.setText(str);
        } catch (Exception unused) {
        }
        a4 a4Var4 = this.G;
        if (a4Var4 == null) {
            cm.l.v("binding");
            a4Var4 = null;
        }
        a4Var4.f25181c.f28306g.setOnClickListener(new k2(this));
        a4 a4Var5 = this.G;
        if (a4Var5 == null) {
            cm.l.v("binding");
            a4Var5 = null;
        }
        a4Var5.f25181c.f28305f.setOnClickListener(new l2(this));
        a4 a4Var6 = this.G;
        if (a4Var6 == null) {
            cm.l.v("binding");
            a4Var6 = null;
        }
        a4Var6.f25185g.setOnClickListener(new m2(this));
        a4 a4Var7 = this.G;
        if (a4Var7 == null) {
            cm.l.v("binding");
            a4Var7 = null;
        }
        a4Var7.f25183e.setOnClickListener(new n2(this));
        a4 a4Var8 = this.G;
        if (a4Var8 == null) {
            cm.l.v("binding");
            a4Var8 = null;
        }
        a4Var8.f25190l.setKeyListener(DigitsKeyListener.getInstance(this.I));
        a4 a4Var9 = this.G;
        if (a4Var9 == null) {
            cm.l.v("binding");
            a4Var9 = null;
        }
        a4Var9.f25190l.setRawInputType(4096);
        a4 a4Var10 = this.G;
        if (a4Var10 == null) {
            cm.l.v("binding");
            a4Var10 = null;
        }
        a4Var10.f25188j.setKeyListener(DigitsKeyListener.getInstance(this.I));
        a4 a4Var11 = this.G;
        if (a4Var11 == null) {
            cm.l.v("binding");
        } else {
            a4Var = a4Var11;
        }
        a4Var.f25188j.setRawInputType(4096);
    }

    /* access modifiers changed from: private */
    public static final void r1(VahanDownloadReceiptActivity vahanDownloadReceiptActivity, View view) {
        cm.l.f(vahanDownloadReceiptActivity, "this$0");
        vahanDownloadReceiptActivity.v1();
    }

    /* access modifiers changed from: private */
    public static final void s1(VahanDownloadReceiptActivity vahanDownloadReceiptActivity, View view) {
        cm.l.f(vahanDownloadReceiptActivity, "this$0");
        vahanDownloadReceiptActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void t1(VahanDownloadReceiptActivity vahanDownloadReceiptActivity, View view) {
        cm.l.f(vahanDownloadReceiptActivity, "this$0");
        if (vahanDownloadReceiptActivity.C1()) {
            vahanDownloadReceiptActivity.n1().show();
            ne.b o12 = vahanDownloadReceiptActivity.o1();
            a4 a4Var = vahanDownloadReceiptActivity.G;
            a4 a4Var2 = null;
            if (a4Var == null) {
                cm.l.v("binding");
                a4Var = null;
            }
            String valueOf = String.valueOf(a4Var.f25188j.getText());
            a4 a4Var3 = vahanDownloadReceiptActivity.G;
            if (a4Var3 == null) {
                cm.l.v("binding");
                a4Var3 = null;
            }
            String valueOf2 = String.valueOf(a4Var3.f25190l.getText());
            a4 a4Var4 = vahanDownloadReceiptActivity.G;
            if (a4Var4 == null) {
                cm.l.v("binding");
            } else {
                a4Var2 = a4Var4;
            }
            o12.i(valueOf, valueOf2, String.valueOf(a4Var2.f25189k.getText()));
        }
    }

    /* access modifiers changed from: private */
    public static final void u1(VahanDownloadReceiptActivity vahanDownloadReceiptActivity, View view) {
        cm.l.f(vahanDownloadReceiptActivity, "this$0");
        vahanDownloadReceiptActivity.finish();
    }

    private final void v1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        ld.c cVar = new ld.c(context);
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById3).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", getString(R.string.ok_text)));
        textView.setOnClickListener(new j2(dialog));
        dialog.show();
    }

    public final ld.c m1() {
        ld.c cVar = this.P;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final ProgressDialog n1() {
        ProgressDialog progressDialog = this.H;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final ne.b o1() {
        ne.b bVar = this.O;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("receiptViewModle");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_download_receipt);
        a4 c10 = a4.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        a4 a4Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = e.f17509a;
        a4 a4Var2 = this.G;
        if (a4Var2 == null) {
            cm.l.v("binding");
        } else {
            a4Var = a4Var2;
        }
        aVar.y2(this, a4Var);
        w1(new ld.c(this));
        x1(new ProgressDialog(this));
        n1().setMessage(m1().b("label_challan_please_wait", "Please wait..."));
        n1().setCancelable(false);
        n1().setCanceledOnTouchOutside(false);
        z1(DownloadReceiptService.f21187a.b(this));
        y1((ne.b) new u0((x0) this, (u0.b) new ne.c(new ne.a(p1()))).a(ne.b.class));
        q1();
        o1().g().g(this, new c(new a(this)));
        o1().h().g(this, new c(new b(this)));
    }

    public final DownloadReceiptService p1() {
        DownloadReceiptService downloadReceiptService = this.N;
        if (downloadReceiptService != null) {
            return downloadReceiptService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final void w1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.P = cVar;
    }

    public final void x1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.H = progressDialog;
    }

    public final void y1(ne.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.O = bVar;
    }

    public final void z1(DownloadReceiptService downloadReceiptService) {
        cm.l.f(downloadReceiptService, "<set-?>");
        this.N = downloadReceiptService;
    }
}
