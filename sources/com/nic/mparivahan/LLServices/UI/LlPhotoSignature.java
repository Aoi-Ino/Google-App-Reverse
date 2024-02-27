package com.nic.mparivahan.LLServices.UI;

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
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdate;
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
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
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import ni.x5;
import pl.x;
import t2.a;
import tb.a2;
import tb.b2;
import tb.c2;
import tb.d2;
import tb.e2;
import tb.f2;
import tb.g2;
import tb.h2;
import tb.i2;
import tb.j2;
import tb.n1;
import tb.o1;
import tb.p1;
import tb.q1;
import tb.r1;
import tb.s1;
import tb.t1;
import tb.u1;
import tb.v1;
import tb.w1;
import tb.x1;
import tb.y1;
import tb.z1;
import v9.e;

public final class LlPhotoSignature extends androidx.appcompat.app.d {

    /* renamed from: i0  reason: collision with root package name */
    public static final a f9093i0 = new a((cm.g) null);
    /* access modifiers changed from: private */
    public x5 G;
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
    public String f9094a0;

    /* renamed from: b0  reason: collision with root package name */
    public ld.g f9095b0;

    /* renamed from: c0  reason: collision with root package name */
    public ld.c f9096c0;

    /* renamed from: d0  reason: collision with root package name */
    public ld.f f9097d0;

    /* renamed from: e0  reason: collision with root package name */
    private t0 f9098e0;

    /* renamed from: f0  reason: collision with root package name */
    public FetchLlDetails f9099f0;
    /* access modifiers changed from: private */

    /* renamed from: g0  reason: collision with root package name */
    public final d.c f9100g0;

