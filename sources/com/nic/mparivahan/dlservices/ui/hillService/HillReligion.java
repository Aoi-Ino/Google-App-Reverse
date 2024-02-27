package com.nic.mparivahan.dlservices.ui.hillService;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowMetrics;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import bm.l;
import cm.h;
import cm.m;
import cm.u;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineReq;
import com.nic.mparivahan.DlCombineServices.CombineServiceInterface;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName;
import com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity;
import com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;
import com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity;
import com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity;
import com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import ni.t4;
import oi.g;
import pl.x;
import t8.c;
import tj.i;
import tj.j;
import tj.k;
import tj.n;
import tj.o;
import tj.p;
import v9.e;

public final class HillReligion extends g {
    public Context A0;
    /* access modifiers changed from: private */
    public t4 J;
    public DldetobjX K;
    private HashMap L = new HashMap();
    /* access modifiers changed from: private */
    public String M = "Y";
    public ld.f N;
    private String O;
    private String P;
    private String Q = "";
    private String R = "";
    private String S = "";
    private String T = "";
    private String U = "";
    private String V = "";
    private String W = "";
    private int X;
    private int Y;
    public ld.g Z;

    /* renamed from: a0  reason: collision with root package name */
    public ld.c f22147a0;
    /* access modifiers changed from: private */

    /* renamed from: b0  reason: collision with root package name */
    public vi.e f22148b0;

    /* renamed from: c0  reason: collision with root package name */
    public ArrayList f22149c0;

    /* renamed from: d0  reason: collision with root package name */
    public t9.a f22150d0;

    /* renamed from: e0  reason: collision with root package name */
    public ClInter f22151e0;

    /* renamed from: f0  reason: collision with root package name */
    private Calendar f22152f0 = Calendar.getInstance();

    /* renamed from: g0  reason: collision with root package name */
    private String f22153g0 = "G";

    /* renamed from: h0  reason: collision with root package name */
    public ArrayList f22154h0;

    /* renamed from: i0  reason: collision with root package name */
    public ArrayList f22155i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f22156j0;

    /* renamed from: k0  reason: collision with root package name */
    private int f22157k0;

    /* renamed from: l0  reason: collision with root package name */
    private int f22158l0;

    /* renamed from: m0  reason: collision with root package name */
    private String f22159m0;

    /* renamed from: n0  reason: collision with root package name */
    private String f22160n0;

    /* renamed from: o0  reason: collision with root package name */
    private ab.d f22161o0;

    /* renamed from: p0  reason: collision with root package name */
    public CombineServiceInterface f22162p0;

    /* renamed from: q0  reason: collision with root package name */
    private String f22163q0 = "";

    /* renamed from: r0  reason: collision with root package name */
    private String f22164r0 = "N";

    /* renamed from: s0  reason: collision with root package name */
    private String f22165s0 = "N";

    /* renamed from: t0  reason: collision with root package name */
    private String f22166t0 = "";

    /* renamed from: u0  reason: collision with root package name */
    private String f22167u0 = "";

    /* renamed from: v0  reason: collision with root package name */
    private String f22168v0 = "";

    /* renamed from: w0  reason: collision with root package name */
    private String f22169w0 = "";

    /* renamed from: x0  reason: collision with root package name */
    private String f22170x0 = "";

    /* renamed from: y0  reason: collision with root package name */
    private String f22171y0 = "";

    /* renamed from: z0  reason: collision with root package name */
    private String f22172z0 = "N";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HillReligion f22173e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(HillReligion hillReligion) {
            super(1);
            this.f22173e = hillReligion;
        }

