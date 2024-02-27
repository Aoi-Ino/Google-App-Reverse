package com.nic.mparivahan.ClServices.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.SlotDet;
import com.nic.mparivahan.dlservices.ui.slots.calendar.ExpandableHeightGridView;
import gk.b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import ni.e1;
import oi.g;
import org.json.JSONArray;
import org.json.JSONObject;
import p9.r2;
import p9.s2;
import p9.t2;
import p9.u2;
import p9.v2;
import pl.x;

public final class ClSots extends g implements b.a {
    public e1 J;
    /* access modifiers changed from: private */
    public jk.a K;
    private gk.b L;
    /* access modifiers changed from: private */
    public ProgressDialog M;
    private LinearLayout N;
    private View O;
    private String P;
    private ArrayList Q = new ArrayList();
    private ArrayList R = new ArrayList();
    private final ArrayList S = new ArrayList();
    private String T;
    private String U;
    public String V;
    private String W = "";
    private String X = "";
    private String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f7922a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f7923b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private String f7924c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    private String f7925d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private String f7926e0 = "";

    /* renamed from: f0  reason: collision with root package name */
    private String f7927f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    private String f7928g0 = "";

    /* renamed from: h0  reason: collision with root package name */
    public ld.c f7929h0;

    /* renamed from: i0  reason: collision with root package name */
    public ld.f f7930i0;

