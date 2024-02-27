package com.nic.mparivahan.VahanServices.VahanView;

import ai.c4;
import ai.d4;
import ai.e4;
import ai.f4;
import ai.g4;
import ai.h4;
import ai.i4;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
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
import bi.i;
import bi.j;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationAdditionActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationContinuationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationTerminationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.TransferOwnerShipActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateRcActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;
import java.io.Serializable;
import java.util.HashMap;
import ld.g;
import pl.x;

public final class VahanOtpVerificationScreen extends androidx.appcompat.app.d {
    public TextView G;
    public String H;
    public String I;
    public EditText J;
    public String K;
    public String L;
    public TextView M;
    public j N;
    public VahanServiceConnection O;
    public TextView P;
    public ProgressDialog Q;
    public AppCompatImageView R;
    public RelativeLayout S;
    public ImageView T;
    public DatabaseHelper U;
    public g V;
    public TextView W;
    public TextView X;
    public TextView Y;
    public TextView Z;

    /* renamed from: a0  reason: collision with root package name */
    private HashMap f21567a0 = new HashMap();

    /* renamed from: b0  reason: collision with root package name */
    public NrvDetails f21568b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f21569c0;

    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VahanOtpVerificationScreen f21570a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanOtpVerificationScreen vahanOtpVerificationScreen) {
            super(30000, 1000);
            this.f21570a = vahanOtpVerificationScreen;
        }

        public void onFinish() {
            this.f21570a.v1().setVisibility(0);
            this.f21570a.A1().setText("0");
            this.f21570a.A1().setVisibility(8);
        }

        public void onTick(long j10) {
            TextView A1 = this.f21570a.A1();
            A1.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21570a.v1().setVisibility(8);
            this.f21570a.A1().setVisibility(0);
        }
    }

    public static final class b extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VahanOtpVerificationScreen f21571a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanOtpVerificationScreen vahanOtpVerificationScreen) {
            super(30000, 1000);
            this.f21571a = vahanOtpVerificationScreen;
        }

        public void onFinish() {
            this.f21571a.v1().setVisibility(0);
            this.f21571a.A1().setText("0");
            this.f21571a.A1().setVisibility(8);
        }

        public void onTick(long j10) {
            TextView A1 = this.f21571a.A1();
            A1.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21571a.v1().setVisibility(8);
            this.f21571a.A1().setVisibility(0);
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanOtpVerificationScreen f21572e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanOtpVerificationScreen vahanOtpVerificationScreen) {
            super(1);
            this.f21572e = vahanOtpVerificationScreen;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    VahanOtpVerificationScreen vahanOtpVerificationScreen = this.f21572e;
                    vahanOtpVerificationScreen.O1(vahanOtpVerificationScreen.t1(), this.f21572e.y1(), false);
                    return;
                }
                this.f21572e.s1().dismiss();
                VahanOtpVerificationScreen vahanOtpVerificationScreen2 = this.f21572e;
                vahanOtpVerificationScreen2.M1(vahanOtpVerificationScreen2, otpVerifyResult.getStatusDesc());
            } catch (Exception unused) {
                this.f21572e.s1().dismiss();
                VahanOtpVerificationScreen vahanOtpVerificationScreen3 = this.f21572e;
                vahanOtpVerificationScreen3.M1(vahanOtpVerificationScreen3, "Unable to Verify the OTP, Please try after some time");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanOtpVerificationScreen f21573e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanOtpVerificationScreen vahanOtpVerificationScreen) {
            super(1);
            this.f21573e = vahanOtpVerificationScreen;
        }

        public final void b(String str) {
            this.f21573e.s1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanOtpVerificationScreen f21574e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanOtpVerificationScreen vahanOtpVerificationScreen) {
            super(1);
            this.f21574e = vahanOtpVerificationScreen;
        }

        public final void b(ResendOtp resendOtp) {
            VahanOtpVerificationScreen vahanOtpVerificationScreen;
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    this.f21574e.s1().dismiss();
                    VahanOtpVerificationScreen vahanOtpVerificationScreen2 = this.f21574e;
                    vahanOtpVerificationScreen2.M1(vahanOtpVerificationScreen2, "We have resent the OTP to your Mobile Number");
                    return;
                }
                if (p.o(resendOtp.getStatusCode(), "AL002", true)) {
                    vahanOtpVerificationScreen = this.f21574e;
                } else {
                    this.f21574e.s1().dismiss();
                    vahanOtpVerificationScreen = this.f21574e;
                }
                vahanOtpVerificationScreen.M1(vahanOtpVerificationScreen, resendOtp.getStatusDesc());
            } catch (Exception unused) {
                this.f21574e.s1().dismiss();
                VahanOtpVerificationScreen vahanOtpVerificationScreen3 = this.f21574e;
                vahanOtpVerificationScreen3.M1(vahanOtpVerificationScreen3, "Unable to Verify the OTP, Please try after some time");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21575a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f21575a = lVar;
        }

        public final pl.c a() {
            return this.f21575a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21575a.invoke(obj);
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
    public static final void F1(VahanOtpVerificationScreen vahanOtpVerificationScreen, View view) {
        cm.l.f(vahanOtpVerificationScreen, "this$0");
        vahanOtpVerificationScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void G1(VahanOtpVerificationScreen vahanOtpVerificationScreen, View view) {
        cm.l.f(vahanOtpVerificationScreen, "this$0");
        vahanOtpVerificationScreen.L1();
    }

    /* access modifiers changed from: private */
    public static final void H1(VahanOtpVerificationScreen vahanOtpVerificationScreen, View view) {
        EditText o12;
        TransformationMethod instance;
        cm.l.f(vahanOtpVerificationScreen, "this$0");
        if (vahanOtpVerificationScreen.o1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            vahanOtpVerificationScreen.z1().setImageResource(R.drawable.pass_visible);
            o12 = vahanOtpVerificationScreen.o1();
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            vahanOtpVerificationScreen.z1().setImageResource(R.drawable.mvvm_visibility);
            o12 = vahanOtpVerificationScreen.o1();
            instance = PasswordTransformationMethod.getInstance();
        }
        o12.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void I1(VahanOtpVerificationScreen vahanOtpVerificationScreen, View view) {
        cm.l.f(vahanOtpVerificationScreen, "this$0");
        vahanOtpVerificationScreen.s1().show();
        new b(vahanOtpVerificationScreen).start();
        vahanOtpVerificationScreen.E1().j(vahanOtpVerificationScreen, vahanOtpVerificationScreen.r1());
    }

    /* access modifiers changed from: private */
    public static final void J1(VahanOtpVerificationScreen vahanOtpVerificationScreen, View view) {
        cm.l.f(vahanOtpVerificationScreen, "this$0");
        vahanOtpVerificationScreen.o1().setText("");
    }

    /* access modifiers changed from: private */
    public static final void K1(VahanOtpVerificationScreen vahanOtpVerificationScreen, View view) {
        String str;
        cm.l.f(vahanOtpVerificationScreen, "this$0");
        String obj = vahanOtpVerificationScreen.o1().getText().toString();
        if (obj == null || obj.length() == 0) {
            str = "Please enter the OTP";
        } else if (obj.length() < 6) {
            str = "Please enter the valid OTP";
        } else {
            vahanOtpVerificationScreen.s1().show();
            vahanOtpVerificationScreen.E1().l(vahanOtpVerificationScreen, obj, vahanOtpVerificationScreen.r1());
            return;
        }
        vahanOtpVerificationScreen.M1(vahanOtpVerificationScreen, str);
    }

    private final void L1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void N1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final TextView A1() {
        TextView textView = this.Y;
        if (textView != null) {
            return textView;
        }
        cm.l.v("time_text");
        return null;
    }

    public final TextView B1() {
        TextView textView = this.X;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txt_reset");
        return null;
    }

    public final TextView C1() {
        TextView textView = this.W;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txt_vehicle_number");
        return null;
    }

    public final TextView D1() {
        TextView textView = this.G;
        if (textView != null) {
            return textView;
        }
        cm.l.v("verify_user");
        return null;
    }

    public final j E1() {
        j jVar = this.N;
        if (jVar != null) {
            return jVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final void M1(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new i4(dialog));
        dialog.show();
    }

    public final void O1(String str, HashMap hashMap, boolean z10) {
        cm.l.f(str, "rc_number");
        cm.l.f(hashMap, "serviceSelection_HashMap");
        if (hashMap.containsKey(VContant.DUPLICATE_RC)) {
            Intent intent = new Intent(this, VahanDuplicateRcActivity.class);
            intent.putExtra("RC", str);
            intent.putExtra("RcDetails", u1());
            intent.putExtra("map", hashMap);
            intent.putExtra("off_code", q1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, z10);
            intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent);
            finish();
        }
        if (hashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            Intent intent2 = new Intent(this, TransferOwnerShipActivity.class);
            intent2.putExtra("RC", str);
            intent2.putExtra("RcDetails", u1());
            intent2.putExtra("map", hashMap);
            intent2.putExtra("off_code", q1());
            intent2.putExtra(VContant.NEXGEN_isFACELESS, z10);
            intent2.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent2.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent2);
            finish();
        }
        if (hashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            Intent intent3 = new Intent(this, VahanChangeOfAddress.class);
            intent3.putExtra("RC", str);
            intent3.putExtra("RcDetails", u1());
            intent3.putExtra("map", hashMap);
            intent3.putExtra("off_code", q1());
            intent3.putExtra(VContant.NEXGEN_isFACELESS, z10);
            intent3.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent3.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent3);
            finish();
        }
        if (hashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            Intent intent4 = new Intent(this, HypothecationTerminationActivity.class);
            intent4.putExtra("RC", str);
            intent4.putExtra("RcDetails", u1());
            intent4.putExtra("map", hashMap);
            intent4.putExtra("off_code", q1());
            intent4.putExtra(VContant.NEXGEN_isFACELESS, z10);
            intent4.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent4.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent4);
            finish();
        }
        Class<HypothecationContinuationActivity> cls = HypothecationContinuationActivity.class;
        if (hashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            Intent intent5 = new Intent(this, cls);
            intent5.putExtra("RC", str);
            intent5.putExtra("RcDetails", u1());
            intent5.putExtra("map", hashMap);
            intent5.putExtra("off_code", q1());
            intent5.putExtra(VContant.NEXGEN_isFACELESS, z10);
            intent5.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent5.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent5);
            finish();
        }
        if (hashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            Intent intent6 = new Intent(this, HypothecationAdditionActivity.class);
            intent6.putExtra("RC", str);
            intent6.putExtra("RcDetails", u1());
            intent6.putExtra("map", hashMap);
            intent6.putExtra("off_code", q1());
            intent6.putExtra(VContant.NEXGEN_isFACELESS, z10);
            intent6.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent6.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent6);
            finish();
        }
        if (hashMap.containsKey(VContant.RCPARTICULAR)) {
            Intent intent7 = new Intent(this, VahanDetailsForRcParticulara.class);
            intent7.putExtra("RcDetails", u1());
            intent7.putExtra("RC", str);
            intent7.putExtra(VContant.NEXGEN_isFACELESS, z10);
            intent7.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent7.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent7);
            finish();
        }
        if (hashMap.containsKey(VContant.NOC)) {
            Intent intent8 = new Intent(this, VahanNocActivity.class);
            intent8.putExtra("RC", str);
            intent8.putExtra("RcDetails", u1());
            intent8.putExtra("map", hashMap);
            intent8.putExtra("off_code", q1());
            intent8.putExtra(VContant.NEXGEN_isFACELESS, z10);
            intent8.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent8.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent8);
            finish();
        }
        if (hashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            Intent intent9 = new Intent(this, cls);
            intent9.putExtra("RC", str);
            intent9.putExtra("RcDetails", u1());
            intent9.putExtra("map", hashMap);
            intent9.putExtra("off_code", q1());
            intent9.putExtra(VContant.NEXGEN_isFACELESS, z10);
            intent9.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent9.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent9);
            finish();
        }
    }

    public final void P1(AppCompatImageView appCompatImageView) {
        cm.l.f(appCompatImageView, "<set-?>");
        this.R = appCompatImageView;
    }

    public final void Q1(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.U = databaseHelper;
    }

    public final void R1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.P = textView;
    }

    public final void S1(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.J = editText;
    }

    public final void T1(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void U1(RelativeLayout relativeLayout) {
        cm.l.f(relativeLayout, "<set-?>");
        this.S = relativeLayout;
    }

    public final void V1(String str) {
        cm.l.f(str, "<set-?>");
        this.f21569c0 = str;
    }

    public final void W1(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final void X1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.Q = progressDialog;
    }

    public final void Y1(String str) {
        cm.l.f(str, "<set-?>");
        this.H = str;
    }

    public final void Z1(String str) {
        cm.l.f(str, "<set-?>");
        this.I = str;
    }

    public final void a2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.f21568b0 = nrvDetails;
    }

    public final void b2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.M = textView;
    }

    public final void c2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.O = vahanServiceConnection;
    }

    public final void d2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.Z = textView;
    }

    public final void e2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.T = imageView;
    }

    public final void f2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.Y = textView;
    }

    public final void g2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.X = textView;
    }

    public final void h2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.W = textView;
    }

    public final void i2(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.V = gVar;
    }

    public final void j2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.G = textView;
    }

    public final void k2(j jVar) {
        cm.l.f(jVar, "<set-?>");
        this.N = jVar;
    }

    public final void m1(HashMap hashMap) {
        cm.l.f(hashMap, "serviceSelection_HashMap");
        if (hashMap.containsKey(VContant.DUPLICATE_RC)) {
            x1().setText("Issue of Duplicate RC");
        }
        if (hashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            x1().setText("Transfer of Ownership");
        }
        if (hashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            x1().setText("Change of Address In RC");
        }
        if (hashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            x1().setText("Hypothecation Termination");
        }
        if (hashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            x1().setText("Hypothecation Continuation");
        }
        if (hashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            x1().setText("Hypothecation Addition");
        }
        if (hashMap.containsKey(VContant.RCPARTICULAR)) {
            x1().setText("RC Particular of Vehicle");
        }
    }

    public final AppCompatImageView n1() {
        AppCompatImageView appCompatImageView = this.R;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        cm.l.v("backButton");
        return null;
    }

    public final EditText o1() {
        EditText editText = this.J;
        if (editText != null) {
            return editText;
        }
        cm.l.v("enterOtp");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.vahan_verify_otp_screen);
        View findViewById = findViewById(R.id.verify_user);
        cm.l.e(findViewById, "findViewById(...)");
        j2((TextView) findViewById);
        View findViewById2 = findViewById(R.id.enterOtp);
        cm.l.e(findViewById2, "findViewById(...)");
        S1((EditText) findViewById2);
        View findViewById3 = findViewById(R.id.disPlay);
        cm.l.e(findViewById3, "findViewById(...)");
        R1((TextView) findViewById3);
        View findViewById4 = findViewById(R.id.resendOtp);
        cm.l.e(findViewById4, "findViewById(...)");
        b2((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.showmpin);
        cm.l.e(findViewById5, "findViewById(...)");
        e2((ImageView) findViewById5);
        View findViewById6 = findViewById(R.id.txt_reset);
        cm.l.e(findViewById6, "findViewById(...)");
        g2((TextView) findViewById6);
        View findViewById7 = findViewById(R.id.time_text);
        cm.l.e(findViewById7, "findViewById(...)");
        f2((TextView) findViewById7);
        View findViewById8 = findViewById(R.id.selectedServiceTv);
        cm.l.e(findViewById8, "findViewById(...)");
        d2((TextView) findViewById8);
        View findViewById9 = findViewById(R.id.txt_vehicle_number);
        cm.l.e(findViewById9, "findViewById(...)");
        h2((TextView) findViewById9);
        c2(VahanServiceConnection.f21199a.b(this));
        X1(new ProgressDialog(this));
        s1().setMessage("Please wait...");
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        i2(new g(this));
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        cm.l.e(A0, "getInstance(...)");
        Q1(A0);
        View findViewById10 = findViewById(R.id.mvvm_back);
        cm.l.e(findViewById10, "findViewById(...)");
        P1((AppCompatImageView) findViewById10);
        View findViewById11 = findViewById(R.id.nexGenHolder);
        cm.l.e(findViewById11, "findViewById(...)");
        U1((RelativeLayout) findViewById11);
        n1().setOnClickListener(new c4(this));
        p1().setOnClickListener(new d4(this));
        new a(this).start();
        z1().setOnClickListener(new e4(this));
        new g(this);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                Z1(String.valueOf(intent.getStringExtra("RC")));
                Y1(String.valueOf(intent.getStringExtra("Param")));
                W1(String.valueOf(intent.getStringExtra("otpId")));
                T1(String.valueOf(intent.getStringExtra("MobileNumber")));
                V1(String.valueOf(intent.getStringExtra("off_code")));
                HashMap hashMap = (HashMap) intent.getSerializableExtra("map");
                cm.l.c(hashMap);
                this.f21567a0 = hashMap;
                Serializable serializableExtra = intent.getSerializableExtra("RcDetails");
                cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
                a2((NrvDetails) serializableExtra);
                C1().setText(t1().toString());
                m1(this.f21567a0);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        v1().setOnClickListener(new f4(this));
        B1().setOnClickListener(new g4(this));
        k2((j) new u0((x0) this, (u0.b) new i(new wg.e(w1()))).a(j.class));
        E1().k().g(this, new f(new c(this)));
        E1().g().g(this, new f(new d(this)));
        E1().i().g(this, new f(new e(this)));
        D1().setOnClickListener(new h4(this));
    }

    public final RelativeLayout p1() {
        RelativeLayout relativeLayout = this.S;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        cm.l.v("nexGenHolder");
        return null;
    }

    public final String q1() {
        String str = this.f21569c0;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final String r1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("otpId");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.Q;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String t1() {
        String str = this.I;
        if (str != null) {
            return str;
        }
        cm.l.v("RC");
        return null;
    }

    public final NrvDetails u1() {
        NrvDetails nrvDetails = this.f21568b0;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final TextView v1() {
        TextView textView = this.M;
        if (textView != null) {
            return textView;
        }
        cm.l.v("resendOtp");
        return null;
    }

    public final VahanServiceConnection w1() {
        VahanServiceConnection vahanServiceConnection = this.O;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final TextView x1() {
        TextView textView = this.Z;
        if (textView != null) {
            return textView;
        }
        cm.l.v("selectedServiceTv");
        return null;
    }

    public final HashMap y1() {
        return this.f21567a0;
    }

    public final ImageView z1() {
        ImageView imageView = this.T;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("showmpin");
        return null;
    }
}
