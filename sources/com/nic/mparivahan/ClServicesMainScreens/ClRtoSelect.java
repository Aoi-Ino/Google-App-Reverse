package com.nic.mparivahan.ClServicesMainScreens;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.l;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.CurrentRTO;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.sarathiStateApi.SarathiStatePojo;
import com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster;
import java.util.ArrayList;
import java.util.List;
import ld.c;
import ld.f;
import ni.z0;
import u9.p;
import u9.q;
import u9.r;
import u9.s;
import u9.t;
import u9.u;
import u9.v;
import v9.e;

public final class ClRtoSelect extends d {
    private z0 G;
    public Context H;
    public ProgressDialog I;
    public c J;
    public ArrayList K;
    public ArrayList L;
    public f M;
    public ba.b N;
    public DlServiceInt O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public String X;
    private String Y = "NA";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f8066a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f8067b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private String f8068c0 = "";

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClRtoSelect f8069e;

        a(ClRtoSelect clRtoSelect) {
            this.f8069e = clRtoSelect;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (i10 == 0) {
                this.f8069e.b2("0");
                return;
            }
            try {
                ClRtoSelect clRtoSelect = this.f8069e;
                clRtoSelect.b2(((StateMaster) clRtoSelect.B1().get(i10)).getState_code());
                ClRtoSelect clRtoSelect2 = this.f8069e;
                clRtoSelect2.d2(((StateMaster) clRtoSelect2.B1().get(i10)).getState_name());
                ba.b o12 = this.f8069e.o1();
                ClRtoSelect clRtoSelect3 = this.f8069e;
                o12.h(clRtoSelect3, clRtoSelect3.A1());
            } catch (Exception e10) {
                e10.getLocalizedMessage();
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClRtoSelect f8070e;

        b(ClRtoSelect clRtoSelect) {
            this.f8070e = clRtoSelect;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            String rto_code;
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            ClRtoSelect clRtoSelect = this.f8070e;
            if (i10 == 0) {
                rto_code = "0";
            } else {
                clRtoSelect.Z1(((RtosMaster) clRtoSelect.u1().get(i10)).getRto_name());
                clRtoSelect = this.f8070e;
                rto_code = ((RtosMaster) clRtoSelect.u1().get(i10)).getRto_code();
            }
            clRtoSelect.Y1(rto_code);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    private final void D1() {
        T1(this);
        S1(new c(t1()));
        a2(new f(t1()));
        z0 c10 = z0.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        if (c10 == null) {
            l.v("rtoSelectBinding");
            c10 = null;
        }
        setContentView((View) c10.b());
        X1(DlServiceInt.f21675a.a(t1()));
        W1(new ProgressDialog(t1()));
        w1().setMessage(s1().b("label_challan_please_wait", getString(R.string.please_wait)));
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        O1((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(x1(), this))).a(ba.b.class));
        w1().show();
        o1().i(this);
        try {
            Q1(String.valueOf(getIntent().getStringExtra("dobValue")));
            P1(String.valueOf(getIntent().getStringExtra("dlValue")));
            R1(String.valueOf(getIntent().getStringExtra("fatherName")));
            M1(String.valueOf(getIntent().getStringExtra("clName")));
            N1(String.valueOf(getIntent().getStringExtra("clPhoto")));
            V1(String.valueOf(getIntent().getStringExtra("mobileNumber")));
            this.Z = String.valueOf(getIntent().getStringExtra("address"));
            this.f8066a0 = String.valueOf(getIntent().getStringExtra("issuing_authority"));
            this.f8067b0 = String.valueOf(getIntent().getStringExtra("validity"));
            this.f8068c0 = String.valueOf(getIntent().getStringExtra("cl_Status"));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void E1(ClRtoSelect clRtoSelect, SarathiStatePojo sarathiStatePojo) {
        z0 z0Var;
        l.f(clRtoSelect, "this$0");
        try {
            z0 z0Var2 = null;
            if (p.o(sarathiStatePojo.getStatus_code(), "00", true)) {
                List<StateMaster> stateMaster = sarathiStatePojo.getStateMaster();
                l.d(stateMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster> }");
                clRtoSelect.c2((ArrayList) stateMaster);
                aa.b bVar = new aa.b(clRtoSelect, clRtoSelect.B1());
                z0 z0Var3 = clRtoSelect.G;
                if (z0Var3 == null) {
                    l.v("rtoSelectBinding");
                    z0Var3 = null;
                }
                z0Var3.f29623c.setAdapter(bVar);
                int size = clRtoSelect.B1().size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if (p.o(clRtoSelect.z1().l(), "OR", true) && p.o(q.B0(((StateMaster) clRtoSelect.B1().get(i10)).getState_code()).toString(), "OD", true)) {
                        z0Var = clRtoSelect.G;
                        if (z0Var == null) {
                            l.v("rtoSelectBinding");
                            z0Var = null;
                        }
                    } else if (l.a(clRtoSelect.z1().l(), q.B0(((StateMaster) clRtoSelect.B1().get(i10)).getState_code()).toString())) {
                        clRtoSelect.d2(((StateMaster) clRtoSelect.B1().get(i10)).getState_name());
                        z0Var = clRtoSelect.G;
                        if (z0Var == null) {
                            l.v("rtoSelectBinding");
                            z0Var = null;
                        }
                    } else {
                        i10++;
                    }
                }
                z0Var.f29623c.setSelection(i10);
                z0 z0Var4 = clRtoSelect.G;
                if (z0Var4 == null) {
                    l.v("rtoSelectBinding");
                    z0Var4 = null;
                }
                z0Var4.f29623c.setEnabled(false);
                z0 z0Var5 = clRtoSelect.G;
                if (z0Var5 == null) {
                    l.v("rtoSelectBinding");
                } else {
                    z0Var2 = z0Var5;
                }
                z0Var2.f29623c.setClickable(false);
                return;
            }
            clRtoSelect.c2(new ArrayList());
            clRtoSelect.B1().add(0, new StateMaster("Select State", "0"));
            aa.b bVar2 = new aa.b(clRtoSelect, clRtoSelect.B1());
            z0 z0Var6 = clRtoSelect.G;
            if (z0Var6 == null) {
                l.v("rtoSelectBinding");
            } else {
                z0Var2 = z0Var6;
            }
            z0Var2.f29623c.setAdapter(bVar2);
        } catch (Exception unused) {
            Toast.makeText(clRtoSelect.getApplicationContext(), clRtoSelect.s1().b("service_is_not_present", clRtoSelect.getString(R.string.unable_to_get_details)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void F1(ClRtoSelect clRtoSelect, String str) {
        l.f(clRtoSelect, "this$0");
        Toast.makeText(clRtoSelect.getApplicationContext(), clRtoSelect.s1().b("service_is_not_present", clRtoSelect.getString(R.string.unable_to_get_details)), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void G1(ClRtoSelect clRtoSelect, CurrentRTO currentRTO) {
        l.f(clRtoSelect, "this$0");
        clRtoSelect.w1().dismiss();
        try {
            z0 z0Var = null;
            if (p.o(currentRTO.getStatus_code(), "00", true)) {
                List<RtosMaster> rtosMaster = currentRTO.getRtosMaster();
                l.d(rtosMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster> }");
                clRtoSelect.U1((ArrayList) rtosMaster);
                ArrayList u12 = clRtoSelect.u1();
                String b10 = clRtoSelect.s1().b("select_rto", clRtoSelect.getString(R.string.please_select_rto));
                l.c(b10);
                u12.add(0, new RtosMaster(b10, "0"));
                aa.a aVar = new aa.a(clRtoSelect, clRtoSelect.u1());
                z0 z0Var2 = clRtoSelect.G;
                if (z0Var2 == null) {
                    l.v("rtoSelectBinding");
                    z0Var2 = null;
                }
                z0Var2.f29622b.setAdapter(aVar);
                z0 z0Var3 = clRtoSelect.G;
                if (z0Var3 == null) {
                    l.v("rtoSelectBinding");
                    z0Var3 = null;
                }
                z0Var3.f29622b.setEnabled(true);
                z0 z0Var4 = clRtoSelect.G;
                if (z0Var4 == null) {
                    l.v("rtoSelectBinding");
                } else {
                    z0Var = z0Var4;
                }
                z0Var.f29622b.setClickable(true);
                return;
            }
            List<RtosMaster> rtosMaster2 = currentRTO.getRtosMaster();
            l.d(rtosMaster2, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster> }");
            clRtoSelect.U1((ArrayList) rtosMaster2);
            ArrayList u13 = clRtoSelect.u1();
            String b11 = clRtoSelect.s1().b("select_rto", clRtoSelect.getString(R.string.please_select_rto));
            l.c(b11);
            u13.add(0, new RtosMaster(b11, "0"));
            aa.a aVar2 = new aa.a(clRtoSelect, clRtoSelect.u1());
            z0 z0Var5 = clRtoSelect.G;
            if (z0Var5 == null) {
                l.v("rtoSelectBinding");
            } else {
                z0Var = z0Var5;
            }
            z0Var.f29622b.setAdapter(aVar2);
        } catch (Exception unused) {
            clRtoSelect.K1(clRtoSelect.s1().b("service_is_not_present", clRtoSelect.getString(R.string.unable_to_get_details)));
        }
    }

    /* access modifiers changed from: private */
    public static final void H1(ClRtoSelect clRtoSelect, String str) {
        l.f(clRtoSelect, "this$0");
        clRtoSelect.w1().dismiss();
        clRtoSelect.K1(clRtoSelect.s1().b("service_is_not_present", clRtoSelect.getString(R.string.unable_to_get_details)));
    }

    /* access modifiers changed from: private */
    public static final void I1(ClRtoSelect clRtoSelect, View view) {
        l.f(clRtoSelect, "this$0");
        clRtoSelect.finish();
    }

    /* access modifiers changed from: private */
    public static final void J1(ClRtoSelect clRtoSelect, View view) {
        l.f(clRtoSelect, "this$0");
        if (p.o(clRtoSelect.y1(), "0", true)) {
            clRtoSelect.K1("Please select RTO");
            return;
        }
        Intent intent = new Intent(clRtoSelect, MobileOtpScreen.class);
        intent.putExtra("dlValue", clRtoSelect.p1());
        intent.putExtra("dobValue", clRtoSelect.q1());
        intent.putExtra("fatherName", clRtoSelect.r1());
        intent.putExtra("clName", clRtoSelect.m1());
        intent.putExtra("clPhoto", clRtoSelect.n1());
        intent.putExtra("stateCode", clRtoSelect.A1());
        intent.putExtra("stateName", clRtoSelect.C1());
        intent.putExtra("rtoCode", clRtoSelect.y1());
        intent.putExtra("rtoName", clRtoSelect.Y);
        intent.putExtra("clPhoto", clRtoSelect.n1());
        intent.putExtra("mobileNumber", clRtoSelect.v1());
        intent.putExtra("address", clRtoSelect.Z).toString();
        intent.putExtra("issuing_authority", clRtoSelect.f8066a0).toString();
        intent.putExtra("validity", clRtoSelect.f8067b0).toString();
        intent.putExtra("cl_Status", clRtoSelect.f8068c0).toString();
        clRtoSelect.startActivity(intent);
        clRtoSelect.finish();
    }

    private final void K1(String str) {
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
        textView.setText(s1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(s1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(s1().b("btn_ok", "OK"));
        textView.setOnClickListener(new v(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void L1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final String A1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("state_code");
        return null;
    }

    public final ArrayList B1() {
        ArrayList arrayList = this.K;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("state_list");
        return null;
    }

    public final String C1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("state_name");
        return null;
    }

    public final void M1(String str) {
        l.f(str, "<set-?>");
        this.U = str;
    }

    public final void N1(String str) {
        l.f(str, "<set-?>");
        this.V = str;
    }

    public final void O1(ba.b bVar) {
        l.f(bVar, "<set-?>");
        this.N = bVar;
    }

    public final void P1(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final void Q1(String str) {
        l.f(str, "<set-?>");
        this.S = str;
    }

    public final void R1(String str) {
        l.f(str, "<set-?>");
        this.T = str;
    }

    public final void S1(c cVar) {
        l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void T1(Context context) {
        l.f(context, "<set-?>");
        this.H = context;
    }

    public final void U1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.L = arrayList;
    }

    public final void V1(String str) {
        l.f(str, "<set-?>");
        this.X = str;
    }

    public final void W1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void X1(DlServiceInt dlServiceInt) {
        l.f(dlServiceInt, "<set-?>");
        this.O = dlServiceInt;
    }

    public final void Y1(String str) {
        l.f(str, "<set-?>");
        this.W = str;
    }

    public final void Z1(String str) {
        l.f(str, "<set-?>");
        this.Y = str;
    }

    public final void a2(f fVar) {
        l.f(fVar, "<set-?>");
        this.M = fVar;
    }

    public final void b2(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void c2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.K = arrayList;
    }

    public final void d2(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final String m1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        l.v("clName");
        return null;
    }

    public final String n1() {
        String str = this.V;
        if (str != null) {
            return str;
        }
        l.v("clPhoto");
        return null;
    }

    public final ba.b o1() {
        ba.b bVar = this.N;
        if (bVar != null) {
            return bVar;
        }
        l.v("dlServicesViewModel");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_cl_rto_select);
        D1();
        e.a aVar = e.f17509a;
        z0 z0Var = this.G;
        z0 z0Var2 = null;
        if (z0Var == null) {
            l.v("rtoSelectBinding");
            z0Var = null;
        }
        aVar.c0(this, z0Var);
        z0 z0Var3 = this.G;
        if (z0Var3 == null) {
            l.v("rtoSelectBinding");
            z0Var3 = null;
        }
        z0Var3.f29625e.setText(p1());
        o1().z().g(this, new p(this));
        o1().B().g(this, new q(this));
        z0 z0Var4 = this.G;
        if (z0Var4 == null) {
            l.v("rtoSelectBinding");
            z0Var4 = null;
        }
        z0Var4.f29623c.setOnItemSelectedListener(new a(this));
        z0 z0Var5 = this.G;
        if (z0Var5 == null) {
            l.v("rtoSelectBinding");
            z0Var5 = null;
        }
        z0Var5.f29622b.setOnItemSelectedListener(new b(this));
        o1().y().g(this, new r(this));
        o1().A().g(this, new s(this));
        z0 z0Var6 = this.G;
        if (z0Var6 == null) {
            l.v("rtoSelectBinding");
            z0Var6 = null;
        }
        z0Var6.f29628h.setOnClickListener(new t(this));
        z0 z0Var7 = this.G;
        if (z0Var7 == null) {
            l.v("rtoSelectBinding");
        } else {
            z0Var2 = z0Var7;
        }
        z0Var2.f29629i.setOnClickListener(new u(this));
    }

    public final String p1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        l.v("dlValue");
        return null;
    }

    public final String q1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        l.v("dobValue");
        return null;
    }

    public final String r1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        l.v("fatherName");
        return null;
    }

    public final c s1() {
        c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final Context t1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final ArrayList u1() {
        ArrayList arrayList = this.L;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("mRtosMaster");
        return null;
    }

    public final String v1() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        l.v("mobileNumber");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final DlServiceInt x1() {
        DlServiceInt dlServiceInt = this.O;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        l.v("retrofitService");
        return null;
    }

    public final String y1() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        l.v("rto_code");
        return null;
    }

    public final f z1() {
        f fVar = this.M;
        if (fVar != null) {
            return fVar;
        }
        l.v("sahi_session");
        return null;
    }
}
