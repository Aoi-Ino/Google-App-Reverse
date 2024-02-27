package com.nic.mparivahan.Dl;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.Model.UpdateDocSuccessResponse;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.ImpoundDlSuccessModel;
import com.nic.mparivahan.RC.RcInterface.RcImpoundService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import ni.t1;
import org.json.JSONException;
import org.json.JSONObject;
import pl.x;
import ua.j0;
import ua.k0;
import ua.l0;
import ua.m0;
import ua.n0;
import v9.e;

public final class DLVirtualRcScreen extends androidx.appcompat.app.d {
    public DatabaseHelper G;
    public DldetobjX H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public TextView O;
    public TextView P;
    public TextView Q;
    public TextView R;
    public ImageView S;
    public ImageView T;
    public Bitmap U;
    public TextView V;
    public TextView W;
    public LinearLayout X;
    public cd.a Y;
    public LinearLayout Z;

    /* renamed from: a0  reason: collision with root package name */
    public LinearLayout f8597a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f8598b0;

    /* renamed from: c0  reason: collision with root package name */
    public ImageView f8599c0;

    /* renamed from: d0  reason: collision with root package name */
    public za.a f8600d0;

    /* renamed from: e0  reason: collision with root package name */
    public DlService f8601e0;

    /* renamed from: f0  reason: collision with root package name */
    public ProgressDialog f8602f0;

    /* renamed from: g0  reason: collision with root package name */
    public DldetobjX f8603g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f8604h0;

    /* renamed from: i0  reason: collision with root package name */
    private RcImpoundService f8605i0;
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public t1 f8606j0;

