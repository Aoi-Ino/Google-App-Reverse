package com.nic.mparivahan.LLServices.editlearnerlicence.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.m;
import com.nic.mparivahan.LLServices.editlearnerlicence.Service.EditLearnerServices;
import com.nic.mparivahan.R;
import ld.f;
import ni.k4;
import pl.x;
import ub.p;
import ub.q;
import ub.r;
import v9.e;
import vb.h;

public final class EditApplOTPScreen extends androidx.appcompat.app.d {
    private k4 G;
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
    private String R = "";
    private String S = "";
    private f T;
    private boolean U;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditApplOTPScreen f9187e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(EditApplOTPScreen editApplOTPScreen) {
            super(1);
            this.f9187e = editApplOTPScreen;
        }

        public final void b(h hVar) {
            ProgressDialog i12 = this.f9187e.H;
            if (i12 == null) {
                cm.l.v("pDialog");
                i12 = null;
            }
            if (i12.isShowing()) {
                ProgressDialog i13 = this.f9187e.H;
                if (i13 == null) {
                    cm.l.v("pDialog");
                    i13 = null;
                }
                i13.dismiss();
            }
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((h) null);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditApplOTPScreen f9188e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(EditApplOTPScreen editApplOTPScreen) {
            super(1);
            this.f9188e = editApplOTPScreen;
        }

        public final void b(String str) {
            ProgressDialog i12 = this.f9188e.H;
            ProgressDialog progressDialog = null;
            if (i12 == null) {
                cm.l.v("pDialog");
                i12 = null;
            }
            if (i12.isShowing()) {
                ProgressDialog i13 = this.f9188e.H;
                if (i13 == null) {
                    cm.l.v("pDialog");
                } else {
                    progressDialog = i13;
                }
                progressDialog.dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditApplOTPScreen f9189e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(EditApplOTPScreen editApplOTPScreen) {
            super(1);
            this.f9189e = editApplOTPScreen;
        }

        public final void b(vb.c cVar) {
            ProgressDialog i12 = this.f9189e.H;
            ProgressDialog progressDialog = null;
            if (i12 == null) {
                cm.l.v("pDialog");
                i12 = null;
            }
            if (i12.isShowing()) {
                ProgressDialog i13 = this.f9189e.H;
                if (i13 == null) {
                    cm.l.v("pDialog");
                } else {
                    progressDialog = i13;
                }
                progressDialog.dismiss();
            }
            try {
                Log.e("Result", cVar.p());
                if (cm.l.a(cVar.p(), "00")) {
                    Intent intent = new Intent(this.f9189e, PersonalDetailsEditScreen.class);
                    intent.putParcelableArrayListExtra("personalDetails", cVar.m());
                    intent.putParcelableArrayListExtra("addressDetails", cVar.c());
                    intent.putParcelableArrayListExtra("covDetails", cVar.h());
                    intent.putParcelableArrayListExtra("selectedCovDetails", cVar.o());
                    intent.putExtra("willingToDonate", cVar.q());
                    intent.putExtra("licenseFromState", cVar.l());
                    intent.putExtra("licenceFromRTO", cVar.j());
                    intent.putExtra("jurisdiction", cVar.i());
                    intent.putExtra("licenceFromRTOCode", cVar.k());
                    intent.putExtra("applicationNo", cVar.g());
                    intent.putExtra("reference", cVar.n());
                    intent.putExtra("applDate", cVar.f());
                    intent.putExtra("allowNewAddr", cVar.d());
                    intent.putExtra("applCatg", cVar.e());
                    this.f9189e.startActivity(intent);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((vb.c) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9190a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f9190a = lVar;
        }

        public final pl.c a() {
            return this.f9190a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9190a.invoke(obj);
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

    private final void j1() {
        EditText editText;
        boolean z10;
        String stringExtra = getIntent().getStringExtra("applNo");
        cm.l.c(stringExtra);
        this.Q = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("fullName");
        cm.l.c(stringExtra2);
        this.N = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("fatherName");
        cm.l.c(stringExtra3);
        this.L = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("transCode");
        cm.l.c(stringExtra4);
        this.O = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("mobileNo");
        cm.l.c(stringExtra5);
        this.M = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("reference");
        cm.l.c(stringExtra6);
        this.S = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("rtoCd");
        cm.l.c(stringExtra7);
        this.P = stringExtra7;
        k4 k4Var = null;
        if (this.Q.length() > 0) {
            k4 k4Var2 = this.G;
            if (k4Var2 == null) {
                cm.l.v("binding");
                k4Var2 = null;
            }
            k4Var2.f27074b.setText(this.Q);
        }
        if (this.M.length() > 0) {
            k4 k4Var3 = this.G;
            if (k4Var3 == null) {
                cm.l.v("binding");
                k4Var3 = null;
            }
            k4Var3.f27080h.setText(this.M);
            k4 k4Var4 = this.G;
            if (k4Var4 == null) {
                cm.l.v("binding");
            } else {
                k4Var = k4Var4;
            }
            editText = k4Var.f27080h;
            z10 = false;
        } else {
            k4 k4Var5 = this.G;
            if (k4Var5 == null) {
                cm.l.v("binding");
                k4Var5 = null;
            }
            k4Var5.f27080h.setText("");
            k4 k4Var6 = this.G;
            if (k4Var6 == null) {
                cm.l.v("binding");
            } else {
                k4Var = k4Var6;
            }
            editText = k4Var.f27080h;
            z10 = true;
        }
        editText.setFocusable(z10);
    }

    private final void k1() {
        this.T = new f(this);
        k4 k4Var = this.G;
        k4 k4Var2 = null;
        if (k4Var == null) {
            cm.l.v("binding");
            k4Var = null;
        }
        TextView textView = k4Var.f27079g.f28452f;
        f fVar = this.T;
        if (fVar == null) {
            cm.l.v("sarthiSession");
            fVar = null;
        }
        textView.setText(fVar.i());
        k4 k4Var3 = this.G;
        if (k4Var3 == null) {
            cm.l.v("binding");
            k4Var3 = null;
        }
        k4Var3.f27079g.f28448b.setOnClickListener(new p(this));
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
        k4 k4Var4 = this.G;
        if (k4Var4 == null) {
            cm.l.v("binding");
            k4Var4 = null;
        }
        k4Var4.f27076d.setOnClickListener(new q(this));
        k4 k4Var5 = this.G;
        if (k4Var5 == null) {
            cm.l.v("binding");
        } else {
            k4Var2 = k4Var5;
        }
        k4Var2.f27077e.setOnClickListener(new r(this));
    }

    /* access modifiers changed from: private */
    public static final void l1(EditApplOTPScreen editApplOTPScreen, View view) {
        cm.l.f(editApplOTPScreen, "this$0");
        editApplOTPScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void m1(EditApplOTPScreen editApplOTPScreen, View view) {
        cm.l.f(editApplOTPScreen, "this$0");
        editApplOTPScreen.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void n1(EditApplOTPScreen editApplOTPScreen, View view) {
        cm.l.f(editApplOTPScreen, "this$0");
        try {
            k4 k4Var = editApplOTPScreen.G;
            k4 k4Var2 = null;
            if (k4Var == null) {
                cm.l.v("binding");
                k4Var = null;
            }
            if (k4Var.f27080h.getText().length() < 10) {
                Toast.makeText(editApplOTPScreen, editApplOTPScreen.getString(R.string.invalid_mobile_no), 0).show();
                return;
            }
            editApplOTPScreen.U = false;
            ProgressDialog progressDialog = editApplOTPScreen.H;
            if (progressDialog == null) {
                cm.l.v("pDialog");
                progressDialog = null;
            }
            progressDialog.show();
            wb.b bVar = editApplOTPScreen.J;
            if (bVar == null) {
                cm.l.v("editLearnerVM");
                bVar = null;
            }
            String str = editApplOTPScreen.O;
            k4 k4Var3 = editApplOTPScreen.G;
            if (k4Var3 == null) {
                cm.l.v("binding");
            } else {
                k4Var2 = k4Var3;
            }
            bVar.p(str, q.B0(k4Var2.f27080h.getText().toString()).toString(), editApplOTPScreen.Q, editApplOTPScreen.N, editApplOTPScreen.P);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k4 c10 = k4.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        wb.b bVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        j1();
        k1();
        e.a aVar = e.f17509a;
        k4 k4Var = this.G;
        if (k4Var == null) {
            cm.l.v("binding");
            k4Var = null;
        }
        aVar.J0(this, k4Var);
        wb.b bVar2 = this.J;
        if (bVar2 == null) {
            cm.l.v("editLearnerVM");
            bVar2 = null;
        }
        bVar2.o().g(this, new d(new a(this)));
        wb.b bVar3 = this.J;
        if (bVar3 == null) {
            cm.l.v("editLearnerVM");
            bVar3 = null;
        }
        bVar3.j().g(this, new d(new b(this)));
        wb.b bVar4 = this.J;
        if (bVar4 == null) {
            cm.l.v("editLearnerVM");
        } else {
            bVar = bVar4;
        }
        bVar.q().g(this, new d(new c(this)));
    }
}
