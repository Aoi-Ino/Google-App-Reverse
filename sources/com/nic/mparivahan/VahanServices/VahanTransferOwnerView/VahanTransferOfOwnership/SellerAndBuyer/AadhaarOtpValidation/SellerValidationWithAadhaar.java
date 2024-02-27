package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation;

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
import bi.h;
import bm.l;
import ch.a0;
import ch.c0;
import ch.d0;
import ch.e0;
import ch.f0;
import ch.g0;
import ch.h0;
import ch.i0;
import ch.j0;
import ch.k0;
import ch.t;
import ch.u;
import ch.v;
import ch.w;
import ch.y;
import ch.z;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.ApiMessage;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOAadhaarResponse;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.Data;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.TOFetchApplicationDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerSelectionScreen;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.TOMultiSelectionScreen;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Random;
import ni.c9;
import pl.x;

public final class SellerValidationWithAadhaar extends androidx.appcompat.app.d {
    public c9 G;
    public vd.b H;
    public ProgressDialog I;
    public EkYCService J;
    private HashMap K = new HashMap();
    public String L;
    private String M = "";
    /* access modifiers changed from: private */
    public String N = "";
    public h O;
    public VahanProService P;
    private String Q = "NA";
    private String R = "NA";
    /* access modifiers changed from: private */
    public String S = "";
    private AadarkycVerify.dOEkyc T;
    public ld.c U;
    public ld.h V;
    private String W = "";
    private Dialog X;
    private String Y = "A";
    public String Z;

    /* renamed from: a0  reason: collision with root package name */
    public NrvDetails f21340a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f21341b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f21342c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f21343d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f21344e0;

    /* renamed from: f0  reason: collision with root package name */
    private String f21345f0 = " ";

