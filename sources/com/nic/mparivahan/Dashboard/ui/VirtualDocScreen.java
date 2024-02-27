package com.nic.mparivahan.Dashboard.ui;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.Model.UpdateDocSuccessResponse;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.GetSharedRecivedDoc;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.Model.ReceivedDoc;
import com.nic.mparivahan.RC.Model.SharedDoc;
import com.nic.mparivahan.RC.Model.SharedRcDeletResponse;
import com.nic.mparivahan.RC.RcInterface.RcService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import ni.de;
import sa.e0;
import sa.f0;
import sa.g0;
import sa.h0;
import sa.i0;
import sa.j0;
import sa.k0;
import sa.m0;
import sa.n0;
import sa.o0;
import sa.p0;
import sa.q0;
import sa.r0;
import v9.d;
import v9.f;
import wc.b0;
import wc.l0;
import z9.a;

public final class VirtualDocScreen extends androidx.appcompat.app.d implements zc.c, zc.b, zc.g {
    public cd.c G;
    public RcService H;
    public za.a I;
    public DlService J;
    public DatabaseHelper K;
    public ArrayList L;
    public ld.g M;
    public ProgressDialog N;
    public b0 O;
    public wc.u P;
    private int Q;
    private int R;
    public l0 S;
    public String T;
    public de U;
    public DldetobjX V;
    /* access modifiers changed from: private */
    public String W = "";
    public ld.c X;