    /* renamed from: h0  reason: collision with root package name */
    private d.c f9101h0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlPhotoSignature f9102e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LlPhotoSignature llPhotoSignature) {
            super(1);
            this.f9102e = llPhotoSignature;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f9102e.a2().a(intent);
            this.f9102e.N2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlPhotoSignature f9103e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LlPhotoSignature llPhotoSignature) {
            super(1);
            this.f9103e = llPhotoSignature;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f9103e.f9100g0.a(intent);
            this.f9103e.N2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlPhotoSignature f9104e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LlPhotoSignature llPhotoSignature) {
            super(1);
            this.f9104e = llPhotoSignature;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f9104e.f9100g0.a(intent);
            this.f9104e.N2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlPhotoSignature f9105e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(LlPhotoSignature llPhotoSignature) {
            super(1);
            this.f9105e = llPhotoSignature;
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
                            LlPhotoSignature llPhotoSignature = this.f9105e;
                            ResponseBody responseBody = dlApplStatusResponse.getResponseBody();
                            String str2 = null;
                            llPhotoSignature.M = String.valueOf(responseBody != null ? responseBody.getApdFullName() : null);
                            LlPhotoSignature llPhotoSignature2 = this.f9105e;
                            ResponseBody responseBody2 = dlApplStatusResponse.getResponseBody();
                            llPhotoSignature2.N = String.valueOf(responseBody2 != null ? responseBody2.getApdSwdFullName() : null);
                            LlPhotoSignature llPhotoSignature3 = this.f9105e;
                            ResponseBody responseBody3 = dlApplStatusResponse.getResponseBody();
                            if (llPhotoSignature3.X1(String.valueOf(responseBody3 != null ? responseBody3.getApdAppldt() : null)).length() > 0) {
                                LlPhotoSignature llPhotoSignature4 = this.f9105e;
                                ResponseBody responseBody4 = dlApplStatusResponse.getResponseBody();
                                str = llPhotoSignature4.X1(String.valueOf(responseBody4 != null ? responseBody4.getApdAppldt() : null));
                            } else {
                                ResponseBody responseBody5 = dlApplStatusResponse.getResponseBody();
                                str = String.valueOf(responseBody5 != null ? responseBody5.getApdAppldt() : null);
                            }
                            llPhotoSignature3.R = str;
                            LlPhotoSignature llPhotoSignature5 = this.f9105e;
                            ResponseBody responseBody6 = dlApplStatusResponse.getResponseBody();
                            llPhotoSignature5.S = String.valueOf((responseBody6 == null || (transReq = responseBody6.getTransReq()) == null || (transReqItem = transReq.get(0)) == null) ? null : transReqItem.getTrTrCd());
                            ResponseBody responseBody7 = dlApplStatusResponse.getResponseBody();
                            OlaMast olaMast = responseBody7 != null ? responseBody7.getOlaMast() : null;
                            LlPhotoSignature llPhotoSignature6 = this.f9105e;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd1() : null);
                            sb2.append(' ');
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd2() : null);
                            sb2.append(' ');
                            sb2.append(olaMast != null ? olaMast.getOmPostaladd3() : null);
                            llPhotoSignature6.O = sb2.toString();
                            this.f9105e.P = String.valueOf(olaMast != null ? olaMast.getOmOfficecd() : null);
                            this.f9105e.Q = String.valueOf(olaMast != null ? olaMast.getOmStCode() : null);
                            x5 C1 = this.f9105e.G;
                            if (C1 == null) {
                                cm.l.v("cBinding");
                                C1 = null;
                            }
                            TextView textView = C1.D;
                            String H1 = this.f9105e.K;
                            if (H1 == null) {
                                cm.l.v("mApplNo");
                                H1 = null;
                            }
                            textView.setText(H1);
                            x5 C12 = this.f9105e.G;
                            if (C12 == null) {
                                cm.l.v("cBinding");
                                C12 = null;
                            }
                            TextView textView2 = C12.F;
                            String E1 = this.f9105e.L;
                            if (E1 == null) {
                                cm.l.v("mApplDob");
                                E1 = null;
                            }
                            textView2.setText(E1);
                            x5 C13 = this.f9105e.G;
                            if (C13 == null) {
                                cm.l.v("cBinding");
                                C13 = null;
                            }
                            TextView textView3 = C13.E;
                            String G1 = this.f9105e.M;
                            if (G1 == null) {
                                cm.l.v("mApplName");
                                G1 = null;
                            }
                            textView3.setText(G1);
                            x5 C14 = this.f9105e.G;
                            if (C14 == null) {
                                cm.l.v("cBinding");
                                C14 = null;
                            }
                            TextView textView4 = C14.H;
                            String F1 = this.f9105e.N;
                            if (F1 == null) {
                                cm.l.v("mApplFather");
                                F1 = null;
                            }
                            textView4.setText(F1);
                            x5 C15 = this.f9105e.G;
                            if (C15 == null) {
                                cm.l.v("cBinding");
                                C15 = null;
                            }
                            TextView textView5 = C15.T;
                            String I1 = this.f9105e.O;
                            if (I1 == null) {
                                cm.l.v("mApplRtoName");
                                I1 = null;
                            }
                            textView5.setText(I1);
                            this.f9105e.J = 0;
                            if (com.nic.mparivahan.a.f9624a.a(this.f9105e)) {
                                ak.a K1 = this.f9105e.H;
                                if (K1 == null) {
                                    cm.l.v("viewModel");
                                    K1 = null;
                                }
                                String H12 = this.f9105e.K;
                                if (H12 == null) {
                                    cm.l.v("mApplNo");
                                    H12 = null;
                                }
                                String E12 = this.f9105e.L;
                                if (E12 == null) {
                                    cm.l.v("mApplDob");
                                    E12 = null;
                                }
                                String D1 = this.f9105e.P;
                                if (D1 == null) {
                                    cm.l.v("lastEndorseRTOCode");
                                } else {
                                    str2 = D1;
                                }
                                K1.i(H12, E12, str2);
                                return;
                            }
                            Toast.makeText(this.f9105e.getApplicationContext(), this.f9105e.b2().b("label_log_check_internet", this.f9105e.getString(R.string.kindly_check_your_internet_connection)), 0).show();
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
        final /* synthetic */ LlPhotoSignature f9106e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(LlPhotoSignature llPhotoSignature) {
            super(1);
            this.f9106e = llPhotoSignature;
        }

        public final void b(DlPhotoStatusDycryResponse dlPhotoStatusDycryResponse) {
            try {
                ResponseMsg responseMsg = dlPhotoStatusDycryResponse.getResponseMsg();
                if (responseMsg != null) {
                    Integer statusCode = responseMsg.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200) {
                            PhotoDto photoDto = dlPhotoStatusDycryResponse.getPhotoDto();
                            x5 x5Var = null;
                            Bitmap c10 = com.nic.mparivahan.dlservices.utilities.e.c(String.valueOf(photoDto != null ? photoDto.getPhoto() : null));
                            x5 C1 = this.f9106e.G;
                            if (C1 == null) {
                                cm.l.v("cBinding");
                                C1 = null;
                            }
                            C1.f29324v0.setImageBitmap(c10);
                            PhotoDto photoDto2 = dlPhotoStatusDycryResponse.getPhotoDto();
                            Bitmap c11 = com.nic.mparivahan.dlservices.utilities.e.c(String.valueOf(photoDto2 != null ? photoDto2.getSignature() : null));
                            x5 C12 = this.f9106e.G;
                            if (C12 == null) {
                                cm.l.v("cBinding");
                            } else {
                                x5Var = C12;
                            }
                            x5Var.W.setImageBitmap(c11);
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
        final /* synthetic */ LlPhotoSignature f9107e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(LlPhotoSignature llPhotoSignature) {
            super(1);
            this.f9107e = llPhotoSignature;
        }

        public final void b(com.nic.mparivahan.dlservices.data.model.temp.PhotoDto photoDto) {
            try {
                x5 C1 = this.f9107e.G;
                x5 x5Var = null;
                if (C1 == null) {
                    cm.l.v("cBinding");
                    C1 = null;
                }
                C1.f29326w0.c(false);
                String statusCode = photoDto.getStatusCode();
                if (statusCode == null || !statusCode.equals("00")) {
                    this.f9107e.F2(photoDto.getStatusDesc());
                    return;
                }
                LlPhotoSignature llPhotoSignature = this.f9107e;
                llPhotoSignature.H2(llPhotoSignature, llPhotoSignature.b2().b("label_photo_sign_uploaded", this.f9107e.getString(R.string.photo_uploaded)));
                x5 C12 = this.f9107e.G;
                if (C12 == null) {
                    cm.l.v("cBinding");
                    C12 = null;
                }
                C12.X.setVisibility(0);
                x5 C13 = this.f9107e.G;
                if (C13 == null) {
                    cm.l.v("cBinding");
                } else {
                    x5Var = C13;
                }
                x5Var.f29326w0.setVisibility(8);
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
        final /* synthetic */ LlPhotoSignature f9108e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(LlPhotoSignature llPhotoSignature) {
            super(1);
            this.f9108e = llPhotoSignature;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            try {
                x5 C1 = this.f9108e.G;
                if (C1 == null) {
                    cm.l.v("cBinding");
                    C1 = null;
                }
                C1.X.c(false);
                if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                    Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                    this.f9108e.P2(applStatusDetailsItem.getApplFlowStatusList());
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
        private final /* synthetic */ l f9109a;

        i(l lVar) {
            cm.l.f(lVar, "function");
            this.f9109a = lVar;
        }

        public final pl.c a() {
            return this.f9109a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9109a.invoke(obj);
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

    public LlPhotoSignature() {
        d.c y02 = y0(new e.d(), new y1(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f9100g0 = y02;
        d.c y03 = y0(new e.d(), new c2(this));
        cm.l.e(y03, "registerForActivityResult(...)");
        this.f9101h0 = y03;
    }

    /* access modifiers changed from: private */
    public static final void A2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        try {
            Intent intent = new Intent(llPhotoSignature, LlDetails.class);
            intent.putExtra("LLDetails", llPhotoSignature.c2());
            llPhotoSignature.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void C2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        llPhotoSignature.finish();
    }

    private final void D2(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new d2(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void E2(Dialog dialog, LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(llPhotoSignature, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(llPhotoSignature, DashBoard.class);
        intent.setFlags(67108864);
        llPhotoSignature.startActivity(intent);
        llPhotoSignature.finish();
    }

    /* access modifiers changed from: private */
    public final void F2(String str) {
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
    public static final void G2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void I2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void N2(boolean z10) {
        if (z10) {
            try {
                this.f9098e0 = new t0(this, R.string.please_wait_2, true);
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                return;
            }
        }
        t0 t0Var = this.f9098e0;
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
    public final void P2(List list) {
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
            int parseInt = Integer.parseInt(d2().k());
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
        B2(num);
    }

    private final void Q2() {
        try {
            Intent intent = new Intent(this, LlDocumentUpload.class);
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
            intent.putExtra("LLDetails", c2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void R2() {
        try {
            Intent intent = new Intent(this, LlPayment.class);
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
            intent.putExtra("LLDetails", c2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void S2(LlPhotoSignature llPhotoSignature, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(llPhotoSignature, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                x5 x5Var = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    ContentResolver contentResolver = llPhotoSignature.getContentResolver();
                    cm.l.c(data);
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(llPhotoSignature.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                String str2 = llPhotoSignature.I;
                if (str2 == null) {
                    cm.l.v("imgType");
                    str2 = null;
                }
                if (cm.l.a(str2, "0")) {
                    x5 x5Var2 = llPhotoSignature.G;
                    if (x5Var2 == null) {
                        cm.l.v("cBinding");
                    } else {
                        x5Var = x5Var2;
                    }
                    x5Var.f29324v0.setImageBitmap(bitmap);
                    llPhotoSignature.T = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                } else if (cm.l.a(str2, "1")) {
                    x5 x5Var3 = llPhotoSignature.G;
                    if (x5Var3 == null) {
                        cm.l.v("cBinding");
                    } else {
                        x5Var = x5Var3;
                    }
                    x5Var.W.setImageBitmap(bitmap);
                    llPhotoSignature.U = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                }
            } else if (d10 == 64) {
                llPhotoSignature.N2(false);
                Toast.makeText(llPhotoSignature, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            llPhotoSignature.N2(false);
        } catch (Exception unused) {
        }
    }

    private final void T2() {
        try {
            Intent intent = new Intent(this, LlPhotoSignature.class);
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
            intent.putExtra("LLDetails", c2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void U2() {
        try {
            Intent intent = new Intent(this, LlSlots.class);
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
            intent.putExtra("LLDetails", c2());
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
    public static final void Z1(LlPhotoSignature llPhotoSignature, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(llPhotoSignature, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                x5 x5Var = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    ContentResolver contentResolver = llPhotoSignature.getContentResolver();
                    cm.l.c(data);
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(llPhotoSignature.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                String str2 = llPhotoSignature.I;
                if (str2 == null) {
                    cm.l.v("imgType");
                    str2 = null;
                }
                if (cm.l.a(str2, "0")) {
                    x5 x5Var2 = llPhotoSignature.G;
                    if (x5Var2 == null) {
                        cm.l.v("cBinding");
                    } else {
                        x5Var = x5Var2;
                    }
                    x5Var.f29324v0.setImageBitmap(bitmap);
                    llPhotoSignature.T = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                } else if (cm.l.a(str2, "1")) {
                    x5 x5Var3 = llPhotoSignature.G;
                    if (x5Var3 == null) {
                        cm.l.v("cBinding");
                    } else {
                        x5Var = x5Var3;
                    }
                    x5Var.W.setImageBitmap(bitmap);
                    llPhotoSignature.U = com.nic.mparivahan.dlservices.utilities.e.b(bitmap);
                }
            } else if (d10 == 64) {
                llPhotoSignature.N2(false);
                Toast.makeText(llPhotoSignature, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            llPhotoSignature.N2(false);
        } catch (Exception unused) {
        }
    }

    private final void f2() {
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

    private final void g2() {
        this.H = (ak.a) new u0(this).a(ak.a.class);
        x5 x5Var = this.G;
        ak.a aVar = null;
        if (x5Var == null) {
            cm.l.v("cBinding");
            x5Var = null;
        }
        x5Var.v(this);
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
                x5 x5Var2 = this.G;
                if (x5Var2 == null) {
                    cm.l.v("cBinding");
                    x5Var2 = null;
                }
                x5Var2.I.f25961g.setText(e2().i());
                x5 x5Var3 = this.G;
                if (x5Var3 == null) {
                    cm.l.v("cBinding");
                    x5Var3 = null;
                }
                x5Var3.G.setText("CL No. : " + this.V);
                Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
                cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
                L2((FetchLlDetails) serializableExtra);
            } catch (Exception unused) {
            }
        }
        String format = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        cm.l.e(format, "format(...)");
        J2(format);
        x5 x5Var4 = this.G;
        if (x5Var4 == null) {
            cm.l.v("cBinding");
            x5Var4 = null;
        }
        x5Var4.C.setText(Y1());
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

    private final void h2() {
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

    private final void i2() {
        x5 x5Var = this.G;
        x5 x5Var2 = null;
        if (x5Var == null) {
            cm.l.v("cBinding");
            x5Var = null;
        }
        x5Var.P.setOnClickListener(new e2(this));
        x5 x5Var3 = this.G;
        if (x5Var3 == null) {
            cm.l.v("cBinding");
            x5Var3 = null;
        }
        x5Var3.Q.setOnClickListener(new p1(this));
        x5 x5Var4 = this.G;
        if (x5Var4 == null) {
            cm.l.v("cBinding");
            x5Var4 = null;
        }
        x5Var4.U.setOnClickListener(new q1(this));
        x5 x5Var5 = this.G;
        if (x5Var5 == null) {
            cm.l.v("cBinding");
            x5Var5 = null;
        }
        x5Var5.V.setOnClickListener(new r1(this));
        x5 x5Var6 = this.G;
        if (x5Var6 == null) {
            cm.l.v("cBinding");
            x5Var6 = null;
        }
        x5Var6.f29326w0.setOnClickListener(new s1(this));
        x5 x5Var7 = this.G;
        if (x5Var7 == null) {
            cm.l.v("cBinding");
            x5Var7 = null;
        }
        x5Var7.I.f25959e.setOnClickListener(new t1(this));
        x5 x5Var8 = this.G;
        if (x5Var8 == null) {
            cm.l.v("cBinding");
            x5Var8 = null;
        }
        x5Var8.I.f25957c.setOnClickListener(new u1(this));
        x5 x5Var9 = this.G;
        if (x5Var9 == null) {
            cm.l.v("cBinding");
            x5Var9 = null;
        }
        x5Var9.X.setOnClickListener(new v1(this));
        x5 x5Var10 = this.G;
        if (x5Var10 == null) {
            cm.l.v("cBinding");
            x5Var10 = null;
        }
        x5Var10.f29325w.setOnClickListener(new w1(this));
        x5 x5Var11 = this.G;
        if (x5Var11 == null) {
            cm.l.v("cBinding");
            x5Var11 = null;
        }
        x5Var11.f29327x.setOnClickListener(new x1(this));
        x5 x5Var12 = this.G;
        if (x5Var12 == null) {
            cm.l.v("cBinding");
            x5Var12 = null;
        }
        x5Var12.f29328y.setOnClickListener(new f2(this));
        x5 x5Var13 = this.G;
        if (x5Var13 == null) {
            cm.l.v("cBinding");
            x5Var13 = null;
        }
        x5Var13.f29329z.setOnClickListener(new g2(this));
        x5 x5Var14 = this.G;
        if (x5Var14 == null) {
            cm.l.v("cBinding");
            x5Var14 = null;
        }
        x5Var14.B.setOnClickListener(new h2(this));
        x5 x5Var15 = this.G;
        if (x5Var15 == null) {
            cm.l.v("cBinding");
            x5Var15 = null;
        }
        x5Var15.A.setOnClickListener(new i2(this));
        x5 x5Var16 = this.G;
        if (x5Var16 == null) {
            cm.l.v("cBinding");
            x5Var16 = null;
        }
        x5Var16.Y.setOnClickListener(new j2(this));
        x5 x5Var17 = this.G;
        if (x5Var17 == null) {
            cm.l.v("cBinding");
        } else {
            x5Var2 = x5Var17;
        }
        x5Var2.Z.setOnClickListener(new o1(this));
    }

    /* access modifiers changed from: private */
    public static final void j2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        x5 x5Var = llPhotoSignature.G;
        String str = null;
        if (x5Var == null) {
            cm.l.v("cBinding");
            x5Var = null;
        }
        x5Var.X.c(true);
        ak.a aVar = llPhotoSignature.H;
        if (aVar == null) {
            cm.l.v("viewModel");
            aVar = null;
        }
        String str2 = llPhotoSignature.K;
        if (str2 == null) {
            cm.l.v("mApplNo");
            str2 = null;
        }
        String str3 = llPhotoSignature.L;
        if (str3 == null) {
            cm.l.v("mApplDob");
        } else {
            str = str3;
        }
        aVar.h(str2, str);
    }

    /* access modifiers changed from: private */
    public static final void k2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        x5 x5Var = llPhotoSignature.G;
        x5 x5Var2 = null;
        if (x5Var == null) {
            cm.l.v("cBinding");
            x5Var = null;
        }
        x5Var.f29325w.setVisibility(8);
        x5 x5Var3 = llPhotoSignature.G;
        if (x5Var3 == null) {
            cm.l.v("cBinding");
            x5Var3 = null;
        }
        x5Var3.f29327x.setVisibility(0);
        x5 x5Var4 = llPhotoSignature.G;
        if (x5Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x5Var2 = x5Var4;
        }
        x5Var2.J.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void l2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        x5 x5Var = llPhotoSignature.G;
        x5 x5Var2 = null;
        if (x5Var == null) {
            cm.l.v("cBinding");
            x5Var = null;
        }
        x5Var.f29327x.setVisibility(8);
        x5 x5Var3 = llPhotoSignature.G;
        if (x5Var3 == null) {
            cm.l.v("cBinding");
            x5Var3 = null;
        }
        x5Var3.f29325w.setVisibility(0);
        x5 x5Var4 = llPhotoSignature.G;
        if (x5Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x5Var2 = x5Var4;
        }
        x5Var2.J.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void m2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        x5 x5Var = llPhotoSignature.G;
        x5 x5Var2 = null;
        if (x5Var == null) {
            cm.l.v("cBinding");
            x5Var = null;
        }
        x5Var.f29328y.setVisibility(8);
        x5 x5Var3 = llPhotoSignature.G;
        if (x5Var3 == null) {
            cm.l.v("cBinding");
            x5Var3 = null;
        }
        x5Var3.f29329z.setVisibility(0);
        x5 x5Var4 = llPhotoSignature.G;
        if (x5Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x5Var2 = x5Var4;
        }
        x5Var2.K.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void n2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        x5 x5Var = llPhotoSignature.G;
        x5 x5Var2 = null;
        if (x5Var == null) {
            cm.l.v("cBinding");
            x5Var = null;
        }
        x5Var.f29329z.setVisibility(8);
        x5 x5Var3 = llPhotoSignature.G;
        if (x5Var3 == null) {
            cm.l.v("cBinding");
            x5Var3 = null;
        }
        x5Var3.f29328y.setVisibility(0);
        x5 x5Var4 = llPhotoSignature.G;
        if (x5Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x5Var2 = x5Var4;
        }
        x5Var2.K.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void o2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        x5 x5Var = llPhotoSignature.G;
        x5 x5Var2 = null;
        if (x5Var == null) {
            cm.l.v("cBinding");
            x5Var = null;
        }
        x5Var.B.setVisibility(8);
        x5 x5Var3 = llPhotoSignature.G;
        if (x5Var3 == null) {
            cm.l.v("cBinding");
            x5Var3 = null;
        }
        x5Var3.A.setVisibility(0);
        x5 x5Var4 = llPhotoSignature.G;
        if (x5Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x5Var2 = x5Var4;
        }
        x5Var2.L.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void p2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        x5 x5Var = llPhotoSignature.G;
        x5 x5Var2 = null;
        if (x5Var == null) {
            cm.l.v("cBinding");
            x5Var = null;
        }
        x5Var.A.setVisibility(8);
        x5 x5Var3 = llPhotoSignature.G;
        if (x5Var3 == null) {
            cm.l.v("cBinding");
            x5Var3 = null;
        }
        x5Var3.B.setVisibility(0);
        x5 x5Var4 = llPhotoSignature.G;
        if (x5Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x5Var2 = x5Var4;
        }
        x5Var2.L.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void q2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        x5 x5Var = llPhotoSignature.G;
        x5 x5Var2 = null;
        if (x5Var == null) {
            cm.l.v("cBinding");
            x5Var = null;
        }
        x5Var.Y.setVisibility(8);
        x5 x5Var3 = llPhotoSignature.G;
        if (x5Var3 == null) {
            cm.l.v("cBinding");
            x5Var3 = null;
        }
        x5Var3.Z.setVisibility(0);
        x5 x5Var4 = llPhotoSignature.G;
        if (x5Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x5Var2 = x5Var4;
        }
        x5Var2.M.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void r2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        x5 x5Var = llPhotoSignature.G;
        x5 x5Var2 = null;
        if (x5Var == null) {
            cm.l.v("cBinding");
            x5Var = null;
        }
        x5Var.Z.setVisibility(8);
        x5 x5Var3 = llPhotoSignature.G;
        if (x5Var3 == null) {
            cm.l.v("cBinding");
            x5Var3 = null;
        }
        x5Var3.Y.setVisibility(0);
        x5 x5Var4 = llPhotoSignature.G;
        if (x5Var4 == null) {
            cm.l.v("cBinding");
        } else {
            x5Var2 = x5Var4;
        }
        x5Var2.M.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void s2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        llPhotoSignature.I = "0";
        llPhotoSignature.f2();
    }

    /* access modifiers changed from: private */
    public static final void t2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        llPhotoSignature.I = "0";
        llPhotoSignature.W1();
    }

    /* access modifiers changed from: private */
    public static final void u2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        llPhotoSignature.I = "1";
        llPhotoSignature.f2();
    }

    /* access modifiers changed from: private */
    public static final void v2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        llPhotoSignature.I = "1";
        llPhotoSignature.W1();
    }

    /* access modifiers changed from: private */
    public static final void w2(LlPhotoSignature llPhotoSignature, View view) {
        ak.a aVar;
        String str;
        String str2;
        String str3;
        cm.l.f(llPhotoSignature, "this$0");
        if (!com.nic.mparivahan.a.f9624a.a(llPhotoSignature)) {
            Toast.makeText(llPhotoSignature.getApplicationContext(), llPhotoSignature.b2().b("label_log_check_internet", llPhotoSignature.getString(R.string.kindly_check_your_internet_connection)), 0).show();
        } else if (llPhotoSignature.J == -1 || llPhotoSignature.T.length() <= 0 || llPhotoSignature.U.length() <= 0) {
            llPhotoSignature.F2(llPhotoSignature.b2().b("photo_signature", ""));
        } else {
            x5 x5Var = llPhotoSignature.G;
            if (x5Var == null) {
                cm.l.v("cBinding");
                x5Var = null;
            }
            x5Var.f29326w0.c(true);
            ak.a aVar2 = llPhotoSignature.H;
            if (aVar2 == null) {
                cm.l.v("viewModel");
                aVar = null;
            } else {
                aVar = aVar2;
            }
            String str4 = llPhotoSignature.K;
            if (str4 == null) {
                cm.l.v("mApplNo");
                str = null;
            } else {
                str = str4;
            }
            String str5 = llPhotoSignature.L;
            if (str5 == null) {
                cm.l.v("mApplDob");
                str2 = null;
            } else {
                str2 = str5;
            }
            String str6 = llPhotoSignature.Q;
            if (str6 == null) {
                cm.l.v("stateCode");
                str3 = null;
            } else {
                str3 = str6;
            }
            aVar.n(str, str2, str3, llPhotoSignature.T, llPhotoSignature.U, llPhotoSignature.J);
        }
    }

    /* access modifiers changed from: private */
    public static final void x2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        llPhotoSignature.finish();
    }

    /* access modifiers changed from: private */
    public static final void y2(LlPhotoSignature llPhotoSignature, View view) {
        cm.l.f(llPhotoSignature, "this$0");
        Intent intent = new Intent(llPhotoSignature, DashBoard.class);
        intent.setFlags(67108864);
        llPhotoSignature.startActivity(intent);
        llPhotoSignature.finish();
    }

    private final void z2() {
        x5 x5Var = this.G;
        x5 x5Var2 = null;
        if (x5Var == null) {
            cm.l.v("cBinding");
            x5Var = null;
        }
        x5Var.N.f29580g.setText(e2().i());
        x5 x5Var3 = this.G;
        if (x5Var3 == null) {
            cm.l.v("cBinding");
            x5Var3 = null;
        }
        TextView textView = x5Var3.N.f29581h;
        x5 x5Var4 = this.G;
        if (x5Var4 == null) {
            cm.l.v("cBinding");
            x5Var4 = null;
        }
        textView.setPaintFlags(x5Var4.N.f29581h.getPaintFlags() | 8);
        x5 x5Var5 = this.G;
        if (x5Var5 == null) {
            cm.l.v("cBinding");
            x5Var5 = null;
        }
        TextView textView2 = x5Var5.N.f29581h;
        String str = this.V;
        cm.l.c(str);
        textView2.setText(q.B0(str).toString());
        x5 x5Var6 = this.G;
        if (x5Var6 == null) {
            cm.l.v("cBinding");
        } else {
            x5Var2 = x5Var6;
        }
        x5Var2.N.f29581h.setOnClickListener(new a2(this));
    }

    public final void B2(Integer num) {
        if (num != null && num.intValue() == 135) {
            T2();
        } else if (num != null && num.intValue() == 134) {
            R2();
        } else if (num != null && num.intValue() == 123) {
            Q2();
        } else if (num != null && num.intValue() == 371) {
            U2();
        } else if (num != null && num.intValue() == 455) {
            D2(b2().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void H2(Context context, String str) {
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
        textView.setOnClickListener(new b2(dialog));
        dialog.show();
    }

    public final void J2(String str) {
        cm.l.f(str, "<set-?>");
        this.f9094a0 = str;
    }

    public final void K2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f9096c0 = cVar;
    }

    public final void L2(FetchLlDetails fetchLlDetails) {
        cm.l.f(fetchLlDetails, "<set-?>");
        this.f9099f0 = fetchLlDetails;
    }

    public final void M2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f9095b0 = gVar;
    }

    public final void O2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f9097d0 = fVar;
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
        String str = this.f9094a0;
        if (str != null) {
            return str;
        }
        cm.l.v("app_date");
        return null;
    }

    public final d.c a2() {
        return this.f9101h0;
    }

    public final ld.c b2() {
        ld.c cVar = this.f9096c0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final FetchLlDetails c2() {
        FetchLlDetails fetchLlDetails = this.f9099f0;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        cm.l.v("llDetails");
        return null;
    }

    public final ld.g d2() {
        ld.g gVar = this.f9095b0;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mSessionmanger");
        return null;
    }

    public final ld.f e2() {
        ld.f fVar = this.f9097d0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_ll_photo_signature);
        cm.l.e(f10, "setContentView(...)");
        this.G = (x5) f10;
        M2(new ld.g(this));
        K2(new ld.c(this));
        O2(new ld.f(this));
        e.a aVar = v9.e.f17509a;
        x5 x5Var = this.G;
        x5 x5Var2 = null;
        if (x5Var == null) {
            cm.l.v("cBinding");
            x5Var = null;
        }
        aVar.g1(this, x5Var);
        g2();
        h2();
        i2();
        z2();
        x5 x5Var3 = this.G;
        if (x5Var3 == null) {
            cm.l.v("cBinding");
        } else {
            x5Var2 = x5Var3;
        }
        x5Var2.N.f29577d.setOnClickListener(new n1(this));
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
