package com.nic.mparivahan.dlservices.ui.renewalofdl;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import bk.j;
import bk.k;
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
import com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel.DupChangeAddResponse;
import com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel.ResultX;
import com.nic.mparivahan.dlservices.RenewalCOA.RenCOAInterface;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto;
import com.nic.mparivahan.dlservices.data.model.DlSubmitResult;
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
import com.nic.mparivahan.dlservices.ui.renewalofdl.Revalidation.SelectRenewalCoalist;
import com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ni.v2;
import pl.x;

public final class RenewalOfDLActivity extends oi.g {
    private String A0 = "";
    private String B0 = "";
    private String C0 = "";
    private String D0 = "";
    private String E0 = "";
    private String F0 = "N";
    public Context G0;
    public ArrayList H0;
    public ArrayList I0;
    public v2 J;
    private boolean J0;
    private String K;
    private int K0;
    private String L;
    private int L0;
    private String M = "";
    private String M0 = "";
    public DldetobjX N;
    private ab.d N0;
    public LinearLayout O;
    public CombineServiceInterface O0;
    private String P;
    public ld.c P0;
    private String Q = "";
    private String R = "";
    private String S = "";
    private String T = "";
    private String U = "";
    private String V = "0";
    /* access modifiers changed from: private */
    public bk.a W;
    private DlAddress X = new DlAddress("", "", "", "", "", "", "", "");
    private DlAddress Y = new DlAddress("", "", "", "", "", "", "", "");
    private HashMap Z = new HashMap();

    /* renamed from: a0  reason: collision with root package name */
    public ld.f f22279a0;

    /* renamed from: b0  reason: collision with root package name */
    public qi.d f22280b0;

    /* renamed from: c0  reason: collision with root package name */
    public RenCOAInterface f22281c0;

    /* renamed from: d0  reason: collision with root package name */
    private String f22282d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private String f22283e0 = "";

    /* renamed from: f0  reason: collision with root package name */
    private String f22284f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    private String f22285g0 = "";

    /* renamed from: h0  reason: collision with root package name */
    private String f22286h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    private String f22287i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    private String f22288j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private String f22289k0 = "";

    /* renamed from: l0  reason: collision with root package name */
    private String f22290l0 = "";

    /* renamed from: m0  reason: collision with root package name */
    private String f22291m0 = "";

    /* renamed from: n0  reason: collision with root package name */
    private String f22292n0 = "";

    /* renamed from: o0  reason: collision with root package name */
    private String f22293o0 = "";

    /* renamed from: p0  reason: collision with root package name */
    private String f22294p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    private String f22295q0 = "";

    /* renamed from: r0  reason: collision with root package name */
    private String f22296r0 = "";

    /* renamed from: s0  reason: collision with root package name */
    private String f22297s0 = "";

    /* renamed from: t0  reason: collision with root package name */
    private String f22298t0;

    /* renamed from: u0  reason: collision with root package name */
    private String f22299u0;

    /* renamed from: v0  reason: collision with root package name */
    public ld.g f22300v0;

    /* renamed from: w0  reason: collision with root package name */
    private String f22301w0 = "0";

    /* renamed from: x0  reason: collision with root package name */
    private String f22302x0 = "N";

    /* renamed from: y0  reason: collision with root package name */
    private String f22303y0 = "N";

    /* renamed from: z0  reason: collision with root package name */
    private String f22304z0 = "";

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfDLActivity f22305e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f22306f;

