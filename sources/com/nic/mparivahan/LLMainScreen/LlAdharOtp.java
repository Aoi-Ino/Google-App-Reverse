package com.nic.mparivahan.LLMainScreen;

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
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.m;
import com.nic.mparivahan.DLServicesAuth.Model.CustomState.CustomState;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.ApiMessage;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.Data;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOAadhaarResponse;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOEkyc;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.SubmitAdharApi;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.UI.ChangeAddressLL;
import com.nic.mparivahan.LLServices.UI.ChangeNameLL;
import com.nic.mparivahan.LLServices.UI.DuplicateLL;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import ni.e5;
import pl.x;
import qb.j;
import qb.k;
import qb.n;
import qb.o;
import qb.p;
import qb.q;
import qb.r;

public final class LlAdharOtp extends androidx.appcompat.app.d {
    public e5 G;
    public ld.f H;
    public ld.g I;
    public ld.c J;
    private String K = "";
    private String L;
    private String M = "NA";
    private String N = "NA";
    public FetchLlDetails O;
    private HashMap P = new HashMap();
    public Context Q;
    public ProgressDialog R;
    public ca.c S;
    public EkYCService T;
    public da.c U;
    public AadharInterface V;
    private String W = "allowAddrChange";
    public ba.b X;
    public DlServiceInt Y;
    public ea.a Z;

    /* renamed from: a0  reason: collision with root package name */
    public AdrInterface f8945a0;

    /* renamed from: b0  reason: collision with root package name */
    private String f8946b0 = "A";

    /* renamed from: c0  reason: collision with root package name */
    private String f8947c0 = "NA";

    /* renamed from: d0  reason: collision with root package name */
    private String f8948d0 = "NA";

    /* renamed from: e0  reason: collision with root package name */
    private String f8949e0 = "NA";

    /* renamed from: f0  reason: collision with root package name */
    private int f8950f0;

    /* renamed from: g0  reason: collision with root package name */
    public VahanProService f8951g0;

