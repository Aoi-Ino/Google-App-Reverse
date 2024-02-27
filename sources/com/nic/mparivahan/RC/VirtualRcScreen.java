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
import android.widget.Toast;
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
import vc.a2;
import vc.b2;
import vc.c2;
import vc.d2;
import vc.e2;
import vc.z1;

public final class VirtualRcScreen extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public q9 G;
    public DatabaseHelper H;
    private NrvDetails I;
    public ImageView J;
    public Bitmap K;
    public ProgressDialog L;
    public cd.c M;
    public RcService N;
    public cd.a O;
    private RcImpoundService P;
    public ld.c Q;
    public ld.g R;
    public String S;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualRcScreen f9538e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VirtualRcScreen virtualRcScreen) {
            super(1);
            this.f9538e = virtualRcScreen;
        }

        public final void b(MyRcDeletResponse myRcDeletResponse) {
            d.a aVar;
            VirtualRcScreen virtualRcScreen;
            String statusDesc;
            if (cm.l.a(myRcDeletResponse.getStatusCode(), "VTLD001")) {
                String s02 = this.f9538e.o1().s0(this.f9538e.w1());
                NrvDetails x12 = this.f9538e.x1();
                if (x12 != null && x12.getRc_regn_no() != null) {
                    VirtualRcScreen virtualRcScreen2 = this.f9538e;
                    cd.c q12 = virtualRcScreen2.q1();
                    String k10 = virtualRcScreen2.z1().k();
                    cm.l.c(s02);
                    q12.o(k10, s02, virtualRcScreen2);
                    return;
                }
                return;
            }
            int i10 = 1;
            if (p.o(myRcDeletResponse.getStatusCode(), "VTLD090", true)) {
                this.f9538e.r1().dismiss();
                aVar = v9.d.f17494a;
                virtualRcScreen = this.f9538e;
                statusDesc = myRcDeletResponse.getStatusDesc();
            } else if (p.o(myRcDeletResponse.getStatusCode(), "VTLD091", true)) {
                this.f9538e.r1().dismiss();
                aVar = v9.d.f17494a;
                virtualRcScreen = this.f9538e;
                statusDesc = myRcDeletResponse.getStatusDesc();
                i10 = 2;
            } else {
                this.f9538e.r1().dismiss();
                return;
            }
            aVar.D(virtualRcScreen, statusDesc, i10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((MyRcDeletResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualRcScreen f9539e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VirtualRcScreen virtualRcScreen) {
            super(1);
            this.f9539e = virtualRcScreen;
        }

        public final void b(String str) {
            if (this.f9539e.r1().isShowing()) {
                this.f9539e.r1().dismiss();
            }
            VirtualRcScreen virtualRcScreen = this.f9539e;
            virtualRcScreen.S1(virtualRcScreen, virtualRcScreen.y1().b(v9.f.f17510a.O0(), "Unable to Update the Virtual RC, Please try after some time"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualRcScreen f9540e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VirtualRcScreen virtualRcScreen) {
            super(1);
            this.f9540e = virtualRcScreen;
        }

        public final void b(RcModelsDet rcModelsDet) {
            VirtualRcScreen virtualRcScreen;
            String b10;
            this.f9540e.r1().dismiss();
            try {
                if (p.o(rcModelsDet.getStatusCode().toString(), "NP001", true)) {
                    try {
                        DatabaseHelper o12 = this.f9540e.o1();
                        String rc_regn_no = rcModelsDet.getNrvDetails().getRc_regn_no();
                        o12.c(rc_regn_no != null ? q.B0(rc_regn_no).toString() : null, rcModelsDet.getNrvDetails(), 0);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    virtualRcScreen = this.f9540e;
                    b10 = virtualRcScreen.y1().b(v9.f.f17510a.a1(), "Virtual RC successfully updated!");
                } else {
                    virtualRcScreen = this.f9540e;
                    b10 = virtualRcScreen.y1().b(v9.f.f17510a.O0(), "Unable to Update the Virtual RC, Please try after some time");
                }
                virtualRcScreen.S1(virtualRcScreen, b10);
            } catch (Exception unused) {
                this.f9540e.r1().dismiss();
                VirtualRcScreen virtualRcScreen2 = this.f9540e;
                virtualRcScreen2.S1(virtualRcScreen2, virtualRcScreen2.y1().b(v9.f.f17510a.O0(), "Unable to Update the Virtual RC, Please try after some time"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RcModelsDet) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualRcScreen f9541e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VirtualRcScreen virtualRcScreen) {
            super(1);
            this.f9541e = virtualRcScreen;
        }

        public final void b(String str) {
            this.f9541e.r1().dismiss();
            VirtualRcScreen virtualRcScreen = this.f9541e;
            virtualRcScreen.S1(virtualRcScreen, virtualRcScreen.y1().b(v9.f.f17510a.O0(), "Unable to Update the Virtual RC, Please try after some time"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualRcScreen f9542e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VirtualRcScreen virtualRcScreen) {
            super(1);
            this.f9542e = virtualRcScreen;
        }

        public final void b(ImpoundRcSuccessModel impoundRcSuccessModel) {
            if (this.f9542e.r1().isShowing()) {
                this.f9542e.r1().dismiss();
            }
            q9 l12 = this.f9542e.G;
            if (l12 == null) {
                cm.l.v("binding");
                l12 = null;
            }
            l12.f28244o.setVisibility(8);
            q9 l13 = this.f9542e.G;
            if (l13 == null) {
                cm.l.v("binding");
                l13 = null;
            }
            l13.D0.setVisibility(8);
            q9 l14 = this.f9542e.G;
            if (l14 == null) {
                cm.l.v("binding");
                l14 = null;
            }
            l14.f28225e0.setVisibility(8);
            int size = impoundRcSuccessModel.getResult().size();
            for (int i10 = 0; i10 < size; i10++) {
                if (p.o(impoundRcSuccessModel.getResult().get(i10).getImpound_type(), "document", true)) {
                    q9 l15 = this.f9542e.G;
                    if (l15 == null) {
                        cm.l.v("binding");
                        l15 = null;
                    }
                    l15.f28225e0.setVisibility(0);
                    TextView textView = new TextView(this.f9542e);
                    textView.setTextColor(androidx.core.content.a.c(this.f9542e, R.color.red_new));
                    textView.setTextSize(13.0f);
                    textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    textView.setGravity(8388613);
                    textView.setText(impoundRcSuccessModel.getResult().get(i10).getDocument());
                    q9 l16 = this.f9542e.G;
                    if (l16 == null) {
                        cm.l.v("binding");
                        l16 = null;
                    }
                    l16.f28259v0.addView(textView);
                }
                if (p.o(impoundRcSuccessModel.getResult().get(i10).getImpound_type(), "vehicle", true)) {
                    q9 l17 = this.f9542e.G;
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

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualRcScreen f9543e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VirtualRcScreen virtualRcScreen) {
            super(1);
            this.f9543e = virtualRcScreen;
        }

        public final void b(String str) {
            if (this.f9543e.r1().isShowing()) {
                this.f9543e.r1().dismiss();
            }
            q9 l12 = this.f9543e.G;
            q9 q9Var = null;
            if (l12 == null) {
                cm.l.v("binding");
                l12 = null;
            }
            l12.f28244o.setVisibility(0);
            q9 l13 = this.f9543e.G;
            if (l13 == null) {
                cm.l.v("binding");
                l13 = null;
            }
            l13.D0.setVisibility(8);
            q9 l14 = this.f9543e.G;
            if (l14 == null) {
                cm.l.v("binding");
            } else {
                q9Var = l14;
            }
            q9Var.f28225e0.setVisibility(8);
            VirtualRcScreen virtualRcScreen = this.f9543e;
            virtualRcScreen.F1(virtualRcScreen, virtualRcScreen.y1().b(v9.f.f17510a.P(), "No Vehicle or Seizure Document impound against the searched RC number."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9544a;

        g(l lVar) {
            cm.l.f(lVar, "function");
            this.f9544a = lVar;
        }

        public final pl.c a() {
            return this.f9544a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9544a.invoke(obj);
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
    public static final void B1(VirtualRcScreen virtualRcScreen, View view) {
        cm.l.f(virtualRcScreen, "this$0");
        virtualRcScreen.startActivity(new Intent(virtualRcScreen, DashBoard.class));
        virtualRcScreen.finishAffinity();
    }

    /* access modifiers changed from: private */
    public static final void C1(VirtualRcScreen virtualRcScreen, View view) {
        cm.l.f(virtualRcScreen, "this$0");
        virtualRcScreen.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void D1(VirtualRcScreen virtualRcScreen, View view) {
        cm.l.f(virtualRcScreen, "this$0");
        if (!com.nic.mparivahan.a.f9624a.a(virtualRcScreen)) {
            Toast.makeText(virtualRcScreen.getApplicationContext(), virtualRcScreen.y1().b("label_log_check_internet", virtualRcScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        } else if (virtualRcScreen.o1().s0(virtualRcScreen.w1()) != null) {
            virtualRcScreen.r1().show();
            String s02 = virtualRcScreen.o1().s0(virtualRcScreen.w1());
            cd.c q12 = virtualRcScreen.q1();
            cm.l.c(s02);
            q12.a0(s02, "RC", virtualRcScreen);
        }
    }

    /* access modifiers changed from: private */
    public static final void E1(VirtualRcScreen virtualRcScreen, View view) {
        cm.l.f(virtualRcScreen, "this$0");
        try {
            if (virtualRcScreen.r1().isShowing()) {
                virtualRcScreen.r1().dismiss();
            }
            if (com.nic.mparivahan.a.f9624a.a(virtualRcScreen)) {
                virtualRcScreen.r1().show();
                JSONObject jSONObject = new JSONObject();
                NrvDetails nrvDetails = virtualRcScreen.I;
                jSONObject.put("rc_no", (Object) q.B0(String.valueOf(nrvDetails != null ? nrvDetails.getRc_regn_no() : null)).toString());
                virtualRcScreen.v1().j(jSONObject);
                return;
            }
            Toast.makeText(virtualRcScreen.getApplicationContext(), virtualRcScreen.y1().b("label_log_check_internet", virtualRcScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void G1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void T1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final String u1(NrvDetails nrvDetails) {
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

    public final Bitmap A1(Bitmap bitmap, Bitmap bitmap2) {
        cm.l.f(bitmap, "QRImg");
        cm.l.f(bitmap2, "appIcon");
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        cm.l.e(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, new Matrix(), (Paint) null);
        canvas.drawBitmap(bitmap2, (float) ((bitmap.getWidth() - bitmap2.getWidth()) / 2), (float) ((bitmap.getHeight() - bitmap2.getHeight()) / 2), (Paint) null);
        return createBitmap;
    }

    public final void F1(Context context, String str) {
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
        ((TextView) findViewById).setText(str);
        textView.setText(y1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById3).setText(y1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new e2(dialog));
        dialog.show();
    }

    public final void H1(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.H = databaseHelper;
    }

    public final void I1(RcService rcService) {
        cm.l.f(rcService, "<set-?>");
        this.N = rcService;
    }

    public final void J1(cd.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.M = cVar;
    }

    public final void K1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void L1(Bitmap bitmap) {
        cm.l.f(bitmap, "<set-?>");
        this.K = bitmap;
    }

    public final void M1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.J = imageView;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(38:1|2|3|(2:5|6)(1:9)|10|(1:12)(1:14)|13|15|(1:17)(1:18)|19|(1:21)(1:22)|23|(1:25)(1:26)|27|(1:29)(1:30)|31|(1:33)(1:34)|35|(1:37)(1:39)|38|40|(1:42)(1:43)|44|45|(3:47|48|(1:50)(13:52|54|(2:56|(1:58)(10:60|62|(2:64|(1:66)(7:68|70|71|72|73|74|78))(1:69)|67|70|71|72|73|74|78))(1:61)|59|62|(0)(0)|67|70|71|72|73|74|78))(1:53)|51|54|(0)(0)|59|62|(0)(0)|67|70|71|72|73|74|78) */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0273 */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01cb A[Catch:{ Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ef A[Catch:{ Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fc A[Catch:{ Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0220 A[Catch:{ Exception -> 0x0063 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N1(ni.q9 r7, com.nic.mparivahan.RC.Model.NrvDetails r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "binding"
            cm.l.f(r7, r0)
            java.lang.String r0 = "rcdetails"
            cm.l.f(r8, r0)
            java.lang.String r0 = "rc_number"
            cm.l.f(r9, r0)
            android.widget.LinearLayout r0 = r7.F     // Catch:{ Exception -> 0x0063 }
            r1 = 0
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r0 = r7.E     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = r8.getRc_owner_name()     // Catch:{ Exception -> 0x0063 }
            r0.setText(r2)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r0 = r7.Y     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = r8.getRc_f_name()     // Catch:{ Exception -> 0x0063 }
            r0.setText(r2)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r0 = r7.f28222d     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = r8.getRc_chasi_no()     // Catch:{ Exception -> 0x0063 }
            r0.setText(r2)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r0 = r7.f28230h     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = r8.getRc_eng_no()     // Catch:{ Exception -> 0x0063 }
            r0.setText(r2)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r0 = r7.L     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = r8.getRc_maker_desc()     // Catch:{ Exception -> 0x0063 }
            r0.setText(r2)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r0 = r7.W     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = r8.getRc_regn_dt()     // Catch:{ Exception -> 0x0063 }
            r0.setText(r2)     // Catch:{ Exception -> 0x0063 }
            ka.c$a r0 = ka.c.f13158a     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = r8.getRc_tax_upto()     // Catch:{ Exception -> 0x0063 }
            boolean r2 = r0.m(r2)     // Catch:{ Exception -> 0x0063 }
            java.lang.String r3 = "NA"
            if (r2 != 0) goto L_0x0066
            com.nic.mparivahan.MyTextView r2 = r7.f28233i0     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_tax_upto()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            goto L_0x006b
        L_0x0063:
            r7 = move-exception
            goto L_0x0286
        L_0x0066:
            com.nic.mparivahan.MyTextView r2 = r7.f28233i0     // Catch:{ Exception -> 0x0063 }
            r2.setText(r3)     // Catch:{ Exception -> 0x0063 }
        L_0x006b:
            com.nic.mparivahan.MyTextView r2 = r7.A0     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_vch_catg()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r2 = r7.C0     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_vh_class_desc()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r2 = r7.f28242n     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_fuel_desc()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r2 = r7.f28226f     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_color()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r2 = r7.f28223d0     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_seat_cap()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r2 = r7.f28229g0     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_stand_cap()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r2 = r7.f28258v     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_insurance_upto()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r2 = r7.f28238l     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_fit_upto()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = r8.getRc_norms_desc()     // Catch:{ Exception -> 0x0063 }
            boolean r2 = r0.m(r2)     // Catch:{ Exception -> 0x0063 }
            if (r2 != 0) goto L_0x00c7
            com.nic.mparivahan.MyTextView r2 = r7.Q     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_norms_desc()     // Catch:{ Exception -> 0x0063 }
        L_0x00c3:
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            goto L_0x00d1
        L_0x00c7:
            android.widget.LinearLayout r2 = r7.R     // Catch:{ Exception -> 0x0063 }
            r2.setVisibility(r1)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r2 = r7.Q     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = "Not Available|Applicable"
            goto L_0x00c3
        L_0x00d1:
            java.lang.String r2 = r8.getRc_pucc_no()     // Catch:{ Exception -> 0x0063 }
            boolean r2 = r0.m(r2)     // Catch:{ Exception -> 0x0063 }
            if (r2 != 0) goto L_0x00e5
            com.nic.mparivahan.MyTextView r2 = r7.G     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_pucc_no()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            goto L_0x00ea
        L_0x00e5:
            com.nic.mparivahan.MyTextView r2 = r7.G     // Catch:{ Exception -> 0x0063 }
            r2.setText(r3)     // Catch:{ Exception -> 0x0063 }
        L_0x00ea:
            java.lang.String r2 = r8.getRc_pucc_upto()     // Catch:{ Exception -> 0x0063 }
            boolean r2 = r0.m(r2)     // Catch:{ Exception -> 0x0063 }
            if (r2 != 0) goto L_0x00fe
            com.nic.mparivahan.MyTextView r2 = r7.J     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_pucc_upto()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0103
        L_0x00fe:
            com.nic.mparivahan.MyTextView r2 = r7.J     // Catch:{ Exception -> 0x0063 }
            r2.setText(r3)     // Catch:{ Exception -> 0x0063 }
        L_0x0103:
            com.nic.mparivahan.MyTextView r2 = r7.f28217a0     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_registered_at()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = r8.getRc_maker_model()     // Catch:{ Exception -> 0x0063 }
            boolean r2 = com.nic.mparivahan.dlservices.utilities.d.d(r2)     // Catch:{ Exception -> 0x0063 }
            if (r2 == 0) goto L_0x0120
            com.nic.mparivahan.MyTextView r2 = r7.N     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_maker_model()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0125
        L_0x0120:
            com.nic.mparivahan.MyTextView r2 = r7.N     // Catch:{ Exception -> 0x0063 }
            r2.setText(r3)     // Catch:{ Exception -> 0x0063 }
        L_0x0125:
            java.lang.String r2 = r8.getRc_insurance_comp()     // Catch:{ Exception -> 0x0063 }
            boolean r2 = com.nic.mparivahan.dlservices.utilities.d.d(r2)     // Catch:{ Exception -> 0x0063 }
            if (r2 == 0) goto L_0x0139
            com.nic.mparivahan.MyTextView r2 = r7.f28250r     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_insurance_comp()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            goto L_0x013e
        L_0x0139:
            com.nic.mparivahan.MyTextView r2 = r7.f28250r     // Catch:{ Exception -> 0x0063 }
            r2.setText(r3)     // Catch:{ Exception -> 0x0063 }
        L_0x013e:
            java.lang.String r2 = r8.getRc_insurance_policy_no()     // Catch:{ Exception -> 0x0063 }
            boolean r2 = com.nic.mparivahan.dlservices.utilities.d.d(r2)     // Catch:{ Exception -> 0x0063 }
            if (r2 == 0) goto L_0x0152
            com.nic.mparivahan.MyTextView r2 = r7.f28252s     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_insurance_policy_no()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0157
        L_0x0152:
            com.nic.mparivahan.MyTextView r2 = r7.f28252s     // Catch:{ Exception -> 0x0063 }
            r2.setText(r3)     // Catch:{ Exception -> 0x0063 }
        L_0x0157:
            java.lang.String r2 = r8.getRc_financer()     // Catch:{ Exception -> 0x0063 }
            boolean r2 = r0.m(r2)     // Catch:{ Exception -> 0x0063 }
            if (r2 != 0) goto L_0x016b
            com.nic.mparivahan.MyTextView r2 = r7.f28234j     // Catch:{ Exception -> 0x0063 }
            java.lang.String r3 = r8.getRc_financer()     // Catch:{ Exception -> 0x0063 }
        L_0x0167:
            r2.setText(r3)     // Catch:{ Exception -> 0x0063 }
            goto L_0x016e
        L_0x016b:
            com.nic.mparivahan.MyTextView r2 = r7.f28234j     // Catch:{ Exception -> 0x0063 }
            goto L_0x0167
        L_0x016e:
            java.lang.String r2 = r8.getRc_blacklist_status()     // Catch:{ Exception -> 0x0063 }
            boolean r2 = r0.m(r2)     // Catch:{ Exception -> 0x0063 }
            r3 = 8
            if (r2 != 0) goto L_0x0189
            android.widget.LinearLayout r2 = r7.f28260w     // Catch:{ Exception -> 0x0063 }
            r2.setVisibility(r1)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r2 = r7.f28255t0     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r8.getRc_blacklist_status()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0063 }
            goto L_0x018e
        L_0x0189:
            android.widget.LinearLayout r2 = r7.f28260w     // Catch:{ Exception -> 0x0063 }
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x0063 }
        L_0x018e:
            java.lang.String r2 = r8.getRc_np_no()     // Catch:{ Exception -> 0x0063 }
            boolean r2 = r0.m(r2)     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = "getText(...)"
            if (r2 != 0) goto L_0x01be
            com.nic.mparivahan.MyTextView r2 = r7.f28249q0     // Catch:{ Exception -> 0x0063 }
            java.lang.String r5 = r8.getRc_np_no()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r5)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r2 = r7.f28249q0     // Catch:{ Exception -> 0x0063 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x0063 }
            cm.l.e(r2, r4)     // Catch:{ Exception -> 0x0063 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x0063 }
            if (r2 != 0) goto L_0x01b8
            android.widget.LinearLayout r2 = r7.f28262x     // Catch:{ Exception -> 0x0063 }
        L_0x01b4:
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x0063 }
            goto L_0x01c1
        L_0x01b8:
            android.widget.LinearLayout r2 = r7.f28262x     // Catch:{ Exception -> 0x0063 }
            r2.setVisibility(r1)     // Catch:{ Exception -> 0x0063 }
            goto L_0x01c1
        L_0x01be:
            android.widget.LinearLayout r2 = r7.f28262x     // Catch:{ Exception -> 0x0063 }
            goto L_0x01b4
        L_0x01c1:
            java.lang.String r2 = r8.getRc_np_upto()     // Catch:{ Exception -> 0x0063 }
            boolean r2 = r0.m(r2)     // Catch:{ Exception -> 0x0063 }
            if (r2 != 0) goto L_0x01ef
            com.nic.mparivahan.MyTextView r2 = r7.f28251r0     // Catch:{ Exception -> 0x0063 }
            java.lang.String r5 = r8.getRc_np_upto()     // Catch:{ Exception -> 0x0063 }
            r2.setText(r5)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r2 = r7.f28251r0     // Catch:{ Exception -> 0x0063 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x0063 }
            cm.l.e(r2, r4)     // Catch:{ Exception -> 0x0063 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x0063 }
            if (r2 != 0) goto L_0x01e9
            android.widget.LinearLayout r2 = r7.f28264y     // Catch:{ Exception -> 0x0063 }
        L_0x01e5:
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x0063 }
            goto L_0x01f2
        L_0x01e9:
            android.widget.LinearLayout r2 = r7.f28264y     // Catch:{ Exception -> 0x0063 }
            r2.setVisibility(r1)     // Catch:{ Exception -> 0x0063 }
            goto L_0x01f2
        L_0x01ef:
            android.widget.LinearLayout r2 = r7.f28264y     // Catch:{ Exception -> 0x0063 }
            goto L_0x01e5
        L_0x01f2:
            java.lang.String r2 = r8.getRc_permit_valid_upto()     // Catch:{ Exception -> 0x0063 }
            boolean r0 = r0.m(r2)     // Catch:{ Exception -> 0x0063 }
            if (r0 != 0) goto L_0x0220
            com.nic.mparivahan.MyTextView r0 = r7.f28253s0     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = r8.getRc_permit_valid_upto()     // Catch:{ Exception -> 0x0063 }
            r0.setText(r2)     // Catch:{ Exception -> 0x0063 }
            com.nic.mparivahan.MyTextView r0 = r7.f28253s0     // Catch:{ Exception -> 0x0063 }
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ Exception -> 0x0063 }
            cm.l.e(r0, r4)     // Catch:{ Exception -> 0x0063 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0063 }
            if (r0 != 0) goto L_0x021a
            android.widget.LinearLayout r7 = r7.f28266z     // Catch:{ Exception -> 0x0063 }
        L_0x0216:
            r7.setVisibility(r3)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0223
        L_0x021a:
            android.widget.LinearLayout r7 = r7.f28266z     // Catch:{ Exception -> 0x0063 }
            r7.setVisibility(r1)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0223
        L_0x0220:
            android.widget.LinearLayout r7 = r7.f28266z     // Catch:{ Exception -> 0x0063 }
            goto L_0x0216
        L_0x0223:
            r7 = 1
            java.lang.String r8 = r6.u1(r8)     // Catch:{ Exception -> 0x0273 }
            java.lang.String r0 = "E@CHALLAN*#2017!"
            java.lang.String r8 = id.a.a(r8, r0)     // Catch:{ Exception -> 0x0273 }
            android.graphics.Bitmap r8 = r6.n1(r8)     // Catch:{ Exception -> 0x0273 }
            cm.l.c(r8)     // Catch:{ Exception -> 0x0273 }
            r6.L1(r8)     // Catch:{ Exception -> 0x0273 }
            android.content.res.Resources r8 = r6.getResources()     // Catch:{ Exception -> 0x0273 }
            r0 = 2131230867(0x7f080093, float:1.8077799E38)
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeResource(r8, r0)     // Catch:{ Exception -> 0x0273 }
            r0 = 80
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createScaledBitmap(r8, r0, r0, r7)     // Catch:{ Exception -> 0x0273 }
            java.lang.String r0 = "createScaledBitmap(...)"
            cm.l.e(r8, r0)     // Catch:{ Exception -> 0x0273 }
            android.graphics.Bitmap r0 = r6.s1()     // Catch:{ Exception -> 0x0273 }
            android.graphics.Bitmap r8 = r6.A1(r0, r8)     // Catch:{ Exception -> 0x0273 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0273 }
            r0.<init>()     // Catch:{ Exception -> 0x0273 }
            java.lang.String r1 = "RC No : "
            r0.append(r1)     // Catch:{ Exception -> 0x0273 }
            r0.append(r9)     // Catch:{ Exception -> 0x0273 }
            java.lang.String r9 = r0.toString()     // Catch:{ Exception -> 0x0273 }
            android.graphics.Bitmap r8 = r6.m1(r6, r8, r9)     // Catch:{ Exception -> 0x0273 }
            android.widget.ImageView r9 = r6.t1()     // Catch:{ Exception -> 0x0273 }
            r9.setImageBitmap(r8)     // Catch:{ Exception -> 0x0273 }
            goto L_0x0289
        L_0x0273:
            android.content.Context r8 = r6.getApplicationContext()     // Catch:{ Exception -> 0x0063 }
            r9 = 2132018876(0x7f1406bc, float:1.9676071E38)
            java.lang.String r9 = r6.getString(r9)     // Catch:{ Exception -> 0x0063 }
            android.widget.Toast r7 = android.widget.Toast.makeText(r8, r9, r7)     // Catch:{ Exception -> 0x0063 }
            r7.show()     // Catch:{ Exception -> 0x0063 }
            goto L_0x0289
        L_0x0286:
            r7.printStackTrace()
        L_0x0289:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.RC.VirtualRcScreen.N1(ni.q9, com.nic.mparivahan.RC.Model.NrvDetails, java.lang.String):void");
    }

    public final void O1(cd.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.O = aVar;
    }

    public final void P1(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void Q1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final void R1(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.R = gVar;
    }

    public final void S1(Context context, String str) {
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
        textView.setText(y1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById3).setText(y1().b("nex_parivahan", getString(R.string.app_name)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new d2(dialog));
        dialog.show();
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
        I1(RcService.f9484a.c(this));
        R1(new ld.g(this));
        Q1(new ld.c(this));
        this.P = RcImpoundService.f9481a.b(this);
        View findViewById = findViewById(R.id.rc_qr_img);
        cm.l.e(findViewById, "findViewById(...)");
        M1((ImageView) findViewById);
        K1(new ProgressDialog(this));
        r1().setMessage(y1().b("label_challan_please_wait", "Please wait..."));
        r1().setCancelable(false);
        r1().setCanceledOnTouchOutside(false);
        try {
            P1(q.B0(String.valueOf(getIntent().getStringExtra("RcNumber"))).toString());
            DatabaseHelper A0 = DatabaseHelper.A0(this);
            cm.l.e(A0, "getInstance(...)");
            H1(A0);
            this.I = o1().C0(w1());
            if (!ka.c.f13158a.m(w1())) {
                q9 q9Var3 = this.G;
                if (q9Var3 == null) {
                    cm.l.v("binding");
                    q9Var3 = null;
                }
                q9Var3.S.setText(w1());
                NrvDetails nrvDetails = this.I;
                if (nrvDetails != null) {
                    q9 q9Var4 = this.G;
                    if (q9Var4 == null) {
                        cm.l.v("binding");
                        q9Var4 = null;
                    }
                    N1(q9Var4, nrvDetails, w1());
                }
            }
            q9 q9Var5 = this.G;
            if (q9Var5 == null) {
                cm.l.v("binding");
                q9Var5 = null;
            }
            q9Var5.f28219b0.setOnClickListener(new z1(this));
            q9 q9Var6 = this.G;
            if (q9Var6 == null) {
                cm.l.v("binding");
                q9Var6 = null;
            }
            q9Var6.A.setOnClickListener(new a2(this));
            q9 q9Var7 = this.G;
            if (q9Var7 == null) {
                cm.l.v("binding");
                q9Var7 = null;
            }
            q9Var7.U.setOnClickListener(new b2(this));
        } catch (Error unused) {
        }
        J1((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(p1()))).a(cd.c.class));
        RcImpoundService rcImpoundService = this.P;
        if (rcImpoundService == null) {
            cm.l.v("rcImpoundService");
            rcImpoundService = null;
        }
        O1((cd.a) new u0((x0) this, (u0.b) new cd.b(new bd.a(rcImpoundService))).a(cd.a.class));
        q1().R().g(this, new g(new c(this)));
        q1().S().g(this, new g(new d(this)));
        q9 q9Var8 = this.G;
        if (q9Var8 == null) {
            cm.l.v("binding");
        } else {
            q9Var = q9Var8;
        }
        q9Var.f28244o.setOnClickListener(new c2(this));
        v1().l().g(this, new g(new e(this)));
        v1().k().g(this, new g(new f(this)));
        q1().U().g(this, new g(new a(this)));
        q1().T().g(this, new g(new b(this)));
    }

    public final RcService p1() {
        RcService rcService = this.N;
        if (rcService != null) {
            return rcService;
        }
        cm.l.v("mRcService");
        return null;
    }

    public final cd.c q1() {
        cd.c cVar = this.M;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mRcViewModel");
        return null;
    }

    public final ProgressDialog r1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final Bitmap s1() {
        Bitmap bitmap = this.K;
        if (bitmap != null) {
            return bitmap;
        }
        cm.l.v("qrBmp");
        return null;
    }

    public final ImageView t1() {
        ImageView imageView = this.J;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("qrImg");
        return null;
    }

    public final cd.a v1() {
        cd.a aVar = this.O;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("rcImpoundModel");
        return null;
    }

    public final String w1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails x1() {
        return this.I;
    }

    public final ld.c y1() {
        ld.c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final ld.g z1() {
        ld.g gVar = this.R;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("userSessionManager");
        return null;
    }
}
