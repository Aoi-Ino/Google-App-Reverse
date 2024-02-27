package com.nic.mparivahan.dlservices.ui.dlextract;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import bm.l;
import cm.h;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetEx;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kk.e;
import ld.f;
import lj.i;
import lj.j;
import lj.k;
import lj.m;
import ni.l2;
import oi.g;
import pl.x;
import t8.c;
import v9.e;

public final class DLExtractActivity extends g {
    /* access modifiers changed from: private */
    public l2 J;
    public DldetobjX K;
    private String L;
    private String M;
    private String N;
    private String O = "";
    private String P = "";
    private String Q = "";
    private String R = "0";
    private HashMap S = new HashMap();
    /* access modifiers changed from: private */
    public String T = "";
    private m U;
    /* access modifiers changed from: private */
    public List V;
    private String W = "N";
    public f X;
    public ld.g Y;
    private String Z;

    /* renamed from: a0  reason: collision with root package name */
    private String f21996a0;

    /* renamed from: b0  reason: collision with root package name */
    private String f21997b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private String f21998c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    private String f21999d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private String f22000e0 = "";

    /* renamed from: f0  reason: collision with root package name */
    private String f22001f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    private String f22002g0 = "";

    /* renamed from: h0  reason: collision with root package name */
    private String f22003h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    private String f22004i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    private String f22005j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private String f22006k0 = "";

    /* renamed from: l0  reason: collision with root package name */
    private String f22007l0 = "";

    /* renamed from: m0  reason: collision with root package name */
    private String f22008m0 = "";

    /* renamed from: n0  reason: collision with root package name */
    private String f22009n0 = "";

    /* renamed from: o0  reason: collision with root package name */
    private String f22010o0 = "";

    /* renamed from: p0  reason: collision with root package name */
    private String f22011p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    private String f22012q0 = "";

    /* renamed from: r0  reason: collision with root package name */
    private String f22013r0 = "";

    /* renamed from: s0  reason: collision with root package name */
    public ArrayList f22014s0;

    /* renamed from: t0  reason: collision with root package name */
    public ld.c f22015t0;

