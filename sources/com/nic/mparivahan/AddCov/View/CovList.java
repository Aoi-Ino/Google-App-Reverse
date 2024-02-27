package com.nic.mparivahan.AddCov.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.l;
import com.nic.mparivahan.AddCov.AddCovInterface;
import com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails;
import com.nic.mparivahan.AddCov.PojoClass.CovDataSubmit;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import java.io.Serializable;
import java.util.ArrayList;
import ld.c;
import ld.f;
import ni.q1;
import v9.e;
import w8.a;
import w8.b;
import x8.s;
import x8.t;
import x8.u;
import x8.v;
import x8.w;
import x8.x;
import x8.y;

public final class CovList extends d implements CompoundButton.OnCheckedChangeListener {
    private ArrayList G = new ArrayList();
    private ArrayList H = new ArrayList();
    private ArrayList I = new ArrayList();
    private q1 J;
    public ApplStatusDetails K;
    private b L;
    private AddCovInterface M;
    public String N;
    public String O;
    public f P;
    public c Q;
    private ProgressDialog R;

    private final void E1() {
        q1 q1Var = this.J;
        if (q1Var == null) {
            l.v("binding");
            q1Var = null;
        }
        q1Var.Z.removeAllViews();
        int size = this.I.size();
        for (int i10 = 0; i10 < size; i10++) {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            TextView textView = new TextView(this);
            textView.setPadding(16, 5, 16, 5);
            textView.setTextColor(getColor(R.color.black));
            textView.setTextSize(16.0f);
            textView.setText((CharSequence) this.I.get(i10));
            linearLayout.addView(textView);
            q1 q1Var2 = this.J;
            if (q1Var2 == null) {
                l.v("binding");
                q1Var2 = null;
            }
            q1Var2.Z.addView(linearLayout);
        }
    }

