package com.nic.mparivahan.LLMainScreen.LlMobileUpdate;

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
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.mobupdate.GetMobDetailsResponse;
import java.io.Serializable;
import java.util.HashMap;
import ni.r5;
import oi.g;
import pl.x;

public final class LlMobileUpdateActivity extends g {
    /* access modifiers changed from: private */
    public r5 J;
    private vj.a K;
    private String L;
    private String M;
    private HashMap N = new HashMap();
    private String O = "";
    public ld.c P;
    public FetchLlDetails Q;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlMobileUpdateActivity f8975e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LlMobileUpdateActivity llMobileUpdateActivity) {
            super(1);
            this.f8975e = llMobileUpdateActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r7 = com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlMobileUpdateActivity.y1(r6.f8975e);
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
                com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlMobileUpdateActivity r0 = r6.f8975e     // Catch:{ Exception -> 0x007c }
                ni.r5 r0 = r0.J     // Catch:{ Exception -> 0x007c }
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
                com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlMobileUpdateActivity r0 = r6.f8975e     // Catch:{ Exception -> 0x0059 }
                ni.r5 r0 = r0.J     // Catch:{ Exception -> 0x0059 }
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
                com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlMobileUpdateActivity r7 = r6.f8975e     // Catch:{ Exception -> 0x007c }
                ni.r5 r7 = r7.J     // Catch:{ Exception -> 0x007c }
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
                com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlMobileUpdateActivity r0 = r6.f8975e     // Catch:{ Exception -> 0x007c }
                java.lang.String r7 = r7.getErrorMsg()     // Catch:{ Exception -> 0x007c }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x007c }
                r0.H1(r7)     // Catch:{ Exception -> 0x007c }
                goto L_0x008d
            L_0x007c:
                com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlMobileUpdateActivity r7 = r6.f8975e
                r0 = 2132019106(0x7f1407a2, float:1.9676538E38)
                java.lang.String r0 = r7.getString(r0)
                java.lang.String r1 = "getString(...)"
                cm.l.e(r0, r1)
                r7.H1(r0)
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlMobileUpdateActivity.a.b(com.nic.mparivahan.dlservices.data.model.mobupdate.GetMobDetailsResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetMobDetailsResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlMobileUpdateActivity f8976e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LlMobileUpdateActivity llMobileUpdateActivity) {
            super(1);
            this.f8976e = llMobileUpdateActivity;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            r5 y12 = this.f8976e.J;
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
        final /* synthetic */ LlMobileUpdateActivity f8977e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LlMobileUpdateActivity llMobileUpdateActivity) {
            super(1);
            this.f8977e = llMobileUpdateActivity;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            if (p.o(str, "yes", true)) {
                LlOtpMobile llOtpMobile = new LlOtpMobile();
                LlMobileUpdateActivity llMobileUpdateActivity = this.f8977e;
                r5 y12 = llMobileUpdateActivity.J;
                r5 r5Var = null;
                if (y12 == null) {
                    cm.l.v("mBinding");
                    y12 = null;
                }
                String valueOf = String.valueOf(y12.C.getText());
                r5 y13 = this.f8977e.J;
                if (y13 == null) {
                    cm.l.v("mBinding");
                } else {
                    r5Var = y13;
                }
                llOtpMobile.i2(llMobileUpdateActivity, valueOf, String.valueOf(r5Var.D.getText()), this.f8977e.A1());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8978a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f8978a = lVar;
        }

        public final pl.c a() {
            return this.f8978a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8978a.invoke(obj);
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

    private final void B1() {
        if (getIntent() != null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            K1((FetchLlDetails) serializableExtra);
            this.L = q.B0(A1().getLearningLicence()).toString();
            this.M = q.B0(A1().getDateOfBirth()).toString();
            r5 r5Var = null;
            try {
                r5 r5Var2 = this.J;
                if (r5Var2 == null) {
                    cm.l.v("mBinding");
                    r5Var2 = null;
                }
                AppCompatEditText appCompatEditText = r5Var2.D;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("XXXXXX");
                String substring = A1().getMobileNumber().substring(6, 10);
                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring);
                appCompatEditText.setText(sb2.toString());
            } catch (Exception unused) {
                r5 r5Var3 = this.J;
                if (r5Var3 == null) {
                    cm.l.v("mBinding");
                    r5Var3 = null;
                }
                r5Var3.D.setText("NA");
            }
            r5 r5Var4 = this.J;
            if (r5Var4 == null) {
                cm.l.v("mBinding");
                r5Var4 = null;
            }
            r5Var4.f28380x.setText(" LL No. : " + this.L);
            r5 r5Var5 = this.J;
            if (r5Var5 == null) {
                cm.l.v("mBinding");
            } else {
                r5Var = r5Var5;
            }
            r5Var.B.f25961g.setText(z1().b("label_dl_serv_update_mob", "Update Mobile Number"));
        }
    }

    private final void C1() {
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
            aVar2.j(str, "LL", true, str2);
        } else {
            Toast.makeText(getApplicationContext(), z1().b("service_is_not_present", ""), 0).show();
        }
        vj.a aVar3 = this.K;
        if (aVar3 == null) {
            cm.l.v("updateMobVm");
        } else {
            aVar = aVar3;
        }
        aVar.h().g(this, new d(new a(this)));
    }

    private final void D1() {
        r5 r5Var = this.J;
        r5 r5Var2 = null;
        if (r5Var == null) {
            cm.l.v("mBinding");
            r5Var = null;
        }
        r5Var.B.f25959e.setOnClickListener(new rb.a(this));
        r5 r5Var3 = this.J;
        if (r5Var3 == null) {
            cm.l.v("mBinding");
            r5Var3 = null;
        }
        r5Var3.f28379w.setOnClickListener(new rb.b(this));
        r5 r5Var4 = this.J;
        if (r5Var4 == null) {
            cm.l.v("mBinding");
        } else {
            r5Var2 = r5Var4;
        }
        r5Var2.H.setOnClickListener(new rb.c(this));
    }

    /* access modifiers changed from: private */
    public static final void E1(LlMobileUpdateActivity llMobileUpdateActivity, View view) {
        cm.l.f(llMobileUpdateActivity, "this$0");
        llMobileUpdateActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void F1(LlMobileUpdateActivity llMobileUpdateActivity, View view) {
        cm.l.f(llMobileUpdateActivity, "this$0");
        llMobileUpdateActivity.finish();
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
    public static final void G1(com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlMobileUpdateActivity r5, android.view.View r6) {
        /*
            java.lang.String r6 = "this$0"
            cm.l.f(r5, r6)
            ni.r5 r6 = r5.J
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
            ni.r5 r6 = r5.J
            if (r6 != 0) goto L_0x0026
            cm.l.v(r1)
            r6 = r0
        L_0x0026:
            androidx.appcompat.widget.AppCompatEditText r6 = r6.C
            android.text.Editable r6 = r6.getText()
            cm.l.c(r6)
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0052
            ld.c r6 = r5.z1()
            java.lang.String r2 = "label_mb"
            java.lang.String r3 = "Please enter the mobile number"
            java.lang.String r6 = r6.b(r2, r3)
            ni.r5 r2 = r5.J
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
            ni.r5 r6 = r5.J
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
            ld.c r6 = r5.z1()
            java.lang.String r2 = r5.getString(r3)
            java.lang.String r6 = r6.b(r4, r2)
            ni.r5 r2 = r5.J
            if (r2 != 0) goto L_0x0049
            goto L_0x0045
        L_0x0081:
            t8.c$a r6 = t8.c.f16582a
            ni.r5 r2 = r5.J
            if (r2 != 0) goto L_0x008b
            cm.l.v(r1)
            r2 = r0
        L_0x008b:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.C
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r6 = r6.q(r2)
            if (r6 != 0) goto L_0x00ac
            ld.c r6 = r5.z1()
            java.lang.String r2 = r5.getString(r3)
            java.lang.String r6 = r6.b(r4, r2)
            ni.r5 r2 = r5.J
            if (r2 != 0) goto L_0x0049
            goto L_0x0045
        L_0x00ac:
            ld.c r6 = r5.z1()
            java.lang.String r0 = "label_want_to_proceed"
            java.lang.String r1 = "Are you sure, You want to proceed ?"
            java.lang.String r6 = r6.b(r0, r1)
            cm.l.c(r6)
            r5.I1(r6)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlMobileUpdateActivity.G1(com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlMobileUpdateActivity, android.view.View):void");
    }

    private final void I1(String str) {
        String b10 = z1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        g.n1(this, b10, str, 0, (String) null, (String) null, new c(this), 24, (Object) null);
    }

    public final FetchLlDetails A1() {
        FetchLlDetails fetchLlDetails = this.Q;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        cm.l.v("llDetails");
        return null;
    }

    public final void H1(String str) {
        cm.l.f(str, "message");
        String b10 = z1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        String b11 = z1().b("btn_ok", getString(R.string.ok_txt));
        cm.l.c(b11);
        g.n1(this, b10, str, 1, b11, (String) null, new b(this), 16, (Object) null);
    }

    public final void J1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.P = cVar;
    }

    public final void K1(FetchLlDetails fetchLlDetails) {
        cm.l.f(fetchLlDetails, "<set-?>");
        this.Q = fetchLlDetails;
    }

    public final void L1(Context context, FetchLlDetails fetchLlDetails) {
        cm.l.f(context, "context");
        cm.l.f(fetchLlDetails, "mFetchLlDetails");
        Intent intent = new Intent(context, LlMobileUpdateActivity.class);
        intent.putExtra("LLDetails", fetchLlDetails);
        context.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = f.f(this, R.layout.activity_ll_mobile_update);
        cm.l.e(f10, "setContentView(...)");
        this.J = (r5) f10;
        J1(new ld.c(this));
        B1();
        C1();
        D1();
    }

    public final ld.c z1() {
        ld.c cVar = this.P;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }
}
