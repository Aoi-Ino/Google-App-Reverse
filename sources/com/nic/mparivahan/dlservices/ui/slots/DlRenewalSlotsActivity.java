package com.nic.mparivahan.dlservices.ui.slots;

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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.model.SlotDet;
import com.nic.mparivahan.dlservices.ui.slots.calendar.ExpandableHeightGridView;
import gk.b;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import ni.z2;
import oi.g;
import org.json.JSONArray;
import org.json.JSONObject;
import pl.x;
import v9.e;

public final class DlRenewalSlotsActivity extends g implements b.a {
    private z2 J;
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
    public DldetobjX V;
    public String W;
    private String X = "";
    private String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f22347a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f22348b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private String f22349c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    public ld.c f22350d0;

    /* renamed from: e0  reason: collision with root package name */
    public ArrayList f22351e0;

    /* renamed from: f0  reason: collision with root package name */
    public ArrayList f22352f0;

    /* renamed from: g0  reason: collision with root package name */
    public ld.f f22353g0;

    /* renamed from: h0  reason: collision with root package name */
    private String f22354h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    private String f22355i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    private final ArrayList f22356j0 = new ArrayList();

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlRenewalSlotsActivity f22357e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f22358f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f22359g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f22360h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DlRenewalSlotsActivity dlRenewalSlotsActivity, String str, int i10, int i11) {
            super(1);
            this.f22357e = dlRenewalSlotsActivity;
            this.f22358f = str;
            this.f22359g = i10;
            this.f22360h = i11;
        }

        public final void b(String str) {
            String Q1;
            cm.l.f(str, "it");
            if (p.o(str, "yes", true) && (Q1 = this.f22357e.Q1()) != null) {
                DlRenewalSlotsActivity dlRenewalSlotsActivity = this.f22357e;
                DlRenewalSlotsActivity dlRenewalSlotsActivity2 = dlRenewalSlotsActivity;
                dlRenewalSlotsActivity2.i2(Q1, dlRenewalSlotsActivity, this.f22358f, this.f22359g, dlRenewalSlotsActivity.S1(), this.f22360h);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final b f22361e = new b();

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
        final /* synthetic */ DlRenewalSlotsActivity f22362e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DlRenewalSlotsActivity dlRenewalSlotsActivity) {
            super(1);
            this.f22362e = dlRenewalSlotsActivity;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            this.f22362e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f22363a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f22363a = lVar;
        }

        public final pl.c a() {
            return this.f22363a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22363a.invoke(obj);
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
        final /* synthetic */ ProgressDialog f22364e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ DlRenewalSlotsActivity f22365f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f22366g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ProgressDialog progressDialog, DlRenewalSlotsActivity dlRenewalSlotsActivity, int i10) {
            super(1);
            this.f22364e = progressDialog;
            this.f22365f = dlRenewalSlotsActivity;
            this.f22366g = i10;
        }

        public final void b(JSONObject jSONObject) {
            try {
                this.f22364e.dismiss();
                Log.d("save_slot", jSONObject.toString());
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (p.o(jSONObject2.getString("status_code"), "00", true)) {
                    DlRenewalSlotsActivity dlRenewalSlotsActivity = this.f22365f;
                    dlRenewalSlotsActivity.c2(dlRenewalSlotsActivity.P1().b("label_dl_Service_instered", this.f22365f.getString(R.string.dl_ll)), this.f22366g);
                    return;
                }
                this.f22365f.f2(jSONObject2.getString("status_desc"));
            } catch (Exception unused) {
                DlRenewalSlotsActivity dlRenewalSlotsActivity2 = this.f22365f;
                dlRenewalSlotsActivity2.f2(dlRenewalSlotsActivity2.P1().b("service_is_not_present", this.f22365f.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((JSONObject) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlRenewalSlotsActivity f22367e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ DlRenewalSlotsActivity f22368e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(DlRenewalSlotsActivity dlRenewalSlotsActivity) {
                super(1);
                this.f22368e = dlRenewalSlotsActivity;
            }

            public final void b(JSONObject jSONObject) {
                try {
                    ProgressDialog C1 = this.f22368e.M;
                    if (C1 == null) {
                        cm.l.v("pDialog");
                        C1 = null;
                    }
                    C1.dismiss();
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
                                this.f22368e.M1().add(slotDet);
                            }
                        }
                        DlRenewalSlotsActivity dlRenewalSlotsActivity = this.f22368e;
                        dlRenewalSlotsActivity.h2(dlRenewalSlotsActivity.M1());
                        return;
                    }
                    DlRenewalSlotsActivity dlRenewalSlotsActivity2 = this.f22368e;
                    dlRenewalSlotsActivity2.g2(dlRenewalSlotsActivity2, jSONObject2.getString("status_desc"));
                } catch (Exception unused) {
                    DlRenewalSlotsActivity dlRenewalSlotsActivity3 = this.f22368e;
                    dlRenewalSlotsActivity3.f2(dlRenewalSlotsActivity3.P1().b("service_is_not_present", this.f22368e.getString(R.string.unable_to_get_details)));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((JSONObject) obj);
                return x.f30437a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(DlRenewalSlotsActivity dlRenewalSlotsActivity) {
            super(1);
            this.f22367e = dlRenewalSlotsActivity;
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
                com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity r3 = r10.f22367e     // Catch:{ Exception -> 0x00a9 }
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
                com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity r7 = r10.f22367e     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r6 = r6.getString(r1)     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r8 = "getString(...)"
                cm.l.e(r6, r8)     // Catch:{ Exception -> 0x00a9 }
                r7.q2(r6)     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity r6 = r10.f22367e     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r7 = r6.U1()     // Catch:{ Exception -> 0x00a9 }
                r6.J1(r6, r7)     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity r6 = r10.f22367e     // Catch:{ Exception -> 0x00a9 }
                jk.a r6 = r6.K     // Catch:{ Exception -> 0x00a9 }
                if (r6 != 0) goto L_0x0073
                java.lang.String r6 = "viewModel"
                cm.l.v(r6)     // Catch:{ Exception -> 0x00a9 }
                r6 = r4
            L_0x0073:
                androidx.lifecycle.y r6 = r6.i()     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity r7 = r10.f22367e     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity$f$a r8 = new com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity$f$a     // Catch:{ Exception -> 0x00a9 }
                r8.<init>(r7)     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity$d r9 = new com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity$d     // Catch:{ Exception -> 0x00a9 }
                r9.<init>(r8)     // Catch:{ Exception -> 0x00a9 }
                r6.g(r7, r9)     // Catch:{ Exception -> 0x00a9 }
            L_0x0086:
                int r5 = r5 + 1
                goto L_0x003b
            L_0x0089:
                java.lang.String r11 = "status_desc"
                java.lang.String r11 = r3.getString(r11)     // Catch:{ Exception -> 0x0095 }
                com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity r1 = r10.f22367e     // Catch:{ Exception -> 0x0095 }
                r1.f2(r11)     // Catch:{ Exception -> 0x0095 }
                goto L_0x00bc
            L_0x0095:
                com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity r11 = r10.f22367e     // Catch:{ Exception -> 0x00a9 }
                ld.c r1 = r11.P1()     // Catch:{ Exception -> 0x00a9 }
                com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity r3 = r10.f22367e     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r3 = r3.getString(r2)     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r1 = r1.b(r0, r3)     // Catch:{ Exception -> 0x00a9 }
                r11.f2(r1)     // Catch:{ Exception -> 0x00a9 }
                goto L_0x00bc
            L_0x00a9:
                com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity r11 = r10.f22367e
                ld.c r1 = r11.P1()
                com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity r3 = r10.f22367e
                java.lang.String r2 = r3.getString(r2)
                java.lang.String r0 = r1.b(r0, r2)
                r11.f2(r0)
            L_0x00bc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity.f.b(org.json.JSONObject):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((JSONObject) obj);
            return x.f30437a;
        }
    }

    private final ArrayList N1(Calendar calendar) {
        String format = new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
        String format2 = new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(calendar.getTimeInMillis()));
        String format3 = new SimpleDateFormat("EEE, MMM d").format(Long.valueOf(calendar.getTimeInMillis()));
        String format4 = new SimpleDateFormat("EEEE").format(Long.valueOf(calendar.getTimeInMillis()));
        z2 z2Var = this.J;
        z2 z2Var2 = null;
        if (z2Var == null) {
            cm.l.v("mBinding");
            z2Var = null;
        }
        z2Var.B.setText(format3);
        if (format.equals(format2)) {
            z2 z2Var3 = this.J;
            if (z2Var3 == null) {
                cm.l.v("mBinding");
            } else {
                z2Var2 = z2Var3;
            }
            z2Var2.C.setText("Today");
        } else {
            z2 z2Var4 = this.J;
            if (z2Var4 == null) {
                cm.l.v("mBinding");
            } else {
                z2Var2 = z2Var4;
            }
            z2Var2.C.setText(format4);
        }
        ArrayList arrayList = new ArrayList();
        for (SlotDet slotDet : this.S) {
            if (p.o(slotDet.getQuotadt(), format2, true) && slotDet.getQaflag()) {
                arrayList.add(slotDet);
            }
        }
        return arrayList;
    }

    private final Intent W1(int i10) {
        Intent intent = new Intent(this, DlSlotsAcknowActivity.class);
        intent.putExtra("dl_st_appl_ackno_no", this.T);
        intent.putExtra("dl_st_appl_ackno_no_dob", this.U);
        intent.putExtra("dl_st_dl_details_obj", O1());
        intent.putExtra("slot-date", ((SlotDet) this.f22356j0.get(i10)).getQuotadt());
        intent.putExtra("slot-time", ((SlotDet) this.f22356j0.get(i10)).getTimeForDisp());
        return intent;
    }

    /* access modifiers changed from: private */
    public static final void X1(DlRenewalSlotsActivity dlRenewalSlotsActivity, View view) {
        cm.l.f(dlRenewalSlotsActivity, "this$0");
        dlRenewalSlotsActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void Y1(DlRenewalSlotsActivity dlRenewalSlotsActivity, View view) {
        cm.l.f(dlRenewalSlotsActivity, "this$0");
        try {
            Intent intent = new Intent(dlRenewalSlotsActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", dlRenewalSlotsActivity.X);
            intent.putExtra("dob", dlRenewalSlotsActivity.Y);
            intent.putExtra("DLDetails", dlRenewalSlotsActivity.O1());
            intent.putExtra("Mobile_no", dlRenewalSlotsActivity.Z);
            intent.putExtra("lastEndorsedRTO", dlRenewalSlotsActivity.f22347a0);
            intent.putExtra("lastEndorsedState", dlRenewalSlotsActivity.f22348b0);
            intent.putExtra("lastEndorsedRTOCode", dlRenewalSlotsActivity.P);
            intent.putExtra("lastEndorseStateCode", dlRenewalSlotsActivity.f22349c0);
            if (cm.l.a(dlRenewalSlotsActivity.V1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", dlRenewalSlotsActivity.T1());
            }
            dlRenewalSlotsActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void Z1(DlRenewalSlotsActivity dlRenewalSlotsActivity, View view) {
        cm.l.f(dlRenewalSlotsActivity, "this$0");
        if (cm.l.a(dlRenewalSlotsActivity.V1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (dlRenewalSlotsActivity.R1().size() > 1) {
                    Dialog dialog = new Dialog(dlRenewalSlotsActivity);
                    dialog.setContentView(R.layout.layout_multi);
                    Window window = dialog.getWindow();
                    cm.l.c(window);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    View findViewById = dialog.findViewById(R.id.service_label_cross);
                    cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                    View findViewById2 = dialog.findViewById(R.id.pop_up_close);
                    cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) findViewById2;
                    View findViewById3 = dialog.findViewById(R.id.service_label_list);
                    cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView2 = (TextView) findViewById3;
                    View findViewById4 = dialog.findViewById(R.id.service_label_list_serial);
                    cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView3 = (TextView) findViewById4;
                    ((ImageView) findViewById).setOnClickListener(new fk.d(dialog));
                    int size = dlRenewalSlotsActivity.R1().size();
                    String str = "";
                    int i10 = 0;
                    String str2 = str;
                    while (i10 < size) {
                        str = str + ((String) dlRenewalSlotsActivity.R1().get(i10)) + 10;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        i10++;
                        sb2.append(i10);
                        sb2.append(".\n");
                        str2 = sb2.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(str2);
                    textView.setOnClickListener(new fk.e(dialog));
                    Window window2 = dialog.getWindow();
                    cm.l.c(window2);
                    window2.setGravity(48);
                    window2.setLayout(-2, -2);
                    dialog.show();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void a2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void b2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void c2(String str, int i10) {
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
        ((TextView) findViewById3).setText(P1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(P1().b("btn_dl_serv_next", "Next"));
        textView.setOnClickListener(new fk.g(this, i10, dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void d2(DlRenewalSlotsActivity dlRenewalSlotsActivity, int i10, Dialog dialog, View view) {
        cm.l.f(dlRenewalSlotsActivity, "this$0");
        cm.l.f(dialog, "$d");
        dlRenewalSlotsActivity.startActivity(dlRenewalSlotsActivity.W1(i10));
        dialog.dismiss();
        dlRenewalSlotsActivity.finish();
    }

    private final void e2(String str, String str2, int i10, int i11) {
        String b10 = P1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        g.n1(this, b10, str, 0, (String) null, (String) null, new a(this, str2, i10, i11), 24, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void f2(String str) {
        if (str != null) {
            String b10 = P1().b("nex_parivahan", getString(R.string.app_name));
            cm.l.c(b10);
            String b11 = P1().b("btn_ok", getString(R.string.ok_txt));
            cm.l.c(b11);
            g.n1(this, b10, str, 1, b11, (String) null, b.f22361e, 16, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void g2(Context context, String str) {
        if (str != null) {
            String b10 = P1().b("nex_parivahan", getString(R.string.app_name));
            cm.l.c(b10);
            String b11 = P1().b("btn_ok", getString(R.string.ok_txt));
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
    public final void h2(java.util.ArrayList r9) {
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
            java.util.Date r2 = r8.K1(r2, r3, r4)
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
            r8.j2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity.h2(java.util.ArrayList):void");
    }

    /* access modifiers changed from: private */
    public static final void k2(DlRenewalSlotsActivity dlRenewalSlotsActivity, AdapterView adapterView, View view, int i10, long j10) {
        cm.l.f(dlRenewalSlotsActivity, "this$0");
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
                    String b10 = dlRenewalSlotsActivity.P1().b("previous_date", dlRenewalSlotsActivity.getString(R.string.prev_date));
                    z2 z2Var = dlRenewalSlotsActivity.J;
                    if (z2Var == null) {
                        cm.l.v("mBinding");
                        z2Var = null;
                    }
                    dlRenewalSlotsActivity.t1(b10, z2Var.m());
                }
                try {
                    cm.l.c(instance2);
                    dlRenewalSlotsActivity.s2(instance2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private final void m2() {
        this.O = findViewById(R.id.custom_view);
        View findViewById = findViewById(R.id.layoutCalender);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.N = (LinearLayout) findViewById;
        z2 z2Var = this.J;
        jk.a aVar = null;
        if (z2Var == null) {
            cm.l.v("mBinding");
            z2Var = null;
        }
        z2Var.Q.setLayoutManager(new LinearLayoutManager(this));
        this.K = (jk.a) new u0(this).a(jk.a.class);
        z2 z2Var2 = this.J;
        if (z2Var2 == null) {
            cm.l.v("mBinding");
            z2Var2 = null;
        }
        z2Var2.v(this);
        if (getIntent() != null) {
            try {
                if (getIntent() != null) {
                    this.T = String.valueOf(getIntent().getStringExtra("dl_st_appl_ackno_no"));
                    this.U = L1(String.valueOf(getIntent().getStringExtra("dl_st_appl_ackno_no_dob")));
                    Bundle extras = getIntent().getExtras();
                    this.P = String.valueOf(extras != null ? extras.get("lastEndorseRTOCode") : null);
                    Bundle extras2 = getIntent().getExtras();
                    Serializable serializable = extras2 != null ? extras2.getSerializable("dl_st_dl_details_obj") : null;
                    cm.l.d(serializable, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                    l2((DldetobjX) serializable);
                    this.X = String.valueOf(getIntent().getStringExtra("DL"));
                    this.Y = String.valueOf(getIntent().getStringExtra("dob"));
                    this.Z = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                    Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                    cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                    l2((DldetobjX) serializableExtra);
                    String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                    cm.l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                    this.f22347a0 = stringExtra;
                    String stringExtra2 = getIntent().getStringExtra("lastEndorsedState");
                    cm.l.d(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                    this.f22348b0 = stringExtra2;
                    String stringExtra3 = getIntent().getStringExtra("lastEndorseStateCode");
                    cm.l.d(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                    this.f22349c0 = stringExtra3;
                    z2 z2Var3 = this.J;
                    if (z2Var3 == null) {
                        cm.l.v("mBinding");
                        z2Var3 = null;
                    }
                    z2Var3.D.setText("DL No.: " + O1().getBioObj().getBioDlno());
                    BioImgObjX bioImgObj = O1().getBioImgObj();
                    String biPhoto = bioImgObj != null ? bioImgObj.getBiPhoto() : null;
                    if (biPhoto != null) {
                        if (biPhoto.length() != 0) {
                            z2 z2Var4 = this.J;
                            if (z2Var4 == null) {
                                cm.l.v("mBinding");
                                z2Var4 = null;
                            }
                            z2Var4.E.f25960f.setVisibility(0);
                            z2 z2Var5 = this.J;
                            if (z2Var5 == null) {
                                cm.l.v("mBinding");
                                z2Var5 = null;
                            }
                            ImageView imageView = z2Var5.E.f25956b;
                            BioImgObjX bioImgObj2 = O1().getBioImgObj();
                            imageView.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
                        }
                    }
                    z2 z2Var6 = this.J;
                    if (z2Var6 == null) {
                        cm.l.v("mBinding");
                        z2Var6 = null;
                    }
                    z2Var6.E.f25960f.setVisibility(4);
                }
                if (com.nic.mparivahan.a.f9624a.a(this)) {
                    I1(this);
                    jk.a aVar2 = this.K;
                    if (aVar2 == null) {
                        cm.l.v("viewModel");
                    } else {
                        aVar = aVar2;
                    }
                    aVar.h().g(this, new d(new f(this)));
                    return;
                }
                Toast.makeText(getApplicationContext(), P1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private final void s2(Calendar calendar) {
        this.f22356j0.clear();
        this.f22356j0.addAll(N1(calendar));
        this.L = new gk.b(this, this.f22356j0, this);
        z2 z2Var = this.J;
        gk.b bVar = null;
        if (z2Var == null) {
            cm.l.v("mBinding");
            z2Var = null;
        }
        RecyclerView recyclerView = z2Var.Q;
        gk.b bVar2 = this.L;
        if (bVar2 == null) {
            cm.l.v("adapter");
        } else {
            bVar = bVar2;
        }
        recyclerView.setAdapter(bVar);
    }

    public final void I1(Context context) {
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

    public final void J1(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "rtoCd");
        try {
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.M = progressDialog;
            progressDialog.setMessage(P1().b("label_challan_please_wait", "Please wait..."));
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

    public final Date K1(String str, String str2, String str3) {
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

    public final String L1(String str) {
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

    public final ArrayList M1() {
        return this.S;
    }

    public final DldetobjX O1() {
        DldetobjX dldetobjX = this.V;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    public final ld.c P1() {
        ld.c cVar = this.f22350d0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final String Q1() {
        return this.P;
    }

    public final ArrayList R1() {
        ArrayList arrayList = this.f22352f0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("listHeaderSteps");
        return null;
    }

    public final String S1() {
        return this.T;
    }

    public final ArrayList T1() {
        ArrayList arrayList = this.f22351e0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("multiListName");
        return null;
    }

    public final String U1() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoCdNew");
        return null;
    }

    public final ld.f V1() {
        ld.f fVar = this.f22353g0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public void W(int i10, String str, int i11) {
        cm.l.f(str, "mDate");
        if (!com.nic.mparivahan.a.f9624a.a(this)) {
            Toast.makeText(getApplicationContext(), P1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        } else if (((SlotDet) this.f22356j0.get(i10)).getQaflag() && ((SlotDet) this.f22356j0.get(i10)).getAvalableSeats() > 0) {
            ld.c P1 = P1();
            String b10 = P1.b("label_sure_to_book_slot" + i11 + " on " + i11, "Are you sure to book Slot");
            cm.l.c(b10);
            e2(b10, str, i11, i10);
        } else if (((SlotDet) this.f22356j0.get(i10)).getAvalableSeats() == 0) {
            String b11 = P1().b("label_slots_not_avl", "");
            z2 z2Var = this.J;
            if (z2Var == null) {
                cm.l.v("mBinding");
                z2Var = null;
            }
            t1(b11, z2Var.m());
        }
    }

    public final void i2(String str, Context context, String str2, int i10, String str3, int i11) {
        jk.a aVar;
        cm.l.f(context, "mContext");
        cm.l.f(str2, "mDate");
        try {
            ProgressDialog progressDialog = new ProgressDialog(context);
            progressDialog.setMessage(P1().b("label_challan_please_wait", "Please wait..."));
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
            String U1 = U1();
            cm.l.c(U1);
            String obj = q.B0(U1.toString()).toString();
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

    public final void j2() {
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
            calendarGridView.setOnItemClickListener(new fk.f(this));
        }
    }

    public final void l2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.V = dldetobjX;
    }

    public final void n2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f22350d0 = cVar;
    }

    public final void o2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f22352f0 = arrayList;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_dl_renewal_slots);
        cm.l.e(f10, "setContentView(...)");
        z2 z2Var = (z2) f10;
        this.J = z2Var;
        e.a aVar = v9.e.f17509a;
        z2 z2Var2 = null;
        if (z2Var == null) {
            cm.l.v("mBinding");
            z2Var = null;
        }
        aVar.Q1(this, z2Var);
        r2(new ld.f(this));
        n2(new ld.c(this));
        m2();
        z2 z2Var3 = this.J;
        if (z2Var3 == null) {
            cm.l.v("mBinding");
            z2Var3 = null;
        }
        z2Var3.K.f29577d.setOnClickListener(new fk.a(this));
        if (cm.l.a(V1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                Serializable serializableExtra = getIntent().getSerializableExtra("listHeaderSteps");
                cm.l.d(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                o2((ArrayList) serializableExtra);
                Serializable serializableExtra2 = getIntent().getSerializableExtra("multiList");
                cm.l.d(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                p2((ArrayList) serializableExtra2);
                if (R1().size() == 1) {
                    z2 z2Var4 = this.J;
                    if (z2Var4 == null) {
                        cm.l.v("mBinding");
                        z2Var4 = null;
                    }
                    z2Var4.K.f29580g.setText((CharSequence) R1().get(0));
                } else {
                    z2 z2Var5 = this.J;
                    if (z2Var5 == null) {
                        cm.l.v("mBinding");
                        z2Var5 = null;
                    }
                    TextView textView = z2Var5.K.f29580g;
                    String b10 = P1().b("dl_services", getString(R.string.dl_services));
                    cm.l.c(b10);
                    textView.setText(b10);
                    z2 z2Var6 = this.J;
                    if (z2Var6 == null) {
                        cm.l.v("mBinding");
                        z2Var6 = null;
                    }
                    TextView textView2 = z2Var6.K.f29580g;
                    z2 z2Var7 = this.J;
                    if (z2Var7 == null) {
                        cm.l.v("mBinding");
                        z2Var7 = null;
                    }
                    textView2.setPaintFlags(z2Var7.K.f29580g.getPaintFlags() | 8);
                }
            } catch (Exception unused) {
            }
        } else {
            z2 z2Var8 = this.J;
            if (z2Var8 == null) {
                cm.l.v("mBinding");
                z2Var8 = null;
            }
            z2Var8.K.f29580g.setText(V1().i());
        }
        z2 z2Var9 = this.J;
        if (z2Var9 == null) {
            cm.l.v("mBinding");
            z2Var9 = null;
        }
        z2Var9.K.f29581h.setOnClickListener(new fk.b(this));
        z2 z2Var10 = this.J;
        if (z2Var10 == null) {
            cm.l.v("mBinding");
            z2Var10 = null;
        }
        z2Var10.K.f29580g.setOnClickListener(new fk.c(this));
        z2 z2Var11 = this.J;
        if (z2Var11 == null) {
            cm.l.v("mBinding");
            z2Var11 = null;
        }
        z2Var11.K.f29578e.setVisibility(8);
        z2 z2Var12 = this.J;
        if (z2Var12 == null) {
            cm.l.v("mBinding");
            z2Var12 = null;
        }
        z2Var12.E.f25961g.setVisibility(0);
        z2 z2Var13 = this.J;
        if (z2Var13 == null) {
            cm.l.v("mBinding");
        } else {
            z2Var2 = z2Var13;
        }
        z2Var2.E.f25961g.setText(V1().i());
    }

    public final void p2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f22351e0 = arrayList;
    }

    public final void q2(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void r2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f22353g0 = fVar;
    }

    public final void setCustom_view(View view) {
        this.O = view;
    }
}
