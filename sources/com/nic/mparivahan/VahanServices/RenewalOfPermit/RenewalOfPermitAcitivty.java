package com.nic.mparivahan.VahanServices.RenewalOfPermit;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.VmRegionDetailsDto;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.RPSaveToDraftResponse;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftService.RPSaveToDraftService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import ld.c;
import ni.o7;
import pl.x;
import v9.e;

public final class RenewalOfPermitAcitivty extends d {
    public o7 G;
    public ng.a H;
    public RPSaveToDraftService I;
    public ProgressDialog J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public c X;
    public hg.b Y;
    private VmRegionDetailsDto Z;

    /* renamed from: a0  reason: collision with root package name */
    private ArrayList f20712a0 = new ArrayList();

    /* renamed from: b0  reason: collision with root package name */
    public String f20713b0;

    /* renamed from: c0  reason: collision with root package name */
    public NrvDetails f20714c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f20715d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f20716e0;

    /* renamed from: f0  reason: collision with root package name */
    public String f20717f0;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f20718g0;

    /* renamed from: h0  reason: collision with root package name */
    private String f20719h0 = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfPermitAcitivty f20720e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(RenewalOfPermitAcitivty renewalOfPermitAcitivty) {
            super(1);
            this.f20720e = renewalOfPermitAcitivty;
        }

        public final void b(RPSaveToDraftResponse rPSaveToDraftResponse) {
            this.f20720e.q1().dismiss();
            if (rPSaveToDraftResponse.getApiMessage().getStatusCode() == 200) {
                Intent intent = new Intent(this.f20720e, VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.PERMIT_RENEWAL_CODE);
                intent.putExtra(VContant.PERMIT_RENEWAL_CODE, rPSaveToDraftResponse.getData());
                intent.putExtra(VContant.APP_NO, rPSaveToDraftResponse.getData().getApplNo());
                NrvDetails x12 = this.f20720e.x1();
                intent.putExtra("state_code", x12 != null ? x12.getState_cd() : null);
                intent.putExtra("rc_number", this.f20720e.w1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE);
                intent.putExtra("off_code", this.f20720e.p1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this.f20720e.D1());
                intent.putExtra("RC", this.f20720e.w1());
                intent.putExtra("RcDetails", this.f20720e.x1());
                intent.putExtra(VContant.NEXGEN_addahar_name, this.f20720e.l1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this.f20720e.k1());
                this.f20720e.startActivity(intent);
                this.f20720e.finishAffinity();
                return;
            }
            VContant.Companion.K(this.f20720e, rPSaveToDraftResponse.getApiMessage().getDeveloperMessage().toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RPSaveToDraftResponse) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20721a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f20721a = lVar;
        }

