package com.nic.mparivahan.dlservices.ui.appcancel;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.ui.appcancel.Pojo.DLDetailsForCancelApplPojo;
import gj.e;
import java.util.Calendar;
import ld.f;
import ld.g;
import ni.o;
import pl.x;

public final class ApplicationCancel extends d {
    public o G;
    private Calendar H;
    private String I;
    private Context J;
    public f K;
    public ld.c L;
    public t9.a M;
    public ClInter N;
    public g O;
    public ba.b P;
    public DlServiceInt Q;
    /* access modifiers changed from: private */
    public ProgressDialog R;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationCancel f21904e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ApplicationCancel applicationCancel) {
            super(1);
            this.f21904e = applicationCancel;
        }

        public final void b(DLDetailsForCancelApplPojo dLDetailsForCancelApplPojo) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog i12 = this.f21904e.R;
                if (i12 == null) {
                    cm.l.v("dialog");
                    i12 = null;
                }
                if (i12.isShowing()) {
                    ProgressDialog i13 = this.f21904e.R;
                    if (i13 == null) {
                        cm.l.v("dialog");
                        i13 = null;
                    }
                    i13.dismiss();
                }
                if (p.o(dLDetailsForCancelApplPojo.getStatus_code(), "00", true)) {
                    Intent intent = new Intent(this.f21904e, ApplicantDetails.class);
                    intent.putParcelableArrayListExtra("slotData", dLDetailsForCancelApplPojo.getSlot_Details());
                    intent.putExtra("applNo", this.f21904e.m1().f27709c.getText().toString());
                    this.f21904e.startActivity(intent);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressDialog i14 = this.f21904e.R;
                if (i14 == null) {
                    cm.l.v("dialog");
                    i14 = null;
                }
                if (i14.isShowing()) {
                    ProgressDialog i15 = this.f21904e.R;
                    if (i15 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = i15;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DLDetailsForCancelApplPojo) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationCancel f21905e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ApplicationCancel applicationCancel) {
            super(1);
            this.f21905e = applicationCancel;
        }

        public final void b(String str) {
            ProgressDialog i12 = this.f21905e.R;
            ProgressDialog progressDialog = null;
            if (i12 == null) {
                cm.l.v("dialog");
                i12 = null;
            }
            if (i12.isShowing()) {
                ProgressDialog i13 = this.f21905e.R;
                if (i13 == null) {
                    cm.l.v("dialog");
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

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21906a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f21906a = lVar;
        }

        public final pl.c a() {
            return this.f21906a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21906a.invoke(obj);
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

    public ApplicationCancel() {
        Calendar instance = Calendar.getInstance();
        cm.l.e(instance, "getInstance(...)");
        this.H = instance;
    }

    private final void j1() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new e(this), this.H.get(1), this.H.get(2), this.H.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void k1(ApplicationCancel applicationCancel, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(applicationCancel, "this$0");
        applicationCancel.H.set(1, i10);
        applicationCancel.H.set(2, i11);
        applicationCancel.H.set(5, i12);
        CharSequence format = DateFormat.format("dd", applicationCancel.H.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", applicationCancel.H.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", applicationCancel.H.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str = ((String) format) + '/' + ((String) format2) + '/' + ((String) format3);
        applicationCancel.I = str;
        String str2 = null;
        if (str == null) {
            cm.l.v("dateformate");
            str = null;
        }
        Log.e("Date-", str);
        TextView textView = applicationCancel.m1().f27708b;
        String str3 = applicationCancel.I;
        if (str3 == null) {
            cm.l.v("dateformate");
        } else {
            str2 = str3;
        }
        textView.setText(str2);
    }

    private final void r1() {
        this.J = this;
        Context context = this.J;
        Context context2 = null;
        if (context == null) {
            cm.l.v("mContext");
            context = null;
        }
        A1(new f(context));
        Context context3 = this.J;
        if (context3 == null) {
            cm.l.v("mContext");
            context3 = null;
        }
        v1(new ld.c(context3));
        Context context4 = this.J;
        if (context4 == null) {
            cm.l.v("mContext");
            context4 = null;
        }
        B1(new g(context4));
        DlServiceInt.a aVar = DlServiceInt.f21675a;
        Context context5 = this.J;
        if (context5 == null) {
            cm.l.v("mContext");
        } else {
            context2 = context5;
        }
        z1(aVar.a(context2));
        m1().f27713g.f28452f.setText(q1().i());
        m1().f27711e.setOnClickListener(new gj.c(this));
        u1((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(p1(), this))).a(ba.b.class));
        y1(ClInter.f7830a.a(this));
        x1((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(o1()))).a(t9.a.class));
        m1().f27718l.setOnClickListener(new gj.d(this));
    }

    /* access modifiers changed from: private */
    public static final void s1(ApplicationCancel applicationCancel, View view) {
        cm.l.f(applicationCancel, "this$0");
        applicationCancel.j1();
    }

    /* access modifiers changed from: private */
    public static final void t1(ApplicationCancel applicationCancel, View view) {
        Toast makeText;
        cm.l.f(applicationCancel, "this$0");
        ProgressDialog progressDialog = null;
        try {
            if (applicationCancel.m1().f27709c.getText().toString().length() == 0) {
                makeText = Toast.makeText(applicationCancel, applicationCancel.l1().b(v9.f.f17510a.E(), applicationCancel.getString(R.string.enter_application_no)), 1);
            } else {
                if (applicationCancel.m1().f27708b.getText().toString().length() != 0) {
                    if (!cm.l.a(applicationCancel.m1().f27708b.getText().toString(), "")) {
                        ProgressDialog progressDialog2 = applicationCancel.R;
                        if (progressDialog2 == null) {
                            cm.l.v("dialog");
                            progressDialog2 = null;
                        }
                        if (progressDialog2.isShowing()) {
                            ProgressDialog progressDialog3 = applicationCancel.R;
                            if (progressDialog3 == null) {
                                cm.l.v("dialog");
                                progressDialog3 = null;
                            }
                            progressDialog3.dismiss();
                        }
                        ProgressDialog progressDialog4 = applicationCancel.R;
                        if (progressDialog4 == null) {
                            cm.l.v("dialog");
                            progressDialog4 = null;
                        }
                        progressDialog4.show();
                        t9.a n12 = applicationCancel.n1();
                        String obj = applicationCancel.m1().f27709c.getText().toString();
                        String str = applicationCancel.I;
                        if (str == null) {
                            cm.l.v("dateformate");
                            str = null;
                        }
                        n12.k(applicationCancel, obj, str);
                        return;
                    }
                }
                makeText = Toast.makeText(applicationCancel, applicationCancel.l1().b("edit_dl_serv_dob", applicationCancel.getString(R.string.enter_dob)), 1);
            }
            makeText.show();
        } catch (Exception e10) {
            e10.printStackTrace();
            ProgressDialog progressDialog5 = applicationCancel.R;
            if (progressDialog5 == null) {
                cm.l.v("dialog");
                progressDialog5 = null;
            }
            if (progressDialog5.isShowing()) {
                ProgressDialog progressDialog6 = applicationCancel.R;
                if (progressDialog6 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = progressDialog6;
                }
                progressDialog.dismiss();
            }
        }
    }

    public final void A1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    public final void B1(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.O = gVar;
    }

    public final ld.c l1() {
        ld.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final o m1() {
        o oVar = this.G;
        if (oVar != null) {
            return oVar;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final t9.a n1() {
        t9.a aVar = this.M;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mClDlViewModel");
        return null;
    }

    public final ClInter o1() {
        ClInter clInter = this.N;
        if (clInter != null) {
            return clInter;
        }
        cm.l.v("mClInter");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o c10 = o.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        w1(c10);
        setContentView((View) m1().b());
        v1(new ld.c(this));
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.R = progressDialog;
        progressDialog.setMessage(l1().b("label_challan_getting_details", "Getting details..."));
        ProgressDialog progressDialog2 = this.R;
        ProgressDialog progressDialog3 = null;
        if (progressDialog2 == null) {
            cm.l.v("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog4 = this.R;
        if (progressDialog4 == null) {
            cm.l.v("dialog");
        } else {
            progressDialog3 = progressDialog4;
        }
        progressDialog3.setCancelable(false);
        r1();
        v9.e.f17509a.D(this, m1());
        n1().o().g(this, new c(new a(this)));
        n1().l().g(this, new c(new b(this)));
    }

    public final DlServiceInt p1() {
        DlServiceInt dlServiceInt = this.Q;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final f q1() {
        f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final void u1(ba.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.P = bVar;
    }

    public final void v1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void w1(o oVar) {
        cm.l.f(oVar, "<set-?>");
        this.G = oVar;
    }

    public final void x1(t9.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.M = aVar;
    }

    public final void y1(ClInter clInter) {
        cm.l.f(clInter, "<set-?>");
        this.N = clInter;
    }

    public final void z1(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.Q = dlServiceInt;
    }
}
