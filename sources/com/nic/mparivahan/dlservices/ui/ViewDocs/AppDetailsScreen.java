package com.nic.mparivahan.dlservices.ui.ViewDocs;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.ApplStatusDetail;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.GetAppStatusMain;
import com.nic.mparivahan.Sarathithreeservices.network.GetApplStatusService;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import ld.c;
import ld.f;
import ni.k;
import oi.g;
import pl.x;
import v9.e;

public final class AppDetailsScreen extends g {
    /* access modifiers changed from: private */
    public String J;
    public k K;
    private String L;
    private String M;
    private String N = "";
    private hd.a O;
    public GetApplStatusService P;
    public f Q;
    private String R;
    private String S;
    public DlServiceInt T;
    private String U = "0";
    public c V;
    public f W;
    /* access modifiers changed from: private */
    public ProgressDialog X;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AppDetailsScreen f21872e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AppDetailsScreen appDetailsScreen) {
            super(1);
            this.f21872e = appDetailsScreen;
        }

        public final void b(GetAppStatusMain getAppStatusMain) {
            ProgressDialog y12 = this.f21872e.X;
            if (y12 == null) {
                cm.l.v("dialog");
                y12 = null;
            }
            y12.dismiss();
            try {
                if (!cm.l.a(getAppStatusMain.getStatus_code(), "00") || !cm.l.a(getAppStatusMain.getStatus_desc(), "Success")) {
                    this.f21872e.D1().f27046l.setVisibility(0);
                    this.f21872e.D1().f27047m.setVisibility(0);
                    AppDetailsScreen appDetailsScreen = this.f21872e;
                    appDetailsScreen.K1(appDetailsScreen, getAppStatusMain.getStatus_desc());
                    return;
                }
                this.f21872e.D1().f27046l.setVisibility(0);
                this.f21872e.D1().f27047m.setVisibility(0);
                List<ApplStatusDetail> applStatus_Details = getAppStatusMain.getApplStatus_Details();
                this.f21872e.D1().f27041g.setText(applStatus_Details.get(0).getApplno());
                this.f21872e.D1().f27037c.setText(applStatus_Details.get(0).getApplName());
                this.f21872e.D1().f27039e.setText(applStatus_Details.get(0).getDob());
                this.f21872e.D1().f27052r.setText(applStatus_Details.get(0).getRtoCd());
                this.f21872e.D1().f27050p.setText(applStatus_Details.get(0).getRtoName());
                Iterator<List<String>> it = applStatus_Details.get(0).getReqObjlst().iterator();
                if (it.hasNext()) {
                    List next = it.next();
                    MyTextView myTextView = this.f21872e.D1().f27044j;
                    myTextView.setText(((String) next.get(0)) + ".  " + ((String) next.get(1)));
                    this.f21872e.E1().r((String) next.get(1), "0000");
                    this.f21872e.D1().f27049o.setVisibility(8);
                    if (next.size() >= 3) {
                        this.f21872e.J = (String) next.get(3);
                    }
                }
            } catch (Exception unused) {
                this.f21872e.D1().f27046l.setVisibility(8);
                this.f21872e.D1().f27047m.setVisibility(8);
                AppDetailsScreen appDetailsScreen2 = this.f21872e;
                appDetailsScreen2.K1(appDetailsScreen2, appDetailsScreen2.C1().b("service_is_not_present", this.f21872e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetAppStatusMain) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21873a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f21873a = lVar;
        }

        public final pl.c a() {
            return this.f21873a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21873a.invoke(obj);
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

    private final void B1() {
        hd.a aVar = null;
        if (dd.a.f9964a.a(this)) {
            ProgressDialog progressDialog = this.X;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            hd.a aVar2 = this.O;
            if (aVar2 == null) {
                cm.l.v("appStatusVM");
                aVar2 = null;
            }
            String str = this.L;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            String str2 = this.S;
            if (str2 == null) {
                cm.l.v("format_date");
                str2 = null;
            }
            aVar2.h(this, str, str2);
        } else {
            K1(this, C1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)));
        }
        hd.a aVar3 = this.O;
        if (aVar3 == null) {
            cm.l.v("appStatusVM");
        } else {
            aVar = aVar3;
        }
        aVar.k().g(this, new b(new a(this)));
    }

    private final void G1() {
        String stringExtra;
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.X = progressDialog;
        progressDialog.setMessage(C1().b("label_challan_please_wait", "Please wait..."));
        Q1(new f(this));
        D1().f27045k.f28452f.setText(E1().i());
        Intent intent = getIntent();
        if (intent != null) {
            try {
                String stringExtra2 = intent.getStringExtra("app_no");
                cm.l.d(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.L = stringExtra2;
                String stringExtra3 = intent.getStringExtra("stateCode");
                cm.l.d(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.M = stringExtra3;
                if (intent.getStringExtra("statusAdapter") != null) {
                    String stringExtra4 = intent.getStringExtra("statusAdapter");
                    cm.l.d(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                    this.U = stringExtra4;
                }
                if (this.U.equals("1")) {
                    String stringExtra5 = intent.getStringExtra("dob");
                    cm.l.d(stringExtra5, "null cannot be cast to non-null type kotlin.String");
                    this.N = stringExtra5;
                    stringExtra = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(this.N));
                    cm.l.e(stringExtra, "format(...)");
                } else {
                    stringExtra = intent.getStringExtra("dob");
                    cm.l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                }
                this.N = stringExtra;
            } catch (Exception e10) {
                Log.d("errors", e10.getLocalizedMessage());
            }
        }
        try {
            this.O = (hd.a) new u0((x0) this, (u0.b) new hd.b(new ed.a(A1()))).a(hd.a.class);
            R1(new f(this));
            this.R = F1().i();
            AppCompatTextView appCompatTextView = D1().f27054t;
            String str = this.R;
            String str2 = null;
            if (str == null) {
                cm.l.v("title_name");
                str = null;
            }
            appCompatTextView.setText(str);
            String str3 = this.L;
            if (str3 == null) {
                cm.l.v("app_no");
            } else {
                str2 = str3;
            }
            if (str2.length() <= 0) {
                if (this.N.length() <= 0) {
                    return;
                }
            }
            String format = new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd-MM-yyyy").parse(this.N));
            cm.l.e(format, "format(...)");
            this.S = format;
            B1();
        } catch (Exception e11) {
            Log.d("errors1", e11.getLocalizedMessage());
        }
    }

    private final void H1() {
        D1().f27043i.setOnClickListener(new ej.b(this));
        D1().f27042h.setOnClickListener(new ej.c(this));
    }

    /* access modifiers changed from: private */
    public static final void I1(AppDetailsScreen appDetailsScreen, View view) {
        cm.l.f(appDetailsScreen, "this$0");
        Intent intent = new Intent(appDetailsScreen, ViewDocScreen.class);
        String str = appDetailsScreen.L;
        String str2 = null;
        if (str == null) {
            cm.l.v("app_no");
            str = null;
        }
        intent.putExtra("app_no", str);
        intent.putExtra("dob", appDetailsScreen.N);
        String str3 = appDetailsScreen.M;
        if (str3 == null) {
            cm.l.v("stateCode");
        } else {
            str2 = str3;
        }
        intent.putExtra("stateCode", str2);
        appDetailsScreen.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void J1(AppDetailsScreen appDetailsScreen, View view) {
        cm.l.f(appDetailsScreen, "this$0");
        appDetailsScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void L1(Dialog dialog, AppDetailsScreen appDetailsScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(appDetailsScreen, "this$0");
        dialog.dismiss();
        appDetailsScreen.finish();
    }

    public final GetApplStatusService A1() {
        GetApplStatusService getApplStatusService = this.P;
        if (getApplStatusService != null) {
            return getApplStatusService;
        }
        cm.l.v("appInfoService");
        return null;
    }

    public final c C1() {
        c cVar = this.V;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final k D1() {
        k kVar = this.K;
        if (kVar != null) {
            return kVar;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final f E1() {
        f fVar = this.W;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final f F1() {
        f fVar = this.Q;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final void K1(Context context, String str) {
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
        ((TextView) findViewById3).setText(C1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(C1().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new ej.a(dialog, this));
        dialog.show();
    }

    public final void M1(GetApplStatusService getApplStatusService) {
        cm.l.f(getApplStatusService, "<set-?>");
        this.P = getApplStatusService;
    }

    public final void N1(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.V = cVar;
    }

    public final void O1(k kVar) {
        cm.l.f(kVar, "<set-?>");
        this.K = kVar;
    }

    public final void P1(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.T = dlServiceInt;
    }

    public final void Q1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.W = fVar;
    }

    public final void R1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.Q = fVar;
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k c10 = k.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        O1(c10);
        setContentView((View) D1().b());
        N1(new c(this));
        P1(DlServiceInt.f21675a.a(this));
        M1(GetApplStatusService.f9545a.a(this));
        G1();
        H1();
        e.f17509a.l(this, D1());
    }
}
