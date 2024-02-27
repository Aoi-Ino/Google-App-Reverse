package com.nic.mparivahan.dlservices.ui.photoandsign;

import ak.k;
import ak.n;
import ak.o;
import ak.p;
import ak.q;
import ak.r;
import ak.s;
import ak.t;
import ak.u;
import ak.v;
import ak.w;
import ak.y;
import ak.z;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import bm.l;
import cb.t0;
import cm.m;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlLog.DlLogUpdate;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.data.model.DlPhotoStatusDycryResponse;
import com.nic.mparivahan.dlservices.data.model.PhotoDto;
import com.nic.mparivahan.dlservices.data.model.ResponseMsg;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse;
import com.nic.mparivahan.dlservices.ui.acknow.OlaMast;
import com.nic.mparivahan.dlservices.ui.acknow.ResponseBody;
import com.nic.mparivahan.dlservices.ui.acknow.ResponseMessage;
import com.nic.mparivahan.dlservices.ui.acknow.TransReqItem;
import com.nic.mparivahan.dlservices.ui.dms.DlDocActivity;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;
import com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ni.r3;
import pl.x;
import t2.a;
import v9.e;

public final class DlPhotoAndSignatureActivity extends oi.g {

    /* renamed from: r0  reason: collision with root package name */
    public static final a f22252r0 = new a((cm.g) null);
    /* access modifiers changed from: private */
    public r3 J;
    /* access modifiers changed from: private */
    public ak.a K;
    private String L;
    /* access modifiers changed from: private */
    public int M = -1;
    /* access modifiers changed from: private */
    public String N;
    /* access modifiers changed from: private */
    public String O;
    /* access modifiers changed from: private */
    public String P;
    /* access modifiers changed from: private */
    public String Q;
    /* access modifiers changed from: private */
    public String R;
    /* access modifiers changed from: private */
    public String S;
    /* access modifiers changed from: private */
    public String T;
    /* access modifiers changed from: private */
    public String U;
    public DldetobjX V;
    /* access modifiers changed from: private */
    public String W;
    /* access modifiers changed from: private */
    public String X = "";
    /* access modifiers changed from: private */
    public String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f22253a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f22254b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private String f22255c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    private String f22256d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private String f22257e0 = "";

    /* renamed from: f0  reason: collision with root package name */
    public String f22258f0;

    /* renamed from: g0  reason: collision with root package name */
    public ld.g f22259g0;

    /* renamed from: h0  reason: collision with root package name */
    public ld.c f22260h0;

    /* renamed from: i0  reason: collision with root package name */
    private t0 f22261i0;

    /* renamed from: j0  reason: collision with root package name */
    public t9.a f22262j0;

    /* renamed from: k0  reason: collision with root package name */
    public ClInter f22263k0;

    /* renamed from: l0  reason: collision with root package name */
    private String f22264l0 = "true";

    /* renamed from: m0  reason: collision with root package name */
    public ArrayList f22265m0;

    /* renamed from: n0  reason: collision with root package name */
    public ArrayList f22266n0;

    /* renamed from: o0  reason: collision with root package name */
    public ld.f f22267o0;
    /* access modifiers changed from: private */

    /* renamed from: p0  reason: collision with root package name */
    public final d.c f22268p0;

