package com.nic.mparivahan.VahanServices.VahanView;

import ai.a5;
import ai.b5;
import ai.c5;
import ai.j4;
import ai.k4;
import ai.l4;
import ai.m4;
import ai.n4;
import ai.o4;
import ai.p4;
import ai.q4;
import ai.r4;
import ai.s4;
import ai.t4;
import ai.u4;
import ai.v4;
import ai.w4;
import ai.x4;
import ai.y4;
import ai.z4;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.PayTaxActivity;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.ApiMessage;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOAadhaarResponse;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.Data;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.VahanAlterationOfVehicle;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundingFeeActivity;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment;
import com.nic.mparivahan.VahanServices.Nominee.NomineeActivity;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitMainScreen;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ApFacelessCheckModel;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiSelectionScreen;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationAdditionActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationContinuationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationTerminationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.RCReleaseActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.TemporaryPermitActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.TransferOwnerShipActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateFitnessActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicatePermitActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateRcActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanRcCancellationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanRcSurrenderActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import ni.c9;
import pl.x;

public final class VahanProcessWithAdhar extends androidx.appcompat.app.d {
    public c9 G;
    public vd.b H;
    public ProgressDialog I;
    public EkYCService J;
    private HashMap K = new HashMap();
    public String L;
    public NrvDetails M;
    private String N = "";
    /* access modifiers changed from: private */
    public String O = "";
    public bi.h P;
    public VahanProService Q;
    private String R = "NA";
    private String S = "NA";
    /* access modifiers changed from: private */
    public String T = "";
    private AadarkycVerify.dOEkyc U;
    public ld.c V;
    public ld.h W;
    private String X = "";
    private Dialog Y;
    private String Z = "A";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanProcessWithAdhar f21576e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanProcessWithAdhar vahanProcessWithAdhar) {
            super(1);
            this.f21576e = vahanProcessWithAdhar;
        }

        public final void b(EkycVerifyResponse ekycVerifyResponse) {
            VahanProcessWithAdhar vahanProcessWithAdhar;
            String str;
            DOAadhaarResponse dOAadhaarResponse;
            DOEkyc dOEkyc;
            DOEkyc dOEkyc2;
            DOEkyc dOEkyc3;
            DOEkyc dOEkyc4;
            DOEkyc dOEkyc5;
            DOEkyc dOEkyc6;
            DOEkyc dOEkyc7;
            DOEkyc dOEkyc8;
            this.f21576e.K1().dismiss();
            if (ekycVerifyResponse != null) {
                Log.e("Calling Otp", ekycVerifyResponse.toString());
                ApiMessage apiMessage = ekycVerifyResponse.getApiMessage();
                String str2 = null;
                if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                    Log.e("Calling Otp", "calling otp");
                    vahanProcessWithAdhar = this.f21576e;
                    ApiMessage apiMessage2 = ekycVerifyResponse.getApiMessage();
                    if (apiMessage2 != null) {
                        str2 = apiMessage2.getDeveloperMessage();
                    }
                    str = String.valueOf(str2);
                } else {
                    Log.e("Calling Otp", "calling otp1");
                    Data data = ekycVerifyResponse.getData();
                    DOAadhaarResponse dOAadhaarResponse2 = data != null ? data.getDOAadhaarResponse() : null;
                    if (String.valueOf(dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null).length() != 0) {
                        if (p.o(String.valueOf(dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null), "Y", true)) {
                            try {
                                new ld.h(this.f21576e).f(this.f21576e.O);
                                if (String.valueOf((dOAadhaarResponse2 == null || (dOEkyc8 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc8.getName()).length() != 0) {
                                    this.f21576e.o2(String.valueOf((dOAadhaarResponse2 == null || (dOEkyc7 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc7.getName()));
                                }
                                VahanProcessWithAdhar vahanProcessWithAdhar2 = this.f21576e;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append((dOAadhaarResponse2 == null || (dOEkyc6 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc6.getHouse());
                                sb2.append(' ');
                                sb2.append((dOAadhaarResponse2 == null || (dOEkyc5 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc5.getStreet());
                                sb2.append(' ');
                                sb2.append((dOAadhaarResponse2 == null || (dOEkyc4 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc4.getLocalityIfAny());
                                sb2.append(' ');
                                sb2.append((dOAadhaarResponse2 == null || (dOEkyc3 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc3.getDist());
                                sb2.append(' ');
                                sb2.append((dOAadhaarResponse2 == null || (dOEkyc2 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc2.getState());
                                sb2.append(' ');
                                sb2.append((dOAadhaarResponse2 == null || (dOEkyc = dOAadhaarResponse2.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc.getPincode()));
                                vahanProcessWithAdhar2.j2(sb2.toString());
                                Data data2 = ekycVerifyResponse.getData();
                                DOEkyc dOEkyc9 = (data2 == null || (dOAadhaarResponse = data2.getDOAadhaarResponse()) == null) ? null : dOAadhaarResponse.getDOEkyc();
                                cm.l.c(dOEkyc9);
                                DOEkyc copy$default = DOEkyc.copy$default(dOEkyc9, Long.parseLong(ekycVerifyResponse.getData().getAadharNo()), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, " ", 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 33538046, (Object) null);
                                i7.d dVar = new i7.d();
                                AadarkycVerify.dOEkyc F1 = this.f21576e.F1();
                                String finalxml = dOAadhaarResponse2 != null ? dOAadhaarResponse2.getFinalxml() : null;
                                Data data3 = ekycVerifyResponse.getData();
                                DoAadhaarResponse doAadhaarResponse = new DoAadhaarResponse(F1, copy$default, finalxml, String.valueOf(data3 != null ? data3.getRegNo() : null), dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null, this.f21576e.O);
                                VahanProcessWithAdhar vahanProcessWithAdhar3 = this.f21576e;
                                Data data4 = ekycVerifyResponse.getData();
                                if (data4 != null) {
                                    str2 = data4.getRegNo();
                                }
                                vahanProcessWithAdhar3.T = String.valueOf(str2);
                                bi.h Q1 = this.f21576e.Q1();
                                VahanProcessWithAdhar vahanProcessWithAdhar4 = this.f21576e;
                                String t10 = dVar.t(doAadhaarResponse);
                                cm.l.e(t10, "toJson(...)");
                                Q1.d1(vahanProcessWithAdhar4, t10);
                                return;
                            } catch (Exception e10) {
                                this.f21576e.K1().dismiss();
                                e10.printStackTrace();
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                this.f21576e.K1().dismiss();
                vahanProcessWithAdhar = this.f21576e;
                str = "Unable to verify the request, Please try after some time";
            }
            vahanProcessWithAdhar.g2(vahanProcessWithAdhar, str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((EkycVerifyResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanProcessWithAdhar f21577e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanProcessWithAdhar vahanProcessWithAdhar) {
            super(1);
            this.f21577e = vahanProcessWithAdhar;
        }

        public final void b(String str) {
            this.f21577e.K1().dismiss();
            VahanProcessWithAdhar vahanProcessWithAdhar = this.f21577e;
            vahanProcessWithAdhar.g2(vahanProcessWithAdhar, "Unable to verify the request, Please try after some time");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanProcessWithAdhar f21578e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanProcessWithAdhar vahanProcessWithAdhar) {
            super(1);
            this.f21578e = vahanProcessWithAdhar;
        }

        public final void b(Boolean bool) {
            if (this.f21578e.K1().isShowing()) {
                this.f21578e.K1().dismiss();
            }
            cm.l.c(bool);
            if (bool.booleanValue()) {
                bi.h Q1 = this.f21578e.Q1();
                VahanProcessWithAdhar vahanProcessWithAdhar = this.f21578e;
                Q1.m(vahanProcessWithAdhar, String.valueOf(vahanProcessWithAdhar.L1().getState_cd()));
                bi.h Q12 = this.f21578e.Q1();
                VahanProcessWithAdhar vahanProcessWithAdhar2 = this.f21578e;
                Q12.g1(vahanProcessWithAdhar2, String.valueOf(vahanProcessWithAdhar2.L1().getState_cd()));
                return;
            }
            VahanProcessWithAdhar vahanProcessWithAdhar3 = this.f21578e;
            vahanProcessWithAdhar3.g2(vahanProcessWithAdhar3, "Unable to verify the Aadhaar, Please try after some time");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Boolean) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanProcessWithAdhar f21579e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanProcessWithAdhar vahanProcessWithAdhar) {
            super(1);
            this.f21579e = vahanProcessWithAdhar;
        }

        public final void b(String str) {
            Dialog E1;
            if (this.f21579e.K1().isShowing()) {
                this.f21579e.K1().dismiss();
            }
            if (p.o(str, "Error", true)) {
                VahanProcessWithAdhar vahanProcessWithAdhar = this.f21579e;
                vahanProcessWithAdhar.g2(vahanProcessWithAdhar, "Unable to verify the Aadhaar, Please try after some time");
                return;
            }
            if (!(this.f21579e.E1() == null || (E1 = this.f21579e.E1()) == null)) {
                E1.dismiss();
            }
            VahanProcessWithAdhar vahanProcessWithAdhar2 = this.f21579e;
            vahanProcessWithAdhar2.g2(vahanProcessWithAdhar2, str.toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanProcessWithAdhar f21580e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanProcessWithAdhar vahanProcessWithAdhar) {
            super(1);
            this.f21580e = vahanProcessWithAdhar;
        }

        public final void b(ApFacelessCheckModel apFacelessCheckModel) {
            VahanProcessWithAdhar vahanProcessWithAdhar;
            String z12;
            HashMap O1;
            boolean z10;
            String J1;
            String C1;
            this.f21580e.K1().dismiss();
            try {
                String facelesswithaadharonly = apFacelessCheckModel.getFacelesswithaadharonly();
                if (facelesswithaadharonly != null) {
                    if (facelesswithaadharonly.length() != 0) {
                        Iterable<String> l02 = q.l0(apFacelessCheckModel.getFacelesswithaadharonly(), new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList = new ArrayList(r.s(l02, 10));
                        for (String B0 : l02) {
                            arrayList.add(q.B0(B0).toString());
                        }
                        if (arrayList.contains(VContant.Companion.f(this.f21580e.O1()))) {
                            vahanProcessWithAdhar = this.f21580e;
                            z12 = vahanProcessWithAdhar.T;
                            O1 = this.f21580e.O1();
                            z10 = true;
                            J1 = this.f21580e.J1();
                            C1 = this.f21580e.C1();
                        } else {
                            vahanProcessWithAdhar = this.f21580e;
                            z12 = vahanProcessWithAdhar.T;
                            O1 = this.f21580e.O1();
                            z10 = true;
                            J1 = this.f21580e.J1();
                            C1 = this.f21580e.C1();
                        }
                        vahanProcessWithAdhar.i2(z12, O1, z10, J1, C1);
                    }
                }
                vahanProcessWithAdhar = this.f21580e;
                z12 = vahanProcessWithAdhar.T;
                O1 = this.f21580e.O1();
                z10 = true;
                J1 = this.f21580e.J1();
                C1 = this.f21580e.C1();
                vahanProcessWithAdhar.i2(z12, O1, z10, J1, C1);
            } catch (Exception e10) {
                VahanProcessWithAdhar vahanProcessWithAdhar2 = this.f21580e;
                vahanProcessWithAdhar2.i2(vahanProcessWithAdhar2.T, this.f21580e.O1(), true, this.f21580e.J1(), this.f21580e.C1());
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ApFacelessCheckModel) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21581a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f21581a = lVar;
        }

        public final pl.c a() {
            return this.f21581a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21581a.invoke(obj);
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

    public static final class g extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21582a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f21583b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f21582a = textView;
            this.f21583b = textView2;
        }

        public void onFinish() {
            this.f21583b.setVisibility(0);
            this.f21582a.setText("0");
            this.f21582a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21582a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21583b.setVisibility(8);
            this.f21582a.setVisibility(0);
        }
    }

    public static final class h extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21584a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f21585b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f21584a = textView;
            this.f21585b = textView2;
        }

        public void onFinish() {
            this.f21585b.setVisibility(0);
            this.f21584a.setText("0");
            this.f21584a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21584a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21585b.setVisibility(8);
            this.f21584a.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void A2(VahanProcessWithAdhar vahanProcessWithAdhar, View view) {
        cm.l.f(vahanProcessWithAdhar, "this$0");
        Dialog dialog = vahanProcessWithAdhar.Y;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void R1(VahanProcessWithAdhar vahanProcessWithAdhar, View view) {
        cm.l.f(vahanProcessWithAdhar, "this$0");
        vahanProcessWithAdhar.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void S1(VahanProcessWithAdhar vahanProcessWithAdhar, View view) {
        cm.l.f(vahanProcessWithAdhar, "this$0");
        vahanProcessWithAdhar.f2();
    }

    /* access modifiers changed from: private */
    public static final void T1(VahanProcessWithAdhar vahanProcessWithAdhar, View view) {
        cm.l.f(vahanProcessWithAdhar, "this$0");
        vahanProcessWithAdhar.D1().f25663f.setText("");
    }

    /* access modifiers changed from: private */
    public static final void U1(VahanProcessWithAdhar vahanProcessWithAdhar, String str) {
        cm.l.f(vahanProcessWithAdhar, "this$0");
        vahanProcessWithAdhar.K1().dismiss();
        vahanProcessWithAdhar.i2(vahanProcessWithAdhar.T, vahanProcessWithAdhar.K, true, vahanProcessWithAdhar.R, vahanProcessWithAdhar.S);
    }

    /* access modifiers changed from: private */
    public static final void V1(VahanProcessWithAdhar vahanProcessWithAdhar, View view) {
        cm.l.f(vahanProcessWithAdhar, "this$0");
        if (vahanProcessWithAdhar.D1().C.isChecked()) {
            vahanProcessWithAdhar.Z = "V";
        }
        vahanProcessWithAdhar.K1().show();
        vahanProcessWithAdhar.H1().k(vahanProcessWithAdhar, vahanProcessWithAdhar.D1().f25666i.getText().toString(), String.valueOf(vahanProcessWithAdhar.L1().getRc_regn_no()), vahanProcessWithAdhar.L1(), vahanProcessWithAdhar.Z, VContant.Companion.f(vahanProcessWithAdhar.K));
    }

    /* access modifiers changed from: private */
    public static final void W1(VahanProcessWithAdhar vahanProcessWithAdhar, eKycResponse ekycresponse) {
        cm.l.f(vahanProcessWithAdhar, "this$0");
        vahanProcessWithAdhar.K1().dismiss();
        try {
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.ApiMessage apiMessage = ekycresponse.getApiMessage();
            String str = null;
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.ApiMessage apiMessage2 = ekycresponse.getApiMessage();
                if (apiMessage2 != null) {
                    str = apiMessage2.getDeveloperMessage();
                }
                vahanProcessWithAdhar.g2(vahanProcessWithAdhar, String.valueOf(str));
                return;
            }
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data = ekycresponse.getData();
            vahanProcessWithAdhar.O = String.valueOf(data != null ? data.getTxNo() : null);
            ld.h hVar = new ld.h(vahanProcessWithAdhar);
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data2 = ekycresponse.getData();
            hVar.f(String.valueOf(data2 != null ? data2.getTxNo() : null));
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data3 = ekycresponse.getData();
            if (data3 != null) {
                str = data3.getLastFourMobileNumber();
            }
            vahanProcessWithAdhar.v2(vahanProcessWithAdhar, String.valueOf(str));
        } catch (Exception unused) {
            vahanProcessWithAdhar.g2(vahanProcessWithAdhar, "Unable to process the request, Please try after some time");
        }
    }

    /* access modifiers changed from: private */
    public static final void X1(VahanProcessWithAdhar vahanProcessWithAdhar, String str) {
        cm.l.f(vahanProcessWithAdhar, "this$0");
        vahanProcessWithAdhar.K1().dismiss();
        vahanProcessWithAdhar.g2(vahanProcessWithAdhar, "Unable to process the request, Please try after some time");
    }

    /* access modifiers changed from: private */
    public static final void Y1(VahanProcessWithAdhar vahanProcessWithAdhar, View view) {
        String str;
        cm.l.f(vahanProcessWithAdhar, "this$0");
        Editable text = vahanProcessWithAdhar.D1().f25666i.getText();
        cm.l.e(text, "getText(...)");
        if (text.length() == 0 && vahanProcessWithAdhar.D1().f25660c.isChecked()) {
            str = "Please enter the Aadhaar Number";
        } else if ((vahanProcessWithAdhar.D1().f25666i.getText().length() >= 12 || !vahanProcessWithAdhar.D1().f25660c.isChecked()) && (vahanProcessWithAdhar.D1().f25666i.getText().length() <= 12 || !vahanProcessWithAdhar.D1().f25660c.isChecked())) {
            Editable text2 = vahanProcessWithAdhar.D1().f25666i.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() == 0 && vahanProcessWithAdhar.D1().C.isChecked()) {
                str = "Please enter the Virtual Id";
            } else if (vahanProcessWithAdhar.D1().f25666i.getText().length() < 16 && vahanProcessWithAdhar.D1().C.isChecked()) {
                str = "Please enter the valid Virtual Id";
            } else if (!vahanProcessWithAdhar.D1().f25661d.isChecked() && vahanProcessWithAdhar.D1().C.isChecked()) {
                str = "Please agree with VID based e-KYC consent";
            } else if (vahanProcessWithAdhar.D1().f25661d.isChecked() || !vahanProcessWithAdhar.D1().f25660c.isChecked()) {
                String str2 = vahanProcessWithAdhar.D1().C.isChecked() ? "V" : "A";
                vahanProcessWithAdhar.K1().show();
                vahanProcessWithAdhar.H1().k(vahanProcessWithAdhar, vahanProcessWithAdhar.D1().f25666i.getText().toString(), String.valueOf(vahanProcessWithAdhar.L1().getRc_regn_no()), vahanProcessWithAdhar.L1(), str2, VContant.Companion.f(vahanProcessWithAdhar.K));
                return;
            } else {
                str = "Please agree with Aadhaar based e-KYC consent";
            }
        } else {
            vahanProcessWithAdhar.g2(vahanProcessWithAdhar, "Please enter the valid Aadhaar Number");
            return;
        }
        vahanProcessWithAdhar.g2(vahanProcessWithAdhar, str);
    }

    /* access modifiers changed from: private */
    public static final void Z1(VahanProcessWithAdhar vahanProcessWithAdhar, View view) {
        cm.l.f(vahanProcessWithAdhar, "this$0");
        vahanProcessWithAdhar.D1().f25666i.getText().clear();
    }

    /* access modifiers changed from: private */
    public static final void a2(VahanProcessWithAdhar vahanProcessWithAdhar, View view) {
        cm.l.f(vahanProcessWithAdhar, "this$0");
        Dialog dialog = new Dialog(vahanProcessWithAdhar);
        dialog.setContentView(R.layout.term_cond_aadhar_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        View findViewById = dialog.findViewById(R.id.cancelIv);
        cm.l.e(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.termConditionWv);
        cm.l.e(findViewById2, "findViewById(...)");
        WebView webView = (WebView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.title);
        cm.l.e(findViewById3, "findViewById(...)");
        ((TextView) findViewById3).setText(vahanProcessWithAdhar.D1().C.isChecked() ? "VID based e-KYC consent" : "Aadhaar based e-KYC consent");
        imageView.setOnClickListener(new o4(dialog));
        webView.loadUrl(hc.a.f12073a.g() + vahanProcessWithAdhar.G1().d() + "/mparivahan-info-terms-of-use-aadhaar.html");
        webView.clearCache(true);
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void b2(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void c2(VahanProcessWithAdhar vahanProcessWithAdhar, CompoundButton compoundButton, boolean z10) {
        cm.l.f(vahanProcessWithAdhar, "this$0");
        if (z10) {
            vahanProcessWithAdhar.D1().C.setChecked(false);
            vahanProcessWithAdhar.D1().f25660c.setChecked(true);
            vahanProcessWithAdhar.D1().f25666i.setHint("Enter Aadhaar Number");
            vahanProcessWithAdhar.D1().f25666i.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(12)});
        }
    }

    /* access modifiers changed from: private */
    public static final void d2(VahanProcessWithAdhar vahanProcessWithAdhar, CompoundButton compoundButton, boolean z10) {
        cm.l.f(vahanProcessWithAdhar, "this$0");
        if (z10) {
            vahanProcessWithAdhar.D1().f25660c.setChecked(false);
            vahanProcessWithAdhar.D1().C.setChecked(true);
            vahanProcessWithAdhar.D1().f25666i.setHint("Enter VID Number");
            vahanProcessWithAdhar.D1().f25666i.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
        }
    }

    /* access modifiers changed from: private */
    public static final void e2(VahanProcessWithAdhar vahanProcessWithAdhar, View view) {
        EditText editText;
        TransformationMethod instance;
        cm.l.f(vahanProcessWithAdhar, "this$0");
        if (vahanProcessWithAdhar.D1().f25663f.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            vahanProcessWithAdhar.D1().f25675r.setImageResource(R.drawable.pass_visible);
            editText = vahanProcessWithAdhar.D1().f25663f;
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            vahanProcessWithAdhar.D1().f25675r.setImageResource(R.drawable.mvvm_visibility);
            editText = vahanProcessWithAdhar.D1().f25663f;
            instance = PasswordTransformationMethod.getInstance();
        }
        editText.setTransformationMethod(instance);
    }

    private final void f2() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void h2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void w2(EditText editText, ImageView imageView, View view) {
        TransformationMethod instance;
        cm.l.f(editText, "$enterOtp");
        cm.l.f(imageView, "$shownPin");
        if (editText.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            imageView.setImageResource(R.drawable.pass_visible);
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            imageView.setImageResource(R.drawable.mvvm_visibility);
            instance = PasswordTransformationMethod.getInstance();
        }
        editText.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void x2(VahanProcessWithAdhar vahanProcessWithAdhar, TextView textView, TextView textView2, View view) {
        cm.l.f(vahanProcessWithAdhar, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(textView2, "$resendOtp");
        vahanProcessWithAdhar.K1().show();
        new h(textView, textView2).start();
        new Random().nextInt(1410065407);
        vahanProcessWithAdhar.K1().show();
        vahanProcessWithAdhar.H1().k(vahanProcessWithAdhar, vahanProcessWithAdhar.D1().f25666i.getText().toString(), String.valueOf(vahanProcessWithAdhar.L1().getRc_regn_no()), vahanProcessWithAdhar.L1(), vahanProcessWithAdhar.Z, VContant.Companion.f(vahanProcessWithAdhar.K));
    }

    /* access modifiers changed from: private */
    public static final void y2(EditText editText, VahanProcessWithAdhar vahanProcessWithAdhar, View view) {
        String str;
        cm.l.f(editText, "$enterOtp");
        cm.l.f(vahanProcessWithAdhar, "this$0");
        String obj = editText.getText().toString();
        if (obj.length() == 0) {
            str = "Please enter the OTP";
        } else if (obj.length() < 6) {
            str = "Please enter the valid OTP";
        } else {
            vahanProcessWithAdhar.K1().show();
            if (vahanProcessWithAdhar.D1().C.isChecked()) {
                vahanProcessWithAdhar.Z = "V";
            }
            ld.h hVar = new ld.h(vahanProcessWithAdhar);
            hVar.a();
            vahanProcessWithAdhar.H1().l(vahanProcessWithAdhar, vahanProcessWithAdhar.D1().f25666i.getText().toString(), String.valueOf(vahanProcessWithAdhar.L1().getRc_regn_no()), vahanProcessWithAdhar.L1(), vahanProcessWithAdhar.Z, VContant.Companion.f(vahanProcessWithAdhar.K), obj, hVar.a());
            return;
        }
        Toast.makeText(vahanProcessWithAdhar, str, 0).show();
    }

    /* access modifiers changed from: private */
    public static final void z2(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    public final String C1() {
        return this.S;
    }

    public final c9 D1() {
        c9 c9Var = this.G;
        if (c9Var != null) {
            return c9Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final Dialog E1() {
        return this.Y;
    }

    public final AadarkycVerify.dOEkyc F1() {
        return this.U;
    }

    public final ld.c G1() {
        ld.c cVar = this.V;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final vd.b H1() {
        vd.b bVar = this.H;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mView");
        return null;
    }

    public final String I1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final String J1() {
        return this.R;
    }

    public final ProgressDialog K1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final NrvDetails L1() {
        NrvDetails nrvDetails = this.M;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final VahanProService M1() {
        VahanProService vahanProService = this.Q;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final EkYCService N1() {
        EkYCService ekYCService = this.J;
        if (ekYCService != null) {
            return ekYCService;
        }
        cm.l.v("retrofitService_one");
        return null;
    }

    public final HashMap O1() {
        return this.K;
    }

    public final ld.h P1() {
        ld.h hVar = this.W;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("session");
        return null;
    }

    public final bi.h Q1() {
        bi.h hVar = this.P;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModelv1");
        return null;
    }

    public final void g2(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new n4(dialog));
        dialog.show();
    }

    public final void i2(String str, HashMap hashMap, boolean z10, String str2, String str3) {
        Class<HypothecationContinuationActivity> cls;
        Object obj;
        String str4;
        String str5 = str;
        HashMap hashMap2 = hashMap;
        boolean z11 = z10;
        String str6 = str2;
        String str7 = str3;
        cm.l.f(str5, "rc_number");
        cm.l.f(hashMap2, "serviceSelection_HashMap");
        cm.l.f(str6, "name");
        cm.l.f(str7, "address");
        if (hashMap2.containsKey(VContant.DUPLICATE_RC)) {
            Intent intent = new Intent(this, VahanDuplicateRcActivity.class);
            intent.putExtra("RC", str5);
            intent.putExtra("RcDetails", L1());
            intent.putExtra("map", hashMap2);
            intent.putExtra("off_code", I1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent);
            finish();
        }
        if (hashMap2.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            Intent intent2 = new Intent(this, TransferOwnerShipActivity.class);
            intent2.putExtra("RC", str5);
            intent2.putExtra("RcDetails", L1());
            intent2.putExtra("map", hashMap2);
            intent2.putExtra("off_code", I1());
            intent2.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent2.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent2.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent2);
            finish();
        }
        if (hashMap2.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            Intent intent3 = new Intent(this, VahanChangeOfAddress.class);
            intent3.putExtra("RC", str5);
            intent3.putExtra("RcDetails", L1());
            intent3.putExtra("map", hashMap2);
            intent3.putExtra("off_code", I1());
            intent3.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent3.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent3.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent3);
            finish();
        }
        if (hashMap2.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            Intent intent4 = new Intent(this, HypothecationTerminationActivity.class);
            intent4.putExtra("RC", str5);
            intent4.putExtra("RcDetails", L1());
            intent4.putExtra("map", hashMap2);
            intent4.putExtra("off_code", I1());
            intent4.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent4.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent4.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent4);
            finish();
        }
        Class<HypothecationContinuationActivity> cls2 = HypothecationContinuationActivity.class;
        if (hashMap2.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            Intent intent5 = new Intent(this, cls2);
            intent5.putExtra("RC", str5);
            cls = cls2;
            intent5.putExtra("RcDetails", L1());
            intent5.putExtra("map", hashMap2);
            intent5.putExtra("off_code", I1());
            intent5.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent5.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent5.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent5);
            finish();
        } else {
            cls = cls2;
        }
        if (hashMap2.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            Intent intent6 = new Intent(this, HypothecationAdditionActivity.class);
            intent6.putExtra("RC", str5);
            intent6.putExtra("RcDetails", L1());
            intent6.putExtra("map", hashMap2);
            intent6.putExtra("off_code", I1());
            intent6.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent6.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent6.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent6);
            finish();
        }
        if (hashMap2.containsKey(VContant.RCPARTICULAR)) {
            Intent intent7 = new Intent(this, VahanDetailsForRcParticulara.class);
            obj = VContant.HYPOTHECATION_CONTINUATION;
            intent7.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RCPARTICULAR_CODE);
            intent7.putExtra(VContant.PURPOSE_CODE, VContant.RCPARTICULAR_PURPOSE_CODE);
            intent7.putExtra("state_code", L1().getState_cd());
            intent7.putExtra("RC", str5);
            intent7.putExtra("RcDetails", L1());
            intent7.putExtra(VContant.SERVICE_NAME, "RC Particular");
            intent7.putExtra("off_code", I1());
            intent7.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent7.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent7.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent7);
            finish();
        } else {
            obj = VContant.HYPOTHECATION_CONTINUATION;
        }
        if (hashMap2.containsKey(VContant.NOC)) {
            Intent intent8 = new Intent(this, VahanNocActivity.class);
            intent8.putExtra("RC", str5);
            intent8.putExtra("RcDetails", L1());
            intent8.putExtra("map", hashMap2);
            intent8.putExtra("off_code", I1());
            intent8.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent8.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent8.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent8);
            finish();
        }
        if (hashMap2.containsKey(obj)) {
            Intent intent9 = new Intent(this, cls);
            intent9.putExtra("RC", str5);
            intent9.putExtra("RcDetails", L1());
            intent9.putExtra("map", hashMap2);
            intent9.putExtra("off_code", I1());
            intent9.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent9.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent9.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent9);
            finish();
        }
        if (hashMap2.containsKey(VContant.PAY_TAX)) {
            Intent intent10 = new Intent(this, PayTaxActivity.class);
            intent10.putExtra("RC", str5);
            String rc_c_state = L1().getRc_c_state();
            intent10.putExtra("State", rc_c_state != null ? q.B0(rc_c_state).toString() : null);
            intent10.putExtra("map", hashMap2);
            intent10.putExtra("off_code", I1());
            String rc_chasi_no = L1().getRc_chasi_no();
            if (rc_chasi_no != null) {
                str4 = rc_chasi_no.substring(String.valueOf(L1().getRc_chasi_no()).length() - 5);
                cm.l.e(str4, "this as java.lang.String).substring(startIndex)");
            } else {
                str4 = null;
            }
            intent10.putExtra("chassis_no", str4);
            intent10.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent10.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent10.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent10);
            finish();
        }
        if (hashMap2.containsKey(VContant.DUPLICATE_FITNESS)) {
            Intent intent11 = new Intent(this, VahanDuplicateFitnessActivity.class);
            intent11.putExtra("RC", str5);
            intent11.putExtra("RcDetails", L1());
            intent11.putExtra("map", hashMap2);
            intent11.putExtra("off_code", I1());
            intent11.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent11.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent11.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent11);
            finish();
        }
        if (hashMap2.containsKey(VContant.RC_CANCALATION)) {
            Intent intent12 = new Intent(this, VahanRcCancellationActivity.class);
            intent12.putExtra("RC", str5);
            intent12.putExtra("RcDetails", L1());
            intent12.putExtra("map", hashMap2);
            intent12.putExtra("off_code", I1());
            intent12.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent12.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent12.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent12);
            finish();
        }
        if (hashMap2.containsKey(VContant.RC_SURRENDER)) {
            Intent intent13 = new Intent(this, VahanRcSurrenderActivity.class);
            intent13.putExtra("RC", str5);
            intent13.putExtra("RcDetails", L1());
            intent13.putExtra("map", hashMap2);
            intent13.putExtra("off_code", I1());
            intent13.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent13.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent13.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent13);
            finish();
        }
        if (hashMap2.containsKey(VContant.DUPLICATE_PERMIT)) {
            Intent intent14 = new Intent(this, VahanDuplicatePermitActivity.class);
            intent14.putExtra("RC", str5);
            intent14.putExtra("RcDetails", L1());
            intent14.putExtra("map", hashMap2);
            intent14.putExtra("off_code", I1());
            intent14.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent14.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent14.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent14);
            finish();
        }
        if (hashMap2.containsKey(VContant.RC_RELEASE)) {
            Intent intent15 = new Intent(this, RCReleaseActivity.class);
            intent15.putExtra("RC", str5);
            intent15.putExtra("RcDetails", L1());
            intent15.putExtra("map", hashMap2);
            intent15.putExtra("off_code", I1());
            intent15.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent15.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent15.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent15);
            finish();
        }
        if (hashMap2.containsKey(VContant.Temp_Permit)) {
            Intent intent16 = new Intent(this, TemporaryPermitActivity.class);
            intent16.putExtra("RC", str5);
            intent16.putExtra("RcDetails", L1());
            intent16.putExtra("map", hashMap2);
            intent16.putExtra("off_code", I1());
            intent16.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent16.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent16.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent16);
            finish();
        }
        if (hashMap2.containsKey(VContant.PERMIT_RENEWAL)) {
            Intent intent17 = new Intent(this, RenewalOfPermitMainScreen.class);
            intent17.putExtra("RC", str5);
            intent17.putExtra("RcDetails", L1());
            intent17.putExtra("map", hashMap2);
            intent17.putExtra("off_code", I1());
            intent17.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent17.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent17.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent17);
            finish();
        }
        if (hashMap2.containsKey(VContant.COMPOUND_FEE)) {
            Intent intent18 = new Intent(this, CompoundingFeeActivity.class);
            intent18.putExtra("RC", str5);
            intent18.putExtra("RcDetails", L1());
            intent18.putExtra("map", hashMap2);
            intent18.putExtra("off_code", I1());
            intent18.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent18.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent18.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent18);
            finish();
        }
        if (hashMap2.containsKey(VContant.Nominee_Addition)) {
            Intent intent19 = new Intent(this, NomineeActivity.class);
            intent19.putExtra("RC", str5);
            intent19.putExtra("RcDetails", L1());
            intent19.putExtra("map", hashMap2);
            intent19.putExtra("off_code", I1());
            intent19.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent19.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent19.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent19);
            finish();
        }
        if (hashMap2.containsKey(VContant.MISELL_PAYMENT)) {
            Intent intent20 = new Intent(this, MiscellaneousFeePayment.class);
            intent20.putExtra("RC", str5);
            intent20.putExtra("RcDetails", L1());
            intent20.putExtra("map", hashMap2);
            intent20.putExtra("off_code", I1());
            intent20.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent20.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent20.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent20);
            finish();
        }
        if (hashMap2.containsKey(VContant.ALTERATION)) {
            Intent intent21 = new Intent(this, VahanAlterationOfVehicle.class);
            intent21.putExtra("RC", str5);
            intent21.putExtra("RcDetails", L1());
            intent21.putExtra("map", hashMap2);
            intent21.putExtra("off_code", I1());
            intent21.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent21.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent21.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent21);
            finish();
        }
        if (hashMap2.containsKey(VContant.MULTI_SELECT_SERVICE)) {
            Intent intent22 = new Intent(this, VahanMultiSelectionScreen.class);
            intent22.putExtra("RC", str5);
            intent22.putExtra("RcDetails", L1());
            intent22.putExtra("map", hashMap2);
            intent22.putExtra("off_code", I1());
            intent22.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent22.putExtra(VContant.NEXGEN_addahar_name, str6);
            intent22.putExtra(VContant.NEXGEN_addahar_address, str7);
            startActivity(intent22);
            finish();
        }
    }

    public final void j2(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void k2(c9 c9Var) {
        cm.l.f(c9Var, "<set-?>");
        this.G = c9Var;
    }

    public final void l2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.V = cVar;
    }

    public final void m2(vd.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.H = bVar;
    }

    public final void n2(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void o2(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vahan_process_with_adhar);
        c9 c10 = c9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        k2(c10);
        setContentView((View) D1().b());
        v9.e.f17509a.J2(this, D1());
        l2(new ld.c(this));
        s2(EkYCService.f20515a.a(this));
        r2(VahanProService.f21196b.b(this));
        p2(new ProgressDialog(this));
        K1().setMessage("Please wait...");
        K1().setCancelable(false);
        K1().setCanceledOnTouchOutside(false);
        new Random().nextInt(1410065407);
        String stringExtra = getIntent().getStringExtra("RC");
        n2(String.valueOf(getIntent().getStringExtra("off_code")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        q2((NrvDetails) serializableExtra);
        t2(new ld.h(this));
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            D1().f25683z.setText(stringExtra.toString());
            HashMap hashMap = (HashMap) getIntent().getSerializableExtra("map");
            cm.l.c(hashMap);
            this.K = hashMap;
        }
        if (this.K.size() > 0) {
            D1().f25679v.f28308i.setText(VContant.Companion.l(this, P1()));
        }
        D1().f25679v.f28305f.setOnClickListener(new j4(this));
        D1().f25679v.f28306g.setOnClickListener(new x4(this));
        m2((vd.b) new u0((x0) this, (u0.b) new vd.c(new vd.a(N1()))).a(vd.b.class));
        u2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(M1()))).a(bi.h.class));
        D1().f25682y.setOnClickListener(new y4(this));
        D1().f25680w.setOnClickListener(new z4(this));
        D1().f25677t.setOnClickListener(new a5(this));
        D1().f25660c.setOnCheckedChangeListener(new b5(this));
        D1().C.setOnCheckedChangeListener(new c5(this));
        D1().f25675r.setOnClickListener(new k4(this));
        D1().f25681x.setOnClickListener(new l4(this));
        H1().g().g(this, new f(new a(this)));
        H1().h().g(this, new f(new b(this)));
        Q1().b1().g(this, new f(new c(this)));
        Q1().c1().g(this, new f(new d(this)));
        Q1().q().g(this, new f(new e(this)));
        Q1().r().g(this, new m4(this));
        D1().f25673p.setOnClickListener(new u4(this));
        H1().i().g(this, new v4(this));
        H1().j().g(this, new w4(this));
    }

    public final void p2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void q2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.M = nrvDetails;
    }

    public final void r2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.Q = vahanProService;
    }

    public final void s2(EkYCService ekYCService) {
        cm.l.f(ekYCService, "<set-?>");
        this.J = ekYCService;
    }

    public final void t2(ld.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.W = hVar;
    }

    public final void u2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.P = hVar;
    }

    public final void v2(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "mobile_no");
        Dialog dialog = new Dialog(context);
        this.Y = dialog;
        dialog.setContentView(R.layout.aadhaar_diloge);
        Dialog dialog2 = this.Y;
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        Dialog dialog3 = this.Y;
        if (dialog3 != null) {
            dialog3.setCancelable(false);
        }
        Dialog dialog4 = this.Y;
        TextView textView = null;
        Window window = dialog4 != null ? dialog4.getWindow() : null;
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog5 = this.Y;
        LinearLayout linearLayout = dialog5 != null ? (LinearLayout) dialog5.findViewById(R.id.pop_up_close) : null;
        cm.l.d(linearLayout, "null cannot be cast to non-null type android.widget.LinearLayout");
        Dialog dialog6 = this.Y;
        TextView textView2 = dialog6 != null ? (TextView) dialog6.findViewById(R.id.resendOtp) : null;
        cm.l.d(textView2, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog7 = this.Y;
        ImageView imageView = dialog7 != null ? (ImageView) dialog7.findViewById(R.id.showmpin) : null;
        cm.l.d(imageView, "null cannot be cast to non-null type android.widget.ImageView");
        Dialog dialog8 = this.Y;
        TextView textView3 = dialog8 != null ? (TextView) dialog8.findViewById(R.id.submitOtp) : null;
        cm.l.d(textView3, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog9 = this.Y;
        EditText editText = dialog9 != null ? (EditText) dialog9.findViewById(R.id.enterOtp) : null;
        cm.l.d(editText, "null cannot be cast to non-null type android.widget.EditText");
        Dialog dialog10 = this.Y;
        TextView textView4 = dialog10 != null ? (TextView) dialog10.findViewById(R.id.time_text) : null;
        cm.l.d(textView4, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog11 = this.Y;
        TextView textView5 = dialog11 != null ? (TextView) dialog11.findViewById(R.id.txt_reset) : null;
        cm.l.d(textView5, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog12 = this.Y;
        if (dialog12 != null) {
            textView = (TextView) dialog12.findViewById(R.id.disPlay_mobile);
        }
        cm.l.d(textView, "null cannot be cast to non-null type android.widget.TextView");
        textView.setText("OTP has been sent on your aadhar linked mobile number  \n+91 XXXXXX" + str);
        new g(textView4, textView2).start();
        imageView.setOnClickListener(new p4(editText, imageView));
        textView2.setOnClickListener(new q4(this, textView4, textView2));
        textView3.setOnClickListener(new r4(editText, this));
        textView5.setOnClickListener(new s4(editText));
        linearLayout.setOnClickListener(new t4(this));
        Dialog dialog13 = this.Y;
        if (dialog13 != null) {
            dialog13.show();
        }
    }
}
