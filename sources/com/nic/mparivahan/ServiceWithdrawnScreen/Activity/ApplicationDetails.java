package com.nic.mparivahan.ServiceWithdrawnScreen.Activity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
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
import com.nic.mparivahan.R;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.ApplicationEligilityResultModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.CheckApplicationEligibilityModal;
import com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service.ServiceWithdrawn;
import java.util.ArrayList;
import java.util.Calendar;
import jd.e;
import jd.g;
import ld.c;
import ld.f;
import ni.zc;
import pl.x;
import v9.e;

public final class ApplicationDetails extends d {
    private zc G;
    /* access modifiers changed from: private */
    public ProgressDialog H;
    private Context I;
    public f J;
    public c K;
    private rj.d L;
    private ServiceWithdrawn M;
    private Calendar N;
    private String O;
    /* access modifiers changed from: private */
    public String P = "";
    /* access modifiers changed from: private */
    public String Q = "";
    /* access modifiers changed from: private */
    public String R = "";
    /* access modifiers changed from: private */
    public String S = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationDetails f9584e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ApplicationDetails applicationDetails) {
            super(1);
            this.f9584e = applicationDetails;
        }

        public final void b(CheckApplicationEligibilityModal checkApplicationEligibilityModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog m12 = this.f9584e.H;
                if (m12 == null) {
                    cm.l.v("dialog");
                    m12 = null;
                }
                if (m12.isShowing()) {
                    ProgressDialog m13 = this.f9584e.H;
                    if (m13 == null) {
                        cm.l.v("dialog");
                        m13 = null;
                    }
                    m13.dismiss();
                }
                if (p.o(checkApplicationEligibilityModal.getStatusCd(), "00", true)) {
                    ApplicationDetails applicationDetails = this.f9584e;
                    StringBuilder sb2 = new StringBuilder();
                    ArrayList<ApplicationEligilityResultModal> result = checkApplicationEligibilityModal.getResult();
                    cm.l.c(result);
                    sb2.append(result.get(0).getFName());
                    sb2.append(' ');
                    sb2.append(checkApplicationEligibilityModal.getResult().get(0).getMName());
                    sb2.append(' ');
                    sb2.append(checkApplicationEligibilityModal.getResult().get(0).getLName());
                    applicationDetails.Q = sb2.toString();
                    this.f9584e.P = checkApplicationEligibilityModal.getResult().get(0).getRelativeFName() + ' ' + checkApplicationEligibilityModal.getResult().get(0).getRelativeMName() + ' ' + checkApplicationEligibilityModal.getResult().get(0).getRelativeLName();
                    this.f9584e.R = checkApplicationEligibilityModal.getResult().get(0).getRelationType();
                    this.f9584e.S = checkApplicationEligibilityModal.getResult().get(0).getMobileNo();
                    this.f9584e.D1();
                    return;
                }
                ApplicationDetails applicationDetails2 = this.f9584e;
                ArrayList<ApplicationEligilityResultModal> result2 = checkApplicationEligibilityModal.getResult();
                cm.l.c(result2);
                Toast.makeText(applicationDetails2, result2.get(0).getErrorMsg(), 0).show();
            } catch (Exception unused) {
                ProgressDialog m14 = this.f9584e.H;
                if (m14 == null) {
                    cm.l.v("dialog");
                    m14 = null;
                }
                if (m14.isShowing()) {
                    ProgressDialog m15 = this.f9584e.H;
                    if (m15 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = m15;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CheckApplicationEligibilityModal) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9585a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f9585a = lVar;
        }

        public final pl.c a() {
            return this.f9585a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9585a.invoke(obj);
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

    public ApplicationDetails() {
        Calendar instance = Calendar.getInstance();
        cm.l.e(instance, "getInstance(...)");
        this.N = instance;
    }

    /* access modifiers changed from: private */
    public static final void A1(ApplicationDetails applicationDetails, View view) {
        cm.l.f(applicationDetails, "this$0");
        applicationDetails.onBackPressed();
    }

    /* access modifiers changed from: private */
    public final void D1() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.confirm_diloge_choose_sarthi);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.fullNameTv);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.fullNameValueTv);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.fatherNameValueTv);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.fatherNameTv);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView6 = (TextView) findViewById6;
        textView5.setText(u1().b("btn_ok", getString(R.string.ok_txt)));
        if (com.nic.mparivahan.dlservices.utilities.d.d(this.R)) {
            textView4.setText(this.R + " Name");
        }
        textView.setText(u1().b("FULL_NAME_SARTHI", getString(R.string.full_name_cancel)));
        textView2.setText(": " + this.Q);
        textView3.setText(": " + this.P);
        View findViewById7 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById7).setText(u1().b("nex_parivahan", "NextGen mParivahan"));
        textView5.setText(u1().b("button_proceed", "Proceed"));
        textView6.setText(u1().b("button_cancel", getString(R.string.cancel)));
        textView6.setOnClickListener(new jd.a(dialog));
        textView5.setOnClickListener(new jd.b(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void E1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void F1(Dialog dialog, ApplicationDetails applicationDetails, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(applicationDetails, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(applicationDetails, OtpVerification.class);
        zc zcVar = applicationDetails.G;
        String str = null;
        if (zcVar == null) {
            cm.l.v("binding");
            zcVar = null;
        }
        intent.putExtra("applNo", q.B0(zcVar.f29771c.getText().toString()).toString());
        intent.putExtra("fullName", applicationDetails.Q);
        intent.putExtra("fatherName", applicationDetails.P);
        intent.putExtra("mobileNo", applicationDetails.S);
        String str2 = applicationDetails.O;
        if (str2 == null) {
            cm.l.v("dateformate");
        } else {
            str = str2;
        }
        intent.putExtra("dob", str);
        applicationDetails.startActivity(intent);
    }

    private final void s1() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new g(this), this.N.get(1), this.N.get(2), this.N.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void t1(ApplicationDetails applicationDetails, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(applicationDetails, "this$0");
        applicationDetails.N.set(1, i10);
        applicationDetails.N.set(2, i11);
        applicationDetails.N.set(5, i12);
        CharSequence format = DateFormat.format("dd", applicationDetails.N.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", applicationDetails.N.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", applicationDetails.N.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str = ((String) format) + '-' + ((String) format2) + '-' + ((String) format3);
        applicationDetails.O = str;
        String str2 = null;
        if (str == null) {
            cm.l.v("dateformate");
            str = null;
        }
        Log.e("Date-", str);
        zc zcVar = applicationDetails.G;
        if (zcVar == null) {
            cm.l.v("binding");
            zcVar = null;
        }
        TextView textView = zcVar.f29770b;
        String str3 = applicationDetails.O;
        if (str3 == null) {
            cm.l.v("dateformate");
        } else {
            str2 = str3;
        }
        textView.setText(str2);
    }

    private final void w1() {
        this.I = this;
        Context context = this.I;
        zc zcVar = null;
        if (context == null) {
            cm.l.v("mContext");
            context = null;
        }
        C1(new f(context));
        zc zcVar2 = this.G;
        if (zcVar2 == null) {
            cm.l.v("binding");
            zcVar2 = null;
        }
        zcVar2.f29775g.f28452f.setText(v1().i());
        zc zcVar3 = this.G;
        if (zcVar3 == null) {
            cm.l.v("binding");
            zcVar3 = null;
        }
        zcVar3.f29775g.f28448b.setOnClickListener(new jd.c(this));
        Context context2 = this.I;
        if (context2 == null) {
            cm.l.v("mContext");
            context2 = null;
        }
        B1(new c(context2));
        ServiceWithdrawn.a aVar = ServiceWithdrawn.f22143a;
        Context context3 = this.I;
        if (context3 == null) {
            cm.l.v("mContext");
            context3 = null;
        }
        this.M = aVar.a(context3);
        ServiceWithdrawn serviceWithdrawn = this.M;
        if (serviceWithdrawn == null) {
            cm.l.v("service");
            serviceWithdrawn = null;
        }
        this.L = (rj.d) new u0((x0) this, (u0.b) new sj.b(new rj.c(serviceWithdrawn))).a(rj.d.class);
        zc zcVar4 = this.G;
        if (zcVar4 == null) {
            cm.l.v("binding");
            zcVar4 = null;
        }
        zcVar4.f29773e.setOnClickListener(new jd.d(this));
        zc zcVar5 = this.G;
        if (zcVar5 == null) {
            cm.l.v("binding");
            zcVar5 = null;
        }
        zcVar5.f29780l.setOnClickListener(new e(this));
        zc zcVar6 = this.G;
        if (zcVar6 == null) {
            cm.l.v("binding");
        } else {
            zcVar = zcVar6;
        }
        zcVar.f29772d.setOnClickListener(new jd.f(this));
    }

    /* access modifiers changed from: private */
    public static final void x1(ApplicationDetails applicationDetails, View view) {
        cm.l.f(applicationDetails, "this$0");
        applicationDetails.finish();
    }

    /* access modifiers changed from: private */
    public static final void y1(ApplicationDetails applicationDetails, View view) {
        cm.l.f(applicationDetails, "this$0");
        applicationDetails.s1();
    }

    /* access modifiers changed from: private */
    public static final void z1(ApplicationDetails applicationDetails, View view) {
        Toast makeText;
        cm.l.f(applicationDetails, "this$0");
        ProgressDialog progressDialog = null;
        try {
            zc zcVar = applicationDetails.G;
            if (zcVar == null) {
                cm.l.v("binding");
                zcVar = null;
            }
            if (zcVar.f29771c.getText().toString().length() == 0) {
                makeText = Toast.makeText(applicationDetails, applicationDetails.u1().b(v9.f.f17510a.E(), applicationDetails.getString(R.string.enter_application_no)), 1);
            } else {
                zc zcVar2 = applicationDetails.G;
                if (zcVar2 == null) {
                    cm.l.v("binding");
                    zcVar2 = null;
                }
                if (zcVar2.f29770b.getText().toString().length() != 0) {
                    zc zcVar3 = applicationDetails.G;
                    if (zcVar3 == null) {
                        cm.l.v("binding");
                        zcVar3 = null;
                    }
                    if (!cm.l.a(zcVar3.f29770b.getText().toString(), "")) {
                        ProgressDialog progressDialog2 = applicationDetails.H;
                        if (progressDialog2 == null) {
                            cm.l.v("dialog");
                            progressDialog2 = null;
                        }
                        if (progressDialog2.isShowing()) {
                            ProgressDialog progressDialog3 = applicationDetails.H;
                            if (progressDialog3 == null) {
                                cm.l.v("dialog");
                                progressDialog3 = null;
                            }
                            progressDialog3.dismiss();
                        }
                        ProgressDialog progressDialog4 = applicationDetails.H;
                        if (progressDialog4 == null) {
                            cm.l.v("dialog");
                            progressDialog4 = null;
                        }
                        progressDialog4.show();
                        rj.d dVar = applicationDetails.L;
                        if (dVar == null) {
                            cm.l.v("viewModal");
                            dVar = null;
                        }
                        zc zcVar4 = applicationDetails.G;
                        if (zcVar4 == null) {
                            cm.l.v("binding");
                            zcVar4 = null;
                        }
                        String obj = zcVar4.f29771c.getText().toString();
                        String str = applicationDetails.O;
                        if (str == null) {
                            cm.l.v("dateformate");
                            str = null;
                        }
                        dVar.g(obj, str);
                        return;
                    }
                }
                makeText = Toast.makeText(applicationDetails, applicationDetails.u1().b("edit_dl_serv_dob", applicationDetails.getString(R.string.enter_dob)), 1);
            }
            makeText.show();
        } catch (Exception e10) {
            e10.printStackTrace();
            ProgressDialog progressDialog5 = applicationDetails.H;
            if (progressDialog5 == null) {
                cm.l.v("dialog");
                progressDialog5 = null;
            }
            if (progressDialog5.isShowing()) {
                ProgressDialog progressDialog6 = applicationDetails.H;
                if (progressDialog6 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = progressDialog6;
                }
                progressDialog.dismiss();
            }
        }
    }

    public final void B1(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.K = cVar;
    }

    public final void C1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.J = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zc c10 = zc.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        rj.d dVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        B1(new c(this));
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.H = progressDialog;
        progressDialog.setMessage(u1().b("label_challan_getting_details", "Getting details..."));
        ProgressDialog progressDialog2 = this.H;
        if (progressDialog2 == null) {
            cm.l.v("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.H;
        if (progressDialog3 == null) {
            cm.l.v("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCancelable(false);
        w1();
        e.a aVar = v9.e.f17509a;
        zc zcVar = this.G;
        if (zcVar == null) {
            cm.l.v("binding");
            zcVar = null;
        }
        aVar.o(this, zcVar);
        rj.d dVar2 = this.L;
        if (dVar2 == null) {
            cm.l.v("viewModal");
        } else {
            dVar = dVar2;
        }
        dVar.k().g(this, new b(new a(this)));
    }

    public final c u1() {
        c cVar = this.K;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final f v1() {
        f fVar = this.J;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }
}
