package com.nic.mparivahan.dlservices.ui.replacementdl;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.h;
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
import com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAInterface;
import com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAModel.RepCOAPojo;
import com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAModel.ResultX;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import com.nic.mparivahan.dlservices.data.model.ServicesRequested;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName;
import com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity;
import com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;
import com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity;
import com.nic.mparivahan.dlservices.ui.hillService.HillReligion;
import com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity;
import dk.i;
import dk.j;
import dk.k;
import dk.n;
import dk.o;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import ni.b3;
import pl.x;

public final class DLReplecementActivity extends oi.g {
    private String A0 = "";
    private String B0 = "";
    private String C0 = "";
    private String D0 = "N";
    public Context E0;
    public ArrayList F0;
    public ArrayList G0;
    private boolean H0;
    private String I0 = "";
    /* access modifiers changed from: private */
    public b3 J;
    private int J0;
    private ek.a K;
    private int K0;
    private String L;
    private ab.d L0;
    private String M;
    public CombineServiceInterface M0;
    private String N;
    private String O;
    private String P;
    private HashMap Q = new HashMap();
    public DldetobjX R;
    /* access modifiers changed from: private */
    public String S = "";
    /* access modifiers changed from: private */
    public String T = "Y";
    public ld.f U;
    private String V = "";
    private String W = "";
    private String X = "";
    private String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f22313a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f22314b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private String f22315c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    private String f22316d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private String f22317e0 = "";

    /* renamed from: f0  reason: collision with root package name */
    private String f22318f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    private String f22319g0 = "";

    /* renamed from: h0  reason: collision with root package name */
    private String f22320h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    private String f22321i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    private String f22322j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private String f22323k0 = "";

    /* renamed from: l0  reason: collision with root package name */
    private String f22324l0 = "";

    /* renamed from: m0  reason: collision with root package name */
    private String f22325m0 = "";

    /* renamed from: n0  reason: collision with root package name */
    private String f22326n0 = "";

    /* renamed from: o0  reason: collision with root package name */
    private String f22327o0 = "";

    /* renamed from: p0  reason: collision with root package name */
    private String f22328p0 = "0";

    /* renamed from: q0  reason: collision with root package name */
    public ri.c f22329q0;

    /* renamed from: r0  reason: collision with root package name */
    public RepCOAInterface f22330r0;

    /* renamed from: s0  reason: collision with root package name */
    public ld.g f22331s0;

    /* renamed from: t0  reason: collision with root package name */
    private String f22332t0 = "0";

    /* renamed from: u0  reason: collision with root package name */
    public ld.c f22333u0;

    /* renamed from: v0  reason: collision with root package name */
    private String f22334v0 = "N";

    /* renamed from: w0  reason: collision with root package name */
    private String f22335w0 = "N";

    /* renamed from: x0  reason: collision with root package name */
    private String f22336x0 = "";

    /* renamed from: y0  reason: collision with root package name */
    private String f22337y0 = "";

    /* renamed from: z0  reason: collision with root package name */
    private String f22338z0 = "";

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLReplecementActivity f22339e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f22340f;

