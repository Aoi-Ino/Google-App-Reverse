package com.nic.mparivahan.dlservices.ui.idp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowMetrics;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.m;
import cm.u;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineServiceInterface;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.nic.mparivahan.dlservices.data.model.idp.GetIdpCovGradesResponse;
import com.nic.mparivahan.dlservices.data.model.idp.GetNationsCodeItem;
import com.nic.mparivahan.dlservices.data.model.idp.GetNationsToApplyForResponse;
import com.nic.mparivahan.dlservices.data.model.idp.IdpGenSubmit;
import com.nic.mparivahan.dlservices.data.model.idp.IdpSubmitRequest;
import com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem;
import com.nic.mparivahan.dlservices.data.model.idp.selectDLlist;
import com.nic.mparivahan.dlservices.ui.idp.a;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kk.e;
import ni.w4;
import org.json.JSONArray;
import pl.x;
import uj.a0;
import uj.c0;
import uj.d0;
import uj.i;
import uj.j;
import uj.k;
import uj.n;
import uj.o;
import uj.p;
import uj.q;
import uj.r;
import uj.s;
import uj.t;
import uj.v;
import uj.w;
import uj.y;
import uj.z;
import v9.e;

public final class DLIdpActivity extends oi.g implements a.C0274a {
    private String A0 = "";
    private String B0 = "";
    private String C0 = "";
    private String D0 = "";
    private ArrayList E0;
    private String F0 = "0";
    public ld.c G0;
    private String H0 = "N";
    private String I0 = "N";
    /* access modifiers changed from: private */
    public w4 J;
    private String J0 = "";
    private d0 K;
    private String K0 = "";
    public ld.f L;
    private String L0 = "";
    public DldetobjX M;
    private String M0 = "";
    private String N;
    private String N0 = "";
    private String O;
    private String O0 = "";
    private String P;
    private String P0 = "N";
    private HashMap Q = new HashMap();
    public ArrayList Q0;
    /* access modifiers changed from: private */
    public String R = "";
    public ArrayList R0;
    private String S = "";
    private boolean S0;
    private String T = "";
    private int T0;
    private String U = "";
    private int U0;
    /* access modifiers changed from: private */
    public ArrayList V = new ArrayList();
    private ab.d V0;
    /* access modifiers changed from: private */
    public ArrayList W = new ArrayList();
    public CombineServiceInterface W0;
    private ArrayList X = new ArrayList();
    private List Y;
    /* access modifiers changed from: private */
    public String Z = "";
    /* access modifiers changed from: private */

    /* renamed from: a0  reason: collision with root package name */
    public String f22180a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private ArrayList f22181b0 = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c0  reason: collision with root package name */
    public String f22182c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    private String f22183d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private Calendar f22184e0 = Calendar.getInstance();

    /* renamed from: f0  reason: collision with root package name */
    private String f22185f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    private String f22186g0 = "N";

    /* renamed from: h0  reason: collision with root package name */
    private String f22187h0 = "0";

    /* renamed from: i0  reason: collision with root package name */
    private String f22188i0 = "N";

    /* renamed from: j0  reason: collision with root package name */
    public ld.g f22189j0;

    /* renamed from: k0  reason: collision with root package name */
    private ArrayList f22190k0 = new ArrayList();

    /* renamed from: l0  reason: collision with root package name */
    private String f22191l0;

    /* renamed from: m0  reason: collision with root package name */
    private String f22192m0;

    /* renamed from: n0  reason: collision with root package name */
    private String f22193n0 = "";

    /* renamed from: o0  reason: collision with root package name */
    private String f22194o0 = "";

    /* renamed from: p0  reason: collision with root package name */
    private String f22195p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    private String f22196q0 = "";

    /* renamed from: r0  reason: collision with root package name */
    private String f22197r0 = "";

    /* renamed from: s0  reason: collision with root package name */
    private String f22198s0 = "";

    /* renamed from: t0  reason: collision with root package name */
    private String f22199t0 = "";

    /* renamed from: u0  reason: collision with root package name */
    private String f22200u0 = "";

    /* renamed from: v0  reason: collision with root package name */
    private String f22201v0 = "";

    /* renamed from: w0  reason: collision with root package name */
    private String f22202w0 = "";

    /* renamed from: x0  reason: collision with root package name */
    private String f22203x0 = "";

    /* renamed from: y0  reason: collision with root package name */
    private String f22204y0 = "";

    /* renamed from: z0  reason: collision with root package name */
    private String f22205z0 = "";

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLIdpActivity f22206e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f22207f;

