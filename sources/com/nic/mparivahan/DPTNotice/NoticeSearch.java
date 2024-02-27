package com.nic.mparivahan.DPTNotice;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import cm.l;
import cm.m;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.ValidateRcSuccess;
import com.nic.mparivahan.RC.RcInterface.RcService;
import fa.k;
import fa.n;
import java.util.ArrayList;
import ld.g;
import ni.w6;
import pl.x;
import v9.d;
import wc.h;

public final class NoticeSearch extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public w6 G;
    /* access modifiers changed from: private */
    public String H = "Notice";
    public ld.c I;
    public DatabaseHelper J;
    public cd.c K;
    public RcService L;
    public ProgressDialog M;
    public ArrayList N;
    public h O;
    public g P;
    /* access modifiers changed from: private */
    public String Q = "";

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NoticeSearch f8359e;

        a(NoticeSearch noticeSearch) {
            this.f8359e = noticeSearch;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                w6 j12 = this.f8359e.G;
                if (j12 == null) {
                    l.v("binding");
                    j12 = null;
                }
                j12.f29178b.setError((CharSequence) null);
            }
        }
    }

    public static final class b implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NoticeSearch f8360e;

        b(NoticeSearch noticeSearch) {
            this.f8360e = noticeSearch;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                w6 j12 = this.f8360e.G;
                if (j12 == null) {
                    l.v("binding");
                    j12 = null;
                }
                j12.f29179c.setError((CharSequence) null);
            }
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NoticeSearch f8361e;

        c(NoticeSearch noticeSearch) {
            this.f8361e = noticeSearch;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                w6 j12 = this.f8361e.G;
                if (j12 == null) {
                    l.v("binding");
                    j12 = null;
                }
                j12.f29181e.setError((CharSequence) null);
            }
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NoticeSearch f8362e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(NoticeSearch noticeSearch) {
            super(1);
            this.f8362e = noticeSearch;
        }

        public final void b(ValidateRcSuccess validateRcSuccess) {
            d.a aVar;
            NoticeSearch noticeSearch;
            String statusDesc;
            if (this.f8362e.o1().isShowing()) {
                this.f8362e.o1().dismiss();
            }
            int i10 = 1;
            if (p.o(validateRcSuccess.getStatusCode(), "NP001", true)) {
                Intent intent = new Intent(this.f8362e, NoticeSearchList.class);
                w6 j12 = this.f8362e.G;
                if (j12 == null) {
                    l.v("binding");
                    j12 = null;
                }
                intent.putExtra("inputValue", j12.f29181e.getText().toString());
                intent.putExtra("inputType", this.f8362e.H);
                intent.putExtra("serviceName", this.f8362e.Q);
                this.f8362e.startActivity(intent);
            } else if (p.o(validateRcSuccess.getStatusCode(), "NP985", true) || p.o(validateRcSuccess.getStatusCode(), "NR005", true)) {
                NoticeSearch noticeSearch2 = this.f8362e;
                noticeSearch2.H1(noticeSearch2, validateRcSuccess.getStatusDesc());
            } else {
                if (l.a(validateRcSuccess.getStatusCode(), "NR090")) {
                    aVar = v9.d.f17494a;
                    noticeSearch = this.f8362e;
                    statusDesc = validateRcSuccess.getStatusDesc();
                } else if (l.a(validateRcSuccess.getStatusCode(), "NR091")) {
                    aVar = v9.d.f17494a;
                    noticeSearch = this.f8362e;
                    statusDesc = validateRcSuccess.getStatusDesc();
                    i10 = 2;
                } else {
                    NoticeSearch noticeSearch3 = this.f8362e;
                    noticeSearch3.H1(noticeSearch3, noticeSearch3.p1().b("error_msg_record_not_found", this.f8362e.getString(R.string.service_unavable_please_try)));
                    return;
                }
                aVar.D(noticeSearch, statusDesc, i10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ValidateRcSuccess) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NoticeSearch f8363e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(NoticeSearch noticeSearch) {
            super(1);
            this.f8363e = noticeSearch;
        }

        public final void b(String str) {
            if (this.f8363e.o1().isShowing()) {
                this.f8363e.o1().dismiss();
            }
            NoticeSearch noticeSearch = this.f8363e;
            noticeSearch.H1(noticeSearch, noticeSearch.p1().b("error_msg_record_not_found", this.f8363e.getString(R.string.service_unavable_please_try)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8364a;

        f(bm.l lVar) {
            l.f(lVar, "function");
            this.f8364a = lVar;
        }

        public final pl.c a() {
            return this.f8364a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8364a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    private final void G1() {
        ArrayList E0 = n1().E0();
        l.d(E0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>");
        y1(E0);
        w6 w6Var = null;
        if (m1().size() > 0) {
            w6 w6Var2 = this.G;
            if (w6Var2 == null) {
                l.v("binding");
                w6Var2 = null;
            }
            w6Var2.f29184h.setVisibility(0);
            E1(new h(m1(), this, 15, ""));
            w6 w6Var3 = this.G;
            if (w6Var3 == null) {
                l.v("binding");
            } else {
                w6Var = w6Var3;
            }
            w6Var.f29184h.setAdapter(s1());
            return;
        }
        w6 w6Var4 = this.G;
        if (w6Var4 == null) {
            l.v("binding");
            w6Var4 = null;
        }
        w6Var4.f29184h.setVisibility(8);
        w6 w6Var5 = this.G;
        if (w6Var5 == null) {
            l.v("binding");
        } else {
            w6Var = w6Var5;
        }
        w6Var.f29192p.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void I1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e6, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018c, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ac, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean J1() {
        /*
            r7 = this;
            ni.w6 r0 = r7.G
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            android.widget.EditText r0 = r0.f29181e
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = km.q.B0(r0)
            java.lang.String r0 = r0.toString()
            char[] r3 = r0.toCharArray()
            java.lang.String r4 = "this as java.lang.String).toCharArray()"
            cm.l.e(r3, r4)
            java.lang.String r4 = r7.H
            java.lang.String r5 = "RC"
            boolean r4 = cm.l.a(r4, r5)
            r5 = 5
            r6 = 1
            if (r4 == 0) goto L_0x0166
            int r4 = r0.length()
            if (r4 != 0) goto L_0x0065
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x0040
            cm.l.v(r2)
            r0 = r1
        L_0x0040:
            android.widget.EditText r0 = r0.f29181e
            ld.c r3 = r7.p1()
            r4 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "label_challan_please_enter_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x005e
        L_0x005a:
            cm.l.v(r2)
            goto L_0x005f
        L_0x005e:
            r1 = r0
        L_0x005f:
            android.widget.EditText r0 = r1.f29181e
        L_0x0061:
            r0.requestFocus()
            return r6
        L_0x0065:
            int r3 = r3.length
            if (r3 < 0) goto L_0x008e
            r4 = 4
            if (r3 >= r4) goto L_0x008e
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x0073
            cm.l.v(r2)
            r0 = r1
        L_0x0073:
            android.widget.EditText r0 = r0.f29181e
            ld.c r3 = r7.p1()
            r4 = 2132018892(0x7f1406cc, float:1.9676103E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "label_challan_min_char_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x005e
            goto L_0x005a
        L_0x008e:
            int r3 = r0.length()
            r4 = 10
            if (r3 <= r4) goto L_0x00b9
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x009e
            cm.l.v(r2)
            r0 = r1
        L_0x009e:
            android.widget.EditText r0 = r0.f29181e
            ld.c r3 = r7.p1()
            r4 = 2132018908(0x7f1406dc, float:1.9676136E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "label_challan_rc_validation"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x005e
            goto L_0x005a
        L_0x00b9:
            km.f r3 = new km.f
            java.lang.String r4 = "[a-zA-Z0-9]*"
            r3.<init>((java.lang.String) r4)
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto L_0x00ea
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x00ce
            cm.l.v(r2)
            r0 = r1
        L_0x00ce:
            android.widget.EditText r0 = r0.f29181e
            ld.c r3 = r7.p1()
            r4 = 2132018211(0x7f140423, float:1.9674722E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "label_challan_invalid_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x005e
            goto L_0x005a
        L_0x00ea:
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x00f2
            cm.l.v(r2)
            r0 = r1
        L_0x00f2:
            android.widget.EditText r0 = r0.f29178b
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 >= r5) goto L_0x0128
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x010a
            cm.l.v(r2)
            r0 = r1
        L_0x010a:
            android.widget.EditText r0 = r0.f29178b
            ld.c r3 = r7.p1()
            java.lang.String r4 = "label_challan_valid_chassis_no"
            java.lang.String r5 = "Please enter the valid last 5 digit of chassis no."
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x0123
            cm.l.v(r2)
            goto L_0x0124
        L_0x0123:
            r1 = r0
        L_0x0124:
            android.widget.EditText r0 = r1.f29178b
            goto L_0x0061
        L_0x0128:
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x0130
            cm.l.v(r2)
            r0 = r1
        L_0x0130:
            android.widget.EditText r0 = r0.f29179c
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 >= r5) goto L_0x01b0
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x0148
            cm.l.v(r2)
            r0 = r1
        L_0x0148:
            android.widget.EditText r0 = r0.f29179c
            ld.c r3 = r7.p1()
            java.lang.String r4 = "label_challan_valid_engine_no"
            java.lang.String r5 = "Please enter the valid last 5 digit of engine no"
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x0161
            cm.l.v(r2)
            goto L_0x0162
        L_0x0161:
            r1 = r0
        L_0x0162:
            android.widget.EditText r0 = r1.f29179c
            goto L_0x0061
        L_0x0166:
            java.lang.String r3 = r7.H
            java.lang.String r4 = "Notice"
            boolean r3 = cm.l.a(r3, r4)
            if (r3 == 0) goto L_0x01b0
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0190
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x017e
            cm.l.v(r2)
            r0 = r1
        L_0x017e:
            android.widget.EditText r0 = r0.f29181e
            r3 = 2132018741(0x7f140635, float:1.9675797E38)
            java.lang.String r3 = r7.getString(r3)
            r0.setError(r3)
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x005e
            goto L_0x005a
        L_0x0190:
            int r0 = r0.length()
            if (r0 >= r5) goto L_0x01b0
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x019e
            cm.l.v(r2)
            r0 = r1
        L_0x019e:
            android.widget.EditText r0 = r0.f29181e
            r3 = 2132017851(0x7f1402bb, float:1.9673992E38)
            java.lang.String r3 = r7.getString(r3)
            r0.setError(r3)
            ni.w6 r0 = r7.G
            if (r0 != 0) goto L_0x005e
            goto L_0x005a
        L_0x01b0:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DPTNotice.NoticeSearch.J1():boolean");
    }

    private final void K1() {
        o1().show();
        cd.c r12 = r1();
        w6 w6Var = this.G;
        w6 w6Var2 = null;
        if (w6Var == null) {
            l.v("binding");
            w6Var = null;
        }
        String obj = w6Var.f29181e.getText().toString();
        String str = t1().k().toString();
        w6 w6Var3 = this.G;
        if (w6Var3 == null) {
            l.v("binding");
            w6Var3 = null;
        }
        String obj2 = w6Var3.f29178b.getText().toString();
        w6 w6Var4 = this.G;
        if (w6Var4 == null) {
            l.v("binding");
        } else {
            w6Var2 = w6Var4;
        }
        r12.m(obj, str, obj2, w6Var2.f29179c.getText().toString(), this, v9.d.f17494a.k());
    }

    private final void u1() {
        w6 w6Var = null;
        if (getIntent().hasExtra("serviceName")) {
            String stringExtra = getIntent().getStringExtra("serviceName");
            l.c(stringExtra);
            this.Q = stringExtra;
            w6 w6Var2 = this.G;
            if (w6Var2 == null) {
                l.v("binding");
                w6Var2 = null;
            }
            w6Var2.f29185i.setText(this.Q);
        }
        F1(new g(this));
        C1(RcService.f9484a.c(this));
        D1((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(q1()))).a(cd.c.class));
        w6 w6Var3 = this.G;
        if (w6Var3 == null) {
            l.v("binding");
            w6Var3 = null;
        }
        w6Var3.f29192p.setVisibility(8);
        w6 w6Var4 = this.G;
        if (w6Var4 == null) {
            l.v("binding");
            w6Var4 = null;
        }
        w6Var4.f29182f.setOnClickListener(new k(this));
        w6 w6Var5 = this.G;
        if (w6Var5 == null) {
            l.v("binding");
            w6Var5 = null;
        }
        w6Var5.f29191o.setOnClickListener(new fa.l(this));
        w6 w6Var6 = this.G;
        if (w6Var6 == null) {
            l.v("binding");
            w6Var6 = null;
        }
        w6Var6.f29180d.setOnClickListener(new fa.m(this));
        w6 w6Var7 = this.G;
        if (w6Var7 == null) {
            l.v("binding");
            w6Var7 = null;
        }
        w6Var7.f29178b.addTextChangedListener(new a(this));
        w6 w6Var8 = this.G;
        if (w6Var8 == null) {
            l.v("binding");
            w6Var8 = null;
        }
        w6Var8.f29179c.addTextChangedListener(new b(this));
        w6 w6Var9 = this.G;
        if (w6Var9 == null) {
            l.v("binding");
        } else {
            w6Var = w6Var9;
        }
        w6Var.f29181e.addTextChangedListener(new c(this));
        G1();
    }

    /* access modifiers changed from: private */
    public static final void v1(NoticeSearch noticeSearch, View view) {
        l.f(noticeSearch, "this$0");
        w6 w6Var = noticeSearch.G;
        w6 w6Var2 = null;
        if (w6Var == null) {
            l.v("binding");
            w6Var = null;
        }
        if (!w6Var.f29182f.isSelected()) {
            w6 w6Var3 = noticeSearch.G;
            if (w6Var3 == null) {
                l.v("binding");
                w6Var3 = null;
            }
            w6Var3.f29192p.setVisibility(8);
            w6 w6Var4 = noticeSearch.G;
            if (w6Var4 == null) {
                l.v("binding");
                w6Var4 = null;
            }
            w6Var4.f29182f.setChecked(true);
            w6 w6Var5 = noticeSearch.G;
            if (w6Var5 == null) {
                l.v("binding");
                w6Var5 = null;
            }
            w6Var5.f29182f.setSelected(true);
            w6 w6Var6 = noticeSearch.G;
            if (w6Var6 == null) {
                l.v("binding");
                w6Var6 = null;
            }
            w6Var6.f29191o.setChecked(false);
            w6 w6Var7 = noticeSearch.G;
            if (w6Var7 == null) {
                l.v("binding");
                w6Var7 = null;
            }
            w6Var7.f29191o.setSelected(false);
            w6 w6Var8 = noticeSearch.G;
            if (w6Var8 == null) {
                l.v("binding");
                w6Var8 = null;
            }
            w6Var8.f29183g.setBackgroundResource(R.drawable.corner_circle_14_selected);
            w6 w6Var9 = noticeSearch.G;
            if (w6Var9 == null) {
                l.v("binding");
                w6Var9 = null;
            }
            w6Var9.f29190n.setBackgroundResource(R.drawable.corner_circle_bg_14);
            w6 w6Var10 = noticeSearch.G;
            if (w6Var10 == null) {
                l.v("binding");
                w6Var10 = null;
            }
            Editable text = w6Var10.f29181e.getText();
            if (text != null) {
                text.clear();
            }
            w6 w6Var11 = noticeSearch.G;
            if (w6Var11 == null) {
                l.v("binding");
                w6Var11 = null;
            }
            w6Var11.f29181e.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
            noticeSearch.H = "Notice";
            w6 w6Var12 = noticeSearch.G;
            if (w6Var12 == null) {
                l.v("binding");
                w6Var12 = null;
            }
            w6Var12.f29181e.setHint(noticeSearch.getString(R.string.enter_notice_number));
            w6 w6Var13 = noticeSearch.G;
            if (w6Var13 == null) {
                l.v("binding");
                w6Var13 = null;
            }
            w6Var13.f29181e.setError((CharSequence) null);
            w6 w6Var14 = noticeSearch.G;
            if (w6Var14 == null) {
                l.v("binding");
            } else {
                w6Var2 = w6Var14;
            }
            w6Var2.f29189m.setVisibility(8);
            return;
        }
        noticeSearch.H = "";
        w6 w6Var15 = noticeSearch.G;
        if (w6Var15 == null) {
            l.v("binding");
            w6Var15 = null;
        }
        w6Var15.f29192p.setVisibility(8);
        w6 w6Var16 = noticeSearch.G;
        if (w6Var16 == null) {
            l.v("binding");
            w6Var16 = null;
        }
        w6Var16.f29182f.setChecked(false);
        w6 w6Var17 = noticeSearch.G;
        if (w6Var17 == null) {
            l.v("binding");
            w6Var17 = null;
        }
        w6Var17.f29182f.setSelected(false);
        w6 w6Var18 = noticeSearch.G;
        if (w6Var18 == null) {
            l.v("binding");
        } else {
            w6Var2 = w6Var18;
        }
        w6Var2.f29183g.setBackgroundResource(R.drawable.corner_circle_bg_14);
    }

    /* access modifiers changed from: private */
    public static final void w1(NoticeSearch noticeSearch, View view) {
        l.f(noticeSearch, "this$0");
        w6 w6Var = noticeSearch.G;
        w6 w6Var2 = null;
        if (w6Var == null) {
            l.v("binding");
            w6Var = null;
        }
        if (!w6Var.f29191o.isSelected()) {
            w6 w6Var3 = noticeSearch.G;
            if (w6Var3 == null) {
                l.v("binding");
                w6Var3 = null;
            }
            w6Var3.f29184h.setVisibility(0);
            w6 w6Var4 = noticeSearch.G;
            if (w6Var4 == null) {
                l.v("binding");
                w6Var4 = null;
            }
            w6Var4.f29192p.setVisibility(0);
            w6 w6Var5 = noticeSearch.G;
            if (w6Var5 == null) {
                l.v("binding");
                w6Var5 = null;
            }
            w6Var5.f29182f.setChecked(false);
            w6 w6Var6 = noticeSearch.G;
            if (w6Var6 == null) {
                l.v("binding");
                w6Var6 = null;
            }
            w6Var6.f29182f.setSelected(false);
            w6 w6Var7 = noticeSearch.G;
            if (w6Var7 == null) {
                l.v("binding");
                w6Var7 = null;
            }
            w6Var7.f29191o.setChecked(true);
            w6 w6Var8 = noticeSearch.G;
            if (w6Var8 == null) {
                l.v("binding");
                w6Var8 = null;
            }
            w6Var8.f29191o.setSelected(true);
            w6 w6Var9 = noticeSearch.G;
            if (w6Var9 == null) {
                l.v("binding");
                w6Var9 = null;
            }
            w6Var9.f29183g.setBackgroundResource(R.drawable.corner_circle_bg_14);
            w6 w6Var10 = noticeSearch.G;
            if (w6Var10 == null) {
                l.v("binding");
                w6Var10 = null;
            }
            w6Var10.f29190n.setBackgroundResource(R.drawable.corner_circle_14_selected);
            w6 w6Var11 = noticeSearch.G;
            if (w6Var11 == null) {
                l.v("binding");
                w6Var11 = null;
            }
            Editable text = w6Var11.f29181e.getText();
            if (text != null) {
                text.clear();
            }
            w6 w6Var12 = noticeSearch.G;
            if (w6Var12 == null) {
                l.v("binding");
                w6Var12 = null;
            }
            w6Var12.f29181e.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
            w6 w6Var13 = noticeSearch.G;
            if (w6Var13 == null) {
                l.v("binding");
                w6Var13 = null;
            }
            w6Var13.f29181e.setHint(noticeSearch.getString(R.string.enter_vehicle_number));
            noticeSearch.H = "RC";
            w6 w6Var14 = noticeSearch.G;
            if (w6Var14 == null) {
                l.v("binding");
                w6Var14 = null;
            }
            w6Var14.f29181e.setError((CharSequence) null);
            w6 w6Var15 = noticeSearch.G;
            if (w6Var15 == null) {
                l.v("binding");
            } else {
                w6Var2 = w6Var15;
            }
            w6Var2.f29189m.setVisibility(0);
            return;
        }
        noticeSearch.H = "";
        w6 w6Var16 = noticeSearch.G;
        if (w6Var16 == null) {
            l.v("binding");
            w6Var16 = null;
        }
        w6Var16.f29191o.setChecked(false);
        w6 w6Var17 = noticeSearch.G;
        if (w6Var17 == null) {
            l.v("binding");
            w6Var17 = null;
        }
        w6Var17.f29191o.setSelected(false);
        w6 w6Var18 = noticeSearch.G;
        if (w6Var18 == null) {
            l.v("binding");
            w6Var18 = null;
        }
        w6Var18.f29184h.setVisibility(0);
        w6 w6Var19 = noticeSearch.G;
        if (w6Var19 == null) {
            l.v("binding");
            w6Var19 = null;
        }
        w6Var19.f29192p.setVisibility(0);
        w6 w6Var20 = noticeSearch.G;
        if (w6Var20 == null) {
            l.v("binding");
        } else {
            w6Var2 = w6Var20;
        }
        w6Var2.f29190n.setBackgroundResource(R.drawable.corner_circle_bg_14);
    }

    /* access modifiers changed from: private */
    public static final void x1(NoticeSearch noticeSearch, View view) {
        l.f(noticeSearch, "this$0");
        if (noticeSearch.J1() || !com.nic.mparivahan.dlservices.utilities.d.d(noticeSearch.H)) {
            if (l.a(noticeSearch.H, "")) {
                noticeSearch.H1(noticeSearch, noticeSearch.p1().b("label_challan_please_select_one_search_type", "Please select one search type"));
            }
        } else if (l.a(noticeSearch.H, "RC")) {
            noticeSearch.K1();
        } else {
            Intent intent = new Intent(noticeSearch, NoticeSearchList.class);
            w6 w6Var = noticeSearch.G;
            if (w6Var == null) {
                l.v("binding");
                w6Var = null;
            }
            intent.putExtra("inputValue", w6Var.f29181e.getText().toString());
            intent.putExtra("inputType", noticeSearch.H);
            intent.putExtra("serviceName", noticeSearch.Q);
            noticeSearch.startActivity(intent);
        }
    }

    public final void A1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.M = progressDialog;
    }

    public final void B1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.I = cVar;
    }

    public final void C1(RcService rcService) {
        l.f(rcService, "<set-?>");
        this.L = rcService;
    }

    public final void D1(cd.c cVar) {
        l.f(cVar, "<set-?>");
        this.K = cVar;
    }

    public final void E1(h hVar) {
        l.f(hVar, "<set-?>");
        this.O = hVar;
    }

    public final void F1(g gVar) {
        l.f(gVar, "<set-?>");
        this.P = gVar;
    }

    public final void H1(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(p1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(p1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new n(dialog));
        dialog.show();
    }

    public final ArrayList m1() {
        ArrayList arrayList = this.N;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("arrayList");
        return null;
    }

    public final DatabaseHelper n1() {
        DatabaseHelper databaseHelper = this.J;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        l.v("databaseHelper");
        return null;
    }

    public final ProgressDialog o1() {
        ProgressDialog progressDialog = this.M;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("dialog");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w6 c10 = w6.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        w6 w6Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        B1(new ld.c(this));
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        l.e(A0, "getInstance(...)");
        z1(A0);
        A1(new ProgressDialog(this));
        o1().setMessage(p1().b("label_challan_please_wait", "Please wait..."));
        o1().setCancelable(false);
        o1().setCanceledOnTouchOutside(false);
        w6 w6Var2 = this.G;
        if (w6Var2 == null) {
            l.v("binding");
        } else {
            w6Var = w6Var2;
        }
        w6Var.f29184h.setLayoutManager(new LinearLayoutManager(this, 0, false));
        u1();
        r1().V().g(this, new f(new d(this)));
        r1().W().g(this, new f(new e(this)));
    }

    public final ld.c p1() {
        ld.c cVar = this.I;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final RcService q1() {
        RcService rcService = this.L;
        if (rcService != null) {
            return rcService;
        }
        l.v("mRcService");
        return null;
    }

    public final cd.c r1() {
        cd.c cVar = this.K;
        if (cVar != null) {
            return cVar;
        }
        l.v("mRcViewModel");
        return null;
    }

    public final h s1() {
        h hVar = this.O;
        if (hVar != null) {
            return hVar;
        }
        l.v("myRcAdapter");
        return null;
    }

    public final g t1() {
        g gVar = this.P;
        if (gVar != null) {
            return gVar;
        }
        l.v("sessionManager");
        return null;
    }

    public final void y1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.N = arrayList;
    }

    public final void z1(DatabaseHelper databaseHelper) {
        l.f(databaseHelper, "<set-?>");
        this.J = databaseHelper;
    }
}
