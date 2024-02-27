package com.nic.mparivahan.ServiceWithdrawnScreen.Activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.AppliedServiceListModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.AppliedServiceResultModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.ReasonModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.ReasonResultModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.SelectedCovRequestModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.ValidateWithDrawanServiceModal;
import com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service.ServiceWithdrawn;
import java.util.ArrayList;
import jd.q;
import jd.r;
import jd.s;
import jd.t;
import jd.u;
import jd.v;
import ni.xc;
import oi.g;
import pl.x;
import v9.e;

public final class SelectedWithdrawnList extends g {
    private xc J;
    private String K = "";
    private String L = "";
    private String M = "";
    /* access modifiers changed from: private */
    public ProgressDialog N;
    private Context O;
    public ld.f P;
    public ld.c Q;
    private rj.d R;
    private ServiceWithdrawn S;
    private kd.a T;
    private ArrayList U = new ArrayList();
    /* access modifiers changed from: private */
    public ArrayList V = new ArrayList();
    private ArrayList W = new ArrayList();
    private ArrayList X = new ArrayList();
    /* access modifiers changed from: private */
    public int Y;
    private ArrayList Z = new ArrayList();

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SelectedWithdrawnList f9597e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SelectedWithdrawnList selectedWithdrawnList) {
            super(1);
            this.f9597e = selectedWithdrawnList;
        }

        public final void b(ReasonModal reasonModal) {
            try {
                if (cm.l.a(reasonModal.getStatusDesc(), "success")) {
                    ArrayList<ReasonResultModal> result = reasonModal.getResult();
                    cm.l.c(result);
                    if (result.size() > 0) {
                        this.f9597e.V.add(0, "Select");
                        int size = reasonModal.getResult().size();
                        for (int i10 = 0; i10 < size; i10++) {
                            String key = reasonModal.getResult().get(i10).getKey();
                            Log.e("Key", key);
                            this.f9597e.V.add(key);
                        }
                    }
                    Log.e("Reason", this.f9597e.V.toString());
                    this.f9597e.W1();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f9597e.W1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ReasonModal) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SelectedWithdrawnList f9598e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SelectedWithdrawnList selectedWithdrawnList) {
            super(1);
            this.f9598e = selectedWithdrawnList;
        }

        public final void b(AppliedServiceListModal appliedServiceListModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog B1 = this.f9598e.N;
                if (B1 == null) {
                    cm.l.v("dialog");
                    B1 = null;
                }
                if (B1.isShowing()) {
                    ProgressDialog B12 = this.f9598e.N;
                    if (B12 == null) {
                        cm.l.v("dialog");
                        B12 = null;
                    }
                    B12.dismiss();
                }
                if (cm.l.a(appliedServiceListModal.getStatusCd(), "00")) {
                    ArrayList<AppliedServiceResultModal> appliedServiceResultModal = appliedServiceListModal.getAppliedServiceResultModal();
                    cm.l.c(appliedServiceResultModal);
                    if (appliedServiceResultModal.size() > 0) {
                        this.f9598e.Y = appliedServiceListModal.getAppliedServiceResultModal().size();
                        this.f9598e.c2(appliedServiceListModal.getAppliedServiceResultModal());
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressDialog B13 = this.f9598e.N;
                if (B13 == null) {
                    cm.l.v("dialog");
                    B13 = null;
                }
                if (B13.isShowing()) {
                    ProgressDialog B14 = this.f9598e.N;
                    if (B14 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = B14;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AppliedServiceListModal) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SelectedWithdrawnList f9599e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SelectedWithdrawnList selectedWithdrawnList) {
            super(1);
            this.f9599e = selectedWithdrawnList;
        }

        public final void b(String str) {
            ProgressDialog B1 = this.f9599e.N;
            ProgressDialog progressDialog = null;
            if (B1 == null) {
                cm.l.v("dialog");
                B1 = null;
            }
            if (B1.isShowing()) {
                ProgressDialog B12 = this.f9599e.N;
                if (B12 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = B12;
                }
                progressDialog.dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SelectedWithdrawnList f9600e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SelectedWithdrawnList selectedWithdrawnList) {
            super(1);
            this.f9600e = selectedWithdrawnList;
        }

        public final void b(ValidateWithDrawanServiceModal validateWithDrawanServiceModal) {
            Toast makeText;
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog B1 = this.f9600e.N;
                if (B1 == null) {
                    cm.l.v("dialog");
                    B1 = null;
                }
                if (B1.isShowing()) {
                    ProgressDialog B12 = this.f9600e.N;
                    if (B12 == null) {
                        cm.l.v("dialog");
                        B12 = null;
                    }
                    B12.dismiss();
                }
                if (!cm.l.a(validateWithDrawanServiceModal.getStatus_code(), "01")) {
                    SelectedWithdrawnList selectedWithdrawnList = this.f9600e;
                    makeText = Toast.makeText(selectedWithdrawnList, selectedWithdrawnList.getString(R.string.please_try_again), 0);
                } else if (cm.l.a(validateWithDrawanServiceModal.getResult().get(0).getMessage(), "true")) {
                    this.f9600e.Z1();
                    return;
                } else {
                    makeText = Toast.makeText(this.f9600e, validateWithDrawanServiceModal.getResult().get(0).getErrorMsg(), 0);
                }
                makeText.show();
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressDialog B13 = this.f9600e.N;
                if (B13 == null) {
                    cm.l.v("dialog");
                    B13 = null;
                }
                if (B13.isShowing()) {
                    ProgressDialog B14 = this.f9600e.N;
                    if (B14 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = B14;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ValidateWithDrawanServiceModal) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SelectedWithdrawnList f9601e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SelectedWithdrawnList selectedWithdrawnList) {
            super(1);
            this.f9601e = selectedWithdrawnList;
        }

        public final void b(ValidateWithDrawanServiceModal validateWithDrawanServiceModal) {
            Toast makeText;
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog B1 = this.f9601e.N;
                if (B1 == null) {
                    cm.l.v("dialog");
                    B1 = null;
                }
                if (B1.isShowing()) {
                    ProgressDialog B12 = this.f9601e.N;
                    if (B12 == null) {
                        cm.l.v("dialog");
                        B12 = null;
                    }
                    B12.dismiss();
                }
                if (!cm.l.a(validateWithDrawanServiceModal.getStatus_code(), "01")) {
                    SelectedWithdrawnList selectedWithdrawnList = this.f9601e;
                    makeText = Toast.makeText(selectedWithdrawnList, selectedWithdrawnList.getString(R.string.please_try_again), 0);
                } else if (cm.l.a(validateWithDrawanServiceModal.getStatus_desc(), "success")) {
                    this.f9601e.T1(validateWithDrawanServiceModal.getResult().get(0).getMessage());
                    return;
                } else {
                    makeText = Toast.makeText(this.f9601e, validateWithDrawanServiceModal.getResult().get(0).getErrorMsg(), 0);
                }
                makeText.show();
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressDialog B13 = this.f9601e.N;
                if (B13 == null) {
                    cm.l.v("dialog");
                    B13 = null;
                }
                if (B13.isShowing()) {
                    ProgressDialog B14 = this.f9601e.N;
                    if (B14 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = B14;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ValidateWithDrawanServiceModal) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9602a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f9602a = lVar;
        }

        public final pl.c a() {
            return this.f9602a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9602a.invoke(obj);
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

    private final void I1() {
        try {
            ProgressDialog progressDialog = this.N;
            rj.d dVar = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            i7.g z10 = new i7.d().z(this.X);
            rj.d dVar2 = this.R;
            if (dVar2 == null) {
                cm.l.v("viewModal");
            } else {
                dVar = dVar2;
            }
            String str = this.L;
            cm.l.c(z10);
            dVar.y("ServiceWithdrawn", str, z10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void J1() {
        this.W.add("Select");
        this.W.add("Yes");
        this.W.add("No");
    }

    private final void K1() {
        ProgressDialog progressDialog = null;
        try {
            ProgressDialog progressDialog2 = this.N;
            if (progressDialog2 == null) {
                cm.l.v("dialog");
                progressDialog2 = null;
            }
            if (progressDialog2.isShowing()) {
                ProgressDialog progressDialog3 = this.N;
                if (progressDialog3 == null) {
                    cm.l.v("dialog");
                    progressDialog3 = null;
                }
                progressDialog3.dismiss();
            }
            ProgressDialog progressDialog4 = this.N;
            if (progressDialog4 == null) {
                cm.l.v("dialog");
                progressDialog4 = null;
            }
            progressDialog4.show();
            rj.d dVar = this.R;
            if (dVar == null) {
                cm.l.v("viewModal");
                dVar = null;
            }
            dVar.h(this.L);
        } catch (Exception e10) {
            e10.printStackTrace();
            ProgressDialog progressDialog5 = this.N;
            if (progressDialog5 == null) {
                cm.l.v("dialog");
                progressDialog5 = null;
            }
            if (progressDialog5.isShowing()) {
                ProgressDialog progressDialog6 = this.N;
                if (progressDialog6 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = progressDialog6;
                }
                progressDialog.dismiss();
            }
        }
    }

    private final void L1() {
        String stringExtra = getIntent().getStringExtra("applicantFullName");
        cm.l.c(stringExtra);
        this.K = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("applNo");
        cm.l.c(stringExtra2);
        this.L = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("applicantDob");
        cm.l.c(stringExtra3);
        this.M = stringExtra3;
        xc xcVar = null;
        if (com.nic.mparivahan.dlservices.utilities.d.d(this.K)) {
            xc xcVar2 = this.J;
            if (xcVar2 == null) {
                cm.l.v("binding");
                xcVar2 = null;
            }
            xcVar2.f29409j.setText(this.K);
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(this.L)) {
            xc xcVar3 = this.J;
            if (xcVar3 == null) {
                cm.l.v("binding");
                xcVar3 = null;
            }
            xcVar3.f29404e.setText(this.L);
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(this.M)) {
            xc xcVar4 = this.J;
            if (xcVar4 == null) {
                cm.l.v("binding");
            } else {
                xcVar = xcVar4;
            }
            xcVar.f29407h.setText(this.M);
        }
    }

    private final void N1() {
        try {
            ProgressDialog progressDialog = this.N;
            rj.d dVar = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.N;
                if (progressDialog2 == null) {
                    cm.l.v("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            ProgressDialog progressDialog3 = this.N;
            if (progressDialog3 == null) {
                cm.l.v("dialog");
                progressDialog3 = null;
            }
            progressDialog3.show();
            rj.d dVar2 = this.R;
            if (dVar2 == null) {
                cm.l.v("viewModal");
            } else {
                dVar = dVar2;
            }
            dVar.t();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void P1() {
        this.O = this;
        Context context = this.O;
        xc xcVar = null;
        if (context == null) {
            cm.l.v("mContext");
            context = null;
        }
        Y1(new ld.f(context));
        Context context2 = this.O;
        if (context2 == null) {
            cm.l.v("mContext");
            context2 = null;
        }
        X1(new ld.c(context2));
        ServiceWithdrawn.a aVar = ServiceWithdrawn.f22143a;
        Context context3 = this.O;
        if (context3 == null) {
            cm.l.v("mContext");
            context3 = null;
        }
        this.S = aVar.a(context3);
        xc xcVar2 = this.J;
        if (xcVar2 == null) {
            cm.l.v("binding");
            xcVar2 = null;
        }
        xcVar2.f29410k.f28452f.setText(O1().i());
        xc xcVar3 = this.J;
        if (xcVar3 == null) {
            cm.l.v("binding");
            xcVar3 = null;
        }
        xcVar3.f29410k.f28448b.setOnClickListener(new t(this));
        ServiceWithdrawn serviceWithdrawn = this.S;
        if (serviceWithdrawn == null) {
            cm.l.v("service");
            serviceWithdrawn = null;
        }
        this.R = (rj.d) new u0((x0) this, (u0.b) new sj.b(new rj.c(serviceWithdrawn))).a(rj.d.class);
        xc xcVar4 = this.J;
        if (xcVar4 == null) {
            cm.l.v("binding");
            xcVar4 = null;
        }
        xcVar4.f29412m.setOnClickListener(new u(this));
        xc xcVar5 = this.J;
        if (xcVar5 == null) {
            cm.l.v("binding");
        } else {
            xcVar = xcVar5;
        }
        xcVar.f29405f.setOnClickListener(new v(this));
    }

    /* access modifiers changed from: private */
    public static final void Q1(SelectedWithdrawnList selectedWithdrawnList, View view) {
        cm.l.f(selectedWithdrawnList, "this$0");
        selectedWithdrawnList.finish();
    }

    /* access modifiers changed from: private */
    public static final void R1(SelectedWithdrawnList selectedWithdrawnList, View view) {
        cm.l.f(selectedWithdrawnList, "this$0");
        if (selectedWithdrawnList.X.size() != 0 && selectedWithdrawnList.Y == selectedWithdrawnList.X.size()) {
            i7.g z10 = new i7.d().z(selectedWithdrawnList.X);
            ProgressDialog progressDialog = selectedWithdrawnList.N;
            rj.d dVar = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            rj.d dVar2 = selectedWithdrawnList.R;
            if (dVar2 == null) {
                cm.l.v("viewModal");
            } else {
                dVar = dVar2;
            }
            String str = selectedWithdrawnList.L;
            cm.l.c(z10);
            dVar.z("ServiceWithdrawn", str, z10);
            return;
        }
        Toast.makeText(selectedWithdrawnList, selectedWithdrawnList.M1().b("SELECT_REASON_SERVICE_WITHDRAWN", "Please select confirmation & reason/remarks in each item"), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void S1(SelectedWithdrawnList selectedWithdrawnList, View view) {
        cm.l.f(selectedWithdrawnList, "this$0");
        Intent intent = new Intent(selectedWithdrawnList, ApplicationDetails.class);
        intent.setFlags(67108864);
        selectedWithdrawnList.startActivity(intent);
        selectedWithdrawnList.finish();
    }

    /* access modifiers changed from: private */
    public final void T1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(M1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(M1().b("btn_ok", "OK"));
        textView.setOnClickListener(new s(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void U1(Dialog dialog, SelectedWithdrawnList selectedWithdrawnList, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(selectedWithdrawnList, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(selectedWithdrawnList, ApplicationDetails.class);
        intent.setFlags(67108864);
        selectedWithdrawnList.startActivity(intent);
        selectedWithdrawnList.finish();
    }

    /* access modifiers changed from: private */
    public final void W1() {
        this.T = new kd.a(this, this.U, this.V, this.W, this);
        xc xcVar = this.J;
        kd.a aVar = null;
        if (xcVar == null) {
            cm.l.v("binding");
            xcVar = null;
        }
        xcVar.f29411l.setLayoutManager(new LinearLayoutManager(this));
        xc xcVar2 = this.J;
        if (xcVar2 == null) {
            cm.l.v("binding");
            xcVar2 = null;
        }
        RecyclerView recyclerView = xcVar2.f29411l;
        kd.a aVar2 = this.T;
        if (aVar2 == null) {
            cm.l.v("adapter");
        } else {
            aVar = aVar2;
        }
        recyclerView.setAdapter(aVar);
    }

    /* access modifiers changed from: private */
    public final void Z1() {
        StringBuilder sb2;
        String appliedService;
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.confirm_dialog_service_withdrawn);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.serviceWithDrawnMsgTv);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(M1().b("SELECTED_FOLLOWING_SERVICE_WITHDRAWN", getString(R.string.service_withdrawn_msg)));
        View findViewById2 = dialog.findViewById(R.id.proceedMsgTv);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setText(M1().b("WANT_TO_PROCEED", getString(R.string.are_you_want_to_proceed)));
        View findViewById3 = dialog.findViewById(R.id.serviceWithDrawnList);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.cancelBtn);
        cm.l.d(findViewById4, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        MyTextView myTextView = (MyTextView) findViewById4;
        myTextView.setText(M1().b("button_cancel", getString(R.string.cancel)));
        View findViewById5 = dialog.findViewById(R.id.proceedBtn);
        cm.l.d(findViewById5, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        MyTextView myTextView2 = (MyTextView) findViewById5;
        myTextView2.setText(M1().b("button_proceed", getString(R.string.proceed)));
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.setOrientation(1);
            TextView textView = new TextView(this);
            textView.setPadding(16, 5, 16, 5);
            textView.setGravity(17);
            textView.setTextColor(getColor(R.color.black));
            textView.setTextSize(16.0f);
            if (!cm.l.a(((SelectedCovRequestModal) this.X.get(i10)).getAppliedCov(), "NA")) {
                sb2 = new StringBuilder();
                sb2.append(i10 + 1);
                sb2.append(". ");
                sb2.append(((SelectedCovRequestModal) this.X.get(i10)).getAppliedService());
                sb2.append(' ');
                appliedService = ((SelectedCovRequestModal) this.X.get(i10)).getAppliedCov();
            } else {
                sb2 = new StringBuilder();
                sb2.append(i10 + 1);
                sb2.append(". ");
                appliedService = ((SelectedCovRequestModal) this.X.get(i10)).getAppliedService();
            }
            sb2.append(appliedService);
            textView.setText(sb2.toString());
            linearLayout2.addView(textView);
            linearLayout.addView(linearLayout2);
        }
        myTextView.setOnClickListener(new q(dialog));
        myTextView2.setOnClickListener(new r(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void a2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void b2(Dialog dialog, SelectedWithdrawnList selectedWithdrawnList, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(selectedWithdrawnList, "this$0");
        dialog.dismiss();
        selectedWithdrawnList.I1();
    }

    /* access modifiers changed from: private */
    public final void c2(ArrayList arrayList) {
        kd.a aVar = this.T;
        if (aVar == null) {
            cm.l.v("adapter");
            aVar = null;
        }
        aVar.D(arrayList);
    }

    public final ld.c M1() {
        ld.c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ld.f O1() {
        ld.f fVar = this.P;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final void V1(int i10, String str, String str2, String str3, String str4, String str5) {
        cm.l.f(str, "confirmationValue");
        cm.l.f(str2, "remarks");
        cm.l.f(str3, "appliedService");
        cm.l.f(str4, "appliedCovs");
        cm.l.f(str5, "status");
        if (!cm.l.a(str, "Select") && !cm.l.a(str2, "Select")) {
            SelectedCovRequestModal selectedCovRequestModal = new SelectedCovRequestModal(str, str2, str3, str4, str5);
            if (this.Z.size() <= 0 || !this.Z.contains(Integer.valueOf(i10)) || this.X.size() <= 0) {
                this.Z.add(Integer.valueOf(i10));
                this.X.add(selectedCovRequestModal);
                return;
            }
            this.X.set(i10, selectedCovRequestModal);
        }
    }

    public final void X1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final void Y1(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.P = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xc c10 = xc.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.J = c10;
        rj.d dVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        X1(new ld.c(this));
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.N = progressDialog;
        progressDialog.setMessage(M1().b("label_challan_getting_details", "Getting details..."));
        ProgressDialog progressDialog2 = this.N;
        if (progressDialog2 == null) {
            cm.l.v("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.N;
        if (progressDialog3 == null) {
            cm.l.v("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCancelable(false);
        L1();
        P1();
        e.a aVar = v9.e.f17509a;
        xc xcVar = this.J;
        if (xcVar == null) {
            cm.l.v("binding");
            xcVar = null;
        }
        aVar.p(this, xcVar);
        N1();
        J1();
        K1();
        rj.d dVar2 = this.R;
        if (dVar2 == null) {
            cm.l.v("viewModal");
            dVar2 = null;
        }
        dVar2.s().g(this, new f(new a(this)));
        rj.d dVar3 = this.R;
        if (dVar3 == null) {
            cm.l.v("viewModal");
            dVar3 = null;
        }
        dVar3.i().g(this, new f(new b(this)));
        rj.d dVar4 = this.R;
        if (dVar4 == null) {
            cm.l.v("viewModal");
            dVar4 = null;
        }
        dVar4.m().g(this, new f(new c(this)));
        rj.d dVar5 = this.R;
        if (dVar5 == null) {
            cm.l.v("viewModal");
            dVar5 = null;
        }
        dVar5.w().g(this, new f(new d(this)));
        rj.d dVar6 = this.R;
        if (dVar6 == null) {
            cm.l.v("viewModal");
        } else {
            dVar = dVar6;
        }
        dVar.v().g(this, new f(new e(this)));
    }
}
