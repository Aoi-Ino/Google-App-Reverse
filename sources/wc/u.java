package wc;

import ad.a;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.ReceivedDoc;
import com.nic.mparivahan.RC.ShowSharedRcScreen;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import j$.util.Base64;
import java.util.ArrayList;
import km.d;
import ld.c;
import m8.k;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import t8.c;
import um.c0;
import um.x;
import v9.f;
import zc.g;

public final class u extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f18135d;

    /* renamed from: e  reason: collision with root package name */
    private Context f18136e;

    /* renamed from: f  reason: collision with root package name */
    private final g f18137f;

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;
        private final TextView B;
        private final TextView C;
        private final TextView D;
        private final TextView E;
        private final TextView F;
        private final LinearLayout G;
        private final TextView H;
        private final ImageView I;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f18138y;

        /* renamed from: z  reason: collision with root package name */
        private final ImageView f18139z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.shared_rc);
            l.e(findViewById, "findViewById(...)");
            this.f18138y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.update);
            l.e(findViewById2, "findViewById(...)");
            this.f18139z = (ImageView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.delet);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ImageView) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.rc_number);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.owner_name);
            l.e(findViewById5, "findViewById(...)");
            this.C = (TextView) findViewById5;
            View findViewById6 = this.f3622e.findViewById(R.id.mobile_number);
            l.e(findViewById6, "findViewById(...)");
            this.D = (TextView) findViewById6;
            View findViewById7 = this.f3622e.findViewById(R.id.issue_date);
            l.e(findViewById7, "findViewById(...)");
            this.E = (TextView) findViewById7;
            View findViewById8 = this.f3622e.findViewById(R.id.valid_upto);
            l.e(findViewById8, "findViewById(...)");
            this.F = (TextView) findViewById8;
            View findViewById9 = this.f3622e.findViewById(R.id.linear_parent);
            l.e(findViewById9, "findViewById(...)");
            this.G = (LinearLayout) findViewById9;
            View findViewById10 = this.f3622e.findViewById(R.id.mobile_number_tx);
            l.e(findViewById10, "findViewById(...)");
            this.H = (TextView) findViewById10;
            View findViewById11 = this.f3622e.findViewById(R.id.option_menu);
            l.e(findViewById11, "findViewById(...)");
            this.I = (ImageView) findViewById11;
        }

        public final ImageView O() {
            return this.A;
        }

        public final TextView P() {
            return this.E;
        }

        public final LinearLayout Q() {
            return this.G;
        }

        public final TextView R() {
            return this.H;
        }

        public final ImageView S() {
            return this.I;
        }

        public final TextView T() {
            return this.C;
        }

        public final TextView U() {
            return this.B;
        }

        public final TextView V() {
            return this.F;
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cm.u f18140a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f18141b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f18142c;

        b(cm.u uVar, TextView textView, TextView textView2) {
            this.f18140a = uVar;
            this.f18141b = textView;
            this.f18142c = textView2;
        }

        public void onFailure(Call call, Throwable th2) {
            Log.e("Error -- >001", String.valueOf(th2 != null ? th2.getMessage() : null));
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            k.a aVar;
            String str;
            String str2;
            String str3 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f18141b.setText("--");
                    this.f18142c.setText("--");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = k.f13877a;
                str = (String) this.f18140a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = k.f13877a;
                str = (String) this.f18140a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, d.f24740b);
            }
            JSONObject jSONObject = new JSONObject(String.valueOf(aVar.a(str, str2)));
            if (jSONObject.has("statusCode") && p.o(jSONObject.getString("statusCode"), "CTZN001", true)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("mparCitizenUser");
                if (jSONObject2.has("ctzDispName")) {
                    this.f18141b.setText(jSONObject2.getString("ctzDispName").toString());
                }
            }
        }
    }

    public u(ArrayList arrayList, Context context, g gVar) {
        l.f(arrayList, "shared_RcDetails");
        l.f(context, "context");
        l.f(gVar, "receivedRcInterface");
        this.f18135d = arrayList;
        this.f18136e = context;
        this.f18137f = gVar;
    }

    /* access modifiers changed from: private */
    public static final void H(View view) {
    }

    /* access modifiers changed from: private */
    public static final void I(u uVar, a aVar, cm.u uVar2, int i10, View view) {
        l.f(uVar, "this$0");
        l.f(aVar, "$holder");
        l.f(uVar2, "$languageKeySession");
        PopupMenu popupMenu = new PopupMenu(uVar.f18136e, aVar.S());
        popupMenu.inflate(R.menu.recived_menu);
        MenuItem findItem = popupMenu.getMenu().findItem(R.id.menu1);
        l.e(findItem, "findItem(...)");
        findItem.setTitle(((c) uVar2.f20234e).b("label_view", "View"));
        popupMenu.setGravity(8388613);
        popupMenu.setOnMenuItemClickListener(new r(uVar, i10, uVar2));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    public static final boolean J(u uVar, int i10, cm.u uVar2, MenuItem menuItem) {
        l.f(uVar, "this$0");
        l.f(uVar2, "$languageKeySession");
        switch (menuItem.getItemId()) {
            case R.id.menu1 /*2131363612*/:
                Intent intent = new Intent(uVar.f18136e, ShowSharedRcScreen.class);
                intent.putExtra("ShareRecivedFlag", true);
                intent.putExtra("RcNumber", String.valueOf(((ReceivedDoc) uVar.f18135d.get(i10)).getShrdDocNumber()));
                intent.putExtra("RecordId", String.valueOf(((ReceivedDoc) uVar.f18135d.get(i10)).getShrdFromCtz()));
                intent.putExtra("DocId", String.valueOf(((ReceivedDoc) uVar.f18135d.get(i10)).getShrdDocId()));
                uVar.f18136e.startActivity(intent);
                return false;
            case R.id.menu2 /*2131363613*/:
                try {
                    uVar.L(uVar.f18136e, ((c) uVar2.f20234e).b(f.f17510a.z0(), "Are you sure, you want to delete?"), String.valueOf(((ReceivedDoc) uVar.f18135d.get(i10)).getShrdId()), i10);
                    return false;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return false;
                }
            default:
                return false;
        }
        e10.printStackTrace();
        return false;
    }

    private final void L(Context context, String str, String str2, int i10) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        c cVar = new c(context);
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        textView.setText(cVar.b("radio_dl_serv_yes", "Yes"));
        textView2.setText(cVar.b("radio_dl_serv_no", "No"));
        textView2.setOnClickListener(new s(dialog));
        textView.setOnClickListener(new t(dialog, this, str2, i10));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void M(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void N(Dialog dialog, u uVar, String str, int i10, View view) {
        l.f(dialog, "$d");
        l.f(uVar, "this$0");
        dialog.dismiss();
        try {
            uVar.f18137f.Y(str, i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void F(TextView textView, TextView textView2, String str) {
        l.f(textView, "ownername");
        l.f(textView2, "mobile_no");
        l.f(str, "id");
        String string = Settings.Secure.getString(this.f18136e.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(this.f18136e);
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        c.a aVar2 = t8.c.f16582a;
        l.c(string);
        String jSONObject = aVar2.f(str, string, gVar.l(), gVar.e()).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        SignService c10 = SignService.f7644a.c(this.f18136e);
        c10.getUserDetails(hc.a.f12073a.p() + "service/getCitizenUserDetails", f10, (String) uVar.f20234e).enqueue(new b(uVar, textView, textView2));
    }

    /* renamed from: G */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        try {
            F(aVar.T(), aVar.R(), String.valueOf(((ReceivedDoc) this.f18135d.get(i10)).getShrdFromCtz()));
            cm.u uVar = new cm.u();
            uVar.f20234e = new ld.c(this.f18136e);
            aVar.O().setVisibility(4);
            String shrdDocNumber = ((ReceivedDoc) this.f18135d.get(i10)).getShrdDocNumber();
            String shrdCreatedAt = ((ReceivedDoc) this.f18135d.get(i10)).getShrdCreatedAt();
            String shrdExpireOn = ((ReceivedDoc) this.f18135d.get(i10)).getShrdExpireOn();
            aVar.U().setText(shrdDocNumber);
            a.C0008a aVar2 = ad.a.f400a;
            String valueOf = String.valueOf(aVar2.k(String.valueOf(shrdExpireOn), "yyyy-MM-dd", "dd MMM,yyyy"));
            TextView P = aVar.P();
            P.setText(((ld.c) uVar.f20234e).b("shared_date", "Received Date") + ' ' + aVar2.l(String.valueOf(shrdCreatedAt)));
            TextView V = aVar.V();
            V.setText(((ld.c) uVar.f20234e).b("label_dl_serv_valid_upto", "Valid Upto") + ' ' + valueOf);
            aVar.Q().setOnClickListener(new p());
            aVar.S().setOnClickListener(new q(this, aVar, uVar, i10));
        } catch (Exception unused) {
        }
    }

    /* renamed from: K */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.myrecivedrc, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void O(int i10) {
        this.f18135d.remove(i10);
        n(i10);
        m(i10, this.f18135d.size());
    }

    public int e() {
        return this.f18135d.size();
    }
}
