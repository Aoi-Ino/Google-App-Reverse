package com.nic.mparivahan.ClServicesMainScreens;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.ClServices.View.ChangeNameCl;
import com.nic.mparivahan.ClServices.View.ChangeOfAddressCl;
import com.nic.mparivahan.ClServices.View.DuplicateCl;
import com.nic.mparivahan.ClServices.View.RenewalCl;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import ld.c;
import ld.f;
import ni.g8;
import u9.s0;
import u9.t0;
import u9.u0;
import u9.v0;
import u9.w0;
import u9.x0;

public final class SelectClService extends d {
    public g8 G;
    public Context H;
    public ProgressDialog I;
    public c J;
    public f K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    private ArrayList U = new ArrayList();

    private final void A1(Intent intent, String str) {
        try {
            intent.putExtra("dlValue", n1());
            intent.putExtra("dobValue", o1());
            intent.putExtra("fatherName", p1());
            intent.putExtra("clName", l1());
            intent.putExtra("clPhoto", m1());
            intent.putExtra("stateCode", x1());
            intent.putExtra("rtoCode", t1());
            intent.putExtra("rtoName", u1());
            intent.putExtra("selectCode", str);
            intent.putExtra("stateName", y1());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void B1() {
        q1().D.setOnClickListener(new s0(this));
        q1().f26503z.setOnClickListener(new t0(this));
        q1().f26500w.setOnClickListener(new u0(this));
        q1().f26501x.setOnClickListener(new v0(this));
        q1().f26502y.setOnClickListener(new w0(this));
    }

    /* access modifiers changed from: private */
    public static final void C1(SelectClService selectClService, View view) {
        Intent intent;
        l.f(selectClService, "this$0");
        String str = "552";
        if (selectClService.U.contains(str)) {
            intent = new Intent(selectClService, RenewalCl.class);
        } else {
            str = "553";
            if (selectClService.U.contains(str)) {
                intent = new Intent(selectClService, ChangeOfAddressCl.class);
            } else {
                str = "554";
                if (selectClService.U.contains(str)) {
                    intent = new Intent(selectClService, DuplicateCl.class);
                } else {
                    str = "559";
                    if (selectClService.U.contains(str)) {
                        intent = new Intent(selectClService, ChangeNameCl.class);
                    } else {
                        selectClService.H1("Please select minimum one service");
                        return;
                    }
                }
            }
        }
        selectClService.A1(intent, str);
    }

    /* access modifiers changed from: private */
    public static final void D1(SelectClService selectClService, View view) {
        l.f(selectClService, "this$0");
        l.d(view, "null cannot be cast to non-null type android.widget.CompoundButton");
        String str = "552";
        if (((CompoundButton) view).isChecked()) {
            selectClService.U.add(str);
            selectClService.q1().f26500w.setChecked(false);
            selectClService.q1().f26502y.setChecked(false);
            selectClService.q1().f26501x.setChecked(false);
            str = "553";
            if (!selectClService.U.contains(str)) {
                str = "554";
                if (!selectClService.U.contains(str)) {
                    str = "559";
                    if (!selectClService.U.contains(str)) {
                        return;
                    }
                }
            }
        }
        selectClService.U.remove(str);
    }

    /* access modifiers changed from: private */
    public static final void E1(SelectClService selectClService, View view) {
        l.f(selectClService, "this$0");
        l.d(view, "null cannot be cast to non-null type android.widget.CompoundButton");
        String str = "553";
        if (((CompoundButton) view).isChecked()) {
            selectClService.U.add(str);
            selectClService.q1().f26502y.setChecked(false);
            selectClService.q1().f26501x.setChecked(false);
            selectClService.q1().f26503z.setChecked(false);
            str = "552";
            if (!selectClService.U.contains(str)) {
                str = "554";
                if (!selectClService.U.contains(str)) {
                    str = "559";
                    if (!selectClService.U.contains(str)) {
                        return;
                    }
                }
            }
        }
        selectClService.U.remove(str);
    }

    /* access modifiers changed from: private */
    public static final void F1(SelectClService selectClService, View view) {
        l.f(selectClService, "this$0");
        l.d(view, "null cannot be cast to non-null type android.widget.CompoundButton");
        String str = "554";
        if (((CompoundButton) view).isChecked()) {
            selectClService.U.add(str);
            selectClService.q1().f26500w.setChecked(false);
            selectClService.q1().f26502y.setChecked(false);
            selectClService.q1().f26503z.setChecked(false);
            str = "553";
            if (!selectClService.U.contains(str)) {
                str = "552";
                if (!selectClService.U.contains(str)) {
                    str = "559";
                    if (!selectClService.U.contains(str)) {
                        return;
                    }
                }
            }
        }
        selectClService.U.remove(str);
    }

    /* access modifiers changed from: private */
    public static final void G1(SelectClService selectClService, View view) {
        l.f(selectClService, "this$0");
        l.d(view, "null cannot be cast to non-null type android.widget.CompoundButton");
        String str = "559";
        if (((CompoundButton) view).isChecked()) {
            selectClService.U.add(str);
            selectClService.q1().f26500w.setChecked(false);
            selectClService.q1().f26501x.setChecked(false);
            selectClService.q1().f26503z.setChecked(false);
            str = "553";
            if (!selectClService.U.contains(str)) {
                str = "554";
                if (!selectClService.U.contains(str)) {
                    str = "552";
                    if (!selectClService.U.contains(str)) {
                        return;
                    }
                }
            }
        }
        selectClService.U.remove(str);
    }

    private final void H1(String str) {
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
        textView.setText(w1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(w1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(w1().b("btn_ok", "OK"));
        textView.setOnClickListener(new x0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void I1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void z1() {
        g8 x10 = g8.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        O1(x10);
        setContentView(q1().m());
        P1(this);
        U1(new c(r1()));
        T1(new f(r1()));
        Q1(new ProgressDialog(r1()));
        s1().setMessage(w1().b("label_challan_please_wait", getString(R.string.please_wait)));
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        try {
            M1(String.valueOf(getIntent().getStringExtra("dobValue")));
            L1(String.valueOf(getIntent().getStringExtra("dlValue")));
            N1(String.valueOf(getIntent().getStringExtra("fatherName")));
            J1(String.valueOf(getIntent().getStringExtra("clName")));
            K1(String.valueOf(getIntent().getStringExtra("clPhoto")));
            R1(String.valueOf(getIntent().getStringExtra("rtoCode")));
            S1(String.valueOf(getIntent().getStringExtra("rtoName")));
            V1(String.valueOf(getIntent().getStringExtra("stateCode")));
            W1(String.valueOf(getIntent().getStringExtra("stateName")));
            TextView textView = q1().H;
            textView.setText("CL No : " + n1());
            q1().B.f25961g.setText(v1().i());
            String m12 = m1();
            if (m12 != null) {
                if (m12.length() != 0) {
                    q1().B.f25960f.setVisibility(0);
                    q1().B.f25956b.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(m1()));
                    return;
                }
            }
            q1().B.f25960f.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    public final void J1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void K1(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void L1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void M1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void N1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void O1(g8 g8Var) {
        l.f(g8Var, "<set-?>");
        this.G = g8Var;
    }

    public final void P1(Context context) {
        l.f(context, "<set-?>");
        this.H = context;
    }

    public final void Q1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void R1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void S1(String str) {
        l.f(str, "<set-?>");
        this.T = str;
    }

    public final void T1(f fVar) {
        l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    public final void U1(c cVar) {
        l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void V1(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final void W1(String str) {
        l.f(str, "<set-?>");
        this.S = str;
    }

    public final String l1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        l.v("clName");
        return null;
    }

    public final String m1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("clPhoto");
        return null;
    }

    public final String n1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("dlValue");
        return null;
    }

    public final String o1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        l.v("dobValue");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z1();
        B1();
    }

    public final String p1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("fatherName");
        return null;
    }

    public final g8 q1() {
        g8 g8Var = this.G;
        if (g8Var != null) {
            return g8Var;
        }
        l.v("mBinding");
        return null;
    }

    public final Context r1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String t1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("rtoCode");
        return null;
    }

    public final String u1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        l.v("rtoName");
        return null;
    }

    public final f v1() {
        f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final c w1() {
        c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }

    public final String x1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        l.v("stateCode");
        return null;
    }

    public final String y1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        l.v("stateName");
        return null;
    }
}
