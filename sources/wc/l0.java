package wc;

import ad.a;
import android.app.Dialog;
import android.content.Context;
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
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import java.util.ArrayList;
import km.d;
import ld.g;
import m8.k;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import v9.f;

public final class l0 extends RecyclerView.h {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f18077d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f18078e;

    /* renamed from: f  reason: collision with root package name */
    private final zc.b f18079f;

    /* renamed from: g  reason: collision with root package name */
    private DatabaseHelper f18080g;

    /* renamed from: h  reason: collision with root package name */
    public RcService f18081h;

    /* renamed from: i  reason: collision with root package name */
    private g f18082i;

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;
        private final TextView B;
        private final TextView C;
        private final TextView D;
        private final TextView E;
        private final TextView F;
        private final LinearLayout G;
        private final ImageView H;
        private final ImageView I;
        private final ProgressBar J;
        private final ImageView K;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f18083y;

        /* renamed from: z  reason: collision with root package name */
        private final ImageView f18084z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.shared_rc);
            l.e(findViewById, "findViewById(...)");
            this.f18083y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.update);
            l.e(findViewById2, "findViewById(...)");
            this.f18084z = (ImageView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.delet);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ImageView) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.rc_number);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.owner_name);
            l.e(findViewById5, "findViewById(...)");
            this.C = (TextView) findViewById5;
            View findViewById6 = this.f3622e.findViewById(R.id.address);
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
            View findViewById10 = this.f3622e.findViewById(R.id.share_doc);
            l.e(findViewById10, "findViewById(...)");
            this.H = (ImageView) findViewById10;
            View findViewById11 = this.f3622e.findViewById(R.id.option_menu);
            l.e(findViewById11, "findViewById(...)");
            this.I = (ImageView) findViewById11;
            View findViewById12 = this.f3622e.findViewById(R.id.progress_bar);
            l.e(findViewById12, "findViewById(...)");
            this.J = (ProgressBar) findViewById12;
            View findViewById13 = this.f3622e.findViewById(R.id.download_rc);
            l.e(findViewById13, "findViewById(...)");
            this.K = (ImageView) findViewById13;
        }

        public final TextView O() {
            return this.D;
        }

        public final ImageView P() {
            return this.A;
        }

        public final ImageView Q() {
            return this.K;
        }

        public final TextView R() {
            return this.E;
        }

        public final LinearLayout S() {
            return this.G;
        }

        public final ImageView T() {
            return this.I;
        }

        public final TextView U() {
            return this.C;
        }

        public final ProgressBar V() {
            return this.J;
        }

        public final TextView W() {
            return this.B;
        }

        public final ImageView X() {
            return this.H;
        }

        public final ImageView Y() {
            return this.f18084z;
        }

        public final TextView Z() {
            return this.F;
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f18085a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f18086b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l0 f18087c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f18088d;

        b(a aVar, u uVar, l0 l0Var, int i10) {
            this.f18085a = aVar;
            this.f18086b = uVar;
            this.f18087c = l0Var;
            this.f18088d = i10;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f18085a.V().setVisibility(8);
            this.f18085a.Q().setVisibility(0);
            this.f18085a.T().setVisibility(8);
            Log.e("Error -- >001", String.valueOf(th2 != null ? th2.getMessage() : null));
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            this.f18085a.V().setVisibility(8);
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f18085a.Q().setVisibility(0);
                    this.f18085a.T().setVisibility(8);
                    Log.e("Error -- >002", e10.toString());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                k.a aVar = k.f13877a;
                String str2 = (String) this.f18086b.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f18086b.f20234e;
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
            if (!p.o(rcModelsDet.getStatusCode(), "NP001", true)) {
                this.f18085a.Q().setVisibility(0);
                this.f18085a.T().setVisibility(8);
            } else if (this.f18087c.K().R0(q.B0(((Document) this.f18087c.f18077d.get(this.f18088d)).getRc()).toString(), rcModelsDet.getNrvDetails()) > 0) {
                this.f18087c.k(this.f18088d);
            }
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f18089a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f18090b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l0 f18091c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f18092d;

        c(a aVar, u uVar, l0 l0Var, int i10) {
            this.f18089a = aVar;
            this.f18090b = uVar;
            this.f18091c = l0Var;
            this.f18092d = i10;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f18089a.V().setVisibility(8);
            this.f18089a.Q().setVisibility(0);
            this.f18089a.T().setVisibility(8);
            Log.e("Error -- >001", String.valueOf(th2 != null ? th2.getMessage() : null));
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            this.f18089a.V().setVisibility(8);
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f18089a.Q().setVisibility(0);
                    this.f18089a.T().setVisibility(8);
                    Log.e("Error -- >002", e10.toString());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                k.a aVar = k.f13877a;
                String str2 = (String) this.f18090b.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f18090b.f20234e;
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
            if (p.o(rcModelsDet.getStatusCode(), "NP001", true)) {
                this.f18089a.T().setVisibility(0);
                if (this.f18091c.K().R0(q.B0(((Document) this.f18091c.f18077d.get(this.f18092d)).getRc()).toString(), rcModelsDet.getNrvDetails()) > 0) {
                    this.f18091c.k(this.f18092d);
                    return;
                }
                return;
            }
            this.f18089a.Q().setVisibility(0);
            this.f18089a.T().setVisibility(8);
        }
    }

    public l0(ArrayList arrayList, Context context, zc.b bVar) {
        l.f(arrayList, "rc_details");
        l.f(context, "context");
        l.f(bVar, "deletMyRcRcDeletListner");
        this.f18077d = arrayList;
        this.f18078e = context;
        this.f18079f = bVar;
        this.f18080g = DatabaseHelper.A0(context);
        this.f18082i = new g(context);
    }

    /* access modifiers changed from: private */
    public static final void N(View view) {
    }

    /* access modifiers changed from: private */
    public static final void O(View view) {
    }

    /* access modifiers changed from: private */
    public static final void P(View view) {
    }

    /* access modifiers changed from: private */
    public static final void Q(View view) {
    }

    /* access modifiers changed from: private */
    public static final void R(a aVar, l0 l0Var, int i10, View view) {
        l.f(aVar, "$holder");
        l.f(l0Var, "this$0");
        aVar.V().setVisibility(0);
        aVar.Q().setVisibility(8);
        String string = Settings.Secure.getString(l0Var.f18078e.getContentResolver(), "android_id");
        String s02 = l0Var.f18080g.s0(q.B0(((Document) l0Var.f18077d.get(i10)).getRc()).toString());
        c0.a aVar2 = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar3 = ad.a.f400a;
        String k10 = l0Var.f18082i.k();
        l.c(s02);
        l.c(string);
        String jSONObject = aVar3.f(k10, s02, string, l0Var.f18082i.l(), l0Var.f18082i.e()).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar2.f(b10, jSONObject);
        l0Var.Z(RcService.f9484a.c(l0Var.f18078e));
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        l0Var.L().UpdateVirtualRC(f10, (String) uVar.f20234e).enqueue(new c(aVar, uVar, l0Var, i10));
    }

    /* access modifiers changed from: private */
    public static final void S(l0 l0Var, a aVar, u uVar, u uVar2, int i10, View view) {
        l.f(l0Var, "this$0");
        l.f(aVar, "$holder");
        l.f(uVar, "$languageKeySession");
        l.f(uVar2, "$rc_numer");
        PopupMenu popupMenu = new PopupMenu(l0Var.f18078e, aVar.T());
        popupMenu.setGravity(8388613);
        popupMenu.inflate(R.menu.menu_item_option);
        MenuItem findItem = popupMenu.getMenu().findItem(R.id.menu1);
        l.e(findItem, "findItem(...)");
        MenuItem findItem2 = popupMenu.getMenu().findItem(R.id.menu2);
        l.e(findItem2, "findItem(...)");
        MenuItem findItem3 = popupMenu.getMenu().findItem(R.id.menu3);
        l.e(findItem3, "findItem(...)");
        MenuItem findItem4 = popupMenu.getMenu().findItem(R.id.menu4);
        l.e(findItem4, "findItem(...)");
        findItem.setTitle(((ld.c) uVar.f20234e).b("label_view", "View"));
        findItem2.setTitle(((ld.c) uVar.f20234e).b("label_share", "Share"));
        findItem3.setTitle(((ld.c) uVar.f20234e).b(f.f17510a.j0(), "Refresh"));
        findItem4.setTitle(((ld.c) uVar.f20234e).b("delete", "Delete"));
        popupMenu.setOnMenuItemClickListener(new i0(l0Var, uVar2, i10, uVar));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean T(wc.l0 r3, cm.u r4, int r5, cm.u r6, android.view.MenuItem r7) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r3, r0)
            java.lang.String r0 = "$rc_numer"
            cm.l.f(r4, r0)
            java.lang.String r0 = "$languageKeySession"
            cm.l.f(r6, r0)
            int r7 = r7.getItemId()
            r0 = 0
            java.lang.String r1 = "RcNumber"
            switch(r7) {
                case 2131363612: goto L_0x006f;
                case 2131363613: goto L_0x003e;
                case 2131363614: goto L_0x0034;
                case 2131363615: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0079
        L_0x001a:
            android.content.Context r7 = r3.f18078e
            java.lang.Object r6 = r6.f20234e
            ld.c r6 = (ld.c) r6
            v9.f$a r1 = v9.f.f17510a
            java.lang.String r1 = r1.z0()
            java.lang.String r2 = "Are you sure, You want to delete ?"
            java.lang.String r6 = r6.b(r1, r2)
            java.lang.Object r4 = r4.f20234e
            java.lang.String r4 = (java.lang.String) r4
            r3.V(r7, r6, r4, r5)
            goto L_0x0079
        L_0x0034:
            zc.b r3 = r3.f18079f
            java.lang.Object r4 = r4.f20234e
            java.lang.String r4 = (java.lang.String) r4
            r3.P(r4, r5)
            goto L_0x0079
        L_0x003e:
            com.nic.mparivahan.a$a r5 = com.nic.mparivahan.a.f9624a
            android.content.Context r6 = r3.f18078e
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto L_0x005e
            android.content.Intent r5 = new android.content.Intent
            android.content.Context r6 = r3.f18078e
            java.lang.Class<com.nic.mparivahan.RC.SharedRcScreen> r7 = com.nic.mparivahan.RC.SharedRcScreen.class
            r5.<init>(r6, r7)
        L_0x0051:
            java.lang.Object r4 = r4.f20234e
            java.lang.String r4 = (java.lang.String) r4
            r5.putExtra(r1, r4)
            android.content.Context r3 = r3.f18078e
            r3.startActivity(r5)
            goto L_0x0079
        L_0x005e:
            android.content.Context r3 = r3.f18078e
            r4 = 2132018237(0x7f14043d, float:1.9674775E38)
            java.lang.String r4 = r3.getString(r4)
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r0)
            r3.show()
            goto L_0x0079
        L_0x006f:
            android.content.Intent r5 = new android.content.Intent
            android.content.Context r6 = r3.f18078e
            java.lang.Class<com.nic.mparivahan.RC.VirtualRcScreen> r7 = com.nic.mparivahan.RC.VirtualRcScreen.class
            r5.<init>(r6, r7)
            goto L_0x0051
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.l0.T(wc.l0, cm.u, int, cm.u, android.view.MenuItem):boolean");
    }

    private final void V(Context context, String str, String str2, int i10) {
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
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("radio_dl_serv_yes", "Yes"));
        textView2.setText(cVar.b("radio_dl_serv_no", "No"));
        textView2.setOnClickListener(new j0(dialog));
        textView.setOnClickListener(new k0(dialog, this, str2, i10));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void W(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void X(Dialog dialog, l0 l0Var, String str, int i10, View view) {
        l.f(dialog, "$d");
        l.f(l0Var, "this$0");
        dialog.dismiss();
        l0Var.f18079f.n(str, i10);
    }

    public final DatabaseHelper K() {
        return this.f18080g;
    }

    public final RcService L() {
        RcService rcService = this.f18081h;
        if (rcService != null) {
            return rcService;
        }
        l.v("rcService");
        return null;
    }

    /* renamed from: M */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        try {
            u uVar = new u();
            uVar.f20234e = new ld.c(this.f18078e);
            u uVar2 = new u();
            String rc2 = ((Document) this.f18077d.get(i10)).getRc();
            uVar2.f20234e = rc2;
            NrvDetails G0 = this.f18080g.G0(rc2);
            Object obj = uVar2.f20234e;
            if (obj != null && (!p.q((CharSequence) obj))) {
                aVar.W().setText(((Document) this.f18077d.get(i10)).getRc());
            }
            if (G0 != null) {
                String rc_regn_no = G0.getRc_regn_no();
                String rc_owner_name = G0.getRc_owner_name();
                String rc_present_address = G0.getRc_present_address();
                String rc_regn_dt = G0.getRc_regn_dt();
                String rc_fit_upto = G0.getRc_fit_upto();
                aVar.W().setText(rc_regn_no);
                aVar.U().setText(rc_owner_name);
                aVar.O().setText(rc_present_address);
                TextView R = aVar.R();
                R.setText(((ld.c) uVar.f20234e).b("issue_date", "Issue Date") + " - " + rc_regn_dt);
                TextView Z = aVar.Z();
                Z.setText(((ld.c) uVar.f20234e).b("label_dl_serv_valid_upto", "Valid Upto") + " - " + rc_fit_upto);
            } else {
                String string = Settings.Secure.getString(this.f18078e.getContentResolver(), "android_id");
                aVar.V().setVisibility(0);
                String s02 = this.f18080g.s0(q.B0(((Document) this.f18077d.get(i10)).getRc()).toString());
                c0.a aVar2 = c0.Companion;
                x b10 = x.f32156g.b("application/json");
                a.C0008a aVar3 = ad.a.f400a;
                String k10 = this.f18082i.k();
                l.c(s02);
                l.c(string);
                String jSONObject = aVar3.f(k10, s02, string, this.f18082i.l(), this.f18082i.e()).toString();
                l.e(jSONObject, "toString(...)");
                c0 f10 = aVar2.f(b10, jSONObject);
                Z(RcService.f9484a.c(this.f18078e));
                u uVar3 = new u();
                uVar3.f20234e = String.valueOf(System.currentTimeMillis());
                L().UpdateVirtualRC(f10, (String) uVar3.f20234e).enqueue(new b(aVar, uVar3, this, i10));
            }
            aVar.X().setOnClickListener(new c0());
            aVar.S().setOnClickListener(new d0());
            aVar.P().setOnClickListener(new e0());
            aVar.Y().setOnClickListener(new f0());
            aVar.Q().setOnClickListener(new g0(aVar, this, i10));
            aVar.T().setOnClickListener(new h0(this, aVar, uVar, uVar2, i10));
        } catch (Exception unused) {
        }
    }

    /* renamed from: U */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_doc_item, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void Y(int i10) {
        this.f18077d.remove(i10);
        n(i10);
        m(i10, this.f18077d.size());
    }

    public final void Z(RcService rcService) {
        l.f(rcService, "<set-?>");
        this.f18081h = rcService;
    }

    public int e() {
        return this.f18077d.size();
    }
}
