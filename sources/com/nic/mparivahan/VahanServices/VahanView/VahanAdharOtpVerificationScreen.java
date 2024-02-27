package com.nic.mparivahan.VahanServices.VahanView;

import ai.f;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import bi.j;
import bm.l;
import cm.m;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.StateCostForDms;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationAdditionActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationContinuationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationTerminationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.TransferOwnerShipActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateRcActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;
import j$.util.Base64;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import ld.g;
import pl.x;

public final class VahanAdharOtpVerificationScreen extends androidx.appcompat.app.d {
    public TextView G;
    public String H;
    public String I;
    public EditText J;
    public String K;
    public h L;
    public VahanProService M;
    public String N;
    public String O;
    public vd.b P;
    public TextView Q;
    public j R;
    public TextView S;
    public ProgressDialog T;
    public AppCompatImageView U;
    public RelativeLayout V;
    public ImageView W;
    public DatabaseHelper X;
    public g Y;
    public TextView Z;

    /* renamed from: a0  reason: collision with root package name */
    public TextView f21443a0;

    /* renamed from: b0  reason: collision with root package name */
    public TextView f21444b0;

    /* renamed from: c0  reason: collision with root package name */
    public TextView f21445c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f21446d0;

    /* renamed from: e0  reason: collision with root package name */
    public NrvDetails f21447e0;

    /* renamed from: f0  reason: collision with root package name */
    private final EkYCService f21448f0 = EkYCService.f20515a.a(this);

    /* renamed from: g0  reason: collision with root package name */
    private HashMap f21449g0 = new HashMap();

    /* renamed from: h0  reason: collision with root package name */
    private String f21450h0 = "NA";