    /* renamed from: g0  reason: collision with root package name */
    private TOFetchApplicationDetails f21346g0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SellerValidationWithAadhaar f21347e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SellerValidationWithAadhaar sellerValidationWithAadhaar) {
            super(1);
            this.f21347e = sellerValidationWithAadhaar;
        }

        public final void b(String str) {
            this.f21347e.I1().dismiss();
            SellerValidationWithAadhaar sellerValidationWithAadhaar = this.f21347e;
            sellerValidationWithAadhaar.d2(sellerValidationWithAadhaar, "Unable to verify the request, Please try after some time");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SellerValidationWithAadhaar f21348e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SellerValidationWithAadhaar sellerValidationWithAadhaar) {
            super(1);
            this.f21348e = sellerValidationWithAadhaar;
        }

        public final void b(Boolean bool) {
            if (this.f21348e.I1().isShowing()) {
                this.f21348e.I1().dismiss();
            }
            cm.l.c(bool);
            if (bool.booleanValue()) {
                h O1 = this.f21348e.O1();
                SellerValidationWithAadhaar sellerValidationWithAadhaar = this.f21348e;
                O1.g1(sellerValidationWithAadhaar, String.valueOf(sellerValidationWithAadhaar.J1().getState_cd()));
                return;
            }
            SellerValidationWithAadhaar sellerValidationWithAadhaar2 = this.f21348e;
            sellerValidationWithAadhaar2.d2(sellerValidationWithAadhaar2, "Unable to verify the Aadhaar, Please try after some time");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Boolean) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SellerValidationWithAadhaar f21349e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SellerValidationWithAadhaar sellerValidationWithAadhaar) {
            super(1);
            this.f21349e = sellerValidationWithAadhaar;
        }

        public final void b(String str) {
            Dialog D1;
            if (this.f21349e.I1().isShowing()) {
                this.f21349e.I1().dismiss();
            }
            if (p.o(str, "Error", true)) {
                SellerValidationWithAadhaar sellerValidationWithAadhaar = this.f21349e;
                sellerValidationWithAadhaar.d2(sellerValidationWithAadhaar, "Unable to verify the Aadhaar, Please try after some time");
                return;
            }
            if (!(this.f21349e.D1() == null || (D1 = this.f21349e.D1()) == null)) {
                D1.dismiss();
            }
            SellerValidationWithAadhaar sellerValidationWithAadhaar2 = this.f21349e;
            sellerValidationWithAadhaar2.d2(sellerValidationWithAadhaar2, str.toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SellerValidationWithAadhaar f21350e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SellerValidationWithAadhaar sellerValidationWithAadhaar) {
            super(1);
            this.f21350e = sellerValidationWithAadhaar;
        }

        public final void b(EkycVerifyResponse ekycVerifyResponse) {
            SellerValidationWithAadhaar sellerValidationWithAadhaar;
            String str;
            SellerValidationWithAadhaar sellerValidationWithAadhaar2;
            DOAadhaarResponse dOAadhaarResponse;
            DOEkyc dOEkyc;
            DOEkyc dOEkyc2;
            DOEkyc dOEkyc3;
            DOEkyc dOEkyc4;
            DOEkyc dOEkyc5;
            DOEkyc dOEkyc6;
            DOEkyc dOEkyc7;
            DOEkyc dOEkyc8;
            this.f21350e.I1().dismiss();
            if (ekycVerifyResponse != null) {
                ApiMessage apiMessage = ekycVerifyResponse.getApiMessage();
                String str2 = null;
                if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                    sellerValidationWithAadhaar = this.f21350e;
                    ApiMessage apiMessage2 = ekycVerifyResponse.getApiMessage();
                    if (apiMessage2 != null) {
                        str2 = apiMessage2.getDeveloperMessage();
                    }
                    str = String.valueOf(str2);
                } else {
                    Data data = ekycVerifyResponse.getData();
                    DOAadhaarResponse dOAadhaarResponse2 = data != null ? data.getDOAadhaarResponse() : null;
                    if (String.valueOf(dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null).length() != 0) {
                        if (p.o(String.valueOf(dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null), "Y", true)) {
                            try {
                                new ld.h(this.f21350e).f(this.f21350e.N);
                                if (String.valueOf((dOAadhaarResponse2 == null || (dOEkyc8 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc8.getName()).length() != 0) {
                                    this.f21350e.m2(String.valueOf((dOAadhaarResponse2 == null || (dOEkyc7 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc7.getName()));
                                }
                                SellerValidationWithAadhaar sellerValidationWithAadhaar3 = this.f21350e;
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
                                sellerValidationWithAadhaar3.h2(sb2.toString());
                                Data data2 = ekycVerifyResponse.getData();
                                DOEkyc dOEkyc9 = (data2 == null || (dOAadhaarResponse = data2.getDOAadhaarResponse()) == null) ? null : dOAadhaarResponse.getDOEkyc();
                                cm.l.c(dOEkyc9);
                                DOEkyc copy$default = DOEkyc.copy$default(dOEkyc9, Long.parseLong(ekycVerifyResponse.getData().getAadharNo()), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, " ", 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 33538046, (Object) null);
                                new i7.d();
                                AadarkycVerify.dOEkyc E1 = this.f21350e.E1();
                                String finalxml = dOAadhaarResponse2 != null ? dOAadhaarResponse2.getFinalxml() : null;
                                Data data3 = ekycVerifyResponse.getData();
                                DoAadhaarResponse doAadhaarResponse = new DoAadhaarResponse(E1, copy$default, finalxml, data3 != null ? data3.getRegNo() : null, dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null, this.f21350e.N);
                                SellerValidationWithAadhaar sellerValidationWithAadhaar4 = this.f21350e;
                                Data data4 = ekycVerifyResponse.getData();
                                if (data4 != null) {
                                    str2 = data4.getRegNo();
                                }
                                sellerValidationWithAadhaar4.S = String.valueOf(str2);
                                if (this.f21350e.P1()) {
                                    Intent intent = new Intent(this.f21350e, TOBuyerSelectionScreen.class);
                                    intent.putExtra("applNo", this.f21350e.B1());
                                    intent.putExtra("Buyerdetails", this.f21350e.N1());
                                    intent.putExtra("RcDetails", this.f21350e.J1());
                                    intent.putExtra("AadhaarDetails", doAadhaarResponse);
                                    intent.putExtra(VContant.NEXGEN_isFACELESS, true);
                                    intent.putExtra(VContant.NEXGEN_addahar_name, this.f21350e.A1());
                                    intent.putExtra(VContant.NEXGEN_addahar_address, this.f21350e.z1());
                                    this.f21350e.startActivity(intent);
                                    sellerValidationWithAadhaar2 = this.f21350e;
                                } else {
                                    Intent intent2 = new Intent(this.f21350e, TOMultiSelectionScreen.class);
                                    intent2.putExtra("RC", this.f21350e.J1().getRc_regn_no());
                                    intent2.putExtra("RcDetails", this.f21350e.J1());
                                    intent2.putExtra("map", this.f21350e.M1());
                                    intent2.putExtra("off_code", this.f21350e.H1());
                                    intent2.putExtra(VContant.NEXGEN_isFACELESS, this.f21350e.Q1());
                                    intent2.putExtra(VContant.NEXGEN_addahar_name, this.f21350e.A1());
                                    intent2.putExtra(VContant.NEXGEN_addahar_address, this.f21350e.z1());
                                    this.f21350e.startActivity(intent2);
                                    sellerValidationWithAadhaar2 = this.f21350e;
                                }
                                sellerValidationWithAadhaar2.finish();
                                return;
                            } catch (Exception e10) {
                                this.f21350e.I1().dismiss();
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
                this.f21350e.I1().dismiss();
                sellerValidationWithAadhaar = this.f21350e;
                str = "Unable to verify the request, Please try after some time";
            }
            sellerValidationWithAadhaar.d2(sellerValidationWithAadhaar, str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((EkycVerifyResponse) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21351a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f21351a = lVar;
        }

        public final pl.c a() {
            return this.f21351a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21351a.invoke(obj);
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

    public static final class f extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21352a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f21353b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f21352a = textView;
            this.f21353b = textView2;
        }

        public void onFinish() {
            this.f21353b.setVisibility(0);
            this.f21352a.setText("0");
            this.f21352a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21352a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21353b.setVisibility(8);
            this.f21352a.setVisibility(0);
        }
    }

    public static final class g extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21354a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f21355b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f21354a = textView;
            this.f21355b = textView2;
        }

        public void onFinish() {
            this.f21355b.setVisibility(0);
            this.f21354a.setText("0");
            this.f21354a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21354a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21355b.setVisibility(8);
            this.f21354a.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void R1(SellerValidationWithAadhaar sellerValidationWithAadhaar, View view) {
        cm.l.f(sellerValidationWithAadhaar, "this$0");
        sellerValidationWithAadhaar.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void S1(SellerValidationWithAadhaar sellerValidationWithAadhaar, View view) {
        String str;
        cm.l.f(sellerValidationWithAadhaar, "this$0");
        Editable text = sellerValidationWithAadhaar.C1().f25666i.getText();
        cm.l.e(text, "getText(...)");
        if (text.length() == 0 && sellerValidationWithAadhaar.C1().f25660c.isChecked()) {
            str = "Please enter the Aadhaar Number";
        } else if ((sellerValidationWithAadhaar.C1().f25666i.getText().length() >= 12 || !sellerValidationWithAadhaar.C1().f25660c.isChecked()) && (sellerValidationWithAadhaar.C1().f25666i.getText().length() <= 12 || !sellerValidationWithAadhaar.C1().f25660c.isChecked())) {
            Editable text2 = sellerValidationWithAadhaar.C1().f25666i.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() == 0 && sellerValidationWithAadhaar.C1().C.isChecked()) {
                str = "Please enter the Virtual Id";
            } else if (sellerValidationWithAadhaar.C1().f25666i.getText().length() < 16 && sellerValidationWithAadhaar.C1().C.isChecked()) {
                str = "Please enter the valid Virtual Id";
            } else if (!sellerValidationWithAadhaar.C1().f25661d.isChecked() && sellerValidationWithAadhaar.C1().C.isChecked()) {
                str = "Please agree with VID based e-KYC consent";
            } else if (sellerValidationWithAadhaar.C1().f25661d.isChecked() || !sellerValidationWithAadhaar.C1().f25660c.isChecked()) {
                String str2 = sellerValidationWithAadhaar.C1().C.isChecked() ? "V" : "A";
                sellerValidationWithAadhaar.I1().show();
                sellerValidationWithAadhaar.G1().k(sellerValidationWithAadhaar, sellerValidationWithAadhaar.C1().f25666i.getText().toString(), String.valueOf(sellerValidationWithAadhaar.J1().getRc_regn_no()), sellerValidationWithAadhaar.J1(), str2, VContant.Companion.f(sellerValidationWithAadhaar.K));
                return;
            } else {
                str = "Please agree with Aadhaar based e-KYC consent";
            }
        } else {
            sellerValidationWithAadhaar.d2(sellerValidationWithAadhaar, "Please enter the valid Aadhaar Number");
            return;
        }
        sellerValidationWithAadhaar.d2(sellerValidationWithAadhaar, str);
    }

    /* access modifiers changed from: private */
    public static final void T1(SellerValidationWithAadhaar sellerValidationWithAadhaar, View view) {
        cm.l.f(sellerValidationWithAadhaar, "this$0");
        if (sellerValidationWithAadhaar.C1().C.isChecked()) {
            sellerValidationWithAadhaar.Y = "V";
        }
        sellerValidationWithAadhaar.I1().show();
        sellerValidationWithAadhaar.G1().k(sellerValidationWithAadhaar, sellerValidationWithAadhaar.C1().f25666i.getText().toString(), String.valueOf(sellerValidationWithAadhaar.J1().getRc_regn_no()), sellerValidationWithAadhaar.J1(), sellerValidationWithAadhaar.Y, VContant.Companion.f(sellerValidationWithAadhaar.K));
    }

    /* access modifiers changed from: private */
    public static final void U1(SellerValidationWithAadhaar sellerValidationWithAadhaar, eKycResponse ekycresponse) {
        cm.l.f(sellerValidationWithAadhaar, "this$0");
        sellerValidationWithAadhaar.I1().dismiss();
        try {
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.ApiMessage apiMessage = ekycresponse.getApiMessage();
            String str = null;
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.ApiMessage apiMessage2 = ekycresponse.getApiMessage();
                if (apiMessage2 != null) {
                    str = apiMessage2.getDeveloperMessage();
                }
                sellerValidationWithAadhaar.d2(sellerValidationWithAadhaar, String.valueOf(str));
                return;
            }
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data = ekycresponse.getData();
            sellerValidationWithAadhaar.N = String.valueOf(data != null ? data.getTxNo() : null);
            ld.h hVar = new ld.h(sellerValidationWithAadhaar);
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data2 = ekycresponse.getData();
            hVar.f(String.valueOf(data2 != null ? data2.getTxNo() : null));
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data3 = ekycresponse.getData();
            if (data3 != null) {
                str = data3.getLastFourMobileNumber();
            }
            sellerValidationWithAadhaar.u2(sellerValidationWithAadhaar, String.valueOf(str));
        } catch (Exception unused) {
            sellerValidationWithAadhaar.d2(sellerValidationWithAadhaar, "Unable to process the request, Please try after some time");
        }
    }

    /* access modifiers changed from: private */
    public static final void V1(SellerValidationWithAadhaar sellerValidationWithAadhaar, String str) {
        cm.l.f(sellerValidationWithAadhaar, "this$0");
        sellerValidationWithAadhaar.I1().dismiss();
        sellerValidationWithAadhaar.d2(sellerValidationWithAadhaar, "Unable to process the request, Please try after some time");
    }

    /* access modifiers changed from: private */
    public static final void W1(SellerValidationWithAadhaar sellerValidationWithAadhaar, View view) {
        cm.l.f(sellerValidationWithAadhaar, "this$0");
        sellerValidationWithAadhaar.C1().f25666i.getText().clear();
    }

    /* access modifiers changed from: private */
    public static final void X1(SellerValidationWithAadhaar sellerValidationWithAadhaar, View view) {
        cm.l.f(sellerValidationWithAadhaar, "this$0");
        Dialog dialog = new Dialog(sellerValidationWithAadhaar);
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
        ((TextView) findViewById3).setText(sellerValidationWithAadhaar.C1().C.isChecked() ? "VID based e-KYC consent" : "Aadhaar based e-KYC consent");
        imageView.setOnClickListener(new ch.b0(dialog));
        webView.loadUrl(hc.a.f12073a.g() + sellerValidationWithAadhaar.F1().d() + "/mparivahan-info-terms-of-use-aadhaar.html");
        webView.clearCache(true);
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void Y1(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void Z1(SellerValidationWithAadhaar sellerValidationWithAadhaar, CompoundButton compoundButton, boolean z10) {
        cm.l.f(sellerValidationWithAadhaar, "this$0");
        if (z10) {
            sellerValidationWithAadhaar.C1().C.setChecked(false);
            sellerValidationWithAadhaar.C1().f25660c.setChecked(true);
            sellerValidationWithAadhaar.C1().f25666i.setHint("Enter Aadhaar Number");
            sellerValidationWithAadhaar.C1().f25666i.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(12)});
        }
    }

    /* access modifiers changed from: private */
    public static final void a2(SellerValidationWithAadhaar sellerValidationWithAadhaar, CompoundButton compoundButton, boolean z10) {
        cm.l.f(sellerValidationWithAadhaar, "this$0");
        if (z10) {
            sellerValidationWithAadhaar.C1().f25660c.setChecked(false);
            sellerValidationWithAadhaar.C1().C.setChecked(true);
            sellerValidationWithAadhaar.C1().f25666i.setHint("Enter VID Number");
            sellerValidationWithAadhaar.C1().f25666i.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
        }
    }

    /* access modifiers changed from: private */
    public static final void b2(SellerValidationWithAadhaar sellerValidationWithAadhaar, View view) {
        EditText editText;
        TransformationMethod instance;
        cm.l.f(sellerValidationWithAadhaar, "this$0");
        if (sellerValidationWithAadhaar.C1().f25663f.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            sellerValidationWithAadhaar.C1().f25675r.setImageResource(R.drawable.pass_visible);
            editText = sellerValidationWithAadhaar.C1().f25663f;
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            sellerValidationWithAadhaar.C1().f25675r.setImageResource(R.drawable.mvvm_visibility);
            editText = sellerValidationWithAadhaar.C1().f25663f;
            instance = PasswordTransformationMethod.getInstance();
        }
        editText.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void c2(SellerValidationWithAadhaar sellerValidationWithAadhaar, View view) {
        cm.l.f(sellerValidationWithAadhaar, "this$0");
        sellerValidationWithAadhaar.C1().f25663f.setText("");
    }

    /* access modifiers changed from: private */
    public static final void e2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void v2(EditText editText, ImageView imageView, View view) {
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
    public static final void w2(SellerValidationWithAadhaar sellerValidationWithAadhaar, TextView textView, TextView textView2, View view) {
        cm.l.f(sellerValidationWithAadhaar, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(textView2, "$resendOtp");
        sellerValidationWithAadhaar.I1().show();
        new g(textView, textView2).start();
        new Random().nextInt(1410065407);
        sellerValidationWithAadhaar.I1().show();
        sellerValidationWithAadhaar.G1().k(sellerValidationWithAadhaar, sellerValidationWithAadhaar.C1().f25666i.getText().toString(), String.valueOf(sellerValidationWithAadhaar.J1().getRc_regn_no()), sellerValidationWithAadhaar.J1(), sellerValidationWithAadhaar.Y, VContant.Companion.f(sellerValidationWithAadhaar.K));
    }

    /* access modifiers changed from: private */
    public static final void x2(EditText editText, SellerValidationWithAadhaar sellerValidationWithAadhaar, View view) {
        String str;
        cm.l.f(editText, "$enterOtp");
        cm.l.f(sellerValidationWithAadhaar, "this$0");
        String obj = editText.getText().toString();
        if (obj.length() == 0) {
            str = "Please enter the OTP";
        } else if (obj.length() < 6) {
            str = "Please enter the valid OTP";
        } else {
            sellerValidationWithAadhaar.I1().show();
            if (sellerValidationWithAadhaar.C1().C.isChecked()) {
                sellerValidationWithAadhaar.Y = "V";
            }
            ld.h hVar = new ld.h(sellerValidationWithAadhaar);
            hVar.a();
            sellerValidationWithAadhaar.G1().l(sellerValidationWithAadhaar, sellerValidationWithAadhaar.C1().f25666i.getText().toString(), String.valueOf(sellerValidationWithAadhaar.J1().getRc_regn_no()), sellerValidationWithAadhaar.J1(), sellerValidationWithAadhaar.Y, VContant.Companion.f(sellerValidationWithAadhaar.K), obj, hVar.a());
            return;
        }
        Toast.makeText(sellerValidationWithAadhaar, str, 0).show();
    }

    /* access modifiers changed from: private */
    public static final void y2(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void z2(SellerValidationWithAadhaar sellerValidationWithAadhaar, View view) {
        cm.l.f(sellerValidationWithAadhaar, "this$0");
        Dialog dialog = sellerValidationWithAadhaar.X;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final String A1() {
        String str = this.f21341b0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final String B1() {
        return this.f21345f0;
    }

    public final c9 C1() {
        c9 c9Var = this.G;
        if (c9Var != null) {
            return c9Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final Dialog D1() {
        return this.X;
    }

    public final AadarkycVerify.dOEkyc E1() {
        return this.T;
    }

    public final ld.c F1() {
        ld.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final vd.b G1() {
        vd.b bVar = this.H;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mView");
        return null;
    }

    public final String H1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final ProgressDialog I1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final NrvDetails J1() {
        NrvDetails nrvDetails = this.f21340a0;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final VahanProService K1() {
        VahanProService vahanProService = this.P;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final EkYCService L1() {
        EkYCService ekYCService = this.J;
        if (ekYCService != null) {
            return ekYCService;
        }
        cm.l.v("retrofitService_one");
        return null;
    }

    public final HashMap M1() {
        return this.K;
    }

    public final TOFetchApplicationDetails N1() {
        return this.f21346g0;
    }

    public final h O1() {
        h hVar = this.O;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModelv1");
        return null;
    }

    public final boolean P1() {
        return this.f21344e0;
    }

    public final boolean Q1() {
        return this.f21343d0;
    }

    public final void d2(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new v(dialog));
        dialog.show();
    }

    public final void f2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21342c0 = str;
    }

    public final void g2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21341b0 = str;
    }

    public final void h2(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void i2(c9 c9Var) {
        cm.l.f(c9Var, "<set-?>");
        this.G = c9Var;
    }

    public final void j2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    public final void k2(vd.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.H = bVar;
    }

    public final void l2(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void m2(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void n2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void o2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.f21340a0 = nrvDetails;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TextView textView;
        ld.c F1;
        String str;
        String str2;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vahan_process_with_adhar);
        c9 c10 = c9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        i2(c10);
        setContentView((View) C1().b());
        j2(new ld.c(this));
        q2(EkYCService.f20515a.a(this));
        p2(VahanProService.f21196b.b(this));
        n2(new ProgressDialog(this));
        I1().setMessage("Please wait...");
        I1().setCancelable(false);
        I1().setCanceledOnTouchOutside(false);
        new Random().nextInt(1410065407);
        this.f21345f0 = String.valueOf(getIntent().getStringExtra("applNo"));
        s2(String.valueOf(getIntent().getStringExtra("stateCd")));
        l2(String.valueOf(getIntent().getStringExtra("off_code")));
        g2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        f2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        o2((NrvDetails) serializableExtra);
        this.f21343d0 = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        HashMap hashMap = (HashMap) getIntent().getSerializableExtra("map");
        cm.l.c(hashMap);
        this.K = hashMap;
        this.f21344e0 = getIntent().getBooleanExtra("isBuyer", false);
        this.f21343d0 = true;
        r2(new ld.h(this));
        String rc_regn_no = J1().getRc_regn_no();
        if (!(rc_regn_no == null || rc_regn_no.length() == 0)) {
            C1().f25683z.setText(String.valueOf(J1().getRc_regn_no()));
        }
        if (this.f21344e0) {
            this.f21346g0 = (TOFetchApplicationDetails) getIntent().getSerializableExtra("Buyerdetails");
            C1().f25659b.setText("Aadhar based eKYC of New Owner (Buyer)");
            textView = C1().f25679v.f28308i;
            F1 = F1();
            str = "toSellerHeader";
            str2 = "Transfer of Ownership \n(Buyer)";
        } else {
            C1().f25659b.setText("Aadhar based eKYC of Owner (Seller)");
            textView = C1().f25679v.f28308i;
            F1 = F1();
            str = "toBuyerHeader";
            str2 = "Transfer of Ownership \n(Seller)";
        }
        textView.setText(String.valueOf(F1.b(str, str2)));
        C1().f25679v.f28305f.setOnClickListener(new t(this));
        k2((vd.b) new u0((x0) this, (u0.b) new vd.c(new vd.a(L1()))).a(vd.b.class));
        t2((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(K1()))).a(h.class));
        C1().f25682y.setOnClickListener(new d0(this));
        C1().f25680w.setOnClickListener(new e0(this));
        C1().f25677t.setOnClickListener(new f0(this));
        C1().f25660c.setOnCheckedChangeListener(new g0(this));
        C1().C.setOnCheckedChangeListener(new h0(this));
        C1().f25675r.setOnClickListener(new i0(this));
        C1().f25681x.setOnClickListener(new j0(this));
        G1().g().g(this, new e(new d(this)));
        G1().h().g(this, new e(new a(this)));
        O1().b1().g(this, new e(new b(this)));
        O1().c1().g(this, new e(new c(this)));
        C1().f25673p.setOnClickListener(new k0(this));
        G1().i().g(this, new u(this));
        G1().j().g(this, new c0(this));
    }

    public final void p2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.P = vahanProService;
    }

    public final void q2(EkYCService ekYCService) {
        cm.l.f(ekYCService, "<set-?>");
        this.J = ekYCService;
    }

    public final void r2(ld.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.V = hVar;
    }

    public final void s2(String str) {
        cm.l.f(str, "<set-?>");
        this.Z = str;
    }

    public final void t2(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.O = hVar;
    }

    public final void u2(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "mobile_no");
        Dialog dialog = new Dialog(context);
        this.X = dialog;
        dialog.setContentView(R.layout.aadhaar_diloge);
        Dialog dialog2 = this.X;
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        Dialog dialog3 = this.X;
        if (dialog3 != null) {
            dialog3.setCancelable(false);
        }
        Dialog dialog4 = this.X;
        TextView textView = null;
        Window window = dialog4 != null ? dialog4.getWindow() : null;
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog5 = this.X;
        LinearLayout linearLayout = dialog5 != null ? (LinearLayout) dialog5.findViewById(R.id.pop_up_close) : null;
        cm.l.d(linearLayout, "null cannot be cast to non-null type android.widget.LinearLayout");
        Dialog dialog6 = this.X;
        TextView textView2 = dialog6 != null ? (TextView) dialog6.findViewById(R.id.resendOtp) : null;
        cm.l.d(textView2, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog7 = this.X;
        ImageView imageView = dialog7 != null ? (ImageView) dialog7.findViewById(R.id.showmpin) : null;
        cm.l.d(imageView, "null cannot be cast to non-null type android.widget.ImageView");
        Dialog dialog8 = this.X;
        TextView textView3 = dialog8 != null ? (TextView) dialog8.findViewById(R.id.submitOtp) : null;
        cm.l.d(textView3, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog9 = this.X;
        EditText editText = dialog9 != null ? (EditText) dialog9.findViewById(R.id.enterOtp) : null;
        cm.l.d(editText, "null cannot be cast to non-null type android.widget.EditText");
        Dialog dialog10 = this.X;
        TextView textView4 = dialog10 != null ? (TextView) dialog10.findViewById(R.id.time_text) : null;
        cm.l.d(textView4, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog11 = this.X;
        TextView textView5 = dialog11 != null ? (TextView) dialog11.findViewById(R.id.txt_reset) : null;
        cm.l.d(textView5, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog12 = this.X;
        if (dialog12 != null) {
            textView = (TextView) dialog12.findViewById(R.id.disPlay_mobile);
        }
        cm.l.d(textView, "null cannot be cast to non-null type android.widget.TextView");
        textView.setText("OTP has been sent on your aadhar linked mobile number  \n+91 XXXXXX" + str);
        new f(textView4, textView2).start();
        imageView.setOnClickListener(new w(editText, imageView));
        textView2.setOnClickListener(new ch.x(this, textView4, textView2));
        textView3.setOnClickListener(new y(editText, this));
        textView5.setOnClickListener(new z(editText));
        linearLayout.setOnClickListener(new a0(this));
        Dialog dialog13 = this.X;
        if (dialog13 != null) {
            dialog13.show();
        }
    }

    public final String z1() {
        String str = this.f21342c0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }
}
