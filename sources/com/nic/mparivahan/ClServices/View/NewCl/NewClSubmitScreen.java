package com.nic.mparivahan.ClServices.View.NewCl;

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
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.ClServices.View.ClDocumentsUpload;
import com.nic.mparivahan.ClServices.View.ClFeePayment;
import com.nic.mparivahan.ClServices.View.ClPhotoSignature;
import com.nic.mparivahan.ClServices.View.ClSots;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import ld.c;
import ld.f;
import ni.j6;
import pl.x;
import q9.n;
import q9.o;

public final class NewClSubmitScreen extends d {
    public j6 G;
    public c H;
    public Context I;
    public ProgressDialog J;
    private String K = "";
    private q L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public f V;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewClSubmitScreen f7956e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(NewClSubmitScreen newClSubmitScreen) {
            super(1);
            this.f7956e = newClSubmitScreen;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            this.f7956e.n1().D.c(false);
            if (p.p(dlApplStatusDto.getStatusCode(), "00", false, 2, (Object) null) && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                this.f7956e.Q1(applStatusDetailsItem.getApplFlowStatusList());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7957a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f7957a = lVar;
        }

        public final pl.c a() {
            return this.f7957a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7957a.invoke(obj);
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

    private final void A1(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new o(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void B1(Dialog dialog, NewClSubmitScreen newClSubmitScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(newClSubmitScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(newClSubmitScreen, DashBoard.class);
        intent.setFlags(67108864);
        newClSubmitScreen.startActivity(intent);
        newClSubmitScreen.finish();
    }

    /* access modifiers changed from: private */
    public final void Q1(List list) {
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
            x1(num);
        }
    }

    private final void R1(File file) {
        Uri g10 = FileProvider.g(this, "com.nic.mparivahan.provider", file);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "image/*");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, u1().b("popup_pdf_error", getString(R.string.pdf_error)), 1).show();
        }
    }

    private final void S1() {
        Intent intent = new Intent(this, ClDocumentsUpload.class);
        intent.putExtra("dl_st_appl_ackno_no", this.K);
        intent.putExtra("dl_st_appl_ackno_no_dob", m1());
        intent.putExtra("DL", l1());
        intent.putExtra("clPhoto", k1());
        intent.putExtra("dob", m1());
        intent.putExtra("Mobile_no", p1());
        intent.putExtra("lastEndorsedRTO", s1());
        intent.putExtra("lastEndorsedRTOCode", r1());
        startActivity(intent);
    }

    private final void T1() {
        Intent intent = new Intent(this, ClFeePayment.class);
        intent.putExtra("dl_st_appl_ackno_no", this.K);
        intent.putExtra("dl_st_appl_ackno_no_dob", m1());
        intent.putExtra("DL", l1());
        intent.putExtra("clPhoto", k1());
        intent.putExtra("dob", m1());
        intent.putExtra("Mobile_no", p1());
        intent.putExtra("lastEndorsedRTO", s1());
        intent.putExtra("lastEndorsedRTOCode", r1());
        startActivity(intent);
    }

    private final void U1() {
        Intent intent = new Intent(this, ClPhotoSignature.class);
        intent.putExtra("dl_st_appl_ackno_no", this.K);
        intent.putExtra("dl_st_appl_ackno_no_dob", m1());
        intent.putExtra("DL", l1());
        intent.putExtra("dob", m1());
        intent.putExtra("Mobile_no", p1());
        intent.putExtra("lastEndorsedRTO", s1());
        intent.putExtra("lastEndorsedRTOCode", r1());
        intent.putExtra("clPhoto", k1());
        startActivity(intent);
    }

    private final void V1() {
        Intent intent = new Intent(this, ClSots.class);
        intent.putExtra("dl_st_appl_ackno_no", this.K);
        intent.putExtra("dl_st_appl_ackno_no_dob", m1());
        intent.putExtra("DL", l1());
        intent.putExtra("clPhoto", k1());
        intent.putExtra("dob", m1());
        intent.putExtra("Mobile_no", p1());
        intent.putExtra("lastEndorsedRTO", s1());
        intent.putExtra("lastEndorsedRTOCode", r1());
        startActivity(intent);
    }

    private final void v1() {
        I1(this);
        O1(new c(o1()));
        N1(new f(o1()));
        K1(new ProgressDialog(o1()));
        q1().setMessage(u1().b("label_challan_please_wait", getString(R.string.please_wait)));
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        n1().F.setText(t1().i());
        this.L = (q) new u0(this).a(q.class);
        try {
            this.K = String.valueOf(getIntent().getStringExtra("appNumber"));
            F1(String.valueOf(getIntent().getStringExtra("dobValue")));
            E1(String.valueOf(getIntent().getStringExtra("dlValue")));
            G1(String.valueOf(getIntent().getStringExtra("fatherName")));
            C1(String.valueOf(getIntent().getStringExtra("clName")));
            D1(String.valueOf(getIntent().getStringExtra("clPhoto")));
            L1(String.valueOf(getIntent().getStringExtra("rtoCode")));
            M1(String.valueOf(getIntent().getStringExtra("rtoName")));
            P1(String.valueOf(getIntent().getStringExtra("stateCode")));
            J1(String.valueOf(getIntent().getStringExtra("Mobile_no")));
            n1().F.setText(t1().i());
        } catch (Exception unused) {
        }
        q qVar = this.L;
        if (qVar == null) {
            cm.l.v("viewModel");
            qVar = null;
        }
        qVar.k().g(this, new b(new a(this)));
    }

    private final void w1(ConstraintLayout constraintLayout) {
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
            R1(file2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void y1(NewClSubmitScreen newClSubmitScreen, View view) {
        cm.l.f(newClSubmitScreen, "this$0");
        if (e.e(newClSubmitScreen)) {
            ConstraintLayout constraintLayout = newClSubmitScreen.n1().f26959x;
            cm.l.e(constraintLayout, "containerCl");
            newClSubmitScreen.w1(constraintLayout);
        }
    }

    /* access modifiers changed from: private */
    public static final void z1(NewClSubmitScreen newClSubmitScreen, View view) {
        cm.l.f(newClSubmitScreen, "this$0");
        newClSubmitScreen.n1().D.c(true);
        q qVar = newClSubmitScreen.L;
        if (qVar == null) {
            cm.l.v("viewModel");
            qVar = null;
        }
        qVar.i(newClSubmitScreen.K, String.valueOf(newClSubmitScreen.j1(newClSubmitScreen.m1(), "dd-MM-yyyy", "dd/MM/yyyy")));
    }

    public final void C1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void D1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void E1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void F1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void G1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void H1(j6 j6Var) {
        cm.l.f(j6Var, "<set-?>");
        this.G = j6Var;
    }

    public final void I1(Context context) {
        cm.l.f(context, "<set-?>");
        this.I = context;
    }

    public final void J1(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final void K1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void L1(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void M1(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void N1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.V = fVar;
    }

    public final void O1(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.H = cVar;
    }

    public final void P1(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final String j1(String str, String str2, String str3) {
        cm.l.f(str2, "inFormType");
        cm.l.f(str3, "outFormType");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str3);
        try {
            Date parse = simpleDateFormat.parse(str);
            cm.l.e(parse, "parse(...)");
            return simpleDateFormat2.format(parse);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final String k1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("clPhoto");
        return null;
    }

    public final String l1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("dlValue");
        return null;
    }

    public final String m1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("dobValue");
        return null;
    }

    public final j6 n1() {
        j6 j6Var = this.G;
        if (j6Var != null) {
            return j6Var;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final Context o1() {
        Context context = this.I;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
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
        j6 x10 = j6.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        H1(x10);
        setContentView(n1().m());
        v1();
        v9.e.f17509a.U1(this, n1());
        if (p.o(this.K, "", true)) {
            n1().f26958w.setText(u1().b("label_app_for_four", getString(R.string.lbl4)));
        } else {
            MyTextView myTextView = n1().f26958w;
            myTextView.setText((u1().b("label_app_for_four", getString(R.string.lbl4)) + 10 + u1().b("label_app_for_three", getString(R.string.lbl3))) + ' ' + this.K);
        }
        n1().E.setOnClickListener(new q9.m(this));
        n1().D.setOnClickListener(new n(this));
    }

    public final String p1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("Mobile_no");
        return null;
    }

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String r1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoCode");
        return null;
    }

    public final String s1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoName");
        return null;
    }

    public final f t1() {
        f fVar = this.V;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final c u1() {
        c cVar = this.H;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final void x1(Integer num) {
        if (num != null && num.intValue() == 135) {
            U1();
        } else if (num != null && num.intValue() == 134) {
            T1();
        } else if (num != null && num.intValue() == 123) {
            S1();
        } else if (num != null && num.intValue() == 371) {
            V1();
        } else if (num != null && num.intValue() == 455) {
            A1(u1().b("label_e_sign", getString(R.string.esign)));
        }
    }
}
