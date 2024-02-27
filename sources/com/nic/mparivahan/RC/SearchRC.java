package com.nic.mparivahan.RC;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import cm.l;
import cm.m;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.SearchDL;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.CitizenDocInfoX;
import com.nic.mparivahan.RC.Model.CitzValidDoc;
import com.nic.mparivahan.RC.Model.GetVirtualDocDetails;
import com.nic.mparivahan.RC.Model.ImpoundRcSuccessModel;
import com.nic.mparivahan.RC.Model.MparCitizenDocInfo;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.Model.ValidateRcSuccess;
import com.nic.mparivahan.RC.RcInterface.RcImpoundService;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.VahanServices.VahanModel.GetStateCode;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import ka.c;
import ni.f8;
import org.json.JSONObject;
import pl.x;
import v9.e;
import vc.a1;
import vc.b1;
import vc.c1;
import vc.d1;
import vc.e1;
import vc.f0;
import vc.f1;
import vc.g0;
import vc.g1;
import vc.h0;
import vc.i0;
import vc.j0;
import vc.k0;
import vc.l0;
import vc.m0;
import vc.n0;
import vc.o0;
import vc.p0;
import vc.q0;
import vc.r0;
import vc.s0;
import vc.t0;
import vc.u0;
import vc.v0;
import vc.w0;
import vc.x0;
import vc.y0;
import vc.z0;
import xc.c;

public final class SearchRC extends androidx.appcompat.app.d implements zc.a {
    public String A0;
    public TextView B0;
    public LinearLayout C0;
    public LinearLayout D0;
    public TextView E0;
    public TextView F0;
    public cd.c G;
    public String G0;
    public RcService H;
    private int H0;
    public cd.a I;
    public TextView I0;
    private RcImpoundService J;
    public LinearLayout J0;
    public Context K;
    public TextView K0;
    public EditText L;
    public LinearLayout L0;
    public LinearLayout M;
    public LinearLayout M0;
    public LinearLayout N;
    public String N0;
    public TextView O;
    /* access modifiers changed from: private */
    public f8 O0;
    public TextView P;
    public ld.c P0;
    public TextView Q;
    public TextView Q0;
    public TextView R;
    public TextView R0;
    public TextView S;
    public v8.h S0;
    public TextView T;
    private SignService T0;
    public TextView U;
    private Dialog U0;
    public TextView V;
    private final ArrayList V0 = new ArrayList();
    public TextView W;
    private final ArrayList W0 = new ArrayList();
    public TextView X;
    public bi.h X0;
    public TextView Y;
    public VahanProService Y0;
    public TextView Z;
    private String Z0 = " ";

    /* renamed from: a0  reason: collision with root package name */
    public TextView f9487a0;

    /* renamed from: a1  reason: collision with root package name */
    private String f9488a1 = " ";

    /* renamed from: b0  reason: collision with root package name */
    public TextView f9489b0;

    /* renamed from: b1  reason: collision with root package name */
    private String f9490b1 = " ";

    /* renamed from: c0  reason: collision with root package name */
    public TextView f9491c0;

    /* renamed from: c1  reason: collision with root package name */
    public ld.e f9492c1;

    /* renamed from: d0  reason: collision with root package name */
    public LinearLayout f9493d0;

    /* renamed from: e0  reason: collision with root package name */
    public ProgressDialog f9494e0;

    /* renamed from: f0  reason: collision with root package name */
    public LinearLayout f9495f0;

    /* renamed from: g0  reason: collision with root package name */
    public LinearLayout f9496g0;

    /* renamed from: h0  reason: collision with root package name */
    public LinearLayout f9497h0;

    /* renamed from: i0  reason: collision with root package name */
    private BottomSheetBehavior f9498i0;

    /* renamed from: j0  reason: collision with root package name */
    public CoordinatorLayout f9499j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f9500k0;

    /* renamed from: l0  reason: collision with root package name */
    public TextView f9501l0;

    /* renamed from: m0  reason: collision with root package name */
    public DatabaseHelper f9502m0;

    /* renamed from: n0  reason: collision with root package name */
    public ld.g f9503n0;

    /* renamed from: o0  reason: collision with root package name */
    public RcModelsDet f9504o0;

    /* renamed from: p0  reason: collision with root package name */
    public LinearLayout f9505p0;

    /* renamed from: q0  reason: collision with root package name */
    public LinearLayout f9506q0;

    /* renamed from: r0  reason: collision with root package name */
    public LinearLayout f9507r0;

    /* renamed from: s0  reason: collision with root package name */
    public LinearLayout f9508s0;

    /* renamed from: t0  reason: collision with root package name */
    public TextView f9509t0;

    /* renamed from: u0  reason: collision with root package name */
    public TextView f9510u0;

    /* renamed from: v0  reason: collision with root package name */
    public String f9511v0;

    /* renamed from: w0  reason: collision with root package name */
    public String f9512w0;

    /* renamed from: x0  reason: collision with root package name */
    public EditText f9513x0;

    /* renamed from: y0  reason: collision with root package name */
    public EditText f9514y0;

    /* renamed from: z0  reason: collision with root package name */
    public LinearLayout f9515z0;

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchRC f9516e;

        a(SearchRC searchRC) {
            this.f9516e = searchRC;
        }

        public void afterTextChanged(Editable editable) {
            l.f(editable, "s");
            if (editable.toString().length() == 5) {
                this.f9516e.X1().requestFocus();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.f(charSequence, "s");
        }
    }

    public static final class b extends BottomSheetBehavior.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchRC f9517a;

        b(SearchRC searchRC) {
            this.f9517a = searchRC;
        }

        public void b(View view, float f10) {
            l.f(view, "bottomSheet");
        }

        public void c(View view, int i10) {
            TextView c32;
            boolean z10;
            l.f(view, "bottomSheet");
            if (i10 == 3) {
                c32 = this.f9517a.c3();
                z10 = false;
            } else if (i10 == 4) {
                c32 = this.f9517a.c3();
                z10 = true;
            } else {
                return;
            }
            c32.setEnabled(z10);
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchRC f9518e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchRC searchRC) {
            super(1);
            this.f9518e = searchRC;
        }

