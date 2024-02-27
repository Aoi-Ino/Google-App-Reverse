package com.nic.mparivahan.dlservices.ui.ViewDocs;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedDocBeanItem;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedUploadDocResponse;
import ej.w;
import ej.y;
import java.util.ArrayList;
import java.util.List;
import ld.c;
import ld.f;
import ni.p9;
import nj.q;
import pl.x;
import v9.e;

public final class ViewDocScreen extends d {
    public p9 G;
    private q H;
    public String I;
    public String J;
    /* access modifiers changed from: private */
    public ProgressDialog K;
    public c L;
    public f M;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewDocScreen f21892e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ViewDocScreen viewDocScreen) {
            super(1);
            this.f21892e = viewDocScreen;
        }

        public final void b(InsertedUploadDocResponse insertedUploadDocResponse) {
            Log.d("dlInsertedDocStatus", insertedUploadDocResponse.toString());
            ProgressDialog h12 = this.f21892e.K;
            if (h12 == null) {
                cm.l.v("dialog");
                h12 = null;
            }
            h12.dismiss();
            try {
                this.f21892e.k1().f27999b.setLayoutManager(new LinearLayoutManager(this.f21892e));
                this.f21892e.k1().f27999b.setAdapter((RecyclerView.h) null);
                List<InsertedDocBeanItem> insertedDocBean = insertedUploadDocResponse.getInsertedDocBean();
                cm.l.d(insertedDocBean, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.dlservices.data.model.temp.InsertedDocBeanItem>");
                ViewDocScreen viewDocScreen = this.f21892e;
                this.f21892e.k1().f27999b.setAdapter(new w((ArrayList) insertedDocBean, viewDocScreen, viewDocScreen.j1(), this.f21892e.m1()));
            } catch (Exception unused) {
                ViewDocScreen viewDocScreen2 = this.f21892e;
                viewDocScreen2.o1(viewDocScreen2, "Service temporarily unavailable, Please try again later.");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InsertedUploadDocResponse) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21893a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f21893a = lVar;
        }

        public final pl.c a() {
            return this.f21893a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21893a.invoke(obj);
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
    public static final void n1(ViewDocScreen viewDocScreen, View view) {
        cm.l.f(viewDocScreen, "this$0");
        viewDocScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void p1(Dialog dialog, ViewDocScreen viewDocScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(viewDocScreen, "this$0");
        dialog.dismiss();
        viewDocScreen.finish();
    }

    public final c i1() {
        c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final String j1() {
        String str = this.I;
        if (str != null) {
            return str;
        }
        cm.l.v("mApplicationNumber");
        return null;
    }

    public final p9 k1() {
        p9 p9Var = this.G;
        if (p9Var != null) {
            return p9Var;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final f l1() {
        f fVar = this.M;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final String m1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        cm.l.v("stateCode");
        return null;
    }

    public final void o1(Context context, String str) {
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
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(i1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(i1().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new y(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String m12;
        super.onCreate(bundle);
        p9 c10 = p9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        s1(c10);
        setContentView((View) k1().b());
        q1(new c(this));
        e.f17509a.n(this, k1());
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.K = progressDialog;
        progressDialog.setMessage(i1().b("label_challan_please_wait", "Please wait..."));
        if (getIntent() != null) {
            try {
                String stringExtra = getIntent().getStringExtra("app_no");
                cm.l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                r1(stringExtra);
                String stringExtra2 = getIntent().getStringExtra("stateCode");
                cm.l.d(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                u1(stringExtra2);
            } catch (Exception e10) {
                Log.d("errors", e10.getLocalizedMessage());
            }
        }
        t1(new f(this));
        k1().f28001d.f28452f.setText(l1().i());
        k1().f28001d.f28448b.setOnClickListener(new ej.x(this));
        this.H = (q) new u0(this).a(q.class);
        String j12 = j1();
        q qVar = null;
        if (!(j12 == null || j12.length() == 0 || (m12 = m1()) == null || m12.length() == 0)) {
            if (dd.a.f9964a.a(this)) {
                ProgressDialog progressDialog2 = this.K;
                if (progressDialog2 == null) {
                    cm.l.v("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.show();
                q qVar2 = this.H;
                if (qVar2 == null) {
                    cm.l.v("viewModel");
                    qVar2 = null;
                }
                qVar2.p(j1(), m1());
            } else {
                o1(this, i1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)));
            }
        }
        q qVar3 = this.H;
        if (qVar3 == null) {
            cm.l.v("viewModel");
        } else {
            qVar = qVar3;
        }
        qVar.l().g(this, new b(new a(this)));
    }

    public final void q1(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void r1(String str) {
        cm.l.f(str, "<set-?>");
        this.I = str;
    }

    public final void s1(p9 p9Var) {
        cm.l.f(p9Var, "<set-?>");
        this.G = p9Var;
    }

    public final void t1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.M = fVar;
    }

    public final void u1(String str) {
        cm.l.f(str, "<set-?>");
        this.J = str;
    }
}
