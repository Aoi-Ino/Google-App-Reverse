package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.f;
import bi.g;
import bi.h;
import bm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.ApplicationStatusModel.AppliByRcModle;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel;
import com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet;
import com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus.VahanMultiServiceApplicationTransactionStatus;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequestfinal;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import java.util.ArrayList;
import ni.s9;
import pl.x;
import v9.e;

public final class VahanApplication extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public s9 G;
    private bi.b H;
    private bi.a I;
    private ApplicationService J;
    private ApplicationServiceOtp K;
    public ProgressDialog L;
    private final String M = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    /* access modifiers changed from: private */
    public String N = "";
    /* access modifiers changed from: private */
    public String O = "";
    private String P = "ApplicationNo";
    public ld.c Q;
    private String R = "";
    public h S;
    public VahanProService T;
    private RequireDataForBePaymet U;
    private ArrayList V;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplication f20770e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanApplication vahanApplication) {
            super(1);
            this.f20770e = vahanApplication;
        }

        public final void b(ApplicationStatusSuccessModel applicationStatusSuccessModel) {
            VahanApplication vahanApplication;
            try {
                if (applicationStatusSuccessModel.getTransList().size() > 0) {
                    this.f20770e.T1(applicationStatusSuccessModel.getTransList());
                    s9 s9Var = null;
                    if (this.f20770e.x1(applicationStatusSuccessModel.getTransList())) {
                        h B1 = this.f20770e.B1();
                        VahanApplication vahanApplication2 = this.f20770e;
                        s9 r12 = vahanApplication2.G;
                        if (r12 == null) {
                            cm.l.v("binding");
                        } else {
                            s9Var = r12;
                        }
                        B1.t(vahanApplication2, String.valueOf(s9Var.f28556l.getText()));
                        return;
                    }
                    if (this.f20770e.z1().isShowing()) {
                        this.f20770e.z1().dismiss();
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList<ApplStatusCurrentListModel> currentlist = applicationStatusSuccessModel.getTransList().get(0).getCurrentlist();
                    int size = currentlist.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (VContant.Companion.F(String.valueOf(currentlist.get(i10).getPurCd()))) {
                            arrayList.add(String.valueOf(currentlist.get(i10).getPurCd()));
                        }
                    }
                    if (arrayList.size() > 1) {
                        Intent intent = new Intent(this.f20770e, VahanMultiServiceApplicationTransactionStatus.class);
                        intent.putExtra("transList", new i7.d().t(applicationStatusSuccessModel.getTransList()));
                        s9 r13 = this.f20770e.G;
                        if (r13 == null) {
                            cm.l.v("binding");
                            r13 = null;
                        }
                        intent.putExtra("applicationNo", String.valueOf(r13.f28556l.getText()));
                        intent.putExtra("ownerName", this.f20770e.N);
                        intent.putExtra("stateCd", this.f20770e.O);
                        s9 r14 = this.f20770e.G;
                        if (r14 == null) {
                            cm.l.v("binding");
                        } else {
                            s9Var = r14;
                        }
                        intent.putExtra("regNo", String.valueOf(s9Var.f28558n.getText()));
                        this.f20770e.startActivity(intent);
                        vahanApplication = this.f20770e;
                    } else {
                        Intent intent2 = new Intent(this.f20770e, VahanApplicationTransactionStatus.class);
                        intent2.putExtra("transList", new i7.d().t(applicationStatusSuccessModel.getTransList()));
                        s9 r15 = this.f20770e.G;
                        if (r15 == null) {
                            cm.l.v("binding");
                            r15 = null;
                        }
                        intent2.putExtra("applicationNo", String.valueOf(r15.f28556l.getText()));
                        intent2.putExtra("ownerName", this.f20770e.N);
                        intent2.putExtra("stateCd", this.f20770e.O);
                        s9 r16 = this.f20770e.G;
                        if (r16 == null) {
                            cm.l.v("binding");
                        } else {
                            s9Var = r16;
                        }
                        intent2.putExtra("regNo", String.valueOf(s9Var.f28558n.getText()));
                        this.f20770e.startActivity(intent2);
                        vahanApplication = this.f20770e;
                    }
                    vahanApplication.finish();
                    return;
                }
                if (this.f20770e.z1().isShowing()) {
                    this.f20770e.z1().dismiss();
                }
                VahanApplication vahanApplication3 = this.f20770e;
                vahanApplication3.U1(vahanApplication3, vahanApplication3.y1().b("no_application_status", "No application status found for this application no."));
            } catch (Exception e10) {
                if (this.f20770e.z1().isShowing()) {
                    this.f20770e.z1().dismiss();
                }
                e10.printStackTrace();
                VahanApplication vahanApplication4 = this.f20770e;
                vahanApplication4.U1(vahanApplication4, vahanApplication4.getString(R.string.service_unavable_please_try));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ApplicationStatusSuccessModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplication f20771e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanApplication vahanApplication) {
            super(1);
            this.f20771e = vahanApplication;
        }

        public final void b(String str) {
            if (this.f20771e.z1().isShowing()) {
                this.f20771e.z1().dismiss();
            }
            VahanApplication vahanApplication = this.f20771e;
            vahanApplication.U1(vahanApplication, vahanApplication.y1().b("no_application_status", "No application status found for this application no."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplication f20772e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanApplication vahanApplication) {
            super(1);
            this.f20772e = vahanApplication;
        }

        public final void b(AppliByRcModle appliByRcModle) {
            if (this.f20772e.z1().isShowing()) {
                this.f20772e.z1().dismiss();
            }
            try {
                if (appliByRcModle.get1().getCurrentlist().size() > 0) {
                    Intent intent = new Intent(this.f20772e, ApplStatusApplicationList.class);
                    intent.putExtra("current", appliByRcModle);
                    this.f20772e.startActivity(intent);
                    this.f20772e.finish();
                    return;
                }
                VahanApplication vahanApplication = this.f20772e;
                vahanApplication.U1(vahanApplication, vahanApplication.y1().b("no_application_with_rc", "No application status found for this vehicle no."));
            } catch (Exception e10) {
                e10.printStackTrace();
                VahanApplication vahanApplication2 = this.f20772e;
                vahanApplication2.U1(vahanApplication2, vahanApplication2.getString(R.string.service_unavable_please_try));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AppliByRcModle) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplication f20773e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanApplication vahanApplication) {
            super(1);
            this.f20773e = vahanApplication;
        }

        public final void b(String str) {
            if (this.f20773e.z1().isShowing()) {
                this.f20773e.z1().dismiss();
            }
            VahanApplication vahanApplication = this.f20773e;
            vahanApplication.U1(vahanApplication, vahanApplication.y1().b("no_application_with_rc", "No application status found for this vehicle no."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20774a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f20774a = lVar;
        }

        public final pl.c a() {
            return this.f20774a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20774a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return cm.l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    private final void C1() {
        ApplicationService applicationService = this.J;
        s9 s9Var = null;
        if (applicationService == null) {
            cm.l.v("retrofitService");
            applicationService = null;
        }
        this.H = (bi.b) new u0((x0) this, (u0.b) new f(new wg.b(applicationService))).a(bi.b.class);
        ApplicationServiceOtp applicationServiceOtp = this.K;
        if (applicationServiceOtp == null) {
            cm.l.v("otpRetrofitService");
            applicationServiceOtp = null;
        }
        this.I = (bi.a) new u0((x0) this, (u0.b) new bi.e(new wg.a(applicationServiceOtp))).a(bi.a.class);
        R1(VahanProService.f21196b.b(this));
        S1((h) new u0((x0) this, (u0.b) new g(new wg.d(A1()))).a(h.class));
        s9 s9Var2 = this.G;
        if (s9Var2 == null) {
            cm.l.v("binding");
            s9Var2 = null;
        }
        s9Var2.f28549e.f28306g.setOnClickListener(new y(this));
        s9 s9Var3 = this.G;
        if (s9Var3 == null) {
            cm.l.v("binding");
            s9Var3 = null;
        }
        s9Var3.f28549e.f28305f.setOnClickListener(new z(this));
        s9 s9Var4 = this.G;
        if (s9Var4 == null) {
            cm.l.v("binding");
            s9Var4 = null;
        }
        s9Var4.f28553i.setOnClickListener(new a0(this));
        s9 s9Var5 = this.G;
        if (s9Var5 == null) {
            cm.l.v("binding");
            s9Var5 = null;
        }
        s9Var5.f28551g.setOnClickListener(new b0(this));
        s9 s9Var6 = this.G;
        if (s9Var6 == null) {
            cm.l.v("binding");
            s9Var6 = null;
        }
        s9Var6.f28558n.setKeyListener(DigitsKeyListener.getInstance(this.M));
        s9 s9Var7 = this.G;
        if (s9Var7 == null) {
            cm.l.v("binding");
            s9Var7 = null;
        }
        s9Var7.f28558n.setRawInputType(4096);
        s9 s9Var8 = this.G;
        if (s9Var8 == null) {
            cm.l.v("binding");
            s9Var8 = null;
        }
        s9Var8.f28557m.setKeyListener(DigitsKeyListener.getInstance(this.M));
        s9 s9Var9 = this.G;
        if (s9Var9 == null) {
            cm.l.v("binding");
            s9Var9 = null;
        }
        s9Var9.f28557m.setRawInputType(4096);
        s9 s9Var10 = this.G;
        if (s9Var10 == null) {
            cm.l.v("binding");
            s9Var10 = null;
        }
        s9Var10.f28556l.setKeyListener(DigitsKeyListener.getInstance(this.M));
        s9 s9Var11 = this.G;
        if (s9Var11 == null) {
            cm.l.v("binding");
            s9Var11 = null;
        }
        s9Var11.f28556l.setRawInputType(4096);
        s9 s9Var12 = this.G;
        if (s9Var12 == null) {
            cm.l.v("binding");
            s9Var12 = null;
        }
        s9Var12.f28548d.setOnClickListener(new q(this));
        s9 s9Var13 = this.G;
        if (s9Var13 == null) {
            cm.l.v("binding");
        } else {
            s9Var = s9Var13;
        }
        s9Var.f28560p.setOnClickListener(new r(this));
    }

    /* access modifiers changed from: private */
    public static final void D1(VahanApplication vahanApplication, View view) {
        cm.l.f(vahanApplication, "this$0");
        vahanApplication.N1();
    }

    /* access modifiers changed from: private */
    public static final void E1(VahanApplication vahanApplication, View view) {
        cm.l.f(vahanApplication, "this$0");
        vahanApplication.finish();
    }

    /* access modifiers changed from: private */
    public static final void F1(VahanApplication vahanApplication, View view) {
        cm.l.f(vahanApplication, "this$0");
        if (vahanApplication.X1()) {
            s9 s9Var = null;
            if (cm.l.a(vahanApplication.P, "ApplicationNo")) {
                s9 s9Var2 = vahanApplication.G;
                if (s9Var2 == null) {
                    cm.l.v("binding");
                } else {
                    s9Var = s9Var2;
                }
                vahanApplication.v1(String.valueOf(s9Var.f28556l.getText()), vahanApplication.O);
                return;
            }
            s9 s9Var3 = vahanApplication.G;
            if (s9Var3 == null) {
                cm.l.v("binding");
                s9Var3 = null;
            }
            String valueOf = String.valueOf(s9Var3.f28558n.getText());
            s9 s9Var4 = vahanApplication.G;
            if (s9Var4 == null) {
                cm.l.v("binding");
            } else {
                s9Var = s9Var4;
            }
            vahanApplication.w1(valueOf, String.valueOf(s9Var.f28557m.getText()));
        }
    }

    /* access modifiers changed from: private */
    public static final void G1(VahanApplication vahanApplication, View view) {
        cm.l.f(vahanApplication, "this$0");
        vahanApplication.finish();
    }

    /* access modifiers changed from: private */
    public static final void H1(VahanApplication vahanApplication, View view) {
        cm.l.f(vahanApplication, "this$0");
        s9 s9Var = vahanApplication.G;
        s9 s9Var2 = null;
        if (s9Var == null) {
            cm.l.v("binding");
            s9Var = null;
        }
        if (!s9Var.f28548d.isSelected()) {
            s9 s9Var3 = vahanApplication.G;
            if (s9Var3 == null) {
                cm.l.v("binding");
                s9Var3 = null;
            }
            s9Var3.f28548d.setChecked(true);
            s9 s9Var4 = vahanApplication.G;
            if (s9Var4 == null) {
                cm.l.v("binding");
                s9Var4 = null;
            }
            s9Var4.f28548d.setSelected(true);
            s9 s9Var5 = vahanApplication.G;
            if (s9Var5 == null) {
                cm.l.v("binding");
                s9Var5 = null;
            }
            s9Var5.f28547c.setBackgroundResource(R.drawable.corner_circle_14_selected);
            s9 s9Var6 = vahanApplication.G;
            if (s9Var6 == null) {
                cm.l.v("binding");
                s9Var6 = null;
            }
            s9Var6.f28560p.setChecked(false);
            s9 s9Var7 = vahanApplication.G;
            if (s9Var7 == null) {
                cm.l.v("binding");
                s9Var7 = null;
            }
            s9Var7.f28560p.setSelected(false);
            s9 s9Var8 = vahanApplication.G;
            if (s9Var8 == null) {
                cm.l.v("binding");
                s9Var8 = null;
            }
            s9Var8.f28559o.setBackgroundResource(R.drawable.corner_circle_bg_14);
            s9 s9Var9 = vahanApplication.G;
            if (s9Var9 == null) {
                cm.l.v("binding");
                s9Var9 = null;
            }
            s9Var9.f28556l.setVisibility(0);
            s9 s9Var10 = vahanApplication.G;
            if (s9Var10 == null) {
                cm.l.v("binding");
                s9Var10 = null;
            }
            s9Var10.f28546b.setVisibility(0);
            s9 s9Var11 = vahanApplication.G;
            if (s9Var11 == null) {
                cm.l.v("binding");
                s9Var11 = null;
            }
            s9Var11.f28554j.setVisibility(8);
            s9 s9Var12 = vahanApplication.G;
            if (s9Var12 == null) {
                cm.l.v("binding");
                s9Var12 = null;
            }
            s9Var12.f28558n.setVisibility(8);
            s9 s9Var13 = vahanApplication.G;
            if (s9Var13 == null) {
                cm.l.v("binding");
                s9Var13 = null;
            }
            s9Var13.f28550f.setVisibility(8);
            s9 s9Var14 = vahanApplication.G;
            if (s9Var14 == null) {
                cm.l.v("binding");
            } else {
                s9Var2 = s9Var14;
            }
            s9Var2.f28557m.setVisibility(8);
            vahanApplication.P = "ApplicationNo";
            return;
        }
        s9 s9Var15 = vahanApplication.G;
        if (s9Var15 == null) {
            cm.l.v("binding");
            s9Var15 = null;
        }
        s9Var15.f28548d.setChecked(false);
        s9 s9Var16 = vahanApplication.G;
        if (s9Var16 == null) {
            cm.l.v("binding");
            s9Var16 = null;
        }
        s9Var16.f28548d.setSelected(false);
        s9 s9Var17 = vahanApplication.G;
        if (s9Var17 == null) {
            cm.l.v("binding");
        } else {
            s9Var2 = s9Var17;
        }
        s9Var2.f28547c.setBackgroundResource(R.drawable.corner_circle_bg_14);
    }

    /* access modifiers changed from: private */
    public static final void I1(VahanApplication vahanApplication, View view) {
        cm.l.f(vahanApplication, "this$0");
        s9 s9Var = vahanApplication.G;
        s9 s9Var2 = null;
        if (s9Var == null) {
            cm.l.v("binding");
            s9Var = null;
        }
        if (!s9Var.f28560p.isSelected()) {
            s9 s9Var3 = vahanApplication.G;
            if (s9Var3 == null) {
                cm.l.v("binding");
                s9Var3 = null;
            }
            s9Var3.f28548d.setChecked(false);
            s9 s9Var4 = vahanApplication.G;
            if (s9Var4 == null) {
                cm.l.v("binding");
                s9Var4 = null;
            }
            s9Var4.f28548d.setSelected(false);
            s9 s9Var5 = vahanApplication.G;
            if (s9Var5 == null) {
                cm.l.v("binding");
                s9Var5 = null;
            }
            s9Var5.f28547c.setBackgroundResource(R.drawable.corner_circle_bg_14);
            s9 s9Var6 = vahanApplication.G;
            if (s9Var6 == null) {
                cm.l.v("binding");
                s9Var6 = null;
            }
            s9Var6.f28560p.setChecked(true);
            s9 s9Var7 = vahanApplication.G;
            if (s9Var7 == null) {
                cm.l.v("binding");
                s9Var7 = null;
            }
            s9Var7.f28560p.setSelected(true);
            s9 s9Var8 = vahanApplication.G;
            if (s9Var8 == null) {
                cm.l.v("binding");
                s9Var8 = null;
            }
            s9Var8.f28559o.setBackgroundResource(R.drawable.corner_circle_14_selected);
            s9 s9Var9 = vahanApplication.G;
            if (s9Var9 == null) {
                cm.l.v("binding");
                s9Var9 = null;
            }
            s9Var9.f28556l.setVisibility(8);
            s9 s9Var10 = vahanApplication.G;
            if (s9Var10 == null) {
                cm.l.v("binding");
                s9Var10 = null;
            }
            s9Var10.f28546b.setVisibility(8);
            s9 s9Var11 = vahanApplication.G;
            if (s9Var11 == null) {
                cm.l.v("binding");
                s9Var11 = null;
            }
            s9Var11.f28554j.setVisibility(0);
            s9 s9Var12 = vahanApplication.G;
            if (s9Var12 == null) {
                cm.l.v("binding");
                s9Var12 = null;
            }
            s9Var12.f28558n.setVisibility(0);
            s9 s9Var13 = vahanApplication.G;
            if (s9Var13 == null) {
                cm.l.v("binding");
                s9Var13 = null;
            }
            s9Var13.f28550f.setVisibility(0);
            s9 s9Var14 = vahanApplication.G;
            if (s9Var14 == null) {
                cm.l.v("binding");
            } else {
                s9Var2 = s9Var14;
            }
            s9Var2.f28557m.setVisibility(0);
            vahanApplication.P = "Vehicle";
            return;
        }
        s9 s9Var15 = vahanApplication.G;
        if (s9Var15 == null) {
            cm.l.v("binding");
            s9Var15 = null;
        }
        s9Var15.f28560p.setChecked(false);
        s9 s9Var16 = vahanApplication.G;
        if (s9Var16 == null) {
            cm.l.v("binding");
            s9Var16 = null;
        }
        s9Var16.f28560p.setSelected(false);
        s9 s9Var17 = vahanApplication.G;
        if (s9Var17 == null) {
            cm.l.v("binding");
        } else {
            s9Var2 = s9Var17;
        }
        s9Var2.f28559o.setBackgroundResource(R.drawable.corner_circle_bg_14);
    }

    /* access modifiers changed from: private */
    public static final void J1(VahanApplication vahanApplication, RequireDataForBePaymet requireDataForBePaymet) {
        cm.l.f(vahanApplication, "this$0");
        if (requireDataForBePaymet != null) {
            try {
                vahanApplication.U = requireDataForBePaymet;
                cm.l.c(requireDataForBePaymet);
                vahanApplication.O1(requireDataForBePaymet);
            } catch (Exception unused) {
                vahanApplication.z1().dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void K1(VahanApplication vahanApplication, String str) {
        cm.l.f(vahanApplication, "this$0");
        vahanApplication.z1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void L1(VahanApplication vahanApplication, FinalRequestSubmitResponse finalRequestSubmitResponse) {
        cm.l.f(vahanApplication, "this$0");
        vahanApplication.z1().dismiss();
        if (vahanApplication.z1().isShowing()) {
            vahanApplication.z1().dismiss();
        }
        s9 s9Var = vahanApplication.G;
        if (s9Var == null) {
            cm.l.v("binding");
            s9Var = null;
        }
        vahanApplication.v1(String.valueOf(s9Var.f28556l.getText()), vahanApplication.O);
    }

    /* access modifiers changed from: private */
    public static final void M1(VahanApplication vahanApplication, String str) {
        cm.l.f(vahanApplication, "this$0");
        vahanApplication.z1().dismiss();
        if (vahanApplication.z1().isShowing()) {
            vahanApplication.z1().dismiss();
        }
        Intent intent = new Intent(vahanApplication, VahanApplicationTransactionStatus.class);
        intent.putExtra("transList", new i7.d().t(vahanApplication.V));
        s9 s9Var = vahanApplication.G;
        s9 s9Var2 = null;
        if (s9Var == null) {
            cm.l.v("binding");
            s9Var = null;
        }
        intent.putExtra("applicationNo", String.valueOf(s9Var.f28556l.getText()));
        intent.putExtra("ownerName", vahanApplication.N);
        intent.putExtra("stateCd", vahanApplication.O);
        s9 s9Var3 = vahanApplication.G;
        if (s9Var3 == null) {
            cm.l.v("binding");
        } else {
            s9Var2 = s9Var3;
        }
        intent.putExtra("regNo", String.valueOf(s9Var2.f28558n.getText()));
        vahanApplication.startActivity(intent);
        vahanApplication.finish();
    }

    private final void N1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void U1(Context context, String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        ld.c cVar = new ld.c(context);
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setVisibility(8);
        textView.setText(cVar.b("btn_ok", getString(R.string.ok_text)));
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new w(dialog));
        textView2.setOnClickListener(new x(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void V1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void W1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (r0 == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        cm.l.v("binding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        r0 = r1.f28556l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        r0.requestFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cd, code lost:
        if (r0 == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011f, code lost:
        if (r0 == null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0121, code lost:
        cm.l.v("binding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0125, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0126, code lost:
        r0 = r1.f28558n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0163, code lost:
        if (r0 == null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b2, code lost:
        if (r0 == null) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b4, code lost:
        cm.l.v("binding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b8, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b9, code lost:
        r0 = r1.f28557m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f6, code lost:
        if (r0 == null) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean X1() {
        /*
            r7 = this;
            ni.s9 r0 = r7.G
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28556l
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r3 = com.nic.mparivahan.dlservices.utilities.d.d(r0)
            r4 = 0
            if (r3 == 0) goto L_0x0026
            r3 = 2
            java.lang.String r0 = r0.substring(r4, r3)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r0, r3)
        L_0x0026:
            r7.O = r0
            ni.s9 r3 = r7.G
            if (r3 != 0) goto L_0x0030
            cm.l.v(r2)
            r3 = r1
        L_0x0030:
            androidx.appcompat.widget.AppCompatEditText r3 = r3.f28556l
            java.lang.String r5 = "txtApplicationNo"
            cm.l.e(r3, r5)
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0082
            ni.s9 r3 = r7.G
            if (r3 != 0) goto L_0x0045
            cm.l.v(r2)
            r3 = r1
        L_0x0045:
            androidx.appcompat.widget.AppCompatEditText r3 = r3.f28556l
            android.text.Editable r3 = r3.getText()
            cm.l.c(r3)
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0082
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x005c
            cm.l.v(r2)
            r0 = r1
        L_0x005c:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28556l
            ld.c r3 = r7.y1()
            r5 = 2132018767(0x7f14064f, float:1.967585E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "PLEASE_ENTER_APPLICATION"
            java.lang.String r3 = r3.b(r6, r5)
            r0.setError(r3)
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x007a
        L_0x0076:
            cm.l.v(r2)
            goto L_0x007b
        L_0x007a:
            r1 = r0
        L_0x007b:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f28556l
        L_0x007d:
            r0.requestFocus()
            goto L_0x01f9
        L_0x0082:
            ni.s9 r3 = r7.G
            if (r3 != 0) goto L_0x008a
            cm.l.v(r2)
            r3 = r1
        L_0x008a:
            androidx.appcompat.widget.AppCompatEditText r3 = r3.f28556l
            cm.l.e(r3, r5)
            int r3 = r3.getVisibility()
            r5 = 1
            if (r3 != 0) goto L_0x00d3
            ni.s9 r3 = r7.G
            if (r3 != 0) goto L_0x009e
            cm.l.v(r2)
            r3 = r1
        L_0x009e:
            androidx.appcompat.widget.AppCompatEditText r3 = r3.f28556l
            android.text.Editable r3 = r3.getText()
            cm.l.c(r3)
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x00d3
            java.util.stream.IntStream r0 = r0.chars()
            com.nic.mparivahan.VahanServices.VahanApplicationStatus.s r3 = new com.nic.mparivahan.VahanServices.VahanApplicationStatus.s
            r3.<init>()
            boolean r0 = r0.allMatch(r3)
            if (r0 != 0) goto L_0x00d0
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x00c4
            cm.l.v(r2)
            r0 = r1
        L_0x00c4:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28556l
            java.lang.String r3 = "Invalid Application No."
            r0.setError(r3)
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x007a
            goto L_0x0076
        L_0x00d0:
            r4 = r5
            goto L_0x01f9
        L_0x00d3:
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x00db
            cm.l.v(r2)
            r0 = r1
        L_0x00db:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28558n
            java.lang.String r3 = "txtRegNo"
            cm.l.e(r0, r3)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x012a
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x00f0
            cm.l.v(r2)
            r0 = r1
        L_0x00f0:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28558n
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x012a
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x0107
            cm.l.v(r2)
            r0 = r1
        L_0x0107:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28558n
            ld.c r3 = r7.y1()
            r5 = 2132018753(0x7f140641, float:1.9675822E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "PLEASE_ENTER_REG"
            java.lang.String r3 = r3.b(r6, r5)
            r0.setError(r3)
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x0125
        L_0x0121:
            cm.l.v(r2)
            goto L_0x0126
        L_0x0125:
            r1 = r0
        L_0x0126:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f28558n
            goto L_0x007d
        L_0x012a:
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x0132
            cm.l.v(r2)
            r0 = r1
        L_0x0132:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28558n
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            r3 = 4
            if (r0 >= r3) goto L_0x0166
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x014b
            cm.l.v(r2)
            r0 = r1
        L_0x014b:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28558n
            ld.c r3 = r7.y1()
            r5 = 2132018211(0x7f140423, float:1.9674722E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "label_challan_invalid_vehicle_no"
            java.lang.String r3 = r3.b(r6, r5)
            r0.setError(r3)
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x0125
            goto L_0x0121
        L_0x0166:
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x016e
            cm.l.v(r2)
            r0 = r1
        L_0x016e:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28557m
            java.lang.String r3 = "txtChassisNo"
            cm.l.e(r0, r3)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01bd
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x0183
            cm.l.v(r2)
            r0 = r1
        L_0x0183:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28557m
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01bd
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x019a
            cm.l.v(r2)
            r0 = r1
        L_0x019a:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28557m
            ld.c r3 = r7.y1()
            r5 = 2132018724(0x7f140624, float:1.9675763E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "PLEASE_ENTER_CHASSI"
            java.lang.String r3 = r3.b(r6, r5)
            r0.setError(r3)
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x01b8
        L_0x01b4:
            cm.l.v(r2)
            goto L_0x01b9
        L_0x01b8:
            r1 = r0
        L_0x01b9:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f28557m
            goto L_0x007d
        L_0x01bd:
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x01c5
            cm.l.v(r2)
            r0 = r1
        L_0x01c5:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28557m
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            r3 = 5
            if (r0 >= r3) goto L_0x00d0
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x01de
            cm.l.v(r2)
            r0 = r1
        L_0x01de:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28557m
            ld.c r3 = r7.y1()
            r5 = 2132018203(0x7f14041b, float:1.9674706E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "INVALID_CHASSI"
            java.lang.String r3 = r3.b(r6, r5)
            r0.setError(r3)
            ni.s9 r0 = r7.G
            if (r0 != 0) goto L_0x01b8
            goto L_0x01b4
        L_0x01f9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplication.X1():boolean");
    }

    private final void v1(String str, String str2) {
        z1().show();
        bi.a aVar = this.I;
        if (aVar == null) {
            cm.l.v("otpViewModel");
            aVar = null;
        }
        aVar.o(this, str, str2);
    }

    private final void w1(String str, String str2) {
        z1().show();
        bi.a aVar = this.I;
        if (aVar == null) {
            cm.l.v("otpViewModel");
            aVar = null;
        }
        aVar.p(this, str, str2);
    }

    public final VahanProService A1() {
        VahanProService vahanProService = this.T;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("slotService");
        return null;
    }

    public final h B1() {
        h hVar = this.S;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("slotViewModel");
        return null;
    }

    public final void O1(RequireDataForBePaymet requireDataForBePaymet) {
        cm.l.f(requireDataForBePaymet, "payment_response");
        s9 s9Var = this.G;
        if (s9Var == null) {
            cm.l.v("binding");
            s9Var = null;
        }
        B1().o1(new BeforePaymentRequestfinal("", String.valueOf(s9Var.f28556l.getText()), (ChaangeOfAddressStatus) null, 0, (dulicateRcResponseModle) null, " ", " ", (HPAResModle) null, (HptTerResponse) null, 0, " ", 0, " ", " ", (NocDraftResponse) null, "", "", "", "", this.R, requireDataForBePaymet.getRcpt_dt().toString(), requireDataForBePaymet.getReturn_rcpt_no(), String.valueOf(requireDataForBePaymet.getRcpt_amt()), 0, requireDataForBePaymet.getRegn_no().toString(), requireDataForBePaymet.getState_cd(), "", "", "", 0));
    }

    public final void P1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final void Q1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void R1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.T = vahanProService;
    }

    public final void S1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.S = hVar;
    }

    public final void T1(ArrayList arrayList) {
        this.V = arrayList;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.application_status_new);
        s9 c10 = s9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        bi.a aVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        getWindow().addFlags(128);
        e.a aVar2 = v9.e.f17509a;
        s9 s9Var = this.G;
        if (s9Var == null) {
            cm.l.v("binding");
            s9Var = null;
        }
        aVar2.Y1(this, s9Var);
        P1(new ld.c(this));
        this.J = ApplicationService.f21181a.b(this);
        this.K = ApplicationServiceOtp.f21184a.b(this);
        Q1(new ProgressDialog(this));
        z1().setMessage(y1().b("label_challan_please_wait", "Please wait..."));
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        C1();
        bi.a aVar3 = this.I;
        if (aVar3 == null) {
            cm.l.v("otpViewModel");
            aVar3 = null;
        }
        aVar3.n().g(this, new e(new a(this)));
        bi.a aVar4 = this.I;
        if (aVar4 == null) {
            cm.l.v("otpViewModel");
            aVar4 = null;
        }
        aVar4.k().g(this, new e(new b(this)));
        bi.a aVar5 = this.I;
        if (aVar5 == null) {
            cm.l.v("otpViewModel");
            aVar5 = null;
        }
        aVar5.m().g(this, new e(new c(this)));
        bi.a aVar6 = this.I;
        if (aVar6 == null) {
            cm.l.v("otpViewModel");
        } else {
            aVar = aVar6;
        }
        aVar.l().g(this, new e(new d(this)));
        B1().U().g(this, new p(this));
        B1().V().g(this, new t(this));
        B1().Q().g(this, new u(this));
        B1().R().g(this, new v(this));
    }

    public final boolean x1(ArrayList arrayList) {
        cm.l.f(arrayList, "transList");
        if (arrayList.size() > 0 && arrayList.size() > 0 && ((ApplStatusTransListModel) arrayList.get(0)).getCurrentlist().size() > 0) {
            ArrayList<ApplStatusCurrentListModel> currentlist = ((ApplStatusTransListModel) arrayList.get(0)).getCurrentlist();
            int size = currentlist.size();
            for (int i10 = 0; i10 < size; i10++) {
                Log.e("Pending2", "119");
                Log.e("Pending2", String.valueOf(currentlist.get(i10).getPurCd()));
                if (VContant.Companion.F(String.valueOf(currentlist.get(i10).getPurCd()))) {
                    String str = currentlist.get(i10).getStatusDesc().toString();
                    Log.e("Pending2", str);
                    this.R = String.valueOf(currentlist.get(i10).getPurCd());
                    if (!q.D(str, "Please do final submit", true) && !q.D(str, "final submit", true)) {
                        return false;
                    }
                    Log.e("Pending2tRUE", str);
                    return true;
                }
            }
        }
        return false;
    }

    public final ld.c y1() {
        ld.c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }
}
