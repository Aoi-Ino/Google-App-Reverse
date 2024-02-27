package com.nic.mparivahan.dlservices.newlearner;

import android.app.Dialog;
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
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bj.a1;
import bj.b1;
import bj.c1;
import bj.i0;
import bj.j0;
import bj.k0;
import bj.l0;
import bj.m0;
import bj.n0;
import bj.o0;
import bj.p0;
import bj.q0;
import bj.r0;
import bj.s0;
import bj.v0;
import bj.w0;
import bj.y0;
import bj.z0;
import bm.l;
import cb.t0;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdate;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.data.model.temp.PhotoDto;
import com.nic.mparivahan.dlservices.newlearner.DataClass.CheckPhotoSignResponseModal;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse;
import com.nic.mparivahan.dlservices.ui.acknow.OlaMast;
import com.nic.mparivahan.dlservices.ui.acknow.ResponseBody;
import com.nic.mparivahan.dlservices.ui.acknow.ResponseMessage;
import com.nic.mparivahan.dlservices.ui.acknow.TransReqItem;
import com.nic.mparivahan.dlservices.ui.newlearner.Service.NewLLServices;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import ni.t2;
import pl.x;
import t2.a;

public final class LLPhotoSign extends androidx.appcompat.app.d {

    /* renamed from: h0  reason: collision with root package name */
    public static final a f21704h0 = new a((cm.g) null);
    /* access modifiers changed from: private */

    /* renamed from: i0  reason: collision with root package name */
    public static final int f21705i0 = 7091;
    /* access modifiers changed from: private */
    public t2 G;
    private ak.a H;
    private String I;
    /* access modifiers changed from: private */
    public int J = -1;
    /* access modifiers changed from: private */
    public String K;
    /* access modifiers changed from: private */
    public String L;
    /* access modifiers changed from: private */
    public String M;
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
    public String S = "";
    private String T = "";
    private String U = "";
    private String V = "";
    private String W = "";
    private String X = "";
    private String Y = "";
    public String Z;

    /* renamed from: a0  reason: collision with root package name */
    public ld.g f21706a0;

    /* renamed from: b0  reason: collision with root package name */
    public ld.c f21707b0;

    /* renamed from: c0  reason: collision with root package name */
    private t0 f21708c0;

    /* renamed from: d0  reason: collision with root package name */
    private NewLLServices f21709d0;
    /* access modifiers changed from: private */

    /* renamed from: e0  reason: collision with root package name */
    public xj.b f21710e0;
    /* access modifiers changed from: private */

    /* renamed from: f0  reason: collision with root package name */
    public final d.c f21711f0;

