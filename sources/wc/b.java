package wc;

import ad.a;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.u;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.DashBoardAlertViewDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.Document;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import j$.util.Base64;
import java.util.ArrayList;
import ka.c;
import km.d;
import ld.g;
import m8.k;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class b extends RecyclerView.h {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f17996d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f17997e;

    /* renamed from: f  reason: collision with root package name */
    public RcService f17998f;

    /* renamed from: g  reason: collision with root package name */
    private DatabaseHelper f17999g;

    /* renamed from: h  reason: collision with root package name */
    private g f18000h;

    public static final class a extends RecyclerView.d0 {
        private final TextView A;
        private ProgressBar B;
        private TextView C;
        private TextView D;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f18001y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f18002z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.vehicle_text_alerts);
            l.e(findViewById, "findViewById(...)");
            this.f18001y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.insurance_layout);
            l.e(findViewById2, "findViewById(...)");
            this.f18002z = (LinearLayout) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.expire_insurance);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.progress_bar);
            l.e(findViewById4, "findViewById(...)");
            this.B = (ProgressBar) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.service_name);
            l.e(findViewById5, "findViewById(...)");
            this.C = (TextView) findViewById5;
            View findViewById6 = this.f3622e.findViewById(R.id.viewmore);
            l.e(findViewById6, "findViewById(...)");
            this.D = (TextView) findViewById6;
        }

        public final TextView O() {
            return this.A;
        }

        public final LinearLayout P() {
            return this.f18002z;
        }

        public final ProgressBar Q() {
            return this.B;
        }

        public final TextView R() {
            return this.C;
        }

        public final TextView S() {
            return this.f18001y;
        }

        public final TextView T() {
            return this.D;
        }
    }

    /* renamed from: wc.b$b  reason: collision with other inner class name */
    public static final class C0235b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f18003a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f18004b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f18005c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f18006d;

        C0235b(a aVar, u uVar, b bVar, int i10) {
            this.f18003a = aVar;
            this.f18004b = uVar;
            this.f18005c = bVar;
            this.f18006d = i10;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f18003a.Q().setVisibility(8);
            Log.e("Error -- >001", String.valueOf(th2 != null ? th2.getMessage() : null));
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            k.a aVar;
            String str;
            String str2;
            this.f18003a.Q().setVisibility(8);
            String str3 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = k.f13877a;
                str = (String) this.f18004b.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = k.f13877a;
                str = (String) this.f18004b.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), RcModelsDet.class);
            l.e(j10, "fromJson(...)");
            RcModelsDet rcModelsDet = (RcModelsDet) j10;
            if (p.o(rcModelsDet.getStatusCode(), "NP001", true) && this.f18005c.D().R0(q.B0(((Document) this.f18005c.f17996d.get(this.f18006d)).getRc()).toString(), rcModelsDet.getNrvDetails()) > 0) {
                this.f18005c.k(this.f18006d);
            }
        }
    }

    public b(ArrayList arrayList, Context context) {
        l.f(arrayList, "rc_details");
        l.f(context, "context");
        this.f17996d = arrayList;
        this.f17997e = context;
        this.f17999g = DatabaseHelper.A0(context);
        this.f18000h = new g(context);
    }

    /* access modifiers changed from: private */
    public static final void G(b bVar, u uVar, View view) {
        l.f(bVar, "this$0");
        l.f(uVar, "$rc_details_db");
        Intent intent = new Intent(bVar.f17997e, DashBoardAlertViewDetails.class);
        NrvDetails nrvDetails = (NrvDetails) uVar.f20234e;
        intent.putExtra("RcNumber", nrvDetails != null ? nrvDetails.getRc_regn_no() : null);
        bVar.f17997e.startActivity(intent);
    }

    public final void C(String str, TextView textView) {
        l.f(str, "change_color");
        l.f(textView, "textView");
        if (q.D(str, "Expired", true)) {
            textView.setTextColor(androidx.core.content.a.c(this.f17997e, R.color.danger));
        }
        if (q.D(str, "Expiring", true)) {
            textView.setTextColor(androidx.core.content.a.c(this.f17997e, R.color.vehicle_fit));
        }
    }

    public final DatabaseHelper D() {
        return this.f17999g;
    }

    public final RcService E() {
        RcService rcService = this.f17998f;
        if (rcService != null) {
            return rcService;
        }
        l.v("rcService");
        return null;
    }

    /* renamed from: F */
    public void p(a aVar, int i10) {
        String d10;
        TextView O;
        TextView O2;
        l.f(aVar, "holder");
        try {
            NrvDetails G0 = this.f17999g.G0(((Document) this.f17996d.get(i10)).getRc());
            c.a aVar2 = c.f13158a;
            if (aVar2.m(((Document) this.f17996d.get(i10)).getRc()) || G0 != null) {
                u uVar = new u();
                uVar.f20234e = this.f17999g.G0(((Document) this.f17996d.get(i10)).getRc());
                TextView S = aVar.S();
                NrvDetails nrvDetails = (NrvDetails) uVar.f20234e;
                String str = null;
                S.setText(String.valueOf(nrvDetails != null ? nrvDetails.getRc_regn_no() : null));
                NrvDetails nrvDetails2 = (NrvDetails) uVar.f20234e;
                if (aVar2.n(String.valueOf(nrvDetails2 != null ? nrvDetails2.getRc_insurance_upto() : null))) {
                    NrvDetails nrvDetails3 = (NrvDetails) uVar.f20234e;
                    if (aVar2.f(String.valueOf(nrvDetails3 != null ? nrvDetails3.getRc_insurance_upto() : null))) {
                        Log.e("Test", "1");
                        aVar.P().setVisibility(0);
                        aVar.R().setText("Insurance");
                        Context context = this.f17997e;
                        NrvDetails nrvDetails4 = (NrvDetails) uVar.f20234e;
                        if (nrvDetails4 != null) {
                            str = nrvDetails4.getRc_insurance_upto();
                        }
                        String d11 = aVar2.d(context, String.valueOf(str), " ");
                        if (p.q(d11)) {
                            O2 = aVar.O();
                            O2.setText("");
                            aVar.T().setOnClickListener(new a(this, uVar));
                            return;
                        }
                        aVar.O().setText(d11);
                        C(d11, aVar.O());
                        aVar.T().setOnClickListener(new a(this, uVar));
                        return;
                    }
                }
                NrvDetails nrvDetails5 = (NrvDetails) uVar.f20234e;
                if (aVar2.n(String.valueOf(nrvDetails5 != null ? nrvDetails5.getRc_pucc_upto() : null))) {
                    NrvDetails nrvDetails6 = (NrvDetails) uVar.f20234e;
                    if (aVar2.f(String.valueOf(nrvDetails6 != null ? nrvDetails6.getRc_pucc_upto() : null))) {
                        Context context2 = this.f17997e;
                        NrvDetails nrvDetails7 = (NrvDetails) uVar.f20234e;
                        if (nrvDetails7 != null) {
                            str = nrvDetails7.getRc_pucc_upto();
                        }
                        d10 = aVar2.d(context2, String.valueOf(str), " ");
                        Log.e("Test", "2");
                        aVar.R().setText("PUCC");
                        if (!p.q(d10)) {
                            O = aVar.O();
                            O.setText(d10);
                        }
                        aVar.T().setOnClickListener(new a(this, uVar));
                        return;
                    }
                }
                NrvDetails nrvDetails8 = (NrvDetails) uVar.f20234e;
                if (aVar2.n(String.valueOf(nrvDetails8 != null ? nrvDetails8.getRc_tax_upto() : null))) {
                    NrvDetails nrvDetails9 = (NrvDetails) uVar.f20234e;
                    if (aVar2.f(String.valueOf(nrvDetails9 != null ? nrvDetails9.getRc_tax_upto() : null))) {
                        aVar.R().setText("MV Tax");
                        Context context3 = this.f17997e;
                        NrvDetails nrvDetails10 = (NrvDetails) uVar.f20234e;
                        if (nrvDetails10 != null) {
                            str = nrvDetails10.getRc_tax_upto();
                        }
                        d10 = aVar2.d(context3, String.valueOf(str), " ");
                        if (!p.q(d10)) {
                            O = aVar.O();
                            O.setText(d10);
                        }
                        aVar.T().setOnClickListener(new a(this, uVar));
                        return;
                    }
                }
                NrvDetails nrvDetails11 = (NrvDetails) uVar.f20234e;
                if (aVar2.n(String.valueOf(nrvDetails11 != null ? nrvDetails11.getRc_permit_valid_upto() : null))) {
                    NrvDetails nrvDetails12 = (NrvDetails) uVar.f20234e;
                    if (aVar2.f(String.valueOf(nrvDetails12 != null ? nrvDetails12.getRc_permit_valid_upto() : null))) {
                        Log.e("Test", VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE);
                        aVar.R().setText("Permit");
                        Context context4 = this.f17997e;
                        NrvDetails nrvDetails13 = (NrvDetails) uVar.f20234e;
                        if (nrvDetails13 != null) {
                            str = nrvDetails13.getRc_permit_valid_upto();
                        }
                        d10 = aVar2.d(context4, String.valueOf(str), " ");
                        if (p.q(d10)) {
                            O2 = aVar.O();
                            O2.setText("");
                            aVar.T().setOnClickListener(new a(this, uVar));
                            return;
                        }
                        O = aVar.O();
                        O.setText(d10);
                        aVar.T().setOnClickListener(new a(this, uVar));
                        return;
                    }
                }
                NrvDetails nrvDetails14 = (NrvDetails) uVar.f20234e;
                if (aVar2.n(String.valueOf(nrvDetails14 != null ? nrvDetails14.getRc_np_upto() : null))) {
                    NrvDetails nrvDetails15 = (NrvDetails) uVar.f20234e;
                    if (aVar2.f(String.valueOf(nrvDetails15 != null ? nrvDetails15.getRc_np_upto() : null))) {
                        aVar.R().setText("National Permit");
                        Log.e("Test", VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
                        Context context5 = this.f17997e;
                        NrvDetails nrvDetails16 = (NrvDetails) uVar.f20234e;
                        if (nrvDetails16 != null) {
                            str = nrvDetails16.getRc_np_upto();
                        }
                        d10 = aVar2.d(context5, String.valueOf(str), " ");
                        if (p.q(d10)) {
                            O2 = aVar.O();
                            O2.setText("");
                        } else {
                            O = aVar.O();
                            O.setText(d10);
                        }
                    }
                }
                aVar.T().setOnClickListener(new a(this, uVar));
                return;
            }
            aVar.P().setVisibility(8);
            aVar.Q().setVisibility(0);
            String s02 = this.f17999g.s0(q.B0(((Document) this.f17996d.get(i10)).getRc()).toString());
            String string = Settings.Secure.getString(this.f17997e.getContentResolver(), "android_id");
            c0.a aVar3 = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            a.C0008a aVar4 = ad.a.f400a;
            String k10 = this.f18000h.k();
            l.c(s02);
            l.c(string);
            String jSONObject = aVar4.f(k10, s02, string, this.f18000h.l(), this.f18000h.e()).toString();
            l.e(jSONObject, "toString(...)");
            c0 f10 = aVar3.f(b10, jSONObject);
            I(RcService.f9484a.c(this.f17997e));
            u uVar2 = new u();
            uVar2.f20234e = String.valueOf(System.currentTimeMillis());
            E().UpdateVirtualRC(f10, (String) uVar2.f20234e).enqueue(new C0235b(aVar, uVar2, this, i10));
        } catch (Exception e10) {
            Log.e("AdapterEoor", e10.toString());
        }
    }

    /* renamed from: H */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        if (this.f17996d.size() > 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_alerts, viewGroup, false);
            l.c(inflate);
            return new a(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_alert_single, viewGroup, false);
        l.c(inflate2);
        return new a(inflate2);
    }

    public final void I(RcService rcService) {
        l.f(rcService, "<set-?>");
        this.f17998f = rcService;
    }

    public int e() {
        return this.f17996d.size();
    }
}
