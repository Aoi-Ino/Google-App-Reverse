package com.nic.mparivahan.dlservices.ui.dobChange;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.b0;
import cm.h;
import cm.l;
import cm.m;
import cm.u;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineServiceInterface;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import kk.e;
import ni.x7;
import oi.g;
import oj.i;
import oj.j;
import oj.k;
import pl.x;
import v9.e;

public final class DobChangeActivity extends g {
    /* access modifiers changed from: private */
    public x7 J;
    /* access modifiers changed from: private */
    public ld.c K;
    private ek.a L;
    private pj.b M;
    /* access modifiers changed from: private */
    public List N;
    private Calendar O = Calendar.getInstance();
    private String P;
    private String Q = "Y";
    public ld.g R;
    private String S;
    private String T;
    private String U = "";
    private String V = "";
    private String W = "";
    private String X = "";
    private String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    public DldetobjX f22073a0;

    /* renamed from: b0  reason: collision with root package name */
    private HashMap f22074b0 = new HashMap();

    /* renamed from: c0  reason: collision with root package name */
    public ld.f f22075c0;

    /* renamed from: d0  reason: collision with root package name */
    private String f22076d0 = "N";

    /* renamed from: e0  reason: collision with root package name */
    private String f22077e0 = "N";

    /* renamed from: f0  reason: collision with root package name */
    private String f22078f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    private String f22079g0 = "";

    /* renamed from: h0  reason: collision with root package name */
    private String f22080h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    private String f22081i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    private String f22082j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private String f22083k0 = "";

    /* renamed from: l0  reason: collision with root package name */
    private String f22084l0 = "N";

    /* renamed from: m0  reason: collision with root package name */
    public Context f22085m0;

    /* renamed from: n0  reason: collision with root package name */
    private String f22086n0 = "0";

    /* renamed from: o0  reason: collision with root package name */
    public ArrayList f22087o0;

    /* renamed from: p0  reason: collision with root package name */
    public ArrayList f22088p0;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f22089q0;

    /* renamed from: r0  reason: collision with root package name */
    private int f22090r0;

    /* renamed from: s0  reason: collision with root package name */
    private int f22091s0;

    /* renamed from: t0  reason: collision with root package name */
    private String f22092t0 = "";

    /* renamed from: u0  reason: collision with root package name */
    private String f22093u0 = "";

    /* renamed from: v0  reason: collision with root package name */
    private String f22094v0 = "";

    /* renamed from: w0  reason: collision with root package name */
    private String f22095w0 = "";

    /* renamed from: x0  reason: collision with root package name */
    private ab.d f22096x0;

    /* renamed from: y0  reason: collision with root package name */
    public CombineServiceInterface f22097y0;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DobChangeActivity f22098e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f22099f;

