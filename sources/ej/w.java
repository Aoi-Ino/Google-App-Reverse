package ej;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.u;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedDocBeanItem;
import java.util.ArrayList;
import ld.c;

public final class w extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f23036d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f23037e;

    /* renamed from: f  reason: collision with root package name */
    private final String f23038f;

    /* renamed from: g  reason: collision with root package name */
    private final String f23039g;

    public static final class a extends RecyclerView.d0 {
        private final TextView A;
        private final TextView B;
        private final LinearLayout C;
        private final TextView D;
        private final TextView E;
        private final TextView F;
        private final TextView G;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f23040y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f23041z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.document_name);
            l.e(findViewById, "findViewById(...)");
            this.f23040y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.proof);
            l.e(findViewById2, "findViewById(...)");
            this.f23041z = (TextView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.issued_by);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.issued_date);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.browse_button);
            l.e(findViewById5, "findViewById(...)");
            this.C = (LinearLayout) findViewById5;
            View findViewById6 = this.f3622e.findViewById(R.id.document_name_text);
            l.e(findViewById6, "findViewById(...)");
            this.D = (TextView) findViewById6;
            View findViewById7 = this.f3622e.findViewById(R.id.proof_text);
            l.e(findViewById7, "findViewById(...)");
            this.E = (TextView) findViewById7;
            View findViewById8 = this.f3622e.findViewById(R.id.issue_by_text);
            l.e(findViewById8, "findViewById(...)");
            this.F = (TextView) findViewById8;
            View findViewById9 = this.f3622e.findViewById(R.id.issue_date_text);
            l.e(findViewById9, "findViewById(...)");
            this.G = (TextView) findViewById9;
        }

        public final LinearLayout O() {
            return this.C;
        }

        public final TextView P() {
            return this.f23040y;
        }

        public final TextView Q() {
            return this.D;
        }

        public final TextView R() {
            return this.F;
        }

        public final TextView S() {
            return this.G;
        }

        public final TextView T() {
            return this.A;
        }

        public final TextView U() {
            return this.B;
        }

        public final TextView V() {
            return this.f23041z;
        }

        public final TextView W() {
            return this.E;
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProgressDialog f23042a;

        b(ProgressDialog progressDialog) {
            this.f23042a = progressDialog;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f23042a.dismiss();
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f23042a.show();
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f23042a.dismiss();
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            if (webView != null) {
                webView.loadUrl(valueOf);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public w(ArrayList arrayList, Context context, String str, String str2) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(str, "mAppNumber");
        l.f(str2, "stateCode");
        this.f23036d = arrayList;
        this.f23037e = context;
        this.f23038f = str;
        this.f23039g = str2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:22|23|24|25|26|27|29) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x01a4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void E(com.nic.mparivahan.dlservices.data.model.temp.InsertedDocBeanItem r11, ej.w r12, cm.u r13, android.view.View r14) {
        /*
            java.lang.String r14 = "$mModel"
            cm.l.f(r11, r14)
            java.lang.String r14 = "this$0"
            cm.l.f(r12, r14)
            java.lang.String r14 = "$mSession"
            cm.l.f(r13, r14)
            java.lang.String r0 = r11.getFileNmae()     // Catch:{ Exception -> 0x01c1 }
            r14 = 0
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = "."
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            int r0 = km.q.Q(r0, r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x01c1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01c1 }
            goto L_0x0026
        L_0x0025:
            r0 = r14
        L_0x0026:
            cm.l.c(r0)     // Catch:{ Exception -> 0x01c1 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01c1 }
            if (r0 <= 0) goto L_0x01c1
            kk.c r0 = new kk.c     // Catch:{ Exception -> 0x01c1 }
            r0.<init>()     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r0 = r11.getFileNmae()     // Catch:{ Exception -> 0x01c1 }
            r1 = 0
            if (r0 == 0) goto L_0x0056
            java.lang.String r2 = r11.getFileNmae()     // Catch:{ Exception -> 0x01c1 }
            cm.l.c(r2)     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r3 = "."
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            int r2 = km.q.V(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r0 = r0.substring(r1, r2)     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r0, r2)     // Catch:{ Exception -> 0x01c1 }
            goto L_0x0057
        L_0x0056:
            r0 = r14
        L_0x0057:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c1 }
            r2.<init>()     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r3 = com.nic.mparivahan.dlservices.utilities.e.m()     // Catch:{ Exception -> 0x01c1 }
            r2.append(r3)     // Catch:{ Exception -> 0x01c1 }
            r2.append(r0)     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r0 = "&folderName="
            r2.append(r0)     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r0 = r12.f23038f     // Catch:{ Exception -> 0x01c1 }
            r2.append(r0)     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r0 = "&stateCode="
            r2.append(r0)     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r0 = r12.f23039g     // Catch:{ Exception -> 0x01c1 }
            r2.append(r0)     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r0 = "&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey="
            r2.append(r0)     // Catch:{ Exception -> 0x01c1 }
            com.nic.mparivahan.APIController r0 = com.nic.mparivahan.APIController.a()     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r0 = r0.sarthiDMSKey()     // Catch:{ Exception -> 0x01c1 }
            r2.append(r0)     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r2 = "DMS_URL_FOR_IMAGE"
            android.util.Log.d(r2, r0)     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r2 = r11.getFileNmae()     // Catch:{ Exception -> 0x01c1 }
            if (r2 == 0) goto L_0x00a5
            java.lang.String r3 = ".pdf"
            r4 = 2
            boolean r2 = km.q.F(r2, r3, r1, r4, r14)     // Catch:{ Exception -> 0x01c1 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x01c1 }
            goto L_0x00a6
        L_0x00a5:
            r2 = r14
        L_0x00a6:
            cm.l.c(r2)     // Catch:{ Exception -> 0x01c1 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x01c1 }
            r3 = 2132018596(0x7f1405a4, float:1.9675503E38)
            java.lang.String r4 = "btn_ok"
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.TextView"
            r6 = 2131363620(0x7f0a0724, float:1.8347054E38)
            java.lang.String r7 = "null cannot be cast to non-null type android.webkit.WebView"
            r8 = 2131361828(0x7f0a0024, float:1.834342E38)
            r9 = -1
            r10 = 2131559096(0x7f0d02b8, float:1.8743526E38)
            if (r2 == 0) goto L_0x011c
            java.lang.String r14 = "gaurav1"
            java.lang.String r11 = r11.getFileNmae()     // Catch:{ Exception -> 0x01c1 }
            android.util.Log.d(r14, r11)     // Catch:{ Exception -> 0x01c1 }
            android.app.Dialog r11 = new android.app.Dialog     // Catch:{ Exception -> 0x01c1 }
            android.content.Context r14 = r12.f23037e     // Catch:{ Exception -> 0x01c1 }
            r11.<init>(r14)     // Catch:{ Exception -> 0x01c1 }
            r11.setContentView(r10)     // Catch:{ Exception -> 0x01c1 }
            android.view.Window r14 = r11.getWindow()     // Catch:{ Exception -> 0x01c1 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x01c1 }
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable     // Catch:{ Exception -> 0x01c1 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01c1 }
            r14.setBackgroundDrawable(r1)     // Catch:{ Exception -> 0x01c1 }
            android.view.View r14 = r11.findViewById(r8)     // Catch:{ Exception -> 0x01c1 }
            cm.l.d(r14, r7)     // Catch:{ Exception -> 0x01c1 }
            android.webkit.WebView r14 = (android.webkit.WebView) r14     // Catch:{ Exception -> 0x01c1 }
            android.view.View r1 = r11.findViewById(r6)     // Catch:{ Exception -> 0x01c1 }
            cm.l.d(r1, r5)     // Catch:{ Exception -> 0x01c1 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x01c1 }
            android.webkit.WebSettings r2 = r14.getSettings()     // Catch:{ Exception -> 0x01c1 }
            r5 = 1
            r2.setJavaScriptEnabled(r5)     // Catch:{ Exception -> 0x01c1 }
            r14.loadUrl(r0)     // Catch:{ Exception -> 0x01c1 }
            java.lang.Object r13 = r13.f20234e     // Catch:{ Exception -> 0x01c1 }
            ld.c r13 = (ld.c) r13     // Catch:{ Exception -> 0x01c1 }
            android.content.Context r12 = r12.f23037e     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r12 = r12.getString(r3)     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r12 = r13.b(r4, r12)     // Catch:{ Exception -> 0x01c1 }
            r1.setText(r12)     // Catch:{ Exception -> 0x01c1 }
            ej.u r12 = new ej.u     // Catch:{ Exception -> 0x01c1 }
            r12.<init>(r11)     // Catch:{ Exception -> 0x01c1 }
            r1.setOnClickListener(r12)     // Catch:{ Exception -> 0x01c1 }
            goto L_0x01c1
        L_0x011c:
            android.app.Dialog r11 = new android.app.Dialog     // Catch:{ Exception -> 0x01c1 }
            android.content.Context r2 = r12.f23037e     // Catch:{ Exception -> 0x01c1 }
            r11.<init>(r2)     // Catch:{ Exception -> 0x01c1 }
            r11.setContentView(r10)     // Catch:{ Exception -> 0x01c1 }
            android.view.Window r2 = r11.getWindow()     // Catch:{ Exception -> 0x01c1 }
            cm.l.c(r2)     // Catch:{ Exception -> 0x01c1 }
            android.graphics.drawable.ColorDrawable r10 = new android.graphics.drawable.ColorDrawable     // Catch:{ Exception -> 0x01c1 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x01c1 }
            r2.setBackgroundDrawable(r10)     // Catch:{ Exception -> 0x01c1 }
            android.view.View r2 = r11.findViewById(r8)     // Catch:{ Exception -> 0x01c1 }
            cm.l.d(r2, r7)     // Catch:{ Exception -> 0x01c1 }
            android.webkit.WebView r2 = (android.webkit.WebView) r2     // Catch:{ Exception -> 0x01c1 }
            android.view.View r6 = r11.findViewById(r6)     // Catch:{ Exception -> 0x01c1 }
            cm.l.d(r6, r5)     // Catch:{ Exception -> 0x01c1 }
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch:{ Exception -> 0x01c1 }
            java.lang.Object r5 = r13.f20234e     // Catch:{ Exception -> 0x01c1 }
            ld.c r5 = (ld.c) r5     // Catch:{ Exception -> 0x01c1 }
            android.content.Context r7 = r12.f23037e     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r3 = r7.getString(r3)     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r3 = r5.b(r4, r3)     // Catch:{ Exception -> 0x01c1 }
            r6.setText(r3)     // Catch:{ Exception -> 0x01c1 }
            ej.v r3 = new ej.v     // Catch:{ Exception -> 0x01c1 }
            r3.<init>(r11)     // Catch:{ Exception -> 0x01c1 }
            r6.setOnClickListener(r3)     // Catch:{ Exception -> 0x01c1 }
            android.app.ProgressDialog r3 = new android.app.ProgressDialog     // Catch:{ Exception -> 0x01a4 }
            android.content.Context r4 = r12.f23037e     // Catch:{ Exception -> 0x01a4 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x01a4 }
            ld.c r4 = new ld.c     // Catch:{ Exception -> 0x01a4 }
            android.content.Context r5 = r12.f23037e     // Catch:{ Exception -> 0x01a4 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r5 = "label_challan_please_wait"
            android.content.Context r6 = r12.f23037e     // Catch:{ Exception -> 0x01a4 }
            r7 = 2132018813(0x7f14067d, float:1.9675943E38)
            java.lang.String r6 = r6.getString(r7)     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r4 = r4.b(r5, r6)     // Catch:{ Exception -> 0x01a4 }
            r3.setMessage(r4)     // Catch:{ Exception -> 0x01a4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a4 }
            r4.<init>()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r5 = "<html><body><img src=\""
            r4.append(r5)     // Catch:{ Exception -> 0x01a4 }
            r4.append(r0)     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r0 = "\" width=\"100%\" height=\"100%\"\"/></body></html>"
            r4.append(r0)     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r4 = "text/html"
            r2.loadData(r0, r4, r14)     // Catch:{ Exception -> 0x01a4 }
            ej.w$b r14 = new ej.w$b     // Catch:{ Exception -> 0x01a4 }
            r14.<init>(r3)     // Catch:{ Exception -> 0x01a4 }
            r2.setWebViewClient(r14)     // Catch:{ Exception -> 0x01a4 }
            goto L_0x01be
        L_0x01a4:
            android.content.Context r12 = r12.f23037e     // Catch:{ Exception -> 0x01c1 }
            java.lang.Object r13 = r13.f20234e     // Catch:{ Exception -> 0x01c1 }
            ld.c r13 = (ld.c) r13     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r14 = "service_is_not_present"
            r0 = 2132018516(0x7f140554, float:1.967534E38)
            java.lang.String r0 = r12.getString(r0)     // Catch:{ Exception -> 0x01c1 }
            java.lang.String r13 = r13.b(r14, r0)     // Catch:{ Exception -> 0x01c1 }
            android.widget.Toast r12 = android.widget.Toast.makeText(r12, r13, r1)     // Catch:{ Exception -> 0x01c1 }
            r12.show()     // Catch:{ Exception -> 0x01c1 }
        L_0x01be:
            r11.show()     // Catch:{ Exception -> 0x01c1 }
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ej.w.E(com.nic.mparivahan.dlservices.data.model.temp.InsertedDocBeanItem, ej.w, cm.u, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void F(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void G(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* renamed from: D */
    public void p(a aVar, int i10) {
        TextView U;
        l.f(aVar, "holder");
        u uVar = new u();
        uVar.f20234e = new c(this.f23037e);
        Object obj = this.f23036d.get(i10);
        l.e(obj, "get(...)");
        InsertedDocBeanItem insertedDocBeanItem = (InsertedDocBeanItem) obj;
        aVar.Q().setText(((c) uVar.f20234e).b("Document_Name_Text", this.f23037e.getString(R.string.doc_name)));
        aVar.W().setText(((c) uVar.f20234e).b("proof_lbl", this.f23037e.getString(R.string.proof)));
        aVar.R().setText(((c) uVar.f20234e).b("issued_by", this.f23037e.getString(R.string.issued_by)));
        aVar.S().setText(((c) uVar.f20234e).b("doi", this.f23037e.getString(R.string.issue_dates_dls)));
        aVar.P().setText(insertedDocBeanItem.getDocName());
        aVar.V().setText(insertedDocBeanItem.getDocName());
        String issueAuthDesg = insertedDocBeanItem.getIssueAuthDesg();
        String str = "NA";
        if (issueAuthDesg == null || issueAuthDesg.length() == 0 || l.a(insertedDocBeanItem.getIssueAuthDesg(), "null")) {
            aVar.T().setText(str);
        } else {
            aVar.T().setText(insertedDocBeanItem.getIssueAuthDesg());
        }
        String issueDate = insertedDocBeanItem.getIssueDate();
        if (issueDate == null || issueDate.length() == 0 || l.a(insertedDocBeanItem.getIssueDate(), "null")) {
            U = aVar.U();
        } else {
            U = aVar.U();
            str = insertedDocBeanItem.getIssueDate();
        }
        U.setText(str);
        aVar.O().setOnClickListener(new t(insertedDocBeanItem, this, uVar));
    }

    /* renamed from: H */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_list_adapter, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f23036d.size();
    }
}