    /* renamed from: j0  reason: collision with root package name */
    private final ArrayList f7931j0 = new ArrayList();

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClSots f7932e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f7933f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f7934g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f7935h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ClSots clSots, String str, int i10, int i11) {
            super(1);
            this.f7932e = clSots;
            this.f7933f = str;
            this.f7934g = i10;
            this.f7935h = i11;
        }

        public final void b(String str) {
            String O1;
            cm.l.f(str, "it");
            if (p.o(str, "yes", true) && (O1 = this.f7932e.O1()) != null) {
                ClSots clSots = this.f7932e;
                ClSots clSots2 = clSots;
                clSots2.d2(O1, clSots, this.f7933f, this.f7934g, clSots.P1(), this.f7935h);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final b f7936e = new b();

        b() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClSots f7937e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ClSots clSots) {
            super(1);
            this.f7937e = clSots;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            this.f7937e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7938a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f7938a = lVar;
        }

        public final pl.c a() {
            return this.f7938a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7938a.invoke(obj);
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

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ProgressDialog f7939e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ClSots f7940f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f7941g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ProgressDialog progressDialog, ClSots clSots, int i10) {
            super(1);
            this.f7939e = progressDialog;
            this.f7940f = clSots;
            this.f7941g = i10;
        }

        public final void b(JSONObject jSONObject) {
            try {
                this.f7939e.dismiss();
                Log.d("save_slot", jSONObject.toString());
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (p.o(jSONObject2.getString("status_code"), "00", true)) {
                    ClSots clSots = this.f7940f;
                    clSots.X1(clSots.N1().b("label_dl_Service_instered", this.f7940f.getString(R.string.dl_ll)), this.f7941g);
                    return;
                }
                this.f7940f.a2(jSONObject2.getString("status_desc"));
            } catch (Exception unused) {
                ClSots clSots2 = this.f7940f;
                clSots2.a2(clSots2.N1().b("service_is_not_present", this.f7940f.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((JSONObject) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClSots f7942e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ ClSots f7943e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(ClSots clSots) {
                super(1);
                this.f7943e = clSots;
            }

            public final void b(JSONObject jSONObject) {
                try {
                    ProgressDialog A1 = this.f7943e.M;
                    if (A1 == null) {
                        cm.l.v("pDialog");
                        A1 = null;
                    }
                    A1.dismiss();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                    if (p.o(jSONObject2.getString("status_code"), "00", true)) {
                        JSONArray jSONArray = jSONObject2.getJSONArray("Slot_Details");
                        int length = jSONArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                            if (jSONObject3.getInt("avalableSeats") > 0) {
                                SlotDet slotDet = new SlotDet();
                                String string = jSONObject3.getString("quotadt");
                                cm.l.e(string, "getString(...)");
                                slotDet.setQuotadt(string);
                                String string2 = jSONObject3.getString("timeForDisp");
                                cm.l.e(string2, "getString(...)");
                                slotDet.setTimeForDisp(string2);
                                slotDet.setAvalableSeats(jSONObject3.getInt("avalableSeats"));
                                slotDet.setQaflag(jSONObject3.getBoolean("qaflag"));
                                slotDet.setQcflag(jSONObject3.getBoolean("qcflag"));
                                slotDet.setSlotNo(jSONObject3.getInt("slotNo"));
                                slotDet.setHflag(jSONObject3.getBoolean("hflag"));
                                String string3 = jSONObject3.getString("rtoCode");
                                cm.l.e(string3, "getString(...)");
                                slotDet.setRtoCode(string3);
                                this.f7943e.K1().add(slotDet);
                            }
                        }
                        ClSots clSots = this.f7943e;
                        clSots.c2(clSots.K1());
                        return;
                    }
                    ClSots clSots2 = this.f7943e;
                    clSots2.b2(clSots2, jSONObject2.getString("status_desc"));
                } catch (Exception unused) {
                    ClSots clSots3 = this.f7943e;
                    clSots3.a2(clSots3.N1().b("service_is_not_present", this.f7943e.getString(R.string.unable_to_get_details)));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((JSONObject) obj);
                return x.f30437a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ClSots clSots) {
            super(1);
            this.f7942e = clSots;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|21|22|23|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0095 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(org.json.JSONObject r11) {
            /*
                r10 = this;
                java.lang.String r0 = "service_is_not_present"
                java.lang.String r1 = "rtoCd"
                r2 = 2132019337(0x7f140889, float:1.9677006E38)
                com.nic.mparivahan.ClServices.View.ClSots r3 = r10.f7942e     // Catch:{ Exception -> 0x00a9 }
                android.app.ProgressDialog r3 = r3.M     // Catch:{ Exception -> 0x00a9 }
                r4 = 0
                if (r3 != 0) goto L_0x0016
                java.lang.String r3 = "pDialog"
                cm.l.v(r3)     // Catch:{ Exception -> 0x00a9 }
                r3 = r4
            L_0x0016:
                r3.dismiss()     // Catch:{ Exception -> 0x00a9 }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x00a9 }
                r3.<init>((java.lang.String) r11)     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r11 = "status_code"
                java.lang.String r11 = r3.getString(r11)     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r5 = "00"
                boolean r11 = cm.l.a(r11, r5)     // Catch:{ Exception -> 0x00a9 }
                if (r11 == 0) goto L_0x0089
                java.lang.String r11 = "Applcnt_Details"
                org.json.JSONArray r11 = r3.getJSONArray(r11)     // Catch:{ Exception -> 0x00a9 }
                int r3 = r11.length()     // Catch:{ Exception -> 0x00a9 }
                r5 = 0
            L_0x003b:
                if (r5 >= r3) goto L_0x00bc
                org.json.JSONObject r6 = r11.getJSONObject(r5)     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r7 = r6.getString(r1)     // Catch:{ Exception -> 0x00a9 }
                if (r7 == 0) goto L_0x0086
                int r7 = r7.length()     // Catch:{ Exception -> 0x00a9 }
                if (r7 != 0) goto L_0x004e
                goto L_0x0086
            L_0x004e:
                com.nic.mparivahan.ClServices.View.ClSots r7 = r10.f7942e     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r6 = r6.getString(r1)     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r8 = "getString(...)"
                cm.l.e(r6, r8)     // Catch:{ Exception -> 0x00a9 }
                r7.j2(r6)     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.ClServices.View.ClSots r6 = r10.f7942e     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r7 = r6.Q1()     // Catch:{ Exception -> 0x00a9 }
                r6.H1(r6, r7)     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.ClServices.View.ClSots r6 = r10.f7942e     // Catch:{ Exception -> 0x00a9 }
                jk.a r6 = r6.K     // Catch:{ Exception -> 0x00a9 }
                if (r6 != 0) goto L_0x0073
                java.lang.String r6 = "viewModel"
                cm.l.v(r6)     // Catch:{ Exception -> 0x00a9 }
                r6 = r4
            L_0x0073:
                androidx.lifecycle.y r6 = r6.i()     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.ClServices.View.ClSots r7 = r10.f7942e     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.ClServices.View.ClSots$f$a r8 = new com.nic.mparivahan.ClServices.View.ClSots$f$a     // Catch:{ Exception -> 0x00a9 }
                r8.<init>(r7)     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.ClServices.View.ClSots$d r9 = new com.nic.mparivahan.ClServices.View.ClSots$d     // Catch:{ Exception -> 0x00a9 }
                r9.<init>(r8)     // Catch:{ Exception -> 0x00a9 }
                r6.g(r7, r9)     // Catch:{ Exception -> 0x00a9 }
            L_0x0086:
                int r5 = r5 + 1
                goto L_0x003b
            L_0x0089:
                java.lang.String r11 = "status_desc"
                java.lang.String r11 = r3.getString(r11)     // Catch:{ Exception -> 0x0095 }
                com.nic.mparivahan.ClServices.View.ClSots r1 = r10.f7942e     // Catch:{ Exception -> 0x0095 }
                r1.a2(r11)     // Catch:{ Exception -> 0x0095 }
                goto L_0x00bc
            L_0x0095:
                com.nic.mparivahan.ClServices.View.ClSots r11 = r10.f7942e     // Catch:{ Exception -> 0x00a9 }
                ld.c r1 = r11.N1()     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.ClServices.View.ClSots r3 = r10.f7942e     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r3 = r3.getString(r2)     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r1 = r1.b(r0, r3)     // Catch:{ Exception -> 0x00a9 }
                r11.a2(r1)     // Catch:{ Exception -> 0x00a9 }
                goto L_0x00bc
            L_0x00a9:
                com.nic.mparivahan.ClServices.View.ClSots r11 = r10.f7942e
                ld.c r1 = r11.N1()
                com.nic.mparivahan.ClServices.View.ClSots r3 = r10.f7942e
                java.lang.String r2 = r3.getString(r2)
                java.lang.String r0 = r1.b(r0, r2)
                r11.a2(r0)
            L_0x00bc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.ClSots.f.b(org.json.JSONObject):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((JSONObject) obj);
            return x.f30437a;
        }
    }

    private final ArrayList M1(Calendar calendar) {
        String format = new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
        String format2 = new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(calendar.getTimeInMillis()));
        String format3 = new SimpleDateFormat("EEE, MMM d").format(Long.valueOf(calendar.getTimeInMillis()));
        String format4 = new SimpleDateFormat("EEEE").format(Long.valueOf(calendar.getTimeInMillis()));
        L1().B.setText(format3);
        if (format.equals(format2)) {
            L1().C.setText("Today");
        } else {
            L1().C.setText(format4);
        }
        ArrayList arrayList = new ArrayList();
        for (SlotDet slotDet : this.S) {
            if (p.o(slotDet.getQuotadt(), format2, true) && slotDet.getQaflag()) {
                arrayList.add(slotDet);
            }
        }
        return arrayList;
    }

    private final Intent S1(int i10) {
        Intent intent = new Intent(this, ClSlotsAcknow.class);
        intent.putExtra("dl_st_appl_ackno_no", this.T);
        intent.putExtra("dl_st_appl_ackno_no_dob", this.U);
        intent.putExtra("slot-date", ((SlotDet) this.f7931j0.get(i10)).getQuotadt());
        intent.putExtra("slot-time", ((SlotDet) this.f7931j0.get(i10)).getTimeForDisp());
        return intent;
    }

    private final void T1() {
        L1().I.f29580g.setText(R1().i());
        L1().I.f29581h.setPaintFlags(L1().I.f29581h.getPaintFlags() | 8);
        TextView textView = L1().I.f29581h;
        String str = this.W;
        cm.l.c(str);
        textView.setText(q.B0(str).toString());
        L1().I.f29581h.setOnClickListener(new u2(this));
    }

    /* access modifiers changed from: private */
    public static final void U1(ClSots clSots, View view) {
        cm.l.f(clSots, "this$0");
        try {
            Intent intent = new Intent(clSots, ClDetailsTop.class);
            intent.putExtra("dlValue", q.B0(String.valueOf(clSots.W)).toString());
            intent.putExtra("dobValue", clSots.X);
            intent.putExtra("fatherName", clSots.f7923b0);
            intent.putExtra("clName", clSots.f7922a0);
            intent.putExtra("clPhoto", clSots.f7926e0);
            intent.putExtra("address", clSots.f7924c0).toString();
            intent.putExtra("issuing_authority", clSots.f7927f0).toString();
            intent.putExtra("validity", clSots.f7928g0).toString();
            intent.putExtra("cl_Status", clSots.f7925d0).toString();
            clSots.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void V1(ClSots clSots, View view) {
        cm.l.f(clSots, "this$0");
        clSots.finish();
    }

    /* access modifiers changed from: private */
    public static final void W1(ClSots clSots, View view) {
        cm.l.f(clSots, "this$0");
        clSots.finish();
    }

    /* access modifiers changed from: private */
    public final void X1(String str, int i10) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText("Next");
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(N1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(N1().b("btn_dl_serv_next", "Next"));
        textView.setOnClickListener(new v2(this, i10, dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void Y1(ClSots clSots, int i10, Dialog dialog, View view) {
        cm.l.f(clSots, "this$0");
        cm.l.f(dialog, "$d");
        try {
            clSots.startActivity(clSots.S1(i10));
        } catch (Exception unused) {
        }
        dialog.dismiss();
        clSots.finish();
    }

    private final void Z1(String str, String str2, int i10, int i11) {
        String b10 = N1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        g.n1(this, b10, str, 0, (String) null, (String) null, new a(this, str2, i10, i11), 24, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void a2(String str) {
        if (str != null) {
            String b10 = N1().b("nex_parivahan", getString(R.string.app_name));
            cm.l.c(b10);
            String b11 = N1().b("btn_ok", getString(R.string.ok_txt));
            cm.l.c(b11);
            g.n1(this, b10, str, 1, b11, (String) null, b.f7936e, 16, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void b2(Context context, String str) {
        if (str != null) {
            String b10 = N1().b("nex_parivahan", getString(R.string.app_name));
            cm.l.c(b10);
            String b11 = N1().b("btn_ok", getString(R.string.ok_txt));
            cm.l.c(b11);
            g.n1(this, b10, str, 1, b11, (String) null, new c(this), 16, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        if (r3 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        if (r3 != null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0016 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c2(java.util.ArrayList r9) {
        /*
            r8 = this;
            int r0 = r9.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "size"
            android.util.Log.d(r1, r0)
            java.util.ArrayList r0 = r8.R
            r0.clear()
            java.util.Iterator r9 = r9.iterator()
        L_0x0016:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r9.next()
            com.nic.mparivahan.dlservices.data.model.SlotDet r0 = (com.nic.mparivahan.dlservices.data.model.SlotDet) r0
            java.lang.String r2 = r0.getQuotadt()
            java.lang.String r3 = "dd-MM-yyyy"
            java.lang.String r4 = "yyyy/MM/dd"
            java.util.Date r2 = r8.I1(r2, r3, r4)
            boolean r3 = r0.getQaflag()
            r4 = 0
            java.lang.String r5 = "getDrawable(...)"
            if (r3 == 0) goto L_0x005c
            int r3 = r0.getAvalableSeats()
            if (r3 <= 0) goto L_0x005c
            if (r2 == 0) goto L_0x0053
            hk.e r3 = new hk.e
            android.content.res.Resources r6 = r8.getResources()
            r7 = 2131231011(0x7f080123, float:1.807809E38)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r7)
            cm.l.e(r6, r5)
            r3.<init>(r2, r6)
            goto L_0x0054
        L_0x0053:
            r3 = r4
        L_0x0054:
            if (r3 == 0) goto L_0x007c
        L_0x0056:
            java.util.ArrayList r6 = r8.R
            r6.add(r3)
            goto L_0x007c
        L_0x005c:
            boolean r3 = r0.getQcflag()
            if (r3 == 0) goto L_0x007c
            if (r2 == 0) goto L_0x0078
            hk.e r3 = new hk.e
            android.content.res.Resources r6 = r8.getResources()
            r7 = 2131231012(0x7f080124, float:1.8078093E38)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r7)
            cm.l.e(r6, r5)
            r3.<init>(r2, r6)
            goto L_0x0079
        L_0x0078:
            r3 = r4
        L_0x0079:
            if (r3 == 0) goto L_0x007c
            goto L_0x0056
        L_0x007c:
            boolean r0 = r0.getHflag()
            if (r0 == 0) goto L_0x0016
            if (r2 == 0) goto L_0x0097
            hk.e r4 = new hk.e
            android.content.res.Resources r0 = r8.getResources()
            r3 = 2131231009(0x7f080121, float:1.8078087E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r3)
            cm.l.e(r0, r5)
            r4.<init>(r2, r0)
        L_0x0097:
            if (r4 == 0) goto L_0x0016
            java.util.ArrayList r0 = r8.R
            r0.add(r4)
            goto L_0x0016
        L_0x00a0:
            java.util.ArrayList r9 = r8.R
            int r9 = r9.size()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            android.util.Log.d(r1, r9)
            r8.f2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.ClSots.c2(java.util.ArrayList):void");
    }

    /* access modifiers changed from: private */
    public static final void g2(ClSots clSots, AdapterView adapterView, View view, int i10, long j10) {
        cm.l.f(clSots, "this$0");
        if (adapterView != null) {
            int i11 = (int) j10;
            if (adapterView.getAdapter().getView(i11, view, adapterView).getAlpha() != 0.4f) {
                Calendar instance = Calendar.getInstance();
                instance.setTime(new Date());
                Calendar instance2 = Calendar.getInstance();
                Object item = adapterView.getAdapter().getItem(i11);
                cm.l.d(item, "null cannot be cast to non-null type java.util.Date");
                instance2.setTime((Date) item);
                boolean z10 = instance.get(6) == instance2.get(6);
                if (instance.after(instance2) && !z10) {
                    clSots.t1(clSots.N1().b("previous_date", clSots.getString(R.string.prev_date)), clSots.L1().m());
                }
                try {
                    cm.l.c(instance2);
                    clSots.l2(instance2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|(4:6|7|(1:9)(1:10)|11)|12|13|(4:15|(1:17)(1:20)|21|26)(2:22|27)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0134 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x013c A[Catch:{ Exception -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x015e A[Catch:{ Exception -> 0x0149 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h2() {
        /*
            r4 = this;
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            r1 = 2131362453(0x7f0a0295, float:1.8344687E38)
            android.view.View r1 = r4.findViewById(r1)
            r4.O = r1
            r1 = 2131363417(0x7f0a0659, float:1.8346642E38)
            android.view.View r1 = r4.findViewById(r1)
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.LinearLayout"
            cm.l.d(r1, r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r4.N = r1
            ni.e1 r1 = r4.L1()
            androidx.recyclerview.widget.RecyclerView r1 = r1.M
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r2.<init>(r4)
            r1.setLayoutManager(r2)
            androidx.lifecycle.u0 r1 = new androidx.lifecycle.u0
            r1.<init>(r4)
            java.lang.Class<jk.a> r2 = jk.a.class
            androidx.lifecycle.t0 r1 = r1.a(r2)
            jk.a r1 = (jk.a) r1
            r4.K = r1
            ni.e1 r1 = r4.L1()
            r1.v(r4)
            android.content.Intent r1 = r4.getIntent()
            if (r1 == 0) goto L_0x017f
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0149 }
            r2 = 0
            if (r1 == 0) goto L_0x0134
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = "dl_st_appl_ackno_no"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0134 }
            r4.T = r1     // Catch:{ Exception -> 0x0134 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = "dl_st_appl_ackno_no_dob"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r1 = r4.J1(r1)     // Catch:{ Exception -> 0x0134 }
            r4.U = r1     // Catch:{ Exception -> 0x0134 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0134 }
            android.os.Bundle r1 = r1.getExtras()     // Catch:{ Exception -> 0x0134 }
            if (r1 == 0) goto L_0x0081
            java.lang.String r3 = "lastEndorseRTOCode"
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x0134 }
            goto L_0x0082
        L_0x0081:
            r1 = r2
        L_0x0082:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0134 }
            r4.P = r1     // Catch:{ Exception -> 0x0134 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = "DL"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0134 }
            r4.W = r1     // Catch:{ Exception -> 0x0134 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = "dob"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0134 }
            r4.X = r1     // Catch:{ Exception -> 0x0134 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = "Mobile_no"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0134 }
            r4.Y = r1     // Catch:{ Exception -> 0x0134 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = "lastEndorsedRTO"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x0134 }
            cm.l.d(r1, r0)     // Catch:{ Exception -> 0x0134 }
            r4.Z = r1     // Catch:{ Exception -> 0x0134 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = "clName"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x0134 }
            cm.l.d(r1, r0)     // Catch:{ Exception -> 0x0134 }
            r4.f7922a0 = r1     // Catch:{ Exception -> 0x0134 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = "fatherName"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x0134 }
            cm.l.d(r1, r0)     // Catch:{ Exception -> 0x0134 }
            r4.f7923b0 = r1     // Catch:{ Exception -> 0x0134 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = "address"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0134 }
            r4.f7924c0 = r1     // Catch:{ Exception -> 0x0134 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = "issuing_authority"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0134 }
            r4.f7927f0 = r1     // Catch:{ Exception -> 0x0134 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = "validity"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0134 }
            r4.f7928g0 = r1     // Catch:{ Exception -> 0x0134 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = "cl_Status"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0134 }
            r4.f7925d0 = r1     // Catch:{ Exception -> 0x0134 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = "clPhoto"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x0134 }
            cm.l.d(r1, r0)     // Catch:{ Exception -> 0x0134 }
            r4.f7926e0 = r1     // Catch:{ Exception -> 0x0134 }
        L_0x0134:
            com.nic.mparivahan.a$a r0 = com.nic.mparivahan.a.f9624a     // Catch:{ Exception -> 0x0149 }
            boolean r0 = r0.a(r4)     // Catch:{ Exception -> 0x0149 }
            if (r0 == 0) goto L_0x015e
            r4.G1(r4)     // Catch:{ Exception -> 0x0149 }
            jk.a r0 = r4.K     // Catch:{ Exception -> 0x0149 }
            if (r0 != 0) goto L_0x014b
            java.lang.String r0 = "viewModel"
            cm.l.v(r0)     // Catch:{ Exception -> 0x0149 }
            goto L_0x014c
        L_0x0149:
            r0 = move-exception
            goto L_0x017c
        L_0x014b:
            r2 = r0
        L_0x014c:
            androidx.lifecycle.y r0 = r2.h()     // Catch:{ Exception -> 0x0149 }
            com.nic.mparivahan.ClServices.View.ClSots$f r1 = new com.nic.mparivahan.ClServices.View.ClSots$f     // Catch:{ Exception -> 0x0149 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0149 }
            com.nic.mparivahan.ClServices.View.ClSots$d r2 = new com.nic.mparivahan.ClServices.View.ClSots$d     // Catch:{ Exception -> 0x0149 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0149 }
            r0.g(r4, r2)     // Catch:{ Exception -> 0x0149 }
            goto L_0x017f
        L_0x015e:
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ Exception -> 0x0149 }
            ld.c r1 = r4.N1()     // Catch:{ Exception -> 0x0149 }
            java.lang.String r2 = "label_log_check_internet"
            r3 = 2132018237(0x7f14043d, float:1.9674775E38)
            java.lang.String r3 = r4.getString(r3)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x0149 }
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)     // Catch:{ Exception -> 0x0149 }
            r0.show()     // Catch:{ Exception -> 0x0149 }
            goto L_0x017f
        L_0x017c:
            r0.printStackTrace()
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.ClSots.h2():void");
    }

    private final void l2(Calendar calendar) {
        this.f7931j0.clear();
        this.f7931j0.addAll(M1(calendar));
        this.L = new gk.b(this, this.f7931j0, this);
        RecyclerView recyclerView = L1().M;
        gk.b bVar = this.L;
        if (bVar == null) {
            cm.l.v("adapter");
            bVar = null;
        }
        recyclerView.setAdapter(bVar);
    }

    public final void G1(Context context) {
        String str;
        cm.l.f(context, "context");
        try {
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.M = progressDialog;
            progressDialog.setMessage(context.getResources().getString(R.string.loading_msg));
            ProgressDialog progressDialog2 = this.M;
            jk.a aVar = null;
            if (progressDialog2 == null) {
                cm.l.v("pDialog");
                progressDialog2 = null;
            }
            progressDialog2.show();
            ProgressDialog progressDialog3 = this.M;
            if (progressDialog3 == null) {
                cm.l.v("pDialog");
                progressDialog3 = null;
            }
            progressDialog3.setCancelable(false);
            ProgressDialog progressDialog4 = this.M;
            if (progressDialog4 == null) {
                cm.l.v("pDialog");
                progressDialog4 = null;
            }
            progressDialog4.setCanceledOnTouchOutside(false);
            String str2 = this.T;
            if (str2 != null && (str = this.U) != null) {
                jk.a aVar2 = this.K;
                if (aVar2 == null) {
                    cm.l.v("viewModel");
                } else {
                    aVar = aVar2;
                }
                aVar.g(str2, str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void H1(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "rtoCd");
        try {
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.M = progressDialog;
            progressDialog.setMessage(N1().b("label_challan_please_wait", "Please wait..."));
            ProgressDialog progressDialog2 = this.M;
            jk.a aVar = null;
            if (progressDialog2 == null) {
                cm.l.v("pDialog");
                progressDialog2 = null;
            }
            progressDialog2.show();
            ProgressDialog progressDialog3 = this.M;
            if (progressDialog3 == null) {
                cm.l.v("pDialog");
                progressDialog3 = null;
            }
            progressDialog3.setCancelable(false);
            ProgressDialog progressDialog4 = this.M;
            if (progressDialog4 == null) {
                cm.l.v("pDialog");
                progressDialog4 = null;
            }
            progressDialog4.setCanceledOnTouchOutside(false);
            jk.a aVar2 = this.K;
            if (aVar2 == null) {
                cm.l.v("viewModel");
            } else {
                aVar = aVar2;
            }
            aVar.k(q.B0(str).toString(), "0", "0");
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.d("checkAppSlots", e10.getLocalizedMessage());
        }
    }

    public final Date I1(String str, String str2, String str3) {
        cm.l.f(str, "dateToFormat");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Log.d("DATE", "Input Date Date is " + str);
            String format = new SimpleDateFormat(str3).format(new SimpleDateFormat(str2).parse(str));
            Log.d("DATE", "Output Date is " + format);
            return simpleDateFormat.parse(format);
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final String J1(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            cm.l.e(parse, "parse(...)");
            return simpleDateFormat2.format(parse);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final ArrayList K1() {
        return this.S;
    }

    public final e1 L1() {
        e1 e1Var = this.J;
        if (e1Var != null) {
            return e1Var;
        }
        cm.l.v("cBinding");
        return null;
    }

    public final ld.c N1() {
        ld.c cVar = this.f7929h0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final String O1() {
        return this.P;
    }

    public final String P1() {
        return this.T;
    }

    public final String Q1() {
        String str = this.V;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoCdNew");
        return null;
    }

    public final ld.f R1() {
        ld.f fVar = this.f7930i0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public void W(int i10, String str, int i11) {
        cm.l.f(str, "mDate");
        if (!com.nic.mparivahan.a.f9624a.a(this)) {
            Toast.makeText(getApplicationContext(), N1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        } else if (((SlotDet) this.f7931j0.get(i10)).getQaflag() && ((SlotDet) this.f7931j0.get(i10)).getAvalableSeats() > 0) {
            ld.c N1 = N1();
            String b10 = N1.b("label_sure_to_book_slot" + i11 + " on " + i11, "Are you sure to book Slot");
            cm.l.c(b10);
            Z1(b10, str, i11, i10);
        } else if (((SlotDet) this.f7931j0.get(i10)).getAvalableSeats() == 0) {
            t1(N1().b("label_slots_not_avl", ""), L1().m());
        }
    }

    public final void d2(String str, Context context, String str2, int i10, String str3, int i11) {
        jk.a aVar;
        cm.l.f(context, "mContext");
        cm.l.f(str2, "mDate");
        try {
            ProgressDialog progressDialog = new ProgressDialog(context);
            progressDialog.setMessage(N1().b("label_challan_please_wait", "Please wait..."));
            progressDialog.show();
            progressDialog.setCancelable(false);
            progressDialog.setCanceledOnTouchOutside(false);
            jk.a aVar2 = this.K;
            jk.a aVar3 = null;
            if (aVar2 == null) {
                cm.l.v("viewModel");
                aVar = null;
            } else {
                aVar = aVar2;
            }
            String Q1 = Q1();
            cm.l.c(Q1);
            String obj = q.B0(Q1.toString()).toString();
            cm.l.c(str3);
            aVar.l(obj, str3, str2, "" + i10, "0", "0");
            jk.a aVar4 = this.K;
            if (aVar4 == null) {
                cm.l.v("viewModel");
            } else {
                aVar3 = aVar4;
            }
            aVar3.j().g(this, new d(new e(progressDialog, this, i11)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void e2(e1 e1Var) {
        cm.l.f(e1Var, "<set-?>");
        this.J = e1Var;
    }

    public final void f2() {
        View view = this.O;
        ViewParent parent = view != null ? view.getParent() : null;
        cm.l.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeView(this.O);
        LinearLayout linearLayout = this.N;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        LinearLayout linearLayout2 = this.N;
        if (linearLayout2 != null) {
            linearLayout2.setOrientation(1);
        }
        hk.c cVar = new hk.c(this, this.R);
        cVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout3 = this.N;
        if (linearLayout3 != null) {
            linearLayout3.addView(cVar);
        }
        ExpandableHeightGridView calendarGridView = cVar.getCalendarGridView();
        if (calendarGridView != null) {
            calendarGridView.setOnItemClickListener(new t2(this));
        }
    }

    public final void i2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f7929h0 = cVar;
    }

    public final void j2(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final void k2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f7930i0 = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e1 x10 = e1.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        e2(x10);
        setContentView(L1().m());
        i2(new ld.c(this));
        k2(new ld.f(this));
        h2();
        T1();
        v9.e.f17509a.e0(this, L1());
        L1().I.f29577d.setOnClickListener(new r2(this));
        L1().E.f25959e.setOnClickListener(new s2(this));
    }

    public final void setCustom_view(View view) {
        this.O = view;
    }
}
