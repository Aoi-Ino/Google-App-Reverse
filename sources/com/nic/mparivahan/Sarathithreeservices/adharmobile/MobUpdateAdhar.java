package com.nic.mparivahan.sarathithreeservices.adharmobile;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import bm.l;
import cm.m;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.ApiMessage;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.Data;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOAadhaarResponse;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOEkyc;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import ni.e6;
import nk.a0;
import nk.i;
import nk.j;
import nk.k;
import nk.q;
import nk.r;
import nk.s;
import nk.t;
import nk.u;
import nk.v;
import nk.w;
import nk.y;
import nk.z;
import pl.x;

public final class MobUpdateAdhar extends oi.g {
    public e6 J;
    /* access modifiers changed from: private */
    public Dialog K;
    public ld.f L;
    public ld.g M;
    public ld.c N;
    private String O = "";
    private String P = "";
    private String Q = "";
    private String R = "";
    private String S = "";
    private String T = "";
    private String U;
    private String V;
    private String W;
    private String X = "NA";
    private String Y = "NA";
    public DldetobjX Z;

    /* renamed from: a0  reason: collision with root package name */
    private HashMap f22417a0 = new HashMap();

    /* renamed from: b0  reason: collision with root package name */
    public Context f22418b0;

    /* renamed from: c0  reason: collision with root package name */
    public ProgressDialog f22419c0;

    /* renamed from: d0  reason: collision with root package name */
    public ca.c f22420d0;

    /* renamed from: e0  reason: collision with root package name */
    public EkYCService f22421e0;

    /* renamed from: f0  reason: collision with root package name */
    public ea.a f22422f0;

    /* renamed from: g0  reason: collision with root package name */
    public AdrInterface f22423g0;

    /* renamed from: h0  reason: collision with root package name */
    private String f22424h0 = "allowAddrChange";

    /* renamed from: i0  reason: collision with root package name */
    public ba.b f22425i0;

    /* renamed from: j0  reason: collision with root package name */
    public DlServiceInt f22426j0;

    /* renamed from: k0  reason: collision with root package name */
    private String f22427k0 = "A";

    /* renamed from: l0  reason: collision with root package name */
    private String f22428l0 = "NA";

    /* renamed from: m0  reason: collision with root package name */
    private String f22429m0 = "NA";

    /* renamed from: n0  reason: collision with root package name */
    private String f22430n0 = "NA";

    /* renamed from: o0  reason: collision with root package name */
    private int f22431o0;

    /* renamed from: p0  reason: collision with root package name */
    public VahanProService f22432p0;

    /* renamed from: q0  reason: collision with root package name */
    public h f22433q0;

    /* renamed from: r0  reason: collision with root package name */
    public ArrayList f22434r0;

    /* renamed from: s0  reason: collision with root package name */
    public ArrayList f22435s0;

    /* renamed from: t0  reason: collision with root package name */
    private String f22436t0 = "";

    /* renamed from: u0  reason: collision with root package name */
    private String f22437u0 = "valid";

    /* renamed from: v0  reason: collision with root package name */
    private String f22438v0 = "";

    /* renamed from: w0  reason: collision with root package name */
    public ArrayList f22439w0;

    /* renamed from: x0  reason: collision with root package name */
    public Aadarkyc.DOEkyc f22440x0;

    /* renamed from: y0  reason: collision with root package name */
    private String f22441y0 = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MobUpdateAdhar f22442e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(MobUpdateAdhar mobUpdateAdhar) {
            super(1);
            this.f22442e = mobUpdateAdhar;
        }

