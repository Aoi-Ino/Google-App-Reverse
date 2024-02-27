package com.nic.mparivahan.LLMainScreen;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.h;
import cm.l;
import cm.m;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.CurrentRTO;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster;
import com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.CheckByState;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.RTO;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import ni.z5;
import pl.x;
import qb.s0;
import qb.t0;
import qb.v0;

public final class LlRto extends androidx.appcompat.app.d {
    public z5 G;
    public ld.f H;
    public ba.b I;
    /* access modifiers changed from: private */
    public String J = "";
    public Context K;
    public ld.f L;
    public DlServiceInt M;
    public ld.c N;
    public FetchLlDetails O;
    public da.c P;
    public AadharInterface Q;
    public ArrayList R;
    private String S = "";
    private String T = "";

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlRto f8997e;

        a(LlRto llRto) {
            this.f8997e = llRto;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            LlRto llRto = this.f8997e;
            llRto.P1(((RtosMaster) llRto.s1().get(i10)).getRto_name());
            LlRto llRto2 = this.f8997e;
            llRto2.O1(((RtosMaster) llRto2.s1().get(i10)).getRto_code());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlRto f8998e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LlRto llRto) {
            super(1);
            this.f8998e = llRto;
        }

        public final void b(CheckByState checkByState) {
            this.f8998e.l1().I.c(false);
            try {
                Intent intent = new Intent(this.f8998e.r1(), LlMobileOtp.class);
                intent.putExtra("LLDetails", this.f8998e.o1());
                intent.putExtra("selectedRtoCd", this.f8998e.v1());
                intent.putExtra("selectedRtoName", this.f8998e.w1());
                this.f8998e.startActivity(intent);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CheckByState) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlRto f8999e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LlRto llRto) {
            super(1);
            this.f8999e = llRto;
        }

