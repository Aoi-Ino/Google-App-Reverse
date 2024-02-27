package com.nic.mparivahan.LLMainScreen;

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
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.UI.LlDocumentUpload;
import com.nic.mparivahan.LLServices.UI.LlPayment;
import com.nic.mparivahan.LLServices.UI.LlPhotoSignature;
import com.nic.mparivahan.LLServices.UI.LlSlots;
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
import java.io.Serializable;
import java.util.List;
import ld.c;
import ld.f;
import ni.g5;
import pl.x;
import qb.s;
import qb.t;
import qb.u;
import qb.v;
import qb.w;

public final class LlApplicationNumber extends d {
    public g5 G;
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
    public f U;
    public FetchLlDetails V;
    public String W;
    public String X;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlApplicationNumber f8964e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LlApplicationNumber llApplicationNumber) {
            super(1);
            this.f8964e = llApplicationNumber;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            this.f8964e.n1().E.c(false);
            if (p.p(dlApplStatusDto.getStatusCode(), "00", false, 2, (Object) null)) {
                List<ApplStatusDetailsItem> applStatusDetails = dlApplStatusDto.getApplStatusDetails();
                if (applStatusDetails != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                    this.f8964e.V1(applStatusDetailsItem.getApplFlowStatusList());
                    return;
                }
                return;
            }
            Toast.makeText(this.f8964e, dlApplStatusDto.getStatusDesc(), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8965a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f8965a = lVar;
        }

        public final pl.c a() {
            return this.f8965a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8965a.invoke(obj);
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
    public static final void A1(LlApplicationNumber llApplicationNumber, View view) {
        cm.l.f(llApplicationNumber, "this$0");
        if (e.e(llApplicationNumber)) {
            ConstraintLayout constraintLayout = llApplicationNumber.n1().f26479x;
            cm.l.e(constraintLayout, "containerCl");
            llApplicationNumber.w1(constraintLayout);
        }
    }

    /* access modifiers changed from: private */
    public static final void B1(LlApplicationNumber llApplicationNumber, View view) {
        String k10;
        cm.l.f(llApplicationNumber, "this$0");
        String str = llApplicationNumber.K;
        if (str != null && (k10 = e.k(llApplicationNumber.l1(), "dd-MM-yyyy", "dd-MM-yyyy")) != null) {
            llApplicationNumber.n1().E.c(true);
            q qVar = llApplicationNumber.L;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            qVar.h(str, k10);
        }
    }

    /* access modifiers changed from: private */
    public static final void C1(LlApplicationNumber llApplicationNumber, View view) {
        cm.l.f(llApplicationNumber, "this$0");
        Intent intent = new Intent(llApplicationNumber, DashBoard.class);
        intent.addFlags(67108864);
        llApplicationNumber.startActivity(intent);
        llApplicationNumber.finish();
    }

    private final void D1(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new w(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void E1(Dialog dialog, LlApplicationNumber llApplicationNumber, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(llApplicationNumber, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(llApplicationNumber, DashBoard.class);
        intent.setFlags(67108864);
        llApplicationNumber.startActivity(intent);
        llApplicationNumber.finish();
    }

    /* access modifiers changed from: private */
    public final void V1(List list) {
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
            z1(num);
        }
    }

    private final void W1(File file) {
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

    private final void X1() {
        try {
            Intent intent = new Intent(this, LlDocumentUpload.class);
            intent.putExtra("dl_st_appl_ackno_no", this.K);
            intent.putExtra("dl_st_appl_ackno_no_dob", q.B0(m1().getDateOfBirth()).toString());
            intent.putExtra("DL", q.B0(m1().getLearningLicence()).toString());
            intent.putExtra("dob", q.B0(m1().getDateOfBirth()).toString());
            intent.putExtra("Mobile_no", p1());
            intent.putExtra("lastEndorsedRTO", t1());
            intent.putExtra("lastEndorsedRTOCode", s1());
            intent.putExtra("LLDetails", m1());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void Y1() {
        try {
            Intent intent = new Intent(this, LlPayment.class);
            intent.putExtra("dl_st_appl_ackno_no", this.K);
            intent.putExtra("dl_st_appl_ackno_no_dob", q.B0(m1().getDateOfBirth()).toString());
            intent.putExtra("DL", q.B0(m1().getLearningLicence()).toString());
            intent.putExtra("dob", q.B0(m1().getDateOfBirth()).toString());
            intent.putExtra("Mobile_no", p1());
            intent.putExtra("lastEndorsedRTO", t1());
            intent.putExtra("lastEndorsedRTOCode", s1());
            intent.putExtra("LLDetails", m1());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void Z1() {
        try {
            Intent intent = new Intent(this, LlPhotoSignature.class);
            intent.putExtra("dl_st_appl_ackno_no", this.K);
            intent.putExtra("dl_st_appl_ackno_no_dob", q.B0(m1().getDateOfBirth()).toString());
            intent.putExtra("DL", q.B0(m1().getLearningLicence()).toString());
            intent.putExtra("dob", q.B0(m1().getDateOfBirth()).toString());
            intent.putExtra("Mobile_no", p1());
            intent.putExtra("lastEndorsedRTO", t1());
            intent.putExtra("lastEndorsedRTOCode", s1());
            intent.putExtra("LLDetails", m1());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void a2() {
        try {
            Intent intent = new Intent(this, LlSlots.class);
            intent.putExtra("dl_st_appl_ackno_no", this.K);
            intent.putExtra("dl_st_appl_ackno_no_dob", q.B0(m1().getDateOfBirth()).toString());
            intent.putExtra("DL", q.B0(m1().getLearningLicence()).toString());
            intent.putExtra("dob", q.B0(m1().getDateOfBirth()).toString());
            intent.putExtra("Mobile_no", p1());
            intent.putExtra("lastEndorsedRTO", t1());
            intent.putExtra("lastEndorsedRTOCode", s1());
            intent.putExtra("LLDetails", m1());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void v1() {
        L1(this);
        T1(new c(o1()));
        Q1(new f(o1()));
        N1(new ProgressDialog(o1()));
        q1().setMessage(u1().b("label_challan_please_wait", getString(R.string.please_wait)));
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        this.L = (q) new u0(this).a(q.class);
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            J1((FetchLlDetails) serializableExtra);
            this.K = String.valueOf(getIntent().getStringExtra("appNumber"));
            M1(String.valueOf(getIntent().getStringExtra("Mobile_no")));
            R1(String.valueOf(getIntent().getStringExtra("selectedRtoCd")));
            S1(String.valueOf(getIntent().getStringExtra("selectedRtoName")));
            H1(q.B0(m1().getDateOfBirth()).toString());
            G1(q.B0(m1().getLearningLicence()).toString());
            I1(q.B0(m1().getApplicantAddress().getSwdFullName()).toString());
            F1(q.B0(m1().getFullName()).toString());
            O1(s1());
            P1(t1());
            U1(m1().getState().getStCd());
            n1().G.setText(r1().i());
        } catch (Exception unused) {
        }
        q qVar = this.L;
        if (qVar == null) {
            cm.l.v("viewModel");
            qVar = null;
        }
        qVar.l().g(this, new b(new a(this)));
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
            W1(file2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private final void x1() {
        n1().B.f29580g.setText(new f(this).i());
        n1().B.f29581h.setPaintFlags(n1().B.f29581h.getPaintFlags() | 8);
        n1().B.f29581h.setText(q.B0(m1().getLearningLicence()).toString());
        n1().B.f29581h.setOnClickListener(new v(this));
    }

    /* access modifiers changed from: private */
    public static final void y1(LlApplicationNumber llApplicationNumber, View view) {
        cm.l.f(llApplicationNumber, "this$0");
        try {
            Intent intent = new Intent(llApplicationNumber, LlDetails.class);
            intent.putExtra("LLDetails", llApplicationNumber.m1());
            llApplicationNumber.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void F1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void G1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void H1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void I1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void J1(FetchLlDetails fetchLlDetails) {
        cm.l.f(fetchLlDetails, "<set-?>");
        this.V = fetchLlDetails;
    }

    public final void K1(g5 g5Var) {
        cm.l.f(g5Var, "<set-?>");
        this.G = g5Var;
    }

    public final void L1(Context context) {
        cm.l.f(context, "<set-?>");
        this.I = context;
    }

    public final void M1(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void N1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void O1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void P1(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void Q1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.U = fVar;
    }

    public final void R1(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void S1(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final void T1(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.H = cVar;
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final String l1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("dobValue");
        return null;
    }

    public final FetchLlDetails m1() {
        FetchLlDetails fetchLlDetails = this.V;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        cm.l.v("llDetails");
        return null;
    }

    public final g5 n1() {
        g5 g5Var = this.G;
        if (g5Var != null) {
            return g5Var;
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
        g5 x10 = g5.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        K1(x10);
        setContentView(n1().m());
        v1();
        v9.e.f17509a.l1(this, n1());
        if (p.o(this.K, "", true)) {
            n1().f26478w.setText(u1().b("label_app_for_four", getString(R.string.lbl4)));
        } else {
            MyTextView myTextView = n1().f26478w;
            myTextView.setText((u1().b("label_app_for_four", getString(R.string.lbl4)) + 10 + u1().b("label_app_for_three", getString(R.string.lbl3))) + ' ' + this.K);
        }
        n1().F.setOnClickListener(new s(this));
        n1().E.setOnClickListener(new t(this));
        x1();
        n1().B.f29577d.setOnClickListener(new u(this));
    }

    public final String p1() {
        String str = this.T;
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

    public final f r1() {
        f fVar = this.U;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final String s1() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        cm.l.v("selectedRtoCd");
        return null;
    }

    public final String t1() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        cm.l.v("selectedRtoName");
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

    public final void z1(Integer num) {
        if (num != null && num.intValue() == 135) {
            Z1();
        } else if (num != null && num.intValue() == 134) {
            Y1();
        } else if (num != null && num.intValue() == 123) {
            X1();
        } else if (num != null && num.intValue() == 371) {
            a2();
        } else if (num != null && num.intValue() == 455) {
            D1(u1().b("label_e_sign", getString(R.string.esign)));
        }
    }
}
