package com.nic.mparivahan.Citizen.Activities;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.SaveVioFeedBack;
import com.nic.mparivahan.R;
import d9.f;
import ld.g;
import ni.e;
import pl.x;

public final class AccidentFeedback extends d {
    public Context G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public g L;
    private OffenceInterface M;
    public k9.b N;
    public String O;
    public ProgressBar P;
    public e Q;
    public ld.c R;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentFeedback f7760e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AccidentFeedback accidentFeedback) {
            super(1);
            this.f7760e = accidentFeedback;
        }

        public final void b(SaveVioFeedBack saveVioFeedBack) {
            try {
                this.f7760e.t1().setVisibility(8);
                if (cm.l.a(saveVioFeedBack.getStatusCode(), "ACCD001")) {
                    this.f7760e.x1("Feedback submitted successfully");
                    return;
                }
                this.f7760e.x1(saveVioFeedBack.getStatusDesc());
                this.f7760e.t1().setVisibility(8);
            } catch (Exception unused) {
                this.f7760e.t1().setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SaveVioFeedBack) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentFeedback f7761e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AccidentFeedback accidentFeedback) {
            super(1);
            this.f7761e = accidentFeedback;
        }

        public final void b(String str) {
            this.f7761e.t1().setVisibility(8);
            this.f7761e.x1("Something went wrong,Please try after some time!");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7762a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f7762a = lVar;
        }

        public final pl.c a() {
            return this.f7762a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7762a.invoke(obj);
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

    private final void p1() {
        TextView n12;
        String str;
        View findViewById = findViewById(R.id.ev_name);
        cm.l.e(findViewById, "findViewById(...)");
        E1((TextView) findViewById);
        View findViewById2 = findViewById(R.id.ev_email_id);
        cm.l.e(findViewById2, "findViewById(...)");
        D1((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.editTextTextMultiLine);
        cm.l.e(findViewById3, "findViewById(...)");
        C1((TextView) findViewById3);
        View findViewById4 = findViewById(R.id.btn_feedback);
        cm.l.e(findViewById4, "findViewById(...)");
        B1((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.acc_feed_progress);
        cm.l.e(findViewById5, "findViewById(...)");
        H1((ProgressBar) findViewById5);
        if (v1().t()) {
            o1().setText(v1().n());
            n1().setText(v1().h());
            if (!ka.c.f13158a.m(v1().h())) {
                n12 = n1();
                str = v1().h();
            } else {
                n12 = n1();
                str = "NA";
            }
            n12.setText(str);
        }
        OffenceInterface offenceInterface = this.M;
        if (offenceInterface == null) {
            cm.l.v("mOffenceInterface");
            offenceInterface = null;
        }
        G1((k9.b) new u0((x0) this, (u0.b) new k9.a(new i9.a(offenceInterface))).a(k9.b.class));
        s1().P().g(this, new c(new a(this)));
        s1().Q().g(this, new c(new b(this)));
        l1().setOnClickListener(new d9.g(this));
    }

    /* access modifiers changed from: private */
    public static final void q1(AccidentFeedback accidentFeedback, View view) {
        Context r12;
        ld.c u12;
        String str;
        cm.l.f(accidentFeedback, "this$0");
        CharSequence text = accidentFeedback.m1().getText();
        cm.l.e(text, "getText(...)");
        if (text.length() == 0) {
            r12 = accidentFeedback.r1();
            u12 = accidentFeedback.u1();
            str = "Please enter description";
        } else if (accidentFeedback.m1().getText().length() < 30) {
            r12 = accidentFeedback.r1();
            u12 = accidentFeedback.u1();
            str = "Please enter minimum 30 characters";
        } else {
            accidentFeedback.t1().setVisibility(0);
            if (accidentFeedback.j1() != null) {
                accidentFeedback.s1().X(q.B0(accidentFeedback.m1().getText().toString()).toString(), accidentFeedback.j1());
                return;
            }
            return;
        }
        Toast.makeText(r12, u12.b("enter_Desription", str), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void w1(AccidentFeedback accidentFeedback, View view) {
        cm.l.f(accidentFeedback, "this$0");
        accidentFeedback.finish();
    }

    /* access modifiers changed from: private */
    public final void x1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new d9.h(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void y1(Dialog dialog, AccidentFeedback accidentFeedback, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(accidentFeedback, "this$0");
        dialog.dismiss();
        accidentFeedback.finish();
    }

    public final void A1(e eVar) {
        cm.l.f(eVar, "<set-?>");
        this.Q = eVar;
    }

    public final void B1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.K = textView;
    }

    public final void C1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.J = textView;
    }

    public final void D1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.I = textView;
    }

    public final void E1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.H = textView;
    }

    public final void F1(Context context) {
        cm.l.f(context, "<set-?>");
        this.G = context;
    }

    public final void G1(k9.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.N = bVar;
    }

    public final void H1(ProgressBar progressBar) {
        cm.l.f(progressBar, "<set-?>");
        this.P = progressBar;
    }

    public final void I1(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.L = gVar;
    }

    public final String j1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("accRecordId");
        return null;
    }

    public final e k1() {
        e eVar = this.Q;
        if (eVar != null) {
            return eVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final TextView l1() {
        TextView textView = this.K;
        if (textView != null) {
            return textView;
        }
        cm.l.v("btnFeedbak");
        return null;
    }

    public final TextView m1() {
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        cm.l.v("evDescription");
        return null;
    }

    public final TextView n1() {
        TextView textView = this.I;
        if (textView != null) {
            return textView;
        }
        cm.l.v("evEmailId");
        return null;
    }

    public final TextView o1() {
        TextView textView = this.H;
        if (textView != null) {
            return textView;
        }
        cm.l.v("evName");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e c10 = e.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        A1(c10);
        setContentView((View) k1().b());
        F1(this);
        I1(new g(this));
        v9.e.f17509a.b(this, k1());
        this.M = OffenceInterface.f7826a.b(this);
        z1(String.valueOf(getIntent().getStringExtra("accRecordId")));
        k1().f26018g.f25959e.setOnClickListener(new f(this));
        p1();
        k1().f26018g.f25961g.setText(u1().b("report_accident", "Report Accident"));
    }

    public final Context r1() {
        Context context = this.G;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final k9.b s1() {
        k9.b bVar = this.N;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mOffenceViewModel");
        return null;
    }

    public final ProgressBar t1() {
        ProgressBar progressBar = this.P;
        if (progressBar != null) {
            return progressBar;
        }
        cm.l.v("progressBar");
        return null;
    }

    public final ld.c u1() {
        ld.c cVar = this.R;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final g v1() {
        g gVar = this.L;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final void z1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }
}
