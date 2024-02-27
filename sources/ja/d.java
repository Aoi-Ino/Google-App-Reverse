package ja;

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
import androidx.appcompat.widget.AppCompatImageView;
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
import ld.g;
import m8.k;
import ra.c;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import v9.f;

public final class d extends RecyclerView.h {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f12779d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f12780e;

    /* renamed from: f  reason: collision with root package name */
    private final zc.b f12781f;

    /* renamed from: g  reason: collision with root package name */
    private final c f12782g;

    /* renamed from: h  reason: collision with root package name */
    private final ra.d f12783h;

    /* renamed from: i  reason: collision with root package name */
    public RcService f12784i;

    /* renamed from: j  reason: collision with root package name */
    private DatabaseHelper f12785j;

    /* renamed from: k  reason: collision with root package name */
    private g f12786k;

    public static final class a extends RecyclerView.d0 {
        private final TextView A;
        private ProgressBar B;
        private TextView C;
        private AppCompatImageView D;
        private AppCompatImageView E;
        private TextView F;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f12787y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f12788z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.vehicle_text_alerts);
            l.e(findViewById, "findViewById(...)");
            this.f12787y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.insurance_layout);
            l.e(findViewById2, "findViewById(...)");
            this.f12788z = (LinearLayout) findViewById2;
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
            this.D = (AppCompatImageView) findViewById6;
            View findViewById7 = this.f3622e.findViewById(R.id.refresh);
            l.e(findViewById7, "findViewById(...)");
            this.E = (AppCompatImageView) findViewById7;
            View findViewById8 = this.f3622e.findViewById(R.id.notify);
            l.e(findViewById8, "findViewById(...)");
            this.F = (TextView) findViewById8;
        }

        public final TextView O() {
            return this.A;
        }

        public final LinearLayout P() {
            return this.f12788z;
        }

        public final TextView Q() {
            return this.F;
        }

        public final ProgressBar R() {
            return this.B;
        }

        public final AppCompatImageView S() {
            return this.E;
        }

        public final TextView T() {
            return this.C;
        }

        public final TextView U() {
            return this.f12787y;
        }

        public final AppCompatImageView V() {
            return this.D;
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f12789a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f12790b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f12791c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f12792d;

        b(a aVar, u uVar, d dVar, int i10) {
            this.f12789a = aVar;
            this.f12790b = uVar;
            this.f12791c = dVar;
            this.f12792d = i10;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f12789a.R().setVisibility(8);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            k.a aVar;
            String str;
            String str2;
            this.f12789a.R().setVisibility(8);
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
                str = (String) this.f12790b.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = k.f13877a;
                str = (String) this.f12790b.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), RcModelsDet.class);
            l.e(j10, "fromJson(...)");
            RcModelsDet rcModelsDet = (RcModelsDet) j10;
            if (p.o(rcModelsDet.getStatusCode(), "NP001", true) && this.f12791c.E().R0(q.B0(((Document) this.f12791c.f12779d.get(this.f12792d)).getRc()).toString(), rcModelsDet.getNrvDetails()) > 0) {
                this.f12791c.k(this.f12792d);
            }
        }
    }

    public d(ArrayList arrayList, Context context, zc.b bVar, c cVar, ra.d dVar) {
        l.f(arrayList, "rc_details");
        l.f(context, "context");
        l.f(bVar, "deletMyRcRcDeletListner");
        l.f(cVar, "updateDashboardRc");
        l.f(dVar, "updte");
        this.f12779d = arrayList;
        this.f12780e = context;
        this.f12781f = bVar;
        this.f12782g = cVar;
        this.f12783h = dVar;
        this.f12785j = DatabaseHelper.A0(context);
        this.f12786k = new g(context);
    }

    /* access modifiers changed from: private */
    public static final void H(d dVar, u uVar, View view) {
        l.f(dVar, "this$0");
        l.f(uVar, "$rc_details_db");
        Intent intent = new Intent(dVar.f12780e, DashBoardAlertViewDetails.class);
        NrvDetails nrvDetails = (NrvDetails) uVar.f20234e;
        intent.putExtra("RcNumber", nrvDetails != null ? nrvDetails.getRc_regn_no() : null);
        dVar.f12780e.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void I(a aVar, d dVar, u uVar, int i10, View view) {
        l.f(aVar, "$holder");
        l.f(dVar, "this$0");
        l.f(uVar, "$rc_details_db");
        aVar.R().setVisibility(0);
        ra.d dVar2 = dVar.f12783h;
        NrvDetails nrvDetails = (NrvDetails) uVar.f20234e;
        dVar2.f(String.valueOf(nrvDetails != null ? nrvDetails.getRc_regn_no() : null), Integer.valueOf(i10));
    }

    public final void D(String str, TextView textView) {
        l.f(str, "change_color");
        l.f(textView, "textView");
        if (q.D(str, "Expired", true) || q.D(str, "पर समाप्त", true)) {
            textView.setTextColor(androidx.core.content.a.c(this.f12780e, R.color.danger));
        }
        if (q.D(str, "Expiring", true)) {
            textView.setTextColor(androidx.core.content.a.c(this.f12780e, R.color.vehicle_fit));
        }
    }

    public final DatabaseHelper E() {
        return this.f12785j;
    }

    public final RcService F() {
        RcService rcService = this.f12784i;
        if (rcService != null) {
            return rcService;
        }
        l.v("rcService");
        return null;
    }

    /* renamed from: G */
    public void p(a aVar, int i10) {
        String d10;
        TextView O;
        TextView O2;
        l.f(aVar, "holder");
        try {
            ld.c cVar = new ld.c(this.f12780e);
            aVar.R().setVisibility(8);
            NrvDetails G0 = this.f12785j.G0(((Document) this.f12779d.get(i10)).getRc());
            aVar.Q().setText(cVar.b("tap_notify", "We will notify you 30 days before the any validity expiry."));
            c.a aVar2 = ka.c.f13158a;
            if (aVar2.m(((Document) this.f12779d.get(i10)).getRc()) || G0 != null) {
                u uVar = new u();
                uVar.f20234e = this.f12785j.G0(((Document) this.f12779d.get(i10)).getRc());
                TextView U = aVar.U();
                NrvDetails nrvDetails = (NrvDetails) uVar.f20234e;
                String str = null;
                U.setText(String.valueOf(nrvDetails != null ? nrvDetails.getRc_regn_no() : null));
                NrvDetails nrvDetails2 = (NrvDetails) uVar.f20234e;
                if (aVar2.n(String.valueOf(nrvDetails2 != null ? nrvDetails2.getRc_insurance_upto() : null))) {
                    NrvDetails nrvDetails3 = (NrvDetails) uVar.f20234e;
                    if (aVar2.f(String.valueOf(nrvDetails3 != null ? nrvDetails3.getRc_insurance_upto() : null))) {
                        Log.e("Test", "1");
                        aVar.P().setVisibility(0);
                        aVar.T().setText(cVar.b(f.f17510a.C(), "Insurance"));
                        Context context = this.f12780e;
                        NrvDetails nrvDetails4 = (NrvDetails) uVar.f20234e;
                        if (nrvDetails4 != null) {
                            str = nrvDetails4.getRc_insurance_upto();
                        }
                        d10 = aVar2.d(context, String.valueOf(str), " ");
                        if (p.q(d10)) {
                            O2 = aVar.O();
                            O2.setText("");
                            aVar.V().setOnClickListener(new b(this, uVar));
                            aVar.S().setOnClickListener(new c(aVar, this, uVar, i10));
                            return;
                        }
                        aVar.O().setText(d10);
                        O = aVar.O();
                        D(d10, O);
                        aVar.V().setOnClickListener(new b(this, uVar));
                        aVar.S().setOnClickListener(new c(aVar, this, uVar, i10));
                        return;
                    }
                }
                NrvDetails nrvDetails5 = (NrvDetails) uVar.f20234e;
                if (aVar2.n(String.valueOf(nrvDetails5 != null ? nrvDetails5.getRc_pucc_upto() : null))) {
                    NrvDetails nrvDetails6 = (NrvDetails) uVar.f20234e;
                    if (aVar2.f(String.valueOf(nrvDetails6 != null ? nrvDetails6.getRc_pucc_upto() : null))) {
                        Context context2 = this.f12780e;
                        NrvDetails nrvDetails7 = (NrvDetails) uVar.f20234e;
                        if (nrvDetails7 != null) {
                            str = nrvDetails7.getRc_pucc_upto();
                        }
                        String d11 = aVar2.d(context2, String.valueOf(str), " ");
                        Log.e("Test", "2");
                        aVar.T().setText(cVar.b(f.f17510a.f0(), "PUCC"));
                        if (p.q(d11)) {
                            O2 = aVar.O();
                            O2.setText("");
                            aVar.V().setOnClickListener(new b(this, uVar));
                            aVar.S().setOnClickListener(new c(aVar, this, uVar, i10));
                            return;
                        }
                        aVar.O().setText(d11);
                        D(d11, aVar.O());
                        aVar.V().setOnClickListener(new b(this, uVar));
                        aVar.S().setOnClickListener(new c(aVar, this, uVar, i10));
                        return;
                    }
                }
                NrvDetails nrvDetails8 = (NrvDetails) uVar.f20234e;
                if (aVar2.n(String.valueOf(nrvDetails8 != null ? nrvDetails8.getRc_tax_upto() : null))) {
                    NrvDetails nrvDetails9 = (NrvDetails) uVar.f20234e;
                    if (aVar2.f(String.valueOf(nrvDetails9 != null ? nrvDetails9.getRc_tax_upto() : null))) {
                        Log.e("Test", VContant.DUPLICATE_RC_PURPOSE_CODE);
                        aVar.T().setText(cVar.b(f.f17510a.K(), "MV Tax"));
                        Context context3 = this.f12780e;
                        NrvDetails nrvDetails10 = (NrvDetails) uVar.f20234e;
                        if (nrvDetails10 != null) {
                            str = nrvDetails10.getRc_tax_upto();
                        }
                        d10 = aVar2.d(context3, String.valueOf(str), " ");
                        if (p.q(d10)) {
                            O2 = aVar.O();
                            O2.setText("");
                            aVar.V().setOnClickListener(new b(this, uVar));
                            aVar.S().setOnClickListener(new c(aVar, this, uVar, i10));
                            return;
                        }
                        aVar.O().setText(d10);
                        O = aVar.O();
                        D(d10, O);
                        aVar.V().setOnClickListener(new b(this, uVar));
                        aVar.S().setOnClickListener(new c(aVar, this, uVar, i10));
                        return;
                    }
                }
                NrvDetails nrvDetails11 = (NrvDetails) uVar.f20234e;
                if (aVar2.n(String.valueOf(nrvDetails11 != null ? nrvDetails11.getRc_permit_valid_upto() : null))) {
                    NrvDetails nrvDetails12 = (NrvDetails) uVar.f20234e;
                    if (aVar2.f(String.valueOf(nrvDetails12 != null ? nrvDetails12.getRc_permit_valid_upto() : null))) {
                        Log.e("Test", VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE);
                        aVar.T().setText("Permit");
                        Context context4 = this.f12780e;
                        NrvDetails nrvDetails13 = (NrvDetails) uVar.f20234e;
                        if (nrvDetails13 != null) {
                            str = nrvDetails13.getRc_permit_valid_upto();
                        }
                        d10 = aVar2.d(context4, String.valueOf(str), " ");
                        if (p.q(d10)) {
                            O2 = aVar.O();
                            O2.setText("");
                            aVar.V().setOnClickListener(new b(this, uVar));
                            aVar.S().setOnClickListener(new c(aVar, this, uVar, i10));
                            return;
                        }
                        aVar.O().setText(d10);
                        O = aVar.O();
                        D(d10, O);
                        aVar.V().setOnClickListener(new b(this, uVar));
                        aVar.S().setOnClickListener(new c(aVar, this, uVar, i10));
                        return;
                    }
                }
                NrvDetails nrvDetails14 = (NrvDetails) uVar.f20234e;
                if (aVar2.n(String.valueOf(nrvDetails14 != null ? nrvDetails14.getRc_np_upto() : null))) {
                    NrvDetails nrvDetails15 = (NrvDetails) uVar.f20234e;
                    if (aVar2.f(String.valueOf(nrvDetails15 != null ? nrvDetails15.getRc_np_upto() : null))) {
                        aVar.T().setText(cVar.b(f.f17510a.M(), "National Permit"));
                        Log.e("Test", VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
                        Context context5 = this.f12780e;
                        NrvDetails nrvDetails16 = (NrvDetails) uVar.f20234e;
                        if (nrvDetails16 != null) {
                            str = nrvDetails16.getRc_np_upto();
                        }
                        d10 = aVar2.d(context5, String.valueOf(str), " ");
                        if (p.q(d10)) {
                            O2 = aVar.O();
                            O2.setText("");
                        } else {
                            aVar.O().setText(d10);
                            O = aVar.O();
                            D(d10, O);
                        }
                    }
                }
                aVar.V().setOnClickListener(new b(this, uVar));
                aVar.S().setOnClickListener(new c(aVar, this, uVar, i10));
                return;
            }
            aVar.P().setVisibility(8);
            aVar.R().setVisibility(0);
            String string = Settings.Secure.getString(this.f12780e.getContentResolver(), "android_id");
            g gVar = new g(this.f12780e);
            String s02 = this.f12785j.s0(q.B0(((Document) this.f12779d.get(i10)).getRc()).toString());
            c0.a aVar3 = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            a.C0008a aVar4 = ad.a.f400a;
            String k10 = this.f12786k.k();
            l.c(s02);
            l.c(string);
            String jSONObject = aVar4.f(k10, s02, string, gVar.l().toString(), gVar.e()).toString();
            l.e(jSONObject, "toString(...)");
            c0 f10 = aVar3.f(b10, jSONObject);
            K(RcService.f9484a.c(this.f12780e));
            u uVar2 = new u();
            uVar2.f20234e = String.valueOf(System.currentTimeMillis());
            F().UpdateVirtualRC(f10, (String) uVar2.f20234e).enqueue(new b(aVar, uVar2, this, i10));
        } catch (Exception e10) {
            Log.e("AdapterEoor", e10.toString());
        }
    }

    /* renamed from: J */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        if (this.f12779d.size() > 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_alerts, viewGroup, false);
            l.c(inflate);
            return new a(inflate);
        } else if (this.f12785j.c0() != null) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_alerts, viewGroup, false);
            l.c(inflate2);
            return new a(inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_alert_single, viewGroup, false);
            l.c(inflate3);
            return new a(inflate3);
        }
    }

    public final void K(RcService rcService) {
        l.f(rcService, "<set-?>");
        this.f12784i = rcService;
    }

    public int e() {
        return this.f12779d.size();
    }
}
