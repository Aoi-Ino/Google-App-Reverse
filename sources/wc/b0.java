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
import cm.u;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.SharedDoc;
import com.nic.mparivahan.RC.ShowSharedRcScreen;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import java.util.ArrayList;
import km.d;
import ld.g;
import m8.k;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import t8.c;
import um.c0;
import um.x;
import v9.f;
import zc.c;

public final class b0 extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f18007d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f18008e;

    /* renamed from: f  reason: collision with root package name */
    private final c f18009f;

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
        private final TextView J;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f18010y;

        /* renamed from: z  reason: collision with root package name */
        private final ImageView f18011z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.shared_rc);
            l.e(findViewById, "findViewById(...)");
            this.f18010y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.update);
            l.e(findViewById2, "findViewById(...)");
            this.f18011z = (ImageView) findViewById2;
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
            View findViewById12 = this.f3622e.findViewById(R.id.shared_to);
            l.e(findViewById12, "findViewById(...)");
            this.J = (TextView) findViewById12;
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
            return this.J;
        }

        public final TextView W() {
            return this.F;
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f18012a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f18013b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f18014c;

        b(u uVar, TextView textView, TextView textView2) {
            this.f18012a = uVar;
            this.f18013b = textView;
            this.f18014c = textView2;
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
                    this.f18013b.setText("--");
                    this.f18014c.setText("--");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                k.a aVar = k.f13877a;
                String str2 = (String) this.f18012a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f18012a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, d.f24740b));
            }
            String valueOf = String.valueOf(a10);
            Log.d("getRcDetails", valueOf);
            JSONObject jSONObject = new JSONObject(valueOf);
            if (jSONObject.has("statusCode") && p.o(jSONObject.getString("statusCode"), "CTZN001", true)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("mparCitizenUser");
                if (jSONObject2.has("ctzDispName")) {
                    this.f18013b.setText(jSONObject2.getString("ctzDispName").toString());
                }
            }
        }
    }

    public b0(ArrayList arrayList, Context context, zc.c cVar) {
        l.f(arrayList, "shared_RcDetails");
        l.f(context, "context");
        l.f(cVar, "deletSharedRcDeletListner");
        this.f18007d = arrayList;
        this.f18008e = context;
        this.f18009f = cVar;
    }

    /* access modifiers changed from: private */
    public static final void I(View view) {
    }

    /* access modifiers changed from: private */
    public static final void J(View view) {
    }

    /* access modifiers changed from: private */
    public static final void K(b0 b0Var, a aVar, u uVar, String str, int i10, View view) {
        l.f(b0Var, "this$0");
        l.f(aVar, "$holder");
        l.f(uVar, "$languageKeySession");
        l.f(str, "$rc_numer");
        PopupMenu popupMenu = new PopupMenu(b0Var.f18008e, aVar.S());
        popupMenu.inflate(R.menu.recived_rc_menu);
        MenuItem findItem = popupMenu.getMenu().findItem(R.id.menu1);
        l.e(findItem, "findItem(...)");
        MenuItem findItem2 = popupMenu.getMenu().findItem(R.id.menu3);
        l.e(findItem2, "findItem(...)");
        findItem.setTitle(((ld.c) uVar.f20234e).b("label_view", "View"));
        findItem2.setTitle(((ld.c) uVar.f20234e).b("delete", "Delete"));
        popupMenu.setGravity(8388613);
        popupMenu.setOnMenuItemClickListener(new y(b0Var, str, uVar, i10));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    public static final boolean L(b0 b0Var, String str, u uVar, int i10, MenuItem menuItem) {
        l.f(b0Var, "this$0");
        l.f(str, "$rc_numer");
        l.f(uVar, "$languageKeySession");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu1) {
            Intent intent = new Intent(b0Var.f18008e, ShowSharedRcScreen.class);
            intent.putExtra("RcNumber", str);
            intent.putExtra("ShareRecivedFlag", false);
            b0Var.f18008e.startActivity(intent);
        } else if (itemId == R.id.menu3) {
            b0Var.N(b0Var.f18008e, ((ld.c) uVar.f20234e).b(f.f17510a.z0(), "Are you sure, you want to delete?"), String.valueOf(((SharedDoc) b0Var.f18007d.get(i10)).getShrdId()), i10);
        }
        return false;
    }

    private final void N(Context context, String str, String str2, int i10) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        ld.c cVar = new ld.c(context);
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
        textView2.setOnClickListener(new z(dialog));
        textView.setOnClickListener(new a0(dialog, this, str2, i10));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void O(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void P(Dialog dialog, b0 b0Var, String str, int i10, View view) {
        l.f(dialog, "$d");
        l.f(b0Var, "this$0");
        dialog.dismiss();
        b0Var.f18009f.N(str, i10);
    }

    public final void G(TextView textView, TextView textView2, String str) {
        l.f(textView, "ownername");
        l.f(textView2, "mobile_no");
        l.f(str, "id");
        String string = Settings.Secure.getString(this.f18008e.getContentResolver(), "android_id");
        g gVar = new g(this.f18008e);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        c.a aVar2 = t8.c.f16582a;
        l.c(string);
        String jSONObject = aVar2.f(str, string, gVar.l(), gVar.e()).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        SignService c10 = SignService.f7644a.c(this.f18008e);
        c10.getUserDetails(hc.a.f12073a.p() + "service/getCitizenUserDetails", f10, (String) uVar.f20234e).enqueue(new b(uVar, textView, textView2));
    }

    /* renamed from: H */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        try {
            u uVar = new u();
            uVar.f20234e = new ld.c(this.f18008e);
            aVar.V().setText(((ld.c) uVar.f20234e).b("shared_to", "Shared to"));
            G(aVar.T(), aVar.R(), String.valueOf(((SharedDoc) this.f18007d.get(i10)).getShrdToCtz()));
            String shrdDocNumber = ((SharedDoc) this.f18007d.get(i10)).getShrdDocNumber();
            String shrdCreatedAt = ((SharedDoc) this.f18007d.get(i10)).getShrdCreatedAt();
            String shrdExpireOn = ((SharedDoc) this.f18007d.get(i10)).getShrdExpireOn();
            a.C0008a aVar2 = ad.a.f400a;
            String valueOf = String.valueOf(aVar2.k(shrdExpireOn.toString(), "yyyy-MM-dd", "dd MMM,yyyy"));
            aVar.U().setText(shrdDocNumber);
            TextView P = aVar.P();
            P.setText(((ld.c) uVar.f20234e).b("shared_date", "Shared Date") + ' ' + aVar2.l(shrdCreatedAt));
            TextView W = aVar.W();
            W.setText(((ld.c) uVar.f20234e).b("label_dl_serv_valid_upto", "Valid Upto") + ' ' + valueOf);
            aVar.O().setOnClickListener(new v());
            aVar.Q().setOnClickListener(new w());
            aVar.S().setOnClickListener(new x(this, aVar, uVar, shrdDocNumber, i10));
        } catch (Exception unused) {
        }
    }

    /* renamed from: M */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mysharedrc_iem, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void Q(int i10) {
        this.f18007d.remove(i10);
        n(i10);
        m(i10, this.f18007d.size());
    }

    public int e() {
        return this.f18007d.size();
    }
}
