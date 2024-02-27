package com.nic.mparivahan.NewDlScreen.DlAcknow;

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
import bm.l;
import cb.t0;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdate;
import com.nic.mparivahan.R;
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
import gc.a0;
import gc.c0;
import gc.d0;
import gc.e0;
import gc.f0;
import gc.g0;
import gc.h0;
import gc.i0;
import gc.j0;
import gc.k0;
import gc.l0;
import gc.m0;
import gc.n0;
import gc.o0;
import gc.u;
import gc.v;
import gc.w;
import gc.y;
import gc.z;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import ni.t2;
import pl.x;

public final class DlPhotoSign extends androidx.appcompat.app.d {

    /* renamed from: g0  reason: collision with root package name */
    public static final a f9308g0 = new a((cm.g) null);
    /* access modifiers changed from: private */
    public t2 G;
    /* access modifiers changed from: private */
    public ak.a H;
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
    public String S;
    private String T = "";
    private String U = "";
    private String V = "";
    private String W = "";
    private String X = "";
    private String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    public String f9309a0;

    /* renamed from: b0  reason: collision with root package name */
    public ld.g f9310b0;

    /* renamed from: c0  reason: collision with root package name */
    public ld.c f9311c0;

    /* renamed from: d0  reason: collision with root package name */
    private t0 f9312d0;
    /* access modifiers changed from: private */

    /* renamed from: e0  reason: collision with root package name */
    public final d.c f9313e0;

