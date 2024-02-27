package com.nic.mparivahan.ClServicesMainScreens;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.lifecycle.b0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.ClServices.View.ClDocumentsUpload;
import com.nic.mparivahan.ClServices.View.ClFeePayment;
import com.nic.mparivahan.ClServices.View.ClPhotoSignature;
import com.nic.mparivahan.ClServices.View.ClSots;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.utilities.e;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import fj.q;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.List;
import ld.c;
import ld.f;
import ni.g1;
import pl.x;
import u9.c0;
import u9.d0;
import u9.e0;
import u9.f0;

public final class ClSubmitScreen extends d {
    public g1 G;
    public c H;
    public Context I;
    public ProgressDialog J;
    private String K = "";
    private q L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public String X;
    public String Y;
    public f Z;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClSubmitScreen f8071e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ClSubmitScreen clSubmitScreen) {
            super(1);
            this.f8071e = clSubmitScreen;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            this.f8071e.t1().D.c(false);
            if (p.p(dlApplStatusDto.getStatusCode(), "00", false, 2, (Object) null) && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                this.f8071e.b2(applStatusDetailsItem.getApplFlowStatusList());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8072a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f8072a = lVar;
        }

        public final pl.c a() {
            return this.f8072a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8072a.invoke(obj);
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

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0192  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void C1() {
        /*
            r4 = this;
            r4.T1(r4)
            ld.c r0 = new ld.c
            android.content.Context r1 = r4.u1()
            r0.<init>(r1)
            r4.Z1(r0)
            ld.f r0 = new ld.f
            android.content.Context r1 = r4.u1()
            r0.<init>(r1)
            r4.Y1(r0)
            android.app.ProgressDialog r0 = new android.app.ProgressDialog
            android.content.Context r1 = r4.u1()
            r0.<init>(r1)
            r4.V1(r0)
            android.app.ProgressDialog r0 = r4.w1()
            ld.c r1 = r4.A1()
            r2 = 2132018813(0x7f14067d, float:1.9675943E38)
            java.lang.String r2 = r4.getString(r2)
            java.lang.String r3 = "label_challan_please_wait"
            java.lang.String r1 = r1.b(r3, r2)
            r0.setMessage(r1)
            android.app.ProgressDialog r0 = r4.w1()
            r1 = 0
            r0.setCancelable(r1)
            android.app.ProgressDialog r0 = r4.w1()
            r0.setCanceledOnTouchOutside(r1)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            r0.<init>(r4)
            java.lang.Class<fj.q> r2 = fj.q.class
            androidx.lifecycle.t0 r0 = r0.a(r2)
            fj.q r0 = (fj.q) r0
            r4.L = r0
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = "appNumber"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018e }
            r4.K = r0     // Catch:{ Exception -> 0x018e }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = "dobValue"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018e }
            r4.P1(r0)     // Catch:{ Exception -> 0x018e }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = "dlValue"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018e }
            r4.O1(r0)     // Catch:{ Exception -> 0x018e }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = "fatherName"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018e }
            r4.Q1(r0)     // Catch:{ Exception -> 0x018e }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = "clName"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018e }
            r4.L1(r0)     // Catch:{ Exception -> 0x018e }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = "clPhoto"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018e }
            r4.M1(r0)     // Catch:{ Exception -> 0x018e }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = "rtoCode"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018e }
            r4.W1(r0)     // Catch:{ Exception -> 0x018e }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = "rtoName"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018e }
            r4.X1(r0)     // Catch:{ Exception -> 0x018e }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = "stateCode"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018e }
            r4.a2(r0)     // Catch:{ Exception -> 0x018e }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = "Mobile_no"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018e }
            r4.U1(r0)     // Catch:{ Exception -> 0x018e }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = "address"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018e }
            r4.K1(r0)     // Catch:{ Exception -> 0x018e }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = "issuing_authority"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018e }
            r4.R1(r0)     // Catch:{ Exception -> 0x018e }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = "validity"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018e }
            r4.c2(r0)     // Catch:{ Exception -> 0x018e }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = "cl_Status"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018e }
            r4.N1(r0)     // Catch:{ Exception -> 0x018e }
            ni.g1 r0 = r4.t1()     // Catch:{ Exception -> 0x018e }
            android.widget.TextView r0 = r0.F     // Catch:{ Exception -> 0x018e }
            ld.f r2 = r4.z1()     // Catch:{ Exception -> 0x018e }
            java.lang.String r2 = r2.i()     // Catch:{ Exception -> 0x018e }
            r0.setText(r2)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = r4.n1()     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x0183
            int r0 = r0.length()     // Catch:{ Exception -> 0x018e }
            if (r0 != 0) goto L_0x0168
            goto L_0x0183
        L_0x0168:
            ni.g1 r0 = r4.t1()     // Catch:{ Exception -> 0x018e }
            androidx.cardview.widget.CardView r0 = r0.C     // Catch:{ Exception -> 0x018e }
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x018e }
            ni.g1 r0 = r4.t1()     // Catch:{ Exception -> 0x018e }
            android.widget.ImageView r0 = r0.f26444z     // Catch:{ Exception -> 0x018e }
            java.lang.String r1 = r4.n1()     // Catch:{ Exception -> 0x018e }
            android.graphics.Bitmap r1 = com.nic.mparivahan.dlservices.utilities.d.a(r1)     // Catch:{ Exception -> 0x018e }
            r0.setImageBitmap(r1)     // Catch:{ Exception -> 0x018e }
            goto L_0x018e
        L_0x0183:
            ni.g1 r0 = r4.t1()     // Catch:{ Exception -> 0x018e }
            androidx.cardview.widget.CardView r0 = r0.C     // Catch:{ Exception -> 0x018e }
            r1 = 8
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x018e }
        L_0x018e:
            fj.q r0 = r4.L
            if (r0 != 0) goto L_0x0198
            java.lang.String r0 = "viewModel"
            cm.l.v(r0)
            r0 = 0
        L_0x0198:
            androidx.lifecycle.y r0 = r0.l()
            com.nic.mparivahan.ClServicesMainScreens.ClSubmitScreen$a r1 = new com.nic.mparivahan.ClServicesMainScreens.ClSubmitScreen$a
            r1.<init>(r4)
            com.nic.mparivahan.ClServicesMainScreens.ClSubmitScreen$b r2 = new com.nic.mparivahan.ClServicesMainScreens.ClSubmitScreen$b
            r2.<init>(r1)
            r0.g(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServicesMainScreens.ClSubmitScreen.C1():void");
    }

    private final void D1(ConstraintLayout constraintLayout) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(constraintLayout.getWidth(), constraintLayout.getHeight(), Bitmap.Config.ARGB_8888);
            cm.l.e(createBitmap, "createBitmap(...)");
            constraintLayout.draw(new Canvas(createBitmap));
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "//";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(str + "screenshot" + this.K + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            createBitmap.compress(Bitmap.CompressFormat.PNG, 70, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            d2(file2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void F1(ClSubmitScreen clSubmitScreen, View view) {
        cm.l.f(clSubmitScreen, "this$0");
        if (e.e(clSubmitScreen)) {
            ConstraintLayout constraintLayout = clSubmitScreen.t1().f26442x;
            cm.l.e(constraintLayout, "containerCl");
            clSubmitScreen.D1(constraintLayout);
        }
    }

    /* access modifiers changed from: private */
    public static final void G1(ClSubmitScreen clSubmitScreen, View view) {
        String k10;
        cm.l.f(clSubmitScreen, "this$0");
        String str = clSubmitScreen.K;
        if (str != null && (k10 = e.k(clSubmitScreen.q1(), "yyyy-MM-dd", "dd-MM-yyyy")) != null) {
            clSubmitScreen.t1().D.c(true);
            q qVar = clSubmitScreen.L;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            qVar.h(str, k10);
        }
    }

    /* access modifiers changed from: private */
    public static final void H1(ClSubmitScreen clSubmitScreen, View view) {
        cm.l.f(clSubmitScreen, "this$0");
        Intent intent = new Intent(clSubmitScreen, DashBoard.class);
        intent.setFlags(67108864);
        clSubmitScreen.startActivity(intent);
        clSubmitScreen.finish();
    }

    private final void I1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new f0(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void J1(Dialog dialog, ClSubmitScreen clSubmitScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(clSubmitScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(clSubmitScreen, DashBoard.class);
        intent.setFlags(67108864);
        clSubmitScreen.startActivity(intent);
        clSubmitScreen.finish();
    }

    /* access modifiers changed from: private */
    public final void b2(List list) {
        Integer num;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                num = null;
                break;
            }
            Object obj = list.get(i10);
            cm.l.c(obj);
            if (cm.l.a(((ApplFlowStatusListItem) obj).getStatus(), "Pending")) {
                Object obj2 = list.get(i10);
                cm.l.c(obj2);
                Integer acCd = ((ApplFlowStatusListItem) obj2).getAcCd();
                if (acCd != null && acCd.intValue() == 455) {
                }
            }
            i10++;
        }
        Object obj3 = list.get(i10);
        cm.l.c(obj3);
        num = ((ApplFlowStatusListItem) obj3).getAcCd();
        if (num == null) {
            new DLServiceFinalSubmitedActivity().D1(this);
        } else {
            E1(num);
        }
    }

    private final void d2(File file) {
        Uri g10 = FileProvider.g(this, "com.nic.mparivahan.provider", file);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "image/*");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, A1().b("popup_pdf_error", getString(R.string.pdf_error)), 1).show();
        }
    }

    private final void e2() {
        try {
            Intent intent = new Intent(this, ClDocumentsUpload.class);
            intent.putExtra("dl_st_appl_ackno_no", this.K);
            intent.putExtra("dl_st_appl_ackno_no_dob", k1(q1()));
            intent.putExtra("DL", p1());
            intent.putExtra("clPhoto", n1());
            intent.putExtra("dob", k1(q1()));
            intent.putExtra("Mobile_no", v1());
            intent.putExtra("lastEndorsedRTO", y1());
            intent.putExtra("lastEndorsedRTOCode", x1());
            intent.putExtra("fatherName", r1());
            intent.putExtra("clName", m1());
            intent.putExtra("address", l1()).toString();
            intent.putExtra("issuing_authority", s1()).toString();
            intent.putExtra("validity", B1()).toString();
            intent.putExtra("cl_Status", o1()).toString();
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void f2() {
        try {
            Intent intent = new Intent(this, ClFeePayment.class);
            intent.putExtra("dl_st_appl_ackno_no", this.K);
            intent.putExtra("dl_st_appl_ackno_no_dob", k1(q1()));
            intent.putExtra("DL", p1());
            intent.putExtra("clPhoto", n1());
            intent.putExtra("dob", k1(q1()));
            intent.putExtra("Mobile_no", v1());
            intent.putExtra("lastEndorsedRTO", y1());
            intent.putExtra("lastEndorsedRTOCode", x1());
            intent.putExtra("fatherName", r1());
            intent.putExtra("clName", m1());
            intent.putExtra("address", l1()).toString();
            intent.putExtra("issuing_authority", s1()).toString();
            intent.putExtra("validity", B1()).toString();
            intent.putExtra("cl_Status", o1()).toString();
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void g2() {
        try {
            Intent intent = new Intent(this, ClPhotoSignature.class);
            intent.putExtra("dl_st_appl_ackno_no", this.K);
            intent.putExtra("dl_st_appl_ackno_no_dob", k1(q1()));
            intent.putExtra("DL", p1());
            intent.putExtra("dob", k1(q1()));
            intent.putExtra("Mobile_no", v1());
            intent.putExtra("lastEndorsedRTO", y1());
            intent.putExtra("lastEndorsedRTOCode", x1());
            intent.putExtra("clPhoto", n1());
            intent.putExtra("fatherName", r1());
            intent.putExtra("clName", m1());
            intent.putExtra("fatherName", r1());
            intent.putExtra("clName", m1());
            intent.putExtra("clPhoto", n1());
            intent.putExtra("address", l1()).toString();
            intent.putExtra("issuing_authority", s1()).toString();
            intent.putExtra("validity", B1()).toString();
            intent.putExtra("cl_Status", o1()).toString();
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void h2() {
        try {
            Intent intent = new Intent(this, ClSots.class);
            intent.putExtra("dl_st_appl_ackno_no", this.K);
            intent.putExtra("dl_st_appl_ackno_no_dob", k1(q1()));
            intent.putExtra("DL", p1());
            intent.putExtra("clPhoto", n1());
            intent.putExtra("dob", k1(q1()));
            intent.putExtra("Mobile_no", v1());
            intent.putExtra("lastEndorsedRTO", y1());
            intent.putExtra("lastEndorsedRTOCode", x1());
            intent.putExtra("fatherName", r1());
            intent.putExtra("clName", m1());
            intent.putExtra("address", l1()).toString();
            intent.putExtra("issuing_authority", s1()).toString();
            intent.putExtra("validity", B1()).toString();
            intent.putExtra("cl_Status", o1()).toString();
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final c A1() {
        c cVar = this.H;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final String B1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("validity");
        return null;
    }

    public final void E1(Integer num) {
        if (num != null && num.intValue() == 135) {
            g2();
        } else if (num != null && num.intValue() == 134) {
            f2();
        } else if (num != null && num.intValue() == 123) {
            e2();
        } else if (num != null && num.intValue() == 371) {
            h2();
        } else if (num != null && num.intValue() == 455) {
            I1(A1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void K1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void L1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void M1(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final void N1(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void O1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void P1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void Q1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void R1(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void S1(g1 g1Var) {
        cm.l.f(g1Var, "<set-?>");
        this.G = g1Var;
    }

    public final void T1(Context context) {
        cm.l.f(context, "<set-?>");
        this.I = context;
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.Y = str;
    }

    public final void V1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void W1(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final void X1(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final void Y1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.Z = fVar;
    }

    public final void Z1(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.H = cVar;
    }

    public final void a2(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void c2(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final String k1(String str) {
        cm.l.f(str, "date");
        try {
            String format = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(str));
            cm.l.c(format);
            return format;
        } catch (Exception e10) {
            e10.printStackTrace();
            return k1(str);
        }
    }

    public final String l1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("address");
        return null;
    }

    public final String m1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("clName");
        return null;
    }

    public final String n1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("clPhoto");
        return null;
    }

    public final String o1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("cl_Status");
        return null;
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g1 x10 = g1.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        S1(x10);
        setContentView(t1().m());
        C1();
        v9.e.f17509a.f0(this, t1());
        if (p.o(this.K, "", true)) {
            t1().f26441w.setText(A1().b("label_app_for_four", getString(R.string.lbl4)));
        } else {
            MyTextView myTextView = t1().f26441w;
            myTextView.setText((A1().b("label_app_for_four", getString(R.string.lbl4)) + 10 + A1().b("label_app_for_three", getString(R.string.lbl3))) + ' ' + this.K);
        }
        t1().E.setOnClickListener(new c0(this));
        t1().D.setOnClickListener(new d0(this));
        t1().B.setOnClickListener(new e0(this));
    }

    public final String p1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("dlValue");
        return null;
    }

    public final String q1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("dobValue");
        return null;
    }

    public final String r1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("fatherName");
        return null;
    }

    public final String s1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("issuing_authority");
        return null;
    }

    public final g1 t1() {
        g1 g1Var = this.G;
        if (g1Var != null) {
            return g1Var;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final Context u1() {
        Context context = this.I;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final String v1() {
        String str = this.Y;
        if (str != null) {
            return str;
        }
        cm.l.v("Mobile_no");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String x1() {
        String str = this.V;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoCode");
        return null;
    }

    public final String y1() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoName");
        return null;
    }

    public final f z1() {
        f fVar = this.Z;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }
}