    /* renamed from: g0  reason: collision with root package name */
    private d.c f21712g0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }

        public final int a() {
            return LLPhotoSign.f21705i0;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLPhotoSign f21713e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LLPhotoSign lLPhotoSign) {
            super(1);
            this.f21713e = lLPhotoSign;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f21713e.X1().a(intent);
            this.f21713e.E2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLPhotoSign f21714e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LLPhotoSign lLPhotoSign) {
            super(1);
            this.f21714e = lLPhotoSign;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f21714e.f21711f0.a(intent);
            this.f21714e.E2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLPhotoSign f21715e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LLPhotoSign lLPhotoSign) {
            super(1);
            this.f21715e = lLPhotoSign;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f21715e.f21711f0.a(intent);
            this.f21715e.E2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLPhotoSign f21716e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(LLPhotoSign lLPhotoSign) {
            super(1);
            this.f21716e = lLPhotoSign;
        }

        public final void b(DlApplStatusResponse dlApplStatusResponse) {
            List<TransReqItem> transReq;
            TransReqItem transReqItem;
            try {
                ResponseMessage responseMessage = dlApplStatusResponse.getResponseMessage();
                if (responseMessage != null) {
                    Integer statusCode = responseMessage.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200) {
                            LLPhotoSign lLPhotoSign = this.f21716e;
                            ResponseBody responseBody = dlApplStatusResponse.getResponseBody();
                            String str = null;
                            lLPhotoSign.M = String.valueOf(responseBody != null ? responseBody.getApdFullName() : null);
                            LLPhotoSign lLPhotoSign2 = this.f21716e;
                            ResponseBody responseBody2 = dlApplStatusResponse.getResponseBody();
                            lLPhotoSign2.N = String.valueOf(responseBody2 != null ? responseBody2.getApdSwdFullName() : null);
                            LLPhotoSign lLPhotoSign3 = this.f21716e;
                            ResponseBody responseBody3 = dlApplStatusResponse.getResponseBody();
                            lLPhotoSign3.R = String.valueOf((responseBody3 == null || (transReq = responseBody3.getTransReq()) == null || (transReqItem = transReq.get(0)) == null) ? null : transReqItem.getTrTrCd());
                            ResponseBody responseBody4 = dlApplStatusResponse.getResponseBody();
                            OlaMast olaMast = responseBody4 != null ? responseBody4.getOlaMast() : null;
                            LLPhotoSign lLPhotoSign4 = this.f21716e;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd1() : null);
                            sb2.append(' ');
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd2() : null);
                            sb2.append(' ');
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd3() : null);
                            lLPhotoSign4.O = sb2.toString();
                            this.f21716e.P = String.valueOf(olaMast != null ? olaMast.getOmOfficecd() : null);
                            this.f21716e.Q = String.valueOf(olaMast != null ? olaMast.getOmStCode() : null);
                            t2 G1 = this.f21716e.G;
                            if (G1 == null) {
                                cm.l.v("mBinding");
                                G1 = null;
                            }
                            TextView textView = G1.D;
                            String E1 = this.f21716e.K;
                            if (E1 == null) {
                                cm.l.v("mApplNo");
                                E1 = null;
                            }
                            textView.setText(E1);
                            t2 G12 = this.f21716e.G;
                            if (G12 == null) {
                                cm.l.v("mBinding");
                                G12 = null;
                            }
                            TextView textView2 = G12.F;
                            String B1 = this.f21716e.L;
                            if (B1 == null) {
                                cm.l.v("mApplDob");
                                B1 = null;
                            }
                            textView2.setText(B1);
                            t2 G13 = this.f21716e.G;
                            if (G13 == null) {
                                cm.l.v("mBinding");
                                G13 = null;
                            }
                            TextView textView3 = G13.E;
                            String D1 = this.f21716e.M;
                            if (D1 == null) {
                                cm.l.v("mApplName");
                                D1 = null;
                            }
                            textView3.setText(D1);
                            t2 G14 = this.f21716e.G;
                            if (G14 == null) {
                                cm.l.v("mBinding");
                                G14 = null;
                            }
                            TextView textView4 = G14.H;
                            String C1 = this.f21716e.N;
                            if (C1 == null) {
                                cm.l.v("mApplFather");
                                C1 = null;
                            }
                            textView4.setText(C1);
                            t2 G15 = this.f21716e.G;
                            if (G15 == null) {
                                cm.l.v("mBinding");
                                G15 = null;
                            }
                            TextView textView5 = G15.S;
                            String F1 = this.f21716e.O;
                            if (F1 == null) {
                                cm.l.v("mApplRtoName");
                                F1 = null;
                            }
                            textView5.setText(F1);
                            this.f21716e.J = 0;
                            if (com.nic.mparivahan.a.f9624a.a(this.f21716e)) {
                                xj.b A1 = this.f21716e.f21710e0;
                                if (A1 == null) {
                                    cm.l.v("learnerLicenceVM");
                                    A1 = null;
                                }
                                String E12 = this.f21716e.K;
                                if (E12 == null) {
                                    cm.l.v("mApplNo");
                                } else {
                                    str = E12;
                                }
                                A1.g(str);
                                return;
                            }
                            Toast.makeText(this.f21716e.getApplicationContext(), this.f21716e.Y1().b("label_log_check_internet", this.f21716e.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusResponse) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLPhotoSign f21717e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(LLPhotoSign lLPhotoSign) {
            super(1);
            this.f21717e = lLPhotoSign;
        }

        public final void b(CheckPhotoSignResponseModal checkPhotoSignResponseModal) {
            try {
                t2 t2Var = null;
                if (com.nic.mparivahan.dlservices.utilities.d.d(checkPhotoSignResponseModal.getPhoto())) {
                    Bitmap c10 = com.nic.mparivahan.dlservices.utilities.e.c(checkPhotoSignResponseModal.getPhoto());
                    t2 G1 = this.f21717e.G;
                    if (G1 == null) {
                        cm.l.v("mBinding");
                        G1 = null;
                    }
                    G1.f28660u0.setImageBitmap(c10);
                    t2 G12 = this.f21717e.G;
                    if (G12 == null) {
                        cm.l.v("mBinding");
                        G12 = null;
                    }
                    G12.O.setClickable(false);
                    t2 G13 = this.f21717e.G;
                    if (G13 == null) {
                        cm.l.v("mBinding");
                        G13 = null;
                    }
                    G13.P.setClickable(false);
                    t2 G14 = this.f21717e.G;
                    if (G14 == null) {
                        cm.l.v("mBinding");
                        G14 = null;
                    }
                    G14.O.setEnabled(false);
                    t2 G15 = this.f21717e.G;
                    if (G15 == null) {
                        cm.l.v("mBinding");
                        G15 = null;
                    }
                    G15.P.setEnabled(false);
                    t2 G16 = this.f21717e.G;
                    if (G16 == null) {
                        cm.l.v("mBinding");
                        G16 = null;
                    }
                    G16.P.setBackgroundResource(R.drawable.unselected_button_grey);
                    t2 G17 = this.f21717e.G;
                    if (G17 == null) {
                        cm.l.v("mBinding");
                        G17 = null;
                    }
                    G17.O.setBackgroundResource(R.drawable.unselected_button_grey);
                    this.f21717e.S = checkPhotoSignResponseModal.getPhoto();
                }
                if (com.nic.mparivahan.dlservices.utilities.d.d(checkPhotoSignResponseModal.getSignature())) {
                    Bitmap c11 = com.nic.mparivahan.dlservices.utilities.e.c(checkPhotoSignResponseModal.getSignature());
                    t2 G18 = this.f21717e.G;
                    if (G18 == null) {
                        cm.l.v("mBinding");
                    } else {
                        t2Var = G18;
                    }
                    t2Var.V.setImageBitmap(c11);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CheckPhotoSignResponseModal) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLPhotoSign f21718e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(LLPhotoSign lLPhotoSign) {
            super(1);
            this.f21718e = lLPhotoSign;
        }

        public final void b(PhotoDto photoDto) {
            try {
                t2 G1 = this.f21718e.G;
                t2 t2Var = null;
                if (G1 == null) {
                    cm.l.v("mBinding");
                    G1 = null;
                }
                G1.f28661v0.c(false);
                String statusCode = photoDto.getStatusCode();
                if (statusCode == null || !statusCode.equals("00")) {
                    this.f21718e.x2(photoDto.getStatusDesc());
                    return;
                }
                LLPhotoSign lLPhotoSign = this.f21718e;
                lLPhotoSign.z2(lLPhotoSign, lLPhotoSign.Y1().b("label_photo_sign_uploaded", this.f21718e.getString(R.string.photo_uploaded)));
                t2 G12 = this.f21718e.G;
                if (G12 == null) {
                    cm.l.v("mBinding");
                    G12 = null;
                }
                G12.W.setVisibility(0);
                t2 G13 = this.f21718e.G;
                if (G13 == null) {
                    cm.l.v("mBinding");
                } else {
                    t2Var = G13;
                }
                t2Var.f28661v0.setVisibility(8);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((PhotoDto) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLPhotoSign f21719e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(LLPhotoSign lLPhotoSign) {
            super(1);
            this.f21719e = lLPhotoSign;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            try {
                t2 G1 = this.f21719e.G;
                if (G1 == null) {
                    cm.l.v("mBinding");
                    G1 = null;
                }
                G1.W.c(false);
                if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                    Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                    this.f21719e.F2(applStatusDetailsItem.getApplFlowStatusList());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21720a;

        i(l lVar) {
            cm.l.f(lVar, "function");
            this.f21720a = lVar;
        }

        public final pl.c a() {
            return this.f21720a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21720a.invoke(obj);
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

    public LLPhotoSign() {
        d.c y02 = y0(new e.d(), new r0(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f21711f0 = y02;
        d.c y03 = y0(new e.d(), new s0(this));
        cm.l.e(y03, "registerForActivityResult(...)");
        this.f21712g0 = y03;
    }

    /* access modifiers changed from: private */
    public static final void A2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void E2(boolean z10) {
        if (z10) {
            try {
                this.f21708c0 = new t0(this, R.string.please_wait_2, true);
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                return;
            }
        }
        t0 t0Var = this.f21708c0;
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
    public final void F2(List list) {
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
                Integer acCd = ((ApplFlowStatusListItem) obj2).getAcCd();
                if (acCd != null && acCd.intValue() == 455) {
                }
            }
            i10++;
        }
        Object obj3 = list.get(i10);
        cm.l.c(obj3);
        num = ((ApplFlowStatusListItem) obj3).getAcCd();
        if (num == null) {
            new DLServiceFinalSubmitedActivity().D1(this);
            return;
        }
        try {
            DlLogUpdate.a aVar = DlLogUpdate.f8706k;
            String str3 = this.L;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str = null;
            } else {
                str = str3;
            }
            String str4 = this.K;
            if (str4 == null) {
                cm.l.v("mApplNo");
                str4 = null;
            }
            long parseLong = Long.parseLong(str4);
            int parseInt = Integer.parseInt(Z1().k());
            String str5 = this.U;
            cm.l.c(str5);
            String str6 = this.P;
            if (str6 == null) {
                cm.l.v("lastEndorseRTOCode");
                str2 = null;
            } else {
                str2 = str6;
            }
            aVar.a(this, str, parseLong, parseInt, str5, "", str2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        u2(num);
    }

    private final void G2() {
        Intent intent = new Intent(this, LLDocUpload.class);
        String str = this.K;
        String str2 = null;
        if (str == null) {
            cm.l.v("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.L;
        if (str3 == null) {
            cm.l.v("mApplDob");
            str3 = null;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str3);
        intent.putExtra("dob", this.U);
        intent.putExtra("Mobile_no", this.V);
        intent.putExtra("lastEndorsedRTO", this.W);
        String str4 = this.P;
        if (str4 == null) {
            cm.l.v("lastEndorseRTOCode");
        } else {
            str2 = str4;
        }
        intent.putExtra("lastEndorsedRTOCode", str2);
        intent.putExtra("aadharPhoto", this.X);
        startActivity(intent);
        finish();
    }

    private final void H2() {
        Intent intent = new Intent(this, LLFeePayment.class);
        String str = this.K;
        String str2 = null;
        if (str == null) {
            cm.l.v("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.L;
        if (str3 == null) {
            cm.l.v("mApplDob");
            str3 = null;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str3);
        intent.putExtra("dob", this.U);
        intent.putExtra("Mobile_no", this.V);
        intent.putExtra("lastEndorsedRTO", this.W);
        String str4 = this.P;
        if (str4 == null) {
            cm.l.v("lastEndorseRTOCode");
        } else {
            str2 = str4;
        }
        intent.putExtra("lastEndorsedRTOCode", str2);
        intent.putExtra("aadharPhoto", this.X);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void I2(LLPhotoSign lLPhotoSign, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(lLPhotoSign, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                t2 t2Var = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(lLPhotoSign.getContentResolver(), data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(lLPhotoSign.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                String str2 = lLPhotoSign.I;
                if (str2 == null) {
                    cm.l.v("imgType");
                    str2 = null;
                }
                if (cm.l.a(str2, "0")) {
                    t2 t2Var2 = lLPhotoSign.G;
                    if (t2Var2 == null) {
                        cm.l.v("mBinding");
                    } else {
                        t2Var = t2Var2;
                    }
                    t2Var.f28660u0.setImageBitmap(bitmap);
                    lLPhotoSign.S = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                } else if (cm.l.a(str2, "1")) {
                    t2 t2Var3 = lLPhotoSign.G;
                    if (t2Var3 == null) {
                        cm.l.v("mBinding");
                    } else {
                        t2Var = t2Var3;
                    }
                    t2Var.V.setImageBitmap(bitmap);
                    lLPhotoSign.T = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                }
            } else if (d10 == 64) {
                lLPhotoSign.E2(false);
                Toast.makeText(lLPhotoSign, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            lLPhotoSign.E2(false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void J2() {
        Intent intent = new Intent(this, LLPhotoSign.class);
        String str = this.K;
        String str2 = null;
        if (str == null) {
            cm.l.v("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.L;
        if (str3 == null) {
            cm.l.v("mApplDob");
            str3 = null;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str3);
        intent.putExtra("dob", this.U);
        intent.putExtra("Mobile_no", this.V);
        intent.putExtra("lastEndorsedRTO", this.W);
        String str4 = this.P;
        if (str4 == null) {
            cm.l.v("lastEndorseRTOCode");
        } else {
            str2 = str4;
        }
        intent.putExtra("lastEndorsedRTOCode", str2);
        intent.putExtra("aadharPhoto", this.X);
        startActivity(intent);
        finish();
    }

    private final void K2() {
        Intent intent = new Intent(this, LLSlots.class);
        String str = this.K;
        String str2 = null;
        if (str == null) {
            cm.l.v("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.L;
        if (str3 == null) {
            cm.l.v("mApplDob");
            str3 = null;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str3);
        intent.putExtra("dob", this.U);
        intent.putExtra("Mobile_no", this.V);
        intent.putExtra("lastEndorsedRTO", this.W);
        String str4 = this.P;
        if (str4 == null) {
            cm.l.v("lastEndorseRTOCode");
        } else {
            str2 = str4;
        }
        intent.putExtra("lastEndorsedRTOCode", str2);
        intent.putExtra("aadharPhoto", this.X);
        startActivity(intent);
        finish();
    }

    private final void U1() {
        if (com.nic.mparivahan.dlservices.utilities.e.e(this)) {
            t2.a.f16505a.b(this).j().f(600).i().h(new b(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void W1(LLPhotoSign lLPhotoSign, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(lLPhotoSign, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                t2 t2Var = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(lLPhotoSign.getContentResolver(), data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(lLPhotoSign.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                String str2 = lLPhotoSign.I;
                if (str2 == null) {
                    cm.l.v("imgType");
                    str2 = null;
                }
                if (cm.l.a(str2, "0")) {
                    t2 t2Var2 = lLPhotoSign.G;
                    if (t2Var2 == null) {
                        cm.l.v("mBinding");
                    } else {
                        t2Var = t2Var2;
                    }
                    t2Var.f28660u0.setImageBitmap(bitmap);
                    lLPhotoSign.S = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                } else if (cm.l.a(str2, "1")) {
                    t2 t2Var3 = lLPhotoSign.G;
                    if (t2Var3 == null) {
                        cm.l.v("mBinding");
                    } else {
                        t2Var = t2Var3;
                    }
                    t2Var.V.setImageBitmap(bitmap);
                    lLPhotoSign.T = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                }
            } else if (d10 == 64) {
                lLPhotoSign.E2(false);
                Toast.makeText(lLPhotoSign, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            lLPhotoSign.E2(false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void a2() {
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

    private final void b2() {
        ld.f fVar = new ld.f(this);
        this.H = (ak.a) new u0(this).a(ak.a.class);
        this.f21709d0 = NewLLServices.f22242a.a(this);
        NewLLServices newLLServices = this.f21709d0;
        ak.a aVar = null;
        if (newLLServices == null) {
            cm.l.v("service");
            newLLServices = null;
        }
        this.f21710e0 = (xj.b) new u0((x0) this, (u0.b) new yj.a(new xj.a(newLLServices))).a(xj.b.class);
        t2 t2Var = this.G;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.v(this);
        if (getIntent() != null) {
            try {
                Bundle extras = getIntent().getExtras();
                this.K = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
                Bundle extras2 = getIntent().getExtras();
                this.L = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
                this.U = String.valueOf(getIntent().getStringExtra("dob"));
                this.V = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                cm.l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.W = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("aadharPhoto");
                cm.l.c(stringExtra2);
                this.X = stringExtra2;
                t2 t2Var2 = this.G;
                if (t2Var2 == null) {
                    cm.l.v("mBinding");
                    t2Var2 = null;
                }
                t2Var2.I.f25961g.setText(fVar.i());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        String format = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        cm.l.e(format, "format(...)");
        B2(format);
        t2 t2Var3 = this.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.C.setText(V1());
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            ak.a aVar2 = this.H;
            if (aVar2 == null) {
                cm.l.v("viewModel");
                aVar2 = null;
            }
            String str = this.K;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            String str2 = this.L;
            if (str2 == null) {
                cm.l.v("mApplDob");
                str2 = null;
            }
            aVar2.g(str, str2);
        } else {
            Toast.makeText(getApplicationContext(), Y1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
        ak.a aVar3 = this.H;
        if (aVar3 == null) {
            cm.l.v("viewModel");
        } else {
            aVar = aVar3;
        }
        aVar.k().g(this, new i(new e(this)));
    }

    private final void c2() {
        xj.b bVar = this.f21710e0;
        ak.a aVar = null;
        if (bVar == null) {
            cm.l.v("learnerLicenceVM");
            bVar = null;
        }
        bVar.k().g(this, new i(new f(this)));
        ak.a aVar2 = this.H;
        if (aVar2 == null) {
            cm.l.v("viewModel");
            aVar2 = null;
        }
        aVar2.m().g(this, new i(new g(this)));
        ak.a aVar3 = this.H;
        if (aVar3 == null) {
            cm.l.v("viewModel");
        } else {
            aVar = aVar3;
        }
        aVar.l().g(this, new i(new h(this)));
    }

    private final void d2() {
        t2 t2Var = null;
        if (!cm.l.a(this.X, "")) {
            t2 t2Var2 = this.G;
            if (t2Var2 == null) {
                cm.l.v("mBinding");
                t2Var2 = null;
            }
            t2Var2.O.setClickable(false);
            t2 t2Var3 = this.G;
            if (t2Var3 == null) {
                cm.l.v("mBinding");
                t2Var3 = null;
            }
            t2Var3.P.setClickable(false);
            t2 t2Var4 = this.G;
            if (t2Var4 == null) {
                cm.l.v("mBinding");
                t2Var4 = null;
            }
            t2Var4.O.setEnabled(false);
            t2 t2Var5 = this.G;
            if (t2Var5 == null) {
                cm.l.v("mBinding");
                t2Var5 = null;
            }
            t2Var5.P.setEnabled(false);
            t2 t2Var6 = this.G;
            if (t2Var6 == null) {
                cm.l.v("mBinding");
                t2Var6 = null;
            }
            t2Var6.P.setBackgroundResource(R.drawable.unselected_button_grey);
            t2 t2Var7 = this.G;
            if (t2Var7 == null) {
                cm.l.v("mBinding");
                t2Var7 = null;
            }
            t2Var7.O.setBackgroundResource(R.drawable.unselected_button_grey);
            this.S = this.X;
            t2 t2Var8 = this.G;
            if (t2Var8 == null) {
                cm.l.v("mBinding");
                t2Var8 = null;
            }
            t2Var8.f28660u0.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(this.X));
        } else {
            t2 t2Var9 = this.G;
            if (t2Var9 == null) {
                cm.l.v("mBinding");
                t2Var9 = null;
            }
            t2Var9.O.setClickable(true);
            t2 t2Var10 = this.G;
            if (t2Var10 == null) {
                cm.l.v("mBinding");
                t2Var10 = null;
            }
            t2Var10.P.setClickable(true);
            t2 t2Var11 = this.G;
            if (t2Var11 == null) {
                cm.l.v("mBinding");
                t2Var11 = null;
            }
            t2Var11.O.setEnabled(true);
            t2 t2Var12 = this.G;
            if (t2Var12 == null) {
                cm.l.v("mBinding");
                t2Var12 = null;
            }
            t2Var12.P.setEnabled(true);
            this.S = "";
            t2 t2Var13 = this.G;
            if (t2Var13 == null) {
                cm.l.v("mBinding");
                t2Var13 = null;
            }
            t2Var13.P.setBackgroundResource(R.drawable.blue_drawable);
            t2 t2Var14 = this.G;
            if (t2Var14 == null) {
                cm.l.v("mBinding");
                t2Var14 = null;
            }
            t2Var14.O.setBackgroundResource(R.drawable.blue_drawable);
        }
        t2 t2Var15 = this.G;
        if (t2Var15 == null) {
            cm.l.v("mBinding");
            t2Var15 = null;
        }
        t2Var15.O.setOnClickListener(new bj.t0(this));
        t2 t2Var16 = this.G;
        if (t2Var16 == null) {
            cm.l.v("mBinding");
            t2Var16 = null;
        }
        t2Var16.P.setOnClickListener(new b1(this));
        t2 t2Var17 = this.G;
        if (t2Var17 == null) {
            cm.l.v("mBinding");
            t2Var17 = null;
        }
        t2Var17.T.setOnClickListener(new c1(this));
        t2 t2Var18 = this.G;
        if (t2Var18 == null) {
            cm.l.v("mBinding");
            t2Var18 = null;
        }
        t2Var18.U.setOnClickListener(new j0(this));
        t2 t2Var19 = this.G;
        if (t2Var19 == null) {
            cm.l.v("mBinding");
            t2Var19 = null;
        }
        t2Var19.f28661v0.setOnClickListener(new k0(this));
        t2 t2Var20 = this.G;
        if (t2Var20 == null) {
            cm.l.v("mBinding");
            t2Var20 = null;
        }
        t2Var20.I.f25959e.setOnClickListener(new l0(this));
        t2 t2Var21 = this.G;
        if (t2Var21 == null) {
            cm.l.v("mBinding");
            t2Var21 = null;
        }
        t2Var21.I.f25957c.setOnClickListener(new m0(this));
        t2 t2Var22 = this.G;
        if (t2Var22 == null) {
            cm.l.v("mBinding");
            t2Var22 = null;
        }
        t2Var22.W.setOnClickListener(new n0(this));
        t2 t2Var23 = this.G;
        if (t2Var23 == null) {
            cm.l.v("mBinding");
            t2Var23 = null;
        }
        t2Var23.f28662w.setOnClickListener(new o0(this));
        t2 t2Var24 = this.G;
        if (t2Var24 == null) {
            cm.l.v("mBinding");
            t2Var24 = null;
        }
        t2Var24.f28663x.setOnClickListener(new p0(this));
        t2 t2Var25 = this.G;
        if (t2Var25 == null) {
            cm.l.v("mBinding");
            t2Var25 = null;
        }
        t2Var25.f28664y.setOnClickListener(new v0(this));
        t2 t2Var26 = this.G;
        if (t2Var26 == null) {
            cm.l.v("mBinding");
            t2Var26 = null;
        }
        t2Var26.f28665z.setOnClickListener(new w0(this));
        t2 t2Var27 = this.G;
        if (t2Var27 == null) {
            cm.l.v("mBinding");
            t2Var27 = null;
        }
        t2Var27.B.setOnClickListener(new bj.x0(this));
        t2 t2Var28 = this.G;
        if (t2Var28 == null) {
            cm.l.v("mBinding");
            t2Var28 = null;
        }
        t2Var28.A.setOnClickListener(new y0(this));
        t2 t2Var29 = this.G;
        if (t2Var29 == null) {
            cm.l.v("mBinding");
            t2Var29 = null;
        }
        t2Var29.X.setOnClickListener(new z0(this));
        t2 t2Var30 = this.G;
        if (t2Var30 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var = t2Var30;
        }
        t2Var.Y.setOnClickListener(new a1(this));
    }

    /* access modifiers changed from: private */
    public static final void e2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        lLPhotoSign.I = "0";
        lLPhotoSign.a2();
    }

    /* access modifiers changed from: private */
    public static final void f2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        t2 t2Var = lLPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.f28663x.setVisibility(8);
        t2 t2Var3 = lLPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.f28662w.setVisibility(0);
        t2 t2Var4 = lLPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.J.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void g2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        t2 t2Var = lLPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.f28664y.setVisibility(8);
        t2 t2Var3 = lLPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.f28665z.setVisibility(0);
        t2 t2Var4 = lLPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.K.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void h2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        t2 t2Var = lLPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.f28665z.setVisibility(8);
        t2 t2Var3 = lLPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.f28664y.setVisibility(0);
        t2 t2Var4 = lLPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.K.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void i2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        t2 t2Var = lLPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.B.setVisibility(8);
        t2 t2Var3 = lLPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.A.setVisibility(0);
        t2 t2Var4 = lLPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.L.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void j2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        t2 t2Var = lLPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.A.setVisibility(8);
        t2 t2Var3 = lLPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.B.setVisibility(0);
        t2 t2Var4 = lLPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.L.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void k2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        t2 t2Var = lLPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.X.setVisibility(8);
        t2 t2Var3 = lLPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.Y.setVisibility(0);
        t2 t2Var4 = lLPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.M.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void l2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        t2 t2Var = lLPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.Y.setVisibility(8);
        t2 t2Var3 = lLPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.X.setVisibility(0);
        t2 t2Var4 = lLPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.M.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void m2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        lLPhotoSign.I = "0";
        lLPhotoSign.U1();
    }

    /* access modifiers changed from: private */
    public static final void n2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        lLPhotoSign.I = "1";
        lLPhotoSign.a2();
    }

    /* access modifiers changed from: private */
    public static final void o2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        lLPhotoSign.I = "1";
        lLPhotoSign.U1();
    }

    /* access modifiers changed from: private */
    public static final void p2(LLPhotoSign lLPhotoSign, View view) {
        ak.a aVar;
        String str;
        String str2;
        String str3;
        cm.l.f(lLPhotoSign, "this$0");
        if (!com.nic.mparivahan.a.f9624a.a(lLPhotoSign)) {
            Toast.makeText(lLPhotoSign.getApplicationContext(), lLPhotoSign.Y1().b("label_log_check_internet", lLPhotoSign.getString(R.string.kindly_check_your_internet_connection)), 0).show();
        } else if (lLPhotoSign.J == -1 || lLPhotoSign.S.length() <= 0 || lLPhotoSign.T.length() <= 0) {
            lLPhotoSign.x2(lLPhotoSign.Y1().b("photo_signature", ""));
        } else {
            t2 t2Var = lLPhotoSign.G;
            if (t2Var == null) {
                cm.l.v("mBinding");
                t2Var = null;
            }
            t2Var.f28661v0.c(true);
            ak.a aVar2 = lLPhotoSign.H;
            if (aVar2 == null) {
                cm.l.v("viewModel");
                aVar = null;
            } else {
                aVar = aVar2;
            }
            String str4 = lLPhotoSign.K;
            if (str4 == null) {
                cm.l.v("mApplNo");
                str = null;
            } else {
                str = str4;
            }
            String str5 = lLPhotoSign.L;
            if (str5 == null) {
                cm.l.v("mApplDob");
                str2 = null;
            } else {
                str2 = str5;
            }
            String str6 = lLPhotoSign.Q;
            if (str6 == null) {
                cm.l.v("stateCode");
                str3 = null;
            } else {
                str3 = str6;
            }
            aVar.n(str, str2, str3, lLPhotoSign.S, lLPhotoSign.T, lLPhotoSign.J);
        }
    }

    /* access modifiers changed from: private */
    public static final void q2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        lLPhotoSign.finish();
    }

    /* access modifiers changed from: private */
    public static final void r2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        Intent intent = new Intent(lLPhotoSign, DashBoard.class);
        intent.setFlags(67108864);
        lLPhotoSign.startActivity(intent);
        lLPhotoSign.finish();
    }

    /* access modifiers changed from: private */
    public static final void s2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        t2 t2Var = lLPhotoSign.G;
        String str = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.W.c(true);
        ak.a aVar = lLPhotoSign.H;
        if (aVar == null) {
            cm.l.v("viewModel");
            aVar = null;
        }
        String str2 = lLPhotoSign.K;
        if (str2 == null) {
            cm.l.v("mApplNo");
            str2 = null;
        }
        String str3 = lLPhotoSign.L;
        if (str3 == null) {
            cm.l.v("mApplDob");
        } else {
            str = str3;
        }
        aVar.h(str2, str);
    }

    /* access modifiers changed from: private */
    public static final void t2(LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(lLPhotoSign, "this$0");
        t2 t2Var = lLPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.f28662w.setVisibility(8);
        t2 t2Var3 = lLPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.f28663x.setVisibility(0);
        t2 t2Var4 = lLPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.J.setVisibility(0);
    }

    private final void v2(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new bj.u0(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void w2(Dialog dialog, LLPhotoSign lLPhotoSign, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(lLPhotoSign, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(lLPhotoSign, DashBoard.class);
        intent.setFlags(67108864);
        lLPhotoSign.startActivity(intent);
        lLPhotoSign.finish();
    }

    /* access modifiers changed from: private */
    public final void x2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(Y1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(Y1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(Y1().b("btn_ok", "OK"));
        textView.setOnClickListener(new i0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void y2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final void B2(String str) {
        cm.l.f(str, "<set-?>");
        this.Z = str;
    }

    public final void C2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f21707b0 = cVar;
    }

    public final void D2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f21706a0 = gVar;
    }

    public final String V1() {
        String str = this.Z;
        if (str != null) {
            return str;
        }
        cm.l.v("app_date");
        return null;
    }

    public final d.c X1() {
        return this.f21712g0;
    }

    public final ld.c Y1() {
        ld.c cVar = this.f21707b0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ld.g Z1() {
        ld.g gVar = this.f21706a0;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mSessionmanger");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_dl_photo_sign);
        t2 x10 = t2.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.G = x10;
        if (x10 == null) {
            cm.l.v("mBinding");
            x10 = null;
        }
        setContentView(x10.m());
        D2(new ld.g(this));
        C2(new ld.c(this));
        b2();
        c2();
        d2();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        String b10;
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 222) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                b10 = Y1().b("go_settings", "");
            } else {
                return;
            }
        } else if (i10 == 1001) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                b10 = Y1().b("per_denied", getString(R.string.permission));
            } else {
                return;
            }
        } else {
            return;
        }
        Toast.makeText(this, b10, 0).show();
    }

    public final void u2(Integer num) {
        if (num != null && num.intValue() == 135) {
            J2();
        } else if (num != null && num.intValue() == 134) {
            H2();
        } else if (num != null && num.intValue() == 123) {
            G2();
        } else if (num != null && num.intValue() == 371) {
            K2();
        } else if (num != null && num.intValue() == 455) {
            v2(Y1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void z2(Context context, String str) {
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
        textView.setText(Y1().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new q0(dialog));
        dialog.show();
    }
}