        public final void b(vi.d dVar) {
            try {
                throw null;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((vi.d) null);
            return x.f30437a;
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HillReligion f22174e;

        b(HillReligion hillReligion) {
            this.f22174e = hillReligion;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            HillReligion hillReligion = this.f22174e;
            hillReligion.N2(((vi.a) hillReligion.d2().get(i10)).a());
            HillReligion hillReligion2 = this.f22174e;
            hillReligion2.L2(((vi.a) hillReligion2.d2().get(i10)).b());
            this.f22174e.M2(i10);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HillReligion f22175e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(HillReligion hillReligion) {
            super(1);
            this.f22175e = hillReligion;
        }

        public final void b(vi.c cVar) {
            t4 t4Var = null;
            try {
                t4 L1 = this.f22175e.J;
                if (L1 == null) {
                    cm.l.v("mBinding");
                    L1 = null;
                }
                L1.E.c(false);
                throw null;
            } catch (Exception unused) {
                t4 L12 = this.f22175e.J;
                if (L12 == null) {
                    cm.l.v("mBinding");
                } else {
                    t4Var = L12;
                }
                t4Var.E.c(false);
                HillReligion hillReligion = this.f22175e;
                hillReligion.A2(hillReligion.R1().b("service_is_not_present", this.f22175e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((vi.c) null);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HillReligion f22176e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f22177f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(HillReligion hillReligion, u uVar) {
            super(1);
            this.f22176e = hillReligion;
            this.f22177f = uVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v77, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.lang.String} */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cd, code lost:
            if (r1 == null) goto L_0x00cf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d3, code lost:
            r8 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x01f5, code lost:
            if (r1 == null) goto L_0x00cf;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(java.lang.String r33) {
            /*
                r32 = this;
                r0 = r32
                r1 = r33
                java.lang.String r2 = "it"
                cm.l.f(r1, r2)
                java.lang.String r2 = "yes"
                r3 = 1
                boolean r1 = km.p.o(r1, r2, r3)
                if (r1 == 0) goto L_0x01f9
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                java.lang.String r1 = r1.M
                java.lang.String r2 = "Y"
                boolean r1 = cm.l.a(r1, r2)
                r2 = 0
                r4 = 2132019337(0x7f140889, float:1.9677006E38)
                java.lang.String r5 = "service_is_not_present"
                java.lang.String r6 = "viewModel"
                java.lang.String r7 = "mBinding"
                r8 = 0
                if (r1 == 0) goto L_0x0142
                com.nic.mparivahan.a$a r1 = com.nic.mparivahan.a.f9624a
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r9 = r0.f22176e
                boolean r1 = r1.a(r9)
                if (r1 == 0) goto L_0x0123
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ni.t4 r1 = r1.J
                if (r1 != 0) goto L_0x0041
                cm.l.v(r7)
                r1 = r8
            L_0x0041:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r1 = r1.E
                r1.c(r3)
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                vi.e r1 = r1.f22148b0
                if (r1 != 0) goto L_0x0053
                cm.l.v(r6)
                r9 = r8
                goto L_0x0054
            L_0x0053:
                r9 = r1
            L_0x0054:
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                java.lang.String r10 = r1.P1()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                java.lang.String r11 = r1.Q1()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                java.lang.String r12 = r1.S1()
                java.lang.String r13 = "G"
                cm.u r1 = r0.f22177f
                java.lang.Object r1 = r1.f20234e
                r14 = r1
                java.lang.String r14 = (java.lang.String) r14
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                java.lang.String r15 = r1.M
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                java.lang.String r16 = r1.Y1()
                java.lang.String r17 = "Y"
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ni.t4 r1 = r1.J
                if (r1 != 0) goto L_0x0089
                cm.l.v(r7)
                r1 = r8
            L_0x0089:
                androidx.appcompat.widget.AppCompatEditText r1 = r1.f28672x
                android.text.Editable r1 = r1.getText()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.CharSequence r1 = km.q.B0(r1)
                java.lang.String r18 = r1.toString()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ni.t4 r1 = r1.J
                if (r1 != 0) goto L_0x00a7
                cm.l.v(r7)
                r1 = r8
            L_0x00a7:
                android.widget.TextView r1 = r1.U
                java.lang.CharSequence r1 = r1.getText()
                java.lang.String r19 = r1.toString()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ni.t4 r1 = r1.J
                if (r1 != 0) goto L_0x00bd
                cm.l.v(r7)
                r1 = r8
            L_0x00bd:
                android.widget.TextView r1 = r1.U
                java.lang.CharSequence r1 = r1.getText()
                java.lang.String r20 = r1.toString()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ni.t4 r1 = r1.J
                if (r1 != 0) goto L_0x00d3
            L_0x00cf:
                cm.l.v(r7)
                goto L_0x00d4
            L_0x00d3:
                r8 = r1
            L_0x00d4:
                android.widget.TextView r1 = r8.X
                java.lang.CharSequence r1 = r1.getText()
                java.lang.String r21 = r1.toString()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                java.lang.String r22 = r1.c2()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                int r1 = r1.b2()
                java.lang.String r23 = java.lang.String.valueOf(r1)
                java.lang.String r24 = "mobSARATHI"
                java.lang.String r25 = "10.248.210.8"
                java.lang.String r26 = "657d1c758e2e95af0014e16f5109f933"
                java.lang.String r27 = "sarathiservice"
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ld.f r1 = r1.a2()
                java.lang.String r28 = r1.f()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ld.f r1 = r1.a2()
                java.lang.String r29 = r1.g()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ld.f r1 = r1.a2()
                java.lang.String r30 = r1.e()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ld.f r1 = r1.a2()
                java.lang.String r31 = r1.h()
                r9.h(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                goto L_0x01f9
            L_0x0123:
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                android.content.Context r1 = r1.getApplicationContext()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r3 = r0.f22176e
                ld.c r3 = r3.R1()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r6 = r0.f22176e
                java.lang.String r4 = r6.getString(r4)
                java.lang.String r3 = r3.b(r5, r4)
                android.widget.Toast r1 = android.widget.Toast.makeText(r1, r3, r2)
                r1.show()
                goto L_0x01f9
            L_0x0142:
                com.nic.mparivahan.a$a r1 = com.nic.mparivahan.a.f9624a
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r9 = r0.f22176e
                boolean r1 = r1.a(r9)
                if (r1 == 0) goto L_0x0123
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ni.t4 r1 = r1.J
                if (r1 != 0) goto L_0x0158
                cm.l.v(r7)
                r1 = r8
            L_0x0158:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r1 = r1.E
                r1.c(r3)
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ni.t4 r1 = r1.J
                if (r1 != 0) goto L_0x0169
                cm.l.v(r7)
                r1 = r8
            L_0x0169:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r1 = r1.E
                r1.c(r3)
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                vi.e r1 = r1.f22148b0
                if (r1 != 0) goto L_0x017b
                cm.l.v(r6)
                r9 = r8
                goto L_0x017c
            L_0x017b:
                r9 = r1
            L_0x017c:
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                java.lang.String r10 = r1.P1()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                java.lang.String r11 = r1.Q1()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                java.lang.String r12 = r1.S1()
                java.lang.String r13 = "G"
                cm.u r1 = r0.f22177f
                java.lang.Object r1 = r1.f20234e
                r14 = r1
                java.lang.String r14 = (java.lang.String) r14
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                java.lang.String r15 = r1.M
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                java.lang.String r16 = r1.Y1()
                java.lang.String r17 = "Y"
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ni.t4 r1 = r1.J
                if (r1 != 0) goto L_0x01b1
                cm.l.v(r7)
                r1 = r8
            L_0x01b1:
                androidx.appcompat.widget.AppCompatEditText r1 = r1.f28672x
                android.text.Editable r1 = r1.getText()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.CharSequence r1 = km.q.B0(r1)
                java.lang.String r18 = r1.toString()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ni.t4 r1 = r1.J
                if (r1 != 0) goto L_0x01cf
                cm.l.v(r7)
                r1 = r8
            L_0x01cf:
                android.widget.TextView r1 = r1.U
                java.lang.CharSequence r1 = r1.getText()
                java.lang.String r19 = r1.toString()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ni.t4 r1 = r1.J
                if (r1 != 0) goto L_0x01e5
                cm.l.v(r7)
                r1 = r8
            L_0x01e5:
                android.widget.TextView r1 = r1.U
                java.lang.CharSequence r1 = r1.getText()
                java.lang.String r20 = r1.toString()
                com.nic.mparivahan.dlservices.ui.hillService.HillReligion r1 = r0.f22176e
                ni.t4 r1 = r1.J
                if (r1 != 0) goto L_0x00d3
                goto L_0x00cf
            L_0x01f9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.hillService.HillReligion.d.b(java.lang.String):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final e f22178e = new e();

        e() {
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

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f22179a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f22179a = lVar;
        }

        public final pl.c a() {
            return this.f22179a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22179a.invoke(obj);
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

    private final void B2() {
        ab.d dVar;
        String str;
        Intent intent;
        String str2;
        String str3;
        String str4;
        t4 t4Var;
        Class<CombineReq> cls = CombineReq.class;
        String str5 = "";
        if (Z1().size() > this.f22158l0) {
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
                combineReq2.setDupDlReasonName(combineReq.getDupDlReasonName());
                combineReq2.setDupDlReasonCode(combineReq.getDupDlReasonCode());
                combineReq2.setDleDlReasonCode(combineReq.getDleDlReasonCode());
                combineReq2.setDleDlReasonName(combineReq.getDleDlReasonName());
                combineReq2.setApplcatgDLserReq(combineReq.getApplcatgDLserReq());
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
                combineReq2.setDeclaringcheck("Y");
                t4 t4Var2 = this.J;
                if (t4Var2 == null) {
                    cm.l.v("mBinding");
                    t4Var2 = null;
                }
                combineReq2.setHillcertificate(q.B0(String.valueOf(t4Var2.f28672x.getText())).toString());
                t4 t4Var3 = this.J;
                if (t4Var3 == null) {
                    cm.l.v("mBinding");
                    t4Var3 = null;
                }
                combineReq2.setHillissueDate(t4Var3.U.getText().toString());
                t4 t4Var4 = this.J;
                if (t4Var4 == null) {
                    cm.l.v("mBinding");
                    t4Var4 = null;
                }
                combineReq2.setHillvalidFrom(t4Var4.U.getText().toString());
                t4 t4Var5 = this.J;
                if (t4Var5 == null) {
                    cm.l.v("mBinding");
                    t4Var5 = null;
                }
                combineReq2.setHillvalidTo(t4Var5.X.getText().toString());
                combineReq2.setHilldrivingschool(this.W);
                combineReq2.setHillissby(String.valueOf(this.X));
                if (cm.l.a(this.M, "Y")) {
                    combineReq2.setWilltoDonateOrgans("Y");
                    t4 t4Var6 = this.J;
                    if (t4Var6 == null) {
                        cm.l.v("mBinding");
                        t4Var = null;
                    } else {
                        t4Var = t4Var6;
                    }
                    str = String.valueOf(t4Var.K.getText());
                } else {
                    combineReq2.setWilltoDonateOrgans("N");
                    str = "NA";
                }
                combineReq2.setDlHolderAltMobMum(str);
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
                edit.putString("MultiService", new i7.d().t(combineReq2));
                edit.commit();
                if (cm.l.a(Z1().get(this.f22158l0), R1().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                    setIntent(new Intent(this, DLDuplicateActivity.class));
                    intent = getIntent();
                    cm.l.e(intent, "getIntent(...)");
                    str2 = this.T;
                    str3 = this.S;
                    str4 = "513";
                } else {
                    Class<RenewalOfDLActivity> cls2 = RenewalOfDLActivity.class;
                    if (cm.l.a(Z1().get(this.f22158l0), R1().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        setIntent(new Intent(this, cls2));
                        intent = getIntent();
                        cm.l.e(intent, "getIntent(...)");
                        str2 = this.T;
                        str3 = this.S;
                        str4 = "514";
                    } else if (cm.l.a(Z1().get(this.f22158l0), R1().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        setIntent(new Intent(this, cls2));
                        intent = getIntent();
                        cm.l.e(intent, "getIntent(...)");
                        str2 = this.T;
                        str3 = this.S;
                        str4 = "537";
                    } else if (cm.l.a(Z1().get(this.f22158l0), R1().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                        setIntent(new Intent(this, ChangeOfAddressActivity.class));
                        intent = getIntent();
                        cm.l.e(intent, "getIntent(...)");
                        str2 = this.T;
                        str3 = this.S;
                        str4 = "515";
                    } else if (cm.l.a(Z1().get(this.f22158l0), R1().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                        setIntent(new Intent(this, DLReplecementActivity.class));
                        intent = getIntent();
                        cm.l.e(intent, "getIntent(...)");
                        str2 = this.T;
                        str3 = this.S;
                        str4 = "516";
                    } else if (cm.l.a(Z1().get(this.f22158l0), R1().b("check_dl_serv_extract_dl", "DL Extract"))) {
                        setIntent(new Intent(this, DLExtractActivity.class));
                        intent = getIntent();
                        cm.l.e(intent, "getIntent(...)");
                        str2 = this.T;
                        str3 = this.S;
                        str4 = "523";
                    } else if (cm.l.a(Z1().get(this.f22158l0), R1().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                        setIntent(new Intent(this, HillReligion.class));
                        intent = getIntent();
                        cm.l.e(intent, "getIntent(...)");
                        str2 = this.T;
                        str3 = this.S;
                        str4 = "524";
                    } else if (cm.l.a(Z1().get(this.f22158l0), R1().b("change_name_dl", "Change of Name in DL"))) {
                        setIntent(new Intent(this, ChangeOfName.class));
                        intent = getIntent();
                        cm.l.e(intent, "getIntent(...)");
                        str2 = this.T;
                        str3 = this.S;
                        str4 = "526";
                    } else if (cm.l.a(Z1().get(this.f22158l0), R1().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                        setIntent(new Intent(this, DobChangeActivity.class));
                        intent = getIntent();
                        cm.l.e(intent, "getIntent(...)");
                        str2 = this.T;
                        str3 = this.S;
                        str4 = "548";
                    } else {
                        return;
                    }
                }
                g2(intent, str2, str3, str4, Z1());
            } catch (Exception unused) {
            }
        } else {
            if (com.nic.mparivahan.a.f9624a.a(this)) {
                CombineReq combineReq3 = (CombineReq) new i7.d().j(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", str5), cls);
                t4 t4Var7 = this.J;
                if (t4Var7 == null) {
                    cm.l.v("mBinding");
                    t4Var7 = null;
                }
                t4Var7.E.c(true);
                if (cm.l.a(this.M, "Y")) {
                    t4 t4Var8 = this.J;
                    if (t4Var8 == null) {
                        cm.l.v("mBinding");
                        t4Var8 = null;
                    }
                    str5 = String.valueOf(t4Var8.K.getText());
                }
                String str6 = str5;
                ArrayList arrayList = new ArrayList();
                int size = O1().getDlcovs().size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(String.valueOf(O1().getDlcovs().get(i10).getDcCovcd()));
                }
                ab.d dVar2 = this.f22161o0;
                if (dVar2 == null) {
                    cm.l.v("mCombineViewModel");
                    dVar = null;
                } else {
                    dVar = dVar2;
                }
                boolean z10 = this.f22156j0;
                String str7 = this.f22159m0;
                cm.l.c(str7);
                String str8 = this.f22160n0;
                cm.l.c(str8);
                ArrayList Z1 = Z1();
                String applcatgDLserReq = combineReq3.getApplcatgDLserReq();
                cm.l.c(applcatgDLserReq);
                String str9 = this.O;
                cm.l.c(str9);
                String str10 = this.P;
                cm.l.c(str10);
                String str11 = this.T;
                String str12 = this.M;
                cm.l.c(str12);
                String relationType = combineReq3.getRelationType();
                cm.l.c(relationType);
                String valueOf = String.valueOf(combineReq3.getConDlReasonCode());
                cm.l.c(valueOf);
                String conDlReasonName = combineReq3.getConDlReasonName();
                cm.l.c(conDlReasonName);
                String dlHolderNaturalName = combineReq3.getDlHolderNaturalName();
                cm.l.c(dlHolderNaturalName);
                String conEffdate = combineReq3.getConEffdate();
                cm.l.c(conEffdate);
                String applFirstName = combineReq3.getApplFirstName();
                cm.l.c(applFirstName);
                String applLastName = combineReq3.getApplLastName();
                cm.l.c(applLastName);
                String relFirstName = combineReq3.getRelFirstName();
                cm.l.c(relFirstName);
                String relLastName = combineReq3.getRelLastName();
                cm.l.c(relLastName);
                String str13 = this.Q;
                cm.l.c(str13);
                String changeOfAddReq = combineReq3.getChangeOfAddReq();
                cm.l.c(changeOfAddReq);
                String perHouseNo = combineReq3.getPerHouseNo();
                cm.l.c(perHouseNo);
                String perStreet = combineReq3.getPerStreet();
                cm.l.c(perStreet);
                String perLocation = combineReq3.getPerLocation();
                cm.l.c(perLocation);
                String permVillageOrTown = combineReq3.getPermVillageOrTown();
                cm.l.c(permVillageOrTown);
                String perSubDistrict = combineReq3.getPerSubDistrict();
                cm.l.c(perSubDistrict);
                String perDistrict = combineReq3.getPerDistrict();
                cm.l.c(perDistrict);
                String perState = combineReq3.getPerState();
                cm.l.c(perState);
                String perPinCode = combineReq3.getPerPinCode();
                cm.l.c(perPinCode);
                String presHouseNo = combineReq3.getPresHouseNo();
                cm.l.c(presHouseNo);
                String presStreet = combineReq3.getPresStreet();
                cm.l.c(presStreet);
                String presLocation = combineReq3.getPresLocation();
                cm.l.c(presLocation);
                String presVillageOrTown = combineReq3.getPresVillageOrTown();
                cm.l.c(presVillageOrTown);
                String presSubDistrict = combineReq3.getPresSubDistrict();
                cm.l.c(presSubDistrict);
                String presDistrict = combineReq3.getPresDistrict();
                cm.l.c(presDistrict);
                String presState = combineReq3.getPresState();
                cm.l.c(presState);
                String presPincode = combineReq3.getPresPincode();
                cm.l.c(presPincode);
                String dleDlReasonCode = combineReq3.getDleDlReasonCode();
                cm.l.c(dleDlReasonCode);
                String dleDlReasonName = combineReq3.getDleDlReasonName();
                cm.l.c(dleDlReasonName);
                String dupDlReasonName = combineReq3.getDupDlReasonName();
                cm.l.c(dupDlReasonName);
                String dupDlReasonCode = combineReq3.getDupDlReasonCode();
                cm.l.c(dupDlReasonCode);
                String applDateOfBirth = combineReq3.getApplDateOfBirth();
                cm.l.c(applDateOfBirth);
                String codobDlReasonName = combineReq3.getCodobDlReasonName();
                cm.l.c(codobDlReasonName);
                String codobDlReasonCode = combineReq3.getCodobDlReasonCode();
                cm.l.c(codobDlReasonCode);
                t4 t4Var9 = this.J;
                if (t4Var9 == null) {
                    cm.l.v("mBinding");
                    t4Var9 = null;
                }
                String obj = q.B0(String.valueOf(t4Var9.f28672x.getText())).toString();
                t4 t4Var10 = this.J;
                if (t4Var10 == null) {
                    cm.l.v("mBinding");
                    t4Var10 = null;
                }
                String obj2 = t4Var10.U.getText().toString();
                t4 t4Var11 = this.J;
                if (t4Var11 == null) {
                    cm.l.v("mBinding");
                    t4Var11 = null;
                }
                String obj3 = t4Var11.U.getText().toString();
                t4 t4Var12 = this.J;
                if (t4Var12 == null) {
                    cm.l.v("mBinding");
                    t4Var12 = null;
                }
                String obj4 = t4Var12.X.getText().toString();
                String str14 = this.W;
                String valueOf2 = String.valueOf(this.X);
                String pofbirth = combineReq3.getPofbirth();
                cm.l.c(pofbirth);
                String country = combineReq3.getCountry();
                cm.l.c(country);
                String passno = combineReq3.getPassno();
                cm.l.c(passno);
                String passvaltill = combineReq3.getPassvaltill();
                cm.l.c(passvaltill);
                String visano = combineReq3.getVisano();
                cm.l.c(visano);
                String visavaltill = combineReq3.getVisavaltill();
                cm.l.c(visavaltill);
                String tovisit = combineReq3.getTovisit();
                cm.l.c(tovisit);
                String iscountryrestricted = combineReq3.getIscountryrestricted();
                cm.l.c(iscountryrestricted);
                String countryRestrictedReason = combineReq3.getCountryRestrictedReason();
                cm.l.c(countryRestrictedReason);
                String isDlSerdisqualified = combineReq3.isDlSerdisqualified();
                cm.l.c(isDlSerdisqualified);
                String dlSerdisqualifiedReason = combineReq3.getDlSerdisqualifiedReason();
                cm.l.c(dlSerdisqualifiedReason);
                String forAdd1 = combineReq3.getForAdd1();
                cm.l.c(forAdd1);
                String forAdd2 = combineReq3.getForAdd2();
                cm.l.c(forAdd2);
                String forAdd3 = combineReq3.getForAdd3();
                cm.l.c(forAdd3);
                String forAddPinCode = combineReq3.getForAddPinCode();
                cm.l.c(forAddPinCode);
                String forNationMobNum = combineReq3.getForNationMobNum();
                cm.l.c(forNationMobNum);
                String emailID = combineReq3.getEmailID();
                cm.l.c(emailID);
                String appliedIdpfromIndEmb = combineReq3.getAppliedIdpfromIndEmb();
                cm.l.c(appliedIdpfromIndEmb);
                String indEmbName = combineReq3.getIndEmbName();
                cm.l.c(indEmbName);
                String embPlace = combineReq3.getEmbPlace();
                cm.l.c(embPlace);
                String dateOfVerifEmb = combineReq3.getDateOfVerifEmb();
                cm.l.c(dateOfVerifEmb);
                String embEndorseNo = combineReq3.getEmbEndorseNo();
                cm.l.c(embEndorseNo);
                String idpcountryapplyfrom = combineReq3.getIdpcountryapplyfrom();
                cm.l.c(idpcountryapplyfrom);
                dVar.g(z10, arrayList, str7, str8, Z1, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", applcatgDLserReq, str6, str9, str10, str11, str12, relationType, valueOf, conDlReasonName, dlHolderNaturalName, conEffdate, applFirstName, applLastName, relFirstName, relLastName, str13, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, dleDlReasonCode, dleDlReasonName, dupDlReasonName, dupDlReasonCode, applDateOfBirth, codobDlReasonName, codobDlReasonCode, "Y", obj, obj2, obj3, obj4, str14, valueOf2, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, isDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, a2().f(), a2().g(), a2().e(), a2().h());
                return;
            }
            Toast.makeText(getApplicationContext(), R1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
    }

    private final void e2() {
        D2(new ld.c(this));
        this.f22148b0 = (vi.e) new u0(this).a(vi.e.class);
        G2(ClInter.f7830a.a(this));
        F2((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(V1()))).a(t9.a.class));
        t4 t4Var = null;
        if (getIntent() != null) {
            try {
                this.O = String.valueOf(getIntent().getStringExtra("DL"));
                this.P = String.valueOf(getIntent().getStringExtra("dob"));
                this.Q = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                C2((DldetobjX) serializableExtra);
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                cm.l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.R = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("lastEndorsedRTOCode");
                cm.l.d(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.T = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("lastEndorsedState");
                cm.l.d(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.S = stringExtra3;
                String stringExtra4 = getIntent().getStringExtra("lastEndorseStateCode");
                cm.l.d(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.U = stringExtra4;
                String stringExtra5 = getIntent().getStringExtra("state_value");
                cm.l.d(stringExtra5, "null cannot be cast to non-null type kotlin.String");
                this.V = stringExtra5;
                Serializable serializableExtra2 = getIntent().getSerializableExtra("whatServiceRequired");
                cm.l.d(serializableExtra2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>");
                this.L = (HashMap) serializableExtra2;
                t4 t4Var2 = this.J;
                if (t4Var2 == null) {
                    cm.l.v("mBinding");
                    t4Var2 = null;
                }
                t4Var2.f28673y.setText(R1().b("dl_no", "DL No. : ") + ' ' + this.O);
            } catch (Exception unused) {
            }
        }
        t4 t4Var3 = this.J;
        if (t4Var3 == null) {
            cm.l.v("mBinding");
            t4Var3 = null;
        }
        TextView textView = t4Var3.Z;
        t4 t4Var4 = this.J;
        if (t4Var4 == null) {
            cm.l.v("mBinding");
            t4Var4 = null;
        }
        textView.setPaintFlags(t4Var4.Z.getPaintFlags() | 8);
        t4 t4Var5 = this.J;
        if (t4Var5 == null) {
            cm.l.v("mBinding");
            t4Var5 = null;
        }
        t4Var5.Z.setOnClickListener(new tj.g(this));
        U1().m(this, this.U);
        U1().q().g(this, new f(new a(this)));
        t4 t4Var6 = this.J;
        if (t4Var6 == null) {
            cm.l.v("mBinding");
        } else {
            t4Var = t4Var6;
        }
        t4Var.D.setOnItemSelectedListener(new b(this));
    }

    /* access modifiers changed from: private */
    public static final void f2(HillReligion hillReligion, View view) {
        cm.l.f(hillReligion, "this$0");
        Intent intent = new Intent(hillReligion, DlServiceDetailsActivity.class);
        intent.putExtra("DL", hillReligion.O);
        intent.putExtra("dob", hillReligion.P);
        intent.putExtra("DLDetails", hillReligion.O1());
        intent.putExtra("Mobile_no", hillReligion.Q);
        intent.putExtra("lastEndorsedRTO", hillReligion.R);
        intent.putExtra("lastEndorsedState", hillReligion.S);
        intent.putExtra("lastEndorsedRTOCode", hillReligion.T);
        intent.putExtra("lastEndorseStateCode", hillReligion.U);
        intent.putExtra("whatServiceRequired", hillReligion.L);
        hillReligion.startActivity(intent);
    }

    private final void g2(Intent intent, String str, String str2, String str3, ArrayList arrayList) {
        try {
            intent.putExtra("DL", this.O);
            intent.putExtra("dob", this.P);
            intent.putExtra("DLDetails", O1());
            intent.putExtra("Mobile_no", this.Q);
            intent.putExtra("lastEndorsedRTO", str);
            intent.putExtra("lastEndorsedState", str2);
            intent.putExtra("lastEndorsedRTOCode", this.T);
            intent.putExtra("lastEndorseStateCode", this.U);
            intent.putExtra("whatServiceRequired", this.L);
            intent.putExtra("state_value", this.V);
            intent.putExtra("purCode", str3);
            intent.putExtra("bioRecGenesis", "S");
            intent.putExtra("allowAddrChangeAtDlservReqst", "N");
            intent.putExtra("metaflag", this.f22163q0);
            intent.putExtra("multiList", arrayList);
            intent.putExtra("listHeaderSteps", T1());
            intent.putExtra("serialNo", this.f22158l0 + 1);
            intent.putExtra("COA", this.f22156j0);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void h2() {
        t4 t4Var = this.J;
        t4 t4Var2 = null;
        if (t4Var == null) {
            cm.l.v("mBinding");
            t4Var = null;
        }
        t4Var.N.setOnClickListener(new p(this));
        t4 t4Var3 = this.J;
        if (t4Var3 == null) {
            cm.l.v("mBinding");
            t4Var3 = null;
        }
        t4Var3.f28670a0.setOnClickListener(new tj.b(this));
        t4 t4Var4 = this.J;
        if (t4Var4 == null) {
            cm.l.v("mBinding");
            t4Var4 = null;
        }
        t4Var4.J.setOnClickListener(new tj.c(this));
        t4 t4Var5 = this.J;
        if (t4Var5 == null) {
            cm.l.v("mBinding");
            t4Var5 = null;
        }
        t4Var5.E.setOnClickListener(new tj.d(this));
        tj.e eVar = new tj.e(this);
        t4 t4Var6 = this.J;
        if (t4Var6 == null) {
            cm.l.v("mBinding");
        } else {
            t4Var2 = t4Var6;
        }
        t4Var2.U.setOnClickListener(new tj.f(this, eVar));
    }

    /* access modifiers changed from: private */
    public static final void i2(HillReligion hillReligion, View view) {
        cm.l.f(hillReligion, "this$0");
        hillReligion.finish();
    }

    /* access modifiers changed from: private */
    public static final void j2(HillReligion hillReligion, View view) {
        cm.l.f(hillReligion, "this$0");
        hillReligion.M = "Y";
        t4 t4Var = hillReligion.J;
        t4 t4Var2 = null;
        if (t4Var == null) {
            cm.l.v("mBinding");
            t4Var = null;
        }
        t4Var.J.setChecked(false);
        t4 t4Var3 = hillReligion.J;
        if (t4Var3 == null) {
            cm.l.v("mBinding");
            t4Var3 = null;
        }
        t4Var3.f28670a0.setChecked(true);
        t4 t4Var4 = hillReligion.J;
        if (t4Var4 == null) {
            cm.l.v("mBinding");
            t4Var4 = null;
        }
        t4Var4.K.setText((CharSequence) null);
        t4 t4Var5 = hillReligion.J;
        if (t4Var5 == null) {
            cm.l.v("mBinding");
        } else {
            t4Var2 = t4Var5;
        }
        t4Var2.K.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void k2(HillReligion hillReligion, View view) {
        cm.l.f(hillReligion, "this$0");
        hillReligion.M = "N";
        t4 t4Var = hillReligion.J;
        t4 t4Var2 = null;
        if (t4Var == null) {
            cm.l.v("mBinding");
            t4Var = null;
        }
        t4Var.J.setChecked(true);
        t4 t4Var3 = hillReligion.J;
        if (t4Var3 == null) {
            cm.l.v("mBinding");
            t4Var3 = null;
        }
        t4Var3.f28670a0.setChecked(false);
        t4 t4Var4 = hillReligion.J;
        if (t4Var4 == null) {
            cm.l.v("mBinding");
            t4Var4 = null;
        }
        t4Var4.K.setText((CharSequence) null);
        t4 t4Var5 = hillReligion.J;
        if (t4Var5 == null) {
            cm.l.v("mBinding");
        } else {
            t4Var2 = t4Var5;
        }
        t4Var2.K.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void l2(HillReligion hillReligion, View view) {
        String str;
        ld.c R1;
        int i10;
        String b10;
        cm.l.f(hillReligion, "this$0");
        if (cm.l.a(hillReligion.a2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            hillReligion.o2();
            return;
        }
        t4 t4Var = hillReligion.J;
        t4 t4Var2 = null;
        if (t4Var == null) {
            cm.l.v("mBinding");
            t4Var = null;
        }
        if (String.valueOf(t4Var.f28672x.getText()).length() == 0) {
            str = "Please enter certificate number";
        } else {
            t4 t4Var3 = hillReligion.J;
            if (t4Var3 == null) {
                cm.l.v("mBinding");
                t4Var3 = null;
            }
            if (String.valueOf(t4Var3.f28672x.getText()).length() < 3) {
                str = "Please enter valid certificate number";
            } else {
                t4 t4Var4 = hillReligion.J;
                if (t4Var4 == null) {
                    cm.l.v("mBinding");
                    t4Var4 = null;
                }
                String obj = t4Var4.U.getText().toString();
                if (obj == null || obj.length() == 0) {
                    str = "Please enter issue date";
                } else if (hillReligion.Y == 0) {
                    str = "Please select issued by";
                } else {
                    if (cm.l.a(hillReligion.M, "Y")) {
                        t4 t4Var5 = hillReligion.J;
                        if (t4Var5 == null) {
                            cm.l.v("mBinding");
                            t4Var5 = null;
                        }
                        Editable text = t4Var5.K.getText();
                        cm.l.c(text);
                        if (text.length() == 0) {
                            b10 = hillReligion.R1().b("edit_dl_serv_emer_cont_no", hillReligion.getString(R.string.emergency_contact));
                        } else {
                            t4 t4Var6 = hillReligion.J;
                            if (t4Var6 == null) {
                                cm.l.v("mBinding");
                                t4Var6 = null;
                            }
                            Editable text2 = t4Var6.K.getText();
                            cm.l.c(text2);
                            if (text2.length() < 10) {
                                R1 = hillReligion.R1();
                                i10 = R.string.plz_select_bank;
                            } else {
                                c.a aVar = t8.c.f16582a;
                                t4 t4Var7 = hillReligion.J;
                                if (t4Var7 == null) {
                                    cm.l.v("mBinding");
                                } else {
                                    t4Var2 = t4Var7;
                                }
                                if (!aVar.q(String.valueOf(t4Var2.K.getText()))) {
                                    R1 = hillReligion.R1();
                                    i10 = R.string.enter_mobile_no;
                                }
                            }
                            b10 = R1.b("label_log_entr_vali_mobno", hillReligion.getString(i10));
                        }
                        hillReligion.A2(b10);
                        return;
                    }
                    String b11 = hillReligion.R1().b("label_want_to_proceed", hillReligion.getString(R.string.are_you_want_to_proceed));
                    cm.l.c(b11);
                    hillReligion.z2(b11);
                    return;
                }
            }
        }
        Toast.makeText(hillReligion, str, 1).show();
    }

    /* access modifiers changed from: private */
    public static final void m2(HillReligion hillReligion, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(hillReligion, "this$0");
        hillReligion.f22152f0.set(1, i10);
        hillReligion.f22152f0.set(2, i11);
        hillReligion.f22152f0.set(5, i12);
        CharSequence format = DateFormat.format("dd", hillReligion.f22152f0.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        String str = (String) format;
        CharSequence format2 = DateFormat.format("MM", hillReligion.f22152f0.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) format2;
        CharSequence format3 = DateFormat.format("yyyy", hillReligion.f22152f0.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) format3;
        t4 t4Var = hillReligion.J;
        t4 t4Var2 = null;
        if (t4Var == null) {
            cm.l.v("mBinding");
            t4Var = null;
        }
        t4Var.U.setText(str + '-' + str2 + '-' + str3);
        int parseInt = Integer.parseInt(str3) + 1;
        t4 t4Var3 = hillReligion.J;
        if (t4Var3 == null) {
            cm.l.v("mBinding");
        } else {
            t4Var2 = t4Var3;
        }
        t4Var2.X.setText(str + '-' + str2 + '-' + parseInt);
    }

    /* access modifiers changed from: private */
    public static final void n2(HillReligion hillReligion, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(hillReligion, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        hillReligion.l1();
        DatePickerDialog datePickerDialog = new DatePickerDialog(hillReligion, onDateSetListener, hillReligion.f22152f0.get(1), hillReligion.f22152f0.get(2), hillReligion.f22152f0.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    private final void o2() {
        String str;
        ld.c R1;
        int i10;
        String b10;
        t4 t4Var = this.J;
        t4 t4Var2 = null;
        if (t4Var == null) {
            cm.l.v("mBinding");
            t4Var = null;
        }
        if (String.valueOf(t4Var.f28672x.getText()).length() == 0) {
            str = "Please enter certificate number";
        } else {
            t4 t4Var3 = this.J;
            if (t4Var3 == null) {
                cm.l.v("mBinding");
                t4Var3 = null;
            }
            if (String.valueOf(t4Var3.f28672x.getText()).length() < 3) {
                str = "Please enter valid certificate number";
            } else {
                t4 t4Var4 = this.J;
                if (t4Var4 == null) {
                    cm.l.v("mBinding");
                    t4Var4 = null;
                }
                String obj = t4Var4.U.getText().toString();
                if (obj == null || obj.length() == 0) {
                    str = "Please enter issue date";
                } else if (this.Y == 0) {
                    str = "Please select issued by";
                } else {
                    if (cm.l.a(this.M, "Y")) {
                        t4 t4Var5 = this.J;
                        if (t4Var5 == null) {
                            cm.l.v("mBinding");
                            t4Var5 = null;
                        }
                        Editable text = t4Var5.K.getText();
                        cm.l.c(text);
                        if (text.length() == 0) {
                            b10 = R1().b("edit_dl_serv_emer_cont_no", getString(R.string.emergency_contact));
                        } else {
                            t4 t4Var6 = this.J;
                            if (t4Var6 == null) {
                                cm.l.v("mBinding");
                                t4Var6 = null;
                            }
                            Editable text2 = t4Var6.K.getText();
                            cm.l.c(text2);
                            if (text2.length() < 10) {
                                R1 = R1();
                                i10 = R.string.plz_select_bank;
                            } else {
                                c.a aVar = t8.c.f16582a;
                                t4 t4Var7 = this.J;
                                if (t4Var7 == null) {
                                    cm.l.v("mBinding");
                                } else {
                                    t4Var2 = t4Var7;
                                }
                                if (!aVar.q(String.valueOf(t4Var2.K.getText()))) {
                                    R1 = R1();
                                    i10 = R.string.enter_mobile_no;
                                }
                            }
                            b10 = R1.b("label_log_entr_vali_mobno", getString(i10));
                        }
                        A2(b10);
                        return;
                    }
                    B2();
                    return;
                }
            }
        }
        Toast.makeText(this, str, 1).show();
    }

    private final void p2() {
        H2(CombineServiceInterface.f8704a.a(this));
        ab.d dVar = (ab.d) new u0((x0) this, (u0.b) new ab.b(new ab.a(W1()))).a(ab.d.class);
        this.f22161o0 = dVar;
        ab.d dVar2 = null;
        if (dVar == null) {
            cm.l.v("mCombineViewModel");
            dVar = null;
        }
        dVar.i().g(this, new n(this));
        ab.d dVar3 = this.f22161o0;
        if (dVar3 == null) {
            cm.l.v("mCombineViewModel");
        } else {
            dVar2 = dVar3;
        }
        dVar2.h().g(this, new o(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void q2(com.nic.mparivahan.dlservices.ui.hillService.HillReligion r27, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r28) {
        /*
            r15 = r27
            java.lang.String r14 = "service_is_not_present"
            java.lang.String r0 = "this$0"
            cm.l.f(r15, r0)
            ni.t4 r0 = r15.J
            java.lang.String r19 = "mBinding"
            r13 = 0
            if (r0 != 0) goto L_0x0014
            cm.l.v(r19)
            r0 = r13
        L_0x0014:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.E
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
            goto L_0x02bd
        L_0x002f:
            r0 = r13
        L_0x0030:
            java.lang.String r1 = "00"
            r2 = 2
            boolean r0 = km.p.p(r0, r1, r12, r2, r13)     // Catch:{ Exception -> 0x0028 }
            if (r0 == 0) goto L_0x0277
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x0271 }
            if (r0 == 0) goto L_0x02db
            java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x0271 }
            if (r0 == 0) goto L_0x02db
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x0271 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0271 }
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != r1) goto L_0x02db
            com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r20 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x0271 }
            r20.<init>()     // Catch:{ Exception -> 0x0271 }
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x0271 }
            java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x0271 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ Exception -> 0x0271 }
            r21 = r0
            com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r21 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r21     // Catch:{ Exception -> 0x0271 }
            if (r21 == 0) goto L_0x02db
            java.lang.String r0 = ""
            java.util.ArrayList r2 = r27.Z1()     // Catch:{ Exception -> 0x0271 }
            ld.c r3 = r27.R1()     // Catch:{ Exception -> 0x0271 }
            java.lang.String r4 = "check_dl_serv_dupl_dl"
            java.lang.String r5 = "Issue of Duplicate DL"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0271 }
            boolean r2 = ql.y.R(r2, r3)     // Catch:{ Exception -> 0x0271 }
            if (r2 == 0) goto L_0x008f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r2.<init>()     // Catch:{ Exception -> 0x0028 }
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "513,"
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x008f:
            java.util.ArrayList r2 = r27.Z1()     // Catch:{ Exception -> 0x0271 }
            ld.c r3 = r27.R1()     // Catch:{ Exception -> 0x0271 }
            java.lang.String r4 = "check_dl_serv_renewal_dl"
            java.lang.String r5 = "Renewal of DL"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0271 }
            boolean r2 = ql.y.R(r2, r3)     // Catch:{ Exception -> 0x0271 }
            if (r2 == 0) goto L_0x00b6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r2.<init>()     // Catch:{ Exception -> 0x0028 }
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "514,"
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x00b6:
            java.util.ArrayList r2 = r27.Z1()     // Catch:{ Exception -> 0x0271 }
            ld.c r3 = r27.R1()     // Catch:{ Exception -> 0x0271 }
            java.lang.String r4 = "revalidtion_expired_dl"
            java.lang.String r5 = "Re-Validation of Expired DL"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0271 }
            boolean r2 = ql.y.R(r2, r3)     // Catch:{ Exception -> 0x0271 }
            if (r2 == 0) goto L_0x00dd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r2.<init>()     // Catch:{ Exception -> 0x0028 }
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "537,"
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x00dd:
            java.util.ArrayList r2 = r27.Z1()     // Catch:{ Exception -> 0x0271 }
            ld.c r3 = r27.R1()     // Catch:{ Exception -> 0x0271 }
            java.lang.String r4 = "check_dl_serv_change_addr"
            java.lang.String r5 = "Change of Address in DL"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0271 }
            boolean r2 = ql.y.R(r2, r3)     // Catch:{ Exception -> 0x0271 }
            if (r2 == 0) goto L_0x0104
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r2.<init>()     // Catch:{ Exception -> 0x0028 }
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "515,"
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x0104:
            java.util.ArrayList r2 = r27.Z1()     // Catch:{ Exception -> 0x0271 }
            ld.c r3 = r27.R1()     // Catch:{ Exception -> 0x0271 }
            java.lang.String r4 = "check_dl_serv_replacement_dl"
            java.lang.String r5 = "Replacement of DL"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0271 }
            boolean r2 = ql.y.R(r2, r3)     // Catch:{ Exception -> 0x0271 }
            if (r2 == 0) goto L_0x012b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r2.<init>()     // Catch:{ Exception -> 0x0028 }
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "516,"
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x012b:
            java.util.ArrayList r2 = r27.Z1()     // Catch:{ Exception -> 0x0271 }
            ld.c r3 = r27.R1()     // Catch:{ Exception -> 0x0271 }
            java.lang.String r4 = "check_dl_serv_extract_dl"
            java.lang.String r5 = "DL Extract"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0271 }
            boolean r2 = ql.y.R(r2, r3)     // Catch:{ Exception -> 0x0271 }
            if (r2 == 0) goto L_0x0152
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r2.<init>()     // Catch:{ Exception -> 0x0028 }
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "523,"
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x0152:
            java.util.ArrayList r2 = r27.Z1()     // Catch:{ Exception -> 0x0271 }
            ld.c r3 = r27.R1()     // Catch:{ Exception -> 0x0271 }
            java.lang.String r4 = "hill_region_title"
            java.lang.String r5 = "Endorsement to Drive in Hill Region"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0271 }
            boolean r2 = ql.y.R(r2, r3)     // Catch:{ Exception -> 0x0271 }
            if (r2 == 0) goto L_0x0179
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r2.<init>()     // Catch:{ Exception -> 0x0028 }
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "524,"
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x0179:
            java.util.ArrayList r2 = r27.Z1()     // Catch:{ Exception -> 0x0271 }
            ld.c r3 = r27.R1()     // Catch:{ Exception -> 0x0271 }
            java.lang.String r4 = "change_name_dl"
            java.lang.String r5 = "Change of Name in DL"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0271 }
            boolean r2 = ql.y.R(r2, r3)     // Catch:{ Exception -> 0x0271 }
            if (r2 == 0) goto L_0x01a0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r2.<init>()     // Catch:{ Exception -> 0x0028 }
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "526,"
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x01a0:
            java.util.ArrayList r2 = r27.Z1()     // Catch:{ Exception -> 0x0271 }
            ld.c r3 = r27.R1()     // Catch:{ Exception -> 0x0271 }
            java.lang.String r4 = "change_birth_dl"
            java.lang.String r5 = "Change of Date of Birth in DL"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0271 }
            boolean r2 = ql.y.R(r2, r3)     // Catch:{ Exception -> 0x0271 }
            if (r2 == 0) goto L_0x01c7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            r2.<init>()     // Catch:{ Exception -> 0x0028 }
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "548"
            r2.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0028 }
        L_0x01c7:
            int r2 = r0.length()     // Catch:{ Exception -> 0x0271 }
            int r2 = r2 - r1
            java.lang.String r0 = r0.substring(r12, r2)     // Catch:{ Exception -> 0x0271 }
            java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r0, r1)     // Catch:{ Exception -> 0x0271 }
            com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r1 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x0238 }
            java.lang.String r3 = "1234"
            java.lang.String r4 = "S"
            java.lang.String r5 = r21.getApplicationDate()     // Catch:{ Exception -> 0x0238 }
            java.lang.String r2 = r21.getApplicationNo()     // Catch:{ Exception -> 0x0238 }
            cm.l.c(r2)     // Catch:{ Exception -> 0x0238 }
            long r6 = java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x0238 }
            ld.g r2 = r27.X1()     // Catch:{ Exception -> 0x0238 }
            java.lang.String r2 = r2.k()     // Catch:{ Exception -> 0x0238 }
            int r8 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r9 = r21.getDateofBirth()     // Catch:{ Exception -> 0x0238 }
            java.lang.String r10 = r21.getDlno()     // Catch:{ Exception -> 0x0238 }
            cm.l.c(r10)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r16 = "N"
            java.lang.String r17 = "N"
            java.lang.String r18 = r21.getApplicantGender()     // Catch:{ Exception -> 0x0238 }
            java.lang.String r2 = r15.Q     // Catch:{ Exception -> 0x0238 }
            cm.l.c(r2)     // Catch:{ Exception -> 0x0238 }
            r22 = 0
            r28 = r0
            java.lang.String r0 = r15.T     // Catch:{ Exception -> 0x0238 }
            r23 = r0
            java.lang.String r0 = r15.U     // Catch:{ Exception -> 0x0238 }
            r24 = r2
            r2 = r27
            r11 = r16
            r12 = r17
            r25 = r13
            r13 = r18
            r26 = r14
            r14 = r24
            r15 = r22
            r16 = r28
            r17 = r23
            r18 = r0
            r1.a(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0236 }
        L_0x0233:
            r13 = r27
            goto L_0x0247
        L_0x0236:
            r0 = move-exception
            goto L_0x023d
        L_0x0238:
            r0 = move-exception
            r25 = r13
            r26 = r14
        L_0x023d:
            java.lang.String r1 = "valiii"
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ Exception -> 0x026e }
            android.util.Log.d(r1, r0)     // Catch:{ Exception -> 0x026e }
            goto L_0x0233
        L_0x0247:
            java.lang.String r4 = r13.T     // Catch:{ Exception -> 0x0268 }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = r27.O1()     // Catch:{ Exception -> 0x0268 }
            java.lang.String r6 = r13.O     // Catch:{ Exception -> 0x0268 }
            java.lang.String r7 = r13.P     // Catch:{ Exception -> 0x0268 }
            java.lang.String r8 = r13.Q     // Catch:{ Exception -> 0x0268 }
            java.lang.String r9 = r13.R     // Catch:{ Exception -> 0x0268 }
            java.lang.String r10 = r13.S     // Catch:{ Exception -> 0x0268 }
            java.lang.String r11 = r13.U     // Catch:{ Exception -> 0x0268 }
            java.util.ArrayList r12 = r27.T1()     // Catch:{ Exception -> 0x0268 }
            r1 = r20
            r2 = r27
            r3 = r21
            r1.E2(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0268 }
            goto L_0x02db
        L_0x0268:
            r3 = r26
            r1 = 2132019337(0x7f140889, float:1.9677006E38)
            goto L_0x02bd
        L_0x026e:
            r13 = r27
            goto L_0x0268
        L_0x0271:
            r25 = r13
            r13 = r15
            r1 = r11
            r3 = r14
            goto L_0x02bd
        L_0x0277:
            r25 = r13
            r26 = r14
            r13 = r15
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x0268 }
            if (r0 == 0) goto L_0x0287
            java.lang.String r0 = r0.getReqStatus()     // Catch:{ Exception -> 0x0268 }
            goto L_0x0289
        L_0x0287:
            r0 = r25
        L_0x0289:
            if (r0 == 0) goto L_0x02a6
            int r0 = r0.length()     // Catch:{ Exception -> 0x0268 }
            if (r0 != 0) goto L_0x0292
            goto L_0x02a6
        L_0x0292:
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x0268 }
            if (r0 == 0) goto L_0x029d
            java.lang.String r0 = r0.getReqStatus()     // Catch:{ Exception -> 0x0268 }
            goto L_0x029f
        L_0x029d:
            r0 = r25
        L_0x029f:
            cm.l.c(r0)     // Catch:{ Exception -> 0x0268 }
            r13.A2(r0)     // Catch:{ Exception -> 0x0268 }
            goto L_0x02db
        L_0x02a6:
            ld.c r0 = r27.R1()     // Catch:{ Exception -> 0x0268 }
            r1 = 2132019337(0x7f140889, float:1.9677006E38)
            java.lang.String r2 = r13.getString(r1)     // Catch:{ Exception -> 0x02bb }
            r3 = r26
            java.lang.String r0 = r0.b(r3, r2)     // Catch:{ Exception -> 0x02bd }
            r13.A2(r0)     // Catch:{ Exception -> 0x02bd }
            goto L_0x02db
        L_0x02bb:
            r3 = r26
        L_0x02bd:
            ni.t4 r0 = r13.J
            if (r0 != 0) goto L_0x02c6
            cm.l.v(r19)
            r0 = r25
        L_0x02c6:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.E
            r2 = 0
            r0.c(r2)
            ld.c r0 = r27.R1()
            java.lang.String r1 = r13.getString(r1)
            java.lang.String r0 = r0.b(r3, r1)
            r13.A2(r0)
        L_0x02db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.hillService.HillReligion.q2(com.nic.mparivahan.dlservices.ui.hillService.HillReligion, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse):void");
    }

    /* access modifiers changed from: private */
    public static final void r2(HillReligion hillReligion, String str) {
        cm.l.f(hillReligion, "this$0");
        t4 t4Var = hillReligion.J;
        if (t4Var == null) {
            cm.l.v("mBinding");
            t4Var = null;
        }
        t4Var.E.c(false);
        hillReligion.A2(hillReligion.R1().b("service_is_not_present", hillReligion.getString(R.string.unable_to_get_details)));
    }

    /* access modifiers changed from: private */
    public static final void s2(HillReligion hillReligion, View view) {
        cm.l.f(hillReligion, "this$0");
        hillReligion.finish();
    }

    /* access modifiers changed from: private */
    public static final void t2(HillReligion hillReligion, View view) {
        cm.l.f(hillReligion, "this$0");
        try {
            Intent intent = new Intent(hillReligion, DlServiceDetailsActivity.class);
            intent.putExtra("DL", hillReligion.O);
            intent.putExtra("dob", hillReligion.P);
            intent.putExtra("DLDetails", hillReligion.O1());
            intent.putExtra("Mobile_no", hillReligion.Q);
            intent.putExtra("lastEndorsedRTO", hillReligion.R);
            intent.putExtra("lastEndorsedState", hillReligion.S);
            intent.putExtra("lastEndorsedRTOCode", hillReligion.T);
            intent.putExtra("lastEndorseStateCode", hillReligion.U);
            intent.putExtra("whatServiceRequired", hillReligion.L);
            if (cm.l.a(hillReligion.a2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", hillReligion.Z1());
            }
            hillReligion.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void u2(HillReligion hillReligion, View view) {
        cm.l.f(hillReligion, "this$0");
        try {
            Intent intent = new Intent(hillReligion, DlServiceDetailsActivity.class);
            intent.putExtra("DL", hillReligion.O);
            intent.putExtra("dob", hillReligion.P);
            intent.putExtra("DLDetails", hillReligion.O1());
            intent.putExtra("Mobile_no", hillReligion.Q);
            intent.putExtra("lastEndorsedRTO", hillReligion.R);
            intent.putExtra("lastEndorsedState", hillReligion.S);
            intent.putExtra("lastEndorsedRTOCode", hillReligion.T);
            intent.putExtra("lastEndorseStateCode", hillReligion.U);
            intent.putExtra("whatServiceRequired", hillReligion.L);
            hillReligion.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void v2(HillReligion hillReligion, View view) {
        cm.l.f(hillReligion, "this$0");
        if (cm.l.a(hillReligion.a2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (hillReligion.T1().size() > 1) {
                    Dialog dialog = new Dialog(hillReligion);
                    dialog.setContentView(R.layout.layout_multi);
                    Window window = dialog.getWindow();
                    cm.l.c(window);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    View findViewById = dialog.findViewById(R.id.service_label_cross);
                    cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                    View findViewById2 = dialog.findViewById(R.id.pop_up_close);
                    cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) findViewById2;
                    View findViewById3 = dialog.findViewById(R.id.service_label_list);
                    cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView2 = (TextView) findViewById3;
                    View findViewById4 = dialog.findViewById(R.id.service_label_list_serial);
                    cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView3 = (TextView) findViewById4;
                    View findViewById5 = dialog.findViewById(R.id.dl_services);
                    cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
                    textView.setText(hillReligion.R1().b("btn_ok", "OK"));
                    ((TextView) findViewById5).setText(hillReligion.R1().b("title_dl_services", "Driving Licence Services"));
                    ((ImageView) findViewById).setOnClickListener(new tj.l(dialog));
                    int size = hillReligion.T1().size();
                    String str = "";
                    int i10 = 0;
                    String str2 = str;
                    while (i10 < size) {
                        str = str + ((String) hillReligion.T1().get(i10)) + 10;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        i10++;
                        sb2.append(i10);
                        sb2.append(".\n");
                        str2 = sb2.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(str2);
                    textView.setOnClickListener(new tj.m(dialog));
                    Window window2 = dialog.getWindow();
                    cm.l.c(window2);
                    window2.setGravity(48);
                    window2.setLayout(-2, -2);
                    dialog.show();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void w2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void x2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void y2(HillReligion hillReligion, View view) {
        cm.l.f(hillReligion, "this$0");
        hillReligion.finish();
    }

    private final void z2(String str) {
        String str2;
        u uVar = new u();
        uVar.f20234e = "";
        if (cm.l.a(this.M, "Y")) {
            t4 t4Var = this.J;
            if (t4Var == null) {
                cm.l.v("mBinding");
                t4Var = null;
            }
            str2 = String.valueOf(t4Var.K.getText());
        } else {
            str2 = "NA";
        }
        uVar.f20234e = str2;
        try {
            String b10 = R1().b("nex_parivahan", getString(R.string.app_name));
            cm.l.c(b10);
            g.n1(this, b10, str, 0, (String) null, (String) null, new d(this, uVar), 24, (Object) null);
        } catch (Exception unused) {
        }
    }

    public final void A2(String str) {
        if (str != null) {
            String b10 = R1().b("nex_parivahan", getString(R.string.app_name));
            cm.l.c(b10);
            String b11 = R1().b("btn_ok", getString(R.string.ok_txt));
            cm.l.c(b11);
            g.n1(this, b10, str, 1, b11, (String) null, e.f22178e, 16, (Object) null);
        }
    }

    public final void C2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.K = dldetobjX;
    }

    public final void D2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f22147a0 = cVar;
    }

    public final void E2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f22155i0 = arrayList;
    }

    public final void F2(t9.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.f22150d0 = aVar;
    }

    public final void G2(ClInter clInter) {
        cm.l.f(clInter, "<set-?>");
        this.f22151e0 = clInter;
    }

    public final void H2(CombineServiceInterface combineServiceInterface) {
        cm.l.f(combineServiceInterface, "<set-?>");
        this.f22162p0 = combineServiceInterface;
    }

    public final void I2(Context context) {
        cm.l.f(context, "<set-?>");
        this.A0 = context;
    }

    public final void J2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f22154h0 = arrayList;
    }

    public final void K2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.N = fVar;
    }

    public final void L2(int i10) {
        this.X = i10;
    }

    public final void M2(int i10) {
        this.Y = i10;
    }

    public final void N2(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final DldetobjX O1() {
        DldetobjX dldetobjX = this.K;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    public final String P1() {
        return this.O;
    }

    public final String Q1() {
        return this.P;
    }

    public final ld.c R1() {
        ld.c cVar = this.f22147a0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final String S1() {
        return this.T;
    }

    public final ArrayList T1() {
        ArrayList arrayList = this.f22155i0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("listHeaderSteps");
        return null;
    }

    public final t9.a U1() {
        t9.a aVar = this.f22150d0;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mClDlViewModel");
        return null;
    }

    public final ClInter V1() {
        ClInter clInter = this.f22151e0;
        if (clInter != null) {
            return clInter;
        }
        cm.l.v("mClInter");
        return null;
    }

    public final CombineServiceInterface W1() {
        CombineServiceInterface combineServiceInterface = this.f22162p0;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        cm.l.v("mCombineServiceInterface");
        return null;
    }

    public final ld.g X1() {
        ld.g gVar = this.Z;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mSessionmanger");
        return null;
    }

    public final String Y1() {
        return this.Q;
    }

    public final ArrayList Z1() {
        ArrayList arrayList = this.f22154h0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("multiListName");
        return null;
    }

    public final ld.f a2() {
        ld.f fVar = this.N;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final int b2() {
        return this.X;
    }

    public final String c2() {
        return this.W;
    }

    public final ArrayList d2() {
        ArrayList arrayList = this.f22149c0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("stateList");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        int i10;
        String str2;
        CustomWegetLayout customWegetLayout;
        String b10;
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_hill_religion);
        cm.l.e(f10, "setContentView(...)");
        this.J = (t4) f10;
        K2(new ld.f(this));
        I2(this);
        e2();
        h2();
        e.a aVar = v9.e.f17509a;
        t4 t4Var = this.J;
        t4 t4Var2 = null;
        if (t4Var == null) {
            cm.l.v("mBinding");
            t4Var = null;
        }
        aVar.R0(this, t4Var);
        if (cm.l.a(a2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            p2();
        }
        t4 t4Var3 = this.J;
        if (t4Var3 == null) {
            cm.l.v("mBinding");
            t4Var3 = null;
        }
        t4Var3.H.f29577d.setOnClickListener(new tj.a(this));
        vi.e eVar = this.f22148b0;
        if (eVar == null) {
            cm.l.v("viewModel");
            eVar = null;
        }
        eVar.g().g(this, new f(new c(this)));
        if (cm.l.a(a2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                H2(CombineServiceInterface.f8704a.a(this));
                this.f22161o0 = (ab.d) new u0((x0) this, (u0.b) new ab.b(new ab.a(W1()))).a(ab.d.class);
                this.f22158l0 = getIntent().getIntExtra("serialNo", 0);
                Serializable serializableExtra = getIntent().getSerializableExtra("multiList");
                cm.l.d(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                J2((ArrayList) serializableExtra);
                Serializable serializableExtra2 = getIntent().getSerializableExtra("listHeaderSteps");
                cm.l.d(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                E2((ArrayList) serializableExtra2);
                Serializable serializableExtra3 = getIntent().getSerializableExtra("COA");
                cm.l.d(serializableExtra3, "null cannot be cast to non-null type kotlin.Boolean");
                this.f22156j0 = ((Boolean) serializableExtra3).booleanValue();
                String stringExtra = getIntent().getStringExtra("metaflag");
                cm.l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.f22163q0 = stringExtra;
                this.f22159m0 = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
                this.f22160n0 = String.valueOf(getIntent().getStringExtra("allowAddrChangeAtDlservReqst"));
                if (this.f22158l0 == Z1().size()) {
                    t4 t4Var4 = this.J;
                    if (t4Var4 == null) {
                        cm.l.v("mBinding");
                        t4Var4 = null;
                    }
                    t4Var4.E.setText(R1().b("vahan_btn_submit", "Submit"));
                    t4 t4Var5 = this.J;
                    if (t4Var5 == null) {
                        cm.l.v("mBinding");
                        t4Var5 = null;
                    }
                    t4Var5.f28674z.setVisibility(0);
                    str = "Y";
                } else {
                    t4 t4Var6 = this.J;
                    if (t4Var6 == null) {
                        cm.l.v("mBinding");
                        t4Var6 = null;
                    }
                    t4Var6.E.setText(R1().b("btn_dl_serv_next", "Next"));
                    t4 t4Var7 = this.J;
                    if (t4Var7 == null) {
                        cm.l.v("mBinding");
                        t4Var7 = null;
                    }
                    t4Var7.f28674z.setVisibility(8);
                    str = "N";
                }
                this.M = str;
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowMetrics a10 = getWindowManager().getMaximumWindowMetrics();
                    cm.l.e(a10, "getMaximumWindowMetrics(...)");
                    Rect a11 = a10.getBounds();
                    cm.l.e(a11, "getBounds(...)");
                    i10 = a11.right;
                    this.f22157k0 = i10;
                    str2 = "Width";
                } else {
                    i10 = getResources().getDisplayMetrics().widthPixels;
                    this.f22157k0 = i10;
                    str2 = "Width 1";
                }
                Log.d(str2, String.valueOf(i10));
                if (this.f22158l0 == Z1().size()) {
                    t4 t4Var8 = this.J;
                    if (t4Var8 == null) {
                        cm.l.v("mBinding");
                        t4Var8 = null;
                    }
                    customWegetLayout = t4Var8.E;
                    b10 = R1().b("vahan_btn_submit", "Submit");
                } else {
                    t4 t4Var9 = this.J;
                    if (t4Var9 == null) {
                        cm.l.v("mBinding");
                        t4Var9 = null;
                    }
                    customWegetLayout = t4Var9.E;
                    b10 = R1().b("btn_dl_serv_next", "Next");
                }
                customWegetLayout.setText(b10);
            } catch (Exception unused) {
            }
        }
        if (cm.l.a(a2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (T1().size() == 1) {
                    t4 t4Var10 = this.J;
                    if (t4Var10 == null) {
                        cm.l.v("mBinding");
                        t4Var10 = null;
                    }
                    t4Var10.H.f29580g.setText((CharSequence) T1().get(0));
                } else {
                    t4 t4Var11 = this.J;
                    if (t4Var11 == null) {
                        cm.l.v("mBinding");
                        t4Var11 = null;
                    }
                    TextView textView = t4Var11.H.f29580g;
                    String b11 = R1().b("dl_services", getString(R.string.dl_services));
                    cm.l.c(b11);
                    textView.setText(b11);
                    t4 t4Var12 = this.J;
                    if (t4Var12 == null) {
                        cm.l.v("mBinding");
                        t4Var12 = null;
                    }
                    TextView textView2 = t4Var12.H.f29580g;
                    t4 t4Var13 = this.J;
                    if (t4Var13 == null) {
                        cm.l.v("mBinding");
                        t4Var13 = null;
                    }
                    textView2.setPaintFlags(t4Var13.H.f29580g.getPaintFlags() | 8);
                }
            } catch (Exception unused2) {
            }
        } else {
            t4 t4Var14 = this.J;
            if (t4Var14 == null) {
                cm.l.v("mBinding");
                t4Var14 = null;
            }
            t4Var14.H.f29580g.setText(R1().b("hill_region_title", "Endorsement to Drive in Hill Region"));
        }
        t4 t4Var15 = this.J;
        if (t4Var15 == null) {
            cm.l.v("mBinding");
            t4Var15 = null;
        }
        t4Var15.H.f29581h.setOnClickListener(new tj.h(this));
        t4 t4Var16 = this.J;
        if (t4Var16 == null) {
            cm.l.v("mBinding");
            t4Var16 = null;
        }
        t4Var16.H.f29581h.setOnClickListener(new i(this));
        t4 t4Var17 = this.J;
        if (t4Var17 == null) {
            cm.l.v("mBinding");
            t4Var17 = null;
        }
        t4Var17.H.f29580g.setOnClickListener(new j(this));
        if (cm.l.a(a2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (T1().size() > 1) {
                    t4 t4Var18 = this.J;
                    if (t4Var18 == null) {
                        cm.l.v("mBinding");
                        t4Var18 = null;
                    }
                    t4Var18.I.setLayoutManager(new LinearLayoutManager(this, 0, false));
                    ArrayList T1 = T1();
                    int i11 = this.f22158l0;
                    int i12 = this.f22157k0;
                    String b12 = R1().b("hill_region_title", "Endorsement to Drive in Hill Region");
                    cm.l.c(b12);
                    bb.a aVar2 = new bb.a(T1, this, i11, i12, b12);
                    t4 t4Var19 = this.J;
                    if (t4Var19 == null) {
                        cm.l.v("mBinding");
                        t4Var19 = null;
                    }
                    t4Var19.I.setAdapter(aVar2);
                }
            } catch (Exception unused3) {
            }
        } else {
            t4 t4Var20 = this.J;
            if (t4Var20 == null) {
                cm.l.v("mBinding");
                t4Var20 = null;
            }
            t4Var20.H.f29580g.setText(R1().b("hill_region_title", "Endorsement to Drive in Hill Region"));
        }
        t4 t4Var21 = this.J;
        if (t4Var21 == null) {
            cm.l.v("mBinding");
            t4Var21 = null;
        }
        t4Var21.H.f29578e.setVisibility(8);
        t4 t4Var22 = this.J;
        if (t4Var22 == null) {
            cm.l.v("mBinding");
            t4Var22 = null;
        }
        t4Var22.Z.setVisibility(0);
        t4 t4Var23 = this.J;
        if (t4Var23 == null) {
            cm.l.v("mBinding");
            t4Var23 = null;
        }
        t4Var23.f28673y.setVisibility(0);
        t4 t4Var24 = this.J;
        if (t4Var24 == null) {
            cm.l.v("mBinding");
            t4Var24 = null;
        }
        t4Var24.F.f25961g.setText(R1().b("hill_region_title", "Endorsement to Drive in Hill Region"));
        t4 t4Var25 = this.J;
        if (t4Var25 == null) {
            cm.l.v("mBinding");
        } else {
            t4Var2 = t4Var25;
        }
        t4Var2.H.f29577d.setOnClickListener(new k(this));
    }
}
