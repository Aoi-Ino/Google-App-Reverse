package com.nic.mparivahan.NewDlScreen.DlAcknow;

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
import com.nic.mparivahan.NewDlScreen.Modal.LLDetailsResultModal;
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
import java.util.ArrayList;
import java.util.List;
import ld.c;
import ld.f;
import ni.a2;
import pl.x;

public final class DlApplicationScreen extends d {
    public a2 G;
    public Context H;
    public ProgressDialog I;
    public c J;
    private String K = "";
    public String L;
    public String M;
    private q N;
    public f O;
    public String P;
    public String Q;
    public String R;
    public String S;
    private ArrayList T = new ArrayList();

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlApplicationScreen f9290e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DlApplicationScreen dlApplicationScreen) {
            super(1);
            this.f9290e = dlApplicationScreen;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            this.f9290e.l1().D.c(false);
            if (p.p(dlApplStatusDto.getStatusCode(), "00", false, 2, (Object) null) && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                this.f9290e.L1(applStatusDetailsItem.getApplFlowStatusList());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9291a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f9291a = lVar;
        }

        public final pl.c a() {
            return this.f9291a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9291a.invoke(obj);
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
    public final void L1(List list) {
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
            v1(num);
        }
    }

    private final void M1(File file) {
        Uri g10 = FileProvider.g(this, "com.nic.mparivahan.provider", file);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "image/*");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, s1().b("popup_pdf_error", getString(R.string.pdf_error)), 1).show();
        }
    }

    private final void N1() {
        Intent intent = new Intent(this, DlDocUpload.class);
        intent.putExtra("dl_st_appl_ackno_no", this.K);
        intent.putExtra("dl_st_appl_ackno_no_dob", k1());
        intent.putExtra("DL", j1());
        intent.putExtra("dob", k1());
        intent.putExtra("Mobile_no", n1());
        intent.putExtra("lastEndorsedRTO", q1());
        intent.putExtra("lastEndorsedRTOCode", p1());
        startActivity(intent);
    }

    private final void O1() {
        Intent intent = new Intent(this, DlPhotoSign.class);
        intent.putExtra("dl_st_appl_ackno_no", this.K);
        intent.putExtra("dl_st_appl_ackno_no_dob", k1());
        intent.putExtra("DL", j1());
        intent.putExtra("dob", k1());
        intent.putExtra("Mobile_no", n1());
        intent.putExtra("lastEndorsedRTO", q1());
        intent.putExtra("lastEndorsedRTOCode", p1());
        startActivity(intent);
    }

    private final void P1() {
        Intent intent = new Intent(this, DlSlots.class);
        intent.putExtra("dl_st_appl_ackno_no", this.K);
        intent.putExtra("dl_st_appl_ackno_no_dob", k1());
        intent.putExtra("DL", j1());
        intent.putExtra("dob", k1());
        intent.putExtra("Mobile_no", n1());
        intent.putExtra("lastEndorsedRTO", q1());
        intent.putExtra("lastEndorsedRTOCode", p1());
        startActivity(intent);
    }

    private final void t1() {
        D1(this);
        J1(new c(m1()));
        I1(new f(m1()));
        F1(new ProgressDialog(m1()));
        o1().setMessage(s1().b("label_challan_please_wait", getString(R.string.please_wait)));
        o1().setCancelable(false);
        o1().setCanceledOnTouchOutside(false);
        this.N = (q) new u0(this).a(q.class);
        try {
            if (getIntent().hasExtra("LLDetails")) {
                ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("LLDetails");
                cm.l.c(parcelableArrayListExtra);
                this.T = parcelableArrayListExtra;
            }
            this.K = String.valueOf(getIntent().getStringExtra("appNumber"));
            B1(String.valueOf(getIntent().getStringExtra("dobValue")));
            A1(String.valueOf(getIntent().getStringExtra("dlValue")));
            E1(((LLDetailsResultModal) this.T.get(0)).getMobileNumber());
            H1(((LLDetailsResultModal) this.T.get(0)).getLlFromRTO1().get(0).getRtoName());
            G1(((LLDetailsResultModal) this.T.get(0)).getLlFromRTO1().get(0).getRtoCode());
            K1(((LLDetailsResultModal) this.T.get(0)).getLlFromState1().get(0).getLlFromState1Code());
            l1().F.setText(r1().i());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        q qVar = this.N;
        if (qVar == null) {
            cm.l.v("viewModel");
            qVar = null;
        }
        qVar.l().g(this, new b(new a(this)));
    }

    private final void u1(ConstraintLayout constraintLayout) {
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
            M1(file2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void w1(DlApplicationScreen dlApplicationScreen, View view) {
        cm.l.f(dlApplicationScreen, "this$0");
        if (e.e(dlApplicationScreen)) {
            ConstraintLayout constraintLayout = dlApplicationScreen.l1().f25176x;
            cm.l.e(constraintLayout, "containerCl");
            dlApplicationScreen.u1(constraintLayout);
        }
    }

    /* access modifiers changed from: private */
    public static final void x1(DlApplicationScreen dlApplicationScreen, View view) {
        cm.l.f(dlApplicationScreen, "this$0");
        String str = dlApplicationScreen.K;
        dlApplicationScreen.l1().D.c(true);
        q qVar = dlApplicationScreen.N;
        if (qVar == null) {
            cm.l.v("viewModel");
            qVar = null;
        }
        qVar.h(str, dlApplicationScreen.k1());
    }

    private final void y1(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new gc.c(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void z1(Dialog dialog, DlApplicationScreen dlApplicationScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dlApplicationScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(dlApplicationScreen, DashBoard.class);
        intent.setFlags(67108864);
        dlApplicationScreen.startActivity(intent);
        dlApplicationScreen.finish();
    }

    public final void A1(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void B1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void C1(a2 a2Var) {
        cm.l.f(a2Var, "<set-?>");
        this.G = a2Var;
    }

    public final void D1(Context context) {
        cm.l.f(context, "<set-?>");
        this.H = context;
    }

    public final void E1(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void F1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void G1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void H1(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void I1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.O = fVar;
    }

    public final void J1(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void K1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final String j1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("dlValue");
        return null;
    }

    public final String k1() {
        String str = this.M;
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

    public final String n1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("Mobile_no");
        return null;
    }

    public final ProgressDialog o1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a2 x10 = a2.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        C1(x10);
        setContentView(l1().m());
        t1();
        if (p.o(this.K, "", true)) {
            l1().f25175w.setText(s1().b("label_app_for_four", getString(R.string.lbl4)));
        } else {
            MyTextView myTextView = l1().f25175w;
            myTextView.setText((s1().b("label_app_for_four", getString(R.string.lbl4)) + 10 + s1().b("label_app_for_three", getString(R.string.lbl3))) + ' ' + this.K);
        }
        l1().E.setOnClickListener(new gc.a(this));
        l1().D.setOnClickListener(new gc.b(this));
    }

    public final String p1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoCode");
        return null;
    }

    public final String q1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoName");
        return null;
    }

    public final f r1() {
        f fVar = this.O;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final c s1() {
        c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final void v1(Integer num) {
        if (num != null && num.intValue() == 135) {
            O1();
        } else if ((num != null && num.intValue() == 134) || (num != null && num.intValue() == 123)) {
            N1();
        } else if (num != null && num.intValue() == 371) {
            P1();
        } else if (num != null && num.intValue() == 455) {
            y1(s1().b("label_e_sign", getString(R.string.esign)));
        }
    }
}
