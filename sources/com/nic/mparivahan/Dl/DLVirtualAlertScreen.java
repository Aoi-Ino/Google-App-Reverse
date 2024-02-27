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
import com.nic.mparivahan.RC.RcInterface.RcImpoundService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import ni.la;
import org.json.JSONException;
import org.json.JSONObject;
import pl.x;
import ua.g0;
import ua.h0;
import ua.i0;
import v9.e;
import v9.f;

public final class DLVirtualAlertScreen extends androidx.appcompat.app.d {
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
    public LinearLayout f8581a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f8582b0;

    /* renamed from: c0  reason: collision with root package name */
    public ImageView f8583c0;

    /* renamed from: d0  reason: collision with root package name */
    public za.a f8584d0;

    /* renamed from: e0  reason: collision with root package name */
    public DlService f8585e0;

    /* renamed from: f0  reason: collision with root package name */
    public ProgressDialog f8586f0;

    /* renamed from: g0  reason: collision with root package name */
    public DldetobjX f8587g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f8588h0;

    /* renamed from: i0  reason: collision with root package name */
    private RcImpoundService f8589i0;

    /* renamed from: j0  reason: collision with root package name */
    private la f8590j0;

    /* renamed from: k0  reason: collision with root package name */
    public ld.c f8591k0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLVirtualAlertScreen f8592e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DLVirtualAlertScreen dLVirtualAlertScreen) {
            super(1);
            this.f8592e = dLVirtualAlertScreen;
        }

        public final void b(DLServiceResponseModleV1 dLServiceResponseModleV1) {
            DLVirtualAlertScreen dLVirtualAlertScreen;
            String b10;
            try {
                this.f8592e.D1().dismiss();
                if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == 0) {
                    DLVirtualAlertScreen dLVirtualAlertScreen2 = this.f8592e;
                    DatabaseHelper A0 = DatabaseHelper.A0(dLVirtualAlertScreen2);
                    cm.l.e(A0, "getInstance(...)");
                    dLVirtualAlertScreen2.U1(A0);
                    this.f8592e.o1().M0(q.B0(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                    this.f8592e.T1();
                    dLVirtualAlertScreen = this.f8592e;
                    b10 = dLVirtualAlertScreen.K1().b(f.f17510a.j(), "Driving Licence alert successfully updated!");
                } else {
                    dLVirtualAlertScreen = this.f8592e;
                    b10 = dLVirtualAlertScreen.K1().b(f.f17510a.D(), "Unable to update the Alert, Please try after some time!");
                }
                dLVirtualAlertScreen.w2(dLVirtualAlertScreen, b10);
            } catch (Exception e10) {
                e10.printStackTrace();
                DLVirtualAlertScreen dLVirtualAlertScreen3 = this.f8592e;
                dLVirtualAlertScreen3.w2(dLVirtualAlertScreen3, dLVirtualAlertScreen3.K1().b(f.f17510a.D(), "Unable to update the Alert, Please try after some time!"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DLServiceResponseModleV1) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLVirtualAlertScreen f8593e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DLVirtualAlertScreen dLVirtualAlertScreen) {
            super(1);
            this.f8593e = dLVirtualAlertScreen;
        }

        public final void b(String str) {
            try {
                this.f8593e.D1().dismiss();
                DLVirtualAlertScreen dLVirtualAlertScreen = this.f8593e;
                dLVirtualAlertScreen.w2(dLVirtualAlertScreen, dLVirtualAlertScreen.K1().b(f.f17510a.D(), "Unable to update the Alert, Please try after some time!"));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLVirtualAlertScreen f8594e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DLVirtualAlertScreen dLVirtualAlertScreen) {
            super(1);
            this.f8594e = dLVirtualAlertScreen;
        }

        public final void b(UpdateDocSuccessResponse updateDocSuccessResponse) {
            if (cm.l.a(updateDocSuccessResponse.getStatusCode(), "VTLD001")) {
                this.f8594e.z1().j(q.B0(this.f8594e.s1().getDlobj().getDlLicno().toString()).toString(), z9.a.f18947a.b(q.B0(this.f8594e.s1().getBioObj().getBioDob().toString()).toString()), this.f8594e);
            } else if (this.f8594e.D1().isShowing()) {
                this.f8594e.D1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UpdateDocSuccessResponse) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLVirtualAlertScreen f8595e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DLVirtualAlertScreen dLVirtualAlertScreen) {
            super(1);
            this.f8595e = dLVirtualAlertScreen;
        }

        public final void b(String str) {
            if (this.f8595e.D1().isShowing()) {
                this.f8595e.D1().dismiss();
            }
            DLVirtualAlertScreen dLVirtualAlertScreen = this.f8595e;
            dLVirtualAlertScreen.w2(dLVirtualAlertScreen, dLVirtualAlertScreen.K1().b(f.f17510a.D(), "Unable to update the Alert, Please try after some time!"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8596a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f8596a = lVar;
        }

        public final pl.c a() {
            return this.f8596a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8596a.invoke(obj);
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
    public static final void Q1(DLVirtualAlertScreen dLVirtualAlertScreen, View view) {
        cm.l.f(dLVirtualAlertScreen, "this$0");
        dLVirtualAlertScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void R1(DLVirtualAlertScreen dLVirtualAlertScreen, View view) {
        cm.l.f(dLVirtualAlertScreen, "this$0");
        try {
            if (com.nic.mparivahan.a.f9624a.a(dLVirtualAlertScreen)) {
                dLVirtualAlertScreen.D1().show();
                DldetobjX dldetails = ((DLDocument) dLVirtualAlertScreen.o1().c0().get(0)).getDldetails();
                cm.l.c(dldetails);
                dLVirtualAlertScreen.X1(dldetails);
                String j02 = dLVirtualAlertScreen.o1().j0(q.B0(dLVirtualAlertScreen.s1().getDlobj().getDlLicno()).toString());
                if (j02.equals("0")) {
                    j02 = dLVirtualAlertScreen.o1().j0(new km.f("\\s").b(dLVirtualAlertScreen.t1().getText().toString(), ""));
                }
                za.a z12 = dLVirtualAlertScreen.z1();
                cm.l.c(j02);
                z12.E(j02, "DL", z9.a.f18947a.a(q.B0(dLVirtualAlertScreen.s1().getBioObj().getBioDob()).toString()), dLVirtualAlertScreen);
                return;
            }
            Toast.makeText(dLVirtualAlertScreen, dLVirtualAlertScreen.K1().b("label_log_check_internet", dLVirtualAlertScreen.getString(R.string.kindly_check_your_internet_connection)), 0).show();
        } catch (Exception unused) {
            dLVirtualAlertScreen.D1().dismiss();
        }
    }

    private final String p1(DldetobjX dldetobjX) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 1);
            jSONObject.put("dn", (Object) q1());
            jSONObject.put("on", (Object) dldetobjX.getBioObj().getBioFullName());
            jSONObject.put("fn", (Object) dldetobjX.getBioObj().getBioSwdFname());
            jSONObject.put("a1", (Object) dldetobjX.getBioObj().getBioPermAdd1());
            return jSONObject.toString();
        } catch (Exception | JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private final void v2(DldetobjX dldetobjX) {
        try {
            Bitmap m12 = m1(id.a.a(p1(dldetobjX), "E@CHALLAN*#2017!"));
            cm.l.c(m12);
            j2(m12);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.bc1), 80, 80, true);
            cm.l.e(createScaledBitmap, "createScaledBitmap(...)");
            Bitmap P1 = P1(E1(), createScaledBitmap);
            F1().setImageBitmap(l1(this, P1, "DL No : " + q1()));
        } catch (Exception unused) {
            Toast.makeText(getApplicationContext(), getString(R.string.qr_generate_failed), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void x2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final DldetobjX A1() {
        DldetobjX dldetobjX = this.H;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("mDldetobj");
        return null;
    }

    public final TextView B1() {
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        cm.l.v("ownerName");
        return null;
    }

    public final ImageView C1() {
        ImageView imageView = this.S;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("owner_image");
        return null;
    }

    public final ProgressDialog D1() {
        ProgressDialog progressDialog = this.f8586f0;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final Bitmap E1() {
        Bitmap bitmap = this.U;
        if (bitmap != null) {
            return bitmap;
        }
        cm.l.v("qrBmp");
        return null;
    }

    public final ImageView F1() {
        ImageView imageView = this.T;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("qrImg");
        return null;
    }

    public final ImageView G1() {
        ImageView imageView = this.f8583c0;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("referesh");
        return null;
    }

    public final TextView H1() {
        TextView textView = this.K;
        if (textView != null) {
            return textView;
        }
        cm.l.v("relationName");
        return null;
    }

    public final TextView I1() {
        TextView textView = this.P;
        if (textView != null) {
            return textView;
        }
        cm.l.v("rtoName");
        return null;
    }

    public final TextView J1() {
        TextView textView = this.Q;
        if (textView != null) {
            return textView;
        }
        cm.l.v("rtoNameText");
        return null;
    }

    public final ld.c K1() {
        ld.c cVar = this.f8591k0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final TextView L1() {
        TextView textView = this.N;
        if (textView != null) {
            return textView;
        }
        cm.l.v("transportValididty");
        return null;
    }

    public final TextView M1() {
        TextView textView = this.M;
        if (textView != null) {
            return textView;
        }
        cm.l.v("validTill");
        return null;
    }

    public final LinearLayout N1() {
        LinearLayout linearLayout = this.Z;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("valid_licence_linear");
        return null;
    }

    public final TextView O1() {
        TextView textView = this.W;
        if (textView != null) {
            return textView;
        }
        cm.l.v("vehicleClass");
        return null;
    }

    public final Bitmap P1(Bitmap bitmap, Bitmap bitmap2) {
        cm.l.f(bitmap, "QRImg");
        cm.l.f(bitmap2, "appIcon");
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        cm.l.e(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, new Matrix(), (Paint) null);
        canvas.drawBitmap(bitmap2, (float) ((bitmap.getWidth() - bitmap2.getWidth()) / 2), (float) ((bitmap.getHeight() - bitmap2.getHeight()) / 2), (Paint) null);
        return createBitmap;
    }

    public final void S1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.O = textView;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(36:1|2|3|(2:5|6)(1:7)|8|(1:10)(1:11)|12|(1:14)(1:15)|16|(1:18)(1:19)|20|(1:22)(1:23)|24|(1:26)(1:27)|28|(1:30)(1:32)|31|33|(1:35)(2:36|(1:43)(1:42))|44|(1:46)(2:47|(1:54)(1:53))|55|(1:57)(1:58)|(1:60)(3:61|(1:63)|64)|65|(5:67|68|(3:70|71|(1:73)(2:74|(2:76|77)(5:78|79|(3:81|82|(1:84)(4:85|(2:87|(1:89)(2:90|(2:94|95)))|96|95))|97|95)))|98|77)|99|100|101|(1:103)|112|104|(1:106)|107|108|(2:110|113)(1:115)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x03e7 */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0407 A[Catch:{ Exception -> 0x040e }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T1() {
        /*
            r8 = this;
            java.lang.String r0 = "Rejected"
            java.lang.String r1 = "Suspended"
            com.nic.mparivahan.DB.DatabaseHelper r2 = r8.o1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r2.Z()     // Catch:{ Exception -> 0x040e }
            java.lang.String r3 = "getDLDetails(...)"
            cm.l.e(r2, r3)     // Catch:{ Exception -> 0x040e }
            r8.f2(r2)     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getBioFullName()     // Catch:{ Exception -> 0x040e }
            java.lang.String r3 = "NA"
            if (r2 == 0) goto L_0x0038
            android.widget.TextView r2 = r8.B1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r4 = r4.getBioFullName()     // Catch:{ Exception -> 0x040e }
            r2.setText(r4)     // Catch:{ Exception -> 0x040e }
            goto L_0x003f
        L_0x0038:
            android.widget.TextView r2 = r8.B1()     // Catch:{ Exception -> 0x040e }
            r2.setText(r3)     // Catch:{ Exception -> 0x040e }
        L_0x003f:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getBioSwdFullName()     // Catch:{ Exception -> 0x040e }
            if (r2 == 0) goto L_0x0061
            android.widget.TextView r2 = r8.H1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r4 = r4.getBioSwdFullName()     // Catch:{ Exception -> 0x040e }
            r2.setText(r4)     // Catch:{ Exception -> 0x040e }
            goto L_0x0068
        L_0x0061:
            android.widget.TextView r2 = r8.H1()     // Catch:{ Exception -> 0x040e }
            r2.setText(r3)     // Catch:{ Exception -> 0x040e }
        L_0x0068:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getDlIssuedt()     // Catch:{ Exception -> 0x040e }
            if (r2 == 0) goto L_0x0094
            android.widget.TextView r2 = r8.w1()     // Catch:{ Exception -> 0x040e }
            z9.a$a r4 = z9.a.f18947a     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r5 = r5.getDlIssuedt()     // Catch:{ Exception -> 0x040e }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x040e }
            java.lang.String r4 = r4.f(r5)     // Catch:{ Exception -> 0x040e }
            r2.setText(r4)     // Catch:{ Exception -> 0x040e }
            goto L_0x009b
        L_0x0094:
            android.widget.TextView r2 = r8.w1()     // Catch:{ Exception -> 0x040e }
            r2.setText(r3)     // Catch:{ Exception -> 0x040e }
        L_0x009b:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getBioDob()     // Catch:{ Exception -> 0x040e }
            if (r2 == 0) goto L_0x00c3
            android.widget.TextView r2 = r8.u1()     // Catch:{ Exception -> 0x040e }
            z9.a$a r4 = z9.a.f18947a     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.BioObjX r5 = r5.getBioObj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r5 = r5.getBioDob()     // Catch:{ Exception -> 0x040e }
            java.lang.String r4 = r4.f(r5)     // Catch:{ Exception -> 0x040e }
            r2.setText(r4)     // Catch:{ Exception -> 0x040e }
            goto L_0x00ca
        L_0x00c3:
            android.widget.TextView r2 = r8.u1()     // Catch:{ Exception -> 0x040e }
            r2.setText(r3)     // Catch:{ Exception -> 0x040e }
        L_0x00ca:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getBioBloodGroup()     // Catch:{ Exception -> 0x040e }
            if (r2 == 0) goto L_0x00ec
            android.widget.TextView r2 = r8.n1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r4 = r4.getBioBloodGroup()     // Catch:{ Exception -> 0x040e }
            r2.setText(r4)     // Catch:{ Exception -> 0x040e }
            goto L_0x00f3
        L_0x00ec:
            android.widget.TextView r2 = r8.n1()     // Catch:{ Exception -> 0x040e }
            r2.setText(r3)     // Catch:{ Exception -> 0x040e }
        L_0x00f3:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getOlacode()     // Catch:{ Exception -> 0x040e }
            if (r2 == 0) goto L_0x0115
            android.widget.TextView r2 = r8.I1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r4 = r4.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r4 = r4.getOlacode()     // Catch:{ Exception -> 0x040e }
            r2.setText(r4)     // Catch:{ Exception -> 0x040e }
            goto L_0x011c
        L_0x0115:
            android.widget.TextView r2 = r8.I1()     // Catch:{ Exception -> 0x040e }
            r2.setText(r3)     // Catch:{ Exception -> 0x040e }
        L_0x011c:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getOlaName()     // Catch:{ Exception -> 0x040e }
            if (r2 == 0) goto L_0x013e
            android.widget.TextView r2 = r8.J1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r3 = r3.getOlaName()     // Catch:{ Exception -> 0x040e }
        L_0x013a:
            r2.setText(r3)     // Catch:{ Exception -> 0x040e }
            goto L_0x0143
        L_0x013e:
            android.widget.TextView r2 = r8.J1()     // Catch:{ Exception -> 0x040e }
            goto L_0x013a
        L_0x0143:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getDlNtValdtoDt()     // Catch:{ Exception -> 0x040e }
            r3 = 8
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x015d
            android.widget.LinearLayout r2 = r8.x1()     // Catch:{ Exception -> 0x040e }
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x040e }
            goto L_0x01cf
        L_0x015d:
            android.widget.LinearLayout r2 = r8.x1()     // Catch:{ Exception -> 0x040e }
            r2.setVisibility(r5)     // Catch:{ Exception -> 0x040e }
            ka.c$a r2 = ka.c.f13158a     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r6 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r6 = r6.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r6 = r6.getDlNtValdtoDt()     // Catch:{ Exception -> 0x040e }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x040e }
            boolean r6 = r2.n(r6)     // Catch:{ Exception -> 0x040e }
            if (r6 == 0) goto L_0x01b2
            com.nic.mparivahan.Dl.Model.DldetobjX r6 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r6 = r6.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r6 = r6.getDlNtValdtoDt()     // Catch:{ Exception -> 0x040e }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x040e }
            boolean r2 = r2.f(r6)     // Catch:{ Exception -> 0x040e }
            if (r2 == 0) goto L_0x01b2
            boolean r2 = r8.f8588h0     // Catch:{ Exception -> 0x040e }
            if (r2 != r4) goto L_0x01b2
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getDlNtValdtoDt()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r8.j1(r2)     // Catch:{ Exception -> 0x040e }
            android.widget.TextView r6 = r8.M1()     // Catch:{ Exception -> 0x040e }
            r8.i1(r2, r6)     // Catch:{ Exception -> 0x040e }
            goto L_0x01cf
        L_0x01b2:
            android.widget.TextView r2 = r8.M1()     // Catch:{ Exception -> 0x040e }
            z9.a$a r6 = z9.a.f18947a     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r7 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r7 = r7.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r7 = r7.getDlNtValdtoDt()     // Catch:{ Exception -> 0x040e }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x040e }
            java.lang.String r6 = r6.f(r7)     // Catch:{ Exception -> 0x040e }
            r2.setText(r6)     // Catch:{ Exception -> 0x040e }
        L_0x01cf:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getDlTrValdtoDt()     // Catch:{ Exception -> 0x040e }
            if (r2 != 0) goto L_0x01e5
            android.widget.LinearLayout r2 = r8.N1()     // Catch:{ Exception -> 0x040e }
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x040e }
            goto L_0x0257
        L_0x01e5:
            android.widget.LinearLayout r2 = r8.N1()     // Catch:{ Exception -> 0x040e }
            r2.setVisibility(r5)     // Catch:{ Exception -> 0x040e }
            ka.c$a r2 = ka.c.f13158a     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r3 = r3.getDlTrValdtoDt()     // Catch:{ Exception -> 0x040e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x040e }
            boolean r3 = r2.n(r3)     // Catch:{ Exception -> 0x040e }
            if (r3 == 0) goto L_0x023a
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r3 = r3.getDlTrValdtoDt()     // Catch:{ Exception -> 0x040e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x040e }
            boolean r2 = r2.f(r3)     // Catch:{ Exception -> 0x040e }
            if (r2 == 0) goto L_0x023a
            boolean r2 = r8.f8588h0     // Catch:{ Exception -> 0x040e }
            if (r2 != r4) goto L_0x023a
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getDlTrValdtoDt()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r8.j1(r2)     // Catch:{ Exception -> 0x040e }
            android.widget.TextView r3 = r8.L1()     // Catch:{ Exception -> 0x040e }
            r8.i1(r2, r3)     // Catch:{ Exception -> 0x040e }
            goto L_0x0257
        L_0x023a:
            android.widget.TextView r2 = r8.L1()     // Catch:{ Exception -> 0x040e }
            z9.a$a r3 = z9.a.f18947a     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r4 = r4.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r4 = r4.getDlTrValdtoDt()     // Catch:{ Exception -> 0x040e }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x040e }
            java.lang.String r3 = r3.f(r4)     // Catch:{ Exception -> 0x040e }
            r2.setText(r3)     // Catch:{ Exception -> 0x040e }
        L_0x0257:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.BioImgObjX r2 = r2.getBioImgObj()     // Catch:{ Exception -> 0x040e }
            r3 = 0
            if (r2 == 0) goto L_0x0267
            java.lang.String r2 = r2.getBiPhoto()     // Catch:{ Exception -> 0x040e }
            goto L_0x0268
        L_0x0267:
            r2 = r3
        L_0x0268:
            if (r2 != 0) goto L_0x0275
            android.widget.ImageView r2 = r8.C1()     // Catch:{ Exception -> 0x040e }
            r3 = 2131231173(0x7f0801c5, float:1.807842E38)
            r2.setImageResource(r3)     // Catch:{ Exception -> 0x040e }
            goto L_0x028e
        L_0x0275:
            android.widget.ImageView r2 = r8.C1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.BioImgObjX r4 = r4.getBioImgObj()     // Catch:{ Exception -> 0x040e }
            if (r4 == 0) goto L_0x0287
            java.lang.String r3 = r4.getBiPhoto()     // Catch:{ Exception -> 0x040e }
        L_0x0287:
            android.graphics.Bitmap r3 = r8.k1(r3)     // Catch:{ Exception -> 0x040e }
            r2.setImageBitmap(r3)     // Catch:{ Exception -> 0x040e }
        L_0x028e:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x040e }
            if (r2 == 0) goto L_0x038f
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x040e }
            java.lang.String r3 = "A"
            boolean r2 = cm.l.a(r2, r3)     // Catch:{ Exception -> 0x040e }
            r3 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            java.lang.String r4 = "Active"
            if (r2 != 0) goto L_0x0386
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x040e }
            boolean r2 = cm.l.a(r2, r4)     // Catch:{ Exception -> 0x040e }
            if (r2 == 0) goto L_0x02c9
            goto L_0x0386
        L_0x02c9:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x040e }
            java.lang.String r4 = "V"
            boolean r2 = cm.l.a(r2, r4)     // Catch:{ Exception -> 0x040e }
            if (r2 == 0) goto L_0x02ef
            android.widget.TextView r0 = r8.r1()     // Catch:{ Exception -> 0x040e }
            java.lang.String r1 = "ACTIVE"
            r0.setText(r1)     // Catch:{ Exception -> 0x040e }
        L_0x02e6:
            android.widget.TextView r0 = r8.r1()     // Catch:{ Exception -> 0x040e }
            r0.setTextColor(r3)     // Catch:{ Exception -> 0x040e }
            goto L_0x038f
        L_0x02ef:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x040e }
            java.lang.String r3 = "C"
            boolean r2 = cm.l.a(r2, r3)     // Catch:{ Exception -> 0x040e }
            java.lang.String r3 = "Cancelled"
            r4 = -65536(0xffffffffffff0000, float:NaN)
            if (r2 != 0) goto L_0x037e
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x040e }
            boolean r2 = cm.l.a(r2, r3)     // Catch:{ Exception -> 0x040e }
            if (r2 == 0) goto L_0x031a
            goto L_0x037e
        L_0x031a:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x040e }
            boolean r2 = cm.l.a(r2, r1)     // Catch:{ Exception -> 0x040e }
            if (r2 != 0) goto L_0x0376
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x040e }
            java.lang.String r3 = "S"
            boolean r2 = cm.l.a(r2, r3)     // Catch:{ Exception -> 0x040e }
            if (r2 == 0) goto L_0x0341
            goto L_0x0376
        L_0x0341:
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r1 = r1.getDlStatus()     // Catch:{ Exception -> 0x040e }
            boolean r1 = cm.l.a(r1, r0)     // Catch:{ Exception -> 0x040e }
            if (r1 != 0) goto L_0x0367
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r1 = r1.getDlStatus()     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = "R"
            boolean r1 = cm.l.a(r1, r2)     // Catch:{ Exception -> 0x040e }
            if (r1 == 0) goto L_0x038f
        L_0x0367:
            android.widget.TextView r1 = r8.r1()     // Catch:{ Exception -> 0x040e }
            r1.setText(r0)     // Catch:{ Exception -> 0x040e }
        L_0x036e:
            android.widget.TextView r0 = r8.r1()     // Catch:{ Exception -> 0x040e }
            r0.setTextColor(r4)     // Catch:{ Exception -> 0x040e }
            goto L_0x038f
        L_0x0376:
            android.widget.TextView r0 = r8.r1()     // Catch:{ Exception -> 0x040e }
            r0.setText(r1)     // Catch:{ Exception -> 0x040e }
            goto L_0x036e
        L_0x037e:
            android.widget.TextView r0 = r8.r1()     // Catch:{ Exception -> 0x040e }
            r0.setText(r3)     // Catch:{ Exception -> 0x040e }
            goto L_0x036e
        L_0x0386:
            android.widget.TextView r0 = r8.r1()     // Catch:{ Exception -> 0x040e }
            r0.setText(r4)     // Catch:{ Exception -> 0x040e }
            goto L_0x02e6
        L_0x038f:
            java.lang.String r0 = ""
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r8.A1()     // Catch:{ Exception -> 0x03e7 }
            java.util.List r1 = r1.getDlcovs()     // Catch:{ Exception -> 0x03e7 }
            int r2 = r1.size()     // Catch:{ Exception -> 0x03e7 }
            r3 = r5
        L_0x039e:
            if (r3 >= r2) goto L_0x03c1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e7 }
            r4.<init>()     // Catch:{ Exception -> 0x03e7 }
            r4.append(r0)     // Catch:{ Exception -> 0x03e7 }
            java.lang.Object r0 = r1.get(r3)     // Catch:{ Exception -> 0x03e7 }
            com.nic.mparivahan.Dl.Model.Dlcov r0 = (com.nic.mparivahan.Dl.Model.Dlcov) r0     // Catch:{ Exception -> 0x03e7 }
            java.lang.String r0 = r0.getCovabbrv()     // Catch:{ Exception -> 0x03e7 }
            r4.append(r0)     // Catch:{ Exception -> 0x03e7 }
            java.lang.String r0 = ", "
            r4.append(r0)     // Catch:{ Exception -> 0x03e7 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x03e7 }
            int r3 = r3 + 1
            goto L_0x039e
        L_0x03c1:
            ka.c$a r1 = ka.c.f13158a     // Catch:{ Exception -> 0x03e7 }
            boolean r1 = r1.m(r0)     // Catch:{ Exception -> 0x03e7 }
            if (r1 != 0) goto L_0x03e7
            android.widget.TextView r1 = r8.O1()     // Catch:{ Exception -> 0x03e7 }
            java.lang.CharSequence r2 = km.q.B0(r0)     // Catch:{ Exception -> 0x03e7 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x03e7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x03e7 }
            int r0 = r0 + -2
            java.lang.String r0 = r2.substring(r5, r0)     // Catch:{ Exception -> 0x03e7 }
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r0, r2)     // Catch:{ Exception -> 0x03e7 }
            r1.setText(r0)     // Catch:{ Exception -> 0x03e7 }
        L_0x03e7:
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r8.A1()     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DlobjX r0 = r0.getDlobj()     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = r0.getDlLicno()     // Catch:{ Exception -> 0x040e }
            r8.V1(r0)     // Catch:{ Exception -> 0x040e }
            android.widget.TextView r0 = r8.t1()     // Catch:{ Exception -> 0x040e }
            java.lang.String r1 = r8.q1()     // Catch:{ Exception -> 0x040e }
            r0.setText(r1)     // Catch:{ Exception -> 0x040e }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r8.A1()     // Catch:{ Exception -> 0x040e }
            if (r0 == 0) goto L_0x040e
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r8.A1()     // Catch:{ Exception -> 0x040e }
            r8.v2(r0)     // Catch:{ Exception -> 0x040e }
        L_0x040e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.DLVirtualAlertScreen.T1():void");
    }

    public final void U1(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.G = databaseHelper;
    }

    public final void V1(String str) {
        cm.l.f(str, "<set-?>");
        this.f8582b0 = str;
    }

    public final void W1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.I = textView;
    }

    public final void X1(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.f8587g0 = dldetobjX;
    }

    public final void Y1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.V = textView;
    }

    public final void Z1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.R = textView;
    }

    public final void a2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.X = linearLayout;
    }

    public final void b2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.L = textView;
    }

    public final void c2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f8581a0 = linearLayout;
    }

    public final void d2(DlService dlService) {
        cm.l.f(dlService, "<set-?>");
        this.f8585e0 = dlService;
    }

    public final void e2(za.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.f8584d0 = aVar;
    }

    public final void f2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.H = dldetobjX;
    }

    public final void g2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.J = textView;
    }

    public final void h2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.S = imageView;
    }

    public final void i1(String str, TextView textView) {
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

    public final void i2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.f8586f0 = progressDialog;
    }

    public final String j1(String str) {
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

    public final void j2(Bitmap bitmap) {
        cm.l.f(bitmap, "<set-?>");
        this.U = bitmap;
    }

    public final Bitmap k1(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final void k2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.T = imageView;
    }

    public final Bitmap l1(Context context, Bitmap bitmap, String str) {
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

    public final void l2(cd.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.Y = aVar;
    }

    public final Bitmap m1(String str) {
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

    public final void m2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.f8583c0 = imageView;
    }

    public final TextView n1() {
        TextView textView = this.O;
        if (textView != null) {
            return textView;
        }
        cm.l.v("bloodGroup");
        return null;
    }

    public final void n2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.K = textView;
    }

    public final DatabaseHelper o1() {
        DatabaseHelper databaseHelper = this.G;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    public final void o2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.P = textView;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        la c10 = la.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.f8590j0 = c10;
        la laVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        la laVar2 = this.f8590j0;
        if (laVar2 == null) {
            cm.l.v("binding");
            laVar2 = null;
        }
        aVar.x0(this, laVar2);
        q2(new ld.c(this));
        d2(DlService.f8615a.c(this));
        View findViewById = findViewById(R.id.dl_status_text);
        cm.l.e(findViewById, "findViewById(...)");
        W1((TextView) findViewById);
        View findViewById2 = findViewById(R.id.driver_name_txt);
        cm.l.e(findViewById2, "findViewById(...)");
        g2((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.relation_name_txt);
        cm.l.e(findViewById3, "findViewById(...)");
        n2((TextView) findViewById3);
        View findViewById4 = findViewById(R.id.issue_date_txt);
        cm.l.e(findViewById4, "findViewById(...)");
        b2((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.valid_till_txt);
        cm.l.e(findViewById5, "findViewById(...)");
        s2((TextView) findViewById5);
        View findViewById6 = findViewById(R.id.transport_validity);
        cm.l.e(findViewById6, "findViewById(...)");
        r2((TextView) findViewById6);
        View findViewById7 = findViewById(R.id.blood_txt);
        cm.l.e(findViewById7, "findViewById(...)");
        S1((TextView) findViewById7);
        View findViewById8 = findViewById(R.id.rto_txt);
        cm.l.e(findViewById8, "findViewById(...)");
        o2((TextView) findViewById8);
        View findViewById9 = findViewById(R.id.rto_name_txt);
        cm.l.e(findViewById9, "findViewById(...)");
        p2((TextView) findViewById9);
        View findViewById10 = findViewById(R.id.dob_txt);
        cm.l.e(findViewById10, "findViewById(...)");
        Z1((TextView) findViewById10);
        View findViewById11 = findViewById(R.id.owner_image);
        cm.l.e(findViewById11, "findViewById(...)");
        h2((ImageView) findViewById11);
        View findViewById12 = findViewById(R.id.qr_img);
        cm.l.e(findViewById12, "findViewById(...)");
        k2((ImageView) findViewById12);
        View findViewById13 = findViewById(R.id.dl_text);
        cm.l.e(findViewById13, "findViewById(...)");
        Y1((TextView) findViewById13);
        View findViewById14 = findViewById(R.id.vehicle_class_txt);
        cm.l.e(findViewById14, "findViewById(...)");
        u2((TextView) findViewById14);
        View findViewById15 = findViewById(R.id.nexgenarrow);
        cm.l.e(findViewById15, "findViewById(...)");
        a2((LinearLayout) findViewById15);
        View findViewById16 = findViewById(R.id.referesh);
        cm.l.e(findViewById16, "findViewById(...)");
        m2((ImageView) findViewById16);
        if (getIntent() != null) {
            this.f8588h0 = getIntent().getBooleanExtra("Flag", false);
        }
        i2(new ProgressDialog(this));
        D1().setMessage("Please wait...");
        D1().setCancelable(false);
        D1().setCanceledOnTouchOutside(false);
        e2((za.a) new u0((x0) this, (u0.b) new za.b(new ya.a(y1()))).a(za.a.class));
        this.f8589i0 = RcImpoundService.f9481a.b(this);
        RcImpoundService rcImpoundService = this.f8589i0;
        if (rcImpoundService == null) {
            cm.l.v("rcImpoundService");
            rcImpoundService = null;
        }
        l2((cd.a) new u0((x0) this, (u0.b) new cd.b(new bd.a(rcImpoundService))).a(cd.a.class));
        v1().setOnClickListener(new g0(this));
        G1().setOnClickListener(new h0(this));
        z1().n().g(this, new e(new a(this)));
        z1().o().g(this, new e(new b(this)));
        View findViewById17 = findViewById(R.id.valid_licence_linear);
        cm.l.e(findViewById17, "findViewById(...)");
        t2((LinearLayout) findViewById17);
        View findViewById18 = findViewById(R.id.ll_valid_till);
        cm.l.e(findViewById18, "findViewById(...)");
        c2((LinearLayout) findViewById18);
        U1(new DatabaseHelper(this));
        if (this.f8588h0) {
            la laVar3 = this.f8590j0;
            if (laVar3 == null) {
                cm.l.v("binding");
            } else {
                laVar = laVar3;
            }
            laVar.f27330h.setText("DL Details with Alerts");
        }
        T1();
        z1().y().g(this, new e(new c(this)));
        z1().x().g(this, new e(new d(this)));
    }

    public final void p2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.Q = textView;
    }

    public final String q1() {
        String str = this.f8582b0;
        if (str != null) {
            return str;
        }
        cm.l.v("dlNumber");
        return null;
    }

    public final void q2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f8591k0 = cVar;
    }

    public final TextView r1() {
        TextView textView = this.I;
        if (textView != null) {
            return textView;
        }
        cm.l.v("dlStatusTxt");
        return null;
    }

    public final void r2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.N = textView;
    }

    public final DldetobjX s1() {
        DldetobjX dldetobjX = this.f8587g0;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dl_data");
        return null;
    }

    public final void s2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.M = textView;
    }

    public final TextView t1() {
        TextView textView = this.V;
        if (textView != null) {
            return textView;
        }
        cm.l.v("dl_text");
        return null;
    }

    public final void t2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.Z = linearLayout;
    }

    public final TextView u1() {
        TextView textView = this.R;
        if (textView != null) {
            return textView;
        }
        cm.l.v("dobText");
        return null;
    }

    public final void u2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.W = textView;
    }

    public final LinearLayout v1() {
        LinearLayout linearLayout = this.X;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("img_back");
        return null;
    }

    public final TextView w1() {
        TextView textView = this.L;
        if (textView != null) {
            return textView;
        }
        cm.l.v("issueDate");
        return null;
    }

    public final void w2(Context context, String str) {
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
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new i0(dialog));
        dialog.show();
    }

    public final LinearLayout x1() {
        LinearLayout linearLayout = this.f8581a0;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("ll_valid_till");
        return null;
    }

    public final DlService y1() {
        DlService dlService = this.f8585e0;
        if (dlService != null) {
            return dlService;
        }
        cm.l.v("mDlService");
        return null;
    }

    public final za.a z1() {
        za.a aVar = this.f8584d0;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mDlViewModel");
        return null;
    }
}
