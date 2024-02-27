package com.nic.mparivahan.Dashboard;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.EnableServiceResponse;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.R;
import ia.m;
import ia.n;
import ia.o;
import java.util.ArrayList;
import java.util.Collections;
import ld.c;
import ld.g;
import ma.s;
import qa.a;
import qa.b;

public final class EsSectionActivity extends d {
    public b G;
    private ESInterface H;
    public RecyclerView I;
    public TextView J;
    public Context K;
    public g L;
    public LinearLayout M;
    public c N;
    private ArrayList O = new ArrayList();
    private ArrayList P = new ArrayList();
    public ProgressDialog Q;

    /* access modifiers changed from: private */
    public static final void q1(EsSectionActivity esSectionActivity, View view) {
        l.f(esSectionActivity, "this$0");
        esSectionActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void r1(EsSectionActivity esSectionActivity, EnableServiceResponse enableServiceResponse) {
        l.f(esSectionActivity, "this$0");
        try {
            esSectionActivity.o1().dismiss();
            if (p.o(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
                Collections.sort(enabledservice);
                esSectionActivity.D1(enabledservice);
                ArrayList arrayList = new ArrayList();
                int size = enabledservice.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(enabledservice.get(i10).getServCode());
                }
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(esSectionActivity.getApplicationContext()).edit();
                edit.putString("enabledServiceList", new i7.d().t(arrayList));
                edit.commit();
                return;
            }
            esSectionActivity.t1(enableServiceResponse.getStatusDesc());
        } catch (Exception unused) {
            esSectionActivity.t1(esSectionActivity.m1().b("no_details", esSectionActivity.getString(R.string.no_Details_are_avail)));
        }
    }

    /* access modifiers changed from: private */
    public static final void s1(EsSectionActivity esSectionActivity, String str) {
        l.f(esSectionActivity, "this$0");
        esSectionActivity.o1().dismiss();
    }

    private final void t1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new o(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void u1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final void A1(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.M = linearLayout;
    }

    public final void B1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.Q = progressDialog;
    }

    public final void C1(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.I = recyclerView;
    }

    public final void D1(ArrayList arrayList) {
        l.f(arrayList, "mList");
        int size = this.O.size();
        for (int i10 = 0; i10 < size; i10++) {
            Log.e("Test", arrayList.toString());
            ArrayList arrayList2 = new ArrayList();
            arrayList2.clear();
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Integer num = (Integer) this.O.get(i10);
                int servSection = ((Enabledservice) arrayList.get(i11)).getServSection();
                if (num != null && num.intValue() == servSection) {
                    arrayList2.add(arrayList.get(i11));
                }
            }
            if (arrayList2.size() > 0) {
                Log.e("Test", String.valueOf(i10));
                this.P.add(arrayList2);
            }
        }
        p1().setLayoutManager(new LinearLayoutManager(k1()));
        p1().setAdapter(new s(this.P, k1(), String.valueOf(getIntent().getStringExtra("state_code"))));
    }

    public final void E1(g gVar) {
        l.f(gVar, "<set-?>");
        this.L = gVar;
    }

    public final TextView j1() {
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        l.v("lableService");
        return null;
    }

    public final Context k1() {
        Context context = this.K;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final b l1() {
        b bVar = this.G;
        if (bVar != null) {
            return bVar;
        }
        l.v("mESViewModel");
        return null;
    }

    public final c m1() {
        c cVar = this.N;
        if (cVar != null) {
            return cVar;
        }
        l.v("mLanguageKeySession");
        return null;
    }

    public final LinearLayout n1() {
        LinearLayout linearLayout = this.M;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("nexgenarrow");
        return null;
    }

    public final ProgressDialog o1() {
        ProgressDialog progressDialog = this.Q;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.sectionview);
        x1(this);
        E1(new g(k1()));
        z1(new c(k1()));
        this.H = ESInterface.f8381a.c(k1());
        View findViewById = findViewById(R.id.es_vahan_recyclerView);
        l.e(findViewById, "findViewById(...)");
        C1((RecyclerView) findViewById);
        View findViewById2 = findViewById(R.id.lableService);
        l.e(findViewById2, "findViewById(...)");
        w1((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.nexgenarrow);
        l.e(findViewById3, "findViewById(...)");
        A1((LinearLayout) findViewById3);
        B1(new ProgressDialog(this));
        o1().setMessage("Please wait...");
        o1().setCancelable(false);
        o1().setCanceledOnTouchOutside(false);
        v1();
        j1().setText(m1().b("label_driving_licence_related", "Driving Licence Related Services"));
        n1().setOnClickListener(new ia.l(this));
        ESInterface eSInterface = this.H;
        if (eSInterface == null) {
            l.v("mESInterface");
            eSInterface = null;
        }
        y1((b) new u0((x0) this, (u0.b) new a(new oa.a(eSInterface))).a(b.class));
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            o1().show();
            l1().h(String.valueOf(getIntent().getStringExtra("state_code")));
        } else {
            Toast.makeText(getApplicationContext(), m1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
        l1().n().g(this, new m(this));
        l1().q().g(this, new n(this));
    }

    public final RecyclerView p1() {
        RecyclerView recyclerView = this.I;
        if (recyclerView != null) {
            return recyclerView;
        }
        l.v("recyclerView");
        return null;
    }

    public final void v1() {
        for (int i10 = 0; i10 < 5; i10++) {
            this.O.add(Integer.valueOf(i10));
        }
    }

    public final void w1(TextView textView) {
        l.f(textView, "<set-?>");
        this.J = textView;
    }

    public final void x1(Context context) {
        l.f(context, "<set-?>");
        this.K = context;
    }

    public final void y1(b bVar) {
        l.f(bVar, "<set-?>");
        this.G = bVar;
    }

    public final void z1(c cVar) {
        l.f(cVar, "<set-?>");
        this.N = cVar;
    }
}
