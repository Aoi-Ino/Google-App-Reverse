package com.nic.mparivahan.dlservices.newlearner;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import bj.n;
import bj.o;
import bj.p;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.utilities.e;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import fj.q;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import ld.c;
import ld.f;
import ni.a2;
import pl.x;

public final class LLApplicationScreen extends d {
    public a2 G;
    public Context H;
    public ProgressDialog I;
    public c J;
    private String K = "";
    public String L;
    private q M;
    public f N;
    private String O = "";
    private String P = "";
    private String Q = "";
    private String R = "";
    private String S = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLApplicationScreen f21683e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LLApplicationScreen lLApplicationScreen) {
            super(1);
            this.f21683e = lLApplicationScreen;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            this.f21683e.l1().D.c(false);
            if (p.p(dlApplStatusDto.getStatusCode(), "00", false, 2, (Object) null) && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                this.f21683e.E1(applStatusDetailsItem.getApplFlowStatusList());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21684a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f21684a = lVar;
        }

        public final pl.c a() {
            return this.f21684a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21684a.invoke(obj);
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
    public final void E1(List list) {
        Integer num;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                num = null;
                break;
            }
            Object obj = list.get(i10);
            cm.l.c(obj);
            if (cm.l.a(((ApplFlowStatusListItem) obj).getStatus(), "Pending")) {
                Object obj2 = list.get(i10);
                cm.l.c(obj2);
                Integer acCd = ((ApplFlowStatusListItem) obj2).getAcCd();
                if (acCd != null && acCd.intValue() == 455) {
                }
            }
            i10++;
        }
        Object obj3 = list.get(i10);
        cm.l.c(obj3);
        num = ((ApplFlowStatusListItem) obj3).getAcCd();
        if (num == null) {
            new DLServiceFinalSubmitedActivity().D1(this);
        } else {
            t1(num);
        }
    }

    private final void F1(File file) {
        Uri g10 = FileProvider.g(this, "com.nic.mparivahan.provider", file);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "image/*");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, p1().b("popup_pdf_error", getString(R.string.pdf_error)), 1).show();
        }
    }

    private final void G1() {
        Intent intent = new Intent(this, LLDocUpload.class);
        intent.putExtra("dl_st_appl_ackno_no", this.K);
        intent.putExtra("dl_st_appl_ackno_no_dob", k1());
        intent.putExtra("dob", k1());
        intent.putExtra("Mobile_no", this.R);
        intent.putExtra("lastEndorsedRTO", this.Q);
        intent.putExtra("lastEndorsedRTOCode", this.O);
        intent.putExtra("aadharPhoto", this.S);
        startActivity(intent);
    }

    private final void H1() {
        Intent intent = new Intent(this, LLFeePayment.class);
        intent.putExtra("dl_st_appl_ackno_no", this.K);
        intent.putExtra("dl_st_appl_ackno_no_dob", k1());
        intent.putExtra("dob", k1());
        intent.putExtra("Mobile_no", this.R);
        intent.putExtra("lastEndorsedRTO", this.Q);
        intent.putExtra("lastEndorsedRTOCode", this.O);
        intent.putExtra("aadharPhoto", this.S);
        startActivity(intent);
    }

    private final void I1() {
        Intent intent = new Intent(this, LLPhotoSign.class);
        intent.putExtra("dl_st_appl_ackno_no", this.K);
        intent.putExtra("dl_st_appl_ackno_no_dob", k1());
        intent.putExtra("dob", k1());
        intent.putExtra("Mobile_no", this.R);
        intent.putExtra("lastEndorsedRTO", this.Q);
        intent.putExtra("lastEndorsedRTOCode", this.O);
        intent.putExtra("aadharPhoto", this.S);
        startActivity(intent);
    }

    private final void J1() {
        Intent intent = new Intent(this, LLSlots.class);
        intent.putExtra("dl_st_appl_ackno_no", this.K);
        intent.putExtra("dl_st_appl_ackno_no_dob", k1());
        intent.putExtra("dob", k1());
        intent.putExtra("Mobile_no", this.R);
        intent.putExtra("lastEndorsedRTO", this.Q);
        intent.putExtra("lastEndorsedRTOCode", this.O);
        intent.putExtra("aadharPhoto", this.S);
        startActivity(intent);
    }

    private final void q1() {
        A1(this);
        D1(new c(m1()));
        C1(new f(m1()));
        B1(new ProgressDialog(m1()));
        n1().setMessage(p1().b("label_challan_please_wait", getString(R.string.please_wait)));
        n1().setCancelable(false);
        n1().setCanceledOnTouchOutside(false);
        this.M = (q) new u0(this).a(q.class);
        try {
            this.K = String.valueOf(getIntent().getStringExtra("appNumber"));
            y1(String.valueOf(getIntent().getStringExtra("dobValue")));
            String stringExtra = getIntent().getStringExtra("mobileNo");
            cm.l.c(stringExtra);
            this.R = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("rtoName");
            cm.l.c(stringExtra2);
            this.Q = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("rtoCd");
            cm.l.c(stringExtra3);
            this.O = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("stateCd");
            cm.l.c(stringExtra4);
            this.P = stringExtra4;
            String stringExtra5 = getIntent().getStringExtra("aadharPhoto");
            cm.l.c(stringExtra5);
            this.S = stringExtra5;
            l1().F.setText(o1().i());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        q qVar = this.M;
        if (qVar == null) {
            cm.l.v("viewModel");
            qVar = null;
        }
        qVar.l().g(this, new b(new a(this)));
        l1().B.setOnClickListener(new p(this));
    }

    /* access modifiers changed from: private */
    public static final void r1(LLApplicationScreen lLApplicationScreen, View view) {
        cm.l.f(lLApplicationScreen, "this$0");
        Intent intent = new Intent(lLApplicationScreen, DashBoard.class);
        intent.addFlags(67108864);
        lLApplicationScreen.startActivity(intent);
        lLApplicationScreen.finish();
    }

    private final void s1(ConstraintLayout constraintLayout) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(constraintLayout.getWidth(), constraintLayout.getHeight(), Bitmap.Config.ARGB_8888);
            cm.l.e(createBitmap, "createBitmap(...)");
            constraintLayout.draw(new Canvas(createBitmap));
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "//";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(str + "screenshot" + this.K + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            createBitmap.compress(Bitmap.CompressFormat.PNG, 70, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            F1(file2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void u1(LLApplicationScreen lLApplicationScreen, View view) {
        cm.l.f(lLApplicationScreen, "this$0");
        if (e.e(lLApplicationScreen)) {
            ConstraintLayout constraintLayout = lLApplicationScreen.l1().f25176x;
            cm.l.e(constraintLayout, "containerCl");
            lLApplicationScreen.s1(constraintLayout);
        }
    }

    /* access modifiers changed from: private */
    public static final void v1(LLApplicationScreen lLApplicationScreen, View view) {
        cm.l.f(lLApplicationScreen, "this$0");
        String str = lLApplicationScreen.K;
        lLApplicationScreen.l1().D.c(true);
        q qVar = lLApplicationScreen.M;
        if (qVar == null) {
            cm.l.v("viewModel");
            qVar = null;
        }
        qVar.h(str, lLApplicationScreen.k1());
    }

    private final void w1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new bj.q(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void x1(Dialog dialog, LLApplicationScreen lLApplicationScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(lLApplicationScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(lLApplicationScreen, DashBoard.class);
        intent.setFlags(67108864);
        lLApplicationScreen.startActivity(intent);
        lLApplicationScreen.finish();
    }

    public final void A1(Context context) {
        cm.l.f(context, "<set-?>");
        this.H = context;
    }

    public final void B1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void C1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.N = fVar;
    }

    public final void D1(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final String k1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("dobValue");
        return null;
    }

    public final a2 l1() {
        a2 a2Var = this.G;
        if (a2Var != null) {
            return a2Var;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final Context m1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final ProgressDialog n1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final f o1() {
        f fVar = this.N;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a2 x10 = a2.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        z1(x10);
        setContentView(l1().m());
        q1();
        if (p.o(this.K, "", true)) {
            l1().f25175w.setText(p1().b("label_app_for_four", getString(R.string.lbl4)));
        } else {
            MyTextView myTextView = l1().f25175w;
            myTextView.setText((p1().b("label_app_for_four", getString(R.string.lbl4)) + 10 + p1().b("label_app_for_three", getString(R.string.lbl3))) + ' ' + this.K);
        }
        l1().E.setOnClickListener(new n(this));
        l1().D.setOnClickListener(new o(this));
    }

    public final c p1() {
        c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final void t1(Integer num) {
        if (num != null && num.intValue() == 135) {
            I1();
        } else if (num != null && num.intValue() == 134) {
            H1();
        } else if (num != null && num.intValue() == 123) {
            G1();
        } else if (num != null && num.intValue() == 371) {
            J1();
        } else if (num != null && num.intValue() == 455) {
            w1(p1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void y1(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void z1(a2 a2Var) {
        cm.l.f(a2Var, "<set-?>");
        this.G = a2Var;
    }
}