        a(RenewalOfDLActivity renewalOfDLActivity, u uVar) {
            this.f22305e = renewalOfDLActivity;
            this.f22306f = uVar;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            this.f22305e.W2(((AppCatPojo) ((ArrayList) this.f22306f.f20234e).get(i10)).getAppCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfDLActivity f22307e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RenewalOfDLActivity renewalOfDLActivity) {
            super(1);
            this.f22307e = renewalOfDLActivity;
        }

        public final void b(DupChangeAddResponse dupChangeAddResponse) {
            RenewalOfDLActivity renewalOfDLActivity;
            String b10;
            RenewalOfDLActivity renewalOfDLActivity2;
            try {
                this.f22307e.P1().Q.c(false);
                if (p.o(dupChangeAddResponse.getResult().getStatus_code(), "00", true)) {
                    DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                    ResultX resultX = dupChangeAddResponse.getResult().getResult().get(0);
                    RenewalOfDLActivity renewalOfDLActivity3 = this.f22307e;
                    ResultX resultX2 = resultX;
                    DlLogCapture.a aVar = DlLogCapture.f21655k;
                    String R1 = renewalOfDLActivity3.R1();
                    String applicationNo = resultX2.getApplicationNo();
                    l.c(applicationNo);
                    long parseLong = Long.parseLong(applicationNo);
                    int parseInt = Integer.parseInt(renewalOfDLActivity3.e2().k());
                    String dateofBirth = resultX2.getDateofBirth();
                    String dlno = resultX2.getDlno();
                    l.c(dlno);
                    String applicantGender = resultX2.getApplicantGender();
                    String f22 = renewalOfDLActivity3.f2();
                    l.c(f22);
                    RenewalOfDLActivity renewalOfDLActivity4 = renewalOfDLActivity3;
                    aVar.a(renewalOfDLActivity3, "1234", "S", R1, parseLong, parseInt, dateofBirth, dlno, "N", "N", applicantGender, f22, false, renewalOfDLActivity3.x2(), renewalOfDLActivity3.W1(), renewalOfDLActivity3.Z1());
                    if (!l.a(renewalOfDLActivity4.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        renewalOfDLActivity2 = renewalOfDLActivity4;
                        renewalOfDLActivity2.h3(new ArrayList());
                        renewalOfDLActivity2.g2().add(renewalOfDLActivity2.y2().i());
                    } else {
                        renewalOfDLActivity2 = renewalOfDLActivity4;
                    }
                    dLServiceAcknowlegementActivity.E2(renewalOfDLActivity2, renewalOfDLActivity2.M1(resultX2), renewalOfDLActivity2.W1(), renewalOfDLActivity2.S1(), renewalOfDLActivity2.T1(), renewalOfDLActivity2.U1(), renewalOfDLActivity2.f2(), renewalOfDLActivity2.X1(), renewalOfDLActivity2.Y1(), renewalOfDLActivity2.Z1(), renewalOfDLActivity2.g2());
                    return;
                }
                String reqStatus = dupChangeAddResponse.getResult().getReqStatus();
                if (reqStatus != null) {
                    if (reqStatus.length() != 0) {
                        renewalOfDLActivity = this.f22307e;
                        b10 = dupChangeAddResponse.getResult().getReqStatus();
                        renewalOfDLActivity.O2(b10);
                    }
                }
                renewalOfDLActivity = this.f22307e;
                b10 = renewalOfDLActivity.V1().b("service_is_not_present", this.f22307e.getString(R.string.unable_to_get_details));
                renewalOfDLActivity.O2(b10);
            } catch (Exception unused) {
                this.f22307e.P1().Q.c(false);
                RenewalOfDLActivity renewalOfDLActivity5 = this.f22307e;
                renewalOfDLActivity5.O2(renewalOfDLActivity5.V1().b("service_is_not_present", this.f22307e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DupChangeAddResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfDLActivity f22308e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RenewalOfDLActivity renewalOfDLActivity) {
            super(1);
            this.f22308e = renewalOfDLActivity;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:16|17|18|19|20|(1:22)|23|59) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00ad */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00bd A[Catch:{ Exception -> 0x019a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r27) {
            /*
                r26 = this;
                r0 = r26
                java.lang.String r1 = "service_is_not_present"
                java.lang.String r2 = r27.toString()
                java.lang.String r3 = "reValidationDl"
                android.util.Log.d(r3, r2)
                r2 = 0
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22308e     // Catch:{ Exception -> 0x019a }
                ni.v2 r3 = r3.P1()     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r3 = r3.Q     // Catch:{ Exception -> 0x019a }
                r3.c(r2)     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r3 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                r4 = 0
                if (r3 == 0) goto L_0x0025
                java.lang.String r3 = r3.getStatusCode()     // Catch:{ Exception -> 0x019a }
                goto L_0x0026
            L_0x0025:
                r3 = r4
            L_0x0026:
                java.lang.String r5 = "00"
                r6 = 2
                boolean r3 = km.p.p(r3, r5, r2, r6, r4)     // Catch:{ Exception -> 0x019a }
                if (r3 == 0) goto L_0x00fd
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r3 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                if (r3 == 0) goto L_0x01bb
                java.util.List r3 = r3.getResult()     // Catch:{ Exception -> 0x019a }
                if (r3 == 0) goto L_0x01bb
                java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ Exception -> 0x019a }
                boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x019a }
                r4 = 1
                r3 = r3 ^ r4
                if (r3 != r4) goto L_0x01bb
                com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r5 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x019a }
                r5.<init>()     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r3 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                java.util.List r3 = r3.getResult()     // Catch:{ Exception -> 0x019a }
                java.lang.Object r3 = r3.get(r2)     // Catch:{ Exception -> 0x019a }
                r7 = r3
                com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r7 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r7     // Catch:{ Exception -> 0x019a }
                if (r7 == 0) goto L_0x01bb
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r6 = r0.f22308e     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r8 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x00ad }
                java.lang.String r10 = "1234"
                java.lang.String r11 = "S"
                java.lang.String r12 = r7.getApplicationDate()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r3 = r7.getApplicationNo()     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r3)     // Catch:{ Exception -> 0x00ad }
                long r13 = java.lang.Long.parseLong(r3)     // Catch:{ Exception -> 0x00ad }
                ld.g r3 = r6.e2()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r3 = r3.k()     // Catch:{ Exception -> 0x00ad }
                int r15 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x00ad }
                java.lang.String r16 = r7.getDateofBirth()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r17 = r7.getDlno()     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r17)     // Catch:{ Exception -> 0x00ad }
                java.lang.String r18 = "N"
                java.lang.String r19 = "N"
                java.lang.String r20 = r7.getApplicantGender()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r21 = r6.f2()     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r21)     // Catch:{ Exception -> 0x00ad }
                r22 = 0
                java.lang.String r23 = r6.x2()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r24 = r6.W1()     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r24)     // Catch:{ Exception -> 0x00ad }
                java.lang.String r25 = r6.Z1()     // Catch:{ Exception -> 0x00ad }
                r9 = r6
                r8.a(r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x00ad }
            L_0x00ad:
                ld.f r3 = r6.y2()     // Catch:{ Exception -> 0x019a }
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x019a }
                java.lang.String r4 = "950"
                boolean r3 = cm.l.a(r3, r4)     // Catch:{ Exception -> 0x019a }
                if (r3 != 0) goto L_0x00d4
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x019a }
                r3.<init>()     // Catch:{ Exception -> 0x019a }
                r6.h3(r3)     // Catch:{ Exception -> 0x019a }
                java.util.ArrayList r3 = r6.g2()     // Catch:{ Exception -> 0x019a }
                ld.f r4 = r6.y2()     // Catch:{ Exception -> 0x019a }
                java.lang.String r4 = r4.i()     // Catch:{ Exception -> 0x019a }
                r3.add(r4)     // Catch:{ Exception -> 0x019a }
            L_0x00d4:
                java.lang.String r8 = r6.W1()     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.Dl.Model.DldetobjX r9 = r6.S1()     // Catch:{ Exception -> 0x019a }
                java.lang.String r10 = r6.T1()     // Catch:{ Exception -> 0x019a }
                java.lang.String r11 = r6.U1()     // Catch:{ Exception -> 0x019a }
                java.lang.String r12 = r6.f2()     // Catch:{ Exception -> 0x019a }
                java.lang.String r13 = r6.X1()     // Catch:{ Exception -> 0x019a }
                java.lang.String r14 = r6.Y1()     // Catch:{ Exception -> 0x019a }
                java.lang.String r15 = r6.Z1()     // Catch:{ Exception -> 0x019a }
                java.util.ArrayList r16 = r6.g2()     // Catch:{ Exception -> 0x019a }
                r5.E2(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x019a }
                goto L_0x01bb
            L_0x00fd:
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r3 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                if (r3 == 0) goto L_0x0108
                java.lang.String r3 = r3.getStatusCode()     // Catch:{ Exception -> 0x019a }
                goto L_0x0109
            L_0x0108:
                r3 = r4
            L_0x0109:
                java.lang.String r5 = "01"
                boolean r3 = km.p.p(r3, r5, r2, r6, r4)     // Catch:{ Exception -> 0x019a }
                java.lang.String r5 = "Something went wrong, Try after some time"
                if (r3 == 0) goto L_0x014f
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22308e     // Catch:{ Exception -> 0x019a }
                ni.v2 r3 = r3.P1()     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r3 = r3.Q     // Catch:{ Exception -> 0x019a }
                r3.c(r2)     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r3 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                cm.l.c(r3)     // Catch:{ Exception -> 0x019a }
                java.lang.String r3 = r3.getReqStatus()     // Catch:{ Exception -> 0x019a }
                if (r3 == 0) goto L_0x0144
                int r3 = r3.length()     // Catch:{ Exception -> 0x019a }
                if (r3 != 0) goto L_0x0132
                goto L_0x0144
            L_0x0132:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22308e     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r4 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                cm.l.c(r4)     // Catch:{ Exception -> 0x019a }
                java.lang.String r4 = r4.getReqStatus()     // Catch:{ Exception -> 0x019a }
            L_0x013f:
                r3.O2(r4)     // Catch:{ Exception -> 0x019a }
                goto L_0x01bb
            L_0x0144:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22308e     // Catch:{ Exception -> 0x019a }
                ld.c r4 = r3.V1()     // Catch:{ Exception -> 0x019a }
            L_0x014a:
                java.lang.String r4 = r4.b(r1, r5)     // Catch:{ Exception -> 0x019a }
                goto L_0x013f
            L_0x014f:
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r3 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                if (r3 == 0) goto L_0x015a
                java.lang.String r3 = r3.getStatusCode()     // Catch:{ Exception -> 0x019a }
                goto L_0x015b
            L_0x015a:
                r3 = r4
            L_0x015b:
                java.lang.String r7 = "05"
                boolean r3 = km.p.p(r3, r7, r2, r6, r4)     // Catch:{ Exception -> 0x019a }
                if (r3 == 0) goto L_0x0175
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22308e     // Catch:{ Exception -> 0x019a }
                ni.v2 r3 = r3.P1()     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r3 = r3.Q     // Catch:{ Exception -> 0x019a }
                r3.c(r2)     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22308e     // Catch:{ Exception -> 0x019a }
                ld.c r4 = r3.V1()     // Catch:{ Exception -> 0x019a }
                goto L_0x014a
            L_0x0175:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22308e     // Catch:{ Exception -> 0x019a }
                ni.v2 r3 = r3.P1()     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r3 = r3.Q     // Catch:{ Exception -> 0x019a }
                r3.c(r2)     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22308e     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r5 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                if (r5 == 0) goto L_0x018c
                java.lang.String r4 = r5.getStatusDesc()     // Catch:{ Exception -> 0x019a }
            L_0x018c:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r5 = r0.f22308e     // Catch:{ Exception -> 0x019a }
                ni.v2 r5 = r5.P1()     // Catch:{ Exception -> 0x019a }
                android.view.View r5 = r5.m()     // Catch:{ Exception -> 0x019a }
                r3.t1(r4, r5)     // Catch:{ Exception -> 0x019a }
                goto L_0x01bb
            L_0x019a:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22308e
                ni.v2 r3 = r3.P1()
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r3 = r3.Q
                r3.c(r2)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r2 = r0.f22308e
                ld.c r3 = r2.V1()
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r4 = r0.f22308e
                r5 = 2132019337(0x7f140889, float:1.9677006E38)
                java.lang.String r4 = r4.getString(r5)
                java.lang.String r1 = r3.b(r1, r4)
                r2.O2(r1)
            L_0x01bb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity.c.b(com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetAckDetForGivenDLNumberResponse) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfDLActivity f22309e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(RenewalOfDLActivity renewalOfDLActivity) {
            super(1);
            this.f22309e = renewalOfDLActivity;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:16|17|18|19|20|(1:22)|23|59) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00ad */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00bd A[Catch:{ Exception -> 0x019a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r27) {
            /*
                r26 = this;
                r0 = r26
                java.lang.String r1 = "service_is_not_present"
                java.lang.String r2 = r27.toString()
                java.lang.String r3 = "reValidationDlCoa"
                android.util.Log.d(r3, r2)
                r2 = 0
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22309e     // Catch:{ Exception -> 0x019a }
                ni.v2 r3 = r3.P1()     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r3 = r3.Q     // Catch:{ Exception -> 0x019a }
                r3.c(r2)     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r3 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                r4 = 0
                if (r3 == 0) goto L_0x0025
                java.lang.String r3 = r3.getStatusCode()     // Catch:{ Exception -> 0x019a }
                goto L_0x0026
            L_0x0025:
                r3 = r4
            L_0x0026:
                java.lang.String r5 = "00"
                r6 = 2
                boolean r3 = km.p.p(r3, r5, r2, r6, r4)     // Catch:{ Exception -> 0x019a }
                if (r3 == 0) goto L_0x00fd
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r3 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                if (r3 == 0) goto L_0x01bb
                java.util.List r3 = r3.getResult()     // Catch:{ Exception -> 0x019a }
                if (r3 == 0) goto L_0x01bb
                java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ Exception -> 0x019a }
                boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x019a }
                r4 = 1
                r3 = r3 ^ r4
                if (r3 != r4) goto L_0x01bb
                com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r5 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x019a }
                r5.<init>()     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r3 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                java.util.List r3 = r3.getResult()     // Catch:{ Exception -> 0x019a }
                java.lang.Object r3 = r3.get(r2)     // Catch:{ Exception -> 0x019a }
                r7 = r3
                com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r7 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r7     // Catch:{ Exception -> 0x019a }
                if (r7 == 0) goto L_0x01bb
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r6 = r0.f22309e     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r8 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x00ad }
                java.lang.String r10 = "1234"
                java.lang.String r11 = "S"
                java.lang.String r12 = r7.getApplicationDate()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r3 = r7.getApplicationNo()     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r3)     // Catch:{ Exception -> 0x00ad }
                long r13 = java.lang.Long.parseLong(r3)     // Catch:{ Exception -> 0x00ad }
                ld.g r3 = r6.e2()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r3 = r3.k()     // Catch:{ Exception -> 0x00ad }
                int r15 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x00ad }
                java.lang.String r16 = r7.getDateofBirth()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r17 = r7.getDlno()     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r17)     // Catch:{ Exception -> 0x00ad }
                java.lang.String r18 = "N"
                java.lang.String r19 = "N"
                java.lang.String r20 = r7.getApplicantGender()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r21 = r6.f2()     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r21)     // Catch:{ Exception -> 0x00ad }
                r22 = 0
                java.lang.String r23 = r6.x2()     // Catch:{ Exception -> 0x00ad }
                java.lang.String r24 = r6.W1()     // Catch:{ Exception -> 0x00ad }
                cm.l.c(r24)     // Catch:{ Exception -> 0x00ad }
                java.lang.String r25 = r6.Z1()     // Catch:{ Exception -> 0x00ad }
                r9 = r6
                r8.a(r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x00ad }
            L_0x00ad:
                ld.f r3 = r6.y2()     // Catch:{ Exception -> 0x019a }
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x019a }
                java.lang.String r4 = "950"
                boolean r3 = cm.l.a(r3, r4)     // Catch:{ Exception -> 0x019a }
                if (r3 != 0) goto L_0x00d4
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x019a }
                r3.<init>()     // Catch:{ Exception -> 0x019a }
                r6.h3(r3)     // Catch:{ Exception -> 0x019a }
                java.util.ArrayList r3 = r6.g2()     // Catch:{ Exception -> 0x019a }
                ld.f r4 = r6.y2()     // Catch:{ Exception -> 0x019a }
                java.lang.String r4 = r4.i()     // Catch:{ Exception -> 0x019a }
                r3.add(r4)     // Catch:{ Exception -> 0x019a }
            L_0x00d4:
                java.lang.String r8 = r6.W1()     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.Dl.Model.DldetobjX r9 = r6.S1()     // Catch:{ Exception -> 0x019a }
                java.lang.String r10 = r6.T1()     // Catch:{ Exception -> 0x019a }
                java.lang.String r11 = r6.U1()     // Catch:{ Exception -> 0x019a }
                java.lang.String r12 = r6.f2()     // Catch:{ Exception -> 0x019a }
                java.lang.String r13 = r6.X1()     // Catch:{ Exception -> 0x019a }
                java.lang.String r14 = r6.Y1()     // Catch:{ Exception -> 0x019a }
                java.lang.String r15 = r6.Z1()     // Catch:{ Exception -> 0x019a }
                java.util.ArrayList r16 = r6.g2()     // Catch:{ Exception -> 0x019a }
                r5.E2(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x019a }
                goto L_0x01bb
            L_0x00fd:
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r3 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                if (r3 == 0) goto L_0x0108
                java.lang.String r3 = r3.getStatusCode()     // Catch:{ Exception -> 0x019a }
                goto L_0x0109
            L_0x0108:
                r3 = r4
            L_0x0109:
                java.lang.String r5 = "01"
                boolean r3 = km.p.p(r3, r5, r2, r6, r4)     // Catch:{ Exception -> 0x019a }
                java.lang.String r5 = "Something went wrong, Try after some time"
                if (r3 == 0) goto L_0x014f
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22309e     // Catch:{ Exception -> 0x019a }
                ni.v2 r3 = r3.P1()     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r3 = r3.Q     // Catch:{ Exception -> 0x019a }
                r3.c(r2)     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r3 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                cm.l.c(r3)     // Catch:{ Exception -> 0x019a }
                java.lang.String r3 = r3.getReqStatus()     // Catch:{ Exception -> 0x019a }
                if (r3 == 0) goto L_0x0144
                int r3 = r3.length()     // Catch:{ Exception -> 0x019a }
                if (r3 != 0) goto L_0x0132
                goto L_0x0144
            L_0x0132:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22309e     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r4 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                cm.l.c(r4)     // Catch:{ Exception -> 0x019a }
                java.lang.String r4 = r4.getReqStatus()     // Catch:{ Exception -> 0x019a }
            L_0x013f:
                r3.O2(r4)     // Catch:{ Exception -> 0x019a }
                goto L_0x01bb
            L_0x0144:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22309e     // Catch:{ Exception -> 0x019a }
                ld.c r4 = r3.V1()     // Catch:{ Exception -> 0x019a }
            L_0x014a:
                java.lang.String r4 = r4.b(r1, r5)     // Catch:{ Exception -> 0x019a }
                goto L_0x013f
            L_0x014f:
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r3 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                if (r3 == 0) goto L_0x015a
                java.lang.String r3 = r3.getStatusCode()     // Catch:{ Exception -> 0x019a }
                goto L_0x015b
            L_0x015a:
                r3 = r4
            L_0x015b:
                java.lang.String r7 = "05"
                boolean r3 = km.p.p(r3, r7, r2, r6, r4)     // Catch:{ Exception -> 0x019a }
                if (r3 == 0) goto L_0x0175
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22309e     // Catch:{ Exception -> 0x019a }
                ni.v2 r3 = r3.P1()     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r3 = r3.Q     // Catch:{ Exception -> 0x019a }
                r3.c(r2)     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22309e     // Catch:{ Exception -> 0x019a }
                ld.c r4 = r3.V1()     // Catch:{ Exception -> 0x019a }
                goto L_0x014a
            L_0x0175:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22309e     // Catch:{ Exception -> 0x019a }
                ni.v2 r3 = r3.P1()     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r3 = r3.Q     // Catch:{ Exception -> 0x019a }
                r3.c(r2)     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22309e     // Catch:{ Exception -> 0x019a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r5 = r27.getDlSubmitresult()     // Catch:{ Exception -> 0x019a }
                if (r5 == 0) goto L_0x018c
                java.lang.String r4 = r5.getStatusDesc()     // Catch:{ Exception -> 0x019a }
            L_0x018c:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r5 = r0.f22309e     // Catch:{ Exception -> 0x019a }
                ni.v2 r5 = r5.P1()     // Catch:{ Exception -> 0x019a }
                android.view.View r5 = r5.m()     // Catch:{ Exception -> 0x019a }
                r3.t1(r4, r5)     // Catch:{ Exception -> 0x019a }
                goto L_0x01bb
            L_0x019a:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22309e
                ni.v2 r3 = r3.P1()
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r3 = r3.Q
                r3.c(r2)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r2 = r0.f22309e
                ld.c r3 = r2.V1()
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r4 = r0.f22309e
                r5 = 2132019337(0x7f140889, float:1.9677006E38)
                java.lang.String r4 = r4.getString(r5)
                java.lang.String r1 = r3.b(r1, r4)
                r2.O2(r1)
            L_0x01bb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity.d.b(com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetAckDetForGivenDLNumberResponse) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfDLActivity f22310e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(RenewalOfDLActivity renewalOfDLActivity) {
            super(1);
            this.f22310e = renewalOfDLActivity;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:8|9|10|11|12|(1:14)|15|28) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0092 */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x00a2 A[Catch:{ Exception -> 0x011a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto r27) {
            /*
                r26 = this;
                r0 = r26
                java.lang.String r1 = "service_is_not_present"
                r2 = 2132019337(0x7f140889, float:1.9677006E38)
                r3 = 0
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r4 = r0.f22310e     // Catch:{ Exception -> 0x011a }
                ni.v2 r4 = r4.P1()     // Catch:{ Exception -> 0x011a }
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r4 = r4.Q     // Catch:{ Exception -> 0x011a }
                r4.c(r3)     // Catch:{ Exception -> 0x011a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r4 = r27.getResult()     // Catch:{ Exception -> 0x011a }
                cm.l.c(r4)     // Catch:{ Exception -> 0x011a }
                java.lang.String r4 = r4.getStatusCode()     // Catch:{ Exception -> 0x011a }
                java.lang.String r5 = "00"
                r6 = 2
                r7 = 0
                boolean r4 = km.p.p(r4, r5, r3, r6, r7)     // Catch:{ Exception -> 0x011a }
                if (r4 == 0) goto L_0x00e1
                com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r5 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x011a }
                r5.<init>()     // Catch:{ Exception -> 0x011a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r4 = r27.getResult()     // Catch:{ Exception -> 0x011a }
                cm.l.c(r4)     // Catch:{ Exception -> 0x011a }
                java.util.List r4 = r4.getResult()     // Catch:{ Exception -> 0x011a }
                if (r4 == 0) goto L_0x0138
                java.lang.Object r4 = r4.get(r3)     // Catch:{ Exception -> 0x011a }
                r7 = r4
                com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r7 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r7     // Catch:{ Exception -> 0x011a }
                if (r7 == 0) goto L_0x0138
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r6 = r0.f22310e     // Catch:{ Exception -> 0x011a }
                com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r8 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x0092 }
                java.lang.String r10 = "1234"
                java.lang.String r11 = "S"
                java.lang.String r12 = r7.getApplicationDate()     // Catch:{ Exception -> 0x0092 }
                java.lang.String r4 = r7.getApplicationNo()     // Catch:{ Exception -> 0x0092 }
                cm.l.c(r4)     // Catch:{ Exception -> 0x0092 }
                long r13 = java.lang.Long.parseLong(r4)     // Catch:{ Exception -> 0x0092 }
                ld.g r4 = r6.e2()     // Catch:{ Exception -> 0x0092 }
                java.lang.String r4 = r4.k()     // Catch:{ Exception -> 0x0092 }
                int r15 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x0092 }
                java.lang.String r16 = r7.getDateofBirth()     // Catch:{ Exception -> 0x0092 }
                java.lang.String r17 = r7.getDlno()     // Catch:{ Exception -> 0x0092 }
                cm.l.c(r17)     // Catch:{ Exception -> 0x0092 }
                java.lang.String r18 = "N"
                java.lang.String r19 = "N"
                java.lang.String r20 = r7.getApplicantGender()     // Catch:{ Exception -> 0x0092 }
                java.lang.String r21 = r6.f2()     // Catch:{ Exception -> 0x0092 }
                cm.l.c(r21)     // Catch:{ Exception -> 0x0092 }
                r22 = 0
                java.lang.String r23 = r6.x2()     // Catch:{ Exception -> 0x0092 }
                java.lang.String r24 = r6.W1()     // Catch:{ Exception -> 0x0092 }
                java.lang.String r25 = r6.Z1()     // Catch:{ Exception -> 0x0092 }
                r9 = r6
                r8.a(r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0092 }
            L_0x0092:
                ld.f r4 = r6.y2()     // Catch:{ Exception -> 0x011a }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x011a }
                java.lang.String r8 = "950"
                boolean r4 = cm.l.a(r4, r8)     // Catch:{ Exception -> 0x011a }
                if (r4 != 0) goto L_0x00b9
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x011a }
                r4.<init>()     // Catch:{ Exception -> 0x011a }
                r6.h3(r4)     // Catch:{ Exception -> 0x011a }
                java.util.ArrayList r4 = r6.g2()     // Catch:{ Exception -> 0x011a }
                ld.f r8 = r6.y2()     // Catch:{ Exception -> 0x011a }
                java.lang.String r8 = r8.i()     // Catch:{ Exception -> 0x011a }
                r4.add(r8)     // Catch:{ Exception -> 0x011a }
            L_0x00b9:
                java.lang.String r8 = r6.W1()     // Catch:{ Exception -> 0x011a }
                com.nic.mparivahan.Dl.Model.DldetobjX r9 = r6.S1()     // Catch:{ Exception -> 0x011a }
                java.lang.String r10 = r6.T1()     // Catch:{ Exception -> 0x011a }
                java.lang.String r11 = r6.U1()     // Catch:{ Exception -> 0x011a }
                java.lang.String r12 = r6.f2()     // Catch:{ Exception -> 0x011a }
                java.lang.String r13 = r6.X1()     // Catch:{ Exception -> 0x011a }
                java.lang.String r14 = r6.Y1()     // Catch:{ Exception -> 0x011a }
                java.lang.String r15 = r6.Z1()     // Catch:{ Exception -> 0x011a }
                java.util.ArrayList r16 = r6.g2()     // Catch:{ Exception -> 0x011a }
                r5.E2(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x011a }
                goto L_0x0138
            L_0x00e1:
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r4 = r27.getResult()     // Catch:{ Exception -> 0x011a }
                cm.l.c(r4)     // Catch:{ Exception -> 0x011a }
                java.lang.String r4 = r4.getReqStatus()     // Catch:{ Exception -> 0x011a }
                if (r4 == 0) goto L_0x0106
                int r4 = r4.length()     // Catch:{ Exception -> 0x011a }
                if (r4 != 0) goto L_0x00f5
                goto L_0x0106
            L_0x00f5:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r4 = r0.f22310e     // Catch:{ Exception -> 0x011a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r5 = r27.getResult()     // Catch:{ Exception -> 0x011a }
                cm.l.c(r5)     // Catch:{ Exception -> 0x011a }
                java.lang.String r5 = r5.getReqStatus()     // Catch:{ Exception -> 0x011a }
                r4.Q2(r5)     // Catch:{ Exception -> 0x011a }
                goto L_0x0138
            L_0x0106:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r4 = r0.f22310e     // Catch:{ Exception -> 0x011a }
                ld.c r5 = r4.V1()     // Catch:{ Exception -> 0x011a }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r6 = r0.f22310e     // Catch:{ Exception -> 0x011a }
                java.lang.String r6 = r6.getString(r2)     // Catch:{ Exception -> 0x011a }
                java.lang.String r5 = r5.b(r1, r6)     // Catch:{ Exception -> 0x011a }
                r4.O2(r5)     // Catch:{ Exception -> 0x011a }
                goto L_0x0138
            L_0x011a:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r4 = r0.f22310e
                ni.v2 r4 = r4.P1()
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r4 = r4.Q
                r4.c(r3)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r3 = r0.f22310e
                ld.c r4 = r3.V1()
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r5 = r0.f22310e
                java.lang.String r2 = r5.getString(r2)
                java.lang.String r1 = r4.b(r1, r2)
                r3.O2(r1)
            L_0x0138:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity.e.b(com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlRenewalSaveDto) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfDLActivity f22311e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(RenewalOfDLActivity renewalOfDLActivity) {
            super(1);
            this.f22311e = renewalOfDLActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0088, code lost:
            if (r2 == null) goto L_0x008a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(java.lang.String r32) {
            /*
                r31 = this;
                r0 = r31
                r1 = r32
                java.lang.String r2 = "it"
                cm.l.f(r1, r2)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r2 = r0.f22311e
                java.lang.String r2 = r2.z2()
                java.lang.String r3 = "same"
                boolean r2 = cm.l.a(r2, r3)
                java.lang.String r4 = ""
                java.lang.String r5 = "[^A-Za-z0-9 ]"
                java.lang.String r6 = "yes"
                r7 = 2
                r8 = 0
                java.lang.String r9 = "537"
                java.lang.String r10 = "toString(...)"
                java.lang.String r11 = "S"
                java.lang.String r12 = "viewModel"
                r13 = 1
                r14 = 0
                if (r2 == 0) goto L_0x00f8
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r2 = r0.f22311e
                java.lang.String r2 = r2.Q1()
                boolean r2 = cm.l.a(r2, r11)
                if (r2 != 0) goto L_0x00f8
                boolean r1 = km.p.o(r1, r6, r13)     // Catch:{ Exception -> 0x0442 }
                if (r1 == 0) goto L_0x0442
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ni.v2 r1 = r1.P1()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r1 = r1.Q     // Catch:{ Exception -> 0x0442 }
                r1.c(r13)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.Dl.Model.DldetobjX r1 = r1.S1()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r1 = r1.getDlLicno()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0442 }
                km.f r2 = new km.f     // Catch:{ Exception -> 0x0442 }
                r2.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x0442 }
                java.lang.String r1 = r2.b(r1, r4)     // Catch:{ Exception -> 0x0442 }
                java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x0442 }
                java.lang.String r16 = r1.toString()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.util.HashMap r1 = r1.A2()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0442 }
                cm.l.e(r1, r10)     // Catch:{ Exception -> 0x0442 }
                boolean r1 = km.q.F(r1, r9, r8, r7, r14)     // Catch:{ Exception -> 0x0442 }
                if (r1 == 0) goto L_0x0094
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                bk.m r1 = r1.U2()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r2 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                bk.a r2 = r2.W     // Catch:{ Exception -> 0x0442 }
                if (r2 != 0) goto L_0x008e
            L_0x008a:
                cm.l.v(r12)     // Catch:{ Exception -> 0x0442 }
                goto L_0x008f
            L_0x008e:
                r14 = r2
            L_0x008f:
                r14.k(r1)     // Catch:{ Exception -> 0x0442 }
                goto L_0x0442
            L_0x0094:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                bk.a r1 = r1.W     // Catch:{ Exception -> 0x0442 }
                if (r1 != 0) goto L_0x00a1
                cm.l.v(r12)     // Catch:{ Exception -> 0x0442 }
                r15 = r14
                goto L_0x00a2
            L_0x00a1:
                r15 = r1
            L_0x00a2:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.Dl.Model.DldetobjX r1 = r1.S1()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.Dl.Model.BioObjX r1 = r1.getBioObj()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r17 = r1.getBioDob()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r18 = r1.W1()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.util.HashMap r19 = r1.A2()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r20 = r1.O1()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r21 = r1.f2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r21)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ld.f r1 = r1.y2()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r22 = r1.f()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ld.f r1 = r1.y2()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r23 = r1.g()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ld.f r1 = r1.y2()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r24 = r1.e()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ld.f r1 = r1.y2()     // Catch:{ Exception -> 0x0442 }
            L_0x00ef:
                java.lang.String r25 = r1.h()     // Catch:{ Exception -> 0x0442 }
                r15.l(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0442 }
                goto L_0x0442
            L_0x00f8:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r2 = r0.f22311e
                java.lang.String r2 = r2.z2()
                boolean r2 = cm.l.a(r2, r3)
                java.lang.String r15 = "Y"
                if (r2 == 0) goto L_0x023d
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r2 = r0.f22311e
                java.lang.String r2 = r2.Q1()
                boolean r2 = cm.l.a(r2, r11)
                if (r2 == 0) goto L_0x023d
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r2 = r0.f22311e
                java.lang.String r2 = r2.N1()
                boolean r2 = cm.l.a(r2, r15)
                if (r2 == 0) goto L_0x023d
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                ni.v2 r1 = r1.P1()
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r1 = r1.Q
                r1.c(r13)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                qi.d r2 = r1.d2()
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.T1()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.CharSequence r1 = km.q.B0(r1)
                java.lang.String r3 = r1.toString()
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.U1()
                r4 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r5 = r1.W1()
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.f2()
                r6 = r1
                cm.l.c(r1)
                java.lang.String r7 = "N"
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.i2()
                r8 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.m2()
                r9 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.j2()
                r10 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.o2()
                r11 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.h2()
                r12 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.n2()
                r13 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.l2()
                r14 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.k2()
                r15 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.q2()
                r16 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.u2()
                r17 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.r2()
                r18 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.w2()
                r19 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.v2()
                r20 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.p2()
                r21 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.t2()
                r22 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.s2()
                r23 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                java.lang.String r1 = r1.f2()
                r24 = r1
                cm.l.c(r1)
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                ld.f r1 = r1.y2()
                java.lang.String r25 = r1.f()
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                ld.f r1 = r1.y2()
                java.lang.String r26 = r1.g()
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                ld.f r1 = r1.y2()
                java.lang.String r27 = r1.e()
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e
                ld.f r1 = r1.y2()
                java.lang.String r28 = r1.h()
                r2.h(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                goto L_0x0442
            L_0x023d:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r2 = r0.f22311e
                java.lang.String r2 = r2.z2()
                boolean r2 = cm.l.a(r2, r3)
                if (r2 == 0) goto L_0x0315
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r2 = r0.f22311e
                java.lang.String r2 = r2.Q1()
                boolean r2 = cm.l.a(r2, r11)
                if (r2 == 0) goto L_0x0315
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r2 = r0.f22311e
                java.lang.String r2 = r2.N1()
                boolean r2 = cm.l.a(r2, r15)
                if (r2 != 0) goto L_0x0315
                boolean r1 = km.p.o(r1, r6, r13)     // Catch:{ Exception -> 0x0442 }
                if (r1 == 0) goto L_0x0442
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ni.v2 r1 = r1.P1()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r1 = r1.Q     // Catch:{ Exception -> 0x0442 }
                r1.c(r13)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.Dl.Model.DldetobjX r1 = r1.S1()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r1 = r1.getDlLicno()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0442 }
                km.f r2 = new km.f     // Catch:{ Exception -> 0x0442 }
                r2.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x0442 }
                java.lang.String r1 = r2.b(r1, r4)     // Catch:{ Exception -> 0x0442 }
                java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x0442 }
                java.lang.String r16 = r1.toString()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.util.HashMap r1 = r1.A2()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0442 }
                cm.l.e(r1, r10)     // Catch:{ Exception -> 0x0442 }
                boolean r1 = km.q.F(r1, r9, r8, r7, r14)     // Catch:{ Exception -> 0x0442 }
                if (r1 == 0) goto L_0x02b8
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                bk.m r1 = r1.U2()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r2 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                bk.a r2 = r2.W     // Catch:{ Exception -> 0x0442 }
                if (r2 != 0) goto L_0x008e
                goto L_0x008a
            L_0x02b8:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                bk.a r1 = r1.W     // Catch:{ Exception -> 0x0442 }
                if (r1 != 0) goto L_0x02c5
                cm.l.v(r12)     // Catch:{ Exception -> 0x0442 }
                r15 = r14
                goto L_0x02c6
            L_0x02c5:
                r15 = r1
            L_0x02c6:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.Dl.Model.DldetobjX r1 = r1.S1()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.Dl.Model.BioObjX r1 = r1.getBioObj()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r17 = r1.getBioDob()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r18 = r1.W1()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.util.HashMap r19 = r1.A2()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r20 = r1.O1()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r21 = r1.f2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r21)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ld.f r1 = r1.y2()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r22 = r1.f()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ld.f r1 = r1.y2()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r23 = r1.g()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ld.f r1 = r1.y2()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r24 = r1.e()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ld.f r1 = r1.y2()     // Catch:{ Exception -> 0x0442 }
                goto L_0x00ef
            L_0x0315:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ni.v2 r1 = r1.P1()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r1 = r1.Q     // Catch:{ Exception -> 0x0442 }
                r1.c(r13)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.util.HashMap r1 = r1.A2()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0442 }
                cm.l.e(r1, r10)     // Catch:{ Exception -> 0x0442 }
                boolean r1 = km.q.F(r1, r9, r8, r7, r14)     // Catch:{ Exception -> 0x0442 }
                if (r1 == 0) goto L_0x034b
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ck.a r1 = r1.T2()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r2 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                bk.a r2 = r2.W     // Catch:{ Exception -> 0x0442 }
                if (r2 != 0) goto L_0x0345
                cm.l.v(r12)     // Catch:{ Exception -> 0x0442 }
                goto L_0x0346
            L_0x0345:
                r14 = r2
            L_0x0346:
                r14.j(r1)     // Catch:{ Exception -> 0x0442 }
                goto L_0x0442
            L_0x034b:
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                qi.d r2 = r1.d2()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r1 = r1.T1()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0442 }
                java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x0442 }
                java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r4 = r1.U1()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r4)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r5 = r1.W1()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r6 = "NA"
                java.lang.String r7 = "N"
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r8 = r1.O1()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r9 = "B"
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r10 = r1.i2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r10)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r11 = r1.m2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r11)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r12 = r1.j2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r12)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r13 = r1.o2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r13)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r14 = r1.h2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r14)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r15 = r1.n2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r15)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r16 = r1.l2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r16)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r17 = r1.k2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r17)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r18 = r1.q2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r18)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r19 = r1.u2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r19)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r20 = r1.r2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r20)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r21 = r1.w2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r21)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r22 = r1.v2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r22)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r23 = r1.p2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r23)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r24 = r1.t2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r24)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r25 = r1.s2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r25)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                java.lang.String r26 = r1.f2()     // Catch:{ Exception -> 0x0442 }
                cm.l.c(r26)     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ld.f r1 = r1.y2()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r27 = r1.f()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ld.f r1 = r1.y2()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r28 = r1.g()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ld.f r1 = r1.y2()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r29 = r1.e()     // Catch:{ Exception -> 0x0442 }
                com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity r1 = r0.f22311e     // Catch:{ Exception -> 0x0442 }
                ld.f r1 = r1.y2()     // Catch:{ Exception -> 0x0442 }
                java.lang.String r30 = r1.h()     // Catch:{ Exception -> 0x0442 }
                r2.g(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x0442 }
            L_0x0442:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity.f.b(java.lang.String):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f22312a;

        g(bm.l lVar) {
            l.f(lVar, "function");
            this.f22312a = lVar;
        }

        public final pl.c a() {
            return this.f22312a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22312a.invoke(obj);
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

    public RenewalOfDLActivity() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:49|50|(1:52)(1:54)|53|55|(3:57|58|(3:60|(1:62)(1:64)|63))|65|66|(1:68)(1:69)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x044e */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x011d A[Catch:{ Exception -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x02a2 A[Catch:{ Exception -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x02a7 A[Catch:{ Exception -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x02aa A[Catch:{ Exception -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x045a A[Catch:{ Exception -> 0x04a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0482 A[Catch:{ Exception -> 0x04a9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void B2() {
        /*
            r14 = this;
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>"
            android.content.Intent r1 = r14.getIntent()
            r6 = 1
            r7 = 0
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            r8 = 0
            if (r1 == 0) goto L_0x02e8
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "bioRecGenesis"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22298t0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "allowAddrChangeAtDlservReqst"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22299u0 = r1     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = "values"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e8 }
            r3.<init>()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r4 = r14.f22298t0     // Catch:{ Exception -> 0x02e8 }
            r3.append(r4)     // Catch:{ Exception -> 0x02e8 }
            r4 = 45
            r3.append(r4)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r4 = r14.f22299u0     // Catch:{ Exception -> 0x02e8 }
            r3.append(r4)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02e8 }
            android.util.Log.d(r1, r3)     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "DL"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.K = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "dob"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.L = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "Mobile_no"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.P = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "DLDetails"
            java.io.Serializable r1 = r1.getSerializableExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX"
            cm.l.d(r1, r3)     // Catch:{ Exception -> 0x02e8 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = (com.nic.mparivahan.Dl.Model.DldetobjX) r1     // Catch:{ Exception -> 0x02e8 }
            r14.Y2(r1)     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "purCode"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x02e8 }
            r14.V = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "lastEndorsedRTO"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x02e8 }
            r14.Q = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "lastEndorsedState"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x02e8 }
            r14.R = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "lastEndorseStateCode"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x02e8 }
            r14.S = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "lastEndorsedRTOCode"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x02e8 }
            r14.T = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "state_value"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x02e8 }
            r14.U = r1     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = r14.R     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x010a
            int r1 = r1.length()     // Catch:{ Exception -> 0x02e8 }
            if (r1 != 0) goto L_0x00f5
            goto L_0x010a
        L_0x00f5:
            java.lang.String r1 = r14.R     // Catch:{ Exception -> 0x02e8 }
            boolean r1 = cm.l.a(r1, r3)     // Catch:{ Exception -> 0x02e8 }
            if (r1 == 0) goto L_0x00fe
            goto L_0x010a
        L_0x00fe:
            ni.v2 r1 = r14.P1()     // Catch:{ Exception -> 0x02e8 }
            android.widget.TextView r1 = r1.P     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r4 = r14.R     // Catch:{ Exception -> 0x02e8 }
        L_0x0106:
            r1.setText(r4)     // Catch:{ Exception -> 0x02e8 }
            goto L_0x0119
        L_0x010a:
            ni.v2 r1 = r14.P1()     // Catch:{ Exception -> 0x02e8 }
            android.widget.TextView r1 = r1.P     // Catch:{ Exception -> 0x02e8 }
            ld.f r4 = r14.y2()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r4 = r4.l()     // Catch:{ Exception -> 0x02e8 }
            goto L_0x0106
        L_0x0119:
            java.lang.String r1 = r14.Q     // Catch:{ Exception -> 0x02e8 }
            if (r1 == 0) goto L_0x0139
            int r1 = r1.length()     // Catch:{ Exception -> 0x02e8 }
            if (r1 != 0) goto L_0x0124
            goto L_0x0139
        L_0x0124:
            java.lang.String r1 = r14.Q     // Catch:{ Exception -> 0x02e8 }
            boolean r1 = cm.l.a(r1, r3)     // Catch:{ Exception -> 0x02e8 }
            if (r1 == 0) goto L_0x012d
            goto L_0x0139
        L_0x012d:
            ni.v2 r1 = r14.P1()     // Catch:{ Exception -> 0x02e8 }
            android.widget.TextView r1 = r1.K     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = r14.Q     // Catch:{ Exception -> 0x02e8 }
        L_0x0135:
            r1.setText(r3)     // Catch:{ Exception -> 0x02e8 }
            goto L_0x0142
        L_0x0139:
            ni.v2 r1 = r14.P1()     // Catch:{ Exception -> 0x02e8 }
            android.widget.TextView r1 = r1.K     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "NA"
            goto L_0x0135
        L_0x0142:
            java.lang.String r1 = r14.T     // Catch:{ Exception -> 0x02e8 }
            r14.M = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "whatServiceRequired"
            java.io.Serializable r1 = r1.getSerializableExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>"
            cm.l.d(r1, r3)     // Catch:{ Exception -> 0x02e8 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x02e8 }
            r14.Z = r1     // Catch:{ Exception -> 0x02e8 }
            ni.v2 r1 = r14.P1()     // Catch:{ Exception -> 0x02e8 }
            android.widget.TextView r1 = r1.f28957y     // Catch:{ Exception -> 0x02e8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e8 }
            r3.<init>()     // Catch:{ Exception -> 0x02e8 }
            ld.c r4 = r14.V1()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r5 = "dl_no"
            java.lang.String r9 = "DL No. : "
            java.lang.String r4 = r4.b(r5, r9)     // Catch:{ Exception -> 0x02e8 }
            r3.append(r4)     // Catch:{ Exception -> 0x02e8 }
            r4 = 32
            r3.append(r4)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r4 = r14.K     // Catch:{ Exception -> 0x02e8 }
            r3.append(r4)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02e8 }
            r1.setText(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = r14.U     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "same"
            boolean r1 = cm.l.a(r1, r3)     // Catch:{ Exception -> 0x02e8 }
            if (r1 == 0) goto L_0x0198
            java.lang.String r1 = r14.f22298t0     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "S"
            boolean r1 = km.p.o(r1, r3, r6)     // Catch:{ Exception -> 0x02e8 }
            if (r1 == 0) goto L_0x0298
        L_0x0198:
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "presHouseNo"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22290l0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "presStreet"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22291m0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "presLocation"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22292n0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "presVillageOrTown"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22293o0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "presSubDistrict"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22294p0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "presDistrict"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22295q0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "presState"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22296r0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "presPincode"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22297s0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "perHouseNo"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22282d0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "perStreet"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22283e0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "perLocation"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22284f0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "permVillageOrTown"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22285g0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "perSubDistrict"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22286h0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "perDistrict"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22287i0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "perState"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22288j0 = r1     // Catch:{ Exception -> 0x02e8 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r3 = "perPinCode"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x02e8 }
            r14.f22289k0 = r1     // Catch:{ Exception -> 0x02e8 }
        L_0x0298:
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r14.S1()     // Catch:{ Exception -> 0x02e8 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r1 = r1.getBioImgObj()     // Catch:{ Exception -> 0x02e8 }
            if (r1 == 0) goto L_0x02a7
            java.lang.String r1 = r1.getBiPhoto()     // Catch:{ Exception -> 0x02e8 }
            goto L_0x02a8
        L_0x02a7:
            r1 = r7
        L_0x02a8:
            if (r1 == 0) goto L_0x02dc
            int r1 = r1.length()     // Catch:{ Exception -> 0x02e8 }
            if (r1 != 0) goto L_0x02b1
            goto L_0x02dc
        L_0x02b1:
            ni.v2 r1 = r14.P1()     // Catch:{ Exception -> 0x02e8 }
            ni.dc r1 = r1.D     // Catch:{ Exception -> 0x02e8 }
            androidx.cardview.widget.CardView r1 = r1.f25960f     // Catch:{ Exception -> 0x02e8 }
            r1.setVisibility(r8)     // Catch:{ Exception -> 0x02e8 }
            ni.v2 r1 = r14.P1()     // Catch:{ Exception -> 0x02e8 }
            ni.dc r1 = r1.D     // Catch:{ Exception -> 0x02e8 }
            android.widget.ImageView r1 = r1.f25956b     // Catch:{ Exception -> 0x02e8 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r14.S1()     // Catch:{ Exception -> 0x02e8 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r3 = r3.getBioImgObj()     // Catch:{ Exception -> 0x02e8 }
            if (r3 == 0) goto L_0x02d3
            java.lang.String r3 = r3.getBiPhoto()     // Catch:{ Exception -> 0x02e8 }
            goto L_0x02d4
        L_0x02d3:
            r3 = r7
        L_0x02d4:
            android.graphics.Bitmap r3 = com.nic.mparivahan.dlservices.utilities.d.a(r3)     // Catch:{ Exception -> 0x02e8 }
            r1.setImageBitmap(r3)     // Catch:{ Exception -> 0x02e8 }
            goto L_0x02e8
        L_0x02dc:
            ni.v2 r1 = r14.P1()     // Catch:{ Exception -> 0x02e8 }
            ni.dc r1 = r1.D     // Catch:{ Exception -> 0x02e8 }
            androidx.cardview.widget.CardView r1 = r1.f25960f     // Catch:{ Exception -> 0x02e8 }
            r3 = 4
            r1.setVisibility(r3)     // Catch:{ Exception -> 0x02e8 }
        L_0x02e8:
            ni.v2 r1 = r14.P1()
            ni.yb r1 = r1.E
            android.widget.TextView r1 = r1.f29581h
            java.lang.String r3 = r14.K
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.CharSequence r3 = km.q.B0(r3)
            java.lang.String r3 = r3.toString()
            r1.setText(r3)
            ni.v2 r1 = r14.P1()
            ni.yb r1 = r1.E
            android.widget.TextView r1 = r1.f29581h
            ni.v2 r3 = r14.P1()
            ni.yb r3 = r3.E
            android.widget.TextView r3 = r3.f29581h
            int r3 = r3.getPaintFlags()
            r9 = 8
            r3 = r3 | r9
            r1.setPaintFlags(r3)
            ld.f r1 = r14.y2()
            java.lang.String r1 = r1.b()
            java.lang.String r10 = "950"
            boolean r1 = cm.l.a(r1, r10)
            java.lang.String r11 = "revalidtion_expired_dl"
            java.lang.String r12 = "Re-Validation of Expired DL"
            if (r1 == 0) goto L_0x04a9
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r3 = "serialNo"
            int r1 = r1.getIntExtra(r3, r8)     // Catch:{ Exception -> 0x04a9 }
            r14.L0 = r1     // Catch:{ Exception -> 0x04a9 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r3 = "multiList"
            java.io.Serializable r1 = r1.getSerializableExtra(r3)     // Catch:{ Exception -> 0x04a9 }
            cm.l.d(r1, r0)     // Catch:{ Exception -> 0x04a9 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x04a9 }
            r14.h3(r1)     // Catch:{ Exception -> 0x04a9 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r3 = "listHeaderSteps"
            java.io.Serializable r1 = r1.getSerializableExtra(r3)     // Catch:{ Exception -> 0x04a9 }
            cm.l.d(r1, r0)     // Catch:{ Exception -> 0x04a9 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x04a9 }
            r14.a3(r1)     // Catch:{ Exception -> 0x04a9 }
            android.content.Intent r0 = r14.getIntent()     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r1 = "COA"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            cm.l.d(r0, r1)     // Catch:{ Exception -> 0x04a9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x04a9 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x04a9 }
            r14.J0 = r0     // Catch:{ Exception -> 0x04a9 }
            android.content.Intent r0 = r14.getIntent()     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r1 = "metaflag"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x04a9 }
            cm.l.d(r0, r2)     // Catch:{ Exception -> 0x04a9 }
            r14.M0 = r0     // Catch:{ Exception -> 0x04a9 }
            com.nic.mparivahan.DlCombineServices.CombineServiceInterface$a r0 = com.nic.mparivahan.DlCombineServices.CombineServiceInterface.f8704a     // Catch:{ Exception -> 0x04a9 }
            com.nic.mparivahan.DlCombineServices.CombineServiceInterface r0 = r0.a(r14)     // Catch:{ Exception -> 0x04a9 }
            r14.c3(r0)     // Catch:{ Exception -> 0x04a9 }
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0     // Catch:{ Exception -> 0x04a9 }
            ab.b r1 = new ab.b     // Catch:{ Exception -> 0x04a9 }
            ab.a r2 = new ab.a     // Catch:{ Exception -> 0x04a9 }
            com.nic.mparivahan.DlCombineServices.CombineServiceInterface r3 = r14.b2()     // Catch:{ Exception -> 0x04a9 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x04a9 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x04a9 }
            r0.<init>((androidx.lifecycle.x0) r14, (androidx.lifecycle.u0.b) r1)     // Catch:{ Exception -> 0x04a9 }
            java.lang.Class<ab.d> r1 = ab.d.class
            androidx.lifecycle.t0 r0 = r0.a(r1)     // Catch:{ Exception -> 0x04a9 }
            ab.d r0 = (ab.d) r0     // Catch:{ Exception -> 0x04a9 }
            r14.N0 = r0     // Catch:{ Exception -> 0x04a9 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x04a9 }
            r1 = 30
            if (r0 < r1) goto L_0x03d5
            android.view.WindowManager r0 = r14.getWindowManager()     // Catch:{ Exception -> 0x04a9 }
            android.view.WindowMetrics r0 = r0.getMaximumWindowMetrics()     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r1 = "getMaximumWindowMetrics(...)"
            cm.l.e(r0, r1)     // Catch:{ Exception -> 0x04a9 }
            android.graphics.Rect r0 = r0.getBounds()     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r1 = "getBounds(...)"
            cm.l.e(r0, r1)     // Catch:{ Exception -> 0x04a9 }
            int r0 = r0.right     // Catch:{ Exception -> 0x04a9 }
            r14.K0 = r0     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r1 = "Width"
        L_0x03cd:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x04a9 }
            android.util.Log.d(r1, r0)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x03e4
        L_0x03d5:
            android.content.res.Resources r0 = r14.getResources()     // Catch:{ Exception -> 0x04a9 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ Exception -> 0x04a9 }
            int r0 = r0.widthPixels     // Catch:{ Exception -> 0x04a9 }
            r14.K0 = r0     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r1 = "Width 1"
            goto L_0x03cd
        L_0x03e4:
            ld.f r0 = r14.y2()     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x04a9 }
            boolean r0 = cm.l.a(r0, r10)     // Catch:{ Exception -> 0x04a9 }
            if (r0 == 0) goto L_0x044e
            java.util.ArrayList r0 = r14.a2()     // Catch:{ Exception -> 0x044e }
            int r0 = r0.size()     // Catch:{ Exception -> 0x044e }
            if (r0 <= r6) goto L_0x044e
            ni.v2 r0 = r14.P1()     // Catch:{ Exception -> 0x044e }
            androidx.recyclerview.widget.RecyclerView r0 = r0.F     // Catch:{ Exception -> 0x044e }
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ Exception -> 0x044e }
            r1.<init>(r14, r8, r8)     // Catch:{ Exception -> 0x044e }
            r0.setLayoutManager(r1)     // Catch:{ Exception -> 0x044e }
            java.util.ArrayList r0 = r14.a2()     // Catch:{ Exception -> 0x044e }
            boolean r0 = r0.contains(r12)     // Catch:{ Exception -> 0x044e }
            if (r0 == 0) goto L_0x0438
            bb.a r13 = new bb.a     // Catch:{ Exception -> 0x044e }
            java.util.ArrayList r1 = r14.a2()     // Catch:{ Exception -> 0x044e }
            int r3 = r14.L0     // Catch:{ Exception -> 0x044e }
            int r4 = r14.K0     // Catch:{ Exception -> 0x044e }
            ld.c r0 = r14.V1()     // Catch:{ Exception -> 0x044e }
            java.lang.String r5 = r0.b(r11, r12)     // Catch:{ Exception -> 0x044e }
            cm.l.c(r5)     // Catch:{ Exception -> 0x044e }
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x044e }
            ni.v2 r0 = r14.P1()     // Catch:{ Exception -> 0x044e }
        L_0x0432:
            androidx.recyclerview.widget.RecyclerView r0 = r0.F     // Catch:{ Exception -> 0x044e }
            r0.setAdapter(r13)     // Catch:{ Exception -> 0x044e }
            goto L_0x044e
        L_0x0438:
            bb.a r13 = new bb.a     // Catch:{ Exception -> 0x044e }
            java.util.ArrayList r1 = r14.a2()     // Catch:{ Exception -> 0x044e }
            int r3 = r14.L0     // Catch:{ Exception -> 0x044e }
            int r4 = r14.K0     // Catch:{ Exception -> 0x044e }
            java.lang.String r5 = "Renewal of DL"
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x044e }
            ni.v2 r0 = r14.P1()     // Catch:{ Exception -> 0x044e }
            goto L_0x0432
        L_0x044e:
            int r0 = r14.L0     // Catch:{ Exception -> 0x04a9 }
            java.util.ArrayList r1 = r14.g2()     // Catch:{ Exception -> 0x04a9 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x04a9 }
            if (r0 != r1) goto L_0x0482
            ni.v2 r0 = r14.P1()     // Catch:{ Exception -> 0x04a9 }
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.Q     // Catch:{ Exception -> 0x04a9 }
            ld.c r1 = r14.V1()     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r2 = "vahan_btn_submit"
            java.lang.String r3 = "Submit"
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x04a9 }
            r0.setText(r1)     // Catch:{ Exception -> 0x04a9 }
            ni.v2 r0 = r14.P1()     // Catch:{ Exception -> 0x04a9 }
            android.widget.TextView r0 = r0.f28952b0     // Catch:{ Exception -> 0x04a9 }
            r0.setVisibility(r8)     // Catch:{ Exception -> 0x04a9 }
            ni.v2 r0 = r14.P1()     // Catch:{ Exception -> 0x04a9 }
            android.widget.FrameLayout r0 = r0.f28955w     // Catch:{ Exception -> 0x04a9 }
            r0.setVisibility(r8)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x04a9
        L_0x0482:
            ni.v2 r0 = r14.P1()     // Catch:{ Exception -> 0x04a9 }
            android.widget.TextView r0 = r0.f28952b0     // Catch:{ Exception -> 0x04a9 }
            r0.setVisibility(r9)     // Catch:{ Exception -> 0x04a9 }
            ni.v2 r0 = r14.P1()     // Catch:{ Exception -> 0x04a9 }
            android.widget.FrameLayout r0 = r0.f28955w     // Catch:{ Exception -> 0x04a9 }
            r0.setVisibility(r9)     // Catch:{ Exception -> 0x04a9 }
            ni.v2 r0 = r14.P1()     // Catch:{ Exception -> 0x04a9 }
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.Q     // Catch:{ Exception -> 0x04a9 }
            ld.c r1 = r14.V1()     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r2 = "btn_dl_serv_next"
            java.lang.String r3 = "Next"
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x04a9 }
            r0.setText(r1)     // Catch:{ Exception -> 0x04a9 }
        L_0x04a9:
            ld.f r0 = r14.y2()
            java.lang.String r0 = r0.b()
            boolean r0 = cm.l.a(r0, r10)
            if (r0 == 0) goto L_0x051b
            java.util.ArrayList r0 = r14.a2()     // Catch:{ Exception -> 0x0558 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0558 }
            if (r0 != r6) goto L_0x04d8
            ni.v2 r0 = r14.P1()     // Catch:{ Exception -> 0x0558 }
            ni.yb r0 = r0.E     // Catch:{ Exception -> 0x0558 }
            android.widget.TextView r0 = r0.f29580g     // Catch:{ Exception -> 0x0558 }
            java.util.ArrayList r1 = r14.a2()     // Catch:{ Exception -> 0x0558 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ Exception -> 0x0558 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0558 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0558 }
            goto L_0x0558
        L_0x04d8:
            ni.v2 r0 = r14.P1()     // Catch:{ Exception -> 0x0558 }
            ni.yb r0 = r0.E     // Catch:{ Exception -> 0x0558 }
            android.widget.TextView r0 = r0.f29580g     // Catch:{ Exception -> 0x0558 }
            ld.c r1 = r14.V1()     // Catch:{ Exception -> 0x0558 }
            java.lang.String r2 = "dl_services"
            r3 = 2132017656(0x7f1401f8, float:1.9673597E38)
            java.lang.String r3 = r14.getString(r3)     // Catch:{ Exception -> 0x0558 }
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x0558 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0558 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0558 }
            ni.v2 r0 = r14.P1()     // Catch:{ Exception -> 0x0558 }
            ni.yb r0 = r0.E     // Catch:{ Exception -> 0x0558 }
            android.widget.ImageView r0 = r0.f29579f     // Catch:{ Exception -> 0x0558 }
            r0.setVisibility(r9)     // Catch:{ Exception -> 0x0558 }
            ni.v2 r0 = r14.P1()     // Catch:{ Exception -> 0x0558 }
            ni.yb r0 = r0.E     // Catch:{ Exception -> 0x0558 }
            android.widget.TextView r0 = r0.f29580g     // Catch:{ Exception -> 0x0558 }
            ni.v2 r1 = r14.P1()     // Catch:{ Exception -> 0x0558 }
            ni.yb r1 = r1.E     // Catch:{ Exception -> 0x0558 }
            android.widget.TextView r1 = r1.f29580g     // Catch:{ Exception -> 0x0558 }
            int r1 = r1.getPaintFlags()     // Catch:{ Exception -> 0x0558 }
            r1 = r1 | r9
            r0.setPaintFlags(r1)     // Catch:{ Exception -> 0x0558 }
            goto L_0x0558
        L_0x051b:
            java.util.HashMap r0 = r14.Z
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            cm.l.e(r0, r1)
            java.lang.String r1 = "537"
            r2 = 2
            boolean r0 = km.q.F(r0, r1, r8, r2, r7)
            if (r0 == 0) goto L_0x0543
            ni.v2 r0 = r14.P1()
            ni.yb r0 = r0.E
            android.widget.TextView r0 = r0.f29580g
            ld.c r1 = r14.V1()
            java.lang.String r1 = r1.b(r11, r12)
        L_0x053f:
            r0.setText(r1)
            goto L_0x0558
        L_0x0543:
            ni.v2 r0 = r14.P1()
            ni.yb r0 = r0.E
            android.widget.TextView r0 = r0.f29580g
            ld.c r1 = r14.V1()
            java.lang.String r2 = "check_dl_serv_renewal_dl"
            java.lang.String r3 = "Renewal of DL"
            java.lang.String r1 = r1.b(r2, r3)
            goto L_0x053f
        L_0x0558:
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            qi.a r1 = new qi.a
            qi.b r2 = new qi.b
            com.nic.mparivahan.dlservices.RenewalCOA.RenCOAInterface r3 = r14.c2()
            r2.<init>(r3)
            r1.<init>(r2)
            r0.<init>((androidx.lifecycle.x0) r14, (androidx.lifecycle.u0.b) r1)
            java.lang.Class<qi.d> r1 = qi.d.class
            androidx.lifecycle.t0 r0 = r0.a(r1)
            qi.d r0 = (qi.d) r0
            r14.f3(r0)
            qi.d r0 = r14.d2()
            androidx.lifecycle.a0 r0 = r0.i()
            com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity$b r1 = new com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity$b
            r1.<init>(r14)
            com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity$g r2 = new com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity$g
            r2.<init>(r1)
            r0.g(r14, r2)
            bk.a r0 = r14.W
            java.lang.String r1 = "viewModel"
            if (r0 != 0) goto L_0x0595
            cm.l.v(r1)
            r0 = r7
        L_0x0595:
            androidx.lifecycle.y r0 = r0.h()
            com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity$c r2 = new com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity$c
            r2.<init>(r14)
            com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity$g r3 = new com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity$g
            r3.<init>(r2)
            r0.g(r14, r3)
            bk.a r0 = r14.W
            if (r0 != 0) goto L_0x05ae
            cm.l.v(r1)
            goto L_0x05af
        L_0x05ae:
            r7 = r0
        L_0x05af:
            androidx.lifecycle.y r0 = r7.i()
            com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity$d r1 = new com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity$d
            r1.<init>(r14)
            com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity$g r2 = new com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity$g
            r2.<init>(r1)
            r0.g(r14, r2)
            ni.v2 r0 = r14.P1()
            ni.yb r0 = r0.E
            android.widget.TextView r0 = r0.f29580g
            bk.h r1 = new bk.h
            r1.<init>(r14)
            r0.setOnClickListener(r1)
            ni.v2 r0 = r14.P1()
            ni.yb r0 = r0.E
            android.widget.TextView r0 = r0.f29581h
            bk.i r1 = new bk.i
            r1.<init>(r14)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity.B2():void");
    }

    /* access modifiers changed from: private */
    public static final void C2(RenewalOfDLActivity renewalOfDLActivity, View view) {
        l.f(renewalOfDLActivity, "this$0");
        if (l.a(renewalOfDLActivity.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (renewalOfDLActivity.a2().size() > 1) {
                    Dialog dialog = new Dialog(renewalOfDLActivity);
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
                    textView.setText(renewalOfDLActivity.V1().b("btn_ok", "OK"));
                    ((TextView) findViewById5).setText(renewalOfDLActivity.V1().b("title_dl_services", "Driving Licence Services"));
                    ((ImageView) findViewById).setOnClickListener(new k(dialog));
                    int size = renewalOfDLActivity.a2().size();
                    String str = "";
                    int i10 = 0;
                    String str2 = str;
                    while (i10 < size) {
                        str = str + ((String) renewalOfDLActivity.a2().get(i10)) + 10;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        i10++;
                        sb2.append(i10);
                        sb2.append(".\n");
                        str2 = sb2.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(str2);
                    textView.setOnClickListener(new bk.l(dialog));
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

    /* access modifiers changed from: private */
    public static final void F2(RenewalOfDLActivity renewalOfDLActivity, View view) {
        l.f(renewalOfDLActivity, "this$0");
        try {
            Intent intent = new Intent(renewalOfDLActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", renewalOfDLActivity.K);
            intent.putExtra("dob", renewalOfDLActivity.L);
            intent.putExtra("DLDetails", renewalOfDLActivity.S1());
            intent.putExtra("Mobile_no", renewalOfDLActivity.P);
            intent.putExtra("lastEndorsedRTO", renewalOfDLActivity.Q);
            intent.putExtra("lastEndorsedState", renewalOfDLActivity.R);
            intent.putExtra("lastEndorsedRTOCode", renewalOfDLActivity.T);
            intent.putExtra("lastEndorseStateCode", renewalOfDLActivity.S);
            intent.putExtra("whatServiceRequired", renewalOfDLActivity.Z);
            if (l.a(renewalOfDLActivity.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", renewalOfDLActivity.g2());
            }
            renewalOfDLActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void G2(Intent intent, String str, String str2, String str3, ArrayList arrayList) {
        try {
            intent.putExtra("DL", this.K);
            intent.putExtra("dob", this.L);
            intent.putExtra("DLDetails", S1());
            intent.putExtra("Mobile_no", this.P);
            intent.putExtra("lastEndorsedRTO", str);
            intent.putExtra("lastEndorsedState", str2);
            intent.putExtra("lastEndorsedRTOCode", this.T);
            intent.putExtra("lastEndorseStateCode", this.S);
            intent.putExtra("whatServiceRequired", this.Z);
            intent.putExtra("state_value", this.U);
            intent.putExtra("purCode", str3);
            intent.putExtra("bioRecGenesis", "S");
            intent.putExtra("allowAddrChangeAtDlservReqst", "N");
            intent.putExtra("metaflag", this.M0);
            intent.putExtra("multiList", arrayList);
            intent.putExtra("listHeaderSteps", a2());
            intent.putExtra("serialNo", this.L0 + 1);
            intent.putExtra("COA", this.J0);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void H2() {
        P1().Q.setOnClickListener(new bk.e(this));
        bk.a aVar = this.W;
        if (aVar == null) {
            l.v("viewModel");
            aVar = null;
        }
        aVar.g().g(this, new g(new e(this)));
    }

    /* access modifiers changed from: private */
    public static final void I2(RenewalOfDLActivity renewalOfDLActivity, View view) {
        l.f(renewalOfDLActivity, "this$0");
        if (l.a(renewalOfDLActivity.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            renewalOfDLActivity.V2();
        } else if (l.a(renewalOfDLActivity.f22301w0, "0")) {
            renewalOfDLActivity.O2(renewalOfDLActivity.V1().b("select_app_cat", renewalOfDLActivity.getString(R.string.sel_app_category)));
        } else {
            renewalOfDLActivity.S2();
        }
    }

    private final void J2() {
        ab.d dVar = this.N0;
        ab.d dVar2 = null;
        if (dVar == null) {
            l.v("mCombineViewModel");
            dVar = null;
        }
        dVar.i().g(this, new bk.f(this));
        ab.d dVar3 = this.N0;
        if (dVar3 == null) {
            l.v("mCombineViewModel");
        } else {
            dVar2 = dVar3;
        }
        dVar2.h().g(this, new bk.g(this));
    }

    /* access modifiers changed from: private */
    public static final void K2(RenewalOfDLActivity renewalOfDLActivity, GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) {
        RenewalOfDLActivity renewalOfDLActivity2;
        String str;
        int i10;
        List<ResultItemSubmit> result;
        String str2;
        RenewalOfDLActivity renewalOfDLActivity3 = renewalOfDLActivity;
        l.f(renewalOfDLActivity3, "this$0");
        renewalOfDLActivity.P1().Q.c(false);
        try {
            DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
            String str3 = null;
            if (p.p(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, (Object) null)) {
                DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (dlSubmitresult2 != null && (result = dlSubmitresult2.getResult()) != null && (!result.isEmpty())) {
                    DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                    ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                    if (resultItemSubmit != null) {
                        String str4 = "";
                        if (y.R(renewalOfDLActivity.g2(), renewalOfDLActivity.V1().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                            str4 = str4 + "513,";
                        }
                        try {
                            if (y.R(renewalOfDLActivity.g2(), renewalOfDLActivity.V1().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                                str4 = str4 + "514,";
                            }
                            if (y.R(renewalOfDLActivity.g2(), renewalOfDLActivity.V1().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                                str4 = str4 + "537,";
                            }
                            if (y.R(renewalOfDLActivity.g2(), renewalOfDLActivity.V1().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                                str4 = str4 + "515,";
                            }
                            if (y.R(renewalOfDLActivity.g2(), renewalOfDLActivity.V1().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                                str4 = str4 + "516,";
                            }
                            if (y.R(renewalOfDLActivity.g2(), renewalOfDLActivity.V1().b("check_dl_serv_extract_dl", "DL Extract"))) {
                                str4 = str4 + "523,";
                            }
                            if (y.R(renewalOfDLActivity.g2(), renewalOfDLActivity.V1().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                                str4 = str4 + "524,";
                            }
                            if (y.R(renewalOfDLActivity.g2(), renewalOfDLActivity.V1().b("change_name_dl", "Change of Name in DL"))) {
                                str4 = str4 + "526,";
                            }
                            if (y.R(renewalOfDLActivity.g2(), renewalOfDLActivity.V1().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                                str4 = str4 + "548";
                            }
                            String str5 = str4;
                            try {
                                DlLogCapture.a aVar = DlLogCapture.f21655k;
                                String applicationDate = resultItemSubmit.getApplicationDate();
                                String applicationNo = resultItemSubmit.getApplicationNo();
                                l.c(applicationNo);
                                long parseLong = Long.parseLong(applicationNo);
                                int parseInt = Integer.parseInt(renewalOfDLActivity.e2().k());
                                String dateofBirth = resultItemSubmit.getDateofBirth();
                                String dlno = resultItemSubmit.getDlno();
                                l.c(dlno);
                                String applicantGender = resultItemSubmit.getApplicantGender();
                                String str6 = renewalOfDLActivity3.P;
                                l.c(str6);
                                String str7 = "service_is_not_present";
                                try {
                                    str2 = str7;
                                } catch (Exception e10) {
                                    e = e10;
                                    str2 = str7;
                                    try {
                                        Log.d("valiii", e.getLocalizedMessage());
                                        renewalOfDLActivity2 = renewalOfDLActivity;
                                        dLServiceAcknowlegementActivity.E2(renewalOfDLActivity, resultItemSubmit, renewalOfDLActivity2.T, renewalOfDLActivity.S1(), renewalOfDLActivity2.K, renewalOfDLActivity2.L, renewalOfDLActivity2.P, renewalOfDLActivity2.Q, renewalOfDLActivity2.R, renewalOfDLActivity2.S, renewalOfDLActivity.a2());
                                    } catch (Exception unused) {
                                        renewalOfDLActivity2 = renewalOfDLActivity;
                                    }
                                }
                                try {
                                    aVar.a(renewalOfDLActivity, "1234", "S", applicationDate, parseLong, parseInt, dateofBirth, dlno, "N", "N", applicantGender, str6, false, str5, renewalOfDLActivity3.T, renewalOfDLActivity3.S);
                                } catch (Exception e11) {
                                    e = e11;
                                    Log.d("valiii", e.getLocalizedMessage());
                                    renewalOfDLActivity2 = renewalOfDLActivity;
                                    dLServiceAcknowlegementActivity.E2(renewalOfDLActivity, resultItemSubmit, renewalOfDLActivity2.T, renewalOfDLActivity.S1(), renewalOfDLActivity2.K, renewalOfDLActivity2.L, renewalOfDLActivity2.P, renewalOfDLActivity2.Q, renewalOfDLActivity2.R, renewalOfDLActivity2.S, renewalOfDLActivity.a2());
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str2 = "service_is_not_present";
                                Log.d("valiii", e.getLocalizedMessage());
                                renewalOfDLActivity2 = renewalOfDLActivity;
                                dLServiceAcknowlegementActivity.E2(renewalOfDLActivity, resultItemSubmit, renewalOfDLActivity2.T, renewalOfDLActivity.S1(), renewalOfDLActivity2.K, renewalOfDLActivity2.L, renewalOfDLActivity2.P, renewalOfDLActivity2.Q, renewalOfDLActivity2.R, renewalOfDLActivity2.S, renewalOfDLActivity.a2());
                            }
                            renewalOfDLActivity2 = renewalOfDLActivity;
                        } catch (Exception unused2) {
                            renewalOfDLActivity2 = renewalOfDLActivity3;
                            i10 = R.string.unable_to_get_details;
                            str = "service_is_not_present";
                            renewalOfDLActivity.P1().Q.c(false);
                            renewalOfDLActivity2.O2(renewalOfDLActivity.V1().b(str, renewalOfDLActivity2.getString(i10)));
                        }
                        try {
                            dLServiceAcknowlegementActivity.E2(renewalOfDLActivity, resultItemSubmit, renewalOfDLActivity2.T, renewalOfDLActivity.S1(), renewalOfDLActivity2.K, renewalOfDLActivity2.L, renewalOfDLActivity2.P, renewalOfDLActivity2.Q, renewalOfDLActivity2.R, renewalOfDLActivity2.S, renewalOfDLActivity.a2());
                        } catch (Exception unused3) {
                            str = str2;
                            i10 = R.string.unable_to_get_details;
                            renewalOfDLActivity.P1().Q.c(false);
                            renewalOfDLActivity2.O2(renewalOfDLActivity.V1().b(str, renewalOfDLActivity2.getString(i10)));
                        }
                    }
                }
            } else {
                String str8 = "service_is_not_present";
                renewalOfDLActivity2 = renewalOfDLActivity3;
                DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                String reqStatus = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                if (reqStatus != null) {
                    if (reqStatus.length() != 0) {
                        DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        if (dlSubmitresult4 != null) {
                            str3 = dlSubmitresult4.getReqStatus();
                        }
                        l.c(str3);
                        renewalOfDLActivity2.O2(str3);
                        return;
                    }
                }
                ld.c V1 = renewalOfDLActivity.V1();
                i10 = R.string.unable_to_get_details;
                try {
                    str = str8;
                    try {
                        renewalOfDLActivity2.O2(V1.b(str, renewalOfDLActivity2.getString(R.string.unable_to_get_details)));
                    } catch (Exception unused4) {
                    }
                } catch (Exception unused5) {
                    str = str8;
                    renewalOfDLActivity.P1().Q.c(false);
                    renewalOfDLActivity2.O2(renewalOfDLActivity.V1().b(str, renewalOfDLActivity2.getString(i10)));
                }
            }
        } catch (Exception unused6) {
            i10 = R.string.unable_to_get_details;
            str = "service_is_not_present";
            renewalOfDLActivity2 = renewalOfDLActivity3;
            renewalOfDLActivity.P1().Q.c(false);
            renewalOfDLActivity2.O2(renewalOfDLActivity.V1().b(str, renewalOfDLActivity2.getString(i10)));
        }
    }

    private final void L1() {
        u uVar = new u();
        ArrayList arrayList = new ArrayList();
        uVar.f20234e = arrayList;
        arrayList.add(0, new AppCatPojo("0", "Select Category"));
        ((ArrayList) uVar.f20234e).add(1, new AppCatPojo("G", "General"));
        ((ArrayList) uVar.f20234e).add(2, new AppCatPojo("R", "Repatriate"));
        ((ArrayList) uVar.f20234e).add(3, new AppCatPojo("T", "Refugees"));
        ((ArrayList) uVar.f20234e).add(4, new AppCatPojo("X", "Ex-Servicemen"));
        ((ArrayList) uVar.f20234e).add(5, new AppCatPojo("F", "Foreigners (Not Diplomats)"));
        ((ArrayList) uVar.f20234e).add(6, new AppCatPojo("D", "Diplomats (Foreigner)"));
        ((ArrayList) uVar.f20234e).add(7, new AppCatPojo("O", "OCI"));
        ((ArrayList) uVar.f20234e).add(8, new AppCatPojo("P", "Differently Abled"));
        P1().O.setAdapter(new oi.a(this, (ArrayList) uVar.f20234e));
        int size = ((ArrayList) uVar.f20234e).size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            } else if (l.a(q.B0(y2().a()).toString(), q.B0(((AppCatPojo) ((ArrayList) uVar.f20234e).get(i10)).getAppCode()).toString())) {
                P1().O.setSelection(i10);
                break;
            } else {
                i10++;
            }
        }
        P1().O.setOnItemSelectedListener(new a(this, uVar));
        if (p.p(this.f22298t0, "S", false, 2, (Object) null)) {
            P1().O.setEnabled(true);
        } else {
            P1().O.setEnabled(l.a(this.f22301w0, "0"));
        }
    }

    /* access modifiers changed from: private */
    public static final void L2(RenewalOfDLActivity renewalOfDLActivity, String str) {
        l.f(renewalOfDLActivity, "this$0");
        renewalOfDLActivity.P1().Q.c(false);
        renewalOfDLActivity.O2(renewalOfDLActivity.V1().b("service_is_not_present", renewalOfDLActivity.getString(R.string.unable_to_get_details)));
    }

    /* access modifiers changed from: private */
    public final ResultItemSubmit M1(ResultX resultX) {
        ServicesRequested servicesRequested = r0;
        ServicesRequested servicesRequested2 = new ServicesRequested("514", "", "515", "", "", (String) null, (String) null, (String) null, (String) null, (String) null, 992, (cm.g) null);
        return new ResultItemSubmit(resultX.getFatherName(), resultX.getDateofBirth(), resultX.getNote2(), resultX.getNTValidities(), resultX.getNote3(), resultX.getNote4(), resultX.getApplicationNo(), resultX.getApplicantAddress(), resultX.getDlno(), resultX.getReferenceLink(), resultX.getBarCode(), resultX.getApplicantGender(), servicesRequested, resultX.getDLCOVNames(), resultX.getDocumentaryProofsRequired(), resultX.getRtoLocation(), resultX.getApplicantname(), resultX.getNote1(), "", "", resultX.getBloodGroup(), resultX.getBloodGroup(), "", resultX.isFaceless(), resultX.getLlReqforRetestMsg());
    }

    /* access modifiers changed from: private */
    public static final void M2(RenewalOfDLActivity renewalOfDLActivity, View view) {
        l.f(renewalOfDLActivity, "this$0");
        Intent intent = new Intent(renewalOfDLActivity, DlServiceDetailsActivity.class);
        intent.putExtra("DL", renewalOfDLActivity.K);
        intent.putExtra("dob", renewalOfDLActivity.L);
        intent.putExtra("DLDetails", renewalOfDLActivity.S1());
        intent.putExtra("Mobile_no", renewalOfDLActivity.P);
        intent.putExtra("lastEndorsedRTO", renewalOfDLActivity.Q);
        intent.putExtra("lastEndorsedState", renewalOfDLActivity.R);
        intent.putExtra("lastEndorsedRTOCode", renewalOfDLActivity.T);
        intent.putExtra("lastEndorseStateCode", renewalOfDLActivity.S);
        intent.putExtra("whatServiceRequired", renewalOfDLActivity.Z);
        renewalOfDLActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void N2(RenewalOfDLActivity renewalOfDLActivity, View view) {
        l.f(renewalOfDLActivity, "this$0");
        renewalOfDLActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void P2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void Q2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new bk.c(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void R2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final ck.a T2() {
        SelectRenewalCoalist selectRenewalCoalist = new SelectRenewalCoalist("RE-VALIDATION OF EXPIRED DL", "CHANGE OF ADDRESS IN DL");
        ArrayList arrayList = new ArrayList();
        int size = S1().getDlcovs().size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(String.valueOf(S1().getDlcovs().get(i10).getDcCovcd()));
        }
        String obj = q.B0(S1().getDlobj().getDlLicno()).toString();
        String bioDob = S1().getBioObj().getBioDob();
        String obj2 = q.B0(this.T.toString()).toString();
        String str = this.P;
        l.c(str);
        String str2 = this.f22282d0;
        String str3 = str2;
        l.c(str2);
        String str4 = this.f22283e0;
        String str5 = str4;
        l.c(str4);
        String str6 = this.f22284f0;
        String str7 = str6;
        l.c(str6);
        String str8 = this.f22285g0;
        l.c(str8);
        String str9 = this.f22286h0;
        String str10 = str9;
        l.c(str9);
        String str11 = this.f22287i0;
        String str12 = str11;
        l.c(str11);
        String str13 = this.f22288j0;
        String str14 = str13;
        l.c(str13);
        String str15 = this.f22289k0;
        String str16 = str15;
        l.c(str15);
        String str17 = this.f22290l0;
        String str18 = str17;
        l.c(str17);
        String str19 = this.f22291m0;
        String str20 = str19;
        l.c(str19);
        String str21 = this.f22292n0;
        String str22 = str21;
        l.c(str21);
        String str23 = this.f22293o0;
        String str24 = str23;
        l.c(str23);
        String str25 = this.f22294p0;
        String str26 = str25;
        l.c(str25);
        String str27 = this.f22295q0;
        String str28 = str27;
        l.c(str27);
        String str29 = this.f22296r0;
        String str30 = str29;
        l.c(str29);
        String str31 = this.f22297s0;
        l.c(str31);
        return new ck.a(obj, bioDob, obj2, "G", str, selectRenewalCoalist, arrayList, "NA", "N", "B", str3, str5, str7, str8, str10, str12, str14, str16, str18, str20, str22, str24, str26, str28, str30, str31);
    }

    /* access modifiers changed from: private */
    public final bk.m U2() {
        SelectRenewalDLlist selectRenewalDLlist = new SelectRenewalDLlist("RE-VALIDATION OF EXPIRED DL");
        ArrayList arrayList = new ArrayList();
        int size = S1().getDlcovs().size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(String.valueOf(S1().getDlcovs().get(i10).getDcCovcd()));
        }
        String obj = q.B0(S1().getDlobj().getDlLicno()).toString();
        String bioDob = S1().getBioObj().getBioDob();
        String obj2 = q.B0(this.T.toString()).toString();
        String str = this.P;
        l.c(str);
        return new bk.m(obj, bioDob, obj2, "G", str, selectRenewalDLlist, arrayList);
    }

    private final void V2() {
        Intent intent;
        String str;
        String str2;
        String str3;
        if (l.a(this.f22301w0, "0")) {
            TextView textView = P1().f28952b0;
            l.e(textView, "txtAppCategory");
            if (textView.getVisibility() == 0) {
                O2(getString(R.string.sel_app_category));
                return;
            }
        }
        Class<CombineReq> cls = CombineReq.class;
        if (g2().size() > this.L0) {
            try {
                CombineReq combineReq = (CombineReq) new i7.d().j(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", ""), cls);
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
                combineReq2.setDupDlReasonName(combineReq.getDupDlReasonName());
                combineReq2.setDupDlReasonCode(combineReq.getDupDlReasonCode());
                combineReq2.setWilltoDonateOrgans(combineReq.getWilltoDonateOrgans());
                combineReq2.setDlHolderAltMobMum(combineReq.getDlHolderAltMobMum());
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
                edit.putString("MultiService", new i7.d().t(combineReq2));
                edit.commit();
                if (l.a(g2().get(this.L0), V1().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                    setIntent(new Intent(this, DLDuplicateActivity.class));
                    intent = getIntent();
                    l.e(intent, "getIntent(...)");
                    str = this.T;
                    str2 = this.R;
                    str3 = "513";
                } else {
                    Class<RenewalOfDLActivity> cls2 = RenewalOfDLActivity.class;
                    if (l.a(g2().get(this.L0), V1().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        setIntent(new Intent(this, cls2));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.T;
                        str2 = this.R;
                        str3 = "514";
                    } else if (l.a(g2().get(this.L0), V1().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        setIntent(new Intent(this, cls2));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.T;
                        str2 = this.R;
                        str3 = "537";
                    } else if (l.a(g2().get(this.L0), V1().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                        setIntent(new Intent(this, ChangeOfAddressActivity.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.T;
                        str2 = this.R;
                        str3 = "515";
                    } else if (l.a(g2().get(this.L0), V1().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                        setIntent(new Intent(this, DLReplecementActivity.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.T;
                        str2 = this.R;
                        str3 = "516";
                    } else if (l.a(g2().get(this.L0), V1().b("check_dl_serv_extract_dl", "DL Extract"))) {
                        setIntent(new Intent(this, DLExtractActivity.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.T;
                        str2 = this.R;
                        str3 = "523";
                    } else if (l.a(g2().get(this.L0), V1().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                        setIntent(new Intent(this, HillReligion.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.T;
                        str2 = this.R;
                        str3 = "524";
                    } else if (l.a(g2().get(this.L0), V1().b("change_name_dl", "Change of Name in DL"))) {
                        setIntent(new Intent(this, ChangeOfName.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.T;
                        str2 = this.R;
                        str3 = "526";
                    } else if (l.a(g2().get(this.L0), V1().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                        setIntent(new Intent(this, DobChangeActivity.class));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.T;
                        str2 = this.R;
                        str3 = "548";
                    } else {
                        return;
                    }
                }
                G2(intent, str, str2, str3, g2());
            } catch (Exception unused) {
            }
        } else {
            if (com.nic.mparivahan.a.f9624a.a(this)) {
                String obj = q.B0(new km.f("[^A-Za-z0-9 ]").b(S1().getDlobj().getDlLicno(), "")).toString();
                CombineReq combineReq3 = (CombineReq) new i7.d().j(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", ""), cls);
                P1().Q.c(true);
                ArrayList arrayList = new ArrayList();
                int size = S1().getDlcovs().size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(String.valueOf(S1().getDlcovs().get(i10).getDcCovcd()));
                }
                ab.d dVar = this.N0;
                if (dVar == null) {
                    l.v("mCombineViewModel");
                    dVar = null;
                }
                ab.d dVar2 = dVar;
                boolean z10 = this.J0;
                String str4 = this.f22298t0;
                l.c(str4);
                String str5 = this.f22299u0;
                l.c(str5);
                ArrayList g22 = g2();
                String str6 = this.f22301w0;
                String dlHolderAltMobMum = combineReq3.getDlHolderAltMobMum();
                l.c(dlHolderAltMobMum);
                l.c(obj);
                String bioDob = S1().getBioObj().getBioDob();
                l.c(bioDob);
                String str7 = this.T;
                String willtoDonateOrgans = combineReq3.getWilltoDonateOrgans();
                l.c(willtoDonateOrgans);
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
                String str8 = this.P;
                l.c(str8);
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
                String dupDlReasonName = combineReq3.getDupDlReasonName();
                l.c(dupDlReasonName);
                String dupDlReasonCode = combineReq3.getDupDlReasonCode();
                l.c(dupDlReasonCode);
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
                dVar2.g(z10, arrayList, str4, str5, g22, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", str6, dlHolderAltMobMum, obj, bioDob, str7, willtoDonateOrgans, relationType, valueOf, conDlReasonName, dlHolderNaturalName, conEffdate, applFirstName, applLastName, relFirstName, relLastName, str8, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, dleDlReasonCode, dleDlReasonName, dupDlReasonName, dupDlReasonCode, applDateOfBirth, codobDlReasonName, codobDlReasonCode, declaringcheck, hillcertificate, hillissueDate, hillvalidFrom, hillvalidTo, hilldrivingschool, hillissby, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, isDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, y2().f(), y2().g(), y2().e(), y2().h());
                return;
            }
            Toast.makeText(getApplicationContext(), V1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
    }

    public final HashMap A2() {
        return this.Z;
    }

    public final String N1() {
        return this.f22299u0;
    }

    public final String O1() {
        return this.f22301w0;
    }

    public final void O2(String str) {
        try {
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.msg_dialog);
            Window window = dialog.getWindow();
            l.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View findViewById = dialog.findViewById(R.id.pop_up_msg);
            l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            View findViewById2 = dialog.findViewById(R.id.pop_up_close);
            l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById).setText(str);
            ((TextView) findViewById2).setOnClickListener(new j(dialog));
            dialog.show();
        } catch (Exception unused) {
        }
    }

    public final v2 P1() {
        v2 v2Var = this.J;
        if (v2Var != null) {
            return v2Var;
        }
        l.v("binding");
        return null;
    }

    public final String Q1() {
        return this.f22298t0;
    }

    public final String R1() {
        try {
            String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            l.e(format, "format(...)");
            return format;
        } catch (Exception e10) {
            e10.printStackTrace();
            return " ";
        }
    }

    public final DldetobjX S1() {
        DldetobjX dldetobjX = this.N;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        l.v("dlDetails");
        return null;
    }

    public final void S2() {
        String b10 = V1().b("nex_parivahan", getString(R.string.app_name));
        l.c(b10);
        String b11 = V1().b("label_want_to_proceed", getString(R.string.are_you_want_to_proceed));
        l.c(b11);
        oi.g.n1(this, b10, b11, 0, (String) null, (String) null, new f(this), 24, (Object) null);
    }

    public final String T1() {
        return this.K;
    }

    public final String U1() {
        return this.L;
    }

    public final ld.c V1() {
        ld.c cVar = this.P0;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final String W1() {
        return this.T;
    }

    public final void W2(String str) {
        l.f(str, "<set-?>");
        this.f22301w0 = str;
    }

    public final String X1() {
        return this.Q;
    }

    public final void X2(v2 v2Var) {
        l.f(v2Var, "<set-?>");
        this.J = v2Var;
    }

    public final String Y1() {
        return this.R;
    }

    public final void Y2(DldetobjX dldetobjX) {
        l.f(dldetobjX, "<set-?>");
        this.N = dldetobjX;
    }

    public final String Z1() {
        return this.S;
    }

    public final void Z2(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.P0 = cVar;
    }

    public final ArrayList a2() {
        ArrayList arrayList = this.I0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("listHeaderSteps");
        return null;
    }

    public final void a3(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.I0 = arrayList;
    }

    public final CombineServiceInterface b2() {
        CombineServiceInterface combineServiceInterface = this.O0;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        l.v("mCombineServiceInterface");
        return null;
    }

    public final void b3(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.O = linearLayout;
    }

    public final RenCOAInterface c2() {
        RenCOAInterface renCOAInterface = this.f22281c0;
        if (renCOAInterface != null) {
            return renCOAInterface;
        }
        l.v("mRenCOAInterface");
        return null;
    }

    public final void c3(CombineServiceInterface combineServiceInterface) {
        l.f(combineServiceInterface, "<set-?>");
        this.O0 = combineServiceInterface;
    }

    public final qi.d d2() {
        qi.d dVar = this.f22280b0;
        if (dVar != null) {
            return dVar;
        }
        l.v("mRenCOAVM");
        return null;
    }

    public final void d3(Context context) {
        l.f(context, "<set-?>");
        this.G0 = context;
    }

    public final ld.g e2() {
        ld.g gVar = this.f22300v0;
        if (gVar != null) {
            return gVar;
        }
        l.v("mSessionmanger");
        return null;
    }

    public final void e3(RenCOAInterface renCOAInterface) {
        l.f(renCOAInterface, "<set-?>");
        this.f22281c0 = renCOAInterface;
    }

    public final String f2() {
        return this.P;
    }

    public final void f3(qi.d dVar) {
        l.f(dVar, "<set-?>");
        this.f22280b0 = dVar;
    }

    public final ArrayList g2() {
        ArrayList arrayList = this.H0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("multiListName");
        return null;
    }

    public final void g3(ld.g gVar) {
        l.f(gVar, "<set-?>");
        this.f22300v0 = gVar;
    }

    public final String h2() {
        return this.f22287i0;
    }

    public final void h3(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.H0 = arrayList;
    }

    public final String i2() {
        return this.f22282d0;
    }

    public final void i3(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.f22279a0 = fVar;
    }

    public final String j2() {
        return this.f22284f0;
    }

    public final String k2() {
        return this.f22289k0;
    }

    public final String l2() {
        return this.f22288j0;
    }

    public final String m2() {
        return this.f22283e0;
    }

    public final String n2() {
        return this.f22286h0;
    }

    public final String o2() {
        return this.f22285g0;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_dl_renewal);
        l.e(f10, "setContentView(...)");
        X2((v2) f10);
        d3(this);
        g3(new ld.g(this));
        Z2(new ld.c(this));
        v9.e.f17509a.E1(this, P1());
        e3(RenCOAInterface.f21665a.a(this));
        i3(new ld.f(this));
        View findViewById = findViewById(R.id.ll_home);
        l.e(findViewById, "findViewById(...)");
        b3((LinearLayout) findViewById);
        this.W = (bk.a) new u0(this).a(bk.a.class);
        B2();
        H2();
        P1().f28953c0.setPaintFlags(P1().f28953c0.getPaintFlags() | 8);
        P1().f28953c0.setOnClickListener(new bk.b(this));
        L1();
        if (l.a(y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            J2();
        }
        P1().E.f29577d.setOnClickListener(new bk.d(this));
        P1().E.f29578e.setVisibility(8);
        P1().D.f25961g.setText(y2().i());
        P1().f28953c0.setVisibility(0);
        P1().f28957y.setVisibility(0);
    }

    public final String p2() {
        return this.f22295q0;
    }

    public final String q2() {
        return this.f22290l0;
    }

    public final String r2() {
        return this.f22292n0;
    }

    public final String s2() {
        return this.f22297s0;
    }

    public final String t2() {
        return this.f22296r0;
    }

    public final String u2() {
        return this.f22291m0;
    }

    public final String v2() {
        return this.f22294p0;
    }

    public final String w2() {
        return this.f22293o0;
    }

    public final String x2() {
        return this.V;
    }

    public final ld.f y2() {
        ld.f fVar = this.f22279a0;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final String z2() {
        return this.U;
    }
}
