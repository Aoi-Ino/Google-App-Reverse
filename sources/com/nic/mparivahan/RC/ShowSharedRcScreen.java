package com.nic.mparivahan.RC;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.ImpoundRcSuccessModel;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcImpoundService;
import com.nic.mparivahan.RC.RcInterface.RcService;
import java.util.Hashtable;
import ni.q9;
import org.json.JSONObject;
import pl.x;
import v9.d;
import v9.e;
import vc.r1;
import vc.s1;
import vc.t1;
import vc.u1;
import vc.v1;
import vc.w1;

public final class ShowSharedRcScreen extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public q9 G;
    public DatabaseHelper H;
    public NrvDetails I;
    public ImageView J;
    public Bitmap K;
    public cd.c L;
    public RcService M;
    public ProgressDialog N;
    public cd.a O;
    private RcImpoundService P;
    public ld.c Q;
    public ld.g R;
    private String S = "0";
    private String T = "0";
    private boolean U;
    private boolean V;
    public String W;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ShowSharedRcScreen f9528e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ShowSharedRcScreen showSharedRcScreen) {
            super(1);
            this.f9528e = showSharedRcScreen;
        }

        public final void b(ImpoundRcSuccessModel impoundRcSuccessModel) {
            if (this.f9528e.s1().isShowing()) {
                this.f9528e.s1().dismiss();
            }
            q9 l12 = this.f9528e.G;
            if (l12 == null) {
                cm.l.v("binding");
                l12 = null;
            }
            l12.f28244o.setVisibility(8);
            q9 l13 = this.f9528e.G;
            if (l13 == null) {
                cm.l.v("binding");
                l13 = null;
            }
            l13.D0.setVisibility(8);
            q9 l14 = this.f9528e.G;
            if (l14 == null) {
                cm.l.v("binding");
                l14 = null;
            }
            l14.f28225e0.setVisibility(8);
            int size = impoundRcSuccessModel.getResult().size();
            for (int i10 = 0; i10 < size; i10++) {
                if (p.o(impoundRcSuccessModel.getResult().get(i10).getImpound_type(), "document", true)) {
                    q9 l15 = this.f9528e.G;
                    if (l15 == null) {
                        cm.l.v("binding");
                        l15 = null;
                    }
                    l15.f28225e0.setVisibility(0);
                    TextView textView = new TextView(this.f9528e);
                    textView.setTextColor(androidx.core.content.a.c(this.f9528e, R.color.red_new));
                    textView.setTextSize(13.0f);
                    textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    textView.setGravity(8388613);
                    textView.setText(impoundRcSuccessModel.getResult().get(i10).getDocument());
                    q9 l16 = this.f9528e.G;
                    if (l16 == null) {
                        cm.l.v("binding");
                        l16 = null;
                    }
                    l16.f28259v0.addView(textView);
                }
                if (p.o(impoundRcSuccessModel.getResult().get(i10).getImpound_type(), "vehicle", true)) {
                    q9 l17 = this.f9528e.G;
                    if (l17 == null) {
                        cm.l.v("binding");
                        l17 = null;
                    }
                    l17.D0.setVisibility(0);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ImpoundRcSuccessModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ShowSharedRcScreen f9529e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ShowSharedRcScreen showSharedRcScreen) {
            super(1);
            this.f9529e = showSharedRcScreen;
        }

        public final void b(String str) {
            if (this.f9529e.s1().isShowing()) {
                this.f9529e.s1().dismiss();
            }
            q9 l12 = this.f9529e.G;
            q9 q9Var = null;
            if (l12 == null) {
                cm.l.v("binding");
                l12 = null;
            }
            l12.f28244o.setVisibility(0);
            q9 l13 = this.f9529e.G;
            if (l13 == null) {
                cm.l.v("binding");
                l13 = null;
            }
            l13.D0.setVisibility(8);
            q9 l14 = this.f9529e.G;
            if (l14 == null) {
                cm.l.v("binding");
            } else {
                q9Var = l14;
            }
            q9Var.f28225e0.setVisibility(8);
            ShowSharedRcScreen showSharedRcScreen = this.f9529e;
            showSharedRcScreen.I1(showSharedRcScreen, showSharedRcScreen.z1().b(v9.f.f17510a.P(), "No Vehicle or Seizure Document impound against the searched RC number."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ShowSharedRcScreen f9530e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ShowSharedRcScreen showSharedRcScreen) {
            super(1);
            this.f9530e = showSharedRcScreen;
        }

        public final void b(RcModelsDet rcModelsDet) {
            d.a aVar;
            ShowSharedRcScreen showSharedRcScreen;
            String statusDesc;
            this.f9530e.s1().dismiss();
            int i10 = 1;
            q9 q9Var = null;
            if (!p.o(rcModelsDet.getStatusCode(), "NP001", true)) {
                if (p.o(rcModelsDet.getStatusCode(), "NR090", true)) {
                    q9 l12 = this.f9530e.G;
                    if (l12 == null) {
                        cm.l.v("binding");
                    } else {
                        q9Var = l12;
                    }
                    q9Var.F.setVisibility(4);
                    this.f9530e.s1().dismiss();
                    aVar = v9.d.f17494a;
                    showSharedRcScreen = this.f9530e;
                    statusDesc = rcModelsDet.getStatusDesc();
                } else if (p.o(rcModelsDet.getStatusCode(), "NR091", true)) {
                    q9 l13 = this.f9530e.G;
                    if (l13 == null) {
                        cm.l.v("binding");
                    } else {
                        q9Var = l13;
                    }
                    q9Var.F.setVisibility(4);
                    this.f9530e.s1().dismiss();
                    aVar = v9.d.f17494a;
                    showSharedRcScreen = this.f9530e;
                    statusDesc = rcModelsDet.getStatusDesc();
                    i10 = 2;
                } else if (!ka.c.f13158a.m(rcModelsDet.getStatusDesc())) {
                    q9 l14 = this.f9530e.G;
                    if (l14 == null) {
                        cm.l.v("binding");
                    } else {
                        q9Var = l14;
                    }
                    q9Var.F.setVisibility(4);
                    ShowSharedRcScreen showSharedRcScreen2 = this.f9530e;
                    showSharedRcScreen2.I1(showSharedRcScreen2, rcModelsDet.getStatusDesc());
                    return;
                } else {
                    q9 l15 = this.f9530e.G;
                    if (l15 == null) {
                        cm.l.v("binding");
                    } else {
                        q9Var = l15;
                    }
                    q9Var.F.setVisibility(4);
                    return;
                }
                aVar.D(showSharedRcScreen, statusDesc, i10);
            } else if (rcModelsDet.getNrvDetails() != null) {
                q9 l16 = this.f9530e.G;
                if (l16 == null) {
                    cm.l.v("binding");
                    l16 = null;
                }
                l16.F.setVisibility(0);
                this.f9530e.T1(rcModelsDet.getNrvDetails());
                q9 l17 = this.f9530e.G;
                if (l17 == null) {
                    cm.l.v("binding");
                    l17 = null;
                }
                l17.S.setText(this.f9530e.y1().getRc_regn_no());
                ShowSharedRcScreen showSharedRcScreen3 = this.f9530e;
                q9 l18 = showSharedRcScreen3.G;
                if (l18 == null) {
                    cm.l.v("binding");
                } else {
                    q9Var = l18;
                }
                showSharedRcScreen3.Q1(q9Var, this.f9530e.y1(), String.valueOf(this.f9530e.y1().getRc_regn_no()));
                if (this.f9530e.p1()) {
                    ShowSharedRcScreen showSharedRcScreen4 = this.f9530e;
                    showSharedRcScreen4.I1(showSharedRcScreen4, showSharedRcScreen4.z1().b(v9.f.f17510a.a1(), "Virtual RC successfully updated!"));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RcModelsDet) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ShowSharedRcScreen f9531e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ShowSharedRcScreen showSharedRcScreen) {
            super(1);
            this.f9531e = showSharedRcScreen;
        }

        public final void b(String str) {
            this.f9531e.s1().dismiss();
            ShowSharedRcScreen showSharedRcScreen = this.f9531e;
            showSharedRcScreen.I1(showSharedRcScreen, showSharedRcScreen.z1().b(v9.f.f17510a.D(), "Unable to get the details, Please try after some times"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ShowSharedRcScreen f9532e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ShowSharedRcScreen showSharedRcScreen) {
            super(1);
            this.f9532e = showSharedRcScreen;
        }

        public final void b(MyRcDeletResponse myRcDeletResponse) {
            d.a aVar;
            ShowSharedRcScreen showSharedRcScreen;
            String statusDesc;
            if (cm.l.a(myRcDeletResponse.getStatusCode(), "VTLD001")) {
                try {
                    DatabaseHelper o12 = this.f9532e.o1();
                    q9 l12 = this.f9532e.G;
                    if (l12 == null) {
                        cm.l.v("binding");
                        l12 = null;
                    }
                    String s02 = o12.s0(l12.S.getText().toString());
                    cd.c r12 = this.f9532e.r1();
                    String k10 = this.f9532e.A1().k();
                    cm.l.c(s02);
                    r12.o(k10, s02, this.f9532e);
                } catch (Exception unused) {
                }
            } else {
                int i10 = 1;
                if (p.o(myRcDeletResponse.getStatusCode(), "VTLD090", true)) {
                    this.f9532e.s1().dismiss();
                    aVar = v9.d.f17494a;
                    showSharedRcScreen = this.f9532e;
                    statusDesc = myRcDeletResponse.getStatusDesc();
                } else if (p.o(myRcDeletResponse.getStatusCode(), "VTLD091", true)) {
                    this.f9532e.s1().dismiss();
                    aVar = v9.d.f17494a;
                    showSharedRcScreen = this.f9532e;
                    statusDesc = myRcDeletResponse.getStatusDesc();
                    i10 = 2;
                } else {
                    this.f9532e.s1().dismiss();
                    return;
                }
                aVar.D(showSharedRcScreen, statusDesc, i10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((MyRcDeletResponse) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ShowSharedRcScreen f9533e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ShowSharedRcScreen showSharedRcScreen) {
            super(1);
            this.f9533e = showSharedRcScreen;
        }

        public final void b(String str) {
            if (this.f9533e.s1().isShowing()) {
                this.f9533e.s1().dismiss();
            }
            ShowSharedRcScreen showSharedRcScreen = this.f9533e;
            showSharedRcScreen.I1(showSharedRcScreen, showSharedRcScreen.z1().b(v9.f.f17510a.D(), "Unable to get the details, Please try after some times"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9534a;

        g(l lVar) {
            cm.l.f(lVar, "function");
            this.f9534a = lVar;
        }

        public final pl.c a() {
            return this.f9534a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9534a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void C1(ShowSharedRcScreen showSharedRcScreen, View view) {
        cm.l.f(showSharedRcScreen, "this$0");
        showSharedRcScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void D1(ShowSharedRcScreen showSharedRcScreen, View view) {
        cm.l.f(showSharedRcScreen, "this$0");
        showSharedRcScreen.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void E1(ShowSharedRcScreen showSharedRcScreen, View view) {
        cm.l.f(showSharedRcScreen, "this$0");
        showSharedRcScreen.H1();
    }

    /* access modifiers changed from: private */
    public static final void F1(ShowSharedRcScreen showSharedRcScreen, View view) {
        cm.l.f(showSharedRcScreen, "this$0");
        try {
            showSharedRcScreen.V = true;
            if (showSharedRcScreen.U) {
                showSharedRcScreen.s1().show();
                cd.c r12 = showSharedRcScreen.r1();
                String str = showSharedRcScreen.S;
                cm.l.c(str);
                String str2 = showSharedRcScreen.T;
                cm.l.c(str2);
                r12.n(str, str2, showSharedRcScreen);
                return;
            }
            showSharedRcScreen.s1().show();
            DatabaseHelper o12 = showSharedRcScreen.o1();
            q9 q9Var = showSharedRcScreen.G;
            if (q9Var == null) {
                cm.l.v("binding");
                q9Var = null;
            }
            String s02 = o12.s0(q9Var.S.getText().toString());
            cd.c r13 = showSharedRcScreen.r1();
            cm.l.c(s02);
            r13.a0(s02, "RC", showSharedRcScreen);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void G1(ShowSharedRcScreen showSharedRcScreen, View view) {
        cm.l.f(showSharedRcScreen, "this$0");
        try {
            if (showSharedRcScreen.s1().isShowing()) {
                showSharedRcScreen.s1().dismiss();
            }
            showSharedRcScreen.s1().show();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rc_no", (Object) q.B0(String.valueOf(showSharedRcScreen.y1().getRc_regn_no())).toString());
            showSharedRcScreen.w1().j(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void H1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void J1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final String v1(NrvDetails nrvDetails) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 0);
            jSONObject.put("rn", (Object) nrvDetails.getRc_regn_no());
            jSONObject.put("rd", (Object) nrvDetails.getRc_regn_dt());
            jSONObject.put("on", (Object) nrvDetails.getRc_owner_name());
            jSONObject.put("fn", (Object) nrvDetails.getRc_f_name());
            jSONObject.put("en", (Object) nrvDetails.getRc_eng_no());
            jSONObject.put("cn", (Object) nrvDetails.getRc_chasi_no());
            jSONObject.put("vt", (Object) nrvDetails.getRc_vh_class_desc());
            jSONObject.put("ft", (Object) nrvDetails.getRc_fuel_desc());
            jSONObject.put("iv", (Object) nrvDetails.getRc_insurance_upto());
            jSONObject.put("ipn", (Object) nrvDetails.getRc_insurance_policy_no());
            jSONObject.put("fv", (Object) nrvDetails.getRc_fit_upto());
            jSONObject.put("pv", (Object) nrvDetails.getRc_permit_valid_upto());
            jSONObject.put("tv", (Object) nrvDetails.getRc_tax_upto());
            jSONObject.put("c", (Object) nrvDetails.getRc_color());
            jSONObject.put("sc", (Object) nrvDetails.getRc_seat_cap());
            jSONObject.put("stc", (Object) nrvDetails.getRc_stand_cap());
            jSONObject.put("slc", (Object) nrvDetails.getRc_sleeper_cap());
            jSONObject.put("nc", (Object) nrvDetails.getRc_no_cyl());
            jSONObject.put("mm", (Object) nrvDetails.getRc_manu_month_yr());
            jSONObject.put("uw", (Object) nrvDetails.getRc_unld_wt());
            jSONObject.put("lw", (Object) nrvDetails.getRc_gvw());
            jSONObject.put("rat", (Object) nrvDetails.getRc_registered_at());
            jSONObject.put("s", (Object) nrvDetails.getRc_status_as_on());
            jSONObject.put("pc_no", (Object) nrvDetails.getRc_pucc_no());
            jSONObject.put("pc_v", (Object) nrvDetails.getRc_pucc_upto());
            return jSONObject.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final ld.g A1() {
        ld.g gVar = this.R;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final Bitmap B1(Bitmap bitmap, Bitmap bitmap2) {
        cm.l.f(bitmap, "QRImg");
        cm.l.f(bitmap2, "appIcon");
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        cm.l.e(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, new Matrix(), (Paint) null);
        canvas.drawBitmap(bitmap2, (float) ((bitmap.getWidth() - bitmap2.getWidth()) / 2), (float) ((bitmap.getHeight() - bitmap2.getHeight()) / 2), (Paint) null);
        return createBitmap;
    }

    public final void I1(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(z1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(z1().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new w1(dialog));
        dialog.show();
    }

    public final void K1(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.H = databaseHelper;
    }

    public final void L1(RcService rcService) {
        cm.l.f(rcService, "<set-?>");
        this.M = rcService;
    }

    public final void M1(cd.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void N1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.N = progressDialog;
    }

    public final void O1(Bitmap bitmap) {
        cm.l.f(bitmap, "<set-?>");
        this.K = bitmap;
    }

    public final void P1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.J = imageView;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(39:0|1|2|3|(2:5|6)(1:9)|10|(1:12)(1:14)|13|15|(1:17)(1:18)|19|(1:21)(1:22)|23|(1:25)(1:26)|27|(1:29)(1:30)|31|(1:33)(1:34)|35|(1:37)(1:39)|38|40|(1:42)(1:43)|44|45|(3:47|48|(1:50)(13:52|54|(2:56|(1:58)(10:60|62|(2:64|(1:66)(7:68|70|71|72|73|74|78))(1:69)|67|70|71|72|73|74|78))(1:61)|59|62|(0)(0)|67|70|71|72|73|74|78))(1:53)|51|54|(0)(0)|59|62|(0)(0)|67|70|71|72|73|74|78) */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x026e */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c6 A[Catch:{ Exception -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ea A[Catch:{ Exception -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01f7 A[Catch:{ Exception -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x021b A[Catch:{ Exception -> 0x005d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Q1(ni.q9 r7, com.nic.mparivahan.RC.Model.NrvDetails r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "binding"
            cm.l.f(r7, r0)
            java.lang.String r0 = "rcdetails"
            cm.l.f(r8, r0)
            java.lang.String r0 = "rc_number"
            cm.l.f(r9, r0)
            com.nic.mparivahan.MyTextView r0 = r7.E     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = r8.getRc_owner_name()     // Catch:{ Exception -> 0x005d }
            r0.setText(r1)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r0 = r7.Y     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = r8.getRc_f_name()     // Catch:{ Exception -> 0x005d }
            r0.setText(r1)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r0 = r7.f28222d     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = r8.getRc_chasi_no()     // Catch:{ Exception -> 0x005d }
            r0.setText(r1)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r0 = r7.f28230h     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = r8.getRc_eng_no()     // Catch:{ Exception -> 0x005d }
            r0.setText(r1)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r0 = r7.L     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = r8.getRc_maker_desc()     // Catch:{ Exception -> 0x005d }
            r0.setText(r1)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r0 = r7.W     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = r8.getRc_regn_dt()     // Catch:{ Exception -> 0x005d }
            r0.setText(r1)     // Catch:{ Exception -> 0x005d }
            ka.c$a r0 = ka.c.f13158a     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = r8.getRc_tax_upto()     // Catch:{ Exception -> 0x005d }
            boolean r1 = r0.m(r1)     // Catch:{ Exception -> 0x005d }
            java.lang.String r2 = "NA"
            if (r1 != 0) goto L_0x0060
            com.nic.mparivahan.MyTextView r1 = r7.f28233i0     // Catch:{ Exception -> 0x005d }
            java.lang.String r3 = r8.getRc_tax_upto()     // Catch:{ Exception -> 0x005d }
            r1.setText(r3)     // Catch:{ Exception -> 0x005d }
            goto L_0x0065
        L_0x005d:
            r7 = move-exception
            goto L_0x0281
        L_0x0060:
            com.nic.mparivahan.MyTextView r1 = r7.f28233i0     // Catch:{ Exception -> 0x005d }
            r1.setText(r2)     // Catch:{ Exception -> 0x005d }
        L_0x0065:
            com.nic.mparivahan.MyTextView r1 = r7.A0     // Catch:{ Exception -> 0x005d }
            java.lang.String r3 = r8.getRc_vch_catg()     // Catch:{ Exception -> 0x005d }
            r1.setText(r3)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r1 = r7.C0     // Catch:{ Exception -> 0x005d }
            java.lang.String r3 = r8.getRc_vh_class_desc()     // Catch:{ Exception -> 0x005d }
            r1.setText(r3)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r1 = r7.f28242n     // Catch:{ Exception -> 0x005d }
            java.lang.String r3 = r8.getRc_fuel_desc()     // Catch:{ Exception -> 0x005d }
            r1.setText(r3)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r1 = r7.f28226f     // Catch:{ Exception -> 0x005d }
            java.lang.String r3 = r8.getRc_color()     // Catch:{ Exception -> 0x005d }
            r1.setText(r3)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r1 = r7.f28223d0     // Catch:{ Exception -> 0x005d }
            java.lang.String r3 = r8.getRc_seat_cap()     // Catch:{ Exception -> 0x005d }
            r1.setText(r3)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r1 = r7.f28229g0     // Catch:{ Exception -> 0x005d }
            java.lang.String r3 = r8.getRc_stand_cap()     // Catch:{ Exception -> 0x005d }
            r1.setText(r3)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r1 = r7.f28258v     // Catch:{ Exception -> 0x005d }
            java.lang.String r3 = r8.getRc_insurance_upto()     // Catch:{ Exception -> 0x005d }
            r1.setText(r3)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r1 = r7.f28238l     // Catch:{ Exception -> 0x005d }
            java.lang.String r3 = r8.getRc_fit_upto()     // Catch:{ Exception -> 0x005d }
            r1.setText(r3)     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = r8.getRc_norms_desc()     // Catch:{ Exception -> 0x005d }
            boolean r1 = r0.m(r1)     // Catch:{ Exception -> 0x005d }
            r3 = 0
            if (r1 != 0) goto L_0x00c2
            com.nic.mparivahan.MyTextView r1 = r7.Q     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = r8.getRc_norms_desc()     // Catch:{ Exception -> 0x005d }
        L_0x00be:
            r1.setText(r4)     // Catch:{ Exception -> 0x005d }
            goto L_0x00cc
        L_0x00c2:
            android.widget.LinearLayout r1 = r7.R     // Catch:{ Exception -> 0x005d }
            r1.setVisibility(r3)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r1 = r7.Q     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = "Not Available|Applicable"
            goto L_0x00be
        L_0x00cc:
            java.lang.String r1 = r8.getRc_pucc_no()     // Catch:{ Exception -> 0x005d }
            boolean r1 = r0.m(r1)     // Catch:{ Exception -> 0x005d }
            if (r1 != 0) goto L_0x00e0
            com.nic.mparivahan.MyTextView r1 = r7.G     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = r8.getRc_pucc_no()     // Catch:{ Exception -> 0x005d }
            r1.setText(r4)     // Catch:{ Exception -> 0x005d }
            goto L_0x00e5
        L_0x00e0:
            com.nic.mparivahan.MyTextView r1 = r7.G     // Catch:{ Exception -> 0x005d }
            r1.setText(r2)     // Catch:{ Exception -> 0x005d }
        L_0x00e5:
            java.lang.String r1 = r8.getRc_pucc_upto()     // Catch:{ Exception -> 0x005d }
            boolean r1 = r0.m(r1)     // Catch:{ Exception -> 0x005d }
            if (r1 != 0) goto L_0x00f9
            com.nic.mparivahan.MyTextView r1 = r7.J     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = r8.getRc_pucc_upto()     // Catch:{ Exception -> 0x005d }
            r1.setText(r4)     // Catch:{ Exception -> 0x005d }
            goto L_0x00fe
        L_0x00f9:
            com.nic.mparivahan.MyTextView r1 = r7.J     // Catch:{ Exception -> 0x005d }
            r1.setText(r2)     // Catch:{ Exception -> 0x005d }
        L_0x00fe:
            com.nic.mparivahan.MyTextView r1 = r7.f28217a0     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = r8.getRc_registered_at()     // Catch:{ Exception -> 0x005d }
            r1.setText(r4)     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = r8.getRc_maker_model()     // Catch:{ Exception -> 0x005d }
            boolean r1 = com.nic.mparivahan.dlservices.utilities.d.d(r1)     // Catch:{ Exception -> 0x005d }
            if (r1 == 0) goto L_0x011b
            com.nic.mparivahan.MyTextView r1 = r7.N     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = r8.getRc_maker_model()     // Catch:{ Exception -> 0x005d }
            r1.setText(r4)     // Catch:{ Exception -> 0x005d }
            goto L_0x0120
        L_0x011b:
            com.nic.mparivahan.MyTextView r1 = r7.N     // Catch:{ Exception -> 0x005d }
            r1.setText(r2)     // Catch:{ Exception -> 0x005d }
        L_0x0120:
            java.lang.String r1 = r8.getRc_insurance_comp()     // Catch:{ Exception -> 0x005d }
            boolean r1 = com.nic.mparivahan.dlservices.utilities.d.d(r1)     // Catch:{ Exception -> 0x005d }
            if (r1 == 0) goto L_0x0134
            com.nic.mparivahan.MyTextView r1 = r7.f28250r     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = r8.getRc_insurance_comp()     // Catch:{ Exception -> 0x005d }
            r1.setText(r4)     // Catch:{ Exception -> 0x005d }
            goto L_0x0139
        L_0x0134:
            com.nic.mparivahan.MyTextView r1 = r7.f28250r     // Catch:{ Exception -> 0x005d }
            r1.setText(r2)     // Catch:{ Exception -> 0x005d }
        L_0x0139:
            java.lang.String r1 = r8.getRc_insurance_policy_no()     // Catch:{ Exception -> 0x005d }
            boolean r1 = com.nic.mparivahan.dlservices.utilities.d.d(r1)     // Catch:{ Exception -> 0x005d }
            if (r1 == 0) goto L_0x014d
            com.nic.mparivahan.MyTextView r1 = r7.f28252s     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = r8.getRc_insurance_policy_no()     // Catch:{ Exception -> 0x005d }
            r1.setText(r4)     // Catch:{ Exception -> 0x005d }
            goto L_0x0152
        L_0x014d:
            com.nic.mparivahan.MyTextView r1 = r7.f28252s     // Catch:{ Exception -> 0x005d }
            r1.setText(r2)     // Catch:{ Exception -> 0x005d }
        L_0x0152:
            java.lang.String r1 = r8.getRc_financer()     // Catch:{ Exception -> 0x005d }
            boolean r1 = r0.m(r1)     // Catch:{ Exception -> 0x005d }
            if (r1 != 0) goto L_0x0166
            com.nic.mparivahan.MyTextView r1 = r7.f28234j     // Catch:{ Exception -> 0x005d }
            java.lang.String r2 = r8.getRc_financer()     // Catch:{ Exception -> 0x005d }
        L_0x0162:
            r1.setText(r2)     // Catch:{ Exception -> 0x005d }
            goto L_0x0169
        L_0x0166:
            com.nic.mparivahan.MyTextView r1 = r7.f28234j     // Catch:{ Exception -> 0x005d }
            goto L_0x0162
        L_0x0169:
            java.lang.String r1 = r8.getRc_blacklist_status()     // Catch:{ Exception -> 0x005d }
            boolean r1 = r0.m(r1)     // Catch:{ Exception -> 0x005d }
            r2 = 8
            if (r1 != 0) goto L_0x0184
            android.widget.LinearLayout r1 = r7.f28260w     // Catch:{ Exception -> 0x005d }
            r1.setVisibility(r3)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r1 = r7.f28255t0     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = r8.getRc_blacklist_status()     // Catch:{ Exception -> 0x005d }
            r1.setText(r4)     // Catch:{ Exception -> 0x005d }
            goto L_0x0189
        L_0x0184:
            android.widget.LinearLayout r1 = r7.f28260w     // Catch:{ Exception -> 0x005d }
            r1.setVisibility(r2)     // Catch:{ Exception -> 0x005d }
        L_0x0189:
            java.lang.String r1 = r8.getRc_np_no()     // Catch:{ Exception -> 0x005d }
            boolean r1 = r0.m(r1)     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = "getText(...)"
            if (r1 != 0) goto L_0x01b9
            com.nic.mparivahan.MyTextView r1 = r7.f28249q0     // Catch:{ Exception -> 0x005d }
            java.lang.String r5 = r8.getRc_np_no()     // Catch:{ Exception -> 0x005d }
            r1.setText(r5)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r1 = r7.f28249q0     // Catch:{ Exception -> 0x005d }
            java.lang.CharSequence r1 = r1.getText()     // Catch:{ Exception -> 0x005d }
            cm.l.e(r1, r4)     // Catch:{ Exception -> 0x005d }
            int r1 = r1.length()     // Catch:{ Exception -> 0x005d }
            if (r1 != 0) goto L_0x01b3
            android.widget.LinearLayout r1 = r7.f28262x     // Catch:{ Exception -> 0x005d }
        L_0x01af:
            r1.setVisibility(r2)     // Catch:{ Exception -> 0x005d }
            goto L_0x01bc
        L_0x01b3:
            android.widget.LinearLayout r1 = r7.f28262x     // Catch:{ Exception -> 0x005d }
            r1.setVisibility(r3)     // Catch:{ Exception -> 0x005d }
            goto L_0x01bc
        L_0x01b9:
            android.widget.LinearLayout r1 = r7.f28262x     // Catch:{ Exception -> 0x005d }
            goto L_0x01af
        L_0x01bc:
            java.lang.String r1 = r8.getRc_np_upto()     // Catch:{ Exception -> 0x005d }
            boolean r1 = r0.m(r1)     // Catch:{ Exception -> 0x005d }
            if (r1 != 0) goto L_0x01ea
            com.nic.mparivahan.MyTextView r1 = r7.f28251r0     // Catch:{ Exception -> 0x005d }
            java.lang.String r5 = r8.getRc_np_upto()     // Catch:{ Exception -> 0x005d }
            r1.setText(r5)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r1 = r7.f28251r0     // Catch:{ Exception -> 0x005d }
            java.lang.CharSequence r1 = r1.getText()     // Catch:{ Exception -> 0x005d }
            cm.l.e(r1, r4)     // Catch:{ Exception -> 0x005d }
            int r1 = r1.length()     // Catch:{ Exception -> 0x005d }
            if (r1 != 0) goto L_0x01e4
            android.widget.LinearLayout r1 = r7.f28264y     // Catch:{ Exception -> 0x005d }
        L_0x01e0:
            r1.setVisibility(r2)     // Catch:{ Exception -> 0x005d }
            goto L_0x01ed
        L_0x01e4:
            android.widget.LinearLayout r1 = r7.f28264y     // Catch:{ Exception -> 0x005d }
            r1.setVisibility(r3)     // Catch:{ Exception -> 0x005d }
            goto L_0x01ed
        L_0x01ea:
            android.widget.LinearLayout r1 = r7.f28264y     // Catch:{ Exception -> 0x005d }
            goto L_0x01e0
        L_0x01ed:
            java.lang.String r1 = r8.getRc_permit_valid_upto()     // Catch:{ Exception -> 0x005d }
            boolean r0 = r0.m(r1)     // Catch:{ Exception -> 0x005d }
            if (r0 != 0) goto L_0x021b
            com.nic.mparivahan.MyTextView r0 = r7.f28253s0     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = r8.getRc_permit_valid_upto()     // Catch:{ Exception -> 0x005d }
            r0.setText(r1)     // Catch:{ Exception -> 0x005d }
            com.nic.mparivahan.MyTextView r0 = r7.f28253s0     // Catch:{ Exception -> 0x005d }
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ Exception -> 0x005d }
            cm.l.e(r0, r4)     // Catch:{ Exception -> 0x005d }
            int r0 = r0.length()     // Catch:{ Exception -> 0x005d }
            if (r0 != 0) goto L_0x0215
            android.widget.LinearLayout r7 = r7.f28266z     // Catch:{ Exception -> 0x005d }
        L_0x0211:
            r7.setVisibility(r2)     // Catch:{ Exception -> 0x005d }
            goto L_0x021e
        L_0x0215:
            android.widget.LinearLayout r7 = r7.f28266z     // Catch:{ Exception -> 0x005d }
            r7.setVisibility(r3)     // Catch:{ Exception -> 0x005d }
            goto L_0x021e
        L_0x021b:
            android.widget.LinearLayout r7 = r7.f28266z     // Catch:{ Exception -> 0x005d }
            goto L_0x0211
        L_0x021e:
            r7 = 1
            java.lang.String r8 = r6.v1(r8)     // Catch:{ Exception -> 0x026e }
            java.lang.String r0 = "E@CHALLAN*#2017!"
            java.lang.String r8 = id.a.a(r8, r0)     // Catch:{ Exception -> 0x026e }
            android.graphics.Bitmap r8 = r6.n1(r8)     // Catch:{ Exception -> 0x026e }
            cm.l.c(r8)     // Catch:{ Exception -> 0x026e }
            r6.O1(r8)     // Catch:{ Exception -> 0x026e }
            android.content.res.Resources r8 = r6.getResources()     // Catch:{ Exception -> 0x026e }
            r0 = 2131230867(0x7f080093, float:1.8077799E38)
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeResource(r8, r0)     // Catch:{ Exception -> 0x026e }
            r0 = 80
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createScaledBitmap(r8, r0, r0, r7)     // Catch:{ Exception -> 0x026e }
            java.lang.String r0 = "createScaledBitmap(...)"
            cm.l.e(r8, r0)     // Catch:{ Exception -> 0x026e }
            android.graphics.Bitmap r0 = r6.t1()     // Catch:{ Exception -> 0x026e }
            android.graphics.Bitmap r8 = r6.B1(r0, r8)     // Catch:{ Exception -> 0x026e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x026e }
            r0.<init>()     // Catch:{ Exception -> 0x026e }
            java.lang.String r1 = "RC No : "
            r0.append(r1)     // Catch:{ Exception -> 0x026e }
            r0.append(r9)     // Catch:{ Exception -> 0x026e }
            java.lang.String r9 = r0.toString()     // Catch:{ Exception -> 0x026e }
            android.graphics.Bitmap r8 = r6.m1(r6, r8, r9)     // Catch:{ Exception -> 0x026e }
            android.widget.ImageView r9 = r6.u1()     // Catch:{ Exception -> 0x026e }
            r9.setImageBitmap(r8)     // Catch:{ Exception -> 0x026e }
            goto L_0x0284
        L_0x026e:
            android.content.Context r8 = r6.getApplicationContext()     // Catch:{ Exception -> 0x005d }
            r9 = 2132018876(0x7f1406bc, float:1.9676071E38)
            java.lang.String r9 = r6.getString(r9)     // Catch:{ Exception -> 0x005d }
            android.widget.Toast r7 = android.widget.Toast.makeText(r8, r9, r7)     // Catch:{ Exception -> 0x005d }
            r7.show()     // Catch:{ Exception -> 0x005d }
            goto L_0x0284
        L_0x0281:
            r7.printStackTrace()
        L_0x0284:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.RC.ShowSharedRcScreen.Q1(ni.q9, com.nic.mparivahan.RC.Model.NrvDetails, java.lang.String):void");
    }

    public final void R1(cd.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.O = aVar;
    }

    public final void S1(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void T1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.I = nrvDetails;
    }

    public final void U1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final void V1(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.R = gVar;
    }

    public final Bitmap m1(Context context, Bitmap bitmap, String str) {
        cm.l.f(context, "mContext");
        cm.l.f(bitmap, "bitmap");
        cm.l.f(str, "mText");
        float f10 = context.getResources().getDisplayMetrics().density;
        Bitmap.Config config = bitmap.getConfig();
        cm.l.e(config, "getConfig(...)");
        Canvas canvas = new Canvas(bitmap.copy(config, true));
        Paint paint = new Paint(1);
        paint.setColor(Color.rgb(0, 0, 0));
        paint.setTextSize(((float) 7) * f10);
        paint.setShadowLayer(1.0f, 0.0f, 1.0f, -12303292);
        paint.getTextBounds(str, 0, str.length(), new Rect());
        canvas.drawText(str, (float) (bitmap.getWidth() / 5), ((float) 10) * f10, paint);
        return bitmap;
    }

    public final Bitmap n1(String str) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(q7.b.f15232a, u7.a.f16935g);
        r7.b a10 = new t7.a().a(str, q7.a.f15222b, 384, 384, hashtable);
        Bitmap createBitmap = Bitmap.createBitmap(384, 384, Bitmap.Config.RGB_565);
        cm.l.e(createBitmap, "createBitmap(...)");
        for (int i10 = 0; i10 < 384; i10++) {
            for (int i11 = 0; i11 < 384; i11++) {
                createBitmap.setPixel(i11, i10, a10.b(i10, i11) == 0 ? -16777216 : -1);
            }
        }
        return createBitmap;
    }

    public final DatabaseHelper o1() {
        DatabaseHelper databaseHelper = this.H;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q9 c10 = q9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        q9 q9Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        q9 q9Var2 = this.G;
        if (q9Var2 == null) {
            cm.l.v("binding");
            q9Var2 = null;
        }
        aVar.X2(this, q9Var2);
        U1(new ld.c(this));
        K1(new DatabaseHelper(this));
        L1(RcService.f9484a.c(this));
        this.P = RcImpoundService.f9481a.b(this);
        View findViewById = findViewById(R.id.rc_qr_img);
        cm.l.e(findViewById, "findViewById(...)");
        P1((ImageView) findViewById);
        N1(new ProgressDialog(this));
        s1().setMessage("Please wait...");
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        V1(new ld.g(this));
        M1((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(q1()))).a(cd.c.class));
        RcImpoundService rcImpoundService = this.P;
        if (rcImpoundService == null) {
            cm.l.v("rcImpoundService");
            rcImpoundService = null;
        }
        R1((cd.a) new u0((x0) this, (u0.b) new cd.b(new bd.a(rcImpoundService))).a(cd.a.class));
        q9 q9Var3 = this.G;
        if (q9Var3 == null) {
            cm.l.v("binding");
            q9Var3 = null;
        }
        q9Var3.F.setVisibility(4);
        try {
            if (getIntent() != null) {
                this.U = getIntent().getBooleanExtra("ShareRecivedFlag", false);
                S1(String.valueOf(getIntent().getStringExtra("RcNumber")));
                if (this.U) {
                    this.S = String.valueOf(getIntent().getStringExtra("RecordId"));
                    this.T = String.valueOf(getIntent().getStringExtra("DocId"));
                    s1().show();
                    cd.c r12 = r1();
                    String str = this.S;
                    cm.l.c(str);
                    String str2 = this.T;
                    cm.l.c(str2);
                    r12.n(str, str2, this);
                } else {
                    try {
                        s1().show();
                        String s02 = o1().s0(x1());
                        cd.c r13 = r1();
                        String k10 = A1().k();
                        cm.l.c(s02);
                        r13.o(k10, s02, this);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
            q9 q9Var4 = this.G;
            if (q9Var4 == null) {
                cm.l.v("binding");
                q9Var4 = null;
            }
            q9Var4.f28219b0.setOnClickListener(new r1(this));
        } catch (Error unused) {
        }
        r1().R().g(this, new g(new c(this)));
        r1().S().g(this, new g(new d(this)));
        q9 q9Var5 = this.G;
        if (q9Var5 == null) {
            cm.l.v("binding");
            q9Var5 = null;
        }
        q9Var5.A.setOnClickListener(new s1(this));
        q9 q9Var6 = this.G;
        if (q9Var6 == null) {
            cm.l.v("binding");
            q9Var6 = null;
        }
        q9Var6.B.setOnClickListener(new t1(this));
        q9 q9Var7 = this.G;
        if (q9Var7 == null) {
            cm.l.v("binding");
            q9Var7 = null;
        }
        q9Var7.U.setOnClickListener(new u1(this));
        r1().U().g(this, new g(new e(this)));
        r1().T().g(this, new g(new f(this)));
        q9 q9Var8 = this.G;
        if (q9Var8 == null) {
            cm.l.v("binding");
        } else {
            q9Var = q9Var8;
        }
        q9Var.f28244o.setOnClickListener(new v1(this));
        w1().l().g(this, new g(new a(this)));
        w1().k().g(this, new g(new b(this)));
    }

    public final boolean p1() {
        return this.V;
    }

    public final RcService q1() {
        RcService rcService = this.M;
        if (rcService != null) {
            return rcService;
        }
        cm.l.v("mRcService");
        return null;
    }

    public final cd.c r1() {
        cd.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mRcViewModel");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.N;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final Bitmap t1() {
        Bitmap bitmap = this.K;
        if (bitmap != null) {
            return bitmap;
        }
        cm.l.v("qrBmp");
        return null;
    }

    public final ImageView u1() {
        ImageView imageView = this.J;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("qrImg");
        return null;
    }

    public final cd.a w1() {
        cd.a aVar = this.O;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("rcImpoundModel");
        return null;
    }

    public final String x1() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails y1() {
        NrvDetails nrvDetails = this.I;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final ld.c z1() {
        ld.c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }
}