        public final void b(String str) {
            this.f8999e.l1().I.c(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlRto f9000e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LlRto llRto) {
            super(1);
            this.f9000e = llRto;
        }

        public final void b(CurrentRTO currentRTO) {
            this.f9000e.l1().f29683x.setVisibility(8);
            try {
                int i10 = 0;
                if (p.o(currentRTO.getStatus_code(), "00", true)) {
                    this.f9000e.l1().f29675p.setClickable(true);
                    LlRto llRto = this.f9000e;
                    List<RtosMaster> rtosMaster = currentRTO.getRtosMaster();
                    l.d(rtosMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster> }");
                    llRto.K1((ArrayList) rtosMaster);
                    ArrayList s12 = this.f9000e.s1();
                    String b10 = this.f9000e.n1().b("select_rto", this.f9000e.getString(R.string.please_select_rto));
                    l.c(b10);
                    s12.add(0, new RtosMaster(b10, "0"));
                    LlRto llRto2 = this.f9000e;
                    this.f9000e.l1().f29679t.setAdapter(new aa.a(llRto2, llRto2.s1()));
                    int size = this.f9000e.s1().size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        } else if (l.a(this.f9000e.J, ((RtosMaster) this.f9000e.s1().get(i11)).getRto_code())) {
                            i10 = i11;
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (i10 > 0) {
                        this.f9000e.l1().f29679t.setSelection(i10);
                    }
                    this.f9000e.l1().f29679t.setEnabled(true);
                    this.f9000e.l1().f29679t.setClickable(true);
                    return;
                }
                LlRto llRto3 = this.f9000e;
                List<RtosMaster> rtosMaster2 = currentRTO.getRtosMaster();
                l.d(rtosMaster2, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster> }");
                llRto3.K1((ArrayList) rtosMaster2);
                ArrayList s13 = this.f9000e.s1();
                String b11 = this.f9000e.n1().b("select_rto", this.f9000e.getString(R.string.please_select_rto));
                l.c(b11);
                s13.add(0, new RtosMaster(b11, "0"));
                LlRto llRto4 = this.f9000e;
                this.f9000e.l1().f29679t.setAdapter(new aa.a(llRto4, llRto4.s1()));
                int size2 = this.f9000e.s1().size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        break;
                    } else if (l.a(this.f9000e.J, ((RtosMaster) this.f9000e.s1().get(i12)).getRto_code())) {
                        i10 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i10 > 0) {
                    this.f9000e.l1().f29679t.setSelection(i10);
                }
            } catch (Exception unused) {
                this.f9000e.l1().f29683x.setVisibility(8);
                LlRto llRto5 = this.f9000e;
                llRto5.B1(llRto5.n1().b("service_is_not_present", this.f9000e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CurrentRTO) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlRto f9001e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(LlRto llRto) {
            super(1);
            this.f9001e = llRto;
        }

        public final void b(String str) {
            this.f9001e.l1().f29683x.setVisibility(8);
            LlRto llRto = this.f9001e;
            llRto.B1(llRto.n1().b("service_is_not_present", this.f9001e.getString(R.string.unable_to_get_details)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f9002a;

        f(bm.l lVar) {
            l.f(lVar, "function");
            this.f9002a = lVar;
        }

        public final pl.c a() {
            return this.f9002a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9002a.invoke(obj);
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
    public static final void A1(LlRto llRto, View view) {
        l.f(llRto, "this$0");
        llRto.finish();
    }

    /* access modifiers changed from: private */
    public final void B1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(n1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(n1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(n1().b("btn_ok", "OK"));
        textView.setOnClickListener(new v0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void C1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void x1() {
        J1(this);
        M1(new ld.f(this));
        F1(new ld.c(this));
        L1(DlServiceInt.f21675a.a(this));
        N1(new ld.f(this));
        H1(AadharInterface.f8349a.a(this));
        I1((da.c) new u0((x0) this, (u0.b) new da.a(new da.b(p1()))).a(da.c.class));
        E1((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(t1(), this))).a(ba.b.class));
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            G1((FetchLlDetails) serializableExtra);
            l1().A.setText(o1().getState().getStateName());
            RTO rto = o1().getRTO();
            l.c(rto);
            if (rto.getRTOCd() != null) {
                TextView textView = l1().f29685z;
                RTO rto2 = o1().getRTO();
                l.c(rto2);
                textView.setText(rto2.getRTOName());
                RTO rto3 = o1().getRTO();
                l.c(rto3);
                String rTOCd = rto3.getRTOCd();
                l.c(rTOCd);
                this.J = rTOCd;
                RTO rto4 = o1().getRTO();
                l.c(rto4);
                String rTOCd2 = rto4.getRTOCd();
                l.c(rTOCd2);
                this.S = rTOCd2;
                RTO rto5 = o1().getRTO();
                l.c(rto5);
                String rTOName = rto5.getRTOName();
                l.c(rTOName);
                this.T = rTOName;
            } else {
                l1().f29685z.setText("NA");
                this.J = "";
                this.S = "";
                this.T = "NA";
            }
            if (com.nic.mparivahan.dlservices.utilities.d.d(o1().getState().getStCd())) {
                l1().f29683x.setVisibility(8);
                m1().h(this, o1().getState().getStCd());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        l1().f29673n.setText(u1().i());
        MyTextView myTextView = l1().f29672m;
        myTextView.setText("LL No. : " + q.B0(o1().getLearningLicence()).toString());
        l1().f29679t.setOnItemSelectedListener(new a(this));
    }

    /* access modifiers changed from: private */
    public static final void y1(LlRto llRto, View view) {
        l.f(llRto, "this$0");
        llRto.l1().f29679t.performClick();
    }

    /* access modifiers changed from: private */
    public static final void z1(LlRto llRto, View view) {
        Context applicationContext;
        ld.c n12;
        String string;
        String str;
        l.f(llRto, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(llRto)) {
            int parseInt = l.a(llRto.u1().b(), "502") ? 502 : l.a(llRto.u1().b(), "504") ? 504 : l.a(llRto.u1().b(), "574") ? 574 : Integer.parseInt(llRto.u1().l());
            if (l.a(llRto.S, "0")) {
                applicationContext = llRto.getApplicationContext();
                n12 = llRto.n1();
                string = llRto.getString(R.string.please_select_rto);
                str = "select_rto";
            } else {
                llRto.l1().I.c(true);
                llRto.q1().g(llRto.u1().l(), parseInt, llRto.S);
                return;
            }
        } else {
            applicationContext = llRto.getApplicationContext();
            n12 = llRto.n1();
            string = llRto.getString(R.string.msg_no_internet);
            str = "label_log_check_internet";
        }
        Toast.makeText(applicationContext, n12.b(str, string), 1).show();
    }

    public final void D1(z5 z5Var) {
        l.f(z5Var, "<set-?>");
        this.G = z5Var;
    }

    public final void E1(ba.b bVar) {
        l.f(bVar, "<set-?>");
        this.I = bVar;
    }

    public final void F1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.N = cVar;
    }

    public final void G1(FetchLlDetails fetchLlDetails) {
        l.f(fetchLlDetails, "<set-?>");
        this.O = fetchLlDetails;
    }

    public final void H1(AadharInterface aadharInterface) {
        l.f(aadharInterface, "<set-?>");
        this.Q = aadharInterface;
    }

    public final void I1(da.c cVar) {
        l.f(cVar, "<set-?>");
        this.P = cVar;
    }

    public final void J1(Context context) {
        l.f(context, "<set-?>");
        this.K = context;
    }

    public final void K1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.R = arrayList;
    }

    public final void L1(DlServiceInt dlServiceInt) {
        l.f(dlServiceInt, "<set-?>");
        this.M = dlServiceInt;
    }

    public final void M1(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.L = fVar;
    }

    public final void N1(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.H = fVar;
    }

    public final void O1(String str) {
        l.f(str, "<set-?>");
        this.S = str;
    }

    public final void P1(String str) {
        l.f(str, "<set-?>");
        this.T = str;
    }

    public final z5 l1() {
        z5 z5Var = this.G;
        if (z5Var != null) {
            return z5Var;
        }
        l.v("binding");
        return null;
    }

    public final ba.b m1() {
        ba.b bVar = this.I;
        if (bVar != null) {
            return bVar;
        }
        l.v("dlServicesViewModel");
        return null;
    }

    public final ld.c n1() {
        ld.c cVar = this.N;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final FetchLlDetails o1() {
        FetchLlDetails fetchLlDetails = this.O;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        l.v("llDetails");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z5 c10 = z5.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        D1(c10);
        setContentView((View) l1().b());
        x1();
        v9.e.f17509a.h1(this, l1());
        q1().j().g(this, new f(new b(this)));
        q1().i().g(this, new f(new c(this)));
        l1().f29680u.setOnClickListener(new s0(this));
        l1().I.setOnClickListener(new t0(this));
        l1().H.setOnClickListener(new qb.u0(this));
        m1().y().g(this, new f(new d(this)));
        m1().A().g(this, new f(new e(this)));
    }

    public final AadharInterface p1() {
        AadharInterface aadharInterface = this.Q;
        if (aadharInterface != null) {
            return aadharInterface;
        }
        l.v("mAadharInterface");
        return null;
    }

    public final da.c q1() {
        da.c cVar = this.P;
        if (cVar != null) {
            return cVar;
        }
        l.v("mAadharViewModel");
        return null;
    }

    public final Context r1() {
        Context context = this.K;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final ArrayList s1() {
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("mRtosMaster");
        return null;
    }

    public final DlServiceInt t1() {
        DlServiceInt dlServiceInt = this.M;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        l.v("retrofitService");
        return null;
    }

    public final ld.f u1() {
        ld.f fVar = this.H;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final String v1() {
        return this.S;
    }

    public final String w1() {
        return this.T;
    }
}
