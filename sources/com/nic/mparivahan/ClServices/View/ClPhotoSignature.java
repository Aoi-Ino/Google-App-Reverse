package com.nic.mparivahan.ClServices.View;

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
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import bm.l;
import cb.t0;
import cm.m;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import ni.x0;
import p9.a2;
import p9.b2;
import p9.c2;
import p9.d2;
import p9.e2;
import p9.f2;
import p9.g2;
import p9.h2;
import p9.i2;
import p9.j2;
import p9.n1;
import p9.o1;
import p9.p1;
import p9.q1;
import p9.r1;
import p9.s1;
import p9.t1;
import p9.u1;
import p9.v1;
import p9.w1;
import p9.x1;
import p9.y1;
import p9.z1;
import pl.x;
import t2.a;
import v9.e;

public final class ClPhotoSignature extends androidx.appcompat.app.d {

    /* renamed from: n0  reason: collision with root package name */
    public static final a f7894n0 = new a((cm.g) null);
    /* access modifiers changed from: private */
    public x0 G;
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
    private String f7895a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f7896b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private String f7897c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    private String f7898d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private String f7899e0 = "";

    /* renamed from: f0  reason: collision with root package name */
    private String f7900f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    public String f7901g0;

    /* renamed from: h0  reason: collision with root package name */
    public ld.g f7902h0;

    /* renamed from: i0  reason: collision with root package name */
    public ld.c f7903i0;

    /* renamed from: j0  reason: collision with root package name */
    public ld.f f7904j0;

    /* renamed from: k0  reason: collision with root package name */
    private t0 f7905k0;
    /* access modifiers changed from: private */

    /* renamed from: l0  reason: collision with root package name */
    public final d.c f7906l0;