        a(DLReplecementActivity dLReplecementActivity, u uVar) {
            this.f22339e = dLReplecementActivity;
            this.f22340f = uVar;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            this.f22339e.I2(((AppCatPojo) ((ArrayList) this.f22340f.f20234e).get(i10)).getAppCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLReplecementActivity f22341e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DLReplecementActivity dLReplecementActivity) {
            super(1);
            this.f22341e = dLReplecementActivity;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:19|20|21|22|23|(1:25)|26|48) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00ad */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00bd A[Catch:{ Exception -> 0x0137 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r27) {
            /*
                r26 = this;
                r0 = r26
                r1 = 2132019337(0x7f140889, float:1.9677006E38)
                com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity r2 = r0.f22341e     // Catch:{ Exception -> 0x0137 }
                ni.b3 r2 = r2.J     // Catch:{ Exception -> 0x0137 }
                r3 = 0
                if (r2 != 0) goto L_0x0014
                java.lang.String r2 = "mBinding"
                cm.l.v(r2)     // Catch:{ Exception -> 0x0137 }
                r2 = r3
            L_0x0014:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r2 = r2.A     // Catch:{ Exception -> 0x0137 }
                r4 = 0
                r2.c(r4)     // Catch:{ Exception -> 0x0137 }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r2 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x0137 }
                if (r2 == 0) goto L_0x0025
                java.lang.String r2 = r2.getStatusCode()     // Catch:{ Exception -> 0x0137 }
                goto L_0x0026
            L_0x0025:
                r2 = r3
            L_0x0026:
                java.lang.String r5 = "00"
                r6 = 2
                boolean r2 = km.p.p(r2, r5, r4, r6, r3)     // Catch:{ Exception -> 0x0137 }
                if (r2 == 0) goto L_0x00fc
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r2 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x0137 }
                if (r2 == 0) goto L_0x014c
                java.util.List r2 = r2.getResult()     // Catch:{ Exception -> 0x0137 }
                if (r2 == 0) goto L_0x014c
                java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ Exception -> 0x0137 }
                boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0137 }
                r3 = 1
                r2 = r2 ^ r3
                if (r2 != r3) goto L_0x014c
                com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r5 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x0137 }
                r5.<init>()     // Catch:{ Exception -> 0x0137 }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r2 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x0137 }
                java.util.List r2 = r2.getResult()     // Catch:{ Exception -> 0x0137 }
                java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x0137 }
                r7 = r2
                com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r7 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r7     // Catch:{ Exception -> 0x0137 }
                if (r7 == 0) goto L_0x014c
                com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity r6 = r0.f22341e     // Catch:{ Exception -> 0x0137 }
                com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r8 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x00ad }
                java.lang.String r10 = "1234"
                java.lang.String r11 = "S"
                java.lang.String r12 = r7.getApplicationDate()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r2 = r7.getApplicationNo()     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r2)     // Catch:{ Exception -> 0x00ad }
                long r13 = java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x00ad }
                ld.g r2 = r6.e2()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r2 = r2.k()     // Catch:{ Exception -> 0x00ad }
                int r15 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x00ad }
                java.lang.String r16 = r7.getDateofBirth()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r17 = r7.getDlno()     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r17)     // Catch:{ Exception -> 0x00ad }
                java.lang.String r18 = "N"
                java.lang.String r19 = "N"
                java.lang.String r20 = r7.getApplicantGender()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r21 = r6.f2()     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r21)     // Catch:{ Exception -> 0x00ad }
                r22 = 0
                java.lang.String r23 = r6.h2()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r24 = r6.S     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r24)     // Catch:{ Exception -> 0x00ad }
                java.lang.String r25 = r6.Z1()     // Catch:{ Exception -> 0x00ad }
                r9 = r6
                r8.a(r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x00ad }
            L_0x00ad:
                ld.f r2 = r6.i2()     // Catch:{ Exception -> 0x0137 }
                java.lang.String r2 = r2.b()     // Catch:{ Exception -> 0x0137 }
                java.lang.String r3 = "950"
                boolean r2 = cm.l.a(r2, r3)     // Catch:{ Exception -> 0x0137 }
                if (r2 != 0) goto L_0x00d4
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0137 }
                r2.<init>()     // Catch:{ Exception -> 0x0137 }
                r6.R2(r2)     // Catch:{ Exception -> 0x0137 }
                java.util.ArrayList r2 = r6.g2()     // Catch:{ Exception -> 0x0137 }
                ld.f r3 = r6.i2()     // Catch:{ Exception -> 0x0137 }
                java.lang.String r3 = r3.i()     // Catch:{ Exception -> 0x0137 }
                r2.add(r3)     // Catch:{ Exception -> 0x0137 }
            L_0x00d4:
                java.lang.String r8 = r6.S     // Catch:{ Exception -> 0x0137 }
                com.nic.mparivahan.Dl.Model.DldetobjX r9 = r6.T1()     // Catch:{ Exception -> 0x0137 }
                java.lang.String r10 = r6.U1()     // Catch:{ Exception -> 0x0137 }
                java.lang.String r11 = r6.V1()     // Catch:{ Exception -> 0x0137 }
                java.lang.String r12 = r6.f2()     // Catch:{ Exception -> 0x0137 }
                java.lang.String r13 = r6.X1()     // Catch:{ Exception -> 0x0137 }
                java.lang.String r14 = r6.Y1()     // Catch:{ Exception -> 0x0137 }
                java.lang.String r15 = r6.Z1()     // Catch:{ Exception -> 0x0137 }
                java.util.ArrayList r16 = r6.g2()     // Catch:{ Exception -> 0x0137 }
                r5.E2(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0137 }
                goto L_0x014c
            L_0x00fc:
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r2 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x0137 }
                if (r2 == 0) goto L_0x0107
                java.lang.String r2 = r2.getReqStatus()     // Catch:{ Exception -> 0x0137 }
                goto L_0x0108
            L_0x0107:
                r2 = r3
            L_0x0108:
                if (r2 == 0) goto L_0x0124
                int r2 = r2.length()     // Catch:{ Exception -> 0x0137 }
                if (r2 != 0) goto L_0x0111
                goto L_0x0124
            L_0x0111:
                com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity r2 = r0.f22341e     // Catch:{ Exception -> 0x0137 }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r4 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x0137 }
                if (r4 == 0) goto L_0x011d
                java.lang.String r3 = r4.getReqStatus()     // Catch:{ Exception -> 0x0137 }
            L_0x011d:
                cm.l.c(r3)     // Catch:{ Exception -> 0x0137 }
            L_0x0120:
                r2.G2(r3)     // Catch:{ Exception -> 0x0137 }
                goto L_0x014c
            L_0x0124:
                com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity r2 = r0.f22341e     // Catch:{ Exception -> 0x0137 }
                ld.c r3 = r2.W1()     // Catch:{ Exception -> 0x0137 }
                java.lang.String r4 = "label_want_to_proceed"
                com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity r5 = r0.f22341e     // Catch:{ Exception -> 0x0137 }
                java.lang.String r5 = r5.getString(r1)     // Catch:{ Exception -> 0x0137 }
                java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0137 }
                goto L_0x0120
            L_0x0137:
                com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity r2 = r0.f22341e
                ld.c r3 = r2.W1()
                com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity r4 = r0.f22341e
                java.lang.String r1 = r4.getString(r1)
                java.lang.String r4 = "service_is_not_present"
                java.lang.String r1 = r3.b(r4, r1)
                r2.G2(r1)
            L_0x014c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity.b.b(com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetAckDetForGivenDLNumberResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLReplecementActivity f22342e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DLReplecementActivity dLReplecementActivity) {
            super(1);
            this.f22342e = dLReplecementActivity;
        }

        public final void b(RepCOAPojo repCOAPojo) {
            DLReplecementActivity dLReplecementActivity;
            String b10;
            DLReplecementActivity dLReplecementActivity2;
            b3 b3Var = null;
            try {
                b3 M1 = this.f22342e.J;
                if (M1 == null) {
                    l.v("mBinding");
                    M1 = null;
                }
                M1.A.c(false);
                Log.d("reponse_val", repCOAPojo.toString());
                if (p.o(repCOAPojo.getResult().getStatus_code(), "00", true)) {
                    DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                    ResultX resultX = repCOAPojo.getResult().getResult().get(0);
                    if (resultX != null) {
                        DLReplecementActivity dLReplecementActivity3 = this.f22342e;
                        DlLogCapture.a aVar = DlLogCapture.f21655k;
                        String S1 = dLReplecementActivity3.S1();
                        String applicationNo = resultX.getApplicationNo();
                        l.c(applicationNo);
                        long parseLong = Long.parseLong(applicationNo);
                        int parseInt = Integer.parseInt(dLReplecementActivity3.e2().k());
                        String dateofBirth = resultX.getDateofBirth();
                        String dlno = resultX.getDlno();
                        l.c(dlno);
                        String applicantGender = resultX.getApplicantGender();
                        String f22 = dLReplecementActivity3.f2();
                        l.c(f22);
                        String h22 = dLReplecementActivity3.h2();
                        String L1 = dLReplecementActivity3.S;
                        l.c(L1);
                        DLReplecementActivity dLReplecementActivity4 = dLReplecementActivity3;
                        aVar.a(dLReplecementActivity3, "1234", "S", S1, parseLong, parseInt, dateofBirth, dlno, "N", "N", applicantGender, f22, false, h22, L1, dLReplecementActivity3.Z1());
                        if (!l.a(dLReplecementActivity4.i2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                            dLReplecementActivity2 = dLReplecementActivity4;
                            dLReplecementActivity2.R2(new ArrayList());
                            dLReplecementActivity2.g2().add(dLReplecementActivity2.i2().i());
                        } else {
                            dLReplecementActivity2 = dLReplecementActivity4;
                        }
                        dLServiceAcknowlegementActivity.E2(dLReplecementActivity2, dLReplecementActivity2.R1(resultX), dLReplecementActivity2.S, dLReplecementActivity2.T1(), dLReplecementActivity2.U1(), dLReplecementActivity2.V1(), dLReplecementActivity2.f2(), dLReplecementActivity2.X1(), dLReplecementActivity2.Y1(), dLReplecementActivity2.Z1(), dLReplecementActivity2.g2());
                        return;
                    }
                    return;
                }
                String reqStatus = repCOAPojo.getResult().getReqStatus();
                if (reqStatus != null) {
                    if (reqStatus.length() != 0) {
                        dLReplecementActivity = this.f22342e;
                        b10 = repCOAPojo.getResult().getReqStatus();
                        dLReplecementActivity.G2(b10);
                    }
                }
                dLReplecementActivity = this.f22342e;
                b10 = dLReplecementActivity.W1().b("label_want_to_proceed", this.f22342e.getString(R.string.unable_to_get_details));
                dLReplecementActivity.G2(b10);
            } catch (Exception unused) {
                b3 M12 = this.f22342e.J;
                if (M12 == null) {
                    l.v("mBinding");
                } else {
                    b3Var = M12;
                }
                b3Var.A.c(false);
                DLReplecementActivity dLReplecementActivity5 = this.f22342e;
                dLReplecementActivity5.G2(dLReplecementActivity5.W1().b("label_want_to_proceed", this.f22342e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RepCOAPojo) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLReplecementActivity f22343e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DLReplecementActivity dLReplecementActivity) {
            super(1);
            this.f22343e = dLReplecementActivity;
        }

        public final void b(String str) {
            l.f(str, "it");
            if (p.o(str, "yes", true)) {
                b3 M1 = this.f22343e.J;
                if (M1 == null) {
                    l.v("mBinding");
                    M1 = null;
                }
                M1.A.c(true);
                if (l.a(this.f22343e.T, "Y")) {
                    this.f22343e.T2();
                } else {
                    this.f22343e.w2();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLReplecementActivity f22344e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DLReplecementActivity dLReplecementActivity) {
            super(1);
            this.f22344e = dLReplecementActivity;
        }

        public final void b(String str) {
            l.f(str, "it");
            if (p.o(str, "yes", true)) {
                b3 M1 = this.f22344e.J;
                if (M1 == null) {
                    l.v("mBinding");
                    M1 = null;
                }
                M1.A.c(true);
                if (l.a(this.f22344e.T, "Y")) {
                    this.f22344e.T2();
                } else {
                    this.f22344e.w2();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final f f22345e = new f();

        f() {
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

    static final class g implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f22346a;

        g(bm.l lVar) {
            l.f(lVar, "function");
            this.f22346a = lVar;
        }

        public final pl.c a() {
            return this.f22346a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22346a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void A2(DLReplecementActivity dLReplecementActivity, View view) {
        l.f(dLReplecementActivity, "this$0");
        Intent intent = new Intent(dLReplecementActivity, DlServiceDetailsActivity.class);
        intent.putExtra("DL", dLReplecementActivity.N);
        intent.putExtra("dob", dLReplecementActivity.O);
        intent.putExtra("DLDetails", dLReplecementActivity.T1());
        intent.putExtra("Mobile_no", dLReplecementActivity.P);
        intent.putExtra("lastEndorsedRTO", dLReplecementActivity.V);
        intent.putExtra("lastEndorsedState", dLReplecementActivity.W);
        intent.putExtra("lastEndorsedRTOCode", dLReplecementActivity.S);
        intent.putExtra("lastEndorseStateCode", dLReplecementActivity.X);
        intent.putExtra("whatServiceRequired", dLReplecementActivity.Q);
        dLReplecementActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void B2(DLReplecementActivity dLReplecementActivity, View view) {
        l.f(dLReplecementActivity, "this$0");
        dLReplecementActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void C2(DLReplecementActivity dLReplecementActivity, View view) {
        l.f(dLReplecementActivity, "this$0");
        if (l.a(dLReplecementActivity.i2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (dLReplecementActivity.a2().size() > 1) {
                    Dialog dialog = new Dialog(dLReplecementActivity);
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
                    textView.setText(dLReplecementActivity.W1().b("btn_ok", "OK"));
                    ((TextView) findViewById5).setText(dLReplecementActivity.W1().b("title_dl_services", "Driving Licence Services"));
                    ((ImageView) findViewById).setOnClickListener(new dk.c(dialog));
                    int size = dLReplecementActivity.a2().size();
                    String str = "";
                    int i10 = 0;
                    String str2 = str;
                    while (i10 < size) {
                        str = str + ((String) dLReplecementActivity.a2().get(i10)) + 10;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        i10++;
                        sb2.append(i10);
                        sb2.append(".\n");
                        str2 = sb2.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(str2);
                    textView.setOnClickListener(new dk.d(dialog));
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
    public static final void D2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void E2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void F2(String str) {
        if (!l.a(this.f22327o0, "same") || l.a(this.L, "S")) {
            String str2 = "NA";
            b3 b3Var = null;
            if (l.a(this.f22327o0, "same") && l.a(this.L, "S") && l.a(this.M, "Y")) {
                b3 b3Var2 = this.J;
                if (b3Var2 == null) {
                    l.v("mBinding");
                    b3Var2 = null;
                }
                b3Var2.A.c(true);
                if (l.a(this.T, "Y")) {
                    b3 b3Var3 = this.J;
                    if (b3Var3 == null) {
                        l.v("mBinding");
                    } else {
                        b3Var = b3Var3;
                    }
                    str2 = String.valueOf(b3Var.H.getText());
                }
                ri.c d22 = d2();
                String obj = q.B0(String.valueOf(this.N)).toString();
                String str3 = obj;
                l.c(obj);
                String str4 = this.O;
                String str5 = str4;
                l.c(str4);
                String str6 = this.S;
                String str7 = str6;
                l.c(str6);
                String str8 = this.T;
                String str9 = str8;
                l.c(str8);
                String str10 = this.Y;
                String str11 = str10;
                l.c(str10);
                String str12 = this.Z;
                String str13 = str12;
                l.c(str12);
                String str14 = this.f22313a0;
                String str15 = str14;
                l.c(str14);
                String str16 = this.f22314b0;
                String str17 = str16;
                l.c(str16);
                String str18 = this.f22316d0;
                String str19 = str18;
                l.c(str18);
                String str20 = this.f22315c0;
                String str21 = str20;
                l.c(str20);
                String str22 = this.f22317e0;
                String str23 = str22;
                l.c(str22);
                String str24 = this.f22318f0;
                String str25 = str24;
                l.c(str24);
                String str26 = this.f22319g0;
                String str27 = str26;
                l.c(str26);
                String str28 = this.f22320h0;
                String str29 = str28;
                l.c(str28);
                String str30 = this.f22321i0;
                String str31 = str30;
                l.c(str30);
                String str32 = this.f22322j0;
                String str33 = str32;
                l.c(str32);
                String str34 = this.f22323k0;
                String str35 = str34;
                l.c(str34);
                String str36 = this.f22324l0;
                String str37 = str36;
                l.c(str36);
                String str38 = this.f22325m0;
                String str39 = str38;
                l.c(str38);
                String str40 = this.f22326n0;
                String str41 = str40;
                l.c(str40);
                String str42 = this.P;
                l.c(str42);
                d22.j(str3, str5, str7, str2, str9, "99", "B", str11, str13, str15, str17, str19, str21, str23, str25, str27, str29, str31, str33, str35, str37, str39, str41, str42, i2().f(), i2().g(), i2().e(), i2().h());
            } else if (!l.a(this.f22327o0, "same") || !l.a(this.L, "S") || l.a(this.M, "Y")) {
                b3 b3Var4 = this.J;
                if (b3Var4 == null) {
                    l.v("mBinding");
                    b3Var4 = null;
                }
                b3Var4.A.c(true);
                if (l.a(this.T, "Y")) {
                    b3 b3Var5 = this.J;
                    if (b3Var5 == null) {
                        l.v("mBinding");
                    } else {
                        b3Var = b3Var5;
                    }
                    str2 = String.valueOf(b3Var.H.getText());
                }
                String str43 = str2;
                ri.c d23 = d2();
                String obj2 = q.B0(String.valueOf(this.N)).toString();
                l.c(obj2);
                String str44 = this.O;
                l.c(str44);
                String str45 = this.S;
                l.c(str45);
                String str46 = this.T;
                l.c(str46);
                String str47 = this.f22332t0;
                String str48 = this.Y;
                l.c(str48);
                String str49 = this.Z;
                l.c(str49);
                String str50 = this.f22313a0;
                l.c(str50);
                String str51 = this.f22314b0;
                l.c(str51);
                String str52 = this.f22316d0;
                l.c(str52);
                String str53 = this.f22315c0;
                l.c(str53);
                String str54 = this.f22317e0;
                l.c(str54);
                String str55 = this.f22318f0;
                l.c(str55);
                String str56 = str55;
                String str57 = this.f22319g0;
                l.c(str57);
                String str58 = str57;
                String str59 = this.f22320h0;
                l.c(str59);
                String str60 = str59;
                String str61 = this.f22321i0;
                l.c(str61);
                String str62 = str61;
                String str63 = this.f22322j0;
                l.c(str63);
                String str64 = str63;
                String str65 = this.f22323k0;
                l.c(str65);
                String str66 = str65;
                String str67 = this.f22324l0;
                l.c(str67);
                String str68 = str67;
                String str69 = this.f22325m0;
                l.c(str69);
                String str70 = str69;
                String str71 = this.f22326n0;
                l.c(str71);
                String str72 = str71;
                String str73 = this.P;
                l.c(str73);
                d23.i(obj2, str44, str45, str43, str46, "99", "Reasons are not defined", str47, "B", str48, str49, str50, str51, str52, str53, str54, str56, str58, str60, str62, str64, str66, str68, str70, str72, "DelhTrans", "d9fe1613399b0883e4ecf3f710e18317", "0.0.0.0", "sarathiservice", str73, i2().f(), i2().g(), i2().e(), i2().h());
            } else {
                String b10 = W1().b("nex_parivahan", getString(R.string.app_name));
                l.c(b10);
                oi.g.n1(this, b10, str, 0, (String) null, (String) null, new e(this), 24, (Object) null);
            }
        } else {
            try {
                String b11 = W1().b("nex_parivahan", getString(R.string.app_name));
                l.c(b11);
                oi.g.n1(this, b11, str, 0, (String) null, (String) null, new d(this), 24, (Object) null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if (cm.l.a(r11.f22332t0, "0") != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        v2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        if (cm.l.a(r11.f22332t0, "0") != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void H2() {
        /*
            r11 = this;
            ni.b3 r0 = r11.J
            r1 = 0
            java.lang.String r2 = "mBinding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            android.widget.CheckBox r0 = r0.f25442w
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = r11.T
            java.lang.String r3 = "Y"
            boolean r0 = cm.l.a(r0, r3)
            r3 = 0
            r4 = 2132019337(0x7f140889, float:1.9677006E38)
            java.lang.String r5 = "label_want_to_proceed"
            r6 = 2132019054(0x7f14076e, float:1.9676432E38)
            java.lang.String r7 = "0"
            if (r0 == 0) goto L_0x00cd
            ni.b3 r0 = r11.J
            if (r0 != 0) goto L_0x0030
            cm.l.v(r2)
            r0 = r1
        L_0x0030:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.H
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0055
            ld.c r0 = r11.W1()
            r1 = 2132017754(0x7f14025a, float:1.9673795E38)
            java.lang.String r1 = r11.getString(r1)
            java.lang.String r2 = "edit_dl_serv_emer_cont_no"
        L_0x004c:
            java.lang.String r0 = r0.b(r2, r1)
        L_0x0050:
            r11.G2(r0)
            goto L_0x00ed
        L_0x0055:
            ni.b3 r0 = r11.J
            if (r0 != 0) goto L_0x005d
            cm.l.v(r2)
            r0 = r1
        L_0x005d:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.H
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            r8 = 10
            r9 = 2132019439(0x7f1408ef, float:1.9677213E38)
            java.lang.String r10 = "edit_dl_serv_valid_emer_cont_no"
            if (r0 >= r8) goto L_0x0080
        L_0x0073:
            ld.c r0 = r11.W1()
            java.lang.String r1 = r11.getString(r9)
            java.lang.String r0 = r0.b(r10, r1)
            goto L_0x0050
        L_0x0080:
            t8.c$a r0 = t8.c.f16582a
            ni.b3 r8 = r11.J
            if (r8 != 0) goto L_0x008a
            cm.l.v(r2)
            goto L_0x008b
        L_0x008a:
            r1 = r8
        L_0x008b:
            androidx.appcompat.widget.AppCompatEditText r1 = r1.H
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r0 = r0.q(r1)
            if (r0 != 0) goto L_0x009c
            goto L_0x0073
        L_0x009c:
            com.nic.mparivahan.a$a r0 = com.nic.mparivahan.a.f9624a
            boolean r0 = r0.a(r11)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = r11.f22332t0
            boolean r0 = cm.l.a(r0, r7)
            if (r0 == 0) goto L_0x00b1
        L_0x00ac:
            java.lang.String r0 = r11.getString(r6)
            goto L_0x0050
        L_0x00b1:
            r11.v2()
            goto L_0x00ed
        L_0x00b5:
            android.content.Context r0 = r11.getApplicationContext()
            ld.c r1 = r11.W1()
            java.lang.String r2 = r11.getString(r4)
            java.lang.String r1 = r1.b(r5, r2)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r3)
            r0.show()
            goto L_0x00ed
        L_0x00cd:
            com.nic.mparivahan.a$a r0 = com.nic.mparivahan.a.f9624a
            boolean r0 = r0.a(r11)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = r11.f22332t0
            boolean r0 = cm.l.a(r0, r7)
            if (r0 == 0) goto L_0x00b1
            goto L_0x00ac
        L_0x00de:
            ld.c r0 = r11.W1()
            r1 = 2132017547(0x7f14018b, float:1.9673375E38)
            java.lang.String r1 = r11.getString(r1)
            java.lang.String r2 = "confirm_declaration"
            goto L_0x004c
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity.H2():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0121, code lost:
        if (r0 == null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0127, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0138, code lost:
        if (r0 == null) goto L_0x0123;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void Q1() {
        /*
            r11 = this;
            cm.u r0 = new cm.u
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f20234e = r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r3 = "Select Category"
            java.lang.String r4 = "0"
            r2.<init>(r4, r3)
            r3 = 0
            r1.add(r3, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r5 = "G"
            java.lang.String r6 = "General"
            r2.<init>(r5, r6)
            r5 = 1
            r1.add(r5, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r6 = "R"
            java.lang.String r7 = "Repatriate"
            r2.<init>(r6, r7)
            r6 = 2
            r1.add(r6, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r7 = "T"
            java.lang.String r8 = "Refugees"
            r2.<init>(r7, r8)
            r7 = 3
            r1.add(r7, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r7 = "X"
            java.lang.String r8 = "Ex-Servicemen"
            r2.<init>(r7, r8)
            r7 = 4
            r1.add(r7, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r7 = "F"
            java.lang.String r8 = "Foreigners (Not Diplomats)"
            r2.<init>(r7, r8)
            r7 = 5
            r1.add(r7, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r7 = "D"
            java.lang.String r8 = "Diplomats (Foreigner)"
            r2.<init>(r7, r8)
            r7 = 6
            r1.add(r7, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r7 = "O"
            java.lang.String r8 = "OCI"
            r2.<init>(r7, r8)
            r7 = 7
            r1.add(r7, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r7 = "P"
            java.lang.String r8 = "Differently Abled"
            r2.<init>(r7, r8)
            r7 = 8
            r1.add(r7, r2)
            oi.a r1 = new oi.a
            java.lang.Object r2 = r0.f20234e
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r1.<init>(r11, r2)
            ni.b3 r2 = r11.J
            java.lang.String r7 = "mBinding"
            r8 = 0
            if (r2 != 0) goto L_0x00b6
            cm.l.v(r7)
            r2 = r8
        L_0x00b6:
            android.widget.Spinner r2 = r2.M
            r2.setAdapter(r1)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            r2 = r3
        L_0x00c4:
            if (r2 >= r1) goto L_0x0103
            ld.f r9 = r11.i2()
            java.lang.String r9 = r9.a()
            java.lang.CharSequence r9 = km.q.B0(r9)
            java.lang.String r9 = r9.toString()
            java.lang.Object r10 = r0.f20234e
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r10 = r10.get(r2)
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r10 = (com.nic.mparivahan.dlservices.data.model.AppCatPojo) r10
            java.lang.String r10 = r10.getAppCode()
            java.lang.CharSequence r10 = km.q.B0(r10)
            java.lang.String r10 = r10.toString()
            boolean r9 = cm.l.a(r9, r10)
            if (r9 == 0) goto L_0x0100
            ni.b3 r1 = r11.J
            if (r1 != 0) goto L_0x00fa
            cm.l.v(r7)
            r1 = r8
        L_0x00fa:
            android.widget.Spinner r1 = r1.M
            r1.setSelection(r2)
            goto L_0x0103
        L_0x0100:
            int r2 = r2 + 1
            goto L_0x00c4
        L_0x0103:
            ni.b3 r1 = r11.J
            if (r1 != 0) goto L_0x010b
            cm.l.v(r7)
            r1 = r8
        L_0x010b:
            android.widget.Spinner r1 = r1.M
            com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity$a r2 = new com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity$a
            r2.<init>(r11, r0)
            r1.setOnItemSelectedListener(r2)
            java.lang.String r0 = r11.L
            java.lang.String r1 = "S"
            boolean r0 = km.p.p(r0, r1, r3, r6, r8)
            if (r0 == 0) goto L_0x012e
            ni.b3 r0 = r11.J
            if (r0 != 0) goto L_0x0127
        L_0x0123:
            cm.l.v(r7)
            goto L_0x0128
        L_0x0127:
            r8 = r0
        L_0x0128:
            android.widget.Spinner r0 = r8.M
            r0.setEnabled(r5)
            goto L_0x0149
        L_0x012e:
            java.lang.String r0 = r11.f22332t0
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x013b
            ni.b3 r0 = r11.J
            if (r0 != 0) goto L_0x0127
            goto L_0x0123
        L_0x013b:
            ni.b3 r0 = r11.J
            if (r0 != 0) goto L_0x0143
            cm.l.v(r7)
            goto L_0x0144
        L_0x0143:
            r8 = r0
        L_0x0144:
            android.widget.Spinner r0 = r8.M
            r0.setEnabled(r3)
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity.Q1():void");
    }

    /* access modifiers changed from: private */
    public final ResultItemSubmit R1(ResultX resultX) {
        ServicesRequested servicesRequested = r0;
        ServicesRequested servicesRequested2 = new ServicesRequested("", "", "515", "516", "", (String) null, (String) null, (String) null, (String) null, (String) null, 992, (cm.g) null);
        return new ResultItemSubmit(resultX.getFatherName(), resultX.getDateofBirth(), resultX.getNote2(), resultX.getNTValidities(), resultX.getNote3(), resultX.getNote4(), resultX.getApplicationNo(), resultX.getApplicantAddress(), resultX.getDlno(), resultX.getReferenceLink(), resultX.getBarCode(), resultX.getApplicantGender(), servicesRequested, resultX.getDLCOVNames(), resultX.getDocumentaryProofsRequired(), resultX.getRtoLocation(), resultX.getApplicantname(), resultX.getNote1(), "", "", resultX.getBloodGroup(), resultX.getBloodGroup(), "", resultX.isFaceless(), resultX.getLlReqforRetestMsg());
    }

    /* access modifiers changed from: private */
    public final void T2() {
        ek.a aVar;
        ek.a aVar2 = this.K;
        b3 b3Var = null;
        if (aVar2 == null) {
            l.v("viewModel");
            aVar = null;
        } else {
            aVar = aVar2;
        }
        String str = this.N;
        String str2 = this.O;
        String str3 = this.S;
        String str4 = this.T;
        b3 b3Var2 = this.J;
        if (b3Var2 == null) {
            l.v("mBinding");
        } else {
            b3Var = b3Var2;
        }
        String valueOf = String.valueOf(b3Var.H.getText());
        String str5 = this.P;
        l.c(str5);
        aVar.i(str, str2, str3, "99", "Reasons are not defined", str4, valueOf, str5, i2().f(), i2().g(), i2().e(), i2().h());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v30 */
    /* JADX WARNING: type inference failed for: r2v32, types: [ni.b3] */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: type inference failed for: r2v36 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j2() {
        /*
            r7 = this;
            java.lang.String r0 = "DL"
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            android.content.Intent r2 = r7.getIntent()
            if (r2 == 0) goto L_0x02a7
            android.content.Intent r2 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r3 = "bioRecGenesis"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x02a7 }
            r7.L = r2     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r2 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r3 = "allowAddrChangeAtDlservReqst"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x02a7 }
            r7.M = r2     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = "values"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a7 }
            r3.<init>()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r4 = r7.L     // Catch:{ Exception -> 0x02a7 }
            r3.append(r4)     // Catch:{ Exception -> 0x02a7 }
            r4 = 45
            r3.append(r4)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r4 = r7.M     // Catch:{ Exception -> 0x02a7 }
            r3.append(r4)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02a7 }
            android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r2 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r3 = "purCode"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch:{ Exception -> 0x02a7 }
            cm.l.d(r2, r1)     // Catch:{ Exception -> 0x02a7 }
            r7.f22328p0 = r2     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r2 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = r2.getStringExtra(r0)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x02a7 }
            r7.N = r2     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r2 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r3 = "dob"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x02a7 }
            r7.O = r2     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r2 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r3 = "Mobile_no"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x02a7 }
            r7.P = r2     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r2 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.N = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = "DLDetails"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX"
            cm.l.d(r0, r2)     // Catch:{ Exception -> 0x02a7 }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = (com.nic.mparivahan.Dl.Model.DldetobjX) r0     // Catch:{ Exception -> 0x02a7 }
            r7.J2(r0)     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = "state_value"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x02a7 }
            cm.l.d(r0, r1)     // Catch:{ Exception -> 0x02a7 }
            r7.f22327o0 = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = "lastEndorsedRTOCode"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x02a7 }
            cm.l.d(r0, r1)     // Catch:{ Exception -> 0x02a7 }
            r7.S = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = "whatServiceRequired"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String?, kotlin.String?> }"
            cm.l.d(r0, r2)     // Catch:{ Exception -> 0x02a7 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x02a7 }
            r7.Q = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = "lastEndorsedRTO"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x02a7 }
            cm.l.d(r0, r1)     // Catch:{ Exception -> 0x02a7 }
            r7.V = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = "lastEndorsedState"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x02a7 }
            cm.l.d(r0, r1)     // Catch:{ Exception -> 0x02a7 }
            r7.W = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = "lastEndorseStateCode"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x02a7 }
            cm.l.d(r0, r1)     // Catch:{ Exception -> 0x02a7 }
            r7.X = r0     // Catch:{ Exception -> 0x02a7 }
            ni.b3 r0 = r7.J     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "mBinding"
            r2 = 0
            if (r0 != 0) goto L_0x010f
            cm.l.v(r1)     // Catch:{ Exception -> 0x02a7 }
            r0 = r2
        L_0x010f:
            android.widget.TextView r0 = r0.f25443x     // Catch:{ Exception -> 0x02a7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a7 }
            r3.<init>()     // Catch:{ Exception -> 0x02a7 }
            ld.c r4 = r7.W1()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r5 = "dl_no"
            java.lang.String r6 = "DL No. : "
            java.lang.String r4 = r4.b(r5, r6)     // Catch:{ Exception -> 0x02a7 }
            r3.append(r4)     // Catch:{ Exception -> 0x02a7 }
            r4 = 32
            r3.append(r4)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r4 = r7.N     // Catch:{ Exception -> 0x02a7 }
            r3.append(r4)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02a7 }
            r0.setText(r3)     // Catch:{ Exception -> 0x02a7 }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r7.T1()     // Catch:{ Exception -> 0x02a7 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r0 = r0.getBioImgObj()     // Catch:{ Exception -> 0x02a7 }
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = r0.getBiPhoto()     // Catch:{ Exception -> 0x02a7 }
            goto L_0x0146
        L_0x0145:
            r0 = r2
        L_0x0146:
            if (r0 == 0) goto L_0x0181
            int r0 = r0.length()     // Catch:{ Exception -> 0x02a7 }
            if (r0 != 0) goto L_0x014f
            goto L_0x0181
        L_0x014f:
            ni.b3 r0 = r7.J     // Catch:{ Exception -> 0x02a7 }
            if (r0 != 0) goto L_0x0157
            cm.l.v(r1)     // Catch:{ Exception -> 0x02a7 }
            r0 = r2
        L_0x0157:
            ni.dc r0 = r0.C     // Catch:{ Exception -> 0x02a7 }
            androidx.cardview.widget.CardView r0 = r0.f25960f     // Catch:{ Exception -> 0x02a7 }
            r3 = 0
            r0.setVisibility(r3)     // Catch:{ Exception -> 0x02a7 }
            ni.b3 r0 = r7.J     // Catch:{ Exception -> 0x02a7 }
            if (r0 != 0) goto L_0x0167
            cm.l.v(r1)     // Catch:{ Exception -> 0x02a7 }
            r0 = r2
        L_0x0167:
            ni.dc r0 = r0.C     // Catch:{ Exception -> 0x02a7 }
            android.widget.ImageView r0 = r0.f25956b     // Catch:{ Exception -> 0x02a7 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r7.T1()     // Catch:{ Exception -> 0x02a7 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r1 = r1.getBioImgObj()     // Catch:{ Exception -> 0x02a7 }
            if (r1 == 0) goto L_0x0179
            java.lang.String r2 = r1.getBiPhoto()     // Catch:{ Exception -> 0x02a7 }
        L_0x0179:
            android.graphics.Bitmap r1 = com.nic.mparivahan.dlservices.utilities.d.a(r2)     // Catch:{ Exception -> 0x02a7 }
            r0.setImageBitmap(r1)     // Catch:{ Exception -> 0x02a7 }
            goto L_0x0192
        L_0x0181:
            ni.b3 r0 = r7.J     // Catch:{ Exception -> 0x02a7 }
            if (r0 != 0) goto L_0x0189
            cm.l.v(r1)     // Catch:{ Exception -> 0x02a7 }
            goto L_0x018a
        L_0x0189:
            r2 = r0
        L_0x018a:
            ni.dc r0 = r2.C     // Catch:{ Exception -> 0x02a7 }
            androidx.cardview.widget.CardView r0 = r0.f25960f     // Catch:{ Exception -> 0x02a7 }
            r1 = 4
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x02a7 }
        L_0x0192:
            java.lang.String r0 = r7.f22327o0     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "same"
            boolean r0 = cm.l.a(r0, r1)     // Catch:{ Exception -> 0x02a7 }
            if (r0 == 0) goto L_0x01a7
            java.lang.String r0 = r7.L     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "S"
            r2 = 1
            boolean r0 = km.p.o(r0, r1, r2)     // Catch:{ Exception -> 0x02a7 }
            if (r0 == 0) goto L_0x02a7
        L_0x01a7:
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "presHouseNo"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.f22319g0 = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "presStreet"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.f22320h0 = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "presLocation"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.f22321i0 = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "presVillageOrTown"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.f22322j0 = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "presSubDistrict"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.f22323k0 = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "presDistrict"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.f22324l0 = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "presState"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.f22325m0 = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "presPincode"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.f22326n0 = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "perHouseNo"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.Y = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "perStreet"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.Z = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "perLocation"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.f22313a0 = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "permVillageOrTown"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.f22314b0 = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "perSubDistrict"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.f22315c0 = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "perDistrict"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.f22316d0 = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "perState"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.f22317e0 = r0     // Catch:{ Exception -> 0x02a7 }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = "perPinCode"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r7.f22318f0 = r0     // Catch:{ Exception -> 0x02a7 }
        L_0x02a7:
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            ri.d r1 = new ri.d
            ri.a r2 = new ri.a
            com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAInterface r3 = r7.c2()
            r2.<init>(r3)
            r1.<init>(r2)
            r0.<init>((androidx.lifecycle.x0) r7, (androidx.lifecycle.u0.b) r1)
            java.lang.Class<ri.c> r1 = ri.c.class
            androidx.lifecycle.t0 r0 = r0.a(r1)
            ri.c r0 = (ri.c) r0
            r7.P2(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity.j2():void");
    }

    private final void k2() {
        this.K = (ek.a) new u0(this).a(ek.a.class);
        b3 b3Var = this.J;
        ek.a aVar = null;
        if (b3Var == null) {
            l.v("mBinding");
            b3Var = null;
        }
        b3Var.C.f25959e.setOnClickListener(new o(this));
        b3 b3Var2 = this.J;
        if (b3Var2 == null) {
            l.v("mBinding");
            b3Var2 = null;
        }
        b3Var2.C.f25957c.setOnClickListener(new dk.b());
        ek.a aVar2 = this.K;
        if (aVar2 == null) {
            l.v("viewModel");
        } else {
            aVar = aVar2;
        }
        aVar.l().g(this, new g(new b(this)));
    }

    /* access modifiers changed from: private */
    public static final void l2(DLReplecementActivity dLReplecementActivity, View view) {
        l.f(dLReplecementActivity, "this$0");
        dLReplecementActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void m2(View view) {
    }

    private final void n2(Intent intent, String str, String str2, String str3, ArrayList arrayList) {
        try {
            intent.putExtra("DL", this.N);
            intent.putExtra("dob", this.O);
            intent.putExtra("DLDetails", T1());
            intent.putExtra("Mobile_no", this.P);
            intent.putExtra("lastEndorsedRTO", str);
            intent.putExtra("lastEndorsedState", str2);
            intent.putExtra("lastEndorsedRTOCode", this.S);
            intent.putExtra("lastEndorseStateCode", this.X);
            intent.putExtra("whatServiceRequired", this.Q);
            intent.putExtra("state_value", this.f22327o0);
            intent.putExtra("purCode", str3);
            intent.putExtra("bioRecGenesis", "S");
            intent.putExtra("allowAddrChangeAtDlservReqst", "N");
            intent.putExtra("metaflag", this.I0);
            intent.putExtra("multiList", arrayList);
            intent.putExtra("listHeaderSteps", a2());
            intent.putExtra("serialNo", this.K0 + 1);
            intent.putExtra("COA", this.H0);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void o2() {
        b3 b3Var = this.J;
        b3 b3Var2 = null;
        if (b3Var == null) {
            l.v("mBinding");
            b3Var = null;
        }
        b3Var.E.f29581h.setOnClickListener(new i(this));
        b3 b3Var3 = this.J;
        if (b3Var3 == null) {
            l.v("mBinding");
            b3Var3 = null;
        }
        b3Var3.J.setOnClickListener(new j(this));
        b3 b3Var4 = this.J;
        if (b3Var4 == null) {
            l.v("mBinding");
            b3Var4 = null;
        }
        b3Var4.S.setOnClickListener(new k(this));
        b3 b3Var5 = this.J;
        if (b3Var5 == null) {
            l.v("mBinding");
            b3Var5 = null;
        }
        b3Var5.G.setOnClickListener(new dk.l(this));
        b3 b3Var6 = this.J;
        if (b3Var6 == null) {
            l.v("mBinding");
        } else {
            b3Var2 = b3Var6;
        }
        b3Var2.A.setOnClickListener(new dk.m(this));
        P2((ri.c) new u0((x0) this, (u0.b) new ri.d(new ri.a(c2()))).a(ri.c.class));
        d2().g().g(this, new g(new c(this)));
        d2().h().g(this, new n(this));
    }

    /* access modifiers changed from: private */
    public static final void p2(DLReplecementActivity dLReplecementActivity, View view) {
        l.f(dLReplecementActivity, "this$0");
        try {
            Intent intent = new Intent(dLReplecementActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", dLReplecementActivity.N);
            intent.putExtra("dob", dLReplecementActivity.O);
            intent.putExtra("DLDetails", dLReplecementActivity.T1());
            intent.putExtra("Mobile_no", dLReplecementActivity.P);
            intent.putExtra("lastEndorsedRTO", dLReplecementActivity.V);
            intent.putExtra("lastEndorsedState", dLReplecementActivity.W);
            intent.putExtra("lastEndorsedRTOCode", dLReplecementActivity.S);
            intent.putExtra("lastEndorseStateCode", dLReplecementActivity.X);
            intent.putExtra("whatServiceRequired", dLReplecementActivity.Q);
            if (l.a(dLReplecementActivity.i2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", dLReplecementActivity.g2());
            }
            dLReplecementActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void q2(DLReplecementActivity dLReplecementActivity, View view) {
        l.f(dLReplecementActivity, "this$0");
        b3 b3Var = dLReplecementActivity.J;
        b3 b3Var2 = null;
        if (b3Var == null) {
            l.v("mBinding");
            b3Var = null;
        }
        b3Var.S.setChecked(true);
        b3 b3Var3 = dLReplecementActivity.J;
        if (b3Var3 == null) {
            l.v("mBinding");
            b3Var3 = null;
        }
        b3Var3.G.setChecked(false);
        b3 b3Var4 = dLReplecementActivity.J;
        if (b3Var4 == null) {
            l.v("mBinding");
            b3Var4 = null;
        }
        b3Var4.f25442w.setChecked(false);
        dLReplecementActivity.T = "Y";
        b3 b3Var5 = dLReplecementActivity.J;
        if (b3Var5 == null) {
            l.v("mBinding");
        } else {
            b3Var2 = b3Var5;
        }
        b3Var2.H.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void r2(DLReplecementActivity dLReplecementActivity, View view) {
        l.f(dLReplecementActivity, "this$0");
        dLReplecementActivity.T = "Y";
        b3 b3Var = dLReplecementActivity.J;
        b3 b3Var2 = null;
        if (b3Var == null) {
            l.v("mBinding");
            b3Var = null;
        }
        b3Var.G.setChecked(false);
        b3 b3Var3 = dLReplecementActivity.J;
        if (b3Var3 == null) {
            l.v("mBinding");
        } else {
            b3Var2 = b3Var3;
        }
        b3Var2.H.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void s2(DLReplecementActivity dLReplecementActivity, View view) {
        l.f(dLReplecementActivity, "this$0");
        dLReplecementActivity.T = "N";
        b3 b3Var = dLReplecementActivity.J;
        b3 b3Var2 = null;
        if (b3Var == null) {
            l.v("mBinding");
            b3Var = null;
        }
        b3Var.S.setChecked(false);
        b3 b3Var3 = dLReplecementActivity.J;
        if (b3Var3 == null) {
            l.v("mBinding");
        } else {
            b3Var2 = b3Var3;
        }
        b3Var2.H.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d6, code lost:
        if (com.nic.mparivahan.a.f9624a.a(r9) != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d8, code lost:
        r10 = r9.W1().b("label_want_to_proceed", r9.getString(com.nic.mparivahan.R.string.are_you_want_to_proceed));
        cm.l.c(r10);
        r9.F2(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0111, code lost:
        if (cm.l.a(r9.f22332t0, "0") != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t2(com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity r9, android.view.View r10) {
        /*
            java.lang.String r10 = "this$0"
            cm.l.f(r9, r10)
            ld.f r10 = r9.i2()
            java.lang.String r10 = r10.b()
            java.lang.String r0 = "950"
            boolean r10 = cm.l.a(r10, r0)
            if (r10 == 0) goto L_0x001a
            r9.H2()
            goto L_0x0124
        L_0x001a:
            ni.b3 r10 = r9.J
            r0 = 0
            java.lang.String r1 = "mBinding"
            if (r10 != 0) goto L_0x0025
            cm.l.v(r1)
            r10 = r0
        L_0x0025:
            android.widget.CheckBox r10 = r10.f25442w
            boolean r10 = r10.isChecked()
            if (r10 == 0) goto L_0x0115
            java.lang.String r10 = r9.T
            java.lang.String r2 = "Y"
            boolean r10 = cm.l.a(r10, r2)
            r2 = 0
            r3 = 2132019337(0x7f140889, float:1.9677006E38)
            r4 = 2132017371(0x7f1400db, float:1.9673019E38)
            r5 = 2132019054(0x7f14076e, float:1.9676432E38)
            java.lang.String r6 = "select_app_cat"
            java.lang.String r7 = "0"
            java.lang.String r8 = "label_want_to_proceed"
            if (r10 == 0) goto L_0x0103
            java.lang.String r10 = r9.f22332t0
            boolean r10 = cm.l.a(r10, r7)
            if (r10 == 0) goto L_0x0060
        L_0x004f:
            ld.c r10 = r9.W1()
            java.lang.String r0 = r9.getString(r5)
            java.lang.String r10 = r10.b(r6, r0)
        L_0x005b:
            r9.G2(r10)
            goto L_0x0124
        L_0x0060:
            ni.b3 r10 = r9.J
            if (r10 != 0) goto L_0x0068
            cm.l.v(r1)
            r10 = r0
        L_0x0068:
            androidx.appcompat.widget.AppCompatEditText r10 = r10.H
            android.text.Editable r10 = r10.getText()
            cm.l.c(r10)
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0089
            ld.c r10 = r9.W1()
            r0 = 2132017754(0x7f14025a, float:1.9673795E38)
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r1 = "edit_dl_serv_emer_cont_no"
        L_0x0084:
            java.lang.String r10 = r10.b(r1, r0)
            goto L_0x005b
        L_0x0089:
            ni.b3 r10 = r9.J
            if (r10 != 0) goto L_0x0091
            cm.l.v(r1)
            r10 = r0
        L_0x0091:
            androidx.appcompat.widget.AppCompatEditText r10 = r10.H
            android.text.Editable r10 = r10.getText()
            cm.l.c(r10)
            int r10 = r10.length()
            r5 = 10
            r6 = 2132019439(0x7f1408ef, float:1.9677213E38)
            java.lang.String r7 = "edit_dl_serv_valid_emer_cont_no"
            if (r10 >= r5) goto L_0x00b4
        L_0x00a7:
            ld.c r10 = r9.W1()
            java.lang.String r0 = r9.getString(r6)
            java.lang.String r10 = r10.b(r7, r0)
            goto L_0x005b
        L_0x00b4:
            t8.c$a r10 = t8.c.f16582a
            ni.b3 r5 = r9.J
            if (r5 != 0) goto L_0x00be
            cm.l.v(r1)
            goto L_0x00bf
        L_0x00be:
            r0 = r5
        L_0x00bf:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.H
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r10 = r10.q(r0)
            if (r10 != 0) goto L_0x00d0
            goto L_0x00a7
        L_0x00d0:
            com.nic.mparivahan.a$a r10 = com.nic.mparivahan.a.f9624a
            boolean r10 = r10.a(r9)
            if (r10 == 0) goto L_0x00eb
        L_0x00d8:
            ld.c r10 = r9.W1()
            java.lang.String r0 = r9.getString(r4)
            java.lang.String r10 = r10.b(r8, r0)
            cm.l.c(r10)
            r9.F2(r10)
            goto L_0x0124
        L_0x00eb:
            android.content.Context r10 = r9.getApplicationContext()
            ld.c r0 = r9.W1()
            java.lang.String r9 = r9.getString(r3)
            java.lang.String r9 = r0.b(r8, r9)
            android.widget.Toast r9 = android.widget.Toast.makeText(r10, r9, r2)
            r9.show()
            goto L_0x0124
        L_0x0103:
            com.nic.mparivahan.a$a r10 = com.nic.mparivahan.a.f9624a
            boolean r10 = r10.a(r9)
            if (r10 == 0) goto L_0x00eb
            java.lang.String r10 = r9.f22332t0
            boolean r10 = cm.l.a(r10, r7)
            if (r10 == 0) goto L_0x00d8
            goto L_0x004f
        L_0x0115:
            ld.c r10 = r9.W1()
            r0 = 2132017547(0x7f14018b, float:1.9673375E38)
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r1 = "confirm_declaration"
            goto L_0x0084
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity.t2(com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void u2(DLReplecementActivity dLReplecementActivity, String str) {
        l.f(dLReplecementActivity, "this$0");
        b3 b3Var = dLReplecementActivity.J;
        if (b3Var == null) {
            l.v("mBinding");
            b3Var = null;
        }
        b3Var.A.c(false);
        dLReplecementActivity.G2(dLReplecementActivity.W1().b("label_want_to_proceed", dLReplecementActivity.getString(R.string.unable_to_get_details)));
    }

    private final void v2() {
        ab.d dVar;
        Intent intent;
        String str;
        String str2;
        String str3;
        String str4 = "NA";
        Class<CombineReq> cls = CombineReq.class;
        String str5 = "";
        b3 b3Var = null;
        if (g2().size() > this.K0) {
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
                combineReq2.setDupDlReasonName(str4);
                combineReq2.setDupDlReasonCode("99");
                combineReq2.setApplcatgDLserReq(combineReq.getApplcatgDLserReq());
                combineReq2.setDleDlReasonCode(combineReq.getDleDlReasonCode());
                combineReq2.setDleDlReasonName(combineReq.getDleDlReasonName());
                combineReq2.setDlHolderAltMobMum(combineReq.getDlHolderAltMobMum());
                combineReq2.setWilltoDonateOrgans(combineReq.getWilltoDonateOrgans());
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
                if (l.a(this.T, "Y")) {
                    combineReq2.setWilltoDonateOrgans("Y");
                    b3 b3Var2 = this.J;
                    if (b3Var2 == null) {
                        l.v("mBinding");
                    } else {
                        b3Var = b3Var2;
                    }
                    str4 = String.valueOf(b3Var.H.getText());
                } else {
                    combineReq2.setWilltoDonateOrgans("N");
                }
                combineReq2.setDlHolderAltMobMum(str4);
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
                edit.putString("MultiService", new i7.d().t(combineReq2));
                edit.commit();
                if (l.a(g2().get(this.K0), W1().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                    setIntent(new Intent(this, DLDuplicateActivity.class));
                    intent = getIntent();
                    l.e(intent, "getIntent(...)");
                    str = this.S;
                    l.c(str);
                    str2 = this.W;
                    str3 = "513";
                } else {
                    Class<RenewalOfDLActivity> cls2 = RenewalOfDLActivity.class;
                    if (l.a(g2().get(this.K0), W1().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        setIntent(new Intent(this, cls2));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.S;
                        l.c(str);
                        str2 = this.W;
                        str3 = "514";
                    } else if (l.a(g2().get(this.K0), W1().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        setIntent(new Intent(this, cls2));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.S;
                        l.c(str);
                        str2 = this.W;
                        str3 = "537";
                    } else if (l.a(g2().get(this.K0), W1().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                        setIntent(new Intent(this, ChangeOfAddressActivity.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.S;
                        l.c(str);
                        str2 = this.W;
                        str3 = "515";
                    } else if (l.a(g2().get(this.K0), W1().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                        setIntent(new Intent(this, DLReplecementActivity.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.S;
                        l.c(str);
                        str2 = this.W;
                        str3 = "516";
                    } else if (l.a(g2().get(this.K0), W1().b("check_dl_serv_extract_dl", "DL Extract"))) {
                        setIntent(new Intent(this, DLExtractActivity.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.S;
                        l.c(str);
                        str2 = this.W;
                        str3 = "523";
                    } else if (l.a(g2().get(this.K0), W1().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                        setIntent(new Intent(this, HillReligion.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.S;
                        l.c(str);
                        str2 = this.W;
                        str3 = "524";
                    } else if (l.a(g2().get(this.K0), W1().b("change_name_dl", "Change of Name in DL"))) {
                        setIntent(new Intent(this, ChangeOfName.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.S;
                        l.c(str);
                        str2 = this.W;
                        str3 = "526";
                    } else if (l.a(g2().get(this.K0), W1().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                        setIntent(new Intent(this, DobChangeActivity.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.S;
                        l.c(str);
                        str2 = this.W;
                        str3 = "548";
                    } else {
                        return;
                    }
                }
                n2(intent, str, str2, str3, g2());
            } catch (Exception unused) {
            }
        } else {
            if (com.nic.mparivahan.a.f9624a.a(this)) {
                CombineReq combineReq3 = (CombineReq) new i7.d().j(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", str5), cls);
                b3 b3Var3 = this.J;
                if (b3Var3 == null) {
                    l.v("mBinding");
                    b3Var3 = null;
                }
                b3Var3.A.c(true);
                if (l.a(this.T, "Y")) {
                    b3 b3Var4 = this.J;
                    if (b3Var4 == null) {
                        l.v("mBinding");
                        b3Var4 = null;
                    }
                    str5 = String.valueOf(b3Var4.H.getText());
                }
                String str6 = str5;
                ArrayList arrayList = new ArrayList();
                int size = T1().getDlcovs().size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(String.valueOf(T1().getDlcovs().get(i10).getDcCovcd()));
                }
                ab.d dVar2 = this.L0;
                if (dVar2 == null) {
                    l.v("mCombineViewModel");
                    dVar = null;
                } else {
                    dVar = dVar2;
                }
                boolean z10 = this.H0;
                String str7 = this.L;
                l.c(str7);
                String str8 = this.M;
                l.c(str8);
                ArrayList g22 = g2();
                String str9 = this.f22332t0;
                String str10 = this.N;
                l.c(str10);
                String str11 = this.O;
                l.c(str11);
                String str12 = this.S;
                l.c(str12);
                String str13 = this.T;
                l.c(str13);
                String relationType = combineReq3.getRelationType();
                l.c(relationType);
                String valueOf = String.valueOf(combineReq3.getConDlReasonCode());
                l.c(valueOf);
                String conDlReasonName = combineReq3.getConDlReasonName();
                l.c(conDlReasonName);
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
                String str14 = this.P;
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
                dVar.g(z10, arrayList, str7, str8, g22, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", str9, str6, str10, str11, str12, str13, relationType, valueOf, conDlReasonName, dlHolderNaturalName, conEffdate, applFirstName, applLastName, relFirstName, relLastName, str14, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, dleDlReasonCode, dleDlReasonName, "NA", "99", applDateOfBirth, codobDlReasonName, codobDlReasonCode, declaringcheck, hillcertificate, hillissueDate, hillvalidFrom, hillvalidTo, hilldrivingschool, hillissby, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, isDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, i2().f(), i2().g(), i2().e(), i2().h());
                return;
            }
            Toast.makeText(getApplicationContext(), W1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
    }

    /* access modifiers changed from: private */
    public final void w2() {
        ek.a aVar = this.K;
        if (aVar == null) {
            l.v("viewModel");
            aVar = null;
        }
        String str = this.N;
        String str2 = this.O;
        String str3 = this.S;
        String str4 = this.T;
        String str5 = this.P;
        l.c(str5);
        aVar.i(str, str2, str3, "99", "Reasons are not defined", str4, " ", str5, i2().f(), i2().g(), i2().e(), i2().h());
    }

    private final void x2() {
        ab.d dVar = this.L0;
        ab.d dVar2 = null;
        if (dVar == null) {
            l.v("mCombineViewModel");
            dVar = null;
        }
        dVar.i().g(this, new dk.e(this));
        ab.d dVar3 = this.L0;
        if (dVar3 == null) {
            l.v("mCombineViewModel");
        } else {
            dVar2 = dVar3;
        }
        dVar2.h().g(this, new dk.f(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void y2(com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity r27, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r28) {
        /*
            r15 = r27
            java.lang.String r14 = "service_is_not_present"
            java.lang.String r0 = "this$0"
            cm.l.f(r15, r0)
            ni.b3 r0 = r15.J
            java.lang.String r19 = "mBinding"
            r13 = 0
            if (r0 != 0) goto L_0x0014
            cm.l.v(r19)
            r0 = r13
        L_0x0014:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.A
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
            goto L_0x02b9
        L_0x002f:
            r0 = r13
        L_0x0030:
            java.lang.String r1 = "00"
            r2 = 2
            boolean r0 = km.p.p(r0, r1, r12, r2, r13)     // Catch:{ Exception -> 0x0028 }
            if (r0 == 0) goto L_0x0273
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x026d }
            if (r0 == 0) goto L_0x02d7
            java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x026d }
            if (r0 == 0) goto L_0x02d7
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x026d }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x026d }
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != r1) goto L_0x02d7
            com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r20 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x026d }
            r20.<init>()     // Catch:{ Exception -> 0x026d }
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x026d }
            java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x026d }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ Exception -> 0x026d }
            r21 = r0
            com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r21 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r21     // Catch:{ Exception -> 0x026d }
            if (r21 == 0) goto L_0x02d7
            java.lang.String r0 = ""
            java.util.ArrayList r1 = r27.g2()     // Catch:{ Exception -> 0x026d }
            ld.c r2 = r27.W1()     // Catch:{ Exception -> 0x026d }
            java.lang.String r3 = "check_dl_serv_dupl_dl"
            java.lang.String r4 = "Issue of Duplicate DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026d }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026d }
            if (r1 == 0) goto L_0x008f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "513,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x008f:
            java.util.ArrayList r1 = r27.g2()     // Catch:{ Exception -> 0x026d }
            ld.c r2 = r27.W1()     // Catch:{ Exception -> 0x026d }
            java.lang.String r3 = "check_dl_serv_renewal_dl"
            java.lang.String r4 = "Renewal of DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026d }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026d }
            if (r1 == 0) goto L_0x00b6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "514,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x00b6:
            java.util.ArrayList r1 = r27.g2()     // Catch:{ Exception -> 0x026d }
            ld.c r2 = r27.W1()     // Catch:{ Exception -> 0x026d }
            java.lang.String r3 = "revalidtion_expired_dl"
            java.lang.String r4 = "Re-Validation of Expired DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026d }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026d }
            if (r1 == 0) goto L_0x00dd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "537,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x00dd:
            java.util.ArrayList r1 = r27.g2()     // Catch:{ Exception -> 0x026d }
            ld.c r2 = r27.W1()     // Catch:{ Exception -> 0x026d }
            java.lang.String r3 = "check_dl_serv_change_addr"
            java.lang.String r4 = "Change of Address in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026d }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026d }
            if (r1 == 0) goto L_0x0104
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "515,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x0104:
            java.util.ArrayList r1 = r27.g2()     // Catch:{ Exception -> 0x026d }
            ld.c r2 = r27.W1()     // Catch:{ Exception -> 0x026d }
            java.lang.String r3 = "check_dl_serv_replacement_dl"
            java.lang.String r4 = "Replacement of DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026d }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026d }
            if (r1 == 0) goto L_0x012b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "516,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x012b:
            java.util.ArrayList r1 = r27.g2()     // Catch:{ Exception -> 0x026d }
            ld.c r2 = r27.W1()     // Catch:{ Exception -> 0x026d }
            java.lang.String r3 = "check_dl_serv_extract_dl"
            java.lang.String r4 = "DL Extract"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026d }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026d }
            if (r1 == 0) goto L_0x0152
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "523,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x0152:
            java.util.ArrayList r1 = r27.g2()     // Catch:{ Exception -> 0x026d }
            ld.c r2 = r27.W1()     // Catch:{ Exception -> 0x026d }
            java.lang.String r3 = "hill_region_title"
            java.lang.String r4 = "Endorsement to Drive in Hill Region"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026d }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026d }
            if (r1 == 0) goto L_0x0179
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "524,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x0179:
            java.util.ArrayList r1 = r27.g2()     // Catch:{ Exception -> 0x026d }
            ld.c r2 = r27.W1()     // Catch:{ Exception -> 0x026d }
            java.lang.String r3 = "change_name_dl"
            java.lang.String r4 = "Change of Name in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026d }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026d }
            if (r1 == 0) goto L_0x01a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "526,"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x01a0:
            java.util.ArrayList r1 = r27.g2()     // Catch:{ Exception -> 0x026d }
            ld.c r2 = r27.W1()     // Catch:{ Exception -> 0x026d }
            java.lang.String r3 = "change_birth_dl"
            java.lang.String r4 = "Change of Date of Birth in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x026d }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x026d }
            if (r1 == 0) goto L_0x01c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x0028 }
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "548"
            r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x01c7:
            r16 = r0
            com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r1 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x0234 }
            java.lang.String r3 = "1234"
            java.lang.String r4 = "S"
            java.lang.String r5 = r21.getApplicationDate()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r0 = r21.getApplicationNo()     // Catch:{ Exception -> 0x0234 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0234 }
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0234 }
            ld.g r0 = r27.e2()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r0 = r0.k()     // Catch:{ Exception -> 0x0234 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0234 }
            java.lang.String r9 = r21.getDateofBirth()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r10 = r21.getDlno()     // Catch:{ Exception -> 0x0234 }
            cm.l.c(r10)     // Catch:{ Exception -> 0x0234 }
            java.lang.String r0 = "N"
            java.lang.String r17 = "N"
            java.lang.String r18 = r21.getApplicantGender()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r2 = r15.P     // Catch:{ Exception -> 0x0234 }
            cm.l.c(r2)     // Catch:{ Exception -> 0x0234 }
            r22 = 0
            r23 = r14
            java.lang.String r14 = r15.S     // Catch:{ Exception -> 0x022e }
            cm.l.c(r14)     // Catch:{ Exception -> 0x022e }
            r28 = r14
            java.lang.String r14 = r15.X     // Catch:{ Exception -> 0x022e }
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
            r1.a(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x022c }
        L_0x0229:
            r13 = r27
            goto L_0x0243
        L_0x022c:
            r0 = move-exception
            goto L_0x0239
        L_0x022e:
            r0 = move-exception
            r25 = r13
            r26 = r23
            goto L_0x0239
        L_0x0234:
            r0 = move-exception
            r25 = r13
            r26 = r14
        L_0x0239:
            java.lang.String r1 = "valiii"
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ Exception -> 0x026a }
            android.util.Log.d(r1, r0)     // Catch:{ Exception -> 0x026a }
            goto L_0x0229
        L_0x0243:
            java.lang.String r4 = r13.S     // Catch:{ Exception -> 0x0264 }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = r27.T1()     // Catch:{ Exception -> 0x0264 }
            java.lang.String r6 = r13.N     // Catch:{ Exception -> 0x0264 }
            java.lang.String r7 = r13.O     // Catch:{ Exception -> 0x0264 }
            java.lang.String r8 = r13.P     // Catch:{ Exception -> 0x0264 }
            java.lang.String r9 = r13.V     // Catch:{ Exception -> 0x0264 }
            java.lang.String r10 = r13.W     // Catch:{ Exception -> 0x0264 }
            java.lang.String r11 = r13.X     // Catch:{ Exception -> 0x0264 }
            java.util.ArrayList r12 = r27.a2()     // Catch:{ Exception -> 0x0264 }
            r1 = r20
            r2 = r27
            r3 = r21
            r1.E2(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0264 }
            goto L_0x02d7
        L_0x0264:
            r3 = r26
            r1 = 2132019337(0x7f140889, float:1.9677006E38)
            goto L_0x02b9
        L_0x026a:
            r13 = r27
            goto L_0x0264
        L_0x026d:
            r25 = r13
            r13 = r15
            r1 = r11
            r3 = r14
            goto L_0x02b9
        L_0x0273:
            r25 = r13
            r26 = r14
            r13 = r15
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x0264 }
            if (r0 == 0) goto L_0x0283
            java.lang.String r0 = r0.getReqStatus()     // Catch:{ Exception -> 0x0264 }
            goto L_0x0285
        L_0x0283:
            r0 = r25
        L_0x0285:
            if (r0 == 0) goto L_0x02a2
            int r0 = r0.length()     // Catch:{ Exception -> 0x0264 }
            if (r0 != 0) goto L_0x028e
            goto L_0x02a2
        L_0x028e:
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x0264 }
            if (r0 == 0) goto L_0x0299
            java.lang.String r0 = r0.getReqStatus()     // Catch:{ Exception -> 0x0264 }
            goto L_0x029b
        L_0x0299:
            r0 = r25
        L_0x029b:
            cm.l.c(r0)     // Catch:{ Exception -> 0x0264 }
            r13.G2(r0)     // Catch:{ Exception -> 0x0264 }
            goto L_0x02d7
        L_0x02a2:
            ld.c r0 = r27.W1()     // Catch:{ Exception -> 0x0264 }
            r1 = 2132019337(0x7f140889, float:1.9677006E38)
            java.lang.String r2 = r13.getString(r1)     // Catch:{ Exception -> 0x02b7 }
            r3 = r26
            java.lang.String r0 = r0.b(r3, r2)     // Catch:{ Exception -> 0x02b9 }
            r13.G2(r0)     // Catch:{ Exception -> 0x02b9 }
            goto L_0x02d7
        L_0x02b7:
            r3 = r26
        L_0x02b9:
            ni.b3 r0 = r13.J
            if (r0 != 0) goto L_0x02c2
            cm.l.v(r19)
            r0 = r25
        L_0x02c2:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.A
            r2 = 0
            r0.c(r2)
            ld.c r0 = r27.W1()
            java.lang.String r1 = r13.getString(r1)
            java.lang.String r0 = r0.b(r3, r1)
            r13.G2(r0)
        L_0x02d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity.y2(com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse):void");
    }

    /* access modifiers changed from: private */
    public static final void z2(DLReplecementActivity dLReplecementActivity, String str) {
        l.f(dLReplecementActivity, "this$0");
        b3 b3Var = dLReplecementActivity.J;
        if (b3Var == null) {
            l.v("mBinding");
            b3Var = null;
        }
        b3Var.A.c(false);
        dLReplecementActivity.G2(dLReplecementActivity.W1().b("service_is_not_present", dLReplecementActivity.getString(R.string.unable_to_get_details)));
    }

    public final void G2(String str) {
        if (str != null) {
            String b10 = W1().b("nex_parivahan", getString(R.string.app_name));
            l.c(b10);
            String b11 = W1().b("btn_ok", getString(R.string.ok_txt));
            l.c(b11);
            oi.g.n1(this, b10, str, 1, b11, (String) null, f.f22345e, 16, (Object) null);
        }
    }

    public final void I2(String str) {
        l.f(str, "<set-?>");
        this.f22332t0 = str;
    }

    public final void J2(DldetobjX dldetobjX) {
        l.f(dldetobjX, "<set-?>");
        this.R = dldetobjX;
    }

    public final void K2(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.f22333u0 = cVar;
    }

    public final void L2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.G0 = arrayList;
    }

    public final void M2(CombineServiceInterface combineServiceInterface) {
        l.f(combineServiceInterface, "<set-?>");
        this.M0 = combineServiceInterface;
    }

    public final void N2(Context context) {
        l.f(context, "<set-?>");
        this.E0 = context;
    }

    public final void O2(RepCOAInterface repCOAInterface) {
        l.f(repCOAInterface, "<set-?>");
        this.f22330r0 = repCOAInterface;
    }

    public final void P2(ri.c cVar) {
        l.f(cVar, "<set-?>");
        this.f22329q0 = cVar;
    }

    public final void Q2(ld.g gVar) {
        l.f(gVar, "<set-?>");
        this.f22331s0 = gVar;
    }

    public final void R2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.F0 = arrayList;
    }

    public final String S1() {
        try {
            String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            l.e(format, "format(...)");
            return format;
        } catch (Exception e10) {
            e10.printStackTrace();
            return " ";
        }
    }

    public final void S2(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.U = fVar;
    }

    public final DldetobjX T1() {
        DldetobjX dldetobjX = this.R;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        l.v("dlDetails");
        return null;
    }

    public final String U1() {
        return this.N;
    }

    public final String V1() {
        return this.O;
    }

    public final ld.c W1() {
        ld.c cVar = this.f22333u0;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final String X1() {
        return this.V;
    }

    public final String Y1() {
        return this.W;
    }

    public final String Z1() {
        return this.X;
    }

    public final ArrayList a2() {
        ArrayList arrayList = this.G0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("listHeaderSteps");
        return null;
    }

    public final CombineServiceInterface b2() {
        CombineServiceInterface combineServiceInterface = this.M0;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        l.v("mCombineServiceInterface");
        return null;
    }

    public final RepCOAInterface c2() {
        RepCOAInterface repCOAInterface = this.f22330r0;
        if (repCOAInterface != null) {
            return repCOAInterface;
        }
        l.v("mRepCOAInterface");
        return null;
    }

    public final ri.c d2() {
        ri.c cVar = this.f22329q0;
        if (cVar != null) {
            return cVar;
        }
        l.v("mRepCOAVM");
        return null;
    }

    public final ld.g e2() {
        ld.g gVar = this.f22331s0;
        if (gVar != null) {
            return gVar;
        }
        l.v("mSessionmanger");
        return null;
    }

    public final String f2() {
        return this.P;
    }

    public final ArrayList g2() {
        ArrayList arrayList = this.F0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("multiListName");
        return null;
    }

    public final String h2() {
        return this.f22328p0;
    }

    public final ld.f i2() {
        ld.f fVar = this.U;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:23|24|(1:26)(1:28)|27|29|(3:31|32|(5:34|(1:36)|37|(1:39)|40))|41|42|(5:44|(1:46)|47|(1:49)|50)(5:52|(1:54)|55|(1:57)|58)|51) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x01df */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01eb A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0216 A[Catch:{ Exception -> 0x023f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r6 = r16
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }"
            super.onCreate(r17)
            r1 = 2131558514(0x7f0d0072, float:1.8742346E38)
            androidx.databinding.h r1 = androidx.databinding.f.f(r6, r1)
            java.lang.String r2 = "setContentView(...)"
            cm.l.e(r1, r2)
            ni.b3 r1 = (ni.b3) r1
            r6.J = r1
            r6.N2(r6)
            ld.f r1 = new ld.f
            r1.<init>(r6)
            r6.S2(r1)
            ld.c r1 = new ld.c
            r1.<init>(r6)
            r6.K2(r1)
            v9.e$a r1 = v9.e.f17509a
            ni.b3 r2 = r6.J
            r7 = 0
            java.lang.String r8 = "mBinding"
            if (r2 != 0) goto L_0x0037
            cm.l.v(r8)
            r2 = r7
        L_0x0037:
            r1.F1(r6, r2)
            ld.g r1 = new ld.g
            r1.<init>(r6)
            r6.Q2(r1)
            com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAInterface$a r1 = com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAInterface.f21669a
            com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAInterface r1 = r1.a(r6)
            r6.O2(r1)
            r16.j2()
            r16.k2()
            r16.o2()
            ni.b3 r1 = r6.J
            if (r1 != 0) goto L_0x005c
            cm.l.v(r8)
            r1 = r7
        L_0x005c:
            android.widget.TextView r1 = r1.R
            ni.b3 r2 = r6.J
            if (r2 != 0) goto L_0x0066
            cm.l.v(r8)
            r2 = r7
        L_0x0066:
            android.widget.TextView r2 = r2.R
            int r2 = r2.getPaintFlags()
            r9 = 8
            r2 = r2 | r9
            r1.setPaintFlags(r2)
            ni.b3 r1 = r6.J
            if (r1 != 0) goto L_0x007a
            cm.l.v(r8)
            r1 = r7
        L_0x007a:
            android.widget.TextView r1 = r1.R
            dk.a r2 = new dk.a
            r2.<init>(r6)
            r1.setOnClickListener(r2)
            r16.Q1()
            ld.f r1 = r16.i2()
            java.lang.String r1 = r1.b()
            java.lang.String r10 = "950"
            boolean r1 = cm.l.a(r1, r10)
            if (r1 == 0) goto L_0x009a
            r16.x2()
        L_0x009a:
            ni.b3 r1 = r6.J
            if (r1 != 0) goto L_0x00a2
            cm.l.v(r8)
            r1 = r7
        L_0x00a2:
            ni.yb r1 = r1.E
            android.widget.ImageView r1 = r1.f29577d
            dk.g r2 = new dk.g
            r2.<init>(r6)
            r1.setOnClickListener(r2)
            ni.b3 r1 = r6.J
            if (r1 != 0) goto L_0x00b6
            cm.l.v(r8)
            r1 = r7
        L_0x00b6:
            ni.yb r1 = r1.E
            android.widget.TextView r1 = r1.f29580g
            dk.h r2 = new dk.h
            r2.<init>(r6)
            r1.setOnClickListener(r2)
            ld.f r1 = r16.i2()
            java.lang.String r1 = r1.b()
            boolean r1 = cm.l.a(r1, r10)
            java.lang.String r11 = "Replacement of DL"
            java.lang.String r12 = "check_dl_serv_replacement_dl"
            r13 = 1
            r14 = 0
            if (r1 == 0) goto L_0x023f
            android.content.Intent r1 = r16.getIntent()     // Catch:{ Exception -> 0x023f }
            java.lang.String r2 = "serialNo"
            int r1 = r1.getIntExtra(r2, r14)     // Catch:{ Exception -> 0x023f }
            r6.K0 = r1     // Catch:{ Exception -> 0x023f }
            android.content.Intent r1 = r16.getIntent()     // Catch:{ Exception -> 0x023f }
            java.lang.String r2 = "multiList"
            java.io.Serializable r1 = r1.getSerializableExtra(r2)     // Catch:{ Exception -> 0x023f }
            cm.l.d(r1, r0)     // Catch:{ Exception -> 0x023f }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x023f }
            r6.R2(r1)     // Catch:{ Exception -> 0x023f }
            android.content.Intent r1 = r16.getIntent()     // Catch:{ Exception -> 0x023f }
            java.lang.String r2 = "listHeaderSteps"
            java.io.Serializable r1 = r1.getSerializableExtra(r2)     // Catch:{ Exception -> 0x023f }
            cm.l.d(r1, r0)     // Catch:{ Exception -> 0x023f }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x023f }
            r6.L2(r1)     // Catch:{ Exception -> 0x023f }
            android.content.Intent r0 = r16.getIntent()     // Catch:{ Exception -> 0x023f }
            java.lang.String r1 = "COA"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)     // Catch:{ Exception -> 0x023f }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            cm.l.d(r0, r1)     // Catch:{ Exception -> 0x023f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x023f }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x023f }
            r6.H0 = r0     // Catch:{ Exception -> 0x023f }
            android.content.Intent r0 = r16.getIntent()     // Catch:{ Exception -> 0x023f }
            java.lang.String r1 = "metaflag"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x023f }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            cm.l.d(r0, r1)     // Catch:{ Exception -> 0x023f }
            r6.I0 = r0     // Catch:{ Exception -> 0x023f }
            com.nic.mparivahan.DlCombineServices.CombineServiceInterface$a r0 = com.nic.mparivahan.DlCombineServices.CombineServiceInterface.f8704a     // Catch:{ Exception -> 0x023f }
            com.nic.mparivahan.DlCombineServices.CombineServiceInterface r0 = r0.a(r6)     // Catch:{ Exception -> 0x023f }
            r6.M2(r0)     // Catch:{ Exception -> 0x023f }
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0     // Catch:{ Exception -> 0x023f }
            ab.b r1 = new ab.b     // Catch:{ Exception -> 0x023f }
            ab.a r2 = new ab.a     // Catch:{ Exception -> 0x023f }
            com.nic.mparivahan.DlCombineServices.CombineServiceInterface r3 = r16.b2()     // Catch:{ Exception -> 0x023f }
            r2.<init>(r3)     // Catch:{ Exception -> 0x023f }
            r1.<init>(r2)     // Catch:{ Exception -> 0x023f }
            r0.<init>((androidx.lifecycle.x0) r6, (androidx.lifecycle.u0.b) r1)     // Catch:{ Exception -> 0x023f }
            java.lang.Class<ab.d> r1 = ab.d.class
            androidx.lifecycle.t0 r0 = r0.a(r1)     // Catch:{ Exception -> 0x023f }
            ab.d r0 = (ab.d) r0     // Catch:{ Exception -> 0x023f }
            r6.L0 = r0     // Catch:{ Exception -> 0x023f }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x023f }
            r1 = 30
            if (r0 < r1) goto L_0x017e
            android.view.WindowManager r0 = r16.getWindowManager()     // Catch:{ Exception -> 0x023f }
            android.view.WindowMetrics r0 = r0.getMaximumWindowMetrics()     // Catch:{ Exception -> 0x023f }
            java.lang.String r1 = "getMaximumWindowMetrics(...)"
            cm.l.e(r0, r1)     // Catch:{ Exception -> 0x023f }
            android.graphics.Rect r0 = r0.getBounds()     // Catch:{ Exception -> 0x023f }
            java.lang.String r1 = "getBounds(...)"
            cm.l.e(r0, r1)     // Catch:{ Exception -> 0x023f }
            int r0 = r0.right     // Catch:{ Exception -> 0x023f }
            r6.J0 = r0     // Catch:{ Exception -> 0x023f }
            java.lang.String r1 = "Width"
        L_0x0176:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x023f }
            android.util.Log.d(r1, r0)     // Catch:{ Exception -> 0x023f }
            goto L_0x018d
        L_0x017e:
            android.content.res.Resources r0 = r16.getResources()     // Catch:{ Exception -> 0x023f }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ Exception -> 0x023f }
            int r0 = r0.widthPixels     // Catch:{ Exception -> 0x023f }
            r6.J0 = r0     // Catch:{ Exception -> 0x023f }
            java.lang.String r1 = "Width 1"
            goto L_0x0176
        L_0x018d:
            ld.f r0 = r16.i2()     // Catch:{ Exception -> 0x023f }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x023f }
            boolean r0 = cm.l.a(r0, r10)     // Catch:{ Exception -> 0x023f }
            if (r0 == 0) goto L_0x01df
            java.util.ArrayList r0 = r16.a2()     // Catch:{ Exception -> 0x01df }
            int r0 = r0.size()     // Catch:{ Exception -> 0x01df }
            if (r0 <= r13) goto L_0x01df
            ni.b3 r0 = r6.J     // Catch:{ Exception -> 0x01df }
            if (r0 != 0) goto L_0x01ad
            cm.l.v(r8)     // Catch:{ Exception -> 0x01df }
            r0 = r7
        L_0x01ad:
            androidx.recyclerview.widget.RecyclerView r0 = r0.F     // Catch:{ Exception -> 0x01df }
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ Exception -> 0x01df }
            r1.<init>(r6, r14, r14)     // Catch:{ Exception -> 0x01df }
            r0.setLayoutManager(r1)     // Catch:{ Exception -> 0x01df }
            bb.a r15 = new bb.a     // Catch:{ Exception -> 0x01df }
            java.util.ArrayList r1 = r16.a2()     // Catch:{ Exception -> 0x01df }
            int r3 = r6.K0     // Catch:{ Exception -> 0x01df }
            int r4 = r6.J0     // Catch:{ Exception -> 0x01df }
            ld.c r0 = r16.W1()     // Catch:{ Exception -> 0x01df }
            java.lang.String r5 = r0.b(r12, r11)     // Catch:{ Exception -> 0x01df }
            cm.l.c(r5)     // Catch:{ Exception -> 0x01df }
            r0 = r15
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x01df }
            ni.b3 r0 = r6.J     // Catch:{ Exception -> 0x01df }
            if (r0 != 0) goto L_0x01da
            cm.l.v(r8)     // Catch:{ Exception -> 0x01df }
            r0 = r7
        L_0x01da:
            androidx.recyclerview.widget.RecyclerView r0 = r0.F     // Catch:{ Exception -> 0x01df }
            r0.setAdapter(r15)     // Catch:{ Exception -> 0x01df }
        L_0x01df:
            int r0 = r6.K0     // Catch:{ Exception -> 0x023f }
            java.util.ArrayList r1 = r16.g2()     // Catch:{ Exception -> 0x023f }
            int r1 = r1.size()     // Catch:{ Exception -> 0x023f }
            if (r0 != r1) goto L_0x0216
            ni.b3 r0 = r6.J     // Catch:{ Exception -> 0x023f }
            if (r0 != 0) goto L_0x01f3
            cm.l.v(r8)     // Catch:{ Exception -> 0x023f }
            r0 = r7
        L_0x01f3:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.A     // Catch:{ Exception -> 0x023f }
            ld.c r1 = r16.W1()     // Catch:{ Exception -> 0x023f }
            java.lang.String r2 = "vahan_btn_submit"
            java.lang.String r3 = "Submit"
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x023f }
            r0.setText(r1)     // Catch:{ Exception -> 0x023f }
            ni.b3 r0 = r6.J     // Catch:{ Exception -> 0x023f }
            if (r0 != 0) goto L_0x020c
            cm.l.v(r8)     // Catch:{ Exception -> 0x023f }
            r0 = r7
        L_0x020c:
            android.widget.LinearLayout r0 = r0.f25444y     // Catch:{ Exception -> 0x023f }
            r0.setVisibility(r14)     // Catch:{ Exception -> 0x023f }
            java.lang.String r0 = "Y"
        L_0x0213:
            r6.T = r0     // Catch:{ Exception -> 0x023f }
            goto L_0x023f
        L_0x0216:
            ni.b3 r0 = r6.J     // Catch:{ Exception -> 0x023f }
            if (r0 != 0) goto L_0x021e
            cm.l.v(r8)     // Catch:{ Exception -> 0x023f }
            r0 = r7
        L_0x021e:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.A     // Catch:{ Exception -> 0x023f }
            ld.c r1 = r16.W1()     // Catch:{ Exception -> 0x023f }
            java.lang.String r2 = "btn_dl_serv_next"
            java.lang.String r3 = "Next"
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x023f }
            r0.setText(r1)     // Catch:{ Exception -> 0x023f }
            ni.b3 r0 = r6.J     // Catch:{ Exception -> 0x023f }
            if (r0 != 0) goto L_0x0237
            cm.l.v(r8)     // Catch:{ Exception -> 0x023f }
            r0 = r7
        L_0x0237:
            android.widget.LinearLayout r0 = r0.f25444y     // Catch:{ Exception -> 0x023f }
            r0.setVisibility(r9)     // Catch:{ Exception -> 0x023f }
            java.lang.String r0 = "N"
            goto L_0x0213
        L_0x023f:
            ld.f r0 = r16.i2()
            java.lang.String r0 = r0.b()
            boolean r0 = cm.l.a(r0, r10)
            if (r0 == 0) goto L_0x02b5
            java.util.ArrayList r0 = r16.a2()     // Catch:{ Exception -> 0x02cc }
            int r0 = r0.size()     // Catch:{ Exception -> 0x02cc }
            if (r0 != r13) goto L_0x0271
            ni.b3 r0 = r6.J     // Catch:{ Exception -> 0x02cc }
            if (r0 != 0) goto L_0x025f
            cm.l.v(r8)     // Catch:{ Exception -> 0x02cc }
            r0 = r7
        L_0x025f:
            ni.yb r0 = r0.E     // Catch:{ Exception -> 0x02cc }
            android.widget.TextView r0 = r0.f29580g     // Catch:{ Exception -> 0x02cc }
            java.util.ArrayList r1 = r16.a2()     // Catch:{ Exception -> 0x02cc }
            java.lang.Object r1 = r1.get(r14)     // Catch:{ Exception -> 0x02cc }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x02cc }
            r0.setText(r1)     // Catch:{ Exception -> 0x02cc }
            goto L_0x02cc
        L_0x0271:
            ni.b3 r0 = r6.J     // Catch:{ Exception -> 0x02cc }
            if (r0 != 0) goto L_0x0279
            cm.l.v(r8)     // Catch:{ Exception -> 0x02cc }
            r0 = r7
        L_0x0279:
            ni.yb r0 = r0.E     // Catch:{ Exception -> 0x02cc }
            android.widget.TextView r0 = r0.f29580g     // Catch:{ Exception -> 0x02cc }
            ld.c r1 = r16.W1()     // Catch:{ Exception -> 0x02cc }
            java.lang.String r2 = "dl_services"
            r3 = 2132017656(0x7f1401f8, float:1.9673597E38)
            java.lang.String r3 = r6.getString(r3)     // Catch:{ Exception -> 0x02cc }
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x02cc }
            cm.l.c(r1)     // Catch:{ Exception -> 0x02cc }
            r0.setText(r1)     // Catch:{ Exception -> 0x02cc }
            ni.b3 r0 = r6.J     // Catch:{ Exception -> 0x02cc }
            if (r0 != 0) goto L_0x029c
            cm.l.v(r8)     // Catch:{ Exception -> 0x02cc }
            r0 = r7
        L_0x029c:
            ni.yb r0 = r0.E     // Catch:{ Exception -> 0x02cc }
            android.widget.TextView r0 = r0.f29580g     // Catch:{ Exception -> 0x02cc }
            ni.b3 r1 = r6.J     // Catch:{ Exception -> 0x02cc }
            if (r1 != 0) goto L_0x02a8
            cm.l.v(r8)     // Catch:{ Exception -> 0x02cc }
            r1 = r7
        L_0x02a8:
            ni.yb r1 = r1.E     // Catch:{ Exception -> 0x02cc }
            android.widget.TextView r1 = r1.f29580g     // Catch:{ Exception -> 0x02cc }
            int r1 = r1.getPaintFlags()     // Catch:{ Exception -> 0x02cc }
            r1 = r1 | r9
            r0.setPaintFlags(r1)     // Catch:{ Exception -> 0x02cc }
            goto L_0x02cc
        L_0x02b5:
            ni.b3 r0 = r6.J
            if (r0 != 0) goto L_0x02bd
            cm.l.v(r8)
            r0 = r7
        L_0x02bd:
            ni.yb r0 = r0.E
            android.widget.TextView r0 = r0.f29580g
            ld.c r1 = r16.W1()
            java.lang.String r1 = r1.b(r12, r11)
            r0.setText(r1)
        L_0x02cc:
            ni.b3 r0 = r6.J
            if (r0 != 0) goto L_0x02d4
            cm.l.v(r8)
            r0 = r7
        L_0x02d4:
            ni.yb r0 = r0.E
            android.widget.LinearLayout r0 = r0.f29578e
            r0.setVisibility(r9)
            ni.b3 r0 = r6.J
            if (r0 != 0) goto L_0x02e3
            cm.l.v(r8)
            r0 = r7
        L_0x02e3:
            ni.dc r0 = r0.C
            android.widget.TextView r0 = r0.f25961g
            ld.f r1 = r16.i2()
            java.lang.String r1 = r1.i()
            r0.setText(r1)
            ni.b3 r0 = r6.J
            if (r0 != 0) goto L_0x02fa
            cm.l.v(r8)
            r0 = r7
        L_0x02fa:
            android.widget.TextView r0 = r0.R
            r0.setVisibility(r14)
            ni.b3 r0 = r6.J
            if (r0 != 0) goto L_0x0307
            cm.l.v(r8)
            goto L_0x0308
        L_0x0307:
            r7 = r0
        L_0x0308:
            android.widget.TextView r0 = r7.f25443x
            r0.setVisibility(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity.onCreate(android.os.Bundle):void");
    }
}