    static final class a extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8495e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8495e = virtualDocScreen;
        }

        public final void b(String str) {
            this.f8495e.E1().dismiss();
            Toast.makeText(this.f8495e.getApplicationContext(), this.f8495e.I1().b("no_details", "Unable to get the details, Please try after sometimes!"), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return pl.x.f30437a;
        }
    }

    static final class a0 implements androidx.lifecycle.b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8496a;

        a0(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f8496a = lVar;
        }

        public final pl.c a() {
            return this.f8496a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8496a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return cm.l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    static final class b extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8497e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8497e = virtualDocScreen;
        }

        public final void b(SharedRcDeletResponse sharedRcDeletResponse) {
            try {
                this.f8497e.E1().dismiss();
                if (p.o(sharedRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        this.f8497e.K1().Q(this.f8497e.F1());
                        VirtualDocScreen virtualDocScreen = this.f8497e;
                        virtualDocScreen.p2(virtualDocScreen, virtualDocScreen.I1().b(v9.f.f17510a.t0(), "Shared RC Successfully Deleted"));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else if (!ka.c.f13158a.m(sharedRcDeletResponse.getStatusDesc())) {
                    VirtualDocScreen virtualDocScreen2 = this.f8497e;
                    virtualDocScreen2.p2(virtualDocScreen2, sharedRcDeletResponse.getStatusDesc());
                } else {
                    Toast.makeText(this.f8497e.getApplicationContext(), this.f8497e.I1().b(v9.f.f17510a.H0(), "Unable to delete the shared Rc, Please try after some time"), 1).show();
                }
            } catch (Exception e11) {
                this.f8497e.E1().dismiss();
                e11.printStackTrace();
                Toast.makeText(this.f8497e.getApplicationContext(), this.f8497e.I1().b(v9.f.f17510a.H0(), "Unable to delete the shared Rc, Please try after some time"), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SharedRcDeletResponse) obj);
            return pl.x.f30437a;
        }
    }

    static final class c extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8498e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8498e = virtualDocScreen;
        }

        public final void b(String str) {
            Toast.makeText(this.f8498e.getApplicationContext(), this.f8498e.I1().b(v9.f.f17510a.H0(), "Unable to delete the shared Rc, Please try after some time"), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return pl.x.f30437a;
        }
    }

    static final class d extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8499e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8499e = virtualDocScreen;
        }

        public final void b(SharedRcDeletResponse sharedRcDeletResponse) {
            try {
                this.f8499e.E1().dismiss();
                if (p.o(sharedRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        this.f8499e.G1().O(this.f8499e.F1());
                        VirtualDocScreen virtualDocScreen = this.f8499e;
                        virtualDocScreen.p2(virtualDocScreen, virtualDocScreen.I1().b(v9.f.f17510a.i0(), "Received RC Successfully Deleted!"));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else if (!ka.c.f13158a.m(sharedRcDeletResponse.getStatusDesc())) {
                    VirtualDocScreen virtualDocScreen2 = this.f8499e;
                    virtualDocScreen2.p2(virtualDocScreen2, sharedRcDeletResponse.getStatusDesc());
                } else {
                    Toast.makeText(this.f8499e.getApplicationContext(), this.f8499e.I1().b(v9.f.f17510a.G0(), "Unable to delete the Received RC, Please try after some times"), 1).show();
                }
            } catch (Exception e11) {
                this.f8499e.E1().dismiss();
                e11.printStackTrace();
                Toast.makeText(this.f8499e.getApplicationContext(), this.f8499e.I1().b(v9.f.f17510a.G0(), "Unable to delete the Received RC, Please try after some times"), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SharedRcDeletResponse) obj);
            return pl.x.f30437a;
        }
    }

    static final class e extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8500e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8500e = virtualDocScreen;
        }

        public final void b(MyRcDeletResponse myRcDeletResponse) {
            Toast makeText;
            VirtualDocScreen virtualDocScreen;
            String b10;
            try {
                this.f8500e.E1().dismiss();
                if (p.o(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        this.f8500e.C1().Y(this.f8500e.D1());
                        this.f8500e.w1().X(this.f8500e.H1());
                        if (!ka.c.f13158a.m(myRcDeletResponse.getStatusDesc())) {
                            virtualDocScreen = this.f8500e;
                            b10 = virtualDocScreen.I1().b(v9.f.f17510a.h0(), "Virtual RC successfully deleted!");
                        } else {
                            virtualDocScreen = this.f8500e;
                            b10 = virtualDocScreen.I1().b(v9.f.f17510a.h0(), "Virtual RC successfully deleted!");
                        }
                        virtualDocScreen.p2(virtualDocScreen, b10);
                        try {
                            VirtualDocScreen virtualDocScreen2 = this.f8500e;
                            ArrayList E0 = virtualDocScreen2.w1().E0();
                            cm.l.d(E0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.Document> }");
                            virtualDocScreen2.Z1(E0);
                            if (this.f8500e.u1().size() <= 0) {
                                this.f8500e.v1().f25971c0.setAdapter((RecyclerView.h) null);
                                this.f8500e.v1().f25989l0.setVisibility(0);
                                TextView textView = this.f8500e.v1().f25989l0;
                                ld.c I1 = this.f8500e.I1();
                                f.a aVar = v9.f.f17510a;
                                textView.setText(I1.b(aVar.Q(), "No Virtual RC Found"));
                                this.f8500e.v1().f25987k0.setVisibility(0);
                                this.f8500e.v1().f25991m0.setText(this.f8500e.I1().b(aVar.Z(), "There is no Virtual RC \nfound for your account"));
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        makeText = Toast.makeText(this.f8500e.getApplicationContext(), this.f8500e.I1().b(v9.f.f17510a.F0(), "Unable to delete the Virtual Rc, Please try after some time"), 1);
                    }
                } else if (p.o(myRcDeletResponse.getStatusCode(), "VTLD090", true)) {
                    v9.d.f17494a.D(this.f8500e, myRcDeletResponse.getStatusDesc(), 1);
                } else if (p.o(myRcDeletResponse.getStatusCode(), "VTLD091", true)) {
                    v9.d.f17494a.D(this.f8500e, myRcDeletResponse.getStatusDesc(), 2);
                } else if (!ka.c.f13158a.m(myRcDeletResponse.getStatusDesc())) {
                    VirtualDocScreen virtualDocScreen3 = this.f8500e;
                    virtualDocScreen3.p2(virtualDocScreen3, myRcDeletResponse.getStatusDesc());
                } else {
                    makeText = Toast.makeText(this.f8500e.getApplicationContext(), this.f8500e.I1().b(v9.f.f17510a.F0(), "Unable to delete the Virtual Rc, Please try after some time"), 1);
                    makeText.show();
                }
            } catch (Exception e11) {
                this.f8500e.E1().dismiss();
                Log.e("error-1-", myRcDeletResponse.toString());
                e11.printStackTrace();
                Toast.makeText(this.f8500e.getApplicationContext(), this.f8500e.I1().b(v9.f.f17510a.F0(), "Unable to delete the Virtual Rc, Please try after some time"), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((MyRcDeletResponse) obj);
            return pl.x.f30437a;
        }
    }

    static final class f extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8501e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8501e = virtualDocScreen;
        }

        public final void b(String str) {
            this.f8501e.E1().dismiss();
            Toast.makeText(this.f8501e.getApplicationContext(), this.f8501e.I1().b(v9.f.f17510a.F0(), "Unable to delete the Virtual Rc, Please try after some time"), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return pl.x.f30437a;
        }
    }

    static final class g extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8502e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8502e = virtualDocScreen;
        }

        public final void b(MyRcDeletResponse myRcDeletResponse) {
            try {
                this.f8502e.E1().dismiss();
                if (p.o(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        this.f8502e.w1().E();
                        VirtualDocScreen virtualDocScreen = this.f8502e;
                        virtualDocScreen.p2(virtualDocScreen, virtualDocScreen.I1().b(v9.f.f17510a.Z0(), "Virtual DL successfully deleted!"));
                        this.f8502e.c2();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        Toast.makeText(this.f8502e.getApplicationContext(), this.f8502e.I1().b(v9.f.f17510a.E0(), "Unable to delete the Virtual DL, Please try after some times"), 1).show();
                    }
                } else if (!ka.c.f13158a.m(myRcDeletResponse.getStatusDesc())) {
                    VirtualDocScreen virtualDocScreen2 = this.f8502e;
                    virtualDocScreen2.p2(virtualDocScreen2, myRcDeletResponse.getStatusDesc());
                }
            } catch (Exception e11) {
                this.f8502e.E1().dismiss();
                Log.e("error-1-", myRcDeletResponse.toString());
                e11.printStackTrace();
                Toast.makeText(this.f8502e.getApplicationContext(), this.f8502e.I1().b(v9.f.f17510a.E0(), "Unable to delete the Virtual DL, Please try after some time"), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((MyRcDeletResponse) obj);
            return pl.x.f30437a;
        }
    }

    static final class h extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8503e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8503e = virtualDocScreen;
        }

        public final void b(String str) {
            this.f8503e.E1().dismiss();
            Toast.makeText(this.f8503e.getApplicationContext(), this.f8503e.I1().b(v9.f.f17510a.E0(), "Unable to delete the Virtual DL, Please try after some time"), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return pl.x.f30437a;
        }
    }

    static final class i extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8504e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8504e = virtualDocScreen;
        }

        public final void b(RcModelsDet rcModelsDet) {
            this.f8504e.E1().dismiss();
            try {
                if (p.o(rcModelsDet.getStatusCode().toString(), "NP001", true)) {
                    try {
                        this.f8504e.w1().c(rcModelsDet.getNrvDetails().getRc_regn_no(), rcModelsDet.getNrvDetails(), 0);
                        this.f8504e.C1().j();
                        VirtualDocScreen virtualDocScreen = this.f8504e;
                        virtualDocScreen.p2(virtualDocScreen, virtualDocScreen.I1().b(v9.f.f17510a.a1(), "Virtual RC successfully updated"));
                    } catch (Exception unused) {
                    }
                } else {
                    VirtualDocScreen virtualDocScreen2 = this.f8504e;
                    virtualDocScreen2.p2(virtualDocScreen2, virtualDocScreen2.I1().b(v9.f.f17510a.O0(), "Unable to Update the Virtual RC, Please try after some time"));
                }
            } catch (Exception unused2) {
                this.f8504e.E1().dismiss();
                VirtualDocScreen virtualDocScreen3 = this.f8504e;
                virtualDocScreen3.p2(virtualDocScreen3, virtualDocScreen3.I1().b(v9.f.f17510a.O0(), "Unable to Update the Virtual RC, Please try after some time"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RcModelsDet) obj);
            return pl.x.f30437a;
        }
    }

    static final class j extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8505e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8505e = virtualDocScreen;
        }

        public final void b(String str) {
            this.f8505e.E1().dismiss();
            try {
                VirtualDocScreen virtualDocScreen = this.f8505e;
                virtualDocScreen.p2(virtualDocScreen, virtualDocScreen.I1().b(v9.f.f17510a.O0(), "Unable to Update the Virtual RC, Please try after some time"));
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return pl.x.f30437a;
        }
    }

    static final class k extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8506e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8506e = virtualDocScreen;
        }

        public final void b(DLServiceResponseModleV1 dLServiceResponseModleV1) {
            try {
                this.f8506e.v1().W.setVisibility(8);
                try {
                    this.f8506e.v1().f25998q.setText(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioFullName());
                    TextView textView = this.f8506e.v1().f25994o;
                    textView.setText(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioPermAdd1() + ' ' + dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioPermAdd2());
                    TextView textView2 = this.f8506e.v1().f25996p;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f8506e.I1().b("issue_date", "Issue Date"));
                    a.C0251a aVar = z9.a.f18947a;
                    sb2.append(aVar.f(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlIssuedt()));
                    textView2.setText(sb2.toString());
                    TextView textView3 = this.f8506e.v1().f26002s;
                    textView3.setText(this.f8506e.I1().b("label_dl_serv_valid_upto", "Valid Upto") + aVar.f(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlNtValdtoDt()));
                    this.f8506e.v1().V.setVisibility(0);
                    this.f8506e.w1().M0(q.B0(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                } catch (Exception e10) {
                    e10.printStackTrace();
                    this.f8506e.v1().F.setAlpha(0.5f);
                    this.f8506e.v1().f26011z.setVisibility(0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                this.f8506e.v1().W.setVisibility(8);
                this.f8506e.v1().F.setAlpha(0.5f);
                this.f8506e.v1().f26011z.setVisibility(0);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DLServiceResponseModleV1) obj);
            return pl.x.f30437a;
        }
    }

    static final class l extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8507e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8507e = virtualDocScreen;
        }

        public final void b(String str) {
            try {
                Log.e("Track", "111");
                this.f8507e.v1().W.setVisibility(8);
                this.f8507e.v1().F.setAlpha(0.5f);
                this.f8507e.v1().f26011z.setVisibility(0);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f8507e.v1().W.setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return pl.x.f30437a;
        }
    }

    static final class m extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8508e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8508e = virtualDocScreen;
        }

        public final void b(DLServiceResponseModleV1 dLServiceResponseModleV1) {
            try {
                Log.e("Track", "111");
                Log.e("Track", dLServiceResponseModleV1.getDldetobj().get(0).toString());
                this.f8508e.v1().W.setVisibility(8);
                try {
                    this.f8508e.w1().M0(q.B0(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                    this.f8508e.c2();
                    VirtualDocScreen virtualDocScreen = this.f8508e;
                    virtualDocScreen.p2(virtualDocScreen, virtualDocScreen.I1().b(v9.f.f17510a.l(), "Virtual DL Successfully updated!"));
                } catch (Exception e10) {
                    e10.printStackTrace();
                    VirtualDocScreen virtualDocScreen2 = this.f8508e;
                    virtualDocScreen2.p2(virtualDocScreen2, virtualDocScreen2.I1().b(v9.f.f17510a.N0(), "Unable to update the Virtual DL, Please try after some time"));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                this.f8508e.v1().W.setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DLServiceResponseModleV1) obj);
            return pl.x.f30437a;
        }
    }

    static final class n extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8509e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8509e = virtualDocScreen;
        }

        public final void b(String str) {
            try {
                Log.e("Track", "111");
                this.f8509e.v1().W.setVisibility(8);
                VirtualDocScreen virtualDocScreen = this.f8509e;
                virtualDocScreen.p2(virtualDocScreen, virtualDocScreen.I1().b(v9.f.f17510a.N0(), "Unable to update the Virtual DL, Please try after some time"));
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f8509e.v1().W.setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return pl.x.f30437a;
        }
    }

    static final class o extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8510e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8510e = virtualDocScreen;
        }

        public final void b(UpdateDocSuccessResponse updateDocSuccessResponse) {
            d.a aVar;
            VirtualDocScreen virtualDocScreen;
            String statusDesc;
            if (cm.l.a(updateDocSuccessResponse.getStatusCode(), "VTLD001")) {
                this.f8510e.z1().j(q.B0(this.f8510e.x1().getDlobj().getDlLicno().toString()).toString(), z9.a.f18947a.b(q.B0(this.f8510e.x1().getBioObj().getBioDob().toString()).toString()), this.f8510e);
                return;
            }
            int i10 = 1;
            if (p.o(updateDocSuccessResponse.getStatusCode(), "VTLD090", true)) {
                this.f8510e.E1().dismiss();
                aVar = v9.d.f17494a;
                virtualDocScreen = this.f8510e;
                statusDesc = updateDocSuccessResponse.getStatusDesc();
            } else if (p.o(updateDocSuccessResponse.getStatusCode(), "VTLD091", true)) {
                this.f8510e.E1().dismiss();
                aVar = v9.d.f17494a;
                virtualDocScreen = this.f8510e;
                statusDesc = updateDocSuccessResponse.getStatusDesc();
                i10 = 2;
            } else if (!ka.c.f13158a.m(updateDocSuccessResponse.getStatusDesc())) {
                this.f8510e.E1().dismiss();
                VirtualDocScreen virtualDocScreen2 = this.f8510e;
                virtualDocScreen2.p2(virtualDocScreen2, updateDocSuccessResponse.getStatusDesc());
                return;
            } else {
                return;
            }
            aVar.D(virtualDocScreen, statusDesc, i10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UpdateDocSuccessResponse) obj);
            return pl.x.f30437a;
        }
    }

    static final class p extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8511e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8511e = virtualDocScreen;
        }

        public final void b(String str) {
            if (this.f8511e.E1().isShowing()) {
                this.f8511e.E1().dismiss();
            }
            VirtualDocScreen virtualDocScreen = this.f8511e;
            virtualDocScreen.p2(virtualDocScreen, virtualDocScreen.I1().b(v9.f.f17510a.N0(), "Unable to update the Virtual DL, Please try after some time"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return pl.x.f30437a;
        }
    }

    static final class q extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8512e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8512e = virtualDocScreen;
        }

        public final void b(MyRcDeletResponse myRcDeletResponse) {
            d.a aVar;
            VirtualDocScreen virtualDocScreen;
            String statusDesc;
            if (cm.l.a(myRcDeletResponse.getStatusCode(), "VTLD001")) {
                try {
                    String s02 = this.f8512e.w1().s0(this.f8512e.W);
                    cd.c B1 = this.f8512e.B1();
                    String k10 = this.f8512e.J1().k();
                    cm.l.c(s02);
                    B1.o(k10, s02, this.f8512e);
                } catch (Exception unused) {
                }
            } else {
                int i10 = 1;
                if (p.o(myRcDeletResponse.getStatusCode(), "VTLD090", true)) {
                    this.f8512e.E1().dismiss();
                    aVar = v9.d.f17494a;
                    virtualDocScreen = this.f8512e;
                    statusDesc = myRcDeletResponse.getStatusDesc();
                } else if (p.o(myRcDeletResponse.getStatusCode(), "VTLD091", true)) {
                    this.f8512e.E1().dismiss();
                    aVar = v9.d.f17494a;
                    virtualDocScreen = this.f8512e;
                    statusDesc = myRcDeletResponse.getStatusDesc();
                    i10 = 2;
                } else if (!ka.c.f13158a.m(myRcDeletResponse.getStatusDesc())) {
                    this.f8512e.E1().dismiss();
                    VirtualDocScreen virtualDocScreen2 = this.f8512e;
                    virtualDocScreen2.p2(virtualDocScreen2, myRcDeletResponse.getStatusDesc());
                    return;
                } else {
                    return;
                }
                aVar.D(virtualDocScreen, statusDesc, i10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((MyRcDeletResponse) obj);
            return pl.x.f30437a;
        }
    }

    static final class r extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8513e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8513e = virtualDocScreen;
        }

        public final void b(String str) {
            if (this.f8513e.E1().isShowing()) {
                this.f8513e.E1().dismiss();
            }
            VirtualDocScreen virtualDocScreen = this.f8513e;
            virtualDocScreen.p2(virtualDocScreen, virtualDocScreen.I1().b(v9.f.f17510a.O0(), "Unable to Update the Virtual RC, Please try after some times!"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return pl.x.f30437a;
        }
    }

    static final class s extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8514e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8514e = virtualDocScreen;
        }

        public final void b(GetSharedRecivedDoc getSharedRecivedDoc) {
            TextView textView;
            String b10;
            try {
                this.f8514e.E1().dismiss();
                if (p.o(getSharedRecivedDoc.getStatusCode(), "VTLD001", true)) {
                    if (getSharedRecivedDoc.getSharedDocs().size() > 0) {
                        this.f8514e.v1().f25987k0.setVisibility(8);
                        this.f8514e.v1().f25989l0.setVisibility(8);
                        this.f8514e.v1().f25971c0.setAdapter((RecyclerView.h) null);
                        VirtualDocScreen virtualDocScreen = this.f8514e;
                        List<SharedDoc> sharedDocs = getSharedRecivedDoc.getSharedDocs();
                        cm.l.d(sharedDocs, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.SharedDoc>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.SharedDoc> }");
                        VirtualDocScreen virtualDocScreen2 = this.f8514e;
                        virtualDocScreen.o2(new b0((ArrayList) sharedDocs, virtualDocScreen2, virtualDocScreen2));
                        this.f8514e.v1().f25971c0.setAdapter(this.f8514e.K1());
                        return;
                    }
                    this.f8514e.v1().f25971c0.setAdapter((RecyclerView.h) null);
                    this.f8514e.v1().f25989l0.setVisibility(0);
                    this.f8514e.v1().f25987k0.setVisibility(0);
                    TextView textView2 = this.f8514e.v1().f25991m0;
                    ld.c I1 = this.f8514e.I1();
                    f.a aVar = v9.f.f17510a;
                    textView2.setText(I1.b(aVar.V(), "There is no Shared RC \nfound for your account"));
                    textView = this.f8514e.v1().f25989l0;
                    b10 = this.f8514e.I1().b(aVar.U(), "No Shared RC Found");
                } else if (p.o(getSharedRecivedDoc.getStatusCode(), "VTLD007", true)) {
                    this.f8514e.v1().f25971c0.setAdapter((RecyclerView.h) null);
                    this.f8514e.v1().f25987k0.setVisibility(0);
                    TextView textView3 = this.f8514e.v1().f25991m0;
                    ld.c I12 = this.f8514e.I1();
                    f.a aVar2 = v9.f.f17510a;
                    textView3.setText(I12.b(aVar2.V(), "There is no Shared RC \nfound for your account"));
                    this.f8514e.v1().f25989l0.setVisibility(0);
                    textView = this.f8514e.v1().f25989l0;
                    b10 = this.f8514e.I1().b(aVar2.U(), "No Shared RC Found");
                } else if (p.o(getSharedRecivedDoc.getStatusCode(), "VTLD090", true)) {
                    this.f8514e.E1().dismiss();
                    v9.d.f17494a.D(this.f8514e, getSharedRecivedDoc.getStatusDesc(), 1);
                    return;
                } else if (p.o(getSharedRecivedDoc.getStatusCode(), "VTLD091", true)) {
                    this.f8514e.E1().dismiss();
                    v9.d.f17494a.D(this.f8514e, getSharedRecivedDoc.getStatusDesc(), 2);
                    return;
                } else {
                    this.f8514e.v1().f25971c0.setAdapter((RecyclerView.h) null);
                    this.f8514e.v1().f25987k0.setVisibility(0);
                    TextView textView4 = this.f8514e.v1().f25991m0;
                    ld.c I13 = this.f8514e.I1();
                    f.a aVar3 = v9.f.f17510a;
                    textView4.setText(I13.b(aVar3.V(), "There is no Shared RC \nfound for your account"));
                    this.f8514e.v1().f25989l0.setVisibility(0);
                    textView = this.f8514e.v1().f25989l0;
                    b10 = this.f8514e.I1().b(aVar3.U(), "No Shared RC Found");
                }
                textView.setText(b10);
            } catch (Exception e10) {
                this.f8514e.E1().dismiss();
                Log.e("error-1-", getSharedRecivedDoc.toString());
                e10.printStackTrace();
                Toast.makeText(this.f8514e.getApplicationContext(), this.f8514e.I1().b(v9.f.f17510a.a0(), "Number is not registered with the mParivahan"), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetSharedRecivedDoc) obj);
            return pl.x.f30437a;
        }
    }

    static final class t extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDocScreen f8515e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(VirtualDocScreen virtualDocScreen) {
            super(1);
            this.f8515e = virtualDocScreen;
        }

        public final void b(GetSharedRecivedDoc getSharedRecivedDoc) {
            TextView textView;
            String b10;
            try {
                this.f8515e.E1().dismiss();
                if (p.o(getSharedRecivedDoc.getStatusCode(), "VTLD001", true)) {
                    if (getSharedRecivedDoc.getReceivedDocs().size() > 0) {
                        this.f8515e.v1().f25987k0.setVisibility(8);
                        this.f8515e.v1().f25989l0.setVisibility(8);
                        this.f8515e.v1().f25971c0.setAdapter((RecyclerView.h) null);
                        VirtualDocScreen virtualDocScreen = this.f8515e;
                        List<ReceivedDoc> receivedDocs = getSharedRecivedDoc.getReceivedDocs();
                        cm.l.d(receivedDocs, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.ReceivedDoc>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.ReceivedDoc> }");
                        VirtualDocScreen virtualDocScreen2 = this.f8515e;
                        virtualDocScreen.k2(new wc.u((ArrayList) receivedDocs, virtualDocScreen2, virtualDocScreen2));
                        this.f8515e.v1().f25971c0.setAdapter(this.f8515e.G1());
                        return;
                    }
                    this.f8515e.v1().f25987k0.setVisibility(0);
                    this.f8515e.v1().f25987k0.setVisibility(0);
                    this.f8515e.v1().f25989l0.setVisibility(0);
                    this.f8515e.v1().f25971c0.setAdapter((RecyclerView.h) null);
                    TextView textView2 = this.f8515e.v1().f25989l0;
                    ld.c I1 = this.f8515e.I1();
                    f.a aVar = v9.f.f17510a;
                    textView2.setText(I1.b(aVar.S(), "No Received RC Found"));
                    textView = this.f8515e.v1().f25991m0;
                    b10 = this.f8515e.I1().b(aVar.T(), "There is no Received RC \nfound for your account");
                } else if (p.o(getSharedRecivedDoc.getStatusCode(), "VTLD007", true)) {
                    this.f8515e.v1().f25971c0.setAdapter((RecyclerView.h) null);
                    this.f8515e.v1().f25987k0.setVisibility(0);
                    this.f8515e.v1().f25989l0.setVisibility(0);
                    this.f8515e.v1().f25971c0.setAdapter((RecyclerView.h) null);
                    TextView textView3 = this.f8515e.v1().f25989l0;
                    ld.c I12 = this.f8515e.I1();
                    f.a aVar2 = v9.f.f17510a;
                    textView3.setText(I12.b(aVar2.S(), "No Received RC Found"));
                    textView = this.f8515e.v1().f25991m0;
                    b10 = this.f8515e.I1().b(aVar2.T(), "There is no Received RC \nfound for your account");
                } else if (p.o(getSharedRecivedDoc.getStatusCode(), "VTLD090", true)) {
                    this.f8515e.E1().dismiss();
                    v9.d.f17494a.D(this.f8515e, getSharedRecivedDoc.getStatusDesc(), 1);
                    return;
                } else if (p.o(getSharedRecivedDoc.getStatusCode(), "VTLD091", true)) {
                    this.f8515e.E1().dismiss();
                    v9.d.f17494a.D(this.f8515e, getSharedRecivedDoc.getStatusDesc(), 2);
                    return;
                } else if (p.o(getSharedRecivedDoc.getStatusCode(), "VTLD099", true)) {
                    this.f8515e.v1().f25989l0.setVisibility(0);
                    this.f8515e.v1().f25987k0.setVisibility(0);
                    this.f8515e.v1().f25971c0.setAdapter((RecyclerView.h) null);
                    TextView textView4 = this.f8515e.v1().f25989l0;
                    ld.c I13 = this.f8515e.I1();
                    f.a aVar3 = v9.f.f17510a;
                    textView4.setText(I13.b(aVar3.S(), "No Received RC Found"));
                    textView = this.f8515e.v1().f25991m0;
                    b10 = this.f8515e.I1().b(aVar3.T(), "There is no Received RC \nfound for your account");
                } else {
                    this.f8515e.v1().f25989l0.setVisibility(0);
                    this.f8515e.v1().f25987k0.setVisibility(0);
                    this.f8515e.v1().f25971c0.setAdapter((RecyclerView.h) null);
                    TextView textView5 = this.f8515e.v1().f25989l0;
                    ld.c I14 = this.f8515e.I1();
                    f.a aVar4 = v9.f.f17510a;
                    textView5.setText(I14.b(aVar4.S(), "No Received RC Found"));
                    textView = this.f8515e.v1().f25991m0;
                    b10 = this.f8515e.I1().b(aVar4.T(), "There is no Received RC \nfound for your account");
                }
                textView.setText(b10);
            } catch (Exception e10) {
                this.f8515e.E1().dismiss();
                Log.e("error-1-", getSharedRecivedDoc.toString());
                e10.printStackTrace();
                this.f8515e.v1().f25987k0.setVisibility(0);
                this.f8515e.v1().f25989l0.setVisibility(0);
                TextView textView6 = this.f8515e.v1().f25989l0;
                ld.c I15 = this.f8515e.I1();
                f.a aVar5 = v9.f.f17510a;
                textView6.setText(I15.b(aVar5.S(), "No Received RC Found"));
                this.f8515e.v1().f25991m0.setText(this.f8515e.I1().b(aVar5.T(), "There is no Received RC \nfound for your account"));
                this.f8515e.v1().f25989l0.setVisibility(0);
                this.f8515e.v1().f25971c0.setAdapter((RecyclerView.h) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetSharedRecivedDoc) obj);
            return pl.x.f30437a;
        }
    }

    public static final class u implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f8516e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z f8517f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ cm.u f8518g;

        u(Context context, z zVar, cm.u uVar) {
            this.f8516e = context;
            this.f8517f = zVar;
            this.f8518g = uVar;
        }

        public void onClick(View view) {
            cm.l.f(view, "view");
            DatePickerDialog datePickerDialog = new DatePickerDialog(this.f8516e, this.f8517f, ((Calendar) this.f8518g.f20234e).get(1), ((Calendar) this.f8518g.f20234e).get(2), ((Calendar) this.f8518g.f20234e).get(5));
            datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
            datePickerDialog.show();
        }
    }

    public static final class v implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8519e;

        v(EditText editText) {
            this.f8519e = editText;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (charSequence.length() >= 2) {
                this.f8519e.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class w implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8520e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ EditText f8521f;

        w(EditText editText, EditText editText2) {
            this.f8520e = editText;
            this.f8521f = editText2;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f8520e.requestFocus();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (i10 == 1 && i11 == 0) {
                this.f8521f.requestFocus();
            }
            String obj = charSequence.toString();
            int length = obj.length() - 1;
            int i13 = 0;
            boolean z10 = false;
            while (i13 <= length) {
                boolean z11 = cm.l.h(obj.charAt(!z10 ? i13 : length), 32) <= 0;
                if (!z10) {
                    if (!z11) {
                        z10 = true;
                    } else {
                        i13++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            if (obj.subSequence(i13, length + 1).toString().length() == 2) {
                String obj2 = charSequence.toString();
                int length2 = obj2.length() - 1;
                int i14 = 0;
                boolean z12 = false;
                while (i14 <= length2) {
                    boolean z13 = cm.l.h(obj2.charAt(!z12 ? i14 : length2), 32) <= 0;
                    if (!z12) {
                        if (!z13) {
                            z12 = true;
                        } else {
                            i14++;
                        }
                    } else if (!z13) {
                        break;
                    } else {
                        length2--;
                    }
                }
                int parseInt = Integer.parseInt(obj2.subSequence(i14, length2 + 1).toString());
                if (parseInt == 0 || parseInt > 31) {
                    this.f8520e.setText("");
                }
            }
        }
    }

    public static final class x implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8522e;

        x(EditText editText) {
            this.f8522e = editText;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (charSequence.length() >= 2) {
                this.f8522e.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class y implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8523e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ EditText f8524f;

        y(EditText editText, EditText editText2) {
            this.f8523e = editText;
            this.f8524f = editText2;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f8523e.requestFocus();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (i10 == 1 && i11 == 0) {
                this.f8524f.requestFocus();
            }
            String obj = charSequence.toString();
            int length = obj.length() - 1;
            int i13 = 0;
            boolean z10 = false;
            while (i13 <= length) {
                boolean z11 = cm.l.h(obj.charAt(!z10 ? i13 : length), 32) <= 0;
                if (!z10) {
                    if (!z11) {
                        z10 = true;
                    } else {
                        i13++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            if (obj.subSequence(i13, length + 1).toString().length() == 2) {
                String obj2 = charSequence.toString();
                int length2 = obj2.length() - 1;
                int i14 = 0;
                boolean z12 = false;
                while (i14 <= length2) {
                    boolean z13 = cm.l.h(obj2.charAt(!z12 ? i14 : length2), 32) <= 0;
                    if (!z12) {
                        if (!z13) {
                            z12 = true;
                        } else {
                            i14++;
                        }
                    } else if (!z13) {
                        break;
                    } else {
                        length2--;
                    }
                }
                int parseInt = Integer.parseInt(obj2.subSequence(i14, length2 + 1).toString());
                if (parseInt == 0 || parseInt > 12) {
                    this.f8523e.setText("");
                }
            }
        }
    }

    public static final class z implements DatePickerDialog.OnDateSetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cm.u f8525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f8526b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EditText f8527c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ EditText f8528d;

        z(cm.u uVar, EditText editText, EditText editText2, EditText editText3) {
            this.f8525a = uVar;
            this.f8526b = editText;
            this.f8527c = editText2;
            this.f8528d = editText3;
        }

        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            cm.l.f(datePicker, "view");
            ((Calendar) this.f8525a.f20234e).set(1, i10);
            ((Calendar) this.f8525a.f20234e).set(2, i11);
            ((Calendar) this.f8525a.f20234e).set(5, i12);
            CharSequence format = DateFormat.format("dd", ((Calendar) this.f8525a.f20234e).getTime());
            cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
            String str = (String) format;
            CharSequence format2 = DateFormat.format("MM", ((Calendar) this.f8525a.f20234e).getTime());
            cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) format2;
            CharSequence format3 = DateFormat.format("yyyy", ((Calendar) this.f8525a.f20234e).getTime());
            cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) format3;
            try {
                this.f8526b.setText(str);
                this.f8527c.setText(str2);
                this.f8528d.setText(str3);
                this.f8526b.clearFocus();
                this.f8527c.clearFocus();
                this.f8528d.clearFocus();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void L1(VirtualDocScreen virtualDocScreen, View view) {
        cm.l.f(virtualDocScreen, "this$0");
        virtualDocScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void M1(VirtualDocScreen virtualDocScreen, View view) {
        cm.l.f(virtualDocScreen, "this$0");
        PopupMenu popupMenu = new PopupMenu(virtualDocScreen, virtualDocScreen.v1().V);
        popupMenu.inflate(R.menu.dl_menu);
        MenuItem findItem = popupMenu.getMenu().findItem(R.id.menu1);
        cm.l.e(findItem, "findItem(...)");
        MenuItem findItem2 = popupMenu.getMenu().findItem(R.id.menu2);
        cm.l.e(findItem2, "findItem(...)");
        MenuItem findItem3 = popupMenu.getMenu().findItem(R.id.menu3);
        cm.l.e(findItem3, "findItem(...)");
        findItem.setTitle(virtualDocScreen.I1().b("label_view", "View"));
        findItem2.setTitle(virtualDocScreen.I1().b(v9.f.f17510a.j0(), "Refresh"));
        findItem3.setTitle(virtualDocScreen.I1().b("delete", "Delete"));
        popupMenu.setGravity(5);
        popupMenu.setOnMenuItemClickListener(new i0(virtualDocScreen));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean N1(com.nic.mparivahan.Dashboard.ui.VirtualDocScreen r6, android.view.MenuItem r7) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r6, r0)
            int r7 = r7.getItemId()
            r0 = 2132018237(0x7f14043d, float:1.9674775E38)
            java.lang.String r1 = "label_log_check_internet"
            java.lang.String r2 = ""
            java.lang.String r3 = "\\s"
            java.lang.String r4 = "0"
            r5 = 0
            switch(r7) {
                case 2131363612: goto L_0x016b;
                case 2131363613: goto L_0x00b6;
                case 2131363614: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0175
        L_0x001a:
            com.nic.mparivahan.a$a r7 = com.nic.mparivahan.a.f9624a
            boolean r7 = r7.a(r6)
            if (r7 == 0) goto L_0x00a1
            ni.de r7 = r6.v1()
            android.widget.TextView r7 = r7.f26007v
            java.lang.CharSequence r7 = r7.getText()
            java.lang.String r7 = r7.toString()
            if (r7 == 0) goto L_0x0175
            int r7 = r7.length()
            if (r7 != 0) goto L_0x003a
            goto L_0x0175
        L_0x003a:
            android.app.ProgressDialog r7 = r6.E1()     // Catch:{ Exception -> 0x007d }
            r7.show()     // Catch:{ Exception -> 0x007d }
            ni.de r7 = r6.v1()     // Catch:{ Exception -> 0x007d }
            android.widget.TextView r7 = r7.f26007v     // Catch:{ Exception -> 0x007d }
            java.lang.CharSequence r7 = r7.getText()     // Catch:{ Exception -> 0x007d }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x007d }
            com.nic.mparivahan.DB.DatabaseHelper r0 = r6.w1()     // Catch:{ Exception -> 0x007d }
            java.lang.String r7 = r0.j0(r7)     // Catch:{ Exception -> 0x007d }
            boolean r0 = r7.equals(r4)     // Catch:{ Exception -> 0x007d }
            if (r0 == 0) goto L_0x007f
            com.nic.mparivahan.DB.DatabaseHelper r7 = r6.w1()     // Catch:{ Exception -> 0x007d }
            ni.de r0 = r6.v1()     // Catch:{ Exception -> 0x007d }
            android.widget.TextView r0 = r0.f26007v     // Catch:{ Exception -> 0x007d }
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ Exception -> 0x007d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x007d }
            km.f r1 = new km.f     // Catch:{ Exception -> 0x007d }
            r1.<init>((java.lang.String) r3)     // Catch:{ Exception -> 0x007d }
            java.lang.String r0 = r1.b(r0, r2)     // Catch:{ Exception -> 0x007d }
            java.lang.String r7 = r7.j0(r0)     // Catch:{ Exception -> 0x007d }
            goto L_0x007f
        L_0x007d:
            r7 = move-exception
            goto L_0x0095
        L_0x007f:
            if (r7 == 0) goto L_0x0175
            int r0 = r7.length()     // Catch:{ Exception -> 0x007d }
            if (r0 != 0) goto L_0x0089
            goto L_0x0175
        L_0x0089:
            cd.c r0 = r6.B1()     // Catch:{ Exception -> 0x007d }
            cm.l.c(r7)     // Catch:{ Exception -> 0x007d }
            r0.g(r7, r6)     // Catch:{ Exception -> 0x007d }
            goto L_0x0175
        L_0x0095:
            android.app.ProgressDialog r6 = r6.E1()
            r6.dismiss()
        L_0x009c:
            r7.printStackTrace()
            goto L_0x0175
        L_0x00a1:
            ld.c r7 = r6.I1()
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r7 = r7.b(r1, r0)
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r5)
            r6.show()
            goto L_0x0175
        L_0x00b6:
            com.nic.mparivahan.a$a r7 = com.nic.mparivahan.a.f9624a     // Catch:{ Exception -> 0x0121 }
            boolean r7 = r7.a(r6)     // Catch:{ Exception -> 0x0121 }
            if (r7 == 0) goto L_0x014a
            ni.de r7 = r6.v1()     // Catch:{ Exception -> 0x0121 }
            android.widget.ProgressBar r7 = r7.W     // Catch:{ Exception -> 0x0121 }
            r7.setVisibility(r5)     // Catch:{ Exception -> 0x0121 }
            com.nic.mparivahan.DB.DatabaseHelper r7 = r6.w1()     // Catch:{ Exception -> 0x0121 }
            java.util.ArrayList r7 = r7.c0()     // Catch:{ Exception -> 0x0121 }
            java.lang.Object r7 = r7.get(r5)     // Catch:{ Exception -> 0x0121 }
            com.nic.mparivahan.Dl.Model.DLDocument r7 = (com.nic.mparivahan.Dl.Model.DLDocument) r7     // Catch:{ Exception -> 0x0121 }
            com.nic.mparivahan.Dl.Model.DldetobjX r7 = r7.getDldetails()     // Catch:{ Exception -> 0x0121 }
            cm.l.c(r7)     // Catch:{ Exception -> 0x0121 }
            r6.d2(r7)     // Catch:{ Exception -> 0x0121 }
            com.nic.mparivahan.Dl.Model.DldetobjX r7 = r6.x1()     // Catch:{ Exception -> 0x0121 }
            com.nic.mparivahan.Dl.Model.DlobjX r7 = r7.getDlobj()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r7 = r7.getDlLicno()     // Catch:{ Exception -> 0x0121 }
            java.lang.CharSequence r7 = km.q.B0(r7)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0121 }
            com.nic.mparivahan.DB.DatabaseHelper r0 = r6.w1()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r7 = r0.j0(r7)     // Catch:{ Exception -> 0x0121 }
            boolean r0 = r7.equals(r4)     // Catch:{ Exception -> 0x0121 }
            if (r0 == 0) goto L_0x0123
            com.nic.mparivahan.DB.DatabaseHelper r7 = r6.w1()     // Catch:{ Exception -> 0x0121 }
            ni.de r0 = r6.v1()     // Catch:{ Exception -> 0x0121 }
            android.widget.TextView r0 = r0.f26007v     // Catch:{ Exception -> 0x0121 }
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0121 }
            km.f r1 = new km.f     // Catch:{ Exception -> 0x0121 }
            r1.<init>((java.lang.String) r3)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r0 = r1.b(r0, r2)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r7 = r7.j0(r0)     // Catch:{ Exception -> 0x0121 }
            goto L_0x0123
        L_0x0121:
            r7 = move-exception
            goto L_0x015e
        L_0x0123:
            za.a r0 = r6.z1()     // Catch:{ Exception -> 0x0121 }
            cm.l.c(r7)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r1 = "DL"
            z9.a$a r2 = z9.a.f18947a     // Catch:{ Exception -> 0x0121 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r6.x1()     // Catch:{ Exception -> 0x0121 }
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r3.getBioObj()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r3 = r3.getBioDob()     // Catch:{ Exception -> 0x0121 }
            java.lang.CharSequence r3 = km.q.B0(r3)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r2 = r2.a(r3)     // Catch:{ Exception -> 0x0121 }
            r0.E(r7, r1, r2, r6)     // Catch:{ Exception -> 0x0121 }
            goto L_0x0175
        L_0x014a:
            ld.c r7 = r6.I1()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r7 = r7.b(r1, r0)     // Catch:{ Exception -> 0x0121 }
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r7, r5)     // Catch:{ Exception -> 0x0121 }
            r7.show()     // Catch:{ Exception -> 0x0121 }
            goto L_0x0175
        L_0x015e:
            ni.de r6 = r6.v1()
            android.widget.ProgressBar r6 = r6.W
            r0 = 8
            r6.setVisibility(r0)
            goto L_0x009c
        L_0x016b:
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.Dl.DLVirtualRcScreen> r0 = com.nic.mparivahan.Dl.DLVirtualRcScreen.class
            r7.<init>(r6, r0)
            r6.startActivity(r7)
        L_0x0175:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dashboard.ui.VirtualDocScreen.N1(com.nic.mparivahan.Dashboard.ui.VirtualDocScreen, android.view.MenuItem):boolean");
    }

    /* access modifiers changed from: private */
    public static final void O1(VirtualDocScreen virtualDocScreen, View view) {
        cm.l.f(virtualDocScreen, "this$0");
        virtualDocScreen.v1().f25980h.setBackgroundColor(androidx.core.content.a.c(virtualDocScreen, R.color.gery_doc_color));
        virtualDocScreen.v1().f25982i.setBackgroundResource(R.drawable.round_title_shape_doc);
        virtualDocScreen.v1().f25982i.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.white));
        virtualDocScreen.v1().f25980h.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.black));
        virtualDocScreen.v1().Y.setVisibility(8);
        virtualDocScreen.v1().f26006u.setVisibility(0);
        try {
            virtualDocScreen.c2();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void P1(VirtualDocScreen virtualDocScreen, View view) {
        cm.l.f(virtualDocScreen, "this$0");
        virtualDocScreen.v1().f25980h.setBackgroundResource(R.drawable.round_title_shape_doc);
        virtualDocScreen.v1().f25982i.setBackgroundColor(androidx.core.content.a.c(virtualDocScreen, R.color.gery_doc_color));
        virtualDocScreen.v1().f25980h.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.white));
        virtualDocScreen.v1().f25982i.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.black));
        virtualDocScreen.v1().Y.setVisibility(0);
        virtualDocScreen.v1().f26006u.setVisibility(8);
        virtualDocScreen.v1().f25987k0.setVisibility(8);
        try {
            virtualDocScreen.v1().f25975e0.setBackgroundResource(R.drawable.shared_recieved_rc_background);
            virtualDocScreen.v1().Z.setBackgroundResource(R.drawable.shared_recieved_rc_background);
            virtualDocScreen.v1().L.setBackgroundResource(R.drawable.shared_received_rc_background_ontap);
            virtualDocScreen.v1().N.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.white));
            virtualDocScreen.v1().f25981h0.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.black));
            virtualDocScreen.v1().f25969b0.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.black));
            virtualDocScreen.v1().f25967a0.setImageResource(R.drawable.received_rc_ontap);
            virtualDocScreen.v1().f25979g0.setImageResource(R.drawable.shared_rc_ontap);
            virtualDocScreen.v1().M.setImageResource(R.drawable.my_rc_ontap);
            ArrayList E0 = virtualDocScreen.w1().E0();
            cm.l.d(E0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.Document> }");
            if (E0.size() > 0) {
                virtualDocScreen.v1().f25989l0.setVisibility(8);
                virtualDocScreen.v1().f25971c0.setAdapter((RecyclerView.h) null);
                virtualDocScreen.i2(new l0(E0, virtualDocScreen, virtualDocScreen));
                virtualDocScreen.v1().f25971c0.setAdapter(virtualDocScreen.C1());
                return;
            }
            virtualDocScreen.v1().f25971c0.setAdapter((RecyclerView.h) null);
            virtualDocScreen.v1().f25989l0.setVisibility(0);
            TextView textView = virtualDocScreen.v1().f25989l0;
            ld.c I1 = virtualDocScreen.I1();
            f.a aVar = v9.f.f17510a;
            textView.setText(I1.b(aVar.Q(), "No Virtual RC Found"));
            virtualDocScreen.v1().f25987k0.setVisibility(0);
            virtualDocScreen.v1().f25991m0.setText(virtualDocScreen.I1().b(aVar.Z(), "There is no Virtual RC \nfound for your account"));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void Q1(VirtualDocScreen virtualDocScreen, View view) {
        cm.l.f(virtualDocScreen, "this$0");
        try {
            virtualDocScreen.v1().f25975e0.setBackgroundResource(R.drawable.shared_recieved_rc_background);
            virtualDocScreen.v1().Z.setBackgroundResource(R.drawable.shared_recieved_rc_background);
            virtualDocScreen.v1().L.setBackgroundResource(R.drawable.shared_received_rc_background_ontap);
            virtualDocScreen.v1().N.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.white));
            virtualDocScreen.v1().f25981h0.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.black));
            virtualDocScreen.v1().f25969b0.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.black));
            virtualDocScreen.v1().f25967a0.setImageResource(R.drawable.received_rc_ontap);
            virtualDocScreen.v1().f25979g0.setImageResource(R.drawable.shared_rc_ontap);
            virtualDocScreen.v1().M.setImageResource(R.drawable.my_rc_ontap);
            ArrayList E0 = virtualDocScreen.w1().E0();
            cm.l.d(E0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.Document> }");
            virtualDocScreen.Z1(E0);
            if (virtualDocScreen.u1().size() > 0) {
                virtualDocScreen.v1().f25989l0.setVisibility(8);
                virtualDocScreen.v1().f25987k0.setVisibility(8);
                virtualDocScreen.v1().f25971c0.setAdapter((RecyclerView.h) null);
                virtualDocScreen.i2(new l0(virtualDocScreen.u1(), virtualDocScreen, virtualDocScreen));
                virtualDocScreen.v1().f25971c0.setAdapter(virtualDocScreen.C1());
                return;
            }
            virtualDocScreen.v1().f25971c0.setAdapter((RecyclerView.h) null);
            virtualDocScreen.v1().f25989l0.setVisibility(0);
            TextView textView = virtualDocScreen.v1().f25989l0;
            ld.c I1 = virtualDocScreen.I1();
            f.a aVar = v9.f.f17510a;
            textView.setText(I1.b(aVar.Q(), "No Virtual RC Found"));
            virtualDocScreen.v1().f25987k0.setVisibility(0);
            virtualDocScreen.v1().f25991m0.setText(virtualDocScreen.I1().b(aVar.Z(), "There is no Virtual RC \nfound for your account"));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void R1(VirtualDocScreen virtualDocScreen, View view) {
        cm.l.f(virtualDocScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(virtualDocScreen)) {
            virtualDocScreen.v1().f25975e0.setBackgroundResource(R.drawable.shared_received_rc_background_ontap);
            virtualDocScreen.v1().Z.setBackgroundResource(R.drawable.shared_recieved_rc_background);
            virtualDocScreen.v1().L.setBackgroundResource(R.drawable.shared_recieved_rc_background);
            virtualDocScreen.v1().N.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.black));
            virtualDocScreen.v1().f25981h0.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.white));
            virtualDocScreen.v1().f25969b0.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.black));
            virtualDocScreen.v1().f25967a0.setImageResource(R.drawable.received_rc_ontap);
            virtualDocScreen.v1().f25979g0.setImageResource(R.drawable.shared_rc_org);
            virtualDocScreen.v1().M.setImageResource(R.drawable.my_rc_org);
            virtualDocScreen.E1().show();
            virtualDocScreen.B1().Q(virtualDocScreen.J1().k(), virtualDocScreen);
            return;
        }
        Toast.makeText(virtualDocScreen, virtualDocScreen.I1().b("label_log_check_internet", virtualDocScreen.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void S1(VirtualDocScreen virtualDocScreen, View view) {
        cm.l.f(virtualDocScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(virtualDocScreen)) {
            virtualDocScreen.v1().f25975e0.setBackgroundResource(R.drawable.shared_recieved_rc_background);
            virtualDocScreen.v1().Z.setBackgroundResource(R.drawable.shared_received_rc_background_ontap);
            virtualDocScreen.v1().L.setBackgroundResource(R.drawable.shared_recieved_rc_background);
            virtualDocScreen.v1().f25967a0.setImageResource(R.drawable.received_rc_org);
            virtualDocScreen.v1().f25979g0.setImageResource(R.drawable.shared_rc_ontap);
            virtualDocScreen.v1().M.setImageResource(R.drawable.my_rc_org);
            virtualDocScreen.v1().N.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.black));
            virtualDocScreen.v1().f25981h0.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.black));
            virtualDocScreen.v1().f25969b0.setTextColor(androidx.core.content.a.c(virtualDocScreen, R.color.white));
            virtualDocScreen.E1().show();
            virtualDocScreen.B1().P(virtualDocScreen.J1().k(), virtualDocScreen);
            return;
        }
        Toast.makeText(virtualDocScreen, virtualDocScreen.I1().b("label_log_check_internet", virtualDocScreen.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void T1(VirtualDocScreen virtualDocScreen, View view) {
        cm.l.f(virtualDocScreen, "this$0");
        try {
            virtualDocScreen.v1().f26011z.setVisibility(8);
            virtualDocScreen.U1(virtualDocScreen, q.B0(virtualDocScreen.v1().f26007v.getText().toString()).toString());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final boolean V1(TextView textView, int i10, KeyEvent keyEvent) {
        return i10 == 3 || i10 == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66);
    }

    /* access modifiers changed from: private */
    public static final boolean W1(EditText editText, EditText editText2, View view, int i10, KeyEvent keyEvent) {
        cm.l.f(editText, "$dobMonth");
        cm.l.f(editText2, "$dobDate");
        if (i10 != 67 || editText.getText().length() != 0) {
            return false;
        }
        editText2.requestFocus();
        return false;
    }

    /* access modifiers changed from: private */
    public static final void X1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void Y1(EditText editText, EditText editText2, EditText editText3, Dialog dialog, VirtualDocScreen virtualDocScreen, String str, View view) {
        cm.l.f(editText, "$dobYear");
        cm.l.f(editText2, "$dobMonth");
        cm.l.f(editText3, "$dobDate");
        cm.l.f(dialog, "$d");
        cm.l.f(virtualDocScreen, "this$0");
        cm.l.f(str, "$dl_number");
        String obj = editText.getText().toString();
        int length = obj.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = cm.l.h(obj.charAt(!z10 ? i10 : length), 32) <= 0;
            if (!z10) {
                if (!z11) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!z11) {
                break;
            } else {
                length--;
            }
        }
        if (obj.subSequence(i10, length + 1).toString().length() > 0) {
            String obj2 = editText2.getText().toString();
            int length2 = obj2.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length2) {
                boolean z13 = cm.l.h(obj2.charAt(!z12 ? i11 : length2), 32) <= 0;
                if (!z12) {
                    if (!z13) {
                        z12 = true;
                    } else {
                        i11++;
                    }
                } else if (!z13) {
                    break;
                } else {
                    length2--;
                }
            }
            if (obj2.subSequence(i11, length2 + 1).toString().length() > 0) {
                String obj3 = editText3.getText().toString();
                int length3 = obj3.length() - 1;
                int i12 = 0;
                boolean z14 = false;
                while (i12 <= length3) {
                    boolean z15 = cm.l.h(obj3.charAt(!z14 ? i12 : length3), 32) <= 0;
                    if (!z14) {
                        if (!z15) {
                            z14 = true;
                        } else {
                            i12++;
                        }
                    } else if (!z15) {
                        break;
                    } else {
                        length3--;
                    }
                }
                if (obj3.subSequence(i12, length3 + 1).toString().length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    String obj4 = editText.getText().toString();
                    int length4 = obj4.length() - 1;
                    int i13 = 0;
                    boolean z16 = false;
                    while (i13 <= length4) {
                        boolean z17 = cm.l.h(obj4.charAt(!z16 ? i13 : length4), 32) <= 0;
                        if (!z16) {
                            if (!z17) {
                                z16 = true;
                            } else {
                                i13++;
                            }
                        } else if (!z17) {
                            break;
                        } else {
                            length4--;
                        }
                    }
                    sb2.append(obj4.subSequence(i13, length4 + 1).toString());
                    sb2.append('-');
                    String obj5 = editText2.getText().toString();
                    int length5 = obj5.length() - 1;
                    int i14 = 0;
                    boolean z18 = false;
                    while (i14 <= length5) {
                        boolean z19 = cm.l.h(obj5.charAt(!z18 ? i14 : length5), 32) <= 0;
                        if (!z18) {
                            if (!z19) {
                                z18 = true;
                            } else {
                                i14++;
                            }
                        } else if (!z19) {
                            break;
                        } else {
                            length5--;
                        }
                    }
                    sb2.append(obj5.subSequence(i14, length5 + 1).toString());
                    sb2.append('-');
                    String obj6 = editText3.getText().toString();
                    int length6 = obj6.length() - 1;
                    int i15 = 0;
                    boolean z20 = false;
                    while (i15 <= length6) {
                        boolean z21 = cm.l.h(obj6.charAt(!z20 ? i15 : length6), 32) <= 0;
                        if (!z20) {
                            if (!z21) {
                                z20 = true;
                            } else {
                                i15++;
                            }
                        } else if (!z21) {
                            break;
                        } else {
                            length6--;
                        }
                    }
                    sb2.append(obj6.subSequence(i15, length6 + 1).toString());
                    String sb3 = sb2.toString();
                    dialog.dismiss();
                    virtualDocScreen.v1().f26011z.setVisibility(8);
                    virtualDocScreen.v1().W.setVisibility(0);
                    virtualDocScreen.z1().i(str, sb3, virtualDocScreen);
                    return;
                }
            }
        }
        Toast.makeText(virtualDocScreen, virtualDocScreen.I1().b(v9.f.f17510a.d0(), "Please enter the valid dob"), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void q2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final RcService A1() {
        RcService rcService = this.H;
        if (rcService != null) {
            return rcService;
        }
        cm.l.v("mRcService");
        return null;
    }

    public final cd.c B1() {
        cd.c cVar = this.G;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mRcViewModel");
        return null;
    }

    public final l0 C1() {
        l0 l0Var = this.S;
        if (l0Var != null) {
            return l0Var;
        }
        cm.l.v("myRcAdapter");
        return null;
    }

    public final int D1() {
        return this.R;
    }

    public final ProgressDialog E1() {
        ProgressDialog progressDialog = this.N;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final int F1() {
        return this.Q;
    }

    public final wc.u G1() {
        wc.u uVar = this.P;
        if (uVar != null) {
            return uVar;
        }
        cm.l.v("received_adapter");
        return null;
    }

    public final String H1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("selectedRcNumber");
        return null;
    }

    public final ld.c I1() {
        ld.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final ld.g J1() {
        ld.g gVar = this.M;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final b0 K1() {
        b0 b0Var = this.O;
        if (b0Var != null) {
            return b0Var;
        }
        cm.l.v("shared_adapter");
        return null;
    }

    public void N(String str, int i10) {
        this.Q = i10;
        E1().show();
        B1().k(String.valueOf(str), J1().k(), this);
    }

    public void P(String str, int i10) {
        try {
            if (!com.nic.mparivahan.a.f9624a.a(this)) {
                Toast.makeText(this, I1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
            } else if (w1().s0(str) != null) {
                E1().show();
                cm.l.c(str);
                this.W = str;
                String s02 = w1().s0(str);
                cd.c B1 = B1();
                cm.l.c(s02);
                B1.a0(s02, "RC", this);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void U1(Context context, String str) {
        cm.l.f(str, "dl_number");
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.mvvm_dl_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        cm.l.c(window2);
        window2.setLayout(-1, -2);
        View findViewById = dialog.findViewById(R.id.verify_card);
        cm.l.d(findViewById, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View findViewById2 = dialog.findViewById(R.id.cancel);
        cm.l.d(findViewById2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View findViewById3 = dialog.findViewById(R.id.applicant_year);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.applicant_month);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText2 = (EditText) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.applicant_date);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText3 = (EditText) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.dob_cal);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.ImageView");
        cm.u uVar = new cm.u();
        uVar.f20234e = Calendar.getInstance();
        ((ImageView) findViewById6).setOnClickListener(new u(context, new z(uVar, editText3, editText2, editText), uVar));
        editText3.setOnEditorActionListener(new q0());
        editText3.addTextChangedListener(new v(editText2));
        editText3.addTextChangedListener(new w(editText3, editText2));
        editText2.addTextChangedListener(new x(editText));
        editText2.setOnKeyListener(new r0(editText2, editText3));
        editText2.addTextChangedListener(new y(editText2, editText));
        ((CardView) findViewById2).setOnClickListener(new f0(dialog));
        ((CardView) findViewById).setOnClickListener(new g0(editText, editText2, editText3, dialog, this, str));
        dialog.show();
    }

    public void Y(String str, int i10) {
        this.Q = i10;
        E1().show();
        B1().j(String.valueOf(str), J1().k(), this);
    }

    public final void Z1(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.L = arrayList;
    }

    public final void a2(de deVar) {
        cm.l.f(deVar, "<set-?>");
        this.U = deVar;
    }

    public final void b2(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.K = databaseHelper;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0085, code lost:
        r3 = r4.getBioObj();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0276, code lost:
        if (r6 != null) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0278, code lost:
        r6 = r6.getBioTempAdd3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02df, code lost:
        if (r6 != null) goto L_0x0278;
     */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0408  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c2() {
        /*
            r9 = this;
            com.nic.mparivahan.DB.DatabaseHelper r0 = r9.w1()
            java.util.ArrayList r0 = r0.i0()
            java.lang.String r1 = "details"
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L_0x04bd
            ni.de r0 = r9.v1()
            android.widget.LinearLayout r0 = r0.f25987k0
            r0.setVisibility(r2)
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f25989l0
            r0.setVisibility(r2)
            ni.de r0 = r9.v1()
            android.widget.LinearLayout r0 = r0.f25990m
            r0.setVisibility(r2)
            com.nic.mparivahan.DB.DatabaseHelper r0 = r9.w1()
            java.util.ArrayList r0 = r0.i0()
            java.lang.Object r4 = r0.get(r3)
            com.nic.mparivahan.Dl.Model.DLDocument r4 = (com.nic.mparivahan.Dl.Model.DLDocument) r4
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r4.getDldetails()
            java.lang.Object r5 = r0.get(r3)
            com.nic.mparivahan.Dl.Model.DLDocument r5 = (com.nic.mparivahan.Dl.Model.DLDocument) r5
            java.lang.String r5 = r5.getDocnumber()
            if (r5 == 0) goto L_0x0515
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0050
            goto L_0x0515
        L_0x0050:
            ni.de r5 = r9.v1()
            android.widget.TextView r5 = r5.f26007v
            java.lang.Object r6 = r0.get(r3)
            com.nic.mparivahan.Dl.Model.DLDocument r6 = (com.nic.mparivahan.Dl.Model.DLDocument) r6
            java.lang.String r6 = r6.getDocnumber()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.setText(r6)
            java.lang.Object r5 = r0.get(r3)
            com.nic.mparivahan.Dl.Model.DLDocument r5 = (com.nic.mparivahan.Dl.Model.DLDocument) r5
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = r5.getDldetails()
            if (r5 == 0) goto L_0x0442
            ni.de r0 = r9.v1()
            android.widget.LinearLayout r0 = r0.V
            r0.setVisibility(r3)
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f25998q
            r2 = 0
            if (r4 == 0) goto L_0x0090
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x0090
            java.lang.String r3 = r3.getBioFullName()
            goto L_0x0091
        L_0x0090:
            r3 = r2
        L_0x0091:
            r0.setText(r3)
            ka.c$a r0 = ka.c.f13158a
            if (r4 == 0) goto L_0x00a3
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x00a3
            java.lang.String r3 = r3.getBioTempAdd1()
            goto L_0x00a4
        L_0x00a3:
            r3 = r2
        L_0x00a4:
            boolean r3 = r0.m(r3)
            r5 = 32
            if (r3 == 0) goto L_0x01fd
            if (r4 == 0) goto L_0x00b9
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x00b9
            java.lang.String r3 = r3.getBioTempAdd2()
            goto L_0x00ba
        L_0x00b9:
            r3 = r2
        L_0x00ba:
            boolean r3 = r0.m(r3)
            if (r3 == 0) goto L_0x01fd
            if (r4 == 0) goto L_0x00cd
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x00cd
            java.lang.String r3 = r3.getBioTempAdd3()
            goto L_0x00ce
        L_0x00cd:
            r3 = r2
        L_0x00ce:
            boolean r3 = r0.m(r3)
            if (r3 == 0) goto L_0x01fd
            if (r4 == 0) goto L_0x00e1
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x00e1
            java.lang.String r3 = r3.getBioPermAdd1()
            goto L_0x00e2
        L_0x00e1:
            r3 = r2
        L_0x00e2:
            boolean r3 = r0.m(r3)
            if (r3 != 0) goto L_0x0135
            if (r4 == 0) goto L_0x00f5
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x00f5
            java.lang.String r3 = r3.getBioPermAdd2()
            goto L_0x00f6
        L_0x00f5:
            r3 = r2
        L_0x00f6:
            boolean r3 = r0.m(r3)
            if (r3 != 0) goto L_0x0135
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f25994o
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            if (r4 == 0) goto L_0x0114
            com.nic.mparivahan.Dl.Model.BioObjX r6 = r4.getBioObj()
            if (r6 == 0) goto L_0x0114
            java.lang.String r6 = r6.getBioPermAdd1()
            goto L_0x0115
        L_0x0114:
            r6 = r2
        L_0x0115:
            r3.append(r6)
            r3.append(r5)
            if (r4 == 0) goto L_0x0128
            com.nic.mparivahan.Dl.Model.BioObjX r6 = r4.getBioObj()
            if (r6 == 0) goto L_0x0128
            java.lang.String r6 = r6.getBioPermAdd2()
            goto L_0x0129
        L_0x0128:
            r6 = r2
        L_0x0129:
            r3.append(r6)
            java.lang.String r3 = r3.toString()
        L_0x0130:
            r0.setText(r3)
            goto L_0x036e
        L_0x0135:
            if (r4 == 0) goto L_0x0142
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x0142
            java.lang.String r3 = r3.getBioPermAdd1()
            goto L_0x0143
        L_0x0142:
            r3 = r2
        L_0x0143:
            boolean r3 = r0.m(r3)
            if (r3 == 0) goto L_0x0172
            if (r4 == 0) goto L_0x0156
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x0156
            java.lang.String r3 = r3.getBioPermAdd2()
            goto L_0x0157
        L_0x0156:
            r3 = r2
        L_0x0157:
            boolean r3 = r0.m(r3)
            if (r3 != 0) goto L_0x0172
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f25994o
            if (r4 == 0) goto L_0x0170
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x0170
            java.lang.String r3 = r3.getBioPermAdd2()
            goto L_0x0130
        L_0x0170:
            r3 = r2
            goto L_0x0130
        L_0x0172:
            if (r4 == 0) goto L_0x017f
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x017f
            java.lang.String r3 = r3.getBioPermAdd1()
            goto L_0x0180
        L_0x017f:
            r3 = r2
        L_0x0180:
            boolean r3 = r0.m(r3)
            if (r3 != 0) goto L_0x01ad
            if (r4 == 0) goto L_0x0193
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x0193
            java.lang.String r3 = r3.getBioPermAdd2()
            goto L_0x0194
        L_0x0193:
            r3 = r2
        L_0x0194:
            boolean r3 = r0.m(r3)
            if (r3 == 0) goto L_0x01ad
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f25994o
            if (r4 == 0) goto L_0x0170
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x0170
            java.lang.String r3 = r3.getBioPermAdd1()
            goto L_0x0130
        L_0x01ad:
            if (r4 == 0) goto L_0x01ba
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x01ba
            java.lang.String r3 = r3.getBioPermAdd1()
            goto L_0x01bb
        L_0x01ba:
            r3 = r2
        L_0x01bb:
            boolean r3 = r0.m(r3)
            if (r3 == 0) goto L_0x036e
            if (r4 == 0) goto L_0x01ce
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x01ce
            java.lang.String r3 = r3.getBioPermAdd2()
            goto L_0x01cf
        L_0x01ce:
            r3 = r2
        L_0x01cf:
            boolean r3 = r0.m(r3)
            if (r3 == 0) goto L_0x036e
            if (r4 == 0) goto L_0x01e2
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x01e2
            java.lang.String r3 = r3.getBioPermAdd3()
            goto L_0x01e3
        L_0x01e2:
            r3 = r2
        L_0x01e3:
            boolean r0 = r0.m(r3)
            if (r0 != 0) goto L_0x036e
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f25994o
            if (r4 == 0) goto L_0x0170
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x0170
            java.lang.String r3 = r3.getBioPermAdd3()
            goto L_0x0130
        L_0x01fd:
            java.lang.String r3 = "Test"
            java.lang.String r6 = "2"
            android.util.Log.e(r3, r6)
            if (r4 == 0) goto L_0x0211
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x0211
            java.lang.String r3 = r3.getBioTempAdd1()
            goto L_0x0212
        L_0x0211:
            r3 = r2
        L_0x0212:
            boolean r3 = r0.m(r3)
            if (r3 != 0) goto L_0x027e
            if (r4 == 0) goto L_0x0225
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x0225
            java.lang.String r3 = r3.getBioTempAdd2()
            goto L_0x0226
        L_0x0225:
            r3 = r2
        L_0x0226:
            boolean r3 = r0.m(r3)
            if (r3 != 0) goto L_0x027e
            if (r4 == 0) goto L_0x0239
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x0239
            java.lang.String r3 = r3.getBioTempAdd3()
            goto L_0x023a
        L_0x0239:
            r3 = r2
        L_0x023a:
            boolean r3 = r0.m(r3)
            if (r3 != 0) goto L_0x027e
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f25994o
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            if (r4 == 0) goto L_0x0258
            com.nic.mparivahan.Dl.Model.BioObjX r6 = r4.getBioObj()
            if (r6 == 0) goto L_0x0258
            java.lang.String r6 = r6.getBioTempAdd1()
            goto L_0x0259
        L_0x0258:
            r6 = r2
        L_0x0259:
            r3.append(r6)
            r3.append(r5)
            if (r4 == 0) goto L_0x026c
            com.nic.mparivahan.Dl.Model.BioObjX r6 = r4.getBioObj()
            if (r6 == 0) goto L_0x026c
            java.lang.String r6 = r6.getBioTempAdd2()
            goto L_0x026d
        L_0x026c:
            r6 = r2
        L_0x026d:
            r3.append(r6)
            if (r4 == 0) goto L_0x0128
            com.nic.mparivahan.Dl.Model.BioObjX r6 = r4.getBioObj()
            if (r6 == 0) goto L_0x0128
        L_0x0278:
            java.lang.String r6 = r6.getBioTempAdd3()
            goto L_0x0129
        L_0x027e:
            if (r4 == 0) goto L_0x028b
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x028b
            java.lang.String r3 = r3.getBioTempAdd1()
            goto L_0x028c
        L_0x028b:
            r3 = r2
        L_0x028c:
            boolean r3 = r0.m(r3)
            if (r3 == 0) goto L_0x02e2
            if (r4 == 0) goto L_0x029f
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x029f
            java.lang.String r3 = r3.getBioTempAdd2()
            goto L_0x02a0
        L_0x029f:
            r3 = r2
        L_0x02a0:
            boolean r3 = r0.m(r3)
            if (r3 != 0) goto L_0x02e2
            if (r4 == 0) goto L_0x02b3
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x02b3
            java.lang.String r3 = r3.getBioTempAdd3()
            goto L_0x02b4
        L_0x02b3:
            r3 = r2
        L_0x02b4:
            boolean r3 = r0.m(r3)
            if (r3 != 0) goto L_0x02e2
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f25994o
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            if (r4 == 0) goto L_0x02d2
            com.nic.mparivahan.Dl.Model.BioObjX r6 = r4.getBioObj()
            if (r6 == 0) goto L_0x02d2
            java.lang.String r6 = r6.getBioTempAdd2()
            goto L_0x02d3
        L_0x02d2:
            r6 = r2
        L_0x02d3:
            r3.append(r6)
            r3.append(r5)
            if (r4 == 0) goto L_0x0128
            com.nic.mparivahan.Dl.Model.BioObjX r6 = r4.getBioObj()
            if (r6 == 0) goto L_0x0128
            goto L_0x0278
        L_0x02e2:
            if (r4 == 0) goto L_0x02ef
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x02ef
            java.lang.String r3 = r3.getBioTempAdd1()
            goto L_0x02f0
        L_0x02ef:
            r3 = r2
        L_0x02f0:
            boolean r3 = r0.m(r3)
            if (r3 != 0) goto L_0x031e
            if (r4 == 0) goto L_0x0303
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x0303
            java.lang.String r3 = r3.getBioTempAdd2()
            goto L_0x0304
        L_0x0303:
            r3 = r2
        L_0x0304:
            boolean r3 = r0.m(r3)
            if (r3 == 0) goto L_0x031e
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f25994o
            if (r4 == 0) goto L_0x0170
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x0170
            java.lang.String r3 = r3.getBioTempAdd1()
            goto L_0x0130
        L_0x031e:
            if (r4 == 0) goto L_0x032b
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x032b
            java.lang.String r3 = r3.getBioTempAdd1()
            goto L_0x032c
        L_0x032b:
            r3 = r2
        L_0x032c:
            boolean r3 = r0.m(r3)
            if (r3 == 0) goto L_0x036e
            if (r4 == 0) goto L_0x033f
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x033f
            java.lang.String r3 = r3.getBioTempAdd2()
            goto L_0x0340
        L_0x033f:
            r3 = r2
        L_0x0340:
            boolean r3 = r0.m(r3)
            if (r3 == 0) goto L_0x036e
            if (r4 == 0) goto L_0x0353
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x0353
            java.lang.String r3 = r3.getBioTempAdd3()
            goto L_0x0354
        L_0x0353:
            r3 = r2
        L_0x0354:
            boolean r0 = r0.m(r3)
            if (r0 != 0) goto L_0x036e
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f25994o
            if (r4 == 0) goto L_0x0170
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r4.getBioObj()
            if (r3 == 0) goto L_0x0170
            java.lang.String r3 = r3.getBioTempAdd3()
            goto L_0x0130
        L_0x036e:
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f25996p
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            ld.c r6 = r9.I1()
            java.lang.String r7 = "issue_date"
            java.lang.String r8 = "Issue Date"
            java.lang.String r6 = r6.b(r7, r8)
            r3.append(r6)
            java.lang.String r6 = " : "
            r3.append(r6)
            z9.a$a r7 = z9.a.f18947a
            if (r4 == 0) goto L_0x039c
            com.nic.mparivahan.Dl.Model.DlobjX r8 = r4.getDlobj()
            if (r8 == 0) goto L_0x039c
            java.lang.String r8 = r8.getDlIssuedt()
            goto L_0x039d
        L_0x039c:
            r8 = r2
        L_0x039d:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r7.f(r8)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r0.setText(r3)
            if (r4 == 0) goto L_0x03bc
            com.nic.mparivahan.Dl.Model.DlobjX r0 = r4.getDlobj()
            if (r0 == 0) goto L_0x03bc
            java.lang.String r0 = r0.getDlNtValdtoDt()
            goto L_0x03bd
        L_0x03bc:
            r0 = r2
        L_0x03bd:
            java.lang.String r3 = "Valid Upto"
            java.lang.String r8 = "label_dl_serv_valid_upto"
            if (r0 == 0) goto L_0x0408
            int r0 = r0.length()
            if (r0 != 0) goto L_0x03ca
            goto L_0x0408
        L_0x03ca:
            java.lang.String r0 = "call2"
            android.util.Log.e(r1, r0)
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f26002s
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            ld.c r6 = r9.I1()
            java.lang.String r3 = r6.b(r8, r3)
            r1.append(r3)
            r1.append(r5)
            if (r4 == 0) goto L_0x03f4
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r4.getDlobj()
            if (r3 == 0) goto L_0x03f4
            java.lang.String r2 = r3.getDlNtValdtoDt()
        L_0x03f4:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r7.f(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x0403:
            r0.setText(r1)
            goto L_0x0515
        L_0x0408:
            java.lang.String r0 = "call1"
            android.util.Log.e(r1, r0)
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f26002s
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            ld.c r5 = r9.I1()
            java.lang.String r3 = r5.b(r8, r3)
            r1.append(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            if (r4 == 0) goto L_0x0439
            com.nic.mparivahan.Dl.Model.DlobjX r0 = r4.getDlobj()
            if (r0 == 0) goto L_0x0439
            java.lang.String r2 = r0.getDlTrValdtoDt()
        L_0x0439:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r7.f(r0)
            goto L_0x0515
        L_0x0442:
            ka.c$a r1 = ka.c.f13158a
            java.lang.Object r4 = r0.get(r3)
            com.nic.mparivahan.Dl.Model.DLDocument r4 = (com.nic.mparivahan.Dl.Model.DLDocument) r4
            java.lang.String r4 = r4.getDob()
            boolean r1 = r1.m(r4)
            if (r1 == 0) goto L_0x0479
            ni.de r1 = r9.v1()
            android.widget.ImageView r1 = r1.f26011z
            r1.setVisibility(r3)
            ni.de r1 = r9.v1()
            android.widget.LinearLayout r1 = r1.V
            r1.setVisibility(r2)
            java.lang.Object r0 = r0.get(r3)
            com.nic.mparivahan.Dl.Model.DLDocument r0 = (com.nic.mparivahan.Dl.Model.DLDocument) r0
            java.lang.String r0 = r0.getDocnumber()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.U1(r9, r0)
            goto L_0x0515
        L_0x0479:
            ni.de r1 = r9.v1()
            android.widget.ProgressBar r1 = r1.W
            r1.setVisibility(r3)
            ni.de r1 = r9.v1()
            android.widget.ImageView r1 = r1.f26011z
            r1.setVisibility(r2)
            z9.a$a r1 = z9.a.f18947a
            java.lang.Object r2 = r0.get(r3)
            com.nic.mparivahan.Dl.Model.DLDocument r2 = (com.nic.mparivahan.Dl.Model.DLDocument) r2
            java.lang.String r2 = r2.getDob()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = r1.b(r2)
            za.a r2 = r9.z1()
            java.lang.Object r0 = r0.get(r3)
            com.nic.mparivahan.Dl.Model.DLDocument r0 = (com.nic.mparivahan.Dl.Model.DLDocument) r0
            java.lang.String r0 = r0.getDocnumber()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.CharSequence r1 = km.q.B0(r1)
            java.lang.String r1 = r1.toString()
            r2.i(r0, r1, r9)
            goto L_0x0515
        L_0x04bd:
            java.lang.String r0 = "Null"
            android.util.Log.e(r1, r0)
            ni.de r0 = r9.v1()
            android.widget.LinearLayout r0 = r0.f25990m
            r0.setVisibility(r2)
            ni.de r0 = r9.v1()
            android.widget.LinearLayout r0 = r0.f26006u
            r0.setVisibility(r2)
            ni.de r0 = r9.v1()
            android.widget.LinearLayout r0 = r0.f25987k0
            r0.setVisibility(r3)
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f25989l0
            r0.setVisibility(r3)
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f25989l0
            ld.c r1 = r9.I1()
            v9.f$a r2 = v9.f.f17510a
            java.lang.String r3 = r2.X()
            java.lang.String r4 = "No Virtual DL Found"
            java.lang.String r1 = r1.b(r3, r4)
            r0.setText(r1)
            ni.de r0 = r9.v1()
            android.widget.TextView r0 = r0.f25991m0
            ld.c r1 = r9.I1()
            java.lang.String r2 = r2.Y()
            java.lang.String r3 = "There is no Virtual DL \nfound for your account"
            java.lang.String r1 = r1.b(r2, r3)
            goto L_0x0403
        L_0x0515:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dashboard.ui.VirtualDocScreen.c2():void");
    }

    public final void d2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.V = dldetobjX;
    }

    public final void e2(DlService dlService) {
        cm.l.f(dlService, "<set-?>");
        this.J = dlService;
    }

    public final void f2(za.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.I = aVar;
    }

    public final void g2(RcService rcService) {
        cm.l.f(rcService, "<set-?>");
        this.H = rcService;
    }

    public final void h2(cd.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.G = cVar;
    }

    public final void i2(l0 l0Var) {
        cm.l.f(l0Var, "<set-?>");
        this.S = l0Var;
    }

    public final void j2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.N = progressDialog;
    }

    public final void k2(wc.u uVar) {
        cm.l.f(uVar, "<set-?>");
        this.P = uVar;
    }

    public final void l2(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void m2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.X = cVar;
    }

    public void n(String str, int i10) {
        Log.e("MyRc", String.valueOf(str));
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            this.R = i10;
            l2(String.valueOf(str));
            if (w1().s0(str) != null) {
                String s02 = w1().s0(str);
                if (!ka.c.f13158a.m(s02)) {
                    E1().show();
                    cd.c B1 = B1();
                    cm.l.c(s02);
                    B1.i(s02, this);
                    return;
                }
                return;
            }
            return;
        }
        Toast.makeText(this, I1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    public final void n2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.M = gVar;
    }

    public final void o2(b0 b0Var) {
        cm.l.f(b0Var, "<set-?>");
        this.O = b0Var;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.virtual_document_layout);
        getWindow().addFlags(128);
        e2(DlService.f8615a.c(this));
        g2(RcService.f9484a.c(this));
        n2(new ld.g(this));
        m2(new ld.c(this));
        de c10 = de.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        a2(c10);
        setContentView((View) v1().b());
        v9.e.f17509a.W2(this, v1());
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        cm.l.e(A0, "getInstance(...)");
        b2(A0);
        j2(new ProgressDialog(this));
        E1().setMessage(I1().b("label_challan_please_wait", "Please wait..."));
        E1().setCancelable(false);
        E1().setCanceledOnTouchOutside(false);
        f2((za.a) new u0((x0) this, (u0.b) new za.b(new ya.a(y1()))).a(za.a.class));
        v1().P.setOnClickListener(new e0(this));
        v1().V.setOnClickListener(new j0(this));
        v1().f25982i.setOnClickListener(new k0(this));
        v1().f25980h.setOnClickListener(new sa.l0(this));
        v1().f25971c0.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        h2((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(A1()))).a(cd.c.class));
        try {
            ArrayList E0 = w1().E0();
            cm.l.d(E0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.Document> }");
            Z1(E0);
            if (u1().size() > 0) {
                v1().L.setBackgroundResource(R.drawable.shared_received_rc_background_ontap);
                v1().N.setTextColor(androidx.core.content.a.c(this, R.color.white));
                v1().f25981h0.setTextColor(androidx.core.content.a.c(this, R.color.black));
                v1().f25969b0.setTextColor(androidx.core.content.a.c(this, R.color.black));
                v1().f25967a0.setImageResource(R.drawable.received_rc_ontap);
                v1().f25979g0.setImageResource(R.drawable.shared_rc_ontap);
                v1().M.setImageResource(R.drawable.my_rc_ontap);
                v1().f25987k0.setVisibility(8);
                v1().f25989l0.setVisibility(8);
                i2(new l0(u1(), this, this));
                v1().f25971c0.setAdapter(C1());
            } else {
                v1().f25989l0.setVisibility(0);
                TextView textView = v1().f25989l0;
                ld.c I1 = I1();
                f.a aVar = v9.f.f17510a;
                textView.setText(I1.b(aVar.Q(), "No Virtual RC Found"));
                v1().f25987k0.setVisibility(0);
                v1().f25991m0.setText(I1().b(aVar.Z(), "There is no Virtual RC \nfound for your account"));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        v1().L.setOnClickListener(new m0(this));
        v1().f25975e0.setOnClickListener(new n0(this));
        v1().Z.setOnClickListener(new o0(this));
        B1().F().g(this, new a0(new s(this)));
        B1().D().g(this, new a0(new t(this)));
        B1().E().g(this, new a0(new a(this)));
        B1().J().g(this, new a0(new b(this)));
        B1().K().g(this, new a0(new c(this)));
        B1().B().g(this, new a0(new d(this)));
        B1().z().g(this, new a0(new e(this)));
        B1().A().g(this, new a0(new f(this)));
        B1().x().g(this, new a0(new g(this)));
        B1().y().g(this, new a0(new h(this)));
        B1().R().g(this, new a0(new i(this)));
        B1().S().g(this, new a0(new j(this)));
        z1().r().g(this, new a0(new k(this)));
        z1().s().g(this, new a0(new l(this)));
        z1().n().g(this, new a0(new m(this)));
        z1().o().g(this, new a0(new n(this)));
        z1().y().g(this, new a0(new o(this)));
        z1().x().g(this, new a0(new p(this)));
        B1().U().g(this, new a0(new q(this)));
        B1().T().g(this, new a0(new r(this)));
        v1().f26011z.setOnClickListener(new p0(this));
    }

    public final void p2(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(I1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(I1().b("btn_ok", "OK"));
        textView.setOnClickListener(new h0(dialog));
        dialog.show();
    }

    public final ArrayList u1() {
        ArrayList arrayList = this.L;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("arrayList");
        return null;
    }

    public final de v1() {
        de deVar = this.U;
        if (deVar != null) {
            return deVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final DatabaseHelper w1() {
        DatabaseHelper databaseHelper = this.K;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    public final DldetobjX x1() {
        DldetobjX dldetobjX = this.V;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dl_data");
        return null;
    }

    public final DlService y1() {
        DlService dlService = this.J;
        if (dlService != null) {
            return dlService;
        }
        cm.l.v("mDlService");
        return null;
    }

    public final za.a z1() {
        za.a aVar = this.I;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mDlViewModel");
        return null;
    }
}