        a(DLIdpActivity dLIdpActivity, u uVar) {
            this.f22206e = dLIdpActivity;
            this.f22207f = uVar;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            this.f22206e.n3(((AppCatPojo) ((ArrayList) this.f22207f.f20234e).get(i10)).getAppCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLIdpActivity f22208e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DLIdpActivity dLIdpActivity) {
            super(1);
            this.f22208e = dLIdpActivity;
        }

        public final void b(GetNationsToApplyForResponse getNationsToApplyForResponse) {
            try {
                if (p.p(getNationsToApplyForResponse.getStatusCode(), "00", false, 2, (Object) null)) {
                    this.f22208e.k3(getNationsToApplyForResponse.getNationsMaster());
                    return;
                }
                DLIdpActivity dLIdpActivity = this.f22208e;
                dLIdpActivity.i3(dLIdpActivity, dLIdpActivity.n2().b("no_details", this.f22208e.getString(R.string.no_Details_are_avail)));
            } catch (Exception unused) {
                DLIdpActivity dLIdpActivity2 = this.f22208e;
                dLIdpActivity2.i3(dLIdpActivity2, dLIdpActivity2.n2().b("service_is_not_present", this.f22208e.getString(R.string.no_Details_are_avail)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetNationsToApplyForResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLIdpActivity f22209e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DLIdpActivity dLIdpActivity) {
            super(1);
            this.f22209e = dLIdpActivity;
        }

        public final void b(GetIdpCovGradesResponse getIdpCovGradesResponse) {
            try {
                w4 w4Var = null;
                if (p.p(getIdpCovGradesResponse.getStatusCode(), "00", false, 2, (Object) null)) {
                    this.f22209e.s3((ArrayList) getIdpCovGradesResponse.getIdpcovgrades());
                    return;
                }
                DLIdpActivity dLIdpActivity = this.f22209e;
                String statusDesc = getIdpCovGradesResponse.getStatusDesc();
                w4 Z1 = this.f22209e.J;
                if (Z1 == null) {
                    l.v("mBinding");
                } else {
                    w4Var = Z1;
                }
                dLIdpActivity.t1(statusDesc, w4Var.m());
            } catch (Exception unused) {
                DLIdpActivity dLIdpActivity2 = this.f22209e;
                dLIdpActivity2.i3(dLIdpActivity2, dLIdpActivity2.n2().b("service_is_not_present", this.f22209e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetIdpCovGradesResponse) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLIdpActivity f22210e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DLIdpActivity dLIdpActivity) {
            super(1);
            this.f22210e = dLIdpActivity;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:19|20|21|22|23|(1:25)|26|59) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00aa */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00ba A[Catch:{ Exception -> 0x015a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r28) {
            /*
                r27 = this;
                r0 = r27
                java.lang.String r1 = "mBinding"
                r2 = 0
                r3 = 0
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r4 = r0.f22210e     // Catch:{ Exception -> 0x015a }
                ni.w4 r4 = r4.J     // Catch:{ Exception -> 0x015a }
                if (r4 != 0) goto L_0x0012
                cm.l.v(r1)     // Catch:{ Exception -> 0x015a }
                r4 = r3
            L_0x0012:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r4 = r4.T     // Catch:{ Exception -> 0x015a }
                r4.c(r2)     // Catch:{ Exception -> 0x015a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r4 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x015a }
                if (r4 == 0) goto L_0x0022
                java.lang.String r4 = r4.getStatusCode()     // Catch:{ Exception -> 0x015a }
                goto L_0x0023
            L_0x0022:
                r4 = r3
            L_0x0023:
                java.lang.String r5 = "00"
                r6 = 2
                boolean r4 = km.p.p(r4, r5, r2, r6, r3)     // Catch:{ Exception -> 0x015a }
                if (r4 == 0) goto L_0x00fa
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r4 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x015a }
                if (r4 == 0) goto L_0x0184
                java.util.List r4 = r4.getResult()     // Catch:{ Exception -> 0x015a }
                if (r4 == 0) goto L_0x0184
                java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ Exception -> 0x015a }
                boolean r4 = r4.isEmpty()     // Catch:{ Exception -> 0x015a }
                r5 = 1
                r4 = r4 ^ r5
                if (r4 != r5) goto L_0x0184
                com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r6 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x015a }
                r6.<init>()     // Catch:{ Exception -> 0x015a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r4 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x015a }
                java.util.List r4 = r4.getResult()     // Catch:{ Exception -> 0x015a }
                java.lang.Object r4 = r4.get(r2)     // Catch:{ Exception -> 0x015a }
                r8 = r4
                com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r8 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r8     // Catch:{ Exception -> 0x015a }
                if (r8 == 0) goto L_0x0184
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r7 = r0.f22210e     // Catch:{ Exception -> 0x015a }
                com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r9 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x00aa }
                java.lang.String r11 = "1234"
                java.lang.String r12 = "S"
                java.lang.String r13 = r8.getApplicationDate()     // Catch:{ Exception -> 0x00aa }
                java.lang.String r4 = r8.getApplicationNo()     // Catch:{ Exception -> 0x00aa }
                cm.l.c(r4)     // Catch:{ Exception -> 0x00aa }
                long r14 = java.lang.Long.parseLong(r4)     // Catch:{ Exception -> 0x00aa }
                ld.g r4 = r7.u2()     // Catch:{ Exception -> 0x00aa }
                java.lang.String r4 = r4.k()     // Catch:{ Exception -> 0x00aa }
                int r16 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x00aa }
                java.lang.String r17 = r8.getDateofBirth()     // Catch:{ Exception -> 0x00aa }
                java.lang.String r18 = r8.getDlno()     // Catch:{ Exception -> 0x00aa }
                cm.l.c(r18)     // Catch:{ Exception -> 0x00aa }
                java.lang.String r19 = "N"
                java.lang.String r20 = "N"
                java.lang.String r21 = r8.getApplicantGender()     // Catch:{ Exception -> 0x00aa }
                java.lang.String r22 = r7.v2()     // Catch:{ Exception -> 0x00aa }
                cm.l.c(r22)     // Catch:{ Exception -> 0x00aa }
                r23 = 0
                java.lang.String r24 = r7.x2()     // Catch:{ Exception -> 0x00aa }
                java.lang.String r25 = r7.R     // Catch:{ Exception -> 0x00aa }
                cm.l.c(r25)     // Catch:{ Exception -> 0x00aa }
                java.lang.String r26 = r7.q2()     // Catch:{ Exception -> 0x00aa }
                r10 = r7
                r9.a(r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x00aa }
            L_0x00aa:
                ld.f r4 = r7.y2()     // Catch:{ Exception -> 0x015a }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x015a }
                java.lang.String r5 = "950"
                boolean r4 = cm.l.a(r4, r5)     // Catch:{ Exception -> 0x015a }
                if (r4 != 0) goto L_0x00d1
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x015a }
                r4.<init>()     // Catch:{ Exception -> 0x015a }
                r7.u3(r4)     // Catch:{ Exception -> 0x015a }
                java.util.ArrayList r4 = r7.w2()     // Catch:{ Exception -> 0x015a }
                ld.f r5 = r7.y2()     // Catch:{ Exception -> 0x015a }
                java.lang.String r5 = r5.i()     // Catch:{ Exception -> 0x015a }
                r4.add(r5)     // Catch:{ Exception -> 0x015a }
            L_0x00d1:
                java.lang.String r9 = r7.R     // Catch:{ Exception -> 0x015a }
                com.nic.mparivahan.Dl.Model.DldetobjX r10 = r7.k2()     // Catch:{ Exception -> 0x015a }
                java.lang.String r11 = r7.l2()     // Catch:{ Exception -> 0x015a }
                java.lang.String r12 = r7.m2()     // Catch:{ Exception -> 0x015a }
                java.lang.String r13 = r7.v2()     // Catch:{ Exception -> 0x015a }
                java.lang.String r14 = r7.o2()     // Catch:{ Exception -> 0x015a }
                java.lang.String r15 = r7.p2()     // Catch:{ Exception -> 0x015a }
                java.lang.String r16 = r7.q2()     // Catch:{ Exception -> 0x015a }
                java.util.ArrayList r17 = r7.w2()     // Catch:{ Exception -> 0x015a }
                r6.E2(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x015a }
                goto L_0x0184
            L_0x00fa:
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r4 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x015a }
                if (r4 == 0) goto L_0x0105
                java.lang.String r4 = r4.getStatusCode()     // Catch:{ Exception -> 0x015a }
                goto L_0x0106
            L_0x0105:
                r4 = r3
            L_0x0106:
                java.lang.String r5 = "01"
                boolean r4 = km.p.p(r4, r5, r2, r6, r3)     // Catch:{ Exception -> 0x015a }
                if (r4 == 0) goto L_0x0127
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r4 = r0.f22210e     // Catch:{ Exception -> 0x015a }
                java.lang.String r5 = "DL holder does not have proper data"
                r4.i3(r4, r5)     // Catch:{ Exception -> 0x015a }
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r4 = r0.f22210e     // Catch:{ Exception -> 0x015a }
                ni.w4 r4 = r4.J     // Catch:{ Exception -> 0x015a }
                if (r4 != 0) goto L_0x0121
                cm.l.v(r1)     // Catch:{ Exception -> 0x015a }
                r4 = r3
            L_0x0121:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r4 = r4.T     // Catch:{ Exception -> 0x015a }
                r4.c(r2)     // Catch:{ Exception -> 0x015a }
                goto L_0x0184
            L_0x0127:
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r4 = r0.f22210e     // Catch:{ Exception -> 0x015a }
                ni.w4 r4 = r4.J     // Catch:{ Exception -> 0x015a }
                if (r4 != 0) goto L_0x0133
                cm.l.v(r1)     // Catch:{ Exception -> 0x015a }
                r4 = r3
            L_0x0133:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r4 = r4.T     // Catch:{ Exception -> 0x015a }
                r4.c(r2)     // Catch:{ Exception -> 0x015a }
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r4 = r0.f22210e     // Catch:{ Exception -> 0x015a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r5 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x015a }
                if (r5 == 0) goto L_0x0145
                java.lang.String r5 = r5.getStatusDesc()     // Catch:{ Exception -> 0x015a }
                goto L_0x0146
            L_0x0145:
                r5 = r3
            L_0x0146:
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r6 = r0.f22210e     // Catch:{ Exception -> 0x015a }
                ni.w4 r6 = r6.J     // Catch:{ Exception -> 0x015a }
                if (r6 != 0) goto L_0x0152
                cm.l.v(r1)     // Catch:{ Exception -> 0x015a }
                r6 = r3
            L_0x0152:
                android.view.View r6 = r6.m()     // Catch:{ Exception -> 0x015a }
                r4.t1(r5, r6)     // Catch:{ Exception -> 0x015a }
                goto L_0x0184
            L_0x015a:
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r4 = r0.f22210e
                ni.w4 r4 = r4.J
                if (r4 != 0) goto L_0x0166
                cm.l.v(r1)
                goto L_0x0167
            L_0x0166:
                r3 = r4
            L_0x0167:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r1 = r3.T
                r1.c(r2)
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r1 = r0.f22210e
                ld.c r2 = r1.n2()
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r3 = r0.f22210e
                r4 = 2132019337(0x7f140889, float:1.9677006E38)
                java.lang.String r3 = r3.getString(r4)
                java.lang.String r4 = "label_log_unbl_sigup"
                java.lang.String r2 = r2.b(r4, r3)
                r1.i3(r1, r2)
            L_0x0184:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity.d.b(com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetAckDetForGivenDLNumberResponse) obj);
            return x.f30437a;
        }
    }

    public static final class e implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f22211a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DLIdpActivity f22212b;

        e(int i10, DLIdpActivity dLIdpActivity) {
            this.f22211a = i10;
            this.f22212b = dLIdpActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r7 = (com.nic.mparivahan.dlservices.data.model.idp.GetNationsCodeItem) r0.get(r7);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f22211a
                r1 = 1
                java.lang.String r2 = ""
                java.lang.String r3 = "mBinding"
                r4 = 0
                if (r0 != r1) goto L_0x0047
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r0 = r5.f22212b
                java.util.ArrayList r0 = r0.W
                if (r0 == 0) goto L_0x001f
                java.lang.Object r7 = r0.get(r7)
                com.nic.mparivahan.dlservices.data.model.idp.GetNationsCodeItem r7 = (com.nic.mparivahan.dlservices.data.model.idp.GetNationsCodeItem) r7
                if (r7 == 0) goto L_0x001f
                java.lang.String r7 = r7.getNationCode()
                goto L_0x0020
            L_0x001f:
                r7 = r4
            L_0x0020:
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r0 = r5.f22212b
                ni.w4 r0 = r0.J
                if (r0 != 0) goto L_0x002c
                cm.l.v(r3)
                goto L_0x002d
            L_0x002c:
                r4 = r0
            L_0x002d:
                android.widget.EditText r0 = r4.E
                r0.setText(r6)
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r6 = r5.f22212b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r6.Z = r7
                goto L_0x0086
            L_0x0047:
                r1 = 2
                if (r0 != r1) goto L_0x0086
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r0 = r5.f22212b
                java.util.ArrayList r0 = r0.V
                if (r0 == 0) goto L_0x005f
                java.lang.Object r7 = r0.get(r7)
                com.nic.mparivahan.dlservices.data.model.idp.GetNationsCodeItem r7 = (com.nic.mparivahan.dlservices.data.model.idp.GetNationsCodeItem) r7
                if (r7 == 0) goto L_0x005f
                java.lang.String r7 = r7.getNationCode()
                goto L_0x0060
            L_0x005f:
                r7 = r4
            L_0x0060:
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r0 = r5.f22212b
                ni.w4 r0 = r0.J
                if (r0 != 0) goto L_0x006c
                cm.l.v(r3)
                goto L_0x006d
            L_0x006c:
                r4 = r0
            L_0x006d:
                android.widget.EditText r0 = r4.C
                r0.setText(r6)
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r6 = r5.f22212b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r6.f22182c0 = r7
            L_0x0086:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity.e.a(java.lang.String, int):void");
        }
    }

    public static final class f implements e.b {
        f() {
        }

        public void a(String str, int i10) {
        }
    }

    public static final class g implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DLIdpActivity f22213a;

        g(DLIdpActivity dLIdpActivity) {
            this.f22213a = dLIdpActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r4 = (com.nic.mparivahan.dlservices.data.model.idp.GetNationsCodeItem) r0.get(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r3, int r4) {
            /*
                r2 = this;
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r0 = r2.f22213a
                java.util.ArrayList r0 = r0.V
                r1 = 0
                if (r0 == 0) goto L_0x0016
                java.lang.Object r4 = r0.get(r4)
                com.nic.mparivahan.dlservices.data.model.idp.GetNationsCodeItem r4 = (com.nic.mparivahan.dlservices.data.model.idp.GetNationsCodeItem) r4
                if (r4 == 0) goto L_0x0016
                java.lang.String r4 = r4.getNationCode()
                goto L_0x0017
            L_0x0016:
                r4 = r1
            L_0x0017:
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r0 = r2.f22213a
                ni.w4 r0 = r0.J
                if (r0 != 0) goto L_0x0025
                java.lang.String r0 = "mBinding"
                cm.l.v(r0)
                goto L_0x0026
            L_0x0025:
                r1 = r0
            L_0x0026:
                android.widget.EditText r0 = r1.H
                r0.setText(r3)
                com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r3 = r2.f22213a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = ""
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.f22180a0 = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity.g.a(java.lang.String, int):void");
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f22214a;

        h(bm.l lVar) {
            l.f(lVar, "function");
            this.f22214a = lVar;
        }

        public final pl.c a() {
            return this.f22214a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22214a.invoke(obj);
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

    private final void A2(boolean z10) {
        w4 w4Var = null;
        if (z10) {
            w4 w4Var2 = this.J;
            if (w4Var2 == null) {
                l.v("mBinding");
            } else {
                w4Var = w4Var2;
            }
            w4Var.B.setVisibility(0);
            return;
        }
        w4 w4Var3 = this.J;
        if (w4Var3 == null) {
            l.v("mBinding");
            w4Var3 = null;
        }
        w4Var3.B.setVisibility(8);
        w4 w4Var4 = this.J;
        if (w4Var4 == null) {
            l.v("mBinding");
        } else {
            w4Var = w4Var4;
        }
        w4Var.B.setText("");
    }

    private final void B2() {
        int i10;
        String str;
        CustomWegetLayout customWegetLayout;
        ld.c n22;
        String str2;
        String str3;
        TextView textView;
        String str4;
        w4 w4Var = null;
        if (getIntent() != null) {
            try {
                this.f22191l0 = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
                this.f22192m0 = String.valueOf(getIntent().getStringExtra("allowAddrChangeAtDlservReqst"));
                String stringExtra = getIntent().getStringExtra("state_value");
                l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.D0 = stringExtra;
                this.N = String.valueOf(getIntent().getStringExtra("DL"));
                this.O = String.valueOf(getIntent().getStringExtra("dob"));
                Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                o3((DldetobjX) serializableExtra);
                this.P = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                String stringExtra2 = getIntent().getStringExtra("lastEndorsedRTOCode");
                l.d(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.R = stringExtra2;
                Serializable serializableExtra2 = getIntent().getSerializableExtra("whatServiceRequired");
                l.d(serializableExtra2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>");
                this.Q = (HashMap) serializableExtra2;
                String stringExtra3 = getIntent().getStringExtra("lastEndorsedRTO");
                l.d(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.S = stringExtra3;
                String stringExtra4 = getIntent().getStringExtra("lastEndorsedState");
                l.d(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.T = stringExtra4;
                String stringExtra5 = getIntent().getStringExtra("lastEndorseStateCode");
                l.d(stringExtra5, "null cannot be cast to non-null type kotlin.String");
                this.U = stringExtra5;
                String stringExtra6 = getIntent().getStringExtra("purCode");
                l.d(stringExtra6, "null cannot be cast to non-null type kotlin.String");
                this.f22187h0 = stringExtra6;
                Serializable serializableExtra3 = getIntent().getSerializableExtra("whatServiceRequired");
                l.d(serializableExtra3, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>");
                this.Q = (HashMap) serializableExtra3;
                w4 w4Var2 = this.J;
                if (w4Var2 == null) {
                    l.v("mBinding");
                    w4Var2 = null;
                }
                w4Var2.f29169w.setText(n2().b("dl_no", "DL No. : ") + ' ' + this.N);
                BioImgObjX bioImgObj = k2().getBioImgObj();
                if ((bioImgObj != null ? bioImgObj.getBiPhoto() : null) == null) {
                    w4 w4Var3 = this.J;
                    if (w4Var3 == null) {
                        l.v("mBinding");
                        w4Var3 = null;
                    }
                    w4Var3.f29157k0.setVisibility(8);
                    w4 w4Var4 = this.J;
                    if (w4Var4 == null) {
                        l.v("mBinding");
                        w4Var4 = null;
                    }
                    w4Var4.A.setVisibility(0);
                } else {
                    w4 w4Var5 = this.J;
                    if (w4Var5 == null) {
                        l.v("mBinding");
                        w4Var5 = null;
                    }
                    w4Var5.f29157k0.setVisibility(0);
                    w4 w4Var6 = this.J;
                    if (w4Var6 == null) {
                        l.v("mBinding");
                        w4Var6 = null;
                    }
                    w4Var6.A.setVisibility(8);
                    w4 w4Var7 = this.J;
                    if (w4Var7 == null) {
                        l.v("mBinding");
                        w4Var7 = null;
                    }
                    w4Var7.f29149c0.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(k2().getBioImgObj().getBiPhoto()));
                }
                String str5 = this.S;
                if (str5 != null) {
                    if (str5.length() != 0) {
                        w4 w4Var8 = this.J;
                        if (w4Var8 == null) {
                            l.v("mBinding");
                            w4Var8 = null;
                        }
                        textView = w4Var8.S;
                        str4 = this.S;
                        textView.setText(str4);
                    }
                }
                w4 w4Var9 = this.J;
                if (w4Var9 == null) {
                    l.v("mBinding");
                    w4Var9 = null;
                }
                textView = w4Var9.S;
                str4 = "NA";
                textView.setText(str4);
            } catch (Exception unused) {
            }
        }
        if (!l.a(this.D0, "same") || p.o(this.f22191l0, "S", true)) {
            this.f22201v0 = String.valueOf(getIntent().getStringExtra("presHouseNo"));
            this.f22202w0 = String.valueOf(getIntent().getStringExtra("presStreet"));
            this.f22203x0 = String.valueOf(getIntent().getStringExtra("presLocation"));
            this.f22204y0 = String.valueOf(getIntent().getStringExtra("presVillageOrTown"));
            this.f22205z0 = String.valueOf(getIntent().getStringExtra("presSubDistrict"));
            this.A0 = String.valueOf(getIntent().getStringExtra("presDistrict"));
            this.B0 = String.valueOf(getIntent().getStringExtra("presState"));
            this.C0 = String.valueOf(getIntent().getStringExtra("presPincode"));
            this.f22193n0 = String.valueOf(getIntent().getStringExtra("perHouseNo"));
            this.f22194o0 = String.valueOf(getIntent().getStringExtra("perStreet"));
            this.f22195p0 = String.valueOf(getIntent().getStringExtra("perLocation"));
            this.f22196q0 = String.valueOf(getIntent().getStringExtra("permVillageOrTown"));
            this.f22197r0 = String.valueOf(getIntent().getStringExtra("perSubDistrict"));
            this.f22198s0 = String.valueOf(getIntent().getStringExtra("perDistrict"));
            this.f22199t0 = String.valueOf(getIntent().getStringExtra("perState"));
            this.f22200u0 = String.valueOf(getIntent().getStringExtra("perPinCode"));
        }
        w4 w4Var10 = this.J;
        if (w4Var10 == null) {
            l.v("mBinding");
            w4Var10 = null;
        }
        w4Var10.f29151e0.f29581h.setText(q.B0(String.valueOf(this.N)).toString());
        w4 w4Var11 = this.J;
        if (w4Var11 == null) {
            l.v("mBinding");
            w4Var11 = null;
        }
        TextView textView2 = w4Var11.f29151e0.f29581h;
        w4 w4Var12 = this.J;
        if (w4Var12 == null) {
            l.v("mBinding");
            w4Var12 = null;
        }
        textView2.setPaintFlags(w4Var12.f29151e0.f29581h.getPaintFlags() | 8);
        if (l.a(y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            this.U0 = getIntent().getIntExtra("serialNo", 0);
            Serializable serializableExtra4 = getIntent().getSerializableExtra("multiList");
            l.d(serializableExtra4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            u3((ArrayList) serializableExtra4);
            Serializable serializableExtra5 = getIntent().getSerializableExtra("listHeaderSteps");
            l.d(serializableExtra5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            q3((ArrayList) serializableExtra5);
            Serializable serializableExtra6 = getIntent().getSerializableExtra("COA");
            l.d(serializableExtra6, "null cannot be cast to non-null type kotlin.Boolean");
            this.S0 = ((Boolean) serializableExtra6).booleanValue();
            r3(CombineServiceInterface.f8704a.a(this));
            this.V0 = (ab.d) new u0((x0) this, (u0.b) new ab.b(new ab.a(s2()))).a(ab.d.class);
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics a10 = getWindowManager().getMaximumWindowMetrics();
                l.e(a10, "getMaximumWindowMetrics(...)");
                Rect a11 = a10.getBounds();
                l.e(a11, "getBounds(...)");
                i10 = a11.right;
                this.T0 = i10;
                str = "Width";
            } else {
                i10 = getResources().getDisplayMetrics().widthPixels;
                this.T0 = i10;
                str = "Width 1";
            }
            Log.d(str, String.valueOf(i10));
            if (r2().size() > 1) {
                w4 w4Var13 = this.J;
                if (w4Var13 == null) {
                    l.v("mBinding");
                    w4Var13 = null;
                }
                w4Var13.f29152f0.setLayoutManager(new LinearLayoutManager(this, 0, false));
                ArrayList r22 = r2();
                int i11 = this.U0;
                int i12 = this.T0;
                String b10 = n2().b("check_dl_serv_replacement_dl", "Replacement of DL");
                l.c(b10);
                bb.a aVar = new bb.a(r22, this, i11, i12, b10);
                w4 w4Var14 = this.J;
                if (w4Var14 == null) {
                    l.v("mBinding");
                    w4Var14 = null;
                }
                w4Var14.f29152f0.setAdapter(aVar);
            }
            if (r2().size() == 1) {
                w4 w4Var15 = this.J;
                if (w4Var15 == null) {
                    l.v("mBinding");
                    w4Var15 = null;
                }
                w4Var15.f29151e0.f29580g.setText((CharSequence) r2().get(0));
                w4 w4Var16 = this.J;
                if (w4Var16 == null) {
                    l.v("mBinding");
                    w4Var16 = null;
                }
                w4Var16.f29151e0.f29579f.setVisibility(8);
            } else {
                w4 w4Var17 = this.J;
                if (w4Var17 == null) {
                    l.v("mBinding");
                    w4Var17 = null;
                }
                TextView textView3 = w4Var17.f29151e0.f29580g;
                String b11 = n2().b("dl_services", getString(R.string.dl_services));
                l.c(b11);
                textView3.setText(b11);
                w4 w4Var18 = this.J;
                if (w4Var18 == null) {
                    l.v("mBinding");
                    w4Var18 = null;
                }
                w4Var18.f29151e0.f29579f.setVisibility(8);
                w4 w4Var19 = this.J;
                if (w4Var19 == null) {
                    l.v("mBinding");
                    w4Var19 = null;
                }
                TextView textView4 = w4Var19.f29151e0.f29580g;
                w4 w4Var20 = this.J;
                if (w4Var20 == null) {
                    l.v("mBinding");
                    w4Var20 = null;
                }
                textView4.setPaintFlags(w4Var20.f29151e0.f29580g.getPaintFlags() | 8);
            }
            if (this.U0 == w2().size()) {
                w4 w4Var21 = this.J;
                if (w4Var21 == null) {
                    l.v("mBinding");
                } else {
                    w4Var = w4Var21;
                }
                customWegetLayout = w4Var.T;
                n22 = n2();
                str2 = "vahan_btn_submit";
                str3 = "Submit";
            } else {
                w4 w4Var22 = this.J;
                if (w4Var22 == null) {
                    l.v("mBinding");
                } else {
                    w4Var = w4Var22;
                }
                customWegetLayout = w4Var.T;
                n22 = n2();
                str2 = "btn_dl_serv_next";
                str3 = "Next";
            }
            customWegetLayout.setText(n22.b(str2, str3));
            return;
        }
        w4 w4Var23 = this.J;
        if (w4Var23 == null) {
            l.v("mBinding");
        } else {
            w4Var = w4Var23;
        }
        w4Var.f29151e0.f29580g.setText(n2().b("check_dl_serv_intern_dl_perm", "International Driving Permit"));
    }

    private final void C2() {
        d0 d0Var = (d0) new u0(this).a(d0.class);
        this.K = d0Var;
        w4 w4Var = null;
        if (d0Var == null) {
            l.v("viewModel");
            d0Var = null;
        }
        d0Var.m();
        d0 d0Var2 = this.K;
        if (d0Var2 == null) {
            l.v("viewModel");
            d0Var2 = null;
        }
        d0Var2.k().g(this, new h(new b(this)));
        d0 d0Var3 = this.K;
        if (d0Var3 == null) {
            l.v("viewModel");
            d0Var3 = null;
        }
        d0Var3.l();
        d0 d0Var4 = this.K;
        if (d0Var4 == null) {
            l.v("viewModel");
            d0Var4 = null;
        }
        d0Var4.l();
        d0 d0Var5 = this.K;
        if (d0Var5 == null) {
            l.v("viewModel");
            d0Var5 = null;
        }
        d0Var5.j().g(this, new h(new c(this)));
        d0 d0Var6 = this.K;
        if (d0Var6 == null) {
            l.v("viewModel");
            d0Var6 = null;
        }
        d0Var6.i().g(this, new h(new d(this)));
        w4 w4Var2 = this.J;
        if (w4Var2 == null) {
            l.v("mBinding");
            w4Var2 = null;
        }
        w4Var2.f29150d0.f25959e.setOnClickListener(new i(this));
        w4 w4Var3 = this.J;
        if (w4Var3 == null) {
            l.v("mBinding");
        } else {
            w4Var = w4Var3;
        }
        w4Var.f29150d0.f25957c.setOnClickListener(new j());
    }

    /* access modifiers changed from: private */
    public static final void D2(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        dLIdpActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void E2(View view) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0299, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c7, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02f5, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0323, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0355, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x038c, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005c, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0089, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b6, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e4, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0112, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0164, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b3, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e1, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x020f, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x023d, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x026b, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean F2() {
        /*
            r7 = this;
            java.lang.String r0 = r7.F0
            java.lang.String r1 = "0"
            boolean r0 = r0.equals(r1)
            r1 = 0
            r2 = 0
            java.lang.String r3 = "mBinding"
            if (r0 == 0) goto L_0x0030
            ld.c r0 = r7.n2()
            r4 = 2132019054(0x7f14076e, float:1.9676432E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "label_app_category"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
        L_0x0023:
            cm.l.v(r3)
            goto L_0x0028
        L_0x0027:
            r2 = r4
        L_0x0028:
            android.view.View r2 = r2.m()
            r7.t1(r0, r2)
            return r1
        L_0x0030:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x0038
            cm.l.v(r3)
            r0 = r2
        L_0x0038:
            android.widget.EditText r0 = r0.U
            android.text.Editable r0 = r0.getText()
            java.lang.String r4 = "getText(...)"
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x005f
            ld.c r0 = r7.n2()
            r4 = 2132017798(0x7f140286, float:1.9673885E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "edit_dl_serv_enter_birth_plac"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x005f:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x0067
            cm.l.v(r3)
            r0 = r2
        L_0x0067:
            android.widget.EditText r0 = r0.E
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x008c
            ld.c r0 = r7.n2()
            r4 = 2132019055(0x7f14076f, float:1.9676434E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "birth_country"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x008c:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x0094
            cm.l.v(r3)
            r0 = r2
        L_0x0094:
            android.widget.EditText r0 = r0.f29153g0
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00ba
            ld.c r0 = r7.n2()
            r4 = 2132017871(0x7f1402cf, float:1.9674033E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "edit_dl_serv_enter_pass_no"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x00ba:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x00c2
            cm.l.v(r3)
            r0 = r2
        L_0x00c2:
            android.widget.EditText r0 = r0.f29154h0
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00e8
            ld.c r0 = r7.n2()
            r4 = 2132017872(0x7f1402d0, float:1.9674035E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "edit_dl_serv_selc_pass_valid"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x00e8:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x00f0
            cm.l.v(r3)
            r0 = r2
        L_0x00f0:
            android.widget.EditText r0 = r0.H
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0116
            ld.c r0 = r7.n2()
            r4 = 2132019068(0x7f14077c, float:1.967646E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "edit_dl_serv_selc_country"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x0116:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x011e
            cm.l.v(r3)
            r0 = r2
        L_0x011e:
            android.widget.EditText r0 = r0.F
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x012e
            goto L_0x0151
        L_0x012e:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x0136
            cm.l.v(r3)
            r0 = r2
        L_0x0136:
            android.widget.EditText r0 = r0.F
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = km.q.B0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "Select Cov"
            r6 = 1
            boolean r0 = km.p.o(r0, r5, r6)
            if (r0 == 0) goto L_0x0168
        L_0x0151:
            ld.c r0 = r7.n2()
            r4 = 2132019069(0x7f14077d, float:1.9676462E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "edit_dl_serv_selc_cov_grade"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x0168:
            ld.f r0 = r7.y2()
            java.lang.String r0 = r0.d()
            java.lang.String r5 = "true"
            boolean r0 = km.p.o(r0, r5, r6)
            java.lang.String r5 = "Y"
            if (r0 == 0) goto L_0x017d
            r7.f22185f0 = r5
            goto L_0x0181
        L_0x017d:
            java.lang.String r0 = "N"
            r7.f22185f0 = r0
        L_0x0181:
            java.lang.String r0 = r7.f22185f0
            boolean r0 = km.p.o(r0, r5, r6)
            if (r0 == 0) goto L_0x0327
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x0191
            cm.l.v(r3)
            r0 = r2
        L_0x0191:
            android.widget.EditText r0 = r0.Q
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01b7
            ld.c r0 = r7.n2()
            r4 = 2132017838(0x7f1402ae, float:1.9673966E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "edit_dl_serv_enter_ind_embas_name"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x01b7:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x01bf
            cm.l.v(r3)
            r0 = r2
        L_0x01bf:
            android.widget.EditText r0 = r0.R
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01e5
            ld.c r0 = r7.n2()
            r4 = 2132017840(0x7f1402b0, float:1.967397E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "edit_dl_serv_enter_embas_place"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x01e5:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x01ed
            cm.l.v(r3)
            r0 = r2
        L_0x01ed:
            android.widget.EditText r0 = r0.O
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0213
            ld.c r0 = r7.n2()
            r4 = 2132017839(0x7f1402af, float:1.9673968E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "edit_dl_serv_enter_fore_mob_no"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x0213:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x021b
            cm.l.v(r3)
            r0 = r2
        L_0x021b:
            android.widget.EditText r0 = r0.M
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0241
            ld.c r0 = r7.n2()
            r4 = 2132017819(0x7f14029b, float:1.9673927E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "enter_email_id"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x0241:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x0249
            cm.l.v(r3)
            r0 = r2
        L_0x0249:
            android.widget.EditText r0 = r0.L
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x026f
            ld.c r0 = r7.n2()
            r4 = 2132017943(0x7f140317, float:1.9674179E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "edit_dl_serv_date_verif_embass"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x026f:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x0277
            cm.l.v(r3)
            r0 = r2
        L_0x0277:
            android.widget.EditText r0 = r0.N
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x029d
            ld.c r0 = r7.n2()
            r4 = 2132017944(0x7f140318, float:1.967418E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "edit_dl_serv_embsy_endor_no"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x029d:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x02a5
            cm.l.v(r3)
            r0 = r2
        L_0x02a5:
            android.widget.EditText r0 = r0.C
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x02cb
            ld.c r0 = r7.n2()
            r4 = 2132017355(0x7f1400cb, float:1.9672986E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "edit_dl_serv_idp_applied_from"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x02cb:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x02d3
            cm.l.v(r3)
            r0 = r2
        L_0x02d3:
            android.widget.EditText r0 = r0.I
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x02f9
            ld.c r0 = r7.n2()
            r4 = 2132017783(0x7f140277, float:1.9673854E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "edit_dl_serv_enter_addr"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x02f9:
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x0301
            cm.l.v(r3)
            r0 = r2
        L_0x0301:
            android.widget.EditText r0 = r0.P
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0327
            ld.c r0 = r7.n2()
            r4 = 2132017880(0x7f1402d8, float:1.967405E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "edit_dl_serv_enter_pincode"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x0327:
            java.lang.String r0 = r7.f22186g0
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0359
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x0337
            cm.l.v(r3)
            r0 = r2
        L_0x0337:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.B
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0359
            ld.c r0 = r7.n2()
            java.lang.String r4 = "disqualified_reason"
            java.lang.String r5 = ""
            java.lang.String r0 = r0.b(r4, r5)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x0359:
            java.lang.String r0 = r7.f22188i0
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0390
            ni.w4 r0 = r7.J
            if (r0 != 0) goto L_0x0369
            cm.l.v(r3)
            r0 = r2
        L_0x0369:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.D
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0390
            ld.c r0 = r7.n2()
            r4 = 2132017386(0x7f1400ea, float:1.9673049E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "barred_reason"
            java.lang.String r0 = r0.b(r5, r4)
            ni.w4 r4 = r7.J
            if (r4 != 0) goto L_0x0027
            goto L_0x0023
        L_0x0390:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity.F2():boolean");
    }

    private final void G2() {
        w4 w4Var = this.J;
        w4 w4Var2 = null;
        if (w4Var == null) {
            l.v("mBinding");
            w4Var = null;
        }
        w4Var.f29156j0.setOnClickListener(new uj.x(this));
        w4 w4Var3 = this.J;
        if (w4Var3 == null) {
            l.v("mBinding");
            w4Var3 = null;
        }
        w4Var3.E.setOnClickListener(new a0(this));
        w4 w4Var4 = this.J;
        if (w4Var4 == null) {
            l.v("mBinding");
            w4Var4 = null;
        }
        w4Var4.H.setOnClickListener(new uj.b0(this));
        w4 w4Var5 = this.J;
        if (w4Var5 == null) {
            l.v("mBinding");
            w4Var5 = null;
        }
        w4Var5.C.setOnClickListener(new c0(this));
        w4 w4Var6 = this.J;
        if (w4Var6 == null) {
            l.v("mBinding");
            w4Var6 = null;
        }
        w4Var6.F.setOnClickListener(new uj.c(this));
        w4 w4Var7 = this.J;
        if (w4Var7 == null) {
            l.v("mBinding");
            w4Var7 = null;
        }
        w4Var7.G.setOnClickListener(new uj.d(this));
        w4 w4Var8 = this.J;
        if (w4Var8 == null) {
            l.v("mBinding");
            w4Var8 = null;
        }
        w4Var8.Z.setOnCheckedChangeListener(new uj.e(this));
        w4 w4Var9 = this.J;
        if (w4Var9 == null) {
            l.v("mBinding");
            w4Var9 = null;
        }
        w4Var9.f29147a0.setOnCheckedChangeListener(new uj.f(this));
        w4 w4Var10 = this.J;
        if (w4Var10 == null) {
            l.v("mBinding");
            w4Var10 = null;
        }
        w4Var10.f29154h0.setOnClickListener(new uj.g(this));
        w4 w4Var11 = this.J;
        if (w4Var11 == null) {
            l.v("mBinding");
            w4Var11 = null;
        }
        w4Var11.L.setFocusable(false);
        w4 w4Var12 = this.J;
        if (w4Var12 == null) {
            l.v("mBinding");
            w4Var12 = null;
        }
        w4Var12.L.setOnClickListener(new uj.h(this));
        w4 w4Var13 = this.J;
        if (w4Var13 == null) {
            l.v("mBinding");
            w4Var13 = null;
        }
        w4Var13.N0.setOnClickListener(new y(this));
        w4 w4Var14 = this.J;
        if (w4Var14 == null) {
            l.v("mBinding");
        } else {
            w4Var2 = w4Var14;
        }
        w4Var2.T.setOnClickListener(new z(this));
    }

    /* access modifiers changed from: private */
    public static final void H2(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        w4 w4Var = dLIdpActivity.J;
        w4 w4Var2 = null;
        if (w4Var == null) {
            l.v("mBinding");
            w4Var = null;
        }
        w4Var.x(Boolean.TRUE);
        w4 w4Var3 = dLIdpActivity.J;
        if (w4Var3 == null) {
            l.v("mBinding");
        } else {
            w4Var2 = w4Var3;
        }
        w4Var2.k();
    }

    /* access modifiers changed from: private */
    public static final void I2(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        dLIdpActivity.c3(1);
    }

    /* access modifiers changed from: private */
    public static final void J2(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        dLIdpActivity.e3();
    }

    /* access modifiers changed from: private */
    public static final void K2(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        dLIdpActivity.c3(2);
    }

    /* access modifiers changed from: private */
    public static final void L2(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        dLIdpActivity.g2(dLIdpActivity.E0);
    }

    /* access modifiers changed from: private */
    public static final void M2(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        dLIdpActivity.d3();
    }

    /* access modifiers changed from: private */
    public static final void N2(DLIdpActivity dLIdpActivity, RadioGroup radioGroup, int i10) {
        boolean z10;
        l.f(dLIdpActivity, "this$0");
        if (i10 == R.id.iidp_no) {
            dLIdpActivity.f22186g0 = "N";
            z10 = false;
        } else if (i10 == R.id.iidp_yes) {
            dLIdpActivity.f22186g0 = "Y";
            z10 = true;
        } else {
            return;
        }
        dLIdpActivity.A2(z10);
    }

    /* access modifiers changed from: private */
    public static final void O2(DLIdpActivity dLIdpActivity, RadioGroup radioGroup, int i10) {
        boolean z10;
        l.f(dLIdpActivity, "this$0");
        if (i10 == R.id.iidp_no_second) {
            dLIdpActivity.f22188i0 = "N";
            z10 = false;
        } else if (i10 == R.id.iidp_yes_second) {
            dLIdpActivity.f22188i0 = "Y";
            z10 = true;
        } else {
            return;
        }
        dLIdpActivity.z2(z10);
    }

    /* access modifiers changed from: private */
    public static final void P2(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        DatePickerDialog datePickerDialog = new DatePickerDialog(dLIdpActivity, new s(dLIdpActivity), dLIdpActivity.f22184e0.get(1), dLIdpActivity.f22184e0.get(2), dLIdpActivity.f22184e0.get(5));
        datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
        datePickerDialog.show();
    }

    /* access modifiers changed from: private */
    public static final void Q2(DLIdpActivity dLIdpActivity, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(dLIdpActivity, "this$0");
        w4 w4Var = dLIdpActivity.J;
        if (w4Var == null) {
            l.v("mBinding");
            w4Var = null;
        }
        EditText editText = w4Var.f29154h0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        sb2.append('-');
        sb2.append(i11 + 1);
        sb2.append('-');
        sb2.append(i10);
        editText.setText(sb2.toString());
    }

    /* access modifiers changed from: private */
    public static final void R2(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        DatePickerDialog datePickerDialog = new DatePickerDialog(dLIdpActivity, new o(dLIdpActivity), dLIdpActivity.f22184e0.get(1), dLIdpActivity.f22184e0.get(2), dLIdpActivity.f22184e0.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
    }

    /* access modifiers changed from: private */
    public static final void S2(DLIdpActivity dLIdpActivity, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(dLIdpActivity, "this$0");
        w4 w4Var = dLIdpActivity.J;
        if (w4Var == null) {
            l.v("mBinding");
            w4Var = null;
        }
        EditText editText = w4Var.L;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        sb2.append('-');
        sb2.append(i11 + 1);
        sb2.append('-');
        sb2.append(i10);
        editText.setText(sb2.toString());
    }

    /* access modifiers changed from: private */
    public static final void T2(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        DatePickerDialog datePickerDialog = new DatePickerDialog(dLIdpActivity, new p(dLIdpActivity), dLIdpActivity.f22184e0.get(1), dLIdpActivity.f22184e0.get(2), dLIdpActivity.f22184e0.get(5));
        datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
        datePickerDialog.show();
    }

    /* access modifiers changed from: private */
    public static final void U2(DLIdpActivity dLIdpActivity, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(dLIdpActivity, "this$0");
        w4 w4Var = dLIdpActivity.J;
        if (w4Var == null) {
            l.v("mBinding");
            w4Var = null;
        }
        EditText editText = w4Var.N0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        sb2.append('-');
        sb2.append(i11 + 1);
        sb2.append('-');
        sb2.append(i10);
        editText.setText(sb2.toString());
    }

    /* access modifiers changed from: private */
    public static final void V2(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        if (dLIdpActivity.F2()) {
            dLIdpActivity.f3(dLIdpActivity, dLIdpActivity.n2().b("label_want_to_proceed", dLIdpActivity.getString(R.string.are_you_want_to_proceed)));
        }
    }

    /* access modifiers changed from: private */
    public static final void W2(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        dLIdpActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void X2(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        try {
            Intent intent = new Intent(dLIdpActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", dLIdpActivity.N);
            intent.putExtra("dob", dLIdpActivity.O);
            intent.putExtra("DLDetails", dLIdpActivity.k2());
            intent.putExtra("Mobile_no", dLIdpActivity.P);
            intent.putExtra("lastEndorsedRTO", dLIdpActivity.S);
            intent.putExtra("lastEndorsedState", dLIdpActivity.T);
            intent.putExtra("lastEndorsedRTOCode", dLIdpActivity.R);
            intent.putExtra("lastEndorseStateCode", dLIdpActivity.U);
            intent.putExtra("whatServiceRequired", dLIdpActivity.Q);
            if (l.a(dLIdpActivity.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", dLIdpActivity.w2());
            }
            dLIdpActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void Y2(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        if (l.a(dLIdpActivity.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (dLIdpActivity.r2().size() > 1) {
                    Dialog dialog = new Dialog(dLIdpActivity);
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
                    textView.setText(dLIdpActivity.n2().b("btn_ok", "OK"));
                    ((TextView) findViewById5).setText(dLIdpActivity.n2().b("title_dl_services", "Driving Licence Services"));
                    ((ImageView) findViewById).setOnClickListener(new k(dialog));
                    int size = dLIdpActivity.r2().size();
                    String str = "";
                    int i10 = 0;
                    String str2 = str;
                    while (i10 < size) {
                        str = str + ((String) dLIdpActivity.r2().get(i10)) + 10;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        i10++;
                        sb2.append(i10);
                        sb2.append(".\n");
                        str2 = sb2.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(str2);
                    textView.setOnClickListener(new uj.l(dialog));
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
    public static final void Z2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void a3(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void b3(DLIdpActivity dLIdpActivity, View view) {
        l.f(dLIdpActivity, "this$0");
        try {
            Intent intent = new Intent(dLIdpActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", dLIdpActivity.N);
            intent.putExtra("dob", dLIdpActivity.O);
            intent.putExtra("DLDetails", dLIdpActivity.k2());
            intent.putExtra("Mobile_no", dLIdpActivity.P);
            intent.putExtra("lastEndorsedRTO", dLIdpActivity.S);
            intent.putExtra("lastEndorsedState", dLIdpActivity.T);
            intent.putExtra("lastEndorsedRTOCode", dLIdpActivity.R);
            intent.putExtra("lastEndorseStateCode", dLIdpActivity.U);
            intent.putExtra("whatServiceRequired", dLIdpActivity.Q);
            dLIdpActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void c3(int i10) {
        ArrayList arrayList = new ArrayList();
        ArrayList<GetNationsCodeItem> arrayList2 = this.V;
        if (arrayList2 != null) {
            for (GetNationsCodeItem getNationsCodeItem : arrayList2) {
                arrayList.add(String.valueOf(getNationsCodeItem != null ? getNationsCodeItem.getNationName() : null));
            }
        }
        kk.e a10 = kk.e.A0.a("Select Nation", arrayList);
        a10.k2(F0(), "NationPicker");
        a10.n2(new e(i10, this));
    }

    private final void d3() {
        ArrayList arrayList = new ArrayList();
        ArrayList<GetNationsCodeItem> arrayList2 = this.X;
        if (arrayList2 != null) {
            for (GetNationsCodeItem getNationsCodeItem : arrayList2) {
                arrayList.add(String.valueOf(getNationsCodeItem != null ? getNationsCodeItem.getNationName() : null));
            }
        }
        kk.e a10 = kk.e.A0.a("List of Restricted Nation", arrayList);
        a10.k2(F0(), "RestrictedNationPicker");
        a10.n2(new f());
    }

    private final void e3() {
        ArrayList arrayList = new ArrayList();
        ArrayList<GetNationsCodeItem> arrayList2 = this.W;
        if (arrayList2 != null) {
            for (GetNationsCodeItem getNationsCodeItem : arrayList2) {
                arrayList.add(String.valueOf(getNationsCodeItem != null ? getNationsCodeItem.getNationName() : null));
            }
        }
        kk.e a10 = kk.e.A0.a("Select Nation", arrayList);
        a10.k2(F0(), "NationPicker");
        a10.n2(new g(this));
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
    private final void f2() {
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
            ni.w4 r2 = r11.J
            java.lang.String r7 = "mBinding"
            r8 = 0
            if (r2 != 0) goto L_0x00b6
            cm.l.v(r7)
            r2 = r8
        L_0x00b6:
            android.widget.Spinner r2 = r2.f29159m0
            r2.setAdapter(r1)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            r2 = r3
        L_0x00c4:
            if (r2 >= r1) goto L_0x0103
            ld.f r9 = r11.y2()
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
            ni.w4 r1 = r11.J
            if (r1 != 0) goto L_0x00fa
            cm.l.v(r7)
            r1 = r8
        L_0x00fa:
            android.widget.Spinner r1 = r1.f29159m0
            r1.setSelection(r2)
            goto L_0x0103
        L_0x0100:
            int r2 = r2 + 1
            goto L_0x00c4
        L_0x0103:
            ni.w4 r1 = r11.J
            if (r1 != 0) goto L_0x010b
            cm.l.v(r7)
            r1 = r8
        L_0x010b:
            android.widget.Spinner r1 = r1.f29159m0
            com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity$a r2 = new com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity$a
            r2.<init>(r11, r0)
            r1.setOnItemSelectedListener(r2)
            java.lang.String r0 = r11.f22191l0
            java.lang.String r1 = "S"
            boolean r0 = km.p.p(r0, r1, r3, r6, r8)
            if (r0 == 0) goto L_0x012e
            ni.w4 r0 = r11.J
            if (r0 != 0) goto L_0x0127
        L_0x0123:
            cm.l.v(r7)
            goto L_0x0128
        L_0x0127:
            r8 = r0
        L_0x0128:
            android.widget.Spinner r0 = r8.f29159m0
            r0.setEnabled(r5)
            goto L_0x0149
        L_0x012e:
            java.lang.String r0 = r11.F0
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x013b
            ni.w4 r0 = r11.J
            if (r0 != 0) goto L_0x0127
            goto L_0x0123
        L_0x013b:
            ni.w4 r0 = r11.J
            if (r0 != 0) goto L_0x0143
            cm.l.v(r7)
            goto L_0x0144
        L_0x0143:
            r8 = r0
        L_0x0144:
            android.widget.Spinner r0 = r8.f29159m0
            r0.setEnabled(r3)
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity.f2():void");
    }

    private final void f3(Context context, String str) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(n2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(n2().b("radio_dl_serv_yes", "Yes"));
        textView2.setText(n2().b("radio_dl_serv_no", "No"));
        textView2.setOnClickListener(new q(dialog));
        textView.setOnClickListener(new r(this, dialog));
        dialog.show();
    }

    private final void g2(ArrayList arrayList) {
        try {
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.cov_dialog);
            Window window = dialog.getWindow();
            l.c(window);
            window.setBackgroundDrawable(new ColorDrawable(-1));
            View findViewById = dialog.findViewById(R.id.cov_recycler);
            l.d(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            View findViewById2 = dialog.findViewById(R.id.cov_ok);
            l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            View findViewById3 = dialog.findViewById(R.id.cov_cancel);
            l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter((RecyclerView.h) null);
            u uVar = new u();
            a aVar = new a(arrayList, this, this);
            uVar.f20234e = aVar;
            recyclerView.setAdapter(aVar);
            ((TextView) findViewById2).setOnClickListener(new t(dialog, this));
            ((TextView) findViewById3).setOnClickListener(new uj.u(this, uVar, dialog));
            dialog.show();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void g3(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void h2(Dialog dialog, DLIdpActivity dLIdpActivity, View view) {
        l.f(dialog, "$d");
        l.f(dLIdpActivity, "this$0");
        dialog.dismiss();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = dLIdpActivity.f22190k0.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb2.append(str);
            ArrayList arrayList = dLIdpActivity.f22190k0;
            if (!l.a(str, arrayList.get(arrayList.size() - 1))) {
                sb2.append(",");
            }
        }
        w4 w4Var = null;
        if (dLIdpActivity.f22190k0.size() > 0) {
            w4 w4Var2 = dLIdpActivity.J;
            if (w4Var2 == null) {
                l.v("mBinding");
            } else {
                w4Var = w4Var2;
            }
            w4Var.F.setText(sb2.toString());
            return;
        }
        w4 w4Var3 = dLIdpActivity.J;
        if (w4Var3 == null) {
            l.v("mBinding");
        } else {
            w4Var = w4Var3;
        }
        w4Var.F.setText("Select Cov");
    }

    /* access modifiers changed from: private */
    public static final void h3(DLIdpActivity dLIdpActivity, Dialog dialog, View view) {
        l.f(dLIdpActivity, "this$0");
        l.f(dialog, "$d");
        w4 w4Var = dLIdpActivity.J;
        d0 d0Var = null;
        if (w4Var == null) {
            l.v("mBinding");
            w4Var = null;
        }
        w4Var.T.c(true);
        if (!p.p(dLIdpActivity.f22191l0, "S", false, 2, (Object) null) || !p.p(dLIdpActivity.f22192m0, "Y", false, 2, (Object) null)) {
            l.a(dLIdpActivity.y2().g(), "Y");
            IdpSubmitRequest l32 = dLIdpActivity.l3();
            d0 d0Var2 = dLIdpActivity.K;
            if (d0Var2 == null) {
                l.v("viewModel");
            } else {
                d0Var = d0Var2;
            }
            d0Var.g(l32);
        } else {
            l.a(dLIdpActivity.y2().g(), "Y");
            IdpGenSubmit m32 = dLIdpActivity.m3();
            d0 d0Var3 = dLIdpActivity.K;
            if (d0Var3 == null) {
                l.v("viewModel");
            } else {
                d0Var = d0Var3;
            }
            d0Var.h(m32);
        }
        dialog.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [ni.w4] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i2(com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity r7, cm.u r8, android.app.Dialog r9, android.view.View r10) {
        /*
            java.lang.String r10 = "this$0"
            cm.l.f(r7, r10)
            java.lang.String r10 = "$adapter"
            cm.l.f(r8, r10)
            java.lang.String r10 = "$d"
            cm.l.f(r9, r10)
            java.util.ArrayList r10 = r7.f22190k0
            r10.clear()
            java.util.ArrayList r10 = r7.f22181b0
            r10.clear()
            java.util.ArrayList r10 = r7.E0
            cm.l.c(r10)
            int r10 = r10.size()
            r0 = 0
            r1 = r0
        L_0x0024:
            r2 = 0
            if (r1 >= r10) goto L_0x006f
            java.util.ArrayList r3 = r7.E0
            cm.l.c(r3)
            java.lang.Object r3 = r3.get(r1)
            cm.l.c(r3)
            com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem r3 = (com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem) r3
            boolean r3 = r3.getStatus()
            if (r3 == 0) goto L_0x006c
            java.util.ArrayList r3 = r7.E0
            if (r3 == 0) goto L_0x006c
            com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem r4 = new com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem
            cm.l.c(r3)
            java.lang.Object r5 = r3.get(r1)
            com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem r5 = (com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem) r5
            if (r5 == 0) goto L_0x0051
            java.lang.String r5 = r5.getIdpCovgrdCd()
            goto L_0x0052
        L_0x0051:
            r5 = r2
        L_0x0052:
            java.util.ArrayList r6 = r7.E0
            cm.l.c(r6)
            java.lang.Object r6 = r6.get(r1)
            com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem r6 = (com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem) r6
            if (r6 == 0) goto L_0x0063
            java.lang.String r2 = r6.getIdpcovgrdDesc()
        L_0x0063:
            r4.<init>(r5, r2, r0)
            java.lang.Object r2 = r3.set(r1, r4)
            com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem r2 = (com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem) r2
        L_0x006c:
            int r1 = r1 + 1
            goto L_0x0024
        L_0x006f:
            ni.w4 r10 = r7.J
            if (r10 != 0) goto L_0x0079
            java.lang.String r10 = "mBinding"
            cm.l.v(r10)
            goto L_0x007a
        L_0x0079:
            r2 = r10
        L_0x007a:
            android.widget.EditText r10 = r2.F
            java.lang.String r0 = "Select Cov"
            r10.setText(r0)
            java.lang.Object r8 = r8.f20234e
            com.nic.mparivahan.dlservices.ui.idp.a r8 = (com.nic.mparivahan.dlservices.ui.idp.a) r8
            java.util.ArrayList r10 = r7.E0
            r8.E(r10)
            r9.dismiss()
            java.util.ArrayList r8 = r7.E0
            r7.g2(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity.i2(com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity, cm.u, android.app.Dialog, android.view.View):void");
    }

    private final void j2() {
        List<IdpcovgradesItem> list = this.Y;
        if (list != null) {
            for (IdpcovgradesItem idpcovgradesItem : list) {
                String str = null;
                if (y.R(this.f22190k0, idpcovgradesItem != null ? idpcovgradesItem.getIdpcovgrdDesc() : null)) {
                    ArrayList arrayList = this.f22181b0;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    if (idpcovgradesItem != null) {
                        str = idpcovgradesItem.getIdpCovgrdCd();
                    }
                    sb2.append(q.B0(String.valueOf(str)).toString());
                    arrayList.add(sb2.toString());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void j3(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void k3(List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (!(list == null || (arrayList2 = this.V) == null)) {
            arrayList2.addAll(list);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GetNationsCodeItem getNationsCodeItem = (GetNationsCodeItem) it.next();
                if (p.p(getNationsCodeItem != null ? getNationsCodeItem.getNatIdpIssuable() : null, "Y", false, 2, (Object) null)) {
                    arrayList = this.W;
                    if (arrayList == null) {
                    }
                } else {
                    if (p.p(getNationsCodeItem != null ? getNationsCodeItem.getNatIdpIssuable() : null, "N", false, 2, (Object) null)) {
                        arrayList = this.X;
                        if (arrayList == null) {
                        }
                    }
                }
                arrayList.add(getNationsCodeItem);
            }
        }
    }

    private final IdpSubmitRequest l3() {
        selectDLlist selectdllist = new selectDLlist("Issue International Driving Permit");
        new JSONArray();
        ArrayList arrayList = new ArrayList();
        j2();
        for (String add : this.f22181b0) {
            arrayList.add(add);
        }
        String obj = q.B0(String.valueOf(this.N)).toString();
        String valueOf = String.valueOf(this.O);
        String obj2 = q.B0(String.valueOf(this.R)).toString();
        String str = this.Z;
        String str2 = this.f22180a0;
        w4 w4Var = this.J;
        if (w4Var == null) {
            l.v("mBinding");
            w4Var = null;
        }
        String obj3 = w4Var.f29153g0.getText().toString();
        w4 w4Var2 = this.J;
        if (w4Var2 == null) {
            l.v("mBinding");
            w4Var2 = null;
        }
        String obj4 = w4Var2.f29154h0.getText().toString();
        w4 w4Var3 = this.J;
        if (w4Var3 == null) {
            l.v("mBinding");
            w4Var3 = null;
        }
        String obj5 = w4Var3.M0.getText().toString();
        w4 w4Var4 = this.J;
        if (w4Var4 == null) {
            l.v("mBinding");
            w4Var4 = null;
        }
        String obj6 = w4Var4.N0.getText().toString();
        String str3 = this.f22180a0;
        String str4 = this.f22188i0;
        w4 w4Var5 = this.J;
        if (w4Var5 == null) {
            l.v("mBinding");
            w4Var5 = null;
        }
        String valueOf2 = String.valueOf(w4Var5.D.getText());
        String str5 = this.f22186g0;
        String str6 = str4;
        w4 w4Var6 = this.J;
        if (w4Var6 == null) {
            l.v("mBinding");
            w4Var6 = null;
        }
        String valueOf3 = String.valueOf(w4Var6.B.getText());
        w4 w4Var7 = this.J;
        if (w4Var7 == null) {
            l.v("mBinding");
            w4Var7 = null;
        }
        String obj7 = w4Var7.I.getText().toString();
        w4 w4Var8 = this.J;
        if (w4Var8 == null) {
            l.v("mBinding");
            w4Var8 = null;
        }
        String obj8 = w4Var8.J.getText().toString();
        w4 w4Var9 = this.J;
        if (w4Var9 == null) {
            l.v("mBinding");
            w4Var9 = null;
        }
        String obj9 = w4Var9.K.getText().toString();
        w4 w4Var10 = this.J;
        if (w4Var10 == null) {
            l.v("mBinding");
            w4Var10 = null;
        }
        String obj10 = w4Var10.P.getText().toString();
        w4 w4Var11 = this.J;
        if (w4Var11 == null) {
            l.v("mBinding");
            w4Var11 = null;
        }
        String obj11 = w4Var11.O.getText().toString();
        w4 w4Var12 = this.J;
        if (w4Var12 == null) {
            l.v("mBinding");
            w4Var12 = null;
        }
        String obj12 = w4Var12.M.getText().toString();
        String str7 = this.f22185f0;
        w4 w4Var13 = this.J;
        if (w4Var13 == null) {
            l.v("mBinding");
            w4Var13 = null;
        }
        String obj13 = w4Var13.Q.getText().toString();
        w4 w4Var14 = this.J;
        if (w4Var14 == null) {
            l.v("mBinding");
            w4Var14 = null;
        }
        String obj14 = w4Var14.R.getText().toString();
        w4 w4Var15 = this.J;
        if (w4Var15 == null) {
            l.v("mBinding");
            w4Var15 = null;
        }
        String obj15 = w4Var15.L.getText().toString();
        w4 w4Var16 = this.J;
        if (w4Var16 == null) {
            l.v("mBinding");
            w4Var16 = null;
        }
        String obj16 = w4Var16.N.getText().toString();
        String str8 = this.f22182c0;
        String str9 = this.P;
        l.c(str9);
        String str10 = str6;
        String str11 = str5;
        return new IdpSubmitRequest(obj, valueOf, obj2, selectdllist, str, str2, obj3, obj4, obj5, obj6, arrayList, str3, str10, valueOf2, str11, valueOf3, obj7, obj8, obj9, obj10, obj11, obj12, str7, obj13, obj14, obj15, obj16, str8, "sakalaHR", "975867c068a4e3e043058b5aaeebbeb5", "10.248.213.244", "SarathiMobileService", str9);
    }

    private final IdpGenSubmit m3() {
        selectDLlist selectdllist = new selectDLlist("Issue International Driving Permit");
        new JSONArray();
        ArrayList arrayList = new ArrayList();
        j2();
        for (String add : this.f22181b0) {
            arrayList.add(add);
        }
        String obj = q.B0(String.valueOf(this.N)).toString();
        String valueOf = String.valueOf(this.O);
        String obj2 = q.B0(String.valueOf(this.R)).toString();
        String str = this.Z;
        String str2 = this.f22180a0;
        w4 w4Var = this.J;
        if (w4Var == null) {
            l.v("mBinding");
            w4Var = null;
        }
        String obj3 = w4Var.f29153g0.getText().toString();
        w4 w4Var2 = this.J;
        if (w4Var2 == null) {
            l.v("mBinding");
            w4Var2 = null;
        }
        String obj4 = w4Var2.f29154h0.getText().toString();
        w4 w4Var3 = this.J;
        if (w4Var3 == null) {
            l.v("mBinding");
            w4Var3 = null;
        }
        String obj5 = w4Var3.M0.getText().toString();
        w4 w4Var4 = this.J;
        if (w4Var4 == null) {
            l.v("mBinding");
            w4Var4 = null;
        }
        String obj6 = w4Var4.N0.getText().toString();
        String str3 = this.f22180a0;
        String str4 = this.f22188i0;
        w4 w4Var5 = this.J;
        if (w4Var5 == null) {
            l.v("mBinding");
            w4Var5 = null;
        }
        String valueOf2 = String.valueOf(w4Var5.D.getText());
        String str5 = this.f22186g0;
        String str6 = str4;
        w4 w4Var6 = this.J;
        if (w4Var6 == null) {
            l.v("mBinding");
            w4Var6 = null;
        }
        String valueOf3 = String.valueOf(w4Var6.B.getText());
        w4 w4Var7 = this.J;
        if (w4Var7 == null) {
            l.v("mBinding");
            w4Var7 = null;
        }
        String obj7 = w4Var7.I.getText().toString();
        w4 w4Var8 = this.J;
        if (w4Var8 == null) {
            l.v("mBinding");
            w4Var8 = null;
        }
        String obj8 = w4Var8.J.getText().toString();
        w4 w4Var9 = this.J;
        if (w4Var9 == null) {
            l.v("mBinding");
            w4Var9 = null;
        }
        String obj9 = w4Var9.K.getText().toString();
        w4 w4Var10 = this.J;
        if (w4Var10 == null) {
            l.v("mBinding");
            w4Var10 = null;
        }
        String obj10 = w4Var10.P.getText().toString();
        w4 w4Var11 = this.J;
        if (w4Var11 == null) {
            l.v("mBinding");
            w4Var11 = null;
        }
        String obj11 = w4Var11.O.getText().toString();
        w4 w4Var12 = this.J;
        if (w4Var12 == null) {
            l.v("mBinding");
            w4Var12 = null;
        }
        String obj12 = w4Var12.M.getText().toString();
        String str7 = this.f22185f0;
        w4 w4Var13 = this.J;
        if (w4Var13 == null) {
            l.v("mBinding");
            w4Var13 = null;
        }
        String obj13 = w4Var13.Q.getText().toString();
        w4 w4Var14 = this.J;
        if (w4Var14 == null) {
            l.v("mBinding");
            w4Var14 = null;
        }
        String obj14 = w4Var14.R.getText().toString();
        w4 w4Var15 = this.J;
        if (w4Var15 == null) {
            l.v("mBinding");
            w4Var15 = null;
        }
        String obj15 = w4Var15.L.getText().toString();
        w4 w4Var16 = this.J;
        if (w4Var16 == null) {
            l.v("mBinding");
            w4Var16 = null;
        }
        String obj16 = w4Var16.N.getText().toString();
        String str8 = this.f22182c0;
        String str9 = this.f22201v0;
        String str10 = str9;
        l.c(str9);
        String str11 = this.f22202w0;
        String str12 = str11;
        l.c(str11);
        String str13 = this.f22203x0;
        String str14 = str13;
        l.c(str13);
        String str15 = this.f22204y0;
        String str16 = str15;
        l.c(str15);
        String str17 = this.f22205z0;
        String str18 = str17;
        l.c(str17);
        String str19 = this.A0;
        String str20 = str19;
        l.c(str19);
        String str21 = this.B0;
        String str22 = str21;
        l.c(str21);
        String str23 = this.C0;
        String str24 = str23;
        l.c(str23);
        String str25 = this.f22193n0;
        String str26 = str25;
        l.c(str25);
        String str27 = this.f22194o0;
        String str28 = str27;
        l.c(str27);
        String str29 = this.f22195p0;
        String str30 = str29;
        l.c(str29);
        String str31 = this.f22196q0;
        String str32 = str31;
        l.c(str31);
        String str33 = this.f22197r0;
        String str34 = str33;
        l.c(str33);
        String str35 = this.f22198s0;
        String str36 = str35;
        l.c(str35);
        String str37 = this.f22199t0;
        String str38 = str37;
        l.c(str37);
        String str39 = this.f22200u0;
        String str40 = str39;
        l.c(str39);
        String str41 = this.P;
        l.c(str41);
        String str42 = str6;
        String str43 = str5;
        return new IdpGenSubmit(obj, valueOf, obj2, selectdllist, str, str2, obj3, obj4, obj5, obj6, arrayList, str3, str42, valueOf2, str43, valueOf3, obj7, obj8, obj9, obj10, obj11, obj12, str7, obj13, obj14, obj15, obj16, str8, "sakalaHR", "975867c068a4e3e043058b5aaeebbeb5", "10.248.213.244", "SarathiMobileService", str10, str12, str14, str16, str18, str20, str22, str24, str26, str28, str30, str32, str34, str36, str38, str40, str41);
    }

    private final void z2(boolean z10) {
        w4 w4Var = null;
        if (z10) {
            w4 w4Var2 = this.J;
            if (w4Var2 == null) {
                l.v("mBinding");
            } else {
                w4Var = w4Var2;
            }
            w4Var.D.setVisibility(0);
            return;
        }
        w4 w4Var3 = this.J;
        if (w4Var3 == null) {
            l.v("mBinding");
            w4Var3 = null;
        }
        w4Var3.D.setVisibility(8);
        w4 w4Var4 = this.J;
        if (w4Var4 == null) {
            l.v("mBinding");
        } else {
            w4Var = w4Var4;
        }
        w4Var.D.setText("");
    }

    public void i(int i10, boolean z10) {
        try {
            ArrayList arrayList = this.f22181b0;
            ArrayList arrayList2 = this.E0;
            l.c(arrayList2);
            Object obj = arrayList2.get(i10);
            l.c(obj);
            String idpCovgrdCd = ((IdpcovgradesItem) obj).getIdpCovgrdCd();
            l.c(idpCovgrdCd);
            if (arrayList.contains(q.B0(idpCovgrdCd).toString())) {
                ArrayList arrayList3 = this.f22181b0;
                ArrayList arrayList4 = this.E0;
                l.c(arrayList4);
                Object obj2 = arrayList4.get(i10);
                l.c(obj2);
                String idpCovgrdCd2 = ((IdpcovgradesItem) obj2).getIdpCovgrdCd();
                l.c(idpCovgrdCd2);
                arrayList3.remove(q.B0(idpCovgrdCd2).toString());
            } else {
                ArrayList arrayList5 = this.f22181b0;
                ArrayList arrayList6 = this.E0;
                l.c(arrayList6);
                Object obj3 = arrayList6.get(i10);
                l.c(obj3);
                String idpCovgrdCd3 = ((IdpcovgradesItem) obj3).getIdpCovgrdCd();
                l.c(idpCovgrdCd3);
                arrayList5.add(q.B0(idpCovgrdCd3).toString());
            }
            ArrayList arrayList7 = this.f22190k0;
            ArrayList arrayList8 = this.E0;
            l.c(arrayList8);
            Object obj4 = arrayList8.get(i10);
            l.c(obj4);
            String idpcovgrdDesc = ((IdpcovgradesItem) obj4).getIdpcovgrdDesc();
            l.c(idpcovgrdDesc);
            if (arrayList7.contains(q.B0(idpcovgrdDesc).toString())) {
                ArrayList arrayList9 = this.f22190k0;
                ArrayList arrayList10 = this.E0;
                l.c(arrayList10);
                Object obj5 = arrayList10.get(i10);
                l.c(obj5);
                String idpcovgrdDesc2 = ((IdpcovgradesItem) obj5).getIdpcovgrdDesc();
                l.c(idpcovgrdDesc2);
                arrayList9.remove(q.B0(idpcovgrdDesc2).toString());
                return;
            }
            ArrayList arrayList11 = this.f22190k0;
            ArrayList arrayList12 = this.E0;
            l.c(arrayList12);
            Object obj6 = arrayList12.get(i10);
            l.c(obj6);
            String idpcovgrdDesc3 = ((IdpcovgradesItem) obj6).getIdpcovgrdDesc();
            l.c(idpcovgrdDesc3);
            arrayList11.add(q.B0(idpcovgrdDesc3).toString());
        } catch (Exception unused) {
        }
    }

    public final void i3(Context context, String str) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new n(dialog));
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(n2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(n2().b("btn_ok", "OK"));
        dialog.show();
    }

    public final DldetobjX k2() {
        DldetobjX dldetobjX = this.M;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        l.v("dlDetails");
        return null;
    }

    public final String l2() {
        return this.N;
    }

    public final String m2() {
        return this.O;
    }

    public final ld.c n2() {
        ld.c cVar = this.G0;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final void n3(String str) {
        l.f(str, "<set-?>");
        this.F0 = str;
    }

    public final String o2() {
        return this.S;
    }

    public final void o3(DldetobjX dldetobjX) {
        l.f(dldetobjX, "<set-?>");
        this.M = dldetobjX;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_issue_international_permit);
        l.e(f10, "setContentView(...)");
        this.J = (w4) f10;
        v3(new ld.f(this));
        p3(new ld.c(this));
        e.a aVar = v9.e.f17509a;
        w4 w4Var = this.J;
        w4 w4Var2 = null;
        if (w4Var == null) {
            l.v("mBinding");
            w4Var = null;
        }
        aVar.Y0(this, w4Var);
        t3(new ld.g(this));
        if (y2().d().equals("true")) {
            w4 w4Var3 = this.J;
            if (w4Var3 == null) {
                l.v("mBinding");
                w4Var3 = null;
            }
            w4Var3.f29173y.setVisibility(0);
        } else {
            w4 w4Var4 = this.J;
            if (w4Var4 == null) {
                l.v("mBinding");
                w4Var4 = null;
            }
            w4Var4.f29173y.setVisibility(8);
        }
        B2();
        C2();
        G2();
        w4 w4Var5 = this.J;
        if (w4Var5 == null) {
            l.v("mBinding");
            w4Var5 = null;
        }
        w4Var5.f29151e0.f29577d.setOnClickListener(new uj.b(this));
        w4 w4Var6 = this.J;
        if (w4Var6 == null) {
            l.v("mBinding");
            w4Var6 = null;
        }
        w4Var6.f29151e0.f29581h.setOnClickListener(new uj.m(this));
        w4 w4Var7 = this.J;
        if (w4Var7 == null) {
            l.v("mBinding");
            w4Var7 = null;
        }
        w4Var7.f29151e0.f29580g.setOnClickListener(new v(this));
        w4 w4Var8 = this.J;
        if (w4Var8 == null) {
            l.v("mBinding");
            w4Var8 = null;
        }
        TextView textView = w4Var8.L0;
        w4 w4Var9 = this.J;
        if (w4Var9 == null) {
            l.v("mBinding");
            w4Var9 = null;
        }
        textView.setPaintFlags(w4Var9.L0.getPaintFlags() | 8);
        w4 w4Var10 = this.J;
        if (w4Var10 == null) {
            l.v("mBinding");
            w4Var10 = null;
        }
        w4Var10.L0.setOnClickListener(new w(this));
        f2();
        BioImgObjX bioImgObj = k2().getBioImgObj();
        String biPhoto = bioImgObj != null ? bioImgObj.getBiPhoto() : null;
        if (biPhoto == null || biPhoto.length() == 0) {
            w4 w4Var11 = this.J;
            if (w4Var11 == null) {
                l.v("mBinding");
                w4Var11 = null;
            }
            w4Var11.f29150d0.f25960f.setVisibility(4);
        } else {
            w4 w4Var12 = this.J;
            if (w4Var12 == null) {
                l.v("mBinding");
                w4Var12 = null;
            }
            w4Var12.f29150d0.f25960f.setVisibility(0);
            w4 w4Var13 = this.J;
            if (w4Var13 == null) {
                l.v("mBinding");
                w4Var13 = null;
            }
            ImageView imageView = w4Var13.f29150d0.f25956b;
            BioImgObjX bioImgObj2 = k2().getBioImgObj();
            imageView.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
        }
        w4 w4Var14 = this.J;
        if (w4Var14 == null) {
            l.v("mBinding");
            w4Var14 = null;
        }
        w4Var14.f29151e0.f29578e.setVisibility(8);
        w4 w4Var15 = this.J;
        if (w4Var15 == null) {
            l.v("mBinding");
            w4Var15 = null;
        }
        w4Var15.f29150d0.f25961g.setText(y2().i());
        w4 w4Var16 = this.J;
        if (w4Var16 == null) {
            l.v("mBinding");
            w4Var16 = null;
        }
        w4Var16.L0.setVisibility(0);
        w4 w4Var17 = this.J;
        if (w4Var17 == null) {
            l.v("mBinding");
        } else {
            w4Var2 = w4Var17;
        }
        w4Var2.f29169w.setVisibility(0);
    }

    public final String p2() {
        return this.T;
    }

    public final void p3(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.G0 = cVar;
    }

    public final String q2() {
        return this.U;
    }

    public final void q3(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.R0 = arrayList;
    }

    public final ArrayList r2() {
        ArrayList arrayList = this.R0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("listHeaderSteps");
        return null;
    }

    public final void r3(CombineServiceInterface combineServiceInterface) {
        l.f(combineServiceInterface, "<set-?>");
        this.W0 = combineServiceInterface;
    }

    public final CombineServiceInterface s2() {
        CombineServiceInterface combineServiceInterface = this.W0;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        l.v("mCombineServiceInterface");
        return null;
    }

    public final void s3(ArrayList arrayList) {
        this.E0 = arrayList;
    }

    public final ArrayList t2() {
        return this.E0;
    }

    public final void t3(ld.g gVar) {
        l.f(gVar, "<set-?>");
        this.f22189j0 = gVar;
    }

    public final ld.g u2() {
        ld.g gVar = this.f22189j0;
        if (gVar != null) {
            return gVar;
        }
        l.v("mSessionmanger");
        return null;
    }

    public final void u3(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.Q0 = arrayList;
    }

    public final String v2() {
        return this.P;
    }

    public final void v3(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.L = fVar;
    }

    public final ArrayList w2() {
        ArrayList arrayList = this.Q0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("multiListName");
        return null;
    }

    public final String x2() {
        return this.f22187h0;
    }

    public final ld.f y2() {
        ld.f fVar = this.L;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }
}