        public final void b(ResendOtp resendOtp) {
            Toast makeText;
            this.f9518e.C2().dismiss();
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    makeText = Toast.makeText(this.f9518e, "We have resent the OTP to your Mobile Number", 1);
                } else if (!ka.c.f13158a.m(resendOtp.getStatusDesc())) {
                    makeText = Toast.makeText(this.f9518e, resendOtp.getStatusDesc(), 1);
                } else {
                    this.f9518e.C2().dismiss();
                    SearchRC searchRC = this.f9518e;
                    searchRC.A3(searchRC, "The OTP you entered is invalid, Please enter the correct OTP");
                    return;
                }
                makeText.show();
            } catch (Exception unused) {
                this.f9518e.C2().dismiss();
                SearchRC searchRC2 = this.f9518e;
                searchRC2.A3(searchRC2, "Unable to resend the OTP, Please try after some time");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchRC f9519e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SearchRC searchRC) {
            super(1);
            this.f9519e = searchRC;
        }

        public final void b(String str) {
            this.f9519e.C2().dismiss();
            SearchRC searchRC = this.f9519e;
            searchRC.A3(searchRC, "Unable to Resend the OTP, Please try after some times");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchRC f9520e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SearchRC searchRC) {
            super(1);
            this.f9520e = searchRC;
        }

        public final void b(ImpoundRcSuccessModel impoundRcSuccessModel) {
            if (this.f9520e.C2().isShowing()) {
                this.f9520e.C2().dismiss();
            }
            this.f9520e.c3().setVisibility(0);
            this.f9520e.f3().setVisibility(8);
            this.f9520e.J2().setVisibility(8);
            int size = impoundRcSuccessModel.getResult().size();
            for (int i10 = 0; i10 < size; i10++) {
                if (p.o(impoundRcSuccessModel.getResult().get(i10).getImpound_type(), "document", true)) {
                    this.f9520e.J2().setVisibility(8);
                    TextView textView = new TextView(this.f9520e);
                    textView.setTextColor(androidx.core.content.a.c(this.f9520e, R.color.red_new));
                    textView.setTextSize(13.0f);
                    textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    textView.setGravity(8388613);
                    textView.setText(impoundRcSuccessModel.getResult().get(i10).getDocument());
                    Log.e("impoundData", impoundRcSuccessModel.getResult().get(i10).getDocument());
                    this.f9520e.d3().addView(textView);
                    this.f9520e.o2().add(impoundRcSuccessModel.getResult().get(i10).getDocument());
                    this.f9520e.n2().add(impoundRcSuccessModel.getResult().get(i10).getDoc_impound_type());
                }
                if (p.o(impoundRcSuccessModel.getResult().get(i10).getImpound_type(), "vehicle", true)) {
                    this.f9520e.f3().setVisibility(8);
                    this.f9520e.o2().add(impoundRcSuccessModel.getResult().get(i10).getImpound_type());
                    this.f9520e.n2().add("Yes");
                }
            }
            c.a aVar = xc.c.f18258a;
            SearchRC searchRC = this.f9520e;
            aVar.b(searchRC, searchRC.o2(), this.f9520e.n2());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ImpoundRcSuccessModel) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchRC f9521e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SearchRC searchRC) {
            super(1);
            this.f9521e = searchRC;
        }

        public final void b(String str) {
            if (this.f9521e.C2().isShowing()) {
                this.f9521e.C2().dismiss();
            }
            this.f9521e.c3().setVisibility(0);
            this.f9521e.f3().setVisibility(8);
            this.f9521e.J2().setVisibility(8);
            SearchRC searchRC = this.f9521e;
            searchRC.y3(searchRC, "No Vehicle or Seizure Document impound against the searched RC number.");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchRC f9522e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SearchRC searchRC) {
            super(1);
            this.f9522e = searchRC;
        }

        /* JADX WARNING: Removed duplicated region for block: B:107:0x0338 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0351 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x038b A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x039a A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x03f4 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x0411 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x046c A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x047b A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:162:0x04c0 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x04cf A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x04f5 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:176:0x0551 A[SYNTHETIC, Splitter:B:176:0x0551] */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x0586 A[Catch:{ ParseException -> 0x0584 }] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00be A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00e4 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00f3 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0119 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0128 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x014e A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x015b A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0181 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0190 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x01b6 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x01c8 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0223 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0232 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x025e A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x026d A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x02a2 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x02b1 A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x02eb A[Catch:{ Exception -> 0x0642 }] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x02fc A[SYNTHETIC, Splitter:B:96:0x02fc] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.RC.Model.RcModelsDet r11) {
            /*
                r10 = this;
                java.lang.String r0 = "rc_regn_dt"
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e
                android.app.ProgressDialog r1 = r1.C2()
                r1.cancel()
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e
                android.widget.LinearLayout r1 = r1.v2()
                r2 = 0
                r1.setVisibility(r2)
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e
                android.widget.LinearLayout r1 = r1.t2()
                r3 = 8
                r1.setVisibility(r3)
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e
                r1.J1()
                java.lang.String r1 = r11.getStatusCode()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r4 = "NP001"
                boolean r1 = r1.equals(r4)     // Catch:{ Exception -> 0x0642 }
                r4 = 1
                r5 = 4
                r6 = 2
                if (r1 == 0) goto L_0x05cc
                com.nic.mparivahan.RC.Model.NrvDetails r1 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                if (r1 == 0) goto L_0x05b4
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                r1.j4(r11)     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r5 = "rc_owner_name"
                r7 = 0
                boolean r1 = km.q.F(r1, r5, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                java.lang.String r5 = "NA"
                if (r1 == 0) goto L_0x00b1
                com.nic.mparivahan.RC.Model.NrvDetails r1 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = r1.getRc_owner_name()     // Catch:{ Exception -> 0x0642 }
                if (r1 == 0) goto L_0x00a7
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r1 = r1.U2()     // Catch:{ Exception -> 0x0642 }
                ad.a$a r8 = ad.a.f400a     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r9 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r9 = r9.getRc_owner_name()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.b(r9)     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0642 }
                r1.setText(r8)     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_chasi_no()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0642 }
                r1.D3(r8)     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_eng_no()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0642 }
                r1.O3(r8)     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r1 = r1.g3()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_regn_no()     // Catch:{ Exception -> 0x0642 }
                r1.setText(r8)     // Catch:{ Exception -> 0x0642 }
                goto L_0x00b4
            L_0x00a7:
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
            L_0x00a9:
                android.widget.TextView r1 = r1.U2()     // Catch:{ Exception -> 0x0642 }
                r1.setText(r5)     // Catch:{ Exception -> 0x0642 }
                goto L_0x00b4
            L_0x00b1:
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                goto L_0x00a9
            L_0x00b4:
                java.lang.String r1 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                boolean r1 = km.q.F(r1, r0, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                if (r1 == 0) goto L_0x00e4
                com.nic.mparivahan.RC.Model.NrvDetails r1 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = r1.getRc_regn_dt()     // Catch:{ Exception -> 0x0642 }
                if (r1 == 0) goto L_0x00da
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r1 = r1.X2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_regn_dt()     // Catch:{ Exception -> 0x0642 }
                r1.setText(r8)     // Catch:{ Exception -> 0x0642 }
                goto L_0x00e7
            L_0x00da:
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
            L_0x00dc:
                android.widget.TextView r1 = r1.X2()     // Catch:{ Exception -> 0x0642 }
                r1.setText(r5)     // Catch:{ Exception -> 0x0642 }
                goto L_0x00e7
            L_0x00e4:
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                goto L_0x00dc
            L_0x00e7:
                java.lang.String r1 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = "rc_vh_class_desc"
                boolean r1 = km.q.F(r1, r8, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                if (r1 == 0) goto L_0x0119
                com.nic.mparivahan.RC.Model.NrvDetails r1 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = r1.getRc_vh_class_desc()     // Catch:{ Exception -> 0x0642 }
                if (r1 == 0) goto L_0x010f
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r1 = r1.a3()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_vh_class_desc()     // Catch:{ Exception -> 0x0642 }
                r1.setText(r8)     // Catch:{ Exception -> 0x0642 }
                goto L_0x011c
            L_0x010f:
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
            L_0x0111:
                android.widget.TextView r1 = r1.a3()     // Catch:{ Exception -> 0x0642 }
                r1.setText(r5)     // Catch:{ Exception -> 0x0642 }
                goto L_0x011c
            L_0x0119:
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                goto L_0x0111
            L_0x011c:
                java.lang.String r1 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = "rc_fuel_desc"
                boolean r1 = km.q.F(r1, r8, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                if (r1 == 0) goto L_0x014e
                com.nic.mparivahan.RC.Model.NrvDetails r1 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = r1.getRc_fuel_desc()     // Catch:{ Exception -> 0x0642 }
                if (r1 == 0) goto L_0x0144
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r1 = r1.S2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_fuel_desc()     // Catch:{ Exception -> 0x0642 }
                r1.setText(r8)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0151
            L_0x0144:
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
            L_0x0146:
                android.widget.TextView r1 = r1.S2()     // Catch:{ Exception -> 0x0642 }
                r1.setText(r5)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0151
            L_0x014e:
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                goto L_0x0146
            L_0x0151:
                java.lang.String r1 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                boolean r0 = km.q.F(r1, r0, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x0181
                com.nic.mparivahan.RC.Model.NrvDetails r0 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r0 = r0.getRc_regn_dt()     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x0177
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.X2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r1 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = r1.getRc_regn_dt()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r1)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0184
            L_0x0177:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
            L_0x0179:
                android.widget.TextView r0 = r0.X2()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r5)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0184
            L_0x0181:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                goto L_0x0179
            L_0x0184:
                java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = "rc_fit_upto"
                boolean r0 = km.q.F(r0, r1, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x01b6
                com.nic.mparivahan.RC.Model.NrvDetails r0 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r0 = r0.getRc_fit_upto()     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x01ac
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.R2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r1 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = r1.getRc_fit_upto()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r1)     // Catch:{ Exception -> 0x0642 }
                goto L_0x01b9
            L_0x01ac:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
            L_0x01ae:
                android.widget.TextView r0 = r0.R2()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r5)     // Catch:{ Exception -> 0x0642 }
                goto L_0x01b9
            L_0x01b6:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                goto L_0x01ae
            L_0x01b9:
                java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = "rc_insurance_upto"
                boolean r0 = km.q.F(r0, r1, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                r1 = 2131100577(0x7f0603a1, float:1.781354E38)
                if (r0 == 0) goto L_0x0223
                ka.c$a r0 = ka.c.f13158a     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_insurance_upto()     // Catch:{ Exception -> 0x0642 }
                boolean r0 = r0.m(r8)     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x0219
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                java.lang.String r0 = r0.K2()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = "INS002"
                boolean r0 = r0.equals(r8)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x0207
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.T2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_insurance_upto()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r8)     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.T2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.SearchRC r8 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                int r8 = androidx.core.content.a.c(r8, r1)     // Catch:{ Exception -> 0x0642 }
                r0.setTextColor(r8)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0226
            L_0x0207:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.T2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_insurance_upto()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r8)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0226
            L_0x0219:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
            L_0x021b:
                android.widget.TextView r0 = r0.T2()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r5)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0226
            L_0x0223:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                goto L_0x021b
            L_0x0226:
                java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = "rc_tax_upto"
                boolean r0 = km.q.F(r0, r8, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x025e
                ka.c$a r0 = ka.c.f13158a     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_tax_upto()     // Catch:{ Exception -> 0x0642 }
                boolean r0 = r0.m(r8)     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x0254
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.Y2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_tax_upto()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r8)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0261
            L_0x0254:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
            L_0x0256:
                android.widget.TextView r0 = r0.Y2()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r5)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0261
            L_0x025e:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                goto L_0x0256
            L_0x0261:
                java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = "rc_blacklist_status"
                boolean r0 = km.q.F(r0, r8, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x02a2
                ka.c$a r0 = ka.c.f13158a     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_blacklist_status()     // Catch:{ Exception -> 0x0642 }
                boolean r0 = r0.m(r8)     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x0298
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.LinearLayout r0 = r0.p2()     // Catch:{ Exception -> 0x0642 }
                r0.setVisibility(r2)     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.Q2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_blacklist_status()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r8)     // Catch:{ Exception -> 0x0642 }
                goto L_0x02a5
            L_0x0298:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
            L_0x029a:
                android.widget.LinearLayout r0 = r0.p2()     // Catch:{ Exception -> 0x0642 }
                r0.setVisibility(r3)     // Catch:{ Exception -> 0x0642 }
                goto L_0x02a5
            L_0x02a2:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                goto L_0x029a
            L_0x02a5:
                java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = "rc_np_no"
                boolean r0 = km.q.F(r0, r8, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x02eb
                ka.c$a r0 = ka.c.f13158a     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_np_no()     // Catch:{ Exception -> 0x0642 }
                boolean r0 = r0.m(r8)     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x02e1
                com.nic.mparivahan.RC.Model.NrvDetails r0 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r0 = r0.getRc_np_no()     // Catch:{ Exception -> 0x0642 }
                boolean r0 = km.p.o(r0, r5, r4)     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x02e1
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.z2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r8 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = r8.getRc_np_no()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r8)     // Catch:{ Exception -> 0x0642 }
                goto L_0x02ee
            L_0x02e1:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
            L_0x02e3:
                android.widget.LinearLayout r0 = r0.r2()     // Catch:{ Exception -> 0x0642 }
                r0.setVisibility(r3)     // Catch:{ Exception -> 0x0642 }
                goto L_0x02ee
            L_0x02eb:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                goto L_0x02e3
            L_0x02ee:
                java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = "rc_permit_valid_upto"
                boolean r0 = km.q.F(r0, r8, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                java.lang.String r8 = "binding"
                if (r0 == 0) goto L_0x0338
                ka.c$a r0 = ka.c.f13158a     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r9 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r9 = r9.getRc_permit_valid_upto()     // Catch:{ Exception -> 0x0642 }
                boolean r0 = r0.m(r9)     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x0326
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                ni.f8 r0 = r0.O0     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x0318
                cm.l.v(r8)     // Catch:{ Exception -> 0x0642 }
                r0 = r7
            L_0x0318:
                com.nic.mparivahan.MyTextView r0 = r0.D     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r9 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r9 = r9.getRc_permit_valid_upto()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r9)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0345
            L_0x0326:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                ni.f8 r0 = r0.O0     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x0332
                cm.l.v(r8)     // Catch:{ Exception -> 0x0642 }
                r0 = r7
            L_0x0332:
                android.widget.LinearLayout r0 = r0.f26297n     // Catch:{ Exception -> 0x0642 }
                r0.setVisibility(r3)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0345
            L_0x0338:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                ni.f8 r0 = r0.O0     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x0332
                cm.l.v(r8)     // Catch:{ Exception -> 0x0642 }
                r0 = r7
                goto L_0x0332
            L_0x0345:
                java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r9 = "rc_np_upto"
                boolean r0 = km.q.F(r0, r9, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x038b
                ka.c$a r0 = ka.c.f13158a     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r9 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r9 = r9.getRc_np_upto()     // Catch:{ Exception -> 0x0642 }
                boolean r0 = r0.m(r9)     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x0381
                com.nic.mparivahan.RC.Model.NrvDetails r0 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r0 = r0.getRc_np_upto()     // Catch:{ Exception -> 0x0642 }
                boolean r0 = km.p.o(r0, r5, r4)     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x0381
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.A2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r9 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r9 = r9.getRc_np_upto()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r9)     // Catch:{ Exception -> 0x0642 }
                goto L_0x038e
            L_0x0381:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
            L_0x0383:
                android.widget.LinearLayout r0 = r0.s2()     // Catch:{ Exception -> 0x0642 }
                r0.setVisibility(r3)     // Catch:{ Exception -> 0x0642 }
                goto L_0x038e
            L_0x038b:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                goto L_0x0383
            L_0x038e:
                java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r9 = "rc_norms_desc"
                boolean r0 = km.q.F(r0, r9, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x03f4
                ka.c$a r0 = ka.c.f13158a     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r3 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r3 = r3.getRc_norms_desc()     // Catch:{ Exception -> 0x0642 }
                boolean r0 = r0.m(r3)     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x03d2
                com.nic.mparivahan.RC.Model.NrvDetails r0 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r0 = r0.getRc_norms_desc()     // Catch:{ Exception -> 0x0642 }
                boolean r0 = km.p.o(r0, r5, r4)     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x03d2
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                ni.f8 r0 = r0.O0     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x03c4
                cm.l.v(r8)     // Catch:{ Exception -> 0x0642 }
                r0 = r7
            L_0x03c4:
                com.nic.mparivahan.MyTextView r0 = r0.H     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r3 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r3 = r3.getRc_norms_desc()     // Catch:{ Exception -> 0x0642 }
            L_0x03ce:
                r0.setText(r3)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0405
            L_0x03d2:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                ni.f8 r0 = r0.O0     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x03de
                cm.l.v(r8)     // Catch:{ Exception -> 0x0642 }
                r0 = r7
            L_0x03de:
                android.widget.LinearLayout r0 = r0.I     // Catch:{ Exception -> 0x0642 }
                r0.setVisibility(r2)     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                ni.f8 r0 = r0.O0     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x03ef
                cm.l.v(r8)     // Catch:{ Exception -> 0x0642 }
                r0 = r7
            L_0x03ef:
                com.nic.mparivahan.MyTextView r0 = r0.H     // Catch:{ Exception -> 0x0642 }
                java.lang.String r3 = "Not Available|Applicable"
                goto L_0x03ce
            L_0x03f4:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                ni.f8 r0 = r0.O0     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x0400
                cm.l.v(r8)     // Catch:{ Exception -> 0x0642 }
                r0 = r7
            L_0x0400:
                android.widget.LinearLayout r0 = r0.I     // Catch:{ Exception -> 0x0642 }
                r0.setVisibility(r3)     // Catch:{ Exception -> 0x0642 }
            L_0x0405:
                java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r3 = "rc_pucc_upto"
                boolean r0 = km.q.F(r0, r3, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x046c
                ka.c$a r0 = ka.c.f13158a     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r3 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r3 = r3.getRc_pucc_upto()     // Catch:{ Exception -> 0x0642 }
                boolean r0 = r0.m(r3)     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x0462
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                java.lang.String r0 = r0.K2()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r3 = "PUCC003"
                boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x0450
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.V2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r3 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r3 = r3.getRc_pucc_upto()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r3)     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.V2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.SearchRC r3 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                int r1 = androidx.core.content.a.c(r3, r1)     // Catch:{ Exception -> 0x0642 }
                r0.setTextColor(r1)     // Catch:{ Exception -> 0x0642 }
                goto L_0x046f
            L_0x0450:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.V2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r1 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = r1.getRc_pucc_upto()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r1)     // Catch:{ Exception -> 0x0642 }
                goto L_0x046f
            L_0x0462:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
            L_0x0464:
                android.widget.TextView r0 = r0.V2()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r5)     // Catch:{ Exception -> 0x0642 }
                goto L_0x046f
            L_0x046c:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                goto L_0x0464
            L_0x046f:
                java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = "rc_status"
                boolean r0 = km.q.F(r0, r1, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x04c0
                com.nic.mparivahan.RC.Model.NrvDetails r0 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r0 = r0.getRc_status()     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x04b6
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.b3()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r1 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = r1.getRc_status()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r1)     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r0 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r0 = r0.getRc_status()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = "Fitness Expired"
                boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x04c3
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.b3()     // Catch:{ Exception -> 0x0642 }
                r1 = -65536(0xffffffffffff0000, float:NaN)
                r0.setTextColor(r1)     // Catch:{ Exception -> 0x0642 }
                goto L_0x04c3
            L_0x04b6:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
            L_0x04b8:
                android.widget.TextView r0 = r0.b3()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r5)     // Catch:{ Exception -> 0x0642 }
                goto L_0x04c3
            L_0x04c0:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                goto L_0x04b8
            L_0x04c3:
                java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = "rc_registered_at"
                boolean r0 = km.q.F(r0, r1, r2, r6, r7)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x04f5
                com.nic.mparivahan.RC.Model.NrvDetails r0 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r0 = r0.getRc_registered_at()     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x04eb
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.TextView r0 = r0.W2()     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.Model.NrvDetails r1 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = r1.getRc_registered_at()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r1)     // Catch:{ Exception -> 0x0642 }
                goto L_0x04f8
            L_0x04eb:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
            L_0x04ed:
                android.widget.TextView r0 = r0.W2()     // Catch:{ Exception -> 0x0642 }
                r0.setText(r5)     // Catch:{ Exception -> 0x0642 }
                goto L_0x04f8
            L_0x04f5:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                goto L_0x04ed
            L_0x04f8:
                com.nic.mparivahan.RC.Model.NrvDetails r0 = r11.getNrvDetails()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r0 = r0.getRc_regn_dt()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0642 }
                java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0642 }
                java.lang.String r2 = "dd-MMM-yyyy"
                r1.<init>(r2)     // Catch:{ Exception -> 0x0642 }
                java.util.Date r0 = r1.parse(r0)     // Catch:{ ParseException -> 0x0584 }
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ ParseException -> 0x0584 }
                int r0 = r1.k3(r0)     // Catch:{ ParseException -> 0x0584 }
                int r1 = r0 / 12
                int r0 = r0 % 12
                com.nic.mparivahan.RC.SearchRC r2 = r10.f9522e     // Catch:{ ParseException -> 0x0584 }
                android.widget.TextView r2 = r2.Z2()     // Catch:{ ParseException -> 0x0584 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ParseException -> 0x0584 }
                r3.<init>()     // Catch:{ ParseException -> 0x0584 }
                r3.append(r1)     // Catch:{ ParseException -> 0x0584 }
                java.lang.String r1 = " Years  & "
                r3.append(r1)     // Catch:{ ParseException -> 0x0584 }
                r3.append(r0)     // Catch:{ ParseException -> 0x0584 }
                java.lang.String r0 = " months"
                r3.append(r0)     // Catch:{ ParseException -> 0x0584 }
                java.lang.String r0 = r3.toString()     // Catch:{ ParseException -> 0x0584 }
                r2.setText(r0)     // Catch:{ ParseException -> 0x0584 }
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ ParseException -> 0x0584 }
                com.nic.mparivahan.DB.DatabaseHelper r0 = r0.U1()     // Catch:{ ParseException -> 0x0584 }
                com.nic.mparivahan.RC.Model.NrvDetails r1 = r11.getNrvDetails()     // Catch:{ ParseException -> 0x0584 }
                java.lang.String r1 = r1.getRc_regn_no()     // Catch:{ ParseException -> 0x0584 }
                int r0 = r0.s(r1)     // Catch:{ ParseException -> 0x0584 }
                java.lang.String r1 = "yyyyMMddHHmmss"
                if (r0 != 0) goto L_0x0586
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ ParseException -> 0x0584 }
                com.nic.mparivahan.DB.DatabaseHelper r2 = r0.U1()     // Catch:{ ParseException -> 0x0584 }
                com.nic.mparivahan.RC.Model.NrvDetails r0 = r11.getNrvDetails()     // Catch:{ ParseException -> 0x0584 }
                java.lang.String r3 = r0.getRc_regn_no()     // Catch:{ ParseException -> 0x0584 }
                com.nic.mparivahan.RC.Model.NrvDetails r0 = r11.getNrvDetails()     // Catch:{ ParseException -> 0x0584 }
                java.lang.String r4 = r0.getRc_owner_name()     // Catch:{ ParseException -> 0x0584 }
                java.lang.String r5 = "RC"
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x0584 }
                r0.<init>(r1)     // Catch:{ ParseException -> 0x0584 }
                java.util.Date r1 = new java.util.Date     // Catch:{ ParseException -> 0x0584 }
                r1.<init>()     // Catch:{ ParseException -> 0x0584 }
                java.lang.String r6 = r0.format(r1)     // Catch:{ ParseException -> 0x0584 }
                com.nic.mparivahan.RC.Model.NrvDetails r11 = r11.getNrvDetails()     // Catch:{ ParseException -> 0x0584 }
                java.lang.String r7 = r11.getRc_vh_class_desc()     // Catch:{ ParseException -> 0x0584 }
                r2.P0(r3, r4, r5, r6, r7)     // Catch:{ ParseException -> 0x0584 }
                goto L_0x0642
            L_0x0584:
                r11 = move-exception
                goto L_0x05af
            L_0x0586:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ ParseException -> 0x0584 }
                com.nic.mparivahan.DB.DatabaseHelper r0 = r0.U1()     // Catch:{ ParseException -> 0x0584 }
                com.nic.mparivahan.RC.Model.NrvDetails r2 = r11.getNrvDetails()     // Catch:{ ParseException -> 0x0584 }
                java.lang.String r2 = r2.getRc_regn_no()     // Catch:{ ParseException -> 0x0584 }
                java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x0584 }
                r3.<init>(r1)     // Catch:{ ParseException -> 0x0584 }
                java.util.Date r1 = new java.util.Date     // Catch:{ ParseException -> 0x0584 }
                r1.<init>()     // Catch:{ ParseException -> 0x0584 }
                java.lang.String r1 = r3.format(r1)     // Catch:{ ParseException -> 0x0584 }
                com.nic.mparivahan.RC.Model.NrvDetails r11 = r11.getNrvDetails()     // Catch:{ ParseException -> 0x0584 }
                java.lang.String r11 = r11.getRc_owner_name()     // Catch:{ ParseException -> 0x0584 }
                r0.K0(r2, r1, r11)     // Catch:{ ParseException -> 0x0584 }
                goto L_0x0642
            L_0x05af:
                r11.printStackTrace()     // Catch:{ Exception -> 0x0642 }
                goto L_0x0642
            L_0x05b4:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.LinearLayout r0 = r0.v2()     // Catch:{ Exception -> 0x0642 }
                r0.setVisibility(r5)     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.content.Context r1 = r0.w2()     // Catch:{ Exception -> 0x0642 }
            L_0x05c3:
                java.lang.String r11 = r11.getStatusDesc()     // Catch:{ Exception -> 0x0642 }
                r0.A3(r1, r11)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0642
            L_0x05cc:
                java.lang.String r0 = r11.getStatusCode()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = "NR090"
                boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x05f1
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.LinearLayout r0 = r0.v2()     // Catch:{ Exception -> 0x0642 }
                r0.setVisibility(r5)     // Catch:{ Exception -> 0x0642 }
                v9.d$a r0 = v9.d.f17494a     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.content.Context r1 = r1.w2()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r11 = r11.getStatusDesc()     // Catch:{ Exception -> 0x0642 }
                r0.D(r1, r11, r4)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0642
            L_0x05f1:
                java.lang.String r0 = r11.getStatusCode()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = "NR091"
                boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0642 }
                if (r0 == 0) goto L_0x0616
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.LinearLayout r0 = r0.v2()     // Catch:{ Exception -> 0x0642 }
                r0.setVisibility(r5)     // Catch:{ Exception -> 0x0642 }
                v9.d$a r0 = v9.d.f17494a     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.SearchRC r1 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.content.Context r1 = r1.w2()     // Catch:{ Exception -> 0x0642 }
                java.lang.String r11 = r11.getStatusDesc()     // Catch:{ Exception -> 0x0642 }
                r0.D(r1, r11, r6)     // Catch:{ Exception -> 0x0642 }
                goto L_0x0642
            L_0x0616:
                ka.c$a r0 = ka.c.f13158a     // Catch:{ Exception -> 0x0642 }
                java.lang.String r1 = r11.getStatusDesc()     // Catch:{ Exception -> 0x0642 }
                boolean r0 = r0.m(r1)     // Catch:{ Exception -> 0x0642 }
                if (r0 != 0) goto L_0x0632
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.LinearLayout r0 = r0.v2()     // Catch:{ Exception -> 0x0642 }
                r0.setVisibility(r5)     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.content.Context r1 = r0.w2()     // Catch:{ Exception -> 0x0642 }
                goto L_0x05c3
            L_0x0632:
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.widget.LinearLayout r0 = r0.v2()     // Catch:{ Exception -> 0x0642 }
                r0.setVisibility(r5)     // Catch:{ Exception -> 0x0642 }
                com.nic.mparivahan.RC.SearchRC r0 = r10.f9522e     // Catch:{ Exception -> 0x0642 }
                android.content.Context r1 = r0.w2()     // Catch:{ Exception -> 0x0642 }
                goto L_0x05c3
            L_0x0642:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.RC.SearchRC.g.b(com.nic.mparivahan.RC.Model.RcModelsDet):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RcModelsDet) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchRC f9523e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SearchRC searchRC) {
            super(1);
            this.f9523e = searchRC;
        }

        public final void b(String str) {
            SearchRC searchRC = this.f9523e;
            searchRC.A3(searchRC.w2(), "Try after some time");
            this.f9523e.C2().cancel();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class i extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchRC f9524e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(SearchRC searchRC) {
            super(1);
            this.f9524e = searchRC;
        }

        public final void b(GetStateCode getStateCode) {
            if (getStateCode != null) {
                try {
                    if (!ka.c.f13158a.m(getStateCode.getStateCd())) {
                        this.f9524e.r4(getStateCode.getStateCd());
                        this.f9524e.e4(String.valueOf(getStateCode.getOffCd()));
                        this.f9524e.y2().m(String.valueOf(this.f9524e.F2().getNrvDetails().getRc_regn_no()), this.f9524e.M2().k().toString(), this.f9524e.O1().getText().toString(), this.f9524e.X1().getText().toString(), this.f9524e, v9.d.f17494a.r());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetStateCode) obj);
            return x.f30437a;
        }
    }

    static final class j extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchRC f9525e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(SearchRC searchRC) {
            super(1);
            this.f9525e = searchRC;
        }

        public final void b(String str) {
            this.f9525e.C2().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class k implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f9526a;

        k(bm.l lVar) {
            l.f(lVar, "function");
            this.f9526a = lVar;
        }

        public final pl.c a() {
            return this.f9526a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9526a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void B3(Dialog dialog, SearchRC searchRC, View view) {
        l.f(dialog, "$d");
        l.f(searchRC, "this$0");
        dialog.dismiss();
        BottomSheetBehavior bottomSheetBehavior = null;
        searchRC.O1().setText((CharSequence) null);
        searchRC.X1().setText((CharSequence) null);
        searchRC.O1().requestFocus();
        BottomSheetBehavior bottomSheetBehavior2 = searchRC.f9498i0;
        if (bottomSheetBehavior2 == null) {
            l.v("bottomSheetBehavior");
            bottomSheetBehavior2 = null;
        }
        if (bottomSheetBehavior2.t0() == 3) {
            BottomSheetBehavior bottomSheetBehavior3 = searchRC.f9498i0;
            if (bottomSheetBehavior3 == null) {
                l.v("bottomSheetBehavior");
            } else {
                bottomSheetBehavior = bottomSheetBehavior3;
            }
            bottomSheetBehavior.U0(4);
        }
    }

    /* access modifiers changed from: private */
    public final void J1() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            Object systemService = getSystemService("input_method");
            l.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    public static final void L1(Dialog dialog, SearchRC searchRC, RcModelsDet rcModelsDet, String str, View view) {
        l.f(dialog, "$d");
        l.f(searchRC, "this$0");
        l.f(rcModelsDet, "$details");
        l.f(str, "$doc_id");
        dialog.dismiss();
        try {
            searchRC.U1().O0(rcModelsDet.getNrvDetails().getRc_regn_no(), str, rcModelsDet.getNrvDetails(), 0);
            Intent intent = new Intent(searchRC, VirtualRcScreen.class);
            intent.putExtra("RcNumber", rcModelsDet.getNrvDetails().getRc_regn_no());
            searchRC.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void R4(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void b2() {
        View findViewById = findViewById(R.id.owner_name_txt);
        l.e(findViewById, "findViewById(...)");
        z4((TextView) findViewById);
        View findViewById2 = findViewById(R.id.registering_auth_txt);
        l.e(findViewById2, "findViewById(...)");
        B4((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.vehicle_class_txt);
        l.e(findViewById3, "findViewById(...)");
        F4((TextView) findViewById3);
        View findViewById4 = findViewById(R.id.fuel_type_txt);
        l.e(findViewById4, "findViewById(...)");
        x4((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.vehicle_age_txt);
        l.e(findViewById5, "findViewById(...)");
        E4((TextView) findViewById5);
        View findViewById6 = findViewById(R.id.rc_status_text);
        l.e(findViewById6, "findViewById(...)");
        G4((TextView) findViewById6);
        View findViewById7 = findViewById(R.id.registration_dt_txt);
        l.e(findViewById7, "findViewById(...)");
        C4((TextView) findViewById7);
        View findViewById8 = findViewById(R.id.fitness_txt);
        l.e(findViewById8, "findViewById(...)");
        w4((TextView) findViewById8);
        View findViewById9 = findViewById(R.id.pucc_txt);
        l.e(findViewById9, "findViewById(...)");
        A4((TextView) findViewById9);
        View findViewById10 = findViewById(R.id.txt_rc_black_list);
        l.e(findViewById10, "findViewById(...)");
        v4((TextView) findViewById10);
        View findViewById11 = findViewById(R.id.ll_black_list);
        l.e(findViewById11, "findViewById(...)");
        R3((LinearLayout) findViewById11);
        View findViewById12 = findViewById(R.id.tax_txt_valid);
        l.e(findViewById12, "findViewById(...)");
        D4((TextView) findViewById12);
        View findViewById13 = findViewById(R.id.insurance_txt);
        l.e(findViewById13, "findViewById(...)");
        y4((TextView) findViewById13);
        View findViewById14 = findViewById(R.id.et_search_rc);
        l.e(findViewById14, "findViewById(...)");
        P3((EditText) findViewById14);
        View findViewById15 = findViewById(R.id.ll_search_rc);
        l.e(findViewById15, "findViewById(...)");
        W3((LinearLayout) findViewById15);
        View findViewById16 = findViewById(R.id.nexgenarrow);
        l.e(findViewById16, "findViewById(...)");
        d4((LinearLayout) findViewById16);
        View findViewById17 = findViewById(R.id.createvirtualrc);
        l.e(findViewById17, "findViewById(...)");
        H3((LinearLayout) findViewById17);
        View findViewById18 = findViewById(R.id.viewChallan);
        l.e(findViewById18, "findViewById(...)");
        N4((LinearLayout) findViewById18);
        View findViewById19 = findViewById(R.id.bottom);
        l.e(findViewById19, "findViewById(...)");
        C3((CoordinatorLayout) findViewById19);
        View findViewById20 = findViewById(R.id.createvirtualrcbutton);
        l.e(findViewById20, "findViewById(...)");
        I3((TextView) findViewById20);
        View findViewById21 = findViewById(R.id.closebutton);
        l.e(findViewById21, "findViewById(...)");
        G3((TextView) findViewById21);
        View findViewById22 = findViewById(R.id.linear_menu_bar);
        l.e(findViewById22, "findViewById(...)");
        S3((LinearLayout) findViewById22);
        View findViewById23 = findViewById(R.id.redirect_DashBoard);
        l.e(findViewById23, "findViewById(...)");
        k4((LinearLayout) findViewById23);
        View findViewById24 = findViewById(R.id.redirect_Rcdashboard);
        l.e(findViewById24, "findViewById(...)");
        l4((LinearLayout) findViewById24);
        View findViewById25 = findViewById(R.id.dl_dashboard);
        l.e(findViewById25, "findViewById(...)");
        K3((LinearLayout) findViewById25);
        View findViewById26 = findViewById(R.id.chassis_no_txt);
        l.e(findViewById26, "findViewById(...)");
        F3((TextView) findViewById26);
        View findViewById27 = findViewById(R.id.engine_no_txt);
        l.e(findViewById27, "findViewById(...)");
        N3((TextView) findViewById27);
        View findViewById28 = findViewById(R.id.chassis_no_et);
        l.e(findViewById28, "findViewById(...)");
        E3((EditText) findViewById28);
        View findViewById29 = findViewById(R.id.engine_no_et);
        l.e(findViewById29, "findViewById(...)");
        M3((EditText) findViewById29);
        View findViewById30 = findViewById(R.id.tv_chassi_no);
        l.e(findViewById30, "findViewById(...)");
        t4((TextView) findViewById30);
        View findViewById31 = findViewById(R.id.tv_engine_no);
        l.e(findViewById31, "findViewById(...)");
        u4((TextView) findViewById31);
        View findViewById32 = findViewById(R.id.ll_rec_search);
        l.e(findViewById32, "findViewById(...)");
        V3((LinearLayout) findViewById32);
        View findViewById33 = findViewById(R.id.vehicle_number);
        l.e(findViewById33, "findViewById(...)");
        M4((TextView) findViewById33);
        View findViewById34 = findViewById(R.id.linear_permit_number);
        l.e(findViewById34, "findViewById(...)");
        T3((LinearLayout) findViewById34);
        View findViewById35 = findViewById(R.id.linear_permit_validUpto);
        l.e(findViewById35, "findViewById(...)");
        U3((LinearLayout) findViewById35);
        View findViewById36 = findViewById(R.id.national_permit_no);
        l.e(findViewById36, "findViewById(...)");
        b4((TextView) findViewById36);
        View findViewById37 = findViewById(R.id.national_permit_no_valid_upto);
        l.e(findViewById37, "findViewById(...)");
        c4((TextView) findViewById37);
        View findViewById38 = findViewById(R.id.ll_rc);
        l.e(findViewById38, "findViewById(...)");
        X3((LinearLayout) findViewById38);
        View findViewById39 = findViewById(R.id.title_name);
        l.e(findViewById39, "findViewById(...)");
        s4((TextView) findViewById39);
        View findViewById40 = findViewById(R.id.insurance_title);
        l.e(findViewById40, "findViewById(...)");
        Q3((TextView) findViewById40);
        View findViewById41 = findViewById(R.id.pucc_title);
        l.e(findViewById41, "findViewById(...)");
        h4((TextView) findViewById41);
        View findViewById42 = findViewById(R.id.txt_check_impound);
        l.e(findViewById42, "findViewById(...)");
        H4((TextView) findViewById42);
        View findViewById43 = findViewById(R.id.vehicleImpoundLl);
        l.e(findViewById43, "findViewById(...)");
        L4((LinearLayout) findViewById43);
        View findViewById44 = findViewById(R.id.txt_vehicle_impound_value);
        l.e(findViewById44, "findViewById(...)");
        J4((TextView) findViewById44);
        View findViewById45 = findViewById(R.id.seizureImpoundLl);
        l.e(findViewById45, "findViewById(...)");
        n4((LinearLayout) findViewById45);
        View findViewById46 = findViewById(R.id.txt_seizure_impound_value);
        l.e(findViewById46, "findViewById(...)");
        I4((LinearLayout) findViewById46);
        v2().setVisibility(8);
        O2().setText(L2().b("label_challan_chassis_no", "Chassis No. ( Enter last five digits )"));
        P2().setText(L2().b("label_challan_engine_no", getString(R.string.enter_five_engine_no)));
        Q1().setText(L2().b("btn_dl_serv_close", "Close"));
        B2().setOnClickListener(new l0(this));
        c3().setOnClickListener(new n0(this));
        O1().addTextChangedListener(new a(this));
        H2().setOnClickListener(new o0(this));
        V1().setOnClickListener(new p0(this));
        Integer R1 = R1();
        l.c(R1);
        int intValue = R1.intValue();
        q2().setVisibility(8);
        BottomSheetBehavior q02 = BottomSheetBehavior.q0(M1());
        l.e(q02, "from(...)");
        this.f9498i0 = q02;
        if (q02 == null) {
            l.v("bottomSheetBehavior");
            q02 = null;
        }
        q02.c0(new b(this));
        View findViewById47 = findViewById(R.id.ll_rc);
        l.e(findViewById47, "findViewById(...)");
        X3((LinearLayout) findViewById47);
        v2().setVisibility(4);
        T1().setOnClickListener(new r0(this));
        G2().setOnClickListener(new s0(this));
        B2().setOnClickListener(new t0(this));
        Q1().setOnClickListener(new u0(this));
        S1().setOnClickListener(new v0(this));
        h3().setOnClickListener(new w0(this));
        u2().setOnClickListener(new m0(this));
    }

    /* access modifiers changed from: private */
    public static final void c2(SearchRC searchRC, View view) {
        l.f(searchRC, "this$0");
        searchRC.finish();
    }

    /* access modifiers changed from: private */
    public static final void d2(SearchRC searchRC, View view) {
        l.f(searchRC, "this$0");
        try {
            if (searchRC.C2().isShowing()) {
                searchRC.C2().dismiss();
            }
            searchRC.C2().show();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rc_no", (Object) String.valueOf(searchRC.F2().getNrvDetails().getRc_regn_no()));
            searchRC.E2().j(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        searchRC.W0.clear();
        searchRC.V0.clear();
    }

    /* access modifiers changed from: private */
    public static final void e2(SearchRC searchRC, View view) {
        l.f(searchRC, "this$0");
        searchRC.startActivity(new Intent(searchRC, RCDashBoard.class));
        searchRC.finish();
    }

    /* access modifiers changed from: private */
    public static final void f2(SearchRC searchRC, View view) {
        l.f(searchRC, "this$0");
        searchRC.startActivity(new Intent(searchRC, SearchDL.class));
        searchRC.finish();
    }

    /* access modifiers changed from: private */
    public static final void g2(SearchRC searchRC, View view) {
        Context applicationContext;
        ld.c L2;
        String str;
        String str2;
        l.f(searchRC, "this$0");
        String obj = searchRC.O1().getText().toString();
        String obj2 = searchRC.X1().getText().toString();
        if (obj.length() < 5) {
            applicationContext = searchRC.getApplicationContext();
            L2 = searchRC.L2();
            str = "label_challan_valid_chassis_no";
            str2 = "Please enter the valid last 5 digit of chassis no.";
        } else if (obj2.length() < 5) {
            applicationContext = searchRC.getApplicationContext();
            L2 = searchRC.L2();
            str = "label_challan_valid_engine_no";
            str2 = "Please enter the valid last 5 digit of engine no";
        } else {
            searchRC.C2().show();
            if (searchRC.D2().c() == 2) {
                searchRC.j3().n(searchRC, searchRC.e3());
                return;
            }
            searchRC.y2().m(String.valueOf(searchRC.F2().getNrvDetails().getRc_regn_no()), searchRC.M2().k().toString(), obj, obj2, searchRC, v9.d.f17494a.r());
            return;
        }
        Toast.makeText(applicationContext, L2.b(str, str2), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void h2(SearchRC searchRC, View view) {
        l.f(searchRC, "this$0");
        searchRC.finish();
    }

    /* access modifiers changed from: private */
    public static final void i2(SearchRC searchRC, View view) {
        l.f(searchRC, "this$0");
        searchRC.finish();
    }

    /* access modifiers changed from: private */
    public static final void j2(SearchRC searchRC, View view) {
        l.f(searchRC, "this$0");
        BottomSheetBehavior bottomSheetBehavior = searchRC.f9498i0;
        BottomSheetBehavior bottomSheetBehavior2 = null;
        if (bottomSheetBehavior == null) {
            l.v("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        int t02 = bottomSheetBehavior.t0();
        BottomSheetBehavior bottomSheetBehavior3 = searchRC.f9498i0;
        if (t02 == 3) {
            if (bottomSheetBehavior3 == null) {
                l.v("bottomSheetBehavior");
            } else {
                bottomSheetBehavior2 = bottomSheetBehavior3;
            }
            bottomSheetBehavior2.U0(4);
            return;
        }
        if (bottomSheetBehavior3 == null) {
            l.v("bottomSheetBehavior");
        } else {
            bottomSheetBehavior2 = bottomSheetBehavior3;
        }
        bottomSheetBehavior2.U0(3);
    }

    /* access modifiers changed from: private */
    public static final void k2(SearchRC searchRC, View view) {
        l.f(searchRC, "this$0");
        try {
            searchRC.P1().setText(searchRC.N1().subSequence(0, searchRC.N1().length() - 5));
            searchRC.Y1().setText(searchRC.Z1().subSequence(0, searchRC.Z1().length() - 5));
        } catch (Exception unused) {
        }
        BottomSheetBehavior bottomSheetBehavior = searchRC.f9498i0;
        BottomSheetBehavior bottomSheetBehavior2 = null;
        if (bottomSheetBehavior == null) {
            l.v("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        if (bottomSheetBehavior.t0() == 3) {
            return;
        }
        if (!searchRC.U1().s0(String.valueOf(searchRC.F2().getNrvDetails().getRc_regn_no())).equals("0")) {
            searchRC.Q4(searchRC, searchRC.L2().b("create_vir_rc_already", "You have already created the Virtual RC"));
            return;
        }
        searchRC.T1().setText(searchRC.L2().b("create_vir_rc", "Create Virtual RC"));
        BottomSheetBehavior bottomSheetBehavior3 = searchRC.f9498i0;
        if (bottomSheetBehavior3 == null) {
            l.v("bottomSheetBehavior");
        } else {
            bottomSheetBehavior2 = bottomSheetBehavior3;
        }
        bottomSheetBehavior2.U0(3);
        searchRC.S1().setEnabled(true);
        searchRC.H0 = 0;
    }

    /* access modifiers changed from: private */
    public static final void l2(SearchRC searchRC, View view) {
        l.f(searchRC, "this$0");
        try {
            searchRC.P1().setText(searchRC.N1().subSequence(0, searchRC.N1().length() - 5));
            searchRC.Y1().setText(searchRC.Z1().subSequence(0, searchRC.Z1().length() - 5));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        BottomSheetBehavior bottomSheetBehavior = searchRC.f9498i0;
        BottomSheetBehavior bottomSheetBehavior2 = null;
        if (bottomSheetBehavior == null) {
            l.v("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        if (bottomSheetBehavior.t0() == 3) {
            return;
        }
        if (!searchRC.U1().s0(String.valueOf(searchRC.F2().getNrvDetails().getRc_regn_no())).equals("0")) {
            Intent intent = new Intent(searchRC, ViewRcChallanActivity.class);
            intent.putExtra("rcNo", String.valueOf(searchRC.F2().getNrvDetails().getRc_regn_no()));
            intent.putExtra("type", "RC");
            searchRC.startActivity(intent);
            return;
        }
        searchRC.T1().setText(searchRC.L2().b("label_view_challan", "View Challan"));
        BottomSheetBehavior bottomSheetBehavior3 = searchRC.f9498i0;
        if (bottomSheetBehavior3 == null) {
            l.v("bottomSheetBehavior");
        } else {
            bottomSheetBehavior2 = bottomSheetBehavior3;
        }
        bottomSheetBehavior2.U0(3);
        searchRC.h3().setEnabled(true);
        searchRC.H0 = 1;
    }

    /* access modifiers changed from: private */
    public static final void l3(SearchRC searchRC, String str) {
        l.f(searchRC, "this$0");
        searchRC.A3(searchRC.w2(), searchRC.L2().b(v9.f.f17510a.K0(), "Unable to create the virtual RC, Please try after some time"));
        searchRC.C2().cancel();
    }

    /* access modifiers changed from: private */
    public static final void m2(SearchRC searchRC, View view) {
        l.f(searchRC, "this$0");
        String e32 = searchRC.e3();
        if (e32 != null && e32.length() != 0) {
            searchRC.C2().show();
            searchRC.y2().N(searchRC.a2().getText().toString(), searchRC.M2().k(), searchRC);
        }
    }

    /* access modifiers changed from: private */
    public static final void m3(SearchRC searchRC, SendOtpResult sendOtpResult) {
        l.f(searchRC, "this$0");
        try {
            searchRC.C2().dismiss();
            if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                ld.g gVar = new ld.g(searchRC);
                if (searchRC.D2().c() != 2) {
                    searchRC.f9490b1 = gVar.l();
                }
                searchRC.U0 = yc.i.f18692a.m(searchRC, searchRC, searchRC.f9490b1, searchRC.i3(), String.valueOf(sendOtpResult.getRecordId()), String.valueOf(searchRC.F2().getNrvDetails().getRc_regn_no()), "RC", " ", searchRC.C2());
            } else if (!ka.c.f13158a.m(sendOtpResult.getStatusDesc())) {
                searchRC.A3(searchRC, sendOtpResult.getStatusDesc());
            }
        } catch (Exception unused) {
            searchRC.C2().dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void n3(SearchRC searchRC, String str) {
        l.f(searchRC, "this$0");
        searchRC.C2().dismiss();
        Toast.makeText(searchRC.getApplicationContext(), "Unable to create the virtual Rc, Please try after sometime!", 1).show();
    }

    /* access modifiers changed from: private */
    public static final void o3(SearchRC searchRC, String str) {
        l.f(searchRC, "this$0");
        try {
            if (!ka.c.f13158a.m(str)) {
                searchRC.f9490b1 = str.toString();
                searchRC.i3().G(searchRC, searchRC.f9490b1, 1);
                return;
            }
            searchRC.C2().dismiss();
            yc.i.f18692a.i(searchRC, new ld.c(searchRC).b("validateMobile", searchRC.getString(R.string.validate1)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void p3(SearchRC searchRC, String str) {
        l.f(searchRC, "this$0");
        searchRC.C2().dismiss();
        if (p.o(str, "Error", true)) {
            Toast.makeText(searchRC.getApplicationContext(), "Unable to create the virtual Rc, Please try after sometime!", 1).show();
            return;
        }
        yc.i.f18692a.i(searchRC, new ld.c(searchRC).b("validateMobile", searchRC.getString(R.string.validate1)));
    }

    /* access modifiers changed from: private */
    public static final void q3(String str) {
    }

    /* access modifiers changed from: private */
    public static final void r3(SearchRC searchRC, CitzValidDoc citzValidDoc) {
        l.f(searchRC, "this$0");
        try {
            Long l10 = null;
            if (p.p(citzValidDoc.getStatusCode(), "AL001", false, 2, (Object) null)) {
                c.a aVar = ka.c.f13158a;
                if (aVar.m(citzValidDoc.getParam())) {
                    Dialog dialog = searchRC.U0;
                    if (dialog != null) {
                        l.c(dialog);
                        dialog.dismiss();
                        CitizenDocInfoX citizenDocInfo = citzValidDoc.getCitizenDocInfo();
                        if (citizenDocInfo != null) {
                            l10 = citizenDocInfo.getDocId();
                        }
                        searchRC.L3(String.valueOf(l10));
                        searchRC.y2().X(searchRC.M2().k(), searchRC.w2());
                        return;
                    }
                    return;
                }
                if (searchRC.C2().isShowing()) {
                    searchRC.C2().dismiss();
                }
                if (!aVar.m(citzValidDoc.getParam())) {
                    Dialog dialog2 = searchRC.U0;
                    if (dialog2 != null) {
                        l.c(dialog2);
                        dialog2.dismiss();
                    }
                    searchRC.A3(searchRC, citzValidDoc.getParam());
                    return;
                }
                if (searchRC.C2().isShowing()) {
                    searchRC.C2().dismiss();
                }
                searchRC.A3(searchRC.w2(), searchRC.L2().b(v9.f.f17510a.K0(), "Unable to create the virtual RC, Please try after some time"));
                return;
            }
            if (searchRC.C2().isShowing()) {
                searchRC.C2().dismiss();
            }
            Toast.makeText(searchRC, citzValidDoc.getStatusDesc(), 1).show();
        } catch (Exception unused) {
            if (searchRC.C2().isShowing()) {
                searchRC.C2().dismiss();
            }
            Dialog dialog3 = searchRC.U0;
            if (dialog3 != null) {
                l.c(dialog3);
                dialog3.dismiss();
            }
            searchRC.A3(searchRC.w2(), searchRC.L2().b(v9.f.f17510a.K0(), "Unable to create the virtual RC, Please try after some time"));
        }
    }

    /* access modifiers changed from: private */
    public static final void s3(SearchRC searchRC, String str) {
        l.f(searchRC, "this$0");
        searchRC.C2().dismiss();
        Dialog dialog = searchRC.U0;
        if (dialog != null) {
            l.c(dialog);
            dialog.dismiss();
        }
        searchRC.A3(searchRC.w2(), searchRC.L2().b(v9.f.f17510a.K0(), "Unable to create the virtual RC, Please try after some time"));
    }

    /* access modifiers changed from: private */
    public static final void t3(SearchRC searchRC, GetVirtualDocDetails getVirtualDocDetails) {
        l.f(searchRC, "this$0");
        searchRC.C2().dismiss();
        if (!p.o(getVirtualDocDetails.getStatusCode(), "VTLD005", true)) {
            if (p.o(getVirtualDocDetails.getStatusCode(), "VTLD001", true)) {
                BottomSheetBehavior bottomSheetBehavior = searchRC.f9498i0;
                if (bottomSheetBehavior == null) {
                    l.v("bottomSheetBehavior");
                    bottomSheetBehavior = null;
                }
                if (bottomSheetBehavior.t0() == 3) {
                    BottomSheetBehavior bottomSheetBehavior2 = searchRC.f9498i0;
                    if (bottomSheetBehavior2 == null) {
                        l.v("bottomSheetBehavior");
                        bottomSheetBehavior2 = null;
                    }
                    bottomSheetBehavior2.U0(4);
                }
                ArrayList<MparCitizenDocInfo> mparCitizenDocInfo = getVirtualDocDetails.getMparCitizenDocInfo();
                int size = mparCitizenDocInfo.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    String obj = q.B0(mparCitizenDocInfo.get(i10).getDocNumber().toString()).toString();
                    String rc_regn_no = searchRC.F2().getNrvDetails().getRc_regn_no();
                    if (p.o(obj, rc_regn_no != null ? q.B0(rc_regn_no).toString() : null, true)) {
                        searchRC.L3(String.valueOf(mparCitizenDocInfo.get(i10).getDocId()));
                        break;
                    }
                    i10++;
                }
                if (!ka.c.f13158a.m(searchRC.W1())) {
                    searchRC.y2().o(searchRC.M2().k(), searchRC.W1().toString(), searchRC);
                    return;
                }
                return;
            } else if (!ka.c.f13158a.m(getVirtualDocDetails.getStatusDesc())) {
                searchRC.C2().dismiss();
            } else {
                searchRC.C2().dismiss();
                searchRC.A3(searchRC.w2(), "Unable to create the Virtual RC, Please try after some time!");
                return;
            }
        }
        searchRC.A3(searchRC.w2(), getVirtualDocDetails.getStatusDesc().toString());
    }

    /* access modifiers changed from: private */
    public static final void u3(SearchRC searchRC, RcModelsDet rcModelsDet) {
        l.f(searchRC, "this$0");
        if (searchRC.C2().isShowing()) {
            searchRC.C2().cancel();
        }
        try {
            if (p.o(rcModelsDet.getStatusCode(), "NP001", true)) {
                l.c(rcModelsDet);
                searchRC.j4(rcModelsDet);
                searchRC.K1(searchRC.w2(), "Virtual RC Successfully Created!", searchRC.F2(), searchRC.W1().toString());
            } else if (!ka.c.f13158a.m(rcModelsDet.getStatusDesc())) {
                searchRC.A3(searchRC.w2(), rcModelsDet.getStatusDesc());
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void v3(SearchRC searchRC, String str) {
        l.f(searchRC, "this$0");
        searchRC.C2().cancel();
        try {
            searchRC.A3(searchRC.w2(), "Unable to create the Virtual RC, Please try after some time!");
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void w3(SearchRC searchRC, String str) {
        l.f(searchRC, "this$0");
        searchRC.A3(searchRC.w2(), "Unable to create the Virtual RC, Please try after some time!");
        searchRC.C2().cancel();
    }

    /* access modifiers changed from: private */
    public static final void x3(SearchRC searchRC, ValidateRcSuccess validateRcSuccess) {
        l.f(searchRC, "this$0");
        if (!p.o(validateRcSuccess.getStatusCode(), "NP001", true)) {
            searchRC.C2().dismiss();
            Toast.makeText(searchRC.getApplicationContext(), validateRcSuccess.getStatusDesc(), 1).show();
        } else if (searchRC.H0 != 0) {
            searchRC.C2().dismiss();
            Intent intent = new Intent(searchRC, ViewRcChallanActivity.class);
            intent.putExtra("rcNo", String.valueOf(searchRC.F2().getNrvDetails().getRc_regn_no()));
            intent.putExtra("type", "RC");
            searchRC.startActivity(intent);
        } else if (searchRC.D2().c() == 2) {
            searchRC.j3().u0(searchRC, searchRC.e3(), searchRC.Z0, searchRC.O1().getText().toString(), searchRC.f9488a1);
        } else {
            searchRC.i3().G(searchRC, new ld.g(searchRC).l(), 2);
        }
    }

    /* access modifiers changed from: private */
    public static final void z3(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final TextView A2() {
        TextView textView = this.F0;
        if (textView != null) {
            return textView;
        }
        l.v("national_permit_no_valid_upto");
        return null;
    }

    public final void A3(Context context, String str) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(L2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(L2().b("btn_ok", "OK"));
        textView.setOnClickListener(new k0(dialog, this));
        dialog.show();
    }

    public final void A4(TextView textView) {
        l.f(textView, "<set-?>");
        this.f9489b0 = textView;
    }

    public final LinearLayout B2() {
        LinearLayout linearLayout = this.f9495f0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("nexgenarrow");
        return null;
    }

    public final void B4(TextView textView) {
        l.f(textView, "<set-?>");
        this.S = textView;
    }

    public final ProgressDialog C2() {
        ProgressDialog progressDialog = this.f9494e0;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final void C3(CoordinatorLayout coordinatorLayout) {
        l.f(coordinatorLayout, "<set-?>");
        this.f9499j0 = coordinatorLayout;
    }

    public final void C4(TextView textView) {
        l.f(textView, "<set-?>");
        this.X = textView;
    }

    public final ld.e D2() {
        ld.e eVar = this.f9492c1;
        if (eVar != null) {
            return eVar;
        }
        l.v("pSession");
        return null;
    }

    public final void D3(String str) {
        l.f(str, "<set-?>");
        this.f9511v0 = str;
    }

    public final void D4(TextView textView) {
        l.f(textView, "<set-?>");
        this.f9487a0 = textView;
    }

    public final cd.a E2() {
        cd.a aVar = this.I;
        if (aVar != null) {
            return aVar;
        }
        l.v("rcImpoundModel");
        return null;
    }

    public final void E3(EditText editText) {
        l.f(editText, "<set-?>");
        this.f9513x0 = editText;
    }

    public final void E4(TextView textView) {
        l.f(textView, "<set-?>");
        this.V = textView;
    }

    public final RcModelsDet F2() {
        RcModelsDet rcModelsDet = this.f9504o0;
        if (rcModelsDet != null) {
            return rcModelsDet;
        }
        l.v("rcdetails");
        return null;
    }

    public final void F3(TextView textView) {
        l.f(textView, "<set-?>");
        this.f9509t0 = textView;
    }

    public final void F4(TextView textView) {
        l.f(textView, "<set-?>");
        this.T = textView;
    }

    public final LinearLayout G2() {
        LinearLayout linearLayout = this.f9506q0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("redirect_DashBoard");
        return null;
    }

    public final void G3(TextView textView) {
        l.f(textView, "<set-?>");
        this.f9501l0 = textView;
    }

    public final void G4(TextView textView) {
        l.f(textView, "<set-?>");
        this.W = textView;
    }

    public final LinearLayout H2() {
        LinearLayout linearLayout = this.f9507r0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("redirect_Rcdashboard");
        return null;
    }

    public final void H3(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f9496g0 = linearLayout;
    }

    public final void H4(TextView textView) {
        l.f(textView, "<set-?>");
        this.I0 = textView;
    }

    public final VahanProService I2() {
        VahanProService vahanProService = this.Y0;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitServiceAddMob");
        return null;
    }

    public final void I3(TextView textView) {
        l.f(textView, "<set-?>");
        this.f9500k0 = textView;
    }

    public final void I4(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.M0 = linearLayout;
    }

    public final LinearLayout J2() {
        LinearLayout linearLayout = this.L0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("seizureImpoundLl");
        return null;
    }

    public final void J3(DatabaseHelper databaseHelper) {
        l.f(databaseHelper, "<set-?>");
        this.f9502m0 = databaseHelper;
    }

    public final void J4(TextView textView) {
        l.f(textView, "<set-?>");
        this.K0 = textView;
    }

    public void K(String str) {
        f4(new ProgressDialog(w2()));
        C2().setMessage(L2().b("label_challan_please_wait", "Please wait..."));
        C2().setCancelable(false);
        C2().setCanceledOnTouchOutside(false);
        C2().show();
        if (str != null) {
            y2().N(str, M2().k(), this);
        }
    }

    public final void K1(Context context, String str, RcModelsDet rcModelsDet, String str2) {
        l.f(rcModelsDet, "details");
        l.f(str2, "doc_id");
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(L2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(L2().b("btn_ok", "OK"));
        textView.setOnClickListener(new x0(dialog, this, rcModelsDet, str2));
        dialog.show();
    }

    public final String K2() {
        String str = this.G0;
        if (str != null) {
            return str;
        }
        l.v("service");
        return null;
    }

    public final void K3(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f9508s0 = linearLayout;
    }

    public final void K4(String str) {
        l.f(str, "<set-?>");
        this.N0 = str;
    }

    public final ld.c L2() {
        ld.c cVar = this.P0;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }

    public final void L3(String str) {
        l.f(str, "<set-?>");
        this.A0 = str;
    }

    public final void L4(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.J0 = linearLayout;
    }

    public final CoordinatorLayout M1() {
        CoordinatorLayout coordinatorLayout = this.f9499j0;
        if (coordinatorLayout != null) {
            return coordinatorLayout;
        }
        l.v("bottom");
        return null;
    }

    public final ld.g M2() {
        ld.g gVar = this.f9503n0;
        if (gVar != null) {
            return gVar;
        }
        l.v("sessionManager");
        return null;
    }

    public final void M3(EditText editText) {
        l.f(editText, "<set-?>");
        this.f9514y0 = editText;
    }

    public final void M4(TextView textView) {
        l.f(textView, "<set-?>");
        this.B0 = textView;
    }

    public final String N1() {
        String str = this.f9511v0;
        if (str != null) {
            return str;
        }
        l.v("chassino");
        return null;
    }

    public final TextView N2() {
        TextView textView = this.P;
        if (textView != null) {
            return textView;
        }
        l.v("title_name");
        return null;
    }

    public final void N3(TextView textView) {
        l.f(textView, "<set-?>");
        this.f9510u0 = textView;
    }

    public final void N4(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f9497h0 = linearLayout;
    }

    public final EditText O1() {
        EditText editText = this.f9513x0;
        if (editText != null) {
            return editText;
        }
        l.v("chassis_no_et");
        return null;
    }

    public final TextView O2() {
        TextView textView = this.Q0;
        if (textView != null) {
            return textView;
        }
        l.v("tv_chassis_no");
        return null;
    }

    public final void O3(String str) {
        l.f(str, "<set-?>");
        this.f9512w0 = str;
    }

    public final void O4(v8.h hVar) {
        l.f(hVar, "<set-?>");
        this.S0 = hVar;
    }

    public final TextView P1() {
        TextView textView = this.f9509t0;
        if (textView != null) {
            return textView;
        }
        l.v("chassis_no_txt");
        return null;
    }

    public final TextView P2() {
        TextView textView = this.R0;
        if (textView != null) {
            return textView;
        }
        l.v("tv_engine_no");
        return null;
    }

    public final void P3(EditText editText) {
        l.f(editText, "<set-?>");
        this.L = editText;
    }

    public final void P4(bi.h hVar) {
        l.f(hVar, "<set-?>");
        this.X0 = hVar;
    }

    public final TextView Q1() {
        TextView textView = this.f9501l0;
        if (textView != null) {
            return textView;
        }
        l.v("closebutton");
        return null;
    }

    public final TextView Q2() {
        TextView textView = this.f9491c0;
        if (textView != null) {
            return textView;
        }
        l.v("txtBlackListStatus");
        return null;
    }

    public final void Q3(TextView textView) {
        l.f(textView, "<set-?>");
        this.Q = textView;
    }

    public final void Q4(Context context, String str) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new y0(dialog));
        dialog.show();
    }

    public final Integer R1() {
        int i10;
        try {
            i10 = U1().B0();
        } catch (Exception unused) {
            i10 = 0;
        }
        return Integer.valueOf(i10);
    }

    public final TextView R2() {
        TextView textView = this.Y;
        if (textView != null) {
            return textView;
        }
        l.v("txtFitnessUpTo");
        return null;
    }

    public final void R3(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f9493d0 = linearLayout;
    }

    public final LinearLayout S1() {
        LinearLayout linearLayout = this.f9496g0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("createvirtualrc");
        return null;
    }

    public final TextView S2() {
        TextView textView = this.U;
        if (textView != null) {
            return textView;
        }
        l.v("txtFuelType");
        return null;
    }

    public final void S3(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f9505p0 = linearLayout;
    }

    public final TextView T1() {
        TextView textView = this.f9500k0;
        if (textView != null) {
            return textView;
        }
        l.v("createvirtualrcbutton");
        return null;
    }

    public final TextView T2() {
        TextView textView = this.Z;
        if (textView != null) {
            return textView;
        }
        l.v("txtInsuranceUpTo");
        return null;
    }

    public final void T3(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.C0 = linearLayout;
    }

    public final DatabaseHelper U1() {
        DatabaseHelper databaseHelper = this.f9502m0;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        l.v("databaseHelper");
        return null;
    }

    public final TextView U2() {
        TextView textView = this.O;
        if (textView != null) {
            return textView;
        }
        l.v("txtOwnerName");
        return null;
    }

    public final void U3(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.D0 = linearLayout;
    }

    public final LinearLayout V1() {
        LinearLayout linearLayout = this.f9508s0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("dl_dashboard");
        return null;
    }

    public final TextView V2() {
        TextView textView = this.f9489b0;
        if (textView != null) {
            return textView;
        }
        l.v("txtPuccUpTo");
        return null;
    }

    public final void V3(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f9515z0 = linearLayout;
    }

    public final String W1() {
        String str = this.A0;
        if (str != null) {
            return str;
        }
        l.v("doc_id");
        return null;
    }

    public final TextView W2() {
        TextView textView = this.S;
        if (textView != null) {
            return textView;
        }
        l.v("txtRegAuthority");
        return null;
    }

    public final void W3(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.M = linearLayout;
    }

    public final EditText X1() {
        EditText editText = this.f9514y0;
        if (editText != null) {
            return editText;
        }
        l.v("engine_no_et");
        return null;
    }

    public final TextView X2() {
        TextView textView = this.X;
        if (textView != null) {
            return textView;
        }
        l.v("txtRegDate");
        return null;
    }

    public final void X3(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.N = linearLayout;
    }

    public final TextView Y1() {
        TextView textView = this.f9510u0;
        if (textView != null) {
            return textView;
        }
        l.v("engine_no_txt");
        return null;
    }

    public final TextView Y2() {
        TextView textView = this.f9487a0;
        if (textView != null) {
            return textView;
        }
        l.v("txtTaxValidUpTo");
        return null;
    }

    public final void Y3(Context context) {
        l.f(context, "<set-?>");
        this.K = context;
    }

    public final String Z1() {
        String str = this.f9512w0;
        if (str != null) {
            return str;
        }
        l.v("enginno");
        return null;
    }

    public final TextView Z2() {
        TextView textView = this.V;
        if (textView != null) {
            return textView;
        }
        l.v("txtVehicleAge");
        return null;
    }

    public final void Z3(RcService rcService) {
        l.f(rcService, "<set-?>");
        this.H = rcService;
    }

    public final EditText a2() {
        EditText editText = this.L;
        if (editText != null) {
            return editText;
        }
        l.v("etSearchRC");
        return null;
    }

    public final TextView a3() {
        TextView textView = this.T;
        if (textView != null) {
            return textView;
        }
        l.v("txtVehicleClass");
        return null;
    }

    public final void a4(cd.c cVar) {
        l.f(cVar, "<set-?>");
        this.G = cVar;
    }

    public final TextView b3() {
        TextView textView = this.W;
        if (textView != null) {
            return textView;
        }
        l.v("txtVeicleStatus");
        return null;
    }

    public final void b4(TextView textView) {
        l.f(textView, "<set-?>");
        this.E0 = textView;
    }

    public final TextView c3() {
        TextView textView = this.I0;
        if (textView != null) {
            return textView;
        }
        l.v("txt_check_impound");
        return null;
    }

    public final void c4(TextView textView) {
        l.f(textView, "<set-?>");
        this.F0 = textView;
    }

    public final LinearLayout d3() {
        LinearLayout linearLayout = this.M0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("txt_seizure_impound_value");
        return null;
    }

    public final void d4(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f9495f0 = linearLayout;
    }

    public final String e3() {
        String str = this.N0;
        if (str != null) {
            return str;
        }
        l.v("var_rc_value");
        return null;
    }

    public final void e4(String str) {
        l.f(str, "<set-?>");
        this.f9488a1 = str;
    }

    public final LinearLayout f3() {
        LinearLayout linearLayout = this.J0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("vehicleImpoundLl");
        return null;
    }

    public final void f4(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.f9494e0 = progressDialog;
    }

    public final TextView g3() {
        TextView textView = this.B0;
        if (textView != null) {
            return textView;
        }
        l.v("vehicle_number");
        return null;
    }

    public final void g4(ld.e eVar) {
        l.f(eVar, "<set-?>");
        this.f9492c1 = eVar;
    }

    public final LinearLayout h3() {
        LinearLayout linearLayout = this.f9497h0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("viewChallan");
        return null;
    }

    public final void h4(TextView textView) {
        l.f(textView, "<set-?>");
        this.R = textView;
    }

    public final v8.h i3() {
        v8.h hVar = this.S0;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void i4(cd.a aVar) {
        l.f(aVar, "<set-?>");
        this.I = aVar;
    }

    public final bi.h j3() {
        bi.h hVar = this.X0;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModelAddMob");
        return null;
    }

    public final void j4(RcModelsDet rcModelsDet) {
        l.f(rcModelsDet, "<set-?>");
        this.f9504o0 = rcModelsDet;
    }

    public final int k3(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(new Date());
        int i10 = 0;
        if (instance2.get(5) - instance.get(5) < 0) {
            instance2.getActualMaximum(5);
            if (instance2.get(5) - instance.get(5) <= 0) {
                i10 = -1;
            }
        }
        return i10 + (instance2.get(2) - instance.get(2)) + ((instance2.get(1) - instance.get(1)) * 12);
    }

    public final void k4(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f9506q0 = linearLayout;
    }

    public final void l4(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f9507r0 = linearLayout;
    }

    public final void m4(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.Y0 = vahanProService;
    }

    public final ArrayList n2() {
        return this.W0;
    }

    public final void n4(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.L0 = linearLayout;
    }

    public final ArrayList o2() {
        return this.V0;
    }

    public final void o4(String str) {
        l.f(str, "<set-?>");
        this.G0 = str;
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f8 c10 = f8.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.O0 = c10;
        SignService signService = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        getWindow().addFlags(128);
        Y3(this);
        e.a aVar = v9.e.f17509a;
        Context w22 = w2();
        f8 f8Var = this.O0;
        if (f8Var == null) {
            l.v("binding");
            f8Var = null;
        }
        aVar.J1(w22, f8Var);
        q4(new ld.g(this));
        g4(new ld.e(this));
        p4(new ld.c(this));
        this.J = RcImpoundService.f9481a.b(w2());
        Z3(RcService.f9484a.c(this));
        m4(VahanProService.f21196b.b(this));
        P4((bi.h) new androidx.lifecycle.u0((androidx.lifecycle.x0) this, (u0.b) new bi.g(new wg.d(I2()))).a(bi.h.class));
        DatabaseHelper A02 = DatabaseHelper.A0(w2());
        l.e(A02, "getInstance(...)");
        J3(A02);
        f4(new ProgressDialog(w2()));
        C2().setMessage(L2().b("label_challan_please_wait", "Please wait..."));
        C2().setCancelable(false);
        C2().setCanceledOnTouchOutside(false);
        K4(String.valueOf(getIntent().getStringExtra("RC_Number")));
        a4((cd.c) new androidx.lifecycle.u0((androidx.lifecycle.x0) this, (u0.b) new cd.d(new bd.b(x2()))).a(cd.c.class));
        RcImpoundService rcImpoundService = this.J;
        if (rcImpoundService == null) {
            l.v("rcImpoundService");
            rcImpoundService = null;
        }
        i4((cd.a) new androidx.lifecycle.u0((androidx.lifecycle.x0) this, (u0.b) new cd.b(new bd.a(rcImpoundService))).a(cd.a.class));
        this.T0 = SignService.f7644a.c(this);
        SignService signService2 = this.T0;
        if (signService2 == null) {
            l.v("retrofitService");
        } else {
            signService = signService2;
        }
        O4((v8.h) new androidx.lifecycle.u0((androidx.lifecycle.x0) this, (u0.b) new v8.g(new s8.b(signService))).a(v8.h.class));
        b2();
        o4(String.valueOf(getIntent().getStringExtra("RCSERVICE")));
        if (K2().equals("INS002")) {
            N2().setText(L2().b("insurance_search", "Insurance Search"));
        }
        if (K2().equals("PUCC003")) {
            N2().setText(L2().b("pucc_Search", "PUCC Search"));
        }
        String e32 = e3();
        if (!(e32 == null || e32.length() == 0)) {
            C2().show();
            y2().N(e3(), M2().k(), this);
        }
        y2().O().g(this, new k(new g(this)));
        y2().s().g(this, new k(new h(this)));
        y2().Y().g(this, new f0(this));
        j3().e0().g(this, new k(new i(this)));
        j3().f0().g(this, new k(new j(this)));
        i3().s().g(this, new b1(this));
        i3().r().g(this, new c1());
        i3().v().g(this, new d1(this));
        i3().i().g(this, new e1(this));
        i3().y().g(this, new k(new c(this)));
        i3().x().g(this, new k(new d(this)));
        y2().L().g(this, new f1(this));
        y2().R().g(this, new g1(this));
        y2().S().g(this, new g0(this));
        y2().M().g(this, new h0(this));
        E2().l().g(this, new k(new e(this)));
        E2().k().g(this, new k(new f(this)));
        y2().V().g(this, new i0(this));
        y2().W().g(this, new q0(this));
        j3().s0().g(this, new z0(this));
        j3().t0().g(this, new a1(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (com.nic.mparivahan.a.f9624a.a(this)) {
                NaxpToKenService.f9438k.a(this);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        Integer R1 = R1();
        l.c(R1);
        int intValue = R1.intValue();
        q2().setVisibility(8);
    }

    public final LinearLayout p2() {
        LinearLayout linearLayout = this.f9493d0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("LayoutBlackListStatus");
        return null;
    }

    public final void p4(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.P0 = cVar;
    }

    public final LinearLayout q2() {
        LinearLayout linearLayout = this.f9505p0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("linear_menu_bar");
        return null;
    }

    public final void q4(ld.g gVar) {
        l.f(gVar, "<set-?>");
        this.f9503n0 = gVar;
    }

    public final LinearLayout r2() {
        LinearLayout linearLayout = this.C0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("linear_permit_number");
        return null;
    }

    public final void r4(String str) {
        l.f(str, "<set-?>");
        this.Z0 = str;
    }

    public final LinearLayout s2() {
        LinearLayout linearLayout = this.D0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("linear_permit_validUpto");
        return null;
    }

    public final void s4(TextView textView) {
        l.f(textView, "<set-?>");
        this.P = textView;
    }

    public final LinearLayout t2() {
        LinearLayout linearLayout = this.f9515z0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("llRecentRC");
        return null;
    }

    public final void t4(TextView textView) {
        l.f(textView, "<set-?>");
        this.Q0 = textView;
    }

    public final LinearLayout u2() {
        LinearLayout linearLayout = this.M;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("llSearchRC");
        return null;
    }

    public final void u4(TextView textView) {
        l.f(textView, "<set-?>");
        this.R0 = textView;
    }

    public final LinearLayout v2() {
        LinearLayout linearLayout = this.N;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("ll_rc");
        return null;
    }

    public final void v4(TextView textView) {
        l.f(textView, "<set-?>");
        this.f9491c0 = textView;
    }

    public void w(String str) {
    }

    public final Context w2() {
        Context context = this.K;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final void w4(TextView textView) {
        l.f(textView, "<set-?>");
        this.Y = textView;
    }

    public final RcService x2() {
        RcService rcService = this.H;
        if (rcService != null) {
            return rcService;
        }
        l.v("mRcService");
        return null;
    }

    public final void x4(TextView textView) {
        l.f(textView, "<set-?>");
        this.U = textView;
    }

    public final cd.c y2() {
        cd.c cVar = this.G;
        if (cVar != null) {
            return cVar;
        }
        l.v("mRcViewModel");
        return null;
    }

    public final void y3(Context context, String str) {
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
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new j0(dialog));
        dialog.show();
    }

    public final void y4(TextView textView) {
        l.f(textView, "<set-?>");
        this.Z = textView;
    }

    public final TextView z2() {
        TextView textView = this.E0;
        if (textView != null) {
            return textView;
        }
        l.v("national_permit_no");
        return null;
    }

    public final void z4(TextView textView) {
        l.f(textView, "<set-?>");
        this.O = textView;
    }
}