    /* renamed from: k0  reason: collision with root package name */
    public ld.c f8607k0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLVirtualRcScreen f8608e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DLVirtualRcScreen dLVirtualRcScreen) {
            super(1);
            this.f8608e = dLVirtualRcScreen;
        }

        public final void b(ImpoundDlSuccessModel impoundDlSuccessModel) {
            if (this.f8608e.G1().isShowing()) {
                this.f8608e.G1().dismiss();
            }
            try {
                int size = impoundDlSuccessModel.getResult().size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (p.o(impoundDlSuccessModel.getResult().get(i10).getImpound_type(), "document", true)) {
                        t1 k12 = this.f8608e.f8606j0;
                        if (k12 == null) {
                            cm.l.v("binding");
                            k12 = null;
                        }
                        k12.f28618e0.setVisibility(0);
                    }
                    boolean unused = p.o(impoundDlSuccessModel.getResult().get(i10).getImpound_type(), "vehicle", true);
                }
            } catch (Exception unused2) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ImpoundDlSuccessModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLVirtualRcScreen f8609e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DLVirtualRcScreen dLVirtualRcScreen) {
            super(1);
            this.f8609e = dLVirtualRcScreen;
        }

        public final void b(String str) {
            if (this.f8609e.G1().isShowing()) {
                this.f8609e.G1().dismiss();
                t1 k12 = this.f8609e.f8606j0;
                if (k12 == null) {
                    cm.l.v("binding");
                    k12 = null;
                }
                k12.f28618e0.setVisibility(8);
            }
            DLVirtualRcScreen dLVirtualRcScreen = this.f8609e;
            dLVirtualRcScreen.X1(dLVirtualRcScreen, dLVirtualRcScreen.O1().b(v9.f.f17510a.O(), "No Vehicle or Seizure Document impound against the searched DL number."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLVirtualRcScreen f8610e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DLVirtualRcScreen dLVirtualRcScreen) {
            super(1);
            this.f8610e = dLVirtualRcScreen;
        }

        public final void b(DLServiceResponseModleV1 dLServiceResponseModleV1) {
            DLVirtualRcScreen dLVirtualRcScreen;
            String b10;
            try {
                this.f8610e.G1().dismiss();
                if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == 0) {
                    DLVirtualRcScreen dLVirtualRcScreen2 = this.f8610e;
                    DatabaseHelper A0 = DatabaseHelper.A0(dLVirtualRcScreen2);
                    cm.l.e(A0, "getInstance(...)");
                    dLVirtualRcScreen2.b2(A0);
                    this.f8610e.r1().Q0(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno(), dLServiceResponseModleV1.getDldetobj().get(0));
                    this.f8610e.a2();
                    dLVirtualRcScreen = this.f8610e;
                    b10 = dLVirtualRcScreen.O1().b(v9.f.f17510a.l(), "Virtual DL Successfully Updated!");
                } else {
                    dLVirtualRcScreen = this.f8610e;
                    b10 = dLVirtualRcScreen.O1().b(v9.f.f17510a.N0(), "Unable to update the Virtual DL, Please try after some time");
                }
                dLVirtualRcScreen.D2(dLVirtualRcScreen, b10);
            } catch (Exception e10) {
                e10.printStackTrace();
                DLVirtualRcScreen dLVirtualRcScreen3 = this.f8610e;
                dLVirtualRcScreen3.D2(dLVirtualRcScreen3, dLVirtualRcScreen3.O1().b(v9.f.f17510a.N0(), "Unable to update the Virtual DL, Please try after some time"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DLServiceResponseModleV1) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLVirtualRcScreen f8611e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DLVirtualRcScreen dLVirtualRcScreen) {
            super(1);
            this.f8611e = dLVirtualRcScreen;
        }

        public final void b(String str) {
            try {
                this.f8611e.G1().dismiss();
                Log.e("Track", "111");
                DLVirtualRcScreen dLVirtualRcScreen = this.f8611e;
                dLVirtualRcScreen.D2(dLVirtualRcScreen, dLVirtualRcScreen.O1().b(v9.f.f17510a.N0(), "Unable to update the Virtual DL, Please try after some time"));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLVirtualRcScreen f8612e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DLVirtualRcScreen dLVirtualRcScreen) {
            super(1);
            this.f8612e = dLVirtualRcScreen;
        }

        public final void b(UpdateDocSuccessResponse updateDocSuccessResponse) {
            if (cm.l.a(updateDocSuccessResponse.getStatusCode(), "VTLD001")) {
                this.f8612e.C1().j(q.B0(this.f8612e.v1().getDlobj().getDlLicno().toString()).toString(), z9.a.f18947a.b(q.B0(this.f8612e.v1().getBioObj().getBioDob().toString()).toString()), this.f8612e);
            } else if (this.f8612e.G1().isShowing()) {
                this.f8612e.G1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UpdateDocSuccessResponse) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLVirtualRcScreen f8613e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(DLVirtualRcScreen dLVirtualRcScreen) {
            super(1);
            this.f8613e = dLVirtualRcScreen;
        }

        public final void b(String str) {
            if (this.f8613e.G1().isShowing()) {
                this.f8613e.G1().dismiss();
            }
            DLVirtualRcScreen dLVirtualRcScreen = this.f8613e;
            dLVirtualRcScreen.D2(dLVirtualRcScreen, dLVirtualRcScreen.O1().b(v9.f.f17510a.N0(), "Unable to update the Virtual DL, Please try after some time"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8614a;

        g(l lVar) {
            cm.l.f(lVar, "function");
            this.f8614a = lVar;
        }

        public final pl.c a() {
            return this.f8614a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8614a.invoke(obj);
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

    private final void C2(DldetobjX dldetobjX) {
        try {
            Bitmap p12 = p1(id.a.a(s1(dldetobjX), "E@CHALLAN*#2017!"));
            cm.l.c(p12);
            q2(p12);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.bc1), 80, 80, true);
            cm.l.e(createScaledBitmap, "createScaledBitmap(...)");
            Bitmap T1 = T1(H1(), createScaledBitmap);
            I1().setImageBitmap(o1(this, T1, "DL No : " + t1()));
        } catch (Exception unused) {
            Toast.makeText(getApplicationContext(), getString(R.string.qr_generate_failed), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void E2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void U1(DLVirtualRcScreen dLVirtualRcScreen, View view) {
        cm.l.f(dLVirtualRcScreen, "this$0");
        dLVirtualRcScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void V1(DLVirtualRcScreen dLVirtualRcScreen, View view) {
        cm.l.f(dLVirtualRcScreen, "this$0");
        try {
            if (dLVirtualRcScreen.G1().isShowing()) {
                dLVirtualRcScreen.G1().dismiss();
            }
            dLVirtualRcScreen.G1().show();
            DatabaseHelper A0 = DatabaseHelper.A0(dLVirtualRcScreen);
            cm.l.e(A0, "getInstance(...)");
            dLVirtualRcScreen.b2(A0);
            DldetobjX dldetails = ((DLDocument) dLVirtualRcScreen.r1().c0().get(0)).getDldetails();
            cm.l.c(dldetails);
            dLVirtualRcScreen.e2(dldetails);
            String obj = q.B0(dLVirtualRcScreen.v1().getDlobj().getDlLicno()).toString();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dl_no", (Object) obj);
            dLVirtualRcScreen.J1().i(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void W1(DLVirtualRcScreen dLVirtualRcScreen, View view) {
        cm.l.f(dLVirtualRcScreen, "this$0");
        try {
            if (com.nic.mparivahan.a.f9624a.a(dLVirtualRcScreen)) {
                dLVirtualRcScreen.G1().show();
                DatabaseHelper A0 = DatabaseHelper.A0(dLVirtualRcScreen);
                cm.l.e(A0, "getInstance(...)");
                dLVirtualRcScreen.b2(A0);
                DldetobjX dldetails = ((DLDocument) dLVirtualRcScreen.r1().c0().get(0)).getDldetails();
                cm.l.c(dldetails);
                dLVirtualRcScreen.e2(dldetails);
                String j02 = dLVirtualRcScreen.r1().j0(q.B0(dLVirtualRcScreen.v1().getDlobj().getDlLicno()).toString());
                za.a C1 = dLVirtualRcScreen.C1();
                cm.l.c(j02);
                C1.E(j02, "DL", z9.a.f18947a.a(q.B0(dLVirtualRcScreen.v1().getBioObj().getBioDob()).toString()), dLVirtualRcScreen);
                return;
            }
            Toast.makeText(dLVirtualRcScreen, dLVirtualRcScreen.getString(R.string.kindly_check_your_internet_connection), 0).show();
        } catch (Exception unused) {
            dLVirtualRcScreen.G1().dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void Y1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final String s1(DldetobjX dldetobjX) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 1);
            jSONObject.put("dn", (Object) t1());
            jSONObject.put("on", (Object) dldetobjX.getBioObj().getBioFullName());
            jSONObject.put("fn", (Object) dldetobjX.getBioObj().getBioSwdFname());
            jSONObject.put("a1", (Object) dldetobjX.getBioObj().getBioPermAdd1());
            return jSONObject.toString();
        } catch (Exception | JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final LinearLayout A1() {
        LinearLayout linearLayout = this.f8597a0;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("ll_valid_till");
        return null;
    }

    public final void A2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.Z = linearLayout;
    }

    public final DlService B1() {
        DlService dlService = this.f8601e0;
        if (dlService != null) {
            return dlService;
        }
        cm.l.v("mDlService");
        return null;
    }

    public final void B2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.W = textView;
    }

    public final za.a C1() {
        za.a aVar = this.f8600d0;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mDlViewModel");
        return null;
    }

    public final DldetobjX D1() {
        DldetobjX dldetobjX = this.H;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("mDldetobj");
        return null;
    }

    public final void D2(Context context, String str) {
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
        ((TextView) findViewById3).setText(O1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(O1().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new n0(dialog));
        dialog.show();
    }

    public final TextView E1() {
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        cm.l.v("ownerName");
        return null;
    }

    public final ImageView F1() {
        ImageView imageView = this.S;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("owner_image");
        return null;
    }

    public final ProgressDialog G1() {
        ProgressDialog progressDialog = this.f8602f0;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final Bitmap H1() {
        Bitmap bitmap = this.U;
        if (bitmap != null) {
            return bitmap;
        }
        cm.l.v("qrBmp");
        return null;
    }

    public final ImageView I1() {
        ImageView imageView = this.T;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("qrImg");
        return null;
    }

    public final cd.a J1() {
        cd.a aVar = this.Y;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("rcImpoundModel");
        return null;
    }

    public final ImageView K1() {
        ImageView imageView = this.f8599c0;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("referesh");
        return null;
    }

    public final TextView L1() {
        TextView textView = this.K;
        if (textView != null) {
            return textView;
        }
        cm.l.v("relationName");
        return null;
    }

    public final TextView M1() {
        TextView textView = this.P;
        if (textView != null) {
            return textView;
        }
        cm.l.v("rtoName");
        return null;
    }

    public final TextView N1() {
        TextView textView = this.Q;
        if (textView != null) {
            return textView;
        }
        cm.l.v("rtoNameText");
        return null;
    }

    public final ld.c O1() {
        ld.c cVar = this.f8607k0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final TextView P1() {
        TextView textView = this.N;
        if (textView != null) {
            return textView;
        }
        cm.l.v("transportValididty");
        return null;
    }

    public final TextView Q1() {
        TextView textView = this.M;
        if (textView != null) {
            return textView;
        }
        cm.l.v("validTill");
        return null;
    }

    public final LinearLayout R1() {
        LinearLayout linearLayout = this.Z;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("valid_licence_linear");
        return null;
    }

    public final TextView S1() {
        TextView textView = this.W;
        if (textView != null) {
            return textView;
        }
        cm.l.v("vehicleClass");
        return null;
    }

    public final Bitmap T1(Bitmap bitmap, Bitmap bitmap2) {
        cm.l.f(bitmap, "QRImg");
        cm.l.f(bitmap2, "appIcon");
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        cm.l.e(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, new Matrix(), (Paint) null);
        canvas.drawBitmap(bitmap2, (float) ((bitmap.getWidth() - bitmap2.getWidth()) / 2), (float) ((bitmap.getHeight() - bitmap2.getHeight()) / 2), (Paint) null);
        return createBitmap;
    }

    public final void X1(Context context, String str) {
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
        ((TextView) findViewById3).setText(O1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(O1().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new m0(dialog));
        dialog.show();
    }

    public final void Z1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.O = textView;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(41:1|2|3|(2:5|6)(1:7)|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|(6:19|20|(1:22)|23|(1:25)(1:26)|27)(3:28|(1:30)|31)|32|(1:34)(1:35)|36|(1:38)(1:39)|40|(1:42)(1:43)|44|(1:46)(23:48|(1:50)|51|(1:53)|54|(1:56)(2:57|(1:64)(1:63))|65|(1:67)(2:68|(1:75)(1:74))|76|(1:78)(1:79)|(1:81)(3:82|(1:84)|85)|86|(5:88|89|(3:91|92|(1:94)(2:95|(2:97|98)(5:99|100|(3:102|103|(1:105)(4:106|(2:108|(1:110)(2:111|(2:115|116)))|117|116))|118|116)))|119|98)|120|121|122|(1:124)|133|125|(1:127)|128|129|(2:131|134)(1:136))|47|51|(0)|54|(0)(0)|65|(0)(0)|76|(0)(0)|(0)(0)|86|(0)|120|121|122|(0)|133|125|(0)|128|129|(0)(0)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x044e */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0407 A[Catch:{ Exception -> 0x044e }, LOOP:0: B:123:0x0405->B:124:0x0407, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0430 A[Catch:{ Exception -> 0x044e }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x046e A[Catch:{ Exception -> 0x0475 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x019e A[Catch:{ Exception -> 0x0475 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c1 A[Catch:{ Exception -> 0x0475 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01c9 A[Catch:{ Exception -> 0x0475 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0247 A[Catch:{ Exception -> 0x0475 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x024f A[Catch:{ Exception -> 0x0475 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02c9 A[Catch:{ Exception -> 0x0475 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02ce A[Catch:{ Exception -> 0x0475 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02d1 A[Catch:{ Exception -> 0x0475 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02dc A[Catch:{ Exception -> 0x0475 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0303 A[Catch:{ Exception -> 0x0475 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a2() {
        /*
            r10 = this;
            java.lang.String r0 = "Rejected"
            java.lang.String r1 = "Suspended"
            com.nic.mparivahan.DB.DatabaseHelper r2 = r10.r1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r2.Z()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = "getDLDetails(...)"
            cm.l.e(r2, r3)     // Catch:{ Exception -> 0x0475 }
            r10.m2(r2)     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r2 = r2.getBioFullName()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = "NA"
            if (r2 == 0) goto L_0x0038
            android.widget.TextView r2 = r10.E1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r4 = r4.getBioFullName()     // Catch:{ Exception -> 0x0475 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0475 }
            goto L_0x003f
        L_0x0038:
            android.widget.TextView r2 = r10.E1()     // Catch:{ Exception -> 0x0475 }
            r2.setText(r3)     // Catch:{ Exception -> 0x0475 }
        L_0x003f:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r2 = r2.getBioSwdFullName()     // Catch:{ Exception -> 0x0475 }
            if (r2 == 0) goto L_0x0061
            android.widget.TextView r2 = r10.L1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r4 = r4.getBioSwdFullName()     // Catch:{ Exception -> 0x0475 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0475 }
            goto L_0x0068
        L_0x0061:
            android.widget.TextView r2 = r10.L1()     // Catch:{ Exception -> 0x0475 }
            r2.setText(r3)     // Catch:{ Exception -> 0x0475 }
        L_0x0068:
            ka.c$a r2 = ka.c.f13158a     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r4 = r4.getDlobj()     // Catch:{ Exception -> 0x0475 }
            r5 = 0
            if (r4 == 0) goto L_0x007a
            java.lang.String r4 = r4.getDlOldLicno()     // Catch:{ Exception -> 0x0475 }
            goto L_0x007b
        L_0x007a:
            r4 = r5
        L_0x007b:
            boolean r4 = r2.m(r4)     // Catch:{ Exception -> 0x0475 }
            java.lang.String r6 = "binding"
            r7 = 8
            if (r4 != 0) goto L_0x00a3
            ni.t1 r4 = r10.f8606j0     // Catch:{ Exception -> 0x0475 }
            if (r4 != 0) goto L_0x008d
            cm.l.v(r6)     // Catch:{ Exception -> 0x0475 }
            r4 = r5
        L_0x008d:
            android.widget.TextView r4 = r4.f28629p     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r6 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r6 = r6.getDlobj()     // Catch:{ Exception -> 0x0475 }
            if (r6 == 0) goto L_0x009e
            java.lang.String r6 = r6.getDlOldLicno()     // Catch:{ Exception -> 0x0475 }
            goto L_0x009f
        L_0x009e:
            r6 = r5
        L_0x009f:
            r4.setText(r6)     // Catch:{ Exception -> 0x0475 }
            goto L_0x00b0
        L_0x00a3:
            ni.t1 r4 = r10.f8606j0     // Catch:{ Exception -> 0x0475 }
            if (r4 != 0) goto L_0x00ab
            cm.l.v(r6)     // Catch:{ Exception -> 0x0475 }
            r4 = r5
        L_0x00ab:
            android.widget.LinearLayout r4 = r4.f28621h     // Catch:{ Exception -> 0x0475 }
            r4.setVisibility(r7)     // Catch:{ Exception -> 0x0475 }
        L_0x00b0:
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r4 = r4.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r4 = r4.getDlIssuedt()     // Catch:{ Exception -> 0x0475 }
            if (r4 == 0) goto L_0x00dc
            android.widget.TextView r4 = r10.z1()     // Catch:{ Exception -> 0x0475 }
            z9.a$a r6 = z9.a.f18947a     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r8 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r8 = r8.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r8 = r8.getDlIssuedt()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r6 = r6.f(r8)     // Catch:{ Exception -> 0x0475 }
            r4.setText(r6)     // Catch:{ Exception -> 0x0475 }
            goto L_0x00e3
        L_0x00dc:
            android.widget.TextView r4 = r10.z1()     // Catch:{ Exception -> 0x0475 }
            r4.setText(r3)     // Catch:{ Exception -> 0x0475 }
        L_0x00e3:
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r4 = r4.getBioDob()     // Catch:{ Exception -> 0x0475 }
            if (r4 == 0) goto L_0x010b
            android.widget.TextView r4 = r10.x1()     // Catch:{ Exception -> 0x0475 }
            z9.a$a r6 = z9.a.f18947a     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r8 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.BioObjX r8 = r8.getBioObj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r8 = r8.getBioDob()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r6 = r6.f(r8)     // Catch:{ Exception -> 0x0475 }
            r4.setText(r6)     // Catch:{ Exception -> 0x0475 }
            goto L_0x0112
        L_0x010b:
            android.widget.TextView r4 = r10.x1()     // Catch:{ Exception -> 0x0475 }
            r4.setText(r3)     // Catch:{ Exception -> 0x0475 }
        L_0x0112:
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r4 = r4.getBioBloodGroup()     // Catch:{ Exception -> 0x0475 }
            if (r4 == 0) goto L_0x013c
            android.widget.TextView r3 = r10.q1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r4 = r4.getBioBloodGroup()     // Catch:{ Exception -> 0x0475 }
            java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0475 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0475 }
            r3.setText(r4)     // Catch:{ Exception -> 0x0475 }
            goto L_0x0143
        L_0x013c:
            android.widget.TextView r4 = r10.q1()     // Catch:{ Exception -> 0x0475 }
            r4.setText(r3)     // Catch:{ Exception -> 0x0475 }
        L_0x0143:
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r3.getOmRtoFullname()     // Catch:{ Exception -> 0x0475 }
            boolean r3 = r2.m(r3)     // Catch:{ Exception -> 0x0475 }
            if (r3 != 0) goto L_0x0169
            android.widget.TextView r3 = r10.N1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r4 = r4.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r4 = r4.getOmRtoFullname()     // Catch:{ Exception -> 0x0475 }
        L_0x0165:
            r3.setText(r4)     // Catch:{ Exception -> 0x0475 }
            goto L_0x018c
        L_0x0169:
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r3.getOlaName()     // Catch:{ Exception -> 0x0475 }
            boolean r3 = r2.m(r3)     // Catch:{ Exception -> 0x0475 }
            if (r3 != 0) goto L_0x018c
            android.widget.TextView r3 = r10.N1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r4 = r4.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r4 = r4.getOlaName()     // Catch:{ Exception -> 0x0475 }
            goto L_0x0165
        L_0x018c:
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r3.getOmRtoFullname()     // Catch:{ Exception -> 0x0475 }
            boolean r3 = r2.m(r3)     // Catch:{ Exception -> 0x0475 }
            if (r3 != 0) goto L_0x01b1
            android.widget.TextView r3 = r10.M1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r4 = r4.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r4 = r4.getDlRtoCode()     // Catch:{ Exception -> 0x0475 }
            r3.setText(r4)     // Catch:{ Exception -> 0x0475 }
        L_0x01b1:
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r3.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0475 }
            r4 = 1
            r6 = 0
            if (r3 != 0) goto L_0x01c9
            android.widget.LinearLayout r3 = r10.A1()     // Catch:{ Exception -> 0x0475 }
            r3.setVisibility(r7)     // Catch:{ Exception -> 0x0475 }
            goto L_0x0239
        L_0x01c9:
            android.widget.LinearLayout r3 = r10.A1()     // Catch:{ Exception -> 0x0475 }
            r3.setVisibility(r6)     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r3.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0475 }
            boolean r3 = r2.n(r3)     // Catch:{ Exception -> 0x0475 }
            if (r3 == 0) goto L_0x021c
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r3.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0475 }
            boolean r3 = r2.f(r3)     // Catch:{ Exception -> 0x0475 }
            if (r3 == 0) goto L_0x021c
            boolean r3 = r10.f8604h0     // Catch:{ Exception -> 0x0475 }
            if (r3 != r4) goto L_0x021c
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r3.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r10.m1(r3)     // Catch:{ Exception -> 0x0475 }
            android.widget.TextView r8 = r10.Q1()     // Catch:{ Exception -> 0x0475 }
            r10.l1(r3, r8)     // Catch:{ Exception -> 0x0475 }
            goto L_0x0239
        L_0x021c:
            android.widget.TextView r3 = r10.Q1()     // Catch:{ Exception -> 0x0475 }
            z9.a$a r8 = z9.a.f18947a     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r9 = r9.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r9 = r9.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r8 = r8.f(r9)     // Catch:{ Exception -> 0x0475 }
            r3.setText(r8)     // Catch:{ Exception -> 0x0475 }
        L_0x0239:
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r3.getDlTrValdtoDt()     // Catch:{ Exception -> 0x0475 }
            if (r3 != 0) goto L_0x024f
            android.widget.LinearLayout r2 = r10.R1()     // Catch:{ Exception -> 0x0475 }
            r2.setVisibility(r7)     // Catch:{ Exception -> 0x0475 }
            goto L_0x02bf
        L_0x024f:
            android.widget.LinearLayout r3 = r10.R1()     // Catch:{ Exception -> 0x0475 }
            r3.setVisibility(r6)     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r3.getDlTrValdtoDt()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0475 }
            boolean r3 = r2.n(r3)     // Catch:{ Exception -> 0x0475 }
            if (r3 == 0) goto L_0x02a2
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r3.getDlTrValdtoDt()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0475 }
            boolean r2 = r2.f(r3)     // Catch:{ Exception -> 0x0475 }
            if (r2 == 0) goto L_0x02a2
            boolean r2 = r10.f8604h0     // Catch:{ Exception -> 0x0475 }
            if (r2 != r4) goto L_0x02a2
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r2 = r2.getDlTrValdtoDt()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0475 }
            java.lang.String r2 = r10.m1(r2)     // Catch:{ Exception -> 0x0475 }
            android.widget.TextView r3 = r10.P1()     // Catch:{ Exception -> 0x0475 }
            r10.l1(r2, r3)     // Catch:{ Exception -> 0x0475 }
            goto L_0x02bf
        L_0x02a2:
            android.widget.TextView r2 = r10.P1()     // Catch:{ Exception -> 0x0475 }
            z9.a$a r3 = z9.a.f18947a     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r4 = r4.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r4 = r4.getDlTrValdtoDt()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = r3.f(r4)     // Catch:{ Exception -> 0x0475 }
            r2.setText(r3)     // Catch:{ Exception -> 0x0475 }
        L_0x02bf:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r2 = r2.getBioImgObj()     // Catch:{ Exception -> 0x0475 }
            if (r2 == 0) goto L_0x02ce
            java.lang.String r2 = r2.getBiPhoto()     // Catch:{ Exception -> 0x0475 }
            goto L_0x02cf
        L_0x02ce:
            r2 = r5
        L_0x02cf:
            if (r2 != 0) goto L_0x02dc
            android.widget.ImageView r2 = r10.F1()     // Catch:{ Exception -> 0x0475 }
            r3 = 2131231173(0x7f0801c5, float:1.807842E38)
            r2.setImageResource(r3)     // Catch:{ Exception -> 0x0475 }
            goto L_0x02f5
        L_0x02dc:
            android.widget.ImageView r2 = r10.F1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r3 = r3.getBioImgObj()     // Catch:{ Exception -> 0x0475 }
            if (r3 == 0) goto L_0x02ee
            java.lang.String r5 = r3.getBiPhoto()     // Catch:{ Exception -> 0x0475 }
        L_0x02ee:
            android.graphics.Bitmap r3 = r10.n1(r5)     // Catch:{ Exception -> 0x0475 }
            r2.setImageBitmap(r3)     // Catch:{ Exception -> 0x0475 }
        L_0x02f5:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x0475 }
            if (r2 == 0) goto L_0x03f6
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = "A"
            boolean r2 = cm.l.a(r2, r3)     // Catch:{ Exception -> 0x0475 }
            r3 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            java.lang.String r4 = "Active"
            if (r2 != 0) goto L_0x03ed
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x0475 }
            boolean r2 = cm.l.a(r2, r4)     // Catch:{ Exception -> 0x0475 }
            if (r2 == 0) goto L_0x0330
            goto L_0x03ed
        L_0x0330:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r4 = "V"
            boolean r2 = cm.l.a(r2, r4)     // Catch:{ Exception -> 0x0475 }
            if (r2 == 0) goto L_0x0356
            android.widget.TextView r0 = r10.u1()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r1 = "ACTIVE"
            r0.setText(r1)     // Catch:{ Exception -> 0x0475 }
        L_0x034d:
            android.widget.TextView r0 = r10.u1()     // Catch:{ Exception -> 0x0475 }
            r0.setTextColor(r3)     // Catch:{ Exception -> 0x0475 }
            goto L_0x03f6
        L_0x0356:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = "C"
            boolean r2 = cm.l.a(r2, r3)     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = "Cancelled"
            r4 = -65536(0xffffffffffff0000, float:NaN)
            if (r2 != 0) goto L_0x03e5
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x0475 }
            boolean r2 = cm.l.a(r2, r3)     // Catch:{ Exception -> 0x0475 }
            if (r2 == 0) goto L_0x0381
            goto L_0x03e5
        L_0x0381:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x0475 }
            boolean r2 = cm.l.a(r2, r1)     // Catch:{ Exception -> 0x0475 }
            if (r2 != 0) goto L_0x03dd
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r3 = "S"
            boolean r2 = cm.l.a(r2, r3)     // Catch:{ Exception -> 0x0475 }
            if (r2 == 0) goto L_0x03a8
            goto L_0x03dd
        L_0x03a8:
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r1 = r1.getDlStatus()     // Catch:{ Exception -> 0x0475 }
            boolean r1 = cm.l.a(r1, r0)     // Catch:{ Exception -> 0x0475 }
            if (r1 != 0) goto L_0x03ce
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r1 = r1.getDlStatus()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r2 = "R"
            boolean r1 = cm.l.a(r1, r2)     // Catch:{ Exception -> 0x0475 }
            if (r1 == 0) goto L_0x03f6
        L_0x03ce:
            android.widget.TextView r1 = r10.u1()     // Catch:{ Exception -> 0x0475 }
            r1.setText(r0)     // Catch:{ Exception -> 0x0475 }
        L_0x03d5:
            android.widget.TextView r0 = r10.u1()     // Catch:{ Exception -> 0x0475 }
            r0.setTextColor(r4)     // Catch:{ Exception -> 0x0475 }
            goto L_0x03f6
        L_0x03dd:
            android.widget.TextView r0 = r10.u1()     // Catch:{ Exception -> 0x0475 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0475 }
            goto L_0x03d5
        L_0x03e5:
            android.widget.TextView r0 = r10.u1()     // Catch:{ Exception -> 0x0475 }
            r0.setText(r3)     // Catch:{ Exception -> 0x0475 }
            goto L_0x03d5
        L_0x03ed:
            android.widget.TextView r0 = r10.u1()     // Catch:{ Exception -> 0x0475 }
            r0.setText(r4)     // Catch:{ Exception -> 0x0475 }
            goto L_0x034d
        L_0x03f6:
            java.lang.String r0 = ""
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r10.D1()     // Catch:{ Exception -> 0x044e }
            java.util.List r1 = r1.getDlcovs()     // Catch:{ Exception -> 0x044e }
            int r2 = r1.size()     // Catch:{ Exception -> 0x044e }
            r3 = r6
        L_0x0405:
            if (r3 >= r2) goto L_0x0428
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x044e }
            r4.<init>()     // Catch:{ Exception -> 0x044e }
            r4.append(r0)     // Catch:{ Exception -> 0x044e }
            java.lang.Object r0 = r1.get(r3)     // Catch:{ Exception -> 0x044e }
            com.nic.mparivahan.Dl.Model.Dlcov r0 = (com.nic.mparivahan.Dl.Model.Dlcov) r0     // Catch:{ Exception -> 0x044e }
            java.lang.String r0 = r0.getCovabbrv()     // Catch:{ Exception -> 0x044e }
            r4.append(r0)     // Catch:{ Exception -> 0x044e }
            java.lang.String r0 = ", "
            r4.append(r0)     // Catch:{ Exception -> 0x044e }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x044e }
            int r3 = r3 + 1
            goto L_0x0405
        L_0x0428:
            ka.c$a r1 = ka.c.f13158a     // Catch:{ Exception -> 0x044e }
            boolean r1 = r1.m(r0)     // Catch:{ Exception -> 0x044e }
            if (r1 != 0) goto L_0x044e
            android.widget.TextView r1 = r10.S1()     // Catch:{ Exception -> 0x044e }
            java.lang.CharSequence r2 = km.q.B0(r0)     // Catch:{ Exception -> 0x044e }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x044e }
            int r0 = r0.length()     // Catch:{ Exception -> 0x044e }
            int r0 = r0 + -2
            java.lang.String r0 = r2.substring(r6, r0)     // Catch:{ Exception -> 0x044e }
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r0, r2)     // Catch:{ Exception -> 0x044e }
            r1.setText(r0)     // Catch:{ Exception -> 0x044e }
        L_0x044e:
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DlobjX r0 = r0.getDlobj()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r0 = r0.getDlLicno()     // Catch:{ Exception -> 0x0475 }
            r10.c2(r0)     // Catch:{ Exception -> 0x0475 }
            android.widget.TextView r0 = r10.w1()     // Catch:{ Exception -> 0x0475 }
            java.lang.String r1 = r10.t1()     // Catch:{ Exception -> 0x0475 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0475 }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            if (r0 == 0) goto L_0x0475
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r10.D1()     // Catch:{ Exception -> 0x0475 }
            r10.C2(r0)     // Catch:{ Exception -> 0x0475 }
        L_0x0475:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.DLVirtualRcScreen.a2():void");
    }

    public final void b2(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.G = databaseHelper;
    }

    public final void c2(String str) {
        cm.l.f(str, "<set-?>");
        this.f8598b0 = str;
    }

    public final void d2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.I = textView;
    }

    public final void e2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.f8603g0 = dldetobjX;
    }

    public final void f2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.V = textView;
    }

    public final void g2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.R = textView;
    }

    public final void h2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.X = linearLayout;
    }

    public final void i2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.L = textView;
    }

    public final void j2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f8597a0 = linearLayout;
    }

    public final void k2(DlService dlService) {
        cm.l.f(dlService, "<set-?>");
        this.f8601e0 = dlService;
    }

    public final void l1(String str, TextView textView) {
        cm.l.f(str, "change_color");
        cm.l.f(textView, "textView");
        if (q.D(str, "Expired", true)) {
            textView.setText(str);
            textView.setTextColor(androidx.core.content.a.c(this, R.color.danger));
        }
        if (q.D(str, "Expiring", true)) {
            textView.setText(str);
            textView.setTextColor(androidx.core.content.a.c(this, R.color.vehicle_fit));
        }
    }

    public final void l2(za.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.f8600d0 = aVar;
    }

    public final String m1(String str) {
        try {
            Date date = new Date();
            Date parse = new SimpleDateFormat("dd-MMM-yyyy").parse(str);
            if (parse.before(date)) {
                return "Expired on " + str;
            } else if (!parse.after(date)) {
                return "Expired on " + str;
            } else if (ka.c.f13158a.k(str) > 30) {
                return "";
            } else {
                return "Expiring on " + str;
            }
        } catch (ParseException e10) {
            e10.printStackTrace();
            return "Expiring on" + str;
        } catch (Exception e11) {
            e11.printStackTrace();
            return String.valueOf(str);
        }
    }

    public final void m2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.H = dldetobjX;
    }

    public final Bitmap n1(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final void n2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.J = textView;
    }

    public final Bitmap o1(Context context, Bitmap bitmap, String str) {
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

    public final void o2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.S = imageView;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t1 c10 = t1.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.f8606j0 = c10;
        t1 t1Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        t1 t1Var2 = this.f8606j0;
        if (t1Var2 == null) {
            cm.l.v("binding");
            t1Var2 = null;
        }
        aVar.y0(this, t1Var2);
        x2(new ld.c(this));
        k2(DlService.f8615a.c(this));
        View findViewById = findViewById(R.id.dl_status_text);
        cm.l.e(findViewById, "findViewById(...)");
        d2((TextView) findViewById);
        View findViewById2 = findViewById(R.id.driver_name_txt);
        cm.l.e(findViewById2, "findViewById(...)");
        n2((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.relation_name_txt);
        cm.l.e(findViewById3, "findViewById(...)");
        u2((TextView) findViewById3);
        View findViewById4 = findViewById(R.id.issue_date_txt);
        cm.l.e(findViewById4, "findViewById(...)");
        i2((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.valid_till_txt);
        cm.l.e(findViewById5, "findViewById(...)");
        z2((TextView) findViewById5);
        View findViewById6 = findViewById(R.id.transport_validity);
        cm.l.e(findViewById6, "findViewById(...)");
        y2((TextView) findViewById6);
        View findViewById7 = findViewById(R.id.blood_txt);
        cm.l.e(findViewById7, "findViewById(...)");
        Z1((TextView) findViewById7);
        View findViewById8 = findViewById(R.id.rto_txt);
        cm.l.e(findViewById8, "findViewById(...)");
        v2((TextView) findViewById8);
        View findViewById9 = findViewById(R.id.rto_name_txt);
        cm.l.e(findViewById9, "findViewById(...)");
        w2((TextView) findViewById9);
        View findViewById10 = findViewById(R.id.dob_txt);
        cm.l.e(findViewById10, "findViewById(...)");
        g2((TextView) findViewById10);
        View findViewById11 = findViewById(R.id.owner_image);
        cm.l.e(findViewById11, "findViewById(...)");
        o2((ImageView) findViewById11);
        View findViewById12 = findViewById(R.id.qr_img);
        cm.l.e(findViewById12, "findViewById(...)");
        r2((ImageView) findViewById12);
        View findViewById13 = findViewById(R.id.dl_text);
        cm.l.e(findViewById13, "findViewById(...)");
        f2((TextView) findViewById13);
        View findViewById14 = findViewById(R.id.vehicle_class_txt);
        cm.l.e(findViewById14, "findViewById(...)");
        B2((TextView) findViewById14);
        View findViewById15 = findViewById(R.id.nexgenarrow);
        cm.l.e(findViewById15, "findViewById(...)");
        h2((LinearLayout) findViewById15);
        View findViewById16 = findViewById(R.id.referesh);
        cm.l.e(findViewById16, "findViewById(...)");
        t2((ImageView) findViewById16);
        if (getIntent() != null) {
            this.f8604h0 = getIntent().getBooleanExtra("Flag", false);
        }
        p2(new ProgressDialog(this));
        G1().setMessage("Please wait...");
        G1().setCancelable(false);
        G1().setCanceledOnTouchOutside(false);
        l2((za.a) new u0((x0) this, (u0.b) new za.b(new ya.a(B1()))).a(za.a.class));
        this.f8605i0 = RcImpoundService.f9481a.b(this);
        RcImpoundService rcImpoundService = this.f8605i0;
        if (rcImpoundService == null) {
            cm.l.v("rcImpoundService");
            rcImpoundService = null;
        }
        s2((cd.a) new u0((x0) this, (u0.b) new cd.b(new bd.a(rcImpoundService))).a(cd.a.class));
        y1().setOnClickListener(new j0(this));
        t1 t1Var3 = this.f8606j0;
        if (t1Var3 == null) {
            cm.l.v("binding");
            t1Var3 = null;
        }
        t1Var3.f28630q.setOnClickListener(new k0(this));
        J1().h().g(this, new g(new a(this)));
        J1().g().g(this, new g(new b(this)));
        K1().setOnClickListener(new l0(this));
        C1().n().g(this, new g(new c(this)));
        C1().o().g(this, new g(new d(this)));
        View findViewById17 = findViewById(R.id.valid_licence_linear);
        cm.l.e(findViewById17, "findViewById(...)");
        A2((LinearLayout) findViewById17);
        View findViewById18 = findViewById(R.id.ll_valid_till);
        cm.l.e(findViewById18, "findViewById(...)");
        j2((LinearLayout) findViewById18);
        b2(new DatabaseHelper(this));
        if (this.f8604h0) {
            t1 t1Var4 = this.f8606j0;
            if (t1Var4 == null) {
                cm.l.v("binding");
            } else {
                t1Var = t1Var4;
            }
            t1Var.f28620g.setText("DL Details with Alerts");
        }
        a2();
        C1().y().g(this, new g(new e(this)));
        C1().x().g(this, new g(new f(this)));
    }

    public final Bitmap p1(String str) {
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

    public final void p2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.f8602f0 = progressDialog;
    }

    public final TextView q1() {
        TextView textView = this.O;
        if (textView != null) {
            return textView;
        }
        cm.l.v("bloodGroup");
        return null;
    }

    public final void q2(Bitmap bitmap) {
        cm.l.f(bitmap, "<set-?>");
        this.U = bitmap;
    }

    public final DatabaseHelper r1() {
        DatabaseHelper databaseHelper = this.G;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    public final void r2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.T = imageView;
    }

    public final void s2(cd.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.Y = aVar;
    }

    public final String t1() {
        String str = this.f8598b0;
        if (str != null) {
            return str;
        }
        cm.l.v("dlNumber");
        return null;
    }

    public final void t2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.f8599c0 = imageView;
    }

    public final TextView u1() {
        TextView textView = this.I;
        if (textView != null) {
            return textView;
        }
        cm.l.v("dlStatusTxt");
        return null;
    }

    public final void u2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.K = textView;
    }

    public final DldetobjX v1() {
        DldetobjX dldetobjX = this.f8603g0;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dl_data");
        return null;
    }

    public final void v2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.P = textView;
    }

    public final TextView w1() {
        TextView textView = this.V;
        if (textView != null) {
            return textView;
        }
        cm.l.v("dl_text");
        return null;
    }

    public final void w2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.Q = textView;
    }

    public final TextView x1() {
        TextView textView = this.R;
        if (textView != null) {
            return textView;
        }
        cm.l.v("dobText");
        return null;
    }

    public final void x2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f8607k0 = cVar;
    }

    public final LinearLayout y1() {
        LinearLayout linearLayout = this.X;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("img_back");
        return null;
    }

    public final void y2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.N = textView;
    }

    public final TextView z1() {
        TextView textView = this.L;
        if (textView != null) {
            return textView;
        }
        cm.l.v("issueDate");
        return null;
    }

    public final void z2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.M = textView;
    }
}
