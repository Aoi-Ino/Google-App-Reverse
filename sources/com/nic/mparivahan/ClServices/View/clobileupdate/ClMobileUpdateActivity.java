package com.nic.mparivahan.ClServices.View.clobileupdate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.databinding.f;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.mobupdate.GetMobDetailsResponse;
import java.util.HashMap;
import ni.t0;
import oi.g;
import pl.x;

public final class ClMobileUpdateActivity extends g {
    /* access modifiers changed from: private */
    public t0 J;
    private vj.a K;
    private String L;
    private String M;
    private String N;
    private HashMap O = new HashMap();
    private String P = "";
    public ld.c Q;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClMobileUpdateActivity f8041e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ClMobileUpdateActivity clMobileUpdateActivity) {
            super(1);
            this.f8041e = clMobileUpdateActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r7 = com.nic.mparivahan.ClServices.View.clobileupdate.ClMobileUpdateActivity.y1(r6.f8041e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
            if (r7 == null) goto L_0x0061;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
            cm.l.v("mBinding");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
            r1 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
            r1.D.setText("NA");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.data.model.mobupdate.GetMobDetailsResponse r7) {
            /*
                r6 = this;
                java.lang.String r0 = r7.getErrorMsg()     // Catch:{ Exception -> 0x007c }
                if (r0 != 0) goto L_0x006e
                com.nic.mparivahan.ClServices.View.clobileupdate.ClMobileUpdateActivity r0 = r6.f8041e     // Catch:{ Exception -> 0x007c }
                ni.t0 r0 = r0.J     // Catch:{ Exception -> 0x007c }
                r1 = 0
                java.lang.String r2 = "mBinding"
                if (r0 != 0) goto L_0x0015
                cm.l.v(r2)     // Catch:{ Exception -> 0x007c }
                r0 = r1
            L_0x0015:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.H     // Catch:{ Exception -> 0x007c }
                r3 = 1065353216(0x3f800000, float:1.0)
                r0.setAlpha(r3)     // Catch:{ Exception -> 0x007c }
                java.lang.Object r0 = r7.getOldMobNum()     // Catch:{ Exception -> 0x007c }
                if (r0 == 0) goto L_0x008d
                com.nic.mparivahan.ClServices.View.clobileupdate.ClMobileUpdateActivity r0 = r6.f8041e     // Catch:{ Exception -> 0x0059 }
                ni.t0 r0 = r0.J     // Catch:{ Exception -> 0x0059 }
                if (r0 != 0) goto L_0x002e
                cm.l.v(r2)     // Catch:{ Exception -> 0x0059 }
                r0 = r1
            L_0x002e:
                androidx.appcompat.widget.AppCompatEditText r0 = r0.D     // Catch:{ Exception -> 0x0059 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0059 }
                r3.<init>()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r4 = "XXXXXX"
                r3.append(r4)     // Catch:{ Exception -> 0x0059 }
                java.lang.Object r7 = r7.getOldMobNum()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0059 }
                r4 = 6
                r5 = 10
                java.lang.String r7 = r7.substring(r4, r5)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
                cm.l.e(r7, r4)     // Catch:{ Exception -> 0x0059 }
                r3.append(r7)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r7 = r3.toString()     // Catch:{ Exception -> 0x0059 }
                r0.setText(r7)     // Catch:{ Exception -> 0x0059 }
                goto L_0x008d
            L_0x0059:
                com.nic.mparivahan.ClServices.View.clobileupdate.ClMobileUpdateActivity r7 = r6.f8041e     // Catch:{ Exception -> 0x007c }
                ni.t0 r7 = r7.J     // Catch:{ Exception -> 0x007c }
                if (r7 != 0) goto L_0x0065
                cm.l.v(r2)     // Catch:{ Exception -> 0x007c }
                goto L_0x0066
            L_0x0065:
                r1 = r7
            L_0x0066:
                androidx.appcompat.widget.AppCompatEditText r7 = r1.D     // Catch:{ Exception -> 0x007c }
                java.lang.String r0 = "NA"
                r7.setText(r0)     // Catch:{ Exception -> 0x007c }
                goto L_0x008d
            L_0x006e:
                com.nic.mparivahan.ClServices.View.clobileupdate.ClMobileUpdateActivity r0 = r6.f8041e     // Catch:{ Exception -> 0x007c }
                java.lang.String r7 = r7.getErrorMsg()     // Catch:{ Exception -> 0x007c }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x007c }
                r0.I1(r7)     // Catch:{ Exception -> 0x007c }
                goto L_0x008d
            L_0x007c:
                com.nic.mparivahan.ClServices.View.clobileupdate.ClMobileUpdateActivity r7 = r6.f8041e
                r0 = 2132019106(0x7f1407a2, float:1.9676538E38)
                java.lang.String r0 = r7.getString(r0)
                java.lang.String r1 = "getString(...)"
                cm.l.e(r0, r1)
                r7.I1(r0)
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.clobileupdate.ClMobileUpdateActivity.a.b(com.nic.mparivahan.dlservices.data.model.mobupdate.GetMobDetailsResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetMobDetailsResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClMobileUpdateActivity f8042e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ClMobileUpdateActivity clMobileUpdateActivity) {
            super(1);
            this.f8042e = clMobileUpdateActivity;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            t0 y12 = this.f8042e.J;
            if (y12 == null) {
                cm.l.v("mBinding");
                y12 = null;
            }
            y12.H.setAlpha(0.5f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClMobileUpdateActivity f8043e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ClMobileUpdateActivity clMobileUpdateActivity) {
            super(1);
            this.f8043e = clMobileUpdateActivity;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            if (p.o(str, "yes", true)) {
                ClOTPMobile clOTPMobile = new ClOTPMobile();
                ClMobileUpdateActivity clMobileUpdateActivity = this.f8043e;
                t0 y12 = clMobileUpdateActivity.J;
                t0 t0Var = null;
                if (y12 == null) {
                    cm.l.v("mBinding");
                    y12 = null;
                }
                String valueOf = String.valueOf(y12.C.getText());
                t0 y13 = this.f8043e.J;
                if (y13 == null) {
                    cm.l.v("mBinding");
                } else {
                    t0Var = y13;
                }
                String valueOf2 = String.valueOf(t0Var.D.getText());
                String z12 = this.f8043e.z1();
                cm.l.c(z12);
                String A1 = this.f8043e.A1();
                cm.l.c(A1);
                clOTPMobile.g2(clMobileUpdateActivity, valueOf, valueOf2, z12, A1);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8044a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f8044a = lVar;
        }

        public final pl.c a() {
            return this.f8044a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8044a.invoke(obj);
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

    private final void C1() {
        if (getIntent() != null) {
            this.M = String.valueOf(getIntent().getStringExtra("dobValue"));
            this.L = String.valueOf(getIntent().getStringExtra("dlValue"));
            this.P = String.valueOf(getIntent().getStringExtra("rtoCode"));
            this.N = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            t0 t0Var = null;
            try {
                t0 t0Var2 = this.J;
                if (t0Var2 == null) {
                    cm.l.v("mBinding");
                    t0Var2 = null;
                }
                AppCompatEditText appCompatEditText = t0Var2.D;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("XXXXXX");
                String str = this.N;
                cm.l.c(str);
                String substring = str.substring(6, 10);
                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring);
                appCompatEditText.setText(sb2.toString());
            } catch (Exception unused) {
                t0 t0Var3 = this.J;
                if (t0Var3 == null) {
                    cm.l.v("mBinding");
                    t0Var3 = null;
                }
                t0Var3.D.setText("NA");
            }
            t0 t0Var4 = this.J;
            if (t0Var4 == null) {
                cm.l.v("mBinding");
                t0Var4 = null;
            }
            t0Var4.f28606x.setText(B1().b("CL_NO", "CL No.") + " : " + this.L);
            t0 t0Var5 = this.J;
            if (t0Var5 == null) {
                cm.l.v("mBinding");
            } else {
                t0Var = t0Var5;
            }
            t0Var.B.f25961g.setText(B1().b("label_dl_serv_update_mob", "Update Mobile Number"));
        }
    }

    private final void D1() {
        this.K = (vj.a) new u0(this).a(vj.a.class);
        vj.a aVar = null;
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            vj.a aVar2 = this.K;
            if (aVar2 == null) {
                cm.l.v("updateMobVm");
                aVar2 = null;
            }
            String str = this.M;
            cm.l.c(str);
            String str2 = this.L;
            cm.l.c(str2);
            aVar2.j(str, "CL", true, str2);
        } else {
            Toast.makeText(getApplicationContext(), B1().b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
        }
        vj.a aVar3 = this.K;
        if (aVar3 == null) {
            cm.l.v("updateMobVm");
        } else {
            aVar = aVar3;
        }
        aVar.h().g(this, new d(new a(this)));
    }

    private final void E1() {
        t0 t0Var = this.J;
        t0 t0Var2 = null;
        if (t0Var == null) {
            cm.l.v("mBinding");
            t0Var = null;
        }
        t0Var.B.f25959e.setOnClickListener(new s9.a(this));
        t0 t0Var3 = this.J;
        if (t0Var3 == null) {
            cm.l.v("mBinding");
            t0Var3 = null;
        }
        t0Var3.f28605w.setOnClickListener(new s9.b(this));
        t0 t0Var4 = this.J;
        if (t0Var4 == null) {
            cm.l.v("mBinding");
        } else {
            t0Var2 = t0Var4;
        }
        t0Var2.H.setOnClickListener(new s9.c(this));
    }

    /* access modifiers changed from: private */
    public static final void F1(ClMobileUpdateActivity clMobileUpdateActivity, View view) {
        cm.l.f(clMobileUpdateActivity, "this$0");
        clMobileUpdateActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void G1(ClMobileUpdateActivity clMobileUpdateActivity, View view) {
        cm.l.f(clMobileUpdateActivity, "this$0");
        clMobileUpdateActivity.finish();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r2 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        if (r2 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        if (r2 == null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void H1(com.nic.mparivahan.ClServices.View.clobileupdate.ClMobileUpdateActivity r5, android.view.View r6) {
        /*
            java.lang.String r6 = "this$0"
            cm.l.f(r5, r6)
            ni.t0 r6 = r5.J
            r0 = 0
            java.lang.String r1 = "mBinding"
            if (r6 != 0) goto L_0x0010
            cm.l.v(r1)
            r6 = r0
        L_0x0010:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r6 = r6.H
            float r6 = r6.getAlpha()
            r2 = 1056964608(0x3f000000, float:0.5)
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x001e
            goto L_0x00be
        L_0x001e:
            ni.t0 r6 = r5.J
            if (r6 != 0) goto L_0x0026
            cm.l.v(r1)
            r6 = r0
        L_0x0026:
            androidx.appcompat.widget.AppCompatEditText r6 = r6.C
            android.text.Editable r6 = r6.getText()
            cm.l.c(r6)
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0052
            ld.c r6 = r5.B1()
            java.lang.String r2 = "label_mb"
            java.lang.String r3 = "Please enter the mobile number"
            java.lang.String r6 = r6.b(r2, r3)
            ni.t0 r2 = r5.J
            if (r2 != 0) goto L_0x0049
        L_0x0045:
            cm.l.v(r1)
            goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            android.view.View r0 = r0.m()
            r5.t1(r6, r0)
            goto L_0x00be
        L_0x0052:
            ni.t0 r6 = r5.J
            if (r6 != 0) goto L_0x005a
            cm.l.v(r1)
            r6 = r0
        L_0x005a:
            androidx.appcompat.widget.AppCompatEditText r6 = r6.C
            android.text.Editable r6 = r6.getText()
            cm.l.c(r6)
            int r6 = r6.length()
            r2 = 10
            r3 = 2132017854(0x7f1402be, float:1.9673998E38)
            java.lang.String r4 = "label_log_entr_vali_mobno"
            if (r6 >= r2) goto L_0x0081
            ld.c r6 = r5.B1()
            java.lang.String r2 = r5.getString(r3)
            java.lang.String r6 = r6.b(r4, r2)
            ni.t0 r2 = r5.J
            if (r2 != 0) goto L_0x0049
            goto L_0x0045
        L_0x0081:
            t8.c$a r6 = t8.c.f16582a
            ni.t0 r2 = r5.J
            if (r2 != 0) goto L_0x008b
            cm.l.v(r1)
            r2 = r0
        L_0x008b:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.C
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r6 = r6.q(r2)
            if (r6 != 0) goto L_0x00ac
            ld.c r6 = r5.B1()
            java.lang.String r2 = r5.getString(r3)
            java.lang.String r6 = r6.b(r4, r2)
            ni.t0 r2 = r5.J
            if (r2 != 0) goto L_0x0049
            goto L_0x0045
        L_0x00ac:
            ld.c r6 = r5.B1()
            java.lang.String r0 = "label_want_to_proceed"
            java.lang.String r1 = "Are you sure, You want to proceed ?"
            java.lang.String r6 = r6.b(r0, r1)
            cm.l.c(r6)
            r5.J1(r6)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.clobileupdate.ClMobileUpdateActivity.H1(com.nic.mparivahan.ClServices.View.clobileupdate.ClMobileUpdateActivity, android.view.View):void");
    }

    private final void J1(String str) {
        String b10 = B1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        g.n1(this, b10, str, 0, (String) null, (String) null, new c(this), 24, (Object) null);
    }

    public final String A1() {
        return this.M;
    }

    public final ld.c B1() {
        ld.c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final void I1(String str) {
        cm.l.f(str, "message");
        String b10 = B1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        String b11 = B1().b("btn_ok", getString(R.string.ok_txt));
        cm.l.c(b11);
        g.n1(this, b10, str, 1, b11, (String) null, new b(this), 16, (Object) null);
    }

    public final void K1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final void L1(Context context, String str, String str2, String str3, String str4) {
        cm.l.f(context, "context");
        cm.l.f(str, "clNo");
        cm.l.f(str2, "dobValue");
        cm.l.f(str3, "rtoCode");
        cm.l.f(str4, "mobNumber");
        Intent intent = new Intent(context, ClMobileUpdateActivity.class);
        intent.putExtra("dlValue", str);
        intent.putExtra("dobValue", str2);
        intent.putExtra("rtoCode", str3);
        intent.putExtra("Mobile_no", str4);
        context.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = f.f(this, R.layout.activity_cl_mobile_update);
        cm.l.e(f10, "setContentView(...)");
        this.J = (t0) f10;
        K1(new ld.c(this));
        C1();
        D1();
        E1();
    }

    public final String z1() {
        return this.L;
    }
}