    /* renamed from: h0  reason: collision with root package name */
    public bi.h f8952h0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlAdharOtp f8953e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LlAdharOtp llAdharOtp) {
            super(1);
            this.f8953e = llAdharOtp;
        }

        public final void b(AadarkycVerify.Response response) {
            LlAdharOtp llAdharOtp;
            String b10;
            AadarkycVerify.dOEkyc dOAuthOTP;
            AadarkycVerify.dOEkyc dOAuthOTP2;
            String last_four_mobile;
            AadarkycVerify.dOEkyc dOAuthOTP3;
            AadarkycVerify.dOEkyc dOAuthOTP4;
            Log.e("adhResp_kyc", response.toString());
            this.f8953e.H1().dismiss();
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
                                        this.f8953e.u2(String.valueOf(doAadhaarResponse.getTxnNo()));
                                        String O1 = this.f8953e.O1();
                                        cm.l.c(O1);
                                        Log.d("txnNo", O1);
                                        LlAdharOtp llAdharOtp2 = this.f8953e;
                                        AadarkycVerify.dOEkyc dOAuthOTP5 = doAadhaarResponse.getDOAuthOTP();
                                        if (dOAuthOTP5 != null) {
                                            str = dOAuthOTP5.getLast_four_mobile();
                                        }
                                        llAdharOtp2.w2(llAdharOtp2, String.valueOf(str));
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
                                llAdharOtp = this.f8953e;
                                b10 = "Invalid Aadhaar No.\nPlease try again";
                                llAdharOtp.X1(llAdharOtp, b10);
                            }
                            LlAdharOtp llAdharOtp3 = this.f8953e;
                            if (doAadhaarResponse != null) {
                                str = doAadhaarResponse.getReason();
                            }
                            llAdharOtp3.X1(llAdharOtp3, String.valueOf(str));
                            return;
                        }
                    }
                    llAdharOtp = this.f8953e;
                    b10 = llAdharOtp.z1().b("service_is_not_present", this.f8953e.getString(R.string.unable_to_get_details));
                    llAdharOtp.X1(llAdharOtp, b10);
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
        final /* synthetic */ LlAdharOtp f8954e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LlAdharOtp llAdharOtp) {
            super(1);
            this.f8954e = llAdharOtp;
        }

        public final void b(String str) {
            Log.e("adhResp_kyc_err", str.toString());
            this.f8954e.H1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlAdharOtp f8955e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LlAdharOtp llAdharOtp) {
            super(1);
            this.f8955e = llAdharOtp;
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x021a A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x021f A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x022c A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x0231 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x023e A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0243 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x0250 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x0255 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x0262 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x0267 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x0274 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x0279 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x0286 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x028b A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x0298 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x029d A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x02aa A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x02af A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:158:0x02bc A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:159:0x02c5 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x02d2 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x02d7 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x02e4 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:171:0x02e9 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:176:0x02f6 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:177:0x02fb A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x0308 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x030d A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:188:0x031a A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:189:0x031f A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:194:0x032c A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:195:0x0331 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0067 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0089 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x008e A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00cc A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00d1 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00e2 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00f6 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x00fb A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x010a A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x010f A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x011e A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0123 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0132 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0137 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0154 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x015d A[Catch:{ Exception -> 0x0059 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.VahanEkyc.Aadarkyc.Response r33) {
            /*
                r32 = this;
                r1 = r32
                java.lang.String r0 = "files"
                java.lang.String r2 = r33.toString()
                java.lang.String r3 = "adhResp_kyc_req"
                android.util.Log.e(r3, r2)
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DoAadhaarResponse r2 = r33.getDoAadhaarResponse()
                r3 = 0
                if (r2 == 0) goto L_0x0019
                java.lang.String r4 = r2.getStatus()
                goto L_0x001a
            L_0x0019:
                r4 = r3
            L_0x001a:
                java.lang.String r4 = java.lang.String.valueOf(r4)
                java.lang.String r5 = "status_response"
                android.util.Log.d(r5, r4)
                if (r2 == 0) goto L_0x002a
                java.lang.String r4 = r2.getStatus()
                goto L_0x002b
            L_0x002a:
                r4 = r3
            L_0x002b:
                java.lang.String r4 = java.lang.String.valueOf(r4)
                int r4 = r4.length()
                if (r4 != 0) goto L_0x0037
                goto L_0x03d9
            L_0x0037:
                if (r2 == 0) goto L_0x003e
                java.lang.String r4 = r2.getStatus()
                goto L_0x003f
            L_0x003e:
                r4 = r3
            L_0x003f:
                java.lang.String r4 = java.lang.String.valueOf(r4)
                java.lang.String r5 = "Y"
                r6 = 1
                boolean r4 = km.p.o(r4, r5, r6)
                if (r4 == 0) goto L_0x03d9
                if (r2 == 0) goto L_0x005c
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r4 == 0) goto L_0x005c
                java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0059 }
                goto L_0x005d
            L_0x0059:
                r0 = move-exception
                goto L_0x03cc
            L_0x005c:
                r4 = r3
            L_0x005d:
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0059 }
                int r4 = r4.length()     // Catch:{ Exception -> 0x0059 }
                if (r4 != 0) goto L_0x0068
                goto L_0x007f
            L_0x0068:
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0077
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r5 == 0) goto L_0x0077
                java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0078
            L_0x0077:
                r5 = r3
            L_0x0078:
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0059 }
                r4.n2(r5)     // Catch:{ Exception -> 0x0059 }
            L_0x007f:
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x008e
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r5 == 0) goto L_0x008e
                java.lang.String r5 = r5.getGender()     // Catch:{ Exception -> 0x0059 }
                goto L_0x008f
            L_0x008e:
                r5 = r3
            L_0x008f:
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0059 }
                java.lang.CharSequence r5 = km.q.B0(r5)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0059 }
                r4.c2(r5)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x00ad
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r5 == 0) goto L_0x00ad
                java.lang.String r5 = r5.getPht()     // Catch:{ Exception -> 0x0059 }
                goto L_0x00ae
            L_0x00ad:
                r5 = r3
            L_0x00ae:
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0059 }
                java.lang.CharSequence r5 = km.q.B0(r5)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0059 }
                r4.e2(r5)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0059 }
                r5.<init>()     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x00d1
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r6 == 0) goto L_0x00d1
                java.lang.String r6 = r6.getHouse()     // Catch:{ Exception -> 0x0059 }
                goto L_0x00d2
            L_0x00d1:
                r6 = r3
            L_0x00d2:
                r5.append(r6)     // Catch:{ Exception -> 0x0059 }
                r6 = 32
                r5.append(r6)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x00e7
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r7 == 0) goto L_0x00e7
                java.lang.String r7 = r7.getStreet()     // Catch:{ Exception -> 0x0059 }
                goto L_0x00e8
            L_0x00e7:
                r7 = r3
            L_0x00e8:
                r5.append(r7)     // Catch:{ Exception -> 0x0059 }
                r5.append(r6)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x00fb
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r7 == 0) goto L_0x00fb
                java.lang.String r7 = r7.getLocalityIfAny()     // Catch:{ Exception -> 0x0059 }
                goto L_0x00fc
            L_0x00fb:
                r7 = r3
            L_0x00fc:
                r5.append(r7)     // Catch:{ Exception -> 0x0059 }
                r5.append(r6)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x010f
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r7 == 0) goto L_0x010f
                java.lang.String r7 = r7.getDist()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0110
            L_0x010f:
                r7 = r3
            L_0x0110:
                r5.append(r7)     // Catch:{ Exception -> 0x0059 }
                r5.append(r6)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0123
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r7 == 0) goto L_0x0123
                java.lang.String r7 = r7.getState()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0124
            L_0x0123:
                r7 = r3
            L_0x0124:
                r5.append(r7)     // Catch:{ Exception -> 0x0059 }
                r5.append(r6)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0137
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r6 == 0) goto L_0x0137
                java.lang.String r6 = r6.getPincode()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0138
            L_0x0137:
                r6 = r3
            L_0x0138:
                r5.append(r6)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0059 }
                r4.Z1(r5)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                ld.f r4 = r4.L1()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = "1"
                boolean r4 = cm.l.a(r4, r5)     // Catch:{ Exception -> 0x0059 }
                if (r4 == 0) goto L_0x015d
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                r5 = 514(0x202, float:7.2E-43)
                r4.s2(r5)     // Catch:{ Exception -> 0x0059 }
                goto L_0x01f1
            L_0x015d:
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                ld.f r4 = r4.L1()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = "2"
                boolean r4 = cm.l.a(r4, r5)     // Catch:{ Exception -> 0x0059 }
                if (r4 == 0) goto L_0x0178
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                r5 = 513(0x201, float:7.19E-43)
                r4.s2(r5)     // Catch:{ Exception -> 0x0059 }
                goto L_0x01f1
            L_0x0178:
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                ld.f r4 = r4.L1()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = "3"
                boolean r4 = cm.l.a(r4, r5)     // Catch:{ Exception -> 0x0059 }
                if (r4 == 0) goto L_0x0192
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                r5 = 515(0x203, float:7.22E-43)
                r4.s2(r5)     // Catch:{ Exception -> 0x0059 }
                goto L_0x01f1
            L_0x0192:
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                ld.f r4 = r4.L1()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = "4"
                boolean r4 = cm.l.a(r4, r5)     // Catch:{ Exception -> 0x0059 }
                if (r4 == 0) goto L_0x01ac
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                r5 = 525(0x20d, float:7.36E-43)
                r4.s2(r5)     // Catch:{ Exception -> 0x0059 }
                goto L_0x01f1
            L_0x01ac:
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                ld.f r4 = r4.L1()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = "5"
                boolean r4 = cm.l.a(r4, r5)     // Catch:{ Exception -> 0x0059 }
                if (r4 == 0) goto L_0x01c6
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                r5 = 523(0x20b, float:7.33E-43)
                r4.s2(r5)     // Catch:{ Exception -> 0x0059 }
                goto L_0x01f1
            L_0x01c6:
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                ld.f r4 = r4.L1()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = "6"
                boolean r4 = cm.l.a(r4, r5)     // Catch:{ Exception -> 0x0059 }
                if (r4 == 0) goto L_0x01e0
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                r5 = 516(0x204, float:7.23E-43)
                r4.s2(r5)     // Catch:{ Exception -> 0x0059 }
                goto L_0x01f1
            L_0x01e0:
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r4 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                ld.f r5 = r4.L1()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0059 }
                int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0059 }
                r4.s2(r5)     // Catch:{ Exception -> 0x0059 }
            L_0x01f1:
                android.util.Log.d(r0, r0)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r0 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                da.c r4 = r0.D1()     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r0 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                ni.e5 r0 = r0.u1()     // Catch:{ Exception -> 0x0059 }
                android.widget.EditText r0 = r0.f26066d     // Catch:{ Exception -> 0x0059 }
                android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0059 }
                java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = r0.toString()     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x021f
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x021f
                java.lang.String r0 = r0.getCareOf()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0220
            L_0x021f:
                r0 = r3
            L_0x0220:
                java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0231
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x0231
                java.lang.String r0 = r0.getCode()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0232
            L_0x0231:
                r0 = r3
            L_0x0232:
                java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0243
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x0243
                java.lang.String r0 = r0.getDist()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0244
            L_0x0243:
                r0 = r3
            L_0x0244:
                java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0255
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x0255
                java.lang.String r0 = r0.getDob()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0256
            L_0x0255:
                r0 = r3
            L_0x0256:
                java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0267
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x0267
                java.lang.String r0 = r0.getGender()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0268
            L_0x0267:
                r0 = r3
            L_0x0268:
                java.lang.String r10 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0279
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x0279
                java.lang.String r0 = r0.getHouse()     // Catch:{ Exception -> 0x0059 }
                goto L_0x027a
            L_0x0279:
                r0 = r3
            L_0x027a:
                java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x028b
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x028b
                java.lang.String r0 = r0.getLandMark()     // Catch:{ Exception -> 0x0059 }
                goto L_0x028c
            L_0x028b:
                r0 = r3
            L_0x028c:
                java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x029d
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x029d
                java.lang.String r0 = r0.getLocalityIfAny()     // Catch:{ Exception -> 0x0059 }
                goto L_0x029e
            L_0x029d:
                r0 = r3
            L_0x029e:
                java.lang.String r13 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x02af
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x02af
                java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0059 }
                goto L_0x02b0
            L_0x02af:
                r0 = r3
            L_0x02b0:
                java.lang.String r14 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x02c5
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x02c5
                int r0 = r0.getPhone()     // Catch:{ Exception -> 0x0059 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                goto L_0x02c6
            L_0x02c5:
                r0 = r3
            L_0x02c6:
                java.lang.String r15 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x02d7
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x02d7
                java.lang.String r0 = r0.getPht()     // Catch:{ Exception -> 0x0059 }
                goto L_0x02d8
            L_0x02d7:
                r0 = r3
            L_0x02d8:
                java.lang.String r16 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x02e9
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x02e9
                java.lang.String r0 = r0.getPincode()     // Catch:{ Exception -> 0x0059 }
                goto L_0x02ea
            L_0x02e9:
                r0 = r3
            L_0x02ea:
                java.lang.String r17 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x02fb
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x02fb
                java.lang.String r0 = r0.getState()     // Catch:{ Exception -> 0x0059 }
                goto L_0x02fc
            L_0x02fb:
                r0 = r3
            L_0x02fc:
                java.lang.String r18 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x030d
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x030d
                java.lang.String r0 = r0.getStatus()     // Catch:{ Exception -> 0x0059 }
                goto L_0x030e
            L_0x030d:
                r0 = r3
            L_0x030e:
                java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x031f
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x031f
                java.lang.String r0 = r0.getStreet()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0320
            L_0x031f:
                r0 = r3
            L_0x0320:
                java.lang.String r20 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0331
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x0331
                java.lang.String r0 = r0.getVillageTownCity()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0332
            L_0x0331:
                r0 = r3
            L_0x0332:
                java.lang.String r21 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0342
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x0342
                java.lang.String r3 = r0.getXmlUID()     // Catch:{ Exception -> 0x0059 }
            L_0x0342:
                java.lang.String r22 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r0 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = r0.A1()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r0 = r0.getLearningLicence()     // Catch:{ Exception -> 0x0059 }
                java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r23 = r0.toString()     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r0 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = r0.A1()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r0 = r0.getFullName()     // Catch:{ Exception -> 0x0059 }
                java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r24 = r0.toString()     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r0 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r2 = r0.A1()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r2 = r2.getDateOfBirth()     // Catch:{ Exception -> 0x0059 }
                java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r25 = r0.t1(r2)     // Catch:{ Exception -> 0x0059 }
                cm.l.c(r25)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r0 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = r0.A1()     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.ApplicantAddress r0 = r0.getApplicantAddress()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r26 = r0.getSwdFullName()     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r0 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                int r27 = r0.M1()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r28 = "Y"
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r0 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                java.lang.String r29 = r0.O1()     // Catch:{ Exception -> 0x0059 }
                cm.l.c(r29)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r0 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                ni.e5 r0 = r0.u1()     // Catch:{ Exception -> 0x0059 }
                android.widget.EditText r0 = r0.f26066d     // Catch:{ Exception -> 0x0059 }
                android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0059 }
                java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r30 = r0.toString()     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r0 = r1.f8955e     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = r0.A1()     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.State r0 = r0.getState()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r31 = r0.getStCd()     // Catch:{ Exception -> 0x0059 }
                r4.m(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x0059 }
                goto L_0x0419
            L_0x03cc:
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r2 = r1.f8955e
                android.app.ProgressDialog r2 = r2.H1()
                r2.dismiss()
                r0.printStackTrace()
                goto L_0x0419
            L_0x03d9:
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r0 = r1.f8955e
                android.app.ProgressDialog r0 = r0.H1()
                r0.dismiss()
                if (r2 == 0) goto L_0x03e9
                java.lang.String r0 = r2.getReason()
                goto L_0x03ea
            L_0x03e9:
                r0 = r3
            L_0x03ea:
                if (r0 == 0) goto L_0x0403
                int r0 = r0.length()
                if (r0 != 0) goto L_0x03f3
                goto L_0x0403
            L_0x03f3:
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r0 = r1.f8955e
                if (r2 == 0) goto L_0x03fb
                java.lang.String r3 = r2.getReason()
            L_0x03fb:
                java.lang.String r2 = java.lang.String.valueOf(r3)
            L_0x03ff:
                r0.X1(r0, r2)
                goto L_0x0419
            L_0x0403:
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r0 = r1.f8955e
                ld.c r2 = r0.z1()
                com.nic.mparivahan.LLMainScreen.LlAdharOtp r3 = r1.f8955e
                r4 = 2132019337(0x7f140889, float:1.9677006E38)
                java.lang.String r3 = r3.getString(r4)
                java.lang.String r4 = "service_is_not_present"
                java.lang.String r2 = r2.b(r4, r3)
                goto L_0x03ff
            L_0x0419:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLMainScreen.LlAdharOtp.c.b(com.nic.mparivahan.VahanEkyc.Aadarkyc$Response):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Aadarkyc.Response) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlAdharOtp f8956e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LlAdharOtp llAdharOtp) {
            super(1);
            this.f8956e = llAdharOtp;
        }

        public final void b(String str) {
            this.f8956e.H1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlAdharOtp f8957e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(LlAdharOtp llAdharOtp) {
            super(1);
            this.f8957e = llAdharOtp;
        }

        public final void b(SubmitAdharApi submitAdharApi) {
            ld.f L1;
            String x12;
            String str;
            LlAdharOtp llAdharOtp;
            this.f8957e.H1().dismiss();
            try {
                Log.e("adhResp_submit", submitAdharApi.toString());
                if (p.o(submitAdharApi.getStatusCode(), "EKYC001", true)) {
                    try {
                        this.f8957e.d2(q.B0(String.valueOf(submitAdharApi.getEkycId())).toString());
                        if (cm.l.a(this.f8957e.L1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                            return;
                        }
                        if (p.p((String) this.f8957e.P1().get("537"), "Re-Validation of Expired DL", false, 2, (Object) null)) {
                            if (cm.l.a(this.f8957e.w1(), q.B0("M").toString())) {
                                L1 = this.f8957e.L1();
                                x12 = this.f8957e.x1();
                                str = "1";
                                llAdharOtp = this.f8957e;
                            } else {
                                L1 = this.f8957e.L1();
                                x12 = this.f8957e.x1();
                                str = "2";
                                llAdharOtp = this.f8957e;
                            }
                            L1.o(x12, "Y", str, llAdharOtp.y1());
                            if (cm.l.a(this.f8957e.L1().b(), "574")) {
                                Intent intent = new Intent(this.f8957e, ChangeNameLL.class);
                                intent.putExtra("LLDetails", this.f8957e.A1());
                                intent.putExtra("Mobile_no", this.f8957e.N1().l());
                                this.f8957e.startActivity(intent);
                            } else if (cm.l.a(this.f8957e.L1().b(), "504")) {
                                Intent intent2 = new Intent(this.f8957e, ChangeAddressLL.class);
                                intent2.putExtra("LLDetails", this.f8957e.A1());
                                intent2.putExtra("Mobile_no", this.f8957e.N1().l());
                                this.f8957e.startActivity(intent2);
                            } else {
                                if (cm.l.a(this.f8957e.L1().b(), "502")) {
                                    Intent intent3 = new Intent(this.f8957e, DuplicateLL.class);
                                    intent3.putExtra("LLDetails", this.f8957e.A1());
                                    intent3.putExtra("Mobile_no", this.f8957e.N1().l());
                                    this.f8957e.startActivity(intent3);
                                }
                                this.f8957e.finish();
                                return;
                            }
                            this.f8957e.finish();
                            this.f8957e.finish();
                            return;
                        }
                        Toast.makeText(this.f8957e.F1(), this.f8957e.z1().b("service_is_not_present", this.f8957e.getString(R.string.unable_to_get_details)), 1).show();
                    } catch (Exception unused) {
                    }
                } else {
                    LlAdharOtp llAdharOtp2 = this.f8957e;
                    llAdharOtp2.X1(llAdharOtp2, submitAdharApi.getStatusDesc());
                }
            } catch (Exception unused2) {
                LlAdharOtp llAdharOtp3 = this.f8957e;
                llAdharOtp3.X1(llAdharOtp3, llAdharOtp3.z1().b("service_is_not_present", this.f8957e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SubmitAdharApi) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlAdharOtp f8958e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(LlAdharOtp llAdharOtp) {
            super(1);
            this.f8958e = llAdharOtp;
        }

        public final void b(String str) {
            this.f8958e.H1().dismiss();
            try {
                Log.e("adhResp_submit_err", str.toString());
                LlAdharOtp llAdharOtp = this.f8958e;
                llAdharOtp.X1(llAdharOtp, llAdharOtp.z1().b("service_is_not_present", this.f8958e.getString(R.string.unable_to_get_details)));
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8959a;

        g(l lVar) {
            cm.l.f(lVar, "function");
            this.f8959a = lVar;
        }

        public final pl.c a() {
            return this.f8959a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8959a.invoke(obj);
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

    public static final class h extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f8960a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f8961b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f8960a = textView;
            this.f8961b = textView2;
        }

        public void onFinish() {
            this.f8961b.setVisibility(0);
            this.f8960a.setText("0");
            this.f8960a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f8960a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f8961b.setVisibility(8);
            this.f8960a.setVisibility(0);
        }
    }

    public static final class i extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f8962a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f8963b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f8962a = textView;
            this.f8963b = textView2;
        }

        public void onFinish() {
            this.f8963b.setVisibility(0);
            this.f8962a.setText("0");
            this.f8962a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f8962a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f8963b.setVisibility(8);
            this.f8962a.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void A2(EditText editText, ImageView imageView, View view) {
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
    public static final void B2(LlAdharOtp llAdharOtp, TextView textView, TextView textView2, View view) {
        cm.l.f(llAdharOtp, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(textView2, "$resendOtp");
        llAdharOtp.H1().show();
        new i(textView, textView2).start();
        String obj = q.B0(llAdharOtp.u1().f26066d.getText().toString()).toString();
        Charset forName = Charset.forName("UTF-8");
        cm.l.e(forName, "forName(charsetName)");
        byte[] bytes = obj.getBytes(forName);
        cm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        int nextInt = new Random().nextInt(1410065407);
        ea.a E1 = llAdharOtp.E1();
        cm.l.c(encodeToString);
        E1.g(encodeToString, false, false, false, true, String.valueOf(nextInt), "", "", false);
    }

    private final void Q1() {
        try {
            l2(this);
            r2(new ld.f(F1()));
            t2(new ld.g(F1()));
            f2(new ld.c(F1()));
            q2(EkYCService.f20515a.a(this));
            o2(new ProgressDialog(F1()));
            H1().setMessage(z1().b("label_challan_please_wait", "Please wait..."));
            H1().setCancelable(false);
            H1().setCanceledOnTouchOutside(false);
            if (getIntent() != null) {
                Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
                cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
                g2((FetchLlDetails) serializableExtra);
            }
            p2(DlServiceInt.f21675a.a(F1()));
            b2((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(I1(), this))).a(ba.b.class));
            m2((ca.c) new u0((x0) this, (u0.b) new ca.b(new ca.a(K1()))).a(ca.c.class));
            v2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(J1()))).a(bi.h.class));
            h2(AadharInterface.f8349a.a(F1()));
            j2((da.c) new u0((x0) this, (u0.b) new da.a(new da.b(B1()))).a(da.c.class));
            i2(AdrInterface.f8352a.b(F1()));
            k2((ea.a) new u0((x0) this, (u0.b) new ea.b(new ea.d(C1()))).a(ea.a.class));
            u1().f26069g.setText(A1().getLearningLicence());
            u1().f26067e.f25961g.setText(L1().i());
        } catch (Exception e10) {
            Log.e("error_adhar", e10.getLocalizedMessage());
        }
    }

    private final void R1() {
        E1().h().g(this, new g(new a(this)));
        E1().i().g(this, new g(new b(this)));
        E1().j().g(this, new g(new c(this)));
        E1().i().g(this, new g(new d(this)));
        D1().l().g(this, new g(new e(this)));
        D1().h().g(this, new g(new f(this)));
        v1().j(F1(), A1().getState().getStCd());
        v1().C().g(this, new qb.g(this));
        G1().j().g(this, new j(this));
        G1().i().g(this, new k(this));
        G1().h().g(this, new qb.l(this));
        G1().g().g(this, new qb.m(this));
    }

    /* access modifiers changed from: private */
    public static final void S1(LlAdharOtp llAdharOtp, CustomState customState) {
        cm.l.f(llAdharOtp, "this$0");
        try {
            if (p.o(customState.getStatus_code(), "00", true)) {
                llAdharOtp.W = customState.getCustomSt().get(0).getAllowAddrChangeAtDlservReqst();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void T1(LlAdharOtp llAdharOtp, eKycResponse ekycresponse) {
        cm.l.f(llAdharOtp, "this$0");
        llAdharOtp.H1().dismiss();
        Log.d("adhar_resp", ekycresponse.toString());
        try {
            ApiMessage apiMessage = ekycresponse.getApiMessage();
            String str = null;
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                ApiMessage apiMessage2 = ekycresponse.getApiMessage();
                if (apiMessage2 != null) {
                    str = apiMessage2.getDeveloperMessage();
                }
                llAdharOtp.X1(llAdharOtp, String.valueOf(str));
                return;
            }
            Data data = ekycresponse.getData();
            String valueOf = String.valueOf(data != null ? data.getTxNo() : null);
            llAdharOtp.L = valueOf;
            cm.l.c(valueOf);
            if (valueOf.length() > 23) {
                String str2 = llAdharOtp.L;
                cm.l.c(str2);
                if (q.F(str2, "T", false, 2, (Object) null)) {
                    String str3 = llAdharOtp.L;
                    cm.l.c(str3);
                    String substring = str3.substring(0, 23);
                    cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    llAdharOtp.L = substring;
                    cm.l.c(substring);
                    llAdharOtp.L = p.w(substring, "T", " ", false, 4, (Object) null);
                    Date parse = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").parse(llAdharOtp.L);
                    cm.l.d(parse, "null cannot be cast to non-null type java.util.Date");
                    String l10 = Long.toString(parse.getTime() / 1000);
                    cm.l.c(l10);
                    String valueOf2 = String.valueOf(Long.parseLong(l10) * ((long) 1000));
                    llAdharOtp.L = valueOf2;
                    Log.e("time_Stamp_value", String.valueOf(valueOf2));
                }
            }
            ld.h hVar = new ld.h(llAdharOtp);
            Data data2 = ekycresponse.getData();
            hVar.f(String.valueOf(data2 != null ? data2.getTxNo() : null));
            Data data3 = ekycresponse.getData();
            if (data3 != null) {
                str = data3.getLastFourMobileNumber();
            }
            llAdharOtp.w2(llAdharOtp, String.valueOf(str));
        } catch (Exception unused) {
            llAdharOtp.X1(llAdharOtp, "Unable to process the request, Please try after some time");
        }
    }

    /* access modifiers changed from: private */
    public static final void U1(LlAdharOtp llAdharOtp, String str) {
        cm.l.f(llAdharOtp, "this$0");
        llAdharOtp.H1().dismiss();
        llAdharOtp.X1(llAdharOtp, "Unable to process the request, Please try after some time");
    }

    /* access modifiers changed from: private */
    public static final void V1(LlAdharOtp llAdharOtp, EkycVerifyResponse ekycVerifyResponse) {
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
        DOEkyc dOEkyc11;
        DOEkyc dOEkyc12;
        DOEkyc dOEkyc13;
        DOEkyc dOEkyc14;
        DOEkyc dOEkyc15;
        DOEkyc dOEkyc16;
        DOEkyc dOEkyc17;
        DOEkyc dOEkyc18;
        DOEkyc dOEkyc19;
        DOEkyc dOEkyc20;
        DOEkyc dOEkyc21;
        DOEkyc dOEkyc22;
        DOEkyc dOEkyc23;
        DOEkyc dOEkyc24;
        DOEkyc dOEkyc25;
        DOEkyc dOEkyc26;
        LlAdharOtp llAdharOtp2 = llAdharOtp;
        cm.l.f(llAdharOtp2, "this$0");
        if (ekycVerifyResponse != null) {
            try {
                com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.Data data = ekycVerifyResponse.getData();
                String str2 = null;
                DOAadhaarResponse dOAadhaarResponse = data != null ? data.getDOAadhaarResponse() : null;
                if (String.valueOf(dOAadhaarResponse != null ? dOAadhaarResponse.getStatus() : null).length() != 0) {
                    if (p.o(String.valueOf(dOAadhaarResponse != null ? dOAadhaarResponse.getStatus() : null), "Y", true)) {
                        try {
                            ld.h hVar = new ld.h(llAdharOtp2);
                            String str3 = llAdharOtp2.L;
                            cm.l.c(str3);
                            hVar.f(str3);
                            if (String.valueOf((dOAadhaarResponse == null || (dOEkyc26 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc26.getName()).length() != 0) {
                                llAdharOtp2.M = String.valueOf((dOAadhaarResponse == null || (dOEkyc25 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc25.getName());
                            }
                            if (String.valueOf((dOAadhaarResponse == null || (dOEkyc24 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc24.getGender()).length() != 0) {
                                llAdharOtp2.f8949e0 = String.valueOf((dOAadhaarResponse == null || (dOEkyc23 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc23.getGender());
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((dOAadhaarResponse == null || (dOEkyc22 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc22.getHouse());
                            sb2.append(' ');
                            sb2.append((dOAadhaarResponse == null || (dOEkyc21 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc21.getStreet());
                            sb2.append(' ');
                            sb2.append((dOAadhaarResponse == null || (dOEkyc20 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc20.getLocalityIfAny());
                            sb2.append(' ');
                            sb2.append((dOAadhaarResponse == null || (dOEkyc19 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc19.getDist());
                            sb2.append(' ');
                            sb2.append((dOAadhaarResponse == null || (dOEkyc18 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc18.getState());
                            sb2.append(' ');
                            sb2.append((dOAadhaarResponse == null || (dOEkyc17 = dOAadhaarResponse.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc17.getPincode()));
                            llAdharOtp2.N = sb2.toString();
                            da.c D1 = llAdharOtp.D1();
                            String obj = q.B0(llAdharOtp.u1().f26066d.getText().toString()).toString();
                            String valueOf = String.valueOf((dOAadhaarResponse == null || (dOEkyc16 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc16.getCareOf());
                            String valueOf2 = String.valueOf((dOAadhaarResponse == null || (dOEkyc15 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc15.getCode());
                            String valueOf3 = String.valueOf((dOAadhaarResponse == null || (dOEkyc14 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc14.getDist());
                            String valueOf4 = String.valueOf((dOAadhaarResponse == null || (dOEkyc13 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc13.getDob());
                            String valueOf5 = String.valueOf((dOAadhaarResponse == null || (dOEkyc12 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc12.getGender());
                            String valueOf6 = String.valueOf((dOAadhaarResponse == null || (dOEkyc11 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc11.getHouse());
                            String valueOf7 = String.valueOf((dOAadhaarResponse == null || (dOEkyc10 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc10.getLandMark());
                            String valueOf8 = String.valueOf((dOAadhaarResponse == null || (dOEkyc9 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc9.getLocalityIfAny());
                            String valueOf9 = String.valueOf((dOAadhaarResponse == null || (dOEkyc8 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc8.getName());
                            String valueOf10 = String.valueOf((dOAadhaarResponse == null || (dOEkyc7 = dOAadhaarResponse.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc7.getPhone()));
                            String valueOf11 = String.valueOf((dOAadhaarResponse == null || (dOEkyc6 = dOAadhaarResponse.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc6.getPincode()));
                            String valueOf12 = String.valueOf((dOAadhaarResponse == null || (dOEkyc5 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc5.getState());
                            String valueOf13 = String.valueOf((dOAadhaarResponse == null || (dOEkyc4 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc4.getStatus());
                            String valueOf14 = String.valueOf((dOAadhaarResponse == null || (dOEkyc3 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc3.getStreet());
                            String valueOf15 = String.valueOf((dOAadhaarResponse == null || (dOEkyc2 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc2.getVillageTownCity());
                            if (!(dOAadhaarResponse == null || (dOEkyc = dOAadhaarResponse.getDOEkyc()) == null)) {
                                str2 = dOEkyc.getXmlUID();
                            }
                            String valueOf16 = String.valueOf(str2);
                            String obj2 = q.B0(llAdharOtp.A1().getLearningLicence()).toString();
                            String obj3 = q.B0(llAdharOtp.A1().getFullName()).toString();
                            String t12 = llAdharOtp2.t1(q.B0(llAdharOtp.A1().getDateOfBirth()).toString());
                            cm.l.c(t12);
                            String swdFullName = llAdharOtp.A1().getApplicantAddress().getSwdFullName();
                            int i10 = llAdharOtp2.f8950f0;
                            String str4 = llAdharOtp2.L;
                            cm.l.c(str4);
                            D1.m(obj, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, "NA", valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, obj2, obj3, t12, swdFullName, i10, "Y", str4, q.B0(llAdharOtp.u1().f26066d.getText().toString()).toString(), llAdharOtp.A1().getState().getStCd());
                            return;
                        } catch (Exception e10) {
                            llAdharOtp.H1().dismiss();
                            e10.printStackTrace();
                            return;
                        }
                    }
                }
                llAdharOtp.H1().dismiss();
                String reason = dOAadhaarResponse != null ? dOAadhaarResponse.getReason() : null;
                if (reason != null) {
                    if (reason.length() != 0) {
                        if (dOAadhaarResponse != null) {
                            str2 = dOAadhaarResponse.getReason();
                        }
                        str = String.valueOf(str2);
                        llAdharOtp2.X1(llAdharOtp2, str);
                    }
                }
                str = "Unable to verify the request, Please try after some time";
                llAdharOtp2.X1(llAdharOtp2, str);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void W1(LlAdharOtp llAdharOtp, String str) {
        cm.l.f(llAdharOtp, "this$0");
        llAdharOtp.H1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void Y1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void r1() {
        u1().f26070h.setOnClickListener(new n(this));
    }

    /* access modifiers changed from: private */
    public static final void s1(LlAdharOtp llAdharOtp, View view) {
        cm.l.f(llAdharOtp, "this$0");
        llAdharOtp.u1().f26066d.getText().clear();
    }

    /* access modifiers changed from: private */
    public static final void x2(EditText editText, LlAdharOtp llAdharOtp, TextView textView, ImageView imageView, Dialog dialog, View view) {
        ld.c z12;
        String string;
        String str;
        cm.l.f(editText, "$enterOtp");
        cm.l.f(llAdharOtp, "this$0");
        cm.l.f(textView, "$txt_reset");
        cm.l.f(imageView, "$ok_button");
        cm.l.f(dialog, "$d");
        String obj = editText.getText().toString();
        if (obj.length() == 0) {
            z12 = llAdharOtp.z1();
            string = llAdharOtp.getString(R.string.pls_enter_otp);
            str = "label_log_entr_otp";
        } else if (obj.length() < 6) {
            z12 = llAdharOtp.z1();
            string = llAdharOtp.getString(R.string.pls_enter_valid_otp);
            str = "label_log_entr_val_otp";
        } else {
            llAdharOtp.H1().show();
            textView.setOnClickListener(new qb.h(editText));
            imageView.setOnClickListener(new qb.i(dialog));
        }
        Toast.makeText(llAdharOtp, z12.b(str, string), 0).show();
        textView.setOnClickListener(new qb.h(editText));
        imageView.setOnClickListener(new qb.i(dialog));
    }

    /* access modifiers changed from: private */
    public static final void y2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void z2(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    public final FetchLlDetails A1() {
        FetchLlDetails fetchLlDetails = this.O;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        cm.l.v("llDetails");
        return null;
    }

    public final AadharInterface B1() {
        AadharInterface aadharInterface = this.V;
        if (aadharInterface != null) {
            return aadharInterface;
        }
        cm.l.v("mAadharInterface");
        return null;
    }

    public final AdrInterface C1() {
        AdrInterface adrInterface = this.f8945a0;
        if (adrInterface != null) {
            return adrInterface;
        }
        cm.l.v("mAadharInterface2");
        return null;
    }

    public final da.c D1() {
        da.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mAadharViewModel");
        return null;
    }

    public final ea.a E1() {
        ea.a aVar = this.Z;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mAadharViewModel2");
        return null;
    }

    public final Context F1() {
        Context context = this.Q;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final ca.c G1() {
        ca.c cVar = this.S;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mView");
        return null;
    }

    public final ProgressDialog H1() {
        ProgressDialog progressDialog = this.R;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final DlServiceInt I1() {
        DlServiceInt dlServiceInt = this.Y;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final VahanProService J1() {
        VahanProService vahanProService = this.f8951g0;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitServiceVahan");
        return null;
    }

    public final EkYCService K1() {
        EkYCService ekYCService = this.T;
        if (ekYCService != null) {
            return ekYCService;
        }
        cm.l.v("retrofitService_one");
        return null;
    }

    public final ld.f L1() {
        ld.f fVar = this.H;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final int M1() {
        return this.f8950f0;
    }

    public final ld.g N1() {
        ld.g gVar = this.I;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final String O1() {
        return this.L;
    }

    public final HashMap P1() {
        return this.P;
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
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new o(dialog));
        dialog.show();
    }

    public final void Z1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void a2(e5 e5Var) {
        cm.l.f(e5Var, "<set-?>");
        this.G = e5Var;
    }

    public final void b2(ba.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.X = bVar;
    }

    public final void c2(String str) {
        cm.l.f(str, "<set-?>");
        this.f8949e0 = str;
    }

    public final void d2(String str) {
        cm.l.f(str, "<set-?>");
        this.f8947c0 = str;
    }

    public final void e2(String str) {
        cm.l.f(str, "<set-?>");
        this.f8948d0 = str;
    }

    public final void f2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void g2(FetchLlDetails fetchLlDetails) {
        cm.l.f(fetchLlDetails, "<set-?>");
        this.O = fetchLlDetails;
    }

    public final void h2(AadharInterface aadharInterface) {
        cm.l.f(aadharInterface, "<set-?>");
        this.V = aadharInterface;
    }

    public final void i2(AdrInterface adrInterface) {
        cm.l.f(adrInterface, "<set-?>");
        this.f8945a0 = adrInterface;
    }

    public final void j2(da.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    public final void k2(ea.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.Z = aVar;
    }

    public final void l2(Context context) {
        cm.l.f(context, "<set-?>");
        this.Q = context;
    }

    public final void m2(ca.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.S = cVar;
    }

    public final void n2(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void o2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.R = progressDialog;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e5 c10 = e5.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        a2(c10);
        setContentView((View) u1().b());
        Q1();
        r1();
        R1();
    }

    public final void p2(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.Y = dlServiceInt;
    }

    public final void q2(EkYCService ekYCService) {
        cm.l.f(ekYCService, "<set-?>");
        this.T = ekYCService;
    }

    public final void r2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.H = fVar;
    }

    public final void s2(int i10) {
        this.f8950f0 = i10;
    }

    public final String t1(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            cm.l.e(parse, "parse(...)");
            return simpleDateFormat2.format(parse);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final void t2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.I = gVar;
    }

    public final e5 u1() {
        e5 e5Var = this.G;
        if (e5Var != null) {
            return e5Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final void u2(String str) {
        this.L = str;
    }

    public final ba.b v1() {
        ba.b bVar = this.X;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("dlServicesViewModel");
        return null;
    }

    public final void v2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.f8952h0 = hVar;
    }

    public final String w1() {
        return this.f8949e0;
    }

    public final void w2(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "mobile_no");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validateotp);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        View findViewById2 = dialog.findViewById(R.id.resendOtp);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.showmpin);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.submitOtp);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById5 = dialog.findViewById(R.id.enterOtp);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.time_text);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.txt_reset);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById8).setText("OTP has been sent on your aadhar linked mobile number  \n+91 XXXXXX" + str);
        new h(textView2, textView).start();
        imageView.setOnClickListener(new p(editText, imageView));
        textView.setOnClickListener(new q(this, textView2, textView));
        ((TextView) findViewById4).setOnClickListener(new r(editText, this, (TextView) findViewById7, (ImageView) findViewById, dialog));
        dialog.show();
    }

    public final String x1() {
        return this.f8947c0;
    }

    public final String y1() {
        return this.f8948d0;
    }

    public final ld.c z1() {
        ld.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }
}
