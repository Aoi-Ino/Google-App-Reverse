package com.nic.mparivahan.DLServicesAuth.View;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import ba.b;
import cm.l;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.Result;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.a;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.utilities.c;
import java.util.HashMap;
import java.util.List;
import ld.f;
import ni.ja;
import oi.g;

public final class DlServiceBasicInfoActivity extends g {
    public ja J;
    private Integer K;
    private String L;
    private String M;
    private String N;
    private String O = "";
    private String P = "";
    public DldetobjX Q;
    public f R;
    public b S;
    public ImageView T;
    public LinearLayout U;
    private HashMap V = new HashMap();
    public DlServiceInt W;

    /* access modifiers changed from: private */
    public static final void I1(DlServiceBasicInfoActivity dlServiceBasicInfoActivity, View view) {
        l.f(dlServiceBasicInfoActivity, "this$0");
        dlServiceBasicInfoActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void J1(DlServiceBasicInfoActivity dlServiceBasicInfoActivity, View view) {
        l.f(dlServiceBasicInfoActivity, "this$0");
        Intent intent = new Intent(dlServiceBasicInfoActivity, DashBoard.class);
        intent.setFlags(67108864);
        dlServiceBasicInfoActivity.startActivity(intent);
        dlServiceBasicInfoActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void K1(DlServiceBasicInfoActivity dlServiceBasicInfoActivity, View view) {
        l.f(dlServiceBasicInfoActivity, "this$0");
        dlServiceBasicInfoActivity.B1().f26997g.c(true);
        c.a aVar = c.f22374a;
        q.B0(String.valueOf(aVar.b(aVar.g(9999.0d, 99999.0d)))).toString();
        if (a.f9624a.a(dlServiceBasicInfoActivity)) {
            b D1 = dlServiceBasicInfoActivity.D1();
            String str = dlServiceBasicInfoActivity.L;
            l.c(str);
            D1.x(dlServiceBasicInfoActivity, str, dlServiceBasicInfoActivity.C1().getBioObj().getBioDob());
            return;
        }
        Toast.makeText(dlServiceBasicInfoActivity.getApplicationContext(), "Please Check Your Internet connection", 1).show();
    }

    /* access modifiers changed from: private */
    public static final void L1(DlServiceBasicInfoActivity dlServiceBasicInfoActivity, DlLastRtoDetailsDto dlLastRtoDetailsDto) {
        List<Result> result;
        l.f(dlServiceBasicInfoActivity, "this$0");
        dlServiceBasicInfoActivity.B1().f26997g.c(false);
        try {
            if (dlLastRtoDetailsDto.getStatus_code().equals("00") && dlLastRtoDetailsDto.getStatus_desc().equals("success") && (result = dlLastRtoDetailsDto.getResult()) != null) {
                String rtoCode = result.get(0).getRtoCode();
                l.c(rtoCode);
                dlServiceBasicInfoActivity.O = rtoCode;
                String stCode = result.get(0).getStCode();
                l.c(stCode);
                dlServiceBasicInfoActivity.P = stCode;
                Intent intent = new Intent(dlServiceBasicInfoActivity, DlServiceDetailsActivity.class);
                intent.putExtra("DL", dlServiceBasicInfoActivity.L);
                intent.putExtra("dob", dlServiceBasicInfoActivity.M);
                intent.putExtra("DLDetails", dlServiceBasicInfoActivity.C1());
                intent.putExtra("Mobile_no", dlServiceBasicInfoActivity.N);
                intent.putExtra("lastEndorsedRTO", result.get(0).getLastEndRTO());
                intent.putExtra("lastEndorsedState", result.get(0).getLastEndState());
                intent.putExtra("lastEndorsedRTOCode", dlServiceBasicInfoActivity.O);
                intent.putExtra("lastEndorseStateCode", dlServiceBasicInfoActivity.P);
                intent.putExtra("whatServiceRequired", dlServiceBasicInfoActivity.V);
                dlServiceBasicInfoActivity.startActivity(intent);
            }
        } catch (Exception unused) {
            dlServiceBasicInfoActivity.N1(dlServiceBasicInfoActivity, dlServiceBasicInfoActivity.getString(R.string.service_unavable_please_try));
        }
    }

    /* access modifiers changed from: private */
    public static final void M1(DlServiceBasicInfoActivity dlServiceBasicInfoActivity, String str) {
        l.f(dlServiceBasicInfoActivity, "this$0");
        dlServiceBasicInfoActivity.N1(dlServiceBasicInfoActivity, dlServiceBasicInfoActivity.getString(R.string.service_unavable_please_try));
    }

    /* access modifiers changed from: private */
    public static final void O1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final ja B1() {
        ja jaVar = this.J;
        if (jaVar != null) {
            return jaVar;
        }
        l.v("binding");
        return null;
    }

    public final DldetobjX C1() {
        DldetobjX dldetobjX = this.Q;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        l.v("dlDetails");
        return null;
    }

    public final b D1() {
        b bVar = this.S;
        if (bVar != null) {
            return bVar;
        }
        l.v("dlServicesViewModel");
        return null;
    }

    public final LinearLayout E1() {
        LinearLayout linearLayout = this.U;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("ll_home");
        return null;
    }

    public final ImageView F1() {
        ImageView imageView = this.T;
        if (imageView != null) {
            return imageView;
        }
        l.v("mvvm_back");
        return null;
    }

    public final DlServiceInt G1() {
        DlServiceInt dlServiceInt = this.W;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        l.v("retrofitService");
        return null;
    }

    public final f H1() {
        f fVar = this.R;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final void N1(Context context, String str) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new f(dialog));
        dialog.show();
    }

    public final void P1(ja jaVar) {
        l.f(jaVar, "<set-?>");
        this.J = jaVar;
    }

    public final void Q1(DldetobjX dldetobjX) {
        l.f(dldetobjX, "<set-?>");
        this.Q = dldetobjX;
    }

    public final void R1(b bVar) {
        l.f(bVar, "<set-?>");
        this.S = bVar;
    }

    public final void S1(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.U = linearLayout;
    }

    public final void T1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.T = imageView;
    }