        public final void b(AadarkycVerify.Response response) {
            MobUpdateAdhar mobUpdateAdhar;
            String b10;
            AadarkycVerify.dOEkyc dOAuthOTP;
            AadarkycVerify.dOEkyc dOAuthOTP2;
            String last_four_mobile;
            AadarkycVerify.dOEkyc dOAuthOTP3;
            AadarkycVerify.dOEkyc dOAuthOTP4;
            Log.e("response_1", response.toString());
            this.f22442e.g2().dismiss();
            AadarkycVerify.DoAadhaarResponse doAadhaarResponse = response.getDoAadhaarResponse();
            String str = null;
            if (String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getStatus() : null).length() != 0) {
                try {
                    Log.e("CCTVlOGE", "1");
                    if (!(doAadhaarResponse == null || (dOAuthOTP = doAadhaarResponse.getDOAuthOTP()) == null || !cm.l.a(dOAuthOTP.getMobileverify(), Boolean.TRUE))) {
                        String last_four_mobile2 = (doAadhaarResponse == null || (dOAuthOTP4 = doAadhaarResponse.getDOAuthOTP()) == null) ? null : dOAuthOTP4.getLast_four_mobile();
                        if (last_four_mobile2 != null) {
                            if (last_four_mobile2.length() != 0) {
                                if (p.o((doAadhaarResponse == null || (dOAuthOTP3 = doAadhaarResponse.getDOAuthOTP()) == null) ? null : dOAuthOTP3.getStatus(), "success", true)) {
                                    Log.e("CCTVlOGE", "2");
                                    if (doAadhaarResponse != null && (dOAuthOTP2 = doAadhaarResponse.getDOAuthOTP()) != null && (last_four_mobile = dOAuthOTP2.getLast_four_mobile()) != null && last_four_mobile.length() == 4) {
                                        this.f22442e.Z2(String.valueOf(doAadhaarResponse.getTxnNo()));
                                        String l22 = this.f22442e.l2();
                                        cm.l.c(l22);
                                        Log.d("txnNo", l22);
                                        MobUpdateAdhar mobUpdateAdhar2 = this.f22442e;
                                        AadarkycVerify.dOEkyc dOAuthOTP5 = doAadhaarResponse.getDOAuthOTP();
                                        mobUpdateAdhar2.C2(String.valueOf(dOAuthOTP5 != null ? dOAuthOTP5.getLast_four_mobile() : null));
                                        MobUpdateAdhar mobUpdateAdhar3 = this.f22442e;
                                        AadarkycVerify.dOEkyc dOAuthOTP6 = doAadhaarResponse.getDOAuthOTP();
                                        if (dOAuthOTP6 != null) {
                                            str = dOAuthOTP6.getLast_four_mobile();
                                        }
                                        mobUpdateAdhar3.b3(mobUpdateAdhar3, String.valueOf(str));
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                    Log.e("CCTVlOGE", VContant.DUPLICATE_RC_PURPOSE_CODE);
                    String reason = doAadhaarResponse != null ? doAadhaarResponse.getReason() : null;
                    if (reason != null) {
                        if (reason.length() != 0) {
                            Log.v("reason fail", String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null));
                            if (p.o(String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null), "Invalid Auth Xml Format.", true)) {
                                mobUpdateAdhar = this.f22442e;
                                b10 = "Invalid Aadhaar No.\nPlease try again";
                                mobUpdateAdhar.z2(mobUpdateAdhar, b10);
                            }
                            MobUpdateAdhar mobUpdateAdhar4 = this.f22442e;
                            if (doAadhaarResponse != null) {
                                str = doAadhaarResponse.getReason();
                            }
                            mobUpdateAdhar4.z2(mobUpdateAdhar4, String.valueOf(str));
                            return;
                        }
                    }
                    mobUpdateAdhar = this.f22442e;
                    b10 = mobUpdateAdhar.c2().b("service_is_not_present", this.f22442e.getString(R.string.unable_to_get_details));
                    mobUpdateAdhar.z2(mobUpdateAdhar, b10);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AadarkycVerify.Response) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MobUpdateAdhar f22443e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MobUpdateAdhar mobUpdateAdhar) {
            super(1);
            this.f22443e = mobUpdateAdhar;
        }

        public final void b(String str) {
            Log.e("response_2", str.toString());
            this.f22443e.g2().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MobUpdateAdhar f22444e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MobUpdateAdhar mobUpdateAdhar) {
            super(1);
            this.f22444e = mobUpdateAdhar;
        }

        /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x0214 A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x021e A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0070 A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0092 A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0097 A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00b1 A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00b6 A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00d5 A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00da A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00eb A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00f0 A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00ff A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0104 A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0113 A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0118 A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0127 A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x012c A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x013b A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0140 A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x015d A[Catch:{ Exception -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0166 A[Catch:{ Exception -> 0x0062 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.VahanEkyc.Aadarkyc.Response r8) {
            /*
                r7 = this;
                java.lang.String r0 = "files"
                java.lang.String r1 = r8.toString()
                java.lang.String r2 = "response_3"
                android.util.Log.e(r2, r1)
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r1 = r7.f22444e
                android.app.ProgressDialog r1 = r1.g2()
                r1.dismiss()
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DoAadhaarResponse r8 = r8.getDoAadhaarResponse()
                r1 = 0
                if (r8 == 0) goto L_0x0020
                java.lang.String r2 = r8.getStatus()
                goto L_0x0021
            L_0x0020:
                r2 = r1
            L_0x0021:
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r3 = "status_response"
                android.util.Log.d(r3, r2)
                if (r8 == 0) goto L_0x0031
                java.lang.String r2 = r8.getStatus()
                goto L_0x0032
            L_0x0031:
                r2 = r1
            L_0x0032:
                java.lang.String r2 = java.lang.String.valueOf(r2)
                int r2 = r2.length()
                java.lang.String r3 = "dial"
                if (r2 != 0) goto L_0x0040
                goto L_0x0242
            L_0x0040:
                if (r8 == 0) goto L_0x0047
                java.lang.String r2 = r8.getStatus()
                goto L_0x0048
            L_0x0047:
                r2 = r1
            L_0x0048:
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r4 = "Y"
                r5 = 1
                boolean r2 = km.p.o(r2, r4, r5)
                if (r2 == 0) goto L_0x0242
                if (r8 == 0) goto L_0x0065
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r2 = r8.getDOEkyc()     // Catch:{ Exception -> 0x0062 }
                if (r2 == 0) goto L_0x0065
                java.lang.String r2 = r2.getName()     // Catch:{ Exception -> 0x0062 }
                goto L_0x0066
            L_0x0062:
                r8 = move-exception
                goto L_0x0235
            L_0x0065:
                r2 = r1
            L_0x0066:
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0062 }
                int r2 = r2.length()     // Catch:{ Exception -> 0x0062 }
                if (r2 != 0) goto L_0x0071
                goto L_0x0088
            L_0x0071:
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                if (r8 == 0) goto L_0x0080
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r8.getDOEkyc()     // Catch:{ Exception -> 0x0062 }
                if (r4 == 0) goto L_0x0080
                java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0062 }
                goto L_0x0081
            L_0x0080:
                r4 = r1
            L_0x0081:
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0062 }
                r2.R2(r4)     // Catch:{ Exception -> 0x0062 }
            L_0x0088:
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                if (r8 == 0) goto L_0x0097
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r8.getDOEkyc()     // Catch:{ Exception -> 0x0062 }
                if (r4 == 0) goto L_0x0097
                java.lang.String r4 = r4.getGender()     // Catch:{ Exception -> 0x0062 }
                goto L_0x0098
            L_0x0097:
                r4 = r1
            L_0x0098:
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0062 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0062 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0062 }
                r2.H2(r4)     // Catch:{ Exception -> 0x0062 }
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                if (r8 == 0) goto L_0x00b6
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r8.getDOEkyc()     // Catch:{ Exception -> 0x0062 }
                if (r4 == 0) goto L_0x00b6
                java.lang.String r4 = r4.getPht()     // Catch:{ Exception -> 0x0062 }
                goto L_0x00b7
            L_0x00b6:
                r4 = r1
            L_0x00b7:
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0062 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0062 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0062 }
                r2.I2(r4)     // Catch:{ Exception -> 0x0062 }
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0062 }
                r4.<init>()     // Catch:{ Exception -> 0x0062 }
                if (r8 == 0) goto L_0x00da
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r8.getDOEkyc()     // Catch:{ Exception -> 0x0062 }
                if (r5 == 0) goto L_0x00da
                java.lang.String r5 = r5.getHouse()     // Catch:{ Exception -> 0x0062 }
                goto L_0x00db
            L_0x00da:
                r5 = r1
            L_0x00db:
                r4.append(r5)     // Catch:{ Exception -> 0x0062 }
                r5 = 32
                r4.append(r5)     // Catch:{ Exception -> 0x0062 }
                if (r8 == 0) goto L_0x00f0
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r8.getDOEkyc()     // Catch:{ Exception -> 0x0062 }
                if (r6 == 0) goto L_0x00f0
                java.lang.String r6 = r6.getStreet()     // Catch:{ Exception -> 0x0062 }
                goto L_0x00f1
            L_0x00f0:
                r6 = r1
            L_0x00f1:
                r4.append(r6)     // Catch:{ Exception -> 0x0062 }
                r4.append(r5)     // Catch:{ Exception -> 0x0062 }
                if (r8 == 0) goto L_0x0104
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r8.getDOEkyc()     // Catch:{ Exception -> 0x0062 }
                if (r6 == 0) goto L_0x0104
                java.lang.String r6 = r6.getLocalityIfAny()     // Catch:{ Exception -> 0x0062 }
                goto L_0x0105
            L_0x0104:
                r6 = r1
            L_0x0105:
                r4.append(r6)     // Catch:{ Exception -> 0x0062 }
                r4.append(r5)     // Catch:{ Exception -> 0x0062 }
                if (r8 == 0) goto L_0x0118
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r8.getDOEkyc()     // Catch:{ Exception -> 0x0062 }
                if (r6 == 0) goto L_0x0118
                java.lang.String r6 = r6.getDist()     // Catch:{ Exception -> 0x0062 }
                goto L_0x0119
            L_0x0118:
                r6 = r1
            L_0x0119:
                r4.append(r6)     // Catch:{ Exception -> 0x0062 }
                r4.append(r5)     // Catch:{ Exception -> 0x0062 }
                if (r8 == 0) goto L_0x012c
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r8.getDOEkyc()     // Catch:{ Exception -> 0x0062 }
                if (r6 == 0) goto L_0x012c
                java.lang.String r6 = r6.getState()     // Catch:{ Exception -> 0x0062 }
                goto L_0x012d
            L_0x012c:
                r6 = r1
            L_0x012d:
                r4.append(r6)     // Catch:{ Exception -> 0x0062 }
                r4.append(r5)     // Catch:{ Exception -> 0x0062 }
                if (r8 == 0) goto L_0x0140
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r8.getDOEkyc()     // Catch:{ Exception -> 0x0062 }
                if (r5 == 0) goto L_0x0140
                java.lang.String r5 = r5.getPincode()     // Catch:{ Exception -> 0x0062 }
                goto L_0x0141
            L_0x0140:
                r5 = r1
            L_0x0141:
                r4.append(r5)     // Catch:{ Exception -> 0x0062 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0062 }
                r2.D2(r4)     // Catch:{ Exception -> 0x0062 }
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                ld.f r2 = r2.k2()     // Catch:{ Exception -> 0x0062 }
                java.lang.String r2 = r2.b()     // Catch:{ Exception -> 0x0062 }
                java.lang.String r4 = "1"
                boolean r2 = cm.l.a(r2, r4)     // Catch:{ Exception -> 0x0062 }
                if (r2 == 0) goto L_0x0166
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                r4 = 514(0x202, float:7.2E-43)
                r2.X2(r4)     // Catch:{ Exception -> 0x0062 }
                goto L_0x01fa
            L_0x0166:
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                ld.f r2 = r2.k2()     // Catch:{ Exception -> 0x0062 }
                java.lang.String r2 = r2.b()     // Catch:{ Exception -> 0x0062 }
                java.lang.String r4 = "2"
                boolean r2 = cm.l.a(r2, r4)     // Catch:{ Exception -> 0x0062 }
                if (r2 == 0) goto L_0x0181
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                r4 = 513(0x201, float:7.19E-43)
                r2.X2(r4)     // Catch:{ Exception -> 0x0062 }
                goto L_0x01fa
            L_0x0181:
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                ld.f r2 = r2.k2()     // Catch:{ Exception -> 0x0062 }
                java.lang.String r2 = r2.b()     // Catch:{ Exception -> 0x0062 }
                java.lang.String r4 = "3"
                boolean r2 = cm.l.a(r2, r4)     // Catch:{ Exception -> 0x0062 }
                if (r2 == 0) goto L_0x019b
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                r4 = 515(0x203, float:7.22E-43)
                r2.X2(r4)     // Catch:{ Exception -> 0x0062 }
                goto L_0x01fa
            L_0x019b:
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                ld.f r2 = r2.k2()     // Catch:{ Exception -> 0x0062 }
                java.lang.String r2 = r2.b()     // Catch:{ Exception -> 0x0062 }
                java.lang.String r4 = "4"
                boolean r2 = cm.l.a(r2, r4)     // Catch:{ Exception -> 0x0062 }
                if (r2 == 0) goto L_0x01b5
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                r4 = 525(0x20d, float:7.36E-43)
                r2.X2(r4)     // Catch:{ Exception -> 0x0062 }
                goto L_0x01fa
            L_0x01b5:
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                ld.f r2 = r2.k2()     // Catch:{ Exception -> 0x0062 }
                java.lang.String r2 = r2.b()     // Catch:{ Exception -> 0x0062 }
                java.lang.String r4 = "5"
                boolean r2 = cm.l.a(r2, r4)     // Catch:{ Exception -> 0x0062 }
                if (r2 == 0) goto L_0x01cf
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                r4 = 523(0x20b, float:7.33E-43)
                r2.X2(r4)     // Catch:{ Exception -> 0x0062 }
                goto L_0x01fa
            L_0x01cf:
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                ld.f r2 = r2.k2()     // Catch:{ Exception -> 0x0062 }
                java.lang.String r2 = r2.b()     // Catch:{ Exception -> 0x0062 }
                java.lang.String r4 = "6"
                boolean r2 = cm.l.a(r2, r4)     // Catch:{ Exception -> 0x0062 }
                if (r2 == 0) goto L_0x01e9
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                r4 = 516(0x204, float:7.23E-43)
                r2.X2(r4)     // Catch:{ Exception -> 0x0062 }
                goto L_0x01fa
            L_0x01e9:
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r2 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                ld.f r4 = r2.k2()     // Catch:{ Exception -> 0x0062 }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x0062 }
                int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x0062 }
                r2.X2(r4)     // Catch:{ Exception -> 0x0062 }
            L_0x01fa:
                android.util.Log.d(r0, r0)     // Catch:{ Exception -> 0x0062 }
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r0 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                cm.l.c(r8)     // Catch:{ Exception -> 0x0062 }
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r8 = r8.getDOEkyc()     // Catch:{ Exception -> 0x0062 }
                cm.l.c(r8)     // Catch:{ Exception -> 0x0062 }
                r0.B2(r8)     // Catch:{ Exception -> 0x0062 }
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r8 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                android.app.Dialog r8 = r8.K     // Catch:{ Exception -> 0x0062 }
                if (r8 != 0) goto L_0x0218
                cm.l.v(r3)     // Catch:{ Exception -> 0x0062 }
                r8 = r1
            L_0x0218:
                boolean r8 = r8.isShowing()     // Catch:{ Exception -> 0x0062 }
                if (r8 == 0) goto L_0x022e
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r8 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                android.app.Dialog r8 = r8.K     // Catch:{ Exception -> 0x0062 }
                if (r8 != 0) goto L_0x022a
                cm.l.v(r3)     // Catch:{ Exception -> 0x0062 }
                goto L_0x022b
            L_0x022a:
                r1 = r8
            L_0x022b:
                r1.dismiss()     // Catch:{ Exception -> 0x0062 }
            L_0x022e:
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r8 = r7.f22444e     // Catch:{ Exception -> 0x0062 }
                r8.R1()     // Catch:{ Exception -> 0x0062 }
                goto L_0x02a5
            L_0x0235:
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r0 = r7.f22444e
                android.app.ProgressDialog r0 = r0.g2()
                r0.dismiss()
                r8.printStackTrace()
                goto L_0x02a5
            L_0x0242:
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r0 = r7.f22444e
                android.app.ProgressDialog r0 = r0.g2()
                r0.dismiss()
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r0 = r7.f22444e
                android.app.Dialog r0 = r0.K
                if (r0 != 0) goto L_0x0257
                cm.l.v(r3)
                r0 = r1
            L_0x0257:
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x026c
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r0 = r7.f22444e
                android.app.Dialog r0 = r0.K
                if (r0 != 0) goto L_0x0269
                cm.l.v(r3)
                r0 = r1
            L_0x0269:
                r0.dismiss()
            L_0x026c:
                if (r8 == 0) goto L_0x0273
                java.lang.String r0 = r8.getReason()
                goto L_0x0274
            L_0x0273:
                r0 = r1
            L_0x0274:
                if (r0 == 0) goto L_0x028d
                int r0 = r0.length()
                if (r0 != 0) goto L_0x027d
                goto L_0x028d
            L_0x027d:
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r0 = r7.f22444e
                if (r8 == 0) goto L_0x0285
                java.lang.String r1 = r8.getReason()
            L_0x0285:
                java.lang.String r8 = java.lang.String.valueOf(r1)
                r0.z2(r0, r8)
                goto L_0x02a5
            L_0x028d:
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r8 = r7.f22444e
                ld.c r0 = r8.c2()
                com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar r1 = r7.f22444e
                r2 = 2132019337(0x7f140889, float:1.9677006E38)
                java.lang.String r1 = r1.getString(r2)
                java.lang.String r2 = "service_is_not_present"
                java.lang.String r0 = r0.b(r2, r1)
                r8.z2(r8, r0)
            L_0x02a5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar.c.b(com.nic.mparivahan.VahanEkyc.Aadarkyc$Response):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Aadarkyc.Response) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MobUpdateAdhar f22445e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(MobUpdateAdhar mobUpdateAdhar) {
            super(1);
            this.f22445e = mobUpdateAdhar;
        }

        public final void b(String str) {
            this.f22445e.g2().dismiss();
            MobUpdateAdhar mobUpdateAdhar = this.f22445e;
            mobUpdateAdhar.z2(mobUpdateAdhar, mobUpdateAdhar.c2().b("service_is_not_present", this.f22445e.getString(R.string.unable_to_get_details)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f22446a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f22446a = lVar;
        }

        public final pl.c a() {
            return this.f22446a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22446a.invoke(obj);
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
        final /* synthetic */ TextView f22447a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f22448b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f22447a = textView;
            this.f22448b = textView2;
        }

        public void onFinish() {
            this.f22448b.setVisibility(0);
            this.f22447a.setText("0");
            this.f22447a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f22447a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f22448b.setVisibility(8);
            this.f22447a.setVisibility(0);
        }
    }

    public static final class g extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f22449a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f22450b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f22449a = textView;
            this.f22450b = textView2;
        }

        public void onFinish() {
            this.f22450b.setVisibility(0);
            this.f22449a.setText("0");
            this.f22449a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f22449a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f22450b.setVisibility(8);
            this.f22449a.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void A2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void R1() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.user_adhar_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.txt_dl_holder_name);
        cm.l.d(findViewById, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.txt_dob_value);
        cm.l.d(findViewById2, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.txt_relation);
        cm.l.d(findViewById3, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.txt_gender);
        cm.l.d(findViewById4, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.close_request);
        cm.l.d(findViewById5, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.widget.CustomWegetLayout");
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.next_request);
        cm.l.d(findViewById6, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.widget.CustomWegetLayout");
        CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.iv_report_traffic_violation_icon_in);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById7;
        View findViewById8 = dialog.findViewById(R.id.round_card_view_in);
        cm.l.d(findViewById8, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        CardView cardView = (CardView) findViewById8;
        View findViewById9 = dialog.findViewById(R.id.txt_dl_no);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById9;
        try {
            String name = Z1().getName();
            cm.l.c(name);
            appCompatTextView.setText(q.B0(name).toString());
            appCompatTextView2.setText(Z1().getDob());
            appCompatTextView3.setText(q.B0(Z1().getCareOf()).toString());
            appCompatTextView4.setText(cm.l.a(q.B0(Z1().getGender()).toString(), "M") ? "Male" : "Female");
            textView.setText(c2().b("dl_no", "DL No. : ") + ' ' + b2().getBioObj().getBioDlno());
            String pht = Z1().getPht();
            if (pht != null) {
                if (pht.length() != 0) {
                    if (!cm.l.a(Z1().getPht(), "")) {
                        cardView.setVisibility(0);
                        imageView.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(Z1().getPht()));
                        customWegetLayout2.setOnClickListener(new k(dialog, this));
                        customWegetLayout.setOnClickListener(new nk.l(dialog));
                        dialog.show();
                    }
                }
            }
            cardView.setVisibility(8);
        } catch (Exception unused) {
        }
        customWegetLayout2.setOnClickListener(new k(dialog, this));
        customWegetLayout.setOnClickListener(new nk.l(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void S1(Dialog dialog, MobUpdateAdhar mobUpdateAdhar, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(mobUpdateAdhar, "this$0");
        dialog.dismiss();
        try {
            Intent intent = new Intent(mobUpdateAdhar, ConfirmMobNo.class);
            intent.putExtra("aadharData", mobUpdateAdhar.Z1());
            intent.putExtra("DLDetails", mobUpdateAdhar.b2());
            intent.putExtra("DL", mobUpdateAdhar.U);
            intent.putExtra("dob", mobUpdateAdhar.V);
            intent.putExtra("aadhaarLastFourDigitMobileNo", mobUpdateAdhar.f22441y0);
            mobUpdateAdhar.startActivity(intent);
            mobUpdateAdhar.finish();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void T1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void W1() {
        a2().f26083k.setOnClickListener(new w(this));
        a2().f26084l.setOnClickListener(new nk.x(this));
    }

    /* access modifiers changed from: private */
    public static final void X1(MobUpdateAdhar mobUpdateAdhar, View view) {
        cm.l.f(mobUpdateAdhar, "this$0");
        mobUpdateAdhar.a2().f26078f.getText().clear();
    }

    /* access modifiers changed from: private */
    public static final void Y1(MobUpdateAdhar mobUpdateAdhar, View view) {
        String str;
        cm.l.f(mobUpdateAdhar, "this$0");
        Editable text = mobUpdateAdhar.a2().f26078f.getText();
        cm.l.e(text, "getText(...)");
        if (text.length() == 0 && mobUpdateAdhar.a2().f26074b.isChecked()) {
            str = "Please enter the Aadhaar Number";
        } else if ((mobUpdateAdhar.a2().f26078f.getText().length() >= 12 || !mobUpdateAdhar.a2().f26074b.isChecked()) && (mobUpdateAdhar.a2().f26078f.getText().length() <= 12 || !mobUpdateAdhar.a2().f26074b.isChecked())) {
            Editable text2 = mobUpdateAdhar.a2().f26078f.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() == 0 && mobUpdateAdhar.a2().f26085m.isChecked()) {
                str = "Please enter the Virtual Id";
            } else if (mobUpdateAdhar.a2().f26078f.getText().length() < 16 && mobUpdateAdhar.a2().f26085m.isChecked()) {
                str = "Please enter the valid Virtual Id";
            } else if (!mobUpdateAdhar.a2().f26077e.isChecked() && mobUpdateAdhar.a2().f26085m.isChecked()) {
                str = "Please agree with VID based e-KYC consent";
            } else if (mobUpdateAdhar.a2().f26077e.isChecked() || !mobUpdateAdhar.a2().f26074b.isChecked()) {
                mobUpdateAdhar.g2().show();
                int nextInt = new Random().nextInt(1410065407);
                String obj = q.B0(mobUpdateAdhar.a2().f26078f.getText().toString()).toString();
                Charset forName = Charset.forName("UTF-8");
                cm.l.e(forName, "forName(charsetName)");
                byte[] bytes = obj.getBytes(forName);
                cm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
                String encodeToString = Base64.encodeToString(bytes, 0);
                ea.a e22 = mobUpdateAdhar.e2();
                cm.l.c(encodeToString);
                e22.g(encodeToString, false, false, false, true, String.valueOf(nextInt), "", "", false);
                return;
            } else {
                str = "Please agree with Aadhaar based e-KYC consent";
            }
        } else {
            mobUpdateAdhar.z2(mobUpdateAdhar, "Please enter the valid Aadhaar Number");
            return;
        }
        mobUpdateAdhar.z2(mobUpdateAdhar, str);
    }

    /* access modifiers changed from: private */
    public static final void c3(MobUpdateAdhar mobUpdateAdhar, View view) {
        cm.l.f(mobUpdateAdhar, "this$0");
        Dialog dialog = mobUpdateAdhar.K;
        if (dialog == null) {
            cm.l.v("dial");
            dialog = null;
        }
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void d3(EditText editText, ImageView imageView, View view) {
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
    public static final void e3(MobUpdateAdhar mobUpdateAdhar, TextView textView, TextView textView2, View view) {
        cm.l.f(mobUpdateAdhar, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(textView2, "$resendOtp");
        mobUpdateAdhar.g2().show();
        new g(textView, textView2).start();
        String obj = q.B0(mobUpdateAdhar.a2().f26078f.getText().toString()).toString();
        Charset forName = Charset.forName("UTF-8");
        cm.l.e(forName, "forName(charsetName)");
        byte[] bytes = obj.getBytes(forName);
        cm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        int nextInt = new Random().nextInt(1410065407);
        ea.a e22 = mobUpdateAdhar.e2();
        cm.l.c(encodeToString);
        e22.g(encodeToString, false, false, false, true, String.valueOf(nextInt), "", "", false);
    }

    /* access modifiers changed from: private */
    public static final void f3(EditText editText, MobUpdateAdhar mobUpdateAdhar, TextView textView, ImageView imageView, View view) {
        ld.c c22;
        String string;
        String str;
        EditText editText2 = editText;
        MobUpdateAdhar mobUpdateAdhar2 = mobUpdateAdhar;
        TextView textView2 = textView;
        ImageView imageView2 = imageView;
        cm.l.f(editText2, "$enterOtp");
        cm.l.f(mobUpdateAdhar2, "this$0");
        cm.l.f(textView2, "$txt_reset");
        cm.l.f(imageView2, "$ok_button");
        String obj = editText.getText().toString();
        if (obj.length() == 0) {
            c22 = mobUpdateAdhar.c2();
            string = mobUpdateAdhar2.getString(R.string.pls_enter_otp);
            str = "label_log_entr_otp";
        } else if (obj.length() < 6) {
            c22 = mobUpdateAdhar.c2();
            string = mobUpdateAdhar2.getString(R.string.pls_enter_valid_otp);
            str = "label_log_entr_val_otp";
        } else {
            mobUpdateAdhar.g2().show();
            String obj2 = q.B0(mobUpdateAdhar.a2().f26078f.getText().toString()).toString();
            Charset forName = Charset.forName("UTF-8");
            cm.l.e(forName, "forName(charsetName)");
            byte[] bytes = obj2.getBytes(forName);
            cm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 0);
            ea.a e22 = mobUpdateAdhar.e2();
            cm.l.c(encodeToString);
            String str2 = mobUpdateAdhar2.W;
            cm.l.c(str2);
            e22.g(encodeToString, false, false, true, true, "987612345", str2, editText.getText().toString(), true);
            textView2.setOnClickListener(new r(editText2));
            imageView2.setOnClickListener(new s(mobUpdateAdhar2));
        }
        Toast.makeText(mobUpdateAdhar2, c22.b(str, string), 0).show();
        textView2.setOnClickListener(new r(editText2));
        imageView2.setOnClickListener(new s(mobUpdateAdhar2));
    }

    /* access modifiers changed from: private */
    public static final void g3(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void h3(MobUpdateAdhar mobUpdateAdhar, View view) {
        cm.l.f(mobUpdateAdhar, "this$0");
        Dialog dialog = mobUpdateAdhar.K;
        if (dialog == null) {
            cm.l.v("dial");
            dialog = null;
        }
        dialog.dismiss();
    }

    private final void m2() {
        N2(this);
        Y2(new ld.g(this));
        J2(new ld.c(this));
        V2(EkYCService.f20515a.a(this));
        U2(VahanProService.f21196b.b(this));
        S2(new ProgressDialog(this));
        g2().setMessage(c2().b("label_challan_please_wait", "Please wait..."));
        g2().setCancelable(false);
        g2().setCanceledOnTouchOutside(false);
        this.f22431o0 = cm.l.a(k2().b(), "1") ? 514 : cm.l.a(k2().b(), "2") ? 513 : cm.l.a(k2().b(), VContant.DUPLICATE_RC_PURPOSE_CODE) ? 515 : cm.l.a(k2().b(), VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE) ? 525 : cm.l.a(k2().b(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE) ? 523 : cm.l.a(k2().b(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE) ? 516 : Integer.parseInt(k2().b());
        if (getIntent() != null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            F2((DldetobjX) serializableExtra);
            this.V = String.valueOf(getIntent().getStringExtra("dob"));
            this.U = String.valueOf(getIntent().getStringExtra("DL"));
            String str = this.V;
            cm.l.c(str);
            Log.d("d11", str);
        }
        TextView textView = a2().f26082j;
        String str2 = this.U;
        cm.l.c(str2);
        textView.setText(q.B0(str2).toString());
        T2(DlServiceInt.f21675a.a(this));
        G2((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(h2(), this))).a(ba.b.class));
        O2((ca.c) new u0((x0) this, (u0.b) new ca.b(new ca.a(j2()))).a(ca.c.class));
        a3((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(i2()))).a(h.class));
        L2(AdrInterface.f8352a.b(this));
        M2((ea.a) new u0((x0) this, (u0.b) new ea.b(new ea.d(d2()))).a(ea.a.class));
        a2().f26082j.setText(this.U);
        a2().f26080h.f25961g.setText(k2().i());
    }

    private final void n2() {
        e2().h().g(this, new e(new a(this)));
        e2().i().g(this, new e(new b(this)));
        e2().j().g(this, new e(new c(this)));
        e2().i().g(this, new e(new d(this)));
        f2().j().g(this, new a0(this));
        f2().i().g(this, new nk.g(this));
        f2().h().g(this, new nk.h(this));
        f2().g().g(this, new i(this));
    }

    /* access modifiers changed from: private */
    public static final void o2(MobUpdateAdhar mobUpdateAdhar, String str) {
        cm.l.f(mobUpdateAdhar, "this$0");
        mobUpdateAdhar.g2().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void p2(MobUpdateAdhar mobUpdateAdhar, eKycResponse ekycresponse) {
        cm.l.f(mobUpdateAdhar, "this$0");
        mobUpdateAdhar.g2().dismiss();
        Log.d("adhar_resp", ekycresponse.toString());
        try {
            ApiMessage apiMessage = ekycresponse.getApiMessage();
            String str = null;
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                ApiMessage apiMessage2 = ekycresponse.getApiMessage();
                if (apiMessage2 != null) {
                    str = apiMessage2.getDeveloperMessage();
                }
                mobUpdateAdhar.z2(mobUpdateAdhar, String.valueOf(str));
                return;
            }
            Data data = ekycresponse.getData();
            String valueOf = String.valueOf(data != null ? data.getTxNo() : null);
            mobUpdateAdhar.W = valueOf;
            cm.l.c(valueOf);
            if (valueOf.length() > 23) {
                String str2 = mobUpdateAdhar.W;
                cm.l.c(str2);
                if (q.F(str2, "T", false, 2, (Object) null)) {
                    String str3 = mobUpdateAdhar.W;
                    cm.l.c(str3);
                    String substring = str3.substring(0, 23);
                    cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    mobUpdateAdhar.W = substring;
                    cm.l.c(substring);
                    mobUpdateAdhar.W = p.w(substring, "T", " ", false, 4, (Object) null);
                    Date parse = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").parse(mobUpdateAdhar.W);
                    cm.l.d(parse, "null cannot be cast to non-null type java.util.Date");
                    String l10 = Long.toString(parse.getTime() / 1000);
                    cm.l.c(l10);
                    String valueOf2 = String.valueOf(Long.parseLong(l10) * ((long) 1000));
                    mobUpdateAdhar.W = valueOf2;
                    Log.e("time_Stamp_value", String.valueOf(valueOf2));
                }
            }
            ld.h hVar = new ld.h(mobUpdateAdhar);
            Data data2 = ekycresponse.getData();
            hVar.f(String.valueOf(data2 != null ? data2.getTxNo() : null));
            Data data3 = ekycresponse.getData();
            if (data3 != null) {
                str = data3.getLastFourMobileNumber();
            }
            mobUpdateAdhar.b3(mobUpdateAdhar, String.valueOf(str));
        } catch (Exception unused) {
            mobUpdateAdhar.z2(mobUpdateAdhar, "Unable to process the request, Please try after some time");
        }
    }

    /* access modifiers changed from: private */
    public static final void q2(MobUpdateAdhar mobUpdateAdhar, String str) {
        cm.l.f(mobUpdateAdhar, "this$0");
        mobUpdateAdhar.g2().dismiss();
        mobUpdateAdhar.z2(mobUpdateAdhar, "Unable to process the request, Please try after some time");
    }

    /* access modifiers changed from: private */
    public static final void r2(MobUpdateAdhar mobUpdateAdhar, EkycVerifyResponse ekycVerifyResponse) {
        String str;
        DOEkyc dOEkyc;
        DOEkyc dOEkyc2;
        DOEkyc dOEkyc3;
        DOEkyc dOEkyc4;
        DOEkyc dOEkyc5;
        DOEkyc dOEkyc6;
        DOEkyc dOEkyc7;
        DOEkyc dOEkyc8;
        DOEkyc dOEkyc9;
        DOEkyc dOEkyc10;
        cm.l.f(mobUpdateAdhar, "this$0");
        Log.d("ekycVerifyResSarathi", ekycVerifyResponse.toString());
        try {
            com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.Data data = ekycVerifyResponse.getData();
            Object obj = null;
            DOAadhaarResponse dOAadhaarResponse = data != null ? data.getDOAadhaarResponse() : null;
            if (String.valueOf(dOAadhaarResponse != null ? dOAadhaarResponse.getStatus() : null).length() != 0) {
                if (p.o(String.valueOf(dOAadhaarResponse != null ? dOAadhaarResponse.getStatus() : null), "Y", true)) {
                    try {
                        ld.h hVar = new ld.h(mobUpdateAdhar);
                        String str2 = mobUpdateAdhar.W;
                        cm.l.c(str2);
                        hVar.f(str2);
                        if (String.valueOf((dOAadhaarResponse == null || (dOEkyc10 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc10.getName()).length() != 0) {
                            mobUpdateAdhar.X = String.valueOf((dOAadhaarResponse == null || (dOEkyc9 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc9.getName());
                        }
                        if (String.valueOf((dOAadhaarResponse == null || (dOEkyc8 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc8.getGender()).length() != 0) {
                            mobUpdateAdhar.f22430n0 = String.valueOf((dOAadhaarResponse == null || (dOEkyc7 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc7.getGender());
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((dOAadhaarResponse == null || (dOEkyc6 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc6.getHouse());
                        sb2.append(' ');
                        sb2.append((dOAadhaarResponse == null || (dOEkyc5 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc5.getStreet());
                        sb2.append(' ');
                        sb2.append((dOAadhaarResponse == null || (dOEkyc4 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc4.getLocalityIfAny());
                        sb2.append(' ');
                        sb2.append((dOAadhaarResponse == null || (dOEkyc3 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc3.getDist());
                        sb2.append(' ');
                        sb2.append((dOAadhaarResponse == null || (dOEkyc2 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc2.getState());
                        sb2.append(' ');
                        if (!(dOAadhaarResponse == null || (dOEkyc = dOAadhaarResponse.getDOEkyc()) == null)) {
                            obj = Integer.valueOf(dOEkyc.getPincode());
                        }
                        sb2.append(obj);
                        mobUpdateAdhar.Y = sb2.toString();
                        return;
                    } catch (Exception e10) {
                        mobUpdateAdhar.g2().dismiss();
                        e10.printStackTrace();
                        return;
                    }
                }
            }
            mobUpdateAdhar.g2().dismiss();
            String reason = dOAadhaarResponse != null ? dOAadhaarResponse.getReason() : null;
            if (reason != null) {
                if (reason.length() != 0) {
                    if (dOAadhaarResponse != null) {
                        obj = dOAadhaarResponse.getReason();
                    }
                    str = String.valueOf(obj);
                    mobUpdateAdhar.z2(mobUpdateAdhar, str);
                }
            }
            str = "Unable to verify the request, Please try after some time";
            mobUpdateAdhar.z2(mobUpdateAdhar, str);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void s2(MobUpdateAdhar mobUpdateAdhar, View view) {
        cm.l.f(mobUpdateAdhar, "this$0");
        mobUpdateAdhar.finish();
    }

    /* access modifiers changed from: private */
    public static final void t2(MobUpdateAdhar mobUpdateAdhar, View view) {
        cm.l.f(mobUpdateAdhar, "this$0");
        mobUpdateAdhar.finish();
    }

    /* access modifiers changed from: private */
    public static final void u2(MobUpdateAdhar mobUpdateAdhar, CompoundButton compoundButton, boolean z10) {
        cm.l.f(mobUpdateAdhar, "this$0");
        if (z10) {
            mobUpdateAdhar.a2().f26085m.setChecked(false);
            mobUpdateAdhar.a2().f26074b.setChecked(true);
            mobUpdateAdhar.a2().f26078f.setHint("Enter Aadhaar Number");
            mobUpdateAdhar.a2().f26078f.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(12)});
            MyTextView myTextView = mobUpdateAdhar.a2().f26075c;
            myTextView.setText(Html.fromHtml("I have read and agree to " + "<font color=\"#008ed8\"><b><u>Aadhaar based e-KYC consent</u></b></font>"));
            mobUpdateAdhar.f22427k0 = "A";
        }
    }

    /* access modifiers changed from: private */
    public static final void v2(MobUpdateAdhar mobUpdateAdhar, CompoundButton compoundButton, boolean z10) {
        cm.l.f(mobUpdateAdhar, "this$0");
        if (z10) {
            mobUpdateAdhar.a2().f26074b.setChecked(false);
            mobUpdateAdhar.a2().f26085m.setChecked(true);
            mobUpdateAdhar.a2().f26078f.setHint("Enter VID Number");
            mobUpdateAdhar.a2().f26078f.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
            MyTextView myTextView = mobUpdateAdhar.a2().f26075c;
            myTextView.setText(Html.fromHtml("I have read and agree to " + "<font color=\"#008ed8\"><b><u>VID based e-KYC consent</u></b></font>"));
            mobUpdateAdhar.f22427k0 = "V";
        }
    }

    /* access modifiers changed from: private */
    public static final void w2(MobUpdateAdhar mobUpdateAdhar, View view) {
        cm.l.f(mobUpdateAdhar, "this$0");
        if (cm.l.a(mobUpdateAdhar.k2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                Dialog dialog = new Dialog(mobUpdateAdhar);
                dialog.setContentView(R.layout.layout_multi);
                Window window = dialog.getWindow();
                cm.l.c(window);
                window.setBackgroundDrawable(new ColorDrawable(0));
                View findViewById = dialog.findViewById(R.id.service_label_cross);
                cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                View findViewById2 = dialog.findViewById(R.id.pop_up_close);
                cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) findViewById2;
                View findViewById3 = dialog.findViewById(R.id.service_label_list);
                cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById4 = dialog.findViewById(R.id.service_label_list_serial);
                cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById5 = dialog.findViewById(R.id.dl_services);
                cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
                textView.setText(mobUpdateAdhar.c2().b("btn_ok", "OK"));
                ((TextView) findViewById5).setText(mobUpdateAdhar.c2().b("title_dl_services", "Driving Licence Services"));
                ((ImageView) findViewById).setOnClickListener(new y(dialog));
                ((TextView) findViewById4).setText(R.string.multi_string_serial);
                ((TextView) findViewById3).setText(mobUpdateAdhar.c2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL") + 10 + mobUpdateAdhar.c2().b("check_dl_serv_renewal_dl", "Renewal of DL") + 10 + mobUpdateAdhar.c2().b("check_dl_serv_change_addr", "Change of Address in DL") + 10 + mobUpdateAdhar.c2().b("check_dl_serv_replacement_dl", "Replacement of DL") + 10 + mobUpdateAdhar.c2().b("hill_region_title", "Endorsement to Drive in Hill Region") + 10 + mobUpdateAdhar.c2().b("change_name_dl", "Change of Name in DL") + 10 + mobUpdateAdhar.c2().b("change_birth_dl", "Change of Date of Birth in DL") + 10 + mobUpdateAdhar.c2().b("label_international_driv_permit", "International Driving Permit"));
                textView.setOnClickListener(new z(dialog));
                Window window2 = dialog.getWindow();
                cm.l.c(window2);
                window2.setGravity(48);
                window2.setLayout(-2, -2);
                dialog.show();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void x2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void y2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final void B2(Aadarkyc.DOEkyc dOEkyc) {
        cm.l.f(dOEkyc, "<set-?>");
        this.f22440x0 = dOEkyc;
    }

    public final void C2(String str) {
        cm.l.f(str, "<set-?>");
        this.f22441y0 = str;
    }

    public final void D2(String str) {
        cm.l.f(str, "<set-?>");
        this.Y = str;
    }

    public final void E2(e6 e6Var) {
        cm.l.f(e6Var, "<set-?>");
        this.J = e6Var;
    }

    public final void F2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.Z = dldetobjX;
    }

    public final void G2(ba.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.f22425i0 = bVar;
    }

    public final void H2(String str) {
        cm.l.f(str, "<set-?>");
        this.f22430n0 = str;
    }

    public final void I2(String str) {
        cm.l.f(str, "<set-?>");
        this.f22429m0 = str;
    }

    public final void J2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.N = cVar;
    }

    public final void K2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f22439w0 = arrayList;
    }

    public final void L2(AdrInterface adrInterface) {
        cm.l.f(adrInterface, "<set-?>");
        this.f22423g0 = adrInterface;
    }

    public final void M2(ea.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.f22422f0 = aVar;
    }

    public final void N2(Context context) {
        cm.l.f(context, "<set-?>");
        this.f22418b0 = context;
    }

    public final void O2(ca.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f22420d0 = cVar;
    }

    public final void P2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f22435s0 = arrayList;
    }

    public final void Q2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f22434r0 = arrayList;
    }

    public final void R2(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final void S2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.f22419c0 = progressDialog;
    }

    public final void T2(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.f22426j0 = dlServiceInt;
    }

    public final void U2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.f22432p0 = vahanProService;
    }

    public final void V2(EkYCService ekYCService) {
        cm.l.f(ekYCService, "<set-?>");
        this.f22421e0 = ekYCService;
    }

    public final void W2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.L = fVar;
    }

    public final void X2(int i10) {
        this.f22431o0 = i10;
    }

    public final void Y2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.M = gVar;
    }

    public final Aadarkyc.DOEkyc Z1() {
        Aadarkyc.DOEkyc dOEkyc = this.f22440x0;
        if (dOEkyc != null) {
            return dOEkyc;
        }
        cm.l.v("aadhaarData");
        return null;
    }

    public final void Z2(String str) {
        this.W = str;
    }

    public final e6 a2() {
        e6 e6Var = this.J;
        if (e6Var != null) {
            return e6Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final void a3(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.f22433q0 = hVar;
    }

    public final DldetobjX b2() {
        DldetobjX dldetobjX = this.Z;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b3(android.content.Context r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "label_otp_sent_to_mobile"
            java.lang.String r4 = "context"
            cm.l.f(r1, r4)
            java.lang.String r4 = "mobile_no"
            cm.l.f(r2, r4)
            android.app.Dialog r4 = new android.app.Dialog
            r4.<init>(r1)
            r0.K = r4
            r5 = 2131559087(0x7f0d02af, float:1.8743508E38)
            r4.setContentView(r5)
            android.app.Dialog r4 = r0.K
            java.lang.String r6 = "dial"
            if (r4 != 0) goto L_0x0029
            cm.l.v(r6)
            r4 = 0
        L_0x0029:
            r7 = 0
            r4.setCanceledOnTouchOutside(r7)
            android.app.Dialog r4 = r0.K
            if (r4 != 0) goto L_0x0035
            cm.l.v(r6)
            r4 = 0
        L_0x0035:
            r4.setCancelable(r7)
            android.app.Dialog r4 = r0.K
            if (r4 != 0) goto L_0x0040
            cm.l.v(r6)
            r4 = 0
        L_0x0040:
            android.view.Window r4 = r4.getWindow()
            cm.l.c(r4)
            android.graphics.drawable.ColorDrawable r8 = new android.graphics.drawable.ColorDrawable
            r8.<init>(r7)
            r4.setBackgroundDrawable(r8)
            android.app.Dialog r4 = r0.K
            if (r4 != 0) goto L_0x0057
            cm.l.v(r6)
            r4 = 0
        L_0x0057:
            r7 = 2131364107(0x7f0a090b, float:1.8348042E38)
            android.view.View r4 = r4.findViewById(r7)
            java.lang.String r8 = "null cannot be cast to non-null type android.widget.ImageView"
            cm.l.d(r4, r8)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.app.Dialog r9 = r0.K
            if (r9 != 0) goto L_0x006d
            cm.l.v(r6)
            r9 = 0
        L_0x006d:
            r10 = 2131364334(0x7f0a09ee, float:1.8348502E38)
            android.view.View r9 = r9.findViewById(r10)
            java.lang.String r10 = "null cannot be cast to non-null type android.widget.TextView"
            cm.l.d(r9, r10)
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.app.Dialog r11 = r0.K
            if (r11 != 0) goto L_0x0083
            cm.l.v(r6)
            r11 = 0
        L_0x0083:
            r12 = 2131364556(0x7f0a0acc, float:1.8348952E38)
            android.view.View r11 = r11.findViewById(r12)
            cm.l.d(r11, r8)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            android.app.Dialog r12 = r0.K
            if (r12 != 0) goto L_0x0097
            cm.l.v(r6)
            r12 = 0
        L_0x0097:
            r13 = 2131364703(0x7f0a0b5f, float:1.834925E38)
            android.view.View r12 = r12.findViewById(r13)
            cm.l.d(r12, r10)
            android.widget.TextView r12 = (android.widget.TextView) r12
            android.app.Dialog r13 = r0.K
            if (r13 != 0) goto L_0x00ab
            cm.l.v(r6)
            r13 = 0
        L_0x00ab:
            r14 = 2131362887(0x7f0a0447, float:1.8345567E38)
            android.view.View r13 = r13.findViewById(r14)
            java.lang.String r14 = "null cannot be cast to non-null type android.widget.EditText"
            cm.l.d(r13, r14)
            android.widget.EditText r13 = (android.widget.EditText) r13
            android.app.Dialog r14 = r0.K
            if (r14 != 0) goto L_0x00c1
            cm.l.v(r6)
            r14 = 0
        L_0x00c1:
            r15 = 2131364846(0x7f0a0bee, float:1.834954E38)
            android.view.View r14 = r14.findViewById(r15)
            cm.l.d(r14, r10)
            android.widget.TextView r14 = (android.widget.TextView) r14
            android.app.Dialog r15 = r0.K
            if (r15 != 0) goto L_0x00d5
            cm.l.v(r6)
            r15 = 0
        L_0x00d5:
            r5 = 2131365454(0x7f0a0e4e, float:1.8350774E38)
            android.view.View r5 = r15.findViewById(r5)
            cm.l.d(r5, r10)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.app.Dialog r15 = r0.K
            if (r15 != 0) goto L_0x00e9
            cm.l.v(r6)
            r15 = 0
        L_0x00e9:
            r7 = 2131362527(0x7f0a02df, float:1.8344837E38)
            android.view.View r7 = r15.findViewById(r7)
            cm.l.d(r7, r10)
            android.widget.TextView r7 = (android.widget.TextView) r7
            android.app.Dialog r10 = r0.K
            if (r10 != 0) goto L_0x00fd
            cm.l.v(r6)
            r10 = 0
        L_0x00fd:
            r15 = 2131364107(0x7f0a090b, float:1.8348042E38)
            android.view.View r10 = r10.findViewById(r15)
            cm.l.d(r10, r8)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            nk.m r8 = new nk.m
            r8.<init>(r0)
            r10.setOnClickListener(r8)
            r8 = 2132018623(0x7f1405bf, float:1.9675558E38)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013a }
            r10.<init>()     // Catch:{ Exception -> 0x013a }
            ld.c r15 = r17.c2()     // Catch:{ Exception -> 0x013a }
            r16 = r6
            java.lang.String r6 = r1.getString(r8)     // Catch:{ Exception -> 0x013c }
            java.lang.String r6 = r15.b(r3, r6)     // Catch:{ Exception -> 0x013c }
            r10.append(r6)     // Catch:{ Exception -> 0x013c }
            java.lang.String r6 = "\n+91-XXXXXX"
            r10.append(r6)     // Catch:{ Exception -> 0x013c }
            r10.append(r2)     // Catch:{ Exception -> 0x013c }
            java.lang.String r2 = r10.toString()     // Catch:{ Exception -> 0x013c }
            r7.setText(r2)     // Catch:{ Exception -> 0x013c }
            goto L_0x014b
        L_0x013a:
            r16 = r6
        L_0x013c:
            ld.c r2 = r17.c2()
            java.lang.String r1 = r1.getString(r8)
            java.lang.String r1 = r2.b(r3, r1)
            r7.setText(r1)
        L_0x014b:
            com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar$f r1 = new com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar$f
            r1.<init>(r14, r9)
            r1.start()
            nk.n r1 = new nk.n
            r1.<init>(r13, r11)
            r11.setOnClickListener(r1)
            nk.o r1 = new nk.o
            r1.<init>(r0, r14, r9)
            r9.setOnClickListener(r1)
            nk.p r1 = new nk.p
            r1.<init>(r13, r0, r5, r4)
            r12.setOnClickListener(r1)
            android.app.Dialog r1 = r0.K
            if (r1 != 0) goto L_0x0174
            cm.l.v(r16)
            r5 = 0
            goto L_0x0175
        L_0x0174:
            r5 = r1
        L_0x0175:
            r5.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar.b3(android.content.Context, java.lang.String):void");
    }

    public final ld.c c2() {
        ld.c cVar = this.N;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final AdrInterface d2() {
        AdrInterface adrInterface = this.f22423g0;
        if (adrInterface != null) {
            return adrInterface;
        }
        cm.l.v("mAadharInterface2");
        return null;
    }

    public final ea.a e2() {
        ea.a aVar = this.f22422f0;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mAadharViewModel2");
        return null;
    }

    public final ca.c f2() {
        ca.c cVar = this.f22420d0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mView");
        return null;
    }

    public final ProgressDialog g2() {
        ProgressDialog progressDialog = this.f22419c0;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final DlServiceInt h2() {
        DlServiceInt dlServiceInt = this.f22426j0;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final VahanProService i2() {
        VahanProService vahanProService = this.f22432p0;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitServiceVahan");
        return null;
    }

    public final EkYCService j2() {
        EkYCService ekYCService = this.f22421e0;
        if (ekYCService != null) {
            return ekYCService;
        }
        cm.l.v("retrofitService_one");
        return null;
    }

    public final ld.f k2() {
        ld.f fVar = this.L;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final String l2() {
        return this.W;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e6 c10 = e6.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        E2(c10);
        setContentView((View) a2().b());
        J2(new ld.c(this));
        W2(new ld.f(this));
        Q2(new ArrayList());
        K2(new ArrayList());
        P2(new ArrayList());
        a2().f26079g.f29580g.setText(c2().b("label_dl_serv_update_mob", "Update Mobile Number"));
        a2().f26079g.f29581h.setVisibility(8);
        a2().f26079g.f29577d.setOnClickListener(new nk.f(this));
        m2();
        W1();
        n2();
        a2().f26079g.f29577d.setOnClickListener(new q(this));
        a2().f26074b.setOnCheckedChangeListener(new t(this));
        a2().f26085m.setOnCheckedChangeListener(new u(this));
        a2().f26079g.f29580g.setOnClickListener(new v(this));
    }

    public final void z2(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new j(dialog));
        dialog.show();
    }
}
