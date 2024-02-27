package com.nic.mparivahan.VahanServices.FancyServices;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import cm.h;
import cm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel.AvailableFancyModel;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel.Data;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyService.AvailableFancyService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ni.s;
import pl.x;
import v9.e;
import ye.o;
import ye.p;
import ye.q;
import ye.r;

public final class AvailableFancyNumberList extends androidx.appcompat.app.d {
    public s G;
    private ArrayList H = new ArrayList();
    public df.a I;
    public ProgressDialog J;
    private AvailableFancyService K;
    private gf.a L;
    public String M;
    public String N;
    private ArrayList O = new ArrayList();
    private ArrayList P = new ArrayList();
    public ld.c Q;
    private int R = 1;
    private int S = 100;

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AvailableFancyNumberList f20616e;

        a(AvailableFancyNumberList availableFancyNumberList) {
            this.f20616e = availableFancyNumberList;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f20616e.F1(new ArrayList());
            Iterator it = this.f20616e.s1().iterator();
            while (it.hasNext()) {
                Data data = (Data) it.next();
                String lowerCase = data.getReg_no().toLowerCase();
                l.e(lowerCase, "this as java.lang.String).toLowerCase()");
                String F0 = s.F0(lowerCase, 4);
                l.c(charSequence);
                if (q.D(F0, charSequence, true)) {
                    this.f20616e.o1().add(data);
                }
            }
            if (!this.f20616e.o1().isEmpty()) {
                this.f20616e.m1().A(this.f20616e.o1());
            }
            if (String.valueOf(this.f20616e.n1().f28481c.getText()).length() == 0) {
                this.f20616e.m1().C(this.f20616e.o1());
                this.f20616e.H1(1);
                AvailableFancyNumberList availableFancyNumberList = this.f20616e;
                availableFancyNumberList.r1(availableFancyNumberList.q1());
            }
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AvailableFancyNumberList f20617e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AvailableFancyNumberList availableFancyNumberList) {
            super(1);
            this.f20617e = availableFancyNumberList;
        }

