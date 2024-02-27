package com.nic.mparivahan.dlservices.newlearner;

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
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.d1;
import bj.e1;
import bj.f1;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.SlotDet;
import com.nic.mparivahan.dlservices.ui.slots.calendar.ExpandableHeightGridView;
import gk.b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import ni.j3;
import oi.g;
import org.json.JSONArray;
import org.json.JSONObject;
import pl.x;

public final class LLSlots extends g implements b.a {
    public j3 J;
    /* access modifiers changed from: private */
    public jk.a K;
    private gk.b L;
    /* access modifiers changed from: private */
    public ProgressDialog M;
    private LinearLayout N;
    private View O;
    private String P;
    private ArrayList Q = new ArrayList();
    private final ArrayList R = new ArrayList();
    private String S;
    private String T;
    public String U;
    private String V = "";
    private String W = "";
    private String X = "";
    private String Y = "";
    public ld.c Z;

    /* renamed from: a0  reason: collision with root package name */
    public ld.f f21721a0;

    /* renamed from: b0  reason: collision with root package name */
    private final ArrayList f21722b0 = new ArrayList();

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLSlots f21723e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f21724f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f21725g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f21726h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LLSlots lLSlots, String str, int i10, int i11) {
            super(1);
            this.f21723e = lLSlots;
            this.f21724f = str;
            this.f21725g = i10;
            this.f21726h = i11;
        }

        public final void b(String str) {
            String M1;
            cm.l.f(str, "it");
            if (p.o(str, "yes", true) && (M1 = this.f21723e.M1()) != null) {
                LLSlots lLSlots = this.f21723e;
                LLSlots lLSlots2 = lLSlots;
                lLSlots2.Y1(M1, lLSlots, this.f21724f, this.f21725g, lLSlots.N1(), this.f21726h);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final b f21727e = new b();

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
        final /* synthetic */ LLSlots f21728e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LLSlots lLSlots) {
            super(1);
            this.f21728e = lLSlots;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            this.f21728e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21729a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f21729a = lVar;
        }

        public final pl.c a() {
            return this.f21729a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21729a.invoke(obj);
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
        final /* synthetic */ ProgressDialog f21730e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ LLSlots f21731f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f21732g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ProgressDialog progressDialog, LLSlots lLSlots, int i10) {
            super(1);
            this.f21730e = progressDialog;
            this.f21731f = lLSlots;
            this.f21732g = i10;
        }

        public final void b(JSONObject jSONObject) {
            try {
                this.f21730e.dismiss();
                Log.d("save_slot", jSONObject.toString());
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (p.o(jSONObject2.getString("status_code"), "00", true)) {
                    LLSlots lLSlots = this.f21731f;
                    lLSlots.S1(lLSlots.L1().b("label_dl_Service_instered", this.f21731f.getString(R.string.dl_ll)), this.f21732g);
                    return;
                }
                this.f21731f.V1(jSONObject2.getString("status_desc"));
            } catch (Exception unused) {
                LLSlots lLSlots2 = this.f21731f;
                lLSlots2.V1(lLSlots2.L1().b("service_is_not_present", this.f21731f.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((JSONObject) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLSlots f21733e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ LLSlots f21734e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(LLSlots lLSlots) {
                super(1);
                this.f21734e = lLSlots;
            }

            public final void b(JSONObject jSONObject) {
                try {
                    ProgressDialog y12 = this.f21734e.M;
                    if (y12 == null) {
                        cm.l.v("pDialog");
                        y12 = null;
                    }
                    y12.dismiss();
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
                                this.f21734e.I1().add(slotDet);
                            }
                        }
                        LLSlots lLSlots = this.f21734e;
                        lLSlots.X1(lLSlots.I1());
                        return;
                    }
                    LLSlots lLSlots2 = this.f21734e;
                    lLSlots2.W1(lLSlots2, jSONObject2.getString("status_desc"));
                } catch (Exception unused) {
                    LLSlots lLSlots3 = this.f21734e;
                    lLSlots3.V1(lLSlots3.L1().b("service_is_not_present", this.f21734e.getString(R.string.unable_to_get_details)));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((JSONObject) obj);
                return x.f30437a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(LLSlots lLSlots) {
            super(1);
            this.f21733e = lLSlots;
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
                com.nic.mparivahan.dlservices.newlearner.LLSlots r3 = r10.f21733e     // Catch:{ Exception -> 0x00a9 }
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
                com.nic.mparivahan.dlservices.newlearner.LLSlots r7 = r10.f21733e     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r6 = r6.getString(r1)     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r8 = "getString(...)"
                cm.l.e(r6, r8)     // Catch:{ Exception -> 0x00a9 }
                r7.e2(r6)     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.dlservices.newlearner.LLSlots r6 = r10.f21733e     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r7 = r6.O1()     // Catch:{ Exception -> 0x00a9 }
                r6.F1(r6, r7)     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.dlservices.newlearner.LLSlots r6 = r10.f21733e     // Catch:{ Exception -> 0x00a9 }
                jk.a r6 = r6.K     // Catch:{ Exception -> 0x00a9 }
                if (r6 != 0) goto L_0x0073
                java.lang.String r6 = "viewModel"
                cm.l.v(r6)     // Catch:{ Exception -> 0x00a9 }
                r6 = r4
            L_0x0073:
                androidx.lifecycle.y r6 = r6.i()     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.dlservices.newlearner.LLSlots r7 = r10.f21733e     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.dlservices.newlearner.LLSlots$f$a r8 = new com.nic.mparivahan.dlservices.newlearner.LLSlots$f$a     // Catch:{ Exception -> 0x00a9 }
                r8.<init>(r7)     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.dlservices.newlearner.LLSlots$d r9 = new com.nic.mparivahan.dlservices.newlearner.LLSlots$d     // Catch:{ Exception -> 0x00a9 }
                r9.<init>(r8)     // Catch:{ Exception -> 0x00a9 }
                r6.g(r7, r9)     // Catch:{ Exception -> 0x00a9 }
            L_0x0086:
                int r5 = r5 + 1
                goto L_0x003b
            L_0x0089:
                java.lang.String r11 = "status_desc"
                java.lang.String r11 = r3.getString(r11)     // Catch:{ Exception -> 0x0095 }
                com.nic.mparivahan.dlservices.newlearner.LLSlots r1 = r10.f21733e     // Catch:{ Exception -> 0x0095 }
                r1.V1(r11)     // Catch:{ Exception -> 0x0095 }
                goto L_0x00bc
            L_0x0095:
                com.nic.mparivahan.dlservices.newlearner.LLSlots r11 = r10.f21733e     // Catch:{ Exception -> 0x00a9 }
                ld.c r1 = r11.L1()     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.dlservices.newlearner.LLSlots r3 = r10.f21733e     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r3 = r3.getString(r2)     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r1 = r1.b(r0, r3)     // Catch:{ Exception -> 0x00a9 }
                r11.V1(r1)     // Catch:{ Exception -> 0x00a9 }
                goto L_0x00bc
            L_0x00a9:
                com.nic.mparivahan.dlservices.newlearner.LLSlots r11 = r10.f21733e
                ld.c r1 = r11.L1()
                com.nic.mparivahan.dlservices.newlearner.LLSlots r3 = r10.f21733e
                java.lang.String r2 = r3.getString(r2)
                java.lang.String r0 = r1.b(r0, r2)
                r11.V1(r0)
            L_0x00bc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LLSlots.f.b(org.json.JSONObject):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((JSONObject) obj);
            return x.f30437a;
        }
    }

    private final ArrayList K1(Calendar calendar) {
        String format = new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
        String format2 = new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(calendar.getTimeInMillis()));
        String format3 = new SimpleDateFormat("EEE, MMM d").format(Long.valueOf(calendar.getTimeInMillis()));
        String format4 = new SimpleDateFormat("EEEE").format(Long.valueOf(calendar.getTimeInMillis()));
        J1().B.setText(format3);
        if (format.equals(format2)) {
            J1().C.setText("Today");
        } else {
            J1().C.setText(format4);
        }
        ArrayList arrayList = new ArrayList();
        for (SlotDet slotDet : this.R) {
            if (p.o(slotDet.getQuotadt(), format2, true) && slotDet.getQaflag()) {
                arrayList.add(slotDet);
            }
        }
        return arrayList;
    }

    private final Intent Q1(int i10) {
        Intent intent = new Intent(this, LLSlotsAcknowActivity.class);
        intent.putExtra("dl_st_appl_ackno_no", this.S);
        intent.putExtra("dl_st_appl_ackno_no_dob", this.T);
        intent.putExtra("slot-date", ((SlotDet) this.f21722b0.get(i10)).getQuotadt());
        intent.putExtra("slot-time", ((SlotDet) this.f21722b0.get(i10)).getTimeForDisp());
        return intent;
    }

    /* access modifiers changed from: private */
    public static final void R1(LLSlots lLSlots, View view) {
        cm.l.f(lLSlots, "this$0");
        lLSlots.finish();
    }

    /* access modifiers changed from: private */
    public final void S1(String str, int i10) {
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
        ((TextView) findViewById3).setText(L1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(L1().b("btn_dl_serv_next", "Next"));
        textView.setOnClickListener(new f1(this, i10, dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void T1(LLSlots lLSlots, int i10, Dialog dialog, View view) {
        cm.l.f(lLSlots, "this$0");
        cm.l.f(dialog, "$d");
        lLSlots.startActivity(lLSlots.Q1(i10));
        dialog.dismiss();
        lLSlots.finish();
    }

    private final void U1(String str, String str2, int i10, int i11) {
        String b10 = L1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        g.n1(this, b10, str, 0, (String) null, (String) null, new a(this, str2, i10, i11), 24, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void V1(String str) {
        if (str != null) {
            String b10 = L1().b("nex_parivahan", getString(R.string.app_name));
            cm.l.c(b10);
            String b11 = L1().b("btn_ok", getString(R.string.ok_txt));
            cm.l.c(b11);
            g.n1(this, b10, str, 1, b11, (String) null, b.f21727e, 16, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void W1(Context context, String str) {
        if (str != null) {
            String b10 = L1().b("nex_parivahan", getString(R.string.app_name));
            cm.l.c(b10);
            String b11 = L1().b("btn_ok", getString(R.string.ok_txt));
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
    public final void X1(java.util.ArrayList r9) {
        /*
            r8 = this;
            int r0 = r9.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "size"
            android.util.Log.d(r1, r0)
            java.util.ArrayList r0 = r8.Q
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
            java.util.Date r2 = r8.G1(r2, r3, r4)
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
            java.util.ArrayList r6 = r8.Q
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
            java.util.ArrayList r0 = r8.Q
            r0.add(r4)
            goto L_0x0016
        L_0x00a0:
            java.util.ArrayList r9 = r8.Q
            int r9 = r9.size()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            android.util.Log.d(r1, r9)
            r8.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LLSlots.X1(java.util.ArrayList):void");
    }

    /* access modifiers changed from: private */
    public static final void b2(LLSlots lLSlots, AdapterView adapterView, View view, int i10, long j10) {
        cm.l.f(lLSlots, "this$0");
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
                    lLSlots.t1(lLSlots.L1().b("previous_date", lLSlots.getString(R.string.prev_date)), lLSlots.J1().m());
                }
                try {
                    cm.l.c(instance2);
                    lLSlots.g2(instance2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private final void c2() {
        this.O = findViewById(R.id.custom_view);
        View findViewById = findViewById(R.id.layoutCalender);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.N = (LinearLayout) findViewById;
        J1().L.setLayoutManager(new LinearLayoutManager(this));
        this.K = (jk.a) new u0(this).a(jk.a.class);
        J1().v(this);
        if (getIntent() != null) {
            new ld.f(this);
            try {
                jk.a aVar = null;
                if (getIntent() != null) {
                    this.S = String.valueOf(getIntent().getStringExtra("dl_st_appl_ackno_no"));
                    this.T = H1(String.valueOf(getIntent().getStringExtra("dl_st_appl_ackno_no_dob")));
                    Bundle extras = getIntent().getExtras();
                    this.P = String.valueOf(extras != null ? extras.get("lastEndorseRTOCode") : null);
                    this.V = String.valueOf(getIntent().getStringExtra("dob"));
                    this.W = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                    String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                    cm.l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                    this.X = stringExtra;
                    String stringExtra2 = getIntent().getStringExtra("aadharPhoto");
                    cm.l.c(stringExtra2);
                    this.Y = stringExtra2;
                }
                if (com.nic.mparivahan.a.f9624a.a(this)) {
                    E1(this);
                    jk.a aVar2 = this.K;
                    if (aVar2 == null) {
                        cm.l.v("viewModel");
                    } else {
                        aVar = aVar2;
                    }
                    aVar.h().g(this, new d(new f(this)));
                    return;
                }
                Toast.makeText(getApplicationContext(), L1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private final void g2(Calendar calendar) {
        this.f21722b0.clear();
        this.f21722b0.addAll(K1(calendar));
        this.L = new gk.b(this, this.f21722b0, this);
        RecyclerView recyclerView = J1().L;
        gk.b bVar = this.L;
        if (bVar == null) {
            cm.l.v("adapter");
            bVar = null;
        }
        recyclerView.setAdapter(bVar);
    }

    public final void E1(Context context) {
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
            String str2 = this.S;
            if (str2 != null && (str = this.T) != null) {
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

    public final void F1(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "rtoCd");
        try {
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.M = progressDialog;
            progressDialog.setMessage(L1().b("label_challan_please_wait", "Please wait..."));
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

    public final Date G1(String str, String str2, String str3) {
        cm.l.f(str, "dateToFormat");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Log.d("DATE", "Input Date Date is " + str);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str3);
            Date parse = new SimpleDateFormat(str2).parse(str);
            cm.l.c(parse);
            String format = simpleDateFormat2.format(parse);
            Log.d("DATE", "Output Date is " + format);
            return simpleDateFormat.parse(format);
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final String H1(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            cm.l.c(str);
            Date parse = simpleDateFormat.parse(str);
            cm.l.c(parse);
            return simpleDateFormat2.format(parse);
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final ArrayList I1() {
        return this.R;
    }

    public final j3 J1() {
        j3 j3Var = this.J;
        if (j3Var != null) {
            return j3Var;
        }
        cm.l.v("cBinding");
        return null;
    }

    public final ld.c L1() {
        ld.c cVar = this.Z;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final String M1() {
        return this.P;
    }

    public final String N1() {
        return this.S;
    }

    public final String O1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoCdNew");
        return null;
    }

    public final ld.f P1() {
        ld.f fVar = this.f21721a0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public void W(int i10, String str, int i11) {
        cm.l.f(str, "mDate");
        if (!com.nic.mparivahan.a.f9624a.a(this)) {
            Toast.makeText(getApplicationContext(), L1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        } else if (((SlotDet) this.f21722b0.get(i10)).getQaflag() && ((SlotDet) this.f21722b0.get(i10)).getAvalableSeats() > 0) {
            ld.c L1 = L1();
            String b10 = L1.b("label_sure_to_book_slot" + i11 + " on " + i11, "Are you sure to book Slot");
            cm.l.c(b10);
            U1(b10, str, i11, i10);
        } else if (((SlotDet) this.f21722b0.get(i10)).getAvalableSeats() == 0) {
            t1(L1().b("label_slots_not_avl", ""), J1().m());
        }
    }

    public final void Y1(String str, Context context, String str2, int i10, String str3, int i11) {
        jk.a aVar;
        cm.l.f(context, "mContext");
        cm.l.f(str2, "mDate");
        try {
            ProgressDialog progressDialog = new ProgressDialog(context);
            progressDialog.setMessage(L1().b("label_challan_please_wait", "Please wait..."));
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
            String obj = q.B0(O1().toString()).toString();
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

    public final void Z1(j3 j3Var) {
        cm.l.f(j3Var, "<set-?>");
        this.J = j3Var;
    }

    public final void a2() {
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
        hk.c cVar = new hk.c(this, this.Q);
        cVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout3 = this.N;
        if (linearLayout3 != null) {
            linearLayout3.addView(cVar);
        }
        ExpandableHeightGridView calendarGridView = cVar.getCalendarGridView();
        if (calendarGridView != null) {
            calendarGridView.setOnItemClickListener(new e1(this));
        }
    }

    public final void d2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Z = cVar;
    }

    public final void e2(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final void f2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f21721a0 = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_dl_slots);
        j3 x10 = j3.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        Z1(x10);
        setContentView(J1().m());
        d2(new ld.c(this));
        f2(new ld.f(this));
        J1().E.f25961g.setText(P1().i());
        c2();
        J1().E.f25959e.setOnClickListener(new d1(this));
    }

    public final void setCustom_view(View view) {
        this.O = view;
    }
}
