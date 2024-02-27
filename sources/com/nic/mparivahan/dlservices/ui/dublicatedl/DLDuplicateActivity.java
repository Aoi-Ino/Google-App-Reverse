package com.nic.mparivahan.dlservices.ui.dublicatedl;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowMetrics;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import cm.l;
import cm.m;
import cm.u;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineReq;
import com.nic.mparivahan.DlCombineServices.CombineServiceInterface;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.DlLog.DlLogCapture;
import com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddInterface;
import com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel.DupChangeAddResponse;
import com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel.ResultX;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
import com.nic.mparivahan.dlservices.data.model.DlSubmitResult;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import com.nic.mparivahan.dlservices.data.model.ServicesRequested;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName;
import com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity;
import com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;
import com.nic.mparivahan.dlservices.ui.hillService.HillReligion;
import com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity;
import com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kk.e;
import ni.d4;
import pl.x;
import qj.i;
import qj.j;
import qj.k;
import qj.n;
import qj.o;
import v9.e;

public final class DLDuplicateActivity extends oi.g {
    private String A0 = "";
    private String B0 = "";
    private String C0 = "";
    private String D0 = "";
    private String E0 = "N";
    public Context F0;
    public ArrayList G0;
    public ArrayList H0;
    private boolean I0;
    /* access modifiers changed from: private */
    public d4 J;
    private String J0 = "";
    /* access modifiers changed from: private */
    public ek.a K;
    private int K0;
    public DldetobjX L;
    private int L0;
    private HashMap M = new HashMap();
    private ab.d M0;
    /* access modifiers changed from: private */
    public List N;
    public CombineServiceInterface N0;
    /* access modifiers changed from: private */
    public String O = "Y";
    public ld.f P;
    private String Q;
    private String R;
    private String S;
    private String T;
    private String U = "";
    private String V = "";
    private String W = "";
    private String X = "";
    private String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    public pi.d f22105a0;

    /* renamed from: b0  reason: collision with root package name */
    public DupChangeAddInterface f22106b0;

    /* renamed from: c0  reason: collision with root package name */
    private String f22107c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    private String f22108d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private String f22109e0 = "";

    /* renamed from: f0  reason: collision with root package name */
    private String f22110f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    private String f22111g0 = "";

    /* renamed from: h0  reason: collision with root package name */
    private String f22112h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    private String f22113i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    private String f22114j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private String f22115k0 = "";

    /* renamed from: l0  reason: collision with root package name */
    private String f22116l0 = "";

    /* renamed from: m0  reason: collision with root package name */
    private String f22117m0 = "";

    /* renamed from: n0  reason: collision with root package name */
    private String f22118n0 = "";

    /* renamed from: o0  reason: collision with root package name */
    private String f22119o0 = "";

    /* renamed from: p0  reason: collision with root package name */
    private String f22120p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    private String f22121q0 = "";

    /* renamed from: r0  reason: collision with root package name */
    private String f22122r0 = "";

    /* renamed from: s0  reason: collision with root package name */
    private String f22123s0 = "0";

    /* renamed from: t0  reason: collision with root package name */
    public ld.g f22124t0;

    /* renamed from: u0  reason: collision with root package name */
    public ld.c f22125u0;

    /* renamed from: v0  reason: collision with root package name */
    private String f22126v0 = "0";

    /* renamed from: w0  reason: collision with root package name */
    private String f22127w0 = "N";

    /* renamed from: x0  reason: collision with root package name */
    private String f22128x0 = "N";

    /* renamed from: y0  reason: collision with root package name */
    private String f22129y0 = "";

    /* renamed from: z0  reason: collision with root package name */
    private String f22130z0 = "";

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDuplicateActivity f22131e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f22132f;