        public final void b(AvailableFancyModel availableFancyModel) {
            ProgressDialog t12;
            try {
                l.c(availableFancyModel);
                if (p.o(availableFancyModel.getStatus(), "SUCCESS", true)) {
                    AvailableFancyNumberList availableFancyNumberList = this.f20617e;
                    List<Data> data = availableFancyModel.getData();
                    l.d(data, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel.Data>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel.Data> }");
                    availableFancyNumberList.I1((ArrayList) data);
                    if (this.f20617e.s1().size() > 0) {
                        AvailableFancyNumberList availableFancyNumberList2 = this.f20617e;
                        availableFancyNumberList2.C1(availableFancyNumberList2.s1());
                    }
                    if (this.f20617e.t1().isShowing()) {
                        t12 = this.f20617e.t1();
                    } else {
                        return;
                    }
                } else if (this.f20617e.t1().isShowing()) {
                    t12 = this.f20617e.t1();
                } else {
                    return;
                }
                t12.dismiss();
            } catch (Exception e10) {
                e10.printStackTrace();
                if (this.f20617e.t1().isShowing()) {
                    this.f20617e.t1().dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AvailableFancyModel) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AvailableFancyNumberList f20618e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AvailableFancyNumberList availableFancyNumberList) {
            super(1);
            this.f20618e = availableFancyNumberList;
        }

        public final void b(String str) {
            if (this.f20618e.t1().isShowing()) {
                this.f20618e.t1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f20619a;

        d(bm.l lVar) {
            l.f(lVar, "function");
            this.f20619a = lVar;
        }

        public final pl.c a() {
            return this.f20619a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20619a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void A1(AvailableFancyNumberList availableFancyNumberList, View view) {
        l.f(availableFancyNumberList, "this$0");
        if (String.valueOf(availableFancyNumberList.n1().f28481c.getText()).length() == 0) {
            Toast.makeText(availableFancyNumberList, availableFancyNumberList.p1().b("please_enter_4_digit_reg_no", availableFancyNumberList.getString(R.string.please_enter_4_digit_reg_no)), 1).show();
        } else {
            availableFancyNumberList.l1(String.valueOf(availableFancyNumberList.n1().f28481c.getText()));
        }
    }

    private final void B1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void C1(List list) {
        df.a m12 = m1();
        m12.B(list);
        m12.j();
    }

    private final void l1(String str) {
        this.O = new ArrayList();
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            Data data = (Data) it.next();
            String lowerCase = data.getReg_no().toLowerCase();
            l.e(lowerCase, "this as java.lang.String).toLowerCase()");
            String lowerCase2 = str.toLowerCase();
            l.e(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (q.F(lowerCase, lowerCase2, false, 2, (Object) null)) {
                this.O.add(data);
            }
        }
        if (this.O.isEmpty()) {
            Toast.makeText(getApplicationContext(), p1().b("no_data_found", getString(R.string.no_data_found)), 0).show();
        } else {
            m1().A(this.O);
        }
    }

    /* access modifiers changed from: private */
    public final void r1(int i10) {
        try {
            t1().show();
            gf.a aVar = this.L;
            if (aVar == null) {
                l.v("viewModel");
                aVar = null;
            }
            aVar.i(v1(), u1(), String.valueOf(this.S), String.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
            if (t1().isShowing()) {
                t1().dismiss();
            }
        }
    }

    private final void w1() {
        n1().f28482d.setOnScrollChangeListener(new o(this));
        AvailableFancyService availableFancyService = this.K;
        if (availableFancyService == null) {
            l.v("retrofitService");
            availableFancyService = null;
        }
        this.L = (gf.a) new u0((x0) this, (u0.b) new ef.a(new ef.b(availableFancyService))).a(gf.a.class);
        n1().f28484f.f28305f.setOnClickListener(new p(this));
        n1().f28484f.f28306g.setOnClickListener(new q(this));
        n1().f28480b.setLayoutManager(new LinearLayoutManager(this));
        D1(new df.a(this, new ArrayList()));
        n1().f28480b.setAdapter(m1());
        r1(this.R);
        n1().f28483e.setOnClickListener(new r(this));
        n1().f28481c.addTextChangedListener(new a(this));
    }

    /* access modifiers changed from: private */
    public static final void x1(AvailableFancyNumberList availableFancyNumberList, NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        l.f(availableFancyNumberList, "this$0");
        l.f(nestedScrollView, "v");
        if (i11 == nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) {
            int i14 = availableFancyNumberList.R + 1;
            availableFancyNumberList.R = i14;
            availableFancyNumberList.r1(i14);
        }
    }

    /* access modifiers changed from: private */
    public static final void y1(AvailableFancyNumberList availableFancyNumberList, View view) {
        l.f(availableFancyNumberList, "this$0");
        availableFancyNumberList.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void z1(AvailableFancyNumberList availableFancyNumberList, View view) {
        l.f(availableFancyNumberList, "this$0");
        availableFancyNumberList.B1();
    }

    public final void D1(df.a aVar) {
        l.f(aVar, "<set-?>");
        this.I = aVar;
    }

    public final void E1(s sVar) {
        l.f(sVar, "<set-?>");
        this.G = sVar;
    }

    public final void F1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.O = arrayList;
    }

    public final void G1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final void H1(int i10) {
        this.R = i10;
    }

    public final void I1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.H = arrayList;
    }

    public final void J1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void K1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void L1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final df.a m1() {
        df.a aVar = this.I;
        if (aVar != null) {
            return aVar;
        }
        l.v("adapter");
        return null;
    }

    public final s n1() {
        s sVar = this.G;
        if (sVar != null) {
            return sVar;
        }
        l.v("binding");
        return null;
    }

    public final ArrayList o1() {
        return this.O;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s c10 = s.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        E1(c10);
        setContentView((View) n1().b());
        G1(new ld.c(this));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("stateCode", "HR");
            l.e(string, "getString(...)");
            L1(string);
            String string2 = extras.getString("rtoCode", "0");
            l.e(string2, "getString(...)");
            K1(string2);
        }
        n1().f28484f.f28308i.setText("Available Fancy No. Status");
        e.f17509a.J(this, n1());
        J1(new ProgressDialog(this));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        this.K = AvailableFancyService.f20625a.c(this);
        w1();
        gf.a aVar = this.L;
        gf.a aVar2 = null;
        if (aVar == null) {
            l.v("viewModel");
            aVar = null;
        }
        aVar.g().g(this, new d(new b(this)));
        gf.a aVar3 = this.L;
        if (aVar3 == null) {
            l.v("viewModel");
        } else {
            aVar2 = aVar3;
        }
        aVar2.h().g(this, new d(new c(this)));
    }

    public final ld.c p1() {
        ld.c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final int q1() {
        return this.R;
    }

    public final ArrayList s1() {
        return this.H;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("progressDialog");
        return null;
    }

    public final String u1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("rtoCode");
        return null;
    }

    public final String v1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        l.v("stateCode");
        return null;
    }
}
