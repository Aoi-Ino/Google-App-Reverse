package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.ModifiedListOfDisposeApplModel;
import com.nic.mparivahan.VahanServices.VahanModel.VahanDisposeAppSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import ni.rb;
import og.f;
import org.json.JSONArray;
import org.json.JSONObject;
import pl.x;

public final class VahanWithdrawTransactionApplied extends d implements f.a {
    private final Context G = this;
    private rb H;
    private String I = "";
    private String J = "";
    private String K = "";
    private String L = "";
    private bi.b M;
    private ApplicationService N;
    private ArrayList O = new ArrayList();
    private f P;
    public RecyclerView.p Q;
    public ProgressDialog R;
    private boolean S;
    private String T = "";
    private int U;
    private String V = "";
    private String W = "";
    private int X;
    private String Y = "";
    private String Z = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanWithdrawTransactionApplied f20843e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied) {
            super(1);
            this.f20843e = vahanWithdrawTransactionApplied;
        }

        public final void b(VahanDisposeAppSuccessModel vahanDisposeAppSuccessModel) {
            if (this.f20843e.p1().isShowing()) {
                this.f20843e.p1().dismiss();
            }
            if (cm.l.a(vahanDisposeAppSuccessModel.get(0), "Application Dispose Sussessfully...")) {
                this.f20843e.startActivity(new Intent(this.f20843e, VahanServiceWithdrawnAccepted.class));
                this.f20843e.finish();
                return;
            }
            VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied = this.f20843e;
            vahanWithdrawTransactionApplied.x1(vahanWithdrawTransactionApplied, vahanWithdrawTransactionApplied.getString(R.string.service_unavable_please_try));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VahanDisposeAppSuccessModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanWithdrawTransactionApplied f20844e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied) {
            super(1);
            this.f20844e = vahanWithdrawTransactionApplied;
        }

        public final void b(String str) {
            if (this.f20844e.p1().isShowing()) {
                this.f20844e.p1().dismiss();
            }
            if (!str.equals("Error")) {
                VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied = this.f20844e;
                vahanWithdrawTransactionApplied.x1(vahanWithdrawTransactionApplied, str);
                return;
            }
            VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied2 = this.f20844e;
            vahanWithdrawTransactionApplied2.x1(vahanWithdrawTransactionApplied2, vahanWithdrawTransactionApplied2.getString(R.string.service_unavable_please_try));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20845a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f20845a = lVar;
        }

        public final pl.c a() {
            return this.f20845a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20845a.invoke(obj);
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
    public static final void A1(Dialog dialog, VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanWithdrawTransactionApplied, "this$0");
        dialog.dismiss();
        vahanWithdrawTransactionApplied.n1();
    }

    /* access modifiers changed from: private */
    public static final void B1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void n1() {
        if (p1().isShowing()) {
            p1().dismiss();
        }
        p1().show();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("transactionID", (Object) this.T);
            jSONObject.put("pur_cd", this.U);
            jSONObject.put("regn_no", (Object) this.V);
            jSONObject.put("state_cd", (Object) this.W);
            jSONObject.put("off_cd", this.X);
            jSONObject.put("descr", (Object) this.Y);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put((Object) jSONObject);
            bi.b bVar = this.M;
            if (bVar == null) {
                cm.l.v("viewModel");
                bVar = null;
            }
            bVar.g(this, jSONArray);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void q1() {
        rb rbVar = this.H;
        rb rbVar2 = null;
        if (rbVar == null) {
            cm.l.v("binding");
            rbVar = null;
        }
        rbVar.f28439g.setText("Dispose Application");
        rb rbVar3 = this.H;
        if (rbVar3 == null) {
            cm.l.v("binding");
            rbVar3 = null;
        }
        rbVar3.f28437e.f28308i.setText("Dispose Application");
        ApplicationService applicationService = this.N;
        if (applicationService == null) {
            cm.l.v("retrofitService");
            applicationService = null;
        }
        this.M = (bi.b) new u0((x0) this, (u0.b) new bi.f(new wg.b(applicationService))).a(bi.b.class);
        if (this.I.length() > 0) {
            rb rbVar4 = this.H;
            if (rbVar4 == null) {
                cm.l.v("binding");
                rbVar4 = null;
            }
            rbVar4.f28435c.setText(this.I);
        }
        if (this.J.length() > 0) {
            rb rbVar5 = this.H;
            if (rbVar5 == null) {
                cm.l.v("binding");
                rbVar5 = null;
            }
            rbVar5.f28436d.setText(this.J);
        }
        if (this.K.length() > 0) {
            rb rbVar6 = this.H;
            if (rbVar6 == null) {
                cm.l.v("binding");
                rbVar6 = null;
            }
            rbVar6.f28445m.setText(this.K);
        }
        if (this.L.length() > 0) {
            rb rbVar7 = this.H;
            if (rbVar7 == null) {
                cm.l.v("binding");
                rbVar7 = null;
            }
            rbVar7.f28443k.setText(this.L);
        }
        if (this.Z.length() > 0) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
                Date parse = simpleDateFormat.parse(this.Z);
                cm.l.c(parse);
                String format = simpleDateFormat2.format(parse);
                cm.l.c(format);
                if (format.length() > 0) {
                    rb rbVar8 = this.H;
                    if (rbVar8 == null) {
                        cm.l.v("binding");
                        rbVar8 = null;
                    }
                    rbVar8.f28434b.setText(format);
                } else {
                    rb rbVar9 = this.H;
                    if (rbVar9 == null) {
                        cm.l.v("binding");
                        rbVar9 = null;
                    }
                    rbVar9.f28434b.setText("");
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        rb rbVar10 = this.H;
        if (rbVar10 == null) {
            cm.l.v("binding");
            rbVar10 = null;
        }
        rbVar10.f28440h.setAlpha(0.5f);
        rb rbVar11 = this.H;
        if (rbVar11 == null) {
            cm.l.v("binding");
            rbVar11 = null;
        }
        rbVar11.f28440h.setEnabled(false);
        rb rbVar12 = this.H;
        if (rbVar12 == null) {
            cm.l.v("binding");
            rbVar12 = null;
        }
        rbVar12.f28438f.setAlpha(0.5f);
        rb rbVar13 = this.H;
        if (rbVar13 == null) {
            cm.l.v("binding");
            rbVar13 = null;
        }
        rbVar13.f28438f.setEnabled(false);
        if (this.O.size() > 0) {
            C1(new LinearLayoutManager(this, 1, false));
            rb rbVar14 = this.H;
            if (rbVar14 == null) {
                cm.l.v("binding");
                rbVar14 = null;
            }
            rbVar14.f28446n.setLayoutManager(o1());
            this.P = new f(this.O, this);
            rb rbVar15 = this.H;
            if (rbVar15 == null) {
                cm.l.v("binding");
                rbVar15 = null;
            }
            RecyclerView recyclerView = rbVar15.f28446n;
            f fVar = this.P;
            if (fVar == null) {
                cm.l.v("adapter");
                fVar = null;
            }
            recyclerView.setAdapter(fVar);
        }
        rb rbVar16 = this.H;
        if (rbVar16 == null) {
            cm.l.v("binding");
            rbVar16 = null;
        }
        rbVar16.f28440h.setOnClickListener(new p2(this));
        rb rbVar17 = this.H;
        if (rbVar17 == null) {
            cm.l.v("binding");
            rbVar17 = null;
        }
        rbVar17.f28441i.setOnClickListener(new q2(this));
        rb rbVar18 = this.H;
        if (rbVar18 == null) {
            cm.l.v("binding");
            rbVar18 = null;
        }
        rbVar18.f28437e.f28306g.setOnClickListener(new r2(this));
        rb rbVar19 = this.H;
        if (rbVar19 == null) {
            cm.l.v("binding");
            rbVar19 = null;
        }
        rbVar19.f28437e.f28305f.setOnClickListener(new s2(this));
        rb rbVar20 = this.H;
        if (rbVar20 == null) {
            cm.l.v("binding");
        } else {
            rbVar2 = rbVar20;
        }
        rbVar2.f28438f.setOnCheckedChangeListener(new t2(this));
    }

    /* access modifiers changed from: private */
    public static final void r1(VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied, View view) {
        cm.l.f(vahanWithdrawTransactionApplied, "this$0");
        rb rbVar = vahanWithdrawTransactionApplied.H;
        if (rbVar == null) {
            cm.l.v("binding");
            rbVar = null;
        }
        if (rbVar.f28438f.isChecked()) {
            vahanWithdrawTransactionApplied.z1();
        } else {
            Toast.makeText(vahanWithdrawTransactionApplied, "Please agree term & condition", 0).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void s1(VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied, View view) {
        cm.l.f(vahanWithdrawTransactionApplied, "this$0");
        vahanWithdrawTransactionApplied.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void t1(VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied, View view) {
        cm.l.f(vahanWithdrawTransactionApplied, "this$0");
        vahanWithdrawTransactionApplied.w1();
    }

    /* access modifiers changed from: private */
    public static final void u1(VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied, View view) {
        cm.l.f(vahanWithdrawTransactionApplied, "this$0");
        vahanWithdrawTransactionApplied.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void v1(VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied, CompoundButton compoundButton, boolean z10) {
        RelativeLayout relativeLayout;
        boolean z11;
        cm.l.f(vahanWithdrawTransactionApplied, "this$0");
        rb rbVar = null;
        if (!z10 || !vahanWithdrawTransactionApplied.S) {
            rb rbVar2 = vahanWithdrawTransactionApplied.H;
            if (rbVar2 == null) {
                cm.l.v("binding");
                rbVar2 = null;
            }
            rbVar2.f28440h.setAlpha(0.5f);
            rb rbVar3 = vahanWithdrawTransactionApplied.H;
            if (rbVar3 == null) {
                cm.l.v("binding");
            } else {
                rbVar = rbVar3;
            }
            relativeLayout = rbVar.f28440h;
            z11 = false;
        } else {
            rb rbVar4 = vahanWithdrawTransactionApplied.H;
            if (rbVar4 == null) {
                cm.l.v("binding");
                rbVar4 = null;
            }
            rbVar4.f28440h.setAlpha(1.0f);
            rb rbVar5 = vahanWithdrawTransactionApplied.H;
            if (rbVar5 == null) {
                cm.l.v("binding");
            } else {
                rbVar = rbVar5;
            }
            relativeLayout = rbVar.f28440h;
            z11 = true;
        }
        relativeLayout.setEnabled(z11);
    }

    private final void w1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void y1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void z1() {
        Dialog dialog = new Dialog(this.G);
        dialog.setContentView(R.layout.dialog_withdraw_services_selection);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.dialogProceed);
        cm.l.d(findViewById, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View findViewById2 = dialog.findViewById(R.id.dialogCancel);
        cm.l.d(findViewById2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View findViewById3 = dialog.findViewById(R.id.selectedServiceTv);
        cm.l.d(findViewById3, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        ((MyTextView) findViewById3).setText(this.Y);
        ((CardView) findViewById).setOnClickListener(new u2(dialog, this));
        ((CardView) findViewById2).setOnClickListener(new v2(dialog));
        dialog.show();
    }

    public final void C1(RecyclerView.p pVar) {
        cm.l.f(pVar, "<set-?>");
        this.Q = pVar;
    }

    public final void D1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.R = progressDialog;
    }

    public void i(int i10, boolean z10) {
        rb rbVar = null;
        if (z10) {
            this.S = true;
            this.T = ((ModifiedListOfDisposeApplModel) this.O.get(i10)).getTransaction_no();
            this.U = ((ModifiedListOfDisposeApplModel) this.O.get(i10)).getPur_cd();
            this.V = ((ModifiedListOfDisposeApplModel) this.O.get(i10)).getRegn_no();
            this.W = ((ModifiedListOfDisposeApplModel) this.O.get(i10)).getState_cd();
            this.X = ((ModifiedListOfDisposeApplModel) this.O.get(i10)).getOff_cd();
            this.Y = ((ModifiedListOfDisposeApplModel) this.O.get(i10)).getDescr();
            rb rbVar2 = this.H;
            if (rbVar2 == null) {
                cm.l.v("binding");
                rbVar2 = null;
            }
            if (rbVar2.f28438f.isChecked()) {
                rb rbVar3 = this.H;
                if (rbVar3 == null) {
                    cm.l.v("binding");
                    rbVar3 = null;
                }
                rbVar3.f28440h.setAlpha(1.0f);
                rb rbVar4 = this.H;
                if (rbVar4 == null) {
                    cm.l.v("binding");
                    rbVar4 = null;
                }
                rbVar4.f28440h.setEnabled(true);
            }
            rb rbVar5 = this.H;
            if (rbVar5 == null) {
                cm.l.v("binding");
                rbVar5 = null;
            }
            rbVar5.f28438f.setAlpha(1.0f);
            rb rbVar6 = this.H;
            if (rbVar6 == null) {
                cm.l.v("binding");
            } else {
                rbVar = rbVar6;
            }
            rbVar.f28438f.setEnabled(true);
            return;
        }
        this.S = false;
        this.T = "";
        this.U = 0;
        this.V = "";
        this.W = "";
        this.X = 0;
        this.Y = "";
        rb rbVar7 = this.H;
        if (rbVar7 == null) {
            cm.l.v("binding");
            rbVar7 = null;
        }
        rbVar7.f28440h.setAlpha(0.5f);
        rb rbVar8 = this.H;
        if (rbVar8 == null) {
            cm.l.v("binding");
            rbVar8 = null;
        }
        rbVar8.f28440h.setEnabled(false);
        rb rbVar9 = this.H;
        if (rbVar9 == null) {
            cm.l.v("binding");
            rbVar9 = null;
        }
        rbVar9.f28438f.setAlpha(0.5f);
        rb rbVar10 = this.H;
        if (rbVar10 == null) {
            cm.l.v("binding");
        } else {
            rbVar = rbVar10;
        }
        rbVar.f28438f.setEnabled(false);
    }

    public final RecyclerView.p o1() {
        RecyclerView.p pVar = this.Q;
        if (pVar != null) {
            return pVar;
        }
        cm.l.v("disposeTranscationManager");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, "Are you sure you want to leave?");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout_withdrawn_transaction_applied);
        rb c10 = rb.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.H = c10;
        bi.b bVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        this.N = ApplicationService.f21181a.b(this);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("applicationNo");
            cm.l.c(stringExtra);
            this.I = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("ownerName");
            cm.l.c(stringExtra2);
            this.J = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("stateCd");
            cm.l.c(stringExtra3);
            this.K = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("transactionDate");
            cm.l.c(stringExtra4);
            this.Z = stringExtra4;
            String stringExtra5 = getIntent().getStringExtra("regNo");
            cm.l.c(stringExtra5);
            this.L = stringExtra5;
            ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra("arrayList");
            cm.l.c(arrayList);
            this.O = arrayList;
        }
        D1(new ProgressDialog(this));
        p1().setMessage("Please wait...");
        p1().setCancelable(false);
        p1().setCanceledOnTouchOutside(false);
        q1();
        bi.b bVar2 = this.M;
        if (bVar2 == null) {
            cm.l.v("viewModel");
            bVar2 = null;
        }
        bVar2.p().g(this, new c(new a(this)));
        bi.b bVar3 = this.M;
        if (bVar3 == null) {
            cm.l.v("viewModel");
        } else {
            bVar = bVar3;
        }
        bVar.o().g(this, new c(new b(this)));
    }

    public final ProgressDialog p1() {
        ProgressDialog progressDialog = this.R;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void x1(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new o2(dialog));
        dialog.show();
    }
}
