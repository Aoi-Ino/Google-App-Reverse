package com.nic.mparivahan.DPTNotice;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.DPTNotice.DataClass.NoticeCourtProceedingDataModel;
import com.nic.mparivahan.DPTNotice.DataClass.NoticeCourtStatusModel;
import com.nic.mparivahan.DPTNotice.DataClass.NoticeVirtualCourtModel;
import com.nic.mparivahan.DPTNotice.Services.NoticeService;
import com.nic.mparivahan.R;
import fa.s;
import fa.t;
import fa.u;
import ni.y6;
import pl.x;

public final class NoticeVirtualCourtActivity extends d {
    public ld.c G;
    private y6 H;
    private NoticeService I;
    private ga.c J;
    private String K = "";
    /* access modifiers changed from: private */
    public ProgressDialog L;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NoticeVirtualCourtActivity f8369e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(NoticeVirtualCourtActivity noticeVirtualCourtActivity) {
            super(1);
            this.f8369e = noticeVirtualCourtActivity;
        }

        public final void b(NoticeVirtualCourtModel noticeVirtualCourtModel) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog i12 = this.f8369e.L;
                if (i12 == null) {
                    cm.l.v("dialog");
                    i12 = null;
                }
                if (i12.isShowing()) {
                    ProgressDialog i13 = this.f8369e.L;
                    if (i13 == null) {
                        cm.l.v("dialog");
                        i13 = null;
                    }
                    i13.dismiss();
                }
                if (noticeVirtualCourtModel.getCode() != 200) {
                    return;
                }
                if (noticeVirtualCourtModel.getResult().size() > 0) {
                    this.f8369e.r1(noticeVirtualCourtModel);
                    return;
                }
                NoticeVirtualCourtActivity noticeVirtualCourtActivity = this.f8369e;
                noticeVirtualCourtActivity.k1(noticeVirtualCourtActivity, noticeVirtualCourtActivity.n1().b("error_msg_record_not_found", this.f8369e.getString(R.string.service_unavable_please_try)));
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressDialog i14 = this.f8369e.L;
                if (i14 == null) {
                    cm.l.v("dialog");
                    i14 = null;
                }
                if (i14.isShowing()) {
                    ProgressDialog i15 = this.f8369e.L;
                    if (i15 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = i15;
                    }
                    progressDialog.dismiss();
                }
                NoticeVirtualCourtActivity noticeVirtualCourtActivity2 = this.f8369e;
                noticeVirtualCourtActivity2.k1(noticeVirtualCourtActivity2, noticeVirtualCourtActivity2.n1().b("error_msg_record_not_found", this.f8369e.getString(R.string.service_unavable_please_try)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((NoticeVirtualCourtModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NoticeVirtualCourtActivity f8370e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(NoticeVirtualCourtActivity noticeVirtualCourtActivity) {
            super(1);
            this.f8370e = noticeVirtualCourtActivity;
        }

        public final void b(String str) {
            ProgressDialog i12 = this.f8370e.L;
            ProgressDialog progressDialog = null;
            if (i12 == null) {
                cm.l.v("dialog");
                i12 = null;
            }
            if (i12.isShowing()) {
                ProgressDialog i13 = this.f8370e.L;
                if (i13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = i13;
                }
                progressDialog.dismiss();
            }
            NoticeVirtualCourtActivity noticeVirtualCourtActivity = this.f8370e;
            noticeVirtualCourtActivity.k1(noticeVirtualCourtActivity, noticeVirtualCourtActivity.n1().b("error_msg_record_not_found", this.f8370e.getString(R.string.service_unavable_please_try)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8371a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f8371a = lVar;
        }

        public final pl.c a() {
            return this.f8371a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8371a.invoke(obj);
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
    public static final void l1(Dialog dialog, NoticeVirtualCourtActivity noticeVirtualCourtActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(noticeVirtualCourtActivity, "this$0");
        dialog.dismiss();
        noticeVirtualCourtActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void m1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void o1() {
        ProgressDialog progressDialog = null;
        try {
            ProgressDialog progressDialog2 = this.L;
            if (progressDialog2 == null) {
                cm.l.v("dialog");
                progressDialog2 = null;
            }
            if (progressDialog2.isShowing()) {
                ProgressDialog progressDialog3 = this.L;
                if (progressDialog3 == null) {
                    cm.l.v("dialog");
                    progressDialog3 = null;
                }
                progressDialog3.dismiss();
            }
            ProgressDialog progressDialog4 = this.L;
            if (progressDialog4 == null) {
                cm.l.v("dialog");
                progressDialog4 = null;
            }
            progressDialog4.show();
            ga.c cVar = this.J;
            if (cVar == null) {
                cm.l.v("viewModel");
                cVar = null;
            }
            cVar.n(this.K);
        } catch (Exception e10) {
            e10.printStackTrace();
            ProgressDialog progressDialog5 = this.L;
            if (progressDialog5 == null) {
                cm.l.v("dialog");
                progressDialog5 = null;
            }
            if (progressDialog5.isShowing()) {
                ProgressDialog progressDialog6 = this.L;
                if (progressDialog6 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = progressDialog6;
                }
                progressDialog.dismiss();
            }
        }
    }

    private final void p1() {
        y6 y6Var = this.H;
        NoticeService noticeService = null;
        if (y6Var == null) {
            cm.l.v("binding");
            y6Var = null;
        }
        y6Var.f29472t.f28305f.setOnClickListener(new s(this));
        this.I = NoticeService.f8372a.c(this);
        NoticeService noticeService2 = this.I;
        if (noticeService2 == null) {
            cm.l.v("retrofitService");
        } else {
            noticeService = noticeService2;
        }
        this.J = (ga.c) new u0((x0) this, (u0.b) new ga.b(new ga.a(noticeService))).a(ga.c.class);
        if (com.nic.mparivahan.dlservices.utilities.d.d(this.K)) {
            o1();
        }
    }

    /* access modifiers changed from: private */
    public static final void q1(NoticeVirtualCourtActivity noticeVirtualCourtActivity, View view) {
        cm.l.f(noticeVirtualCourtActivity, "this$0");
        noticeVirtualCourtActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public final void r1(NoticeVirtualCourtModel noticeVirtualCourtModel) {
        cm.l.c(noticeVirtualCourtModel);
        y6 y6Var = null;
        if (noticeVirtualCourtModel.getResult().size() > 0) {
            NoticeCourtStatusModel noticeCourtStatusModel = noticeVirtualCourtModel.getResult().get(0);
            cm.l.e(noticeCourtStatusModel, "get(...)");
            NoticeCourtStatusModel noticeCourtStatusModel2 = noticeCourtStatusModel;
            if (com.nic.mparivahan.dlservices.utilities.d.d(Integer.valueOf(noticeCourtStatusModel2.getChallan_no()))) {
                y6 y6Var2 = this.H;
                if (y6Var2 == null) {
                    cm.l.v("binding");
                    y6Var2 = null;
                }
                y6Var2.f29455c.setText(String.valueOf(noticeCourtStatusModel2.getChallan_no()));
            }
            if (com.nic.mparivahan.dlservices.utilities.d.d(Integer.valueOf(noticeCourtStatusModel2.getAmount()))) {
                y6 y6Var3 = this.H;
                if (y6Var3 == null) {
                    cm.l.v("binding");
                    y6Var3 = null;
                }
                y6Var3.f29454b.setText(String.valueOf(noticeCourtStatusModel2.getAmount()));
            }
            if (com.nic.mparivahan.dlservices.utilities.d.d(noticeCourtStatusModel2.getCourt_name())) {
                y6 y6Var4 = this.H;
                if (y6Var4 == null) {
                    cm.l.v("binding");
                    y6Var4 = null;
                }
                y6Var4.f29463k.setText(noticeCourtStatusModel2.getCourt_name());
            }
            if (com.nic.mparivahan.dlservices.utilities.d.d(noticeCourtStatusModel2.getCourt_address())) {
                y6 y6Var5 = this.H;
                if (y6Var5 == null) {
                    cm.l.v("binding");
                    y6Var5 = null;
                }
                y6Var5.f29462j.setText(noticeCourtStatusModel2.getCourt_address());
            }
            if (com.nic.mparivahan.dlservices.utilities.d.d(noticeCourtStatusModel2.getForword_date())) {
                y6 y6Var6 = this.H;
                if (y6Var6 == null) {
                    cm.l.v("binding");
                    y6Var6 = null;
                }
                y6Var6.f29470r.setText(noticeCourtStatusModel2.getForword_date());
            }
        }
        if (noticeVirtualCourtModel.getProceeding_data().size() > 0) {
            y6 y6Var7 = this.H;
            if (y6Var7 == null) {
                cm.l.v("binding");
                y6Var7 = null;
            }
            y6Var7.f29468p.setVisibility(0);
            y6 y6Var8 = this.H;
            if (y6Var8 == null) {
                cm.l.v("binding");
                y6Var8 = null;
            }
            y6Var8.N.setVisibility(0);
            y6 y6Var9 = this.H;
            if (y6Var9 == null) {
                cm.l.v("binding");
                y6Var9 = null;
            }
            y6Var9.P.setVisibility(0);
            y6 y6Var10 = this.H;
            if (y6Var10 == null) {
                cm.l.v("binding");
                y6Var10 = null;
            }
            y6Var10.f29466n.setVisibility(0);
            y6 y6Var11 = this.H;
            if (y6Var11 == null) {
                cm.l.v("binding");
                y6Var11 = null;
            }
            y6Var11.f29464l.setVisibility(0);
            NoticeCourtProceedingDataModel noticeCourtProceedingDataModel = noticeVirtualCourtModel.getProceeding_data().get(0);
            cm.l.e(noticeCourtProceedingDataModel, "get(...)");
            NoticeCourtProceedingDataModel noticeCourtProceedingDataModel2 = noticeCourtProceedingDataModel;
            if (com.nic.mparivahan.dlservices.utilities.d.d(noticeCourtProceedingDataModel2.getDate_of_proceeding())) {
                y6 y6Var12 = this.H;
                if (y6Var12 == null) {
                    cm.l.v("binding");
                    y6Var12 = null;
                }
                y6Var12.f29469q.setText(noticeCourtProceedingDataModel2.getDate_of_proceeding());
            }
            if (com.nic.mparivahan.dlservices.utilities.d.d(noticeCourtProceedingDataModel2.getFine_imposed())) {
                y6 y6Var13 = this.H;
                if (y6Var13 == null) {
                    cm.l.v("binding");
                    y6Var13 = null;
                }
                y6Var13.f29465m.setText(noticeCourtProceedingDataModel2.getFine_imposed());
            }
            if (com.nic.mparivahan.dlservices.utilities.d.d(noticeCourtProceedingDataModel2.getParty_name())) {
                y6 y6Var14 = this.H;
                if (y6Var14 == null) {
                    cm.l.v("binding");
                } else {
                    y6Var = y6Var14;
                }
                y6Var.f29467o.setText(noticeCourtProceedingDataModel2.getParty_name());
                return;
            }
            return;
        }
        y6 y6Var15 = this.H;
        if (y6Var15 == null) {
            cm.l.v("binding");
            y6Var15 = null;
        }
        y6Var15.f29468p.setVisibility(8);
        y6 y6Var16 = this.H;
        if (y6Var16 == null) {
            cm.l.v("binding");
            y6Var16 = null;
        }
        y6Var16.N.setVisibility(8);
        y6 y6Var17 = this.H;
        if (y6Var17 == null) {
            cm.l.v("binding");
            y6Var17 = null;
        }
        y6Var17.P.setVisibility(8);
        y6 y6Var18 = this.H;
        if (y6Var18 == null) {
            cm.l.v("binding");
            y6Var18 = null;
        }
        y6Var18.f29466n.setVisibility(8);
        y6 y6Var19 = this.H;
        if (y6Var19 == null) {
            cm.l.v("binding");
        } else {
            y6Var = y6Var19;
        }
        y6Var.f29464l.setVisibility(8);
    }

    public final void k1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById4;
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new t(dialog, this));
        ((TextView) findViewById3).setOnClickListener(new u(dialog));
        dialog.show();
    }

    public final ld.c n1() {
        ld.c cVar = this.G;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        y6 c10 = y6.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.H = c10;
        ga.c cVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        s1(new ld.c(this));
        if (getIntent() != null && getIntent().hasExtra("challanNo")) {
            this.K = String.valueOf(getIntent().getIntExtra("challanNo", 0));
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.L = progressDialog;
        progressDialog.setMessage(n1().b("label_challan_getting_details", "Getting details..."));
        ProgressDialog progressDialog2 = this.L;
        if (progressDialog2 == null) {
            cm.l.v("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.L;
        if (progressDialog3 == null) {
            cm.l.v("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCancelable(false);
        p1();
        ga.c cVar2 = this.J;
        if (cVar2 == null) {
            cm.l.v("viewModel");
            cVar2 = null;
        }
        cVar2.j().g(this, new c(new a(this)));
        ga.c cVar3 = this.J;
        if (cVar3 == null) {
            cm.l.v("viewModel");
        } else {
            cVar = cVar3;
        }
        cVar.g().g(this, new c(new b(this)));
    }

    public final void s1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.G = cVar;
    }
}
