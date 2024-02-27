package com.nic.mparivahan.Echallan;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.b0;
import cb.w2;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Model.SearchChallanModel;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.R;
import db.l;
import fb.a;
import java.util.ArrayList;
import java.util.List;
import ni.e8;
import pl.x;

public final class SearchPrintReceiptListActivity extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public e8 G;
    private final String H = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private String I = "";
    private String J = "";
    private ArrayList K = new ArrayList();
    private l L;
    private SearchChallanService M;
    private jb.c N;
    public ld.c O;
    private String P = " ";
    private final TextWatcher Q = new a(this);

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchPrintReceiptListActivity f8860e;

        a(SearchPrintReceiptListActivity searchPrintReceiptListActivity) {
            this.f8860e = searchPrintReceiptListActivity;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                e8 l12 = this.f8860e.G;
                if (l12 == null) {
                    cm.l.v("binding");
                    l12 = null;
                }
                l12.f26090e.setError((CharSequence) null);
            }
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchPrintReceiptListActivity f8861e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SearchPrintReceiptListActivity searchPrintReceiptListActivity) {
            super(1);
            this.f8861e = searchPrintReceiptListActivity;
        }

        public final void b(SearchChallanModel searchChallanModel) {
            SearchPrintReceiptListActivity searchPrintReceiptListActivity;
            String message;
            AppCompatTextView appCompatTextView;
            String str;
            e8 e8Var = null;
            try {
                cm.l.c(searchChallanModel);
                if (p.o(searchChallanModel.getStatus(), "200", true)) {
                    this.f8861e.B1(searchChallanModel.getResult());
                    SearchPrintReceiptListActivity searchPrintReceiptListActivity2 = this.f8861e;
                    searchPrintReceiptListActivity2.A1(searchPrintReceiptListActivity2.p1());
                    this.f8861e.o1();
                    if (this.f8861e.p1().size() > 1) {
                        e8 l12 = this.f8861e.G;
                        if (l12 == null) {
                            cm.l.v("binding");
                            l12 = null;
                        }
                        appCompatTextView = l12.f26095j;
                        str = this.f8861e.r1().b("label_challan_totals", this.f8861e.getString(R.string.total_challans)) + ' ' + this.f8861e.p1().size();
                    } else if (this.f8861e.p1().size() == 0) {
                        e8 l13 = this.f8861e.G;
                        if (l13 == null) {
                            cm.l.v("binding");
                            l13 = null;
                        }
                        appCompatTextView = l13.f26095j;
                        str = this.f8861e.r1().b("label_challan_total", this.f8861e.getString(R.string.total_challan)) + " 0";
                    } else {
                        e8 l14 = this.f8861e.G;
                        if (l14 == null) {
                            cm.l.v("binding");
                            l14 = null;
                        }
                        appCompatTextView = l14.f26095j;
                        str = this.f8861e.r1().b("label_challan_total", this.f8861e.getString(R.string.total_challan)) + ' ' + this.f8861e.p1().size();
                    }
                    appCompatTextView.setText(str);
                    e8 l15 = this.f8861e.G;
                    if (l15 == null) {
                        cm.l.v("binding");
                        l15 = null;
                    }
                    ProgressBar progressBar = l15.f26091f;
                    cm.l.e(progressBar, "progressBar");
                    if (progressBar.getVisibility() == 0) {
                        e8 l16 = this.f8861e.G;
                        if (l16 == null) {
                            cm.l.v("binding");
                            l16 = null;
                        }
                        l16.f26091f.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (cm.l.a(searchChallanModel.getStatus(), "Failed")) {
                    e8 l17 = this.f8861e.G;
                    if (l17 == null) {
                        cm.l.v("binding");
                        l17 = null;
                    }
                    ProgressBar progressBar2 = l17.f26091f;
                    cm.l.e(progressBar2, "progressBar");
                    if (progressBar2.getVisibility() == 0) {
                        e8 l18 = this.f8861e.G;
                        if (l18 == null) {
                            cm.l.v("binding");
                            l18 = null;
                        }
                        l18.f26091f.setVisibility(8);
                    }
                    this.f8861e.p1().clear();
                    this.f8861e.o1();
                    searchPrintReceiptListActivity = this.f8861e;
                    message = searchChallanModel.getMessage();
                } else if (cm.l.a(searchChallanModel.getStatus(), "404")) {
                    e8 l19 = this.f8861e.G;
                    if (l19 == null) {
                        cm.l.v("binding");
                        l19 = null;
                    }
                    ProgressBar progressBar3 = l19.f26091f;
                    cm.l.e(progressBar3, "progressBar");
                    if (progressBar3.getVisibility() == 0) {
                        e8 l110 = this.f8861e.G;
                        if (l110 == null) {
                            cm.l.v("binding");
                            l110 = null;
                        }
                        l110.f26091f.setVisibility(8);
                    }
                    this.f8861e.p1().clear();
                    this.f8861e.o1();
                    searchPrintReceiptListActivity = this.f8861e;
                    message = searchChallanModel.getMessage();
                } else {
                    e8 l111 = this.f8861e.G;
                    if (l111 == null) {
                        cm.l.v("binding");
                        l111 = null;
                    }
                    ProgressBar progressBar4 = l111.f26091f;
                    cm.l.e(progressBar4, "progressBar");
                    if (progressBar4.getVisibility() == 0) {
                        e8 l112 = this.f8861e.G;
                        if (l112 == null) {
                            cm.l.v("binding");
                            l112 = null;
                        }
                        l112.f26091f.setVisibility(8);
                    }
                    this.f8861e.p1().clear();
                    this.f8861e.o1();
                    return;
                }
                searchPrintReceiptListActivity.D1(searchPrintReceiptListActivity, message);
            } catch (Exception e10) {
                e10.printStackTrace();
                e8 l113 = this.f8861e.G;
                if (l113 == null) {
                    cm.l.v("binding");
                    l113 = null;
                }
                ProgressBar progressBar5 = l113.f26091f;
                cm.l.e(progressBar5, "progressBar");
                if (progressBar5.getVisibility() == 0) {
                    e8 l114 = this.f8861e.G;
                    if (l114 == null) {
                        cm.l.v("binding");
                    } else {
                        e8Var = l114;
                    }
                    e8Var.f26091f.setVisibility(8);
                }
                this.f8861e.p1().clear();
                this.f8861e.o1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SearchChallanModel) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchPrintReceiptListActivity f8862e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchPrintReceiptListActivity searchPrintReceiptListActivity) {
            super(1);
            this.f8862e = searchPrintReceiptListActivity;
        }

        public final void b(String str) {
            e8 l12 = this.f8862e.G;
            e8 e8Var = null;
            if (l12 == null) {
                cm.l.v("binding");
                l12 = null;
            }
            ProgressBar progressBar = l12.f26091f;
            cm.l.e(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                e8 l13 = this.f8862e.G;
                if (l13 == null) {
                    cm.l.v("binding");
                } else {
                    e8Var = l13;
                }
                e8Var.f26091f.setVisibility(8);
            }
            this.f8862e.p1().clear();
            this.f8862e.o1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8863a;

        d(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f8863a = lVar;
        }

        public final pl.c a() {
            return this.f8863a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8863a.invoke(obj);
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
    public final void A1(List list) {
        l lVar = this.L;
        if (lVar == null) {
            cm.l.v("adapter");
            lVar = null;
        }
        lVar.B(list);
        lVar.j();
    }

    /* access modifiers changed from: private */
    public static final void E1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00be, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e9, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0114, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014a, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0174, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019e, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01cf, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0203, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0228, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean F1() {
        /*
            r8 = this;
            ni.e8 r0 = r8.G
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.CharSequence r0 = km.q.B0(r0)
            java.lang.String r0 = r0.toString()
            char[] r3 = r0.toCharArray()
            java.lang.String r4 = "this as java.lang.String).toCharArray()"
            cm.l.e(r3, r4)
            int r4 = r0.length()
            r5 = 0
            if (r4 <= 0) goto L_0x0058
            int r4 = r0.length()
            r6 = 2
            if (r4 <= r6) goto L_0x0058
            ni.e8 r4 = r8.G
            if (r4 != 0) goto L_0x003c
            cm.l.v(r2)
            r4 = r1
        L_0x003c:
            androidx.appcompat.widget.AppCompatEditText r4 = r4.f26090e
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.CharSequence r4 = km.q.B0(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.substring(r5, r6)
            java.lang.String r6 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r4, r6)
            goto L_0x005a
        L_0x0058:
            java.lang.String r4 = ""
        L_0x005a:
            java.lang.String r6 = r8.J
            java.lang.String r7 = "Challan"
            boolean r6 = cm.l.a(r6, r7)
            r7 = 1
            if (r6 == 0) goto L_0x0118
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0098
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x0073
            cm.l.v(r2)
            r0 = r1
        L_0x0073:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            ld.c r3 = r8.r1()
            r4 = 2132018723(0x7f140623, float:1.967576E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_please_enter_challan_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
        L_0x008d:
            cm.l.v(r2)
            goto L_0x0092
        L_0x0091:
            r1 = r0
        L_0x0092:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26090e
            r0.requestFocus()
            return r7
        L_0x0098:
            boolean r3 = r8.x1(r4)
            if (r3 != 0) goto L_0x00c1
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x00a6
            cm.l.v(r2)
            r0 = r1
        L_0x00a6:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            ld.c r3 = r8.r1()
            r4 = 2132018725(0x7f140625, float:1.9675765E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_enter_first_two_char_as_state"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x00c1:
            int r3 = r0.length()
            r4 = 12
            if (r3 >= r4) goto L_0x00ec
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x00d1
            cm.l.v(r2)
            r0 = r1
        L_0x00d1:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            ld.c r3 = r8.r1()
            r4 = 2132018368(0x7f1404c0, float:1.967504E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_min_length_validation"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x00ec:
            int r0 = r0.length()
            r3 = 30
            if (r0 <= r3) goto L_0x022c
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x00fc
            cm.l.v(r2)
            r0 = r1
        L_0x00fc:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            ld.c r3 = r8.r1()
            r4 = 2132018346(0x7f1404aa, float:1.9674996E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_max_length_validation"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x0118:
            java.lang.String r4 = r8.J
            java.lang.String r6 = "RC"
            boolean r4 = cm.l.a(r4, r6)
            r6 = 10
            if (r4 == 0) goto L_0x01d3
            int r4 = r0.length()
            if (r4 != 0) goto L_0x014e
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x0132
            cm.l.v(r2)
            r0 = r1
        L_0x0132:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            ld.c r3 = r8.r1()
            r4 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_please_enter_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x014e:
            int r3 = r3.length
            if (r3 < 0) goto L_0x0178
            r4 = 7
            if (r3 >= r4) goto L_0x0178
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x015c
            cm.l.v(r2)
            r0 = r1
        L_0x015c:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            ld.c r3 = r8.r1()
            r4 = 2132018892(0x7f1406cc, float:1.9676103E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_min_char_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x0178:
            int r3 = r0.length()
            if (r3 <= r6) goto L_0x01a2
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x0186
            cm.l.v(r2)
            r0 = r1
        L_0x0186:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            ld.c r3 = r8.r1()
            r4 = 2132018908(0x7f1406dc, float:1.9676136E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_rc_validation"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x01a2:
            km.f r3 = new km.f
            java.lang.String r4 = "[a-zA-Z0-9]*"
            r3.<init>((java.lang.String) r4)
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto L_0x022c
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x01b7
            cm.l.v(r2)
            r0 = r1
        L_0x01b7:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            ld.c r3 = r8.r1()
            r4 = 2132018211(0x7f140423, float:1.9674722E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_invalid_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x01d3:
            java.lang.String r3 = r8.J
            java.lang.String r4 = "DL"
            boolean r3 = cm.l.a(r3, r4)
            if (r3 == 0) goto L_0x022c
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0207
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x01eb
            cm.l.v(r2)
            r0 = r1
        L_0x01eb:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            ld.c r3 = r8.r1()
            r4 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_valid_dl_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x0207:
            int r0 = r0.length()
            if (r0 >= r6) goto L_0x022c
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x0215
            cm.l.v(r2)
            r0 = r1
        L_0x0215:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            ld.c r3 = r8.r1()
            java.lang.String r4 = "label_challan_min_char_dl_validation"
            java.lang.String r5 = "Please enter minimum 10 characters of DL number"
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            ni.e8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x022c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.SearchPrintReceiptListActivity.F1():boolean");
    }

    private final void n1() {
        if (y1()) {
            q1();
        } else {
            D1(this, r1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
        }
    }

    /* access modifiers changed from: private */
    public final void o1() {
        e8 e8Var = null;
        if (this.K.size() == 0) {
            e8 e8Var2 = this.G;
            if (e8Var2 == null) {
                cm.l.v("binding");
                e8Var2 = null;
            }
            e8Var2.f26089d.setVisibility(0);
            e8 e8Var3 = this.G;
            if (e8Var3 == null) {
                cm.l.v("binding");
                e8Var3 = null;
            }
            e8Var3.f26087b.setVisibility(8);
            e8 e8Var4 = this.G;
            if (e8Var4 == null) {
                cm.l.v("binding");
            } else {
                e8Var = e8Var4;
            }
            e8Var.f26095j.setVisibility(8);
            return;
        }
        e8 e8Var5 = this.G;
        if (e8Var5 == null) {
            cm.l.v("binding");
            e8Var5 = null;
        }
        e8Var5.f26089d.setVisibility(8);
        e8 e8Var6 = this.G;
        if (e8Var6 == null) {
            cm.l.v("binding");
            e8Var6 = null;
        }
        e8Var6.f26087b.setVisibility(0);
        e8 e8Var7 = this.G;
        if (e8Var7 == null) {
            cm.l.v("binding");
        } else {
            e8Var = e8Var7;
        }
        e8Var.f26095j.setVisibility(0);
    }

    private final void q1() {
        e8 e8Var = null;
        try {
            e8 e8Var2 = this.G;
            if (e8Var2 == null) {
                cm.l.v("binding");
                e8Var2 = null;
            }
            e8Var2.f26091f.setVisibility(0);
            jb.c cVar = this.N;
            if (cVar == null) {
                cm.l.v("viewModel");
                cVar = null;
            }
            cVar.l(this.J, this.I, 1, 1);
        } catch (Exception e10) {
            e10.printStackTrace();
            e8 e8Var3 = this.G;
            if (e8Var3 == null) {
                cm.l.v("binding");
                e8Var3 = null;
            }
            ProgressBar progressBar = e8Var3.f26091f;
            cm.l.e(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                e8 e8Var4 = this.G;
                if (e8Var4 == null) {
                    cm.l.v("binding");
                } else {
                    e8Var = e8Var4;
                }
                e8Var.f26091f.setVisibility(8);
            }
            o1();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017b, code lost:
        if (r0 == null) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01be, code lost:
        if (r0 == null) goto L_0x017d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void s1() {
        /*
            r11 = this;
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            jb.b r1 = new jb.b
            jb.a r2 = new jb.a
            com.nic.mparivahan.Echallan.Networking.SearchChallanService r3 = r11.M
            r4 = 0
            if (r3 != 0) goto L_0x0011
            java.lang.String r3 = "retrofitService"
            cm.l.v(r3)
            r3 = r4
        L_0x0011:
            r2.<init>(r3)
            r1.<init>(r2)
            r0.<init>((androidx.lifecycle.x0) r11, (androidx.lifecycle.u0.b) r1)
            java.lang.Class<jb.c> r1 = jb.c.class
            androidx.lifecycle.t0 r0 = r0.a(r1)
            jb.c r0 = (jb.c) r0
            r11.N = r0
            ni.e8 r0 = r11.G
            java.lang.String r1 = "binding"
            if (r0 != 0) goto L_0x002e
            cm.l.v(r1)
            r0 = r4
        L_0x002e:
            ni.qd r0 = r0.f26094i
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f28305f
            cb.s2 r2 = new cb.s2
            r2.<init>(r11)
            r0.setOnClickListener(r2)
            ka.c$a r0 = ka.c.f13158a
            java.lang.String r2 = r11.P
            boolean r0 = r0.m(r2)
            if (r0 != 0) goto L_0x005e
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x004c
            cm.l.v(r1)
            r0 = r4
        L_0x004c:
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f26093h
            ld.c r2 = r11.r1()
            java.lang.String r3 = "View_Payment_Receipt"
            java.lang.String r5 = r11.P
            java.lang.String r2 = r2.b(r3, r5)
        L_0x005a:
            r0.setText(r2)
            goto L_0x007a
        L_0x005e:
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x0066
            cm.l.v(r1)
            r0 = r4
        L_0x0066:
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f26093h
            ld.c r2 = r11.r1()
            r3 = 2132018855(0x7f1406a7, float:1.9676028E38)
            java.lang.String r3 = r11.getString(r3)
            java.lang.String r5 = "label_challan_print_receipt"
            java.lang.String r2 = r2.b(r5, r3)
            goto L_0x005a
        L_0x007a:
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x0082
            cm.l.v(r1)
            r0 = r4
        L_0x0082:
            ni.qd r0 = r0.f26094i
            android.widget.RelativeLayout r0 = r0.f28306g
            cb.t2 r2 = new cb.t2
            r2.<init>(r11)
            r0.setOnClickListener(r2)
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x0096
            cm.l.v(r1)
            r0 = r4
        L_0x0096:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            java.lang.String r2 = r11.H
            android.text.method.DigitsKeyListener r2 = android.text.method.DigitsKeyListener.getInstance(r2)
            r0.setKeyListener(r2)
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x00a9
            cm.l.v(r1)
            r0 = r4
        L_0x00a9:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            r2 = 4096(0x1000, float:5.74E-42)
            r0.setRawInputType(r2)
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x00b8
            cm.l.v(r1)
            r0 = r4
        L_0x00b8:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f26087b
            r2 = 0
            r0.setNestedScrollingEnabled(r2)
            r11.q1()
            java.lang.String r0 = r11.I
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x01c1
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x00d1
            cm.l.v(r1)
            r0 = r4
        L_0x00d1:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            java.lang.String r3 = r11.I
            r0.setText(r3)
            java.lang.String r0 = r11.J
            java.lang.String r3 = "Challan"
            boolean r3 = cm.l.a(r0, r3)
            r5 = 1
            if (r3 == 0) goto L_0x012c
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x00eb
            cm.l.v(r1)
            r0 = r4
        L_0x00eb:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            ld.c r3 = r11.r1()
            r6 = 2132017803(0x7f14028b, float:1.9673895E38)
            java.lang.String r6 = r11.getString(r6)
            java.lang.String r7 = "label_challan_enter_challan_no"
            java.lang.String r3 = r3.b(r7, r6)
            r0.setHint(r3)
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x0109
            cm.l.v(r1)
            r0 = r4
        L_0x0109:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            android.text.InputFilter$LengthFilter[] r3 = new android.text.InputFilter.LengthFilter[r5]
            android.text.InputFilter$LengthFilter r5 = new android.text.InputFilter$LengthFilter
            r6 = 30
            r5.<init>(r6)
            r3[r2] = r5
            android.text.InputFilter[] r3 = (android.text.InputFilter[]) r3
            r0.setFilters(r3)
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x0123
            cm.l.v(r1)
            r0 = r4
        L_0x0123:
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f26095j
            r2 = 8
        L_0x0127:
            r0.setVisibility(r2)
            goto L_0x01c1
        L_0x012c:
            java.lang.String r3 = "RC"
            boolean r0 = cm.l.a(r0, r3)
            if (r0 == 0) goto L_0x0184
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x013c
            cm.l.v(r1)
            r0 = r4
        L_0x013c:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            ld.c r3 = r11.r1()
            r6 = 2132017941(0x7f140315, float:1.9674175E38)
            java.lang.String r6 = r11.getString(r6)
            java.lang.String r7 = "label_challan_enter_vehicle_no"
            java.lang.String r3 = r3.b(r7, r6)
            r0.setHint(r3)
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x015a
            cm.l.v(r1)
            r0 = r4
        L_0x015a:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            android.text.InputFilter$LengthFilter[] r3 = new android.text.InputFilter.LengthFilter[r5]
            android.text.InputFilter$LengthFilter r5 = new android.text.InputFilter$LengthFilter
            r6 = 10
            r5.<init>(r6)
            r3[r2] = r5
            android.text.InputFilter[] r3 = (android.text.InputFilter[]) r3
            r0.setFilters(r3)
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x0174
            cm.l.v(r1)
            r0 = r4
        L_0x0174:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            r0.setInputType(r2)
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x0181
        L_0x017d:
            cm.l.v(r1)
            r0 = r4
        L_0x0181:
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f26095j
            goto L_0x0127
        L_0x0184:
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x018c
            cm.l.v(r1)
            r0 = r4
        L_0x018c:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            ld.c r3 = r11.r1()
            r6 = 2132017813(0x7f140295, float:1.9673915E38)
            java.lang.String r6 = r11.getString(r6)
            java.lang.String r7 = "label_challan_enter_dl_no"
            java.lang.String r3 = r3.b(r7, r6)
            r0.setHint(r3)
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x01aa
            cm.l.v(r1)
            r0 = r4
        L_0x01aa:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            android.text.InputFilter$LengthFilter[] r3 = new android.text.InputFilter.LengthFilter[r5]
            android.text.InputFilter$LengthFilter r5 = new android.text.InputFilter$LengthFilter
            r6 = 16
            r5.<init>(r6)
            r3[r2] = r5
            android.text.InputFilter[] r3 = (android.text.InputFilter[]) r3
            r0.setFilters(r3)
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x0181
            goto L_0x017d
        L_0x01c1:
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x01c9
            cm.l.v(r1)
            r0 = r4
        L_0x01c9:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f26087b
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r2.<init>(r11)
            r0.setLayoutManager(r2)
            db.l r0 = new db.l
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
            java.lang.String r9 = r11.P
            ld.c r10 = r11.r1()
            r5 = r0
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r11.L = r0
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x01f0
            cm.l.v(r1)
            r0 = r4
        L_0x01f0:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f26087b
            db.l r2 = r11.L
            if (r2 != 0) goto L_0x01fc
            java.lang.String r2 = "adapter"
            cm.l.v(r2)
            r2 = r4
        L_0x01fc:
            r0.setAdapter(r2)
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x0207
            cm.l.v(r1)
            r0 = r4
        L_0x0207:
            com.nic.mparivahan.MyTextView r0 = r0.f26092g
            cb.u2 r2 = new cb.u2
            r2.<init>(r11)
            r0.setOnClickListener(r2)
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x0219
            cm.l.v(r1)
            r0 = r4
        L_0x0219:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26090e
            cb.v2 r2 = new cb.v2
            r2.<init>(r11)
            r0.setOnEditorActionListener(r2)
            ni.e8 r0 = r11.G
            if (r0 != 0) goto L_0x022b
            cm.l.v(r1)
            goto L_0x022c
        L_0x022b:
            r4 = r0
        L_0x022c:
            androidx.appcompat.widget.AppCompatEditText r0 = r4.f26090e
            android.text.TextWatcher r1 = r11.Q
            r0.addTextChangedListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.SearchPrintReceiptListActivity.s1():void");
    }

    /* access modifiers changed from: private */
    public static final void t1(SearchPrintReceiptListActivity searchPrintReceiptListActivity, View view) {
        cm.l.f(searchPrintReceiptListActivity, "this$0");
        searchPrintReceiptListActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void u1(SearchPrintReceiptListActivity searchPrintReceiptListActivity, View view) {
        cm.l.f(searchPrintReceiptListActivity, "this$0");
        searchPrintReceiptListActivity.z1();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        if (r5 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009e, code lost:
        if (r5 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c1, code lost:
        if (r5 == null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v1(com.nic.mparivahan.Echallan.SearchPrintReceiptListActivity r5, android.view.View r6) {
        /*
            java.lang.String r6 = "this$0"
            cm.l.f(r5, r6)
            ni.e8 r6 = r5.G
            r0 = 0
            java.lang.String r1 = "binding"
            if (r6 != 0) goto L_0x0010
            cm.l.v(r1)
            r6 = r0
        L_0x0010:
            androidx.appcompat.widget.AppCompatEditText r6 = r6.f26090e
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.CharSequence r6 = km.q.B0(r6)
            java.lang.String r6 = r6.toString()
            boolean r2 = r5.F1()
            java.lang.String r3 = "RC"
            if (r2 != 0) goto L_0x0041
            java.lang.String r0 = r5.J
            boolean r0 = cm.l.a(r0, r3)
            if (r0 == 0) goto L_0x0036
            r5.onBackPressed()
            goto L_0x0040
        L_0x0036:
            r5.I = r6
            java.util.ArrayList r6 = r5.K
            r6.clear()
            r5.n1()
        L_0x0040:
            return
        L_0x0041:
            java.lang.String r6 = r5.J
            java.lang.String r2 = "Challan"
            boolean r2 = cm.l.a(r6, r2)
            if (r2 == 0) goto L_0x0078
            ni.e8 r6 = r5.G
            if (r6 != 0) goto L_0x0053
            cm.l.v(r1)
            r6 = r0
        L_0x0053:
            androidx.appcompat.widget.AppCompatEditText r6 = r6.f26090e
            ld.c r2 = r5.r1()
            r3 = 2132018723(0x7f140623, float:1.967576E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_please_enter_challan_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            ni.e8 r5 = r5.G
            if (r5 != 0) goto L_0x0071
        L_0x006d:
            cm.l.v(r1)
            goto L_0x0072
        L_0x0071:
            r0 = r5
        L_0x0072:
            androidx.appcompat.widget.AppCompatEditText r5 = r0.f26090e
            r5.requestFocus()
            goto L_0x00c4
        L_0x0078:
            boolean r6 = cm.l.a(r6, r3)
            if (r6 == 0) goto L_0x00a1
            ni.e8 r6 = r5.G
            if (r6 != 0) goto L_0x0086
            cm.l.v(r1)
            r6 = r0
        L_0x0086:
            androidx.appcompat.widget.AppCompatEditText r6 = r6.f26090e
            ld.c r2 = r5.r1()
            r3 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_please_enter_vehicle_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            ni.e8 r5 = r5.G
            if (r5 != 0) goto L_0x0071
            goto L_0x006d
        L_0x00a1:
            ni.e8 r6 = r5.G
            if (r6 != 0) goto L_0x00a9
            cm.l.v(r1)
            r6 = r0
        L_0x00a9:
            androidx.appcompat.widget.AppCompatEditText r6 = r6.f26090e
            ld.c r2 = r5.r1()
            r3 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_valid_dl_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            ni.e8 r5 = r5.G
            if (r5 != 0) goto L_0x0071
            goto L_0x006d
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.SearchPrintReceiptListActivity.v1(com.nic.mparivahan.Echallan.SearchPrintReceiptListActivity, android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r4 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        if (r4 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c5, code lost:
        if (r4 == null) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean w1(com.nic.mparivahan.Echallan.SearchPrintReceiptListActivity r4, android.widget.TextView r5, int r6, android.view.KeyEvent r7) {
        /*
            java.lang.String r5 = "this$0"
            cm.l.f(r4, r5)
            r5 = 6
            if (r6 != r5) goto L_0x00c9
            ni.e8 r5 = r4.G
            r6 = 0
            java.lang.String r7 = "binding"
            if (r5 != 0) goto L_0x0013
            cm.l.v(r7)
            r5 = r6
        L_0x0013:
            androidx.appcompat.widget.AppCompatEditText r5 = r5.f26090e
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.CharSequence r5 = km.q.B0(r5)
            java.lang.String r5 = r5.toString()
            boolean r0 = r4.F1()
            r1 = 1
            java.lang.String r2 = "RC"
            if (r0 != 0) goto L_0x0045
            java.lang.String r6 = r4.J
            boolean r6 = cm.l.a(r6, r2)
            if (r6 == 0) goto L_0x003a
            r4.onBackPressed()
            goto L_0x0044
        L_0x003a:
            r4.I = r5
            java.util.ArrayList r5 = r4.K
            r5.clear()
            r4.n1()
        L_0x0044:
            return r1
        L_0x0045:
            java.lang.String r5 = r4.J
            java.lang.String r0 = "Challan"
            boolean r0 = cm.l.a(r5, r0)
            if (r0 == 0) goto L_0x007c
            ni.e8 r5 = r4.G
            if (r5 != 0) goto L_0x0057
            cm.l.v(r7)
            r5 = r6
        L_0x0057:
            androidx.appcompat.widget.AppCompatEditText r5 = r5.f26090e
            ld.c r0 = r4.r1()
            r2 = 2132018723(0x7f140623, float:1.967576E38)
            java.lang.String r2 = r4.getString(r2)
            java.lang.String r3 = "label_challan_please_enter_challan_no"
            java.lang.String r0 = r0.b(r3, r2)
            r5.setError(r0)
            ni.e8 r4 = r4.G
            if (r4 != 0) goto L_0x0075
        L_0x0071:
            cm.l.v(r7)
            goto L_0x0076
        L_0x0075:
            r6 = r4
        L_0x0076:
            androidx.appcompat.widget.AppCompatEditText r4 = r6.f26090e
            r4.requestFocus()
            goto L_0x00c8
        L_0x007c:
            boolean r5 = cm.l.a(r5, r2)
            if (r5 == 0) goto L_0x00a5
            ni.e8 r5 = r4.G
            if (r5 != 0) goto L_0x008a
            cm.l.v(r7)
            r5 = r6
        L_0x008a:
            androidx.appcompat.widget.AppCompatEditText r5 = r5.f26090e
            ld.c r0 = r4.r1()
            r2 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r2 = r4.getString(r2)
            java.lang.String r3 = "label_challan_please_enter_vehicle_no"
            java.lang.String r0 = r0.b(r3, r2)
            r5.setError(r0)
            ni.e8 r4 = r4.G
            if (r4 != 0) goto L_0x0075
            goto L_0x0071
        L_0x00a5:
            ni.e8 r5 = r4.G
            if (r5 != 0) goto L_0x00ad
            cm.l.v(r7)
            r5 = r6
        L_0x00ad:
            androidx.appcompat.widget.AppCompatEditText r5 = r5.f26090e
            ld.c r0 = r4.r1()
            r2 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r2 = r4.getString(r2)
            java.lang.String r3 = "label_challan_valid_dl_no"
            java.lang.String r0 = r0.b(r3, r2)
            r5.setError(r0)
            ni.e8 r4 = r4.G
            if (r4 != 0) goto L_0x0075
            goto L_0x0071
        L_0x00c8:
            return r1
        L_0x00c9:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.SearchPrintReceiptListActivity.w1(com.nic.mparivahan.Echallan.SearchPrintReceiptListActivity, android.widget.TextView, int, android.view.KeyEvent):boolean");
    }

    private final boolean y1() {
        Object systemService = getSystemService("connectivity");
        cm.l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    private final void z1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void B1(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.K = arrayList;
    }

    public final void C1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final void D1(Context context, String str) {
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
        TextView textView = (TextView) findViewById2;
        textView.setText(r1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(r1().b("nex_parivahan", getString(R.string.app_name)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new w2(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e8 c10 = e8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        jb.c cVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        C1(new ld.c(this));
        a.C0148a aVar = fb.a.f11584a;
        e8 e8Var = this.G;
        if (e8Var == null) {
            cm.l.v("binding");
            e8Var = null;
        }
        aVar.i(this, e8Var);
        String stringExtra = getIntent().getStringExtra("inputValue");
        cm.l.c(stringExtra);
        this.I = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("inputType");
        cm.l.c(stringExtra2);
        this.J = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("Service_name");
        cm.l.c(stringExtra3);
        this.P = stringExtra3;
        this.M = SearchChallanService.f8750a.d(this);
        s1();
        jb.c cVar2 = this.N;
        if (cVar2 == null) {
            cm.l.v("viewModel");
            cVar2 = null;
        }
        cVar2.n().g(this, new d(new b(this)));
        jb.c cVar3 = this.N;
        if (cVar3 == null) {
            cm.l.v("viewModel");
        } else {
            cVar = cVar3;
        }
        cVar.m().g(this, new d(new c(this)));
    }

    public final ArrayList p1() {
        return this.K;
    }

    public final ld.c r1() {
        ld.c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final boolean x1(String str) {
        cm.l.f(str, "string");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (('A' > charAt || charAt >= '[') && ('a' > charAt || charAt >= '{')) {
                return false;
            }
        }
        return true;
    }
}
