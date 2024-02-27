package com.nic.mparivahan.LLMainScreen;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
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
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.LlInterface;
import com.nic.mparivahan.R;
import java.util.Calendar;
import ld.f;
import ni.k5;
import pl.x;
import qb.e;
import v9.e;

public final class LLMain extends d {
    private k5 G;
    public Context H;
    public ProgressDialog I;
    public ld.c J;
    public f K;
    public sb.c L;
    public LlInterface M;
    private Calendar N = Calendar.getInstance();
    public FetchLlDetails O;
    public String P;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLMain f8942e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LLMain lLMain) {
            super(1);
            this.f8942e = lLMain;
        }

        public final void b(FetchLlDetails fetchLlDetails) {
            LLMain lLMain;
            String b10;
            this.f8942e.s1().dismiss();
            try {
                if (p.o(fetchLlDetails.getLLDetails().get(0).getStatus_code(), "00", true)) {
                    LLMain lLMain2 = this.f8942e;
                    cm.l.c(fetchLlDetails);
                    lLMain2.F1(fetchLlDetails);
                    if (p.o(this.f8942e.u1(), this.f8942e.o1().getState().getStCd(), true)) {
                        Intent intent = new Intent(this.f8942e.p1(), LlRto.class);
                        intent.putExtra("LLDetails", this.f8942e.o1());
                        this.f8942e.startActivity(intent);
                        return;
                    }
                    lLMain = this.f8942e;
                    b10 = "Enter valid LL Number of " + this.f8942e.o1().getState().getStateName() + " State";
                } else {
                    lLMain = this.f8942e;
                    b10 = lLMain.n1().b("no_detail_availbale", this.f8942e.getString(R.string.no_detals_avaliable));
                    cm.l.c(b10);
                }
                lLMain.C1(b10);
            } catch (Exception e10) {
                Log.d("ll_response_err", e10.toString());
                LLMain lLMain3 = this.f8942e;
                String b11 = lLMain3.n1().b("label_went_wrong", this.f8942e.getString(R.string.something_please_try_after_some_time));
                cm.l.c(b11);
                lLMain3.C1(b11);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FetchLlDetails) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLMain f8943e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LLMain lLMain) {
            super(1);
            this.f8943e = lLMain;
        }

        public final void b(String str) {
            this.f8943e.s1().show();
            LLMain lLMain = this.f8943e;
            String b10 = lLMain.n1().b("no_detail_availbale", this.f8943e.getString(R.string.no_detals_avaliable));
            cm.l.c(b10);
            lLMain.C1(b10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8944a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f8944a = lVar;
        }

        public final pl.c a() {
            return this.f8944a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8944a.invoke(obj);
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
    public static final void A1(LLMain lLMain, View view) {
        Context p12;
        int i10;
        cm.l.f(lLMain, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(lLMain)) {
            k5 k5Var = lLMain.G;
            k5 k5Var2 = null;
            if (k5Var == null) {
                cm.l.v("llServiceBinding");
                k5Var = null;
            }
            Editable text = k5Var.A.getText();
            cm.l.e(text, "getText(...)");
            if (text.length() == 0) {
                p12 = lLMain.p1();
                i10 = R.string.pls_enter_learner_driving_license_number;
            } else {
                k5 k5Var3 = lLMain.G;
                if (k5Var3 == null) {
                    cm.l.v("llServiceBinding");
                    k5Var3 = null;
                }
                if (k5Var3.A.getText().length() < 10) {
                    p12 = lLMain.p1();
                    i10 = R.string.validate_message_dl;
                } else {
                    k5 k5Var4 = lLMain.G;
                    if (k5Var4 == null) {
                        cm.l.v("llServiceBinding");
                        k5Var4 = null;
                    }
                    CharSequence text2 = k5Var4.B.getText();
                    cm.l.e(text2, "getText(...)");
                    if (text2.length() == 0) {
                        p12 = lLMain.p1();
                        i10 = R.string.please_enter_bd;
                    } else {
                        lLMain.s1().show();
                        sb.c r12 = lLMain.r1();
                        k5 k5Var5 = lLMain.G;
                        if (k5Var5 == null) {
                            cm.l.v("llServiceBinding");
                            k5Var5 = null;
                        }
                        String obj = k5Var5.A.getText().toString();
                        k5 k5Var6 = lLMain.G;
                        if (k5Var6 == null) {
                            cm.l.v("llServiceBinding");
                        } else {
                            k5Var2 = k5Var6;
                        }
                        r12.j(lLMain, obj, k5Var2.B.getText().toString(), "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice");
                        return;
                    }
                }
            }
            lLMain.C1(p12.getString(i10));
            return;
        }
        Toast.makeText(lLMain.p1(), lLMain.n1().b("label_log_check_internet", lLMain.getString(R.string.kindly_check_your_internet_connection)), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void B1(LLMain lLMain, View view) {
        cm.l.f(lLMain, "this$0");
        lLMain.finish();
    }

    /* access modifiers changed from: private */
    public final void C1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(n1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(n1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(n1().b("btn_ok", "OK"));
        textView.setOnClickListener(new qb.b(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void D1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void l1() {
        r1().k().g(this, new c(new a(this)));
        r1().i().g(this, new c(new b(this)));
    }

    private final void v1() {
        E1(new ld.c(p1()));
        K1(new f(p1()));
        k5 k5Var = this.G;
        k5 k5Var2 = null;
        if (k5Var == null) {
            cm.l.v("llServiceBinding");
            k5Var = null;
        }
        k5Var.F.setText(t1().i());
        J1(new ProgressDialog(this));
        s1().setMessage(n1().b("label_challan_please_wait", getString(R.string.please_wait)));
        s1().setCancelable(true);
        s1().setCanceledOnTouchOutside(true);
        L1(q.B0(String.valueOf(getIntent().getStringExtra("state_code"))).toString());
        k5 k5Var3 = this.G;
        if (k5Var3 == null) {
            cm.l.v("llServiceBinding");
        } else {
            k5Var2 = k5Var3;
        }
        k5Var2.F.setText(t1().i());
        H1(LlInterface.f9003a.a(p1()));
        I1((sb.c) new u0((x0) this, (u0.b) new sb.a(new sb.b(q1()))).a(sb.c.class));
    }

    private final void w1() {
        qb.c cVar = new qb.c(this);
        k5 k5Var = this.G;
        k5 k5Var2 = null;
        if (k5Var == null) {
            cm.l.v("llServiceBinding");
            k5Var = null;
        }
        k5Var.B.setOnClickListener(new qb.d(this, cVar));
        k5 k5Var3 = this.G;
        if (k5Var3 == null) {
            cm.l.v("llServiceBinding");
            k5Var3 = null;
        }
        k5Var3.f27083x.setOnClickListener(new e(this));
        k5 k5Var4 = this.G;
        if (k5Var4 == null) {
            cm.l.v("llServiceBinding");
        } else {
            k5Var2 = k5Var4;
        }
        k5Var2.f27084y.setOnClickListener(new qb.f(this));
    }

    /* access modifiers changed from: private */
    public static final void x1(LLMain lLMain, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(lLMain, "this$0");
        lLMain.N.set(1, i10);
        lLMain.N.set(2, i11);
        lLMain.N.set(5, i12);
        CharSequence format = DateFormat.format("dd", lLMain.N.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        String str = (String) format;
        CharSequence format2 = DateFormat.format("MM", lLMain.N.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) format2;
        CharSequence format3 = DateFormat.format("yyyy", lLMain.N.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) format3;
        k5 k5Var = lLMain.G;
        if (k5Var == null) {
            cm.l.v("llServiceBinding");
            k5Var = null;
        }
        TextView textView = k5Var.B;
        textView.setText(str + '-' + str2 + '-' + str3);
    }

    /* access modifiers changed from: private */
    public static final void y1(LLMain lLMain, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(lLMain, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(lLMain, onDateSetListener, lLMain.N.get(1), lLMain.N.get(2), lLMain.N.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void z1(LLMain lLMain, View view) {
        cm.l.f(lLMain, "this$0");
        k5 k5Var = lLMain.G;
        k5 k5Var2 = null;
        if (k5Var == null) {
            cm.l.v("llServiceBinding");
            k5Var = null;
        }
        k5Var.A.setText("");
        k5 k5Var3 = lLMain.G;
        if (k5Var3 == null) {
            cm.l.v("llServiceBinding");
        } else {
            k5Var2 = k5Var3;
        }
        k5Var2.B.setText("");
    }

    public final void E1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void F1(FetchLlDetails fetchLlDetails) {
        cm.l.f(fetchLlDetails, "<set-?>");
        this.O = fetchLlDetails;
    }

    public final void G1(Context context) {
        cm.l.f(context, "<set-?>");
        this.H = context;
    }

    public final void H1(LlInterface llInterface) {
        cm.l.f(llInterface, "<set-?>");
        this.M = llInterface;
    }

    public final void I1(sb.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void J1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void K1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    public final void L1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final ld.c n1() {
        ld.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final FetchLlDetails o1() {
        FetchLlDetails fetchLlDetails = this.O;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        cm.l.v("llDetails");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        G1(this);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_ll);
        cm.l.e(f10, "setContentView(...)");
        this.G = (k5) f10;
        v1();
        w1();
        l1();
        k5 k5Var = this.G;
        k5 k5Var2 = null;
        if (k5Var == null) {
            cm.l.v("llServiceBinding");
            k5Var = null;
        }
        k5Var.D.setOnClickListener(new qb.a(this));
        e.a aVar = v9.e.f17509a;
        k5 k5Var3 = this.G;
        if (k5Var3 == null) {
            cm.l.v("llServiceBinding");
        } else {
            k5Var2 = k5Var3;
        }
        aVar.i1(this, k5Var2);
    }

    public final Context p1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final LlInterface q1() {
        LlInterface llInterface = this.M;
        if (llInterface != null) {
            return llInterface;
        }
        cm.l.v("mLlInterface");
        return null;
    }

    public final sb.c r1() {
        sb.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mLlViewModel");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final f t1() {
        f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final String u1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("state_Code");
        return null;
    }
}
