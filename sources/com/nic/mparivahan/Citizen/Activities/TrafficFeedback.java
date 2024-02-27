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
import d9.v0;
import d9.w0;
import ld.g;
import ni.p8;
import pl.x;
import v9.e;

public final class TrafficFeedback extends d {
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
    public ld.c Q;
    public p8 R;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficFeedback f7783e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(TrafficFeedback trafficFeedback) {
            super(1);
            this.f7783e = trafficFeedback;
        }

        public final void b(SaveVioFeedBack saveVioFeedBack) {
            try {
                this.f7783e.u1().setVisibility(8);
                if (cm.l.a(saveVioFeedBack.getStatusCode(), "TRV001")) {
                    this.f7783e.x1("Feedback submitted successfully");
                    return;
                }
                this.f7783e.u1().setVisibility(8);
                this.f7783e.x1(saveVioFeedBack.getStatusDesc());
            } catch (Exception unused) {
                this.f7783e.u1().setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SaveVioFeedBack) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficFeedback f7784e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TrafficFeedback trafficFeedback) {
            super(1);
            this.f7784e = trafficFeedback;
        }

        public final void b(String str) {
            this.f7784e.u1().setVisibility(8);
            this.f7784e.x1("Something went wrong,Please try after some time!");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7785a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f7785a = lVar;
        }

        public final pl.c a() {
            return this.f7785a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7785a.invoke(obj);
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

    private final void o1() {
        TextView m12;
        String str;
        View findViewById = findViewById(R.id.ev_name);
        cm.l.e(findViewById, "findViewById(...)");
        D1((TextView) findViewById);
        View findViewById2 = findViewById(R.id.ev_email_id);
        cm.l.e(findViewById2, "findViewById(...)");
        C1((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.editTextTextMultiLine);
        cm.l.e(findViewById3, "findViewById(...)");
        B1((TextView) findViewById3);
        View findViewById4 = findViewById(R.id.btn_feedback);
        cm.l.e(findViewById4, "findViewById(...)");
        A1((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.traffic_feedback_progress);
        cm.l.e(findViewById5, "findViewById(...)");
        I1((ProgressBar) findViewById5);
        if (t1().t()) {
            n1().setText(t1().n());
            if (!ka.c.f13158a.m(t1().h())) {
                m12 = m1();
                str = t1().h();
            } else {
                m12 = m1();
                str = "NA";
            }
            m12.setText(str);
        }
        OffenceInterface offenceInterface = this.M;
        if (offenceInterface == null) {
            cm.l.v("mOffenceInterface");
            offenceInterface = null;
        }
        F1((k9.b) new u0((x0) this, (u0.b) new k9.a(new i9.a(offenceInterface))).a(k9.b.class));
        r1().L().g(this, new c(new a(this)));
        r1().I().g(this, new c(new b(this)));
        k1().setOnClickListener(new w0(this));
    }

    /* access modifiers changed from: private */
    public static final void p1(TrafficFeedback trafficFeedback, View view) {
        Context q12;
        ld.c s12;
        String str;
        cm.l.f(trafficFeedback, "this$0");
        CharSequence text = trafficFeedback.l1().getText();
        cm.l.e(text, "getText(...)");
        if (text.length() == 0) {
            q12 = trafficFeedback.q1();
            s12 = trafficFeedback.s1();
            str = "Please enter description";
        } else if (trafficFeedback.l1().getText().length() < 30) {
            q12 = trafficFeedback.q1();
            s12 = trafficFeedback.s1();
            str = "Please enter minimum 30 characters";
        } else {
            trafficFeedback.u1().setVisibility(0);
            if (trafficFeedback.v1() != null) {
                trafficFeedback.r1().Z(q.B0(trafficFeedback.l1().getText().toString()).toString(), trafficFeedback.v1());
                return;
            }
            return;
        }
        Toast.makeText(q12, s12.b("enter_Desription", str), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void w1(TrafficFeedback trafficFeedback, View view) {
        cm.l.f(trafficFeedback, "this$0");
        trafficFeedback.finish();
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
        ((TextView) findViewById2).setOnClickListener(new d9.x0(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void y1(Dialog dialog, TrafficFeedback trafficFeedback, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(trafficFeedback, "this$0");
        dialog.dismiss();
        trafficFeedback.finish();
    }

    public final void A1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.K = textView;
    }

    public final void B1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.J = textView;
    }

    public final void C1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.I = textView;
    }

    public final void D1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.H = textView;
    }

    public final void E1(Context context) {
        cm.l.f(context, "<set-?>");
        this.G = context;
    }

    public final void F1(k9.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.N = bVar;
    }

    public final void G1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final void H1(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.L = gVar;
    }

    public final void I1(ProgressBar progressBar) {
        cm.l.f(progressBar, "<set-?>");
        this.P = progressBar;
    }

    public final void J1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final p8 j1() {
        p8 p8Var = this.R;
        if (p8Var != null) {
            return p8Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final TextView k1() {
        TextView textView = this.K;
        if (textView != null) {
            return textView;
        }
        cm.l.v("btnFeedbak");
        return null;
    }

    public final TextView l1() {
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        cm.l.v("evDescription");
        return null;
    }

    public final TextView m1() {
        TextView textView = this.I;
        if (textView != null) {
            return textView;
        }
        cm.l.v("evEmailId");
        return null;
    }

    public final TextView n1() {
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
        p8 c10 = p8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        z1(c10);
        setContentView((View) j1().b());
        E1(this);
        H1(new g(this));
        G1(new ld.c(this));
        e.f17509a.g(this, j1());
        j1().f27991f.f25961g.setText(s1().b("report_traffic_violation", "Report Traffic Violation"));
        j1().f27991f.f25959e.setOnClickListener(new v0(this));
        this.M = OffenceInterface.f7826a.b(this);
        J1(String.valueOf(getIntent().getStringExtra("violOffenceId")));
        o1();
    }

    public final Context q1() {
        Context context = this.G;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final k9.b r1() {
        k9.b bVar = this.N;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mOffenceViewModel");
        return null;
    }

    public final ld.c s1() {
        ld.c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final g t1() {
        g gVar = this.L;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final ProgressBar u1() {
        ProgressBar progressBar = this.P;
        if (progressBar != null) {
            return progressBar;
        }
        cm.l.v("traffic_feedback_progress");
        return null;
    }

    public final String v1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("violOffenceId");
        return null;
    }

    public final void z1(p8 p8Var) {
        cm.l.f(p8Var, "<set-?>");
        this.R = p8Var;
    }
}