    /* renamed from: m0  reason: collision with root package name */
    private d.c f7907m0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClPhotoSignature f7908e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ClPhotoSignature clPhotoSignature) {
            super(1);
            this.f7908e = clPhotoSignature;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f7908e.a2().a(intent);
            this.f7908e.L2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClPhotoSignature f7909e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ClPhotoSignature clPhotoSignature) {
            super(1);
            this.f7909e = clPhotoSignature;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f7909e.f7906l0.a(intent);
            this.f7909e.L2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClPhotoSignature f7910e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ClPhotoSignature clPhotoSignature) {
            super(1);
            this.f7910e = clPhotoSignature;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f7910e.f7906l0.a(intent);
            this.f7910e.L2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClPhotoSignature f7911e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ClPhotoSignature clPhotoSignature) {
            super(1);
            this.f7911e = clPhotoSignature;
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
                            ClPhotoSignature clPhotoSignature = this.f7911e;
                            ResponseBody responseBody = dlApplStatusResponse.getResponseBody();
                            String str2 = null;
                            clPhotoSignature.M = String.valueOf(responseBody != null ? responseBody.getApdFullName() : null);
                            ClPhotoSignature clPhotoSignature2 = this.f7911e;
                            ResponseBody responseBody2 = dlApplStatusResponse.getResponseBody();
                            clPhotoSignature2.N = String.valueOf(responseBody2 != null ? responseBody2.getApdSwdFullName() : null);
                            ClPhotoSignature clPhotoSignature3 = this.f7911e;
                            ResponseBody responseBody3 = dlApplStatusResponse.getResponseBody();
                            if (clPhotoSignature3.X1(String.valueOf(responseBody3 != null ? responseBody3.getApdAppldt() : null)).length() > 0) {
                                ClPhotoSignature clPhotoSignature4 = this.f7911e;
                                ResponseBody responseBody4 = dlApplStatusResponse.getResponseBody();
                                str = clPhotoSignature4.X1(String.valueOf(responseBody4 != null ? responseBody4.getApdAppldt() : null));
                            } else {
                                ResponseBody responseBody5 = dlApplStatusResponse.getResponseBody();
                                str = String.valueOf(responseBody5 != null ? responseBody5.getApdAppldt() : null);
                            }
                            clPhotoSignature3.R = str;
                            ClPhotoSignature clPhotoSignature5 = this.f7911e;
                            ResponseBody responseBody6 = dlApplStatusResponse.getResponseBody();
                            clPhotoSignature5.S = String.valueOf((responseBody6 == null || (transReq = responseBody6.getTransReq()) == null || (transReqItem = transReq.get(0)) == null) ? null : transReqItem.getTrTrCd());
                            ResponseBody responseBody7 = dlApplStatusResponse.getResponseBody();
                            OlaMast olaMast = responseBody7 != null ? responseBody7.getOlaMast() : null;
                            ClPhotoSignature clPhotoSignature6 = this.f7911e;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd1() : null);
                            sb2.append(' ');
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd2() : null);
                            sb2.append(' ');
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd3() : null);
                            clPhotoSignature6.O = sb2.toString();
                            this.f7911e.P = String.valueOf(olaMast != null ? olaMast.getOmOfficecd() : null);
                            this.f7911e.Q = String.valueOf(olaMast != null ? olaMast.getOmStCode() : null);
                            x0 C1 = this.f7911e.G;
                            if (C1 == null) {
                                cm.l.v("cBinding");
                                C1 = null;
                            }
                            TextView textView = C1.D;
                            String H1 = this.f7911e.K;
                            if (H1 == null) {
                                cm.l.v("mApplNo");
                                H1 = null;
                            }
                            textView.setText(H1);
                            x0 C12 = this.f7911e.G;
                            if (C12 == null) {
                                cm.l.v("cBinding");
                                C12 = null;
                            }
                            TextView textView2 = C12.F;
                            String E1 = this.f7911e.L;
                            if (E1 == null) {
                                cm.l.v("mApplDob");
                                E1 = null;
                            }
                            textView2.setText(E1);
                            x0 C13 = this.f7911e.G;
                            if (C13 == null) {
                                cm.l.v("cBinding");
                                C13 = null;
                            }
                            TextView textView3 = C13.E;
                            String G1 = this.f7911e.M;
                            if (G1 == null) {
                                cm.l.v("mApplName");
                                G1 = null;
                            }
                            textView3.setText(G1);
                            x0 C14 = this.f7911e.G;
                            if (C14 == null) {
                                cm.l.v("cBinding");
                                C14 = null;
                            }
                            TextView textView4 = C14.H;
                            String F1 = this.f7911e.N;
                            if (F1 == null) {
                                cm.l.v("mApplFather");
                                F1 = null;
                            }
                            textView4.setText(F1);
                            x0 C15 = this.f7911e.G;
                            if (C15 == null) {
                                cm.l.v("cBinding");
                                C15 = null;
                            }
                            TextView textView5 = C15.T;
                            String I1 = this.f7911e.O;
                            if (I1 == null) {
                                cm.l.v("mApplRtoName");
                                I1 = null;
                            }
                            textView5.setText(I1);
                            this.f7911e.J = 0;
                            if (com.nic.mparivahan.a.f9624a.a(this.f7911e)) {
                                ak.a K1 = this.f7911e.H;
                                if (K1 == null) {
                                    cm.l.v("viewModel");
                                    K1 = null;
                                }
                                String H12 = this.f7911e.K;
                                if (H12 == null) {
                                    cm.l.v("mApplNo");
                                    H12 = null;
                                }
                                String E12 = this.f7911e.L;
                                if (E12 == null) {
                                    cm.l.v("mApplDob");
                                    E12 = null;
                                }
                                String D1 = this.f7911e.P;
                                if (D1 == null) {
                                    cm.l.v("lastEndorseRTOCode");
                                } else {
                                    str2 = D1;
                                }
                                K1.i(H12, E12, str2);
                                return;
                            }
                            Toast.makeText(this.f7911e.getApplicationContext(), this.f7911e.b2().b("label_log_check_internet", this.f7911e.getString(R.string.kindly_check_your_internet_connection)), 0).show();
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
        final /* synthetic */ ClPhotoSignature f7912e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ClPhotoSignature clPhotoSignature) {
            super(1);
            this.f7912e = clPhotoSignature;
        }

        public final void b(DlPhotoStatusDycryResponse dlPhotoStatusDycryResponse) {
            try {
                ResponseMsg responseMsg = dlPhotoStatusDycryResponse.getResponseMsg();
                if (responseMsg != null) {
                    Integer statusCode = responseMsg.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200) {
                            PhotoDto photoDto = dlPhotoStatusDycryResponse.getPhotoDto();
                            x0 x0Var = null;
                            Bitmap c10 = com.nic.mparivahan.dlservices.utilities.e.c(String.valueOf(photoDto != null ? photoDto.getPhoto() : null));
                            x0 C1 = this.f7912e.G;
                            if (C1 == null) {
                                cm.l.v("cBinding");
                                C1 = null;
                            }
                            C1.f29278v0.setImageBitmap(c10);
                            PhotoDto photoDto2 = dlPhotoStatusDycryResponse.getPhotoDto();
                            Bitmap c11 = com.nic.mparivahan.dlservices.utilities.e.c(String.valueOf(photoDto2 != null ? photoDto2.getSignature() : null));
                            x0 C12 = this.f7912e.G;
                            if (C12 == null) {
                                cm.l.v("cBinding");
                            } else {
                                x0Var = C12;
                            }
                            x0Var.W.setImageBitmap(c11);
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
        final /* synthetic */ ClPhotoSignature f7913e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ClPhotoSignature clPhotoSignature) {
            super(1);
            this.f7913e = clPhotoSignature;
        }

        public final void b(com.nic.mparivahan.dlservices.data.model.temp.PhotoDto photoDto) {
            try {
                x0 C1 = this.f7913e.G;
                x0 x0Var = null;
                if (C1 == null) {
                    cm.l.v("cBinding");
                    C1 = null;
                }
                C1.f29280w0.c(false);
                String statusCode = photoDto.getStatusCode();
                if (statusCode == null || !statusCode.equals("00")) {
                    this.f7913e.E2(photoDto.getStatusDesc());
                    return;
                }
                ClPhotoSignature clPhotoSignature = this.f7913e;
                clPhotoSignature.G2(clPhotoSignature, clPhotoSignature.b2().b("label_photo_sign_uploaded", this.f7913e.getString(R.string.photo_uploaded)));
                x0 C12 = this.f7913e.G;
                if (C12 == null) {
                    cm.l.v("cBinding");
                    C12 = null;
                }
                C12.X.setVisibility(0);
                x0 C13 = this.f7913e.G;
                if (C13 == null) {
                    cm.l.v("cBinding");
                } else {
                    x0Var = C13;
                }
                x0Var.f29280w0.setVisibility(8);
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
        final /* synthetic */ ClPhotoSignature f7914e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ClPhotoSignature clPhotoSignature) {
            super(1);
            this.f7914e = clPhotoSignature;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            try {
                x0 C1 = this.f7914e.G;
                if (C1 == null) {
                    cm.l.v("cBinding");
                    C1 = null;
                }
                C1.X.c(false);
                if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                    Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                    this.f7914e.N2(applStatusDetailsItem.getApplFlowStatusList());
                }
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7915a;

        i(l lVar) {
            cm.l.f(lVar, "function");
            this.f7915a = lVar;
        }

        public final pl.c a() {
            return this.f7915a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7915a.invoke(obj);
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

    public ClPhotoSignature() {
        d.c y02 = y0(new e.d(), new n1(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f7906l0 = y02;
        d.c y03 = y0(new e.d(), new y1(this));
        cm.l.e(y03, "registerForActivityResult(...)");
        this.f7907m0 = y03;
    }

    /* access modifiers changed from: private */
    public static final void B2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        clPhotoSignature.finish();
    }

    private final void C2(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new x1(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void D2(Dialog dialog, ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(clPhotoSignature, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(clPhotoSignature, DashBoard.class);
        intent.setFlags(67108864);
        clPhotoSignature.startActivity(intent);
        clPhotoSignature.finish();
    }

    /* access modifiers changed from: private */
    public final void E2(String str) {
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
        textView.setText(b2().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(b2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(b2().b("btn_ok", "OK"));
        textView.setOnClickListener(new z1(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void F2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void H2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void L2(boolean z10) {
        if (z10) {
            try {
                this.f7905k0 = new t0(this, R.string.please_wait_2, true);
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                return;
            }
        }
        t0 t0Var = this.f7905k0;
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
    public final void N2(List list) {
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
            int parseInt = Integer.parseInt(c2().k());
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
        } catch (Exception unused) {
        }
        A2(num);
    }

    private final void O2() {
        try {
            Intent intent = new Intent(this, ClDocumentsUpload.class);
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
            intent.putExtra("fatherName", this.f7896b0);
            intent.putExtra("clName", this.f7895a0);
            intent.putExtra("clPhoto", this.Z);
            intent.putExtra("address", this.f7897c0).toString();
            intent.putExtra("issuing_authority", this.f7899e0).toString();
            intent.putExtra("validity", this.f7900f0).toString();
            intent.putExtra("cl_Status", this.f7898d0).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void P2() {
        try {
            Intent intent = new Intent(this, ClFeePayment.class);
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
            intent.putExtra("fatherName", this.f7896b0);
            intent.putExtra("clName", this.f7895a0);
            intent.putExtra("clPhoto", this.Z);
            intent.putExtra("address", this.f7897c0).toString();
            intent.putExtra("issuing_authority", this.f7899e0).toString();
            intent.putExtra("validity", this.f7900f0).toString();
            intent.putExtra("cl_Status", this.f7898d0).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void Q2(ClPhotoSignature clPhotoSignature, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(clPhotoSignature, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                x0 x0Var = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    ContentResolver contentResolver = clPhotoSignature.getContentResolver();
                    cm.l.c(data);
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(clPhotoSignature.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                String str2 = clPhotoSignature.I;
                if (str2 == null) {
                    cm.l.v("imgType");
                    str2 = null;
                }
                if (cm.l.a(str2, "0")) {
                    x0 x0Var2 = clPhotoSignature.G;
                    if (x0Var2 == null) {
                        cm.l.v("cBinding");
                    } else {
                        x0Var = x0Var2;
                    }
                    x0Var.f29278v0.setImageBitmap(bitmap);
                    clPhotoSignature.T = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                } else if (cm.l.a(str2, "1")) {
                    x0 x0Var3 = clPhotoSignature.G;
                    if (x0Var3 == null) {
                        cm.l.v("cBinding");
                    } else {
                        x0Var = x0Var3;
                    }
                    x0Var.W.setImageBitmap(bitmap);
                    clPhotoSignature.U = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                }
            } else if (d10 == 64) {
                clPhotoSignature.L2(false);
                Toast.makeText(clPhotoSignature, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            clPhotoSignature.L2(false);
        } catch (Exception unused) {
        }
    }

    private final void R2() {
        try {
            Intent intent = new Intent(this, ClPhotoSignature.class);
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
            intent.putExtra("fatherName", this.f7896b0);
            intent.putExtra("clName", this.f7895a0);
            intent.putExtra("clPhoto", this.Z);
            intent.putExtra("address", this.f7897c0).toString();
            intent.putExtra("issuing_authority", this.f7899e0).toString();
            intent.putExtra("validity", this.f7900f0).toString();
            intent.putExtra("cl_Status", this.f7898d0).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void S2() {
        try {
            Intent intent = new Intent(this, ClSots.class);
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
            intent.putExtra("fatherName", this.f7896b0);
            intent.putExtra("clName", this.f7895a0);
            intent.putExtra("clPhoto", this.Z);
            intent.putExtra("address", this.f7897c0).toString();
            intent.putExtra("issuing_authority", this.f7899e0).toString();
            intent.putExtra("validity", this.f7900f0).toString();
            intent.putExtra("cl_Status", this.f7898d0).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void W1() {
        if (com.nic.mparivahan.dlservices.utilities.e.e(this)) {
            t2.a.f16505a.b(this).j().f(600).i().h(new b(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void Z1(ClPhotoSignature clPhotoSignature, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(clPhotoSignature, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                x0 x0Var = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    ContentResolver contentResolver = clPhotoSignature.getContentResolver();
                    cm.l.c(data);
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(clPhotoSignature.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                String str2 = clPhotoSignature.I;
                if (str2 == null) {
                    cm.l.v("imgType");
                    str2 = null;
                }
                if (cm.l.a(str2, "0")) {
                    x0 x0Var2 = clPhotoSignature.G;
                    if (x0Var2 == null) {
                        cm.l.v("cBinding");
                    } else {
                        x0Var = x0Var2;
                    }
                    x0Var.f29278v0.setImageBitmap(bitmap);
                    clPhotoSignature.T = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                } else if (cm.l.a(str2, "1")) {
                    x0 x0Var3 = clPhotoSignature.G;
                    if (x0Var3 == null) {
                        cm.l.v("cBinding");
                    } else {
                        x0Var = x0Var3;
                    }
                    x0Var.W.setImageBitmap(bitmap);
                    clPhotoSignature.U = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                }
            } else if (d10 == 64) {
                clPhotoSignature.L2(false);
                Toast.makeText(clPhotoSignature, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            clPhotoSignature.L2(false);
        } catch (Exception unused) {
        }
    }

    private final void e2() {
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

    private final void f2() {
        this.H = (ak.a) new u0(this).a(ak.a.class);
        x0 x0Var = this.G;
        ak.a aVar = null;
        if (x0Var == null) {
            cm.l.v("cBinding");
            x0Var = null;
        }
        x0Var.v(this);
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
                x0 x0Var2 = this.G;
                if (x0Var2 == null) {
                    cm.l.v("cBinding");
                    x0Var2 = null;
                }
                x0Var2.I.f25961g.setText(d2().i());
                x0 x0Var3 = this.G;
                if (x0Var3 == null) {
                    cm.l.v("cBinding");
                    x0Var3 = null;
                }
                x0Var3.G.setText("CL No. : " + this.V);
                String stringExtra2 = getIntent().getStringExtra("clName");
                cm.l.d(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.f7895a0 = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("fatherName");
                cm.l.d(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.f7896b0 = stringExtra3;
                this.f7897c0 = String.valueOf(getIntent().getStringExtra("address"));
                this.f7899e0 = String.valueOf(getIntent().getStringExtra("issuing_authority"));
                this.f7900f0 = String.valueOf(getIntent().getStringExtra("validity"));
                this.f7898d0 = String.valueOf(getIntent().getStringExtra("cl_Status"));
                String stringExtra4 = getIntent().getStringExtra("clPhoto");
                cm.l.d(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.Z = stringExtra4;
            } catch (Exception unused) {
            }
        }
        String format = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        cm.l.e(format, "format(...)");
        I2(format);
        x0 x0Var4 = this.G;
        if (x0Var4 == null) {
            cm.l.v("cBinding");
            x0Var4 = null;
        }
        x0Var4.C.setText(Y1());
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
            Toast.makeText(getApplicationContext(), b2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
        ak.a aVar3 = this.H;
        if (aVar3 == null) {
            cm.l.v("viewModel");
        } else {
            aVar = aVar3;
        }
        aVar.k().g(this, new i(new e(this)));
    }

    private final void g2() {
        ak.a aVar = this.H;
        ak.a aVar2 = null;
        if (aVar == null) {
            cm.l.v("viewModel");
            aVar = null;
        }
        aVar.j().g(this, new i(new f(this)));
        ak.a aVar3 = this.H;
        if (aVar3 == null) {
            cm.l.v("viewModel");
            aVar3 = null;
        }
        aVar3.m().g(this, new i(new g(this)));
        ak.a aVar4 = this.H;
        if (aVar4 == null) {
            cm.l.v("viewModel");
        } else {
            aVar2 = aVar4;
        }
        aVar2.l().g(this, new i(new h(this)));
    }

    private final void h2() {
        x0 x0Var = this.G;
        x0 x0Var2 = null;
        if (x0Var == null) {
            cm.l.v("cBinding");
            x0Var = null;
        }
        x0Var.P.setOnClickListener(new d2(this));
        x0 x0Var3 = this.G;
        if (x0Var3 == null) {
            cm.l.v("cBinding");
            x0Var3 = null;
        }
        x0Var3.Q.setOnClickListener(new o1(this));
        x0 x0Var4 = this.G;
        if (x0Var4 == null) {
            cm.l.v("cBinding");
            x0Var4 = null;
        }
        x0Var4.U.setOnClickListener(new p1(this));
        x0 x0Var5 = this.G;
        if (x0Var5 == null) {
            cm.l.v("cBinding");
            x0Var5 = null;
        }
        x0Var5.V.setOnClickListener(new q1(this));
        x0 x0Var6 = this.G;
        if (x0Var6 == null) {
            cm.l.v("cBinding");
            x0Var6 = null;
        }
        x0Var6.f29280w0.setOnClickListener(new r1(this));
        x0 x0Var7 = this.G;
        if (x0Var7 == null) {
            cm.l.v("cBinding");
            x0Var7 = null;
        }
        x0Var7.I.f25959e.setOnClickListener(new s1(this));
        x0 x0Var8 = this.G;
        if (x0Var8 == null) {
            cm.l.v("cBinding");
            x0Var8 = null;
        }
        x0Var8.I.f25957c.setOnClickListener(new t1(this));
        x0 x0Var9 = this.G;
        if (x0Var9 == null) {
            cm.l.v("cBinding");
            x0Var9 = null;
        }
        x0Var9.X.setOnClickListener(new u1(this));
        x0 x0Var10 = this.G;
        if (x0Var10 == null) {
            cm.l.v("cBinding");
            x0Var10 = null;
        }
        x0Var10.f29279w.setOnClickListener(new v1(this));
        x0 x0Var11 = this.G;
        if (x0Var11 == null) {
            cm.l.v("cBinding");
            x0Var11 = null;
        }
        x0Var11.f29281x.setOnClickListener(new w1(this));
        x0 x0Var12 = this.G;
        if (x0Var12 == null) {
            cm.l.v("cBinding");
            x0Var12 = null;
        }
        x0Var12.f29282y.setOnClickListener(new e2(this));
        x0 x0Var13 = this.G;
        if (x0Var13 == null) {
            cm.l.v("cBinding");
            x0Var13 = null;
        }
        x0Var13.f29283z.setOnClickListener(new f2(this));
        x0 x0Var14 = this.G;
        if (x0Var14 == null) {
            cm.l.v("cBinding");
            x0Var14 = null;
        }
        x0Var14.B.setOnClickListener(new g2(this));
        x0 x0Var15 = this.G;
        if (x0Var15 == null) {
            cm.l.v("cBinding");
            x0Var15 = null;
        }
        x0Var15.A.setOnClickListener(new h2(this));
        x0 x0Var16 = this.G;
        if (x0Var16 == null) {
            cm.l.v("cBinding");
            x0Var16 = null;
        }
        x0Var16.Y.setOnClickListener(new i2(this));
        x0 x0Var17 = this.G;
        if (x0Var17 == null) {
            cm.l.v("cBinding");
        } else {
            x0Var2 = x0Var17;
        }
        x0Var2.Z.setOnClickListener(new j2(this));
    }

    /* access modifiers changed from: private */
    public static final void i2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        x0 x0Var = clPhotoSignature.G;
        String str = null;
        if (x0Var == null) {
            cm.l.v("cBinding");
            x0Var = null;
        }
        x0Var.X.c(true);
        ak.a aVar = clPhotoSignature.H;
        if (aVar == null) {
            cm.l.v("viewModel");
            aVar = null;
        }
        String str2 = clPhotoSignature.K;
        if (str2 == null) {
            cm.l.v("mApplNo");
            str2 = null;
        }
        String str3 = clPhotoSignature.L;
        if (str3 == null) {
            cm.l.v("mApplDob");
        } else {
            str = str3;
        }
        aVar.h(str2, str);
    }

    /* access modifiers changed from: private */
    public static final void j2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        x0 x0Var = clPhotoSignature.G;
        x0 x0Var2 = null;
        if (x0Var == null) {
            cm.l.v("cBinding");
            x0Var = null;
        }
        x0Var.f29279w.setVisibility(8);
        x0 x0Var3 = clPhotoSignature.G;
        if (x0Var3 == null) {
            cm.l.v("cBinding");
            x0Var3 = null;
        }
        x0Var3.f29281x.setVisibility(0);
        x0 x0Var4 = clPhotoSignature.G;
        if (x0Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x0Var2 = x0Var4;
        }
        x0Var2.J.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void k2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        x0 x0Var = clPhotoSignature.G;
        x0 x0Var2 = null;
        if (x0Var == null) {
            cm.l.v("cBinding");
            x0Var = null;
        }
        x0Var.f29281x.setVisibility(8);
        x0 x0Var3 = clPhotoSignature.G;
        if (x0Var3 == null) {
            cm.l.v("cBinding");
            x0Var3 = null;
        }
        x0Var3.f29279w.setVisibility(0);
        x0 x0Var4 = clPhotoSignature.G;
        if (x0Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x0Var2 = x0Var4;
        }
        x0Var2.J.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void l2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        x0 x0Var = clPhotoSignature.G;
        x0 x0Var2 = null;
        if (x0Var == null) {
            cm.l.v("cBinding");
            x0Var = null;
        }
        x0Var.f29282y.setVisibility(8);
        x0 x0Var3 = clPhotoSignature.G;
        if (x0Var3 == null) {
            cm.l.v("cBinding");
            x0Var3 = null;
        }
        x0Var3.f29283z.setVisibility(0);
        x0 x0Var4 = clPhotoSignature.G;
        if (x0Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x0Var2 = x0Var4;
        }
        x0Var2.K.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void m2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        x0 x0Var = clPhotoSignature.G;
        x0 x0Var2 = null;
        if (x0Var == null) {
            cm.l.v("cBinding");
            x0Var = null;
        }
        x0Var.f29283z.setVisibility(8);
        x0 x0Var3 = clPhotoSignature.G;
        if (x0Var3 == null) {
            cm.l.v("cBinding");
            x0Var3 = null;
        }
        x0Var3.f29282y.setVisibility(0);
        x0 x0Var4 = clPhotoSignature.G;
        if (x0Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x0Var2 = x0Var4;
        }
        x0Var2.K.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void n2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        x0 x0Var = clPhotoSignature.G;
        x0 x0Var2 = null;
        if (x0Var == null) {
            cm.l.v("cBinding");
            x0Var = null;
        }
        x0Var.B.setVisibility(8);
        x0 x0Var3 = clPhotoSignature.G;
        if (x0Var3 == null) {
            cm.l.v("cBinding");
            x0Var3 = null;
        }
        x0Var3.A.setVisibility(0);
        x0 x0Var4 = clPhotoSignature.G;
        if (x0Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x0Var2 = x0Var4;
        }
        x0Var2.L.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void o2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        x0 x0Var = clPhotoSignature.G;
        x0 x0Var2 = null;
        if (x0Var == null) {
            cm.l.v("cBinding");
            x0Var = null;
        }
        x0Var.A.setVisibility(8);
        x0 x0Var3 = clPhotoSignature.G;
        if (x0Var3 == null) {
            cm.l.v("cBinding");
            x0Var3 = null;
        }
        x0Var3.B.setVisibility(0);
        x0 x0Var4 = clPhotoSignature.G;
        if (x0Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x0Var2 = x0Var4;
        }
        x0Var2.L.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void p2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        x0 x0Var = clPhotoSignature.G;
        x0 x0Var2 = null;
        if (x0Var == null) {
            cm.l.v("cBinding");
            x0Var = null;
        }
        x0Var.Y.setVisibility(8);
        x0 x0Var3 = clPhotoSignature.G;
        if (x0Var3 == null) {
            cm.l.v("cBinding");
            x0Var3 = null;
        }
        x0Var3.Z.setVisibility(0);
        x0 x0Var4 = clPhotoSignature.G;
        if (x0Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x0Var2 = x0Var4;
        }
        x0Var2.M.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void q2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        x0 x0Var = clPhotoSignature.G;
        x0 x0Var2 = null;
        if (x0Var == null) {
            cm.l.v("cBinding");
            x0Var = null;
        }
        x0Var.Z.setVisibility(8);
        x0 x0Var3 = clPhotoSignature.G;
        if (x0Var3 == null) {
            cm.l.v("cBinding");
            x0Var3 = null;
        }
        x0Var3.Y.setVisibility(0);
        x0 x0Var4 = clPhotoSignature.G;
        if (x0Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x0Var2 = x0Var4;
        }
        x0Var2.M.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void r2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        clPhotoSignature.I = "0";
        clPhotoSignature.e2();
    }

    /* access modifiers changed from: private */
    public static final void s2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        clPhotoSignature.I = "0";
        clPhotoSignature.W1();
    }

    /* access modifiers changed from: private */
    public static final void t2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        clPhotoSignature.I = "1";
        clPhotoSignature.e2();
    }

    /* access modifiers changed from: private */
    public static final void u2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        clPhotoSignature.I = "1";
        clPhotoSignature.W1();
    }

    /* access modifiers changed from: private */
    public static final void v2(ClPhotoSignature clPhotoSignature, View view) {
        ak.a aVar;
        String str;
        String str2;
        String str3;
        cm.l.f(clPhotoSignature, "this$0");
        if (!com.nic.mparivahan.a.f9624a.a(clPhotoSignature)) {
            Toast.makeText(clPhotoSignature.getApplicationContext(), clPhotoSignature.b2().b("label_log_check_internet", clPhotoSignature.getString(R.string.kindly_check_your_internet_connection)), 0).show();
        } else if (clPhotoSignature.J == -1 || clPhotoSignature.T.length() <= 0 || clPhotoSignature.U.length() <= 0) {
            clPhotoSignature.E2(clPhotoSignature.b2().b("photo_signature", ""));
        } else {
            x0 x0Var = clPhotoSignature.G;
            if (x0Var == null) {
                cm.l.v("cBinding");
                x0Var = null;
            }
            x0Var.f29280w0.c(true);
            ak.a aVar2 = clPhotoSignature.H;
            if (aVar2 == null) {
                cm.l.v("viewModel");
                aVar = null;
            } else {
                aVar = aVar2;
            }
            String str4 = clPhotoSignature.K;
            if (str4 == null) {
                cm.l.v("mApplNo");
                str = null;
            } else {
                str = str4;
            }
            String str5 = clPhotoSignature.L;
            if (str5 == null) {
                cm.l.v("mApplDob");
                str2 = null;
            } else {
                str2 = str5;
            }
            String str6 = clPhotoSignature.Q;
            if (str6 == null) {
                cm.l.v("stateCode");
                str3 = null;
            } else {
                str3 = str6;
            }
            aVar.n(str, str2, str3, clPhotoSignature.T, clPhotoSignature.U, clPhotoSignature.J);
        }
    }

    /* access modifiers changed from: private */
    public static final void w2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        clPhotoSignature.finish();
    }

    /* access modifiers changed from: private */
    public static final void x2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        Intent intent = new Intent(clPhotoSignature, DashBoard.class);
        intent.setFlags(67108864);
        clPhotoSignature.startActivity(intent);
        clPhotoSignature.finish();
    }

    private final void y2() {
        try {
            x0 x0Var = this.G;
            x0 x0Var2 = null;
            if (x0Var == null) {
                cm.l.v("cBinding");
                x0Var = null;
            }
            x0Var.N.f29580g.setText(d2().i());
            x0 x0Var3 = this.G;
            if (x0Var3 == null) {
                cm.l.v("cBinding");
                x0Var3 = null;
            }
            TextView textView = x0Var3.N.f29581h;
            x0 x0Var4 = this.G;
            if (x0Var4 == null) {
                cm.l.v("cBinding");
                x0Var4 = null;
            }
            textView.setPaintFlags(x0Var4.N.f29581h.getPaintFlags() | 8);
            x0 x0Var5 = this.G;
            if (x0Var5 == null) {
                cm.l.v("cBinding");
                x0Var5 = null;
            }
            TextView textView2 = x0Var5.N.f29581h;
            String str = this.V;
            cm.l.c(str);
            textView2.setText(q.B0(str).toString());
            if (cm.l.a(d2().b(), "551")) {
                x0 x0Var6 = this.G;
                if (x0Var6 == null) {
                    cm.l.v("cBinding");
                    x0Var6 = null;
                }
                x0Var6.N.f29581h.setVisibility(8);
            } else {
                x0 x0Var7 = this.G;
                if (x0Var7 == null) {
                    cm.l.v("cBinding");
                    x0Var7 = null;
                }
                x0Var7.N.f29581h.setVisibility(0);
            }
            x0 x0Var8 = this.G;
            if (x0Var8 == null) {
                cm.l.v("cBinding");
            } else {
                x0Var2 = x0Var8;
            }
            x0Var2.N.f29581h.setOnClickListener(new b2(this));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void z2(ClPhotoSignature clPhotoSignature, View view) {
        cm.l.f(clPhotoSignature, "this$0");
        if (!cm.l.a(clPhotoSignature.d2().b(), "551")) {
            try {
                Intent intent = new Intent(clPhotoSignature, ClDetailsTop.class);
                String str = clPhotoSignature.V;
                cm.l.c(str);
                intent.putExtra("dlValue", q.B0(str).toString());
                intent.putExtra("dobValue", clPhotoSignature.W);
                intent.putExtra("fatherName", clPhotoSignature.f7896b0);
                intent.putExtra("clName", clPhotoSignature.f7895a0);
                intent.putExtra("clPhoto", clPhotoSignature.Z);
                intent.putExtra("address", clPhotoSignature.f7897c0).toString();
                intent.putExtra("issuing_authority", clPhotoSignature.f7899e0).toString();
                intent.putExtra("validity", clPhotoSignature.f7900f0).toString();
                intent.putExtra("cl_Status", clPhotoSignature.f7898d0).toString();
                clPhotoSignature.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    public final void A2(Integer num) {
        if (num != null && num.intValue() == 135) {
            R2();
        } else if (num != null && num.intValue() == 134) {
            P2();
        } else if (num != null && num.intValue() == 123) {
            O2();
        } else if (num != null && num.intValue() == 371) {
            S2();
        } else if (num != null && num.intValue() == 455) {
            C2(b2().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void G2(Context context, String str) {
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
        textView.setText(b2().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new a2(dialog));
        dialog.show();
    }

    public final void I2(String str) {
        cm.l.f(str, "<set-?>");
        this.f7901g0 = str;
    }

    public final void J2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f7903i0 = cVar;
    }

    public final void K2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f7902h0 = gVar;
    }

    public final void M2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f7904j0 = fVar;
    }

    public final String X1(String str) {
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

    public final String Y1() {
        String str = this.f7901g0;
        if (str != null) {
            return str;
        }
        cm.l.v("app_date");
        return null;
    }

    public final d.c a2() {
        return this.f7907m0;
    }

    public final ld.c b2() {
        ld.c cVar = this.f7903i0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ld.g c2() {
        ld.g gVar = this.f7902h0;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mSessionmanger");
        return null;
    }

    public final ld.f d2() {
        ld.f fVar = this.f7904j0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_cl_photo_signature);
        cm.l.e(f10, "setContentView(...)");
        this.G = (x0) f10;
        K2(new ld.g(this));
        J2(new ld.c(this));
        M2(new ld.f(this));
        f2();
        g2();
        h2();
        y2();
        e.a aVar = v9.e.f17509a;
        x0 x0Var = this.G;
        x0 x0Var2 = null;
        if (x0Var == null) {
            cm.l.v("cBinding");
            x0Var = null;
        }
        aVar.b0(this, x0Var);
        x0 x0Var3 = this.G;
        if (x0Var3 == null) {
            cm.l.v("cBinding");
        } else {
            x0Var2 = x0Var3;
        }
        x0Var2.N.f29577d.setOnClickListener(new c2(this));
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        String b10;
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 222) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                b10 = b2().b("go_settings", "");
            } else {
                return;
            }
        } else if (i10 == 1001) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                b10 = b2().b("per_denied", getString(R.string.permission));
            } else {
                return;
            }
        } else {
            return;
        }
        Toast.makeText(this, b10, 0).show();
    }
}