    private final void G1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, "Select");
        int size = this.I.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.addAll(p.d(this.I.get(i10)));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        q1 q1Var = this.J;
        if (q1Var == null) {
            l.v("binding");
            q1Var = null;
        }
        q1Var.f28123j0.setAdapter(arrayAdapter);
    }

    private final void H1(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            CheckBox checkBox = new CheckBox(this);
            checkBox.setOnCheckedChangeListener(this);
            checkBox.setText((CharSequence) arrayList.get(i10));
            linearLayout.addView(checkBox);
            q1 q1Var = this.J;
            if (q1Var == null) {
                l.v("binding");
                q1Var = null;
            }
            q1Var.X.addView(linearLayout);
        }
    }

    private final void r1() {
        D1(new f(this));
        F1(new c(this));
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.R = progressDialog;
        progressDialog.setMessage(q1().b("label_challan_please_wait", "Please wait..."));
        this.M = AddCovInterface.f7708a.a(this);
        AddCovInterface addCovInterface = this.M;
        if (addCovInterface == null) {
            l.v("mAddCovInterface");
            addCovInterface = null;
        }
        this.L = (b) new u0((x0) this, (u0.b) new a(new w8.c(addCovInterface))).a(b.class);
    }

    /* access modifiers changed from: private */
    public static final void s1(CovList covList, View view) {
        l.f(covList, "this$0");
        covList.finish();
    }

    /* access modifiers changed from: private */
    public static final void t1(CovList covList, View view) {
        l.f(covList, "this$0");
        covList.finish();
    }

    /* access modifiers changed from: private */
    public static final void u1(CovList covList, View view) {
        b bVar;
        l.f(covList, "this$0");
        ArrayList arrayList = covList.I;
        if (arrayList == null || arrayList.isEmpty() || covList.I.size() < 1) {
            Toast.makeText(covList, "Please Select Vehicle Class", 1).show();
            return;
        }
        ProgressDialog progressDialog = covList.R;
        if (progressDialog == null) {
            l.v("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        b bVar2 = covList.L;
        if (bVar2 == null) {
            l.v("mAddCovModel");
            bVar = null;
        } else {
            bVar = bVar2;
        }
        bVar.i(covList, covList.m1(), covList.o1(), covList.p1().l(), covList.I);
    }

    /* access modifiers changed from: private */
    public static final void v1(CovList covList, CovDataSubmit covDataSubmit) {
        l.f(covList, "this$0");
        ProgressDialog progressDialog = covList.R;
        if (progressDialog == null) {
            l.v("dialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
        try {
            if (l.a(covDataSubmit.getStatus_code(), "01")) {
                covList.y1(covDataSubmit.getStatus_desc());
            } else {
                Toast.makeText(covList, covDataSubmit.getStatus_desc(), 1).show();
            }
        } catch (Exception unused) {
            Toast.makeText(covList, "Service temporarily unavailable, Please try again later.", 0).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void w1(CovList covList, String str) {
        l.f(covList, "this$0");
        ProgressDialog progressDialog = covList.R;
        if (progressDialog == null) {
            l.v("dialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
        Toast.makeText(covList, "Service temporarily unavailable, Please try again later.", 0).show();
    }

    /* access modifiers changed from: private */
    public static final void x1(CovList covList, View view) {
        l.f(covList, "this$0");
        covList.finish();
    }

    private final void y1(String str) {
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
        textView.setText(q1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(q1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(q1().b("btn_ok", "OK"));
        textView.setOnClickListener(new y(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void z1(Dialog dialog, CovList covList, View view) {
        l.f(dialog, "$d");
        l.f(covList, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(covList, DashBoard.class);
        intent.setFlags(67108864);
        covList.startActivity(intent);
        covList.finish();
    }

    public final void A1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void B1(ApplStatusDetails applStatusDetails) {
        l.f(applStatusDetails, "<set-?>");
        this.K = applStatusDetails;
    }

    public final void C1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void D1(f fVar) {
        l.f(fVar, "<set-?>");
        this.P = fVar;
    }

    public final void F1(c cVar) {
        l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final String m1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        l.v("app");
        return null;
    }

    public final ApplStatusDetails n1() {
        ApplStatusDetails applStatusDetails = this.K;
        if (applStatusDetails != null) {
            return applStatusDetails;
        }
        l.v("mApplStatusDetails");
        return null;
    }

    public final String o1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("newdob");
        return null;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        ArrayList arrayList = this.H;
        l.c(compoundButton);
        if (arrayList.contains(compoundButton.getText().toString())) {
            this.H.remove(compoundButton.getText().toString());
            compoundButton.getText().toString();
            this.I.remove(compoundButton.getText().toString());
        } else {
            this.H.add(compoundButton.getText().toString());
            this.I.add(compoundButton.getText().toString());
        }
        q1 q1Var = null;
        if (this.I.size() > 0) {
            q1 q1Var2 = this.J;
            if (q1Var2 == null) {
                l.v("binding");
                q1Var2 = null;
            }
            q1Var2.f28114a0.setVisibility(0);
            q1 q1Var3 = this.J;
            if (q1Var3 == null) {
                l.v("binding");
            } else {
                q1Var = q1Var3;
            }
            q1Var.Z.setVisibility(0);
            G1();
            E1();
            return;
        }
        q1 q1Var4 = this.J;
        if (q1Var4 == null) {
            l.v("binding");
            q1Var4 = null;
        }
        q1Var4.Z.setVisibility(8);
        q1 q1Var5 = this.J;
        if (q1Var5 == null) {
            l.v("binding");
        } else {
            q1Var = q1Var5;
        }
        q1Var.f28114a0.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q1 x10 = q1.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        this.J = x10;
        q1 q1Var = null;
        if (x10 == null) {
            l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        r1();
        e.a aVar = e.f17509a;
        q1 q1Var2 = this.J;
        if (q1Var2 == null) {
            l.v("binding");
            q1Var2 = null;
        }
        aVar.t(this, q1Var2);
        q1 q1Var3 = this.J;
        if (q1Var3 == null) {
            l.v("binding");
            q1Var3 = null;
        }
        q1Var3.S.f25961g.setText(p1().i());
        q1 q1Var4 = this.J;
        if (q1Var4 == null) {
            l.v("binding");
            q1Var4 = null;
        }
        q1Var4.S.f25959e.setOnClickListener(new s(this));
        if (getIntent() != null) {
            C1(String.valueOf(getIntent().getStringExtra("newdob")));
            A1(String.valueOf(getIntent().getStringExtra("app_number")));
            Serializable serializableExtra = getIntent().getSerializableExtra("ApplStatusDetails");
            l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails");
            B1((ApplStatusDetails) serializableExtra);
            try {
                String selectedCovs = n1().getSelectedCovs();
                if (selectedCovs != null) {
                    if (selectedCovs.length() != 0) {
                        q1 q1Var5 = this.J;
                        if (q1Var5 == null) {
                            l.v("binding");
                            q1Var5 = null;
                        }
                        q1Var5.Y.setText(n1().getSelectedCovs());
                    }
                }
                q1 q1Var6 = this.J;
                if (q1Var6 == null) {
                    l.v("binding");
                    q1Var6 = null;
                }
                q1Var6.Y.setText("NA");
            } catch (Exception unused) {
                q1 q1Var7 = this.J;
                if (q1Var7 == null) {
                    l.v("binding");
                    q1Var7 = null;
                }
                q1Var7.Y.setText("NA");
            }
        }
        q1 q1Var8 = this.J;
        if (q1Var8 == null) {
            l.v("binding");
            q1Var8 = null;
        }
        q1Var8.f28133z.setOnClickListener(new t(this));
        H1(n1().getEligiblecovs_EnableMode());
        q1 q1Var9 = this.J;
        if (q1Var9 == null) {
            l.v("binding");
            q1Var9 = null;
        }
        q1Var9.T.setOnClickListener(new u(this));
        b bVar = this.L;
        if (bVar == null) {
            l.v("mAddCovModel");
            bVar = null;
        }
        bVar.o().g(this, new v(this));
        b bVar2 = this.L;
        if (bVar2 == null) {
            l.v("mAddCovModel");
            bVar2 = null;
        }
        bVar2.m().g(this, new w(this));
        q1 q1Var10 = this.J;
        if (q1Var10 == null) {
            l.v("binding");
        } else {
            q1Var = q1Var10;
        }
        q1Var.f28133z.setOnClickListener(new x(this));
    }

    public final f p1() {
        f fVar = this.P;
        if (fVar != null) {
            return fVar;
        }
        l.v("sahi_session");
        return null;
    }

    public final c q1() {
        c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }
}
