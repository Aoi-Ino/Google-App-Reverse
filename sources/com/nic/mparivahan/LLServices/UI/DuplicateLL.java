package com.nic.mparivahan.LLServices.UI;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitInterface;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Pojo.SubmitResponse;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FormOneRequest;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.LlInterface;
import com.nic.mparivahan.LLServices.SubmitServiceAssets.DuplicateLlRequest;
import com.nic.mparivahan.R;
import java.io.Serializable;
import java.util.ArrayList;
import ni.h4;
import pl.x;
import tb.a0;
import tb.c0;
import tb.d0;
import tb.e0;
import tb.f0;
import tb.y;
import tb.z;

public final class DuplicateLL extends androidx.appcompat.app.d {
    public h4 G;
    public Context H;
    public ProgressDialog I;
    public ld.c J;
    public ld.f K;
    public sb.c L;
    public LlInterface M;
    public ld.c N;
    public FetchLlDetails O;
    private String P;
    private String Q = "N";
    private String R = "N";
    private String S = "";
    private String T = "";
    private String U = "";
    private String V = "";
    private String W = "";
    private String X = "";
    private String Y = "N";
    public y8.c Z;

    /* renamed from: a0  reason: collision with root package name */
    public SubmitInterface f9063a0;

    /* renamed from: b0  reason: collision with root package name */
    public w9.c f9064b0;

    /* renamed from: c0  reason: collision with root package name */
    public FromEligCheck f9065c0;

    /* renamed from: d0  reason: collision with root package name */
    private String f9066d0;