    /* renamed from: i0  reason: collision with root package name */
    private String f21451i0 = "NA";

    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VahanAdharOtpVerificationScreen f21452a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen) {
            super(30000, 1000);
            this.f21452a = vahanAdharOtpVerificationScreen;
        }

        public void onFinish() {
            this.f21452a.A1().setVisibility(0);
            this.f21452a.F1().setText("0");
            this.f21452a.F1().setVisibility(8);
        }

        public void onTick(long j10) {
            TextView F1 = this.f21452a.F1();
            F1.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21452a.A1().setVisibility(8);
            this.f21452a.F1().setVisibility(0);
        }
    }

    public static final class b extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VahanAdharOtpVerificationScreen f21453a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen) {
            super(30000, 1000);
            this.f21453a = vahanAdharOtpVerificationScreen;
        }

        public void onFinish() {
            this.f21453a.A1().setVisibility(0);
            this.f21453a.F1().setText("0");
            this.f21453a.F1().setVisibility(8);
        }

        public void onTick(long j10) {
            TextView F1 = this.f21453a.F1();
            F1.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21453a.A1().setVisibility(8);
            this.f21453a.F1().setVisibility(0);
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanAdharOtpVerificationScreen f21454e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen) {
            super(1);
            this.f21454e = vahanAdharOtpVerificationScreen;
        }

        public final void b(StateCostForDms stateCostForDms) {
            VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen;
            String y12;
            HashMap D1;
            boolean z10;
            String v12;
            String o12;
            this.f21454e.w1().dismiss();
            try {
                String faceless_service_purcd = stateCostForDms.getFaceless_service_purcd();
                if (faceless_service_purcd != null) {
                    if (faceless_service_purcd.length() != 0) {
                        Iterable<String> l02 = q.l0(stateCostForDms.getFaceless_service_purcd(), new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList = new ArrayList(r.s(l02, 10));
                        for (String B0 : l02) {
                            arrayList.add(q.B0(B0).toString());
                        }
                        if (arrayList.contains(VContant.Companion.f(this.f21454e.D1()))) {
                            vahanAdharOtpVerificationScreen = this.f21454e;
                            y12 = vahanAdharOtpVerificationScreen.y1();
                            D1 = this.f21454e.D1();
                            z10 = true;
                            v12 = this.f21454e.v1();
                            o12 = this.f21454e.o1();
                        } else {
                            vahanAdharOtpVerificationScreen = this.f21454e;
                            y12 = vahanAdharOtpVerificationScreen.y1();
                            D1 = this.f21454e.D1();
                            z10 = false;
                            v12 = this.f21454e.v1();
                            o12 = this.f21454e.o1();
                        }
                        vahanAdharOtpVerificationScreen.U1(y12, D1, z10, v12, o12);
                    }
                }
                vahanAdharOtpVerificationScreen = this.f21454e;
                y12 = vahanAdharOtpVerificationScreen.y1();
                D1 = this.f21454e.D1();
                z10 = false;
                v12 = this.f21454e.v1();
                o12 = this.f21454e.o1();
                vahanAdharOtpVerificationScreen.U1(y12, D1, z10, v12, o12);
            } catch (Exception e10) {
                VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen2 = this.f21454e;
                vahanAdharOtpVerificationScreen2.U1(vahanAdharOtpVerificationScreen2.y1(), this.f21454e.D1(), false, this.f21454e.v1(), this.f21454e.o1());
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((StateCostForDms) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanAdharOtpVerificationScreen f21455e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen) {
            super(1);
            this.f21455e = vahanAdharOtpVerificationScreen;
        }

        public final void b(String str) {
            this.f21455e.w1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21456a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f21456a = lVar;
        }

        public final pl.c a() {
            return this.f21456a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21456a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return cm.l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void L1(VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen, View view) {
        cm.l.f(vahanAdharOtpVerificationScreen, "this$0");
        vahanAdharOtpVerificationScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void M1(VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen, View view) {
        cm.l.f(vahanAdharOtpVerificationScreen, "this$0");
        vahanAdharOtpVerificationScreen.R1();
    }

    /* access modifiers changed from: private */
    public static final void N1(VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen, View view) {
        EditText r12;
        TransformationMethod instance;
        cm.l.f(vahanAdharOtpVerificationScreen, "this$0");
        if (vahanAdharOtpVerificationScreen.r1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            vahanAdharOtpVerificationScreen.E1().setImageResource(R.drawable.pass_visible);
            r12 = vahanAdharOtpVerificationScreen.r1();
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            vahanAdharOtpVerificationScreen.E1().setImageResource(R.drawable.mvvm_visibility);
            r12 = vahanAdharOtpVerificationScreen.r1();
            instance = PasswordTransformationMethod.getInstance();
        }
        r12.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void O1(VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen, View view) {
        cm.l.f(vahanAdharOtpVerificationScreen, "this$0");
        vahanAdharOtpVerificationScreen.w1().show();
        new b(vahanAdharOtpVerificationScreen).start();
        vahanAdharOtpVerificationScreen.J1().j(vahanAdharOtpVerificationScreen, vahanAdharOtpVerificationScreen.u1());
    }

    /* access modifiers changed from: private */
    public static final void P1(VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen, View view) {
        cm.l.f(vahanAdharOtpVerificationScreen, "this$0");
        vahanAdharOtpVerificationScreen.r1().setText("");
    }

    /* access modifiers changed from: private */
    public static final void Q1(VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen, View view) {
        String str;
        cm.l.f(vahanAdharOtpVerificationScreen, "this$0");
        String obj = vahanAdharOtpVerificationScreen.r1().getText().toString();
        if (obj == null || obj.length() == 0) {
            str = "Please enter the OTP";
        } else if (obj.length() < 6) {
            str = "Please enter the valid OTP";
        } else {
            vahanAdharOtpVerificationScreen.w1().show();
            if (Build.VERSION.SDK_INT >= 26) {
                Base64.Encoder encoder = Base64.getEncoder();
                byte[] bytes = vahanAdharOtpVerificationScreen.n1().getBytes(km.d.f24740b);
                cm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
                encoder.encodeToString(bytes);
                return;
            }
            byte[] bytes2 = vahanAdharOtpVerificationScreen.n1().getBytes(km.d.f24740b);
            cm.l.e(bytes2, "this as java.lang.String).getBytes(charset)");
            android.util.Base64.encode(bytes2, 0);
            return;
        }
        vahanAdharOtpVerificationScreen.S1(vahanAdharOtpVerificationScreen, str);
    }

    private final void R1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void T1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final TextView A1() {
        TextView textView = this.Q;
        if (textView != null) {
            return textView;
        }
        cm.l.v("resendOtp");
        return null;
    }

    public final VahanProService B1() {
        VahanProService vahanProService = this.M;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final TextView C1() {
        TextView textView = this.f21445c0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("selectedServiceTv");
        return null;
    }

    public final HashMap D1() {
        return this.f21449g0;
    }

    public final ImageView E1() {
        ImageView imageView = this.W;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("showmpin");
        return null;
    }

    public final TextView F1() {
        TextView textView = this.f21444b0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("time_text");
        return null;
    }

    public final TextView G1() {
        TextView textView = this.f21443a0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txt_reset");
        return null;
    }

    public final TextView H1() {
        TextView textView = this.Z;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txt_vehicle_number");
        return null;
    }

    public final TextView I1() {
        TextView textView = this.G;
        if (textView != null) {
            return textView;
        }
        cm.l.v("verify_user");
        return null;
    }

    public final j J1() {
        j jVar = this.R;
        if (jVar != null) {
            return jVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final h K1() {
        h hVar = this.L;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModelv1");
        return null;
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
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new ai.g(dialog));
        dialog.show();
    }

    public final void U1(String str, HashMap hashMap, boolean z10, String str2, String str3) {
        Class<HypothecationContinuationActivity> cls;
        String str4;
        String str5;
        String str6 = str;
        HashMap hashMap2 = hashMap;
        boolean z11 = z10;
        String str7 = str2;
        String str8 = str3;
        cm.l.f(str6, "rc_number");
        cm.l.f(hashMap2, "serviceSelection_HashMap");
        cm.l.f(str7, "name");
        cm.l.f(str8, "address");
        if (hashMap2.containsKey(VContant.DUPLICATE_RC)) {
            Intent intent = new Intent(this, VahanDuplicateRcActivity.class);
            intent.putExtra("RC", str6);
            intent.putExtra("RcDetails", z1());
            intent.putExtra("map", hashMap2);
            intent.putExtra("off_code", t1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent.putExtra(VContant.NEXGEN_addahar_name, str7);
            intent.putExtra(VContant.NEXGEN_addahar_address, str8);
            startActivity(intent);
            finish();
        }
        if (hashMap2.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            Intent intent2 = new Intent(this, TransferOwnerShipActivity.class);
            intent2.putExtra("RC", str6);
            intent2.putExtra("RcDetails", z1());
            intent2.putExtra("map", hashMap2);
            intent2.putExtra("off_code", t1());
            intent2.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent2.putExtra(VContant.NEXGEN_addahar_name, str7);
            intent2.putExtra(VContant.NEXGEN_addahar_address, str8);
            startActivity(intent2);
            finish();
        }
        if (hashMap2.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            Intent intent3 = new Intent(this, VahanChangeOfAddress.class);
            intent3.putExtra("RC", str6);
            intent3.putExtra("RcDetails", z1());
            intent3.putExtra("map", hashMap2);
            intent3.putExtra("off_code", t1());
            intent3.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent3.putExtra(VContant.NEXGEN_addahar_name, str7);
            intent3.putExtra(VContant.NEXGEN_addahar_address, str8);
            startActivity(intent3);
            finish();
        }
        if (hashMap2.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            Intent intent4 = new Intent(this, HypothecationTerminationActivity.class);
            intent4.putExtra("RC", str6);
            intent4.putExtra("RcDetails", z1());
            intent4.putExtra("map", hashMap2);
            intent4.putExtra("off_code", t1());
            intent4.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent4.putExtra(VContant.NEXGEN_addahar_name, str7);
            intent4.putExtra(VContant.NEXGEN_addahar_address, str8);
            startActivity(intent4);
            finish();
        }
        boolean containsKey = hashMap2.containsKey(VContant.HYPOTHECATION_CONTINUATION);
        Object obj = VContant.HYPOTHECATION_CONTINUATION;
        Class<HypothecationContinuationActivity> cls2 = HypothecationContinuationActivity.class;
        if (containsKey) {
            Intent intent5 = new Intent(this, cls2);
            intent5.putExtra("RC", str6);
            cls = cls2;
            intent5.putExtra("RcDetails", z1());
            intent5.putExtra("map", hashMap2);
            intent5.putExtra("off_code", t1());
            intent5.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent5.putExtra(VContant.NEXGEN_addahar_name, str7);
            intent5.putExtra(VContant.NEXGEN_addahar_address, str8);
            startActivity(intent5);
            finish();
        } else {
            cls = cls2;
        }
        if (hashMap2.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            Intent intent6 = new Intent(this, HypothecationAdditionActivity.class);
            intent6.putExtra("RC", str6);
            intent6.putExtra("RcDetails", z1());
            intent6.putExtra("map", hashMap2);
            intent6.putExtra("off_code", t1());
            intent6.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent6.putExtra(VContant.NEXGEN_addahar_name, str7);
            intent6.putExtra(VContant.NEXGEN_addahar_address, str8);
            startActivity(intent6);
            finish();
        }
        if (hashMap2.containsKey(VContant.RCPARTICULAR)) {
            Intent intent7 = new Intent(this, VahanDetailsForRcParticulara.class);
            str4 = "map";
            intent7.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RCPARTICULAR_CODE);
            intent7.putExtra(VContant.PURPOSE_CODE, VContant.RCPARTICULAR_PURPOSE_CODE);
            intent7.putExtra("state_code", z1().getState_cd());
            intent7.putExtra("rc_number", str6);
            intent7.putExtra("RcDetails", z1());
            intent7.putExtra(VContant.SERVICE_NAME, "RC Particular");
            intent7.putExtra("off_code", t1());
            intent7.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent7.putExtra(VContant.NEXGEN_addahar_name, str7);
            intent7.putExtra(VContant.NEXGEN_addahar_address, str8);
            startActivity(intent7);
            finish();
        } else {
            str4 = "map";
        }
        if (hashMap2.containsKey(VContant.NOC)) {
            Intent intent8 = new Intent(this, VahanNocActivity.class);
            intent8.putExtra("RC", str6);
            intent8.putExtra("RcDetails", z1());
            str5 = str4;
            intent8.putExtra(str5, hashMap2);
            intent8.putExtra("off_code", t1());
            intent8.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent8.putExtra(VContant.NEXGEN_addahar_name, str7);
            intent8.putExtra(VContant.NEXGEN_addahar_address, str8);
            startActivity(intent8);
            finish();
        } else {
            str5 = str4;
        }
        if (hashMap2.containsKey(obj)) {
            Intent intent9 = new Intent(this, cls);
            intent9.putExtra("RC", str6);
            intent9.putExtra("RcDetails", z1());
            intent9.putExtra(str5, hashMap2);
            intent9.putExtra("off_code", t1());
            intent9.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent9.putExtra(VContant.NEXGEN_addahar_name, str7);
            intent9.putExtra(VContant.NEXGEN_addahar_address, str8);
            startActivity(intent9);
            finish();
        }
    }

    public final void V1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void W1(AppCompatImageView appCompatImageView) {
        cm.l.f(appCompatImageView, "<set-?>");
        this.U = appCompatImageView;
    }

    public final void X1(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.X = databaseHelper;
    }

    public final void Y1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.S = textView;
    }

    public final void Z1(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.J = editText;
    }

    public final void a2(vd.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.P = bVar;
    }

    public final void b2(RelativeLayout relativeLayout) {
        cm.l.f(relativeLayout, "<set-?>");
        this.V = relativeLayout;
    }

    public final void c2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21446d0 = str;
    }

    public final void d2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.T = progressDialog;
    }

    public final void e2(String str) {
        cm.l.f(str, "<set-?>");
        this.H = str;
    }

    public final void f2(String str) {
        cm.l.f(str, "<set-?>");
        this.I = str;
    }

    public final void g2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.f21447e0 = nrvDetails;
    }

    public final void h2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.Q = textView;
    }

    public final void i2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.M = vahanProService;
    }

    public final void j2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21445c0 = textView;
    }

    public final void k2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.W = imageView;
    }

    public final void l2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21444b0 = textView;
    }

    public final void m1(HashMap hashMap) {
        cm.l.f(hashMap, "serviceSelection_HashMap");
        if (hashMap.containsKey(VContant.DUPLICATE_RC)) {
            C1().setText("Issue of Duplicate RC");
        }
        if (hashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            C1().setText("Transfer of Ownership");
        }
        if (hashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            C1().setText("Change of Address In RC");
        }
        if (hashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            C1().setText("Hypothecation Termination");
        }
        if (hashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            C1().setText("Hypothecation Continuation");
        }
        if (hashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            C1().setText("Hypothecation Addition");
        }
        if (hashMap.containsKey(VContant.RCPARTICULAR)) {
            C1().setText("RC Particular of Vehicle");
        }
    }

    public final void m2(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final String n1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("adahar_no");
        return null;
    }

    public final void n2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21443a0 = textView;
    }

    public final String o1() {
        return this.f21451i0;
    }

    public final void o2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.Z = textView;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.vahan_adahar_otp_verification_screen);
        View findViewById = findViewById(R.id.verify_user);
        cm.l.e(findViewById, "findViewById(...)");
        q2((TextView) findViewById);
        View findViewById2 = findViewById(R.id.enterOtp);
        cm.l.e(findViewById2, "findViewById(...)");
        Z1((EditText) findViewById2);
        View findViewById3 = findViewById(R.id.disPlay);
        cm.l.e(findViewById3, "findViewById(...)");
        Y1((TextView) findViewById3);
        View findViewById4 = findViewById(R.id.resendOtp);
        cm.l.e(findViewById4, "findViewById(...)");
        h2((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.showmpin);
        cm.l.e(findViewById5, "findViewById(...)");
        k2((ImageView) findViewById5);
        View findViewById6 = findViewById(R.id.txt_reset);
        cm.l.e(findViewById6, "findViewById(...)");
        n2((TextView) findViewById6);
        View findViewById7 = findViewById(R.id.time_text);
        cm.l.e(findViewById7, "findViewById(...)");
        l2((TextView) findViewById7);
        View findViewById8 = findViewById(R.id.selectedServiceTv);
        cm.l.e(findViewById8, "findViewById(...)");
        j2((TextView) findViewById8);
        View findViewById9 = findViewById(R.id.txt_vehicle_number);
        cm.l.e(findViewById9, "findViewById(...)");
        o2((TextView) findViewById9);
        d2(new ProgressDialog(this));
        w1().setMessage("Please wait...");
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        p2(new g(this));
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        cm.l.e(A0, "getInstance(...)");
        X1(A0);
        i2(VahanProService.f21196b.b(this));
        r2((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(B1()))).a(h.class));
        View findViewById10 = findViewById(R.id.mvvm_back);
        cm.l.e(findViewById10, "findViewById(...)");
        W1((AppCompatImageView) findViewById10);
        View findViewById11 = findViewById(R.id.nexGenHolder);
        cm.l.e(findViewById11, "findViewById(...)");
        b2((RelativeLayout) findViewById11);
        p1().setOnClickListener(new ai.a(this));
        a2((vd.b) new u0((x0) this, (u0.b) new vd.c(new vd.a(this.f21448f0))).a(vd.b.class));
        s1().setOnClickListener(new ai.b(this));
        new a(this).start();
        E1().setOnClickListener(new ai.c(this));
        new g(this);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                c2(String.valueOf(intent.getStringExtra("off_code")));
                Serializable serializableExtra = intent.getSerializableExtra("RcDetails");
                cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
                g2((NrvDetails) serializableExtra);
                f2(String.valueOf(intent.getStringExtra("RC")));
                e2(String.valueOf(intent.getStringExtra("Mobile_No")));
                TextView q12 = q1();
                q12.setText("OTP has been sent on your aadhar linked mobile number xxxxxx" + x1());
                HashMap hashMap = (HashMap) intent.getSerializableExtra("map");
                cm.l.c(hashMap);
                this.f21449g0 = hashMap;
                m2(String.valueOf(intent.getStringExtra("txnNo")));
                V1(String.valueOf(intent.getStringExtra("adahar_no")));
                H1().setText(y1().toString());
                m1(this.f21449g0);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        A1().setOnClickListener(new ai.d(this));
        G1().setOnClickListener(new ai.e(this));
        I1().setOnClickListener(new f(this));
        K1().g0().g(this, new e(new c(this)));
        K1().h0().g(this, new e(new d(this)));
    }

    public final AppCompatImageView p1() {
        AppCompatImageView appCompatImageView = this.U;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        cm.l.v("backButton");
        return null;
    }

    public final void p2(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.Y = gVar;
    }

    public final TextView q1() {
        TextView textView = this.S;
        if (textView != null) {
            return textView;
        }
        cm.l.v("disPlay");
        return null;
    }

    public final void q2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.G = textView;
    }

    public final EditText r1() {
        EditText editText = this.J;
        if (editText != null) {
            return editText;
        }
        cm.l.v("enterOtp");
        return null;
    }

    public final void r2(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.L = hVar;
    }

    public final RelativeLayout s1() {
        RelativeLayout relativeLayout = this.V;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        cm.l.v("nexGenHolder");
        return null;
    }

    public final String t1() {
        String str = this.f21446d0;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final String u1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("otpId");
        return null;
    }

    public final String v1() {
        return this.f21450h0;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.T;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String x1() {
        String str = this.H;
        if (str != null) {
            return str;
        }
        cm.l.v("param");
        return null;
    }

    public final String y1() {
        String str = this.I;
        if (str != null) {
            return str;
        }
        cm.l.v("RC");
        return null;
    }

    public final NrvDetails z1() {
        NrvDetails nrvDetails = this.f21447e0;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }
}
