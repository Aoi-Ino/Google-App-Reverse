package com.nic.mparivahan.dlservices.newlearner;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.core.content.FileProvider;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bj.v2;
import bj.w2;
import bj.x2;
import bj.y2;
import bj.z2;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.newlearner.DataClass.DownloadLLResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.Service.NewLLServices;
import com.nic.mparivahan.dlservices.utilities.e;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import ld.f;
import ni.y4;
import pl.x;

public final class LearnerLicenceDownloadActivity extends d {
    private y4 G;
    public ld.c H;
    private Calendar I = Calendar.getInstance();
    private xj.b J;
    private NewLLServices K;
    public f L;
    public ProgressDialog M;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceDownloadActivity f21804e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LearnerLicenceDownloadActivity learnerLicenceDownloadActivity) {
            super(1);
            this.f21804e = learnerLicenceDownloadActivity;
        }

        public final void b(DownloadLLResponseModal downloadLLResponseModal) {
            Toast makeText;
            try {
                if (this.f21804e.n1().isShowing()) {
                    this.f21804e.n1().dismiss();
                }
                if (!p.o(downloadLLResponseModal.getStatus_code(), "00", true) || !p.o(downloadLLResponseModal.getStatus_desc(), "Success", true) || !com.nic.mparivahan.dlservices.utilities.d.d(downloadLLResponseModal.getLLPrintStatus())) {
                    if (com.nic.mparivahan.dlservices.utilities.d.d(downloadLLResponseModal.getStatus_desc())) {
                        makeText = Toast.makeText(this.f21804e, downloadLLResponseModal.getStatus_desc(), 0);
                    } else {
                        LearnerLicenceDownloadActivity learnerLicenceDownloadActivity = this.f21804e;
                        makeText = Toast.makeText(learnerLicenceDownloadActivity, learnerLicenceDownloadActivity.m1().b("service_is_not_present", "Something went wrong, Try after some time"), 0);
                    }
                    makeText.show();
                    return;
                }
                this.f21804e.l1(downloadLLResponseModal.getLLPrintStatus());
            } catch (Exception e10) {
                e10.printStackTrace();
                if (this.f21804e.n1().isShowing()) {
                    this.f21804e.n1().dismiss();
                }
                LearnerLicenceDownloadActivity learnerLicenceDownloadActivity2 = this.f21804e;
                Toast.makeText(learnerLicenceDownloadActivity2, learnerLicenceDownloadActivity2.m1().b("service_is_not_present", "Something went wrong, Try after some time"), 0).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DownloadLLResponseModal) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceDownloadActivity f21805e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LearnerLicenceDownloadActivity learnerLicenceDownloadActivity) {
            super(1);
            this.f21805e = learnerLicenceDownloadActivity;
        }

        public final void b(String str) {
            if (this.f21805e.n1().isShowing()) {
                this.f21805e.n1().dismiss();
            }
            LearnerLicenceDownloadActivity learnerLicenceDownloadActivity = this.f21805e;
            Toast.makeText(learnerLicenceDownloadActivity, learnerLicenceDownloadActivity.m1().b("service_is_not_present", "Something went wrong, Try after some time"), 0).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21806a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f21806a = lVar;
        }

        public final pl.c a() {
            return this.f21806a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21806a.invoke(obj);
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
    public final void l1(String str) {
        try {
            String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb2 = new StringBuilder();
            y4 y4Var = this.G;
            if (y4Var == null) {
                cm.l.v("binding");
                y4Var = null;
            }
            sb2.append(y4Var.f29446w.getText());
            sb2.append(System.currentTimeMillis());
            String sb3 = sb2.toString();
            File file2 = new File(str2 + sb3);
            if (!file2.exists()) {
                byte[] decode = Base64.decode(str, 0);
                cm.l.e(decode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(decode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            Uri g10 = FileProvider.g(this, "com.nic.mparivahan.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/" + sb3));
            StringBuilder sb4 = new StringBuilder();
            sb4.append("");
            sb4.append(g10);
            Log.e("create pdf uri path==>", sb4.toString());
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(g10, "application/pdf");
                intent.setFlags(67108864);
                intent.addFlags(1);
                startActivity(intent);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private final void p1() {
        v1(new ld.c(this));
        x1(new f(this));
        y4 y4Var = this.G;
        y4 y4Var2 = null;
        if (y4Var == null) {
            cm.l.v("binding");
            y4Var = null;
        }
        y4Var.B.f28452f.setText(o1().i());
        w1(new ProgressDialog(this));
        n1().setMessage(m1().b("label_challan_please_wait", getString(R.string.please_wait)));
        n1().setCancelable(true);
        n1().setCanceledOnTouchOutside(true);
        this.K = NewLLServices.f22242a.a(this);
        NewLLServices newLLServices = this.K;
        if (newLLServices == null) {
            cm.l.v("service");
            newLLServices = null;
        }
        this.J = (xj.b) new u0((x0) this, (u0.b) new yj.a(new xj.a(newLLServices))).a(xj.b.class);
        y4 y4Var3 = this.G;
        if (y4Var3 == null) {
            cm.l.v("binding");
            y4Var3 = null;
        }
        y4Var3.f29447x.setOnClickListener(new v2(this));
        y4 y4Var4 = this.G;
        if (y4Var4 == null) {
            cm.l.v("binding");
            y4Var4 = null;
        }
        y4Var4.B.f28448b.setOnClickListener(new w2(this));
        x2 x2Var = new x2(this);
        y4 y4Var5 = this.G;
        if (y4Var5 == null) {
            cm.l.v("binding");
            y4Var5 = null;
        }
        y4Var5.f29449z.setOnClickListener(new y2(this, x2Var));
        y4 y4Var6 = this.G;
        if (y4Var6 == null) {
            cm.l.v("binding");
        } else {
            y4Var2 = y4Var6;
        }
        y4Var2.f29448y.setOnClickListener(new z2(this));
    }

    /* access modifiers changed from: private */
    public static final void q1(LearnerLicenceDownloadActivity learnerLicenceDownloadActivity, View view) {
        cm.l.f(learnerLicenceDownloadActivity, "this$0");
        learnerLicenceDownloadActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void r1(LearnerLicenceDownloadActivity learnerLicenceDownloadActivity, View view) {
        cm.l.f(learnerLicenceDownloadActivity, "this$0");
        learnerLicenceDownloadActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void s1(LearnerLicenceDownloadActivity learnerLicenceDownloadActivity, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(learnerLicenceDownloadActivity, "this$0");
        learnerLicenceDownloadActivity.I.set(1, i10);
        learnerLicenceDownloadActivity.I.set(2, i11);
        learnerLicenceDownloadActivity.I.set(5, i12);
        CharSequence format = DateFormat.format("dd", learnerLicenceDownloadActivity.I.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        String str = (String) format;
        CharSequence format2 = DateFormat.format("MM", learnerLicenceDownloadActivity.I.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) format2;
        CharSequence format3 = DateFormat.format("yyyy", learnerLicenceDownloadActivity.I.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) format3;
        y4 y4Var = learnerLicenceDownloadActivity.G;
        if (y4Var == null) {
            cm.l.v("binding");
            y4Var = null;
        }
        TextView textView = y4Var.f29449z;
        textView.setText(str + '-' + str2 + '-' + str3);
    }

    /* access modifiers changed from: private */
    public static final void t1(LearnerLicenceDownloadActivity learnerLicenceDownloadActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(learnerLicenceDownloadActivity, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(learnerLicenceDownloadActivity, onDateSetListener, learnerLicenceDownloadActivity.I.get(1), learnerLicenceDownloadActivity.I.get(2), learnerLicenceDownloadActivity.I.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void u1(LearnerLicenceDownloadActivity learnerLicenceDownloadActivity, View view) {
        ld.c m12;
        String string;
        String str;
        cm.l.f(learnerLicenceDownloadActivity, "this$0");
        y4 y4Var = learnerLicenceDownloadActivity.G;
        y4 y4Var2 = null;
        if (y4Var == null) {
            cm.l.v("binding");
            y4Var = null;
        }
        if (y4Var.f29446w.getText().toString().length() == 0) {
            m12 = learnerLicenceDownloadActivity.m1();
            string = learnerLicenceDownloadActivity.getString(R.string.please_enter_valid_app_no);
            str = "PLEASE_ENTER_APPLICATION";
        } else {
            y4 y4Var3 = learnerLicenceDownloadActivity.G;
            if (y4Var3 == null) {
                cm.l.v("binding");
                y4Var3 = null;
            }
            CharSequence text = y4Var3.f29449z.getText();
            cm.l.e(text, "getText(...)");
            if (text.length() == 0) {
                m12 = learnerLicenceDownloadActivity.m1();
                string = learnerLicenceDownloadActivity.getString(R.string.please_enter_bd);
                str = "please_enter_bd";
            } else {
                try {
                    if (e.e(learnerLicenceDownloadActivity)) {
                        learnerLicenceDownloadActivity.n1().show();
                        xj.b bVar = learnerLicenceDownloadActivity.J;
                        if (bVar == null) {
                            cm.l.v("learnerLicenceVM");
                            bVar = null;
                        }
                        y4 y4Var4 = learnerLicenceDownloadActivity.G;
                        if (y4Var4 == null) {
                            cm.l.v("binding");
                            y4Var4 = null;
                        }
                        String obj = y4Var4.f29446w.getText().toString();
                        y4 y4Var5 = learnerLicenceDownloadActivity.G;
                        if (y4Var5 == null) {
                            cm.l.v("binding");
                        } else {
                            y4Var2 = y4Var5;
                        }
                        bVar.h(obj, y4Var2.f29449z.getText().toString());
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    if (learnerLicenceDownloadActivity.n1().isShowing()) {
                        learnerLicenceDownloadActivity.n1().dismiss();
                        return;
                    }
                    return;
                }
            }
        }
        Toast.makeText(learnerLicenceDownloadActivity, m12.b(str, string), 0).show();
    }

    public final ld.c m1() {
        ld.c cVar = this.H;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ProgressDialog n1() {
        ProgressDialog progressDialog = this.M;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final f o1() {
        f fVar = this.L;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        y4 x10 = y4.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.G = x10;
        xj.b bVar = null;
        if (x10 == null) {
            cm.l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        p1();
        xj.b bVar2 = this.J;
        if (bVar2 == null) {
            cm.l.v("learnerLicenceVM");
            bVar2 = null;
        }
        bVar2.o().g(this, new c(new a(this)));
        xj.b bVar3 = this.J;
        if (bVar3 == null) {
            cm.l.v("learnerLicenceVM");
        } else {
            bVar = bVar3;
        }
        bVar.u().g(this, new c(new b(this)));
    }

    public final void v1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.H = cVar;
    }

    public final void w1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.M = progressDialog;
    }

    public final void x1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.L = fVar;
    }
}