    /* renamed from: f0  reason: collision with root package name */
    private d.c f9314f0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlPhotoSign f9315e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DlPhotoSign dlPhotoSign) {
            super(1);
            this.f9315e = dlPhotoSign;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f9315e.Y1().a(intent);
            this.f9315e.F2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlPhotoSign f9316e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DlPhotoSign dlPhotoSign) {
            super(1);
            this.f9316e = dlPhotoSign;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f9316e.f9313e0.a(intent);
            this.f9316e.F2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlPhotoSign f9317e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DlPhotoSign dlPhotoSign) {
            super(1);
            this.f9317e = dlPhotoSign;
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
                            DlPhotoSign dlPhotoSign = this.f9317e;
                            ResponseBody responseBody = dlApplStatusResponse.getResponseBody();
                            String str2 = null;
                            dlPhotoSign.M = String.valueOf(responseBody != null ? responseBody.getApdFullName() : null);
                            DlPhotoSign dlPhotoSign2 = this.f9317e;
                            ResponseBody responseBody2 = dlApplStatusResponse.getResponseBody();
                            dlPhotoSign2.N = String.valueOf(responseBody2 != null ? responseBody2.getApdSwdFullName() : null);
                            DlPhotoSign dlPhotoSign3 = this.f9317e;
                            ResponseBody responseBody3 = dlApplStatusResponse.getResponseBody();
                            if (dlPhotoSign3.V1(String.valueOf(responseBody3 != null ? responseBody3.getApdAppldt() : null)).length() > 0) {
                                DlPhotoSign dlPhotoSign4 = this.f9317e;
                                ResponseBody responseBody4 = dlApplStatusResponse.getResponseBody();
                                str = dlPhotoSign4.V1(String.valueOf(responseBody4 != null ? responseBody4.getApdAppldt() : null));
                            } else {
                                ResponseBody responseBody5 = dlApplStatusResponse.getResponseBody();
                                str = String.valueOf(responseBody5 != null ? responseBody5.getApdAppldt() : null);
                            }
                            dlPhotoSign3.R = str;
                            DlPhotoSign dlPhotoSign5 = this.f9317e;
                            ResponseBody responseBody6 = dlApplStatusResponse.getResponseBody();
                            dlPhotoSign5.S = String.valueOf((responseBody6 == null || (transReq = responseBody6.getTransReq()) == null || (transReqItem = transReq.get(0)) == null) ? null : transReqItem.getTrTrCd());
                            ResponseBody responseBody7 = dlApplStatusResponse.getResponseBody();
                            OlaMast olaMast = responseBody7 != null ? responseBody7.getOlaMast() : null;
                            DlPhotoSign dlPhotoSign6 = this.f9317e;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd1() : null);
                            sb2.append(' ');
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd2() : null);
                            sb2.append(' ');
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd3() : null);
                            dlPhotoSign6.O = sb2.toString();
                            this.f9317e.P = String.valueOf(olaMast != null ? olaMast.getOmOfficecd() : null);
                            this.f9317e.Q = String.valueOf(olaMast != null ? olaMast.getOmStCode() : null);
                            t2 G1 = this.f9317e.G;
                            if (G1 == null) {
                                cm.l.v("mBinding");
                                G1 = null;
                            }
                            TextView textView = G1.D;
                            String E1 = this.f9317e.K;
                            if (E1 == null) {
                                cm.l.v("mApplNo");
                                E1 = null;
                            }
                            textView.setText(E1);
                            t2 G12 = this.f9317e.G;
                            if (G12 == null) {
                                cm.l.v("mBinding");
                                G12 = null;
                            }
                            TextView textView2 = G12.F;
                            String B1 = this.f9317e.L;
                            if (B1 == null) {
                                cm.l.v("mApplDob");
                                B1 = null;
                            }
                            textView2.setText(B1);
                            t2 G13 = this.f9317e.G;
                            if (G13 == null) {
                                cm.l.v("mBinding");
                                G13 = null;
                            }
                            TextView textView3 = G13.E;
                            String D1 = this.f9317e.M;
                            if (D1 == null) {
                                cm.l.v("mApplName");
                                D1 = null;
                            }
                            textView3.setText(D1);
                            t2 G14 = this.f9317e.G;
                            if (G14 == null) {
                                cm.l.v("mBinding");
                                G14 = null;
                            }
                            TextView textView4 = G14.H;
                            String C1 = this.f9317e.N;
                            if (C1 == null) {
                                cm.l.v("mApplFather");
                                C1 = null;
                            }
                            textView4.setText(C1);
                            t2 G15 = this.f9317e.G;
                            if (G15 == null) {
                                cm.l.v("mBinding");
                                G15 = null;
                            }
                            TextView textView5 = G15.S;
                            String F1 = this.f9317e.O;
                            if (F1 == null) {
                                cm.l.v("mApplRtoName");
                                F1 = null;
                            }
                            textView5.setText(F1);
                            this.f9317e.J = 0;
                            if (com.nic.mparivahan.a.f9624a.a(this.f9317e)) {
                                ak.a I1 = this.f9317e.H;
                                if (I1 == null) {
                                    cm.l.v("viewModel");
                                    I1 = null;
                                }
                                String E12 = this.f9317e.K;
                                if (E12 == null) {
                                    cm.l.v("mApplNo");
                                    E12 = null;
                                }
                                String B12 = this.f9317e.L;
                                if (B12 == null) {
                                    cm.l.v("mApplDob");
                                    B12 = null;
                                }
                                String A1 = this.f9317e.P;
                                if (A1 == null) {
                                    cm.l.v("lastEndorseRTOCode");
                                } else {
                                    str2 = A1;
                                }
                                I1.i(E12, B12, str2);
                                return;
                            }
                            Toast.makeText(this.f9317e.getApplicationContext(), this.f9317e.Z1().b("label_log_check_internet", this.f9317e.getString(R.string.kindly_check_your_internet_connection)), 0).show();
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

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlPhotoSign f9318e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DlPhotoSign dlPhotoSign) {
            super(1);
            this.f9318e = dlPhotoSign;
        }

        public final void b(DlPhotoStatusDycryResponse dlPhotoStatusDycryResponse) {
            try {
                ResponseMsg responseMsg = dlPhotoStatusDycryResponse.getResponseMsg();
                if (responseMsg != null) {
                    Integer statusCode = responseMsg.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200) {
                            PhotoDto photoDto = dlPhotoStatusDycryResponse.getPhotoDto();
                            t2 t2Var = null;
                            Bitmap c10 = com.nic.mparivahan.dlservices.utilities.e.c(String.valueOf(photoDto != null ? photoDto.getPhoto() : null));
                            t2 G1 = this.f9318e.G;
                            if (G1 == null) {
                                cm.l.v("mBinding");
                                G1 = null;
                            }
                            G1.f28660u0.setImageBitmap(c10);
                            PhotoDto photoDto2 = dlPhotoStatusDycryResponse.getPhotoDto();
                            Bitmap c11 = com.nic.mparivahan.dlservices.utilities.e.c(String.valueOf(photoDto2 != null ? photoDto2.getSignature() : null));
                            t2 G12 = this.f9318e.G;
                            if (G12 == null) {
                                cm.l.v("mBinding");
                            } else {
                                t2Var = G12;
                            }
                            t2Var.V.setImageBitmap(c11);
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlPhotoStatusDycryResponse) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlPhotoSign f9319e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(DlPhotoSign dlPhotoSign) {
            super(1);
            this.f9319e = dlPhotoSign;
        }

        public final void b(com.nic.mparivahan.dlservices.data.model.temp.PhotoDto photoDto) {
            try {
                t2 G1 = this.f9319e.G;
                t2 t2Var = null;
                if (G1 == null) {
                    cm.l.v("mBinding");
                    G1 = null;
                }
                G1.f28661v0.c(false);
                String statusCode = photoDto.getStatusCode();
                if (statusCode == null || !statusCode.equals("00")) {
                    this.f9319e.y2(photoDto.getStatusDesc());
                    return;
                }
                DlPhotoSign dlPhotoSign = this.f9319e;
                dlPhotoSign.A2(dlPhotoSign, dlPhotoSign.Z1().b("label_photo_sign_uploaded", this.f9319e.getString(R.string.photo_uploaded)));
                t2 G12 = this.f9319e.G;
                if (G12 == null) {
                    cm.l.v("mBinding");
                    G12 = null;
                }
                G12.W.setVisibility(0);
                t2 G13 = this.f9319e.G;
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
            b((com.nic.mparivahan.dlservices.data.model.temp.PhotoDto) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlPhotoSign f9320e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(DlPhotoSign dlPhotoSign) {
            super(1);
            this.f9320e = dlPhotoSign;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            try {
                t2 G1 = this.f9320e.G;
                if (G1 == null) {
                    cm.l.v("mBinding");
                    G1 = null;
                }
                G1.W.c(false);
                if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                    Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                    this.f9320e.G2(applStatusDetailsItem.getApplFlowStatusList());
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

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9321a;

        h(l lVar) {
            cm.l.f(lVar, "function");
            this.f9321a = lVar;
        }

        public final pl.c a() {
            return this.f9321a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9321a.invoke(obj);
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

    public DlPhotoSign() {
        d.c y02 = y0(new e.d(), new gc.b0(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f9313e0 = y02;
        d.c y03 = y0(new e.d(), new c0(this));
        cm.l.e(y03, "registerForActivityResult(...)");
        this.f9314f0 = y03;
    }

    /* access modifiers changed from: private */
    public static final void B2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void F2(boolean z10) {
        if (z10) {
            try {
                this.f9312d0 = new t0(this, R.string.please_wait_2, true);
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                return;
            }
        }
        t0 t0Var = this.f9312d0;
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
    public final void G2(List list) {
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
            int parseInt = Integer.parseInt(a2().k());
            String str5 = this.W;
            cm.l.c(str5);
            String str6 = this.V;
            cm.l.c(str6);
            String str7 = this.P;
            if (str7 == null) {
                cm.l.v("lastEndorseRTOCode");
                str2 = null;
            } else {
                str2 = str7;
            }
            aVar.a(this, str, parseLong, parseInt, str5, str6, str2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        v2(num);
    }

    private final void H2() {
        Intent intent = new Intent(this, DlDocUpload.class);
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
        intent.putExtra("DL", this.V);
        intent.putExtra("dob", this.W);
        intent.putExtra("Mobile_no", this.X);
        intent.putExtra("lastEndorsedRTO", this.Y);
        String str4 = this.P;
        if (str4 == null) {
            cm.l.v("lastEndorseRTOCode");
        } else {
            str2 = str4;
        }
        intent.putExtra("lastEndorsedRTOCode", str2);
        startActivity(intent);
        finish();
    }

    private final void I2() {
        Intent intent = new Intent(this, DlFeePayment.class);
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
        intent.putExtra("DL", this.V);
        intent.putExtra("dob", this.W);
        intent.putExtra("Mobile_no", this.X);
        intent.putExtra("lastEndorsedRTO", this.Y);
        String str4 = this.P;
        if (str4 == null) {
            cm.l.v("lastEndorseRTOCode");
        } else {
            str2 = str4;
        }
        intent.putExtra("lastEndorsedRTOCode", str2);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void J2(DlPhotoSign dlPhotoSign, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(dlPhotoSign, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                t2 t2Var = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(dlPhotoSign.getContentResolver(), data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(dlPhotoSign.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                String str2 = dlPhotoSign.I;
                if (str2 == null) {
                    cm.l.v("imgType");
                    str2 = null;
                }
                if (cm.l.a(str2, "0")) {
                    t2 t2Var2 = dlPhotoSign.G;
                    if (t2Var2 == null) {
                        cm.l.v("mBinding");
                    } else {
                        t2Var = t2Var2;
                    }
                    t2Var.f28660u0.setImageBitmap(bitmap);
                    dlPhotoSign.T = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                } else if (cm.l.a(str2, "1")) {
                    t2 t2Var3 = dlPhotoSign.G;
                    if (t2Var3 == null) {
                        cm.l.v("mBinding");
                    } else {
                        t2Var = t2Var3;
                    }
                    t2Var.V.setImageBitmap(bitmap);
                    dlPhotoSign.U = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                }
            } else if (d10 == 64) {
                dlPhotoSign.F2(false);
                Toast.makeText(dlPhotoSign, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            dlPhotoSign.F2(false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void K2() {
        Intent intent = new Intent(this, DlPhotoSign.class);
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
        intent.putExtra("DL", this.V);
        intent.putExtra("dob", this.W);
        intent.putExtra("Mobile_no", this.X);
        intent.putExtra("lastEndorsedRTO", this.Y);
        String str4 = this.P;
        if (str4 == null) {
            cm.l.v("lastEndorseRTOCode");
        } else {
            str2 = str4;
        }
        intent.putExtra("lastEndorsedRTOCode", str2);
        startActivity(intent);
        finish();
    }

    private final void L2() {
        Intent intent = new Intent(this, DlSlots.class);
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
        intent.putExtra("DL", this.V);
        intent.putExtra("dob", this.W);
        intent.putExtra("Mobile_no", this.X);
        intent.putExtra("lastEndorsedRTO", this.Y);
        String str4 = this.P;
        if (str4 == null) {
            cm.l.v("lastEndorseRTOCode");
        } else {
            str2 = str4;
        }
        intent.putExtra("lastEndorsedRTOCode", str2);
        startActivity(intent);
        finish();
    }

    private final void U1() {
        if (com.nic.mparivahan.dlservices.utilities.e.e(this)) {
            t2.a.f16505a.b(this).j().f(600).i().h(new b(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void X1(DlPhotoSign dlPhotoSign, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(dlPhotoSign, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                t2 t2Var = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(dlPhotoSign.getContentResolver(), data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(dlPhotoSign.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                String str2 = dlPhotoSign.I;
                if (str2 == null) {
                    cm.l.v("imgType");
                    str2 = null;
                }
                if (cm.l.a(str2, "0")) {
                    t2 t2Var2 = dlPhotoSign.G;
                    if (t2Var2 == null) {
                        cm.l.v("mBinding");
                    } else {
                        t2Var = t2Var2;
                    }
                    t2Var.f28660u0.setImageBitmap(bitmap);
                    dlPhotoSign.T = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                } else if (cm.l.a(str2, "1")) {
                    t2 t2Var3 = dlPhotoSign.G;
                    if (t2Var3 == null) {
                        cm.l.v("mBinding");
                    } else {
                        t2Var = t2Var3;
                    }
                    t2Var.V.setImageBitmap(bitmap);
                    dlPhotoSign.U = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                }
            } else if (d10 == 64) {
                dlPhotoSign.F2(false);
                Toast.makeText(dlPhotoSign, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            dlPhotoSign.F2(false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void b2() {
        if (com.nic.mparivahan.dlservices.utilities.e.d(this)) {
            t2.a.f16505a.b(this).e().f(600).i().h(new c(this));
        }
    }

    private final void c2() {
        ld.f fVar = new ld.f(this);
        this.H = (ak.a) new u0(this).a(ak.a.class);
        t2 t2Var = this.G;
        ak.a aVar = null;
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
                this.V = String.valueOf(getIntent().getStringExtra("DL"));
                this.W = String.valueOf(getIntent().getStringExtra("dob"));
                this.X = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                cm.l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.Y = stringExtra;
                t2 t2Var2 = this.G;
                if (t2Var2 == null) {
                    cm.l.v("mBinding");
                    t2Var2 = null;
                }
                t2Var2.I.f25961g.setText(fVar.i());
                t2 t2Var3 = this.G;
                if (t2Var3 == null) {
                    cm.l.v("mBinding");
                    t2Var3 = null;
                }
                t2Var3.G.setText("CL No. : " + this.V);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        String format = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        cm.l.e(format, "format(...)");
        C2(format);
        t2 t2Var4 = this.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
            t2Var4 = null;
        }
        t2Var4.C.setText(W1());
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
            Toast.makeText(getApplicationContext(), Z1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
        ak.a aVar3 = this.H;
        if (aVar3 == null) {
            cm.l.v("viewModel");
        } else {
            aVar = aVar3;
        }
        aVar.k().g(this, new h(new d(this)));
    }

    private final void d2() {
        ak.a aVar = this.H;
        ak.a aVar2 = null;
        if (aVar == null) {
            cm.l.v("viewModel");
            aVar = null;
        }
        aVar.j().g(this, new h(new e(this)));
        ak.a aVar3 = this.H;
        if (aVar3 == null) {
            cm.l.v("viewModel");
            aVar3 = null;
        }
        aVar3.m().g(this, new h(new f(this)));
        ak.a aVar4 = this.H;
        if (aVar4 == null) {
            cm.l.v("viewModel");
        } else {
            aVar2 = aVar4;
        }
        aVar2.l().g(this, new h(new g(this)));
    }

    private final void e2() {
        t2 t2Var = this.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.O.setOnClickListener(new u(this));
        t2 t2Var3 = this.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.P.setOnClickListener(new m0(this));
        t2 t2Var4 = this.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
            t2Var4 = null;
        }
        t2Var4.T.setOnClickListener(new n0(this));
        t2 t2Var5 = this.G;
        if (t2Var5 == null) {
            cm.l.v("mBinding");
            t2Var5 = null;
        }
        t2Var5.U.setOnClickListener(new o0(this));
        t2 t2Var6 = this.G;
        if (t2Var6 == null) {
            cm.l.v("mBinding");
            t2Var6 = null;
        }
        t2Var6.f28661v0.setOnClickListener(new v(this));
        t2 t2Var7 = this.G;
        if (t2Var7 == null) {
            cm.l.v("mBinding");
            t2Var7 = null;
        }
        t2Var7.I.f25959e.setOnClickListener(new w(this));
        t2 t2Var8 = this.G;
        if (t2Var8 == null) {
            cm.l.v("mBinding");
            t2Var8 = null;
        }
        t2Var8.I.f25957c.setOnClickListener(new gc.x(this));
        t2 t2Var9 = this.G;
        if (t2Var9 == null) {
            cm.l.v("mBinding");
            t2Var9 = null;
        }
        t2Var9.W.setOnClickListener(new y(this));
        t2 t2Var10 = this.G;
        if (t2Var10 == null) {
            cm.l.v("mBinding");
            t2Var10 = null;
        }
        t2Var10.f28662w.setOnClickListener(new z(this));
        t2 t2Var11 = this.G;
        if (t2Var11 == null) {
            cm.l.v("mBinding");
            t2Var11 = null;
        }
        t2Var11.f28663x.setOnClickListener(new a0(this));
        t2 t2Var12 = this.G;
        if (t2Var12 == null) {
            cm.l.v("mBinding");
            t2Var12 = null;
        }
        t2Var12.f28664y.setOnClickListener(new f0(this));
        t2 t2Var13 = this.G;
        if (t2Var13 == null) {
            cm.l.v("mBinding");
            t2Var13 = null;
        }
        t2Var13.f28665z.setOnClickListener(new h0(this));
        t2 t2Var14 = this.G;
        if (t2Var14 == null) {
            cm.l.v("mBinding");
            t2Var14 = null;
        }
        t2Var14.B.setOnClickListener(new i0(this));
        t2 t2Var15 = this.G;
        if (t2Var15 == null) {
            cm.l.v("mBinding");
            t2Var15 = null;
        }
        t2Var15.A.setOnClickListener(new j0(this));
        t2 t2Var16 = this.G;
        if (t2Var16 == null) {
            cm.l.v("mBinding");
            t2Var16 = null;
        }
        t2Var16.X.setOnClickListener(new k0(this));
        t2 t2Var17 = this.G;
        if (t2Var17 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var17;
        }
        t2Var2.Y.setOnClickListener(new l0(this));
    }

    /* access modifiers changed from: private */
    public static final void f2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        dlPhotoSign.I = "0";
        dlPhotoSign.b2();
    }

    /* access modifiers changed from: private */
    public static final void g2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        t2 t2Var = dlPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.f28663x.setVisibility(8);
        t2 t2Var3 = dlPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.f28662w.setVisibility(0);
        t2 t2Var4 = dlPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.J.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void h2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        t2 t2Var = dlPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.f28664y.setVisibility(8);
        t2 t2Var3 = dlPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.f28665z.setVisibility(0);
        t2 t2Var4 = dlPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.K.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void i2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        t2 t2Var = dlPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.f28665z.setVisibility(8);
        t2 t2Var3 = dlPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.f28664y.setVisibility(0);
        t2 t2Var4 = dlPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.K.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void j2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        t2 t2Var = dlPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.B.setVisibility(8);
        t2 t2Var3 = dlPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.A.setVisibility(0);
        t2 t2Var4 = dlPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.L.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void k2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        t2 t2Var = dlPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.A.setVisibility(8);
        t2 t2Var3 = dlPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.B.setVisibility(0);
        t2 t2Var4 = dlPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.L.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void l2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        t2 t2Var = dlPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.X.setVisibility(8);
        t2 t2Var3 = dlPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.Y.setVisibility(0);
        t2 t2Var4 = dlPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.M.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void m2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        t2 t2Var = dlPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.Y.setVisibility(8);
        t2 t2Var3 = dlPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.X.setVisibility(0);
        t2 t2Var4 = dlPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.M.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void n2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        dlPhotoSign.I = "0";
        dlPhotoSign.U1();
    }

    /* access modifiers changed from: private */
    public static final void o2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        dlPhotoSign.I = "1";
        dlPhotoSign.b2();
    }

    /* access modifiers changed from: private */
    public static final void p2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        dlPhotoSign.I = "1";
        dlPhotoSign.U1();
    }

    /* access modifiers changed from: private */
    public static final void q2(DlPhotoSign dlPhotoSign, View view) {
        ak.a aVar;
        String str;
        String str2;
        String str3;
        cm.l.f(dlPhotoSign, "this$0");
        if (!com.nic.mparivahan.a.f9624a.a(dlPhotoSign)) {
            Toast.makeText(dlPhotoSign.getApplicationContext(), dlPhotoSign.Z1().b("label_log_check_internet", dlPhotoSign.getString(R.string.kindly_check_your_internet_connection)), 0).show();
        } else if (dlPhotoSign.J == -1 || dlPhotoSign.T.length() <= 0 || dlPhotoSign.U.length() <= 0) {
            dlPhotoSign.y2(dlPhotoSign.Z1().b("photo_signature", ""));
        } else {
            t2 t2Var = dlPhotoSign.G;
            if (t2Var == null) {
                cm.l.v("mBinding");
                t2Var = null;
            }
            t2Var.f28661v0.c(true);
            ak.a aVar2 = dlPhotoSign.H;
            if (aVar2 == null) {
                cm.l.v("viewModel");
                aVar = null;
            } else {
                aVar = aVar2;
            }
            String str4 = dlPhotoSign.K;
            if (str4 == null) {
                cm.l.v("mApplNo");
                str = null;
            } else {
                str = str4;
            }
            String str5 = dlPhotoSign.L;
            if (str5 == null) {
                cm.l.v("mApplDob");
                str2 = null;
            } else {
                str2 = str5;
            }
            String str6 = dlPhotoSign.Q;
            if (str6 == null) {
                cm.l.v("stateCode");
                str3 = null;
            } else {
                str3 = str6;
            }
            aVar.n(str, str2, str3, dlPhotoSign.T, dlPhotoSign.U, dlPhotoSign.J);
        }
    }

    /* access modifiers changed from: private */
    public static final void r2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        dlPhotoSign.finish();
    }

    /* access modifiers changed from: private */
    public static final void s2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        Intent intent = new Intent(dlPhotoSign, DashBoard.class);
        intent.setFlags(67108864);
        dlPhotoSign.startActivity(intent);
        dlPhotoSign.finish();
    }

    /* access modifiers changed from: private */
    public static final void t2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        t2 t2Var = dlPhotoSign.G;
        String str = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.W.c(true);
        ak.a aVar = dlPhotoSign.H;
        if (aVar == null) {
            cm.l.v("viewModel");
            aVar = null;
        }
        String str2 = dlPhotoSign.K;
        if (str2 == null) {
            cm.l.v("mApplNo");
            str2 = null;
        }
        String str3 = dlPhotoSign.L;
        if (str3 == null) {
            cm.l.v("mApplDob");
        } else {
            str = str3;
        }
        aVar.h(str2, str);
    }

    /* access modifiers changed from: private */
    public static final void u2(DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dlPhotoSign, "this$0");
        t2 t2Var = dlPhotoSign.G;
        t2 t2Var2 = null;
        if (t2Var == null) {
            cm.l.v("mBinding");
            t2Var = null;
        }
        t2Var.f28662w.setVisibility(8);
        t2 t2Var3 = dlPhotoSign.G;
        if (t2Var3 == null) {
            cm.l.v("mBinding");
            t2Var3 = null;
        }
        t2Var3.f28663x.setVisibility(0);
        t2 t2Var4 = dlPhotoSign.G;
        if (t2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t2Var2 = t2Var4;
        }
        t2Var2.J.setVisibility(0);
    }

    private final void w2(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new d0(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void x2(Dialog dialog, DlPhotoSign dlPhotoSign, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dlPhotoSign, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(dlPhotoSign, DashBoard.class);
        intent.setFlags(67108864);
        dlPhotoSign.startActivity(intent);
        dlPhotoSign.finish();
    }

    /* access modifiers changed from: private */
    public final void y2(String str) {
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
        textView.setText(Z1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(Z1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(Z1().b("btn_ok", "OK"));
        textView.setOnClickListener(new e0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void z2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final void A2(Context context, String str) {
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
        textView.setText(Z1().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new g0(dialog));
        dialog.show();
    }

    public final void C2(String str) {
        cm.l.f(str, "<set-?>");
        this.f9309a0 = str;
    }

    public final void D2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f9311c0 = cVar;
    }

    public final void E2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f9310b0 = gVar;
    }

    public final String V1(String str) {
        String str2;
        cm.l.f(str, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS+ZZ:ZZ");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            cm.l.c(parse);
            str2 = simpleDateFormat2.format(parse);
        } catch (ParseException e10) {
            e10.printStackTrace();
            str2 = null;
        }
        return String.valueOf(str2);
    }

    public final String W1() {
        String str = this.f9309a0;
        if (str != null) {
            return str;
        }
        cm.l.v("app_date");
        return null;
    }

    public final d.c Y1() {
        return this.f9314f0;
    }

    public final ld.c Z1() {
        ld.c cVar = this.f9311c0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ld.g a2() {
        ld.g gVar = this.f9310b0;
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
        E2(new ld.g(this));
        D2(new ld.c(this));
        c2();
        d2();
        e2();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        String b10;
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 222) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                b10 = Z1().b("go_settings", "");
            } else {
                return;
            }
        } else if (i10 == 1001) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                b10 = Z1().b("per_denied", getString(R.string.permission));
            } else {
                return;
            }
        } else {
            return;
        }
        Toast.makeText(this, b10, 0).show();
    }

    public final void v2(Integer num) {
        if (num != null && num.intValue() == 135) {
            K2();
        } else if (num != null && num.intValue() == 134) {
            I2();
        } else if (num != null && num.intValue() == 123) {
            H2();
        } else if (num != null && num.intValue() == 371) {
            L2();
        } else if (num != null && num.intValue() == 455) {
            w2(Z1().b("label_e_sign", getString(R.string.esign)));
        }
    }
}