    /* renamed from: q0  reason: collision with root package name */
    private d.c f22269q0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlPhotoAndSignatureActivity f22270e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity) {
            super(1);
            this.f22270e = dlPhotoAndSignatureActivity;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f22270e.w2().a(intent);
            this.f22270e.s3(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlPhotoAndSignatureActivity f22271e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity) {
            super(1);
            this.f22271e = dlPhotoAndSignatureActivity;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f22271e.f22268p0.a(intent);
            this.f22271e.s3(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlPhotoAndSignatureActivity f22272e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity) {
            super(1);
            this.f22272e = dlPhotoAndSignatureActivity;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f22272e.f22268p0.a(intent);
            this.f22272e.s3(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlPhotoAndSignatureActivity f22273e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity) {
            super(1);
            this.f22273e = dlPhotoAndSignatureActivity;
        }

        public final void b(DlApplStatusResponse dlApplStatusResponse) {
            String str;
            List<TransReqItem> transReq;
            TransReqItem transReqItem;
            try {
                ResponseMessage responseMessage = dlApplStatusResponse.getResponseMessage();
                if (responseMessage != null) {
                    Integer statusCode = responseMessage.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200) {
                            DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity = this.f22273e;
                            ResponseBody responseBody = dlApplStatusResponse.getResponseBody();
                            String str2 = null;
                            dlPhotoAndSignatureActivity.P = String.valueOf(responseBody != null ? responseBody.getApdFullName() : null);
                            DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity2 = this.f22273e;
                            ResponseBody responseBody2 = dlApplStatusResponse.getResponseBody();
                            dlPhotoAndSignatureActivity2.Q = String.valueOf(responseBody2 != null ? responseBody2.getApdSwdFullName() : null);
                            DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity3 = this.f22273e;
                            ResponseBody responseBody3 = dlApplStatusResponse.getResponseBody();
                            if (dlPhotoAndSignatureActivity3.s2(String.valueOf(responseBody3 != null ? responseBody3.getApdAppldt() : null)).length() > 0) {
                                DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity4 = this.f22273e;
                                ResponseBody responseBody4 = dlApplStatusResponse.getResponseBody();
                                str = dlPhotoAndSignatureActivity4.s2(String.valueOf(responseBody4 != null ? responseBody4.getApdAppldt() : null));
                            } else {
                                ResponseBody responseBody5 = dlApplStatusResponse.getResponseBody();
                                str = String.valueOf(responseBody5 != null ? responseBody5.getApdAppldt() : null);
                            }
                            dlPhotoAndSignatureActivity3.U = str;
                            DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity5 = this.f22273e;
                            ResponseBody responseBody6 = dlApplStatusResponse.getResponseBody();
                            dlPhotoAndSignatureActivity5.W = String.valueOf((responseBody6 == null || (transReq = responseBody6.getTransReq()) == null || (transReqItem = transReq.get(0)) == null) ? null : transReqItem.getTrTrCd());
                            ResponseBody responseBody7 = dlApplStatusResponse.getResponseBody();
                            OlaMast olaMast = responseBody7 != null ? responseBody7.getOlaMast() : null;
                            DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity6 = this.f22273e;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd1() : null);
                            sb2.append(' ');
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd2() : null);
                            sb2.append(' ');
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd3() : null);
                            dlPhotoAndSignatureActivity6.R = sb2.toString();
                            this.f22273e.S = String.valueOf(olaMast != null ? olaMast.getOmOfficecd() : null);
                            this.f22273e.T = String.valueOf(olaMast != null ? olaMast.getOmStCode() : null);
                            r3 c22 = this.f22273e.J;
                            if (c22 == null) {
                                cm.l.v("mBinding");
                                c22 = null;
                            }
                            TextView textView = c22.D;
                            String Y1 = this.f22273e.N;
                            if (Y1 == null) {
                                cm.l.v("mApplNo");
                                Y1 = null;
                            }
                            textView.setText(Y1);
                            r3 c23 = this.f22273e.J;
                            if (c23 == null) {
                                cm.l.v("mBinding");
                                c23 = null;
                            }
                            TextView textView2 = c23.F;
                            String V1 = this.f22273e.O;
                            if (V1 == null) {
                                cm.l.v("mApplDob");
                                V1 = null;
                            }
                            textView2.setText(V1);
                            r3 c24 = this.f22273e.J;
                            if (c24 == null) {
                                cm.l.v("mBinding");
                                c24 = null;
                            }
                            TextView textView3 = c24.E;
                            String X1 = this.f22273e.P;
                            if (X1 == null) {
                                cm.l.v("mApplName");
                                X1 = null;
                            }
                            textView3.setText(X1);
                            r3 c25 = this.f22273e.J;
                            if (c25 == null) {
                                cm.l.v("mBinding");
                                c25 = null;
                            }
                            TextView textView4 = c25.H;
                            String W1 = this.f22273e.Q;
                            if (W1 == null) {
                                cm.l.v("mApplFather");
                                W1 = null;
                            }
                            textView4.setText(W1);
                            r3 c26 = this.f22273e.J;
                            if (c26 == null) {
                                cm.l.v("mBinding");
                                c26 = null;
                            }
                            TextView textView5 = c26.W;
                            String a22 = this.f22273e.R;
                            if (a22 == null) {
                                cm.l.v("mApplRtoName");
                                a22 = null;
                            }
                            textView5.setText(a22);
                            this.f22273e.M = 0;
                            if (com.nic.mparivahan.a.f9624a.a(this.f22273e)) {
                                ak.a g22 = this.f22273e.K;
                                if (g22 == null) {
                                    cm.l.v("viewModel");
                                    g22 = null;
                                }
                                String Y12 = this.f22273e.N;
                                if (Y12 == null) {
                                    cm.l.v("mApplNo");
                                    Y12 = null;
                                }
                                String V12 = this.f22273e.O;
                                if (V12 == null) {
                                    cm.l.v("mApplDob");
                                    V12 = null;
                                }
                                String U1 = this.f22273e.S;
                                if (U1 == null) {
                                    cm.l.v("lastEndorseRTOCode");
                                } else {
                                    str2 = U1;
                                }
                                g22.i(Y12, V12, str2);
                                return;
                            }
                            Toast.makeText(this.f22273e.getApplicationContext(), this.f22273e.y2().b("label_log_check_internet", this.f22273e.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusResponse) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlPhotoAndSignatureActivity f22274e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity) {
            super(1);
            this.f22274e = dlPhotoAndSignatureActivity;
        }

        public final void b(DlPhotoStatusDycryResponse dlPhotoStatusDycryResponse) {
            try {
                ResponseMsg responseMsg = dlPhotoStatusDycryResponse.getResponseMsg();
                if (responseMsg != null) {
                    Integer statusCode = responseMsg.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200) {
                            PhotoDto photoDto = dlPhotoStatusDycryResponse.getPhotoDto();
                            r3 r3Var = null;
                            Bitmap c10 = com.nic.mparivahan.dlservices.utilities.e.c(String.valueOf(photoDto != null ? photoDto.getPhoto() : null));
                            r3 c22 = this.f22274e.J;
                            if (c22 == null) {
                                cm.l.v("mBinding");
                                c22 = null;
                            }
                            c22.A0.setImageBitmap(c10);
                            PhotoDto photoDto2 = dlPhotoStatusDycryResponse.getPhotoDto();
                            Bitmap c11 = com.nic.mparivahan.dlservices.utilities.e.c(String.valueOf(photoDto2 != null ? photoDto2.getSignature() : null));
                            r3 c23 = this.f22274e.J;
                            if (c23 == null) {
                                cm.l.v("mBinding");
                            } else {
                                r3Var = c23;
                            }
                            r3Var.f28340a0.setImageBitmap(c11);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlPhotoStatusDycryResponse) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlPhotoAndSignatureActivity f22275e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity) {
            super(1);
            this.f22275e = dlPhotoAndSignatureActivity;
        }

        public final void b(com.nic.mparivahan.dlservices.data.model.temp.PhotoDto photoDto) {
            try {
                r3 c22 = this.f22275e.J;
                r3 r3Var = null;
                if (c22 == null) {
                    cm.l.v("mBinding");
                    c22 = null;
                }
                c22.B0.c(false);
                String statusCode = photoDto.getStatusCode();
                if (statusCode == null || !statusCode.equals("00")) {
                    DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity = this.f22275e;
                    String statusDesc = photoDto.getStatusDesc();
                    r3 c23 = this.f22275e.J;
                    if (c23 == null) {
                        cm.l.v("mBinding");
                    } else {
                        r3Var = c23;
                    }
                    dlPhotoAndSignatureActivity.t1(statusDesc, r3Var.m());
                    return;
                }
                DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity2 = this.f22275e;
                dlPhotoAndSignatureActivity2.h3(dlPhotoAndSignatureActivity2, dlPhotoAndSignatureActivity2.y2().b("label_photo_sign_uploaded", this.f22275e.getString(R.string.photo_uploaded)));
                r3 c24 = this.f22275e.J;
                if (c24 == null) {
                    cm.l.v("mBinding");
                    c24 = null;
                }
                c24.f28341b0.setVisibility(0);
                r3 c25 = this.f22275e.J;
                if (c25 == null) {
                    cm.l.v("mBinding");
                } else {
                    r3Var = c25;
                }
                r3Var.B0.setVisibility(8);
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((com.nic.mparivahan.dlservices.data.model.temp.PhotoDto) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlPhotoAndSignatureActivity f22276e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity) {
            super(1);
            this.f22276e = dlPhotoAndSignatureActivity;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            try {
                r3 c22 = this.f22276e.J;
                if (c22 == null) {
                    cm.l.v("mBinding");
                    c22 = null;
                }
                c22.f28341b0.c(false);
                if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                    Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                    this.f22276e.u3(applStatusDetailsItem.getApplFlowStatusList());
                }
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class i extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlPhotoAndSignatureActivity f22277e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity) {
            super(1);
            this.f22277e = dlPhotoAndSignatureActivity;
        }

        public final void b(String str) {
            ak.a aVar;
            String str2;
            String str3;
            String str4;
            String Z1;
            String b22;
            DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity;
            String str5;
            String str6;
            String str7;
            ak.a aVar2;
            try {
                this.f22277e.l3(str.toString());
                if (p.o(this.f22277e.x2(), "false", true)) {
                    DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity2 = this.f22277e;
                    dlPhotoAndSignatureActivity2.h3(dlPhotoAndSignatureActivity2, "Kindly upload your proper photo again");
                } else if (com.nic.mparivahan.a.f9624a.a(this.f22277e)) {
                    r3 r3Var = null;
                    if (this.f22277e.M != -1) {
                        if (cm.l.a(this.f22277e.E2().g(), "Y") && this.f22277e.E2().h().length() > 0) {
                            r3 c22 = this.f22277e.J;
                            if (c22 == null) {
                                cm.l.v("mBinding");
                                c22 = null;
                            }
                            c22.B0.c(true);
                            ak.a g22 = this.f22277e.K;
                            if (g22 == null) {
                                cm.l.v("viewModel");
                                aVar = null;
                            } else {
                                aVar = g22;
                            }
                            String Y1 = this.f22277e.N;
                            if (Y1 == null) {
                                cm.l.v("mApplNo");
                                str2 = null;
                            } else {
                                str2 = Y1;
                            }
                            String V1 = this.f22277e.O;
                            if (V1 == null) {
                                cm.l.v("mApplDob");
                                str3 = null;
                            } else {
                                str3 = V1;
                            }
                            String f22 = this.f22277e.T;
                            if (f22 == null) {
                                cm.l.v("stateCode");
                                str4 = null;
                            } else {
                                str4 = f22;
                            }
                            Z1 = this.f22277e.E2().h();
                            b22 = this.f22277e.Y;
                            dlPhotoAndSignatureActivity = this.f22277e;
                            aVar.n(str2, str3, str4, Z1, b22, dlPhotoAndSignatureActivity.M);
                        }
                    }
                    if (this.f22277e.M == -1 || this.f22277e.X.length() <= 0 || this.f22277e.Y.length() <= 0) {
                        DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity3 = this.f22277e;
                        String b10 = dlPhotoAndSignatureActivity3.y2().b("photo_signature", "");
                        r3 c23 = this.f22277e.J;
                        if (c23 == null) {
                            cm.l.v("mBinding");
                        } else {
                            r3Var = c23;
                        }
                        dlPhotoAndSignatureActivity3.r1(b10, r3Var.m());
                        return;
                    }
                    r3 c24 = this.f22277e.J;
                    if (c24 == null) {
                        cm.l.v("mBinding");
                        c24 = null;
                    }
                    c24.B0.c(true);
                    ak.a g23 = this.f22277e.K;
                    if (g23 == null) {
                        cm.l.v("viewModel");
                        aVar2 = null;
                    } else {
                        aVar2 = g23;
                    }
                    String Y12 = this.f22277e.N;
                    if (Y12 == null) {
                        cm.l.v("mApplNo");
                        str7 = null;
                    } else {
                        str7 = Y12;
                    }
                    String V12 = this.f22277e.O;
                    if (V12 == null) {
                        cm.l.v("mApplDob");
                        str6 = null;
                    } else {
                        str6 = V12;
                    }
                    String f23 = this.f22277e.T;
                    if (f23 == null) {
                        cm.l.v("stateCode");
                        str5 = null;
                    } else {
                        str5 = f23;
                    }
                    Z1 = this.f22277e.X;
                    b22 = this.f22277e.Y;
                    dlPhotoAndSignatureActivity = this.f22277e;
                    aVar.n(str2, str3, str4, Z1, b22, dlPhotoAndSignatureActivity.M);
                } else {
                    Toast.makeText(this.f22277e.getApplicationContext(), this.f22277e.y2().b("label_log_check_internet", this.f22277e.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                }
            } catch (Exception unused) {
                this.f22277e.l3("true");
                DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity4 = this.f22277e;
                dlPhotoAndSignatureActivity4.h3(dlPhotoAndSignatureActivity4, "Something went wrong,Please try after some time!");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f22278a;

        j(l lVar) {
            cm.l.f(lVar, "function");
            this.f22278a = lVar;
        }

        public final pl.c a() {
            return this.f22278a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22278a.invoke(obj);
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

    public DlPhotoAndSignatureActivity() {
        d.c y02 = y0(new e.d(), new ak.b(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f22268p0 = y02;
        d.c y03 = y0(new e.d(), new ak.m(this));
        cm.l.e(y03, "registerForActivityResult(...)");
        this.f22269q0 = y03;
    }

    private final void F2() {
        a.C0223a i10;
        l dVar;
        if (com.nic.mparivahan.dlservices.utilities.b.f22373a.a(this)) {
            i10 = t2.a.f16505a.b(this).e().f(600).i();
            dVar = new d(this);
        } else if (com.nic.mparivahan.dlservices.utilities.e.d(this)) {
            i10 = t2.a.f16505a.b(this).e().f(600).i();
            dVar = new c(this);
        } else {
            return;
        }
        i10.h(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0168 A[Catch:{ Exception -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x016d A[Catch:{ Exception -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0170 A[Catch:{ Exception -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ae A[Catch:{ Exception -> 0x01ba }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void G2() {
        /*
            r9 = this;
            java.lang.String r0 = "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX"
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            ld.f r2 = new ld.f
            r2.<init>(r9)
            androidx.lifecycle.u0 r2 = new androidx.lifecycle.u0
            r2.<init>(r9)
            java.lang.Class<ak.a> r3 = ak.a.class
            androidx.lifecycle.t0 r2 = r2.a(r3)
            ak.a r2 = (ak.a) r2
            r9.K = r2
            ni.r3 r2 = r9.J
            java.lang.String r3 = "mBinding"
            r4 = 0
            if (r2 != 0) goto L_0x0023
            cm.l.v(r3)
            r2 = r4
        L_0x0023:
            r2.v(r9)
            android.content.Intent r2 = r9.getIntent()
            r5 = 0
            if (r2 == 0) goto L_0x01ba
            android.content.Intent r2 = r9.getIntent()     // Catch:{ Exception -> 0x01ba }
            android.os.Bundle r2 = r2.getExtras()     // Catch:{ Exception -> 0x01ba }
            if (r2 == 0) goto L_0x003e
            java.lang.String r6 = "dl_st_appl_ackno_no"
            java.lang.Object r2 = r2.get(r6)     // Catch:{ Exception -> 0x01ba }
            goto L_0x003f
        L_0x003e:
            r2 = r4
        L_0x003f:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x01ba }
            r9.N = r2     // Catch:{ Exception -> 0x01ba }
            android.content.Intent r2 = r9.getIntent()     // Catch:{ Exception -> 0x01ba }
            android.os.Bundle r2 = r2.getExtras()     // Catch:{ Exception -> 0x01ba }
            if (r2 == 0) goto L_0x0056
            java.lang.String r6 = "dl_st_appl_ackno_no_dob"
            java.lang.Object r2 = r2.get(r6)     // Catch:{ Exception -> 0x01ba }
            goto L_0x0057
        L_0x0056:
            r2 = r4
        L_0x0057:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x01ba }
            r9.O = r2     // Catch:{ Exception -> 0x01ba }
            android.content.Intent r2 = r9.getIntent()     // Catch:{ Exception -> 0x01ba }
            java.lang.String r6 = "DL"
            java.lang.String r2 = r2.getStringExtra(r6)     // Catch:{ Exception -> 0x01ba }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x01ba }
            r9.Z = r2     // Catch:{ Exception -> 0x01ba }
            android.content.Intent r2 = r9.getIntent()     // Catch:{ Exception -> 0x01ba }
            java.lang.String r6 = "dob"
            java.lang.String r2 = r2.getStringExtra(r6)     // Catch:{ Exception -> 0x01ba }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x01ba }
            r9.f22253a0 = r2     // Catch:{ Exception -> 0x01ba }
            android.content.Intent r2 = r9.getIntent()     // Catch:{ Exception -> 0x01ba }
            java.lang.String r6 = "Mobile_no"
            java.lang.String r2 = r2.getStringExtra(r6)     // Catch:{ Exception -> 0x01ba }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x01ba }
            r9.f22254b0 = r2     // Catch:{ Exception -> 0x01ba }
            android.content.Intent r2 = r9.getIntent()     // Catch:{ Exception -> 0x01ba }
            java.lang.String r6 = "DLDetails"
            java.io.Serializable r2 = r2.getSerializableExtra(r6)     // Catch:{ Exception -> 0x01ba }
            cm.l.d(r2, r0)     // Catch:{ Exception -> 0x01ba }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2     // Catch:{ Exception -> 0x01ba }
            r9.k3(r2)     // Catch:{ Exception -> 0x01ba }
            android.content.Intent r2 = r9.getIntent()     // Catch:{ Exception -> 0x01ba }
            java.lang.String r6 = "lastEndorsedRTO"
            java.lang.String r2 = r2.getStringExtra(r6)     // Catch:{ Exception -> 0x01ba }
            cm.l.d(r2, r1)     // Catch:{ Exception -> 0x01ba }
            r9.f22255c0 = r2     // Catch:{ Exception -> 0x01ba }
            android.content.Intent r2 = r9.getIntent()     // Catch:{ Exception -> 0x01ba }
            java.lang.String r6 = "lastEndorsedState"
            java.lang.String r2 = r2.getStringExtra(r6)     // Catch:{ Exception -> 0x01ba }
            cm.l.d(r2, r1)     // Catch:{ Exception -> 0x01ba }
            r9.f22256d0 = r2     // Catch:{ Exception -> 0x01ba }
            android.content.Intent r2 = r9.getIntent()     // Catch:{ Exception -> 0x01ba }
            java.lang.String r6 = "lastEndorseStateCode"
            java.lang.String r2 = r2.getStringExtra(r6)     // Catch:{ Exception -> 0x01ba }
            cm.l.d(r2, r1)     // Catch:{ Exception -> 0x01ba }
            r9.f22257e0 = r2     // Catch:{ Exception -> 0x01ba }
            android.content.Intent r1 = r9.getIntent()     // Catch:{ Exception -> 0x01ba }
            android.os.Bundle r1 = r1.getExtras()     // Catch:{ Exception -> 0x01ba }
            if (r1 == 0) goto L_0x00dd
            java.lang.String r2 = "dl_st_dl_details_obj"
            java.io.Serializable r1 = r1.getSerializable(r2)     // Catch:{ Exception -> 0x01ba }
            goto L_0x00de
        L_0x00dd:
            r1 = r4
        L_0x00de:
            cm.l.d(r1, r0)     // Catch:{ Exception -> 0x01ba }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = (com.nic.mparivahan.Dl.Model.DldetobjX) r1     // Catch:{ Exception -> 0x01ba }
            r9.k3(r1)     // Catch:{ Exception -> 0x01ba }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r9.u2()     // Catch:{ Exception -> 0x01ba }
            com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()     // Catch:{ Exception -> 0x01ba }
            java.lang.String r0 = r0.getBioDlno()     // Catch:{ Exception -> 0x01ba }
            java.lang.String r1 = " : "
            java.lang.String r2 = "dl_no"
            if (r0 == 0) goto L_0x0135
            int r0 = r0.length()     // Catch:{ Exception -> 0x01ba }
            if (r0 != 0) goto L_0x00ff
            goto L_0x0135
        L_0x00ff:
            ni.r3 r0 = r9.J     // Catch:{ Exception -> 0x01ba }
            if (r0 != 0) goto L_0x0107
            cm.l.v(r3)     // Catch:{ Exception -> 0x01ba }
            r0 = r4
        L_0x0107:
            android.widget.TextView r0 = r0.G     // Catch:{ Exception -> 0x01ba }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ba }
            r6.<init>()     // Catch:{ Exception -> 0x01ba }
            ld.c r7 = r9.y2()     // Catch:{ Exception -> 0x01ba }
            java.lang.String r8 = "DL No : "
            java.lang.String r2 = r7.b(r2, r8)     // Catch:{ Exception -> 0x01ba }
            r6.append(r2)     // Catch:{ Exception -> 0x01ba }
            r6.append(r1)     // Catch:{ Exception -> 0x01ba }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r9.u2()     // Catch:{ Exception -> 0x01ba }
            com.nic.mparivahan.Dl.Model.BioObjX r1 = r1.getBioObj()     // Catch:{ Exception -> 0x01ba }
            java.lang.String r1 = r1.getBioDlno()     // Catch:{ Exception -> 0x01ba }
            r6.append(r1)     // Catch:{ Exception -> 0x01ba }
        L_0x012d:
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x01ba }
            r0.setText(r1)     // Catch:{ Exception -> 0x01ba }
            goto L_0x015e
        L_0x0135:
            java.lang.String r0 = r9.Z     // Catch:{ Exception -> 0x01ba }
            if (r0 == 0) goto L_0x015e
            ni.r3 r0 = r9.J     // Catch:{ Exception -> 0x01ba }
            if (r0 != 0) goto L_0x0141
            cm.l.v(r3)     // Catch:{ Exception -> 0x01ba }
            r0 = r4
        L_0x0141:
            android.widget.TextView r0 = r0.G     // Catch:{ Exception -> 0x01ba }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ba }
            r6.<init>()     // Catch:{ Exception -> 0x01ba }
            ld.c r7 = r9.y2()     // Catch:{ Exception -> 0x01ba }
            java.lang.String r8 = "DL No. : "
            java.lang.String r2 = r7.b(r2, r8)     // Catch:{ Exception -> 0x01ba }
            r6.append(r2)     // Catch:{ Exception -> 0x01ba }
            r6.append(r1)     // Catch:{ Exception -> 0x01ba }
            java.lang.String r1 = r9.Z     // Catch:{ Exception -> 0x01ba }
            r6.append(r1)     // Catch:{ Exception -> 0x01ba }
            goto L_0x012d
        L_0x015e:
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r9.u2()     // Catch:{ Exception -> 0x01ba }
            com.nic.mparivahan.Dl.Model.BioImgObjX r0 = r0.getBioImgObj()     // Catch:{ Exception -> 0x01ba }
            if (r0 == 0) goto L_0x016d
            java.lang.String r0 = r0.getBiPhoto()     // Catch:{ Exception -> 0x01ba }
            goto L_0x016e
        L_0x016d:
            r0 = r4
        L_0x016e:
            if (r0 == 0) goto L_0x01aa
            int r0 = r0.length()     // Catch:{ Exception -> 0x01ba }
            if (r0 != 0) goto L_0x0177
            goto L_0x01aa
        L_0x0177:
            ni.r3 r0 = r9.J     // Catch:{ Exception -> 0x01ba }
            if (r0 != 0) goto L_0x017f
            cm.l.v(r3)     // Catch:{ Exception -> 0x01ba }
            r0 = r4
        L_0x017f:
            ni.dc r0 = r0.I     // Catch:{ Exception -> 0x01ba }
            androidx.cardview.widget.CardView r0 = r0.f25960f     // Catch:{ Exception -> 0x01ba }
            r0.setVisibility(r5)     // Catch:{ Exception -> 0x01ba }
            ni.r3 r0 = r9.J     // Catch:{ Exception -> 0x01ba }
            if (r0 != 0) goto L_0x018e
            cm.l.v(r3)     // Catch:{ Exception -> 0x01ba }
            r0 = r4
        L_0x018e:
            ni.dc r0 = r0.I     // Catch:{ Exception -> 0x01ba }
            android.widget.ImageView r0 = r0.f25956b     // Catch:{ Exception -> 0x01ba }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r9.u2()     // Catch:{ Exception -> 0x01ba }
            com.nic.mparivahan.Dl.Model.BioImgObjX r1 = r1.getBioImgObj()     // Catch:{ Exception -> 0x01ba }
            if (r1 == 0) goto L_0x01a1
            java.lang.String r1 = r1.getBiPhoto()     // Catch:{ Exception -> 0x01ba }
            goto L_0x01a2
        L_0x01a1:
            r1 = r4
        L_0x01a2:
            android.graphics.Bitmap r1 = com.nic.mparivahan.dlservices.utilities.d.a(r1)     // Catch:{ Exception -> 0x01ba }
            r0.setImageBitmap(r1)     // Catch:{ Exception -> 0x01ba }
            goto L_0x01ba
        L_0x01aa:
            ni.r3 r0 = r9.J     // Catch:{ Exception -> 0x01ba }
            if (r0 != 0) goto L_0x01b2
            cm.l.v(r3)     // Catch:{ Exception -> 0x01ba }
            r0 = r4
        L_0x01b2:
            ni.dc r0 = r0.I     // Catch:{ Exception -> 0x01ba }
            androidx.cardview.widget.CardView r0 = r0.f25960f     // Catch:{ Exception -> 0x01ba }
            r1 = 4
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x01ba }
        L_0x01ba:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "dd-MM-yyyy"
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0.<init>(r1, r2)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            java.lang.String r1 = "format(...)"
            cm.l.e(r0, r1)
            r9.j3(r0)
            ni.r3 r0 = r9.J
            if (r0 != 0) goto L_0x01de
            cm.l.v(r3)
            r0 = r4
        L_0x01de:
            android.widget.TextView r0 = r0.C
            java.lang.String r1 = r9.t2()
            r0.setText(r1)
            com.nic.mparivahan.a$a r0 = com.nic.mparivahan.a.f9624a
            boolean r0 = r0.a(r9)
            java.lang.String r1 = "viewModel"
            if (r0 == 0) goto L_0x0211
            ak.a r0 = r9.K
            if (r0 != 0) goto L_0x01f9
            cm.l.v(r1)
            r0 = r4
        L_0x01f9:
            java.lang.String r2 = r9.N
            if (r2 != 0) goto L_0x0203
            java.lang.String r2 = "mApplNo"
            cm.l.v(r2)
            r2 = r4
        L_0x0203:
            java.lang.String r5 = r9.O
            if (r5 != 0) goto L_0x020d
            java.lang.String r5 = "mApplDob"
            cm.l.v(r5)
            r5 = r4
        L_0x020d:
            r0.g(r2, r5)
            goto L_0x022d
        L_0x0211:
            android.content.Context r0 = r9.getApplicationContext()
            ld.c r2 = r9.y2()
            r6 = 2132018237(0x7f14043d, float:1.9674775E38)
            java.lang.String r6 = r9.getString(r6)
            java.lang.String r7 = "label_log_check_internet"
            java.lang.String r2 = r2.b(r7, r6)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r5)
            r0.show()
        L_0x022d:
            ak.a r0 = r9.K
            if (r0 != 0) goto L_0x0235
            cm.l.v(r1)
            r0 = r4
        L_0x0235:
            androidx.lifecycle.y r0 = r0.k()
            com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity$e r1 = new com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity$e
            r1.<init>(r9)
            com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity$j r2 = new com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity$j
            r2.<init>(r1)
            r0.g(r9, r2)
            ni.r3 r0 = r9.J
            if (r0 != 0) goto L_0x024e
            cm.l.v(r3)
            r0 = r4
        L_0x024e:
            android.widget.TextView r0 = r0.f28369z0
            ni.r3 r1 = r9.J
            if (r1 != 0) goto L_0x0258
            cm.l.v(r3)
            r1 = r4
        L_0x0258:
            android.widget.TextView r1 = r1.f28369z0
            int r1 = r1.getPaintFlags()
            r1 = r1 | 8
            r0.setPaintFlags(r1)
            ni.r3 r0 = r9.J
            if (r0 != 0) goto L_0x026b
            cm.l.v(r3)
            goto L_0x026c
        L_0x026b:
            r4 = r0
        L_0x026c:
            android.widget.TextView r0 = r4.f28369z0
            ak.x r1 = new ak.x
            r1.<init>(r9)
            r0.setOnClickListener(r1)
            com.nic.mparivahan.ClServices.ClInterface.ClInter$a r0 = com.nic.mparivahan.ClServices.ClInterface.ClInter.f7830a
            com.nic.mparivahan.ClServices.ClInterface.ClInter r0 = r0.a(r9)
            r9.p3(r0)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            m9.a r1 = new m9.a
            n9.a r2 = new n9.a
            com.nic.mparivahan.ClServices.ClInterface.ClInter r3 = r9.B2()
            r2.<init>(r3)
            r1.<init>(r2)
            r0.<init>((androidx.lifecycle.x0) r9, (androidx.lifecycle.u0.b) r1)
            java.lang.Class<t9.a> r1 = t9.a.class
            androidx.lifecycle.t0 r0 = r0.a(r1)
            t9.a r0 = (t9.a) r0
            r9.o3(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity.G2():void");
    }

    /* access modifiers changed from: private */
    public static final void H2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        try {
            Intent intent = new Intent(dlPhotoAndSignatureActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", dlPhotoAndSignatureActivity.Z);
            intent.putExtra("dob", dlPhotoAndSignatureActivity.f22253a0);
            intent.putExtra("DLDetails", dlPhotoAndSignatureActivity.u2());
            intent.putExtra("Mobile_no", dlPhotoAndSignatureActivity.f22254b0);
            intent.putExtra("lastEndorsedRTO", dlPhotoAndSignatureActivity.f22255c0);
            intent.putExtra("lastEndorsedState", dlPhotoAndSignatureActivity.f22256d0);
            String str = dlPhotoAndSignatureActivity.S;
            if (str == null) {
                cm.l.v("lastEndorseRTOCode");
                str = null;
            }
            intent.putExtra("lastEndorsedRTOCode", str);
            intent.putExtra("lastEndorseStateCode", dlPhotoAndSignatureActivity.f22257e0);
            dlPhotoAndSignatureActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void I2() {
        ak.a aVar = this.K;
        ak.a aVar2 = null;
        if (aVar == null) {
            cm.l.v("viewModel");
            aVar = null;
        }
        aVar.j().g(this, new j(new f(this)));
        ak.a aVar3 = this.K;
        if (aVar3 == null) {
            cm.l.v("viewModel");
            aVar3 = null;
        }
        aVar3.m().g(this, new j(new g(this)));
        ak.a aVar4 = this.K;
        if (aVar4 == null) {
            cm.l.v("viewModel");
        } else {
            aVar2 = aVar4;
        }
        aVar2.l().g(this, new j(new h(this)));
    }

    private final void J2() {
        r3 r3Var = null;
        if (!cm.l.a(q.B0(E2().g()).toString(), "Y") || E2().h().length() <= 0) {
            r3 r3Var2 = this.J;
            if (r3Var2 == null) {
                cm.l.v("mBinding");
                r3Var2 = null;
            }
            r3Var2.R.setClickable(true);
            r3 r3Var3 = this.J;
            if (r3Var3 == null) {
                cm.l.v("mBinding");
                r3Var3 = null;
            }
            r3Var3.S.setClickable(true);
            r3 r3Var4 = this.J;
            if (r3Var4 == null) {
                cm.l.v("mBinding");
                r3Var4 = null;
            }
            r3Var4.R.setEnabled(true);
            r3 r3Var5 = this.J;
            if (r3Var5 == null) {
                cm.l.v("mBinding");
                r3Var5 = null;
            }
            r3Var5.S.setEnabled(true);
            r3 r3Var6 = this.J;
            if (r3Var6 == null) {
                cm.l.v("mBinding");
                r3Var6 = null;
            }
            r3Var6.S.setBackgroundResource(R.drawable.blue_drawable);
            r3 r3Var7 = this.J;
            if (r3Var7 == null) {
                cm.l.v("mBinding");
                r3Var7 = null;
            }
            r3Var7.R.setBackgroundResource(R.drawable.blue_drawable);
        } else {
            r3 r3Var8 = this.J;
            if (r3Var8 == null) {
                cm.l.v("mBinding");
                r3Var8 = null;
            }
            r3Var8.R.setClickable(false);
            r3 r3Var9 = this.J;
            if (r3Var9 == null) {
                cm.l.v("mBinding");
                r3Var9 = null;
            }
            r3Var9.S.setClickable(false);
            r3 r3Var10 = this.J;
            if (r3Var10 == null) {
                cm.l.v("mBinding");
                r3Var10 = null;
            }
            r3Var10.R.setEnabled(false);
            r3 r3Var11 = this.J;
            if (r3Var11 == null) {
                cm.l.v("mBinding");
                r3Var11 = null;
            }
            r3Var11.S.setEnabled(false);
            r3 r3Var12 = this.J;
            if (r3Var12 == null) {
                cm.l.v("mBinding");
                r3Var12 = null;
            }
            r3Var12.S.setBackgroundResource(R.drawable.unselected_button_grey);
            r3 r3Var13 = this.J;
            if (r3Var13 == null) {
                cm.l.v("mBinding");
                r3Var13 = null;
            }
            r3Var13.R.setBackgroundResource(R.drawable.unselected_button_grey);
            r3 r3Var14 = this.J;
            if (r3Var14 == null) {
                cm.l.v("mBinding");
                r3Var14 = null;
            }
            r3Var14.A0.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(E2().h()));
        }
        r3 r3Var15 = this.J;
        if (r3Var15 == null) {
            cm.l.v("mBinding");
            r3Var15 = null;
        }
        r3Var15.R.setOnClickListener(new y(this));
        r3 r3Var16 = this.J;
        if (r3Var16 == null) {
            cm.l.v("mBinding");
            r3Var16 = null;
        }
        r3Var16.S.setOnClickListener(new ak.g(this));
        r3 r3Var17 = this.J;
        if (r3Var17 == null) {
            cm.l.v("mBinding");
            r3Var17 = null;
        }
        r3Var17.Y.setOnClickListener(new ak.h(this));
        r3 r3Var18 = this.J;
        if (r3Var18 == null) {
            cm.l.v("mBinding");
            r3Var18 = null;
        }
        r3Var18.Z.setOnClickListener(new ak.i(this));
        r3 r3Var19 = this.J;
        if (r3Var19 == null) {
            cm.l.v("mBinding");
            r3Var19 = null;
        }
        r3Var19.B0.setOnClickListener(new ak.j(this));
        A2().t().g(this, new j(new i(this)));
        r3 r3Var20 = this.J;
        if (r3Var20 == null) {
            cm.l.v("mBinding");
            r3Var20 = null;
        }
        r3Var20.I.f25959e.setOnClickListener(new k(this));
        r3 r3Var21 = this.J;
        if (r3Var21 == null) {
            cm.l.v("mBinding");
            r3Var21 = null;
        }
        r3Var21.f28341b0.setOnClickListener(new ak.l(this));
        r3 r3Var22 = this.J;
        if (r3Var22 == null) {
            cm.l.v("mBinding");
            r3Var22 = null;
        }
        r3Var22.f28362w.setOnClickListener(new n(this));
        r3 r3Var23 = this.J;
        if (r3Var23 == null) {
            cm.l.v("mBinding");
            r3Var23 = null;
        }
        r3Var23.f28364x.setOnClickListener(new o(this));
        r3 r3Var24 = this.J;
        if (r3Var24 == null) {
            cm.l.v("mBinding");
            r3Var24 = null;
        }
        r3Var24.f28366y.setOnClickListener(new p(this));
        r3 r3Var25 = this.J;
        if (r3Var25 == null) {
            cm.l.v("mBinding");
            r3Var25 = null;
        }
        r3Var25.f28368z.setOnClickListener(new z(this));
        r3 r3Var26 = this.J;
        if (r3Var26 == null) {
            cm.l.v("mBinding");
            r3Var26 = null;
        }
        r3Var26.B.setOnClickListener(new ak.c(this));
        r3 r3Var27 = this.J;
        if (r3Var27 == null) {
            cm.l.v("mBinding");
            r3Var27 = null;
        }
        r3Var27.A.setOnClickListener(new ak.d(this));
        r3 r3Var28 = this.J;
        if (r3Var28 == null) {
            cm.l.v("mBinding");
            r3Var28 = null;
        }
        r3Var28.f28342c0.setOnClickListener(new ak.e(this));
        r3 r3Var29 = this.J;
        if (r3Var29 == null) {
            cm.l.v("mBinding");
        } else {
            r3Var = r3Var29;
        }
        r3Var.f28343d0.setOnClickListener(new ak.f(this));
    }

    /* access modifiers changed from: private */
    public static final void K2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        dlPhotoAndSignatureActivity.L = "1";
        dlPhotoAndSignatureActivity.r2();
    }

    /* access modifiers changed from: private */
    public static final void L2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        ak.a aVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ak.a aVar2;
        DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity2 = dlPhotoAndSignatureActivity;
        cm.l.f(dlPhotoAndSignatureActivity2, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(dlPhotoAndSignatureActivity2)) {
            r3 r3Var = null;
            if (dlPhotoAndSignatureActivity2.M != -1 && cm.l.a(dlPhotoAndSignatureActivity.E2().g(), "Y") && dlPhotoAndSignatureActivity.E2().h().length() > 0) {
                r3 r3Var2 = dlPhotoAndSignatureActivity2.J;
                if (r3Var2 == null) {
                    cm.l.v("mBinding");
                    r3Var2 = null;
                }
                r3Var2.B0.c(true);
                ak.a aVar3 = dlPhotoAndSignatureActivity2.K;
                if (aVar3 == null) {
                    cm.l.v("viewModel");
                    aVar = null;
                } else {
                    aVar = aVar3;
                }
                String str8 = dlPhotoAndSignatureActivity2.N;
                if (str8 == null) {
                    cm.l.v("mApplNo");
                    str = null;
                } else {
                    str = str8;
                }
                String str9 = dlPhotoAndSignatureActivity2.O;
                if (str9 == null) {
                    cm.l.v("mApplDob");
                    str2 = null;
                } else {
                    str2 = str9;
                }
                String str10 = dlPhotoAndSignatureActivity2.T;
                if (str10 == null) {
                    cm.l.v("stateCode");
                    str3 = null;
                } else {
                    str3 = str10;
                }
                str4 = dlPhotoAndSignatureActivity.E2().h();
            } else if (dlPhotoAndSignatureActivity2.M == -1 || dlPhotoAndSignatureActivity2.X.length() <= 0 || dlPhotoAndSignatureActivity2.Y.length() <= 0) {
                String b10 = dlPhotoAndSignatureActivity.y2().b("photo_signature", "");
                r3 r3Var3 = dlPhotoAndSignatureActivity2.J;
                if (r3Var3 == null) {
                    cm.l.v("mBinding");
                } else {
                    r3Var = r3Var3;
                }
                dlPhotoAndSignatureActivity2.r1(b10, r3Var.m());
                return;
            } else {
                r3 r3Var4 = dlPhotoAndSignatureActivity2.J;
                if (r3Var4 == null) {
                    cm.l.v("mBinding");
                    r3Var4 = null;
                }
                r3Var4.B0.c(true);
                ak.a aVar4 = dlPhotoAndSignatureActivity2.K;
                if (aVar4 == null) {
                    cm.l.v("viewModel");
                    aVar2 = null;
                } else {
                    aVar2 = aVar4;
                }
                String str11 = dlPhotoAndSignatureActivity2.N;
                if (str11 == null) {
                    cm.l.v("mApplNo");
                    str7 = null;
                } else {
                    str7 = str11;
                }
                String str12 = dlPhotoAndSignatureActivity2.O;
                if (str12 == null) {
                    cm.l.v("mApplDob");
                    str6 = null;
                } else {
                    str6 = str12;
                }
                String str13 = dlPhotoAndSignatureActivity2.T;
                if (str13 == null) {
                    cm.l.v("stateCode");
                    str5 = null;
                } else {
                    str5 = str13;
                }
                str4 = dlPhotoAndSignatureActivity2.X;
            }
            aVar.n(str, str2, str3, str4, dlPhotoAndSignatureActivity2.Y, dlPhotoAndSignatureActivity2.M);
            return;
        }
        Toast.makeText(dlPhotoAndSignatureActivity.getApplicationContext(), dlPhotoAndSignatureActivity.y2().b("label_log_check_internet", dlPhotoAndSignatureActivity2.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void M2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        dlPhotoAndSignatureActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void N2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        r3 r3Var = dlPhotoAndSignatureActivity.J;
        String str = null;
        if (r3Var == null) {
            cm.l.v("mBinding");
            r3Var = null;
        }
        r3Var.f28341b0.c(true);
        ak.a aVar = dlPhotoAndSignatureActivity.K;
        if (aVar == null) {
            cm.l.v("viewModel");
            aVar = null;
        }
        String str2 = dlPhotoAndSignatureActivity.N;
        if (str2 == null) {
            cm.l.v("mApplNo");
            str2 = null;
        }
        String str3 = dlPhotoAndSignatureActivity.O;
        if (str3 == null) {
            cm.l.v("mApplDob");
        } else {
            str = str3;
        }
        aVar.h(str2, str);
    }

    /* access modifiers changed from: private */
    public static final void O2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        r3 r3Var = dlPhotoAndSignatureActivity.J;
        r3 r3Var2 = null;
        if (r3Var == null) {
            cm.l.v("mBinding");
            r3Var = null;
        }
        r3Var.f28362w.setVisibility(8);
        r3 r3Var3 = dlPhotoAndSignatureActivity.J;
        if (r3Var3 == null) {
            cm.l.v("mBinding");
            r3Var3 = null;
        }
        r3Var3.f28364x.setVisibility(0);
        r3 r3Var4 = dlPhotoAndSignatureActivity.J;
        if (r3Var4 == null) {
            cm.l.v("mBinding");
        } else {
            r3Var2 = r3Var4;
        }
        r3Var2.L.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void P2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        r3 r3Var = dlPhotoAndSignatureActivity.J;
        r3 r3Var2 = null;
        if (r3Var == null) {
            cm.l.v("mBinding");
            r3Var = null;
        }
        r3Var.f28364x.setVisibility(8);
        r3 r3Var3 = dlPhotoAndSignatureActivity.J;
        if (r3Var3 == null) {
            cm.l.v("mBinding");
            r3Var3 = null;
        }
        r3Var3.f28362w.setVisibility(0);
        r3 r3Var4 = dlPhotoAndSignatureActivity.J;
        if (r3Var4 == null) {
            cm.l.v("mBinding");
        } else {
            r3Var2 = r3Var4;
        }
        r3Var2.L.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void Q2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        r3 r3Var = dlPhotoAndSignatureActivity.J;
        r3 r3Var2 = null;
        if (r3Var == null) {
            cm.l.v("mBinding");
            r3Var = null;
        }
        r3Var.f28366y.setVisibility(8);
        r3 r3Var3 = dlPhotoAndSignatureActivity.J;
        if (r3Var3 == null) {
            cm.l.v("mBinding");
            r3Var3 = null;
        }
        r3Var3.f28368z.setVisibility(0);
        r3 r3Var4 = dlPhotoAndSignatureActivity.J;
        if (r3Var4 == null) {
            cm.l.v("mBinding");
        } else {
            r3Var2 = r3Var4;
        }
        r3Var2.M.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void R2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        r3 r3Var = dlPhotoAndSignatureActivity.J;
        r3 r3Var2 = null;
        if (r3Var == null) {
            cm.l.v("mBinding");
            r3Var = null;
        }
        r3Var.f28368z.setVisibility(8);
        r3 r3Var3 = dlPhotoAndSignatureActivity.J;
        if (r3Var3 == null) {
            cm.l.v("mBinding");
            r3Var3 = null;
        }
        r3Var3.f28366y.setVisibility(0);
        r3 r3Var4 = dlPhotoAndSignatureActivity.J;
        if (r3Var4 == null) {
            cm.l.v("mBinding");
        } else {
            r3Var2 = r3Var4;
        }
        r3Var2.M.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void S2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        r3 r3Var = dlPhotoAndSignatureActivity.J;
        r3 r3Var2 = null;
        if (r3Var == null) {
            cm.l.v("mBinding");
            r3Var = null;
        }
        r3Var.B.setVisibility(8);
        r3 r3Var3 = dlPhotoAndSignatureActivity.J;
        if (r3Var3 == null) {
            cm.l.v("mBinding");
            r3Var3 = null;
        }
        r3Var3.A.setVisibility(0);
        r3 r3Var4 = dlPhotoAndSignatureActivity.J;
        if (r3Var4 == null) {
            cm.l.v("mBinding");
        } else {
            r3Var2 = r3Var4;
        }
        r3Var2.N.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void T2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        r3 r3Var = dlPhotoAndSignatureActivity.J;
        r3 r3Var2 = null;
        if (r3Var == null) {
            cm.l.v("mBinding");
            r3Var = null;
        }
        r3Var.A.setVisibility(8);
        r3 r3Var3 = dlPhotoAndSignatureActivity.J;
        if (r3Var3 == null) {
            cm.l.v("mBinding");
            r3Var3 = null;
        }
        r3Var3.B.setVisibility(0);
        r3 r3Var4 = dlPhotoAndSignatureActivity.J;
        if (r3Var4 == null) {
            cm.l.v("mBinding");
        } else {
            r3Var2 = r3Var4;
        }
        r3Var2.N.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void U2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        r3 r3Var = dlPhotoAndSignatureActivity.J;
        r3 r3Var2 = null;
        if (r3Var == null) {
            cm.l.v("mBinding");
            r3Var = null;
        }
        r3Var.f28342c0.setVisibility(8);
        r3 r3Var3 = dlPhotoAndSignatureActivity.J;
        if (r3Var3 == null) {
            cm.l.v("mBinding");
            r3Var3 = null;
        }
        r3Var3.f28343d0.setVisibility(0);
        r3 r3Var4 = dlPhotoAndSignatureActivity.J;
        if (r3Var4 == null) {
            cm.l.v("mBinding");
        } else {
            r3Var2 = r3Var4;
        }
        r3Var2.O.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void V2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        r3 r3Var = dlPhotoAndSignatureActivity.J;
        r3 r3Var2 = null;
        if (r3Var == null) {
            cm.l.v("mBinding");
            r3Var = null;
        }
        r3Var.f28343d0.setVisibility(8);
        r3 r3Var3 = dlPhotoAndSignatureActivity.J;
        if (r3Var3 == null) {
            cm.l.v("mBinding");
            r3Var3 = null;
        }
        r3Var3.f28342c0.setVisibility(0);
        r3 r3Var4 = dlPhotoAndSignatureActivity.J;
        if (r3Var4 == null) {
            cm.l.v("mBinding");
        } else {
            r3Var2 = r3Var4;
        }
        r3Var2.O.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void W2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        dlPhotoAndSignatureActivity.L = "0";
        dlPhotoAndSignatureActivity.F2();
    }

    /* access modifiers changed from: private */
    public static final void X2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        dlPhotoAndSignatureActivity.L = "0";
        dlPhotoAndSignatureActivity.r2();
    }

    /* access modifiers changed from: private */
    public static final void Y2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        dlPhotoAndSignatureActivity.L = "1";
        dlPhotoAndSignatureActivity.F2();
    }

    /* access modifiers changed from: private */
    public static final void a3(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        dlPhotoAndSignatureActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void b3(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        try {
            Intent intent = new Intent(dlPhotoAndSignatureActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", dlPhotoAndSignatureActivity.Z);
            intent.putExtra("dob", dlPhotoAndSignatureActivity.f22253a0);
            intent.putExtra("DLDetails", dlPhotoAndSignatureActivity.u2());
            intent.putExtra("Mobile_no", dlPhotoAndSignatureActivity.f22254b0);
            intent.putExtra("lastEndorsedRTO", dlPhotoAndSignatureActivity.f22255c0);
            intent.putExtra("lastEndorsedState", dlPhotoAndSignatureActivity.f22256d0);
            String str = dlPhotoAndSignatureActivity.S;
            if (str == null) {
                cm.l.v("lastEndorseRTOCode");
                str = null;
            }
            intent.putExtra("lastEndorsedRTOCode", str);
            intent.putExtra("lastEndorseStateCode", dlPhotoAndSignatureActivity.f22257e0);
            if (cm.l.a(dlPhotoAndSignatureActivity.E2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", dlPhotoAndSignatureActivity.D2());
                intent.putExtra("listHeaderSteps", dlPhotoAndSignatureActivity.z2());
            }
            dlPhotoAndSignatureActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void c3(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        try {
            if (cm.l.a(dlPhotoAndSignatureActivity.E2().b(), VContant.MULTISERVICE_PURPOSE_CODE) && dlPhotoAndSignatureActivity.z2().size() > 1) {
                Dialog dialog = new Dialog(dlPhotoAndSignatureActivity);
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
                TextView textView2 = (TextView) findViewById3;
                View findViewById4 = dialog.findViewById(R.id.service_label_list_serial);
                cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView3 = (TextView) findViewById4;
                ((ImageView) findViewById).setOnClickListener(new v(dialog));
                int size = dlPhotoAndSignatureActivity.z2().size();
                String str = "";
                int i10 = 0;
                String str2 = str;
                while (i10 < size) {
                    str = str + ((String) dlPhotoAndSignatureActivity.z2().get(i10)) + 10;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    i10++;
                    sb2.append(i10);
                    sb2.append(".\n");
                    str2 = sb2.toString();
                }
                textView2.setText(str);
                textView3.setText(str2);
                textView.setOnClickListener(new w(dialog));
                Window window2 = dialog.getWindow();
                cm.l.c(window2);
                window2.setGravity(48);
                window2.setLayout(-2, -2);
                dialog.show();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void d3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void e3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void f3(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new q(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void g3(Dialog dialog, DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(dlPhotoAndSignatureActivity, DashBoard.class);
        intent.setFlags(67108864);
        dlPhotoAndSignatureActivity.startActivity(intent);
        dlPhotoAndSignatureActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void i3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void r2() {
        if (com.nic.mparivahan.dlservices.utilities.e.e(this)) {
            t2.a.f16505a.b(this).j().f(600).i().h(new b(this));
        }
    }

    /* access modifiers changed from: private */
    public final void s3(boolean z10) {
        if (z10) {
            try {
                this.f22261i0 = new t0(this, R.string.please_wait_2, true);
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                return;
            }
        }
        t0 t0Var = this.f22261i0;
        if (t0Var == null) {
            return;
        }
        if (z10) {
            t0Var.b();
        } else {
            t0Var.a();
        }
    }

    /* access modifiers changed from: private */
    public final void u3(List list) {
        Integer num;
        String str;
        String str2;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                num = null;
                break;
            }
            Object obj = list.get(i10);
            cm.l.c(obj);
            if (cm.l.a(((ApplFlowStatusListItem) obj).getStatus(), "Pending")) {
                Object obj2 = list.get(i10);
                cm.l.c(obj2);
                num = ((ApplFlowStatusListItem) obj2).getAcCd();
                break;
            }
            i10++;
        }
        if (num == null) {
            new DLServiceFinalSubmitedActivity().D1(this);
            return;
        }
        try {
            DlLogUpdate.a aVar = DlLogUpdate.f8706k;
            String str3 = this.O;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str = null;
            } else {
                str = str3;
            }
            String str4 = this.N;
            if (str4 == null) {
                cm.l.v("mApplNo");
                str4 = null;
            }
            long parseLong = Long.parseLong(str4);
            int parseInt = Integer.parseInt(C2().k());
            String str5 = this.f22253a0;
            cm.l.c(str5);
            String str6 = this.Z;
            cm.l.c(str6);
            String str7 = this.S;
            if (str7 == null) {
                cm.l.v("lastEndorseRTOCode");
                str2 = null;
            } else {
                str2 = str7;
            }
            aVar.a(this, str, parseLong, parseInt, str5, str6, str2);
        } catch (Exception unused) {
        }
        Z2(num);
    }

    /* access modifiers changed from: private */
    public static final void v2(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                r3 r3Var = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    ContentResolver contentResolver = dlPhotoAndSignatureActivity.getContentResolver();
                    cm.l.c(data);
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(dlPhotoAndSignatureActivity.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                String str2 = dlPhotoAndSignatureActivity.L;
                if (str2 == null) {
                    cm.l.v("imgType");
                    str2 = null;
                }
                if (cm.l.a(str2, "0")) {
                    r3 r3Var2 = dlPhotoAndSignatureActivity.J;
                    if (r3Var2 == null) {
                        cm.l.v("mBinding");
                    } else {
                        r3Var = r3Var2;
                    }
                    r3Var.A0.setImageBitmap(bitmap);
                    dlPhotoAndSignatureActivity.X = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                } else if (cm.l.a(str2, "1")) {
                    r3 r3Var3 = dlPhotoAndSignatureActivity.J;
                    if (r3Var3 == null) {
                        cm.l.v("mBinding");
                    } else {
                        r3Var = r3Var3;
                    }
                    r3Var.f28340a0.setImageBitmap(bitmap);
                    dlPhotoAndSignatureActivity.Y = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                }
            } else if (d10 == 64) {
                dlPhotoAndSignatureActivity.s3(false);
                Toast.makeText(dlPhotoAndSignatureActivity, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            dlPhotoAndSignatureActivity.s3(false);
        } catch (Exception unused) {
        }
    }

    private final void v3() {
        try {
            Intent intent = new Intent(this, DlDocActivity.class);
            String str = this.N;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.O;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("dl_st_dl_details_obj", u2());
            intent.putExtra("DL", this.Z);
            intent.putExtra("dob", this.f22253a0);
            intent.putExtra("DLDetails", u2());
            intent.putExtra("Mobile_no", this.f22254b0);
            intent.putExtra("lastEndorsedRTO", this.f22255c0);
            intent.putExtra("lastEndorsedState", this.f22256d0);
            String str4 = this.S;
            if (str4 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("lastEndorseStateCode", this.f22257e0);
            if (cm.l.a(E2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", D2());
                intent.putExtra("listHeaderSteps", z2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void w3() {
        try {
            Intent intent = new Intent(this, DLRenewalFeePaymentActivity.class);
            String str = this.N;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.O;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("dl_st_dl_details_obj", u2());
            intent.putExtra("DL", this.Z);
            intent.putExtra("dob", this.f22253a0);
            intent.putExtra("DLDetails", u2());
            intent.putExtra("Mobile_no", this.f22254b0);
            intent.putExtra("lastEndorsedRTO", this.f22255c0);
            intent.putExtra("lastEndorsedState", this.f22256d0);
            String str4 = this.S;
            if (str4 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("lastEndorseStateCode", this.f22257e0);
            if (cm.l.a(E2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", D2());
                intent.putExtra("listHeaderSteps", z2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void x3(DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(dlPhotoAndSignatureActivity, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                r3 r3Var = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    ContentResolver contentResolver = dlPhotoAndSignatureActivity.getContentResolver();
                    cm.l.c(data);
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(dlPhotoAndSignatureActivity.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                String str2 = dlPhotoAndSignatureActivity.L;
                if (str2 == null) {
                    cm.l.v("imgType");
                    str2 = null;
                }
                if (cm.l.a(str2, "0")) {
                    r3 r3Var2 = dlPhotoAndSignatureActivity.J;
                    if (r3Var2 == null) {
                        cm.l.v("mBinding");
                    } else {
                        r3Var = r3Var2;
                    }
                    r3Var.A0.setImageBitmap(bitmap);
                    dlPhotoAndSignatureActivity.X = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                } else if (cm.l.a(str2, "1")) {
                    r3 r3Var3 = dlPhotoAndSignatureActivity.J;
                    if (r3Var3 == null) {
                        cm.l.v("mBinding");
                    } else {
                        r3Var = r3Var3;
                    }
                    r3Var.f28340a0.setImageBitmap(bitmap);
                    dlPhotoAndSignatureActivity.Y = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                }
            } else if (d10 == 64) {
                dlPhotoAndSignatureActivity.s3(false);
                Toast.makeText(dlPhotoAndSignatureActivity, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            dlPhotoAndSignatureActivity.s3(false);
        } catch (Exception unused) {
        }
    }

    private final void y3() {
        try {
            Intent intent = new Intent(this, DlPhotoAndSignatureActivity.class);
            String str = this.N;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.O;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("dl_st_dl_details_obj", u2());
            intent.putExtra("DL", this.Z);
            intent.putExtra("dob", this.f22253a0);
            intent.putExtra("DLDetails", u2());
            intent.putExtra("Mobile_no", this.f22254b0);
            intent.putExtra("lastEndorsedRTO", this.f22255c0);
            intent.putExtra("lastEndorsedState", this.f22256d0);
            String str4 = this.S;
            if (str4 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("lastEndorseStateCode", this.f22257e0);
            if (cm.l.a(E2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", D2());
                intent.putExtra("listHeaderSteps", z2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void z3() {
        try {
            Intent intent = new Intent(this, DlRenewalSlotsActivity.class);
            String str = this.N;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.O;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("dl_st_dl_details_obj", u2());
            intent.putExtra("DL", this.Z);
            intent.putExtra("dob", this.f22253a0);
            intent.putExtra("DLDetails", u2());
            intent.putExtra("Mobile_no", this.f22254b0);
            intent.putExtra("lastEndorsedRTO", this.f22255c0);
            intent.putExtra("lastEndorsedState", this.f22256d0);
            String str4 = this.S;
            if (str4 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("lastEndorseStateCode", this.f22257e0);
            if (cm.l.a(E2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", D2());
                intent.putExtra("listHeaderSteps", z2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final t9.a A2() {
        t9.a aVar = this.f22262j0;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mClDlViewModel");
        return null;
    }

    public final ClInter B2() {
        ClInter clInter = this.f22263k0;
        if (clInter != null) {
            return clInter;
        }
        cm.l.v("mClInter");
        return null;
    }

    public final ld.g C2() {
        ld.g gVar = this.f22259g0;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mSessionmanger");
        return null;
    }

    public final ArrayList D2() {
        ArrayList arrayList = this.f22265m0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("multiListName");
        return null;
    }

    public final ld.f E2() {
        ld.f fVar = this.f22267o0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final void Z2(Integer num) {
        if (num != null && num.intValue() == 135) {
            y3();
        } else if (num != null && num.intValue() == 134) {
            w3();
        } else if (num != null && num.intValue() == 123) {
            v3();
        } else if (num != null && num.intValue() == 371) {
            z3();
        } else if (num != null && num.intValue() == 455) {
            f3(y2().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void h3(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.doc_uploading_diloge_ui);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
        if (attributes != null) {
            attributes.windowAnimations = R.style.PauseDialogAnimation;
        }
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(y2().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new r(dialog));
        dialog.show();
    }

    public final void j3(String str) {
        cm.l.f(str, "<set-?>");
        this.f22258f0 = str;
    }

    public final void k3(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.V = dldetobjX;
    }

    public final void l3(String str) {
        cm.l.f(str, "<set-?>");
        this.f22264l0 = str;
    }

    public final void m3(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f22260h0 = cVar;
    }

    public final void n3(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f22266n0 = arrayList;
    }

    public final void o3(t9.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.f22262j0 = aVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_dl_status_photo_sign);
        cm.l.e(f10, "setContentView(...)");
        this.J = (r3) f10;
        q3(new ld.g(this));
        m3(new ld.c(this));
        e.a aVar = v9.e.f17509a;
        r3 r3Var = this.J;
        r3 r3Var2 = null;
        if (r3Var == null) {
            cm.l.v("mBinding");
            r3Var = null;
        }
        aVar.A1(this, r3Var);
        t3(new ld.f(this));
        G2();
        I2();
        J2();
        r3 r3Var3 = this.J;
        if (r3Var3 == null) {
            cm.l.v("mBinding");
            r3Var3 = null;
        }
        r3Var3.P.f29577d.setOnClickListener(new s(this));
        if (cm.l.a(E2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                Serializable serializableExtra = getIntent().getSerializableExtra("multiList");
                cm.l.d(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                r3((ArrayList) serializableExtra);
                Serializable serializableExtra2 = getIntent().getSerializableExtra("listHeaderSteps");
                cm.l.d(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                n3((ArrayList) serializableExtra2);
                if (z2().size() == 1) {
                    r3 r3Var4 = this.J;
                    if (r3Var4 == null) {
                        cm.l.v("mBinding");
                        r3Var4 = null;
                    }
                    r3Var4.P.f29580g.setText((CharSequence) z2().get(0));
                    r3 r3Var5 = this.J;
                    if (r3Var5 == null) {
                        cm.l.v("mBinding");
                        r3Var5 = null;
                    }
                    r3Var5.P.f29579f.setVisibility(8);
                } else {
                    r3 r3Var6 = this.J;
                    if (r3Var6 == null) {
                        cm.l.v("mBinding");
                        r3Var6 = null;
                    }
                    TextView textView = r3Var6.P.f29580g;
                    String b10 = y2().b("dl_services", getString(R.string.dl_services));
                    cm.l.c(b10);
                    textView.setText(b10);
                    r3 r3Var7 = this.J;
                    if (r3Var7 == null) {
                        cm.l.v("mBinding");
                        r3Var7 = null;
                    }
                    r3Var7.P.f29579f.setVisibility(8);
                    r3 r3Var8 = this.J;
                    if (r3Var8 == null) {
                        cm.l.v("mBinding");
                        r3Var8 = null;
                    }
                    TextView textView2 = r3Var8.P.f29580g;
                    r3 r3Var9 = this.J;
                    if (r3Var9 == null) {
                        cm.l.v("mBinding");
                        r3Var9 = null;
                    }
                    textView2.setPaintFlags(r3Var9.P.f29580g.getPaintFlags() | 8);
                }
            } catch (Exception unused) {
            }
        } else {
            r3 r3Var10 = this.J;
            if (r3Var10 == null) {
                cm.l.v("mBinding");
                r3Var10 = null;
            }
            r3Var10.P.f29580g.setText(E2().i());
        }
        r3 r3Var11 = this.J;
        if (r3Var11 == null) {
            cm.l.v("mBinding");
            r3Var11 = null;
        }
        r3Var11.P.f29581h.setOnClickListener(new t(this));
        r3 r3Var12 = this.J;
        if (r3Var12 == null) {
            cm.l.v("mBinding");
            r3Var12 = null;
        }
        r3Var12.P.f29580g.setOnClickListener(new u(this));
        r3 r3Var13 = this.J;
        if (r3Var13 == null) {
            cm.l.v("mBinding");
            r3Var13 = null;
        }
        r3Var13.P.f29578e.setVisibility(8);
        r3 r3Var14 = this.J;
        if (r3Var14 == null) {
            cm.l.v("mBinding");
            r3Var14 = null;
        }
        r3Var14.G.setVisibility(0);
        r3 r3Var15 = this.J;
        if (r3Var15 == null) {
            cm.l.v("mBinding");
            r3Var15 = null;
        }
        r3Var15.f28369z0.setVisibility(0);
        r3 r3Var16 = this.J;
        if (r3Var16 == null) {
            cm.l.v("mBinding");
        } else {
            r3Var2 = r3Var16;
        }
        r3Var2.I.f25961g.setText(E2().i());
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        String b10;
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 222) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                b10 = y2().b("go_settings", "");
            } else {
                return;
            }
        } else if (i10 == 1001) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                b10 = y2().b("per_denied", getString(R.string.permission));
            } else {
                return;
            }
        } else {
            return;
        }
        Toast.makeText(this, b10, 0).show();
    }

    public final void p3(ClInter clInter) {
        cm.l.f(clInter, "<set-?>");
        this.f22263k0 = clInter;
    }

    public final void q3(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f22259g0 = gVar;
    }

    public final void r3(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f22265m0 = arrayList;
    }

    public final String s2(String str) {
        String str2;
        cm.l.f(str, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS+ZZ:ZZ");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            cm.l.e(parse, "parse(...)");
            str2 = simpleDateFormat2.format(parse);
        } catch (ParseException unused) {
            str2 = null;
        }
        return String.valueOf(str2);
    }

    public final String t2() {
        String str = this.f22258f0;
        if (str != null) {
            return str;
        }
        cm.l.v("app_date");
        return null;
    }

    public final void t3(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f22267o0 = fVar;
    }

    public final DldetobjX u2() {
        DldetobjX dldetobjX = this.V;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    public final d.c w2() {
        return this.f22269q0;
    }

    public final String x2() {
        return this.f22264l0;
    }

    public final ld.c y2() {
        ld.c cVar = this.f22260h0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ArrayList z2() {
        ArrayList arrayList = this.f22266n0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("listHeaderSteps");
        return null;
    }
}