    static final class a extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLExtractActivity f22016e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DLExtractActivity dLExtractActivity) {
            super(1);
            this.f22016e = dLExtractActivity;
        }

        public final void b(GetReasonsTransWiseResponse getReasonsTransWiseResponse) {
            try {
                Log.d("reason_res", getReasonsTransWiseResponse.toString());
                if (p.p(getReasonsTransWiseResponse.getStatusCode(), "00", false, 2, (Object) null)) {
                    this.f22016e.V = getReasonsTransWiseResponse.getReasonsMaster();
                    return;
                }
                Toast.makeText(this.f22016e, "Service is temporary unavailable. Try After some time", 1).show();
                String statusDesc = getReasonsTransWiseResponse.getStatusDesc();
                if (statusDesc != null) {
                    this.f22016e.m2(statusDesc);
                }
            } catch (Exception unused) {
                DLExtractActivity dLExtractActivity = this.f22016e;
                String b10 = dLExtractActivity.N1().b("service_is_not_present", this.f22016e.getString(R.string.unable_to_get_details));
                cm.l.c(b10);
                dLExtractActivity.m2(b10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetReasonsTransWiseResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLExtractActivity f22017e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DLExtractActivity dLExtractActivity) {
            super(1);
            this.f22017e = dLExtractActivity;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:19|20|21|22|23|(1:25)|26|52) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00b8 */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00c8 A[Catch:{ Exception -> 0x0142 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetEx r30) {
            /*
                r29 = this;
                r0 = r29
                java.lang.String r1 = "service_is_not_present"
                java.lang.String r2 = "mBinding"
                r3 = 2132019337(0x7f140889, float:1.9677006E38)
                r4 = 0
                r5 = 0
                java.lang.String r6 = "extract_res"
                java.lang.String r7 = r30.toString()     // Catch:{ Exception -> 0x0142 }
                android.util.Log.d(r6, r7)     // Catch:{ Exception -> 0x0142 }
                com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity r6 = r0.f22017e     // Catch:{ Exception -> 0x0142 }
                ni.l2 r6 = r6.J     // Catch:{ Exception -> 0x0142 }
                if (r6 != 0) goto L_0x0020
                cm.l.v(r2)     // Catch:{ Exception -> 0x0142 }
                r6 = r5
            L_0x0020:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r6 = r6.D     // Catch:{ Exception -> 0x0142 }
                r6.c(r4)     // Catch:{ Exception -> 0x0142 }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r6 = r30.getDlSubmitresult()     // Catch:{ Exception -> 0x0142 }
                if (r6 == 0) goto L_0x0030
                java.lang.String r6 = r6.getStatusCode()     // Catch:{ Exception -> 0x0142 }
                goto L_0x0031
            L_0x0030:
                r6 = r5
            L_0x0031:
                java.lang.String r7 = "00"
                r8 = 2
                boolean r6 = km.p.p(r6, r7, r4, r8, r5)     // Catch:{ Exception -> 0x0142 }
                if (r6 == 0) goto L_0x0107
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r6 = r30.getDlSubmitresult()     // Catch:{ Exception -> 0x0142 }
                if (r6 == 0) goto L_0x016a
                java.util.List r6 = r6.getResult()     // Catch:{ Exception -> 0x0142 }
                if (r6 == 0) goto L_0x016a
                java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ Exception -> 0x0142 }
                boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x0142 }
                r7 = 1
                r6 = r6 ^ r7
                if (r6 != r7) goto L_0x016a
                com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r8 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x0142 }
                r8.<init>()     // Catch:{ Exception -> 0x0142 }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r6 = r30.getDlSubmitresult()     // Catch:{ Exception -> 0x0142 }
                java.util.List r6 = r6.getResult()     // Catch:{ Exception -> 0x0142 }
                java.lang.Object r6 = r6.get(r4)     // Catch:{ Exception -> 0x0142 }
                r10 = r6
                com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r10 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r10     // Catch:{ Exception -> 0x0142 }
                if (r10 == 0) goto L_0x016a
                com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity r9 = r0.f22017e     // Catch:{ Exception -> 0x0142 }
                com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r11 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r13 = "1234"
                java.lang.String r14 = "S"
                java.lang.String r15 = r10.getApplicationDate()     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r6 = r10.getApplicationNo()     // Catch:{ Exception -> 0x00b8 }
                cm.l.c(r6)     // Catch:{ Exception -> 0x00b8 }
                long r16 = java.lang.Long.parseLong(r6)     // Catch:{ Exception -> 0x00b8 }
                ld.g r6 = r9.R1()     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r6 = r6.k()     // Catch:{ Exception -> 0x00b8 }
                int r18 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r19 = r10.getDateofBirth()     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r20 = r10.getDlno()     // Catch:{ Exception -> 0x00b8 }
                cm.l.c(r20)     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r21 = "N"
                java.lang.String r22 = "N"
                java.lang.String r23 = r10.getApplicantGender()     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r24 = r9.S1()     // Catch:{ Exception -> 0x00b8 }
                cm.l.c(r24)     // Catch:{ Exception -> 0x00b8 }
                r25 = 0
                java.lang.String r26 = r9.U1()     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r27 = r9.T     // Catch:{ Exception -> 0x00b8 }
                cm.l.c(r27)     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r28 = r9.Q1()     // Catch:{ Exception -> 0x00b8 }
                r12 = r9
                r11.a(r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x00b8 }
            L_0x00b8:
                ld.f r6 = r9.V1()     // Catch:{ Exception -> 0x0142 }
                java.lang.String r6 = r6.b()     // Catch:{ Exception -> 0x0142 }
                java.lang.String r7 = "950"
                boolean r6 = cm.l.a(r6, r7)     // Catch:{ Exception -> 0x0142 }
                if (r6 != 0) goto L_0x00df
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0142 }
                r6.<init>()     // Catch:{ Exception -> 0x0142 }
                r9.q2(r6)     // Catch:{ Exception -> 0x0142 }
                java.util.ArrayList r6 = r9.T1()     // Catch:{ Exception -> 0x0142 }
                ld.f r7 = r9.V1()     // Catch:{ Exception -> 0x0142 }
                java.lang.String r7 = r7.i()     // Catch:{ Exception -> 0x0142 }
                r6.add(r7)     // Catch:{ Exception -> 0x0142 }
            L_0x00df:
                java.lang.String r11 = r9.T     // Catch:{ Exception -> 0x0142 }
                com.nic.mparivahan.Dl.Model.DldetobjX r12 = r9.K1()     // Catch:{ Exception -> 0x0142 }
                java.lang.String r13 = r9.L1()     // Catch:{ Exception -> 0x0142 }
                java.lang.String r14 = r9.M1()     // Catch:{ Exception -> 0x0142 }
                java.lang.String r15 = r9.S1()     // Catch:{ Exception -> 0x0142 }
                java.lang.String r16 = r9.O1()     // Catch:{ Exception -> 0x0142 }
                java.lang.String r17 = r9.P1()     // Catch:{ Exception -> 0x0142 }
                java.lang.String r18 = r9.Q1()     // Catch:{ Exception -> 0x0142 }
                java.util.ArrayList r19 = r9.T1()     // Catch:{ Exception -> 0x0142 }
                r8.E2(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0142 }
                goto L_0x016a
            L_0x0107:
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r6 = r30.getDlSubmitresult()     // Catch:{ Exception -> 0x0142 }
                if (r6 == 0) goto L_0x0112
                java.lang.String r6 = r6.getReqStatus()     // Catch:{ Exception -> 0x0142 }
                goto L_0x0113
            L_0x0112:
                r6 = r5
            L_0x0113:
                if (r6 == 0) goto L_0x0131
                int r6 = r6.length()     // Catch:{ Exception -> 0x0142 }
                if (r6 != 0) goto L_0x011c
                goto L_0x0131
            L_0x011c:
                com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity r6 = r0.f22017e     // Catch:{ Exception -> 0x0142 }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r7 = r30.getDlSubmitresult()     // Catch:{ Exception -> 0x0142 }
                if (r7 == 0) goto L_0x0129
                java.lang.String r7 = r7.getReqStatus()     // Catch:{ Exception -> 0x0142 }
                goto L_0x012a
            L_0x0129:
                r7 = r5
            L_0x012a:
                cm.l.c(r7)     // Catch:{ Exception -> 0x0142 }
                r6.m2(r7)     // Catch:{ Exception -> 0x0142 }
                goto L_0x016a
            L_0x0131:
                com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity r6 = r0.f22017e     // Catch:{ Exception -> 0x0142 }
                ld.c r7 = r6.N1()     // Catch:{ Exception -> 0x0142 }
                com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity r8 = r0.f22017e     // Catch:{ Exception -> 0x0142 }
                java.lang.String r8 = r8.getString(r3)     // Catch:{ Exception -> 0x0142 }
                java.lang.String r7 = r7.b(r1, r8)     // Catch:{ Exception -> 0x0142 }
                goto L_0x012a
            L_0x0142:
                com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity r6 = r0.f22017e
                ni.l2 r6 = r6.J
                if (r6 != 0) goto L_0x014e
                cm.l.v(r2)
                goto L_0x014f
            L_0x014e:
                r5 = r6
            L_0x014f:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r2 = r5.D
                r2.c(r4)
                com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity r2 = r0.f22017e
                ld.c r4 = r2.N1()
                com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity r5 = r0.f22017e
                java.lang.String r3 = r5.getString(r3)
                java.lang.String r1 = r4.b(r1, r3)
                cm.l.c(r1)
                r2.m2(r1)
            L_0x016a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity.b.b(com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetEx):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetAckDetEx) obj);
            return x.f30437a;
        }
    }

    public static final class c implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DLExtractActivity f22018a;

        c(DLExtractActivity dLExtractActivity) {
            this.f22018a = dLExtractActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r6 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem) r0.get(r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r5, int r6) {
            /*
                r4 = this;
                com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity r0 = r4.f22018a
                java.util.List r0 = r0.V
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
                com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity r0 = r4.f22018a
                ni.l2 r0 = r0.J
                java.lang.String r2 = "mBinding"
                if (r0 != 0) goto L_0x0025
                cm.l.v(r2)
                r0 = r1
            L_0x0025:
                android.widget.EditText r0 = r0.B
                r0.setText(r5)
                com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity r5 = r4.f22018a
                ni.l2 r5 = r5.J
                if (r5 != 0) goto L_0x0036
                cm.l.v(r2)
                r5 = r1
            L_0x0036:
                android.widget.EditText r5 = r5.B
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = ""
                r0.append(r3)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.setContentDescription(r6)
                com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity r5 = r4.f22018a
                ni.l2 r5 = r5.J
                if (r5 != 0) goto L_0x0058
                cm.l.v(r2)
                r5 = r1
            L_0x0058:
                android.widget.EditText r5 = r5.B
                android.text.Editable r5 = r5.getText()
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "Miscellaneous"
                boolean r5 = cm.l.a(r5, r6)
                if (r5 == 0) goto L_0x007e
                com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity r5 = r4.f22018a
                ni.l2 r5 = r5.J
                if (r5 != 0) goto L_0x0076
                cm.l.v(r2)
                goto L_0x0077
            L_0x0076:
                r1 = r5
            L_0x0077:
                android.widget.LinearLayout r5 = r1.f27243y
                r6 = 0
            L_0x007a:
                r5.setVisibility(r6)
                goto L_0x0090
            L_0x007e:
                com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity r5 = r4.f22018a
                ni.l2 r5 = r5.J
                if (r5 != 0) goto L_0x008a
                cm.l.v(r2)
                goto L_0x008b
            L_0x008a:
                r1 = r5
            L_0x008b:
                android.widget.LinearLayout r5 = r1.f27243y
                r6 = 8
                goto L_0x007a
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity.c.a(java.lang.String, int):void");
        }
    }

    static final class d extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final d f22019e = new d();

        d() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f22020a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f22020a = lVar;
        }

        public final pl.c a() {
            return this.f22020a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22020a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return cm.l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    private final void W1() {
        if (getIntent() != null) {
            try {
                this.Z = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
                this.f21996a0 = String.valueOf(getIntent().getStringExtra("allowAddrChangeAtDlservReqst"));
                Log.d("values", this.Z + '-' + this.f21996a0);
                String stringExtra = getIntent().getStringExtra("state_value");
                cm.l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.f22013r0 = stringExtra;
                this.L = String.valueOf(getIntent().getStringExtra("DL"));
                this.M = String.valueOf(getIntent().getStringExtra("dob"));
                Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                n2((DldetobjX) serializableExtra);
                String stringExtra2 = getIntent().getStringExtra("lastEndorsedRTO");
                cm.l.d(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.O = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("lastEndorsedState");
                cm.l.d(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.P = stringExtra3;
                String stringExtra4 = getIntent().getStringExtra("lastEndorseStateCode");
                cm.l.d(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.Q = stringExtra4;
                String stringExtra5 = getIntent().getStringExtra("lastEndorsedRTOCode");
                cm.l.d(stringExtra5, "null cannot be cast to non-null type kotlin.String");
                this.T = stringExtra5;
                this.N = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                String stringExtra6 = getIntent().getStringExtra("purCode");
                cm.l.d(stringExtra6, "null cannot be cast to non-null type kotlin.String");
                this.R = stringExtra6;
                Serializable serializableExtra2 = getIntent().getSerializableExtra("whatServiceRequired");
                cm.l.d(serializableExtra2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String?, kotlin.String?> }");
                this.S = (HashMap) serializableExtra2;
                l2 l2Var = this.J;
                l2 l2Var2 = null;
                if (l2Var == null) {
                    cm.l.v("mBinding");
                    l2Var = null;
                }
                l2Var.f27241w.setText(N1().b("dl_no", "DL No. : ") + ' ' + this.L);
                BioImgObjX bioImgObj = K1().getBioImgObj();
                if ((bioImgObj != null ? bioImgObj.getBiPhoto() : null) == null) {
                    l2 l2Var3 = this.J;
                    if (l2Var3 == null) {
                        cm.l.v("mBinding");
                        l2Var3 = null;
                    }
                    l2Var3.L.setVisibility(8);
                    l2 l2Var4 = this.J;
                    if (l2Var4 == null) {
                        cm.l.v("mBinding");
                    } else {
                        l2Var2 = l2Var4;
                    }
                    l2Var2.A.setVisibility(0);
                } else {
                    l2 l2Var5 = this.J;
                    if (l2Var5 == null) {
                        cm.l.v("mBinding");
                        l2Var5 = null;
                    }
                    l2Var5.L.setVisibility(0);
                    l2 l2Var6 = this.J;
                    if (l2Var6 == null) {
                        cm.l.v("mBinding");
                        l2Var6 = null;
                    }
                    l2Var6.A.setVisibility(8);
                    l2 l2Var7 = this.J;
                    if (l2Var7 == null) {
                        cm.l.v("mBinding");
                    } else {
                        l2Var2 = l2Var7;
                    }
                    l2Var2.E.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(K1().getBioImgObj().getBiPhoto()));
                }
            } catch (Exception unused) {
                String b10 = N1().b("service_is_not_present", getString(R.string.unable_to_get_details));
                cm.l.c(b10);
                m2(b10);
            }
        }
        if (!cm.l.a(this.f22013r0, "same") || p.o(this.Z, "S", true)) {
            this.f22005j0 = String.valueOf(getIntent().getStringExtra("presHouseNo"));
            this.f22006k0 = String.valueOf(getIntent().getStringExtra("presStreet"));
            this.f22007l0 = String.valueOf(getIntent().getStringExtra("presLocation"));
            this.f22008m0 = String.valueOf(getIntent().getStringExtra("presVillageOrTown"));
            this.f22009n0 = String.valueOf(getIntent().getStringExtra("presSubDistrict"));
            this.f22010o0 = String.valueOf(getIntent().getStringExtra("presDistrict"));
            this.f22011p0 = String.valueOf(getIntent().getStringExtra("presState"));
            this.f22012q0 = String.valueOf(getIntent().getStringExtra("presPincode"));
            this.f21997b0 = String.valueOf(getIntent().getStringExtra("perHouseNo"));
            this.f21998c0 = String.valueOf(getIntent().getStringExtra("perStreet"));
            this.f21999d0 = String.valueOf(getIntent().getStringExtra("perLocation"));
            this.f22000e0 = String.valueOf(getIntent().getStringExtra("permVillageOrTown"));
            this.f22001f0 = String.valueOf(getIntent().getStringExtra("perSubDistrict"));
            this.f22002g0 = String.valueOf(getIntent().getStringExtra("perDistrict"));
            this.f22003h0 = String.valueOf(getIntent().getStringExtra("perState"));
            this.f22004i0 = String.valueOf(getIntent().getStringExtra("perPinCode"));
        }
    }

    private final void X1() {
        l2 l2Var = this.J;
        l2 l2Var2 = null;
        if (l2Var == null) {
            cm.l.v("mBinding");
            l2Var = null;
        }
        l2Var.F.f25959e.setOnClickListener(new j(this));
        l2 l2Var3 = this.J;
        if (l2Var3 == null) {
            cm.l.v("mBinding");
            l2Var3 = null;
        }
        l2Var3.F.f25957c.setOnClickListener(new k());
        this.U = (m) new u0(this).a(m.class);
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            m mVar = this.U;
            if (mVar == null) {
                cm.l.v("viewModel");
                mVar = null;
            }
            mVar.k();
        } else {
            Toast.makeText(getApplicationContext(), N1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
        m mVar2 = this.U;
        if (mVar2 == null) {
            cm.l.v("viewModel");
            mVar2 = null;
        }
        mVar2.i().g(this, new e(new a(this)));
        m mVar3 = this.U;
        if (mVar3 == null) {
            cm.l.v("viewModel");
            mVar3 = null;
        }
        mVar3.j().g(this, new e(new b(this)));
        l2 l2Var4 = this.J;
        if (l2Var4 == null) {
            cm.l.v("mBinding");
            l2Var4 = null;
        }
        TextView textView = l2Var4.R;
        l2 l2Var5 = this.J;
        if (l2Var5 == null) {
            cm.l.v("mBinding");
            l2Var5 = null;
        }
        textView.setPaintFlags(l2Var5.R.getPaintFlags() | 8);
        l2 l2Var6 = this.J;
        if (l2Var6 == null) {
            cm.l.v("mBinding");
        } else {
            l2Var2 = l2Var6;
        }
        l2Var2.R.setOnClickListener(new lj.b(this));
    }

    /* access modifiers changed from: private */
    public static final void Y1(DLExtractActivity dLExtractActivity, View view) {
        cm.l.f(dLExtractActivity, "this$0");
        dLExtractActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void Z1(View view) {
    }

    /* access modifiers changed from: private */
    public static final void a2(DLExtractActivity dLExtractActivity, View view) {
        cm.l.f(dLExtractActivity, "this$0");
        try {
            Intent intent = new Intent(dLExtractActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", dLExtractActivity.L);
            intent.putExtra("dob", dLExtractActivity.M);
            intent.putExtra("DLDetails", dLExtractActivity.K1());
            intent.putExtra("Mobile_no", dLExtractActivity.N);
            intent.putExtra("lastEndorsedRTO", dLExtractActivity.O);
            intent.putExtra("lastEndorsedState", dLExtractActivity.P);
            intent.putExtra("lastEndorsedRTOCode", dLExtractActivity.T);
            intent.putExtra("lastEndorseStateCode", dLExtractActivity.Q);
            intent.putExtra("whatServiceRequired", dLExtractActivity.S);
            dLExtractActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void b2() {
        l2 l2Var = this.J;
        l2 l2Var2 = null;
        if (l2Var == null) {
            cm.l.v("mBinding");
            l2Var = null;
        }
        l2Var.K.setOnClickListener(new lj.e(this));
        l2 l2Var3 = this.J;
        if (l2Var3 == null) {
            cm.l.v("mBinding");
            l2Var3 = null;
        }
        l2Var3.S.setOnClickListener(new lj.f(this));
        l2 l2Var4 = this.J;
        if (l2Var4 == null) {
            cm.l.v("mBinding");
            l2Var4 = null;
        }
        l2Var4.H.setOnClickListener(new lj.g(this));
        l2 l2Var5 = this.J;
        if (l2Var5 == null) {
            cm.l.v("mBinding");
            l2Var5 = null;
        }
        l2Var5.B.setOnClickListener(new lj.h(this));
        l2 l2Var6 = this.J;
        if (l2Var6 == null) {
            cm.l.v("mBinding");
        } else {
            l2Var2 = l2Var6;
        }
        l2Var2.D.setOnClickListener(new i(this));
    }

    /* access modifiers changed from: private */
    public static final void c2(DLExtractActivity dLExtractActivity, View view) {
        String b10;
        String b11;
        cm.l.f(dLExtractActivity, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(dLExtractActivity)) {
            try {
                l2 l2Var = dLExtractActivity.J;
                l2 l2Var2 = null;
                if (l2Var == null) {
                    cm.l.v("mBinding");
                    l2Var = null;
                }
                Editable text = l2Var.B.getText();
                cm.l.e(text, "getText(...)");
                if (text.length() == 0) {
                    b11 = dLExtractActivity.N1().b("label_select_reason", dLExtractActivity.getString(R.string.sel_rsn));
                } else {
                    l2 l2Var3 = dLExtractActivity.J;
                    if (l2Var3 == null) {
                        cm.l.v("mBinding");
                        l2Var3 = null;
                    }
                    if (l2Var3.f27243y.getVisibility() == 0) {
                        l2 l2Var4 = dLExtractActivity.J;
                        if (l2Var4 == null) {
                            cm.l.v("mBinding");
                            l2Var4 = null;
                        }
                        Editable text2 = l2Var4.C.getText();
                        cm.l.e(text2, "getText(...)");
                        if (text2.length() == 0) {
                            b11 = dLExtractActivity.N1().b("edit_dl_serv_sel_reason", "");
                        } else if (cm.l.a(dLExtractActivity.W, "Y")) {
                            l2 l2Var5 = dLExtractActivity.J;
                            if (l2Var5 == null) {
                                cm.l.v("mBinding");
                                l2Var5 = null;
                            }
                            Editable text3 = l2Var5.I.getText();
                            cm.l.c(text3);
                            if (text3.length() == 0) {
                                b11 = dLExtractActivity.N1().b("label_mb", "");
                            } else {
                                l2 l2Var6 = dLExtractActivity.J;
                                if (l2Var6 == null) {
                                    cm.l.v("mBinding");
                                    l2Var6 = null;
                                }
                                Editable text4 = l2Var6.I.getText();
                                cm.l.c(text4);
                                if (text4.length() < 10) {
                                    b11 = dLExtractActivity.N1().b("label_log_entr_vali_mobno", "");
                                } else {
                                    c.a aVar = t8.c.f16582a;
                                    l2 l2Var7 = dLExtractActivity.J;
                                    if (l2Var7 == null) {
                                        cm.l.v("mBinding");
                                    } else {
                                        l2Var2 = l2Var7;
                                    }
                                    if (!aVar.q(String.valueOf(l2Var2.I.getText()))) {
                                        b11 = dLExtractActivity.N1().b("label_log_entr_vali_mobno", "");
                                    } else {
                                        b10 = dLExtractActivity.N1().b("label_want_to_proceed", dLExtractActivity.getString(R.string.are_you_want_to_proceed));
                                    }
                                }
                            }
                        } else {
                            b10 = dLExtractActivity.N1().b("label_want_to_proceed", dLExtractActivity.getString(R.string.are_you_want_to_proceed));
                        }
                    } else if (cm.l.a(dLExtractActivity.W, "Y")) {
                        l2 l2Var8 = dLExtractActivity.J;
                        if (l2Var8 == null) {
                            cm.l.v("mBinding");
                            l2Var8 = null;
                        }
                        Editable text5 = l2Var8.I.getText();
                        cm.l.c(text5);
                        if (text5.length() == 0) {
                            b11 = dLExtractActivity.N1().b("label_mb", "");
                        } else {
                            l2 l2Var9 = dLExtractActivity.J;
                            if (l2Var9 == null) {
                                cm.l.v("mBinding");
                                l2Var9 = null;
                            }
                            Editable text6 = l2Var9.I.getText();
                            cm.l.c(text6);
                            if (text6.length() < 10) {
                                b11 = dLExtractActivity.N1().b("label_log_entr_vali_mobno", "");
                            } else {
                                c.a aVar2 = t8.c.f16582a;
                                l2 l2Var10 = dLExtractActivity.J;
                                if (l2Var10 == null) {
                                    cm.l.v("mBinding");
                                } else {
                                    l2Var2 = l2Var10;
                                }
                                if (!aVar2.q(String.valueOf(l2Var2.I.getText()))) {
                                    b11 = dLExtractActivity.N1().b("label_log_entr_vali_mobno", "");
                                } else {
                                    b10 = dLExtractActivity.N1().b("label_want_to_proceed", dLExtractActivity.getString(R.string.are_you_want_to_proceed));
                                }
                            }
                        }
                    } else {
                        b10 = dLExtractActivity.N1().b("label_want_to_proceed", dLExtractActivity.getString(R.string.are_you_want_to_proceed));
                    }
                    cm.l.c(b10);
                    dLExtractActivity.l2(b10);
                    return;
                }
                cm.l.c(b11);
                dLExtractActivity.m2(b11);
            } catch (Exception unused) {
                String b12 = dLExtractActivity.N1().b("service_is_not_present", dLExtractActivity.getString(R.string.are_you_want_to_proceed));
                cm.l.c(b12);
                dLExtractActivity.m2(b12);
            }
        } else {
            Toast.makeText(dLExtractActivity.getApplicationContext(), dLExtractActivity.N1().b("label_log_check_internet", dLExtractActivity.getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void d2(DLExtractActivity dLExtractActivity, View view) {
        cm.l.f(dLExtractActivity, "this$0");
        try {
            l2 l2Var = dLExtractActivity.J;
            l2 l2Var2 = null;
            if (l2Var == null) {
                cm.l.v("mBinding");
                l2Var = null;
            }
            l2Var.S.setChecked(true);
            l2 l2Var3 = dLExtractActivity.J;
            if (l2Var3 == null) {
                cm.l.v("mBinding");
                l2Var3 = null;
            }
            l2Var3.H.setChecked(false);
            l2 l2Var4 = dLExtractActivity.J;
            if (l2Var4 == null) {
                cm.l.v("mBinding");
                l2Var4 = null;
            }
            l2Var4.C.setText((CharSequence) null);
            l2 l2Var5 = dLExtractActivity.J;
            if (l2Var5 == null) {
                cm.l.v("mBinding");
                l2Var5 = null;
            }
            l2Var5.B.setText((CharSequence) null);
            l2 l2Var6 = dLExtractActivity.J;
            if (l2Var6 == null) {
                cm.l.v("mBinding");
                l2Var6 = null;
            }
            l2Var6.B.setContentDescription((CharSequence) null);
            l2 l2Var7 = dLExtractActivity.J;
            if (l2Var7 == null) {
                cm.l.v("mBinding");
            } else {
                l2Var2 = l2Var7;
            }
            l2Var2.f27243y.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void e2(DLExtractActivity dLExtractActivity, View view) {
        cm.l.f(dLExtractActivity, "this$0");
        try {
            dLExtractActivity.W = "Y";
            l2 l2Var = dLExtractActivity.J;
            l2 l2Var2 = null;
            if (l2Var == null) {
                cm.l.v("mBinding");
                l2Var = null;
            }
            l2Var.H.setChecked(false);
            l2 l2Var3 = dLExtractActivity.J;
            if (l2Var3 == null) {
                cm.l.v("mBinding");
                l2Var3 = null;
            }
            l2Var3.S.setChecked(true);
            l2 l2Var4 = dLExtractActivity.J;
            if (l2Var4 == null) {
                cm.l.v("mBinding");
                l2Var4 = null;
            }
            l2Var4.I.setText((CharSequence) null);
            l2 l2Var5 = dLExtractActivity.J;
            if (l2Var5 == null) {
                cm.l.v("mBinding");
            } else {
                l2Var2 = l2Var5;
            }
            l2Var2.I.setVisibility(0);
        } catch (Exception unused) {
            String b10 = dLExtractActivity.N1().b("service_is_not_present", dLExtractActivity.getString(R.string.unable_to_get_details));
            cm.l.c(b10);
            dLExtractActivity.m2(b10);
        }
    }

    /* access modifiers changed from: private */
    public static final void f2(DLExtractActivity dLExtractActivity, View view) {
        cm.l.f(dLExtractActivity, "this$0");
        try {
            dLExtractActivity.W = "N";
            l2 l2Var = dLExtractActivity.J;
            l2 l2Var2 = null;
            if (l2Var == null) {
                cm.l.v("mBinding");
                l2Var = null;
            }
            l2Var.S.setChecked(false);
            l2 l2Var3 = dLExtractActivity.J;
            if (l2Var3 == null) {
                cm.l.v("mBinding");
                l2Var3 = null;
            }
            l2Var3.H.setChecked(true);
            l2 l2Var4 = dLExtractActivity.J;
            if (l2Var4 == null) {
                cm.l.v("mBinding");
                l2Var4 = null;
            }
            l2Var4.I.setText((CharSequence) null);
            l2 l2Var5 = dLExtractActivity.J;
            if (l2Var5 == null) {
                cm.l.v("mBinding");
            } else {
                l2Var2 = l2Var5;
            }
            l2Var2.I.setVisibility(8);
        } catch (Exception unused) {
            String b10 = dLExtractActivity.N1().b("service_is_not_present", dLExtractActivity.getString(R.string.unable_to_get_details));
            cm.l.c(b10);
            dLExtractActivity.m2(b10);
        }
    }

    /* access modifiers changed from: private */
    public static final void g2(DLExtractActivity dLExtractActivity, View view) {
        cm.l.f(dLExtractActivity, "this$0");
        dLExtractActivity.k2();
    }

    /* access modifiers changed from: private */
    public static final void h2(DLExtractActivity dLExtractActivity, View view) {
        cm.l.f(dLExtractActivity, "this$0");
        try {
            Intent intent = new Intent(dLExtractActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", dLExtractActivity.L);
            intent.putExtra("dob", dLExtractActivity.M);
            intent.putExtra("DLDetails", dLExtractActivity.K1());
            intent.putExtra("Mobile_no", dLExtractActivity.N);
            intent.putExtra("lastEndorsedRTO", dLExtractActivity.O);
            intent.putExtra("lastEndorsedState", dLExtractActivity.P);
            intent.putExtra("lastEndorsedRTOCode", dLExtractActivity.T);
            intent.putExtra("lastEndorseStateCode", dLExtractActivity.Q);
            intent.putExtra("whatServiceRequired", dLExtractActivity.S);
            dLExtractActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void i2(View view) {
    }

    /* access modifiers changed from: private */
    public static final void j2(DLExtractActivity dLExtractActivity, View view) {
        cm.l.f(dLExtractActivity, "this$0");
        dLExtractActivity.finish();
    }

    private final void k2() {
        ArrayList arrayList = new ArrayList();
        List<ReasonsMasterItem> list = this.V;
        if (list != null) {
            for (ReasonsMasterItem reasonsMasterItem : list) {
                arrayList.add(String.valueOf(reasonsMasterItem != null ? reasonsMasterItem.getReasonName() : null));
            }
        }
        kk.e a10 = kk.e.A0.a("Select Reason", arrayList);
        a10.k2(F0(), "ReasonPicker");
        a10.n2(new c(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0145, code lost:
        if (r1 == null) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014b, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01a5, code lost:
        if (r1 == null) goto L_0x0147;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l2(java.lang.String r34) {
        /*
            r33 = this;
            r0 = r33
            ni.l2 r1 = r0.J
            java.lang.String r2 = "mBinding"
            r3 = 0
            if (r1 != 0) goto L_0x000d
            cm.l.v(r2)
            r1 = r3
        L_0x000d:
            android.widget.EditText r1 = r1.B
            java.lang.CharSequence r1 = r1.getContentDescription()
            java.lang.String r8 = r1.toString()
            java.lang.String r1 = r0.f22013r0
            java.lang.String r4 = "same"
            boolean r1 = cm.l.a(r1, r4)
            java.lang.String r5 = "Y"
            java.lang.String r6 = "S"
            java.lang.String r7 = "viewModel"
            r9 = 1
            java.lang.String r10 = "normal"
            if (r1 == 0) goto L_0x010b
            java.lang.String r1 = r0.Z
            boolean r1 = cm.l.a(r1, r6)
            if (r1 == 0) goto L_0x010b
            java.lang.String r1 = r0.f21996a0
            boolean r1 = cm.l.a(r1, r5)
            if (r1 == 0) goto L_0x010b
            java.lang.String r1 = "normal not"
            android.util.Log.d(r10, r1)
            ni.l2 r1 = r0.J
            if (r1 != 0) goto L_0x0047
            cm.l.v(r2)
            r1 = r3
        L_0x0047:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r1 = r1.D
            r1.c(r9)
            lj.m r1 = r0.U
            if (r1 != 0) goto L_0x0055
            cm.l.v(r7)
            r4 = r3
            goto L_0x0056
        L_0x0055:
            r4 = r1
        L_0x0056:
            java.lang.String r5 = r0.L
            java.lang.String r6 = r0.M
            java.lang.String r7 = r0.T
            ni.l2 r1 = r0.J
            if (r1 != 0) goto L_0x0064
            cm.l.v(r2)
            goto L_0x0065
        L_0x0064:
            r3 = r1
        L_0x0065:
            android.widget.EditText r1 = r3.B
            android.text.Editable r1 = r1.getText()
            java.lang.String r9 = r1.toString()
            java.lang.String r10 = "N"
            java.lang.String r11 = " "
            java.lang.String r1 = r0.f22005j0
            r12 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f22006k0
            r13 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f22007l0
            r14 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f22008m0
            r15 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f22009n0
            r16 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f22010o0
            r17 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f22011p0
            r18 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f22012q0
            r19 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f21997b0
            r20 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f21998c0
            r21 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f21999d0
            r22 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f22000e0
            r23 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f22001f0
            r24 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f22002g0
            r25 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f22003h0
            r26 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.f22004i0
            r27 = r1
            cm.l.c(r1)
            java.lang.String r1 = r0.N
            r28 = r1
            cm.l.c(r1)
            ld.f r1 = r33.V1()
            java.lang.String r29 = r1.f()
            ld.f r1 = r33.V1()
            java.lang.String r30 = r1.g()
            ld.f r1 = r33.V1()
            java.lang.String r31 = r1.e()
            ld.f r1 = r33.V1()
            java.lang.String r32 = r1.h()
            r4.h(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x01a8
        L_0x010b:
            java.lang.String r1 = r0.f22013r0
            boolean r1 = cm.l.a(r1, r4)
            if (r1 == 0) goto L_0x0183
            java.lang.String r1 = r0.Z
            boolean r1 = cm.l.a(r1, r6)
            if (r1 == 0) goto L_0x0183
            java.lang.String r1 = r0.f21996a0
            boolean r1 = cm.l.a(r1, r5)
            if (r1 != 0) goto L_0x0183
            android.util.Log.d(r10, r10)
            ni.l2 r1 = r0.J
            if (r1 != 0) goto L_0x012e
            cm.l.v(r2)
            r1 = r3
        L_0x012e:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r1 = r1.D
            r1.c(r9)
            lj.m r1 = r0.U
            if (r1 != 0) goto L_0x013c
            cm.l.v(r7)
            r4 = r3
            goto L_0x013d
        L_0x013c:
            r4 = r1
        L_0x013d:
            java.lang.String r5 = r0.L
            java.lang.String r6 = r0.M
            java.lang.String r7 = r0.T
            ni.l2 r1 = r0.J
            if (r1 != 0) goto L_0x014b
        L_0x0147:
            cm.l.v(r2)
            goto L_0x014c
        L_0x014b:
            r3 = r1
        L_0x014c:
            android.widget.EditText r1 = r3.B
            android.text.Editable r1 = r1.getText()
            java.lang.String r9 = r1.toString()
            java.lang.String r10 = "N"
            java.lang.String r11 = " "
            java.lang.String r12 = r0.N
            cm.l.c(r12)
            ld.f r1 = r33.V1()
            java.lang.String r13 = r1.f()
            ld.f r1 = r33.V1()
            java.lang.String r14 = r1.g()
            ld.f r1 = r33.V1()
            java.lang.String r15 = r1.e()
            ld.f r1 = r33.V1()
            java.lang.String r16 = r1.h()
            r4.g(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x01a8
        L_0x0183:
            android.util.Log.d(r10, r10)
            ni.l2 r1 = r0.J
            if (r1 != 0) goto L_0x018e
            cm.l.v(r2)
            r1 = r3
        L_0x018e:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r1 = r1.D
            r1.c(r9)
            lj.m r1 = r0.U
            if (r1 != 0) goto L_0x019c
            cm.l.v(r7)
            r4 = r3
            goto L_0x019d
        L_0x019c:
            r4 = r1
        L_0x019d:
            java.lang.String r5 = r0.L
            java.lang.String r6 = r0.M
            java.lang.String r7 = r0.T
            ni.l2 r1 = r0.J
            if (r1 != 0) goto L_0x014b
            goto L_0x0147
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity.l2(java.lang.String):void");
    }

    public final DldetobjX K1() {
        DldetobjX dldetobjX = this.K;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    public final String L1() {
        return this.L;
    }

    public final String M1() {
        return this.M;
    }

    public final ld.c N1() {
        ld.c cVar = this.f22015t0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final String O1() {
        return this.O;
    }

    public final String P1() {
        return this.P;
    }

    public final String Q1() {
        return this.Q;
    }

    public final ld.g R1() {
        ld.g gVar = this.Y;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mSessionmanger");
        return null;
    }

    public final String S1() {
        return this.N;
    }

    public final ArrayList T1() {
        ArrayList arrayList = this.f22014s0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("multiListName");
        return null;
    }

    public final String U1() {
        return this.R;
    }

    public final f V1() {
        f fVar = this.X;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final void m2(String str) {
        cm.l.f(str, "message");
        String b10 = N1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        String b11 = N1().b("btn_ok", getString(R.string.ok_txt));
        cm.l.c(b11);
        g.n1(this, b10, str, 1, b11, (String) null, d.f22019e, 16, (Object) null);
    }

    public final void n2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.K = dldetobjX;
    }

    public final void o2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f22015t0 = cVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_dl_extract);
        cm.l.e(f10, "setContentView(...)");
        this.J = (l2) f10;
        r2(new f(this));
        p2(new ld.g(this));
        o2(new ld.c(this));
        e.a aVar = v9.e.f17509a;
        l2 l2Var = this.J;
        l2 l2Var2 = null;
        if (l2Var == null) {
            cm.l.v("mBinding");
            l2Var = null;
        }
        aVar.M0(this, l2Var);
        W1();
        X1();
        b2();
        l2 l2Var3 = this.J;
        if (l2Var3 == null) {
            cm.l.v("mBinding");
            l2Var3 = null;
        }
        l2Var3.G.f29581h.setOnClickListener(new lj.a(this));
        l2 l2Var4 = this.J;
        if (l2Var4 == null) {
            cm.l.v("mBinding");
            l2Var4 = null;
        }
        l2Var4.G.f29580g.setOnClickListener(new lj.c());
        l2 l2Var5 = this.J;
        if (l2Var5 == null) {
            cm.l.v("mBinding");
            l2Var5 = null;
        }
        l2Var5.G.f29577d.setOnClickListener(new lj.d(this));
        l2 l2Var6 = this.J;
        if (l2Var6 == null) {
            cm.l.v("mBinding");
            l2Var6 = null;
        }
        l2Var6.G.f29578e.setVisibility(8);
        l2 l2Var7 = this.J;
        if (l2Var7 == null) {
            cm.l.v("mBinding");
            l2Var7 = null;
        }
        l2Var7.F.f25961g.setText(V1().i());
        l2 l2Var8 = this.J;
        if (l2Var8 == null) {
            cm.l.v("mBinding");
            l2Var8 = null;
        }
        l2Var8.R.setVisibility(0);
        l2 l2Var9 = this.J;
        if (l2Var9 == null) {
            cm.l.v("mBinding");
        } else {
            l2Var2 = l2Var9;
        }
        l2Var2.f27241w.setVisibility(0);
    }

    public final void p2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.Y = gVar;
    }

    public final void q2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f22014s0 = arrayList;
    }

    public final void r2(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.X = fVar;
    }
}
