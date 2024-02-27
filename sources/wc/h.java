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
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.DPTNotice.NoticeSearchList;
import com.nic.mparivahan.Echallan.PaymentSearchChallanList;
import com.nic.mparivahan.Echallan.ReprintReceiptActivity;
import com.nic.mparivahan.Echallan.SearchChallanListActivity;
import com.nic.mparivahan.Echallan.SearchPrintChallanListActivity;
import com.nic.mparivahan.Echallan.SearchPrintReceiptListActivity;
import com.nic.mparivahan.Echallan.TranscationStatusActivity;
import com.nic.mparivahan.Echallan.VerifyPaymentChallanList;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.Document;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import java.util.ArrayList;
import km.d;
import ld.c;
import ld.g;
import m8.k;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class h extends RecyclerView.h {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f18040d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f18041e;

    /* renamed from: f  reason: collision with root package name */
    private int f18042f;

    /* renamed from: g  reason: collision with root package name */
    private String f18043g;

    /* renamed from: h  reason: collision with root package name */
    public RcService f18044h;

    /* renamed from: i  reason: collision with root package name */
    private DatabaseHelper f18045i;

    /* renamed from: j  reason: collision with root package name */
    public c f18046j;

    /* renamed from: k  reason: collision with root package name */
    private g f18047k;

    public static final class a extends RecyclerView.d0 {
        private final LinearLayout A;
        private final LinearLayout B;
        private ProgressBar C;
        private TextView D;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f18048y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f18049z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.rc_number);
            l.e(findViewById, "findViewById(...)");
            this.f18048y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.viewdetails);
            l.e(findViewById2, "findViewById(...)");
            this.f18049z = (TextView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.linear_parent);
            l.e(findViewById3, "findViewById(...)");
            this.A = (LinearLayout) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.delet_icon);
            l.e(findViewById4, "findViewById(...)");
            this.B = (LinearLayout) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.progress_bar);
            l.e(findViewById5, "findViewById(...)");
            this.C = (ProgressBar) findViewById5;
            View findViewById6 = this.f3622e.findViewById(R.id.tv_vehicle_no);
            l.e(findViewById6, "findViewById(...)");
            this.D = (TextView) findViewById6;
        }

        public final LinearLayout O() {
            return this.B;
        }

        public final LinearLayout P() {
            return this.A;
        }

        public final TextView Q() {
            return this.f18048y;
        }

        public final TextView R() {
            return this.D;
        }

        public final TextView S() {
            return this.f18049z;
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f18050a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f18051b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f18052c;

        b(String str, h hVar, int i10) {
            this.f18050a = str;
            this.f18051b = hVar;
            this.f18052c = i10;
        }

        public void onFailure(Call call, Throwable th2) {
            Log.e("Error -- >001", String.valueOf(th2 != null ? th2.getMessage() : null));
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    k.a aVar = k.f13877a;
                    String str2 = this.f18050a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = this.f18050a;
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
                if (p.o(rcModelsDet.getStatusCode(), "NP001", true) && this.f18051b.C().R0(q.B0(((Document) this.f18051b.f18040d.get(this.f18052c)).getRc()).toString(), rcModelsDet.getNrvDetails()) > 0) {
                    this.f18051b.k(this.f18052c);
                }
            } catch (Exception unused) {
            }
        }
    }

    public h(ArrayList arrayList, Context context, int i10, String str) {
        l.f(arrayList, "rc_details");
        l.f(context, "context");
        l.f(str, "name");
        this.f18040d = arrayList;
        this.f18041e = context;
        this.f18042f = i10;
        this.f18043g = str;
        this.f18045i = DatabaseHelper.A0(context);
        this.f18047k = new g(context);
    }

    /* access modifiers changed from: private */
    public static final void G(h hVar, String str, View view) {
        l.f(hVar, "this$0");
        l.f(str, "$rc_numer");
        if (hVar.f18042f == 1) {
            Intent intent = new Intent(hVar.f18041e, SearchChallanListActivity.class);
            intent.putExtra("inputValue", str);
            intent.putExtra("inputType", "RC");
            hVar.f18041e.startActivity(intent);
        }
        if (hVar.f18042f == 2) {
            Intent intent2 = new Intent(hVar.f18041e, SearchPrintReceiptListActivity.class);
            intent2.putExtra("inputValue", str);
            intent2.putExtra("inputType", "RC");
            intent2.putExtra("Service_name", hVar.f18043g);
            hVar.f18041e.startActivity(intent2);
        }
        if (hVar.f18042f == 3) {
            Intent intent3 = new Intent(hVar.f18041e, SearchPrintChallanListActivity.class);
            intent3.putExtra("inputValue", str);
            intent3.putExtra("inputType", "RC");
            intent3.putExtra("Service_name", hVar.f18043g);
            hVar.f18041e.startActivity(intent3);
        }
        if (hVar.f18042f == 10) {
            Intent intent4 = new Intent(hVar.f18041e, PaymentSearchChallanList.class);
            intent4.putExtra("inputValue", str);
            intent4.putExtra("inputType", "RC");
            hVar.f18041e.startActivity(intent4);
        }
        if (hVar.f18042f == 11) {
            Intent intent5 = new Intent(hVar.f18041e, TranscationStatusActivity.class);
            intent5.putExtra("inputValue", str);
            intent5.putExtra("inputType", "RC");
            hVar.f18041e.startActivity(intent5);
        }
        if (hVar.f18042f == 12) {
            Intent intent6 = new Intent(hVar.f18041e, ReprintReceiptActivity.class);
            intent6.putExtra("inputValue", str);
            intent6.putExtra("inputType", "RC");
            intent6.putExtra("Service_name", hVar.f18043g);
            hVar.f18041e.startActivity(intent6);
        }
        if (hVar.f18042f == 13) {
            Intent intent7 = new Intent(hVar.f18041e, VerifyPaymentChallanList.class);
            intent7.putExtra("inputValue", str);
            intent7.putExtra("inputType", "RC");
            hVar.f18041e.startActivity(intent7);
        }
        if (hVar.f18042f == 15) {
            Intent intent8 = new Intent(hVar.f18041e, NoticeSearchList.class);
            intent8.putExtra("inputValue", str);
            intent8.putExtra("inputType", "RC");
            hVar.f18041e.startActivity(intent8);
        }
    }

    public final DatabaseHelper C() {
        return this.f18045i;
    }

    public final ld.c D() {
        ld.c cVar = this.f18046j;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSess");
        return null;
    }

    public final RcService E() {
        RcService rcService = this.f18044h;
        if (rcService != null) {
            return rcService;
        }
        l.v("rcService");
        return null;
    }

    /* renamed from: F */
    public void p(a aVar, int i10) {
        TextView S;
        String b10;
        TextView S2;
        String b11;
        l.f(aVar, "holder");
        try {
            I(new ld.c(this.f18041e));
            aVar.R().setText(D().b("label_challan_vehicle_no", "Vehicle No"));
            aVar.O().setVisibility(8);
            Log.e("Check Value", String.valueOf(this.f18042f));
            if (this.f18042f == 1) {
                aVar.S().setText(D().b("label_view_challan", this.f18041e.getString(R.string.show_recent_challan)));
            }
            if (this.f18042f == 2) {
                if (!ka.c.f13158a.m(this.f18043g)) {
                    S2 = aVar.S();
                    b11 = D().b("View_Payment_Receipt", this.f18043g);
                } else {
                    S2 = aVar.S();
                    b11 = D().b("label_challan_view_receipt", "View Receipt");
                }
                S2.setText(b11);
            }
            if (this.f18042f == 3) {
                if (!ka.c.f13158a.m(this.f18043g)) {
                    S = aVar.S();
                    b10 = D().b("label_challan_download", this.f18043g);
                } else {
                    S = aVar.S();
                    b10 = D().b("label_view_challan", this.f18041e.getString(R.string.show_recent_challan));
                }
                S.setText(b10);
            }
            if (this.f18042f == 10) {
                aVar.S().setText(D().b("label_view_challan", this.f18041e.getString(R.string.show_recent_challan)));
            }
            if (this.f18042f == 11) {
                aVar.S().setText(D().b("label_challan_payment_status", "Payment Status"));
            }
            if (this.f18042f == 12) {
                aVar.S().setText(D().b("label_challan_reprint_receipt", "Reprint Receipt"));
            }
            if (this.f18042f == 13) {
                aVar.S().setText(D().b("label_verify_payment_status", "Verify Payment Status"));
            }
            if (this.f18042f == 15) {
                aVar.S().setText("Notice Status");
            }
            String rc2 = ((Document) this.f18040d.get(i10)).getRc();
            NrvDetails G0 = this.f18045i.G0(rc2);
            if (rc2 != null && (true ^ p.q(rc2))) {
                aVar.Q().setText(((Document) this.f18040d.get(i10)).getRc());
            }
            if (G0 != null) {
                G0.getRc_owner_name();
                G0.getRc_present_address();
                G0.getRc_regn_dt();
                G0.getRc_fit_upto();
            } else {
                String string = Settings.Secure.getString(this.f18041e.getContentResolver(), "android_id");
                String s02 = this.f18045i.s0(q.B0(((Document) this.f18040d.get(i10)).getRc()).toString());
                c0.a aVar2 = c0.Companion;
                x b12 = x.f32156g.b("application/json");
                a.C0008a aVar3 = ad.a.f400a;
                String k10 = this.f18047k.k();
                l.c(s02);
                l.c(string);
                String jSONObject = aVar3.f(k10, s02, string, this.f18047k.l(), this.f18047k.e()).toString();
                l.e(jSONObject, "toString(...)");
                c0 f10 = aVar2.f(b12, jSONObject);
                J(RcService.f9484a.c(this.f18041e));
                String valueOf = String.valueOf(System.currentTimeMillis());
                E().UpdateVirtualRC(f10, valueOf).enqueue(new b(valueOf, this, i10));
            }
            aVar.P().setOnClickListener(new g(this, rc2));
        } catch (Exception e10) {
            Log.e("AdapterEoor", e10.toString());
        }
    }

    /* renamed from: H */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        if (this.f18040d.size() > 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rc_item_alert_create, viewGroup, false);
            l.c(inflate);
            return new a(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rc_create1, viewGroup, false);
        l.c(inflate2);
        return new a(inflate2);
    }

    public final void I(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.f18046j = cVar;
    }

    public final void J(RcService rcService) {
        l.f(rcService, "<set-?>");
        this.f18044h = rcService;
    }

    public int e() {
        return this.f18040d.size();
    }
}