    public final void U1(DlServiceInt dlServiceInt) {
        l.f(dlServiceInt, "<set-?>");
        this.W = dlServiceInt;
    }

    public final void V1(f fVar) {
        l.f(fVar, "<set-?>");
        this.R = fVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x02aa A[Catch:{ Exception -> 0x02dc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            r4 = 2131558756(0x7f0d0164, float:1.8742837E38)
            r3.setContentView((int) r4)
            android.view.LayoutInflater r4 = r3.getLayoutInflater()
            ni.ja r4 = ni.ja.c(r4)
            java.lang.String r0 = "inflate(...)"
            cm.l.e(r4, r0)
            r3.P1(r4)
            ni.ja r4 = r3.B1()
            android.widget.LinearLayout r4 = r4.b()
            r3.setContentView((android.view.View) r4)
            ld.f r4 = new ld.f
            r4.<init>(r3)
            r3.V1(r4)
            com.nic.mparivahan.dlservices.data.network.DlServiceInt$a r4 = com.nic.mparivahan.dlservices.data.network.DlServiceInt.f21675a
            com.nic.mparivahan.dlservices.data.network.DlServiceInt r4 = r4.a(r3)
            r3.U1(r4)
            androidx.lifecycle.u0 r4 = new androidx.lifecycle.u0
            ba.a r0 = new ba.a
            y9.a r1 = new y9.a
            com.nic.mparivahan.dlservices.data.network.DlServiceInt r2 = r3.G1()
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r4.<init>((androidx.lifecycle.x0) r3, (androidx.lifecycle.u0.b) r0)
            java.lang.Class<ba.b> r0 = ba.b.class
            androidx.lifecycle.t0 r4 = r4.a(r0)
            ba.b r4 = (ba.b) r4
            r3.R1(r4)
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r0 = "isMobileOrAadhar"
            r1 = -1
            int r4 = r4.getIntExtra(r0, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.K = r4
            if (r4 != 0) goto L_0x0067
            goto L_0x0078
        L_0x0067:
            int r4 = r4.intValue()
            r0 = 1
            if (r4 != r0) goto L_0x0078
            ni.ja r4 = r3.B1()
            android.widget.LinearLayout r4 = r4.f27000j
            r0 = 4
            r4.setVisibility(r0)
        L_0x0078:
            android.content.Intent r4 = r3.getIntent()     // Catch:{ Exception -> 0x014f }
            java.lang.String r0 = "DL"
            java.lang.String r4 = r4.getStringExtra(r0)     // Catch:{ Exception -> 0x014f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x014f }
            r3.L = r4     // Catch:{ Exception -> 0x014f }
            android.content.Intent r4 = r3.getIntent()     // Catch:{ Exception -> 0x014f }
            java.lang.String r0 = "dob"
            java.lang.String r4 = r4.getStringExtra(r0)     // Catch:{ Exception -> 0x014f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x014f }
            r3.M = r4     // Catch:{ Exception -> 0x014f }
            android.content.Intent r4 = r3.getIntent()     // Catch:{ Exception -> 0x014f }
            java.lang.String r0 = "Mobile_no"
            java.lang.String r4 = r4.getStringExtra(r0)     // Catch:{ Exception -> 0x014f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x014f }
            r3.N = r4     // Catch:{ Exception -> 0x014f }
            android.content.Intent r4 = r3.getIntent()     // Catch:{ Exception -> 0x014f }
            java.lang.String r0 = "DLDetails"
            java.io.Serializable r4 = r4.getSerializableExtra(r0)     // Catch:{ Exception -> 0x014f }
            java.lang.String r0 = "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX"
            cm.l.d(r4, r0)     // Catch:{ Exception -> 0x014f }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = (com.nic.mparivahan.Dl.Model.DldetobjX) r4     // Catch:{ Exception -> 0x014f }
            r3.Q1(r4)     // Catch:{ Exception -> 0x014f }
            android.content.Intent r4 = r3.getIntent()     // Catch:{ Exception -> 0x014f }
            java.lang.String r0 = "whatServiceRequired"
            java.io.Serializable r4 = r4.getSerializableExtra(r0)     // Catch:{ Exception -> 0x014f }
            java.lang.String r0 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>"
            cm.l.d(r4, r0)     // Catch:{ Exception -> 0x014f }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ Exception -> 0x014f }
            r3.V = r4     // Catch:{ Exception -> 0x014f }
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x014f }
            android.widget.TextView r4 = r4.f27009s     // Catch:{ Exception -> 0x014f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f }
            r0.<init>()     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = "DL No.: "
            r0.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = r3.L     // Catch:{ Exception -> 0x014f }
            r0.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x014f }
            r4.setText(r0)     // Catch:{ Exception -> 0x014f }
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x014f }
            com.nic.mparivahan.dlservices.widget.MyTextView r4 = r4.f26999i     // Catch:{ Exception -> 0x014f }
            ld.f r0 = r3.H1()     // Catch:{ Exception -> 0x014f }
            java.lang.String r0 = r0.i()     // Catch:{ Exception -> 0x014f }
            r4.setText(r0)     // Catch:{ Exception -> 0x014f }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r3.C1()     // Catch:{ Exception -> 0x014f }
            com.nic.mparivahan.Dl.Model.BioImgObjX r4 = r4.getBioImgObj()     // Catch:{ Exception -> 0x014f }
            if (r4 == 0) goto L_0x010b
            java.lang.String r4 = r4.getBiPhoto()     // Catch:{ Exception -> 0x014f }
            goto L_0x010c
        L_0x010b:
            r4 = 0
        L_0x010c:
            r0 = 0
            r1 = 8
            if (r4 != 0) goto L_0x0124
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x014f }
            androidx.cardview.widget.CardView r4 = r4.f26998h     // Catch:{ Exception -> 0x014f }
            r4.setVisibility(r1)     // Catch:{ Exception -> 0x014f }
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x014f }
            androidx.cardview.widget.CardView r4 = r4.f26994d     // Catch:{ Exception -> 0x014f }
            r4.setVisibility(r0)     // Catch:{ Exception -> 0x014f }
            goto L_0x014f
        L_0x0124:
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x014f }
            androidx.cardview.widget.CardView r4 = r4.f26998h     // Catch:{ Exception -> 0x014f }
            r4.setVisibility(r0)     // Catch:{ Exception -> 0x014f }
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x014f }
            androidx.cardview.widget.CardView r4 = r4.f26994d     // Catch:{ Exception -> 0x014f }
            r4.setVisibility(r1)     // Catch:{ Exception -> 0x014f }
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x014f }
            android.widget.ImageView r4 = r4.f26996f     // Catch:{ Exception -> 0x014f }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r3.C1()     // Catch:{ Exception -> 0x014f }
            com.nic.mparivahan.Dl.Model.BioImgObjX r0 = r0.getBioImgObj()     // Catch:{ Exception -> 0x014f }
            java.lang.String r0 = r0.getBiPhoto()     // Catch:{ Exception -> 0x014f }
            android.graphics.Bitmap r0 = com.nic.mparivahan.dlservices.utilities.d.a(r0)     // Catch:{ Exception -> 0x014f }
            r4.setImageBitmap(r0)     // Catch:{ Exception -> 0x014f }
        L_0x014f:
            r4 = 2131363686(0x7f0a0766, float:1.8347188E38)
            android.view.View r4 = r3.findViewById(r4)
            java.lang.String r0 = "findViewById(...)"
            cm.l.e(r4, r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.T1(r4)
            android.widget.ImageView r4 = r3.F1()
            com.nic.mparivahan.DLServicesAuth.View.a r1 = new com.nic.mparivahan.DLServicesAuth.View.a
            r1.<init>(r3)
            r4.setOnClickListener(r1)
            r4 = 2131363498(0x7f0a06aa, float:1.8346807E38)
            android.view.View r4 = r3.findViewById(r4)
            cm.l.e(r4, r0)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.S1(r4)
            android.widget.LinearLayout r4 = r3.E1()
            com.nic.mparivahan.DLServicesAuth.View.b r0 = new com.nic.mparivahan.DLServicesAuth.View.b
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x02dc }
            android.widget.TextView r4 = r4.f26995e     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r3.C1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.DlobjX r0 = r0.getDlobj()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = r0.getDlIssuedt()     // Catch:{ Exception -> 0x02dc }
            r4.setText(r0)     // Catch:{ Exception -> 0x02dc }
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x02dc }
            android.widget.TextView r4 = r4.f26992b     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r3.C1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = r0.getBioFullName()     // Catch:{ Exception -> 0x02dc }
            r4.setText(r0)     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r3.C1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.getBioDependentRelation()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = "F"
            boolean r4 = cm.l.a(r4, r0)     // Catch:{ Exception -> 0x02dc }
            if (r4 != 0) goto L_0x027e
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r3.C1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.getBioDependentRelation()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = "f"
            boolean r4 = cm.l.a(r4, r0)     // Catch:{ Exception -> 0x02dc }
            if (r4 == 0) goto L_0x01db
            goto L_0x027e
        L_0x01db:
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r3.C1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.getBioDependentRelation()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = "H"
            boolean r4 = cm.l.a(r4, r0)     // Catch:{ Exception -> 0x02dc }
            if (r4 != 0) goto L_0x0275
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r3.C1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.getBioDependentRelation()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = "h"
            boolean r4 = cm.l.a(r4, r0)     // Catch:{ Exception -> 0x02dc }
            if (r4 == 0) goto L_0x0205
            goto L_0x0275
        L_0x0205:
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r3.C1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.getBioDependentRelation()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = "G"
            boolean r4 = cm.l.a(r4, r0)     // Catch:{ Exception -> 0x02dc }
            if (r4 != 0) goto L_0x026c
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r3.C1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.getBioDependentRelation()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = "g"
            boolean r4 = cm.l.a(r4, r0)     // Catch:{ Exception -> 0x02dc }
            if (r4 == 0) goto L_0x022e
            goto L_0x026c
        L_0x022e:
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r3.C1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.getBioDependentRelation()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = "M"
            boolean r4 = cm.l.a(r4, r0)     // Catch:{ Exception -> 0x02dc }
            if (r4 != 0) goto L_0x0263
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r3.C1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.getBioDependentRelation()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = "m"
            boolean r4 = cm.l.a(r4, r0)     // Catch:{ Exception -> 0x02dc }
            if (r4 == 0) goto L_0x0257
            goto L_0x0263
        L_0x0257:
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.dlservices.widget.MyTextView r4 = r4.f27012v     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = "on/Wife/Daughter of"
        L_0x025f:
            r4.setText(r0)     // Catch:{ Exception -> 0x02dc }
            goto L_0x0287
        L_0x0263:
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.dlservices.widget.MyTextView r4 = r4.f27012v     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = "Mother's Name"
            goto L_0x025f
        L_0x026c:
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.dlservices.widget.MyTextView r4 = r4.f27012v     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = "Guardian's Name"
            goto L_0x025f
        L_0x0275:
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.dlservices.widget.MyTextView r4 = r4.f27012v     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = "Husband's Name"
            goto L_0x025f
        L_0x027e:
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.dlservices.widget.MyTextView r4 = r4.f27012v     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = "Father's Name"
            goto L_0x025f
        L_0x0287:
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x02dc }
            android.widget.TextView r4 = r4.f27011u     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r3.C1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = r0.getBioSwdFullName()     // Catch:{ Exception -> 0x02dc }
            r4.setText(r0)     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r3.C1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.getBioAadhaarName()     // Catch:{ Exception -> 0x02dc }
            if (r4 == 0) goto L_0x02dc
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x02dc }
            android.widget.TextView r4 = r4.f27010t     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r3.C1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = r0.getBioAadhaarName()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02dc }
            r4.setText(r0)     // Catch:{ Exception -> 0x02dc }
            ni.ja r4 = r3.B1()     // Catch:{ Exception -> 0x02dc }
            android.widget.TextView r4 = r4.f27008r     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r3.C1()     // Catch:{ Exception -> 0x02dc }
            com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = r0.getBioPerDetAadhaar()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02dc }
            r4.setText(r0)     // Catch:{ Exception -> 0x02dc }
        L_0x02dc:
            ni.ja r4 = r3.B1()
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r4 = r4.f26997g
            com.nic.mparivahan.DLServicesAuth.View.c r0 = new com.nic.mparivahan.DLServicesAuth.View.c
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            ba.b r4 = r3.D1()
            androidx.lifecycle.a0 r4 = r4.l()
            com.nic.mparivahan.DLServicesAuth.View.d r0 = new com.nic.mparivahan.DLServicesAuth.View.d
            r0.<init>(r3)
            r4.g(r3, r0)
            ba.b r4 = r3.D1()
            androidx.lifecycle.a0 r4 = r4.t()
            com.nic.mparivahan.DLServicesAuth.View.e r0 = new com.nic.mparivahan.DLServicesAuth.View.e
            r0.<init>(r3)
            r4.g(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.View.DlServiceBasicInfoActivity.onCreate(android.os.Bundle):void");
    }
}