        a(DobChangeActivity dobChangeActivity, u uVar) {
            this.f22098e = dobChangeActivity;
            this.f22099f = uVar;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            this.f22098e.B2(((AppCatPojo) ((ArrayList) this.f22099f.f20234e).get(i10)).getAppCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DobChangeActivity f22100e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DobChangeActivity dobChangeActivity) {
            super(1);
            this.f22100e = dobChangeActivity;
        }

        public final void b(GetReasonsTransWiseResponse getReasonsTransWiseResponse) {
            try {
                if (p.p(getReasonsTransWiseResponse.getStatusCode(), "00", false, 2, (Object) null)) {
                    this.f22100e.N = getReasonsTransWiseResponse.getReasonsMaster();
                } else {
                    this.f22100e.z2(getReasonsTransWiseResponse.getStatusDesc());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetReasonsTransWiseResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DobChangeActivity f22101e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DobChangeActivity dobChangeActivity) {
            super(1);
            this.f22101e = dobChangeActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            r0 = com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity.L1(r1.f22101e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x014e, code lost:
            if (r0 == null) goto L_0x0150;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0150, code lost:
            cm.l.v("binding");
            r0 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0155, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0157, code lost:
            r0.f29351l.c(false);
            r0 = r1.f22101e;
            r4 = com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity.M1(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0162, code lost:
            if (r4 == null) goto L_0x0164;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0164, code lost:
            cm.l.v("langSession");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0168, code lost:
            r7 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0169, code lost:
            r0.z2(r7.b("service_is_not_present", r1.f22101e.getString(com.nic.mparivahan.R.string.unable_to_get_details)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0180, code lost:
            r0.printStackTrace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0148 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r31) {
            /*
                r30 = this;
                r1 = r30
                java.lang.String r2 = "service_is_not_present"
                java.lang.String r3 = "langSession"
                java.lang.String r4 = "binding"
                r5 = 2132019337(0x7f140889, float:1.9677006E38)
                r6 = 0
                r7 = 0
                com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r0 = r1.f22101e     // Catch:{ Exception -> 0x0148 }
                ni.x7 r0 = r0.J     // Catch:{ Exception -> 0x0148 }
                if (r0 != 0) goto L_0x0019
                cm.l.v(r4)     // Catch:{ Exception -> 0x0148 }
                r0 = r7
            L_0x0019:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f29351l     // Catch:{ Exception -> 0x0148 }
                r0.c(r6)     // Catch:{ Exception -> 0x0148 }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r31.getDlSubmitresult()     // Catch:{ Exception -> 0x0148 }
                if (r0 == 0) goto L_0x0029
                java.lang.String r0 = r0.getStatusCode()     // Catch:{ Exception -> 0x0148 }
                goto L_0x002a
            L_0x0029:
                r0 = r7
            L_0x002a:
                java.lang.String r8 = "00"
                r9 = 2
                boolean r0 = km.p.p(r0, r8, r6, r9, r7)     // Catch:{ Exception -> 0x0148 }
                if (r0 == 0) goto L_0x0107
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r31.getDlSubmitresult()     // Catch:{ Exception -> 0x0148 }
                if (r0 == 0) goto L_0x0176
                java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x0148 }
                if (r0 == 0) goto L_0x0176
                java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x0148 }
                boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0148 }
                r8 = 1
                r0 = r0 ^ r8
                if (r0 != r8) goto L_0x0176
                com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r9 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x0148 }
                r9.<init>()     // Catch:{ Exception -> 0x0148 }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r31.getDlSubmitresult()     // Catch:{ Exception -> 0x0148 }
                java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x0148 }
                java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x0148 }
                r11 = r0
                com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r11 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r11     // Catch:{ Exception -> 0x0148 }
                if (r11 == 0) goto L_0x0176
                com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r10 = r1.f22101e     // Catch:{ Exception -> 0x0148 }
                com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r12 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x00ad }
                java.lang.String r14 = "1234"
                java.lang.String r15 = "S"
                java.lang.String r16 = r11.getApplicationDate()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r0 = r11.getApplicationNo()     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r0)     // Catch:{ Exception -> 0x00ad }
                long r17 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00ad }
                ld.g r0 = r10.b2()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r0 = r0.k()     // Catch:{ Exception -> 0x00ad }
                int r19 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00ad }
                java.lang.String r20 = r11.getDateofBirth()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r21 = r11.getDlno()     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r21)     // Catch:{ Exception -> 0x00ad }
                java.lang.String r22 = "N"
                java.lang.String r23 = "N"
                java.lang.String r24 = r11.getApplicantGender()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r25 = r10.c2()     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r25)     // Catch:{ Exception -> 0x00ad }
                r26 = 0
                java.lang.String r27 = "548"
                java.lang.String r28 = r10.V1()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r29 = r10.Y1()     // Catch:{ Exception -> 0x00ad }
                r13 = r10
                r12.a(r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x00ad }
                goto L_0x00b7
            L_0x00ad:
                r0 = move-exception
                java.lang.String r8 = "valiii"
                java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ Exception -> 0x0148 }
                android.util.Log.d(r8, r0)     // Catch:{ Exception -> 0x0148 }
            L_0x00b7:
                ld.f r0 = r10.e2()     // Catch:{ Exception -> 0x0148 }
                java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x0148 }
                java.lang.String r8 = "950"
                boolean r0 = cm.l.a(r0, r8)     // Catch:{ Exception -> 0x0148 }
                if (r0 != 0) goto L_0x00de
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0148 }
                r0.<init>()     // Catch:{ Exception -> 0x0148 }
                r10.G2(r0)     // Catch:{ Exception -> 0x0148 }
                java.util.ArrayList r0 = r10.d2()     // Catch:{ Exception -> 0x0148 }
                ld.f r8 = r10.e2()     // Catch:{ Exception -> 0x0148 }
                java.lang.String r8 = r8.i()     // Catch:{ Exception -> 0x0148 }
                r0.add(r8)     // Catch:{ Exception -> 0x0148 }
            L_0x00de:
                java.lang.String r12 = r10.V1()     // Catch:{ Exception -> 0x0148 }
                com.nic.mparivahan.Dl.Model.DldetobjX r13 = r10.S1()     // Catch:{ Exception -> 0x0148 }
                java.lang.String r14 = r10.T1()     // Catch:{ Exception -> 0x0148 }
                java.lang.String r15 = r10.U1()     // Catch:{ Exception -> 0x0148 }
                java.lang.String r16 = r10.c2()     // Catch:{ Exception -> 0x0148 }
                java.lang.String r17 = r10.W1()     // Catch:{ Exception -> 0x0148 }
                java.lang.String r18 = r10.X1()     // Catch:{ Exception -> 0x0148 }
                java.lang.String r19 = r10.Y1()     // Catch:{ Exception -> 0x0148 }
                java.util.ArrayList r20 = r10.d2()     // Catch:{ Exception -> 0x0148 }
                r9.E2(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0148 }
                goto L_0x0176
            L_0x0107:
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r31.getDlSubmitresult()     // Catch:{ Exception -> 0x0148 }
                if (r0 == 0) goto L_0x0112
                java.lang.String r0 = r0.getReqStatus()     // Catch:{ Exception -> 0x0148 }
                goto L_0x0113
            L_0x0112:
                r0 = r7
            L_0x0113:
                if (r0 == 0) goto L_0x0131
                int r0 = r0.length()     // Catch:{ Exception -> 0x0148 }
                if (r0 != 0) goto L_0x011c
                goto L_0x0131
            L_0x011c:
                com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r0 = r1.f22101e     // Catch:{ Exception -> 0x0148 }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r8 = r31.getDlSubmitresult()     // Catch:{ Exception -> 0x0148 }
                if (r8 == 0) goto L_0x0129
                java.lang.String r8 = r8.getReqStatus()     // Catch:{ Exception -> 0x0148 }
                goto L_0x012a
            L_0x0129:
                r8 = r7
            L_0x012a:
                cm.l.c(r8)     // Catch:{ Exception -> 0x0148 }
            L_0x012d:
                r0.z2(r8)     // Catch:{ Exception -> 0x0148 }
                goto L_0x0176
            L_0x0131:
                com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r0 = r1.f22101e     // Catch:{ Exception -> 0x0148 }
                ld.c r8 = r0.K     // Catch:{ Exception -> 0x0148 }
                if (r8 != 0) goto L_0x013d
                cm.l.v(r3)     // Catch:{ Exception -> 0x0148 }
                r8 = r7
            L_0x013d:
                com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r9 = r1.f22101e     // Catch:{ Exception -> 0x0148 }
                java.lang.String r9 = r9.getString(r5)     // Catch:{ Exception -> 0x0148 }
                java.lang.String r8 = r8.b(r2, r9)     // Catch:{ Exception -> 0x0148 }
                goto L_0x012d
            L_0x0148:
                com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r0 = r1.f22101e     // Catch:{ Exception -> 0x0155 }
                ni.x7 r0 = r0.J     // Catch:{ Exception -> 0x0155 }
                if (r0 != 0) goto L_0x0157
                cm.l.v(r4)     // Catch:{ Exception -> 0x0155 }
                r0 = r7
                goto L_0x0157
            L_0x0155:
                r0 = move-exception
                goto L_0x0180
            L_0x0157:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f29351l     // Catch:{ Exception -> 0x0155 }
                r0.c(r6)     // Catch:{ Exception -> 0x0155 }
                com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r0 = r1.f22101e     // Catch:{ Exception -> 0x0155 }
                ld.c r4 = r0.K     // Catch:{ Exception -> 0x0155 }
                if (r4 != 0) goto L_0x0168
                cm.l.v(r3)     // Catch:{ Exception -> 0x0155 }
                goto L_0x0169
            L_0x0168:
                r7 = r4
            L_0x0169:
                com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r3 = r1.f22101e     // Catch:{ Exception -> 0x0155 }
                java.lang.String r3 = r3.getString(r5)     // Catch:{ Exception -> 0x0155 }
                java.lang.String r2 = r7.b(r2, r3)     // Catch:{ Exception -> 0x0155 }
                r0.z2(r2)     // Catch:{ Exception -> 0x0155 }
            L_0x0176:
                java.lang.String r0 = "Response"
                java.lang.String r2 = r31.toString()     // Catch:{ Exception -> 0x0155 }
                android.util.Log.e(r0, r2)     // Catch:{ Exception -> 0x0155 }
                goto L_0x0183
            L_0x0180:
                r0.printStackTrace()
            L_0x0183:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity.c.b(com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetAckDetForGivenDLNumberResponse) obj);
            return x.f30437a;
        }
    }

    public static final class d implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DobChangeActivity f22102a;

        d(DobChangeActivity dobChangeActivity) {
            this.f22102a = dobChangeActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r6 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem) r0.get(r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r5, int r6) {
            /*
                r4 = this;
                com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r0 = r4.f22102a
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
                com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r0 = r4.f22102a
                ni.x7 r0 = r0.J
                java.lang.String r2 = "binding"
                if (r0 != 0) goto L_0x0025
                cm.l.v(r2)
                r0 = r1
            L_0x0025:
                android.widget.EditText r0 = r0.f29349j
                r0.setText(r5)
                com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r5 = r4.f22102a
                ni.x7 r5 = r5.J
                if (r5 != 0) goto L_0x0036
                cm.l.v(r2)
                r5 = r1
            L_0x0036:
                android.widget.EditText r5 = r5.f29349j
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = ""
                r0.append(r3)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.setContentDescription(r6)
                com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r5 = r4.f22102a
                ni.x7 r5 = r5.J
                if (r5 != 0) goto L_0x0058
                cm.l.v(r2)
                r5 = r1
            L_0x0058:
                android.widget.EditText r5 = r5.f29349j
                android.text.Editable r5 = r5.getText()
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "Miscellaneous"
                r0 = 1
                boolean r5 = km.p.o(r5, r6, r0)
                if (r5 == 0) goto L_0x007f
                com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r5 = r4.f22102a
                ni.x7 r5 = r5.J
                if (r5 != 0) goto L_0x0077
                cm.l.v(r2)
                goto L_0x0078
            L_0x0077:
                r1 = r5
            L_0x0078:
                android.widget.LinearLayout r5 = r1.f29350k
                r6 = 0
            L_0x007b:
                r5.setVisibility(r6)
                goto L_0x0091
            L_0x007f:
                com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r5 = r4.f22102a
                ni.x7 r5 = r5.J
                if (r5 != 0) goto L_0x008b
                cm.l.v(r2)
                goto L_0x008c
            L_0x008b:
                r1 = r5
            L_0x008c:
                android.widget.LinearLayout r5 = r1.f29350k
                r6 = 8
                goto L_0x007b
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity.d.a(java.lang.String, int):void");
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final e f22103e = new e();

        e() {
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

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f22104a;

        f(bm.l lVar) {
            l.f(lVar, "function");
            this.f22104a = lVar;
        }

        public final pl.c a() {
            return this.f22104a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22104a.invoke(obj);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: ni.x7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: ld.c} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A2() {
        /*
            r95 = this;
            r6 = r95
            java.lang.String r0 = "Y"
            java.util.ArrayList r1 = r95.d2()
            int r1 = r1.size()
            int r2 = r6.f22091s0
            java.lang.String r3 = "formated_date"
            java.lang.Class<com.nic.mparivahan.DlCombineServices.CombineReq> r4 = com.nic.mparivahan.DlCombineServices.CombineReq.class
            java.lang.String r5 = ""
            java.lang.String r7 = "MultiService"
            java.lang.String r8 = "binding"
            java.lang.String r9 = "langSession"
            r10 = 0
            if (r1 <= r2) goto L_0x0509
            android.content.Context r1 = r95.getApplicationContext()     // Catch:{ Exception -> 0x07c9 }
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)     // Catch:{ Exception -> 0x07c9 }
            i7.d r2 = new i7.d     // Catch:{ Exception -> 0x07c9 }
            r2.<init>()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r1 = r1.getString(r7, r5)     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r1 = r2.j(r1, r4)     // Catch:{ Exception -> 0x07c9 }
            com.nic.mparivahan.DlCombineServices.CombineReq r1 = (com.nic.mparivahan.DlCombineServices.CombineReq) r1     // Catch:{ Exception -> 0x07c9 }
            com.nic.mparivahan.DlCombineServices.CombineReq r2 = new com.nic.mparivahan.DlCombineServices.CombineReq     // Catch:{ Exception -> 0x07c9 }
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = 0
            r77 = 0
            r78 = 0
            r79 = 0
            r80 = 0
            r81 = 0
            r82 = 0
            r83 = 0
            r84 = 0
            r85 = 0
            r86 = -1
            r87 = -1
            r88 = 1023(0x3ff, float:1.434E-42)
            r89 = 0
            r11 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getPofbirth()     // Catch:{ Exception -> 0x07c9 }
            r2.setPofbirth(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getCountry()     // Catch:{ Exception -> 0x07c9 }
            r2.setCountry(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getPassno()     // Catch:{ Exception -> 0x07c9 }
            r2.setPassno(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getPassvaltill()     // Catch:{ Exception -> 0x07c9 }
            r2.setPassvaltill(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getVisano()     // Catch:{ Exception -> 0x07c9 }
            r2.setVisano(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getVisavaltill()     // Catch:{ Exception -> 0x07c9 }
            r2.setVisavaltill(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getTovisit()     // Catch:{ Exception -> 0x07c9 }
            r2.setTovisit(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getIscountryrestricted()     // Catch:{ Exception -> 0x07c9 }
            r2.setIscountryrestricted(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getCountryRestrictedReason()     // Catch:{ Exception -> 0x07c9 }
            r2.setCountryRestrictedReason(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.isDlSerdisqualified()     // Catch:{ Exception -> 0x07c9 }
            r2.setDlSerdisqualified(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getDlSerdisqualifiedReason()     // Catch:{ Exception -> 0x07c9 }
            r2.setDlSerdisqualifiedReason(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getForAdd1()     // Catch:{ Exception -> 0x07c9 }
            r2.setForAdd1(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getForAdd2()     // Catch:{ Exception -> 0x07c9 }
            r2.setForAdd2(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getForAdd3()     // Catch:{ Exception -> 0x07c9 }
            r2.setForAdd3(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getForAddPinCode()     // Catch:{ Exception -> 0x07c9 }
            r2.setForAddPinCode(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getForNationMobNum()     // Catch:{ Exception -> 0x07c9 }
            r2.setForNationMobNum(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getEmailID()     // Catch:{ Exception -> 0x07c9 }
            r2.setEmailID(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getAppliedIdpfromIndEmb()     // Catch:{ Exception -> 0x07c9 }
            r2.setAppliedIdpfromIndEmb(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getIndEmbName()     // Catch:{ Exception -> 0x07c9 }
            r2.setIndEmbName(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getEmbPlace()     // Catch:{ Exception -> 0x07c9 }
            r2.setEmbPlace(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getDateOfVerifEmb()     // Catch:{ Exception -> 0x07c9 }
            r2.setDateOfVerifEmb(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getEmbEndorseNo()     // Catch:{ Exception -> 0x07c9 }
            r2.setEmbEndorseNo(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r1.getIdpcountryapplyfrom()     // Catch:{ Exception -> 0x07c9 }
            r2.setIdpcountryapplyfrom(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r6.P     // Catch:{ Exception -> 0x07c9 }
            if (r4 != 0) goto L_0x017b
            cm.l.v(r3)     // Catch:{ Exception -> 0x07c9 }
            r4 = r10
        L_0x017b:
            r2.setApplDateOfBirth(r4)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r6.f22093u0     // Catch:{ Exception -> 0x07c9 }
            r2.setCodobDlReasonName(r3)     // Catch:{ Exception -> 0x07c9 }
            ni.x7 r3 = r6.J     // Catch:{ Exception -> 0x07c9 }
            if (r3 != 0) goto L_0x018b
            cm.l.v(r8)     // Catch:{ Exception -> 0x07c9 }
            r3 = r10
        L_0x018b:
            android.widget.EditText r3 = r3.f29349j     // Catch:{ Exception -> 0x07c9 }
            java.lang.CharSequence r3 = r3.getContentDescription()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x07c9 }
            r2.setCodobDlReasonCode(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getDupDlReasonName()     // Catch:{ Exception -> 0x07c9 }
            r2.setDupDlReasonName(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getDupDlReasonCode()     // Catch:{ Exception -> 0x07c9 }
            r2.setDupDlReasonCode(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getDleDlReasonCode()     // Catch:{ Exception -> 0x07c9 }
            r2.setDleDlReasonCode(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getDleDlReasonName()     // Catch:{ Exception -> 0x07c9 }
            r2.setDleDlReasonName(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getApplcatgDLserReq()     // Catch:{ Exception -> 0x07c9 }
            r2.setApplcatgDLserReq(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getDlHolderAltMobMum()     // Catch:{ Exception -> 0x07c9 }
            r2.setDlHolderAltMobMum(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getWilltoDonateOrgans()     // Catch:{ Exception -> 0x07c9 }
            r2.setWilltoDonateOrgans(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getRelationType()     // Catch:{ Exception -> 0x07c9 }
            r2.setRelationType(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.Integer r3 = r1.getConDlReasonCode()     // Catch:{ Exception -> 0x07c9 }
            r2.setConDlReasonCode(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getConDlReasonName()     // Catch:{ Exception -> 0x07c9 }
            r2.setConDlReasonName(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getDlHolderNaturalName()     // Catch:{ Exception -> 0x07c9 }
            r2.setDlHolderNaturalName(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getConEffdate()     // Catch:{ Exception -> 0x07c9 }
            r2.setConEffdate(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getApplFirstName()     // Catch:{ Exception -> 0x07c9 }
            r2.setApplFirstName(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getApplLastName()     // Catch:{ Exception -> 0x07c9 }
            r2.setApplLastName(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getRelFirstName()     // Catch:{ Exception -> 0x07c9 }
            r2.setRelFirstName(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getRelLastName()     // Catch:{ Exception -> 0x07c9 }
            r2.setRelLastName(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getMobileNumber()     // Catch:{ Exception -> 0x07c9 }
            r2.setMobileNumber(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getChangeOfAddReq()     // Catch:{ Exception -> 0x07c9 }
            r2.setChangeOfAddReq(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPerHouseNo()     // Catch:{ Exception -> 0x07c9 }
            r2.setPerHouseNo(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPerStreet()     // Catch:{ Exception -> 0x07c9 }
            r2.setPerStreet(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPerLocation()     // Catch:{ Exception -> 0x07c9 }
            r2.setPerLocation(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPermVillageOrTown()     // Catch:{ Exception -> 0x07c9 }
            r2.setPermVillageOrTown(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPerSubDistrict()     // Catch:{ Exception -> 0x07c9 }
            r2.setPerSubDistrict(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPerDistrict()     // Catch:{ Exception -> 0x07c9 }
            r2.setPerDistrict(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPerState()     // Catch:{ Exception -> 0x07c9 }
            r2.setPerState(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPerPinCode()     // Catch:{ Exception -> 0x07c9 }
            r2.setPerPinCode(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPresHouseNo()     // Catch:{ Exception -> 0x07c9 }
            r2.setPresHouseNo(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPresStreet()     // Catch:{ Exception -> 0x07c9 }
            r2.setPresStreet(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPresLocation()     // Catch:{ Exception -> 0x07c9 }
            r2.setPresLocation(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPresVillageOrTown()     // Catch:{ Exception -> 0x07c9 }
            r2.setPresVillageOrTown(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPresSubDistrict()     // Catch:{ Exception -> 0x07c9 }
            r2.setPresSubDistrict(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPresDistrict()     // Catch:{ Exception -> 0x07c9 }
            r2.setPresDistrict(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPresState()     // Catch:{ Exception -> 0x07c9 }
            r2.setPresState(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getPresPincode()     // Catch:{ Exception -> 0x07c9 }
            r2.setPresPincode(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getDeclaringcheck()     // Catch:{ Exception -> 0x07c9 }
            r2.setDeclaringcheck(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getHillcertificate()     // Catch:{ Exception -> 0x07c9 }
            r2.setHillcertificate(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getHillissueDate()     // Catch:{ Exception -> 0x07c9 }
            r2.setHillissueDate(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getHillvalidFrom()     // Catch:{ Exception -> 0x07c9 }
            r2.setHillvalidFrom(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getHillvalidTo()     // Catch:{ Exception -> 0x07c9 }
            r2.setHillvalidTo(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r1.getHilldrivingschool()     // Catch:{ Exception -> 0x07c9 }
            r2.setHilldrivingschool(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r1 = r1.getHillissby()     // Catch:{ Exception -> 0x07c9 }
            r2.setHillissby(r1)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r1 = r6.Q     // Catch:{ Exception -> 0x07c9 }
            boolean r1 = cm.l.a(r1, r0)     // Catch:{ Exception -> 0x07c9 }
            if (r1 == 0) goto L_0x02d8
            r2.setWilltoDonateOrgans(r0)     // Catch:{ Exception -> 0x07c9 }
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x07c9 }
            if (r0 != 0) goto L_0x02ca
            cm.l.v(r8)     // Catch:{ Exception -> 0x07c9 }
            r0 = r10
        L_0x02ca:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f29356q     // Catch:{ Exception -> 0x07c9 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x07c9 }
        L_0x02d4:
            r2.setDlHolderAltMobMum(r0)     // Catch:{ Exception -> 0x07c9 }
            goto L_0x02e0
        L_0x02d8:
            java.lang.String r0 = "N"
            r2.setWilltoDonateOrgans(r0)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r0 = "NA"
            goto L_0x02d4
        L_0x02e0:
            android.content.Context r0 = r95.getApplicationContext()     // Catch:{ Exception -> 0x07c9 }
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)     // Catch:{ Exception -> 0x07c9 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x07c9 }
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x07c9 }
            r1.<init>()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r1 = r1.t(r2)     // Catch:{ Exception -> 0x07c9 }
            r0.putString(r7, r1)     // Catch:{ Exception -> 0x07c9 }
            r0.commit()     // Catch:{ Exception -> 0x07c9 }
            java.util.ArrayList r0 = r95.d2()     // Catch:{ Exception -> 0x07c9 }
            int r1 = r6.f22091s0     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x07c9 }
            ld.c r1 = r6.K     // Catch:{ Exception -> 0x07c9 }
            if (r1 != 0) goto L_0x030d
            cm.l.v(r9)     // Catch:{ Exception -> 0x07c9 }
            r1 = r10
        L_0x030d:
            java.lang.String r2 = "check_dl_serv_dupl_dl"
            java.lang.String r3 = "Issue of Duplicate DL"
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x07c9 }
            boolean r0 = cm.l.a(r0, r1)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r1 = "getIntent(...)"
            if (r0 == 0) goto L_0x0344
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x07c9 }
            java.lang.Class<com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity> r2 = com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity.class
            r0.<init>(r6, r2)     // Catch:{ Exception -> 0x07c9 }
            r6.setIntent(r0)     // Catch:{ Exception -> 0x07c9 }
            android.content.Intent r2 = r95.getIntent()     // Catch:{ Exception -> 0x07c9 }
            cm.l.e(r2, r1)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r6.X     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r6.W     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r5 = "513"
        L_0x0334:
            java.util.ArrayList r7 = r95.d2()     // Catch:{ Exception -> 0x07c9 }
            r0 = r95
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            r0.n2(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x07c9 }
            goto L_0x07c9
        L_0x0344:
            java.util.ArrayList r0 = r95.d2()     // Catch:{ Exception -> 0x07c9 }
            int r2 = r6.f22091s0     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x07c9 }
            ld.c r2 = r6.K     // Catch:{ Exception -> 0x07c9 }
            if (r2 != 0) goto L_0x0356
            cm.l.v(r9)     // Catch:{ Exception -> 0x07c9 }
            r2 = r10
        L_0x0356:
            java.lang.String r3 = "check_dl_serv_renewal_dl"
            java.lang.String r4 = "Renewal of DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x07c9 }
            boolean r0 = cm.l.a(r0, r2)     // Catch:{ Exception -> 0x07c9 }
            java.lang.Class<com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity> r2 = com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity.class
            if (r0 == 0) goto L_0x037c
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x07c9 }
            r0.<init>(r6, r2)     // Catch:{ Exception -> 0x07c9 }
            r6.setIntent(r0)     // Catch:{ Exception -> 0x07c9 }
            android.content.Intent r2 = r95.getIntent()     // Catch:{ Exception -> 0x07c9 }
            cm.l.e(r2, r1)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r6.X     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r6.W     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r5 = "514"
            goto L_0x0334
        L_0x037c:
            java.util.ArrayList r0 = r95.d2()     // Catch:{ Exception -> 0x07c9 }
            int r3 = r6.f22091s0     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x07c9 }
            ld.c r3 = r6.K     // Catch:{ Exception -> 0x07c9 }
            if (r3 != 0) goto L_0x038e
            cm.l.v(r9)     // Catch:{ Exception -> 0x07c9 }
            r3 = r10
        L_0x038e:
            java.lang.String r4 = "revalidtion_expired_dl"
            java.lang.String r5 = "Re-Validation of Expired DL"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x07c9 }
            boolean r0 = cm.l.a(r0, r3)     // Catch:{ Exception -> 0x07c9 }
            if (r0 == 0) goto L_0x03b2
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x07c9 }
            r0.<init>(r6, r2)     // Catch:{ Exception -> 0x07c9 }
            r6.setIntent(r0)     // Catch:{ Exception -> 0x07c9 }
            android.content.Intent r2 = r95.getIntent()     // Catch:{ Exception -> 0x07c9 }
            cm.l.e(r2, r1)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r6.X     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r6.W     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r5 = "537"
            goto L_0x0334
        L_0x03b2:
            java.util.ArrayList r0 = r95.d2()     // Catch:{ Exception -> 0x07c9 }
            int r2 = r6.f22091s0     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x07c9 }
            ld.c r2 = r6.K     // Catch:{ Exception -> 0x07c9 }
            if (r2 != 0) goto L_0x03c4
            cm.l.v(r9)     // Catch:{ Exception -> 0x07c9 }
            r2 = r10
        L_0x03c4:
            java.lang.String r3 = "check_dl_serv_change_addr"
            java.lang.String r4 = "Change of Address in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x07c9 }
            boolean r0 = cm.l.a(r0, r2)     // Catch:{ Exception -> 0x07c9 }
            if (r0 == 0) goto L_0x03eb
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x07c9 }
            java.lang.Class<com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity> r2 = com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity.class
            r0.<init>(r6, r2)     // Catch:{ Exception -> 0x07c9 }
            r6.setIntent(r0)     // Catch:{ Exception -> 0x07c9 }
            android.content.Intent r2 = r95.getIntent()     // Catch:{ Exception -> 0x07c9 }
            cm.l.e(r2, r1)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r6.X     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r6.W     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r5 = "515"
            goto L_0x0334
        L_0x03eb:
            java.util.ArrayList r0 = r95.d2()     // Catch:{ Exception -> 0x07c9 }
            int r2 = r6.f22091s0     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x07c9 }
            ld.c r2 = r6.K     // Catch:{ Exception -> 0x07c9 }
            if (r2 != 0) goto L_0x03fd
            cm.l.v(r9)     // Catch:{ Exception -> 0x07c9 }
            r2 = r10
        L_0x03fd:
            java.lang.String r3 = "check_dl_serv_replacement_dl"
            java.lang.String r4 = "Replacement of DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x07c9 }
            boolean r0 = cm.l.a(r0, r2)     // Catch:{ Exception -> 0x07c9 }
            if (r0 == 0) goto L_0x0424
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x07c9 }
            java.lang.Class<com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity> r2 = com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity.class
            r0.<init>(r6, r2)     // Catch:{ Exception -> 0x07c9 }
            r6.setIntent(r0)     // Catch:{ Exception -> 0x07c9 }
            android.content.Intent r2 = r95.getIntent()     // Catch:{ Exception -> 0x07c9 }
            cm.l.e(r2, r1)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r6.X     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r6.W     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r5 = "516"
            goto L_0x0334
        L_0x0424:
            java.util.ArrayList r0 = r95.d2()     // Catch:{ Exception -> 0x07c9 }
            int r2 = r6.f22091s0     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x07c9 }
            ld.c r2 = r6.K     // Catch:{ Exception -> 0x07c9 }
            if (r2 != 0) goto L_0x0436
            cm.l.v(r9)     // Catch:{ Exception -> 0x07c9 }
            r2 = r10
        L_0x0436:
            java.lang.String r3 = "check_dl_serv_extract_dl"
            java.lang.String r4 = "DL Extract"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x07c9 }
            boolean r0 = cm.l.a(r0, r2)     // Catch:{ Exception -> 0x07c9 }
            if (r0 == 0) goto L_0x045d
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x07c9 }
            java.lang.Class<com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity> r2 = com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity.class
            r0.<init>(r6, r2)     // Catch:{ Exception -> 0x07c9 }
            r6.setIntent(r0)     // Catch:{ Exception -> 0x07c9 }
            android.content.Intent r2 = r95.getIntent()     // Catch:{ Exception -> 0x07c9 }
            cm.l.e(r2, r1)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r6.X     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r6.W     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r5 = "523"
            goto L_0x0334
        L_0x045d:
            java.util.ArrayList r0 = r95.d2()     // Catch:{ Exception -> 0x07c9 }
            int r2 = r6.f22091s0     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x07c9 }
            ld.c r2 = r6.K     // Catch:{ Exception -> 0x07c9 }
            if (r2 != 0) goto L_0x046f
            cm.l.v(r9)     // Catch:{ Exception -> 0x07c9 }
            r2 = r10
        L_0x046f:
            java.lang.String r3 = "hill_region_title"
            java.lang.String r4 = "Endorsement to Drive in Hill Region"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x07c9 }
            boolean r0 = cm.l.a(r0, r2)     // Catch:{ Exception -> 0x07c9 }
            if (r0 == 0) goto L_0x0496
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x07c9 }
            java.lang.Class<com.nic.mparivahan.dlservices.ui.hillService.HillReligion> r2 = com.nic.mparivahan.dlservices.ui.hillService.HillReligion.class
            r0.<init>(r6, r2)     // Catch:{ Exception -> 0x07c9 }
            r6.setIntent(r0)     // Catch:{ Exception -> 0x07c9 }
            android.content.Intent r2 = r95.getIntent()     // Catch:{ Exception -> 0x07c9 }
            cm.l.e(r2, r1)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r6.X     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r6.W     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r5 = "524"
            goto L_0x0334
        L_0x0496:
            java.util.ArrayList r0 = r95.d2()     // Catch:{ Exception -> 0x07c9 }
            int r2 = r6.f22091s0     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x07c9 }
            ld.c r2 = r6.K     // Catch:{ Exception -> 0x07c9 }
            if (r2 != 0) goto L_0x04a8
            cm.l.v(r9)     // Catch:{ Exception -> 0x07c9 }
            r2 = r10
        L_0x04a8:
            java.lang.String r3 = "change_name_dl"
            java.lang.String r4 = "Change of Name in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x07c9 }
            boolean r0 = cm.l.a(r0, r2)     // Catch:{ Exception -> 0x07c9 }
            if (r0 == 0) goto L_0x04cf
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x07c9 }
            java.lang.Class<com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName> r2 = com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName.class
            r0.<init>(r6, r2)     // Catch:{ Exception -> 0x07c9 }
            r6.setIntent(r0)     // Catch:{ Exception -> 0x07c9 }
            android.content.Intent r2 = r95.getIntent()     // Catch:{ Exception -> 0x07c9 }
            cm.l.e(r2, r1)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r6.X     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r6.W     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r5 = "526"
            goto L_0x0334
        L_0x04cf:
            java.util.ArrayList r0 = r95.d2()     // Catch:{ Exception -> 0x07c9 }
            int r2 = r6.f22091s0     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x07c9 }
            ld.c r2 = r6.K     // Catch:{ Exception -> 0x07c9 }
            if (r2 != 0) goto L_0x04e1
            cm.l.v(r9)     // Catch:{ Exception -> 0x07c9 }
            goto L_0x04e2
        L_0x04e1:
            r10 = r2
        L_0x04e2:
            java.lang.String r2 = "change_birth_dl"
            java.lang.String r3 = "Change of Date of Birth in DL"
            java.lang.String r2 = r10.b(r2, r3)     // Catch:{ Exception -> 0x07c9 }
            boolean r0 = cm.l.a(r0, r2)     // Catch:{ Exception -> 0x07c9 }
            if (r0 == 0) goto L_0x07c9
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x07c9 }
            java.lang.Class<com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity> r2 = com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity.class
            r0.<init>(r6, r2)     // Catch:{ Exception -> 0x07c9 }
            r6.setIntent(r0)     // Catch:{ Exception -> 0x07c9 }
            android.content.Intent r2 = r95.getIntent()     // Catch:{ Exception -> 0x07c9 }
            cm.l.e(r2, r1)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r3 = r6.X     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r6.W     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r5 = "548"
            goto L_0x0334
        L_0x0509:
            android.content.Context r0 = r95.getApplicationContext()     // Catch:{ Exception -> 0x07c9 }
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)     // Catch:{ Exception -> 0x07c9 }
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x07c9 }
            r1.<init>()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r0 = r0.getString(r7, r5)     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r0 = r1.j(r0, r4)     // Catch:{ Exception -> 0x07c9 }
            com.nic.mparivahan.DlCombineServices.CombineReq r0 = (com.nic.mparivahan.DlCombineServices.CombineReq) r0     // Catch:{ Exception -> 0x07c9 }
            com.nic.mparivahan.a$a r1 = com.nic.mparivahan.a.f9624a     // Catch:{ Exception -> 0x07c9 }
            boolean r1 = r1.a(r6)     // Catch:{ Exception -> 0x07c9 }
            r2 = 0
            if (r1 == 0) goto L_0x07a8
            ni.x7 r1 = r6.J     // Catch:{ Exception -> 0x07c9 }
            if (r1 != 0) goto L_0x0531
            cm.l.v(r8)     // Catch:{ Exception -> 0x07c9 }
            r1 = r10
        L_0x0531:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r1 = r1.f29351l     // Catch:{ Exception -> 0x07c9 }
            r4 = 1
            r1.c(r4)     // Catch:{ Exception -> 0x07c9 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ Exception -> 0x07c9 }
            r13.<init>()     // Catch:{ Exception -> 0x07c9 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r95.S1()     // Catch:{ Exception -> 0x07c9 }
            java.util.List r1 = r1.getDlcovs()     // Catch:{ Exception -> 0x07c9 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x07c9 }
        L_0x0548:
            if (r2 >= r1) goto L_0x0566
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r95.S1()     // Catch:{ Exception -> 0x07c9 }
            java.util.List r4 = r4.getDlcovs()     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ Exception -> 0x07c9 }
            com.nic.mparivahan.Dl.Model.Dlcov r4 = (com.nic.mparivahan.Dl.Model.Dlcov) r4     // Catch:{ Exception -> 0x07c9 }
            int r4 = r4.getDcCovcd()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x07c9 }
            r13.add(r4)     // Catch:{ Exception -> 0x07c9 }
            int r2 = r2 + 1
            goto L_0x0548
        L_0x0566:
            ab.d r1 = r6.f22096x0     // Catch:{ Exception -> 0x07c9 }
            if (r1 != 0) goto L_0x0571
            java.lang.String r1 = "mCombineViewModel"
            cm.l.v(r1)     // Catch:{ Exception -> 0x07c9 }
            r11 = r10
            goto L_0x0572
        L_0x0571:
            r11 = r1
        L_0x0572:
            boolean r12 = r6.f22089q0     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r14 = r6.f22092t0     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r14)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r15 = r6.f22095w0     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r15)     // Catch:{ Exception -> 0x07c9 }
            java.util.ArrayList r16 = r95.d2()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r17 = "mobSARATHI"
            java.lang.String r18 = "657d1c758e2e95af0014e16f5109f933"
            java.lang.String r19 = "10.248.210.8"
            java.lang.String r20 = "sarathiservice"
            java.lang.String r1 = r6.f22086n0     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r22 = "NA"
            java.lang.String r2 = r6.S     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r2)     // Catch:{ Exception -> 0x07c9 }
            java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r23 = r2.toString()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r2 = r6.T     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r2)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r24 = r6.R1(r2)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r2 = r6.X     // Catch:{ Exception -> 0x07c9 }
            java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r25 = r2.toString()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r26 = "N"
            java.lang.String r27 = r0.getRelationType()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r27)     // Catch:{ Exception -> 0x07c9 }
            java.lang.Integer r2 = r0.getConDlReasonCode()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r28 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r29 = r0.getConDlReasonName()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r29)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r30 = r0.getApplFirstName()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r30)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r31 = r0.getConEffdate()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r31)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r32 = r0.getApplFirstName()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r32)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r33 = r0.getApplLastName()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r33)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r34 = r0.getRelFirstName()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r34)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r35 = r0.getRelLastName()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r35)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r2 = r6.U     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r2)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r37 = r0.getChangeOfAddReq()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r37)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r38 = r0.getPerHouseNo()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r38)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r39 = r0.getPerStreet()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r39)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r40 = r0.getPerLocation()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r40)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r41 = r0.getPermVillageOrTown()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r41)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r42 = r0.getPerSubDistrict()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r42)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r43 = r0.getPerDistrict()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r43)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r44 = r0.getPerState()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r44)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r45 = r0.getPerPinCode()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r45)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r46 = r0.getPresHouseNo()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r46)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r47 = r0.getPresStreet()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r47)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r48 = r0.getPresLocation()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r48)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r49 = r0.getPresVillageOrTown()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r49)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r50 = r0.getPresSubDistrict()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r50)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r51 = r0.getPresDistrict()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r51)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r52 = r0.getPresState()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r52)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r53 = r0.getPresPincode()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r53)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r54 = r0.getDleDlReasonCode()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r54)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r55 = r0.getDleDlReasonName()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r55)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r56 = r0.getDupDlReasonName()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r56)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r57 = r0.getDupDlReasonCode()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r57)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r4 = r6.P     // Catch:{ Exception -> 0x07c9 }
            if (r4 != 0) goto L_0x0692
            cm.l.v(r3)     // Catch:{ Exception -> 0x07c9 }
            r58 = r10
            goto L_0x0694
        L_0x0692:
            r58 = r4
        L_0x0694:
            java.lang.String r3 = r6.f22093u0     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r3)     // Catch:{ Exception -> 0x07c9 }
            ni.x7 r4 = r6.J     // Catch:{ Exception -> 0x07c9 }
            if (r4 != 0) goto L_0x06a1
            cm.l.v(r8)     // Catch:{ Exception -> 0x07c9 }
            goto L_0x06a2
        L_0x06a1:
            r10 = r4
        L_0x06a2:
            android.widget.EditText r4 = r10.f29349j     // Catch:{ Exception -> 0x07c9 }
            java.lang.CharSequence r4 = r4.getContentDescription()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r60 = r4.toString()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r61 = r0.getDeclaringcheck()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r61)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r62 = r0.getHillcertificate()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r62)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r63 = r0.getHillissueDate()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r63)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r64 = r0.getHillvalidFrom()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r64)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r65 = r0.getHillvalidTo()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r65)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r66 = r0.getHilldrivingschool()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r66)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r67 = r0.getHillissby()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r67)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r68 = r0.getPofbirth()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r68)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r69 = r0.getCountry()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r69)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r70 = r0.getPassno()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r70)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r71 = r0.getPassvaltill()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r71)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r72 = r0.getVisano()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r72)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r73 = r0.getVisavaltill()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r73)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r74 = r0.getTovisit()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r74)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r75 = r0.getIscountryrestricted()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r75)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r76 = r0.getCountryRestrictedReason()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r76)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r77 = r0.isDlSerdisqualified()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r77)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r78 = r0.getDlSerdisqualifiedReason()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r78)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r79 = r0.getForAdd1()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r79)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r80 = r0.getForAdd2()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r80)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r81 = r0.getForAdd3()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r81)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r82 = r0.getForAddPinCode()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r82)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r83 = r0.getForNationMobNum()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r83)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r84 = r0.getEmailID()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r84)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r85 = r0.getAppliedIdpfromIndEmb()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r85)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r86 = r0.getIndEmbName()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r86)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r87 = r0.getEmbPlace()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r87)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r88 = r0.getDateOfVerifEmb()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r88)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r89 = r0.getEmbEndorseNo()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r89)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r90 = r0.getIdpcountryapplyfrom()     // Catch:{ Exception -> 0x07c9 }
            cm.l.c(r90)     // Catch:{ Exception -> 0x07c9 }
            ld.f r0 = r95.e2()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r91 = r0.f()     // Catch:{ Exception -> 0x07c9 }
            ld.f r0 = r95.e2()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r92 = r0.g()     // Catch:{ Exception -> 0x07c9 }
            ld.f r0 = r95.e2()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r93 = r0.e()     // Catch:{ Exception -> 0x07c9 }
            ld.f r0 = r95.e2()     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r94 = r0.h()     // Catch:{ Exception -> 0x07c9 }
            r21 = r1
            r36 = r2
            r59 = r3
            r11.g(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94)     // Catch:{ Exception -> 0x07c9 }
            goto L_0x07c9
        L_0x07a8:
            android.content.Context r0 = r95.getApplicationContext()     // Catch:{ Exception -> 0x07c9 }
            ld.c r1 = r6.K     // Catch:{ Exception -> 0x07c9 }
            if (r1 != 0) goto L_0x07b4
            cm.l.v(r9)     // Catch:{ Exception -> 0x07c9 }
            goto L_0x07b5
        L_0x07b4:
            r10 = r1
        L_0x07b5:
            java.lang.String r1 = "label_log_check_internet"
            r3 = 2132018237(0x7f14043d, float:1.9674775E38)
            java.lang.String r3 = r6.getString(r3)     // Catch:{ Exception -> 0x07c9 }
            java.lang.String r1 = r10.b(r1, r3)     // Catch:{ Exception -> 0x07c9 }
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)     // Catch:{ Exception -> 0x07c9 }
            r0.show()     // Catch:{ Exception -> 0x07c9 }
        L_0x07c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity.A2():void");
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
    private final void P1() {
        /*
            r11 = this;
            cm.u r0 = new cm.u
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f20234e = r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r3 = "Select Applicant Category"
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
            ni.x7 r2 = r11.J
            java.lang.String r7 = "binding"
            r8 = 0
            if (r2 != 0) goto L_0x00b6
            cm.l.v(r7)
            r2 = r8
        L_0x00b6:
            android.widget.Spinner r2 = r2.f29359t
            r2.setAdapter(r1)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            r2 = r3
        L_0x00c4:
            if (r2 >= r1) goto L_0x0103
            ld.f r9 = r11.e2()
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
            ni.x7 r1 = r11.J
            if (r1 != 0) goto L_0x00fa
            cm.l.v(r7)
            r1 = r8
        L_0x00fa:
            android.widget.Spinner r1 = r1.f29359t
            r1.setSelection(r2)
            goto L_0x0103
        L_0x0100:
            int r2 = r2 + 1
            goto L_0x00c4
        L_0x0103:
            ni.x7 r1 = r11.J
            if (r1 != 0) goto L_0x010b
            cm.l.v(r7)
            r1 = r8
        L_0x010b:
            android.widget.Spinner r1 = r1.f29359t
            com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity$a r2 = new com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity$a
            r2.<init>(r11, r0)
            r1.setOnItemSelectedListener(r2)
            java.lang.String r0 = r11.f22092t0
            java.lang.String r1 = "S"
            boolean r0 = km.p.p(r0, r1, r3, r6, r8)
            if (r0 == 0) goto L_0x012e
            ni.x7 r0 = r11.J
            if (r0 != 0) goto L_0x0127
        L_0x0123:
            cm.l.v(r7)
            goto L_0x0128
        L_0x0127:
            r8 = r0
        L_0x0128:
            android.widget.Spinner r0 = r8.f29359t
            r0.setEnabled(r5)
            goto L_0x0149
        L_0x012e:
            java.lang.String r0 = r11.f22086n0
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x013b
            ni.x7 r0 = r11.J
            if (r0 != 0) goto L_0x0127
            goto L_0x0123
        L_0x013b:
            ni.x7 r0 = r11.J
            if (r0 != 0) goto L_0x0143
            cm.l.v(r7)
            goto L_0x0144
        L_0x0143:
            r8 = r0
        L_0x0144:
            android.widget.Spinner r0 = r8.f29359t
            r0.setEnabled(r3)
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity.P1():void");
    }

    private final void Q1() {
        String str;
        pj.b bVar;
        String str2;
        try {
            if (l.a(this.Q, "Y")) {
                x7 x7Var = this.J;
                if (x7Var == null) {
                    l.v("binding");
                    x7Var = null;
                }
                str = String.valueOf(x7Var.f29356q.getText());
            } else {
                str = "NA";
            }
            String str3 = str;
            x7 x7Var2 = this.J;
            if (x7Var2 == null) {
                l.v("binding");
                x7Var2 = null;
            }
            x7Var2.f29351l.c(true);
            pj.b bVar2 = this.M;
            if (bVar2 == null) {
                l.v("chnageDobViewModel");
                bVar = null;
            } else {
                bVar = bVar2;
            }
            String str4 = this.S;
            String str5 = this.T;
            l.c(str5);
            String R1 = R1(str5);
            String str6 = this.X;
            x7 x7Var3 = this.J;
            if (x7Var3 == null) {
                l.v("binding");
                x7Var3 = null;
            }
            String obj = x7Var3.f29349j.getContentDescription().toString();
            x7 x7Var4 = this.J;
            if (x7Var4 == null) {
                l.v("binding");
                x7Var4 = null;
            }
            String obj2 = x7Var4.f29349j.getText().toString();
            String str7 = this.Q;
            String str8 = this.U;
            l.c(str8);
            String str9 = this.P;
            if (str9 == null) {
                l.v("formated_date");
                str2 = null;
            } else {
                str2 = str9;
            }
            bVar.g(str4, R1, str6, obj, obj2, str7, str3, str8, str2, "G", e2().f(), e2().g(), e2().e(), e2().h());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:13|14|(1:16)(1:18)|17|19|(3:21|22|(7:24|(1:26)|27|(1:29)|30|(1:32)|33))|34|35|(11:37|(1:39)|40|(1:42)|43|(1:45)|46|(1:48)|49|(1:51)|52)(11:54|(1:56)|57|(1:59)|60|(1:62)|63|(1:65)|66|(1:68)|69)|53) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x023a */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0246 A[Catch:{ Exception -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x028f A[Catch:{ Exception -> 0x02d6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f2() {
        /*
            r17 = this;
            r6 = r17
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>"
            androidx.lifecycle.u0 r1 = new androidx.lifecycle.u0
            r1.<init>(r6)
            java.lang.Class<ek.a> r2 = ek.a.class
            androidx.lifecycle.t0 r1 = r1.a(r2)
            ek.a r1 = (ek.a) r1
            r6.L = r1
            android.content.Intent r1 = r17.getIntent()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            java.lang.String r7 = "langSession"
            java.lang.String r8 = "binding"
            if (r1 == 0) goto L_0x00f4
            android.content.Intent r1 = r17.getIntent()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "DL"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00f4 }
            r6.S = r1     // Catch:{ Exception -> 0x00f4 }
            android.content.Intent r1 = r17.getIntent()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "dob"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00f4 }
            r6.T = r1     // Catch:{ Exception -> 0x00f4 }
            android.content.Intent r1 = r17.getIntent()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "Mobile_no"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00f4 }
            r6.U = r1     // Catch:{ Exception -> 0x00f4 }
            android.content.Intent r1 = r17.getIntent()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "DLDetails"
            java.io.Serializable r1 = r1.getSerializableExtra(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX"
            cm.l.d(r1, r3)     // Catch:{ Exception -> 0x00f4 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = (com.nic.mparivahan.Dl.Model.DldetobjX) r1     // Catch:{ Exception -> 0x00f4 }
            r6.C2(r1)     // Catch:{ Exception -> 0x00f4 }
            android.content.Intent r1 = r17.getIntent()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "lastEndorsedRTO"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x00f4 }
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x00f4 }
            r6.V = r1     // Catch:{ Exception -> 0x00f4 }
            android.content.Intent r1 = r17.getIntent()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "lastEndorsedRTOCode"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x00f4 }
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x00f4 }
            r6.X = r1     // Catch:{ Exception -> 0x00f4 }
            android.content.Intent r1 = r17.getIntent()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "lastEndorsedState"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x00f4 }
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x00f4 }
            r6.W = r1     // Catch:{ Exception -> 0x00f4 }
            android.content.Intent r1 = r17.getIntent()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "lastEndorseStateCode"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x00f4 }
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x00f4 }
            r6.Y = r1     // Catch:{ Exception -> 0x00f4 }
            android.content.Intent r1 = r17.getIntent()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "state_value"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x00f4 }
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x00f4 }
            r6.Z = r1     // Catch:{ Exception -> 0x00f4 }
            android.content.Intent r1 = r17.getIntent()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "whatServiceRequired"
            java.io.Serializable r1 = r1.getSerializableExtra(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>"
            cm.l.d(r1, r3)     // Catch:{ Exception -> 0x00f4 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x00f4 }
            r6.f22074b0 = r1     // Catch:{ Exception -> 0x00f4 }
            ni.x7 r1 = r6.J     // Catch:{ Exception -> 0x00f4 }
            if (r1 != 0) goto L_0x00c9
            cm.l.v(r8)     // Catch:{ Exception -> 0x00f4 }
            r1 = 0
        L_0x00c9:
            android.widget.TextView r1 = r1.f29345f     // Catch:{ Exception -> 0x00f4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f4 }
            r3.<init>()     // Catch:{ Exception -> 0x00f4 }
            ld.c r4 = r6.K     // Catch:{ Exception -> 0x00f4 }
            if (r4 != 0) goto L_0x00d8
            cm.l.v(r7)     // Catch:{ Exception -> 0x00f4 }
            r4 = 0
        L_0x00d8:
            java.lang.String r5 = "dl_no"
            java.lang.String r10 = "DL No. : "
            java.lang.String r4 = r4.b(r5, r10)     // Catch:{ Exception -> 0x00f4 }
            r3.append(r4)     // Catch:{ Exception -> 0x00f4 }
            r4 = 32
            r3.append(r4)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r4 = r6.S     // Catch:{ Exception -> 0x00f4 }
            r3.append(r4)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00f4 }
            r1.setText(r3)     // Catch:{ Exception -> 0x00f4 }
        L_0x00f4:
            ld.f r1 = r17.e2()
            java.lang.String r1 = r1.b()
            java.lang.String r10 = "950"
            boolean r1 = cm.l.a(r1, r10)
            java.lang.String r11 = "Change of Date of Birth in DL"
            java.lang.String r12 = "change_birth_dl"
            r13 = 1
            r14 = 8
            r15 = 0
            if (r1 == 0) goto L_0x02d6
            android.content.Intent r1 = r17.getIntent()     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r3 = "serialNo"
            int r1 = r1.getIntExtra(r3, r15)     // Catch:{ Exception -> 0x02d6 }
            r6.f22091s0 = r1     // Catch:{ Exception -> 0x02d6 }
            android.content.Intent r1 = r17.getIntent()     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r3 = "multiList"
            java.io.Serializable r1 = r1.getSerializableExtra(r3)     // Catch:{ Exception -> 0x02d6 }
            cm.l.d(r1, r0)     // Catch:{ Exception -> 0x02d6 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x02d6 }
            r6.G2(r1)     // Catch:{ Exception -> 0x02d6 }
            android.content.Intent r1 = r17.getIntent()     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r3 = "listHeaderSteps"
            java.io.Serializable r1 = r1.getSerializableExtra(r3)     // Catch:{ Exception -> 0x02d6 }
            cm.l.d(r1, r0)     // Catch:{ Exception -> 0x02d6 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x02d6 }
            r6.D2(r1)     // Catch:{ Exception -> 0x02d6 }
            android.content.Intent r0 = r17.getIntent()     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r1 = "COA"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            cm.l.d(r0, r1)     // Catch:{ Exception -> 0x02d6 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x02d6 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x02d6 }
            r6.f22089q0 = r0     // Catch:{ Exception -> 0x02d6 }
            android.content.Intent r0 = r17.getIntent()     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r1 = "metaflag"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02d6 }
            cm.l.d(r0, r2)     // Catch:{ Exception -> 0x02d6 }
            r6.f22094v0 = r0     // Catch:{ Exception -> 0x02d6 }
            android.content.Intent r0 = r17.getIntent()     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r1 = "bioRecGenesis"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02d6 }
            r6.f22092t0 = r0     // Catch:{ Exception -> 0x02d6 }
            android.content.Intent r0 = r17.getIntent()     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r1 = "allowAddrChangeAtDlservReqst"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02d6 }
            r6.f22095w0 = r0     // Catch:{ Exception -> 0x02d6 }
            com.nic.mparivahan.DlCombineServices.CombineServiceInterface$a r0 = com.nic.mparivahan.DlCombineServices.CombineServiceInterface.f8704a     // Catch:{ Exception -> 0x02d6 }
            com.nic.mparivahan.DlCombineServices.CombineServiceInterface r0 = r0.a(r6)     // Catch:{ Exception -> 0x02d6 }
            r6.E2(r0)     // Catch:{ Exception -> 0x02d6 }
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0     // Catch:{ Exception -> 0x02d6 }
            ab.b r1 = new ab.b     // Catch:{ Exception -> 0x02d6 }
            ab.a r2 = new ab.a     // Catch:{ Exception -> 0x02d6 }
            com.nic.mparivahan.DlCombineServices.CombineServiceInterface r3 = r17.a2()     // Catch:{ Exception -> 0x02d6 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x02d6 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x02d6 }
            r0.<init>((androidx.lifecycle.x0) r6, (androidx.lifecycle.u0.b) r1)     // Catch:{ Exception -> 0x02d6 }
            java.lang.Class<ab.d> r1 = ab.d.class
            androidx.lifecycle.t0 r0 = r0.a(r1)     // Catch:{ Exception -> 0x02d6 }
            ab.d r0 = (ab.d) r0     // Catch:{ Exception -> 0x02d6 }
            r6.f22096x0 = r0     // Catch:{ Exception -> 0x02d6 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02d6 }
            r1 = 30
            if (r0 < r1) goto L_0x01d2
            android.view.WindowManager r0 = r17.getWindowManager()     // Catch:{ Exception -> 0x02d6 }
            android.view.WindowMetrics r0 = r0.getMaximumWindowMetrics()     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r1 = "getMaximumWindowMetrics(...)"
            cm.l.e(r0, r1)     // Catch:{ Exception -> 0x02d6 }
            android.graphics.Rect r0 = r0.getBounds()     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r1 = "getBounds(...)"
            cm.l.e(r0, r1)     // Catch:{ Exception -> 0x02d6 }
            int r0 = r0.right     // Catch:{ Exception -> 0x02d6 }
            r6.f22090r0 = r0     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r1 = "Width"
        L_0x01ca:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02d6 }
            android.util.Log.d(r1, r0)     // Catch:{ Exception -> 0x02d6 }
            goto L_0x01e1
        L_0x01d2:
            android.content.res.Resources r0 = r17.getResources()     // Catch:{ Exception -> 0x02d6 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ Exception -> 0x02d6 }
            int r0 = r0.widthPixels     // Catch:{ Exception -> 0x02d6 }
            r6.f22090r0 = r0     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r1 = "Width 1"
            goto L_0x01ca
        L_0x01e1:
            ld.f r0 = r17.e2()     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x02d6 }
            boolean r0 = cm.l.a(r0, r10)     // Catch:{ Exception -> 0x02d6 }
            if (r0 == 0) goto L_0x023a
            java.util.ArrayList r0 = r17.Z1()     // Catch:{ Exception -> 0x023a }
            int r0 = r0.size()     // Catch:{ Exception -> 0x023a }
            if (r0 <= r13) goto L_0x023a
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x023a }
            if (r0 != 0) goto L_0x0201
            cm.l.v(r8)     // Catch:{ Exception -> 0x023a }
            r0 = 0
        L_0x0201:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f29354o     // Catch:{ Exception -> 0x023a }
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ Exception -> 0x023a }
            r1.<init>(r6, r15, r15)     // Catch:{ Exception -> 0x023a }
            r0.setLayoutManager(r1)     // Catch:{ Exception -> 0x023a }
            bb.a r5 = new bb.a     // Catch:{ Exception -> 0x023a }
            java.util.ArrayList r1 = r17.Z1()     // Catch:{ Exception -> 0x023a }
            int r3 = r6.f22091s0     // Catch:{ Exception -> 0x023a }
            int r4 = r6.f22090r0     // Catch:{ Exception -> 0x023a }
            ld.c r0 = r6.K     // Catch:{ Exception -> 0x023a }
            if (r0 != 0) goto L_0x021d
            cm.l.v(r7)     // Catch:{ Exception -> 0x023a }
            r0 = 0
        L_0x021d:
            java.lang.String r16 = r0.b(r12, r11)     // Catch:{ Exception -> 0x023a }
            cm.l.c(r16)     // Catch:{ Exception -> 0x023a }
            r0 = r5
            r2 = r17
            r9 = r5
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x023a }
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x023a }
            if (r0 != 0) goto L_0x0235
            cm.l.v(r8)     // Catch:{ Exception -> 0x023a }
            r0 = 0
        L_0x0235:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f29354o     // Catch:{ Exception -> 0x023a }
            r0.setAdapter(r9)     // Catch:{ Exception -> 0x023a }
        L_0x023a:
            int r0 = r6.f22091s0     // Catch:{ Exception -> 0x02d6 }
            java.util.ArrayList r1 = r17.d2()     // Catch:{ Exception -> 0x02d6 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x02d6 }
            if (r0 != r1) goto L_0x028f
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x02d6 }
            if (r0 != 0) goto L_0x024e
            cm.l.v(r8)     // Catch:{ Exception -> 0x02d6 }
            r0 = 0
        L_0x024e:
            com.nic.mparivahan.dlservices.widget.MyTextView r0 = r0.f29363x     // Catch:{ Exception -> 0x02d6 }
            r0.setVisibility(r15)     // Catch:{ Exception -> 0x02d6 }
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x02d6 }
            if (r0 != 0) goto L_0x025b
            cm.l.v(r8)     // Catch:{ Exception -> 0x02d6 }
            r0 = 0
        L_0x025b:
            android.widget.FrameLayout r0 = r0.f29341b     // Catch:{ Exception -> 0x02d6 }
            r0.setVisibility(r15)     // Catch:{ Exception -> 0x02d6 }
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x02d6 }
            if (r0 != 0) goto L_0x0268
            cm.l.v(r8)     // Catch:{ Exception -> 0x02d6 }
            r0 = 0
        L_0x0268:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f29351l     // Catch:{ Exception -> 0x02d6 }
            ld.c r1 = r6.K     // Catch:{ Exception -> 0x02d6 }
            if (r1 != 0) goto L_0x0272
            cm.l.v(r7)     // Catch:{ Exception -> 0x02d6 }
            r1 = 0
        L_0x0272:
            java.lang.String r2 = "vahan_btn_submit"
            java.lang.String r3 = "Submit"
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x02d6 }
            r0.setText(r1)     // Catch:{ Exception -> 0x02d6 }
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x02d6 }
            if (r0 != 0) goto L_0x0285
            cm.l.v(r8)     // Catch:{ Exception -> 0x02d6 }
            r0 = 0
        L_0x0285:
            android.widget.LinearLayout r0 = r0.f29347h     // Catch:{ Exception -> 0x02d6 }
            r0.setVisibility(r15)     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r0 = "Y"
        L_0x028c:
            r6.Q = r0     // Catch:{ Exception -> 0x02d6 }
            goto L_0x02d6
        L_0x028f:
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x02d6 }
            if (r0 != 0) goto L_0x0297
            cm.l.v(r8)     // Catch:{ Exception -> 0x02d6 }
            r0 = 0
        L_0x0297:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f29351l     // Catch:{ Exception -> 0x02d6 }
            ld.c r1 = r6.K     // Catch:{ Exception -> 0x02d6 }
            if (r1 != 0) goto L_0x02a1
            cm.l.v(r7)     // Catch:{ Exception -> 0x02d6 }
            r1 = 0
        L_0x02a1:
            java.lang.String r2 = "btn_dl_serv_next"
            java.lang.String r3 = "Next"
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x02d6 }
            r0.setText(r1)     // Catch:{ Exception -> 0x02d6 }
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x02d6 }
            if (r0 != 0) goto L_0x02b4
            cm.l.v(r8)     // Catch:{ Exception -> 0x02d6 }
            r0 = 0
        L_0x02b4:
            com.nic.mparivahan.dlservices.widget.MyTextView r0 = r0.f29363x     // Catch:{ Exception -> 0x02d6 }
            r0.setVisibility(r14)     // Catch:{ Exception -> 0x02d6 }
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x02d6 }
            if (r0 != 0) goto L_0x02c1
            cm.l.v(r8)     // Catch:{ Exception -> 0x02d6 }
            r0 = 0
        L_0x02c1:
            android.widget.FrameLayout r0 = r0.f29341b     // Catch:{ Exception -> 0x02d6 }
            r0.setVisibility(r14)     // Catch:{ Exception -> 0x02d6 }
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x02d6 }
            if (r0 != 0) goto L_0x02ce
            cm.l.v(r8)     // Catch:{ Exception -> 0x02d6 }
            r0 = 0
        L_0x02ce:
            android.widget.LinearLayout r0 = r0.f29347h     // Catch:{ Exception -> 0x02d6 }
            r0.setVisibility(r14)     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r0 = "N"
            goto L_0x028c
        L_0x02d6:
            ld.f r0 = r17.e2()
            java.lang.String r0 = r0.b()
            boolean r0 = cm.l.a(r0, r10)
            if (r0 == 0) goto L_0x036e
            java.util.ArrayList r0 = r17.Z1()     // Catch:{ Exception -> 0x0389 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0389 }
            if (r0 != r13) goto L_0x0317
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x0389 }
            if (r0 != 0) goto L_0x02f6
            cm.l.v(r8)     // Catch:{ Exception -> 0x0389 }
            r0 = 0
        L_0x02f6:
            ni.yb r0 = r0.f29353n     // Catch:{ Exception -> 0x0389 }
            android.widget.TextView r0 = r0.f29580g     // Catch:{ Exception -> 0x0389 }
            java.util.ArrayList r1 = r17.Z1()     // Catch:{ Exception -> 0x0389 }
            java.lang.Object r1 = r1.get(r15)     // Catch:{ Exception -> 0x0389 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0389 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0389 }
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x0389 }
            if (r0 != 0) goto L_0x030f
            cm.l.v(r8)     // Catch:{ Exception -> 0x0389 }
            r0 = 0
        L_0x030f:
            ni.yb r0 = r0.f29353n     // Catch:{ Exception -> 0x0389 }
            android.widget.ImageView r0 = r0.f29579f     // Catch:{ Exception -> 0x0389 }
            r0.setVisibility(r14)     // Catch:{ Exception -> 0x0389 }
            goto L_0x0389
        L_0x0317:
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x0389 }
            if (r0 != 0) goto L_0x031f
            cm.l.v(r8)     // Catch:{ Exception -> 0x0389 }
            r0 = 0
        L_0x031f:
            ni.yb r0 = r0.f29353n     // Catch:{ Exception -> 0x0389 }
            android.widget.TextView r0 = r0.f29580g     // Catch:{ Exception -> 0x0389 }
            ld.c r1 = r6.K     // Catch:{ Exception -> 0x0389 }
            if (r1 != 0) goto L_0x032b
            cm.l.v(r7)     // Catch:{ Exception -> 0x0389 }
            r1 = 0
        L_0x032b:
            java.lang.String r2 = "dl_services"
            r3 = 2132017656(0x7f1401f8, float:1.9673597E38)
            java.lang.String r3 = r6.getString(r3)     // Catch:{ Exception -> 0x0389 }
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x0389 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0389 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0389 }
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x0389 }
            if (r0 != 0) goto L_0x0346
            cm.l.v(r8)     // Catch:{ Exception -> 0x0389 }
            r0 = 0
        L_0x0346:
            ni.yb r0 = r0.f29353n     // Catch:{ Exception -> 0x0389 }
            android.widget.ImageView r0 = r0.f29579f     // Catch:{ Exception -> 0x0389 }
            r0.setVisibility(r14)     // Catch:{ Exception -> 0x0389 }
            ni.x7 r0 = r6.J     // Catch:{ Exception -> 0x0389 }
            if (r0 != 0) goto L_0x0355
            cm.l.v(r8)     // Catch:{ Exception -> 0x0389 }
            r0 = 0
        L_0x0355:
            ni.yb r0 = r0.f29353n     // Catch:{ Exception -> 0x0389 }
            android.widget.TextView r0 = r0.f29580g     // Catch:{ Exception -> 0x0389 }
            ni.x7 r1 = r6.J     // Catch:{ Exception -> 0x0389 }
            if (r1 != 0) goto L_0x0361
            cm.l.v(r8)     // Catch:{ Exception -> 0x0389 }
            r1 = 0
        L_0x0361:
            ni.yb r1 = r1.f29353n     // Catch:{ Exception -> 0x0389 }
            android.widget.TextView r1 = r1.f29580g     // Catch:{ Exception -> 0x0389 }
            int r1 = r1.getPaintFlags()     // Catch:{ Exception -> 0x0389 }
            r1 = r1 | r14
            r0.setPaintFlags(r1)     // Catch:{ Exception -> 0x0389 }
            goto L_0x0389
        L_0x036e:
            ni.x7 r0 = r6.J
            if (r0 != 0) goto L_0x0376
            cm.l.v(r8)
            r0 = 0
        L_0x0376:
            ni.yb r0 = r0.f29353n
            android.widget.TextView r0 = r0.f29580g
            ld.c r1 = r6.K
            if (r1 != 0) goto L_0x0382
            cm.l.v(r7)
            r1 = 0
        L_0x0382:
            java.lang.String r1 = r1.b(r12, r11)
            r0.setText(r1)
        L_0x0389:
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            r0.<init>(r6)
            java.lang.Class<pj.b> r1 = pj.b.class
            androidx.lifecycle.t0 r0 = r0.a(r1)
            pj.b r0 = (pj.b) r0
            r6.M = r0
            com.nic.mparivahan.a$a r0 = com.nic.mparivahan.a.f9624a
            boolean r0 = r0.a(r6)
            if (r0 == 0) goto L_0x03b0
            ek.a r0 = r6.L
            if (r0 != 0) goto L_0x03aa
            java.lang.String r0 = "viewModel"
            cm.l.v(r0)
            r0 = 0
        L_0x03aa:
            java.lang.String r1 = "548"
            r0.n(r1)
            goto L_0x03d0
        L_0x03b0:
            android.content.Context r0 = r17.getApplicationContext()
            ld.c r1 = r6.K
            if (r1 != 0) goto L_0x03bc
            cm.l.v(r7)
            r1 = 0
        L_0x03bc:
            r2 = 2132019337(0x7f140889, float:1.9677006E38)
            java.lang.String r2 = r6.getString(r2)
            java.lang.String r3 = "service_is_not_present"
            java.lang.String r1 = r1.b(r3, r2)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r15)
            r0.show()
        L_0x03d0:
            ni.x7 r0 = r6.J
            if (r0 != 0) goto L_0x03d8
            cm.l.v(r8)
            r0 = 0
        L_0x03d8:
            android.widget.EditText r0 = r0.f29349j
            oj.l r1 = new oj.l
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            oj.m r0 = new oj.m
            r0.<init>(r6)
            ni.x7 r1 = r6.J
            if (r1 != 0) goto L_0x03ef
            cm.l.v(r8)
            r1 = 0
        L_0x03ef:
            android.widget.TextView r1 = r1.f29344e
            oj.n r2 = new oj.n
            r2.<init>(r6, r0)
            r1.setOnClickListener(r2)
            ni.x7 r0 = r6.J
            if (r0 != 0) goto L_0x0401
            cm.l.v(r8)
            r0 = 0
        L_0x0401:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f29351l
            oj.o r1 = new oj.o
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            ni.x7 r0 = r6.J
            if (r0 != 0) goto L_0x0413
            cm.l.v(r8)
            r0 = 0
        L_0x0413:
            android.widget.RadioButton r0 = r0.f29365z
            oj.p r1 = new oj.p
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            ni.x7 r0 = r6.J
            if (r0 != 0) goto L_0x0425
            cm.l.v(r8)
            r0 = 0
        L_0x0425:
            android.widget.RadioButton r0 = r0.f29355p
            oj.b r1 = new oj.b
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            ni.x7 r0 = r6.J
            if (r0 != 0) goto L_0x0438
            cm.l.v(r8)
            r9 = 0
            goto L_0x0439
        L_0x0438:
            r9 = r0
        L_0x0439:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r9.f29358s
            oj.c r1 = new oj.c
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity.f2():void");
    }

    /* access modifiers changed from: private */
    public static final void g2(DobChangeActivity dobChangeActivity, View view) {
        l.f(dobChangeActivity, "this$0");
        dobChangeActivity.y2();
    }

    /* access modifiers changed from: private */
    public static final void h2(DobChangeActivity dobChangeActivity, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(dobChangeActivity, "this$0");
        dobChangeActivity.O.set(1, i10);
        dobChangeActivity.O.set(2, i11);
        dobChangeActivity.O.set(5, i12);
        CharSequence format = DateFormat.format("dd", dobChangeActivity.O.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        String str = (String) format;
        CharSequence format2 = DateFormat.format("MM", dobChangeActivity.O.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) format2;
        CharSequence format3 = DateFormat.format("yyyy", dobChangeActivity.O.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) format3;
        dobChangeActivity.P = str + '-' + str2 + '-' + str3;
        x7 x7Var = dobChangeActivity.J;
        if (x7Var == null) {
            l.v("binding");
            x7Var = null;
        }
        TextView textView = x7Var.f29344e;
        textView.setText(str + '-' + str2 + '-' + str3);
    }

    /* access modifiers changed from: private */
    public static final void i2(DobChangeActivity dobChangeActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(dobChangeActivity, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        dobChangeActivity.l1();
        DatePickerDialog datePickerDialog = new DatePickerDialog(dobChangeActivity, onDateSetListener, dobChangeActivity.O.get(1), dobChangeActivity.O.get(2), dobChangeActivity.O.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0149, code lost:
        if (cm.l.a(r6.e2().b(), com.nic.mparivahan.VahanServices.VahanConst.VContant.MULTISERVICE_PURPOSE_CODE) != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014f, code lost:
        r6.Q1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015f, code lost:
        if (cm.l.a(r6.e2().b(), com.nic.mparivahan.VahanServices.VahanConst.VContant.MULTISERVICE_PURPOSE_CODE) != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j2(com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r6, android.view.View r7) {
        /*
            java.lang.String r7 = "this$0"
            cm.l.f(r6, r7)
            ni.x7 r7 = r6.J
            java.lang.String r0 = "binding"
            r1 = 0
            if (r7 != 0) goto L_0x0010
            cm.l.v(r0)
            r7 = r1
        L_0x0010:
            android.widget.EditText r7 = r7.f29349j
            android.text.Editable r7 = r7.getText()
            java.lang.String r2 = "getText(...)"
            cm.l.e(r7, r2)
            int r7 = r7.length()
            r3 = 1
            java.lang.String r4 = "langSession"
            if (r7 != 0) goto L_0x0043
            ld.c r7 = r6.K
            if (r7 != 0) goto L_0x002c
            cm.l.v(r4)
            goto L_0x002d
        L_0x002c:
            r1 = r7
        L_0x002d:
            r7 = 2132019064(0x7f140778, float:1.9676452E38)
            java.lang.String r7 = r6.getString(r7)
            java.lang.String r0 = "label_select_reason"
        L_0x0036:
            java.lang.String r7 = r1.b(r0, r7)
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r3)
            r6.show()
            goto L_0x0162
        L_0x0043:
            ni.x7 r7 = r6.J
            if (r7 != 0) goto L_0x004b
            cm.l.v(r0)
            r7 = r1
        L_0x004b:
            android.widget.LinearLayout r7 = r7.f29350k
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x0085
            ni.x7 r7 = r6.J
            if (r7 != 0) goto L_0x005b
            cm.l.v(r0)
            r7 = r1
        L_0x005b:
            android.widget.EditText r7 = r7.f29348i
            android.text.Editable r7 = r7.getText()
            cm.l.e(r7, r2)
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0162
            ld.c r7 = r6.K
            if (r7 != 0) goto L_0x0072
            cm.l.v(r4)
            goto L_0x0073
        L_0x0072:
            r1 = r7
        L_0x0073:
            r7 = 2132017778(0x7f140272, float:1.9673844E38)
            java.lang.String r7 = r6.getString(r7)
            java.lang.String r0 = "label_dl_serv_enter_reas_manul"
        L_0x007c:
            java.lang.String r7 = r1.b(r0, r7)
        L_0x0080:
            r6.z2(r7)
            goto L_0x0162
        L_0x0085:
            ni.x7 r7 = r6.J
            if (r7 != 0) goto L_0x008d
            cm.l.v(r0)
            r7 = r1
        L_0x008d:
            android.widget.TextView r7 = r7.f29344e
            java.lang.CharSequence r7 = r7.getText()
            cm.l.e(r7, r2)
            int r7 = r7.length()
            if (r7 != 0) goto L_0x00af
            ld.c r7 = r6.K
            if (r7 != 0) goto L_0x00a4
            cm.l.v(r4)
            goto L_0x00a5
        L_0x00a4:
            r1 = r7
        L_0x00a5:
            r7 = 2132018722(0x7f140622, float:1.9675759E38)
            java.lang.String r7 = r6.getString(r7)
            java.lang.String r0 = "please_enter_bd"
            goto L_0x0036
        L_0x00af:
            java.lang.String r7 = r6.Q
            java.lang.String r2 = "Y"
            boolean r7 = cm.l.a(r7, r2)
            java.lang.String r2 = "950"
            if (r7 == 0) goto L_0x0153
            ni.x7 r7 = r6.J
            if (r7 != 0) goto L_0x00c3
            cm.l.v(r0)
            r7 = r1
        L_0x00c3:
            androidx.appcompat.widget.AppCompatEditText r7 = r7.f29356q
            android.text.Editable r7 = r7.getText()
            cm.l.c(r7)
            int r7 = r7.length()
            if (r7 != 0) goto L_0x00e5
            ld.c r7 = r6.K
            if (r7 != 0) goto L_0x00da
            cm.l.v(r4)
            goto L_0x00db
        L_0x00da:
            r1 = r7
        L_0x00db:
            r7 = 2132017754(0x7f14025a, float:1.9673795E38)
            java.lang.String r7 = r6.getString(r7)
            java.lang.String r0 = "edit_dl_serv_emer_cont_no"
            goto L_0x007c
        L_0x00e5:
            ni.x7 r7 = r6.J
            if (r7 != 0) goto L_0x00ed
            cm.l.v(r0)
            r7 = r1
        L_0x00ed:
            androidx.appcompat.widget.AppCompatEditText r7 = r7.f29356q
            android.text.Editable r7 = r7.getText()
            cm.l.c(r7)
            int r7 = r7.length()
            r3 = 10
            java.lang.String r5 = "label_log_entr_vali_mobno"
            if (r7 >= r3) goto L_0x0116
            ld.c r7 = r6.K
            if (r7 != 0) goto L_0x0108
            cm.l.v(r4)
            goto L_0x0109
        L_0x0108:
            r1 = r7
        L_0x0109:
            r7 = 2132018828(0x7f14068c, float:1.9675974E38)
        L_0x010c:
            java.lang.String r7 = r6.getString(r7)
            java.lang.String r7 = r1.b(r5, r7)
            goto L_0x0080
        L_0x0116:
            t8.c$a r7 = t8.c.f16582a
            ni.x7 r3 = r6.J
            if (r3 != 0) goto L_0x0120
            cm.l.v(r0)
            r3 = r1
        L_0x0120:
            androidx.appcompat.widget.AppCompatEditText r0 = r3.f29356q
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r7 = r7.q(r0)
            if (r7 != 0) goto L_0x013d
            ld.c r7 = r6.K
            if (r7 != 0) goto L_0x0138
            cm.l.v(r4)
            goto L_0x0139
        L_0x0138:
            r1 = r7
        L_0x0139:
            r7 = 2132017854(0x7f1402be, float:1.9673998E38)
            goto L_0x010c
        L_0x013d:
            ld.f r7 = r6.e2()
            java.lang.String r7 = r7.b()
            boolean r7 = cm.l.a(r7, r2)
            if (r7 == 0) goto L_0x014f
        L_0x014b:
            r6.A2()
            goto L_0x0162
        L_0x014f:
            r6.Q1()
            goto L_0x0162
        L_0x0153:
            ld.f r7 = r6.e2()
            java.lang.String r7 = r7.b()
            boolean r7 = cm.l.a(r7, r2)
            if (r7 == 0) goto L_0x014f
            goto L_0x014b
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity.j2(com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void k2(DobChangeActivity dobChangeActivity, View view) {
        l.f(dobChangeActivity, "this$0");
        dobChangeActivity.Q = "Y";
        x7 x7Var = dobChangeActivity.J;
        x7 x7Var2 = null;
        if (x7Var == null) {
            l.v("binding");
            x7Var = null;
        }
        x7Var.f29355p.setChecked(false);
        x7 x7Var3 = dobChangeActivity.J;
        if (x7Var3 == null) {
            l.v("binding");
            x7Var3 = null;
        }
        x7Var3.f29365z.setChecked(true);
        x7 x7Var4 = dobChangeActivity.J;
        if (x7Var4 == null) {
            l.v("binding");
            x7Var4 = null;
        }
        x7Var4.f29356q.setText((CharSequence) null);
        x7 x7Var5 = dobChangeActivity.J;
        if (x7Var5 == null) {
            l.v("binding");
        } else {
            x7Var2 = x7Var5;
        }
        x7Var2.f29356q.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void l2(DobChangeActivity dobChangeActivity, View view) {
        l.f(dobChangeActivity, "this$0");
        dobChangeActivity.Q = "N";
        x7 x7Var = dobChangeActivity.J;
        x7 x7Var2 = null;
        if (x7Var == null) {
            l.v("binding");
            x7Var = null;
        }
        x7Var.f29355p.setChecked(true);
        x7 x7Var3 = dobChangeActivity.J;
        if (x7Var3 == null) {
            l.v("binding");
            x7Var3 = null;
        }
        x7Var3.f29365z.setChecked(false);
        x7 x7Var4 = dobChangeActivity.J;
        if (x7Var4 == null) {
            l.v("binding");
            x7Var4 = null;
        }
        x7Var4.f29356q.setText((CharSequence) null);
        x7 x7Var5 = dobChangeActivity.J;
        if (x7Var5 == null) {
            l.v("binding");
        } else {
            x7Var2 = x7Var5;
        }
        x7Var2.f29356q.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void m2(DobChangeActivity dobChangeActivity, View view) {
        l.f(dobChangeActivity, "this$0");
        x7 x7Var = dobChangeActivity.J;
        if (x7Var == null) {
            l.v("binding");
            x7Var = null;
        }
        x7Var.f29365z.setChecked(true);
        x7 x7Var2 = dobChangeActivity.J;
        if (x7Var2 == null) {
            l.v("binding");
            x7Var2 = null;
        }
        x7Var2.f29355p.setChecked(false);
        x7 x7Var3 = dobChangeActivity.J;
        if (x7Var3 == null) {
            l.v("binding");
            x7Var3 = null;
        }
        x7Var3.f29348i.setText((CharSequence) null);
        x7 x7Var4 = dobChangeActivity.J;
        if (x7Var4 == null) {
            l.v("binding");
            x7Var4 = null;
        }
        x7Var4.f29349j.setText((CharSequence) null);
        x7 x7Var5 = dobChangeActivity.J;
        if (x7Var5 == null) {
            l.v("binding");
            x7Var5 = null;
        }
        x7Var5.f29349j.setContentDescription((CharSequence) null);
        x7 x7Var6 = dobChangeActivity.J;
        if (x7Var6 == null) {
            l.v("binding");
            x7Var6 = null;
        }
        x7Var6.f29350k.setVisibility(8);
        dobChangeActivity.Q = "Y";
        x7 x7Var7 = dobChangeActivity.J;
        if (x7Var7 == null) {
            l.v("binding");
            x7Var7 = null;
        }
        x7Var7.f29356q.setText((CharSequence) null);
        x7 x7Var8 = dobChangeActivity.J;
        if (x7Var8 == null) {
            l.v("binding");
            x7Var8 = null;
        }
        x7Var8.f29356q.setVisibility(0);
        x7 x7Var9 = dobChangeActivity.J;
        if (x7Var9 == null) {
            l.v("binding");
            x7Var9 = null;
        }
        x7Var9.f29344e.setText((CharSequence) null);
    }

    private final void n2(Intent intent, String str, String str2, String str3, ArrayList arrayList) {
        try {
            intent.putExtra("DL", this.S);
            intent.putExtra("dob", this.T);
            intent.putExtra("DLDetails", S1());
            intent.putExtra("Mobile_no", this.U);
            intent.putExtra("lastEndorsedRTO", str);
            intent.putExtra("lastEndorsedState", str2);
            intent.putExtra("lastEndorsedRTOCode", this.X);
            intent.putExtra("lastEndorseStateCode", this.Y);
            intent.putExtra("whatServiceRequired", this.f22074b0);
            intent.putExtra("state_value", this.Z);
            intent.putExtra("purCode", str3);
            intent.putExtra("bioRecGenesis", "S");
            intent.putExtra("allowAddrChangeAtDlservReqst", "N");
            intent.putExtra("metaflag", this.f22094v0);
            intent.putExtra("multiList", arrayList);
            intent.putExtra("listHeaderSteps", Z1());
            intent.putExtra("serialNo", this.f22091s0 + 1);
            intent.putExtra("COA", this.f22089q0);
            startActivity(intent);
        } catch (Exception e10) {
            Log.d("error_val", e10.getLocalizedMessage());
        }
    }

    private final void o2() {
        ab.d dVar = this.f22096x0;
        ab.d dVar2 = null;
        if (dVar == null) {
            l.v("mCombineViewModel");
            dVar = null;
        }
        dVar.i().g(this, new oj.f(this));
        ab.d dVar3 = this.f22096x0;
        if (dVar3 == null) {
            l.v("mCombineViewModel");
        } else {
            dVar2 = dVar3;
        }
        dVar2.h().g(this, new oj.g(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p2(com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r28, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r29) {
        /*
            r15 = r28
            java.lang.String r14 = "service_is_not_present"
            java.lang.String r19 = "langSession"
            java.lang.String r0 = "this$0"
            cm.l.f(r15, r0)
            ni.x7 r0 = r15.J
            java.lang.String r20 = "binding"
            r13 = 0
            if (r0 != 0) goto L_0x0016
            cm.l.v(r20)
            r0 = r13
        L_0x0016:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f29351l
            r12 = 0
            r0.c(r12)
            r11 = 2132019337(0x7f140889, float:1.9677006E38)
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r29.getDlSubmitresult()     // Catch:{ Exception -> 0x002a }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r0.getStatusCode()     // Catch:{ Exception -> 0x002a }
            goto L_0x0032
        L_0x002a:
            r1 = r11
            r26 = r13
            r3 = r14
            r13 = r15
            goto L_0x02e1
        L_0x0031:
            r0 = r13
        L_0x0032:
            java.lang.String r1 = "00"
            r2 = 2
            boolean r0 = km.p.p(r0, r1, r12, r2, r13)     // Catch:{ Exception -> 0x002a }
            if (r0 == 0) goto L_0x0296
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r29.getDlSubmitresult()     // Catch:{ Exception -> 0x0290 }
            if (r0 == 0) goto L_0x0304
            java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x0290 }
            if (r0 == 0) goto L_0x0304
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x0290 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0290 }
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != r1) goto L_0x0304
            com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r21 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x0290 }
            r21.<init>()     // Catch:{ Exception -> 0x0290 }
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r29.getDlSubmitresult()     // Catch:{ Exception -> 0x0290 }
            java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x0290 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ Exception -> 0x0290 }
            r22 = r0
            com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r22 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r22     // Catch:{ Exception -> 0x0290 }
            if (r22 == 0) goto L_0x0304
            java.lang.String r0 = ""
            java.util.ArrayList r1 = r28.d2()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x0076
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x0076:
            java.lang.String r3 = "check_dl_serv_dupl_dl"
            java.lang.String r4 = "Issue of Duplicate DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x0095
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "513,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x0095:
            java.util.ArrayList r1 = r28.d2()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x00a1
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x00a1:
            java.lang.String r3 = "check_dl_serv_renewal_dl"
            java.lang.String r4 = "Renewal of DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x00c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "514,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x00c0:
            java.util.ArrayList r1 = r28.d2()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x00cc
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x00cc:
            java.lang.String r3 = "revalidtion_expired_dl"
            java.lang.String r4 = "Re-Validation of Expired DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x00eb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "537,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x00eb:
            java.util.ArrayList r1 = r28.d2()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x00f7
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x00f7:
            java.lang.String r3 = "check_dl_serv_change_addr"
            java.lang.String r4 = "Change of Address in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x0116
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "515,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x0116:
            java.util.ArrayList r1 = r28.d2()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x0122
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x0122:
            java.lang.String r3 = "check_dl_serv_replacement_dl"
            java.lang.String r4 = "Replacement of DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x0141
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "516,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x0141:
            java.util.ArrayList r1 = r28.d2()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x014d
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x014d:
            java.lang.String r3 = "check_dl_serv_extract_dl"
            java.lang.String r4 = "DL Extract"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x016c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "523,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x016c:
            java.util.ArrayList r1 = r28.d2()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x0178
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x0178:
            java.lang.String r3 = "hill_region_title"
            java.lang.String r4 = "Endorsement to Drive in Hill Region"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x0197
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "524,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x0197:
            java.util.ArrayList r1 = r28.d2()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x01a3
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x01a3:
            java.lang.String r3 = "change_name_dl"
            java.lang.String r4 = "Change of Name in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x01c2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "526,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x01c2:
            java.util.ArrayList r1 = r28.d2()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x01ce
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x01ce:
            java.lang.String r3 = "change_birth_dl"
            java.lang.String r4 = "Change of Date of Birth in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x01ed
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "548"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x01ed:
            r16 = r0
            com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r1 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x0257 }
            java.lang.String r3 = "1234"
            java.lang.String r4 = "S"
            java.lang.String r5 = r22.getApplicationDate()     // Catch:{ Exception -> 0x0257 }
            java.lang.String r0 = r22.getApplicationNo()     // Catch:{ Exception -> 0x0257 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0257 }
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0257 }
            ld.g r0 = r28.b2()     // Catch:{ Exception -> 0x0257 }
            java.lang.String r0 = r0.k()     // Catch:{ Exception -> 0x0257 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0257 }
            java.lang.String r9 = r22.getDateofBirth()     // Catch:{ Exception -> 0x0257 }
            java.lang.String r10 = r22.getDlno()     // Catch:{ Exception -> 0x0257 }
            cm.l.c(r10)     // Catch:{ Exception -> 0x0257 }
            java.lang.String r0 = "N"
            java.lang.String r17 = "N"
            java.lang.String r18 = r22.getApplicantGender()     // Catch:{ Exception -> 0x0257 }
            java.lang.String r2 = r15.U     // Catch:{ Exception -> 0x0257 }
            cm.l.c(r2)     // Catch:{ Exception -> 0x0257 }
            r23 = 0
            r24 = r14
            java.lang.String r14 = r15.X     // Catch:{ Exception -> 0x0251 }
            r29 = r14
            java.lang.String r14 = r15.Y     // Catch:{ Exception -> 0x0251 }
            r25 = r2
            r2 = r28
            r11 = r0
            r12 = r17
            r26 = r13
            r13 = r18
            r0 = r29
            r18 = r14
            r27 = r24
            r14 = r25
            r15 = r23
            r17 = r0
            r1.a(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x024f }
        L_0x024c:
            r13 = r28
            goto L_0x0266
        L_0x024f:
            r0 = move-exception
            goto L_0x025c
        L_0x0251:
            r0 = move-exception
            r26 = r13
            r27 = r24
            goto L_0x025c
        L_0x0257:
            r0 = move-exception
            r26 = r13
            r27 = r14
        L_0x025c:
            java.lang.String r1 = "valiii"
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ Exception -> 0x028d }
            android.util.Log.d(r1, r0)     // Catch:{ Exception -> 0x028d }
            goto L_0x024c
        L_0x0266:
            java.lang.String r4 = r13.X     // Catch:{ Exception -> 0x0287 }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = r28.S1()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r6 = r13.S     // Catch:{ Exception -> 0x0287 }
            java.lang.String r7 = r13.T     // Catch:{ Exception -> 0x0287 }
            java.lang.String r8 = r13.U     // Catch:{ Exception -> 0x0287 }
            java.lang.String r9 = r13.V     // Catch:{ Exception -> 0x0287 }
            java.lang.String r10 = r13.W     // Catch:{ Exception -> 0x0287 }
            java.lang.String r11 = r13.Y     // Catch:{ Exception -> 0x0287 }
            java.util.ArrayList r12 = r28.Z1()     // Catch:{ Exception -> 0x0287 }
            r1 = r21
            r2 = r28
            r3 = r22
            r1.E2(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0287 }
            goto L_0x0304
        L_0x0287:
            r3 = r27
            r1 = 2132019337(0x7f140889, float:1.9677006E38)
            goto L_0x02e1
        L_0x028d:
            r13 = r28
            goto L_0x0287
        L_0x0290:
            r26 = r13
            r13 = r15
            r1 = r11
            r3 = r14
            goto L_0x02e1
        L_0x0296:
            r26 = r13
            r27 = r14
            r13 = r15
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r29.getDlSubmitresult()     // Catch:{ Exception -> 0x0287 }
            if (r0 == 0) goto L_0x02a6
            java.lang.String r0 = r0.getReqStatus()     // Catch:{ Exception -> 0x0287 }
            goto L_0x02a8
        L_0x02a6:
            r0 = r26
        L_0x02a8:
            if (r0 == 0) goto L_0x02c5
            int r0 = r0.length()     // Catch:{ Exception -> 0x0287 }
            if (r0 != 0) goto L_0x02b1
            goto L_0x02c5
        L_0x02b1:
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r29.getDlSubmitresult()     // Catch:{ Exception -> 0x0287 }
            if (r0 == 0) goto L_0x02bc
            java.lang.String r0 = r0.getReqStatus()     // Catch:{ Exception -> 0x0287 }
            goto L_0x02be
        L_0x02bc:
            r0 = r26
        L_0x02be:
            cm.l.c(r0)     // Catch:{ Exception -> 0x0287 }
            r13.z2(r0)     // Catch:{ Exception -> 0x0287 }
            goto L_0x0304
        L_0x02c5:
            ld.c r0 = r13.K     // Catch:{ Exception -> 0x0287 }
            if (r0 != 0) goto L_0x02ce
            cm.l.v(r19)     // Catch:{ Exception -> 0x0287 }
            r0 = r26
        L_0x02ce:
            r1 = 2132019337(0x7f140889, float:1.9677006E38)
            java.lang.String r2 = r13.getString(r1)     // Catch:{ Exception -> 0x02df }
            r3 = r27
            java.lang.String r0 = r0.b(r3, r2)     // Catch:{ Exception -> 0x02e1 }
            r13.z2(r0)     // Catch:{ Exception -> 0x02e1 }
            goto L_0x0304
        L_0x02df:
            r3 = r27
        L_0x02e1:
            ni.x7 r0 = r13.J
            if (r0 != 0) goto L_0x02ea
            cm.l.v(r20)
            r0 = r26
        L_0x02ea:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f29351l
            r2 = 0
            r0.c(r2)
            ld.c r0 = r13.K
            if (r0 != 0) goto L_0x02f9
            cm.l.v(r19)
            r0 = r26
        L_0x02f9:
            java.lang.String r1 = r13.getString(r1)
            java.lang.String r0 = r0.b(r3, r1)
            r13.z2(r0)
        L_0x0304:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity.p2(com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse):void");
    }

    /* access modifiers changed from: private */
    public static final void q2(DobChangeActivity dobChangeActivity, String str) {
        l.f(dobChangeActivity, "this$0");
        x7 x7Var = dobChangeActivity.J;
        ld.c cVar = null;
        if (x7Var == null) {
            l.v("binding");
            x7Var = null;
        }
        x7Var.f29351l.c(false);
        ld.c cVar2 = dobChangeActivity.K;
        if (cVar2 == null) {
            l.v("langSession");
        } else {
            cVar = cVar2;
        }
        dobChangeActivity.z2(cVar.b("service_is_not_present", dobChangeActivity.getString(R.string.unable_to_get_details)));
    }

    /* access modifiers changed from: private */
    public static final void r2(DobChangeActivity dobChangeActivity, View view) {
        l.f(dobChangeActivity, "this$0");
        dobChangeActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void s2(DobChangeActivity dobChangeActivity, View view) {
        l.f(dobChangeActivity, "this$0");
        dobChangeActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void t2(DobChangeActivity dobChangeActivity, View view) {
        l.f(dobChangeActivity, "this$0");
        try {
            Intent intent = new Intent(dobChangeActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", dobChangeActivity.S);
            intent.putExtra("dob", dobChangeActivity.T);
            intent.putExtra("DLDetails", dobChangeActivity.S1());
            intent.putExtra("Mobile_no", dobChangeActivity.U);
            intent.putExtra("lastEndorsedRTO", dobChangeActivity.V);
            intent.putExtra("lastEndorsedState", dobChangeActivity.W);
            intent.putExtra("lastEndorsedRTOCode", dobChangeActivity.X);
            intent.putExtra("lastEndorseStateCode", dobChangeActivity.Y);
            intent.putExtra("whatServiceRequired", dobChangeActivity.f22074b0);
            if (l.a(dobChangeActivity.e2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", dobChangeActivity.d2());
            }
            dobChangeActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void u2(DobChangeActivity dobChangeActivity, View view) {
        l.f(dobChangeActivity, "this$0");
        if (l.a(dobChangeActivity.e2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (dobChangeActivity.Z1().size() > 1) {
                    Dialog dialog = new Dialog(dobChangeActivity);
                    dialog.setContentView(R.layout.layout_multi);
                    Window window = dialog.getWindow();
                    l.c(window);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    View findViewById = dialog.findViewById(R.id.service_label_cross);
                    l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                    ImageView imageView = (ImageView) findViewById;
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
                    TextView textView4 = (TextView) findViewById5;
                    ld.c cVar = dobChangeActivity.K;
                    ld.c cVar2 = null;
                    if (cVar == null) {
                        l.v("langSession");
                        cVar = null;
                    }
                    textView.setText(cVar.b("btn_ok", "OK"));
                    ld.c cVar3 = dobChangeActivity.K;
                    if (cVar3 == null) {
                        l.v("langSession");
                    } else {
                        cVar2 = cVar3;
                    }
                    textView4.setText(cVar2.b("title_dl_services", "Driving Licence Services"));
                    imageView.setOnClickListener(new oj.d(dialog));
                    int size = dobChangeActivity.Z1().size();
                    String str = "";
                    int i10 = 0;
                    String str2 = str;
                    while (i10 < size) {
                        str = str + ((String) dobChangeActivity.Z1().get(i10)) + 10;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        i10++;
                        sb2.append(i10);
                        sb2.append(".\n");
                        str2 = sb2.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(str2);
                    textView.setOnClickListener(new oj.e(dialog));
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
    public static final void v2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void w2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void x2(DobChangeActivity dobChangeActivity, View view) {
        l.f(dobChangeActivity, "this$0");
        Intent intent = new Intent(dobChangeActivity, DlServiceDetailsActivity.class);
        intent.putExtra("DL", dobChangeActivity.S);
        intent.putExtra("dob", dobChangeActivity.T);
        intent.putExtra("DLDetails", dobChangeActivity.S1());
        intent.putExtra("Mobile_no", dobChangeActivity.U);
        intent.putExtra("lastEndorsedRTO", dobChangeActivity.V);
        intent.putExtra("lastEndorsedState", dobChangeActivity.W);
        intent.putExtra("lastEndorsedRTOCode", dobChangeActivity.X);
        intent.putExtra("lastEndorseStateCode", dobChangeActivity.Y);
        intent.putExtra("whatServiceRequired", dobChangeActivity.f22074b0);
        dobChangeActivity.startActivity(intent);
    }

    private final void y2() {
        ArrayList arrayList = new ArrayList();
        List<ReasonsMasterItem> list = this.N;
        if (list != null) {
            for (ReasonsMasterItem reasonsMasterItem : list) {
                arrayList.add(String.valueOf(reasonsMasterItem != null ? reasonsMasterItem.getReasonName() : null));
            }
        }
        kk.e a10 = kk.e.A0.a("Select Reason", arrayList);
        a10.k2(F0(), "ReasonPicker");
        a10.n2(new d(this));
    }

    public final void B2(String str) {
        l.f(str, "<set-?>");
        this.f22086n0 = str;
    }

    public final void C2(DldetobjX dldetobjX) {
        l.f(dldetobjX, "<set-?>");
        this.f22073a0 = dldetobjX;
    }

    public final void D2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.f22088p0 = arrayList;
    }

    public final void E2(CombineServiceInterface combineServiceInterface) {
        l.f(combineServiceInterface, "<set-?>");
        this.f22097y0 = combineServiceInterface;
    }

    public final void F2(Context context) {
        l.f(context, "<set-?>");
        this.f22085m0 = context;
    }

    public final void G2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.f22087o0 = arrayList;
    }

    public final void H2(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.f22075c0 = fVar;
    }

    public final String R1(String str) {
        l.f(str, "date");
        try {
            String format = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(str));
            l.c(format);
            return format;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public final DldetobjX S1() {
        DldetobjX dldetobjX = this.f22073a0;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        l.v("dlDetails");
        return null;
    }

    public final String T1() {
        return this.S;
    }

    public final String U1() {
        return this.T;
    }

    public final String V1() {
        return this.X;
    }

    public final String W1() {
        return this.V;
    }

    public final String X1() {
        return this.W;
    }

    public final String Y1() {
        return this.Y;
    }

    public final ArrayList Z1() {
        ArrayList arrayList = this.f22088p0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("listHeaderSteps");
        return null;
    }

    public final CombineServiceInterface a2() {
        CombineServiceInterface combineServiceInterface = this.f22097y0;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        l.v("mCombineServiceInterface");
        return null;
    }

    public final ld.g b2() {
        ld.g gVar = this.R;
        if (gVar != null) {
            return gVar;
        }
        l.v("mSessionmanger");
        return null;
    }

    public final String c2() {
        return this.U;
    }

    public final ArrayList d2() {
        ArrayList arrayList = this.f22087o0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("multiListName");
        return null;
    }

    public final ld.f e2() {
        ld.f fVar = this.f22075c0;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x7 c10 = x7.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.J = c10;
        x7 x7Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        F2(this);
        this.K = new ld.c(this);
        H2(new ld.f(this));
        x7 x7Var2 = this.J;
        if (x7Var2 == null) {
            l.v("binding");
            x7Var2 = null;
        }
        x7Var2.f29349j.setText((CharSequence) null);
        x7 x7Var3 = this.J;
        if (x7Var3 == null) {
            l.v("binding");
            x7Var3 = null;
        }
        x7Var3.f29349j.setContentDescription((CharSequence) null);
        e.a aVar = v9.e.f17509a;
        x7 x7Var4 = this.J;
        if (x7Var4 == null) {
            l.v("binding");
            x7Var4 = null;
        }
        aVar.p0(this, x7Var4);
        f2();
        ek.a aVar2 = this.L;
        if (aVar2 == null) {
            l.v("viewModel");
            aVar2 = null;
        }
        aVar2.m().g(this, new f(new b(this)));
        x7 x7Var5 = this.J;
        if (x7Var5 == null) {
            l.v("binding");
            x7Var5 = null;
        }
        x7Var5.f29352m.f25959e.setOnClickListener(new oj.a(this));
        pj.b bVar = this.M;
        if (bVar == null) {
            l.v("chnageDobViewModel");
            bVar = null;
        }
        bVar.h().g(this, new f(new c(this)));
        x7 x7Var6 = this.J;
        if (x7Var6 == null) {
            l.v("binding");
            x7Var6 = null;
        }
        x7Var6.f29353n.f29577d.setOnClickListener(new oj.h(this));
        x7 x7Var7 = this.J;
        if (x7Var7 == null) {
            l.v("binding");
            x7Var7 = null;
        }
        x7Var7.f29353n.f29581h.setOnClickListener(new i(this));
        x7 x7Var8 = this.J;
        if (x7Var8 == null) {
            l.v("binding");
            x7Var8 = null;
        }
        x7Var8.f29353n.f29580g.setOnClickListener(new j(this));
        if (l.a(e2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            o2();
        }
        P1();
        x7 x7Var9 = this.J;
        if (x7Var9 == null) {
            l.v("binding");
            x7Var9 = null;
        }
        TextView textView = x7Var9.f29364y;
        x7 x7Var10 = this.J;
        if (x7Var10 == null) {
            l.v("binding");
            x7Var10 = null;
        }
        textView.setPaintFlags(x7Var10.f29364y.getPaintFlags() | 8);
        x7 x7Var11 = this.J;
        if (x7Var11 == null) {
            l.v("binding");
            x7Var11 = null;
        }
        x7Var11.f29364y.setOnClickListener(new k(this));
        x7 x7Var12 = this.J;
        if (x7Var12 == null) {
            l.v("binding");
            x7Var12 = null;
        }
        x7Var12.f29353n.f29578e.setVisibility(8);
        x7 x7Var13 = this.J;
        if (x7Var13 == null) {
            l.v("binding");
            x7Var13 = null;
        }
        x7Var13.f29352m.f25961g.setText(e2().i());
        x7 x7Var14 = this.J;
        if (x7Var14 == null) {
            l.v("binding");
            x7Var14 = null;
        }
        x7Var14.f29364y.setVisibility(0);
        x7 x7Var15 = this.J;
        if (x7Var15 == null) {
            l.v("binding");
        } else {
            x7Var = x7Var15;
        }
        x7Var.f29345f.setVisibility(0);
    }

    public final void z2(String str) {
        if (str != null) {
            ld.c cVar = this.K;
            ld.c cVar2 = null;
            if (cVar == null) {
                l.v("langSession");
                cVar = null;
            }
            String b10 = cVar.b("nex_parivahan", getString(R.string.app_name));
            l.c(b10);
            ld.c cVar3 = this.K;
            if (cVar3 == null) {
                l.v("langSession");
            } else {
                cVar2 = cVar3;
            }
            String b11 = cVar2.b("btn_ok", getString(R.string.ok_txt));
            l.c(b11);
            g.n1(this, b10, str, 1, b11, (String) null, e.f22103e, 16, (Object) null);
        }
    }
}
