package com.nic.mparivahan.Dashboard.EnabledServices;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.EnableServiceResponse;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import la.a;
import ld.c;
import ld.g;
import ma.r;
import qa.b;

public final class EsActivity extends d {
    public b G;
    private ESInterface H;
    public RecyclerView I;
    public TextView J;
    public Context K;
    public g L;
    public LinearLayout M;
    public ProgressBar N;
    public c O;
    public TextView P;

    /* access modifiers changed from: private */
    public static final void q1(EsActivity esActivity, View view) {
        l.f(esActivity, "this$0");
        esActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void r1(EsActivity esActivity, EnableServiceResponse enableServiceResponse) {
        l.f(esActivity, "this$0");
        try {
            esActivity.o1().setVisibility(8);
            if (p.o(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
                esActivity.p1().setLayoutManager(new GridLayoutManager(esActivity.k1(), 4));
                esActivity.p1().setAdapter(new r(enabledservice, esActivity.k1(), String.valueOf(esActivity.getIntent().getStringExtra("state_code"))));
                ArrayList arrayList = new ArrayList();
                int size = enabledservice.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(enabledservice.get(i10).getServCode());
                }
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(esActivity.getApplicationContext()).edit();
                edit.putString("enabledServiceList", new i7.d().t(arrayList));
                edit.commit();
                return;
            }
            esActivity.t1(enableServiceResponse.getStatusDesc());
        } catch (Exception unused) {
            esActivity.o1().setVisibility(8);
            esActivity.t1(esActivity.m1().b("no_details", esActivity.getString(R.string.no_Details_are_avail)));
        }
    }

    /* access modifiers changed from: private */
    public static final void s1(EsActivity esActivity, String str) {
        l.f(esActivity, "this$0");
        esActivity.o1().setVisibility(8);
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
        ((TextView) findViewById2).setOnClickListener(new la.d(dialog));
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

    public final void B1(ProgressBar progressBar) {
        l.f(progressBar, "<set-?>");
        this.N = progressBar;
    }

    public final void C1(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.I = recyclerView;
    }

    public final void D1(g gVar) {
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
        c cVar = this.O;
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

    public final ProgressBar o1() {
        ProgressBar progressBar = this.N;
        if (progressBar != null) {
            return progressBar;
        }
        l.v("pb_es");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_es);
        x1(this);
        D1(new g(k1()));
        z1(new c(k1()));
        this.H = ESInterface.f8381a.c(k1());
        View findViewById = findViewById(R.id.es_sarathi_recyclerView);
        l.e(findViewById, "findViewById(...)");
        C1((RecyclerView) findViewById);
        View findViewById2 = findViewById(R.id.lableService);
        l.e(findViewById2, "findViewById(...)");
        w1((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.nexgenarrow);
        l.e(findViewById3, "findViewById(...)");
        A1((LinearLayout) findViewById3);
        View findViewById4 = findViewById(R.id.pb_es);
        l.e(findViewById4, "findViewById(...)");
        B1((ProgressBar) findViewById4);
        View findViewById5 = findViewById(R.id.dl_related_service);
        l.e(findViewById5, "findViewById(...)");
        v1((TextView) findViewById5);
        j1().setText(m1().b("label_driving_licence_related", "Driving Licence Related Services"));
        n1().setOnClickListener(new a(this));
        ESInterface eSInterface = this.H;
        if (eSInterface == null) {
            l.v("mESInterface");
            eSInterface = null;
        }
        y1((b) new u0((x0) this, (u0.b) new qa.a(new oa.a(eSInterface))).a(b.class));
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            o1().setVisibility(0);
            l1().h(String.valueOf(getIntent().getStringExtra("state_code")));
        } else {
            o1().setVisibility(8);
            Toast.makeText(getApplicationContext(), m1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
        l1().n().g(this, new la.b(this));
        l1().q().g(this, new la.c(this));
    }

    public final RecyclerView p1() {
        RecyclerView recyclerView = this.I;
        if (recyclerView != null) {
            return recyclerView;
        }
        l.v("recyclerView");
        return null;
    }

    public final void v1(TextView textView) {
        l.f(textView, "<set-?>");
        this.P = textView;
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
        this.O = cVar;
    }
}