        public final pl.c a() {
            return this.f20721a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20721a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void E1(RenewalOfPermitAcitivty renewalOfPermitAcitivty, View view) {
        cm.l.f(renewalOfPermitAcitivty, "this$0");
        VUtility.Companion.v(renewalOfPermitAcitivty, renewalOfPermitAcitivty.o1().b("are_you_sure_you_want_to_leave", renewalOfPermitAcitivty.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void F1(RenewalOfPermitAcitivty renewalOfPermitAcitivty, View view) {
        cm.l.f(renewalOfPermitAcitivty, "this$0");
        Intent intent = new Intent(renewalOfPermitAcitivty, VahanVehicleDetailsService.class);
        intent.putExtra("RC", renewalOfPermitAcitivty.w1());
        intent.putExtra("RcDetails", renewalOfPermitAcitivty.x1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, renewalOfPermitAcitivty.f20718g0);
        intent.putExtra(VContant.NEXGEN_addahar_name, renewalOfPermitAcitivty.l1());
        intent.putExtra(VContant.NEXGEN_addahar_address, renewalOfPermitAcitivty.k1());
        renewalOfPermitAcitivty.startActivity(intent);
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [java.lang.Object, java.lang.String] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void G1(com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitAcitivty r28, android.view.View r29) {
        /*
            r1 = r28
            java.lang.String r0 = "this$0"
            cm.l.f(r1, r0)
            java.util.ArrayList r0 = r1.f20712a0
            int r0 = r0.size()
            r2 = 0
            if (r0 <= 0) goto L_0x003f
            ni.o7 r0 = r28.m1()
            com.nic.mparivahan.MyTextView r0 = r0.f27768d
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r3 = 2
            if (r0 >= r3) goto L_0x003f
            ld.c r0 = r28.o1()
            r3 = 2132018805(0x7f140675, float:1.9675927E38)
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r4 = "please_select_the_area"
            java.lang.String r0 = r0.b(r4, r3)
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
            goto L_0x0111
        L_0x003f:
            com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.RPSaveToDraftModel r0 = new com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.RPSaveToDraftModel     // Catch:{ Exception -> 0x006b }
            java.lang.String r3 = ""
            java.lang.String r4 = r28.u1()     // Catch:{ Exception -> 0x006b }
            java.lang.String r5 = r28.v1()     // Catch:{ Exception -> 0x006b }
            java.lang.String r6 = ""
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r7 = r28.x1()     // Catch:{ Exception -> 0x006b }
            java.lang.String r7 = r7.getRc_chasi_no()     // Catch:{ Exception -> 0x006b }
            r8 = 0
            if (r7 == 0) goto L_0x0080
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r9 = r28.x1()     // Catch:{ Exception -> 0x006b }
            java.lang.String r9 = r9.getRc_chasi_no()     // Catch:{ Exception -> 0x006b }
            if (r9 == 0) goto L_0x006e
            int r8 = r9.length()     // Catch:{ Exception -> 0x006b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x006b }
            goto L_0x006e
        L_0x006b:
            r0 = move-exception
            goto L_0x010e
        L_0x006e:
            cm.l.c(r8)     // Catch:{ Exception -> 0x006b }
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x006b }
            int r8 = r8 + -5
            java.lang.String r8 = r7.substring(r8)     // Catch:{ Exception -> 0x006b }
            java.lang.String r7 = "this as java.lang.String).substring(startIndex)"
            cm.l.e(r8, r7)     // Catch:{ Exception -> 0x006b }
        L_0x0080:
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x006b }
            java.lang.String r9 = r28.n1()     // Catch:{ Exception -> 0x006b }
            java.lang.String r10 = ""
            ni.o7 r11 = r28.m1()     // Catch:{ Exception -> 0x006b }
            android.widget.EditText r11 = r11.f27776l     // Catch:{ Exception -> 0x006b }
            android.text.Editable r11 = r11.getText()     // Catch:{ Exception -> 0x006b }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x006b }
            java.lang.String r12 = r28.p1()     // Catch:{ Exception -> 0x006b }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ Exception -> 0x006b }
            v9.d$a r13 = v9.d.f17494a     // Catch:{ Exception -> 0x006b }
            java.lang.String r13 = r13.m()     // Catch:{ Exception -> 0x006b }
            ni.o7 r14 = r28.m1()     // Catch:{ Exception -> 0x006b }
            android.widget.EditText r14 = r14.f27770f     // Catch:{ Exception -> 0x006b }
            android.text.Editable r14 = r14.getText()     // Catch:{ Exception -> 0x006b }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x006b }
            java.lang.String r15 = r28.r1()     // Catch:{ Exception -> 0x006b }
            int r15 = java.lang.Integer.parseInt(r15)     // Catch:{ Exception -> 0x006b }
            java.lang.String r16 = r28.s1()     // Catch:{ Exception -> 0x006b }
            java.lang.String r17 = r28.t1()     // Catch:{ Exception -> 0x006b }
            int r17 = java.lang.Integer.parseInt(r17)     // Catch:{ Exception -> 0x006b }
            r8 = 1
            java.lang.Integer[] r8 = new java.lang.Integer[r8]     // Catch:{ Exception -> 0x006b }
            java.lang.String r18 = "27"
            int r18 = java.lang.Integer.parseInt(r18)     // Catch:{ Exception -> 0x006b }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x006b }
            r8[r2] = r18     // Catch:{ Exception -> 0x006b }
            java.util.ArrayList r18 = ql.q.e(r8)     // Catch:{ Exception -> 0x006b }
            java.lang.String r19 = ""
            java.lang.String r8 = r1.f20719h0     // Catch:{ Exception -> 0x006b }
            java.lang.String r21 = r28.y1()     // Catch:{ Exception -> 0x006b }
            java.lang.String r22 = ""
            java.lang.String r23 = ""
            java.lang.String r24 = r28.C1()     // Catch:{ Exception -> 0x006b }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r2 = r28.x1()     // Catch:{ Exception -> 0x006b }
            java.lang.String r2 = r2.getState_cd()     // Catch:{ Exception -> 0x006b }
            java.lang.String r25 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x006b }
            java.lang.String r26 = r28.u1()     // Catch:{ Exception -> 0x006b }
            java.lang.String r27 = r28.v1()     // Catch:{ Exception -> 0x006b }
            r2 = r0
            r20 = r8
            r8 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x006b }
            ng.a r2 = r28.A1()     // Catch:{ Exception -> 0x006b }
            r2.i(r0)     // Catch:{ Exception -> 0x006b }
            goto L_0x0111
        L_0x010e:
            r0.printStackTrace()
        L_0x0111:
            ng.a r0 = r28.A1()
            androidx.lifecycle.a0 r0 = r0.h()
            com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitAcitivty$a r2 = new com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitAcitivty$a
            r2.<init>(r1)
            com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitAcitivty$b r3 = new com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitAcitivty$b
            r3.<init>(r2)
            r0.g(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitAcitivty.G1(com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitAcitivty, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void H1(RenewalOfPermitAcitivty renewalOfPermitAcitivty, View view) {
        cm.l.f(renewalOfPermitAcitivty, "this$0");
        renewalOfPermitAcitivty.m1().f27770f.setText("");
        renewalOfPermitAcitivty.m1().f27776l.setText("");
    }

    public final ng.a A1() {
        ng.a aVar = this.H;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("rpSaveToDraftViewModel");
        return null;
    }

    public final RPSaveToDraftService B1() {
        RPSaveToDraftService rPSaveToDraftService = this.I;
        if (rPSaveToDraftService != null) {
            return rPSaveToDraftService;
        }
        cm.l.v("rpsavetodraftService");
        return null;
    }

    public final String C1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("servicesType");
        return null;
    }

    public final boolean D1() {
        return this.f20718g0;
    }

    public final void I1(VmRegionDetailsDto vmRegionDetailsDto, o7 o7Var) {
        cm.l.f(vmRegionDetailsDto, "region");
        cm.l.f(o7Var, "binding");
        this.f20712a0.clear();
        ArrayList<String> region = vmRegionDetailsDto.getRegion();
        cm.l.d(region, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        ArrayList<Integer> regionCd = vmRegionDetailsDto.getRegionCd();
        cm.l.d(regionCd, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Int> }");
        int size = region.size();
        for (int i10 = 0; i10 < size; i10++) {
            HashMap hashMap = new HashMap();
            hashMap.clear();
            hashMap.put("Regin", region.get(i10));
            hashMap.put("ReginCd", String.valueOf(regionCd.get(i10).intValue()));
            hashMap.put("Status", "0");
            this.f20712a0.add(hashMap);
        }
        if (region.size() > 0) {
            c2(new hg.b(this.f20712a0, this));
            o7Var.f27778n.setAdapter(z1());
            return;
        }
        o7Var.f27778n.setVisibility(8);
    }

    public final void J1(String str) {
        cm.l.f(str, "<set-?>");
        this.f20717f0 = str;
    }

    public final void K1(String str) {
        cm.l.f(str, "<set-?>");
        this.f20716e0 = str;
    }

    public final void L1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void M1(o7 o7Var) {
        cm.l.f(o7Var, "<set-?>");
        this.G = o7Var;
    }

    public final void N1(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final void O1(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.X = cVar;
    }

    public final void P1(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void Q1(String str) {
        cm.l.f(str, "<set-?>");
        this.f20715d0 = str;
    }

    public final void R1(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final void S1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void T1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void V1(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final void W1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void X1(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void Y1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void Z1(String str) {
        cm.l.f(str, "<set-?>");
        this.f20713b0 = str;
    }

    public final void a2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.f20714c0 = nrvDetails;
    }

    public final void b2(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void c2(hg.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.Y = bVar;
    }

    public final void d2(ng.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.H = aVar;
    }

    public final void e2(RPSaveToDraftService rPSaveToDraftService) {
        cm.l.f(rPSaveToDraftService, "<set-?>");
        this.I = rPSaveToDraftService;
    }

    public final void f2(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void g2(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public void h2(int i10, int i11) {
        try {
            ((HashMap) this.f20712a0.get(i10)).replace("Status", String.valueOf(i11));
            z1().j();
            j1(this.f20712a0);
        } catch (Exception unused) {
        }
    }

    public final void j1(ArrayList arrayList) {
        cm.l.f(arrayList, "reginList");
        int size = arrayList.size();
        int i10 = 0;
        String str = "";
        for (int i11 = 0; i11 < size; i11++) {
            if (p.p((String) ((HashMap) arrayList.get(i11)).get("Status"), "1", false, 2, (Object) null)) {
                i10++;
                str = str + "\n " + ((String) ((HashMap) arrayList.get(i11)).get("Regin"));
                this.f20719h0 = ((String) ((HashMap) arrayList.get(i11)).get("ReginCd")) + ',' + this.f20719h0;
            }
        }
        TextView textView = m1().f27780p;
        if (i10 > 0) {
            textView.setText("Total number of selected area : " + i10 + " \n" + str);
            return;
        }
        textView.setText("");
    }

    public final String k1() {
        String str = this.f20717f0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String l1() {
        String str = this.f20716e0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final o7 m1() {
        o7 o7Var = this.G;
        if (o7Var != null) {
            return o7Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final String n1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("goods");
        return null;
    }

    public final c o1() {
        c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, o1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        o7 m12;
        super.onCreate(bundle);
        o7 c10 = o7.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        M1(c10);
        setContentView((View) m1().b());
        e2(RPSaveToDraftService.f20709a.b(this));
        e.f17509a.P2(this, m1());
        S1(new ProgressDialog(this));
        O1(new c(this));
        q1().setMessage(o1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        String stringExtra = getIntent().getStringExtra("permitNo");
        cm.l.c(stringExtra);
        V1(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("permitValidFrom");
        cm.l.c(stringExtra2);
        X1(stringExtra2);
        String stringExtra3 = getIntent().getStringExtra("permitValidUpto");
        cm.l.c(stringExtra3);
        Y1(stringExtra3);
        String stringExtra4 = getIntent().getStringExtra("permitType");
        cm.l.c(stringExtra4);
        W1(stringExtra4);
        String stringExtra5 = getIntent().getStringExtra("permitCategory");
        cm.l.c(stringExtra5);
        U1(stringExtra5);
        String stringExtra6 = getIntent().getStringExtra("yearlyMode");
        cm.l.c(stringExtra6);
        g2(stringExtra6);
        String stringExtra7 = getIntent().getStringExtra("period");
        cm.l.c(stringExtra7);
        T1(stringExtra7);
        String stringExtra8 = getIntent().getStringExtra("allotOffice");
        cm.l.c(stringExtra8);
        L1(stringExtra8);
        String stringExtra9 = getIntent().getStringExtra("serviceType");
        cm.l.c(stringExtra9);
        f2(stringExtra9);
        String stringExtra10 = getIntent().getStringExtra("natureOfGoods");
        cm.l.c(stringExtra10);
        P1(stringExtra10);
        String stringExtra11 = getIntent().getStringExtra("goods");
        cm.l.c(stringExtra11);
        N1(stringExtra11);
        String stringExtra12 = getIntent().getStringExtra("otherGoods");
        cm.l.c(stringExtra12);
        R1(stringExtra12);
        String stringExtra13 = getIntent().getStringExtra("regNo");
        cm.l.c(stringExtra13);
        b2(stringExtra13);
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        a2((NrvDetails) serializableExtra);
        Q1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.f20718g0 = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        K1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        J1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Z1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("region");
        cm.l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.VmRegionDetailsDto");
        this.Z = (VmRegionDetailsDto) serializableExtra2;
        m1().f27778n.setLayoutManager(new LinearLayoutManager(this, 1, false));
        try {
            VmRegionDetailsDto vmRegionDetailsDto = this.Z;
            cm.l.c(vmRegionDetailsDto);
            if (vmRegionDetailsDto.getRegion() != null) {
                VmRegionDetailsDto vmRegionDetailsDto2 = this.Z;
                cm.l.c(vmRegionDetailsDto2);
                ArrayList<String> region = vmRegionDetailsDto2.getRegion();
                Integer valueOf = region != null ? Integer.valueOf(region.size()) : null;
                cm.l.c(valueOf);
                if (valueOf.intValue() > 0) {
                    VmRegionDetailsDto vmRegionDetailsDto3 = this.Z;
                    cm.l.c(vmRegionDetailsDto3);
                    I1(vmRegionDetailsDto3, m1());
                    d2((ng.a) new u0((x0) this, (u0.b) new mg.a(new lg.a(B1()))).a(ng.a.class));
                    m1().f27782r.f28305f.setOnClickListener(new gg.a(this));
                    TextView textView = m1().f27783s;
                    textView.setText(o1().b("vehicle_no", "Vehicle No.:") + ' ' + w1());
                    m1().f27784t.setText(o1().b("view_vehicle_details", "View Vehicle Details"));
                    m1().f27784t.setPaintFlags(8 | m1().f27784t.getPaintFlags());
                    m1().f27784t.setOnClickListener(new gg.b(this));
                    m1().f27772h.setOnClickListener(new gg.c(this));
                    m1().f27779o.setOnClickListener(new gg.d(this));
                }
                m1().f27767c.setVisibility(8);
                m12 = m1();
            } else {
                m1().f27767c.setVisibility(8);
                m12 = m1();
            }
            m12.f27769e.setVisibility(8);
        } catch (Exception unused) {
        }
        d2((ng.a) new u0((x0) this, (u0.b) new mg.a(new lg.a(B1()))).a(ng.a.class));
        m1().f27782r.f28305f.setOnClickListener(new gg.a(this));
        TextView textView2 = m1().f27783s;
        textView2.setText(o1().b("vehicle_no", "Vehicle No.:") + ' ' + w1());
        m1().f27784t.setText(o1().b("view_vehicle_details", "View Vehicle Details"));
        m1().f27784t.setPaintFlags(8 | m1().f27784t.getPaintFlags());
        m1().f27784t.setOnClickListener(new gg.b(this));
        m1().f27772h.setOnClickListener(new gg.c(this));
        m1().f27779o.setOnClickListener(new gg.d(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        cm.l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        VUtility.Companion.v(this, o1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final String p1() {
        String str = this.f20715d0;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String r1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("permitCategory");
        return null;
    }

    public final String s1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("permitNo");
        return null;
    }

    public final String t1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("permitType");
        return null;
    }

    public final String u1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("permitValidFrom");
        return null;
    }

    public final String v1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("permitValidUpto");
        return null;
    }

    public final String w1() {
        String str = this.f20713b0;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails x1() {
        NrvDetails nrvDetails = this.f20714c0;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final String y1() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        cm.l.v("regNo");
        return null;
    }

    public final hg.b z1() {
        hg.b bVar = this.Y;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("reginAdapter");
        return null;
    }
}
