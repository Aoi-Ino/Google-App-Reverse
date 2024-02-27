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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.u;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.Document;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.RC.VirtualRcScreen;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import java.util.ArrayList;
import km.d;
import ld.g;
import m8.k;
import ra.c;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class f extends RecyclerView.h {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f18024d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f18025e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final c f18026f;

    /* renamed from: g  reason: collision with root package name */
    public RcService f18027g;

    /* renamed from: h  reason: collision with root package name */
    private DatabaseHelper f18028h;

    /* renamed from: i  reason: collision with root package name */
    private g f18029i;

    public static final class a extends RecyclerView.d0 {
        private final LinearLayout A;
        private ProgressBar B;
        private ImageView C;
        private TextView D;
        private TextView E;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f18030y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f18031z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.rc_number);
            l.e(findViewById, "findViewById(...)");
            this.f18030y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.linear_parent);
            l.e(findViewById2, "findViewById(...)");
            this.f18031z = (LinearLayout) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.delet_icon);
            l.e(findViewById3, "findViewById(...)");
            this.A = (LinearLayout) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.progress_bar);
            l.e(findViewById4, "findViewById(...)");
            this.B = (ProgressBar) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.refresh);
            l.e(findViewById5, "findViewById(...)");
            this.C = (ImageView) findViewById5;
            View findViewById6 = this.f3622e.findViewById(R.id.viewdetails);
            l.e(findViewById6, "findViewById(...)");
            this.D = (TextView) findViewById6;
            View findViewById7 = this.f3622e.findViewById(R.id.tv_vehicle_no);
            l.e(findViewById7, "findViewById(...)");
            this.E = (TextView) findViewById7;
        }

        public final LinearLayout O() {
            return this.A;
        }

        public final LinearLayout P() {
            return this.f18031z;
        }

        public final ProgressBar Q() {
            return this.B;
        }

        public final TextView R() {
            return this.f18030y;
        }

        public final ImageView S() {
            return this.C;
        }

        public final TextView T() {
            return this.E;
        }

        public final TextView U() {
            return this.D;
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f18032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f18033b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f18034c;

        b(u uVar, f fVar, int i10) {
            this.f18032a = uVar;
            this.f18033b = fVar;
            this.f18034c = i10;
        }

        public void onFailure(Call call, Throwable th2) {
            Log.e("Error -- >001", String.valueOf(th2 != null ? th2.getMessage() : null));
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
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
                k.a aVar = k.f13877a;
                String str2 = (String) this.f18032a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f18032a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), RcModelsDet.class);
            l.e(j10, "fromJson(...)");
            RcModelsDet rcModelsDet = (RcModelsDet) j10;
            if (p.o(rcModelsDet.getStatusCode(), "NP001", true) && this.f18033b.F().R0(q.B0(((Document) this.f18033b.f18024d.get(this.f18034c)).getRc()).toString(), rcModelsDet.getNrvDetails()) > 0) {
                this.f18033b.k(this.f18034c);
                this.f18033b.f18026f.b0(Integer.valueOf(this.f18034c));
            }
        }
    }

    public f(ArrayList arrayList, Context context, ra.c cVar) {
        l.f(arrayList, "rc_details");
        l.f(context, "context");
        l.f(cVar, "updateDashboardRc");
        this.f18024d = arrayList;
        this.f18025e = context;
        this.f18026f = cVar;
        this.f18028h = DatabaseHelper.A0(context);
        this.f18029i = new g(context);
    }

    /* access modifiers changed from: private */
    public static final void I(f fVar, u uVar, View view) {
        l.f(fVar, "this$0");
        l.f(uVar, "$rc_numer");
        Intent intent = new Intent(fVar.f18025e, VirtualRcScreen.class);
        intent.putExtra("RcNumber", (String) uVar.f20234e);
        fVar.f18025e.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void J(f fVar, u uVar, int i10, View view) {
        l.f(fVar, "this$0");
        l.f(uVar, "$rc_numer");
        fVar.f18026f.y((String) uVar.f20234e, i10);
    }

    /* access modifiers changed from: private */
    public static final void K(a aVar, f fVar, u uVar, int i10, View view) {
        l.f(aVar, "$holder");
        l.f(fVar, "this$0");
        l.f(uVar, "$rc_details_db");
        aVar.Q().setVisibility(0);
        ra.c cVar = fVar.f18026f;
        NrvDetails nrvDetails = (NrvDetails) uVar.f20234e;
        cVar.f(String.valueOf(nrvDetails != null ? nrvDetails.getRc_regn_no() : null), Integer.valueOf(i10));
    }

    public final DatabaseHelper F() {
        return this.f18028h;
    }

    public final RcService G() {
        RcService rcService = this.f18027g;
        if (rcService != null) {
            return rcService;
        }
        l.v("rcService");
        return null;
    }

    /* renamed from: H */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        try {
            ld.c cVar = new ld.c(this.f18025e);
            aVar.T().setText(cVar.b("label_challan_vehicle_no", "Vehicle No"));
            aVar.Q().setVisibility(8);
            u uVar = new u();
            uVar.f20234e = ((Document) this.f18024d.get(i10)).getRc();
            u uVar2 = new u();
            uVar2.f20234e = this.f18028h.G0((String) uVar.f20234e);
            Object obj = uVar.f20234e;
            if (obj != null && (!p.q((CharSequence) obj))) {
                aVar.R().setText(((Document) this.f18024d.get(i10)).getRc());
                aVar.U().setText(cVar.b(v9.f.f17510a.F(), "View Virtual RC"));
            }
            Object obj2 = uVar2.f20234e;
            if (obj2 != null) {
                NrvDetails nrvDetails = (NrvDetails) obj2;
                if (nrvDetails != null) {
                    nrvDetails.getRc_owner_name();
                }
                NrvDetails nrvDetails2 = (NrvDetails) uVar2.f20234e;
                if (nrvDetails2 != null) {
                    nrvDetails2.getRc_present_address();
                }
                NrvDetails nrvDetails3 = (NrvDetails) uVar2.f20234e;
                if (nrvDetails3 != null) {
                    nrvDetails3.getRc_regn_dt();
                }
                NrvDetails nrvDetails4 = (NrvDetails) uVar2.f20234e;
                if (nrvDetails4 != null) {
                    nrvDetails4.getRc_fit_upto();
                }
            } else {
                String string = Settings.Secure.getString(this.f18025e.getContentResolver(), "android_id");
                String s02 = this.f18028h.s0(q.B0(((Document) this.f18024d.get(i10)).getRc()).toString());
                c0.a aVar2 = c0.Companion;
                x b10 = x.f32156g.b("application/json");
                a.C0008a aVar3 = ad.a.f400a;
                String k10 = this.f18029i.k();
                l.c(s02);
                String jSONObject = aVar3.f(k10, s02, string.toString(), this.f18029i.l(), this.f18029i.e()).toString();
                l.e(jSONObject, "toString(...)");
                c0 f10 = aVar2.f(b10, jSONObject);
                N(RcService.f9484a.c(this.f18025e));
                u uVar3 = new u();
                uVar3.f20234e = String.valueOf(System.currentTimeMillis());
                G().UpdateVirtualRC(f10, (String) uVar3.f20234e).enqueue(new b(uVar3, this, i10));
            }
            aVar.P().setOnClickListener(new c(this, uVar));
            aVar.O().setOnClickListener(new d(this, uVar, i10));
            aVar.S().setOnClickListener(new e(aVar, this, uVar2, i10));
        } catch (Exception e10) {
            Log.e("AdapterEoor", e10.toString());
        }
    }

    /* renamed from: L */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        if (this.f18024d.size() > 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rc_item_alert_create, viewGroup, false);
            l.c(inflate);
            return new a(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rc_create1, viewGroup, false);
        l.c(inflate2);
        return new a(inflate2);
    }

    public final void M(int i10) {
        this.f18024d.remove(i10);
        n(i10);
        m(i10, this.f18024d.size());
    }

    public final void N(RcService rcService) {
        l.f(rcService, "<set-?>");
        this.f18027g = rcService;
    }

    public int e() {
        return this.f18024d.size();
    }
}