    /* renamed from: e0  reason: collision with root package name */
    private String f9067e0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DuplicateLL f9068e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DuplicateLL duplicateLL) {
            super(1);
            this.f9068e = duplicateLL;
        }

        public final void b(x9.a aVar) {
            try {
                throw null;
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((x9.a) null);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DuplicateLL f9069e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DuplicateLL duplicateLL) {
            super(1);
            this.f9069e = duplicateLL;
        }

        public final void b(sb.d dVar) {
            this.f9069e.v1().f26608y.c(false);
            try {
                throw null;
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((sb.d) null);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DuplicateLL f9070e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DuplicateLL duplicateLL) {
            super(1);
            this.f9070e = duplicateLL;
        }

        public final void b(String str) {
            this.f9070e.v1().f26608y.c(false);
            DuplicateLL duplicateLL = this.f9070e;
            duplicateLL.N1(duplicateLL, duplicateLL.t1().b("service_is_not_present", this.f9070e.getString(R.string.unable_to_get_details)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DuplicateLL f9071e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DuplicateLL duplicateLL) {
            super(1);
            this.f9071e = duplicateLL;
        }

        public final void b(SubmitResponse submitResponse) {
            this.f9071e.D1().dismiss();
            try {
                if (cm.l.a(submitResponse.getStatus_code(), "00")) {
                    this.f9071e.c2("Y");
                    this.f9071e.v1().f26608y.setText(this.f9071e.t1().b("vahan_btn_submit", "Submit"));
                    DuplicateLL duplicateLL = this.f9071e;
                    duplicateLL.N1(duplicateLL, submitResponse.getFoneObject().get(0).getMsg());
                    return;
                }
                DuplicateLL duplicateLL2 = this.f9071e;
                duplicateLL2.L1(duplicateLL2, submitResponse.getFoneObject().get(0).getMsg());
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SubmitResponse) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DuplicateLL f9072e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DuplicateLL duplicateLL) {
            super(1);
            this.f9072e = duplicateLL;
        }

        public final void b(String str) {
            this.f9072e.D1().dismiss();
            DuplicateLL duplicateLL = this.f9072e;
            duplicateLL.N1(duplicateLL, duplicateLL.t1().b("service_is_not_present", this.f9072e.getString(R.string.unable_to_get_details)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9073a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f9073a = lVar;
        }

        public final pl.c a() {
            return this.f9073a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9073a.invoke(obj);
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

    private final void G1() {
        S1(this);
        b2(new ld.c(w1()));
        a2(new ld.f(w1()));
        P1(new ld.c(w1()));
        Z1(new ProgressDialog(this));
        D1().setMessage(t1().b("label_challan_please_wait", "Please wait..."));
        D1().setCancelable(false);
        D1().setCanceledOnTouchOutside(false);
        v1().A.f25961g.setText(E1().i());
        v1().I.setPaintFlags(v1().I.getPaintFlags() | 8);
        V1(LlInterface.f9003a.a(w1()));
        W1((sb.c) new u0((x0) this, (u0.b) new sb.a(new sb.b(z1()))).a(sb.c.class));
        try {
            this.P = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            this.f9066d0 = String.valueOf(getIntent().getStringExtra("selectedRtoCd"));
            this.f9067e0 = String.valueOf(getIntent().getStringExtra("selectedRtoName"));
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            Q1((FetchLlDetails) serializableExtra);
            TextView textView = v1().F;
            textView.setText("LL No. : " + q.B0(u1().getLearningLicence()).toString());
        } catch (Exception unused) {
        }
        U1(FromEligCheck.f8099a.a(this));
        T1((w9.c) new u0((x0) this, (u0.b) new w9.b(new w9.a(y1()))).a(w9.c.class));
        x1().h(n1());
        x1().j().g(this, new f(new a(this)));
        Y1(SubmitInterface.f7733a.a(this));
        X1((y8.c) new u0((x0) this, (u0.b) new y8.a(new y8.b(C1()))).a(y8.c.class));
    }

    private final void H1() {
        try {
            v1().F.setVisibility(8);
            v1().I.setVisibility(8);
            v1().B.f29580g.setText(E1().i());
            v1().B.f29581h.setPaintFlags(8 | v1().B.f29581h.getPaintFlags());
            v1().B.f29581h.setText(q.B0(u1().getLearningLicence()).toString());
            v1().B.f29581h.setOnClickListener(new e0(this));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void I1(DuplicateLL duplicateLL, View view) {
        cm.l.f(duplicateLL, "this$0");
        try {
            Intent intent = new Intent(duplicateLL, LlDetails.class);
            intent.putExtra("LLDetails", duplicateLL.u1());
            duplicateLL.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void J1(DuplicateLL duplicateLL, View view) {
        cm.l.f(duplicateLL, "this$0");
        duplicateLL.finish();
    }

    /* access modifiers changed from: private */
    public static final void K1(DuplicateLL duplicateLL, View view) {
        cm.l.f(duplicateLL, "this$0");
        duplicateLL.finish();
    }

    /* access modifiers changed from: private */
    public static final void M1(Dialog dialog, DuplicateLL duplicateLL, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(duplicateLL, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(duplicateLL, DashBoard.class);
        intent.addFlags(67108864);
        duplicateLL.startActivity(intent);
        duplicateLL.finish();
    }

    /* access modifiers changed from: private */
    public static final void O1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final FormOneRequest n1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(502);
        String str = this.f9066d0;
        if (str == null) {
            cm.l.v("selectedRtoCd");
            str = null;
        }
        return new FormOneRequest("mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", str, arrayList);
    }

    private final void o1() {
        v1().C.setOnClickListener(new a0(this));
        v1().I.setOnClickListener(new tb.b0(this));
        v1().f26608y.setOnClickListener(new c0(this));
    }

    /* access modifiers changed from: private */
    public static final void p1(DuplicateLL duplicateLL, View view) {
        cm.l.f(duplicateLL, "this$0");
        duplicateLL.finish();
    }

    /* access modifiers changed from: private */
    public static final void q1(DuplicateLL duplicateLL, View view) {
        cm.l.f(duplicateLL, "this$0");
        try {
            Intent intent = new Intent(duplicateLL, LlDetails.class);
            intent.putExtra("LLDetails", duplicateLL.u1());
            duplicateLL.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void r1(DuplicateLL duplicateLL, View view) {
        Context w12;
        String b10;
        cm.l.f(duplicateLL, "this$0");
        String obj = q.B0(duplicateLL.v1().f26606w.getText().toString()).toString();
        if (obj == null || obj.length() == 0) {
            w12 = duplicateLL.w1();
            b10 = duplicateLL.t1().b("label_dl_serv_enter_reas_manul", duplicateLL.getString(R.string.enter_Reason));
        } else if (duplicateLL.v1().f26606w.getText().toString().length() < 10) {
            w12 = duplicateLL.w1();
            b10 = duplicateLL.getString(R.string.pls_enter_valid_reason);
        } else if (com.nic.mparivahan.a.f9624a.a(duplicateLL)) {
            try {
                duplicateLL.v1().f26608y.c(true);
                duplicateLL.A1().p(duplicateLL, duplicateLL.s1());
                return;
            } catch (Exception unused) {
                return;
            }
        } else {
            Toast.makeText(duplicateLL.w1(), duplicateLL.F1().b("label_log_check_internet", duplicateLL.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        duplicateLL.N1(w12, b10);
    }

    private final DuplicateLlRequest s1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("duplicateLL");
        String obj = q.B0(u1().getLearningLicence()).toString();
        String obj2 = q.B0(u1().getDateOfBirth()).toString();
        String stCd = u1().getState().getStCd();
        String str = this.f9066d0;
        if (str == null) {
            cm.l.v("selectedRtoCd");
            str = null;
        }
        return new DuplicateLlRequest("UmangOD", "2335647e653c970102713f68f6aad970", "164.100.161.142", "SarathiMobileService", obj, obj2, stCd, str, "duplicateLL", q.B0(v1().f26606w.getText().toString()).toString(), arrayList);
    }

    public final sb.c A1() {
        sb.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mLlViewModel");
        return null;
    }

    public final y8.c B1() {
        y8.c cVar = this.Z;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mSubmitFormVM");
        return null;
    }

    public final SubmitInterface C1() {
        SubmitInterface submitInterface = this.f9063a0;
        if (submitInterface != null) {
            return submitInterface;
        }
        cm.l.v("mSubmitInterface");
        return null;
    }

    public final ProgressDialog D1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final ld.f E1() {
        ld.f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final ld.c F1() {
        ld.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final void L1(Context context, String str) {
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
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(F1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(F1().b("btn_ok", "OK"));
        textView.setOnClickListener(new f0(dialog, this));
        dialog.show();
    }

    public final void N1(Context context, String str) {
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
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(F1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(F1().b("btn_ok", "OK"));
        textView.setOnClickListener(new d0(dialog));
        dialog.show();
    }

    public final void P1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.N = cVar;
    }

    public final void Q1(FetchLlDetails fetchLlDetails) {
        cm.l.f(fetchLlDetails, "<set-?>");
        this.O = fetchLlDetails;
    }

    public final void R1(h4 h4Var) {
        cm.l.f(h4Var, "<set-?>");
        this.G = h4Var;
    }

    public final void S1(Context context) {
        cm.l.f(context, "<set-?>");
        this.H = context;
    }

    public final void T1(w9.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f9064b0 = cVar;
    }

    public final void U1(FromEligCheck fromEligCheck) {
        cm.l.f(fromEligCheck, "<set-?>");
        this.f9065c0 = fromEligCheck;
    }

    public final void V1(LlInterface llInterface) {
        cm.l.f(llInterface, "<set-?>");
        this.M = llInterface;
    }

    public final void W1(sb.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void X1(y8.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Z = cVar;
    }

    public final void Y1(SubmitInterface submitInterface) {
        cm.l.f(submitInterface, "<set-?>");
        this.f9063a0 = submitInterface;
    }

    public final void Z1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void a2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    public final void b2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void c2(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h4 x10 = h4.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        R1(x10);
        setContentView(v1().m());
        G1();
        o1();
        v9.e.f17509a.F0(this, v1());
        v1().A.f25959e.setOnClickListener(new y(this));
        v1().B.f29577d.setOnClickListener(new z(this));
        A1().l().g(this, new f(new b(this)));
        A1().i().g(this, new f(new c(this)));
        B1().i().g(this, new f(new d(this)));
        B1().h().g(this, new f(new e(this)));
        H1();
    }

    public final ld.c t1() {
        ld.c cVar = this.N;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final FetchLlDetails u1() {
        FetchLlDetails fetchLlDetails = this.O;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        cm.l.v("llDetails");
        return null;
    }

    public final h4 v1() {
        h4 h4Var = this.G;
        if (h4Var != null) {
            return h4Var;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final Context w1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final w9.c x1() {
        w9.c cVar = this.f9064b0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mFormEligVM");
        return null;
    }

    public final FromEligCheck y1() {
        FromEligCheck fromEligCheck = this.f9065c0;
        if (fromEligCheck != null) {
            return fromEligCheck;
        }
        cm.l.v("mFormsInterface");
        return null;
    }

    public final LlInterface z1() {
        LlInterface llInterface = this.M;
        if (llInterface != null) {
            return llInterface;
        }
        cm.l.v("mLlInterface");
        return null;
    }
}
