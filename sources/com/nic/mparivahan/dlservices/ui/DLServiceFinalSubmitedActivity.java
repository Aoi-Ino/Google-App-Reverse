package com.nic.mparivahan.dlservices.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.h;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import dj.a;
import dj.b;
import ld.c;
import ld.f;
import ni.t9;
import oi.g;

public final class DLServiceFinalSubmitedActivity extends g {
    private t9 J;
    private c K;
    public f L;

    /* access modifiers changed from: private */
    public static final void A1(DLServiceFinalSubmitedActivity dLServiceFinalSubmitedActivity, View view) {
        l.f(dLServiceFinalSubmitedActivity, "this$0");
        dLServiceFinalSubmitedActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void B1(DLServiceFinalSubmitedActivity dLServiceFinalSubmitedActivity, View view) {
        l.f(dLServiceFinalSubmitedActivity, "this$0");
        Intent intent = new Intent(dLServiceFinalSubmitedActivity, ApplicationStatusActivity.class);
        new f(dLServiceFinalSubmitedActivity).r("Application Status", VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
        dLServiceFinalSubmitedActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void z1(DLServiceFinalSubmitedActivity dLServiceFinalSubmitedActivity, View view) {
        l.f(dLServiceFinalSubmitedActivity, "this$0");
        dLServiceFinalSubmitedActivity.onBackPressed();
    }

    public final void C1(f fVar) {
        l.f(fVar, "<set-?>");
        this.L = fVar;
    }

    public final void D1(Context context) {
        l.f(context, "context");
        Intent intent = new Intent(context, DLServiceFinalSubmitedActivity.class);
        intent.setFlags(268468224);
        context.startActivity(intent);
    }

    public void onBackPressed() {
        new DashBoard().T1(this);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h f10 = androidx.databinding.f.f(this, R.layout.application_submitted);
        l.e(f10, "setContentView(...)");
        this.J = (t9) f10;
        this.K = new c(this);
        C1(new f(this));
        t9 t9Var = this.J;
        t9 t9Var2 = null;
        if (t9Var == null) {
            l.v("mBinding");
            t9Var = null;
        }
        t9Var.f28720z.setOnClickListener(new a(this));
        t9 t9Var3 = this.J;
        if (t9Var3 == null) {
            l.v("mBinding");
            t9Var3 = null;
        }
        t9Var3.E.setOnClickListener(new b(this));
        t9 t9Var4 = this.J;
        if (t9Var4 == null) {
            l.v("mBinding");
            t9Var4 = null;
        }
        t9Var4.f28719y.setOnClickListener(new dj.c(this));
        t9 t9Var5 = this.J;
        if (t9Var5 == null) {
            l.v("mBinding");
            t9Var5 = null;
        }
        MyTextView myTextView = t9Var5.f28718x;
        c cVar = this.K;
        if (cVar == null) {
            l.v("languageSession");
            cVar = null;
        }
        myTextView.setText(cVar.b("label_app_submitted_successfully", "Your application has been submitted successfully."));
        t9 t9Var6 = this.J;
        if (t9Var6 == null) {
            l.v("mBinding");
            t9Var6 = null;
        }
        MyTextView myTextView2 = t9Var6.f28719y;
        c cVar2 = this.K;
        if (cVar2 == null) {
            l.v("languageSession");
            cVar2 = null;
        }
        myTextView2.setText(cVar2.b("redirect_link_to_application_status", "Click here to check your Application Status"));
        t9 t9Var7 = this.J;
        if (t9Var7 == null) {
            l.v("mBinding");
            t9Var7 = null;
        }
        TextView textView = t9Var7.f28720z;
        c cVar3 = this.K;
        if (cVar3 == null) {
            l.v("languageSession");
            cVar3 = null;
        }
        textView.setText(cVar3.b("label_home", "Home"));
        t9 t9Var8 = this.J;
        if (t9Var8 == null) {
            l.v("mBinding");
            t9Var8 = null;
        }
        t9Var8.C.f29578e.setVisibility(8);
        t9 t9Var9 = this.J;
        if (t9Var9 == null) {
            l.v("mBinding");
        } else {
            t9Var2 = t9Var9;
        }
        t9Var2.A.f25961g.setText(y1().i());
    }

    public final f y1() {
        f fVar = this.L;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }
}