        a(DLDuplicateActivity dLDuplicateActivity, u uVar) {
            this.f22131e = dLDuplicateActivity;
            this.f22132f = uVar;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            this.f22131e.K2(((AppCatPojo) ((ArrayList) this.f22132f.f20234e).get(i10)).getAppCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDuplicateActivity f22133e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DLDuplicateActivity dLDuplicateActivity) {
            super(1);
            this.f22133e = dLDuplicateActivity;
        }

        public final void b(String str) {
            String obj;
            ek.a aVar;
            String V1;
            String W1;
            String Y1;
            String obj2;
            String O1;
            String str2;
            ek.a aVar2;
            String str3 = str;
            l.f(str3, "it");
            if (p.o(str3, "yes", true)) {
                d4 d4Var = null;
                if (l.a(this.f22133e.O, "Y")) {
                    if (com.nic.mparivahan.a.f9624a.a(this.f22133e)) {
                        d4 L1 = this.f22133e.J;
                        if (L1 == null) {
                            l.v("mBinding");
                            L1 = null;
                        }
                        L1.G.c(true);
                        d4 L12 = this.f22133e.J;
                        if (L12 == null) {
                            l.v("mBinding");
                            L12 = null;
                        }
                        obj = L12.E.getContentDescription().toString();
                        d4 L13 = this.f22133e.J;
                        if (L13 == null) {
                            l.v("mBinding");
                            L13 = null;
                        }
                        L13.G.c(true);
                        ek.a N1 = this.f22133e.K;
                        if (N1 == null) {
                            l.v("viewModel");
                            aVar = null;
                        } else {
                            aVar = N1;
                        }
                        V1 = this.f22133e.V1();
                        W1 = this.f22133e.W1();
                        Y1 = this.f22133e.Y1();
                        d4 L14 = this.f22133e.J;
                        if (L14 == null) {
                            l.v("mBinding");
                            L14 = null;
                        }
                        obj2 = L14.E.getText().toString();
                        O1 = this.f22133e.O;
                        d4 L15 = this.f22133e.J;
                        if (L15 == null) {
                            l.v("mBinding");
                        } else {
                            d4Var = L15;
                        }
                        str2 = String.valueOf(d4Var.N.getText());
                    }
                    Toast.makeText(this.f22133e.getApplicationContext(), this.f22133e.X1().b("service_is_not_present", this.f22133e.getString(R.string.unable_to_get_details)), 0).show();
                    return;
                }
                if (com.nic.mparivahan.a.f9624a.a(this.f22133e)) {
                    d4 L16 = this.f22133e.J;
                    if (L16 == null) {
                        l.v("mBinding");
                        L16 = null;
                    }
                    L16.G.c(true);
                    d4 L17 = this.f22133e.J;
                    if (L17 == null) {
                        l.v("mBinding");
                        L17 = null;
                    }
                    obj = L17.E.getContentDescription().toString();
                    d4 L18 = this.f22133e.J;
                    if (L18 == null) {
                        l.v("mBinding");
                        L18 = null;
                    }
                    L18.G.c(true);
                    ek.a N12 = this.f22133e.K;
                    if (N12 == null) {
                        l.v("viewModel");
                        aVar2 = null;
                    } else {
                        aVar2 = N12;
                    }
                    V1 = this.f22133e.V1();
                    W1 = this.f22133e.W1();
                    Y1 = this.f22133e.Y1();
                    d4 L19 = this.f22133e.J;
                    if (L19 == null) {
                        l.v("mBinding");
                    } else {
                        d4Var = L19;
                    }
                    obj2 = d4Var.E.getText().toString();
                    O1 = this.f22133e.O;
                    str2 = " ";
                }
                Toast.makeText(this.f22133e.getApplicationContext(), this.f22133e.X1().b("service_is_not_present", this.f22133e.getString(R.string.unable_to_get_details)), 0).show();
                return;
                String h22 = this.f22133e.h2();
                l.c(h22);
                aVar.h(V1, W1, Y1, obj, obj2, O1, str2, h22, this.f22133e.k2().f(), this.f22133e.k2().g(), this.f22133e.k2().e(), this.f22133e.k2().h());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDuplicateActivity f22134e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DLDuplicateActivity dLDuplicateActivity) {
            super(1);
            this.f22134e = dLDuplicateActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x00c3 A[Catch:{ Exception -> 0x013b }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00dd A[Catch:{ Exception -> 0x013b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel.DupChangeAddResponse r29) {
            /*
                r28 = this;
                r1 = r28
                java.lang.String r2 = "service_is_not_present"
                java.lang.String r3 = "mBinding"
                r4 = 2132019337(0x7f140889, float:1.9677006E38)
                r6 = 0
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r0 = r1.f22134e     // Catch:{ Exception -> 0x013b }
                ni.d4 r0 = r0.J     // Catch:{ Exception -> 0x013b }
                if (r0 != 0) goto L_0x0016
                cm.l.v(r3)     // Catch:{ Exception -> 0x013b }
                r0 = 0
            L_0x0016:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.G     // Catch:{ Exception -> 0x013b }
                r0.c(r6)     // Catch:{ Exception -> 0x013b }
                com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel.Result r0 = r29.getResult()     // Catch:{ Exception -> 0x013b }
                java.lang.String r0 = r0.getStatus_code()     // Catch:{ Exception -> 0x013b }
                java.lang.String r7 = "00"
                r8 = 1
                boolean r0 = km.p.o(r0, r7, r8)     // Catch:{ Exception -> 0x013b }
                if (r0 == 0) goto L_0x010b
                com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r7 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x013b }
                r7.<init>()     // Catch:{ Exception -> 0x013b }
                com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel.Result r0 = r29.getResult()     // Catch:{ Exception -> 0x013b }
                java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x013b }
                java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x013b }
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r15 = r1.f22134e     // Catch:{ Exception -> 0x013b }
                r13 = r0
                com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel.ResultX r13 = (com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel.ResultX) r13     // Catch:{ Exception -> 0x013b }
                com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r8 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r10 = "1234"
                java.lang.String r11 = "S"
                java.lang.String r12 = r15.T1()     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r0 = r13.getApplicationNo()     // Catch:{ Exception -> 0x00a6 }
                long r16 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00a6 }
                ld.g r0 = r15.g2()     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r0 = r0.k()     // Catch:{ Exception -> 0x00a6 }
                int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r18 = r13.getDateofBirth()     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r19 = r13.getDlno()     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r20 = "N"
                java.lang.String r21 = "N"
                java.lang.String r22 = r13.getApplicantGender()     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r23 = r15.h2()     // Catch:{ Exception -> 0x00a6 }
                cm.l.c(r23)     // Catch:{ Exception -> 0x00a6 }
                r24 = 0
                java.lang.String r25 = r15.j2()     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r26 = r15.Y1()     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r27 = r15.b2()     // Catch:{ Exception -> 0x00a6 }
                r9 = r15
                r5 = r13
                r13 = r16
                r29 = r15
                r15 = r0
                r16 = r18
                r17 = r19
                r18 = r20
                r19 = r21
                r20 = r22
                r21 = r23
                r22 = r24
                r23 = r25
                r24 = r26
                r25 = r27
                r8.a(r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x00a4 }
                goto L_0x00b3
            L_0x00a4:
                r0 = move-exception
                goto L_0x00aa
            L_0x00a6:
                r0 = move-exception
                r5 = r13
                r29 = r15
            L_0x00aa:
                java.lang.String r8 = "valiii"
                java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ Exception -> 0x013b }
                android.util.Log.d(r8, r0)     // Catch:{ Exception -> 0x013b }
            L_0x00b3:
                ld.f r0 = r29.k2()     // Catch:{ Exception -> 0x013b }
                java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x013b }
                java.lang.String r8 = "950"
                boolean r0 = cm.l.a(r0, r8)     // Catch:{ Exception -> 0x013b }
                if (r0 != 0) goto L_0x00dd
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x013b }
                r0.<init>()     // Catch:{ Exception -> 0x013b }
                r8 = r29
                r8.T2(r0)     // Catch:{ Exception -> 0x013b }
                java.util.ArrayList r0 = r8.i2()     // Catch:{ Exception -> 0x013b }
                ld.f r9 = r8.k2()     // Catch:{ Exception -> 0x013b }
                java.lang.String r9 = r9.i()     // Catch:{ Exception -> 0x013b }
                r0.add(r9)     // Catch:{ Exception -> 0x013b }
                goto L_0x00df
            L_0x00dd:
                r8 = r29
            L_0x00df:
                com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r9 = r8.S1(r5)     // Catch:{ Exception -> 0x013b }
                java.lang.String r10 = r8.Y1()     // Catch:{ Exception -> 0x013b }
                com.nic.mparivahan.Dl.Model.DldetobjX r11 = r8.U1()     // Catch:{ Exception -> 0x013b }
                java.lang.String r12 = r8.V1()     // Catch:{ Exception -> 0x013b }
                java.lang.String r13 = r8.W1()     // Catch:{ Exception -> 0x013b }
                java.lang.String r14 = r8.h2()     // Catch:{ Exception -> 0x013b }
                java.lang.String r15 = r8.Z1()     // Catch:{ Exception -> 0x013b }
                java.lang.String r16 = r8.a2()     // Catch:{ Exception -> 0x013b }
                java.lang.String r17 = r8.b2()     // Catch:{ Exception -> 0x013b }
                java.util.ArrayList r18 = r8.i2()     // Catch:{ Exception -> 0x013b }
                r7.E2(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x013b }
                goto L_0x0161
            L_0x010b:
                com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel.Result r0 = r29.getResult()     // Catch:{ Exception -> 0x013b }
                java.lang.String r0 = r0.getReqStatus()     // Catch:{ Exception -> 0x013b }
                if (r0 == 0) goto L_0x012a
                int r0 = r0.length()     // Catch:{ Exception -> 0x013b }
                if (r0 != 0) goto L_0x011c
                goto L_0x012a
            L_0x011c:
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r0 = r1.f22134e     // Catch:{ Exception -> 0x013b }
                com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel.Result r5 = r29.getResult()     // Catch:{ Exception -> 0x013b }
                java.lang.String r5 = r5.getReqStatus()     // Catch:{ Exception -> 0x013b }
            L_0x0126:
                r0.I2(r5)     // Catch:{ Exception -> 0x013b }
                goto L_0x0161
            L_0x012a:
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r0 = r1.f22134e     // Catch:{ Exception -> 0x013b }
                ld.c r5 = r0.X1()     // Catch:{ Exception -> 0x013b }
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r7 = r1.f22134e     // Catch:{ Exception -> 0x013b }
                java.lang.String r7 = r7.getString(r4)     // Catch:{ Exception -> 0x013b }
                java.lang.String r5 = r5.b(r2, r7)     // Catch:{ Exception -> 0x013b }
                goto L_0x0126
            L_0x013b:
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r0 = r1.f22134e
                ni.d4 r0 = r0.J
                if (r0 != 0) goto L_0x0148
                cm.l.v(r3)
                r5 = 0
                goto L_0x0149
            L_0x0148:
                r5 = r0
            L_0x0149:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r5.G
                r0.c(r6)
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r0 = r1.f22134e
                ld.c r3 = r0.X1()
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r5 = r1.f22134e
                java.lang.String r4 = r5.getString(r4)
                java.lang.String r2 = r3.b(r2, r4)
                r0.I2(r2)
            L_0x0161:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity.c.b(com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel.DupChangeAddResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DupChangeAddResponse) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDuplicateActivity f22135e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DLDuplicateActivity dLDuplicateActivity) {
            super(1);
            this.f22135e = dLDuplicateActivity;
        }

        public final void b(GetReasonsTransWiseResponse getReasonsTransWiseResponse) {
            try {
                if (p.p(getReasonsTransWiseResponse.getStatusCode(), "00", false, 2, (Object) null)) {
                    this.f22135e.N = getReasonsTransWiseResponse.getReasonsMaster();
                    return;
                }
                Log.d("response_dl", String.valueOf(getReasonsTransWiseResponse.getStatusDesc()));
                this.f22135e.I2(getReasonsTransWiseResponse.getStatusDesc());
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetReasonsTransWiseResponse) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDuplicateActivity f22136e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DLDuplicateActivity dLDuplicateActivity) {
            super(1);
            this.f22136e = dLDuplicateActivity;
        }

        public final void b(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) {
            DLDuplicateActivity dLDuplicateActivity;
            String b10;
            List<ResultItemSubmit> result;
            d4 d4Var = null;
            try {
                d4 L1 = this.f22136e.J;
                if (L1 == null) {
                    l.v("mBinding");
                    L1 = null;
                }
                L1.G.c(false);
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (p.p(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, (Object) null)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    if (dlSubmitresult2 != null && (result = dlSubmitresult2.getResult()) != null && (!result.isEmpty())) {
                        DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                        ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                        if (resultItemSubmit != null) {
                            DLDuplicateActivity dLDuplicateActivity2 = this.f22136e;
                            try {
                                DlLogCapture.a aVar = DlLogCapture.f21655k;
                                String applicationDate = resultItemSubmit.getApplicationDate();
                                String applicationNo = resultItemSubmit.getApplicationNo();
                                l.c(applicationNo);
                                long parseLong = Long.parseLong(applicationNo);
                                int parseInt = Integer.parseInt(dLDuplicateActivity2.g2().k());
                                String dateofBirth = resultItemSubmit.getDateofBirth();
                                String dlno = resultItemSubmit.getDlno();
                                l.c(dlno);
                                String applicantGender = resultItemSubmit.getApplicantGender();
                                String h22 = dLDuplicateActivity2.h2();
                                l.c(h22);
                                aVar.a(dLDuplicateActivity2, "1234", "S", applicationDate, parseLong, parseInt, dateofBirth, dlno, "N", "N", applicantGender, h22, false, dLDuplicateActivity2.j2(), dLDuplicateActivity2.Y1(), dLDuplicateActivity2.b2());
                            } catch (Exception e10) {
                                Log.d("valiii", e10.getLocalizedMessage());
                            }
                            if (!l.a(dLDuplicateActivity2.k2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                                dLDuplicateActivity2.T2(new ArrayList());
                                dLDuplicateActivity2.i2().add(dLDuplicateActivity2.k2().i());
                            }
                            dLServiceAcknowlegementActivity.E2(dLDuplicateActivity2, resultItemSubmit, dLDuplicateActivity2.Y1(), dLDuplicateActivity2.U1(), dLDuplicateActivity2.V1(), dLDuplicateActivity2.W1(), dLDuplicateActivity2.h2(), dLDuplicateActivity2.Z1(), dLDuplicateActivity2.a2(), dLDuplicateActivity2.b2(), dLDuplicateActivity2.i2());
                            return;
                        }
                        return;
                    }
                    return;
                }
                DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                String reqStatus = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                if (reqStatus != null) {
                    if (reqStatus.length() != 0) {
                        dLDuplicateActivity = this.f22136e;
                        DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        b10 = dlSubmitresult4 != null ? dlSubmitresult4.getReqStatus() : null;
                        l.c(b10);
                        dLDuplicateActivity.I2(b10);
                    }
                }
                dLDuplicateActivity = this.f22136e;
                b10 = dLDuplicateActivity.X1().b("service_is_not_present", this.f22136e.getString(R.string.unable_to_get_details));
                dLDuplicateActivity.I2(b10);
            } catch (Exception unused) {
                d4 L12 = this.f22136e.J;
                if (L12 == null) {
                    l.v("mBinding");
                } else {
                    d4Var = L12;
                }
                d4Var.G.c(false);
                DLDuplicateActivity dLDuplicateActivity3 = this.f22136e;
                dLDuplicateActivity3.I2(dLDuplicateActivity3.X1().b("service_is_not_present", this.f22136e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetAckDetForGivenDLNumberResponse) obj);
            return x.f30437a;
        }
    }

    public static final class f implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DLDuplicateActivity f22137a;

        f(DLDuplicateActivity dLDuplicateActivity) {
            this.f22137a = dLDuplicateActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
            if (r5 == null) goto L_0x0074;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
            r1 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
            if (r5 == null) goto L_0x0074;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r6 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem) r0.get(r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r5, int r6) {
            /*
                r4 = this;
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r0 = r4.f22137a
                java.util.List r0 = r0.N
                r1 = 0
                if (r0 == 0) goto L_0x0016
                java.lang.Object r6 = r0.get(r6)
                com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem r6 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem) r6
                if (r6 == 0) goto L_0x0016
                java.lang.Integer r6 = r6.getReasonCode()
                goto L_0x0017
            L_0x0016:
                r6 = r1
            L_0x0017:
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r0 = r4.f22137a
                ni.d4 r0 = r0.J
                java.lang.String r2 = "mBinding"
                if (r0 != 0) goto L_0x0025
                cm.l.v(r2)
                r0 = r1
            L_0x0025:
                android.widget.EditText r0 = r0.E
                r0.setText(r5)
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r5 = r4.f22137a
                ni.d4 r5 = r5.J
                if (r5 != 0) goto L_0x0036
                cm.l.v(r2)
                r5 = r1
            L_0x0036:
                android.widget.EditText r5 = r5.E
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = ""
                r0.append(r3)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.setContentDescription(r6)
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r5 = r4.f22137a
                ni.d4 r5 = r5.J
                if (r5 != 0) goto L_0x0058
                cm.l.v(r2)
                r5 = r1
            L_0x0058:
                android.widget.EditText r5 = r5.E
                android.text.Editable r5 = r5.getText()
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "Miscellaneous"
                r0 = 1
                boolean r5 = km.p.o(r5, r6, r0)
                r6 = 0
                if (r5 == 0) goto L_0x007f
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r5 = r4.f22137a
                ni.d4 r5 = r5.J
                if (r5 != 0) goto L_0x0078
            L_0x0074:
                cm.l.v(r2)
                goto L_0x0079
            L_0x0078:
                r1 = r5
            L_0x0079:
                android.widget.LinearLayout r5 = r1.C
            L_0x007b:
                r5.setVisibility(r6)
                goto L_0x00b8
            L_0x007f:
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r5 = r4.f22137a
                ni.d4 r5 = r5.J
                if (r5 != 0) goto L_0x008b
                cm.l.v(r2)
                r5 = r1
            L_0x008b:
                android.widget.EditText r5 = r5.E
                android.text.Editable r5 = r5.getText()
                java.lang.String r5 = r5.toString()
                java.lang.String r3 = "Loss of DL/PSV Badge"
                boolean r5 = km.p.o(r5, r3, r0)
                if (r5 == 0) goto L_0x00a6
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r5 = r4.f22137a
                ni.d4 r5 = r5.J
                if (r5 != 0) goto L_0x0078
                goto L_0x0074
            L_0x00a6:
                com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r5 = r4.f22137a
                ni.d4 r5 = r5.J
                if (r5 != 0) goto L_0x00b2
                cm.l.v(r2)
                goto L_0x00b3
            L_0x00b2:
                r1 = r5
            L_0x00b3:
                android.widget.LinearLayout r5 = r1.C
                r6 = 8
                goto L_0x007b
            L_0x00b8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity.f.a(java.lang.String, int):void");
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final g f22138e = new g();

        g() {
            super(1);
        }

        public final void b(String str) {
            l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f22139a;

        h(bm.l lVar) {
            l.f(lVar, "function");
            this.f22139a = lVar;
        }

        public final pl.c a() {
            return this.f22139a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22139a.invoke(obj);
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
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01aa, code lost:
        if (r14.q(java.lang.String.valueOf(r0.N.getText())) == false) goto L_0x0100;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A2(com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r13, android.view.View r14) {
        /*
            java.lang.String r14 = "this$0"
            cm.l.f(r13, r14)
            ld.f r14 = r13.k2()
            java.lang.String r14 = r14.b()
            java.lang.String r0 = "950"
            boolean r14 = cm.l.a(r14, r0)
            if (r14 == 0) goto L_0x001a
            r13.B2()
            goto L_0x01ae
        L_0x001a:
            ni.d4 r14 = r13.J
            r0 = 0
            java.lang.String r1 = "mBinding"
            if (r14 != 0) goto L_0x0025
            cm.l.v(r1)
            r14 = r0
        L_0x0025:
            android.widget.EditText r14 = r14.E
            android.text.Editable r14 = r14.getText()
            java.lang.String r2 = "getText(...)"
            cm.l.e(r14, r2)
            int r14 = r14.length()
            if (r14 != 0) goto L_0x0051
            ld.c r14 = r13.X1()
            r0 = 2132019064(0x7f140778, float:1.9676452E38)
            java.lang.String r0 = r13.getString(r0)
            java.lang.String r1 = "label_select_reason"
            java.lang.String r14 = r14.b(r1, r0)
            r0 = 1
            android.widget.Toast r13 = android.widget.Toast.makeText(r13, r14, r0)
            r13.show()
            goto L_0x01ae
        L_0x0051:
            ni.d4 r14 = r13.J
            if (r14 != 0) goto L_0x0059
            cm.l.v(r1)
            r14 = r0
        L_0x0059:
            android.widget.LinearLayout r14 = r14.C
            int r14 = r14.getVisibility()
            r3 = 10
            r4 = 2132017754(0x7f14025a, float:1.9673795E38)
            java.lang.String r5 = "edit_dl_serv_emer_cont_no"
            java.lang.String r6 = "Y"
            java.lang.String r7 = "select_app_cat"
            java.lang.String r8 = "0"
            r9 = 2132018828(0x7f14068c, float:1.9675974E38)
            r10 = 2132017371(0x7f1400db, float:1.9673019E38)
            java.lang.String r11 = "label_want_to_proceed"
            java.lang.String r12 = "label_log_entr_vali_mobno"
            if (r14 != 0) goto L_0x0147
            java.lang.String r14 = r13.f22126v0
            boolean r14 = cm.l.a(r14, r8)
            if (r14 == 0) goto L_0x0094
            ld.c r14 = r13.X1()
            r0 = 2132019054(0x7f14076e, float:1.9676432E38)
            java.lang.String r0 = r13.getString(r0)
        L_0x008b:
            java.lang.String r14 = r14.b(r7, r0)
        L_0x008f:
            r13.I2(r14)
            goto L_0x01ae
        L_0x0094:
            ni.d4 r14 = r13.J
            if (r14 != 0) goto L_0x009c
            cm.l.v(r1)
            r14 = r0
        L_0x009c:
            android.widget.EditText r14 = r14.f25858z
            android.text.Editable r14 = r14.getText()
            cm.l.e(r14, r2)
            int r14 = r14.length()
            if (r14 != 0) goto L_0x00bd
            ld.c r14 = r13.X1()
            r0 = 2132017778(0x7f140272, float:1.9673844E38)
            java.lang.String r0 = r13.getString(r0)
            java.lang.String r1 = "label_dl_serv_enter_reas_manul"
            java.lang.String r14 = r14.b(r1, r0)
            goto L_0x008f
        L_0x00bd:
            java.lang.String r14 = r13.O
            boolean r14 = cm.l.a(r14, r6)
            if (r14 == 0) goto L_0x0134
            ni.d4 r14 = r13.J
            if (r14 != 0) goto L_0x00cd
            cm.l.v(r1)
            r14 = r0
        L_0x00cd:
            androidx.appcompat.widget.AppCompatEditText r14 = r14.N
            android.text.Editable r14 = r14.getText()
            cm.l.c(r14)
            int r14 = r14.length()
            if (r14 != 0) goto L_0x00e9
        L_0x00dc:
            ld.c r14 = r13.X1()
            java.lang.String r0 = r13.getString(r4)
            java.lang.String r14 = r14.b(r5, r0)
            goto L_0x008f
        L_0x00e9:
            ni.d4 r14 = r13.J
            if (r14 != 0) goto L_0x00f1
            cm.l.v(r1)
            r14 = r0
        L_0x00f1:
            androidx.appcompat.widget.AppCompatEditText r14 = r14.N
            android.text.Editable r14 = r14.getText()
            cm.l.c(r14)
            int r14 = r14.length()
            if (r14 >= r3) goto L_0x010d
        L_0x0100:
            ld.c r14 = r13.X1()
            java.lang.String r0 = r13.getString(r9)
        L_0x0108:
            java.lang.String r14 = r14.b(r12, r0)
            goto L_0x008f
        L_0x010d:
            t8.c$a r14 = t8.c.f16582a
            ni.d4 r2 = r13.J
            if (r2 != 0) goto L_0x0117
            cm.l.v(r1)
            goto L_0x0118
        L_0x0117:
            r0 = r2
        L_0x0118:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.N
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r14 = r14.q(r0)
            if (r14 != 0) goto L_0x0134
            ld.c r14 = r13.X1()
            r0 = 2132017854(0x7f1402be, float:1.9673998E38)
            java.lang.String r0 = r13.getString(r0)
            goto L_0x0108
        L_0x0134:
            ld.c r14 = r13.X1()
            java.lang.String r0 = r13.getString(r10)
            java.lang.String r14 = r14.b(r11, r0)
            cm.l.c(r14)
            r13.H2(r14)
            goto L_0x01ae
        L_0x0147:
            java.lang.String r14 = r13.f22126v0
            boolean r14 = cm.l.a(r14, r8)
            if (r14 == 0) goto L_0x0157
            ld.c r14 = r13.X1()
            java.lang.String r0 = ""
            goto L_0x008b
        L_0x0157:
            java.lang.String r14 = r13.O
            boolean r14 = cm.l.a(r14, r6)
            if (r14 == 0) goto L_0x0134
            ni.d4 r14 = r13.J
            if (r14 != 0) goto L_0x0167
            cm.l.v(r1)
            r14 = r0
        L_0x0167:
            androidx.appcompat.widget.AppCompatEditText r14 = r14.N
            android.text.Editable r14 = r14.getText()
            cm.l.c(r14)
            int r14 = r14.length()
            if (r14 != 0) goto L_0x0178
            goto L_0x00dc
        L_0x0178:
            ni.d4 r14 = r13.J
            if (r14 != 0) goto L_0x0180
            cm.l.v(r1)
            r14 = r0
        L_0x0180:
            androidx.appcompat.widget.AppCompatEditText r14 = r14.N
            android.text.Editable r14 = r14.getText()
            cm.l.c(r14)
            int r14 = r14.length()
            if (r14 >= r3) goto L_0x0191
            goto L_0x0100
        L_0x0191:
            t8.c$a r14 = t8.c.f16582a
            ni.d4 r2 = r13.J
            if (r2 != 0) goto L_0x019b
            cm.l.v(r1)
            goto L_0x019c
        L_0x019b:
            r0 = r2
        L_0x019c:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.N
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r14 = r14.q(r0)
            if (r14 != 0) goto L_0x0134
            goto L_0x0100
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity.A2(com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity, android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (r0.getVisibility() == 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013e, code lost:
        if (r0.getVisibility() == 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0195, code lost:
        if (r0.q(java.lang.String.valueOf(r1.N.getText())) == false) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void B2() {
        /*
            r13 = this;
            ni.d4 r0 = r13.J
            r1 = 0
            java.lang.String r2 = "mBinding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            android.widget.EditText r0 = r0.E
            android.text.Editable r0 = r0.getText()
            java.lang.String r3 = "getText(...)"
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0037
            ld.c r0 = r13.X1()
            r1 = 2132019064(0x7f140778, float:1.9676452E38)
            java.lang.String r1 = r13.getString(r1)
            java.lang.String r2 = "label_select_reason"
            java.lang.String r0 = r0.b(r2, r1)
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r1)
            r0.show()
            goto L_0x0199
        L_0x0037:
            ni.d4 r0 = r13.J
            if (r0 != 0) goto L_0x003f
            cm.l.v(r2)
            r0 = r1
        L_0x003f:
            android.widget.LinearLayout r0 = r0.C
            int r0 = r0.getVisibility()
            r4 = 10
            r5 = 2132017754(0x7f14025a, float:1.9673795E38)
            java.lang.String r6 = "edit_dl_serv_emer_cont_no"
            java.lang.String r7 = "Y"
            r8 = 2132019054(0x7f14076e, float:1.9676432E38)
            java.lang.String r9 = "txtAppCategory"
            java.lang.String r10 = "0"
            r11 = 2132018828(0x7f14068c, float:1.9675974E38)
            java.lang.String r12 = "label_log_entr_vali_mobno"
            if (r0 != 0) goto L_0x0125
            java.lang.String r0 = r13.f22126v0
            boolean r0 = cm.l.a(r0, r10)
            if (r0 == 0) goto L_0x0080
            ni.d4 r0 = r13.J
            if (r0 != 0) goto L_0x006c
            cm.l.v(r2)
            r0 = r1
        L_0x006c:
            com.nic.mparivahan.dlservices.widget.MyTextView r0 = r0.Y
            cm.l.e(r0, r9)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0080
        L_0x0077:
            java.lang.String r0 = r13.getString(r8)
        L_0x007b:
            r13.I2(r0)
            goto L_0x0199
        L_0x0080:
            ni.d4 r0 = r13.J
            if (r0 != 0) goto L_0x0088
            cm.l.v(r2)
            r0 = r1
        L_0x0088:
            android.widget.EditText r0 = r0.f25858z
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00a9
            ld.c r0 = r13.X1()
            r1 = 2132017778(0x7f140272, float:1.9673844E38)
            java.lang.String r1 = r13.getString(r1)
            java.lang.String r2 = "label_dl_serv_enter_reas_manul"
            java.lang.String r0 = r0.b(r2, r1)
            goto L_0x007b
        L_0x00a9:
            java.lang.String r0 = r13.O
            boolean r0 = cm.l.a(r0, r7)
            if (r0 == 0) goto L_0x0120
            ni.d4 r0 = r13.J
            if (r0 != 0) goto L_0x00b9
            cm.l.v(r2)
            r0 = r1
        L_0x00b9:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.N
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00d5
        L_0x00c8:
            ld.c r0 = r13.X1()
            java.lang.String r1 = r13.getString(r5)
            java.lang.String r0 = r0.b(r6, r1)
            goto L_0x007b
        L_0x00d5:
            ni.d4 r0 = r13.J
            if (r0 != 0) goto L_0x00dd
            cm.l.v(r2)
            r0 = r1
        L_0x00dd:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.N
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            if (r0 >= r4) goto L_0x00f9
        L_0x00ec:
            ld.c r0 = r13.X1()
            java.lang.String r1 = r13.getString(r11)
        L_0x00f4:
            java.lang.String r0 = r0.b(r12, r1)
            goto L_0x007b
        L_0x00f9:
            t8.c$a r0 = t8.c.f16582a
            ni.d4 r3 = r13.J
            if (r3 != 0) goto L_0x0103
            cm.l.v(r2)
            goto L_0x0104
        L_0x0103:
            r1 = r3
        L_0x0104:
            androidx.appcompat.widget.AppCompatEditText r1 = r1.N
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r0 = r0.q(r1)
            if (r0 != 0) goto L_0x0120
            ld.c r0 = r13.X1()
            r1 = 2132017854(0x7f1402be, float:1.9673998E38)
            java.lang.String r1 = r13.getString(r1)
            goto L_0x00f4
        L_0x0120:
            r13.J2()
            goto L_0x0199
        L_0x0125:
            java.lang.String r0 = r13.f22126v0
            boolean r0 = cm.l.a(r0, r10)
            if (r0 == 0) goto L_0x0142
            ni.d4 r0 = r13.J
            if (r0 != 0) goto L_0x0135
            cm.l.v(r2)
            r0 = r1
        L_0x0135:
            com.nic.mparivahan.dlservices.widget.MyTextView r0 = r0.Y
            cm.l.e(r0, r9)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0142
            goto L_0x0077
        L_0x0142:
            java.lang.String r0 = r13.O
            boolean r0 = cm.l.a(r0, r7)
            if (r0 == 0) goto L_0x0120
            ni.d4 r0 = r13.J
            if (r0 != 0) goto L_0x0152
            cm.l.v(r2)
            r0 = r1
        L_0x0152:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.N
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0163
            goto L_0x00c8
        L_0x0163:
            ni.d4 r0 = r13.J
            if (r0 != 0) goto L_0x016b
            cm.l.v(r2)
            r0 = r1
        L_0x016b:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.N
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            if (r0 >= r4) goto L_0x017c
            goto L_0x00ec
        L_0x017c:
            t8.c$a r0 = t8.c.f16582a
            ni.d4 r3 = r13.J
            if (r3 != 0) goto L_0x0186
            cm.l.v(r2)
            goto L_0x0187
        L_0x0186:
            r1 = r3
        L_0x0187:
            androidx.appcompat.widget.AppCompatEditText r1 = r1.N
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r0 = r0.q(r1)
            if (r0 != 0) goto L_0x0120
            goto L_0x00ec
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity.B2():void");
    }

    private final void C2() {
        ab.d dVar = this.M0;
        ab.d dVar2 = null;
        if (dVar == null) {
            l.v("mCombineViewModel");
            dVar = null;
        }
        dVar.i().g(this, new qj.m(this));
        ab.d dVar3 = this.M0;
        if (dVar3 == null) {
            l.v("mCombineViewModel");
        } else {
            dVar2 = dVar3;
        }
        dVar2.h().g(this, new n(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void D2(com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r27, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r28) {
        /*
            r15 = r27
            java.lang.String r14 = "service_is_not_present"
            java.lang.String r0 = "this$0"
            cm.l.f(r15, r0)
            ni.d4 r0 = r15.J
            java.lang.String r19 = "mBinding"
            r13 = 0
            if (r0 != 0) goto L_0x0014
            cm.l.v(r19)
            r0 = r13
        L_0x0014:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.G
            r12 = 0
            r0.c(r12)
            r11 = 2132019337(0x7f140889, float:1.9677006E38)
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x0028 }
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = r0.getStatusCode()     // Catch:{ Exception -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r1 = r11
            r25 = r13
            r3 = r14
            r13 = r15
            goto L_0x02b6
        L_0x002f:
            r0 = r13
        L_0x0030:
            java.lang.String r1 = "00"
            r2 = 2
            boolean r0 = km.p.p(r0, r1, r12, r2, r13)     // Catch:{ Exception -> 0x0028 }
            if (r0 == 0) goto L_0x0270
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x02d4
            java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x02d4
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x026a }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x026a }
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != r1) goto L_0x02d4
            com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r20 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x026a }
            r20.<init>()     // Catch:{ Exception -> 0x026a }
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x026a }
            java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x026a }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ Exception -> 0x026a }
            r21 = r0
            com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r21 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r21     // Catch:{ Exception -> 0x026a }
            if (r21 == 0) goto L_0x02d4
            java.lang.String r0 = ""
            java.util.ArrayList r1 = r27.i2()     // Catch:{ Exception -> 0x026a }
            ld.c r2 = r27.X1()     // Catch:{ Exception -> 0x026a }
            java.lang.String r3 = "check_dl_serv_dupl_dl"
            java.lang.String r4 = "Issue of Duplicate DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026a }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026a }
            if (r1 == 0) goto L_0x008f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "513,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x008f:
            java.util.ArrayList r1 = r27.i2()     // Catch:{ Exception -> 0x026a }
            ld.c r2 = r27.X1()     // Catch:{ Exception -> 0x026a }
            java.lang.String r3 = "check_dl_serv_renewal_dl"
            java.lang.String r4 = "Renewal of DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026a }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026a }
            if (r1 == 0) goto L_0x00b6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "514,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x00b6:
            java.util.ArrayList r1 = r27.i2()     // Catch:{ Exception -> 0x026a }
            ld.c r2 = r27.X1()     // Catch:{ Exception -> 0x026a }
            java.lang.String r3 = "revalidtion_expired_dl"
            java.lang.String r4 = "Re-Validation of Expired DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026a }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026a }
            if (r1 == 0) goto L_0x00dd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "537,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x00dd:
            java.util.ArrayList r1 = r27.i2()     // Catch:{ Exception -> 0x026a }
            ld.c r2 = r27.X1()     // Catch:{ Exception -> 0x026a }
            java.lang.String r3 = "check_dl_serv_change_addr"
            java.lang.String r4 = "Change of Address in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026a }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026a }
            if (r1 == 0) goto L_0x0104
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "515,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x0104:
            java.util.ArrayList r1 = r27.i2()     // Catch:{ Exception -> 0x026a }
            ld.c r2 = r27.X1()     // Catch:{ Exception -> 0x026a }
            java.lang.String r3 = "check_dl_serv_replacement_dl"
            java.lang.String r4 = "Replacement of DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026a }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026a }
            if (r1 == 0) goto L_0x012b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "516,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x012b:
            java.util.ArrayList r1 = r27.i2()     // Catch:{ Exception -> 0x026a }
            ld.c r2 = r27.X1()     // Catch:{ Exception -> 0x026a }
            java.lang.String r3 = "check_dl_serv_extract_dl"
            java.lang.String r4 = "DL Extract"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026a }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026a }
            if (r1 == 0) goto L_0x0152
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "523,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x0152:
            java.util.ArrayList r1 = r27.i2()     // Catch:{ Exception -> 0x026a }
            ld.c r2 = r27.X1()     // Catch:{ Exception -> 0x026a }
            java.lang.String r3 = "hill_region_title"
            java.lang.String r4 = "Endorsement to Drive in Hill Region"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026a }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026a }
            if (r1 == 0) goto L_0x0179
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "524,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x0179:
            java.util.ArrayList r1 = r27.i2()     // Catch:{ Exception -> 0x026a }
            ld.c r2 = r27.X1()     // Catch:{ Exception -> 0x026a }
            java.lang.String r3 = "change_name_dl"
            java.lang.String r4 = "Change of Name in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026a }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026a }
            if (r1 == 0) goto L_0x01a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "526,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x01a0:
            java.util.ArrayList r1 = r27.i2()     // Catch:{ Exception -> 0x026a }
            ld.c r2 = r27.X1()     // Catch:{ Exception -> 0x026a }
            java.lang.String r3 = "change_birth_dl"
            java.lang.String r4 = "Change of Date of Birth in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026a }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026a }
            if (r1 == 0) goto L_0x01c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "548"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x01c7:
            r16 = r0
            com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r1 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x0231 }
            java.lang.String r3 = "1234"
            java.lang.String r4 = "S"
            java.lang.String r5 = r21.getApplicationDate()     // Catch:{ Exception -> 0x0231 }
            java.lang.String r0 = r21.getApplicationNo()     // Catch:{ Exception -> 0x0231 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0231 }
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0231 }
            ld.g r0 = r27.g2()     // Catch:{ Exception -> 0x0231 }
            java.lang.String r0 = r0.k()     // Catch:{ Exception -> 0x0231 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0231 }
            java.lang.String r9 = r21.getDateofBirth()     // Catch:{ Exception -> 0x0231 }
            java.lang.String r10 = r21.getDlno()     // Catch:{ Exception -> 0x0231 }
            cm.l.c(r10)     // Catch:{ Exception -> 0x0231 }
            java.lang.String r0 = "N"
            java.lang.String r17 = "N"
            java.lang.String r18 = r21.getApplicantGender()     // Catch:{ Exception -> 0x0231 }
            java.lang.String r2 = r15.U     // Catch:{ Exception -> 0x0231 }
            cm.l.c(r2)     // Catch:{ Exception -> 0x0231 }
            r22 = 0
            r23 = r14
            java.lang.String r14 = r15.X     // Catch:{ Exception -> 0x022b }
            r28 = r14
            java.lang.String r14 = r15.Y     // Catch:{ Exception -> 0x022b }
            r24 = r2
            r2 = r27
            r11 = r0
            r12 = r17
            r25 = r13
            r13 = r18
            r0 = r28
            r18 = r14
            r26 = r23
            r14 = r24
            r15 = r22
            r17 = r0
            r1.a(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0229 }
        L_0x0226:
            r13 = r27
            goto L_0x0240
        L_0x0229:
            r0 = move-exception
            goto L_0x0236
        L_0x022b:
            r0 = move-exception
            r25 = r13
            r26 = r23
            goto L_0x0236
        L_0x0231:
            r0 = move-exception
            r25 = r13
            r26 = r14
        L_0x0236:
            java.lang.String r1 = "valiii"
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ Exception -> 0x0267 }
            android.util.Log.d(r1, r0)     // Catch:{ Exception -> 0x0267 }
            goto L_0x0226
        L_0x0240:
            java.lang.String r4 = r13.X     // Catch:{ Exception -> 0x0261 }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = r27.U1()     // Catch:{ Exception -> 0x0261 }
            java.lang.String r6 = r13.S     // Catch:{ Exception -> 0x0261 }
            java.lang.String r7 = r13.T     // Catch:{ Exception -> 0x0261 }
            java.lang.String r8 = r13.U     // Catch:{ Exception -> 0x0261 }
            java.lang.String r9 = r13.V     // Catch:{ Exception -> 0x0261 }
            java.lang.String r10 = r13.W     // Catch:{ Exception -> 0x0261 }
            java.lang.String r11 = r13.Y     // Catch:{ Exception -> 0x0261 }
            java.util.ArrayList r12 = r27.c2()     // Catch:{ Exception -> 0x0261 }
            r1 = r20
            r2 = r27
            r3 = r21
            r1.E2(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0261 }
            goto L_0x02d4
        L_0x0261:
            r3 = r26
            r1 = 2132019337(0x7f140889, float:1.9677006E38)
            goto L_0x02b6
        L_0x0267:
            r13 = r27
            goto L_0x0261
        L_0x026a:
            r25 = r13
            r13 = r15
            r1 = r11
            r3 = r14
            goto L_0x02b6
        L_0x0270:
            r25 = r13
            r26 = r14
            r13 = r15
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x0261 }
            if (r0 == 0) goto L_0x0280
            java.lang.String r0 = r0.getReqStatus()     // Catch:{ Exception -> 0x0261 }
            goto L_0x0282
        L_0x0280:
            r0 = r25
        L_0x0282:
            if (r0 == 0) goto L_0x029f
            int r0 = r0.length()     // Catch:{ Exception -> 0x0261 }
            if (r0 != 0) goto L_0x028b
            goto L_0x029f
        L_0x028b:
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x0261 }
            if (r0 == 0) goto L_0x0296
            java.lang.String r0 = r0.getReqStatus()     // Catch:{ Exception -> 0x0261 }
            goto L_0x0298
        L_0x0296:
            r0 = r25
        L_0x0298:
            cm.l.c(r0)     // Catch:{ Exception -> 0x0261 }
            r13.I2(r0)     // Catch:{ Exception -> 0x0261 }
            goto L_0x02d4
        L_0x029f:
            ld.c r0 = r27.X1()     // Catch:{ Exception -> 0x0261 }
            r1 = 2132019337(0x7f140889, float:1.9677006E38)
            java.lang.String r2 = r13.getString(r1)     // Catch:{ Exception -> 0x02b4 }
            r3 = r26
            java.lang.String r0 = r0.b(r3, r2)     // Catch:{ Exception -> 0x02b6 }
            r13.I2(r0)     // Catch:{ Exception -> 0x02b6 }
            goto L_0x02d4
        L_0x02b4:
            r3 = r26
        L_0x02b6:
            ni.d4 r0 = r13.J
            if (r0 != 0) goto L_0x02bf
            cm.l.v(r19)
            r0 = r25
        L_0x02bf:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.G
            r2 = 0
            r0.c(r2)
            ld.c r0 = r27.X1()
            java.lang.String r1 = r13.getString(r1)
            java.lang.String r0 = r0.b(r3, r1)
            r13.I2(r0)
        L_0x02d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity.D2(com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse):void");
    }

    /* access modifiers changed from: private */
    public static final void E2(DLDuplicateActivity dLDuplicateActivity, String str) {
        l.f(dLDuplicateActivity, "this$0");
        d4 d4Var = dLDuplicateActivity.J;
        if (d4Var == null) {
            l.v("mBinding");
            d4Var = null;
        }
        d4Var.G.c(false);
        dLDuplicateActivity.I2(dLDuplicateActivity.X1().b("service_is_not_present", dLDuplicateActivity.getString(R.string.unable_to_get_details)));
    }

    /* access modifiers changed from: private */
    public static final void F2(DLDuplicateActivity dLDuplicateActivity, View view) {
        l.f(dLDuplicateActivity, "this$0");
        dLDuplicateActivity.finish();
    }

    private final void G2() {
        ArrayList arrayList = new ArrayList();
        List<ReasonsMasterItem> list = this.N;
        if (list != null) {
            for (ReasonsMasterItem reasonsMasterItem : list) {
                arrayList.add(String.valueOf(reasonsMasterItem != null ? reasonsMasterItem.getReasonName() : null));
            }
        }
        kk.e a10 = kk.e.A0.a("Select Reason", arrayList);
        a10.k2(F0(), "ReasonPicker");
        a10.n2(new f(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (cm.l.a(r15.Q, "S") == false) goto L_0x005f;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:37:0x00b1=Splitter:B:37:0x00b1, B:70:0x01e1=Splitter:B:70:0x01e1, B:43:0x00c4=Splitter:B:43:0x00c4, B:76:0x01f4=Splitter:B:76:0x01f4, B:31:0x0086=Splitter:B:31:0x0086, B:64:0x01b6=Splitter:B:64:0x01b6} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void H2(java.lang.String r36) {
        /*
            r35 = this;
            r15 = r35
            java.lang.String r0 = "same"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r15.Z
            r1.append(r2)
            r2 = 45
            r1.append(r2)
            java.lang.String r3 = r15.R
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = r15.Q
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "valuesDup"
            android.util.Log.d(r2, r1)
            java.lang.String r1 = r15.O
            java.lang.String r2 = "Y"
            boolean r1 = cm.l.a(r1, r2)
            r3 = 0
            java.lang.String r4 = "mBinding"
            if (r1 == 0) goto L_0x004a
            ni.d4 r1 = r15.J
            if (r1 != 0) goto L_0x003e
            cm.l.v(r4)
            r1 = r3
        L_0x003e:
            androidx.appcompat.widget.AppCompatEditText r1 = r1.N
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L_0x0048:
            r5 = r1
            goto L_0x004d
        L_0x004a:
            java.lang.String r1 = "NA"
            goto L_0x0048
        L_0x004d:
            java.lang.String r1 = r15.Z     // Catch:{ Exception -> 0x0062 }
            boolean r1 = cm.l.a(r1, r0)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r6 = "S"
            if (r1 == 0) goto L_0x0065
            java.lang.String r1 = r15.Q     // Catch:{ Exception -> 0x0062 }
            boolean r1 = cm.l.a(r1, r6)     // Catch:{ Exception -> 0x0062 }
            if (r1 != 0) goto L_0x0065
        L_0x005f:
            r35.R1(r36)     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            r4 = r15
            goto L_0x02e3
        L_0x0065:
            java.lang.String r1 = r15.Z     // Catch:{ Exception -> 0x0062 }
            boolean r1 = cm.l.a(r1, r0)     // Catch:{ Exception -> 0x0062 }
            r7 = 1
            if (r1 == 0) goto L_0x018a
            java.lang.String r1 = r15.Q     // Catch:{ Exception -> 0x0186 }
            boolean r1 = cm.l.a(r1, r6)     // Catch:{ Exception -> 0x0186 }
            if (r1 == 0) goto L_0x018a
            java.lang.String r1 = r15.R     // Catch:{ Exception -> 0x0186 }
            boolean r1 = cm.l.a(r1, r2)     // Catch:{ Exception -> 0x0186 }
            if (r1 == 0) goto L_0x018a
            ni.d4 r0 = r15.J     // Catch:{ Exception -> 0x0186 }
            if (r0 != 0) goto L_0x0086
            cm.l.v(r4)     // Catch:{ Exception -> 0x0062 }
            r0 = r3
        L_0x0086:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.G     // Catch:{ Exception -> 0x0186 }
            r0.c(r7)     // Catch:{ Exception -> 0x0186 }
            pi.d r0 = r35.f2()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r1 = r15.S     // Catch:{ Exception -> 0x0186 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0186 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r2 = r1.toString()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r6 = r15.T     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r6)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r7 = r15.X     // Catch:{ Exception -> 0x0186 }
            java.lang.String r8 = r15.O     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r8)     // Catch:{ Exception -> 0x0186 }
            ni.d4 r1 = r15.J     // Catch:{ Exception -> 0x0186 }
            if (r1 != 0) goto L_0x00b1
            cm.l.v(r4)     // Catch:{ Exception -> 0x0062 }
            r1 = r3
        L_0x00b1:
            android.widget.EditText r1 = r1.E     // Catch:{ Exception -> 0x0186 }
            java.lang.CharSequence r1 = r1.getContentDescription()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r9 = r1.toString()     // Catch:{ Exception -> 0x0186 }
            ni.d4 r1 = r15.J     // Catch:{ Exception -> 0x0186 }
            if (r1 != 0) goto L_0x00c3
            cm.l.v(r4)     // Catch:{ Exception -> 0x0062 }
            goto L_0x00c4
        L_0x00c3:
            r3 = r1
        L_0x00c4:
            android.widget.EditText r1 = r3.E     // Catch:{ Exception -> 0x0186 }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r11 = r15.f22107c0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r11)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r12 = r15.f22108d0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r12)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r13 = r15.f22109e0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r13)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r14 = r15.f22110f0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r4 = r15.f22112h0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r4)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r3 = r15.f22111g0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r3)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r1 = r15.f22113i0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0186 }
            r16 = r14
            java.lang.String r14 = r15.f22114j0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r17 = r14
            java.lang.String r14 = r15.f22115k0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r18 = r14
            java.lang.String r14 = r15.f22116l0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r19 = r14
            java.lang.String r14 = r15.f22117m0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r20 = r14
            java.lang.String r14 = r15.f22118n0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r21 = r14
            java.lang.String r14 = r15.f22119o0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r22 = r14
            java.lang.String r14 = r15.f22120p0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r23 = r14
            java.lang.String r14 = r15.f22121q0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r24 = r14
            java.lang.String r14 = r15.f22122r0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r25 = r14
            java.lang.String r14 = r15.U     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            ld.f r26 = r35.k2()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r26 = r26.f()     // Catch:{ Exception -> 0x0186 }
            ld.f r27 = r35.k2()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r27 = r27.g()     // Catch:{ Exception -> 0x0186 }
            ld.f r28 = r35.k2()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r28 = r28.e()     // Catch:{ Exception -> 0x0186 }
            ld.f r29 = r35.k2()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r29 = r29.h()     // Catch:{ Exception -> 0x0186 }
            r30 = r1
            r1 = r35
            r31 = r3
            r3 = r6
            r32 = r4
            r4 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r16
            r13 = r32
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r14
            r14 = r31
            r15 = r30
            r0.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x0186 }
        L_0x0186:
            r4 = r35
            goto L_0x02e3
        L_0x018a:
            r15 = r35
            java.lang.String r1 = r15.Z     // Catch:{ Exception -> 0x0062 }
            boolean r0 = cm.l.a(r1, r0)     // Catch:{ Exception -> 0x0062 }
            if (r0 == 0) goto L_0x01a6
            java.lang.String r0 = r15.Q     // Catch:{ Exception -> 0x0062 }
            boolean r0 = cm.l.a(r0, r6)     // Catch:{ Exception -> 0x0062 }
            if (r0 == 0) goto L_0x01a6
            java.lang.String r0 = r15.R     // Catch:{ Exception -> 0x0062 }
            boolean r0 = cm.l.a(r0, r2)     // Catch:{ Exception -> 0x0062 }
            if (r0 != 0) goto L_0x01a6
            goto L_0x005f
        L_0x01a6:
            com.nic.mparivahan.a$a r0 = com.nic.mparivahan.a.f9624a     // Catch:{ Exception -> 0x0062 }
            boolean r0 = r0.a(r15)     // Catch:{ Exception -> 0x0062 }
            if (r0 == 0) goto L_0x02c4
            ni.d4 r0 = r15.J     // Catch:{ Exception -> 0x0186 }
            if (r0 != 0) goto L_0x01b6
            cm.l.v(r4)     // Catch:{ Exception -> 0x0062 }
            r0 = r3
        L_0x01b6:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.G     // Catch:{ Exception -> 0x0186 }
            r0.c(r7)     // Catch:{ Exception -> 0x0186 }
            pi.d r0 = r35.f2()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r1 = r15.S     // Catch:{ Exception -> 0x0186 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0186 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r2 = r1.toString()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r6 = r15.T     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r6)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r7 = r15.X     // Catch:{ Exception -> 0x0186 }
            java.lang.String r8 = r15.O     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r8)     // Catch:{ Exception -> 0x0186 }
            ni.d4 r1 = r15.J     // Catch:{ Exception -> 0x0186 }
            if (r1 != 0) goto L_0x01e1
            cm.l.v(r4)     // Catch:{ Exception -> 0x0062 }
            r1 = r3
        L_0x01e1:
            android.widget.EditText r1 = r1.E     // Catch:{ Exception -> 0x0186 }
            java.lang.CharSequence r1 = r1.getContentDescription()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r9 = r1.toString()     // Catch:{ Exception -> 0x0186 }
            ni.d4 r1 = r15.J     // Catch:{ Exception -> 0x0186 }
            if (r1 != 0) goto L_0x01f3
            cm.l.v(r4)     // Catch:{ Exception -> 0x0062 }
            goto L_0x01f4
        L_0x01f3:
            r3 = r1
        L_0x01f4:
            android.widget.EditText r1 = r3.E     // Catch:{ Exception -> 0x0186 }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r11 = r15.f22126v0     // Catch:{ Exception -> 0x0186 }
            java.lang.String r12 = "B"
            java.lang.String r13 = r15.f22107c0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r13)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r14 = r15.f22108d0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r4 = r15.f22109e0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r4)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r3 = r15.f22110f0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r3)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r1 = r15.f22112h0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0186 }
            r16 = r14
            java.lang.String r14 = r15.f22111g0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r17 = r14
            java.lang.String r14 = r15.f22113i0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r18 = r14
            java.lang.String r14 = r15.f22114j0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r19 = r14
            java.lang.String r14 = r15.f22115k0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r20 = r14
            java.lang.String r14 = r15.f22116l0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r21 = r14
            java.lang.String r14 = r15.f22117m0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r22 = r14
            java.lang.String r14 = r15.f22118n0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r23 = r14
            java.lang.String r14 = r15.f22119o0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r24 = r14
            java.lang.String r14 = r15.f22120p0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r25 = r14
            java.lang.String r14 = r15.f22121q0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r26 = r14
            java.lang.String r14 = r15.f22122r0     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            r27 = r14
            java.lang.String r14 = r15.U     // Catch:{ Exception -> 0x0186 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x0186 }
            ld.f r28 = r35.k2()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r28 = r28.f()     // Catch:{ Exception -> 0x0186 }
            ld.f r29 = r35.k2()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r29 = r29.g()     // Catch:{ Exception -> 0x0186 }
            ld.f r30 = r35.k2()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r30 = r30.e()     // Catch:{ Exception -> 0x0186 }
            ld.f r31 = r35.k2()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r31 = r31.h()     // Catch:{ Exception -> 0x0186 }
            r32 = r1
            r1 = r35
            r33 = r3
            r3 = r6
            r34 = r4
            r4 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r16
            r13 = r34
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r14
            r14 = r33
            r15 = r32
            r0.g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x0186 }
            goto L_0x0186
        L_0x02c4:
            android.content.Context r0 = r35.getApplicationContext()     // Catch:{ Exception -> 0x0186 }
            ld.c r1 = r35.X1()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r2 = "service_is_not_present"
            r3 = 2132019337(0x7f140889, float:1.9677006E38)
            r4 = r35
            java.lang.String r3 = r4.getString(r3)     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x02e3 }
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)     // Catch:{ Exception -> 0x02e3 }
            r0.show()     // Catch:{ Exception -> 0x02e3 }
        L_0x02e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity.H2(java.lang.String):void");
    }

    private final void J2() {
        ab.d dVar;
        String str;
        Intent intent;
        String str2;
        String str3;
        String str4;
        d4 d4Var;
        Class<CombineReq> cls = CombineReq.class;
        String str5 = "";
        if (i2().size() > this.L0) {
            try {
                CombineReq combineReq = (CombineReq) new i7.d().j(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", str5), cls);
                CombineReq combineReq2 = new CombineReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, 1023, (cm.g) null);
                combineReq2.setPofbirth(combineReq.getPofbirth());
                combineReq2.setCountry(combineReq.getCountry());
                combineReq2.setPassno(combineReq.getPassno());
                combineReq2.setPassvaltill(combineReq.getPassvaltill());
                combineReq2.setVisano(combineReq.getVisano());
                combineReq2.setVisavaltill(combineReq.getVisavaltill());
                combineReq2.setTovisit(combineReq.getTovisit());
                combineReq2.setIscountryrestricted(combineReq.getIscountryrestricted());
                combineReq2.setCountryRestrictedReason(combineReq.getCountryRestrictedReason());
                combineReq2.setDlSerdisqualified(combineReq.isDlSerdisqualified());
                combineReq2.setDlSerdisqualifiedReason(combineReq.getDlSerdisqualifiedReason());
                combineReq2.setForAdd1(combineReq.getForAdd1());
                combineReq2.setForAdd2(combineReq.getForAdd2());
                combineReq2.setForAdd3(combineReq.getForAdd3());
                combineReq2.setForAddPinCode(combineReq.getForAddPinCode());
                combineReq2.setForNationMobNum(combineReq.getForNationMobNum());
                combineReq2.setEmailID(combineReq.getEmailID());
                combineReq2.setAppliedIdpfromIndEmb(combineReq.getAppliedIdpfromIndEmb());
                combineReq2.setIndEmbName(combineReq.getIndEmbName());
                combineReq2.setEmbPlace(combineReq.getEmbPlace());
                combineReq2.setDateOfVerifEmb(combineReq.getDateOfVerifEmb());
                combineReq2.setEmbEndorseNo(combineReq.getEmbEndorseNo());
                combineReq2.setIdpcountryapplyfrom(combineReq.getIdpcountryapplyfrom());
                combineReq2.setApplcatgDLserReq(combineReq.getApplcatgDLserReq());
                combineReq2.setDleDlReasonCode(combineReq.getDleDlReasonCode());
                combineReq2.setDleDlReasonName(combineReq.getDleDlReasonName());
                combineReq2.setRelationType(combineReq.getRelationType());
                combineReq2.setConDlReasonCode(combineReq.getConDlReasonCode());
                combineReq2.setConDlReasonName(combineReq.getConDlReasonName());
                combineReq2.setDlHolderNaturalName(combineReq.getDlHolderNaturalName());
                combineReq2.setConEffdate(combineReq.getConEffdate());
                combineReq2.setApplFirstName(combineReq.getApplFirstName());
                combineReq2.setApplLastName(combineReq.getApplLastName());
                combineReq2.setRelFirstName(combineReq.getRelFirstName());
                combineReq2.setRelLastName(combineReq.getRelLastName());
                combineReq2.setMobileNumber(combineReq.getMobileNumber());
                combineReq2.setChangeOfAddReq(combineReq.getChangeOfAddReq());
                combineReq2.setPerHouseNo(combineReq.getPerHouseNo());
                combineReq2.setPerStreet(combineReq.getPerStreet());
                combineReq2.setPerLocation(combineReq.getPerLocation());
                combineReq2.setPermVillageOrTown(combineReq.getPermVillageOrTown());
                combineReq2.setPerSubDistrict(combineReq.getPerSubDistrict());
                combineReq2.setPerDistrict(combineReq.getPerDistrict());
                combineReq2.setPerState(combineReq.getPerState());
                combineReq2.setPerPinCode(combineReq.getPerPinCode());
                combineReq2.setPresHouseNo(combineReq.getPresHouseNo());
                combineReq2.setPresStreet(combineReq.getPresStreet());
                combineReq2.setPresLocation(combineReq.getPresLocation());
                combineReq2.setPresVillageOrTown(combineReq.getPresVillageOrTown());
                combineReq2.setPresSubDistrict(combineReq.getPresSubDistrict());
                combineReq2.setPresDistrict(combineReq.getPresDistrict());
                combineReq2.setPresState(combineReq.getPresState());
                combineReq2.setPresPincode(combineReq.getPresPincode());
                combineReq2.setApplDateOfBirth(combineReq.getApplDateOfBirth());
                combineReq2.setCodobDlReasonName(combineReq.getCodobDlReasonName());
                combineReq2.setCodobDlReasonCode(combineReq.getCodobDlReasonCode());
                combineReq2.setDeclaringcheck(combineReq.getDeclaringcheck());
                combineReq2.setHillcertificate(combineReq.getHillcertificate());
                combineReq2.setHillissueDate(combineReq.getHillissueDate());
                combineReq2.setHillvalidFrom(combineReq.getHillvalidFrom());
                combineReq2.setHillvalidTo(combineReq.getHillvalidTo());
                combineReq2.setHilldrivingschool(combineReq.getHilldrivingschool());
                combineReq2.setHillissby(combineReq.getHillissby());
                d4 d4Var2 = this.J;
                if (d4Var2 == null) {
                    l.v("mBinding");
                    d4Var2 = null;
                }
                combineReq2.setDupDlReasonName(d4Var2.E.getText().toString());
                d4 d4Var3 = this.J;
                if (d4Var3 == null) {
                    l.v("mBinding");
                    d4Var3 = null;
                }
                combineReq2.setDupDlReasonCode(d4Var3.E.getContentDescription().toString());
                if (l.a(this.O, "Y")) {
                    combineReq2.setWilltoDonateOrgans("Y");
                    d4 d4Var4 = this.J;
                    if (d4Var4 == null) {
                        l.v("mBinding");
                        d4Var = null;
                    } else {
                        d4Var = d4Var4;
                    }
                    str = String.valueOf(d4Var.N.getText());
                } else {
                    combineReq2.setWilltoDonateOrgans("N");
                    str = "NA";
                }
                combineReq2.setDlHolderAltMobMum(str);
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
                edit.putString("MultiService", new i7.d().t(combineReq2));
                edit.commit();
                if (l.a(i2().get(this.L0), X1().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                    setIntent(new Intent(this, DLDuplicateActivity.class));
                    intent = getIntent();
                    l.e(intent, "getIntent(...)");
                    str2 = this.X;
                    str3 = this.W;
                    str4 = "513";
                } else {
                    Class<RenewalOfDLActivity> cls2 = RenewalOfDLActivity.class;
                    if (l.a(i2().get(this.L0), X1().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        setIntent(new Intent(this, cls2));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str2 = this.X;
                        str3 = this.W;
                        str4 = "514";
                    } else if (l.a(i2().get(this.L0), X1().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        setIntent(new Intent(this, cls2));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str2 = this.X;
                        str3 = this.W;
                        str4 = "537";
                    } else if (l.a(i2().get(this.L0), X1().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                        setIntent(new Intent(this, ChangeOfAddressActivity.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str2 = this.X;
                        str3 = this.W;
                        str4 = "515";
                    } else if (l.a(i2().get(this.L0), X1().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                        setIntent(new Intent(this, DLReplecementActivity.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str2 = this.X;
                        str3 = this.W;
                        str4 = "516";
                    } else if (l.a(i2().get(this.L0), X1().b("check_dl_serv_extract_dl", "DL Extract"))) {
                        setIntent(new Intent(this, DLExtractActivity.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str2 = this.X;
                        str3 = this.W;
                        str4 = "523";
                    } else if (l.a(i2().get(this.L0), X1().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                        setIntent(new Intent(this, HillReligion.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str2 = this.X;
                        str3 = this.W;
                        str4 = "524";
                    } else if (l.a(i2().get(this.L0), X1().b("change_name_dl", "Change of Name in DL"))) {
                        setIntent(new Intent(this, ChangeOfName.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str2 = this.X;
                        str3 = this.W;
                        str4 = "526";
                    } else if (l.a(i2().get(this.L0), X1().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                        setIntent(new Intent(this, DobChangeActivity.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str2 = this.X;
                        str3 = this.W;
                        str4 = "548";
                    } else {
                        return;
                    }
                }
                u2(intent, str2, str3, str4, i2());
            } catch (Exception unused) {
            }
        } else {
            if (com.nic.mparivahan.a.f9624a.a(this)) {
                CombineReq combineReq3 = (CombineReq) new i7.d().j(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", str5), cls);
                if (l.a(this.O, "Y")) {
                    d4 d4Var5 = this.J;
                    if (d4Var5 == null) {
                        l.v("mBinding");
                        d4Var5 = null;
                    }
                    str5 = String.valueOf(d4Var5.N.getText());
                }
                String str6 = str5;
                ArrayList arrayList = new ArrayList();
                int size = U1().getDlcovs().size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(String.valueOf(U1().getDlcovs().get(i10).getDcCovcd()));
                }
                d4 d4Var6 = this.J;
                if (d4Var6 == null) {
                    l.v("mBinding");
                    d4Var6 = null;
                }
                d4Var6.G.c(true);
                ab.d dVar2 = this.M0;
                if (dVar2 == null) {
                    l.v("mCombineViewModel");
                    dVar = null;
                } else {
                    dVar = dVar2;
                }
                boolean z10 = this.I0;
                String str7 = this.Q;
                l.c(str7);
                String str8 = this.R;
                l.c(str8);
                ArrayList i22 = i2();
                String str9 = this.f22126v0;
                String str10 = this.S;
                l.c(str10);
                String str11 = this.T;
                l.c(str11);
                String str12 = this.X;
                String str13 = this.O;
                l.c(str13);
                String relationType = combineReq3.getRelationType();
                l.c(relationType);
                String conDlReasonName = combineReq3.getConDlReasonName();
                l.c(conDlReasonName);
                String conDlReasonName2 = combineReq3.getConDlReasonName();
                l.c(conDlReasonName2);
                String dlHolderNaturalName = combineReq3.getDlHolderNaturalName();
                l.c(dlHolderNaturalName);
                String conEffdate = combineReq3.getConEffdate();
                l.c(conEffdate);
                String applFirstName = combineReq3.getApplFirstName();
                l.c(applFirstName);
                String applLastName = combineReq3.getApplLastName();
                l.c(applLastName);
                String relFirstName = combineReq3.getRelFirstName();
                l.c(relFirstName);
                String relLastName = combineReq3.getRelLastName();
                l.c(relLastName);
                String str14 = this.U;
                l.c(str14);
                String changeOfAddReq = combineReq3.getChangeOfAddReq();
                l.c(changeOfAddReq);
                String perHouseNo = combineReq3.getPerHouseNo();
                l.c(perHouseNo);
                String perStreet = combineReq3.getPerStreet();
                l.c(perStreet);
                String perLocation = combineReq3.getPerLocation();
                l.c(perLocation);
                String permVillageOrTown = combineReq3.getPermVillageOrTown();
                l.c(permVillageOrTown);
                String perSubDistrict = combineReq3.getPerSubDistrict();
                l.c(perSubDistrict);
                String perDistrict = combineReq3.getPerDistrict();
                l.c(perDistrict);
                String perState = combineReq3.getPerState();
                l.c(perState);
                String perPinCode = combineReq3.getPerPinCode();
                l.c(perPinCode);
                String presHouseNo = combineReq3.getPresHouseNo();
                l.c(presHouseNo);
                String presStreet = combineReq3.getPresStreet();
                l.c(presStreet);
                String presLocation = combineReq3.getPresLocation();
                l.c(presLocation);
                String presVillageOrTown = combineReq3.getPresVillageOrTown();
                l.c(presVillageOrTown);
                String presSubDistrict = combineReq3.getPresSubDistrict();
                l.c(presSubDistrict);
                String presDistrict = combineReq3.getPresDistrict();
                l.c(presDistrict);
                String presState = combineReq3.getPresState();
                l.c(presState);
                String presPincode = combineReq3.getPresPincode();
                l.c(presPincode);
                String dleDlReasonCode = combineReq3.getDleDlReasonCode();
                l.c(dleDlReasonCode);
                String dleDlReasonName = combineReq3.getDleDlReasonName();
                l.c(dleDlReasonName);
                String str15 = str14;
                d4 d4Var7 = this.J;
                if (d4Var7 == null) {
                    l.v("mBinding");
                    d4Var7 = null;
                }
                String obj = d4Var7.E.getText().toString();
                d4 d4Var8 = this.J;
                if (d4Var8 == null) {
                    l.v("mBinding");
                    d4Var8 = null;
                }
                String obj2 = d4Var8.E.getContentDescription().toString();
                String applDateOfBirth = combineReq3.getApplDateOfBirth();
                l.c(applDateOfBirth);
                String codobDlReasonName = combineReq3.getCodobDlReasonName();
                l.c(codobDlReasonName);
                String codobDlReasonCode = combineReq3.getCodobDlReasonCode();
                l.c(codobDlReasonCode);
                String declaringcheck = combineReq3.getDeclaringcheck();
                l.c(declaringcheck);
                String hillcertificate = combineReq3.getHillcertificate();
                l.c(hillcertificate);
                String hillissueDate = combineReq3.getHillissueDate();
                l.c(hillissueDate);
                String hillvalidFrom = combineReq3.getHillvalidFrom();
                l.c(hillvalidFrom);
                String hillvalidTo = combineReq3.getHillvalidTo();
                l.c(hillvalidTo);
                String hilldrivingschool = combineReq3.getHilldrivingschool();
                l.c(hilldrivingschool);
                String hillissby = combineReq3.getHillissby();
                l.c(hillissby);
                String pofbirth = combineReq3.getPofbirth();
                l.c(pofbirth);
                String country = combineReq3.getCountry();
                l.c(country);
                String passno = combineReq3.getPassno();
                l.c(passno);
                String passvaltill = combineReq3.getPassvaltill();
                l.c(passvaltill);
                String visano = combineReq3.getVisano();
                l.c(visano);
                String visavaltill = combineReq3.getVisavaltill();
                l.c(visavaltill);
                String tovisit = combineReq3.getTovisit();
                l.c(tovisit);
                String iscountryrestricted = combineReq3.getIscountryrestricted();
                l.c(iscountryrestricted);
                String countryRestrictedReason = combineReq3.getCountryRestrictedReason();
                l.c(countryRestrictedReason);
                String isDlSerdisqualified = combineReq3.isDlSerdisqualified();
                l.c(isDlSerdisqualified);
                String dlSerdisqualifiedReason = combineReq3.getDlSerdisqualifiedReason();
                l.c(dlSerdisqualifiedReason);
                String forAdd1 = combineReq3.getForAdd1();
                l.c(forAdd1);
                String forAdd2 = combineReq3.getForAdd2();
                l.c(forAdd2);
                String forAdd3 = combineReq3.getForAdd3();
                l.c(forAdd3);
                String forAddPinCode = combineReq3.getForAddPinCode();
                l.c(forAddPinCode);
                String forNationMobNum = combineReq3.getForNationMobNum();
                l.c(forNationMobNum);
                String emailID = combineReq3.getEmailID();
                l.c(emailID);
                String appliedIdpfromIndEmb = combineReq3.getAppliedIdpfromIndEmb();
                l.c(appliedIdpfromIndEmb);
                String indEmbName = combineReq3.getIndEmbName();
                l.c(indEmbName);
                String embPlace = combineReq3.getEmbPlace();
                l.c(embPlace);
                String dateOfVerifEmb = combineReq3.getDateOfVerifEmb();
                l.c(dateOfVerifEmb);
                String embEndorseNo = combineReq3.getEmbEndorseNo();
                l.c(embEndorseNo);
                String idpcountryapplyfrom = combineReq3.getIdpcountryapplyfrom();
                l.c(idpcountryapplyfrom);
                dVar.g(z10, arrayList, str7, str8, i22, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", str9, str6, str10, str11, str12, str13, relationType, conDlReasonName, conDlReasonName2, dlHolderNaturalName, conEffdate, applFirstName, applLastName, relFirstName, relLastName, str15, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, dleDlReasonCode, dleDlReasonName, obj, obj2, applDateOfBirth, codobDlReasonName, codobDlReasonCode, declaringcheck, hillcertificate, hillissueDate, hillvalidFrom, hillvalidTo, hilldrivingschool, hillissby, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, isDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, k2().f(), k2().g(), k2().e(), k2().h());
                return;
            }
            Toast.makeText(getApplicationContext(), X1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
    }

    private final void Q1() {
        u uVar = new u();
        ArrayList arrayList = new ArrayList();
        uVar.f20234e = arrayList;
        arrayList.add(0, new AppCatPojo("0", "Select Applicant Category"));
        ((ArrayList) uVar.f20234e).add(1, new AppCatPojo("G", "General"));
        ((ArrayList) uVar.f20234e).add(2, new AppCatPojo("R", "Repatriate"));
        ((ArrayList) uVar.f20234e).add(3, new AppCatPojo("T", "Refugees"));
        ((ArrayList) uVar.f20234e).add(4, new AppCatPojo("X", "Ex-Servicemen"));
        ((ArrayList) uVar.f20234e).add(5, new AppCatPojo("F", "Foreigners (Not Diplomats)"));
        ((ArrayList) uVar.f20234e).add(6, new AppCatPojo("D", "Diplomats (Foreigner)"));
        ((ArrayList) uVar.f20234e).add(7, new AppCatPojo("O", "OCI"));
        ((ArrayList) uVar.f20234e).add(8, new AppCatPojo("P", "Differently Abled"));
        oi.a aVar = new oi.a(this, (ArrayList) uVar.f20234e);
        d4 d4Var = this.J;
        d4 d4Var2 = null;
        if (d4Var == null) {
            l.v("mBinding");
            d4Var = null;
        }
        d4Var.S.setAdapter(aVar);
        int size = ((ArrayList) uVar.f20234e).size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            } else if (l.a(q.B0(k2().a()).toString(), q.B0(((AppCatPojo) ((ArrayList) uVar.f20234e).get(i10)).getAppCode()).toString())) {
                d4 d4Var3 = this.J;
                if (d4Var3 == null) {
                    l.v("mBinding");
                    d4Var3 = null;
                }
                d4Var3.S.setSelection(i10);
            } else {
                i10++;
            }
        }
        d4 d4Var4 = this.J;
        if (d4Var4 == null) {
            l.v("mBinding");
            d4Var4 = null;
        }
        d4Var4.S.setOnItemSelectedListener(new a(this, uVar));
        if (p.p(this.Q, "S", false, 2, (Object) null)) {
            d4 d4Var5 = this.J;
            if (d4Var5 == null) {
                l.v("mBinding");
            } else {
                d4Var2 = d4Var5;
            }
            d4Var2.S.setEnabled(true);
            return;
        }
        d4 d4Var6 = this.J;
        if (d4Var6 == null) {
            l.v("mBinding");
        } else {
            d4Var2 = d4Var6;
        }
        d4Var2.S.setEnabled(l.a(this.f22126v0, "0"));
    }

    private final void R1(String str) {
        String b10 = X1().b("nex_parivahan", getString(R.string.app_name));
        l.c(b10);
        oi.g.n1(this, b10, str, 0, (String) null, (String) null, new b(this), 24, (Object) null);
    }

    /* access modifiers changed from: private */
    public final ResultItemSubmit S1(ResultX resultX) {
        ServicesRequested servicesRequested = r0;
        ServicesRequested servicesRequested2 = new ServicesRequested("", "513", "515", "", "", (String) null, (String) null, (String) null, (String) null, (String) null, 992, (cm.g) null);
        ResultItemSubmit resultItemSubmit = new ResultItemSubmit(resultX.getFatherName(), resultX.getDateofBirth(), resultX.getNote2(), resultX.getNTValidities(), resultX.getNote3(), resultX.getNote4(), resultX.getApplicationNo(), resultX.getApplicantAddress(), resultX.getDlno(), resultX.getReferenceLink(), resultX.getBarCode(), resultX.getApplicantGender(), servicesRequested, resultX.getDLCOVNames(), resultX.getDocumentaryProofsRequired(), resultX.getRtoLocation(), resultX.getApplicantname(), resultX.getNote1(), "", "", resultX.getBloodGroup(), resultX.getBloodGroup(), "", resultX.isFaceless(), resultX.getLlReqforRetestMsg());
        Log.d("requestObj", resultItemSubmit.toString());
        return resultItemSubmit;
    }

    private final void l2() {
        String str;
        int i10;
        String str2;
        d4 d4Var = null;
        if (getIntent() != null) {
            try {
                this.Q = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
                this.R = String.valueOf(getIntent().getStringExtra("allowAddrChangeAtDlservReqst"));
                Log.d("valuesDup", this.Q + '-' + this.R);
                this.S = String.valueOf(getIntent().getStringExtra("DL"));
                this.T = String.valueOf(getIntent().getStringExtra("dob"));
                this.U = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                L2((DldetobjX) serializableExtra);
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.V = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("lastEndorsedRTOCode");
                l.d(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.X = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("lastEndorsedState");
                l.d(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.W = stringExtra3;
                String stringExtra4 = getIntent().getStringExtra("lastEndorseStateCode");
                l.d(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.Y = stringExtra4;
                String stringExtra5 = getIntent().getStringExtra("purCode");
                l.d(stringExtra5, "null cannot be cast to non-null type kotlin.String");
                this.f22123s0 = stringExtra5;
                String stringExtra6 = getIntent().getStringExtra("state_value");
                l.d(stringExtra6, "null cannot be cast to non-null type kotlin.String");
                this.Z = stringExtra6;
                Serializable serializableExtra2 = getIntent().getSerializableExtra("whatServiceRequired");
                l.d(serializableExtra2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String?, kotlin.String?> }");
                this.M = (HashMap) serializableExtra2;
                d4 d4Var2 = this.J;
                if (d4Var2 == null) {
                    l.v("mBinding");
                    d4Var2 = null;
                }
                d4Var2.f25856x.setText(X1().b("dl_no", "DL No. : ") + ' ' + this.S);
                if (U1().getBioImgObj().getBiPhoto() == null) {
                    d4 d4Var3 = this.J;
                    if (d4Var3 == null) {
                        l.v("mBinding");
                        d4Var3 = null;
                    }
                    d4Var3.Q.setVisibility(8);
                    d4 d4Var4 = this.J;
                    if (d4Var4 == null) {
                        l.v("mBinding");
                        d4Var4 = null;
                    }
                    d4Var4.B.setVisibility(0);
                } else {
                    d4 d4Var5 = this.J;
                    if (d4Var5 == null) {
                        l.v("mBinding");
                        d4Var5 = null;
                    }
                    d4Var5.Q.setVisibility(0);
                    d4 d4Var6 = this.J;
                    if (d4Var6 == null) {
                        l.v("mBinding");
                        d4Var6 = null;
                    }
                    d4Var6.B.setVisibility(8);
                    d4 d4Var7 = this.J;
                    if (d4Var7 == null) {
                        l.v("mBinding");
                        d4Var7 = null;
                    }
                    d4Var7.H.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(U1().getBioImgObj().getBiPhoto()));
                }
                if (!l.a(this.Z, "same") || p.o(this.Q, "S", true)) {
                    this.f22115k0 = String.valueOf(getIntent().getStringExtra("presHouseNo"));
                    this.f22116l0 = String.valueOf(getIntent().getStringExtra("presStreet"));
                    this.f22117m0 = String.valueOf(getIntent().getStringExtra("presLocation"));
                    this.f22118n0 = String.valueOf(getIntent().getStringExtra("presVillageOrTown"));
                    this.f22119o0 = String.valueOf(getIntent().getStringExtra("presSubDistrict"));
                    this.f22120p0 = String.valueOf(getIntent().getStringExtra("presDistrict"));
                    this.f22121q0 = String.valueOf(getIntent().getStringExtra("presState"));
                    this.f22122r0 = String.valueOf(getIntent().getStringExtra("presPincode"));
                    this.f22107c0 = String.valueOf(getIntent().getStringExtra("perHouseNo"));
                    this.f22108d0 = String.valueOf(getIntent().getStringExtra("perStreet"));
                    this.f22109e0 = String.valueOf(getIntent().getStringExtra("perLocation"));
                    this.f22110f0 = String.valueOf(getIntent().getStringExtra("permVillageOrTown"));
                    this.f22111g0 = String.valueOf(getIntent().getStringExtra("perSubDistrict"));
                    this.f22112h0 = String.valueOf(getIntent().getStringExtra("perDistrict"));
                    this.f22113i0 = String.valueOf(getIntent().getStringExtra("perState"));
                    this.f22114j0 = String.valueOf(getIntent().getStringExtra("perPinCode"));
                }
            } catch (Exception unused) {
            }
        }
        d4 d4Var8 = this.J;
        if (d4Var8 == null) {
            l.v("mBinding");
            d4Var8 = null;
        }
        TextView textView = d4Var8.Z;
        d4 d4Var9 = this.J;
        if (d4Var9 == null) {
            l.v("mBinding");
            d4Var9 = null;
        }
        textView.setPaintFlags(d4Var9.Z.getPaintFlags() | 8);
        d4 d4Var10 = this.J;
        if (d4Var10 == null) {
            l.v("mBinding");
            d4Var10 = null;
        }
        d4Var10.Z.setOnClickListener(new o(this));
        R2((pi.d) new u0((x0) this, (u0.b) new pi.a(new pi.b(e2()))).a(pi.d.class));
        f2().k().g(this, new qj.b(this));
        f2().j().g(this, new h(new c(this)));
        if (l.a(k2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                O2(CombineServiceInterface.f8704a.a(this));
                this.M0 = (ab.d) new u0((x0) this, (u0.b) new ab.b(new ab.a(d2()))).a(ab.d.class);
                this.L0 = getIntent().getIntExtra("serialNo", 0);
                Serializable serializableExtra3 = getIntent().getSerializableExtra("multiList");
                l.d(serializableExtra3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                T2((ArrayList) serializableExtra3);
                Serializable serializableExtra4 = getIntent().getSerializableExtra("listHeaderSteps");
                l.d(serializableExtra4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                N2((ArrayList) serializableExtra4);
                Serializable serializableExtra5 = getIntent().getSerializableExtra("COA");
                l.d(serializableExtra5, "null cannot be cast to non-null type kotlin.Boolean");
                this.I0 = ((Boolean) serializableExtra5).booleanValue();
                String stringExtra7 = getIntent().getStringExtra("metaflag");
                l.d(stringExtra7, "null cannot be cast to non-null type kotlin.String");
                this.J0 = stringExtra7;
                if (this.L0 == i2().size()) {
                    d4 d4Var11 = this.J;
                    if (d4Var11 == null) {
                        l.v("mBinding");
                        d4Var11 = null;
                    }
                    d4Var11.G.setText(X1().b("vahan_btn_submit", "Submit"));
                    d4 d4Var12 = this.J;
                    if (d4Var12 == null) {
                        l.v("mBinding");
                        d4Var12 = null;
                    }
                    d4Var12.Y.setVisibility(0);
                    d4 d4Var13 = this.J;
                    if (d4Var13 == null) {
                        l.v("mBinding");
                        d4Var13 = null;
                    }
                    d4Var13.f25855w.setVisibility(0);
                    d4 d4Var14 = this.J;
                    if (d4Var14 == null) {
                        l.v("mBinding");
                        d4Var14 = null;
                    }
                    d4Var14.f25857y.setVisibility(0);
                    str = "Y";
                } else {
                    d4 d4Var15 = this.J;
                    if (d4Var15 == null) {
                        l.v("mBinding");
                        d4Var15 = null;
                    }
                    d4Var15.G.setText(X1().b("btn_dl_serv_next", "Next"));
                    d4 d4Var16 = this.J;
                    if (d4Var16 == null) {
                        l.v("mBinding");
                        d4Var16 = null;
                    }
                    d4Var16.Y.setVisibility(8);
                    d4 d4Var17 = this.J;
                    if (d4Var17 == null) {
                        l.v("mBinding");
                        d4Var17 = null;
                    }
                    d4Var17.f25855w.setVisibility(8);
                    d4 d4Var18 = this.J;
                    if (d4Var18 == null) {
                        l.v("mBinding");
                        d4Var18 = null;
                    }
                    d4Var18.f25857y.setVisibility(8);
                    str = "N";
                }
                this.O = str;
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowMetrics a10 = getWindowManager().getMaximumWindowMetrics();
                    l.e(a10, "getMaximumWindowMetrics(...)");
                    Rect a11 = a10.getBounds();
                    l.e(a11, "getBounds(...)");
                    i10 = a11.right;
                    this.K0 = i10;
                    str2 = "Width";
                } else {
                    i10 = getResources().getDisplayMetrics().widthPixels;
                    this.K0 = i10;
                    str2 = "Width 1";
                }
                Log.d(str2, String.valueOf(i10));
                if (l.a(k2().b(), VContant.MULTISERVICE_PURPOSE_CODE) && c2().size() > 1) {
                    d4 d4Var19 = this.J;
                    if (d4Var19 == null) {
                        l.v("mBinding");
                        d4Var19 = null;
                    }
                    d4Var19.L.setLayoutManager(new LinearLayoutManager(this, 0, false));
                    ArrayList c22 = c2();
                    int i11 = this.L0;
                    int i12 = this.K0;
                    String b10 = X1().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL");
                    l.c(b10);
                    bb.a aVar = new bb.a(c22, this, i11, i12, b10);
                    d4 d4Var20 = this.J;
                    if (d4Var20 == null) {
                        l.v("mBinding");
                        d4Var20 = null;
                    }
                    d4Var20.L.setAdapter(aVar);
                }
            } catch (Exception unused2) {
            }
        }
        if (l.a(k2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (c2().size() == 1) {
                    d4 d4Var21 = this.J;
                    if (d4Var21 == null) {
                        l.v("mBinding");
                        d4Var21 = null;
                    }
                    d4Var21.K.f29580g.setText((CharSequence) c2().get(0));
                    d4 d4Var22 = this.J;
                    if (d4Var22 == null) {
                        l.v("mBinding");
                        d4Var22 = null;
                    }
                    d4Var22.K.f29579f.setVisibility(8);
                } else {
                    d4 d4Var23 = this.J;
                    if (d4Var23 == null) {
                        l.v("mBinding");
                        d4Var23 = null;
                    }
                    TextView textView2 = d4Var23.K.f29580g;
                    String b11 = X1().b("dl_services", getString(R.string.dl_services));
                    l.c(b11);
                    textView2.setText(b11);
                    d4 d4Var24 = this.J;
                    if (d4Var24 == null) {
                        l.v("mBinding");
                        d4Var24 = null;
                    }
                    d4Var24.K.f29579f.setVisibility(8);
                    d4 d4Var25 = this.J;
                    if (d4Var25 == null) {
                        l.v("mBinding");
                        d4Var25 = null;
                    }
                    TextView textView3 = d4Var25.K.f29580g;
                    d4 d4Var26 = this.J;
                    if (d4Var26 == null) {
                        l.v("mBinding");
                        d4Var26 = null;
                    }
                    textView3.setPaintFlags(d4Var26.K.f29580g.getPaintFlags() | 8);
                }
            } catch (Exception unused3) {
            }
        } else {
            d4 d4Var27 = this.J;
            if (d4Var27 == null) {
                l.v("mBinding");
                d4Var27 = null;
            }
            d4Var27.K.f29580g.setText(X1().b("duplicate_cl", "Issue of Duplicate DL"));
        }
        d4 d4Var28 = this.J;
        if (d4Var28 == null) {
            l.v("mBinding");
            d4Var28 = null;
        }
        d4Var28.K.f29581h.setOnClickListener(new qj.c(this));
        d4 d4Var29 = this.J;
        if (d4Var29 == null) {
            l.v("mBinding");
            d4Var29 = null;
        }
        d4Var29.K.f29580g.setOnClickListener(new qj.d(this));
        d4 d4Var30 = this.J;
        if (d4Var30 == null) {
            l.v("mBinding");
            d4Var30 = null;
        }
        d4Var30.K.f29578e.setVisibility(8);
        d4 d4Var31 = this.J;
        if (d4Var31 == null) {
            l.v("mBinding");
            d4Var31 = null;
        }
        d4Var31.I.f25961g.setText(k2().i());
        d4 d4Var32 = this.J;
        if (d4Var32 == null) {
            l.v("mBinding");
            d4Var32 = null;
        }
        d4Var32.Z.setVisibility(0);
        d4 d4Var33 = this.J;
        if (d4Var33 == null) {
            l.v("mBinding");
        } else {
            d4Var = d4Var33;
        }
        d4Var.f25856x.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void m2(DLDuplicateActivity dLDuplicateActivity, View view) {
        l.f(dLDuplicateActivity, "this$0");
        try {
            Intent intent = new Intent(dLDuplicateActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", dLDuplicateActivity.S);
            intent.putExtra("dob", dLDuplicateActivity.T);
            intent.putExtra("DLDetails", dLDuplicateActivity.U1());
            intent.putExtra("Mobile_no", dLDuplicateActivity.U);
            intent.putExtra("lastEndorsedRTO", dLDuplicateActivity.V);
            intent.putExtra("lastEndorsedState", dLDuplicateActivity.W);
            intent.putExtra("lastEndorsedRTOCode", dLDuplicateActivity.X);
            intent.putExtra("lastEndorseStateCode", dLDuplicateActivity.Y);
            intent.putExtra("whatServiceRequired", dLDuplicateActivity.M);
            dLDuplicateActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void n2(DLDuplicateActivity dLDuplicateActivity, String str) {
        l.f(dLDuplicateActivity, "this$0");
        d4 d4Var = dLDuplicateActivity.J;
        if (d4Var == null) {
            l.v("mBinding");
            d4Var = null;
        }
        d4Var.G.c(false);
        dLDuplicateActivity.I2(dLDuplicateActivity.X1().b("service_is_not_present", dLDuplicateActivity.getString(R.string.unable_to_get_details)));
    }

    /* access modifiers changed from: private */
    public static final void o2(DLDuplicateActivity dLDuplicateActivity, View view) {
        l.f(dLDuplicateActivity, "this$0");
        try {
            Intent intent = new Intent(dLDuplicateActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", dLDuplicateActivity.S);
            intent.putExtra("dob", dLDuplicateActivity.T);
            intent.putExtra("DLDetails", dLDuplicateActivity.U1());
            intent.putExtra("Mobile_no", dLDuplicateActivity.U);
            intent.putExtra("lastEndorsedRTO", dLDuplicateActivity.V);
            intent.putExtra("lastEndorsedState", dLDuplicateActivity.W);
            intent.putExtra("lastEndorsedRTOCode", dLDuplicateActivity.X);
            intent.putExtra("lastEndorseStateCode", dLDuplicateActivity.Y);
            intent.putExtra("whatServiceRequired", dLDuplicateActivity.M);
            dLDuplicateActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void p2(DLDuplicateActivity dLDuplicateActivity, View view) {
        l.f(dLDuplicateActivity, "this$0");
        if (l.a(dLDuplicateActivity.k2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (dLDuplicateActivity.c2().size() > 1) {
                    Dialog dialog = new Dialog(dLDuplicateActivity);
                    dialog.setContentView(R.layout.layout_multi);
                    Window window = dialog.getWindow();
                    l.c(window);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    View findViewById = dialog.findViewById(R.id.service_label_cross);
                    l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                    View findViewById2 = dialog.findViewById(R.id.pop_up_close);
                    l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) findViewById2;
                    View findViewById3 = dialog.findViewById(R.id.service_label_list);
                    l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView2 = (TextView) findViewById3;
                    View findViewById4 = dialog.findViewById(R.id.service_label_list_serial);
                    l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView3 = (TextView) findViewById4;
                    View findViewById5 = dialog.findViewById(R.id.dl_services);
                    l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
                    textView.setText(dLDuplicateActivity.X1().b("btn_ok", "OK"));
                    ((TextView) findViewById5).setText(dLDuplicateActivity.X1().b("title_dl_services", "Driving Licence Services"));
                    ((ImageView) findViewById).setOnClickListener(new qj.e(dialog));
                    int size = dLDuplicateActivity.c2().size();
                    String str = "";
                    int i10 = 0;
                    String str2 = str;
                    while (i10 < size) {
                        str = str + ((String) dLDuplicateActivity.c2().get(i10)) + 10;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        i10++;
                        sb2.append(i10);
                        sb2.append(".\n");
                        str2 = sb2.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(str2);
                    textView.setOnClickListener(new qj.f(dialog));
                    Window window2 = dialog.getWindow();
                    l.c(window2);
                    window2.setGravity(48);
                    window2.setLayout(-2, -2);
                    dialog.show();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void q2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void r2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void s2() {
        this.K = (ek.a) new u0(this).a(ek.a.class);
        d4 d4Var = null;
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            ek.a aVar = this.K;
            if (aVar == null) {
                l.v("viewModel");
                aVar = null;
            }
            aVar.n("513");
        } else {
            Toast.makeText(getApplicationContext(), X1().b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
        }
        ek.a aVar2 = this.K;
        if (aVar2 == null) {
            l.v("viewModel");
            aVar2 = null;
        }
        aVar2.m().g(this, new h(new d(this)));
        ek.a aVar3 = this.K;
        if (aVar3 == null) {
            l.v("viewModel");
            aVar3 = null;
        }
        aVar3.k().g(this, new h(new e(this)));
        d4 d4Var2 = this.J;
        if (d4Var2 == null) {
            l.v("mBinding");
        } else {
            d4Var = d4Var2;
        }
        d4Var.I.f25959e.setOnClickListener(new qj.l(this));
    }

    /* access modifiers changed from: private */
    public static final void t2(DLDuplicateActivity dLDuplicateActivity, View view) {
        l.f(dLDuplicateActivity, "this$0");
        dLDuplicateActivity.finish();
    }

    private final void u2(Intent intent, String str, String str2, String str3, ArrayList arrayList) {
        try {
            intent.putExtra("DL", this.S);
            intent.putExtra("dob", this.T);
            intent.putExtra("DLDetails", U1());
            intent.putExtra("Mobile_no", this.U);
            intent.putExtra("lastEndorsedRTO", str);
            intent.putExtra("lastEndorsedState", str2);
            intent.putExtra("lastEndorsedRTOCode", this.X);
            intent.putExtra("lastEndorseStateCode", this.Y);
            intent.putExtra("whatServiceRequired", this.M);
            intent.putExtra("state_value", this.Z);
            intent.putExtra("purCode", str3);
            intent.putExtra("bioRecGenesis", this.Q);
            intent.putExtra("allowAddrChangeAtDlservReqst", this.R);
            intent.putExtra("metaflag", this.J0);
            intent.putExtra("multiList", arrayList);
            intent.putExtra("listHeaderSteps", c2());
            intent.putExtra("COA", this.I0);
            intent.putExtra("serialNo", this.L0 + 1);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void v2() {
        d4 d4Var = this.J;
        d4 d4Var2 = null;
        if (d4Var == null) {
            l.v("mBinding");
            d4Var = null;
        }
        d4Var.P.setOnClickListener(new qj.g(this));
        d4 d4Var3 = this.J;
        if (d4Var3 == null) {
            l.v("mBinding");
            d4Var3 = null;
        }
        d4Var3.f25854a0.setOnClickListener(new qj.h(this));
        d4 d4Var4 = this.J;
        if (d4Var4 == null) {
            l.v("mBinding");
            d4Var4 = null;
        }
        d4Var4.M.setOnClickListener(new i(this));
        d4 d4Var5 = this.J;
        if (d4Var5 == null) {
            l.v("mBinding");
            d4Var5 = null;
        }
        d4Var5.E.setOnClickListener(new j(this));
        d4 d4Var6 = this.J;
        if (d4Var6 == null) {
            l.v("mBinding");
        } else {
            d4Var2 = d4Var6;
        }
        d4Var2.G.setOnClickListener(new k(this));
    }

    /* access modifiers changed from: private */
    public static final void w2(DLDuplicateActivity dLDuplicateActivity, View view) {
        l.f(dLDuplicateActivity, "this$0");
        d4 d4Var = dLDuplicateActivity.J;
        d4 d4Var2 = null;
        if (d4Var == null) {
            l.v("mBinding");
            d4Var = null;
        }
        d4Var.f25854a0.setChecked(true);
        d4 d4Var3 = dLDuplicateActivity.J;
        if (d4Var3 == null) {
            l.v("mBinding");
            d4Var3 = null;
        }
        d4Var3.M.setChecked(false);
        d4 d4Var4 = dLDuplicateActivity.J;
        if (d4Var4 == null) {
            l.v("mBinding");
            d4Var4 = null;
        }
        d4Var4.f25858z.setText((CharSequence) null);
        d4 d4Var5 = dLDuplicateActivity.J;
        if (d4Var5 == null) {
            l.v("mBinding");
            d4Var5 = null;
        }
        d4Var5.E.setText((CharSequence) null);
        d4 d4Var6 = dLDuplicateActivity.J;
        if (d4Var6 == null) {
            l.v("mBinding");
            d4Var6 = null;
        }
        d4Var6.E.setContentDescription((CharSequence) null);
        d4 d4Var7 = dLDuplicateActivity.J;
        if (d4Var7 == null) {
            l.v("mBinding");
            d4Var7 = null;
        }
        d4Var7.C.setVisibility(8);
        dLDuplicateActivity.O = "Y";
        d4 d4Var8 = dLDuplicateActivity.J;
        if (d4Var8 == null) {
            l.v("mBinding");
            d4Var8 = null;
        }
        d4Var8.N.setText((CharSequence) null);
        d4 d4Var9 = dLDuplicateActivity.J;
        if (d4Var9 == null) {
            l.v("mBinding");
        } else {
            d4Var2 = d4Var9;
        }
        d4Var2.N.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void x2(DLDuplicateActivity dLDuplicateActivity, View view) {
        l.f(dLDuplicateActivity, "this$0");
        dLDuplicateActivity.O = "Y";
        d4 d4Var = dLDuplicateActivity.J;
        d4 d4Var2 = null;
        if (d4Var == null) {
            l.v("mBinding");
            d4Var = null;
        }
        d4Var.M.setChecked(false);
        d4 d4Var3 = dLDuplicateActivity.J;
        if (d4Var3 == null) {
            l.v("mBinding");
            d4Var3 = null;
        }
        d4Var3.f25854a0.setChecked(true);
        d4 d4Var4 = dLDuplicateActivity.J;
        if (d4Var4 == null) {
            l.v("mBinding");
            d4Var4 = null;
        }
        d4Var4.N.setText((CharSequence) null);
        d4 d4Var5 = dLDuplicateActivity.J;
        if (d4Var5 == null) {
            l.v("mBinding");
        } else {
            d4Var2 = d4Var5;
        }
        d4Var2.N.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void y2(DLDuplicateActivity dLDuplicateActivity, View view) {
        l.f(dLDuplicateActivity, "this$0");
        dLDuplicateActivity.O = "N";
        d4 d4Var = dLDuplicateActivity.J;
        d4 d4Var2 = null;
        if (d4Var == null) {
            l.v("mBinding");
            d4Var = null;
        }
        d4Var.M.setChecked(true);
        d4 d4Var3 = dLDuplicateActivity.J;
        if (d4Var3 == null) {
            l.v("mBinding");
            d4Var3 = null;
        }
        d4Var3.f25854a0.setChecked(false);
        d4 d4Var4 = dLDuplicateActivity.J;
        if (d4Var4 == null) {
            l.v("mBinding");
            d4Var4 = null;
        }
        d4Var4.N.setText((CharSequence) null);
        d4 d4Var5 = dLDuplicateActivity.J;
        if (d4Var5 == null) {
            l.v("mBinding");
        } else {
            d4Var2 = d4Var5;
        }
        d4Var2.N.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void z2(DLDuplicateActivity dLDuplicateActivity, View view) {
        l.f(dLDuplicateActivity, "this$0");
        dLDuplicateActivity.G2();
    }

    public final void I2(String str) {
        if (str != null) {
            String b10 = X1().b("nex_parivahan", getString(R.string.app_name));
            l.c(b10);
            String b11 = X1().b("btn_ok", getString(R.string.ok_txt));
            l.c(b11);
            oi.g.n1(this, b10, str, 1, b11, (String) null, g.f22138e, 16, (Object) null);
        }
    }

    public final void K2(String str) {
        l.f(str, "<set-?>");
        this.f22126v0 = str;
    }

    public final void L2(DldetobjX dldetobjX) {
        l.f(dldetobjX, "<set-?>");
        this.L = dldetobjX;
    }

    public final void M2(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.f22125u0 = cVar;
    }

    public final void N2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.H0 = arrayList;
    }

    public final void O2(CombineServiceInterface combineServiceInterface) {
        l.f(combineServiceInterface, "<set-?>");
        this.N0 = combineServiceInterface;
    }

    public final void P2(Context context) {
        l.f(context, "<set-?>");
        this.F0 = context;
    }

    public final void Q2(DupChangeAddInterface dupChangeAddInterface) {
        l.f(dupChangeAddInterface, "<set-?>");
        this.f22106b0 = dupChangeAddInterface;
    }

    public final void R2(pi.d dVar) {
        l.f(dVar, "<set-?>");
        this.f22105a0 = dVar;
    }

    public final void S2(ld.g gVar) {
        l.f(gVar, "<set-?>");
        this.f22124t0 = gVar;
    }

    public final String T1() {
        try {
            String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            l.e(format, "format(...)");
            return format;
        } catch (Exception e10) {
            e10.printStackTrace();
            return " ";
        }
    }

    public final void T2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.G0 = arrayList;
    }

    public final DldetobjX U1() {
        DldetobjX dldetobjX = this.L;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        l.v("dlDetails");
        return null;
    }

    public final void U2(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.P = fVar;
    }

    public final String V1() {
        return this.S;
    }

    public final String W1() {
        return this.T;
    }

    public final ld.c X1() {
        ld.c cVar = this.f22125u0;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final String Y1() {
        return this.X;
    }

    public final String Z1() {
        return this.V;
    }

    public final String a2() {
        return this.W;
    }

    public final String b2() {
        return this.Y;
    }

    public final ArrayList c2() {
        ArrayList arrayList = this.H0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("listHeaderSteps");
        return null;
    }

    public final CombineServiceInterface d2() {
        CombineServiceInterface combineServiceInterface = this.N0;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        l.v("mCombineServiceInterface");
        return null;
    }

    public final DupChangeAddInterface e2() {
        DupChangeAddInterface dupChangeAddInterface = this.f22106b0;
        if (dupChangeAddInterface != null) {
            return dupChangeAddInterface;
        }
        l.v("mDlService");
        return null;
    }

    public final pi.d f2() {
        pi.d dVar = this.f22105a0;
        if (dVar != null) {
            return dVar;
        }
        l.v("mDupChangeAddVM");
        return null;
    }

    public final ld.g g2() {
        ld.g gVar = this.f22124t0;
        if (gVar != null) {
            return gVar;
        }
        l.v("mSessionmanger");
        return null;
    }

    public final String h2() {
        return this.U;
    }

    public final ArrayList i2() {
        ArrayList arrayList = this.G0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("multiListName");
        return null;
    }

    public final String j2() {
        return this.f22123s0;
    }

    public final ld.f k2() {
        ld.f fVar = this.P;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_duplicate_dl);
        l.e(f10, "setContentView(...)");
        this.J = (d4) f10;
        P2(this);
        Q2(DupChangeAddInterface.f21661a.a(this));
        U2(new ld.f(this));
        e.a aVar = v9.e.f17509a;
        d4 d4Var = this.J;
        d4 d4Var2 = null;
        if (d4Var == null) {
            l.v("mBinding");
            d4Var = null;
        }
        aVar.E0(this, d4Var);
        S2(new ld.g(this));
        M2(new ld.c(this));
        l2();
        s2();
        v2();
        Q1();
        if (l.a(k2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            C2();
        }
        d4 d4Var3 = this.J;
        if (d4Var3 == null) {
            l.v("mBinding");
        } else {
            d4Var2 = d4Var3;
        }
        d4Var2.K.f29577d.setOnClickListener(new qj.a(this));
    }
}
