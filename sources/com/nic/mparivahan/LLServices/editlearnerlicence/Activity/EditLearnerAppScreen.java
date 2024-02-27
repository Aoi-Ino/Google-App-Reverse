package com.nic.mparivahan.LLServices.editlearnerlicence.Activity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.LLServices.editlearnerlicence.Service.EditLearnerServices;
import com.nic.mparivahan.R;
import java.util.Calendar;
import ld.f;
import ni.p4;
import pl.x;
import ub.s;
import ub.t;
import ub.u;
import ub.v;
import ub.w;
import v9.e;

public final class EditLearnerAppScreen extends d {
    private p4 G;
    /* access modifiers changed from: private */
    public ProgressDialog H;
    private ld.c I;
    private wb.b J;
    private EditLearnerServices K;
    private String L = "";
    private String M = "";
    private String N = "";
    private String O = "";
    private String P = "";
    private String Q = "";
    private Calendar R = Calendar.getInstance();
    private String S;
    private f T;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditLearnerAppScreen f9191e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(EditLearnerAppScreen editLearnerAppScreen) {
            super(1);
            this.f9191e = editLearnerAppScreen;
        }

        public final void b(vb.d dVar) {
            try {
                ProgressDialog k12 = this.f9191e.H;
                if (k12 == null) {
                    cm.l.v("pDialog");
                    k12 = null;
                }
                if (k12.isShowing()) {
                    ProgressDialog k13 = this.f9191e.H;
                    if (k13 == null) {
                        cm.l.v("pDialog");
                        k13 = null;
                    }
                    k13.dismiss();
                }
                throw null;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((vb.d) null);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditLearnerAppScreen f9192e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(EditLearnerAppScreen editLearnerAppScreen) {
            super(1);
            this.f9192e = editLearnerAppScreen;
        }

        public final void b(String str) {
            ProgressDialog k12 = this.f9192e.H;
            ProgressDialog progressDialog = null;
            if (k12 == null) {
                cm.l.v("pDialog");
                k12 = null;
            }
            if (k12.isShowing()) {
                ProgressDialog k13 = this.f9192e.H;
                if (k13 == null) {
                    cm.l.v("pDialog");
                } else {
                    progressDialog = k13;
                }
                progressDialog.dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9193a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f9193a = lVar;
        }

        public final pl.c a() {
            return this.f9193a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9193a.invoke(obj);
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

    private final void l1() {
        this.T = new f(this);
        p4 p4Var = this.G;
        p4 p4Var2 = null;
        if (p4Var == null) {
            cm.l.v("binding");
            p4Var = null;
        }
        TextView textView = p4Var.f27929y.f28452f;
        f fVar = this.T;
        if (fVar == null) {
            cm.l.v("sarthiSession");
            fVar = null;
        }
        textView.setText(fVar.i());
        p4 p4Var3 = this.G;
        if (p4Var3 == null) {
            cm.l.v("binding");
            p4Var3 = null;
        }
        p4Var3.f27929y.f28448b.setOnClickListener(new s(this));
        this.I = new ld.c(this);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.H = progressDialog;
        ld.c cVar = this.I;
        if (cVar == null) {
            cm.l.v("session");
            cVar = null;
        }
        progressDialog.setMessage(cVar.b("label_challan_please_wait", getString(R.string.please_wait)));
        ProgressDialog progressDialog2 = this.H;
        if (progressDialog2 == null) {
            cm.l.v("pDialog");
            progressDialog2 = null;
        }
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.H;
        if (progressDialog3 == null) {
            cm.l.v("pDialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        this.K = EditLearnerServices.f9250a.a(this);
        EditLearnerServices editLearnerServices = this.K;
        if (editLearnerServices == null) {
            cm.l.v("service");
            editLearnerServices = null;
        }
        this.J = (wb.b) new u0((x0) this, (u0.b) new xb.a(new wb.a(editLearnerServices))).a(wb.b.class);
        p4 p4Var4 = this.G;
        if (p4Var4 == null) {
            cm.l.v("binding");
            p4Var4 = null;
        }
        p4Var4.f27930z.setOnClickListener(new t(this));
        p4 p4Var5 = this.G;
        if (p4Var5 == null) {
            cm.l.v("binding");
            p4Var5 = null;
        }
        p4Var5.A.setOnClickListener(new u(this));
        v vVar = new v(this);
        p4 p4Var6 = this.G;
        if (p4Var6 == null) {
            cm.l.v("binding");
        } else {
            p4Var2 = p4Var6;
        }
        p4Var2.C.setOnClickListener(new w(this, vVar));
    }

    /* access modifiers changed from: private */
    public static final void m1(EditLearnerAppScreen editLearnerAppScreen, View view) {
        cm.l.f(editLearnerAppScreen, "this$0");
        editLearnerAppScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void n1(EditLearnerAppScreen editLearnerAppScreen, View view) {
        cm.l.f(editLearnerAppScreen, "this$0");
        p4 p4Var = editLearnerAppScreen.G;
        p4 p4Var2 = null;
        if (p4Var == null) {
            cm.l.v("binding");
            p4Var = null;
        }
        p4Var.f27927w.setText("");
        p4 p4Var3 = editLearnerAppScreen.G;
        if (p4Var3 == null) {
            cm.l.v("binding");
        } else {
            p4Var2 = p4Var3;
        }
        p4Var2.C.setText("");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: ld.c} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [ni.p4] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o1(com.nic.mparivahan.LLServices.editlearnerlicence.Activity.EditLearnerAppScreen r4, android.view.View r5) {
        /*
            java.lang.String r5 = "this$0"
            cm.l.f(r4, r5)
            ni.p4 r5 = r4.G
            java.lang.String r0 = "binding"
            r1 = 0
            if (r5 != 0) goto L_0x0010
            cm.l.v(r0)
            r5 = r1
        L_0x0010:
            android.widget.EditText r5 = r5.f27927w
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            int r5 = r5.length()
            r2 = 1
            java.lang.String r3 = "session"
            if (r5 != 0) goto L_0x0046
            ld.c r5 = r4.I
            if (r5 != 0) goto L_0x002b
            cm.l.v(r3)
            goto L_0x002c
        L_0x002b:
            r1 = r5
        L_0x002c:
            v9.f$a r5 = v9.f.f17510a
            java.lang.String r5 = r5.E()
            r0 = 2132017794(0x7f140282, float:1.9673876E38)
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r5 = r1.b(r5, r0)
        L_0x003d:
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r2)
            r4.show()
            goto L_0x00b4
        L_0x0046:
            ni.p4 r5 = r4.G
            if (r5 != 0) goto L_0x004e
            cm.l.v(r0)
            r5 = r1
        L_0x004e:
            android.widget.TextView r5 = r5.C
            java.lang.CharSequence r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0075
            ld.c r5 = r4.I
            if (r5 != 0) goto L_0x0066
            cm.l.v(r3)
            goto L_0x0067
        L_0x0066:
            r1 = r5
        L_0x0067:
            r5 = 2132017814(0x7f140296, float:1.9673917E38)
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r0 = "edit_dl_serv_dob"
            java.lang.String r5 = r1.b(r0, r5)
            goto L_0x003d
        L_0x0075:
            android.app.ProgressDialog r5 = r4.H
            if (r5 != 0) goto L_0x007f
            java.lang.String r5 = "pDialog"
            cm.l.v(r5)
            r5 = r1
        L_0x007f:
            r5.show()
            wb.b r5 = r4.J
            if (r5 != 0) goto L_0x008c
            java.lang.String r5 = "editLearnerVM"
            cm.l.v(r5)
            r5 = r1
        L_0x008c:
            ni.p4 r2 = r4.G
            if (r2 != 0) goto L_0x0094
            cm.l.v(r0)
            r2 = r1
        L_0x0094:
            android.widget.EditText r2 = r2.f27927w
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            ni.p4 r4 = r4.G
            if (r4 != 0) goto L_0x00a6
            cm.l.v(r0)
            goto L_0x00a7
        L_0x00a6:
            r1 = r4
        L_0x00a7:
            android.widget.TextView r4 = r1.C
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            r5.m(r2, r4)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.editlearnerlicence.Activity.EditLearnerAppScreen.o1(com.nic.mparivahan.LLServices.editlearnerlicence.Activity.EditLearnerAppScreen, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void p1(EditLearnerAppScreen editLearnerAppScreen, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(editLearnerAppScreen, "this$0");
        editLearnerAppScreen.R.set(1, i10);
        editLearnerAppScreen.R.set(2, i11);
        editLearnerAppScreen.R.set(5, i12);
        CharSequence format = DateFormat.format("dd", editLearnerAppScreen.R.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        String str = (String) format;
        CharSequence format2 = DateFormat.format("MM", editLearnerAppScreen.R.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) format2;
        CharSequence format3 = DateFormat.format("yyyy", editLearnerAppScreen.R.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) format3;
        editLearnerAppScreen.S = str + '-' + str2 + '-' + str3;
        p4 p4Var = editLearnerAppScreen.G;
        if (p4Var == null) {
            cm.l.v("binding");
            p4Var = null;
        }
        TextView textView = p4Var.C;
        textView.setText(str + '-' + str2 + '-' + str3);
    }

    /* access modifiers changed from: private */
    public static final void q1(EditLearnerAppScreen editLearnerAppScreen, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(editLearnerAppScreen, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(editLearnerAppScreen, onDateSetListener, editLearnerAppScreen.R.get(1), editLearnerAppScreen.R.get(2), editLearnerAppScreen.R.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p4 x10 = p4.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.G = x10;
        wb.b bVar = null;
        if (x10 == null) {
            cm.l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        l1();
        e.a aVar = e.f17509a;
        p4 p4Var = this.G;
        if (p4Var == null) {
            cm.l.v("binding");
            p4Var = null;
        }
        aVar.H0(this, p4Var);
        wb.b bVar2 = this.J;
        if (bVar2 == null) {
            cm.l.v("editLearnerVM");
            bVar2 = null;
        }
        bVar2.i().g(this, new c(new a(this)));
        wb.b bVar3 = this.J;
        if (bVar3 == null) {
            cm.l.v("editLearnerVM");
        } else {
            bVar = bVar3;
        }
        bVar.j().g(this, new c(new b(this)));
    }
}
